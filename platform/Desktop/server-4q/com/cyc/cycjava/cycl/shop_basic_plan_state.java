package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class shop_basic_plan_state
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.shop_basic_plan_state";
  public static final String myFingerPrint = "f4d413e3f3336fef54edc570c25255e5fe8183ab6570cde2438e75469b98751f";
  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 13007L)
  private static SubLSymbol $shop_canonicalize_functionsP$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$CSETF;
  private static final SubLSymbol $sym2$APPEND;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$CLET;
  private static final SubLSymbol $sym5$ENTRY;
  private static final SubLSymbol $sym6$ASSOC;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$PWHEN;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$SHOP_PLAN_STATE;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$SHOP_BASIC_PLAN_STATE;
  private static final SubLSymbol $sym14$OBJECT;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$DYNAMIC_PREDICATES;
  private static final SubLSymbol $sym18$MODEL_MT;
  private static final SubLSymbol $sym19$DOMAIN;
  private static final SubLSymbol $sym20$LOG;
  private static final SubLSymbol $sym21$PLANNER;
  private static final SubLSymbol $sym22$INSTANCE_COUNT;
  private static final SubLSymbol $sym23$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_STATE_CLASS;
  private static final SubLSymbol $sym24$ISOLATED_P;
  private static final SubLSymbol $sym25$INSTANCE_NUMBER;
  private static final SubLSymbol $sym26$WORLD_STATE;
  private static final SubLSymbol $sym27$TASKLIST;
  private static final SubLSymbol $sym28$MBINDINGS;
  private static final SubLSymbol $sym29$TASK_STRUCS;
  private static final SubLSymbol $sym30$SUPPORTS;
  private static final SubLSymbol $sym31$PARTIAL_PLAN;
  private static final SubLSymbol $sym32$POST_ORDERING;
  private static final SubLSymbol $sym33$QUERY_PROPERTIES;
  private static final SubLSymbol $sym34$DEPTH;
  private static final SubLSymbol $sym35$PREVIOUS_STATES;
  private static final SubLSymbol $sym36$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_STATE_INSTANCE;
  private static final SubLSymbol $sym37$APPLICABLE_MULTIBINDING;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$SHOP_BASIC_PLAN_STATE_APPLICABLE_MULTIBINDING_METHOD;
  private static final SubLSymbol $sym42$SET_TASKLIST;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym46$LISTP;
  private static final SubLSymbol $sym47$SHOP_BASIC_PLAN_STATE_SET_TASKLIST_METHOD;
  private static final SubLSymbol $sym48$GET_TASKLIST;
  private static final SubLList $list49;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym52$SHOP_BASIC_PLAN_STATE_GET_TASKLIST_METHOD;
  private static final SubLSymbol $sym53$ADD_DECOMPOSITION;
  private static final SubLList $list54;
  private static final SubLList $list55;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $kw58$SUPERTASK;
  private static final SubLSymbol $sym59$SHOP_BASIC_PLAN_STATE_ADD_DECOMPOSITION_METHOD;
  private static final SubLSymbol $sym60$SET_MULTIBINDINGS;
  private static final SubLList $list61;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym64$SHOP_BASIC_PLAN_STATE_SET_MULTIBINDINGS_METHOD;
  private static final SubLSymbol $sym65$MULTIBINDINGS;
  private static final SubLList $list66;
  private static final SubLSymbol $sym67$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym68$SHOP_BASIC_PLAN_STATE_MULTIBINDINGS_METHOD;
  private static final SubLSymbol $sym69$SET_DOMAIN;
  private static final SubLList $list70;
  private static final SubLList $list71;
  private static final SubLSymbol $sym72$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym73$SHOP_BASIC_PLAN_STATE_SET_DOMAIN_METHOD;
  private static final SubLSymbol $sym74$GET_DOMAIN;
  private static final SubLList $list75;
  private static final SubLSymbol $sym76$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym77$SHOP_BASIC_PLAN_STATE_GET_DOMAIN_METHOD;
  private static final SubLSymbol $sym78$SUPPORT_LISTS;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym81$SHOP_BASIC_PLAN_STATE_SUPPORT_LISTS_METHOD;
  private static final SubLSymbol $sym82$ADD_TO_SUPPORT_LISTS;
  private static final SubLList $list83;
  private static final SubLList $list84;
  private static final SubLSymbol $sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym86$SHOP_BASIC_PLAN_STATE_ADD_TO_SUPPORT_LISTS_METHOD;
  private static final SubLSymbol $sym87$INITIALIZE;
  private static final SubLList $list88;
  private static final SubLSymbol $sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym90$SHOP_BASIC_PLAN_STATE_INITIALIZE_METHOD;
  private static final SubLSymbol $sym91$INITIALIZE_PLAN_STATE_WITH_PROBLEM;
  private static final SubLList $list92;
  private static final SubLList $list93;
  private static final SubLList $list94;
  private static final SubLSymbol $sym95$VAR_MANAGER;
  private static final SubLSymbol $sym96$TIME_CUTOFF;
  private static final SubLSymbol $sym97$NUM_BACKCHAINS;
  private static final SubLSymbol $sym98$SHOP_BASIC_PLAN_STATE_INITIALIZE_PLAN_STATE_WITH_PROBLEM_METHOD;
  private static final SubLSymbol $sym99$INITIALIZE_MULTIBINDINGS;
  private static final SubLList $list100;
  private static final SubLList $list101;
  private static final SubLString $str102$INITIALIZE_MULTIBINGINGS__Initial;
  private static final SubLSymbol $sym103$SHOP_BASIC_PLAN_STATE_INITIALIZE_MULTIBINDINGS_METHOD;
  private static final SubLSymbol $sym104$OUTPUT_MESSAGE;
  private static final SubLList $list105;
  private static final SubLList $list106;
  private static final SubLSymbol $sym107$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym108$SHOP_BASIC_PLAN_STATE_OUTPUT_MESSAGE_METHOD;
  private static final SubLSymbol $sym109$COPY;
  private static final SubLList $list110;
  private static final SubLSymbol $sym111$SHOP_BASIC_PLAN_STATE_COPY_METHOD;
  private static final SubLSymbol $sym112$CREATE_NEXT;
  private static final SubLList $list113;
  private static final SubLSymbol $sym114$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym115$SHOP_BASIC_PLAN_STATE_CREATE_NEXT_METHOD;
  private static final SubLSymbol $sym116$INIT_MODEL_WITH_PROBLEM;
  private static final SubLList $list117;
  private static final SubLList $list118;
  private static final SubLSymbol $sym119$TASK_MT;
  private static final SubLSymbol $sym120$SHOP_BASIC_PLAN_STATE_INIT_MODEL_WITH_PROBLEM_METHOD;
  private static final SubLSymbol $sym121$SET_WORLD_STATE;
  private static final SubLList $list122;
  private static final SubLList $list123;
  private static final SubLSymbol $sym124$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLString $str125$_SET_WORLD_STATE__s____S_is_not_a;
  private static final SubLSymbol $sym126$SHOP_BASIC_PLAN_STATE_SET_WORLD_STATE_METHOD;
  private static final SubLSymbol $sym127$GET_WORLD_STATE;
  private static final SubLList $list128;
  private static final SubLSymbol $sym129$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym130$SHOP_BASIC_PLAN_STATE_GET_WORLD_STATE_METHOD;
  private static final SubLSymbol $sym131$MBINDING;
  private static final SubLSymbol $sym132$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym133$SHOP_BASIC_PLAN_STATE_MBINDING_METHOD;
  private static final SubLSymbol $sym134$SET_DEPTH;
  private static final SubLList $list135;
  private static final SubLList $list136;
  private static final SubLSymbol $sym137$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym138$INTEGERP;
  private static final SubLSymbol $sym139$SHOP_BASIC_PLAN_STATE_SET_DEPTH_METHOD;
  private static final SubLList $list140;
  private static final SubLSymbol $sym141$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym142$SHOP_BASIC_PLAN_STATE_DEPTH_METHOD;
  private static final SubLSymbol $sym143$SET_PREVIOUS_STATES;
  private static final SubLList $list144;
  private static final SubLList $list145;
  private static final SubLSymbol $sym146$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym147$SHOP_BASIC_PLAN_STATE_SET_PREVIOUS_STATES_METHOD;
  private static final SubLSymbol $sym148$GET_PREVIOUS_STATES;
  private static final SubLList $list149;
  private static final SubLSymbol $sym150$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym151$SHOP_BASIC_PLAN_STATE_GET_PREVIOUS_STATES_METHOD;
  private static final SubLSymbol $sym152$ADD_TO_PREVIOUS_STATES;
  private static final SubLList $list153;
  private static final SubLList $list154;
  private static final SubLSymbol $sym155$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym156$SHOP_BASIC_PLAN_STATE_ADD_TO_PREVIOUS_STATES_METHOD;
  private static final SubLSymbol $sym157$SET_PARTIAL_PLAN;
  private static final SubLList $list158;
  private static final SubLList $list159;
  private static final SubLSymbol $sym160$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym161$SHOP_BASIC_PLAN_STATE_SET_PARTIAL_PLAN_METHOD;
  private static final SubLSymbol $sym162$GET_PARTIAL_PLAN;
  private static final SubLList $list163;
  private static final SubLSymbol $sym164$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym165$SHOP_BASIC_PLAN_STATE_GET_PARTIAL_PLAN_METHOD;
  private static final SubLSymbol $sym166$ADD_TO_PARTIAL_PLAN;
  private static final SubLList $list167;
  private static final SubLList $list168;
  private static final SubLSymbol $sym169$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym170$SHOP_BASIC_PLAN_STATE_ADD_TO_PARTIAL_PLAN_METHOD;
  private static final SubLSymbol $sym171$ADD_TO_POST_ORDERING;
  private static final SubLList $list172;
  private static final SubLSymbol $sym173$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym174$SHOP_BASIC_PLAN_STATE_ADD_TO_POST_ORDERING_METHOD;
  private static final SubLSymbol $sym175$ADD_TO_MBINDINGS;
  private static final SubLList $list176;
  private static final SubLList $list177;
  private static final SubLSymbol $sym178$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym179$SHOP_BASIC_PLAN_STATE_ADD_TO_MBINDINGS_METHOD;
  private static final SubLSymbol $sym180$PLANNER_RULES;
  private static final SubLList $list181;
  private static final SubLSymbol $sym182$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym183$SHOP_BASIC_PLAN_STATE_PLANNER_RULES_METHOD;
  private static final SubLSymbol $sym184$ADD_TO_TASK_STRUCS;
  private static final SubLList $list185;
  private static final SubLList $list186;
  private static final SubLSymbol $sym187$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym188$SHOP_BASIC_PLAN_STATE_ADD_TO_TASK_STRUCS_METHOD;
  private static final SubLSymbol $sym189$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym190$SHOP_BASIC_PLAN_STATE_TASK_STRUCS_METHOD;
  private static final SubLSymbol $sym191$GET_PLANNER;
  private static final SubLList $list192;
  private static final SubLSymbol $sym193$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym194$SHOP_BASIC_PLAN_STATE_GET_PLANNER_METHOD;
  private static final SubLSymbol $sym195$SET_PLANNER;
  private static final SubLList $list196;
  private static final SubLSymbol $sym197$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym198$SHOP_BASIC_PLAN_STATE_SET_PLANNER_METHOD;
  private static final SubLSymbol $sym199$GET_WHICH_PLANS;
  private static final SubLList $list200;
  private static final SubLSymbol $sym201$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLString $str202$_GET_WHICH_PLANS__S___No_planner_;
  private static final SubLSymbol $sym203$SHOP_BASIC_PLAN_STATE_GET_WHICH_PLANS_METHOD;
  private static final SubLSymbol $sym204$SIMPLE_SITUATION_PRED_;
  private static final SubLList $list205;
  private static final SubLList $list206;
  private static final SubLSymbol $sym207$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym208$SIMPLE_SITUATION_PREDS;
  private static final SubLObject $const209$SimpleSituationPredicate;
  private static final SubLSymbol $sym210$SHOP_BASIC_PLAN_STATE_SIMPLE_SITUATION_PRED__METHOD;
  private static final SubLSymbol $sym211$SEEK_TOTAL_MBINDINGS;
  private static final SubLList $list212;
  private static final SubLList $list213;
  private static final SubLSymbol $sym214$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLObject $const215$and;
  private static final SubLSymbol $sym216$STATS_MANAGER;
  private static final SubLSymbol $kw217$CYC_QUERY;
  private static final SubLSymbol $sym218$VERBOSE;
  private static final SubLSymbol $sym219$LOG_INFERENCE;
  private static final SubLList $list220;
  private static final SubLSymbol $sym221$SHOP_BASIC_PLAN_STATE_SEEK_TOTAL_MBINDINGS_METHOD;
  private static final SubLSymbol $sym222$FIND_MBINDINGS;
  private static final SubLList $list223;
  private static final SubLList $list224;
  private static final SubLSymbol $sym225$SHOP_BASIC_PLAN_STATE_FIND_MBINDINGS_METHOD;
  private static final SubLSymbol $sym226$SHOP_SAME_TASK_;
  private static final SubLSymbol $sym227$PARENT_TASK_;
  private static final SubLList $list228;
  private static final SubLSymbol $sym229$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym230$SHOP_BASIC_PLAN_STATE_PARENT_TASK__METHOD;
  private static final SubLSymbol $sym231$EXPAND;
  private static final SubLList $list232;
  private static final SubLSymbol $sym233$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $kw234$TASKS;
  private static final SubLSymbol $sym235$NEW_SECTION;
  private static final SubLSymbol $sym236$LOG_HEADING;
  private static final SubLString $str237$Search_Depth__s;
  private static final SubLString $str238$task__s;
  private static final SubLSymbol $kw239$ALL;
  private static final SubLSymbol $kw240$GOALS;
  private static final SubLSymbol $sym241$WARNING;
  private static final SubLString $str242$Prune____Method_Cycle_checking_de;
  private static final SubLSymbol $sym243$SHOP_BASIC_PLAN_STATE_EXPAND_METHOD;
  private static final SubLSymbol $sym244$EXPAND_COMPLEX;
  private static final SubLList $list245;
  private static final SubLList $list246;
  private static final SubLSymbol $sym247$SHOP_BASIC_PLAN_STATE_EXPAND_COMPLEX_METHOD;
  private static final SubLSymbol $sym248$EXPAND_PRIMITIVE_PRECONDITIONS;
  private static final SubLList $list249;
  private static final SubLSymbol $sym250$SHOP_BASIC_PLAN_STATE_EXPAND_PRIMITIVE_PRECONDITIONS_METHOD;
  private static final SubLSymbol $sym251$EXPAND_PRIMITIVE;
  private static final SubLList $list252;
  private static final SubLSymbol $sym253$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $kw254$OPERATORS;
  private static final SubLSymbol $sym255$LOG_NEWLINE;
  private static final SubLSymbol $sym256$LOG_ENTRY;
  private static final SubLString $str257$Finding_operators_for_task___;
  private static final SubLString $str258$No_operator_for_task;
  private static final SubLSymbol $sym259$CYCLE_CHECKING;
  private static final SubLSymbol $kw260$CUTOFFS;
  private static final SubLString $str261$Prune____World_State_Cycle_Checki;
  private static final SubLSymbol $sym262$SHOP_BASIC_PLAN_STATE_EXPAND_PRIMITIVE_METHOD;
  private static final SubLSymbol $sym263$APPLY_OPERATORS;
  private static final SubLList $list264;
  private static final SubLList $list265;
  private static final SubLSymbol $sym266$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym267$NEXT_STATE;
  private static final SubLSymbol $sym268$LOG_FANCY_ENTRY;
  private static final SubLString $str269$Trying___s__s__;
  private static final SubLList $list270;
  private static final SubLString $str271$Making_New_World_State;
  private static final SubLString $str272$Adds__;
  private static final SubLString $str273$Deletes__;
  private static final SubLString $str274$Warning__Add_Delete_race_conditio;
  private static final SubLSymbol $sym275$DELETE_LITERALS;
  private static final SubLSymbol $sym276$ADD_LITERALS;
  private static final SubLSymbol $sym277$SHOP_BASIC_PLAN_STATE_APPLY_OPERATORS_METHOD;
  private static final SubLSymbol $sym278$APPLY_OPERATOR;
  private static final SubLList $list279;
  private static final SubLList $list280;
  private static final SubLSymbol $sym281$SHOP_BASIC_PLAN_STATE_APPLY_OPERATOR_METHOD;
  private static final SubLSymbol $sym282$APPLY_CONDITIONAL_OPERATOR;
  private static final SubLList $list283;
  private static final SubLSymbol $sym284$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym285$LOG_PLANNER_RULE;
  private static final SubLString $str286$_apply_conditional_operator_shop_;
  private static final SubLSymbol $sym287$SHOP_BASIC_PLAN_STATE_APPLY_CONDITIONAL_OPERATOR_METHOD;
  private static final SubLSymbol $sym288$UNIFY_PLANNER_RULE;
  private static final SubLList $list289;
  private static final SubLList $list290;
  private static final SubLSymbol $sym291$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym292$UNIFY_TASK_TO_HEAD_WITH_DATA;
  private static final SubLSymbol $sym293$SHOP_VARIABLE_MANAGER;
  private static final SubLSymbol $sym294$ASSERTIONS;
  private static final SubLSymbol $kw295$FAIL;
  private static final SubLSymbol $sym296$SHOP_BASIC_PLAN_STATE_UNIFY_PLANNER_RULE_METHOD;
  private static final SubLSymbol $sym297$APPLY_ALL_METHODS;
  private static final SubLList $list298;
  private static final SubLSymbol $sym299$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $kw300$PLANNER_RULES;
  private static final SubLString $str301$Finding_methods_for_task___;
  private static final SubLString $str302$No_matching_methods_were_found_;
  private static final SubLSymbol $sym303$SHOP_BASIC_PLAN_STATE_APPLY_ALL_METHODS_METHOD;
  private static final SubLSymbol $sym304$APPLY_METHOD;
  private static final SubLList $list305;
  private static final SubLList $list306;
  private static final SubLSymbol $sym307$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $kw308$METHODS;
  private static final SubLList $list309;
  private static final SubLString $str310$Result__s;
  private static final SubLSymbol $sym311$LOG_PREFORMATTED;
  private static final SubLString $str312$Decomposition___;
  private static final SubLString $str313$___6__s__;
  private static final SubLSymbol $sym314$SHOP_BASIC_PLAN_STATE_APPLY_METHOD_METHOD;
  private static final SubLSymbol $sym315$APPLY_ALL_SUFFICIENT_CONDITIONS;
  private static final SubLList $list316;
  private static final SubLSymbol $sym317$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLString $str318$Finding_sufficient_condition_rule;
  private static final SubLList $list319;
  private static final SubLString $str320$No_matching_sufficient_conditions;
  private static final SubLSymbol $sym321$SHOP_BASIC_PLAN_STATE_APPLY_ALL_SUFFICIENT_CONDITIONS_METHOD;
  private static final SubLSymbol $sym322$APPLY_SUFFICIENT_CONDITION;
  private static final SubLList $list323;
  private static final SubLList $list324;
  private static final SubLSymbol $sym325$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLList $list326;
  private static final SubLSymbol $sym327$SHOP_BASIC_PLAN_STATE_APPLY_SUFFICIENT_CONDITION_METHOD;
  private static final SubLSymbol $sym328$APPLY_ALL_PRECONDITIONS;
  private static final SubLList $list329;
  private static final SubLSymbol $sym330$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLSymbol $sym331$SHOP_PRECONDITION_P;
  private static final SubLString $str332$Finding_precondition_rules_for_ta;
  private static final SubLString $str333$No_precondition_rules_found_;
  private static final SubLSymbol $sym334$SHOP_BASIC_PLAN_STATE_APPLY_ALL_PRECONDITIONS_METHOD;
  private static final SubLSymbol $sym335$APPLY_PRECONDITION;
  private static final SubLList $list336;
  private static final SubLList $list337;
  private static final SubLSymbol $sym338$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD;
  private static final SubLString $str339$No_bindings_found_;
  private static final SubLSymbol $sym340$SHOP_BASIC_PLAN_STATE_APPLY_PRECONDITION_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 911L)
  public static SubLObject cpushX(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject list1 = NIL;
    SubLObject list2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    list1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    list2 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$CSETF, list2, ConsesLow.list( $sym2$APPEND, list1, list2 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 998L)
  public static SubLObject when_verbose(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject required_verbose_level = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    required_verbose_level = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym4$CLET, reader.bq_cons( ConsesLow.list( $sym5$ENTRY, ConsesLow.listS( $sym6$ASSOC, required_verbose_level, $list7 ) ), $list8 ), ConsesLow.listS( $sym9$PWHEN, $list10, ConsesLow.append(
        body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1476L)
  public static SubLObject shop_plan_state_p(final SubLObject shop_plan_state)
  {
    return interfaces.subloop_instanceof_interface( shop_plan_state, $sym11$SHOP_PLAN_STATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject get_shop_basic_plan_state_dynamic_predicates(final SubLObject v_shop_basic_plan_state)
  {
    return classes.subloop_get_access_protected_instance_slot( v_shop_basic_plan_state, FIFTEEN_INTEGER, $sym17$DYNAMIC_PREDICATES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject set_shop_basic_plan_state_dynamic_predicates(final SubLObject v_shop_basic_plan_state, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_shop_basic_plan_state, value, FIFTEEN_INTEGER, $sym17$DYNAMIC_PREDICATES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject get_shop_basic_plan_state_model_mt(final SubLObject v_shop_basic_plan_state)
  {
    return classes.subloop_get_access_protected_instance_slot( v_shop_basic_plan_state, FOURTEEN_INTEGER, $sym18$MODEL_MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject set_shop_basic_plan_state_model_mt(final SubLObject v_shop_basic_plan_state, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_shop_basic_plan_state, value, FOURTEEN_INTEGER, $sym18$MODEL_MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject get_shop_basic_plan_state_domain(final SubLObject v_shop_basic_plan_state)
  {
    return classes.subloop_get_access_protected_instance_slot( v_shop_basic_plan_state, THIRTEEN_INTEGER, $sym19$DOMAIN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject set_shop_basic_plan_state_domain(final SubLObject v_shop_basic_plan_state, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_shop_basic_plan_state, value, THIRTEEN_INTEGER, $sym19$DOMAIN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject get_shop_basic_plan_state_log(final SubLObject v_shop_basic_plan_state)
  {
    return classes.subloop_get_access_protected_instance_slot( v_shop_basic_plan_state, TWELVE_INTEGER, $sym20$LOG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject set_shop_basic_plan_state_log(final SubLObject v_shop_basic_plan_state, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_shop_basic_plan_state, value, TWELVE_INTEGER, $sym20$LOG );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject get_shop_basic_plan_state_planner(final SubLObject v_shop_basic_plan_state)
  {
    return classes.subloop_get_access_protected_instance_slot( v_shop_basic_plan_state, ELEVEN_INTEGER, $sym21$PLANNER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject set_shop_basic_plan_state_planner(final SubLObject v_shop_basic_plan_state, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_shop_basic_plan_state, value, ELEVEN_INTEGER, $sym21$PLANNER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject get_shop_basic_plan_state_previous_states(final SubLObject v_shop_basic_plan_state)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_plan_state, TEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject set_shop_basic_plan_state_previous_states(final SubLObject v_shop_basic_plan_state, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_plan_state, value, TEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject get_shop_basic_plan_state_depth(final SubLObject v_shop_basic_plan_state)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_plan_state, NINE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject set_shop_basic_plan_state_depth(final SubLObject v_shop_basic_plan_state, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_plan_state, value, NINE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject get_shop_basic_plan_state_query_properties(final SubLObject v_shop_basic_plan_state)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_plan_state, EIGHT_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject set_shop_basic_plan_state_query_properties(final SubLObject v_shop_basic_plan_state, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_plan_state, value, EIGHT_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject get_shop_basic_plan_state_post_ordering(final SubLObject v_shop_basic_plan_state)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_plan_state, SEVEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject set_shop_basic_plan_state_post_ordering(final SubLObject v_shop_basic_plan_state, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_plan_state, value, SEVEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject get_shop_basic_plan_state_partial_plan(final SubLObject v_shop_basic_plan_state)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_plan_state, SIX_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject set_shop_basic_plan_state_partial_plan(final SubLObject v_shop_basic_plan_state, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_plan_state, value, SIX_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject get_shop_basic_plan_state_supports(final SubLObject v_shop_basic_plan_state)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_plan_state, FIVE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject set_shop_basic_plan_state_supports(final SubLObject v_shop_basic_plan_state, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_plan_state, value, FIVE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject get_shop_basic_plan_state_task_strucs(final SubLObject v_shop_basic_plan_state)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_plan_state, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject set_shop_basic_plan_state_task_strucs(final SubLObject v_shop_basic_plan_state, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_plan_state, value, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject get_shop_basic_plan_state_mbindings(final SubLObject v_shop_basic_plan_state)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_plan_state, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject set_shop_basic_plan_state_mbindings(final SubLObject v_shop_basic_plan_state, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_plan_state, value, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject get_shop_basic_plan_state_tasklist(final SubLObject v_shop_basic_plan_state)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_plan_state, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject set_shop_basic_plan_state_tasklist(final SubLObject v_shop_basic_plan_state, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_plan_state, value, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject get_shop_basic_plan_state_world_state(final SubLObject v_shop_basic_plan_state)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_plan_state, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject set_shop_basic_plan_state_world_state(final SubLObject v_shop_basic_plan_state, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_plan_state, value, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject subloop_reserved_initialize_shop_basic_plan_state_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym14$OBJECT, $sym22$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject subloop_reserved_initialize_shop_basic_plan_state_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym14$OBJECT, $sym24$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym14$OBJECT, $sym25$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym13$SHOP_BASIC_PLAN_STATE, $sym26$WORLD_STATE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym13$SHOP_BASIC_PLAN_STATE, $sym27$TASKLIST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym13$SHOP_BASIC_PLAN_STATE, $sym28$MBINDINGS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym13$SHOP_BASIC_PLAN_STATE, $sym29$TASK_STRUCS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym13$SHOP_BASIC_PLAN_STATE, $sym30$SUPPORTS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym13$SHOP_BASIC_PLAN_STATE, $sym31$PARTIAL_PLAN, NIL );
    classes.subloop_initialize_slot( new_instance, $sym13$SHOP_BASIC_PLAN_STATE, $sym32$POST_ORDERING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym13$SHOP_BASIC_PLAN_STATE, $sym33$QUERY_PROPERTIES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym13$SHOP_BASIC_PLAN_STATE, $sym34$DEPTH, NIL );
    classes.subloop_initialize_slot( new_instance, $sym13$SHOP_BASIC_PLAN_STATE, $sym35$PREVIOUS_STATES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym13$SHOP_BASIC_PLAN_STATE, $sym21$PLANNER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym13$SHOP_BASIC_PLAN_STATE, $sym20$LOG, NIL );
    classes.subloop_initialize_slot( new_instance, $sym13$SHOP_BASIC_PLAN_STATE, $sym19$DOMAIN, NIL );
    classes.subloop_initialize_slot( new_instance, $sym13$SHOP_BASIC_PLAN_STATE, $sym18$MODEL_MT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym13$SHOP_BASIC_PLAN_STATE, $sym17$DYNAMIC_PREDICATES, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
  public static SubLObject shop_basic_plan_state_p(final SubLObject v_shop_basic_plan_state)
  {
    return classes.subloop_instanceof_class( v_shop_basic_plan_state, $sym13$SHOP_BASIC_PLAN_STATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 5284L)
  public static SubLObject shop_basic_plan_state_applicable_multibinding_method(final SubLObject self, final SubLObject mbind)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != shop_parameters.$shop_use_multibindingsP$.getDynamicValue( thread ) )
    {
      return conses_high.copy_list( multibindings.mb_simple_binding( mbind ) );
    }
    return mbind;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 5640L)
  public static SubLObject shop_basic_plan_state_set_tasklist_method(final SubLObject self, final SubLObject tasks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    SubLObject tasklist = get_shop_basic_plan_state_tasklist( self );
    try
    {
      thread.throwStack.push( $sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        assert NIL != Types.listp( tasks ) : tasks;
        tasklist = tasks;
        Dynamic.sublisp_throw( $sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, tasks );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_tasklist( self, tasklist );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 5799L)
  public static SubLObject shop_basic_plan_state_get_tasklist_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject tasklist = get_shop_basic_plan_state_tasklist( self );
    try
    {
      thread.throwStack.push( $sym51$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym51$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, tasklist );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_tasklist( self, tasklist );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym51$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 5887L)
  public static SubLObject shop_basic_plan_state_add_decomposition_method(final SubLObject self, final SubLObject task, final SubLObject decomposition)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    SubLObject tasklist = get_shop_basic_plan_state_tasklist( self );
    try
    {
      thread.throwStack.push( $sym57$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        tasklist = ConsesLow.append( decomposition, ConsesLow.list( ConsesLow.list( $kw58$SUPERTASK, task ) ), tasklist );
        Dynamic.sublisp_throw( $sym57$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, tasklist );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_tasklist( self, tasklist );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym57$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 6338L)
  public static SubLObject shop_basic_plan_state_set_multibindings_method(final SubLObject self, final SubLObject mbinding)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    SubLObject mbindings = get_shop_basic_plan_state_mbindings( self );
    try
    {
      thread.throwStack.push( $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        mbindings = mbinding;
        Dynamic.sublisp_throw( $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, mbindings );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_mbindings( self, mbindings );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 6487L)
  public static SubLObject shop_basic_plan_state_multibindings_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject mbindings = get_shop_basic_plan_state_mbindings( self );
    try
    {
      thread.throwStack.push( $sym67$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym67$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, mbindings );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_mbindings( self, mbindings );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym67$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 6577L)
  public static SubLObject shop_basic_plan_state_set_domain_method(final SubLObject self, final SubLObject new_domain)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    SubLObject domain = get_shop_basic_plan_state_domain( self );
    try
    {
      thread.throwStack.push( $sym72$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        domain = new_domain;
        Dynamic.sublisp_throw( $sym72$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, domain );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_domain( self, domain );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym72$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 6713L)
  public static SubLObject shop_basic_plan_state_get_domain_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject domain = get_shop_basic_plan_state_domain( self );
    try
    {
      thread.throwStack.push( $sym76$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym76$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, domain );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_domain( self, domain );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym76$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 6797L)
  public static SubLObject shop_basic_plan_state_support_lists_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject supports = get_shop_basic_plan_state_supports( self );
    try
    {
      thread.throwStack.push( $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, supports );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_supports( self, supports );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 6904L)
  public static SubLObject shop_basic_plan_state_add_to_support_lists_method(final SubLObject self, final SubLObject precond)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    SubLObject supports = get_shop_basic_plan_state_supports( self );
    try
    {
      thread.throwStack.push( $sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        supports = ConsesLow.cons( precond, supports );
        Dynamic.sublisp_throw( $sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, supports );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_supports( self, supports );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 7034L)
  public static SubLObject shop_basic_plan_state_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    SubLObject depth = get_shop_basic_plan_state_depth( self );
    SubLObject post_ordering = get_shop_basic_plan_state_post_ordering( self );
    SubLObject supports = get_shop_basic_plan_state_supports( self );
    SubLObject task_strucs = get_shop_basic_plan_state_task_strucs( self );
    SubLObject mbindings = get_shop_basic_plan_state_mbindings( self );
    try
    {
      thread.throwStack.push( $sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        object.object_initialize_method( self );
        supports = NIL;
        mbindings = NIL;
        post_ordering = NIL;
        task_strucs = NIL;
        depth = ZERO_INTEGER;
        Dynamic.sublisp_throw( $sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_depth( self, depth );
          set_shop_basic_plan_state_post_ordering( self, post_ordering );
          set_shop_basic_plan_state_supports( self, supports );
          set_shop_basic_plan_state_task_strucs( self, task_strucs );
          set_shop_basic_plan_state_mbindings( self, mbindings );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 7275L)
  public static SubLObject shop_basic_plan_state_initialize_plan_state_with_problem_method(final SubLObject self, final SubLObject problem, final SubLObject planner_thread)
  {
    SubLObject new_tasks = shop_datastructures.shop_basic_problem_get_tasks_method( problem );
    final SubLObject new_world_state = shop_datastructures.shop_basic_problem_get_state_method( problem );
    new_tasks = shop_internals.shop_variable_manager_replace_variables_method( instances.get_slot( planner_thread, $sym95$VAR_MANAGER ), new_tasks, multibindings.empty_mb() );
    shop_basic_plan_state_set_domain_method( self, instances.get_slot( problem, $sym19$DOMAIN ) );
    shop_basic_plan_state_set_tasklist_method( self, new_tasks );
    shop_basic_plan_state_set_world_state_method( self, new_world_state );
    instances.set_slot( self, $sym20$LOG, instances.get_slot( planner_thread, $sym20$LOG ) );
    shop_basic_plan_state_set_planner_method( self, planner_thread );
    shop_basic_plan_state_init_model_with_problem_method( self, problem );
    shop_basic_plan_state_initialize_multibindings_method( self );
    instances.set_slot( self, $sym33$QUERY_PROPERTIES, shop_inference.shop_query_properties( instances.get_slot( instances.get_slot( self, $sym21$PLANNER ), $sym96$TIME_CUTOFF ), instances.get_slot( instances.get_slot(
        self, $sym21$PLANNER ), $sym97$NUM_BACKCHAINS ) ) );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 8385L)
  public static SubLObject shop_basic_plan_state_initialize_multibindings_method(final SubLObject self)
  {
    final SubLObject tasklist = shop_basic_plan_state_get_tasklist_method( self );
    SubLObject mbinding = NIL;
    final SubLObject mt = instances.get_slot( self, $sym18$MODEL_MT );
    if( NIL != el_utilities.groundP( tasklist, UNPROVIDED ) )
    {
      mbinding = multibindings.empty_mb();
    }
    else if( NIL != list_utilities.singletonP( tasklist ) )
    {
      mbinding = shop_internals.shop_initial_multibinding_for_task( tasklist.first(), mt );
    }
    else
    {
      Errors.warn( $str102$INITIALIZE_MULTIBINGINGS__Initial );
    }
    shop_basic_plan_state_set_multibindings_method( self, mbinding );
    return mbinding;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 8892L)
  public static SubLObject shop_basic_plan_state_output_message_method(final SubLObject self, final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject log = get_shop_basic_plan_state_log( self );
    try
    {
      thread.throwStack.push( $sym107$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym107$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, shop_log.shop_log_log_entry_method( log, string ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_log( self, log );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym107$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 9047L)
  public static SubLObject shop_basic_plan_state_copy_method(final SubLObject self)
  {
    final SubLObject new_plan_state = object.object_new_method( $sym13$SHOP_BASIC_PLAN_STATE );
    final SubLObject object_slots = classes.classes_all_slots( $sym14$OBJECT, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject slot_list = cdolist_list_var = conses_high.set_difference( classes.classes_all_slots( subloop_structures.instance_class( self ), UNPROVIDED ), object_slots, UNPROVIDED, UNPROVIDED );
    SubLObject cur_slot = NIL;
    cur_slot = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      instances.set_slot( new_plan_state, cur_slot, instances.get_slot( self, cur_slot ) );
      cdolist_list_var = cdolist_list_var.rest();
      cur_slot = cdolist_list_var.first();
    }
    return new_plan_state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 9596L)
  public static SubLObject shop_basic_plan_state_create_next_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject depth = get_shop_basic_plan_state_depth( self );
    final SubLObject tasklist = get_shop_basic_plan_state_tasklist( self );
    try
    {
      thread.throwStack.push( $sym114$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        final SubLObject new_state = shop_basic_plan_state_copy_method( self );
        shop_basic_plan_state_set_tasklist_method( new_state, tasklist.rest() );
        shop_basic_plan_state_set_depth_method( new_state, number_utilities.f_1X( depth ) );
        Dynamic.sublisp_throw( $sym114$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, new_state );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_depth( self, depth );
          set_shop_basic_plan_state_tasklist( self, tasklist );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym114$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 9905L)
  public static SubLObject shop_basic_plan_state_init_model_with_problem_method(final SubLObject self, final SubLObject problem)
  {
    final SubLObject task_mt = instances.get_slot( problem, $sym119$TASK_MT );
    instances.set_slot( self, $sym18$MODEL_MT, task_mt );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 10173L)
  public static SubLObject shop_basic_plan_state_set_world_state_method(final SubLObject self, final SubLObject s)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    SubLObject world_state = get_shop_basic_plan_state_world_state( self );
    try
    {
      thread.throwStack.push( $sym124$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == shop_basic_world_state.shop_world_state_p( s ) )
        {
          Errors.error( $str125$_SET_WORLD_STATE__s____S_is_not_a, self, s );
        }
        world_state = s;
        Dynamic.sublisp_throw( $sym124$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, s );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_world_state( self, world_state );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym124$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 10408L)
  public static SubLObject shop_basic_plan_state_get_world_state_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject world_state = get_shop_basic_plan_state_world_state( self );
    try
    {
      thread.throwStack.push( $sym129$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym129$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, world_state );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_world_state( self, world_state );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym129$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 10502L)
  public static SubLObject shop_basic_plan_state_mbinding_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject mbindings = get_shop_basic_plan_state_mbindings( self );
    try
    {
      thread.throwStack.push( $sym132$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym132$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, mbindings );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_mbindings( self, mbindings );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym132$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 10601L)
  public static SubLObject shop_basic_plan_state_set_depth_method(final SubLObject self, final SubLObject d)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    SubLObject depth = get_shop_basic_plan_state_depth( self );
    try
    {
      thread.throwStack.push( $sym137$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        assert NIL != Types.integerp( d ) : d;
        depth = d;
        Dynamic.sublisp_throw( $sym137$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, d );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_depth( self, depth );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym137$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 10737L)
  public static SubLObject shop_basic_plan_state_depth_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject depth = get_shop_basic_plan_state_depth( self );
    try
    {
      thread.throwStack.push( $sym141$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym141$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, depth );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_depth( self, depth );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym141$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 10815L)
  public static SubLObject shop_basic_plan_state_set_previous_states_method(final SubLObject self, final SubLObject states)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    SubLObject previous_states = get_shop_basic_plan_state_previous_states( self );
    try
    {
      thread.throwStack.push( $sym146$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        previous_states = states;
        Dynamic.sublisp_throw( $sym146$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, states );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_previous_states( self, previous_states );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym146$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 10970L)
  public static SubLObject shop_basic_plan_state_get_previous_states_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject previous_states = get_shop_basic_plan_state_previous_states( self );
    try
    {
      thread.throwStack.push( $sym150$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym150$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, previous_states );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_previous_states( self, previous_states );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym150$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 11072L)
  public static SubLObject shop_basic_plan_state_add_to_previous_states_method(final SubLObject self, final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    SubLObject previous_states = get_shop_basic_plan_state_previous_states( self );
    try
    {
      thread.throwStack.push( $sym155$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        previous_states = ConsesLow.cons( state, previous_states );
        Dynamic.sublisp_throw( $sym155$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, previous_states );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_previous_states( self, previous_states );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym155$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 11217L)
  public static SubLObject shop_basic_plan_state_set_partial_plan_method(final SubLObject self, final SubLObject p)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    SubLObject partial_plan = get_shop_basic_plan_state_partial_plan( self );
    try
    {
      thread.throwStack.push( $sym160$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        partial_plan = p;
        Dynamic.sublisp_throw( $sym160$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, p );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_partial_plan( self, partial_plan );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym160$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 11348L)
  public static SubLObject shop_basic_plan_state_get_partial_plan_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject partial_plan = get_shop_basic_plan_state_partial_plan( self );
    try
    {
      thread.throwStack.push( $sym164$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym164$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, partial_plan );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_partial_plan( self, partial_plan );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym164$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 11444L)
  public static SubLObject shop_basic_plan_state_add_to_partial_plan_method(final SubLObject self, final SubLObject task)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    SubLObject partial_plan = get_shop_basic_plan_state_partial_plan( self );
    try
    {
      thread.throwStack.push( $sym169$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        partial_plan = ConsesLow.cons( task, partial_plan );
        Dynamic.sublisp_throw( $sym169$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, partial_plan );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_partial_plan( self, partial_plan );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym169$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 11578L)
  public static SubLObject shop_basic_plan_state_add_to_post_ordering_method(final SubLObject self, final SubLObject task)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    SubLObject post_ordering = get_shop_basic_plan_state_post_ordering( self );
    try
    {
      thread.throwStack.push( $sym173$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        post_ordering = ConsesLow.cons( task, post_ordering );
        Dynamic.sublisp_throw( $sym173$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, post_ordering );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_post_ordering( self, post_ordering );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym173$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 11730L)
  public static SubLObject shop_basic_plan_state_add_to_mbindings_method(final SubLObject self, final SubLObject binding)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    SubLObject mbindings = get_shop_basic_plan_state_mbindings( self );
    try
    {
      thread.throwStack.push( $sym178$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        mbindings = multibindings.compose_multibindings( binding, mbindings );
        Dynamic.sublisp_throw( $sym178$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, mbindings );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_mbindings( self, mbindings );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym178$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 11904L)
  public static SubLObject shop_basic_plan_state_planner_rules_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject task_strucs = get_shop_basic_plan_state_task_strucs( self );
    try
    {
      thread.throwStack.push( $sym182$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym182$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, task_strucs );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_task_strucs( self, task_strucs );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym182$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 12014L)
  public static SubLObject shop_basic_plan_state_add_to_task_strucs_method(final SubLObject self, final SubLObject task_struc)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    SubLObject task_strucs = get_shop_basic_plan_state_task_strucs( self );
    try
    {
      thread.throwStack.push( $sym187$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        task_strucs = ConsesLow.cons( task_struc, task_strucs );
        Dynamic.sublisp_throw( $sym187$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, task_strucs );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_task_strucs( self, task_strucs );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym187$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 12155L)
  public static SubLObject shop_basic_plan_state_task_strucs_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject task_strucs = get_shop_basic_plan_state_task_strucs( self );
    try
    {
      thread.throwStack.push( $sym189$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym189$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, task_strucs );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_task_strucs( self, task_strucs );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym189$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 12245L)
  public static SubLObject shop_basic_plan_state_get_planner_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject planner = get_shop_basic_plan_state_planner( self );
    try
    {
      thread.throwStack.push( $sym193$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym193$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, planner );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_planner( self, planner );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym193$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 12342L)
  public static SubLObject shop_basic_plan_state_set_planner_method(final SubLObject self, final SubLObject p)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    SubLObject planner = get_shop_basic_plan_state_planner( self );
    try
    {
      thread.throwStack.push( $sym197$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        planner = p;
        Dynamic.sublisp_throw( $sym197$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, p );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_planner( self, planner );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym197$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 12443L)
  public static SubLObject shop_basic_plan_state_get_which_plans_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject planner = get_shop_basic_plan_state_planner( self );
    try
    {
      thread.throwStack.push( $sym201$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == planner )
        {
          Errors.error( $str202$_GET_WHICH_PLANS__S___No_planner_, self );
        }
        Dynamic.sublisp_throw( $sym201$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, shop_basic_planner_thread.shop_basic_planner_thread_get_which_plans_method( planner ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_planner( self, planner );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym201$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 12684L)
  public static SubLObject shop_basic_plan_state_simple_situation_predP_method(final SubLObject self, final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject model_mt = get_shop_basic_plan_state_model_mt( self );
    final SubLObject domain = get_shop_basic_plan_state_domain( self );
    try
    {
      thread.throwStack.push( $sym207$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        final SubLObject pred_set = instances.get_slot( domain, $sym208$SIMPLE_SITUATION_PREDS );
        if( NIL != set.set_memberP( pred, pred_set ) )
        {
          Dynamic.sublisp_throw( $sym207$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, T );
        }
        if( NIL != isa.isaP( pred, $const209$SimpleSituationPredicate, model_mt, UNPROVIDED ) )
        {
          set.set_add( pred, pred_set );
          Dynamic.sublisp_throw( $sym207$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, T );
        }
        Dynamic.sublisp_throw( $sym207$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_model_mt( self, model_mt );
          set_shop_basic_plan_state_domain( self, domain );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym207$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 13064L)
  public static SubLObject shop_basic_plan_state_seek_total_mbindings_method(final SubLObject self, final SubLObject goals, final SubLObject mbind)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject model_mt = get_shop_basic_plan_state_model_mt( self );
    final SubLObject log = get_shop_basic_plan_state_log( self );
    final SubLObject planner = get_shop_basic_plan_state_planner( self );
    final SubLObject query_properties = get_shop_basic_plan_state_query_properties( self );
    final SubLObject mbindings = get_shop_basic_plan_state_mbindings( self );
    final SubLObject world_state = get_shop_basic_plan_state_world_state( self );
    try
    {
      thread.throwStack.push( $sym214$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        if( NIL == goals )
        {
          Dynamic.sublisp_throw( $sym214$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, ConsesLow.list( mbind ) );
        }
        final SubLObject backchain = instances.get_slot( planner, $sym97$NUM_BACKCHAINS );
        SubLObject v_bindings = NIL;
        SubLObject mbindings_$1 = NIL;
        SubLObject halt_reason = NIL;
        SubLObject inference = NIL;
        SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
        final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding( thread );
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
        final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
        final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding( thread );
        final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding( thread );
        final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
        final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
        final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding( thread );
        final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
        final SubLObject _prev_bind_12 = api_control_vars.$generate_readable_fi_results$.currentBinding( thread );
        final SubLObject _prev_bind_13 = wff_utilities.$check_arityP$.currentBinding( thread );
        final SubLObject _prev_bind_14 = wff_utilities.$check_wff_constantsP$.currentBinding( thread );
        final SubLObject _prev_bind_15 = czer_vars.$simplify_sentenceP$.currentBinding( thread );
        final SubLObject _prev_bind_16 = czer_vars.$turn_existentials_into_skolemsP$.currentBinding( thread );
        final SubLObject _prev_bind_17 = czer_vars.$canonicalize_literalsP$.currentBinding( thread );
        final SubLObject _prev_bind_18 = czer_vars.$canonicalize_functionsP$.currentBinding( thread );
        try
        {
          control_vars.$within_assert$.bind( NIL, thread );
          wff_utilities.$check_arg_typesP$.bind( NIL, thread );
          at_vars.$at_check_arg_typesP$.bind( NIL, thread );
          wff_utilities.$check_wff_semanticsP$.bind( NIL, thread );
          wff_utilities.$check_wff_coherenceP$.bind( NIL, thread );
          wff_utilities.$check_var_typesP$.bind( NIL, thread );
          czer_vars.$simplify_literalP$.bind( NIL, thread );
          at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
          at_vars.$at_check_arg_formatP$.bind( NIL, thread );
          wff_vars.$validate_constantsP$.bind( NIL, thread );
          system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
          api_control_vars.$generate_readable_fi_results$.bind( NIL, thread );
          wff_utilities.$check_arityP$.bind( T, thread );
          wff_utilities.$check_wff_constantsP$.bind( NIL, thread );
          czer_vars.$simplify_sentenceP$.bind( NIL, thread );
          czer_vars.$turn_existentials_into_skolemsP$.bind( NIL, thread );
          czer_vars.$canonicalize_literalsP$.bind( NIL, thread );
          czer_vars.$canonicalize_functionsP$.bind( $shop_canonicalize_functionsP$.getDynamicValue( thread ), thread );
          if( NIL != shop_parameters.$shop_use_mt_world_statesP$.getDynamicValue( thread ) )
          {
            v_bindings = shop_mt_world_state.shop_mt_world_state_ask_method( world_state, ConsesLow.cons( $const215$and, goals ), mbind, backchain );
          }
          else
          {
            final SubLObject _prev_bind_0_$2 = shop_parameters.$shop_ask_plan_state$.currentBinding( thread );
            final SubLObject _prev_bind_1_$3 = shop_parameters.$shop_ask_multibinding$.currentBinding( thread );
            try
            {
              shop_parameters.$shop_ask_plan_state$.bind( get_shop_basic_plan_state_world_state( self ), thread );
              shop_parameters.$shop_ask_multibinding$.bind( get_shop_basic_plan_state_mbindings( self ), thread );
              if( NIL != shop_parameters.$shop_use_shop_askP$.getDynamicValue( thread ) )
              {
                thread.resetMultipleValues();
                final SubLObject v_bindings_$4 = shop_inference.shop_ask_int( ConsesLow.cons( $const215$and, goals ), model_mt, query_properties );
                final SubLObject halt_reason_$5 = thread.secondMultipleValue();
                final SubLObject inference_$6 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                v_bindings = v_bindings_$4;
                halt_reason = halt_reason_$5;
                inference = inference_$6;
              }
              else
              {
                thread.resetMultipleValues();
                final SubLObject v_bindings_$5 = inference_kernel.new_cyc_query( ConsesLow.cons( $const215$and, goals ), model_mt, query_properties );
                final SubLObject halt_reason_$6 = thread.secondMultipleValue();
                final SubLObject inference_$7 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                v_bindings = v_bindings_$5;
                halt_reason = halt_reason_$6;
                inference = inference_$7;
              }
            }
            finally
            {
              shop_parameters.$shop_ask_multibinding$.rebind( _prev_bind_1_$3, thread );
              shop_parameters.$shop_ask_plan_state$.rebind( _prev_bind_0_$2, thread );
            }
            v_bindings = shop_basic_world_state.confirm_bindings_against_world_state( world_state, goals, v_bindings );
          }
        }
        finally
        {
          czer_vars.$canonicalize_functionsP$.rebind( _prev_bind_18, thread );
          czer_vars.$canonicalize_literalsP$.rebind( _prev_bind_17, thread );
          czer_vars.$turn_existentials_into_skolemsP$.rebind( _prev_bind_16, thread );
          czer_vars.$simplify_sentenceP$.rebind( _prev_bind_15, thread );
          wff_utilities.$check_wff_constantsP$.rebind( _prev_bind_14, thread );
          wff_utilities.$check_arityP$.rebind( _prev_bind_13, thread );
          api_control_vars.$generate_readable_fi_results$.rebind( _prev_bind_12, thread );
          system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_11, thread );
          wff_vars.$validate_constantsP$.rebind( _prev_bind_10, thread );
          at_vars.$at_check_arg_formatP$.rebind( _prev_bind_9, thread );
          at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_8, thread );
          czer_vars.$simplify_literalP$.rebind( _prev_bind_7, thread );
          wff_utilities.$check_var_typesP$.rebind( _prev_bind_6, thread );
          wff_utilities.$check_wff_coherenceP$.rebind( _prev_bind_5, thread );
          wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_4, thread );
          at_vars.$at_check_arg_typesP$.rebind( _prev_bind_3, thread );
          wff_utilities.$check_arg_typesP$.rebind( _prev_bind_2, thread );
          control_vars.$within_assert$.rebind( _prev_bind_0, thread );
        }
        shop_internals.shop_statistic_manager_add_inference_method( instances.get_slot( planner, $sym216$STATS_MANAGER ) );
        final SubLObject entry = conses_high.assoc( $kw217$CYC_QUERY, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
        final SubLObject verbose_msg_level = ( NIL != entry ) ? entry.rest() : ZERO_INTEGER;
        final SubLObject verbose_thread_level = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
        if( verbose_thread_level.numGE( verbose_msg_level ) )
        {
          methods.funcall_instance_method_with_3_args( log, $sym219$LOG_INFERENCE, v_bindings, halt_reason, inference );
        }
        if( NIL == shop_parameters.$shop_use_inference_supportsP$.getDynamicValue( thread ) )
        {
          v_bindings = conses_high.pairlis( v_bindings, ConsesLow.make_list( Sequences.length( v_bindings ), ConsesLow.list( NIL ) ), UNPROVIDED );
        }
        if( NIL != v_bindings )
        {
          if( conses_high.caar( v_bindings ).equal( $list220 ) )
          {
            mbindings_$1 = ConsesLow.list( mbind );
          }
          else
          {
            _prev_bind_0 = multibindings.$mb_reify_natsP$.currentBinding( thread );
            try
            {
              multibindings.$mb_reify_natsP$.bind( NIL, thread );
              mbindings_$1 = multibindings.convert_binding_lists_and_supports_to_mbinds( v_bindings, mbind, UNPROVIDED );
            }
            finally
            {
              multibindings.$mb_reify_natsP$.rebind( _prev_bind_0, thread );
            }
          }
        }
        if( NIL != multibindings.multibinding_failedP( mbindings_$1 ) )
        {
          Dynamic.sublisp_throw( $sym214$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, NIL );
        }
        else
        {
          Dynamic.sublisp_throw( $sym214$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, mbindings_$1 );
        }
      }
      finally
      {
        final SubLObject _prev_bind_19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_model_mt( self, model_mt );
          set_shop_basic_plan_state_log( self, log );
          set_shop_basic_plan_state_planner( self, planner );
          set_shop_basic_plan_state_query_properties( self, query_properties );
          set_shop_basic_plan_state_mbindings( self, mbindings );
          set_shop_basic_plan_state_world_state( self, world_state );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_19, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym214$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 15401L)
  public static SubLObject shop_basic_plan_state_find_mbindings_method(final SubLObject self, final SubLObject goals, final SubLObject mbinding)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != shop_parameters.$shop_infer_complete_preconditionsP$.getDynamicValue( thread ) )
    {
      return shop_basic_plan_state_seek_total_mbindings_method( self, goals, multibindings.copy_multibinding( mbinding ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 15793L)
  public static SubLObject shop_same_taskP(final SubLObject task1, final SubLObject task2)
  {
    if( task1.equal( task2 ) )
    {
      return T;
    }
    final SubLObject mgu = shop_datastructures.shop_unify( task1, task2 );
    if( NIL == shop_datastructures.shop_unify_failedP( mgu ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 16121L)
  public static SubLObject shop_find_next_match(final SubLObject task, final SubLObject potentials)
  {
    return conses_high.member( task, potentials, $sym226$SHOP_SAME_TASK_, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 16375L)
  public static SubLObject shop_basic_plan_state_parent_taskP_method(final SubLObject self, final SubLObject task)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject post_ordering = get_shop_basic_plan_state_post_ordering( self );
    final SubLObject partial_plan = get_shop_basic_plan_state_partial_plan( self );
    SubLObject mbindings = get_shop_basic_plan_state_mbindings( self );
    try
    {
      thread.throwStack.push( $sym229$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        final SubLObject potential_list = partial_plan;
        SubLObject cur_potentials;
        SubLObject cur_task;
        SubLObject unifer;
        SubLObject _prev_bind_0;
        SubLObject unifier_mb;
        SubLObject inverse_mb;
        for( cur_potentials = NIL, cur_potentials = shop_find_next_match( task, potential_list ); NIL != cur_potentials; cur_potentials = shop_find_next_match( task, cur_potentials.rest() ) )
        {
          cur_task = cur_potentials.first();
          if( task.equal( cur_task ) && NIL == subl_promotions.memberP( cur_task, post_ordering, Symbols.symbol_function( EQ ), UNPROVIDED ) )
          {
            Dynamic.sublisp_throw( $sym229$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, T );
          }
          unifer = shop_datastructures.shop_unify( task, cur_task );
          if( NIL == shop_datastructures.shop_unify_failedP( unifer ) )
          {
            _prev_bind_0 = multibindings.$mb_reify_natsP$.currentBinding( thread );
            try
            {
              multibindings.$mb_reify_natsP$.bind( NIL, thread );
              unifier_mb = multibindings.convert_binding_to_mbind( unifer, mbindings );
              if( NIL != unifier_mb )
              {
                inverse_mb = multibindings.mb_inverse( mbindings, unifier_mb );
                if( NIL != shop_datastructures.shop_unify_failedP( inverse_mb ) )
                {
                  if( NIL == subl_promotions.memberP( cur_task, post_ordering, Symbols.symbol_function( EQ ), UNPROVIDED ) )
                  {
                    Dynamic.sublisp_throw( $sym229$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, T );
                  }
                }
                else
                {
                  mbindings = inverse_mb;
                }
              }
            }
            finally
            {
              multibindings.$mb_reify_natsP$.rebind( _prev_bind_0, thread );
            }
          }
        }
        Dynamic.sublisp_throw( $sym229$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, NIL );
        Dynamic.sublisp_throw( $sym229$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_post_ordering( self, post_ordering );
          set_shop_basic_plan_state_partial_plan( self, partial_plan );
          set_shop_basic_plan_state_mbindings( self, mbindings );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym229$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 17790L)
  public static SubLObject shop_basic_plan_state_expand_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject log = get_shop_basic_plan_state_log( self );
    final SubLObject depth = get_shop_basic_plan_state_depth( self );
    SubLObject tasklist = get_shop_basic_plan_state_tasklist( self );
    try
    {
      thread.throwStack.push( $sym233$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        final SubLObject task1 = tasklist.first();
        final SubLObject taskname = cycl_utilities.formula_operator( task1 );
        SubLObject entry = conses_high.assoc( $kw234$TASKS, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
        SubLObject verbose_msg_level = ( NIL != entry ) ? entry.rest() : ZERO_INTEGER;
        SubLObject verbose_thread_level = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
        if( verbose_thread_level.numGE( verbose_msg_level ) )
        {
          methods.funcall_instance_method_with_0_args( log, $sym235$NEW_SECTION );
          methods.funcall_instance_method_with_1_args( log, $sym236$LOG_HEADING, PrintLow.format( NIL, $str237$Search_Depth__s, depth ) );
          shop_basic_plan_state_output_message_method( self, PrintLow.format( NIL, $str238$task__s, task1 ) );
          final SubLObject entry_$10 = conses_high.assoc( $kw239$ALL, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
          final SubLObject verbose_msg_level_$11 = ( NIL != entry_$10 ) ? entry_$10.rest() : ZERO_INTEGER;
          final SubLObject verbose_thread_level_$12 = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
          if( verbose_thread_level_$12.numGE( verbose_msg_level_$11 ) )
          {
          }
        }
        if( taskname == $kw58$SUPERTASK )
        {
          shop_basic_plan_state_add_to_post_ordering_method( self, cycl_utilities.formula_arg1( task1, UNPROVIDED ) );
          tasklist = tasklist.rest();
          Dynamic.sublisp_throw( $sym233$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, ConsesLow.list( self ) );
        }
        else if( NIL != shop_parameters.$shop_method_cycle_checking_enabledP$.getDynamicValue( thread ) && NIL != shop_basic_plan_state_parent_taskP_method( self, task1 ) )
        {
          entry = conses_high.assoc( $kw240$GOALS, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
          verbose_msg_level = ( NIL != entry ) ? entry.rest() : ZERO_INTEGER;
          verbose_thread_level = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
          if( verbose_thread_level.numGE( verbose_msg_level ) )
          {
            methods.funcall_instance_method_with_1_args( log, $sym241$WARNING, $str242$Prune____Method_Cycle_checking_de );
          }
          Dynamic.sublisp_throw( $sym233$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, NIL );
        }
        else if( NIL != shop_basic_plan_state_simple_situation_predP_method( self, taskname ) )
        {
          Dynamic.sublisp_throw( $sym233$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, shop_basic_plan_state_expand_primitive_preconditions_method( self, task1 ) );
        }
        else
        {
          Dynamic.sublisp_throw( $sym233$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, shop_basic_plan_state_expand_complex_method( self, task1 ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_log( self, log );
          set_shop_basic_plan_state_depth( self, depth );
          set_shop_basic_plan_state_tasklist( self, tasklist );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym233$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 18908L)
  public static SubLObject shop_basic_plan_state_expand_complex_method(final SubLObject self, final SubLObject task)
  {
    SubLObject current;
    final SubLObject datum = current = shop_basic_plan_state_apply_all_sufficient_conditions_method( self, task );
    SubLObject scond_nodes = NIL;
    SubLObject inverse_unifiers = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list246 );
    scond_nodes = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list246 );
    inverse_unifiers = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject method_nodes = NIL;
      if( NIL != scond_nodes )
      {
        SubLObject cdolist_list_var = inverse_unifiers;
        SubLObject cur_unifier = NIL;
        cur_unifier = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == multibindings.multibinding_failedP( cur_unifier ) )
          {
            final SubLObject simple_unifier = shop_basic_plan_state_applicable_multibinding_method( self, cur_unifier );
            SubLObject cdolist_list_var_$13;
            final SubLObject new_tasks = cdolist_list_var_$13 = multibindings.apply_multibinding( task, simple_unifier );
            SubLObject cur_task = NIL;
            cur_task = cdolist_list_var_$13.first();
            while ( NIL != cdolist_list_var_$13)
            {
              method_nodes = ConsesLow.append( shop_basic_plan_state_apply_all_methods_method( self, cur_task ), method_nodes );
              cdolist_list_var_$13 = cdolist_list_var_$13.rest();
              cur_task = cdolist_list_var_$13.first();
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          cur_unifier = cdolist_list_var.first();
        }
      }
      else
      {
        method_nodes = shop_basic_plan_state_apply_all_methods_method( self, task );
      }
      return ConsesLow.append( scond_nodes, method_nodes );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list246 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 19595L)
  public static SubLObject shop_basic_plan_state_expand_primitive_preconditions_method(final SubLObject self, final SubLObject task)
  {
    if( NIL != shop_basic_plan_state_apply_all_preconditions_method( self, task ) )
    {
      return shop_basic_plan_state_expand_primitive_method( self, task );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 19774L)
  public static SubLObject shop_basic_plan_state_expand_primitive_method(final SubLObject self, final SubLObject task)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject domain = get_shop_basic_plan_state_domain( self );
    final SubLObject log = get_shop_basic_plan_state_log( self );
    final SubLObject planner = get_shop_basic_plan_state_planner( self );
    final SubLObject previous_states = get_shop_basic_plan_state_previous_states( self );
    try
    {
      thread.throwStack.push( $sym253$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        final SubLObject entry = conses_high.assoc( $kw254$OPERATORS, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
        final SubLObject verbose_msg_level = ( NIL != entry ) ? entry.rest() : ZERO_INTEGER;
        final SubLObject verbose_thread_level = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
        if( verbose_thread_level.numGE( verbose_msg_level ) )
        {
          methods.funcall_instance_method_with_0_args( log, $sym255$LOG_NEWLINE );
          methods.funcall_instance_method_with_1_args( log, $sym256$LOG_ENTRY, $str257$Finding_operators_for_task___ );
        }
        final SubLObject domain_$14 = shop_basic_planner_thread.shop_basic_planner_thread_get_domain_method( planner );
        final SubLObject operators = shop_domain.shop_basic_domain_get_operators_method( domain_$14, task );
        final SubLObject cond_operators = shop_domain.shop_basic_domain_get_conditional_operators_method( domain_$14, task );
        SubLObject new_plan_state = NIL;
        SubLObject new_world_state = NIL;
        if( NIL == operators )
        {
          methods.funcall_instance_method_with_1_args( log, $sym241$WARNING, $str258$No_operator_for_task );
          new_plan_state = shop_basic_plan_state_create_next_method( self );
          shop_basic_plan_state_add_to_partial_plan_method( new_plan_state, task );
          shop_basic_plan_state_add_to_task_strucs_method( new_plan_state, NIL );
          shop_basic_plan_state_add_decomposition_method( new_plan_state, task, NIL );
          Dynamic.sublisp_throw( $sym253$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, ConsesLow.list( new_plan_state ) );
        }
        new_world_state = shop_basic_plan_state_apply_operators_method( self, task, operators, cond_operators );
        if( NIL == new_world_state )
        {
          Dynamic.sublisp_throw( $sym253$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, NIL );
        }
        if( NIL != instances.get_slot( planner, $sym259$CYCLE_CHECKING ) )
        {
          SubLObject cdolist_list_var = instances.get_slot( self, $sym35$PREVIOUS_STATES );
          SubLObject old_state = NIL;
          old_state = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL != shop_basic_world_state.shop_basic_world_state_same_state_p_method( new_world_state, new_world_state, old_state ) )
            {
              final SubLObject entry2 = conses_high.assoc( $kw260$CUTOFFS, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
              final SubLObject verbose_msg_level2 = ( NIL != entry2 ) ? entry2.rest() : ZERO_INTEGER;
              final SubLObject verbose_thread_level2 = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
              if( verbose_thread_level2.numGE( verbose_msg_level2 ) )
              {
                methods.funcall_instance_method_with_1_args( log, $sym241$WARNING, $str261$Prune____World_State_Cycle_Checki );
              }
              Dynamic.sublisp_throw( $sym253$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, NIL );
            }
            cdolist_list_var = cdolist_list_var.rest();
            old_state = cdolist_list_var.first();
          }
        }
        new_plan_state = shop_basic_plan_state_create_next_method( self );
        shop_basic_plan_state_set_world_state_method( new_plan_state, new_world_state );
        shop_basic_plan_state_add_to_previous_states_method( new_plan_state, new_world_state );
        shop_basic_plan_state_add_to_partial_plan_method( new_plan_state, task );
        shop_basic_plan_state_add_to_task_strucs_method( new_plan_state, ConsesLow.append( operators, cond_operators ) );
        shop_basic_plan_state_add_decomposition_method( new_plan_state, task, NIL );
        Dynamic.sublisp_throw( $sym253$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, ConsesLow.list( new_plan_state ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_domain( self, domain );
          set_shop_basic_plan_state_log( self, log );
          set_shop_basic_plan_state_planner( self, planner );
          set_shop_basic_plan_state_previous_states( self, previous_states );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym253$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 22015L)
  public static SubLObject shop_basic_plan_state_apply_operators_method(final SubLObject self, final SubLObject task, final SubLObject operators, final SubLObject cond_operators)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject log = get_shop_basic_plan_state_log( self );
    final SubLObject world_state = get_shop_basic_plan_state_world_state( self );
    try
    {
      thread.throwStack.push( $sym266$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        final SubLObject result = methods.funcall_instance_method_with_0_args( world_state, $sym267$NEXT_STATE );
        SubLObject adds = NIL;
        SubLObject deletes = NIL;
        final SubLObject total_num = conses_high.list_length( cond_operators );
        SubLObject cdolist_list_var = operators;
        SubLObject cur_op = NIL;
        cur_op = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          thread.resetMultipleValues();
          final SubLObject new_adds = shop_basic_plan_state_apply_operator_method( self, task, cur_op );
          final SubLObject new_deletes = thread.secondMultipleValue();
          thread.resetMultipleValues();
          SubLObject cdolist_list_var_$15 = new_adds;
          SubLObject lit = NIL;
          lit = cdolist_list_var_$15.first();
          while ( NIL != cdolist_list_var_$15)
          {
            final SubLObject item_var = lit;
            if( NIL == conses_high.member( item_var, adds, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              adds = ConsesLow.cons( item_var, adds );
            }
            cdolist_list_var_$15 = cdolist_list_var_$15.rest();
            lit = cdolist_list_var_$15.first();
          }
          SubLObject cdolist_list_var_$16 = new_deletes;
          lit = NIL;
          lit = cdolist_list_var_$16.first();
          while ( NIL != cdolist_list_var_$16)
          {
            final SubLObject item_var = lit;
            if( NIL == conses_high.member( item_var, deletes, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              deletes = ConsesLow.cons( item_var, deletes );
            }
            cdolist_list_var_$16 = cdolist_list_var_$16.rest();
            lit = cdolist_list_var_$16.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          cur_op = cdolist_list_var.first();
        }
        SubLObject list_var = NIL;
        cur_op = NIL;
        SubLObject cur_num = NIL;
        list_var = cond_operators;
        cur_op = list_var.first();
        for( cur_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), cur_op = list_var.first(), cur_num = Numbers.add( ONE_INTEGER, cur_num ) )
        {
          final SubLObject entry = conses_high.assoc( $kw254$OPERATORS, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
          final SubLObject verbose_msg_level = ( NIL != entry ) ? entry.rest() : ZERO_INTEGER;
          final SubLObject verbose_thread_level = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
          if( verbose_thread_level.numGE( verbose_msg_level ) )
          {
            methods.funcall_instance_method_with_2_args( log, $sym268$LOG_FANCY_ENTRY, PrintLow.format( NIL, $str269$Trying___s__s__, number_utilities.f_1X( cur_num ), total_num ), $list270 );
            methods.funcall_instance_method_with_0_args( log, $sym255$LOG_NEWLINE );
          }
          thread.resetMultipleValues();
          final SubLObject new_adds2 = shop_basic_plan_state_apply_conditional_operator_method( self, task, cur_op );
          final SubLObject new_deletes2 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          SubLObject cdolist_list_var2 = new_adds2;
          SubLObject lit2 = NIL;
          lit2 = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            final SubLObject item_var2 = lit2;
            if( NIL == conses_high.member( item_var2, adds, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              adds = ConsesLow.cons( item_var2, adds );
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            lit2 = cdolist_list_var2.first();
          }
          cdolist_list_var2 = new_deletes2;
          lit2 = NIL;
          lit2 = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            final SubLObject item_var2 = lit2;
            if( NIL == conses_high.member( item_var2, deletes, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              deletes = ConsesLow.cons( item_var2, deletes );
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            lit2 = cdolist_list_var2.first();
          }
        }
        final SubLObject entry2 = conses_high.assoc( $kw254$OPERATORS, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
        final SubLObject verbose_msg_level2 = ( NIL != entry2 ) ? entry2.rest() : ZERO_INTEGER;
        final SubLObject verbose_thread_level2 = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
        if( verbose_thread_level2.numGE( verbose_msg_level2 ) )
        {
          methods.funcall_instance_method_with_0_args( log, $sym255$LOG_NEWLINE );
          methods.funcall_instance_method_with_1_args( log, $sym256$LOG_ENTRY, $str271$Making_New_World_State );
          methods.funcall_instance_method_with_1_args( log, $sym256$LOG_ENTRY, $str272$Adds__ );
          methods.funcall_instance_method_with_1_args( log, $sym256$LOG_ENTRY, PrintLow.write_to_string( adds, EMPTY_SUBL_OBJECT_ARRAY ) );
          methods.funcall_instance_method_with_1_args( log, $sym256$LOG_ENTRY, $str273$Deletes__ );
          methods.funcall_instance_method_with_1_args( log, $sym256$LOG_ENTRY, PrintLow.write_to_string( deletes, EMPTY_SUBL_OBJECT_ARRAY ) );
          final SubLObject race_lits = conses_high.intersection( adds, deletes, Symbols.symbol_function( EQUAL ), UNPROVIDED );
          if( NIL != race_lits )
          {
            shop_basic_plan_state_output_message_method( self, PrintLow.format( NIL, $str274$Warning__Add_Delete_race_conditio, new SubLObject[] { race_lits, operators, cond_operators
            } ) );
          }
        }
        methods.funcall_instance_method_with_1_args( result, $sym275$DELETE_LITERALS, deletes );
        methods.funcall_instance_method_with_1_args( result, $sym276$ADD_LITERALS, adds );
        Dynamic.sublisp_throw( $sym266$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, result );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_log( self, log );
          set_shop_basic_plan_state_world_state( self, world_state );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym266$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 23591L)
  public static SubLObject shop_basic_plan_state_apply_operator_method(final SubLObject self, final SubLObject task, final SubLObject operator)
  {
    final SubLObject head = shop_datastructures.get_shop_basic_planner_rule_head( operator );
    final SubLObject unifier = shop_datastructures.shop_unify( head.rest(), task.rest() );
    if( NIL == shop_datastructures.shop_unify_failedP( unifier ) )
    {
      final SubLObject deletions = shop_datastructures.shop_basic_operator_get_deletes_method( operator );
      final SubLObject additions = shop_datastructures.shop_basic_operator_get_adds_method( operator );
      return Values.values( shop_datastructures.shop_apply_substitution( additions, unifier ), shop_datastructures.shop_apply_substitution( deletions, unifier ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 24466L)
  public static SubLObject shop_basic_plan_state_apply_conditional_operator_method(final SubLObject self, final SubLObject task, final SubLObject operator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject log = get_shop_basic_plan_state_log( self );
    final SubLObject planner = get_shop_basic_plan_state_planner( self );
    final SubLObject mbindings = get_shop_basic_plan_state_mbindings( self );
    final SubLObject world_state = get_shop_basic_plan_state_world_state( self );
    try
    {
      thread.throwStack.push( $sym284$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        final SubLObject var_manager = instances.get_slot( planner, $sym95$VAR_MANAGER );
        final SubLObject head = shop_datastructures.get_shop_basic_planner_rule_head( operator );
        SubLObject adds = shop_datastructures.shop_basic_conditional_effect_adds_method( operator );
        SubLObject deletes = shop_datastructures.shop_basic_conditional_effect_deletes_method( operator );
        final SubLObject condition = shop_datastructures.shop_basic_conditional_effect_condition_method( operator );
        SubLObject sub_list = ConsesLow.list( condition, adds, deletes );
        final SubLObject unifier = shop_datastructures.shop_unify( head.rest(), task.rest() );
        SubLObject world_state_mbindings = NIL;
        if( NIL != shop_datastructures.shop_unify_failedP( unifier ) )
        {
          Dynamic.sublisp_throw( $sym284$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, world_state );
        }
        final SubLObject entry = conses_high.assoc( $kw254$OPERATORS, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
        final SubLObject verbose_msg_level = ( NIL != entry ) ? entry.rest() : ZERO_INTEGER;
        final SubLObject verbose_thread_level = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
        if( verbose_thread_level.numGE( verbose_msg_level ) )
        {
          methods.funcall_instance_method_with_1_args( log, $sym285$LOG_PLANNER_RULE, operator );
        }
        sub_list = shop_datastructures.shop_apply_substitution( sub_list, unifier );
        sub_list = shop_internals.shop_variable_manager_replace_variables_method( var_manager, sub_list, mbindings );
        world_state_mbindings = shop_basic_plan_state_find_mbindings_method( self, sub_list.first(), mbindings );
        if( NIL != world_state_mbindings )
        {
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == list_utilities.singletonP( world_state_mbindings ) )
          {
            Errors.error( $str286$_apply_conditional_operator_shop_, world_state_mbindings );
          }
          final SubLObject simple_mbinding = shop_basic_plan_state_applicable_multibinding_method( self, world_state_mbindings.first() );
          adds = multibindings.apply_multibinding( conses_high.second( sub_list ), simple_mbinding ).first();
          deletes = multibindings.apply_multibinding( conses_high.third( sub_list ), simple_mbinding ).first();
          Dynamic.sublisp_throw( $sym284$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, Values.values( adds, deletes ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_log( self, log );
          set_shop_basic_plan_state_planner( self, planner );
          set_shop_basic_plan_state_mbindings( self, mbindings );
          set_shop_basic_plan_state_world_state( self, world_state );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym284$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 26059L)
  public static SubLObject shop_basic_plan_state_unify_planner_rule_method(final SubLObject self, final SubLObject task, final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject planner = get_shop_basic_plan_state_planner( self );
    final SubLObject mbindings = get_shop_basic_plan_state_mbindings( self );
    try
    {
      thread.throwStack.push( $sym291$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        final SubLObject var_manager = instances.get_slot( planner, $sym95$VAR_MANAGER );
        final SubLObject simple_mbinding = shop_basic_plan_state_applicable_multibinding_method( self, mbindings );
        final SubLObject unified_head_data = methods.funcall_instance_method_with_1_args( rule, $sym292$UNIFY_TASK_TO_HEAD_WITH_DATA, task );
        if( NIL != unified_head_data )
        {
          final SubLObject task_unifier = unified_head_data.first();
          final SubLObject rule_data = unified_head_data.rest();
          if( NIL == shop_datastructures.shop_unify_failedP( task_unifier ) )
          {
            SubLObject precond_decomp = multibindings.apply_multibinding( rule_data, simple_mbinding ).first();
            final SubLObject generated_var_bpairs = shop_internals.shop_variable_manager_generated_variables_bound_method( $sym293$SHOP_VARIABLE_MANAGER, task_unifier );
            final SubLObject new_mbindings = multibindings.mb_add_bindings( mbindings, generated_var_bpairs );
            final SubLObject assertion = methods.funcall_instance_method_with_0_args( rule, $sym294$ASSERTIONS ).first();
            if( NIL != assertion )
            {
              final SubLObject el_vars = assertions_high.assertion_el_variables( assertion );
              final SubLObject hl_vars = assertions_high.assertion_hl_variables( assertion );
              final SubLObject el_subst = conses_high.pairlis( hl_vars, el_vars, UNPROVIDED );
              precond_decomp = conses_high.sublis( el_subst, precond_decomp, UNPROVIDED, UNPROVIDED );
            }
            final SubLObject decomp = shop_internals.shop_variable_manager_replace_variables_method( var_manager, precond_decomp, new_mbindings );
            Dynamic.sublisp_throw( $sym291$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, ConsesLow.cons( new_mbindings, decomp ) );
          }
        }
        Dynamic.sublisp_throw( $sym291$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, $kw295$FAIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_planner( self, planner );
          set_shop_basic_plan_state_mbindings( self, mbindings );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym291$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 28036L)
  public static SubLObject shop_basic_plan_state_apply_all_methods_method(final SubLObject self, final SubLObject task)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject domain = get_shop_basic_plan_state_domain( self );
    final SubLObject log = get_shop_basic_plan_state_log( self );
    final SubLObject planner = get_shop_basic_plan_state_planner( self );
    try
    {
      thread.throwStack.push( $sym299$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        SubLObject new_nodes = NIL;
        final SubLObject domain_$17 = shop_basic_planner_thread.shop_basic_planner_thread_get_domain_method( planner );
        final SubLObject task_pred_matched_methods = shop_domain.shop_basic_domain_get_methods_method( domain_$17, task );
        final SubLObject total_num = conses_high.list_length( task_pred_matched_methods );
        SubLObject entry = conses_high.assoc( $kw300$PLANNER_RULES, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
        SubLObject verbose_msg_level = ( NIL != entry ) ? entry.rest() : ZERO_INTEGER;
        SubLObject verbose_thread_level = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
        if( verbose_thread_level.numGE( verbose_msg_level ) )
        {
          methods.funcall_instance_method_with_0_args( log, $sym255$LOG_NEWLINE );
          methods.funcall_instance_method_with_1_args( log, $sym256$LOG_ENTRY, $str301$Finding_methods_for_task___ );
        }
        if( NIL != task_pred_matched_methods )
        {
          SubLObject list_var = NIL;
          SubLObject cur_method = NIL;
          SubLObject cur_num = NIL;
          list_var = task_pred_matched_methods;
          cur_method = list_var.first();
          for( cur_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), cur_method = list_var.first(), cur_num = Numbers.add( ONE_INTEGER, cur_num ) )
          {
            final SubLObject entry2 = conses_high.assoc( $kw300$PLANNER_RULES, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
            final SubLObject verbose_msg_level2 = ( NIL != entry2 ) ? entry2.rest() : ZERO_INTEGER;
            final SubLObject verbose_thread_level2 = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
            if( verbose_thread_level2.numGE( verbose_msg_level2 ) )
            {
              methods.funcall_instance_method_with_2_args( log, $sym268$LOG_FANCY_ENTRY, PrintLow.format( NIL, $str269$Trying___s__s__, number_utilities.f_1X( cur_num ), total_num ), $list270 );
              methods.funcall_instance_method_with_0_args( log, $sym255$LOG_NEWLINE );
            }
            new_nodes = ConsesLow.append( shop_basic_plan_state_apply_method_method( self, task, cur_method ), new_nodes );
          }
        }
        else
        {
          entry = conses_high.assoc( $kw240$GOALS, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
          verbose_msg_level = ( NIL != entry ) ? entry.rest() : ZERO_INTEGER;
          verbose_thread_level = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
          if( verbose_thread_level.numGE( verbose_msg_level ) )
          {
            methods.funcall_instance_method_with_1_args( log, $sym241$WARNING, $str302$No_matching_methods_were_found_ );
          }
        }
        Dynamic.sublisp_throw( $sym299$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, new_nodes );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_domain( self, domain );
          set_shop_basic_plan_state_log( self, log );
          set_shop_basic_plan_state_planner( self, planner );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym299$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 29025L)
  public static SubLObject shop_basic_plan_state_apply_method_method(final SubLObject self, final SubLObject task, final SubLObject method)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject log = get_shop_basic_plan_state_log( self );
    final SubLObject depth = get_shop_basic_plan_state_depth( self );
    try
    {
      thread.throwStack.push( $sym307$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        SubLObject new_nodes = NIL;
        final SubLObject unified_decomp_mbinding = shop_basic_plan_state_unify_planner_rule_method( self, task, method );
        final SubLObject entry = conses_high.assoc( $kw308$METHODS, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
        final SubLObject verbose_msg_level = ( NIL != entry ) ? entry.rest() : ZERO_INTEGER;
        final SubLObject verbose_thread_level = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
        if( verbose_thread_level.numGE( verbose_msg_level ) )
        {
          methods.funcall_instance_method_with_1_args( log, $sym285$LOG_PLANNER_RULE, method );
        }
        if( $kw295$FAIL != unified_decomp_mbinding )
        {
          SubLObject current;
          final SubLObject datum = current = unified_decomp_mbinding;
          SubLObject new_mbindings = NIL;
          SubLObject pre = NIL;
          SubLObject reduction = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list309 );
          new_mbindings = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list309 );
          pre = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list309 );
          reduction = current.first();
          current = current.rest();
          if( NIL == current )
          {
            final SubLObject state_unifiers = shop_basic_plan_state_find_mbindings_method( self, pre, new_mbindings );
            if( NIL != state_unifiers )
            {
              SubLObject list_var = NIL;
              SubLObject unifier = NIL;
              SubLObject result_num = NIL;
              list_var = state_unifiers;
              unifier = list_var.first();
              for( result_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), unifier = list_var.first(), result_num = Numbers.add( ONE_INTEGER, result_num ) )
              {
                final SubLObject new_plan_state = shop_basic_plan_state_create_next_method( self );
                SubLObject simple_mbinding = NIL;
                final SubLObject entry2 = conses_high.assoc( $kw308$METHODS, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
                final SubLObject verbose_msg_level2 = ( NIL != entry2 ) ? entry2.rest() : ZERO_INTEGER;
                final SubLObject verbose_thread_level2 = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
                if( verbose_thread_level2.numGE( verbose_msg_level2 ) )
                {
                  methods.funcall_instance_method_with_2_args( log, $sym268$LOG_FANCY_ENTRY, PrintLow.format( NIL, $str310$Result__s, number_utilities.f_1X( result_num ) ), $list270 );
                  methods.funcall_instance_method_with_1_args( log, $sym311$LOG_PREFORMATTED, multibindings.multibinding_string( unifier ) );
                  methods.funcall_instance_method_with_1_args( log, $sym256$LOG_ENTRY, PrintLow.format( NIL, $str312$Decomposition___, depth ) );
                  if( reduction.isList() )
                  {
                    SubLObject cdolist_list_var = reduction;
                    SubLObject r = NIL;
                    r = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      methods.funcall_instance_method_with_1_args( log, $sym311$LOG_PREFORMATTED, PrintLow.format( NIL, $str313$___6__s__, r ) );
                      cdolist_list_var = cdolist_list_var.rest();
                      r = cdolist_list_var.first();
                    }
                  }
                }
                shop_basic_plan_state_add_to_partial_plan_method( new_plan_state, task );
                set_shop_basic_plan_state_mbindings( new_plan_state, unifier );
                shop_basic_plan_state_add_to_task_strucs_method( new_plan_state, method );
                simple_mbinding = shop_basic_plan_state_applicable_multibinding_method( self, unifier );
                shop_basic_plan_state_add_decomposition_method( new_plan_state, task, multibindings.apply_multibinding( reduction, simple_mbinding ).first() );
                new_nodes = ConsesLow.cons( new_plan_state, new_nodes );
              }
            }
            Dynamic.sublisp_throw( $sym307$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, new_nodes );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list309 );
          }
        }
        Dynamic.sublisp_throw( $sym307$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_log( self, log );
          set_shop_basic_plan_state_depth( self, depth );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym307$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 31153L)
  public static SubLObject shop_basic_plan_state_apply_all_sufficient_conditions_method(final SubLObject self, final SubLObject task)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject domain = get_shop_basic_plan_state_domain( self );
    final SubLObject log = get_shop_basic_plan_state_log( self );
    final SubLObject planner = get_shop_basic_plan_state_planner( self );
    try
    {
      thread.throwStack.push( $sym317$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        SubLObject new_nodes = NIL;
        final SubLObject domain_$18 = shop_basic_planner_thread.shop_basic_planner_thread_get_domain_method( planner );
        final SubLObject task_sufficient_conds = shop_domain.shop_basic_domain_get_sufficient_conds_method( domain_$18, task );
        SubLObject inverse_unifiers = NIL;
        final SubLObject total_num = conses_high.list_length( task_sufficient_conds );
        SubLObject entry = conses_high.assoc( $kw300$PLANNER_RULES, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
        SubLObject verbose_msg_level = ( NIL != entry ) ? entry.rest() : ZERO_INTEGER;
        SubLObject verbose_thread_level = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
        if( verbose_thread_level.numGE( verbose_msg_level ) )
        {
          methods.funcall_instance_method_with_0_args( log, $sym255$LOG_NEWLINE );
          methods.funcall_instance_method_with_1_args( log, $sym256$LOG_ENTRY, $str318$Finding_sufficient_condition_rule );
        }
        if( NIL != task_sufficient_conds )
        {
          SubLObject list_var = NIL;
          SubLObject cur_scond = NIL;
          SubLObject cur_num = NIL;
          list_var = task_sufficient_conds;
          cur_scond = list_var.first();
          for( cur_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), cur_scond = list_var.first(), cur_num = Numbers.add( ONE_INTEGER, cur_num ) )
          {
            final SubLObject entry2 = conses_high.assoc( $kw300$PLANNER_RULES, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
            final SubLObject verbose_msg_level2 = ( NIL != entry2 ) ? entry2.rest() : ZERO_INTEGER;
            final SubLObject verbose_thread_level2 = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
            if( verbose_thread_level2.numGE( verbose_msg_level2 ) )
            {
              methods.funcall_instance_method_with_2_args( log, $sym268$LOG_FANCY_ENTRY, PrintLow.format( NIL, $str269$Trying___s__s__, number_utilities.f_1X( cur_num ), total_num ), $list270 );
              methods.funcall_instance_method_with_0_args( log, $sym255$LOG_NEWLINE );
            }
            SubLObject current;
            final SubLObject datum = current = shop_basic_plan_state_apply_sufficient_condition_method( self, task, cur_scond );
            SubLObject nodes = NIL;
            SubLObject inverse_unifier = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list319 );
            nodes = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list319 );
            inverse_unifier = current.first();
            current = current.rest();
            if( NIL == current )
            {
              new_nodes = ConsesLow.append( nodes, new_nodes );
              final SubLObject item_var = inverse_unifier;
              if( NIL == conses_high.member( item_var, inverse_unifiers, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
              {
                inverse_unifiers = ConsesLow.cons( item_var, inverse_unifiers );
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list319 );
            }
          }
        }
        else
        {
          entry = conses_high.assoc( $kw240$GOALS, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
          verbose_msg_level = ( NIL != entry ) ? entry.rest() : ZERO_INTEGER;
          verbose_thread_level = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
          if( verbose_thread_level.numGE( verbose_msg_level ) )
          {
            methods.funcall_instance_method_with_1_args( log, $sym241$WARNING, $str320$No_matching_sufficient_conditions );
          }
        }
        Dynamic.sublisp_throw( $sym317$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, ConsesLow.list( new_nodes, inverse_unifiers ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_domain( self, domain );
          set_shop_basic_plan_state_log( self, log );
          set_shop_basic_plan_state_planner( self, planner );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym317$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 32381L)
  public static SubLObject shop_basic_plan_state_apply_sufficient_condition_method(final SubLObject self, final SubLObject task, final SubLObject scond)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject log = get_shop_basic_plan_state_log( self );
    final SubLObject tasklist = get_shop_basic_plan_state_tasklist( self );
    try
    {
      thread.throwStack.push( $sym325$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        SubLObject new_nodes = NIL;
        final SubLObject unified_task_data = shop_basic_plan_state_unify_planner_rule_method( self, task, scond );
        final SubLObject entry = conses_high.assoc( $kw308$METHODS, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
        final SubLObject verbose_msg_level = ( NIL != entry ) ? entry.rest() : ZERO_INTEGER;
        final SubLObject verbose_thread_level = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
        if( verbose_thread_level.numGE( verbose_msg_level ) )
        {
          methods.funcall_instance_method_with_1_args( log, $sym285$LOG_PLANNER_RULE, scond );
        }
        if( unified_task_data != $kw295$FAIL )
        {
          SubLObject current;
          final SubLObject datum = current = unified_task_data;
          SubLObject new_mbindings = NIL;
          SubLObject condition = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list326 );
          new_mbindings = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list326 );
          condition = current.first();
          current = current.rest();
          if( NIL == current )
          {
            final SubLObject state_unifiers = shop_basic_plan_state_find_mbindings_method( self, condition, new_mbindings );
            final SubLObject inverse_unifier = multibindings.multibinding_inverse_list( new_mbindings, state_unifiers );
            SubLObject cdolist_list_var = state_unifiers;
            SubLObject cur_unifier = NIL;
            cur_unifier = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              final SubLObject new_node = shop_basic_plan_state_create_next_method( self );
              shop_basic_plan_state_add_to_partial_plan_method( new_node, task );
              shop_basic_plan_state_add_to_task_strucs_method( new_node, scond );
              set_shop_basic_plan_state_mbindings( new_node, cur_unifier );
              shop_basic_plan_state_set_tasklist_method( new_node, ConsesLow.append( ConsesLow.list( ConsesLow.list( $kw58$SUPERTASK, task ) ), tasklist.rest() ) );
              new_nodes = ConsesLow.cons( new_node, new_nodes );
              cdolist_list_var = cdolist_list_var.rest();
              cur_unifier = cdolist_list_var.first();
            }
            Dynamic.sublisp_throw( $sym325$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, ConsesLow.list( new_nodes, inverse_unifier ) );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list326 );
          }
        }
        Dynamic.sublisp_throw( $sym325$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, ConsesLow.list( NIL, NIL ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_log( self, log );
          set_shop_basic_plan_state_tasklist( self, tasklist );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym325$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 33593L)
  public static SubLObject shop_basic_plan_state_apply_all_preconditions_method(final SubLObject self, final SubLObject task)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject domain = get_shop_basic_plan_state_domain( self );
    final SubLObject log = get_shop_basic_plan_state_log( self );
    try
    {
      thread.throwStack.push( $sym330$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        final SubLObject preconds = shop_domain.shop_basic_domain_get_planner_rules_method( domain, task, $sym331$SHOP_PRECONDITION_P );
        final SubLObject total_num = conses_high.list_length( preconds );
        SubLObject entry = conses_high.assoc( $kw254$OPERATORS, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
        SubLObject verbose_msg_level = ( NIL != entry ) ? entry.rest() : ZERO_INTEGER;
        SubLObject verbose_thread_level = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
        if( verbose_thread_level.numGE( verbose_msg_level ) )
        {
          methods.funcall_instance_method_with_0_args( log, $sym255$LOG_NEWLINE );
          methods.funcall_instance_method_with_1_args( log, $sym256$LOG_ENTRY, $str332$Finding_precondition_rules_for_ta );
        }
        if( NIL == preconds )
        {
          entry = conses_high.assoc( $kw254$OPERATORS, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
          verbose_msg_level = ( NIL != entry ) ? entry.rest() : ZERO_INTEGER;
          verbose_thread_level = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
          if( verbose_thread_level.numGE( verbose_msg_level ) )
          {
            methods.funcall_instance_method_with_1_args( log, $sym241$WARNING, $str333$No_precondition_rules_found_ );
          }
          Dynamic.sublisp_throw( $sym330$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, T );
        }
        else
        {
          SubLObject list_var = NIL;
          SubLObject precond = NIL;
          SubLObject cur_num = NIL;
          list_var = preconds;
          precond = list_var.first();
          for( cur_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), precond = list_var.first(), cur_num = Numbers.add( ONE_INTEGER, cur_num ) )
          {
            final SubLObject entry2 = conses_high.assoc( $kw254$OPERATORS, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
            final SubLObject verbose_msg_level2 = ( NIL != entry2 ) ? entry2.rest() : ZERO_INTEGER;
            final SubLObject verbose_thread_level2 = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
            if( verbose_thread_level2.numGE( verbose_msg_level2 ) )
            {
              methods.funcall_instance_method_with_2_args( log, $sym268$LOG_FANCY_ENTRY, PrintLow.format( NIL, $str269$Trying___s__s__, number_utilities.f_1X( cur_num ), total_num ), $list270 );
              methods.funcall_instance_method_with_0_args( log, $sym255$LOG_NEWLINE );
            }
            if( NIL == shop_basic_plan_state_apply_precondition_method( self, task, precond ) )
            {
              Dynamic.sublisp_throw( $sym330$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, NIL );
            }
          }
          Dynamic.sublisp_throw( $sym330$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, T );
        }
        Dynamic.sublisp_throw( $sym330$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_domain( self, domain );
          set_shop_basic_plan_state_log( self, log );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym330$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 34615L)
  public static SubLObject shop_basic_plan_state_apply_precondition_method(final SubLObject self, final SubLObject task, final SubLObject precond)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_state_method = NIL;
    final SubLObject log = get_shop_basic_plan_state_log( self );
    try
    {
      thread.throwStack.push( $sym338$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
      try
      {
        final SubLObject entry = conses_high.assoc( $kw300$PLANNER_RULES, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
        final SubLObject verbose_msg_level = ( NIL != entry ) ? entry.rest() : ZERO_INTEGER;
        final SubLObject verbose_thread_level = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
        if( verbose_thread_level.numGE( verbose_msg_level ) )
        {
          methods.funcall_instance_method_with_1_args( log, $sym285$LOG_PLANNER_RULE, precond );
        }
        final SubLObject unified_task_data = shop_basic_plan_state_unify_planner_rule_method( self, task, precond );
        if( $kw295$FAIL != unified_task_data )
        {
          SubLObject current;
          final SubLObject datum = current = unified_task_data;
          SubLObject new_mbindings = NIL;
          SubLObject pre = NIL;
          SubLObject reduction = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list309 );
          new_mbindings = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list309 );
          pre = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list309 );
          reduction = current.first();
          current = current.rest();
          if( NIL == current )
          {
            final SubLObject state_unifiers = shop_basic_plan_state_find_mbindings_method( self, pre, new_mbindings );
            if( NIL == state_unifiers )
            {
              final SubLObject entry2 = conses_high.assoc( $kw300$PLANNER_RULES, shop_internals.$shop_verbose_keys$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
              final SubLObject verbose_msg_level2 = ( NIL != entry2 ) ? entry2.rest() : ZERO_INTEGER;
              final SubLObject verbose_thread_level2 = instances.get_slot( instances.get_slot( self, $sym20$LOG ), $sym218$VERBOSE );
              if( verbose_thread_level2.numGE( verbose_msg_level2 ) )
              {
                methods.funcall_instance_method_with_1_args( log, $sym241$WARNING, $str339$No_bindings_found_ );
              }
              Dynamic.sublisp_throw( $sym338$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, NIL );
            }
            else
            {
              Dynamic.sublisp_throw( $sym338$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, state_unifiers );
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( datum, $list309 );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_state_log( self, log );
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
      catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable( ccatch_env_var, $sym338$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_state_method;
  }

  public static SubLObject declare_shop_basic_plan_state_file()
  {
    SubLFiles.declareMacro( me, "cpushX", "CPUSH*" );
    SubLFiles.declareMacro( me, "when_verbose", "WHEN-VERBOSE" );
    SubLFiles.declareFunction( me, "shop_plan_state_p", "SHOP-PLAN-STATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_state_dynamic_predicates", "GET-SHOP-BASIC-PLAN-STATE-DYNAMIC-PREDICATES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_state_dynamic_predicates", "SET-SHOP-BASIC-PLAN-STATE-DYNAMIC-PREDICATES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_state_model_mt", "GET-SHOP-BASIC-PLAN-STATE-MODEL-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_state_model_mt", "SET-SHOP-BASIC-PLAN-STATE-MODEL-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_state_domain", "GET-SHOP-BASIC-PLAN-STATE-DOMAIN", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_state_domain", "SET-SHOP-BASIC-PLAN-STATE-DOMAIN", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_state_log", "GET-SHOP-BASIC-PLAN-STATE-LOG", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_state_log", "SET-SHOP-BASIC-PLAN-STATE-LOG", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_state_planner", "GET-SHOP-BASIC-PLAN-STATE-PLANNER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_state_planner", "SET-SHOP-BASIC-PLAN-STATE-PLANNER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_state_previous_states", "GET-SHOP-BASIC-PLAN-STATE-PREVIOUS-STATES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_state_previous_states", "SET-SHOP-BASIC-PLAN-STATE-PREVIOUS-STATES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_state_depth", "GET-SHOP-BASIC-PLAN-STATE-DEPTH", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_state_depth", "SET-SHOP-BASIC-PLAN-STATE-DEPTH", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_state_query_properties", "GET-SHOP-BASIC-PLAN-STATE-QUERY-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_state_query_properties", "SET-SHOP-BASIC-PLAN-STATE-QUERY-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_state_post_ordering", "GET-SHOP-BASIC-PLAN-STATE-POST-ORDERING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_state_post_ordering", "SET-SHOP-BASIC-PLAN-STATE-POST-ORDERING", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_state_partial_plan", "GET-SHOP-BASIC-PLAN-STATE-PARTIAL-PLAN", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_state_partial_plan", "SET-SHOP-BASIC-PLAN-STATE-PARTIAL-PLAN", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_state_supports", "GET-SHOP-BASIC-PLAN-STATE-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_state_supports", "SET-SHOP-BASIC-PLAN-STATE-SUPPORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_state_task_strucs", "GET-SHOP-BASIC-PLAN-STATE-TASK-STRUCS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_state_task_strucs", "SET-SHOP-BASIC-PLAN-STATE-TASK-STRUCS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_state_mbindings", "GET-SHOP-BASIC-PLAN-STATE-MBINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_state_mbindings", "SET-SHOP-BASIC-PLAN-STATE-MBINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_state_tasklist", "GET-SHOP-BASIC-PLAN-STATE-TASKLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_state_tasklist", "SET-SHOP-BASIC-PLAN-STATE-TASKLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_state_world_state", "GET-SHOP-BASIC-PLAN-STATE-WORLD-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_state_world_state", "SET-SHOP-BASIC-PLAN-STATE-WORLD-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_plan_state_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-STATE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_plan_state_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-STATE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_p", "SHOP-BASIC-PLAN-STATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_applicable_multibinding_method", "SHOP-BASIC-PLAN-STATE-APPLICABLE-MULTIBINDING-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_set_tasklist_method", "SHOP-BASIC-PLAN-STATE-SET-TASKLIST-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_get_tasklist_method", "SHOP-BASIC-PLAN-STATE-GET-TASKLIST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_add_decomposition_method", "SHOP-BASIC-PLAN-STATE-ADD-DECOMPOSITION-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_set_multibindings_method", "SHOP-BASIC-PLAN-STATE-SET-MULTIBINDINGS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_multibindings_method", "SHOP-BASIC-PLAN-STATE-MULTIBINDINGS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_set_domain_method", "SHOP-BASIC-PLAN-STATE-SET-DOMAIN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_get_domain_method", "SHOP-BASIC-PLAN-STATE-GET-DOMAIN-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_support_lists_method", "SHOP-BASIC-PLAN-STATE-SUPPORT-LISTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_add_to_support_lists_method", "SHOP-BASIC-PLAN-STATE-ADD-TO-SUPPORT-LISTS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_initialize_method", "SHOP-BASIC-PLAN-STATE-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_initialize_plan_state_with_problem_method", "SHOP-BASIC-PLAN-STATE-INITIALIZE-PLAN-STATE-WITH-PROBLEM-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_initialize_multibindings_method", "SHOP-BASIC-PLAN-STATE-INITIALIZE-MULTIBINDINGS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_output_message_method", "SHOP-BASIC-PLAN-STATE-OUTPUT-MESSAGE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_copy_method", "SHOP-BASIC-PLAN-STATE-COPY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_create_next_method", "SHOP-BASIC-PLAN-STATE-CREATE-NEXT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_init_model_with_problem_method", "SHOP-BASIC-PLAN-STATE-INIT-MODEL-WITH-PROBLEM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_set_world_state_method", "SHOP-BASIC-PLAN-STATE-SET-WORLD-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_get_world_state_method", "SHOP-BASIC-PLAN-STATE-GET-WORLD-STATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_mbinding_method", "SHOP-BASIC-PLAN-STATE-MBINDING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_set_depth_method", "SHOP-BASIC-PLAN-STATE-SET-DEPTH-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_depth_method", "SHOP-BASIC-PLAN-STATE-DEPTH-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_set_previous_states_method", "SHOP-BASIC-PLAN-STATE-SET-PREVIOUS-STATES-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_get_previous_states_method", "SHOP-BASIC-PLAN-STATE-GET-PREVIOUS-STATES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_add_to_previous_states_method", "SHOP-BASIC-PLAN-STATE-ADD-TO-PREVIOUS-STATES-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_set_partial_plan_method", "SHOP-BASIC-PLAN-STATE-SET-PARTIAL-PLAN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_get_partial_plan_method", "SHOP-BASIC-PLAN-STATE-GET-PARTIAL-PLAN-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_add_to_partial_plan_method", "SHOP-BASIC-PLAN-STATE-ADD-TO-PARTIAL-PLAN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_add_to_post_ordering_method", "SHOP-BASIC-PLAN-STATE-ADD-TO-POST-ORDERING-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_add_to_mbindings_method", "SHOP-BASIC-PLAN-STATE-ADD-TO-MBINDINGS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_planner_rules_method", "SHOP-BASIC-PLAN-STATE-PLANNER-RULES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_add_to_task_strucs_method", "SHOP-BASIC-PLAN-STATE-ADD-TO-TASK-STRUCS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_task_strucs_method", "SHOP-BASIC-PLAN-STATE-TASK-STRUCS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_get_planner_method", "SHOP-BASIC-PLAN-STATE-GET-PLANNER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_set_planner_method", "SHOP-BASIC-PLAN-STATE-SET-PLANNER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_get_which_plans_method", "SHOP-BASIC-PLAN-STATE-GET-WHICH-PLANS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_simple_situation_predP_method", "SHOP-BASIC-PLAN-STATE-SIMPLE-SITUATION-PRED?-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_seek_total_mbindings_method", "SHOP-BASIC-PLAN-STATE-SEEK-TOTAL-MBINDINGS-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_find_mbindings_method", "SHOP-BASIC-PLAN-STATE-FIND-MBINDINGS-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_same_taskP", "SHOP-SAME-TASK?", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_find_next_match", "SHOP-FIND-NEXT-MATCH", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_parent_taskP_method", "SHOP-BASIC-PLAN-STATE-PARENT-TASK?-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_expand_method", "SHOP-BASIC-PLAN-STATE-EXPAND-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_expand_complex_method", "SHOP-BASIC-PLAN-STATE-EXPAND-COMPLEX-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_expand_primitive_preconditions_method", "SHOP-BASIC-PLAN-STATE-EXPAND-PRIMITIVE-PRECONDITIONS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_expand_primitive_method", "SHOP-BASIC-PLAN-STATE-EXPAND-PRIMITIVE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_apply_operators_method", "SHOP-BASIC-PLAN-STATE-APPLY-OPERATORS-METHOD", 4, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_apply_operator_method", "SHOP-BASIC-PLAN-STATE-APPLY-OPERATOR-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_apply_conditional_operator_method", "SHOP-BASIC-PLAN-STATE-APPLY-CONDITIONAL-OPERATOR-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_unify_planner_rule_method", "SHOP-BASIC-PLAN-STATE-UNIFY-PLANNER-RULE-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_apply_all_methods_method", "SHOP-BASIC-PLAN-STATE-APPLY-ALL-METHODS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_apply_method_method", "SHOP-BASIC-PLAN-STATE-APPLY-METHOD-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_apply_all_sufficient_conditions_method", "SHOP-BASIC-PLAN-STATE-APPLY-ALL-SUFFICIENT-CONDITIONS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_apply_sufficient_condition_method", "SHOP-BASIC-PLAN-STATE-APPLY-SUFFICIENT-CONDITION-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_apply_all_preconditions_method", "SHOP-BASIC-PLAN-STATE-APPLY-ALL-PRECONDITIONS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_state_apply_precondition_method", "SHOP-BASIC-PLAN-STATE-APPLY-PRECONDITION-METHOD", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_shop_basic_plan_state_file()
  {
    $shop_canonicalize_functionsP$ = SubLFiles.defparameter( "*SHOP-CANONICALIZE-FUNCTIONS?*", T );
    return NIL;
  }

  public static SubLObject setup_shop_basic_plan_state_file()
  {
    interfaces.new_interface( $sym11$SHOP_PLAN_STATE, NIL, NIL, $list12 );
    classes.subloop_new_class( $sym13$SHOP_BASIC_PLAN_STATE, $sym14$OBJECT, $list15, NIL, $list16 );
    classes.class_set_implements_slot_listeners( $sym13$SHOP_BASIC_PLAN_STATE, NIL );
    classes.subloop_note_class_initialization_function( $sym13$SHOP_BASIC_PLAN_STATE, $sym23$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_STATE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym13$SHOP_BASIC_PLAN_STATE, $sym36$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_STATE_INSTANCE );
    subloop_reserved_initialize_shop_basic_plan_state_class( $sym13$SHOP_BASIC_PLAN_STATE );
    methods.methods_incorporate_class_method( $sym37$APPLICABLE_MULTIBINDING, $sym13$SHOP_BASIC_PLAN_STATE, $list38, $list39, $list40 );
    methods.subloop_register_class_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym37$APPLICABLE_MULTIBINDING, $sym41$SHOP_BASIC_PLAN_STATE_APPLICABLE_MULTIBINDING_METHOD );
    methods.methods_incorporate_instance_method( $sym42$SET_TASKLIST, $sym13$SHOP_BASIC_PLAN_STATE, $list38, $list43, $list44 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym42$SET_TASKLIST, $sym47$SHOP_BASIC_PLAN_STATE_SET_TASKLIST_METHOD );
    methods.methods_incorporate_instance_method( $sym48$GET_TASKLIST, $sym13$SHOP_BASIC_PLAN_STATE, $list49, NIL, $list50 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym48$GET_TASKLIST, $sym52$SHOP_BASIC_PLAN_STATE_GET_TASKLIST_METHOD );
    methods.methods_incorporate_instance_method( $sym53$ADD_DECOMPOSITION, $sym13$SHOP_BASIC_PLAN_STATE, $list54, $list55, $list56 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym53$ADD_DECOMPOSITION, $sym59$SHOP_BASIC_PLAN_STATE_ADD_DECOMPOSITION_METHOD );
    methods.methods_incorporate_instance_method( $sym60$SET_MULTIBINDINGS, $sym13$SHOP_BASIC_PLAN_STATE, $list49, $list61, $list62 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym60$SET_MULTIBINDINGS, $sym64$SHOP_BASIC_PLAN_STATE_SET_MULTIBINDINGS_METHOD );
    methods.methods_incorporate_instance_method( $sym65$MULTIBINDINGS, $sym13$SHOP_BASIC_PLAN_STATE, $list49, NIL, $list66 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym65$MULTIBINDINGS, $sym68$SHOP_BASIC_PLAN_STATE_MULTIBINDINGS_METHOD );
    methods.methods_incorporate_instance_method( $sym69$SET_DOMAIN, $sym13$SHOP_BASIC_PLAN_STATE, $list38, $list70, $list71 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym69$SET_DOMAIN, $sym73$SHOP_BASIC_PLAN_STATE_SET_DOMAIN_METHOD );
    methods.methods_incorporate_instance_method( $sym74$GET_DOMAIN, $sym13$SHOP_BASIC_PLAN_STATE, $list49, NIL, $list75 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym74$GET_DOMAIN, $sym77$SHOP_BASIC_PLAN_STATE_GET_DOMAIN_METHOD );
    methods.methods_incorporate_instance_method( $sym78$SUPPORT_LISTS, $sym13$SHOP_BASIC_PLAN_STATE, $list49, NIL, $list79 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym78$SUPPORT_LISTS, $sym81$SHOP_BASIC_PLAN_STATE_SUPPORT_LISTS_METHOD );
    methods.methods_incorporate_instance_method( $sym82$ADD_TO_SUPPORT_LISTS, $sym13$SHOP_BASIC_PLAN_STATE, $list49, $list83, $list84 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym82$ADD_TO_SUPPORT_LISTS, $sym86$SHOP_BASIC_PLAN_STATE_ADD_TO_SUPPORT_LISTS_METHOD );
    methods.methods_incorporate_instance_method( $sym87$INITIALIZE, $sym13$SHOP_BASIC_PLAN_STATE, $list38, NIL, $list88 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym87$INITIALIZE, $sym90$SHOP_BASIC_PLAN_STATE_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym91$INITIALIZE_PLAN_STATE_WITH_PROBLEM, $sym13$SHOP_BASIC_PLAN_STATE, $list92, $list93, $list94 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym91$INITIALIZE_PLAN_STATE_WITH_PROBLEM, $sym98$SHOP_BASIC_PLAN_STATE_INITIALIZE_PLAN_STATE_WITH_PROBLEM_METHOD );
    methods.methods_incorporate_instance_method( $sym99$INITIALIZE_MULTIBINDINGS, $sym13$SHOP_BASIC_PLAN_STATE, $list100, NIL, $list101 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym99$INITIALIZE_MULTIBINDINGS, $sym103$SHOP_BASIC_PLAN_STATE_INITIALIZE_MULTIBINDINGS_METHOD );
    methods.methods_incorporate_instance_method( $sym104$OUTPUT_MESSAGE, $sym13$SHOP_BASIC_PLAN_STATE, $list49, $list105, $list106 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym104$OUTPUT_MESSAGE, $sym108$SHOP_BASIC_PLAN_STATE_OUTPUT_MESSAGE_METHOD );
    methods.methods_incorporate_instance_method( $sym109$COPY, $sym13$SHOP_BASIC_PLAN_STATE, $list49, NIL, $list110 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym109$COPY, $sym111$SHOP_BASIC_PLAN_STATE_COPY_METHOD );
    methods.methods_incorporate_instance_method( $sym112$CREATE_NEXT, $sym13$SHOP_BASIC_PLAN_STATE, $list49, NIL, $list113 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym112$CREATE_NEXT, $sym115$SHOP_BASIC_PLAN_STATE_CREATE_NEXT_METHOD );
    methods.methods_incorporate_instance_method( $sym116$INIT_MODEL_WITH_PROBLEM, $sym13$SHOP_BASIC_PLAN_STATE, $list100, $list117, $list118 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym116$INIT_MODEL_WITH_PROBLEM, $sym120$SHOP_BASIC_PLAN_STATE_INIT_MODEL_WITH_PROBLEM_METHOD );
    methods.methods_incorporate_instance_method( $sym121$SET_WORLD_STATE, $sym13$SHOP_BASIC_PLAN_STATE, $list38, $list122, $list123 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym121$SET_WORLD_STATE, $sym126$SHOP_BASIC_PLAN_STATE_SET_WORLD_STATE_METHOD );
    methods.methods_incorporate_instance_method( $sym127$GET_WORLD_STATE, $sym13$SHOP_BASIC_PLAN_STATE, $list49, NIL, $list128 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym127$GET_WORLD_STATE, $sym130$SHOP_BASIC_PLAN_STATE_GET_WORLD_STATE_METHOD );
    methods.methods_incorporate_instance_method( $sym131$MBINDING, $sym13$SHOP_BASIC_PLAN_STATE, $list49, NIL, $list66 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym131$MBINDING, $sym133$SHOP_BASIC_PLAN_STATE_MBINDING_METHOD );
    methods.methods_incorporate_instance_method( $sym134$SET_DEPTH, $sym13$SHOP_BASIC_PLAN_STATE, $list38, $list135, $list136 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym134$SET_DEPTH, $sym139$SHOP_BASIC_PLAN_STATE_SET_DEPTH_METHOD );
    methods.methods_incorporate_instance_method( $sym34$DEPTH, $sym13$SHOP_BASIC_PLAN_STATE, $list49, NIL, $list140 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym34$DEPTH, $sym142$SHOP_BASIC_PLAN_STATE_DEPTH_METHOD );
    methods.methods_incorporate_instance_method( $sym143$SET_PREVIOUS_STATES, $sym13$SHOP_BASIC_PLAN_STATE, $list38, $list144, $list145 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym143$SET_PREVIOUS_STATES, $sym147$SHOP_BASIC_PLAN_STATE_SET_PREVIOUS_STATES_METHOD );
    methods.methods_incorporate_instance_method( $sym148$GET_PREVIOUS_STATES, $sym13$SHOP_BASIC_PLAN_STATE, $list49, NIL, $list149 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym148$GET_PREVIOUS_STATES, $sym151$SHOP_BASIC_PLAN_STATE_GET_PREVIOUS_STATES_METHOD );
    methods.methods_incorporate_instance_method( $sym152$ADD_TO_PREVIOUS_STATES, $sym13$SHOP_BASIC_PLAN_STATE, $list38, $list153, $list154 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym152$ADD_TO_PREVIOUS_STATES, $sym156$SHOP_BASIC_PLAN_STATE_ADD_TO_PREVIOUS_STATES_METHOD );
    methods.methods_incorporate_instance_method( $sym157$SET_PARTIAL_PLAN, $sym13$SHOP_BASIC_PLAN_STATE, $list38, $list158, $list159 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym157$SET_PARTIAL_PLAN, $sym161$SHOP_BASIC_PLAN_STATE_SET_PARTIAL_PLAN_METHOD );
    methods.methods_incorporate_instance_method( $sym162$GET_PARTIAL_PLAN, $sym13$SHOP_BASIC_PLAN_STATE, $list49, NIL, $list163 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym162$GET_PARTIAL_PLAN, $sym165$SHOP_BASIC_PLAN_STATE_GET_PARTIAL_PLAN_METHOD );
    methods.methods_incorporate_instance_method( $sym166$ADD_TO_PARTIAL_PLAN, $sym13$SHOP_BASIC_PLAN_STATE, $list38, $list167, $list168 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym166$ADD_TO_PARTIAL_PLAN, $sym170$SHOP_BASIC_PLAN_STATE_ADD_TO_PARTIAL_PLAN_METHOD );
    methods.methods_incorporate_instance_method( $sym171$ADD_TO_POST_ORDERING, $sym13$SHOP_BASIC_PLAN_STATE, $list54, $list167, $list172 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym171$ADD_TO_POST_ORDERING, $sym174$SHOP_BASIC_PLAN_STATE_ADD_TO_POST_ORDERING_METHOD );
    methods.methods_incorporate_instance_method( $sym175$ADD_TO_MBINDINGS, $sym13$SHOP_BASIC_PLAN_STATE, $list49, $list176, $list177 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym175$ADD_TO_MBINDINGS, $sym179$SHOP_BASIC_PLAN_STATE_ADD_TO_MBINDINGS_METHOD );
    methods.methods_incorporate_instance_method( $sym180$PLANNER_RULES, $sym13$SHOP_BASIC_PLAN_STATE, $list49, NIL, $list181 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym180$PLANNER_RULES, $sym183$SHOP_BASIC_PLAN_STATE_PLANNER_RULES_METHOD );
    methods.methods_incorporate_instance_method( $sym184$ADD_TO_TASK_STRUCS, $sym13$SHOP_BASIC_PLAN_STATE, $list54, $list185, $list186 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym184$ADD_TO_TASK_STRUCS, $sym188$SHOP_BASIC_PLAN_STATE_ADD_TO_TASK_STRUCS_METHOD );
    methods.methods_incorporate_instance_method( $sym29$TASK_STRUCS, $sym13$SHOP_BASIC_PLAN_STATE, $list49, NIL, $list181 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym29$TASK_STRUCS, $sym190$SHOP_BASIC_PLAN_STATE_TASK_STRUCS_METHOD );
    methods.methods_incorporate_instance_method( $sym191$GET_PLANNER, $sym13$SHOP_BASIC_PLAN_STATE, $list49, NIL, $list192 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym191$GET_PLANNER, $sym194$SHOP_BASIC_PLAN_STATE_GET_PLANNER_METHOD );
    methods.methods_incorporate_instance_method( $sym195$SET_PLANNER, $sym13$SHOP_BASIC_PLAN_STATE, $list49, $list158, $list196 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym195$SET_PLANNER, $sym198$SHOP_BASIC_PLAN_STATE_SET_PLANNER_METHOD );
    methods.methods_incorporate_instance_method( $sym199$GET_WHICH_PLANS, $sym13$SHOP_BASIC_PLAN_STATE, $list49, NIL, $list200 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym199$GET_WHICH_PLANS, $sym203$SHOP_BASIC_PLAN_STATE_GET_WHICH_PLANS_METHOD );
    methods.methods_incorporate_instance_method( $sym204$SIMPLE_SITUATION_PRED_, $sym13$SHOP_BASIC_PLAN_STATE, $list54, $list205, $list206 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym204$SIMPLE_SITUATION_PRED_, $sym210$SHOP_BASIC_PLAN_STATE_SIMPLE_SITUATION_PRED__METHOD );
    methods.methods_incorporate_instance_method( $sym211$SEEK_TOTAL_MBINDINGS, $sym13$SHOP_BASIC_PLAN_STATE, $list54, $list212, $list213 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym211$SEEK_TOTAL_MBINDINGS, $sym221$SHOP_BASIC_PLAN_STATE_SEEK_TOTAL_MBINDINGS_METHOD );
    methods.methods_incorporate_instance_method( $sym222$FIND_MBINDINGS, $sym13$SHOP_BASIC_PLAN_STATE, $list54, $list223, $list224 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym222$FIND_MBINDINGS, $sym225$SHOP_BASIC_PLAN_STATE_FIND_MBINDINGS_METHOD );
    methods.methods_incorporate_instance_method( $sym227$PARENT_TASK_, $sym13$SHOP_BASIC_PLAN_STATE, $list38, $list167, $list228 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym227$PARENT_TASK_, $sym230$SHOP_BASIC_PLAN_STATE_PARENT_TASK__METHOD );
    methods.methods_incorporate_instance_method( $sym231$EXPAND, $sym13$SHOP_BASIC_PLAN_STATE, $list49, NIL, $list232 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym231$EXPAND, $sym243$SHOP_BASIC_PLAN_STATE_EXPAND_METHOD );
    methods.methods_incorporate_instance_method( $sym244$EXPAND_COMPLEX, $sym13$SHOP_BASIC_PLAN_STATE, $list49, $list167, $list245 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym244$EXPAND_COMPLEX, $sym247$SHOP_BASIC_PLAN_STATE_EXPAND_COMPLEX_METHOD );
    methods.methods_incorporate_instance_method( $sym248$EXPAND_PRIMITIVE_PRECONDITIONS, $sym13$SHOP_BASIC_PLAN_STATE, $list49, $list167, $list249 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym248$EXPAND_PRIMITIVE_PRECONDITIONS, $sym250$SHOP_BASIC_PLAN_STATE_EXPAND_PRIMITIVE_PRECONDITIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym251$EXPAND_PRIMITIVE, $sym13$SHOP_BASIC_PLAN_STATE, $list54, $list167, $list252 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym251$EXPAND_PRIMITIVE, $sym262$SHOP_BASIC_PLAN_STATE_EXPAND_PRIMITIVE_METHOD );
    methods.methods_incorporate_instance_method( $sym263$APPLY_OPERATORS, $sym13$SHOP_BASIC_PLAN_STATE, $list38, $list264, $list265 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym263$APPLY_OPERATORS, $sym277$SHOP_BASIC_PLAN_STATE_APPLY_OPERATORS_METHOD );
    methods.methods_incorporate_instance_method( $sym278$APPLY_OPERATOR, $sym13$SHOP_BASIC_PLAN_STATE, $list54, $list279, $list280 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym278$APPLY_OPERATOR, $sym281$SHOP_BASIC_PLAN_STATE_APPLY_OPERATOR_METHOD );
    methods.methods_incorporate_instance_method( $sym282$APPLY_CONDITIONAL_OPERATOR, $sym13$SHOP_BASIC_PLAN_STATE, $list38, $list279, $list283 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym282$APPLY_CONDITIONAL_OPERATOR, $sym287$SHOP_BASIC_PLAN_STATE_APPLY_CONDITIONAL_OPERATOR_METHOD );
    methods.methods_incorporate_instance_method( $sym288$UNIFY_PLANNER_RULE, $sym13$SHOP_BASIC_PLAN_STATE, $list54, $list289, $list290 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym288$UNIFY_PLANNER_RULE, $sym296$SHOP_BASIC_PLAN_STATE_UNIFY_PLANNER_RULE_METHOD );
    methods.methods_incorporate_instance_method( $sym297$APPLY_ALL_METHODS, $sym13$SHOP_BASIC_PLAN_STATE, $list54, $list167, $list298 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym297$APPLY_ALL_METHODS, $sym303$SHOP_BASIC_PLAN_STATE_APPLY_ALL_METHODS_METHOD );
    methods.methods_incorporate_instance_method( $sym304$APPLY_METHOD, $sym13$SHOP_BASIC_PLAN_STATE, $list54, $list305, $list306 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym304$APPLY_METHOD, $sym314$SHOP_BASIC_PLAN_STATE_APPLY_METHOD_METHOD );
    methods.methods_incorporate_instance_method( $sym315$APPLY_ALL_SUFFICIENT_CONDITIONS, $sym13$SHOP_BASIC_PLAN_STATE, $list54, $list167, $list316 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym315$APPLY_ALL_SUFFICIENT_CONDITIONS, $sym321$SHOP_BASIC_PLAN_STATE_APPLY_ALL_SUFFICIENT_CONDITIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym322$APPLY_SUFFICIENT_CONDITION, $sym13$SHOP_BASIC_PLAN_STATE, $list54, $list323, $list324 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym322$APPLY_SUFFICIENT_CONDITION, $sym327$SHOP_BASIC_PLAN_STATE_APPLY_SUFFICIENT_CONDITION_METHOD );
    methods.methods_incorporate_instance_method( $sym328$APPLY_ALL_PRECONDITIONS, $sym13$SHOP_BASIC_PLAN_STATE, $list38, $list167, $list329 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym328$APPLY_ALL_PRECONDITIONS, $sym334$SHOP_BASIC_PLAN_STATE_APPLY_ALL_PRECONDITIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym335$APPLY_PRECONDITION, $sym13$SHOP_BASIC_PLAN_STATE, $list38, $list336, $list337 );
    methods.subloop_register_instance_method( $sym13$SHOP_BASIC_PLAN_STATE, $sym335$APPLY_PRECONDITION, $sym340$SHOP_BASIC_PLAN_STATE_APPLY_PRECONDITION_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_shop_basic_plan_state_file();
  }

  @Override
  public void initializeVariables()
  {
    init_shop_basic_plan_state_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_shop_basic_plan_state_file();
  }
  static
  {
    me = new shop_basic_plan_state();
    $shop_canonicalize_functionsP$ = null;
    $list0 = ConsesLow.list( makeSymbol( "LIST1" ), makeSymbol( "LIST2" ) );
    $sym1$CSETF = makeSymbol( "CSETF" );
    $sym2$APPEND = makeSymbol( "APPEND" );
    $list3 = ConsesLow.list( makeSymbol( "REQUIRED-VERBOSE-LEVEL" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym4$CLET = makeSymbol( "CLET" );
    $sym5$ENTRY = makeSymbol( "ENTRY" );
    $sym6$ASSOC = makeSymbol( "ASSOC" );
    $list7 = ConsesLow.list( makeSymbol( "*SHOP-VERBOSE-KEYS*" ) );
    $list8 = ConsesLow.list( ConsesLow.list( makeSymbol( "VERBOSE-MSG-LEVEL" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "ENTRY" ), ConsesLow.list( makeSymbol( "REST" ), makeSymbol( "ENTRY" ) ), ZERO_INTEGER ) ),
        ConsesLow.list( makeSymbol( "VERBOSE-THREAD-LEVEL" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "LOG" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VERBOSE" ) ) ) ) );
    $sym9$PWHEN = makeSymbol( "PWHEN" );
    $list10 = ConsesLow.list( makeSymbol( ">=" ), makeSymbol( "VERBOSE-THREAD-LEVEL" ), makeSymbol( "VERBOSE-MSG-LEVEL" ) );
    $sym11$SHOP_PLAN_STATE = makeSymbol( "SHOP-PLAN-STATE" );
    $list12 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EXPAND" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "APPLY-METHOD" ), ConsesLow.list( makeSymbol( "TASK" ), makeSymbol( "METHOD" ) ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "APPLY-OPERATOR" ), ConsesLow.list(
            makeSymbol( "TASK" ), makeSymbol( "OPERATOR" ) ), makeKeyword( "PRIVATE" ) ) );
    $sym13$SHOP_BASIC_PLAN_STATE = makeSymbol( "SHOP-BASIC-PLAN-STATE" );
    $sym14$OBJECT = makeSymbol( "OBJECT" );
    $list15 = ConsesLow.list( makeSymbol( "SHOP-PLAN-STATE" ) );
    $list16 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "WORLD-STATE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "TASKLIST" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "MBINDINGS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "TASK-STRUCS" ), makeKeyword( "INSTANCE" ), makeKeyword(
            "PUBLIC" ) ), ConsesLow.list( makeSymbol( "SUPPORTS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "PARTIAL-PLAN" ), makeKeyword( "INSTANCE" ), makeKeyword(
                "PUBLIC" ) ), ConsesLow.list( makeSymbol( "POST-ORDERING" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "QUERY-PROPERTIES" ), makeKeyword( "INSTANCE" ), makeKeyword(
                    "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEPTH" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "PREVIOUS-STATES" ), makeKeyword( "INSTANCE" ), makeKeyword(
                        "PUBLIC" ) ), ConsesLow.list( makeSymbol( "PLANNER" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LOG" ), makeKeyword( "INSTANCE" ), makeKeyword(
                            "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DOMAIN" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "MODEL-MT" ), makeKeyword( "INSTANCE" ),
                                makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DYNAMIC-PREDICATES" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ),
                                    makeSymbol( "APPLICABLE-MULTIBINDING" ), ConsesLow.list( makeSymbol( "MBIND" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                        "GET-PLANNER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-PLANNER" ), ConsesLow.list( makeSymbol( "P" ) ), makeKeyword(
                                            "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                                                "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE-PLAN-STATE-WITH-PROBLEM" ), ConsesLow.list( makeSymbol( "PROBLEM" ), makeSymbol( "PLANNER-THREAD" ) ), makeKeyword(
                                                    "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INIT-MODEL-WITH-PROBLEM" ), ConsesLow.list( makeSymbol( "PROBLEM" ) ), makeKeyword(
                                                        "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE-MULTIBINDINGS" ), NIL, makeKeyword( "PRIVATE" ) ), ConsesLow.list(
                                                            makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CREATE-NEXT" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                                                makeSymbol( "GET-WORLD-STATE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-WORLD-STATE" ),
                                                                    ConsesLow.list( makeSymbol( "S" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "MULTIBINDINGS" ),
                                                                        NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-MULTIBINDINGS" ), ConsesLow.list( makeSymbol(
                                                                            "MBIND" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DEPTH" ), NIL, makeKeyword(
                                                                                "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-DEPTH" ), ConsesLow.list( makeSymbol( "D" ) ),
                                                                                    makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-TASKLIST" ), NIL, makeKeyword(
                                                                                        "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-TASKLIST" ), ConsesLow.list( makeSymbol(
                                                                                            "TASKS" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                                                                "GET-PREVIOUS-STATES" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                                                                    "SET-PREVIOUS-STATES" ), ConsesLow.list( makeSymbol( "TASKS" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list(
                                                                                                        makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-TO-PREVIOUS-STATES" ), ConsesLow.list( makeSymbol(
                                                                                                            "STATE" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                                                                                                "ADD-TO-MBINDINGS" ), ConsesLow.list( makeSymbol( "BINDING" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                                                                                                                    makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PARTIAL-PLAN" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-PARTIAL-PLAN" ), ConsesLow.list( makeSymbol( "P" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
          makeSymbol( "ADD-TO-POST-ORDERING" ), ConsesLow.list( T ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EXPAND-COMPLEX" ), ConsesLow.list( makeSymbol(
              "TASK" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EXPAND-PRIMITIVE" ), ConsesLow.list( makeSymbol( "TASK" ) ), makeKeyword( "PROTECTED" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "EXPAND-PRIMITIVE-PRECONDITIONS" ), ConsesLow.list( makeSymbol( "TASK" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
          "DEF-INSTANCE-METHOD" ), makeSymbol( "FIND-MBINDINGS" ), ConsesLow.list( makeSymbol( "GOALS" ), makeSymbol( "MBINDING" ) ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
              makeSymbol( "SEEK-TOTAL-MBINDINGS" ), ConsesLow.list( makeSymbol( "GOALS" ), makeSymbol( "MBIND" ) ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                  "APPLY-CONDITIONAL-OPERATOR" ), ConsesLow.list( makeSymbol( "TASK" ), makeSymbol( "OPERATOR" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                      "APPLY-OPERATOR" ), ConsesLow.list( makeSymbol( "TASK" ), makeSymbol( "OPERATOR" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                          "APPLY-OPERATORS" ), ConsesLow.list( makeSymbol( "TASK" ), makeSymbol( "OPERATORS" ), makeSymbol( "COND-OPERATORS" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                              "DEF-INSTANCE-METHOD" ), makeSymbol( "PARENT-TASK?" ), ConsesLow.list( makeSymbol( "TASK" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                  "COPY" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "APPLY-SUFFICIENT-CONDITION" ), ConsesLow.list( makeSymbol( "TASK" ),
                                      makeSymbol( "SCOND" ) ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "APPLY-ALL-SUFFICIENT-CONDITIONS" ), ConsesLow.list( makeSymbol(
                                          "TASK" ) ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "APPLY-ALL-METHODS" ), ConsesLow.list( makeSymbol( "TASK" ) ),
                                              makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "APPLY-ALL-PRECONDITIONS" ), ConsesLow.list( makeSymbol( "TASK" ) ), makeKeyword(
                                                  "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "APPLY-PRECONDITION" ), ConsesLow.list( makeSymbol( "TASK" ), makeSymbol( "PRECOND" ) ),
                                                      makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-WHICH-PLANS" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym17$DYNAMIC_PREDICATES = makeSymbol( "DYNAMIC-PREDICATES" );
    $sym18$MODEL_MT = makeSymbol( "MODEL-MT" );
    $sym19$DOMAIN = makeSymbol( "DOMAIN" );
    $sym20$LOG = makeSymbol( "LOG" );
    $sym21$PLANNER = makeSymbol( "PLANNER" );
    $sym22$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym23$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_STATE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-STATE-CLASS" );
    $sym24$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym25$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym26$WORLD_STATE = makeSymbol( "WORLD-STATE" );
    $sym27$TASKLIST = makeSymbol( "TASKLIST" );
    $sym28$MBINDINGS = makeSymbol( "MBINDINGS" );
    $sym29$TASK_STRUCS = makeSymbol( "TASK-STRUCS" );
    $sym30$SUPPORTS = makeSymbol( "SUPPORTS" );
    $sym31$PARTIAL_PLAN = makeSymbol( "PARTIAL-PLAN" );
    $sym32$POST_ORDERING = makeSymbol( "POST-ORDERING" );
    $sym33$QUERY_PROPERTIES = makeSymbol( "QUERY-PROPERTIES" );
    $sym34$DEPTH = makeSymbol( "DEPTH" );
    $sym35$PREVIOUS_STATES = makeSymbol( "PREVIOUS-STATES" );
    $sym36$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_STATE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-STATE-INSTANCE" );
    $sym37$APPLICABLE_MULTIBINDING = makeSymbol( "APPLICABLE-MULTIBINDING" );
    $list38 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list39 = ConsesLow.list( makeSymbol( "MBIND" ) );
    $list40 = ConsesLow.list( makeString( "@param MBIND multibinding-p\n   @return multibinding-p ;; MBIND that is possibly reduced to only functional bindings." ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol(
        "*SHOP-USE-MULTIBINDINGS?*" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "COPY-LIST" ), ConsesLow.list( makeSymbol( "MB-SIMPLE-BINDING" ), makeSymbol( "MBIND" ) ) ) ), ConsesLow.list(
            makeSymbol( "RET" ), makeSymbol( "MBIND" ) ) ) );
    $sym41$SHOP_BASIC_PLAN_STATE_APPLICABLE_MULTIBINDING_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-APPLICABLE-MULTIBINDING-METHOD" );
    $sym42$SET_TASKLIST = makeSymbol( "SET-TASKLIST" );
    $list43 = ConsesLow.list( makeSymbol( "TASKS" ) );
    $list44 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "TASKS" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TASKLIST" ), makeSymbol( "TASKS" ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TASKS" ) ) );
    $sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym46$LISTP = makeSymbol( "LISTP" );
    $sym47$SHOP_BASIC_PLAN_STATE_SET_TASKLIST_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-SET-TASKLIST-METHOD" );
    $sym48$GET_TASKLIST = makeSymbol( "GET-TASKLIST" );
    $list49 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list50 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TASKLIST" ) ) );
    $sym51$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym52$SHOP_BASIC_PLAN_STATE_GET_TASKLIST_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-GET-TASKLIST-METHOD" );
    $sym53$ADD_DECOMPOSITION = makeSymbol( "ADD-DECOMPOSITION" );
    $list54 = ConsesLow.list( makeKeyword( "PRIVATE" ) );
    $list55 = ConsesLow.list( makeSymbol( "TASK" ), makeSymbol( "DECOMPOSITION" ) );
    $list56 = ConsesLow.list( makeString(
        "Replaces first element of slot TASKLIST with DECOMPOSITION, and a SUPERTASK \n   (for the plan tree post-order) of TASK. The SUPERTASK signals to the bookkeeping code\n   that a complete branch of the tree has been planned, and we can now plan other\n   branches." ),
        ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TASKLIST" ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol( "DECOMPOSITION" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), ConsesLow.list( makeSymbol(
            "BQ-LIST" ), makeKeyword( "SUPERTASK" ), makeSymbol( "TASK" ) ) ), makeSymbol( "TASKLIST" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TASKLIST" ) ) );
    $sym57$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $kw58$SUPERTASK = makeKeyword( "SUPERTASK" );
    $sym59$SHOP_BASIC_PLAN_STATE_ADD_DECOMPOSITION_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-ADD-DECOMPOSITION-METHOD" );
    $sym60$SET_MULTIBINDINGS = makeSymbol( "SET-MULTIBINDINGS" );
    $list61 = ConsesLow.list( makeSymbol( "MBINDING" ) );
    $list62 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MBINDINGS" ), makeSymbol( "MBINDING" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MBINDINGS" ) ) );
    $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym64$SHOP_BASIC_PLAN_STATE_SET_MULTIBINDINGS_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-SET-MULTIBINDINGS-METHOD" );
    $sym65$MULTIBINDINGS = makeSymbol( "MULTIBINDINGS" );
    $list66 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MBINDINGS" ) ) );
    $sym67$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym68$SHOP_BASIC_PLAN_STATE_MULTIBINDINGS_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-MULTIBINDINGS-METHOD" );
    $sym69$SET_DOMAIN = makeSymbol( "SET-DOMAIN" );
    $list70 = ConsesLow.list( makeSymbol( "NEW-DOMAIN" ) );
    $list71 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DOMAIN" ), makeSymbol( "NEW-DOMAIN" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DOMAIN" ) ) );
    $sym72$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym73$SHOP_BASIC_PLAN_STATE_SET_DOMAIN_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-SET-DOMAIN-METHOD" );
    $sym74$GET_DOMAIN = makeSymbol( "GET-DOMAIN" );
    $list75 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DOMAIN" ) ) );
    $sym76$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym77$SHOP_BASIC_PLAN_STATE_GET_DOMAIN_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-GET-DOMAIN-METHOD" );
    $sym78$SUPPORT_LISTS = makeSymbol( "SUPPORT-LISTS" );
    $list79 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SUPPORTS" ) ) );
    $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym81$SHOP_BASIC_PLAN_STATE_SUPPORT_LISTS_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-SUPPORT-LISTS-METHOD" );
    $sym82$ADD_TO_SUPPORT_LISTS = makeSymbol( "ADD-TO-SUPPORT-LISTS" );
    $list83 = ConsesLow.list( makeSymbol( "PRECOND" ) );
    $list84 = ConsesLow.list( ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "PRECOND" ), makeSymbol( "SUPPORTS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SUPPORTS" ) ) );
    $sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym86$SHOP_BASIC_PLAN_STATE_ADD_TO_SUPPORT_LISTS_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-ADD-TO-SUPPORT-LISTS-METHOD" );
    $sym87$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list88 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SUPPORTS" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ),
        makeSymbol( "MBINDINGS" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "POST-ORDERING" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TASK-STRUCS" ), NIL ), ConsesLow.list(
            makeSymbol( "CSETQ" ), makeSymbol( "DEPTH" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym90$SHOP_BASIC_PLAN_STATE_INITIALIZE_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-INITIALIZE-METHOD" );
    $sym91$INITIALIZE_PLAN_STATE_WITH_PROBLEM = makeSymbol( "INITIALIZE-PLAN-STATE-WITH-PROBLEM" );
    $list92 = ConsesLow.list( makeKeyword( "NO-MEMBER-VARIABLES" ), makeKeyword( "PUBLIC" ) );
    $list93 = ConsesLow.list( makeSymbol( "PROBLEM" ), makeSymbol( "PLANNER-THREAD" ) );
    $list94 = ConsesLow.list( makeString( "@param PROBLEM         shop-basic-problem-p\n   @param PLANNER-THREAD  shop-basic-planner-thread-p\n   @return nil" ), ConsesLow.list( new SubLObject[] { makeSymbol( "CLET" ),
      ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-TASKS" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-TASKS" ), makeSymbol( "SHOP-BASIC-PROBLEM" ) ), makeSymbol(
          "PROBLEM" ) ) ), ConsesLow.list( makeSymbol( "NEW-WORLD-STATE" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-STATE" ), makeSymbol( "SHOP-BASIC-PROBLEM" ) ), makeSymbol(
              "PROBLEM" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEW-TASKS" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "REPLACE-VARIABLES" ), makeSymbol(
                  "SHOP-VARIABLE-MANAGER" ) ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "PLANNER-THREAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VAR-MANAGER" ) ) ), makeSymbol( "NEW-TASKS" ),
                  ConsesLow.list( makeSymbol( "EMPTY-MB" ) ) ) ), ConsesLow.list( makeSymbol( "SET-DOMAIN" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "PROBLEM" ), ConsesLow.list(
                      makeSymbol( "QUOTE" ), makeSymbol( "DOMAIN" ) ) ) ), ConsesLow.list( makeSymbol( "SET-TASKLIST" ), makeSymbol( "SELF" ), makeSymbol( "NEW-TASKS" ) ), ConsesLow.list( makeSymbol( "SET-WORLD-STATE" ),
                          makeSymbol( "SELF" ), makeSymbol( "NEW-WORLD-STATE" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LOG" ) ), ConsesLow
                              .list( makeSymbol( "GET-SLOT" ), makeSymbol( "PLANNER-THREAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LOG" ) ) ) ), ConsesLow.list( makeSymbol( "SET-PLANNER" ), makeSymbol(
                                  "SELF" ), makeSymbol( "PLANNER-THREAD" ) ), ConsesLow.list( makeSymbol( "INIT-MODEL-WITH-PROBLEM" ), makeSymbol( "SELF" ), makeSymbol( "PROBLEM" ) ), ConsesLow.list( makeSymbol(
                                      "INITIALIZE-MULTIBINDINGS" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                          "QUERY-PROPERTIES" ) ), ConsesLow.list( makeSymbol( "SHOP-QUERY-PROPERTIES" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol(
                                              "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLANNER" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TIME-CUTOFF" ) ) ), ConsesLow.list(
                                                  makeSymbol( "GET-SLOT" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLANNER" ) ) ), ConsesLow
                                                      .list( makeSymbol( "QUOTE" ), makeSymbol( "NUM-BACKCHAINS" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) )
    } ) );
    $sym95$VAR_MANAGER = makeSymbol( "VAR-MANAGER" );
    $sym96$TIME_CUTOFF = makeSymbol( "TIME-CUTOFF" );
    $sym97$NUM_BACKCHAINS = makeSymbol( "NUM-BACKCHAINS" );
    $sym98$SHOP_BASIC_PLAN_STATE_INITIALIZE_PLAN_STATE_WITH_PROBLEM_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-INITIALIZE-PLAN-STATE-WITH-PROBLEM-METHOD" );
    $sym99$INITIALIZE_MULTIBINDINGS = makeSymbol( "INITIALIZE-MULTIBINDINGS" );
    $list100 = ConsesLow.list( makeKeyword( "NO-MEMBER-VARIABLES" ), makeKeyword( "PRIVATE" ) );
    $list101 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TASKLIST" ), ConsesLow.list( makeSymbol( "GET-TASKLIST" ), makeSymbol( "SELF" ) ) ), ConsesLow.list(
        makeSymbol( "MBINDING" ), NIL ), ConsesLow.list( makeSymbol( "MT" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "MODEL-MT" ) ) ) ) ),
        ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "GROUND?" ), makeSymbol( "TASKLIST" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MBINDING" ), ConsesLow.list( makeSymbol(
            "EMPTY-MB" ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "SINGLETON?" ), makeSymbol( "TASKLIST" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MBINDING" ), ConsesLow.list(
                makeSymbol( "SHOP-INITIAL-MULTIBINDING-FOR-TASK" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "TASKLIST" ) ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeSymbol( "WARN" ), makeString(
                    "INITIALIZE-MULTIBINGINGS: Initial Tasklist contains more than one task." ) ) ) ), ConsesLow.list( makeSymbol( "SET-MULTIBINDINGS" ), makeSymbol( "SELF" ), makeSymbol( "MBINDING" ) ), ConsesLow.list(
                        makeSymbol( "RET" ), makeSymbol( "MBINDING" ) ) ) );
    $str102$INITIALIZE_MULTIBINGINGS__Initial = makeString( "INITIALIZE-MULTIBINGINGS: Initial Tasklist contains more than one task." );
    $sym103$SHOP_BASIC_PLAN_STATE_INITIALIZE_MULTIBINDINGS_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-INITIALIZE-MULTIBINDINGS-METHOD" );
    $sym104$OUTPUT_MESSAGE = makeSymbol( "OUTPUT-MESSAGE" );
    $list105 = ConsesLow.list( makeSymbol( "STRING" ) );
    $list106 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "LOG-ENTRY" ), makeSymbol( "SHOP-LOG" ) ), makeSymbol( "LOG" ), makeSymbol(
        "STRING" ) ) ) );
    $sym107$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym108$SHOP_BASIC_PLAN_STATE_OUTPUT_MESSAGE_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-OUTPUT-MESSAGE-METHOD" );
    $sym109$COPY = makeSymbol( "COPY" );
    $list110 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-PLAN-STATE" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ),
        makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ) ) ), ConsesLow.list( makeSymbol( "OBJECT-SLOTS" ), ConsesLow.list( makeSymbol(
            "CLASSES-ALL-SLOTS" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "OBJECT" ) ) ) ), ConsesLow.list( makeSymbol( "SLOT-LIST" ), ConsesLow.list( makeSymbol( "SET-DIFFERENCE" ), ConsesLow.list(
                makeSymbol( "CLASSES-ALL-SLOTS" ), ConsesLow.list( makeSymbol( "INSTANCE-CLASS" ), makeSymbol( "SELF" ) ) ), makeSymbol( "OBJECT-SLOTS" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
                    makeSymbol( "CUR-SLOT" ), makeSymbol( "SLOT-LIST" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "NEW-PLAN-STATE" ), makeSymbol( "CUR-SLOT" ), ConsesLow.list( makeSymbol( "GET-SLOT" ),
                        makeSymbol( "SELF" ), makeSymbol( "CUR-SLOT" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-PLAN-STATE" ) ) ) );
    $sym111$SHOP_BASIC_PLAN_STATE_COPY_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-COPY-METHOD" );
    $sym112$CREATE_NEXT = makeSymbol( "CREATE-NEXT" );
    $list113 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-STATE" ), ConsesLow.list( makeSymbol( "COPY" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list(
        makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "SET-TASKLIST" ), makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ), makeSymbol( "NEW-STATE" ), ConsesLow.list( makeSymbol( "REST" ), makeSymbol( "TASKLIST" ) ) ),
        ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "SET-DEPTH" ), makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ), makeSymbol( "NEW-STATE" ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol(
            "DEPTH" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-STATE" ) ) ) );
    $sym114$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym115$SHOP_BASIC_PLAN_STATE_CREATE_NEXT_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-CREATE-NEXT-METHOD" );
    $sym116$INIT_MODEL_WITH_PROBLEM = makeSymbol( "INIT-MODEL-WITH-PROBLEM" );
    $list117 = ConsesLow.list( makeSymbol( "PROBLEM" ) );
    $list118 = ConsesLow.list( makeString( "@param PROBLEM shop-basic-problem-p\n   @return nil" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TASK-MT" ), ConsesLow.list(
        makeSymbol( "GET-SLOT" ), makeSymbol( "PROBLEM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "TASK-MT" ) ) ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list(
            makeSymbol( "QUOTE" ), makeSymbol( "MODEL-MT" ) ), makeSymbol( "TASK-MT" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym119$TASK_MT = makeSymbol( "TASK-MT" );
    $sym120$SHOP_BASIC_PLAN_STATE_INIT_MODEL_WITH_PROBLEM_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-INIT-MODEL-WITH-PROBLEM-METHOD" );
    $sym121$SET_WORLD_STATE = makeSymbol( "SET-WORLD-STATE" );
    $list122 = ConsesLow.list( makeSymbol( "S" ) );
    $list123 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SHOP-WORLD-STATE-P" ), makeSymbol( "S" ) ), makeString( "(SET-WORLD-STATE ~s): ~S is not a valid SHOP-WORLD-STATE-P." ),
        makeSymbol( "SELF" ), makeSymbol( "S" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "WORLD-STATE" ), makeSymbol( "S" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "S" ) ) );
    $sym124$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $str125$_SET_WORLD_STATE__s____S_is_not_a = makeString( "(SET-WORLD-STATE ~s): ~S is not a valid SHOP-WORLD-STATE-P." );
    $sym126$SHOP_BASIC_PLAN_STATE_SET_WORLD_STATE_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-SET-WORLD-STATE-METHOD" );
    $sym127$GET_WORLD_STATE = makeSymbol( "GET-WORLD-STATE" );
    $list128 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "WORLD-STATE" ) ) );
    $sym129$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym130$SHOP_BASIC_PLAN_STATE_GET_WORLD_STATE_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-GET-WORLD-STATE-METHOD" );
    $sym131$MBINDING = makeSymbol( "MBINDING" );
    $sym132$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym133$SHOP_BASIC_PLAN_STATE_MBINDING_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-MBINDING-METHOD" );
    $sym134$SET_DEPTH = makeSymbol( "SET-DEPTH" );
    $list135 = ConsesLow.list( makeSymbol( "D" ) );
    $list136 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "D" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DEPTH" ), makeSymbol( "D" ) ), ConsesLow.list(
        makeSymbol( "RET" ), makeSymbol( "D" ) ) );
    $sym137$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym138$INTEGERP = makeSymbol( "INTEGERP" );
    $sym139$SHOP_BASIC_PLAN_STATE_SET_DEPTH_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-SET-DEPTH-METHOD" );
    $list140 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DEPTH" ) ) );
    $sym141$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym142$SHOP_BASIC_PLAN_STATE_DEPTH_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-DEPTH-METHOD" );
    $sym143$SET_PREVIOUS_STATES = makeSymbol( "SET-PREVIOUS-STATES" );
    $list144 = ConsesLow.list( makeSymbol( "STATES" ) );
    $list145 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PREVIOUS-STATES" ), makeSymbol( "STATES" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "STATES" ) ) );
    $sym146$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym147$SHOP_BASIC_PLAN_STATE_SET_PREVIOUS_STATES_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-SET-PREVIOUS-STATES-METHOD" );
    $sym148$GET_PREVIOUS_STATES = makeSymbol( "GET-PREVIOUS-STATES" );
    $list149 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PREVIOUS-STATES" ) ) );
    $sym150$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym151$SHOP_BASIC_PLAN_STATE_GET_PREVIOUS_STATES_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-GET-PREVIOUS-STATES-METHOD" );
    $sym152$ADD_TO_PREVIOUS_STATES = makeSymbol( "ADD-TO-PREVIOUS-STATES" );
    $list153 = ConsesLow.list( makeSymbol( "STATE" ) );
    $list154 = ConsesLow.list( ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "STATE" ), makeSymbol( "PREVIOUS-STATES" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PREVIOUS-STATES" ) ) );
    $sym155$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym156$SHOP_BASIC_PLAN_STATE_ADD_TO_PREVIOUS_STATES_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-ADD-TO-PREVIOUS-STATES-METHOD" );
    $sym157$SET_PARTIAL_PLAN = makeSymbol( "SET-PARTIAL-PLAN" );
    $list158 = ConsesLow.list( makeSymbol( "P" ) );
    $list159 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PARTIAL-PLAN" ), makeSymbol( "P" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "P" ) ) );
    $sym160$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym161$SHOP_BASIC_PLAN_STATE_SET_PARTIAL_PLAN_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-SET-PARTIAL-PLAN-METHOD" );
    $sym162$GET_PARTIAL_PLAN = makeSymbol( "GET-PARTIAL-PLAN" );
    $list163 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PARTIAL-PLAN" ) ) );
    $sym164$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym165$SHOP_BASIC_PLAN_STATE_GET_PARTIAL_PLAN_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-GET-PARTIAL-PLAN-METHOD" );
    $sym166$ADD_TO_PARTIAL_PLAN = makeSymbol( "ADD-TO-PARTIAL-PLAN" );
    $list167 = ConsesLow.list( makeSymbol( "TASK" ) );
    $list168 = ConsesLow.list( ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "TASK" ), makeSymbol( "PARTIAL-PLAN" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PARTIAL-PLAN" ) ) );
    $sym169$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym170$SHOP_BASIC_PLAN_STATE_ADD_TO_PARTIAL_PLAN_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-ADD-TO-PARTIAL-PLAN-METHOD" );
    $sym171$ADD_TO_POST_ORDERING = makeSymbol( "ADD-TO-POST-ORDERING" );
    $list172 = ConsesLow.list( ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "TASK" ), makeSymbol( "POST-ORDERING" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "POST-ORDERING" ) ) );
    $sym173$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym174$SHOP_BASIC_PLAN_STATE_ADD_TO_POST_ORDERING_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-ADD-TO-POST-ORDERING-METHOD" );
    $sym175$ADD_TO_MBINDINGS = makeSymbol( "ADD-TO-MBINDINGS" );
    $list176 = ConsesLow.list( makeSymbol( "BINDING" ) );
    $list177 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MBINDINGS" ), ConsesLow.list( makeSymbol( "COMPOSE-MULTIBINDINGS" ), makeSymbol( "BINDING" ), makeSymbol( "MBINDINGS" ) ) ), ConsesLow
        .list( makeSymbol( "RET" ), makeSymbol( "MBINDINGS" ) ) );
    $sym178$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym179$SHOP_BASIC_PLAN_STATE_ADD_TO_MBINDINGS_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-ADD-TO-MBINDINGS-METHOD" );
    $sym180$PLANNER_RULES = makeSymbol( "PLANNER-RULES" );
    $list181 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TASK-STRUCS" ) ) );
    $sym182$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym183$SHOP_BASIC_PLAN_STATE_PLANNER_RULES_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-PLANNER-RULES-METHOD" );
    $sym184$ADD_TO_TASK_STRUCS = makeSymbol( "ADD-TO-TASK-STRUCS" );
    $list185 = ConsesLow.list( makeSymbol( "TASK-STRUC" ) );
    $list186 = ConsesLow.list( ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "TASK-STRUC" ), makeSymbol( "TASK-STRUCS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TASK-STRUCS" ) ) );
    $sym187$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym188$SHOP_BASIC_PLAN_STATE_ADD_TO_TASK_STRUCS_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-ADD-TO-TASK-STRUCS-METHOD" );
    $sym189$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym190$SHOP_BASIC_PLAN_STATE_TASK_STRUCS_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-TASK-STRUCS-METHOD" );
    $sym191$GET_PLANNER = makeSymbol( "GET-PLANNER" );
    $list192 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PLANNER" ) ) );
    $sym193$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym194$SHOP_BASIC_PLAN_STATE_GET_PLANNER_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-GET-PLANNER-METHOD" );
    $sym195$SET_PLANNER = makeSymbol( "SET-PLANNER" );
    $list196 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PLANNER" ), makeSymbol( "P" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "P" ) ) );
    $sym197$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym198$SHOP_BASIC_PLAN_STATE_SET_PLANNER_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-SET-PLANNER-METHOD" );
    $sym199$GET_WHICH_PLANS = makeSymbol( "GET-WHICH-PLANS" );
    $list200 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), makeSymbol( "PLANNER" ), makeString( "(GET-WHICH-PLANS ~S): No planner associated with this plan-state." ), makeSymbol( "SELF" ) ), ConsesLow.list(
        makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-WHICH-PLANS" ), makeSymbol( "SHOP-BASIC-PLANNER-THREAD" ) ), makeSymbol( "PLANNER" ) ) ) );
    $sym201$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $str202$_GET_WHICH_PLANS__S___No_planner_ = makeString( "(GET-WHICH-PLANS ~S): No planner associated with this plan-state." );
    $sym203$SHOP_BASIC_PLAN_STATE_GET_WHICH_PLANS_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-GET-WHICH-PLANS-METHOD" );
    $sym204$SIMPLE_SITUATION_PRED_ = makeSymbol( "SIMPLE-SITUATION-PRED?" );
    $list205 = ConsesLow.list( makeSymbol( "PRED" ) );
    $list206 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PRED-SET" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "DOMAIN" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "SIMPLE-SITUATION-PREDS" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "SET-MEMBER?" ), makeSymbol( "PRED" ), makeSymbol( "PRED-SET" ) ), ConsesLow.list(
            makeSymbol( "RET" ), T ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "ISA?" ), makeSymbol( "PRED" ), constant_handles.reader_make_constant_shell( makeString(
                "SimpleSituationPredicate" ) ), makeSymbol( "MODEL-MT" ) ), ConsesLow.list( makeSymbol( "SET-ADD" ), makeSymbol( "PRED" ), makeSymbol( "PRED-SET" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ), ConsesLow
                    .list( makeSymbol( "RET" ), NIL ) ) );
    $sym207$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym208$SIMPLE_SITUATION_PREDS = makeSymbol( "SIMPLE-SITUATION-PREDS" );
    $const209$SimpleSituationPredicate = constant_handles.reader_make_constant_shell( makeString( "SimpleSituationPredicate" ) );
    $sym210$SHOP_BASIC_PLAN_STATE_SIMPLE_SITUATION_PRED__METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-SIMPLE-SITUATION-PRED?-METHOD" );
    $sym211$SEEK_TOTAL_MBINDINGS = makeSymbol( "SEEK-TOTAL-MBINDINGS" );
    $list212 = ConsesLow.list( makeSymbol( "GOALS" ), makeSymbol( "MBIND" ) );
    $list213 = ConsesLow.list( makeString( "@param GOALS listp\n   @param MBIND multibinding-p\n   @return listp ;; of mulibinding-p" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NULL" ),
        makeSymbol( "GOALS" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "MBIND" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
            "BACKCHAIN" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "PLANNER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NUM-BACKCHAINS" ) ) ) ), makeSymbol( "BINDINGS" ), makeSymbol(
                "MBINDINGS" ), makeSymbol( "HALT-REASON" ), makeSymbol( "INFERENCE" ) ), ConsesLow.list( makeSymbol( "WITHOUT-WFF-SEMANTICS" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
                    makeSymbol( "*GENERATE-READABLE-FI-RESULTS*" ), NIL ), ConsesLow.list( makeSymbol( "*CHECK-ARITY?*" ), T ), ConsesLow.list( makeSymbol( "*CHECK-WFF-CONSTANTS?*" ), NIL ), ConsesLow.list( makeSymbol(
                        "*SIMPLIFY-SENTENCE?*" ), NIL ), ConsesLow.list( makeSymbol( "*TURN-EXISTENTIALS-INTO-SKOLEMS?*" ), NIL ), ConsesLow.list( makeSymbol( "*CANONICALIZE-LITERALS?*" ), NIL ), ConsesLow.list(
                            makeSymbol( "*CANONICALIZE-FUNCTIONS?*" ), makeSymbol( "*SHOP-CANONICALIZE-FUNCTIONS?*" ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "*SHOP-USE-MT-WORLD-STATES?*" ), ConsesLow.list(
                                makeSymbol( "CSETQ" ), makeSymbol( "BINDINGS" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ASK" ), makeSymbol( "SHOP-MT-WORLD-STATE" ) ), makeSymbol(
                                    "WORLD-STATE" ), ConsesLow.list( makeSymbol( "CONS" ), constant_handles.reader_make_constant_shell( makeString( "and" ) ), makeSymbol( "GOALS" ) ), makeSymbol( "MBIND" ), makeSymbol(
                                        "BACKCHAIN" ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "WITH-QUERY-PLAN-STATE" ), ConsesLow.list( makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol(
                                            "PIF" ), makeSymbol( "*SHOP-USE-SHOP-ASK?*" ), ConsesLow.list( makeSymbol( "CMULTIPLE-VALUE-SETQ" ), ConsesLow.list( makeSymbol( "BINDINGS" ), makeSymbol( "HALT-REASON" ),
                                                makeSymbol( "INFERENCE" ) ), ConsesLow.list( makeSymbol( "SHOP-ASK-INT" ), ConsesLow.list( makeSymbol( "CONS" ), constant_handles.reader_make_constant_shell( makeString(
                                                    "and" ) ), makeSymbol( "GOALS" ) ), makeSymbol( "MODEL-MT" ), makeSymbol( "QUERY-PROPERTIES" ) ) ), ConsesLow.list( makeSymbol( "CMULTIPLE-VALUE-SETQ" ), ConsesLow
                                                        .list( makeSymbol( "BINDINGS" ), makeSymbol( "HALT-REASON" ), makeSymbol( "INFERENCE" ) ), ConsesLow.list( makeSymbol( "NEW-CYC-QUERY" ), ConsesLow.list(
                                                            makeSymbol( "CONS" ), constant_handles.reader_make_constant_shell( makeString( "and" ) ), makeSymbol( "GOALS" ) ), makeSymbol( "MODEL-MT" ), makeSymbol(
                                                                "QUERY-PROPERTIES" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "BINDINGS" ), ConsesLow.list( makeSymbol(
                                                                    "CONFIRM-BINDINGS-AGAINST-WORLD-STATE" ), makeSymbol( "WORLD-STATE" ), makeSymbol( "GOALS" ), makeSymbol( "BINDINGS" ) ) ) ) ) ) ), ConsesLow.list(
                                                                        makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ADD-INFERENCE" ), makeSymbol( "SHOP-STATISTIC-MANAGER" ) ), ConsesLow.list( makeSymbol(
                                                                            "GET-SLOT" ), makeSymbol( "PLANNER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "STATS-MANAGER" ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                "WHEN-VERBOSE" ), makeKeyword( "CYC-QUERY" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol(
                                                                                    "QUOTE" ), makeSymbol( "LOG-INFERENCE" ) ), makeSymbol( "BINDINGS" ), makeSymbol( "HALT-REASON" ), makeSymbol( "INFERENCE" ) ) ),
            ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "*SHOP-USE-INFERENCE-SUPPORTS?*" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "BINDINGS" ), ConsesLow.list( makeSymbol( "PAIRLIS" ), makeSymbol(
                "BINDINGS" ), ConsesLow.list( makeSymbol( "MAKE-LIST" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeSymbol( "LIST" ), NIL ) ) ) ) ), ConsesLow.list(
                    makeSymbol( "PWHEN" ), makeSymbol( "BINDINGS" ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( EQUAL, ConsesLow.list( makeSymbol( "CAAR" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list(
                        makeSymbol( "QUOTE" ), ConsesLow.list( ConsesLow.cons( T, T ) ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MBINDINGS" ), ConsesLow.list(
                            makeSymbol( "LIST" ), makeSymbol( "MBIND" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "*MB-REIFY-NATS?*" ), NIL ) ), ConsesLow.list( makeSymbol(
                                "CSETQ" ), makeSymbol( "MBINDINGS" ), ConsesLow.list( makeSymbol( "CONVERT-BINDING-LISTS-AND-SUPPORTS-TO-MBINDS" ), makeSymbol( "BINDINGS" ), makeSymbol( "MBIND" ) ) ) ) ) ), ConsesLow
                                    .list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "MULTIBINDING-FAILED?" ), makeSymbol( "MBINDINGS" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ), ConsesLow.list( makeSymbol(
                                        "RET" ), makeSymbol( "MBINDINGS" ) ) ) ) );
    $sym214$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $const215$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $sym216$STATS_MANAGER = makeSymbol( "STATS-MANAGER" );
    $kw217$CYC_QUERY = makeKeyword( "CYC-QUERY" );
    $sym218$VERBOSE = makeSymbol( "VERBOSE" );
    $sym219$LOG_INFERENCE = makeSymbol( "LOG-INFERENCE" );
    $list220 = ConsesLow.list( ConsesLow.cons( T, T ) );
    $sym221$SHOP_BASIC_PLAN_STATE_SEEK_TOTAL_MBINDINGS_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-SEEK-TOTAL-MBINDINGS-METHOD" );
    $sym222$FIND_MBINDINGS = makeSymbol( "FIND-MBINDINGS" );
    $list223 = ConsesLow.list( makeSymbol( "GOALS" ), makeSymbol( "MBINDING" ) );
    $list224 = ConsesLow.list( makeString( "Returns a list of all satisfiers of GOALS from the current\n   WORLD-STATE." ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "*SHOP-INFER-COMPLETE-PRECONDITIONS?*" ),
        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "SEEK-TOTAL-MBINDINGS" ), makeSymbol( "SELF" ), makeSymbol( "GOALS" ), ConsesLow.list( makeSymbol( "COPY-MULTIBINDING" ), makeSymbol(
            "MBINDING" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym225$SHOP_BASIC_PLAN_STATE_FIND_MBINDINGS_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-FIND-MBINDINGS-METHOD" );
    $sym226$SHOP_SAME_TASK_ = makeSymbol( "SHOP-SAME-TASK?" );
    $sym227$PARENT_TASK_ = makeSymbol( "PARENT-TASK?" );
    $list228 = ConsesLow.list( makeString(
        "@param TASK hl-formula-p\n    @return booleanp\n    Return T if there exists an element of slot PARTIAL-PLAN which is\n    EQUAL to TASK and does not also occur in POST-ORDERING. This means\n    that TASK is decomposed from an equivalent task, and should be\n    removed if cycle checking is enabled." ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "POTENTIAL-LIST" ), makeSymbol( "PARTIAL-PLAN" ) ) ), ConsesLow.list( makeSymbol( "CDO" ), ConsesLow.list( ConsesLow.list(
            makeSymbol( "CUR-POTENTIALS" ), ConsesLow.list( makeSymbol( "SHOP-FIND-NEXT-MATCH" ), makeSymbol( "TASK" ), makeSymbol( "POTENTIAL-LIST" ) ), ConsesLow.list( makeSymbol( "SHOP-FIND-NEXT-MATCH" ), makeSymbol(
                "TASK" ), ConsesLow.list( makeSymbol( "REST" ), makeSymbol( "CUR-POTENTIALS" ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "CUR-POTENTIALS" ) ), ConsesLow.list( makeSymbol(
                    "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CUR-TASK" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "CUR-POTENTIALS" ) ) ) ), ConsesLow
                        .list( makeSymbol( "PWHEN" ), ConsesLow.list( EQUAL, makeSymbol( "TASK" ), makeSymbol( "CUR-TASK" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeSymbol(
                            "CUR-TASK" ), makeSymbol( "POST-ORDERING" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQ ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow
                                .list( ConsesLow.list( makeSymbol( "UNIFER" ), ConsesLow.list( makeSymbol( "SHOP-UNIFY" ), makeSymbol( "TASK" ), makeSymbol( "CUR-TASK" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ),
                                    ConsesLow.list( makeSymbol( "SHOP-UNIFY-FAILED?" ), makeSymbol( "UNIFER" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "*MB-REIFY-NATS?*" ),
                                        NIL ), ConsesLow.list( makeSymbol( "UNIFIER-MB" ), ConsesLow.list( makeSymbol( "CONVERT-BINDING-TO-MBIND" ), makeSymbol( "UNIFER" ), makeSymbol( "MBINDINGS" ) ) ) ), ConsesLow
                                            .list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "UNIFIER-MB" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
                                                makeSymbol( "INVERSE-MB" ), ConsesLow.list( makeSymbol( "MB-INVERSE" ), makeSymbol( "MBINDINGS" ), makeSymbol( "UNIFIER-MB" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ),
                                                    ConsesLow.list( makeSymbol( "SHOP-UNIFY-FAILED?" ), makeSymbol( "INVERSE-MB" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "MEMBER?" ),
                                                        makeSymbol( "CUR-TASK" ), makeSymbol( "POST-ORDERING" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQ ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ), ConsesLow
                                                            .list( makeSymbol( "CSETQ" ), makeSymbol( "MBINDINGS" ), makeSymbol( "INVERSE-MB" ) ) ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym229$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym230$SHOP_BASIC_PLAN_STATE_PARENT_TASK__METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-PARENT-TASK?-METHOD" );
    $sym231$EXPAND = makeSymbol( "EXPAND" );
    $list232 = ConsesLow.list( makeString( "expands a plan state by taking the first task of\n   the TASKLIST, if it is an operator call\n   APPLY-OPERATOR, otherwise call APPLY-METHOD." ), ConsesLow.list( makeSymbol(
        "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TASK1" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "TASKLIST" ) ) ), ConsesLow.list( makeSymbol( "TASKNAME" ), ConsesLow.list( makeSymbol(
            "FORMULA-OPERATOR" ), makeSymbol( "TASK1" ) ) ) ), ConsesLow.list( makeSymbol( "WHEN-VERBOSE" ), makeKeyword( "TASKS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol(
                "QUOTE" ), makeSymbol( "NEW-SECTION" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LOG-HEADING" ) ), ConsesLow.list( makeSymbol(
                    "FORMAT" ), NIL, makeString( "Search Depth ~s" ), makeSymbol( "DEPTH" ) ) ), ConsesLow.list( makeSymbol( "OUTPUT-MESSAGE" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL,
                        makeString( "task ~s" ), makeSymbol( "TASK1" ) ) ), ConsesLow.list( makeSymbol( "WHEN-VERBOSE" ), makeKeyword( "ALL" ) ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list(
                            EQ, makeSymbol( "TASKNAME" ), makeKeyword( "SUPERTASK" ) ), ConsesLow.list( makeSymbol( "ADD-TO-POST-ORDERING" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "FORMULA-ARG1" ),
                                makeSymbol( "TASK1" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TASKLIST" ), ConsesLow.list( makeSymbol( "REST" ), makeSymbol( "TASKLIST" ) ) ), ConsesLow.list( makeSymbol(
                                    "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "*SHOP-METHOD-CYCLE-CHECKING-ENABLED?*" ),
                                        ConsesLow.list( makeSymbol( "PARENT-TASK?" ), makeSymbol( "SELF" ), makeSymbol( "TASK1" ) ) ), ConsesLow.list( makeSymbol( "WHEN-VERBOSE" ), makeKeyword( "GOALS" ), ConsesLow.list(
                                            makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "WARNING" ) ), makeString( "Prune -- Method Cycle checking detected a loop" ) ) ),
                                        ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "SIMPLE-SITUATION-PRED?" ), makeSymbol( "SELF" ), makeSymbol( "TASKNAME" ) ), ConsesLow
                                            .list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "EXPAND-PRIMITIVE-PRECONDITIONS" ), makeSymbol( "SELF" ), makeSymbol( "TASK1" ) ) ) ), ConsesLow.list( T, ConsesLow
                                                .list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "EXPAND-COMPLEX" ), makeSymbol( "SELF" ), makeSymbol( "TASK1" ) ) ) ) ) ) );
    $sym233$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $kw234$TASKS = makeKeyword( "TASKS" );
    $sym235$NEW_SECTION = makeSymbol( "NEW-SECTION" );
    $sym236$LOG_HEADING = makeSymbol( "LOG-HEADING" );
    $str237$Search_Depth__s = makeString( "Search Depth ~s" );
    $str238$task__s = makeString( "task ~s" );
    $kw239$ALL = makeKeyword( "ALL" );
    $kw240$GOALS = makeKeyword( "GOALS" );
    $sym241$WARNING = makeSymbol( "WARNING" );
    $str242$Prune____Method_Cycle_checking_de = makeString( "Prune -- Method Cycle checking detected a loop" );
    $sym243$SHOP_BASIC_PLAN_STATE_EXPAND_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-EXPAND-METHOD" );
    $sym244$EXPAND_COMPLEX = makeSymbol( "EXPAND-COMPLEX" );
    $list245 = ConsesLow.list( ConsesLow.list( makeSymbol( "CDESTRUCTURING-BIND" ), ConsesLow.list( makeSymbol( "SCOND-NODES" ), makeSymbol( "INVERSE-UNIFIERS" ) ), ConsesLow.list( makeSymbol(
        "APPLY-ALL-SUFFICIENT-CONDITIONS" ), makeSymbol( "SELF" ), makeSymbol( "TASK" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "METHOD-NODES" ), NIL ) ), ConsesLow.list(
            makeSymbol( "PIF" ), makeSymbol( "SCOND-NODES" ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-UNIFIER" ), makeSymbol(
                "INVERSE-UNIFIERS" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "MULTIBINDING-FAILED?" ), makeSymbol( "CUR-UNIFIER" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
                    ConsesLow.list( makeSymbol( "SIMPLE-UNIFIER" ), ConsesLow.list( makeSymbol( "APPLICABLE-MULTIBINDING" ), makeSymbol( "SELF" ), makeSymbol( "CUR-UNIFIER" ) ) ), ConsesLow.list( makeSymbol(
                        "NEW-TASKS" ), ConsesLow.list( makeSymbol( "APPLY-MULTIBINDING" ), makeSymbol( "TASK" ), makeSymbol( "SIMPLE-UNIFIER" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol(
                            "CUR-TASK" ), makeSymbol( "NEW-TASKS" ) ), ConsesLow.list( makeSymbol( "CPUSH*" ), ConsesLow.list( makeSymbol( "APPLY-ALL-METHODS" ), makeSymbol( "SELF" ), makeSymbol( "CUR-TASK" ) ),
                                makeSymbol( "METHOD-NODES" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "METHOD-NODES" ), ConsesLow.list( makeSymbol(
                                    "APPLY-ALL-METHODS" ), makeSymbol( "SELF" ), makeSymbol( "TASK" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "APPEND" ), makeSymbol( "SCOND-NODES" ),
                                        makeSymbol( "METHOD-NODES" ) ) ) ) ) );
    $list246 = ConsesLow.list( makeSymbol( "SCOND-NODES" ), makeSymbol( "INVERSE-UNIFIERS" ) );
    $sym247$SHOP_BASIC_PLAN_STATE_EXPAND_COMPLEX_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-EXPAND-COMPLEX-METHOD" );
    $sym248$EXPAND_PRIMITIVE_PRECONDITIONS = makeSymbol( "EXPAND-PRIMITIVE-PRECONDITIONS" );
    $list249 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "APPLY-ALL-PRECONDITIONS" ), makeSymbol( "SELF" ), makeSymbol( "TASK" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow
        .list( makeSymbol( "EXPAND-PRIMITIVE" ), makeSymbol( "SELF" ), makeSymbol( "TASK" ) ) ) ) );
    $sym250$SHOP_BASIC_PLAN_STATE_EXPAND_PRIMITIVE_PRECONDITIONS_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-EXPAND-PRIMITIVE-PRECONDITIONS-METHOD" );
    $sym251$EXPAND_PRIMITIVE = makeSymbol( "EXPAND-PRIMITIVE" );
    $list252 = ConsesLow.list( ConsesLow.list( makeSymbol( "WHEN-VERBOSE" ), makeKeyword( "OPERATORS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "LOG-NEWLINE" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LOG-ENTRY" ) ), makeString( "Finding operators for task..." ) ) ), ConsesLow
            .list( new SubLObject[]
            { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DOMAIN" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-DOMAIN" ), makeSymbol(
                "SHOP-BASIC-PLANNER-THREAD" ) ), makeSymbol( "PLANNER" ) ) ), ConsesLow.list( makeSymbol( "OPERATORS" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-OPERATORS" ),
                    makeSymbol( "SHOP-BASIC-DOMAIN" ) ), makeSymbol( "DOMAIN" ), makeSymbol( "TASK" ) ) ), ConsesLow.list( makeSymbol( "COND-OPERATORS" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list(
                        makeSymbol( "GET-CONDITIONAL-OPERATORS" ), makeSymbol( "SHOP-BASIC-DOMAIN" ) ), makeSymbol( "DOMAIN" ), makeSymbol( "TASK" ) ) ), makeSymbol( "NEW-PLAN-STATE" ), makeSymbol( "NEW-WORLD-STATE" ) ),
              ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "OPERATORS" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                  makeSymbol( "WARNING" ) ), makeString( "No operator for task" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEW-PLAN-STATE" ), ConsesLow.list( makeSymbol( "CREATE-NEXT" ), makeSymbol(
                      "SELF" ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ADD-TO-PARTIAL-PLAN" ), makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ), makeSymbol( "NEW-PLAN-STATE" ), makeSymbol(
                          "TASK" ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ADD-TO-TASK-STRUCS" ), makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ), makeSymbol( "NEW-PLAN-STATE" ), NIL ),
                  ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ADD-DECOMPOSITION" ), makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ), makeSymbol( "NEW-PLAN-STATE" ), makeSymbol( "TASK" ), NIL ),
                  ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "NEW-PLAN-STATE" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEW-WORLD-STATE" ), ConsesLow.list(
                      makeSymbol( "APPLY-OPERATORS" ), makeSymbol( "SELF" ), makeSymbol( "TASK" ), makeSymbol( "OPERATORS" ), makeSymbol( "COND-OPERATORS" ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol(
                          "NEW-WORLD-STATE" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "PLANNER" ), ConsesLow.list(
                              makeSymbol( "QUOTE" ), makeSymbol( "CYCLE-CHECKING" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "OLD-STATE" ), ConsesLow.list( makeSymbol( "GET-SLOT" ),
                                  makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PREVIOUS-STATES" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ),
                                      ConsesLow.list( makeSymbol( "SAME-STATE-P" ), makeSymbol( "SHOP-BASIC-WORLD-STATE" ) ), makeSymbol( "NEW-WORLD-STATE" ), makeSymbol( "NEW-WORLD-STATE" ), makeSymbol( "OLD-STATE" ) ),
                                      ConsesLow.list( makeSymbol( "WHEN-VERBOSE" ), makeKeyword( "CUTOFFS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                          "WARNING" ) ), makeString( "Prune -- World State Cycle Checking detected a loop" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                                              makeSymbol( "NEW-PLAN-STATE" ), ConsesLow.list( makeSymbol( "CREATE-NEXT" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list(
                                                  makeSymbol( "SET-WORLD-STATE" ), makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ), makeSymbol( "NEW-PLAN-STATE" ), makeSymbol( "NEW-WORLD-STATE" ) ), ConsesLow.list( makeSymbol(
                                                      "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ADD-TO-PREVIOUS-STATES" ), makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ), makeSymbol( "NEW-PLAN-STATE" ), makeSymbol(
                                                          "NEW-WORLD-STATE" ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ADD-TO-PARTIAL-PLAN" ), makeSymbol(
                                                              "SHOP-BASIC-PLAN-STATE" ) ), makeSymbol( "NEW-PLAN-STATE" ), makeSymbol( "TASK" ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list(
                                                                  makeSymbol( "ADD-TO-TASK-STRUCS" ), makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ), makeSymbol( "NEW-PLAN-STATE" ), ConsesLow.list( makeSymbol( "APPEND" ),
                                                                      makeSymbol( "OPERATORS" ), makeSymbol( "COND-OPERATORS" ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol(
                                                                          "ADD-DECOMPOSITION" ), makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ), makeSymbol( "NEW-PLAN-STATE" ), makeSymbol( "TASK" ), NIL ), ConsesLow.list(
                                                                              makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "NEW-PLAN-STATE" ) ) )
    } ) );
    $sym253$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $kw254$OPERATORS = makeKeyword( "OPERATORS" );
    $sym255$LOG_NEWLINE = makeSymbol( "LOG-NEWLINE" );
    $sym256$LOG_ENTRY = makeSymbol( "LOG-ENTRY" );
    $str257$Finding_operators_for_task___ = makeString( "Finding operators for task..." );
    $str258$No_operator_for_task = makeString( "No operator for task" );
    $sym259$CYCLE_CHECKING = makeSymbol( "CYCLE-CHECKING" );
    $kw260$CUTOFFS = makeKeyword( "CUTOFFS" );
    $str261$Prune____World_State_Cycle_Checki = makeString( "Prune -- World State Cycle Checking detected a loop" );
    $sym262$SHOP_BASIC_PLAN_STATE_EXPAND_PRIMITIVE_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-EXPAND-PRIMITIVE-METHOD" );
    $sym263$APPLY_OPERATORS = makeSymbol( "APPLY-OPERATORS" );
    $list264 = ConsesLow.list( makeSymbol( "TASK" ), makeSymbol( "OPERATORS" ), makeSymbol( "COND-OPERATORS" ) );
    $list265 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "WORLD-STATE" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "NEXT-STATE" ) ) ) ), ConsesLow.list( makeSymbol( "ADDS" ), NIL ), ConsesLow.list( makeSymbol( "DELETES" ), NIL ), ConsesLow.list( makeSymbol( "TOTAL-NUM" ), ConsesLow.list( makeSymbol(
            "LIST-LENGTH" ), makeSymbol( "COND-OPERATORS" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-OP" ), makeSymbol( "OPERATORS" ) ), ConsesLow.list( makeSymbol(
                "CMULTIPLE-VALUE-BIND" ), ConsesLow.list( makeSymbol( "NEW-ADDS" ), makeSymbol( "NEW-DELETES" ) ), ConsesLow.list( makeSymbol( "APPLY-OPERATOR" ), makeSymbol( "SELF" ), makeSymbol( "TASK" ), makeSymbol(
                    "CUR-OP" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LIT" ), makeSymbol( "NEW-ADDS" ) ), ConsesLow.list( makeSymbol( "CPUSHNEW" ), makeSymbol( "LIT" ), makeSymbol(
                        "ADDS" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LIT" ), makeSymbol( "NEW-DELETES" ) ), ConsesLow.list( makeSymbol( "CPUSHNEW" ), makeSymbol( "LIT" ),
                            makeSymbol( "DELETES" ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST-NUMBERED" ), ConsesLow.list( makeSymbol( "CUR-OP" ), makeSymbol( "CUR-NUM" ), makeSymbol( "COND-OPERATORS" ) ), ConsesLow
                                .list( makeSymbol( "WHEN-VERBOSE" ), makeKeyword( "OPERATORS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                    "LOG-FANCY-ENTRY" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Trying [~s/~s]:" ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol( "CUR-NUM" ) ), makeSymbol(
                                        "TOTAL-NUM" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "BOLD" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list(
                                            makeSymbol( "QUOTE" ), makeSymbol( "LOG-NEWLINE" ) ) ) ), ConsesLow.list( makeSymbol( "CMULTIPLE-VALUE-BIND" ), ConsesLow.list( makeSymbol( "NEW-ADDS" ), makeSymbol(
                                                "NEW-DELETES" ) ), ConsesLow.list( makeSymbol( "APPLY-CONDITIONAL-OPERATOR" ), makeSymbol( "SELF" ), makeSymbol( "TASK" ), makeSymbol( "CUR-OP" ) ), ConsesLow.list(
                                                    makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LIT" ), makeSymbol( "NEW-ADDS" ) ), ConsesLow.list( makeSymbol( "CPUSHNEW" ), makeSymbol( "LIT" ), makeSymbol(
                                                        "ADDS" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LIT" ), makeSymbol( "NEW-DELETES" ) ), ConsesLow.list( makeSymbol( "CPUSHNEW" ),
                                                            makeSymbol( "LIT" ), makeSymbol( "DELETES" ) ) ) ) ), ConsesLow.list( new SubLObject[]
                                                            { makeSymbol( "WHEN-VERBOSE" ), makeKeyword( "OPERATORS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                makeSymbol( "LOG-NEWLINE" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                                    "LOG-ENTRY" ) ), makeString( "Making New World State" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol(
                                                                        "QUOTE" ), makeSymbol( "LOG-ENTRY" ) ), makeString( "Adds: " ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list(
                                                                            makeSymbol( "QUOTE" ), makeSymbol( "LOG-ENTRY" ) ), ConsesLow.list( makeSymbol( "WRITE-TO-STRING" ), makeSymbol( "ADDS" ) ) ), ConsesLow.list(
                                                                                makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LOG-ENTRY" ) ), makeString( "Deletes: " ) ),
                                                              ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LOG-ENTRY" ) ), ConsesLow.list( makeSymbol(
                                                                  "WRITE-TO-STRING" ), makeSymbol( "DELETES" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RACE-LITS" ),
                                                                      ConsesLow.list( makeSymbol( "INTERSECTION" ), makeSymbol( "ADDS" ), makeSymbol( "DELETES" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ) ) ),
                                                                      ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "RACE-LITS" ), ConsesLow.list( makeSymbol( "OUTPUT-MESSAGE" ), makeSymbol( "SELF" ), ConsesLow
                                                                          .list( makeSymbol( "FORMAT" ), NIL, makeString( "Warning: Add/Delete race condition (~a) with operators ~a and conditional operators ~a." ),
                                                                              makeSymbol( "RACE-LITS" ), makeSymbol( "OPERATORS" ), makeSymbol( "COND-OPERATORS" ) ) ) ) )
    } ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "RESULT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DELETE-LITERALS" ) ), makeSymbol( "DELETES" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
        "RESULT" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADD-LITERALS" ) ), makeSymbol( "ADDS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) );
    $sym266$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym267$NEXT_STATE = makeSymbol( "NEXT-STATE" );
    $sym268$LOG_FANCY_ENTRY = makeSymbol( "LOG-FANCY-ENTRY" );
    $str269$Trying___s__s__ = makeString( "Trying [~s/~s]:" );
    $list270 = ConsesLow.list( makeKeyword( "BOLD" ) );
    $str271$Making_New_World_State = makeString( "Making New World State" );
    $str272$Adds__ = makeString( "Adds: " );
    $str273$Deletes__ = makeString( "Deletes: " );
    $str274$Warning__Add_Delete_race_conditio = makeString( "Warning: Add/Delete race condition (~a) with operators ~a and conditional operators ~a." );
    $sym275$DELETE_LITERALS = makeSymbol( "DELETE-LITERALS" );
    $sym276$ADD_LITERALS = makeSymbol( "ADD-LITERALS" );
    $sym277$SHOP_BASIC_PLAN_STATE_APPLY_OPERATORS_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-APPLY-OPERATORS-METHOD" );
    $sym278$APPLY_OPERATOR = makeSymbol( "APPLY-OPERATOR" );
    $list279 = ConsesLow.list( makeSymbol( "TASK" ), makeSymbol( "OPERATOR" ) );
    $list280 = ConsesLow.list( makeString(
        "@param  TASK hl-formula-p\n   @param  OPERATOR shop-operator-p\n   @return shop-plan-state-p\n   If OPERATOR is applicable to TASK in self's WORLD-STATE, then return\n   the resulting PLAN-STATE.  Otherwise return NIL." ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "INLINE-GET-SLOT" ), ConsesLow.list( makeSymbol( "HEAD" ), makeSymbol(
            "SHOP-BASIC-OPERATOR" ) ), makeSymbol( "OPERATOR" ) ) ), ConsesLow.list( makeSymbol( "UNIFIER" ), ConsesLow.list( makeSymbol( "SHOP-UNIFY" ), ConsesLow.list( makeSymbol( "REST" ), makeSymbol( "HEAD" ) ),
                ConsesLow.list( makeSymbol( "REST" ), makeSymbol( "TASK" ) ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "SHOP-UNIFY-FAILED?" ), makeSymbol( "UNIFIER" ) ), ConsesLow.list(
                    makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DELETIONS" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-DELETES" ), makeSymbol(
                        "SHOP-BASIC-OPERATOR" ) ), makeSymbol( "OPERATOR" ) ) ), ConsesLow.list( makeSymbol( "ADDITIONS" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-ADDS" ),
                            makeSymbol( "SHOP-BASIC-OPERATOR" ) ), makeSymbol( "OPERATOR" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "VALUES" ), ConsesLow.list( makeSymbol(
                                "SHOP-APPLY-SUBSTITUTION" ), makeSymbol( "ADDITIONS" ), makeSymbol( "UNIFIER" ) ), ConsesLow.list( makeSymbol( "SHOP-APPLY-SUBSTITUTION" ), makeSymbol( "DELETIONS" ), makeSymbol(
                                    "UNIFIER" ) ) ) ) ) ) ) );
    $sym281$SHOP_BASIC_PLAN_STATE_APPLY_OPERATOR_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-APPLY-OPERATOR-METHOD" );
    $sym282$APPLY_CONDITIONAL_OPERATOR = makeSymbol( "APPLY-CONDITIONAL-OPERATOR" );
    $list283 = ConsesLow.list( makeString( "@param COND-EFFECT shop-basic-conditional-effect-p\n   @param UNIFIER multibinding-p\n   @return listp" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
        makeSymbol( "VAR-MANAGER" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "PLANNER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VAR-MANAGER" ) ) ) ), ConsesLow.list( makeSymbol( "HEAD" ),
            ConsesLow.list( makeSymbol( "INLINE-GET-SLOT" ), ConsesLow.list( makeSymbol( "HEAD" ), makeSymbol( "SHOP-BASIC-OPERATOR" ) ), makeSymbol( "OPERATOR" ) ) ), ConsesLow.list( makeSymbol( "ADDS" ), ConsesLow
                .list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ADDS" ), makeSymbol( "SHOP-BASIC-CONDITIONAL-EFFECT" ) ), makeSymbol( "OPERATOR" ) ) ), ConsesLow.list( makeSymbol( "DELETES" ),
                    ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "DELETES" ), makeSymbol( "SHOP-BASIC-CONDITIONAL-EFFECT" ) ), makeSymbol( "OPERATOR" ) ) ), ConsesLow.list( makeSymbol(
                        "CONDITION" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "CONDITION" ), makeSymbol( "SHOP-BASIC-CONDITIONAL-EFFECT" ) ), makeSymbol( "OPERATOR" ) ) ), ConsesLow
                            .list( makeSymbol( "SUB-LIST" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "CONDITION" ), makeSymbol( "ADDS" ), makeSymbol( "DELETES" ) ) ), ConsesLow.list( makeSymbol( "UNIFIER" ),
                                ConsesLow.list( makeSymbol( "SHOP-UNIFY" ), ConsesLow.list( makeSymbol( "REST" ), makeSymbol( "HEAD" ) ), ConsesLow.list( makeSymbol( "REST" ), makeSymbol( "TASK" ) ) ) ), makeSymbol(
                                    "WORLD-STATE-MBINDINGS" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "SHOP-UNIFY-FAILED?" ), makeSymbol( "UNIFIER" ) ), ConsesLow.list( makeSymbol( "RET" ),
                                        makeSymbol( "WORLD-STATE" ) ) ), ConsesLow.list( makeSymbol( "WHEN-VERBOSE" ), makeKeyword( "OPERATORS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list(
                                            makeSymbol( "QUOTE" ), makeSymbol( "LOG-PLANNER-RULE" ) ), makeSymbol( "OPERATOR" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SUB-LIST" ), ConsesLow.list(
                                                makeSymbol( "SHOP-APPLY-SUBSTITUTION" ), makeSymbol( "SUB-LIST" ), makeSymbol( "UNIFIER" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SUB-LIST" ), ConsesLow
                                                    .list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "REPLACE-VARIABLES" ), makeSymbol( "SHOP-VARIABLE-MANAGER" ) ), makeSymbol( "VAR-MANAGER" ),
                                                        makeSymbol( "SUB-LIST" ), makeSymbol( "MBINDINGS" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "WORLD-STATE-MBINDINGS" ), ConsesLow.list( makeSymbol(
                                                            "FIND-MBINDINGS" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "SUB-LIST" ) ), makeSymbol( "MBINDINGS" ) ) ), ConsesLow.list(
                                                                makeSymbol( "PWHEN" ), makeSymbol( "WORLD-STATE-MBINDINGS" ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SINGLETON?" ), makeSymbol(
                                                                    "WORLD-STATE-MBINDINGS" ) ), makeString( "(apply-conditional-operator shop-basic-plan-state): ~a not a singleton list." ), makeSymbol(
                                                                        "WORLD-STATE-MBINDINGS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SIMPLE-MBINDING" ), ConsesLow.list(
                                                                            makeSymbol( "APPLICABLE-MULTIBINDING" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol(
                                                                                "WORLD-STATE-MBINDINGS" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ADDS" ), ConsesLow.list( makeSymbol( "FIRST" ),
                                                                                    ConsesLow.list( makeSymbol( "APPLY-MULTIBINDING" ), ConsesLow.list( makeSymbol( "SECOND" ), makeSymbol( "SUB-LIST" ) ), makeSymbol(
                                                                                        "SIMPLE-MBINDING" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DELETES" ), ConsesLow.list( makeSymbol( "FIRST" ),
                                                                                            ConsesLow.list( makeSymbol( "APPLY-MULTIBINDING" ), ConsesLow.list( makeSymbol( "THIRD" ), makeSymbol( "SUB-LIST" ) ),
                                                                                                makeSymbol( "SIMPLE-MBINDING" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "VALUES" ),
                                                                                                    makeSymbol( "ADDS" ), makeSymbol( "DELETES" ) ) ) ) ) ) );
    $sym284$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym285$LOG_PLANNER_RULE = makeSymbol( "LOG-PLANNER-RULE" );
    $str286$_apply_conditional_operator_shop_ = makeString( "(apply-conditional-operator shop-basic-plan-state): ~a not a singleton list." );
    $sym287$SHOP_BASIC_PLAN_STATE_APPLY_CONDITIONAL_OPERATOR_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-APPLY-CONDITIONAL-OPERATOR-METHOD" );
    $sym288$UNIFY_PLANNER_RULE = makeSymbol( "UNIFY-PLANNER-RULE" );
    $list289 = ConsesLow.list( makeSymbol( "TASK" ), makeSymbol( "RULE" ) );
    $list290 = ConsesLow.list( makeString(
        "@param TASK hl-formula-p\n   @param RULE shop-planner-rule-p\n   prepare the multibindings and decompositions for expansion. This means\n   making sure that all the variables that need to be substituted are and that\n   all the bookkeeping is kept in the mbinding." ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "VAR-MANAGER" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "PLANNER" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "VAR-MANAGER" ) ) ) ), ConsesLow.list( makeSymbol( "SIMPLE-MBINDING" ), ConsesLow.list( makeSymbol( "APPLICABLE-MULTIBINDING" ), makeSymbol( "SELF" ), makeSymbol( "MBINDINGS" ) ) ), ConsesLow
                .list( makeSymbol( "UNIFIED-HEAD-DATA" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "UNIFY-TASK-TO-HEAD-WITH-DATA" ), makeSymbol( "SHOP-BASIC-PLANNER-RULE" ) ),
                    makeSymbol( "RULE" ), makeSymbol( "TASK" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "UNIFIED-HEAD-DATA" ) ), ConsesLow.list( makeSymbol(
                        "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TASK-UNIFIER" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "UNIFIED-HEAD-DATA" ) ) ), ConsesLow.list( makeSymbol( "RULE-DATA" ),
                            ConsesLow.list( makeSymbol( "REST" ), makeSymbol( "UNIFIED-HEAD-DATA" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "SHOP-UNIFY-FAILED?" ), makeSymbol(
                                "TASK-UNIFIER" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PRECOND-DECOMP" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol(
                                    "APPLY-MULTIBINDING" ), makeSymbol( "RULE-DATA" ), makeSymbol( "SIMPLE-MBINDING" ) ) ) ), ConsesLow.list( makeSymbol( "GENERATED-VAR-BPAIRS" ), ConsesLow.list( makeSymbol(
                                        "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GENERATED-VARIABLES-BOUND" ), makeSymbol( "SHOP-VARIABLE-MANAGER" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                            "SHOP-VARIABLE-MANAGER" ) ), makeSymbol( "TASK-UNIFIER" ) ) ), ConsesLow.list( makeSymbol( "NEW-MBINDINGS" ), ConsesLow.list( makeSymbol( "MB-ADD-BINDINGS" ), makeSymbol(
                                                "MBINDINGS" ), makeSymbol( "GENERATED-VAR-BPAIRS" ) ) ), ConsesLow.list( makeSymbol( "ASSERTION" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol(
                                                    "FIM" ), makeSymbol( "RULE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ASSERTIONS" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol(
                                                        "ASSERTION" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "EL-VARS" ), ConsesLow.list( makeSymbol(
                                                            "ASSERTION-EL-VARIABLES" ), makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( makeSymbol( "HL-VARS" ), ConsesLow.list( makeSymbol( "ASSERTION-HL-VARIABLES" ),
                                                                makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( makeSymbol( "EL-SUBST" ), ConsesLow.list( makeSymbol( "PAIRLIS" ), makeSymbol( "HL-VARS" ), makeSymbol(
                                                                    "EL-VARS" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PRECOND-DECOMP" ), ConsesLow.list( makeSymbol( "SUBLIS" ), makeSymbol(
                                                                        "EL-SUBST" ), makeSymbol( "PRECOND-DECOMP" ) ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DECOMP" ),
                                                                            ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "REPLACE-VARIABLES" ), makeSymbol( "SHOP-VARIABLE-MANAGER" ) ),
                                                                                makeSymbol( "VAR-MANAGER" ), makeSymbol( "PRECOND-DECOMP" ), makeSymbol( "NEW-MBINDINGS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                                                                    ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "NEW-MBINDINGS" ), makeSymbol( "DECOMP" ) ) ) ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                        "RET" ), makeKeyword( "FAIL" ) ) ) );
    $sym291$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym292$UNIFY_TASK_TO_HEAD_WITH_DATA = makeSymbol( "UNIFY-TASK-TO-HEAD-WITH-DATA" );
    $sym293$SHOP_VARIABLE_MANAGER = makeSymbol( "SHOP-VARIABLE-MANAGER" );
    $sym294$ASSERTIONS = makeSymbol( "ASSERTIONS" );
    $kw295$FAIL = makeKeyword( "FAIL" );
    $sym296$SHOP_BASIC_PLAN_STATE_UNIFY_PLANNER_RULE_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-UNIFY-PLANNER-RULE-METHOD" );
    $sym297$APPLY_ALL_METHODS = makeSymbol( "APPLY-ALL-METHODS" );
    $list298 = ConsesLow.list( makeString( "@param TASK hl-formula-p" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-NODES" ), NIL ), ConsesLow.list( makeSymbol( "DOMAIN" ),
        ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-DOMAIN" ), makeSymbol( "SHOP-BASIC-PLANNER-THREAD" ) ), makeSymbol( "PLANNER" ) ) ), ConsesLow.list( makeSymbol(
            "TASK-PRED-MATCHED-METHODS" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-METHODS" ), makeSymbol( "SHOP-BASIC-DOMAIN" ) ), makeSymbol( "DOMAIN" ), makeSymbol(
                "TASK" ) ) ), ConsesLow.list( makeSymbol( "TOTAL-NUM" ), ConsesLow.list( makeSymbol( "LIST-LENGTH" ), makeSymbol( "TASK-PRED-MATCHED-METHODS" ) ) ) ), ConsesLow.list( makeSymbol( "WHEN-VERBOSE" ),
                    makeKeyword( "PLANNER-RULES" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LOG-NEWLINE" ) ) ), ConsesLow.list( makeSymbol( "FIM" ),
                        makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LOG-ENTRY" ) ), makeString( "Finding methods for task..." ) ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol(
                            "TASK-PRED-MATCHED-METHODS" ), ConsesLow.list( makeSymbol( "CDOLIST-NUMBERED" ), ConsesLow.list( makeSymbol( "CUR-METHOD" ), makeSymbol( "CUR-NUM" ), makeSymbol(
                                "TASK-PRED-MATCHED-METHODS" ) ), ConsesLow.list( makeSymbol( "WHEN-VERBOSE" ), makeKeyword( "PLANNER-RULES" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list(
                                    makeSymbol( "QUOTE" ), makeSymbol( "LOG-FANCY-ENTRY" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Trying [~s/~s]:" ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol(
                                        "CUR-NUM" ) ), makeSymbol( "TOTAL-NUM" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "BOLD" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                            "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LOG-NEWLINE" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH*" ), ConsesLow.list( makeSymbol( "APPLY-METHOD" ),
                                                makeSymbol( "SELF" ), makeSymbol( "TASK" ), makeSymbol( "CUR-METHOD" ) ), makeSymbol( "NEW-NODES" ) ) ), ConsesLow.list( makeSymbol( "WHEN-VERBOSE" ), makeKeyword(
                                                    "GOALS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "WARNING" ) ), makeString(
                                                        "No matching methods were found!" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-NODES" ) ) ) );
    $sym299$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $kw300$PLANNER_RULES = makeKeyword( "PLANNER-RULES" );
    $str301$Finding_methods_for_task___ = makeString( "Finding methods for task..." );
    $str302$No_matching_methods_were_found_ = makeString( "No matching methods were found!" );
    $sym303$SHOP_BASIC_PLAN_STATE_APPLY_ALL_METHODS_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-APPLY-ALL-METHODS-METHOD" );
    $sym304$APPLY_METHOD = makeSymbol( "APPLY-METHOD" );
    $list305 = ConsesLow.list( makeSymbol( "TASK" ), makeSymbol( "METHOD" ) );
    $list306 = ConsesLow.list( makeString(
        "@param TASK hl-formula-p\n   @param METHOD shop-basic-method-p\n   If METHOD is applicable to TASK in plan state STATE, then execute SEEK-PLANS\n   method of the resulting list of PLAN-STATES. Returns NIL." ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-NODES" ), NIL ), ConsesLow.list( makeSymbol( "UNIFIED-DECOMP-MBINDING" ), ConsesLow.list( makeSymbol( "UNIFY-PLANNER-RULE" ),
            makeSymbol( "SELF" ), makeSymbol( "TASK" ), makeSymbol( "METHOD" ) ) ) ), ConsesLow.list( makeSymbol( "WHEN-VERBOSE" ), makeKeyword( "METHODS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ),
                ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LOG-PLANNER-RULE" ) ), makeSymbol( "METHOD" ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( EQ, makeKeyword( "FAIL" ), makeSymbol(
                    "UNIFIED-DECOMP-MBINDING" ) ), ConsesLow.list( makeSymbol( "CDESTRUCTURING-BIND" ), ConsesLow.list( makeSymbol( "NEW-MBINDINGS" ), makeSymbol( "PRE" ), makeSymbol( "REDUCTION" ) ), makeSymbol(
                        "UNIFIED-DECOMP-MBINDING" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "STATE-UNIFIERS" ), ConsesLow.list( makeSymbol( "FIND-MBINDINGS" ), makeSymbol(
                            "SELF" ), makeSymbol( "PRE" ), makeSymbol( "NEW-MBINDINGS" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "STATE-UNIFIERS" ), ConsesLow.list( makeSymbol( "CDOLIST-NUMBERED" ),
                                ConsesLow.list( makeSymbol( "UNIFIER" ), makeSymbol( "RESULT-NUM" ), makeSymbol( "STATE-UNIFIERS" ) ), ConsesLow.list( new SubLObject[]
                                { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-PLAN-STATE" ), ConsesLow.list( makeSymbol( "CREATE-NEXT" ), makeSymbol( "SELF" ) ) ), makeSymbol(
                                    "SIMPLE-MBINDING" ) ), ConsesLow.list( makeSymbol( "WHEN-VERBOSE" ), makeKeyword( "METHODS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol(
                                        "QUOTE" ), makeSymbol( "LOG-FANCY-ENTRY" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Result ~s" ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol(
                                            "RESULT-NUM" ) ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "BOLD" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow
                                                .list( makeSymbol( "QUOTE" ), makeSymbol( "LOG-PREFORMATTED" ) ), ConsesLow.list( makeSymbol( "MULTIBINDING-STRING" ), makeSymbol( "UNIFIER" ) ) ), ConsesLow.list(
                                                    makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LOG-ENTRY" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString(
                                                        "Decomposition:~%" ), makeSymbol( "DEPTH" ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "LISTP" ), makeSymbol( "REDUCTION" ) ),
                                                            ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "R" ), makeSymbol( "REDUCTION" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                                                                "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LOG-PREFORMATTED" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "~,,6,@s~%" ),
                                                                    makeSymbol( "R" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ADD-TO-PARTIAL-PLAN" ), makeSymbol(
                                                                        "SHOP-BASIC-PLAN-STATE" ) ), makeSymbol( "NEW-PLAN-STATE" ), makeSymbol( "TASK" ) ), ConsesLow.list( makeSymbol(
                                                                            "SET-SHOP-BASIC-PLAN-STATE-MBINDINGS" ), makeSymbol( "NEW-PLAN-STATE" ), makeSymbol( "UNIFIER" ) ), ConsesLow.list( makeSymbol(
                                                                                "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ADD-TO-TASK-STRUCS" ), makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ), makeSymbol(
                                                                                    "NEW-PLAN-STATE" ), makeSymbol( "METHOD" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SIMPLE-MBINDING" ), ConsesLow.list(
                                                                                        makeSymbol( "APPLICABLE-MULTIBINDING" ), makeSymbol( "SELF" ), makeSymbol( "UNIFIER" ) ) ), ConsesLow.list( makeSymbol(
                                                                                            "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ADD-DECOMPOSITION" ), makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ), makeSymbol(
                                                                                                "NEW-PLAN-STATE" ), makeSymbol( "TASK" ), ConsesLow.list( makeSymbol( "FIRST" ), ConsesLow.list( makeSymbol(
                                                                                                    "APPLY-MULTIBINDING" ), makeSymbol( "REDUCTION" ), makeSymbol( "SIMPLE-MBINDING" ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                                        "CPUSH" ), makeSymbol( "NEW-PLAN-STATE" ), makeSymbol( "NEW-NODES" ) )
                                } ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-NODES" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym307$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $kw308$METHODS = makeKeyword( "METHODS" );
    $list309 = ConsesLow.list( makeSymbol( "NEW-MBINDINGS" ), makeSymbol( "PRE" ), makeSymbol( "REDUCTION" ) );
    $str310$Result__s = makeString( "Result ~s" );
    $sym311$LOG_PREFORMATTED = makeSymbol( "LOG-PREFORMATTED" );
    $str312$Decomposition___ = makeString( "Decomposition:~%" );
    $str313$___6__s__ = makeString( "~,,6,@s~%" );
    $sym314$SHOP_BASIC_PLAN_STATE_APPLY_METHOD_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-APPLY-METHOD-METHOD" );
    $sym315$APPLY_ALL_SUFFICIENT_CONDITIONS = makeSymbol( "APPLY-ALL-SUFFICIENT-CONDITIONS" );
    $list316 = ConsesLow.list( makeString( "@param TASK hl-formula-p" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-NODES" ), NIL ), ConsesLow.list( makeSymbol( "DOMAIN" ),
        ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-DOMAIN" ), makeSymbol( "SHOP-BASIC-PLANNER-THREAD" ) ), makeSymbol( "PLANNER" ) ) ), ConsesLow.list( makeSymbol(
            "TASK-SUFFICIENT-CONDS" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-SUFFICIENT-CONDS" ), makeSymbol( "SHOP-BASIC-DOMAIN" ) ), makeSymbol( "DOMAIN" ), makeSymbol(
                "TASK" ) ) ), ConsesLow.list( makeSymbol( "INVERSE-UNIFIERS" ), NIL ), ConsesLow.list( makeSymbol( "TOTAL-NUM" ), ConsesLow.list( makeSymbol( "LIST-LENGTH" ), makeSymbol( "TASK-SUFFICIENT-CONDS" ) ) ) ),
        ConsesLow.list( makeSymbol( "WHEN-VERBOSE" ), makeKeyword( "PLANNER-RULES" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LOG-NEWLINE" ) ) ),
            ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LOG-ENTRY" ) ), makeString( "Finding sufficient condition rules for task..." ) ) ), ConsesLow
                .list( makeSymbol( "PIF" ), makeSymbol( "TASK-SUFFICIENT-CONDS" ), ConsesLow.list( makeSymbol( "CDOLIST-NUMBERED" ), ConsesLow.list( makeSymbol( "CUR-SCOND" ), makeSymbol( "CUR-NUM" ), makeSymbol(
                    "TASK-SUFFICIENT-CONDS" ) ), ConsesLow.list( makeSymbol( "WHEN-VERBOSE" ), makeKeyword( "PLANNER-RULES" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol(
                        "QUOTE" ), makeSymbol( "LOG-FANCY-ENTRY" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), NIL, makeString( "Trying [~s/~s]:" ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol( "CUR-NUM" ) ),
                            makeSymbol( "TOTAL-NUM" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "BOLD" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list(
                                makeSymbol( "QUOTE" ), makeSymbol( "LOG-NEWLINE" ) ) ) ), ConsesLow.list( makeSymbol( "CDESTRUCTURING-BIND" ), ConsesLow.list( makeSymbol( "NODES" ), makeSymbol( "INVERSE-UNIFIER" ) ),
                                    ConsesLow.list( makeSymbol( "APPLY-SUFFICIENT-CONDITION" ), makeSymbol( "SELF" ), makeSymbol( "TASK" ), makeSymbol( "CUR-SCOND" ) ), ConsesLow.list( makeSymbol( "CPUSH*" ), makeSymbol(
                                        "NODES" ), makeSymbol( "NEW-NODES" ) ), ConsesLow.list( makeSymbol( "CPUSHNEW" ), makeSymbol( "INVERSE-UNIFIER" ), makeSymbol( "INVERSE-UNIFIERS" ) ) ) ), ConsesLow.list(
                                            makeSymbol( "WHEN-VERBOSE" ), makeKeyword( "GOALS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                "WARNING" ) ), makeString( "No matching sufficient conditions were found!" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol(
                                                    "NEW-NODES" ), makeSymbol( "INVERSE-UNIFIERS" ) ) ) ) );
    $sym317$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $str318$Finding_sufficient_condition_rule = makeString( "Finding sufficient condition rules for task..." );
    $list319 = ConsesLow.list( makeSymbol( "NODES" ), makeSymbol( "INVERSE-UNIFIER" ) );
    $str320$No_matching_sufficient_conditions = makeString( "No matching sufficient conditions were found!" );
    $sym321$SHOP_BASIC_PLAN_STATE_APPLY_ALL_SUFFICIENT_CONDITIONS_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-APPLY-ALL-SUFFICIENT-CONDITIONS-METHOD" );
    $sym322$APPLY_SUFFICIENT_CONDITION = makeSymbol( "APPLY-SUFFICIENT-CONDITION" );
    $list323 = ConsesLow.list( makeSymbol( "TASK" ), makeSymbol( "SCOND" ) );
    $list324 = ConsesLow.list( makeString( "@param TASK hl-formula-p\n   @param SCOND shop-sufficiency-condition-p" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-NODES" ),
        NIL ), ConsesLow.list( makeSymbol( "UNIFIED-TASK-DATA" ), ConsesLow.list( makeSymbol( "UNIFY-PLANNER-RULE" ), makeSymbol( "SELF" ), makeSymbol( "TASK" ), makeSymbol( "SCOND" ) ) ) ), ConsesLow.list( makeSymbol(
            "WHEN-VERBOSE" ), makeKeyword( "METHODS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LOG-PLANNER-RULE" ) ), makeSymbol( "SCOND" ) ) ),
        ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( EQ, makeSymbol( "UNIFIED-TASK-DATA" ), makeKeyword( "FAIL" ) ), ConsesLow.list( makeSymbol( "CDESTRUCTURING-BIND" ), ConsesLow.list( makeSymbol(
            "NEW-MBINDINGS" ), makeSymbol( "CONDITION" ) ), makeSymbol( "UNIFIED-TASK-DATA" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "STATE-UNIFIERS" ), ConsesLow.list(
                makeSymbol( "FIND-MBINDINGS" ), makeSymbol( "SELF" ), makeSymbol( "CONDITION" ), makeSymbol( "NEW-MBINDINGS" ) ) ), ConsesLow.list( makeSymbol( "INVERSE-UNIFIER" ), ConsesLow.list( makeSymbol(
                    "MULTIBINDING-INVERSE-LIST" ), makeSymbol( "NEW-MBINDINGS" ), makeSymbol( "STATE-UNIFIERS" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-UNIFIER" ), makeSymbol(
                        "STATE-UNIFIERS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-NODE" ), ConsesLow.list( makeSymbol( "CREATE-NEXT" ), makeSymbol( "SELF" ) ) ) ),
                            ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ADD-TO-PARTIAL-PLAN" ), makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ), makeSymbol( "NEW-NODE" ), makeSymbol( "TASK" ) ),
                            ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ADD-TO-TASK-STRUCS" ), makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ), makeSymbol( "NEW-NODE" ), makeSymbol( "SCOND" ) ),
                            ConsesLow.list( makeSymbol( "SET-SHOP-BASIC-PLAN-STATE-MBINDINGS" ), makeSymbol( "NEW-NODE" ), makeSymbol( "CUR-UNIFIER" ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list(
                                makeSymbol( "SET-TASKLIST" ), makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ), makeSymbol( "NEW-NODE" ), ConsesLow.list( makeSymbol( "APPEND" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), ConsesLow
                                    .list( makeSymbol( "BQ-LIST" ), makeKeyword( "SUPERTASK" ), makeSymbol( "TASK" ) ) ), ConsesLow.list( makeSymbol( "REST" ), makeSymbol( "TASKLIST" ) ) ) ), ConsesLow.list( makeSymbol(
                                        "CPUSH" ), makeSymbol( "NEW-NODE" ), makeSymbol( "NEW-NODES" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "NEW-NODES" ),
                                            makeSymbol( "INVERSE-UNIFIER" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), NIL, NIL ) ) ) );
    $sym325$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $list326 = ConsesLow.list( makeSymbol( "NEW-MBINDINGS" ), makeSymbol( "CONDITION" ) );
    $sym327$SHOP_BASIC_PLAN_STATE_APPLY_SUFFICIENT_CONDITION_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-APPLY-SUFFICIENT-CONDITION-METHOD" );
    $sym328$APPLY_ALL_PRECONDITIONS = makeSymbol( "APPLY-ALL-PRECONDITIONS" );
    $list329 = ConsesLow.list( makeString( "@param TASK hl-formula-p\n   @return booleanp  -- t if preconditions for TASK are all satisfied by world state" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
        ConsesLow.list( makeSymbol( "PRECONDS" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GET-PLANNER-RULES" ), makeSymbol( "SHOP-BASIC-DOMAIN" ) ), makeSymbol( "DOMAIN" ), makeSymbol(
            "TASK" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SHOP-PRECONDITION-P" ) ) ) ), ConsesLow.list( makeSymbol( "TOTAL-NUM" ), ConsesLow.list( makeSymbol( "LIST-LENGTH" ), makeSymbol(
                "PRECONDS" ) ) ) ), ConsesLow.list( makeSymbol( "WHEN-VERBOSE" ), makeKeyword( "OPERATORS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "LOG-NEWLINE" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LOG-ENTRY" ) ), makeString(
                        "Finding precondition rules for task..." ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "PRECONDS" ) ), ConsesLow.list( makeSymbol( "PROGN" ),
                            ConsesLow.list( makeSymbol( "WHEN-VERBOSE" ), makeKeyword( "OPERATORS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                "WARNING" ) ), makeString( "No precondition rules found!" ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol(
                                    "CDOLIST-NUMBERED" ), ConsesLow.list( makeSymbol( "PRECOND" ), makeSymbol( "CUR-NUM" ), makeSymbol( "PRECONDS" ) ), ConsesLow.list( makeSymbol( "WHEN-VERBOSE" ), makeKeyword(
                                        "OPERATORS" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LOG-FANCY-ENTRY" ) ), ConsesLow.list( makeSymbol(
                                            "FORMAT" ), NIL, makeString( "Trying [~s/~s]:" ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol( "CUR-NUM" ) ), makeSymbol( "TOTAL-NUM" ) ), ConsesLow.list( makeSymbol(
                                                "QUOTE" ), ConsesLow.list( makeKeyword( "BOLD" ) ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                                    "LOG-NEWLINE" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "APPLY-PRECONDITION" ), makeSymbol( "SELF" ), makeSymbol( "TASK" ),
                                                        makeSymbol( "PRECOND" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                                                            NIL ) ) );
    $sym330$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $sym331$SHOP_PRECONDITION_P = makeSymbol( "SHOP-PRECONDITION-P" );
    $str332$Finding_precondition_rules_for_ta = makeString( "Finding precondition rules for task..." );
    $str333$No_precondition_rules_found_ = makeString( "No precondition rules found!" );
    $sym334$SHOP_BASIC_PLAN_STATE_APPLY_ALL_PRECONDITIONS_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-APPLY-ALL-PRECONDITIONS-METHOD" );
    $sym335$APPLY_PRECONDITION = makeSymbol( "APPLY-PRECONDITION" );
    $list336 = ConsesLow.list( makeSymbol( "TASK" ), makeSymbol( "PRECOND" ) );
    $list337 = ConsesLow.list( makeString( "@param TASK hl-formula-p\n   @param PRECOND shop-precondition-p\n   @return listp of multibinding-p" ), ConsesLow.list( makeSymbol( "WHEN-VERBOSE" ), makeKeyword(
        "PLANNER-RULES" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LOG-PLANNER-RULE" ) ), makeSymbol( "PRECOND" ) ) ), ConsesLow.list( makeSymbol(
            "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "UNIFIED-TASK-DATA" ), ConsesLow.list( makeSymbol( "UNIFY-PLANNER-RULE" ), makeSymbol( "SELF" ), makeSymbol( "TASK" ), makeSymbol( "PRECOND" ) ) ) ),
            ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( EQ, makeKeyword( "FAIL" ), makeSymbol( "UNIFIED-TASK-DATA" ) ), ConsesLow.list( makeSymbol( "CDESTRUCTURING-BIND" ), ConsesLow.list( makeSymbol(
                "NEW-MBINDINGS" ), makeSymbol( "PRE" ), makeSymbol( "REDUCTION" ) ), makeSymbol( "UNIFIED-TASK-DATA" ), ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "REDUCTION" ) ), ConsesLow.list( makeSymbol(
                    "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "STATE-UNIFIERS" ), ConsesLow.list( makeSymbol( "FIND-MBINDINGS" ), makeSymbol( "SELF" ), makeSymbol( "PRE" ), makeSymbol(
                        "NEW-MBINDINGS" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "STATE-UNIFIERS" ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list(
                            makeSymbol( "WHEN-VERBOSE" ), makeKeyword( "PLANNER-RULES" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "LOG" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "WARNING" ) ),
                                makeString( "No bindings found!" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                    "STATE-UNIFIERS" ) ) ) ) ) ) ) ) );
    $sym338$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD" );
    $str339$No_bindings_found_ = makeString( "No bindings found!" );
    $sym340$SHOP_BASIC_PLAN_STATE_APPLY_PRECONDITION_METHOD = makeSymbol( "SHOP-BASIC-PLAN-STATE-APPLY-PRECONDITION-METHOD" );
  }
}
/*
 * 
 * Total time: 1990 ms
 * 
 */