package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.list_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class shop_main extends SubLTranslatedFile {
    public static final SubLFile me = new shop_main();

    public static final String myName = "com.cyc.cycjava.cycl.shop_main";

    public static final String myFingerPrint = "3e580fdae342dc282c9661fdbf9c0ed772d195305c2ea2aac2009e5d6ed2fcb0";

    // deflexical
    // Definitions
    private static final SubLSymbol $new_method_pred$ = makeSymbol("*NEW-METHOD-PRED*");

    // deflexical
    public static final SubLSymbol $shop_simple_action_definition_predicates$ = makeSymbol("*SHOP-SIMPLE-ACTION-DEFINITION-PREDICATES*");

    // deflexical
    public static final SubLSymbol $shop_complex_action_definition_predicates$ = makeSymbol("*SHOP-COMPLEX-ACTION-DEFINITION-PREDICATES*");

    // deflexical
    public static final SubLSymbol $shop_domain_definition_predicates$ = makeSymbol("*SHOP-DOMAIN-DEFINITION-PREDICATES*");

    // deflexical
    public static final SubLSymbol $shop_domain_definition_collections$ = makeSymbol("*SHOP-DOMAIN-DEFINITION-COLLECTIONS*");

    // deflexical
    // representative sample of the KB constants that the planner depends on.
    private static final SubLSymbol $planner_core_constants$ = makeSymbol("*PLANNER-CORE-CONSTANTS*");



    // Internal Constants
    public static final SubLList $list0 = list(reader_make_constant_shell(makeString("preconditionFor-Props")), reader_make_constant_shell(makeString("effectOfAction-Props")), reader_make_constant_shell(makeString("effectOfActionIf-Props")));

    public static final SubLList $list1 = list(reader_make_constant_shell(makeString("methodForAction")), reader_make_constant_shell(makeString("sufficientFor-Props")), reader_make_constant_shell(makeString("preconditionForMethod")));

    public static final SubLList $list2 = list(reader_make_constant_shell(makeString("SimpleSituationPredicate")));

    public static final SubLSymbol $sym3$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    public static final SubLSymbol $shop$ = makeSymbol("*SHOP*");

    public static final SubLSymbol SHOP_PLANNER = makeSymbol("SHOP-PLANNER");

    public static final SubLList $list6 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MAKE-NEW-THREAD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MAKE-PROBLEM-FROM-MT"), list(makeSymbol("DOMAIN"), makeSymbol("MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MAKE-DOMAIN-FROM-MT"), list(makeSymbol("MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PROBLEM"), list(makeSymbol("NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DOMAIN"), list(makeSymbol("NAME")), makeKeyword("PUBLIC")));

    public static final SubLSymbol SHOP_PLAN_DISPLAYER_FACTORY = makeSymbol("SHOP-PLAN-DISPLAYER-FACTORY");



    public static final SubLList $list9 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("CREATE-PLAN-DISPLAYER"), list(makeSymbol("PLAN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("CREATE-TASK-DISPLAYER"), list(makeSymbol("TASK")), makeKeyword("PUBLIC")));



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_PLAN_DISPLAYER_FACTORY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-PLAN-DISPLAYER-FACTORY-CLASS");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_PLAN_DISPLAYER_FACTORY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-PLAN-DISPLAYER-FACTORY-INSTANCE");

    public static final SubLSymbol SHOP = makeSymbol("SHOP");

    public static final SubLList $list16 = list(makeSymbol("SHOP-PLANNER"));

    public static final SubLList $list17 = list(list(makeSymbol("DISPLAYER-FACTORY"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DOMAIN-TABLE"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("PROBLEM-TABLE"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("THREADS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP-THREADS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GATHER-INITIAL-STATE"), list(makeSymbol("MT")), makeKeyword("PUBLIC")));

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-CLASS");

    public static final SubLSymbol DISPLAYER_FACTORY = makeSymbol("DISPLAYER-FACTORY");

    public static final SubLSymbol DOMAIN_TABLE = makeSymbol("DOMAIN-TABLE");

    public static final SubLSymbol PROBLEM_TABLE = makeSymbol("PROBLEM-TABLE");

    public static final SubLSymbol THREADS = makeSymbol("THREADS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-INSTANCE");



    public static final SubLList $list25 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list26 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("DOMAIN-TABLE"), list(makeSymbol("MAKE-HASH-TABLE"), TEN_INTEGER)), list(makeSymbol("CSETQ"), makeSymbol("PROBLEM-TABLE"), list(makeSymbol("MAKE-HASH-TABLE"), TEN_INTEGER)), list(makeSymbol("CSETQ"), makeSymbol("DISPLAYER-FACTORY"), NIL), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym27$OUTER_CATCH_FOR_SHOP_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-METHOD");

    public static final SubLSymbol SHOP_INITIALIZE_METHOD = makeSymbol("SHOP-INITIALIZE-METHOD");



    public static final SubLList $list30 = list(makeSymbol("DOMAIN-NAME"));

    public static final SubLList $list31 = list(list(makeSymbol("RET"), list(makeSymbol("GETHASH"), makeSymbol("DOMAIN-NAME"), makeSymbol("DOMAIN-TABLE"))));

    public static final SubLSymbol $sym32$OUTER_CATCH_FOR_SHOP_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-METHOD");

    public static final SubLSymbol SHOP_GET_DOMAIN_METHOD = makeSymbol("SHOP-GET-DOMAIN-METHOD");

    public static final SubLSymbol GET_PROBLEM = makeSymbol("GET-PROBLEM");

    public static final SubLList $list35 = list(makeSymbol("PROBLEM-NAME"));

    public static final SubLList $list36 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PROB"), list(makeSymbol("GETHASH"), makeSymbol("PROBLEM-NAME"), makeSymbol("PROBLEM-TABLE")))), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("PROB")), list(makeSymbol("CERROR"), makeString("No planning problem of the name ~s"), makeSymbol("PROBLEM-NAME"))), list(makeSymbol("RET"), makeSymbol("PROB"))));

    public static final SubLSymbol $sym37$OUTER_CATCH_FOR_SHOP_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-METHOD");

    public static final SubLString $str38$No_planning_problem_of_the_name__ = makeString("No planning problem of the name ~s");

    public static final SubLSymbol SHOP_GET_PROBLEM_METHOD = makeSymbol("SHOP-GET-PROBLEM-METHOD");

    public static final SubLSymbol MAKE_NEW_THREAD = makeSymbol("MAKE-NEW-THREAD");

    public static final SubLList $list41 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-THREAD"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-BASIC-PLANNER-THREAD")), list(makeSymbol("QUOTE"), makeSymbol("SHOP-BASIC-PLANNER-THREAD"))))), list(makeSymbol("PWHEN"), list(makeSymbol(">="), list(makeSymbol("LIST-LENGTH"), makeSymbol("THREADS")), TWENTY_INTEGER), list(makeSymbol("CLEANUP-THREADS"), makeSymbol("SELF"))), list(makeSymbol("CPUSH"), makeSymbol("NEW-THREAD"), makeSymbol("THREADS")), list(makeSymbol("SET-SLOT"), makeSymbol("NEW-THREAD"), list(makeSymbol("QUOTE"), makeSymbol("PLANNER")), makeSymbol("SELF")), list(makeSymbol("RET"), makeSymbol("NEW-THREAD"))));

    public static final SubLSymbol $sym42$OUTER_CATCH_FOR_SHOP_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-METHOD");





    public static final SubLSymbol SHOP_MAKE_NEW_THREAD_METHOD = makeSymbol("SHOP-MAKE-NEW-THREAD-METHOD");

    public static final SubLSymbol MAKE_PROBLEM = makeSymbol("MAKE-PROBLEM");

    public static final SubLList $list47 = list(makeSymbol("PROBLEM-NAME"), makeSymbol("DOMAIN-NAME"), makeSymbol("STATE"), makeSymbol("TASKS"), makeSymbol("MT"));

    public static final SubLList $list48 = list(list(new SubLObject[]{ makeSymbol("CLET"), list(makeSymbol("DOMAIN"), makeSymbol("NEW-PROBLEM"), makeSymbol("NEW-STATEBODY")), list(makeSymbol("CSETQ"), makeSymbol("NEW-PROBLEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-BASIC-PROBLEM")), list(makeSymbol("QUOTE"), makeSymbol("SHOP-BASIC-PROBLEM")))), list(makeSymbol("CSETQ"), makeSymbol("NEW-STATEBODY"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-BASIC-WORLD-STATE")), list(makeSymbol("QUOTE"), makeSymbol("SHOP-BASIC-WORLD-STATE")))), list(makeSymbol("CSETQ"), makeSymbol("DOMAIN"), list(makeSymbol("GET-DOMAIN"), makeSymbol("SELF"), makeSymbol("DOMAIN-NAME"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("MAKE-STATEBODY"), makeSymbol("SHOP-BASIC-WORLD-STATE")), makeSymbol("NEW-STATEBODY"), makeSymbol("STATE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("INITIALIZE-PROBLEM"), makeSymbol("SHOP-BASIC-PROBLEM")), makeSymbol("NEW-PROBLEM"), makeSymbol("PROBLEM-NAME"), makeSymbol("DOMAIN"), makeSymbol("NEW-STATEBODY"), makeSymbol("TASKS"), makeSymbol("MT")), list(makeSymbol("CSETF"), list(makeSymbol("GETHASH"), makeSymbol("PROBLEM-NAME"), makeSymbol("PROBLEM-TABLE")), makeSymbol("NEW-PROBLEM")), list(makeSymbol("RET"), makeSymbol("NEW-PROBLEM")) }));

    public static final SubLSymbol $sym49$OUTER_CATCH_FOR_SHOP_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-METHOD");





    public static final SubLSymbol MAKE_STATEBODY = makeSymbol("MAKE-STATEBODY");

    public static final SubLSymbol SHOP_MAKE_PROBLEM_METHOD = makeSymbol("SHOP-MAKE-PROBLEM-METHOD");

    public static final SubLSymbol CLEANUP_THREADS = makeSymbol("CLEANUP-THREADS");

    public static final SubLList $list55 = list(list(makeSymbol("CSETQ"), makeSymbol("THREADS"), NIL), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol $sym56$OUTER_CATCH_FOR_SHOP_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-METHOD");

    public static final SubLSymbol SHOP_CLEANUP_THREADS_METHOD = makeSymbol("SHOP-CLEANUP-THREADS-METHOD");

    public static final SubLSymbol GATHER_INITIAL_STATE = makeSymbol("GATHER-INITIAL-STATE");

    public static final SubLList $list59 = list(makeKeyword("PRIVATE"));

    public static final SubLList $list60 = list(makeSymbol("MT"));

    public static final SubLList $list61 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INIT-MTS"), NIL)), list(makeSymbol("DO-ALL-GENL-MTS"), list(makeSymbol("GENL-MT"), makeSymbol("MT")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("MEMBER?"), makeSymbol("GENL-MT"), makeSymbol("INIT-MTS"))), list(makeSymbol("ISA?"), makeSymbol("GENL-MT"), reader_make_constant_shell(makeString("PlanDynamicSituationMicrotheory")))), list(makeSymbol("CPUSH"), makeSymbol("GENL-MT"), makeSymbol("INIT-MTS")))), list(makeSymbol("RET"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("ASSERTION-HL-FORMULA")), list(makeSymbol("APPLY"), list(makeSymbol("QUOTE"), makeSymbol("APPEND")), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("GATHER-MT-INDEX")), makeSymbol("INIT-MTS")))))));











    public static final SubLString $str67$_A_is_not_a__A = makeString("~A is not a ~A");





    public static final SubLString $$$continue_anyway = makeString("continue anyway");



    public static final SubLString $str72$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    private static final SubLObject $$PlanDynamicSituationMicrotheory = reader_make_constant_shell(makeString("PlanDynamicSituationMicrotheory"));

    private static final SubLString $str75$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str76$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str77$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol ASSERTION_HL_FORMULA = makeSymbol("ASSERTION-HL-FORMULA");



    private static final SubLSymbol GATHER_MT_INDEX = makeSymbol("GATHER-MT-INDEX");

    private static final SubLSymbol SHOP_GATHER_INITIAL_STATE_METHOD = makeSymbol("SHOP-GATHER-INITIAL-STATE-METHOD");

    private static final SubLSymbol MAKE_PROBLEM_FROM_MT = makeSymbol("MAKE-PROBLEM-FROM-MT");

    public static final SubLList $list83 = list(makeSymbol("DOMAIN-SYMBOL"), makeSymbol("MT"));

    private static final SubLList $list84 = list(makeString("Creates a planning problem object for the planner from \n   the information in PROBLEM-MT, that has planning domain \n   DOMAIN-NAME."), list(makeSymbol("CLET"), list(makeSymbol("CYC-TASKS"), list(makeSymbol("PROBLEM-NAME"), makeSymbol("MT")), list(makeSymbol("INITIAL-STATE"), list(makeSymbol("GATHER-INITIAL-STATE"), makeSymbol("SELF"), makeSymbol("MT"))), makeSymbol("NEW-PROBLEM")), list(makeSymbol("CSETQ"), makeSymbol("CYC-TASKS"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("ASSERTION-HL-FORMULA")), list(makeSymbol("GATHER-MT-INDEX"), makeSymbol("MT")))), list(makeSymbol("PUNLESS"), makeSymbol("CYC-TASKS"), list(makeSymbol("CERROR"), makeString("STOP"), makeString("Microtheory ~s is empty"), makeSymbol("MT")), list(makeSymbol("RET"), NIL)), list(makeSymbol("CSETQ"), makeSymbol("NEW-PROBLEM"), list(makeSymbol("MAKE-PROBLEM"), makeSymbol("SELF"), makeSymbol("PROBLEM-NAME"), makeSymbol("DOMAIN-SYMBOL"), makeSymbol("INITIAL-STATE"), makeSymbol("CYC-TASKS"), makeSymbol("MT"))), list(makeSymbol("RET"), makeSymbol("NEW-PROBLEM"))));

    private static final SubLString $$$STOP = makeString("STOP");

    private static final SubLString $str86$Microtheory__s_is_empty = makeString("Microtheory ~s is empty");

    private static final SubLSymbol SHOP_MAKE_PROBLEM_FROM_MT_METHOD = makeSymbol("SHOP-MAKE-PROBLEM-FROM-MT-METHOD");

    private static final SubLSymbol MAKE_DOMAIN_FROM_MT = makeSymbol("MAKE-DOMAIN-FROM-MT");

    public static final SubLList $list89 = list(makeSymbol("DOMAIN-MT"));

    private static final SubLList $list90 = list(makeString("Creates a planning domain structure for the planner from \n   the information in DOMAIN-MT.\n   @param DOMAIN-MT hlmt-p\n   @return shop-domain-p"), list(makeSymbol("CLET"), list(list(makeSymbol("DOMAIN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-CYC-DOMAIN")), list(makeSymbol("QUOTE"), makeSymbol("SHOP-CYC-DOMAIN"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("PROCESS-PLAN-ASSERTIONS"), makeSymbol("SHOP-CYC-DOMAIN")), makeSymbol("DOMAIN"), makeSymbol("DOMAIN-MT")), list(makeSymbol("CSETF"), list(makeSymbol("GETHASH"), makeSymbol("DOMAIN-MT"), makeSymbol("DOMAIN-TABLE")), makeSymbol("DOMAIN")), list(makeSymbol("RET"), makeSymbol("DOMAIN"))));

    private static final SubLSymbol $sym91$OUTER_CATCH_FOR_SHOP_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-METHOD");



    private static final SubLSymbol SHOP_MAKE_DOMAIN_FROM_MT_METHOD = makeSymbol("SHOP-MAKE-DOMAIN-FROM-MT-METHOD");



    private static final SubLSymbol $sym95$DO_FI_ASKS_ = makeSymbol("DO-FI-ASKS?");





    private static final SubLObject $$preconditionForMethod = reader_make_constant_shell(makeString("preconditionForMethod"));

    private static final SubLObject $$methodForAction = reader_make_constant_shell(makeString("methodForAction"));

    private static final SubLObject $$preconditionFor_Props = reader_make_constant_shell(makeString("preconditionFor-Props"));

    private static final SubLObject $$effectOfAction_Props = reader_make_constant_shell(makeString("effectOfAction-Props"));

    private static final SubLObject $$sufficientFor_Props = reader_make_constant_shell(makeString("sufficientFor-Props"));

    private static final SubLObject $$effectOfActionIf_Props = reader_make_constant_shell(makeString("effectOfActionIf-Props"));

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

    public static SubLObject initialize_planner_kb_feature() {
        if (NIL != list_utilities.every_in_list($sym3$VALID_CONSTANT_, $planner_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_planner_kb_loaded();
        } else {
            kb_control_vars.unset_planner_kb_loaded();
        }
        return kb_control_vars.planner_kb_loaded_p();
    }

    public static SubLObject shop_planner_p(final SubLObject shop_planner) {
        return interfaces.subloop_instanceof_interface(shop_planner, SHOP_PLANNER);
    }

    public static SubLObject subloop_reserved_initialize_shop_plan_displayer_factory_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_plan_displayer_factory_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        return NIL;
    }

    public static SubLObject shop_plan_displayer_factory_p(final SubLObject shop_plan_displayer_factory) {
        return classes.subloop_instanceof_class(shop_plan_displayer_factory, SHOP_PLAN_DISPLAYER_FACTORY);
    }

    public static SubLObject get_shop_threads(final SubLObject shop) {
        return classes.subloop_get_instance_slot(shop, FOUR_INTEGER);
    }

    public static SubLObject set_shop_threads(final SubLObject shop, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop, value, FOUR_INTEGER);
    }

    public static SubLObject get_shop_problem_table(final SubLObject shop) {
        return classes.subloop_get_instance_slot(shop, THREE_INTEGER);
    }

    public static SubLObject set_shop_problem_table(final SubLObject shop, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop, value, THREE_INTEGER);
    }

    public static SubLObject get_shop_domain_table(final SubLObject shop) {
        return classes.subloop_get_instance_slot(shop, TWO_INTEGER);
    }

    public static SubLObject set_shop_domain_table(final SubLObject shop, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop, value, TWO_INTEGER);
    }

    public static SubLObject get_shop_displayer_factory(final SubLObject shop) {
        return classes.subloop_get_instance_slot(shop, ONE_INTEGER);
    }

    public static SubLObject set_shop_displayer_factory(final SubLObject shop, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop, value, ONE_INTEGER);
    }

    public static SubLObject subloop_reserved_initialize_shop_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
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

    public static SubLObject shop_p(final SubLObject shop) {
        return classes.subloop_instanceof_class(shop, SHOP);
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

    public static SubLObject shop_find_plans_int(final SubLObject task, final SubLObject mt, final SubLObject verbose, final SubLObject number, final SubLObject time, final SubLObject depth, final SubLObject backchain) {
        if (NIL == $shop$.getGlobalValue()) {
            $shop$.setGlobalValue(object.object_new_method(SHOP));
        }
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        final SubLObject planner_thread = shop_make_new_thread_method($shop$.getGlobalValue());
        if (NIL != backchain) {
            instances.set_slot(planner_thread, $sym95$DO_FI_ASKS_, T);
            instances.set_slot(planner_thread, NUM_BACKCHAINS, backchain);
        }
        shop_make_domain_from_mt_method($shop$.getGlobalValue(), mt);
        shop_basic_planner_thread.shop_basic_planner_thread_find_plans_method(planner_thread, task, mt, $ALL, verbose, number, time, depth);
        return shop_basic_planner_thread.shop_basic_planner_thread_cycl_plans_method(planner_thread);
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

    public static SubLObject shop_plan_p(final SubLObject v_object) {
        return shop_basic_plan.shop_basic_plan_p(v_object);
    }

    public static SubLObject shop_plan_simple_actions(final SubLObject plan) {
        SubLSystemTrampolineFile.enforceType(plan, SHOP_PLAN_P);
        assert NIL != shop_plan_p(plan) : "shop_main.shop_plan_p(plan) " + "CommonSymbols.NIL != shop_main.shop_plan_p(plan) " + plan;
        return methods.funcall_instance_method_with_0_args(plan, PRIMITIVE_FORM);
    }

    public static SubLObject shop_plan_goal(final SubLObject plan) {
        SubLSystemTrampolineFile.enforceType(plan, SHOP_PLAN_P);
        assert NIL != shop_plan_p(plan) : "shop_main.shop_plan_p(plan) " + "CommonSymbols.NIL != shop_main.shop_plan_p(plan) " + plan;
        final SubLObject var_manager = instances.get_slot(plan, VARIABLE_MANAGER);
        final SubLObject task_struc = methods.funcall_instance_method_with_0_args(plan, GOAL_TASK);
        final SubLObject task_pl_form = methods.funcall_instance_method_with_0_args(task_struc, FORMULA);
        final SubLObject task_el_form = methods.funcall_instance_method_with_1_args(var_manager, RECOVER_EL, task_pl_form);
        return task_el_form;
    }

    public static SubLObject declare_shop_main_file() {
        declareFunction(me, "initialize_planner_kb_feature", "INITIALIZE-PLANNER-KB-FEATURE", 0, 0, false);
        declareFunction(me, "shop_planner_p", "SHOP-PLANNER-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_plan_displayer_factory_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-PLAN-DISPLAYER-FACTORY-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_plan_displayer_factory_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-PLAN-DISPLAYER-FACTORY-INSTANCE", 1, 0, false);
        declareFunction(me, "shop_plan_displayer_factory_p", "SHOP-PLAN-DISPLAYER-FACTORY-P", 1, 0, false);
        declareFunction(me, "get_shop_threads", "GET-SHOP-THREADS", 1, 0, false);
        declareFunction(me, "set_shop_threads", "SET-SHOP-THREADS", 2, 0, false);
        declareFunction(me, "get_shop_problem_table", "GET-SHOP-PROBLEM-TABLE", 1, 0, false);
        declareFunction(me, "set_shop_problem_table", "SET-SHOP-PROBLEM-TABLE", 2, 0, false);
        declareFunction(me, "get_shop_domain_table", "GET-SHOP-DOMAIN-TABLE", 1, 0, false);
        declareFunction(me, "set_shop_domain_table", "SET-SHOP-DOMAIN-TABLE", 2, 0, false);
        declareFunction(me, "get_shop_displayer_factory", "GET-SHOP-DISPLAYER-FACTORY", 1, 0, false);
        declareFunction(me, "set_shop_displayer_factory", "SET-SHOP-DISPLAYER-FACTORY", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-INSTANCE", 1, 0, false);
        declareFunction(me, "shop_p", "SHOP-P", 1, 0, false);
        declareFunction(me, "shop_initialize_method", "SHOP-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "shop_get_domain_method", "SHOP-GET-DOMAIN-METHOD", 2, 0, false);
        declareFunction(me, "shop_get_problem_method", "SHOP-GET-PROBLEM-METHOD", 2, 0, false);
        declareFunction(me, "shop_make_new_thread_method", "SHOP-MAKE-NEW-THREAD-METHOD", 1, 0, false);
        declareFunction(me, "shop_make_problem_method", "SHOP-MAKE-PROBLEM-METHOD", 6, 0, false);
        declareFunction(me, "shop_cleanup_threads_method", "SHOP-CLEANUP-THREADS-METHOD", 1, 0, false);
        declareFunction(me, "shop_gather_initial_state_method", "SHOP-GATHER-INITIAL-STATE-METHOD", 2, 0, false);
        declareFunction(me, "shop_make_problem_from_mt_method", "SHOP-MAKE-PROBLEM-FROM-MT-METHOD", 3, 0, false);
        declareFunction(me, "shop_make_domain_from_mt_method", "SHOP-MAKE-DOMAIN-FROM-MT-METHOD", 2, 0, false);
        declareFunction(me, "shop_find_plans_int", "SHOP-FIND-PLANS-INT", 7, 0, false);
        declareFunction(me, "shop_planning_assertionP", "SHOP-PLANNING-ASSERTION?", 1, 0, false);
        declareFunction(me, "shop_find_plans", "SHOP-FIND-PLANS", 2, 5, false);
        declareFunction(me, "shop_plan_p", "SHOP-PLAN-P", 1, 0, false);
        declareFunction(me, "shop_plan_simple_actions", "SHOP-PLAN-SIMPLE-ACTIONS", 1, 0, false);
        declareFunction(me, "shop_plan_goal", "SHOP-PLAN-GOAL", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_shop_main_file() {
        deflexical("*NEW-METHOD-PRED*", NIL);
        deflexical("*SHOP-SIMPLE-ACTION-DEFINITION-PREDICATES*", $list0);
        deflexical("*SHOP-COMPLEX-ACTION-DEFINITION-PREDICATES*", $list1);
        deflexical("*SHOP-DOMAIN-DEFINITION-PREDICATES*", union($shop_simple_action_definition_predicates$.getGlobalValue(), $shop_complex_action_definition_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
        deflexical("*SHOP-DOMAIN-DEFINITION-COLLECTIONS*", $list2);
        deflexical("*PLANNER-CORE-CONSTANTS*", append($shop_domain_definition_predicates$.getGlobalValue(), $shop_domain_definition_collections$.getGlobalValue()));
        deflexical("*SHOP*", SubLSystemTrampolineFile.maybeDefault($shop$, $shop$, NIL));
        return NIL;
    }

    public static SubLObject setup_shop_main_file() {
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

    
}

/**
 * Total time: 582 ms
 */
