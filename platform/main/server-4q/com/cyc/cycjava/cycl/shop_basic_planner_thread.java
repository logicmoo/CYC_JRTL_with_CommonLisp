/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_graphs.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.$sbhl_link_mt$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.$sbhl_link_tv$;
import static com.cyc.cycjava.cycl.sbhl.sbhl_link_vars.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_links.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_macros.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_vars.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_paranoia.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_search_vars.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SHOP-BASIC-PLANNER-THREAD
 * source file: /cyc/top/cycl/shop-basic-planner-thread.lisp
 * created:     2019/07/03 17:38:27
 */
public final class shop_basic_planner_thread extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new shop_basic_planner_thread();

 public static final String myName = "com.cyc.cycjava.cycl.shop_basic_planner_thread";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol P_WRAPPER = makeSymbol("P-WRAPPER");

    private static final SubLSymbol STOP_TIMING = makeSymbol("STOP-TIMING");

    private static final SubLSymbol RESUME_TIMING = makeSymbol("RESUME-TIMING");

    static private final SubLList $list6 = list(new SubLObject[]{ list(makeSymbol("PROBLEM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("AXIOMS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("PLANNER"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("OPEN-NODES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("P-WRAPPER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("VAR-MANAGER"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("STATS-MANAGER"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("LOG"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INITIAL-PLAN-STATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("HALT-STATUS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("WHICH-PLANS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("NUM-BACKCHAINS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("CYCLE-CHECKING"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("TIME-CUTOFF"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEPTH-CUTOFF"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("NUMBER-CUTOFF"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("PLAN-NUMBER"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("PLAN-NUMBER-TO-CUTOFF"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("PLANS-FOUND"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OUTPUT-MESSAGE"), list(makeSymbol("STRING")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OUTPUT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-STATS"), list(makeSymbol("RUN-TIME"), makeSymbol("REAL-TIME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INIT-PLAN-STATE"), list(makeSymbol("PROBLEM-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DOMAIN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPLETED-RUN?"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HTML-DISPLAY-SUMMARY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NUMBER-CUTOFF-REACHED?"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TIME-CUTOFF-REACHED?"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEPTH-CUTOFF-REACHED?"), list(makeSymbol("PLAN-TASK")), makeKeyword("PRIVATE")) });

    private static final SubLSymbol INITIAL_PLAN_STATE = makeSymbol("INITIAL-PLAN-STATE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_THREAD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-THREAD-CLASS");

    private static final SubLSymbol AXIOMS = makeSymbol("AXIOMS");

    private static final SubLSymbol CYCLE_CHECKING = makeSymbol("CYCLE-CHECKING");

    private static final SubLSymbol NUMBER_CUTOFF = makeSymbol("NUMBER-CUTOFF");

    private static final SubLSymbol PLAN_NUMBER = makeSymbol("PLAN-NUMBER");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_THREAD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-THREAD-INSTANCE");

    static private final SubLList $list30 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list31 = list(new SubLObject[]{ list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("VAR-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-VARIABLE-MANAGER")), list(QUOTE, makeSymbol("SHOP-VARIABLE-MANAGER")))), list(makeSymbol("CSETQ"), makeSymbol("STATS-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-STATISTIC-MANAGER")), list(QUOTE, makeSymbol("SHOP-STATISTIC-MANAGER")))), list(makeSymbol("CSETQ"), makeSymbol("LOG"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-LOG")), list(QUOTE, makeSymbol("SHOP-LOG")))), list(makeSymbol("CSETQ"), makeSymbol("PLAN-NUMBER"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("PLAN-NUMBER-TO-CUTOFF"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("TIME-CUTOFF"), NIL), list(makeSymbol("CSETQ"), makeSymbol("DEPTH-CUTOFF"), makeSymbol("*SHOP-DEFAULT-DEPTH-LIMIT*")), list(makeSymbol("CSETQ"), makeSymbol("NUMBER-CUTOFF"), NIL), list(makeSymbol("CSETQ"), makeSymbol("HALT-STATUS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("NUM-BACKCHAINS"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("CYCLE-CHECKING"), NIL), list(RET, makeSymbol("SELF")) });

    static private final SubLSymbol $sym32$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    private static final SubLSymbol SHOP_LOG = makeSymbol("SHOP-LOG");

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_INITIALIZE_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-INITIALIZE-METHOD");

    static private final SubLList $list38 = list(makeKeyword("PRIVATE"));

    static private final SubLList $list39 = list(makeSymbol("STRING"));

    static private final SubLList $list40 = list(list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("LOG-ENTRY"), makeSymbol("SHOP-LOG")), makeSymbol("LOG"), makeSymbol("STRING"))));

    static private final SubLSymbol $sym41$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_OUTPUT_MESSAGE_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-OUTPUT-MESSAGE-METHOD");

    static private final SubLSymbol $sym43$ANY_CUTOFF_REACHED_ = makeSymbol("ANY-CUTOFF-REACHED?");

    static private final SubLList $list44 = list(makeString("@return booleanp"), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("OPEN-NODES")), list(RET, T)), list(RET, list(makeSymbol("COR"), list(makeSymbol("DEPTH-CUTOFF-REACHED?"), makeSymbol("SELF"), list(makeSymbol("FIRST"), makeSymbol("OPEN-NODES"))), list(makeSymbol("TIME-CUTOFF-REACHED?"), makeSymbol("SELF")), list(makeSymbol("NUMBER-CUTOFF-REACHED?"), makeSymbol("SELF")))));

    static private final SubLSymbol $sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    static private final SubLSymbol $sym46$SHOP_BASIC_PLANNER_THREAD_ANY_CUTOFF_REACHED__METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-ANY-CUTOFF-REACHED?-METHOD");

    static private final SubLSymbol $sym47$DEPTH_CUTOFF_REACHED_ = makeSymbol("DEPTH-CUTOFF-REACHED?");

    static private final SubLList $list48 = list(makeSymbol("PLAN-STATE"));

    static private final SubLList $list49 = list(makeString("@param PLAN-STATE shop-plan-state-p\n   @return booleanp"), list(RET, list(makeSymbol("FIF"), list(makeSymbol("NUMBERP"), makeSymbol("DEPTH-CUTOFF")), list(makeSymbol(">"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEPTH"), makeSymbol("SHOP-PLAN-STATE")), makeSymbol("PLAN-STATE")), makeSymbol("DEPTH-CUTOFF")), NIL)));

    static private final SubLSymbol $sym50$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    static private final SubLSymbol $sym52$SHOP_BASIC_PLANNER_THREAD_DEPTH_CUTOFF_REACHED__METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-DEPTH-CUTOFF-REACHED?-METHOD");

    static private final SubLSymbol $sym53$TIME_CUTOFF_REACHED_ = makeSymbol("TIME-CUTOFF-REACHED?");

    static private final SubLList $list54 = list(makeString("@return booleanp"), list(RET, list(makeSymbol("FIF"), makeSymbol("TIME-CUTOFF"), list(makeSymbol(">"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ELAPSED-RUN-TIME-SINCE-LAST-CALL"), makeSymbol("STATISTIC-MANAGER")), makeSymbol("STATS-MANAGER")), makeSymbol("TIME-CUTOFF")), NIL)));

    static private final SubLSymbol $sym55$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    static private final SubLSymbol $sym56$SHOP_BASIC_PLANNER_THREAD_TIME_CUTOFF_REACHED__METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-TIME-CUTOFF-REACHED?-METHOD");

    static private final SubLSymbol $sym57$NUMBER_CUTOFF_REACHED_ = makeSymbol("NUMBER-CUTOFF-REACHED?");

    static private final SubLList $list58 = list(makeString("@return booleanp"), list(RET, list(makeSymbol("FIF"), makeSymbol("NUMBER-CUTOFF"), list(makeSymbol(">="), makeSymbol("PLAN-NUMBER-TO-CUTOFF"), makeSymbol("NUMBER-CUTOFF")), NIL)));

    static private final SubLSymbol $sym59$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    static private final SubLSymbol $sym60$SHOP_BASIC_PLANNER_THREAD_NUMBER_CUTOFF_REACHED__METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-NUMBER-CUTOFF-REACHED?-METHOD");

    private static final SubLSymbol CYCL_PLANS = makeSymbol("CYCL-PLANS");

    static private final SubLList $list62 = list(list(RET, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")))));

    static private final SubLSymbol $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_CYCL_PLANS_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-CYCL-PLANS-METHOD");

    private static final SubLSymbol PRINT_STATS_HEADER = makeSymbol("PRINT-STATS-HEADER");

    static private final SubLList $list66 = list(makeSymbol("LABEL"));

    static private final SubLList $list67 = list(list(makeSymbol("OUTPUT-MESSAGE"), makeSymbol("SELF"), list(makeSymbol("FORMAT"), NIL, makeString("~%~7@a Plans Mincost Maxcost Expansions Inferences CPU time Real time"), makeSymbol("LABEL"))), list(RET, NIL));

    static private final SubLString $str68$___7_a_Plans_Mincost_Maxcost_Expa = makeString("~%~7@a Plans Mincost Maxcost Expansions Inferences CPU time Real time");

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_PRINT_STATS_HEADER_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-PRINT-STATS-HEADER-METHOD");

    private static final SubLSymbol PRINT_PLAN = makeSymbol("PRINT-PLAN");

    static private final SubLList $list71 = list(makeSymbol("PLAN"));

    static private final SubLList $list72 = list(list(makeSymbol("OUTPUT-MESSAGE"), makeSymbol("SELF"), list(makeSymbol("FORMAT"), NIL, makeString("~%~s"), makeSymbol("PLAN"))), list(RET, NIL));

    static private final SubLString $str73$___s = makeString("~%~s");

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_PRINT_PLAN_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-PRINT-PLAN-METHOD");

    private static final SubLSymbol PRINT_STATS = makeSymbol("PRINT-STATS");

    static private final SubLList $list76 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PLANS"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")))), list(makeSymbol("TASKS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("NUMBER-OF-EXPANSIONS")))), list(makeSymbol("INFERENCES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("NUMBER-OF-INFERENCES")))), list(makeSymbol("RUN-TIME"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ELAPSED-RUN-TIME"), makeSymbol("SHOP-STATISTIC-MANAGER")), makeSymbol("STATS-MANAGER"))), list(makeSymbol("REAL-TIME"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ELAPSED-REAL-TIME"), makeSymbol("SHOP-STATISTIC-MANAGER")), makeSymbol("STATS-MANAGER")))), list(makeSymbol("OUTPUT-MESSAGE"), makeSymbol("SELF"), list(new SubLObject[]{ makeSymbol("FORMAT"), NIL, makeString("~%~12@a~8@a~8@a~11@s~11@s~10,3f~11,3f"), list(makeSymbol("LENGTH"), makeSymbol("PLANS")), list(makeSymbol("FIF"), makeSymbol("PLANS"), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("MIN")), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("SHOP-PLAN-COST")), makeSymbol("PLANS"))), makeString("-")), list(makeSymbol("FIF"), makeSymbol("PLANS"), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("MAX")), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("SHOP-PLAN-COST")), makeSymbol("PLANS"))), makeString("-")), makeSymbol("TASKS"), makeSymbol("INFERENCES"), list(makeSymbol("/"), makeSymbol("RUN-TIME"), makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*")), list(makeSymbol("/"), makeSymbol("REAL-TIME"), makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*")) })), list(RET, NIL)));

    static private final SubLSymbol $sym77$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    static private final SubLString $str80$___12_a_8_a_8_a_11_s_11_s_10_3f_1 = makeString("~%~12@a~8@a~8@a~11@s~11@s~10,3f~11,3f");

    private static final SubLSymbol SHOP_PLAN_COST = makeSymbol("SHOP-PLAN-COST");

    static private final SubLString $str83$_ = makeString("-");

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_PRINT_STATS_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-PRINT-STATS-METHOD");

    private static final SubLSymbol PRINT_ITERATIVE_DEEPENING_STATS = makeSymbol("PRINT-ITERATIVE-DEEPENING-STATS");

    static private final SubLList $list87 = list(makeSymbol("DEPTH"));

    static private final SubLList $list88 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PLANS"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")))), list(makeSymbol("TASKS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("NUMBER-OF-EXPANSIONS")))), list(makeSymbol("INFERENCES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("NUMBER-OF-INFERENCES")))), list(makeSymbol("RUN-TIME"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("ELAPSED-RUN-TIME-SINCE-LAST-CALL")))), list(makeSymbol("REAL-TIME"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("ELAPSED-REAL-TIME-SINCE-LAST-CALL"))))), list(makeSymbol("OUTPUT-MESSAGE"), makeSymbol("SELF"), list(new SubLObject[]{ makeSymbol("FORMAT"), NIL, makeString("~%~6@a~6@a~8@a~8@a~11@s~11@s~10,3f~11,3f"), makeSymbol("DEPTH"), list(makeSymbol("LENGTH"), makeSymbol("PLANS")), list(makeSymbol("FIF"), makeSymbol("PLANS"), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("MIN")), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("SHOP-PLAN-COST")), makeSymbol("PLANS"))), makeString("-")), list(makeSymbol("FIF"), makeSymbol("PLANS"), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("MAX")), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("SHOP-PLAN-COST")), makeSymbol("PLANS"))), makeString("-")), makeSymbol("TASKS"), makeSymbol("INFERENCES"), list(makeSymbol("/"), makeSymbol("RUN-TIME"), makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*")), list(makeSymbol("/"), makeSymbol("REAL-TIME"), makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*")) })), list(RET, NIL)));

    static private final SubLSymbol $sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    private static final SubLSymbol ELAPSED_RUN_TIME_SINCE_LAST_CALL = makeSymbol("ELAPSED-RUN-TIME-SINCE-LAST-CALL");

    private static final SubLSymbol ELAPSED_REAL_TIME_SINCE_LAST_CALL = makeSymbol("ELAPSED-REAL-TIME-SINCE-LAST-CALL");

    static private final SubLString $str92$___6_a_6_a_8_a_8_a_11_s_11_s_10_3 = makeString("~%~6@a~6@a~8@a~8@a~11@s~11@s~10,3f~11,3f");

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_PRINT_ITERATIVE_DEEPENING_STATS_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-PRINT-ITERATIVE-DEEPENING-STATS-METHOD");

    private static final SubLSymbol HTML_STATS = makeSymbol("HTML-STATS");

    static private final SubLList $list95 = list(makeString("Displays in HTML an informative summary of the last planner run\n   on this thread."), list(makeSymbol("CLET"), list(list(makeSymbol("PLANS"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")))), list(makeSymbol("NUM-PLANS"), list(makeSymbol("LENGTH"), makeSymbol("PLANS"))), list(makeSymbol("TASKS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("NUMBER-OF-EXPANSIONS")))), list(makeSymbol("INFERENCES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("NUMBER-OF-INFERENCES")))), list(makeSymbol("RUN-TIME"), list(makeSymbol("/"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("ELAPSED-RUN-TIME"))), makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*"))), list(makeSymbol("REAL-TIME"), list(makeSymbol("/"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("ELAPSED-REAL-TIME"))), makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*")))), list(makeSymbol("HTML-FANCY-TABLE"), list(makeKeyword("CELLPADDING"), FIVE_INTEGER, makeKeyword("CELLSPACING"), ZERO_INTEGER, makeKeyword("BORDER"), ZERO_INTEGER), list(makeSymbol("HTML-TABLE-ROW"), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("Plans")))), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("MinCost")))), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("MaxCost")))), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("Expansions")))), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("Inferences")))), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("CPU Time")))), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("Real Time"))))), list(makeSymbol("HTML-TABLE-ROW"), list(makeSymbol("HTML-FANCY-TABLE-DATA"), list(makeKeyword("ALIGN"), makeKeyword("RIGHT")), list(makeSymbol("HTML-PRINC"), makeSymbol("NUM-PLANS"))), list(makeSymbol("HTML-FANCY-TABLE-DATA"), list(makeKeyword("ALIGN"), makeKeyword("RIGHT")), list(makeSymbol("HTML-PRINC"), list(makeSymbol("FIF"), makeSymbol("PLANS"), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("MIN")), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("SHOP-PLAN-COST")), makeSymbol("PLANS"))), makeString("-")))), list(makeSymbol("HTML-FANCY-TABLE-DATA"), list(makeKeyword("ALIGN"), makeKeyword("RIGHT")), list(makeSymbol("HTML-PRINC"), list(makeSymbol("FIF"), makeSymbol("PLANS"), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("MAX")), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("SHOP-PLAN-COST")), makeSymbol("PLANS"))), makeString("-")))), list(makeSymbol("HTML-FANCY-TABLE-DATA"), list(makeKeyword("ALIGN"), makeKeyword("RIGHT")), list(makeSymbol("HTML-PRINC"), makeSymbol("TASKS"))), list(makeSymbol("HTML-FANCY-TABLE-DATA"), list(makeKeyword("ALIGN"), makeKeyword("RIGHT")), list(makeSymbol("HTML-PRINC"), makeSymbol("INFERENCES"))), list(makeSymbol("HTML-FANCY-TABLE-DATA"), list(makeKeyword("ALIGN"), makeKeyword("RIGHT")), list(makeSymbol("HTML-PRINC"), makeSymbol("RUN-TIME"))), list(makeSymbol("HTML-FANCY-TABLE-DATA"), list(makeKeyword("ALIGN"), makeKeyword("RIGHT")), list(makeSymbol("HTML-PRINC"), makeSymbol("REAL-TIME"))))), list(RET, NIL)));

    static private final SubLSymbol $sym96$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    private static final SubLSymbol ELAPSED_RUN_TIME = makeSymbol("ELAPSED-RUN-TIME");

    private static final SubLSymbol ELAPSED_REAL_TIME = makeSymbol("ELAPSED-REAL-TIME");

    static private final SubLString $$$Plans = makeString("Plans");

    static private final SubLString $$$MinCost = makeString("MinCost");

    static private final SubLString $$$MaxCost = makeString("MaxCost");

    static private final SubLString $$$Expansions = makeString("Expansions");

    static private final SubLString $$$Inferences = makeString("Inferences");

    static private final SubLString $$$CPU_Time = makeString("CPU Time");

    static private final SubLString $$$Real_Time = makeString("Real Time");

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_HTML_STATS_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-HTML-STATS-METHOD");

    private static final SubLSymbol SET_PROBLEM = makeSymbol("SET-PROBLEM");

    static private final SubLList $list109 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list110 = list(makeSymbol("D"));

    static private final SubLList $list111 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("D"), makeSymbol("INTEGERP")), list(makeSymbol("CSETQ"), makeSymbol("PROBLEM"), makeSymbol("D")), list(RET, makeSymbol("D")));

    static private final SubLSymbol $sym112$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_SET_PROBLEM_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-SET-PROBLEM-METHOD");

    private static final SubLSymbol GET_PROBLEM = makeSymbol("GET-PROBLEM");

    static private final SubLList $list116 = list(list(RET, makeSymbol("PROBLEM")));

    static private final SubLSymbol $sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_GET_PROBLEM_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-GET-PROBLEM-METHOD");

    static private final SubLList $list120 = list(list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-DOMAIN"), makeSymbol("SHOP-BASIC-PROBLEM")), makeSymbol("PROBLEM"))));

    static private final SubLSymbol $sym121$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_GET_DOMAIN_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-GET-DOMAIN-METHOD");

    private static final SubLSymbol GET_WHICH_PLANS = makeSymbol("GET-WHICH-PLANS");

    static private final SubLList $list124 = list(list(RET, makeSymbol("WHICH-PLANS")));

    static private final SubLSymbol $sym125$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_GET_WHICH_PLANS_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-GET-WHICH-PLANS-METHOD");

    private static final SubLSymbol SET_WHICH_PLANS = makeSymbol("SET-WHICH-PLANS");

    static private final SubLList $list128 = list(makeSymbol("W"));

    static private final SubLList $list129 = list(list(makeSymbol("CSETQ"), makeSymbol("WHICH-PLANS"), makeSymbol("W")), list(RET, makeSymbol("W")));

    static private final SubLSymbol $sym130$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_SET_WHICH_PLANS_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-SET-WHICH-PLANS-METHOD");

    private static final SubLSymbol INIT_PLAN_STATE = makeSymbol("INIT-PLAN-STATE");

    static private final SubLList $list133 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PRIVATE"));

    static private final SubLList $list134 = list(makeSymbol("PROBLEM"));

    static private final SubLList $list135 = list(makeString("@param PROBLEM shop-problem-p"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PROBLEM")), makeSymbol("PROBLEM")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("INITIAL-PLAN-STATE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-BASIC-PLAN-STATE")), list(QUOTE, makeSymbol("SHOP-BASIC-PLAN-STATE")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("INITIALIZE-PLAN-STATE-WITH-PROBLEM"), makeSymbol("SHOP-BASIC-PLAN-STATE")), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("INITIAL-PLAN-STATE"))), makeSymbol("PROBLEM"), makeSymbol("SELF")), list(RET, NIL));

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_INIT_PLAN_STATE_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-INIT-PLAN-STATE-METHOD");

    private static final SubLSymbol INIT_PLANNER_THREAD = makeSymbol("INIT-PLANNER-THREAD");

    static private final SubLList $list139 = list(makeSymbol("NEW-PROBLEM"), makeSymbol("WHICH"), makeSymbol("VERBOSE"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"));

    static private final SubLList $list140 = list(new SubLObject[]{ makeString("called each time by FIND-PLANS. The first time, it sets up the INITIAL-PLAN-STATE\n   so the search can begin. Thereafter, when it is called by FIND-PLANS as part\n   of a search continuation. it resets the search-cutoffs, so that search can continue."), list(makeSymbol("PWHEN"), makeSymbol("DEPTH"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DEPTH-CUTOFF")), makeSymbol("DEPTH"))), list(makeSymbol("PWHEN"), makeSymbol("TIME"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("TIME-CUTOFF")), list(makeSymbol("*"), makeSymbol("TIME"), makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*")))), list(makeSymbol("PWHEN"), makeSymbol("NUMBER"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NUMBER-CUTOFF")), makeSymbol("NUMBER"))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("WHICH-PLANS")), makeSymbol("WHICH")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLAN-NUMBER")), ZERO_INTEGER), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLAN-NUMBER-TO-CUTOFF")), ZERO_INTEGER), list(makeSymbol("FIM"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LOG"))), list(QUOTE, makeSymbol("SET-VERBOSITY")), makeSymbol("VERBOSE")), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PROBLEM"))), list(makeSymbol("INIT-PLAN-STATE"), makeSymbol("SELF"), makeSymbol("NEW-PROBLEM")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("OPEN-NODES")), list(makeSymbol("LIST"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("INITIAL-PLAN-STATE")))))), list(RET, NIL) });

    private static final SubLSymbol SET_VERBOSITY = makeSymbol("SET-VERBOSITY");

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_INIT_PLANNER_THREAD_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-INIT-PLANNER-THREAD-METHOD");

    private static final SubLSymbol FOUND_PLAN = makeSymbol("FOUND-PLAN");

    static private final SubLList $list144 = list(makeString("@param PLAN-STATE shop-basic-plan-state-p \n   @return booleanp\n   FOUND-PLAN is called\n   when a PLAN-STATE has found a plan that satisfies the original\n   task. The plan is recorded with the state of the thread, and the\n   search continues.  Returns NIL."), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLAN-NUMBER")), list(makeSymbol("+"), ONE_INTEGER, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLAN-NUMBER"))))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLAN-NUMBER-TO-CUTOFF")), list(makeSymbol("+"), ONE_INTEGER, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLAN-NUMBER-TO-CUTOFF"))))), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-PLAN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-BASIC-PLAN")), list(QUOTE, makeSymbol("SHOP-BASIC-PLAN")))), list(makeSymbol("DEPTH"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEPTH"), makeSymbol("SHOP-PLAN-STATE")), makeSymbol("PLAN-STATE"))), list(makeSymbol("WHICH-PLANS"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("WHICH-PLANS"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("POPULATE-PLAN"), makeSymbol("SHOP-BASIC-PLAN")), makeSymbol("NEW-PLAN"), makeSymbol("PLAN-STATE")), list(makeSymbol("PCASE"), makeSymbol("WHICH-PLANS"), list(makeKeyword("SHALLOWEST"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DEPTH-CUTOFF")), list(makeSymbol("1-"), makeSymbol("DEPTH"))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")), list(makeSymbol("LIST"), makeSymbol("NEW-PLAN")))), list(makeKeyword("ALL-SHALLOWEST"), list(makeSymbol("PWHEN"), list(makeSymbol("CNOT"), list(EQUAL, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DEPTH-CUTOFF"))), makeSymbol("DEPTH"))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")), NIL), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DEPTH-CUTOFF")), makeSymbol("DEPTH"))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")), list(makeSymbol("CONS"), makeSymbol("NEW-PLAN"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")))))), list(list(makeKeyword("ALL"), makeKeyword("FIRST")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")), list(makeSymbol("CONS"), makeSymbol("NEW-PLAN"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")))))), list(makeSymbol("OTHERWISE"), list(makeSymbol("CERROR"), makeString("invalid keyword ~S"), makeSymbol("WHICH-PLANS")))), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("CUTOFFS"), list(makeSymbol("FIM"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LOG"))), list(QUOTE, makeSymbol("SUCCESS")), list(makeSymbol("FORMAT"), NIL, makeString("depth ~s found plan #~s"), makeSymbol("DEPTH"), list(makeSymbol("LENGTH"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND"))))))), list(RET, list(makeSymbol("LIST"), NIL))));

    private static final SubLSymbol SHOP_BASIC_PLAN = makeSymbol("SHOP-BASIC-PLAN");

    static private final SubLString $str150$invalid_keyword__S = makeString("invalid keyword ~S");

    static private final SubLString $str154$depth__s_found_plan___s = makeString("depth ~s found plan #~s");

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_FOUND_PLAN_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-FOUND-PLAN-METHOD");

    static private final SubLList $list156 = list(list(RET, makeSymbol("HALT-STATUS")));

    static private final SubLSymbol $sym157$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_HALT_STATUS_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-HALT-STATUS-METHOD");

    private static final SubLSymbol UPDATE_HALT_STATUS = makeSymbol("UPDATE-HALT-STATUS");

    static private final SubLList $list160 = list(list(makeSymbol("CLET"), list(list(makeSymbol("OPEN-NODES"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("OPEN-NODES"))))), list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("OPEN-NODES")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("HALT-STATUS")), makeKeyword("SEARCH-EXHAUSTED"))), list(list(makeSymbol("TIME-CUTOFF-REACHED?"), makeSymbol("SELF")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("HALT-STATUS")), makeKeyword("TIME-CUTOFF"))), list(list(makeSymbol("DEPTH-CUTOFF-REACHED?"), makeSymbol("SELF"), list(makeSymbol("FIRST"), makeSymbol("OPEN-NODES"))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("HALT-STATUS")), makeKeyword("DEPTH-CUTOFF"))), list(list(makeSymbol("NUMBER-CUTOFF-REACHED?"), makeSymbol("SELF")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLAN-NUMBER-TO-CUTOFF")), ZERO_INTEGER), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("HALT-STATUS")), makeKeyword("NUMBER-CUTOFF")))), list(RET, NIL)));

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_UPDATE_HALT_STATUS_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-UPDATE-HALT-STATUS-METHOD");

    private static final SubLSymbol SEEK_PLANS = makeSymbol("SEEK-PLANS");

    static private final SubLList $list167 = list(makeString("SEEK-PLANS is the main planning loop. \n   OPEN-NODES is the list of current unexpand plan-states."), list(makeSymbol("PUNLESS"), list(makeSymbol("ANY-CUTOFF-REACHED?"), makeSymbol("SELF")), list(makeSymbol("CDO"), list(list(makeSymbol("OPEN-NODES"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("OPEN-NODES"))), makeSymbol("OPEN-NODES"))), list(list(makeSymbol("NULL"), makeSymbol("OPEN-NODES")), list(RET, NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("ANY-CUTOFF-REACHED?"), makeSymbol("SELF")), list(makeSymbol("SHOP-PLANNER-THREAD-PAUSE"), makeSymbol("SELF"))), list(makeSymbol("SHOP-PROCESS-CHECKPOINT"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-EXPANSION"), makeSymbol("SHOP-STATISTIC-MANAGER")), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("STATS-MANAGER")))), list(makeSymbol("CLET"), list(list(makeSymbol("CUR-NODE"), list(makeSymbol("FIRST"), makeSymbol("OPEN-NODES")))), list(makeSymbol("CPOP"), makeSymbol("OPEN-NODES")), list(makeSymbol("PIF"), list(makeSymbol("NULL"), list(makeSymbol("GET-SLOT"), makeSymbol("CUR-NODE"), list(QUOTE, makeSymbol("TASKLIST")))), list(makeSymbol("PROGN"), list(makeSymbol("FOUND-PLAN"), makeSymbol("SELF"), makeSymbol("CUR-NODE")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("OPEN-NODES")), makeSymbol("OPEN-NODES"))), list(makeSymbol("PROGN"), list(makeSymbol("CPUSH*"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EXPAND"), makeSymbol("SHOP-BASIC-PLAN-STATE")), makeSymbol("CUR-NODE")), makeSymbol("OPEN-NODES")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("OPEN-NODES")), makeSymbol("OPEN-NODES"))))))));

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_SEEK_PLANS_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-SEEK-PLANS-METHOD");

    private static final SubLSymbol SEEK_PLANS_WITH_ITERATIVE_DEEPENING = makeSymbol("SEEK-PLANS-WITH-ITERATIVE-DEEPENING");

    static private final SubLList $list171 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LAST-ITERATION-EXPANSIONS"), ZERO_INTEGER), list(makeSymbol("LAST-ITERATION-INFERENCES"), ZERO_INTEGER)), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("START-TIMING"))), list(makeSymbol("PRINT-STATS-HEADER"), makeSymbol("SELF"), makeString("Depth")), list(new SubLObject[]{ makeSymbol("CDO"), list(list(makeSymbol("CUR-DEPTH"), ZERO_INTEGER, list(makeSymbol("1+"), makeSymbol("CUR-DEPTH")))), list(list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")))), list(makeSymbol("CSETQ"), makeSymbol("LAST-ITERATION-EXPANSIONS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("NUMBER-OF-EXPANSIONS")))), list(makeSymbol("CSETQ"), makeSymbol("LAST-ITERATION-INFERENCES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("NUMBER-OF-INFERENCES")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("RESET-COUNTERS"))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DEPTH-CUTOFF")), makeSymbol("CUR-DEPTH")), list(makeSymbol("SEEK-PLANS"), makeSymbol("SELF")), list(makeSymbol("PRINT-ITERATIVE-DEEPENING-STATS"), makeSymbol("SELF"), makeSymbol("CUR-DEPTH")), list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(makeSymbol("ZEROP"), list(makeSymbol("-"), makeSymbol("LAST-ITERATION-EXPANSIONS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("NUMBER-OF-EXPANSIONS"))))), list(makeSymbol("ZEROP"), list(makeSymbol("-"), makeSymbol("LAST-ITERATION-INFERENCES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("NUMBER-OF-INFERENCES")))))), list(makeSymbol("CERROR"), makeString("Error"), makeString("No expansions or inferences ~%added this iteration."))) }), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("STOP-TIMING")))), list(RET, NIL));

    static private final SubLSymbol $sym172$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    private static final SubLSymbol START_TIMING = makeSymbol("START-TIMING");

    static private final SubLString $$$Depth = makeString("Depth");

    private static final SubLSymbol RESET_COUNTERS = makeSymbol("RESET-COUNTERS");

    static private final SubLString $$$Error = makeString("Error");

    static private final SubLString $str177$No_expansions_or_inferences___add = makeString("No expansions or inferences ~%added this iteration.");

    static private final SubLSymbol $sym178$SHOP_BASIC_PLANNER_THREAD_SEEK_PLANS_WITH_ITERATIVE_DEEPENING_MET = makeSymbol("SHOP-BASIC-PLANNER-THREAD-SEEK-PLANS-WITH-ITERATIVE-DEEPENING-METHOD");

    private static final SubLSymbol GATHER_INITIAL_STATE = makeSymbol("GATHER-INITIAL-STATE");

    static private final SubLList $list180 = list(makeSymbol("MT"));

    static private final SubLList $list181 = list(makeString("@param MT hlmt-p\n   @return listp ;; of hl-formula-p"), list(makeSymbol("CLET"), list(list(makeSymbol("INIT-MTS"), NIL)), list(makeSymbol("DO-ALL-GENL-MTS"), list(makeSymbol("GENL-MT"), makeSymbol("MT")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("MEMBER?"), makeSymbol("GENL-MT"), makeSymbol("INIT-MTS"))), list(makeSymbol("ISA?"), makeSymbol("GENL-MT"), reader_make_constant_shell("PlanDynamicSituationMicrotheory"))), list(makeSymbol("CPUSH"), makeSymbol("GENL-MT"), makeSymbol("INIT-MTS")))), list(RET, list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("ASSERTION-HL-FORMULA")), list(makeSymbol("APPLY"), list(QUOTE, makeSymbol("APPEND")), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("GATHER-MT-INDEX")), makeSymbol("INIT-MTS")))))));

    static private final SubLString $str187$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $$$continue_anyway = makeString("continue anyway");

    static private final SubLString $str192$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");





    private static final SubLString $str195$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str196$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str197$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol ASSERTION_HL_FORMULA = makeSymbol("ASSERTION-HL-FORMULA");

    private static final SubLSymbol GATHER_MT_INDEX = makeSymbol("GATHER-MT-INDEX");

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_GATHER_INITIAL_STATE_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-GATHER-INITIAL-STATE-METHOD");

    private static final SubLSymbol MAKE_PROBLEM = makeSymbol("MAKE-PROBLEM");

    static private final SubLList $list203 = list(makeSymbol("PROBLEM-NAME"), makeSymbol("STATE"), makeSymbol("TASKS"), makeSymbol("MT"));

    private static final SubLList $list204 = list(makeString("@param PROBLEM-NAME\n   @param DOMAIN-NAME\n   @param STATE\n   @param TASKS\n   @param MT             microtheory-p\n   @return               shop-basic-problem-p"), list(makeSymbol("IGNORE"), makeSymbol("STATE")), list(makeSymbol("CLET"), list(makeSymbol("DOMAIN"), makeSymbol("NEW-PROBLEM"), makeSymbol("NEW-WORLD-STATE")), list(makeSymbol("CSETQ"), makeSymbol("NEW-PROBLEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-BASIC-PROBLEM")), list(QUOTE, makeSymbol("SHOP-BASIC-PROBLEM")))), list(makeSymbol("PIF"), makeSymbol("*SHOP-USE-MT-WORLD-STATES?*"), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("NEW-WORLD-STATE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-MT-WORLD-STATE")), list(QUOTE, makeSymbol("SHOP-MT-WORLD-STATE")))), list(makeSymbol("SET-SLOT"), makeSymbol("NEW-WORLD-STATE"), list(QUOTE, makeSymbol("MT")), makeSymbol("MT"))), list(makeSymbol("CSETQ"), makeSymbol("NEW-WORLD-STATE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-BASIC-WORLD-STATE")), list(QUOTE, makeSymbol("SHOP-BASIC-WORLD-STATE"))))), list(makeSymbol("CSETQ"), makeSymbol("DOMAIN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PLANNER"), list(QUOTE, makeSymbol("GET-DOMAIN")), makeSymbol("MT"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("INITIALIZE-PROBLEM"), makeSymbol("SHOP-BASIC-PROBLEM")), makeSymbol("NEW-PROBLEM"), makeSymbol("PROBLEM-NAME"), makeSymbol("DOMAIN"), makeSymbol("NEW-WORLD-STATE"), makeSymbol("TASKS"), makeSymbol("MT")), list(RET, makeSymbol("NEW-PROBLEM"))));

    private static final SubLSymbol $sym205$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_MAKE_PROBLEM_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-MAKE-PROBLEM-METHOD");

    private static final SubLSymbol MAKE_PROBLEM_FROM_FORMULA = makeSymbol("MAKE-PROBLEM-FROM-FORMULA");

    static private final SubLList $list212 = list(makeSymbol("FORMULA"), makeSymbol("MT"));

    private static final SubLList $list213 = list(makeString("@param FORMULA el-formula-p\n   @param MT microtheory-p"), list(makeSymbol("CLET"), list(list(makeSymbol("HL-FORMULA"), list(makeSymbol("SHOP-REIFY-NARTS-IN-EXPRESSION"), makeSymbol("FORMULA"))), list(makeSymbol("CYC-TASKS"), list(makeSymbol("LIST"), makeSymbol("HL-FORMULA"))), list(makeSymbol("INITIAL-STATE"), NIL), makeSymbol("NEW-PROBLEM")), list(makeSymbol("CSETQ"), makeSymbol("NEW-PROBLEM"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("MAKE-PROBLEM")), makeSymbol("FORMULA"), makeSymbol("INITIAL-STATE"), makeSymbol("CYC-TASKS"), makeSymbol("MT"))), list(RET, makeSymbol("NEW-PROBLEM"))));

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_MAKE_PROBLEM_FROM_FORMULA_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-MAKE-PROBLEM-FROM-FORMULA-METHOD");

    private static final SubLSymbol FIND_PLANS = makeSymbol("FIND-PLANS");

    static private final SubLList $list216 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list217 = list(makeSymbol("TASK-FORMULA"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("WHICH"), makeKeyword("ALL")), list(makeSymbol("VERBOSITY"), ZERO_INTEGER), list(makeSymbol("NUMBER"), NIL), list(makeSymbol("TIME"), NIL), list(makeSymbol("DEPTH"), NIL));

    private static final SubLList $list218 = list(makeString("@param TASK-FORMULA el-formula-p\n   @param MT microtheory-p\n   FIND-PLANS starts the search for a plan for problem with name NEW-PROBLEM."), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("NEW-PROBLEM"), list(makeSymbol("MAKE-PROBLEM-FROM-FORMULA"), makeSymbol("SELF"), makeSymbol("TASK-FORMULA"), makeSymbol("MT"))), makeSymbol("DOMAIN")), list(makeSymbol("INIT-PLANNER-THREAD"), makeSymbol("SELF"), makeSymbol("NEW-PROBLEM"), makeSymbol("WHICH"), makeSymbol("VERBOSITY"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH")), list(makeSymbol("PWHEN"), makeSymbol("*SHOP-GC*"), list(makeSymbol("GC"))), list(makeSymbol("CSETQ"), makeSymbol("DOMAIN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-NAME"), makeSymbol("SHOP-BASIC-DOMAIN")), list(makeSymbol("GET-SLOT"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PROBLEM"))), list(QUOTE, makeSymbol("DOMAIN"))))), list(makeSymbol("WHEN-VERBOSE"), ONE_INTEGER, list(makeSymbol("FORMAT"), T, makeString("Problem: ~s Domain: ~s Plans: ~s Verbosity: ~s~%"), makeSymbol("NEW-PROBLEM"), makeSymbol("DOMAIN"), makeSymbol("WHICH"), makeSymbol("VERBOSITY"))), list(makeSymbol("PCASE"), makeSymbol("WHICH"), list(list(makeKeyword("ID-FIRST"), makeKeyword("ID-ALL")), list(makeSymbol("SEEK-PLANS-WITH-ITERATIVE-DEEPENING"), makeSymbol("SELF"))), list(list(makeKeyword("FIRST"), makeKeyword("ALL"), makeKeyword("SHALLOWEST"), makeKeyword("ALL-SHALLOWEST")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), list(makeSymbol("GET-SHOP-BASIC-PLANNER-THREAD-STATS-MANAGER"), makeSymbol("SELF")), list(QUOTE, makeSymbol("START-TIMING"))), list(makeSymbol("SEEK-PLANS"), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), list(makeSymbol("GET-SHOP-BASIC-PLANNER-THREAD-STATS-MANAGER"), makeSymbol("SELF")), list(QUOTE, makeSymbol("STOP-TIMING")))), list(makeSymbol("OTHERWISE"), list(makeSymbol("CERROR"), makeString("invalid keyword ~S"), makeSymbol("WHICH")))), list(makeSymbol("WHEN-VERBOSE"), ONE_INTEGER, list(makeSymbol("OUTPUT-MESSAGE"), makeSymbol("SELF"), list(makeSymbol("CCONCATENATE"), makeString("Halted Because: "), list(makeSymbol("WRITE-TO-STRING"), list(makeSymbol("HALT-STATUS"), makeSymbol("SELF"))))), list(makeSymbol("PRINT-STATS-HEADER"), makeSymbol("SELF"), makeString("Totals:")), list(makeSymbol("PRINT-STATS"), makeSymbol("SELF"))), list(RET, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")))) }));

    private static final SubLString $str220$Problem___s_Domain___s_Plans___s_ = makeString("Problem: ~s Domain: ~s Plans: ~s Verbosity: ~s~%");

    private static final SubLString $str223$Halted_Because__ = makeString("Halted Because: ");

    private static final SubLString $str224$Totals_ = makeString("Totals:");

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_FIND_PLANS_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-FIND-PLANS-METHOD");

    private static final SubLSymbol $sym226$COMPLETED_RUN_ = makeSymbol("COMPLETED-RUN?");

    private static final SubLList $list227 = list(makeString("@return booleanp"), list(RET, list(makeSymbol("NULL"), makeSymbol("OPEN-NODES"))));

    private static final SubLSymbol $sym228$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    private static final SubLSymbol $sym229$SHOP_BASIC_PLANNER_THREAD_COMPLETED_RUN__METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-COMPLETED-RUN?-METHOD");

    private static final SubLSymbol SUMMARY = makeSymbol("SUMMARY");

    private static final SubLList $list231 = list(makeString("This function returns a list of values that can be used to summarize\n   the results of the thread."), list(makeSymbol("CLET"), list(list(makeSymbol("TASK-LIST"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROBLEM"), list(QUOTE, makeSymbol("GET-TASKS")))), list(makeSymbol("TASK"), list(makeSymbol("FIRST"), makeSymbol("TASK-LIST"))), list(makeSymbol("COMPLETED-RUN?"), list(makeSymbol("COMPLETED-RUN?"), makeSymbol("SELF"))), list(makeSymbol("PLAN-COUNT"), list(makeSymbol("LENGTH"), makeSymbol("PLANS-FOUND")))), list(RET, list(makeSymbol("LIST"), makeSymbol("TASK"), makeSymbol("COMPLETED-RUN?"), makeSymbol("PLAN-COUNT")))));

    private static final SubLSymbol $sym232$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    private static final SubLSymbol GET_TASKS = makeSymbol("GET-TASKS");

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_SUMMARY_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-SUMMARY-METHOD");

    private static final SubLSymbol HTML_DISPLAY_SUMMARY = makeSymbol("HTML-DISPLAY-SUMMARY");

    static private final SubLList $list236 = list(makeSymbol("PARAPHRASE-LINK"));

    private static final SubLList $list237 = list(makeString("this function is used by the CycSecure AttackPlan History functionality.\n   displauys a short message about the thread and its resoultion."), list(makeSymbol("CLET"), list(list(makeSymbol("TASK-LIST"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROBLEM"), list(QUOTE, makeSymbol("GET-TASKS")))), list(makeSymbol("TASK"), list(makeSymbol("FIRST"), makeSymbol("TASK-LIST")))), list(makeSymbol("HTML-FANCY-TABLE-DATA"), list(makeKeyword("ALIGN"), makeKeyword("RIGHT")), list(makeSymbol("HTML-TEXT-WITH-TARGET"), makeSymbol("TASK"), makeSymbol("PARAPHRASE-LINK"))), list(makeSymbol("HTML-FANCY-TABLE-DATA"), list(makeKeyword("ALIGN"), makeKeyword("RIGHT")), list(makeSymbol("PIF"), list(makeSymbol("COMPLETED-RUN?"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("PLAN-COUNT"), list(makeSymbol("LENGTH"), makeSymbol("PLANS-FOUND")))), list(makeSymbol("PCOND"), list(list(makeSymbol("ZEROP"), makeSymbol("PLAN-COUNT")), list(makeSymbol("HTML-PRINC"), makeString("No plans found"))), list(list(EQ, ONE_INTEGER, makeSymbol("PLAN-COUNT")), list(makeSymbol("HTML-FORMAT"), makeString("~A Plan found"), makeSymbol("PLAN-COUNT"))), list(T, list(makeSymbol("HTML-FORMAT"), makeString("~A Plans found"), makeSymbol("PLAN-COUNT"))))), list(makeSymbol("HTML-PRINC"), makeString("Not Completed")))), list(RET, NIL)));

    private static final SubLSymbol $sym238$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    private static final SubLString $$$No_plans_found = makeString("No plans found");

    private static final SubLString $str240$_A_Plan_found = makeString("~A Plan found");

    private static final SubLString $str241$_A_Plans_found = makeString("~A Plans found");

    private static final SubLString $$$Not_Completed = makeString("Not Completed");

    private static final SubLSymbol SHOP_BASIC_PLANNER_THREAD_HTML_DISPLAY_SUMMARY_METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-HTML-DISPLAY-SUMMARY-METHOD");

    private static final SubLList $list244 = list(makeSymbol("METHOD"), makeSymbol("CLASS"), makeSymbol("LIST"));

    private static final SubLSymbol SUBLOOP_TYPE_P = makeSymbol("SUBLOOP-TYPE-P");

    private static final SubLList $list248 = list(list(makeSymbol("RESULT-LIST"), NIL));

    private static final SubLSymbol CUR_ITEM = makeSymbol("CUR-ITEM");

    static private final SubLList $list253 = list(makeSymbol("CUR-ITEM"));

    static private final SubLList $list254 = list(makeSymbol("RESULT-LIST"));

    private static final SubLList $list255 = list(list(makeSymbol("REVERSE"), makeSymbol("RESULT-LIST")));

    private static final SubLSymbol $sym256$SHOP_REIFIABLE_NAT_ = makeSymbol("SHOP-REIFIABLE-NAT?");

    private static final SubLSymbol FIND_WHEN_CLOSED_NAUT = makeSymbol("FIND-WHEN-CLOSED-NAUT");

    private static final SubLSymbol SHOP_PLANNER_THREAD_P = makeSymbol("SHOP-PLANNER-THREAD-P");

    // Definitions
    public static final SubLObject shop_process_checkpoint_alt(SubLObject thread) {
        {
            SubLObject pw = instances.get_slot(thread, P_WRAPPER);
            SubLObject stats_manager = instances.get_slot(thread, STATS_MANAGER);
            if (NIL != pw) {
                methods.funcall_instance_method_with_0_args(stats_manager, STOP_TIMING);
                process_utilities.process_wrapper_checkpoint(pw);
                methods.funcall_instance_method_with_0_args(stats_manager, RESUME_TIMING);
            }
            return NIL;
        }
    }

    // Definitions
    public static SubLObject shop_process_checkpoint(final SubLObject thread) {
        final SubLObject pw = instances.get_slot(thread, shop_basic_planner_thread.P_WRAPPER);
        final SubLObject stats_manager = instances.get_slot(thread, STATS_MANAGER);
        if (NIL != pw) {
            methods.funcall_instance_method_with_0_args(stats_manager, shop_basic_planner_thread.STOP_TIMING);
            process_utilities.process_wrapper_checkpoint(pw);
            methods.funcall_instance_method_with_0_args(stats_manager, shop_basic_planner_thread.RESUME_TIMING);
        }
        return NIL;
    }

    public static final SubLObject get_shop_basic_planner_thread_plans_found_alt(SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, NINETEEN_INTEGER);
    }

    public static SubLObject get_shop_basic_planner_thread_plans_found(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, NINETEEN_INTEGER);
    }

    public static final SubLObject set_shop_basic_planner_thread_plans_found_alt(SubLObject v_shop_basic_planner_thread, SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, NINETEEN_INTEGER);
    }

    public static SubLObject set_shop_basic_planner_thread_plans_found(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, NINETEEN_INTEGER);
    }

    public static final SubLObject get_shop_basic_planner_thread_plan_number_to_cutoff_alt(SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, EIGHTEEN_INTEGER);
    }

    public static SubLObject get_shop_basic_planner_thread_plan_number_to_cutoff(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, EIGHTEEN_INTEGER);
    }

    public static final SubLObject set_shop_basic_planner_thread_plan_number_to_cutoff_alt(SubLObject v_shop_basic_planner_thread, SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, EIGHTEEN_INTEGER);
    }

    public static SubLObject set_shop_basic_planner_thread_plan_number_to_cutoff(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, EIGHTEEN_INTEGER);
    }

    public static final SubLObject get_shop_basic_planner_thread_plan_number_alt(SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, SEVENTEEN_INTEGER);
    }

    public static SubLObject get_shop_basic_planner_thread_plan_number(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, SEVENTEEN_INTEGER);
    }

    public static final SubLObject set_shop_basic_planner_thread_plan_number_alt(SubLObject v_shop_basic_planner_thread, SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, SEVENTEEN_INTEGER);
    }

    public static SubLObject set_shop_basic_planner_thread_plan_number(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, SEVENTEEN_INTEGER);
    }

    public static final SubLObject get_shop_basic_planner_thread_number_cutoff_alt(SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, SIXTEEN_INTEGER);
    }

    public static SubLObject get_shop_basic_planner_thread_number_cutoff(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, SIXTEEN_INTEGER);
    }

    public static final SubLObject set_shop_basic_planner_thread_number_cutoff_alt(SubLObject v_shop_basic_planner_thread, SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, SIXTEEN_INTEGER);
    }

    public static SubLObject set_shop_basic_planner_thread_number_cutoff(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, SIXTEEN_INTEGER);
    }

    public static final SubLObject get_shop_basic_planner_thread_depth_cutoff_alt(SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, FIFTEEN_INTEGER);
    }

    public static SubLObject get_shop_basic_planner_thread_depth_cutoff(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, FIFTEEN_INTEGER);
    }

    public static final SubLObject set_shop_basic_planner_thread_depth_cutoff_alt(SubLObject v_shop_basic_planner_thread, SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, FIFTEEN_INTEGER);
    }

    public static SubLObject set_shop_basic_planner_thread_depth_cutoff(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, FIFTEEN_INTEGER);
    }

    public static final SubLObject get_shop_basic_planner_thread_time_cutoff_alt(SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, FOURTEEN_INTEGER);
    }

    public static SubLObject get_shop_basic_planner_thread_time_cutoff(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, FOURTEEN_INTEGER);
    }

    public static final SubLObject set_shop_basic_planner_thread_time_cutoff_alt(SubLObject v_shop_basic_planner_thread, SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, FOURTEEN_INTEGER);
    }

    public static SubLObject set_shop_basic_planner_thread_time_cutoff(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, FOURTEEN_INTEGER);
    }

    public static final SubLObject get_shop_basic_planner_thread_cycle_checking_alt(SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, THIRTEEN_INTEGER);
    }

    public static SubLObject get_shop_basic_planner_thread_cycle_checking(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, THIRTEEN_INTEGER);
    }

    public static final SubLObject set_shop_basic_planner_thread_cycle_checking_alt(SubLObject v_shop_basic_planner_thread, SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, THIRTEEN_INTEGER);
    }

    public static SubLObject set_shop_basic_planner_thread_cycle_checking(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, THIRTEEN_INTEGER);
    }

    public static final SubLObject get_shop_basic_planner_thread_num_backchains_alt(SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, TWELVE_INTEGER);
    }

    public static SubLObject get_shop_basic_planner_thread_num_backchains(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, TWELVE_INTEGER);
    }

    public static final SubLObject set_shop_basic_planner_thread_num_backchains_alt(SubLObject v_shop_basic_planner_thread, SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, TWELVE_INTEGER);
    }

    public static SubLObject set_shop_basic_planner_thread_num_backchains(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, TWELVE_INTEGER);
    }

    public static final SubLObject get_shop_basic_planner_thread_which_plans_alt(SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, ELEVEN_INTEGER);
    }

    public static SubLObject get_shop_basic_planner_thread_which_plans(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, ELEVEN_INTEGER);
    }

    public static final SubLObject set_shop_basic_planner_thread_which_plans_alt(SubLObject v_shop_basic_planner_thread, SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, ELEVEN_INTEGER);
    }

    public static SubLObject set_shop_basic_planner_thread_which_plans(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, ELEVEN_INTEGER);
    }

    public static final SubLObject get_shop_basic_planner_thread_halt_status_alt(SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_planner_thread, TEN_INTEGER, HALT_STATUS);
    }

    public static SubLObject get_shop_basic_planner_thread_halt_status(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_planner_thread, TEN_INTEGER, HALT_STATUS);
    }

    public static final SubLObject set_shop_basic_planner_thread_halt_status_alt(SubLObject v_shop_basic_planner_thread, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_planner_thread, value, TEN_INTEGER, HALT_STATUS);
    }

    public static SubLObject set_shop_basic_planner_thread_halt_status(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_planner_thread, value, TEN_INTEGER, HALT_STATUS);
    }

    public static final SubLObject get_shop_basic_planner_thread_initial_plan_state_alt(SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_planner_thread, NINE_INTEGER, INITIAL_PLAN_STATE);
    }

    public static SubLObject get_shop_basic_planner_thread_initial_plan_state(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_planner_thread, NINE_INTEGER, shop_basic_planner_thread.INITIAL_PLAN_STATE);
    }

    public static final SubLObject set_shop_basic_planner_thread_initial_plan_state_alt(SubLObject v_shop_basic_planner_thread, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_planner_thread, value, NINE_INTEGER, INITIAL_PLAN_STATE);
    }

    public static SubLObject set_shop_basic_planner_thread_initial_plan_state(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_planner_thread, value, NINE_INTEGER, shop_basic_planner_thread.INITIAL_PLAN_STATE);
    }

    public static final SubLObject get_shop_basic_planner_thread_log_alt(SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_planner_thread, EIGHT_INTEGER, LOG);
    }

    public static SubLObject get_shop_basic_planner_thread_log(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_planner_thread, EIGHT_INTEGER, LOG);
    }

    public static final SubLObject set_shop_basic_planner_thread_log_alt(SubLObject v_shop_basic_planner_thread, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_planner_thread, value, EIGHT_INTEGER, LOG);
    }

    public static SubLObject set_shop_basic_planner_thread_log(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_planner_thread, value, EIGHT_INTEGER, LOG);
    }

    public static final SubLObject get_shop_basic_planner_thread_stats_manager_alt(SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, SEVEN_INTEGER);
    }

    public static SubLObject get_shop_basic_planner_thread_stats_manager(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, SEVEN_INTEGER);
    }

    public static final SubLObject set_shop_basic_planner_thread_stats_manager_alt(SubLObject v_shop_basic_planner_thread, SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, SEVEN_INTEGER);
    }

    public static SubLObject set_shop_basic_planner_thread_stats_manager(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, SEVEN_INTEGER);
    }

    public static final SubLObject get_shop_basic_planner_thread_var_manager_alt(SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, SIX_INTEGER);
    }

    public static SubLObject get_shop_basic_planner_thread_var_manager(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, SIX_INTEGER);
    }

    public static final SubLObject set_shop_basic_planner_thread_var_manager_alt(SubLObject v_shop_basic_planner_thread, SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, SIX_INTEGER);
    }

    public static SubLObject set_shop_basic_planner_thread_var_manager(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, SIX_INTEGER);
    }

    public static final SubLObject get_shop_basic_planner_thread_p_wrapper_alt(SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_planner_thread, FIVE_INTEGER, P_WRAPPER);
    }

    public static SubLObject get_shop_basic_planner_thread_p_wrapper(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_planner_thread, FIVE_INTEGER, shop_basic_planner_thread.P_WRAPPER);
    }

    public static final SubLObject set_shop_basic_planner_thread_p_wrapper_alt(SubLObject v_shop_basic_planner_thread, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_planner_thread, value, FIVE_INTEGER, P_WRAPPER);
    }

    public static SubLObject set_shop_basic_planner_thread_p_wrapper(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_planner_thread, value, FIVE_INTEGER, shop_basic_planner_thread.P_WRAPPER);
    }

    public static final SubLObject get_shop_basic_planner_thread_open_nodes_alt(SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_planner_thread, FOUR_INTEGER, OPEN_NODES);
    }

    public static SubLObject get_shop_basic_planner_thread_open_nodes(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_planner_thread, FOUR_INTEGER, OPEN_NODES);
    }

    public static final SubLObject set_shop_basic_planner_thread_open_nodes_alt(SubLObject v_shop_basic_planner_thread, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_planner_thread, value, FOUR_INTEGER, OPEN_NODES);
    }

    public static SubLObject set_shop_basic_planner_thread_open_nodes(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_planner_thread, value, FOUR_INTEGER, OPEN_NODES);
    }

    public static final SubLObject get_shop_basic_planner_thread_planner_alt(SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, THREE_INTEGER);
    }

    public static SubLObject get_shop_basic_planner_thread_planner(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, THREE_INTEGER);
    }

    public static final SubLObject set_shop_basic_planner_thread_planner_alt(SubLObject v_shop_basic_planner_thread, SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, THREE_INTEGER);
    }

    public static SubLObject set_shop_basic_planner_thread_planner(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, THREE_INTEGER);
    }

    public static final SubLObject get_shop_basic_planner_thread_axioms_alt(SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, TWO_INTEGER);
    }

    public static SubLObject get_shop_basic_planner_thread_axioms(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, TWO_INTEGER);
    }

    public static final SubLObject set_shop_basic_planner_thread_axioms_alt(SubLObject v_shop_basic_planner_thread, SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, TWO_INTEGER);
    }

    public static SubLObject set_shop_basic_planner_thread_axioms(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, TWO_INTEGER);
    }

    public static final SubLObject get_shop_basic_planner_thread_problem_alt(SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_planner_thread, ONE_INTEGER, PROBLEM);
    }

    public static SubLObject get_shop_basic_planner_thread_problem(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_planner_thread, ONE_INTEGER, PROBLEM);
    }

    public static final SubLObject set_shop_basic_planner_thread_problem_alt(SubLObject v_shop_basic_planner_thread, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_planner_thread, value, ONE_INTEGER, PROBLEM);
    }

    public static SubLObject set_shop_basic_planner_thread_problem(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_planner_thread, value, ONE_INTEGER, PROBLEM);
    }

    public static final SubLObject subloop_reserved_initialize_shop_basic_planner_thread_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_basic_planner_thread_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_shop_basic_planner_thread_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, PROBLEM, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, AXIOMS, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, PLANNER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, OPEN_NODES, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, P_WRAPPER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, VAR_MANAGER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, STATS_MANAGER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, LOG, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, INITIAL_PLAN_STATE, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, HALT_STATUS, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, WHICH_PLANS, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, NUM_BACKCHAINS, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, CYCLE_CHECKING, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, TIME_CUTOFF, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, DEPTH_CUTOFF, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, NUMBER_CUTOFF, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, PLAN_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, PLAN_NUMBER_TO_CUTOFF, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, PLANS_FOUND, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_basic_planner_thread_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, PROBLEM, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.AXIOMS, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, PLANNER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, OPEN_NODES, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.P_WRAPPER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, VAR_MANAGER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, STATS_MANAGER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, LOG, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.INITIAL_PLAN_STATE, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, HALT_STATUS, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, WHICH_PLANS, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, NUM_BACKCHAINS, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.CYCLE_CHECKING, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, TIME_CUTOFF, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, DEPTH_CUTOFF, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.NUMBER_CUTOFF, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.PLAN_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, PLAN_NUMBER_TO_CUTOFF, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_BASIC_PLANNER_THREAD, PLANS_FOUND, NIL);
        return NIL;
    }

    public static final SubLObject shop_basic_planner_thread_p_alt(SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_instanceof_class(v_shop_basic_planner_thread, SHOP_BASIC_PLANNER_THREAD);
    }

    public static SubLObject shop_basic_planner_thread_p(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_instanceof_class(v_shop_basic_planner_thread, SHOP_BASIC_PLANNER_THREAD);
    }

    public static final SubLObject shop_basic_planner_thread_initialize_method_alt(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
                SubLObject plan_number_to_cutoff = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_plan_number_to_cutoff(self);
                SubLObject plan_number = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_plan_number(self);
                SubLObject number_cutoff = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_number_cutoff(self);
                SubLObject depth_cutoff = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_depth_cutoff(self);
                SubLObject time_cutoff = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_time_cutoff(self);
                SubLObject cycle_checking = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_cycle_checking(self);
                SubLObject num_backchains = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_num_backchains(self);
                SubLObject halt_status = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_halt_status(self);
                SubLObject log = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_log(self);
                SubLObject stats_manager = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_stats_manager(self);
                SubLObject var_manager = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_var_manager(self);
                try {
                    try {
                        object.object_initialize_method(self);
                        var_manager = object.object_new_method(SHOP_VARIABLE_MANAGER);
                        stats_manager = object.object_new_method(SHOP_STATISTIC_MANAGER);
                        log = object.object_new_method(SHOP_LOG);
                        plan_number = ZERO_INTEGER;
                        plan_number_to_cutoff = ZERO_INTEGER;
                        time_cutoff = NIL;
                        depth_cutoff = shop_parameters.$shop_default_depth_limit$.getDynamicValue(thread);
                        number_cutoff = NIL;
                        halt_status = NIL;
                        num_backchains = ZERO_INTEGER;
                        cycle_checking = NIL;
                        sublisp_throw($sym32$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, self);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_plan_number_to_cutoff(self, plan_number_to_cutoff);
                                com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_plan_number(self, plan_number);
                                com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_number_cutoff(self, number_cutoff);
                                com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_depth_cutoff(self, depth_cutoff);
                                com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_time_cutoff(self, time_cutoff);
                                com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_cycle_checking(self, cycle_checking);
                                com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_num_backchains(self, num_backchains);
                                com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_halt_status(self, halt_status);
                                com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_log(self, log);
                                com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_stats_manager(self, stats_manager);
                                com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_var_manager(self, var_manager);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, $sym32$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
                }
                return catch_var_for_shop_basic_planner_thread_method;
            }
        }
    }

    public static SubLObject shop_basic_planner_thread_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
        SubLObject plan_number_to_cutoff = shop_basic_planner_thread.get_shop_basic_planner_thread_plan_number_to_cutoff(self);
        SubLObject plan_number = shop_basic_planner_thread.get_shop_basic_planner_thread_plan_number(self);
        SubLObject number_cutoff = shop_basic_planner_thread.get_shop_basic_planner_thread_number_cutoff(self);
        SubLObject depth_cutoff = shop_basic_planner_thread.get_shop_basic_planner_thread_depth_cutoff(self);
        SubLObject time_cutoff = shop_basic_planner_thread.get_shop_basic_planner_thread_time_cutoff(self);
        SubLObject cycle_checking = shop_basic_planner_thread.get_shop_basic_planner_thread_cycle_checking(self);
        SubLObject num_backchains = shop_basic_planner_thread.get_shop_basic_planner_thread_num_backchains(self);
        SubLObject halt_status = shop_basic_planner_thread.get_shop_basic_planner_thread_halt_status(self);
        SubLObject log = shop_basic_planner_thread.get_shop_basic_planner_thread_log(self);
        SubLObject stats_manager = shop_basic_planner_thread.get_shop_basic_planner_thread_stats_manager(self);
        SubLObject var_manager = shop_basic_planner_thread.get_shop_basic_planner_thread_var_manager(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym32$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                object.object_initialize_method(self);
                var_manager = object.object_new_method(SHOP_VARIABLE_MANAGER);
                stats_manager = object.object_new_method(SHOP_STATISTIC_MANAGER);
                log = object.object_new_method(shop_basic_planner_thread.SHOP_LOG);
                plan_number = ZERO_INTEGER;
                plan_number_to_cutoff = ZERO_INTEGER;
                time_cutoff = NIL;
                depth_cutoff = shop_parameters.$shop_default_depth_limit$.getDynamicValue(thread);
                number_cutoff = NIL;
                halt_status = NIL;
                num_backchains = ZERO_INTEGER;
                cycle_checking = NIL;
                sublisp_throw(shop_basic_planner_thread.$sym32$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    shop_basic_planner_thread.set_shop_basic_planner_thread_plan_number_to_cutoff(self, plan_number_to_cutoff);
                    shop_basic_planner_thread.set_shop_basic_planner_thread_plan_number(self, plan_number);
                    shop_basic_planner_thread.set_shop_basic_planner_thread_number_cutoff(self, number_cutoff);
                    shop_basic_planner_thread.set_shop_basic_planner_thread_depth_cutoff(self, depth_cutoff);
                    shop_basic_planner_thread.set_shop_basic_planner_thread_time_cutoff(self, time_cutoff);
                    shop_basic_planner_thread.set_shop_basic_planner_thread_cycle_checking(self, cycle_checking);
                    shop_basic_planner_thread.set_shop_basic_planner_thread_num_backchains(self, num_backchains);
                    shop_basic_planner_thread.set_shop_basic_planner_thread_halt_status(self, halt_status);
                    shop_basic_planner_thread.set_shop_basic_planner_thread_log(self, log);
                    shop_basic_planner_thread.set_shop_basic_planner_thread_stats_manager(self, stats_manager);
                    shop_basic_planner_thread.set_shop_basic_planner_thread_var_manager(self, var_manager);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, shop_basic_planner_thread.$sym32$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }

    public static final SubLObject shop_basic_planner_thread_output_message_method_alt(SubLObject self, SubLObject string) {
        {
            SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
            SubLObject log = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_log(self);
            try {
                try {
                    sublisp_throw($sym41$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, shop_log.shop_log_log_entry_method(log, string));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_log(self, log);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, $sym41$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            }
            return catch_var_for_shop_basic_planner_thread_method;
        }
    }

    public static SubLObject shop_basic_planner_thread_output_message_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
        final SubLObject log = shop_basic_planner_thread.get_shop_basic_planner_thread_log(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym41$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                sublisp_throw(shop_basic_planner_thread.$sym41$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, shop_log.shop_log_log_entry_method(log, string));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    shop_basic_planner_thread.set_shop_basic_planner_thread_log(self, log);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, shop_basic_planner_thread.$sym41$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject shop_basic_planner_thread_any_cutoff_reachedP_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
            SubLObject open_nodes = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_open_nodes(self);
            try {
                try {
                    if (NIL == open_nodes) {
                        sublisp_throw($sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, T);
                    }
                    sublisp_throw($sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, makeBoolean(((NIL != com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_depth_cutoff_reachedP_method(self, open_nodes.first())) || (NIL != com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_time_cutoff_reachedP_method(self))) || (NIL != com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_number_cutoff_reachedP_method(self))));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_open_nodes(self, open_nodes);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, $sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            }
            return catch_var_for_shop_basic_planner_thread_method;
        }
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject shop_basic_planner_thread_any_cutoff_reachedP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
        final SubLObject open_nodes = shop_basic_planner_thread.get_shop_basic_planner_thread_open_nodes(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                if (NIL == open_nodes) {
                    sublisp_throw(shop_basic_planner_thread.$sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, T);
                }
                sublisp_throw(shop_basic_planner_thread.$sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, makeBoolean(((NIL != shop_basic_planner_thread.shop_basic_planner_thread_depth_cutoff_reachedP_method(self, open_nodes.first())) || (NIL != shop_basic_planner_thread.shop_basic_planner_thread_time_cutoff_reachedP_method(self))) || (NIL != shop_basic_planner_thread.shop_basic_planner_thread_number_cutoff_reachedP_method(self))));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    shop_basic_planner_thread.set_shop_basic_planner_thread_open_nodes(self, open_nodes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, shop_basic_planner_thread.$sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }

    /**
     *
     *
     * @param PLAN-STATE
    shop-plan-state-p
     * 		
     * @return booleanp
     */
    @LispMethod(comment = "@param PLAN-STATE\nshop-plan-state-p\r\n\t\t\r\n@return booleanp")
    public static final SubLObject shop_basic_planner_thread_depth_cutoff_reachedP_method_alt(SubLObject self, SubLObject plan_state) {
        {
            SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
            SubLObject depth_cutoff = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_depth_cutoff(self);
            try {
                try {
                    sublisp_throw($sym50$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, depth_cutoff.isNumber() ? ((SubLObject) (numG(methods.funcall_instance_method_with_0_args(plan_state, DEPTH), depth_cutoff))) : NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_depth_cutoff(self, depth_cutoff);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, $sym50$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            }
            return catch_var_for_shop_basic_planner_thread_method;
        }
    }

    /**
     *
     *
     * @param PLAN-STATE
    shop-plan-state-p
     * 		
     * @return booleanp
     */
    @LispMethod(comment = "@param PLAN-STATE\nshop-plan-state-p\r\n\t\t\r\n@return booleanp")
    public static SubLObject shop_basic_planner_thread_depth_cutoff_reachedP_method(final SubLObject self, final SubLObject plan_state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
        final SubLObject depth_cutoff = shop_basic_planner_thread.get_shop_basic_planner_thread_depth_cutoff(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym50$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                sublisp_throw(shop_basic_planner_thread.$sym50$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, depth_cutoff.isNumber() ? numG(methods.funcall_instance_method_with_0_args(plan_state, DEPTH), depth_cutoff) : NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    shop_basic_planner_thread.set_shop_basic_planner_thread_depth_cutoff(self, depth_cutoff);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, shop_basic_planner_thread.$sym50$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject shop_basic_planner_thread_time_cutoff_reachedP_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
            SubLObject time_cutoff = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_time_cutoff(self);
            SubLObject stats_manager = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_stats_manager(self);
            try {
                try {
                    sublisp_throw($sym55$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, NIL != time_cutoff ? ((SubLObject) (numG(shop_internals.statistic_manager_elapsed_run_time_since_last_call_method(stats_manager), time_cutoff))) : NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_time_cutoff(self, time_cutoff);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_stats_manager(self, stats_manager);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, $sym55$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            }
            return catch_var_for_shop_basic_planner_thread_method;
        }
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject shop_basic_planner_thread_time_cutoff_reachedP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
        final SubLObject time_cutoff = shop_basic_planner_thread.get_shop_basic_planner_thread_time_cutoff(self);
        final SubLObject stats_manager = shop_basic_planner_thread.get_shop_basic_planner_thread_stats_manager(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym55$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                sublisp_throw(shop_basic_planner_thread.$sym55$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, NIL != time_cutoff ? numG(shop_internals.statistic_manager_elapsed_run_time_since_last_call_method(stats_manager), time_cutoff) : NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    shop_basic_planner_thread.set_shop_basic_planner_thread_time_cutoff(self, time_cutoff);
                    shop_basic_planner_thread.set_shop_basic_planner_thread_stats_manager(self, stats_manager);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, shop_basic_planner_thread.$sym55$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject shop_basic_planner_thread_number_cutoff_reachedP_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
            SubLObject plan_number_to_cutoff = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_plan_number_to_cutoff(self);
            SubLObject number_cutoff = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_number_cutoff(self);
            try {
                try {
                    sublisp_throw($sym59$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, NIL != number_cutoff ? ((SubLObject) (numGE(plan_number_to_cutoff, number_cutoff))) : NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_plan_number_to_cutoff(self, plan_number_to_cutoff);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_number_cutoff(self, number_cutoff);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, $sym59$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            }
            return catch_var_for_shop_basic_planner_thread_method;
        }
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject shop_basic_planner_thread_number_cutoff_reachedP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
        final SubLObject plan_number_to_cutoff = shop_basic_planner_thread.get_shop_basic_planner_thread_plan_number_to_cutoff(self);
        final SubLObject number_cutoff = shop_basic_planner_thread.get_shop_basic_planner_thread_number_cutoff(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym59$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                sublisp_throw(shop_basic_planner_thread.$sym59$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, NIL != number_cutoff ? numGE(plan_number_to_cutoff, number_cutoff) : NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    shop_basic_planner_thread.set_shop_basic_planner_thread_plan_number_to_cutoff(self, plan_number_to_cutoff);
                    shop_basic_planner_thread.set_shop_basic_planner_thread_number_cutoff(self, number_cutoff);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, shop_basic_planner_thread.$sym59$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }

    public static final SubLObject shop_basic_planner_thread_cycl_plans_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
            SubLObject plans_found = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_plans_found(self);
            try {
                try {
                    sublisp_throw($sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, instances.get_slot(self, PLANS_FOUND));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_plans_found(self, plans_found);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            }
            return catch_var_for_shop_basic_planner_thread_method;
        }
    }

    public static SubLObject shop_basic_planner_thread_cycl_plans_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
        final SubLObject plans_found = shop_basic_planner_thread.get_shop_basic_planner_thread_plans_found(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                sublisp_throw(shop_basic_planner_thread.$sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, instances.get_slot(self, PLANS_FOUND));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    shop_basic_planner_thread.set_shop_basic_planner_thread_plans_found(self, plans_found);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, shop_basic_planner_thread.$sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }

    public static final SubLObject shop_basic_planner_thread_print_stats_header_method_alt(SubLObject self, SubLObject label) {
        com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_output_message_method(self, format(NIL, $str_alt68$___7_a_Plans_Mincost_Maxcost_Expa, label));
        return NIL;
    }

    public static SubLObject shop_basic_planner_thread_print_stats_header_method(final SubLObject self, final SubLObject label) {
        shop_basic_planner_thread.shop_basic_planner_thread_output_message_method(self, format(NIL, shop_basic_planner_thread.$str68$___7_a_Plans_Mincost_Maxcost_Expa, label));
        return NIL;
    }

    public static final SubLObject shop_basic_planner_thread_print_plan_method_alt(SubLObject self, SubLObject plan) {
        com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_output_message_method(self, format(NIL, $str_alt73$___s, plan));
        return NIL;
    }

    public static SubLObject shop_basic_planner_thread_print_plan_method(final SubLObject self, final SubLObject plan) {
        shop_basic_planner_thread.shop_basic_planner_thread_output_message_method(self, format(NIL, shop_basic_planner_thread.$str73$___s, plan));
        return NIL;
    }

    /**
     * Return an abbreviated version of a PLAN.
     */
    @LispMethod(comment = "Return an abbreviated version of a PLAN.")
    public static final SubLObject shop_shorterplan1_alt(SubLObject plan) {
        if (NIL == plan) {
            return NIL;
        } else {
            if (!ZERO_INTEGER.equal(plan.rest().first())) {
                return cons(plan.first(), com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_shorterplan1(cddr(plan)));
            } else {
                return com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_shorterplan1(cddr(plan));
            }
        }
    }

    /**
     * Return an abbreviated version of a PLAN.
     */
    @LispMethod(comment = "Return an abbreviated version of a PLAN.")
    public static SubLObject shop_shorterplan1(final SubLObject plan) {
        if (NIL == plan) {
            return NIL;
        }
        if (!ZERO_INTEGER.equal(plan.rest().first())) {
            return cons(plan.first(), shop_basic_planner_thread.shop_shorterplan1(cddr(plan)));
        }
        return shop_basic_planner_thread.shop_shorterplan1(cddr(plan));
    }

    public static final SubLObject shop_basic_planner_thread_print_stats_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
            SubLObject plans_found = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_plans_found(self);
            SubLObject stats_manager = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_stats_manager(self);
            try {
                try {
                    {
                        SubLObject plans = instances.get_slot(self, PLANS_FOUND);
                        SubLObject tasks = methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_EXPANSIONS);
                        SubLObject inferences = methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_INFERENCES);
                        SubLObject run_time = shop_internals.statistic_manager_elapsed_run_time_method(stats_manager);
                        SubLObject real_time = shop_internals.statistic_manager_elapsed_real_time_method(stats_manager);
                        com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_output_message_method(self, format(NIL, $str_alt80$___12_a_8_a_8_a_11_s_11_s_10_3f_1, new SubLObject[]{ length(plans), NIL != plans ? ((SubLObject) (apply(symbol_function(MIN), Mapping.mapcar(symbol_function(SHOP_PLAN_COST), plans)))) : $str_alt83$_, NIL != plans ? ((SubLObject) (apply(symbol_function(MAX), Mapping.mapcar(symbol_function(SHOP_PLAN_COST), plans)))) : $str_alt83$_, tasks, inferences, divide(run_time, time_high.$internal_time_units_per_second$.getGlobalValue()), divide(real_time, time_high.$internal_time_units_per_second$.getGlobalValue()) }));
                        sublisp_throw($sym77$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_plans_found(self, plans_found);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_stats_manager(self, stats_manager);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, $sym77$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            }
            return catch_var_for_shop_basic_planner_thread_method;
        }
    }

    public static SubLObject shop_basic_planner_thread_print_stats_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
        final SubLObject plans_found = shop_basic_planner_thread.get_shop_basic_planner_thread_plans_found(self);
        final SubLObject stats_manager = shop_basic_planner_thread.get_shop_basic_planner_thread_stats_manager(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym77$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                final SubLObject plans = instances.get_slot(self, PLANS_FOUND);
                final SubLObject tasks = methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_EXPANSIONS);
                final SubLObject inferences = methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_INFERENCES);
                final SubLObject run_time = shop_internals.statistic_manager_elapsed_run_time_method(stats_manager);
                final SubLObject real_time = shop_internals.statistic_manager_elapsed_real_time_method(stats_manager);
                shop_basic_planner_thread.shop_basic_planner_thread_output_message_method(self, format(NIL, shop_basic_planner_thread.$str80$___12_a_8_a_8_a_11_s_11_s_10_3f_1, new SubLObject[]{ length(plans), NIL != plans ? apply(symbol_function(MIN), Mapping.mapcar(symbol_function(shop_basic_planner_thread.SHOP_PLAN_COST), plans)) : shop_basic_planner_thread.$str83$_, NIL != plans ? apply(symbol_function(MAX), Mapping.mapcar(symbol_function(shop_basic_planner_thread.SHOP_PLAN_COST), plans)) : shop_basic_planner_thread.$str83$_, tasks, inferences, divide(run_time, time_high.$internal_time_units_per_second$.getGlobalValue()), divide(real_time, time_high.$internal_time_units_per_second$.getGlobalValue()) }));
                sublisp_throw(shop_basic_planner_thread.$sym77$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    shop_basic_planner_thread.set_shop_basic_planner_thread_plans_found(self, plans_found);
                    shop_basic_planner_thread.set_shop_basic_planner_thread_stats_manager(self, stats_manager);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, shop_basic_planner_thread.$sym77$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }

    public static final SubLObject shop_basic_planner_thread_print_iterative_deepening_stats_method_alt(SubLObject self, SubLObject depth) {
        {
            SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
            SubLObject plans_found = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_plans_found(self);
            SubLObject stats_manager = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_stats_manager(self);
            try {
                try {
                    {
                        SubLObject plans = instances.get_slot(self, PLANS_FOUND);
                        SubLObject tasks = methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_EXPANSIONS);
                        SubLObject inferences = methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_INFERENCES);
                        SubLObject run_time = methods.funcall_instance_method_with_0_args(stats_manager, ELAPSED_RUN_TIME_SINCE_LAST_CALL);
                        SubLObject real_time = methods.funcall_instance_method_with_0_args(stats_manager, ELAPSED_REAL_TIME_SINCE_LAST_CALL);
                        com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_output_message_method(self, format(NIL, $str_alt92$___6_a_6_a_8_a_8_a_11_s_11_s_10_3, new SubLObject[]{ depth, length(plans), NIL != plans ? ((SubLObject) (apply(symbol_function(MIN), Mapping.mapcar(symbol_function(SHOP_PLAN_COST), plans)))) : $str_alt83$_, NIL != plans ? ((SubLObject) (apply(symbol_function(MAX), Mapping.mapcar(symbol_function(SHOP_PLAN_COST), plans)))) : $str_alt83$_, tasks, inferences, divide(run_time, time_high.$internal_time_units_per_second$.getGlobalValue()), divide(real_time, time_high.$internal_time_units_per_second$.getGlobalValue()) }));
                        sublisp_throw($sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_plans_found(self, plans_found);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_stats_manager(self, stats_manager);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, $sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            }
            return catch_var_for_shop_basic_planner_thread_method;
        }
    }

    public static SubLObject shop_basic_planner_thread_print_iterative_deepening_stats_method(final SubLObject self, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
        final SubLObject plans_found = shop_basic_planner_thread.get_shop_basic_planner_thread_plans_found(self);
        final SubLObject stats_manager = shop_basic_planner_thread.get_shop_basic_planner_thread_stats_manager(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                final SubLObject plans = instances.get_slot(self, PLANS_FOUND);
                final SubLObject tasks = methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_EXPANSIONS);
                final SubLObject inferences = methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_INFERENCES);
                final SubLObject run_time = methods.funcall_instance_method_with_0_args(stats_manager, shop_basic_planner_thread.ELAPSED_RUN_TIME_SINCE_LAST_CALL);
                final SubLObject real_time = methods.funcall_instance_method_with_0_args(stats_manager, shop_basic_planner_thread.ELAPSED_REAL_TIME_SINCE_LAST_CALL);
                shop_basic_planner_thread.shop_basic_planner_thread_output_message_method(self, format(NIL, shop_basic_planner_thread.$str92$___6_a_6_a_8_a_8_a_11_s_11_s_10_3, new SubLObject[]{ depth, length(plans), NIL != plans ? apply(symbol_function(MIN), Mapping.mapcar(symbol_function(shop_basic_planner_thread.SHOP_PLAN_COST), plans)) : shop_basic_planner_thread.$str83$_, NIL != plans ? apply(symbol_function(MAX), Mapping.mapcar(symbol_function(shop_basic_planner_thread.SHOP_PLAN_COST), plans)) : shop_basic_planner_thread.$str83$_, tasks, inferences, divide(run_time, time_high.$internal_time_units_per_second$.getGlobalValue()), divide(real_time, time_high.$internal_time_units_per_second$.getGlobalValue()) }));
                sublisp_throw(shop_basic_planner_thread.$sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    shop_basic_planner_thread.set_shop_basic_planner_thread_plans_found(self, plans_found);
                    shop_basic_planner_thread.set_shop_basic_planner_thread_stats_manager(self, stats_manager);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, shop_basic_planner_thread.$sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }

    /**
     * Displays in HTML an informative summary of the last planner run
     * on this thread.
     */
    @LispMethod(comment = "Displays in HTML an informative summary of the last planner run\r\non this thread.\nDisplays in HTML an informative summary of the last planner run\non this thread.")
    public static final SubLObject shop_basic_planner_thread_html_stats_method_alt(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
                SubLObject plans_found = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_plans_found(self);
                SubLObject stats_manager = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_stats_manager(self);
                try {
                    try {
                        {
                            SubLObject plans = instances.get_slot(self, PLANS_FOUND);
                            SubLObject num_plans = length(plans);
                            SubLObject tasks = methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_EXPANSIONS);
                            SubLObject inferences = methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_INFERENCES);
                            SubLObject run_time = divide(methods.funcall_instance_method_with_0_args(stats_manager, ELAPSED_RUN_TIME), time_high.$internal_time_units_per_second$.getGlobalValue());
                            SubLObject real_time = divide(methods.funcall_instance_method_with_0_args(stats_manager, ELAPSED_REAL_TIME), time_high.$internal_time_units_per_second$.getGlobalValue());
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_border$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(ZERO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(FIVE_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (true) {
                                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(ZERO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($$$Plans);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($$$MinCost);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($$$MaxCost);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($$$Expansions);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($$$Inferences);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($$$CPU_Time);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($$$Real_Time);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (true) {
                                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_align($RIGHT));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_princ(num_plans);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (true) {
                                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_align($RIGHT));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_princ(NIL != plans ? ((SubLObject) (apply(symbol_function(MIN), Mapping.mapcar(symbol_function(SHOP_PLAN_COST), plans)))) : $str_alt83$_);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (true) {
                                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_align($RIGHT));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_princ(NIL != plans ? ((SubLObject) (apply(symbol_function(MAX), Mapping.mapcar(symbol_function(SHOP_PLAN_COST), plans)))) : $str_alt83$_);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (true) {
                                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_align($RIGHT));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_princ(tasks);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (true) {
                                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_align($RIGHT));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_princ(inferences);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (true) {
                                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_align($RIGHT));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_princ(run_time);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            if (true) {
                                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_align($RIGHT));
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_princ(real_time);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            sublisp_throw($sym96$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, NIL);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_plans_found(self, plans_found);
                                com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_stats_manager(self, stats_manager);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, $sym96$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
                }
                return catch_var_for_shop_basic_planner_thread_method;
            }
        }
    }

    /**
     * Displays in HTML an informative summary of the last planner run
     * on this thread.
     */
    @LispMethod(comment = "Displays in HTML an informative summary of the last planner run\r\non this thread.\nDisplays in HTML an informative summary of the last planner run\non this thread.")
    public static SubLObject shop_basic_planner_thread_html_stats_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
        final SubLObject plans_found = shop_basic_planner_thread.get_shop_basic_planner_thread_plans_found(self);
        final SubLObject stats_manager = shop_basic_planner_thread.get_shop_basic_planner_thread_stats_manager(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym96$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                final SubLObject plans = instances.get_slot(self, PLANS_FOUND);
                final SubLObject num_plans = length(plans);
                final SubLObject tasks = methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_EXPANSIONS);
                final SubLObject inferences = methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_INFERENCES);
                final SubLObject run_time = divide(methods.funcall_instance_method_with_0_args(stats_manager, shop_basic_planner_thread.ELAPSED_RUN_TIME), time_high.$internal_time_units_per_second$.getGlobalValue());
                final SubLObject real_time = divide(methods.funcall_instance_method_with_0_args(stats_manager, shop_basic_planner_thread.ELAPSED_REAL_TIME), time_high.$internal_time_units_per_second$.getGlobalValue());
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(FIVE_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ(shop_basic_planner_thread.$$$Plans);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ(shop_basic_planner_thread.$$$MinCost);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ(shop_basic_planner_thread.$$$MaxCost);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ(shop_basic_planner_thread.$$$Expansions);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ(shop_basic_planner_thread.$$$Inferences);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ(shop_basic_planner_thread.$$$CPU_Time);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ(shop_basic_planner_thread.$$$Real_Time);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($RIGHT));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(num_plans);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($RIGHT));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(NIL != plans ? apply(symbol_function(MIN), Mapping.mapcar(symbol_function(shop_basic_planner_thread.SHOP_PLAN_COST), plans)) : shop_basic_planner_thread.$str83$_);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($RIGHT));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(NIL != plans ? apply(symbol_function(MAX), Mapping.mapcar(symbol_function(shop_basic_planner_thread.SHOP_PLAN_COST), plans)) : shop_basic_planner_thread.$str83$_);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($RIGHT));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(tasks);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($RIGHT));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(inferences);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($RIGHT));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(run_time);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($RIGHT));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(real_time);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                sublisp_throw(shop_basic_planner_thread.$sym96$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    shop_basic_planner_thread.set_shop_basic_planner_thread_plans_found(self, plans_found);
                    shop_basic_planner_thread.set_shop_basic_planner_thread_stats_manager(self, stats_manager);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, shop_basic_planner_thread.$sym96$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }

    public static final SubLObject shop_basic_planner_thread_set_problem_method_alt(SubLObject self, SubLObject d) {
        {
            SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
            SubLObject problem = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_problem(self);
            try {
                try {
                    SubLTrampolineFile.checkType(d, INTEGERP);
                    problem = d;
                    sublisp_throw($sym112$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, d);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_problem(self, problem);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, $sym112$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            }
            return catch_var_for_shop_basic_planner_thread_method;
        }
    }

    public static SubLObject shop_basic_planner_thread_set_problem_method(final SubLObject self, final SubLObject d) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
        SubLObject problem = shop_basic_planner_thread.get_shop_basic_planner_thread_problem(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym112$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                assert NIL != integerp(d) : "! integerp(d) " + ("Types.integerp(d) " + "CommonSymbols.NIL != Types.integerp(d) ") + d;
                problem = d;
                sublisp_throw(shop_basic_planner_thread.$sym112$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, d);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    shop_basic_planner_thread.set_shop_basic_planner_thread_problem(self, problem);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, shop_basic_planner_thread.$sym112$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }

    public static final SubLObject shop_basic_planner_thread_get_problem_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
            SubLObject problem = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_problem(self);
            try {
                try {
                    sublisp_throw($sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, problem);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_problem(self, problem);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, $sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            }
            return catch_var_for_shop_basic_planner_thread_method;
        }
    }

    public static SubLObject shop_basic_planner_thread_get_problem_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
        final SubLObject problem = shop_basic_planner_thread.get_shop_basic_planner_thread_problem(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                sublisp_throw(shop_basic_planner_thread.$sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, problem);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    shop_basic_planner_thread.set_shop_basic_planner_thread_problem(self, problem);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, shop_basic_planner_thread.$sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }

    public static final SubLObject shop_basic_planner_thread_get_domain_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
            SubLObject problem = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_problem(self);
            try {
                try {
                    sublisp_throw($sym121$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, shop_datastructures.shop_basic_problem_get_domain_method(problem));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_problem(self, problem);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, $sym121$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            }
            return catch_var_for_shop_basic_planner_thread_method;
        }
    }

    public static SubLObject shop_basic_planner_thread_get_domain_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
        final SubLObject problem = shop_basic_planner_thread.get_shop_basic_planner_thread_problem(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym121$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                sublisp_throw(shop_basic_planner_thread.$sym121$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, shop_datastructures.shop_basic_problem_get_domain_method(problem));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    shop_basic_planner_thread.set_shop_basic_planner_thread_problem(self, problem);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, shop_basic_planner_thread.$sym121$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }

    public static final SubLObject shop_basic_planner_thread_get_which_plans_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
            SubLObject which_plans = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_which_plans(self);
            try {
                try {
                    sublisp_throw($sym125$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, which_plans);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_which_plans(self, which_plans);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, $sym125$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            }
            return catch_var_for_shop_basic_planner_thread_method;
        }
    }

    public static SubLObject shop_basic_planner_thread_get_which_plans_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
        final SubLObject which_plans = shop_basic_planner_thread.get_shop_basic_planner_thread_which_plans(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym125$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                sublisp_throw(shop_basic_planner_thread.$sym125$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, which_plans);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    shop_basic_planner_thread.set_shop_basic_planner_thread_which_plans(self, which_plans);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, shop_basic_planner_thread.$sym125$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }

    public static final SubLObject shop_basic_planner_thread_set_which_plans_method_alt(SubLObject self, SubLObject w) {
        {
            SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
            SubLObject which_plans = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_which_plans(self);
            try {
                try {
                    which_plans = w;
                    sublisp_throw($sym130$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, w);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_which_plans(self, which_plans);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, $sym130$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            }
            return catch_var_for_shop_basic_planner_thread_method;
        }
    }

    public static SubLObject shop_basic_planner_thread_set_which_plans_method(final SubLObject self, final SubLObject w) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
        SubLObject which_plans = shop_basic_planner_thread.get_shop_basic_planner_thread_which_plans(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym130$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                which_plans = w;
                sublisp_throw(shop_basic_planner_thread.$sym130$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, w);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    shop_basic_planner_thread.set_shop_basic_planner_thread_which_plans(self, which_plans);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, shop_basic_planner_thread.$sym130$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }

    /**
     *
     *
     * @param PROBLEM
    shop-problem-p
     * 		
     */
    @LispMethod(comment = "@param PROBLEM\nshop-problem-p")
    public static final SubLObject shop_basic_planner_thread_init_plan_state_method_alt(SubLObject self, SubLObject problem) {
        instances.set_slot(self, PROBLEM, problem);
        instances.set_slot(self, INITIAL_PLAN_STATE, object.object_new_method(SHOP_BASIC_PLAN_STATE));
        shop_basic_plan_state.shop_basic_plan_state_initialize_plan_state_with_problem_method(instances.get_slot(self, INITIAL_PLAN_STATE), problem, self);
        return NIL;
    }

    /**
     *
     *
     * @param PROBLEM
    shop-problem-p
     * 		
     */
    @LispMethod(comment = "@param PROBLEM\nshop-problem-p")
    public static SubLObject shop_basic_planner_thread_init_plan_state_method(final SubLObject self, final SubLObject problem) {
        instances.set_slot(self, PROBLEM, problem);
        instances.set_slot(self, shop_basic_planner_thread.INITIAL_PLAN_STATE, object.object_new_method(SHOP_BASIC_PLAN_STATE));
        shop_basic_plan_state.shop_basic_plan_state_initialize_plan_state_with_problem_method(instances.get_slot(self, shop_basic_planner_thread.INITIAL_PLAN_STATE), problem, self);
        return NIL;
    }

    /**
     * called each time by FIND-PLANS. The first time, it sets up the INITIAL-PLAN-STATE
     * so the search can begin. Thereafter, when it is called by FIND-PLANS as part
     * of a search continuation. it resets the search-cutoffs, so that search can continue.
     */
    @LispMethod(comment = "called each time by FIND-PLANS. The first time, it sets up the INITIAL-PLAN-STATE\r\nso the search can begin. Thereafter, when it is called by FIND-PLANS as part\r\nof a search continuation. it resets the search-cutoffs, so that search can continue.\ncalled each time by FIND-PLANS. The first time, it sets up the INITIAL-PLAN-STATE\nso the search can begin. Thereafter, when it is called by FIND-PLANS as part\nof a search continuation. it resets the search-cutoffs, so that search can continue.")
    public static final SubLObject shop_basic_planner_thread_init_planner_thread_method_alt(SubLObject self, SubLObject new_problem, SubLObject which, SubLObject verbose, SubLObject number, SubLObject time, SubLObject depth) {
        if (NIL != depth) {
            instances.set_slot(self, DEPTH_CUTOFF, depth);
        }
        if (NIL != time) {
            instances.set_slot(self, TIME_CUTOFF, multiply(time, time_high.$internal_time_units_per_second$.getGlobalValue()));
        }
        if (NIL != number) {
            instances.set_slot(self, NUMBER_CUTOFF, number);
        }
        instances.set_slot(self, WHICH_PLANS, which);
        instances.set_slot(self, PLAN_NUMBER, ZERO_INTEGER);
        instances.set_slot(self, PLAN_NUMBER_TO_CUTOFF, ZERO_INTEGER);
        methods.funcall_instance_method_with_1_args(instances.get_slot(self, LOG), SET_VERBOSITY, verbose);
        if (NIL == instances.get_slot(self, PROBLEM)) {
            com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_init_plan_state_method(self, new_problem);
            instances.set_slot(self, OPEN_NODES, list(instances.get_slot(self, INITIAL_PLAN_STATE)));
        }
        return NIL;
    }

    /**
     * called each time by FIND-PLANS. The first time, it sets up the INITIAL-PLAN-STATE
     * so the search can begin. Thereafter, when it is called by FIND-PLANS as part
     * of a search continuation. it resets the search-cutoffs, so that search can continue.
     */
    @LispMethod(comment = "called each time by FIND-PLANS. The first time, it sets up the INITIAL-PLAN-STATE\r\nso the search can begin. Thereafter, when it is called by FIND-PLANS as part\r\nof a search continuation. it resets the search-cutoffs, so that search can continue.\ncalled each time by FIND-PLANS. The first time, it sets up the INITIAL-PLAN-STATE\nso the search can begin. Thereafter, when it is called by FIND-PLANS as part\nof a search continuation. it resets the search-cutoffs, so that search can continue.")
    public static SubLObject shop_basic_planner_thread_init_planner_thread_method(final SubLObject self, final SubLObject new_problem, final SubLObject which, final SubLObject verbose, final SubLObject number, final SubLObject time, final SubLObject depth) {
        if (NIL != depth) {
            instances.set_slot(self, DEPTH_CUTOFF, depth);
        }
        if (NIL != time) {
            instances.set_slot(self, TIME_CUTOFF, multiply(time, time_high.$internal_time_units_per_second$.getGlobalValue()));
        }
        if (NIL != number) {
            instances.set_slot(self, shop_basic_planner_thread.NUMBER_CUTOFF, number);
        }
        instances.set_slot(self, WHICH_PLANS, which);
        instances.set_slot(self, shop_basic_planner_thread.PLAN_NUMBER, ZERO_INTEGER);
        instances.set_slot(self, PLAN_NUMBER_TO_CUTOFF, ZERO_INTEGER);
        methods.funcall_instance_method_with_1_args(instances.get_slot(self, LOG), shop_basic_planner_thread.SET_VERBOSITY, verbose);
        if (NIL == instances.get_slot(self, PROBLEM)) {
            shop_basic_planner_thread.shop_basic_planner_thread_init_plan_state_method(self, new_problem);
            instances.set_slot(self, OPEN_NODES, list(instances.get_slot(self, shop_basic_planner_thread.INITIAL_PLAN_STATE)));
        }
        return NIL;
    }

    /**
     *
     *
     * @param PLAN-STATE
    shop-basic-plan-state-p
     * 		
     * @return booleanp
    FOUND-PLAN is called
    when a PLAN-STATE has found a plan that satisfies the original
    task. The plan is recorded with the state of the thread, and the
    search continues.  Returns NIL.
     */
    @LispMethod(comment = "@param PLAN-STATE\nshop-basic-plan-state-p\r\n\t\t\r\n@return booleanp\r\nFOUND-PLAN is called\r\nwhen a PLAN-STATE has found a plan that satisfies the original\r\ntask. The plan is recorded with the state of the thread, and the\r\nsearch continues.  Returns NIL.")
    public static final SubLObject shop_basic_planner_thread_found_plan_method_alt(SubLObject self, SubLObject plan_state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            instances.set_slot(self, PLAN_NUMBER, add(ONE_INTEGER, instances.get_slot(self, PLAN_NUMBER)));
            instances.set_slot(self, PLAN_NUMBER_TO_CUTOFF, add(ONE_INTEGER, instances.get_slot(self, PLAN_NUMBER_TO_CUTOFF)));
            {
                SubLObject new_plan = object.object_new_method(SHOP_BASIC_PLAN);
                SubLObject depth = methods.funcall_instance_method_with_0_args(plan_state, DEPTH);
                SubLObject which_plans = instances.get_slot(self, WHICH_PLANS);
                shop_basic_plan.shop_basic_plan_populate_plan_method(new_plan, plan_state);
                {
                    SubLObject pcase_var = which_plans;
                    if (pcase_var.eql($SHALLOWEST)) {
                        instances.set_slot(self, DEPTH_CUTOFF, number_utilities.f_1_(depth));
                        instances.set_slot(self, PLANS_FOUND, list(new_plan));
                    } else {
                        if (pcase_var.eql($ALL_SHALLOWEST)) {
                            if (!instances.get_slot(self, DEPTH_CUTOFF).equal(depth)) {
                                instances.set_slot(self, PLANS_FOUND, NIL);
                                instances.set_slot(self, DEPTH_CUTOFF, depth);
                            }
                            instances.set_slot(self, PLANS_FOUND, cons(new_plan, instances.get_slot(self, PLANS_FOUND)));
                        } else {
                            if (pcase_var.eql($ALL) || pcase_var.eql($FIRST)) {
                                instances.set_slot(self, PLANS_FOUND, cons(new_plan, instances.get_slot(self, PLANS_FOUND)));
                            } else {
                                Errors.cerror($str_alt150$invalid_keyword__S, which_plans);
                            }
                        }
                    }
                }
                {
                    SubLObject entry = assoc($CUTOFFS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    SubLObject verbose_msg_level = (NIL != entry) ? ((SubLObject) (entry.rest())) : ZERO_INTEGER;
                    SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                    if (verbose_thread_level.numGE(verbose_msg_level)) {
                        methods.funcall_instance_method_with_1_args(instances.get_slot(self, LOG), SUCCESS, format(NIL, $str_alt154$depth__s_found_plan___s, depth, length(instances.get_slot(self, PLANS_FOUND))));
                    }
                }
                return list(NIL);
            }
        }
    }

    /**
     *
     *
     * @param PLAN-STATE
    shop-basic-plan-state-p
     * 		
     * @return booleanp
    FOUND-PLAN is called
    when a PLAN-STATE has found a plan that satisfies the original
    task. The plan is recorded with the state of the thread, and the
    search continues.  Returns NIL.
     */
    @LispMethod(comment = "@param PLAN-STATE\nshop-basic-plan-state-p\r\n\t\t\r\n@return booleanp\r\nFOUND-PLAN is called\r\nwhen a PLAN-STATE has found a plan that satisfies the original\r\ntask. The plan is recorded with the state of the thread, and the\r\nsearch continues.  Returns NIL.")
    public static SubLObject shop_basic_planner_thread_found_plan_method(final SubLObject self, final SubLObject plan_state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        instances.set_slot(self, shop_basic_planner_thread.PLAN_NUMBER, add(ONE_INTEGER, instances.get_slot(self, shop_basic_planner_thread.PLAN_NUMBER)));
        instances.set_slot(self, PLAN_NUMBER_TO_CUTOFF, add(ONE_INTEGER, instances.get_slot(self, PLAN_NUMBER_TO_CUTOFF)));
        final SubLObject new_plan = object.object_new_method(shop_basic_planner_thread.SHOP_BASIC_PLAN);
        final SubLObject depth = methods.funcall_instance_method_with_0_args(plan_state, DEPTH);
        final SubLObject which_plans = instances.get_slot(self, WHICH_PLANS);
        shop_basic_plan.shop_basic_plan_populate_plan_method(new_plan, plan_state);
        final SubLObject pcase_var = which_plans;
        if (pcase_var.eql($SHALLOWEST)) {
            instances.set_slot(self, DEPTH_CUTOFF, number_utilities.f_1_(depth));
            instances.set_slot(self, PLANS_FOUND, list(new_plan));
        } else
            if (pcase_var.eql($ALL_SHALLOWEST)) {
                if (!instances.get_slot(self, DEPTH_CUTOFF).equal(depth)) {
                    instances.set_slot(self, PLANS_FOUND, NIL);
                    instances.set_slot(self, DEPTH_CUTOFF, depth);
                }
                instances.set_slot(self, PLANS_FOUND, cons(new_plan, instances.get_slot(self, PLANS_FOUND)));
            } else
                if (pcase_var.eql($ALL) || pcase_var.eql($FIRST)) {
                    instances.set_slot(self, PLANS_FOUND, cons(new_plan, instances.get_slot(self, PLANS_FOUND)));
                } else {
                    Errors.cerror(shop_basic_planner_thread.$str150$invalid_keyword__S, which_plans);
                }


        final SubLObject entry = assoc($CUTOFFS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        final SubLObject verbose_msg_level = (NIL != entry) ? entry.rest() : ZERO_INTEGER;
        final SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
        if (verbose_thread_level.numGE(verbose_msg_level)) {
            methods.funcall_instance_method_with_1_args(instances.get_slot(self, LOG), SUCCESS, format(NIL, shop_basic_planner_thread.$str154$depth__s_found_plan___s, depth, length(instances.get_slot(self, PLANS_FOUND))));
        }
        return list(NIL);
    }

    public static final SubLObject shop_basic_planner_thread_halt_status_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
            SubLObject halt_status = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_halt_status(self);
            try {
                try {
                    sublisp_throw($sym157$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, halt_status);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_halt_status(self, halt_status);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, $sym157$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            }
            return catch_var_for_shop_basic_planner_thread_method;
        }
    }

    public static SubLObject shop_basic_planner_thread_halt_status_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
        final SubLObject halt_status = shop_basic_planner_thread.get_shop_basic_planner_thread_halt_status(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym157$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                sublisp_throw(shop_basic_planner_thread.$sym157$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, halt_status);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    shop_basic_planner_thread.set_shop_basic_planner_thread_halt_status(self, halt_status);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, shop_basic_planner_thread.$sym157$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }

    public static final SubLObject shop_basic_planner_thread_update_halt_status_method_alt(SubLObject self) {
        {
            SubLObject open_nodes = instances.get_slot(self, OPEN_NODES);
            if (NIL == open_nodes) {
                instances.set_slot(self, HALT_STATUS, $SEARCH_EXHAUSTED);
            } else {
                if (NIL != com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_time_cutoff_reachedP_method(self)) {
                    instances.set_slot(self, HALT_STATUS, $TIME_CUTOFF);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_depth_cutoff_reachedP_method(self, open_nodes.first())) {
                        instances.set_slot(self, HALT_STATUS, $DEPTH_CUTOFF);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_number_cutoff_reachedP_method(self)) {
                            instances.set_slot(self, PLAN_NUMBER_TO_CUTOFF, ZERO_INTEGER);
                            instances.set_slot(self, HALT_STATUS, $NUMBER_CUTOFF);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject shop_basic_planner_thread_update_halt_status_method(final SubLObject self) {
        final SubLObject open_nodes = instances.get_slot(self, OPEN_NODES);
        if (NIL == open_nodes) {
            instances.set_slot(self, HALT_STATUS, $SEARCH_EXHAUSTED);
        } else
            if (NIL != shop_basic_planner_thread.shop_basic_planner_thread_time_cutoff_reachedP_method(self)) {
                instances.set_slot(self, HALT_STATUS, $TIME_CUTOFF);
            } else
                if (NIL != shop_basic_planner_thread.shop_basic_planner_thread_depth_cutoff_reachedP_method(self, open_nodes.first())) {
                    instances.set_slot(self, HALT_STATUS, $DEPTH_CUTOFF);
                } else
                    if (NIL != shop_basic_planner_thread.shop_basic_planner_thread_number_cutoff_reachedP_method(self)) {
                        instances.set_slot(self, PLAN_NUMBER_TO_CUTOFF, ZERO_INTEGER);
                        instances.set_slot(self, HALT_STATUS, $NUMBER_CUTOFF);
                    }



        return NIL;
    }

    /**
     * SEEK-PLANS is the main planning loop.
     * OPEN-NODES is the list of current unexpand plan-states.
     */
    @LispMethod(comment = "SEEK-PLANS is the main planning loop.\r\nOPEN-NODES is the list of current unexpand plan-states.\nSEEK-PLANS is the main planning loop.\nOPEN-NODES is the list of current unexpand plan-states.")
    public static final SubLObject shop_basic_planner_thread_seek_plans_method_alt(SubLObject self) {
        if (NIL == com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_any_cutoff_reachedP_method(self)) {
            {
                SubLObject open_nodes = NIL;
                for (open_nodes = instances.get_slot(self, OPEN_NODES); NIL != open_nodes; open_nodes = open_nodes) {
                    if (NIL != com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_any_cutoff_reachedP_method(self)) {
                        com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_planner_thread_pause(self);
                    }
                    com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_process_checkpoint(self);
                    shop_internals.shop_statistic_manager_add_expansion_method(instances.get_slot(self, STATS_MANAGER));
                    {
                        SubLObject cur_node = open_nodes.first();
                        open_nodes = open_nodes.rest();
                        if (NIL == instances.get_slot(cur_node, TASKLIST)) {
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_found_plan_method(self, cur_node);
                            instances.set_slot(self, OPEN_NODES, open_nodes);
                        } else {
                            open_nodes = append(shop_basic_plan_state.shop_basic_plan_state_expand_method(cur_node), open_nodes);
                            instances.set_slot(self, OPEN_NODES, open_nodes);
                        }
                    }
                }
                return NIL;
            }
        }
        return NIL;
    }

    /**
     * SEEK-PLANS is the main planning loop.
     * OPEN-NODES is the list of current unexpand plan-states.
     */
    @LispMethod(comment = "SEEK-PLANS is the main planning loop.\r\nOPEN-NODES is the list of current unexpand plan-states.\nSEEK-PLANS is the main planning loop.\nOPEN-NODES is the list of current unexpand plan-states.")
    public static SubLObject shop_basic_planner_thread_seek_plans_method(final SubLObject self) {
        if (NIL == shop_basic_planner_thread.shop_basic_planner_thread_any_cutoff_reachedP_method(self)) {
            SubLObject open_nodes;
            SubLObject cur_node;
            // open_nodes = open_nodes
            for (open_nodes = NIL, open_nodes = instances.get_slot(self, OPEN_NODES); NIL != open_nodes;) {
                if (NIL != shop_basic_planner_thread.shop_basic_planner_thread_any_cutoff_reachedP_method(self)) {
                    shop_basic_planner_thread.shop_planner_thread_pause(self);
                }
                shop_basic_planner_thread.shop_process_checkpoint(self);
                shop_internals.shop_statistic_manager_add_expansion_method(instances.get_slot(self, STATS_MANAGER));
                cur_node = open_nodes.first();
                open_nodes = open_nodes.rest();
                if (NIL == instances.get_slot(cur_node, TASKLIST)) {
                    shop_basic_planner_thread.shop_basic_planner_thread_found_plan_method(self, cur_node);
                    instances.set_slot(self, OPEN_NODES, open_nodes);
                } else {
                    open_nodes = append(shop_basic_plan_state.shop_basic_plan_state_expand_method(cur_node), open_nodes);
                    instances.set_slot(self, OPEN_NODES, open_nodes);
                }
            }
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject shop_basic_planner_thread_seek_plans_with_iterative_deepening_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
            SubLObject plans_found = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_plans_found(self);
            SubLObject depth_cutoff = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_depth_cutoff(self);
            SubLObject stats_manager = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_stats_manager(self);
            try {
                try {
                    {
                        SubLObject last_iteration_expansions = ZERO_INTEGER;
                        SubLObject last_iteration_inferences = ZERO_INTEGER;
                        methods.funcall_instance_method_with_0_args(stats_manager, START_TIMING);
                        com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_print_stats_header_method(self, $$$Depth);
                        {
                            SubLObject cur_depth = NIL;
                            for (cur_depth = ZERO_INTEGER; NIL == instances.get_slot(self, PLANS_FOUND); cur_depth = number_utilities.f_1X(cur_depth)) {
                                last_iteration_expansions = methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_EXPANSIONS);
                                last_iteration_inferences = methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_INFERENCES);
                                methods.funcall_instance_method_with_0_args(stats_manager, RESET_COUNTERS);
                                instances.set_slot(self, DEPTH_CUTOFF, cur_depth);
                                com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_seek_plans_method(self);
                                com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_print_iterative_deepening_stats_method(self, cur_depth);
                                if (subtract(last_iteration_expansions, methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_EXPANSIONS)).isZero() || subtract(last_iteration_inferences, methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_INFERENCES)).isZero()) {
                                    Errors.cerror($$$Error, $str_alt177$No_expansions_or_inferences___add);
                                }
                            }
                        }
                        methods.funcall_instance_method_with_0_args(stats_manager, STOP_TIMING);
                        sublisp_throw($sym172$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_plans_found(self, plans_found);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_depth_cutoff(self, depth_cutoff);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_stats_manager(self, stats_manager);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, $sym172$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            }
            return catch_var_for_shop_basic_planner_thread_method;
        }
    }

    public static SubLObject shop_basic_planner_thread_seek_plans_with_iterative_deepening_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
        final SubLObject plans_found = shop_basic_planner_thread.get_shop_basic_planner_thread_plans_found(self);
        final SubLObject depth_cutoff = shop_basic_planner_thread.get_shop_basic_planner_thread_depth_cutoff(self);
        final SubLObject stats_manager = shop_basic_planner_thread.get_shop_basic_planner_thread_stats_manager(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym172$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                SubLObject last_iteration_expansions = ZERO_INTEGER;
                SubLObject last_iteration_inferences = ZERO_INTEGER;
                methods.funcall_instance_method_with_0_args(stats_manager, shop_basic_planner_thread.START_TIMING);
                shop_basic_planner_thread.shop_basic_planner_thread_print_stats_header_method(self, shop_basic_planner_thread.$$$Depth);
                SubLObject cur_depth = NIL;
                cur_depth = ZERO_INTEGER;
                while (NIL == instances.get_slot(self, PLANS_FOUND)) {
                    last_iteration_expansions = methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_EXPANSIONS);
                    last_iteration_inferences = methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_INFERENCES);
                    methods.funcall_instance_method_with_0_args(stats_manager, shop_basic_planner_thread.RESET_COUNTERS);
                    instances.set_slot(self, DEPTH_CUTOFF, cur_depth);
                    shop_basic_planner_thread.shop_basic_planner_thread_seek_plans_method(self);
                    shop_basic_planner_thread.shop_basic_planner_thread_print_iterative_deepening_stats_method(self, cur_depth);
                    if (subtract(last_iteration_expansions, methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_EXPANSIONS)).isZero() || subtract(last_iteration_inferences, methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_INFERENCES)).isZero()) {
                        Errors.cerror(shop_basic_planner_thread.$$$Error, shop_basic_planner_thread.$str177$No_expansions_or_inferences___add);
                    }
                    cur_depth = number_utilities.f_1X(cur_depth);
                } 
                methods.funcall_instance_method_with_0_args(stats_manager, shop_basic_planner_thread.STOP_TIMING);
                sublisp_throw(shop_basic_planner_thread.$sym172$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    shop_basic_planner_thread.set_shop_basic_planner_thread_plans_found(self, plans_found);
                    shop_basic_planner_thread.set_shop_basic_planner_thread_depth_cutoff(self, depth_cutoff);
                    shop_basic_planner_thread.set_shop_basic_planner_thread_stats_manager(self, stats_manager);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, shop_basic_planner_thread.$sym172$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }

    /**
     *
     *
     * @param MT
    hlmt-p
     * 		
     * @return listp ;; of hl-formula-p
     */
    @LispMethod(comment = "@param MT\nhlmt-p\r\n\t\t\r\n@return listp ;; of hl-formula-p")
    public static final SubLObject shop_basic_planner_thread_gather_initial_state_method_alt(SubLObject self, SubLObject mt) {
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
                                SubLObject _prev_bind_0_17 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
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
                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt187$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        if (pcase_var.eql($CERROR)) {
                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt187$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            if (pcase_var.eql($WARN)) {
                                                                Errors.warn($str_alt187$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            } else {
                                                                Errors.warn($str_alt192$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                Errors.cerror($$$continue_anyway, $str_alt187$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_18 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        SubLObject _prev_bind_1_19 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_20 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_21 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                                        SubLObject _prev_bind_0_23 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_24 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                                                                                SubLObject mt_25 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                thread.resetMultipleValues();
                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_25)) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_26 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_25, thread);
                                                                                                                            {
                                                                                                                                SubLObject iteration_state_27 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_27)) {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_27);
                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_28 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                        SubLObject cdolist_list_var_29 = new_list;
                                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                                        for (node_vars_link_node = cdolist_list_var_29.first(); NIL != cdolist_list_var_29; cdolist_list_var_29 = cdolist_list_var_29.rest() , node_vars_link_node = cdolist_list_var_29.first()) {
                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_28, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iteration_state_27 = dictionary_contents.do_dictionary_contents_next(iteration_state_27);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_27);
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_26, thread);
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
                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt195$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                        {
                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                            SubLObject cdolist_list_var_30 = new_list;
                                                                                            SubLObject generating_fn = NIL;
                                                                                            for (generating_fn = cdolist_list_var_30.first(); NIL != cdolist_list_var_30; cdolist_list_var_30 = cdolist_list_var_30.rest() , generating_fn = cdolist_list_var_30.first()) {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_31 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                        {
                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                            SubLObject new_list_32 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                            SubLObject cdolist_list_var_33 = new_list_32;
                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                            for (node_vars_link_node = cdolist_list_var_33.first(); NIL != cdolist_list_var_33; cdolist_list_var_33 = cdolist_list_var_33.rest() , node_vars_link_node = cdolist_list_var_33.first()) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
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
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_24, thread);
                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_23, thread);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            node_var = deck.deck_pop(recur_deck);
                                                        } 
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_22, thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_21, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_20, thread);
                                                    }
                                                }
                                            } else {
                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt196$Node__a_does_not_pass_sbhl_type_t, mt, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_19, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_18, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_17, thread);
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

    /**
     *
     *
     * @param MT
    hlmt-p
     * 		
     * @return listp ;; of hl-formula-p
     */
    @LispMethod(comment = "@param MT\nhlmt-p\r\n\t\t\r\n@return listp ;; of hl-formula-p")
    public static SubLObject shop_basic_planner_thread_gather_initial_state_method(final SubLObject self, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject init_mts = NIL;
        SubLObject node_var = mt;
        final SubLObject deck_type = $STACK;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        final SubLObject _prev_bind_0 = $sbhl_space$.currentBinding(thread);
        try {
            $sbhl_space$.bind(get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$17 = $sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    $sbhl_tv$.bind(NIL != tv_var ? tv_var : get_sbhl_true_tv(), thread);
                    $relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : $relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_object_type_checking_p())) && (NIL == sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = $sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_error(ONE_INTEGER, shop_basic_planner_thread.$str187$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_cerror(ONE_INTEGER, shop_basic_planner_thread.$$$continue_anyway, shop_basic_planner_thread.$str187$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn(shop_basic_planner_thread.$str187$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn(shop_basic_planner_thread.$str192$_A_is_not_a_valid__sbhl_type_erro, $sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror(shop_basic_planner_thread.$$$continue_anyway, shop_basic_planner_thread.$str187$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$18 = $sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$19 = $sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $sbhl_module$.currentBinding(thread);
                    try {
                        $sbhl_search_module$.bind(get_sbhl_module(shop_basic_planner_thread.$$genlMt), thread);
                        $sbhl_search_module_type$.bind(get_sbhl_module_type(get_sbhl_module(shop_basic_planner_thread.$$genlMt)), thread);
                        $sbhl_add_node_to_result_test$.bind(get_sbhl_add_node_to_result_test(get_sbhl_module(shop_basic_planner_thread.$$genlMt)), thread);
                        $genl_inverse_mode_p$.bind(NIL, thread);
                        $sbhl_module$.bind(get_sbhl_module(shop_basic_planner_thread.$$genlMt), thread);
                        if ((NIL != suspend_sbhl_type_checkingP()) || (NIL != apply_sbhl_module_type_test(mt, get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$19 = $sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$20 = $sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$22 = $genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                $sbhl_search_direction$.bind(get_sbhl_forward_search_direction(), thread);
                                $sbhl_link_direction$.bind(sbhl_search_direction_to_link_direction(get_sbhl_forward_search_direction(), get_sbhl_module(shop_basic_planner_thread.$$genlMt)), thread);
                                $genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_mark_node_marked(node_var, UNPROVIDED);
                                while (NIL != node_var) {
                                    final SubLObject genl_mt = node_var;
                                    if ((NIL == subl_promotions.memberP(genl_mt, init_mts, UNPROVIDED, UNPROVIDED)) && (NIL != isa.isaP(genl_mt, shop_basic_planner_thread.$$PlanDynamicSituationMicrotheory, UNPROVIDED, UNPROVIDED))) {
                                        init_mts = cons(genl_mt, init_mts);
                                    }
                                    SubLObject cdolist_list_var;
                                    final SubLObject accessible_modules = cdolist_list_var = get_sbhl_accessible_modules(get_sbhl_module(shop_basic_planner_thread.$$genlMt));
                                    SubLObject module_var = NIL;
                                    module_var = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        final SubLObject _prev_bind_0_$20 = $sbhl_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$21 = $genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            $sbhl_module$.bind(module_var, thread);
                                            $genl_inverse_mode_p$.bind(NIL != flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == $genl_inverse_mode_p$.getDynamicValue(thread)) : $genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                            final SubLObject node = function_terms.naut_to_nart(node_var);
                                            if (NIL != sbhl_node_object_p(node)) {
                                                final SubLObject d_link = get_sbhl_graph_link(node, get_sbhl_module(UNPROVIDED));
                                                if (NIL != d_link) {
                                                    final SubLObject mt_links = get_sbhl_mt_links(d_link, get_sbhl_link_direction(), get_sbhl_module(UNPROVIDED));
                                                    if (NIL != mt_links) {
                                                        SubLObject iteration_state;
                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject mt_$25 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$25)) {
                                                                final SubLObject _prev_bind_0_$21 = $sbhl_link_mt$.currentBinding(thread);
                                                                try {
                                                                    $sbhl_link_mt$.bind(mt_$25, thread);
                                                                    SubLObject iteration_state_$27;
                                                                    for (iteration_state_$27 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$27); iteration_state_$27 = dictionary_contents.do_dictionary_contents_next(iteration_state_$27)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$27);
                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != relevant_sbhl_tvP(tv)) {
                                                                            final SubLObject _prev_bind_0_$22 = $sbhl_link_tv$.currentBinding(thread);
                                                                            try {
                                                                                $sbhl_link_tv$.bind(tv, thread);
                                                                                final SubLObject sol = link_nodes;
                                                                                if (NIL != set.set_p(sol)) {
                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                    SubLObject basis_object;
                                                                                    SubLObject state;
                                                                                    SubLObject node_vars_link_node;
                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                            sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (sol.isList()) {
                                                                                        SubLObject csome_list_var = sol;
                                                                                        SubLObject node_vars_link_node2 = NIL;
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                        while (NIL != csome_list_var) {
                                                                                            if (NIL == sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                            }
                                                                                            csome_list_var = csome_list_var.rest();
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                        } 
                                                                                    } else {
                                                                                        Errors.error(shop_basic_planner_thread.$str195$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }

                                                                            } finally {
                                                                                $sbhl_link_tv$.rebind(_prev_bind_0_$22, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$27);
                                                                } finally {
                                                                    $sbhl_link_mt$.rebind(_prev_bind_0_$21, thread);
                                                                }
                                                            }
                                                        }
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                    }
                                                } else {
                                                    sbhl_error(FIVE_INTEGER, shop_basic_planner_thread.$str196$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            } else
                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$29;
                                                    final SubLObject new_list = cdolist_list_var_$29 = (NIL != sbhl_randomize_lists_p()) ? list_utilities.randomize_list(get_sbhl_module_relevant_naut_link_generators(get_sbhl_link_direction(), $sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED))) : get_sbhl_module_relevant_naut_link_generators(get_sbhl_link_direction(), $sbhl_tv$.getDynamicValue(thread), get_sbhl_module(UNPROVIDED));
                                                    SubLObject generating_fn = NIL;
                                                    generating_fn = cdolist_list_var_$29.first();
                                                    while (NIL != cdolist_list_var_$29) {
                                                        final SubLObject _prev_bind_0_$23 = $sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            $sbhl_link_generator$.bind(generating_fn, thread);
                                                            final SubLObject sol2;
                                                            final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                            if (NIL != set.set_p(sol2)) {
                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                        sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                    }
                                                                }
                                                            } else
                                                                if (sol2.isList()) {
                                                                    SubLObject csome_list_var2 = sol2;
                                                                    SubLObject node_vars_link_node4 = NIL;
                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                    while (NIL != csome_list_var2) {
                                                                        if (NIL == sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                            sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                    } 
                                                                } else {
                                                                    Errors.error(shop_basic_planner_thread.$str195$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }

                                                        } finally {
                                                            $sbhl_link_generator$.rebind(_prev_bind_0_$23, thread);
                                                        }
                                                        cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                                                        generating_fn = cdolist_list_var_$29.first();
                                                    } 
                                                }

                                        } finally {
                                            $genl_inverse_mode_p$.rebind(_prev_bind_1_$21, thread);
                                            $sbhl_module$.rebind(_prev_bind_0_$20, thread);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        module_var = cdolist_list_var.first();
                                    } 
                                    node_var = deck.deck_pop(recur_deck);
                                } 
                            } finally {
                                $genl_inverse_mode_p$.rebind(_prev_bind_2_$22, thread);
                                $sbhl_link_direction$.rebind(_prev_bind_1_$20, thread);
                                $sbhl_search_direction$.rebind(_prev_bind_0_$19, thread);
                            }
                        } else {
                            sbhl_warn(TWO_INTEGER, shop_basic_planner_thread.$str197$Node__a_does_not_pass_sbhl_type_t, mt, get_sbhl_type_test(get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        $sbhl_module$.rebind(_prev_bind_5, thread);
                        $genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        $sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        $sbhl_search_module_type$.rebind(_prev_bind_1_$19, thread);
                        $sbhl_search_module$.rebind(_prev_bind_0_$18, thread);
                    }
                } finally {
                    $relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    $sbhl_tv$.rebind(_prev_bind_0_$17, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    free_sbhl_marking_space($sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                }
            }
        } finally {
            $sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return Mapping.mapcar(shop_basic_planner_thread.ASSERTION_HL_FORMULA, apply(APPEND, Mapping.mapcar(shop_basic_planner_thread.GATHER_MT_INDEX, init_mts)));
    }

    /**
     *
     *
     * @param PROBLEM-NAME
     * 		
     * @param DOMAIN-NAME
     * 		
     * @param STATE
     * 		
     * @param TASKS
     * 		
     * @param MT
    microtheory-p
     * 		
     * @return shop-basic-problem-p
     */
    @LispMethod(comment = "@param PROBLEM-NAME\r\n\t\t\r\n@param DOMAIN-NAME\r\n\t\t\r\n@param STATE\r\n\t\t\r\n@param TASKS\r\n\t\t\r\n@param MT\nmicrotheory-p\r\n\t\t\r\n@return shop-basic-problem-p")
    public static final SubLObject shop_basic_planner_thread_make_problem_method_alt(SubLObject self, SubLObject problem_name, SubLObject state, SubLObject tasks, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
                SubLObject v_planner = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_planner(self);
                try {
                    try {
                        {
                            SubLObject domain = NIL;
                            SubLObject new_problem = NIL;
                            SubLObject new_world_state = NIL;
                            new_problem = object.object_new_method(SHOP_BASIC_PROBLEM);
                            if (NIL != shop_parameters.$shop_use_mt_world_statesP$.getDynamicValue(thread)) {
                                new_world_state = object.object_new_method(SHOP_MT_WORLD_STATE);
                                instances.set_slot(new_world_state, MT, mt);
                            } else {
                                new_world_state = object.object_new_method(SHOP_BASIC_WORLD_STATE);
                            }
                            domain = methods.funcall_instance_method_with_1_args(v_planner, GET_DOMAIN, mt);
                            shop_datastructures.shop_basic_problem_initialize_problem_method(new_problem, problem_name, domain, new_world_state, tasks, mt);
                            sublisp_throw($sym204$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, new_problem);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_planner(self, v_planner);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, $sym204$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
                }
                return catch_var_for_shop_basic_planner_thread_method;
            }
        }
    }

    /**
     *
     *
     * @param PROBLEM-NAME
     * 		
     * @param DOMAIN-NAME
     * 		
     * @param STATE
     * 		
     * @param TASKS
     * 		
     * @param MT
    microtheory-p
     * 		
     * @return shop-basic-problem-p
     */
    @LispMethod(comment = "@param PROBLEM-NAME\r\n\t\t\r\n@param DOMAIN-NAME\r\n\t\t\r\n@param STATE\r\n\t\t\r\n@param TASKS\r\n\t\t\r\n@param MT\nmicrotheory-p\r\n\t\t\r\n@return shop-basic-problem-p")
    public static SubLObject shop_basic_planner_thread_make_problem_method(final SubLObject self, final SubLObject problem_name, final SubLObject state, final SubLObject tasks, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
        final SubLObject planner = shop_basic_planner_thread.get_shop_basic_planner_thread_planner(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym205$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                SubLObject domain = NIL;
                SubLObject new_problem = NIL;
                SubLObject new_world_state = NIL;
                new_problem = object.object_new_method(SHOP_BASIC_PROBLEM);
                if (NIL != shop_parameters.$shop_use_mt_world_statesP$.getDynamicValue(thread)) {
                    new_world_state = object.object_new_method(SHOP_MT_WORLD_STATE);
                    instances.set_slot(new_world_state, MT, mt);
                } else {
                    new_world_state = object.object_new_method(SHOP_BASIC_WORLD_STATE);
                }
                domain = methods.funcall_instance_method_with_1_args(planner, GET_DOMAIN, mt);
                shop_datastructures.shop_basic_problem_initialize_problem_method(new_problem, problem_name, domain, new_world_state, tasks, mt);
                sublisp_throw(shop_basic_planner_thread.$sym205$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, new_problem);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    shop_basic_planner_thread.set_shop_basic_planner_thread_planner(self, planner);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, shop_basic_planner_thread.$sym205$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }

    /**
     *
     *
     * @param FORMULA
    el-formula-p
     * 		
     * @param MT
    microtheory-p
     * 		
     */
    @LispMethod(comment = "@param FORMULA\nel-formula-p\r\n\t\t\r\n@param MT\nmicrotheory-p")
    public static final SubLObject shop_basic_planner_thread_make_problem_from_formula_method_alt(SubLObject self, SubLObject formula, SubLObject mt) {
        {
            SubLObject hl_formula = com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_reify_narts_in_expression(formula);
            SubLObject cyc_tasks = list(hl_formula);
            SubLObject initial_state = NIL;
            SubLObject new_problem = NIL;
            new_problem = methods.funcall_instance_method_with_4_args(self, MAKE_PROBLEM, formula, initial_state, cyc_tasks, mt);
            return new_problem;
        }
    }

    /**
     *
     *
     * @param FORMULA
    el-formula-p
     * 		
     * @param MT
    microtheory-p
     * 		
     */
    @LispMethod(comment = "@param FORMULA\nel-formula-p\r\n\t\t\r\n@param MT\nmicrotheory-p")
    public static SubLObject shop_basic_planner_thread_make_problem_from_formula_method(final SubLObject self, final SubLObject formula, final SubLObject mt) {
        final SubLObject hl_formula = shop_basic_planner_thread.shop_reify_narts_in_expression(formula);
        final SubLObject cyc_tasks = list(hl_formula);
        final SubLObject initial_state = NIL;
        SubLObject new_problem = NIL;
        new_problem = methods.funcall_instance_method_with_4_args(self, shop_basic_planner_thread.MAKE_PROBLEM, formula, initial_state, cyc_tasks, mt);
        return new_problem;
    }

    /**
     *
     *
     * @param TASK-FORMULA
    el-formula-p
     * 		
     * @param MT
     * 		microtheory-p
     * 		FIND-PLANS starts the search for a plan for problem with name NEW-PROBLEM.
     */
    @LispMethod(comment = "@param TASK-FORMULA\nel-formula-p\r\n\t\t\r\n@param MT\r\n\t\tmicrotheory-p\r\n\t\tFIND-PLANS starts the search for a plan for problem with name NEW-PROBLEM.")
    public static final SubLObject shop_basic_planner_thread_find_plans_method_alt(SubLObject self, SubLObject task_formula, SubLObject mt, SubLObject which, SubLObject verbosity, SubLObject number, SubLObject time, SubLObject depth) {
        if (which == UNPROVIDED) {
            which = $ALL;
        }
        if (verbosity == UNPROVIDED) {
            verbosity = ZERO_INTEGER;
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
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_problem = com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_make_problem_from_formula_method(self, task_formula, mt);
                SubLObject domain = NIL;
                com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_init_planner_thread_method(self, new_problem, which, verbosity, number, time, depth);
                if (NIL != shop_internals.$shop_gc$.getDynamicValue(thread)) {
                    Storage.gc(UNPROVIDED);
                }
                domain = shop_domain.shop_basic_domain_get_name_method(instances.get_slot(instances.get_slot(self, PROBLEM), DOMAIN));
                {
                    SubLObject entry = assoc(ONE_INTEGER, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    SubLObject verbose_msg_level = (NIL != entry) ? ((SubLObject) (entry.rest())) : ZERO_INTEGER;
                    SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                    if (verbose_thread_level.numGE(verbose_msg_level)) {
                        format(T, $str_alt219$Problem___s_Domain___s_Plans___s_, new SubLObject[]{ new_problem, domain, which, verbosity });
                    }
                }
                {
                    SubLObject pcase_var = which;
                    if (pcase_var.eql($ID_FIRST) || pcase_var.eql($ID_ALL)) {
                        com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_seek_plans_with_iterative_deepening_method(self);
                    } else {
                        if (((pcase_var.eql($FIRST) || pcase_var.eql($ALL)) || pcase_var.eql($SHALLOWEST)) || pcase_var.eql($ALL_SHALLOWEST)) {
                            methods.funcall_instance_method_with_0_args(com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_stats_manager(self), START_TIMING);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_seek_plans_method(self);
                            methods.funcall_instance_method_with_0_args(com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_stats_manager(self), STOP_TIMING);
                        } else {
                            Errors.cerror($str_alt150$invalid_keyword__S, which);
                        }
                    }
                }
                {
                    SubLObject entry = assoc(ONE_INTEGER, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                    SubLObject verbose_msg_level = (NIL != entry) ? ((SubLObject) (entry.rest())) : ZERO_INTEGER;
                    SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
                    if (verbose_thread_level.numGE(verbose_msg_level)) {
                        com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_output_message_method(self, cconcatenate($str_alt222$Halted_Because__, write_to_string(com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_halt_status_method(self), EMPTY_SUBL_OBJECT_ARRAY)));
                        com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_print_stats_header_method(self, $str_alt223$Totals_);
                        com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_print_stats_method(self);
                    }
                }
                return instances.get_slot(self, PLANS_FOUND);
            }
        }
    }

    /**
     *
     *
     * @param TASK-FORMULA
    el-formula-p
     * 		
     * @param MT
     * 		microtheory-p
     * 		FIND-PLANS starts the search for a plan for problem with name NEW-PROBLEM.
     */
    @LispMethod(comment = "@param TASK-FORMULA\nel-formula-p\r\n\t\t\r\n@param MT\r\n\t\tmicrotheory-p\r\n\t\tFIND-PLANS starts the search for a plan for problem with name NEW-PROBLEM.")
    public static SubLObject shop_basic_planner_thread_find_plans_method(final SubLObject self, final SubLObject task_formula, final SubLObject mt, SubLObject which, SubLObject verbosity, SubLObject number, SubLObject time, SubLObject depth) {
        if (which == UNPROVIDED) {
            which = $ALL;
        }
        if (verbosity == UNPROVIDED) {
            verbosity = ZERO_INTEGER;
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
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_problem = shop_basic_planner_thread.shop_basic_planner_thread_make_problem_from_formula_method(self, task_formula, mt);
        SubLObject domain = NIL;
        shop_basic_planner_thread.shop_basic_planner_thread_init_planner_thread_method(self, new_problem, which, verbosity, number, time, depth);
        if (NIL != shop_internals.$shop_gc$.getDynamicValue(thread)) {
            Storage.gc(UNPROVIDED);
        }
        domain = shop_domain.shop_basic_domain_get_name_method(instances.get_slot(instances.get_slot(self, PROBLEM), DOMAIN));
        SubLObject entry = assoc(ONE_INTEGER, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        SubLObject verbose_msg_level = (NIL != entry) ? entry.rest() : ZERO_INTEGER;
        SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
        if (verbose_thread_level.numGE(verbose_msg_level)) {
            format(T, shop_basic_planner_thread.$str220$Problem___s_Domain___s_Plans___s_, new SubLObject[]{ new_problem, domain, which, verbosity });
        }
        final SubLObject pcase_var = which;
        if (pcase_var.eql($ID_FIRST) || pcase_var.eql($ID_ALL)) {
            shop_basic_planner_thread.shop_basic_planner_thread_seek_plans_with_iterative_deepening_method(self);
        } else
            if (((pcase_var.eql($FIRST) || pcase_var.eql($ALL)) || pcase_var.eql($SHALLOWEST)) || pcase_var.eql($ALL_SHALLOWEST)) {
                methods.funcall_instance_method_with_0_args(shop_basic_planner_thread.get_shop_basic_planner_thread_stats_manager(self), shop_basic_planner_thread.START_TIMING);
                shop_basic_planner_thread.shop_basic_planner_thread_seek_plans_method(self);
                methods.funcall_instance_method_with_0_args(shop_basic_planner_thread.get_shop_basic_planner_thread_stats_manager(self), shop_basic_planner_thread.STOP_TIMING);
            } else {
                Errors.cerror(shop_basic_planner_thread.$str150$invalid_keyword__S, which);
            }

        entry = assoc(ONE_INTEGER, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        verbose_msg_level = (NIL != entry) ? entry.rest() : ZERO_INTEGER;
        verbose_thread_level = instances.get_slot(instances.get_slot(self, LOG), VERBOSE);
        if (verbose_thread_level.numGE(verbose_msg_level)) {
            shop_basic_planner_thread.shop_basic_planner_thread_output_message_method(self, cconcatenate(shop_basic_planner_thread.$str223$Halted_Because__, write_to_string(shop_basic_planner_thread.shop_basic_planner_thread_halt_status_method(self), EMPTY_SUBL_OBJECT_ARRAY)));
            shop_basic_planner_thread.shop_basic_planner_thread_print_stats_header_method(self, shop_basic_planner_thread.$str224$Totals_);
            shop_basic_planner_thread.shop_basic_planner_thread_print_stats_method(self);
        }
        return instances.get_slot(self, PLANS_FOUND);
    }

    static private final SubLList $list_alt6 = list(new SubLObject[]{ list(makeSymbol("PROBLEM"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("AXIOMS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("PLANNER"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("OPEN-NODES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("P-WRAPPER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("VAR-MANAGER"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("STATS-MANAGER"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("LOG"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INITIAL-PLAN-STATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("HALT-STATUS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("WHICH-PLANS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("NUM-BACKCHAINS"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("CYCLE-CHECKING"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("TIME-CUTOFF"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEPTH-CUTOFF"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("NUMBER-CUTOFF"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("PLAN-NUMBER"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("PLAN-NUMBER-TO-CUTOFF"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("PLANS-FOUND"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OUTPUT-MESSAGE"), list(makeSymbol("STRING")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OUTPUT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT-STATS"), list(makeSymbol("RUN-TIME"), makeSymbol("REAL-TIME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INIT-PLAN-STATE"), list(makeSymbol("PROBLEM-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DOMAIN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPLETED-RUN?"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HTML-DISPLAY-SUMMARY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NUMBER-CUTOFF-REACHED?"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TIME-CUTOFF-REACHED?"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEPTH-CUTOFF-REACHED?"), list(makeSymbol("PLAN-TASK")), makeKeyword("PRIVATE")) });

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject shop_basic_planner_thread_completed_runP_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
            SubLObject open_nodes = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_open_nodes(self);
            try {
                try {
                    sublisp_throw($sym227$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, sublisp_null(open_nodes));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_open_nodes(self, open_nodes);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, $sym227$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            }
            return catch_var_for_shop_basic_planner_thread_method;
        }
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject shop_basic_planner_thread_completed_runP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
        final SubLObject open_nodes = shop_basic_planner_thread.get_shop_basic_planner_thread_open_nodes(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym228$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                sublisp_throw(shop_basic_planner_thread.$sym228$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, sublisp_null(open_nodes));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    shop_basic_planner_thread.set_shop_basic_planner_thread_open_nodes(self, open_nodes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, shop_basic_planner_thread.$sym228$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }

    /**
     * This function returns a list of values that can be used to summarize
     * the results of the thread.
     */
    @LispMethod(comment = "This function returns a list of values that can be used to summarize\r\nthe results of the thread.\nThis function returns a list of values that can be used to summarize\nthe results of the thread.")
    public static final SubLObject shop_basic_planner_thread_summary_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
            SubLObject plans_found = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_plans_found(self);
            SubLObject problem = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_problem(self);
            try {
                try {
                    {
                        SubLObject task_list = methods.funcall_instance_method_with_0_args(problem, GET_TASKS);
                        SubLObject task = task_list.first();
                        SubLObject completed_runP = com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_completed_runP_method(self);
                        SubLObject plan_count = length(plans_found);
                        sublisp_throw($sym231$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, list(task, completed_runP, plan_count));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_plans_found(self, plans_found);
                            com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_problem(self, problem);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, $sym231$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            }
            return catch_var_for_shop_basic_planner_thread_method;
        }
    }

    /**
     * This function returns a list of values that can be used to summarize
     * the results of the thread.
     */
    @LispMethod(comment = "This function returns a list of values that can be used to summarize\r\nthe results of the thread.\nThis function returns a list of values that can be used to summarize\nthe results of the thread.")
    public static SubLObject shop_basic_planner_thread_summary_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
        final SubLObject plans_found = shop_basic_planner_thread.get_shop_basic_planner_thread_plans_found(self);
        final SubLObject problem = shop_basic_planner_thread.get_shop_basic_planner_thread_problem(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym232$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                final SubLObject task_list = methods.funcall_instance_method_with_0_args(problem, shop_basic_planner_thread.GET_TASKS);
                final SubLObject task = task_list.first();
                final SubLObject completed_runP = shop_basic_planner_thread.shop_basic_planner_thread_completed_runP_method(self);
                final SubLObject plan_count = length(plans_found);
                sublisp_throw(shop_basic_planner_thread.$sym232$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, list(task, completed_runP, plan_count));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    shop_basic_planner_thread.set_shop_basic_planner_thread_plans_found(self, plans_found);
                    shop_basic_planner_thread.set_shop_basic_planner_thread_problem(self, problem);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, shop_basic_planner_thread.$sym232$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }

    static private final SubLList $list_alt30 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt31 = list(new SubLObject[]{ list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("VAR-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-VARIABLE-MANAGER")), list(QUOTE, makeSymbol("SHOP-VARIABLE-MANAGER")))), list(makeSymbol("CSETQ"), makeSymbol("STATS-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-STATISTIC-MANAGER")), list(QUOTE, makeSymbol("SHOP-STATISTIC-MANAGER")))), list(makeSymbol("CSETQ"), makeSymbol("LOG"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-LOG")), list(QUOTE, makeSymbol("SHOP-LOG")))), list(makeSymbol("CSETQ"), makeSymbol("PLAN-NUMBER"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("PLAN-NUMBER-TO-CUTOFF"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("TIME-CUTOFF"), NIL), list(makeSymbol("CSETQ"), makeSymbol("DEPTH-CUTOFF"), makeSymbol("*SHOP-DEFAULT-DEPTH-LIMIT*")), list(makeSymbol("CSETQ"), makeSymbol("NUMBER-CUTOFF"), NIL), list(makeSymbol("CSETQ"), makeSymbol("HALT-STATUS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("NUM-BACKCHAINS"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("CYCLE-CHECKING"), NIL), list(RET, makeSymbol("SELF")) });

    /**
     * this function is used by the CycSecure AttackPlan History functionality.
     * displauys a short message about the thread and its resoultion.
     */
    @LispMethod(comment = "this function is used by the CycSecure AttackPlan History functionality.\r\ndisplauys a short message about the thread and its resoultion.\nthis function is used by the CycSecure AttackPlan History functionality.\ndisplauys a short message about the thread and its resoultion.")
    public static final SubLObject shop_basic_planner_thread_html_display_summary_method_alt(SubLObject self, SubLObject paraphrase_link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
                SubLObject plans_found = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_plans_found(self);
                SubLObject problem = com.cyc.cycjava.cycl.shop_basic_planner_thread.get_shop_basic_planner_thread_problem(self);
                try {
                    try {
                        {
                            SubLObject task_list = methods.funcall_instance_method_with_0_args(problem, GET_TASKS);
                            SubLObject task = task_list.first();
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    pph_html.html_text_with_target(task, paraphrase_link, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (true) {
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    if (NIL != com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_completed_runP_method(self)) {
                                        {
                                            SubLObject plan_count = length(plans_found);
                                            if (plan_count.isZero()) {
                                                html_princ($$$No_plans_found);
                                            } else {
                                                if (ONE_INTEGER == plan_count) {
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt239$_A_Plan_found, plan_count);
                                                } else {
                                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt240$_A_Plans_found, plan_count);
                                                }
                                            }
                                        }
                                    } else {
                                        html_princ($$$Not_Completed);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            sublisp_throw($sym237$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, NIL);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_plans_found(self, plans_found);
                                com.cyc.cycjava.cycl.shop_basic_planner_thread.set_shop_basic_planner_thread_problem(self, problem);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, $sym237$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
                }
                return catch_var_for_shop_basic_planner_thread_method;
            }
        }
    }

    /**
     * this function is used by the CycSecure AttackPlan History functionality.
     * displauys a short message about the thread and its resoultion.
     */
    @LispMethod(comment = "this function is used by the CycSecure AttackPlan History functionality.\r\ndisplauys a short message about the thread and its resoultion.\nthis function is used by the CycSecure AttackPlan History functionality.\ndisplauys a short message about the thread and its resoultion.")
    public static SubLObject shop_basic_planner_thread_html_display_summary_method(final SubLObject self, final SubLObject paraphrase_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
        final SubLObject plans_found = shop_basic_planner_thread.get_shop_basic_planner_thread_plans_found(self);
        final SubLObject problem = shop_basic_planner_thread.get_shop_basic_planner_thread_problem(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym238$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                final SubLObject task_list = methods.funcall_instance_method_with_0_args(problem, shop_basic_planner_thread.GET_TASKS);
                final SubLObject task = task_list.first();
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    pph_html.html_text_with_target(task, paraphrase_link, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != shop_basic_planner_thread.shop_basic_planner_thread_completed_runP_method(self)) {
                        final SubLObject plan_count = length(plans_found);
                        if (plan_count.isZero()) {
                            html_princ(shop_basic_planner_thread.$$$No_plans_found);
                        } else
                            if (ONE_INTEGER.eql(plan_count)) {
                                format(html_macros.$html_stream$.getDynamicValue(thread), shop_basic_planner_thread.$str240$_A_Plan_found, plan_count);
                            } else {
                                format(html_macros.$html_stream$.getDynamicValue(thread), shop_basic_planner_thread.$str241$_A_Plans_found, plan_count);
                            }

                    } else {
                        html_princ(shop_basic_planner_thread.$$$Not_Completed);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                sublisp_throw(shop_basic_planner_thread.$sym238$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    shop_basic_planner_thread.set_shop_basic_planner_thread_plans_found(self, plans_found);
                    shop_basic_planner_thread.set_shop_basic_planner_thread_problem(self, problem);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, shop_basic_planner_thread.$sym238$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }

    static private final SubLList $list_alt38 = list(makeKeyword("PRIVATE"));

    static private final SubLList $list_alt39 = list(makeSymbol("STRING"));

    static private final SubLList $list_alt40 = list(list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("LOG-ENTRY"), makeSymbol("SHOP-LOG")), makeSymbol("LOG"), makeSymbol("STRING"))));

    static private final SubLList $list_alt44 = list(makeString("@return booleanp"), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("OPEN-NODES")), list(RET, T)), list(RET, list(makeSymbol("COR"), list(makeSymbol("DEPTH-CUTOFF-REACHED?"), makeSymbol("SELF"), list(makeSymbol("FIRST"), makeSymbol("OPEN-NODES"))), list(makeSymbol("TIME-CUTOFF-REACHED?"), makeSymbol("SELF")), list(makeSymbol("NUMBER-CUTOFF-REACHED?"), makeSymbol("SELF")))));

    static private final SubLList $list_alt48 = list(makeSymbol("PLAN-STATE"));

    static private final SubLList $list_alt49 = list(makeString("@param PLAN-STATE shop-plan-state-p\n   @return booleanp"), list(RET, list(makeSymbol("FIF"), list(makeSymbol("NUMBERP"), makeSymbol("DEPTH-CUTOFF")), list(makeSymbol(">"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEPTH"), makeSymbol("SHOP-PLAN-STATE")), makeSymbol("PLAN-STATE")), makeSymbol("DEPTH-CUTOFF")), NIL)));

    static private final SubLList $list_alt54 = list(makeString("@return booleanp"), list(RET, list(makeSymbol("FIF"), makeSymbol("TIME-CUTOFF"), list(makeSymbol(">"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ELAPSED-RUN-TIME-SINCE-LAST-CALL"), makeSymbol("STATISTIC-MANAGER")), makeSymbol("STATS-MANAGER")), makeSymbol("TIME-CUTOFF")), NIL)));

    public static final SubLObject mapcar_method_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject method = NIL;
            SubLObject v_class = NIL;
            SubLObject list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt243);
            method = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt243);
            v_class = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt243);
            list = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(FWHEN, list(SUBLOOP_TYPE_P, v_class), listS(CLET, $list_alt247, list(CDOLIST, list(CUR_ITEM, list), listS(CPUSH, listS(INLINE_METHOD, list(method, v_class), $list_alt252), $list_alt253)), $list_alt254));
            } else {
                cdestructuring_bind_error(datum, $list_alt243);
            }
        }
        return NIL;
    }

    public static SubLObject mapcar_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method = NIL;
        SubLObject v_class = NIL;
        SubLObject list = NIL;
        destructuring_bind_must_consp(current, datum, shop_basic_planner_thread.$list244);
        method = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, shop_basic_planner_thread.$list244);
        v_class = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, shop_basic_planner_thread.$list244);
        list = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(FWHEN, list(shop_basic_planner_thread.SUBLOOP_TYPE_P, v_class), listS(CLET, shop_basic_planner_thread.$list248, list(CDOLIST, list(shop_basic_planner_thread.CUR_ITEM, list), listS(CPUSH, listS(INLINE_METHOD, list(method, v_class), shop_basic_planner_thread.$list253), shop_basic_planner_thread.$list254)), shop_basic_planner_thread.$list255));
        }
        cdestructuring_bind_error(datum, shop_basic_planner_thread.$list244);
        return NIL;
    }

    static private final SubLList $list_alt58 = list(makeString("@return booleanp"), list(RET, list(makeSymbol("FIF"), makeSymbol("NUMBER-CUTOFF"), list(makeSymbol(">="), makeSymbol("PLAN-NUMBER-TO-CUTOFF"), makeSymbol("NUMBER-CUTOFF")), NIL)));

    public static final SubLObject shop_plan_cost_alt(SubLObject plan) {
        return length(shop_basic_plan.shop_basic_plan_primitive_form_method(plan));
    }

    public static SubLObject shop_plan_cost(final SubLObject plan) {
        return length(shop_basic_plan.shop_basic_plan_primitive_form_method(plan));
    }

    static private final SubLList $list_alt62 = list(list(RET, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")))));

    public static final SubLObject shop_reifiable_natP_alt(SubLObject nat) {
        if (NIL != obsolete.reifiable_natP(nat, UNPROVIDED, UNPROVIDED)) {
            if (NIL != czer_utilities.el_find_nart(nat)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject shop_reifiable_natP(final SubLObject nat) {
        if ((NIL != obsolete.reifiable_natP(nat, UNPROVIDED, UNPROVIDED)) && (NIL != czer_utilities.el_find_nart(nat))) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject shop_reify_narts_in_expression_alt(SubLObject task) {
        return cycl_utilities.expression_ntransform(task, $sym255$SHOP_REIFIABLE_NAT_, FIND_WHEN_CLOSED_NAUT, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject shop_reify_narts_in_expression(final SubLObject task) {
        return cycl_utilities.expression_ntransform(task, shop_basic_planner_thread.$sym256$SHOP_REIFIABLE_NAT_, shop_basic_planner_thread.FIND_WHEN_CLOSED_NAUT, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static final SubLObject shop_planner_thread_p_alt(SubLObject thread) {
        return com.cyc.cycjava.cycl.shop_basic_planner_thread.shop_basic_planner_thread_p(thread);
    }

    /**
     *
     *
     * @return booleanp
     */
    @LispMethod(comment = "@return booleanp")
    public static SubLObject shop_planner_thread_p(final SubLObject thread) {
        return shop_basic_planner_thread.shop_basic_planner_thread_p(thread);
    }

    static private final SubLList $list_alt66 = list(makeSymbol("LABEL"));

    static private final SubLList $list_alt67 = list(list(makeSymbol("OUTPUT-MESSAGE"), makeSymbol("SELF"), list(makeSymbol("FORMAT"), NIL, makeString("~%~7@a Plans Mincost Maxcost Expansions Inferences CPU time Real time"), makeSymbol("LABEL"))), list(RET, NIL));

    /**
     *
     *
     * @param THREAD
    shop-planner-thread-p
     * 		
     */
    @LispMethod(comment = "@param THREAD\nshop-planner-thread-p")
    public static final SubLObject shop_planner_thread_plans_found_alt(SubLObject thread) {
        if (NIL == thread) {
            return NIL;
        }
        return instances.get_slot(thread, PLANS_FOUND);
    }

    /**
     *
     *
     * @param THREAD
    shop-planner-thread-p
     * 		
     */
    @LispMethod(comment = "@param THREAD\nshop-planner-thread-p")
    public static SubLObject shop_planner_thread_plans_found(final SubLObject thread) {
        if (NIL == thread) {
            return NIL;
        }
        return instances.get_slot(thread, PLANS_FOUND);
    }

    /**
     *
     *
     * @param THREAD
    shop-planner-thread-p
     * 		
     */
    @LispMethod(comment = "@param THREAD\nshop-planner-thread-p")
    public static final SubLObject shop_planner_thread_num_plans_found_alt(SubLObject thread) {
        if (NIL == thread) {
            return NIL;
        }
        return instances.get_slot(thread, PLAN_NUMBER);
    }

    /**
     *
     *
     * @param THREAD
    shop-planner-thread-p
     * 		
     */
    @LispMethod(comment = "@param THREAD\nshop-planner-thread-p")
    public static SubLObject shop_planner_thread_num_plans_found(final SubLObject thread) {
        if (NIL == thread) {
            return NIL;
        }
        return instances.get_slot(thread, shop_basic_planner_thread.PLAN_NUMBER);
    }

    static private final SubLString $str_alt68$___7_a_Plans_Mincost_Maxcost_Expa = makeString("~%~7@a Plans Mincost Maxcost Expansions Inferences CPU time Real time");

    /**
     *
     *
     * @param THREAD
    shop-planner-thread-p
     * 		
     */
    @LispMethod(comment = "@param THREAD\nshop-planner-thread-p")
    public static final SubLObject shop_planner_thread_num_open_nodes_alt(SubLObject thread) {
        if (NIL == thread) {
            return NIL;
        }
        return length(instances.get_slot(thread, OPEN_NODES));
    }

    /**
     *
     *
     * @param THREAD
    shop-planner-thread-p
     * 		
     */
    @LispMethod(comment = "@param THREAD\nshop-planner-thread-p")
    public static SubLObject shop_planner_thread_num_open_nodes(final SubLObject thread) {
        if (NIL == thread) {
            return NIL;
        }
        return length(instances.get_slot(thread, OPEN_NODES));
    }

    static private final SubLList $list_alt71 = list(makeSymbol("PLAN"));

    /**
     *
     *
     * @param THREAD
    shop-planner-thread-p
     * 		
     */
    @LispMethod(comment = "@param THREAD\nshop-planner-thread-p")
    public static final SubLObject shop_planner_thread_num_inferences_alt(SubLObject thread) {
        if (NIL == thread) {
            return NIL;
        }
        {
            SubLObject stats_manager = instances.get_slot(thread, STATS_MANAGER);
            return methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_INFERENCES);
        }
    }

    /**
     *
     *
     * @param THREAD
    shop-planner-thread-p
     * 		
     */
    @LispMethod(comment = "@param THREAD\nshop-planner-thread-p")
    public static SubLObject shop_planner_thread_num_inferences(final SubLObject thread) {
        if (NIL == thread) {
            return NIL;
        }
        final SubLObject stats_manager = instances.get_slot(thread, STATS_MANAGER);
        return methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_INFERENCES);
    }

    static private final SubLList $list_alt72 = list(list(makeSymbol("OUTPUT-MESSAGE"), makeSymbol("SELF"), list(makeSymbol("FORMAT"), NIL, makeString("~%~s"), makeSymbol("PLAN"))), list(RET, NIL));

    static private final SubLString $str_alt73$___s = makeString("~%~s");

    /**
     *
     *
     * @param THREAD
    shop-planner-thread-p
     * 		
     */
    @LispMethod(comment = "@param THREAD\nshop-planner-thread-p")
    public static final SubLObject shop_planner_thread_nodes_expanded_alt(SubLObject thread) {
        if (NIL == thread) {
            return NIL;
        }
        {
            SubLObject stats_manager = instances.get_slot(thread, STATS_MANAGER);
            return methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_EXPANSIONS);
        }
    }

    /**
     *
     *
     * @param THREAD
    shop-planner-thread-p
     * 		
     */
    @LispMethod(comment = "@param THREAD\nshop-planner-thread-p")
    public static SubLObject shop_planner_thread_nodes_expanded(final SubLObject thread) {
        if (NIL == thread) {
            return NIL;
        }
        final SubLObject stats_manager = instances.get_slot(thread, STATS_MANAGER);
        return methods.funcall_instance_method_with_0_args(stats_manager, NUMBER_OF_EXPANSIONS);
    }

    static private final SubLList $list_alt76 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PLANS"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")))), list(makeSymbol("TASKS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("NUMBER-OF-EXPANSIONS")))), list(makeSymbol("INFERENCES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("NUMBER-OF-INFERENCES")))), list(makeSymbol("RUN-TIME"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ELAPSED-RUN-TIME"), makeSymbol("SHOP-STATISTIC-MANAGER")), makeSymbol("STATS-MANAGER"))), list(makeSymbol("REAL-TIME"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ELAPSED-REAL-TIME"), makeSymbol("SHOP-STATISTIC-MANAGER")), makeSymbol("STATS-MANAGER")))), list(makeSymbol("OUTPUT-MESSAGE"), makeSymbol("SELF"), list(new SubLObject[]{ makeSymbol("FORMAT"), NIL, makeString("~%~12@a~8@a~8@a~11@s~11@s~10,3f~11,3f"), list(makeSymbol("LENGTH"), makeSymbol("PLANS")), list(makeSymbol("FIF"), makeSymbol("PLANS"), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("MIN")), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("SHOP-PLAN-COST")), makeSymbol("PLANS"))), makeString("-")), list(makeSymbol("FIF"), makeSymbol("PLANS"), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("MAX")), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("SHOP-PLAN-COST")), makeSymbol("PLANS"))), makeString("-")), makeSymbol("TASKS"), makeSymbol("INFERENCES"), list(makeSymbol("/"), makeSymbol("RUN-TIME"), makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*")), list(makeSymbol("/"), makeSymbol("REAL-TIME"), makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*")) })), list(RET, NIL)));

    /**
     *
     *
     * @param THREAD
    shop-planner-thread-p
     * 		
     */
    @LispMethod(comment = "@param THREAD\nshop-planner-thread-p")
    public static final SubLObject shop_planner_thread_task_alt(SubLObject thread) {
        if (NIL == thread) {
            return NIL;
        }
        {
            SubLObject problem = instances.get_slot(thread, PROBLEM);
            if (NIL == problem) {
                return NIL;
            }
            return shop_datastructures.shop_basic_problem_get_tasks_method(problem).first();
        }
    }

    /**
     *
     *
     * @param THREAD
    shop-planner-thread-p
     * 		
     */
    @LispMethod(comment = "@param THREAD\nshop-planner-thread-p")
    public static SubLObject shop_planner_thread_task(final SubLObject thread) {
        if (NIL == thread) {
            return NIL;
        }
        final SubLObject problem = instances.get_slot(thread, PROBLEM);
        if (NIL == problem) {
            return NIL;
        }
        return shop_datastructures.shop_basic_problem_get_tasks_method(problem).first();
    }

    /**
     *
     *
     * @param THREAD
    shop-planner-thread-p
     * 		
     * @unknown should call some thing like PROCESS-WRAPPER-PROCESS-PAUSE
     */
    @LispMethod(comment = "@param THREAD\nshop-planner-thread-p\r\n\t\t\r\n@unknown should call some thing like PROCESS-WRAPPER-PROCESS-PAUSE")
    public static final SubLObject shop_planner_thread_pause_alt(SubLObject thread) {
        SubLTrampolineFile.checkType(thread, SHOP_PLANNER_THREAD_P);
        {
            SubLObject pw = instances.get_slot(thread, P_WRAPPER);
            SubLObject stats_manager = instances.get_slot(thread, STATS_MANAGER);
            methods.funcall_instance_method_with_0_args(thread, UPDATE_HALT_STATUS);
            methods.funcall_instance_method_with_0_args(stats_manager, STOP_TIMING);
            if (NIL != pw) {
                process_utilities.process_wrapper_block(pw);
            }
            methods.funcall_instance_method_with_0_args(stats_manager, RESUME_TIMING);
            instances.set_slot(thread, HALT_STATUS, NIL);
        }
        return NIL;
    }

    /**
     *
     *
     * @param THREAD
    shop-planner-thread-p
     * 		
     * @unknown should call some thing like PROCESS-WRAPPER-PROCESS-PAUSE
     */
    @LispMethod(comment = "@param THREAD\nshop-planner-thread-p\r\n\t\t\r\n@unknown should call some thing like PROCESS-WRAPPER-PROCESS-PAUSE")
    public static SubLObject shop_planner_thread_pause(final SubLObject thread) {
        assert NIL != shop_basic_planner_thread.shop_planner_thread_p(thread) : "! shop_basic_planner_thread.shop_planner_thread_p(thread) " + ("shop_basic_planner_thread.shop_planner_thread_p(thread) " + "CommonSymbols.NIL != shop_basic_planner_thread.shop_planner_thread_p(thread) ") + thread;
        final SubLObject pw = instances.get_slot(thread, shop_basic_planner_thread.P_WRAPPER);
        final SubLObject stats_manager = instances.get_slot(thread, STATS_MANAGER);
        methods.funcall_instance_method_with_0_args(thread, shop_basic_planner_thread.UPDATE_HALT_STATUS);
        methods.funcall_instance_method_with_0_args(stats_manager, shop_basic_planner_thread.STOP_TIMING);
        if (NIL != pw) {
            process_utilities.process_wrapper_block(pw);
        }
        methods.funcall_instance_method_with_0_args(stats_manager, shop_basic_planner_thread.RESUME_TIMING);
        instances.set_slot(thread, HALT_STATUS, NIL);
        return NIL;
    }

    /**
     *
     *
     * @param PW
    process-wrapper-p
     * 		
     * @param THREAD
    shop-basic-planner-thread-p
     * 		
     */
    @LispMethod(comment = "@param PW\nprocess-wrapper-p\r\n\t\t\r\n@param THREAD\nshop-basic-planner-thread-p")
    public static final SubLObject shop_plan_process_set_thread_alt(SubLObject pw, SubLObject thread) {
        return process_utilities.process_wrapper_set_property(pw, $THREAD_STRUCTURE, thread);
    }

    /**
     *
     *
     * @param PW
    process-wrapper-p
     * 		
     * @param THREAD
    shop-basic-planner-thread-p
     * 		
     */
    @LispMethod(comment = "@param PW\nprocess-wrapper-p\r\n\t\t\r\n@param THREAD\nshop-basic-planner-thread-p")
    public static SubLObject shop_plan_process_set_thread(final SubLObject pw, final SubLObject thread) {
        return process_utilities.process_wrapper_set_property(pw, $THREAD_STRUCTURE, thread);
    }

    public static SubLObject declare_shop_basic_planner_thread_file() {
        declareFunction("shop_process_checkpoint", "SHOP-PROCESS-CHECKPOINT", 1, 0, false);
        declareFunction("get_shop_basic_planner_thread_plans_found", "GET-SHOP-BASIC-PLANNER-THREAD-PLANS-FOUND", 1, 0, false);
        declareFunction("set_shop_basic_planner_thread_plans_found", "SET-SHOP-BASIC-PLANNER-THREAD-PLANS-FOUND", 2, 0, false);
        declareFunction("get_shop_basic_planner_thread_plan_number_to_cutoff", "GET-SHOP-BASIC-PLANNER-THREAD-PLAN-NUMBER-TO-CUTOFF", 1, 0, false);
        declareFunction("set_shop_basic_planner_thread_plan_number_to_cutoff", "SET-SHOP-BASIC-PLANNER-THREAD-PLAN-NUMBER-TO-CUTOFF", 2, 0, false);
        declareFunction("get_shop_basic_planner_thread_plan_number", "GET-SHOP-BASIC-PLANNER-THREAD-PLAN-NUMBER", 1, 0, false);
        declareFunction("set_shop_basic_planner_thread_plan_number", "SET-SHOP-BASIC-PLANNER-THREAD-PLAN-NUMBER", 2, 0, false);
        declareFunction("get_shop_basic_planner_thread_number_cutoff", "GET-SHOP-BASIC-PLANNER-THREAD-NUMBER-CUTOFF", 1, 0, false);
        declareFunction("set_shop_basic_planner_thread_number_cutoff", "SET-SHOP-BASIC-PLANNER-THREAD-NUMBER-CUTOFF", 2, 0, false);
        declareFunction("get_shop_basic_planner_thread_depth_cutoff", "GET-SHOP-BASIC-PLANNER-THREAD-DEPTH-CUTOFF", 1, 0, false);
        declareFunction("set_shop_basic_planner_thread_depth_cutoff", "SET-SHOP-BASIC-PLANNER-THREAD-DEPTH-CUTOFF", 2, 0, false);
        declareFunction("get_shop_basic_planner_thread_time_cutoff", "GET-SHOP-BASIC-PLANNER-THREAD-TIME-CUTOFF", 1, 0, false);
        declareFunction("set_shop_basic_planner_thread_time_cutoff", "SET-SHOP-BASIC-PLANNER-THREAD-TIME-CUTOFF", 2, 0, false);
        declareFunction("get_shop_basic_planner_thread_cycle_checking", "GET-SHOP-BASIC-PLANNER-THREAD-CYCLE-CHECKING", 1, 0, false);
        declareFunction("set_shop_basic_planner_thread_cycle_checking", "SET-SHOP-BASIC-PLANNER-THREAD-CYCLE-CHECKING", 2, 0, false);
        declareFunction("get_shop_basic_planner_thread_num_backchains", "GET-SHOP-BASIC-PLANNER-THREAD-NUM-BACKCHAINS", 1, 0, false);
        declareFunction("set_shop_basic_planner_thread_num_backchains", "SET-SHOP-BASIC-PLANNER-THREAD-NUM-BACKCHAINS", 2, 0, false);
        declareFunction("get_shop_basic_planner_thread_which_plans", "GET-SHOP-BASIC-PLANNER-THREAD-WHICH-PLANS", 1, 0, false);
        declareFunction("set_shop_basic_planner_thread_which_plans", "SET-SHOP-BASIC-PLANNER-THREAD-WHICH-PLANS", 2, 0, false);
        declareFunction("get_shop_basic_planner_thread_halt_status", "GET-SHOP-BASIC-PLANNER-THREAD-HALT-STATUS", 1, 0, false);
        declareFunction("set_shop_basic_planner_thread_halt_status", "SET-SHOP-BASIC-PLANNER-THREAD-HALT-STATUS", 2, 0, false);
        declareFunction("get_shop_basic_planner_thread_initial_plan_state", "GET-SHOP-BASIC-PLANNER-THREAD-INITIAL-PLAN-STATE", 1, 0, false);
        declareFunction("set_shop_basic_planner_thread_initial_plan_state", "SET-SHOP-BASIC-PLANNER-THREAD-INITIAL-PLAN-STATE", 2, 0, false);
        declareFunction("get_shop_basic_planner_thread_log", "GET-SHOP-BASIC-PLANNER-THREAD-LOG", 1, 0, false);
        declareFunction("set_shop_basic_planner_thread_log", "SET-SHOP-BASIC-PLANNER-THREAD-LOG", 2, 0, false);
        declareFunction("get_shop_basic_planner_thread_stats_manager", "GET-SHOP-BASIC-PLANNER-THREAD-STATS-MANAGER", 1, 0, false);
        declareFunction("set_shop_basic_planner_thread_stats_manager", "SET-SHOP-BASIC-PLANNER-THREAD-STATS-MANAGER", 2, 0, false);
        declareFunction("get_shop_basic_planner_thread_var_manager", "GET-SHOP-BASIC-PLANNER-THREAD-VAR-MANAGER", 1, 0, false);
        declareFunction("set_shop_basic_planner_thread_var_manager", "SET-SHOP-BASIC-PLANNER-THREAD-VAR-MANAGER", 2, 0, false);
        declareFunction("get_shop_basic_planner_thread_p_wrapper", "GET-SHOP-BASIC-PLANNER-THREAD-P-WRAPPER", 1, 0, false);
        declareFunction("set_shop_basic_planner_thread_p_wrapper", "SET-SHOP-BASIC-PLANNER-THREAD-P-WRAPPER", 2, 0, false);
        declareFunction("get_shop_basic_planner_thread_open_nodes", "GET-SHOP-BASIC-PLANNER-THREAD-OPEN-NODES", 1, 0, false);
        declareFunction("set_shop_basic_planner_thread_open_nodes", "SET-SHOP-BASIC-PLANNER-THREAD-OPEN-NODES", 2, 0, false);
        declareFunction("get_shop_basic_planner_thread_planner", "GET-SHOP-BASIC-PLANNER-THREAD-PLANNER", 1, 0, false);
        declareFunction("set_shop_basic_planner_thread_planner", "SET-SHOP-BASIC-PLANNER-THREAD-PLANNER", 2, 0, false);
        declareFunction("get_shop_basic_planner_thread_axioms", "GET-SHOP-BASIC-PLANNER-THREAD-AXIOMS", 1, 0, false);
        declareFunction("set_shop_basic_planner_thread_axioms", "SET-SHOP-BASIC-PLANNER-THREAD-AXIOMS", 2, 0, false);
        declareFunction("get_shop_basic_planner_thread_problem", "GET-SHOP-BASIC-PLANNER-THREAD-PROBLEM", 1, 0, false);
        declareFunction("set_shop_basic_planner_thread_problem", "SET-SHOP-BASIC-PLANNER-THREAD-PROBLEM", 2, 0, false);
        declareFunction("subloop_reserved_initialize_shop_basic_planner_thread_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-THREAD-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_shop_basic_planner_thread_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-THREAD-INSTANCE", 1, 0, false);
        declareFunction("shop_basic_planner_thread_p", "SHOP-BASIC-PLANNER-THREAD-P", 1, 0, false);
        declareFunction("shop_basic_planner_thread_initialize_method", "SHOP-BASIC-PLANNER-THREAD-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("shop_basic_planner_thread_output_message_method", "SHOP-BASIC-PLANNER-THREAD-OUTPUT-MESSAGE-METHOD", 2, 0, false);
        declareFunction("shop_basic_planner_thread_any_cutoff_reachedP_method", "SHOP-BASIC-PLANNER-THREAD-ANY-CUTOFF-REACHED?-METHOD", 1, 0, false);
        declareFunction("shop_basic_planner_thread_depth_cutoff_reachedP_method", "SHOP-BASIC-PLANNER-THREAD-DEPTH-CUTOFF-REACHED?-METHOD", 2, 0, false);
        declareFunction("shop_basic_planner_thread_time_cutoff_reachedP_method", "SHOP-BASIC-PLANNER-THREAD-TIME-CUTOFF-REACHED?-METHOD", 1, 0, false);
        declareFunction("shop_basic_planner_thread_number_cutoff_reachedP_method", "SHOP-BASIC-PLANNER-THREAD-NUMBER-CUTOFF-REACHED?-METHOD", 1, 0, false);
        declareFunction("shop_basic_planner_thread_cycl_plans_method", "SHOP-BASIC-PLANNER-THREAD-CYCL-PLANS-METHOD", 1, 0, false);
        declareFunction("shop_basic_planner_thread_print_stats_header_method", "SHOP-BASIC-PLANNER-THREAD-PRINT-STATS-HEADER-METHOD", 2, 0, false);
        declareFunction("shop_basic_planner_thread_print_plan_method", "SHOP-BASIC-PLANNER-THREAD-PRINT-PLAN-METHOD", 2, 0, false);
        declareFunction("shop_shorterplan1", "SHOP-SHORTERPLAN1", 1, 0, false);
        declareFunction("shop_basic_planner_thread_print_stats_method", "SHOP-BASIC-PLANNER-THREAD-PRINT-STATS-METHOD", 1, 0, false);
        declareFunction("shop_basic_planner_thread_print_iterative_deepening_stats_method", "SHOP-BASIC-PLANNER-THREAD-PRINT-ITERATIVE-DEEPENING-STATS-METHOD", 2, 0, false);
        declareFunction("shop_basic_planner_thread_html_stats_method", "SHOP-BASIC-PLANNER-THREAD-HTML-STATS-METHOD", 1, 0, false);
        declareFunction("shop_basic_planner_thread_set_problem_method", "SHOP-BASIC-PLANNER-THREAD-SET-PROBLEM-METHOD", 2, 0, false);
        declareFunction("shop_basic_planner_thread_get_problem_method", "SHOP-BASIC-PLANNER-THREAD-GET-PROBLEM-METHOD", 1, 0, false);
        declareFunction("shop_basic_planner_thread_get_domain_method", "SHOP-BASIC-PLANNER-THREAD-GET-DOMAIN-METHOD", 1, 0, false);
        declareFunction("shop_basic_planner_thread_get_which_plans_method", "SHOP-BASIC-PLANNER-THREAD-GET-WHICH-PLANS-METHOD", 1, 0, false);
        declareFunction("shop_basic_planner_thread_set_which_plans_method", "SHOP-BASIC-PLANNER-THREAD-SET-WHICH-PLANS-METHOD", 2, 0, false);
        declareFunction("shop_basic_planner_thread_init_plan_state_method", "SHOP-BASIC-PLANNER-THREAD-INIT-PLAN-STATE-METHOD", 2, 0, false);
        declareFunction("shop_basic_planner_thread_init_planner_thread_method", "SHOP-BASIC-PLANNER-THREAD-INIT-PLANNER-THREAD-METHOD", 7, 0, false);
        declareFunction("shop_basic_planner_thread_found_plan_method", "SHOP-BASIC-PLANNER-THREAD-FOUND-PLAN-METHOD", 2, 0, false);
        declareFunction("shop_basic_planner_thread_halt_status_method", "SHOP-BASIC-PLANNER-THREAD-HALT-STATUS-METHOD", 1, 0, false);
        declareFunction("shop_basic_planner_thread_update_halt_status_method", "SHOP-BASIC-PLANNER-THREAD-UPDATE-HALT-STATUS-METHOD", 1, 0, false);
        declareFunction("shop_basic_planner_thread_seek_plans_method", "SHOP-BASIC-PLANNER-THREAD-SEEK-PLANS-METHOD", 1, 0, false);
        declareFunction("shop_basic_planner_thread_seek_plans_with_iterative_deepening_method", "SHOP-BASIC-PLANNER-THREAD-SEEK-PLANS-WITH-ITERATIVE-DEEPENING-METHOD", 1, 0, false);
        declareFunction("shop_basic_planner_thread_gather_initial_state_method", "SHOP-BASIC-PLANNER-THREAD-GATHER-INITIAL-STATE-METHOD", 2, 0, false);
        declareFunction("shop_basic_planner_thread_make_problem_method", "SHOP-BASIC-PLANNER-THREAD-MAKE-PROBLEM-METHOD", 5, 0, false);
        declareFunction("shop_basic_planner_thread_make_problem_from_formula_method", "SHOP-BASIC-PLANNER-THREAD-MAKE-PROBLEM-FROM-FORMULA-METHOD", 3, 0, false);
        declareFunction("shop_basic_planner_thread_find_plans_method", "SHOP-BASIC-PLANNER-THREAD-FIND-PLANS-METHOD", 3, 5, false);
        declareFunction("shop_basic_planner_thread_completed_runP_method", "SHOP-BASIC-PLANNER-THREAD-COMPLETED-RUN?-METHOD", 1, 0, false);
        declareFunction("shop_basic_planner_thread_summary_method", "SHOP-BASIC-PLANNER-THREAD-SUMMARY-METHOD", 1, 0, false);
        declareFunction("shop_basic_planner_thread_html_display_summary_method", "SHOP-BASIC-PLANNER-THREAD-HTML-DISPLAY-SUMMARY-METHOD", 2, 0, false);
        declareMacro("mapcar_method", "MAPCAR-METHOD");
        declareFunction("shop_plan_cost", "SHOP-PLAN-COST", 1, 0, false);
        declareFunction("shop_reifiable_natP", "SHOP-REIFIABLE-NAT?", 1, 0, false);
        declareFunction("shop_reify_narts_in_expression", "SHOP-REIFY-NARTS-IN-EXPRESSION", 1, 0, false);
        declareFunction("shop_planner_thread_p", "SHOP-PLANNER-THREAD-P", 1, 0, false);
        declareFunction("shop_planner_thread_plans_found", "SHOP-PLANNER-THREAD-PLANS-FOUND", 1, 0, false);
        declareFunction("shop_planner_thread_num_plans_found", "SHOP-PLANNER-THREAD-NUM-PLANS-FOUND", 1, 0, false);
        declareFunction("shop_planner_thread_num_open_nodes", "SHOP-PLANNER-THREAD-NUM-OPEN-NODES", 1, 0, false);
        declareFunction("shop_planner_thread_num_inferences", "SHOP-PLANNER-THREAD-NUM-INFERENCES", 1, 0, false);
        declareFunction("shop_planner_thread_nodes_expanded", "SHOP-PLANNER-THREAD-NODES-EXPANDED", 1, 0, false);
        declareFunction("shop_planner_thread_task", "SHOP-PLANNER-THREAD-TASK", 1, 0, false);
        declareFunction("shop_planner_thread_pause", "SHOP-PLANNER-THREAD-PAUSE", 1, 0, false);
        declareFunction("shop_plan_process_set_thread", "SHOP-PLAN-PROCESS-SET-THREAD", 2, 0, false);
        return NIL;
    }

    static private final SubLString $str_alt80$___12_a_8_a_8_a_11_s_11_s_10_3f_1 = makeString("~%~12@a~8@a~8@a~11@s~11@s~10,3f~11,3f");

    static private final SubLString $str_alt83$_ = makeString("-");

    static private final SubLList $list_alt87 = list(makeSymbol("DEPTH"));

    static private final SubLList $list_alt88 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PLANS"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")))), list(makeSymbol("TASKS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("NUMBER-OF-EXPANSIONS")))), list(makeSymbol("INFERENCES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("NUMBER-OF-INFERENCES")))), list(makeSymbol("RUN-TIME"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("ELAPSED-RUN-TIME-SINCE-LAST-CALL")))), list(makeSymbol("REAL-TIME"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("ELAPSED-REAL-TIME-SINCE-LAST-CALL"))))), list(makeSymbol("OUTPUT-MESSAGE"), makeSymbol("SELF"), list(new SubLObject[]{ makeSymbol("FORMAT"), NIL, makeString("~%~6@a~6@a~8@a~8@a~11@s~11@s~10,3f~11,3f"), makeSymbol("DEPTH"), list(makeSymbol("LENGTH"), makeSymbol("PLANS")), list(makeSymbol("FIF"), makeSymbol("PLANS"), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("MIN")), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("SHOP-PLAN-COST")), makeSymbol("PLANS"))), makeString("-")), list(makeSymbol("FIF"), makeSymbol("PLANS"), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("MAX")), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("SHOP-PLAN-COST")), makeSymbol("PLANS"))), makeString("-")), makeSymbol("TASKS"), makeSymbol("INFERENCES"), list(makeSymbol("/"), makeSymbol("RUN-TIME"), makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*")), list(makeSymbol("/"), makeSymbol("REAL-TIME"), makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*")) })), list(RET, NIL)));

    static private final SubLString $str_alt92$___6_a_6_a_8_a_8_a_11_s_11_s_10_3 = makeString("~%~6@a~6@a~8@a~8@a~11@s~11@s~10,3f~11,3f");

    static private final SubLList $list_alt95 = list(makeString("Displays in HTML an informative summary of the last planner run\n   on this thread."), list(makeSymbol("CLET"), list(list(makeSymbol("PLANS"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")))), list(makeSymbol("NUM-PLANS"), list(makeSymbol("LENGTH"), makeSymbol("PLANS"))), list(makeSymbol("TASKS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("NUMBER-OF-EXPANSIONS")))), list(makeSymbol("INFERENCES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("NUMBER-OF-INFERENCES")))), list(makeSymbol("RUN-TIME"), list(makeSymbol("/"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("ELAPSED-RUN-TIME"))), makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*"))), list(makeSymbol("REAL-TIME"), list(makeSymbol("/"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("ELAPSED-REAL-TIME"))), makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*")))), list(makeSymbol("HTML-FANCY-TABLE"), list(makeKeyword("CELLPADDING"), FIVE_INTEGER, makeKeyword("CELLSPACING"), ZERO_INTEGER, makeKeyword("BORDER"), ZERO_INTEGER), list(makeSymbol("HTML-TABLE-ROW"), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("Plans")))), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("MinCost")))), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("MaxCost")))), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("Expansions")))), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("Inferences")))), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("CPU Time")))), list(makeSymbol("HTML-TABLE-DATA"), list(makeSymbol("HTML-STRONG"), list(makeSymbol("HTML-PRINC"), makeString("Real Time"))))), list(makeSymbol("HTML-TABLE-ROW"), list(makeSymbol("HTML-FANCY-TABLE-DATA"), list(makeKeyword("ALIGN"), makeKeyword("RIGHT")), list(makeSymbol("HTML-PRINC"), makeSymbol("NUM-PLANS"))), list(makeSymbol("HTML-FANCY-TABLE-DATA"), list(makeKeyword("ALIGN"), makeKeyword("RIGHT")), list(makeSymbol("HTML-PRINC"), list(makeSymbol("FIF"), makeSymbol("PLANS"), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("MIN")), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("SHOP-PLAN-COST")), makeSymbol("PLANS"))), makeString("-")))), list(makeSymbol("HTML-FANCY-TABLE-DATA"), list(makeKeyword("ALIGN"), makeKeyword("RIGHT")), list(makeSymbol("HTML-PRINC"), list(makeSymbol("FIF"), makeSymbol("PLANS"), list(makeSymbol("APPLY"), list(makeSymbol("FUNCTION"), makeSymbol("MAX")), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("SHOP-PLAN-COST")), makeSymbol("PLANS"))), makeString("-")))), list(makeSymbol("HTML-FANCY-TABLE-DATA"), list(makeKeyword("ALIGN"), makeKeyword("RIGHT")), list(makeSymbol("HTML-PRINC"), makeSymbol("TASKS"))), list(makeSymbol("HTML-FANCY-TABLE-DATA"), list(makeKeyword("ALIGN"), makeKeyword("RIGHT")), list(makeSymbol("HTML-PRINC"), makeSymbol("INFERENCES"))), list(makeSymbol("HTML-FANCY-TABLE-DATA"), list(makeKeyword("ALIGN"), makeKeyword("RIGHT")), list(makeSymbol("HTML-PRINC"), makeSymbol("RUN-TIME"))), list(makeSymbol("HTML-FANCY-TABLE-DATA"), list(makeKeyword("ALIGN"), makeKeyword("RIGHT")), list(makeSymbol("HTML-PRINC"), makeSymbol("REAL-TIME"))))), list(RET, NIL)));

    static private final SubLList $list_alt109 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt110 = list(makeSymbol("D"));

    static private final SubLList $list_alt111 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("D"), makeSymbol("INTEGERP")), list(makeSymbol("CSETQ"), makeSymbol("PROBLEM"), makeSymbol("D")), list(RET, makeSymbol("D")));

    static private final SubLList $list_alt116 = list(list(RET, makeSymbol("PROBLEM")));

    static private final SubLList $list_alt120 = list(list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-DOMAIN"), makeSymbol("SHOP-BASIC-PROBLEM")), makeSymbol("PROBLEM"))));

    static private final SubLList $list_alt124 = list(list(RET, makeSymbol("WHICH-PLANS")));

    static private final SubLList $list_alt128 = list(makeSymbol("W"));

    static private final SubLList $list_alt129 = list(list(makeSymbol("CSETQ"), makeSymbol("WHICH-PLANS"), makeSymbol("W")), list(RET, makeSymbol("W")));

    public static SubLObject init_shop_basic_planner_thread_file() {
        return NIL;
    }

    public static final SubLObject setup_shop_basic_planner_thread_file_alt() {
        classes.subloop_new_class(SHOP_BASIC_PLANNER_THREAD, OBJECT, NIL, NIL, $list_alt6);
        classes.class_set_implements_slot_listeners(SHOP_BASIC_PLANNER_THREAD, NIL);
        classes.subloop_note_class_initialization_function(SHOP_BASIC_PLANNER_THREAD, SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_THREAD_CLASS);
        classes.subloop_note_instance_initialization_function(SHOP_BASIC_PLANNER_THREAD, SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_THREAD_INSTANCE);
        com.cyc.cycjava.cycl.shop_basic_planner_thread.subloop_reserved_initialize_shop_basic_planner_thread_class(SHOP_BASIC_PLANNER_THREAD);
        methods.methods_incorporate_instance_method(INITIALIZE, SHOP_BASIC_PLANNER_THREAD, $list_alt30, NIL, $list_alt31);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, INITIALIZE, SHOP_BASIC_PLANNER_THREAD_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(OUTPUT_MESSAGE, SHOP_BASIC_PLANNER_THREAD, $list_alt38, $list_alt39, $list_alt40);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, OUTPUT_MESSAGE, SHOP_BASIC_PLANNER_THREAD_OUTPUT_MESSAGE_METHOD);
        methods.methods_incorporate_instance_method($sym43$ANY_CUTOFF_REACHED_, SHOP_BASIC_PLANNER_THREAD, $list_alt30, NIL, $list_alt44);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, $sym43$ANY_CUTOFF_REACHED_, $sym46$SHOP_BASIC_PLANNER_THREAD_ANY_CUTOFF_REACHED__METHOD);
        methods.methods_incorporate_instance_method($sym47$DEPTH_CUTOFF_REACHED_, SHOP_BASIC_PLANNER_THREAD, $list_alt38, $list_alt48, $list_alt49);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, $sym47$DEPTH_CUTOFF_REACHED_, $sym52$SHOP_BASIC_PLANNER_THREAD_DEPTH_CUTOFF_REACHED__METHOD);
        methods.methods_incorporate_instance_method($sym53$TIME_CUTOFF_REACHED_, SHOP_BASIC_PLANNER_THREAD, $list_alt38, NIL, $list_alt54);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, $sym53$TIME_CUTOFF_REACHED_, $sym56$SHOP_BASIC_PLANNER_THREAD_TIME_CUTOFF_REACHED__METHOD);
        methods.methods_incorporate_instance_method($sym57$NUMBER_CUTOFF_REACHED_, SHOP_BASIC_PLANNER_THREAD, $list_alt38, NIL, $list_alt58);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, $sym57$NUMBER_CUTOFF_REACHED_, $sym60$SHOP_BASIC_PLANNER_THREAD_NUMBER_CUTOFF_REACHED__METHOD);
        methods.methods_incorporate_instance_method(CYCL_PLANS, SHOP_BASIC_PLANNER_THREAD, $list_alt30, NIL, $list_alt62);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, CYCL_PLANS, SHOP_BASIC_PLANNER_THREAD_CYCL_PLANS_METHOD);
        methods.methods_incorporate_instance_method(PRINT_STATS_HEADER, SHOP_BASIC_PLANNER_THREAD, $list_alt30, $list_alt66, $list_alt67);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, PRINT_STATS_HEADER, SHOP_BASIC_PLANNER_THREAD_PRINT_STATS_HEADER_METHOD);
        methods.methods_incorporate_instance_method(PRINT_PLAN, SHOP_BASIC_PLANNER_THREAD, $list_alt30, $list_alt71, $list_alt72);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, PRINT_PLAN, SHOP_BASIC_PLANNER_THREAD_PRINT_PLAN_METHOD);
        methods.methods_incorporate_instance_method(PRINT_STATS, SHOP_BASIC_PLANNER_THREAD, $list_alt30, NIL, $list_alt76);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, PRINT_STATS, SHOP_BASIC_PLANNER_THREAD_PRINT_STATS_METHOD);
        methods.methods_incorporate_instance_method(PRINT_ITERATIVE_DEEPENING_STATS, SHOP_BASIC_PLANNER_THREAD, $list_alt30, $list_alt87, $list_alt88);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, PRINT_ITERATIVE_DEEPENING_STATS, SHOP_BASIC_PLANNER_THREAD_PRINT_ITERATIVE_DEEPENING_STATS_METHOD);
        methods.methods_incorporate_instance_method(HTML_STATS, SHOP_BASIC_PLANNER_THREAD, $list_alt30, NIL, $list_alt95);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, HTML_STATS, SHOP_BASIC_PLANNER_THREAD_HTML_STATS_METHOD);
        methods.methods_incorporate_instance_method(SET_PROBLEM, SHOP_BASIC_PLANNER_THREAD, $list_alt109, $list_alt110, $list_alt111);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, SET_PROBLEM, SHOP_BASIC_PLANNER_THREAD_SET_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method(GET_PROBLEM, SHOP_BASIC_PLANNER_THREAD, $list_alt30, NIL, $list_alt116);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, GET_PROBLEM, SHOP_BASIC_PLANNER_THREAD_GET_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method(GET_DOMAIN, SHOP_BASIC_PLANNER_THREAD, $list_alt30, NIL, $list_alt120);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, GET_DOMAIN, SHOP_BASIC_PLANNER_THREAD_GET_DOMAIN_METHOD);
        methods.methods_incorporate_instance_method(GET_WHICH_PLANS, SHOP_BASIC_PLANNER_THREAD, $list_alt30, NIL, $list_alt124);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, GET_WHICH_PLANS, SHOP_BASIC_PLANNER_THREAD_GET_WHICH_PLANS_METHOD);
        methods.methods_incorporate_instance_method(SET_WHICH_PLANS, SHOP_BASIC_PLANNER_THREAD, $list_alt109, $list_alt128, $list_alt129);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, SET_WHICH_PLANS, SHOP_BASIC_PLANNER_THREAD_SET_WHICH_PLANS_METHOD);
        methods.methods_incorporate_instance_method(INIT_PLAN_STATE, SHOP_BASIC_PLANNER_THREAD, $list_alt133, $list_alt134, $list_alt135);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, INIT_PLAN_STATE, SHOP_BASIC_PLANNER_THREAD_INIT_PLAN_STATE_METHOD);
        methods.methods_incorporate_instance_method(INIT_PLANNER_THREAD, SHOP_BASIC_PLANNER_THREAD, $list_alt133, $list_alt139, $list_alt140);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, INIT_PLANNER_THREAD, SHOP_BASIC_PLANNER_THREAD_INIT_PLANNER_THREAD_METHOD);
        methods.methods_incorporate_instance_method(FOUND_PLAN, SHOP_BASIC_PLANNER_THREAD, $list_alt133, $list_alt48, $list_alt144);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, FOUND_PLAN, SHOP_BASIC_PLANNER_THREAD_FOUND_PLAN_METHOD);
        methods.methods_incorporate_instance_method(HALT_STATUS, SHOP_BASIC_PLANNER_THREAD, $list_alt30, NIL, $list_alt156);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, HALT_STATUS, SHOP_BASIC_PLANNER_THREAD_HALT_STATUS_METHOD);
        methods.methods_incorporate_instance_method(UPDATE_HALT_STATUS, SHOP_BASIC_PLANNER_THREAD, $list_alt133, NIL, $list_alt160);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, UPDATE_HALT_STATUS, SHOP_BASIC_PLANNER_THREAD_UPDATE_HALT_STATUS_METHOD);
        methods.methods_incorporate_instance_method(SEEK_PLANS, SHOP_BASIC_PLANNER_THREAD, $list_alt133, NIL, $list_alt167);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, SEEK_PLANS, SHOP_BASIC_PLANNER_THREAD_SEEK_PLANS_METHOD);
        methods.methods_incorporate_instance_method(SEEK_PLANS_WITH_ITERATIVE_DEEPENING, SHOP_BASIC_PLANNER_THREAD, $list_alt38, NIL, $list_alt171);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, SEEK_PLANS_WITH_ITERATIVE_DEEPENING, $sym178$SHOP_BASIC_PLANNER_THREAD_SEEK_PLANS_WITH_ITERATIVE_DEEPENING_MET);
        methods.methods_incorporate_instance_method(GATHER_INITIAL_STATE, SHOP_BASIC_PLANNER_THREAD, $list_alt38, $list_alt180, $list_alt181);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, GATHER_INITIAL_STATE, SHOP_BASIC_PLANNER_THREAD_GATHER_INITIAL_STATE_METHOD);
        methods.methods_incorporate_instance_method(MAKE_PROBLEM, SHOP_BASIC_PLANNER_THREAD, $list_alt30, $list_alt202, $list_alt203);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, MAKE_PROBLEM, SHOP_BASIC_PLANNER_THREAD_MAKE_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method(MAKE_PROBLEM_FROM_FORMULA, SHOP_BASIC_PLANNER_THREAD, $list_alt30, $list_alt211, $list_alt212);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, MAKE_PROBLEM_FROM_FORMULA, SHOP_BASIC_PLANNER_THREAD_MAKE_PROBLEM_FROM_FORMULA_METHOD);
        methods.methods_incorporate_instance_method(FIND_PLANS, SHOP_BASIC_PLANNER_THREAD, $list_alt215, $list_alt216, $list_alt217);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, FIND_PLANS, SHOP_BASIC_PLANNER_THREAD_FIND_PLANS_METHOD);
        methods.methods_incorporate_instance_method($sym225$COMPLETED_RUN_, SHOP_BASIC_PLANNER_THREAD, $list_alt30, NIL, $list_alt226);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, $sym225$COMPLETED_RUN_, $sym228$SHOP_BASIC_PLANNER_THREAD_COMPLETED_RUN__METHOD);
        methods.methods_incorporate_instance_method(SUMMARY, SHOP_BASIC_PLANNER_THREAD, $list_alt30, NIL, $list_alt230);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, SUMMARY, SHOP_BASIC_PLANNER_THREAD_SUMMARY_METHOD);
        methods.methods_incorporate_instance_method(HTML_DISPLAY_SUMMARY, SHOP_BASIC_PLANNER_THREAD, $list_alt30, $list_alt235, $list_alt236);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, HTML_DISPLAY_SUMMARY, SHOP_BASIC_PLANNER_THREAD_HTML_DISPLAY_SUMMARY_METHOD);
        return NIL;
    }

    public static SubLObject setup_shop_basic_planner_thread_file() {
        if (SubLFiles.USE_V1) {
            classes.subloop_new_class(SHOP_BASIC_PLANNER_THREAD, OBJECT, NIL, NIL, shop_basic_planner_thread.$list6);
            classes.class_set_implements_slot_listeners(SHOP_BASIC_PLANNER_THREAD, NIL);
            classes.subloop_note_class_initialization_function(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_THREAD_CLASS);
            classes.subloop_note_instance_initialization_function(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_THREAD_INSTANCE);
            shop_basic_planner_thread.subloop_reserved_initialize_shop_basic_planner_thread_class(SHOP_BASIC_PLANNER_THREAD);
            methods.methods_incorporate_instance_method(INITIALIZE, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, NIL, shop_basic_planner_thread.$list31);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, INITIALIZE, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_INITIALIZE_METHOD);
            methods.methods_incorporate_instance_method(OUTPUT_MESSAGE, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list38, shop_basic_planner_thread.$list39, shop_basic_planner_thread.$list40);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, OUTPUT_MESSAGE, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_OUTPUT_MESSAGE_METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.$sym43$ANY_CUTOFF_REACHED_, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, NIL, shop_basic_planner_thread.$list44);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$sym43$ANY_CUTOFF_REACHED_, shop_basic_planner_thread.$sym46$SHOP_BASIC_PLANNER_THREAD_ANY_CUTOFF_REACHED__METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.$sym47$DEPTH_CUTOFF_REACHED_, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list38, shop_basic_planner_thread.$list48, shop_basic_planner_thread.$list49);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$sym47$DEPTH_CUTOFF_REACHED_, shop_basic_planner_thread.$sym52$SHOP_BASIC_PLANNER_THREAD_DEPTH_CUTOFF_REACHED__METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.$sym53$TIME_CUTOFF_REACHED_, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list38, NIL, shop_basic_planner_thread.$list54);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$sym53$TIME_CUTOFF_REACHED_, shop_basic_planner_thread.$sym56$SHOP_BASIC_PLANNER_THREAD_TIME_CUTOFF_REACHED__METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.$sym57$NUMBER_CUTOFF_REACHED_, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list38, NIL, shop_basic_planner_thread.$list58);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$sym57$NUMBER_CUTOFF_REACHED_, shop_basic_planner_thread.$sym60$SHOP_BASIC_PLANNER_THREAD_NUMBER_CUTOFF_REACHED__METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.CYCL_PLANS, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, NIL, shop_basic_planner_thread.$list62);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.CYCL_PLANS, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_CYCL_PLANS_METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.PRINT_STATS_HEADER, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, shop_basic_planner_thread.$list66, shop_basic_planner_thread.$list67);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.PRINT_STATS_HEADER, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_PRINT_STATS_HEADER_METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.PRINT_PLAN, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, shop_basic_planner_thread.$list71, shop_basic_planner_thread.$list72);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.PRINT_PLAN, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_PRINT_PLAN_METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.PRINT_STATS, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, NIL, shop_basic_planner_thread.$list76);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.PRINT_STATS, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_PRINT_STATS_METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.PRINT_ITERATIVE_DEEPENING_STATS, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, shop_basic_planner_thread.$list87, shop_basic_planner_thread.$list88);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.PRINT_ITERATIVE_DEEPENING_STATS, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_PRINT_ITERATIVE_DEEPENING_STATS_METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.HTML_STATS, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, NIL, shop_basic_planner_thread.$list95);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.HTML_STATS, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_HTML_STATS_METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.SET_PROBLEM, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list109, shop_basic_planner_thread.$list110, shop_basic_planner_thread.$list111);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.SET_PROBLEM, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_SET_PROBLEM_METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.GET_PROBLEM, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, NIL, shop_basic_planner_thread.$list116);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.GET_PROBLEM, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_GET_PROBLEM_METHOD);
            methods.methods_incorporate_instance_method(GET_DOMAIN, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, NIL, shop_basic_planner_thread.$list120);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, GET_DOMAIN, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_GET_DOMAIN_METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.GET_WHICH_PLANS, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, NIL, shop_basic_planner_thread.$list124);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.GET_WHICH_PLANS, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_GET_WHICH_PLANS_METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.SET_WHICH_PLANS, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list109, shop_basic_planner_thread.$list128, shop_basic_planner_thread.$list129);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.SET_WHICH_PLANS, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_SET_WHICH_PLANS_METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.INIT_PLAN_STATE, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list133, shop_basic_planner_thread.$list134, shop_basic_planner_thread.$list135);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.INIT_PLAN_STATE, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_INIT_PLAN_STATE_METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.INIT_PLANNER_THREAD, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list133, shop_basic_planner_thread.$list139, shop_basic_planner_thread.$list140);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.INIT_PLANNER_THREAD, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_INIT_PLANNER_THREAD_METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.FOUND_PLAN, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list133, shop_basic_planner_thread.$list48, shop_basic_planner_thread.$list144);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.FOUND_PLAN, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_FOUND_PLAN_METHOD);
            methods.methods_incorporate_instance_method(HALT_STATUS, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, NIL, shop_basic_planner_thread.$list156);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, HALT_STATUS, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_HALT_STATUS_METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.UPDATE_HALT_STATUS, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list133, NIL, shop_basic_planner_thread.$list160);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.UPDATE_HALT_STATUS, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_UPDATE_HALT_STATUS_METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.SEEK_PLANS, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list133, NIL, shop_basic_planner_thread.$list167);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.SEEK_PLANS, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_SEEK_PLANS_METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.SEEK_PLANS_WITH_ITERATIVE_DEEPENING, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list38, NIL, shop_basic_planner_thread.$list171);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.SEEK_PLANS_WITH_ITERATIVE_DEEPENING, shop_basic_planner_thread.$sym178$SHOP_BASIC_PLANNER_THREAD_SEEK_PLANS_WITH_ITERATIVE_DEEPENING_MET);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.GATHER_INITIAL_STATE, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list38, shop_basic_planner_thread.$list180, shop_basic_planner_thread.$list181);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.GATHER_INITIAL_STATE, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_GATHER_INITIAL_STATE_METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.MAKE_PROBLEM, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, shop_basic_planner_thread.$list203, shop_basic_planner_thread.$list204);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.MAKE_PROBLEM, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_MAKE_PROBLEM_METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.MAKE_PROBLEM_FROM_FORMULA, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, shop_basic_planner_thread.$list212, shop_basic_planner_thread.$list213);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.MAKE_PROBLEM_FROM_FORMULA, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_MAKE_PROBLEM_FROM_FORMULA_METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.FIND_PLANS, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list216, shop_basic_planner_thread.$list217, shop_basic_planner_thread.$list218);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.FIND_PLANS, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_FIND_PLANS_METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.$sym226$COMPLETED_RUN_, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, NIL, shop_basic_planner_thread.$list227);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$sym226$COMPLETED_RUN_, shop_basic_planner_thread.$sym229$SHOP_BASIC_PLANNER_THREAD_COMPLETED_RUN__METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.SUMMARY, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, NIL, shop_basic_planner_thread.$list231);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.SUMMARY, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_SUMMARY_METHOD);
            methods.methods_incorporate_instance_method(shop_basic_planner_thread.HTML_DISPLAY_SUMMARY, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, shop_basic_planner_thread.$list236, shop_basic_planner_thread.$list237);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.HTML_DISPLAY_SUMMARY, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_HTML_DISPLAY_SUMMARY_METHOD);
        }
        if (SubLFiles.USE_V2) {
            methods.methods_incorporate_instance_method(MAKE_PROBLEM, SHOP_BASIC_PLANNER_THREAD, $list_alt30, $list_alt202, $list_alt203);
            methods.methods_incorporate_instance_method(MAKE_PROBLEM_FROM_FORMULA, SHOP_BASIC_PLANNER_THREAD, $list_alt30, $list_alt211, $list_alt212);
            methods.methods_incorporate_instance_method(FIND_PLANS, SHOP_BASIC_PLANNER_THREAD, $list_alt215, $list_alt216, $list_alt217);
            methods.methods_incorporate_instance_method($sym225$COMPLETED_RUN_, SHOP_BASIC_PLANNER_THREAD, $list_alt30, NIL, $list_alt226);
            methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, $sym225$COMPLETED_RUN_, $sym228$SHOP_BASIC_PLANNER_THREAD_COMPLETED_RUN__METHOD);
            methods.methods_incorporate_instance_method(SUMMARY, SHOP_BASIC_PLANNER_THREAD, $list_alt30, NIL, $list_alt230);
            methods.methods_incorporate_instance_method(HTML_DISPLAY_SUMMARY, SHOP_BASIC_PLANNER_THREAD, $list_alt30, $list_alt235, $list_alt236);
        }
        return NIL;
    }

    public static SubLObject setup_shop_basic_planner_thread_file_Previous() {
        classes.subloop_new_class(SHOP_BASIC_PLANNER_THREAD, OBJECT, NIL, NIL, shop_basic_planner_thread.$list6);
        classes.class_set_implements_slot_listeners(SHOP_BASIC_PLANNER_THREAD, NIL);
        classes.subloop_note_class_initialization_function(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_THREAD_CLASS);
        classes.subloop_note_instance_initialization_function(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_THREAD_INSTANCE);
        shop_basic_planner_thread.subloop_reserved_initialize_shop_basic_planner_thread_class(SHOP_BASIC_PLANNER_THREAD);
        methods.methods_incorporate_instance_method(INITIALIZE, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, NIL, shop_basic_planner_thread.$list31);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, INITIALIZE, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(OUTPUT_MESSAGE, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list38, shop_basic_planner_thread.$list39, shop_basic_planner_thread.$list40);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, OUTPUT_MESSAGE, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_OUTPUT_MESSAGE_METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.$sym43$ANY_CUTOFF_REACHED_, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, NIL, shop_basic_planner_thread.$list44);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$sym43$ANY_CUTOFF_REACHED_, shop_basic_planner_thread.$sym46$SHOP_BASIC_PLANNER_THREAD_ANY_CUTOFF_REACHED__METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.$sym47$DEPTH_CUTOFF_REACHED_, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list38, shop_basic_planner_thread.$list48, shop_basic_planner_thread.$list49);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$sym47$DEPTH_CUTOFF_REACHED_, shop_basic_planner_thread.$sym52$SHOP_BASIC_PLANNER_THREAD_DEPTH_CUTOFF_REACHED__METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.$sym53$TIME_CUTOFF_REACHED_, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list38, NIL, shop_basic_planner_thread.$list54);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$sym53$TIME_CUTOFF_REACHED_, shop_basic_planner_thread.$sym56$SHOP_BASIC_PLANNER_THREAD_TIME_CUTOFF_REACHED__METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.$sym57$NUMBER_CUTOFF_REACHED_, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list38, NIL, shop_basic_planner_thread.$list58);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$sym57$NUMBER_CUTOFF_REACHED_, shop_basic_planner_thread.$sym60$SHOP_BASIC_PLANNER_THREAD_NUMBER_CUTOFF_REACHED__METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.CYCL_PLANS, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, NIL, shop_basic_planner_thread.$list62);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.CYCL_PLANS, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_CYCL_PLANS_METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.PRINT_STATS_HEADER, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, shop_basic_planner_thread.$list66, shop_basic_planner_thread.$list67);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.PRINT_STATS_HEADER, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_PRINT_STATS_HEADER_METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.PRINT_PLAN, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, shop_basic_planner_thread.$list71, shop_basic_planner_thread.$list72);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.PRINT_PLAN, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_PRINT_PLAN_METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.PRINT_STATS, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, NIL, shop_basic_planner_thread.$list76);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.PRINT_STATS, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_PRINT_STATS_METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.PRINT_ITERATIVE_DEEPENING_STATS, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, shop_basic_planner_thread.$list87, shop_basic_planner_thread.$list88);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.PRINT_ITERATIVE_DEEPENING_STATS, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_PRINT_ITERATIVE_DEEPENING_STATS_METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.HTML_STATS, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, NIL, shop_basic_planner_thread.$list95);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.HTML_STATS, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_HTML_STATS_METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.SET_PROBLEM, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list109, shop_basic_planner_thread.$list110, shop_basic_planner_thread.$list111);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.SET_PROBLEM, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_SET_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.GET_PROBLEM, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, NIL, shop_basic_planner_thread.$list116);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.GET_PROBLEM, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_GET_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method(GET_DOMAIN, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, NIL, shop_basic_planner_thread.$list120);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, GET_DOMAIN, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_GET_DOMAIN_METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.GET_WHICH_PLANS, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, NIL, shop_basic_planner_thread.$list124);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.GET_WHICH_PLANS, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_GET_WHICH_PLANS_METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.SET_WHICH_PLANS, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list109, shop_basic_planner_thread.$list128, shop_basic_planner_thread.$list129);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.SET_WHICH_PLANS, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_SET_WHICH_PLANS_METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.INIT_PLAN_STATE, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list133, shop_basic_planner_thread.$list134, shop_basic_planner_thread.$list135);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.INIT_PLAN_STATE, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_INIT_PLAN_STATE_METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.INIT_PLANNER_THREAD, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list133, shop_basic_planner_thread.$list139, shop_basic_planner_thread.$list140);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.INIT_PLANNER_THREAD, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_INIT_PLANNER_THREAD_METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.FOUND_PLAN, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list133, shop_basic_planner_thread.$list48, shop_basic_planner_thread.$list144);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.FOUND_PLAN, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_FOUND_PLAN_METHOD);
        methods.methods_incorporate_instance_method(HALT_STATUS, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, NIL, shop_basic_planner_thread.$list156);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, HALT_STATUS, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_HALT_STATUS_METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.UPDATE_HALT_STATUS, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list133, NIL, shop_basic_planner_thread.$list160);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.UPDATE_HALT_STATUS, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_UPDATE_HALT_STATUS_METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.SEEK_PLANS, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list133, NIL, shop_basic_planner_thread.$list167);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.SEEK_PLANS, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_SEEK_PLANS_METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.SEEK_PLANS_WITH_ITERATIVE_DEEPENING, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list38, NIL, shop_basic_planner_thread.$list171);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.SEEK_PLANS_WITH_ITERATIVE_DEEPENING, shop_basic_planner_thread.$sym178$SHOP_BASIC_PLANNER_THREAD_SEEK_PLANS_WITH_ITERATIVE_DEEPENING_MET);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.GATHER_INITIAL_STATE, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list38, shop_basic_planner_thread.$list180, shop_basic_planner_thread.$list181);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.GATHER_INITIAL_STATE, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_GATHER_INITIAL_STATE_METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.MAKE_PROBLEM, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, shop_basic_planner_thread.$list203, shop_basic_planner_thread.$list204);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.MAKE_PROBLEM, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_MAKE_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.MAKE_PROBLEM_FROM_FORMULA, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, shop_basic_planner_thread.$list212, shop_basic_planner_thread.$list213);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.MAKE_PROBLEM_FROM_FORMULA, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_MAKE_PROBLEM_FROM_FORMULA_METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.FIND_PLANS, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list216, shop_basic_planner_thread.$list217, shop_basic_planner_thread.$list218);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.FIND_PLANS, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_FIND_PLANS_METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.$sym226$COMPLETED_RUN_, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, NIL, shop_basic_planner_thread.$list227);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$sym226$COMPLETED_RUN_, shop_basic_planner_thread.$sym229$SHOP_BASIC_PLANNER_THREAD_COMPLETED_RUN__METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.SUMMARY, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, NIL, shop_basic_planner_thread.$list231);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.SUMMARY, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_SUMMARY_METHOD);
        methods.methods_incorporate_instance_method(shop_basic_planner_thread.HTML_DISPLAY_SUMMARY, SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.$list30, shop_basic_planner_thread.$list236, shop_basic_planner_thread.$list237);
        methods.subloop_register_instance_method(SHOP_BASIC_PLANNER_THREAD, shop_basic_planner_thread.HTML_DISPLAY_SUMMARY, shop_basic_planner_thread.SHOP_BASIC_PLANNER_THREAD_HTML_DISPLAY_SUMMARY_METHOD);
        return NIL;
    }

    static private final SubLList $list_alt133 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PRIVATE"));

    static private final SubLList $list_alt134 = list(makeSymbol("PROBLEM"));

    static private final SubLList $list_alt135 = list(makeString("@param PROBLEM shop-problem-p"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PROBLEM")), makeSymbol("PROBLEM")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("INITIAL-PLAN-STATE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-BASIC-PLAN-STATE")), list(QUOTE, makeSymbol("SHOP-BASIC-PLAN-STATE")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("INITIALIZE-PLAN-STATE-WITH-PROBLEM"), makeSymbol("SHOP-BASIC-PLAN-STATE")), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("INITIAL-PLAN-STATE"))), makeSymbol("PROBLEM"), makeSymbol("SELF")), list(RET, NIL));

    static private final SubLList $list_alt139 = list(makeSymbol("NEW-PROBLEM"), makeSymbol("WHICH"), makeSymbol("VERBOSE"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt140 = list(new SubLObject[]{ makeString("called each time by FIND-PLANS. The first time, it sets up the INITIAL-PLAN-STATE\n   so the search can begin. Thereafter, when it is called by FIND-PLANS as part\n   of a search continuation. it resets the search-cutoffs, so that search can continue."), list(makeSymbol("PWHEN"), makeSymbol("DEPTH"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DEPTH-CUTOFF")), makeSymbol("DEPTH"))), list(makeSymbol("PWHEN"), makeSymbol("TIME"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("TIME-CUTOFF")), list(makeSymbol("*"), makeSymbol("TIME"), makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*")))), list(makeSymbol("PWHEN"), makeSymbol("NUMBER"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NUMBER-CUTOFF")), makeSymbol("NUMBER"))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("WHICH-PLANS")), makeSymbol("WHICH")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLAN-NUMBER")), ZERO_INTEGER), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLAN-NUMBER-TO-CUTOFF")), ZERO_INTEGER), list(makeSymbol("FIM"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LOG"))), list(QUOTE, makeSymbol("SET-VERBOSITY")), makeSymbol("VERBOSE")), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PROBLEM"))), list(makeSymbol("INIT-PLAN-STATE"), makeSymbol("SELF"), makeSymbol("NEW-PROBLEM")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("OPEN-NODES")), list(makeSymbol("LIST"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("INITIAL-PLAN-STATE")))))), list(RET, NIL) });

    static private final SubLList $list_alt144 = list(makeString("@param PLAN-STATE shop-basic-plan-state-p \n   @return booleanp\n   FOUND-PLAN is called\n   when a PLAN-STATE has found a plan that satisfies the original\n   task. The plan is recorded with the state of the thread, and the\n   search continues.  Returns NIL."), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLAN-NUMBER")), list(makeSymbol("+"), ONE_INTEGER, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLAN-NUMBER"))))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLAN-NUMBER-TO-CUTOFF")), list(makeSymbol("+"), ONE_INTEGER, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLAN-NUMBER-TO-CUTOFF"))))), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-PLAN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-BASIC-PLAN")), list(QUOTE, makeSymbol("SHOP-BASIC-PLAN")))), list(makeSymbol("DEPTH"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEPTH"), makeSymbol("SHOP-PLAN-STATE")), makeSymbol("PLAN-STATE"))), list(makeSymbol("WHICH-PLANS"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("WHICH-PLANS"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("POPULATE-PLAN"), makeSymbol("SHOP-BASIC-PLAN")), makeSymbol("NEW-PLAN"), makeSymbol("PLAN-STATE")), list(makeSymbol("PCASE"), makeSymbol("WHICH-PLANS"), list(makeKeyword("SHALLOWEST"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DEPTH-CUTOFF")), list(makeSymbol("1-"), makeSymbol("DEPTH"))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")), list(makeSymbol("LIST"), makeSymbol("NEW-PLAN")))), list(makeKeyword("ALL-SHALLOWEST"), list(makeSymbol("PWHEN"), list(makeSymbol("CNOT"), list(EQUAL, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DEPTH-CUTOFF"))), makeSymbol("DEPTH"))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")), NIL), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DEPTH-CUTOFF")), makeSymbol("DEPTH"))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")), list(makeSymbol("CONS"), makeSymbol("NEW-PLAN"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")))))), list(list(makeKeyword("ALL"), makeKeyword("FIRST")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")), list(makeSymbol("CONS"), makeSymbol("NEW-PLAN"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")))))), list(makeSymbol("OTHERWISE"), list(makeSymbol("CERROR"), makeString("invalid keyword ~S"), makeSymbol("WHICH-PLANS")))), list(makeSymbol("WHEN-VERBOSE"), makeKeyword("CUTOFFS"), list(makeSymbol("FIM"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LOG"))), list(QUOTE, makeSymbol("SUCCESS")), list(makeSymbol("FORMAT"), NIL, makeString("depth ~s found plan #~s"), makeSymbol("DEPTH"), list(makeSymbol("LENGTH"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND"))))))), list(RET, list(makeSymbol("LIST"), NIL))));

    static private final SubLString $str_alt150$invalid_keyword__S = makeString("invalid keyword ~S");

    static private final SubLString $str_alt154$depth__s_found_plan___s = makeString("depth ~s found plan #~s");

    static private final SubLList $list_alt156 = list(list(RET, makeSymbol("HALT-STATUS")));

    static private final SubLList $list_alt160 = list(list(makeSymbol("CLET"), list(list(makeSymbol("OPEN-NODES"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("OPEN-NODES"))))), list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("OPEN-NODES")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("HALT-STATUS")), makeKeyword("SEARCH-EXHAUSTED"))), list(list(makeSymbol("TIME-CUTOFF-REACHED?"), makeSymbol("SELF")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("HALT-STATUS")), makeKeyword("TIME-CUTOFF"))), list(list(makeSymbol("DEPTH-CUTOFF-REACHED?"), makeSymbol("SELF"), list(makeSymbol("FIRST"), makeSymbol("OPEN-NODES"))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("HALT-STATUS")), makeKeyword("DEPTH-CUTOFF"))), list(list(makeSymbol("NUMBER-CUTOFF-REACHED?"), makeSymbol("SELF")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLAN-NUMBER-TO-CUTOFF")), ZERO_INTEGER), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("HALT-STATUS")), makeKeyword("NUMBER-CUTOFF")))), list(RET, NIL)));

    @Override
    public void declareFunctions() {
        shop_basic_planner_thread.declare_shop_basic_planner_thread_file();
    }

    @Override
    public void initializeVariables() {
        shop_basic_planner_thread.init_shop_basic_planner_thread_file();
    }

    @Override
    public void runTopLevelForms() {
        shop_basic_planner_thread.setup_shop_basic_planner_thread_file();
    }

    static {
    }

    static private final SubLList $list_alt167 = list(makeString("SEEK-PLANS is the main planning loop. \n   OPEN-NODES is the list of current unexpand plan-states."), list(makeSymbol("PUNLESS"), list(makeSymbol("ANY-CUTOFF-REACHED?"), makeSymbol("SELF")), list(makeSymbol("CDO"), list(list(makeSymbol("OPEN-NODES"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("OPEN-NODES"))), makeSymbol("OPEN-NODES"))), list(list(makeSymbol("NULL"), makeSymbol("OPEN-NODES")), list(RET, NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("ANY-CUTOFF-REACHED?"), makeSymbol("SELF")), list(makeSymbol("SHOP-PLANNER-THREAD-PAUSE"), makeSymbol("SELF"))), list(makeSymbol("SHOP-PROCESS-CHECKPOINT"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-EXPANSION"), makeSymbol("SHOP-STATISTIC-MANAGER")), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("STATS-MANAGER")))), list(makeSymbol("CLET"), list(list(makeSymbol("CUR-NODE"), list(makeSymbol("FIRST"), makeSymbol("OPEN-NODES")))), list(makeSymbol("CPOP"), makeSymbol("OPEN-NODES")), list(makeSymbol("PIF"), list(makeSymbol("NULL"), list(makeSymbol("GET-SLOT"), makeSymbol("CUR-NODE"), list(QUOTE, makeSymbol("TASKLIST")))), list(makeSymbol("PROGN"), list(makeSymbol("FOUND-PLAN"), makeSymbol("SELF"), makeSymbol("CUR-NODE")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("OPEN-NODES")), makeSymbol("OPEN-NODES"))), list(makeSymbol("PROGN"), list(makeSymbol("CPUSH*"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EXPAND"), makeSymbol("SHOP-BASIC-PLAN-STATE")), makeSymbol("CUR-NODE")), makeSymbol("OPEN-NODES")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("OPEN-NODES")), makeSymbol("OPEN-NODES"))))))));

    static private final SubLList $list_alt171 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LAST-ITERATION-EXPANSIONS"), ZERO_INTEGER), list(makeSymbol("LAST-ITERATION-INFERENCES"), ZERO_INTEGER)), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("START-TIMING"))), list(makeSymbol("PRINT-STATS-HEADER"), makeSymbol("SELF"), makeString("Depth")), list(new SubLObject[]{ makeSymbol("CDO"), list(list(makeSymbol("CUR-DEPTH"), ZERO_INTEGER, list(makeSymbol("1+"), makeSymbol("CUR-DEPTH")))), list(list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")))), list(makeSymbol("CSETQ"), makeSymbol("LAST-ITERATION-EXPANSIONS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("NUMBER-OF-EXPANSIONS")))), list(makeSymbol("CSETQ"), makeSymbol("LAST-ITERATION-INFERENCES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("NUMBER-OF-INFERENCES")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("RESET-COUNTERS"))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DEPTH-CUTOFF")), makeSymbol("CUR-DEPTH")), list(makeSymbol("SEEK-PLANS"), makeSymbol("SELF")), list(makeSymbol("PRINT-ITERATIVE-DEEPENING-STATS"), makeSymbol("SELF"), makeSymbol("CUR-DEPTH")), list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(makeSymbol("ZEROP"), list(makeSymbol("-"), makeSymbol("LAST-ITERATION-EXPANSIONS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("NUMBER-OF-EXPANSIONS"))))), list(makeSymbol("ZEROP"), list(makeSymbol("-"), makeSymbol("LAST-ITERATION-INFERENCES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("NUMBER-OF-INFERENCES")))))), list(makeSymbol("CERROR"), makeString("Error"), makeString("No expansions or inferences ~%added this iteration."))) }), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATS-MANAGER"), list(QUOTE, makeSymbol("STOP-TIMING")))), list(RET, NIL));

    static private final SubLString $str_alt177$No_expansions_or_inferences___add = makeString("No expansions or inferences ~%added this iteration.");

    static private final SubLList $list_alt180 = list(makeSymbol("MT"));

    static private final SubLList $list_alt181 = list(makeString("@param MT hlmt-p\n   @return listp ;; of hl-formula-p"), list(makeSymbol("CLET"), list(list(makeSymbol("INIT-MTS"), NIL)), list(makeSymbol("DO-ALL-GENL-MTS"), list(makeSymbol("GENL-MT"), makeSymbol("MT")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("MEMBER?"), makeSymbol("GENL-MT"), makeSymbol("INIT-MTS"))), list(makeSymbol("ISA?"), makeSymbol("GENL-MT"), reader_make_constant_shell("PlanDynamicSituationMicrotheory"))), list(makeSymbol("CPUSH"), makeSymbol("GENL-MT"), makeSymbol("INIT-MTS")))), list(RET, list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("ASSERTION-HL-FORMULA")), list(makeSymbol("APPLY"), list(QUOTE, makeSymbol("APPEND")), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("GATHER-MT-INDEX")), makeSymbol("INIT-MTS")))))));

    static private final SubLString $str_alt187$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt192$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt195$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt196$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLList $list_alt202 = list(makeSymbol("PROBLEM-NAME"), makeSymbol("STATE"), makeSymbol("TASKS"), makeSymbol("MT"));

    static private final SubLList $list_alt203 = list(makeString("@param PROBLEM-NAME\n   @param DOMAIN-NAME\n   @param STATE\n   @param TASKS\n   @param MT             microtheory-p\n   @return               shop-basic-problem-p"), list(makeSymbol("IGNORE"), makeSymbol("STATE")), list(makeSymbol("CLET"), list(makeSymbol("DOMAIN"), makeSymbol("NEW-PROBLEM"), makeSymbol("NEW-WORLD-STATE")), list(makeSymbol("CSETQ"), makeSymbol("NEW-PROBLEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-BASIC-PROBLEM")), list(QUOTE, makeSymbol("SHOP-BASIC-PROBLEM")))), list(makeSymbol("PIF"), makeSymbol("*SHOP-USE-MT-WORLD-STATES?*"), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("NEW-WORLD-STATE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-MT-WORLD-STATE")), list(QUOTE, makeSymbol("SHOP-MT-WORLD-STATE")))), list(makeSymbol("SET-SLOT"), makeSymbol("NEW-WORLD-STATE"), list(QUOTE, makeSymbol("MT")), makeSymbol("MT"))), list(makeSymbol("CSETQ"), makeSymbol("NEW-WORLD-STATE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-BASIC-WORLD-STATE")), list(QUOTE, makeSymbol("SHOP-BASIC-WORLD-STATE"))))), list(makeSymbol("CSETQ"), makeSymbol("DOMAIN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PLANNER"), list(QUOTE, makeSymbol("GET-DOMAIN")), makeSymbol("MT"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("INITIALIZE-PROBLEM"), makeSymbol("SHOP-BASIC-PROBLEM")), makeSymbol("NEW-PROBLEM"), makeSymbol("PROBLEM-NAME"), makeSymbol("DOMAIN"), makeSymbol("NEW-WORLD-STATE"), makeSymbol("TASKS"), makeSymbol("MT")), list(RET, makeSymbol("NEW-PROBLEM"))));

    static private final SubLSymbol $sym204$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    static private final SubLList $list_alt211 = list(makeSymbol("FORMULA"), makeSymbol("MT"));

    static private final SubLList $list_alt212 = list(makeString("@param FORMULA el-formula-p\n   @param MT microtheory-p"), list(makeSymbol("CLET"), list(list(makeSymbol("HL-FORMULA"), list(makeSymbol("SHOP-REIFY-NARTS-IN-EXPRESSION"), makeSymbol("FORMULA"))), list(makeSymbol("CYC-TASKS"), list(makeSymbol("LIST"), makeSymbol("HL-FORMULA"))), list(makeSymbol("INITIAL-STATE"), NIL), makeSymbol("NEW-PROBLEM")), list(makeSymbol("CSETQ"), makeSymbol("NEW-PROBLEM"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("MAKE-PROBLEM")), makeSymbol("FORMULA"), makeSymbol("INITIAL-STATE"), makeSymbol("CYC-TASKS"), makeSymbol("MT"))), list(RET, makeSymbol("NEW-PROBLEM"))));

    static private final SubLList $list_alt215 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt216 = list(makeSymbol("TASK-FORMULA"), makeSymbol("MT"), makeSymbol("&OPTIONAL"), list(makeSymbol("WHICH"), makeKeyword("ALL")), list(makeSymbol("VERBOSITY"), ZERO_INTEGER), list(makeSymbol("NUMBER"), NIL), list(makeSymbol("TIME"), NIL), list(makeSymbol("DEPTH"), NIL));

    static private final SubLList $list_alt217 = list(makeString("@param TASK-FORMULA el-formula-p\n   @param MT microtheory-p\n   FIND-PLANS starts the search for a plan for problem with name NEW-PROBLEM."), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("NEW-PROBLEM"), list(makeSymbol("MAKE-PROBLEM-FROM-FORMULA"), makeSymbol("SELF"), makeSymbol("TASK-FORMULA"), makeSymbol("MT"))), makeSymbol("DOMAIN")), list(makeSymbol("INIT-PLANNER-THREAD"), makeSymbol("SELF"), makeSymbol("NEW-PROBLEM"), makeSymbol("WHICH"), makeSymbol("VERBOSITY"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH")), list(makeSymbol("PWHEN"), makeSymbol("*SHOP-GC*"), list(makeSymbol("GC"))), list(makeSymbol("CSETQ"), makeSymbol("DOMAIN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-NAME"), makeSymbol("SHOP-BASIC-DOMAIN")), list(makeSymbol("GET-SLOT"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PROBLEM"))), list(QUOTE, makeSymbol("DOMAIN"))))), list(makeSymbol("WHEN-VERBOSE"), ONE_INTEGER, list(makeSymbol("FORMAT"), T, makeString("Problem: ~s Domain: ~s Plans: ~s Verbosity: ~s~%"), makeSymbol("NEW-PROBLEM"), makeSymbol("DOMAIN"), makeSymbol("WHICH"), makeSymbol("VERBOSITY"))), list(makeSymbol("PCASE"), makeSymbol("WHICH"), list(list(makeKeyword("ID-FIRST"), makeKeyword("ID-ALL")), list(makeSymbol("SEEK-PLANS-WITH-ITERATIVE-DEEPENING"), makeSymbol("SELF"))), list(list(makeKeyword("FIRST"), makeKeyword("ALL"), makeKeyword("SHALLOWEST"), makeKeyword("ALL-SHALLOWEST")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), list(makeSymbol("GET-SHOP-BASIC-PLANNER-THREAD-STATS-MANAGER"), makeSymbol("SELF")), list(QUOTE, makeSymbol("START-TIMING"))), list(makeSymbol("SEEK-PLANS"), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), list(makeSymbol("GET-SHOP-BASIC-PLANNER-THREAD-STATS-MANAGER"), makeSymbol("SELF")), list(QUOTE, makeSymbol("STOP-TIMING")))), list(makeSymbol("OTHERWISE"), list(makeSymbol("CERROR"), makeString("invalid keyword ~S"), makeSymbol("WHICH")))), list(makeSymbol("WHEN-VERBOSE"), ONE_INTEGER, list(makeSymbol("OUTPUT-MESSAGE"), makeSymbol("SELF"), list(makeSymbol("CCONCATENATE"), makeString("Halted Because: "), list(makeSymbol("WRITE-TO-STRING"), list(makeSymbol("HALT-STATUS"), makeSymbol("SELF"))))), list(makeSymbol("PRINT-STATS-HEADER"), makeSymbol("SELF"), makeString("Totals:")), list(makeSymbol("PRINT-STATS"), makeSymbol("SELF"))), list(RET, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLANS-FOUND")))) }));

    static private final SubLString $str_alt219$Problem___s_Domain___s_Plans___s_ = makeString("Problem: ~s Domain: ~s Plans: ~s Verbosity: ~s~%");

    static private final SubLString $str_alt222$Halted_Because__ = makeString("Halted Because: ");

    static private final SubLString $str_alt223$Totals_ = makeString("Totals:");

    static private final SubLSymbol $sym225$COMPLETED_RUN_ = makeSymbol("COMPLETED-RUN?");

    static private final SubLList $list_alt226 = list(makeString("@return booleanp"), list(RET, list(makeSymbol("NULL"), makeSymbol("OPEN-NODES"))));

    static private final SubLSymbol $sym227$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    static private final SubLSymbol $sym228$SHOP_BASIC_PLANNER_THREAD_COMPLETED_RUN__METHOD = makeSymbol("SHOP-BASIC-PLANNER-THREAD-COMPLETED-RUN?-METHOD");

    static private final SubLList $list_alt230 = list(makeString("This function returns a list of values that can be used to summarize\n   the results of the thread."), list(makeSymbol("CLET"), list(list(makeSymbol("TASK-LIST"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROBLEM"), list(QUOTE, makeSymbol("GET-TASKS")))), list(makeSymbol("TASK"), list(makeSymbol("FIRST"), makeSymbol("TASK-LIST"))), list(makeSymbol("COMPLETED-RUN?"), list(makeSymbol("COMPLETED-RUN?"), makeSymbol("SELF"))), list(makeSymbol("PLAN-COUNT"), list(makeSymbol("LENGTH"), makeSymbol("PLANS-FOUND")))), list(RET, list(makeSymbol("LIST"), makeSymbol("TASK"), makeSymbol("COMPLETED-RUN?"), makeSymbol("PLAN-COUNT")))));

    static private final SubLSymbol $sym231$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    static private final SubLList $list_alt235 = list(makeSymbol("PARAPHRASE-LINK"));

    static private final SubLList $list_alt236 = list(makeString("this function is used by the CycSecure AttackPlan History functionality.\n   displauys a short message about the thread and its resoultion."), list(makeSymbol("CLET"), list(list(makeSymbol("TASK-LIST"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROBLEM"), list(QUOTE, makeSymbol("GET-TASKS")))), list(makeSymbol("TASK"), list(makeSymbol("FIRST"), makeSymbol("TASK-LIST")))), list(makeSymbol("HTML-FANCY-TABLE-DATA"), list(makeKeyword("ALIGN"), makeKeyword("RIGHT")), list(makeSymbol("HTML-TEXT-WITH-TARGET"), makeSymbol("TASK"), makeSymbol("PARAPHRASE-LINK"))), list(makeSymbol("HTML-FANCY-TABLE-DATA"), list(makeKeyword("ALIGN"), makeKeyword("RIGHT")), list(makeSymbol("PIF"), list(makeSymbol("COMPLETED-RUN?"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("PLAN-COUNT"), list(makeSymbol("LENGTH"), makeSymbol("PLANS-FOUND")))), list(makeSymbol("PCOND"), list(list(makeSymbol("ZEROP"), makeSymbol("PLAN-COUNT")), list(makeSymbol("HTML-PRINC"), makeString("No plans found"))), list(list(EQ, ONE_INTEGER, makeSymbol("PLAN-COUNT")), list(makeSymbol("HTML-FORMAT"), makeString("~A Plan found"), makeSymbol("PLAN-COUNT"))), list(T, list(makeSymbol("HTML-FORMAT"), makeString("~A Plans found"), makeSymbol("PLAN-COUNT"))))), list(makeSymbol("HTML-PRINC"), makeString("Not Completed")))), list(RET, NIL)));

    static private final SubLSymbol $sym237$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");

    static private final SubLString $str_alt239$_A_Plan_found = makeString("~A Plan found");

    static private final SubLString $str_alt240$_A_Plans_found = makeString("~A Plans found");

    static private final SubLList $list_alt243 = list(makeSymbol("METHOD"), makeSymbol("CLASS"), makeSymbol("LIST"));

    static private final SubLList $list_alt247 = list(list(makeSymbol("RESULT-LIST"), NIL));

    static private final SubLList $list_alt252 = list(makeSymbol("CUR-ITEM"));

    static private final SubLList $list_alt253 = list(makeSymbol("RESULT-LIST"));

    static private final SubLList $list_alt254 = list(list(makeSymbol("REVERSE"), makeSymbol("RESULT-LIST")));

    static private final SubLSymbol $sym255$SHOP_REIFIABLE_NAT_ = makeSymbol("SHOP-REIFIABLE-NAT?");
}

/**
 * Total time: 1398 ms
 */
