package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class shop_datastructures
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.shop_datastructures";
  public static final String myFingerPrint = "1d022beaf3a87e7f11db01ed5bc67d3a2b940e486d3ad0d7d2e1776a5ca25808";
  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 5139L)
  public static SubLSymbol $shop_unify_failed$;
  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 5243L)
  public static SubLSymbol $shop_empty_unifier$;
  private static final SubLSymbol $sym0$SHOP_INDEXED_OBJECT;
  private static final SubLSymbol $sym1$OBJECT;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$INSTANCE_INDEX;
  private static final SubLSymbol $sym4$INSTANCE_COUNT;
  private static final SubLSymbol $sym5$SUBLOOP_RESERVED_INITIALIZE_SHOP_INDEXED_OBJECT_CLASS;
  private static final SubLSymbol $sym6$ISOLATED_P;
  private static final SubLSymbol $sym7$INSTANCE_NUMBER;
  private static final SubLSymbol $sym8$SUBLOOP_RESERVED_INITIALIZE_SHOP_INDEXED_OBJECT_INSTANCE;
  private static final SubLSymbol $sym9$FIND_INSTANCE;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$OUTER_CATCH_FOR_SHOP_INDEXED_OBJECT_METHOD;
  private static final SubLSymbol $sym14$SHOP_INDEXED_OBJECT_FIND_INSTANCE_METHOD;
  private static final SubLSymbol $sym15$ADD_TO_INDEX;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$SHOP_INDEXED_OBJECT_ADD_TO_INDEX_METHOD;
  private static final SubLSymbol $sym19$INITIALIZE;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$SHOP_INDEXED_OBJECT_INITIALIZE_METHOD;
  private static final SubLSymbol $sym23$SHOP_PROBLEM;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$SHOP_PLANNER_RULE;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$SHOP_OPERATOR;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$SHOP_SUFFICIENCY_CONDITION;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$SHOP_METHOD;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLList $list35;
  private static final SubLSymbol $kw36$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw37$TEST;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$SHOP_MY_UNION_FUNC;
  private static final SubLSymbol $kw40$FAIL;
  private static final SubLSymbol $sym41$SHOP_COMPOSE_SUBSTITUTIONS_TEST;
  private static final SubLString $str42$_;
  private static final SubLSymbol $sym43$SHOP_STANDARDIZER_GENSYM;
  private static final SubLSymbol $sym44$SHOP_BASIC_PLANNER_RULE;
  private static final SubLList $list45;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$ASSERTION_LIST;
  private static final SubLSymbol $sym48$HEAD;
  private static final SubLSymbol $sym49$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_RULE_CLASS;
  private static final SubLSymbol $sym50$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_RULE_INSTANCE;
  private static final SubLSymbol $sym51$PRINT;
  private static final SubLList $list52;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD;
  private static final SubLString $str55$__PLANNER_RULE__S__S_;
  private static final SubLString $str56$__Malformed_Instance_;
  private static final SubLSymbol $sym57$SHOP_BASIC_PLANNER_RULE_PRINT_METHOD;
  private static final SubLSymbol $sym58$HTML_DISPLAY;
  private static final SubLList $list59;
  private static final SubLSymbol $sym60$SHOP_BASIC_PLANNER_RULE_HTML_DISPLAY_METHOD;
  private static final SubLSymbol $sym61$PRED;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD;
  private static final SubLSymbol $sym64$SHOP_BASIC_PLANNER_RULE_PRED_METHOD;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD;
  private static final SubLSymbol $sym67$SHOP_BASIC_PLANNER_RULE_HEAD_METHOD;
  private static final SubLSymbol $sym68$SET_HEAD;
  private static final SubLList $list69;
  private static final SubLList $list70;
  private static final SubLSymbol $sym71$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD;
  private static final SubLSymbol $sym72$SHOP_BASIC_PLANNER_RULE_SET_HEAD_METHOD;
  private static final SubLSymbol $sym73$ASSERTIONS;
  private static final SubLList $list74;
  private static final SubLSymbol $sym75$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD;
  private static final SubLSymbol $sym76$SHOP_BASIC_PLANNER_RULE_ASSERTIONS_METHOD;
  private static final SubLSymbol $sym77$SET_ASSERTIONS;
  private static final SubLList $list78;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD;
  private static final SubLSymbol $sym81$SHOP_BASIC_PLANNER_RULE_SET_ASSERTIONS_METHOD;
  private static final SubLSymbol $sym82$UNIFY_TASK_TO_HEAD;
  private static final SubLList $list83;
  private static final SubLList $list84;
  private static final SubLSymbol $sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD;
  private static final SubLSymbol $sym86$LISTP;
  private static final SubLSymbol $sym87$SHOP_BASIC_PLANNER_RULE_UNIFY_TASK_TO_HEAD_METHOD;
  private static final SubLSymbol $sym88$SHOP_CONDITIONAL_EFFECT;
  private static final SubLList $list89;
  private static final SubLSymbol $sym90$SHOP_BASIC_CONDITIONAL_EFFECT;
  private static final SubLList $list91;
  private static final SubLList $list92;
  private static final SubLSymbol $sym93$CONDITION;
  private static final SubLSymbol $sym94$DELETES;
  private static final SubLSymbol $sym95$ADDS;
  private static final SubLSymbol $sym96$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_CONDITIONAL_EFFECT_CLASS;
  private static final SubLSymbol $sym97$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_CONDITIONAL_EFFECT_INSTANC;
  private static final SubLList $list98;
  private static final SubLSymbol $sym99$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD;
  private static final SubLString $str100$__COND_EFFECT__S__S_;
  private static final SubLSymbol $sym101$SHOP_BASIC_CONDITIONAL_EFFECT_PRINT_METHOD;
  private static final SubLList $list102;
  private static final SubLSymbol $sym103$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD;
  private static final SubLString $str104$Condition__;
  private static final SubLString $str105$Adds__;
  private static final SubLString $str106$Deletes__;
  private static final SubLString $str107$Assertion__;
  private static final SubLSymbol $sym108$SHOP_BASIC_CONDITIONAL_EFFECT_HTML_DISPLAY_METHOD;
  private static final SubLSymbol $sym109$INIT;
  private static final SubLList $list110;
  private static final SubLList $list111;
  private static final SubLSymbol $sym112$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD;
  private static final SubLSymbol $sym113$SHOP_BASIC_CONDITIONAL_EFFECT_INIT_METHOD;
  private static final SubLList $list114;
  private static final SubLSymbol $sym115$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD;
  private static final SubLSymbol $sym116$SHOP_BASIC_CONDITIONAL_EFFECT_ADDS_METHOD;
  private static final SubLList $list117;
  private static final SubLSymbol $sym118$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD;
  private static final SubLSymbol $sym119$SHOP_BASIC_CONDITIONAL_EFFECT_DELETES_METHOD;
  private static final SubLList $list120;
  private static final SubLSymbol $sym121$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD;
  private static final SubLSymbol $sym122$SHOP_BASIC_CONDITIONAL_EFFECT_CONDITION_METHOD;
  private static final SubLSymbol $sym123$ASSERTION;
  private static final SubLSymbol $sym124$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD;
  private static final SubLSymbol $sym125$SHOP_BASIC_CONDITIONAL_EFFECT_ASSERTION_METHOD;
  private static final SubLSymbol $sym126$SHOP_BASIC_OPERATOR;
  private static final SubLList $list127;
  private static final SubLList $list128;
  private static final SubLSymbol $sym129$COST;
  private static final SubLSymbol $sym130$CONDITIONAL_EFFECTS;
  private static final SubLSymbol $sym131$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_OPERATOR_CLASS;
  private static final SubLSymbol $sym132$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_OPERATOR_INSTANCE;
  private static final SubLList $list133;
  private static final SubLSymbol $sym134$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD;
  private static final SubLString $str135$__OPERATOR__S__S_;
  private static final SubLSymbol $sym136$SHOP_BASIC_OPERATOR_PRINT_METHOD;
  private static final SubLList $list137;
  private static final SubLSymbol $sym138$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD;
  private static final SubLString $str139$__Head_;
  private static final SubLString $str140$__Add_literals__;
  private static final SubLString $str141$__Delete_literals__;
  private static final SubLString $str142$__Cost___S;
  private static final SubLSymbol $sym143$CB_FORM;
  private static final SubLSymbol $sym144$SHOP_BASIC_OPERATOR_HTML_DISPLAY_METHOD;
  private static final SubLList $list145;
  private static final SubLList $list146;
  private static final SubLSymbol $sym147$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD;
  private static final SubLSymbol $sym148$SHOP_BASIC_OPERATOR_INIT_METHOD;
  private static final SubLSymbol $sym149$GET_ADDS;
  private static final SubLList $list150;
  private static final SubLSymbol $sym151$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD;
  private static final SubLSymbol $sym152$SHOP_BASIC_OPERATOR_GET_ADDS_METHOD;
  private static final SubLSymbol $sym153$ADD_LITERALS_TO_ADDS;
  private static final SubLList $list154;
  private static final SubLList $list155;
  private static final SubLSymbol $sym156$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD;
  private static final SubLSymbol $sym157$SHOP_BASIC_OPERATOR_ADD_LITERALS_TO_ADDS_METHOD;
  private static final SubLSymbol $sym158$GET_DELETES;
  private static final SubLList $list159;
  private static final SubLSymbol $sym160$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD;
  private static final SubLSymbol $sym161$SHOP_BASIC_OPERATOR_GET_DELETES_METHOD;
  private static final SubLList $list162;
  private static final SubLSymbol $sym163$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD;
  private static final SubLSymbol $sym164$SHOP_BASIC_OPERATOR_CONDITIONAL_EFFECTS_METHOD;
  private static final SubLSymbol $sym165$ADD_LITERALS_TO_DELETES;
  private static final SubLList $list166;
  private static final SubLSymbol $sym167$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD;
  private static final SubLSymbol $sym168$SHOP_BASIC_OPERATOR_ADD_LITERALS_TO_DELETES_METHOD;
  private static final SubLSymbol $sym169$UNIT_TEST;
  private static final SubLList $list170;
  private static final SubLList $list171;
  private static final SubLList $list172;
  private static final SubLList $list173;
  private static final SubLList $list174;
  private static final SubLList $list175;
  private static final SubLList $list176;
  private static final SubLString $str177$op_adds__s__control_adds__s__;
  private static final SubLString $str178$op_deletes__s__control_deletes__s;
  private static final SubLString $str179$shop_basic_operator_unit_test____;
  private static final SubLString $str180$shop_basic_operator_unit_test____;
  private static final SubLSymbol $sym181$SHOP_BASIC_OPERATOR_UNIT_TEST_METHOD;
  private static final SubLSymbol $sym182$SHOP_BASIC_METHOD;
  private static final SubLList $list183;
  private static final SubLList $list184;
  private static final SubLSymbol $sym185$DECOMPOSITION;
  private static final SubLSymbol $sym186$PRECONDITION;
  private static final SubLSymbol $sym187$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_METHOD_CLASS;
  private static final SubLSymbol $sym188$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_METHOD_INSTANCE;
  private static final SubLList $list189;
  private static final SubLSymbol $sym190$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD;
  private static final SubLString $str191$__METHOD__S__S_;
  private static final SubLSymbol $sym192$SHOP_BASIC_METHOD_PRINT_METHOD;
  private static final SubLList $list193;
  private static final SubLSymbol $sym194$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD;
  private static final SubLString $str195$Precondition__;
  private static final SubLString $str196$Decomposition__;
  private static final SubLString $str197$Assertions__;
  private static final SubLSymbol $sym198$SHOP_BASIC_METHOD_HTML_DISPLAY_METHOD;
  private static final SubLList $list199;
  private static final SubLList $list200;
  private static final SubLSymbol $sym201$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD;
  private static final SubLSymbol $sym202$SHOP_BASIC_METHOD_INIT_METHOD;
  private static final SubLSymbol $sym203$SET_DECOMPOSITION;
  private static final SubLList $list204;
  private static final SubLList $list205;
  private static final SubLSymbol $sym206$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD;
  private static final SubLSymbol $sym207$SHOP_BASIC_METHOD_SET_DECOMPOSITION_METHOD;
  private static final SubLSymbol $sym208$GET_DECOMPOSITION;
  private static final SubLList $list209;
  private static final SubLSymbol $sym210$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD;
  private static final SubLSymbol $sym211$SHOP_BASIC_METHOD_GET_DECOMPOSITION_METHOD;
  private static final SubLSymbol $sym212$GET_PRECONDITION;
  private static final SubLList $list213;
  private static final SubLSymbol $sym214$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD;
  private static final SubLSymbol $sym215$SHOP_BASIC_METHOD_GET_PRECONDITION_METHOD;
  private static final SubLSymbol $sym216$UNIFY_TASK_TO_HEAD_WITH_DATA;
  private static final SubLList $list217;
  private static final SubLSymbol $sym218$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD;
  private static final SubLSymbol $sym219$SHOP_BASIC_METHOD_UNIFY_TASK_TO_HEAD_WITH_DATA_METHOD;
  private static final SubLSymbol $sym220$ADD_LITERALS_TO_PRECONDITION;
  private static final SubLList $list221;
  private static final SubLSymbol $sym222$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD;
  private static final SubLSymbol $sym223$SHOP_BASIC_METHOD_ADD_LITERALS_TO_PRECONDITION_METHOD;
  private static final SubLSymbol $sym224$SHOP_BASIC_SUFFICIENCY_COND;
  private static final SubLList $list225;
  private static final SubLList $list226;
  private static final SubLSymbol $sym227$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_SUFFICIENCY_COND_CLASS;
  private static final SubLSymbol $sym228$CONDITION_FORMULA;
  private static final SubLSymbol $sym229$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_SUFFICIENCY_COND_INSTANCE;
  private static final SubLList $list230;
  private static final SubLSymbol $sym231$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD;
  private static final SubLString $str232$__Shop_Scond__S__S_;
  private static final SubLSymbol $sym233$SHOP_BASIC_SUFFICIENCY_COND_PRINT_METHOD;
  private static final SubLList $list234;
  private static final SubLSymbol $sym235$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD;
  private static final SubLSymbol $sym236$SHOP_BASIC_SUFFICIENCY_COND_HTML_DISPLAY_METHOD;
  private static final SubLSymbol $sym237$COND_FORMULA;
  private static final SubLList $list238;
  private static final SubLSymbol $sym239$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD;
  private static final SubLSymbol $sym240$SHOP_BASIC_SUFFICIENCY_COND_COND_FORMULA_METHOD;
  private static final SubLSymbol $sym241$SET_COND_FORMULA;
  private static final SubLList $list242;
  private static final SubLSymbol $sym243$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD;
  private static final SubLSymbol $sym244$SHOP_BASIC_SUFFICIENCY_COND_SET_COND_FORMULA_METHOD;
  private static final SubLList $list245;
  private static final SubLSymbol $sym246$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD;
  private static final SubLSymbol $sym247$SHOP_BASIC_SUFFICIENCY_COND_UNIFY_TASK_TO_HEAD_WITH_DATA_METHOD;
  private static final SubLSymbol $sym248$SHOP_PRECONDITION;
  private static final SubLSymbol $sym249$SHOP_BASIC_PRECONDITION;
  private static final SubLList $list250;
  private static final SubLSymbol $sym251$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PRECONDITION_CLASS;
  private static final SubLSymbol $sym252$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PRECONDITION_INSTANCE;
  private static final SubLList $list253;
  private static final SubLSymbol $sym254$OUTER_CATCH_FOR_SHOP_BASIC_PRECONDITION_METHOD;
  private static final SubLString $str255$__SHOP_PRECOND__S__S_;
  private static final SubLSymbol $sym256$SHOP_BASIC_PRECONDITION_PRINT_METHOD;
  private static final SubLSymbol $sym257$SHOP_BASIC_PROBLEM;
  private static final SubLList $list258;
  private static final SubLList $list259;
  private static final SubLSymbol $sym260$STATE;
  private static final SubLSymbol $sym261$TASKS;
  private static final SubLSymbol $sym262$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PROBLEM_CLASS;
  private static final SubLSymbol $sym263$NAME;
  private static final SubLSymbol $sym264$DOMAIN;
  private static final SubLSymbol $sym265$TASK_MT;
  private static final SubLSymbol $sym266$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PROBLEM_INSTANCE;
  private static final SubLList $list267;
  private static final SubLSymbol $sym268$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD;
  private static final SubLSymbol $sym269$SHOP_BASIC_PROBLEM_INITIALIZE_METHOD;
  private static final SubLSymbol $sym270$INITIALIZE_PROBLEM;
  private static final SubLList $list271;
  private static final SubLList $list272;
  private static final SubLSymbol $sym273$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD;
  private static final SubLSymbol $sym274$SHOP_BASIC_PROBLEM_INITIALIZE_PROBLEM_METHOD;
  private static final SubLList $list275;
  private static final SubLSymbol $sym276$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD;
  private static final SubLString $str277$__PROBLEM__S__S_;
  private static final SubLSymbol $sym278$SHOP_BASIC_PROBLEM_PRINT_METHOD;
  private static final SubLSymbol $sym279$SET_NAME;
  private static final SubLList $list280;
  private static final SubLList $list281;
  private static final SubLSymbol $sym282$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD;
  private static final SubLSymbol $sym283$SHOP_BASIC_PROBLEM_SET_NAME_METHOD;
  private static final SubLSymbol $sym284$GET_NAME;
  private static final SubLList $list285;
  private static final SubLSymbol $sym286$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD;
  private static final SubLSymbol $sym287$SHOP_BASIC_PROBLEM_GET_NAME_METHOD;
  private static final SubLSymbol $sym288$SET_DOMAIN;
  private static final SubLList $list289;
  private static final SubLList $list290;
  private static final SubLSymbol $sym291$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD;
  private static final SubLSymbol $sym292$SHOP_BASIC_PROBLEM_SET_DOMAIN_METHOD;
  private static final SubLSymbol $sym293$GET_DOMAIN;
  private static final SubLList $list294;
  private static final SubLSymbol $sym295$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD;
  private static final SubLSymbol $sym296$SHOP_BASIC_PROBLEM_GET_DOMAIN_METHOD;
  private static final SubLSymbol $sym297$GET_METHODS;
  private static final SubLList $list298;
  private static final SubLSymbol $sym299$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD;
  private static final SubLSymbol $sym300$METHODS;
  private static final SubLSymbol $sym301$SHOP_BASIC_PROBLEM_GET_METHODS_METHOD;
  private static final SubLSymbol $sym302$GET_OPERATORS;
  private static final SubLList $list303;
  private static final SubLSymbol $sym304$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD;
  private static final SubLSymbol $sym305$OPERATORS;
  private static final SubLSymbol $sym306$SHOP_BASIC_PROBLEM_GET_OPERATORS_METHOD;
  private static final SubLSymbol $sym307$GET_TASKS;
  private static final SubLList $list308;
  private static final SubLSymbol $sym309$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD;
  private static final SubLSymbol $sym310$SHOP_BASIC_PROBLEM_GET_TASKS_METHOD;
  private static final SubLSymbol $sym311$SET_TASKS;
  private static final SubLList $list312;
  private static final SubLList $list313;
  private static final SubLSymbol $sym314$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD;
  private static final SubLSymbol $sym315$SHOP_BASIC_PROBLEM_SET_TASKS_METHOD;
  private static final SubLSymbol $sym316$GET_STATE;
  private static final SubLList $list317;
  private static final SubLSymbol $sym318$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD;
  private static final SubLSymbol $sym319$SHOP_BASIC_PROBLEM_GET_STATE_METHOD;
  private static final SubLSymbol $sym320$SET_STATE;
  private static final SubLList $list321;
  private static final SubLList $list322;
  private static final SubLSymbol $sym323$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD;
  private static final SubLSymbol $sym324$SHOP_BASIC_PROBLEM_SET_STATE_METHOD;
  private static final SubLString $str325$SHOP_Category;
  private static final SubLString $str326$SHOP;
  private static final SubLList $list327;

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 791L)
  public static SubLObject get_shop_indexed_object_instance_index(final SubLObject shop_indexed_object)
  {
    final SubLObject v_class = shop_indexed_object.isSymbol() ? classes.classes_retrieve_class( shop_indexed_object )
        : ( ( NIL != subloop_structures.class_p( shop_indexed_object ) ) ? shop_indexed_object
            : ( ( NIL != subloop_structures.instance_p( shop_indexed_object ) ) ? subloop_structures.instance_class( shop_indexed_object ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym3$INSTANCE_INDEX, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), ONE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 791L)
  public static SubLObject set_shop_indexed_object_instance_index(final SubLObject shop_indexed_object, final SubLObject value)
  {
    final SubLObject v_class = shop_indexed_object.isSymbol() ? classes.classes_retrieve_class( shop_indexed_object )
        : ( ( NIL != subloop_structures.class_p( shop_indexed_object ) ) ? shop_indexed_object
            : ( ( NIL != subloop_structures.instance_p( shop_indexed_object ) ) ? subloop_structures.instance_class( shop_indexed_object ) : NIL ) );
    if( NIL != v_class )
    {
      classes.classes_access_check_class_slot( v_class, slots.slot_assoc( $sym3$INSTANCE_INDEX, subloop_structures.class_compiled_class_slot_access_alist( v_class ) ) );
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), ONE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 791L)
  public static SubLObject subloop_reserved_initialize_shop_indexed_object_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym4$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym0$SHOP_INDEXED_OBJECT, $sym3$INSTANCE_INDEX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 791L)
  public static SubLObject subloop_reserved_initialize_shop_indexed_object_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$INSTANCE_NUMBER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 791L)
  public static SubLObject shop_indexed_object_p(final SubLObject shop_indexed_object)
  {
    return classes.subloop_instanceof_class( shop_indexed_object, $sym0$SHOP_INDEXED_OBJECT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 1109L)
  public static SubLObject shop_indexed_object_find_instance_method(final SubLObject self, final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_indexed_object_method = NIL;
    final SubLObject instance_index = get_shop_indexed_object_instance_index( self );
    try
    {
      thread.throwStack.push( $sym13$OUTER_CATCH_FOR_SHOP_INDEXED_OBJECT_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym13$OUTER_CATCH_FOR_SHOP_INDEXED_OBJECT_METHOD, dictionary.dictionary_lookup( instance_index, id, NIL ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_indexed_object_instance_index( self, instance_index );
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
      catch_var_for_shop_indexed_object_method = Errors.handleThrowable( ccatch_env_var, $sym13$OUTER_CATCH_FOR_SHOP_INDEXED_OBJECT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_indexed_object_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 1313L)
  public static SubLObject shop_indexed_object_add_to_index_method(final SubLObject self)
  {
    final SubLObject instance_number = object.get_object_instance_number( self );
    SubLObject instance_index = get_shop_indexed_object_instance_index( self );
    if( NIL == instance_index )
    {
      set_shop_indexed_object_instance_index( self, dictionary.new_dictionary( Symbols.symbol_function( EQ ), TEN_INTEGER ) );
      instance_index = get_shop_indexed_object_instance_index( self );
    }
    dictionary.dictionary_enter( instance_index, instance_number, self );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 1798L)
  public static SubLObject shop_indexed_object_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    object.object_initialize_method( self );
    if( NIL != shop_parameters.$shop_object_indexingP$.getDynamicValue( thread ) )
    {
      shop_indexed_object_add_to_index_method( self );
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 1996L)
  public static SubLObject shop_problem_p(final SubLObject shop_problem)
  {
    return interfaces.subloop_instanceof_interface( shop_problem, $sym23$SHOP_PROBLEM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 2651L)
  public static SubLObject shop_planner_rule_p(final SubLObject shop_planner_rule)
  {
    return interfaces.subloop_instanceof_interface( shop_planner_rule, $sym25$SHOP_PLANNER_RULE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 3072L)
  public static SubLObject shop_operator_p(final SubLObject shop_operator)
  {
    return interfaces.subloop_instanceof_interface( shop_operator, $sym27$SHOP_OPERATOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 3342L)
  public static SubLObject shop_sufficiency_condition_p(final SubLObject shop_sufficiency_condition)
  {
    return interfaces.subloop_instanceof_interface( shop_sufficiency_condition, $sym30$SHOP_SUFFICIENCY_CONDITION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 3721L)
  public static SubLObject shop_method_p(final SubLObject shop_method)
  {
    return interfaces.subloop_instanceof_interface( shop_method, $sym32$SHOP_METHOD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 3987L)
  public static SubLObject shop_my_union(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject set1 = NIL;
    SubLObject set2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    set1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list34 );
    set2 = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list34 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list34 );
      if( NIL == conses_high.member( current_$1, $list35, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw36$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list34 );
    }
    final SubLObject test_tail = cdestructuring_bind.property_list_member( $kw37$TEST, current );
    final SubLObject test = ( NIL != test_tail ) ? conses_high.cadr( test_tail ) : $list38;
    return ConsesLow.list( $sym39$SHOP_MY_UNION_FUNC, set1, set2, test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 4319L)
  public static SubLObject shop_my_union_func(final SubLObject set1, SubLObject set2, final SubLObject test)
  {
    SubLObject cdolist_list_var = set1;
    SubLObject x = NIL;
    x = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_var = x;
      if( NIL == conses_high.member( item_var, set2, test, Symbols.symbol_function( IDENTITY ) ) )
      {
        set2 = ConsesLow.cons( item_var, set2 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      x = cdolist_list_var.first();
    }
    return set2;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 4436L)
  public static SubLObject shop_same_set_p(final SubLObject x, final SubLObject y)
  {
    return makeBoolean( NIL != conses_high.subsetp( x, y, Symbols.symbol_function( EQUAL ), UNPROVIDED ) && NIL != conses_high.subsetp( y, x, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 4606L)
  public static SubLObject shop_variablep(final SubLObject x)
  {
    return makeBoolean( NIL != variables.variable_p( x ) || NIL != cycl_grammar.el_variable_p( x ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 4862L)
  public static SubLObject shop_extract_variables(final SubLObject expr)
  {
    if( NIL != shop_variablep( expr ) )
    {
      return ConsesLow.list( expr );
    }
    if( expr.isCons() )
    {
      return shop_my_union_func( shop_extract_variables( expr.first() ), shop_extract_variables( expr.rest() ), Symbols.symbol_function( EQL ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 5341L)
  public static SubLObject shop_empty_bindingP(final SubLObject v_bindings)
  {
    return Equality.eq( v_bindings, $shop_empty_unifier$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 5435L)
  public static SubLObject shop_unify_failedP(final SubLObject v_bindings)
  {
    return Equality.eq( v_bindings, $shop_unify_failed$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 5527L)
  public static SubLObject shop_apply_substitution(final SubLObject target, final SubLObject a_list)
  {
    if( NIL == a_list )
    {
      return target;
    }
    if( NIL == target )
    {
      return NIL;
    }
    if( NIL != shop_variablep( target ) )
    {
      final SubLObject result = conses_high.assoc( target, a_list, UNPROVIDED, UNPROVIDED );
      if( NIL != result )
      {
        return result.rest();
      }
      return target;
    }
    else
    {
      if( target.isAtom() )
      {
        return target;
      }
      return ConsesLow.cons( shop_apply_substitution( target.first(), a_list ), shop_apply_substitution( target.rest(), a_list ) );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 6309L)
  public static SubLObject shop_compose_substitutions_test(final SubLObject x, final SubLObject y)
  {
    return Equality.equal( x.first(), y.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 6403L)
  public static SubLObject shop_compose_substitutions(SubLObject sub1, final SubLObject sub2)
  {
    SubLObject cdolist_list_var = sub1;
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ConsesLow.rplacd( pair, shop_apply_substitution( pair.rest(), sub2 ) );
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    cdolist_list_var = sub2;
    pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject item_var = pair;
      if( NIL == conses_high.member( item_var, sub1, Symbols.symbol_function( $sym41$SHOP_COMPOSE_SUBSTITUTIONS_TEST ), Symbols.symbol_function( IDENTITY ) ) )
      {
        sub1 = ConsesLow.cons( item_var, sub1 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    return sub1;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 6822L)
  public static SubLObject shop_unify(final SubLObject e1, final SubLObject e2)
  {
    if( NIL != shop_variablep( e1 ) )
    {
      if( e1.eql( e2 ) )
      {
        return NIL;
      }
      return ( NIL != shop_occurs( e1, e2 ) ) ? $shop_unify_failed$.getGlobalValue() : ConsesLow.list( ConsesLow.cons( e1, e2 ) );
    }
    else
    {
      if( NIL != nart_handles.nart_p( e1 ) || NIL != nart_handles.nart_p( e2 ) )
      {
        final SubLObject form1 = ( NIL != nart_handles.nart_p( e1 ) ) ? narts_high.nart_el_formula( e1 ) : e1;
        final SubLObject form2 = ( NIL != nart_handles.nart_p( e2 ) ) ? narts_high.nart_el_formula( e2 ) : e2;
        return shop_unify( form1, form2 );
      }
      if( e1.isAtom() )
      {
        if( e1.equal( e2 ) )
        {
          return NIL;
        }
        if( NIL != shop_variablep( e2 ) )
        {
          return ConsesLow.list( ConsesLow.cons( e2, e1 ) );
        }
        return $shop_unify_failed$.getGlobalValue();
      }
      else
      {
        if( NIL == e2 )
        {
          return $shop_unify_failed$.getGlobalValue();
        }
        if( !e2.isCons() )
        {
          return $shop_unify_failed$.getGlobalValue();
        }
        final SubLObject first_e1 = e1.first();
        final SubLObject first_e2 = e2.isCons() ? e2.first() : NIL;
        SubLObject hsub = NIL;
        hsub = ( NIL != first_e1 || NIL != first_e2 ) ? shop_unify( first_e1, first_e2 ) : NIL;
        if( NIL != shop_unify_failedP( hsub ) )
        {
          return $shop_unify_failed$.getGlobalValue();
        }
        final SubLObject tail1 = shop_apply_substitution( e1.rest(), hsub );
        final SubLObject tail2 = shop_apply_substitution( e2.rest(), hsub );
        SubLObject tsub = NIL;
        tsub = ( NIL != tail1 || NIL != tail2 ) ? shop_unify( tail1, tail2 ) : NIL;
        if( NIL != shop_unify_failedP( tsub ) )
        {
          return $shop_unify_failed$.getGlobalValue();
        }
        return shop_compose_substitutions( hsub, tsub );
      }
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 8534L)
  public static SubLObject shop_occurs(final SubLObject v, final SubLObject expr)
  {
    return expr.isAtom() ? Equality.eq( v, expr ) : makeBoolean( NIL != shop_occurs( v, expr.first() ) || NIL != shop_occurs( v, expr.rest() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 8769L)
  public static SubLObject shop_standardizer_gensym(final SubLObject x)
  {
    return ConsesLow.cons( x, Symbols.gensym( $str42$_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 8849L)
  public static SubLObject shop_standardizer(final SubLObject expression)
  {
    return Mapping.mapcar( Symbols.symbol_function( $sym43$SHOP_STANDARDIZER_GENSYM ), shop_extract_variables( expression ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 9103L)
  public static SubLObject shop_spec_formulaP(final SubLObject spec_form, final SubLObject form)
  {
    final SubLObject mgu = shop_unify( spec_form, form );
    if( mgu == $kw40$FAIL )
    {
      return NIL;
    }
    final SubLObject new_genl_form = shop_apply_substitution( form, mgu );
    if( new_genl_form.equal( spec_form ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 9946L)
  public static SubLObject get_shop_basic_planner_rule_assertion_list(final SubLObject shop_basic_planner_rule)
  {
    return classes.subloop_get_access_protected_instance_slot( shop_basic_planner_rule, TWO_INTEGER, $sym47$ASSERTION_LIST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 9946L)
  public static SubLObject set_shop_basic_planner_rule_assertion_list(final SubLObject shop_basic_planner_rule, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( shop_basic_planner_rule, value, TWO_INTEGER, $sym47$ASSERTION_LIST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 9946L)
  public static SubLObject get_shop_basic_planner_rule_head(final SubLObject shop_basic_planner_rule)
  {
    return classes.subloop_get_access_protected_instance_slot( shop_basic_planner_rule, ONE_INTEGER, $sym48$HEAD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 9946L)
  public static SubLObject set_shop_basic_planner_rule_head(final SubLObject shop_basic_planner_rule, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( shop_basic_planner_rule, value, ONE_INTEGER, $sym48$HEAD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 9946L)
  public static SubLObject subloop_reserved_initialize_shop_basic_planner_rule_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym4$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym0$SHOP_INDEXED_OBJECT, $sym3$INSTANCE_INDEX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 9946L)
  public static SubLObject subloop_reserved_initialize_shop_basic_planner_rule_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym44$SHOP_BASIC_PLANNER_RULE, $sym48$HEAD, NIL );
    classes.subloop_initialize_slot( new_instance, $sym44$SHOP_BASIC_PLANNER_RULE, $sym47$ASSERTION_LIST, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 9946L)
  public static SubLObject shop_basic_planner_rule_p(final SubLObject shop_basic_planner_rule)
  {
    return classes.subloop_instanceof_class( shop_basic_planner_rule, $sym44$SHOP_BASIC_PLANNER_RULE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 10253L)
  public static SubLObject shop_basic_planner_rule_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_rule_method = NIL;
    final SubLObject head = get_shop_basic_planner_rule_head( self );
    final SubLObject instance_number = object.get_object_instance_number( self );
    try
    {
      thread.throwStack.push( $sym54$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD );
      try
      {
        if( NIL != subloop_structures.instance_p( self ) )
        {
          PrintLow.format( stream, $str55$__PLANNER_RULE__S__S_, instance_number, head );
        }
        else
        {
          PrintLow.format( stream, $str56$__Malformed_Instance_ );
        }
        Dynamic.sublisp_throw( $sym54$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_rule_head( self, head );
          object.set_object_instance_number( self, instance_number );
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
      catch_var_for_shop_basic_planner_rule_method = Errors.handleThrowable( ccatch_env_var, $sym54$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_rule_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 10506L)
  public static SubLObject shop_basic_planner_rule_html_display_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    shop_basic_planner_rule_print_method( self, html_macros.$html_stream$.getDynamicValue( thread ), NIL );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 10626L)
  public static SubLObject shop_basic_planner_rule_pred_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_rule_method = NIL;
    final SubLObject head = get_shop_basic_planner_rule_head( self );
    try
    {
      thread.throwStack.push( $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD, cycl_utilities.formula_operator( head ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_rule_head( self, head );
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
      catch_var_for_shop_basic_planner_rule_method = Errors.handleThrowable( ccatch_env_var, $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_rule_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 10724L)
  public static SubLObject shop_basic_planner_rule_head_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_rule_method = NIL;
    final SubLObject head = get_shop_basic_planner_rule_head( self );
    try
    {
      thread.throwStack.push( $sym66$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym66$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD, head );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_rule_head( self, head );
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
      catch_var_for_shop_basic_planner_rule_method = Errors.handleThrowable( ccatch_env_var, $sym66$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_rule_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 10803L)
  public static SubLObject shop_basic_planner_rule_set_head_method(final SubLObject self, final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_rule_method = NIL;
    SubLObject head = get_shop_basic_planner_rule_head( self );
    try
    {
      thread.throwStack.push( $sym71$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD );
      try
      {
        head = form;
        Dynamic.sublisp_throw( $sym71$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD, head );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_rule_head( self, head );
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
      catch_var_for_shop_basic_planner_rule_method = Errors.handleThrowable( ccatch_env_var, $sym71$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_rule_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 10911L)
  public static SubLObject shop_basic_planner_rule_assertions_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_rule_method = NIL;
    final SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list( self );
    try
    {
      thread.throwStack.push( $sym75$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym75$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD, assertion_list );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_rule_assertion_list( self, assertion_list );
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
      catch_var_for_shop_basic_planner_rule_method = Errors.handleThrowable( ccatch_env_var, $sym75$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_rule_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11006L)
  public static SubLObject shop_basic_planner_rule_set_assertions_method(final SubLObject self, final SubLObject assertions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_rule_method = NIL;
    SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list( self );
    try
    {
      thread.throwStack.push( $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD );
      try
      {
        assertion_list = assertions;
        Dynamic.sublisp_throw( $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD, assertions );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_rule_assertion_list( self, assertion_list );
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
      catch_var_for_shop_basic_planner_rule_method = Errors.handleThrowable( ccatch_env_var, $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_rule_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11147L)
  public static SubLObject shop_basic_planner_rule_unify_task_to_head_method(final SubLObject self, final SubLObject task)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_planner_rule_method = NIL;
    final SubLObject head = get_shop_basic_planner_rule_head( self );
    try
    {
      thread.throwStack.push( $sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD );
      try
      {
        assert NIL != Types.listp( task ) : task;
        final SubLObject task_unifier = shop_unify( head, task );
        if( $kw40$FAIL != task_unifier )
        {
          Dynamic.sublisp_throw( $sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD, task_unifier );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_rule_head( self, head );
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
      catch_var_for_shop_basic_planner_rule_method = Errors.handleThrowable( ccatch_env_var, $sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_planner_rule_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11427L)
  public static SubLObject shop_conditional_effect_p(final SubLObject shop_conditional_effect)
  {
    return interfaces.subloop_instanceof_interface( shop_conditional_effect, $sym88$SHOP_CONDITIONAL_EFFECT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11958L)
  public static SubLObject get_shop_basic_conditional_effect_condition(final SubLObject shop_basic_conditional_effect)
  {
    return classes.subloop_get_access_protected_instance_slot( shop_basic_conditional_effect, FIVE_INTEGER, $sym93$CONDITION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11958L)
  public static SubLObject set_shop_basic_conditional_effect_condition(final SubLObject shop_basic_conditional_effect, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( shop_basic_conditional_effect, value, FIVE_INTEGER, $sym93$CONDITION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11958L)
  public static SubLObject get_shop_basic_conditional_effect_deletes(final SubLObject shop_basic_conditional_effect)
  {
    return classes.subloop_get_access_protected_instance_slot( shop_basic_conditional_effect, FOUR_INTEGER, $sym94$DELETES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11958L)
  public static SubLObject set_shop_basic_conditional_effect_deletes(final SubLObject shop_basic_conditional_effect, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( shop_basic_conditional_effect, value, FOUR_INTEGER, $sym94$DELETES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11958L)
  public static SubLObject get_shop_basic_conditional_effect_adds(final SubLObject shop_basic_conditional_effect)
  {
    return classes.subloop_get_access_protected_instance_slot( shop_basic_conditional_effect, THREE_INTEGER, $sym95$ADDS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11958L)
  public static SubLObject set_shop_basic_conditional_effect_adds(final SubLObject shop_basic_conditional_effect, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( shop_basic_conditional_effect, value, THREE_INTEGER, $sym95$ADDS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11958L)
  public static SubLObject subloop_reserved_initialize_shop_basic_conditional_effect_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym4$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym0$SHOP_INDEXED_OBJECT, $sym3$INSTANCE_INDEX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11958L)
  public static SubLObject subloop_reserved_initialize_shop_basic_conditional_effect_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym44$SHOP_BASIC_PLANNER_RULE, $sym48$HEAD, NIL );
    classes.subloop_initialize_slot( new_instance, $sym44$SHOP_BASIC_PLANNER_RULE, $sym47$ASSERTION_LIST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym90$SHOP_BASIC_CONDITIONAL_EFFECT, $sym95$ADDS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym90$SHOP_BASIC_CONDITIONAL_EFFECT, $sym94$DELETES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym90$SHOP_BASIC_CONDITIONAL_EFFECT, $sym93$CONDITION, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11958L)
  public static SubLObject shop_basic_conditional_effect_p(final SubLObject shop_basic_conditional_effect)
  {
    return classes.subloop_instanceof_class( shop_basic_conditional_effect, $sym90$SHOP_BASIC_CONDITIONAL_EFFECT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 12186L)
  public static SubLObject shop_basic_conditional_effect_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_conditional_effect_method = NIL;
    final SubLObject head = get_shop_basic_planner_rule_head( self );
    final SubLObject instance_number = object.get_object_instance_number( self );
    try
    {
      thread.throwStack.push( $sym99$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD );
      try
      {
        if( NIL != subloop_structures.instance_p( self ) )
        {
          PrintLow.format( stream, $str100$__COND_EFFECT__S__S_, instance_number, head );
        }
        else
        {
          PrintLow.format( stream, $str56$__Malformed_Instance_ );
        }
        Dynamic.sublisp_throw( $sym99$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_rule_head( self, head );
          object.set_object_instance_number( self, instance_number );
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
      catch_var_for_shop_basic_conditional_effect_method = Errors.handleThrowable( ccatch_env_var, $sym99$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_conditional_effect_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 12441L)
  public static SubLObject shop_basic_conditional_effect_html_display_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_conditional_effect_method = NIL;
    final SubLObject condition = get_shop_basic_conditional_effect_condition( self );
    final SubLObject deletes = get_shop_basic_conditional_effect_deletes( self );
    final SubLObject adds = get_shop_basic_conditional_effect_adds( self );
    final SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list( self );
    try
    {
      thread.throwStack.push( $sym103$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD );
      try
      {
        html_utilities.html_princ( $str104$Condition__ );
        cb_utilities.cb_form( instances.get_slot( self, $sym93$CONDITION ), UNPROVIDED, UNPROVIDED );
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_princ( $str105$Adds__ );
        cb_utilities.cb_form( instances.get_slot( self, $sym95$ADDS ), UNPROVIDED, UNPROVIDED );
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_princ( $str106$Deletes__ );
        cb_utilities.cb_form( instances.get_slot( self, $sym94$DELETES ), UNPROVIDED, UNPROVIDED );
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_princ( $str107$Assertion__ );
        cb_utilities.cb_form( instances.get_slot( self, $sym47$ASSERTION_LIST ), UNPROVIDED, UNPROVIDED );
        html_utilities.html_newline( UNPROVIDED );
        Dynamic.sublisp_throw( $sym103$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_conditional_effect_condition( self, condition );
          set_shop_basic_conditional_effect_deletes( self, deletes );
          set_shop_basic_conditional_effect_adds( self, adds );
          set_shop_basic_planner_rule_assertion_list( self, assertion_list );
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
      catch_var_for_shop_basic_conditional_effect_method = Errors.handleThrowable( ccatch_env_var, $sym103$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_conditional_effect_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 12864L)
  public static SubLObject shop_basic_conditional_effect_init_method(final SubLObject self, final SubLObject new_head, final SubLObject new_cond, final SubLObject new_adds, final SubLObject new_deletes,
      final SubLObject new_assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_conditional_effect_method = NIL;
    SubLObject condition = get_shop_basic_conditional_effect_condition( self );
    SubLObject deletes = get_shop_basic_conditional_effect_deletes( self );
    SubLObject adds = get_shop_basic_conditional_effect_adds( self );
    SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list( self );
    SubLObject head = get_shop_basic_planner_rule_head( self );
    try
    {
      thread.throwStack.push( $sym112$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD );
      try
      {
        head = new_head;
        adds = new_adds;
        deletes = new_deletes;
        condition = new_cond;
        assertion_list = ConsesLow.cons( new_assertion, assertion_list );
        Dynamic.sublisp_throw( $sym112$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_conditional_effect_condition( self, condition );
          set_shop_basic_conditional_effect_deletes( self, deletes );
          set_shop_basic_conditional_effect_adds( self, adds );
          set_shop_basic_planner_rule_assertion_list( self, assertion_list );
          set_shop_basic_planner_rule_head( self, head );
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
      catch_var_for_shop_basic_conditional_effect_method = Errors.handleThrowable( ccatch_env_var, $sym112$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_conditional_effect_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13250L)
  public static SubLObject shop_basic_conditional_effect_adds_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_conditional_effect_method = NIL;
    final SubLObject adds = get_shop_basic_conditional_effect_adds( self );
    try
    {
      thread.throwStack.push( $sym115$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym115$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD, adds );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_conditional_effect_adds( self, adds );
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
      catch_var_for_shop_basic_conditional_effect_method = Errors.handleThrowable( ccatch_env_var, $sym115$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_conditional_effect_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13335L)
  public static SubLObject shop_basic_conditional_effect_deletes_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_conditional_effect_method = NIL;
    final SubLObject deletes = get_shop_basic_conditional_effect_deletes( self );
    try
    {
      thread.throwStack.push( $sym118$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym118$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD, deletes );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_conditional_effect_deletes( self, deletes );
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
      catch_var_for_shop_basic_conditional_effect_method = Errors.handleThrowable( ccatch_env_var, $sym118$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_conditional_effect_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13426L)
  public static SubLObject shop_basic_conditional_effect_condition_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_conditional_effect_method = NIL;
    final SubLObject condition = get_shop_basic_conditional_effect_condition( self );
    try
    {
      thread.throwStack.push( $sym121$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym121$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD, condition );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_conditional_effect_condition( self, condition );
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
      catch_var_for_shop_basic_conditional_effect_method = Errors.handleThrowable( ccatch_env_var, $sym121$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_conditional_effect_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13521L)
  public static SubLObject shop_basic_conditional_effect_assertion_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_conditional_effect_method = NIL;
    final SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list( self );
    try
    {
      thread.throwStack.push( $sym124$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym124$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD, assertion_list );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_rule_assertion_list( self, assertion_list );
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
      catch_var_for_shop_basic_conditional_effect_method = Errors.handleThrowable( ccatch_env_var, $sym124$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_conditional_effect_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13621L)
  public static SubLObject get_shop_basic_operator_cost(final SubLObject shop_basic_operator)
  {
    return classes.subloop_get_access_protected_instance_slot( shop_basic_operator, SIX_INTEGER, $sym129$COST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13621L)
  public static SubLObject set_shop_basic_operator_cost(final SubLObject shop_basic_operator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( shop_basic_operator, value, SIX_INTEGER, $sym129$COST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13621L)
  public static SubLObject get_shop_basic_operator_conditional_effects(final SubLObject shop_basic_operator)
  {
    return classes.subloop_get_access_protected_instance_slot( shop_basic_operator, FIVE_INTEGER, $sym130$CONDITIONAL_EFFECTS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13621L)
  public static SubLObject set_shop_basic_operator_conditional_effects(final SubLObject shop_basic_operator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( shop_basic_operator, value, FIVE_INTEGER, $sym130$CONDITIONAL_EFFECTS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13621L)
  public static SubLObject get_shop_basic_operator_deletes(final SubLObject shop_basic_operator)
  {
    return classes.subloop_get_access_protected_instance_slot( shop_basic_operator, FOUR_INTEGER, $sym94$DELETES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13621L)
  public static SubLObject set_shop_basic_operator_deletes(final SubLObject shop_basic_operator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( shop_basic_operator, value, FOUR_INTEGER, $sym94$DELETES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13621L)
  public static SubLObject get_shop_basic_operator_adds(final SubLObject shop_basic_operator)
  {
    return classes.subloop_get_access_protected_instance_slot( shop_basic_operator, THREE_INTEGER, $sym95$ADDS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13621L)
  public static SubLObject set_shop_basic_operator_adds(final SubLObject shop_basic_operator, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( shop_basic_operator, value, THREE_INTEGER, $sym95$ADDS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13621L)
  public static SubLObject subloop_reserved_initialize_shop_basic_operator_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym4$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym0$SHOP_INDEXED_OBJECT, $sym3$INSTANCE_INDEX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13621L)
  public static SubLObject subloop_reserved_initialize_shop_basic_operator_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym44$SHOP_BASIC_PLANNER_RULE, $sym48$HEAD, NIL );
    classes.subloop_initialize_slot( new_instance, $sym44$SHOP_BASIC_PLANNER_RULE, $sym47$ASSERTION_LIST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym126$SHOP_BASIC_OPERATOR, $sym95$ADDS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym126$SHOP_BASIC_OPERATOR, $sym94$DELETES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym126$SHOP_BASIC_OPERATOR, $sym130$CONDITIONAL_EFFECTS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym126$SHOP_BASIC_OPERATOR, $sym129$COST, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13621L)
  public static SubLObject shop_basic_operator_p(final SubLObject shop_basic_operator)
  {
    return classes.subloop_instanceof_class( shop_basic_operator, $sym126$SHOP_BASIC_OPERATOR );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13992L)
  public static SubLObject shop_basic_operator_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_operator_method = NIL;
    final SubLObject head = get_shop_basic_planner_rule_head( self );
    final SubLObject instance_number = object.get_object_instance_number( self );
    try
    {
      thread.throwStack.push( $sym134$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD );
      try
      {
        if( NIL != subloop_structures.instance_p( self ) )
        {
          PrintLow.format( stream, $str135$__OPERATOR__S__S_, instance_number, head );
        }
        else
        {
          PrintLow.format( stream, $str56$__Malformed_Instance_ );
        }
        Dynamic.sublisp_throw( $sym134$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_rule_head( self, head );
          object.set_object_instance_number( self, instance_number );
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
      catch_var_for_shop_basic_operator_method = Errors.handleThrowable( ccatch_env_var, $sym134$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_operator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 14234L)
  public static SubLObject shop_basic_operator_html_display_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_operator_method = NIL;
    final SubLObject cost = get_shop_basic_operator_cost( self );
    final SubLObject deletes = get_shop_basic_operator_deletes( self );
    final SubLObject adds = get_shop_basic_operator_adds( self );
    final SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list( self );
    final SubLObject head = get_shop_basic_planner_rule_head( self );
    try
    {
      thread.throwStack.push( $sym138$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD );
      try
      {
        final SubLObject add_literals = instances.get_slot( self, $sym95$ADDS );
        final SubLObject delete_literals = instances.get_slot( self, $sym94$DELETES );
        final SubLObject cost_$2 = get_shop_basic_operator_cost( self );
        html_utilities.html_princ( $str139$__Head_ );
        cb_utilities.cb_form( head, UNPROVIDED, UNPROVIDED );
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_princ( $str140$__Add_literals__ );
        cb_utilities.cb_form( add_literals, UNPROVIDED, UNPROVIDED );
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_princ( $str141$__Delete_literals__ );
        cb_utilities.cb_form( delete_literals, UNPROVIDED, UNPROVIDED );
        html_utilities.html_newline( UNPROVIDED );
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str142$__Cost___S, cost_$2 );
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_princ( $str107$Assertion__ );
        Mapping.mapcar( $sym143$CB_FORM, instances.get_slot( self, $sym47$ASSERTION_LIST ) );
        html_utilities.html_newline( TWO_INTEGER );
        Dynamic.sublisp_throw( $sym138$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_operator_cost( self, cost );
          set_shop_basic_operator_deletes( self, deletes );
          set_shop_basic_operator_adds( self, adds );
          set_shop_basic_planner_rule_assertion_list( self, assertion_list );
          set_shop_basic_planner_rule_head( self, head );
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
      catch_var_for_shop_basic_operator_method = Errors.handleThrowable( ccatch_env_var, $sym138$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_operator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 14851L)
  public static SubLObject shop_basic_operator_init_method(final SubLObject self, final SubLObject new_assertion, final SubLObject new_head, final SubLObject new_adds, final SubLObject new_deletes)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_operator_method = NIL;
    SubLObject cost = get_shop_basic_operator_cost( self );
    SubLObject deletes = get_shop_basic_operator_deletes( self );
    SubLObject adds = get_shop_basic_operator_adds( self );
    SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list( self );
    SubLObject head = get_shop_basic_planner_rule_head( self );
    try
    {
      thread.throwStack.push( $sym147$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD );
      try
      {
        assertion_list = ConsesLow.list( new_assertion );
        head = new_head;
        adds = new_adds;
        deletes = new_deletes;
        cost = ONE_INTEGER;
        Dynamic.sublisp_throw( $sym147$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_operator_cost( self, cost );
          set_shop_basic_operator_deletes( self, deletes );
          set_shop_basic_operator_adds( self, adds );
          set_shop_basic_planner_rule_assertion_list( self, assertion_list );
          set_shop_basic_planner_rule_head( self, head );
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
      catch_var_for_shop_basic_operator_method = Errors.handleThrowable( ccatch_env_var, $sym147$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_operator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 15356L)
  public static SubLObject shop_basic_operator_get_adds_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_operator_method = NIL;
    final SubLObject adds = get_shop_basic_operator_adds( self );
    try
    {
      thread.throwStack.push( $sym151$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym151$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, adds );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_operator_adds( self, adds );
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
      catch_var_for_shop_basic_operator_method = Errors.handleThrowable( ccatch_env_var, $sym151$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_operator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 15471L)
  public static SubLObject shop_basic_operator_add_literals_to_adds_method(final SubLObject self, final SubLObject lits)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_operator_method = NIL;
    SubLObject adds = get_shop_basic_operator_adds( self );
    try
    {
      thread.throwStack.push( $sym156$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD );
      try
      {
        adds = conses_high.union( adds, lits, Symbols.symbol_function( EQUAL ), UNPROVIDED );
        Dynamic.sublisp_throw( $sym156$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, adds );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_operator_adds( self, adds );
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
      catch_var_for_shop_basic_operator_method = Errors.handleThrowable( ccatch_env_var, $sym156$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_operator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 15680L)
  public static SubLObject shop_basic_operator_get_deletes_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_operator_method = NIL;
    final SubLObject deletes = get_shop_basic_operator_deletes( self );
    try
    {
      thread.throwStack.push( $sym160$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym160$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, deletes );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_operator_deletes( self, deletes );
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
      catch_var_for_shop_basic_operator_method = Errors.handleThrowable( ccatch_env_var, $sym160$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_operator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 15802L)
  public static SubLObject shop_basic_operator_conditional_effects_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_operator_method = NIL;
    final SubLObject conditional_effects = get_shop_basic_operator_conditional_effects( self );
    try
    {
      thread.throwStack.push( $sym163$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym163$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, conditional_effects );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_operator_conditional_effects( self, conditional_effects );
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
      catch_var_for_shop_basic_operator_method = Errors.handleThrowable( ccatch_env_var, $sym163$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_operator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 15906L)
  public static SubLObject shop_basic_operator_add_literals_to_deletes_method(final SubLObject self, final SubLObject lits)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_operator_method = NIL;
    SubLObject deletes = get_shop_basic_operator_deletes( self );
    try
    {
      thread.throwStack.push( $sym167$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD );
      try
      {
        deletes = conses_high.union( deletes, lits, Symbols.symbol_function( EQUAL ), UNPROVIDED );
        Dynamic.sublisp_throw( $sym167$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, deletes );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_operator_deletes( self, deletes );
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
      catch_var_for_shop_basic_operator_method = Errors.handleThrowable( ccatch_env_var, $sym167$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_operator_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 16126L)
  public static SubLObject shop_basic_operator_unit_test_method(final SubLObject self, final SubLObject verboseP)
  {
    final SubLObject test_op = object.object_new_method( $sym126$SHOP_BASIC_OPERATOR );
    final SubLObject add_list_1 = $list173;
    final SubLObject add_list_2 = $list174;
    final SubLObject delete_list_1 = $list175;
    final SubLObject delete_list_2 = $list176;
    methods.funcall_instance_method_with_1_args( test_op, $sym153$ADD_LITERALS_TO_ADDS, add_list_1 );
    methods.funcall_instance_method_with_1_args( test_op, $sym153$ADD_LITERALS_TO_ADDS, add_list_2 );
    methods.funcall_instance_method_with_1_args( test_op, $sym165$ADD_LITERALS_TO_DELETES, delete_list_1 );
    methods.funcall_instance_method_with_1_args( test_op, $sym165$ADD_LITERALS_TO_DELETES, delete_list_2 );
    final SubLObject op_adds = methods.funcall_instance_method_with_0_args( test_op, $sym149$GET_ADDS );
    final SubLObject control_adds = conses_high.union( add_list_1, add_list_2, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject op_deletes = methods.funcall_instance_method_with_0_args( test_op, $sym158$GET_DELETES );
    final SubLObject control_deletes = conses_high.union( delete_list_1, delete_list_2, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    if( NIL != verboseP )
    {
      PrintLow.format( T, $str177$op_adds__s__control_adds__s__, op_adds, control_adds );
      PrintLow.format( T, $str178$op_deletes__s__control_deletes__s, op_deletes, control_deletes );
    }
    if( NIL != conses_high.subsetp( control_adds, op_adds, UNPROVIDED, UNPROVIDED ) && NIL != conses_high.subsetp( op_adds, control_adds, UNPROVIDED, UNPROVIDED ) && NIL != conses_high.subsetp( control_deletes,
        op_deletes, UNPROVIDED, UNPROVIDED ) && NIL != conses_high.subsetp( op_deletes, control_deletes, UNPROVIDED, UNPROVIDED ) )
    {
      print_high.princ( $str179$shop_basic_operator_unit_test____, UNPROVIDED );
      streams_high.terpri( UNPROVIDED );
      return T;
    }
    print_high.princ( $str180$shop_basic_operator_unit_test____, UNPROVIDED );
    streams_high.terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 17527L)
  public static SubLObject get_shop_basic_method_decomposition(final SubLObject shop_basic_method)
  {
    return classes.subloop_get_access_protected_instance_slot( shop_basic_method, FOUR_INTEGER, $sym185$DECOMPOSITION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 17527L)
  public static SubLObject set_shop_basic_method_decomposition(final SubLObject shop_basic_method, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( shop_basic_method, value, FOUR_INTEGER, $sym185$DECOMPOSITION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 17527L)
  public static SubLObject get_shop_basic_method_precondition(final SubLObject shop_basic_method)
  {
    return classes.subloop_get_access_protected_instance_slot( shop_basic_method, THREE_INTEGER, $sym186$PRECONDITION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 17527L)
  public static SubLObject set_shop_basic_method_precondition(final SubLObject shop_basic_method, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( shop_basic_method, value, THREE_INTEGER, $sym186$PRECONDITION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 17527L)
  public static SubLObject subloop_reserved_initialize_shop_basic_method_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym4$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym0$SHOP_INDEXED_OBJECT, $sym3$INSTANCE_INDEX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 17527L)
  public static SubLObject subloop_reserved_initialize_shop_basic_method_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym44$SHOP_BASIC_PLANNER_RULE, $sym48$HEAD, NIL );
    classes.subloop_initialize_slot( new_instance, $sym44$SHOP_BASIC_PLANNER_RULE, $sym47$ASSERTION_LIST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym182$SHOP_BASIC_METHOD, $sym186$PRECONDITION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym182$SHOP_BASIC_METHOD, $sym185$DECOMPOSITION, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 17527L)
  public static SubLObject shop_basic_method_p(final SubLObject shop_basic_method)
  {
    return classes.subloop_instanceof_class( shop_basic_method, $sym182$SHOP_BASIC_METHOD );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 17780L)
  public static SubLObject shop_basic_method_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_method_method = NIL;
    final SubLObject head = get_shop_basic_planner_rule_head( self );
    final SubLObject instance_number = object.get_object_instance_number( self );
    try
    {
      thread.throwStack.push( $sym190$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD );
      try
      {
        if( NIL != subloop_structures.instance_p( self ) )
        {
          PrintLow.format( stream, $str191$__METHOD__S__S_, instance_number, head );
        }
        else
        {
          PrintLow.format( stream, $str56$__Malformed_Instance_ );
        }
        Dynamic.sublisp_throw( $sym190$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_rule_head( self, head );
          object.set_object_instance_number( self, instance_number );
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
      catch_var_for_shop_basic_method_method = Errors.handleThrowable( ccatch_env_var, $sym190$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_method_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 18010L)
  public static SubLObject shop_basic_method_html_display_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_method_method = NIL;
    final SubLObject decomposition = get_shop_basic_method_decomposition( self );
    final SubLObject precondition = get_shop_basic_method_precondition( self );
    final SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list( self );
    try
    {
      thread.throwStack.push( $sym194$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD );
      try
      {
        html_utilities.html_princ( $str195$Precondition__ );
        cb_utilities.cb_form( precondition, UNPROVIDED, UNPROVIDED );
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_princ( $str196$Decomposition__ );
        cb_utilities.cb_form( decomposition, UNPROVIDED, UNPROVIDED );
        html_utilities.html_newline( UNPROVIDED );
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str197$Assertions__ );
        Mapping.mapcar( $sym143$CB_FORM, assertion_list );
        html_utilities.html_newline( TWO_INTEGER );
        Dynamic.sublisp_throw( $sym194$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_method_decomposition( self, decomposition );
          set_shop_basic_method_precondition( self, precondition );
          set_shop_basic_planner_rule_assertion_list( self, assertion_list );
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
      catch_var_for_shop_basic_method_method = Errors.handleThrowable( ccatch_env_var, $sym194$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_method_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 18327L)
  public static SubLObject shop_basic_method_init_method(final SubLObject self, final SubLObject new_assertion, final SubLObject new_head, final SubLObject new_precondition, final SubLObject new_decomposition)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_method_method = NIL;
    SubLObject decomposition = get_shop_basic_method_decomposition( self );
    SubLObject precondition = get_shop_basic_method_precondition( self );
    SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list( self );
    SubLObject head = get_shop_basic_planner_rule_head( self );
    try
    {
      thread.throwStack.push( $sym201$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD );
      try
      {
        assertion_list = ConsesLow.list( new_assertion );
        head = new_head;
        precondition = new_precondition;
        decomposition = new_decomposition;
        Dynamic.sublisp_throw( $sym201$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_method_decomposition( self, decomposition );
          set_shop_basic_method_precondition( self, precondition );
          set_shop_basic_planner_rule_assertion_list( self, assertion_list );
          set_shop_basic_planner_rule_head( self, head );
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
      catch_var_for_shop_basic_method_method = Errors.handleThrowable( ccatch_env_var, $sym201$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_method_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 18861L)
  public static SubLObject shop_basic_method_set_decomposition_method(final SubLObject self, final SubLObject decomp)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_method_method = NIL;
    SubLObject decomposition = get_shop_basic_method_decomposition( self );
    try
    {
      thread.throwStack.push( $sym206$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD );
      try
      {
        decomposition = decomp;
        Dynamic.sublisp_throw( $sym206$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, decomposition );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_method_decomposition( self, decomposition );
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
      catch_var_for_shop_basic_method_method = Errors.handleThrowable( ccatch_env_var, $sym206$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_method_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 19031L)
  public static SubLObject shop_basic_method_get_decomposition_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_method_method = NIL;
    final SubLObject decomposition = get_shop_basic_method_decomposition( self );
    try
    {
      thread.throwStack.push( $sym210$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym210$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, decomposition );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_method_decomposition( self, decomposition );
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
      catch_var_for_shop_basic_method_method = Errors.handleThrowable( ccatch_env_var, $sym210$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_method_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 19164L)
  public static SubLObject shop_basic_method_get_precondition_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_method_method = NIL;
    final SubLObject precondition = get_shop_basic_method_precondition( self );
    try
    {
      thread.throwStack.push( $sym214$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym214$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, precondition );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_method_precondition( self, precondition );
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
      catch_var_for_shop_basic_method_method = Errors.handleThrowable( ccatch_env_var, $sym214$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_method_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 19295L)
  public static SubLObject shop_basic_method_unify_task_to_head_with_data_method(final SubLObject self, final SubLObject task)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_method_method = NIL;
    final SubLObject decomposition = get_shop_basic_method_decomposition( self );
    final SubLObject precondition = get_shop_basic_method_precondition( self );
    try
    {
      thread.throwStack.push( $sym218$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD );
      try
      {
        final SubLObject task_unifier = shop_basic_planner_rule_unify_task_to_head_method( self, task );
        if( NIL != task_unifier )
        {
          Dynamic.sublisp_throw( $sym218$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, ConsesLow.list( task_unifier, shop_apply_substitution( precondition, task_unifier ), shop_apply_substitution( decomposition,
              task_unifier ) ) );
        }
        Dynamic.sublisp_throw( $sym218$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_method_decomposition( self, decomposition );
          set_shop_basic_method_precondition( self, precondition );
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
      catch_var_for_shop_basic_method_method = Errors.handleThrowable( ccatch_env_var, $sym218$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_method_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 19713L)
  public static SubLObject shop_basic_method_add_literals_to_precondition_method(final SubLObject self, final SubLObject lits)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_method_method = NIL;
    SubLObject precondition = get_shop_basic_method_precondition( self );
    try
    {
      thread.throwStack.push( $sym222$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD );
      try
      {
        precondition = conses_high.union( precondition, lits, UNPROVIDED, UNPROVIDED );
        Dynamic.sublisp_throw( $sym222$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, precondition );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_method_precondition( self, precondition );
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
      catch_var_for_shop_basic_method_method = Errors.handleThrowable( ccatch_env_var, $sym222$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_method_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 19944L)
  public static SubLObject get_shop_basic_sufficiency_cond_condition_formula(final SubLObject shop_basic_sufficiency_cond)
  {
    return classes.subloop_get_instance_slot( shop_basic_sufficiency_cond, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 19944L)
  public static SubLObject set_shop_basic_sufficiency_cond_condition_formula(final SubLObject shop_basic_sufficiency_cond, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( shop_basic_sufficiency_cond, value, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 19944L)
  public static SubLObject subloop_reserved_initialize_shop_basic_sufficiency_cond_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym4$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym0$SHOP_INDEXED_OBJECT, $sym3$INSTANCE_INDEX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 19944L)
  public static SubLObject subloop_reserved_initialize_shop_basic_sufficiency_cond_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym44$SHOP_BASIC_PLANNER_RULE, $sym48$HEAD, NIL );
    classes.subloop_initialize_slot( new_instance, $sym44$SHOP_BASIC_PLANNER_RULE, $sym47$ASSERTION_LIST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym224$SHOP_BASIC_SUFFICIENCY_COND, $sym228$CONDITION_FORMULA, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 19944L)
  public static SubLObject shop_basic_sufficiency_cond_p(final SubLObject shop_basic_sufficiency_cond)
  {
    return classes.subloop_instanceof_class( shop_basic_sufficiency_cond, $sym224$SHOP_BASIC_SUFFICIENCY_COND );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 20237L)
  public static SubLObject shop_basic_sufficiency_cond_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_sufficiency_cond_method = NIL;
    final SubLObject instance_number = object.get_object_instance_number( self );
    try
    {
      thread.throwStack.push( $sym231$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD );
      try
      {
        if( NIL != subloop_structures.instance_p( self ) )
        {
          PrintLow.format( stream, $str232$__Shop_Scond__S__S_, instance_number, methods.funcall_instance_method_with_0_args( self, $sym61$PRED ) );
        }
        else
        {
          PrintLow.format( stream, $str56$__Malformed_Instance_ );
        }
        Dynamic.sublisp_throw( $sym231$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          object.set_object_instance_number( self, instance_number );
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
      catch_var_for_shop_basic_sufficiency_cond_method = Errors.handleThrowable( ccatch_env_var, $sym231$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_sufficiency_cond_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 20495L)
  public static SubLObject shop_basic_sufficiency_cond_html_display_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_sufficiency_cond_method = NIL;
    final SubLObject condition_formula = get_shop_basic_sufficiency_cond_condition_formula( self );
    final SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list( self );
    try
    {
      thread.throwStack.push( $sym235$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD );
      try
      {
        html_utilities.html_princ( $str104$Condition__ );
        cb_utilities.cb_form( condition_formula, UNPROVIDED, UNPROVIDED );
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_princ( $str197$Assertions__ );
        Mapping.mapcar( $sym143$CB_FORM, assertion_list );
        html_utilities.html_newline( TWO_INTEGER );
        Dynamic.sublisp_throw( $sym235$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_sufficiency_cond_condition_formula( self, condition_formula );
          set_shop_basic_planner_rule_assertion_list( self, assertion_list );
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
      catch_var_for_shop_basic_sufficiency_cond_method = Errors.handleThrowable( ccatch_env_var, $sym235$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_sufficiency_cond_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 20737L)
  public static SubLObject shop_basic_sufficiency_cond_cond_formula_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_sufficiency_cond_method = NIL;
    final SubLObject condition_formula = get_shop_basic_sufficiency_cond_condition_formula( self );
    try
    {
      thread.throwStack.push( $sym239$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym239$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD, condition_formula );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_sufficiency_cond_condition_formula( self, condition_formula );
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
      catch_var_for_shop_basic_sufficiency_cond_method = Errors.handleThrowable( ccatch_env_var, $sym239$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_sufficiency_cond_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 20841L)
  public static SubLObject shop_basic_sufficiency_cond_set_cond_formula_method(final SubLObject self, final SubLObject form)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_sufficiency_cond_method = NIL;
    SubLObject condition_formula = get_shop_basic_sufficiency_cond_condition_formula( self );
    try
    {
      thread.throwStack.push( $sym243$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD );
      try
      {
        condition_formula = form;
        Dynamic.sublisp_throw( $sym243$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD, condition_formula );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_sufficiency_cond_condition_formula( self, condition_formula );
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
      catch_var_for_shop_basic_sufficiency_cond_method = Errors.handleThrowable( ccatch_env_var, $sym243$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_sufficiency_cond_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 20986L)
  public static SubLObject shop_basic_sufficiency_cond_unify_task_to_head_with_data_method(final SubLObject self, final SubLObject task)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_sufficiency_cond_method = NIL;
    final SubLObject condition_formula = get_shop_basic_sufficiency_cond_condition_formula( self );
    try
    {
      thread.throwStack.push( $sym246$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD );
      try
      {
        final SubLObject task_unifier = shop_basic_planner_rule_unify_task_to_head_method( self, task );
        if( NIL != task_unifier )
        {
          Dynamic.sublisp_throw( $sym246$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD, ConsesLow.list( task_unifier, shop_apply_substitution( condition_formula, task_unifier ) ) );
        }
        Dynamic.sublisp_throw( $sym246$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_sufficiency_cond_condition_formula( self, condition_formula );
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
      catch_var_for_shop_basic_sufficiency_cond_method = Errors.handleThrowable( ccatch_env_var, $sym246$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_sufficiency_cond_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21361L)
  public static SubLObject shop_precondition_p(final SubLObject shop_precondition)
  {
    return interfaces.subloop_instanceof_interface( shop_precondition, $sym248$SHOP_PRECONDITION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21463L)
  public static SubLObject subloop_reserved_initialize_shop_basic_precondition_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym4$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym0$SHOP_INDEXED_OBJECT, $sym3$INSTANCE_INDEX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21463L)
  public static SubLObject subloop_reserved_initialize_shop_basic_precondition_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym44$SHOP_BASIC_PLANNER_RULE, $sym48$HEAD, NIL );
    classes.subloop_initialize_slot( new_instance, $sym44$SHOP_BASIC_PLANNER_RULE, $sym47$ASSERTION_LIST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym182$SHOP_BASIC_METHOD, $sym186$PRECONDITION, NIL );
    classes.subloop_initialize_slot( new_instance, $sym182$SHOP_BASIC_METHOD, $sym185$DECOMPOSITION, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21463L)
  public static SubLObject shop_basic_precondition_p(final SubLObject shop_basic_precondition)
  {
    return classes.subloop_instanceof_class( shop_basic_precondition, $sym249$SHOP_BASIC_PRECONDITION );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21579L)
  public static SubLObject shop_basic_precondition_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_precondition_method = NIL;
    final SubLObject head = get_shop_basic_planner_rule_head( self );
    final SubLObject instance_number = object.get_object_instance_number( self );
    try
    {
      thread.throwStack.push( $sym254$OUTER_CATCH_FOR_SHOP_BASIC_PRECONDITION_METHOD );
      try
      {
        if( NIL != subloop_structures.instance_p( self ) )
        {
          PrintLow.format( stream, $str255$__SHOP_PRECOND__S__S_, instance_number, head );
        }
        else
        {
          PrintLow.format( stream, $str56$__Malformed_Instance_ );
        }
        Dynamic.sublisp_throw( $sym254$OUTER_CATCH_FOR_SHOP_BASIC_PRECONDITION_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_planner_rule_head( self, head );
          object.set_object_instance_number( self, instance_number );
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
      catch_var_for_shop_basic_precondition_method = Errors.handleThrowable( ccatch_env_var, $sym254$OUTER_CATCH_FOR_SHOP_BASIC_PRECONDITION_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_precondition_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
  public static SubLObject get_shop_basic_problem_state(final SubLObject shop_basic_problem)
  {
    return classes.subloop_get_access_protected_instance_slot( shop_basic_problem, FIVE_INTEGER, $sym260$STATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
  public static SubLObject set_shop_basic_problem_state(final SubLObject shop_basic_problem, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( shop_basic_problem, value, FIVE_INTEGER, $sym260$STATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
  public static SubLObject get_shop_basic_problem_tasks(final SubLObject shop_basic_problem)
  {
    return classes.subloop_get_access_protected_instance_slot( shop_basic_problem, FOUR_INTEGER, $sym261$TASKS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
  public static SubLObject set_shop_basic_problem_tasks(final SubLObject shop_basic_problem, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( shop_basic_problem, value, FOUR_INTEGER, $sym261$TASKS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
  public static SubLObject get_shop_basic_problem_task_mt(final SubLObject shop_basic_problem)
  {
    return classes.subloop_get_instance_slot( shop_basic_problem, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
  public static SubLObject set_shop_basic_problem_task_mt(final SubLObject shop_basic_problem, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( shop_basic_problem, value, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
  public static SubLObject get_shop_basic_problem_domain(final SubLObject shop_basic_problem)
  {
    return classes.subloop_get_instance_slot( shop_basic_problem, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
  public static SubLObject set_shop_basic_problem_domain(final SubLObject shop_basic_problem, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( shop_basic_problem, value, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
  public static SubLObject get_shop_basic_problem_name(final SubLObject shop_basic_problem)
  {
    return classes.subloop_get_instance_slot( shop_basic_problem, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
  public static SubLObject set_shop_basic_problem_name(final SubLObject shop_basic_problem, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( shop_basic_problem, value, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
  public static SubLObject subloop_reserved_initialize_shop_basic_problem_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym4$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
  public static SubLObject subloop_reserved_initialize_shop_basic_problem_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym257$SHOP_BASIC_PROBLEM, $sym263$NAME, NIL );
    classes.subloop_initialize_slot( new_instance, $sym257$SHOP_BASIC_PROBLEM, $sym264$DOMAIN, NIL );
    classes.subloop_initialize_slot( new_instance, $sym257$SHOP_BASIC_PROBLEM, $sym265$TASK_MT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym257$SHOP_BASIC_PROBLEM, $sym261$TASKS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym257$SHOP_BASIC_PROBLEM, $sym260$STATE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
  public static SubLObject shop_basic_problem_p(final SubLObject shop_basic_problem)
  {
    return classes.subloop_instanceof_class( shop_basic_problem, $sym257$SHOP_BASIC_PROBLEM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 22412L)
  public static SubLObject shop_basic_problem_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_problem_method = NIL;
    SubLObject state = get_shop_basic_problem_state( self );
    SubLObject tasks = get_shop_basic_problem_tasks( self );
    SubLObject task_mt = get_shop_basic_problem_task_mt( self );
    SubLObject domain = get_shop_basic_problem_domain( self );
    SubLObject name = get_shop_basic_problem_name( self );
    try
    {
      thread.throwStack.push( $sym268$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
      try
      {
        object.object_initialize_method( self );
        name = NIL;
        domain = NIL;
        task_mt = NIL;
        tasks = NIL;
        state = NIL;
        Dynamic.sublisp_throw( $sym268$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_problem_state( self, state );
          set_shop_basic_problem_tasks( self, tasks );
          set_shop_basic_problem_task_mt( self, task_mt );
          set_shop_basic_problem_domain( self, domain );
          set_shop_basic_problem_name( self, name );
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
      catch_var_for_shop_basic_problem_method = Errors.handleThrowable( ccatch_env_var, $sym268$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_problem_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 22633L)
  public static SubLObject shop_basic_problem_initialize_problem_method(final SubLObject self, final SubLObject new_name, final SubLObject new_domain, final SubLObject new_state, final SubLObject new_tasks,
      final SubLObject new_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_problem_method = NIL;
    SubLObject state = get_shop_basic_problem_state( self );
    SubLObject tasks = get_shop_basic_problem_tasks( self );
    SubLObject task_mt = get_shop_basic_problem_task_mt( self );
    SubLObject domain = get_shop_basic_problem_domain( self );
    SubLObject name = get_shop_basic_problem_name( self );
    try
    {
      thread.throwStack.push( $sym273$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
      try
      {
        domain = new_domain;
        name = new_name;
        state = new_state;
        tasks = new_tasks;
        task_mt = new_mt;
        Dynamic.sublisp_throw( $sym273$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_problem_state( self, state );
          set_shop_basic_problem_tasks( self, tasks );
          set_shop_basic_problem_task_mt( self, task_mt );
          set_shop_basic_problem_domain( self, domain );
          set_shop_basic_problem_name( self, name );
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
      catch_var_for_shop_basic_problem_method = Errors.handleThrowable( ccatch_env_var, $sym273$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_problem_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 23090L)
  public static SubLObject shop_basic_problem_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_problem_method = NIL;
    final SubLObject name = get_shop_basic_problem_name( self );
    final SubLObject instance_number = object.get_object_instance_number( self );
    try
    {
      thread.throwStack.push( $sym276$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
      try
      {
        if( NIL != subloop_structures.instance_p( self ) )
        {
          PrintLow.format( stream, $str277$__PROBLEM__S__S_, instance_number, name );
        }
        else
        {
          PrintLow.format( stream, $str56$__Malformed_Instance_ );
        }
        Dynamic.sublisp_throw( $sym276$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_problem_name( self, name );
          object.set_object_instance_number( self, instance_number );
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
      catch_var_for_shop_basic_problem_method = Errors.handleThrowable( ccatch_env_var, $sym276$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_problem_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 23322L)
  public static SubLObject shop_basic_problem_set_name_method(final SubLObject self, final SubLObject n)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_problem_method = NIL;
    SubLObject name = get_shop_basic_problem_name( self );
    try
    {
      thread.throwStack.push( $sym282$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
      try
      {
        name = n;
        Dynamic.sublisp_throw( $sym282$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, n );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_problem_name( self, name );
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
      catch_var_for_shop_basic_problem_method = Errors.handleThrowable( ccatch_env_var, $sym282$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_problem_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 23425L)
  public static SubLObject shop_basic_problem_get_name_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_problem_method = NIL;
    final SubLObject name = get_shop_basic_problem_name( self );
    try
    {
      thread.throwStack.push( $sym286$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym286$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, name );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_problem_name( self, name );
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
      catch_var_for_shop_basic_problem_method = Errors.handleThrowable( ccatch_env_var, $sym286$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_problem_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 23502L)
  public static SubLObject shop_basic_problem_set_domain_method(final SubLObject self, final SubLObject d)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_problem_method = NIL;
    SubLObject domain = get_shop_basic_problem_domain( self );
    try
    {
      thread.throwStack.push( $sym291$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
      try
      {
        domain = d;
        Dynamic.sublisp_throw( $sym291$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, d );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_problem_domain( self, domain );
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
      catch_var_for_shop_basic_problem_method = Errors.handleThrowable( ccatch_env_var, $sym291$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_problem_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 23610L)
  public static SubLObject shop_basic_problem_get_domain_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_problem_method = NIL;
    final SubLObject domain = get_shop_basic_problem_domain( self );
    try
    {
      thread.throwStack.push( $sym295$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym295$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, domain );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_problem_domain( self, domain );
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
      catch_var_for_shop_basic_problem_method = Errors.handleThrowable( ccatch_env_var, $sym295$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_problem_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 23691L)
  public static SubLObject shop_basic_problem_get_methods_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_problem_method = NIL;
    final SubLObject domain = get_shop_basic_problem_domain( self );
    try
    {
      thread.throwStack.push( $sym299$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
      try
      {
        final SubLObject domain_$3 = shop_basic_problem_get_domain_method( self );
        Dynamic.sublisp_throw( $sym299$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, instances.get_slot( domain_$3, $sym300$METHODS ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_problem_domain( self, domain );
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
      catch_var_for_shop_basic_problem_method = Errors.handleThrowable( ccatch_env_var, $sym299$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_problem_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 23969L)
  public static SubLObject shop_basic_problem_get_operators_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_problem_method = NIL;
    final SubLObject domain = get_shop_basic_problem_domain( self );
    try
    {
      thread.throwStack.push( $sym304$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
      try
      {
        final SubLObject domain_$4 = shop_basic_problem_get_domain_method( self );
        Dynamic.sublisp_throw( $sym304$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, instances.get_slot( domain_$4, $sym305$OPERATORS ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_problem_domain( self, domain );
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
      catch_var_for_shop_basic_problem_method = Errors.handleThrowable( ccatch_env_var, $sym304$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_problem_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 24131L)
  public static SubLObject shop_basic_problem_get_tasks_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_problem_method = NIL;
    final SubLObject tasks = get_shop_basic_problem_tasks( self );
    try
    {
      thread.throwStack.push( $sym309$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym309$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, tasks );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_problem_tasks( self, tasks );
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
      catch_var_for_shop_basic_problem_method = Errors.handleThrowable( ccatch_env_var, $sym309$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_problem_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 24221L)
  public static SubLObject shop_basic_problem_set_tasks_method(final SubLObject self, final SubLObject ts)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_problem_method = NIL;
    SubLObject tasks = get_shop_basic_problem_tasks( self );
    try
    {
      thread.throwStack.push( $sym314$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
      try
      {
        tasks = ts;
        Dynamic.sublisp_throw( $sym314$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, ts );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_problem_tasks( self, tasks );
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
      catch_var_for_shop_basic_problem_method = Errors.handleThrowable( ccatch_env_var, $sym314$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_problem_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 24319L)
  public static SubLObject shop_basic_problem_get_state_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_problem_method = NIL;
    final SubLObject state = get_shop_basic_problem_state( self );
    try
    {
      thread.throwStack.push( $sym318$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym318$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, state );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_problem_state( self, state );
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
      catch_var_for_shop_basic_problem_method = Errors.handleThrowable( ccatch_env_var, $sym318$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_problem_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 24409L)
  public static SubLObject shop_basic_problem_set_state_method(final SubLObject self, final SubLObject s)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_problem_method = NIL;
    final SubLObject state = get_shop_basic_problem_state( self );
    try
    {
      thread.throwStack.push( $sym323$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym323$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, instances.set_slot( self, $sym260$STATE, s ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_problem_state( self, state );
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
      catch_var_for_shop_basic_problem_method = Errors.handleThrowable( ccatch_env_var, $sym323$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_problem_method;
  }

  public static SubLObject declare_shop_datastructures_file()
  {
    SubLFiles.declareFunction( me, "get_shop_indexed_object_instance_index", "GET-SHOP-INDEXED-OBJECT-INSTANCE-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_indexed_object_instance_index", "SET-SHOP-INDEXED-OBJECT-INSTANCE-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_indexed_object_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-INDEXED-OBJECT-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_indexed_object_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-INDEXED-OBJECT-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_indexed_object_p", "SHOP-INDEXED-OBJECT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_indexed_object_find_instance_method", "SHOP-INDEXED-OBJECT-FIND-INSTANCE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_indexed_object_add_to_index_method", "SHOP-INDEXED-OBJECT-ADD-TO-INDEX-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_indexed_object_initialize_method", "SHOP-INDEXED-OBJECT-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_problem_p", "SHOP-PROBLEM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_planner_rule_p", "SHOP-PLANNER-RULE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_operator_p", "SHOP-OPERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_sufficiency_condition_p", "SHOP-SUFFICIENCY-CONDITION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_method_p", "SHOP-METHOD-P", 1, 0, false );
    SubLFiles.declareMacro( me, "shop_my_union", "SHOP-MY-UNION" );
    SubLFiles.declareFunction( me, "shop_my_union_func", "SHOP-MY-UNION-FUNC", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_same_set_p", "SHOP-SAME-SET-P", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_variablep", "SHOP-VARIABLEP", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_extract_variables", "SHOP-EXTRACT-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_empty_bindingP", "SHOP-EMPTY-BINDING?", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_unify_failedP", "SHOP-UNIFY-FAILED?", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_apply_substitution", "SHOP-APPLY-SUBSTITUTION", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_compose_substitutions_test", "SHOP-COMPOSE-SUBSTITUTIONS-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_compose_substitutions", "SHOP-COMPOSE-SUBSTITUTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_unify", "SHOP-UNIFY", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_occurs", "SHOP-OCCURS", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_standardizer_gensym", "SHOP-STANDARDIZER-GENSYM", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_standardizer", "SHOP-STANDARDIZER", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_spec_formulaP", "SHOP-SPEC-FORMULA?", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_planner_rule_assertion_list", "GET-SHOP-BASIC-PLANNER-RULE-ASSERTION-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_planner_rule_assertion_list", "SET-SHOP-BASIC-PLANNER-RULE-ASSERTION-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_planner_rule_head", "GET-SHOP-BASIC-PLANNER-RULE-HEAD", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_planner_rule_head", "SET-SHOP-BASIC-PLANNER-RULE-HEAD", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_planner_rule_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-RULE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_planner_rule_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-RULE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_rule_p", "SHOP-BASIC-PLANNER-RULE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_rule_print_method", "SHOP-BASIC-PLANNER-RULE-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_rule_html_display_method", "SHOP-BASIC-PLANNER-RULE-HTML-DISPLAY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_rule_pred_method", "SHOP-BASIC-PLANNER-RULE-PRED-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_rule_head_method", "SHOP-BASIC-PLANNER-RULE-HEAD-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_rule_set_head_method", "SHOP-BASIC-PLANNER-RULE-SET-HEAD-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_rule_assertions_method", "SHOP-BASIC-PLANNER-RULE-ASSERTIONS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_rule_set_assertions_method", "SHOP-BASIC-PLANNER-RULE-SET-ASSERTIONS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_planner_rule_unify_task_to_head_method", "SHOP-BASIC-PLANNER-RULE-UNIFY-TASK-TO-HEAD-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_conditional_effect_p", "SHOP-CONDITIONAL-EFFECT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_conditional_effect_condition", "GET-SHOP-BASIC-CONDITIONAL-EFFECT-CONDITION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_conditional_effect_condition", "SET-SHOP-BASIC-CONDITIONAL-EFFECT-CONDITION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_conditional_effect_deletes", "GET-SHOP-BASIC-CONDITIONAL-EFFECT-DELETES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_conditional_effect_deletes", "SET-SHOP-BASIC-CONDITIONAL-EFFECT-DELETES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_conditional_effect_adds", "GET-SHOP-BASIC-CONDITIONAL-EFFECT-ADDS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_conditional_effect_adds", "SET-SHOP-BASIC-CONDITIONAL-EFFECT-ADDS", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_conditional_effect_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-CONDITIONAL-EFFECT-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_conditional_effect_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-CONDITIONAL-EFFECT-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_conditional_effect_p", "SHOP-BASIC-CONDITIONAL-EFFECT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_conditional_effect_print_method", "SHOP-BASIC-CONDITIONAL-EFFECT-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_conditional_effect_html_display_method", "SHOP-BASIC-CONDITIONAL-EFFECT-HTML-DISPLAY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_conditional_effect_init_method", "SHOP-BASIC-CONDITIONAL-EFFECT-INIT-METHOD", 6, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_conditional_effect_adds_method", "SHOP-BASIC-CONDITIONAL-EFFECT-ADDS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_conditional_effect_deletes_method", "SHOP-BASIC-CONDITIONAL-EFFECT-DELETES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_conditional_effect_condition_method", "SHOP-BASIC-CONDITIONAL-EFFECT-CONDITION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_conditional_effect_assertion_method", "SHOP-BASIC-CONDITIONAL-EFFECT-ASSERTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_operator_cost", "GET-SHOP-BASIC-OPERATOR-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_operator_cost", "SET-SHOP-BASIC-OPERATOR-COST", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_operator_conditional_effects", "GET-SHOP-BASIC-OPERATOR-CONDITIONAL-EFFECTS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_operator_conditional_effects", "SET-SHOP-BASIC-OPERATOR-CONDITIONAL-EFFECTS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_operator_deletes", "GET-SHOP-BASIC-OPERATOR-DELETES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_operator_deletes", "SET-SHOP-BASIC-OPERATOR-DELETES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_operator_adds", "GET-SHOP-BASIC-OPERATOR-ADDS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_operator_adds", "SET-SHOP-BASIC-OPERATOR-ADDS", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_operator_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-OPERATOR-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_operator_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-OPERATOR-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_operator_p", "SHOP-BASIC-OPERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_operator_print_method", "SHOP-BASIC-OPERATOR-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_operator_html_display_method", "SHOP-BASIC-OPERATOR-HTML-DISPLAY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_operator_init_method", "SHOP-BASIC-OPERATOR-INIT-METHOD", 5, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_operator_get_adds_method", "SHOP-BASIC-OPERATOR-GET-ADDS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_operator_add_literals_to_adds_method", "SHOP-BASIC-OPERATOR-ADD-LITERALS-TO-ADDS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_operator_get_deletes_method", "SHOP-BASIC-OPERATOR-GET-DELETES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_operator_conditional_effects_method", "SHOP-BASIC-OPERATOR-CONDITIONAL-EFFECTS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_operator_add_literals_to_deletes_method", "SHOP-BASIC-OPERATOR-ADD-LITERALS-TO-DELETES-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_operator_unit_test_method", "SHOP-BASIC-OPERATOR-UNIT-TEST-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_method_decomposition", "GET-SHOP-BASIC-METHOD-DECOMPOSITION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_method_decomposition", "SET-SHOP-BASIC-METHOD-DECOMPOSITION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_method_precondition", "GET-SHOP-BASIC-METHOD-PRECONDITION", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_method_precondition", "SET-SHOP-BASIC-METHOD-PRECONDITION", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_method_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-METHOD-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_method_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-METHOD-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_method_p", "SHOP-BASIC-METHOD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_method_print_method", "SHOP-BASIC-METHOD-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_method_html_display_method", "SHOP-BASIC-METHOD-HTML-DISPLAY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_method_init_method", "SHOP-BASIC-METHOD-INIT-METHOD", 5, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_method_set_decomposition_method", "SHOP-BASIC-METHOD-SET-DECOMPOSITION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_method_get_decomposition_method", "SHOP-BASIC-METHOD-GET-DECOMPOSITION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_method_get_precondition_method", "SHOP-BASIC-METHOD-GET-PRECONDITION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_method_unify_task_to_head_with_data_method", "SHOP-BASIC-METHOD-UNIFY-TASK-TO-HEAD-WITH-DATA-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_method_add_literals_to_precondition_method", "SHOP-BASIC-METHOD-ADD-LITERALS-TO-PRECONDITION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_sufficiency_cond_condition_formula", "GET-SHOP-BASIC-SUFFICIENCY-COND-CONDITION-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_sufficiency_cond_condition_formula", "SET-SHOP-BASIC-SUFFICIENCY-COND-CONDITION-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_sufficiency_cond_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-SUFFICIENCY-COND-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_sufficiency_cond_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-SUFFICIENCY-COND-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_sufficiency_cond_p", "SHOP-BASIC-SUFFICIENCY-COND-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_sufficiency_cond_print_method", "SHOP-BASIC-SUFFICIENCY-COND-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_sufficiency_cond_html_display_method", "SHOP-BASIC-SUFFICIENCY-COND-HTML-DISPLAY-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_sufficiency_cond_cond_formula_method", "SHOP-BASIC-SUFFICIENCY-COND-COND-FORMULA-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_sufficiency_cond_set_cond_formula_method", "SHOP-BASIC-SUFFICIENCY-COND-SET-COND-FORMULA-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_sufficiency_cond_unify_task_to_head_with_data_method", "SHOP-BASIC-SUFFICIENCY-COND-UNIFY-TASK-TO-HEAD-WITH-DATA-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_precondition_p", "SHOP-PRECONDITION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_precondition_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PRECONDITION-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_precondition_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PRECONDITION-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_precondition_p", "SHOP-BASIC-PRECONDITION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_precondition_print_method", "SHOP-BASIC-PRECONDITION-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_problem_state", "GET-SHOP-BASIC-PROBLEM-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_problem_state", "SET-SHOP-BASIC-PROBLEM-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_problem_tasks", "GET-SHOP-BASIC-PROBLEM-TASKS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_problem_tasks", "SET-SHOP-BASIC-PROBLEM-TASKS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_problem_task_mt", "GET-SHOP-BASIC-PROBLEM-TASK-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_problem_task_mt", "SET-SHOP-BASIC-PROBLEM-TASK-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_problem_domain", "GET-SHOP-BASIC-PROBLEM-DOMAIN", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_problem_domain", "SET-SHOP-BASIC-PROBLEM-DOMAIN", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_problem_name", "GET-SHOP-BASIC-PROBLEM-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_problem_name", "SET-SHOP-BASIC-PROBLEM-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_problem_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PROBLEM-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_problem_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PROBLEM-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_problem_p", "SHOP-BASIC-PROBLEM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_problem_initialize_method", "SHOP-BASIC-PROBLEM-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_problem_initialize_problem_method", "SHOP-BASIC-PROBLEM-INITIALIZE-PROBLEM-METHOD", 6, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_problem_print_method", "SHOP-BASIC-PROBLEM-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_problem_set_name_method", "SHOP-BASIC-PROBLEM-SET-NAME-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_problem_get_name_method", "SHOP-BASIC-PROBLEM-GET-NAME-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_problem_set_domain_method", "SHOP-BASIC-PROBLEM-SET-DOMAIN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_problem_get_domain_method", "SHOP-BASIC-PROBLEM-GET-DOMAIN-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_problem_get_methods_method", "SHOP-BASIC-PROBLEM-GET-METHODS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_problem_get_operators_method", "SHOP-BASIC-PROBLEM-GET-OPERATORS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_problem_get_tasks_method", "SHOP-BASIC-PROBLEM-GET-TASKS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_problem_set_tasks_method", "SHOP-BASIC-PROBLEM-SET-TASKS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_problem_get_state_method", "SHOP-BASIC-PROBLEM-GET-STATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_problem_set_state_method", "SHOP-BASIC-PROBLEM-SET-STATE-METHOD", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_shop_datastructures_file()
  {
    $shop_unify_failed$ = SubLFiles.deflexical( "*SHOP-UNIFY-FAILED*", $kw40$FAIL );
    $shop_empty_unifier$ = SubLFiles.deflexical( "*SHOP-EMPTY-UNIFIER*", NIL );
    return NIL;
  }

  public static SubLObject setup_shop_datastructures_file()
  {
    classes.subloop_new_class( $sym0$SHOP_INDEXED_OBJECT, $sym1$OBJECT, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$SHOP_INDEXED_OBJECT, NIL );
    classes.subloop_note_class_initialization_function( $sym0$SHOP_INDEXED_OBJECT, $sym5$SUBLOOP_RESERVED_INITIALIZE_SHOP_INDEXED_OBJECT_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$SHOP_INDEXED_OBJECT, $sym8$SUBLOOP_RESERVED_INITIALIZE_SHOP_INDEXED_OBJECT_INSTANCE );
    subloop_reserved_initialize_shop_indexed_object_class( $sym0$SHOP_INDEXED_OBJECT );
    methods.methods_incorporate_instance_method( $sym9$FIND_INSTANCE, $sym0$SHOP_INDEXED_OBJECT, $list10, $list11, $list12 );
    methods.subloop_register_instance_method( $sym0$SHOP_INDEXED_OBJECT, $sym9$FIND_INSTANCE, $sym14$SHOP_INDEXED_OBJECT_FIND_INSTANCE_METHOD );
    methods.methods_incorporate_instance_method( $sym15$ADD_TO_INDEX, $sym0$SHOP_INDEXED_OBJECT, $list16, NIL, $list17 );
    methods.subloop_register_instance_method( $sym0$SHOP_INDEXED_OBJECT, $sym15$ADD_TO_INDEX, $sym18$SHOP_INDEXED_OBJECT_ADD_TO_INDEX_METHOD );
    methods.methods_incorporate_instance_method( $sym19$INITIALIZE, $sym0$SHOP_INDEXED_OBJECT, $list20, NIL, $list21 );
    methods.subloop_register_instance_method( $sym0$SHOP_INDEXED_OBJECT, $sym19$INITIALIZE, $sym22$SHOP_INDEXED_OBJECT_INITIALIZE_METHOD );
    interfaces.new_interface( $sym23$SHOP_PROBLEM, NIL, NIL, $list24 );
    interfaces.new_interface( $sym25$SHOP_PLANNER_RULE, NIL, NIL, $list26 );
    interfaces.new_interface( $sym27$SHOP_OPERATOR, $sym25$SHOP_PLANNER_RULE, $list28, $list29 );
    interfaces.new_interface( $sym30$SHOP_SUFFICIENCY_CONDITION, $sym25$SHOP_PLANNER_RULE, $list28, $list31 );
    interfaces.new_interface( $sym32$SHOP_METHOD, $sym25$SHOP_PLANNER_RULE, $list28, $list33 );
    classes.subloop_new_class( $sym44$SHOP_BASIC_PLANNER_RULE, $sym0$SHOP_INDEXED_OBJECT, $list45, NIL, $list46 );
    classes.class_set_implements_slot_listeners( $sym44$SHOP_BASIC_PLANNER_RULE, NIL );
    classes.subloop_note_class_initialization_function( $sym44$SHOP_BASIC_PLANNER_RULE, $sym49$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_RULE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym44$SHOP_BASIC_PLANNER_RULE, $sym50$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_RULE_INSTANCE );
    subloop_reserved_initialize_shop_basic_planner_rule_class( $sym44$SHOP_BASIC_PLANNER_RULE );
    methods.methods_incorporate_instance_method( $sym51$PRINT, $sym44$SHOP_BASIC_PLANNER_RULE, $list10, $list52, $list53 );
    methods.subloop_register_instance_method( $sym44$SHOP_BASIC_PLANNER_RULE, $sym51$PRINT, $sym57$SHOP_BASIC_PLANNER_RULE_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym58$HTML_DISPLAY, $sym44$SHOP_BASIC_PLANNER_RULE, $list10, NIL, $list59 );
    methods.subloop_register_instance_method( $sym44$SHOP_BASIC_PLANNER_RULE, $sym58$HTML_DISPLAY, $sym60$SHOP_BASIC_PLANNER_RULE_HTML_DISPLAY_METHOD );
    methods.methods_incorporate_instance_method( $sym61$PRED, $sym44$SHOP_BASIC_PLANNER_RULE, $list10, NIL, $list62 );
    methods.subloop_register_instance_method( $sym44$SHOP_BASIC_PLANNER_RULE, $sym61$PRED, $sym64$SHOP_BASIC_PLANNER_RULE_PRED_METHOD );
    methods.methods_incorporate_instance_method( $sym48$HEAD, $sym44$SHOP_BASIC_PLANNER_RULE, $list10, NIL, $list65 );
    methods.subloop_register_instance_method( $sym44$SHOP_BASIC_PLANNER_RULE, $sym48$HEAD, $sym67$SHOP_BASIC_PLANNER_RULE_HEAD_METHOD );
    methods.methods_incorporate_instance_method( $sym68$SET_HEAD, $sym44$SHOP_BASIC_PLANNER_RULE, $list10, $list69, $list70 );
    methods.subloop_register_instance_method( $sym44$SHOP_BASIC_PLANNER_RULE, $sym68$SET_HEAD, $sym72$SHOP_BASIC_PLANNER_RULE_SET_HEAD_METHOD );
    methods.methods_incorporate_instance_method( $sym73$ASSERTIONS, $sym44$SHOP_BASIC_PLANNER_RULE, $list10, NIL, $list74 );
    methods.subloop_register_instance_method( $sym44$SHOP_BASIC_PLANNER_RULE, $sym73$ASSERTIONS, $sym76$SHOP_BASIC_PLANNER_RULE_ASSERTIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym77$SET_ASSERTIONS, $sym44$SHOP_BASIC_PLANNER_RULE, $list10, $list78, $list79 );
    methods.subloop_register_instance_method( $sym44$SHOP_BASIC_PLANNER_RULE, $sym77$SET_ASSERTIONS, $sym81$SHOP_BASIC_PLANNER_RULE_SET_ASSERTIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym82$UNIFY_TASK_TO_HEAD, $sym44$SHOP_BASIC_PLANNER_RULE, $list10, $list83, $list84 );
    methods.subloop_register_instance_method( $sym44$SHOP_BASIC_PLANNER_RULE, $sym82$UNIFY_TASK_TO_HEAD, $sym87$SHOP_BASIC_PLANNER_RULE_UNIFY_TASK_TO_HEAD_METHOD );
    interfaces.new_interface( $sym88$SHOP_CONDITIONAL_EFFECT, NIL, NIL, $list89 );
    classes.subloop_new_class( $sym90$SHOP_BASIC_CONDITIONAL_EFFECT, $sym44$SHOP_BASIC_PLANNER_RULE, $list91, NIL, $list92 );
    classes.class_set_implements_slot_listeners( $sym90$SHOP_BASIC_CONDITIONAL_EFFECT, NIL );
    classes.subloop_note_class_initialization_function( $sym90$SHOP_BASIC_CONDITIONAL_EFFECT, $sym96$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_CONDITIONAL_EFFECT_CLASS );
    classes.subloop_note_instance_initialization_function( $sym90$SHOP_BASIC_CONDITIONAL_EFFECT, $sym97$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_CONDITIONAL_EFFECT_INSTANC );
    subloop_reserved_initialize_shop_basic_conditional_effect_class( $sym90$SHOP_BASIC_CONDITIONAL_EFFECT );
    methods.methods_incorporate_instance_method( $sym51$PRINT, $sym90$SHOP_BASIC_CONDITIONAL_EFFECT, $list10, $list52, $list98 );
    methods.subloop_register_instance_method( $sym90$SHOP_BASIC_CONDITIONAL_EFFECT, $sym51$PRINT, $sym101$SHOP_BASIC_CONDITIONAL_EFFECT_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym58$HTML_DISPLAY, $sym90$SHOP_BASIC_CONDITIONAL_EFFECT, $list10, NIL, $list102 );
    methods.subloop_register_instance_method( $sym90$SHOP_BASIC_CONDITIONAL_EFFECT, $sym58$HTML_DISPLAY, $sym108$SHOP_BASIC_CONDITIONAL_EFFECT_HTML_DISPLAY_METHOD );
    methods.methods_incorporate_instance_method( $sym109$INIT, $sym90$SHOP_BASIC_CONDITIONAL_EFFECT, $list10, $list110, $list111 );
    methods.subloop_register_instance_method( $sym90$SHOP_BASIC_CONDITIONAL_EFFECT, $sym109$INIT, $sym113$SHOP_BASIC_CONDITIONAL_EFFECT_INIT_METHOD );
    methods.methods_incorporate_instance_method( $sym95$ADDS, $sym90$SHOP_BASIC_CONDITIONAL_EFFECT, $list10, NIL, $list114 );
    methods.subloop_register_instance_method( $sym90$SHOP_BASIC_CONDITIONAL_EFFECT, $sym95$ADDS, $sym116$SHOP_BASIC_CONDITIONAL_EFFECT_ADDS_METHOD );
    methods.methods_incorporate_instance_method( $sym94$DELETES, $sym90$SHOP_BASIC_CONDITIONAL_EFFECT, $list10, NIL, $list117 );
    methods.subloop_register_instance_method( $sym90$SHOP_BASIC_CONDITIONAL_EFFECT, $sym94$DELETES, $sym119$SHOP_BASIC_CONDITIONAL_EFFECT_DELETES_METHOD );
    methods.methods_incorporate_instance_method( $sym93$CONDITION, $sym90$SHOP_BASIC_CONDITIONAL_EFFECT, $list10, NIL, $list120 );
    methods.subloop_register_instance_method( $sym90$SHOP_BASIC_CONDITIONAL_EFFECT, $sym93$CONDITION, $sym122$SHOP_BASIC_CONDITIONAL_EFFECT_CONDITION_METHOD );
    methods.methods_incorporate_instance_method( $sym123$ASSERTION, $sym90$SHOP_BASIC_CONDITIONAL_EFFECT, $list10, NIL, $list74 );
    methods.subloop_register_instance_method( $sym90$SHOP_BASIC_CONDITIONAL_EFFECT, $sym123$ASSERTION, $sym125$SHOP_BASIC_CONDITIONAL_EFFECT_ASSERTION_METHOD );
    classes.subloop_new_class( $sym126$SHOP_BASIC_OPERATOR, $sym44$SHOP_BASIC_PLANNER_RULE, $list127, NIL, $list128 );
    classes.class_set_implements_slot_listeners( $sym126$SHOP_BASIC_OPERATOR, NIL );
    classes.subloop_note_class_initialization_function( $sym126$SHOP_BASIC_OPERATOR, $sym131$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_OPERATOR_CLASS );
    classes.subloop_note_instance_initialization_function( $sym126$SHOP_BASIC_OPERATOR, $sym132$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_OPERATOR_INSTANCE );
    subloop_reserved_initialize_shop_basic_operator_class( $sym126$SHOP_BASIC_OPERATOR );
    methods.methods_incorporate_instance_method( $sym51$PRINT, $sym126$SHOP_BASIC_OPERATOR, $list10, $list52, $list133 );
    methods.subloop_register_instance_method( $sym126$SHOP_BASIC_OPERATOR, $sym51$PRINT, $sym136$SHOP_BASIC_OPERATOR_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym58$HTML_DISPLAY, $sym126$SHOP_BASIC_OPERATOR, $list10, NIL, $list137 );
    methods.subloop_register_instance_method( $sym126$SHOP_BASIC_OPERATOR, $sym58$HTML_DISPLAY, $sym144$SHOP_BASIC_OPERATOR_HTML_DISPLAY_METHOD );
    methods.methods_incorporate_instance_method( $sym109$INIT, $sym126$SHOP_BASIC_OPERATOR, $list10, $list145, $list146 );
    methods.subloop_register_instance_method( $sym126$SHOP_BASIC_OPERATOR, $sym109$INIT, $sym148$SHOP_BASIC_OPERATOR_INIT_METHOD );
    methods.methods_incorporate_instance_method( $sym149$GET_ADDS, $sym126$SHOP_BASIC_OPERATOR, $list10, NIL, $list150 );
    methods.subloop_register_instance_method( $sym126$SHOP_BASIC_OPERATOR, $sym149$GET_ADDS, $sym152$SHOP_BASIC_OPERATOR_GET_ADDS_METHOD );
    methods.methods_incorporate_instance_method( $sym153$ADD_LITERALS_TO_ADDS, $sym126$SHOP_BASIC_OPERATOR, $list10, $list154, $list155 );
    methods.subloop_register_instance_method( $sym126$SHOP_BASIC_OPERATOR, $sym153$ADD_LITERALS_TO_ADDS, $sym157$SHOP_BASIC_OPERATOR_ADD_LITERALS_TO_ADDS_METHOD );
    methods.methods_incorporate_instance_method( $sym158$GET_DELETES, $sym126$SHOP_BASIC_OPERATOR, $list10, NIL, $list159 );
    methods.subloop_register_instance_method( $sym126$SHOP_BASIC_OPERATOR, $sym158$GET_DELETES, $sym161$SHOP_BASIC_OPERATOR_GET_DELETES_METHOD );
    methods.methods_incorporate_instance_method( $sym130$CONDITIONAL_EFFECTS, $sym126$SHOP_BASIC_OPERATOR, $list10, NIL, $list162 );
    methods.subloop_register_instance_method( $sym126$SHOP_BASIC_OPERATOR, $sym130$CONDITIONAL_EFFECTS, $sym164$SHOP_BASIC_OPERATOR_CONDITIONAL_EFFECTS_METHOD );
    methods.methods_incorporate_instance_method( $sym165$ADD_LITERALS_TO_DELETES, $sym126$SHOP_BASIC_OPERATOR, $list10, $list154, $list166 );
    methods.subloop_register_instance_method( $sym126$SHOP_BASIC_OPERATOR, $sym165$ADD_LITERALS_TO_DELETES, $sym168$SHOP_BASIC_OPERATOR_ADD_LITERALS_TO_DELETES_METHOD );
    methods.methods_incorporate_class_method( $sym169$UNIT_TEST, $sym126$SHOP_BASIC_OPERATOR, $list170, $list171, $list172 );
    methods.subloop_register_class_method( $sym126$SHOP_BASIC_OPERATOR, $sym169$UNIT_TEST, $sym181$SHOP_BASIC_OPERATOR_UNIT_TEST_METHOD );
    classes.subloop_new_class( $sym182$SHOP_BASIC_METHOD, $sym44$SHOP_BASIC_PLANNER_RULE, $list183, NIL, $list184 );
    classes.class_set_implements_slot_listeners( $sym182$SHOP_BASIC_METHOD, NIL );
    classes.subloop_note_class_initialization_function( $sym182$SHOP_BASIC_METHOD, $sym187$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_METHOD_CLASS );
    classes.subloop_note_instance_initialization_function( $sym182$SHOP_BASIC_METHOD, $sym188$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_METHOD_INSTANCE );
    subloop_reserved_initialize_shop_basic_method_class( $sym182$SHOP_BASIC_METHOD );
    methods.methods_incorporate_instance_method( $sym51$PRINT, $sym182$SHOP_BASIC_METHOD, NIL, $list52, $list189 );
    methods.subloop_register_instance_method( $sym182$SHOP_BASIC_METHOD, $sym51$PRINT, $sym192$SHOP_BASIC_METHOD_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym58$HTML_DISPLAY, $sym182$SHOP_BASIC_METHOD, $list10, NIL, $list193 );
    methods.subloop_register_instance_method( $sym182$SHOP_BASIC_METHOD, $sym58$HTML_DISPLAY, $sym198$SHOP_BASIC_METHOD_HTML_DISPLAY_METHOD );
    methods.methods_incorporate_instance_method( $sym109$INIT, $sym182$SHOP_BASIC_METHOD, $list10, $list199, $list200 );
    methods.subloop_register_instance_method( $sym182$SHOP_BASIC_METHOD, $sym109$INIT, $sym202$SHOP_BASIC_METHOD_INIT_METHOD );
    methods.methods_incorporate_instance_method( $sym203$SET_DECOMPOSITION, $sym182$SHOP_BASIC_METHOD, $list10, $list204, $list205 );
    methods.subloop_register_instance_method( $sym182$SHOP_BASIC_METHOD, $sym203$SET_DECOMPOSITION, $sym207$SHOP_BASIC_METHOD_SET_DECOMPOSITION_METHOD );
    methods.methods_incorporate_instance_method( $sym208$GET_DECOMPOSITION, $sym182$SHOP_BASIC_METHOD, $list10, NIL, $list209 );
    methods.subloop_register_instance_method( $sym182$SHOP_BASIC_METHOD, $sym208$GET_DECOMPOSITION, $sym211$SHOP_BASIC_METHOD_GET_DECOMPOSITION_METHOD );
    methods.methods_incorporate_instance_method( $sym212$GET_PRECONDITION, $sym182$SHOP_BASIC_METHOD, $list10, NIL, $list213 );
    methods.subloop_register_instance_method( $sym182$SHOP_BASIC_METHOD, $sym212$GET_PRECONDITION, $sym215$SHOP_BASIC_METHOD_GET_PRECONDITION_METHOD );
    methods.methods_incorporate_instance_method( $sym216$UNIFY_TASK_TO_HEAD_WITH_DATA, $sym182$SHOP_BASIC_METHOD, $list10, $list83, $list217 );
    methods.subloop_register_instance_method( $sym182$SHOP_BASIC_METHOD, $sym216$UNIFY_TASK_TO_HEAD_WITH_DATA, $sym219$SHOP_BASIC_METHOD_UNIFY_TASK_TO_HEAD_WITH_DATA_METHOD );
    methods.methods_incorporate_instance_method( $sym220$ADD_LITERALS_TO_PRECONDITION, $sym182$SHOP_BASIC_METHOD, $list10, $list154, $list221 );
    methods.subloop_register_instance_method( $sym182$SHOP_BASIC_METHOD, $sym220$ADD_LITERALS_TO_PRECONDITION, $sym223$SHOP_BASIC_METHOD_ADD_LITERALS_TO_PRECONDITION_METHOD );
    classes.subloop_new_class( $sym224$SHOP_BASIC_SUFFICIENCY_COND, $sym44$SHOP_BASIC_PLANNER_RULE, $list225, NIL, $list226 );
    classes.class_set_implements_slot_listeners( $sym224$SHOP_BASIC_SUFFICIENCY_COND, NIL );
    classes.subloop_note_class_initialization_function( $sym224$SHOP_BASIC_SUFFICIENCY_COND, $sym227$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_SUFFICIENCY_COND_CLASS );
    classes.subloop_note_instance_initialization_function( $sym224$SHOP_BASIC_SUFFICIENCY_COND, $sym229$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_SUFFICIENCY_COND_INSTANCE );
    subloop_reserved_initialize_shop_basic_sufficiency_cond_class( $sym224$SHOP_BASIC_SUFFICIENCY_COND );
    methods.methods_incorporate_instance_method( $sym51$PRINT, $sym224$SHOP_BASIC_SUFFICIENCY_COND, NIL, $list52, $list230 );
    methods.subloop_register_instance_method( $sym224$SHOP_BASIC_SUFFICIENCY_COND, $sym51$PRINT, $sym233$SHOP_BASIC_SUFFICIENCY_COND_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym58$HTML_DISPLAY, $sym224$SHOP_BASIC_SUFFICIENCY_COND, NIL, NIL, $list234 );
    methods.subloop_register_instance_method( $sym224$SHOP_BASIC_SUFFICIENCY_COND, $sym58$HTML_DISPLAY, $sym236$SHOP_BASIC_SUFFICIENCY_COND_HTML_DISPLAY_METHOD );
    methods.methods_incorporate_instance_method( $sym237$COND_FORMULA, $sym224$SHOP_BASIC_SUFFICIENCY_COND, $list10, NIL, $list238 );
    methods.subloop_register_instance_method( $sym224$SHOP_BASIC_SUFFICIENCY_COND, $sym237$COND_FORMULA, $sym240$SHOP_BASIC_SUFFICIENCY_COND_COND_FORMULA_METHOD );
    methods.methods_incorporate_instance_method( $sym241$SET_COND_FORMULA, $sym224$SHOP_BASIC_SUFFICIENCY_COND, $list10, $list69, $list242 );
    methods.subloop_register_instance_method( $sym224$SHOP_BASIC_SUFFICIENCY_COND, $sym241$SET_COND_FORMULA, $sym244$SHOP_BASIC_SUFFICIENCY_COND_SET_COND_FORMULA_METHOD );
    methods.methods_incorporate_instance_method( $sym216$UNIFY_TASK_TO_HEAD_WITH_DATA, $sym224$SHOP_BASIC_SUFFICIENCY_COND, $list10, $list83, $list245 );
    methods.subloop_register_instance_method( $sym224$SHOP_BASIC_SUFFICIENCY_COND, $sym216$UNIFY_TASK_TO_HEAD_WITH_DATA, $sym247$SHOP_BASIC_SUFFICIENCY_COND_UNIFY_TASK_TO_HEAD_WITH_DATA_METHOD );
    interfaces.new_interface( $sym248$SHOP_PRECONDITION, NIL, NIL, NIL );
    classes.subloop_new_class( $sym249$SHOP_BASIC_PRECONDITION, $sym182$SHOP_BASIC_METHOD, $list250, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym249$SHOP_BASIC_PRECONDITION, NIL );
    classes.subloop_note_class_initialization_function( $sym249$SHOP_BASIC_PRECONDITION, $sym251$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PRECONDITION_CLASS );
    classes.subloop_note_instance_initialization_function( $sym249$SHOP_BASIC_PRECONDITION, $sym252$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PRECONDITION_INSTANCE );
    subloop_reserved_initialize_shop_basic_precondition_class( $sym249$SHOP_BASIC_PRECONDITION );
    methods.methods_incorporate_instance_method( $sym51$PRINT, $sym249$SHOP_BASIC_PRECONDITION, $list10, $list52, $list253 );
    methods.subloop_register_instance_method( $sym249$SHOP_BASIC_PRECONDITION, $sym51$PRINT, $sym256$SHOP_BASIC_PRECONDITION_PRINT_METHOD );
    classes.subloop_new_class( $sym257$SHOP_BASIC_PROBLEM, $sym1$OBJECT, $list258, NIL, $list259 );
    classes.class_set_implements_slot_listeners( $sym257$SHOP_BASIC_PROBLEM, NIL );
    classes.subloop_note_class_initialization_function( $sym257$SHOP_BASIC_PROBLEM, $sym262$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PROBLEM_CLASS );
    classes.subloop_note_instance_initialization_function( $sym257$SHOP_BASIC_PROBLEM, $sym266$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PROBLEM_INSTANCE );
    subloop_reserved_initialize_shop_basic_problem_class( $sym257$SHOP_BASIC_PROBLEM );
    methods.methods_incorporate_instance_method( $sym19$INITIALIZE, $sym257$SHOP_BASIC_PROBLEM, $list20, NIL, $list267 );
    methods.subloop_register_instance_method( $sym257$SHOP_BASIC_PROBLEM, $sym19$INITIALIZE, $sym269$SHOP_BASIC_PROBLEM_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym270$INITIALIZE_PROBLEM, $sym257$SHOP_BASIC_PROBLEM, $list10, $list271, $list272 );
    methods.subloop_register_instance_method( $sym257$SHOP_BASIC_PROBLEM, $sym270$INITIALIZE_PROBLEM, $sym274$SHOP_BASIC_PROBLEM_INITIALIZE_PROBLEM_METHOD );
    methods.methods_incorporate_instance_method( $sym51$PRINT, $sym257$SHOP_BASIC_PROBLEM, NIL, $list52, $list275 );
    methods.subloop_register_instance_method( $sym257$SHOP_BASIC_PROBLEM, $sym51$PRINT, $sym278$SHOP_BASIC_PROBLEM_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym279$SET_NAME, $sym257$SHOP_BASIC_PROBLEM, $list10, $list280, $list281 );
    methods.subloop_register_instance_method( $sym257$SHOP_BASIC_PROBLEM, $sym279$SET_NAME, $sym283$SHOP_BASIC_PROBLEM_SET_NAME_METHOD );
    methods.methods_incorporate_instance_method( $sym284$GET_NAME, $sym257$SHOP_BASIC_PROBLEM, $list10, NIL, $list285 );
    methods.subloop_register_instance_method( $sym257$SHOP_BASIC_PROBLEM, $sym284$GET_NAME, $sym287$SHOP_BASIC_PROBLEM_GET_NAME_METHOD );
    methods.methods_incorporate_instance_method( $sym288$SET_DOMAIN, $sym257$SHOP_BASIC_PROBLEM, $list10, $list289, $list290 );
    methods.subloop_register_instance_method( $sym257$SHOP_BASIC_PROBLEM, $sym288$SET_DOMAIN, $sym292$SHOP_BASIC_PROBLEM_SET_DOMAIN_METHOD );
    methods.methods_incorporate_instance_method( $sym293$GET_DOMAIN, $sym257$SHOP_BASIC_PROBLEM, $list10, NIL, $list294 );
    methods.subloop_register_instance_method( $sym257$SHOP_BASIC_PROBLEM, $sym293$GET_DOMAIN, $sym296$SHOP_BASIC_PROBLEM_GET_DOMAIN_METHOD );
    methods.methods_incorporate_instance_method( $sym297$GET_METHODS, $sym257$SHOP_BASIC_PROBLEM, $list10, NIL, $list298 );
    methods.subloop_register_instance_method( $sym257$SHOP_BASIC_PROBLEM, $sym297$GET_METHODS, $sym301$SHOP_BASIC_PROBLEM_GET_METHODS_METHOD );
    methods.methods_incorporate_instance_method( $sym302$GET_OPERATORS, $sym257$SHOP_BASIC_PROBLEM, $list10, NIL, $list303 );
    methods.subloop_register_instance_method( $sym257$SHOP_BASIC_PROBLEM, $sym302$GET_OPERATORS, $sym306$SHOP_BASIC_PROBLEM_GET_OPERATORS_METHOD );
    methods.methods_incorporate_instance_method( $sym307$GET_TASKS, $sym257$SHOP_BASIC_PROBLEM, $list10, NIL, $list308 );
    methods.subloop_register_instance_method( $sym257$SHOP_BASIC_PROBLEM, $sym307$GET_TASKS, $sym310$SHOP_BASIC_PROBLEM_GET_TASKS_METHOD );
    methods.methods_incorporate_instance_method( $sym311$SET_TASKS, $sym257$SHOP_BASIC_PROBLEM, $list10, $list312, $list313 );
    methods.subloop_register_instance_method( $sym257$SHOP_BASIC_PROBLEM, $sym311$SET_TASKS, $sym315$SHOP_BASIC_PROBLEM_SET_TASKS_METHOD );
    methods.methods_incorporate_instance_method( $sym316$GET_STATE, $sym257$SHOP_BASIC_PROBLEM, $list10, NIL, $list317 );
    methods.subloop_register_instance_method( $sym257$SHOP_BASIC_PROBLEM, $sym316$GET_STATE, $sym319$SHOP_BASIC_PROBLEM_GET_STATE_METHOD );
    methods.methods_incorporate_instance_method( $sym320$SET_STATE, $sym257$SHOP_BASIC_PROBLEM, $list10, $list321, $list322 );
    methods.subloop_register_instance_method( $sym257$SHOP_BASIC_PROBLEM, $sym320$SET_STATE, $sym324$SHOP_BASIC_PROBLEM_SET_STATE_METHOD );
    sunit_external.define_test_category( $str325$SHOP_Category, UNPROVIDED );
    sunit_external.define_test_suite( $str326$SHOP, $list327, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_shop_datastructures_file();
  }

  @Override
  public void initializeVariables()
  {
    init_shop_datastructures_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_shop_datastructures_file();
  }
  static
  {
    me = new shop_datastructures();
    $shop_unify_failed$ = null;
    $shop_empty_unifier$ = null;
    $sym0$SHOP_INDEXED_OBJECT = makeSymbol( "SHOP-INDEXED-OBJECT" );
    $sym1$OBJECT = makeSymbol( "OBJECT" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "INSTANCE-INDEX" ), makeKeyword( "CLASS" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "FIND-INSTANCE" ),
        ConsesLow.list( makeSymbol( "ID" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-TO-INDEX" ), NIL, makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $sym3$INSTANCE_INDEX = makeSymbol( "INSTANCE-INDEX" );
    $sym4$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym5$SUBLOOP_RESERVED_INITIALIZE_SHOP_INDEXED_OBJECT_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-INDEXED-OBJECT-CLASS" );
    $sym6$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym7$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym8$SUBLOOP_RESERVED_INITIALIZE_SHOP_INDEXED_OBJECT_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-INDEXED-OBJECT-INSTANCE" );
    $sym9$FIND_INSTANCE = makeSymbol( "FIND-INSTANCE" );
    $list10 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list11 = ConsesLow.list( makeSymbol( "ID" ) );
    $list12 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol( "INSTANCE-INDEX" ), makeSymbol( "ID" ), NIL ) ) );
    $sym13$OUTER_CATCH_FOR_SHOP_INDEXED_OBJECT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-INDEXED-OBJECT-METHOD" );
    $sym14$SHOP_INDEXED_OBJECT_FIND_INSTANCE_METHOD = makeSymbol( "SHOP-INDEXED-OBJECT-FIND-INSTANCE-METHOD" );
    $sym15$ADD_TO_INDEX = makeSymbol( "ADD-TO-INDEX" );
    $list16 = ConsesLow.list( makeKeyword( "NO-MEMBER-VARIABLES" ), makeKeyword( "PRIVATE" ) );
    $list17 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INSTANCE-NUMBER" ), ConsesLow.list( makeSymbol( "GET-OBJECT-INSTANCE-NUMBER" ), makeSymbol( "SELF" ) ) ),
        ConsesLow.list( makeSymbol( "INSTANCE-INDEX" ), ConsesLow.list( makeSymbol( "GET-SHOP-INDEXED-OBJECT-INSTANCE-INDEX" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list(
            makeSymbol( "NULL" ), makeSymbol( "INSTANCE-INDEX" ) ), ConsesLow.list( makeSymbol( "SET-SHOP-INDEXED-OBJECT-INSTANCE-INDEX" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ), ConsesLow
                .list( makeSymbol( "FUNCTION" ), EQ ), TEN_INTEGER ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INSTANCE-INDEX" ), ConsesLow.list( makeSymbol( "GET-SHOP-INDEXED-OBJECT-INSTANCE-INDEX" ),
                    makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "DICTIONARY-ENTER" ), makeSymbol( "INSTANCE-INDEX" ), makeSymbol( "INSTANCE-NUMBER" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol(
                        "RET" ), NIL ) ) );
    $sym18$SHOP_INDEXED_OBJECT_ADD_TO_INDEX_METHOD = makeSymbol( "SHOP-INDEXED-OBJECT-ADD-TO-INDEX-METHOD" );
    $sym19$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list20 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list21 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "*SHOP-OBJECT-INDEXING?*" ), ConsesLow.list( makeSymbol(
        "ADD-TO-INDEX" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym22$SHOP_INDEXED_OBJECT_INITIALIZE_METHOD = makeSymbol( "SHOP-INDEXED-OBJECT-INITIALIZE-METHOD" );
    $sym23$SHOP_PROBLEM = makeSymbol( "SHOP-PROBLEM" );
    $list24 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CREATE-PROBLEM" ), ConsesLow.list( makeSymbol( "PROBLEM-NAME" ), makeSymbol( "DOMAIN-NAME" ), makeSymbol(
        "STATE" ), makeSymbol( "TASKS" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-NAME" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-NAME" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-STATE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow
                .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-STATE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-TASKS" ), NIL, makeKeyword(
                    "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-TASKS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                        "GET-DOMAIN" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-DOMAIN" ), ConsesLow.list( makeSymbol( "DOMAIN" ) ), makeKeyword(
                            "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-OPERATORS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                                makeSymbol( "GET-METHODS" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym25$SHOP_PLANNER_RULE = makeSymbol( "SHOP-PLANNER-RULE" );
    $list26 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRED" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NAME" ), NIL,
        makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "HEAD" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-HEAD" ),
            NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "UNIFY-TASK-TO-HEAD" ), ConsesLow.list( makeSymbol( "TASK" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ASSERTIONS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "HTML-DISPLAY" ), NIL, makeKeyword(
                    "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-ASSERTIONS" ), ConsesLow.list( makeSymbol( "ASSERTION-LIST" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym27$SHOP_OPERATOR = makeSymbol( "SHOP-OPERATOR" );
    $list28 = ConsesLow.list( makeKeyword( "EXTENDS" ), makeSymbol( "SHOP-PLANNER-RULE" ) );
    $list29 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-ADDS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "ADD-LITERALS-TO-ADDS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DELETES" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-LITERALS-TO-DELETES" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym30$SHOP_SUFFICIENCY_CONDITION = makeSymbol( "SHOP-SUFFICIENCY-CONDITION" );
    $list31 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "COND-FORMULA" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "SET-COND-FORMULA" ), ConsesLow.list( makeSymbol( "FORM" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym32$SHOP_METHOD = makeSymbol( "SHOP-METHOD" );
    $list33 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SET-DECOMPOSITION" ), ConsesLow.list( makeSymbol( "DECOMP" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
        "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DECOMPOSITION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PRECONDITION" ), NIL, makeKeyword( "PUBLIC" ) ),
        ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INIT" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $list34 = ConsesLow.list( makeSymbol( "SET1" ), makeSymbol( "SET2" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "TEST" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "FUNCTION" ),
        EQL ) ) ) );
    $list35 = ConsesLow.list( makeKeyword( "TEST" ) );
    $kw36$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw37$TEST = makeKeyword( "TEST" );
    $list38 = ConsesLow.list( makeSymbol( "FUNCTION" ), EQL );
    $sym39$SHOP_MY_UNION_FUNC = makeSymbol( "SHOP-MY-UNION-FUNC" );
    $kw40$FAIL = makeKeyword( "FAIL" );
    $sym41$SHOP_COMPOSE_SUBSTITUTIONS_TEST = makeSymbol( "SHOP-COMPOSE-SUBSTITUTIONS-TEST" );
    $str42$_ = makeString( "?" );
    $sym43$SHOP_STANDARDIZER_GENSYM = makeSymbol( "SHOP-STANDARDIZER-GENSYM" );
    $sym44$SHOP_BASIC_PLANNER_RULE = makeSymbol( "SHOP-BASIC-PLANNER-RULE" );
    $list45 = ConsesLow.list( makeSymbol( "SHOP-PLANNER-RULE" ) );
    $list46 = ConsesLow.list( ConsesLow.list( makeSymbol( "HEAD" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "ASSERTION-LIST" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PROTECTED" ) ) );
    $sym47$ASSERTION_LIST = makeSymbol( "ASSERTION-LIST" );
    $sym48$HEAD = makeSymbol( "HEAD" );
    $sym49$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_RULE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-RULE-CLASS" );
    $sym50$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_RULE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-RULE-INSTANCE" );
    $sym51$PRINT = makeSymbol( "PRINT" );
    $list52 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list53 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "SELF" ) ), ConsesLow.list(
        makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "#<PLANNER RULE-~S:~S>" ), makeSymbol( "INSTANCE-NUMBER" ), makeSymbol( "HEAD" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ),
            makeString( "#<Malformed Instance>" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym54$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-RULE-METHOD" );
    $str55$__PLANNER_RULE__S__S_ = makeString( "#<PLANNER RULE-~S:~S>" );
    $str56$__Malformed_Instance_ = makeString( "#<Malformed Instance>" );
    $sym57$SHOP_BASIC_PLANNER_RULE_PRINT_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-RULE-PRINT-METHOD" );
    $sym58$HTML_DISPLAY = makeSymbol( "HTML-DISPLAY" );
    $list59 = ConsesLow.list( ConsesLow.list( makeSymbol( "PRINT" ), makeSymbol( "SELF" ), makeSymbol( "*HTML-STREAM*" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym60$SHOP_BASIC_PLANNER_RULE_HTML_DISPLAY_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-RULE-HTML-DISPLAY-METHOD" );
    $sym61$PRED = makeSymbol( "PRED" );
    $list62 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FORMULA-OPERATOR" ), makeSymbol( "HEAD" ) ) ) );
    $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-RULE-METHOD" );
    $sym64$SHOP_BASIC_PLANNER_RULE_PRED_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-RULE-PRED-METHOD" );
    $list65 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "HEAD" ) ) );
    $sym66$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-RULE-METHOD" );
    $sym67$SHOP_BASIC_PLANNER_RULE_HEAD_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-RULE-HEAD-METHOD" );
    $sym68$SET_HEAD = makeSymbol( "SET-HEAD" );
    $list69 = ConsesLow.list( makeSymbol( "FORM" ) );
    $list70 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "HEAD" ), makeSymbol( "FORM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "HEAD" ) ) );
    $sym71$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-RULE-METHOD" );
    $sym72$SHOP_BASIC_PLANNER_RULE_SET_HEAD_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-RULE-SET-HEAD-METHOD" );
    $sym73$ASSERTIONS = makeSymbol( "ASSERTIONS" );
    $list74 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ASSERTION-LIST" ) ) );
    $sym75$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-RULE-METHOD" );
    $sym76$SHOP_BASIC_PLANNER_RULE_ASSERTIONS_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-RULE-ASSERTIONS-METHOD" );
    $sym77$SET_ASSERTIONS = makeSymbol( "SET-ASSERTIONS" );
    $list78 = ConsesLow.list( makeSymbol( "ASSERTIONS" ) );
    $list79 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ASSERTION-LIST" ), makeSymbol( "ASSERTIONS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ASSERTIONS" ) ) );
    $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-RULE-METHOD" );
    $sym81$SHOP_BASIC_PLANNER_RULE_SET_ASSERTIONS_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-RULE-SET-ASSERTIONS-METHOD" );
    $sym82$UNIFY_TASK_TO_HEAD = makeSymbol( "UNIFY-TASK-TO-HEAD" );
    $list83 = ConsesLow.list( makeSymbol( "TASK" ) );
    $list84 = ConsesLow.list( makeString( "@param TASK hl-formula-p\n   @return listp" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "TASK" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "CLET" ),
        ConsesLow.list( ConsesLow.list( makeSymbol( "TASK-UNIFIER" ), ConsesLow.list( makeSymbol( "SHOP-UNIFY" ), makeSymbol( "HEAD" ), makeSymbol( "TASK" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list(
            EQ, makeKeyword( "FAIL" ), makeSymbol( "TASK-UNIFIER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TASK-UNIFIER" ) ) ) ) );
    $sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-RULE-METHOD" );
    $sym86$LISTP = makeSymbol( "LISTP" );
    $sym87$SHOP_BASIC_PLANNER_RULE_UNIFY_TASK_TO_HEAD_METHOD = makeSymbol( "SHOP-BASIC-PLANNER-RULE-UNIFY-TASK-TO-HEAD-METHOD" );
    $sym88$SHOP_CONDITIONAL_EFFECT = makeSymbol( "SHOP-CONDITIONAL-EFFECT" );
    $list89 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CONDITION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADDS" ),
        NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DELETES" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "ASSERTION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INIT" ), ConsesLow.list( makeSymbol( "COND" ), makeSymbol( "ADDS" ), makeSymbol( "DELETES" ),
                makeSymbol( "ASSERTION" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym90$SHOP_BASIC_CONDITIONAL_EFFECT = makeSymbol( "SHOP-BASIC-CONDITIONAL-EFFECT" );
    $list91 = ConsesLow.list( makeSymbol( "SHOP-CONDITIONAL-EFFECT" ) );
    $list92 = ConsesLow.list( ConsesLow.list( makeSymbol( "ADDS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DELETES" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PROTECTED" ) ), ConsesLow.list( makeSymbol( "CONDITION" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ) );
    $sym93$CONDITION = makeSymbol( "CONDITION" );
    $sym94$DELETES = makeSymbol( "DELETES" );
    $sym95$ADDS = makeSymbol( "ADDS" );
    $sym96$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_CONDITIONAL_EFFECT_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-CONDITIONAL-EFFECT-CLASS" );
    $sym97$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_CONDITIONAL_EFFECT_INSTANC = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-CONDITIONAL-EFFECT-INSTANCE" );
    $list98 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "SELF" ) ), ConsesLow.list(
        makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "#<COND-EFFECT-~S:~S>" ), makeSymbol( "INSTANCE-NUMBER" ), makeSymbol( "HEAD" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ),
            makeString( "#<Malformed Instance>" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym99$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-CONDITIONAL-EFFECT-METHOD" );
    $str100$__COND_EFFECT__S__S_ = makeString( "#<COND-EFFECT-~S:~S>" );
    $sym101$SHOP_BASIC_CONDITIONAL_EFFECT_PRINT_METHOD = makeSymbol( "SHOP-BASIC-CONDITIONAL-EFFECT-PRINT-METHOD" );
    $list102 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Condition: " ) ), ConsesLow.list( makeSymbol( "CB-FORM" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol(
        "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CONDITION" ) ) ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Adds: " ) ), ConsesLow
            .list( makeSymbol( "CB-FORM" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADDS" ) ) ) ), ConsesLow.list( makeSymbol(
                "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Deletes: " ) ), ConsesLow.list( makeSymbol( "CB-FORM" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ),
                    ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "DELETES" ) ) ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Assertion: " ) ),
      ConsesLow.list( makeSymbol( "CB-FORM" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ASSERTION-LIST" ) ) ) ), ConsesLow.list( makeSymbol(
          "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL )
    } );
    $sym103$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-CONDITIONAL-EFFECT-METHOD" );
    $str104$Condition__ = makeString( "Condition: " );
    $str105$Adds__ = makeString( "Adds: " );
    $str106$Deletes__ = makeString( "Deletes: " );
    $str107$Assertion__ = makeString( "Assertion: " );
    $sym108$SHOP_BASIC_CONDITIONAL_EFFECT_HTML_DISPLAY_METHOD = makeSymbol( "SHOP-BASIC-CONDITIONAL-EFFECT-HTML-DISPLAY-METHOD" );
    $sym109$INIT = makeSymbol( "INIT" );
    $list110 = ConsesLow.list( makeSymbol( "NEW-HEAD" ), makeSymbol( "NEW-COND" ), makeSymbol( "NEW-ADDS" ), makeSymbol( "NEW-DELETES" ), makeSymbol( "NEW-ASSERTION" ) );
    $list111 = ConsesLow.list( makeString( "@param NEW-HEAD listp\n   @param NEW-COND listp\n   @param NEW-ADDS listp\n   @param NEW-DELETES listp" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "HEAD" ),
        makeSymbol( "NEW-HEAD" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ADDS" ), makeSymbol( "NEW-ADDS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DELETES" ), makeSymbol( "NEW-DELETES" ) ),
        ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CONDITION" ), makeSymbol( "NEW-COND" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "NEW-ASSERTION" ), makeSymbol( "ASSERTION-LIST" ) ), ConsesLow
            .list( makeSymbol( "RET" ), NIL ) );
    $sym112$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-CONDITIONAL-EFFECT-METHOD" );
    $sym113$SHOP_BASIC_CONDITIONAL_EFFECT_INIT_METHOD = makeSymbol( "SHOP-BASIC-CONDITIONAL-EFFECT-INIT-METHOD" );
    $list114 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ADDS" ) ) );
    $sym115$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-CONDITIONAL-EFFECT-METHOD" );
    $sym116$SHOP_BASIC_CONDITIONAL_EFFECT_ADDS_METHOD = makeSymbol( "SHOP-BASIC-CONDITIONAL-EFFECT-ADDS-METHOD" );
    $list117 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DELETES" ) ) );
    $sym118$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-CONDITIONAL-EFFECT-METHOD" );
    $sym119$SHOP_BASIC_CONDITIONAL_EFFECT_DELETES_METHOD = makeSymbol( "SHOP-BASIC-CONDITIONAL-EFFECT-DELETES-METHOD" );
    $list120 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CONDITION" ) ) );
    $sym121$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-CONDITIONAL-EFFECT-METHOD" );
    $sym122$SHOP_BASIC_CONDITIONAL_EFFECT_CONDITION_METHOD = makeSymbol( "SHOP-BASIC-CONDITIONAL-EFFECT-CONDITION-METHOD" );
    $sym123$ASSERTION = makeSymbol( "ASSERTION" );
    $sym124$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-CONDITIONAL-EFFECT-METHOD" );
    $sym125$SHOP_BASIC_CONDITIONAL_EFFECT_ASSERTION_METHOD = makeSymbol( "SHOP-BASIC-CONDITIONAL-EFFECT-ASSERTION-METHOD" );
    $sym126$SHOP_BASIC_OPERATOR = makeSymbol( "SHOP-BASIC-OPERATOR" );
    $list127 = ConsesLow.list( makeSymbol( "SHOP-OPERATOR" ) );
    $list128 = ConsesLow.list( ConsesLow.list( makeSymbol( "ADDS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DELETES" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ),
        ConsesLow.list( makeSymbol( "CONDITIONAL-EFFECTS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "COST" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow
            .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CONDITIONAL-EFFECTS" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym129$COST = makeSymbol( "COST" );
    $sym130$CONDITIONAL_EFFECTS = makeSymbol( "CONDITIONAL-EFFECTS" );
    $sym131$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_OPERATOR_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-OPERATOR-CLASS" );
    $sym132$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_OPERATOR_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-OPERATOR-INSTANCE" );
    $list133 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "SELF" ) ), ConsesLow.list(
        makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "#<OPERATOR-~S:~S>" ), makeSymbol( "INSTANCE-NUMBER" ), makeSymbol( "HEAD" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ),
            makeString( "#<Malformed Instance>" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym134$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD" );
    $str135$__OPERATOR__S__S_ = makeString( "#<OPERATOR-~S:~S>" );
    $sym136$SHOP_BASIC_OPERATOR_PRINT_METHOD = makeSymbol( "SHOP-BASIC-OPERATOR-PRINT-METHOD" );
    $list137 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ADD-LITERALS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ),
        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADDS" ) ) ) ), ConsesLow.list( makeSymbol( "DELETE-LITERALS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
            "QUOTE" ), makeSymbol( "DELETES" ) ) ) ), ConsesLow.list( makeSymbol( "COST" ), ConsesLow.list( makeSymbol( "GET-SHOP-BASIC-OPERATOR-COST" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol(
                "HTML-PRINC" ), makeString( "  Head:" ) ), ConsesLow.list( makeSymbol( "CB-FORM" ), makeSymbol( "HEAD" ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol( "HTML-PRINC" ),
                    makeString( "  Add-literals: " ) ), ConsesLow.list( makeSymbol( "CB-FORM" ), makeSymbol( "ADD-LITERALS" ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol( "HTML-PRINC" ),
                        makeString( "  Delete-literals: " ) ), ConsesLow.list( makeSymbol( "CB-FORM" ), makeSymbol( "DELETE-LITERALS" ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol(
                            "HTML-FORMAT" ), makeString( "  Cost: ~S" ), makeSymbol( "COST" ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Assertion: " ) ),
      ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CB-FORM" ) ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
          makeSymbol( "ASSERTION-LIST" ) ) ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ), TWO_INTEGER )
    } ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym138$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD" );
    $str139$__Head_ = makeString( "  Head:" );
    $str140$__Add_literals__ = makeString( "  Add-literals: " );
    $str141$__Delete_literals__ = makeString( "  Delete-literals: " );
    $str142$__Cost___S = makeString( "  Cost: ~S" );
    $sym143$CB_FORM = makeSymbol( "CB-FORM" );
    $sym144$SHOP_BASIC_OPERATOR_HTML_DISPLAY_METHOD = makeSymbol( "SHOP-BASIC-OPERATOR-HTML-DISPLAY-METHOD" );
    $list145 = ConsesLow.list( makeSymbol( "NEW-ASSERTION" ), makeSymbol( "NEW-HEAD" ), makeSymbol( "NEW-ADDS" ), makeSymbol( "NEW-DELETES" ) );
    $list146 = ConsesLow.list( makeString(
        "@param NEW-ASSERTION        assertion-p\n   @param NEW-HEAD             hl-formula-p\n   @param NEW-ADDS             listp   ;; of hl-formula-p\n   @param NEW-DELETES          listp   ;; of hl-formula-p\n   @return shop-basic-operator-p" ),
        ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ASSERTION-LIST" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "NEW-ASSERTION" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "HEAD" ),
            makeSymbol( "NEW-HEAD" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ADDS" ), makeSymbol( "NEW-ADDS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DELETES" ), makeSymbol(
                "NEW-DELETES" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "COST" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym147$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD" );
    $sym148$SHOP_BASIC_OPERATOR_INIT_METHOD = makeSymbol( "SHOP-BASIC-OPERATOR-INIT-METHOD" );
    $sym149$GET_ADDS = makeSymbol( "GET-ADDS" );
    $list150 = ConsesLow.list( makeString( "@return listp ;; of hl-formula-p" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ADDS" ) ) );
    $sym151$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD" );
    $sym152$SHOP_BASIC_OPERATOR_GET_ADDS_METHOD = makeSymbol( "SHOP-BASIC-OPERATOR-GET-ADDS-METHOD" );
    $sym153$ADD_LITERALS_TO_ADDS = makeSymbol( "ADD-LITERALS-TO-ADDS" );
    $list154 = ConsesLow.list( makeSymbol( "LITS" ) );
    $list155 = ConsesLow.list( makeString( "@param LITS listp ;; of literals\n   @return listp ;; of hl-formula-p" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ADDS" ), ConsesLow.list( makeSymbol( "UNION" ),
        makeSymbol( "ADDS" ), makeSymbol( "LITS" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ADDS" ) ) );
    $sym156$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD" );
    $sym157$SHOP_BASIC_OPERATOR_ADD_LITERALS_TO_ADDS_METHOD = makeSymbol( "SHOP-BASIC-OPERATOR-ADD-LITERALS-TO-ADDS-METHOD" );
    $sym158$GET_DELETES = makeSymbol( "GET-DELETES" );
    $list159 = ConsesLow.list( makeString( "@return listp ;; of hl-formula-p" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DELETES" ) ) );
    $sym160$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD" );
    $sym161$SHOP_BASIC_OPERATOR_GET_DELETES_METHOD = makeSymbol( "SHOP-BASIC-OPERATOR-GET-DELETES-METHOD" );
    $list162 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CONDITIONAL-EFFECTS" ) ) );
    $sym163$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD" );
    $sym164$SHOP_BASIC_OPERATOR_CONDITIONAL_EFFECTS_METHOD = makeSymbol( "SHOP-BASIC-OPERATOR-CONDITIONAL-EFFECTS-METHOD" );
    $sym165$ADD_LITERALS_TO_DELETES = makeSymbol( "ADD-LITERALS-TO-DELETES" );
    $list166 = ConsesLow.list( makeString( "@param LITS listp ;; of literals\n   @return listp ;; of hl-formula-p" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DELETES" ), ConsesLow.list( makeSymbol( "UNION" ),
        makeSymbol( "DELETES" ), makeSymbol( "LITS" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DELETES" ) ) );
    $sym167$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD" );
    $sym168$SHOP_BASIC_OPERATOR_ADD_LITERALS_TO_DELETES_METHOD = makeSymbol( "SHOP-BASIC-OPERATOR-ADD-LITERALS-TO-DELETES-METHOD" );
    $sym169$UNIT_TEST = makeSymbol( "UNIT-TEST" );
    $list170 = ConsesLow.list( makeKeyword( "PRIVATE" ) );
    $list171 = ConsesLow.list( makeSymbol( "VERBOSE?" ) );
    $list172 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TEST-OP" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ),
        makeSymbol( "SHOP-BASIC-OPERATOR" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SHOP-BASIC-OPERATOR" ) ) ) ), ConsesLow.list( makeSymbol( "ADD-LIST-1" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            ConsesLow.list( ConsesLow.list( makeSymbol( "P" ), makeSymbol( "?X" ), makeSymbol( "?Y" ) ), ConsesLow.list( makeSymbol( "Q" ), makeSymbol( "?X" ), makeSymbol( "?Z" ) ) ) ) ), ConsesLow.list( makeSymbol(
                "ADD-LIST-2" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( ConsesLow.list( makeSymbol( "Q" ), makeSymbol( "?X" ), makeSymbol( "?Z" ) ), ConsesLow.list( makeSymbol( "R" ), makeSymbol( "?W" ),
                    makeSymbol( "?X" ) ) ) ) ), ConsesLow.list( makeSymbol( "DELETE-LIST-1" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( ConsesLow.list( makeSymbol( "P" ), makeSymbol( "?Y" ), makeSymbol(
                        "?X" ) ) ) ) ), ConsesLow.list( makeSymbol( "DELETE-LIST-2" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( ConsesLow.list( makeSymbol( "Q" ), makeSymbol( "?Z" ), makeSymbol(
                            "?W" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEST-OP" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADD-LITERALS-TO-ADDS" ) ), makeSymbol(
                                "ADD-LIST-1" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEST-OP" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ADD-LITERALS-TO-ADDS" ) ),
                                    makeSymbol( "ADD-LIST-2" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEST-OP" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                                        "ADD-LITERALS-TO-DELETES" ) ), makeSymbol( "DELETE-LIST-1" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEST-OP" ), ConsesLow.list( makeSymbol(
                                            "QUOTE" ), makeSymbol( "ADD-LITERALS-TO-DELETES" ) ), makeSymbol( "DELETE-LIST-2" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                                "OP-ADDS" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEST-OP" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-ADDS" ) ) ) ),
                                                ConsesLow.list( makeSymbol( "CONTROL-ADDS" ), ConsesLow.list( makeSymbol( "UNION" ), makeSymbol( "ADD-LIST-1" ), makeSymbol( "ADD-LIST-2" ), ConsesLow.list( makeSymbol(
                                                    "FUNCTION" ), EQUAL ) ) ), ConsesLow.list( makeSymbol( "OP-DELETES" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "TEST-OP" ), ConsesLow.list(
                                                        makeSymbol( "QUOTE" ), makeSymbol( "GET-DELETES" ) ) ) ), ConsesLow.list( makeSymbol( "CONTROL-DELETES" ), ConsesLow.list( makeSymbol( "UNION" ), makeSymbol(
                                                            "DELETE-LIST-1" ), makeSymbol( "DELETE-LIST-2" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol(
                                                                "VERBOSE?" ), ConsesLow.list( makeSymbol( "FORMAT" ), T, makeString( "op-adds ~s~%control-adds ~s~%" ), makeSymbol( "OP-ADDS" ), makeSymbol(
                                                                    "CONTROL-ADDS" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), T, makeString( "op-deletes ~s~%control-deletes ~s~%" ), makeSymbol( "OP-DELETES" ),
                                                                        makeSymbol( "CONTROL-DELETES" ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol(
                                                                            "SUBSETP" ), makeSymbol( "CONTROL-ADDS" ), makeSymbol( "OP-ADDS" ) ), ConsesLow.list( makeSymbol( "SUBSETP" ), makeSymbol( "OP-ADDS" ),
                                                                                makeSymbol( "CONTROL-ADDS" ) ), ConsesLow.list( makeSymbol( "SUBSETP" ), makeSymbol( "CONTROL-DELETES" ), makeSymbol( "OP-DELETES" ) ),
                                                                            ConsesLow.list( makeSymbol( "SUBSETP" ), makeSymbol( "OP-DELETES" ), makeSymbol( "CONTROL-DELETES" ) ) ), ConsesLow.list( makeSymbol( "PROGN" ),
                                                                                ConsesLow.list( makeSymbol( "PRINC" ), makeString( "shop-basic-operator:unit-test: --> SUCESSFUL" ) ), ConsesLow.list( makeSymbol(
                                                                                    "TERPRI" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "PRINC" ),
                                                                                        makeString( "shop-basic-operator:unit-test: --> FAILED" ) ), ConsesLow.list( makeSymbol( "TERPRI" ) ), ConsesLow.list( makeSymbol(
                                                                                            "RET" ), NIL ) ) ) ) ) );
    $list173 = ConsesLow.list( ConsesLow.list( makeSymbol( "P" ), makeSymbol( "?X" ), makeSymbol( "?Y" ) ), ConsesLow.list( makeSymbol( "Q" ), makeSymbol( "?X" ), makeSymbol( "?Z" ) ) );
    $list174 = ConsesLow.list( ConsesLow.list( makeSymbol( "Q" ), makeSymbol( "?X" ), makeSymbol( "?Z" ) ), ConsesLow.list( makeSymbol( "R" ), makeSymbol( "?W" ), makeSymbol( "?X" ) ) );
    $list175 = ConsesLow.list( ConsesLow.list( makeSymbol( "P" ), makeSymbol( "?Y" ), makeSymbol( "?X" ) ) );
    $list176 = ConsesLow.list( ConsesLow.list( makeSymbol( "Q" ), makeSymbol( "?Z" ), makeSymbol( "?W" ) ) );
    $str177$op_adds__s__control_adds__s__ = makeString( "op-adds ~s~%control-adds ~s~%" );
    $str178$op_deletes__s__control_deletes__s = makeString( "op-deletes ~s~%control-deletes ~s~%" );
    $str179$shop_basic_operator_unit_test____ = makeString( "shop-basic-operator:unit-test: --> SUCESSFUL" );
    $str180$shop_basic_operator_unit_test____ = makeString( "shop-basic-operator:unit-test: --> FAILED" );
    $sym181$SHOP_BASIC_OPERATOR_UNIT_TEST_METHOD = makeSymbol( "SHOP-BASIC-OPERATOR-UNIT-TEST-METHOD" );
    $sym182$SHOP_BASIC_METHOD = makeSymbol( "SHOP-BASIC-METHOD" );
    $list183 = ConsesLow.list( makeSymbol( "SHOP-METHOD" ) );
    $list184 = ConsesLow.list( ConsesLow.list( makeSymbol( "PRECONDITION" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DECOMPOSITION" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PROTECTED" ) ) );
    $sym185$DECOMPOSITION = makeSymbol( "DECOMPOSITION" );
    $sym186$PRECONDITION = makeSymbol( "PRECONDITION" );
    $sym187$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_METHOD_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-METHOD-CLASS" );
    $sym188$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_METHOD_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-METHOD-INSTANCE" );
    $list189 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "SELF" ) ), ConsesLow.list(
        makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "#<METHOD-~S:~S>" ), makeSymbol( "INSTANCE-NUMBER" ), makeSymbol( "HEAD" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ),
            makeString( "#<Malformed Instance>" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym190$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD" );
    $str191$__METHOD__S__S_ = makeString( "#<METHOD-~S:~S>" );
    $sym192$SHOP_BASIC_METHOD_PRINT_METHOD = makeSymbol( "SHOP-BASIC-METHOD-PRINT-METHOD" );
    $list193 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Precondition: " ) ), ConsesLow.list( makeSymbol( "CB-FORM" ), makeSymbol( "PRECONDITION" ) ), ConsesLow.list(
        makeSymbol( "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Decomposition: " ) ), ConsesLow.list( makeSymbol( "CB-FORM" ), makeSymbol( "DECOMPOSITION" ) ), ConsesLow.list( makeSymbol(
            "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol( "HTML-FORMAT" ), makeString( "Assertions: " ) ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CB-FORM" ) ),
                makeSymbol( "ASSERTION-LIST" ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "RET" ), NIL )
    } );
    $sym194$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD" );
    $str195$Precondition__ = makeString( "Precondition: " );
    $str196$Decomposition__ = makeString( "Decomposition: " );
    $str197$Assertions__ = makeString( "Assertions: " );
    $sym198$SHOP_BASIC_METHOD_HTML_DISPLAY_METHOD = makeSymbol( "SHOP-BASIC-METHOD-HTML-DISPLAY-METHOD" );
    $list199 = ConsesLow.list( makeSymbol( "NEW-ASSERTION" ), makeSymbol( "NEW-HEAD" ), makeSymbol( "NEW-PRECONDITION" ), makeSymbol( "NEW-DECOMPOSITION" ) );
    $list200 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ASSERTION-LIST" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "NEW-ASSERTION" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
        makeSymbol( "HEAD" ), makeSymbol( "NEW-HEAD" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PRECONDITION" ), makeSymbol( "NEW-PRECONDITION" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
            "DECOMPOSITION" ), makeSymbol( "NEW-DECOMPOSITION" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym201$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD" );
    $sym202$SHOP_BASIC_METHOD_INIT_METHOD = makeSymbol( "SHOP-BASIC-METHOD-INIT-METHOD" );
    $sym203$SET_DECOMPOSITION = makeSymbol( "SET-DECOMPOSITION" );
    $list204 = ConsesLow.list( makeSymbol( "DECOMP" ) );
    $list205 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DECOMPOSITION" ), makeSymbol( "DECOMP" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DECOMPOSITION" ) ) );
    $sym206$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD" );
    $sym207$SHOP_BASIC_METHOD_SET_DECOMPOSITION_METHOD = makeSymbol( "SHOP-BASIC-METHOD-SET-DECOMPOSITION-METHOD" );
    $sym208$GET_DECOMPOSITION = makeSymbol( "GET-DECOMPOSITION" );
    $list209 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DECOMPOSITION" ) ) );
    $sym210$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD" );
    $sym211$SHOP_BASIC_METHOD_GET_DECOMPOSITION_METHOD = makeSymbol( "SHOP-BASIC-METHOD-GET-DECOMPOSITION-METHOD" );
    $sym212$GET_PRECONDITION = makeSymbol( "GET-PRECONDITION" );
    $list213 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PRECONDITION" ) ) );
    $sym214$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD" );
    $sym215$SHOP_BASIC_METHOD_GET_PRECONDITION_METHOD = makeSymbol( "SHOP-BASIC-METHOD-GET-PRECONDITION-METHOD" );
    $sym216$UNIFY_TASK_TO_HEAD_WITH_DATA = makeSymbol( "UNIFY-TASK-TO-HEAD-WITH-DATA" );
    $list217 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TASK-UNIFIER" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol(
        "UNIFY-TASK-TO-HEAD" ), makeSymbol( "SHOP-BASIC-PLANNER-RULE" ) ), makeSymbol( "SELF" ), makeSymbol( "TASK" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TASK-UNIFIER" ), ConsesLow.list(
            makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "TASK-UNIFIER" ), ConsesLow.list( makeSymbol( "SHOP-APPLY-SUBSTITUTION" ), makeSymbol( "PRECONDITION" ), makeSymbol( "TASK-UNIFIER" ) ),
                ConsesLow.list( makeSymbol( "SHOP-APPLY-SUBSTITUTION" ), makeSymbol( "DECOMPOSITION" ), makeSymbol( "TASK-UNIFIER" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym218$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD" );
    $sym219$SHOP_BASIC_METHOD_UNIFY_TASK_TO_HEAD_WITH_DATA_METHOD = makeSymbol( "SHOP-BASIC-METHOD-UNIFY-TASK-TO-HEAD-WITH-DATA-METHOD" );
    $sym220$ADD_LITERALS_TO_PRECONDITION = makeSymbol( "ADD-LITERALS-TO-PRECONDITION" );
    $list221 = ConsesLow.list( makeString( "@param LITS listp ;; of literals\n   @return listp ;; of hl-formula-p" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PRECONDITION" ), ConsesLow.list( makeSymbol(
        "UNION" ), makeSymbol( "PRECONDITION" ), makeSymbol( "LITS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PRECONDITION" ) ) );
    $sym222$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD" );
    $sym223$SHOP_BASIC_METHOD_ADD_LITERALS_TO_PRECONDITION_METHOD = makeSymbol( "SHOP-BASIC-METHOD-ADD-LITERALS-TO-PRECONDITION-METHOD" );
    $sym224$SHOP_BASIC_SUFFICIENCY_COND = makeSymbol( "SHOP-BASIC-SUFFICIENCY-COND" );
    $list225 = ConsesLow.list( makeSymbol( "SHOP-SUFFICIENCY-CONDITION" ) );
    $list226 = ConsesLow.list( ConsesLow.list( makeSymbol( "CONDITION-FORMULA" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ) );
    $sym227$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_SUFFICIENCY_COND_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-SUFFICIENCY-COND-CLASS" );
    $sym228$CONDITION_FORMULA = makeSymbol( "CONDITION-FORMULA" );
    $sym229$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_SUFFICIENCY_COND_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-SUFFICIENCY-COND-INSTANCE" );
    $list230 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "SELF" ) ), ConsesLow.list(
        makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "#<Shop-Scond-~S:~S>" ), makeSymbol( "INSTANCE-NUMBER" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol(
            "QUOTE" ), makeSymbol( "PRED" ) ) ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "#<Malformed Instance>" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym231$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-SUFFICIENCY-COND-METHOD" );
    $str232$__Shop_Scond__S__S_ = makeString( "#<Shop-Scond-~S:~S>" );
    $sym233$SHOP_BASIC_SUFFICIENCY_COND_PRINT_METHOD = makeSymbol( "SHOP-BASIC-SUFFICIENCY-COND-PRINT-METHOD" );
    $list234 = ConsesLow.list( ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Condition: " ) ), ConsesLow.list( makeSymbol( "CB-FORM" ), makeSymbol( "CONDITION-FORMULA" ) ), ConsesLow.list( makeSymbol(
        "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol( "HTML-PRINC" ), makeString( "Assertions: " ) ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CB-FORM" ) ),
            makeSymbol( "ASSERTION-LIST" ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym235$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-SUFFICIENCY-COND-METHOD" );
    $sym236$SHOP_BASIC_SUFFICIENCY_COND_HTML_DISPLAY_METHOD = makeSymbol( "SHOP-BASIC-SUFFICIENCY-COND-HTML-DISPLAY-METHOD" );
    $sym237$COND_FORMULA = makeSymbol( "COND-FORMULA" );
    $list238 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CONDITION-FORMULA" ) ) );
    $sym239$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-SUFFICIENCY-COND-METHOD" );
    $sym240$SHOP_BASIC_SUFFICIENCY_COND_COND_FORMULA_METHOD = makeSymbol( "SHOP-BASIC-SUFFICIENCY-COND-COND-FORMULA-METHOD" );
    $sym241$SET_COND_FORMULA = makeSymbol( "SET-COND-FORMULA" );
    $list242 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CONDITION-FORMULA" ), makeSymbol( "FORM" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "CONDITION-FORMULA" ) ) );
    $sym243$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-SUFFICIENCY-COND-METHOD" );
    $sym244$SHOP_BASIC_SUFFICIENCY_COND_SET_COND_FORMULA_METHOD = makeSymbol( "SHOP-BASIC-SUFFICIENCY-COND-SET-COND-FORMULA-METHOD" );
    $list245 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TASK-UNIFIER" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol(
        "UNIFY-TASK-TO-HEAD" ), makeSymbol( "SHOP-BASIC-PLANNER-RULE" ) ), makeSymbol( "SELF" ), makeSymbol( "TASK" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "TASK-UNIFIER" ), ConsesLow.list(
            makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "TASK-UNIFIER" ), ConsesLow.list( makeSymbol( "SHOP-APPLY-SUBSTITUTION" ), makeSymbol( "CONDITION-FORMULA" ), makeSymbol(
                "TASK-UNIFIER" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym246$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-SUFFICIENCY-COND-METHOD" );
    $sym247$SHOP_BASIC_SUFFICIENCY_COND_UNIFY_TASK_TO_HEAD_WITH_DATA_METHOD = makeSymbol( "SHOP-BASIC-SUFFICIENCY-COND-UNIFY-TASK-TO-HEAD-WITH-DATA-METHOD" );
    $sym248$SHOP_PRECONDITION = makeSymbol( "SHOP-PRECONDITION" );
    $sym249$SHOP_BASIC_PRECONDITION = makeSymbol( "SHOP-BASIC-PRECONDITION" );
    $list250 = ConsesLow.list( makeSymbol( "SHOP-PRECONDITION" ) );
    $sym251$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PRECONDITION_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PRECONDITION-CLASS" );
    $sym252$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PRECONDITION_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PRECONDITION-INSTANCE" );
    $list253 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "SELF" ) ), ConsesLow.list(
        makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "#<SHOP-PRECOND-~S:~S>" ), makeSymbol( "INSTANCE-NUMBER" ), makeSymbol( "HEAD" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ),
            makeString( "#<Malformed Instance>" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym254$OUTER_CATCH_FOR_SHOP_BASIC_PRECONDITION_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PRECONDITION-METHOD" );
    $str255$__SHOP_PRECOND__S__S_ = makeString( "#<SHOP-PRECOND-~S:~S>" );
    $sym256$SHOP_BASIC_PRECONDITION_PRINT_METHOD = makeSymbol( "SHOP-BASIC-PRECONDITION-PRINT-METHOD" );
    $sym257$SHOP_BASIC_PROBLEM = makeSymbol( "SHOP-BASIC-PROBLEM" );
    $list258 = ConsesLow.list( makeSymbol( "SHOP-PROBLEM" ) );
    $list259 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DOMAIN" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ),
        ConsesLow.list( makeSymbol( "TASK-MT" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "TASKS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list(
            makeSymbol( "STATE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ) );
    $sym260$STATE = makeSymbol( "STATE" );
    $sym261$TASKS = makeSymbol( "TASKS" );
    $sym262$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PROBLEM_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PROBLEM-CLASS" );
    $sym263$NAME = makeSymbol( "NAME" );
    $sym264$DOMAIN = makeSymbol( "DOMAIN" );
    $sym265$TASK_MT = makeSymbol( "TASK-MT" );
    $sym266$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PROBLEM_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PROBLEM-INSTANCE" );
    $list267 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NAME" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
        "DOMAIN" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TASK-MT" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TASKS" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
            "STATE" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym268$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD" );
    $sym269$SHOP_BASIC_PROBLEM_INITIALIZE_METHOD = makeSymbol( "SHOP-BASIC-PROBLEM-INITIALIZE-METHOD" );
    $sym270$INITIALIZE_PROBLEM = makeSymbol( "INITIALIZE-PROBLEM" );
    $list271 = ConsesLow.list( makeSymbol( "NEW-NAME" ), makeSymbol( "NEW-DOMAIN" ), makeSymbol( "NEW-STATE" ), makeSymbol( "NEW-TASKS" ), makeSymbol( "NEW-MT" ) );
    $list272 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DOMAIN" ), makeSymbol( "NEW-DOMAIN" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NAME" ), makeSymbol( "NEW-NAME" ) ),
        ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "STATE" ), makeSymbol( "NEW-STATE" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TASKS" ), makeSymbol( "NEW-TASKS" ) ), ConsesLow.list( makeSymbol(
            "CSETQ" ), makeSymbol( "TASK-MT" ), makeSymbol( "NEW-MT" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym273$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD" );
    $sym274$SHOP_BASIC_PROBLEM_INITIALIZE_PROBLEM_METHOD = makeSymbol( "SHOP-BASIC-PROBLEM-INITIALIZE-PROBLEM-METHOD" );
    $list275 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "SELF" ) ), ConsesLow.list(
        makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "#<PROBLEM-~S:~S>" ), makeSymbol( "INSTANCE-NUMBER" ), makeSymbol( "NAME" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ),
            makeString( "#<Malformed Instance>" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym276$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD" );
    $str277$__PROBLEM__S__S_ = makeString( "#<PROBLEM-~S:~S>" );
    $sym278$SHOP_BASIC_PROBLEM_PRINT_METHOD = makeSymbol( "SHOP-BASIC-PROBLEM-PRINT-METHOD" );
    $sym279$SET_NAME = makeSymbol( "SET-NAME" );
    $list280 = ConsesLow.list( makeSymbol( "N" ) );
    $list281 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NAME" ), makeSymbol( "N" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "N" ) ) );
    $sym282$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD" );
    $sym283$SHOP_BASIC_PROBLEM_SET_NAME_METHOD = makeSymbol( "SHOP-BASIC-PROBLEM-SET-NAME-METHOD" );
    $sym284$GET_NAME = makeSymbol( "GET-NAME" );
    $list285 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NAME" ) ) );
    $sym286$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD" );
    $sym287$SHOP_BASIC_PROBLEM_GET_NAME_METHOD = makeSymbol( "SHOP-BASIC-PROBLEM-GET-NAME-METHOD" );
    $sym288$SET_DOMAIN = makeSymbol( "SET-DOMAIN" );
    $list289 = ConsesLow.list( makeSymbol( "D" ) );
    $list290 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DOMAIN" ), makeSymbol( "D" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "D" ) ) );
    $sym291$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD" );
    $sym292$SHOP_BASIC_PROBLEM_SET_DOMAIN_METHOD = makeSymbol( "SHOP-BASIC-PROBLEM-SET-DOMAIN-METHOD" );
    $sym293$GET_DOMAIN = makeSymbol( "GET-DOMAIN" );
    $list294 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DOMAIN" ) ) );
    $sym295$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD" );
    $sym296$SHOP_BASIC_PROBLEM_GET_DOMAIN_METHOD = makeSymbol( "SHOP-BASIC-PROBLEM-GET-DOMAIN-METHOD" );
    $sym297$GET_METHODS = makeSymbol( "GET-METHODS" );
    $list298 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DOMAIN" ), ConsesLow.list( makeSymbol( "GET-DOMAIN" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list(
        makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "DOMAIN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "METHODS" ) ) ) ) ) );
    $sym299$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD" );
    $sym300$METHODS = makeSymbol( "METHODS" );
    $sym301$SHOP_BASIC_PROBLEM_GET_METHODS_METHOD = makeSymbol( "SHOP-BASIC-PROBLEM-GET-METHODS-METHOD" );
    $sym302$GET_OPERATORS = makeSymbol( "GET-OPERATORS" );
    $list303 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DOMAIN" ), ConsesLow.list( makeSymbol( "GET-DOMAIN" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list(
        makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "DOMAIN" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "OPERATORS" ) ) ) ) ) );
    $sym304$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD" );
    $sym305$OPERATORS = makeSymbol( "OPERATORS" );
    $sym306$SHOP_BASIC_PROBLEM_GET_OPERATORS_METHOD = makeSymbol( "SHOP-BASIC-PROBLEM-GET-OPERATORS-METHOD" );
    $sym307$GET_TASKS = makeSymbol( "GET-TASKS" );
    $list308 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TASKS" ) ) );
    $sym309$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD" );
    $sym310$SHOP_BASIC_PROBLEM_GET_TASKS_METHOD = makeSymbol( "SHOP-BASIC-PROBLEM-GET-TASKS-METHOD" );
    $sym311$SET_TASKS = makeSymbol( "SET-TASKS" );
    $list312 = ConsesLow.list( makeSymbol( "TS" ) );
    $list313 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TASKS" ), makeSymbol( "TS" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TS" ) ) );
    $sym314$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD" );
    $sym315$SHOP_BASIC_PROBLEM_SET_TASKS_METHOD = makeSymbol( "SHOP-BASIC-PROBLEM-SET-TASKS-METHOD" );
    $sym316$GET_STATE = makeSymbol( "GET-STATE" );
    $list317 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "STATE" ) ) );
    $sym318$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD" );
    $sym319$SHOP_BASIC_PROBLEM_GET_STATE_METHOD = makeSymbol( "SHOP-BASIC-PROBLEM-GET-STATE-METHOD" );
    $sym320$SET_STATE = makeSymbol( "SET-STATE" );
    $list321 = ConsesLow.list( makeSymbol( "S" ) );
    $list322 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "STATE" ) ), makeSymbol( "S" ) ) ) );
    $sym323$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD" );
    $sym324$SHOP_BASIC_PROBLEM_SET_STATE_METHOD = makeSymbol( "SHOP-BASIC-PROBLEM-SET-STATE-METHOD" );
    $str325$SHOP_Category = makeString( "SHOP Category" );
    $str326$SHOP = makeString( "SHOP" );
    $list327 = ConsesLow.list( makeString( "SHOP Category" ) );
  }
}
/*
 * 
 * Total time: 1169 ms
 * 
 */