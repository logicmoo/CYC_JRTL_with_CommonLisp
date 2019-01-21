package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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

public final class shop_datastructures extends SubLTranslatedFile
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
    public static SubLObject get_shop_indexed_object_instance_index(final SubLObject shop_indexed_object) {
        final SubLObject v_class = (SubLObject)(shop_indexed_object.isSymbol() ? classes.classes_retrieve_class(shop_indexed_object) : ((shop_datastructures.NIL != subloop_structures.class_p(shop_indexed_object)) ? shop_indexed_object : ((shop_datastructures.NIL != subloop_structures.instance_p(shop_indexed_object)) ? subloop_structures.instance_class(shop_indexed_object) : shop_datastructures.NIL)));
        if (shop_datastructures.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)shop_datastructures.$sym3$INSTANCE_INDEX, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.aref(subloop_structures.class_any_slots(v_class), (SubLObject)shop_datastructures.ONE_INTEGER);
        }
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 791L)
    public static SubLObject set_shop_indexed_object_instance_index(final SubLObject shop_indexed_object, final SubLObject value) {
        final SubLObject v_class = (SubLObject)(shop_indexed_object.isSymbol() ? classes.classes_retrieve_class(shop_indexed_object) : ((shop_datastructures.NIL != subloop_structures.class_p(shop_indexed_object)) ? shop_indexed_object : ((shop_datastructures.NIL != subloop_structures.instance_p(shop_indexed_object)) ? subloop_structures.instance_class(shop_indexed_object) : shop_datastructures.NIL)));
        if (shop_datastructures.NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc((SubLObject)shop_datastructures.$sym3$INSTANCE_INDEX, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return Vectors.set_aref(subloop_structures.class_any_slots(v_class), (SubLObject)shop_datastructures.ONE_INTEGER, value);
        }
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 791L)
    public static SubLObject subloop_reserved_initialize_shop_indexed_object_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym4$INSTANCE_COUNT, (SubLObject)shop_datastructures.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym0$SHOP_INDEXED_OBJECT, (SubLObject)shop_datastructures.$sym3$INSTANCE_INDEX, (SubLObject)shop_datastructures.NIL);
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 791L)
    public static SubLObject subloop_reserved_initialize_shop_indexed_object_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym6$ISOLATED_P, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym7$INSTANCE_NUMBER, (SubLObject)shop_datastructures.NIL);
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 791L)
    public static SubLObject shop_indexed_object_p(final SubLObject shop_indexed_object) {
        return classes.subloop_instanceof_class(shop_indexed_object, (SubLObject)shop_datastructures.$sym0$SHOP_INDEXED_OBJECT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 1109L)
    public static SubLObject shop_indexed_object_find_instance_method(final SubLObject self, final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_indexed_object_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject instance_index = get_shop_indexed_object_instance_index(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym13$OUTER_CATCH_FOR_SHOP_INDEXED_OBJECT_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym13$OUTER_CATCH_FOR_SHOP_INDEXED_OBJECT_METHOD, dictionary.dictionary_lookup(instance_index, id, (SubLObject)shop_datastructures.NIL));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_indexed_object_instance_index(self, instance_index);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_indexed_object_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym13$OUTER_CATCH_FOR_SHOP_INDEXED_OBJECT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_indexed_object_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 1313L)
    public static SubLObject shop_indexed_object_add_to_index_method(final SubLObject self) {
        final SubLObject instance_number = object.get_object_instance_number(self);
        SubLObject instance_index = get_shop_indexed_object_instance_index(self);
        if (shop_datastructures.NIL == instance_index) {
            set_shop_indexed_object_instance_index(self, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)shop_datastructures.EQ), (SubLObject)shop_datastructures.TEN_INTEGER));
            instance_index = get_shop_indexed_object_instance_index(self);
        }
        dictionary.dictionary_enter(instance_index, instance_number, self);
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 1798L)
    public static SubLObject shop_indexed_object_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        object.object_initialize_method(self);
        if (shop_datastructures.NIL != shop_parameters.$shop_object_indexingP$.getDynamicValue(thread)) {
            shop_indexed_object_add_to_index_method(self);
        }
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 1996L)
    public static SubLObject shop_problem_p(final SubLObject shop_problem) {
        return interfaces.subloop_instanceof_interface(shop_problem, (SubLObject)shop_datastructures.$sym23$SHOP_PROBLEM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 2651L)
    public static SubLObject shop_planner_rule_p(final SubLObject shop_planner_rule) {
        return interfaces.subloop_instanceof_interface(shop_planner_rule, (SubLObject)shop_datastructures.$sym25$SHOP_PLANNER_RULE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 3072L)
    public static SubLObject shop_operator_p(final SubLObject shop_operator) {
        return interfaces.subloop_instanceof_interface(shop_operator, (SubLObject)shop_datastructures.$sym27$SHOP_OPERATOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 3342L)
    public static SubLObject shop_sufficiency_condition_p(final SubLObject shop_sufficiency_condition) {
        return interfaces.subloop_instanceof_interface(shop_sufficiency_condition, (SubLObject)shop_datastructures.$sym30$SHOP_SUFFICIENCY_CONDITION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 3721L)
    public static SubLObject shop_method_p(final SubLObject shop_method) {
        return interfaces.subloop_instanceof_interface(shop_method, (SubLObject)shop_datastructures.$sym32$SHOP_METHOD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 3987L)
    public static SubLObject shop_my_union(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject set1 = (SubLObject)shop_datastructures.NIL;
        SubLObject set2 = (SubLObject)shop_datastructures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_datastructures.$list34);
        set1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_datastructures.$list34);
        set2 = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)shop_datastructures.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)shop_datastructures.NIL;
        SubLObject current_$1 = (SubLObject)shop_datastructures.NIL;
        while (shop_datastructures.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)shop_datastructures.$list34);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)shop_datastructures.$list34);
            if (shop_datastructures.NIL == conses_high.member(current_$1, (SubLObject)shop_datastructures.$list35, (SubLObject)shop_datastructures.UNPROVIDED, (SubLObject)shop_datastructures.UNPROVIDED)) {
                bad = (SubLObject)shop_datastructures.T;
            }
            if (current_$1 == shop_datastructures.$kw36$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (shop_datastructures.NIL != bad && shop_datastructures.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)shop_datastructures.$list34);
        }
        final SubLObject test_tail = cdestructuring_bind.property_list_member((SubLObject)shop_datastructures.$kw37$TEST, current);
        final SubLObject test = (SubLObject)((shop_datastructures.NIL != test_tail) ? conses_high.cadr(test_tail) : shop_datastructures.$list38);
        return (SubLObject)ConsesLow.list((SubLObject)shop_datastructures.$sym39$SHOP_MY_UNION_FUNC, set1, set2, test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 4319L)
    public static SubLObject shop_my_union_func(final SubLObject set1, SubLObject set2, final SubLObject test) {
        SubLObject cdolist_list_var = set1;
        SubLObject x = (SubLObject)shop_datastructures.NIL;
        x = cdolist_list_var.first();
        while (shop_datastructures.NIL != cdolist_list_var) {
            final SubLObject item_var = x;
            if (shop_datastructures.NIL == conses_high.member(item_var, set2, test, Symbols.symbol_function((SubLObject)shop_datastructures.IDENTITY))) {
                set2 = (SubLObject)ConsesLow.cons(item_var, set2);
            }
            cdolist_list_var = cdolist_list_var.rest();
            x = cdolist_list_var.first();
        }
        return set2;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 4436L)
    public static SubLObject shop_same_set_p(final SubLObject x, final SubLObject y) {
        return (SubLObject)SubLObjectFactory.makeBoolean(shop_datastructures.NIL != conses_high.subsetp(x, y, Symbols.symbol_function((SubLObject)shop_datastructures.EQUAL), (SubLObject)shop_datastructures.UNPROVIDED) && shop_datastructures.NIL != conses_high.subsetp(y, x, Symbols.symbol_function((SubLObject)shop_datastructures.EQUAL), (SubLObject)shop_datastructures.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 4606L)
    public static SubLObject shop_variablep(final SubLObject x) {
        return (SubLObject)SubLObjectFactory.makeBoolean(shop_datastructures.NIL != variables.variable_p(x) || shop_datastructures.NIL != cycl_grammar.el_variable_p(x));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 4862L)
    public static SubLObject shop_extract_variables(final SubLObject expr) {
        if (shop_datastructures.NIL != shop_variablep(expr)) {
            return (SubLObject)ConsesLow.list(expr);
        }
        if (expr.isCons()) {
            return shop_my_union_func(shop_extract_variables(expr.first()), shop_extract_variables(expr.rest()), Symbols.symbol_function((SubLObject)shop_datastructures.EQL));
        }
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 5341L)
    public static SubLObject shop_empty_bindingP(final SubLObject v_bindings) {
        return Equality.eq(v_bindings, shop_datastructures.$shop_empty_unifier$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 5435L)
    public static SubLObject shop_unify_failedP(final SubLObject v_bindings) {
        return Equality.eq(v_bindings, shop_datastructures.$shop_unify_failed$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 5527L)
    public static SubLObject shop_apply_substitution(final SubLObject target, final SubLObject a_list) {
        if (shop_datastructures.NIL == a_list) {
            return target;
        }
        if (shop_datastructures.NIL == target) {
            return (SubLObject)shop_datastructures.NIL;
        }
        if (shop_datastructures.NIL != shop_variablep(target)) {
            final SubLObject result = conses_high.assoc(target, a_list, (SubLObject)shop_datastructures.UNPROVIDED, (SubLObject)shop_datastructures.UNPROVIDED);
            if (shop_datastructures.NIL != result) {
                return result.rest();
            }
            return target;
        }
        else {
            if (target.isAtom()) {
                return target;
            }
            return (SubLObject)ConsesLow.cons(shop_apply_substitution(target.first(), a_list), shop_apply_substitution(target.rest(), a_list));
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 6309L)
    public static SubLObject shop_compose_substitutions_test(final SubLObject x, final SubLObject y) {
        return Equality.equal(x.first(), y.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 6403L)
    public static SubLObject shop_compose_substitutions(SubLObject sub1, final SubLObject sub2) {
        SubLObject cdolist_list_var = sub1;
        SubLObject pair = (SubLObject)shop_datastructures.NIL;
        pair = cdolist_list_var.first();
        while (shop_datastructures.NIL != cdolist_list_var) {
            ConsesLow.rplacd(pair, shop_apply_substitution(pair.rest(), sub2));
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        cdolist_list_var = sub2;
        pair = (SubLObject)shop_datastructures.NIL;
        pair = cdolist_list_var.first();
        while (shop_datastructures.NIL != cdolist_list_var) {
            final SubLObject item_var = pair;
            if (shop_datastructures.NIL == conses_high.member(item_var, sub1, Symbols.symbol_function((SubLObject)shop_datastructures.$sym41$SHOP_COMPOSE_SUBSTITUTIONS_TEST), Symbols.symbol_function((SubLObject)shop_datastructures.IDENTITY))) {
                sub1 = (SubLObject)ConsesLow.cons(item_var, sub1);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return sub1;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 6822L)
    public static SubLObject shop_unify(final SubLObject e1, final SubLObject e2) {
        if (shop_datastructures.NIL != shop_variablep(e1)) {
            if (e1.eql(e2)) {
                return (SubLObject)shop_datastructures.NIL;
            }
            return (SubLObject)((shop_datastructures.NIL != shop_occurs(e1, e2)) ? shop_datastructures.$shop_unify_failed$.getGlobalValue() : ConsesLow.list((SubLObject)ConsesLow.cons(e1, e2)));
        }
        else {
            if (shop_datastructures.NIL != nart_handles.nart_p(e1) || shop_datastructures.NIL != nart_handles.nart_p(e2)) {
                final SubLObject form1 = (shop_datastructures.NIL != nart_handles.nart_p(e1)) ? narts_high.nart_el_formula(e1) : e1;
                final SubLObject form2 = (shop_datastructures.NIL != nart_handles.nart_p(e2)) ? narts_high.nart_el_formula(e2) : e2;
                return shop_unify(form1, form2);
            }
            if (e1.isAtom()) {
                if (e1.equal(e2)) {
                    return (SubLObject)shop_datastructures.NIL;
                }
                if (shop_datastructures.NIL != shop_variablep(e2)) {
                    return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(e2, e1));
                }
                return shop_datastructures.$shop_unify_failed$.getGlobalValue();
            }
            else {
                if (shop_datastructures.NIL == e2) {
                    return shop_datastructures.$shop_unify_failed$.getGlobalValue();
                }
                if (!e2.isCons()) {
                    return shop_datastructures.$shop_unify_failed$.getGlobalValue();
                }
                final SubLObject first_e1 = e1.first();
                final SubLObject first_e2 = (SubLObject)(e2.isCons() ? e2.first() : shop_datastructures.NIL);
                SubLObject hsub = (SubLObject)shop_datastructures.NIL;
                hsub = (SubLObject)((shop_datastructures.NIL != first_e1 || shop_datastructures.NIL != first_e2) ? shop_unify(first_e1, first_e2) : shop_datastructures.NIL);
                if (shop_datastructures.NIL != shop_unify_failedP(hsub)) {
                    return shop_datastructures.$shop_unify_failed$.getGlobalValue();
                }
                final SubLObject tail1 = shop_apply_substitution(e1.rest(), hsub);
                final SubLObject tail2 = shop_apply_substitution(e2.rest(), hsub);
                SubLObject tsub = (SubLObject)shop_datastructures.NIL;
                tsub = (SubLObject)((shop_datastructures.NIL != tail1 || shop_datastructures.NIL != tail2) ? shop_unify(tail1, tail2) : shop_datastructures.NIL);
                if (shop_datastructures.NIL != shop_unify_failedP(tsub)) {
                    return shop_datastructures.$shop_unify_failed$.getGlobalValue();
                }
                return shop_compose_substitutions(hsub, tsub);
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 8534L)
    public static SubLObject shop_occurs(final SubLObject v, final SubLObject expr) {
        return (SubLObject)(expr.isAtom() ? Equality.eq(v, expr) : SubLObjectFactory.makeBoolean(shop_datastructures.NIL != shop_occurs(v, expr.first()) || shop_datastructures.NIL != shop_occurs(v, expr.rest())));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 8769L)
    public static SubLObject shop_standardizer_gensym(final SubLObject x) {
        return (SubLObject)ConsesLow.cons(x, Symbols.gensym((SubLObject)shop_datastructures.$str42$_));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 8849L)
    public static SubLObject shop_standardizer(final SubLObject expression) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)shop_datastructures.$sym43$SHOP_STANDARDIZER_GENSYM), shop_extract_variables(expression));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 9103L)
    public static SubLObject shop_spec_formulaP(final SubLObject spec_form, final SubLObject form) {
        final SubLObject mgu = shop_unify(spec_form, form);
        if (mgu == shop_datastructures.$kw40$FAIL) {
            return (SubLObject)shop_datastructures.NIL;
        }
        final SubLObject new_genl_form = shop_apply_substitution(form, mgu);
        if (new_genl_form.equal(spec_form)) {
            return (SubLObject)shop_datastructures.T;
        }
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 9946L)
    public static SubLObject get_shop_basic_planner_rule_assertion_list(final SubLObject shop_basic_planner_rule) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_planner_rule, (SubLObject)shop_datastructures.TWO_INTEGER, (SubLObject)shop_datastructures.$sym47$ASSERTION_LIST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 9946L)
    public static SubLObject set_shop_basic_planner_rule_assertion_list(final SubLObject shop_basic_planner_rule, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_planner_rule, value, (SubLObject)shop_datastructures.TWO_INTEGER, (SubLObject)shop_datastructures.$sym47$ASSERTION_LIST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 9946L)
    public static SubLObject get_shop_basic_planner_rule_head(final SubLObject shop_basic_planner_rule) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_planner_rule, (SubLObject)shop_datastructures.ONE_INTEGER, (SubLObject)shop_datastructures.$sym48$HEAD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 9946L)
    public static SubLObject set_shop_basic_planner_rule_head(final SubLObject shop_basic_planner_rule, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_planner_rule, value, (SubLObject)shop_datastructures.ONE_INTEGER, (SubLObject)shop_datastructures.$sym48$HEAD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 9946L)
    public static SubLObject subloop_reserved_initialize_shop_basic_planner_rule_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym4$INSTANCE_COUNT, (SubLObject)shop_datastructures.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym0$SHOP_INDEXED_OBJECT, (SubLObject)shop_datastructures.$sym3$INSTANCE_INDEX, (SubLObject)shop_datastructures.NIL);
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 9946L)
    public static SubLObject subloop_reserved_initialize_shop_basic_planner_rule_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym6$ISOLATED_P, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym7$INSTANCE_NUMBER, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym48$HEAD, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym47$ASSERTION_LIST, (SubLObject)shop_datastructures.NIL);
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 9946L)
    public static SubLObject shop_basic_planner_rule_p(final SubLObject shop_basic_planner_rule) {
        return classes.subloop_instanceof_class(shop_basic_planner_rule, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 10253L)
    public static SubLObject shop_basic_planner_rule_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_rule_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject head = get_shop_basic_planner_rule_head(self);
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym54$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
            try {
                if (shop_datastructures.NIL != subloop_structures.instance_p(self)) {
                    PrintLow.format(stream, (SubLObject)shop_datastructures.$str55$__PLANNER_RULE__S__S_, instance_number, head);
                }
                else {
                    PrintLow.format(stream, (SubLObject)shop_datastructures.$str56$__Malformed_Instance_);
                }
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym54$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_rule_head(self, head);
                    object.set_object_instance_number(self, instance_number);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_rule_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym54$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_rule_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 10506L)
    public static SubLObject shop_basic_planner_rule_html_display_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        shop_basic_planner_rule_print_method(self, html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)shop_datastructures.NIL);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 10626L)
    public static SubLObject shop_basic_planner_rule_pred_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_rule_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject head = get_shop_basic_planner_rule_head(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD, cycl_utilities.formula_operator(head));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_rule_head(self, head);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_rule_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_rule_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 10724L)
    public static SubLObject shop_basic_planner_rule_head_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_rule_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject head = get_shop_basic_planner_rule_head(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym66$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym66$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD, head);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_rule_head(self, head);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_rule_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym66$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_rule_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 10803L)
    public static SubLObject shop_basic_planner_rule_set_head_method(final SubLObject self, final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_rule_method = (SubLObject)shop_datastructures.NIL;
        SubLObject head = get_shop_basic_planner_rule_head(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym71$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
            try {
                head = form;
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym71$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD, head);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_rule_head(self, head);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_rule_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym71$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_rule_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 10911L)
    public static SubLObject shop_basic_planner_rule_assertions_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_rule_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym75$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym75$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD, assertion_list);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_rule_assertion_list(self, assertion_list);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_rule_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym75$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_rule_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11006L)
    public static SubLObject shop_basic_planner_rule_set_assertions_method(final SubLObject self, final SubLObject assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_rule_method = (SubLObject)shop_datastructures.NIL;
        SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
            try {
                assertion_list = assertions;
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD, assertions);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_rule_assertion_list(self, assertion_list);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_rule_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_rule_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11147L)
    public static SubLObject shop_basic_planner_rule_unify_task_to_head_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_planner_rule_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject head = get_shop_basic_planner_rule_head(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
            try {
                assert shop_datastructures.NIL != Types.listp(task) : task;
                final SubLObject task_unifier = shop_unify(head, task);
                if (shop_datastructures.$kw40$FAIL != task_unifier) {
                    Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD, task_unifier);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_rule_head(self, head);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_planner_rule_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_planner_rule_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11427L)
    public static SubLObject shop_conditional_effect_p(final SubLObject shop_conditional_effect) {
        return interfaces.subloop_instanceof_interface(shop_conditional_effect, (SubLObject)shop_datastructures.$sym88$SHOP_CONDITIONAL_EFFECT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11958L)
    public static SubLObject get_shop_basic_conditional_effect_condition(final SubLObject shop_basic_conditional_effect) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_conditional_effect, (SubLObject)shop_datastructures.FIVE_INTEGER, (SubLObject)shop_datastructures.$sym93$CONDITION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11958L)
    public static SubLObject set_shop_basic_conditional_effect_condition(final SubLObject shop_basic_conditional_effect, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_conditional_effect, value, (SubLObject)shop_datastructures.FIVE_INTEGER, (SubLObject)shop_datastructures.$sym93$CONDITION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11958L)
    public static SubLObject get_shop_basic_conditional_effect_deletes(final SubLObject shop_basic_conditional_effect) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_conditional_effect, (SubLObject)shop_datastructures.FOUR_INTEGER, (SubLObject)shop_datastructures.$sym94$DELETES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11958L)
    public static SubLObject set_shop_basic_conditional_effect_deletes(final SubLObject shop_basic_conditional_effect, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_conditional_effect, value, (SubLObject)shop_datastructures.FOUR_INTEGER, (SubLObject)shop_datastructures.$sym94$DELETES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11958L)
    public static SubLObject get_shop_basic_conditional_effect_adds(final SubLObject shop_basic_conditional_effect) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_conditional_effect, (SubLObject)shop_datastructures.THREE_INTEGER, (SubLObject)shop_datastructures.$sym95$ADDS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11958L)
    public static SubLObject set_shop_basic_conditional_effect_adds(final SubLObject shop_basic_conditional_effect, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_conditional_effect, value, (SubLObject)shop_datastructures.THREE_INTEGER, (SubLObject)shop_datastructures.$sym95$ADDS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11958L)
    public static SubLObject subloop_reserved_initialize_shop_basic_conditional_effect_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym4$INSTANCE_COUNT, (SubLObject)shop_datastructures.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym0$SHOP_INDEXED_OBJECT, (SubLObject)shop_datastructures.$sym3$INSTANCE_INDEX, (SubLObject)shop_datastructures.NIL);
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11958L)
    public static SubLObject subloop_reserved_initialize_shop_basic_conditional_effect_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym6$ISOLATED_P, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym7$INSTANCE_NUMBER, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym48$HEAD, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym47$ASSERTION_LIST, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT, (SubLObject)shop_datastructures.$sym95$ADDS, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT, (SubLObject)shop_datastructures.$sym94$DELETES, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT, (SubLObject)shop_datastructures.$sym93$CONDITION, (SubLObject)shop_datastructures.NIL);
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 11958L)
    public static SubLObject shop_basic_conditional_effect_p(final SubLObject shop_basic_conditional_effect) {
        return classes.subloop_instanceof_class(shop_basic_conditional_effect, (SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 12186L)
    public static SubLObject shop_basic_conditional_effect_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_conditional_effect_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject head = get_shop_basic_planner_rule_head(self);
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym99$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
            try {
                if (shop_datastructures.NIL != subloop_structures.instance_p(self)) {
                    PrintLow.format(stream, (SubLObject)shop_datastructures.$str100$__COND_EFFECT__S__S_, instance_number, head);
                }
                else {
                    PrintLow.format(stream, (SubLObject)shop_datastructures.$str56$__Malformed_Instance_);
                }
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym99$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_rule_head(self, head);
                    object.set_object_instance_number(self, instance_number);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_conditional_effect_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym99$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_conditional_effect_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 12441L)
    public static SubLObject shop_basic_conditional_effect_html_display_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_conditional_effect_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject condition = get_shop_basic_conditional_effect_condition(self);
        final SubLObject deletes = get_shop_basic_conditional_effect_deletes(self);
        final SubLObject adds = get_shop_basic_conditional_effect_adds(self);
        final SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym103$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
            try {
                html_utilities.html_princ((SubLObject)shop_datastructures.$str104$Condition__);
                cb_utilities.cb_form(instances.get_slot(self, (SubLObject)shop_datastructures.$sym93$CONDITION), (SubLObject)shop_datastructures.UNPROVIDED, (SubLObject)shop_datastructures.UNPROVIDED);
                html_utilities.html_newline((SubLObject)shop_datastructures.UNPROVIDED);
                html_utilities.html_princ((SubLObject)shop_datastructures.$str105$Adds__);
                cb_utilities.cb_form(instances.get_slot(self, (SubLObject)shop_datastructures.$sym95$ADDS), (SubLObject)shop_datastructures.UNPROVIDED, (SubLObject)shop_datastructures.UNPROVIDED);
                html_utilities.html_newline((SubLObject)shop_datastructures.UNPROVIDED);
                html_utilities.html_princ((SubLObject)shop_datastructures.$str106$Deletes__);
                cb_utilities.cb_form(instances.get_slot(self, (SubLObject)shop_datastructures.$sym94$DELETES), (SubLObject)shop_datastructures.UNPROVIDED, (SubLObject)shop_datastructures.UNPROVIDED);
                html_utilities.html_newline((SubLObject)shop_datastructures.UNPROVIDED);
                html_utilities.html_princ((SubLObject)shop_datastructures.$str107$Assertion__);
                cb_utilities.cb_form(instances.get_slot(self, (SubLObject)shop_datastructures.$sym47$ASSERTION_LIST), (SubLObject)shop_datastructures.UNPROVIDED, (SubLObject)shop_datastructures.UNPROVIDED);
                html_utilities.html_newline((SubLObject)shop_datastructures.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym103$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD, (SubLObject)shop_datastructures.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_conditional_effect_condition(self, condition);
                    set_shop_basic_conditional_effect_deletes(self, deletes);
                    set_shop_basic_conditional_effect_adds(self, adds);
                    set_shop_basic_planner_rule_assertion_list(self, assertion_list);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_conditional_effect_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym103$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_conditional_effect_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 12864L)
    public static SubLObject shop_basic_conditional_effect_init_method(final SubLObject self, final SubLObject new_head, final SubLObject new_cond, final SubLObject new_adds, final SubLObject new_deletes, final SubLObject new_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_conditional_effect_method = (SubLObject)shop_datastructures.NIL;
        SubLObject condition = get_shop_basic_conditional_effect_condition(self);
        SubLObject deletes = get_shop_basic_conditional_effect_deletes(self);
        SubLObject adds = get_shop_basic_conditional_effect_adds(self);
        SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list(self);
        SubLObject head = get_shop_basic_planner_rule_head(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym112$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
            try {
                head = new_head;
                adds = new_adds;
                deletes = new_deletes;
                condition = new_cond;
                assertion_list = (SubLObject)ConsesLow.cons(new_assertion, assertion_list);
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym112$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD, (SubLObject)shop_datastructures.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_conditional_effect_condition(self, condition);
                    set_shop_basic_conditional_effect_deletes(self, deletes);
                    set_shop_basic_conditional_effect_adds(self, adds);
                    set_shop_basic_planner_rule_assertion_list(self, assertion_list);
                    set_shop_basic_planner_rule_head(self, head);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_conditional_effect_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym112$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_conditional_effect_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13250L)
    public static SubLObject shop_basic_conditional_effect_adds_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_conditional_effect_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject adds = get_shop_basic_conditional_effect_adds(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym115$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym115$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD, adds);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_conditional_effect_adds(self, adds);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_conditional_effect_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym115$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_conditional_effect_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13335L)
    public static SubLObject shop_basic_conditional_effect_deletes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_conditional_effect_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject deletes = get_shop_basic_conditional_effect_deletes(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym118$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym118$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD, deletes);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_conditional_effect_deletes(self, deletes);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_conditional_effect_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym118$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_conditional_effect_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13426L)
    public static SubLObject shop_basic_conditional_effect_condition_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_conditional_effect_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject condition = get_shop_basic_conditional_effect_condition(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym121$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym121$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD, condition);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_conditional_effect_condition(self, condition);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_conditional_effect_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym121$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_conditional_effect_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13521L)
    public static SubLObject shop_basic_conditional_effect_assertion_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_conditional_effect_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym124$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym124$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD, assertion_list);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_rule_assertion_list(self, assertion_list);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_conditional_effect_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym124$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_conditional_effect_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13621L)
    public static SubLObject get_shop_basic_operator_cost(final SubLObject shop_basic_operator) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_operator, (SubLObject)shop_datastructures.SIX_INTEGER, (SubLObject)shop_datastructures.$sym129$COST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13621L)
    public static SubLObject set_shop_basic_operator_cost(final SubLObject shop_basic_operator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_operator, value, (SubLObject)shop_datastructures.SIX_INTEGER, (SubLObject)shop_datastructures.$sym129$COST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13621L)
    public static SubLObject get_shop_basic_operator_conditional_effects(final SubLObject shop_basic_operator) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_operator, (SubLObject)shop_datastructures.FIVE_INTEGER, (SubLObject)shop_datastructures.$sym130$CONDITIONAL_EFFECTS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13621L)
    public static SubLObject set_shop_basic_operator_conditional_effects(final SubLObject shop_basic_operator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_operator, value, (SubLObject)shop_datastructures.FIVE_INTEGER, (SubLObject)shop_datastructures.$sym130$CONDITIONAL_EFFECTS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13621L)
    public static SubLObject get_shop_basic_operator_deletes(final SubLObject shop_basic_operator) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_operator, (SubLObject)shop_datastructures.FOUR_INTEGER, (SubLObject)shop_datastructures.$sym94$DELETES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13621L)
    public static SubLObject set_shop_basic_operator_deletes(final SubLObject shop_basic_operator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_operator, value, (SubLObject)shop_datastructures.FOUR_INTEGER, (SubLObject)shop_datastructures.$sym94$DELETES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13621L)
    public static SubLObject get_shop_basic_operator_adds(final SubLObject shop_basic_operator) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_operator, (SubLObject)shop_datastructures.THREE_INTEGER, (SubLObject)shop_datastructures.$sym95$ADDS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13621L)
    public static SubLObject set_shop_basic_operator_adds(final SubLObject shop_basic_operator, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_operator, value, (SubLObject)shop_datastructures.THREE_INTEGER, (SubLObject)shop_datastructures.$sym95$ADDS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13621L)
    public static SubLObject subloop_reserved_initialize_shop_basic_operator_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym4$INSTANCE_COUNT, (SubLObject)shop_datastructures.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym0$SHOP_INDEXED_OBJECT, (SubLObject)shop_datastructures.$sym3$INSTANCE_INDEX, (SubLObject)shop_datastructures.NIL);
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13621L)
    public static SubLObject subloop_reserved_initialize_shop_basic_operator_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym6$ISOLATED_P, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym7$INSTANCE_NUMBER, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym48$HEAD, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym47$ASSERTION_LIST, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$sym95$ADDS, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$sym94$DELETES, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$sym130$CONDITIONAL_EFFECTS, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$sym129$COST, (SubLObject)shop_datastructures.NIL);
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13621L)
    public static SubLObject shop_basic_operator_p(final SubLObject shop_basic_operator) {
        return classes.subloop_instanceof_class(shop_basic_operator, (SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 13992L)
    public static SubLObject shop_basic_operator_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_operator_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject head = get_shop_basic_planner_rule_head(self);
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym134$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
            try {
                if (shop_datastructures.NIL != subloop_structures.instance_p(self)) {
                    PrintLow.format(stream, (SubLObject)shop_datastructures.$str135$__OPERATOR__S__S_, instance_number, head);
                }
                else {
                    PrintLow.format(stream, (SubLObject)shop_datastructures.$str56$__Malformed_Instance_);
                }
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym134$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_rule_head(self, head);
                    object.set_object_instance_number(self, instance_number);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_operator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym134$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_operator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 14234L)
    public static SubLObject shop_basic_operator_html_display_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_operator_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject cost = get_shop_basic_operator_cost(self);
        final SubLObject deletes = get_shop_basic_operator_deletes(self);
        final SubLObject adds = get_shop_basic_operator_adds(self);
        final SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list(self);
        final SubLObject head = get_shop_basic_planner_rule_head(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym138$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
            try {
                final SubLObject add_literals = instances.get_slot(self, (SubLObject)shop_datastructures.$sym95$ADDS);
                final SubLObject delete_literals = instances.get_slot(self, (SubLObject)shop_datastructures.$sym94$DELETES);
                final SubLObject cost_$2 = get_shop_basic_operator_cost(self);
                html_utilities.html_princ((SubLObject)shop_datastructures.$str139$__Head_);
                cb_utilities.cb_form(head, (SubLObject)shop_datastructures.UNPROVIDED, (SubLObject)shop_datastructures.UNPROVIDED);
                html_utilities.html_newline((SubLObject)shop_datastructures.UNPROVIDED);
                html_utilities.html_princ((SubLObject)shop_datastructures.$str140$__Add_literals__);
                cb_utilities.cb_form(add_literals, (SubLObject)shop_datastructures.UNPROVIDED, (SubLObject)shop_datastructures.UNPROVIDED);
                html_utilities.html_newline((SubLObject)shop_datastructures.UNPROVIDED);
                html_utilities.html_princ((SubLObject)shop_datastructures.$str141$__Delete_literals__);
                cb_utilities.cb_form(delete_literals, (SubLObject)shop_datastructures.UNPROVIDED, (SubLObject)shop_datastructures.UNPROVIDED);
                html_utilities.html_newline((SubLObject)shop_datastructures.UNPROVIDED);
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)shop_datastructures.$str142$__Cost___S, cost_$2);
                html_utilities.html_newline((SubLObject)shop_datastructures.UNPROVIDED);
                html_utilities.html_princ((SubLObject)shop_datastructures.$str107$Assertion__);
                Mapping.mapcar((SubLObject)shop_datastructures.$sym143$CB_FORM, instances.get_slot(self, (SubLObject)shop_datastructures.$sym47$ASSERTION_LIST));
                html_utilities.html_newline((SubLObject)shop_datastructures.TWO_INTEGER);
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym138$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, (SubLObject)shop_datastructures.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_operator_cost(self, cost);
                    set_shop_basic_operator_deletes(self, deletes);
                    set_shop_basic_operator_adds(self, adds);
                    set_shop_basic_planner_rule_assertion_list(self, assertion_list);
                    set_shop_basic_planner_rule_head(self, head);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_operator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym138$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_operator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 14851L)
    public static SubLObject shop_basic_operator_init_method(final SubLObject self, final SubLObject new_assertion, final SubLObject new_head, final SubLObject new_adds, final SubLObject new_deletes) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_operator_method = (SubLObject)shop_datastructures.NIL;
        SubLObject cost = get_shop_basic_operator_cost(self);
        SubLObject deletes = get_shop_basic_operator_deletes(self);
        SubLObject adds = get_shop_basic_operator_adds(self);
        SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list(self);
        SubLObject head = get_shop_basic_planner_rule_head(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym147$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
            try {
                assertion_list = (SubLObject)ConsesLow.list(new_assertion);
                head = new_head;
                adds = new_adds;
                deletes = new_deletes;
                cost = (SubLObject)shop_datastructures.ONE_INTEGER;
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym147$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_operator_cost(self, cost);
                    set_shop_basic_operator_deletes(self, deletes);
                    set_shop_basic_operator_adds(self, adds);
                    set_shop_basic_planner_rule_assertion_list(self, assertion_list);
                    set_shop_basic_planner_rule_head(self, head);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_operator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym147$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_operator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 15356L)
    public static SubLObject shop_basic_operator_get_adds_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_operator_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject adds = get_shop_basic_operator_adds(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym151$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym151$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, adds);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_operator_adds(self, adds);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_operator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym151$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_operator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 15471L)
    public static SubLObject shop_basic_operator_add_literals_to_adds_method(final SubLObject self, final SubLObject lits) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_operator_method = (SubLObject)shop_datastructures.NIL;
        SubLObject adds = get_shop_basic_operator_adds(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym156$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
            try {
                adds = conses_high.union(adds, lits, Symbols.symbol_function((SubLObject)shop_datastructures.EQUAL), (SubLObject)shop_datastructures.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym156$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, adds);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_operator_adds(self, adds);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_operator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym156$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_operator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 15680L)
    public static SubLObject shop_basic_operator_get_deletes_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_operator_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject deletes = get_shop_basic_operator_deletes(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym160$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym160$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, deletes);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_operator_deletes(self, deletes);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_operator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym160$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_operator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 15802L)
    public static SubLObject shop_basic_operator_conditional_effects_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_operator_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject conditional_effects = get_shop_basic_operator_conditional_effects(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym163$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym163$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, conditional_effects);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_operator_conditional_effects(self, conditional_effects);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_operator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym163$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_operator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 15906L)
    public static SubLObject shop_basic_operator_add_literals_to_deletes_method(final SubLObject self, final SubLObject lits) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_operator_method = (SubLObject)shop_datastructures.NIL;
        SubLObject deletes = get_shop_basic_operator_deletes(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym167$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
            try {
                deletes = conses_high.union(deletes, lits, Symbols.symbol_function((SubLObject)shop_datastructures.EQUAL), (SubLObject)shop_datastructures.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym167$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD, deletes);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_operator_deletes(self, deletes);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_operator_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym167$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_operator_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 16126L)
    public static SubLObject shop_basic_operator_unit_test_method(final SubLObject self, final SubLObject verboseP) {
        final SubLObject test_op = object.object_new_method((SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR);
        final SubLObject add_list_1 = (SubLObject)shop_datastructures.$list173;
        final SubLObject add_list_2 = (SubLObject)shop_datastructures.$list174;
        final SubLObject delete_list_1 = (SubLObject)shop_datastructures.$list175;
        final SubLObject delete_list_2 = (SubLObject)shop_datastructures.$list176;
        methods.funcall_instance_method_with_1_args(test_op, (SubLObject)shop_datastructures.$sym153$ADD_LITERALS_TO_ADDS, add_list_1);
        methods.funcall_instance_method_with_1_args(test_op, (SubLObject)shop_datastructures.$sym153$ADD_LITERALS_TO_ADDS, add_list_2);
        methods.funcall_instance_method_with_1_args(test_op, (SubLObject)shop_datastructures.$sym165$ADD_LITERALS_TO_DELETES, delete_list_1);
        methods.funcall_instance_method_with_1_args(test_op, (SubLObject)shop_datastructures.$sym165$ADD_LITERALS_TO_DELETES, delete_list_2);
        final SubLObject op_adds = methods.funcall_instance_method_with_0_args(test_op, (SubLObject)shop_datastructures.$sym149$GET_ADDS);
        final SubLObject control_adds = conses_high.union(add_list_1, add_list_2, Symbols.symbol_function((SubLObject)shop_datastructures.EQUAL), (SubLObject)shop_datastructures.UNPROVIDED);
        final SubLObject op_deletes = methods.funcall_instance_method_with_0_args(test_op, (SubLObject)shop_datastructures.$sym158$GET_DELETES);
        final SubLObject control_deletes = conses_high.union(delete_list_1, delete_list_2, Symbols.symbol_function((SubLObject)shop_datastructures.EQUAL), (SubLObject)shop_datastructures.UNPROVIDED);
        if (shop_datastructures.NIL != verboseP) {
            PrintLow.format((SubLObject)shop_datastructures.T, (SubLObject)shop_datastructures.$str177$op_adds__s__control_adds__s__, op_adds, control_adds);
            PrintLow.format((SubLObject)shop_datastructures.T, (SubLObject)shop_datastructures.$str178$op_deletes__s__control_deletes__s, op_deletes, control_deletes);
        }
        if (shop_datastructures.NIL != conses_high.subsetp(control_adds, op_adds, (SubLObject)shop_datastructures.UNPROVIDED, (SubLObject)shop_datastructures.UNPROVIDED) && shop_datastructures.NIL != conses_high.subsetp(op_adds, control_adds, (SubLObject)shop_datastructures.UNPROVIDED, (SubLObject)shop_datastructures.UNPROVIDED) && shop_datastructures.NIL != conses_high.subsetp(control_deletes, op_deletes, (SubLObject)shop_datastructures.UNPROVIDED, (SubLObject)shop_datastructures.UNPROVIDED) && shop_datastructures.NIL != conses_high.subsetp(op_deletes, control_deletes, (SubLObject)shop_datastructures.UNPROVIDED, (SubLObject)shop_datastructures.UNPROVIDED)) {
            print_high.princ((SubLObject)shop_datastructures.$str179$shop_basic_operator_unit_test____, (SubLObject)shop_datastructures.UNPROVIDED);
            streams_high.terpri((SubLObject)shop_datastructures.UNPROVIDED);
            return (SubLObject)shop_datastructures.T;
        }
        print_high.princ((SubLObject)shop_datastructures.$str180$shop_basic_operator_unit_test____, (SubLObject)shop_datastructures.UNPROVIDED);
        streams_high.terpri((SubLObject)shop_datastructures.UNPROVIDED);
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 17527L)
    public static SubLObject get_shop_basic_method_decomposition(final SubLObject shop_basic_method) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_method, (SubLObject)shop_datastructures.FOUR_INTEGER, (SubLObject)shop_datastructures.$sym185$DECOMPOSITION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 17527L)
    public static SubLObject set_shop_basic_method_decomposition(final SubLObject shop_basic_method, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_method, value, (SubLObject)shop_datastructures.FOUR_INTEGER, (SubLObject)shop_datastructures.$sym185$DECOMPOSITION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 17527L)
    public static SubLObject get_shop_basic_method_precondition(final SubLObject shop_basic_method) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_method, (SubLObject)shop_datastructures.THREE_INTEGER, (SubLObject)shop_datastructures.$sym186$PRECONDITION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 17527L)
    public static SubLObject set_shop_basic_method_precondition(final SubLObject shop_basic_method, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_method, value, (SubLObject)shop_datastructures.THREE_INTEGER, (SubLObject)shop_datastructures.$sym186$PRECONDITION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 17527L)
    public static SubLObject subloop_reserved_initialize_shop_basic_method_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym4$INSTANCE_COUNT, (SubLObject)shop_datastructures.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym0$SHOP_INDEXED_OBJECT, (SubLObject)shop_datastructures.$sym3$INSTANCE_INDEX, (SubLObject)shop_datastructures.NIL);
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 17527L)
    public static SubLObject subloop_reserved_initialize_shop_basic_method_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym6$ISOLATED_P, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym7$INSTANCE_NUMBER, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym48$HEAD, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym47$ASSERTION_LIST, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$sym186$PRECONDITION, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$sym185$DECOMPOSITION, (SubLObject)shop_datastructures.NIL);
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 17527L)
    public static SubLObject shop_basic_method_p(final SubLObject shop_basic_method) {
        return classes.subloop_instanceof_class(shop_basic_method, (SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 17780L)
    public static SubLObject shop_basic_method_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_method_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject head = get_shop_basic_planner_rule_head(self);
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym190$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
            try {
                if (shop_datastructures.NIL != subloop_structures.instance_p(self)) {
                    PrintLow.format(stream, (SubLObject)shop_datastructures.$str191$__METHOD__S__S_, instance_number, head);
                }
                else {
                    PrintLow.format(stream, (SubLObject)shop_datastructures.$str56$__Malformed_Instance_);
                }
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym190$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_rule_head(self, head);
                    object.set_object_instance_number(self, instance_number);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_method_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym190$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_method_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 18010L)
    public static SubLObject shop_basic_method_html_display_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_method_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject decomposition = get_shop_basic_method_decomposition(self);
        final SubLObject precondition = get_shop_basic_method_precondition(self);
        final SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym194$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
            try {
                html_utilities.html_princ((SubLObject)shop_datastructures.$str195$Precondition__);
                cb_utilities.cb_form(precondition, (SubLObject)shop_datastructures.UNPROVIDED, (SubLObject)shop_datastructures.UNPROVIDED);
                html_utilities.html_newline((SubLObject)shop_datastructures.UNPROVIDED);
                html_utilities.html_princ((SubLObject)shop_datastructures.$str196$Decomposition__);
                cb_utilities.cb_form(decomposition, (SubLObject)shop_datastructures.UNPROVIDED, (SubLObject)shop_datastructures.UNPROVIDED);
                html_utilities.html_newline((SubLObject)shop_datastructures.UNPROVIDED);
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)shop_datastructures.$str197$Assertions__);
                Mapping.mapcar((SubLObject)shop_datastructures.$sym143$CB_FORM, assertion_list);
                html_utilities.html_newline((SubLObject)shop_datastructures.TWO_INTEGER);
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym194$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, (SubLObject)shop_datastructures.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_method_decomposition(self, decomposition);
                    set_shop_basic_method_precondition(self, precondition);
                    set_shop_basic_planner_rule_assertion_list(self, assertion_list);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_method_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym194$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_method_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 18327L)
    public static SubLObject shop_basic_method_init_method(final SubLObject self, final SubLObject new_assertion, final SubLObject new_head, final SubLObject new_precondition, final SubLObject new_decomposition) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_method_method = (SubLObject)shop_datastructures.NIL;
        SubLObject decomposition = get_shop_basic_method_decomposition(self);
        SubLObject precondition = get_shop_basic_method_precondition(self);
        SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list(self);
        SubLObject head = get_shop_basic_planner_rule_head(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym201$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
            try {
                assertion_list = (SubLObject)ConsesLow.list(new_assertion);
                head = new_head;
                precondition = new_precondition;
                decomposition = new_decomposition;
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym201$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_method_decomposition(self, decomposition);
                    set_shop_basic_method_precondition(self, precondition);
                    set_shop_basic_planner_rule_assertion_list(self, assertion_list);
                    set_shop_basic_planner_rule_head(self, head);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_method_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym201$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_method_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 18861L)
    public static SubLObject shop_basic_method_set_decomposition_method(final SubLObject self, final SubLObject decomp) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_method_method = (SubLObject)shop_datastructures.NIL;
        SubLObject decomposition = get_shop_basic_method_decomposition(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym206$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
            try {
                decomposition = decomp;
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym206$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, decomposition);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_method_decomposition(self, decomposition);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_method_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym206$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_method_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 19031L)
    public static SubLObject shop_basic_method_get_decomposition_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_method_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject decomposition = get_shop_basic_method_decomposition(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym210$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym210$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, decomposition);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_method_decomposition(self, decomposition);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_method_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym210$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_method_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 19164L)
    public static SubLObject shop_basic_method_get_precondition_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_method_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject precondition = get_shop_basic_method_precondition(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym214$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym214$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, precondition);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_method_precondition(self, precondition);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_method_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym214$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_method_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 19295L)
    public static SubLObject shop_basic_method_unify_task_to_head_with_data_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_method_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject decomposition = get_shop_basic_method_decomposition(self);
        final SubLObject precondition = get_shop_basic_method_precondition(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym218$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
            try {
                final SubLObject task_unifier = shop_basic_planner_rule_unify_task_to_head_method(self, task);
                if (shop_datastructures.NIL != task_unifier) {
                    Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym218$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, (SubLObject)ConsesLow.list(task_unifier, shop_apply_substitution(precondition, task_unifier), shop_apply_substitution(decomposition, task_unifier)));
                }
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym218$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, (SubLObject)shop_datastructures.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_method_decomposition(self, decomposition);
                    set_shop_basic_method_precondition(self, precondition);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_method_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym218$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_method_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 19713L)
    public static SubLObject shop_basic_method_add_literals_to_precondition_method(final SubLObject self, final SubLObject lits) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_method_method = (SubLObject)shop_datastructures.NIL;
        SubLObject precondition = get_shop_basic_method_precondition(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym222$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
            try {
                precondition = conses_high.union(precondition, lits, (SubLObject)shop_datastructures.UNPROVIDED, (SubLObject)shop_datastructures.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym222$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD, precondition);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_method_precondition(self, precondition);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_method_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym222$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_method_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 19944L)
    public static SubLObject get_shop_basic_sufficiency_cond_condition_formula(final SubLObject shop_basic_sufficiency_cond) {
        return classes.subloop_get_instance_slot(shop_basic_sufficiency_cond, (SubLObject)shop_datastructures.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 19944L)
    public static SubLObject set_shop_basic_sufficiency_cond_condition_formula(final SubLObject shop_basic_sufficiency_cond, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_basic_sufficiency_cond, value, (SubLObject)shop_datastructures.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 19944L)
    public static SubLObject subloop_reserved_initialize_shop_basic_sufficiency_cond_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym4$INSTANCE_COUNT, (SubLObject)shop_datastructures.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym0$SHOP_INDEXED_OBJECT, (SubLObject)shop_datastructures.$sym3$INSTANCE_INDEX, (SubLObject)shop_datastructures.NIL);
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 19944L)
    public static SubLObject subloop_reserved_initialize_shop_basic_sufficiency_cond_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym6$ISOLATED_P, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym7$INSTANCE_NUMBER, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym48$HEAD, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym47$ASSERTION_LIST, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym224$SHOP_BASIC_SUFFICIENCY_COND, (SubLObject)shop_datastructures.$sym228$CONDITION_FORMULA, (SubLObject)shop_datastructures.NIL);
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 19944L)
    public static SubLObject shop_basic_sufficiency_cond_p(final SubLObject shop_basic_sufficiency_cond) {
        return classes.subloop_instanceof_class(shop_basic_sufficiency_cond, (SubLObject)shop_datastructures.$sym224$SHOP_BASIC_SUFFICIENCY_COND);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 20237L)
    public static SubLObject shop_basic_sufficiency_cond_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_sufficiency_cond_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym231$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD);
            try {
                if (shop_datastructures.NIL != subloop_structures.instance_p(self)) {
                    PrintLow.format(stream, (SubLObject)shop_datastructures.$str232$__Shop_Scond__S__S_, instance_number, methods.funcall_instance_method_with_0_args(self, (SubLObject)shop_datastructures.$sym61$PRED));
                }
                else {
                    PrintLow.format(stream, (SubLObject)shop_datastructures.$str56$__Malformed_Instance_);
                }
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym231$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    object.set_object_instance_number(self, instance_number);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_sufficiency_cond_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym231$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_sufficiency_cond_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 20495L)
    public static SubLObject shop_basic_sufficiency_cond_html_display_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_sufficiency_cond_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject condition_formula = get_shop_basic_sufficiency_cond_condition_formula(self);
        final SubLObject assertion_list = get_shop_basic_planner_rule_assertion_list(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym235$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD);
            try {
                html_utilities.html_princ((SubLObject)shop_datastructures.$str104$Condition__);
                cb_utilities.cb_form(condition_formula, (SubLObject)shop_datastructures.UNPROVIDED, (SubLObject)shop_datastructures.UNPROVIDED);
                html_utilities.html_newline((SubLObject)shop_datastructures.UNPROVIDED);
                html_utilities.html_princ((SubLObject)shop_datastructures.$str197$Assertions__);
                Mapping.mapcar((SubLObject)shop_datastructures.$sym143$CB_FORM, assertion_list);
                html_utilities.html_newline((SubLObject)shop_datastructures.TWO_INTEGER);
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym235$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD, (SubLObject)shop_datastructures.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_sufficiency_cond_condition_formula(self, condition_formula);
                    set_shop_basic_planner_rule_assertion_list(self, assertion_list);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_sufficiency_cond_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym235$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_sufficiency_cond_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 20737L)
    public static SubLObject shop_basic_sufficiency_cond_cond_formula_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_sufficiency_cond_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject condition_formula = get_shop_basic_sufficiency_cond_condition_formula(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym239$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym239$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD, condition_formula);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_sufficiency_cond_condition_formula(self, condition_formula);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_sufficiency_cond_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym239$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_sufficiency_cond_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 20841L)
    public static SubLObject shop_basic_sufficiency_cond_set_cond_formula_method(final SubLObject self, final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_sufficiency_cond_method = (SubLObject)shop_datastructures.NIL;
        SubLObject condition_formula = get_shop_basic_sufficiency_cond_condition_formula(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym243$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD);
            try {
                condition_formula = form;
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym243$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD, condition_formula);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_sufficiency_cond_condition_formula(self, condition_formula);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_sufficiency_cond_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym243$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_sufficiency_cond_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 20986L)
    public static SubLObject shop_basic_sufficiency_cond_unify_task_to_head_with_data_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_sufficiency_cond_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject condition_formula = get_shop_basic_sufficiency_cond_condition_formula(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym246$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD);
            try {
                final SubLObject task_unifier = shop_basic_planner_rule_unify_task_to_head_method(self, task);
                if (shop_datastructures.NIL != task_unifier) {
                    Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym246$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD, (SubLObject)ConsesLow.list(task_unifier, shop_apply_substitution(condition_formula, task_unifier)));
                }
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym246$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD, (SubLObject)shop_datastructures.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_sufficiency_cond_condition_formula(self, condition_formula);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_sufficiency_cond_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym246$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_sufficiency_cond_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21361L)
    public static SubLObject shop_precondition_p(final SubLObject shop_precondition) {
        return interfaces.subloop_instanceof_interface(shop_precondition, (SubLObject)shop_datastructures.$sym248$SHOP_PRECONDITION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21463L)
    public static SubLObject subloop_reserved_initialize_shop_basic_precondition_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym4$INSTANCE_COUNT, (SubLObject)shop_datastructures.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym0$SHOP_INDEXED_OBJECT, (SubLObject)shop_datastructures.$sym3$INSTANCE_INDEX, (SubLObject)shop_datastructures.NIL);
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21463L)
    public static SubLObject subloop_reserved_initialize_shop_basic_precondition_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym6$ISOLATED_P, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym7$INSTANCE_NUMBER, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym48$HEAD, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym47$ASSERTION_LIST, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$sym186$PRECONDITION, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$sym185$DECOMPOSITION, (SubLObject)shop_datastructures.NIL);
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21463L)
    public static SubLObject shop_basic_precondition_p(final SubLObject shop_basic_precondition) {
        return classes.subloop_instanceof_class(shop_basic_precondition, (SubLObject)shop_datastructures.$sym249$SHOP_BASIC_PRECONDITION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21579L)
    public static SubLObject shop_basic_precondition_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_precondition_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject head = get_shop_basic_planner_rule_head(self);
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym254$OUTER_CATCH_FOR_SHOP_BASIC_PRECONDITION_METHOD);
            try {
                if (shop_datastructures.NIL != subloop_structures.instance_p(self)) {
                    PrintLow.format(stream, (SubLObject)shop_datastructures.$str255$__SHOP_PRECOND__S__S_, instance_number, head);
                }
                else {
                    PrintLow.format(stream, (SubLObject)shop_datastructures.$str56$__Malformed_Instance_);
                }
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym254$OUTER_CATCH_FOR_SHOP_BASIC_PRECONDITION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_planner_rule_head(self, head);
                    object.set_object_instance_number(self, instance_number);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_precondition_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym254$OUTER_CATCH_FOR_SHOP_BASIC_PRECONDITION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_precondition_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
    public static SubLObject get_shop_basic_problem_state(final SubLObject shop_basic_problem) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_problem, (SubLObject)shop_datastructures.FIVE_INTEGER, (SubLObject)shop_datastructures.$sym260$STATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
    public static SubLObject set_shop_basic_problem_state(final SubLObject shop_basic_problem, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_problem, value, (SubLObject)shop_datastructures.FIVE_INTEGER, (SubLObject)shop_datastructures.$sym260$STATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
    public static SubLObject get_shop_basic_problem_tasks(final SubLObject shop_basic_problem) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_problem, (SubLObject)shop_datastructures.FOUR_INTEGER, (SubLObject)shop_datastructures.$sym261$TASKS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
    public static SubLObject set_shop_basic_problem_tasks(final SubLObject shop_basic_problem, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_problem, value, (SubLObject)shop_datastructures.FOUR_INTEGER, (SubLObject)shop_datastructures.$sym261$TASKS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
    public static SubLObject get_shop_basic_problem_task_mt(final SubLObject shop_basic_problem) {
        return classes.subloop_get_instance_slot(shop_basic_problem, (SubLObject)shop_datastructures.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
    public static SubLObject set_shop_basic_problem_task_mt(final SubLObject shop_basic_problem, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_basic_problem, value, (SubLObject)shop_datastructures.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
    public static SubLObject get_shop_basic_problem_domain(final SubLObject shop_basic_problem) {
        return classes.subloop_get_instance_slot(shop_basic_problem, (SubLObject)shop_datastructures.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
    public static SubLObject set_shop_basic_problem_domain(final SubLObject shop_basic_problem, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_basic_problem, value, (SubLObject)shop_datastructures.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
    public static SubLObject get_shop_basic_problem_name(final SubLObject shop_basic_problem) {
        return classes.subloop_get_instance_slot(shop_basic_problem, (SubLObject)shop_datastructures.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
    public static SubLObject set_shop_basic_problem_name(final SubLObject shop_basic_problem, final SubLObject value) {
        return classes.subloop_set_instance_slot(shop_basic_problem, value, (SubLObject)shop_datastructures.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
    public static SubLObject subloop_reserved_initialize_shop_basic_problem_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym4$INSTANCE_COUNT, (SubLObject)shop_datastructures.ZERO_INTEGER);
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
    public static SubLObject subloop_reserved_initialize_shop_basic_problem_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym6$ISOLATED_P, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$sym7$INSTANCE_NUMBER, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$sym263$NAME, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$sym264$DOMAIN, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$sym265$TASK_MT, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$sym261$TASKS, (SubLObject)shop_datastructures.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$sym260$STATE, (SubLObject)shop_datastructures.NIL);
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 21828L)
    public static SubLObject shop_basic_problem_p(final SubLObject shop_basic_problem) {
        return classes.subloop_instanceof_class(shop_basic_problem, (SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 22412L)
    public static SubLObject shop_basic_problem_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = (SubLObject)shop_datastructures.NIL;
        SubLObject state = get_shop_basic_problem_state(self);
        SubLObject tasks = get_shop_basic_problem_tasks(self);
        SubLObject task_mt = get_shop_basic_problem_task_mt(self);
        SubLObject domain = get_shop_basic_problem_domain(self);
        SubLObject name = get_shop_basic_problem_name(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym268$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                object.object_initialize_method(self);
                name = (SubLObject)shop_datastructures.NIL;
                domain = (SubLObject)shop_datastructures.NIL;
                task_mt = (SubLObject)shop_datastructures.NIL;
                tasks = (SubLObject)shop_datastructures.NIL;
                state = (SubLObject)shop_datastructures.NIL;
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym268$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_problem_state(self, state);
                    set_shop_basic_problem_tasks(self, tasks);
                    set_shop_basic_problem_task_mt(self, task_mt);
                    set_shop_basic_problem_domain(self, domain);
                    set_shop_basic_problem_name(self, name);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym268$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 22633L)
    public static SubLObject shop_basic_problem_initialize_problem_method(final SubLObject self, final SubLObject new_name, final SubLObject new_domain, final SubLObject new_state, final SubLObject new_tasks, final SubLObject new_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = (SubLObject)shop_datastructures.NIL;
        SubLObject state = get_shop_basic_problem_state(self);
        SubLObject tasks = get_shop_basic_problem_tasks(self);
        SubLObject task_mt = get_shop_basic_problem_task_mt(self);
        SubLObject domain = get_shop_basic_problem_domain(self);
        SubLObject name = get_shop_basic_problem_name(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym273$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                domain = new_domain;
                name = new_name;
                state = new_state;
                tasks = new_tasks;
                task_mt = new_mt;
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym273$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_problem_state(self, state);
                    set_shop_basic_problem_tasks(self, tasks);
                    set_shop_basic_problem_task_mt(self, task_mt);
                    set_shop_basic_problem_domain(self, domain);
                    set_shop_basic_problem_name(self, name);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym273$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 23090L)
    public static SubLObject shop_basic_problem_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject name = get_shop_basic_problem_name(self);
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym276$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                if (shop_datastructures.NIL != subloop_structures.instance_p(self)) {
                    PrintLow.format(stream, (SubLObject)shop_datastructures.$str277$__PROBLEM__S__S_, instance_number, name);
                }
                else {
                    PrintLow.format(stream, (SubLObject)shop_datastructures.$str56$__Malformed_Instance_);
                }
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym276$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_problem_name(self, name);
                    object.set_object_instance_number(self, instance_number);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym276$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 23322L)
    public static SubLObject shop_basic_problem_set_name_method(final SubLObject self, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = (SubLObject)shop_datastructures.NIL;
        SubLObject name = get_shop_basic_problem_name(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym282$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                name = n;
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym282$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, n);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_problem_name(self, name);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym282$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 23425L)
    public static SubLObject shop_basic_problem_get_name_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject name = get_shop_basic_problem_name(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym286$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym286$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, name);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_problem_name(self, name);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym286$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 23502L)
    public static SubLObject shop_basic_problem_set_domain_method(final SubLObject self, final SubLObject d) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = (SubLObject)shop_datastructures.NIL;
        SubLObject domain = get_shop_basic_problem_domain(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym291$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                domain = d;
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym291$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, d);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_problem_domain(self, domain);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym291$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 23610L)
    public static SubLObject shop_basic_problem_get_domain_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject domain = get_shop_basic_problem_domain(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym295$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym295$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, domain);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_problem_domain(self, domain);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym295$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 23691L)
    public static SubLObject shop_basic_problem_get_methods_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject domain = get_shop_basic_problem_domain(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym299$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                final SubLObject domain_$3 = shop_basic_problem_get_domain_method(self);
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym299$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, instances.get_slot(domain_$3, (SubLObject)shop_datastructures.$sym300$METHODS));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_problem_domain(self, domain);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym299$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 23969L)
    public static SubLObject shop_basic_problem_get_operators_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject domain = get_shop_basic_problem_domain(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym304$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                final SubLObject domain_$4 = shop_basic_problem_get_domain_method(self);
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym304$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, instances.get_slot(domain_$4, (SubLObject)shop_datastructures.$sym305$OPERATORS));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_problem_domain(self, domain);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym304$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 24131L)
    public static SubLObject shop_basic_problem_get_tasks_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject tasks = get_shop_basic_problem_tasks(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym309$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym309$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, tasks);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_problem_tasks(self, tasks);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym309$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 24221L)
    public static SubLObject shop_basic_problem_set_tasks_method(final SubLObject self, final SubLObject ts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = (SubLObject)shop_datastructures.NIL;
        SubLObject tasks = get_shop_basic_problem_tasks(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym314$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                tasks = ts;
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym314$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, ts);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_problem_tasks(self, tasks);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym314$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 24319L)
    public static SubLObject shop_basic_problem_get_state_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject state = get_shop_basic_problem_state(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym318$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym318$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, state);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_problem_state(self, state);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym318$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-datastructures.lisp", position = 24409L)
    public static SubLObject shop_basic_problem_set_state_method(final SubLObject self, final SubLObject s) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_problem_method = (SubLObject)shop_datastructures.NIL;
        final SubLObject state = get_shop_basic_problem_state(self);
        try {
            thread.throwStack.push(shop_datastructures.$sym323$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_datastructures.$sym323$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD, instances.set_slot(self, (SubLObject)shop_datastructures.$sym260$STATE, s));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_datastructures.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_problem_state(self, state);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_problem_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_datastructures.$sym323$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_problem_method;
    }
    
    public static SubLObject declare_shop_datastructures_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "get_shop_indexed_object_instance_index", "GET-SHOP-INDEXED-OBJECT-INSTANCE-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "set_shop_indexed_object_instance_index", "SET-SHOP-INDEXED-OBJECT-INSTANCE-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "subloop_reserved_initialize_shop_indexed_object_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-INDEXED-OBJECT-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "subloop_reserved_initialize_shop_indexed_object_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-INDEXED-OBJECT-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_indexed_object_p", "SHOP-INDEXED-OBJECT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_indexed_object_find_instance_method", "SHOP-INDEXED-OBJECT-FIND-INSTANCE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_indexed_object_add_to_index_method", "SHOP-INDEXED-OBJECT-ADD-TO-INDEX-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_indexed_object_initialize_method", "SHOP-INDEXED-OBJECT-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_problem_p", "SHOP-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_planner_rule_p", "SHOP-PLANNER-RULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_operator_p", "SHOP-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_sufficiency_condition_p", "SHOP-SUFFICIENCY-CONDITION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_method_p", "SHOP-METHOD-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.shop_datastructures", "shop_my_union", "SHOP-MY-UNION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_my_union_func", "SHOP-MY-UNION-FUNC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_same_set_p", "SHOP-SAME-SET-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_variablep", "SHOP-VARIABLEP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_extract_variables", "SHOP-EXTRACT-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_empty_bindingP", "SHOP-EMPTY-BINDING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_unify_failedP", "SHOP-UNIFY-FAILED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_apply_substitution", "SHOP-APPLY-SUBSTITUTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_compose_substitutions_test", "SHOP-COMPOSE-SUBSTITUTIONS-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_compose_substitutions", "SHOP-COMPOSE-SUBSTITUTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_unify", "SHOP-UNIFY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_occurs", "SHOP-OCCURS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_standardizer_gensym", "SHOP-STANDARDIZER-GENSYM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_standardizer", "SHOP-STANDARDIZER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_spec_formulaP", "SHOP-SPEC-FORMULA?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "get_shop_basic_planner_rule_assertion_list", "GET-SHOP-BASIC-PLANNER-RULE-ASSERTION-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "set_shop_basic_planner_rule_assertion_list", "SET-SHOP-BASIC-PLANNER-RULE-ASSERTION-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "get_shop_basic_planner_rule_head", "GET-SHOP-BASIC-PLANNER-RULE-HEAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "set_shop_basic_planner_rule_head", "SET-SHOP-BASIC-PLANNER-RULE-HEAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "subloop_reserved_initialize_shop_basic_planner_rule_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-RULE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "subloop_reserved_initialize_shop_basic_planner_rule_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-RULE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_planner_rule_p", "SHOP-BASIC-PLANNER-RULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_planner_rule_print_method", "SHOP-BASIC-PLANNER-RULE-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_planner_rule_html_display_method", "SHOP-BASIC-PLANNER-RULE-HTML-DISPLAY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_planner_rule_pred_method", "SHOP-BASIC-PLANNER-RULE-PRED-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_planner_rule_head_method", "SHOP-BASIC-PLANNER-RULE-HEAD-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_planner_rule_set_head_method", "SHOP-BASIC-PLANNER-RULE-SET-HEAD-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_planner_rule_assertions_method", "SHOP-BASIC-PLANNER-RULE-ASSERTIONS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_planner_rule_set_assertions_method", "SHOP-BASIC-PLANNER-RULE-SET-ASSERTIONS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_planner_rule_unify_task_to_head_method", "SHOP-BASIC-PLANNER-RULE-UNIFY-TASK-TO-HEAD-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_conditional_effect_p", "SHOP-CONDITIONAL-EFFECT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "get_shop_basic_conditional_effect_condition", "GET-SHOP-BASIC-CONDITIONAL-EFFECT-CONDITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "set_shop_basic_conditional_effect_condition", "SET-SHOP-BASIC-CONDITIONAL-EFFECT-CONDITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "get_shop_basic_conditional_effect_deletes", "GET-SHOP-BASIC-CONDITIONAL-EFFECT-DELETES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "set_shop_basic_conditional_effect_deletes", "SET-SHOP-BASIC-CONDITIONAL-EFFECT-DELETES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "get_shop_basic_conditional_effect_adds", "GET-SHOP-BASIC-CONDITIONAL-EFFECT-ADDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "set_shop_basic_conditional_effect_adds", "SET-SHOP-BASIC-CONDITIONAL-EFFECT-ADDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "subloop_reserved_initialize_shop_basic_conditional_effect_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-CONDITIONAL-EFFECT-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "subloop_reserved_initialize_shop_basic_conditional_effect_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-CONDITIONAL-EFFECT-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_conditional_effect_p", "SHOP-BASIC-CONDITIONAL-EFFECT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_conditional_effect_print_method", "SHOP-BASIC-CONDITIONAL-EFFECT-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_conditional_effect_html_display_method", "SHOP-BASIC-CONDITIONAL-EFFECT-HTML-DISPLAY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_conditional_effect_init_method", "SHOP-BASIC-CONDITIONAL-EFFECT-INIT-METHOD", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_conditional_effect_adds_method", "SHOP-BASIC-CONDITIONAL-EFFECT-ADDS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_conditional_effect_deletes_method", "SHOP-BASIC-CONDITIONAL-EFFECT-DELETES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_conditional_effect_condition_method", "SHOP-BASIC-CONDITIONAL-EFFECT-CONDITION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_conditional_effect_assertion_method", "SHOP-BASIC-CONDITIONAL-EFFECT-ASSERTION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "get_shop_basic_operator_cost", "GET-SHOP-BASIC-OPERATOR-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "set_shop_basic_operator_cost", "SET-SHOP-BASIC-OPERATOR-COST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "get_shop_basic_operator_conditional_effects", "GET-SHOP-BASIC-OPERATOR-CONDITIONAL-EFFECTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "set_shop_basic_operator_conditional_effects", "SET-SHOP-BASIC-OPERATOR-CONDITIONAL-EFFECTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "get_shop_basic_operator_deletes", "GET-SHOP-BASIC-OPERATOR-DELETES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "set_shop_basic_operator_deletes", "SET-SHOP-BASIC-OPERATOR-DELETES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "get_shop_basic_operator_adds", "GET-SHOP-BASIC-OPERATOR-ADDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "set_shop_basic_operator_adds", "SET-SHOP-BASIC-OPERATOR-ADDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "subloop_reserved_initialize_shop_basic_operator_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-OPERATOR-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "subloop_reserved_initialize_shop_basic_operator_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-OPERATOR-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_operator_p", "SHOP-BASIC-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_operator_print_method", "SHOP-BASIC-OPERATOR-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_operator_html_display_method", "SHOP-BASIC-OPERATOR-HTML-DISPLAY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_operator_init_method", "SHOP-BASIC-OPERATOR-INIT-METHOD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_operator_get_adds_method", "SHOP-BASIC-OPERATOR-GET-ADDS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_operator_add_literals_to_adds_method", "SHOP-BASIC-OPERATOR-ADD-LITERALS-TO-ADDS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_operator_get_deletes_method", "SHOP-BASIC-OPERATOR-GET-DELETES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_operator_conditional_effects_method", "SHOP-BASIC-OPERATOR-CONDITIONAL-EFFECTS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_operator_add_literals_to_deletes_method", "SHOP-BASIC-OPERATOR-ADD-LITERALS-TO-DELETES-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_operator_unit_test_method", "SHOP-BASIC-OPERATOR-UNIT-TEST-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "get_shop_basic_method_decomposition", "GET-SHOP-BASIC-METHOD-DECOMPOSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "set_shop_basic_method_decomposition", "SET-SHOP-BASIC-METHOD-DECOMPOSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "get_shop_basic_method_precondition", "GET-SHOP-BASIC-METHOD-PRECONDITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "set_shop_basic_method_precondition", "SET-SHOP-BASIC-METHOD-PRECONDITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "subloop_reserved_initialize_shop_basic_method_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-METHOD-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "subloop_reserved_initialize_shop_basic_method_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-METHOD-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_method_p", "SHOP-BASIC-METHOD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_method_print_method", "SHOP-BASIC-METHOD-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_method_html_display_method", "SHOP-BASIC-METHOD-HTML-DISPLAY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_method_init_method", "SHOP-BASIC-METHOD-INIT-METHOD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_method_set_decomposition_method", "SHOP-BASIC-METHOD-SET-DECOMPOSITION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_method_get_decomposition_method", "SHOP-BASIC-METHOD-GET-DECOMPOSITION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_method_get_precondition_method", "SHOP-BASIC-METHOD-GET-PRECONDITION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_method_unify_task_to_head_with_data_method", "SHOP-BASIC-METHOD-UNIFY-TASK-TO-HEAD-WITH-DATA-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_method_add_literals_to_precondition_method", "SHOP-BASIC-METHOD-ADD-LITERALS-TO-PRECONDITION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "get_shop_basic_sufficiency_cond_condition_formula", "GET-SHOP-BASIC-SUFFICIENCY-COND-CONDITION-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "set_shop_basic_sufficiency_cond_condition_formula", "SET-SHOP-BASIC-SUFFICIENCY-COND-CONDITION-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "subloop_reserved_initialize_shop_basic_sufficiency_cond_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-SUFFICIENCY-COND-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "subloop_reserved_initialize_shop_basic_sufficiency_cond_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-SUFFICIENCY-COND-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_sufficiency_cond_p", "SHOP-BASIC-SUFFICIENCY-COND-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_sufficiency_cond_print_method", "SHOP-BASIC-SUFFICIENCY-COND-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_sufficiency_cond_html_display_method", "SHOP-BASIC-SUFFICIENCY-COND-HTML-DISPLAY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_sufficiency_cond_cond_formula_method", "SHOP-BASIC-SUFFICIENCY-COND-COND-FORMULA-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_sufficiency_cond_set_cond_formula_method", "SHOP-BASIC-SUFFICIENCY-COND-SET-COND-FORMULA-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_sufficiency_cond_unify_task_to_head_with_data_method", "SHOP-BASIC-SUFFICIENCY-COND-UNIFY-TASK-TO-HEAD-WITH-DATA-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_precondition_p", "SHOP-PRECONDITION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "subloop_reserved_initialize_shop_basic_precondition_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PRECONDITION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "subloop_reserved_initialize_shop_basic_precondition_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PRECONDITION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_precondition_p", "SHOP-BASIC-PRECONDITION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_precondition_print_method", "SHOP-BASIC-PRECONDITION-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "get_shop_basic_problem_state", "GET-SHOP-BASIC-PROBLEM-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "set_shop_basic_problem_state", "SET-SHOP-BASIC-PROBLEM-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "get_shop_basic_problem_tasks", "GET-SHOP-BASIC-PROBLEM-TASKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "set_shop_basic_problem_tasks", "SET-SHOP-BASIC-PROBLEM-TASKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "get_shop_basic_problem_task_mt", "GET-SHOP-BASIC-PROBLEM-TASK-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "set_shop_basic_problem_task_mt", "SET-SHOP-BASIC-PROBLEM-TASK-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "get_shop_basic_problem_domain", "GET-SHOP-BASIC-PROBLEM-DOMAIN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "set_shop_basic_problem_domain", "SET-SHOP-BASIC-PROBLEM-DOMAIN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "get_shop_basic_problem_name", "GET-SHOP-BASIC-PROBLEM-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "set_shop_basic_problem_name", "SET-SHOP-BASIC-PROBLEM-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "subloop_reserved_initialize_shop_basic_problem_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PROBLEM-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "subloop_reserved_initialize_shop_basic_problem_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PROBLEM-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_problem_p", "SHOP-BASIC-PROBLEM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_problem_initialize_method", "SHOP-BASIC-PROBLEM-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_problem_initialize_problem_method", "SHOP-BASIC-PROBLEM-INITIALIZE-PROBLEM-METHOD", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_problem_print_method", "SHOP-BASIC-PROBLEM-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_problem_set_name_method", "SHOP-BASIC-PROBLEM-SET-NAME-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_problem_get_name_method", "SHOP-BASIC-PROBLEM-GET-NAME-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_problem_set_domain_method", "SHOP-BASIC-PROBLEM-SET-DOMAIN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_problem_get_domain_method", "SHOP-BASIC-PROBLEM-GET-DOMAIN-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_problem_get_methods_method", "SHOP-BASIC-PROBLEM-GET-METHODS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_problem_get_operators_method", "SHOP-BASIC-PROBLEM-GET-OPERATORS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_problem_get_tasks_method", "SHOP-BASIC-PROBLEM-GET-TASKS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_problem_set_tasks_method", "SHOP-BASIC-PROBLEM-SET-TASKS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_problem_get_state_method", "SHOP-BASIC-PROBLEM-GET-STATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_datastructures", "shop_basic_problem_set_state_method", "SHOP-BASIC-PROBLEM-SET-STATE-METHOD", 2, 0, false);
        return (SubLObject)shop_datastructures.NIL;
    }
    
    public static SubLObject init_shop_datastructures_file() {
        shop_datastructures.$shop_unify_failed$ = SubLFiles.deflexical("*SHOP-UNIFY-FAILED*", (SubLObject)shop_datastructures.$kw40$FAIL);
        shop_datastructures.$shop_empty_unifier$ = SubLFiles.deflexical("*SHOP-EMPTY-UNIFIER*", (SubLObject)shop_datastructures.NIL);
        return (SubLObject)shop_datastructures.NIL;
    }
    
    public static SubLObject setup_shop_datastructures_file() {
        classes.subloop_new_class((SubLObject)shop_datastructures.$sym0$SHOP_INDEXED_OBJECT, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)shop_datastructures.$sym0$SHOP_INDEXED_OBJECT, (SubLObject)shop_datastructures.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_datastructures.$sym0$SHOP_INDEXED_OBJECT, (SubLObject)shop_datastructures.$sym5$SUBLOOP_RESERVED_INITIALIZE_SHOP_INDEXED_OBJECT_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_datastructures.$sym0$SHOP_INDEXED_OBJECT, (SubLObject)shop_datastructures.$sym8$SUBLOOP_RESERVED_INITIALIZE_SHOP_INDEXED_OBJECT_INSTANCE);
        subloop_reserved_initialize_shop_indexed_object_class((SubLObject)shop_datastructures.$sym0$SHOP_INDEXED_OBJECT);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym9$FIND_INSTANCE, (SubLObject)shop_datastructures.$sym0$SHOP_INDEXED_OBJECT, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list11, (SubLObject)shop_datastructures.$list12);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym0$SHOP_INDEXED_OBJECT, (SubLObject)shop_datastructures.$sym9$FIND_INSTANCE, (SubLObject)shop_datastructures.$sym14$SHOP_INDEXED_OBJECT_FIND_INSTANCE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym15$ADD_TO_INDEX, (SubLObject)shop_datastructures.$sym0$SHOP_INDEXED_OBJECT, (SubLObject)shop_datastructures.$list16, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list17);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym0$SHOP_INDEXED_OBJECT, (SubLObject)shop_datastructures.$sym15$ADD_TO_INDEX, (SubLObject)shop_datastructures.$sym18$SHOP_INDEXED_OBJECT_ADD_TO_INDEX_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym19$INITIALIZE, (SubLObject)shop_datastructures.$sym0$SHOP_INDEXED_OBJECT, (SubLObject)shop_datastructures.$list20, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list21);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym0$SHOP_INDEXED_OBJECT, (SubLObject)shop_datastructures.$sym19$INITIALIZE, (SubLObject)shop_datastructures.$sym22$SHOP_INDEXED_OBJECT_INITIALIZE_METHOD);
        interfaces.new_interface((SubLObject)shop_datastructures.$sym23$SHOP_PROBLEM, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list24);
        interfaces.new_interface((SubLObject)shop_datastructures.$sym25$SHOP_PLANNER_RULE, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list26);
        interfaces.new_interface((SubLObject)shop_datastructures.$sym27$SHOP_OPERATOR, (SubLObject)shop_datastructures.$sym25$SHOP_PLANNER_RULE, (SubLObject)shop_datastructures.$list28, (SubLObject)shop_datastructures.$list29);
        interfaces.new_interface((SubLObject)shop_datastructures.$sym30$SHOP_SUFFICIENCY_CONDITION, (SubLObject)shop_datastructures.$sym25$SHOP_PLANNER_RULE, (SubLObject)shop_datastructures.$list28, (SubLObject)shop_datastructures.$list31);
        interfaces.new_interface((SubLObject)shop_datastructures.$sym32$SHOP_METHOD, (SubLObject)shop_datastructures.$sym25$SHOP_PLANNER_RULE, (SubLObject)shop_datastructures.$list28, (SubLObject)shop_datastructures.$list33);
        classes.subloop_new_class((SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym0$SHOP_INDEXED_OBJECT, (SubLObject)shop_datastructures.$list45, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list46);
        classes.class_set_implements_slot_listeners((SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym49$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_RULE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym50$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_RULE_INSTANCE);
        subloop_reserved_initialize_shop_basic_planner_rule_class((SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym51$PRINT, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list52, (SubLObject)shop_datastructures.$list53);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym51$PRINT, (SubLObject)shop_datastructures.$sym57$SHOP_BASIC_PLANNER_RULE_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym58$HTML_DISPLAY, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list59);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym58$HTML_DISPLAY, (SubLObject)shop_datastructures.$sym60$SHOP_BASIC_PLANNER_RULE_HTML_DISPLAY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym61$PRED, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list62);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym61$PRED, (SubLObject)shop_datastructures.$sym64$SHOP_BASIC_PLANNER_RULE_PRED_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym48$HEAD, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list65);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym48$HEAD, (SubLObject)shop_datastructures.$sym67$SHOP_BASIC_PLANNER_RULE_HEAD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym68$SET_HEAD, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list69, (SubLObject)shop_datastructures.$list70);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym68$SET_HEAD, (SubLObject)shop_datastructures.$sym72$SHOP_BASIC_PLANNER_RULE_SET_HEAD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym73$ASSERTIONS, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list74);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym73$ASSERTIONS, (SubLObject)shop_datastructures.$sym76$SHOP_BASIC_PLANNER_RULE_ASSERTIONS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym77$SET_ASSERTIONS, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list78, (SubLObject)shop_datastructures.$list79);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym77$SET_ASSERTIONS, (SubLObject)shop_datastructures.$sym81$SHOP_BASIC_PLANNER_RULE_SET_ASSERTIONS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym82$UNIFY_TASK_TO_HEAD, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list83, (SubLObject)shop_datastructures.$list84);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$sym82$UNIFY_TASK_TO_HEAD, (SubLObject)shop_datastructures.$sym87$SHOP_BASIC_PLANNER_RULE_UNIFY_TASK_TO_HEAD_METHOD);
        interfaces.new_interface((SubLObject)shop_datastructures.$sym88$SHOP_CONDITIONAL_EFFECT, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list89);
        classes.subloop_new_class((SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$list91, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list92);
        classes.class_set_implements_slot_listeners((SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT, (SubLObject)shop_datastructures.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT, (SubLObject)shop_datastructures.$sym96$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_CONDITIONAL_EFFECT_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT, (SubLObject)shop_datastructures.$sym97$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_CONDITIONAL_EFFECT_INSTANC);
        subloop_reserved_initialize_shop_basic_conditional_effect_class((SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym51$PRINT, (SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list52, (SubLObject)shop_datastructures.$list98);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT, (SubLObject)shop_datastructures.$sym51$PRINT, (SubLObject)shop_datastructures.$sym101$SHOP_BASIC_CONDITIONAL_EFFECT_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym58$HTML_DISPLAY, (SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list102);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT, (SubLObject)shop_datastructures.$sym58$HTML_DISPLAY, (SubLObject)shop_datastructures.$sym108$SHOP_BASIC_CONDITIONAL_EFFECT_HTML_DISPLAY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym109$INIT, (SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list110, (SubLObject)shop_datastructures.$list111);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT, (SubLObject)shop_datastructures.$sym109$INIT, (SubLObject)shop_datastructures.$sym113$SHOP_BASIC_CONDITIONAL_EFFECT_INIT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym95$ADDS, (SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list114);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT, (SubLObject)shop_datastructures.$sym95$ADDS, (SubLObject)shop_datastructures.$sym116$SHOP_BASIC_CONDITIONAL_EFFECT_ADDS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym94$DELETES, (SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list117);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT, (SubLObject)shop_datastructures.$sym94$DELETES, (SubLObject)shop_datastructures.$sym119$SHOP_BASIC_CONDITIONAL_EFFECT_DELETES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym93$CONDITION, (SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list120);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT, (SubLObject)shop_datastructures.$sym93$CONDITION, (SubLObject)shop_datastructures.$sym122$SHOP_BASIC_CONDITIONAL_EFFECT_CONDITION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym123$ASSERTION, (SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list74);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym90$SHOP_BASIC_CONDITIONAL_EFFECT, (SubLObject)shop_datastructures.$sym123$ASSERTION, (SubLObject)shop_datastructures.$sym125$SHOP_BASIC_CONDITIONAL_EFFECT_ASSERTION_METHOD);
        classes.subloop_new_class((SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$list127, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list128);
        classes.class_set_implements_slot_listeners((SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$sym131$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_OPERATOR_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$sym132$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_OPERATOR_INSTANCE);
        subloop_reserved_initialize_shop_basic_operator_class((SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym51$PRINT, (SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list52, (SubLObject)shop_datastructures.$list133);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$sym51$PRINT, (SubLObject)shop_datastructures.$sym136$SHOP_BASIC_OPERATOR_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym58$HTML_DISPLAY, (SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list137);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$sym58$HTML_DISPLAY, (SubLObject)shop_datastructures.$sym144$SHOP_BASIC_OPERATOR_HTML_DISPLAY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym109$INIT, (SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list145, (SubLObject)shop_datastructures.$list146);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$sym109$INIT, (SubLObject)shop_datastructures.$sym148$SHOP_BASIC_OPERATOR_INIT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym149$GET_ADDS, (SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list150);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$sym149$GET_ADDS, (SubLObject)shop_datastructures.$sym152$SHOP_BASIC_OPERATOR_GET_ADDS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym153$ADD_LITERALS_TO_ADDS, (SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list154, (SubLObject)shop_datastructures.$list155);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$sym153$ADD_LITERALS_TO_ADDS, (SubLObject)shop_datastructures.$sym157$SHOP_BASIC_OPERATOR_ADD_LITERALS_TO_ADDS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym158$GET_DELETES, (SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list159);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$sym158$GET_DELETES, (SubLObject)shop_datastructures.$sym161$SHOP_BASIC_OPERATOR_GET_DELETES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym130$CONDITIONAL_EFFECTS, (SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list162);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$sym130$CONDITIONAL_EFFECTS, (SubLObject)shop_datastructures.$sym164$SHOP_BASIC_OPERATOR_CONDITIONAL_EFFECTS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym165$ADD_LITERALS_TO_DELETES, (SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list154, (SubLObject)shop_datastructures.$list166);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$sym165$ADD_LITERALS_TO_DELETES, (SubLObject)shop_datastructures.$sym168$SHOP_BASIC_OPERATOR_ADD_LITERALS_TO_DELETES_METHOD);
        methods.methods_incorporate_class_method((SubLObject)shop_datastructures.$sym169$UNIT_TEST, (SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$list170, (SubLObject)shop_datastructures.$list171, (SubLObject)shop_datastructures.$list172);
        methods.subloop_register_class_method((SubLObject)shop_datastructures.$sym126$SHOP_BASIC_OPERATOR, (SubLObject)shop_datastructures.$sym169$UNIT_TEST, (SubLObject)shop_datastructures.$sym181$SHOP_BASIC_OPERATOR_UNIT_TEST_METHOD);
        classes.subloop_new_class((SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$list183, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list184);
        classes.class_set_implements_slot_listeners((SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$sym187$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_METHOD_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$sym188$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_METHOD_INSTANCE);
        subloop_reserved_initialize_shop_basic_method_class((SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym51$PRINT, (SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list52, (SubLObject)shop_datastructures.$list189);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$sym51$PRINT, (SubLObject)shop_datastructures.$sym192$SHOP_BASIC_METHOD_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym58$HTML_DISPLAY, (SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list193);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$sym58$HTML_DISPLAY, (SubLObject)shop_datastructures.$sym198$SHOP_BASIC_METHOD_HTML_DISPLAY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym109$INIT, (SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list199, (SubLObject)shop_datastructures.$list200);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$sym109$INIT, (SubLObject)shop_datastructures.$sym202$SHOP_BASIC_METHOD_INIT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym203$SET_DECOMPOSITION, (SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list204, (SubLObject)shop_datastructures.$list205);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$sym203$SET_DECOMPOSITION, (SubLObject)shop_datastructures.$sym207$SHOP_BASIC_METHOD_SET_DECOMPOSITION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym208$GET_DECOMPOSITION, (SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list209);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$sym208$GET_DECOMPOSITION, (SubLObject)shop_datastructures.$sym211$SHOP_BASIC_METHOD_GET_DECOMPOSITION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym212$GET_PRECONDITION, (SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list213);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$sym212$GET_PRECONDITION, (SubLObject)shop_datastructures.$sym215$SHOP_BASIC_METHOD_GET_PRECONDITION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym216$UNIFY_TASK_TO_HEAD_WITH_DATA, (SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list83, (SubLObject)shop_datastructures.$list217);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$sym216$UNIFY_TASK_TO_HEAD_WITH_DATA, (SubLObject)shop_datastructures.$sym219$SHOP_BASIC_METHOD_UNIFY_TASK_TO_HEAD_WITH_DATA_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym220$ADD_LITERALS_TO_PRECONDITION, (SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list154, (SubLObject)shop_datastructures.$list221);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$sym220$ADD_LITERALS_TO_PRECONDITION, (SubLObject)shop_datastructures.$sym223$SHOP_BASIC_METHOD_ADD_LITERALS_TO_PRECONDITION_METHOD);
        classes.subloop_new_class((SubLObject)shop_datastructures.$sym224$SHOP_BASIC_SUFFICIENCY_COND, (SubLObject)shop_datastructures.$sym44$SHOP_BASIC_PLANNER_RULE, (SubLObject)shop_datastructures.$list225, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list226);
        classes.class_set_implements_slot_listeners((SubLObject)shop_datastructures.$sym224$SHOP_BASIC_SUFFICIENCY_COND, (SubLObject)shop_datastructures.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_datastructures.$sym224$SHOP_BASIC_SUFFICIENCY_COND, (SubLObject)shop_datastructures.$sym227$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_SUFFICIENCY_COND_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_datastructures.$sym224$SHOP_BASIC_SUFFICIENCY_COND, (SubLObject)shop_datastructures.$sym229$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_SUFFICIENCY_COND_INSTANCE);
        subloop_reserved_initialize_shop_basic_sufficiency_cond_class((SubLObject)shop_datastructures.$sym224$SHOP_BASIC_SUFFICIENCY_COND);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym51$PRINT, (SubLObject)shop_datastructures.$sym224$SHOP_BASIC_SUFFICIENCY_COND, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list52, (SubLObject)shop_datastructures.$list230);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym224$SHOP_BASIC_SUFFICIENCY_COND, (SubLObject)shop_datastructures.$sym51$PRINT, (SubLObject)shop_datastructures.$sym233$SHOP_BASIC_SUFFICIENCY_COND_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym58$HTML_DISPLAY, (SubLObject)shop_datastructures.$sym224$SHOP_BASIC_SUFFICIENCY_COND, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list234);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym224$SHOP_BASIC_SUFFICIENCY_COND, (SubLObject)shop_datastructures.$sym58$HTML_DISPLAY, (SubLObject)shop_datastructures.$sym236$SHOP_BASIC_SUFFICIENCY_COND_HTML_DISPLAY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym237$COND_FORMULA, (SubLObject)shop_datastructures.$sym224$SHOP_BASIC_SUFFICIENCY_COND, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list238);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym224$SHOP_BASIC_SUFFICIENCY_COND, (SubLObject)shop_datastructures.$sym237$COND_FORMULA, (SubLObject)shop_datastructures.$sym240$SHOP_BASIC_SUFFICIENCY_COND_COND_FORMULA_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym241$SET_COND_FORMULA, (SubLObject)shop_datastructures.$sym224$SHOP_BASIC_SUFFICIENCY_COND, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list69, (SubLObject)shop_datastructures.$list242);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym224$SHOP_BASIC_SUFFICIENCY_COND, (SubLObject)shop_datastructures.$sym241$SET_COND_FORMULA, (SubLObject)shop_datastructures.$sym244$SHOP_BASIC_SUFFICIENCY_COND_SET_COND_FORMULA_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym216$UNIFY_TASK_TO_HEAD_WITH_DATA, (SubLObject)shop_datastructures.$sym224$SHOP_BASIC_SUFFICIENCY_COND, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list83, (SubLObject)shop_datastructures.$list245);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym224$SHOP_BASIC_SUFFICIENCY_COND, (SubLObject)shop_datastructures.$sym216$UNIFY_TASK_TO_HEAD_WITH_DATA, (SubLObject)shop_datastructures.$sym247$SHOP_BASIC_SUFFICIENCY_COND_UNIFY_TASK_TO_HEAD_WITH_DATA_METHOD);
        interfaces.new_interface((SubLObject)shop_datastructures.$sym248$SHOP_PRECONDITION, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.NIL);
        classes.subloop_new_class((SubLObject)shop_datastructures.$sym249$SHOP_BASIC_PRECONDITION, (SubLObject)shop_datastructures.$sym182$SHOP_BASIC_METHOD, (SubLObject)shop_datastructures.$list250, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)shop_datastructures.$sym249$SHOP_BASIC_PRECONDITION, (SubLObject)shop_datastructures.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_datastructures.$sym249$SHOP_BASIC_PRECONDITION, (SubLObject)shop_datastructures.$sym251$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PRECONDITION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_datastructures.$sym249$SHOP_BASIC_PRECONDITION, (SubLObject)shop_datastructures.$sym252$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PRECONDITION_INSTANCE);
        subloop_reserved_initialize_shop_basic_precondition_class((SubLObject)shop_datastructures.$sym249$SHOP_BASIC_PRECONDITION);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym51$PRINT, (SubLObject)shop_datastructures.$sym249$SHOP_BASIC_PRECONDITION, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list52, (SubLObject)shop_datastructures.$list253);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym249$SHOP_BASIC_PRECONDITION, (SubLObject)shop_datastructures.$sym51$PRINT, (SubLObject)shop_datastructures.$sym256$SHOP_BASIC_PRECONDITION_PRINT_METHOD);
        classes.subloop_new_class((SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$sym1$OBJECT, (SubLObject)shop_datastructures.$list258, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list259);
        classes.class_set_implements_slot_listeners((SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$sym262$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PROBLEM_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$sym266$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PROBLEM_INSTANCE);
        subloop_reserved_initialize_shop_basic_problem_class((SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym19$INITIALIZE, (SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$list20, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list267);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$sym19$INITIALIZE, (SubLObject)shop_datastructures.$sym269$SHOP_BASIC_PROBLEM_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym270$INITIALIZE_PROBLEM, (SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list271, (SubLObject)shop_datastructures.$list272);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$sym270$INITIALIZE_PROBLEM, (SubLObject)shop_datastructures.$sym274$SHOP_BASIC_PROBLEM_INITIALIZE_PROBLEM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym51$PRINT, (SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list52, (SubLObject)shop_datastructures.$list275);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$sym51$PRINT, (SubLObject)shop_datastructures.$sym278$SHOP_BASIC_PROBLEM_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym279$SET_NAME, (SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list280, (SubLObject)shop_datastructures.$list281);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$sym279$SET_NAME, (SubLObject)shop_datastructures.$sym283$SHOP_BASIC_PROBLEM_SET_NAME_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym284$GET_NAME, (SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list285);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$sym284$GET_NAME, (SubLObject)shop_datastructures.$sym287$SHOP_BASIC_PROBLEM_GET_NAME_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym288$SET_DOMAIN, (SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list289, (SubLObject)shop_datastructures.$list290);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$sym288$SET_DOMAIN, (SubLObject)shop_datastructures.$sym292$SHOP_BASIC_PROBLEM_SET_DOMAIN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym293$GET_DOMAIN, (SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list294);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$sym293$GET_DOMAIN, (SubLObject)shop_datastructures.$sym296$SHOP_BASIC_PROBLEM_GET_DOMAIN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym297$GET_METHODS, (SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list298);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$sym297$GET_METHODS, (SubLObject)shop_datastructures.$sym301$SHOP_BASIC_PROBLEM_GET_METHODS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym302$GET_OPERATORS, (SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list303);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$sym302$GET_OPERATORS, (SubLObject)shop_datastructures.$sym306$SHOP_BASIC_PROBLEM_GET_OPERATORS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym307$GET_TASKS, (SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list308);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$sym307$GET_TASKS, (SubLObject)shop_datastructures.$sym310$SHOP_BASIC_PROBLEM_GET_TASKS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym311$SET_TASKS, (SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list312, (SubLObject)shop_datastructures.$list313);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$sym311$SET_TASKS, (SubLObject)shop_datastructures.$sym315$SHOP_BASIC_PROBLEM_SET_TASKS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym316$GET_STATE, (SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.NIL, (SubLObject)shop_datastructures.$list317);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$sym316$GET_STATE, (SubLObject)shop_datastructures.$sym319$SHOP_BASIC_PROBLEM_GET_STATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_datastructures.$sym320$SET_STATE, (SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$list10, (SubLObject)shop_datastructures.$list321, (SubLObject)shop_datastructures.$list322);
        methods.subloop_register_instance_method((SubLObject)shop_datastructures.$sym257$SHOP_BASIC_PROBLEM, (SubLObject)shop_datastructures.$sym320$SET_STATE, (SubLObject)shop_datastructures.$sym324$SHOP_BASIC_PROBLEM_SET_STATE_METHOD);
        sunit_external.define_test_category((SubLObject)shop_datastructures.$str325$SHOP_Category, (SubLObject)shop_datastructures.UNPROVIDED);
        sunit_external.define_test_suite((SubLObject)shop_datastructures.$str326$SHOP, (SubLObject)shop_datastructures.$list327, (SubLObject)shop_datastructures.UNPROVIDED, (SubLObject)shop_datastructures.UNPROVIDED);
        return (SubLObject)shop_datastructures.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_shop_datastructures_file();
    }
    
    @Override
	public void initializeVariables() {
        init_shop_datastructures_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_shop_datastructures_file();
    }
    
    static {
        me = (SubLFile)new shop_datastructures();
        shop_datastructures.$shop_unify_failed$ = null;
        shop_datastructures.$shop_empty_unifier$ = null;
        $sym0$SHOP_INDEXED_OBJECT = SubLObjectFactory.makeSymbol("SHOP-INDEXED-OBJECT");
        $sym1$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-INDEX"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym3$INSTANCE_INDEX = SubLObjectFactory.makeSymbol("INSTANCE-INDEX");
        $sym4$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym5$SUBLOOP_RESERVED_INITIALIZE_SHOP_INDEXED_OBJECT_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-INDEXED-OBJECT-CLASS");
        $sym6$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym7$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym8$SUBLOOP_RESERVED_INITIALIZE_SHOP_INDEXED_OBJECT_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-INDEXED-OBJECT-INSTANCE");
        $sym9$FIND_INSTANCE = SubLObjectFactory.makeSymbol("FIND-INSTANCE");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"));
        $list12 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)shop_datastructures.NIL)));
        $sym13$OUTER_CATCH_FOR_SHOP_INDEXED_OBJECT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-INDEXED-OBJECT-METHOD");
        $sym14$SHOP_INDEXED_OBJECT_FIND_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("SHOP-INDEXED-OBJECT-FIND-INSTANCE-METHOD");
        $sym15$ADD_TO_INDEX = SubLObjectFactory.makeSymbol("ADD-TO-INDEX");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-NUMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-OBJECT-INSTANCE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SHOP-INDEXED-OBJECT-INSTANCE-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-INDEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SHOP-INDEXED-OBJECT-INSTANCE-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_datastructures.EQ), (SubLObject)shop_datastructures.TEN_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-INDEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SHOP-INDEXED-OBJECT-INSTANCE-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-ENTER"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_datastructures.NIL)));
        $sym18$SHOP_INDEXED_OBJECT_ADD_TO_INDEX_METHOD = SubLObjectFactory.makeSymbol("SHOP-INDEXED-OBJECT-ADD-TO-INDEX-METHOD");
        $sym19$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list21 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("*SHOP-OBJECT-INDEXING?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-TO-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym22$SHOP_INDEXED_OBJECT_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SHOP-INDEXED-OBJECT-INITIALIZE-METHOD");
        $sym23$SHOP_PROBLEM = SubLObjectFactory.makeSymbol("SHOP-PROBLEM");
        $list24 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-PROBLEM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("STATE"), (SubLObject)SubLObjectFactory.makeSymbol("TASKS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NAME"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-NAME"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STATE"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-STATE"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TASKS"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-TASKS"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DOMAIN"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DOMAIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOMAIN")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OPERATORS"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-METHODS"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym25$SHOP_PLANNER_RULE = SubLObjectFactory.makeSymbol("SHOP-PLANNER-RULE");
        $list26 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-HEAD"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFY-TASK-TO-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTIONS"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-DISPLAY"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-ASSERTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-LIST")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym27$SHOP_OPERATOR = SubLObjectFactory.makeSymbol("SHOP-OPERATOR");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXTENDS"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-PLANNER-RULE"));
        $list29 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ADDS"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-LITERALS-TO-ADDS"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DELETES"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-LITERALS-TO-DELETES"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym30$SHOP_SUFFICIENCY_CONDITION = SubLObjectFactory.makeSymbol("SHOP-SUFFICIENCY-CONDITION");
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COND-FORMULA"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-COND-FORMULA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORM")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym32$SHOP_METHOD = SubLObjectFactory.makeSymbol("SHOP-METHOD");
        $list33 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-DECOMPOSITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DECOMP")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DECOMPOSITION"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PRECONDITION"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INIT"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET1"), (SubLObject)SubLObjectFactory.makeSymbol("SET2"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_datastructures.EQL))));
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"));
        $kw36$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw37$TEST = SubLObjectFactory.makeKeyword("TEST");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_datastructures.EQL);
        $sym39$SHOP_MY_UNION_FUNC = SubLObjectFactory.makeSymbol("SHOP-MY-UNION-FUNC");
        $kw40$FAIL = SubLObjectFactory.makeKeyword("FAIL");
        $sym41$SHOP_COMPOSE_SUBSTITUTIONS_TEST = SubLObjectFactory.makeSymbol("SHOP-COMPOSE-SUBSTITUTIONS-TEST");
        $str42$_ = SubLObjectFactory.makeString("?");
        $sym43$SHOP_STANDARDIZER_GENSYM = SubLObjectFactory.makeSymbol("SHOP-STANDARDIZER-GENSYM");
        $sym44$SHOP_BASIC_PLANNER_RULE = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-RULE");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-PLANNER-RULE"));
        $list46 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-LIST"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym47$ASSERTION_LIST = SubLObjectFactory.makeSymbol("ASSERTION-LIST");
        $sym48$HEAD = SubLObjectFactory.makeSymbol("HEAD");
        $sym49$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_RULE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-RULE-CLASS");
        $sym50$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLANNER_RULE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLANNER-RULE-INSTANCE");
        $sym51$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list53 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<PLANNER RULE-~S:~S>"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<Malformed Instance>"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym54$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-RULE-METHOD");
        $str55$__PLANNER_RULE__S__S_ = SubLObjectFactory.makeString("#<PLANNER RULE-~S:~S>");
        $str56$__Malformed_Instance_ = SubLObjectFactory.makeString("#<Malformed Instance>");
        $sym57$SHOP_BASIC_PLANNER_RULE_PRINT_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-RULE-PRINT-METHOD");
        $sym58$HTML_DISPLAY = SubLObjectFactory.makeSymbol("HTML-DISPLAY");
        $list59 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-STREAM*"), (SubLObject)shop_datastructures.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym60$SHOP_BASIC_PLANNER_RULE_HTML_DISPLAY_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-RULE-HTML-DISPLAY-METHOD");
        $sym61$PRED = SubLObjectFactory.makeSymbol("PRED");
        $list62 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"))));
        $sym63$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-RULE-METHOD");
        $sym64$SHOP_BASIC_PLANNER_RULE_PRED_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-RULE-PRED-METHOD");
        $list65 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD")));
        $sym66$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-RULE-METHOD");
        $sym67$SHOP_BASIC_PLANNER_RULE_HEAD_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-RULE-HEAD-METHOD");
        $sym68$SET_HEAD = SubLObjectFactory.makeSymbol("SET-HEAD");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORM"));
        $list70 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("FORM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD")));
        $sym71$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-RULE-METHOD");
        $sym72$SHOP_BASIC_PLANNER_RULE_SET_HEAD_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-RULE-SET-HEAD-METHOD");
        $sym73$ASSERTIONS = SubLObjectFactory.makeSymbol("ASSERTIONS");
        $list74 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-LIST")));
        $sym75$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-RULE-METHOD");
        $sym76$SHOP_BASIC_PLANNER_RULE_ASSERTIONS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-RULE-ASSERTIONS-METHOD");
        $sym77$SET_ASSERTIONS = SubLObjectFactory.makeSymbol("SET-ASSERTIONS");
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTIONS"));
        $list79 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTIONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTIONS")));
        $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-RULE-METHOD");
        $sym81$SHOP_BASIC_PLANNER_RULE_SET_ASSERTIONS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-RULE-SET-ASSERTIONS-METHOD");
        $sym82$UNIFY_TASK_TO_HEAD = SubLObjectFactory.makeSymbol("UNIFY-TASK-TO-HEAD");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"));
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TASK hl-formula-p\n   @return listp"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-UNIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-UNIFY"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)shop_datastructures.EQ, (SubLObject)SubLObjectFactory.makeKeyword("FAIL"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-UNIFIER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-UNIFIER")))));
        $sym85$OUTER_CATCH_FOR_SHOP_BASIC_PLANNER_RULE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PLANNER-RULE-METHOD");
        $sym86$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym87$SHOP_BASIC_PLANNER_RULE_UNIFY_TASK_TO_HEAD_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-RULE-UNIFY-TASK-TO-HEAD-METHOD");
        $sym88$SHOP_CONDITIONAL_EFFECT = SubLObjectFactory.makeSymbol("SHOP-CONDITIONAL-EFFECT");
        $list89 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADDS"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INIT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COND"), (SubLObject)SubLObjectFactory.makeSymbol("ADDS"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym90$SHOP_BASIC_CONDITIONAL_EFFECT = SubLObjectFactory.makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT");
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-CONDITIONAL-EFFECT"));
        $list92 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADDS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym93$CONDITION = SubLObjectFactory.makeSymbol("CONDITION");
        $sym94$DELETES = SubLObjectFactory.makeSymbol("DELETES");
        $sym95$ADDS = SubLObjectFactory.makeSymbol("ADDS");
        $sym96$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_CONDITIONAL_EFFECT_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-CONDITIONAL-EFFECT-CLASS");
        $sym97$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_CONDITIONAL_EFFECT_INSTANC = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-CONDITIONAL-EFFECT-INSTANCE");
        $list98 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<COND-EFFECT-~S:~S>"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<Malformed Instance>"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym99$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-CONDITIONAL-EFFECT-METHOD");
        $str100$__COND_EFFECT__S__S_ = SubLObjectFactory.makeString("#<COND-EFFECT-~S:~S>");
        $sym101$SHOP_BASIC_CONDITIONAL_EFFECT_PRINT_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT-PRINT-METHOD");
        $list102 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Condition: ")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Adds: ")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADDS")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Deletes: ")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Assertion: ")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-LIST")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_datastructures.NIL) });
        $sym103$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-CONDITIONAL-EFFECT-METHOD");
        $str104$Condition__ = SubLObjectFactory.makeString("Condition: ");
        $str105$Adds__ = SubLObjectFactory.makeString("Adds: ");
        $str106$Deletes__ = SubLObjectFactory.makeString("Deletes: ");
        $str107$Assertion__ = SubLObjectFactory.makeString("Assertion: ");
        $sym108$SHOP_BASIC_CONDITIONAL_EFFECT_HTML_DISPLAY_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT-HTML-DISPLAY-METHOD");
        $sym109$INIT = SubLObjectFactory.makeSymbol("INIT");
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COND"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ADDS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DELETES"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ASSERTION"));
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param NEW-HEAD listp\n   @param NEW-COND listp\n   @param NEW-ADDS listp\n   @param NEW-DELETES listp"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-HEAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ADDS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ADDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DELETES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-COND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_datastructures.NIL));
        $sym112$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-CONDITIONAL-EFFECT-METHOD");
        $sym113$SHOP_BASIC_CONDITIONAL_EFFECT_INIT_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT-INIT-METHOD");
        $list114 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ADDS")));
        $sym115$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-CONDITIONAL-EFFECT-METHOD");
        $sym116$SHOP_BASIC_CONDITIONAL_EFFECT_ADDS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT-ADDS-METHOD");
        $list117 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES")));
        $sym118$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-CONDITIONAL-EFFECT-METHOD");
        $sym119$SHOP_BASIC_CONDITIONAL_EFFECT_DELETES_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT-DELETES-METHOD");
        $list120 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION")));
        $sym121$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-CONDITIONAL-EFFECT-METHOD");
        $sym122$SHOP_BASIC_CONDITIONAL_EFFECT_CONDITION_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT-CONDITION-METHOD");
        $sym123$ASSERTION = SubLObjectFactory.makeSymbol("ASSERTION");
        $sym124$OUTER_CATCH_FOR_SHOP_BASIC_CONDITIONAL_EFFECT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-CONDITIONAL-EFFECT-METHOD");
        $sym125$SHOP_BASIC_CONDITIONAL_EFFECT_ASSERTION_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT-ASSERTION-METHOD");
        $sym126$SHOP_BASIC_OPERATOR = SubLObjectFactory.makeSymbol("SHOP-BASIC-OPERATOR");
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-OPERATOR"));
        $list128 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADDS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONDITIONAL-EFFECTS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COST"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITIONAL-EFFECTS"), (SubLObject)shop_datastructures.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym129$COST = SubLObjectFactory.makeSymbol("COST");
        $sym130$CONDITIONAL_EFFECTS = SubLObjectFactory.makeSymbol("CONDITIONAL-EFFECTS");
        $sym131$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_OPERATOR_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-OPERATOR-CLASS");
        $sym132$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_OPERATOR_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-OPERATOR-INSTANCE");
        $list133 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<OPERATOR-~S:~S>"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<Malformed Instance>"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym134$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD");
        $str135$__OPERATOR__S__S_ = SubLObjectFactory.makeString("#<OPERATOR-~S:~S>");
        $sym136$SHOP_BASIC_OPERATOR_PRINT_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-OPERATOR-PRINT-METHOD");
        $list137 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-LITERALS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADDS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE-LITERALS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SHOP-BASIC-OPERATOR-COST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("  Head:")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("  Add-literals: ")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-LITERALS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("  Delete-literals: ")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-LITERALS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FORMAT"), (SubLObject)SubLObjectFactory.makeString("  Cost: ~S"), (SubLObject)SubLObjectFactory.makeSymbol("COST")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Assertion: ")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CB-FORM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-LIST")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"), (SubLObject)shop_datastructures.TWO_INTEGER) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_datastructures.NIL));
        $sym138$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD");
        $str139$__Head_ = SubLObjectFactory.makeString("  Head:");
        $str140$__Add_literals__ = SubLObjectFactory.makeString("  Add-literals: ");
        $str141$__Delete_literals__ = SubLObjectFactory.makeString("  Delete-literals: ");
        $str142$__Cost___S = SubLObjectFactory.makeString("  Cost: ~S");
        $sym143$CB_FORM = SubLObjectFactory.makeSymbol("CB-FORM");
        $sym144$SHOP_BASIC_OPERATOR_HTML_DISPLAY_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-OPERATOR-HTML-DISPLAY-METHOD");
        $list145 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ADDS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DELETES"));
        $list146 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param NEW-ASSERTION        assertion-p\n   @param NEW-HEAD             hl-formula-p\n   @param NEW-ADDS             listp   ;; of hl-formula-p\n   @param NEW-DELETES          listp   ;; of hl-formula-p\n   @return shop-basic-operator-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-HEAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ADDS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ADDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DELETES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COST"), (SubLObject)shop_datastructures.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym147$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD");
        $sym148$SHOP_BASIC_OPERATOR_INIT_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-OPERATOR-INIT-METHOD");
        $sym149$GET_ADDS = SubLObjectFactory.makeSymbol("GET-ADDS");
        $list150 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp ;; of hl-formula-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ADDS")));
        $sym151$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD");
        $sym152$SHOP_BASIC_OPERATOR_GET_ADDS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-OPERATOR-GET-ADDS-METHOD");
        $sym153$ADD_LITERALS_TO_ADDS = SubLObjectFactory.makeSymbol("ADD-LITERALS-TO-ADDS");
        $list154 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITS"));
        $list155 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param LITS listp ;; of literals\n   @return listp ;; of hl-formula-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ADDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNION"), (SubLObject)SubLObjectFactory.makeSymbol("ADDS"), (SubLObject)SubLObjectFactory.makeSymbol("LITS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_datastructures.EQUAL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ADDS")));
        $sym156$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD");
        $sym157$SHOP_BASIC_OPERATOR_ADD_LITERALS_TO_ADDS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-OPERATOR-ADD-LITERALS-TO-ADDS-METHOD");
        $sym158$GET_DELETES = SubLObjectFactory.makeSymbol("GET-DELETES");
        $list159 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp ;; of hl-formula-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES")));
        $sym160$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD");
        $sym161$SHOP_BASIC_OPERATOR_GET_DELETES_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-OPERATOR-GET-DELETES-METHOD");
        $list162 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITIONAL-EFFECTS")));
        $sym163$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD");
        $sym164$SHOP_BASIC_OPERATOR_CONDITIONAL_EFFECTS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-OPERATOR-CONDITIONAL-EFFECTS-METHOD");
        $sym165$ADD_LITERALS_TO_DELETES = SubLObjectFactory.makeSymbol("ADD-LITERALS-TO-DELETES");
        $list166 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param LITS listp ;; of literals\n   @return listp ;; of hl-formula-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNION"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES"), (SubLObject)SubLObjectFactory.makeSymbol("LITS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_datastructures.EQUAL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES")));
        $sym167$OUTER_CATCH_FOR_SHOP_BASIC_OPERATOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-OPERATOR-METHOD");
        $sym168$SHOP_BASIC_OPERATOR_ADD_LITERALS_TO_DELETES_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-OPERATOR-ADD-LITERALS-TO-DELETES-METHOD");
        $sym169$UNIT_TEST = SubLObjectFactory.makeSymbol("UNIT-TEST");
        $list170 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $list171 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBOSE?"));
        $list172 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST-OP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-OPERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-OPERATOR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-LIST-1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("P"), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("Q"), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Z"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-LIST-2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("Q"), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Z")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("R"), (SubLObject)SubLObjectFactory.makeSymbol("?W"), (SubLObject)SubLObjectFactory.makeSymbol("?X"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE-LIST-1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("P"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)SubLObjectFactory.makeSymbol("?X"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE-LIST-2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("Q"), (SubLObject)SubLObjectFactory.makeSymbol("?Z"), (SubLObject)SubLObjectFactory.makeSymbol("?W")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-OP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-LITERALS-TO-ADDS")), (SubLObject)SubLObjectFactory.makeSymbol("ADD-LIST-1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-OP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-LITERALS-TO-ADDS")), (SubLObject)SubLObjectFactory.makeSymbol("ADD-LIST-2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-OP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-LITERALS-TO-DELETES")), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-LIST-1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-OP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-LITERALS-TO-DELETES")), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-LIST-2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OP-ADDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-OP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-ADDS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTROL-ADDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNION"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-LIST-1"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-LIST-2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_datastructures.EQUAL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OP-DELETES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-OP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DELETES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTROL-DELETES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNION"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-LIST-1"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-LIST-2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_datastructures.EQUAL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("VERBOSE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)shop_datastructures.T, (SubLObject)SubLObjectFactory.makeString("op-adds ~s~%control-adds ~s~%"), (SubLObject)SubLObjectFactory.makeSymbol("OP-ADDS"), (SubLObject)SubLObjectFactory.makeSymbol("CONTROL-ADDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)shop_datastructures.T, (SubLObject)SubLObjectFactory.makeString("op-deletes ~s~%control-deletes ~s~%"), (SubLObject)SubLObjectFactory.makeSymbol("OP-DELETES"), (SubLObject)SubLObjectFactory.makeSymbol("CONTROL-DELETES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSETP"), (SubLObject)SubLObjectFactory.makeSymbol("CONTROL-ADDS"), (SubLObject)SubLObjectFactory.makeSymbol("OP-ADDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSETP"), (SubLObject)SubLObjectFactory.makeSymbol("OP-ADDS"), (SubLObject)SubLObjectFactory.makeSymbol("CONTROL-ADDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSETP"), (SubLObject)SubLObjectFactory.makeSymbol("CONTROL-DELETES"), (SubLObject)SubLObjectFactory.makeSymbol("OP-DELETES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSETP"), (SubLObject)SubLObjectFactory.makeSymbol("OP-DELETES"), (SubLObject)SubLObjectFactory.makeSymbol("CONTROL-DELETES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)SubLObjectFactory.makeString("shop-basic-operator:unit-test: --> SUCESSFUL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERPRI")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_datastructures.T)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC"), (SubLObject)SubLObjectFactory.makeString("shop-basic-operator:unit-test: --> FAILED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERPRI")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_datastructures.NIL))))));
        $list173 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("P"), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("Q"), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Z")));
        $list174 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("Q"), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Z")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("R"), (SubLObject)SubLObjectFactory.makeSymbol("?W"), (SubLObject)SubLObjectFactory.makeSymbol("?X")));
        $list175 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("P"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)SubLObjectFactory.makeSymbol("?X")));
        $list176 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("Q"), (SubLObject)SubLObjectFactory.makeSymbol("?Z"), (SubLObject)SubLObjectFactory.makeSymbol("?W")));
        $str177$op_adds__s__control_adds__s__ = SubLObjectFactory.makeString("op-adds ~s~%control-adds ~s~%");
        $str178$op_deletes__s__control_deletes__s = SubLObjectFactory.makeString("op-deletes ~s~%control-deletes ~s~%");
        $str179$shop_basic_operator_unit_test____ = SubLObjectFactory.makeString("shop-basic-operator:unit-test: --> SUCESSFUL");
        $str180$shop_basic_operator_unit_test____ = SubLObjectFactory.makeString("shop-basic-operator:unit-test: --> FAILED");
        $sym181$SHOP_BASIC_OPERATOR_UNIT_TEST_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-OPERATOR-UNIT-TEST-METHOD");
        $sym182$SHOP_BASIC_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-METHOD");
        $list183 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-METHOD"));
        $list184 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRECONDITION"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DECOMPOSITION"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym185$DECOMPOSITION = SubLObjectFactory.makeSymbol("DECOMPOSITION");
        $sym186$PRECONDITION = SubLObjectFactory.makeSymbol("PRECONDITION");
        $sym187$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_METHOD_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-METHOD-CLASS");
        $sym188$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_METHOD_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-METHOD-INSTANCE");
        $list189 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<METHOD-~S:~S>"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<Malformed Instance>"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym190$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD");
        $str191$__METHOD__S__S_ = SubLObjectFactory.makeString("#<METHOD-~S:~S>");
        $sym192$SHOP_BASIC_METHOD_PRINT_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-METHOD-PRINT-METHOD");
        $list193 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Precondition: ")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("PRECONDITION")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Decomposition: ")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("DECOMPOSITION")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-FORMAT"), (SubLObject)SubLObjectFactory.makeString("Assertions: ")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CB-FORM")), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-LIST")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"), (SubLObject)shop_datastructures.TWO_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_datastructures.NIL) });
        $sym194$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD");
        $str195$Precondition__ = SubLObjectFactory.makeString("Precondition: ");
        $str196$Decomposition__ = SubLObjectFactory.makeString("Decomposition: ");
        $str197$Assertions__ = SubLObjectFactory.makeString("Assertions: ");
        $sym198$SHOP_BASIC_METHOD_HTML_DISPLAY_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-METHOD-HTML-DISPLAY-METHOD");
        $list199 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRECONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DECOMPOSITION"));
        $list200 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-HEAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PRECONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRECONDITION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DECOMPOSITION"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DECOMPOSITION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym201$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD");
        $sym202$SHOP_BASIC_METHOD_INIT_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-METHOD-INIT-METHOD");
        $sym203$SET_DECOMPOSITION = SubLObjectFactory.makeSymbol("SET-DECOMPOSITION");
        $list204 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DECOMP"));
        $list205 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DECOMPOSITION"), (SubLObject)SubLObjectFactory.makeSymbol("DECOMP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DECOMPOSITION")));
        $sym206$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD");
        $sym207$SHOP_BASIC_METHOD_SET_DECOMPOSITION_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-METHOD-SET-DECOMPOSITION-METHOD");
        $sym208$GET_DECOMPOSITION = SubLObjectFactory.makeSymbol("GET-DECOMPOSITION");
        $list209 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DECOMPOSITION")));
        $sym210$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD");
        $sym211$SHOP_BASIC_METHOD_GET_DECOMPOSITION_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-METHOD-GET-DECOMPOSITION-METHOD");
        $sym212$GET_PRECONDITION = SubLObjectFactory.makeSymbol("GET-PRECONDITION");
        $list213 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PRECONDITION")));
        $sym214$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD");
        $sym215$SHOP_BASIC_METHOD_GET_PRECONDITION_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-METHOD-GET-PRECONDITION-METHOD");
        $sym216$UNIFY_TASK_TO_HEAD_WITH_DATA = SubLObjectFactory.makeSymbol("UNIFY-TASK-TO-HEAD-WITH-DATA");
        $list217 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-UNIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIFY-TASK-TO-HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-RULE")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-UNIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-UNIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-APPLY-SUBSTITUTION"), (SubLObject)SubLObjectFactory.makeSymbol("PRECONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-UNIFIER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-APPLY-SUBSTITUTION"), (SubLObject)SubLObjectFactory.makeSymbol("DECOMPOSITION"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-UNIFIER")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_datastructures.NIL));
        $sym218$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD");
        $sym219$SHOP_BASIC_METHOD_UNIFY_TASK_TO_HEAD_WITH_DATA_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-METHOD-UNIFY-TASK-TO-HEAD-WITH-DATA-METHOD");
        $sym220$ADD_LITERALS_TO_PRECONDITION = SubLObjectFactory.makeSymbol("ADD-LITERALS-TO-PRECONDITION");
        $list221 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param LITS listp ;; of literals\n   @return listp ;; of hl-formula-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PRECONDITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNION"), (SubLObject)SubLObjectFactory.makeSymbol("PRECONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("LITS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PRECONDITION")));
        $sym222$OUTER_CATCH_FOR_SHOP_BASIC_METHOD_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-METHOD-METHOD");
        $sym223$SHOP_BASIC_METHOD_ADD_LITERALS_TO_PRECONDITION_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-METHOD-ADD-LITERALS-TO-PRECONDITION-METHOD");
        $sym224$SHOP_BASIC_SUFFICIENCY_COND = SubLObjectFactory.makeSymbol("SHOP-BASIC-SUFFICIENCY-COND");
        $list225 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-SUFFICIENCY-CONDITION"));
        $list226 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONDITION-FORMULA"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym227$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_SUFFICIENCY_COND_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-SUFFICIENCY-COND-CLASS");
        $sym228$CONDITION_FORMULA = SubLObjectFactory.makeSymbol("CONDITION-FORMULA");
        $sym229$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_SUFFICIENCY_COND_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-SUFFICIENCY-COND-INSTANCE");
        $list230 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<Shop-Scond-~S:~S>"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-NUMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<Malformed Instance>"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym231$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-SUFFICIENCY-COND-METHOD");
        $str232$__Shop_Scond__S__S_ = SubLObjectFactory.makeString("#<Shop-Scond-~S:~S>");
        $sym233$SHOP_BASIC_SUFFICIENCY_COND_PRINT_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-SUFFICIENCY-COND-PRINT-METHOD");
        $list234 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Condition: ")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION-FORMULA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-PRINC"), (SubLObject)SubLObjectFactory.makeString("Assertions: ")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CB-FORM")), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"), (SubLObject)shop_datastructures.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_datastructures.NIL));
        $sym235$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-SUFFICIENCY-COND-METHOD");
        $sym236$SHOP_BASIC_SUFFICIENCY_COND_HTML_DISPLAY_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-SUFFICIENCY-COND-HTML-DISPLAY-METHOD");
        $sym237$COND_FORMULA = SubLObjectFactory.makeSymbol("COND-FORMULA");
        $list238 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION-FORMULA")));
        $sym239$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-SUFFICIENCY-COND-METHOD");
        $sym240$SHOP_BASIC_SUFFICIENCY_COND_COND_FORMULA_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-SUFFICIENCY-COND-COND-FORMULA-METHOD");
        $sym241$SET_COND_FORMULA = SubLObjectFactory.makeSymbol("SET-COND-FORMULA");
        $list242 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("FORM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION-FORMULA")));
        $sym243$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-SUFFICIENCY-COND-METHOD");
        $sym244$SHOP_BASIC_SUFFICIENCY_COND_SET_COND_FORMULA_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-SUFFICIENCY-COND-SET-COND-FORMULA-METHOD");
        $list245 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-UNIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIFY-TASK-TO-HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-RULE")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-UNIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-UNIFIER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-APPLY-SUBSTITUTION"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-UNIFIER")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_datastructures.NIL));
        $sym246$OUTER_CATCH_FOR_SHOP_BASIC_SUFFICIENCY_COND_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-SUFFICIENCY-COND-METHOD");
        $sym247$SHOP_BASIC_SUFFICIENCY_COND_UNIFY_TASK_TO_HEAD_WITH_DATA_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-SUFFICIENCY-COND-UNIFY-TASK-TO-HEAD-WITH-DATA-METHOD");
        $sym248$SHOP_PRECONDITION = SubLObjectFactory.makeSymbol("SHOP-PRECONDITION");
        $sym249$SHOP_BASIC_PRECONDITION = SubLObjectFactory.makeSymbol("SHOP-BASIC-PRECONDITION");
        $list250 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-PRECONDITION"));
        $sym251$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PRECONDITION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PRECONDITION-CLASS");
        $sym252$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PRECONDITION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PRECONDITION-INSTANCE");
        $list253 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<SHOP-PRECOND-~S:~S>"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<Malformed Instance>"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym254$OUTER_CATCH_FOR_SHOP_BASIC_PRECONDITION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PRECONDITION-METHOD");
        $str255$__SHOP_PRECOND__S__S_ = SubLObjectFactory.makeString("#<SHOP-PRECOND-~S:~S>");
        $sym256$SHOP_BASIC_PRECONDITION_PRINT_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PRECONDITION-PRINT-METHOD");
        $sym257$SHOP_BASIC_PROBLEM = SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM");
        $list258 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-PROBLEM"));
        $list259 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-MT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASKS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym260$STATE = SubLObjectFactory.makeSymbol("STATE");
        $sym261$TASKS = SubLObjectFactory.makeSymbol("TASKS");
        $sym262$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PROBLEM_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PROBLEM-CLASS");
        $sym263$NAME = SubLObjectFactory.makeSymbol("NAME");
        $sym264$DOMAIN = SubLObjectFactory.makeSymbol("DOMAIN");
        $sym265$TASK_MT = SubLObjectFactory.makeSymbol("TASK-MT");
        $sym266$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PROBLEM_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PROBLEM-INSTANCE");
        $list267 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)shop_datastructures.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)shop_datastructures.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-MT"), (SubLObject)shop_datastructures.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TASKS"), (SubLObject)shop_datastructures.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("STATE"), (SubLObject)shop_datastructures.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym268$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");
        $sym269$SHOP_BASIC_PROBLEM_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM-INITIALIZE-METHOD");
        $sym270$INITIALIZE_PROBLEM = SubLObjectFactory.makeSymbol("INITIALIZE-PROBLEM");
        $list271 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TASKS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MT"));
        $list272 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DOMAIN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-NAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("STATE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-STATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TASKS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-TASKS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-MT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym273$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");
        $sym274$SHOP_BASIC_PROBLEM_INITIALIZE_PROBLEM_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM-INITIALIZE-PROBLEM-METHOD");
        $list275 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<PROBLEM-~S:~S>"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("NAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<Malformed Instance>"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym276$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");
        $str277$__PROBLEM__S__S_ = SubLObjectFactory.makeString("#<PROBLEM-~S:~S>");
        $sym278$SHOP_BASIC_PROBLEM_PRINT_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM-PRINT-METHOD");
        $sym279$SET_NAME = SubLObjectFactory.makeSymbol("SET-NAME");
        $list280 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("N"));
        $list281 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("N")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("N")));
        $sym282$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");
        $sym283$SHOP_BASIC_PROBLEM_SET_NAME_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM-SET-NAME-METHOD");
        $sym284$GET_NAME = SubLObjectFactory.makeSymbol("GET-NAME");
        $list285 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NAME")));
        $sym286$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");
        $sym287$SHOP_BASIC_PROBLEM_GET_NAME_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM-GET-NAME-METHOD");
        $sym288$SET_DOMAIN = SubLObjectFactory.makeSymbol("SET-DOMAIN");
        $list289 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("D"));
        $list290 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("D")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("D")));
        $sym291$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");
        $sym292$SHOP_BASIC_PROBLEM_SET_DOMAIN_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM-SET-DOMAIN-METHOD");
        $sym293$GET_DOMAIN = SubLObjectFactory.makeSymbol("GET-DOMAIN");
        $list294 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN")));
        $sym295$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");
        $sym296$SHOP_BASIC_PROBLEM_GET_DOMAIN_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM-GET-DOMAIN-METHOD");
        $sym297$GET_METHODS = SubLObjectFactory.makeSymbol("GET-METHODS");
        $list298 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("METHODS"))))));
        $sym299$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");
        $sym300$METHODS = SubLObjectFactory.makeSymbol("METHODS");
        $sym301$SHOP_BASIC_PROBLEM_GET_METHODS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM-GET-METHODS-METHOD");
        $sym302$GET_OPERATORS = SubLObjectFactory.makeSymbol("GET-OPERATORS");
        $list303 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-DOMAIN"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATORS"))))));
        $sym304$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");
        $sym305$OPERATORS = SubLObjectFactory.makeSymbol("OPERATORS");
        $sym306$SHOP_BASIC_PROBLEM_GET_OPERATORS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM-GET-OPERATORS-METHOD");
        $sym307$GET_TASKS = SubLObjectFactory.makeSymbol("GET-TASKS");
        $list308 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TASKS")));
        $sym309$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");
        $sym310$SHOP_BASIC_PROBLEM_GET_TASKS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM-GET-TASKS-METHOD");
        $sym311$SET_TASKS = SubLObjectFactory.makeSymbol("SET-TASKS");
        $list312 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TS"));
        $list313 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TASKS"), (SubLObject)SubLObjectFactory.makeSymbol("TS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TS")));
        $sym314$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");
        $sym315$SHOP_BASIC_PROBLEM_SET_TASKS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM-SET-TASKS-METHOD");
        $sym316$GET_STATE = SubLObjectFactory.makeSymbol("GET-STATE");
        $list317 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("STATE")));
        $sym318$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");
        $sym319$SHOP_BASIC_PROBLEM_GET_STATE_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM-GET-STATE-METHOD");
        $sym320$SET_STATE = SubLObjectFactory.makeSymbol("SET-STATE");
        $list321 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("S"));
        $list322 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("STATE")), (SubLObject)SubLObjectFactory.makeSymbol("S"))));
        $sym323$OUTER_CATCH_FOR_SHOP_BASIC_PROBLEM_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-PROBLEM-METHOD");
        $sym324$SHOP_BASIC_PROBLEM_SET_STATE_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-PROBLEM-SET-STATE-METHOD");
        $str325$SHOP_Category = SubLObjectFactory.makeString("SHOP Category");
        $str326$SHOP = SubLObjectFactory.makeString("SHOP");
        $list327 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("SHOP Category"));
    }
}

/*

	Total time: 1169 ms
	
*/