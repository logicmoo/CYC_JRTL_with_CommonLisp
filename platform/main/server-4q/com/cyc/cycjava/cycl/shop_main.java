/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class shop_main extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new shop_main();

 public static final String myName = "com.cyc.cycjava.cycl.shop_main";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $new_method_pred$ = makeSymbol("*NEW-METHOD-PRED*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $shop_simple_action_definition_predicates$ = makeSymbol("*SHOP-SIMPLE-ACTION-DEFINITION-PREDICATES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $shop_complex_action_definition_predicates$ = makeSymbol("*SHOP-COMPLEX-ACTION-DEFINITION-PREDICATES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $shop_domain_definition_predicates$ = makeSymbol("*SHOP-DOMAIN-DEFINITION-PREDICATES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $shop_domain_definition_collections$ = makeSymbol("*SHOP-DOMAIN-DEFINITION-COLLECTIONS*");

    // deflexical
    // representative sample of the KB constants that the planner depends on.
    /**
     * representative sample of the KB constants that the planner depends on.
     */
    @LispMethod(comment = "representative sample of the KB constants that the planner depends on.\ndeflexical")
    private static final SubLSymbol $planner_core_constants$ = makeSymbol("*PLANNER-CORE-CONSTANTS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(reader_make_constant_shell("preconditionFor-Props"), reader_make_constant_shell("effectOfAction-Props"), reader_make_constant_shell("effectOfActionIf-Props"));

    static private final SubLList $list1 = list(reader_make_constant_shell("methodForAction"), reader_make_constant_shell("sufficientFor-Props"), reader_make_constant_shell("preconditionForMethod"));

    static private final SubLList $list2 = list(reader_make_constant_shell("SimpleSituationPredicate"));

    static private final SubLSymbol $sym3$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    public static final SubLSymbol $shop$ = makeSymbol("*SHOP*");

    private static final SubLSymbol SHOP_PLANNER = makeSymbol("SHOP-PLANNER");

    static private final SubLList $list6 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MAKE-NEW-THREAD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MAKE-PROBLEM-FROM-MT"), list(makeSymbol("DOMAIN"), makeSymbol("MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MAKE-DOMAIN-FROM-MT"), list(makeSymbol("MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PROBLEM"), list(makeSymbol("NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DOMAIN"), list(makeSymbol("NAME")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SHOP_PLAN_DISPLAYER_FACTORY = makeSymbol("SHOP-PLAN-DISPLAYER-FACTORY");

    static private final SubLList $list9 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("CREATE-PLAN-DISPLAYER"), list(makeSymbol("PLAN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("CREATE-TASK-DISPLAYER"), list(makeSymbol("TASK")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_PLAN_DISPLAYER_FACTORY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-PLAN-DISPLAYER-FACTORY-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_PLAN_DISPLAYER_FACTORY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-PLAN-DISPLAYER-FACTORY-INSTANCE");

    private static final SubLSymbol SHOP = makeSymbol("SHOP");

    static private final SubLList $list16 = list(makeSymbol("SHOP-PLANNER"));

    static private final SubLList $list17 = list(list(makeSymbol("DISPLAYER-FACTORY"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DOMAIN-TABLE"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("PROBLEM-TABLE"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("THREADS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP-THREADS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GATHER-INITIAL-STATE"), list(makeSymbol("MT")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-CLASS");

    private static final SubLSymbol DISPLAYER_FACTORY = makeSymbol("DISPLAYER-FACTORY");

    private static final SubLSymbol DOMAIN_TABLE = makeSymbol("DOMAIN-TABLE");

    private static final SubLSymbol PROBLEM_TABLE = makeSymbol("PROBLEM-TABLE");

    private static final SubLSymbol THREADS = makeSymbol("THREADS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-INSTANCE");

    static private final SubLList $list25 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list26 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("DOMAIN-TABLE"), list(makeSymbol("MAKE-HASH-TABLE"), TEN_INTEGER)), list(makeSymbol("CSETQ"), makeSymbol("PROBLEM-TABLE"), list(makeSymbol("MAKE-HASH-TABLE"), TEN_INTEGER)), list(makeSymbol("CSETQ"), makeSymbol("DISPLAYER-FACTORY"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym27$OUTER_CATCH_FOR_SHOP_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-METHOD");

    private static final SubLSymbol SHOP_INITIALIZE_METHOD = makeSymbol("SHOP-INITIALIZE-METHOD");

    static private final SubLList $list30 = list(makeSymbol("DOMAIN-NAME"));

    static private final SubLList $list31 = list(list(RET, list(makeSymbol("GETHASH"), makeSymbol("DOMAIN-NAME"), makeSymbol("DOMAIN-TABLE"))));

    static private final SubLSymbol $sym32$OUTER_CATCH_FOR_SHOP_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-METHOD");

    private static final SubLSymbol SHOP_GET_DOMAIN_METHOD = makeSymbol("SHOP-GET-DOMAIN-METHOD");

    private static final SubLSymbol GET_PROBLEM = makeSymbol("GET-PROBLEM");

    static private final SubLList $list35 = list(makeSymbol("PROBLEM-NAME"));

    static private final SubLList $list36 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PROB"), list(makeSymbol("GETHASH"), makeSymbol("PROBLEM-NAME"), makeSymbol("PROBLEM-TABLE")))), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("PROB")), list(makeSymbol("CERROR"), makeString("No planning problem of the name ~s"), makeSymbol("PROBLEM-NAME"))), list(RET, makeSymbol("PROB"))));

    static private final SubLSymbol $sym37$OUTER_CATCH_FOR_SHOP_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-METHOD");

    static private final SubLString $str38$No_planning_problem_of_the_name__ = makeString("No planning problem of the name ~s");

    private static final SubLSymbol SHOP_GET_PROBLEM_METHOD = makeSymbol("SHOP-GET-PROBLEM-METHOD");

    private static final SubLSymbol MAKE_NEW_THREAD = makeSymbol("MAKE-NEW-THREAD");

    static private final SubLList $list41 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-THREAD"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-BASIC-PLANNER-THREAD")), list(QUOTE, makeSymbol("SHOP-BASIC-PLANNER-THREAD"))))), list(makeSymbol("PWHEN"), list(makeSymbol(">="), list(makeSymbol("LIST-LENGTH"), makeSymbol("THREADS")), TWENTY_INTEGER), list(makeSymbol("CLEANUP-THREADS"), makeSymbol("SELF"))), list(makeSymbol("CPUSH"), makeSymbol("NEW-THREAD"), makeSymbol("THREADS")), list(makeSymbol("SET-SLOT"), makeSymbol("NEW-THREAD"), list(QUOTE, makeSymbol("PLANNER")), makeSymbol("SELF")), list(RET, makeSymbol("NEW-THREAD"))));

    static private final SubLSymbol $sym42$OUTER_CATCH_FOR_SHOP_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-METHOD");

    private static final SubLSymbol SHOP_MAKE_NEW_THREAD_METHOD = makeSymbol("SHOP-MAKE-NEW-THREAD-METHOD");

    private static final SubLSymbol MAKE_PROBLEM = makeSymbol("MAKE-PROBLEM");

    static private final SubLList $list47 = list(makeSymbol("PROBLEM-NAME"), makeSymbol("DOMAIN-NAME"), makeSymbol("STATE"), makeSymbol("TASKS"), makeSymbol("MT"));

    static private final SubLList $list48 = list(list(new SubLObject[]{ makeSymbol("CLET"), list(makeSymbol("DOMAIN"), makeSymbol("NEW-PROBLEM"), makeSymbol("NEW-STATEBODY")), list(makeSymbol("CSETQ"), makeSymbol("NEW-PROBLEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-BASIC-PROBLEM")), list(QUOTE, makeSymbol("SHOP-BASIC-PROBLEM")))), list(makeSymbol("CSETQ"), makeSymbol("NEW-STATEBODY"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-BASIC-WORLD-STATE")), list(QUOTE, makeSymbol("SHOP-BASIC-WORLD-STATE")))), list(makeSymbol("CSETQ"), makeSymbol("DOMAIN"), list(makeSymbol("GET-DOMAIN"), makeSymbol("SELF"), makeSymbol("DOMAIN-NAME"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("MAKE-STATEBODY"), makeSymbol("SHOP-BASIC-WORLD-STATE")), makeSymbol("NEW-STATEBODY"), makeSymbol("STATE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("INITIALIZE-PROBLEM"), makeSymbol("SHOP-BASIC-PROBLEM")), makeSymbol("NEW-PROBLEM"), makeSymbol("PROBLEM-NAME"), makeSymbol("DOMAIN"), makeSymbol("NEW-STATEBODY"), makeSymbol("TASKS"), makeSymbol("MT")), list(makeSymbol("CSETF"), list(makeSymbol("GETHASH"), makeSymbol("PROBLEM-NAME"), makeSymbol("PROBLEM-TABLE")), makeSymbol("NEW-PROBLEM")), list(RET, makeSymbol("NEW-PROBLEM")) }));

    static private final SubLSymbol $sym49$OUTER_CATCH_FOR_SHOP_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-METHOD");

    private static final SubLSymbol MAKE_STATEBODY = makeSymbol("MAKE-STATEBODY");

    private static final SubLSymbol SHOP_MAKE_PROBLEM_METHOD = makeSymbol("SHOP-MAKE-PROBLEM-METHOD");

    private static final SubLSymbol CLEANUP_THREADS = makeSymbol("CLEANUP-THREADS");

    static private final SubLList $list55 = list(list(makeSymbol("CSETQ"), makeSymbol("THREADS"), NIL), list(RET, NIL));

    static private final SubLSymbol $sym56$OUTER_CATCH_FOR_SHOP_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-METHOD");

    private static final SubLSymbol SHOP_CLEANUP_THREADS_METHOD = makeSymbol("SHOP-CLEANUP-THREADS-METHOD");

    private static final SubLSymbol GATHER_INITIAL_STATE = makeSymbol("GATHER-INITIAL-STATE");

    static private final SubLList $list59 = list(makeKeyword("PRIVATE"));

    static private final SubLList $list60 = list(makeSymbol("MT"));

    static private final SubLList $list61 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INIT-MTS"), NIL)), list(makeSymbol("DO-ALL-GENL-MTS"), list(makeSymbol("GENL-MT"), makeSymbol("MT")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("MEMBER?"), makeSymbol("GENL-MT"), makeSymbol("INIT-MTS"))), list(makeSymbol("ISA?"), makeSymbol("GENL-MT"), reader_make_constant_shell("PlanDynamicSituationMicrotheory"))), list(makeSymbol("CPUSH"), makeSymbol("GENL-MT"), makeSymbol("INIT-MTS")))), list(RET, list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("ASSERTION-HL-FORMULA")), list(makeSymbol("APPLY"), list(QUOTE, makeSymbol("APPEND")), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("GATHER-MT-INDEX")), makeSymbol("INIT-MTS")))))));

    static private final SubLString $str67$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $$$continue_anyway = makeString("continue anyway");

    static private final SubLString $str72$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");





    private static final SubLString $str75$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str76$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str77$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol ASSERTION_HL_FORMULA = makeSymbol("ASSERTION-HL-FORMULA");

    private static final SubLSymbol GATHER_MT_INDEX = makeSymbol("GATHER-MT-INDEX");

    private static final SubLSymbol SHOP_GATHER_INITIAL_STATE_METHOD = makeSymbol("SHOP-GATHER-INITIAL-STATE-METHOD");

    private static final SubLSymbol MAKE_PROBLEM_FROM_MT = makeSymbol("MAKE-PROBLEM-FROM-MT");

    static private final SubLList $list83 = list(makeSymbol("DOMAIN-SYMBOL"), makeSymbol("MT"));

    private static final SubLList $list84 = list(makeString("Creates a planning problem object for the planner from \n   the information in PROBLEM-MT, that has planning domain \n   DOMAIN-NAME."), list(makeSymbol("CLET"), list(makeSymbol("CYC-TASKS"), list(makeSymbol("PROBLEM-NAME"), makeSymbol("MT")), list(makeSymbol("INITIAL-STATE"), list(makeSymbol("GATHER-INITIAL-STATE"), makeSymbol("SELF"), makeSymbol("MT"))), makeSymbol("NEW-PROBLEM")), list(makeSymbol("CSETQ"), makeSymbol("CYC-TASKS"), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("ASSERTION-HL-FORMULA")), list(makeSymbol("GATHER-MT-INDEX"), makeSymbol("MT")))), list(makeSymbol("PUNLESS"), makeSymbol("CYC-TASKS"), list(makeSymbol("CERROR"), makeString("STOP"), makeString("Microtheory ~s is empty"), makeSymbol("MT")), list(RET, NIL)), list(makeSymbol("CSETQ"), makeSymbol("NEW-PROBLEM"), list(makeSymbol("MAKE-PROBLEM"), makeSymbol("SELF"), makeSymbol("PROBLEM-NAME"), makeSymbol("DOMAIN-SYMBOL"), makeSymbol("INITIAL-STATE"), makeSymbol("CYC-TASKS"), makeSymbol("MT"))), list(RET, makeSymbol("NEW-PROBLEM"))));

    private static final SubLString $$$STOP = makeString("STOP");

    private static final SubLString $str86$Microtheory__s_is_empty = makeString("Microtheory ~s is empty");

    private static final SubLSymbol SHOP_MAKE_PROBLEM_FROM_MT_METHOD = makeSymbol("SHOP-MAKE-PROBLEM-FROM-MT-METHOD");

    private static final SubLSymbol MAKE_DOMAIN_FROM_MT = makeSymbol("MAKE-DOMAIN-FROM-MT");

    static private final SubLList $list89 = list(makeSymbol("DOMAIN-MT"));

    private static final SubLList $list90 = list(makeString("Creates a planning domain structure for the planner from \n   the information in DOMAIN-MT.\n   @param DOMAIN-MT hlmt-p\n   @return shop-domain-p"), list(makeSymbol("CLET"), list(list(makeSymbol("DOMAIN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-CYC-DOMAIN")), list(QUOTE, makeSymbol("SHOP-CYC-DOMAIN"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("PROCESS-PLAN-ASSERTIONS"), makeSymbol("SHOP-CYC-DOMAIN")), makeSymbol("DOMAIN"), makeSymbol("DOMAIN-MT")), list(makeSymbol("CSETF"), list(makeSymbol("GETHASH"), makeSymbol("DOMAIN-MT"), makeSymbol("DOMAIN-TABLE")), makeSymbol("DOMAIN")), list(RET, makeSymbol("DOMAIN"))));

    private static final SubLSymbol $sym91$OUTER_CATCH_FOR_SHOP_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-METHOD");

    private static final SubLSymbol SHOP_MAKE_DOMAIN_FROM_MT_METHOD = makeSymbol("SHOP-MAKE-DOMAIN-FROM-MT-METHOD");

    private static final SubLSymbol $sym95$DO_FI_ASKS_ = makeSymbol("DO-FI-ASKS?");





    private static final SubLObject $$preconditionFor_Props = reader_make_constant_shell("preconditionFor-Props");

    private static final SubLObject $$effectOfAction_Props = reader_make_constant_shell("effectOfAction-Props");

    private static final SubLObject $$sufficientFor_Props = reader_make_constant_shell("sufficientFor-Props");

    private static final SubLObject $$effectOfActionIf_Props = reader_make_constant_shell("effectOfActionIf-Props");

    private static final SubLSymbol SHOP_FIND_PLANS = makeSymbol("SHOP-FIND-PLANS");

    private static final SubLList $list105 = list(makeSymbol("TASK"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("VERBOSE"), ZERO_INTEGER), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"), makeSymbol("BACKCHAIN"));

    private static final SubLString $str106$Returns_a_list_of_plan_datastruct = makeString("Returns a list of plan datastructures for TASK in the context of MT.\n   TASK is a formula with an instance of #$ActionPredicate as its first argument. \n   MT is a microtheory.\n   VERBOSE is an integer between 0 and 9, that controls how much logging information\n   shop should send to standard output.\n   NUMBER is the maximum number of plans to return.\n   TIME is the maximum amount of time allocated to the planner.\n   DEPTH is the maximum depth the planner can reach searching for plans.\n   BACKCHAIN is the maximum number of backchains allowed when querying the KB when matching\n   rule conditions.");

    private static final SubLList $list107 = list(makeSymbol("LISTP"));

    private static final SubLSymbol SHOP_PLAN_P = makeSymbol("SHOP-PLAN-P");

    private static final SubLList $list109 = list(makeSymbol("OBJECT"));

    private static final SubLString $str110$Returns_T_iff_OBJECT_is_a_SHOP_pl = makeString("Returns T iff OBJECT is a SHOP plan datastructure.");

    private static final SubLList $list111 = list(makeSymbol("BOOLEANP"));

    private static final SubLSymbol SHOP_PLAN_SIMPLE_ACTIONS = makeSymbol("SHOP-PLAN-SIMPLE-ACTIONS");

    private static final SubLList $list114 = list(makeSymbol("PLAN"));

    private static final SubLString $str115$Returns_list_of_simple_action_sen = makeString("Returns list of simple action sentences for PLAN.\n   A return value of NIL means that PLAN is trivial\n   (i.e. the original task for the plan is already achieved.");

    private static final SubLList $list116 = list(list(makeSymbol("PLAN"), makeSymbol("SHOP-PLAN-P")));

    private static final SubLSymbol GOAL_TASK = makeSymbol("GOAL-TASK");

    private static final SubLSymbol RECOVER_EL = makeSymbol("RECOVER-EL");

    private static final SubLSymbol SHOP_PLAN_GOAL = makeSymbol("SHOP-PLAN-GOAL");

    private static final SubLString $str122$Returns_the_task_that_has_PLAN_as = makeString("Returns the task that has PLAN as a solution.");

    /**
     * Determines whether the portion of the KB necessary for the planner is loaded.
     * This is the KB analogue of the #+Cyc-Planner feature.
     */
    @LispMethod(comment = "Determines whether the portion of the KB necessary for the planner is loaded.\r\nThis is the KB analogue of the #+Cyc-Planner feature.\nDetermines whether the portion of the KB necessary for the planner is loaded.\nThis is the KB analogue of the #+Cyc-Planner feature.")
    public static final SubLObject initialize_planner_kb_feature_alt() {
        if (NIL != list_utilities.every_in_list($sym3$VALID_CONSTANT_, $planner_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_planner_kb_loaded();
        } else {
            kb_control_vars.unset_planner_kb_loaded();
        }
        return kb_control_vars.planner_kb_loaded_p();
    }

    /**
     * Determines whether the portion of the KB necessary for the planner is loaded.
     * This is the KB analogue of the #+Cyc-Planner feature.
     */
    @LispMethod(comment = "Determines whether the portion of the KB necessary for the planner is loaded.\r\nThis is the KB analogue of the #+Cyc-Planner feature.\nDetermines whether the portion of the KB necessary for the planner is loaded.\nThis is the KB analogue of the #+Cyc-Planner feature.")
    public static SubLObject initialize_planner_kb_feature() {
        if (NIL != list_utilities.every_in_list($sym3$VALID_CONSTANT_, $planner_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_planner_kb_loaded();
        } else {
            kb_control_vars.unset_planner_kb_loaded();
        }
        return kb_control_vars.planner_kb_loaded_p();
    }

    public static final SubLObject shop_planner_p_alt(SubLObject shop_planner) {
        return interfaces.subloop_instanceof_interface(shop_planner, SHOP_PLANNER);
    }

    public static SubLObject shop_planner_p(final SubLObject shop_planner) {
        return interfaces.subloop_instanceof_interface(shop_planner, SHOP_PLANNER);
    }

    public static final SubLObject subloop_reserved_initialize_shop_plan_displayer_factory_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_plan_displayer_factory_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_shop_plan_displayer_factory_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_plan_displayer_factory_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        return NIL;
    }

    public static final SubLObject shop_plan_displayer_factory_p_alt(SubLObject shop_plan_displayer_factory) {
        return classes.subloop_instanceof_class(shop_plan_displayer_factory, SHOP_PLAN_DISPLAYER_FACTORY);
    }

    public static SubLObject shop_plan_displayer_factory_p(final SubLObject shop_plan_displayer_factory) {
        return classes.subloop_instanceof_class(shop_plan_displayer_factory, SHOP_PLAN_DISPLAYER_FACTORY);
    }

    public static final SubLObject get_shop_threads_alt(SubLObject shop) {
        return classes.subloop_get_instance_slot(shop, FOUR_INTEGER);
    }

    public static SubLObject get_shop_threads(final SubLObject shop) {
        return classes.subloop_get_instance_slot(shop, FOUR_INTEGER);
    }

    public static final SubLObject set_shop_threads_alt(SubLObject shop, SubLObject value) {
        return classes.subloop_set_instance_slot(shop, value, FOUR_INTEGER);
    }

    public static SubLObject set_shop_threads(final SubLObject shop, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop, value, FOUR_INTEGER);
    }

    public static final SubLObject get_shop_problem_table_alt(SubLObject shop) {
        return classes.subloop_get_instance_slot(shop, THREE_INTEGER);
    }

    public static SubLObject get_shop_problem_table(final SubLObject shop) {
        return classes.subloop_get_instance_slot(shop, THREE_INTEGER);
    }

    public static final SubLObject set_shop_problem_table_alt(SubLObject shop, SubLObject value) {
        return classes.subloop_set_instance_slot(shop, value, THREE_INTEGER);
    }

    public static SubLObject set_shop_problem_table(final SubLObject shop, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop, value, THREE_INTEGER);
    }

    public static final SubLObject get_shop_domain_table_alt(SubLObject shop) {
        return classes.subloop_get_instance_slot(shop, TWO_INTEGER);
    }

    public static SubLObject get_shop_domain_table(final SubLObject shop) {
        return classes.subloop_get_instance_slot(shop, TWO_INTEGER);
    }

    public static final SubLObject set_shop_domain_table_alt(SubLObject shop, SubLObject value) {
        return classes.subloop_set_instance_slot(shop, value, TWO_INTEGER);
    }

    public static SubLObject set_shop_domain_table(final SubLObject shop, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop, value, TWO_INTEGER);
    }

    public static final SubLObject get_shop_displayer_factory_alt(SubLObject shop) {
        return classes.subloop_get_instance_slot(shop, ONE_INTEGER);
    }

    public static SubLObject get_shop_displayer_factory(final SubLObject shop) {
        return classes.subloop_get_instance_slot(shop, ONE_INTEGER);
    }

    public static final SubLObject set_shop_displayer_factory_alt(SubLObject shop, SubLObject value) {
        return classes.subloop_set_instance_slot(shop, value, ONE_INTEGER);
    }

    public static SubLObject set_shop_displayer_factory(final SubLObject shop, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop, value, ONE_INTEGER);
    }

    public static final SubLObject subloop_reserved_initialize_shop_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_shop_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP, DISPLAYER_FACTORY, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP, DOMAIN_TABLE, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP, PROBLEM_TABLE, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP, THREADS, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP, DISPLAYER_FACTORY, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP, DOMAIN_TABLE, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP, PROBLEM_TABLE, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP, THREADS, NIL);
        return NIL;
    }

    public static final SubLObject shop_p_alt(SubLObject shop) {
        return classes.subloop_instanceof_class(shop, SHOP);
    }

    public static SubLObject shop_p(final SubLObject shop) {
        return classes.subloop_instanceof_class(shop, SHOP);
    }

    public static final SubLObject shop_initialize_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_shop_method = NIL;
            SubLObject problem_table = com.cyc.cycjava.cycl.shop_main.get_shop_problem_table(self);
            SubLObject domain_table = com.cyc.cycjava.cycl.shop_main.get_shop_domain_table(self);
            SubLObject displayer_factory = com.cyc.cycjava.cycl.shop_main.get_shop_displayer_factory(self);
            try {
                try {
                    object.object_initialize_method(self);
                    domain_table = make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED);
                    problem_table = make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED);
                    displayer_factory = NIL;
                    sublisp_throw($sym27$OUTER_CATCH_FOR_SHOP_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_main.set_shop_problem_table(self, problem_table);
                            com.cyc.cycjava.cycl.shop_main.set_shop_domain_table(self, domain_table);
                            com.cyc.cycjava.cycl.shop_main.set_shop_displayer_factory(self, displayer_factory);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_method = Errors.handleThrowable(ccatch_env_var, $sym27$OUTER_CATCH_FOR_SHOP_METHOD);
            }
            return catch_var_for_shop_method;
        }
    }

    public static SubLObject shop_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_method = NIL;
        SubLObject problem_table = get_shop_problem_table(self);
        SubLObject domain_table = get_shop_domain_table(self);
        SubLObject displayer_factory = get_shop_displayer_factory(self);
        try {
            thread.throwStack.push($sym27$OUTER_CATCH_FOR_SHOP_METHOD);
            try {
                object.object_initialize_method(self);
                domain_table = make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED);
                problem_table = make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED);
                displayer_factory = NIL;
                sublisp_throw($sym27$OUTER_CATCH_FOR_SHOP_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_problem_table(self, problem_table);
                    set_shop_domain_table(self, domain_table);
                    set_shop_displayer_factory(self, displayer_factory);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_method = Errors.handleThrowable(ccatch_env_var, $sym27$OUTER_CATCH_FOR_SHOP_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_method;
    }

    public static final SubLObject shop_get_domain_method_alt(SubLObject self, SubLObject domain_name) {
        {
            SubLObject catch_var_for_shop_method = NIL;
            SubLObject domain_table = com.cyc.cycjava.cycl.shop_main.get_shop_domain_table(self);
            try {
                try {
                    sublisp_throw($sym32$OUTER_CATCH_FOR_SHOP_METHOD, gethash(domain_name, domain_table, UNPROVIDED));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_main.set_shop_domain_table(self, domain_table);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_method = Errors.handleThrowable(ccatch_env_var, $sym32$OUTER_CATCH_FOR_SHOP_METHOD);
            }
            return catch_var_for_shop_method;
        }
    }

    public static SubLObject shop_get_domain_method(final SubLObject self, final SubLObject domain_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_method = NIL;
        final SubLObject domain_table = get_shop_domain_table(self);
        try {
            thread.throwStack.push($sym32$OUTER_CATCH_FOR_SHOP_METHOD);
            try {
                sublisp_throw($sym32$OUTER_CATCH_FOR_SHOP_METHOD, gethash(domain_name, domain_table, UNPROVIDED));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_domain_table(self, domain_table);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_method = Errors.handleThrowable(ccatch_env_var, $sym32$OUTER_CATCH_FOR_SHOP_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_method;
    }

    public static final SubLObject shop_get_problem_method_alt(SubLObject self, SubLObject problem_name) {
        {
            SubLObject catch_var_for_shop_method = NIL;
            SubLObject problem_table = com.cyc.cycjava.cycl.shop_main.get_shop_problem_table(self);
            try {
                try {
                    {
                        SubLObject prob = gethash(problem_name, problem_table, UNPROVIDED);
                        if (NIL == prob) {
                            Errors.cerror($str_alt38$No_planning_problem_of_the_name__, problem_name);
                        }
                        sublisp_throw($sym37$OUTER_CATCH_FOR_SHOP_METHOD, prob);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_main.set_shop_problem_table(self, problem_table);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_method = Errors.handleThrowable(ccatch_env_var, $sym37$OUTER_CATCH_FOR_SHOP_METHOD);
            }
            return catch_var_for_shop_method;
        }
    }

    public static SubLObject shop_get_problem_method(final SubLObject self, final SubLObject problem_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_method = NIL;
        final SubLObject problem_table = get_shop_problem_table(self);
        try {
            thread.throwStack.push($sym37$OUTER_CATCH_FOR_SHOP_METHOD);
            try {
                final SubLObject prob = gethash(problem_name, problem_table, UNPROVIDED);
                if (NIL == prob) {
                    Errors.cerror($str38$No_planning_problem_of_the_name__, problem_name);
                }
                sublisp_throw($sym37$OUTER_CATCH_FOR_SHOP_METHOD, prob);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_problem_table(self, problem_table);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_method = Errors.handleThrowable(ccatch_env_var, $sym37$OUTER_CATCH_FOR_SHOP_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_method;
    }

    public static final SubLObject shop_make_new_thread_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_shop_method = NIL;
            SubLObject threads = com.cyc.cycjava.cycl.shop_main.get_shop_threads(self);
            try {
                try {
                    {
                        SubLObject new_thread = object.object_new_method(SHOP_BASIC_PLANNER_THREAD);
                        if (list_length(threads).numGE(TWENTY_INTEGER)) {
                            com.cyc.cycjava.cycl.shop_main.shop_cleanup_threads_method(self);
                        }
                        threads = cons(new_thread, threads);
                        instances.set_slot(new_thread, PLANNER, self);
                        sublisp_throw($sym42$OUTER_CATCH_FOR_SHOP_METHOD, new_thread);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_main.set_shop_threads(self, threads);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_method = Errors.handleThrowable(ccatch_env_var, $sym42$OUTER_CATCH_FOR_SHOP_METHOD);
            }
            return catch_var_for_shop_method;
        }
    }

    public static SubLObject shop_make_new_thread_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_method = NIL;
        SubLObject threads = get_shop_threads(self);
        try {
            thread.throwStack.push($sym42$OUTER_CATCH_FOR_SHOP_METHOD);
            try {
                final SubLObject new_thread = object.object_new_method(SHOP_BASIC_PLANNER_THREAD);
                if (list_length(threads).numGE(TWENTY_INTEGER)) {
                    shop_cleanup_threads_method(self);
                }
                threads = cons(new_thread, threads);
                instances.set_slot(new_thread, PLANNER, self);
                sublisp_throw($sym42$OUTER_CATCH_FOR_SHOP_METHOD, new_thread);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_threads(self, threads);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_method = Errors.handleThrowable(ccatch_env_var, $sym42$OUTER_CATCH_FOR_SHOP_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_method;
    }

    public static final SubLObject shop_make_problem_method_alt(SubLObject self, SubLObject problem_name, SubLObject domain_name, SubLObject state, SubLObject tasks, SubLObject mt) {
        {
            SubLObject catch_var_for_shop_method = NIL;
            SubLObject problem_table = com.cyc.cycjava.cycl.shop_main.get_shop_problem_table(self);
            try {
                try {
                    {
                        SubLObject domain = NIL;
                        SubLObject new_problem = NIL;
                        SubLObject new_statebody = NIL;
                        new_problem = object.object_new_method(SHOP_BASIC_PROBLEM);
                        new_statebody = object.object_new_method(SHOP_BASIC_WORLD_STATE);
                        domain = com.cyc.cycjava.cycl.shop_main.shop_get_domain_method(self, domain_name);
                        methods.funcall_instance_method_with_1_args(new_statebody, MAKE_STATEBODY, state);
                        shop_datastructures.shop_basic_problem_initialize_problem_method(new_problem, problem_name, domain, new_statebody, tasks, mt);
                        sethash(problem_name, problem_table, new_problem);
                        sublisp_throw($sym49$OUTER_CATCH_FOR_SHOP_METHOD, new_problem);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_main.set_shop_problem_table(self, problem_table);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_method = Errors.handleThrowable(ccatch_env_var, $sym49$OUTER_CATCH_FOR_SHOP_METHOD);
            }
            return catch_var_for_shop_method;
        }
    }

    public static SubLObject shop_make_problem_method(final SubLObject self, final SubLObject problem_name, final SubLObject domain_name, final SubLObject state, final SubLObject tasks, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_method = NIL;
        final SubLObject problem_table = get_shop_problem_table(self);
        try {
            thread.throwStack.push($sym49$OUTER_CATCH_FOR_SHOP_METHOD);
            try {
                SubLObject domain = NIL;
                SubLObject new_problem = NIL;
                SubLObject new_statebody = NIL;
                new_problem = object.object_new_method(SHOP_BASIC_PROBLEM);
                new_statebody = object.object_new_method(SHOP_BASIC_WORLD_STATE);
                domain = shop_get_domain_method(self, domain_name);
                methods.funcall_instance_method_with_1_args(new_statebody, MAKE_STATEBODY, state);
                shop_datastructures.shop_basic_problem_initialize_problem_method(new_problem, problem_name, domain, new_statebody, tasks, mt);
                sethash(problem_name, problem_table, new_problem);
                sublisp_throw($sym49$OUTER_CATCH_FOR_SHOP_METHOD, new_problem);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_problem_table(self, problem_table);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_method = Errors.handleThrowable(ccatch_env_var, $sym49$OUTER_CATCH_FOR_SHOP_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_method;
    }

    public static final SubLObject shop_cleanup_threads_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_shop_method = NIL;
            SubLObject threads = com.cyc.cycjava.cycl.shop_main.get_shop_threads(self);
            try {
                try {
                    threads = NIL;
                    sublisp_throw($sym56$OUTER_CATCH_FOR_SHOP_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_main.set_shop_threads(self, threads);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_method = Errors.handleThrowable(ccatch_env_var, $sym56$OUTER_CATCH_FOR_SHOP_METHOD);
            }
            return catch_var_for_shop_method;
        }
    }

    public static SubLObject shop_cleanup_threads_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_method = NIL;
        SubLObject threads = get_shop_threads(self);
        try {
            thread.throwStack.push($sym56$OUTER_CATCH_FOR_SHOP_METHOD);
            try {
                threads = NIL;
                sublisp_throw($sym56$OUTER_CATCH_FOR_SHOP_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_threads(self, threads);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_method = Errors.handleThrowable(ccatch_env_var, $sym56$OUTER_CATCH_FOR_SHOP_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_method;
    }

    public static final SubLObject shop_gather_initial_state_method_alt(SubLObject self, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject init_mts = NIL;
                SubLObject node_var = mt;
                SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                SubLObject recur_deck = deck.create_deck(deck_type);
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        {
                            SubLObject tv_var = NIL;
                            {
                                SubLObject _prev_bind_0_1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (NIL != tv_var) {
                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($ERROR)) {
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt67$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        if (pcase_var.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt67$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var.eql($WARN)) {
                                                                Errors.warn($str_alt67$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            } else {
                                                                Errors.warn($str_alt72$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str_alt67$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_2 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        SubLObject _prev_bind_1_3 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlMt), thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlMt)), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlMt)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlMt), thread);
                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(mt, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                {
                                                    SubLObject _prev_bind_0_4 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlMt)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                        while (NIL != node_var) {
                                                            {
                                                                SubLObject genl_mt = node_var;
                                                                if ((NIL == subl_promotions.memberP(genl_mt, init_mts, UNPROVIDED, UNPROVIDED)) && (NIL != isa.isaP(genl_mt, $$PlanDynamicSituationMicrotheory, UNPROVIDED, UNPROVIDED))) {
                                                                    init_mts = cons(genl_mt, init_mts);
                                                                }
                                                            }
                                                            {
                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlMt));
                                                                SubLObject cdolist_list_var = accessible_modules;
                                                                SubLObject module_var = NIL;
                                                                for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                    {
                                                                        SubLObject _prev_bind_0_7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                            {
                                                                                SubLObject node = function_terms.naut_to_nart(node_var);
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
                                                                                                                SubLObject mt_9 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                thread.resetMultipleValues();
                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_9)) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_10 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_9, thread);
                                                                                                                            {
                                                                                                                                SubLObject iteration_state_11 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_11)) {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_11);
                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_12 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                        SubLObject cdolist_list_var_13 = new_list;
                                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                                        for (node_vars_link_node = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , node_vars_link_node = cdolist_list_var_13.first()) {
                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_12, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iteration_state_11 = dictionary_contents.do_dictionary_contents_next(iteration_state_11);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_11);
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_10, thread);
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
                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt75$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                        {
                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                            SubLObject cdolist_list_var_14 = new_list;
                                                                                            SubLObject generating_fn = NIL;
                                                                                            for (generating_fn = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , generating_fn = cdolist_list_var_14.first()) {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_15 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                        {
                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                            SubLObject new_list_16 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                            SubLObject cdolist_list_var_17 = new_list_16;
                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                            for (node_vars_link_node = cdolist_list_var_17.first(); NIL != cdolist_list_var_17; cdolist_list_var_17 = cdolist_list_var_17.rest() , node_vars_link_node = cdolist_list_var_17.first()) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_15, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_8, thread);
                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_7, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            node_var = deck.deck_pop(recur_deck);
                                                        } 
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_6, thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_5, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_4, thread);
                                                    }
                                                }
                                            } else {
                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt76$Node__a_does_not_pass_sbhl_type_t, mt, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_3, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                    }
                }
                return Mapping.mapcar(ASSERTION_HL_FORMULA, apply(APPEND, Mapping.mapcar(GATHER_MT_INDEX, init_mts)));
            }
        }
    }

    public static SubLObject shop_gather_initial_state_method(final SubLObject self, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject init_mts = NIL;
        SubLObject node_var = mt;
        final SubLObject deck_type = $STACK;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str67$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str67$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str67$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str72$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str67$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlMt), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlMt)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlMt)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlMt), thread);
                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(mt, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$4 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlMt)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                while (NIL != node_var) {
                                    final SubLObject genl_mt = node_var;
                                    if ((NIL == subl_promotions.memberP(genl_mt, init_mts, UNPROVIDED, UNPROVIDED)) && (NIL != isa.isaP(genl_mt, $$PlanDynamicSituationMicrotheory, UNPROVIDED, UNPROVIDED))) {
                                        init_mts = cons(genl_mt, init_mts);
                                    }
                                    SubLObject cdolist_list_var;
                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlMt));
                                    SubLObject module_var = NIL;
                                    module_var = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        final SubLObject _prev_bind_0_$4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                            final SubLObject node = function_terms.naut_to_nart(node_var);
                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                if (NIL != d_link) {
                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != mt_links) {
                                                        SubLObject iteration_state;
                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject mt_$9 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$9)) {
                                                                final SubLObject _prev_bind_0_$5 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$9, thread);
                                                                    SubLObject iteration_state_$11;
                                                                    for (iteration_state_$11 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$11); iteration_state_$11 = dictionary_contents.do_dictionary_contents_next(iteration_state_$11)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$11);
                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                            final SubLObject _prev_bind_0_$6 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                final SubLObject sol = link_nodes;
                                                                                if (NIL != set.set_p(sol)) {
                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                    SubLObject basis_object;
                                                                                    SubLObject state;
                                                                                    SubLObject node_vars_link_node;
                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (sol.isList()) {
                                                                                        SubLObject csome_list_var = sol;
                                                                                        SubLObject node_vars_link_node2 = NIL;
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                        while (NIL != csome_list_var) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                            }
                                                                                            csome_list_var = csome_list_var.rest();
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                        } 
                                                                                    } else {
                                                                                        Errors.error($str75$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }

                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$6, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$11);
                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$5, thread);
                                                                }
                                                            }
                                                        }
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                    }
                                                } else {
                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str76$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            } else
                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$13;
                                                    final SubLObject new_list = cdolist_list_var_$13 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    SubLObject generating_fn = NIL;
                                                    generating_fn = cdolist_list_var_$13.first();
                                                    while (NIL != cdolist_list_var_$13) {
                                                        final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                            final SubLObject sol2;
                                                            final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                            if (NIL != set.set_p(sol2)) {
                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                    }
                                                                }
                                                            } else
                                                                if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (NIL != csome_list_var2) {
                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    } 
                                                                } else {
                                                                    Errors.error($str75$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }

                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$7, thread);
                                                        }
                                                        cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                                        generating_fn = cdolist_list_var_$13.first();
                                                    } 
                                                }

                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$5, thread);
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$4, thread);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        module_var = cdolist_list_var.first();
                                    } 
                                    node_var = deck.deck_pop(recur_deck);
                                } 
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$6, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$4, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$3, thread);
                            }
                        } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str77$Node__a_does_not_pass_sbhl_type_t, mt, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$3, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return Mapping.mapcar(ASSERTION_HL_FORMULA, apply(APPEND, Mapping.mapcar(GATHER_MT_INDEX, init_mts)));
    }

    /**
     * Creates a planning problem object for the planner from
     * the information in PROBLEM-MT, that has planning domain
     * DOMAIN-NAME.
     */
    @LispMethod(comment = "Creates a planning problem object for the planner from\r\nthe information in PROBLEM-MT, that has planning domain\r\nDOMAIN-NAME.\nCreates a planning problem object for the planner from\nthe information in PROBLEM-MT, that has planning domain\nDOMAIN-NAME.")
    public static final SubLObject shop_make_problem_from_mt_method_alt(SubLObject self, SubLObject domain_symbol, SubLObject mt) {
        {
            SubLObject cyc_tasks = NIL;
            SubLObject problem_name = mt;
            SubLObject initial_state = com.cyc.cycjava.cycl.shop_main.shop_gather_initial_state_method(self, mt);
            SubLObject new_problem = NIL;
            cyc_tasks = Mapping.mapcar(ASSERTION_HL_FORMULA, kb_mapping.gather_mt_index(mt));
            if (NIL == cyc_tasks) {
                Errors.cerror($$$STOP, $str_alt85$Microtheory__s_is_empty, mt);
                return NIL;
            }
            new_problem = com.cyc.cycjava.cycl.shop_main.shop_make_problem_method(self, problem_name, domain_symbol, initial_state, cyc_tasks, mt);
            return new_problem;
        }
    }

    /**
     * Creates a planning problem object for the planner from
     * the information in PROBLEM-MT, that has planning domain
     * DOMAIN-NAME.
     */
    @LispMethod(comment = "Creates a planning problem object for the planner from\r\nthe information in PROBLEM-MT, that has planning domain\r\nDOMAIN-NAME.\nCreates a planning problem object for the planner from\nthe information in PROBLEM-MT, that has planning domain\nDOMAIN-NAME.")
    public static SubLObject shop_make_problem_from_mt_method(final SubLObject self, final SubLObject domain_symbol, final SubLObject mt) {
        SubLObject cyc_tasks = NIL;
        final SubLObject initial_state = shop_gather_initial_state_method(self, mt);
        SubLObject new_problem = NIL;
        cyc_tasks = Mapping.mapcar(ASSERTION_HL_FORMULA, kb_mapping.gather_mt_index(mt));
        if (NIL == cyc_tasks) {
            Errors.cerror($$$STOP, $str86$Microtheory__s_is_empty, mt);
            return NIL;
        }
        new_problem = shop_make_problem_method(self, mt, domain_symbol, initial_state, cyc_tasks, mt);
        return new_problem;
    }

    /**
     * Creates a planning domain structure for the planner from
     * the information in DOMAIN-MT.
     *
     * @param DOMAIN-MT
    hlmt-p
     * 		
     * @return shop-domain-p
     */
    @LispMethod(comment = "Creates a planning domain structure for the planner from\r\nthe information in DOMAIN-MT.\r\n\r\n@param DOMAIN-MT\nhlmt-p\r\n\t\t\r\n@return shop-domain-p\nCreates a planning domain structure for the planner from\nthe information in DOMAIN-MT.")
    public static final SubLObject shop_make_domain_from_mt_method_alt(SubLObject self, SubLObject domain_mt) {
        {
            SubLObject catch_var_for_shop_method = NIL;
            SubLObject domain_table = com.cyc.cycjava.cycl.shop_main.get_shop_domain_table(self);
            try {
                try {
                    {
                        SubLObject domain = object.object_new_method(SHOP_CYC_DOMAIN);
                        shop_domain.shop_cyc_domain_process_plan_assertions_method(domain, domain_mt);
                        sethash(domain_mt, domain_table, domain);
                        sublisp_throw($sym90$OUTER_CATCH_FOR_SHOP_METHOD, domain);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_main.set_shop_domain_table(self, domain_table);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_method = Errors.handleThrowable(ccatch_env_var, $sym90$OUTER_CATCH_FOR_SHOP_METHOD);
            }
            return catch_var_for_shop_method;
        }
    }

    /**
     * Creates a planning domain structure for the planner from
     * the information in DOMAIN-MT.
     *
     * @param DOMAIN-MT
    		hlmt-p
     * 		
     * @return shop-domain-p
     */
    @LispMethod(comment = "Creates a planning domain structure for the planner from\r\nthe information in DOMAIN-MT.\r\n\r\n@param DOMAIN-MT\n\t\thlmt-p\r\n\t\t\r\n@return shop-domain-p\nCreates a planning domain structure for the planner from\nthe information in DOMAIN-MT.")
    public static SubLObject shop_make_domain_from_mt_method(final SubLObject self, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_method = NIL;
        final SubLObject domain_table = get_shop_domain_table(self);
        try {
            thread.throwStack.push($sym91$OUTER_CATCH_FOR_SHOP_METHOD);
            try {
                final SubLObject domain = object.object_new_method(SHOP_CYC_DOMAIN);
                shop_domain.shop_cyc_domain_process_plan_assertions_method(domain, domain_mt);
                sethash(domain_mt, domain_table, domain);
                sublisp_throw($sym91$OUTER_CATCH_FOR_SHOP_METHOD, domain);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_domain_table(self, domain_table);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_method = Errors.handleThrowable(ccatch_env_var, $sym91$OUTER_CATCH_FOR_SHOP_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_method;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(reader_make_constant_shell("preconditionFor-Props"), reader_make_constant_shell("effectOfAction-Props"), reader_make_constant_shell("effectOfActionIf-Props"));

    static private final SubLList $list_alt1 = list(reader_make_constant_shell("methodForAction"), reader_make_constant_shell("sufficientFor-Props"), reader_make_constant_shell("preconditionForMethod"));

    static private final SubLList $list_alt2 = list(reader_make_constant_shell("SimpleSituationPredicate"));

    /**
     *
     *
     * @param TASK
    el-formula-p
     * 		
     * @param MT
    hlmt-p
     * 		
     */
    @LispMethod(comment = "@param TASK\nel-formula-p\r\n\t\t\r\n@param MT\nhlmt-p")
    public static final SubLObject shop_find_plans_int_alt(SubLObject task, SubLObject mt, SubLObject verbose, SubLObject number, SubLObject time, SubLObject depth, SubLObject backchain) {
        if (NIL == $shop$.getGlobalValue()) {
            $shop$.setGlobalValue(object.object_new_method(SHOP));
        }
        SubLTrampolineFile.checkType(mt, HLMT_P);
        {
            SubLObject planner_thread = com.cyc.cycjava.cycl.shop_main.shop_make_new_thread_method($shop$.getGlobalValue());
            if (NIL != backchain) {
                instances.set_slot(planner_thread, $sym94$DO_FI_ASKS_, T);
                instances.set_slot(planner_thread, NUM_BACKCHAINS, backchain);
            }
            com.cyc.cycjava.cycl.shop_main.shop_make_domain_from_mt_method($shop$.getGlobalValue(), mt);
            shop_basic_planner_thread.shop_basic_planner_thread_find_plans_method(planner_thread, task, mt, $ALL, verbose, number, time, depth);
            return shop_basic_planner_thread.shop_basic_planner_thread_cycl_plans_method(planner_thread);
        }
    }

    /**
     *
     *
     * @param TASK
    el-formula-p
     * 		
     * @param MT
    hlmt-p
     * 		
     */
    @LispMethod(comment = "@param TASK\nel-formula-p\r\n\t\t\r\n@param MT\nhlmt-p")
    public static SubLObject shop_find_plans_int(final SubLObject task, final SubLObject mt, final SubLObject verbose, final SubLObject number, final SubLObject time, final SubLObject depth, final SubLObject backchain) {
        if (NIL == $shop$.getGlobalValue()) {
            $shop$.setGlobalValue(object.object_new_method(SHOP));
        }
        assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
        final SubLObject planner_thread = shop_make_new_thread_method($shop$.getGlobalValue());
        if (NIL != backchain) {
            instances.set_slot(planner_thread, $sym95$DO_FI_ASKS_, T);
            instances.set_slot(planner_thread, NUM_BACKCHAINS, backchain);
        }
        shop_make_domain_from_mt_method($shop$.getGlobalValue(), mt);
        shop_basic_planner_thread.shop_basic_planner_thread_find_plans_method(planner_thread, task, mt, $ALL, verbose, number, time, depth);
        return shop_basic_planner_thread.shop_basic_planner_thread_cycl_plans_method(planner_thread);
    }

    static private final SubLList $list_alt6 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MAKE-NEW-THREAD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MAKE-PROBLEM-FROM-MT"), list(makeSymbol("DOMAIN"), makeSymbol("MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MAKE-DOMAIN-FROM-MT"), list(makeSymbol("MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PROBLEM"), list(makeSymbol("NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DOMAIN"), list(makeSymbol("NAME")), makeKeyword("PUBLIC")));

    public static final SubLObject shop_planning_assertionP_alt(SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            return eq(assertions_high.gaf_predicate(assertion), $$preconditionForMethod);
        } else {
            if (NIL != assertions_high.assertion_mentions_term(assertion, $$methodForAction)) {
                return T;
            } else {
                if (NIL != assertions_high.assertion_mentions_term(assertion, $$preconditionFor_Props)) {
                    return T;
                } else {
                    if (NIL != assertions_high.assertion_mentions_term(assertion, $$effectOfAction_Props)) {
                        return T;
                    } else {
                        if (NIL != assertions_high.assertion_mentions_term(assertion, $$sufficientFor_Props)) {
                            return T;
                        } else {
                            if (NIL != assertions_high.assertion_mentions_term(assertion, $$effectOfActionIf_Props)) {
                                return T;
                            } else {
                                return NIL;
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject shop_planning_assertionP(final SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            return eq(assertions_high.gaf_predicate(assertion), $$preconditionForMethod);
        }
        if (NIL != assertions_high.assertion_mentions_term(assertion, $$methodForAction)) {
            return T;
        }
        if (NIL != assertions_high.assertion_mentions_term(assertion, $$preconditionFor_Props)) {
            return T;
        }
        if (NIL != assertions_high.assertion_mentions_term(assertion, $$effectOfAction_Props)) {
            return T;
        }
        if (NIL != assertions_high.assertion_mentions_term(assertion, $$sufficientFor_Props)) {
            return T;
        }
        if (NIL != assertions_high.assertion_mentions_term(assertion, $$effectOfActionIf_Props)) {
            return T;
        }
        return NIL;
    }

    static private final SubLList $list_alt9 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("CREATE-PLAN-DISPLAYER"), list(makeSymbol("PLAN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("CREATE-TASK-DISPLAYER"), list(makeSymbol("TASK")), makeKeyword("PUBLIC")));

    static private final SubLList $list_alt16 = list(makeSymbol("SHOP-PLANNER"));

    static private final SubLList $list_alt17 = list(list(makeSymbol("DISPLAYER-FACTORY"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DOMAIN-TABLE"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("PROBLEM-TABLE"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("THREADS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP-THREADS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GATHER-INITIAL-STATE"), list(makeSymbol("MT")), makeKeyword("PUBLIC")));

    /**
     * Returns a list of plan datastructures for TASK in the context of MT.
     * TASK is a formula with an instance of #$ActionPredicate as its first argument.
     * MT is a microtheory.
     * VERBOSE is an integer between 0 and 9, that controls how much logging information
     * shop should send to standard output.
     * NUMBER is the maximum number of plans to return.
     * TIME is the maximum amount of time allocated to the planner.
     * DEPTH is the maximum depth the planner can reach searching for plans.
     * BACKCHAIN is the maximum number of backchains allowed when querying the KB when matching
     * rule conditions.
     */
    @LispMethod(comment = "Returns a list of plan datastructures for TASK in the context of MT.\r\nTASK is a formula with an instance of #$ActionPredicate as its first argument.\r\nMT is a microtheory.\r\nVERBOSE is an integer between 0 and 9, that controls how much logging information\r\nshop should send to standard output.\r\nNUMBER is the maximum number of plans to return.\r\nTIME is the maximum amount of time allocated to the planner.\r\nDEPTH is the maximum depth the planner can reach searching for plans.\r\nBACKCHAIN is the maximum number of backchains allowed when querying the KB when matching\r\nrule conditions.\nReturns a list of plan datastructures for TASK in the context of MT.\nTASK is a formula with an instance of #$ActionPredicate as its first argument.\nMT is a microtheory.\nVERBOSE is an integer between 0 and 9, that controls how much logging information\nshop should send to standard output.\nNUMBER is the maximum number of plans to return.\nTIME is the maximum amount of time allocated to the planner.\nDEPTH is the maximum depth the planner can reach searching for plans.\nBACKCHAIN is the maximum number of backchains allowed when querying the KB when matching\nrule conditions.")
    public static final SubLObject shop_find_plans_alt(SubLObject task, SubLObject mt, SubLObject verbose, SubLObject number, SubLObject time, SubLObject depth, SubLObject backchain) {
        if (verbose == UNPROVIDED) {
            verbose = ZERO_INTEGER;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        return com.cyc.cycjava.cycl.shop_main.shop_find_plans_int(task, mt, verbose, number, time, depth, backchain);
    }

    /**
     * Returns a list of plan datastructures for TASK in the context of MT.
     * TASK is a formula with an instance of #$ActionPredicate as its first argument.
     * MT is a microtheory.
     * VERBOSE is an integer between 0 and 9, that controls how much logging information
     * shop should send to standard output.
     * NUMBER is the maximum number of plans to return.
     * TIME is the maximum amount of time allocated to the planner.
     * DEPTH is the maximum depth the planner can reach searching for plans.
     * BACKCHAIN is the maximum number of backchains allowed when querying the KB when matching
     * rule conditions.
     */
    @LispMethod(comment = "Returns a list of plan datastructures for TASK in the context of MT.\r\nTASK is a formula with an instance of #$ActionPredicate as its first argument.\r\nMT is a microtheory.\r\nVERBOSE is an integer between 0 and 9, that controls how much logging information\r\nshop should send to standard output.\r\nNUMBER is the maximum number of plans to return.\r\nTIME is the maximum amount of time allocated to the planner.\r\nDEPTH is the maximum depth the planner can reach searching for plans.\r\nBACKCHAIN is the maximum number of backchains allowed when querying the KB when matching\r\nrule conditions.\nReturns a list of plan datastructures for TASK in the context of MT.\nTASK is a formula with an instance of #$ActionPredicate as its first argument.\nMT is a microtheory.\nVERBOSE is an integer between 0 and 9, that controls how much logging information\nshop should send to standard output.\nNUMBER is the maximum number of plans to return.\nTIME is the maximum amount of time allocated to the planner.\nDEPTH is the maximum depth the planner can reach searching for plans.\nBACKCHAIN is the maximum number of backchains allowed when querying the KB when matching\nrule conditions.")
    public static SubLObject shop_find_plans(final SubLObject task, final SubLObject mt, SubLObject verbose, SubLObject number, SubLObject time, SubLObject depth, SubLObject backchain) {
        if (verbose == UNPROVIDED) {
            verbose = ZERO_INTEGER;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        return shop_find_plans_int(task, mt, verbose, number, time, depth, backchain);
    }

    /**
     * Returns T iff OBJECT is a SHOP plan datastructure.
     */
    @LispMethod(comment = "Returns T iff OBJECT is a SHOP plan datastructure.")
    public static final SubLObject shop_plan_p_alt(SubLObject v_object) {
        return shop_basic_plan.shop_basic_plan_p(v_object);
    }

    /**
     * Returns T iff OBJECT is a SHOP plan datastructure.
     */
    @LispMethod(comment = "Returns T iff OBJECT is a SHOP plan datastructure.")
    public static SubLObject shop_plan_p(final SubLObject v_object) {
        return shop_basic_plan.shop_basic_plan_p(v_object);
    }

    /**
     * Returns list of simple action sentences for PLAN.
     * A return value of NIL means that PLAN is trivial
     * (i.e. the original task for the plan is already achieved.
     */
    @LispMethod(comment = "Returns list of simple action sentences for PLAN.\r\nA return value of NIL means that PLAN is trivial\r\n(i.e. the original task for the plan is already achieved.\nReturns list of simple action sentences for PLAN.\nA return value of NIL means that PLAN is trivial\n(i.e. the original task for the plan is already achieved.")
    public static final SubLObject shop_plan_simple_actions_alt(SubLObject plan) {
        SubLTrampolineFile.checkType(plan, SHOP_PLAN_P);
        SubLTrampolineFile.checkType(plan, SHOP_PLAN_P);
        return methods.funcall_instance_method_with_0_args(plan, PRIMITIVE_FORM);
    }

    /**
     * Returns list of simple action sentences for PLAN.
     * A return value of NIL means that PLAN is trivial
     * (i.e. the original task for the plan is already achieved.
     */
    @LispMethod(comment = "Returns list of simple action sentences for PLAN.\r\nA return value of NIL means that PLAN is trivial\r\n(i.e. the original task for the plan is already achieved.\nReturns list of simple action sentences for PLAN.\nA return value of NIL means that PLAN is trivial\n(i.e. the original task for the plan is already achieved.")
    public static SubLObject shop_plan_simple_actions(final SubLObject plan) {
        SubLTrampolineFile.enforceType(plan, SHOP_PLAN_P);
        assert NIL != shop_plan_p(plan) : "! shop_main.shop_plan_p(plan) " + ("shop_main.shop_plan_p(plan) " + "CommonSymbols.NIL != shop_main.shop_plan_p(plan) ") + plan;
        return methods.funcall_instance_method_with_0_args(plan, PRIMITIVE_FORM);
    }

    static private final SubLList $list_alt25 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt26 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("DOMAIN-TABLE"), list(makeSymbol("MAKE-HASH-TABLE"), TEN_INTEGER)), list(makeSymbol("CSETQ"), makeSymbol("PROBLEM-TABLE"), list(makeSymbol("MAKE-HASH-TABLE"), TEN_INTEGER)), list(makeSymbol("CSETQ"), makeSymbol("DISPLAYER-FACTORY"), NIL), list(RET, makeSymbol("SELF")));

    /**
     * Returns the task that has PLAN as a solution.
     */
    @LispMethod(comment = "Returns the task that has PLAN as a solution.")
    public static final SubLObject shop_plan_goal_alt(SubLObject plan) {
        SubLTrampolineFile.checkType(plan, SHOP_PLAN_P);
        SubLTrampolineFile.checkType(plan, SHOP_PLAN_P);
        {
            SubLObject var_manager = instances.get_slot(plan, VARIABLE_MANAGER);
            SubLObject task_struc = methods.funcall_instance_method_with_0_args(plan, GOAL_TASK);
            SubLObject task_pl_form = methods.funcall_instance_method_with_0_args(task_struc, FORMULA);
            SubLObject task_el_form = methods.funcall_instance_method_with_1_args(var_manager, RECOVER_EL, task_pl_form);
            return task_el_form;
        }
    }

    /**
     * Returns the task that has PLAN as a solution.
     */
    @LispMethod(comment = "Returns the task that has PLAN as a solution.")
    public static SubLObject shop_plan_goal(final SubLObject plan) {
        SubLTrampolineFile.enforceType(plan, SHOP_PLAN_P);
        assert NIL != shop_plan_p(plan) : "! shop_main.shop_plan_p(plan) " + ("shop_main.shop_plan_p(plan) " + "CommonSymbols.NIL != shop_main.shop_plan_p(plan) ") + plan;
        final SubLObject var_manager = instances.get_slot(plan, VARIABLE_MANAGER);
        final SubLObject task_struc = methods.funcall_instance_method_with_0_args(plan, GOAL_TASK);
        final SubLObject task_pl_form = methods.funcall_instance_method_with_0_args(task_struc, FORMULA);
        final SubLObject task_el_form = methods.funcall_instance_method_with_1_args(var_manager, RECOVER_EL, task_pl_form);
        return task_el_form;
    }

    static private final SubLList $list_alt30 = list(makeSymbol("DOMAIN-NAME"));

    public static SubLObject declare_shop_main_file() {
        declareFunction("initialize_planner_kb_feature", "INITIALIZE-PLANNER-KB-FEATURE", 0, 0, false);
        declareFunction("shop_planner_p", "SHOP-PLANNER-P", 1, 0, false);
        declareFunction("subloop_reserved_initialize_shop_plan_displayer_factory_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-PLAN-DISPLAYER-FACTORY-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_shop_plan_displayer_factory_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-PLAN-DISPLAYER-FACTORY-INSTANCE", 1, 0, false);
        declareFunction("shop_plan_displayer_factory_p", "SHOP-PLAN-DISPLAYER-FACTORY-P", 1, 0, false);
        declareFunction("get_shop_threads", "GET-SHOP-THREADS", 1, 0, false);
        declareFunction("set_shop_threads", "SET-SHOP-THREADS", 2, 0, false);
        declareFunction("get_shop_problem_table", "GET-SHOP-PROBLEM-TABLE", 1, 0, false);
        declareFunction("set_shop_problem_table", "SET-SHOP-PROBLEM-TABLE", 2, 0, false);
        declareFunction("get_shop_domain_table", "GET-SHOP-DOMAIN-TABLE", 1, 0, false);
        declareFunction("set_shop_domain_table", "SET-SHOP-DOMAIN-TABLE", 2, 0, false);
        declareFunction("get_shop_displayer_factory", "GET-SHOP-DISPLAYER-FACTORY", 1, 0, false);
        declareFunction("set_shop_displayer_factory", "SET-SHOP-DISPLAYER-FACTORY", 2, 0, false);
        declareFunction("subloop_reserved_initialize_shop_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_shop_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-INSTANCE", 1, 0, false);
        declareFunction("shop_p", "SHOP-P", 1, 0, false);
        declareFunction("shop_initialize_method", "SHOP-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("shop_get_domain_method", "SHOP-GET-DOMAIN-METHOD", 2, 0, false);
        declareFunction("shop_get_problem_method", "SHOP-GET-PROBLEM-METHOD", 2, 0, false);
        declareFunction("shop_make_new_thread_method", "SHOP-MAKE-NEW-THREAD-METHOD", 1, 0, false);
        declareFunction("shop_make_problem_method", "SHOP-MAKE-PROBLEM-METHOD", 6, 0, false);
        declareFunction("shop_cleanup_threads_method", "SHOP-CLEANUP-THREADS-METHOD", 1, 0, false);
        declareFunction("shop_gather_initial_state_method", "SHOP-GATHER-INITIAL-STATE-METHOD", 2, 0, false);
        declareFunction("shop_make_problem_from_mt_method", "SHOP-MAKE-PROBLEM-FROM-MT-METHOD", 3, 0, false);
        declareFunction("shop_make_domain_from_mt_method", "SHOP-MAKE-DOMAIN-FROM-MT-METHOD", 2, 0, false);
        declareFunction("shop_find_plans_int", "SHOP-FIND-PLANS-INT", 7, 0, false);
        declareFunction("shop_planning_assertionP", "SHOP-PLANNING-ASSERTION?", 1, 0, false);
        declareFunction("shop_find_plans", "SHOP-FIND-PLANS", 2, 5, false);
        declareFunction("shop_plan_p", "SHOP-PLAN-P", 1, 0, false);
        declareFunction("shop_plan_simple_actions", "SHOP-PLAN-SIMPLE-ACTIONS", 1, 0, false);
        declareFunction("shop_plan_goal", "SHOP-PLAN-GOAL", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt31 = list(list(RET, list(makeSymbol("GETHASH"), makeSymbol("DOMAIN-NAME"), makeSymbol("DOMAIN-TABLE"))));

    static private final SubLList $list_alt35 = list(makeSymbol("PROBLEM-NAME"));

    static private final SubLList $list_alt36 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PROB"), list(makeSymbol("GETHASH"), makeSymbol("PROBLEM-NAME"), makeSymbol("PROBLEM-TABLE")))), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("PROB")), list(makeSymbol("CERROR"), makeString("No planning problem of the name ~s"), makeSymbol("PROBLEM-NAME"))), list(RET, makeSymbol("PROB"))));

    static private final SubLString $str_alt38$No_planning_problem_of_the_name__ = makeString("No planning problem of the name ~s");

    static private final SubLList $list_alt41 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-THREAD"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-BASIC-PLANNER-THREAD")), list(QUOTE, makeSymbol("SHOP-BASIC-PLANNER-THREAD"))))), list(makeSymbol("PWHEN"), list(makeSymbol(">="), list(makeSymbol("LIST-LENGTH"), makeSymbol("THREADS")), TWENTY_INTEGER), list(makeSymbol("CLEANUP-THREADS"), makeSymbol("SELF"))), list(makeSymbol("CPUSH"), makeSymbol("NEW-THREAD"), makeSymbol("THREADS")), list(makeSymbol("SET-SLOT"), makeSymbol("NEW-THREAD"), list(QUOTE, makeSymbol("PLANNER")), makeSymbol("SELF")), list(RET, makeSymbol("NEW-THREAD"))));

    static private final SubLList $list_alt47 = list(makeSymbol("PROBLEM-NAME"), makeSymbol("DOMAIN-NAME"), makeSymbol("STATE"), makeSymbol("TASKS"), makeSymbol("MT"));

    static private final SubLList $list_alt48 = list(list(new SubLObject[]{ makeSymbol("CLET"), list(makeSymbol("DOMAIN"), makeSymbol("NEW-PROBLEM"), makeSymbol("NEW-STATEBODY")), list(makeSymbol("CSETQ"), makeSymbol("NEW-PROBLEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-BASIC-PROBLEM")), list(QUOTE, makeSymbol("SHOP-BASIC-PROBLEM")))), list(makeSymbol("CSETQ"), makeSymbol("NEW-STATEBODY"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-BASIC-WORLD-STATE")), list(QUOTE, makeSymbol("SHOP-BASIC-WORLD-STATE")))), list(makeSymbol("CSETQ"), makeSymbol("DOMAIN"), list(makeSymbol("GET-DOMAIN"), makeSymbol("SELF"), makeSymbol("DOMAIN-NAME"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("MAKE-STATEBODY"), makeSymbol("SHOP-BASIC-WORLD-STATE")), makeSymbol("NEW-STATEBODY"), makeSymbol("STATE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("INITIALIZE-PROBLEM"), makeSymbol("SHOP-BASIC-PROBLEM")), makeSymbol("NEW-PROBLEM"), makeSymbol("PROBLEM-NAME"), makeSymbol("DOMAIN"), makeSymbol("NEW-STATEBODY"), makeSymbol("TASKS"), makeSymbol("MT")), list(makeSymbol("CSETF"), list(makeSymbol("GETHASH"), makeSymbol("PROBLEM-NAME"), makeSymbol("PROBLEM-TABLE")), makeSymbol("NEW-PROBLEM")), list(RET, makeSymbol("NEW-PROBLEM")) }));

    public static final SubLObject init_shop_main_file_alt() {
        deflexical("*NEW-METHOD-PRED*", NIL);
        deflexical("*SHOP-SIMPLE-ACTION-DEFINITION-PREDICATES*", $list_alt0);
        deflexical("*SHOP-COMPLEX-ACTION-DEFINITION-PREDICATES*", $list_alt1);
        deflexical("*SHOP-DOMAIN-DEFINITION-PREDICATES*", union($shop_simple_action_definition_predicates$.getGlobalValue(), $shop_complex_action_definition_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
        deflexical("*SHOP-DOMAIN-DEFINITION-COLLECTIONS*", $list_alt2);
        deflexical("*PLANNER-CORE-CONSTANTS*", append($shop_domain_definition_predicates$.getGlobalValue(), $shop_domain_definition_collections$.getGlobalValue()));
        deflexical("*SHOP*", NIL != boundp($shop$) ? ((SubLObject) ($shop$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static SubLObject init_shop_main_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*NEW-METHOD-PRED*", NIL);
            deflexical("*SHOP-SIMPLE-ACTION-DEFINITION-PREDICATES*", $list0);
            deflexical("*SHOP-COMPLEX-ACTION-DEFINITION-PREDICATES*", $list1);
            deflexical("*SHOP-DOMAIN-DEFINITION-PREDICATES*", union($shop_simple_action_definition_predicates$.getGlobalValue(), $shop_complex_action_definition_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
            deflexical("*SHOP-DOMAIN-DEFINITION-COLLECTIONS*", $list2);
            deflexical("*PLANNER-CORE-CONSTANTS*", append($shop_domain_definition_predicates$.getGlobalValue(), $shop_domain_definition_collections$.getGlobalValue()));
            deflexical("*SHOP*", SubLTrampolineFile.maybeDefault($shop$, $shop$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SHOP*", NIL != boundp($shop$) ? ((SubLObject) ($shop$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_shop_main_file_Previous() {
        deflexical("*NEW-METHOD-PRED*", NIL);
        deflexical("*SHOP-SIMPLE-ACTION-DEFINITION-PREDICATES*", $list0);
        deflexical("*SHOP-COMPLEX-ACTION-DEFINITION-PREDICATES*", $list1);
        deflexical("*SHOP-DOMAIN-DEFINITION-PREDICATES*", union($shop_simple_action_definition_predicates$.getGlobalValue(), $shop_complex_action_definition_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
        deflexical("*SHOP-DOMAIN-DEFINITION-COLLECTIONS*", $list2);
        deflexical("*PLANNER-CORE-CONSTANTS*", append($shop_domain_definition_predicates$.getGlobalValue(), $shop_domain_definition_collections$.getGlobalValue()));
        deflexical("*SHOP*", SubLTrampolineFile.maybeDefault($shop$, $shop$, NIL));
        return NIL;
    }

    public static final SubLObject setup_shop_main_file_alt() {
        declare_defglobal($shop$);
        interfaces.new_interface(SHOP_PLANNER, NIL, NIL, $list_alt6);
        classes.subloop_new_class(SHOP_PLAN_DISPLAYER_FACTORY, OBJECT, NIL, NIL, $list_alt9);
        classes.class_set_implements_slot_listeners(SHOP_PLAN_DISPLAYER_FACTORY, NIL);
        classes.subloop_note_class_initialization_function(SHOP_PLAN_DISPLAYER_FACTORY, SUBLOOP_RESERVED_INITIALIZE_SHOP_PLAN_DISPLAYER_FACTORY_CLASS);
        classes.subloop_note_instance_initialization_function(SHOP_PLAN_DISPLAYER_FACTORY, SUBLOOP_RESERVED_INITIALIZE_SHOP_PLAN_DISPLAYER_FACTORY_INSTANCE);
        com.cyc.cycjava.cycl.shop_main.subloop_reserved_initialize_shop_plan_displayer_factory_class(SHOP_PLAN_DISPLAYER_FACTORY);
        classes.subloop_new_class(SHOP, OBJECT, $list_alt16, NIL, $list_alt17);
        classes.class_set_implements_slot_listeners(SHOP, NIL);
        classes.subloop_note_class_initialization_function(SHOP, SUBLOOP_RESERVED_INITIALIZE_SHOP_CLASS);
        classes.subloop_note_instance_initialization_function(SHOP, SUBLOOP_RESERVED_INITIALIZE_SHOP_INSTANCE);
        com.cyc.cycjava.cycl.shop_main.subloop_reserved_initialize_shop_class(SHOP);
        methods.methods_incorporate_instance_method(INITIALIZE, SHOP, $list_alt25, NIL, $list_alt26);
        methods.subloop_register_instance_method(SHOP, INITIALIZE, SHOP_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_DOMAIN, SHOP, $list_alt25, $list_alt30, $list_alt31);
        methods.subloop_register_instance_method(SHOP, GET_DOMAIN, SHOP_GET_DOMAIN_METHOD);
        methods.methods_incorporate_instance_method(GET_PROBLEM, SHOP, $list_alt25, $list_alt35, $list_alt36);
        methods.subloop_register_instance_method(SHOP, GET_PROBLEM, SHOP_GET_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method(MAKE_NEW_THREAD, SHOP, $list_alt25, NIL, $list_alt41);
        methods.subloop_register_instance_method(SHOP, MAKE_NEW_THREAD, SHOP_MAKE_NEW_THREAD_METHOD);
        methods.methods_incorporate_instance_method(MAKE_PROBLEM, SHOP, $list_alt25, $list_alt47, $list_alt48);
        methods.subloop_register_instance_method(SHOP, MAKE_PROBLEM, SHOP_MAKE_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method(CLEANUP_THREADS, SHOP, $list_alt25, NIL, $list_alt55);
        methods.subloop_register_instance_method(SHOP, CLEANUP_THREADS, SHOP_CLEANUP_THREADS_METHOD);
        methods.methods_incorporate_instance_method(GATHER_INITIAL_STATE, SHOP, $list_alt59, $list_alt60, $list_alt61);
        methods.subloop_register_instance_method(SHOP, GATHER_INITIAL_STATE, SHOP_GATHER_INITIAL_STATE_METHOD);
        methods.methods_incorporate_instance_method(MAKE_PROBLEM_FROM_MT, SHOP, $list_alt25, $list_alt82, $list_alt83);
        methods.subloop_register_instance_method(SHOP, MAKE_PROBLEM_FROM_MT, SHOP_MAKE_PROBLEM_FROM_MT_METHOD);
        methods.methods_incorporate_instance_method(MAKE_DOMAIN_FROM_MT, SHOP, $list_alt25, $list_alt88, $list_alt89);
        methods.subloop_register_instance_method(SHOP, MAKE_DOMAIN_FROM_MT, SHOP_MAKE_DOMAIN_FROM_MT_METHOD);
        register_cyc_api_function(SHOP_FIND_PLANS, $list_alt104, $str_alt105$Returns_a_list_of_plan_datastruct, NIL, $list_alt106);
        register_cyc_api_function(SHOP_PLAN_P, $list_alt108, $str_alt109$Returns_T_iff_OBJECT_is_a_SHOP_pl, NIL, $list_alt110);
        register_cyc_api_function(SHOP_PLAN_SIMPLE_ACTIONS, $list_alt113, $str_alt114$Returns_list_of_simple_action_sen, $list_alt115, $list_alt106);
        register_cyc_api_function(SHOP_PLAN_GOAL, $list_alt113, $str_alt121$Returns_the_task_that_has_PLAN_as, $list_alt115, $list_alt106);
        return NIL;
    }

    public static SubLObject setup_shop_main_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($shop$);
            interfaces.new_interface(SHOP_PLANNER, NIL, NIL, $list6);
            classes.subloop_new_class(SHOP_PLAN_DISPLAYER_FACTORY, OBJECT, NIL, NIL, $list9);
            classes.class_set_implements_slot_listeners(SHOP_PLAN_DISPLAYER_FACTORY, NIL);
            classes.subloop_note_class_initialization_function(SHOP_PLAN_DISPLAYER_FACTORY, SUBLOOP_RESERVED_INITIALIZE_SHOP_PLAN_DISPLAYER_FACTORY_CLASS);
            classes.subloop_note_instance_initialization_function(SHOP_PLAN_DISPLAYER_FACTORY, SUBLOOP_RESERVED_INITIALIZE_SHOP_PLAN_DISPLAYER_FACTORY_INSTANCE);
            subloop_reserved_initialize_shop_plan_displayer_factory_class(SHOP_PLAN_DISPLAYER_FACTORY);
            classes.subloop_new_class(SHOP, OBJECT, $list16, NIL, $list17);
            classes.class_set_implements_slot_listeners(SHOP, NIL);
            classes.subloop_note_class_initialization_function(SHOP, SUBLOOP_RESERVED_INITIALIZE_SHOP_CLASS);
            classes.subloop_note_instance_initialization_function(SHOP, SUBLOOP_RESERVED_INITIALIZE_SHOP_INSTANCE);
            subloop_reserved_initialize_shop_class(SHOP);
            methods.methods_incorporate_instance_method(INITIALIZE, SHOP, $list25, NIL, $list26);
            methods.subloop_register_instance_method(SHOP, INITIALIZE, SHOP_INITIALIZE_METHOD);
            methods.methods_incorporate_instance_method(GET_DOMAIN, SHOP, $list25, $list30, $list31);
            methods.subloop_register_instance_method(SHOP, GET_DOMAIN, SHOP_GET_DOMAIN_METHOD);
            methods.methods_incorporate_instance_method(GET_PROBLEM, SHOP, $list25, $list35, $list36);
            methods.subloop_register_instance_method(SHOP, GET_PROBLEM, SHOP_GET_PROBLEM_METHOD);
            methods.methods_incorporate_instance_method(MAKE_NEW_THREAD, SHOP, $list25, NIL, $list41);
            methods.subloop_register_instance_method(SHOP, MAKE_NEW_THREAD, SHOP_MAKE_NEW_THREAD_METHOD);
            methods.methods_incorporate_instance_method(MAKE_PROBLEM, SHOP, $list25, $list47, $list48);
            methods.subloop_register_instance_method(SHOP, MAKE_PROBLEM, SHOP_MAKE_PROBLEM_METHOD);
            methods.methods_incorporate_instance_method(CLEANUP_THREADS, SHOP, $list25, NIL, $list55);
            methods.subloop_register_instance_method(SHOP, CLEANUP_THREADS, SHOP_CLEANUP_THREADS_METHOD);
            methods.methods_incorporate_instance_method(GATHER_INITIAL_STATE, SHOP, $list59, $list60, $list61);
            methods.subloop_register_instance_method(SHOP, GATHER_INITIAL_STATE, SHOP_GATHER_INITIAL_STATE_METHOD);
            methods.methods_incorporate_instance_method(MAKE_PROBLEM_FROM_MT, SHOP, $list25, $list83, $list84);
            methods.subloop_register_instance_method(SHOP, MAKE_PROBLEM_FROM_MT, SHOP_MAKE_PROBLEM_FROM_MT_METHOD);
            methods.methods_incorporate_instance_method(MAKE_DOMAIN_FROM_MT, SHOP, $list25, $list89, $list90);
            methods.subloop_register_instance_method(SHOP, MAKE_DOMAIN_FROM_MT, SHOP_MAKE_DOMAIN_FROM_MT_METHOD);
            register_cyc_api_function(SHOP_FIND_PLANS, $list105, $str106$Returns_a_list_of_plan_datastruct, NIL, $list107);
            register_cyc_api_function(SHOP_PLAN_P, $list109, $str110$Returns_T_iff_OBJECT_is_a_SHOP_pl, NIL, $list111);
            register_cyc_api_function(SHOP_PLAN_SIMPLE_ACTIONS, $list114, $str115$Returns_list_of_simple_action_sen, $list116, $list107);
            register_cyc_api_function(SHOP_PLAN_GOAL, $list114, $str122$Returns_the_task_that_has_PLAN_as, $list116, $list107);
        }
        if (SubLFiles.USE_V2) {
            methods.methods_incorporate_instance_method(MAKE_PROBLEM_FROM_MT, SHOP, $list_alt25, $list_alt82, $list_alt83);
            methods.methods_incorporate_instance_method(MAKE_DOMAIN_FROM_MT, SHOP, $list_alt25, $list_alt88, $list_alt89);
            register_cyc_api_function(SHOP_FIND_PLANS, $list_alt104, $str_alt105$Returns_a_list_of_plan_datastruct, NIL, $list_alt106);
            register_cyc_api_function(SHOP_PLAN_P, $list_alt108, $str_alt109$Returns_T_iff_OBJECT_is_a_SHOP_pl, NIL, $list_alt110);
            register_cyc_api_function(SHOP_PLAN_SIMPLE_ACTIONS, $list_alt113, $str_alt114$Returns_list_of_simple_action_sen, $list_alt115, $list_alt106);
            register_cyc_api_function(SHOP_PLAN_GOAL, $list_alt113, $str_alt121$Returns_the_task_that_has_PLAN_as, $list_alt115, $list_alt106);
        }
        return NIL;
    }

    public static SubLObject setup_shop_main_file_Previous() {
        declare_defglobal($shop$);
        interfaces.new_interface(SHOP_PLANNER, NIL, NIL, $list6);
        classes.subloop_new_class(SHOP_PLAN_DISPLAYER_FACTORY, OBJECT, NIL, NIL, $list9);
        classes.class_set_implements_slot_listeners(SHOP_PLAN_DISPLAYER_FACTORY, NIL);
        classes.subloop_note_class_initialization_function(SHOP_PLAN_DISPLAYER_FACTORY, SUBLOOP_RESERVED_INITIALIZE_SHOP_PLAN_DISPLAYER_FACTORY_CLASS);
        classes.subloop_note_instance_initialization_function(SHOP_PLAN_DISPLAYER_FACTORY, SUBLOOP_RESERVED_INITIALIZE_SHOP_PLAN_DISPLAYER_FACTORY_INSTANCE);
        subloop_reserved_initialize_shop_plan_displayer_factory_class(SHOP_PLAN_DISPLAYER_FACTORY);
        classes.subloop_new_class(SHOP, OBJECT, $list16, NIL, $list17);
        classes.class_set_implements_slot_listeners(SHOP, NIL);
        classes.subloop_note_class_initialization_function(SHOP, SUBLOOP_RESERVED_INITIALIZE_SHOP_CLASS);
        classes.subloop_note_instance_initialization_function(SHOP, SUBLOOP_RESERVED_INITIALIZE_SHOP_INSTANCE);
        subloop_reserved_initialize_shop_class(SHOP);
        methods.methods_incorporate_instance_method(INITIALIZE, SHOP, $list25, NIL, $list26);
        methods.subloop_register_instance_method(SHOP, INITIALIZE, SHOP_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_DOMAIN, SHOP, $list25, $list30, $list31);
        methods.subloop_register_instance_method(SHOP, GET_DOMAIN, SHOP_GET_DOMAIN_METHOD);
        methods.methods_incorporate_instance_method(GET_PROBLEM, SHOP, $list25, $list35, $list36);
        methods.subloop_register_instance_method(SHOP, GET_PROBLEM, SHOP_GET_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method(MAKE_NEW_THREAD, SHOP, $list25, NIL, $list41);
        methods.subloop_register_instance_method(SHOP, MAKE_NEW_THREAD, SHOP_MAKE_NEW_THREAD_METHOD);
        methods.methods_incorporate_instance_method(MAKE_PROBLEM, SHOP, $list25, $list47, $list48);
        methods.subloop_register_instance_method(SHOP, MAKE_PROBLEM, SHOP_MAKE_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method(CLEANUP_THREADS, SHOP, $list25, NIL, $list55);
        methods.subloop_register_instance_method(SHOP, CLEANUP_THREADS, SHOP_CLEANUP_THREADS_METHOD);
        methods.methods_incorporate_instance_method(GATHER_INITIAL_STATE, SHOP, $list59, $list60, $list61);
        methods.subloop_register_instance_method(SHOP, GATHER_INITIAL_STATE, SHOP_GATHER_INITIAL_STATE_METHOD);
        methods.methods_incorporate_instance_method(MAKE_PROBLEM_FROM_MT, SHOP, $list25, $list83, $list84);
        methods.subloop_register_instance_method(SHOP, MAKE_PROBLEM_FROM_MT, SHOP_MAKE_PROBLEM_FROM_MT_METHOD);
        methods.methods_incorporate_instance_method(MAKE_DOMAIN_FROM_MT, SHOP, $list25, $list89, $list90);
        methods.subloop_register_instance_method(SHOP, MAKE_DOMAIN_FROM_MT, SHOP_MAKE_DOMAIN_FROM_MT_METHOD);
        register_cyc_api_function(SHOP_FIND_PLANS, $list105, $str106$Returns_a_list_of_plan_datastruct, NIL, $list107);
        register_cyc_api_function(SHOP_PLAN_P, $list109, $str110$Returns_T_iff_OBJECT_is_a_SHOP_pl, NIL, $list111);
        register_cyc_api_function(SHOP_PLAN_SIMPLE_ACTIONS, $list114, $str115$Returns_list_of_simple_action_sen, $list116, $list107);
        register_cyc_api_function(SHOP_PLAN_GOAL, $list114, $str122$Returns_the_task_that_has_PLAN_as, $list116, $list107);
        return NIL;
    }

    static private final SubLList $list_alt55 = list(list(makeSymbol("CSETQ"), makeSymbol("THREADS"), NIL), list(RET, NIL));

    static private final SubLList $list_alt59 = list(makeKeyword("PRIVATE"));

    static private final SubLList $list_alt60 = list(makeSymbol("MT"));

    static private final SubLList $list_alt61 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INIT-MTS"), NIL)), list(makeSymbol("DO-ALL-GENL-MTS"), list(makeSymbol("GENL-MT"), makeSymbol("MT")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("MEMBER?"), makeSymbol("GENL-MT"), makeSymbol("INIT-MTS"))), list(makeSymbol("ISA?"), makeSymbol("GENL-MT"), reader_make_constant_shell("PlanDynamicSituationMicrotheory"))), list(makeSymbol("CPUSH"), makeSymbol("GENL-MT"), makeSymbol("INIT-MTS")))), list(RET, list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("ASSERTION-HL-FORMULA")), list(makeSymbol("APPLY"), list(QUOTE, makeSymbol("APPEND")), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("GATHER-MT-INDEX")), makeSymbol("INIT-MTS")))))));

    static private final SubLString $str_alt67$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt72$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt75$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt76$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLList $list_alt82 = list(makeSymbol("DOMAIN-SYMBOL"), makeSymbol("MT"));

    static private final SubLList $list_alt83 = list(makeString("Creates a planning problem object for the planner from \n   the information in PROBLEM-MT, that has planning domain \n   DOMAIN-NAME."), list(makeSymbol("CLET"), list(makeSymbol("CYC-TASKS"), list(makeSymbol("PROBLEM-NAME"), makeSymbol("MT")), list(makeSymbol("INITIAL-STATE"), list(makeSymbol("GATHER-INITIAL-STATE"), makeSymbol("SELF"), makeSymbol("MT"))), makeSymbol("NEW-PROBLEM")), list(makeSymbol("CSETQ"), makeSymbol("CYC-TASKS"), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("ASSERTION-HL-FORMULA")), list(makeSymbol("GATHER-MT-INDEX"), makeSymbol("MT")))), list(makeSymbol("PUNLESS"), makeSymbol("CYC-TASKS"), list(makeSymbol("CERROR"), makeString("STOP"), makeString("Microtheory ~s is empty"), makeSymbol("MT")), list(RET, NIL)), list(makeSymbol("CSETQ"), makeSymbol("NEW-PROBLEM"), list(makeSymbol("MAKE-PROBLEM"), makeSymbol("SELF"), makeSymbol("PROBLEM-NAME"), makeSymbol("DOMAIN-SYMBOL"), makeSymbol("INITIAL-STATE"), makeSymbol("CYC-TASKS"), makeSymbol("MT"))), list(RET, makeSymbol("NEW-PROBLEM"))));

    @Override
    public void declareFunctions() {
        declare_shop_main_file();
    }

    @Override
    public void initializeVariables() {
        init_shop_main_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_shop_main_file();
    }

    static {
    }

    static private final SubLString $str_alt85$Microtheory__s_is_empty = makeString("Microtheory ~s is empty");

    static private final SubLList $list_alt88 = list(makeSymbol("DOMAIN-MT"));

    static private final SubLList $list_alt89 = list(makeString("Creates a planning domain structure for the planner from \n   the information in DOMAIN-MT.\n   @param DOMAIN-MT hlmt-p\n   @return shop-domain-p"), list(makeSymbol("CLET"), list(list(makeSymbol("DOMAIN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-CYC-DOMAIN")), list(QUOTE, makeSymbol("SHOP-CYC-DOMAIN"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("PROCESS-PLAN-ASSERTIONS"), makeSymbol("SHOP-CYC-DOMAIN")), makeSymbol("DOMAIN"), makeSymbol("DOMAIN-MT")), list(makeSymbol("CSETF"), list(makeSymbol("GETHASH"), makeSymbol("DOMAIN-MT"), makeSymbol("DOMAIN-TABLE")), makeSymbol("DOMAIN")), list(RET, makeSymbol("DOMAIN"))));

    static private final SubLSymbol $sym90$OUTER_CATCH_FOR_SHOP_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-METHOD");

    static private final SubLSymbol $sym94$DO_FI_ASKS_ = makeSymbol("DO-FI-ASKS?");

    static private final SubLList $list_alt104 = list(makeSymbol("TASK"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("VERBOSE"), ZERO_INTEGER), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"), makeSymbol("BACKCHAIN"));

    static private final SubLString $str_alt105$Returns_a_list_of_plan_datastruct = makeString("Returns a list of plan datastructures for TASK in the context of MT.\n   TASK is a formula with an instance of #$ActionPredicate as its first argument. \n   MT is a microtheory.\n   VERBOSE is an integer between 0 and 9, that controls how much logging information\n   shop should send to standard output.\n   NUMBER is the maximum number of plans to return.\n   TIME is the maximum amount of time allocated to the planner.\n   DEPTH is the maximum depth the planner can reach searching for plans.\n   BACKCHAIN is the maximum number of backchains allowed when querying the KB when matching\n   rule conditions.");

    static private final SubLList $list_alt106 = list(makeSymbol("LISTP"));

    static private final SubLList $list_alt108 = list(makeSymbol("OBJECT"));

    static private final SubLString $str_alt109$Returns_T_iff_OBJECT_is_a_SHOP_pl = makeString("Returns T iff OBJECT is a SHOP plan datastructure.");

    static private final SubLList $list_alt110 = list(makeSymbol("BOOLEANP"));

    static private final SubLList $list_alt113 = list(makeSymbol("PLAN"));

    static private final SubLString $str_alt114$Returns_list_of_simple_action_sen = makeString("Returns list of simple action sentences for PLAN.\n   A return value of NIL means that PLAN is trivial\n   (i.e. the original task for the plan is already achieved.");

    static private final SubLList $list_alt115 = list(list(makeSymbol("PLAN"), makeSymbol("SHOP-PLAN-P")));

    static private final SubLString $str_alt121$Returns_the_task_that_has_PLAN_as = makeString("Returns the task that has PLAN as a solution.");
}

/**
 * Total time: 582 ms
 */
