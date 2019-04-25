package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class shop_basic_planner_thread extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.shop_basic_planner_thread";
    public static final String myFingerPrint = "4dce4a224642ca5aaccc8b886df88008bd37e7ea8c3ee216fd5e33b7762cdd38";
    private static final SubLSymbol $sym0$P_WRAPPER;
    private static final SubLSymbol $sym1$STATS_MANAGER;
    private static final SubLSymbol $sym2$STOP_TIMING;
    private static final SubLSymbol $sym3$RESUME_TIMING;
    private static final SubLSymbol $sym4$SHOP_BASIC_PLANNER_THREAD;
    private static final SubLSymbol $sym5$OBJECT;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$HALT_STATUS;
    private static final SubLSymbol $sym8$INITIAL_PLAN_STATE;
    private static final SubLSymbol $sym9$LOG;
    private static final SubLSymbol $sym10$OPEN_NODES;
    private static final SubLSymbol $sym11$PROBLEM;
    private static final SubLSymbol $sym12$INSTANCE_COUNT;
    private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_THREAD_CLASS;
    private static final SubLSymbol $sym14$ISOLATED_P;
    private static final SubLSymbol $sym15$INSTANCE_NUMBER;
    private static final SubLSymbol $sym16$AXIOMS;
    private static final SubLSymbol $sym17$PLANNER;
    private static final SubLSymbol $sym18$VAR_MANAGER;
    private static final SubLSymbol $sym19$WHICH_PLANS;
    private static final SubLSymbol $sym20$NUM_BACKCHAINS;
    private static final SubLSymbol $sym21$CYCLE_CHECKING;
    private static final SubLSymbol $sym22$TIME_CUTOFF;
    private static final SubLSymbol $sym23$DEPTH_CUTOFF;
    private static final SubLSymbol $sym24$NUMBER_CUTOFF;
    private static final SubLSymbol $sym25$PLAN_NUMBER;
    private static final SubLSymbol $sym26$PLAN_NUMBER_TO_CUTOFF;
    private static final SubLSymbol $sym27$PLANS_FOUND;
    private static final SubLSymbol $sym28$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_THREAD_INSTANCE;
    private static final SubLSymbol $sym29$INITIALIZE;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD;
    private static final SubLSymbol $sym33$SHOP_VARIABLE_MANAGER;
    private static final SubLSymbol $sym34$SHOP_STATISTIC_MANAGER;
    private static final SubLSymbol $sym35$SHOP_LOG;
    private static final SubLSymbol $sym36$SHOP_BASIC_PLANNER_THREAD_INITIALIZE_METHOD;
    private static final SubLSymbol $sym37$OUTPUT_MESSAGE;
    private static final SubLList $list38;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD;
    private static final SubLSymbol $sym42$SHOP_BASIC_PLANNER_THREAD_OUTPUT_MESSAGE_METHOD;
    private static final SubLSymbol $sym43$ANY_CUTOFF_REACHED_;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD;
    private static final SubLSymbol $sym46$SHOP_BASIC_PLANNER_THREAD_ANY_CUTOFF_REACHED__METHOD;
    private static final SubLSymbol $sym47$DEPTH_CUTOFF_REACHED_;
    private static final SubLList $list48;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD;
    private static final SubLSymbol $sym51$DEPTH;
    private static final SubLSymbol $sym52$SHOP_BASIC_PLANNER_THREAD_DEPTH_CUTOFF_REACHED__METHOD;
    private static final SubLSymbol $sym53$TIME_CUTOFF_REACHED_;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD;
    private static final SubLSymbol $sym56$SHOP_BASIC_PLANNER_THREAD_TIME_CUTOFF_REACHED__METHOD;
    private static final SubLSymbol $sym57$NUMBER_CUTOFF_REACHED_;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD;
    private static final SubLSymbol $sym60$SHOP_BASIC_PLANNER_THREAD_NUMBER_CUTOFF_REACHED__METHOD;
    private static final SubLSymbol $sym61$CYCL_PLANS;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD;
    private static final SubLSymbol $sym64$SHOP_BASIC_PLANNER_THREAD_CYCL_PLANS_METHOD;
    private static final SubLSymbol $sym65$PRINT_STATS_HEADER;
    private static final SubLList $list66;
    private static final SubLList $list67;
    private static final SubLString $str68$___7_a_Plans_Mincost_Maxcost_Expa;
    private static final SubLSymbol $sym69$SHOP_BASIC_PLANNER_THREAD_PRINT_STATS_HEADER_METHOD;
    private static final SubLSymbol $sym70$PRINT_PLAN;
    private static final SubLList $list71;
    private static final SubLList $list72;
    private static final SubLString $str73$___s;
    private static final SubLSymbol $sym74$SHOP_BASIC_PLANNER_THREAD_PRINT_PLAN_METHOD;
    private static final SubLSymbol $sym75$PRINT_STATS;
    private static final SubLList $list76;
    private static final SubLSymbol $sym77$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD;
    private static final SubLSymbol $sym78$NUMBER_OF_EXPANSIONS;
    private static final SubLSymbol $sym79$NUMBER_OF_INFERENCES;
    private static final SubLString $str80$___12_a_8_a_8_a_11_s_11_s_10_3f_1;
    private static final SubLSymbol $sym81$MIN;
    private static final SubLSymbol $sym82$SHOP_PLAN_COST;
    private static final SubLString $str83$_;
    private static final SubLSymbol $sym84$MAX;
    private static final SubLSymbol $sym85$SHOP_BASIC_PLANNER_THREAD_PRINT_STATS_METHOD;
    private static final SubLSymbol $sym86$PRINT_ITERATIVE_DEEPENING_STATS;
    private static final SubLList $list87;
    private static final SubLList $list88;
    private static final SubLSymbol $sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD;
    private static final SubLSymbol $sym90$ELAPSED_RUN_TIME_SINCE_LAST_CALL;
    private static final SubLSymbol $sym91$ELAPSED_REAL_TIME_SINCE_LAST_CALL;
    private static final SubLString $str92$___6_a_6_a_8_a_8_a_11_s_11_s_10_3;
    private static final SubLSymbol $sym93$SHOP_BASIC_PLANNER_THREAD_PRINT_ITERATIVE_DEEPENING_STATS_METHOD;
    private static final SubLSymbol $sym94$HTML_STATS;
    private static final SubLList $list95;
    private static final SubLSymbol $sym96$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD;
    private static final SubLSymbol $sym97$ELAPSED_RUN_TIME;
    private static final SubLSymbol $sym98$ELAPSED_REAL_TIME;
    private static final SubLString $str99$Plans;
    private static final SubLString $str100$MinCost;
    private static final SubLString $str101$MaxCost;
    private static final SubLString $str102$Expansions;
    private static final SubLString $str103$Inferences;
    private static final SubLString $str104$CPU_Time;
    private static final SubLString $str105$Real_Time;
    private static final SubLSymbol $kw106$RIGHT;
    private static final SubLSymbol $sym107$SHOP_BASIC_PLANNER_THREAD_HTML_STATS_METHOD;
    private static final SubLSymbol $sym108$SET_PROBLEM;
    private static final SubLList $list109;
    private static final SubLList $list110;
    private static final SubLList $list111;
    private static final SubLSymbol $sym112$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD;
    private static final SubLSymbol $sym113$INTEGERP;
    private static final SubLSymbol $sym114$SHOP_BASIC_PLANNER_THREAD_SET_PROBLEM_METHOD;
    private static final SubLSymbol $sym115$GET_PROBLEM;
    private static final SubLList $list116;
    private static final SubLSymbol $sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD;
    private static final SubLSymbol $sym118$SHOP_BASIC_PLANNER_THREAD_GET_PROBLEM_METHOD;
    private static final SubLSymbol $sym119$GET_DOMAIN;
    private static final SubLList $list120;
    private static final SubLSymbol $sym121$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD;
    private static final SubLSymbol $sym122$SHOP_BASIC_PLANNER_THREAD_GET_DOMAIN_METHOD;
    private static final SubLSymbol $sym123$GET_WHICH_PLANS;
    private static final SubLList $list124;
    private static final SubLSymbol $sym125$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD;
    private static final SubLSymbol $sym126$SHOP_BASIC_PLANNER_THREAD_GET_WHICH_PLANS_METHOD;
    private static final SubLSymbol $sym127$SET_WHICH_PLANS;
    private static final SubLList $list128;
    private static final SubLList $list129;
    private static final SubLSymbol $sym130$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD;
    private static final SubLSymbol $sym131$SHOP_BASIC_PLANNER_THREAD_SET_WHICH_PLANS_METHOD;
    private static final SubLSymbol $sym132$INIT_PLAN_STATE;
    private static final SubLList $list133;
    private static final SubLList $list134;
    private static final SubLList $list135;
    private static final SubLSymbol $sym136$SHOP_BASIC_PLAN_STATE;
    private static final SubLSymbol $sym137$SHOP_BASIC_PLANNER_THREAD_INIT_PLAN_STATE_METHOD;
    private static final SubLSymbol $sym138$INIT_PLANNER_THREAD;
    private static final SubLList $list139;
    private static final SubLList $list140;
    private static final SubLSymbol $sym141$SET_VERBOSITY;
    private static final SubLSymbol $sym142$SHOP_BASIC_PLANNER_THREAD_INIT_PLANNER_THREAD_METHOD;
    private static final SubLSymbol $sym143$FOUND_PLAN;
    private static final SubLList $list144;
    private static final SubLSymbol $sym145$SHOP_BASIC_PLAN;
    private static final SubLSymbol $kw146$SHALLOWEST;
    private static final SubLSymbol $kw147$ALL_SHALLOWEST;
    private static final SubLSymbol $kw148$ALL;
    private static final SubLSymbol $kw149$FIRST;
    private static final SubLString $str150$invalid_keyword__S;
    private static final SubLSymbol $kw151$CUTOFFS;
    private static final SubLSymbol $sym152$VERBOSE;
    private static final SubLSymbol $sym153$SUCCESS;
    private static final SubLString $str154$depth__s_found_plan___s;
    private static final SubLSymbol $sym155$SHOP_BASIC_PLANNER_THREAD_FOUND_PLAN_METHOD;
    private static final SubLList $list156;
    private static final SubLSymbol $sym157$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD;
    private static final SubLSymbol $sym158$SHOP_BASIC_PLANNER_THREAD_HALT_STATUS_METHOD;
    private static final SubLSymbol $sym159$UPDATE_HALT_STATUS;
    private static final SubLList $list160;
    private static final SubLSymbol $kw161$SEARCH_EXHAUSTED;
    private static final SubLSymbol $kw162$TIME_CUTOFF;
    private static final SubLSymbol $kw163$DEPTH_CUTOFF;
    private static final SubLSymbol $kw164$NUMBER_CUTOFF;
    private static final SubLSymbol $sym165$SHOP_BASIC_PLANNER_THREAD_UPDATE_HALT_STATUS_METHOD;
    private static final SubLSymbol $sym166$SEEK_PLANS;
    private static final SubLList $list167;
    private static final SubLSymbol $sym168$TASKLIST;
    private static final SubLSymbol $sym169$SHOP_BASIC_PLANNER_THREAD_SEEK_PLANS_METHOD;
    private static final SubLSymbol $sym170$SEEK_PLANS_WITH_ITERATIVE_DEEPENING;
    private static final SubLList $list171;
    private static final SubLSymbol $sym172$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD;
    private static final SubLSymbol $sym173$START_TIMING;
    private static final SubLString $str174$Depth;
    private static final SubLSymbol $sym175$RESET_COUNTERS;
    private static final SubLString $str176$Error;
    private static final SubLString $str177$No_expansions_or_inferences___add;
    private static final SubLSymbol $sym178$SHOP_BASIC_PLANNER_THREAD_SEEK_PLANS_WITH_ITERATIVE_DEEPENING_MET;
    private static final SubLSymbol $sym179$GATHER_INITIAL_STATE;
    private static final SubLList $list180;
    private static final SubLList $list181;
    private static final SubLSymbol $kw182$BREADTH;
    private static final SubLSymbol $kw183$QUEUE;
    private static final SubLSymbol $kw184$STACK;
    private static final SubLSymbol $sym185$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw186$ERROR;
    private static final SubLString $str187$_A_is_not_a__A;
    private static final SubLSymbol $sym188$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw189$CERROR;
    private static final SubLString $str190$continue_anyway;
    private static final SubLSymbol $kw191$WARN;
    private static final SubLString $str192$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const193$genlMt;
    private static final SubLObject $const194$PlanDynamicSituationMicrotheory;
    private static final SubLString $str195$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str196$attempting_to_bind_direction_link;
    private static final SubLString $str197$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $sym198$ASSERTION_HL_FORMULA;
    private static final SubLSymbol $sym199$APPEND;
    private static final SubLSymbol $sym200$GATHER_MT_INDEX;
    private static final SubLSymbol $sym201$SHOP_BASIC_PLANNER_THREAD_GATHER_INITIAL_STATE_METHOD;
    private static final SubLSymbol $sym202$MAKE_PROBLEM;
    private static final SubLList $list203;
    private static final SubLList $list204;
    private static final SubLSymbol $sym205$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD;
    private static final SubLSymbol $sym206$SHOP_BASIC_PROBLEM;
    private static final SubLSymbol $sym207$SHOP_MT_WORLD_STATE;
    private static final SubLSymbol $sym208$MT;
    private static final SubLSymbol $sym209$SHOP_BASIC_WORLD_STATE;
    private static final SubLSymbol $sym210$SHOP_BASIC_PLANNER_THREAD_MAKE_PROBLEM_METHOD;
    private static final SubLSymbol $sym211$MAKE_PROBLEM_FROM_FORMULA;
    private static final SubLList $list212;
    private static final SubLList $list213;
    private static final SubLSymbol $sym214$SHOP_BASIC_PLANNER_THREAD_MAKE_PROBLEM_FROM_FORMULA_METHOD;
    private static final SubLSymbol $sym215$FIND_PLANS;
    private static final SubLList $list216;
    private static final SubLList $list217;
    private static final SubLList $list218;
    private static final SubLSymbol $sym219$DOMAIN;
    private static final SubLString $str220$Problem___s_Domain___s_Plans___s_;
    private static final SubLSymbol $kw221$ID_FIRST;
    private static final SubLSymbol $kw222$ID_ALL;
    private static final SubLString $str223$Halted_Because__;
    private static final SubLString $str224$Totals_;
    private static final SubLSymbol $sym225$SHOP_BASIC_PLANNER_THREAD_FIND_PLANS_METHOD;
    private static final SubLSymbol $sym226$COMPLETED_RUN_;
    private static final SubLList $list227;
    private static final SubLSymbol $sym228$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD;
    private static final SubLSymbol $sym229$SHOP_BASIC_PLANNER_THREAD_COMPLETED_RUN__METHOD;
    private static final SubLSymbol $sym230$SUMMARY;
    private static final SubLList $list231;
    private static final SubLSymbol $sym232$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD;
    private static final SubLSymbol $sym233$GET_TASKS;
    private static final SubLSymbol $sym234$SHOP_BASIC_PLANNER_THREAD_SUMMARY_METHOD;
    private static final SubLSymbol $sym235$HTML_DISPLAY_SUMMARY;
    private static final SubLList $list236;
    private static final SubLList $list237;
    private static final SubLSymbol $sym238$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD;
    private static final SubLString $str239$No_plans_found;
    private static final SubLString $str240$_A_Plan_found;
    private static final SubLString $str241$_A_Plans_found;
    private static final SubLString $str242$Not_Completed;
    private static final SubLSymbol $sym243$SHOP_BASIC_PLANNER_THREAD_HTML_DISPLAY_SUMMARY_METHOD;
    private static final SubLList $list244;
    private static final SubLSymbol $sym245$FWHEN;
    private static final SubLSymbol $sym246$SUBLOOP_TYPE_P;
    private static final SubLSymbol $sym247$CLET;
    private static final SubLList $list248;
    private static final SubLSymbol $sym249$CDOLIST;
    private static final SubLSymbol $sym250$CUR_ITEM;
    private static final SubLSymbol $sym251$CPUSH;
    private static final SubLSymbol $sym252$INLINE_METHOD;
    private static final SubLList $list253;
    private static final SubLList $list254;
    private static final SubLList $list255;
    private static final SubLSymbol $sym256$SHOP_REIFIABLE_NAT_;
    private static final SubLSymbol $sym257$FIND_WHEN_CLOSED_NAUT;
    private static final SubLSymbol $sym258$SHOP_PLANNER_THREAD_P;
    private static final SubLSymbol $kw259$THREAD_STRUCTURE;
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 801L)
    public static SubLObject shop_process_checkpoint(final SubLObject thread) {
        final SubLObject pw = instances.get_slot(thread, (SubLObject)shop_basic_planner_thread.$sym0$P_WRAPPER);
        final SubLObject stats_manager = instances.get_slot(thread, (SubLObject)shop_basic_planner_thread.$sym1$STATS_MANAGER);
        if (shop_basic_planner_thread.NIL != pw) {
            methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym2$STOP_TIMING);
            process_utilities.process_wrapper_checkpoint(pw);
            methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym3$RESUME_TIMING);
        }
        return (SubLObject)shop_basic_planner_thread.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject get_shop_basic_planner_thread_plans_found(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, (SubLObject)shop_basic_planner_thread.NINETEEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject set_shop_basic_planner_thread_plans_found(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, (SubLObject)shop_basic_planner_thread.NINETEEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject get_shop_basic_planner_thread_plan_number_to_cutoff(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, (SubLObject)shop_basic_planner_thread.EIGHTEEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject set_shop_basic_planner_thread_plan_number_to_cutoff(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, (SubLObject)shop_basic_planner_thread.EIGHTEEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject get_shop_basic_planner_thread_plan_number(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, (SubLObject)shop_basic_planner_thread.SEVENTEEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject set_shop_basic_planner_thread_plan_number(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, (SubLObject)shop_basic_planner_thread.SEVENTEEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject get_shop_basic_planner_thread_number_cutoff(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, (SubLObject)shop_basic_planner_thread.SIXTEEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject set_shop_basic_planner_thread_number_cutoff(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, (SubLObject)shop_basic_planner_thread.SIXTEEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject get_shop_basic_planner_thread_depth_cutoff(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, (SubLObject)shop_basic_planner_thread.FIFTEEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject set_shop_basic_planner_thread_depth_cutoff(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, (SubLObject)shop_basic_planner_thread.FIFTEEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject get_shop_basic_planner_thread_time_cutoff(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, (SubLObject)shop_basic_planner_thread.FOURTEEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject set_shop_basic_planner_thread_time_cutoff(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, (SubLObject)shop_basic_planner_thread.FOURTEEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject get_shop_basic_planner_thread_cycle_checking(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, (SubLObject)shop_basic_planner_thread.THIRTEEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject set_shop_basic_planner_thread_cycle_checking(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, (SubLObject)shop_basic_planner_thread.THIRTEEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject get_shop_basic_planner_thread_num_backchains(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, (SubLObject)shop_basic_planner_thread.TWELVE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject set_shop_basic_planner_thread_num_backchains(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, (SubLObject)shop_basic_planner_thread.TWELVE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject get_shop_basic_planner_thread_which_plans(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, (SubLObject)shop_basic_planner_thread.ELEVEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject set_shop_basic_planner_thread_which_plans(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, (SubLObject)shop_basic_planner_thread.ELEVEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject get_shop_basic_planner_thread_halt_status(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_planner_thread, (SubLObject)shop_basic_planner_thread.TEN_INTEGER, (SubLObject)shop_basic_planner_thread.$sym7$HALT_STATUS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject set_shop_basic_planner_thread_halt_status(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_planner_thread, value, (SubLObject)shop_basic_planner_thread.TEN_INTEGER, (SubLObject)shop_basic_planner_thread.$sym7$HALT_STATUS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject get_shop_basic_planner_thread_initial_plan_state(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_planner_thread, (SubLObject)shop_basic_planner_thread.NINE_INTEGER, (SubLObject)shop_basic_planner_thread.$sym8$INITIAL_PLAN_STATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject set_shop_basic_planner_thread_initial_plan_state(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_planner_thread, value, (SubLObject)shop_basic_planner_thread.NINE_INTEGER, (SubLObject)shop_basic_planner_thread.$sym8$INITIAL_PLAN_STATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject get_shop_basic_planner_thread_log(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_planner_thread, (SubLObject)shop_basic_planner_thread.EIGHT_INTEGER, (SubLObject)shop_basic_planner_thread.$sym9$LOG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject set_shop_basic_planner_thread_log(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_planner_thread, value, (SubLObject)shop_basic_planner_thread.EIGHT_INTEGER, (SubLObject)shop_basic_planner_thread.$sym9$LOG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject get_shop_basic_planner_thread_stats_manager(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, (SubLObject)shop_basic_planner_thread.SEVEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject set_shop_basic_planner_thread_stats_manager(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, (SubLObject)shop_basic_planner_thread.SEVEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject get_shop_basic_planner_thread_var_manager(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, (SubLObject)shop_basic_planner_thread.SIX_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject set_shop_basic_planner_thread_var_manager(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, (SubLObject)shop_basic_planner_thread.SIX_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject get_shop_basic_planner_thread_p_wrapper(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_planner_thread, (SubLObject)shop_basic_planner_thread.FIVE_INTEGER, (SubLObject)shop_basic_planner_thread.$sym0$P_WRAPPER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject set_shop_basic_planner_thread_p_wrapper(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_planner_thread, value, (SubLObject)shop_basic_planner_thread.FIVE_INTEGER, (SubLObject)shop_basic_planner_thread.$sym0$P_WRAPPER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject get_shop_basic_planner_thread_open_nodes(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_planner_thread, (SubLObject)shop_basic_planner_thread.FOUR_INTEGER, (SubLObject)shop_basic_planner_thread.$sym10$OPEN_NODES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject set_shop_basic_planner_thread_open_nodes(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_planner_thread, value, (SubLObject)shop_basic_planner_thread.FOUR_INTEGER, (SubLObject)shop_basic_planner_thread.$sym10$OPEN_NODES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject get_shop_basic_planner_thread_planner(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, (SubLObject)shop_basic_planner_thread.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject set_shop_basic_planner_thread_planner(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, (SubLObject)shop_basic_planner_thread.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject get_shop_basic_planner_thread_axioms(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_instance_slot(v_shop_basic_planner_thread, (SubLObject)shop_basic_planner_thread.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject set_shop_basic_planner_thread_axioms(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_planner_thread, value, (SubLObject)shop_basic_planner_thread.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject get_shop_basic_planner_thread_problem(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_planner_thread, (SubLObject)shop_basic_planner_thread.ONE_INTEGER, (SubLObject)shop_basic_planner_thread.$sym11$PROBLEM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject set_shop_basic_planner_thread_problem(final SubLObject v_shop_basic_planner_thread, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_planner_thread, value, (SubLObject)shop_basic_planner_thread.ONE_INTEGER, (SubLObject)shop_basic_planner_thread.$sym11$PROBLEM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject subloop_reserved_initialize_shop_basic_planner_thread_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_planner_thread.$sym5$OBJECT, (SubLObject)shop_basic_planner_thread.$sym12$INSTANCE_COUNT, (SubLObject)shop_basic_planner_thread.ZERO_INTEGER);
        return (SubLObject)shop_basic_planner_thread.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject subloop_reserved_initialize_shop_basic_planner_thread_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_planner_thread.$sym5$OBJECT, (SubLObject)shop_basic_planner_thread.$sym14$ISOLATED_P, (SubLObject)shop_basic_planner_thread.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_planner_thread.$sym5$OBJECT, (SubLObject)shop_basic_planner_thread.$sym15$INSTANCE_NUMBER, (SubLObject)shop_basic_planner_thread.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym11$PROBLEM, (SubLObject)shop_basic_planner_thread.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym16$AXIOMS, (SubLObject)shop_basic_planner_thread.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym17$PLANNER, (SubLObject)shop_basic_planner_thread.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym10$OPEN_NODES, (SubLObject)shop_basic_planner_thread.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym0$P_WRAPPER, (SubLObject)shop_basic_planner_thread.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym18$VAR_MANAGER, (SubLObject)shop_basic_planner_thread.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym1$STATS_MANAGER, (SubLObject)shop_basic_planner_thread.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym9$LOG, (SubLObject)shop_basic_planner_thread.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym8$INITIAL_PLAN_STATE, (SubLObject)shop_basic_planner_thread.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym7$HALT_STATUS, (SubLObject)shop_basic_planner_thread.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym19$WHICH_PLANS, (SubLObject)shop_basic_planner_thread.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym20$NUM_BACKCHAINS, (SubLObject)shop_basic_planner_thread.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym21$CYCLE_CHECKING, (SubLObject)shop_basic_planner_thread.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym22$TIME_CUTOFF, (SubLObject)shop_basic_planner_thread.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym23$DEPTH_CUTOFF, (SubLObject)shop_basic_planner_thread.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym24$NUMBER_CUTOFF, (SubLObject)shop_basic_planner_thread.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym25$PLAN_NUMBER, (SubLObject)shop_basic_planner_thread.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym26$PLAN_NUMBER_TO_CUTOFF, (SubLObject)shop_basic_planner_thread.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym27$PLANS_FOUND, (SubLObject)shop_basic_planner_thread.NIL);
        return (SubLObject)shop_basic_planner_thread.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
    public static SubLObject shop_basic_planner_thread_p(final SubLObject v_shop_basic_planner_thread) {
        return classes.subloop_instanceof_class(v_shop_basic_planner_thread, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 3396L)
    public static SubLObject shop_basic_planner_thread_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = (SubLObject)shop_basic_planner_thread.NIL;
        SubLObject plan_number_to_cutoff = get_shop_basic_planner_thread_plan_number_to_cutoff(self);
        SubLObject plan_number = get_shop_basic_planner_thread_plan_number(self);
        SubLObject number_cutoff = get_shop_basic_planner_thread_number_cutoff(self);
        SubLObject depth_cutoff = get_shop_basic_planner_thread_depth_cutoff(self);
        SubLObject time_cutoff = get_shop_basic_planner_thread_time_cutoff(self);
        SubLObject cycle_checking = get_shop_basic_planner_thread_cycle_checking(self);
        SubLObject num_backchains = get_shop_basic_planner_thread_num_backchains(self);
        SubLObject halt_status = get_shop_basic_planner_thread_halt_status(self);
        SubLObject log = get_shop_basic_planner_thread_log(self);
        SubLObject stats_manager = get_shop_basic_planner_thread_stats_manager(self);
        SubLObject var_manager = get_shop_basic_planner_thread_var_manager(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym32$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                object.object_initialize_method(self);
                var_manager = object.object_new_method((SubLObject)shop_basic_planner_thread.$sym33$SHOP_VARIABLE_MANAGER);
                stats_manager = object.object_new_method((SubLObject)shop_basic_planner_thread.$sym34$SHOP_STATISTIC_MANAGER);
                log = object.object_new_method((SubLObject)shop_basic_planner_thread.$sym35$SHOP_LOG);
                plan_number = (SubLObject)shop_basic_planner_thread.ZERO_INTEGER;
                plan_number_to_cutoff = (SubLObject)shop_basic_planner_thread.ZERO_INTEGER;
                time_cutoff = (SubLObject)shop_basic_planner_thread.NIL;
                depth_cutoff = shop_parameters.$shop_default_depth_limit$.getDynamicValue(thread);
                number_cutoff = (SubLObject)shop_basic_planner_thread.NIL;
                halt_status = (SubLObject)shop_basic_planner_thread.NIL;
                num_backchains = (SubLObject)shop_basic_planner_thread.ZERO_INTEGER;
                cycle_checking = (SubLObject)shop_basic_planner_thread.NIL;
                Dynamic.sublisp_throw((SubLObject)shop_basic_planner_thread.$sym32$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_thread_plan_number_to_cutoff(self, plan_number_to_cutoff);
                    set_shop_basic_planner_thread_plan_number(self, plan_number);
                    set_shop_basic_planner_thread_number_cutoff(self, number_cutoff);
                    set_shop_basic_planner_thread_depth_cutoff(self, depth_cutoff);
                    set_shop_basic_planner_thread_time_cutoff(self, time_cutoff);
                    set_shop_basic_planner_thread_cycle_checking(self, cycle_checking);
                    set_shop_basic_planner_thread_num_backchains(self, num_backchains);
                    set_shop_basic_planner_thread_halt_status(self, halt_status);
                    set_shop_basic_planner_thread_log(self, log);
                    set_shop_basic_planner_thread_stats_manager(self, stats_manager);
                    set_shop_basic_planner_thread_var_manager(self, var_manager);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_planner_thread.$sym32$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 4006L)
    public static SubLObject shop_basic_planner_thread_output_message_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = (SubLObject)shop_basic_planner_thread.NIL;
        final SubLObject log = get_shop_basic_planner_thread_log(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym41$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_planner_thread.$sym41$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, shop_log.shop_log_log_entry_method(log, string));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_thread_log(self, log);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_planner_thread.$sym41$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 4184L)
    public static SubLObject shop_basic_planner_thread_any_cutoff_reachedP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = (SubLObject)shop_basic_planner_thread.NIL;
        final SubLObject open_nodes = get_shop_basic_planner_thread_open_nodes(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                if (shop_basic_planner_thread.NIL == open_nodes) {
                    Dynamic.sublisp_throw((SubLObject)shop_basic_planner_thread.$sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, (SubLObject)shop_basic_planner_thread.T);
                }
                Dynamic.sublisp_throw((SubLObject)shop_basic_planner_thread.$sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, (SubLObject)SubLObjectFactory.makeBoolean(shop_basic_planner_thread.NIL != shop_basic_planner_thread_depth_cutoff_reachedP_method(self, open_nodes.first()) || shop_basic_planner_thread.NIL != shop_basic_planner_thread_time_cutoff_reachedP_method(self) || shop_basic_planner_thread.NIL != shop_basic_planner_thread_number_cutoff_reachedP_method(self)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_thread_open_nodes(self, open_nodes);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_planner_thread.$sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 4534L)
    public static SubLObject shop_basic_planner_thread_depth_cutoff_reachedP_method(final SubLObject self, final SubLObject plan_state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = (SubLObject)shop_basic_planner_thread.NIL;
        final SubLObject depth_cutoff = get_shop_basic_planner_thread_depth_cutoff(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym50$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_planner_thread.$sym50$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, (SubLObject)(depth_cutoff.isNumber() ? Numbers.numG(methods.funcall_instance_method_with_0_args(plan_state, (SubLObject)shop_basic_planner_thread.$sym51$DEPTH), depth_cutoff) : shop_basic_planner_thread.NIL));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_thread_depth_cutoff(self, depth_cutoff);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_planner_thread.$sym50$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 4811L)
    public static SubLObject shop_basic_planner_thread_time_cutoff_reachedP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = (SubLObject)shop_basic_planner_thread.NIL;
        final SubLObject time_cutoff = get_shop_basic_planner_thread_time_cutoff(self);
        final SubLObject stats_manager = get_shop_basic_planner_thread_stats_manager(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym55$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_planner_thread.$sym55$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, (SubLObject)((shop_basic_planner_thread.NIL != time_cutoff) ? Numbers.numG(shop_internals.statistic_manager_elapsed_run_time_since_last_call_method(stats_manager), time_cutoff) : shop_basic_planner_thread.NIL));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_thread_time_cutoff(self, time_cutoff);
                    set_shop_basic_planner_thread_stats_manager(self, stats_manager);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_planner_thread.$sym55$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 5069L)
    public static SubLObject shop_basic_planner_thread_number_cutoff_reachedP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = (SubLObject)shop_basic_planner_thread.NIL;
        final SubLObject plan_number_to_cutoff = get_shop_basic_planner_thread_plan_number_to_cutoff(self);
        final SubLObject number_cutoff = get_shop_basic_planner_thread_number_cutoff(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym59$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_planner_thread.$sym59$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, (SubLObject)((shop_basic_planner_thread.NIL != number_cutoff) ? Numbers.numGE(plan_number_to_cutoff, number_cutoff) : shop_basic_planner_thread.NIL));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_thread_plan_number_to_cutoff(self, plan_number_to_cutoff);
                    set_shop_basic_planner_thread_number_cutoff(self, number_cutoff);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_planner_thread.$sym59$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 5261L)
    public static SubLObject shop_basic_planner_thread_cycl_plans_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = (SubLObject)shop_basic_planner_thread.NIL;
        final SubLObject plans_found = get_shop_basic_planner_thread_plans_found(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_planner_thread.$sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym27$PLANS_FOUND));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_thread_plans_found(self, plans_found);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_planner_thread.$sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 5441L)
    public static SubLObject shop_basic_planner_thread_print_stats_header_method(final SubLObject self, final SubLObject label) {
        shop_basic_planner_thread_output_message_method(self, PrintLow.format((SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.$str68$___7_a_Plans_Mincost_Maxcost_Expa, label));
        return (SubLObject)shop_basic_planner_thread.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 5655L)
    public static SubLObject shop_basic_planner_thread_print_plan_method(final SubLObject self, final SubLObject plan) {
        shop_basic_planner_thread_output_message_method(self, PrintLow.format((SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.$str73$___s, plan));
        return (SubLObject)shop_basic_planner_thread.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 5791L)
    public static SubLObject shop_shorterplan1(final SubLObject plan) {
        if (shop_basic_planner_thread.NIL == plan) {
            return (SubLObject)shop_basic_planner_thread.NIL;
        }
        if (!shop_basic_planner_thread.ZERO_INTEGER.equal(plan.rest().first())) {
            return (SubLObject)ConsesLow.cons(plan.first(), shop_shorterplan1(conses_high.cddr(plan)));
        }
        return shop_shorterplan1(conses_high.cddr(plan));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 6068L)
    public static SubLObject shop_basic_planner_thread_print_stats_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = (SubLObject)shop_basic_planner_thread.NIL;
        final SubLObject plans_found = get_shop_basic_planner_thread_plans_found(self);
        final SubLObject stats_manager = get_shop_basic_planner_thread_stats_manager(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym77$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                final SubLObject plans = instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym27$PLANS_FOUND);
                final SubLObject tasks = methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym78$NUMBER_OF_EXPANSIONS);
                final SubLObject inferences = methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym79$NUMBER_OF_INFERENCES);
                final SubLObject run_time = shop_internals.statistic_manager_elapsed_run_time_method(stats_manager);
                final SubLObject real_time = shop_internals.statistic_manager_elapsed_real_time_method(stats_manager);
                shop_basic_planner_thread_output_message_method(self, PrintLow.format((SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.$str80$___12_a_8_a_8_a_11_s_11_s_10_3f_1, new SubLObject[] { Sequences.length(plans), (shop_basic_planner_thread.NIL != plans) ? Functions.apply(Symbols.symbol_function((SubLObject)shop_basic_planner_thread.$sym81$MIN), Mapping.mapcar(Symbols.symbol_function((SubLObject)shop_basic_planner_thread.$sym82$SHOP_PLAN_COST), plans)) : shop_basic_planner_thread.$str83$_, (shop_basic_planner_thread.NIL != plans) ? Functions.apply(Symbols.symbol_function((SubLObject)shop_basic_planner_thread.$sym84$MAX), Mapping.mapcar(Symbols.symbol_function((SubLObject)shop_basic_planner_thread.$sym82$SHOP_PLAN_COST), plans)) : shop_basic_planner_thread.$str83$_, tasks, inferences, Numbers.divide(run_time, time_high.$internal_time_units_per_second$.getGlobalValue()), Numbers.divide(real_time, time_high.$internal_time_units_per_second$.getGlobalValue()) }));
                Dynamic.sublisp_throw((SubLObject)shop_basic_planner_thread.$sym77$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, (SubLObject)shop_basic_planner_thread.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_thread_plans_found(self, plans_found);
                    set_shop_basic_planner_thread_stats_manager(self, stats_manager);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_planner_thread.$sym77$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 7135L)
    public static SubLObject shop_basic_planner_thread_print_iterative_deepening_stats_method(final SubLObject self, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = (SubLObject)shop_basic_planner_thread.NIL;
        final SubLObject plans_found = get_shop_basic_planner_thread_plans_found(self);
        final SubLObject stats_manager = get_shop_basic_planner_thread_stats_manager(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                final SubLObject plans = instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym27$PLANS_FOUND);
                final SubLObject tasks = methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym78$NUMBER_OF_EXPANSIONS);
                final SubLObject inferences = methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym79$NUMBER_OF_INFERENCES);
                final SubLObject run_time = methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym90$ELAPSED_RUN_TIME_SINCE_LAST_CALL);
                final SubLObject real_time = methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym91$ELAPSED_REAL_TIME_SINCE_LAST_CALL);
                shop_basic_planner_thread_output_message_method(self, PrintLow.format((SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.$str92$___6_a_6_a_8_a_8_a_11_s_11_s_10_3, new SubLObject[] { depth, Sequences.length(plans), (shop_basic_planner_thread.NIL != plans) ? Functions.apply(Symbols.symbol_function((SubLObject)shop_basic_planner_thread.$sym81$MIN), Mapping.mapcar(Symbols.symbol_function((SubLObject)shop_basic_planner_thread.$sym82$SHOP_PLAN_COST), plans)) : shop_basic_planner_thread.$str83$_, (shop_basic_planner_thread.NIL != plans) ? Functions.apply(Symbols.symbol_function((SubLObject)shop_basic_planner_thread.$sym84$MAX), Mapping.mapcar(Symbols.symbol_function((SubLObject)shop_basic_planner_thread.$sym82$SHOP_PLAN_COST), plans)) : shop_basic_planner_thread.$str83$_, tasks, inferences, Numbers.divide(run_time, time_high.$internal_time_units_per_second$.getGlobalValue()), Numbers.divide(real_time, time_high.$internal_time_units_per_second$.getGlobalValue()) }));
                Dynamic.sublisp_throw((SubLObject)shop_basic_planner_thread.$sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, (SubLObject)shop_basic_planner_thread.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_thread_plans_found(self, plans_found);
                    set_shop_basic_planner_thread_stats_manager(self, stats_manager);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_planner_thread.$sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 8077L)
    public static SubLObject shop_basic_planner_thread_html_stats_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = (SubLObject)shop_basic_planner_thread.NIL;
        final SubLObject plans_found = get_shop_basic_planner_thread_plans_found(self);
        final SubLObject stats_manager = get_shop_basic_planner_thread_stats_manager(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym96$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                final SubLObject plans = instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym27$PLANS_FOUND);
                final SubLObject num_plans = Sequences.length(plans);
                final SubLObject tasks = methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym78$NUMBER_OF_EXPANSIONS);
                final SubLObject inferences = methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym79$NUMBER_OF_INFERENCES);
                final SubLObject run_time = Numbers.divide(methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym97$ELAPSED_RUN_TIME), time_high.$internal_time_units_per_second$.getGlobalValue());
                final SubLObject real_time = Numbers.divide(methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym98$ELAPSED_REAL_TIME), time_high.$internal_time_units_per_second$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                html_utilities.html_markup((SubLObject)shop_basic_planner_thread.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                html_utilities.html_markup((SubLObject)shop_basic_planner_thread.FIVE_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                html_utilities.html_markup((SubLObject)shop_basic_planner_thread.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                    final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)shop_basic_planner_thread.$str99$Plans);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)shop_basic_planner_thread.$str100$MinCost);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)shop_basic_planner_thread.$str101$MaxCost);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)shop_basic_planner_thread.$str102$Expansions);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)shop_basic_planner_thread.$str103$Inferences);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)shop_basic_planner_thread.$str104$CPU_Time);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)shop_basic_planner_thread.$str105$Real_Time);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)shop_basic_planner_thread.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)shop_basic_planner_thread.$kw106$RIGHT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                            html_utilities.html_princ(num_plans);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)shop_basic_planner_thread.$kw106$RIGHT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                            html_utilities.html_princ((SubLObject)((shop_basic_planner_thread.NIL != plans) ? Functions.apply(Symbols.symbol_function((SubLObject)shop_basic_planner_thread.$sym81$MIN), Mapping.mapcar(Symbols.symbol_function((SubLObject)shop_basic_planner_thread.$sym82$SHOP_PLAN_COST), plans)) : shop_basic_planner_thread.$str83$_));
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)shop_basic_planner_thread.$kw106$RIGHT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                            html_utilities.html_princ((SubLObject)((shop_basic_planner_thread.NIL != plans) ? Functions.apply(Symbols.symbol_function((SubLObject)shop_basic_planner_thread.$sym84$MAX), Mapping.mapcar(Symbols.symbol_function((SubLObject)shop_basic_planner_thread.$sym82$SHOP_PLAN_COST), plans)) : shop_basic_planner_thread.$str83$_));
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)shop_basic_planner_thread.$kw106$RIGHT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                            html_utilities.html_princ(tasks);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)shop_basic_planner_thread.$kw106$RIGHT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                            html_utilities.html_princ(inferences);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)shop_basic_planner_thread.$kw106$RIGHT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                            html_utilities.html_princ(run_time);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_align((SubLObject)shop_basic_planner_thread.$kw106$RIGHT));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                            html_utilities.html_princ(real_time);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)shop_basic_planner_thread.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                Dynamic.sublisp_throw((SubLObject)shop_basic_planner_thread.$sym96$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, (SubLObject)shop_basic_planner_thread.NIL);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_thread_plans_found(self, plans_found);
                    set_shop_basic_planner_thread_stats_manager(self, stats_manager);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_planner_thread.$sym96$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 10013L)
    public static SubLObject shop_basic_planner_thread_set_problem_method(final SubLObject self, final SubLObject d) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = (SubLObject)shop_basic_planner_thread.NIL;
        SubLObject problem = get_shop_basic_planner_thread_problem(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym112$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                assert shop_basic_planner_thread.NIL != Types.integerp(d) : d;
                problem = d;
                Dynamic.sublisp_throw((SubLObject)shop_basic_planner_thread.$sym112$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, d);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_thread_problem(self, problem);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_planner_thread.$sym112$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 10162L)
    public static SubLObject shop_basic_planner_thread_get_problem_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = (SubLObject)shop_basic_planner_thread.NIL;
        final SubLObject problem = get_shop_basic_planner_thread_problem(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_planner_thread.$sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, problem);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_thread_problem(self, problem);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_planner_thread.$sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 10252L)
    public static SubLObject shop_basic_planner_thread_get_domain_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = (SubLObject)shop_basic_planner_thread.NIL;
        final SubLObject problem = get_shop_basic_planner_thread_problem(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym121$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_planner_thread.$sym121$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, shop_datastructures.shop_basic_problem_get_domain_method(problem));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_thread_problem(self, problem);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_planner_thread.$sym121$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 10399L)
    public static SubLObject shop_basic_planner_thread_get_which_plans_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = (SubLObject)shop_basic_planner_thread.NIL;
        final SubLObject which_plans = get_shop_basic_planner_thread_which_plans(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym125$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_planner_thread.$sym125$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, which_plans);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_thread_which_plans(self, which_plans);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_planner_thread.$sym125$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 10518L)
    public static SubLObject shop_basic_planner_thread_set_which_plans_method(final SubLObject self, final SubLObject w) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = (SubLObject)shop_basic_planner_thread.NIL;
        SubLObject which_plans = get_shop_basic_planner_thread_which_plans(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym130$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                which_plans = w;
                Dynamic.sublisp_throw((SubLObject)shop_basic_planner_thread.$sym130$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, w);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_thread_which_plans(self, which_plans);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_planner_thread.$sym130$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 10634L)
    public static SubLObject shop_basic_planner_thread_init_plan_state_method(final SubLObject self, final SubLObject problem) {
        instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym11$PROBLEM, problem);
        instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym8$INITIAL_PLAN_STATE, object.object_new_method((SubLObject)shop_basic_planner_thread.$sym136$SHOP_BASIC_PLAN_STATE));
        shop_basic_plan_state.shop_basic_plan_state_initialize_plan_state_with_problem_method(instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym8$INITIAL_PLAN_STATE), problem, self);
        return (SubLObject)shop_basic_planner_thread.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 11204L)
    public static SubLObject shop_basic_planner_thread_init_planner_thread_method(final SubLObject self, final SubLObject new_problem, final SubLObject which, final SubLObject verbose, final SubLObject number, final SubLObject time, final SubLObject depth) {
        if (shop_basic_planner_thread.NIL != depth) {
            instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym23$DEPTH_CUTOFF, depth);
        }
        if (shop_basic_planner_thread.NIL != time) {
            instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym22$TIME_CUTOFF, Numbers.multiply(time, time_high.$internal_time_units_per_second$.getGlobalValue()));
        }
        if (shop_basic_planner_thread.NIL != number) {
            instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym24$NUMBER_CUTOFF, number);
        }
        instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym19$WHICH_PLANS, which);
        instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym25$PLAN_NUMBER, (SubLObject)shop_basic_planner_thread.ZERO_INTEGER);
        instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym26$PLAN_NUMBER_TO_CUTOFF, (SubLObject)shop_basic_planner_thread.ZERO_INTEGER);
        methods.funcall_instance_method_with_1_args(instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym9$LOG), (SubLObject)shop_basic_planner_thread.$sym141$SET_VERBOSITY, verbose);
        if (shop_basic_planner_thread.NIL == instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym11$PROBLEM)) {
            shop_basic_planner_thread_init_plan_state_method(self, new_problem);
            instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym10$OPEN_NODES, (SubLObject)ConsesLow.list(instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym8$INITIAL_PLAN_STATE)));
        }
        return (SubLObject)shop_basic_planner_thread.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 12262L)
    public static SubLObject shop_basic_planner_thread_found_plan_method(final SubLObject self, final SubLObject plan_state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym25$PLAN_NUMBER, Numbers.add((SubLObject)shop_basic_planner_thread.ONE_INTEGER, instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym25$PLAN_NUMBER)));
        instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym26$PLAN_NUMBER_TO_CUTOFF, Numbers.add((SubLObject)shop_basic_planner_thread.ONE_INTEGER, instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym26$PLAN_NUMBER_TO_CUTOFF)));
        final SubLObject new_plan = object.object_new_method((SubLObject)shop_basic_planner_thread.$sym145$SHOP_BASIC_PLAN);
        final SubLObject depth = methods.funcall_instance_method_with_0_args(plan_state, (SubLObject)shop_basic_planner_thread.$sym51$DEPTH);
        final SubLObject which_plans = instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym19$WHICH_PLANS);
        shop_basic_plan.shop_basic_plan_populate_plan_method(new_plan, plan_state);
        final SubLObject pcase_var = which_plans;
        if (pcase_var.eql((SubLObject)shop_basic_planner_thread.$kw146$SHALLOWEST)) {
            instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym23$DEPTH_CUTOFF, number_utilities.f_1_(depth));
            instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym27$PLANS_FOUND, (SubLObject)ConsesLow.list(new_plan));
        }
        else if (pcase_var.eql((SubLObject)shop_basic_planner_thread.$kw147$ALL_SHALLOWEST)) {
            if (!instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym23$DEPTH_CUTOFF).equal(depth)) {
                instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym27$PLANS_FOUND, (SubLObject)shop_basic_planner_thread.NIL);
                instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym23$DEPTH_CUTOFF, depth);
            }
            instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym27$PLANS_FOUND, (SubLObject)ConsesLow.cons(new_plan, instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym27$PLANS_FOUND)));
        }
        else if (pcase_var.eql((SubLObject)shop_basic_planner_thread.$kw148$ALL) || pcase_var.eql((SubLObject)shop_basic_planner_thread.$kw149$FIRST)) {
            instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym27$PLANS_FOUND, (SubLObject)ConsesLow.cons(new_plan, instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym27$PLANS_FOUND)));
        }
        else {
            Errors.cerror((SubLObject)shop_basic_planner_thread.$str150$invalid_keyword__S, which_plans);
        }
        final SubLObject entry = conses_high.assoc((SubLObject)shop_basic_planner_thread.$kw151$CUTOFFS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_planner_thread.UNPROVIDED, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
        final SubLObject verbose_msg_level = (SubLObject)((shop_basic_planner_thread.NIL != entry) ? entry.rest() : shop_basic_planner_thread.ZERO_INTEGER);
        final SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym9$LOG), (SubLObject)shop_basic_planner_thread.$sym152$VERBOSE);
        if (verbose_thread_level.numGE(verbose_msg_level)) {
            methods.funcall_instance_method_with_1_args(instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym9$LOG), (SubLObject)shop_basic_planner_thread.$sym153$SUCCESS, PrintLow.format((SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.$str154$depth__s_found_plan___s, depth, Sequences.length(instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym27$PLANS_FOUND))));
        }
        return (SubLObject)ConsesLow.list((SubLObject)shop_basic_planner_thread.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 13815L)
    public static SubLObject shop_basic_planner_thread_halt_status_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = (SubLObject)shop_basic_planner_thread.NIL;
        final SubLObject halt_status = get_shop_basic_planner_thread_halt_status(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym157$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_planner_thread.$sym157$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, halt_status);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_thread_halt_status(self, halt_status);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_planner_thread.$sym157$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 13910L)
    public static SubLObject shop_basic_planner_thread_update_halt_status_method(final SubLObject self) {
        final SubLObject open_nodes = instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym10$OPEN_NODES);
        if (shop_basic_planner_thread.NIL == open_nodes) {
            instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym7$HALT_STATUS, (SubLObject)shop_basic_planner_thread.$kw161$SEARCH_EXHAUSTED);
        }
        else if (shop_basic_planner_thread.NIL != shop_basic_planner_thread_time_cutoff_reachedP_method(self)) {
            instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym7$HALT_STATUS, (SubLObject)shop_basic_planner_thread.$kw162$TIME_CUTOFF);
        }
        else if (shop_basic_planner_thread.NIL != shop_basic_planner_thread_depth_cutoff_reachedP_method(self, open_nodes.first())) {
            instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym7$HALT_STATUS, (SubLObject)shop_basic_planner_thread.$kw163$DEPTH_CUTOFF);
        }
        else if (shop_basic_planner_thread.NIL != shop_basic_planner_thread_number_cutoff_reachedP_method(self)) {
            instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym26$PLAN_NUMBER_TO_CUTOFF, (SubLObject)shop_basic_planner_thread.ZERO_INTEGER);
            instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym7$HALT_STATUS, (SubLObject)shop_basic_planner_thread.$kw164$NUMBER_CUTOFF);
        }
        return (SubLObject)shop_basic_planner_thread.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 14490L)
    public static SubLObject shop_basic_planner_thread_seek_plans_method(final SubLObject self) {
        if (shop_basic_planner_thread.NIL == shop_basic_planner_thread_any_cutoff_reachedP_method(self)) {
            SubLObject open_nodes;
            SubLObject cur_node;
            for (open_nodes = (SubLObject)shop_basic_planner_thread.NIL, open_nodes = instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym10$OPEN_NODES); shop_basic_planner_thread.NIL != open_nodes; open_nodes = open_nodes) {
                if (shop_basic_planner_thread.NIL != shop_basic_planner_thread_any_cutoff_reachedP_method(self)) {
                    shop_planner_thread_pause(self);
                }
                shop_process_checkpoint(self);
                shop_internals.shop_statistic_manager_add_expansion_method(instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym1$STATS_MANAGER));
                cur_node = open_nodes.first();
                open_nodes = open_nodes.rest();
                if (shop_basic_planner_thread.NIL == instances.get_slot(cur_node, (SubLObject)shop_basic_planner_thread.$sym168$TASKLIST)) {
                    shop_basic_planner_thread_found_plan_method(self, cur_node);
                    instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym10$OPEN_NODES, open_nodes);
                }
                else {
                    open_nodes = ConsesLow.append(shop_basic_plan_state.shop_basic_plan_state_expand_method(cur_node), open_nodes);
                    instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym10$OPEN_NODES, open_nodes);
                }
            }
            return (SubLObject)shop_basic_planner_thread.NIL;
        }
        return (SubLObject)shop_basic_planner_thread.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 15417L)
    public static SubLObject shop_basic_planner_thread_seek_plans_with_iterative_deepening_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = (SubLObject)shop_basic_planner_thread.NIL;
        final SubLObject plans_found = get_shop_basic_planner_thread_plans_found(self);
        final SubLObject depth_cutoff = get_shop_basic_planner_thread_depth_cutoff(self);
        final SubLObject stats_manager = get_shop_basic_planner_thread_stats_manager(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym172$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                SubLObject last_iteration_expansions = (SubLObject)shop_basic_planner_thread.ZERO_INTEGER;
                SubLObject last_iteration_inferences = (SubLObject)shop_basic_planner_thread.ZERO_INTEGER;
                methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym173$START_TIMING);
                shop_basic_planner_thread_print_stats_header_method(self, (SubLObject)shop_basic_planner_thread.$str174$Depth);
                SubLObject cur_depth = (SubLObject)shop_basic_planner_thread.NIL;
                cur_depth = (SubLObject)shop_basic_planner_thread.ZERO_INTEGER;
                while (shop_basic_planner_thread.NIL == instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym27$PLANS_FOUND)) {
                    last_iteration_expansions = methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym78$NUMBER_OF_EXPANSIONS);
                    last_iteration_inferences = methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym79$NUMBER_OF_INFERENCES);
                    methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym175$RESET_COUNTERS);
                    instances.set_slot(self, (SubLObject)shop_basic_planner_thread.$sym23$DEPTH_CUTOFF, cur_depth);
                    shop_basic_planner_thread_seek_plans_method(self);
                    shop_basic_planner_thread_print_iterative_deepening_stats_method(self, cur_depth);
                    if (Numbers.subtract(last_iteration_expansions, methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym78$NUMBER_OF_EXPANSIONS)).isZero() || Numbers.subtract(last_iteration_inferences, methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym79$NUMBER_OF_INFERENCES)).isZero()) {
                        Errors.cerror((SubLObject)shop_basic_planner_thread.$str176$Error, (SubLObject)shop_basic_planner_thread.$str177$No_expansions_or_inferences___add);
                    }
                    cur_depth = number_utilities.f_1X(cur_depth);
                }
                methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym2$STOP_TIMING);
                Dynamic.sublisp_throw((SubLObject)shop_basic_planner_thread.$sym172$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, (SubLObject)shop_basic_planner_thread.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_thread_plans_found(self, plans_found);
                    set_shop_basic_planner_thread_depth_cutoff(self, depth_cutoff);
                    set_shop_basic_planner_thread_stats_manager(self, stats_manager);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_planner_thread.$sym172$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 16570L)
    public static SubLObject shop_basic_planner_thread_gather_initial_state_method(final SubLObject self, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject init_mts = (SubLObject)shop_basic_planner_thread.NIL;
        SubLObject node_var = mt;
        final SubLObject deck_type = (SubLObject)shop_basic_planner_thread.$kw184$STACK;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = (SubLObject)shop_basic_planner_thread.NIL;
                final SubLObject _prev_bind_0_$17 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind((shop_basic_planner_thread.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((shop_basic_planner_thread.NIL != tv_var) ? shop_basic_planner_thread.$sym185$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                    if (shop_basic_planner_thread.NIL != tv_var && shop_basic_planner_thread.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && shop_basic_planner_thread.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql((SubLObject)shop_basic_planner_thread.$kw186$ERROR)) {
                            sbhl_paranoia.sbhl_error((SubLObject)shop_basic_planner_thread.ONE_INTEGER, (SubLObject)shop_basic_planner_thread.$str187$_A_is_not_a__A, tv_var, (SubLObject)shop_basic_planner_thread.$sym188$SBHL_TRUE_TV_P, (SubLObject)shop_basic_planner_thread.UNPROVIDED, (SubLObject)shop_basic_planner_thread.UNPROVIDED, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)shop_basic_planner_thread.$kw189$CERROR)) {
                            sbhl_paranoia.sbhl_cerror((SubLObject)shop_basic_planner_thread.ONE_INTEGER, (SubLObject)shop_basic_planner_thread.$str190$continue_anyway, (SubLObject)shop_basic_planner_thread.$str187$_A_is_not_a__A, tv_var, (SubLObject)shop_basic_planner_thread.$sym188$SBHL_TRUE_TV_P, (SubLObject)shop_basic_planner_thread.UNPROVIDED, (SubLObject)shop_basic_planner_thread.UNPROVIDED, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)shop_basic_planner_thread.$kw191$WARN)) {
                            Errors.warn((SubLObject)shop_basic_planner_thread.$str187$_A_is_not_a__A, tv_var, (SubLObject)shop_basic_planner_thread.$sym188$SBHL_TRUE_TV_P);
                        }
                        else {
                            Errors.warn((SubLObject)shop_basic_planner_thread.$str192$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror((SubLObject)shop_basic_planner_thread.$str190$continue_anyway, (SubLObject)shop_basic_planner_thread.$str187$_A_is_not_a__A, tv_var, (SubLObject)shop_basic_planner_thread.$sym188$SBHL_TRUE_TV_P);
                        }
                    }
                    final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(shop_basic_planner_thread.$const193$genlMt), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(shop_basic_planner_thread.$const193$genlMt)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(shop_basic_planner_thread.$const193$genlMt)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)shop_basic_planner_thread.NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(shop_basic_planner_thread.$const193$genlMt), thread);
                        if (shop_basic_planner_thread.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || shop_basic_planner_thread.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(mt, sbhl_module_vars.get_sbhl_module((SubLObject)shop_basic_planner_thread.UNPROVIDED))) {
                            final SubLObject _prev_bind_0_$19 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$20 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(shop_basic_planner_thread.$const193$genlMt)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)shop_basic_planner_thread.NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                                while (shop_basic_planner_thread.NIL != node_var) {
                                    final SubLObject genl_mt = node_var;
                                    if (shop_basic_planner_thread.NIL == subl_promotions.memberP(genl_mt, init_mts, (SubLObject)shop_basic_planner_thread.UNPROVIDED, (SubLObject)shop_basic_planner_thread.UNPROVIDED) && shop_basic_planner_thread.NIL != isa.isaP(genl_mt, shop_basic_planner_thread.$const194$PlanDynamicSituationMicrotheory, (SubLObject)shop_basic_planner_thread.UNPROVIDED, (SubLObject)shop_basic_planner_thread.UNPROVIDED)) {
                                        init_mts = (SubLObject)ConsesLow.cons(genl_mt, init_mts);
                                    }
                                    SubLObject cdolist_list_var;
                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(shop_basic_planner_thread.$const193$genlMt));
                                    SubLObject module_var = (SubLObject)shop_basic_planner_thread.NIL;
                                    module_var = cdolist_list_var.first();
                                    while (shop_basic_planner_thread.NIL != cdolist_list_var) {
                                        final SubLObject _prev_bind_0_$20 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((shop_basic_planner_thread.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)shop_basic_planner_thread.UNPROVIDED, (SubLObject)shop_basic_planner_thread.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(shop_basic_planner_thread.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                            final SubLObject node = function_terms.naut_to_nart(node_var);
                                            if (shop_basic_planner_thread.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)shop_basic_planner_thread.UNPROVIDED));
                                                if (shop_basic_planner_thread.NIL != d_link) {
                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)shop_basic_planner_thread.UNPROVIDED));
                                                    if (shop_basic_planner_thread.NIL != mt_links) {
                                                        SubLObject iteration_state;
                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); shop_basic_planner_thread.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject mt_$25 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (shop_basic_planner_thread.NIL != mt_relevance_macros.relevant_mtP(mt_$25)) {
                                                                final SubLObject _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$25, thread);
                                                                    SubLObject iteration_state_$27;
                                                                    for (iteration_state_$27 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); shop_basic_planner_thread.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$27); iteration_state_$27 = dictionary_contents.do_dictionary_contents_next(iteration_state_$27)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$27);
                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (shop_basic_planner_thread.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                            final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                final SubLObject sol = link_nodes;
                                                                                if (shop_basic_planner_thread.NIL != set.set_p(sol)) {
                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                    SubLObject basis_object;
                                                                                    SubLObject state;
                                                                                    SubLObject node_vars_link_node;
                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)shop_basic_planner_thread.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); shop_basic_planner_thread.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                        if (shop_basic_planner_thread.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && shop_basic_planner_thread.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)shop_basic_planner_thread.UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (sol.isList()) {
                                                                                    SubLObject csome_list_var = sol;
                                                                                    SubLObject node_vars_link_node2 = (SubLObject)shop_basic_planner_thread.NIL;
                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                    while (shop_basic_planner_thread.NIL != csome_list_var) {
                                                                                        if (shop_basic_planner_thread.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)shop_basic_planner_thread.UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                        }
                                                                                        csome_list_var = csome_list_var.rest();
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)shop_basic_planner_thread.$str195$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$22, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$27);
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$21, thread);
                                                                }
                                                            }
                                                        }
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                    }
                                                }
                                                else {
                                                    sbhl_paranoia.sbhl_error((SubLObject)shop_basic_planner_thread.FIVE_INTEGER, (SubLObject)shop_basic_planner_thread.$str196$attempting_to_bind_direction_link, (SubLObject)shop_basic_planner_thread.UNPROVIDED, (SubLObject)shop_basic_planner_thread.UNPROVIDED, (SubLObject)shop_basic_planner_thread.UNPROVIDED, (SubLObject)shop_basic_planner_thread.UNPROVIDED, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                                                }
                                            }
                                            else if (shop_basic_planner_thread.NIL != obsolete.cnat_p(node, (SubLObject)shop_basic_planner_thread.UNPROVIDED)) {
                                                SubLObject cdolist_list_var_$29;
                                                final SubLObject new_list = cdolist_list_var_$29 = ((shop_basic_planner_thread.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)shop_basic_planner_thread.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)shop_basic_planner_thread.UNPROVIDED)));
                                                SubLObject generating_fn = (SubLObject)shop_basic_planner_thread.NIL;
                                                generating_fn = cdolist_list_var_$29.first();
                                                while (shop_basic_planner_thread.NIL != cdolist_list_var_$29) {
                                                    final SubLObject _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                    try {
                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                        final SubLObject sol2;
                                                        final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                        if (shop_basic_planner_thread.NIL != set.set_p(sol2)) {
                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                            SubLObject basis_object2;
                                                            SubLObject state2;
                                                            SubLObject node_vars_link_node3;
                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)shop_basic_planner_thread.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); shop_basic_planner_thread.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                if (shop_basic_planner_thread.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && shop_basic_planner_thread.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)shop_basic_planner_thread.UNPROVIDED)) {
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                }
                                                            }
                                                        }
                                                        else if (sol2.isList()) {
                                                            SubLObject csome_list_var2 = sol2;
                                                            SubLObject node_vars_link_node4 = (SubLObject)shop_basic_planner_thread.NIL;
                                                            node_vars_link_node4 = csome_list_var2.first();
                                                            while (shop_basic_planner_thread.NIL != csome_list_var2) {
                                                                if (shop_basic_planner_thread.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)shop_basic_planner_thread.UNPROVIDED)) {
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                node_vars_link_node4 = csome_list_var2.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)shop_basic_planner_thread.$str195$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$23, thread);
                                                    }
                                                    cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                                                    generating_fn = cdolist_list_var_$29.first();
                                                }
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$21, thread);
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$20, thread);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        module_var = cdolist_list_var.first();
                                    }
                                    node_var = deck.deck_pop(recur_deck);
                                }
                            }
                            finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$22, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$20, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$19, thread);
                            }
                        }
                        else {
                            sbhl_paranoia.sbhl_warn((SubLObject)shop_basic_planner_thread.TWO_INTEGER, (SubLObject)shop_basic_planner_thread.$str197$Node__a_does_not_pass_sbhl_type_t, mt, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)shop_basic_planner_thread.UNPROVIDED)), (SubLObject)shop_basic_planner_thread.UNPROVIDED, (SubLObject)shop_basic_planner_thread.UNPROVIDED, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                        }
                    }
                    finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$19, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$18, thread);
                    }
                }
                finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$17, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return Mapping.mapcar((SubLObject)shop_basic_planner_thread.$sym198$ASSERTION_HL_FORMULA, Functions.apply((SubLObject)shop_basic_planner_thread.$sym199$APPEND, Mapping.mapcar((SubLObject)shop_basic_planner_thread.$sym200$GATHER_MT_INDEX, init_mts)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 17007L)
    public static SubLObject shop_basic_planner_thread_make_problem_method(final SubLObject self, final SubLObject problem_name, final SubLObject state, final SubLObject tasks, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = (SubLObject)shop_basic_planner_thread.NIL;
        final SubLObject planner = get_shop_basic_planner_thread_planner(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym205$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                SubLObject domain = (SubLObject)shop_basic_planner_thread.NIL;
                SubLObject new_problem = (SubLObject)shop_basic_planner_thread.NIL;
                SubLObject new_world_state = (SubLObject)shop_basic_planner_thread.NIL;
                new_problem = object.object_new_method((SubLObject)shop_basic_planner_thread.$sym206$SHOP_BASIC_PROBLEM);
                if (shop_basic_planner_thread.NIL != shop_parameters.$shop_use_mt_world_statesP$.getDynamicValue(thread)) {
                    new_world_state = object.object_new_method((SubLObject)shop_basic_planner_thread.$sym207$SHOP_MT_WORLD_STATE);
                    instances.set_slot(new_world_state, (SubLObject)shop_basic_planner_thread.$sym208$MT, mt);
                }
                else {
                    new_world_state = object.object_new_method((SubLObject)shop_basic_planner_thread.$sym209$SHOP_BASIC_WORLD_STATE);
                }
                domain = methods.funcall_instance_method_with_1_args(planner, (SubLObject)shop_basic_planner_thread.$sym119$GET_DOMAIN, mt);
                shop_datastructures.shop_basic_problem_initialize_problem_method(new_problem, problem_name, domain, new_world_state, tasks, mt);
                Dynamic.sublisp_throw((SubLObject)shop_basic_planner_thread.$sym205$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, new_problem);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_thread_planner(self, planner);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_planner_thread.$sym205$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 17917L)
    public static SubLObject shop_basic_planner_thread_make_problem_from_formula_method(final SubLObject self, final SubLObject formula, final SubLObject mt) {
        final SubLObject hl_formula = shop_reify_narts_in_expression(formula);
        final SubLObject cyc_tasks = (SubLObject)ConsesLow.list(hl_formula);
        final SubLObject initial_state = (SubLObject)shop_basic_planner_thread.NIL;
        SubLObject new_problem = (SubLObject)shop_basic_planner_thread.NIL;
        new_problem = methods.funcall_instance_method_with_4_args(self, (SubLObject)shop_basic_planner_thread.$sym202$MAKE_PROBLEM, formula, initial_state, cyc_tasks, mt);
        return new_problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 18384L)
    public static SubLObject shop_basic_planner_thread_find_plans_method(final SubLObject self, final SubLObject task_formula, final SubLObject mt, SubLObject which, SubLObject verbosity, SubLObject number, SubLObject time, SubLObject depth) {
        if (which == shop_basic_planner_thread.UNPROVIDED) {
            which = (SubLObject)shop_basic_planner_thread.$kw148$ALL;
        }
        if (verbosity == shop_basic_planner_thread.UNPROVIDED) {
            verbosity = (SubLObject)shop_basic_planner_thread.ZERO_INTEGER;
        }
        if (number == shop_basic_planner_thread.UNPROVIDED) {
            number = (SubLObject)shop_basic_planner_thread.NIL;
        }
        if (time == shop_basic_planner_thread.UNPROVIDED) {
            time = (SubLObject)shop_basic_planner_thread.NIL;
        }
        if (depth == shop_basic_planner_thread.UNPROVIDED) {
            depth = (SubLObject)shop_basic_planner_thread.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_problem = shop_basic_planner_thread_make_problem_from_formula_method(self, task_formula, mt);
        SubLObject domain = (SubLObject)shop_basic_planner_thread.NIL;
        shop_basic_planner_thread_init_planner_thread_method(self, new_problem, which, verbosity, number, time, depth);
        if (shop_basic_planner_thread.NIL != shop_internals.$shop_gc$.getDynamicValue(thread)) {
            Storage.gc((SubLObject)shop_basic_planner_thread.UNPROVIDED);
        }
        domain = shop_domain.shop_basic_domain_get_name_method(instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym11$PROBLEM), (SubLObject)shop_basic_planner_thread.$sym219$DOMAIN));
        SubLObject entry = conses_high.assoc((SubLObject)shop_basic_planner_thread.ONE_INTEGER, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_planner_thread.UNPROVIDED, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
        SubLObject verbose_msg_level = (SubLObject)((shop_basic_planner_thread.NIL != entry) ? entry.rest() : shop_basic_planner_thread.ZERO_INTEGER);
        SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym9$LOG), (SubLObject)shop_basic_planner_thread.$sym152$VERBOSE);
        if (verbose_thread_level.numGE(verbose_msg_level)) {
            PrintLow.format((SubLObject)shop_basic_planner_thread.T, (SubLObject)shop_basic_planner_thread.$str220$Problem___s_Domain___s_Plans___s_, new SubLObject[] { new_problem, domain, which, verbosity });
        }
        final SubLObject pcase_var = which;
        if (pcase_var.eql((SubLObject)shop_basic_planner_thread.$kw221$ID_FIRST) || pcase_var.eql((SubLObject)shop_basic_planner_thread.$kw222$ID_ALL)) {
            shop_basic_planner_thread_seek_plans_with_iterative_deepening_method(self);
        }
        else if (pcase_var.eql((SubLObject)shop_basic_planner_thread.$kw149$FIRST) || pcase_var.eql((SubLObject)shop_basic_planner_thread.$kw148$ALL) || pcase_var.eql((SubLObject)shop_basic_planner_thread.$kw146$SHALLOWEST) || pcase_var.eql((SubLObject)shop_basic_planner_thread.$kw147$ALL_SHALLOWEST)) {
            methods.funcall_instance_method_with_0_args(get_shop_basic_planner_thread_stats_manager(self), (SubLObject)shop_basic_planner_thread.$sym173$START_TIMING);
            shop_basic_planner_thread_seek_plans_method(self);
            methods.funcall_instance_method_with_0_args(get_shop_basic_planner_thread_stats_manager(self), (SubLObject)shop_basic_planner_thread.$sym2$STOP_TIMING);
        }
        else {
            Errors.cerror((SubLObject)shop_basic_planner_thread.$str150$invalid_keyword__S, which);
        }
        entry = conses_high.assoc((SubLObject)shop_basic_planner_thread.ONE_INTEGER, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_planner_thread.UNPROVIDED, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
        verbose_msg_level = (SubLObject)((shop_basic_planner_thread.NIL != entry) ? entry.rest() : shop_basic_planner_thread.ZERO_INTEGER);
        verbose_thread_level = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym9$LOG), (SubLObject)shop_basic_planner_thread.$sym152$VERBOSE);
        if (verbose_thread_level.numGE(verbose_msg_level)) {
            shop_basic_planner_thread_output_message_method(self, Sequences.cconcatenate((SubLObject)shop_basic_planner_thread.$str223$Halted_Because__, PrintLow.write_to_string(shop_basic_planner_thread_halt_status_method(self), shop_basic_planner_thread.EMPTY_SUBL_OBJECT_ARRAY)));
            shop_basic_planner_thread_print_stats_header_method(self, (SubLObject)shop_basic_planner_thread.$str224$Totals_);
            shop_basic_planner_thread_print_stats_method(self);
        }
        return instances.get_slot(self, (SubLObject)shop_basic_planner_thread.$sym27$PLANS_FOUND);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 19817L)
    public static SubLObject shop_basic_planner_thread_completed_runP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = (SubLObject)shop_basic_planner_thread.NIL;
        final SubLObject open_nodes = get_shop_basic_planner_thread_open_nodes(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym228$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_planner_thread.$sym228$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, Types.sublisp_null(open_nodes));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_thread_open_nodes(self, open_nodes);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_planner_thread.$sym228$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 19942L)
    public static SubLObject shop_basic_planner_thread_summary_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = (SubLObject)shop_basic_planner_thread.NIL;
        final SubLObject plans_found = get_shop_basic_planner_thread_plans_found(self);
        final SubLObject problem = get_shop_basic_planner_thread_problem(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym232$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                final SubLObject task_list = methods.funcall_instance_method_with_0_args(problem, (SubLObject)shop_basic_planner_thread.$sym233$GET_TASKS);
                final SubLObject task = task_list.first();
                final SubLObject completed_runP = shop_basic_planner_thread_completed_runP_method(self);
                final SubLObject plan_count = Sequences.length(plans_found);
                Dynamic.sublisp_throw((SubLObject)shop_basic_planner_thread.$sym232$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, (SubLObject)ConsesLow.list(task, completed_runP, plan_count));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_thread_plans_found(self, plans_found);
                    set_shop_basic_planner_thread_problem(self, problem);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_planner_thread.$sym232$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 20341L)
    public static SubLObject shop_basic_planner_thread_html_display_summary_method(final SubLObject self, final SubLObject paraphrase_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_thread_method = (SubLObject)shop_basic_planner_thread.NIL;
        final SubLObject plans_found = get_shop_basic_planner_thread_plans_found(self);
        final SubLObject problem = get_shop_basic_planner_thread_problem(self);
        try {
            thread.throwStack.push(shop_basic_planner_thread.$sym238$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
            try {
                final SubLObject task_list = methods.funcall_instance_method_with_0_args(problem, (SubLObject)shop_basic_planner_thread.$sym233$GET_TASKS);
                final SubLObject task = task_list.first();
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)shop_basic_planner_thread.$kw106$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    pph_html.html_text_with_target(task, paraphrase_link, (SubLObject)shop_basic_planner_thread.UNPROVIDED, (SubLObject)shop_basic_planner_thread.UNPROVIDED, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)shop_basic_planner_thread.$kw106$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
                _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    if (shop_basic_planner_thread.NIL != shop_basic_planner_thread_completed_runP_method(self)) {
                        final SubLObject plan_count = Sequences.length(plans_found);
                        if (plan_count.isZero()) {
                            html_utilities.html_princ((SubLObject)shop_basic_planner_thread.$str239$No_plans_found);
                        }
                        else if (shop_basic_planner_thread.ONE_INTEGER.eql(plan_count)) {
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)shop_basic_planner_thread.$str240$_A_Plan_found, plan_count);
                        }
                        else {
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)shop_basic_planner_thread.$str241$_A_Plans_found, plan_count);
                        }
                    }
                    else {
                        html_utilities.html_princ((SubLObject)shop_basic_planner_thread.$str242$Not_Completed);
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                Dynamic.sublisp_throw((SubLObject)shop_basic_planner_thread.$sym238$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, (SubLObject)shop_basic_planner_thread.NIL);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_planner_thread.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_thread_plans_found(self, plans_found);
                    set_shop_basic_planner_thread_problem(self, problem);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_planner_thread.$sym238$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_thread_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 21172L)
    public static SubLObject mapcar_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method = (SubLObject)shop_basic_planner_thread.NIL;
        SubLObject v_class = (SubLObject)shop_basic_planner_thread.NIL;
        SubLObject list = (SubLObject)shop_basic_planner_thread.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_planner_thread.$list244);
        method = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_planner_thread.$list244);
        v_class = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_planner_thread.$list244);
        list = current.first();
        current = current.rest();
        if (shop_basic_planner_thread.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)shop_basic_planner_thread.$sym245$FWHEN, (SubLObject)ConsesLow.list((SubLObject)shop_basic_planner_thread.$sym246$SUBLOOP_TYPE_P, v_class), (SubLObject)ConsesLow.listS((SubLObject)shop_basic_planner_thread.$sym247$CLET, (SubLObject)shop_basic_planner_thread.$list248, (SubLObject)ConsesLow.list((SubLObject)shop_basic_planner_thread.$sym249$CDOLIST, (SubLObject)ConsesLow.list((SubLObject)shop_basic_planner_thread.$sym250$CUR_ITEM, list), (SubLObject)ConsesLow.listS((SubLObject)shop_basic_planner_thread.$sym251$CPUSH, (SubLObject)ConsesLow.listS((SubLObject)shop_basic_planner_thread.$sym252$INLINE_METHOD, (SubLObject)ConsesLow.list(method, v_class), (SubLObject)shop_basic_planner_thread.$list253), (SubLObject)shop_basic_planner_thread.$list254)), (SubLObject)shop_basic_planner_thread.$list255));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)shop_basic_planner_thread.$list244);
        return (SubLObject)shop_basic_planner_thread.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 21425L)
    public static SubLObject shop_plan_cost(final SubLObject plan) {
        return Sequences.length(shop_basic_plan.shop_basic_plan_primitive_form_method(plan));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 21541L)
    public static SubLObject shop_reifiable_natP(final SubLObject nat) {
        if (shop_basic_planner_thread.NIL != obsolete.reifiable_natP(nat, (SubLObject)shop_basic_planner_thread.UNPROVIDED, (SubLObject)shop_basic_planner_thread.UNPROVIDED) && shop_basic_planner_thread.NIL != czer_utilities.el_find_nart(nat)) {
            return (SubLObject)shop_basic_planner_thread.T;
        }
        return (SubLObject)shop_basic_planner_thread.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 21675L)
    public static SubLObject shop_reify_narts_in_expression(final SubLObject task) {
        return cycl_utilities.expression_ntransform(task, (SubLObject)shop_basic_planner_thread.$sym256$SHOP_REIFIABLE_NAT_, (SubLObject)shop_basic_planner_thread.$sym257$FIND_WHEN_CLOSED_NAUT, (SubLObject)shop_basic_planner_thread.UNPROVIDED, (SubLObject)shop_basic_planner_thread.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 21814L)
    public static SubLObject shop_planner_thread_p(final SubLObject thread) {
        return shop_basic_planner_thread_p(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 22064L)
    public static SubLObject shop_planner_thread_plans_found(final SubLObject thread) {
        if (shop_basic_planner_thread.NIL == thread) {
            return (SubLObject)shop_basic_planner_thread.NIL;
        }
        return instances.get_slot(thread, (SubLObject)shop_basic_planner_thread.$sym27$PLANS_FOUND);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 22238L)
    public static SubLObject shop_planner_thread_num_plans_found(final SubLObject thread) {
        if (shop_basic_planner_thread.NIL == thread) {
            return (SubLObject)shop_basic_planner_thread.NIL;
        }
        return instances.get_slot(thread, (SubLObject)shop_basic_planner_thread.$sym25$PLAN_NUMBER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 22416L)
    public static SubLObject shop_planner_thread_num_open_nodes(final SubLObject thread) {
        if (shop_basic_planner_thread.NIL == thread) {
            return (SubLObject)shop_basic_planner_thread.NIL;
        }
        return Sequences.length(instances.get_slot(thread, (SubLObject)shop_basic_planner_thread.$sym10$OPEN_NODES));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 22603L)
    public static SubLObject shop_planner_thread_num_inferences(final SubLObject thread) {
        if (shop_basic_planner_thread.NIL == thread) {
            return (SubLObject)shop_basic_planner_thread.NIL;
        }
        final SubLObject stats_manager = instances.get_slot(thread, (SubLObject)shop_basic_planner_thread.$sym1$STATS_MANAGER);
        return methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym79$NUMBER_OF_INFERENCES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 22875L)
    public static SubLObject shop_planner_thread_nodes_expanded(final SubLObject thread) {
        if (shop_basic_planner_thread.NIL == thread) {
            return (SubLObject)shop_basic_planner_thread.NIL;
        }
        final SubLObject stats_manager = instances.get_slot(thread, (SubLObject)shop_basic_planner_thread.$sym1$STATS_MANAGER);
        return methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym78$NUMBER_OF_EXPANSIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 23147L)
    public static SubLObject shop_planner_thread_task(final SubLObject thread) {
        if (shop_basic_planner_thread.NIL == thread) {
            return (SubLObject)shop_basic_planner_thread.NIL;
        }
        final SubLObject problem = instances.get_slot(thread, (SubLObject)shop_basic_planner_thread.$sym11$PROBLEM);
        if (shop_basic_planner_thread.NIL == problem) {
            return (SubLObject)shop_basic_planner_thread.NIL;
        }
        return shop_datastructures.shop_basic_problem_get_tasks_method(problem).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 23451L)
    public static SubLObject shop_planner_thread_pause(final SubLObject thread) {
        assert shop_basic_planner_thread.NIL != shop_planner_thread_p(thread) : thread;
        final SubLObject pw = instances.get_slot(thread, (SubLObject)shop_basic_planner_thread.$sym0$P_WRAPPER);
        final SubLObject stats_manager = instances.get_slot(thread, (SubLObject)shop_basic_planner_thread.$sym1$STATS_MANAGER);
        methods.funcall_instance_method_with_0_args(thread, (SubLObject)shop_basic_planner_thread.$sym159$UPDATE_HALT_STATUS);
        methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym2$STOP_TIMING);
        if (shop_basic_planner_thread.NIL != pw) {
            process_utilities.process_wrapper_block(pw);
        }
        methods.funcall_instance_method_with_0_args(stats_manager, (SubLObject)shop_basic_planner_thread.$sym3$RESUME_TIMING);
        instances.set_slot(thread, (SubLObject)shop_basic_planner_thread.$sym7$HALT_STATUS, (SubLObject)shop_basic_planner_thread.NIL);
        return (SubLObject)shop_basic_planner_thread.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 23977L)
    public static SubLObject shop_plan_process_set_thread(final SubLObject pw, final SubLObject thread) {
        return process_utilities.process_wrapper_set_property(pw, (SubLObject)shop_basic_planner_thread.$kw259$THREAD_STRUCTURE, thread);
    }
    
    public static SubLObject declare_shop_basic_planner_thread_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_process_checkpoint", "SHOP-PROCESS-CHECKPOINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "get_shop_basic_planner_thread_plans_found", "GET-SHOP-BASIC-PLANNER-THREAD-PLANS-FOUND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "set_shop_basic_planner_thread_plans_found", "SET-SHOP-BASIC-PLANNER-THREAD-PLANS-FOUND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "get_shop_basic_planner_thread_plan_number_to_cutoff", "GET-SHOP-BASIC-PLANNER-THREAD-PLAN-NUMBER-TO-CUTOFF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "set_shop_basic_planner_thread_plan_number_to_cutoff", "SET-SHOP-BASIC-PLANNER-THREAD-PLAN-NUMBER-TO-CUTOFF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "get_shop_basic_planner_thread_plan_number", "GET-SHOP-BASIC-PLANNER-THREAD-PLAN-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "set_shop_basic_planner_thread_plan_number", "SET-SHOP-BASIC-PLANNER-THREAD-PLAN-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "get_shop_basic_planner_thread_number_cutoff", "GET-SHOP-BASIC-PLANNER-THREAD-NUMBER-CUTOFF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "set_shop_basic_planner_thread_number_cutoff", "SET-SHOP-BASIC-PLANNER-THREAD-NUMBER-CUTOFF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "get_shop_basic_planner_thread_depth_cutoff", "GET-SHOP-BASIC-PLANNER-THREAD-DEPTH-CUTOFF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "set_shop_basic_planner_thread_depth_cutoff", "SET-SHOP-BASIC-PLANNER-THREAD-DEPTH-CUTOFF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "get_shop_basic_planner_thread_time_cutoff", "GET-SHOP-BASIC-PLANNER-THREAD-TIME-CUTOFF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "set_shop_basic_planner_thread_time_cutoff", "SET-SHOP-BASIC-PLANNER-THREAD-TIME-CUTOFF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "get_shop_basic_planner_thread_cycle_checking", "GET-SHOP-BASIC-PLANNER-THREAD-CYCLE-CHECKING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "set_shop_basic_planner_thread_cycle_checking", "SET-SHOP-BASIC-PLANNER-THREAD-CYCLE-CHECKING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "get_shop_basic_planner_thread_num_backchains", "GET-SHOP-BASIC-PLANNER-THREAD-NUM-BACKCHAINS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "set_shop_basic_planner_thread_num_backchains", "SET-SHOP-BASIC-PLANNER-THREAD-NUM-BACKCHAINS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "get_shop_basic_planner_thread_which_plans", "GET-SHOP-BASIC-PLANNER-THREAD-WHICH-PLANS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "set_shop_basic_planner_thread_which_plans", "SET-SHOP-BASIC-PLANNER-THREAD-WHICH-PLANS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "get_shop_basic_planner_thread_halt_status", "GET-SHOP-BASIC-PLANNER-THREAD-HALT-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "set_shop_basic_planner_thread_halt_status", "SET-SHOP-BASIC-PLANNER-THREAD-HALT-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "get_shop_basic_planner_thread_initial_plan_state", "GET-SHOP-BASIC-PLANNER-THREAD-INITIAL-PLAN-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "set_shop_basic_planner_thread_initial_plan_state", "SET-SHOP-BASIC-PLANNER-THREAD-INITIAL-PLAN-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "get_shop_basic_planner_thread_log", "GET-SHOP-BASIC-PLANNER-THREAD-LOG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "set_shop_basic_planner_thread_log", "SET-SHOP-BASIC-PLANNER-THREAD-LOG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "get_shop_basic_planner_thread_stats_manager", "GET-SHOP-BASIC-PLANNER-THREAD-STATS-MANAGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "set_shop_basic_planner_thread_stats_manager", "SET-SHOP-BASIC-PLANNER-THREAD-STATS-MANAGER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "get_shop_basic_planner_thread_var_manager", "GET-SHOP-BASIC-PLANNER-THREAD-VAR-MANAGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "set_shop_basic_planner_thread_var_manager", "SET-SHOP-BASIC-PLANNER-THREAD-VAR-MANAGER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "get_shop_basic_planner_thread_p_wrapper", "GET-SHOP-BASIC-PLANNER-THREAD-P-WRAPPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "set_shop_basic_planner_thread_p_wrapper", "SET-SHOP-BASIC-PLANNER-THREAD-P-WRAPPER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "get_shop_basic_planner_thread_open_nodes", "GET-SHOP-BASIC-PLANNER-THREAD-OPEN-NODES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "set_shop_basic_planner_thread_open_nodes", "SET-SHOP-BASIC-PLANNER-THREAD-OPEN-NODES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "get_shop_basic_planner_thread_planner", "GET-SHOP-BASIC-PLANNER-THREAD-PLANNER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "set_shop_basic_planner_thread_planner", "SET-SHOP-BASIC-PLANNER-THREAD-PLANNER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "get_shop_basic_planner_thread_axioms", "GET-SHOP-BASIC-PLANNER-THREAD-AXIOMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "set_shop_basic_planner_thread_axioms", "SET-SHOP-BASIC-PLANNER-THREAD-AXIOMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "get_shop_basic_planner_thread_problem", "GET-SHOP-BASIC-PLANNER-THREAD-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "set_shop_basic_planner_thread_problem", "SET-SHOP-BASIC-PLANNER-THREAD-PROBLEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "subloop_reserved_initialize_shop_basic_planner_thread_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-THREAD-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "subloop_reserved_initialize_shop_basic_planner_thread_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-THREAD-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_p", "SHOP-BASIC-PLANNER-THREAD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_initialize_method", "SHOP-BASIC-PLANNER-THREAD-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_output_message_method", "SHOP-BASIC-PLANNER-THREAD-OUTPUT-MESSAGE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_any_cutoff_reachedP_method", "SHOP-BASIC-PLANNER-THREAD-ANY-CUTOFF-REACHED?-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_depth_cutoff_reachedP_method", "SHOP-BASIC-PLANNER-THREAD-DEPTH-CUTOFF-REACHED?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_time_cutoff_reachedP_method", "SHOP-BASIC-PLANNER-THREAD-TIME-CUTOFF-REACHED?-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_number_cutoff_reachedP_method", "SHOP-BASIC-PLANNER-THREAD-NUMBER-CUTOFF-REACHED?-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_cycl_plans_method", "SHOP-BASIC-PLANNER-THREAD-CYCL-PLANS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_print_stats_header_method", "SHOP-BASIC-PLANNER-THREAD-PRINT-STATS-HEADER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_print_plan_method", "SHOP-BASIC-PLANNER-THREAD-PRINT-PLAN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_shorterplan1", "SHOP-SHORTERPLAN1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_print_stats_method", "SHOP-BASIC-PLANNER-THREAD-PRINT-STATS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_print_iterative_deepening_stats_method", "SHOP-BASIC-PLANNER-THREAD-PRINT-ITERATIVE-DEEPENING-STATS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_html_stats_method", "SHOP-BASIC-PLANNER-THREAD-HTML-STATS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_set_problem_method", "SHOP-BASIC-PLANNER-THREAD-SET-PROBLEM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_get_problem_method", "SHOP-BASIC-PLANNER-THREAD-GET-PROBLEM-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_get_domain_method", "SHOP-BASIC-PLANNER-THREAD-GET-DOMAIN-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_get_which_plans_method", "SHOP-BASIC-PLANNER-THREAD-GET-WHICH-PLANS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_set_which_plans_method", "SHOP-BASIC-PLANNER-THREAD-SET-WHICH-PLANS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_init_plan_state_method", "SHOP-BASIC-PLANNER-THREAD-INIT-PLAN-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_init_planner_thread_method", "SHOP-BASIC-PLANNER-THREAD-INIT-PLANNER-THREAD-METHOD", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_found_plan_method", "SHOP-BASIC-PLANNER-THREAD-FOUND-PLAN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_halt_status_method", "SHOP-BASIC-PLANNER-THREAD-HALT-STATUS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_update_halt_status_method", "SHOP-BASIC-PLANNER-THREAD-UPDATE-HALT-STATUS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_seek_plans_method", "SHOP-BASIC-PLANNER-THREAD-SEEK-PLANS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_seek_plans_with_iterative_deepening_method", "SHOP-BASIC-PLANNER-THREAD-SEEK-PLANS-WITH-ITERATIVE-DEEPENING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_gather_initial_state_method", "SHOP-BASIC-PLANNER-THREAD-GATHER-INITIAL-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_make_problem_method", "SHOP-BASIC-PLANNER-THREAD-MAKE-PROBLEM-METHOD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_make_problem_from_formula_method", "SHOP-BASIC-PLANNER-THREAD-MAKE-PROBLEM-FROM-FORMULA-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_find_plans_method", "SHOP-BASIC-PLANNER-THREAD-FIND-PLANS-METHOD", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_completed_runP_method", "SHOP-BASIC-PLANNER-THREAD-COMPLETED-RUN?-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_summary_method", "SHOP-BASIC-PLANNER-THREAD-SUMMARY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_basic_planner_thread_html_display_summary_method", "SHOP-BASIC-PLANNER-THREAD-HTML-DISPLAY-SUMMARY-METHOD", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.shop_basic_planner_thread", "mapcar_method", "MAPCAR-METHOD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_plan_cost", "SHOP-PLAN-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_reifiable_natP", "SHOP-REIFIABLE-NAT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_reify_narts_in_expression", "SHOP-REIFY-NARTS-IN-EXPRESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_planner_thread_p", "SHOP-PLANNER-THREAD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_planner_thread_plans_found", "SHOP-PLANNER-THREAD-PLANS-FOUND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_planner_thread_num_plans_found", "SHOP-PLANNER-THREAD-NUM-PLANS-FOUND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_planner_thread_num_open_nodes", "SHOP-PLANNER-THREAD-NUM-OPEN-NODES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_planner_thread_num_inferences", "SHOP-PLANNER-THREAD-NUM-INFERENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_planner_thread_nodes_expanded", "SHOP-PLANNER-THREAD-NODES-EXPANDED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_planner_thread_task", "SHOP-PLANNER-THREAD-TASK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_planner_thread_pause", "SHOP-PLANNER-THREAD-PAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_planner_thread", "shop_plan_process_set_thread", "SHOP-PLAN-PROCESS-SET-THREAD", 2, 0, false);
        return (SubLObject)shop_basic_planner_thread.NIL;
    }
    
    public static SubLObject init_shop_basic_planner_thread_file() {
        return (SubLObject)shop_basic_planner_thread.NIL;
    }
    
    public static SubLObject setup_shop_basic_planner_thread_file() {
        classes.subloop_new_class((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym5$OBJECT, (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.$list6);
        classes.class_set_implements_slot_listeners((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym13$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_THREAD_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym28$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_THREAD_INSTANCE);
        subloop_reserved_initialize_shop_basic_planner_thread_class((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym29$INITIALIZE, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list30, (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.$list31);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym29$INITIALIZE, (SubLObject)shop_basic_planner_thread.$sym36$SHOP_BASIC_PLANNER_THREAD_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym37$OUTPUT_MESSAGE, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list38, (SubLObject)shop_basic_planner_thread.$list39, (SubLObject)shop_basic_planner_thread.$list40);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym37$OUTPUT_MESSAGE, (SubLObject)shop_basic_planner_thread.$sym42$SHOP_BASIC_PLANNER_THREAD_OUTPUT_MESSAGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym43$ANY_CUTOFF_REACHED_, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list30, (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.$list44);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym43$ANY_CUTOFF_REACHED_, (SubLObject)shop_basic_planner_thread.$sym46$SHOP_BASIC_PLANNER_THREAD_ANY_CUTOFF_REACHED__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym47$DEPTH_CUTOFF_REACHED_, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list38, (SubLObject)shop_basic_planner_thread.$list48, (SubLObject)shop_basic_planner_thread.$list49);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym47$DEPTH_CUTOFF_REACHED_, (SubLObject)shop_basic_planner_thread.$sym52$SHOP_BASIC_PLANNER_THREAD_DEPTH_CUTOFF_REACHED__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym53$TIME_CUTOFF_REACHED_, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list38, (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.$list54);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym53$TIME_CUTOFF_REACHED_, (SubLObject)shop_basic_planner_thread.$sym56$SHOP_BASIC_PLANNER_THREAD_TIME_CUTOFF_REACHED__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym57$NUMBER_CUTOFF_REACHED_, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list38, (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.$list58);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym57$NUMBER_CUTOFF_REACHED_, (SubLObject)shop_basic_planner_thread.$sym60$SHOP_BASIC_PLANNER_THREAD_NUMBER_CUTOFF_REACHED__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym61$CYCL_PLANS, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list30, (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.$list62);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym61$CYCL_PLANS, (SubLObject)shop_basic_planner_thread.$sym64$SHOP_BASIC_PLANNER_THREAD_CYCL_PLANS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym65$PRINT_STATS_HEADER, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list30, (SubLObject)shop_basic_planner_thread.$list66, (SubLObject)shop_basic_planner_thread.$list67);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym65$PRINT_STATS_HEADER, (SubLObject)shop_basic_planner_thread.$sym69$SHOP_BASIC_PLANNER_THREAD_PRINT_STATS_HEADER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym70$PRINT_PLAN, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list30, (SubLObject)shop_basic_planner_thread.$list71, (SubLObject)shop_basic_planner_thread.$list72);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym70$PRINT_PLAN, (SubLObject)shop_basic_planner_thread.$sym74$SHOP_BASIC_PLANNER_THREAD_PRINT_PLAN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym75$PRINT_STATS, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list30, (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.$list76);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym75$PRINT_STATS, (SubLObject)shop_basic_planner_thread.$sym85$SHOP_BASIC_PLANNER_THREAD_PRINT_STATS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym86$PRINT_ITERATIVE_DEEPENING_STATS, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list30, (SubLObject)shop_basic_planner_thread.$list87, (SubLObject)shop_basic_planner_thread.$list88);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym86$PRINT_ITERATIVE_DEEPENING_STATS, (SubLObject)shop_basic_planner_thread.$sym93$SHOP_BASIC_PLANNER_THREAD_PRINT_ITERATIVE_DEEPENING_STATS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym94$HTML_STATS, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list30, (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.$list95);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym94$HTML_STATS, (SubLObject)shop_basic_planner_thread.$sym107$SHOP_BASIC_PLANNER_THREAD_HTML_STATS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym108$SET_PROBLEM, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list109, (SubLObject)shop_basic_planner_thread.$list110, (SubLObject)shop_basic_planner_thread.$list111);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym108$SET_PROBLEM, (SubLObject)shop_basic_planner_thread.$sym114$SHOP_BASIC_PLANNER_THREAD_SET_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym115$GET_PROBLEM, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list30, (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.$list116);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym115$GET_PROBLEM, (SubLObject)shop_basic_planner_thread.$sym118$SHOP_BASIC_PLANNER_THREAD_GET_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym119$GET_DOMAIN, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list30, (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.$list120);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym119$GET_DOMAIN, (SubLObject)shop_basic_planner_thread.$sym122$SHOP_BASIC_PLANNER_THREAD_GET_DOMAIN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym123$GET_WHICH_PLANS, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list30, (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.$list124);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym123$GET_WHICH_PLANS, (SubLObject)shop_basic_planner_thread.$sym126$SHOP_BASIC_PLANNER_THREAD_GET_WHICH_PLANS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym127$SET_WHICH_PLANS, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list109, (SubLObject)shop_basic_planner_thread.$list128, (SubLObject)shop_basic_planner_thread.$list129);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym127$SET_WHICH_PLANS, (SubLObject)shop_basic_planner_thread.$sym131$SHOP_BASIC_PLANNER_THREAD_SET_WHICH_PLANS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym132$INIT_PLAN_STATE, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list133, (SubLObject)shop_basic_planner_thread.$list134, (SubLObject)shop_basic_planner_thread.$list135);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym132$INIT_PLAN_STATE, (SubLObject)shop_basic_planner_thread.$sym137$SHOP_BASIC_PLANNER_THREAD_INIT_PLAN_STATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym138$INIT_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list133, (SubLObject)shop_basic_planner_thread.$list139, (SubLObject)shop_basic_planner_thread.$list140);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym138$INIT_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym142$SHOP_BASIC_PLANNER_THREAD_INIT_PLANNER_THREAD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym143$FOUND_PLAN, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list133, (SubLObject)shop_basic_planner_thread.$list48, (SubLObject)shop_basic_planner_thread.$list144);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym143$FOUND_PLAN, (SubLObject)shop_basic_planner_thread.$sym155$SHOP_BASIC_PLANNER_THREAD_FOUND_PLAN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym7$HALT_STATUS, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list30, (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.$list156);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym7$HALT_STATUS, (SubLObject)shop_basic_planner_thread.$sym158$SHOP_BASIC_PLANNER_THREAD_HALT_STATUS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym159$UPDATE_HALT_STATUS, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list133, (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.$list160);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym159$UPDATE_HALT_STATUS, (SubLObject)shop_basic_planner_thread.$sym165$SHOP_BASIC_PLANNER_THREAD_UPDATE_HALT_STATUS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym166$SEEK_PLANS, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list133, (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.$list167);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym166$SEEK_PLANS, (SubLObject)shop_basic_planner_thread.$sym169$SHOP_BASIC_PLANNER_THREAD_SEEK_PLANS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym170$SEEK_PLANS_WITH_ITERATIVE_DEEPENING, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list38, (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.$list171);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym170$SEEK_PLANS_WITH_ITERATIVE_DEEPENING, (SubLObject)shop_basic_planner_thread.$sym178$SHOP_BASIC_PLANNER_THREAD_SEEK_PLANS_WITH_ITERATIVE_DEEPENING_MET);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym179$GATHER_INITIAL_STATE, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list38, (SubLObject)shop_basic_planner_thread.$list180, (SubLObject)shop_basic_planner_thread.$list181);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym179$GATHER_INITIAL_STATE, (SubLObject)shop_basic_planner_thread.$sym201$SHOP_BASIC_PLANNER_THREAD_GATHER_INITIAL_STATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym202$MAKE_PROBLEM, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list30, (SubLObject)shop_basic_planner_thread.$list203, (SubLObject)shop_basic_planner_thread.$list204);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym202$MAKE_PROBLEM, (SubLObject)shop_basic_planner_thread.$sym210$SHOP_BASIC_PLANNER_THREAD_MAKE_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym211$MAKE_PROBLEM_FROM_FORMULA, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list30, (SubLObject)shop_basic_planner_thread.$list212, (SubLObject)shop_basic_planner_thread.$list213);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym211$MAKE_PROBLEM_FROM_FORMULA, (SubLObject)shop_basic_planner_thread.$sym214$SHOP_BASIC_PLANNER_THREAD_MAKE_PROBLEM_FROM_FORMULA_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym215$FIND_PLANS, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list216, (SubLObject)shop_basic_planner_thread.$list217, (SubLObject)shop_basic_planner_thread.$list218);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym215$FIND_PLANS, (SubLObject)shop_basic_planner_thread.$sym225$SHOP_BASIC_PLANNER_THREAD_FIND_PLANS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym226$COMPLETED_RUN_, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list30, (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.$list227);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym226$COMPLETED_RUN_, (SubLObject)shop_basic_planner_thread.$sym229$SHOP_BASIC_PLANNER_THREAD_COMPLETED_RUN__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym230$SUMMARY, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list30, (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)shop_basic_planner_thread.$list231);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym230$SUMMARY, (SubLObject)shop_basic_planner_thread.$sym234$SHOP_BASIC_PLANNER_THREAD_SUMMARY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_planner_thread.$sym235$HTML_DISPLAY_SUMMARY, (SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$list30, (SubLObject)shop_basic_planner_thread.$list236, (SubLObject)shop_basic_planner_thread.$list237);
        methods.subloop_register_instance_method((SubLObject)shop_basic_planner_thread.$sym4$SHOP_BASIC_PLANNER_THREAD, (SubLObject)shop_basic_planner_thread.$sym235$HTML_DISPLAY_SUMMARY, (SubLObject)shop_basic_planner_thread.$sym243$SHOP_BASIC_PLANNER_THREAD_HTML_DISPLAY_SUMMARY_METHOD);
        return (SubLObject)shop_basic_planner_thread.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_shop_basic_planner_thread_file();
    }
    
    @Override
	public void initializeVariables() {
        init_shop_basic_planner_thread_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_shop_basic_planner_thread_file();
    }
    
    static {
        me = (SubLFile)new shop_basic_planner_thread();
        $sym0$P_WRAPPER = SubLObjectFactory.makeSymbol("P-WRAPPER");
        $sym1$STATS_MANAGER = SubLObjectFactory.makeSymbol("STATS-MANAGER");
        $sym2$STOP_TIMING = SubLObjectFactory.makeSymbol("STOP-TIMING");
        $sym3$RESUME_TIMING = SubLObjectFactory.makeSymbol("RESUME-TIMING");
        $sym4$SHOP_BASIC_PLANNER_THREAD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD");
        $sym5$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list6 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AXIOMS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLANNER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPEN-NODES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("P-WRAPPER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR-MANAGER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIAL-PLAN-STATE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HALT-STATUS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHICH-PLANS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUM-BACKCHAINS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCLE-CHECKING"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIME-CUTOFF"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPTH-CUTOFF"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER-CUTOFF"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLAN-NUMBER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLAN-NUMBER-TO-CUTOFF"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLANS-FOUND"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-MESSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OUTPUT"), (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT-STATS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RUN-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("REAL-TIME")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INIT-PLAN-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-NAME")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DOMAIN"), (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLETED-RUN?"), (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-DISPLAY-SUMMARY"), (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-CUTOFF-REACHED?"), (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TIME-CUTOFF-REACHED?"), (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH-CUTOFF-REACHED?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLAN-TASK")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")) });
        $sym7$HALT_STATUS = SubLObjectFactory.makeSymbol("HALT-STATUS");
        $sym8$INITIAL_PLAN_STATE = SubLObjectFactory.makeSymbol("INITIAL-PLAN-STATE");
        $sym9$LOG = SubLObjectFactory.makeSymbol("LOG");
        $sym10$OPEN_NODES = SubLObjectFactory.makeSymbol("OPEN-NODES");
        $sym11$PROBLEM = SubLObjectFactory.makeSymbol("PROBLEM");
        $sym12$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym13$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_THREAD_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-THREAD-CLASS");
        $sym14$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym15$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym16$AXIOMS = SubLObjectFactory.makeSymbol("AXIOMS");
        $sym17$PLANNER = SubLObjectFactory.makeSymbol("PLANNER");
        $sym18$VAR_MANAGER = SubLObjectFactory.makeSymbol("VAR-MANAGER");
        $sym19$WHICH_PLANS = SubLObjectFactory.makeSymbol("WHICH-PLANS");
        $sym20$NUM_BACKCHAINS = SubLObjectFactory.makeSymbol("NUM-BACKCHAINS");
        $sym21$CYCLE_CHECKING = SubLObjectFactory.makeSymbol("CYCLE-CHECKING");
        $sym22$TIME_CUTOFF = SubLObjectFactory.makeSymbol("TIME-CUTOFF");
        $sym23$DEPTH_CUTOFF = SubLObjectFactory.makeSymbol("DEPTH-CUTOFF");
        $sym24$NUMBER_CUTOFF = SubLObjectFactory.makeSymbol("NUMBER-CUTOFF");
        $sym25$PLAN_NUMBER = SubLObjectFactory.makeSymbol("PLAN-NUMBER");
        $sym26$PLAN_NUMBER_TO_CUTOFF = SubLObjectFactory.makeSymbol("PLAN-NUMBER-TO-CUTOFF");
        $sym27$PLANS_FOUND = SubLObjectFactory.makeSymbol("PLANS-FOUND");
        $sym28$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_THREAD_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-THREAD-INSTANCE");
        $sym29$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list31 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-STATISTIC-MANAGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-STATISTIC-MANAGER")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-LOG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-LOG")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-NUMBER"), (SubLObject)shop_basic_planner_thread.ZERO_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-NUMBER-TO-CUTOFF"), (SubLObject)shop_basic_planner_thread.ZERO_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TIME-CUTOFF"), (SubLObject)shop_basic_planner_thread.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH-CUTOFF"), (SubLObject)SubLObjectFactory.makeSymbol("*SHOP-DEFAULT-DEPTH-LIMIT*")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-CUTOFF"), (SubLObject)shop_basic_planner_thread.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("HALT-STATUS"), (SubLObject)shop_basic_planner_thread.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NUM-BACKCHAINS"), (SubLObject)shop_basic_planner_thread.ZERO_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLE-CHECKING"), (SubLObject)shop_basic_planner_thread.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")) });
        $sym32$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");
        $sym33$SHOP_VARIABLE_MANAGER = SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER");
        $sym34$SHOP_STATISTIC_MANAGER = SubLObjectFactory.makeSymbol("SHOP-STATISTIC-MANAGER");
        $sym35$SHOP_LOG = SubLObjectFactory.makeSymbol("SHOP-LOG");
        $sym36$SHOP_BASIC_PLANNER_THREAD_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-INITIALIZE-METHOD");
        $sym37$OUTPUT_MESSAGE = SubLObjectFactory.makeSymbol("OUTPUT-MESSAGE");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $list40 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-LOG")), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))));
        $sym41$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");
        $sym42$SHOP_BASIC_PLANNER_THREAD_OUTPUT_MESSAGE_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-OUTPUT-MESSAGE-METHOD");
        $sym43$ANY_CUTOFF_REACHED_ = SubLObjectFactory.makeSymbol("ANY-CUTOFF-REACHED?");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-NODES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_planner_thread.T)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPTH-CUTOFF-REACHED?"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-NODES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIME-CUTOFF-REACHED?"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER-CUTOFF-REACHED?"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))));
        $sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");
        $sym46$SHOP_BASIC_PLANNER_THREAD_ANY_CUTOFF_REACHED__METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-ANY-CUTOFF-REACHED?-METHOD");
        $sym47$DEPTH_CUTOFF_REACHED_ = SubLObjectFactory.makeSymbol("DEPTH-CUTOFF-REACHED?");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLAN-STATE"));
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param PLAN-STATE shop-plan-state-p\n   @return booleanp"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBERP"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH-CUTOFF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH-CUTOFF")), (SubLObject)shop_basic_planner_thread.NIL)));
        $sym50$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");
        $sym51$DEPTH = SubLObjectFactory.makeSymbol("DEPTH");
        $sym52$SHOP_BASIC_PLANNER_THREAD_DEPTH_CUTOFF_REACHED__METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-DEPTH-CUTOFF-REACHED?-METHOD");
        $sym53$TIME_CUTOFF_REACHED_ = SubLObjectFactory.makeSymbol("TIME-CUTOFF-REACHED?");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("TIME-CUTOFF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELAPSED-RUN-TIME-SINCE-LAST-CALL"), (SubLObject)SubLObjectFactory.makeSymbol("STATISTIC-MANAGER")), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER")), (SubLObject)SubLObjectFactory.makeSymbol("TIME-CUTOFF")), (SubLObject)shop_basic_planner_thread.NIL)));
        $sym55$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");
        $sym56$SHOP_BASIC_PLANNER_THREAD_TIME_CUTOFF_REACHED__METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-TIME-CUTOFF-REACHED?-METHOD");
        $sym57$NUMBER_CUTOFF_REACHED_ = SubLObjectFactory.makeSymbol("NUMBER-CUTOFF-REACHED?");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-CUTOFF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-NUMBER-TO-CUTOFF"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-CUTOFF")), (SubLObject)shop_basic_planner_thread.NIL)));
        $sym59$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");
        $sym60$SHOP_BASIC_PLANNER_THREAD_NUMBER_CUTOFF_REACHED__METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-NUMBER-CUTOFF-REACHED?-METHOD");
        $sym61$CYCL_PLANS = SubLObjectFactory.makeSymbol("CYCL-PLANS");
        $list62 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS-FOUND")))));
        $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");
        $sym64$SHOP_BASIC_PLANNER_THREAD_CYCL_PLANS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-CYCL-PLANS-METHOD");
        $sym65$PRINT_STATS_HEADER = SubLObjectFactory.makeSymbol("PRINT-STATS-HEADER");
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LABEL"));
        $list67 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)SubLObjectFactory.makeString("~%~7@a Plans Mincost Maxcost Expansions Inferences CPU time Real time"), (SubLObject)SubLObjectFactory.makeSymbol("LABEL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_planner_thread.NIL));
        $str68$___7_a_Plans_Mincost_Maxcost_Expa = SubLObjectFactory.makeString("~%~7@a Plans Mincost Maxcost Expansions Inferences CPU time Real time");
        $sym69$SHOP_BASIC_PLANNER_THREAD_PRINT_STATS_HEADER_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-PRINT-STATS-HEADER-METHOD");
        $sym70$PRINT_PLAN = SubLObjectFactory.makeSymbol("PRINT-PLAN");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLAN"));
        $list72 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)SubLObjectFactory.makeString("~%~s"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_planner_thread.NIL));
        $str73$___s = SubLObjectFactory.makeString("~%~s");
        $sym74$SHOP_BASIC_PLANNER_THREAD_PRINT_PLAN_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-PRINT-PLAN-METHOD");
        $sym75$PRINT_STATS = SubLObjectFactory.makeSymbol("PRINT-STATS");
        $list76 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS-FOUND")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-OF-EXPANSIONS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-OF-INFERENCES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RUN-TIME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELAPSED-RUN-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-STATISTIC-MANAGER")), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REAL-TIME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELAPSED-REAL-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-STATISTIC-MANAGER")), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("FORMAT"), shop_basic_planner_thread.NIL, SubLObjectFactory.makeString("~%~12@a~8@a~8@a~11@s~11@s~10,3f~11,3f"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("MIN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-PLAN-COST")), (SubLObject)SubLObjectFactory.makeSymbol("PLANS"))), (SubLObject)SubLObjectFactory.makeString("-")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("MAX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-PLAN-COST")), (SubLObject)SubLObjectFactory.makeSymbol("PLANS"))), (SubLObject)SubLObjectFactory.makeString("-")), SubLObjectFactory.makeSymbol("TASKS"), SubLObjectFactory.makeSymbol("INFERENCES"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("/"), (SubLObject)SubLObjectFactory.makeSymbol("RUN-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("/"), (SubLObject)SubLObjectFactory.makeSymbol("REAL-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*")) })), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_planner_thread.NIL)));
        $sym77$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");
        $sym78$NUMBER_OF_EXPANSIONS = SubLObjectFactory.makeSymbol("NUMBER-OF-EXPANSIONS");
        $sym79$NUMBER_OF_INFERENCES = SubLObjectFactory.makeSymbol("NUMBER-OF-INFERENCES");
        $str80$___12_a_8_a_8_a_11_s_11_s_10_3f_1 = SubLObjectFactory.makeString("~%~12@a~8@a~8@a~11@s~11@s~10,3f~11,3f");
        $sym81$MIN = SubLObjectFactory.makeSymbol("MIN");
        $sym82$SHOP_PLAN_COST = SubLObjectFactory.makeSymbol("SHOP-PLAN-COST");
        $str83$_ = SubLObjectFactory.makeString("-");
        $sym84$MAX = SubLObjectFactory.makeSymbol("MAX");
        $sym85$SHOP_BASIC_PLANNER_THREAD_PRINT_STATS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-PRINT-STATS-METHOD");
        $sym86$PRINT_ITERATIVE_DEEPENING_STATS = SubLObjectFactory.makeSymbol("PRINT-ITERATIVE-DEEPENING-STATS");
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list88 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS-FOUND")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-OF-EXPANSIONS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-OF-INFERENCES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RUN-TIME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ELAPSED-RUN-TIME-SINCE-LAST-CALL")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REAL-TIME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ELAPSED-REAL-TIME-SINCE-LAST-CALL"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("FORMAT"), shop_basic_planner_thread.NIL, SubLObjectFactory.makeString("~%~6@a~6@a~8@a~8@a~11@s~11@s~10,3f~11,3f"), SubLObjectFactory.makeSymbol("DEPTH"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("MIN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-PLAN-COST")), (SubLObject)SubLObjectFactory.makeSymbol("PLANS"))), (SubLObject)SubLObjectFactory.makeString("-")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("MAX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-PLAN-COST")), (SubLObject)SubLObjectFactory.makeSymbol("PLANS"))), (SubLObject)SubLObjectFactory.makeString("-")), SubLObjectFactory.makeSymbol("TASKS"), SubLObjectFactory.makeSymbol("INFERENCES"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("/"), (SubLObject)SubLObjectFactory.makeSymbol("RUN-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("/"), (SubLObject)SubLObjectFactory.makeSymbol("REAL-TIME"), (SubLObject)SubLObjectFactory.makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*")) })), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_planner_thread.NIL)));
        $sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");
        $sym90$ELAPSED_RUN_TIME_SINCE_LAST_CALL = SubLObjectFactory.makeSymbol("ELAPSED-RUN-TIME-SINCE-LAST-CALL");
        $sym91$ELAPSED_REAL_TIME_SINCE_LAST_CALL = SubLObjectFactory.makeSymbol("ELAPSED-REAL-TIME-SINCE-LAST-CALL");
        $str92$___6_a_6_a_8_a_8_a_11_s_11_s_10_3 = SubLObjectFactory.makeString("~%~6@a~6@a~8@a~8@a~11@s~11@s~10,3f~11,3f");
        $sym93$SHOP_BASIC_PLANNER_THREAD_PRINT_ITERATIVE_DEEPENING_STATS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-PRINT-ITERATIVE-DEEPENING-STATS-METHOD");
        $sym94$HTML_STATS = SubLObjectFactory.makeSymbol("HTML-STATS");
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Displays in HTML an informative summary of the last planner run\n   on this thread."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS-FOUND")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUM-PLANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-OF-EXPANSIONS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-OF-INFERENCES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RUN-TIME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("/"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ELAPSED-RUN-TIME"))), (SubLObject)SubLObjectFactory.makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REAL-TIME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("/"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ELAPSED-REAL-TIME"))), (SubLObject)SubLObjectFactory.makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CELLPADDING"), (SubLObject)shop_basic_planner_thread.FIVE_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("CELLSPACING"), (SubLObject)shop_basic_planner_thread.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeKeyword("BORDER"), (SubLObject)shop_basic_planner_thread.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TABLE-ROW"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-STRONG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Plans")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-STRONG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("MinCost")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-STRONG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("MaxCost")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-STRONG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Expansions")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-STRONG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Inferences")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-STRONG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("CPU Time")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-STRONG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Real Time"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TABLE-ROW"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("RIGHT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("NUM-PLANS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("RIGHT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("MIN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-PLAN-COST")), (SubLObject)SubLObjectFactory.makeSymbol("PLANS"))), (SubLObject)SubLObjectFactory.makeString("-")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("RIGHT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("MAX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-PLAN-COST")), (SubLObject)SubLObjectFactory.makeSymbol("PLANS"))), (SubLObject)SubLObjectFactory.makeString("-")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("RIGHT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("TASKS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("RIGHT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("RIGHT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("RUN-TIME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("RIGHT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeSymbol("REAL-TIME"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_planner_thread.NIL)));
        $sym96$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");
        $sym97$ELAPSED_RUN_TIME = SubLObjectFactory.makeSymbol("ELAPSED-RUN-TIME");
        $sym98$ELAPSED_REAL_TIME = SubLObjectFactory.makeSymbol("ELAPSED-REAL-TIME");
        $str99$Plans = SubLObjectFactory.makeString("Plans");
        $str100$MinCost = SubLObjectFactory.makeString("MinCost");
        $str101$MaxCost = SubLObjectFactory.makeString("MaxCost");
        $str102$Expansions = SubLObjectFactory.makeString("Expansions");
        $str103$Inferences = SubLObjectFactory.makeString("Inferences");
        $str104$CPU_Time = SubLObjectFactory.makeString("CPU Time");
        $str105$Real_Time = SubLObjectFactory.makeString("Real Time");
        $kw106$RIGHT = SubLObjectFactory.makeKeyword("RIGHT");
        $sym107$SHOP_BASIC_PLANNER_THREAD_HTML_STATS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-HTML-STATS-METHOD");
        $sym108$SET_PROBLEM = SubLObjectFactory.makeSymbol("SET-PROBLEM");
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("D"));
        $list111 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("D")));
        $sym112$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");
        $sym113$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym114$SHOP_BASIC_PLANNER_THREAD_SET_PROBLEM_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-SET-PROBLEM-METHOD");
        $sym115$GET_PROBLEM = SubLObjectFactory.makeSymbol("GET-PROBLEM");
        $list116 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM")));
        $sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");
        $sym118$SHOP_BASIC_PLANNER_THREAD_GET_PROBLEM_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-GET-PROBLEM-METHOD");
        $sym119$GET_DOMAIN = SubLObjectFactory.makeSymbol("GET-DOMAIN");
        $list120 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM")), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"))));
        $sym121$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");
        $sym122$SHOP_BASIC_PLANNER_THREAD_GET_DOMAIN_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-GET-DOMAIN-METHOD");
        $sym123$GET_WHICH_PLANS = SubLObjectFactory.makeSymbol("GET-WHICH-PLANS");
        $list124 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("WHICH-PLANS")));
        $sym125$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");
        $sym126$SHOP_BASIC_PLANNER_THREAD_GET_WHICH_PLANS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-GET-WHICH-PLANS-METHOD");
        $sym127$SET_WHICH_PLANS = SubLObjectFactory.makeSymbol("SET-WHICH-PLANS");
        $list128 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("W"));
        $list129 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("WHICH-PLANS"), (SubLObject)SubLObjectFactory.makeSymbol("W")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("W")));
        $sym130$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");
        $sym131$SHOP_BASIC_PLANNER_THREAD_SET_WHICH_PLANS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-SET-WHICH-PLANS-METHOD");
        $sym132$INIT_PLAN_STATE = SubLObjectFactory.makeSymbol("INIT-PLAN-STATE");
        $list133 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $list134 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"));
        $list135 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param PROBLEM shop-problem-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM")), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INITIAL-PLAN-STATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-PLAN-STATE-WITH-PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INITIAL-PLAN-STATE"))), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_planner_thread.NIL));
        $sym136$SHOP_BASIC_PLAN_STATE = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE");
        $sym137$SHOP_BASIC_PLANNER_THREAD_INIT_PLAN_STATE_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-INIT-PLAN-STATE-METHOD");
        $sym138$INIT_PLANNER_THREAD = SubLObjectFactory.makeSymbol("INIT-PLANNER-THREAD");
        $list139 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("WHICH"), (SubLObject)SubLObjectFactory.makeSymbol("VERBOSE"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list140 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("called each time by FIND-PLANS. The first time, it sets up the INITIAL-PLAN-STATE\n   so the search can begin. Thereafter, when it is called by FIND-PLANS as part\n   of a search continuation. it resets the search-cutoffs, so that search can continue."), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH-CUTOFF")), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TIME-CUTOFF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)SubLObjectFactory.makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-CUTOFF")), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("WHICH-PLANS")), (SubLObject)SubLObjectFactory.makeSymbol("WHICH")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-NUMBER")), (SubLObject)shop_basic_planner_thread.ZERO_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-NUMBER-TO-CUTOFF")), (SubLObject)shop_basic_planner_thread.ZERO_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-VERBOSITY")), (SubLObject)SubLObjectFactory.makeSymbol("VERBOSE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INIT-PLAN-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROBLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-NODES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INITIAL-PLAN-STATE")))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_planner_thread.NIL) });
        $sym141$SET_VERBOSITY = SubLObjectFactory.makeSymbol("SET-VERBOSITY");
        $sym142$SHOP_BASIC_PLANNER_THREAD_INIT_PLANNER_THREAD_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-INIT-PLANNER-THREAD-METHOD");
        $sym143$FOUND_PLAN = SubLObjectFactory.makeSymbol("FOUND-PLAN");
        $list144 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param PLAN-STATE shop-basic-plan-state-p \n   @return booleanp\n   FOUND-PLAN is called\n   when a PLAN-STATE has found a plan that satisfies the original\n   task. The plan is recorded with the state of the thread, and the\n   search continues.  Returns NIL."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-NUMBER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)shop_basic_planner_thread.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-NUMBER"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-NUMBER-TO-CUTOFF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("+"), (SubLObject)shop_basic_planner_thread.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-NUMBER-TO-CUTOFF"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-STATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHICH-PLANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("WHICH-PLANS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POPULATE-PLAN"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-STATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("WHICH-PLANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SHALLOWEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH-CUTOFF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1-"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS-FOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL-SHALLOWEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)shop_basic_planner_thread.EQUAL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH-CUTOFF"))), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS-FOUND")), (SubLObject)shop_basic_planner_thread.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH-CUTOFF")), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS-FOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS-FOUND")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeKeyword("FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS-FOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS-FOUND")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHERWISE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CERROR"), (SubLObject)SubLObjectFactory.makeString("invalid keyword ~S"), (SubLObject)SubLObjectFactory.makeSymbol("WHICH-PLANS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("CUTOFFS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)shop_basic_planner_thread.NIL, (SubLObject)SubLObjectFactory.makeString("depth ~s found plan #~s"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS-FOUND"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)shop_basic_planner_thread.NIL))));
        $sym145$SHOP_BASIC_PLAN = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN");
        $kw146$SHALLOWEST = SubLObjectFactory.makeKeyword("SHALLOWEST");
        $kw147$ALL_SHALLOWEST = SubLObjectFactory.makeKeyword("ALL-SHALLOWEST");
        $kw148$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw149$FIRST = SubLObjectFactory.makeKeyword("FIRST");
        $str150$invalid_keyword__S = SubLObjectFactory.makeString("invalid keyword ~S");
        $kw151$CUTOFFS = SubLObjectFactory.makeKeyword("CUTOFFS");
        $sym152$VERBOSE = SubLObjectFactory.makeSymbol("VERBOSE");
        $sym153$SUCCESS = SubLObjectFactory.makeSymbol("SUCCESS");
        $str154$depth__s_found_plan___s = SubLObjectFactory.makeString("depth ~s found plan #~s");
        $sym155$SHOP_BASIC_PLANNER_THREAD_FOUND_PLAN_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-FOUND-PLAN-METHOD");
        $list156 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("HALT-STATUS")));
        $sym157$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");
        $sym158$SHOP_BASIC_PLANNER_THREAD_HALT_STATUS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-HALT-STATUS-METHOD");
        $sym159$UPDATE_HALT_STATUS = SubLObjectFactory.makeSymbol("UPDATE-HALT-STATUS");
        $list160 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPEN-NODES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-NODES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-NODES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("HALT-STATUS")), (SubLObject)SubLObjectFactory.makeKeyword("SEARCH-EXHAUSTED"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIME-CUTOFF-REACHED?"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("HALT-STATUS")), (SubLObject)SubLObjectFactory.makeKeyword("TIME-CUTOFF"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPTH-CUTOFF-REACHED?"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-NODES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("HALT-STATUS")), (SubLObject)SubLObjectFactory.makeKeyword("DEPTH-CUTOFF"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER-CUTOFF-REACHED?"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-NUMBER-TO-CUTOFF")), (SubLObject)shop_basic_planner_thread.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("HALT-STATUS")), (SubLObject)SubLObjectFactory.makeKeyword("NUMBER-CUTOFF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_planner_thread.NIL)));
        $kw161$SEARCH_EXHAUSTED = SubLObjectFactory.makeKeyword("SEARCH-EXHAUSTED");
        $kw162$TIME_CUTOFF = SubLObjectFactory.makeKeyword("TIME-CUTOFF");
        $kw163$DEPTH_CUTOFF = SubLObjectFactory.makeKeyword("DEPTH-CUTOFF");
        $kw164$NUMBER_CUTOFF = SubLObjectFactory.makeKeyword("NUMBER-CUTOFF");
        $sym165$SHOP_BASIC_PLANNER_THREAD_UPDATE_HALT_STATUS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-UPDATE-HALT-STATUS-METHOD");
        $sym166$SEEK_PLANS = SubLObjectFactory.makeSymbol("SEEK-PLANS");
        $list167 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("SEEK-PLANS is the main planning loop. \n   OPEN-NODES is the list of current unexpand plan-states."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANY-CUTOFF-REACHED?"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDO"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPEN-NODES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-NODES"))), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-NODES"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-NODES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_planner_thread.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANY-CUTOFF-REACHED?"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-PLANNER-THREAD-PAUSE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-PROCESS-CHECKPOINT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-EXPANSION"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-STATISTIC-MANAGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-NODES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPOP"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-NODES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TASKLIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOUND-PLAN"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-NODE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-NODES")), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-NODES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPAND"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("CUR-NODE")), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-NODES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-NODES")), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-NODES"))))))));
        $sym168$TASKLIST = SubLObjectFactory.makeSymbol("TASKLIST");
        $sym169$SHOP_BASIC_PLANNER_THREAD_SEEK_PLANS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-SEEK-PLANS-METHOD");
        $sym170$SEEK_PLANS_WITH_ITERATIVE_DEEPENING = SubLObjectFactory.makeSymbol("SEEK-PLANS-WITH-ITERATIVE-DEEPENING");
        $list171 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST-ITERATION-EXPANSIONS"), (SubLObject)shop_basic_planner_thread.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST-ITERATION-INFERENCES"), (SubLObject)shop_basic_planner_thread.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("START-TIMING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINT-STATS-HEADER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeString("Depth")), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CDO"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-DEPTH"), (SubLObject)shop_basic_planner_thread.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-DEPTH")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS-FOUND")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-ITERATION-EXPANSIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-OF-EXPANSIONS")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-ITERATION-INFERENCES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-OF-INFERENCES")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RESET-COUNTERS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH-CUTOFF")), (SubLObject)SubLObjectFactory.makeSymbol("CUR-DEPTH")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEEK-PLANS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINT-ITERATIVE-DEEPENING-STATS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-DEPTH")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ZEROP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-ITERATION-EXPANSIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-OF-EXPANSIONS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ZEROP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("LAST-ITERATION-INFERENCES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-OF-INFERENCES")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CERROR"), (SubLObject)SubLObjectFactory.makeString("Error"), (SubLObject)SubLObjectFactory.makeString("No expansions or inferences ~%added this iteration."))) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("STOP-TIMING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_planner_thread.NIL));
        $sym172$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");
        $sym173$START_TIMING = SubLObjectFactory.makeSymbol("START-TIMING");
        $str174$Depth = SubLObjectFactory.makeString("Depth");
        $sym175$RESET_COUNTERS = SubLObjectFactory.makeSymbol("RESET-COUNTERS");
        $str176$Error = SubLObjectFactory.makeString("Error");
        $str177$No_expansions_or_inferences___add = SubLObjectFactory.makeString("No expansions or inferences ~%added this iteration.");
        $sym178$SHOP_BASIC_PLANNER_THREAD_SEEK_PLANS_WITH_ITERATIVE_DEEPENING_MET = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-SEEK-PLANS-WITH-ITERATIVE-DEEPENING-METHOD");
        $sym179$GATHER_INITIAL_STATE = SubLObjectFactory.makeSymbol("GATHER-INITIAL-STATE");
        $list180 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $list181 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param MT hlmt-p\n   @return listp ;; of hl-formula-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INIT-MTS"), (SubLObject)shop_basic_planner_thread.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-ALL-GENL-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-MT"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-MT"), (SubLObject)SubLObjectFactory.makeSymbol("INIT-MTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-MT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlanDynamicSituationMicrotheory")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("GENL-MT"), (SubLObject)SubLObjectFactory.makeSymbol("INIT-MTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-HL-FORMULA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("APPEND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GATHER-MT-INDEX")), (SubLObject)SubLObjectFactory.makeSymbol("INIT-MTS")))))));
        $kw182$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw183$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw184$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym185$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw186$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str187$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym188$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw189$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str190$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw191$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str192$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const193$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $const194$PlanDynamicSituationMicrotheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlanDynamicSituationMicrotheory"));
        $str195$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str196$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str197$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym198$ASSERTION_HL_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-HL-FORMULA");
        $sym199$APPEND = SubLObjectFactory.makeSymbol("APPEND");
        $sym200$GATHER_MT_INDEX = SubLObjectFactory.makeSymbol("GATHER-MT-INDEX");
        $sym201$SHOP_BASIC_PLANNER_THREAD_GATHER_INITIAL_STATE_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-GATHER-INITIAL-STATE-METHOD");
        $sym202$MAKE_PROBLEM = SubLObjectFactory.makeSymbol("MAKE-PROBLEM");
        $list203 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("STATE"), (SubLObject)SubLObjectFactory.makeSymbol("TASKS"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $list204 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param PROBLEM-NAME\n   @param DOMAIN-NAME\n   @param STATE\n   @param TASKS\n   @param MT             microtheory-p\n   @return               shop-basic-problem-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("STATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-WORLD-STATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROBLEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("*SHOP-USE-MT-WORLD-STATES?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-WORLD-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-WORLD-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-WORLD-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DOMAIN")), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-WORLD-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("TASKS"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROBLEM"))));
        $sym205$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");
        $sym206$SHOP_BASIC_PROBLEM = SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM");
        $sym207$SHOP_MT_WORLD_STATE = SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE");
        $sym208$MT = SubLObjectFactory.makeSymbol("MT");
        $sym209$SHOP_BASIC_WORLD_STATE = SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE");
        $sym210$SHOP_BASIC_PLANNER_THREAD_MAKE_PROBLEM_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-MAKE-PROBLEM-METHOD");
        $sym211$MAKE_PROBLEM_FROM_FORMULA = SubLObjectFactory.makeSymbol("MAKE-PROBLEM-FROM-FORMULA");
        $list212 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $list213 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param FORMULA el-formula-p\n   @param MT microtheory-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-FORMULA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-REIFY-NARTS-IN-EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-TASKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("HL-FORMULA"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIAL-STATE"), (SubLObject)shop_basic_planner_thread.NIL), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROBLEM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROBLEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MAKE-PROBLEM")), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("INITIAL-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-TASKS"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROBLEM"))));
        $sym214$SHOP_BASIC_PLANNER_THREAD_MAKE_PROBLEM_FROM_FORMULA_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-MAKE-PROBLEM-FROM-FORMULA-METHOD");
        $sym215$FIND_PLANS = SubLObjectFactory.makeSymbol("FIND-PLANS");
        $list216 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list217 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHICH"), (SubLObject)SubLObjectFactory.makeKeyword("ALL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBOSITY"), (SubLObject)shop_basic_planner_thread.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)shop_basic_planner_thread.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)shop_basic_planner_thread.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)shop_basic_planner_thread.NIL));
        $list218 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TASK-FORMULA el-formula-p\n   @param MT microtheory-p\n   FIND-PLANS starts the search for a plan for problem with name NEW-PROBLEM."), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PROBLEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-PROBLEM-FROM-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INIT-PLANNER-THREAD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("WHICH"), (SubLObject)SubLObjectFactory.makeSymbol("VERBOSITY"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("TIME"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("*SHOP-GC*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GC"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)shop_basic_planner_thread.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)shop_basic_planner_thread.T, (SubLObject)SubLObjectFactory.makeString("Problem: ~s Domain: ~s Plans: ~s Verbosity: ~s~%"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("WHICH"), (SubLObject)SubLObjectFactory.makeSymbol("VERBOSITY"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("WHICH"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID-FIRST"), (SubLObject)SubLObjectFactory.makeKeyword("ID-ALL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEEK-PLANS-WITH-ITERATIVE-DEEPENING"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FIRST"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"), (SubLObject)SubLObjectFactory.makeKeyword("SHALLOWEST"), (SubLObject)SubLObjectFactory.makeKeyword("ALL-SHALLOWEST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SHOP-BASIC-PLANNER-THREAD-STATS-MANAGER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("START-TIMING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEEK-PLANS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SHOP-BASIC-PLANNER-THREAD-STATS-MANAGER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("STOP-TIMING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHERWISE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CERROR"), (SubLObject)SubLObjectFactory.makeString("invalid keyword ~S"), (SubLObject)SubLObjectFactory.makeSymbol("WHICH")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)shop_basic_planner_thread.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeString("Halted Because: "), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-TO-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HALT-STATUS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINT-STATS-HEADER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeString("Totals:")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINT-STATS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS-FOUND")))) }));
        $sym219$DOMAIN = SubLObjectFactory.makeSymbol("DOMAIN");
        $str220$Problem___s_Domain___s_Plans___s_ = SubLObjectFactory.makeString("Problem: ~s Domain: ~s Plans: ~s Verbosity: ~s~%");
        $kw221$ID_FIRST = SubLObjectFactory.makeKeyword("ID-FIRST");
        $kw222$ID_ALL = SubLObjectFactory.makeKeyword("ID-ALL");
        $str223$Halted_Because__ = SubLObjectFactory.makeString("Halted Because: ");
        $str224$Totals_ = SubLObjectFactory.makeString("Totals:");
        $sym225$SHOP_BASIC_PLANNER_THREAD_FIND_PLANS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-FIND-PLANS-METHOD");
        $sym226$COMPLETED_RUN_ = SubLObjectFactory.makeSymbol("COMPLETED-RUN?");
        $list227 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN-NODES"))));
        $sym228$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");
        $sym229$SHOP_BASIC_PLANNER_THREAD_COMPLETED_RUN__METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-COMPLETED-RUN?-METHOD");
        $sym230$SUMMARY = SubLObjectFactory.makeSymbol("SUMMARY");
        $list231 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("This function returns a list of values that can be used to summarize\n   the results of the thread."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TASKS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-LIST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLETED-RUN?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLETED-RUN?"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLAN-COUNT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS-FOUND")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLETED-RUN?"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-COUNT")))));
        $sym232$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");
        $sym233$GET_TASKS = SubLObjectFactory.makeSymbol("GET-TASKS");
        $sym234$SHOP_BASIC_PLANNER_THREAD_SUMMARY_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-SUMMARY-METHOD");
        $sym235$HTML_DISPLAY_SUMMARY = SubLObjectFactory.makeSymbol("HTML-DISPLAY-SUMMARY");
        $list236 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAPHRASE-LINK"));
        $list237 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("this function is used by the CycSecure AttackPlan History functionality.\n   displauys a short message about the thread and its resoultion."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TASKS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-LIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("RIGHT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-TEXT-WITH-TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("PARAPHRASE-LINK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("RIGHT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLETED-RUN?"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLAN-COUNT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("PLANS-FOUND")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ZEROP"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-COUNT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("No plans found"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)shop_basic_planner_thread.EQ, (SubLObject)shop_basic_planner_thread.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("PLAN-COUNT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FORMAT"), (SubLObject)SubLObjectFactory.makeString("~A Plan found"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-COUNT"))), (SubLObject)ConsesLow.list((SubLObject)shop_basic_planner_thread.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FORMAT"), (SubLObject)SubLObjectFactory.makeString("~A Plans found"), (SubLObject)SubLObjectFactory.makeSymbol("PLAN-COUNT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Not Completed")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_planner_thread.NIL)));
        $sym238$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD");
        $str239$No_plans_found = SubLObjectFactory.makeString("No plans found");
        $str240$_A_Plan_found = SubLObjectFactory.makeString("~A Plan found");
        $str241$_A_Plans_found = SubLObjectFactory.makeString("~A Plans found");
        $str242$Not_Completed = SubLObjectFactory.makeString("Not Completed");
        $sym243$SHOP_BASIC_PLANNER_THREAD_HTML_DISPLAY_SUMMARY_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD-HTML-DISPLAY-SUMMARY-METHOD");
        $list244 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("LIST"));
        $sym245$FWHEN = SubLObjectFactory.makeSymbol("FWHEN");
        $sym246$SUBLOOP_TYPE_P = SubLObjectFactory.makeSymbol("SUBLOOP-TYPE-P");
        $sym247$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list248 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT-LIST"), (SubLObject)shop_basic_planner_thread.NIL));
        $sym249$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym250$CUR_ITEM = SubLObjectFactory.makeSymbol("CUR-ITEM");
        $sym251$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $sym252$INLINE_METHOD = SubLObjectFactory.makeSymbol("INLINE-METHOD");
        $list253 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-ITEM"));
        $list254 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT-LIST"));
        $list255 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT-LIST")));
        $sym256$SHOP_REIFIABLE_NAT_ = SubLObjectFactory.makeSymbol("SHOP-REIFIABLE-NAT?");
        $sym257$FIND_WHEN_CLOSED_NAUT = SubLObjectFactory.makeSymbol("FIND-WHEN-CLOSED-NAUT");
        $sym258$SHOP_PLANNER_THREAD_P = SubLObjectFactory.makeSymbol("SHOP-PLANNER-THREAD-P");
        $kw259$THREAD_STRUCTURE = SubLObjectFactory.makeKeyword("THREAD-STRUCTURE");
    }
}

/*

	Total time: 1398 ms
	
*/