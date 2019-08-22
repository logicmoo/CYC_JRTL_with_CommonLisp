package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.literal_predicate;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write_to_string;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_run_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nsubst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class shop_internals extends SubLTranslatedFile {
    public static final SubLFile me = new shop_internals();

    public static final String myName = "com.cyc.cycjava.cycl.shop_internals";

    public static final String myFingerPrint = "a83b6c727ec29e1e8c8612e4ba76cdf7df05a2a76259c9a4c22688293159e72a";

    // defparameter
    public static final SubLSymbol $shop_verbose_keys$ = makeSymbol("*SHOP-VERBOSE-KEYS*");

    // defparameter
    public static final SubLSymbol $shop_gc$ = makeSymbol("*SHOP-GC*");

    // defparameter
    /**
     * This parameter controls how verbose information is handled. Currently there
     * are two options, :STDOUT, and :HTML. :STDOUT is to be used when running the
     * planner from the read/eval loop. :HTML is used when access the planner from
     * the Cyc Browser.
     */
    private static final SubLSymbol $shop_verbose_target$ = makeSymbol("*SHOP-VERBOSE-TARGET*");

    // Internal Constants
    public static final SubLList $list0 = list(new SubLObject[]{ cons(makeKeyword("CUTOFFS"), ONE_INTEGER), cons(makeKeyword("TASKS"), TWO_INTEGER), cons(makeKeyword("OPERATORS"), THREE_INTEGER), cons(makeKeyword("STATES"), FOUR_INTEGER), cons(makeKeyword("METHODS"), FIVE_INTEGER), cons(makeKeyword("PLANNER-RULES"), makeDouble(5.5)), cons(makeKeyword("MBIND-CUTOFFS"), SIX_INTEGER), cons(makeKeyword("GOALS"), SEVEN_INTEGER), cons(makeKeyword("CYC-QUERY"), EIGHT_INTEGER), cons(makeKeyword("ALL"), NINE_INTEGER) });



    public static final SubLList $list2 = list(cons(T, T));

    public static final SubLList $list3 = list(NIL);

    public static final SubLList $list4 = list(makeSymbol("OBJECT"), makeSymbol("SLOT"));



    public static final SubLSymbol $sym6$1_ = makeSymbol("1+");



    public static final SubLSymbol PROCESS_TIMER = makeSymbol("PROCESS-TIMER");

    public static final SubLList $list9 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("START-TIMING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESET-TIMING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STOP-TIMING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESUME-TIMING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ELAPSED-REAL-TIME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ELAPSED-RUN-TIME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ELAPSED-REAL-TIME-SINCE-LAST-CALL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ELAPSED-RUN-TIME-SINCE-LAST-CALL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("IS-TIMING?"), NIL, makeKeyword("PUBLIC")) });

    public static final SubLSymbol STATISTIC_MANAGER = makeSymbol("STATISTIC-MANAGER");



    public static final SubLList $list12 = list(makeSymbol("PROCESS-TIMER"));

    public static final SubLList $list13 = list(new SubLObject[]{ list(makeSymbol("TIMING?"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("START-RUN-TIME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("START-REAL-TIME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("END-RUN-TIME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("END-REAL-TIME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LAST-CALL-RUN-TIME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LAST-CALL-REAL-TIME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESET-LAST-CALL-TIME"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RUN-TIME"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REAL-TIME"), NIL, makeKeyword("PRIVATE")) });

    public static final SubLSymbol LAST_CALL_REAL_TIME = makeSymbol("LAST-CALL-REAL-TIME");

    public static final SubLSymbol LAST_CALL_RUN_TIME = makeSymbol("LAST-CALL-RUN-TIME");

    public static final SubLSymbol END_REAL_TIME = makeSymbol("END-REAL-TIME");

    public static final SubLSymbol END_RUN_TIME = makeSymbol("END-RUN-TIME");

    public static final SubLSymbol START_REAL_TIME = makeSymbol("START-REAL-TIME");

    public static final SubLSymbol START_RUN_TIME = makeSymbol("START-RUN-TIME");

    public static final SubLSymbol $sym20$TIMING_ = makeSymbol("TIMING?");



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_STATISTIC_MANAGER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-STATISTIC-MANAGER-CLASS");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_STATISTIC_MANAGER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-STATISTIC-MANAGER-INSTANCE");



    public static final SubLList $list27 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list28 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("RESET-TIMING"), makeSymbol("SELF")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol STATISTIC_MANAGER_INITIALIZE_METHOD = makeSymbol("STATISTIC-MANAGER-INITIALIZE-METHOD");

    public static final SubLSymbol GET_RUN_TIME = makeSymbol("GET-RUN-TIME");

    public static final SubLList $list31 = list(makeKeyword("PRIVATE"));

    public static final SubLList $list32 = list(list(makeSymbol("RET"), list(makeSymbol("GET-INTERNAL-RUN-TIME"))));

    public static final SubLSymbol STATISTIC_MANAGER_GET_RUN_TIME_METHOD = makeSymbol("STATISTIC-MANAGER-GET-RUN-TIME-METHOD");

    public static final SubLSymbol GET_REAL_TIME = makeSymbol("GET-REAL-TIME");

    public static final SubLList $list35 = list(list(makeSymbol("RET"), list(makeSymbol("GET-INTERNAL-REAL-TIME"))));

    public static final SubLSymbol STATISTIC_MANAGER_GET_REAL_TIME_METHOD = makeSymbol("STATISTIC-MANAGER-GET-REAL-TIME-METHOD");

    public static final SubLSymbol RESET_LAST_CALL_TIME = makeSymbol("RESET-LAST-CALL-TIME");

    public static final SubLList $list38 = list(list(makeSymbol("CSETQ"), makeSymbol("LAST-CALL-RUN-TIME"), list(makeSymbol("GET-RUN-TIME"), makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("LAST-CALL-REAL-TIME"), list(makeSymbol("GET-REAL-TIME"), makeSymbol("SELF"))), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol $sym39$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD");

    public static final SubLSymbol STATISTIC_MANAGER_RESET_LAST_CALL_TIME_METHOD = makeSymbol("STATISTIC-MANAGER-RESET-LAST-CALL-TIME-METHOD");

    public static final SubLSymbol START_TIMING = makeSymbol("START-TIMING");

    public static final SubLList $list42 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list43 = list(list(makeSymbol("CSETQ"), makeSymbol("START-RUN-TIME"), list(makeSymbol("GET-RUN-TIME"), makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("START-REAL-TIME"), list(makeSymbol("GET-REAL-TIME"), makeSymbol("SELF"))), list(makeSymbol("RESET-LAST-CALL-TIME"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("TIMING?"), T), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol $sym44$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD");

    public static final SubLSymbol STATISTIC_MANAGER_START_TIMING_METHOD = makeSymbol("STATISTIC-MANAGER-START-TIMING-METHOD");

    public static final SubLSymbol RESUME_TIMING = makeSymbol("RESUME-TIMING");

    public static final SubLList $list47 = list(list(makeSymbol("RESET-LAST-CALL-TIME"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("TIMING?"), T), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol $sym48$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD");

    public static final SubLSymbol STATISTIC_MANAGER_RESUME_TIMING_METHOD = makeSymbol("STATISTIC-MANAGER-RESUME-TIMING-METHOD");

    public static final SubLSymbol STOP_TIMING = makeSymbol("STOP-TIMING");

    public static final SubLList $list51 = list(list(makeSymbol("CSETQ"), makeSymbol("END-RUN-TIME"), list(makeSymbol("GET-RUN-TIME"), makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("END-REAL-TIME"), list(makeSymbol("GET-REAL-TIME"), makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("TIMING?"), NIL), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol $sym52$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD");

    public static final SubLSymbol STATISTIC_MANAGER_STOP_TIMING_METHOD = makeSymbol("STATISTIC-MANAGER-STOP-TIMING-METHOD");

    public static final SubLSymbol $sym54$IS_TIMING_ = makeSymbol("IS-TIMING?");

    public static final SubLList $list55 = list(list(makeSymbol("RET"), makeSymbol("TIMING?")));

    public static final SubLSymbol $sym56$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD");

    public static final SubLSymbol $sym57$STATISTIC_MANAGER_IS_TIMING__METHOD = makeSymbol("STATISTIC-MANAGER-IS-TIMING?-METHOD");

    public static final SubLSymbol ELAPSED_REAL_TIME = makeSymbol("ELAPSED-REAL-TIME");

    public static final SubLList $list59 = list(list(makeSymbol("PIF"), makeSymbol("TIMING?"), list(makeSymbol("RET"), list(makeSymbol("-"), list(makeSymbol("GET-REAL-TIME"), makeSymbol("SELF")), makeSymbol("START-REAL-TIME"))), list(makeSymbol("RET"), list(makeSymbol("-"), makeSymbol("END-REAL-TIME"), makeSymbol("START-REAL-TIME")))));

    public static final SubLSymbol $sym60$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD");

    public static final SubLSymbol STATISTIC_MANAGER_ELAPSED_REAL_TIME_METHOD = makeSymbol("STATISTIC-MANAGER-ELAPSED-REAL-TIME-METHOD");

    public static final SubLSymbol ELAPSED_RUN_TIME = makeSymbol("ELAPSED-RUN-TIME");

    public static final SubLList $list63 = list(list(makeSymbol("PIF"), makeSymbol("TIMING?"), list(makeSymbol("RET"), list(makeSymbol("-"), list(makeSymbol("GET-RUN-TIME"), makeSymbol("SELF")), makeSymbol("START-RUN-TIME"))), list(makeSymbol("RET"), list(makeSymbol("-"), makeSymbol("END-RUN-TIME"), makeSymbol("START-RUN-TIME")))));

    public static final SubLSymbol $sym64$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD");

    public static final SubLSymbol STATISTIC_MANAGER_ELAPSED_RUN_TIME_METHOD = makeSymbol("STATISTIC-MANAGER-ELAPSED-RUN-TIME-METHOD");

    public static final SubLSymbol RESET_TIMING = makeSymbol("RESET-TIMING");

    public static final SubLList $list67 = list(list(makeSymbol("CSETQ"), makeSymbol("TIMING?"), NIL), list(makeSymbol("CSETQ"), makeSymbol("START-REAL-TIME"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("END-REAL-TIME"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("START-RUN-TIME"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("END-RUN-TIME"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("LAST-CALL-RUN-TIME"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("LAST-CALL-REAL-TIME"), ZERO_INTEGER), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol $sym68$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD");

    public static final SubLSymbol STATISTIC_MANAGER_RESET_TIMING_METHOD = makeSymbol("STATISTIC-MANAGER-RESET-TIMING-METHOD");

    public static final SubLSymbol ELAPSED_REAL_TIME_SINCE_LAST_CALL = makeSymbol("ELAPSED-REAL-TIME-SINCE-LAST-CALL");

    public static final SubLList $list71 = list(list(makeSymbol("PIF"), makeSymbol("TIMING?"), list(makeSymbol("CLET"), list(list(makeSymbol("ELAPSED-TIME"), list(makeSymbol("-"), list(makeSymbol("GET-REAL-TIME"), makeSymbol("SELF")), makeSymbol("LAST-CALL-REAL-TIME")))), list(makeSymbol("RESET-LAST-CALL-TIME"), makeSymbol("SELF")), list(makeSymbol("RET"), makeSymbol("ELAPSED-TIME"))), list(makeSymbol("CLET"), list(list(makeSymbol("ELAPSED-TIME"), list(makeSymbol("-"), makeSymbol("END-REAL-TIME"), makeSymbol("LAST-CALL-REAL-TIME")))), list(makeSymbol("RET"), makeSymbol("ELAPSED-TIME")))));

    public static final SubLSymbol $sym72$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD");

    public static final SubLSymbol STATISTIC_MANAGER_ELAPSED_REAL_TIME_SINCE_LAST_CALL_METHOD = makeSymbol("STATISTIC-MANAGER-ELAPSED-REAL-TIME-SINCE-LAST-CALL-METHOD");

    public static final SubLSymbol ELAPSED_RUN_TIME_SINCE_LAST_CALL = makeSymbol("ELAPSED-RUN-TIME-SINCE-LAST-CALL");

    public static final SubLList $list75 = list(list(makeSymbol("PIF"), makeSymbol("TIMING?"), list(makeSymbol("CLET"), list(list(makeSymbol("ELAPSED-TIME"), list(makeSymbol("-"), list(makeSymbol("GET-RUN-TIME"), makeSymbol("SELF")), makeSymbol("LAST-CALL-RUN-TIME")))), list(makeSymbol("RESET-LAST-CALL-TIME"), makeSymbol("SELF")), list(makeSymbol("RET"), makeSymbol("ELAPSED-TIME"))), list(makeSymbol("CLET"), list(list(makeSymbol("ELAPSED-TIME"), list(makeSymbol("-"), makeSymbol("END-RUN-TIME"), makeSymbol("LAST-CALL-RUN-TIME")))), list(makeSymbol("RET"), makeSymbol("ELAPSED-TIME")))));

    public static final SubLSymbol $sym76$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD");

    public static final SubLSymbol STATISTIC_MANAGER_ELAPSED_RUN_TIME_SINCE_LAST_CALL_METHOD = makeSymbol("STATISTIC-MANAGER-ELAPSED-RUN-TIME-SINCE-LAST-CALL-METHOD");



    public static final SubLList $list79 = list(new SubLObject[]{ list(makeSymbol("METHOD-COUNTER"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("INFERENCE-COUNTER"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("FI-ASK-COUNTER"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("PLAN-STATE-ASK-COUNTER"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("PLAN-COUNTER"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("PLANS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESET-COUNTERS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-EXPANSION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-INFERENCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-PLAN"), list(makeSymbol("PLAN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NUMBER-OF-INFERENCES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NUMBER-OF-EXPANSIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NUMBER-OF-PLANS"), NIL, makeKeyword("PUBLIC")) });

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_STATISTIC_MANAGER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-STATISTIC-MANAGER-CLASS");

    public static final SubLSymbol METHOD_COUNTER = makeSymbol("METHOD-COUNTER");

    public static final SubLSymbol INFERENCE_COUNTER = makeSymbol("INFERENCE-COUNTER");

    public static final SubLSymbol FI_ASK_COUNTER = makeSymbol("FI-ASK-COUNTER");

    public static final SubLSymbol PLAN_STATE_ASK_COUNTER = makeSymbol("PLAN-STATE-ASK-COUNTER");

    public static final SubLSymbol PLAN_COUNTER = makeSymbol("PLAN-COUNTER");



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_STATISTIC_MANAGER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-STATISTIC-MANAGER-INSTANCE");

    public static final SubLList $list88 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("RESET-COUNTERS"), makeSymbol("SELF")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol SHOP_STATISTIC_MANAGER_INITIALIZE_METHOD = makeSymbol("SHOP-STATISTIC-MANAGER-INITIALIZE-METHOD");

    public static final SubLSymbol RESET_COUNTERS = makeSymbol("RESET-COUNTERS");

    public static final SubLList $list91 = list(list(makeSymbol("CSETQ"), makeSymbol("METHOD-COUNTER"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("INFERENCE-COUNTER"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("FI-ASK-COUNTER"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("PLAN-STATE-ASK-COUNTER"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("PLAN-COUNTER"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("PLANS"), NIL), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol $sym92$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-STATISTIC-MANAGER-METHOD");

    public static final SubLSymbol SHOP_STATISTIC_MANAGER_RESET_COUNTERS_METHOD = makeSymbol("SHOP-STATISTIC-MANAGER-RESET-COUNTERS-METHOD");

    public static final SubLSymbol ADD_FI_ASK = makeSymbol("ADD-FI-ASK");

    public static final SubLList $list95 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    public static final SubLList $list96 = list(list(makeSymbol("RET"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("FI-ASK-COUNTER")), list(makeSymbol("+"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("FI-ASK-COUNTER"))), ONE_INTEGER))));

    public static final SubLSymbol SHOP_STATISTIC_MANAGER_ADD_FI_ASK_METHOD = makeSymbol("SHOP-STATISTIC-MANAGER-ADD-FI-ASK-METHOD");

    public static final SubLSymbol ADD_PLAN_STATE_ASK = makeSymbol("ADD-PLAN-STATE-ASK");

    public static final SubLList $list99 = list(list(makeSymbol("RET"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PLAN-STATE-ASK-COUNTER")), list(makeSymbol("+"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PLAN-STATE-ASK-COUNTER"))), ONE_INTEGER))));

    public static final SubLSymbol SHOP_STATISTIC_MANAGER_ADD_PLAN_STATE_ASK_METHOD = makeSymbol("SHOP-STATISTIC-MANAGER-ADD-PLAN-STATE-ASK-METHOD");

    public static final SubLSymbol ADD_EXPANSION = makeSymbol("ADD-EXPANSION");

    public static final SubLList $list102 = list(list(makeSymbol("RET"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("METHOD-COUNTER")), list(makeSymbol("+"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("METHOD-COUNTER"))), ONE_INTEGER))));

    public static final SubLSymbol SHOP_STATISTIC_MANAGER_ADD_EXPANSION_METHOD = makeSymbol("SHOP-STATISTIC-MANAGER-ADD-EXPANSION-METHOD");

    public static final SubLSymbol ADD_INFERENCE = makeSymbol("ADD-INFERENCE");

    public static final SubLList $list105 = list(list(makeSymbol("RET"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("INFERENCE-COUNTER")), list(makeSymbol("+"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("INFERENCE-COUNTER"))), ONE_INTEGER))));

    public static final SubLSymbol SHOP_STATISTIC_MANAGER_ADD_INFERENCE_METHOD = makeSymbol("SHOP-STATISTIC-MANAGER-ADD-INFERENCE-METHOD");

    public static final SubLSymbol ADD_PLAN = makeSymbol("ADD-PLAN");

    public static final SubLList $list108 = list(makeSymbol("PLAN"));

    public static final SubLList $list109 = list(list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PLANS")), list(makeSymbol("CONS"), makeSymbol("PLAN"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PLANS"))))), list(makeSymbol("RET"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PLAN-COUNTER")), list(makeSymbol("+"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PLAN-COUNTER"))), ONE_INTEGER))));

    public static final SubLSymbol SHOP_STATISTIC_MANAGER_ADD_PLAN_METHOD = makeSymbol("SHOP-STATISTIC-MANAGER-ADD-PLAN-METHOD");



    public static final SubLList $list112 = list(list(makeSymbol("RET"), makeSymbol("INFERENCE-COUNTER")));

    public static final SubLSymbol $sym113$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-STATISTIC-MANAGER-METHOD");

    public static final SubLSymbol SHOP_STATISTIC_MANAGER_NUMBER_OF_INFERENCES_METHOD = makeSymbol("SHOP-STATISTIC-MANAGER-NUMBER-OF-INFERENCES-METHOD");

    public static final SubLSymbol NUMBER_OF_METHODS = makeSymbol("NUMBER-OF-METHODS");

    public static final SubLList $list116 = list(list(makeSymbol("RET"), makeSymbol("METHOD-COUNTER")));

    public static final SubLSymbol $sym117$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-STATISTIC-MANAGER-METHOD");

    public static final SubLSymbol SHOP_STATISTIC_MANAGER_NUMBER_OF_METHODS_METHOD = makeSymbol("SHOP-STATISTIC-MANAGER-NUMBER-OF-METHODS-METHOD");



    public static final SubLSymbol $sym120$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-STATISTIC-MANAGER-METHOD");

    public static final SubLSymbol SHOP_STATISTIC_MANAGER_NUMBER_OF_EXPANSIONS_METHOD = makeSymbol("SHOP-STATISTIC-MANAGER-NUMBER-OF-EXPANSIONS-METHOD");

    public static final SubLSymbol NUMBER_OF_PLANS = makeSymbol("NUMBER-OF-PLANS");

    public static final SubLList $list123 = list(list(makeSymbol("RET"), makeSymbol("PLAN-COUNTER")));

    public static final SubLSymbol $sym124$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-STATISTIC-MANAGER-METHOD");

    public static final SubLSymbol SHOP_STATISTIC_MANAGER_NUMBER_OF_PLANS_METHOD = makeSymbol("SHOP-STATISTIC-MANAGER-NUMBER-OF-PLANS-METHOD");

    public static final SubLSymbol NUMBER_OF_FI_ASKS = makeSymbol("NUMBER-OF-FI-ASKS");

    public static final SubLList $list127 = list(list(makeSymbol("RET"), makeSymbol("FI-ASK-COUNTER")));

    public static final SubLSymbol $sym128$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-STATISTIC-MANAGER-METHOD");

    public static final SubLSymbol SHOP_STATISTIC_MANAGER_NUMBER_OF_FI_ASKS_METHOD = makeSymbol("SHOP-STATISTIC-MANAGER-NUMBER-OF-FI-ASKS-METHOD");

    public static final SubLSymbol NUMBER_OF_PLAN_STATE_ASKS = makeSymbol("NUMBER-OF-PLAN-STATE-ASKS");

    public static final SubLList $list131 = list(list(makeSymbol("RET"), makeSymbol("PLAN-STATE-ASK-COUNTER")));

    public static final SubLSymbol $sym132$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-STATISTIC-MANAGER-METHOD");

    public static final SubLSymbol SHOP_STATISTIC_MANAGER_NUMBER_OF_PLAN_STATE_ASKS_METHOD = makeSymbol("SHOP-STATISTIC-MANAGER-NUMBER-OF-PLAN-STATE-ASKS-METHOD");



    public static final SubLList $list135 = list(new SubLObject[]{ list(makeSymbol("VARIABLE-ASSOC-TABLE"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("VARIABLE-COUNTER"), makeKeyword("CLASS"), makeKeyword("PUBLIC")), list(makeSymbol("VARIABLE-PREFIX"), makeKeyword("CLASS"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("GENERATE-VARIABLE"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("GENERATED-VARIABLE?"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GENERATE-BINDING-PAIR"), list(makeSymbol("OLD-VAR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RECOVER-EL-VARIABLE"), list(makeSymbol("HL-VAR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GATHER-EL-VARIABLES"), list(makeSymbol("FORM"), makeSymbol("MBINDING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MANAGED-VARIABLE?"), list(makeSymbol("VAR")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REPLACE-VARIABLES"), list(makeSymbol("FORM"), makeSymbol("MBINDING")), makeKeyword("PUBLIC")) });

    public static final SubLSymbol VARIABLE_COUNTER = makeSymbol("VARIABLE-COUNTER");

    public static final SubLSymbol VARIABLE_PREFIX = makeSymbol("VARIABLE-PREFIX");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_VARIABLE_MANAGER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-VARIABLE-MANAGER-CLASS");

    public static final SubLSymbol VARIABLE_ASSOC_TABLE = makeSymbol("VARIABLE-ASSOC-TABLE");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_VARIABLE_MANAGER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-VARIABLE-MANAGER-INSTANCE");

    public static final SubLList $list141 = list(makeKeyword("PROTECTED"), makeKeyword("NO-MEMBER-VARIABLES"));

    public static final SubLList $list142 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("VARIABLE-PREFIX")), makeString("?PV-")), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("VARIABLE-ASSOC-TABLE")))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("VARIABLE-COUNTER")), ZERO_INTEGER), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("VARIABLE-ASSOC-TABLE")), list(makeSymbol("MAKE-HASH-TABLE"), makeInteger(100)))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLString $str143$_PV_ = makeString("?PV-");



    public static final SubLSymbol SHOP_VARIABLE_MANAGER_INITIALIZE_METHOD = makeSymbol("SHOP-VARIABLE-MANAGER-INITIALIZE-METHOD");

    public static final SubLSymbol GENERATE_VARIABLE = makeSymbol("GENERATE-VARIABLE");

    public static final SubLList $list147 = list(makeString("@return shop-variablep; a previously unused variable"), list(makeSymbol("CLET"), list(list(makeSymbol("VAR-NAME"), list(makeSymbol("CCONCATENATE"), makeSymbol("VARIABLE-PREFIX"), list(makeSymbol("WRITE-TO-STRING"), makeSymbol("VARIABLE-COUNTER")))), list(makeSymbol("VAR-SYMBOL"), list(makeSymbol("INTERN"), makeSymbol("VAR-NAME"), list(makeSymbol("FIND-PACKAGE"), makeString("CYC"))))), list(makeSymbol("CINC"), makeSymbol("VARIABLE-COUNTER")), list(makeSymbol("RET"), makeSymbol("VAR-SYMBOL"))));

    public static final SubLSymbol $sym148$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-VARIABLE-MANAGER-METHOD");

    public static final SubLString $$$CYC = makeString("CYC");

    public static final SubLSymbol SHOP_VARIABLE_MANAGER_GENERATE_VARIABLE_METHOD = makeSymbol("SHOP-VARIABLE-MANAGER-GENERATE-VARIABLE-METHOD");

    public static final SubLSymbol GENERATE_BINDING_PAIR = makeSymbol("GENERATE-BINDING-PAIR");

    public static final SubLList $list152 = list(makeSymbol("OLD-VAR"));

    public static final SubLList $list153 = list(makeString("Returns a binding pair that maps OLD-VAR to a new, previously unused variable.\n  @param   OLD-VAR  shop-variablep; variable to be replaced.\n  @return consp ; (OLD-VAR . NEW-VAR)"), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-VAR"), list(makeSymbol("GENERATE-VARIABLE"), makeSymbol("SELF")))), list(makeSymbol("CSETF"), list(makeSymbol("GETHASH"), makeSymbol("NEW-VAR"), makeSymbol("VARIABLE-ASSOC-TABLE")), makeSymbol("OLD-VAR")), list(makeSymbol("RET"), list(makeSymbol("CONS"), makeSymbol("OLD-VAR"), makeSymbol("NEW-VAR")))));

    public static final SubLSymbol $sym154$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-VARIABLE-MANAGER-METHOD");

    public static final SubLSymbol SHOP_VARIABLE_MANAGER_GENERATE_BINDING_PAIR_METHOD = makeSymbol("SHOP-VARIABLE-MANAGER-GENERATE-BINDING-PAIR-METHOD");

    public static final SubLSymbol GENERATE_BINDING_LIST = makeSymbol("GENERATE-BINDING-LIST");

    public static final SubLList $list157 = list(makeSymbol("OLD-VAR-LIST"));

    public static final SubLList $list158 = list(makeString("@param OLD-VAR-LIST consp; the list of variables to be replaced.\n   @return consp ; the list of variable bindings."), list(makeSymbol("CLET"), list(list(makeSymbol("BLIST"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("OLD-VAR"), makeSymbol("OLD-VAR-LIST")), list(makeSymbol("CPUSH"), list(makeSymbol("GENERATE-BINDING-PAIR"), makeSymbol("SELF"), makeSymbol("OLD-VAR")), makeSymbol("BLIST"))), list(makeSymbol("RET"), makeSymbol("BLIST"))));

    public static final SubLSymbol SHOP_VARIABLE_MANAGER_GENERATE_BINDING_LIST_METHOD = makeSymbol("SHOP-VARIABLE-MANAGER-GENERATE-BINDING-LIST-METHOD");

    public static final SubLSymbol RECOVER_EL_VARIABLE = makeSymbol("RECOVER-EL-VARIABLE");

    public static final SubLList $list161 = list(makeSymbol("HL-VAR"));

    public static final SubLList $list162 = list(makeString("@param    HL-VAR shop-variablep; a variable managed by SELF\n   @return  shop-variablep; the original, and usually more user-friendly name for the variable."), list(makeSymbol("CLET"), list(list(makeSymbol("EL-VAR"), list(makeSymbol("GETHASH"), makeSymbol("HL-VAR"), makeSymbol("VARIABLE-ASSOC-TABLE")))), list(makeSymbol("PWHEN"), makeSymbol("EL-VAR"), list(makeSymbol("RET"), makeSymbol("EL-VAR"))), list(makeSymbol("CERROR"), makeString("VARIABLE ERROR"), makeString("~s is not a known variable to ~s~%"), makeSymbol("HL-VAR"), makeSymbol("SELF")), list(makeSymbol("RET"), NIL)));

    public static final SubLSymbol $sym163$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-VARIABLE-MANAGER-METHOD");

    public static final SubLString $$$VARIABLE_ERROR = makeString("VARIABLE ERROR");

    public static final SubLString $str165$_s_is_not_a_known_variable_to__s_ = makeString("~s is not a known variable to ~s~%");

    public static final SubLSymbol SHOP_VARIABLE_MANAGER_RECOVER_EL_VARIABLE_METHOD = makeSymbol("SHOP-VARIABLE-MANAGER-RECOVER-EL-VARIABLE-METHOD");

    public static final SubLSymbol GATHER_EL_VARIABLES = makeSymbol("GATHER-EL-VARIABLES");

    public static final SubLList $list168 = list(makeSymbol("FORM"), makeSymbol("MBINDING"));

    public static final SubLList $list169 = list(makeString("Finds all the variables in FORM unbound by MBINDING\n   @param  FORM      consp ;the formula with variables \n   @param  MBINDING  multibinding-p ;mbinding that binds some of the variables.\n   @return consp ;list of all unbound variables."), list(makeSymbol("CLET"), list(list(makeSymbol("UNBOUND-VARS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-VAR"), list(makeSymbol("TREE-GATHER"), makeSymbol("FORM"), list(makeSymbol("FUNCTION"), makeSymbol("SHOP-VARIABLEP")))), list(makeSymbol("PUNLESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GENERATED-VARIABLE?"), makeSymbol("SHOP-VARIABLE-MANAGER")), list(makeSymbol("QUOTE"), makeSymbol("SHOP-VARIABLE-MANAGER")), makeSymbol("CUR-VAR")), list(makeSymbol("PWHEN"), list(makeSymbol("FREE-VARIABLE-IN-MULTIBINDING?"), makeSymbol("CUR-VAR"), makeSymbol("MBINDING")), list(makeSymbol("CPUSH"), makeSymbol("CUR-VAR"), makeSymbol("UNBOUND-VARS"))))), list(makeSymbol("RET"), list(makeSymbol("REVERSE"), makeSymbol("UNBOUND-VARS")))));

    public static final SubLSymbol SHOP_VARIABLEP = makeSymbol("SHOP-VARIABLEP");

    public static final SubLSymbol SHOP_VARIABLE_MANAGER_GATHER_EL_VARIABLES_METHOD = makeSymbol("SHOP-VARIABLE-MANAGER-GATHER-EL-VARIABLES-METHOD");

    public static final SubLSymbol $sym172$MANAGED_VARIABLE_ = makeSymbol("MANAGED-VARIABLE?");

    public static final SubLList $list173 = list(makeSymbol("VAR"));

    public static final SubLList $list174 = list(list(makeSymbol("RET"), list(makeSymbol("FIF"), list(makeSymbol("GETHASH"), makeSymbol("VAR"), makeSymbol("VARIABLE-ASSOC-TABLE")), T, NIL)));

    public static final SubLSymbol $sym175$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-VARIABLE-MANAGER-METHOD");

    public static final SubLSymbol $sym176$SHOP_VARIABLE_MANAGER_MANAGED_VARIABLE__METHOD = makeSymbol("SHOP-VARIABLE-MANAGER-MANAGED-VARIABLE?-METHOD");

    public static final SubLSymbol $sym177$GENERATED_VARIABLE_ = makeSymbol("GENERATED-VARIABLE?");

    public static final SubLList $list178 = list(makeString("@param VAR shop-variablep\n   @return booleanp\n   returns T if VAR could have been generated by an instance of\n   SHOP-VARIABLE-MANAGER, and NIL otherwise.\n   (check-type var shop-variablep)"), list(makeSymbol("PUNLESS"), list(makeSymbol("SYMBOLP"), makeSymbol("VAR")), list(makeSymbol("RET"), NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("VARIABLE-P"), makeSymbol("VAR")), list(makeSymbol("RET"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("VAR-NAME"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("VAR"))), list(makeSymbol("MIN-LENGTH"), list(makeSymbol("LENGTH"), makeSymbol("VARIABLE-PREFIX"))), list(makeSymbol("VAR-PREFIX"), list(makeSymbol("FIF"), list(makeSymbol(">="), list(makeSymbol("LENGTH"), makeSymbol("VAR-NAME")), makeSymbol("MIN-LENGTH")), list(makeSymbol("SUBSTRING"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("VAR")), ZERO_INTEGER, list(makeSymbol("LENGTH"), makeSymbol("VARIABLE-PREFIX"))), makeString("")))), list(makeSymbol("PIF"), list(makeSymbol("STRING="), makeSymbol("VAR-PREFIX"), makeSymbol("VARIABLE-PREFIX")), list(makeSymbol("RET"), T), list(makeSymbol("RET"), NIL))));

    public static final SubLSymbol $sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-VARIABLE-MANAGER-METHOD");

    public static final SubLString $str180$ = makeString("");

    public static final SubLSymbol $sym181$SHOP_VARIABLE_MANAGER_GENERATED_VARIABLE__METHOD = makeSymbol("SHOP-VARIABLE-MANAGER-GENERATED-VARIABLE?-METHOD");

    public static final SubLSymbol GENERATED_VARIABLES_BOUND = makeSymbol("GENERATED-VARIABLES-BOUND");

    public static final SubLList $list183 = list(makeSymbol("BINDING"));

    public static final SubLList $list184 = list(makeString("@param BINDING listp\n   @return listp"), list(makeSymbol("CLET"), list(list(makeSymbol("BPAIRS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-PAIR"), makeSymbol("BINDING")), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GENERATED-VARIABLE?"), makeSymbol("SHOP-VARIABLE-MANAGER")), list(makeSymbol("QUOTE"), makeSymbol("SHOP-VARIABLE-MANAGER")), list(makeSymbol("FIRST"), makeSymbol("CUR-PAIR"))), list(makeSymbol("CPUSH"), makeSymbol("CUR-PAIR"), makeSymbol("BPAIRS")))), list(makeSymbol("RET"), makeSymbol("BPAIRS"))));

    public static final SubLSymbol SHOP_VARIABLE_MANAGER_GENERATED_VARIABLES_BOUND_METHOD = makeSymbol("SHOP-VARIABLE-MANAGER-GENERATED-VARIABLES-BOUND-METHOD");

    public static final SubLSymbol REPLACE_VARIABLES = makeSymbol("REPLACE-VARIABLES");

    public static final SubLList $list187 = list(makeString("replaces all variables in FORM that are currently not bound by \n   MBINDING. \n   @param    FORM      hl-formula-p        ;formula with vars to replace\n   @param    MBINDING  multibinding-p      ;multibinding that applies to FORM\'s vars\n   @return  consp"), list(makeSymbol("CLET"), list(list(makeSymbol("OLD-VARS"), list(makeSymbol("GATHER-EL-VARIABLES"), makeSymbol("SELF"), makeSymbol("FORM"), makeSymbol("MBINDING"))), list(makeSymbol("BLIST"), list(makeSymbol("GENERATE-BINDING-LIST"), makeSymbol("SELF"), makeSymbol("OLD-VARS")))), list(makeSymbol("RET"), list(makeSymbol("SUBLIS"), makeSymbol("BLIST"), makeSymbol("FORM")))));

    public static final SubLSymbol SHOP_VARIABLE_MANAGER_REPLACE_VARIABLES_METHOD = makeSymbol("SHOP-VARIABLE-MANAGER-REPLACE-VARIABLES-METHOD");

    public static final SubLSymbol RECOVER_EL = makeSymbol("RECOVER-EL");

    public static final SubLList $list190 = list(makeSymbol("TREE"));

    public static final SubLList $list191 = list(makeString("@param TREE listp\n   Return the TREE, will all managed variables replaced with\n   their el labels."), list(makeSymbol("CLET"), list(list(makeSymbol("HL-VARS"), list(makeSymbol("TREE-GATHER"), makeSymbol("TREE"), list(makeSymbol("FUNCTION"), makeSymbol("SHOP-VARIABLEP")))), list(makeSymbol("NEW-TREE"), list(makeSymbol("COPY-TREE"), makeSymbol("TREE")))), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-VAR"), makeSymbol("HL-VARS")), list(makeSymbol("PWHEN"), list(makeSymbol("MANAGED-VARIABLE?"), makeSymbol("SELF"), makeSymbol("CUR-VAR")), list(makeSymbol("CSETQ"), makeSymbol("NEW-TREE"), list(makeSymbol("NSUBST"), list(makeSymbol("RECOVER-EL-VARIABLE"), makeSymbol("SELF"), makeSymbol("CUR-VAR")), makeSymbol("CUR-VAR"), makeSymbol("NEW-TREE"))))), list(makeSymbol("RET"), makeSymbol("NEW-TREE"))));

    public static final SubLSymbol SHOP_VARIABLE_MANAGER_RECOVER_EL_METHOD = makeSymbol("SHOP-VARIABLE-MANAGER-RECOVER-EL-METHOD");

    private static final SubLObject $$argIsa = reader_make_constant_shell(makeString("argIsa"));



    private static final SubLObject $$argGenl = reader_make_constant_shell(makeString("argGenl"));

    public static SubLObject lispify_cyc_bindings(final SubLObject cyc_bindings_list) {
        SubLObject shop_bindings = NIL;
        SubLObject cdolist_list_var = cyc_bindings_list;
        SubLObject cyc_binding = NIL;
        cyc_binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (cyc_binding.eql($list2)) {
                shop_bindings = cons($list3, shop_bindings);
            } else {
                shop_bindings = cons(cons(cyc_binding.first(), cyc_binding.rest()), shop_bindings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cyc_binding = cdolist_list_var.first();
        } 
        return shop_bindings;
    }

    public static SubLObject shop_translate_plan(final SubLObject plan) {
        final SubLObject plan_length = length(plan);
        SubLObject cyc_assertions = NIL;
        SubLObject formula = NIL;
        SubLObject cyc_assertion = NIL;
        SubLObject index;
        SubLObject cdolist_list_var;
        SubLObject v_term;
        for (index = NIL, index = ZERO_INTEGER; !index.numGE(plan_length); index = add(index, ONE_INTEGER)) {
            formula = nth(index, plan);
            cyc_assertion = NIL;
            cdolist_list_var = formula;
            v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == v_term) {
                    return NIL;
                }
                cyc_assertion = cons(v_term, cyc_assertion);
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
            cyc_assertion = reverse(cyc_assertion);
            cyc_assertions = cons(cyc_assertion, cyc_assertions);
        }
        reverse(cyc_assertions);
        return reverse(cyc_assertions);
    }

    public static SubLObject inc_slot(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = NIL;
        SubLObject slot = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        slot = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(SET_SLOT, v_object, slot, list($sym6$1_, list(GET_SLOT, v_object, slot)));
        }
        cdestructuring_bind_error(datum, $list4);
        return NIL;
    }

    public static SubLObject process_timer_p(final SubLObject process_timer) {
        return interfaces.subloop_instanceof_interface(process_timer, PROCESS_TIMER);
    }

    public static SubLObject get_statistic_manager_last_call_real_time(final SubLObject statistic_manager) {
        return classes.subloop_get_access_protected_instance_slot(statistic_manager, SEVEN_INTEGER, LAST_CALL_REAL_TIME);
    }

    public static SubLObject set_statistic_manager_last_call_real_time(final SubLObject statistic_manager, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(statistic_manager, value, SEVEN_INTEGER, LAST_CALL_REAL_TIME);
    }

    public static SubLObject get_statistic_manager_last_call_run_time(final SubLObject statistic_manager) {
        return classes.subloop_get_access_protected_instance_slot(statistic_manager, SIX_INTEGER, LAST_CALL_RUN_TIME);
    }

    public static SubLObject set_statistic_manager_last_call_run_time(final SubLObject statistic_manager, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(statistic_manager, value, SIX_INTEGER, LAST_CALL_RUN_TIME);
    }

    public static SubLObject get_statistic_manager_end_real_time(final SubLObject statistic_manager) {
        return classes.subloop_get_access_protected_instance_slot(statistic_manager, FIVE_INTEGER, END_REAL_TIME);
    }

    public static SubLObject set_statistic_manager_end_real_time(final SubLObject statistic_manager, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(statistic_manager, value, FIVE_INTEGER, END_REAL_TIME);
    }

    public static SubLObject get_statistic_manager_end_run_time(final SubLObject statistic_manager) {
        return classes.subloop_get_access_protected_instance_slot(statistic_manager, FOUR_INTEGER, END_RUN_TIME);
    }

    public static SubLObject set_statistic_manager_end_run_time(final SubLObject statistic_manager, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(statistic_manager, value, FOUR_INTEGER, END_RUN_TIME);
    }

    public static SubLObject get_statistic_manager_start_real_time(final SubLObject statistic_manager) {
        return classes.subloop_get_access_protected_instance_slot(statistic_manager, THREE_INTEGER, START_REAL_TIME);
    }

    public static SubLObject set_statistic_manager_start_real_time(final SubLObject statistic_manager, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(statistic_manager, value, THREE_INTEGER, START_REAL_TIME);
    }

    public static SubLObject get_statistic_manager_start_run_time(final SubLObject statistic_manager) {
        return classes.subloop_get_access_protected_instance_slot(statistic_manager, TWO_INTEGER, START_RUN_TIME);
    }

    public static SubLObject set_statistic_manager_start_run_time(final SubLObject statistic_manager, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(statistic_manager, value, TWO_INTEGER, START_RUN_TIME);
    }

    public static SubLObject get_statistic_manager_timingP(final SubLObject statistic_manager) {
        return classes.subloop_get_access_protected_instance_slot(statistic_manager, ONE_INTEGER, $sym20$TIMING_);
    }

    public static SubLObject set_statistic_manager_timingP(final SubLObject statistic_manager, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(statistic_manager, value, ONE_INTEGER, $sym20$TIMING_);
    }

    public static SubLObject subloop_reserved_initialize_statistic_manager_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_statistic_manager_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, STATISTIC_MANAGER, $sym20$TIMING_, NIL);
        classes.subloop_initialize_slot(new_instance, STATISTIC_MANAGER, START_RUN_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, STATISTIC_MANAGER, START_REAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, STATISTIC_MANAGER, END_RUN_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, STATISTIC_MANAGER, END_REAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, STATISTIC_MANAGER, LAST_CALL_RUN_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, STATISTIC_MANAGER, LAST_CALL_REAL_TIME, NIL);
        return NIL;
    }

    public static SubLObject statistic_manager_p(final SubLObject statistic_manager) {
        return classes.subloop_instanceof_class(statistic_manager, STATISTIC_MANAGER);
    }

    public static SubLObject statistic_manager_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        statistic_manager_reset_timing_method(self);
        return self;
    }

    public static SubLObject statistic_manager_get_run_time_method(final SubLObject self) {
        return get_internal_run_time();
    }

    public static SubLObject statistic_manager_get_real_time_method(final SubLObject self) {
        return get_internal_real_time();
    }

    public static SubLObject statistic_manager_reset_last_call_time_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_statistic_manager_method = NIL;
        SubLObject last_call_real_time = get_statistic_manager_last_call_real_time(self);
        SubLObject last_call_run_time = get_statistic_manager_last_call_run_time(self);
        try {
            thread.throwStack.push($sym39$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
            try {
                last_call_run_time = statistic_manager_get_run_time_method(self);
                last_call_real_time = statistic_manager_get_real_time_method(self);
                sublisp_throw($sym39$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_statistic_manager_last_call_real_time(self, last_call_real_time);
                    set_statistic_manager_last_call_run_time(self, last_call_run_time);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, $sym39$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_statistic_manager_method;
    }

    public static SubLObject statistic_manager_start_timing_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_statistic_manager_method = NIL;
        SubLObject start_real_time = get_statistic_manager_start_real_time(self);
        SubLObject start_run_time = get_statistic_manager_start_run_time(self);
        SubLObject timingP = get_statistic_manager_timingP(self);
        try {
            thread.throwStack.push($sym44$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
            try {
                start_run_time = statistic_manager_get_run_time_method(self);
                start_real_time = statistic_manager_get_real_time_method(self);
                statistic_manager_reset_last_call_time_method(self);
                timingP = T;
                sublisp_throw($sym44$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_statistic_manager_start_real_time(self, start_real_time);
                    set_statistic_manager_start_run_time(self, start_run_time);
                    set_statistic_manager_timingP(self, timingP);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, $sym44$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_statistic_manager_method;
    }

    public static SubLObject statistic_manager_resume_timing_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_statistic_manager_method = NIL;
        SubLObject timingP = get_statistic_manager_timingP(self);
        try {
            thread.throwStack.push($sym48$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
            try {
                statistic_manager_reset_last_call_time_method(self);
                timingP = T;
                sublisp_throw($sym48$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_statistic_manager_timingP(self, timingP);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, $sym48$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_statistic_manager_method;
    }

    public static SubLObject statistic_manager_stop_timing_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_statistic_manager_method = NIL;
        SubLObject end_real_time = get_statistic_manager_end_real_time(self);
        SubLObject end_run_time = get_statistic_manager_end_run_time(self);
        SubLObject timingP = get_statistic_manager_timingP(self);
        try {
            thread.throwStack.push($sym52$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
            try {
                end_run_time = statistic_manager_get_run_time_method(self);
                end_real_time = statistic_manager_get_real_time_method(self);
                timingP = NIL;
                sublisp_throw($sym52$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_statistic_manager_end_real_time(self, end_real_time);
                    set_statistic_manager_end_run_time(self, end_run_time);
                    set_statistic_manager_timingP(self, timingP);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, $sym52$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_statistic_manager_method;
    }

    public static SubLObject statistic_manager_is_timingP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_statistic_manager_method = NIL;
        final SubLObject timingP = get_statistic_manager_timingP(self);
        try {
            thread.throwStack.push($sym56$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
            try {
                sublisp_throw($sym56$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, timingP);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_statistic_manager_timingP(self, timingP);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, $sym56$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_statistic_manager_method;
    }

    public static SubLObject statistic_manager_elapsed_real_time_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_statistic_manager_method = NIL;
        final SubLObject end_real_time = get_statistic_manager_end_real_time(self);
        final SubLObject start_real_time = get_statistic_manager_start_real_time(self);
        final SubLObject timingP = get_statistic_manager_timingP(self);
        try {
            thread.throwStack.push($sym60$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
            try {
                if (NIL != timingP) {
                    sublisp_throw($sym60$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, subtract(statistic_manager_get_real_time_method(self), start_real_time));
                } else {
                    sublisp_throw($sym60$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, subtract(end_real_time, start_real_time));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_statistic_manager_end_real_time(self, end_real_time);
                    set_statistic_manager_start_real_time(self, start_real_time);
                    set_statistic_manager_timingP(self, timingP);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, $sym60$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_statistic_manager_method;
    }

    public static SubLObject statistic_manager_elapsed_run_time_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_statistic_manager_method = NIL;
        final SubLObject end_run_time = get_statistic_manager_end_run_time(self);
        final SubLObject start_run_time = get_statistic_manager_start_run_time(self);
        final SubLObject timingP = get_statistic_manager_timingP(self);
        try {
            thread.throwStack.push($sym64$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
            try {
                if (NIL != timingP) {
                    sublisp_throw($sym64$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, subtract(statistic_manager_get_run_time_method(self), start_run_time));
                } else {
                    sublisp_throw($sym64$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, subtract(end_run_time, start_run_time));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_statistic_manager_end_run_time(self, end_run_time);
                    set_statistic_manager_start_run_time(self, start_run_time);
                    set_statistic_manager_timingP(self, timingP);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, $sym64$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_statistic_manager_method;
    }

    public static SubLObject statistic_manager_reset_timing_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_statistic_manager_method = NIL;
        SubLObject last_call_real_time = get_statistic_manager_last_call_real_time(self);
        SubLObject last_call_run_time = get_statistic_manager_last_call_run_time(self);
        SubLObject end_real_time = get_statistic_manager_end_real_time(self);
        SubLObject end_run_time = get_statistic_manager_end_run_time(self);
        SubLObject start_real_time = get_statistic_manager_start_real_time(self);
        SubLObject start_run_time = get_statistic_manager_start_run_time(self);
        SubLObject timingP = get_statistic_manager_timingP(self);
        try {
            thread.throwStack.push($sym68$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
            try {
                timingP = NIL;
                start_real_time = ZERO_INTEGER;
                end_real_time = ZERO_INTEGER;
                start_run_time = ZERO_INTEGER;
                end_run_time = ZERO_INTEGER;
                last_call_run_time = ZERO_INTEGER;
                last_call_real_time = ZERO_INTEGER;
                sublisp_throw($sym68$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_statistic_manager_last_call_real_time(self, last_call_real_time);
                    set_statistic_manager_last_call_run_time(self, last_call_run_time);
                    set_statistic_manager_end_real_time(self, end_real_time);
                    set_statistic_manager_end_run_time(self, end_run_time);
                    set_statistic_manager_start_real_time(self, start_real_time);
                    set_statistic_manager_start_run_time(self, start_run_time);
                    set_statistic_manager_timingP(self, timingP);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, $sym68$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_statistic_manager_method;
    }

    public static SubLObject statistic_manager_elapsed_real_time_since_last_call_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_statistic_manager_method = NIL;
        final SubLObject last_call_real_time = get_statistic_manager_last_call_real_time(self);
        final SubLObject end_real_time = get_statistic_manager_end_real_time(self);
        final SubLObject timingP = get_statistic_manager_timingP(self);
        try {
            thread.throwStack.push($sym72$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
            try {
                if (NIL != timingP) {
                    final SubLObject elapsed_time = subtract(statistic_manager_get_real_time_method(self), last_call_real_time);
                    statistic_manager_reset_last_call_time_method(self);
                    sublisp_throw($sym72$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, elapsed_time);
                } else {
                    final SubLObject elapsed_time = subtract(end_real_time, last_call_real_time);
                    sublisp_throw($sym72$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, elapsed_time);
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_statistic_manager_last_call_real_time(self, last_call_real_time);
                    set_statistic_manager_end_real_time(self, end_real_time);
                    set_statistic_manager_timingP(self, timingP);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, $sym72$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_statistic_manager_method;
    }

    public static SubLObject statistic_manager_elapsed_run_time_since_last_call_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_statistic_manager_method = NIL;
        final SubLObject last_call_run_time = get_statistic_manager_last_call_run_time(self);
        final SubLObject end_run_time = get_statistic_manager_end_run_time(self);
        final SubLObject timingP = get_statistic_manager_timingP(self);
        try {
            thread.throwStack.push($sym76$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
            try {
                if (NIL != timingP) {
                    final SubLObject elapsed_time = subtract(statistic_manager_get_run_time_method(self), last_call_run_time);
                    statistic_manager_reset_last_call_time_method(self);
                    sublisp_throw($sym76$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, elapsed_time);
                } else {
                    final SubLObject elapsed_time = subtract(end_run_time, last_call_run_time);
                    sublisp_throw($sym76$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, elapsed_time);
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_statistic_manager_last_call_run_time(self, last_call_run_time);
                    set_statistic_manager_end_run_time(self, end_run_time);
                    set_statistic_manager_timingP(self, timingP);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, $sym76$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_statistic_manager_method;
    }

    public static SubLObject get_shop_statistic_manager_plans(final SubLObject shop_statistic_manager) {
        return classes.subloop_get_instance_slot(shop_statistic_manager, THIRTEEN_INTEGER);
    }

    public static SubLObject set_shop_statistic_manager_plans(final SubLObject shop_statistic_manager, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_statistic_manager, value, THIRTEEN_INTEGER);
    }

    public static SubLObject get_shop_statistic_manager_plan_counter(final SubLObject shop_statistic_manager) {
        return classes.subloop_get_instance_slot(shop_statistic_manager, TWELVE_INTEGER);
    }

    public static SubLObject set_shop_statistic_manager_plan_counter(final SubLObject shop_statistic_manager, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_statistic_manager, value, TWELVE_INTEGER);
    }

    public static SubLObject get_shop_statistic_manager_plan_state_ask_counter(final SubLObject shop_statistic_manager) {
        return classes.subloop_get_instance_slot(shop_statistic_manager, ELEVEN_INTEGER);
    }

    public static SubLObject set_shop_statistic_manager_plan_state_ask_counter(final SubLObject shop_statistic_manager, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_statistic_manager, value, ELEVEN_INTEGER);
    }

    public static SubLObject get_shop_statistic_manager_fi_ask_counter(final SubLObject shop_statistic_manager) {
        return classes.subloop_get_instance_slot(shop_statistic_manager, TEN_INTEGER);
    }

    public static SubLObject set_shop_statistic_manager_fi_ask_counter(final SubLObject shop_statistic_manager, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_statistic_manager, value, TEN_INTEGER);
    }

    public static SubLObject get_shop_statistic_manager_inference_counter(final SubLObject shop_statistic_manager) {
        return classes.subloop_get_instance_slot(shop_statistic_manager, NINE_INTEGER);
    }

    public static SubLObject set_shop_statistic_manager_inference_counter(final SubLObject shop_statistic_manager, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_statistic_manager, value, NINE_INTEGER);
    }

    public static SubLObject get_shop_statistic_manager_method_counter(final SubLObject shop_statistic_manager) {
        return classes.subloop_get_instance_slot(shop_statistic_manager, EIGHT_INTEGER);
    }

    public static SubLObject set_shop_statistic_manager_method_counter(final SubLObject shop_statistic_manager, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_statistic_manager, value, EIGHT_INTEGER);
    }

    public static SubLObject subloop_reserved_initialize_shop_statistic_manager_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_statistic_manager_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, STATISTIC_MANAGER, $sym20$TIMING_, NIL);
        classes.subloop_initialize_slot(new_instance, STATISTIC_MANAGER, START_RUN_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, STATISTIC_MANAGER, START_REAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, STATISTIC_MANAGER, END_RUN_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, STATISTIC_MANAGER, END_REAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, STATISTIC_MANAGER, LAST_CALL_RUN_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, STATISTIC_MANAGER, LAST_CALL_REAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_STATISTIC_MANAGER, METHOD_COUNTER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_STATISTIC_MANAGER, INFERENCE_COUNTER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_STATISTIC_MANAGER, FI_ASK_COUNTER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_STATISTIC_MANAGER, PLAN_STATE_ASK_COUNTER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_STATISTIC_MANAGER, PLAN_COUNTER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_STATISTIC_MANAGER, PLANS, NIL);
        return NIL;
    }

    public static SubLObject shop_statistic_manager_p(final SubLObject shop_statistic_manager) {
        return classes.subloop_instanceof_class(shop_statistic_manager, SHOP_STATISTIC_MANAGER);
    }

    public static SubLObject shop_statistic_manager_initialize_method(final SubLObject self) {
        statistic_manager_initialize_method(self);
        shop_statistic_manager_reset_counters_method(self);
        return self;
    }

    public static SubLObject shop_statistic_manager_reset_counters_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_statistic_manager_method = NIL;
        SubLObject plans = get_shop_statistic_manager_plans(self);
        SubLObject plan_counter = get_shop_statistic_manager_plan_counter(self);
        SubLObject plan_state_ask_counter = get_shop_statistic_manager_plan_state_ask_counter(self);
        SubLObject fi_ask_counter = get_shop_statistic_manager_fi_ask_counter(self);
        SubLObject inference_counter = get_shop_statistic_manager_inference_counter(self);
        SubLObject method_counter = get_shop_statistic_manager_method_counter(self);
        try {
            thread.throwStack.push($sym92$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
            try {
                method_counter = ZERO_INTEGER;
                inference_counter = ZERO_INTEGER;
                fi_ask_counter = ZERO_INTEGER;
                plan_state_ask_counter = ZERO_INTEGER;
                plan_counter = ZERO_INTEGER;
                plans = NIL;
                sublisp_throw($sym92$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_statistic_manager_plans(self, plans);
                    set_shop_statistic_manager_plan_counter(self, plan_counter);
                    set_shop_statistic_manager_plan_state_ask_counter(self, plan_state_ask_counter);
                    set_shop_statistic_manager_fi_ask_counter(self, fi_ask_counter);
                    set_shop_statistic_manager_inference_counter(self, inference_counter);
                    set_shop_statistic_manager_method_counter(self, method_counter);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, $sym92$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_statistic_manager_method;
    }

    public static SubLObject shop_statistic_manager_add_fi_ask_method(final SubLObject self) {
        return instances.set_slot(self, FI_ASK_COUNTER, add(instances.get_slot(self, FI_ASK_COUNTER), ONE_INTEGER));
    }

    public static SubLObject shop_statistic_manager_add_plan_state_ask_method(final SubLObject self) {
        return instances.set_slot(self, PLAN_STATE_ASK_COUNTER, add(instances.get_slot(self, PLAN_STATE_ASK_COUNTER), ONE_INTEGER));
    }

    public static SubLObject shop_statistic_manager_add_expansion_method(final SubLObject self) {
        return instances.set_slot(self, METHOD_COUNTER, add(instances.get_slot(self, METHOD_COUNTER), ONE_INTEGER));
    }

    public static SubLObject shop_statistic_manager_add_inference_method(final SubLObject self) {
        return instances.set_slot(self, INFERENCE_COUNTER, add(instances.get_slot(self, INFERENCE_COUNTER), ONE_INTEGER));
    }

    public static SubLObject shop_statistic_manager_add_plan_method(final SubLObject self, final SubLObject plan) {
        instances.set_slot(self, PLANS, cons(plan, instances.get_slot(self, PLANS)));
        return instances.set_slot(self, PLAN_COUNTER, add(instances.get_slot(self, PLAN_COUNTER), ONE_INTEGER));
    }

    public static SubLObject shop_statistic_manager_number_of_inferences_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_statistic_manager_method = NIL;
        final SubLObject inference_counter = get_shop_statistic_manager_inference_counter(self);
        try {
            thread.throwStack.push($sym113$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
            try {
                sublisp_throw($sym113$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD, inference_counter);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_statistic_manager_inference_counter(self, inference_counter);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, $sym113$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_statistic_manager_method;
    }

    public static SubLObject shop_statistic_manager_number_of_methods_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_statistic_manager_method = NIL;
        final SubLObject method_counter = get_shop_statistic_manager_method_counter(self);
        try {
            thread.throwStack.push($sym117$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
            try {
                sublisp_throw($sym117$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD, method_counter);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_statistic_manager_method_counter(self, method_counter);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, $sym117$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_statistic_manager_method;
    }

    public static SubLObject shop_statistic_manager_number_of_expansions_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_statistic_manager_method = NIL;
        final SubLObject method_counter = get_shop_statistic_manager_method_counter(self);
        try {
            thread.throwStack.push($sym120$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
            try {
                sublisp_throw($sym120$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD, method_counter);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_statistic_manager_method_counter(self, method_counter);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, $sym120$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_statistic_manager_method;
    }

    public static SubLObject shop_statistic_manager_number_of_plans_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_statistic_manager_method = NIL;
        final SubLObject plan_counter = get_shop_statistic_manager_plan_counter(self);
        try {
            thread.throwStack.push($sym124$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
            try {
                sublisp_throw($sym124$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD, plan_counter);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_statistic_manager_plan_counter(self, plan_counter);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, $sym124$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_statistic_manager_method;
    }

    public static SubLObject shop_statistic_manager_number_of_fi_asks_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_statistic_manager_method = NIL;
        final SubLObject fi_ask_counter = get_shop_statistic_manager_fi_ask_counter(self);
        try {
            thread.throwStack.push($sym128$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
            try {
                sublisp_throw($sym128$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD, fi_ask_counter);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_statistic_manager_fi_ask_counter(self, fi_ask_counter);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, $sym128$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_statistic_manager_method;
    }

    public static SubLObject shop_statistic_manager_number_of_plan_state_asks_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_statistic_manager_method = NIL;
        final SubLObject plan_state_ask_counter = get_shop_statistic_manager_plan_state_ask_counter(self);
        try {
            thread.throwStack.push($sym132$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
            try {
                sublisp_throw($sym132$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD, plan_state_ask_counter);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_statistic_manager_plan_state_ask_counter(self, plan_state_ask_counter);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_statistic_manager_method = Errors.handleThrowable(ccatch_env_var, $sym132$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_statistic_manager_method;
    }

    public static SubLObject get_shop_variable_manager_variable_assoc_table(final SubLObject shop_variable_manager) {
        return classes.subloop_get_instance_slot(shop_variable_manager, ONE_INTEGER);
    }

    public static SubLObject set_shop_variable_manager_variable_assoc_table(final SubLObject shop_variable_manager, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_variable_manager, value, ONE_INTEGER);
    }

    public static SubLObject get_shop_variable_manager_variable_prefix(final SubLObject shop_variable_manager) {
        final SubLObject v_class = (shop_variable_manager.isSymbol()) ? classes.classes_retrieve_class(shop_variable_manager) : NIL != subloop_structures.class_p(shop_variable_manager) ? shop_variable_manager : NIL != subloop_structures.instance_p(shop_variable_manager) ? subloop_structures.instance_class(shop_variable_manager) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_shop_variable_manager_variable_prefix(final SubLObject shop_variable_manager, final SubLObject value) {
        final SubLObject v_class = (shop_variable_manager.isSymbol()) ? classes.classes_retrieve_class(shop_variable_manager) : NIL != subloop_structures.class_p(shop_variable_manager) ? shop_variable_manager : NIL != subloop_structures.instance_p(shop_variable_manager) ? subloop_structures.instance_class(shop_variable_manager) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_shop_variable_manager_variable_counter(final SubLObject shop_variable_manager) {
        final SubLObject v_class = (shop_variable_manager.isSymbol()) ? classes.classes_retrieve_class(shop_variable_manager) : NIL != subloop_structures.class_p(shop_variable_manager) ? shop_variable_manager : NIL != subloop_structures.instance_p(shop_variable_manager) ? subloop_structures.instance_class(shop_variable_manager) : NIL;
        if (NIL != v_class) {
            return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_shop_variable_manager_variable_counter(final SubLObject shop_variable_manager, final SubLObject value) {
        final SubLObject v_class = (shop_variable_manager.isSymbol()) ? classes.classes_retrieve_class(shop_variable_manager) : NIL != subloop_structures.class_p(shop_variable_manager) ? shop_variable_manager : NIL != subloop_structures.instance_p(shop_variable_manager) ? subloop_structures.instance_class(shop_variable_manager) : NIL;
        if (NIL != v_class) {
            return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_variable_manager_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, SHOP_VARIABLE_MANAGER, VARIABLE_COUNTER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_VARIABLE_MANAGER, VARIABLE_PREFIX, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_variable_manager_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_VARIABLE_MANAGER, VARIABLE_ASSOC_TABLE, NIL);
        return NIL;
    }

    public static SubLObject shop_variable_manager_p(final SubLObject shop_variable_manager) {
        return classes.subloop_instanceof_class(shop_variable_manager, SHOP_VARIABLE_MANAGER);
    }

    public static SubLObject shop_variable_manager_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        instances.set_slot(self, VARIABLE_PREFIX, $str143$_PV_);
        if (NIL == instances.get_slot(self, VARIABLE_ASSOC_TABLE)) {
            instances.set_slot(self, VARIABLE_COUNTER, ZERO_INTEGER);
            instances.set_slot(self, VARIABLE_ASSOC_TABLE, make_hash_table($int$100, UNPROVIDED, UNPROVIDED));
        }
        return self;
    }

    public static SubLObject shop_variable_manager_generate_variable_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_variable_manager_method = NIL;
        final SubLObject variable_prefix = get_shop_variable_manager_variable_prefix(self);
        SubLObject variable_counter = get_shop_variable_manager_variable_counter(self);
        try {
            thread.throwStack.push($sym148$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD);
            try {
                final SubLObject var_name = cconcatenate(variable_prefix, write_to_string(variable_counter, EMPTY_SUBL_OBJECT_ARRAY));
                final SubLObject var_symbol = intern(var_name, find_package($$$CYC));
                variable_counter = add(variable_counter, ONE_INTEGER);
                sublisp_throw($sym148$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, var_symbol);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_variable_manager_variable_prefix(self, variable_prefix);
                    set_shop_variable_manager_variable_counter(self, variable_counter);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_variable_manager_method = Errors.handleThrowable(ccatch_env_var, $sym148$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_variable_manager_method;
    }

    public static SubLObject shop_variable_manager_generate_binding_pair_method(final SubLObject self, final SubLObject old_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_variable_manager_method = NIL;
        final SubLObject variable_assoc_table = get_shop_variable_manager_variable_assoc_table(self);
        try {
            thread.throwStack.push($sym154$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD);
            try {
                final SubLObject new_var = shop_variable_manager_generate_variable_method(self);
                sethash(new_var, variable_assoc_table, old_var);
                sublisp_throw($sym154$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, cons(old_var, new_var));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_variable_manager_variable_assoc_table(self, variable_assoc_table);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_variable_manager_method = Errors.handleThrowable(ccatch_env_var, $sym154$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_variable_manager_method;
    }

    public static SubLObject shop_variable_manager_generate_binding_list_method(final SubLObject self, final SubLObject old_var_list) {
        SubLObject blist = NIL;
        SubLObject cdolist_list_var = old_var_list;
        SubLObject old_var = NIL;
        old_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            blist = cons(shop_variable_manager_generate_binding_pair_method(self, old_var), blist);
            cdolist_list_var = cdolist_list_var.rest();
            old_var = cdolist_list_var.first();
        } 
        return blist;
    }

    public static SubLObject shop_variable_manager_recover_el_variable_method(final SubLObject self, final SubLObject hl_var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_variable_manager_method = NIL;
        final SubLObject variable_assoc_table = get_shop_variable_manager_variable_assoc_table(self);
        try {
            thread.throwStack.push($sym163$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD);
            try {
                final SubLObject el_var = gethash(hl_var, variable_assoc_table, UNPROVIDED);
                if (NIL != el_var) {
                    sublisp_throw($sym163$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, el_var);
                }
                Errors.cerror($$$VARIABLE_ERROR, $str165$_s_is_not_a_known_variable_to__s_, hl_var, self);
                sublisp_throw($sym163$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_variable_manager_variable_assoc_table(self, variable_assoc_table);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_variable_manager_method = Errors.handleThrowable(ccatch_env_var, $sym163$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_variable_manager_method;
    }

    public static SubLObject shop_variable_manager_gather_el_variables_method(final SubLObject self, final SubLObject form, final SubLObject mbinding) {
        SubLObject unbound_vars = NIL;
        SubLObject cdolist_list_var = list_utilities.tree_gather(form, symbol_function(SHOP_VARIABLEP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cur_var = NIL;
        cur_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == shop_variable_manager_generated_variableP_method(SHOP_VARIABLE_MANAGER, cur_var)) && (NIL != multibindings.free_variable_in_multibindingP(cur_var, mbinding))) {
                unbound_vars = cons(cur_var, unbound_vars);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_var = cdolist_list_var.first();
        } 
        return reverse(unbound_vars);
    }

    public static SubLObject shop_variable_manager_managed_variableP_method(final SubLObject self, final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_variable_manager_method = NIL;
        final SubLObject variable_assoc_table = get_shop_variable_manager_variable_assoc_table(self);
        try {
            thread.throwStack.push($sym175$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD);
            try {
                sublisp_throw($sym175$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, NIL != gethash(var, variable_assoc_table, UNPROVIDED) ? T : NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_variable_manager_variable_assoc_table(self, variable_assoc_table);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_variable_manager_method = Errors.handleThrowable(ccatch_env_var, $sym175$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_variable_manager_method;
    }

    public static SubLObject shop_variable_manager_generated_variableP_method(final SubLObject self, final SubLObject var) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_variable_manager_method = NIL;
        final SubLObject variable_prefix = get_shop_variable_manager_variable_prefix(self);
        try {
            thread.throwStack.push($sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD);
            try {
                if (!var.isSymbol()) {
                    sublisp_throw($sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, NIL);
                }
                if (NIL != variables.variable_p(var)) {
                    sublisp_throw($sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, NIL);
                }
                final SubLObject var_name = symbol_name(var);
                final SubLObject min_length = length(variable_prefix);
                final SubLObject var_prefix = (length(var_name).numGE(min_length)) ? string_utilities.substring(symbol_name(var), ZERO_INTEGER, length(variable_prefix)) : $str180$;
                if (NIL != Strings.stringE(var_prefix, variable_prefix, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    sublisp_throw($sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, T);
                } else {
                    sublisp_throw($sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, NIL);
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_variable_manager_variable_prefix(self, variable_prefix);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_variable_manager_method = Errors.handleThrowable(ccatch_env_var, $sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_variable_manager_method;
    }

    public static SubLObject shop_variable_manager_generated_variables_bound_method(final SubLObject self, final SubLObject binding) {
        SubLObject bpairs = NIL;
        SubLObject cdolist_list_var = binding;
        SubLObject cur_pair = NIL;
        cur_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != shop_variable_manager_generated_variableP_method(SHOP_VARIABLE_MANAGER, cur_pair.first())) {
                bpairs = cons(cur_pair, bpairs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_pair = cdolist_list_var.first();
        } 
        return bpairs;
    }

    public static SubLObject shop_variable_manager_replace_variables_method(final SubLObject self, final SubLObject form, final SubLObject mbinding) {
        final SubLObject old_vars = shop_variable_manager_gather_el_variables_method(self, form, mbinding);
        final SubLObject blist = shop_variable_manager_generate_binding_list_method(self, old_vars);
        return sublis(blist, form, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject shop_variable_manager_recover_el_method(final SubLObject self, final SubLObject tree) {
        final SubLObject hl_vars = list_utilities.tree_gather(tree, symbol_function(SHOP_VARIABLEP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject new_tree = copy_tree(tree);
        SubLObject cdolist_list_var = hl_vars;
        SubLObject cur_var = NIL;
        cur_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != shop_variable_manager_managed_variableP_method(self, cur_var)) {
                new_tree = nsubst(shop_variable_manager_recover_el_variable_method(self, cur_var), cur_var, new_tree, UNPROVIDED, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_var = cdolist_list_var.first();
        } 
        return new_tree;
    }

    public static SubLObject shop_arg_isa_for_pred(final SubLObject pred, final SubLObject pos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = NIL;
        SubLObject cols = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            assertions = kb_mapping.gather_gaf_arg_index(pred, ONE_INTEGER, $$argIsa, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = assertions;
        SubLObject cur_assertion = NIL;
        cur_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (assertions_high.gaf_arg2(cur_assertion).eql(pos)) {
                cols = cons(assertions_high.gaf_arg3(cur_assertion), cols);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_assertion = cdolist_list_var.first();
        } 
        return genls.min_cols(cols, mt, UNPROVIDED).first();
    }

    public static SubLObject shop_arg_genl_for_pred(final SubLObject pred, final SubLObject pos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = NIL;
        SubLObject cols = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            assertions = kb_mapping.gather_gaf_arg_index(pred, ONE_INTEGER, $$argGenl, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = assertions;
        SubLObject cur_assertion = NIL;
        cur_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (assertions_high.gaf_arg2(cur_assertion).eql(pos)) {
                cols = cons(assertions_high.gaf_arg3(cur_assertion), cols);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_assertion = cdolist_list_var.first();
        } 
        return genls.min_cols(cols, mt, UNPROVIDED).first();
    }

    public static SubLObject shop_initial_extent_for_position(final SubLObject pred, final SubLObject pos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg_isa = shop_arg_isa_for_pred(pred, pos, mt);
        final SubLObject arg_genls = shop_arg_genl_for_pred(pred, pos, mt);
        SubLObject extent = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != arg_genls) {
                extent = keyhash_utilities.fast_intersection(isa.all_fort_instances(arg_isa, UNPROVIDED, UNPROVIDED), genls.all_specs(arg_genls, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                extent = isa.all_fort_instances(arg_isa, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return extent;
    }

    public static SubLObject shop_initial_multibinding_for_task(final SubLObject task, final SubLObject mt) {
        final SubLObject free_variables = sentence_free_variables(task, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject predicate = literal_predicate(task, UNPROVIDED);
        final SubLObject mbinding = multibindings.create_mb();
        SubLObject cdolist_list_var = free_variables;
        SubLObject cur_var = NIL;
        cur_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject position = position(cur_var, task, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject initial_extent = shop_initial_extent_for_position(predicate, position, mt);
            final SubLObject initial_items = multibindings.mb_make_entry_with_null_supports(initial_extent);
            if (NIL != initial_extent) {
                multibindings.set_mb_var_entry(mbinding, cur_var, initial_items);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_var = cdolist_list_var.first();
        } 
        return mbinding;
    }

    public static SubLObject declare_shop_internals_file() {
        declareFunction(me, "lispify_cyc_bindings", "LISPIFY-CYC-BINDINGS", 1, 0, false);
        declareFunction(me, "shop_translate_plan", "SHOP-TRANSLATE-PLAN", 1, 0, false);
        declareMacro(me, "inc_slot", "INC-SLOT");
        declareFunction(me, "process_timer_p", "PROCESS-TIMER-P", 1, 0, false);
        declareFunction(me, "get_statistic_manager_last_call_real_time", "GET-STATISTIC-MANAGER-LAST-CALL-REAL-TIME", 1, 0, false);
        declareFunction(me, "set_statistic_manager_last_call_real_time", "SET-STATISTIC-MANAGER-LAST-CALL-REAL-TIME", 2, 0, false);
        declareFunction(me, "get_statistic_manager_last_call_run_time", "GET-STATISTIC-MANAGER-LAST-CALL-RUN-TIME", 1, 0, false);
        declareFunction(me, "set_statistic_manager_last_call_run_time", "SET-STATISTIC-MANAGER-LAST-CALL-RUN-TIME", 2, 0, false);
        declareFunction(me, "get_statistic_manager_end_real_time", "GET-STATISTIC-MANAGER-END-REAL-TIME", 1, 0, false);
        declareFunction(me, "set_statistic_manager_end_real_time", "SET-STATISTIC-MANAGER-END-REAL-TIME", 2, 0, false);
        declareFunction(me, "get_statistic_manager_end_run_time", "GET-STATISTIC-MANAGER-END-RUN-TIME", 1, 0, false);
        declareFunction(me, "set_statistic_manager_end_run_time", "SET-STATISTIC-MANAGER-END-RUN-TIME", 2, 0, false);
        declareFunction(me, "get_statistic_manager_start_real_time", "GET-STATISTIC-MANAGER-START-REAL-TIME", 1, 0, false);
        declareFunction(me, "set_statistic_manager_start_real_time", "SET-STATISTIC-MANAGER-START-REAL-TIME", 2, 0, false);
        declareFunction(me, "get_statistic_manager_start_run_time", "GET-STATISTIC-MANAGER-START-RUN-TIME", 1, 0, false);
        declareFunction(me, "set_statistic_manager_start_run_time", "SET-STATISTIC-MANAGER-START-RUN-TIME", 2, 0, false);
        declareFunction(me, "get_statistic_manager_timingP", "GET-STATISTIC-MANAGER-TIMING?", 1, 0, false);
        declareFunction(me, "set_statistic_manager_timingP", "SET-STATISTIC-MANAGER-TIMING?", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_statistic_manager_class", "SUBLOOP-RESERVED-INITIALIZE-STATISTIC-MANAGER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_statistic_manager_instance", "SUBLOOP-RESERVED-INITIALIZE-STATISTIC-MANAGER-INSTANCE", 1, 0, false);
        declareFunction(me, "statistic_manager_p", "STATISTIC-MANAGER-P", 1, 0, false);
        declareFunction(me, "statistic_manager_initialize_method", "STATISTIC-MANAGER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "statistic_manager_get_run_time_method", "STATISTIC-MANAGER-GET-RUN-TIME-METHOD", 1, 0, false);
        declareFunction(me, "statistic_manager_get_real_time_method", "STATISTIC-MANAGER-GET-REAL-TIME-METHOD", 1, 0, false);
        declareFunction(me, "statistic_manager_reset_last_call_time_method", "STATISTIC-MANAGER-RESET-LAST-CALL-TIME-METHOD", 1, 0, false);
        declareFunction(me, "statistic_manager_start_timing_method", "STATISTIC-MANAGER-START-TIMING-METHOD", 1, 0, false);
        declareFunction(me, "statistic_manager_resume_timing_method", "STATISTIC-MANAGER-RESUME-TIMING-METHOD", 1, 0, false);
        declareFunction(me, "statistic_manager_stop_timing_method", "STATISTIC-MANAGER-STOP-TIMING-METHOD", 1, 0, false);
        declareFunction(me, "statistic_manager_is_timingP_method", "STATISTIC-MANAGER-IS-TIMING?-METHOD", 1, 0, false);
        declareFunction(me, "statistic_manager_elapsed_real_time_method", "STATISTIC-MANAGER-ELAPSED-REAL-TIME-METHOD", 1, 0, false);
        declareFunction(me, "statistic_manager_elapsed_run_time_method", "STATISTIC-MANAGER-ELAPSED-RUN-TIME-METHOD", 1, 0, false);
        declareFunction(me, "statistic_manager_reset_timing_method", "STATISTIC-MANAGER-RESET-TIMING-METHOD", 1, 0, false);
        declareFunction(me, "statistic_manager_elapsed_real_time_since_last_call_method", "STATISTIC-MANAGER-ELAPSED-REAL-TIME-SINCE-LAST-CALL-METHOD", 1, 0, false);
        declareFunction(me, "statistic_manager_elapsed_run_time_since_last_call_method", "STATISTIC-MANAGER-ELAPSED-RUN-TIME-SINCE-LAST-CALL-METHOD", 1, 0, false);
        declareFunction(me, "get_shop_statistic_manager_plans", "GET-SHOP-STATISTIC-MANAGER-PLANS", 1, 0, false);
        declareFunction(me, "set_shop_statistic_manager_plans", "SET-SHOP-STATISTIC-MANAGER-PLANS", 2, 0, false);
        declareFunction(me, "get_shop_statistic_manager_plan_counter", "GET-SHOP-STATISTIC-MANAGER-PLAN-COUNTER", 1, 0, false);
        declareFunction(me, "set_shop_statistic_manager_plan_counter", "SET-SHOP-STATISTIC-MANAGER-PLAN-COUNTER", 2, 0, false);
        declareFunction(me, "get_shop_statistic_manager_plan_state_ask_counter", "GET-SHOP-STATISTIC-MANAGER-PLAN-STATE-ASK-COUNTER", 1, 0, false);
        declareFunction(me, "set_shop_statistic_manager_plan_state_ask_counter", "SET-SHOP-STATISTIC-MANAGER-PLAN-STATE-ASK-COUNTER", 2, 0, false);
        declareFunction(me, "get_shop_statistic_manager_fi_ask_counter", "GET-SHOP-STATISTIC-MANAGER-FI-ASK-COUNTER", 1, 0, false);
        declareFunction(me, "set_shop_statistic_manager_fi_ask_counter", "SET-SHOP-STATISTIC-MANAGER-FI-ASK-COUNTER", 2, 0, false);
        declareFunction(me, "get_shop_statistic_manager_inference_counter", "GET-SHOP-STATISTIC-MANAGER-INFERENCE-COUNTER", 1, 0, false);
        declareFunction(me, "set_shop_statistic_manager_inference_counter", "SET-SHOP-STATISTIC-MANAGER-INFERENCE-COUNTER", 2, 0, false);
        declareFunction(me, "get_shop_statistic_manager_method_counter", "GET-SHOP-STATISTIC-MANAGER-METHOD-COUNTER", 1, 0, false);
        declareFunction(me, "set_shop_statistic_manager_method_counter", "SET-SHOP-STATISTIC-MANAGER-METHOD-COUNTER", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_statistic_manager_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-STATISTIC-MANAGER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_statistic_manager_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-STATISTIC-MANAGER-INSTANCE", 1, 0, false);
        declareFunction(me, "shop_statistic_manager_p", "SHOP-STATISTIC-MANAGER-P", 1, 0, false);
        declareFunction(me, "shop_statistic_manager_initialize_method", "SHOP-STATISTIC-MANAGER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "shop_statistic_manager_reset_counters_method", "SHOP-STATISTIC-MANAGER-RESET-COUNTERS-METHOD", 1, 0, false);
        declareFunction(me, "shop_statistic_manager_add_fi_ask_method", "SHOP-STATISTIC-MANAGER-ADD-FI-ASK-METHOD", 1, 0, false);
        declareFunction(me, "shop_statistic_manager_add_plan_state_ask_method", "SHOP-STATISTIC-MANAGER-ADD-PLAN-STATE-ASK-METHOD", 1, 0, false);
        declareFunction(me, "shop_statistic_manager_add_expansion_method", "SHOP-STATISTIC-MANAGER-ADD-EXPANSION-METHOD", 1, 0, false);
        declareFunction(me, "shop_statistic_manager_add_inference_method", "SHOP-STATISTIC-MANAGER-ADD-INFERENCE-METHOD", 1, 0, false);
        declareFunction(me, "shop_statistic_manager_add_plan_method", "SHOP-STATISTIC-MANAGER-ADD-PLAN-METHOD", 2, 0, false);
        declareFunction(me, "shop_statistic_manager_number_of_inferences_method", "SHOP-STATISTIC-MANAGER-NUMBER-OF-INFERENCES-METHOD", 1, 0, false);
        declareFunction(me, "shop_statistic_manager_number_of_methods_method", "SHOP-STATISTIC-MANAGER-NUMBER-OF-METHODS-METHOD", 1, 0, false);
        declareFunction(me, "shop_statistic_manager_number_of_expansions_method", "SHOP-STATISTIC-MANAGER-NUMBER-OF-EXPANSIONS-METHOD", 1, 0, false);
        declareFunction(me, "shop_statistic_manager_number_of_plans_method", "SHOP-STATISTIC-MANAGER-NUMBER-OF-PLANS-METHOD", 1, 0, false);
        declareFunction(me, "shop_statistic_manager_number_of_fi_asks_method", "SHOP-STATISTIC-MANAGER-NUMBER-OF-FI-ASKS-METHOD", 1, 0, false);
        declareFunction(me, "shop_statistic_manager_number_of_plan_state_asks_method", "SHOP-STATISTIC-MANAGER-NUMBER-OF-PLAN-STATE-ASKS-METHOD", 1, 0, false);
        declareFunction(me, "get_shop_variable_manager_variable_assoc_table", "GET-SHOP-VARIABLE-MANAGER-VARIABLE-ASSOC-TABLE", 1, 0, false);
        declareFunction(me, "set_shop_variable_manager_variable_assoc_table", "SET-SHOP-VARIABLE-MANAGER-VARIABLE-ASSOC-TABLE", 2, 0, false);
        declareFunction(me, "get_shop_variable_manager_variable_prefix", "GET-SHOP-VARIABLE-MANAGER-VARIABLE-PREFIX", 1, 0, false);
        declareFunction(me, "set_shop_variable_manager_variable_prefix", "SET-SHOP-VARIABLE-MANAGER-VARIABLE-PREFIX", 2, 0, false);
        declareFunction(me, "get_shop_variable_manager_variable_counter", "GET-SHOP-VARIABLE-MANAGER-VARIABLE-COUNTER", 1, 0, false);
        declareFunction(me, "set_shop_variable_manager_variable_counter", "SET-SHOP-VARIABLE-MANAGER-VARIABLE-COUNTER", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_variable_manager_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-VARIABLE-MANAGER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_shop_variable_manager_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-VARIABLE-MANAGER-INSTANCE", 1, 0, false);
        declareFunction(me, "shop_variable_manager_p", "SHOP-VARIABLE-MANAGER-P", 1, 0, false);
        declareFunction(me, "shop_variable_manager_initialize_method", "SHOP-VARIABLE-MANAGER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "shop_variable_manager_generate_variable_method", "SHOP-VARIABLE-MANAGER-GENERATE-VARIABLE-METHOD", 1, 0, false);
        declareFunction(me, "shop_variable_manager_generate_binding_pair_method", "SHOP-VARIABLE-MANAGER-GENERATE-BINDING-PAIR-METHOD", 2, 0, false);
        declareFunction(me, "shop_variable_manager_generate_binding_list_method", "SHOP-VARIABLE-MANAGER-GENERATE-BINDING-LIST-METHOD", 2, 0, false);
        declareFunction(me, "shop_variable_manager_recover_el_variable_method", "SHOP-VARIABLE-MANAGER-RECOVER-EL-VARIABLE-METHOD", 2, 0, false);
        declareFunction(me, "shop_variable_manager_gather_el_variables_method", "SHOP-VARIABLE-MANAGER-GATHER-EL-VARIABLES-METHOD", 3, 0, false);
        declareFunction(me, "shop_variable_manager_managed_variableP_method", "SHOP-VARIABLE-MANAGER-MANAGED-VARIABLE?-METHOD", 2, 0, false);
        declareFunction(me, "shop_variable_manager_generated_variableP_method", "SHOP-VARIABLE-MANAGER-GENERATED-VARIABLE?-METHOD", 2, 0, false);
        declareFunction(me, "shop_variable_manager_generated_variables_bound_method", "SHOP-VARIABLE-MANAGER-GENERATED-VARIABLES-BOUND-METHOD", 2, 0, false);
        declareFunction(me, "shop_variable_manager_replace_variables_method", "SHOP-VARIABLE-MANAGER-REPLACE-VARIABLES-METHOD", 3, 0, false);
        declareFunction(me, "shop_variable_manager_recover_el_method", "SHOP-VARIABLE-MANAGER-RECOVER-EL-METHOD", 2, 0, false);
        declareFunction(me, "shop_arg_isa_for_pred", "SHOP-ARG-ISA-FOR-PRED", 3, 0, false);
        declareFunction(me, "shop_arg_genl_for_pred", "SHOP-ARG-GENL-FOR-PRED", 3, 0, false);
        declareFunction(me, "shop_initial_extent_for_position", "SHOP-INITIAL-EXTENT-FOR-POSITION", 3, 0, false);
        declareFunction(me, "shop_initial_multibinding_for_task", "SHOP-INITIAL-MULTIBINDING-FOR-TASK", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_shop_internals_file() {
        defparameter("*SHOP-VERBOSE-KEYS*", $list0);
        defparameter("*SHOP-GC*", NIL);
        defparameter("*SHOP-VERBOSE-TARGET*", $STDOUT);
        return NIL;
    }

    public static SubLObject setup_shop_internals_file() {
        interfaces.new_interface(PROCESS_TIMER, NIL, NIL, $list9);
        classes.subloop_new_class(STATISTIC_MANAGER, OBJECT, $list12, NIL, $list13);
        classes.class_set_implements_slot_listeners(STATISTIC_MANAGER, NIL);
        classes.subloop_note_class_initialization_function(STATISTIC_MANAGER, SUBLOOP_RESERVED_INITIALIZE_STATISTIC_MANAGER_CLASS);
        classes.subloop_note_instance_initialization_function(STATISTIC_MANAGER, SUBLOOP_RESERVED_INITIALIZE_STATISTIC_MANAGER_INSTANCE);
        subloop_reserved_initialize_statistic_manager_class(STATISTIC_MANAGER);
        methods.methods_incorporate_instance_method(INITIALIZE, STATISTIC_MANAGER, $list27, NIL, $list28);
        methods.subloop_register_instance_method(STATISTIC_MANAGER, INITIALIZE, STATISTIC_MANAGER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_RUN_TIME, STATISTIC_MANAGER, $list31, NIL, $list32);
        methods.subloop_register_instance_method(STATISTIC_MANAGER, GET_RUN_TIME, STATISTIC_MANAGER_GET_RUN_TIME_METHOD);
        methods.methods_incorporate_instance_method(GET_REAL_TIME, STATISTIC_MANAGER, $list31, NIL, $list35);
        methods.subloop_register_instance_method(STATISTIC_MANAGER, GET_REAL_TIME, STATISTIC_MANAGER_GET_REAL_TIME_METHOD);
        methods.methods_incorporate_instance_method(RESET_LAST_CALL_TIME, STATISTIC_MANAGER, $list31, NIL, $list38);
        methods.subloop_register_instance_method(STATISTIC_MANAGER, RESET_LAST_CALL_TIME, STATISTIC_MANAGER_RESET_LAST_CALL_TIME_METHOD);
        methods.methods_incorporate_instance_method(START_TIMING, STATISTIC_MANAGER, $list42, NIL, $list43);
        methods.subloop_register_instance_method(STATISTIC_MANAGER, START_TIMING, STATISTIC_MANAGER_START_TIMING_METHOD);
        methods.methods_incorporate_instance_method(RESUME_TIMING, STATISTIC_MANAGER, $list42, NIL, $list47);
        methods.subloop_register_instance_method(STATISTIC_MANAGER, RESUME_TIMING, STATISTIC_MANAGER_RESUME_TIMING_METHOD);
        methods.methods_incorporate_instance_method(STOP_TIMING, STATISTIC_MANAGER, $list42, NIL, $list51);
        methods.subloop_register_instance_method(STATISTIC_MANAGER, STOP_TIMING, STATISTIC_MANAGER_STOP_TIMING_METHOD);
        methods.methods_incorporate_instance_method($sym54$IS_TIMING_, STATISTIC_MANAGER, $list42, NIL, $list55);
        methods.subloop_register_instance_method(STATISTIC_MANAGER, $sym54$IS_TIMING_, $sym57$STATISTIC_MANAGER_IS_TIMING__METHOD);
        methods.methods_incorporate_instance_method(ELAPSED_REAL_TIME, STATISTIC_MANAGER, $list42, NIL, $list59);
        methods.subloop_register_instance_method(STATISTIC_MANAGER, ELAPSED_REAL_TIME, STATISTIC_MANAGER_ELAPSED_REAL_TIME_METHOD);
        methods.methods_incorporate_instance_method(ELAPSED_RUN_TIME, STATISTIC_MANAGER, $list42, NIL, $list63);
        methods.subloop_register_instance_method(STATISTIC_MANAGER, ELAPSED_RUN_TIME, STATISTIC_MANAGER_ELAPSED_RUN_TIME_METHOD);
        methods.methods_incorporate_instance_method(RESET_TIMING, STATISTIC_MANAGER, $list42, NIL, $list67);
        methods.subloop_register_instance_method(STATISTIC_MANAGER, RESET_TIMING, STATISTIC_MANAGER_RESET_TIMING_METHOD);
        methods.methods_incorporate_instance_method(ELAPSED_REAL_TIME_SINCE_LAST_CALL, STATISTIC_MANAGER, $list42, NIL, $list71);
        methods.subloop_register_instance_method(STATISTIC_MANAGER, ELAPSED_REAL_TIME_SINCE_LAST_CALL, STATISTIC_MANAGER_ELAPSED_REAL_TIME_SINCE_LAST_CALL_METHOD);
        methods.methods_incorporate_instance_method(ELAPSED_RUN_TIME_SINCE_LAST_CALL, STATISTIC_MANAGER, $list42, NIL, $list75);
        methods.subloop_register_instance_method(STATISTIC_MANAGER, ELAPSED_RUN_TIME_SINCE_LAST_CALL, STATISTIC_MANAGER_ELAPSED_RUN_TIME_SINCE_LAST_CALL_METHOD);
        classes.subloop_new_class(SHOP_STATISTIC_MANAGER, STATISTIC_MANAGER, NIL, NIL, $list79);
        classes.class_set_implements_slot_listeners(SHOP_STATISTIC_MANAGER, NIL);
        classes.subloop_note_class_initialization_function(SHOP_STATISTIC_MANAGER, SUBLOOP_RESERVED_INITIALIZE_SHOP_STATISTIC_MANAGER_CLASS);
        classes.subloop_note_instance_initialization_function(SHOP_STATISTIC_MANAGER, SUBLOOP_RESERVED_INITIALIZE_SHOP_STATISTIC_MANAGER_INSTANCE);
        subloop_reserved_initialize_shop_statistic_manager_class(SHOP_STATISTIC_MANAGER);
        methods.methods_incorporate_instance_method(INITIALIZE, SHOP_STATISTIC_MANAGER, $list27, NIL, $list88);
        methods.subloop_register_instance_method(SHOP_STATISTIC_MANAGER, INITIALIZE, SHOP_STATISTIC_MANAGER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(RESET_COUNTERS, SHOP_STATISTIC_MANAGER, $list42, NIL, $list91);
        methods.subloop_register_instance_method(SHOP_STATISTIC_MANAGER, RESET_COUNTERS, SHOP_STATISTIC_MANAGER_RESET_COUNTERS_METHOD);
        methods.methods_incorporate_instance_method(ADD_FI_ASK, SHOP_STATISTIC_MANAGER, $list95, NIL, $list96);
        methods.subloop_register_instance_method(SHOP_STATISTIC_MANAGER, ADD_FI_ASK, SHOP_STATISTIC_MANAGER_ADD_FI_ASK_METHOD);
        methods.methods_incorporate_instance_method(ADD_PLAN_STATE_ASK, SHOP_STATISTIC_MANAGER, $list95, NIL, $list99);
        methods.subloop_register_instance_method(SHOP_STATISTIC_MANAGER, ADD_PLAN_STATE_ASK, SHOP_STATISTIC_MANAGER_ADD_PLAN_STATE_ASK_METHOD);
        methods.methods_incorporate_instance_method(ADD_EXPANSION, SHOP_STATISTIC_MANAGER, $list95, NIL, $list102);
        methods.subloop_register_instance_method(SHOP_STATISTIC_MANAGER, ADD_EXPANSION, SHOP_STATISTIC_MANAGER_ADD_EXPANSION_METHOD);
        methods.methods_incorporate_instance_method(ADD_INFERENCE, SHOP_STATISTIC_MANAGER, $list95, NIL, $list105);
        methods.subloop_register_instance_method(SHOP_STATISTIC_MANAGER, ADD_INFERENCE, SHOP_STATISTIC_MANAGER_ADD_INFERENCE_METHOD);
        methods.methods_incorporate_instance_method(ADD_PLAN, SHOP_STATISTIC_MANAGER, $list95, $list108, $list109);
        methods.subloop_register_instance_method(SHOP_STATISTIC_MANAGER, ADD_PLAN, SHOP_STATISTIC_MANAGER_ADD_PLAN_METHOD);
        methods.methods_incorporate_instance_method(NUMBER_OF_INFERENCES, SHOP_STATISTIC_MANAGER, $list42, NIL, $list112);
        methods.subloop_register_instance_method(SHOP_STATISTIC_MANAGER, NUMBER_OF_INFERENCES, SHOP_STATISTIC_MANAGER_NUMBER_OF_INFERENCES_METHOD);
        methods.methods_incorporate_instance_method(NUMBER_OF_METHODS, SHOP_STATISTIC_MANAGER, $list42, NIL, $list116);
        methods.subloop_register_instance_method(SHOP_STATISTIC_MANAGER, NUMBER_OF_METHODS, SHOP_STATISTIC_MANAGER_NUMBER_OF_METHODS_METHOD);
        methods.methods_incorporate_instance_method(NUMBER_OF_EXPANSIONS, SHOP_STATISTIC_MANAGER, $list42, NIL, $list116);
        methods.subloop_register_instance_method(SHOP_STATISTIC_MANAGER, NUMBER_OF_EXPANSIONS, SHOP_STATISTIC_MANAGER_NUMBER_OF_EXPANSIONS_METHOD);
        methods.methods_incorporate_instance_method(NUMBER_OF_PLANS, SHOP_STATISTIC_MANAGER, $list42, NIL, $list123);
        methods.subloop_register_instance_method(SHOP_STATISTIC_MANAGER, NUMBER_OF_PLANS, SHOP_STATISTIC_MANAGER_NUMBER_OF_PLANS_METHOD);
        methods.methods_incorporate_instance_method(NUMBER_OF_FI_ASKS, SHOP_STATISTIC_MANAGER, $list42, NIL, $list127);
        methods.subloop_register_instance_method(SHOP_STATISTIC_MANAGER, NUMBER_OF_FI_ASKS, SHOP_STATISTIC_MANAGER_NUMBER_OF_FI_ASKS_METHOD);
        methods.methods_incorporate_instance_method(NUMBER_OF_PLAN_STATE_ASKS, SHOP_STATISTIC_MANAGER, $list42, NIL, $list131);
        methods.subloop_register_instance_method(SHOP_STATISTIC_MANAGER, NUMBER_OF_PLAN_STATE_ASKS, SHOP_STATISTIC_MANAGER_NUMBER_OF_PLAN_STATE_ASKS_METHOD);
        classes.subloop_new_class(SHOP_VARIABLE_MANAGER, OBJECT, NIL, NIL, $list135);
        classes.class_set_implements_slot_listeners(SHOP_VARIABLE_MANAGER, NIL);
        classes.subloop_note_class_initialization_function(SHOP_VARIABLE_MANAGER, SUBLOOP_RESERVED_INITIALIZE_SHOP_VARIABLE_MANAGER_CLASS);
        classes.subloop_note_instance_initialization_function(SHOP_VARIABLE_MANAGER, SUBLOOP_RESERVED_INITIALIZE_SHOP_VARIABLE_MANAGER_INSTANCE);
        subloop_reserved_initialize_shop_variable_manager_class(SHOP_VARIABLE_MANAGER);
        methods.methods_incorporate_instance_method(INITIALIZE, SHOP_VARIABLE_MANAGER, $list141, NIL, $list142);
        methods.subloop_register_instance_method(SHOP_VARIABLE_MANAGER, INITIALIZE, SHOP_VARIABLE_MANAGER_INITIALIZE_METHOD);
        methods.methods_incorporate_class_method(GENERATE_VARIABLE, SHOP_VARIABLE_MANAGER, $list31, NIL, $list147);
        methods.subloop_register_class_method(SHOP_VARIABLE_MANAGER, GENERATE_VARIABLE, SHOP_VARIABLE_MANAGER_GENERATE_VARIABLE_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_BINDING_PAIR, SHOP_VARIABLE_MANAGER, $list42, $list152, $list153);
        methods.subloop_register_instance_method(SHOP_VARIABLE_MANAGER, GENERATE_BINDING_PAIR, SHOP_VARIABLE_MANAGER_GENERATE_BINDING_PAIR_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_BINDING_LIST, SHOP_VARIABLE_MANAGER, $list42, $list157, $list158);
        methods.subloop_register_instance_method(SHOP_VARIABLE_MANAGER, GENERATE_BINDING_LIST, SHOP_VARIABLE_MANAGER_GENERATE_BINDING_LIST_METHOD);
        methods.methods_incorporate_instance_method(RECOVER_EL_VARIABLE, SHOP_VARIABLE_MANAGER, $list42, $list161, $list162);
        methods.subloop_register_instance_method(SHOP_VARIABLE_MANAGER, RECOVER_EL_VARIABLE, SHOP_VARIABLE_MANAGER_RECOVER_EL_VARIABLE_METHOD);
        methods.methods_incorporate_instance_method(GATHER_EL_VARIABLES, SHOP_VARIABLE_MANAGER, $list42, $list168, $list169);
        methods.subloop_register_instance_method(SHOP_VARIABLE_MANAGER, GATHER_EL_VARIABLES, SHOP_VARIABLE_MANAGER_GATHER_EL_VARIABLES_METHOD);
        methods.methods_incorporate_instance_method($sym172$MANAGED_VARIABLE_, SHOP_VARIABLE_MANAGER, $list31, $list173, $list174);
        methods.subloop_register_instance_method(SHOP_VARIABLE_MANAGER, $sym172$MANAGED_VARIABLE_, $sym176$SHOP_VARIABLE_MANAGER_MANAGED_VARIABLE__METHOD);
        methods.methods_incorporate_class_method($sym177$GENERATED_VARIABLE_, SHOP_VARIABLE_MANAGER, $list42, $list173, $list178);
        methods.subloop_register_class_method(SHOP_VARIABLE_MANAGER, $sym177$GENERATED_VARIABLE_, $sym181$SHOP_VARIABLE_MANAGER_GENERATED_VARIABLE__METHOD);
        methods.methods_incorporate_class_method(GENERATED_VARIABLES_BOUND, SHOP_VARIABLE_MANAGER, $list42, $list183, $list184);
        methods.subloop_register_class_method(SHOP_VARIABLE_MANAGER, GENERATED_VARIABLES_BOUND, SHOP_VARIABLE_MANAGER_GENERATED_VARIABLES_BOUND_METHOD);
        methods.methods_incorporate_instance_method(REPLACE_VARIABLES, SHOP_VARIABLE_MANAGER, $list42, $list168, $list187);
        methods.subloop_register_instance_method(SHOP_VARIABLE_MANAGER, REPLACE_VARIABLES, SHOP_VARIABLE_MANAGER_REPLACE_VARIABLES_METHOD);
        methods.methods_incorporate_instance_method(RECOVER_EL, SHOP_VARIABLE_MANAGER, $list42, $list190, $list191);
        methods.subloop_register_instance_method(SHOP_VARIABLE_MANAGER, RECOVER_EL, SHOP_VARIABLE_MANAGER_RECOVER_EL_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_shop_internals_file();
    }

    @Override
    public void initializeVariables() {
        init_shop_internals_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_shop_internals_file();
    }

    
}

/**
 * Total time: 732 ms
 */
