package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.list_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class shop_basic_plan extends SubLTranslatedFile {
    public static final SubLFile me = new shop_basic_plan();

    public static final String myName = "com.cyc.cycjava.cycl.shop_basic_plan";

    public static final String myFingerPrint = "77d46e7f84ed2708593f8d6de523d56059434f7a870b5adde08744edcf4bcc20";

    // Internal Constants
    public static final SubLSymbol SHOP_TASK = makeSymbol("SHOP-TASK");

    public static final SubLList $list1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FORMULA"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MBINDINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INIT"), list(makeSymbol("TASK"), makeSymbol("BINDING"), makeSymbol("PRECOND"), makeSymbol("TASK-STRUC")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PLANNER-RULE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRIMITIVE?"), NIL, makeKeyword("PUBLIC")));

    public static final SubLSymbol SHOP_BASIC_TASK = makeSymbol("SHOP-BASIC-TASK");

    public static final SubLSymbol SHOP_INDEXED_OBJECT = makeSymbol("SHOP-INDEXED-OBJECT");

    public static final SubLList $list4 = list(makeSymbol("SHOP-TASK"));

    public static final SubLList $list5 = list(list(makeSymbol("FORMULA"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("BINDINGS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("PRECOND"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("TASK-STRUC"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("STATUS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")));







    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_TASK_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-TASK-CLASS");















    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_TASK_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-TASK-INSTANCE");

    public static final SubLSymbol STRIP_TASK = makeSymbol("STRIP-TASK");

    public static final SubLList $list19 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-TASK"), makeSymbol("SELF"))), list(makeSymbol("SET-SLOT"), makeSymbol("NEW-TASK"), list(makeSymbol("QUOTE"), makeSymbol("FORMULA")), list(makeSymbol("SECOND"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("FORMULA"))))), list(makeSymbol("RET"), makeSymbol("NEW-TASK"))));

    public static final SubLSymbol $sym20$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD");

    public static final SubLSymbol SHOP_BASIC_TASK_STRIP_TASK_METHOD = makeSymbol("SHOP-BASIC-TASK-STRIP-TASK-METHOD");



    public static final SubLList $list23 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list24 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    public static final SubLList $list25 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PIF"), list(makeSymbol("INSTANCE-P"), makeSymbol("SELF")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<Task-~S:~S>"), makeSymbol("INSTANCE-NUMBER"), makeSymbol("FORMULA")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<Malformed Instance>"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym26$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD");

    public static final SubLString $str27$__Task__S__S_ = makeString("#<Task-~S:~S>");

    public static final SubLString $str28$__Malformed_Instance_ = makeString("#<Malformed Instance>");

    public static final SubLSymbol SHOP_BASIC_TASK_PRINT_METHOD = makeSymbol("SHOP-BASIC-TASK-PRINT-METHOD");



    public static final SubLList $list31 = list(makeSymbol("NEW-TASK"), makeSymbol("NEW-BINDING"), makeSymbol("NEW-PRECOND"), makeSymbol("NEW-TASK-STRUC"));

    public static final SubLList $list32 = list(makeString("@param TASK hl-formula-p\n   @param BINDING multibinding-p\n   @param PRECOND listp\n   @param TASK-STRUC shop-planner-rule-p\n   @return shop-html-task-p"), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("FIRST"), makeSymbol("NEW-TASK")), makeKeyword("PRIMITIVE")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("FORMULA"), list(makeSymbol("SECOND"), makeSymbol("NEW-TASK"))), list(makeSymbol("CSETQ"), makeSymbol("STATUS"), makeKeyword("PRIMITIVE"))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("FORMULA"), makeSymbol("NEW-TASK")), list(makeSymbol("CSETQ"), makeSymbol("STATUS"), makeKeyword("COMPLEX")))), list(makeSymbol("CSETQ"), makeSymbol("BINDINGS"), makeSymbol("NEW-BINDING")), list(makeSymbol("CSETQ"), makeSymbol("PRECOND"), makeSymbol("NEW-PRECOND")), list(makeSymbol("CSETQ"), makeSymbol("TASK-STRUC"), makeSymbol("NEW-TASK-STRUC")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym33$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD");





    public static final SubLSymbol SHOP_BASIC_TASK_INIT_METHOD = makeSymbol("SHOP-BASIC-TASK-INIT-METHOD");



    public static final SubLList $list38 = list(makeString("@return shop-planner-rule-p"), list(makeSymbol("RET"), makeSymbol("TASK-STRUC")));

    public static final SubLSymbol $sym39$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD");

    public static final SubLSymbol SHOP_BASIC_TASK_PLANNER_RULE_METHOD = makeSymbol("SHOP-BASIC-TASK-PLANNER-RULE-METHOD");

    public static final SubLList $list41 = list(list(makeSymbol("RET"), makeSymbol("FORMULA")));

    public static final SubLSymbol $sym42$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD");

    public static final SubLSymbol SHOP_BASIC_TASK_FORMULA_METHOD = makeSymbol("SHOP-BASIC-TASK-FORMULA-METHOD");



    public static final SubLList $list45 = list(list(makeSymbol("RET"), makeSymbol("PRECOND")));

    public static final SubLSymbol $sym46$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD");

    public static final SubLSymbol SHOP_BASIC_TASK_PRECONDITION_METHOD = makeSymbol("SHOP-BASIC-TASK-PRECONDITION-METHOD");

    public static final SubLSymbol $sym48$PRIMITIVE_ = makeSymbol("PRIMITIVE?");

    public static final SubLList $list49 = list(list(makeSymbol("RET"), list(EQ, makeSymbol("STATUS"), makeKeyword("PRIMITIVE"))));

    public static final SubLSymbol $sym50$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD");

    public static final SubLSymbol $sym51$SHOP_BASIC_TASK_PRIMITIVE__METHOD = makeSymbol("SHOP-BASIC-TASK-PRIMITIVE?-METHOD");



    public static final SubLList $list53 = list(list(makeSymbol("RET"), makeSymbol("BINDINGS")));

    public static final SubLSymbol $sym54$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD");

    public static final SubLSymbol SHOP_BASIC_TASK_MBINDINGS_METHOD = makeSymbol("SHOP-BASIC-TASK-MBINDINGS-METHOD");

    public static final SubLSymbol SHOP_PLAN_I = makeSymbol("SHOP-PLAN-I");

    public static final SubLList $list57 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POST-ORDERING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRIMITIVE-FORM"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GROUND-FORMS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GOAL-TASK"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POPULATE-PLAN"), list(makeSymbol("PLAN-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GATHER-PLANNER-RULES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GATHER-PRECONDITIONS"), NIL, makeKeyword("PUBLIC")));

    public static final SubLSymbol SHOP_BASIC_PLAN = makeSymbol("SHOP-BASIC-PLAN");

    public static final SubLList $list59 = list(makeSymbol("SHOP-PLAN-I"));

    public static final SubLList $list60 = list(new SubLObject[]{ list(makeSymbol("PRE-ORDERING"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("POST-ORDERING"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("TASK-STRUCS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("BINDINGS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("SIMPLE-BINDING-LIST"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("TOTAL-COST"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("OPEN-VARIABLES"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("VARIABLE-MANAGER"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VARIABLE-MANAGER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NON-PRIMITIVE-PRE-ORDERING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SINGLE-AGENT-PLAN?"), NIL, makeKeyword("PUBLIC")) });

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-CLASS");







    public static final SubLSymbol SIMPLE_BINDING_LIST = makeSymbol("SIMPLE-BINDING-LIST");

    public static final SubLSymbol TOTAL_COST = makeSymbol("TOTAL-COST");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-INSTANCE");

    public static final SubLSymbol POPULATE_PLAN = makeSymbol("POPULATE-PLAN");

    public static final SubLList $list71 = list(makeSymbol("PLAN-STATE"));

    public static final SubLList $list72 = list(makeString("@param PLAN-STATE shop-basic-plan-state-p"), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("TASK-PRE-ORDERING"), list(makeSymbol("GET-SHOP-BASIC-PLAN-STATE-PARTIAL-PLAN"), makeSymbol("PLAN-STATE"))), list(makeSymbol("TASK-POST-ORDERING"), list(makeSymbol("REVERSE"), list(makeSymbol("GET-SHOP-BASIC-PLAN-STATE-POST-ORDERING"), makeSymbol("PLAN-STATE")))), list(makeSymbol("TASK-BINDINGS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("MBINDING"), makeSymbol("SHOP-BASIC-PLAN-STATE")), makeSymbol("PLAN-STATE"))), list(makeSymbol("SIMPLE-BINDINGS"), list(makeSymbol("MBIND-SIMPLE-BINDING-LIST"), makeSymbol("TASK-BINDINGS"))), list(makeSymbol("TASK-STRUCS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("TASK-STRUCS"), makeSymbol("SHOP-BASIC-PLAN-STATE")), makeSymbol("PLAN-STATE"))), list(makeSymbol("PRECONDS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SUPPORT-LISTS"), makeSymbol("SHOP-BASIC-PLAN-STATE")), makeSymbol("PLAN-STATE"))), list(makeSymbol("TASK-LIST"), NIL), list(makeSymbol("TASK-ASSOC"), list(makeSymbol("MAKE-HASH-TABLE"), makeInteger(50), list(makeSymbol("FUNCTION"), EQ)))), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("NEW-TASK-PRE-ORDERING"), makeSymbol("NEW-OPEN-VARIABLES")), list(makeSymbol("SHOP-PROCESS-OPEN-VARIABLES"), makeSymbol("TASK-PRE-ORDERING"), makeSymbol("TASK-BINDINGS")), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("NEW-TASK-POST-ORDERING"), makeSymbol("NEW-OPEN-VARIABLES")), list(makeSymbol("SHOP-PROCESS-OPEN-VARIABLES"), makeSymbol("TASK-POST-ORDERING"), makeSymbol("TASK-BINDINGS"), makeSymbol("NEW-OPEN-VARIABLES")), list(makeSymbol("CSETQ"), makeSymbol("TASK-PRE-ORDERING"), makeSymbol("NEW-TASK-PRE-ORDERING")), list(makeSymbol("CSETQ"), makeSymbol("TASK-POST-ORDERING"), makeSymbol("NEW-TASK-POST-ORDERING")), list(makeSymbol("CSETQ"), makeSymbol("OPEN-VARIABLES"), makeSymbol("NEW-OPEN-VARIABLES")))), list(makeSymbol("CDOLIST-MULTIPLE"), list(list(makeSymbol("TASK"), makeSymbol("TASK-PRE-ORDERING")), list(makeSymbol("PRECOND"), makeSymbol("PRECONDS")), list(makeSymbol("TASK-STRUC"), makeSymbol("TASK-STRUCS"))), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-TASK-OBJ"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-BASIC-TASK")), list(makeSymbol("QUOTE"), makeSymbol("SHOP-BASIC-TASK"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("INIT"), makeSymbol("SHOP-BASIC-TASK")), makeSymbol("NEW-TASK-OBJ"), makeSymbol("TASK"), makeSymbol("TASK-BINDINGS"), makeSymbol("PRECOND"), makeSymbol("TASK-STRUC")), list(makeSymbol("CSETF"), list(makeSymbol("GETHASH"), makeSymbol("TASK"), makeSymbol("TASK-ASSOC")), makeSymbol("NEW-TASK-OBJ")), list(makeSymbol("CPUSH"), makeSymbol("NEW-TASK-OBJ"), makeSymbol("TASK-LIST")))), list(makeSymbol("CSETQ"), makeSymbol("PRE-ORDERING"), list(makeSymbol("REVERSE"), makeSymbol("TASK-LIST"))), list(makeSymbol("CSETQ"), makeSymbol("TASK-LIST"), NIL), list(makeSymbol("CDOLIST"), list(makeSymbol("TASK"), makeSymbol("TASK-POST-ORDERING")), list(makeSymbol("CLET"), list(list(makeSymbol("TASK-ENTRY"), list(makeSymbol("GETHASH"), makeSymbol("TASK"), makeSymbol("TASK-ASSOC")))), list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("TASK-ENTRY")), list(makeSymbol("WARN"), makeString("tried to add null entry to task-list from task ~a"), makeSymbol("TASK")), list(makeSymbol("CPUSH"), makeSymbol("TASK-ENTRY"), makeSymbol("TASK-LIST"))))), list(makeSymbol("CSETQ"), makeSymbol("TASK-STRUCS"), list(makeSymbol("GET-SHOP-BASIC-PLAN-STATE-TASK-STRUCS"), makeSymbol("PLAN-STATE"))), list(makeSymbol("CSETQ"), makeSymbol("POST-ORDERING"), list(makeSymbol("REVERSE"), makeSymbol("TASK-LIST"))), list(makeSymbol("CSETQ"), makeSymbol("BINDINGS"), makeSymbol("TASK-BINDINGS")), list(makeSymbol("CSETQ"), makeSymbol("SIMPLE-BINDING-LIST"), makeSymbol("SIMPLE-BINDINGS")), list(makeSymbol("CSETQ"), makeSymbol("VARIABLE-MANAGER"), list(makeSymbol("GET-SLOT"), list(makeSymbol("GET-SHOP-BASIC-PLAN-STATE-PLANNER"), makeSymbol("PLAN-STATE")), list(makeSymbol("QUOTE"), makeSymbol("VAR-MANAGER")))), list(makeSymbol("CSETQ"), makeSymbol("TOTAL-COST"), list(makeSymbol("LIST-LENGTH"), makeSymbol("TASK-PRE-ORDERING"))), list(makeSymbol("RET"), NIL) }));

    public static final SubLSymbol $sym73$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");

    private static final SubLInteger $int$50 = makeInteger(50);

    public static final SubLString $str75$tried_to_add_null_entry_to_task_l = makeString("tried to add null entry to task-list from task ~a");



    public static final SubLSymbol SHOP_BASIC_PLAN_POPULATE_PLAN_METHOD = makeSymbol("SHOP-BASIC-PLAN-POPULATE-PLAN-METHOD");

    public static final SubLSymbol GROUND_FORMS = makeSymbol("GROUND-FORMS");

    public static final SubLList $list79 = list(makeString("@param listp ;; singleton list containing the plan\'s simple actions, if there are no multibound variables.\n              ;; o/w, the list of plans produced when the multibinding is expanded."), list(makeSymbol("CLET"), list(list(makeSymbol("PRIMITIVE-FORM"), list(makeSymbol("PRIMITIVE-FORM"), makeSymbol("SELF")))), list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("OPEN-VARIABLES")), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("PRIMITIVE-FORM"))), list(makeSymbol("PROGN"), list(makeSymbol("RET"), list(makeSymbol("APPLY-MULTIBINDING"), makeSymbol("PRIMITIVE-FORM"), makeSymbol("BINDINGS")))))));

    public static final SubLSymbol $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_GROUND_FORMS_METHOD = makeSymbol("SHOP-BASIC-PLAN-GROUND-FORMS-METHOD");



    public static final SubLList $list83 = list(makeString("@return listp ;;The plan's simple actions only, in sequence."), list(makeSymbol("CLET"), list(list(makeSymbol("PRIMITIVE-TASKS"), list(makeSymbol("PPO-TREE-LEAVES"), list(makeSymbol("REVERSE"), makeSymbol("PRE-ORDERING")), makeSymbol("POST-ORDERING"), list(makeSymbol("FUNCTION"), EQ))), list(makeSymbol("PRIMITIVE-FORMS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-TASK"), makeSymbol("PRIMITIVE-TASKS")), list(makeSymbol("CPUSH"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("FORMULA"), makeSymbol("SHOP-BASIC-TASK")), makeSymbol("CUR-TASK")), makeSymbol("PRIMITIVE-FORMS"))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), makeSymbol("PRIMITIVE-FORMS")))));

    public static final SubLSymbol $sym84$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_PRIMITIVE_FORM_METHOD = makeSymbol("SHOP-BASIC-PLAN-PRIMITIVE-FORM-METHOD");

    public static final SubLSymbol NON_PRIMITIVE_PRE_ORDERING = makeSymbol("NON-PRIMITIVE-PRE-ORDERING");

    public static final SubLList $list87 = list(makeString("@return listp ;; the pre-order of complex tasks in the plan."), list(makeSymbol("CLET"), list(list(makeSymbol("NON-PRIMITIVE-LIST"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-TASK"), makeSymbol("PRE-ORDERING")), list(makeSymbol("PUNLESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("PRIMITIVE?"), makeSymbol("SHOP-BASIC-TASK")), makeSymbol("CUR-TASK")), list(makeSymbol("CPUSH"), makeSymbol("CUR-TASK"), makeSymbol("NON-PRIMITIVE-LIST")))), list(makeSymbol("RET"), makeSymbol("NON-PRIMITIVE-LIST"))));

    public static final SubLSymbol $sym88$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_NON_PRIMITIVE_PRE_ORDERING_METHOD = makeSymbol("SHOP-BASIC-PLAN-NON-PRIMITIVE-PRE-ORDERING-METHOD");

    public static final SubLSymbol GOAL_TASK = makeSymbol("GOAL-TASK");

    public static final SubLList $list91 = list(makeString("@return hl-formula-p ;; the goal for which SELF is a plan."), list(makeSymbol("RET"), list(makeSymbol("LAST-ONE"), makeSymbol("PRE-ORDERING"))));

    public static final SubLSymbol $sym92$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_GOAL_TASK_METHOD = makeSymbol("SHOP-BASIC-PLAN-GOAL-TASK-METHOD");

    public static final SubLList $list94 = list(list(makeSymbol("RET"), makeSymbol("POST-ORDERING")));

    public static final SubLSymbol $sym95$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_POST_ORDERING_METHOD = makeSymbol("SHOP-BASIC-PLAN-POST-ORDERING-METHOD");



    public static final SubLList $list98 = list(list(makeSymbol("RET"), makeSymbol("TOTAL-COST")));

    public static final SubLSymbol $sym99$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_COST_METHOD = makeSymbol("SHOP-BASIC-PLAN-COST-METHOD");

    public static final SubLList $list101 = list(list(makeSymbol("RET"), makeSymbol("VARIABLE-MANAGER")));

    public static final SubLSymbol $sym102$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_VARIABLE_MANAGER_METHOD = makeSymbol("SHOP-BASIC-PLAN-VARIABLE-MANAGER-METHOD");



    public static final SubLSymbol $sym105$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_MBINDING_METHOD = makeSymbol("SHOP-BASIC-PLAN-MBINDING-METHOD");

    public static final SubLSymbol GATHER_PLANNER_RULES = makeSymbol("GATHER-PLANNER-RULES");

    public static final SubLList $list108 = list(makeString("@return lisp ;; of shop-planner-rule-p ;; the planner rules used to derive the plan."), list(makeSymbol("CLET"), list(list(makeSymbol("PLANNER-RULES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-ITEM"), makeSymbol("PRE-ORDERING")), list(makeSymbol("CPUSH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CUR-ITEM"), list(makeSymbol("QUOTE"), makeSymbol("PLANNER-RULE"))), makeSymbol("PLANNER-RULES"))), list(makeSymbol("RET"), makeSymbol("PLANNER-RULES"))));

    public static final SubLSymbol $sym109$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_GATHER_PLANNER_RULES_METHOD = makeSymbol("SHOP-BASIC-PLAN-GATHER-PLANNER-RULES-METHOD");

    public static final SubLSymbol GATHER_PRECONDITIONS = makeSymbol("GATHER-PRECONDITIONS");

    public static final SubLList $list112 = list(makeString("@return lisp"), list(makeSymbol("CLET"), list(list(makeSymbol("PLANNER-RULES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-ITEM"), makeSymbol("PRE-ORDERING")), list(makeSymbol("CPUSH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CUR-ITEM"), list(makeSymbol("QUOTE"), makeSymbol("PRECONDITION"))), makeSymbol("PLANNER-RULES"))), list(makeSymbol("RET"), makeSymbol("PLANNER-RULES"))));

    public static final SubLSymbol $sym113$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");

    public static final SubLSymbol SHOP_BASIC_PLAN_GATHER_PRECONDITIONS_METHOD = makeSymbol("SHOP-BASIC-PLAN-GATHER-PRECONDITIONS-METHOD");

    public static final SubLSymbol $sym115$SINGLE_AGENT_PLAN_ = makeSymbol("SINGLE-AGENT-PLAN?");

    public static final SubLList $list116 = list(makeString("@return booleanp ;; t if the only one agent executes every step in the plan.\n   Note: for now we assume the agent is always the first argument of each action sentence."), list(makeSymbol("CLET"), list(list(makeSymbol("FIRST-AGENT"), list(makeSymbol("FORMULA-ARG1"), list(makeSymbol("SUBLIS"), makeSymbol("SIMPLE-BINDING-LIST"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), list(makeSymbol("FIRST"), makeSymbol("PRE-ORDERING")), list(makeSymbol("QUOTE"), makeSymbol("FORMULA"))))))), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-TASK"), list(makeSymbol("REST"), makeSymbol("PRE-ORDERING"))), list(makeSymbol("PUNLESS"), list(EQUAL, makeSymbol("FIRST-AGENT"), list(makeSymbol("FORMULA-ARG1"), list(makeSymbol("SUBLIS"), makeSymbol("SIMPLE-BINDING-LIST"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CUR-TASK"), list(makeSymbol("QUOTE"), makeSymbol("FORMULA")))))), list(makeSymbol("RET"), NIL))), list(makeSymbol("RET"), T)));

    public static final SubLSymbol $sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD");

    public static final SubLSymbol $sym118$SHOP_BASIC_PLAN_SINGLE_AGENT_PLAN__METHOD = makeSymbol("SHOP-BASIC-PLAN-SINGLE-AGENT-PLAN?-METHOD");

    public static final SubLSymbol SHOP_VARIABLEP = makeSymbol("SHOP-VARIABLEP");

    public static final SubLList $list120 = list(list(makeSymbol("ITEM"), makeSymbol("DEPTH"), makeSymbol("PRE"), makeSymbol("POST"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(makeSymbol("FUNCTION"), EQ))), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym121$CUR_PRE = makeUninternedSymbol("CUR-PRE");

    public static final SubLSymbol $sym122$NEXT = makeUninternedSymbol("NEXT");

    public static final SubLSymbol $sym123$STACK = makeUninternedSymbol("STACK");



    public static final SubLList $list125 = list(NIL);

    public static final SubLList $list126 = list(ZERO_INTEGER);

















    public static final SubLSymbol $sym135$PPO_TREE_DESCENDANT_ = makeSymbol("PPO-TREE-DESCENDANT?");











    public static SubLObject shop_task_p(final SubLObject shop_task) {
        return interfaces.subloop_instanceof_interface(shop_task, SHOP_TASK);
    }

    public static SubLObject get_shop_basic_task_status(final SubLObject shop_basic_task) {
        return classes.subloop_get_instance_slot(shop_basic_task, FIVE_INTEGER);
    }

    public static SubLObject set_shop_basic_task_status(final SubLObject shop_basic_task, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_basic_task, value, FIVE_INTEGER);
    }

    public static SubLObject get_shop_basic_task_task_struc(final SubLObject shop_basic_task) {
        return classes.subloop_get_instance_slot(shop_basic_task, FOUR_INTEGER);
    }

    public static SubLObject set_shop_basic_task_task_struc(final SubLObject shop_basic_task, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_basic_task, value, FOUR_INTEGER);
    }

    public static SubLObject get_shop_basic_task_precond(final SubLObject shop_basic_task) {
        return classes.subloop_get_instance_slot(shop_basic_task, THREE_INTEGER);
    }

    public static SubLObject set_shop_basic_task_precond(final SubLObject shop_basic_task, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_basic_task, value, THREE_INTEGER);
    }

    public static SubLObject get_shop_basic_task_bindings(final SubLObject shop_basic_task) {
        return classes.subloop_get_instance_slot(shop_basic_task, TWO_INTEGER);
    }

    public static SubLObject set_shop_basic_task_bindings(final SubLObject shop_basic_task, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_basic_task, value, TWO_INTEGER);
    }

    public static SubLObject get_shop_basic_task_formula(final SubLObject shop_basic_task) {
        return classes.subloop_get_instance_slot(shop_basic_task, ONE_INTEGER);
    }

    public static SubLObject set_shop_basic_task_formula(final SubLObject shop_basic_task, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_basic_task, value, ONE_INTEGER);
    }

    public static SubLObject subloop_reserved_initialize_shop_basic_task_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, SHOP_INDEXED_OBJECT, INSTANCE_INDEX, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_basic_task_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_TASK, FORMULA, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_TASK, BINDINGS, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_TASK, PRECOND, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_TASK, TASK_STRUC, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_TASK, STATUS, NIL);
        return NIL;
    }

    public static SubLObject shop_basic_task_p(final SubLObject shop_basic_task) {
        return classes.subloop_instanceof_class(shop_basic_task, SHOP_BASIC_TASK);
    }

    public static SubLObject shop_basic_task_strip_task_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_task_method = NIL;
        final SubLObject formula = get_shop_basic_task_formula(self);
        try {
            thread.throwStack.push($sym20$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
            try {
                instances.set_slot(self, FORMULA, second(instances.get_slot(self, FORMULA)));
                sublisp_throw($sym20$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_task_formula(self, formula);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_task_method = Errors.handleThrowable(ccatch_env_var, $sym20$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_task_method;
    }

    public static SubLObject shop_basic_task_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_task_method = NIL;
        final SubLObject formula = get_shop_basic_task_formula(self);
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push($sym26$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
            try {
                if (NIL != subloop_structures.instance_p(self)) {
                    format(stream, $str27$__Task__S__S_, instance_number, formula);
                } else {
                    format(stream, $str28$__Malformed_Instance_);
                }
                sublisp_throw($sym26$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_task_formula(self, formula);
                    object.set_object_instance_number(self, instance_number);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_task_method = Errors.handleThrowable(ccatch_env_var, $sym26$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_task_method;
    }

    public static SubLObject shop_basic_task_init_method(final SubLObject self, final SubLObject new_task, final SubLObject new_binding, final SubLObject new_precond, final SubLObject new_task_struc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_task_method = NIL;
        SubLObject status = get_shop_basic_task_status(self);
        SubLObject task_struc = get_shop_basic_task_task_struc(self);
        SubLObject precond = get_shop_basic_task_precond(self);
        SubLObject v_bindings = get_shop_basic_task_bindings(self);
        SubLObject formula = get_shop_basic_task_formula(self);
        try {
            thread.throwStack.push($sym33$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
            try {
                if (new_task.first() == $PRIMITIVE) {
                    formula = second(new_task);
                    status = $PRIMITIVE;
                } else {
                    formula = new_task;
                    status = $COMPLEX;
                }
                v_bindings = new_binding;
                precond = new_precond;
                task_struc = new_task_struc;
                sublisp_throw($sym33$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_task_status(self, status);
                    set_shop_basic_task_task_struc(self, task_struc);
                    set_shop_basic_task_precond(self, precond);
                    set_shop_basic_task_bindings(self, v_bindings);
                    set_shop_basic_task_formula(self, formula);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_task_method = Errors.handleThrowable(ccatch_env_var, $sym33$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_task_method;
    }

    public static SubLObject shop_basic_task_planner_rule_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_task_method = NIL;
        final SubLObject task_struc = get_shop_basic_task_task_struc(self);
        try {
            thread.throwStack.push($sym39$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
            try {
                sublisp_throw($sym39$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, task_struc);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_task_task_struc(self, task_struc);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_task_method = Errors.handleThrowable(ccatch_env_var, $sym39$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_task_method;
    }

    public static SubLObject shop_basic_task_formula_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_task_method = NIL;
        final SubLObject formula = get_shop_basic_task_formula(self);
        try {
            thread.throwStack.push($sym42$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
            try {
                sublisp_throw($sym42$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, formula);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_task_formula(self, formula);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_task_method = Errors.handleThrowable(ccatch_env_var, $sym42$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_task_method;
    }

    public static SubLObject shop_basic_task_precondition_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_task_method = NIL;
        final SubLObject precond = get_shop_basic_task_precond(self);
        try {
            thread.throwStack.push($sym46$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
            try {
                sublisp_throw($sym46$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, precond);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_task_precond(self, precond);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_task_method = Errors.handleThrowable(ccatch_env_var, $sym46$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_task_method;
    }

    public static SubLObject shop_basic_task_primitiveP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_task_method = NIL;
        final SubLObject status = get_shop_basic_task_status(self);
        try {
            thread.throwStack.push($sym50$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
            try {
                sublisp_throw($sym50$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, eq(status, $PRIMITIVE));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_task_status(self, status);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_task_method = Errors.handleThrowable(ccatch_env_var, $sym50$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_task_method;
    }

    public static SubLObject shop_basic_task_mbindings_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_task_method = NIL;
        final SubLObject v_bindings = get_shop_basic_task_bindings(self);
        try {
            thread.throwStack.push($sym54$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
            try {
                sublisp_throw($sym54$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, v_bindings);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_task_bindings(self, v_bindings);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_task_method = Errors.handleThrowable(ccatch_env_var, $sym54$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_task_method;
    }

    public static SubLObject shop_plan_i_p(final SubLObject shop_plan_i) {
        return interfaces.subloop_instanceof_interface(shop_plan_i, SHOP_PLAN_I);
    }

    public static SubLObject get_shop_basic_plan_variable_manager(final SubLObject v_shop_basic_plan) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan, EIGHT_INTEGER);
    }

    public static SubLObject set_shop_basic_plan_variable_manager(final SubLObject v_shop_basic_plan, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan, value, EIGHT_INTEGER);
    }

    public static SubLObject get_shop_basic_plan_open_variables(final SubLObject v_shop_basic_plan) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan, SEVEN_INTEGER);
    }

    public static SubLObject set_shop_basic_plan_open_variables(final SubLObject v_shop_basic_plan, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan, value, SEVEN_INTEGER);
    }

    public static SubLObject get_shop_basic_plan_total_cost(final SubLObject v_shop_basic_plan) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan, SIX_INTEGER);
    }

    public static SubLObject set_shop_basic_plan_total_cost(final SubLObject v_shop_basic_plan, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan, value, SIX_INTEGER);
    }

    public static SubLObject get_shop_basic_plan_simple_binding_list(final SubLObject v_shop_basic_plan) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan, FIVE_INTEGER);
    }

    public static SubLObject set_shop_basic_plan_simple_binding_list(final SubLObject v_shop_basic_plan, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan, value, FIVE_INTEGER);
    }

    public static SubLObject get_shop_basic_plan_bindings(final SubLObject v_shop_basic_plan) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan, FOUR_INTEGER);
    }

    public static SubLObject set_shop_basic_plan_bindings(final SubLObject v_shop_basic_plan, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan, value, FOUR_INTEGER);
    }

    public static SubLObject get_shop_basic_plan_task_strucs(final SubLObject v_shop_basic_plan) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan, THREE_INTEGER);
    }

    public static SubLObject set_shop_basic_plan_task_strucs(final SubLObject v_shop_basic_plan, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan, value, THREE_INTEGER);
    }

    public static SubLObject get_shop_basic_plan_post_ordering(final SubLObject v_shop_basic_plan) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan, TWO_INTEGER);
    }

    public static SubLObject set_shop_basic_plan_post_ordering(final SubLObject v_shop_basic_plan, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan, value, TWO_INTEGER);
    }

    public static SubLObject get_shop_basic_plan_pre_ordering(final SubLObject v_shop_basic_plan) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan, ONE_INTEGER);
    }

    public static SubLObject set_shop_basic_plan_pre_ordering(final SubLObject v_shop_basic_plan, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan, value, ONE_INTEGER);
    }

    public static SubLObject subloop_reserved_initialize_shop_basic_plan_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_basic_plan_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN, PRE_ORDERING, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN, POST_ORDERING, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN, TASK_STRUCS, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN, BINDINGS, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN, SIMPLE_BINDING_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN, TOTAL_COST, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN, OPEN_VARIABLES, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLAN, VARIABLE_MANAGER, NIL);
        return NIL;
    }

    public static SubLObject shop_basic_plan_p(final SubLObject v_shop_basic_plan) {
        return classes.subloop_instanceof_class(v_shop_basic_plan, SHOP_BASIC_PLAN);
    }

    public static SubLObject shop_basic_plan_populate_plan_method(final SubLObject self, final SubLObject plan_state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = NIL;
        SubLObject variable_manager = get_shop_basic_plan_variable_manager(self);
        SubLObject open_variables = get_shop_basic_plan_open_variables(self);
        SubLObject total_cost = get_shop_basic_plan_total_cost(self);
        SubLObject simple_binding_list = get_shop_basic_plan_simple_binding_list(self);
        SubLObject v_bindings = get_shop_basic_plan_bindings(self);
        final SubLObject task_strucs = get_shop_basic_plan_task_strucs(self);
        SubLObject post_ordering = get_shop_basic_plan_post_ordering(self);
        SubLObject pre_ordering = get_shop_basic_plan_pre_ordering(self);
        try {
            thread.throwStack.push($sym73$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                SubLObject task_pre_ordering = shop_basic_plan_state.get_shop_basic_plan_state_partial_plan(plan_state);
                SubLObject task_post_ordering = reverse(shop_basic_plan_state.get_shop_basic_plan_state_post_ordering(plan_state));
                final SubLObject task_bindings = shop_basic_plan_state.shop_basic_plan_state_mbinding_method(plan_state);
                final SubLObject simple_bindings = multibindings.mbind_simple_binding_list(task_bindings);
                SubLObject task_strucs_$1 = shop_basic_plan_state.shop_basic_plan_state_task_strucs_method(plan_state);
                final SubLObject preconds = shop_basic_plan_state.shop_basic_plan_state_support_lists_method(plan_state);
                SubLObject task_list = NIL;
                final SubLObject task_assoc = make_hash_table($int$50, symbol_function(EQ), UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject new_task_pre_ordering = shop_process_open_variables(task_pre_ordering, task_bindings, UNPROVIDED);
                final SubLObject new_open_variables = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject new_task_post_ordering = shop_process_open_variables(task_post_ordering, task_bindings, new_open_variables);
                final SubLObject new_open_variables_$2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                task_pre_ordering = new_task_pre_ordering;
                task_post_ordering = new_task_post_ordering;
                open_variables = new_open_variables_$2;
                SubLObject task = NIL;
                SubLObject task_$3 = NIL;
                SubLObject precond = NIL;
                SubLObject precond_$4 = NIL;
                SubLObject task_struc = NIL;
                SubLObject task_struc_$5 = NIL;
                task = task_pre_ordering;
                task_$3 = task.first();
                precond = preconds;
                precond_$4 = precond.first();
                task_struc = task_strucs_$1;
                task_struc_$5 = task_struc.first();
                while (((NIL != task_struc) || (NIL != precond)) || (NIL != task)) {
                    final SubLObject new_task_obj = object.object_new_method(SHOP_BASIC_TASK);
                    shop_basic_task_init_method(new_task_obj, task_$3, task_bindings, precond_$4, task_struc_$5);
                    sethash(task_$3, task_assoc, new_task_obj);
                    task_list = cons(new_task_obj, task_list);
                    task = task.rest();
                    task_$3 = task.first();
                    precond = precond.rest();
                    precond_$4 = precond.first();
                    task_struc = task_struc.rest();
                    task_struc_$5 = task_struc.first();
                } 
                pre_ordering = reverse(task_list);
                task_list = NIL;
                SubLObject cdolist_list_var = task_post_ordering;
                SubLObject task2 = NIL;
                task2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject task_entry = gethash(task2, task_assoc, UNPROVIDED);
                    if (NIL == task_entry) {
                        Errors.warn($str75$tried_to_add_null_entry_to_task_l, task2);
                    } else {
                        task_list = cons(task_entry, task_list);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    task2 = cdolist_list_var.first();
                } 
                task_strucs_$1 = shop_basic_plan_state.get_shop_basic_plan_state_task_strucs(plan_state);
                post_ordering = reverse(task_list);
                v_bindings = task_bindings;
                simple_binding_list = simple_bindings;
                variable_manager = instances.get_slot(shop_basic_plan_state.get_shop_basic_plan_state_planner(plan_state), VAR_MANAGER);
                total_cost = list_length(task_pre_ordering);
                sublisp_throw($sym73$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_variable_manager(self, variable_manager);
                    set_shop_basic_plan_open_variables(self, open_variables);
                    set_shop_basic_plan_total_cost(self, total_cost);
                    set_shop_basic_plan_simple_binding_list(self, simple_binding_list);
                    set_shop_basic_plan_bindings(self, v_bindings);
                    set_shop_basic_plan_task_strucs(self, task_strucs);
                    set_shop_basic_plan_post_ordering(self, post_ordering);
                    set_shop_basic_plan_pre_ordering(self, pre_ordering);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, $sym73$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }

    public static SubLObject shop_basic_plan_ground_forms_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = NIL;
        final SubLObject open_variables = get_shop_basic_plan_open_variables(self);
        final SubLObject v_bindings = get_shop_basic_plan_bindings(self);
        try {
            thread.throwStack.push($sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                final SubLObject primitive_form = shop_basic_plan_primitive_form_method(self);
                if (NIL == open_variables) {
                    sublisp_throw($sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, list(primitive_form));
                } else {
                    sublisp_throw($sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, multibindings.apply_multibinding(primitive_form, v_bindings));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_open_variables(self, open_variables);
                    set_shop_basic_plan_bindings(self, v_bindings);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }

    public static SubLObject shop_basic_plan_primitive_form_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = NIL;
        final SubLObject post_ordering = get_shop_basic_plan_post_ordering(self);
        final SubLObject pre_ordering = get_shop_basic_plan_pre_ordering(self);
        try {
            thread.throwStack.push($sym84$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                final SubLObject primitive_tasks = ppo_tree_leaves(reverse(pre_ordering), post_ordering, symbol_function(EQ));
                SubLObject primitive_forms = NIL;
                SubLObject cdolist_list_var = primitive_tasks;
                SubLObject cur_task = NIL;
                cur_task = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    primitive_forms = cons(shop_basic_task_formula_method(cur_task), primitive_forms);
                    cdolist_list_var = cdolist_list_var.rest();
                    cur_task = cdolist_list_var.first();
                } 
                sublisp_throw($sym84$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, nreverse(primitive_forms));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_post_ordering(self, post_ordering);
                    set_shop_basic_plan_pre_ordering(self, pre_ordering);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, $sym84$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }

    public static SubLObject shop_basic_plan_non_primitive_pre_ordering_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = NIL;
        final SubLObject pre_ordering = get_shop_basic_plan_pre_ordering(self);
        try {
            thread.throwStack.push($sym88$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                SubLObject non_primitive_list = NIL;
                SubLObject cdolist_list_var = pre_ordering;
                SubLObject cur_task = NIL;
                cur_task = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == shop_basic_task_primitiveP_method(cur_task)) {
                        non_primitive_list = cons(cur_task, non_primitive_list);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cur_task = cdolist_list_var.first();
                } 
                sublisp_throw($sym88$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, non_primitive_list);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_pre_ordering(self, pre_ordering);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, $sym88$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }

    public static SubLObject shop_basic_plan_goal_task_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = NIL;
        final SubLObject pre_ordering = get_shop_basic_plan_pre_ordering(self);
        try {
            thread.throwStack.push($sym92$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                sublisp_throw($sym92$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, list_utilities.last_one(pre_ordering));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_pre_ordering(self, pre_ordering);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, $sym92$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }

    public static SubLObject shop_basic_plan_post_ordering_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = NIL;
        final SubLObject post_ordering = get_shop_basic_plan_post_ordering(self);
        try {
            thread.throwStack.push($sym95$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                sublisp_throw($sym95$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, post_ordering);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_post_ordering(self, post_ordering);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, $sym95$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }

    public static SubLObject shop_basic_plan_cost_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = NIL;
        final SubLObject total_cost = get_shop_basic_plan_total_cost(self);
        try {
            thread.throwStack.push($sym99$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                sublisp_throw($sym99$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, total_cost);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_total_cost(self, total_cost);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, $sym99$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }

    public static SubLObject shop_basic_plan_variable_manager_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = NIL;
        final SubLObject variable_manager = get_shop_basic_plan_variable_manager(self);
        try {
            thread.throwStack.push($sym102$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                sublisp_throw($sym102$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, variable_manager);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_variable_manager(self, variable_manager);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, $sym102$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }

    public static SubLObject shop_basic_plan_mbinding_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = NIL;
        final SubLObject v_bindings = get_shop_basic_plan_bindings(self);
        try {
            thread.throwStack.push($sym105$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                sublisp_throw($sym105$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, v_bindings);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_bindings(self, v_bindings);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, $sym105$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }

    public static SubLObject shop_basic_plan_gather_planner_rules_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = NIL;
        final SubLObject pre_ordering = get_shop_basic_plan_pre_ordering(self);
        try {
            thread.throwStack.push($sym109$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                SubLObject planner_rules = NIL;
                SubLObject cdolist_list_var = pre_ordering;
                SubLObject cur_item = NIL;
                cur_item = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    planner_rules = cons(methods.funcall_instance_method_with_0_args(cur_item, PLANNER_RULE), planner_rules);
                    cdolist_list_var = cdolist_list_var.rest();
                    cur_item = cdolist_list_var.first();
                } 
                sublisp_throw($sym109$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, planner_rules);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_pre_ordering(self, pre_ordering);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, $sym109$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }

    public static SubLObject shop_basic_plan_gather_preconditions_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = NIL;
        final SubLObject pre_ordering = get_shop_basic_plan_pre_ordering(self);
        try {
            thread.throwStack.push($sym113$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                SubLObject planner_rules = NIL;
                SubLObject cdolist_list_var = pre_ordering;
                SubLObject cur_item = NIL;
                cur_item = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    planner_rules = cons(methods.funcall_instance_method_with_0_args(cur_item, PRECONDITION), planner_rules);
                    cdolist_list_var = cdolist_list_var.rest();
                    cur_item = cdolist_list_var.first();
                } 
                sublisp_throw($sym113$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, planner_rules);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_pre_ordering(self, pre_ordering);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, $sym113$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }

    public static SubLObject shop_basic_plan_single_agent_planP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_method = NIL;
        final SubLObject simple_binding_list = get_shop_basic_plan_simple_binding_list(self);
        final SubLObject pre_ordering = get_shop_basic_plan_pre_ordering(self);
        try {
            thread.throwStack.push($sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
            try {
                final SubLObject first_agent = cycl_utilities.formula_arg1(sublis(simple_binding_list, methods.funcall_instance_method_with_0_args(pre_ordering.first(), FORMULA), UNPROVIDED, UNPROVIDED), UNPROVIDED);
                SubLObject cdolist_list_var = pre_ordering.rest();
                SubLObject cur_task = NIL;
                cur_task = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (!first_agent.equal(cycl_utilities.formula_arg1(sublis(simple_binding_list, methods.funcall_instance_method_with_0_args(cur_task, FORMULA), UNPROVIDED, UNPROVIDED), UNPROVIDED))) {
                        sublisp_throw($sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, NIL);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cur_task = cdolist_list_var.first();
                } 
                sublisp_throw($sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_basic_plan_simple_binding_list(self, simple_binding_list);
                    set_shop_basic_plan_pre_ordering(self, pre_ordering);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_method = Errors.handleThrowable(ccatch_env_var, $sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_method;
    }

    public static SubLObject shop_process_open_variables(final SubLObject v_object, final SubLObject mbinding, SubLObject open_vars) {
        if (open_vars == UNPROVIDED) {
            open_vars = NIL;
        }
        final SubLObject object_vars = list_utilities.tree_gather(v_object, SHOP_VARIABLEP, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == open_vars) {
            SubLObject cdolist_list_var = object_vars;
            SubLObject cur_var = NIL;
            cur_var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == multibindings.atomic_binding_in_multibindingP(cur_var, mbinding)) {
                    open_vars = cons(cur_var, open_vars);
                }
                cdolist_list_var = cdolist_list_var.rest();
                cur_var = cdolist_list_var.first();
            } 
        }
        return values(v_object, open_vars);
    }

    public static SubLObject ppo_tree_leaves(final SubLObject pre, final SubLObject post, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQ);
        }
        SubLObject leaves = NIL;
        SubLObject cur_pre;
        SubLObject cur_item;
        SubLObject next_item;
        for (cur_pre = NIL, cur_pre = pre; NIL != cur_pre; cur_pre = cur_pre.rest()) {
            cur_item = cur_pre.first();
            next_item = second(cur_pre);
            if (NIL != list_utilities.singletonP(cur_pre)) {
                leaves = cons(cur_item, leaves);
            } else
                if (NIL == ppo_tree_ancestorP(pre, post, cur_item, next_item, test)) {
                    leaves = cons(cur_item, leaves);
                }

        }
        return nreverse(leaves);
    }

    public static SubLObject ppo_tree_ancestorP(final SubLObject pre, final SubLObject post, final SubLObject item1, final SubLObject item2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQ);
        }
        return makeBoolean((NIL != list_utilities.position_L(item1, item2, pre, test, UNPROVIDED)) && (NIL != list_utilities.position_L(item2, item1, post, test, UNPROVIDED)));
    }

    public static SubLObject ppo_tree_descendantP(final SubLObject pre, final SubLObject post, final SubLObject item1, final SubLObject item2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQ);
        }
        return ppo_tree_ancestorP(pre, post, item2, item1, test);
    }

    public static SubLObject do_ppo_tree_depth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list120);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject item = NIL;
        SubLObject depth = NIL;
        SubLObject pre = NIL;
        SubLObject post = NIL;
        destructuring_bind_must_consp(current, datum, $list120);
        item = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list120);
        depth = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list120);
        pre = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list120);
        post = current.first();
        current = current.rest();
        final SubLObject test = (current.isCons()) ? current.first() : symbol_function(EQ);
        destructuring_bind_must_listp(current, datum, $list120);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject cur_pre = $sym121$CUR_PRE;
            final SubLObject next = $sym122$NEXT;
            final SubLObject stack = $sym123$STACK;
            return list(CLET, list(bq_cons(stack, $list125), bq_cons(depth, $list126)), list(CDO, list(list(cur_pre, pre, list(REST, cur_pre))), list(list(NULL, cur_pre)), listS(CLET, list(list(item, list(FIRST, cur_pre)), list(next, list(SECOND, cur_pre))), list(WHILE, list(CAND, list(CNOT, list($sym135$PPO_TREE_DESCENDANT_, pre, post, item, list(FIRST, stack), test)), list(CNOT, list(NULL, stack))), list(CDEC, depth), list(CPOP, stack)), append(body, list(list(PWHEN, list($sym135$PPO_TREE_DESCENDANT_, pre, post, next, item, test), list(CINC, depth), list(CPUSH, item, stack)))))));
        }
        cdestructuring_bind_error(datum, $list120);
        return NIL;
    }

    public static SubLObject shop_plan_compare(final SubLObject plan1, final SubLObject plan2) {
        SubLObject entry1 = NIL;
        SubLObject entry1_$6 = NIL;
        SubLObject entry2 = NIL;
        SubLObject entry2_$7 = NIL;
        entry1 = get_shop_basic_plan_post_ordering(plan1);
        entry1_$6 = entry1.first();
        entry2 = get_shop_basic_plan_post_ordering(plan2);
        entry2_$7 = entry2.first();
        while ((NIL != entry2) || (NIL != entry1)) {
            final SubLObject sentence1 = methods.funcall_instance_method_with_0_args(entry1_$6, FORMULA);
            final SubLObject sentence2 = methods.funcall_instance_method_with_0_args(entry2_$7, FORMULA);
            if (!sentence1.equal(sentence2)) {
                return list(sentence1, sentence2);
            }
            entry1 = entry1.rest();
            entry1_$6 = entry1.first();
            entry2 = entry2.rest();
            entry2_$7 = entry2.first();
        } 
        return T;
    }

    public static SubLObject declare_shop_basic_plan_file() {
        declareFunction(me, "shop_task_p", "SHOP-TASK-P", 1, 0, false);
        declareFunction(me, "get_shop_basic_task_status", "GET-SHOP-BASIC-TASK-STATUS", 1, 0, false);
        declareFunction(me, "set_shop_basic_task_status", "SET-SHOP-BASIC-TASK-STATUS", 2, 0, false);
        declareFunction(me, "get_shop_basic_task_task_struc", "GET-SHOP-BASIC-TASK-TASK-STRUC", 1, 0, false);
        declareFunction(me, "set_shop_basic_task_task_struc", "SET-SHOP-BASIC-TASK-TASK-STRUC", 2, 0, false);
        declareFunction(me, "get_shop_basic_task_precond", "GET-SHOP-BASIC-TASK-PRECOND", 1, 0, false);
        declareFunction(me, "set_shop_basic_task_precond", "SET-SHOP-BASIC-TASK-PRECOND", 2, 0, false);
        declareFunction(me, "get_shop_basic_task_bindings", "GET-SHOP-BASIC-TASK-BINDINGS", 1, 0, false);
        declareFunction(me, "set_shop_basic_task_bindings", "SET-SHOP-BASIC-TASK-BINDINGS", 2, 0, false);
        declareFunction(me, "get_shop_basic_task_formula", "GET-SHOP-BASIC-TASK-FORMULA", 1, 0, false);
        declareFunction(me, "set_shop_basic_task_formula", "SET-SHOP-BASIC-TASK-FORMULA", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_basic_task_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-TASK-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_basic_task_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-TASK-INSTANCE", 1, 0, false);
        declareFunction(me, "shop_basic_task_p", "SHOP-BASIC-TASK-P", 1, 0, false);
        declareFunction(me, "shop_basic_task_strip_task_method", "SHOP-BASIC-TASK-STRIP-TASK-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_task_print_method", "SHOP-BASIC-TASK-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "shop_basic_task_init_method", "SHOP-BASIC-TASK-INIT-METHOD", 5, 0, false);
        declareFunction(me, "shop_basic_task_planner_rule_method", "SHOP-BASIC-TASK-PLANNER-RULE-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_task_formula_method", "SHOP-BASIC-TASK-FORMULA-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_task_precondition_method", "SHOP-BASIC-TASK-PRECONDITION-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_task_primitiveP_method", "SHOP-BASIC-TASK-PRIMITIVE?-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_task_mbindings_method", "SHOP-BASIC-TASK-MBINDINGS-METHOD", 1, 0, false);
        declareFunction(me, "shop_plan_i_p", "SHOP-PLAN-I-P", 1, 0, false);
        declareFunction(me, "get_shop_basic_plan_variable_manager", "GET-SHOP-BASIC-PLAN-VARIABLE-MANAGER", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_variable_manager", "SET-SHOP-BASIC-PLAN-VARIABLE-MANAGER", 2, 0, false);
        declareFunction(me, "get_shop_basic_plan_open_variables", "GET-SHOP-BASIC-PLAN-OPEN-VARIABLES", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_open_variables", "SET-SHOP-BASIC-PLAN-OPEN-VARIABLES", 2, 0, false);
        declareFunction(me, "get_shop_basic_plan_total_cost", "GET-SHOP-BASIC-PLAN-TOTAL-COST", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_total_cost", "SET-SHOP-BASIC-PLAN-TOTAL-COST", 2, 0, false);
        declareFunction(me, "get_shop_basic_plan_simple_binding_list", "GET-SHOP-BASIC-PLAN-SIMPLE-BINDING-LIST", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_simple_binding_list", "SET-SHOP-BASIC-PLAN-SIMPLE-BINDING-LIST", 2, 0, false);
        declareFunction(me, "get_shop_basic_plan_bindings", "GET-SHOP-BASIC-PLAN-BINDINGS", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_bindings", "SET-SHOP-BASIC-PLAN-BINDINGS", 2, 0, false);
        declareFunction(me, "get_shop_basic_plan_task_strucs", "GET-SHOP-BASIC-PLAN-TASK-STRUCS", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_task_strucs", "SET-SHOP-BASIC-PLAN-TASK-STRUCS", 2, 0, false);
        declareFunction(me, "get_shop_basic_plan_post_ordering", "GET-SHOP-BASIC-PLAN-POST-ORDERING", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_post_ordering", "SET-SHOP-BASIC-PLAN-POST-ORDERING", 2, 0, false);
        declareFunction(me, "get_shop_basic_plan_pre_ordering", "GET-SHOP-BASIC-PLAN-PRE-ORDERING", 1, 0, false);
        declareFunction(me, "set_shop_basic_plan_pre_ordering", "SET-SHOP-BASIC-PLAN-PRE-ORDERING", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_basic_plan_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_basic_plan_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-INSTANCE", 1, 0, false);
        declareFunction(me, "shop_basic_plan_p", "SHOP-BASIC-PLAN-P", 1, 0, false);
        declareFunction(me, "shop_basic_plan_populate_plan_method", "SHOP-BASIC-PLAN-POPULATE-PLAN-METHOD", 2, 0, false);
        declareFunction(me, "shop_basic_plan_ground_forms_method", "SHOP-BASIC-PLAN-GROUND-FORMS-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_primitive_form_method", "SHOP-BASIC-PLAN-PRIMITIVE-FORM-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_non_primitive_pre_ordering_method", "SHOP-BASIC-PLAN-NON-PRIMITIVE-PRE-ORDERING-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_goal_task_method", "SHOP-BASIC-PLAN-GOAL-TASK-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_post_ordering_method", "SHOP-BASIC-PLAN-POST-ORDERING-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_cost_method", "SHOP-BASIC-PLAN-COST-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_variable_manager_method", "SHOP-BASIC-PLAN-VARIABLE-MANAGER-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_mbinding_method", "SHOP-BASIC-PLAN-MBINDING-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_gather_planner_rules_method", "SHOP-BASIC-PLAN-GATHER-PLANNER-RULES-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_gather_preconditions_method", "SHOP-BASIC-PLAN-GATHER-PRECONDITIONS-METHOD", 1, 0, false);
        declareFunction(me, "shop_basic_plan_single_agent_planP_method", "SHOP-BASIC-PLAN-SINGLE-AGENT-PLAN?-METHOD", 1, 0, false);
        declareFunction(me, "shop_process_open_variables", "SHOP-PROCESS-OPEN-VARIABLES", 2, 1, false);
        declareFunction(me, "ppo_tree_leaves", "PPO-TREE-LEAVES", 2, 1, false);
        declareFunction(me, "ppo_tree_ancestorP", "PPO-TREE-ANCESTOR?", 4, 1, false);
        declareFunction(me, "ppo_tree_descendantP", "PPO-TREE-DESCENDANT?", 4, 1, false);
        declareMacro(me, "do_ppo_tree_depth", "DO-PPO-TREE-DEPTH");
        declareFunction(me, "shop_plan_compare", "SHOP-PLAN-COMPARE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_shop_basic_plan_file() {
        return NIL;
    }

    public static SubLObject setup_shop_basic_plan_file() {
        interfaces.new_interface(SHOP_TASK, NIL, NIL, $list1);
        classes.subloop_new_class(SHOP_BASIC_TASK, SHOP_INDEXED_OBJECT, $list4, NIL, $list5);
        classes.class_set_implements_slot_listeners(SHOP_BASIC_TASK, NIL);
        classes.subloop_note_class_initialization_function(SHOP_BASIC_TASK, SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_TASK_CLASS);
        classes.subloop_note_instance_initialization_function(SHOP_BASIC_TASK, SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_TASK_INSTANCE);
        subloop_reserved_initialize_shop_basic_task_class(SHOP_BASIC_TASK);
        methods.methods_incorporate_instance_method(STRIP_TASK, SHOP_BASIC_TASK, NIL, NIL, $list19);
        methods.subloop_register_instance_method(SHOP_BASIC_TASK, STRIP_TASK, SHOP_BASIC_TASK_STRIP_TASK_METHOD);
        methods.methods_incorporate_instance_method(PRINT, SHOP_BASIC_TASK, $list23, $list24, $list25);
        methods.subloop_register_instance_method(SHOP_BASIC_TASK, PRINT, SHOP_BASIC_TASK_PRINT_METHOD);
        methods.methods_incorporate_instance_method(INIT, SHOP_BASIC_TASK, $list23, $list31, $list32);
        methods.subloop_register_instance_method(SHOP_BASIC_TASK, INIT, SHOP_BASIC_TASK_INIT_METHOD);
        methods.methods_incorporate_instance_method(PLANNER_RULE, SHOP_BASIC_TASK, $list23, NIL, $list38);
        methods.subloop_register_instance_method(SHOP_BASIC_TASK, PLANNER_RULE, SHOP_BASIC_TASK_PLANNER_RULE_METHOD);
        methods.methods_incorporate_instance_method(FORMULA, SHOP_BASIC_TASK, $list23, NIL, $list41);
        methods.subloop_register_instance_method(SHOP_BASIC_TASK, FORMULA, SHOP_BASIC_TASK_FORMULA_METHOD);
        methods.methods_incorporate_instance_method(PRECONDITION, SHOP_BASIC_TASK, $list23, NIL, $list45);
        methods.subloop_register_instance_method(SHOP_BASIC_TASK, PRECONDITION, SHOP_BASIC_TASK_PRECONDITION_METHOD);
        methods.methods_incorporate_instance_method($sym48$PRIMITIVE_, SHOP_BASIC_TASK, $list23, NIL, $list49);
        methods.subloop_register_instance_method(SHOP_BASIC_TASK, $sym48$PRIMITIVE_, $sym51$SHOP_BASIC_TASK_PRIMITIVE__METHOD);
        methods.methods_incorporate_instance_method(MBINDINGS, SHOP_BASIC_TASK, $list23, NIL, $list53);
        methods.subloop_register_instance_method(SHOP_BASIC_TASK, MBINDINGS, SHOP_BASIC_TASK_MBINDINGS_METHOD);
        interfaces.new_interface(SHOP_PLAN_I, NIL, NIL, $list57);
        classes.subloop_new_class(SHOP_BASIC_PLAN, OBJECT, $list59, NIL, $list60);
        classes.class_set_implements_slot_listeners(SHOP_BASIC_PLAN, NIL);
        classes.subloop_note_class_initialization_function(SHOP_BASIC_PLAN, SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_CLASS);
        classes.subloop_note_instance_initialization_function(SHOP_BASIC_PLAN, SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_INSTANCE);
        subloop_reserved_initialize_shop_basic_plan_class(SHOP_BASIC_PLAN);
        methods.methods_incorporate_instance_method(POPULATE_PLAN, SHOP_BASIC_PLAN, $list23, $list71, $list72);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN, POPULATE_PLAN, SHOP_BASIC_PLAN_POPULATE_PLAN_METHOD);
        methods.methods_incorporate_instance_method(GROUND_FORMS, SHOP_BASIC_PLAN, $list23, NIL, $list79);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN, GROUND_FORMS, SHOP_BASIC_PLAN_GROUND_FORMS_METHOD);
        methods.methods_incorporate_instance_method(PRIMITIVE_FORM, SHOP_BASIC_PLAN, $list23, NIL, $list83);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN, PRIMITIVE_FORM, SHOP_BASIC_PLAN_PRIMITIVE_FORM_METHOD);
        methods.methods_incorporate_instance_method(NON_PRIMITIVE_PRE_ORDERING, SHOP_BASIC_PLAN, $list23, NIL, $list87);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN, NON_PRIMITIVE_PRE_ORDERING, SHOP_BASIC_PLAN_NON_PRIMITIVE_PRE_ORDERING_METHOD);
        methods.methods_incorporate_instance_method(GOAL_TASK, SHOP_BASIC_PLAN, $list23, NIL, $list91);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN, GOAL_TASK, SHOP_BASIC_PLAN_GOAL_TASK_METHOD);
        methods.methods_incorporate_instance_method(POST_ORDERING, SHOP_BASIC_PLAN, $list23, NIL, $list94);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN, POST_ORDERING, SHOP_BASIC_PLAN_POST_ORDERING_METHOD);
        methods.methods_incorporate_instance_method(COST, SHOP_BASIC_PLAN, $list23, NIL, $list98);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN, COST, SHOP_BASIC_PLAN_COST_METHOD);
        methods.methods_incorporate_instance_method(VARIABLE_MANAGER, SHOP_BASIC_PLAN, $list23, NIL, $list101);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN, VARIABLE_MANAGER, SHOP_BASIC_PLAN_VARIABLE_MANAGER_METHOD);
        methods.methods_incorporate_instance_method(MBINDING, SHOP_BASIC_PLAN, $list23, NIL, $list53);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN, MBINDING, SHOP_BASIC_PLAN_MBINDING_METHOD);
        methods.methods_incorporate_instance_method(GATHER_PLANNER_RULES, SHOP_BASIC_PLAN, $list23, NIL, $list108);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN, GATHER_PLANNER_RULES, SHOP_BASIC_PLAN_GATHER_PLANNER_RULES_METHOD);
        methods.methods_incorporate_instance_method(GATHER_PRECONDITIONS, SHOP_BASIC_PLAN, $list23, NIL, $list112);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN, GATHER_PRECONDITIONS, SHOP_BASIC_PLAN_GATHER_PRECONDITIONS_METHOD);
        methods.methods_incorporate_instance_method($sym115$SINGLE_AGENT_PLAN_, SHOP_BASIC_PLAN, $list23, NIL, $list116);
        methods.subloop_register_instance_method(SHOP_BASIC_PLAN, $sym115$SINGLE_AGENT_PLAN_, $sym118$SHOP_BASIC_PLAN_SINGLE_AGENT_PLAN__METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_shop_basic_plan_file();
    }

    @Override
    public void initializeVariables() {
        init_shop_basic_plan_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_shop_basic_plan_file();
    }

    
}

/**
 * Total time: 749 ms
 */
