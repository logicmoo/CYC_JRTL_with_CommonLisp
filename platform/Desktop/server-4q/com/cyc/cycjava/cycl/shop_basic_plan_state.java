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

public final class shop_basic_plan_state extends SubLTranslatedFile
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
    public static SubLObject cpushX(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject list1 = (SubLObject)shop_basic_plan_state.NIL;
        SubLObject list2 = (SubLObject)shop_basic_plan_state.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_plan_state.$list0);
        list1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_plan_state.$list0);
        list2 = current.first();
        current = current.rest();
        if (shop_basic_plan_state.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan_state.$sym1$CSETF, list2, (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan_state.$sym2$APPEND, list1, list2));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)shop_basic_plan_state.$list0);
        return (SubLObject)shop_basic_plan_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 998L)
    public static SubLObject when_verbose(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject required_verbose_level = (SubLObject)shop_basic_plan_state.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_plan_state.$list3);
        required_verbose_level = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan_state.$sym4$CLET, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)shop_basic_plan_state.$sym5$ENTRY, (SubLObject)ConsesLow.listS((SubLObject)shop_basic_plan_state.$sym6$ASSOC, required_verbose_level, (SubLObject)shop_basic_plan_state.$list7)), (SubLObject)shop_basic_plan_state.$list8), (SubLObject)ConsesLow.listS((SubLObject)shop_basic_plan_state.$sym9$PWHEN, (SubLObject)shop_basic_plan_state.$list10, ConsesLow.append(body, (SubLObject)shop_basic_plan_state.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1476L)
    public static SubLObject shop_plan_state_p(final SubLObject shop_plan_state) {
        return interfaces.subloop_instanceof_interface(shop_plan_state, (SubLObject)shop_basic_plan_state.$sym11$SHOP_PLAN_STATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject get_shop_basic_plan_state_dynamic_predicates(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_plan_state, (SubLObject)shop_basic_plan_state.FIFTEEN_INTEGER, (SubLObject)shop_basic_plan_state.$sym17$DYNAMIC_PREDICATES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject set_shop_basic_plan_state_dynamic_predicates(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_plan_state, value, (SubLObject)shop_basic_plan_state.FIFTEEN_INTEGER, (SubLObject)shop_basic_plan_state.$sym17$DYNAMIC_PREDICATES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject get_shop_basic_plan_state_model_mt(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_plan_state, (SubLObject)shop_basic_plan_state.FOURTEEN_INTEGER, (SubLObject)shop_basic_plan_state.$sym18$MODEL_MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject set_shop_basic_plan_state_model_mt(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_plan_state, value, (SubLObject)shop_basic_plan_state.FOURTEEN_INTEGER, (SubLObject)shop_basic_plan_state.$sym18$MODEL_MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject get_shop_basic_plan_state_domain(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_plan_state, (SubLObject)shop_basic_plan_state.THIRTEEN_INTEGER, (SubLObject)shop_basic_plan_state.$sym19$DOMAIN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject set_shop_basic_plan_state_domain(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_plan_state, value, (SubLObject)shop_basic_plan_state.THIRTEEN_INTEGER, (SubLObject)shop_basic_plan_state.$sym19$DOMAIN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject get_shop_basic_plan_state_log(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_plan_state, (SubLObject)shop_basic_plan_state.TWELVE_INTEGER, (SubLObject)shop_basic_plan_state.$sym20$LOG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject set_shop_basic_plan_state_log(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_plan_state, value, (SubLObject)shop_basic_plan_state.TWELVE_INTEGER, (SubLObject)shop_basic_plan_state.$sym20$LOG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject get_shop_basic_plan_state_planner(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_plan_state, (SubLObject)shop_basic_plan_state.ELEVEN_INTEGER, (SubLObject)shop_basic_plan_state.$sym21$PLANNER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject set_shop_basic_plan_state_planner(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_plan_state, value, (SubLObject)shop_basic_plan_state.ELEVEN_INTEGER, (SubLObject)shop_basic_plan_state.$sym21$PLANNER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject get_shop_basic_plan_state_previous_states(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan_state, (SubLObject)shop_basic_plan_state.TEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject set_shop_basic_plan_state_previous_states(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan_state, value, (SubLObject)shop_basic_plan_state.TEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject get_shop_basic_plan_state_depth(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan_state, (SubLObject)shop_basic_plan_state.NINE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject set_shop_basic_plan_state_depth(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan_state, value, (SubLObject)shop_basic_plan_state.NINE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject get_shop_basic_plan_state_query_properties(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan_state, (SubLObject)shop_basic_plan_state.EIGHT_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject set_shop_basic_plan_state_query_properties(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan_state, value, (SubLObject)shop_basic_plan_state.EIGHT_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject get_shop_basic_plan_state_post_ordering(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan_state, (SubLObject)shop_basic_plan_state.SEVEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject set_shop_basic_plan_state_post_ordering(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan_state, value, (SubLObject)shop_basic_plan_state.SEVEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject get_shop_basic_plan_state_partial_plan(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan_state, (SubLObject)shop_basic_plan_state.SIX_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject set_shop_basic_plan_state_partial_plan(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan_state, value, (SubLObject)shop_basic_plan_state.SIX_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject get_shop_basic_plan_state_supports(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan_state, (SubLObject)shop_basic_plan_state.FIVE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject set_shop_basic_plan_state_supports(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan_state, value, (SubLObject)shop_basic_plan_state.FIVE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject get_shop_basic_plan_state_task_strucs(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan_state, (SubLObject)shop_basic_plan_state.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject set_shop_basic_plan_state_task_strucs(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan_state, value, (SubLObject)shop_basic_plan_state.FOUR_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject get_shop_basic_plan_state_mbindings(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan_state, (SubLObject)shop_basic_plan_state.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject set_shop_basic_plan_state_mbindings(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan_state, value, (SubLObject)shop_basic_plan_state.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject get_shop_basic_plan_state_tasklist(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan_state, (SubLObject)shop_basic_plan_state.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject set_shop_basic_plan_state_tasklist(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan_state, value, (SubLObject)shop_basic_plan_state.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject get_shop_basic_plan_state_world_state(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_get_instance_slot(v_shop_basic_plan_state, (SubLObject)shop_basic_plan_state.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject set_shop_basic_plan_state_world_state(final SubLObject v_shop_basic_plan_state, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_shop_basic_plan_state, value, (SubLObject)shop_basic_plan_state.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject subloop_reserved_initialize_shop_basic_plan_state_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan_state.$sym14$OBJECT, (SubLObject)shop_basic_plan_state.$sym22$INSTANCE_COUNT, (SubLObject)shop_basic_plan_state.ZERO_INTEGER);
        return (SubLObject)shop_basic_plan_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject subloop_reserved_initialize_shop_basic_plan_state_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan_state.$sym14$OBJECT, (SubLObject)shop_basic_plan_state.$sym24$ISOLATED_P, (SubLObject)shop_basic_plan_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan_state.$sym14$OBJECT, (SubLObject)shop_basic_plan_state.$sym25$INSTANCE_NUMBER, (SubLObject)shop_basic_plan_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym26$WORLD_STATE, (SubLObject)shop_basic_plan_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym27$TASKLIST, (SubLObject)shop_basic_plan_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym28$MBINDINGS, (SubLObject)shop_basic_plan_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym29$TASK_STRUCS, (SubLObject)shop_basic_plan_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym30$SUPPORTS, (SubLObject)shop_basic_plan_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym31$PARTIAL_PLAN, (SubLObject)shop_basic_plan_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym32$POST_ORDERING, (SubLObject)shop_basic_plan_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym33$QUERY_PROPERTIES, (SubLObject)shop_basic_plan_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym34$DEPTH, (SubLObject)shop_basic_plan_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym35$PREVIOUS_STATES, (SubLObject)shop_basic_plan_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym21$PLANNER, (SubLObject)shop_basic_plan_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym20$LOG, (SubLObject)shop_basic_plan_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym19$DOMAIN, (SubLObject)shop_basic_plan_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym18$MODEL_MT, (SubLObject)shop_basic_plan_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym17$DYNAMIC_PREDICATES, (SubLObject)shop_basic_plan_state.NIL);
        return (SubLObject)shop_basic_plan_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 1680L)
    public static SubLObject shop_basic_plan_state_p(final SubLObject v_shop_basic_plan_state) {
        return classes.subloop_instanceof_class(v_shop_basic_plan_state, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 5284L)
    public static SubLObject shop_basic_plan_state_applicable_multibinding_method(final SubLObject self, final SubLObject mbind) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (shop_basic_plan_state.NIL != shop_parameters.$shop_use_multibindingsP$.getDynamicValue(thread)) {
            return conses_high.copy_list(multibindings.mb_simple_binding(mbind));
        }
        return mbind;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 5640L)
    public static SubLObject shop_basic_plan_state_set_tasklist_method(final SubLObject self, final SubLObject tasks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        SubLObject tasklist = get_shop_basic_plan_state_tasklist(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                assert shop_basic_plan_state.NIL != Types.listp(tasks) : tasks;
                tasklist = tasks;
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, tasks);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_tasklist(self, tasklist);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 5799L)
    public static SubLObject shop_basic_plan_state_get_tasklist_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject tasklist = get_shop_basic_plan_state_tasklist(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym51$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym51$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, tasklist);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_tasklist(self, tasklist);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym51$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 5887L)
    public static SubLObject shop_basic_plan_state_add_decomposition_method(final SubLObject self, final SubLObject task, final SubLObject decomposition) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        SubLObject tasklist = get_shop_basic_plan_state_tasklist(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym57$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                tasklist = ConsesLow.append(decomposition, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)shop_basic_plan_state.$kw58$SUPERTASK, task)), tasklist);
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym57$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, tasklist);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_tasklist(self, tasklist);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym57$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 6338L)
    public static SubLObject shop_basic_plan_state_set_multibindings_method(final SubLObject self, final SubLObject mbinding) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        SubLObject mbindings = get_shop_basic_plan_state_mbindings(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                mbindings = mbinding;
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, mbindings);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_mbindings(self, mbindings);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 6487L)
    public static SubLObject shop_basic_plan_state_multibindings_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject mbindings = get_shop_basic_plan_state_mbindings(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym67$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym67$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, mbindings);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_mbindings(self, mbindings);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym67$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 6577L)
    public static SubLObject shop_basic_plan_state_set_domain_method(final SubLObject self, final SubLObject new_domain) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        SubLObject domain = get_shop_basic_plan_state_domain(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym72$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                domain = new_domain;
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym72$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, domain);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_domain(self, domain);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym72$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 6713L)
    public static SubLObject shop_basic_plan_state_get_domain_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject domain = get_shop_basic_plan_state_domain(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym76$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym76$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, domain);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_domain(self, domain);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym76$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 6797L)
    public static SubLObject shop_basic_plan_state_support_lists_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject supports = get_shop_basic_plan_state_supports(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, supports);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_supports(self, supports);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 6904L)
    public static SubLObject shop_basic_plan_state_add_to_support_lists_method(final SubLObject self, final SubLObject precond) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        SubLObject supports = get_shop_basic_plan_state_supports(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                supports = (SubLObject)ConsesLow.cons(precond, supports);
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, supports);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_supports(self, supports);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 7034L)
    public static SubLObject shop_basic_plan_state_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        SubLObject depth = get_shop_basic_plan_state_depth(self);
        SubLObject post_ordering = get_shop_basic_plan_state_post_ordering(self);
        SubLObject supports = get_shop_basic_plan_state_supports(self);
        SubLObject task_strucs = get_shop_basic_plan_state_task_strucs(self);
        SubLObject mbindings = get_shop_basic_plan_state_mbindings(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                object.object_initialize_method(self);
                supports = (SubLObject)shop_basic_plan_state.NIL;
                mbindings = (SubLObject)shop_basic_plan_state.NIL;
                post_ordering = (SubLObject)shop_basic_plan_state.NIL;
                task_strucs = (SubLObject)shop_basic_plan_state.NIL;
                depth = (SubLObject)shop_basic_plan_state.ZERO_INTEGER;
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_depth(self, depth);
                    set_shop_basic_plan_state_post_ordering(self, post_ordering);
                    set_shop_basic_plan_state_supports(self, supports);
                    set_shop_basic_plan_state_task_strucs(self, task_strucs);
                    set_shop_basic_plan_state_mbindings(self, mbindings);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 7275L)
    public static SubLObject shop_basic_plan_state_initialize_plan_state_with_problem_method(final SubLObject self, final SubLObject problem, final SubLObject planner_thread) {
        SubLObject new_tasks = shop_datastructures.shop_basic_problem_get_tasks_method(problem);
        final SubLObject new_world_state = shop_datastructures.shop_basic_problem_get_state_method(problem);
        new_tasks = shop_internals.shop_variable_manager_replace_variables_method(instances.get_slot(planner_thread, (SubLObject)shop_basic_plan_state.$sym95$VAR_MANAGER), new_tasks, multibindings.empty_mb());
        shop_basic_plan_state_set_domain_method(self, instances.get_slot(problem, (SubLObject)shop_basic_plan_state.$sym19$DOMAIN));
        shop_basic_plan_state_set_tasklist_method(self, new_tasks);
        shop_basic_plan_state_set_world_state_method(self, new_world_state);
        instances.set_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG, instances.get_slot(planner_thread, (SubLObject)shop_basic_plan_state.$sym20$LOG));
        shop_basic_plan_state_set_planner_method(self, planner_thread);
        shop_basic_plan_state_init_model_with_problem_method(self, problem);
        shop_basic_plan_state_initialize_multibindings_method(self);
        instances.set_slot(self, (SubLObject)shop_basic_plan_state.$sym33$QUERY_PROPERTIES, shop_inference.shop_query_properties(instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym21$PLANNER), (SubLObject)shop_basic_plan_state.$sym96$TIME_CUTOFF), instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym21$PLANNER), (SubLObject)shop_basic_plan_state.$sym97$NUM_BACKCHAINS)));
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 8385L)
    public static SubLObject shop_basic_plan_state_initialize_multibindings_method(final SubLObject self) {
        final SubLObject tasklist = shop_basic_plan_state_get_tasklist_method(self);
        SubLObject mbinding = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject mt = instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym18$MODEL_MT);
        if (shop_basic_plan_state.NIL != el_utilities.groundP(tasklist, (SubLObject)shop_basic_plan_state.UNPROVIDED)) {
            mbinding = multibindings.empty_mb();
        }
        else if (shop_basic_plan_state.NIL != list_utilities.singletonP(tasklist)) {
            mbinding = shop_internals.shop_initial_multibinding_for_task(tasklist.first(), mt);
        }
        else {
            Errors.warn((SubLObject)shop_basic_plan_state.$str102$INITIALIZE_MULTIBINGINGS__Initial);
        }
        shop_basic_plan_state_set_multibindings_method(self, mbinding);
        return mbinding;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 8892L)
    public static SubLObject shop_basic_plan_state_output_message_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject log = get_shop_basic_plan_state_log(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym107$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym107$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, shop_log.shop_log_log_entry_method(log, string));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_log(self, log);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym107$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 9047L)
    public static SubLObject shop_basic_plan_state_copy_method(final SubLObject self) {
        final SubLObject new_plan_state = object.object_new_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE);
        final SubLObject object_slots = classes.classes_all_slots((SubLObject)shop_basic_plan_state.$sym14$OBJECT, (SubLObject)shop_basic_plan_state.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject slot_list = cdolist_list_var = conses_high.set_difference(classes.classes_all_slots(subloop_structures.instance_class(self), (SubLObject)shop_basic_plan_state.UNPROVIDED), object_slots, (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
        SubLObject cur_slot = (SubLObject)shop_basic_plan_state.NIL;
        cur_slot = cdolist_list_var.first();
        while (shop_basic_plan_state.NIL != cdolist_list_var) {
            instances.set_slot(new_plan_state, cur_slot, instances.get_slot(self, cur_slot));
            cdolist_list_var = cdolist_list_var.rest();
            cur_slot = cdolist_list_var.first();
        }
        return new_plan_state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 9596L)
    public static SubLObject shop_basic_plan_state_create_next_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject depth = get_shop_basic_plan_state_depth(self);
        final SubLObject tasklist = get_shop_basic_plan_state_tasklist(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym114$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                final SubLObject new_state = shop_basic_plan_state_copy_method(self);
                shop_basic_plan_state_set_tasklist_method(new_state, tasklist.rest());
                shop_basic_plan_state_set_depth_method(new_state, number_utilities.f_1X(depth));
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym114$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, new_state);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_depth(self, depth);
                    set_shop_basic_plan_state_tasklist(self, tasklist);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym114$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 9905L)
    public static SubLObject shop_basic_plan_state_init_model_with_problem_method(final SubLObject self, final SubLObject problem) {
        final SubLObject task_mt = instances.get_slot(problem, (SubLObject)shop_basic_plan_state.$sym119$TASK_MT);
        instances.set_slot(self, (SubLObject)shop_basic_plan_state.$sym18$MODEL_MT, task_mt);
        return (SubLObject)shop_basic_plan_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 10173L)
    public static SubLObject shop_basic_plan_state_set_world_state_method(final SubLObject self, final SubLObject s) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        SubLObject world_state = get_shop_basic_plan_state_world_state(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym124$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                if (shop_basic_plan_state.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && shop_basic_plan_state.NIL == shop_basic_world_state.shop_world_state_p(s)) {
                    Errors.error((SubLObject)shop_basic_plan_state.$str125$_SET_WORLD_STATE__s____S_is_not_a, self, s);
                }
                world_state = s;
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym124$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, s);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_world_state(self, world_state);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym124$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 10408L)
    public static SubLObject shop_basic_plan_state_get_world_state_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject world_state = get_shop_basic_plan_state_world_state(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym129$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym129$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, world_state);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_world_state(self, world_state);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym129$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 10502L)
    public static SubLObject shop_basic_plan_state_mbinding_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject mbindings = get_shop_basic_plan_state_mbindings(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym132$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym132$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, mbindings);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_mbindings(self, mbindings);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym132$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 10601L)
    public static SubLObject shop_basic_plan_state_set_depth_method(final SubLObject self, final SubLObject d) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        SubLObject depth = get_shop_basic_plan_state_depth(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym137$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                assert shop_basic_plan_state.NIL != Types.integerp(d) : d;
                depth = d;
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym137$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, d);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_depth(self, depth);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym137$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 10737L)
    public static SubLObject shop_basic_plan_state_depth_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject depth = get_shop_basic_plan_state_depth(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym141$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym141$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, depth);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_depth(self, depth);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym141$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 10815L)
    public static SubLObject shop_basic_plan_state_set_previous_states_method(final SubLObject self, final SubLObject states) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        SubLObject previous_states = get_shop_basic_plan_state_previous_states(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym146$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                previous_states = states;
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym146$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, states);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_previous_states(self, previous_states);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym146$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 10970L)
    public static SubLObject shop_basic_plan_state_get_previous_states_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject previous_states = get_shop_basic_plan_state_previous_states(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym150$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym150$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, previous_states);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_previous_states(self, previous_states);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym150$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 11072L)
    public static SubLObject shop_basic_plan_state_add_to_previous_states_method(final SubLObject self, final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        SubLObject previous_states = get_shop_basic_plan_state_previous_states(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym155$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                previous_states = (SubLObject)ConsesLow.cons(state, previous_states);
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym155$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, previous_states);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_previous_states(self, previous_states);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym155$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 11217L)
    public static SubLObject shop_basic_plan_state_set_partial_plan_method(final SubLObject self, final SubLObject p) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        SubLObject partial_plan = get_shop_basic_plan_state_partial_plan(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym160$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                partial_plan = p;
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym160$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, p);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_partial_plan(self, partial_plan);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym160$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 11348L)
    public static SubLObject shop_basic_plan_state_get_partial_plan_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject partial_plan = get_shop_basic_plan_state_partial_plan(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym164$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym164$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, partial_plan);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_partial_plan(self, partial_plan);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym164$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 11444L)
    public static SubLObject shop_basic_plan_state_add_to_partial_plan_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        SubLObject partial_plan = get_shop_basic_plan_state_partial_plan(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym169$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                partial_plan = (SubLObject)ConsesLow.cons(task, partial_plan);
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym169$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, partial_plan);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_partial_plan(self, partial_plan);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym169$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 11578L)
    public static SubLObject shop_basic_plan_state_add_to_post_ordering_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        SubLObject post_ordering = get_shop_basic_plan_state_post_ordering(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym173$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                post_ordering = (SubLObject)ConsesLow.cons(task, post_ordering);
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym173$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, post_ordering);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_post_ordering(self, post_ordering);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym173$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 11730L)
    public static SubLObject shop_basic_plan_state_add_to_mbindings_method(final SubLObject self, final SubLObject binding) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        SubLObject mbindings = get_shop_basic_plan_state_mbindings(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym178$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                mbindings = multibindings.compose_multibindings(binding, mbindings);
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym178$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, mbindings);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_mbindings(self, mbindings);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym178$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 11904L)
    public static SubLObject shop_basic_plan_state_planner_rules_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject task_strucs = get_shop_basic_plan_state_task_strucs(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym182$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym182$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, task_strucs);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_task_strucs(self, task_strucs);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym182$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 12014L)
    public static SubLObject shop_basic_plan_state_add_to_task_strucs_method(final SubLObject self, final SubLObject task_struc) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        SubLObject task_strucs = get_shop_basic_plan_state_task_strucs(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym187$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                task_strucs = (SubLObject)ConsesLow.cons(task_struc, task_strucs);
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym187$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, task_strucs);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_task_strucs(self, task_strucs);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym187$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 12155L)
    public static SubLObject shop_basic_plan_state_task_strucs_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject task_strucs = get_shop_basic_plan_state_task_strucs(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym189$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym189$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, task_strucs);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_task_strucs(self, task_strucs);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym189$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 12245L)
    public static SubLObject shop_basic_plan_state_get_planner_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject planner = get_shop_basic_plan_state_planner(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym193$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym193$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, planner);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_planner(self, planner);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym193$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 12342L)
    public static SubLObject shop_basic_plan_state_set_planner_method(final SubLObject self, final SubLObject p) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        SubLObject planner = get_shop_basic_plan_state_planner(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym197$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                planner = p;
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym197$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, p);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_planner(self, planner);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym197$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 12443L)
    public static SubLObject shop_basic_plan_state_get_which_plans_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject planner = get_shop_basic_plan_state_planner(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym201$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                if (shop_basic_plan_state.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && shop_basic_plan_state.NIL == planner) {
                    Errors.error((SubLObject)shop_basic_plan_state.$str202$_GET_WHICH_PLANS__S___No_planner_, self);
                }
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym201$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, shop_basic_planner_thread.shop_basic_planner_thread_get_which_plans_method(planner));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_planner(self, planner);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym201$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 12684L)
    public static SubLObject shop_basic_plan_state_simple_situation_predP_method(final SubLObject self, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject model_mt = get_shop_basic_plan_state_model_mt(self);
        final SubLObject domain = get_shop_basic_plan_state_domain(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym207$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                final SubLObject pred_set = instances.get_slot(domain, (SubLObject)shop_basic_plan_state.$sym208$SIMPLE_SITUATION_PREDS);
                if (shop_basic_plan_state.NIL != set.set_memberP(pred, pred_set)) {
                    Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym207$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)shop_basic_plan_state.T);
                }
                if (shop_basic_plan_state.NIL != isa.isaP(pred, shop_basic_plan_state.$const209$SimpleSituationPredicate, model_mt, (SubLObject)shop_basic_plan_state.UNPROVIDED)) {
                    set.set_add(pred, pred_set);
                    Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym207$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)shop_basic_plan_state.T);
                }
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym207$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)shop_basic_plan_state.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_model_mt(self, model_mt);
                    set_shop_basic_plan_state_domain(self, domain);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym207$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 13064L)
    public static SubLObject shop_basic_plan_state_seek_total_mbindings_method(final SubLObject self, final SubLObject goals, final SubLObject mbind) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject model_mt = get_shop_basic_plan_state_model_mt(self);
        final SubLObject log = get_shop_basic_plan_state_log(self);
        final SubLObject planner = get_shop_basic_plan_state_planner(self);
        final SubLObject query_properties = get_shop_basic_plan_state_query_properties(self);
        final SubLObject mbindings = get_shop_basic_plan_state_mbindings(self);
        final SubLObject world_state = get_shop_basic_plan_state_world_state(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym214$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                if (shop_basic_plan_state.NIL == goals) {
                    Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym214$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)ConsesLow.list(mbind));
                }
                final SubLObject backchain = instances.get_slot(planner, (SubLObject)shop_basic_plan_state.$sym97$NUM_BACKCHAINS);
                SubLObject v_bindings = (SubLObject)shop_basic_plan_state.NIL;
                SubLObject mbindings_$1 = (SubLObject)shop_basic_plan_state.NIL;
                SubLObject halt_reason = (SubLObject)shop_basic_plan_state.NIL;
                SubLObject inference = (SubLObject)shop_basic_plan_state.NIL;
                SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding(thread);
                final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
                final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                final SubLObject _prev_bind_12 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
                final SubLObject _prev_bind_13 = wff_utilities.$check_arityP$.currentBinding(thread);
                final SubLObject _prev_bind_14 = wff_utilities.$check_wff_constantsP$.currentBinding(thread);
                final SubLObject _prev_bind_15 = czer_vars.$simplify_sentenceP$.currentBinding(thread);
                final SubLObject _prev_bind_16 = czer_vars.$turn_existentials_into_skolemsP$.currentBinding(thread);
                final SubLObject _prev_bind_17 = czer_vars.$canonicalize_literalsP$.currentBinding(thread);
                final SubLObject _prev_bind_18 = czer_vars.$canonicalize_functionsP$.currentBinding(thread);
                try {
                    control_vars.$within_assert$.bind((SubLObject)shop_basic_plan_state.NIL, thread);
                    wff_utilities.$check_arg_typesP$.bind((SubLObject)shop_basic_plan_state.NIL, thread);
                    at_vars.$at_check_arg_typesP$.bind((SubLObject)shop_basic_plan_state.NIL, thread);
                    wff_utilities.$check_wff_semanticsP$.bind((SubLObject)shop_basic_plan_state.NIL, thread);
                    wff_utilities.$check_wff_coherenceP$.bind((SubLObject)shop_basic_plan_state.NIL, thread);
                    wff_utilities.$check_var_typesP$.bind((SubLObject)shop_basic_plan_state.NIL, thread);
                    czer_vars.$simplify_literalP$.bind((SubLObject)shop_basic_plan_state.NIL, thread);
                    at_vars.$at_check_relator_constraintsP$.bind((SubLObject)shop_basic_plan_state.NIL, thread);
                    at_vars.$at_check_arg_formatP$.bind((SubLObject)shop_basic_plan_state.NIL, thread);
                    wff_vars.$validate_constantsP$.bind((SubLObject)shop_basic_plan_state.NIL, thread);
                    system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    api_control_vars.$generate_readable_fi_results$.bind((SubLObject)shop_basic_plan_state.NIL, thread);
                    wff_utilities.$check_arityP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    wff_utilities.$check_wff_constantsP$.bind((SubLObject)shop_basic_plan_state.NIL, thread);
                    czer_vars.$simplify_sentenceP$.bind((SubLObject)shop_basic_plan_state.NIL, thread);
                    czer_vars.$turn_existentials_into_skolemsP$.bind((SubLObject)shop_basic_plan_state.NIL, thread);
                    czer_vars.$canonicalize_literalsP$.bind((SubLObject)shop_basic_plan_state.NIL, thread);
                    czer_vars.$canonicalize_functionsP$.bind(shop_basic_plan_state.$shop_canonicalize_functionsP$.getDynamicValue(thread), thread);
                    if (shop_basic_plan_state.NIL != shop_parameters.$shop_use_mt_world_statesP$.getDynamicValue(thread)) {
                        v_bindings = shop_mt_world_state.shop_mt_world_state_ask_method(world_state, (SubLObject)ConsesLow.cons(shop_basic_plan_state.$const215$and, goals), mbind, backchain);
                    }
                    else {
                        final SubLObject _prev_bind_0_$2 = shop_parameters.$shop_ask_plan_state$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$3 = shop_parameters.$shop_ask_multibinding$.currentBinding(thread);
                        try {
                            shop_parameters.$shop_ask_plan_state$.bind(get_shop_basic_plan_state_world_state(self), thread);
                            shop_parameters.$shop_ask_multibinding$.bind(get_shop_basic_plan_state_mbindings(self), thread);
                            if (shop_basic_plan_state.NIL != shop_parameters.$shop_use_shop_askP$.getDynamicValue(thread)) {
                                thread.resetMultipleValues();
                                final SubLObject v_bindings_$4 = shop_inference.shop_ask_int((SubLObject)ConsesLow.cons(shop_basic_plan_state.$const215$and, goals), model_mt, query_properties);
                                final SubLObject halt_reason_$5 = thread.secondMultipleValue();
                                final SubLObject inference_$6 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                v_bindings = v_bindings_$4;
                                halt_reason = halt_reason_$5;
                                inference = inference_$6;
                            }
                            else {
                                thread.resetMultipleValues();
                                final SubLObject v_bindings_$5 = inference_kernel.new_cyc_query((SubLObject)ConsesLow.cons(shop_basic_plan_state.$const215$and, goals), model_mt, query_properties);
                                final SubLObject halt_reason_$6 = thread.secondMultipleValue();
                                final SubLObject inference_$7 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                v_bindings = v_bindings_$5;
                                halt_reason = halt_reason_$6;
                                inference = inference_$7;
                            }
                        }
                        finally {
                            shop_parameters.$shop_ask_multibinding$.rebind(_prev_bind_1_$3, thread);
                            shop_parameters.$shop_ask_plan_state$.rebind(_prev_bind_0_$2, thread);
                        }
                        v_bindings = shop_basic_world_state.confirm_bindings_against_world_state(world_state, goals, v_bindings);
                    }
                }
                finally {
                    czer_vars.$canonicalize_functionsP$.rebind(_prev_bind_18, thread);
                    czer_vars.$canonicalize_literalsP$.rebind(_prev_bind_17, thread);
                    czer_vars.$turn_existentials_into_skolemsP$.rebind(_prev_bind_16, thread);
                    czer_vars.$simplify_sentenceP$.rebind(_prev_bind_15, thread);
                    wff_utilities.$check_wff_constantsP$.rebind(_prev_bind_14, thread);
                    wff_utilities.$check_arityP$.rebind(_prev_bind_13, thread);
                    api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_12, thread);
                    system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                    wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                    at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                    czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                    wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                    wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                    at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                    wff_utilities.$check_arg_typesP$.rebind(_prev_bind_2, thread);
                    control_vars.$within_assert$.rebind(_prev_bind_0, thread);
                }
                shop_internals.shop_statistic_manager_add_inference_method(instances.get_slot(planner, (SubLObject)shop_basic_plan_state.$sym216$STATS_MANAGER));
                final SubLObject entry = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw217$CYC_QUERY, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                final SubLObject verbose_msg_level = (SubLObject)((shop_basic_plan_state.NIL != entry) ? entry.rest() : shop_basic_plan_state.ZERO_INTEGER);
                final SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                if (verbose_thread_level.numGE(verbose_msg_level)) {
                    methods.funcall_instance_method_with_3_args(log, (SubLObject)shop_basic_plan_state.$sym219$LOG_INFERENCE, v_bindings, halt_reason, inference);
                }
                if (shop_basic_plan_state.NIL == shop_parameters.$shop_use_inference_supportsP$.getDynamicValue(thread)) {
                    v_bindings = conses_high.pairlis(v_bindings, (SubLObject)ConsesLow.make_list(Sequences.length(v_bindings), (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan_state.NIL)), (SubLObject)shop_basic_plan_state.UNPROVIDED);
                }
                if (shop_basic_plan_state.NIL != v_bindings) {
                    if (conses_high.caar(v_bindings).equal((SubLObject)shop_basic_plan_state.$list220)) {
                        mbindings_$1 = (SubLObject)ConsesLow.list(mbind);
                    }
                    else {
                        _prev_bind_0 = multibindings.$mb_reify_natsP$.currentBinding(thread);
                        try {
                            multibindings.$mb_reify_natsP$.bind((SubLObject)shop_basic_plan_state.NIL, thread);
                            mbindings_$1 = multibindings.convert_binding_lists_and_supports_to_mbinds(v_bindings, mbind, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                        }
                        finally {
                            multibindings.$mb_reify_natsP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (shop_basic_plan_state.NIL != multibindings.multibinding_failedP(mbindings_$1)) {
                    Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym214$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)shop_basic_plan_state.NIL);
                }
                else {
                    Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym214$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, mbindings_$1);
                }
            }
            finally {
                final SubLObject _prev_bind_19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_model_mt(self, model_mt);
                    set_shop_basic_plan_state_log(self, log);
                    set_shop_basic_plan_state_planner(self, planner);
                    set_shop_basic_plan_state_query_properties(self, query_properties);
                    set_shop_basic_plan_state_mbindings(self, mbindings);
                    set_shop_basic_plan_state_world_state(self, world_state);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_19, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym214$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 15401L)
    public static SubLObject shop_basic_plan_state_find_mbindings_method(final SubLObject self, final SubLObject goals, final SubLObject mbinding) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (shop_basic_plan_state.NIL != shop_parameters.$shop_infer_complete_preconditionsP$.getDynamicValue(thread)) {
            return shop_basic_plan_state_seek_total_mbindings_method(self, goals, multibindings.copy_multibinding(mbinding));
        }
        return (SubLObject)shop_basic_plan_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 15793L)
    public static SubLObject shop_same_taskP(final SubLObject task1, final SubLObject task2) {
        if (task1.equal(task2)) {
            return (SubLObject)shop_basic_plan_state.T;
        }
        final SubLObject mgu = shop_datastructures.shop_unify(task1, task2);
        if (shop_basic_plan_state.NIL == shop_datastructures.shop_unify_failedP(mgu)) {
            return (SubLObject)shop_basic_plan_state.T;
        }
        return (SubLObject)shop_basic_plan_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 16121L)
    public static SubLObject shop_find_next_match(final SubLObject task, final SubLObject potentials) {
        return conses_high.member(task, potentials, (SubLObject)shop_basic_plan_state.$sym226$SHOP_SAME_TASK_, (SubLObject)shop_basic_plan_state.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 16375L)
    public static SubLObject shop_basic_plan_state_parent_taskP_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject post_ordering = get_shop_basic_plan_state_post_ordering(self);
        final SubLObject partial_plan = get_shop_basic_plan_state_partial_plan(self);
        SubLObject mbindings = get_shop_basic_plan_state_mbindings(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym229$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                final SubLObject potential_list = partial_plan;
                SubLObject cur_potentials;
                SubLObject cur_task;
                SubLObject unifer;
                SubLObject _prev_bind_0;
                SubLObject unifier_mb;
                SubLObject inverse_mb;
                for (cur_potentials = (SubLObject)shop_basic_plan_state.NIL, cur_potentials = shop_find_next_match(task, potential_list); shop_basic_plan_state.NIL != cur_potentials; cur_potentials = shop_find_next_match(task, cur_potentials.rest())) {
                    cur_task = cur_potentials.first();
                    if (task.equal(cur_task) && shop_basic_plan_state.NIL == subl_promotions.memberP(cur_task, post_ordering, Symbols.symbol_function((SubLObject)shop_basic_plan_state.EQ), (SubLObject)shop_basic_plan_state.UNPROVIDED)) {
                        Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym229$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)shop_basic_plan_state.T);
                    }
                    unifer = shop_datastructures.shop_unify(task, cur_task);
                    if (shop_basic_plan_state.NIL == shop_datastructures.shop_unify_failedP(unifer)) {
                        _prev_bind_0 = multibindings.$mb_reify_natsP$.currentBinding(thread);
                        try {
                            multibindings.$mb_reify_natsP$.bind((SubLObject)shop_basic_plan_state.NIL, thread);
                            unifier_mb = multibindings.convert_binding_to_mbind(unifer, mbindings);
                            if (shop_basic_plan_state.NIL != unifier_mb) {
                                inverse_mb = multibindings.mb_inverse(mbindings, unifier_mb);
                                if (shop_basic_plan_state.NIL != shop_datastructures.shop_unify_failedP(inverse_mb)) {
                                    if (shop_basic_plan_state.NIL == subl_promotions.memberP(cur_task, post_ordering, Symbols.symbol_function((SubLObject)shop_basic_plan_state.EQ), (SubLObject)shop_basic_plan_state.UNPROVIDED)) {
                                        Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym229$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)shop_basic_plan_state.T);
                                    }
                                }
                                else {
                                    mbindings = inverse_mb;
                                }
                            }
                        }
                        finally {
                            multibindings.$mb_reify_natsP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym229$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)shop_basic_plan_state.NIL);
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym229$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)shop_basic_plan_state.NIL);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_post_ordering(self, post_ordering);
                    set_shop_basic_plan_state_partial_plan(self, partial_plan);
                    set_shop_basic_plan_state_mbindings(self, mbindings);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym229$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 17790L)
    public static SubLObject shop_basic_plan_state_expand_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject log = get_shop_basic_plan_state_log(self);
        final SubLObject depth = get_shop_basic_plan_state_depth(self);
        SubLObject tasklist = get_shop_basic_plan_state_tasklist(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym233$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                final SubLObject task1 = tasklist.first();
                final SubLObject taskname = cycl_utilities.formula_operator(task1);
                SubLObject entry = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw234$TASKS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                SubLObject verbose_msg_level = (SubLObject)((shop_basic_plan_state.NIL != entry) ? entry.rest() : shop_basic_plan_state.ZERO_INTEGER);
                SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                if (verbose_thread_level.numGE(verbose_msg_level)) {
                    methods.funcall_instance_method_with_0_args(log, (SubLObject)shop_basic_plan_state.$sym235$NEW_SECTION);
                    methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym236$LOG_HEADING, PrintLow.format((SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$str237$Search_Depth__s, depth));
                    shop_basic_plan_state_output_message_method(self, PrintLow.format((SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$str238$task__s, task1));
                    final SubLObject entry_$10 = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw239$ALL, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                    final SubLObject verbose_msg_level_$11 = (SubLObject)((shop_basic_plan_state.NIL != entry_$10) ? entry_$10.rest() : shop_basic_plan_state.ZERO_INTEGER);
                    final SubLObject verbose_thread_level_$12 = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                    if (verbose_thread_level_$12.numGE(verbose_msg_level_$11)) {}
                }
                if (taskname == shop_basic_plan_state.$kw58$SUPERTASK) {
                    shop_basic_plan_state_add_to_post_ordering_method(self, cycl_utilities.formula_arg1(task1, (SubLObject)shop_basic_plan_state.UNPROVIDED));
                    tasklist = tasklist.rest();
                    Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym233$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)ConsesLow.list(self));
                }
                else if (shop_basic_plan_state.NIL != shop_parameters.$shop_method_cycle_checking_enabledP$.getDynamicValue(thread) && shop_basic_plan_state.NIL != shop_basic_plan_state_parent_taskP_method(self, task1)) {
                    entry = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw240$GOALS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                    verbose_msg_level = (SubLObject)((shop_basic_plan_state.NIL != entry) ? entry.rest() : shop_basic_plan_state.ZERO_INTEGER);
                    verbose_thread_level = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                    if (verbose_thread_level.numGE(verbose_msg_level)) {
                        methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym241$WARNING, (SubLObject)shop_basic_plan_state.$str242$Prune____Method_Cycle_checking_de);
                    }
                    Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym233$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)shop_basic_plan_state.NIL);
                }
                else if (shop_basic_plan_state.NIL != shop_basic_plan_state_simple_situation_predP_method(self, taskname)) {
                    Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym233$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, shop_basic_plan_state_expand_primitive_preconditions_method(self, task1));
                }
                else {
                    Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym233$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, shop_basic_plan_state_expand_complex_method(self, task1));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_log(self, log);
                    set_shop_basic_plan_state_depth(self, depth);
                    set_shop_basic_plan_state_tasklist(self, tasklist);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym233$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 18908L)
    public static SubLObject shop_basic_plan_state_expand_complex_method(final SubLObject self, final SubLObject task) {
        SubLObject current;
        final SubLObject datum = current = shop_basic_plan_state_apply_all_sufficient_conditions_method(self, task);
        SubLObject scond_nodes = (SubLObject)shop_basic_plan_state.NIL;
        SubLObject inverse_unifiers = (SubLObject)shop_basic_plan_state.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_plan_state.$list246);
        scond_nodes = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_plan_state.$list246);
        inverse_unifiers = current.first();
        current = current.rest();
        if (shop_basic_plan_state.NIL == current) {
            SubLObject method_nodes = (SubLObject)shop_basic_plan_state.NIL;
            if (shop_basic_plan_state.NIL != scond_nodes) {
                SubLObject cdolist_list_var = inverse_unifiers;
                SubLObject cur_unifier = (SubLObject)shop_basic_plan_state.NIL;
                cur_unifier = cdolist_list_var.first();
                while (shop_basic_plan_state.NIL != cdolist_list_var) {
                    if (shop_basic_plan_state.NIL == multibindings.multibinding_failedP(cur_unifier)) {
                        final SubLObject simple_unifier = shop_basic_plan_state_applicable_multibinding_method(self, cur_unifier);
                        SubLObject cdolist_list_var_$13;
                        final SubLObject new_tasks = cdolist_list_var_$13 = multibindings.apply_multibinding(task, simple_unifier);
                        SubLObject cur_task = (SubLObject)shop_basic_plan_state.NIL;
                        cur_task = cdolist_list_var_$13.first();
                        while (shop_basic_plan_state.NIL != cdolist_list_var_$13) {
                            method_nodes = ConsesLow.append(shop_basic_plan_state_apply_all_methods_method(self, cur_task), method_nodes);
                            cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                            cur_task = cdolist_list_var_$13.first();
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cur_unifier = cdolist_list_var.first();
                }
            }
            else {
                method_nodes = shop_basic_plan_state_apply_all_methods_method(self, task);
            }
            return ConsesLow.append(scond_nodes, method_nodes);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)shop_basic_plan_state.$list246);
        return (SubLObject)shop_basic_plan_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 19595L)
    public static SubLObject shop_basic_plan_state_expand_primitive_preconditions_method(final SubLObject self, final SubLObject task) {
        if (shop_basic_plan_state.NIL != shop_basic_plan_state_apply_all_preconditions_method(self, task)) {
            return shop_basic_plan_state_expand_primitive_method(self, task);
        }
        return (SubLObject)shop_basic_plan_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 19774L)
    public static SubLObject shop_basic_plan_state_expand_primitive_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject domain = get_shop_basic_plan_state_domain(self);
        final SubLObject log = get_shop_basic_plan_state_log(self);
        final SubLObject planner = get_shop_basic_plan_state_planner(self);
        final SubLObject previous_states = get_shop_basic_plan_state_previous_states(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym253$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                final SubLObject entry = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw254$OPERATORS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                final SubLObject verbose_msg_level = (SubLObject)((shop_basic_plan_state.NIL != entry) ? entry.rest() : shop_basic_plan_state.ZERO_INTEGER);
                final SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                if (verbose_thread_level.numGE(verbose_msg_level)) {
                    methods.funcall_instance_method_with_0_args(log, (SubLObject)shop_basic_plan_state.$sym255$LOG_NEWLINE);
                    methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym256$LOG_ENTRY, (SubLObject)shop_basic_plan_state.$str257$Finding_operators_for_task___);
                }
                final SubLObject domain_$14 = shop_basic_planner_thread.shop_basic_planner_thread_get_domain_method(planner);
                final SubLObject operators = shop_domain.shop_basic_domain_get_operators_method(domain_$14, task);
                final SubLObject cond_operators = shop_domain.shop_basic_domain_get_conditional_operators_method(domain_$14, task);
                SubLObject new_plan_state = (SubLObject)shop_basic_plan_state.NIL;
                SubLObject new_world_state = (SubLObject)shop_basic_plan_state.NIL;
                if (shop_basic_plan_state.NIL == operators) {
                    methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym241$WARNING, (SubLObject)shop_basic_plan_state.$str258$No_operator_for_task);
                    new_plan_state = shop_basic_plan_state_create_next_method(self);
                    shop_basic_plan_state_add_to_partial_plan_method(new_plan_state, task);
                    shop_basic_plan_state_add_to_task_strucs_method(new_plan_state, (SubLObject)shop_basic_plan_state.NIL);
                    shop_basic_plan_state_add_decomposition_method(new_plan_state, task, (SubLObject)shop_basic_plan_state.NIL);
                    Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym253$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)ConsesLow.list(new_plan_state));
                }
                new_world_state = shop_basic_plan_state_apply_operators_method(self, task, operators, cond_operators);
                if (shop_basic_plan_state.NIL == new_world_state) {
                    Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym253$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)shop_basic_plan_state.NIL);
                }
                if (shop_basic_plan_state.NIL != instances.get_slot(planner, (SubLObject)shop_basic_plan_state.$sym259$CYCLE_CHECKING)) {
                    SubLObject cdolist_list_var = instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym35$PREVIOUS_STATES);
                    SubLObject old_state = (SubLObject)shop_basic_plan_state.NIL;
                    old_state = cdolist_list_var.first();
                    while (shop_basic_plan_state.NIL != cdolist_list_var) {
                        if (shop_basic_plan_state.NIL != shop_basic_world_state.shop_basic_world_state_same_state_p_method(new_world_state, new_world_state, old_state)) {
                            final SubLObject entry2 = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw260$CUTOFFS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                            final SubLObject verbose_msg_level2 = (SubLObject)((shop_basic_plan_state.NIL != entry2) ? entry2.rest() : shop_basic_plan_state.ZERO_INTEGER);
                            final SubLObject verbose_thread_level2 = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                            if (verbose_thread_level2.numGE(verbose_msg_level2)) {
                                methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym241$WARNING, (SubLObject)shop_basic_plan_state.$str261$Prune____World_State_Cycle_Checki);
                            }
                            Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym253$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)shop_basic_plan_state.NIL);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        old_state = cdolist_list_var.first();
                    }
                }
                new_plan_state = shop_basic_plan_state_create_next_method(self);
                shop_basic_plan_state_set_world_state_method(new_plan_state, new_world_state);
                shop_basic_plan_state_add_to_previous_states_method(new_plan_state, new_world_state);
                shop_basic_plan_state_add_to_partial_plan_method(new_plan_state, task);
                shop_basic_plan_state_add_to_task_strucs_method(new_plan_state, ConsesLow.append(operators, cond_operators));
                shop_basic_plan_state_add_decomposition_method(new_plan_state, task, (SubLObject)shop_basic_plan_state.NIL);
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym253$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)ConsesLow.list(new_plan_state));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_domain(self, domain);
                    set_shop_basic_plan_state_log(self, log);
                    set_shop_basic_plan_state_planner(self, planner);
                    set_shop_basic_plan_state_previous_states(self, previous_states);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym253$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 22015L)
    public static SubLObject shop_basic_plan_state_apply_operators_method(final SubLObject self, final SubLObject task, final SubLObject operators, final SubLObject cond_operators) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject log = get_shop_basic_plan_state_log(self);
        final SubLObject world_state = get_shop_basic_plan_state_world_state(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym266$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                final SubLObject result = methods.funcall_instance_method_with_0_args(world_state, (SubLObject)shop_basic_plan_state.$sym267$NEXT_STATE);
                SubLObject adds = (SubLObject)shop_basic_plan_state.NIL;
                SubLObject deletes = (SubLObject)shop_basic_plan_state.NIL;
                final SubLObject total_num = conses_high.list_length(cond_operators);
                SubLObject cdolist_list_var = operators;
                SubLObject cur_op = (SubLObject)shop_basic_plan_state.NIL;
                cur_op = cdolist_list_var.first();
                while (shop_basic_plan_state.NIL != cdolist_list_var) {
                    thread.resetMultipleValues();
                    final SubLObject new_adds = shop_basic_plan_state_apply_operator_method(self, task, cur_op);
                    final SubLObject new_deletes = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject cdolist_list_var_$15 = new_adds;
                    SubLObject lit = (SubLObject)shop_basic_plan_state.NIL;
                    lit = cdolist_list_var_$15.first();
                    while (shop_basic_plan_state.NIL != cdolist_list_var_$15) {
                        final SubLObject item_var = lit;
                        if (shop_basic_plan_state.NIL == conses_high.member(item_var, adds, Symbols.symbol_function((SubLObject)shop_basic_plan_state.EQL), Symbols.symbol_function((SubLObject)shop_basic_plan_state.IDENTITY))) {
                            adds = (SubLObject)ConsesLow.cons(item_var, adds);
                        }
                        cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                        lit = cdolist_list_var_$15.first();
                    }
                    SubLObject cdolist_list_var_$16 = new_deletes;
                    lit = (SubLObject)shop_basic_plan_state.NIL;
                    lit = cdolist_list_var_$16.first();
                    while (shop_basic_plan_state.NIL != cdolist_list_var_$16) {
                        final SubLObject item_var = lit;
                        if (shop_basic_plan_state.NIL == conses_high.member(item_var, deletes, Symbols.symbol_function((SubLObject)shop_basic_plan_state.EQL), Symbols.symbol_function((SubLObject)shop_basic_plan_state.IDENTITY))) {
                            deletes = (SubLObject)ConsesLow.cons(item_var, deletes);
                        }
                        cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                        lit = cdolist_list_var_$16.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cur_op = cdolist_list_var.first();
                }
                SubLObject list_var = (SubLObject)shop_basic_plan_state.NIL;
                cur_op = (SubLObject)shop_basic_plan_state.NIL;
                SubLObject cur_num = (SubLObject)shop_basic_plan_state.NIL;
                list_var = cond_operators;
                cur_op = list_var.first();
                for (cur_num = (SubLObject)shop_basic_plan_state.ZERO_INTEGER; shop_basic_plan_state.NIL != list_var; list_var = list_var.rest(), cur_op = list_var.first(), cur_num = Numbers.add((SubLObject)shop_basic_plan_state.ONE_INTEGER, cur_num)) {
                    final SubLObject entry = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw254$OPERATORS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                    final SubLObject verbose_msg_level = (SubLObject)((shop_basic_plan_state.NIL != entry) ? entry.rest() : shop_basic_plan_state.ZERO_INTEGER);
                    final SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                    if (verbose_thread_level.numGE(verbose_msg_level)) {
                        methods.funcall_instance_method_with_2_args(log, (SubLObject)shop_basic_plan_state.$sym268$LOG_FANCY_ENTRY, PrintLow.format((SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$str269$Trying___s__s__, number_utilities.f_1X(cur_num), total_num), (SubLObject)shop_basic_plan_state.$list270);
                        methods.funcall_instance_method_with_0_args(log, (SubLObject)shop_basic_plan_state.$sym255$LOG_NEWLINE);
                    }
                    thread.resetMultipleValues();
                    final SubLObject new_adds2 = shop_basic_plan_state_apply_conditional_operator_method(self, task, cur_op);
                    final SubLObject new_deletes2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject cdolist_list_var2 = new_adds2;
                    SubLObject lit2 = (SubLObject)shop_basic_plan_state.NIL;
                    lit2 = cdolist_list_var2.first();
                    while (shop_basic_plan_state.NIL != cdolist_list_var2) {
                        final SubLObject item_var2 = lit2;
                        if (shop_basic_plan_state.NIL == conses_high.member(item_var2, adds, Symbols.symbol_function((SubLObject)shop_basic_plan_state.EQL), Symbols.symbol_function((SubLObject)shop_basic_plan_state.IDENTITY))) {
                            adds = (SubLObject)ConsesLow.cons(item_var2, adds);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        lit2 = cdolist_list_var2.first();
                    }
                    cdolist_list_var2 = new_deletes2;
                    lit2 = (SubLObject)shop_basic_plan_state.NIL;
                    lit2 = cdolist_list_var2.first();
                    while (shop_basic_plan_state.NIL != cdolist_list_var2) {
                        final SubLObject item_var2 = lit2;
                        if (shop_basic_plan_state.NIL == conses_high.member(item_var2, deletes, Symbols.symbol_function((SubLObject)shop_basic_plan_state.EQL), Symbols.symbol_function((SubLObject)shop_basic_plan_state.IDENTITY))) {
                            deletes = (SubLObject)ConsesLow.cons(item_var2, deletes);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        lit2 = cdolist_list_var2.first();
                    }
                }
                final SubLObject entry2 = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw254$OPERATORS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                final SubLObject verbose_msg_level2 = (SubLObject)((shop_basic_plan_state.NIL != entry2) ? entry2.rest() : shop_basic_plan_state.ZERO_INTEGER);
                final SubLObject verbose_thread_level2 = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                if (verbose_thread_level2.numGE(verbose_msg_level2)) {
                    methods.funcall_instance_method_with_0_args(log, (SubLObject)shop_basic_plan_state.$sym255$LOG_NEWLINE);
                    methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym256$LOG_ENTRY, (SubLObject)shop_basic_plan_state.$str271$Making_New_World_State);
                    methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym256$LOG_ENTRY, (SubLObject)shop_basic_plan_state.$str272$Adds__);
                    methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym256$LOG_ENTRY, PrintLow.write_to_string(adds, shop_basic_plan_state.EMPTY_SUBL_OBJECT_ARRAY));
                    methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym256$LOG_ENTRY, (SubLObject)shop_basic_plan_state.$str273$Deletes__);
                    methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym256$LOG_ENTRY, PrintLow.write_to_string(deletes, shop_basic_plan_state.EMPTY_SUBL_OBJECT_ARRAY));
                    final SubLObject race_lits = conses_high.intersection(adds, deletes, Symbols.symbol_function((SubLObject)shop_basic_plan_state.EQUAL), (SubLObject)shop_basic_plan_state.UNPROVIDED);
                    if (shop_basic_plan_state.NIL != race_lits) {
                        shop_basic_plan_state_output_message_method(self, PrintLow.format((SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$str274$Warning__Add_Delete_race_conditio, new SubLObject[] { race_lits, operators, cond_operators }));
                    }
                }
                methods.funcall_instance_method_with_1_args(result, (SubLObject)shop_basic_plan_state.$sym275$DELETE_LITERALS, deletes);
                methods.funcall_instance_method_with_1_args(result, (SubLObject)shop_basic_plan_state.$sym276$ADD_LITERALS, adds);
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym266$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, result);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_log(self, log);
                    set_shop_basic_plan_state_world_state(self, world_state);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym266$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 23591L)
    public static SubLObject shop_basic_plan_state_apply_operator_method(final SubLObject self, final SubLObject task, final SubLObject operator) {
        final SubLObject head = shop_datastructures.get_shop_basic_planner_rule_head(operator);
        final SubLObject unifier = shop_datastructures.shop_unify(head.rest(), task.rest());
        if (shop_basic_plan_state.NIL == shop_datastructures.shop_unify_failedP(unifier)) {
            final SubLObject deletions = shop_datastructures.shop_basic_operator_get_deletes_method(operator);
            final SubLObject additions = shop_datastructures.shop_basic_operator_get_adds_method(operator);
            return Values.values(shop_datastructures.shop_apply_substitution(additions, unifier), shop_datastructures.shop_apply_substitution(deletions, unifier));
        }
        return (SubLObject)shop_basic_plan_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 24466L)
    public static SubLObject shop_basic_plan_state_apply_conditional_operator_method(final SubLObject self, final SubLObject task, final SubLObject operator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject log = get_shop_basic_plan_state_log(self);
        final SubLObject planner = get_shop_basic_plan_state_planner(self);
        final SubLObject mbindings = get_shop_basic_plan_state_mbindings(self);
        final SubLObject world_state = get_shop_basic_plan_state_world_state(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym284$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                final SubLObject var_manager = instances.get_slot(planner, (SubLObject)shop_basic_plan_state.$sym95$VAR_MANAGER);
                final SubLObject head = shop_datastructures.get_shop_basic_planner_rule_head(operator);
                SubLObject adds = shop_datastructures.shop_basic_conditional_effect_adds_method(operator);
                SubLObject deletes = shop_datastructures.shop_basic_conditional_effect_deletes_method(operator);
                final SubLObject condition = shop_datastructures.shop_basic_conditional_effect_condition_method(operator);
                SubLObject sub_list = (SubLObject)ConsesLow.list(condition, adds, deletes);
                final SubLObject unifier = shop_datastructures.shop_unify(head.rest(), task.rest());
                SubLObject world_state_mbindings = (SubLObject)shop_basic_plan_state.NIL;
                if (shop_basic_plan_state.NIL != shop_datastructures.shop_unify_failedP(unifier)) {
                    Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym284$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, world_state);
                }
                final SubLObject entry = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw254$OPERATORS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                final SubLObject verbose_msg_level = (SubLObject)((shop_basic_plan_state.NIL != entry) ? entry.rest() : shop_basic_plan_state.ZERO_INTEGER);
                final SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                if (verbose_thread_level.numGE(verbose_msg_level)) {
                    methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym285$LOG_PLANNER_RULE, operator);
                }
                sub_list = shop_datastructures.shop_apply_substitution(sub_list, unifier);
                sub_list = shop_internals.shop_variable_manager_replace_variables_method(var_manager, sub_list, mbindings);
                world_state_mbindings = shop_basic_plan_state_find_mbindings_method(self, sub_list.first(), mbindings);
                if (shop_basic_plan_state.NIL != world_state_mbindings) {
                    if (shop_basic_plan_state.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && shop_basic_plan_state.NIL == list_utilities.singletonP(world_state_mbindings)) {
                        Errors.error((SubLObject)shop_basic_plan_state.$str286$_apply_conditional_operator_shop_, world_state_mbindings);
                    }
                    final SubLObject simple_mbinding = shop_basic_plan_state_applicable_multibinding_method(self, world_state_mbindings.first());
                    adds = multibindings.apply_multibinding(conses_high.second(sub_list), simple_mbinding).first();
                    deletes = multibindings.apply_multibinding(conses_high.third(sub_list), simple_mbinding).first();
                    Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym284$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, Values.values(adds, deletes));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_log(self, log);
                    set_shop_basic_plan_state_planner(self, planner);
                    set_shop_basic_plan_state_mbindings(self, mbindings);
                    set_shop_basic_plan_state_world_state(self, world_state);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym284$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 26059L)
    public static SubLObject shop_basic_plan_state_unify_planner_rule_method(final SubLObject self, final SubLObject task, final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject planner = get_shop_basic_plan_state_planner(self);
        final SubLObject mbindings = get_shop_basic_plan_state_mbindings(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym291$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                final SubLObject var_manager = instances.get_slot(planner, (SubLObject)shop_basic_plan_state.$sym95$VAR_MANAGER);
                final SubLObject simple_mbinding = shop_basic_plan_state_applicable_multibinding_method(self, mbindings);
                final SubLObject unified_head_data = methods.funcall_instance_method_with_1_args(rule, (SubLObject)shop_basic_plan_state.$sym292$UNIFY_TASK_TO_HEAD_WITH_DATA, task);
                if (shop_basic_plan_state.NIL != unified_head_data) {
                    final SubLObject task_unifier = unified_head_data.first();
                    final SubLObject rule_data = unified_head_data.rest();
                    if (shop_basic_plan_state.NIL == shop_datastructures.shop_unify_failedP(task_unifier)) {
                        SubLObject precond_decomp = multibindings.apply_multibinding(rule_data, simple_mbinding).first();
                        final SubLObject generated_var_bpairs = shop_internals.shop_variable_manager_generated_variables_bound_method((SubLObject)shop_basic_plan_state.$sym293$SHOP_VARIABLE_MANAGER, task_unifier);
                        final SubLObject new_mbindings = multibindings.mb_add_bindings(mbindings, generated_var_bpairs);
                        final SubLObject assertion = methods.funcall_instance_method_with_0_args(rule, (SubLObject)shop_basic_plan_state.$sym294$ASSERTIONS).first();
                        if (shop_basic_plan_state.NIL != assertion) {
                            final SubLObject el_vars = assertions_high.assertion_el_variables(assertion);
                            final SubLObject hl_vars = assertions_high.assertion_hl_variables(assertion);
                            final SubLObject el_subst = conses_high.pairlis(hl_vars, el_vars, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                            precond_decomp = conses_high.sublis(el_subst, precond_decomp, (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                        }
                        final SubLObject decomp = shop_internals.shop_variable_manager_replace_variables_method(var_manager, precond_decomp, new_mbindings);
                        Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym291$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)ConsesLow.cons(new_mbindings, decomp));
                    }
                }
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym291$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)shop_basic_plan_state.$kw295$FAIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_planner(self, planner);
                    set_shop_basic_plan_state_mbindings(self, mbindings);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym291$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 28036L)
    public static SubLObject shop_basic_plan_state_apply_all_methods_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject domain = get_shop_basic_plan_state_domain(self);
        final SubLObject log = get_shop_basic_plan_state_log(self);
        final SubLObject planner = get_shop_basic_plan_state_planner(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym299$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                SubLObject new_nodes = (SubLObject)shop_basic_plan_state.NIL;
                final SubLObject domain_$17 = shop_basic_planner_thread.shop_basic_planner_thread_get_domain_method(planner);
                final SubLObject task_pred_matched_methods = shop_domain.shop_basic_domain_get_methods_method(domain_$17, task);
                final SubLObject total_num = conses_high.list_length(task_pred_matched_methods);
                SubLObject entry = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw300$PLANNER_RULES, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                SubLObject verbose_msg_level = (SubLObject)((shop_basic_plan_state.NIL != entry) ? entry.rest() : shop_basic_plan_state.ZERO_INTEGER);
                SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                if (verbose_thread_level.numGE(verbose_msg_level)) {
                    methods.funcall_instance_method_with_0_args(log, (SubLObject)shop_basic_plan_state.$sym255$LOG_NEWLINE);
                    methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym256$LOG_ENTRY, (SubLObject)shop_basic_plan_state.$str301$Finding_methods_for_task___);
                }
                if (shop_basic_plan_state.NIL != task_pred_matched_methods) {
                    SubLObject list_var = (SubLObject)shop_basic_plan_state.NIL;
                    SubLObject cur_method = (SubLObject)shop_basic_plan_state.NIL;
                    SubLObject cur_num = (SubLObject)shop_basic_plan_state.NIL;
                    list_var = task_pred_matched_methods;
                    cur_method = list_var.first();
                    for (cur_num = (SubLObject)shop_basic_plan_state.ZERO_INTEGER; shop_basic_plan_state.NIL != list_var; list_var = list_var.rest(), cur_method = list_var.first(), cur_num = Numbers.add((SubLObject)shop_basic_plan_state.ONE_INTEGER, cur_num)) {
                        final SubLObject entry2 = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw300$PLANNER_RULES, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                        final SubLObject verbose_msg_level2 = (SubLObject)((shop_basic_plan_state.NIL != entry2) ? entry2.rest() : shop_basic_plan_state.ZERO_INTEGER);
                        final SubLObject verbose_thread_level2 = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                        if (verbose_thread_level2.numGE(verbose_msg_level2)) {
                            methods.funcall_instance_method_with_2_args(log, (SubLObject)shop_basic_plan_state.$sym268$LOG_FANCY_ENTRY, PrintLow.format((SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$str269$Trying___s__s__, number_utilities.f_1X(cur_num), total_num), (SubLObject)shop_basic_plan_state.$list270);
                            methods.funcall_instance_method_with_0_args(log, (SubLObject)shop_basic_plan_state.$sym255$LOG_NEWLINE);
                        }
                        new_nodes = ConsesLow.append(shop_basic_plan_state_apply_method_method(self, task, cur_method), new_nodes);
                    }
                }
                else {
                    entry = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw240$GOALS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                    verbose_msg_level = (SubLObject)((shop_basic_plan_state.NIL != entry) ? entry.rest() : shop_basic_plan_state.ZERO_INTEGER);
                    verbose_thread_level = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                    if (verbose_thread_level.numGE(verbose_msg_level)) {
                        methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym241$WARNING, (SubLObject)shop_basic_plan_state.$str302$No_matching_methods_were_found_);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym299$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, new_nodes);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_domain(self, domain);
                    set_shop_basic_plan_state_log(self, log);
                    set_shop_basic_plan_state_planner(self, planner);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym299$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 29025L)
    public static SubLObject shop_basic_plan_state_apply_method_method(final SubLObject self, final SubLObject task, final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject log = get_shop_basic_plan_state_log(self);
        final SubLObject depth = get_shop_basic_plan_state_depth(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym307$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                SubLObject new_nodes = (SubLObject)shop_basic_plan_state.NIL;
                final SubLObject unified_decomp_mbinding = shop_basic_plan_state_unify_planner_rule_method(self, task, method);
                final SubLObject entry = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw308$METHODS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                final SubLObject verbose_msg_level = (SubLObject)((shop_basic_plan_state.NIL != entry) ? entry.rest() : shop_basic_plan_state.ZERO_INTEGER);
                final SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                if (verbose_thread_level.numGE(verbose_msg_level)) {
                    methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym285$LOG_PLANNER_RULE, method);
                }
                if (shop_basic_plan_state.$kw295$FAIL != unified_decomp_mbinding) {
                    SubLObject current;
                    final SubLObject datum = current = unified_decomp_mbinding;
                    SubLObject new_mbindings = (SubLObject)shop_basic_plan_state.NIL;
                    SubLObject pre = (SubLObject)shop_basic_plan_state.NIL;
                    SubLObject reduction = (SubLObject)shop_basic_plan_state.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_plan_state.$list309);
                    new_mbindings = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_plan_state.$list309);
                    pre = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_plan_state.$list309);
                    reduction = current.first();
                    current = current.rest();
                    if (shop_basic_plan_state.NIL == current) {
                        final SubLObject state_unifiers = shop_basic_plan_state_find_mbindings_method(self, pre, new_mbindings);
                        if (shop_basic_plan_state.NIL != state_unifiers) {
                            SubLObject list_var = (SubLObject)shop_basic_plan_state.NIL;
                            SubLObject unifier = (SubLObject)shop_basic_plan_state.NIL;
                            SubLObject result_num = (SubLObject)shop_basic_plan_state.NIL;
                            list_var = state_unifiers;
                            unifier = list_var.first();
                            for (result_num = (SubLObject)shop_basic_plan_state.ZERO_INTEGER; shop_basic_plan_state.NIL != list_var; list_var = list_var.rest(), unifier = list_var.first(), result_num = Numbers.add((SubLObject)shop_basic_plan_state.ONE_INTEGER, result_num)) {
                                final SubLObject new_plan_state = shop_basic_plan_state_create_next_method(self);
                                SubLObject simple_mbinding = (SubLObject)shop_basic_plan_state.NIL;
                                final SubLObject entry2 = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw308$METHODS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                                final SubLObject verbose_msg_level2 = (SubLObject)((shop_basic_plan_state.NIL != entry2) ? entry2.rest() : shop_basic_plan_state.ZERO_INTEGER);
                                final SubLObject verbose_thread_level2 = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                                if (verbose_thread_level2.numGE(verbose_msg_level2)) {
                                    methods.funcall_instance_method_with_2_args(log, (SubLObject)shop_basic_plan_state.$sym268$LOG_FANCY_ENTRY, PrintLow.format((SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$str310$Result__s, number_utilities.f_1X(result_num)), (SubLObject)shop_basic_plan_state.$list270);
                                    methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym311$LOG_PREFORMATTED, multibindings.multibinding_string(unifier));
                                    methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym256$LOG_ENTRY, PrintLow.format((SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$str312$Decomposition___, depth));
                                    if (reduction.isList()) {
                                        SubLObject cdolist_list_var = reduction;
                                        SubLObject r = (SubLObject)shop_basic_plan_state.NIL;
                                        r = cdolist_list_var.first();
                                        while (shop_basic_plan_state.NIL != cdolist_list_var) {
                                            methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym311$LOG_PREFORMATTED, PrintLow.format((SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$str313$___6__s__, r));
                                            cdolist_list_var = cdolist_list_var.rest();
                                            r = cdolist_list_var.first();
                                        }
                                    }
                                }
                                shop_basic_plan_state_add_to_partial_plan_method(new_plan_state, task);
                                set_shop_basic_plan_state_mbindings(new_plan_state, unifier);
                                shop_basic_plan_state_add_to_task_strucs_method(new_plan_state, method);
                                simple_mbinding = shop_basic_plan_state_applicable_multibinding_method(self, unifier);
                                shop_basic_plan_state_add_decomposition_method(new_plan_state, task, multibindings.apply_multibinding(reduction, simple_mbinding).first());
                                new_nodes = (SubLObject)ConsesLow.cons(new_plan_state, new_nodes);
                            }
                        }
                        Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym307$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, new_nodes);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)shop_basic_plan_state.$list309);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym307$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)shop_basic_plan_state.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_log(self, log);
                    set_shop_basic_plan_state_depth(self, depth);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym307$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 31153L)
    public static SubLObject shop_basic_plan_state_apply_all_sufficient_conditions_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject domain = get_shop_basic_plan_state_domain(self);
        final SubLObject log = get_shop_basic_plan_state_log(self);
        final SubLObject planner = get_shop_basic_plan_state_planner(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym317$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                SubLObject new_nodes = (SubLObject)shop_basic_plan_state.NIL;
                final SubLObject domain_$18 = shop_basic_planner_thread.shop_basic_planner_thread_get_domain_method(planner);
                final SubLObject task_sufficient_conds = shop_domain.shop_basic_domain_get_sufficient_conds_method(domain_$18, task);
                SubLObject inverse_unifiers = (SubLObject)shop_basic_plan_state.NIL;
                final SubLObject total_num = conses_high.list_length(task_sufficient_conds);
                SubLObject entry = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw300$PLANNER_RULES, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                SubLObject verbose_msg_level = (SubLObject)((shop_basic_plan_state.NIL != entry) ? entry.rest() : shop_basic_plan_state.ZERO_INTEGER);
                SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                if (verbose_thread_level.numGE(verbose_msg_level)) {
                    methods.funcall_instance_method_with_0_args(log, (SubLObject)shop_basic_plan_state.$sym255$LOG_NEWLINE);
                    methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym256$LOG_ENTRY, (SubLObject)shop_basic_plan_state.$str318$Finding_sufficient_condition_rule);
                }
                if (shop_basic_plan_state.NIL != task_sufficient_conds) {
                    SubLObject list_var = (SubLObject)shop_basic_plan_state.NIL;
                    SubLObject cur_scond = (SubLObject)shop_basic_plan_state.NIL;
                    SubLObject cur_num = (SubLObject)shop_basic_plan_state.NIL;
                    list_var = task_sufficient_conds;
                    cur_scond = list_var.first();
                    for (cur_num = (SubLObject)shop_basic_plan_state.ZERO_INTEGER; shop_basic_plan_state.NIL != list_var; list_var = list_var.rest(), cur_scond = list_var.first(), cur_num = Numbers.add((SubLObject)shop_basic_plan_state.ONE_INTEGER, cur_num)) {
                        final SubLObject entry2 = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw300$PLANNER_RULES, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                        final SubLObject verbose_msg_level2 = (SubLObject)((shop_basic_plan_state.NIL != entry2) ? entry2.rest() : shop_basic_plan_state.ZERO_INTEGER);
                        final SubLObject verbose_thread_level2 = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                        if (verbose_thread_level2.numGE(verbose_msg_level2)) {
                            methods.funcall_instance_method_with_2_args(log, (SubLObject)shop_basic_plan_state.$sym268$LOG_FANCY_ENTRY, PrintLow.format((SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$str269$Trying___s__s__, number_utilities.f_1X(cur_num), total_num), (SubLObject)shop_basic_plan_state.$list270);
                            methods.funcall_instance_method_with_0_args(log, (SubLObject)shop_basic_plan_state.$sym255$LOG_NEWLINE);
                        }
                        SubLObject current;
                        final SubLObject datum = current = shop_basic_plan_state_apply_sufficient_condition_method(self, task, cur_scond);
                        SubLObject nodes = (SubLObject)shop_basic_plan_state.NIL;
                        SubLObject inverse_unifier = (SubLObject)shop_basic_plan_state.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_plan_state.$list319);
                        nodes = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_plan_state.$list319);
                        inverse_unifier = current.first();
                        current = current.rest();
                        if (shop_basic_plan_state.NIL == current) {
                            new_nodes = ConsesLow.append(nodes, new_nodes);
                            final SubLObject item_var = inverse_unifier;
                            if (shop_basic_plan_state.NIL == conses_high.member(item_var, inverse_unifiers, Symbols.symbol_function((SubLObject)shop_basic_plan_state.EQL), Symbols.symbol_function((SubLObject)shop_basic_plan_state.IDENTITY))) {
                                inverse_unifiers = (SubLObject)ConsesLow.cons(item_var, inverse_unifiers);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)shop_basic_plan_state.$list319);
                        }
                    }
                }
                else {
                    entry = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw240$GOALS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                    verbose_msg_level = (SubLObject)((shop_basic_plan_state.NIL != entry) ? entry.rest() : shop_basic_plan_state.ZERO_INTEGER);
                    verbose_thread_level = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                    if (verbose_thread_level.numGE(verbose_msg_level)) {
                        methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym241$WARNING, (SubLObject)shop_basic_plan_state.$str320$No_matching_sufficient_conditions);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym317$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)ConsesLow.list(new_nodes, inverse_unifiers));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_domain(self, domain);
                    set_shop_basic_plan_state_log(self, log);
                    set_shop_basic_plan_state_planner(self, planner);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym317$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 32381L)
    public static SubLObject shop_basic_plan_state_apply_sufficient_condition_method(final SubLObject self, final SubLObject task, final SubLObject scond) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject log = get_shop_basic_plan_state_log(self);
        final SubLObject tasklist = get_shop_basic_plan_state_tasklist(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym325$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                SubLObject new_nodes = (SubLObject)shop_basic_plan_state.NIL;
                final SubLObject unified_task_data = shop_basic_plan_state_unify_planner_rule_method(self, task, scond);
                final SubLObject entry = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw308$METHODS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                final SubLObject verbose_msg_level = (SubLObject)((shop_basic_plan_state.NIL != entry) ? entry.rest() : shop_basic_plan_state.ZERO_INTEGER);
                final SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                if (verbose_thread_level.numGE(verbose_msg_level)) {
                    methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym285$LOG_PLANNER_RULE, scond);
                }
                if (unified_task_data != shop_basic_plan_state.$kw295$FAIL) {
                    SubLObject current;
                    final SubLObject datum = current = unified_task_data;
                    SubLObject new_mbindings = (SubLObject)shop_basic_plan_state.NIL;
                    SubLObject condition = (SubLObject)shop_basic_plan_state.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_plan_state.$list326);
                    new_mbindings = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_plan_state.$list326);
                    condition = current.first();
                    current = current.rest();
                    if (shop_basic_plan_state.NIL == current) {
                        final SubLObject state_unifiers = shop_basic_plan_state_find_mbindings_method(self, condition, new_mbindings);
                        final SubLObject inverse_unifier = multibindings.multibinding_inverse_list(new_mbindings, state_unifiers);
                        SubLObject cdolist_list_var = state_unifiers;
                        SubLObject cur_unifier = (SubLObject)shop_basic_plan_state.NIL;
                        cur_unifier = cdolist_list_var.first();
                        while (shop_basic_plan_state.NIL != cdolist_list_var) {
                            final SubLObject new_node = shop_basic_plan_state_create_next_method(self);
                            shop_basic_plan_state_add_to_partial_plan_method(new_node, task);
                            shop_basic_plan_state_add_to_task_strucs_method(new_node, scond);
                            set_shop_basic_plan_state_mbindings(new_node, cur_unifier);
                            shop_basic_plan_state_set_tasklist_method(new_node, ConsesLow.append((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)shop_basic_plan_state.$kw58$SUPERTASK, task)), tasklist.rest()));
                            new_nodes = (SubLObject)ConsesLow.cons(new_node, new_nodes);
                            cdolist_list_var = cdolist_list_var.rest();
                            cur_unifier = cdolist_list_var.first();
                        }
                        Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym325$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)ConsesLow.list(new_nodes, inverse_unifier));
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)shop_basic_plan_state.$list326);
                    }
                }
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym325$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.NIL));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_log(self, log);
                    set_shop_basic_plan_state_tasklist(self, tasklist);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym325$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 33593L)
    public static SubLObject shop_basic_plan_state_apply_all_preconditions_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject domain = get_shop_basic_plan_state_domain(self);
        final SubLObject log = get_shop_basic_plan_state_log(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym330$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                final SubLObject preconds = shop_domain.shop_basic_domain_get_planner_rules_method(domain, task, (SubLObject)shop_basic_plan_state.$sym331$SHOP_PRECONDITION_P);
                final SubLObject total_num = conses_high.list_length(preconds);
                SubLObject entry = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw254$OPERATORS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                SubLObject verbose_msg_level = (SubLObject)((shop_basic_plan_state.NIL != entry) ? entry.rest() : shop_basic_plan_state.ZERO_INTEGER);
                SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                if (verbose_thread_level.numGE(verbose_msg_level)) {
                    methods.funcall_instance_method_with_0_args(log, (SubLObject)shop_basic_plan_state.$sym255$LOG_NEWLINE);
                    methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym256$LOG_ENTRY, (SubLObject)shop_basic_plan_state.$str332$Finding_precondition_rules_for_ta);
                }
                if (shop_basic_plan_state.NIL == preconds) {
                    entry = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw254$OPERATORS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                    verbose_msg_level = (SubLObject)((shop_basic_plan_state.NIL != entry) ? entry.rest() : shop_basic_plan_state.ZERO_INTEGER);
                    verbose_thread_level = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                    if (verbose_thread_level.numGE(verbose_msg_level)) {
                        methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym241$WARNING, (SubLObject)shop_basic_plan_state.$str333$No_precondition_rules_found_);
                    }
                    Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym330$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)shop_basic_plan_state.T);
                }
                else {
                    SubLObject list_var = (SubLObject)shop_basic_plan_state.NIL;
                    SubLObject precond = (SubLObject)shop_basic_plan_state.NIL;
                    SubLObject cur_num = (SubLObject)shop_basic_plan_state.NIL;
                    list_var = preconds;
                    precond = list_var.first();
                    for (cur_num = (SubLObject)shop_basic_plan_state.ZERO_INTEGER; shop_basic_plan_state.NIL != list_var; list_var = list_var.rest(), precond = list_var.first(), cur_num = Numbers.add((SubLObject)shop_basic_plan_state.ONE_INTEGER, cur_num)) {
                        final SubLObject entry2 = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw254$OPERATORS, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                        final SubLObject verbose_msg_level2 = (SubLObject)((shop_basic_plan_state.NIL != entry2) ? entry2.rest() : shop_basic_plan_state.ZERO_INTEGER);
                        final SubLObject verbose_thread_level2 = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                        if (verbose_thread_level2.numGE(verbose_msg_level2)) {
                            methods.funcall_instance_method_with_2_args(log, (SubLObject)shop_basic_plan_state.$sym268$LOG_FANCY_ENTRY, PrintLow.format((SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$str269$Trying___s__s__, number_utilities.f_1X(cur_num), total_num), (SubLObject)shop_basic_plan_state.$list270);
                            methods.funcall_instance_method_with_0_args(log, (SubLObject)shop_basic_plan_state.$sym255$LOG_NEWLINE);
                        }
                        if (shop_basic_plan_state.NIL == shop_basic_plan_state_apply_precondition_method(self, task, precond)) {
                            Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym330$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)shop_basic_plan_state.NIL);
                        }
                    }
                    Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym330$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)shop_basic_plan_state.T);
                }
                Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym330$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)shop_basic_plan_state.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_domain(self, domain);
                    set_shop_basic_plan_state_log(self, log);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym330$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan-state.lisp", position = 34615L)
    public static SubLObject shop_basic_plan_state_apply_precondition_method(final SubLObject self, final SubLObject task, final SubLObject precond) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_plan_state_method = (SubLObject)shop_basic_plan_state.NIL;
        final SubLObject log = get_shop_basic_plan_state_log(self);
        try {
            thread.throwStack.push(shop_basic_plan_state.$sym338$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
            try {
                final SubLObject entry = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw300$PLANNER_RULES, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                final SubLObject verbose_msg_level = (SubLObject)((shop_basic_plan_state.NIL != entry) ? entry.rest() : shop_basic_plan_state.ZERO_INTEGER);
                final SubLObject verbose_thread_level = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                if (verbose_thread_level.numGE(verbose_msg_level)) {
                    methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym285$LOG_PLANNER_RULE, precond);
                }
                final SubLObject unified_task_data = shop_basic_plan_state_unify_planner_rule_method(self, task, precond);
                if (shop_basic_plan_state.$kw295$FAIL != unified_task_data) {
                    SubLObject current;
                    final SubLObject datum = current = unified_task_data;
                    SubLObject new_mbindings = (SubLObject)shop_basic_plan_state.NIL;
                    SubLObject pre = (SubLObject)shop_basic_plan_state.NIL;
                    SubLObject reduction = (SubLObject)shop_basic_plan_state.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_plan_state.$list309);
                    new_mbindings = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_plan_state.$list309);
                    pre = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_basic_plan_state.$list309);
                    reduction = current.first();
                    current = current.rest();
                    if (shop_basic_plan_state.NIL == current) {
                        final SubLObject state_unifiers = shop_basic_plan_state_find_mbindings_method(self, pre, new_mbindings);
                        if (shop_basic_plan_state.NIL == state_unifiers) {
                            final SubLObject entry2 = conses_high.assoc((SubLObject)shop_basic_plan_state.$kw300$PLANNER_RULES, shop_internals.$shop_verbose_keys$.getDynamicValue(thread), (SubLObject)shop_basic_plan_state.UNPROVIDED, (SubLObject)shop_basic_plan_state.UNPROVIDED);
                            final SubLObject verbose_msg_level2 = (SubLObject)((shop_basic_plan_state.NIL != entry2) ? entry2.rest() : shop_basic_plan_state.ZERO_INTEGER);
                            final SubLObject verbose_thread_level2 = instances.get_slot(instances.get_slot(self, (SubLObject)shop_basic_plan_state.$sym20$LOG), (SubLObject)shop_basic_plan_state.$sym218$VERBOSE);
                            if (verbose_thread_level2.numGE(verbose_msg_level2)) {
                                methods.funcall_instance_method_with_1_args(log, (SubLObject)shop_basic_plan_state.$sym241$WARNING, (SubLObject)shop_basic_plan_state.$str339$No_bindings_found_);
                            }
                            Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym338$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, (SubLObject)shop_basic_plan_state.NIL);
                        }
                        else {
                            Dynamic.sublisp_throw((SubLObject)shop_basic_plan_state.$sym338$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD, state_unifiers);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)shop_basic_plan_state.$list309);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_plan_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_plan_state_log(self, log);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_plan_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_plan_state.$sym338$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_plan_state_method;
    }
    
    public static SubLObject declare_shop_basic_plan_state_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.shop_basic_plan_state", "cpushX", "CPUSH*");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.shop_basic_plan_state", "when_verbose", "WHEN-VERBOSE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_plan_state_p", "SHOP-PLAN-STATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "get_shop_basic_plan_state_dynamic_predicates", "GET-SHOP-BASIC-PLAN-STATE-DYNAMIC-PREDICATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "set_shop_basic_plan_state_dynamic_predicates", "SET-SHOP-BASIC-PLAN-STATE-DYNAMIC-PREDICATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "get_shop_basic_plan_state_model_mt", "GET-SHOP-BASIC-PLAN-STATE-MODEL-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "set_shop_basic_plan_state_model_mt", "SET-SHOP-BASIC-PLAN-STATE-MODEL-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "get_shop_basic_plan_state_domain", "GET-SHOP-BASIC-PLAN-STATE-DOMAIN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "set_shop_basic_plan_state_domain", "SET-SHOP-BASIC-PLAN-STATE-DOMAIN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "get_shop_basic_plan_state_log", "GET-SHOP-BASIC-PLAN-STATE-LOG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "set_shop_basic_plan_state_log", "SET-SHOP-BASIC-PLAN-STATE-LOG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "get_shop_basic_plan_state_planner", "GET-SHOP-BASIC-PLAN-STATE-PLANNER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "set_shop_basic_plan_state_planner", "SET-SHOP-BASIC-PLAN-STATE-PLANNER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "get_shop_basic_plan_state_previous_states", "GET-SHOP-BASIC-PLAN-STATE-PREVIOUS-STATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "set_shop_basic_plan_state_previous_states", "SET-SHOP-BASIC-PLAN-STATE-PREVIOUS-STATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "get_shop_basic_plan_state_depth", "GET-SHOP-BASIC-PLAN-STATE-DEPTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "set_shop_basic_plan_state_depth", "SET-SHOP-BASIC-PLAN-STATE-DEPTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "get_shop_basic_plan_state_query_properties", "GET-SHOP-BASIC-PLAN-STATE-QUERY-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "set_shop_basic_plan_state_query_properties", "SET-SHOP-BASIC-PLAN-STATE-QUERY-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "get_shop_basic_plan_state_post_ordering", "GET-SHOP-BASIC-PLAN-STATE-POST-ORDERING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "set_shop_basic_plan_state_post_ordering", "SET-SHOP-BASIC-PLAN-STATE-POST-ORDERING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "get_shop_basic_plan_state_partial_plan", "GET-SHOP-BASIC-PLAN-STATE-PARTIAL-PLAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "set_shop_basic_plan_state_partial_plan", "SET-SHOP-BASIC-PLAN-STATE-PARTIAL-PLAN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "get_shop_basic_plan_state_supports", "GET-SHOP-BASIC-PLAN-STATE-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "set_shop_basic_plan_state_supports", "SET-SHOP-BASIC-PLAN-STATE-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "get_shop_basic_plan_state_task_strucs", "GET-SHOP-BASIC-PLAN-STATE-TASK-STRUCS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "set_shop_basic_plan_state_task_strucs", "SET-SHOP-BASIC-PLAN-STATE-TASK-STRUCS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "get_shop_basic_plan_state_mbindings", "GET-SHOP-BASIC-PLAN-STATE-MBINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "set_shop_basic_plan_state_mbindings", "SET-SHOP-BASIC-PLAN-STATE-MBINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "get_shop_basic_plan_state_tasklist", "GET-SHOP-BASIC-PLAN-STATE-TASKLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "set_shop_basic_plan_state_tasklist", "SET-SHOP-BASIC-PLAN-STATE-TASKLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "get_shop_basic_plan_state_world_state", "GET-SHOP-BASIC-PLAN-STATE-WORLD-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "set_shop_basic_plan_state_world_state", "SET-SHOP-BASIC-PLAN-STATE-WORLD-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "subloop_reserved_initialize_shop_basic_plan_state_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-STATE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "subloop_reserved_initialize_shop_basic_plan_state_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-STATE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_p", "SHOP-BASIC-PLAN-STATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_applicable_multibinding_method", "SHOP-BASIC-PLAN-STATE-APPLICABLE-MULTIBINDING-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_set_tasklist_method", "SHOP-BASIC-PLAN-STATE-SET-TASKLIST-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_get_tasklist_method", "SHOP-BASIC-PLAN-STATE-GET-TASKLIST-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_add_decomposition_method", "SHOP-BASIC-PLAN-STATE-ADD-DECOMPOSITION-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_set_multibindings_method", "SHOP-BASIC-PLAN-STATE-SET-MULTIBINDINGS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_multibindings_method", "SHOP-BASIC-PLAN-STATE-MULTIBINDINGS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_set_domain_method", "SHOP-BASIC-PLAN-STATE-SET-DOMAIN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_get_domain_method", "SHOP-BASIC-PLAN-STATE-GET-DOMAIN-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_support_lists_method", "SHOP-BASIC-PLAN-STATE-SUPPORT-LISTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_add_to_support_lists_method", "SHOP-BASIC-PLAN-STATE-ADD-TO-SUPPORT-LISTS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_initialize_method", "SHOP-BASIC-PLAN-STATE-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_initialize_plan_state_with_problem_method", "SHOP-BASIC-PLAN-STATE-INITIALIZE-PLAN-STATE-WITH-PROBLEM-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_initialize_multibindings_method", "SHOP-BASIC-PLAN-STATE-INITIALIZE-MULTIBINDINGS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_output_message_method", "SHOP-BASIC-PLAN-STATE-OUTPUT-MESSAGE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_copy_method", "SHOP-BASIC-PLAN-STATE-COPY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_create_next_method", "SHOP-BASIC-PLAN-STATE-CREATE-NEXT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_init_model_with_problem_method", "SHOP-BASIC-PLAN-STATE-INIT-MODEL-WITH-PROBLEM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_set_world_state_method", "SHOP-BASIC-PLAN-STATE-SET-WORLD-STATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_get_world_state_method", "SHOP-BASIC-PLAN-STATE-GET-WORLD-STATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_mbinding_method", "SHOP-BASIC-PLAN-STATE-MBINDING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_set_depth_method", "SHOP-BASIC-PLAN-STATE-SET-DEPTH-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_depth_method", "SHOP-BASIC-PLAN-STATE-DEPTH-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_set_previous_states_method", "SHOP-BASIC-PLAN-STATE-SET-PREVIOUS-STATES-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_get_previous_states_method", "SHOP-BASIC-PLAN-STATE-GET-PREVIOUS-STATES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_add_to_previous_states_method", "SHOP-BASIC-PLAN-STATE-ADD-TO-PREVIOUS-STATES-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_set_partial_plan_method", "SHOP-BASIC-PLAN-STATE-SET-PARTIAL-PLAN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_get_partial_plan_method", "SHOP-BASIC-PLAN-STATE-GET-PARTIAL-PLAN-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_add_to_partial_plan_method", "SHOP-BASIC-PLAN-STATE-ADD-TO-PARTIAL-PLAN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_add_to_post_ordering_method", "SHOP-BASIC-PLAN-STATE-ADD-TO-POST-ORDERING-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_add_to_mbindings_method", "SHOP-BASIC-PLAN-STATE-ADD-TO-MBINDINGS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_planner_rules_method", "SHOP-BASIC-PLAN-STATE-PLANNER-RULES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_add_to_task_strucs_method", "SHOP-BASIC-PLAN-STATE-ADD-TO-TASK-STRUCS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_task_strucs_method", "SHOP-BASIC-PLAN-STATE-TASK-STRUCS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_get_planner_method", "SHOP-BASIC-PLAN-STATE-GET-PLANNER-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_set_planner_method", "SHOP-BASIC-PLAN-STATE-SET-PLANNER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_get_which_plans_method", "SHOP-BASIC-PLAN-STATE-GET-WHICH-PLANS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_simple_situation_predP_method", "SHOP-BASIC-PLAN-STATE-SIMPLE-SITUATION-PRED?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_seek_total_mbindings_method", "SHOP-BASIC-PLAN-STATE-SEEK-TOTAL-MBINDINGS-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_find_mbindings_method", "SHOP-BASIC-PLAN-STATE-FIND-MBINDINGS-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_same_taskP", "SHOP-SAME-TASK?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_find_next_match", "SHOP-FIND-NEXT-MATCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_parent_taskP_method", "SHOP-BASIC-PLAN-STATE-PARENT-TASK?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_expand_method", "SHOP-BASIC-PLAN-STATE-EXPAND-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_expand_complex_method", "SHOP-BASIC-PLAN-STATE-EXPAND-COMPLEX-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_expand_primitive_preconditions_method", "SHOP-BASIC-PLAN-STATE-EXPAND-PRIMITIVE-PRECONDITIONS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_expand_primitive_method", "SHOP-BASIC-PLAN-STATE-EXPAND-PRIMITIVE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_apply_operators_method", "SHOP-BASIC-PLAN-STATE-APPLY-OPERATORS-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_apply_operator_method", "SHOP-BASIC-PLAN-STATE-APPLY-OPERATOR-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_apply_conditional_operator_method", "SHOP-BASIC-PLAN-STATE-APPLY-CONDITIONAL-OPERATOR-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_unify_planner_rule_method", "SHOP-BASIC-PLAN-STATE-UNIFY-PLANNER-RULE-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_apply_all_methods_method", "SHOP-BASIC-PLAN-STATE-APPLY-ALL-METHODS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_apply_method_method", "SHOP-BASIC-PLAN-STATE-APPLY-METHOD-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_apply_all_sufficient_conditions_method", "SHOP-BASIC-PLAN-STATE-APPLY-ALL-SUFFICIENT-CONDITIONS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_apply_sufficient_condition_method", "SHOP-BASIC-PLAN-STATE-APPLY-SUFFICIENT-CONDITION-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_apply_all_preconditions_method", "SHOP-BASIC-PLAN-STATE-APPLY-ALL-PRECONDITIONS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_plan_state", "shop_basic_plan_state_apply_precondition_method", "SHOP-BASIC-PLAN-STATE-APPLY-PRECONDITION-METHOD", 3, 0, false);
        return (SubLObject)shop_basic_plan_state.NIL;
    }
    
    public static SubLObject init_shop_basic_plan_state_file() {
        shop_basic_plan_state.$shop_canonicalize_functionsP$ = SubLFiles.defparameter("*SHOP-CANONICALIZE-FUNCTIONS?*", (SubLObject)shop_basic_plan_state.T);
        return (SubLObject)shop_basic_plan_state.NIL;
    }
    
    public static SubLObject setup_shop_basic_plan_state_file() {
        interfaces.new_interface((SubLObject)shop_basic_plan_state.$sym11$SHOP_PLAN_STATE, (SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$list12);
        classes.subloop_new_class((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym14$OBJECT, (SubLObject)shop_basic_plan_state.$list15, (SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$list16);
        classes.class_set_implements_slot_listeners((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym23$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_STATE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym36$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_STATE_INSTANCE);
        subloop_reserved_initialize_shop_basic_plan_state_class((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE);
        methods.methods_incorporate_class_method((SubLObject)shop_basic_plan_state.$sym37$APPLICABLE_MULTIBINDING, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list38, (SubLObject)shop_basic_plan_state.$list39, (SubLObject)shop_basic_plan_state.$list40);
        methods.subloop_register_class_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym37$APPLICABLE_MULTIBINDING, (SubLObject)shop_basic_plan_state.$sym41$SHOP_BASIC_PLAN_STATE_APPLICABLE_MULTIBINDING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym42$SET_TASKLIST, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list38, (SubLObject)shop_basic_plan_state.$list43, (SubLObject)shop_basic_plan_state.$list44);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym42$SET_TASKLIST, (SubLObject)shop_basic_plan_state.$sym47$SHOP_BASIC_PLAN_STATE_SET_TASKLIST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym48$GET_TASKLIST, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$list50);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym48$GET_TASKLIST, (SubLObject)shop_basic_plan_state.$sym52$SHOP_BASIC_PLAN_STATE_GET_TASKLIST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym53$ADD_DECOMPOSITION, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list54, (SubLObject)shop_basic_plan_state.$list55, (SubLObject)shop_basic_plan_state.$list56);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym53$ADD_DECOMPOSITION, (SubLObject)shop_basic_plan_state.$sym59$SHOP_BASIC_PLAN_STATE_ADD_DECOMPOSITION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym60$SET_MULTIBINDINGS, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.$list61, (SubLObject)shop_basic_plan_state.$list62);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym60$SET_MULTIBINDINGS, (SubLObject)shop_basic_plan_state.$sym64$SHOP_BASIC_PLAN_STATE_SET_MULTIBINDINGS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym65$MULTIBINDINGS, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$list66);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym65$MULTIBINDINGS, (SubLObject)shop_basic_plan_state.$sym68$SHOP_BASIC_PLAN_STATE_MULTIBINDINGS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym69$SET_DOMAIN, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list38, (SubLObject)shop_basic_plan_state.$list70, (SubLObject)shop_basic_plan_state.$list71);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym69$SET_DOMAIN, (SubLObject)shop_basic_plan_state.$sym73$SHOP_BASIC_PLAN_STATE_SET_DOMAIN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym74$GET_DOMAIN, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$list75);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym74$GET_DOMAIN, (SubLObject)shop_basic_plan_state.$sym77$SHOP_BASIC_PLAN_STATE_GET_DOMAIN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym78$SUPPORT_LISTS, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$list79);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym78$SUPPORT_LISTS, (SubLObject)shop_basic_plan_state.$sym81$SHOP_BASIC_PLAN_STATE_SUPPORT_LISTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym82$ADD_TO_SUPPORT_LISTS, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.$list83, (SubLObject)shop_basic_plan_state.$list84);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym82$ADD_TO_SUPPORT_LISTS, (SubLObject)shop_basic_plan_state.$sym86$SHOP_BASIC_PLAN_STATE_ADD_TO_SUPPORT_LISTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym87$INITIALIZE, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list38, (SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$list88);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym87$INITIALIZE, (SubLObject)shop_basic_plan_state.$sym90$SHOP_BASIC_PLAN_STATE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym91$INITIALIZE_PLAN_STATE_WITH_PROBLEM, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list92, (SubLObject)shop_basic_plan_state.$list93, (SubLObject)shop_basic_plan_state.$list94);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym91$INITIALIZE_PLAN_STATE_WITH_PROBLEM, (SubLObject)shop_basic_plan_state.$sym98$SHOP_BASIC_PLAN_STATE_INITIALIZE_PLAN_STATE_WITH_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym99$INITIALIZE_MULTIBINDINGS, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list100, (SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$list101);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym99$INITIALIZE_MULTIBINDINGS, (SubLObject)shop_basic_plan_state.$sym103$SHOP_BASIC_PLAN_STATE_INITIALIZE_MULTIBINDINGS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym104$OUTPUT_MESSAGE, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.$list105, (SubLObject)shop_basic_plan_state.$list106);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym104$OUTPUT_MESSAGE, (SubLObject)shop_basic_plan_state.$sym108$SHOP_BASIC_PLAN_STATE_OUTPUT_MESSAGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym109$COPY, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$list110);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym109$COPY, (SubLObject)shop_basic_plan_state.$sym111$SHOP_BASIC_PLAN_STATE_COPY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym112$CREATE_NEXT, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$list113);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym112$CREATE_NEXT, (SubLObject)shop_basic_plan_state.$sym115$SHOP_BASIC_PLAN_STATE_CREATE_NEXT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym116$INIT_MODEL_WITH_PROBLEM, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list100, (SubLObject)shop_basic_plan_state.$list117, (SubLObject)shop_basic_plan_state.$list118);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym116$INIT_MODEL_WITH_PROBLEM, (SubLObject)shop_basic_plan_state.$sym120$SHOP_BASIC_PLAN_STATE_INIT_MODEL_WITH_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym121$SET_WORLD_STATE, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list38, (SubLObject)shop_basic_plan_state.$list122, (SubLObject)shop_basic_plan_state.$list123);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym121$SET_WORLD_STATE, (SubLObject)shop_basic_plan_state.$sym126$SHOP_BASIC_PLAN_STATE_SET_WORLD_STATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym127$GET_WORLD_STATE, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$list128);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym127$GET_WORLD_STATE, (SubLObject)shop_basic_plan_state.$sym130$SHOP_BASIC_PLAN_STATE_GET_WORLD_STATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym131$MBINDING, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$list66);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym131$MBINDING, (SubLObject)shop_basic_plan_state.$sym133$SHOP_BASIC_PLAN_STATE_MBINDING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym134$SET_DEPTH, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list38, (SubLObject)shop_basic_plan_state.$list135, (SubLObject)shop_basic_plan_state.$list136);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym134$SET_DEPTH, (SubLObject)shop_basic_plan_state.$sym139$SHOP_BASIC_PLAN_STATE_SET_DEPTH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym34$DEPTH, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$list140);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym34$DEPTH, (SubLObject)shop_basic_plan_state.$sym142$SHOP_BASIC_PLAN_STATE_DEPTH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym143$SET_PREVIOUS_STATES, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list38, (SubLObject)shop_basic_plan_state.$list144, (SubLObject)shop_basic_plan_state.$list145);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym143$SET_PREVIOUS_STATES, (SubLObject)shop_basic_plan_state.$sym147$SHOP_BASIC_PLAN_STATE_SET_PREVIOUS_STATES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym148$GET_PREVIOUS_STATES, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$list149);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym148$GET_PREVIOUS_STATES, (SubLObject)shop_basic_plan_state.$sym151$SHOP_BASIC_PLAN_STATE_GET_PREVIOUS_STATES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym152$ADD_TO_PREVIOUS_STATES, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list38, (SubLObject)shop_basic_plan_state.$list153, (SubLObject)shop_basic_plan_state.$list154);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym152$ADD_TO_PREVIOUS_STATES, (SubLObject)shop_basic_plan_state.$sym156$SHOP_BASIC_PLAN_STATE_ADD_TO_PREVIOUS_STATES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym157$SET_PARTIAL_PLAN, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list38, (SubLObject)shop_basic_plan_state.$list158, (SubLObject)shop_basic_plan_state.$list159);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym157$SET_PARTIAL_PLAN, (SubLObject)shop_basic_plan_state.$sym161$SHOP_BASIC_PLAN_STATE_SET_PARTIAL_PLAN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym162$GET_PARTIAL_PLAN, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$list163);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym162$GET_PARTIAL_PLAN, (SubLObject)shop_basic_plan_state.$sym165$SHOP_BASIC_PLAN_STATE_GET_PARTIAL_PLAN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym166$ADD_TO_PARTIAL_PLAN, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list38, (SubLObject)shop_basic_plan_state.$list167, (SubLObject)shop_basic_plan_state.$list168);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym166$ADD_TO_PARTIAL_PLAN, (SubLObject)shop_basic_plan_state.$sym170$SHOP_BASIC_PLAN_STATE_ADD_TO_PARTIAL_PLAN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym171$ADD_TO_POST_ORDERING, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list54, (SubLObject)shop_basic_plan_state.$list167, (SubLObject)shop_basic_plan_state.$list172);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym171$ADD_TO_POST_ORDERING, (SubLObject)shop_basic_plan_state.$sym174$SHOP_BASIC_PLAN_STATE_ADD_TO_POST_ORDERING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym175$ADD_TO_MBINDINGS, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.$list176, (SubLObject)shop_basic_plan_state.$list177);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym175$ADD_TO_MBINDINGS, (SubLObject)shop_basic_plan_state.$sym179$SHOP_BASIC_PLAN_STATE_ADD_TO_MBINDINGS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym180$PLANNER_RULES, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$list181);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym180$PLANNER_RULES, (SubLObject)shop_basic_plan_state.$sym183$SHOP_BASIC_PLAN_STATE_PLANNER_RULES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym184$ADD_TO_TASK_STRUCS, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list54, (SubLObject)shop_basic_plan_state.$list185, (SubLObject)shop_basic_plan_state.$list186);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym184$ADD_TO_TASK_STRUCS, (SubLObject)shop_basic_plan_state.$sym188$SHOP_BASIC_PLAN_STATE_ADD_TO_TASK_STRUCS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym29$TASK_STRUCS, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$list181);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym29$TASK_STRUCS, (SubLObject)shop_basic_plan_state.$sym190$SHOP_BASIC_PLAN_STATE_TASK_STRUCS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym191$GET_PLANNER, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$list192);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym191$GET_PLANNER, (SubLObject)shop_basic_plan_state.$sym194$SHOP_BASIC_PLAN_STATE_GET_PLANNER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym195$SET_PLANNER, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.$list158, (SubLObject)shop_basic_plan_state.$list196);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym195$SET_PLANNER, (SubLObject)shop_basic_plan_state.$sym198$SHOP_BASIC_PLAN_STATE_SET_PLANNER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym199$GET_WHICH_PLANS, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$list200);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym199$GET_WHICH_PLANS, (SubLObject)shop_basic_plan_state.$sym203$SHOP_BASIC_PLAN_STATE_GET_WHICH_PLANS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym204$SIMPLE_SITUATION_PRED_, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list54, (SubLObject)shop_basic_plan_state.$list205, (SubLObject)shop_basic_plan_state.$list206);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym204$SIMPLE_SITUATION_PRED_, (SubLObject)shop_basic_plan_state.$sym210$SHOP_BASIC_PLAN_STATE_SIMPLE_SITUATION_PRED__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym211$SEEK_TOTAL_MBINDINGS, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list54, (SubLObject)shop_basic_plan_state.$list212, (SubLObject)shop_basic_plan_state.$list213);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym211$SEEK_TOTAL_MBINDINGS, (SubLObject)shop_basic_plan_state.$sym221$SHOP_BASIC_PLAN_STATE_SEEK_TOTAL_MBINDINGS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym222$FIND_MBINDINGS, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list54, (SubLObject)shop_basic_plan_state.$list223, (SubLObject)shop_basic_plan_state.$list224);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym222$FIND_MBINDINGS, (SubLObject)shop_basic_plan_state.$sym225$SHOP_BASIC_PLAN_STATE_FIND_MBINDINGS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym227$PARENT_TASK_, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list38, (SubLObject)shop_basic_plan_state.$list167, (SubLObject)shop_basic_plan_state.$list228);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym227$PARENT_TASK_, (SubLObject)shop_basic_plan_state.$sym230$SHOP_BASIC_PLAN_STATE_PARENT_TASK__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym231$EXPAND, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.$list232);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym231$EXPAND, (SubLObject)shop_basic_plan_state.$sym243$SHOP_BASIC_PLAN_STATE_EXPAND_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym244$EXPAND_COMPLEX, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.$list167, (SubLObject)shop_basic_plan_state.$list245);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym244$EXPAND_COMPLEX, (SubLObject)shop_basic_plan_state.$sym247$SHOP_BASIC_PLAN_STATE_EXPAND_COMPLEX_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym248$EXPAND_PRIMITIVE_PRECONDITIONS, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list49, (SubLObject)shop_basic_plan_state.$list167, (SubLObject)shop_basic_plan_state.$list249);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym248$EXPAND_PRIMITIVE_PRECONDITIONS, (SubLObject)shop_basic_plan_state.$sym250$SHOP_BASIC_PLAN_STATE_EXPAND_PRIMITIVE_PRECONDITIONS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym251$EXPAND_PRIMITIVE, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list54, (SubLObject)shop_basic_plan_state.$list167, (SubLObject)shop_basic_plan_state.$list252);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym251$EXPAND_PRIMITIVE, (SubLObject)shop_basic_plan_state.$sym262$SHOP_BASIC_PLAN_STATE_EXPAND_PRIMITIVE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym263$APPLY_OPERATORS, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list38, (SubLObject)shop_basic_plan_state.$list264, (SubLObject)shop_basic_plan_state.$list265);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym263$APPLY_OPERATORS, (SubLObject)shop_basic_plan_state.$sym277$SHOP_BASIC_PLAN_STATE_APPLY_OPERATORS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym278$APPLY_OPERATOR, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list54, (SubLObject)shop_basic_plan_state.$list279, (SubLObject)shop_basic_plan_state.$list280);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym278$APPLY_OPERATOR, (SubLObject)shop_basic_plan_state.$sym281$SHOP_BASIC_PLAN_STATE_APPLY_OPERATOR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym282$APPLY_CONDITIONAL_OPERATOR, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list38, (SubLObject)shop_basic_plan_state.$list279, (SubLObject)shop_basic_plan_state.$list283);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym282$APPLY_CONDITIONAL_OPERATOR, (SubLObject)shop_basic_plan_state.$sym287$SHOP_BASIC_PLAN_STATE_APPLY_CONDITIONAL_OPERATOR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym288$UNIFY_PLANNER_RULE, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list54, (SubLObject)shop_basic_plan_state.$list289, (SubLObject)shop_basic_plan_state.$list290);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym288$UNIFY_PLANNER_RULE, (SubLObject)shop_basic_plan_state.$sym296$SHOP_BASIC_PLAN_STATE_UNIFY_PLANNER_RULE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym297$APPLY_ALL_METHODS, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list54, (SubLObject)shop_basic_plan_state.$list167, (SubLObject)shop_basic_plan_state.$list298);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym297$APPLY_ALL_METHODS, (SubLObject)shop_basic_plan_state.$sym303$SHOP_BASIC_PLAN_STATE_APPLY_ALL_METHODS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym304$APPLY_METHOD, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list54, (SubLObject)shop_basic_plan_state.$list305, (SubLObject)shop_basic_plan_state.$list306);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym304$APPLY_METHOD, (SubLObject)shop_basic_plan_state.$sym314$SHOP_BASIC_PLAN_STATE_APPLY_METHOD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym315$APPLY_ALL_SUFFICIENT_CONDITIONS, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list54, (SubLObject)shop_basic_plan_state.$list167, (SubLObject)shop_basic_plan_state.$list316);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym315$APPLY_ALL_SUFFICIENT_CONDITIONS, (SubLObject)shop_basic_plan_state.$sym321$SHOP_BASIC_PLAN_STATE_APPLY_ALL_SUFFICIENT_CONDITIONS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym322$APPLY_SUFFICIENT_CONDITION, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list54, (SubLObject)shop_basic_plan_state.$list323, (SubLObject)shop_basic_plan_state.$list324);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym322$APPLY_SUFFICIENT_CONDITION, (SubLObject)shop_basic_plan_state.$sym327$SHOP_BASIC_PLAN_STATE_APPLY_SUFFICIENT_CONDITION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym328$APPLY_ALL_PRECONDITIONS, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list38, (SubLObject)shop_basic_plan_state.$list167, (SubLObject)shop_basic_plan_state.$list329);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym328$APPLY_ALL_PRECONDITIONS, (SubLObject)shop_basic_plan_state.$sym334$SHOP_BASIC_PLAN_STATE_APPLY_ALL_PRECONDITIONS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_plan_state.$sym335$APPLY_PRECONDITION, (SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$list38, (SubLObject)shop_basic_plan_state.$list336, (SubLObject)shop_basic_plan_state.$list337);
        methods.subloop_register_instance_method((SubLObject)shop_basic_plan_state.$sym13$SHOP_BASIC_PLAN_STATE, (SubLObject)shop_basic_plan_state.$sym335$APPLY_PRECONDITION, (SubLObject)shop_basic_plan_state.$sym340$SHOP_BASIC_PLAN_STATE_APPLY_PRECONDITION_METHOD);
        return (SubLObject)shop_basic_plan_state.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_shop_basic_plan_state_file();
    }
    
    @Override
	public void initializeVariables() {
        init_shop_basic_plan_state_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_shop_basic_plan_state_file();
    }
    
    static {
        me = (SubLFile)new shop_basic_plan_state();
        shop_basic_plan_state.$shop_canonicalize_functionsP$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST1"), (SubLObject)SubLObjectFactory.makeSymbol("LIST2"));
        $sym1$CSETF = SubLObjectFactory.makeSymbol("CSETF");
        $sym2$APPEND = SubLObjectFactory.makeSymbol("APPEND");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REQUIRED-VERBOSE-LEVEL"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym4$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym5$ENTRY = SubLObjectFactory.makeSymbol("ENTRY");
        $sym6$ASSOC = SubLObjectFactory.makeSymbol("ASSOC");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SHOP-VERBOSE-KEYS*"));
        $list8 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBOSE-MSG-LEVEL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY")), (SubLObject)shop_basic_plan_state.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBOSE-THREAD-LEVEL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VERBOSE")))));
        $sym9$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("VERBOSE-THREAD-LEVEL"), (SubLObject)SubLObjectFactory.makeSymbol("VERBOSE-MSG-LEVEL"));
        $sym11$SHOP_PLAN_STATE = SubLObjectFactory.makeSymbol("SHOP-PLAN-STATE");
        $list12 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EXPAND"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("APPLY-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("APPLY-OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATOR")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")));
        $sym13$SHOP_BASIC_PLAN_STATE = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE");
        $sym14$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-PLAN-STATE"));
        $list16 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORLD-STATE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASKLIST"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MBINDINGS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-STRUCS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARTIAL-PLAN"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POST-ORDERING"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-PROPERTIES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREVIOUS-STATES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLANNER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODEL-MT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DYNAMIC-PREDICATES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("APPLICABLE-MULTIBINDING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MBIND")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PLANNER"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PLANNER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("P")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-PLAN-STATE-WITH-PROBLEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER-THREAD")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INIT-MODEL-WITH-PROBLEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-MULTIBINDINGS"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-NEXT"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-WORLD-STATE"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-WORLD-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MULTIBINDINGS"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-MULTIBINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MBIND")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TASKLIST"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-TASKLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASKS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PREVIOUS-STATES"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PREVIOUS-STATES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASKS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-PREVIOUS-STATES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-MBINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PARTIAL-PLAN"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-PARTIAL-PLAN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("P")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-POST-ORDERING"), (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan_state.T), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EXPAND-COMPLEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EXPAND-PRIMITIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EXPAND-PRIMITIVE-PRECONDITIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-MBINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GOALS"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDING")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SEEK-TOTAL-MBINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GOALS"), (SubLObject)SubLObjectFactory.makeSymbol("MBIND")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("APPLY-CONDITIONAL-OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATOR")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("APPLY-OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATOR")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("APPLY-OPERATORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATORS"), (SubLObject)SubLObjectFactory.makeSymbol("COND-OPERATORS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PARENT-TASK?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COPY"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("APPLY-SUFFICIENT-CONDITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("SCOND")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("APPLY-ALL-SUFFICIENT-CONDITIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("APPLY-ALL-METHODS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("APPLY-ALL-PRECONDITIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("APPLY-PRECONDITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("PRECOND")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-WHICH-PLANS"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym17$DYNAMIC_PREDICATES = SubLObjectFactory.makeSymbol("DYNAMIC-PREDICATES");
        $sym18$MODEL_MT = SubLObjectFactory.makeSymbol("MODEL-MT");
        $sym19$DOMAIN = SubLObjectFactory.makeSymbol("DOMAIN");
        $sym20$LOG = SubLObjectFactory.makeSymbol("LOG");
        $sym21$PLANNER = SubLObjectFactory.makeSymbol("PLANNER");
        $sym22$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym23$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_STATE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-STATE-CLASS");
        $sym24$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym25$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym26$WORLD_STATE = SubLObjectFactory.makeSymbol("WORLD-STATE");
        $sym27$TASKLIST = SubLObjectFactory.makeSymbol("TASKLIST");
        $sym28$MBINDINGS = SubLObjectFactory.makeSymbol("MBINDINGS");
        $sym29$TASK_STRUCS = SubLObjectFactory.makeSymbol("TASK-STRUCS");
        $sym30$SUPPORTS = SubLObjectFactory.makeSymbol("SUPPORTS");
        $sym31$PARTIAL_PLAN = SubLObjectFactory.makeSymbol("PARTIAL-PLAN");
        $sym32$POST_ORDERING = SubLObjectFactory.makeSymbol("POST-ORDERING");
        $sym33$QUERY_PROPERTIES = SubLObjectFactory.makeSymbol("QUERY-PROPERTIES");
        $sym34$DEPTH = SubLObjectFactory.makeSymbol("DEPTH");
        $sym35$PREVIOUS_STATES = SubLObjectFactory.makeSymbol("PREVIOUS-STATES");
        $sym36$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_STATE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-STATE-INSTANCE");
        $sym37$APPLICABLE_MULTIBINDING = SubLObjectFactory.makeSymbol("APPLICABLE-MULTIBINDING");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MBIND"));
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param MBIND multibinding-p\n   @return multibinding-p ;; MBIND that is possibly reduced to only functional bindings."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("*SHOP-USE-MULTIBINDINGS?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MB-SIMPLE-BINDING"), (SubLObject)SubLObjectFactory.makeSymbol("MBIND")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MBIND"))));
        $sym41$SHOP_BASIC_PLAN_STATE_APPLICABLE_MULTIBINDING_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-APPLICABLE-MULTIBINDING-METHOD");
        $sym42$SET_TASKLIST = SubLObjectFactory.makeSymbol("SET-TASKLIST");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASKS"));
        $list44 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TASKS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TASKLIST"), (SubLObject)SubLObjectFactory.makeSymbol("TASKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TASKS")));
        $sym45$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym46$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym47$SHOP_BASIC_PLAN_STATE_SET_TASKLIST_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-SET-TASKLIST-METHOD");
        $sym48$GET_TASKLIST = SubLObjectFactory.makeSymbol("GET-TASKLIST");
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list50 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TASKLIST")));
        $sym51$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym52$SHOP_BASIC_PLAN_STATE_GET_TASKLIST_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-GET-TASKLIST-METHOD");
        $sym53$ADD_DECOMPOSITION = SubLObjectFactory.makeSymbol("ADD-DECOMPOSITION");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("DECOMPOSITION"));
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Replaces first element of slot TASKLIST with DECOMPOSITION, and a SUPERTASK \n   (for the plan tree post-order) of TASK. The SUPERTASK signals to the bookkeeping code\n   that a complete branch of the tree has been planned, and we can now plan other\n   branches."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TASKLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("DECOMPOSITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("SUPERTASK"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"))), (SubLObject)SubLObjectFactory.makeSymbol("TASKLIST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TASKLIST")));
        $sym57$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $kw58$SUPERTASK = SubLObjectFactory.makeKeyword("SUPERTASK");
        $sym59$SHOP_BASIC_PLAN_STATE_ADD_DECOMPOSITION_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-ADD-DECOMPOSITION-METHOD");
        $sym60$SET_MULTIBINDINGS = SubLObjectFactory.makeSymbol("SET-MULTIBINDINGS");
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MBINDING"));
        $list62 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDINGS")));
        $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym64$SHOP_BASIC_PLAN_STATE_SET_MULTIBINDINGS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-SET-MULTIBINDINGS-METHOD");
        $sym65$MULTIBINDINGS = SubLObjectFactory.makeSymbol("MULTIBINDINGS");
        $list66 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDINGS")));
        $sym67$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym68$SHOP_BASIC_PLAN_STATE_MULTIBINDINGS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-MULTIBINDINGS-METHOD");
        $sym69$SET_DOMAIN = SubLObjectFactory.makeSymbol("SET-DOMAIN");
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DOMAIN"));
        $list71 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DOMAIN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN")));
        $sym72$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym73$SHOP_BASIC_PLAN_STATE_SET_DOMAIN_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-SET-DOMAIN-METHOD");
        $sym74$GET_DOMAIN = SubLObjectFactory.makeSymbol("GET-DOMAIN");
        $list75 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN")));
        $sym76$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym77$SHOP_BASIC_PLAN_STATE_GET_DOMAIN_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-GET-DOMAIN-METHOD");
        $sym78$SUPPORT_LISTS = SubLObjectFactory.makeSymbol("SUPPORT-LISTS");
        $list79 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS")));
        $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym81$SHOP_BASIC_PLAN_STATE_SUPPORT_LISTS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-SUPPORT-LISTS-METHOD");
        $sym82$ADD_TO_SUPPORT_LISTS = SubLObjectFactory.makeSymbol("ADD-TO-SUPPORT-LISTS");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRECOND"));
        $list84 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("PRECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS")));
        $sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym86$SHOP_BASIC_PLAN_STATE_ADD_TO_SUPPORT_LISTS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-ADD-TO-SUPPORT-LISTS-METHOD");
        $sym87$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list88 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"), (SubLObject)shop_basic_plan_state.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDINGS"), (SubLObject)shop_basic_plan_state.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("POST-ORDERING"), (SubLObject)shop_basic_plan_state.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-STRUCS"), (SubLObject)shop_basic_plan_state.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)shop_basic_plan_state.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym89$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym90$SHOP_BASIC_PLAN_STATE_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-INITIALIZE-METHOD");
        $sym91$INITIALIZE_PLAN_STATE_WITH_PROBLEM = SubLObjectFactory.makeSymbol("INITIALIZE-PLAN-STATE-WITH-PROBLEM");
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER-THREAD"));
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param PROBLEM         shop-basic-problem-p\n   @param PLANNER-THREAD  shop-basic-planner-thread-p\n   @return nil"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TASKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-TASKS"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM")), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-WORLD-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM")), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TASKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REPLACE-VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER-THREAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-MANAGER"))), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TASKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EMPTY-MB")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-TASKLIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TASKS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-WORLD-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-WORLD-STATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER-THREAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-PLANNER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER-THREAD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INIT-MODEL-WITH-PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-MULTIBINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-PROPERTIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-QUERY-PROPERTIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TIME-CUTOFF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NUM-BACKCHAINS"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")) }));
        $sym95$VAR_MANAGER = SubLObjectFactory.makeSymbol("VAR-MANAGER");
        $sym96$TIME_CUTOFF = SubLObjectFactory.makeSymbol("TIME-CUTOFF");
        $sym97$NUM_BACKCHAINS = SubLObjectFactory.makeSymbol("NUM-BACKCHAINS");
        $sym98$SHOP_BASIC_PLAN_STATE_INITIALIZE_PLAN_STATE_WITH_PROBLEM_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-INITIALIZE-PLAN-STATE-WITH-PROBLEM-METHOD");
        $sym99$INITIALIZE_MULTIBINDINGS = SubLObjectFactory.makeSymbol("INITIALIZE-MULTIBINDINGS");
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $list101 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASKLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-TASKLIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MBINDING"), (SubLObject)shop_basic_plan_state.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MODEL-MT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GROUND?"), (SubLObject)SubLObjectFactory.makeSymbol("TASKLIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EMPTY-MB"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SINGLETON?"), (SubLObject)SubLObjectFactory.makeSymbol("TASKLIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-INITIAL-MULTIBINDING-FOR-TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("TASKLIST")), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("INITIALIZE-MULTIBINGINGS: Initial Tasklist contains more than one task.")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-MULTIBINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDING"))));
        $str102$INITIALIZE_MULTIBINGINGS__Initial = SubLObjectFactory.makeString("INITIALIZE-MULTIBINGINGS: Initial Tasklist contains more than one task.");
        $sym103$SHOP_BASIC_PLAN_STATE_INITIALIZE_MULTIBINDINGS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-INITIALIZE-MULTIBINDINGS-METHOD");
        $sym104$OUTPUT_MESSAGE = SubLObjectFactory.makeSymbol("OUTPUT-MESSAGE");
        $list105 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $list106 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-LOG")), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"))));
        $sym107$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym108$SHOP_BASIC_PLAN_STATE_OUTPUT_MESSAGE_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-OUTPUT-MESSAGE-METHOD");
        $sym109$COPY = SubLObjectFactory.makeSymbol("COPY");
        $list110 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT-SLOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASSES-ALL-SLOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-DIFFERENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASSES-ALL-SLOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT-SLOTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-SLOT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN-STATE"))));
        $sym111$SHOP_BASIC_PLAN_STATE_COPY_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-COPY-METHOD");
        $sym112$CREATE_NEXT = SubLObjectFactory.makeSymbol("CREATE-NEXT");
        $list113 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-TASKLIST"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("TASKLIST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-DEPTH"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-STATE"))));
        $sym114$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym115$SHOP_BASIC_PLAN_STATE_CREATE_NEXT_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-CREATE-NEXT-METHOD");
        $sym116$INIT_MODEL_WITH_PROBLEM = SubLObjectFactory.makeSymbol("INIT-MODEL-WITH-PROBLEM");
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"));
        $list118 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param PROBLEM shop-basic-problem-p\n   @return nil"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-MT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MODEL-MT")), (SubLObject)SubLObjectFactory.makeSymbol("TASK-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_plan_state.NIL)));
        $sym119$TASK_MT = SubLObjectFactory.makeSymbol("TASK-MT");
        $sym120$SHOP_BASIC_PLAN_STATE_INIT_MODEL_WITH_PROBLEM_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-INIT-MODEL-WITH-PROBLEM-METHOD");
        $sym121$SET_WORLD_STATE = SubLObjectFactory.makeSymbol("SET-WORLD-STATE");
        $list122 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S"));
        $list123 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-WORLD-STATE-P"), (SubLObject)SubLObjectFactory.makeSymbol("S")), (SubLObject)SubLObjectFactory.makeString("(SET-WORLD-STATE ~s): ~S is not a valid SHOP-WORLD-STATE-P."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("S")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("WORLD-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("S")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("S")));
        $sym124$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $str125$_SET_WORLD_STATE__s____S_is_not_a = SubLObjectFactory.makeString("(SET-WORLD-STATE ~s): ~S is not a valid SHOP-WORLD-STATE-P.");
        $sym126$SHOP_BASIC_PLAN_STATE_SET_WORLD_STATE_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-SET-WORLD-STATE-METHOD");
        $sym127$GET_WORLD_STATE = SubLObjectFactory.makeSymbol("GET-WORLD-STATE");
        $list128 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("WORLD-STATE")));
        $sym129$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym130$SHOP_BASIC_PLAN_STATE_GET_WORLD_STATE_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-GET-WORLD-STATE-METHOD");
        $sym131$MBINDING = SubLObjectFactory.makeSymbol("MBINDING");
        $sym132$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym133$SHOP_BASIC_PLAN_STATE_MBINDING_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-MBINDING-METHOD");
        $sym134$SET_DEPTH = SubLObjectFactory.makeSymbol("SET-DEPTH");
        $list135 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("D"));
        $list136 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("D"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("D")));
        $sym137$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym138$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym139$SHOP_BASIC_PLAN_STATE_SET_DEPTH_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-SET-DEPTH-METHOD");
        $list140 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")));
        $sym141$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym142$SHOP_BASIC_PLAN_STATE_DEPTH_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-DEPTH-METHOD");
        $sym143$SET_PREVIOUS_STATES = SubLObjectFactory.makeSymbol("SET-PREVIOUS-STATES");
        $list144 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATES"));
        $list145 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PREVIOUS-STATES"), (SubLObject)SubLObjectFactory.makeSymbol("STATES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("STATES")));
        $sym146$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym147$SHOP_BASIC_PLAN_STATE_SET_PREVIOUS_STATES_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-SET-PREVIOUS-STATES-METHOD");
        $sym148$GET_PREVIOUS_STATES = SubLObjectFactory.makeSymbol("GET-PREVIOUS-STATES");
        $list149 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PREVIOUS-STATES")));
        $sym150$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym151$SHOP_BASIC_PLAN_STATE_GET_PREVIOUS_STATES_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-GET-PREVIOUS-STATES-METHOD");
        $sym152$ADD_TO_PREVIOUS_STATES = SubLObjectFactory.makeSymbol("ADD-TO-PREVIOUS-STATES");
        $list153 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATE"));
        $list154 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("STATE"), (SubLObject)SubLObjectFactory.makeSymbol("PREVIOUS-STATES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PREVIOUS-STATES")));
        $sym155$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym156$SHOP_BASIC_PLAN_STATE_ADD_TO_PREVIOUS_STATES_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-ADD-TO-PREVIOUS-STATES-METHOD");
        $sym157$SET_PARTIAL_PLAN = SubLObjectFactory.makeSymbol("SET-PARTIAL-PLAN");
        $list158 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("P"));
        $list159 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PARTIAL-PLAN"), (SubLObject)SubLObjectFactory.makeSymbol("P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("P")));
        $sym160$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym161$SHOP_BASIC_PLAN_STATE_SET_PARTIAL_PLAN_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-SET-PARTIAL-PLAN-METHOD");
        $sym162$GET_PARTIAL_PLAN = SubLObjectFactory.makeSymbol("GET-PARTIAL-PLAN");
        $list163 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PARTIAL-PLAN")));
        $sym164$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym165$SHOP_BASIC_PLAN_STATE_GET_PARTIAL_PLAN_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-GET-PARTIAL-PLAN-METHOD");
        $sym166$ADD_TO_PARTIAL_PLAN = SubLObjectFactory.makeSymbol("ADD-TO-PARTIAL-PLAN");
        $list167 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"));
        $list168 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("PARTIAL-PLAN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PARTIAL-PLAN")));
        $sym169$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym170$SHOP_BASIC_PLAN_STATE_ADD_TO_PARTIAL_PLAN_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-ADD-TO-PARTIAL-PLAN-METHOD");
        $sym171$ADD_TO_POST_ORDERING = SubLObjectFactory.makeSymbol("ADD-TO-POST-ORDERING");
        $list172 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("POST-ORDERING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("POST-ORDERING")));
        $sym173$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym174$SHOP_BASIC_PLAN_STATE_ADD_TO_POST_ORDERING_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-ADD-TO-POST-ORDERING-METHOD");
        $sym175$ADD_TO_MBINDINGS = SubLObjectFactory.makeSymbol("ADD-TO-MBINDINGS");
        $list176 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDING"));
        $list177 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPOSE-MULTIBINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("BINDING"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDINGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDINGS")));
        $sym178$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym179$SHOP_BASIC_PLAN_STATE_ADD_TO_MBINDINGS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-ADD-TO-MBINDINGS-METHOD");
        $sym180$PLANNER_RULES = SubLObjectFactory.makeSymbol("PLANNER-RULES");
        $list181 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-STRUCS")));
        $sym182$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym183$SHOP_BASIC_PLAN_STATE_PLANNER_RULES_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-PLANNER-RULES-METHOD");
        $sym184$ADD_TO_TASK_STRUCS = SubLObjectFactory.makeSymbol("ADD-TO-TASK-STRUCS");
        $list185 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-STRUC"));
        $list186 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-STRUC"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-STRUCS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-STRUCS")));
        $sym187$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym188$SHOP_BASIC_PLAN_STATE_ADD_TO_TASK_STRUCS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-ADD-TO-TASK-STRUCS-METHOD");
        $sym189$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym190$SHOP_BASIC_PLAN_STATE_TASK_STRUCS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-TASK-STRUCS-METHOD");
        $sym191$GET_PLANNER = SubLObjectFactory.makeSymbol("GET-PLANNER");
        $list192 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER")));
        $sym193$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym194$SHOP_BASIC_PLAN_STATE_GET_PLANNER_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-GET-PLANNER-METHOD");
        $sym195$SET_PLANNER = SubLObjectFactory.makeSymbol("SET-PLANNER");
        $list196 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER"), (SubLObject)SubLObjectFactory.makeSymbol("P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("P")));
        $sym197$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym198$SHOP_BASIC_PLAN_STATE_SET_PLANNER_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-SET-PLANNER-METHOD");
        $sym199$GET_WHICH_PLANS = SubLObjectFactory.makeSymbol("GET-WHICH-PLANS");
        $list200 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER"), (SubLObject)SubLObjectFactory.makeString("(GET-WHICH-PLANS ~S): No planner associated with this plan-state."), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-WHICH-PLANS"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD")), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER"))));
        $sym201$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $str202$_GET_WHICH_PLANS__S___No_planner_ = SubLObjectFactory.makeString("(GET-WHICH-PLANS ~S): No planner associated with this plan-state.");
        $sym203$SHOP_BASIC_PLAN_STATE_GET_WHICH_PLANS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-GET-WHICH-PLANS-METHOD");
        $sym204$SIMPLE_SITUATION_PRED_ = SubLObjectFactory.makeSymbol("SIMPLE-SITUATION-PRED?");
        $list205 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"));
        $list206 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-SITUATION-PREDS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("PRED-SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_plan_state.T)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimpleSituationPredicate")), (SubLObject)SubLObjectFactory.makeSymbol("MODEL-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ADD"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("PRED-SET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_plan_state.T)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_plan_state.NIL)));
        $sym207$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym208$SIMPLE_SITUATION_PREDS = SubLObjectFactory.makeSymbol("SIMPLE-SITUATION-PREDS");
        $const209$SimpleSituationPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimpleSituationPredicate"));
        $sym210$SHOP_BASIC_PLAN_STATE_SIMPLE_SITUATION_PRED__METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-SIMPLE-SITUATION-PRED?-METHOD");
        $sym211$SEEK_TOTAL_MBINDINGS = SubLObjectFactory.makeSymbol("SEEK-TOTAL-MBINDINGS");
        $list212 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GOALS"), (SubLObject)SubLObjectFactory.makeSymbol("MBIND"));
        $list213 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param GOALS listp\n   @param MBIND multibinding-p\n   @return listp ;; of mulibinding-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("GOALS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("MBIND")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BACKCHAIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NUM-BACKCHAINS")))), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("HALT-REASON"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITHOUT-WFF-SEMANTICS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GENERATE-READABLE-FI-RESULTS*"), (SubLObject)shop_basic_plan_state.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CHECK-ARITY?*"), (SubLObject)shop_basic_plan_state.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CHECK-WFF-CONSTANTS?*"), (SubLObject)shop_basic_plan_state.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SIMPLIFY-SENTENCE?*"), (SubLObject)shop_basic_plan_state.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*TURN-EXISTENTIALS-INTO-SKOLEMS?*"), (SubLObject)shop_basic_plan_state.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CANONICALIZE-LITERALS?*"), (SubLObject)shop_basic_plan_state.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CANONICALIZE-FUNCTIONS?*"), (SubLObject)SubLObjectFactory.makeSymbol("*SHOP-CANONICALIZE-FUNCTIONS?*"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("*SHOP-USE-MT-WORLD-STATES?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASK"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("WORLD-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)SubLObjectFactory.makeSymbol("GOALS")), (SubLObject)SubLObjectFactory.makeSymbol("MBIND"), (SubLObject)SubLObjectFactory.makeSymbol("BACKCHAIN"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-QUERY-PLAN-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("*SHOP-USE-SHOP-ASK?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("HALT-REASON"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-ASK-INT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)SubLObjectFactory.makeSymbol("GOALS")), (SubLObject)SubLObjectFactory.makeSymbol("MODEL-MT"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-PROPERTIES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("HALT-REASON"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CYC-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)SubLObjectFactory.makeSymbol("GOALS")), (SubLObject)SubLObjectFactory.makeSymbol("MODEL-MT"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-PROPERTIES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONFIRM-BINDINGS-AGAINST-WORLD-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("WORLD-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("GOALS"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-INFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-STATISTIC-MANAGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("STATS-MANAGER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("CYC-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-INFERENCE")), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("HALT-REASON"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("*SHOP-USE-INFERENCE-SUPPORTS?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PAIRLIS"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)shop_basic_plan_state.NIL))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan_state.EQUAL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAAR"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)shop_basic_plan_state.T, (SubLObject)shop_basic_plan_state.T)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("MBIND")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*MB-REIFY-NATS?*"), (SubLObject)shop_basic_plan_state.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONVERT-BINDING-LISTS-AND-SUPPORTS-TO-MBINDS"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("MBIND")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MULTIBINDING-FAILED?"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_plan_state.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDINGS")))));
        $sym214$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $const215$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $sym216$STATS_MANAGER = SubLObjectFactory.makeSymbol("STATS-MANAGER");
        $kw217$CYC_QUERY = SubLObjectFactory.makeKeyword("CYC-QUERY");
        $sym218$VERBOSE = SubLObjectFactory.makeSymbol("VERBOSE");
        $sym219$LOG_INFERENCE = SubLObjectFactory.makeSymbol("LOG-INFERENCE");
        $list220 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)shop_basic_plan_state.T, (SubLObject)shop_basic_plan_state.T));
        $sym221$SHOP_BASIC_PLAN_STATE_SEEK_TOTAL_MBINDINGS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-SEEK-TOTAL-MBINDINGS-METHOD");
        $sym222$FIND_MBINDINGS = SubLObjectFactory.makeSymbol("FIND-MBINDINGS");
        $list223 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GOALS"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDING"));
        $list224 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Returns a list of all satisfiers of GOALS from the current\n   WORLD-STATE."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("*SHOP-INFER-COMPLETE-PRECONDITIONS?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEEK-TOTAL-MBINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("GOALS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-MULTIBINDING"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDING"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_plan_state.NIL));
        $sym225$SHOP_BASIC_PLAN_STATE_FIND_MBINDINGS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-FIND-MBINDINGS-METHOD");
        $sym226$SHOP_SAME_TASK_ = SubLObjectFactory.makeSymbol("SHOP-SAME-TASK?");
        $sym227$PARENT_TASK_ = SubLObjectFactory.makeSymbol("PARENT-TASK?");
        $list228 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TASK hl-formula-p\n    @return booleanp\n    Return T if there exists an element of slot PARTIAL-PLAN which is\n    EQUAL to TASK and does not also occur in POST-ORDERING. This means\n    that TASK is decomposed from an equivalent task, and should be\n    removed if cycle checking is enabled."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POTENTIAL-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("PARTIAL-PLAN"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDO"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-POTENTIALS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-FIND-NEXT-MATCH"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("POTENTIAL-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-FIND-NEXT-MATCH"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-POTENTIALS"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-POTENTIALS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_plan_state.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-POTENTIALS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan_state.EQUAL, (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-TASK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-TASK"), (SubLObject)SubLObjectFactory.makeSymbol("POST-ORDERING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_basic_plan_state.EQ)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_plan_state.T))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIFER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-UNIFY"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-TASK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-UNIFY-FAILED?"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*MB-REIFY-NATS?*"), (SubLObject)shop_basic_plan_state.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIFIER-MB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONVERT-BINDING-TO-MBIND"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFER"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDINGS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIER-MB")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INVERSE-MB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MB-INVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIER-MB")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-UNIFY-FAILED?"), (SubLObject)SubLObjectFactory.makeSymbol("INVERSE-MB")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-TASK"), (SubLObject)SubLObjectFactory.makeSymbol("POST-ORDERING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_basic_plan_state.EQ)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_plan_state.T)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("INVERSE-MB")))))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_plan_state.NIL)));
        $sym229$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym230$SHOP_BASIC_PLAN_STATE_PARENT_TASK__METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-PARENT-TASK?-METHOD");
        $sym231$EXPAND = SubLObjectFactory.makeSymbol("EXPAND");
        $list232 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("expands a plan state by taking the first task of\n   the TASKLIST, if it is an operator call\n   APPLY-OPERATOR, otherwise call APPLY-METHOD."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("TASKLIST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASKNAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("TASK1")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("TASKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SECTION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-HEADING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeString("Search Depth ~s"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeString("task ~s"), (SubLObject)SubLObjectFactory.makeSymbol("TASK1"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)shop_basic_plan_state.EQ, (SubLObject)SubLObjectFactory.makeSymbol("TASKNAME"), (SubLObject)SubLObjectFactory.makeKeyword("SUPERTASK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-POST-ORDERING"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("TASK1"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TASKLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("TASKLIST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("*SHOP-METHOD-CYCLE-CHECKING-ENABLED?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARENT-TASK?"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TASK1"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("GOALS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("WARNING")), (SubLObject)SubLObjectFactory.makeString("Prune -- Method Cycle checking detected a loop"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_plan_state.NIL)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-SITUATION-PRED?"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TASKNAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPAND-PRIMITIVE-PRECONDITIONS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TASK1")))), (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan_state.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPAND-COMPLEX"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TASK1")))))));
        $sym233$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $kw234$TASKS = SubLObjectFactory.makeKeyword("TASKS");
        $sym235$NEW_SECTION = SubLObjectFactory.makeSymbol("NEW-SECTION");
        $sym236$LOG_HEADING = SubLObjectFactory.makeSymbol("LOG-HEADING");
        $str237$Search_Depth__s = SubLObjectFactory.makeString("Search Depth ~s");
        $str238$task__s = SubLObjectFactory.makeString("task ~s");
        $kw239$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw240$GOALS = SubLObjectFactory.makeKeyword("GOALS");
        $sym241$WARNING = SubLObjectFactory.makeSymbol("WARNING");
        $str242$Prune____Method_Cycle_checking_de = SubLObjectFactory.makeString("Prune -- Method Cycle checking detected a loop");
        $sym243$SHOP_BASIC_PLAN_STATE_EXPAND_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-EXPAND-METHOD");
        $sym244$EXPAND_COMPLEX = SubLObjectFactory.makeSymbol("EXPAND-COMPLEX");
        $list245 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCOND-NODES"), (SubLObject)SubLObjectFactory.makeSymbol("INVERSE-UNIFIERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY-ALL-SUFFICIENT-CONDITIONS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-NODES"), (SubLObject)shop_basic_plan_state.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("SCOND-NODES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-UNIFIER"), (SubLObject)SubLObjectFactory.makeSymbol("INVERSE-UNIFIERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MULTIBINDING-FAILED?"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-UNIFIER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-UNIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLICABLE-MULTIBINDING"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-UNIFIER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TASKS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY-MULTIBINDING"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-UNIFIER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-TASK"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TASKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY-ALL-METHODS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-TASK")), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NODES"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NODES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY-ALL-METHODS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("SCOND-NODES"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NODES"))))));
        $list246 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCOND-NODES"), (SubLObject)SubLObjectFactory.makeSymbol("INVERSE-UNIFIERS"));
        $sym247$SHOP_BASIC_PLAN_STATE_EXPAND_COMPLEX_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-EXPAND-COMPLEX-METHOD");
        $sym248$EXPAND_PRIMITIVE_PRECONDITIONS = SubLObjectFactory.makeSymbol("EXPAND-PRIMITIVE-PRECONDITIONS");
        $list249 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY-ALL-PRECONDITIONS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPAND-PRIMITIVE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")))));
        $sym250$SHOP_BASIC_PLAN_STATE_EXPAND_PRIMITIVE_PRECONDITIONS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-EXPAND-PRIMITIVE-PRECONDITIONS-METHOD");
        $sym251$EXPAND_PRIMITIVE = SubLObjectFactory.makeSymbol("EXPAND-PRIMITIVE");
        $list252 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("OPERATORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-NEWLINE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY")), (SubLObject)SubLObjectFactory.makeString("Finding operators for task..."))), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD")), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-OPERATORS"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN")), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COND-OPERATORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CONDITIONAL-OPERATORS"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN")), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"))), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-WORLD-STATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATORS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("WARNING")), (SubLObject)SubLObjectFactory.makeString("No operator for task")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-PARTIAL-PLAN"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-TASK-STRUCS"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN-STATE"), (SubLObject)shop_basic_plan_state.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-DECOMPOSITION"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)shop_basic_plan_state.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN-STATE")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-WORLD-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY-OPERATORS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATORS"), (SubLObject)SubLObjectFactory.makeSymbol("COND-OPERATORS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-WORLD-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_plan_state.NIL)), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLE-CHECKING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PREVIOUS-STATES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SAME-STATE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-WORLD-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-WORLD-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("OLD-STATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("CUTOFFS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("WARNING")), (SubLObject)SubLObjectFactory.makeString("Prune -- World State Cycle Checking detected a loop"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_plan_state.NIL)))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-WORLD-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-WORLD-STATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-PREVIOUS-STATES"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-WORLD-STATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-PARTIAL-PLAN"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-TASK-STRUCS"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATORS"), (SubLObject)SubLObjectFactory.makeSymbol("COND-OPERATORS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-DECOMPOSITION"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)shop_basic_plan_state.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN-STATE"))) }));
        $sym253$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $kw254$OPERATORS = SubLObjectFactory.makeKeyword("OPERATORS");
        $sym255$LOG_NEWLINE = SubLObjectFactory.makeSymbol("LOG-NEWLINE");
        $sym256$LOG_ENTRY = SubLObjectFactory.makeSymbol("LOG-ENTRY");
        $str257$Finding_operators_for_task___ = SubLObjectFactory.makeString("Finding operators for task...");
        $str258$No_operator_for_task = SubLObjectFactory.makeString("No operator for task");
        $sym259$CYCLE_CHECKING = SubLObjectFactory.makeSymbol("CYCLE-CHECKING");
        $kw260$CUTOFFS = SubLObjectFactory.makeKeyword("CUTOFFS");
        $str261$Prune____World_State_Cycle_Checki = SubLObjectFactory.makeString("Prune -- World State Cycle Checking detected a loop");
        $sym262$SHOP_BASIC_PLAN_STATE_EXPAND_PRIMITIVE_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-EXPAND-PRIMITIVE-METHOD");
        $sym263$APPLY_OPERATORS = SubLObjectFactory.makeSymbol("APPLY-OPERATORS");
        $list264 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATORS"), (SubLObject)SubLObjectFactory.makeSymbol("COND-OPERATORS"));
        $list265 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("WORLD-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-STATE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADDS"), (SubLObject)shop_basic_plan_state.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETES"), (SubLObject)shop_basic_plan_state.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOTAL-NUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("COND-OPERATORS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-OP"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATORS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ADDS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DELETES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-OP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ADDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("LIT"), (SubLObject)SubLObjectFactory.makeSymbol("ADDS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DELETES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("LIT"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST-NUMBERED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-OP"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("COND-OPERATORS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("OPERATORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-FANCY-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeString("Trying [~s/~s]:"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-NUM")), (SubLObject)SubLObjectFactory.makeSymbol("TOTAL-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOLD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-NEWLINE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ADDS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DELETES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY-CONDITIONAL-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-OP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ADDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("LIT"), (SubLObject)SubLObjectFactory.makeSymbol("ADDS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DELETES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("LIT"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES"))))), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), SubLObjectFactory.makeKeyword("OPERATORS"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-NEWLINE"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY")), (SubLObject)SubLObjectFactory.makeString("Making New World State")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY")), (SubLObject)SubLObjectFactory.makeString("Adds: ")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-TO-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("ADDS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY")), (SubLObject)SubLObjectFactory.makeString("Deletes: ")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-TO-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RACE-LITS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERSECTION"), (SubLObject)SubLObjectFactory.makeSymbol("ADDS"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_basic_plan_state.EQUAL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("RACE-LITS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OUTPUT-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeString("Warning: Add/Delete race condition (~a) with operators ~a and conditional operators ~a."), (SubLObject)SubLObjectFactory.makeSymbol("RACE-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATORS"), (SubLObject)SubLObjectFactory.makeSymbol("COND-OPERATORS"))))) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-LITERALS")), (SubLObject)SubLObjectFactory.makeSymbol("DELETES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-LITERALS")), (SubLObject)SubLObjectFactory.makeSymbol("ADDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))));
        $sym266$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym267$NEXT_STATE = SubLObjectFactory.makeSymbol("NEXT-STATE");
        $sym268$LOG_FANCY_ENTRY = SubLObjectFactory.makeSymbol("LOG-FANCY-ENTRY");
        $str269$Trying___s__s__ = SubLObjectFactory.makeString("Trying [~s/~s]:");
        $list270 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOLD"));
        $str271$Making_New_World_State = SubLObjectFactory.makeString("Making New World State");
        $str272$Adds__ = SubLObjectFactory.makeString("Adds: ");
        $str273$Deletes__ = SubLObjectFactory.makeString("Deletes: ");
        $str274$Warning__Add_Delete_race_conditio = SubLObjectFactory.makeString("Warning: Add/Delete race condition (~a) with operators ~a and conditional operators ~a.");
        $sym275$DELETE_LITERALS = SubLObjectFactory.makeSymbol("DELETE-LITERALS");
        $sym276$ADD_LITERALS = SubLObjectFactory.makeSymbol("ADD-LITERALS");
        $sym277$SHOP_BASIC_PLAN_STATE_APPLY_OPERATORS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-APPLY-OPERATORS-METHOD");
        $sym278$APPLY_OPERATOR = SubLObjectFactory.makeSymbol("APPLY-OPERATOR");
        $list279 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"));
        $list280 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param  TASK hl-formula-p\n   @param  OPERATOR shop-operator-p\n   @return shop-plan-state-p\n   If OPERATOR is applicable to TASK in self's WORLD-STATE, then return\n   the resulting PLAN-STATE.  Otherwise return NIL."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-OPERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-UNIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-UNIFY-FAILED?"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DELETES"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-OPERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADDITIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-ADDS"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-OPERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("OPERATOR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-APPLY-SUBSTITUTION"), (SubLObject)SubLObjectFactory.makeSymbol("ADDITIONS"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-APPLY-SUBSTITUTION"), (SubLObject)SubLObjectFactory.makeSymbol("DELETIONS"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIER"))))))));
        $sym281$SHOP_BASIC_PLAN_STATE_APPLY_OPERATOR_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-APPLY-OPERATOR-METHOD");
        $sym282$APPLY_CONDITIONAL_OPERATOR = SubLObjectFactory.makeSymbol("APPLY-CONDITIONAL-OPERATOR");
        $list283 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param COND-EFFECT shop-basic-conditional-effect-p\n   @param UNIFIER multibinding-p\n   @return listp"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-MANAGER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-OPERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADDS"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT")), (SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETES"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT")), (SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT")), (SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUB-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("ADDS"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-UNIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")))), (SubLObject)SubLObjectFactory.makeSymbol("WORLD-STATE-MBINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-UNIFY-FAILED?"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("WORLD-STATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("OPERATORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-PLANNER-RULE")), (SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-APPLY-SUBSTITUTION"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REPLACE-VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER")), (SubLObject)SubLObjectFactory.makeSymbol("VAR-MANAGER"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDINGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("WORLD-STATE-MBINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-MBINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("MBINDINGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("WORLD-STATE-MBINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SINGLETON?"), (SubLObject)SubLObjectFactory.makeSymbol("WORLD-STATE-MBINDINGS")), (SubLObject)SubLObjectFactory.makeString("(apply-conditional-operator shop-basic-plan-state): ~a not a singleton list."), (SubLObject)SubLObjectFactory.makeSymbol("WORLD-STATE-MBINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-MBINDING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLICABLE-MULTIBINDING"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("WORLD-STATE-MBINDINGS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ADDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY-MULTIBINDING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-MBINDING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY-MULTIBINDING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THIRD"), (SubLObject)SubLObjectFactory.makeSymbol("SUB-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-MBINDING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)SubLObjectFactory.makeSymbol("ADDS"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES")))))));
        $sym284$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym285$LOG_PLANNER_RULE = SubLObjectFactory.makeSymbol("LOG-PLANNER-RULE");
        $str286$_apply_conditional_operator_shop_ = SubLObjectFactory.makeString("(apply-conditional-operator shop-basic-plan-state): ~a not a singleton list.");
        $sym287$SHOP_BASIC_PLAN_STATE_APPLY_CONDITIONAL_OPERATOR_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-APPLY-CONDITIONAL-OPERATOR-METHOD");
        $sym288$UNIFY_PLANNER_RULE = SubLObjectFactory.makeSymbol("UNIFY-PLANNER-RULE");
        $list289 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("RULE"));
        $list290 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TASK hl-formula-p\n   @param RULE shop-planner-rule-p\n   prepare the multibindings and decompositions for expansion. This means\n   making sure that all the variables that need to be substituted are and that\n   all the bookkeeping is kept in the mbinding."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR-MANAGER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-MANAGER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-MBINDING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLICABLE-MULTIBINDING"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDINGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIFIED-HEAD-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIFY-TASK-TO-HEAD-WITH-DATA"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-RULE")), (SubLObject)SubLObjectFactory.makeSymbol("RULE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIED-HEAD-DATA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-UNIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIED-HEAD-DATA"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIED-HEAD-DATA")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-UNIFY-FAILED?"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-UNIFIER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRECOND-DECOMP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY-MULTIBINDING"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-DATA"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-MBINDING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATED-VAR-BPAIRS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATED-VARIABLES-BOUND"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER")), (SubLObject)SubLObjectFactory.makeSymbol("TASK-UNIFIER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-MBINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MB-ADD-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("GENERATED-VAR-BPAIRS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("RULE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTIONS")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-VARS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-EL-VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-VARS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-HL-VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-SUBST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PAIRLIS"), (SubLObject)SubLObjectFactory.makeSymbol("HL-VARS"), (SubLObject)SubLObjectFactory.makeSymbol("EL-VARS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PRECOND-DECOMP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBLIS"), (SubLObject)SubLObjectFactory.makeSymbol("EL-SUBST"), (SubLObject)SubLObjectFactory.makeSymbol("PRECOND-DECOMP"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DECOMP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REPLACE-VARIABLES"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER")), (SubLObject)SubLObjectFactory.makeSymbol("VAR-MANAGER"), (SubLObject)SubLObjectFactory.makeSymbol("PRECOND-DECOMP"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MBINDINGS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MBINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("DECOMP")))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeKeyword("FAIL"))));
        $sym291$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym292$UNIFY_TASK_TO_HEAD_WITH_DATA = SubLObjectFactory.makeSymbol("UNIFY-TASK-TO-HEAD-WITH-DATA");
        $sym293$SHOP_VARIABLE_MANAGER = SubLObjectFactory.makeSymbol("SHOP-VARIABLE-MANAGER");
        $sym294$ASSERTIONS = SubLObjectFactory.makeSymbol("ASSERTIONS");
        $kw295$FAIL = SubLObjectFactory.makeKeyword("FAIL");
        $sym296$SHOP_BASIC_PLAN_STATE_UNIFY_PLANNER_RULE_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-UNIFY-PLANNER-RULE-METHOD");
        $sym297$APPLY_ALL_METHODS = SubLObjectFactory.makeSymbol("APPLY-ALL-METHODS");
        $list298 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TASK hl-formula-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NODES"), (SubLObject)shop_basic_plan_state.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD")), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-PRED-MATCHED-METHODS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-METHODS"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN")), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOTAL-NUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-PRED-MATCHED-METHODS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("PLANNER-RULES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-NEWLINE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY")), (SubLObject)SubLObjectFactory.makeString("Finding methods for task..."))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-PRED-MATCHED-METHODS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST-NUMBERED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-PRED-MATCHED-METHODS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("PLANNER-RULES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-FANCY-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeString("Trying [~s/~s]:"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-NUM")), (SubLObject)SubLObjectFactory.makeSymbol("TOTAL-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOLD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-NEWLINE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-METHOD")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("GOALS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("WARNING")), (SubLObject)SubLObjectFactory.makeString("No matching methods were found!")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODES"))));
        $sym299$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $kw300$PLANNER_RULES = SubLObjectFactory.makeKeyword("PLANNER-RULES");
        $str301$Finding_methods_for_task___ = SubLObjectFactory.makeString("Finding methods for task...");
        $str302$No_matching_methods_were_found_ = SubLObjectFactory.makeString("No matching methods were found!");
        $sym303$SHOP_BASIC_PLAN_STATE_APPLY_ALL_METHODS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-APPLY-ALL-METHODS-METHOD");
        $sym304$APPLY_METHOD = SubLObjectFactory.makeSymbol("APPLY-METHOD");
        $list305 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD"));
        $list306 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TASK hl-formula-p\n   @param METHOD shop-basic-method-p\n   If METHOD is applicable to TASK in plan state STATE, then execute SEEK-PLANS\n   method of the resulting list of PLAN-STATES. Returns NIL."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NODES"), (SubLObject)shop_basic_plan_state.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIFIED-DECOMP-MBINDING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIFY-PLANNER-RULE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("METHODS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-PLANNER-RULE")), (SubLObject)SubLObjectFactory.makeSymbol("METHOD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan_state.EQ, (SubLObject)SubLObjectFactory.makeKeyword("FAIL"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIED-DECOMP-MBINDING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-MBINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("PRE"), (SubLObject)SubLObjectFactory.makeSymbol("REDUCTION")), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIED-DECOMP-MBINDING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATE-UNIFIERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-MBINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("PRE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MBINDINGS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("STATE-UNIFIERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST-NUMBERED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIFIER"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("STATE-UNIFIERS")), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-MBINDING")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("METHODS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-FANCY-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeString("Result ~s"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT-NUM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOLD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-PREFORMATTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MULTIBINDING-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeString("Decomposition:~%"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"), (SubLObject)SubLObjectFactory.makeSymbol("REDUCTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("R"), (SubLObject)SubLObjectFactory.makeSymbol("REDUCTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-PREFORMATTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeString("~,,6,@s~%"), (SubLObject)SubLObjectFactory.makeSymbol("R")))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-PARTIAL-PLAN"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SHOP-BASIC-PLAN-STATE-MBINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIER")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-TASK-STRUCS"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-MBINDING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLICABLE-MULTIBINDING"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIER"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-DECOMPOSITION"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY-MULTIBINDING"), (SubLObject)SubLObjectFactory.makeSymbol("REDUCTION"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-MBINDING")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PLAN-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODES")) }))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODES")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_plan_state.NIL));
        $sym307$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $kw308$METHODS = SubLObjectFactory.makeKeyword("METHODS");
        $list309 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-MBINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("PRE"), (SubLObject)SubLObjectFactory.makeSymbol("REDUCTION"));
        $str310$Result__s = SubLObjectFactory.makeString("Result ~s");
        $sym311$LOG_PREFORMATTED = SubLObjectFactory.makeSymbol("LOG-PREFORMATTED");
        $str312$Decomposition___ = SubLObjectFactory.makeString("Decomposition:~%");
        $str313$___6__s__ = SubLObjectFactory.makeString("~,,6,@s~%");
        $sym314$SHOP_BASIC_PLAN_STATE_APPLY_METHOD_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-APPLY-METHOD-METHOD");
        $sym315$APPLY_ALL_SUFFICIENT_CONDITIONS = SubLObjectFactory.makeSymbol("APPLY-ALL-SUFFICIENT-CONDITIONS");
        $list316 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TASK hl-formula-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NODES"), (SubLObject)shop_basic_plan_state.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-THREAD")), (SubLObject)SubLObjectFactory.makeSymbol("PLANNER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-SUFFICIENT-CONDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SUFFICIENT-CONDS"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN")), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INVERSE-UNIFIERS"), (SubLObject)shop_basic_plan_state.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOTAL-NUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-SUFFICIENT-CONDS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("PLANNER-RULES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-NEWLINE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY")), (SubLObject)SubLObjectFactory.makeString("Finding sufficient condition rules for task..."))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-SUFFICIENT-CONDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST-NUMBERED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-SCOND"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-SUFFICIENT-CONDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("PLANNER-RULES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-FANCY-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeString("Trying [~s/~s]:"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-NUM")), (SubLObject)SubLObjectFactory.makeSymbol("TOTAL-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOLD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-NEWLINE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODES"), (SubLObject)SubLObjectFactory.makeSymbol("INVERSE-UNIFIER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY-SUFFICIENT-CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-SCOND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH*"), (SubLObject)SubLObjectFactory.makeSymbol("NODES"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("INVERSE-UNIFIER"), (SubLObject)SubLObjectFactory.makeSymbol("INVERSE-UNIFIERS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("GOALS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("WARNING")), (SubLObject)SubLObjectFactory.makeString("No matching sufficient conditions were found!")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODES"), (SubLObject)SubLObjectFactory.makeSymbol("INVERSE-UNIFIERS")))));
        $sym317$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $str318$Finding_sufficient_condition_rule = SubLObjectFactory.makeString("Finding sufficient condition rules for task...");
        $list319 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODES"), (SubLObject)SubLObjectFactory.makeSymbol("INVERSE-UNIFIER"));
        $str320$No_matching_sufficient_conditions = SubLObjectFactory.makeString("No matching sufficient conditions were found!");
        $sym321$SHOP_BASIC_PLAN_STATE_APPLY_ALL_SUFFICIENT_CONDITIONS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-APPLY-ALL-SUFFICIENT-CONDITIONS-METHOD");
        $sym322$APPLY_SUFFICIENT_CONDITION = SubLObjectFactory.makeSymbol("APPLY-SUFFICIENT-CONDITION");
        $list323 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("SCOND"));
        $list324 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TASK hl-formula-p\n   @param SCOND shop-sufficiency-condition-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NODES"), (SubLObject)shop_basic_plan_state.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIFIED-TASK-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIFY-PLANNER-RULE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("SCOND")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("METHODS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-PLANNER-RULE")), (SubLObject)SubLObjectFactory.makeSymbol("SCOND"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan_state.EQ, (SubLObject)SubLObjectFactory.makeSymbol("UNIFIED-TASK-DATA"), (SubLObject)SubLObjectFactory.makeKeyword("FAIL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-MBINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION")), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIED-TASK-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATE-UNIFIERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-MBINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MBINDINGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INVERSE-UNIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MULTIBINDING-INVERSE-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MBINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("STATE-UNIFIERS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-UNIFIER"), (SubLObject)SubLObjectFactory.makeSymbol("STATE-UNIFIERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-PARTIAL-PLAN"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-TASK-STRUCS"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("SCOND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SHOP-BASIC-PLAN-STATE-MBINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-UNIFIER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-TASKLIST"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("SUPERTASK"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("TASKLIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NODES"), (SubLObject)SubLObjectFactory.makeSymbol("INVERSE-UNIFIER")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)shop_basic_plan_state.NIL))));
        $sym325$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $list326 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-MBINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION"));
        $sym327$SHOP_BASIC_PLAN_STATE_APPLY_SUFFICIENT_CONDITION_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-APPLY-SUFFICIENT-CONDITION-METHOD");
        $sym328$APPLY_ALL_PRECONDITIONS = SubLObjectFactory.makeSymbol("APPLY-ALL-PRECONDITIONS");
        $list329 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TASK hl-formula-p\n   @return booleanp  -- t if preconditions for TASK are all satisfied by world state"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRECONDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-PLANNER-RULES"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN")), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-PRECONDITION-P")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOTAL-NUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("PRECONDS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("OPERATORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-NEWLINE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-ENTRY")), (SubLObject)SubLObjectFactory.makeString("Finding precondition rules for task..."))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("PRECONDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("OPERATORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("WARNING")), (SubLObject)SubLObjectFactory.makeString("No precondition rules found!"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_plan_state.T)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST-NUMBERED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRECOND"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("PRECONDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("OPERATORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-FANCY-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)shop_basic_plan_state.NIL, (SubLObject)SubLObjectFactory.makeString("Trying [~s/~s]:"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-NUM")), (SubLObject)SubLObjectFactory.makeSymbol("TOTAL-NUM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOLD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-NEWLINE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY-PRECONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("PRECOND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_plan_state.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_plan_state.T))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_plan_state.NIL)));
        $sym330$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $sym331$SHOP_PRECONDITION_P = SubLObjectFactory.makeSymbol("SHOP-PRECONDITION-P");
        $str332$Finding_precondition_rules_for_ta = SubLObjectFactory.makeString("Finding precondition rules for task...");
        $str333$No_precondition_rules_found_ = SubLObjectFactory.makeString("No precondition rules found!");
        $sym334$SHOP_BASIC_PLAN_STATE_APPLY_ALL_PRECONDITIONS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-APPLY-ALL-PRECONDITIONS-METHOD");
        $sym335$APPLY_PRECONDITION = SubLObjectFactory.makeSymbol("APPLY-PRECONDITION");
        $list336 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("PRECOND"));
        $list337 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TASK hl-formula-p\n   @param PRECOND shop-precondition-p\n   @return listp of multibinding-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("PLANNER-RULES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LOG-PLANNER-RULE")), (SubLObject)SubLObjectFactory.makeSymbol("PRECOND"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIFIED-TASK-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIFY-PLANNER-RULE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("PRECOND")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)shop_basic_plan_state.EQ, (SubLObject)SubLObjectFactory.makeKeyword("FAIL"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIED-TASK-DATA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-MBINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("PRE"), (SubLObject)SubLObjectFactory.makeSymbol("REDUCTION")), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIED-TASK-DATA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("REDUCTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATE-UNIFIERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-MBINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("PRE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MBINDINGS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("STATE-UNIFIERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHEN-VERBOSE"), (SubLObject)SubLObjectFactory.makeKeyword("PLANNER-RULES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LOG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("WARNING")), (SubLObject)SubLObjectFactory.makeString("No bindings found!"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_plan_state.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("STATE-UNIFIERS")))))))));
        $sym338$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLAN-STATE-METHOD");
        $str339$No_bindings_found_ = SubLObjectFactory.makeString("No bindings found!");
        $sym340$SHOP_BASIC_PLAN_STATE_APPLY_PRECONDITION_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLAN-STATE-APPLY-PRECONDITION-METHOD");
    }
}

/*

	Total time: 1990 ms
	
*/