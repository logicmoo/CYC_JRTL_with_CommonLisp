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

public final class shop_basic_planner_thread
    extends
      SubLTranslatedFile
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
  public static SubLObject shop_process_checkpoint(final SubLObject thread)
  {
    final SubLObject pw = instances.get_slot( thread, $sym0$P_WRAPPER );
    final SubLObject stats_manager = instances.get_slot( thread, $sym1$STATS_MANAGER );
    if( NIL != pw )
    {
      methods.funcall_instance_method_with_0_args( stats_manager, $sym2$STOP_TIMING );
      process_utilities.process_wrapper_checkpoint( pw );
      methods.funcall_instance_method_with_0_args( stats_manager, $sym3$RESUME_TIMING );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject get_shop_basic_planner_thread_plans_found(final SubLObject v_shop_basic_planner_thread)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_planner_thread, NINETEEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject set_shop_basic_planner_thread_plans_found(final SubLObject v_shop_basic_planner_thread, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_planner_thread, value, NINETEEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject get_shop_basic_planner_thread_plan_number_to_cutoff(final SubLObject v_shop_basic_planner_thread)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_planner_thread, EIGHTEEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject set_shop_basic_planner_thread_plan_number_to_cutoff(final SubLObject v_shop_basic_planner_thread, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_planner_thread, value, EIGHTEEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject get_shop_basic_planner_thread_plan_number(final SubLObject v_shop_basic_planner_thread)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_planner_thread, SEVENTEEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject set_shop_basic_planner_thread_plan_number(final SubLObject v_shop_basic_planner_thread, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_planner_thread, value, SEVENTEEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject get_shop_basic_planner_thread_number_cutoff(final SubLObject v_shop_basic_planner_thread)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_planner_thread, SIXTEEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject set_shop_basic_planner_thread_number_cutoff(final SubLObject v_shop_basic_planner_thread, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_planner_thread, value, SIXTEEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject get_shop_basic_planner_thread_depth_cutoff(final SubLObject v_shop_basic_planner_thread)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_planner_thread, FIFTEEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject set_shop_basic_planner_thread_depth_cutoff(final SubLObject v_shop_basic_planner_thread, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_planner_thread, value, FIFTEEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject get_shop_basic_planner_thread_time_cutoff(final SubLObject v_shop_basic_planner_thread)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_planner_thread, FOURTEEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject set_shop_basic_planner_thread_time_cutoff(final SubLObject v_shop_basic_planner_thread, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_planner_thread, value, FOURTEEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject get_shop_basic_planner_thread_cycle_checking(final SubLObject v_shop_basic_planner_thread)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_planner_thread, THIRTEEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject set_shop_basic_planner_thread_cycle_checking(final SubLObject v_shop_basic_planner_thread, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_planner_thread, value, THIRTEEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject get_shop_basic_planner_thread_num_backchains(final SubLObject v_shop_basic_planner_thread)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_planner_thread, TWELVE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject set_shop_basic_planner_thread_num_backchains(final SubLObject v_shop_basic_planner_thread, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_planner_thread, value, TWELVE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject get_shop_basic_planner_thread_which_plans(final SubLObject v_shop_basic_planner_thread)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_planner_thread, ELEVEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject set_shop_basic_planner_thread_which_plans(final SubLObject v_shop_basic_planner_thread, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_planner_thread, value, ELEVEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject get_shop_basic_planner_thread_halt_status(final SubLObject v_shop_basic_planner_thread)
  {
    return classes.subloop_get_access_protected_instance_slot( v_shop_basic_planner_thread, TEN_INTEGER, $sym7$HALT_STATUS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject set_shop_basic_planner_thread_halt_status(final SubLObject v_shop_basic_planner_thread, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_shop_basic_planner_thread, value, TEN_INTEGER, $sym7$HALT_STATUS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject get_shop_basic_planner_thread_initial_plan_state(final SubLObject v_shop_basic_planner_thread)
  {
    return classes.subloop_get_access_protected_instance_slot( v_shop_basic_planner_thread, NINE_INTEGER, $sym8$INITIAL_PLAN_STATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject set_shop_basic_planner_thread_initial_plan_state(final SubLObject v_shop_basic_planner_thread, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_shop_basic_planner_thread, value, NINE_INTEGER, $sym8$INITIAL_PLAN_STATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject get_shop_basic_planner_thread_log(final SubLObject v_shop_basic_planner_thread)
  {
    return classes.subloop_get_access_protected_instance_slot( v_shop_basic_planner_thread, EIGHT_INTEGER, $sym9$LOG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject set_shop_basic_planner_thread_log(final SubLObject v_shop_basic_planner_thread, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_shop_basic_planner_thread, value, EIGHT_INTEGER, $sym9$LOG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject get_shop_basic_planner_thread_stats_manager(final SubLObject v_shop_basic_planner_thread)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_planner_thread, SEVEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject set_shop_basic_planner_thread_stats_manager(final SubLObject v_shop_basic_planner_thread, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_planner_thread, value, SEVEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject get_shop_basic_planner_thread_var_manager(final SubLObject v_shop_basic_planner_thread)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_planner_thread, SIX_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject set_shop_basic_planner_thread_var_manager(final SubLObject v_shop_basic_planner_thread, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_planner_thread, value, SIX_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject get_shop_basic_planner_thread_p_wrapper(final SubLObject v_shop_basic_planner_thread)
  {
    return classes.subloop_get_access_protected_instance_slot( v_shop_basic_planner_thread, FIVE_INTEGER, $sym0$P_WRAPPER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject set_shop_basic_planner_thread_p_wrapper(final SubLObject v_shop_basic_planner_thread, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_shop_basic_planner_thread, value, FIVE_INTEGER, $sym0$P_WRAPPER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject get_shop_basic_planner_thread_open_nodes(final SubLObject v_shop_basic_planner_thread)
  {
    return classes.subloop_get_access_protected_instance_slot( v_shop_basic_planner_thread, FOUR_INTEGER, $sym10$OPEN_NODES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject set_shop_basic_planner_thread_open_nodes(final SubLObject v_shop_basic_planner_thread, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_shop_basic_planner_thread, value, FOUR_INTEGER, $sym10$OPEN_NODES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject get_shop_basic_planner_thread_planner(final SubLObject v_shop_basic_planner_thread)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_planner_thread, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject set_shop_basic_planner_thread_planner(final SubLObject v_shop_basic_planner_thread, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_planner_thread, value, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject get_shop_basic_planner_thread_axioms(final SubLObject v_shop_basic_planner_thread)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_planner_thread, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject set_shop_basic_planner_thread_axioms(final SubLObject v_shop_basic_planner_thread, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_planner_thread, value, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject get_shop_basic_planner_thread_problem(final SubLObject v_shop_basic_planner_thread)
  {
    return classes.subloop_get_access_protected_instance_slot( v_shop_basic_planner_thread, ONE_INTEGER, $sym11$PROBLEM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject set_shop_basic_planner_thread_problem(final SubLObject v_shop_basic_planner_thread, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_shop_basic_planner_thread, value, ONE_INTEGER, $sym11$PROBLEM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject subloop_reserved_initialize_shop_basic_planner_thread_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym5$OBJECT, $sym12$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject subloop_reserved_initialize_shop_basic_planner_thread_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym5$OBJECT, $sym14$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym5$OBJECT, $sym15$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$SHOP_BASIC_PLANNER_THREAD, $sym11$PROBLEM, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$SHOP_BASIC_PLANNER_THREAD, $sym16$AXIOMS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$SHOP_BASIC_PLANNER_THREAD, $sym17$PLANNER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$SHOP_BASIC_PLANNER_THREAD, $sym10$OPEN_NODES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$SHOP_BASIC_PLANNER_THREAD, $sym0$P_WRAPPER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$SHOP_BASIC_PLANNER_THREAD, $sym18$VAR_MANAGER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$SHOP_BASIC_PLANNER_THREAD, $sym1$STATS_MANAGER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$SHOP_BASIC_PLANNER_THREAD, $sym9$LOG, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$SHOP_BASIC_PLANNER_THREAD, $sym8$INITIAL_PLAN_STATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$SHOP_BASIC_PLANNER_THREAD, $sym7$HALT_STATUS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$SHOP_BASIC_PLANNER_THREAD, $sym19$WHICH_PLANS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$SHOP_BASIC_PLANNER_THREAD, $sym20$NUM_BACKCHAINS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$SHOP_BASIC_PLANNER_THREAD, $sym21$CYCLE_CHECKING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$SHOP_BASIC_PLANNER_THREAD, $sym22$TIME_CUTOFF, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$SHOP_BASIC_PLANNER_THREAD, $sym23$DEPTH_CUTOFF, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$SHOP_BASIC_PLANNER_THREAD, $sym24$NUMBER_CUTOFF, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$SHOP_BASIC_PLANNER_THREAD, $sym25$PLAN_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$SHOP_BASIC_PLANNER_THREAD, $sym26$PLAN_NUMBER_TO_CUTOFF, NIL );
    classes.subloop_initialize_slot( new_instance, $sym4$SHOP_BASIC_PLANNER_THREAD, $sym27$PLANS_FOUND, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 1777L)
  public static SubLObject shop_basic_planner_thread_p(final SubLObject v_shop_basic_planner_thread)
  {
    return classes.subloop_instanceof_class( v_shop_basic_planner_thread, $sym4$SHOP_BASIC_PLANNER_THREAD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 3396L)
  public static SubLObject shop_basic_planner_thread_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
    SubLObject plan_number_to_cutoff = get_shop_basic_planner_thread_plan_number_to_cutoff( self );
    SubLObject plan_number = get_shop_basic_planner_thread_plan_number( self );
    SubLObject number_cutoff = get_shop_basic_planner_thread_number_cutoff( self );
    SubLObject depth_cutoff = get_shop_basic_planner_thread_depth_cutoff( self );
    SubLObject time_cutoff = get_shop_basic_planner_thread_time_cutoff( self );
    SubLObject cycle_checking = get_shop_basic_planner_thread_cycle_checking( self );
    SubLObject num_backchains = get_shop_basic_planner_thread_num_backchains( self );
    SubLObject halt_status = get_shop_basic_planner_thread_halt_status( self );
    SubLObject log = get_shop_basic_planner_thread_log( self );
    SubLObject stats_manager = get_shop_basic_planner_thread_stats_manager( self );
    SubLObject var_manager = get_shop_basic_planner_thread_var_manager( self );
    try
    {
      thread.throwStack.push( $sym32$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
      try
      {
        object.object_initialize_method( self );
        var_manager = object.object_new_method( $sym33$SHOP_VARIABLE_MANAGER );
        stats_manager = object.object_new_method( $sym34$SHOP_STATISTIC_MANAGER );
        log = object.object_new_method( $sym35$SHOP_LOG );
        plan_number = ZERO_INTEGER;
        plan_number_to_cutoff = ZERO_INTEGER;
        time_cutoff = NIL;
        depth_cutoff = shop_parameters.$shop_default_depth_limit$.getDynamicValue( thread );
        number_cutoff = NIL;
        halt_status = NIL;
        num_backchains = ZERO_INTEGER;
        cycle_checking = NIL;
        Dynamic.sublisp_throw( $sym32$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_thread_plan_number_to_cutoff( self, plan_number_to_cutoff );
          set_shop_basic_planner_thread_plan_number( self, plan_number );
          set_shop_basic_planner_thread_number_cutoff( self, number_cutoff );
          set_shop_basic_planner_thread_depth_cutoff( self, depth_cutoff );
          set_shop_basic_planner_thread_time_cutoff( self, time_cutoff );
          set_shop_basic_planner_thread_cycle_checking( self, cycle_checking );
          set_shop_basic_planner_thread_num_backchains( self, num_backchains );
          set_shop_basic_planner_thread_halt_status( self, halt_status );
          set_shop_basic_planner_thread_log( self, log );
          set_shop_basic_planner_thread_stats_manager( self, stats_manager );
          set_shop_basic_planner_thread_var_manager( self, var_manager );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable( ccatch_env_var, $sym32$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_thread_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 4006L)
  public static SubLObject shop_basic_planner_thread_output_message_method(final SubLObject self, final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
    final SubLObject log = get_shop_basic_planner_thread_log( self );
    try
    {
      thread.throwStack.push( $sym41$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym41$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, shop_log.shop_log_log_entry_method( log, string ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_thread_log( self, log );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable( ccatch_env_var, $sym41$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_thread_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 4184L)
  public static SubLObject shop_basic_planner_thread_any_cutoff_reachedP_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
    final SubLObject open_nodes = get_shop_basic_planner_thread_open_nodes( self );
    try
    {
      thread.throwStack.push( $sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
      try
      {
        if( NIL == open_nodes )
        {
          Dynamic.sublisp_throw( $sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, T );
        }
        Dynamic.sublisp_throw( $sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, makeBoolean( NIL != shop_basic_planner_thread_depth_cutoff_reachedP_method( self, open_nodes.first() )
            || NIL != shop_basic_planner_thread_time_cutoff_reachedP_method( self ) || NIL != shop_basic_planner_thread_number_cutoff_reachedP_method( self ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_thread_open_nodes( self, open_nodes );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable( ccatch_env_var, $sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_thread_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 4534L)
  public static SubLObject shop_basic_planner_thread_depth_cutoff_reachedP_method(final SubLObject self, final SubLObject plan_state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
    final SubLObject depth_cutoff = get_shop_basic_planner_thread_depth_cutoff( self );
    try
    {
      thread.throwStack.push( $sym50$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym50$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, depth_cutoff.isNumber() ? Numbers.numG( methods.funcall_instance_method_with_0_args( plan_state, $sym51$DEPTH ), depth_cutoff )
            : NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_thread_depth_cutoff( self, depth_cutoff );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable( ccatch_env_var, $sym50$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_thread_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 4811L)
  public static SubLObject shop_basic_planner_thread_time_cutoff_reachedP_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
    final SubLObject time_cutoff = get_shop_basic_planner_thread_time_cutoff( self );
    final SubLObject stats_manager = get_shop_basic_planner_thread_stats_manager( self );
    try
    {
      thread.throwStack.push( $sym55$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym55$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, ( NIL != time_cutoff ) ? Numbers.numG( shop_internals.statistic_manager_elapsed_run_time_since_last_call_method( stats_manager ),
            time_cutoff ) : NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_thread_time_cutoff( self, time_cutoff );
          set_shop_basic_planner_thread_stats_manager( self, stats_manager );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable( ccatch_env_var, $sym55$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_thread_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 5069L)
  public static SubLObject shop_basic_planner_thread_number_cutoff_reachedP_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
    final SubLObject plan_number_to_cutoff = get_shop_basic_planner_thread_plan_number_to_cutoff( self );
    final SubLObject number_cutoff = get_shop_basic_planner_thread_number_cutoff( self );
    try
    {
      thread.throwStack.push( $sym59$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym59$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, ( NIL != number_cutoff ) ? Numbers.numGE( plan_number_to_cutoff, number_cutoff ) : NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_thread_plan_number_to_cutoff( self, plan_number_to_cutoff );
          set_shop_basic_planner_thread_number_cutoff( self, number_cutoff );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable( ccatch_env_var, $sym59$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_thread_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 5261L)
  public static SubLObject shop_basic_planner_thread_cycl_plans_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
    final SubLObject plans_found = get_shop_basic_planner_thread_plans_found( self );
    try
    {
      thread.throwStack.push( $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, instances.get_slot( self, $sym27$PLANS_FOUND ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_thread_plans_found( self, plans_found );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable( ccatch_env_var, $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_thread_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 5441L)
  public static SubLObject shop_basic_planner_thread_print_stats_header_method(final SubLObject self, final SubLObject label)
  {
    shop_basic_planner_thread_output_message_method( self, PrintLow.format( NIL, $str68$___7_a_Plans_Mincost_Maxcost_Expa, label ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 5655L)
  public static SubLObject shop_basic_planner_thread_print_plan_method(final SubLObject self, final SubLObject plan)
  {
    shop_basic_planner_thread_output_message_method( self, PrintLow.format( NIL, $str73$___s, plan ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 5791L)
  public static SubLObject shop_shorterplan1(final SubLObject plan)
  {
    if( NIL == plan )
    {
      return NIL;
    }
    if( !ZERO_INTEGER.equal( plan.rest().first() ) )
    {
      return ConsesLow.cons( plan.first(), shop_shorterplan1( conses_high.cddr( plan ) ) );
    }
    return shop_shorterplan1( conses_high.cddr( plan ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 6068L)
  public static SubLObject shop_basic_planner_thread_print_stats_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
    final SubLObject plans_found = get_shop_basic_planner_thread_plans_found( self );
    final SubLObject stats_manager = get_shop_basic_planner_thread_stats_manager( self );
    try
    {
      thread.throwStack.push( $sym77$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
      try
      {
        final SubLObject plans = instances.get_slot( self, $sym27$PLANS_FOUND );
        final SubLObject tasks = methods.funcall_instance_method_with_0_args( stats_manager, $sym78$NUMBER_OF_EXPANSIONS );
        final SubLObject inferences = methods.funcall_instance_method_with_0_args( stats_manager, $sym79$NUMBER_OF_INFERENCES );
        final SubLObject run_time = shop_internals.statistic_manager_elapsed_run_time_method( stats_manager );
        final SubLObject real_time = shop_internals.statistic_manager_elapsed_real_time_method( stats_manager );
        shop_basic_planner_thread_output_message_method( self, PrintLow.format( NIL, $str80$___12_a_8_a_8_a_11_s_11_s_10_3f_1, new SubLObject[] { Sequences.length( plans ), ( NIL != plans ) ? Functions.apply( Symbols
            .symbol_function( $sym81$MIN ), Mapping.mapcar( Symbols.symbol_function( $sym82$SHOP_PLAN_COST ), plans ) ) : $str83$_, ( NIL != plans ) ? Functions.apply( Symbols.symbol_function( $sym84$MAX ), Mapping
                .mapcar( Symbols.symbol_function( $sym82$SHOP_PLAN_COST ), plans ) ) : $str83$_, tasks, inferences, Numbers.divide( run_time, time_high.$internal_time_units_per_second$.getGlobalValue() ), Numbers.divide(
                    real_time, time_high.$internal_time_units_per_second$.getGlobalValue() )
        } ) );
        Dynamic.sublisp_throw( $sym77$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_thread_plans_found( self, plans_found );
          set_shop_basic_planner_thread_stats_manager( self, stats_manager );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable( ccatch_env_var, $sym77$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_thread_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 7135L)
  public static SubLObject shop_basic_planner_thread_print_iterative_deepening_stats_method(final SubLObject self, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
    final SubLObject plans_found = get_shop_basic_planner_thread_plans_found( self );
    final SubLObject stats_manager = get_shop_basic_planner_thread_stats_manager( self );
    try
    {
      thread.throwStack.push( $sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
      try
      {
        final SubLObject plans = instances.get_slot( self, $sym27$PLANS_FOUND );
        final SubLObject tasks = methods.funcall_instance_method_with_0_args( stats_manager, $sym78$NUMBER_OF_EXPANSIONS );
        final SubLObject inferences = methods.funcall_instance_method_with_0_args( stats_manager, $sym79$NUMBER_OF_INFERENCES );
        final SubLObject run_time = methods.funcall_instance_method_with_0_args( stats_manager, $sym90$ELAPSED_RUN_TIME_SINCE_LAST_CALL );
        final SubLObject real_time = methods.funcall_instance_method_with_0_args( stats_manager, $sym91$ELAPSED_REAL_TIME_SINCE_LAST_CALL );
        shop_basic_planner_thread_output_message_method( self, PrintLow.format( NIL, $str92$___6_a_6_a_8_a_8_a_11_s_11_s_10_3, new SubLObject[] { depth, Sequences.length( plans ), ( NIL != plans ) ? Functions.apply(
            Symbols.symbol_function( $sym81$MIN ), Mapping.mapcar( Symbols.symbol_function( $sym82$SHOP_PLAN_COST ), plans ) ) : $str83$_, ( NIL != plans ) ? Functions.apply( Symbols.symbol_function( $sym84$MAX ),
                Mapping.mapcar( Symbols.symbol_function( $sym82$SHOP_PLAN_COST ), plans ) ) : $str83$_, tasks, inferences, Numbers.divide( run_time, time_high.$internal_time_units_per_second$.getGlobalValue() ), Numbers
                    .divide( real_time, time_high.$internal_time_units_per_second$.getGlobalValue() )
        } ) );
        Dynamic.sublisp_throw( $sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_thread_plans_found( self, plans_found );
          set_shop_basic_planner_thread_stats_manager( self, stats_manager );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable( ccatch_env_var, $sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_thread_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 8077L)
  public static SubLObject shop_basic_planner_thread_html_stats_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
    final SubLObject plans_found = get_shop_basic_planner_thread_plans_found( self );
    final SubLObject stats_manager = get_shop_basic_planner_thread_stats_manager( self );
    try
    {
      thread.throwStack.push( $sym96$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
      try
      {
        final SubLObject plans = instances.get_slot( self, $sym27$PLANS_FOUND );
        final SubLObject num_plans = Sequences.length( plans );
        final SubLObject tasks = methods.funcall_instance_method_with_0_args( stats_manager, $sym78$NUMBER_OF_EXPANSIONS );
        final SubLObject inferences = methods.funcall_instance_method_with_0_args( stats_manager, $sym79$NUMBER_OF_INFERENCES );
        final SubLObject run_time = Numbers.divide( methods.funcall_instance_method_with_0_args( stats_manager, $sym97$ELAPSED_RUN_TIME ), time_high.$internal_time_units_per_second$.getGlobalValue() );
        final SubLObject real_time = Numbers.divide( methods.funcall_instance_method_with_0_args( stats_manager, $sym98$ELAPSED_REAL_TIME ), time_high.$internal_time_units_per_second$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( ZERO_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( FIVE_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( ZERO_INTEGER );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str99$Plans );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$2, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str100$MinCost );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$3, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str101$MaxCost );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str102$Expansions );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str103$Inferences );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str104$CPU_Time );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              html_utilities.html_princ( $str105$Real_Time );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$1, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw106$RIGHT ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( num_plans );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw106$RIGHT ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( ( NIL != plans ) ? Functions.apply( Symbols.symbol_function( $sym81$MIN ), Mapping.mapcar( Symbols.symbol_function( $sym82$SHOP_PLAN_COST ), plans ) ) : $str83$_ );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw106$RIGHT ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( ( NIL != plans ) ? Functions.apply( Symbols.symbol_function( $sym84$MAX ), Mapping.mapcar( Symbols.symbol_function( $sym82$SHOP_PLAN_COST ), plans ) ) : $str83$_ );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw106$RIGHT ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( tasks );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw106$RIGHT ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( inferences );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw106$RIGHT ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( run_time );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw106$RIGHT ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ( real_time );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
        Dynamic.sublisp_throw( $sym96$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_thread_plans_found( self, plans_found );
          set_shop_basic_planner_thread_stats_manager( self, stats_manager );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable( ccatch_env_var, $sym96$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_thread_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 10013L)
  public static SubLObject shop_basic_planner_thread_set_problem_method(final SubLObject self, final SubLObject d)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
    SubLObject problem = get_shop_basic_planner_thread_problem( self );
    try
    {
      thread.throwStack.push( $sym112$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
      try
      {
        assert NIL != Types.integerp( d ) : d;
        problem = d;
        Dynamic.sublisp_throw( $sym112$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, d );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_thread_problem( self, problem );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable( ccatch_env_var, $sym112$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_thread_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 10162L)
  public static SubLObject shop_basic_planner_thread_get_problem_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
    final SubLObject problem = get_shop_basic_planner_thread_problem( self );
    try
    {
      thread.throwStack.push( $sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, problem );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_thread_problem( self, problem );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable( ccatch_env_var, $sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_thread_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 10252L)
  public static SubLObject shop_basic_planner_thread_get_domain_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
    final SubLObject problem = get_shop_basic_planner_thread_problem( self );
    try
    {
      thread.throwStack.push( $sym121$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym121$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, shop_datastructures.shop_basic_problem_get_domain_method( problem ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_thread_problem( self, problem );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable( ccatch_env_var, $sym121$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_thread_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 10399L)
  public static SubLObject shop_basic_planner_thread_get_which_plans_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
    final SubLObject which_plans = get_shop_basic_planner_thread_which_plans( self );
    try
    {
      thread.throwStack.push( $sym125$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym125$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, which_plans );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_thread_which_plans( self, which_plans );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable( ccatch_env_var, $sym125$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_thread_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 10518L)
  public static SubLObject shop_basic_planner_thread_set_which_plans_method(final SubLObject self, final SubLObject w)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
    SubLObject which_plans = get_shop_basic_planner_thread_which_plans( self );
    try
    {
      thread.throwStack.push( $sym130$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
      try
      {
        which_plans = w;
        Dynamic.sublisp_throw( $sym130$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, w );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_thread_which_plans( self, which_plans );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable( ccatch_env_var, $sym130$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_thread_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 10634L)
  public static SubLObject shop_basic_planner_thread_init_plan_state_method(final SubLObject self, final SubLObject problem)
  {
    instances.set_slot( self, $sym11$PROBLEM, problem );
    instances.set_slot( self, $sym8$INITIAL_PLAN_STATE, object.object_new_method( $sym136$SHOP_BASIC_PLAN_STATE ) );
    shop_basic_plan_state.shop_basic_plan_state_initialize_plan_state_with_problem_method( instances.get_slot( self, $sym8$INITIAL_PLAN_STATE ), problem, self );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 11204L)
  public static SubLObject shop_basic_planner_thread_init_planner_thread_method(final SubLObject self, final SubLObject new_problem, final SubLObject which, final SubLObject verbose, final SubLObject number,
      final SubLObject time, final SubLObject depth)
  {
    if( NIL != depth )
    {
      instances.set_slot( self, $sym23$DEPTH_CUTOFF, depth );
    }
    if( NIL != time )
    {
      instances.set_slot( self, $sym22$TIME_CUTOFF, Numbers.multiply( time, time_high.$internal_time_units_per_second$.getGlobalValue() ) );
    }
    if( NIL != number )
    {
      instances.set_slot( self, $sym24$NUMBER_CUTOFF, number );
    }
    instances.set_slot( self, $sym19$WHICH_PLANS, which );
    instances.set_slot( self, $sym25$PLAN_NUMBER, ZERO_INTEGER );
    instances.set_slot( self, $sym26$PLAN_NUMBER_TO_CUTOFF, ZERO_INTEGER );
    methods.funcall_instance_method_with_1_args( instances.get_slot( self, $sym9$LOG ), $sym141$SET_VERBOSITY, verbose );
    if( NIL == instances.get_slot( self, $sym11$PROBLEM ) )
    {
      shop_basic_planner_thread_init_plan_state_method( self, new_problem );
      instances.set_slot( self, $sym10$OPEN_NODES, ConsesLow.list( instances.get_slot( self, $sym8$INITIAL_PLAN_STATE ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 12262L)
  public static SubLObject shop_basic_planner_thread_found_plan_method(final SubLObject self, final SubLObject plan_state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    instances.set_slot( self, $sym25$PLAN_NUMBER, Numbers.add( ONE_INTEGER, instances.get_slot( self, $sym25$PLAN_NUMBER ) ) );
    instances.set_slot( self, $sym26$PLAN_NUMBER_TO_CUTOFF, Numbers.add( ONE_INTEGER, instances.get_slot( self, $sym26$PLAN_NUMBER_TO_CUTOFF ) ) );
    final SubLObject new_plan = object.object_new_method( $sym145$SHOP_BASIC_PLAN );
    final SubLObject depth = methods.funcall_instance_method_with_0_args( plan_state, $sym51$DEPTH );
    final SubLObject which_plans = instances.get_slot( self, $sym19$WHICH_PLANS );
    shop_basic_plan.shop_basic_plan_populate_plan_method( new_plan, plan_state );
    final SubLObject pcase_var = which_plans;
    if( pcase_var.eql( $kw146$SHALLOWEST ) )
    {
      instances.set_slot( self, $sym23$DEPTH_CUTOFF, number_utilities.f_1_( depth ) );
      instances.set_slot( self, $sym27$PLANS_FOUND, ConsesLow.list( new_plan ) );
    }
    else if( pcase_var.eql( $kw147$ALL_SHALLOWEST ) )
    {
      if( !instances.get_slot( self, $sym23$DEPTH_CUTOFF ).equal( depth ) )
      {
        instances.set_slot( self, $sym27$PLANS_FOUND, NIL );
        instances.set_slot( self, $sym23$DEPTH_CUTOFF, depth );
      }
      instances.set_slot( self, $sym27$PLANS_FOUND, ConsesLow.cons( new_plan, instances.get_slot( self, $sym27$PLANS_FOUND ) ) );
    }
    else if( pcase_var.eql( $kw148$ALL ) || pcase_var.eql( $kw149$FIRST ) )
    {
      instances.set_slot( self, $sym27$PLANS_FOUND, ConsesLow.cons( new_plan, instances.get_slot( self, $sym27$PLANS_FOUND ) ) );
    }
    else
    {
      Errors.cerror( $str150$invalid_keyword__S, which_plans );
    }
    final SubLObject entry = conses_high.assoc( $kw151$CUTOFFS, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    final SubLObject verbose_msg_level = ( NIL != entry ) ? entry.rest() : ZERO_INTEGER;
    final SubLObject verbose_thread_level = instances.get_slot( instances.get_slot( self, $sym9$LOG ), $sym152$VERBOSE );
    if( verbose_thread_level.numGE( verbose_msg_level ) )
    {
      methods.funcall_instance_method_with_1_args( instances.get_slot( self, $sym9$LOG ), $sym153$SUCCESS, PrintLow.format( NIL, $str154$depth__s_found_plan___s, depth, Sequences.length( instances.get_slot( self,
          $sym27$PLANS_FOUND ) ) ) );
    }
    return ConsesLow.list( NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 13815L)
  public static SubLObject shop_basic_planner_thread_halt_status_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
    final SubLObject halt_status = get_shop_basic_planner_thread_halt_status( self );
    try
    {
      thread.throwStack.push( $sym157$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym157$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, halt_status );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_thread_halt_status( self, halt_status );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable( ccatch_env_var, $sym157$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_thread_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 13910L)
  public static SubLObject shop_basic_planner_thread_update_halt_status_method(final SubLObject self)
  {
    final SubLObject open_nodes = instances.get_slot( self, $sym10$OPEN_NODES );
    if( NIL == open_nodes )
    {
      instances.set_slot( self, $sym7$HALT_STATUS, $kw161$SEARCH_EXHAUSTED );
    }
    else if( NIL != shop_basic_planner_thread_time_cutoff_reachedP_method( self ) )
    {
      instances.set_slot( self, $sym7$HALT_STATUS, $kw162$TIME_CUTOFF );
    }
    else if( NIL != shop_basic_planner_thread_depth_cutoff_reachedP_method( self, open_nodes.first() ) )
    {
      instances.set_slot( self, $sym7$HALT_STATUS, $kw163$DEPTH_CUTOFF );
    }
    else if( NIL != shop_basic_planner_thread_number_cutoff_reachedP_method( self ) )
    {
      instances.set_slot( self, $sym26$PLAN_NUMBER_TO_CUTOFF, ZERO_INTEGER );
      instances.set_slot( self, $sym7$HALT_STATUS, $kw164$NUMBER_CUTOFF );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 14490L)
  public static SubLObject shop_basic_planner_thread_seek_plans_method(final SubLObject self)
  {
    if( NIL == shop_basic_planner_thread_any_cutoff_reachedP_method( self ) )
    {
      SubLObject open_nodes;
      SubLObject cur_node;
      for( open_nodes = NIL, open_nodes = instances.get_slot( self, $sym10$OPEN_NODES ); NIL != open_nodes; 
    		  //open_nodes = open_nodes 
    				  )
      {
        if( NIL != shop_basic_planner_thread_any_cutoff_reachedP_method( self ) )
        {
          shop_planner_thread_pause( self );
        }
        shop_process_checkpoint( self );
        shop_internals.shop_statistic_manager_add_expansion_method( instances.get_slot( self, $sym1$STATS_MANAGER ) );
        cur_node = open_nodes.first();
        open_nodes = open_nodes.rest();
        if( NIL == instances.get_slot( cur_node, $sym168$TASKLIST ) )
        {
          shop_basic_planner_thread_found_plan_method( self, cur_node );
          instances.set_slot( self, $sym10$OPEN_NODES, open_nodes );
        }
        else
        {
          open_nodes = ConsesLow.append( shop_basic_plan_state.shop_basic_plan_state_expand_method( cur_node ), open_nodes );
          instances.set_slot( self, $sym10$OPEN_NODES, open_nodes );
        }
      }
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 15417L)
  public static SubLObject shop_basic_planner_thread_seek_plans_with_iterative_deepening_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
    final SubLObject plans_found = get_shop_basic_planner_thread_plans_found( self );
    final SubLObject depth_cutoff = get_shop_basic_planner_thread_depth_cutoff( self );
    final SubLObject stats_manager = get_shop_basic_planner_thread_stats_manager( self );
    try
    {
      thread.throwStack.push( $sym172$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
      try
      {
        SubLObject last_iteration_expansions = ZERO_INTEGER;
        SubLObject last_iteration_inferences = ZERO_INTEGER;
        methods.funcall_instance_method_with_0_args( stats_manager, $sym173$START_TIMING );
        shop_basic_planner_thread_print_stats_header_method( self, $str174$Depth );
        SubLObject cur_depth = NIL;
        cur_depth = ZERO_INTEGER;
        while ( NIL == instances.get_slot( self, $sym27$PLANS_FOUND ))
        {
          last_iteration_expansions = methods.funcall_instance_method_with_0_args( stats_manager, $sym78$NUMBER_OF_EXPANSIONS );
          last_iteration_inferences = methods.funcall_instance_method_with_0_args( stats_manager, $sym79$NUMBER_OF_INFERENCES );
          methods.funcall_instance_method_with_0_args( stats_manager, $sym175$RESET_COUNTERS );
          instances.set_slot( self, $sym23$DEPTH_CUTOFF, cur_depth );
          shop_basic_planner_thread_seek_plans_method( self );
          shop_basic_planner_thread_print_iterative_deepening_stats_method( self, cur_depth );
          if( Numbers.subtract( last_iteration_expansions, methods.funcall_instance_method_with_0_args( stats_manager, $sym78$NUMBER_OF_EXPANSIONS ) ).isZero() || Numbers.subtract( last_iteration_inferences, methods
              .funcall_instance_method_with_0_args( stats_manager, $sym79$NUMBER_OF_INFERENCES ) ).isZero() )
          {
            Errors.cerror( $str176$Error, $str177$No_expansions_or_inferences___add );
          }
          cur_depth = number_utilities.f_1X( cur_depth );
        }
        methods.funcall_instance_method_with_0_args( stats_manager, $sym2$STOP_TIMING );
        Dynamic.sublisp_throw( $sym172$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_thread_plans_found( self, plans_found );
          set_shop_basic_planner_thread_depth_cutoff( self, depth_cutoff );
          set_shop_basic_planner_thread_stats_manager( self, stats_manager );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable( ccatch_env_var, $sym172$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_thread_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 16570L)
  public static SubLObject shop_basic_planner_thread_gather_initial_state_method(final SubLObject self, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject init_mts = NIL;
    SubLObject node_var = mt;
    final SubLObject deck_type = $kw184$STACK;
    final SubLObject recur_deck = deck.create_deck( deck_type );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$17 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym185$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw186$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str187$_A_is_not_a__A, tv_var, $sym188$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw189$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str190$continue_anyway, $str187$_A_is_not_a__A, tv_var, $sym188$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw191$WARN ) )
            {
              Errors.warn( $str187$_A_is_not_a__A, tv_var, $sym188$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str192$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str190$continue_anyway, $str187$_A_is_not_a__A, tv_var, $sym188$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
          final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
          final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const193$genlMt ), thread );
            sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const193$genlMt ) ), thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const193$genlMt ) ), thread );
            sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
            sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const193$genlMt ), thread );
            if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( mt, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
            {
              final SubLObject _prev_bind_0_$19 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
              final SubLObject _prev_bind_1_$20 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
              final SubLObject _prev_bind_2_$22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                    $const193$genlMt ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                while ( NIL != node_var)
                {
                  final SubLObject genl_mt = node_var;
                  if( NIL == subl_promotions.memberP( genl_mt, init_mts, UNPROVIDED, UNPROVIDED ) && NIL != isa.isaP( genl_mt, $const194$PlanDynamicSituationMicrotheory, UNPROVIDED, UNPROVIDED ) )
                  {
                    init_mts = ConsesLow.cons( genl_mt, init_mts );
                  }
                  SubLObject cdolist_list_var;
                  final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const193$genlMt ) );
                  SubLObject module_var = NIL;
                  module_var = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    final SubLObject _prev_bind_0_$20 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                          .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                      final SubLObject node = function_terms.naut_to_nart( node_var );
                      if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                      {
                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                        if( NIL != d_link )
                        {
                          final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != mt_links )
                          {
                            SubLObject iteration_state;
                            for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                            {
                              thread.resetMultipleValues();
                              final SubLObject mt_$25 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                              final SubLObject tv_links = thread.secondMultipleValue();
                              thread.resetMultipleValues();
                              if( NIL != mt_relevance_macros.relevant_mtP( mt_$25 ) )
                              {
                                final SubLObject _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_mt$.bind( mt_$25, thread );
                                  SubLObject iteration_state_$27;
                                  for( iteration_state_$27 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state_$27 ); iteration_state_$27 = dictionary_contents.do_dictionary_contents_next( iteration_state_$27 ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$27 );
                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                    {
                                      final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                        final SubLObject sol = link_nodes;
                                        if( NIL != set.set_p( sol ) )
                                        {
                                          final SubLObject set_contents_var = set.do_set_internal( sol );
                                          SubLObject basis_object;
                                          SubLObject state;
                                          SubLObject node_vars_link_node;
                                          for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                              set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                          {
                                            node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                            if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                UNPROVIDED ) )
                                            {
                                              sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                              deck.deck_push( node_vars_link_node, recur_deck );
                                            }
                                          }
                                        }
                                        else if( sol.isList() )
                                        {
                                          SubLObject csome_list_var = sol;
                                          SubLObject node_vars_link_node2 = NIL;
                                          node_vars_link_node2 = csome_list_var.first();
                                          while ( NIL != csome_list_var)
                                          {
                                            if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                            {
                                              sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                              deck.deck_push( node_vars_link_node2, recur_deck );
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            node_vars_link_node2 = csome_list_var.first();
                                          }
                                        }
                                        else
                                        {
                                          Errors.error( $str195$_A_is_neither_SET_P_nor_LISTP_, sol );
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$22, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state_$27 );
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$21, thread );
                                }
                              }
                            }
                            dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                          }
                        }
                        else
                        {
                          sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str196$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                        }
                      }
                      else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                      {
                        SubLObject cdolist_list_var_$29;
                        final SubLObject new_list = cdolist_list_var_$29 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                            .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                UNPROVIDED ) ) )
                            : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                .get_sbhl_module( UNPROVIDED ) ) );
                        SubLObject generating_fn = NIL;
                        generating_fn = cdolist_list_var_$29.first();
                        while ( NIL != cdolist_list_var_$29)
                        {
                          final SubLObject _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                          try
                          {
                            sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                            final SubLObject sol2;
                            final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                            if( NIL != set.set_p( sol2 ) )
                            {
                              final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                              SubLObject basis_object2;
                              SubLObject state2;
                              SubLObject node_vars_link_node3;
                              for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                  set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                              {
                                node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3, UNPROVIDED ) )
                                {
                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                  deck.deck_push( node_vars_link_node3, recur_deck );
                                }
                              }
                            }
                            else if( sol2.isList() )
                            {
                              SubLObject csome_list_var2 = sol2;
                              SubLObject node_vars_link_node4 = NIL;
                              node_vars_link_node4 = csome_list_var2.first();
                              while ( NIL != csome_list_var2)
                              {
                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                {
                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                  deck.deck_push( node_vars_link_node4, recur_deck );
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                node_vars_link_node4 = csome_list_var2.first();
                              }
                            }
                            else
                            {
                              Errors.error( $str195$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                            }
                          }
                          finally
                          {
                            sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$23, thread );
                          }
                          cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                          generating_fn = cdolist_list_var_$29.first();
                        }
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$21, thread );
                      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$20, thread );
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    module_var = cdolist_list_var.first();
                  }
                  node_var = deck.deck_pop( recur_deck );
                }
              }
              finally
              {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$22, thread );
                sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$20, thread );
                sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$19, thread );
              }
            }
            else
            {
              sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str197$Node__a_does_not_pass_sbhl_type_t, mt, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                  UNPROVIDED );
            }
          }
          finally
          {
            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
            sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$19, thread );
            sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$18, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$17, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$24, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
    }
    return Mapping.mapcar( $sym198$ASSERTION_HL_FORMULA, Functions.apply( $sym199$APPEND, Mapping.mapcar( $sym200$GATHER_MT_INDEX, init_mts ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 17007L)
  public static SubLObject shop_basic_planner_thread_make_problem_method(final SubLObject self, final SubLObject problem_name, final SubLObject state, final SubLObject tasks, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
    final SubLObject planner = get_shop_basic_planner_thread_planner( self );
    try
    {
      thread.throwStack.push( $sym205$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
      try
      {
        SubLObject domain = NIL;
        SubLObject new_problem = NIL;
        SubLObject new_world_state = NIL;
        new_problem = object.object_new_method( $sym206$SHOP_BASIC_PROBLEM );
        if( NIL != shop_parameters.$shop_use_mt_world_statesP$.getDynamicValue( thread ) )
        {
          new_world_state = object.object_new_method( $sym207$SHOP_MT_WORLD_STATE );
          instances.set_slot( new_world_state, $sym208$MT, mt );
        }
        else
        {
          new_world_state = object.object_new_method( $sym209$SHOP_BASIC_WORLD_STATE );
        }
        domain = methods.funcall_instance_method_with_1_args( planner, $sym119$GET_DOMAIN, mt );
        shop_datastructures.shop_basic_problem_initialize_problem_method( new_problem, problem_name, domain, new_world_state, tasks, mt );
        Dynamic.sublisp_throw( $sym205$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, new_problem );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_thread_planner( self, planner );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable( ccatch_env_var, $sym205$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_thread_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 17917L)
  public static SubLObject shop_basic_planner_thread_make_problem_from_formula_method(final SubLObject self, final SubLObject formula, final SubLObject mt)
  {
    final SubLObject hl_formula = shop_reify_narts_in_expression( formula );
    final SubLObject cyc_tasks = ConsesLow.list( hl_formula );
    final SubLObject initial_state = NIL;
    SubLObject new_problem = NIL;
    new_problem = methods.funcall_instance_method_with_4_args( self, $sym202$MAKE_PROBLEM, formula, initial_state, cyc_tasks, mt );
    return new_problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 18384L)
  public static SubLObject shop_basic_planner_thread_find_plans_method(final SubLObject self, final SubLObject task_formula, final SubLObject mt, SubLObject which, SubLObject verbosity, SubLObject number,
      SubLObject time, SubLObject depth)
  {
    if( which == UNPROVIDED )
    {
      which = $kw148$ALL;
    }
    if( verbosity == UNPROVIDED )
    {
      verbosity = ZERO_INTEGER;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( time == UNPROVIDED )
    {
      time = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject new_problem = shop_basic_planner_thread_make_problem_from_formula_method( self, task_formula, mt );
    SubLObject domain = NIL;
    shop_basic_planner_thread_init_planner_thread_method( self, new_problem, which, verbosity, number, time, depth );
    if( NIL != shop_internals.$shop_gc$.getDynamicValue( thread ) )
    {
      Storage.gc( UNPROVIDED );
    }
    domain = shop_domain.shop_basic_domain_get_name_method( instances.get_slot( instances.get_slot( self, $sym11$PROBLEM ), $sym219$DOMAIN ) );
    SubLObject entry = conses_high.assoc( ONE_INTEGER, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    SubLObject verbose_msg_level = ( NIL != entry ) ? entry.rest() : ZERO_INTEGER;
    SubLObject verbose_thread_level = instances.get_slot( instances.get_slot( self, $sym9$LOG ), $sym152$VERBOSE );
    if( verbose_thread_level.numGE( verbose_msg_level ) )
    {
      PrintLow.format( T, $str220$Problem___s_Domain___s_Plans___s_, new SubLObject[] { new_problem, domain, which, verbosity
      } );
    }
    final SubLObject pcase_var = which;
    if( pcase_var.eql( $kw221$ID_FIRST ) || pcase_var.eql( $kw222$ID_ALL ) )
    {
      shop_basic_planner_thread_seek_plans_with_iterative_deepening_method( self );
    }
    else if( pcase_var.eql( $kw149$FIRST ) || pcase_var.eql( $kw148$ALL ) || pcase_var.eql( $kw146$SHALLOWEST ) || pcase_var.eql( $kw147$ALL_SHALLOWEST ) )
    {
      methods.funcall_instance_method_with_0_args( get_shop_basic_planner_thread_stats_manager( self ), $sym173$START_TIMING );
      shop_basic_planner_thread_seek_plans_method( self );
      methods.funcall_instance_method_with_0_args( get_shop_basic_planner_thread_stats_manager( self ), $sym2$STOP_TIMING );
    }
    else
    {
      Errors.cerror( $str150$invalid_keyword__S, which );
    }
    entry = conses_high.assoc( ONE_INTEGER, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    verbose_msg_level = ( NIL != entry ) ? entry.rest() : ZERO_INTEGER;
    verbose_thread_level = instances.get_slot( instances.get_slot( self, $sym9$LOG ), $sym152$VERBOSE );
    if( verbose_thread_level.numGE( verbose_msg_level ) )
    {
      shop_basic_planner_thread_output_message_method( self, Sequences.cconcatenate( $str223$Halted_Because__, PrintLow.write_to_string( shop_basic_planner_thread_halt_status_method( self ),
          EMPTY_SUBL_OBJECT_ARRAY ) ) );
      shop_basic_planner_thread_print_stats_header_method( self, $str224$Totals_ );
      shop_basic_planner_thread_print_stats_method( self );
    }
    return instances.get_slot( self, $sym27$PLANS_FOUND );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 19817L)
  public static SubLObject shop_basic_planner_thread_completed_runP_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
    final SubLObject open_nodes = get_shop_basic_planner_thread_open_nodes( self );
    try
    {
      thread.throwStack.push( $sym228$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym228$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, Types.sublisp_null( open_nodes ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_thread_open_nodes( self, open_nodes );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable( ccatch_env_var, $sym228$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_thread_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 19942L)
  public static SubLObject shop_basic_planner_thread_summary_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
    final SubLObject plans_found = get_shop_basic_planner_thread_plans_found( self );
    final SubLObject problem = get_shop_basic_planner_thread_problem( self );
    try
    {
      thread.throwStack.push( $sym232$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
      try
      {
        final SubLObject task_list = methods.funcall_instance_method_with_0_args( problem, $sym233$GET_TASKS );
        final SubLObject task = task_list.first();
        final SubLObject completed_runP = shop_basic_planner_thread_completed_runP_method( self );
        final SubLObject plan_count = Sequences.length( plans_found );
        Dynamic.sublisp_throw( $sym232$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, ConsesLow.list( task, completed_runP, plan_count ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_thread_plans_found( self, plans_found );
          set_shop_basic_planner_thread_problem( self, problem );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable( ccatch_env_var, $sym232$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_thread_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 20341L)
  public static SubLObject shop_basic_planner_thread_html_display_summary_method(final SubLObject self, final SubLObject paraphrase_link)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_thread_method = NIL;
    final SubLObject plans_found = get_shop_basic_planner_thread_plans_found( self );
    final SubLObject problem = get_shop_basic_planner_thread_problem( self );
    try
    {
      thread.throwStack.push( $sym238$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
      try
      {
        final SubLObject task_list = methods.funcall_instance_method_with_0_args( problem, $sym233$GET_TASKS );
        final SubLObject task = task_list.first();
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw106$RIGHT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          pph_html.html_text_with_target( task, paraphrase_link, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw106$RIGHT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          if( NIL != shop_basic_planner_thread_completed_runP_method( self ) )
          {
            final SubLObject plan_count = Sequences.length( plans_found );
            if( plan_count.isZero() )
            {
              html_utilities.html_princ( $str239$No_plans_found );
            }
            else if( ONE_INTEGER.eql( plan_count ) )
            {
              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str240$_A_Plan_found, plan_count );
            }
            else
            {
              PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str241$_A_Plans_found, plan_count );
            }
          }
          else
          {
            html_utilities.html_princ( $str242$Not_Completed );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        Dynamic.sublisp_throw( $sym238$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_thread_plans_found( self, plans_found );
          set_shop_basic_planner_thread_problem( self, problem );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_basic_planner_thread_method = Errors.handleThrowable( ccatch_env_var, $sym238$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_thread_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 21172L)
  public static SubLObject mapcar_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject method = NIL;
    SubLObject v_class = NIL;
    SubLObject list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list244 );
    method = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list244 );
    v_class = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list244 );
    list = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym245$FWHEN, ConsesLow.list( $sym246$SUBLOOP_TYPE_P, v_class ), ConsesLow.listS( $sym247$CLET, $list248, ConsesLow.list( $sym249$CDOLIST, ConsesLow.list( $sym250$CUR_ITEM, list ), ConsesLow
          .listS( $sym251$CPUSH, ConsesLow.listS( $sym252$INLINE_METHOD, ConsesLow.list( method, v_class ), $list253 ), $list254 ) ), $list255 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list244 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 21425L)
  public static SubLObject shop_plan_cost(final SubLObject plan)
  {
    return Sequences.length( shop_basic_plan.shop_basic_plan_primitive_form_method( plan ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 21541L)
  public static SubLObject shop_reifiable_natP(final SubLObject nat)
  {
    if( NIL != obsolete.reifiable_natP( nat, UNPROVIDED, UNPROVIDED ) && NIL != czer_utilities.el_find_nart( nat ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 21675L)
  public static SubLObject shop_reify_narts_in_expression(final SubLObject task)
  {
    return cycl_utilities.expression_ntransform( task, $sym256$SHOP_REIFIABLE_NAT_, $sym257$FIND_WHEN_CLOSED_NAUT, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 21814L)
  public static SubLObject shop_planner_thread_p(final SubLObject thread)
  {
    return shop_basic_planner_thread_p( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 22064L)
  public static SubLObject shop_planner_thread_plans_found(final SubLObject thread)
  {
    if( NIL == thread )
    {
      return NIL;
    }
    return instances.get_slot( thread, $sym27$PLANS_FOUND );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 22238L)
  public static SubLObject shop_planner_thread_num_plans_found(final SubLObject thread)
  {
    if( NIL == thread )
    {
      return NIL;
    }
    return instances.get_slot( thread, $sym25$PLAN_NUMBER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 22416L)
  public static SubLObject shop_planner_thread_num_open_nodes(final SubLObject thread)
  {
    if( NIL == thread )
    {
      return NIL;
    }
    return Sequences.length( instances.get_slot( thread, $sym10$OPEN_NODES ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 22603L)
  public static SubLObject shop_planner_thread_num_inferences(final SubLObject thread)
  {
    if( NIL == thread )
    {
      return NIL;
    }
    final SubLObject stats_manager = instances.get_slot( thread, $sym1$STATS_MANAGER );
    return methods.funcall_instance_method_with_0_args( stats_manager, $sym79$NUMBER_OF_INFERENCES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 22875L)
  public static SubLObject shop_planner_thread_nodes_expanded(final SubLObject thread)
  {
    if( NIL == thread )
    {
      return NIL;
    }
    final SubLObject stats_manager = instances.get_slot( thread, $sym1$STATS_MANAGER );
    return methods.funcall_instance_method_with_0_args( stats_manager, $sym78$NUMBER_OF_EXPANSIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 23147L)
  public static SubLObject shop_planner_thread_task(final SubLObject thread)
  {
    if( NIL == thread )
    {
      return NIL;
    }
    final SubLObject problem = instances.get_slot( thread, $sym11$PROBLEM );
    if( NIL == problem )
    {
      return NIL;
    }
    return shop_datastructures.shop_basic_problem_get_tasks_method( problem ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 23451L)
  public static SubLObject shop_planner_thread_pause(final SubLObject thread)
  {
    assert NIL != shop_planner_thread_p( thread ) : thread;
    final SubLObject pw = instances.get_slot( thread, $sym0$P_WRAPPER );
    final SubLObject stats_manager = instances.get_slot( thread, $sym1$STATS_MANAGER );
    methods.funcall_instance_method_with_0_args( thread, $sym159$UPDATE_HALT_STATUS );
    methods.funcall_instance_method_with_0_args( stats_manager, $sym2$STOP_TIMING );
    if( NIL != pw )
    {
      process_utilities.process_wrapper_block( pw );
    }
    methods.funcall_instance_method_with_0_args( stats_manager, $sym3$RESUME_TIMING );
    instances.set_slot( thread, $sym7$HALT_STATUS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-planner-thread.lisp", position = 23977L)
  public static SubLObject shop_plan_process_set_thread(final SubLObject pw, final SubLObject thread)
  {
    return process_utilities.process_wrapper_set_property( pw, $kw259$THREAD_STRUCTURE, thread );
  }

  public static SubLObject declare_shop_basic_planner_thread_file()
  {
    SubLFiles.declareFunction( me, "shop_process_checkpoint", "SHOP-PROCESS-CHECKPOINT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_planner_thread_plans_found", "GET-SHOP-BASIC-PLANNER-THREAD-PLANS-FOUND", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_planner_thread_plans_found", "SET-SHOP-BASIC-PLANNER-THREAD-PLANS-FOUND", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_planner_thread_plan_number_to_cutoff", "GET-SHOP-BASIC-PLANNER-THREAD-PLAN-NUMBER-TO-CUTOFF", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_planner_thread_plan_number_to_cutoff", "SET-SHOP-BASIC-PLANNER-THREAD-PLAN-NUMBER-TO-CUTOFF", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_planner_thread_plan_number", "GET-SHOP-BASIC-PLANNER-THREAD-PLAN-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_planner_thread_plan_number", "SET-SHOP-BASIC-PLANNER-THREAD-PLAN-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_planner_thread_number_cutoff", "GET-SHOP-BASIC-PLANNER-THREAD-NUMBER-CUTOFF", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_planner_thread_number_cutoff", "SET-SHOP-BASIC-PLANNER-THREAD-NUMBER-CUTOFF", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_planner_thread_depth_cutoff", "GET-SHOP-BASIC-PLANNER-THREAD-DEPTH-CUTOFF", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_planner_thread_depth_cutoff", "SET-SHOP-BASIC-PLANNER-THREAD-DEPTH-CUTOFF", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_planner_thread_time_cutoff", "GET-SHOP-BASIC-PLANNER-THREAD-TIME-CUTOFF", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_planner_thread_time_cutoff", "SET-SHOP-BASIC-PLANNER-THREAD-TIME-CUTOFF", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_planner_thread_cycle_checking", "GET-SHOP-BASIC-PLANNER-THREAD-CYCLE-CHECKING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_planner_thread_cycle_checking", "SET-SHOP-BASIC-PLANNER-THREAD-CYCLE-CHECKING", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_planner_thread_num_backchains", "GET-SHOP-BASIC-PLANNER-THREAD-NUM-BACKCHAINS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_planner_thread_num_backchains", "SET-SHOP-BASIC-PLANNER-THREAD-NUM-BACKCHAINS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_planner_thread_which_plans", "GET-SHOP-BASIC-PLANNER-THREAD-WHICH-PLANS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_planner_thread_which_plans", "SET-SHOP-BASIC-PLANNER-THREAD-WHICH-PLANS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_planner_thread_halt_status", "GET-SHOP-BASIC-PLANNER-THREAD-HALT-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_planner_thread_halt_status", "SET-SHOP-BASIC-PLANNER-THREAD-HALT-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_planner_thread_initial_plan_state", "GET-SHOP-BASIC-PLANNER-THREAD-INITIAL-PLAN-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_planner_thread_initial_plan_state", "SET-SHOP-BASIC-PLANNER-THREAD-INITIAL-PLAN-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_planner_thread_log", "GET-SHOP-BASIC-PLANNER-THREAD-LOG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_planner_thread_log", "SET-SHOP-BASIC-PLANNER-THREAD-LOG", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_planner_thread_stats_manager", "GET-SHOP-BASIC-PLANNER-THREAD-STATS-MANAGER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_planner_thread_stats_manager", "SET-SHOP-BASIC-PLANNER-THREAD-STATS-MANAGER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_planner_thread_var_manager", "GET-SHOP-BASIC-PLANNER-THREAD-VAR-MANAGER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_planner_thread_var_manager", "SET-SHOP-BASIC-PLANNER-THREAD-VAR-MANAGER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_planner_thread_p_wrapper", "GET-SHOP-BASIC-PLANNER-THREAD-P-WRAPPER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_planner_thread_p_wrapper", "SET-SHOP-BASIC-PLANNER-THREAD-P-WRAPPER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_planner_thread_open_nodes", "GET-SHOP-BASIC-PLANNER-THREAD-OPEN-NODES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_planner_thread_open_nodes", "SET-SHOP-BASIC-PLANNER-THREAD-OPEN-NODES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_planner_thread_planner", "GET-SHOP-BASIC-PLANNER-THREAD-PLANNER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_planner_thread_planner", "SET-SHOP-BASIC-PLANNER-THREAD-PLANNER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_planner_thread_axioms", "GET-SHOP-BASIC-PLANNER-THREAD-AXIOMS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_planner_thread_axioms", "SET-SHOP-BASIC-PLANNER-THREAD-AXIOMS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_planner_thread_problem", "GET-SHOP-BASIC-PLANNER-THREAD-PROBLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_planner_thread_problem", "SET-SHOP-BASIC-PLANNER-THREAD-PROBLEM", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_planner_thread_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-THREAD-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_planner_thread_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-THREAD-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_p", "SHOP-BASIC-PLANNER-THREAD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_initialize_method", "SHOP-BASIC-PLANNER-THREAD-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_output_message_method", "SHOP-BASIC-PLANNER-THREAD-OUTPUT-MESSAGE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_any_cutoff_reachedP_method", "SHOP-BASIC-PLANNER-THREAD-ANY-CUTOFF-REACHED?-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_depth_cutoff_reachedP_method", "SHOP-BASIC-PLANNER-THREAD-DEPTH-CUTOFF-REACHED?-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_time_cutoff_reachedP_method", "SHOP-BASIC-PLANNER-THREAD-TIME-CUTOFF-REACHED?-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_number_cutoff_reachedP_method", "SHOP-BASIC-PLANNER-THREAD-NUMBER-CUTOFF-REACHED?-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_cycl_plans_method", "SHOP-BASIC-PLANNER-THREAD-CYCL-PLANS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_print_stats_header_method", "SHOP-BASIC-PLANNER-THREAD-PRINT-STATS-HEADER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_print_plan_method", "SHOP-BASIC-PLANNER-THREAD-PRINT-PLAN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_shorterplan1", "SHOP-SHORTERPLAN1", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_print_stats_method", "SHOP-BASIC-PLANNER-THREAD-PRINT-STATS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_print_iterative_deepening_stats_method", "SHOP-BASIC-PLANNER-THREAD-PRINT-ITERATIVE-DEEPENING-STATS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_html_stats_method", "SHOP-BASIC-PLANNER-THREAD-HTML-STATS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_set_problem_method", "SHOP-BASIC-PLANNER-THREAD-SET-PROBLEM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_get_problem_method", "SHOP-BASIC-PLANNER-THREAD-GET-PROBLEM-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_get_domain_method", "SHOP-BASIC-PLANNER-THREAD-GET-DOMAIN-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_get_which_plans_method", "SHOP-BASIC-PLANNER-THREAD-GET-WHICH-PLANS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_set_which_plans_method", "SHOP-BASIC-PLANNER-THREAD-SET-WHICH-PLANS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_init_plan_state_method", "SHOP-BASIC-PLANNER-THREAD-INIT-PLAN-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_init_planner_thread_method", "SHOP-BASIC-PLANNER-THREAD-INIT-PLANNER-THREAD-METHOD", 7, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_found_plan_method", "SHOP-BASIC-PLANNER-THREAD-FOUND-PLAN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_halt_status_method", "SHOP-BASIC-PLANNER-THREAD-HALT-STATUS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_update_halt_status_method", "SHOP-BASIC-PLANNER-THREAD-UPDATE-HALT-STATUS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_seek_plans_method", "SHOP-BASIC-PLANNER-THREAD-SEEK-PLANS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_seek_plans_with_iterative_deepening_method", "SHOP-BASIC-PLANNER-THREAD-SEEK-PLANS-WITH-ITERATIVE-DEEPENING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_gather_initial_state_method", "SHOP-BASIC-PLANNER-THREAD-GATHER-INITIAL-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_make_problem_method", "SHOP-BASIC-PLANNER-THREAD-MAKE-PROBLEM-METHOD", 5, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_make_problem_from_formula_method", "SHOP-BASIC-PLANNER-THREAD-MAKE-PROBLEM-FROM-FORMULA-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_find_plans_method", "SHOP-BASIC-PLANNER-THREAD-FIND-PLANS-METHOD", 3, 5, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_completed_runP_method", "SHOP-BASIC-PLANNER-THREAD-COMPLETED-RUN?-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_summary_method", "SHOP-BASIC-PLANNER-THREAD-SUMMARY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_thread_html_display_summary_method", "SHOP-BASIC-PLANNER-THREAD-HTML-DISPLAY-SUMMARY-METHOD", 2, 0, false );
    SubLFiles.declareMacro( me, "mapcar_method", "MAPCAR-METHOD" );
    SubLFiles.declareFunction( me, "shop_plan_cost", "SHOP-PLAN-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_reifiable_natP", "SHOP-REIFIABLE-NAT?", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_reify_narts_in_expression", "SHOP-REIFY-NARTS-IN-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_planner_thread_p", "SHOP-PLANNER-THREAD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_planner_thread_plans_found", "SHOP-PLANNER-THREAD-PLANS-FOUND", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_planner_thread_num_plans_found", "SHOP-PLANNER-THREAD-NUM-PLANS-FOUND", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_planner_thread_num_open_nodes", "SHOP-PLANNER-THREAD-NUM-OPEN-NODES", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_planner_thread_num_inferences", "SHOP-PLANNER-THREAD-NUM-INFERENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_planner_thread_nodes_expanded", "SHOP-PLANNER-THREAD-NODES-EXPANDED", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_planner_thread_task", "SHOP-PLANNER-THREAD-TASK", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_planner_thread_pause", "SHOP-PLANNER-THREAD-PAUSE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_plan_process_set_thread", "SHOP-PLAN-PROCESS-SET-THREAD", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_shop_basic_planner_thread_file()
  {
    return NIL;
  }

  public static SubLObject setup_shop_basic_planner_thread_file()
  {
    classes.subloop_new_class( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym5$OBJECT, NIL, NIL, $list6 );
    classes.class_set_implements_slot_listeners( $sym4$SHOP_BASIC_PLANNER_THREAD, NIL );
    classes.subloop_note_class_initialization_function( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym13$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_THREAD_CLASS );
    classes.subloop_note_instance_initialization_function( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym28$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_THREAD_INSTANCE );
    subloop_reserved_initialize_shop_basic_planner_thread_class( $sym4$SHOP_BASIC_PLANNER_THREAD );
    methods.methods_incorporate_instance_method( $sym29$INITIALIZE, $sym4$SHOP_BASIC_PLANNER_THREAD, $list30, NIL, $list31 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym29$INITIALIZE, $sym36$SHOP_BASIC_PLANNER_THREAD_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym37$OUTPUT_MESSAGE, $sym4$SHOP_BASIC_PLANNER_THREAD, $list38, $list39, $list40 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym37$OUTPUT_MESSAGE, $sym42$SHOP_BASIC_PLANNER_THREAD_OUTPUT_MESSAGE_METHOD );
    methods.methods_incorporate_instance_method( $sym43$ANY_CUTOFF_REACHED_, $sym4$SHOP_BASIC_PLANNER_THREAD, $list30, NIL, $list44 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym43$ANY_CUTOFF_REACHED_, $sym46$SHOP_BASIC_PLANNER_THREAD_ANY_CUTOFF_REACHED__METHOD );
    methods.methods_incorporate_instance_method( $sym47$DEPTH_CUTOFF_REACHED_, $sym4$SHOP_BASIC_PLANNER_THREAD, $list38, $list48, $list49 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym47$DEPTH_CUTOFF_REACHED_, $sym52$SHOP_BASIC_PLANNER_THREAD_DEPTH_CUTOFF_REACHED__METHOD );
    methods.methods_incorporate_instance_method( $sym53$TIME_CUTOFF_REACHED_, $sym4$SHOP_BASIC_PLANNER_THREAD, $list38, NIL, $list54 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym53$TIME_CUTOFF_REACHED_, $sym56$SHOP_BASIC_PLANNER_THREAD_TIME_CUTOFF_REACHED__METHOD );
    methods.methods_incorporate_instance_method( $sym57$NUMBER_CUTOFF_REACHED_, $sym4$SHOP_BASIC_PLANNER_THREAD, $list38, NIL, $list58 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym57$NUMBER_CUTOFF_REACHED_, $sym60$SHOP_BASIC_PLANNER_THREAD_NUMBER_CUTOFF_REACHED__METHOD );
    methods.methods_incorporate_instance_method( $sym61$CYCL_PLANS, $sym4$SHOP_BASIC_PLANNER_THREAD, $list30, NIL, $list62 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym61$CYCL_PLANS, $sym64$SHOP_BASIC_PLANNER_THREAD_CYCL_PLANS_METHOD );
    methods.methods_incorporate_instance_method( $sym65$PRINT_STATS_HEADER, $sym4$SHOP_BASIC_PLANNER_THREAD, $list30, $list66, $list67 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym65$PRINT_STATS_HEADER, $sym69$SHOP_BASIC_PLANNER_THREAD_PRINT_STATS_HEADER_METHOD );
    methods.methods_incorporate_instance_method( $sym70$PRINT_PLAN, $sym4$SHOP_BASIC_PLANNER_THREAD, $list30, $list71, $list72 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym70$PRINT_PLAN, $sym74$SHOP_BASIC_PLANNER_THREAD_PRINT_PLAN_METHOD );
    methods.methods_incorporate_instance_method( $sym75$PRINT_STATS, $sym4$SHOP_BASIC_PLANNER_THREAD, $list30, NIL, $list76 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym75$PRINT_STATS, $sym85$SHOP_BASIC_PLANNER_THREAD_PRINT_STATS_METHOD );
    methods.methods_incorporate_instance_method( $sym86$PRINT_ITERATIVE_DEEPENING_STATS, $sym4$SHOP_BASIC_PLANNER_THREAD, $list30, $list87, $list88 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym86$PRINT_ITERATIVE_DEEPENING_STATS, $sym93$SHOP_BASIC_PLANNER_THREAD_PRINT_ITERATIVE_DEEPENING_STATS_METHOD );
    methods.methods_incorporate_instance_method( $sym94$HTML_STATS, $sym4$SHOP_BASIC_PLANNER_THREAD, $list30, NIL, $list95 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym94$HTML_STATS, $sym107$SHOP_BASIC_PLANNER_THREAD_HTML_STATS_METHOD );
    methods.methods_incorporate_instance_method( $sym108$SET_PROBLEM, $sym4$SHOP_BASIC_PLANNER_THREAD, $list109, $list110, $list111 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym108$SET_PROBLEM, $sym114$SHOP_BASIC_PLANNER_THREAD_SET_PROBLEM_METHOD );
    methods.methods_incorporate_instance_method( $sym115$GET_PROBLEM, $sym4$SHOP_BASIC_PLANNER_THREAD, $list30, NIL, $list116 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym115$GET_PROBLEM, $sym118$SHOP_BASIC_PLANNER_THREAD_GET_PROBLEM_METHOD );
    methods.methods_incorporate_instance_method( $sym119$GET_DOMAIN, $sym4$SHOP_BASIC_PLANNER_THREAD, $list30, NIL, $list120 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym119$GET_DOMAIN, $sym122$SHOP_BASIC_PLANNER_THREAD_GET_DOMAIN_METHOD );
    methods.methods_incorporate_instance_method( $sym123$GET_WHICH_PLANS, $sym4$SHOP_BASIC_PLANNER_THREAD, $list30, NIL, $list124 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym123$GET_WHICH_PLANS, $sym126$SHOP_BASIC_PLANNER_THREAD_GET_WHICH_PLANS_METHOD );
    methods.methods_incorporate_instance_method( $sym127$SET_WHICH_PLANS, $sym4$SHOP_BASIC_PLANNER_THREAD, $list109, $list128, $list129 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym127$SET_WHICH_PLANS, $sym131$SHOP_BASIC_PLANNER_THREAD_SET_WHICH_PLANS_METHOD );
    methods.methods_incorporate_instance_method( $sym132$INIT_PLAN_STATE, $sym4$SHOP_BASIC_PLANNER_THREAD, $list133, $list134, $list135 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym132$INIT_PLAN_STATE, $sym137$SHOP_BASIC_PLANNER_THREAD_INIT_PLAN_STATE_METHOD );
    methods.methods_incorporate_instance_method( $sym138$INIT_PLANNER_THREAD, $sym4$SHOP_BASIC_PLANNER_THREAD, $list133, $list139, $list140 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym138$INIT_PLANNER_THREAD, $sym142$SHOP_BASIC_PLANNER_THREAD_INIT_PLANNER_THREAD_METHOD );
    methods.methods_incorporate_instance_method( $sym143$FOUND_PLAN, $sym4$SHOP_BASIC_PLANNER_THREAD, $list133, $list48, $list144 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym143$FOUND_PLAN, $sym155$SHOP_BASIC_PLANNER_THREAD_FOUND_PLAN_METHOD );
    methods.methods_incorporate_instance_method( $sym7$HALT_STATUS, $sym4$SHOP_BASIC_PLANNER_THREAD, $list30, NIL, $list156 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym7$HALT_STATUS, $sym158$SHOP_BASIC_PLANNER_THREAD_HALT_STATUS_METHOD );
    methods.methods_incorporate_instance_method( $sym159$UPDATE_HALT_STATUS, $sym4$SHOP_BASIC_PLANNER_THREAD, $list133, NIL, $list160 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym159$UPDATE_HALT_STATUS, $sym165$SHOP_BASIC_PLANNER_THREAD_UPDATE_HALT_STATUS_METHOD );
    methods.methods_incorporate_instance_method( $sym166$SEEK_PLANS, $sym4$SHOP_BASIC_PLANNER_THREAD, $list133, NIL, $list167 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym166$SEEK_PLANS, $sym169$SHOP_BASIC_PLANNER_THREAD_SEEK_PLANS_METHOD );
    methods.methods_incorporate_instance_method( $sym170$SEEK_PLANS_WITH_ITERATIVE_DEEPENING, $sym4$SHOP_BASIC_PLANNER_THREAD, $list38, NIL, $list171 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym170$SEEK_PLANS_WITH_ITERATIVE_DEEPENING, $sym178$SHOP_BASIC_PLANNER_THREAD_SEEK_PLANS_WITH_ITERATIVE_DEEPENING_MET );
    methods.methods_incorporate_instance_method( $sym179$GATHER_INITIAL_STATE, $sym4$SHOP_BASIC_PLANNER_THREAD, $list38, $list180, $list181 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym179$GATHER_INITIAL_STATE, $sym201$SHOP_BASIC_PLANNER_THREAD_GATHER_INITIAL_STATE_METHOD );
    methods.methods_incorporate_instance_method( $sym202$MAKE_PROBLEM, $sym4$SHOP_BASIC_PLANNER_THREAD, $list30, $list203, $list204 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym202$MAKE_PROBLEM, $sym210$SHOP_BASIC_PLANNER_THREAD_MAKE_PROBLEM_METHOD );
    methods.methods_incorporate_instance_method( $sym211$MAKE_PROBLEM_FROM_FORMULA, $sym4$SHOP_BASIC_PLANNER_THREAD, $list30, $list212, $list213 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym211$MAKE_PROBLEM_FROM_FORMULA, $sym214$SHOP_BASIC_PLANNER_THREAD_MAKE_PROBLEM_FROM_FORMULA_METHOD );
    methods.methods_incorporate_instance_method( $sym215$FIND_PLANS, $sym4$SHOP_BASIC_PLANNER_THREAD, $list216, $list217, $list218 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym215$FIND_PLANS, $sym225$SHOP_BASIC_PLANNER_THREAD_FIND_PLANS_METHOD );
    methods.methods_incorporate_instance_method( $sym226$COMPLETED_RUN_, $sym4$SHOP_BASIC_PLANNER_THREAD, $list30, NIL, $list227 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym226$COMPLETED_RUN_, $sym229$SHOP_BASIC_PLANNER_THREAD_COMPLETED_RUN__METHOD );
    methods.methods_incorporate_instance_method( $sym230$SUMMARY, $sym4$SHOP_BASIC_PLANNER_THREAD, $list30, NIL, $list231 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym230$SUMMARY, $sym234$SHOP_BASIC_PLANNER_THREAD_SUMMARY_METHOD );
    methods.methods_incorporate_instance_method( $sym235$HTML_DISPLAY_SUMMARY, $sym4$SHOP_BASIC_PLANNER_THREAD, $list30, $list236, $list237 );
    methods.subloop_register_instance_method( $sym4$SHOP_BASIC_PLANNER_THREAD, $sym235$HTML_DISPLAY_SUMMARY, $sym243$SHOP_BASIC_PLANNER_THREAD_HTML_DISPLAY_SUMMARY_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_shop_basic_planner_thread_file();
  }

  @Override
  public void initializeVariables()
  {
    init_shop_basic_planner_thread_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_shop_basic_planner_thread_file();
  }
  static
  {
    me = new shop_basic_planner_thread();
    $sym0$P_WRAPPER = makeSymbol( "P-WRAPPER" );
    $sym1$STATS_MANAGER = makeSymbol( "STATS-MANAGER" );
    $sym2$STOP_TIMING = makeSymbol( "STOP-TIMING" );
    $sym3$RESUME_TIMING = makeSymbol( "RESUME-TIMING" );
    $sym4$SHOP_BASIC_PLANNER_THREAD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD" );
    $sym5$OBJECT = makeSymbol( "OBJECT" );
    $list6 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "PROBLEM" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "AXIOMS" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "PLANNER" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "OPEN-NODES" ), makeKeyword( "INSTANCE" ), makeKeyword(
            "PROTECTED" ) ), ConsesLow.list( makeSymbol( "P-WRAPPER" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "VAR-MANAGER" ), makeKeyword( "INSTANCE" ), makeKeyword(
                "PUBLIC" ) ), ConsesLow.list( makeSymbol( "STATS-MANAGER" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "LOG" ), makeKeyword( "INSTANCE" ), makeKeyword(
                    "PROTECTED" ) ), ConsesLow.list( makeSymbol( "INITIAL-PLAN-STATE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "HALT-STATUS" ), makeKeyword( "INSTANCE" ),
                        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "WHICH-PLANS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "NUM-BACKCHAINS" ), makeKeyword(
                            "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "CYCLE-CHECKING" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "TIME-CUTOFF" ),
                                makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEPTH-CUTOFF" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                    "NUMBER-CUTOFF" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "PLAN-NUMBER" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow
                                        .list( makeSymbol( "PLAN-NUMBER-TO-CUTOFF" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "PLANS-FOUND" ), makeKeyword( "INSTANCE" ),
                                            makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                                                "DEF-INSTANCE-METHOD" ), makeSymbol( "OUTPUT-MESSAGE" ), ConsesLow.list( makeSymbol( "STRING" ) ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol(
                                                    "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-OUTPUT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT-STATS" ),
                                                        ConsesLow.list( makeSymbol( "RUN-TIME" ), makeSymbol( "REAL-TIME" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                            "INIT-PLAN-STATE" ), ConsesLow.list( makeSymbol( "PROBLEM-NAME" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                                "GET-DOMAIN" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "COMPLETED-RUN?" ), NIL, makeKeyword(
                                                                    "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "HTML-DISPLAY-SUMMARY" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                                                                        makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NUMBER-CUTOFF-REACHED?" ), NIL, makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol(
                                                                            "DEF-INSTANCE-METHOD" ), makeSymbol( "TIME-CUTOFF-REACHED?" ), NIL, makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol(
                                                                                "DEF-INSTANCE-METHOD" ), makeSymbol( "DEPTH-CUTOFF-REACHED?" ), ConsesLow.list( makeSymbol( "PLAN-TASK" ) ), makeKeyword( "PRIVATE" ) )
    } );
    $sym7$HALT_STATUS = makeSymbol( "HALT-STATUS" );
    $sym8$INITIAL_PLAN_STATE = makeSymbol( "INITIAL-PLAN-STATE" );
    $sym9$LOG = makeSymbol( "LOG" );
    $sym10$OPEN_NODES = makeSymbol( "OPEN-NODES" );
    $sym11$PROBLEM = makeSymbol( "PROBLEM" );
    $sym12$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym13$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_THREAD_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-THREAD-CLASS" );
    $sym14$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym15$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym16$AXIOMS = makeSymbol( "AXIOMS" );
    $sym17$PLANNER = makeSymbol( "PLANNER" );
    $sym18$VAR_MANAGER = makeSymbol( "VAR-MANAGER" );
    $sym19$WHICH_PLANS = makeSymbol( "WHICH-PLANS" );
    $sym20$NUM_BACKCHAINS = makeSymbol( "NUM-BACKCHAINS" );
    $sym21$CYCLE_CHECKING = makeSymbol( "CYCLE-CHECKING" );
    $sym22$TIME_CUTOFF = makeSymbol( "TIME-CUTOFF" );
    $sym23$DEPTH_CUTOFF = makeSymbol( "DEPTH-CUTOFF" );
    $sym24$NUMBER_CUTOFF = makeSymbol( "NUMBER-CUTOFF" );
    $sym25$PLAN_NUMBER = makeSymbol( "PLAN-NUMBER" );
    $sym26$PLAN_NUMBER_TO_CUTOFF = makeSymbol( "PLAN-NUMBER-TO-CUTOFF" );
    $sym27$PLANS_FOUND = makeSymbol( "PLANS-FOUND" );
    $sym28$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_THREAD_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-THREAD-INSTANCE" );
    $sym29$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list30 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list31 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "VAR-MANAGER" ), ConsesLow.list( makeSymbol(
        "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ), makeSymbol( "SHOP-VARIABLE-MANAGER" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SHOP-VARIABLE-MANAGER" ) ) ) ), ConsesLow.list( makeSymbol(
            "CSETQ" ), makeSymbol( "STATS-MANAGER" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ), makeSymbol( "SHOP-STATISTIC-MANAGER" ) ), ConsesLow.list( makeSymbol( "QUOTE" ),
                makeSymbol( "SHOP-STATISTIC-MANAGER" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ), makeSymbol(
                    "SHOP-LOG" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SHOP-LOG" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PLAN-NUMBER" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol(
                        "CSETQ" ), makeSymbol( "PLAN-NUMBER-TO-CUTOFF" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TIME-CUTOFF" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                            "DEPTH-CUTOFF" ), makeSymbol( "*SHOP-DEFAULT-DEPTH-LIMIT*" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NUMBER-CUTOFF" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                "HALT-STATUS" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NUM-BACKCHAINS" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CYCLE-CHECKING" ), NIL ),
      ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) )
    } );
    $sym32$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD" );
    $sym33$SHOP_VARIABLE_MANAGER = makeSymbol( "SHOP-VARIABLE-MANAGER" );
    $sym34$SHOP_STATISTIC_MANAGER = makeSymbol( "SHOP-STATISTIC-MANAGER" );
    $sym35$SHOP_LOG = makeSymbol( "SHOP-LOG" );
    $sym36$SHOP_BASIC_PLANNER_THREAD_INITIALIZE_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-INITIALIZE-METHOD" );
    $sym37$OUTPUT_MESSAGE = makeSymbol( "OUTPUT-MESSAGE" );
    $list38 = ConsesLow.list( makeKeyword( "PRIVATE" ) );
    $list39 = ConsesLow.list( makeSymbol( "STRING" ) );
    $list40 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "LOG-ENTRY" ), makeSymbol( "SHOP-LOG" ) ), makeSymbol( "LOG" ), makeSymbol(
        "STRING" ) ) ) );
    $sym41$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD" );
    $sym42$SHOP_BASIC_PLANNER_THREAD_OUTPUT_MESSAGE_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-OUTPUT-MESSAGE-METHOD" );
    $sym43$ANY_CUTOFF_REACHED_ = makeSymbol( "ANY-CUTOFF-REACHED?" );
    $list44 = ConsesLow.list( makeString( "@return booleanp" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "OPEN-NODES" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ),
        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "DEPTH-CUTOFF-REACHED?" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol(
            "OPEN-NODES" ) ) ), ConsesLow.list( makeSymbol( "TIME-CUTOFF-REACHED?" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "NUMBER-CUTOFF-REACHED?" ), makeSymbol( "SELF" ) ) ) ) );
    $sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD" );
    $sym46$SHOP_BASIC_PLANNER_THREAD_ANY_CUTOFF_REACHED__METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-ANY-CUTOFF-REACHED?-METHOD" );
    $sym47$DEPTH_CUTOFF_REACHED_ = makeSymbol( "DEPTH-CUTOFF-REACHED?" );
    $list48 = ConsesLow.list( makeSymbol( "PLAN-STATE" ) );
    $list49 = ConsesLow.list( makeString( "@param PLAN-STATE shop-plan-state-p\n   @return booleanp" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "NUMBERP" ),
        makeSymbol( "DEPTH-CUTOFF" ) ), ConsesLow.list( makeSymbol( ">" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "DEPTH" ), makeSymbol( "SHOP-PLAN-STATE" ) ), makeSymbol(
            "PLAN-STATE" ) ), makeSymbol( "DEPTH-CUTOFF" ) ), NIL ) ) );
    $sym50$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD" );
    $sym51$DEPTH = makeSymbol( "DEPTH" );
    $sym52$SHOP_BASIC_PLANNER_THREAD_DEPTH_CUTOFF_REACHED__METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-DEPTH-CUTOFF-REACHED?-METHOD" );
    $sym53$TIME_CUTOFF_REACHED_ = makeSymbol( "TIME-CUTOFF-REACHED?" );
    $list54 = ConsesLow.list( makeString( "@return booleanp" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "TIME-CUTOFF" ), ConsesLow.list( makeSymbol( ">" ), ConsesLow.list(
        makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ELAPSED-RUN-TIME-SINCE-LAST-CALL" ), makeSymbol( "STATISTIC-MANAGER" ) ), makeSymbol( "STATS-MANAGER" ) ), makeSymbol( "TIME-CUTOFF" ) ), NIL ) ) );
    $sym55$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD" );
    $sym56$SHOP_BASIC_PLANNER_THREAD_TIME_CUTOFF_REACHED__METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-TIME-CUTOFF-REACHED?-METHOD" );
    $sym57$NUMBER_CUTOFF_REACHED_ = makeSymbol( "NUMBER-CUTOFF-REACHED?" );
    $list58 = ConsesLow.list( makeString( "@return booleanp" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "NUMBER-CUTOFF" ), ConsesLow.list( makeSymbol( ">=" ), makeSymbol(
        "PLAN-NUMBER-TO-CUTOFF" ), makeSymbol( "NUMBER-CUTOFF" ) ), NIL ) ) );
    $sym59$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD" );
    $sym60$SHOP_BASIC_PLANNER_THREAD_NUMBER_CUTOFF_REACHED__METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-NUMBER-CUTOFF-REACHED?-METHOD" );
    $sym61$CYCL_PLANS = makeSymbol( "CYCL-PLANS" );
    $list62 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLANS-FOUND" ) ) ) ) );
    $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD" );
    $sym64$SHOP_BASIC_PLANNER_THREAD_CYCL_PLANS_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-CYCL-PLANS-METHOD" );
    $sym65$PRINT_STATS_HEADER = makeSymbol( "PRINT-STATS-HEADER" );
    $list66 = ConsesLow.list( makeSymbol( "LABEL" ) );
    $list67 = ConsesLow.list( ConsesLow.list( makeSymbol( "OUTPUT-MESSAGE" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString(
        "~%~7@a Plans Mincost Maxcost Expansions Inferences CPU time Real time" ), makeSymbol( "LABEL" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $str68$___7_a_Plans_Mincost_Maxcost_Expa = makeString( "~%~7@a Plans Mincost Maxcost Expansions Inferences CPU time Real time" );
    $sym69$SHOP_BASIC_PLANNER_THREAD_PRINT_STATS_HEADER_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-PRINT-STATS-HEADER-METHOD" );
    $sym70$PRINT_PLAN = makeSymbol( "PRINT-PLAN" );
    $list71 = ConsesLow.list( makeSymbol( "PLAN" ) );
    $list72 = ConsesLow.list( ConsesLow.list( makeSymbol( "OUTPUT-MESSAGE" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "~%~s" ), makeSymbol( "PLAN" ) ) ), ConsesLow.list( makeSymbol(
        "RET" ), NIL ) );
    $str73$___s = makeString( "~%~s" );
    $sym74$SHOP_BASIC_PLANNER_THREAD_PRINT_PLAN_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-PRINT-PLAN-METHOD" );
    $sym75$PRINT_STATS = makeSymbol( "PRINT-STATS" );
    $list76 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PLANS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "PLANS-FOUND" ) ) ) ), ConsesLow.list( makeSymbol( "TASKS" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "STATS-MANAGER" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "NUMBER-OF-EXPANSIONS" ) ) ) ), ConsesLow.list( makeSymbol( "INFERENCES" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "STATS-MANAGER" ), ConsesLow.list( makeSymbol(
                "QUOTE" ), makeSymbol( "NUMBER-OF-INFERENCES" ) ) ) ), ConsesLow.list( makeSymbol( "RUN-TIME" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ELAPSED-RUN-TIME" ),
                    makeSymbol( "SHOP-STATISTIC-MANAGER" ) ), makeSymbol( "STATS-MANAGER" ) ) ), ConsesLow.list( makeSymbol( "REAL-TIME" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol(
                        "ELAPSED-REAL-TIME" ), makeSymbol( "SHOP-STATISTIC-MANAGER" ) ), makeSymbol( "STATS-MANAGER" ) ) ) ), ConsesLow.list( makeSymbol( "OUTPUT-MESSAGE" ), makeSymbol( "SELF" ), ConsesLow.list(
                            new SubLObject[]
                            { makeSymbol( "FORMAT" ), NIL, makeString( "~%~12@a~8@a~8@a~11@s~11@s~10,3f~11,3f" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "PLANS" ) ), ConsesLow.list( makeSymbol( "FIF" ),
                                makeSymbol( "PLANS" ), ConsesLow.list( makeSymbol( "APPLY" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "MIN" ) ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list(
                                    makeSymbol( "FUNCTION" ), makeSymbol( "SHOP-PLAN-COST" ) ), makeSymbol( "PLANS" ) ) ), makeString( "-" ) ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "PLANS" ), ConsesLow.list(
                                        makeSymbol( "APPLY" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "MAX" ) ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "FUNCTION" ),
                                            makeSymbol( "SHOP-PLAN-COST" ) ), makeSymbol( "PLANS" ) ) ), makeString( "-" ) ), makeSymbol( "TASKS" ), makeSymbol( "INFERENCES" ), ConsesLow.list( makeSymbol( "/" ),
                                                makeSymbol( "RUN-TIME" ), makeSymbol( "*INTERNAL-TIME-UNITS-PER-SECOND*" ) ), ConsesLow.list( makeSymbol( "/" ), makeSymbol( "REAL-TIME" ), makeSymbol(
                                                    "*INTERNAL-TIME-UNITS-PER-SECOND*" ) )
                            } ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym77$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD" );
    $sym78$NUMBER_OF_EXPANSIONS = makeSymbol( "NUMBER-OF-EXPANSIONS" );
    $sym79$NUMBER_OF_INFERENCES = makeSymbol( "NUMBER-OF-INFERENCES" );
    $str80$___12_a_8_a_8_a_11_s_11_s_10_3f_1 = makeString( "~%~12@a~8@a~8@a~11@s~11@s~10,3f~11,3f" );
    $sym81$MIN = makeSymbol( "MIN" );
    $sym82$SHOP_PLAN_COST = makeSymbol( "SHOP-PLAN-COST" );
    $str83$_ = makeString( "-" );
    $sym84$MAX = makeSymbol( "MAX" );
    $sym85$SHOP_BASIC_PLANNER_THREAD_PRINT_STATS_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-PRINT-STATS-METHOD" );
    $sym86$PRINT_ITERATIVE_DEEPENING_STATS = makeSymbol( "PRINT-ITERATIVE-DEEPENING-STATS" );
    $list87 = ConsesLow.list( makeSymbol( "DEPTH" ) );
    $list88 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PLANS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "PLANS-FOUND" ) ) ) ), ConsesLow.list( makeSymbol( "TASKS" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "STATS-MANAGER" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "NUMBER-OF-EXPANSIONS" ) ) ) ), ConsesLow.list( makeSymbol( "INFERENCES" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "STATS-MANAGER" ), ConsesLow.list( makeSymbol(
                "QUOTE" ), makeSymbol( "NUMBER-OF-INFERENCES" ) ) ) ), ConsesLow.list( makeSymbol( "RUN-TIME" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "STATS-MANAGER" ), ConsesLow.list(
                    makeSymbol( "QUOTE" ), makeSymbol( "ELAPSED-RUN-TIME-SINCE-LAST-CALL" ) ) ) ), ConsesLow.list( makeSymbol( "REAL-TIME" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                        "STATS-MANAGER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ELAPSED-REAL-TIME-SINCE-LAST-CALL" ) ) ) ) ), ConsesLow.list( makeSymbol( "OUTPUT-MESSAGE" ), makeSymbol( "SELF" ), ConsesLow
                            .list( new SubLObject[]
                            { makeSymbol( "FORMAT" ), NIL, makeString( "~%~6@a~6@a~8@a~8@a~11@s~11@s~10,3f~11,3f" ), makeSymbol( "DEPTH" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "PLANS" ) ), ConsesLow.list(
                                makeSymbol( "FIF" ), makeSymbol( "PLANS" ), ConsesLow.list( makeSymbol( "APPLY" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "MIN" ) ), ConsesLow.list( makeSymbol( "MAPCAR" ),
                                    ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "SHOP-PLAN-COST" ) ), makeSymbol( "PLANS" ) ) ), makeString( "-" ) ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "PLANS" ),
                                        ConsesLow.list( makeSymbol( "APPLY" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "MAX" ) ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol(
                                            "FUNCTION" ), makeSymbol( "SHOP-PLAN-COST" ) ), makeSymbol( "PLANS" ) ) ), makeString( "-" ) ), makeSymbol( "TASKS" ), makeSymbol( "INFERENCES" ), ConsesLow.list( makeSymbol(
                                                "/" ), makeSymbol( "RUN-TIME" ), makeSymbol( "*INTERNAL-TIME-UNITS-PER-SECOND*" ) ), ConsesLow.list( makeSymbol( "/" ), makeSymbol( "REAL-TIME" ), makeSymbol(
                                                    "*INTERNAL-TIME-UNITS-PER-SECOND*" ) )
    } ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD" );
    $sym90$ELAPSED_RUN_TIME_SINCE_LAST_CALL = makeSymbol( "ELAPSED-RUN-TIME-SINCE-LAST-CALL" );
    $sym91$ELAPSED_REAL_TIME_SINCE_LAST_CALL = makeSymbol( "ELAPSED-REAL-TIME-SINCE-LAST-CALL" );
    $str92$___6_a_6_a_8_a_8_a_11_s_11_s_10_3 = makeString( "~%~6@a~6@a~8@a~8@a~11@s~11@s~10,3f~11,3f" );
    $sym93$SHOP_BASIC_PLANNER_THREAD_PRINT_ITERATIVE_DEEPENING_STATS_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-PRINT-ITERATIVE-DEEPENING-STATS-METHOD" );
    $sym94$HTML_STATS = makeSymbol( "HTML-STATS" );
    $list95 = ConsesLow.list( makeString( "Displays in HTML an informative summary of the last planner run\n   on this thread." ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "PLANS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLANS-FOUND" ) ) ) ), ConsesLow.list( makeSymbol( "NUM-PLANS" ), ConsesLow.list(
            makeSymbol( "LENGTH" ), makeSymbol( "PLANS" ) ) ), ConsesLow.list( makeSymbol( "TASKS" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "STATS-MANAGER" ), ConsesLow.list( makeSymbol(
                "QUOTE" ), makeSymbol( "NUMBER-OF-EXPANSIONS" ) ) ) ), ConsesLow.list( makeSymbol( "INFERENCES" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "STATS-MANAGER" ), ConsesLow.list(
                    makeSymbol( "QUOTE" ), makeSymbol( "NUMBER-OF-INFERENCES" ) ) ) ), ConsesLow.list( makeSymbol( "RUN-TIME" ), ConsesLow.list( makeSymbol( "/" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ),
                        makeSymbol( "STATS-MANAGER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ELAPSED-RUN-TIME" ) ) ), makeSymbol( "*INTERNAL-TIME-UNITS-PER-SECOND*" ) ) ), ConsesLow.list( makeSymbol(
                            "REAL-TIME" ), ConsesLow.list( makeSymbol( "/" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "STATS-MANAGER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                "ELAPSED-REAL-TIME" ) ) ), makeSymbol( "*INTERNAL-TIME-UNITS-PER-SECOND*" ) ) ) ), ConsesLow.list( makeSymbol( "HTML-FANCY-TABLE" ), ConsesLow.list( makeKeyword( "CELLPADDING" ),
                                    FIVE_INTEGER, makeKeyword( "CELLSPACING" ), ZERO_INTEGER, makeKeyword( "BORDER" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "HTML-TABLE-ROW" ), ConsesLow.list( makeSymbol(
                                        "HTML-TABLE-DATA" ), ConsesLow.list( makeSymbol( "HTML-STRONG" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Plans" ) ) ) ), ConsesLow.list( makeSymbol(
                                            "HTML-TABLE-DATA" ), ConsesLow.list( makeSymbol( "HTML-STRONG" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "MinCost" ) ) ) ), ConsesLow.list( makeSymbol(
                                                "HTML-TABLE-DATA" ), ConsesLow.list( makeSymbol( "HTML-STRONG" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "MaxCost" ) ) ) ), ConsesLow.list( makeSymbol(
                                                    "HTML-TABLE-DATA" ), ConsesLow.list( makeSymbol( "HTML-STRONG" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Expansions" ) ) ) ), ConsesLow.list(
                                                        makeSymbol( "HTML-TABLE-DATA" ), ConsesLow.list( makeSymbol( "HTML-STRONG" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Inferences" ) ) ) ),
                                        ConsesLow.list( makeSymbol( "HTML-TABLE-DATA" ), ConsesLow.list( makeSymbol( "HTML-STRONG" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "CPU Time" ) ) ) ), ConsesLow
                                            .list( makeSymbol( "HTML-TABLE-DATA" ), ConsesLow.list( makeSymbol( "HTML-STRONG" ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Real Time" ) ) ) ) ), ConsesLow
                                                .list( makeSymbol( "HTML-TABLE-ROW" ), ConsesLow.list( makeSymbol( "HTML-FANCY-TABLE-DATA" ), ConsesLow.list( makeKeyword( "ALIGN" ), makeKeyword( "RIGHT" ) ), ConsesLow
                                                    .list( makeSymbol( "HTML-PRINC" ), makeSymbol( "NUM-PLANS" ) ) ), ConsesLow.list( makeSymbol( "HTML-FANCY-TABLE-DATA" ), ConsesLow.list( makeKeyword( "ALIGN" ),
                                                        makeKeyword( "RIGHT" ) ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "PLANS" ), ConsesLow.list( makeSymbol(
                                                            "APPLY" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "MIN" ) ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "FUNCTION" ),
                                                                makeSymbol( "SHOP-PLAN-COST" ) ), makeSymbol( "PLANS" ) ) ), makeString( "-" ) ) ) ), ConsesLow.list( makeSymbol( "HTML-FANCY-TABLE-DATA" ), ConsesLow.list(
                                                                    makeKeyword( "ALIGN" ), makeKeyword( "RIGHT" ) ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol(
                                                                        "PLANS" ), ConsesLow.list( makeSymbol( "APPLY" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "MAX" ) ), ConsesLow.list( makeSymbol(
                                                                            "MAPCAR" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "SHOP-PLAN-COST" ) ), makeSymbol( "PLANS" ) ) ), makeString( "-" ) ) ) ),
                                                    ConsesLow.list( makeSymbol( "HTML-FANCY-TABLE-DATA" ), ConsesLow.list( makeKeyword( "ALIGN" ), makeKeyword( "RIGHT" ) ), ConsesLow.list( makeSymbol( "HTML-PRINC" ),
                                                        makeSymbol( "TASKS" ) ) ), ConsesLow.list( makeSymbol( "HTML-FANCY-TABLE-DATA" ), ConsesLow.list( makeKeyword( "ALIGN" ), makeKeyword( "RIGHT" ) ), ConsesLow.list(
                                                            makeSymbol( "HTML-PRINC" ), makeSymbol( "INFERENCES" ) ) ), ConsesLow.list( makeSymbol( "HTML-FANCY-TABLE-DATA" ), ConsesLow.list( makeKeyword( "ALIGN" ),
                                                                makeKeyword( "RIGHT" ) ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeSymbol( "RUN-TIME" ) ) ), ConsesLow.list( makeSymbol( "HTML-FANCY-TABLE-DATA" ),
                                                                    ConsesLow.list( makeKeyword( "ALIGN" ), makeKeyword( "RIGHT" ) ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeSymbol( "REAL-TIME" ) ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym96$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD" );
    $sym97$ELAPSED_RUN_TIME = makeSymbol( "ELAPSED-RUN-TIME" );
    $sym98$ELAPSED_REAL_TIME = makeSymbol( "ELAPSED-REAL-TIME" );
    $str99$Plans = makeString( "Plans" );
    $str100$MinCost = makeString( "MinCost" );
    $str101$MaxCost = makeString( "MaxCost" );
    $str102$Expansions = makeString( "Expansions" );
    $str103$Inferences = makeString( "Inferences" );
    $str104$CPU_Time = makeString( "CPU Time" );
    $str105$Real_Time = makeString( "Real Time" );
    $kw106$RIGHT = makeKeyword( "RIGHT" );
    $sym107$SHOP_BASIC_PLANNER_THREAD_HTML_STATS_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-HTML-STATS-METHOD" );
    $sym108$SET_PROBLEM = makeSymbol( "SET-PROBLEM" );
    $list109 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list110 = ConsesLow.list( makeSymbol( "D" ) );
    $list111 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "D" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PROBLEM" ), makeSymbol( "D" ) ), ConsesLow
        .list( makeSymbol( "RET" ), makeSymbol( "D" ) ) );
    $sym112$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD" );
    $sym113$INTEGERP = makeSymbol( "INTEGERP" );
    $sym114$SHOP_BASIC_PLANNER_THREAD_SET_PROBLEM_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-SET-PROBLEM-METHOD" );
    $sym115$GET_PROBLEM = makeSymbol( "GET-PROBLEM" );
    $list116 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PROBLEM" ) ) );
    $sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD" );
    $sym118$SHOP_BASIC_PLANNER_THREAD_GET_PROBLEM_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-GET-PROBLEM-METHOD" );
    $sym119$GET_DOMAIN = makeSymbol( "GET-DOMAIN" );
    $list120 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-DOMAIN" ), makeSymbol( "SHOP-BASIC-PROBLEM" ) ), makeSymbol(
        "PROBLEM" ) ) ) );
    $sym121$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD" );
    $sym122$SHOP_BASIC_PLANNER_THREAD_GET_DOMAIN_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-GET-DOMAIN-METHOD" );
    $sym123$GET_WHICH_PLANS = makeSymbol( "GET-WHICH-PLANS" );
    $list124 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "WHICH-PLANS" ) ) );
    $sym125$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD" );
    $sym126$SHOP_BASIC_PLANNER_THREAD_GET_WHICH_PLANS_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-GET-WHICH-PLANS-METHOD" );
    $sym127$SET_WHICH_PLANS = makeSymbol( "SET-WHICH-PLANS" );
    $list128 = ConsesLow.list( makeSymbol( "W" ) );
    $list129 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "WHICH-PLANS" ), makeSymbol( "W" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "W" ) ) );
    $sym130$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD" );
    $sym131$SHOP_BASIC_PLANNER_THREAD_SET_WHICH_PLANS_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-SET-WHICH-PLANS-METHOD" );
    $sym132$INIT_PLAN_STATE = makeSymbol( "INIT-PLAN-STATE" );
    $list133 = ConsesLow.list( makeKeyword( "NO-MEMBER-VARIABLES" ), makeKeyword( "PRIVATE" ) );
    $list134 = ConsesLow.list( makeSymbol( "PROBLEM" ) );
    $list135 = ConsesLow.list( makeString( "@param PROBLEM shop-problem-p" ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PROBLEM" ) ), makeSymbol(
        "PROBLEM" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INITIAL-PLAN-STATE" ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow
            .list( makeSymbol( "NEW" ), makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ),
                ConsesLow.list( makeSymbol( "INITIALIZE-PLAN-STATE-WITH-PROBLEM" ), makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                    "QUOTE" ), makeSymbol( "INITIAL-PLAN-STATE" ) ) ), makeSymbol( "PROBLEM" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym136$SHOP_BASIC_PLAN_STATE = makeSymbol( "SHOP-BASIC-PLAN-STATE" );
    $sym137$SHOP_BASIC_PLANNER_THREAD_INIT_PLAN_STATE_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-INIT-PLAN-STATE-METHOD" );
    $sym138$INIT_PLANNER_THREAD = makeSymbol( "INIT-PLANNER-THREAD" );
    $list139 = ConsesLow.list( makeSymbol( "NEW-PROBLEM" ), makeSymbol( "WHICH" ), makeSymbol( "VERBOSE" ), makeSymbol( "NUMBER" ), makeSymbol( "TIME" ), makeSymbol( "DEPTH" ) );
    $list140 = ConsesLow.list( new SubLObject[] { makeString(
        "called each time by FIND-PLANS. The first time, it sets up the INITIAL-PLAN-STATE\n   so the search can begin. Thereafter, when it is called by FIND-PLANS as part\n   of a search continuation. it resets the search-cutoffs, so that search can continue." ),
      ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "DEPTH" ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEPTH-CUTOFF" ) ), makeSymbol(
          "DEPTH" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TIME" ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TIME-CUTOFF" ) ),
              ConsesLow.list( makeSymbol( "*" ), makeSymbol( "TIME" ), makeSymbol( "*INTERNAL-TIME-UNITS-PER-SECOND*" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "NUMBER" ), ConsesLow.list( makeSymbol(
                  "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NUMBER-CUTOFF" ) ), makeSymbol( "NUMBER" ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ),
                      ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "WHICH-PLANS" ) ), makeSymbol( "WHICH" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                          makeSymbol( "PLAN-NUMBER" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLAN-NUMBER-TO-CUTOFF" ) ),
                              ZERO_INTEGER ), ConsesLow.list( makeSymbol( "FIM" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LOG" ) ) ), ConsesLow
                                  .list( makeSymbol( "QUOTE" ), makeSymbol( "SET-VERBOSITY" ) ), makeSymbol( "VERBOSE" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol(
                                      "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PROBLEM" ) ) ), ConsesLow.list( makeSymbol( "INIT-PLAN-STATE" ), makeSymbol( "SELF" ), makeSymbol( "NEW-PROBLEM" ) ),
                                      ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "OPEN-NODES" ) ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow
                                          .list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INITIAL-PLAN-STATE" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                              NIL )
    } );
    $sym141$SET_VERBOSITY = makeSymbol( "SET-VERBOSITY" );
    $sym142$SHOP_BASIC_PLANNER_THREAD_INIT_PLANNER_THREAD_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-INIT-PLANNER-THREAD-METHOD" );
    $sym143$FOUND_PLAN = makeSymbol( "FOUND-PLAN" );
    $list144 = ConsesLow.list( makeString(
        "@param PLAN-STATE shop-basic-plan-state-p \n   @return booleanp\n   FOUND-PLAN is called\n   when a PLAN-STATE has found a plan that satisfies the original\n   task. The plan is recorded with the state of the thread, and the\n   search continues.  Returns NIL." ),
        ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLAN-NUMBER" ) ), ConsesLow.list( makeSymbol( "+" ), ONE_INTEGER, ConsesLow.list( makeSymbol(
            "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLAN-NUMBER" ) ) ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                "QUOTE" ), makeSymbol( "PLAN-NUMBER-TO-CUTOFF" ) ), ConsesLow.list( makeSymbol( "+" ), ONE_INTEGER, ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                    makeSymbol( "PLAN-NUMBER-TO-CUTOFF" ) ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-PLAN" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow
                        .list( makeSymbol( "NEW" ), makeSymbol( "SHOP-BASIC-PLAN" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SHOP-BASIC-PLAN" ) ) ) ), ConsesLow.list( makeSymbol( "DEPTH" ), ConsesLow.list(
                            makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "DEPTH" ), makeSymbol( "SHOP-PLAN-STATE" ) ), makeSymbol( "PLAN-STATE" ) ) ), ConsesLow.list( makeSymbol( "WHICH-PLANS" ), ConsesLow
                                .list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "WHICH-PLANS" ) ) ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow
                                    .list( makeSymbol( "POPULATE-PLAN" ), makeSymbol( "SHOP-BASIC-PLAN" ) ), makeSymbol( "NEW-PLAN" ), makeSymbol( "PLAN-STATE" ) ), ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol(
                                        "WHICH-PLANS" ), ConsesLow.list( makeKeyword( "SHALLOWEST" ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                            "DEPTH-CUTOFF" ) ), ConsesLow.list( makeSymbol( "1-" ), makeSymbol( "DEPTH" ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                                                "QUOTE" ), makeSymbol( "PLANS-FOUND" ) ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "NEW-PLAN" ) ) ) ), ConsesLow.list( makeKeyword( "ALL-SHALLOWEST" ), ConsesLow
                                                    .list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( EQUAL, ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow
                                                        .list( makeSymbol( "QUOTE" ), makeSymbol( "DEPTH-CUTOFF" ) ) ), makeSymbol( "DEPTH" ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow
                                                            .list( makeSymbol( "QUOTE" ), makeSymbol( "PLANS-FOUND" ) ), NIL ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                                                                "QUOTE" ), makeSymbol( "DEPTH-CUTOFF" ) ), makeSymbol( "DEPTH" ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list(
                                                                    makeSymbol( "QUOTE" ), makeSymbol( "PLANS-FOUND" ) ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "NEW-PLAN" ), ConsesLow.list( makeSymbol(
                                                                        "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLANS-FOUND" ) ) ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                            makeKeyword( "ALL" ), makeKeyword( "FIRST" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
                                                                                "QUOTE" ), makeSymbol( "PLANS-FOUND" ) ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "NEW-PLAN" ), ConsesLow.list( makeSymbol(
                                                                                    "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLANS-FOUND" ) ) ) ) ) ), ConsesLow.list(
                                                                                        makeSymbol( "OTHERWISE" ), ConsesLow.list( makeSymbol( "CERROR" ), makeString( "invalid keyword ~S" ), makeSymbol(
                                                                                            "WHICH-PLANS" ) ) ) ), ConsesLow.list( makeSymbol( "WHEN-VERBOSE" ), makeKeyword( "CUTOFFS" ), ConsesLow.list( makeSymbol(
                                                                                                "FIM" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                                                    "LOG" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SUCCESS" ) ), ConsesLow.list( makeSymbol( "FORMAT" ),
                                                                                                        NIL, makeString( "depth ~s found plan #~s" ), makeSymbol( "DEPTH" ), ConsesLow.list( makeSymbol( "LENGTH" ),
                                                                                                            ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                                                                makeSymbol( "PLANS-FOUND" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                                                                                                                    "LIST" ), NIL ) ) ) );
    $sym145$SHOP_BASIC_PLAN = makeSymbol( "SHOP-BASIC-PLAN" );
    $kw146$SHALLOWEST = makeKeyword( "SHALLOWEST" );
    $kw147$ALL_SHALLOWEST = makeKeyword( "ALL-SHALLOWEST" );
    $kw148$ALL = makeKeyword( "ALL" );
    $kw149$FIRST = makeKeyword( "FIRST" );
    $str150$invalid_keyword__S = makeString( "invalid keyword ~S" );
    $kw151$CUTOFFS = makeKeyword( "CUTOFFS" );
    $sym152$VERBOSE = makeSymbol( "VERBOSE" );
    $sym153$SUCCESS = makeSymbol( "SUCCESS" );
    $str154$depth__s_found_plan___s = makeString( "depth ~s found plan #~s" );
    $sym155$SHOP_BASIC_PLANNER_THREAD_FOUND_PLAN_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-FOUND-PLAN-METHOD" );
    $list156 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "HALT-STATUS" ) ) );
    $sym157$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD" );
    $sym158$SHOP_BASIC_PLANNER_THREAD_HALT_STATUS_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-HALT-STATUS-METHOD" );
    $sym159$UPDATE_HALT_STATUS = makeSymbol( "UPDATE-HALT-STATUS" );
    $list160 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "OPEN-NODES" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "OPEN-NODES" ) ) ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "OPEN-NODES" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ),
            makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "HALT-STATUS" ) ), makeKeyword( "SEARCH-EXHAUSTED" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "TIME-CUTOFF-REACHED?" ),
                makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "HALT-STATUS" ) ), makeKeyword( "TIME-CUTOFF" ) ) ), ConsesLow
                    .list( ConsesLow.list( makeSymbol( "DEPTH-CUTOFF-REACHED?" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "OPEN-NODES" ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ),
                        makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "HALT-STATUS" ) ), makeKeyword( "DEPTH-CUTOFF" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol(
                            "NUMBER-CUTOFF-REACHED?" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                "PLAN-NUMBER-TO-CUTOFF" ) ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "HALT-STATUS" ) ),
                                    makeKeyword( "NUMBER-CUTOFF" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $kw161$SEARCH_EXHAUSTED = makeKeyword( "SEARCH-EXHAUSTED" );
    $kw162$TIME_CUTOFF = makeKeyword( "TIME-CUTOFF" );
    $kw163$DEPTH_CUTOFF = makeKeyword( "DEPTH-CUTOFF" );
    $kw164$NUMBER_CUTOFF = makeKeyword( "NUMBER-CUTOFF" );
    $sym165$SHOP_BASIC_PLANNER_THREAD_UPDATE_HALT_STATUS_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-UPDATE-HALT-STATUS-METHOD" );
    $sym166$SEEK_PLANS = makeSymbol( "SEEK-PLANS" );
    $list167 = ConsesLow.list( makeString( "SEEK-PLANS is the main planning loop. \n   OPEN-NODES is the list of current unexpand plan-states." ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol(
        "ANY-CUTOFF-REACHED?" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "CDO" ), ConsesLow.list( ConsesLow.list( makeSymbol( "OPEN-NODES" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ),
            ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "OPEN-NODES" ) ) ), makeSymbol( "OPEN-NODES" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "OPEN-NODES" ) ), ConsesLow.list(
                makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "ANY-CUTOFF-REACHED?" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "SHOP-PLANNER-THREAD-PAUSE" ),
                    makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "SHOP-PROCESS-CHECKPOINT" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ADD-EXPANSION" ),
                        makeSymbol( "SHOP-STATISTIC-MANAGER" ) ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "STATS-MANAGER" ) ) ) ), ConsesLow
                            .list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CUR-NODE" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "OPEN-NODES" ) ) ) ), ConsesLow.list( makeSymbol(
                                "CPOP" ), makeSymbol( "OPEN-NODES" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "NULL" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "CUR-NODE" ),
                                    ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TASKLIST" ) ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "FOUND-PLAN" ), makeSymbol( "SELF" ),
                                        makeSymbol( "CUR-NODE" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "OPEN-NODES" ) ), makeSymbol(
                                            "OPEN-NODES" ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CPUSH*" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol(
                                                "EXPAND" ), makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ), makeSymbol( "CUR-NODE" ) ), makeSymbol( "OPEN-NODES" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol(
                                                    "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "OPEN-NODES" ) ), makeSymbol( "OPEN-NODES" ) ) ) ) ) ) ) );
    $sym168$TASKLIST = makeSymbol( "TASKLIST" );
    $sym169$SHOP_BASIC_PLANNER_THREAD_SEEK_PLANS_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-SEEK-PLANS-METHOD" );
    $sym170$SEEK_PLANS_WITH_ITERATIVE_DEEPENING = makeSymbol( "SEEK-PLANS-WITH-ITERATIVE-DEEPENING" );
    $list171 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "LAST-ITERATION-EXPANSIONS" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "LAST-ITERATION-INFERENCES" ),
        ZERO_INTEGER ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "STATS-MANAGER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "START-TIMING" ) ) ), ConsesLow.list( makeSymbol(
            "PRINT-STATS-HEADER" ), makeSymbol( "SELF" ), makeString( "Depth" ) ), ConsesLow.list( new SubLObject[]
            { makeSymbol( "CDO" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CUR-DEPTH" ), ZERO_INTEGER, ConsesLow.list( makeSymbol( "1+" ), makeSymbol( "CUR-DEPTH" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol(
                "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLANS-FOUND" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LAST-ITERATION-EXPANSIONS" ), ConsesLow
                    .list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "STATS-MANAGER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NUMBER-OF-EXPANSIONS" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                        makeSymbol( "LAST-ITERATION-INFERENCES" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "STATS-MANAGER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                            "NUMBER-OF-INFERENCES" ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "STATS-MANAGER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                "RESET-COUNTERS" ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DEPTH-CUTOFF" ) ), makeSymbol( "CUR-DEPTH" ) ),
              ConsesLow.list( makeSymbol( "SEEK-PLANS" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "PRINT-ITERATIVE-DEEPENING-STATS" ), makeSymbol( "SELF" ), makeSymbol( "CUR-DEPTH" ) ), ConsesLow.list(
                  makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "COR" ), ConsesLow.list( makeSymbol( "ZEROP" ), ConsesLow.list( makeSymbol( "-" ), makeSymbol( "LAST-ITERATION-EXPANSIONS" ), ConsesLow.list(
                      makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "STATS-MANAGER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NUMBER-OF-EXPANSIONS" ) ) ) ) ), ConsesLow.list( makeSymbol( "ZEROP" ),
                          ConsesLow.list( makeSymbol( "-" ), makeSymbol( "LAST-ITERATION-INFERENCES" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "STATS-MANAGER" ), ConsesLow.list( makeSymbol(
                              "QUOTE" ), makeSymbol( "NUMBER-OF-INFERENCES" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CERROR" ), makeString( "Error" ), makeString(
                                  "No expansions or inferences ~%added this iteration." ) ) )
    } ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "STATS-MANAGER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "STOP-TIMING" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym172$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD" );
    $sym173$START_TIMING = makeSymbol( "START-TIMING" );
    $str174$Depth = makeString( "Depth" );
    $sym175$RESET_COUNTERS = makeSymbol( "RESET-COUNTERS" );
    $str176$Error = makeString( "Error" );
    $str177$No_expansions_or_inferences___add = makeString( "No expansions or inferences ~%added this iteration." );
    $sym178$SHOP_BASIC_PLANNER_THREAD_SEEK_PLANS_WITH_ITERATIVE_DEEPENING_MET = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-SEEK-PLANS-WITH-ITERATIVE-DEEPENING-METHOD" );
    $sym179$GATHER_INITIAL_STATE = makeSymbol( "GATHER-INITIAL-STATE" );
    $list180 = ConsesLow.list( makeSymbol( "MT" ) );
    $list181 = ConsesLow.list( makeString( "@param MT hlmt-p\n   @return listp ;; of hl-formula-p" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INIT-MTS" ), NIL ) ), ConsesLow
        .list( makeSymbol( "DO-ALL-GENL-MTS" ), ConsesLow.list( makeSymbol( "GENL-MT" ), makeSymbol( "MT" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol(
            "CNOT" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeSymbol( "GENL-MT" ), makeSymbol( "INIT-MTS" ) ) ), ConsesLow.list( makeSymbol( "ISA?" ), makeSymbol( "GENL-MT" ), constant_handles
                .reader_make_constant_shell( makeString( "PlanDynamicSituationMicrotheory" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "GENL-MT" ), makeSymbol( "INIT-MTS" ) ) ) ), ConsesLow.list(
                    makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ASSERTION-HL-FORMULA" ) ), ConsesLow.list( makeSymbol( "APPLY" ), ConsesLow.list(
                        makeSymbol( "QUOTE" ), makeSymbol( "APPEND" ) ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GATHER-MT-INDEX" ) ), makeSymbol(
                            "INIT-MTS" ) ) ) ) ) ) );
    $kw182$BREADTH = makeKeyword( "BREADTH" );
    $kw183$QUEUE = makeKeyword( "QUEUE" );
    $kw184$STACK = makeKeyword( "STACK" );
    $sym185$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw186$ERROR = makeKeyword( "ERROR" );
    $str187$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym188$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw189$CERROR = makeKeyword( "CERROR" );
    $str190$continue_anyway = makeString( "continue anyway" );
    $kw191$WARN = makeKeyword( "WARN" );
    $str192$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const193$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $const194$PlanDynamicSituationMicrotheory = constant_handles.reader_make_constant_shell( makeString( "PlanDynamicSituationMicrotheory" ) );
    $str195$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str196$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str197$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $sym198$ASSERTION_HL_FORMULA = makeSymbol( "ASSERTION-HL-FORMULA" );
    $sym199$APPEND = makeSymbol( "APPEND" );
    $sym200$GATHER_MT_INDEX = makeSymbol( "GATHER-MT-INDEX" );
    $sym201$SHOP_BASIC_PLANNER_THREAD_GATHER_INITIAL_STATE_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-GATHER-INITIAL-STATE-METHOD" );
    $sym202$MAKE_PROBLEM = makeSymbol( "MAKE-PROBLEM" );
    $list203 = ConsesLow.list( makeSymbol( "PROBLEM-NAME" ), makeSymbol( "STATE" ), makeSymbol( "TASKS" ), makeSymbol( "MT" ) );
    $list204 = ConsesLow.list( makeString( "@param PROBLEM-NAME\n   @param DOMAIN-NAME\n   @param STATE\n   @param TASKS\n   @param MT             microtheory-p\n   @return               shop-basic-problem-p" ),
        ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "STATE" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "DOMAIN" ), makeSymbol( "NEW-PROBLEM" ), makeSymbol( "NEW-WORLD-STATE" ) ),
            ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEW-PROBLEM" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ), makeSymbol( "SHOP-BASIC-PROBLEM" ) ), ConsesLow.list(
                makeSymbol( "QUOTE" ), makeSymbol( "SHOP-BASIC-PROBLEM" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "*SHOP-USE-MT-WORLD-STATES?*" ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list(
                    makeSymbol( "CSETQ" ), makeSymbol( "NEW-WORLD-STATE" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ), makeSymbol( "SHOP-MT-WORLD-STATE" ) ), ConsesLow.list(
                        makeSymbol( "QUOTE" ), makeSymbol( "SHOP-MT-WORLD-STATE" ) ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "NEW-WORLD-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                            "MT" ) ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEW-WORLD-STATE" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ),
                                makeSymbol( "SHOP-BASIC-WORLD-STATE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SHOP-BASIC-WORLD-STATE" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                    "DOMAIN" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PLANNER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-DOMAIN" ) ), makeSymbol(
                                        "MT" ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "INITIALIZE-PROBLEM" ), makeSymbol( "SHOP-BASIC-PROBLEM" ) ), makeSymbol( "NEW-PROBLEM" ),
                                            makeSymbol( "PROBLEM-NAME" ), makeSymbol( "DOMAIN" ), makeSymbol( "NEW-WORLD-STATE" ), makeSymbol( "TASKS" ), makeSymbol( "MT" ) ), ConsesLow.list( makeSymbol( "RET" ),
                                                makeSymbol( "NEW-PROBLEM" ) ) ) );
    $sym205$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD" );
    $sym206$SHOP_BASIC_PROBLEM = makeSymbol( "SHOP-BASIC-PROBLEM" );
    $sym207$SHOP_MT_WORLD_STATE = makeSymbol( "SHOP-MT-WORLD-STATE" );
    $sym208$MT = makeSymbol( "MT" );
    $sym209$SHOP_BASIC_WORLD_STATE = makeSymbol( "SHOP-BASIC-WORLD-STATE" );
    $sym210$SHOP_BASIC_PLANNER_THREAD_MAKE_PROBLEM_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-MAKE-PROBLEM-METHOD" );
    $sym211$MAKE_PROBLEM_FROM_FORMULA = makeSymbol( "MAKE-PROBLEM-FROM-FORMULA" );
    $list212 = ConsesLow.list( makeSymbol( "FORMULA" ), makeSymbol( "MT" ) );
    $list213 = ConsesLow.list( makeString( "@param FORMULA el-formula-p\n   @param MT microtheory-p" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HL-FORMULA" ), ConsesLow.list(
        makeSymbol( "SHOP-REIFY-NARTS-IN-EXPRESSION" ), makeSymbol( "FORMULA" ) ) ), ConsesLow.list( makeSymbol( "CYC-TASKS" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "HL-FORMULA" ) ) ), ConsesLow.list(
            makeSymbol( "INITIAL-STATE" ), NIL ), makeSymbol( "NEW-PROBLEM" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEW-PROBLEM" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "MAKE-PROBLEM" ) ), makeSymbol( "FORMULA" ), makeSymbol( "INITIAL-STATE" ), makeSymbol( "CYC-TASKS" ), makeSymbol( "MT" ) ) ), ConsesLow.list(
                    makeSymbol( "RET" ), makeSymbol( "NEW-PROBLEM" ) ) ) );
    $sym214$SHOP_BASIC_PLANNER_THREAD_MAKE_PROBLEM_FROM_FORMULA_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-MAKE-PROBLEM-FROM-FORMULA-METHOD" );
    $sym215$FIND_PLANS = makeSymbol( "FIND-PLANS" );
    $list216 = ConsesLow.list( makeKeyword( "NO-MEMBER-VARIABLES" ), makeKeyword( "PUBLIC" ) );
    $list217 = ConsesLow.list( makeSymbol( "TASK-FORMULA" ), makeSymbol( "MT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "WHICH" ), makeKeyword( "ALL" ) ), ConsesLow.list( makeSymbol( "VERBOSITY" ),
        ZERO_INTEGER ), ConsesLow.list( makeSymbol( "NUMBER" ), NIL ), ConsesLow.list( makeSymbol( "TIME" ), NIL ), ConsesLow.list( makeSymbol( "DEPTH" ), NIL ) );
    $list218 = ConsesLow.list( makeString( "@param TASK-FORMULA el-formula-p\n   @param MT microtheory-p\n   FIND-PLANS starts the search for a plan for problem with name NEW-PROBLEM." ), ConsesLow.list(
        new SubLObject[]
        { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-PROBLEM" ), ConsesLow.list( makeSymbol( "MAKE-PROBLEM-FROM-FORMULA" ), makeSymbol( "SELF" ), makeSymbol( "TASK-FORMULA" ), makeSymbol(
            "MT" ) ) ), makeSymbol( "DOMAIN" ) ), ConsesLow.list( makeSymbol( "INIT-PLANNER-THREAD" ), makeSymbol( "SELF" ), makeSymbol( "NEW-PROBLEM" ), makeSymbol( "WHICH" ), makeSymbol( "VERBOSITY" ), makeSymbol(
                "NUMBER" ), makeSymbol( "TIME" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "*SHOP-GC*" ), ConsesLow.list( makeSymbol( "GC" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                    makeSymbol( "DOMAIN" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-NAME" ), makeSymbol( "SHOP-BASIC-DOMAIN" ) ), ConsesLow.list( makeSymbol( "GET-SLOT" ),
                        ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PROBLEM" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                            "DOMAIN" ) ) ) ) ), ConsesLow.list( makeSymbol( "WHEN-VERBOSE" ), ONE_INTEGER, ConsesLow.list( makeSymbol( "FORMAT" ), T, makeString( "Problem: ~s Domain: ~s Plans: ~s Verbosity: ~s~%" ),
                                makeSymbol( "NEW-PROBLEM" ), makeSymbol( "DOMAIN" ), makeSymbol( "WHICH" ), makeSymbol( "VERBOSITY" ) ) ), ConsesLow.list( makeSymbol( "PCASE" ), makeSymbol( "WHICH" ), ConsesLow.list(
                                    ConsesLow.list( makeKeyword( "ID-FIRST" ), makeKeyword( "ID-ALL" ) ), ConsesLow.list( makeSymbol( "SEEK-PLANS-WITH-ITERATIVE-DEEPENING" ), makeSymbol( "SELF" ) ) ), ConsesLow.list(
                                        ConsesLow.list( makeKeyword( "FIRST" ), makeKeyword( "ALL" ), makeKeyword( "SHALLOWEST" ), makeKeyword( "ALL-SHALLOWEST" ) ), ConsesLow.list( makeSymbol(
                                            "FUNCALL-INSTANCE-METHOD" ), ConsesLow.list( makeSymbol( "GET-SHOP-BASIC-PLANNER-THREAD-STATS-MANAGER" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                makeSymbol( "START-TIMING" ) ) ), ConsesLow.list( makeSymbol( "SEEK-PLANS" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), ConsesLow
                                                    .list( makeSymbol( "GET-SHOP-BASIC-PLANNER-THREAD-STATS-MANAGER" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "STOP-TIMING" ) ) ) ),
                                    ConsesLow.list( makeSymbol( "OTHERWISE" ), ConsesLow.list( makeSymbol( "CERROR" ), makeString( "invalid keyword ~S" ), makeSymbol( "WHICH" ) ) ) ), ConsesLow.list( makeSymbol(
                                        "WHEN-VERBOSE" ), ONE_INTEGER, ConsesLow.list( makeSymbol( "OUTPUT-MESSAGE" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeString( "Halted Because: " ),
                                            ConsesLow.list( makeSymbol( "WRITE-TO-STRING" ), ConsesLow.list( makeSymbol( "HALT-STATUS" ), makeSymbol( "SELF" ) ) ) ) ), ConsesLow.list( makeSymbol( "PRINT-STATS-HEADER" ),
                                                makeSymbol( "SELF" ), makeString( "Totals:" ) ), ConsesLow.list( makeSymbol( "PRINT-STATS" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
                                                    makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLANS-FOUND" ) ) ) )
        } ) );
    $sym219$DOMAIN = makeSymbol( "DOMAIN" );
    $str220$Problem___s_Domain___s_Plans___s_ = makeString( "Problem: ~s Domain: ~s Plans: ~s Verbosity: ~s~%" );
    $kw221$ID_FIRST = makeKeyword( "ID-FIRST" );
    $kw222$ID_ALL = makeKeyword( "ID-ALL" );
    $str223$Halted_Because__ = makeString( "Halted Because: " );
    $str224$Totals_ = makeString( "Totals:" );
    $sym225$SHOP_BASIC_PLANNER_THREAD_FIND_PLANS_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-FIND-PLANS-METHOD" );
    $sym226$COMPLETED_RUN_ = makeSymbol( "COMPLETED-RUN?" );
    $list227 = ConsesLow.list( makeString( "@return booleanp" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "OPEN-NODES" ) ) ) );
    $sym228$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD" );
    $sym229$SHOP_BASIC_PLANNER_THREAD_COMPLETED_RUN__METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-COMPLETED-RUN?-METHOD" );
    $sym230$SUMMARY = makeSymbol( "SUMMARY" );
    $list231 = ConsesLow.list( makeString( "This function returns a list of values that can be used to summarize\n   the results of the thread." ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
        makeSymbol( "TASK-LIST" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PROBLEM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-TASKS" ) ) ) ), ConsesLow.list( makeSymbol(
            "TASK" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "TASK-LIST" ) ) ), ConsesLow.list( makeSymbol( "COMPLETED-RUN?" ), ConsesLow.list( makeSymbol( "COMPLETED-RUN?" ), makeSymbol( "SELF" ) ) ),
        ConsesLow.list( makeSymbol( "PLAN-COUNT" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "PLANS-FOUND" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol(
            "TASK" ), makeSymbol( "COMPLETED-RUN?" ), makeSymbol( "PLAN-COUNT" ) ) ) ) );
    $sym232$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD" );
    $sym233$GET_TASKS = makeSymbol( "GET-TASKS" );
    $sym234$SHOP_BASIC_PLANNER_THREAD_SUMMARY_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-SUMMARY-METHOD" );
    $sym235$HTML_DISPLAY_SUMMARY = makeSymbol( "HTML-DISPLAY-SUMMARY" );
    $list236 = ConsesLow.list( makeSymbol( "PARAPHRASE-LINK" ) );
    $list237 = ConsesLow.list( makeString( "this function is used by the CycSecure AttackPlan History functionality.\n   displauys a short message about the thread and its resoultion." ), ConsesLow.list( makeSymbol(
        "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TASK-LIST" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PROBLEM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "GET-TASKS" ) ) ) ), ConsesLow.list( makeSymbol( "TASK" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "TASK-LIST" ) ) ) ), ConsesLow.list( makeSymbol( "HTML-FANCY-TABLE-DATA" ), ConsesLow.list(
                makeKeyword( "ALIGN" ), makeKeyword( "RIGHT" ) ), ConsesLow.list( makeSymbol( "HTML-TEXT-WITH-TARGET" ), makeSymbol( "TASK" ), makeSymbol( "PARAPHRASE-LINK" ) ) ), ConsesLow.list( makeSymbol(
                    "HTML-FANCY-TABLE-DATA" ), ConsesLow.list( makeKeyword( "ALIGN" ), makeKeyword( "RIGHT" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "COMPLETED-RUN?" ), makeSymbol(
                        "SELF" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PLAN-COUNT" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "PLANS-FOUND" ) ) ) ), ConsesLow
                            .list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ZEROP" ), makeSymbol( "PLAN-COUNT" ) ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString(
                                "No plans found" ) ) ), ConsesLow.list( ConsesLow.list( EQ, ONE_INTEGER, makeSymbol( "PLAN-COUNT" ) ), ConsesLow.list( makeSymbol( "HTML-FORMAT" ), makeString( "~A Plan found" ),
                                    makeSymbol( "PLAN-COUNT" ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "HTML-FORMAT" ), makeString( "~A Plans found" ), makeSymbol( "PLAN-COUNT" ) ) ) ) ), ConsesLow.list(
                                        makeSymbol( "HTML-PRINC" ), makeString( "Not Completed" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym238$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_THREAD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-THREAD-METHOD" );
    $str239$No_plans_found = makeString( "No plans found" );
    $str240$_A_Plan_found = makeString( "~A Plan found" );
    $str241$_A_Plans_found = makeString( "~A Plans found" );
    $str242$Not_Completed = makeString( "Not Completed" );
    $sym243$SHOP_BASIC_PLANNER_THREAD_HTML_DISPLAY_SUMMARY_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD-HTML-DISPLAY-SUMMARY-METHOD" );
    $list244 = ConsesLow.list( makeSymbol( "METHOD" ), makeSymbol( "CLASS" ), makeSymbol( "LIST" ) );
    $sym245$FWHEN = makeSymbol( "FWHEN" );
    $sym246$SUBLOOP_TYPE_P = makeSymbol( "SUBLOOP-TYPE-P" );
    $sym247$CLET = makeSymbol( "CLET" );
    $list248 = ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT-LIST" ), NIL ) );
    $sym249$CDOLIST = makeSymbol( "CDOLIST" );
    $sym250$CUR_ITEM = makeSymbol( "CUR-ITEM" );
    $sym251$CPUSH = makeSymbol( "CPUSH" );
    $sym252$INLINE_METHOD = makeSymbol( "INLINE-METHOD" );
    $list253 = ConsesLow.list( makeSymbol( "CUR-ITEM" ) );
    $list254 = ConsesLow.list( makeSymbol( "RESULT-LIST" ) );
    $list255 = ConsesLow.list( ConsesLow.list( makeSymbol( "REVERSE" ), makeSymbol( "RESULT-LIST" ) ) );
    $sym256$SHOP_REIFIABLE_NAT_ = makeSymbol( "SHOP-REIFIABLE-NAT?" );
    $sym257$FIND_WHEN_CLOSED_NAUT = makeSymbol( "FIND-WHEN-CLOSED-NAUT" );
    $sym258$SHOP_PLANNER_THREAD_P = makeSymbol( "SHOP-PLANNER-THREAD-P" );
    $kw259$THREAD_STRUCTURE = makeKeyword( "THREAD-STRUCTURE" );
  }
}
/*
 * 
 * Total time: 1398 ms
 * 
 */