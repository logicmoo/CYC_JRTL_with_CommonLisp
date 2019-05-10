package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class shop_domain
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.shop_domain";
  public static final String myFingerPrint = "0fca9b782b574c090098484b1bea13b6198580068cb386e49426f6d70d1cc1de";
  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 2333L)
  private static SubLSymbol $shop_domain_planner_rule_slot_map$;
  private static final SubLSymbol $sym0$SHOP_DOMAIN;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$SHOP_BASIC_DOMAIN;
  private static final SubLSymbol $sym3$OBJECT;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$SIMPLE_SITUATION_PREDS;
  private static final SubLSymbol $sym7$MT;
  private static final SubLSymbol $sym8$SUFFICIENCIES;
  private static final SubLSymbol $sym9$COND_OPERATORS;
  private static final SubLSymbol $sym10$OPERATORS;
  private static final SubLSymbol $sym11$PRECONDITIONS;
  private static final SubLSymbol $sym12$METHODS;
  private static final SubLSymbol $sym13$INSTANCE_COUNT;
  private static final SubLSymbol $sym14$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_DOMAIN_CLASS;
  private static final SubLSymbol $sym15$ISOLATED_P;
  private static final SubLSymbol $sym16$INSTANCE_NUMBER;
  private static final SubLSymbol $sym17$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_DOMAIN_INSTANCE;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$INITIALIZE;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD;
  private static final SubLInteger $int23$100;
  private static final SubLSymbol $sym24$SHOP_BASIC_DOMAIN_INITIALIZE_METHOD;
  private static final SubLSymbol $sym25$PRINT;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD;
  private static final SubLString $str29$__DOMAIN__S__S_;
  private static final SubLString $str30$__Malformed_Instance_;
  private static final SubLSymbol $sym31$SHOP_BASIC_DOMAIN_PRINT_METHOD;
  private static final SubLSymbol $sym32$GET_NAME;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD;
  private static final SubLSymbol $sym36$SHOP_BASIC_DOMAIN_GET_NAME_METHOD;
  private static final SubLString $str37$var_A;
  private static final SubLSymbol $sym38$HL_VAR_;
  private static final SubLSymbol $sym39$RULE_TABLE_FOR_TYPE;
  private static final SubLList $list40;
  private static final SubLList $list41;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$SHOP_BASIC_DOMAIN_RULE_TABLE_FOR_TYPE_METHOD;
  private static final SubLSymbol $sym44$GET_PLANNER_RULES;
  private static final SubLList $list45;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$LISTP;
  private static final SubLSymbol $sym48$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym49$HASH_TABLE_P;
  private static final SubLSymbol $sym50$SHOP_BASIC_DOMAIN_GET_PLANNER_RULES_METHOD;
  private static final SubLSymbol $sym51$HTML_DISPLAY_ALL_RULES_OF_TYPE;
  private static final SubLList $list52;
  private static final SubLSymbol $sym53$STRING__;
  private static final SubLSymbol $sym54$SHOP_TASK_PRED_STRING;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$HTML_DISPLAY;
  private static final SubLSymbol $sym57$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_RULES_OF_TYPE_METHOD;
  private static final SubLSymbol $sym58$ADD_SUFFICIENT_CONDS;
  private static final SubLList $list59;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD;
  private static final SubLString $str62$_ADD_SUFFICIENCY_COND__S____S_is_;
  private static final SubLSymbol $sym63$PRED;
  private static final SubLSymbol $sym64$SHOP_BASIC_DOMAIN_ADD_SUFFICIENT_CONDS_METHOD;
  private static final SubLSymbol $sym65$GET_SUFFICIENT_CONDS;
  private static final SubLList $list66;
  private static final SubLList $list67;
  private static final SubLSymbol $sym68$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD;
  private static final SubLSymbol $kw69$FAIL;
  private static final SubLSymbol $sym70$SHOP_BASIC_DOMAIN_GET_SUFFICIENT_CONDS_METHOD;
  private static final SubLSymbol $sym71$PRINT_ALL_SCONDS;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD;
  private static final SubLString $str74$___s;
  private static final SubLSymbol $sym75$SHOP_BASIC_DOMAIN_PRINT_ALL_SCONDS_METHOD;
  private static final SubLSymbol $sym76$HTML_DISPLAY_ALL_SCONDS;
  private static final SubLList $list77;
  private static final SubLSymbol $sym78$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_SCONDS_METHOD;
  private static final SubLSymbol $sym81$ADD_METHOD;
  private static final SubLList $list82;
  private static final SubLList $list83;
  private static final SubLSymbol $sym84$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD;
  private static final SubLString $str85$_ADD_METHOD__S____S_is_not_a_vali;
  private static final SubLSymbol $sym86$SHOP_BASIC_DOMAIN_ADD_METHOD_METHOD;
  private static final SubLSymbol $sym87$GET_METHODS;
  private static final SubLList $list88;
  private static final SubLSymbol $sym89$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD;
  private static final SubLSymbol $sym90$SHOP_BASIC_DOMAIN_GET_METHODS_METHOD;
  private static final SubLSymbol $sym91$PRINT_ALL_METHODS;
  private static final SubLList $list92;
  private static final SubLSymbol $sym93$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD;
  private static final SubLSymbol $sym94$SHOP_BASIC_DOMAIN_PRINT_ALL_METHODS_METHOD;
  private static final SubLSymbol $sym95$HTML_DISPLAY_ALL_METHODS;
  private static final SubLList $list96;
  private static final SubLSymbol $sym97$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD;
  private static final SubLList $list98;
  private static final SubLSymbol $sym99$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_METHODS_METHOD;
  private static final SubLSymbol $sym100$ADD_OPERATOR;
  private static final SubLList $list101;
  private static final SubLList $list102;
  private static final SubLSymbol $sym103$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD;
  private static final SubLString $str104$_ADD_OPERATOR__S____S_is_not_a_va;
  private static final SubLSymbol $sym105$NAME;
  private static final SubLSymbol $sym106$SHOP_BASIC_DOMAIN_ADD_OPERATOR_METHOD;
  private static final SubLSymbol $sym107$GET_OPERATORS;
  private static final SubLList $list108;
  private static final SubLSymbol $sym109$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD;
  private static final SubLSymbol $sym110$SHOP_BASIC_DOMAIN_GET_OPERATORS_METHOD;
  private static final SubLSymbol $sym111$PRINT_ALL_OPERATORS;
  private static final SubLList $list112;
  private static final SubLList $list113;
  private static final SubLSymbol $sym114$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD;
  private static final SubLSymbol $sym115$HEAD;
  private static final SubLSymbol $sym116$ADDS;
  private static final SubLSymbol $sym117$DELETES;
  private static final SubLSymbol $sym118$CONDITIONAL_EFFECTS;
  private static final SubLString $str119$____Head___S;
  private static final SubLString $str120$____Add_literals_______S;
  private static final SubLString $str121$____Delete_literals___S;
  private static final SubLString $str122$____Conditional_Effects___s;
  private static final SubLString $str123$____Cost___S;
  private static final SubLString $str124$__;
  private static final SubLSymbol $sym125$SHOP_BASIC_DOMAIN_PRINT_ALL_OPERATORS_METHOD;
  private static final SubLSymbol $sym126$HTML_DISPLAY_ALL_OPERATORS;
  private static final SubLList $list127;
  private static final SubLSymbol $sym128$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD;
  private static final SubLList $list129;
  private static final SubLSymbol $sym130$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_OPERATORS_METHOD;
  private static final SubLSymbol $sym131$GET_CONDITIONAL_OPERATORS;
  private static final SubLList $list132;
  private static final SubLSymbol $sym133$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD;
  private static final SubLString $str134$_get_conditional_operators_shop_b;
  private static final SubLSymbol $sym135$SHOP_BASIC_DOMAIN_GET_CONDITIONAL_OPERATORS_METHOD;
  private static final SubLSymbol $sym136$HTML_DISPLAY_ALL_CONDITIONAL_OPERATORS;
  private static final SubLList $list137;
  private static final SubLSymbol $sym138$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD;
  private static final SubLSymbol $sym139$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_CONDITIONAL_OPERATORS_METHOD;
  private static final SubLSymbol $sym140$SHOP_CYC_DOMAIN;
  private static final SubLList $list141;
  private static final SubLSymbol $sym142$SUBLOOP_RESERVED_INITIALIZE_SHOP_CYC_DOMAIN_CLASS;
  private static final SubLSymbol $sym143$SUBLOOP_RESERVED_INITIALIZE_SHOP_CYC_DOMAIN_INSTANCE;
  private static final SubLList $list144;
  private static final SubLSymbol $sym145$SHOP_CYC_DOMAIN_INITIALIZE_METHOD;
  private static final SubLList $list146;
  private static final SubLSymbol $sym147$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD;
  private static final SubLString $str148$__SHOP_CYC_DOMAIN__S__S_;
  private static final SubLSymbol $sym149$SHOP_CYC_DOMAIN_PRINT_METHOD;
  private static final SubLSymbol $sym150$PROCESS_PLAN_ASSERTIONS_LIST;
  private static final SubLList $list151;
  private static final SubLList $list152;
  private static final SubLSymbol $sym153$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD;
  private static final SubLObject $const154$preconditionForMethod;
  private static final SubLObject $const155$methodForAction;
  private static final SubLObject $const156$preconditionFor_Props;
  private static final SubLObject $const157$effectOfAction_Props;
  private static final SubLObject $const158$sufficientFor_Props;
  private static final SubLObject $const159$effectOfActionIf_Props;
  private static final SubLString $str160$________________________using_pre;
  private static final SubLSymbol $sym161$SHOP_CYC_DOMAIN_PROCESS_PLAN_ASSERTIONS_LIST_METHOD;
  private static final SubLSymbol $sym162$GATHER_PLANNING_ASSERTIONS;
  private static final SubLList $list163;
  private static final SubLList $list164;
  private static final SubLSymbol $sym165$RELEVANT_MT_IS_GENL_MT;
  private static final SubLSymbol $kw166$POS;
  private static final SubLSymbol $sym167$SHOP_CYC_DOMAIN_GATHER_PLANNING_ASSERTIONS_METHOD;
  private static final SubLSymbol $sym168$INIT_SIMPLE_SITUATION_PREDS;
  private static final SubLList $list169;
  private static final SubLSymbol $sym170$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD;
  private static final SubLString $str171$_init_simple_situation_preds_shop;
  private static final SubLObject $const172$SimpleSituationPredicate;
  private static final SubLSymbol $sym173$SHOP_CYC_DOMAIN_INIT_SIMPLE_SITUATION_PREDS_METHOD;
  private static final SubLSymbol $sym174$INIT_DOMAIN_WITH_RULES;
  private static final SubLList $list175;
  private static final SubLList $list176;
  private static final SubLSymbol $sym177$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD;
  private static final SubLSymbol $sym178$SHOP_CYC_DOMAIN_INIT_DOMAIN_WITH_RULES_METHOD;
  private static final SubLSymbol $sym179$PROCESS_PLAN_ASSERTIONS;
  private static final SubLList $list180;
  private static final SubLSymbol $sym181$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD;
  private static final SubLSymbol $sym182$SHOP_CYC_DOMAIN_PROCESS_PLAN_ASSERTIONS_METHOD;
  private static final SubLSymbol $sym183$PROCESS_METHOD;
  private static final SubLList $list184;
  private static final SubLList $list185;
  private static final SubLSymbol $sym186$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD;
  private static final SubLSymbol $sym187$SHOP_BASIC_METHOD;
  private static final SubLSymbol $sym188$SHOP_CYC_DOMAIN_PROCESS_METHOD_METHOD;
  private static final SubLSymbol $sym189$PROCESS_PRECONDITION;
  private static final SubLList $list190;
  private static final SubLSymbol $sym191$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD;
  private static final SubLSymbol $kw192$PRIMITIVE;
  private static final SubLSymbol $sym193$SHOP_BASIC_PRECONDITION;
  private static final SubLSymbol $sym194$SHOP_CYC_DOMAIN_PROCESS_PRECONDITION_METHOD;
  private static final SubLSymbol $sym195$PROCESS_EFFECT;
  private static final SubLList $list196;
  private static final SubLSymbol $sym197$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD;
  private static final SubLSymbol $sym198$SHOP_BASIC_OPERATOR;
  private static final SubLSymbol $sym199$SHOP_CYC_DOMAIN_PROCESS_EFFECT_METHOD;
  private static final SubLSymbol $sym200$PROCESS_SUFFICIENT_COND;
  private static final SubLList $list201;
  private static final SubLSymbol $sym202$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD;
  private static final SubLSymbol $sym203$SHOP_BASIC_SUFFICIENCY_COND;
  private static final SubLSymbol $sym204$SET_HEAD;
  private static final SubLSymbol $sym205$SET_COND_FORMULA;
  private static final SubLSymbol $sym206$SET_ASSERTIONS;
  private static final SubLSymbol $sym207$SHOP_CYC_DOMAIN_PROCESS_SUFFICIENT_COND_METHOD;
  private static final SubLSymbol $sym208$PROCESS_CONDITIONAL_EFFECT;
  private static final SubLList $list209;
  private static final SubLSymbol $sym210$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD;
  private static final SubLSymbol $sym211$SHOP_BASIC_CONDITIONAL_EFFECT;
  private static final SubLString $str212$process_conditional_effect__a_is_;
  private static final SubLSymbol $sym213$SHOP_CYC_DOMAIN_PROCESS_CONDITIONAL_EFFECT_METHOD;
  private static final SubLObject $const214$implies;
  private static final SubLSymbol $sym215$SHOP_METHOD_FORMULA_P;
  private static final SubLSymbol $sym216$NEGATE;
  private static final SubLObject $const217$equals;
  private static final SubLObject $const218$TheList;
  private static final SubLObject $const219$and;

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 799L)
  public static SubLObject shop_domain_p(final SubLObject v_shop_domain)
  {
    return interfaces.subloop_instanceof_interface( v_shop_domain, $sym0$SHOP_DOMAIN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
  public static SubLObject get_shop_basic_domain_simple_situation_preds(final SubLObject shop_basic_domain)
  {
    return classes.subloop_get_access_protected_instance_slot( shop_basic_domain, SEVEN_INTEGER, $sym6$SIMPLE_SITUATION_PREDS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
  public static SubLObject set_shop_basic_domain_simple_situation_preds(final SubLObject shop_basic_domain, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( shop_basic_domain, value, SEVEN_INTEGER, $sym6$SIMPLE_SITUATION_PREDS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
  public static SubLObject get_shop_basic_domain_mt(final SubLObject shop_basic_domain)
  {
    return classes.subloop_get_access_protected_instance_slot( shop_basic_domain, SIX_INTEGER, $sym7$MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
  public static SubLObject set_shop_basic_domain_mt(final SubLObject shop_basic_domain, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( shop_basic_domain, value, SIX_INTEGER, $sym7$MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
  public static SubLObject get_shop_basic_domain_sufficiencies(final SubLObject shop_basic_domain)
  {
    return classes.subloop_get_access_protected_instance_slot( shop_basic_domain, FIVE_INTEGER, $sym8$SUFFICIENCIES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
  public static SubLObject set_shop_basic_domain_sufficiencies(final SubLObject shop_basic_domain, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( shop_basic_domain, value, FIVE_INTEGER, $sym8$SUFFICIENCIES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
  public static SubLObject get_shop_basic_domain_cond_operators(final SubLObject shop_basic_domain)
  {
    return classes.subloop_get_access_protected_instance_slot( shop_basic_domain, FOUR_INTEGER, $sym9$COND_OPERATORS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
  public static SubLObject set_shop_basic_domain_cond_operators(final SubLObject shop_basic_domain, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( shop_basic_domain, value, FOUR_INTEGER, $sym9$COND_OPERATORS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
  public static SubLObject get_shop_basic_domain_operators(final SubLObject shop_basic_domain)
  {
    return classes.subloop_get_access_protected_instance_slot( shop_basic_domain, THREE_INTEGER, $sym10$OPERATORS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
  public static SubLObject set_shop_basic_domain_operators(final SubLObject shop_basic_domain, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( shop_basic_domain, value, THREE_INTEGER, $sym10$OPERATORS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
  public static SubLObject get_shop_basic_domain_preconditions(final SubLObject shop_basic_domain)
  {
    return classes.subloop_get_access_protected_instance_slot( shop_basic_domain, TWO_INTEGER, $sym11$PRECONDITIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
  public static SubLObject set_shop_basic_domain_preconditions(final SubLObject shop_basic_domain, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( shop_basic_domain, value, TWO_INTEGER, $sym11$PRECONDITIONS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
  public static SubLObject get_shop_basic_domain_methods(final SubLObject shop_basic_domain)
  {
    return classes.subloop_get_access_protected_instance_slot( shop_basic_domain, ONE_INTEGER, $sym12$METHODS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
  public static SubLObject set_shop_basic_domain_methods(final SubLObject shop_basic_domain, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( shop_basic_domain, value, ONE_INTEGER, $sym12$METHODS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
  public static SubLObject subloop_reserved_initialize_shop_basic_domain_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym13$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
  public static SubLObject subloop_reserved_initialize_shop_basic_domain_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym15$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym16$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$SHOP_BASIC_DOMAIN, $sym12$METHODS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$SHOP_BASIC_DOMAIN, $sym11$PRECONDITIONS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$SHOP_BASIC_DOMAIN, $sym10$OPERATORS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$SHOP_BASIC_DOMAIN, $sym9$COND_OPERATORS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$SHOP_BASIC_DOMAIN, $sym8$SUFFICIENCIES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$SHOP_BASIC_DOMAIN, $sym7$MT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$SHOP_BASIC_DOMAIN, $sym6$SIMPLE_SITUATION_PREDS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
  public static SubLObject shop_basic_domain_p(final SubLObject shop_basic_domain)
  {
    return classes.subloop_instanceof_class( shop_basic_domain, $sym2$SHOP_BASIC_DOMAIN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 2792L)
  public static SubLObject shop_domain_rule_table_for_type(final SubLObject type)
  {
    return list_utilities.alist_lookup( $shop_domain_planner_rule_slot_map$.getGlobalValue(), type, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 2914L)
  public static SubLObject shop_basic_domain_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_domain_method = NIL;
    SubLObject mt = get_shop_basic_domain_mt( self );
    SubLObject sufficiencies = get_shop_basic_domain_sufficiencies( self );
    SubLObject cond_operators = get_shop_basic_domain_cond_operators( self );
    SubLObject operators = get_shop_basic_domain_operators( self );
    SubLObject preconditions = get_shop_basic_domain_preconditions( self );
    SubLObject v_methods = get_shop_basic_domain_methods( self );
    try
    {
      thread.throwStack.push( $sym22$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
      try
      {
        object.object_initialize_method( self );
        mt = NIL;
        v_methods = Hashtables.make_hash_table( $int23$100, UNPROVIDED, UNPROVIDED );
        operators = Hashtables.make_hash_table( $int23$100, UNPROVIDED, UNPROVIDED );
        preconditions = Hashtables.make_hash_table( $int23$100, UNPROVIDED, UNPROVIDED );
        sufficiencies = Hashtables.make_hash_table( TEN_INTEGER, UNPROVIDED, UNPROVIDED );
        cond_operators = Hashtables.make_hash_table( TEN_INTEGER, UNPROVIDED, UNPROVIDED );
        Dynamic.sublisp_throw( $sym22$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_mt( self, mt );
          set_shop_basic_domain_sufficiencies( self, sufficiencies );
          set_shop_basic_domain_cond_operators( self, cond_operators );
          set_shop_basic_domain_operators( self, operators );
          set_shop_basic_domain_preconditions( self, preconditions );
          set_shop_basic_domain_methods( self, v_methods );
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
      catch_var_for_shop_basic_domain_method = Errors.handleThrowable( ccatch_env_var, $sym22$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 3437L)
  public static SubLObject shop_basic_domain_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_domain_method = NIL;
    final SubLObject mt = get_shop_basic_domain_mt( self );
    final SubLObject instance_number = object.get_object_instance_number( self );
    try
    {
      thread.throwStack.push( $sym28$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
      try
      {
        if( NIL != subloop_structures.instance_p( self ) )
        {
          PrintLow.format( stream, $str29$__DOMAIN__S__S_, instance_number, mt );
        }
        else
        {
          PrintLow.format( stream, $str30$__Malformed_Instance_ );
        }
        Dynamic.sublisp_throw( $sym28$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_mt( self, mt );
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
      catch_var_for_shop_basic_domain_method = Errors.handleThrowable( ccatch_env_var, $sym28$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 3665L)
  public static SubLObject shop_basic_domain_get_name_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_domain_method = NIL;
    final SubLObject mt = get_shop_basic_domain_mt( self );
    try
    {
      thread.throwStack.push( $sym35$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym35$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, mt );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_mt( self, mt );
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
      catch_var_for_shop_basic_domain_method = Errors.handleThrowable( ccatch_env_var, $sym35$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 3740L)
  public static SubLObject shop_task_pred_string(final SubLObject entry)
  {
    if( entry.isList() )
    {
      final SubLObject item = entry.first();
      if( NIL != constant_handles.constant_p( item ) )
      {
        return constants_high.constant_name( item );
      }
      if( NIL != variables.variable_p( item ) )
      {
        return PrintLow.format( NIL, $str37$var_A, variables.variable_id( item ) );
      }
    }
    return string_utilities.$empty_string$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 5551L)
  public static SubLObject shop_find_all_matching_rules(final SubLObject task, final SubLObject hash_table)
  {
    final SubLObject keys = hash_table_utilities.hash_table_keys( hash_table );
    final SubLObject var_keys = list_utilities.remove_if_not( $sym38$HL_VAR_, keys, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject values = NIL;
    SubLObject cdolist_list_var = var_keys;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      values = ConsesLow.append( Hashtables.gethash( item, hash_table, UNPROVIDED ), values );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return ConsesLow.append( Hashtables.gethash( cycl_utilities.formula_operator( task ), hash_table, UNPROVIDED ), values );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 5886L)
  public static SubLObject shop_basic_domain_rule_table_for_type_method(final SubLObject self, final SubLObject type)
  {
    final SubLObject slotname = shop_domain_rule_table_for_type( type );
    return instances.get_slot( self, slotname );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 6062L)
  public static SubLObject shop_basic_domain_get_planner_rules_method(final SubLObject self, final SubLObject task, final SubLObject type)
  {
    assert NIL != Types.listp( task ) : task;
    assert NIL != Types.function_spec_p( type ) : type;
    final SubLObject rule_table = shop_basic_domain_rule_table_for_type_method( self, type );
    assert NIL != Types.hash_table_p( rule_table ) : rule_table;
    final SubLObject rule_list = shop_find_all_matching_rules( task, rule_table );
    SubLObject unified_rules = NIL;
    SubLObject cdolist_list_var = rule_list;
    SubLObject cur_rule = NIL;
    cur_rule = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == shop_datastructures.shop_unify_failedP( shop_datastructures.shop_unify( shop_datastructures.shop_basic_planner_rule_head_method( cur_rule ), task ) ) )
      {
        unified_rules = ConsesLow.cons( cur_rule, unified_rules );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cur_rule = cdolist_list_var.first();
    }
    return unified_rules;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 6625L)
  public static SubLObject shop_basic_domain_html_display_all_rules_of_type_method(final SubLObject self, final SubLObject type)
  {
    assert NIL != Types.function_spec_p( type ) : type;
    final SubLObject rule_table = shop_basic_domain_rule_table_for_type_method( self, type );
    assert NIL != Types.hash_table_p( rule_table ) : rule_table;
    SubLObject alist = hash_table_utilities.hash_table_to_alist( rule_table );
    SubLObject cdolist_list_var;
    alist = ( cdolist_list_var = Sort.sort( alist, Symbols.symbol_function( $sym53$STRING__ ), $sym54$SHOP_TASK_PRED_STRING ) );
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject cur_name = NIL;
      SubLObject cur_rules = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
      cur_name = current.first();
      current = ( cur_rules = current.rest() );
      cb_utilities.cb_form( cur_name, UNPROVIDED, UNPROVIDED );
      html_utilities.html_newline( UNPROVIDED );
      SubLObject cdolist_list_var_$1 = cur_rules;
      SubLObject cur_rule = NIL;
      cur_rule = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        methods.funcall_instance_method_with_0_args( cur_rule, $sym56$HTML_DISPLAY );
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        cur_rule = cdolist_list_var_$1.first();
      }
      html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 7146L)
  public static SubLObject shop_basic_domain_add_sufficient_conds_method(final SubLObject self, SubLObject cond)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_domain_method = NIL;
    final SubLObject sufficiencies = get_shop_basic_domain_sufficiencies( self );
    try
    {
      thread.throwStack.push( $sym61$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == shop_datastructures.shop_planner_rule_p( cond ) )
        {
          Errors.error( $str62$_ADD_SUFFICIENCY_COND__S____S_is_, self, cond );
        }
        cond = ConsesLow.cons( Hashtables.gethash( methods.funcall_instance_method_with_0_args( cond, $sym63$PRED ), sufficiencies, UNPROVIDED ), cond );
        Dynamic.sublisp_throw( $sym61$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_sufficiencies( self, sufficiencies );
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
      catch_var_for_shop_basic_domain_method = Errors.handleThrowable( ccatch_env_var, $sym61$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 7442L)
  public static SubLObject shop_basic_domain_get_sufficient_conds_method(final SubLObject self, final SubLObject task)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_domain_method = NIL;
    final SubLObject sufficiencies = get_shop_basic_domain_sufficiencies( self );
    try
    {
      thread.throwStack.push( $sym68$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
      try
      {
        assert NIL != Types.listp( task ) : task;
        final SubLObject task_op = cycl_utilities.formula_operator( task );
        final SubLObject scond_list = Hashtables.gethash( task_op, sufficiencies, UNPROVIDED );
        SubLObject unified_sconds = NIL;
        SubLObject cdolist_list_var = scond_list;
        SubLObject cur_scond = NIL;
        cur_scond = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( $kw69$FAIL != shop_datastructures.shop_unify( shop_datastructures.shop_basic_planner_rule_head_method( cur_scond ), task ) )
          {
            unified_sconds = ConsesLow.cons( cur_scond, unified_sconds );
          }
          cdolist_list_var = cdolist_list_var.rest();
          cur_scond = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym68$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, unified_sconds );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_sufficiencies( self, sufficiencies );
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
      catch_var_for_shop_basic_domain_method = Errors.handleThrowable( ccatch_env_var, $sym68$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 8134L)
  public static SubLObject shop_basic_domain_print_all_sconds_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_domain_method = NIL;
    final SubLObject sufficiencies = get_shop_basic_domain_sufficiencies( self );
    try
    {
      thread.throwStack.push( $sym73$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
      try
      {
        SubLObject cur_name = NIL;
        SubLObject cur_sconds = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( sufficiencies );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            cur_name = Hashtables.getEntryKey( cdohash_entry );
            cur_sconds = Hashtables.getEntryValue( cdohash_entry );
            PrintLow.format( T, $str74$___s, cur_name );
            SubLObject cdolist_list_var = cur_sconds;
            SubLObject cur_scond = NIL;
            cur_scond = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              object.describe_instance( cur_scond );
              cdolist_list_var = cdolist_list_var.rest();
              cur_scond = cdolist_list_var.first();
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
        Dynamic.sublisp_throw( $sym73$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_sufficiencies( self, sufficiencies );
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
      catch_var_for_shop_basic_domain_method = Errors.handleThrowable( ccatch_env_var, $sym73$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 8372L)
  public static SubLObject shop_basic_domain_html_display_all_sconds_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_domain_method = NIL;
    final SubLObject sufficiencies = get_shop_basic_domain_sufficiencies( self );
    try
    {
      thread.throwStack.push( $sym78$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
      try
      {
        SubLObject alist = hash_table_utilities.hash_table_to_alist( sufficiencies );
        SubLObject cdolist_list_var;
        alist = ( cdolist_list_var = Sort.sort( alist, Symbols.symbol_function( $sym53$STRING__ ), $sym54$SHOP_TASK_PRED_STRING ) );
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = cons;
          SubLObject cur_name = NIL;
          SubLObject cur_sconds = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
          cur_name = current.first();
          current = ( cur_sconds = current.rest() );
          cb_utilities.cb_form( cur_name, UNPROVIDED, UNPROVIDED );
          html_utilities.html_newline( UNPROVIDED );
          SubLObject cdolist_list_var_$2 = cur_sconds;
          SubLObject cur_scond = NIL;
          cur_scond = cdolist_list_var_$2.first();
          while ( NIL != cdolist_list_var_$2)
          {
            methods.funcall_instance_method_with_0_args( cur_scond, $sym56$HTML_DISPLAY );
            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
            cur_scond = cdolist_list_var_$2.first();
          }
          html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
          cdolist_list_var = cdolist_list_var.rest();
          cons = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym78$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_sufficiencies( self, sufficiencies );
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
      catch_var_for_shop_basic_domain_method = Errors.handleThrowable( ccatch_env_var, $sym78$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 8759L)
  public static SubLObject shop_basic_domain_add_method_method(final SubLObject self, final SubLObject method)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_domain_method = NIL;
    final SubLObject v_methods = get_shop_basic_domain_methods( self );
    try
    {
      thread.throwStack.push( $sym84$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == shop_datastructures.shop_method_p( method ) )
        {
          Errors.error( $str85$_ADD_METHOD__S____S_is_not_a_vali, self, method );
        }
        Hashtables.sethash( shop_datastructures.shop_basic_planner_rule_pred_method( method ), v_methods, ConsesLow.cons( method, Hashtables.gethash( shop_datastructures.shop_basic_planner_rule_pred_method( method ),
            v_methods, UNPROVIDED ) ) );
        Dynamic.sublisp_throw( $sym84$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_methods( self, v_methods );
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
      catch_var_for_shop_basic_domain_method = Errors.handleThrowable( ccatch_env_var, $sym84$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 9050L)
  public static SubLObject shop_basic_domain_get_methods_method(final SubLObject self, final SubLObject task)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_domain_method = NIL;
    final SubLObject v_methods = get_shop_basic_domain_methods( self );
    try
    {
      thread.throwStack.push( $sym89$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
      try
      {
        assert NIL != Types.listp( task ) : task;
        final SubLObject method_list = shop_find_all_matching_rules( task, v_methods );
        SubLObject unified_methods = NIL;
        SubLObject cdolist_list_var = method_list;
        SubLObject cur_method = NIL;
        cur_method = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == shop_datastructures.shop_unify_failedP( shop_datastructures.shop_unify( shop_datastructures.shop_basic_planner_rule_head_method( cur_method ), task ) ) )
          {
            unified_methods = ConsesLow.cons( cur_method, unified_methods );
          }
          cdolist_list_var = cdolist_list_var.rest();
          cur_method = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym89$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, unified_methods );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_methods( self, v_methods );
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
      catch_var_for_shop_basic_domain_method = Errors.handleThrowable( ccatch_env_var, $sym89$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 9773L)
  public static SubLObject shop_basic_domain_print_all_methods_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_domain_method = NIL;
    final SubLObject v_methods = get_shop_basic_domain_methods( self );
    try
    {
      thread.throwStack.push( $sym93$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
      try
      {
        SubLObject cur_name = NIL;
        SubLObject cur_methods = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( v_methods );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            cur_name = Hashtables.getEntryKey( cdohash_entry );
            cur_methods = Hashtables.getEntryValue( cdohash_entry );
            PrintLow.format( T, $str74$___s, cur_name );
            SubLObject cdolist_list_var = cur_methods;
            SubLObject cur_method = NIL;
            cur_method = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              object.describe_instance( cur_method );
              cdolist_list_var = cdolist_list_var.rest();
              cur_method = cdolist_list_var.first();
            }
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
        Dynamic.sublisp_throw( $sym93$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_methods( self, v_methods );
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
      catch_var_for_shop_basic_domain_method = Errors.handleThrowable( ccatch_env_var, $sym93$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 10086L)
  public static SubLObject shop_basic_domain_html_display_all_methods_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_domain_method = NIL;
    final SubLObject v_methods = get_shop_basic_domain_methods( self );
    try
    {
      thread.throwStack.push( $sym97$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
      try
      {
        SubLObject alist = hash_table_utilities.hash_table_to_alist( v_methods );
        if( NIL == alist )
        {
          Dynamic.sublisp_throw( $sym97$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, NIL );
        }
        SubLObject cdolist_list_var;
        alist = ( cdolist_list_var = Sort.sort( alist, Symbols.symbol_function( $sym53$STRING__ ), $sym54$SHOP_TASK_PRED_STRING ) );
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = cons;
          SubLObject cur_name = NIL;
          SubLObject cur_methods = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
          cur_name = current.first();
          current = ( cur_methods = current.rest() );
          cb_utilities.cb_form( cur_name, UNPROVIDED, UNPROVIDED );
          html_utilities.html_newline( UNPROVIDED );
          SubLObject cdolist_list_var_$3 = cur_methods;
          SubLObject cur_method = NIL;
          cur_method = cdolist_list_var_$3.first();
          while ( NIL != cdolist_list_var_$3)
          {
            methods.funcall_instance_method_with_0_args( cur_method, $sym56$HTML_DISPLAY );
            html_utilities.html_newline( UNPROVIDED );
            cdolist_list_var_$3 = cdolist_list_var_$3.rest();
            cur_method = cdolist_list_var_$3.first();
          }
          html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
          cdolist_list_var = cdolist_list_var.rest();
          cons = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym97$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_methods( self, v_methods );
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
      catch_var_for_shop_basic_domain_method = Errors.handleThrowable( ccatch_env_var, $sym97$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 10525L)
  public static SubLObject shop_basic_domain_add_operator_method(final SubLObject self, final SubLObject operator)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_domain_method = NIL;
    final SubLObject operators = get_shop_basic_domain_operators( self );
    try
    {
      thread.throwStack.push( $sym103$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == shop_datastructures.shop_operator_p( operator ) )
        {
          Errors.error( $str104$_ADD_OPERATOR__S____S_is_not_a_va, self, operator );
        }
        Hashtables.sethash( methods.funcall_instance_method_with_0_args( operator, $sym105$NAME ), operators, ConsesLow.cons( operator, Hashtables.gethash( methods.funcall_instance_method_with_0_args( operator,
            $sym105$NAME ), operators, UNPROVIDED ) ) );
        Dynamic.sublisp_throw( $sym103$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_operators( self, operators );
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
      catch_var_for_shop_basic_domain_method = Errors.handleThrowable( ccatch_env_var, $sym103$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 10809L)
  public static SubLObject shop_basic_domain_get_operators_method(final SubLObject self, final SubLObject task)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_domain_method = NIL;
    final SubLObject operators = get_shop_basic_domain_operators( self );
    try
    {
      thread.throwStack.push( $sym109$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
      try
      {
        assert NIL != Types.listp( task ) : task;
        final SubLObject pred = cycl_utilities.formula_operator( task );
        final SubLObject operator_list = Hashtables.gethash( pred, operators, UNPROVIDED );
        SubLObject results = NIL;
        SubLObject cdolist_list_var = operator_list;
        SubLObject op = NIL;
        op = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject cur_head = shop_datastructures.shop_basic_planner_rule_head_method( op );
          if( NIL == shop_datastructures.shop_unify_failedP( shop_datastructures.shop_unify( cur_head.rest(), task.rest() ) ) )
          {
            results = ConsesLow.cons( op, results );
          }
          cdolist_list_var = cdolist_list_var.rest();
          op = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym109$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, Sequences.nreverse( results ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_operators( self, operators );
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
      catch_var_for_shop_basic_domain_method = Errors.handleThrowable( ccatch_env_var, $sym109$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 11313L)
  public static SubLObject shop_basic_domain_print_all_operators_method(final SubLObject self, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_domain_method = NIL;
    final SubLObject operators = get_shop_basic_domain_operators( self );
    try
    {
      thread.throwStack.push( $sym114$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
      try
      {
        SubLObject x = NIL;
        SubLObject y = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( operators );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            x = Hashtables.getEntryKey( cdohash_entry );
            y = Hashtables.getEntryValue( cdohash_entry );
            final SubLObject temp = y.first();
            final SubLObject head = methods.funcall_instance_method_with_0_args( temp, $sym115$HEAD );
            final SubLObject add_literals = instances.get_slot( temp, $sym116$ADDS );
            final SubLObject delete_literals = instances.get_slot( temp, $sym117$DELETES );
            final SubLObject conditional_effects = instances.get_slot( temp, $sym118$CONDITIONAL_EFFECTS );
            final SubLObject cost = shop_datastructures.get_shop_basic_operator_cost( temp );
            PrintLow.format( stream, $str74$___s, x );
            PrintLow.format( stream, $str119$____Head___S, head );
            PrintLow.format( stream, $str120$____Add_literals_______S, add_literals );
            PrintLow.format( stream, $str121$____Delete_literals___S, delete_literals );
            PrintLow.format( stream, $str122$____Conditional_Effects___s, conditional_effects );
            PrintLow.format( stream, $str123$____Cost___S, cost );
            PrintLow.format( stream, $str124$__ );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
        Dynamic.sublisp_throw( $sym114$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_operators( self, operators );
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
      catch_var_for_shop_basic_domain_method = Errors.handleThrowable( ccatch_env_var, $sym114$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 12062L)
  public static SubLObject shop_basic_domain_html_display_all_operators_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_domain_method = NIL;
    final SubLObject operators = get_shop_basic_domain_operators( self );
    try
    {
      thread.throwStack.push( $sym128$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
      try
      {
        SubLObject alist = hash_table_utilities.hash_table_to_alist( operators );
        if( NIL == alist )
        {
          Dynamic.sublisp_throw( $sym128$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, NIL );
        }
        SubLObject cdolist_list_var;
        alist = ( cdolist_list_var = Sort.sort( alist, Symbols.symbol_function( $sym53$STRING__ ), $sym54$SHOP_TASK_PRED_STRING ) );
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = cons;
          SubLObject pred = NIL;
          SubLObject ops = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list129 );
          pred = current.first();
          current = ( ops = current.rest() );
          cb_utilities.cb_form( pred, UNPROVIDED, UNPROVIDED );
          html_utilities.html_newline( UNPROVIDED );
          SubLObject cdolist_list_var_$4 = ops;
          SubLObject cur_op = NIL;
          cur_op = cdolist_list_var_$4.first();
          while ( NIL != cdolist_list_var_$4)
          {
            methods.funcall_instance_method_with_0_args( cur_op, $sym56$HTML_DISPLAY );
            html_utilities.html_newline( UNPROVIDED );
            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
            cur_op = cdolist_list_var_$4.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          cons = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym128$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_operators( self, operators );
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
      catch_var_for_shop_basic_domain_method = Errors.handleThrowable( ccatch_env_var, $sym128$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 12457L)
  public static SubLObject shop_basic_domain_get_conditional_operators_method(final SubLObject self, final SubLObject task)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_domain_method = NIL;
    final SubLObject cond_operators = get_shop_basic_domain_cond_operators( self );
    try
    {
      thread.throwStack.push( $sym133$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
      try
      {
        assert NIL != Types.listp( task ) : task;
        final SubLObject pred = cycl_utilities.formula_operator( task );
        SubLObject results = NIL;
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == forts.fort_p( pred ) )
        {
          Errors.error( $str134$_get_conditional_operators_shop_b, task, pred );
        }
        SubLObject cdolist_list_var = shop_find_all_matching_rules( task, cond_operators );
        SubLObject op = NIL;
        op = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject cur_head = shop_datastructures.shop_basic_planner_rule_head_method( op );
          if( NIL == shop_datastructures.shop_unify_failedP( shop_datastructures.shop_unify( cur_head.rest(), task.rest() ) ) )
          {
            results = ConsesLow.cons( op, results );
          }
          cdolist_list_var = cdolist_list_var.rest();
          op = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym133$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, Sequences.nreverse( results ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_cond_operators( self, cond_operators );
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
      catch_var_for_shop_basic_domain_method = Errors.handleThrowable( ccatch_env_var, $sym133$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 13137L)
  public static SubLObject shop_basic_domain_html_display_all_conditional_operators_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_domain_method = NIL;
    final SubLObject cond_operators = get_shop_basic_domain_cond_operators( self );
    try
    {
      thread.throwStack.push( $sym138$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
      try
      {
        final SubLObject alist = hash_table_utilities.hash_table_to_alist( cond_operators );
        Sort.sort( alist, Symbols.symbol_function( $sym53$STRING__ ), $sym54$SHOP_TASK_PRED_STRING );
        SubLObject cdolist_list_var = alist;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = cons;
          SubLObject pred = NIL;
          SubLObject ops = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list129 );
          pred = current.first();
          current = ( ops = current.rest() );
          cb_utilities.cb_form( pred, UNPROVIDED, UNPROVIDED );
          html_utilities.html_newline( UNPROVIDED );
          SubLObject cdolist_list_var_$5 = ops;
          SubLObject cur_op = NIL;
          cur_op = cdolist_list_var_$5.first();
          while ( NIL != cdolist_list_var_$5)
          {
            methods.funcall_instance_method_with_0_args( cur_op, $sym56$HTML_DISPLAY );
            html_utilities.html_newline( UNPROVIDED );
            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
            cur_op = cdolist_list_var_$5.first();
          }
          cdolist_list_var = cdolist_list_var.rest();
          cons = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym138$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_cond_operators( self, cond_operators );
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
      catch_var_for_shop_basic_domain_method = Errors.handleThrowable( ccatch_env_var, $sym138$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 13499L)
  public static SubLObject subloop_reserved_initialize_shop_cyc_domain_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym13$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 13499L)
  public static SubLObject subloop_reserved_initialize_shop_cyc_domain_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym15$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym16$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$SHOP_BASIC_DOMAIN, $sym12$METHODS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$SHOP_BASIC_DOMAIN, $sym11$PRECONDITIONS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$SHOP_BASIC_DOMAIN, $sym10$OPERATORS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$SHOP_BASIC_DOMAIN, $sym9$COND_OPERATORS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$SHOP_BASIC_DOMAIN, $sym8$SUFFICIENCIES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$SHOP_BASIC_DOMAIN, $sym7$MT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$SHOP_BASIC_DOMAIN, $sym6$SIMPLE_SITUATION_PREDS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 13499L)
  public static SubLObject shop_cyc_domain_p(final SubLObject shop_cyc_domain)
  {
    return classes.subloop_instanceof_class( shop_cyc_domain, $sym140$SHOP_CYC_DOMAIN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 14378L)
  public static SubLObject shop_cyc_domain_initialize_method(final SubLObject self)
  {
    shop_basic_domain_initialize_method( self );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 14478L)
  public static SubLObject shop_cyc_domain_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_cyc_domain_method = NIL;
    final SubLObject mt = get_shop_basic_domain_mt( self );
    final SubLObject instance_number = object.get_object_instance_number( self );
    try
    {
      thread.throwStack.push( $sym147$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD );
      try
      {
        if( NIL != subloop_structures.instance_p( self ) )
        {
          PrintLow.format( stream, $str148$__SHOP_CYC_DOMAIN__S__S_, instance_number, mt );
        }
        else
        {
          PrintLow.format( stream, $str30$__Malformed_Instance_ );
        }
        Dynamic.sublisp_throw( $sym147$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_mt( self, mt );
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
      catch_var_for_shop_cyc_domain_method = Errors.handleThrowable( ccatch_env_var, $sym147$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_cyc_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 14713L)
  public static SubLObject shop_cyc_domain_process_plan_assertions_list_method(final SubLObject self, final SubLObject assertions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_cyc_domain_method = NIL;
    final SubLObject v_methods = get_shop_basic_domain_methods( self );
    try
    {
      thread.throwStack.push( $sym153$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD );
      try
      {
        SubLObject preconds = NIL;
        SubLObject effects = NIL;
        SubLObject pre_methods = NIL;
        SubLObject v_methods_$6 = NIL;
        SubLObject axioms = NIL;
        SubLObject sufficient_conds = NIL;
        SubLObject cond_effects = NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != assertions_high.assertion_mentions_term( assertion, $const154$preconditionForMethod ) )
          {
            pre_methods = ConsesLow.cons( assertion, pre_methods );
          }
          else if( NIL != assertions_high.assertion_mentions_term( assertion, $const155$methodForAction ) )
          {
            v_methods_$6 = ConsesLow.cons( assertion, v_methods_$6 );
          }
          else if( NIL != assertions_high.assertion_mentions_term( assertion, $const156$preconditionFor_Props ) )
          {
            preconds = ConsesLow.cons( assertion, preconds );
          }
          else if( NIL != assertions_high.assertion_mentions_term( assertion, $const157$effectOfAction_Props ) )
          {
            effects = ConsesLow.cons( assertion, effects );
          }
          else if( NIL != assertions_high.assertion_mentions_term( assertion, $const158$sufficientFor_Props ) )
          {
            sufficient_conds = ConsesLow.cons( assertion, sufficient_conds );
          }
          else if( NIL != assertions_high.assertion_mentions_term( assertion, $const159$effectOfActionIf_Props ) )
          {
            cond_effects = ConsesLow.cons( assertion, cond_effects );
          }
          else
          {
            axioms = ConsesLow.cons( assertion, axioms );
          }
          cdolist_list_var = cdolist_list_var.rest();
          assertion = cdolist_list_var.first();
        }
        if( NIL != shop_parameters.$shop_use_precondition_for_methodP$.getDynamicValue( thread ) )
        {
          PrintLow.format( T, $str160$________________________using_pre );
          v_methods_$6 = pre_methods;
        }
        cdolist_list_var = preconds;
        SubLObject precond = NIL;
        precond = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          shop_cyc_domain_process_precondition_method( self, precond );
          cdolist_list_var = cdolist_list_var.rest();
          precond = cdolist_list_var.first();
        }
        cdolist_list_var = effects;
        SubLObject effect = NIL;
        effect = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          shop_cyc_domain_process_effect_method( self, effect );
          cdolist_list_var = cdolist_list_var.rest();
          effect = cdolist_list_var.first();
        }
        cdolist_list_var = cond_effects;
        SubLObject cond_effect = NIL;
        cond_effect = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          shop_cyc_domain_process_conditional_effect_method( self, cond_effect );
          cdolist_list_var = cdolist_list_var.rest();
          cond_effect = cdolist_list_var.first();
        }
        cdolist_list_var = v_methods_$6;
        SubLObject method = NIL;
        method = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          shop_cyc_domain_process_method_method( self, method );
          cdolist_list_var = cdolist_list_var.rest();
          method = cdolist_list_var.first();
        }
        cdolist_list_var = sufficient_conds;
        SubLObject scond = NIL;
        scond = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          shop_cyc_domain_process_sufficient_cond_method( self, scond );
          cdolist_list_var = cdolist_list_var.rest();
          scond = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym153$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_methods( self, v_methods );
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
      catch_var_for_shop_cyc_domain_method = Errors.handleThrowable( ccatch_env_var, $sym153$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_cyc_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 16702L)
  public static SubLObject shop_cyc_domain_gather_planning_assertions_method(final SubLObject self, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ass_set = set.new_set( UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym165$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( domain_mt, thread );
      SubLObject cdolist_list_var = shop_main.$shop_domain_definition_predicates$.getGlobalValue();
      SubLObject cur_pred = NIL;
      cur_pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$7 = kb_mapping.gather_predicate_rule_index( cur_pred, $kw166$POS, UNPROVIDED, UNPROVIDED );
        SubLObject cur_ass = NIL;
        cur_ass = cdolist_list_var_$7.first();
        while ( NIL != cdolist_list_var_$7)
        {
          set.set_add( cur_ass, ass_set );
          cdolist_list_var_$7 = cdolist_list_var_$7.rest();
          cur_ass = cdolist_list_var_$7.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        cur_pred = cdolist_list_var.first();
      }
      cdolist_list_var = kb_mapping.gather_predicate_extent_index( $const154$preconditionForMethod, UNPROVIDED, UNPROVIDED );
      SubLObject cur_ass2 = NIL;
      cur_ass2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        set.set_add( cur_ass2, ass_set );
        cdolist_list_var = cdolist_list_var.rest();
        cur_ass2 = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return set.set_element_list( ass_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 17255L)
  public static SubLObject shop_cyc_domain_init_simple_situation_preds_method(final SubLObject self, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_cyc_domain_method = NIL;
    SubLObject simple_situation_preds = get_shop_basic_domain_simple_situation_preds( self );
    try
    {
      thread.throwStack.push( $sym170$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == hlmt.hlmt_p( domain_mt ) )
        {
          Errors.error( $str171$_init_simple_situation_preds_shop );
        }
        final SubLObject simple_preds = isa.all_fort_instances( $const172$SimpleSituationPredicate, domain_mt, UNPROVIDED );
        simple_situation_preds = set_utilities.construct_set_from_list( simple_preds, UNPROVIDED, UNPROVIDED );
        Dynamic.sublisp_throw( $sym170$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_simple_situation_preds( self, simple_situation_preds );
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
      catch_var_for_shop_cyc_domain_method = Errors.handleThrowable( ccatch_env_var, $sym170$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_cyc_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 17612L)
  public static SubLObject shop_cyc_domain_init_domain_with_rules_method(final SubLObject self, final SubLObject rules, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_cyc_domain_method = NIL;
    SubLObject mt = get_shop_basic_domain_mt( self );
    try
    {
      thread.throwStack.push( $sym177$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD );
      try
      {
        mt = domain_mt;
        shop_cyc_domain_process_plan_assertions_list_method( self, rules );
        shop_cyc_domain_init_simple_situation_preds_method( self, domain_mt );
        Dynamic.sublisp_throw( $sym177$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_mt( self, mt );
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
      catch_var_for_shop_cyc_domain_method = Errors.handleThrowable( ccatch_env_var, $sym177$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_cyc_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 18011L)
  public static SubLObject shop_cyc_domain_process_plan_assertions_method(final SubLObject self, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_cyc_domain_method = NIL;
    SubLObject mt = get_shop_basic_domain_mt( self );
    try
    {
      thread.throwStack.push( $sym181$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD );
      try
      {
        if( NIL != mt )
        {
          shop_cyc_domain_initialize_method( self );
        }
        mt = domain_mt;
        final SubLObject assertions = shop_cyc_domain_gather_planning_assertions_method( self, domain_mt );
        shop_cyc_domain_process_plan_assertions_list_method( self, assertions );
        shop_cyc_domain_init_simple_situation_preds_method( self, domain_mt );
        Dynamic.sublisp_throw( $sym181$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_mt( self, mt );
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
      catch_var_for_shop_cyc_domain_method = Errors.handleThrowable( ccatch_env_var, $sym181$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_cyc_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 18628L)
  public static SubLObject shop_cyc_domain_process_method_method(final SubLObject self, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_cyc_domain_method = NIL;
    final SubLObject preconditions = get_shop_basic_domain_preconditions( self );
    final SubLObject v_methods = get_shop_basic_domain_methods( self );
    try
    {
      thread.throwStack.push( $sym186$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD );
      try
      {
        thread.resetMultipleValues();
        final SubLObject method_head = shop_extract_method_from_assertion( assertion );
        final SubLObject preconditions_$8 = thread.secondMultipleValue();
        final SubLObject decomposition = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject method_name = cycl_utilities.formula_operator( method_head );
        final SubLObject new_method = object.object_new_method( $sym187$SHOP_BASIC_METHOD );
        shop_datastructures.shop_basic_method_init_method( new_method, assertion, method_head, preconditions_$8, decomposition );
        Hashtables.sethash( method_name, v_methods, ConsesLow.cons( new_method, Hashtables.gethash( method_name, v_methods, UNPROVIDED ) ) );
        Dynamic.sublisp_throw( $sym186$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_preconditions( self, preconditions );
          set_shop_basic_domain_methods( self, v_methods );
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
      catch_var_for_shop_cyc_domain_method = Errors.handleThrowable( ccatch_env_var, $sym186$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_cyc_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 19311L)
  public static SubLObject shop_cyc_domain_process_precondition_method(final SubLObject self, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_cyc_domain_method = NIL;
    final SubLObject preconditions = get_shop_basic_domain_preconditions( self );
    try
    {
      thread.throwStack.push( $sym191$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD );
      try
      {
        final SubLObject assertion_form = assertions_high.assertion_formula( assertion );
        final SubLObject action_head = cycl_utilities.formula_arg2( assertion_form, UNPROVIDED );
        final SubLObject decomposition = ConsesLow.list( ConsesLow.list( $kw192$PRIMITIVE, action_head ) );
        SubLObject conditions = cycl_utilities.formula_arg1( assertion_form, UNPROVIDED );
        final SubLObject new_precondition = object.object_new_method( $sym193$SHOP_BASIC_PRECONDITION );
        conditions = possibly_conjunctive_formula_to_literals( conditions );
        shop_datastructures.shop_basic_method_init_method( new_precondition, assertion, action_head, conditions, decomposition );
        Hashtables.sethash( cycl_utilities.formula_operator( action_head ), preconditions, ConsesLow.cons( new_precondition, Hashtables.gethash( cycl_utilities.formula_operator( action_head ), preconditions,
            UNPROVIDED ) ) );
        Dynamic.sublisp_throw( $sym191$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_preconditions( self, preconditions );
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
      catch_var_for_shop_cyc_domain_method = Errors.handleThrowable( ccatch_env_var, $sym191$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_cyc_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 20125L)
  public static SubLObject shop_cyc_domain_process_effect_method(final SubLObject self, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_cyc_domain_method = NIL;
    final SubLObject operators = get_shop_basic_domain_operators( self );
    try
    {
      thread.throwStack.push( $sym197$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD );
      try
      {
        final SubLObject assertion_form = assertions_high.assertion_formula( assertion );
        final SubLObject action_head = cycl_utilities.formula_arg1( assertion_form, UNPROVIDED );
        SubLObject effects = cycl_utilities.formula_arg2( assertion_form, UNPROVIDED );
        final SubLObject new_operator = object.object_new_method( $sym198$SHOP_BASIC_OPERATOR );
        effects = possibly_conjunctive_formula_to_literals( effects );
        thread.resetMultipleValues();
        final SubLObject add_list = shop_separate_effect_list( effects );
        final SubLObject delete_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        shop_datastructures.shop_basic_operator_init_method( new_operator, assertion, action_head, add_list, delete_list );
        Hashtables.sethash( cycl_utilities.formula_operator( action_head ), operators, ConsesLow.cons( new_operator, Hashtables.gethash( cycl_utilities.formula_operator( action_head ), operators, UNPROVIDED ) ) );
        Dynamic.sublisp_throw( $sym197$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_operators( self, operators );
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
      catch_var_for_shop_cyc_domain_method = Errors.handleThrowable( ccatch_env_var, $sym197$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_cyc_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 21099L)
  public static SubLObject shop_cyc_domain_process_sufficient_cond_method(final SubLObject self, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_cyc_domain_method = NIL;
    final SubLObject sufficiencies = get_shop_basic_domain_sufficiencies( self );
    try
    {
      thread.throwStack.push( $sym202$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD );
      try
      {
        final SubLObject assertion_form = assertions_high.assertion_formula( assertion );
        SubLObject precondition = cycl_utilities.formula_arg1( assertion_form, UNPROVIDED );
        final SubLObject action_form = cycl_utilities.formula_arg2( assertion_form, UNPROVIDED );
        final SubLObject new_scond = object.object_new_method( $sym203$SHOP_BASIC_SUFFICIENCY_COND );
        precondition = possibly_conjunctive_formula_to_literals( precondition );
        methods.funcall_instance_method_with_1_args( new_scond, $sym204$SET_HEAD, action_form );
        methods.funcall_instance_method_with_1_args( new_scond, $sym205$SET_COND_FORMULA, precondition );
        methods.funcall_instance_method_with_1_args( new_scond, $sym206$SET_ASSERTIONS, ConsesLow.list( assertion ) );
        Hashtables.sethash( cycl_utilities.formula_operator( action_form ), sufficiencies, ConsesLow.cons( new_scond, Hashtables.gethash( cycl_utilities.formula_operator( action_form ), sufficiencies, UNPROVIDED ) ) );
        Dynamic.sublisp_throw( $sym202$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_sufficiencies( self, sufficiencies );
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
      catch_var_for_shop_cyc_domain_method = Errors.handleThrowable( ccatch_env_var, $sym202$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_cyc_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 21800L)
  public static SubLObject shop_cyc_domain_process_conditional_effect_method(final SubLObject self, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_cyc_domain_method = NIL;
    final SubLObject cond_operators = get_shop_basic_domain_cond_operators( self );
    try
    {
      thread.throwStack.push( $sym210$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD );
      try
      {
        final SubLObject formula = assertions_high.assertion_formula( assertion );
        final SubLObject pred = cycl_utilities.formula_operator( formula );
        final SubLObject action_head;
        final SubLObject action_formula = action_head = cycl_utilities.formula_arg1( formula, UNPROVIDED );
        SubLObject condition = cycl_utilities.formula_arg2( formula, UNPROVIDED );
        SubLObject effects = cycl_utilities.formula_arg3( formula, UNPROVIDED );
        final SubLObject cond_effect_operator = object.object_new_method( $sym211$SHOP_BASIC_CONDITIONAL_EFFECT );
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !pred.eql( $const159$effectOfActionIf_Props ) )
        {
          Errors.error( $str212$process_conditional_effect__a_is_, assertion );
        }
        effects = possibly_conjunctive_formula_to_literals( effects );
        condition = possibly_conjunctive_formula_to_literals( condition );
        thread.resetMultipleValues();
        final SubLObject add_list = shop_separate_effect_list( effects );
        final SubLObject delete_list = thread.secondMultipleValue();
        thread.resetMultipleValues();
        shop_datastructures.shop_basic_conditional_effect_init_method( cond_effect_operator, action_head, condition, add_list, delete_list, assertion );
        Hashtables.sethash( cycl_utilities.formula_operator( action_head ), cond_operators, ConsesLow.cons( cond_effect_operator, Hashtables.gethash( cycl_utilities.formula_operator( action_head ), cond_operators,
            UNPROVIDED ) ) );
        Dynamic.sublisp_throw( $sym210$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_domain_cond_operators( self, cond_operators );
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
      catch_var_for_shop_cyc_domain_method = Errors.handleThrowable( ccatch_env_var, $sym210$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_cyc_domain_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 22909L)
  public static SubLObject shop_method_formula_p(final SubLObject formula)
  {
    if( !formula.isCons() )
    {
      return NIL;
    }
    return Equality.eq( cycl_utilities.formula_operator( formula ), $const155$methodForAction );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 23159L)
  public static SubLObject shop_extract_method_from_assertion(final SubLObject assertion)
  {
    SubLObject head = NIL;
    SubLObject preconditions = NIL;
    SubLObject decomposition = NIL;
    final SubLObject assertion_form = assertions_high.assertion_formula( assertion );
    SubLObject methodstatement = NIL;
    SubLObject legal_form = T;
    SubLObject negatedatoms = NIL;
    SubLObject consequent = NIL;
    final SubLObject pcase_var = assertion_form.first();
    if( pcase_var.eql( $const214$implies ) || pcase_var.eql( $const154$preconditionForMethod ) )
    {
      preconditions = conses_high.second( assertion_form );
      consequent = conses_high.third( assertion_form );
      if( NIL != shop_method_formula_p( consequent ) )
      {
        methodstatement = consequent;
      }
      else
      {
        methodstatement = cycl_utilities.formula_find_if( $sym215$SHOP_METHOD_FORMULA_P, consequent, UNPROVIDED, UNPROVIDED );
        negatedatoms = Sequences.remove_if( $sym215$SHOP_METHOD_FORMULA_P, cycl_utilities.formula_args( consequent, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      if( NIL == methodstatement )
      {
        return NIL;
      }
      if( NIL != negatedatoms )
      {
        negatedatoms = Mapping.mapcar( Symbols.symbol_function( $sym216$NEGATE ), negatedatoms );
      }
      preconditions = possibly_conjunctive_formula_to_literals( preconditions );
      preconditions = ConsesLow.append( preconditions, negatedatoms );
    }
    else if( pcase_var.eql( $const155$methodForAction ) )
    {
      preconditions = NIL;
      methodstatement = assertion_form;
    }
    else
    {
      legal_form = NIL;
    }
    if( NIL != legal_form )
    {
      head = cycl_utilities.formula_arg1( methodstatement, UNPROVIDED );
      final SubLObject action_sequence = cycl_utilities.formula_arg1( cycl_utilities.formula_arg2( methodstatement, UNPROVIDED ), UNPROVIDED );
      if( action_sequence.isList() )
      {
        decomposition = action_sequence.rest();
      }
      else if( NIL != variables.variable_p( action_sequence ) )
      {
        final SubLObject hl_vars = assertions_high.assertion_hl_variables( assertion );
        final SubLObject actions_var = variables.get_variable( Sequences.length( hl_vars ) );
        preconditions = ConsesLow.cons( ConsesLow.list( $const217$equals, action_sequence, reader.bq_cons( $const218$TheList, actions_var ) ), preconditions );
        decomposition = actions_var;
      }
    }
    return Values.values( head, preconditions, decomposition );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 25020L)
  public static SubLObject possibly_conjunctive_formula_to_literals(final SubLObject form)
  {
    if( cycl_utilities.formula_operator( form ).eql( $const219$and ) )
    {
      return cycl_utilities.formula_args( form, UNPROVIDED );
    }
    return ConsesLow.list( form );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 25257L)
  public static SubLObject shop_separate_effect_list(final SubLObject effects)
  {
    SubLObject add_list = NIL;
    SubLObject delete_list = NIL;
    SubLObject cdolist_list_var = effects;
    SubLObject e_formula = NIL;
    e_formula = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != cycl_utilities.negatedP( e_formula ) )
      {
        delete_list = ConsesLow.cons( cycl_utilities.formula_arg1( e_formula, UNPROVIDED ), delete_list );
      }
      else
      {
        add_list = ConsesLow.cons( e_formula, add_list );
      }
      cdolist_list_var = cdolist_list_var.rest();
      e_formula = cdolist_list_var.first();
    }
    return Values.values( add_list, delete_list );
  }

  public static SubLObject declare_shop_domain_file()
  {
    SubLFiles.declareFunction( me, "shop_domain_p", "SHOP-DOMAIN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_domain_simple_situation_preds", "GET-SHOP-BASIC-DOMAIN-SIMPLE-SITUATION-PREDS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_domain_simple_situation_preds", "SET-SHOP-BASIC-DOMAIN-SIMPLE-SITUATION-PREDS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_domain_mt", "GET-SHOP-BASIC-DOMAIN-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_domain_mt", "SET-SHOP-BASIC-DOMAIN-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_domain_sufficiencies", "GET-SHOP-BASIC-DOMAIN-SUFFICIENCIES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_domain_sufficiencies", "SET-SHOP-BASIC-DOMAIN-SUFFICIENCIES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_domain_cond_operators", "GET-SHOP-BASIC-DOMAIN-COND-OPERATORS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_domain_cond_operators", "SET-SHOP-BASIC-DOMAIN-COND-OPERATORS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_domain_operators", "GET-SHOP-BASIC-DOMAIN-OPERATORS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_domain_operators", "SET-SHOP-BASIC-DOMAIN-OPERATORS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_domain_preconditions", "GET-SHOP-BASIC-DOMAIN-PRECONDITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_domain_preconditions", "SET-SHOP-BASIC-DOMAIN-PRECONDITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_domain_methods", "GET-SHOP-BASIC-DOMAIN-METHODS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_domain_methods", "SET-SHOP-BASIC-DOMAIN-METHODS", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_domain_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-DOMAIN-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_domain_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-DOMAIN-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_domain_p", "SHOP-BASIC-DOMAIN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_domain_rule_table_for_type", "SHOP-DOMAIN-RULE-TABLE-FOR-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_domain_initialize_method", "SHOP-BASIC-DOMAIN-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_domain_print_method", "SHOP-BASIC-DOMAIN-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_domain_get_name_method", "SHOP-BASIC-DOMAIN-GET-NAME-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_task_pred_string", "SHOP-TASK-PRED-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_find_all_matching_rules", "SHOP-FIND-ALL-MATCHING-RULES", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_domain_rule_table_for_type_method", "SHOP-BASIC-DOMAIN-RULE-TABLE-FOR-TYPE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_domain_get_planner_rules_method", "SHOP-BASIC-DOMAIN-GET-PLANNER-RULES-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_domain_html_display_all_rules_of_type_method", "SHOP-BASIC-DOMAIN-HTML-DISPLAY-ALL-RULES-OF-TYPE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_domain_add_sufficient_conds_method", "SHOP-BASIC-DOMAIN-ADD-SUFFICIENT-CONDS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_domain_get_sufficient_conds_method", "SHOP-BASIC-DOMAIN-GET-SUFFICIENT-CONDS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_domain_print_all_sconds_method", "SHOP-BASIC-DOMAIN-PRINT-ALL-SCONDS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_domain_html_display_all_sconds_method", "SHOP-BASIC-DOMAIN-HTML-DISPLAY-ALL-SCONDS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_domain_add_method_method", "SHOP-BASIC-DOMAIN-ADD-METHOD-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_domain_get_methods_method", "SHOP-BASIC-DOMAIN-GET-METHODS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_domain_print_all_methods_method", "SHOP-BASIC-DOMAIN-PRINT-ALL-METHODS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_domain_html_display_all_methods_method", "SHOP-BASIC-DOMAIN-HTML-DISPLAY-ALL-METHODS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_domain_add_operator_method", "SHOP-BASIC-DOMAIN-ADD-OPERATOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_domain_get_operators_method", "SHOP-BASIC-DOMAIN-GET-OPERATORS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_domain_print_all_operators_method", "SHOP-BASIC-DOMAIN-PRINT-ALL-OPERATORS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_domain_html_display_all_operators_method", "SHOP-BASIC-DOMAIN-HTML-DISPLAY-ALL-OPERATORS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_domain_get_conditional_operators_method", "SHOP-BASIC-DOMAIN-GET-CONDITIONAL-OPERATORS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_domain_html_display_all_conditional_operators_method", "SHOP-BASIC-DOMAIN-HTML-DISPLAY-ALL-CONDITIONAL-OPERATORS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_cyc_domain_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-CYC-DOMAIN-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_cyc_domain_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-CYC-DOMAIN-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_cyc_domain_p", "SHOP-CYC-DOMAIN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_cyc_domain_initialize_method", "SHOP-CYC-DOMAIN-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_cyc_domain_print_method", "SHOP-CYC-DOMAIN-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_cyc_domain_process_plan_assertions_list_method", "SHOP-CYC-DOMAIN-PROCESS-PLAN-ASSERTIONS-LIST-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_cyc_domain_gather_planning_assertions_method", "SHOP-CYC-DOMAIN-GATHER-PLANNING-ASSERTIONS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_cyc_domain_init_simple_situation_preds_method", "SHOP-CYC-DOMAIN-INIT-SIMPLE-SITUATION-PREDS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_cyc_domain_init_domain_with_rules_method", "SHOP-CYC-DOMAIN-INIT-DOMAIN-WITH-RULES-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_cyc_domain_process_plan_assertions_method", "SHOP-CYC-DOMAIN-PROCESS-PLAN-ASSERTIONS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_cyc_domain_process_method_method", "SHOP-CYC-DOMAIN-PROCESS-METHOD-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_cyc_domain_process_precondition_method", "SHOP-CYC-DOMAIN-PROCESS-PRECONDITION-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_cyc_domain_process_effect_method", "SHOP-CYC-DOMAIN-PROCESS-EFFECT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_cyc_domain_process_sufficient_cond_method", "SHOP-CYC-DOMAIN-PROCESS-SUFFICIENT-COND-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_cyc_domain_process_conditional_effect_method", "SHOP-CYC-DOMAIN-PROCESS-CONDITIONAL-EFFECT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_method_formula_p", "SHOP-METHOD-FORMULA-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_extract_method_from_assertion", "SHOP-EXTRACT-METHOD-FROM-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_conjunctive_formula_to_literals", "POSSIBLY-CONJUNCTIVE-FORMULA-TO-LITERALS", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_separate_effect_list", "SHOP-SEPARATE-EFFECT-LIST", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_shop_domain_file()
  {
    $shop_domain_planner_rule_slot_map$ = SubLFiles.deflexical( "*SHOP-DOMAIN-PLANNER-RULE-SLOT-MAP*", $list18 );
    return NIL;
  }

  public static SubLObject setup_shop_domain_file()
  {
    interfaces.new_interface( $sym0$SHOP_DOMAIN, NIL, NIL, $list1 );
    classes.subloop_new_class( $sym2$SHOP_BASIC_DOMAIN, $sym3$OBJECT, $list4, NIL, $list5 );
    classes.class_set_implements_slot_listeners( $sym2$SHOP_BASIC_DOMAIN, NIL );
    classes.subloop_note_class_initialization_function( $sym2$SHOP_BASIC_DOMAIN, $sym14$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_DOMAIN_CLASS );
    classes.subloop_note_instance_initialization_function( $sym2$SHOP_BASIC_DOMAIN, $sym17$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_DOMAIN_INSTANCE );
    subloop_reserved_initialize_shop_basic_domain_class( $sym2$SHOP_BASIC_DOMAIN );
    methods.methods_incorporate_instance_method( $sym19$INITIALIZE, $sym2$SHOP_BASIC_DOMAIN, $list20, NIL, $list21 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_DOMAIN, $sym19$INITIALIZE, $sym24$SHOP_BASIC_DOMAIN_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym25$PRINT, $sym2$SHOP_BASIC_DOMAIN, NIL, $list26, $list27 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_DOMAIN, $sym25$PRINT, $sym31$SHOP_BASIC_DOMAIN_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym32$GET_NAME, $sym2$SHOP_BASIC_DOMAIN, $list33, NIL, $list34 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_DOMAIN, $sym32$GET_NAME, $sym36$SHOP_BASIC_DOMAIN_GET_NAME_METHOD );
    methods.methods_incorporate_instance_method( $sym39$RULE_TABLE_FOR_TYPE, $sym2$SHOP_BASIC_DOMAIN, $list40, $list41, $list42 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_DOMAIN, $sym39$RULE_TABLE_FOR_TYPE, $sym43$SHOP_BASIC_DOMAIN_RULE_TABLE_FOR_TYPE_METHOD );
    methods.methods_incorporate_instance_method( $sym44$GET_PLANNER_RULES, $sym2$SHOP_BASIC_DOMAIN, $list33, $list45, $list46 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_DOMAIN, $sym44$GET_PLANNER_RULES, $sym50$SHOP_BASIC_DOMAIN_GET_PLANNER_RULES_METHOD );
    methods.methods_incorporate_instance_method( $sym51$HTML_DISPLAY_ALL_RULES_OF_TYPE, $sym2$SHOP_BASIC_DOMAIN, $list33, $list41, $list52 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_DOMAIN, $sym51$HTML_DISPLAY_ALL_RULES_OF_TYPE, $sym57$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_RULES_OF_TYPE_METHOD );
    methods.methods_incorporate_instance_method( $sym58$ADD_SUFFICIENT_CONDS, $sym2$SHOP_BASIC_DOMAIN, $list33, $list59, $list60 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_DOMAIN, $sym58$ADD_SUFFICIENT_CONDS, $sym64$SHOP_BASIC_DOMAIN_ADD_SUFFICIENT_CONDS_METHOD );
    methods.methods_incorporate_instance_method( $sym65$GET_SUFFICIENT_CONDS, $sym2$SHOP_BASIC_DOMAIN, $list33, $list66, $list67 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_DOMAIN, $sym65$GET_SUFFICIENT_CONDS, $sym70$SHOP_BASIC_DOMAIN_GET_SUFFICIENT_CONDS_METHOD );
    methods.methods_incorporate_instance_method( $sym71$PRINT_ALL_SCONDS, $sym2$SHOP_BASIC_DOMAIN, $list33, NIL, $list72 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_DOMAIN, $sym71$PRINT_ALL_SCONDS, $sym75$SHOP_BASIC_DOMAIN_PRINT_ALL_SCONDS_METHOD );
    methods.methods_incorporate_instance_method( $sym76$HTML_DISPLAY_ALL_SCONDS, $sym2$SHOP_BASIC_DOMAIN, $list33, NIL, $list77 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_DOMAIN, $sym76$HTML_DISPLAY_ALL_SCONDS, $sym80$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_SCONDS_METHOD );
    methods.methods_incorporate_instance_method( $sym81$ADD_METHOD, $sym2$SHOP_BASIC_DOMAIN, $list33, $list82, $list83 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_DOMAIN, $sym81$ADD_METHOD, $sym86$SHOP_BASIC_DOMAIN_ADD_METHOD_METHOD );
    methods.methods_incorporate_instance_method( $sym87$GET_METHODS, $sym2$SHOP_BASIC_DOMAIN, $list33, $list66, $list88 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_DOMAIN, $sym87$GET_METHODS, $sym90$SHOP_BASIC_DOMAIN_GET_METHODS_METHOD );
    methods.methods_incorporate_instance_method( $sym91$PRINT_ALL_METHODS, $sym2$SHOP_BASIC_DOMAIN, $list33, NIL, $list92 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_DOMAIN, $sym91$PRINT_ALL_METHODS, $sym94$SHOP_BASIC_DOMAIN_PRINT_ALL_METHODS_METHOD );
    methods.methods_incorporate_instance_method( $sym95$HTML_DISPLAY_ALL_METHODS, $sym2$SHOP_BASIC_DOMAIN, $list33, NIL, $list96 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_DOMAIN, $sym95$HTML_DISPLAY_ALL_METHODS, $sym99$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_METHODS_METHOD );
    methods.methods_incorporate_instance_method( $sym100$ADD_OPERATOR, $sym2$SHOP_BASIC_DOMAIN, $list33, $list101, $list102 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_DOMAIN, $sym100$ADD_OPERATOR, $sym106$SHOP_BASIC_DOMAIN_ADD_OPERATOR_METHOD );
    methods.methods_incorporate_instance_method( $sym107$GET_OPERATORS, $sym2$SHOP_BASIC_DOMAIN, $list33, $list66, $list108 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_DOMAIN, $sym107$GET_OPERATORS, $sym110$SHOP_BASIC_DOMAIN_GET_OPERATORS_METHOD );
    methods.methods_incorporate_instance_method( $sym111$PRINT_ALL_OPERATORS, $sym2$SHOP_BASIC_DOMAIN, $list33, $list112, $list113 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_DOMAIN, $sym111$PRINT_ALL_OPERATORS, $sym125$SHOP_BASIC_DOMAIN_PRINT_ALL_OPERATORS_METHOD );
    methods.methods_incorporate_instance_method( $sym126$HTML_DISPLAY_ALL_OPERATORS, $sym2$SHOP_BASIC_DOMAIN, $list33, NIL, $list127 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_DOMAIN, $sym126$HTML_DISPLAY_ALL_OPERATORS, $sym130$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_OPERATORS_METHOD );
    methods.methods_incorporate_instance_method( $sym131$GET_CONDITIONAL_OPERATORS, $sym2$SHOP_BASIC_DOMAIN, $list33, $list66, $list132 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_DOMAIN, $sym131$GET_CONDITIONAL_OPERATORS, $sym135$SHOP_BASIC_DOMAIN_GET_CONDITIONAL_OPERATORS_METHOD );
    methods.methods_incorporate_instance_method( $sym136$HTML_DISPLAY_ALL_CONDITIONAL_OPERATORS, $sym2$SHOP_BASIC_DOMAIN, $list33, NIL, $list137 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_DOMAIN, $sym136$HTML_DISPLAY_ALL_CONDITIONAL_OPERATORS, $sym139$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_CONDITIONAL_OPERATORS_METHOD );
    classes.subloop_new_class( $sym140$SHOP_CYC_DOMAIN, $sym2$SHOP_BASIC_DOMAIN, NIL, NIL, $list141 );
    classes.class_set_implements_slot_listeners( $sym140$SHOP_CYC_DOMAIN, NIL );
    classes.subloop_note_class_initialization_function( $sym140$SHOP_CYC_DOMAIN, $sym142$SUBLOOP_RESERVED_INITIALIZE_SHOP_CYC_DOMAIN_CLASS );
    classes.subloop_note_instance_initialization_function( $sym140$SHOP_CYC_DOMAIN, $sym143$SUBLOOP_RESERVED_INITIALIZE_SHOP_CYC_DOMAIN_INSTANCE );
    subloop_reserved_initialize_shop_cyc_domain_class( $sym140$SHOP_CYC_DOMAIN );
    methods.methods_incorporate_instance_method( $sym19$INITIALIZE, $sym140$SHOP_CYC_DOMAIN, $list33, NIL, $list144 );
    methods.subloop_register_instance_method( $sym140$SHOP_CYC_DOMAIN, $sym19$INITIALIZE, $sym145$SHOP_CYC_DOMAIN_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym25$PRINT, $sym140$SHOP_CYC_DOMAIN, NIL, $list26, $list146 );
    methods.subloop_register_instance_method( $sym140$SHOP_CYC_DOMAIN, $sym25$PRINT, $sym149$SHOP_CYC_DOMAIN_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym150$PROCESS_PLAN_ASSERTIONS_LIST, $sym140$SHOP_CYC_DOMAIN, $list40, $list151, $list152 );
    methods.subloop_register_instance_method( $sym140$SHOP_CYC_DOMAIN, $sym150$PROCESS_PLAN_ASSERTIONS_LIST, $sym161$SHOP_CYC_DOMAIN_PROCESS_PLAN_ASSERTIONS_LIST_METHOD );
    methods.methods_incorporate_class_method( $sym162$GATHER_PLANNING_ASSERTIONS, $sym140$SHOP_CYC_DOMAIN, $list33, $list163, $list164 );
    methods.subloop_register_class_method( $sym140$SHOP_CYC_DOMAIN, $sym162$GATHER_PLANNING_ASSERTIONS, $sym167$SHOP_CYC_DOMAIN_GATHER_PLANNING_ASSERTIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym168$INIT_SIMPLE_SITUATION_PREDS, $sym140$SHOP_CYC_DOMAIN, $list40, $list163, $list169 );
    methods.subloop_register_instance_method( $sym140$SHOP_CYC_DOMAIN, $sym168$INIT_SIMPLE_SITUATION_PREDS, $sym173$SHOP_CYC_DOMAIN_INIT_SIMPLE_SITUATION_PREDS_METHOD );
    methods.methods_incorporate_instance_method( $sym174$INIT_DOMAIN_WITH_RULES, $sym140$SHOP_CYC_DOMAIN, $list33, $list175, $list176 );
    methods.subloop_register_instance_method( $sym140$SHOP_CYC_DOMAIN, $sym174$INIT_DOMAIN_WITH_RULES, $sym178$SHOP_CYC_DOMAIN_INIT_DOMAIN_WITH_RULES_METHOD );
    methods.methods_incorporate_instance_method( $sym179$PROCESS_PLAN_ASSERTIONS, $sym140$SHOP_CYC_DOMAIN, $list33, $list163, $list180 );
    methods.subloop_register_instance_method( $sym140$SHOP_CYC_DOMAIN, $sym179$PROCESS_PLAN_ASSERTIONS, $sym182$SHOP_CYC_DOMAIN_PROCESS_PLAN_ASSERTIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym183$PROCESS_METHOD, $sym140$SHOP_CYC_DOMAIN, $list40, $list184, $list185 );
    methods.subloop_register_instance_method( $sym140$SHOP_CYC_DOMAIN, $sym183$PROCESS_METHOD, $sym188$SHOP_CYC_DOMAIN_PROCESS_METHOD_METHOD );
    methods.methods_incorporate_instance_method( $sym189$PROCESS_PRECONDITION, $sym140$SHOP_CYC_DOMAIN, $list40, $list184, $list190 );
    methods.subloop_register_instance_method( $sym140$SHOP_CYC_DOMAIN, $sym189$PROCESS_PRECONDITION, $sym194$SHOP_CYC_DOMAIN_PROCESS_PRECONDITION_METHOD );
    methods.methods_incorporate_instance_method( $sym195$PROCESS_EFFECT, $sym140$SHOP_CYC_DOMAIN, $list40, $list184, $list196 );
    methods.subloop_register_instance_method( $sym140$SHOP_CYC_DOMAIN, $sym195$PROCESS_EFFECT, $sym199$SHOP_CYC_DOMAIN_PROCESS_EFFECT_METHOD );
    methods.methods_incorporate_instance_method( $sym200$PROCESS_SUFFICIENT_COND, $sym140$SHOP_CYC_DOMAIN, $list40, $list184, $list201 );
    methods.subloop_register_instance_method( $sym140$SHOP_CYC_DOMAIN, $sym200$PROCESS_SUFFICIENT_COND, $sym207$SHOP_CYC_DOMAIN_PROCESS_SUFFICIENT_COND_METHOD );
    methods.methods_incorporate_instance_method( $sym208$PROCESS_CONDITIONAL_EFFECT, $sym140$SHOP_CYC_DOMAIN, $list40, $list184, $list209 );
    methods.subloop_register_instance_method( $sym140$SHOP_CYC_DOMAIN, $sym208$PROCESS_CONDITIONAL_EFFECT, $sym213$SHOP_CYC_DOMAIN_PROCESS_CONDITIONAL_EFFECT_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_shop_domain_file();
  }

  @Override
  public void initializeVariables()
  {
    init_shop_domain_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_shop_domain_file();
  }
  static
  {
    me = new shop_domain();
    $shop_domain_planner_rule_slot_map$ = null;
    $sym0$SHOP_DOMAIN = makeSymbol( "SHOP-DOMAIN" );
    $list1 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-NAME" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
        makeSymbol( "SET-NAME" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-METHOD" ), ConsesLow.list( makeSymbol( "METHOD" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-OPERATOR" ), ConsesLow.list( makeSymbol( "OPERATOR" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
          makeSymbol( "GET-PLANNER-RULES" ), ConsesLow.list( makeSymbol( "TASK" ), makeSymbol( "TYPE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-METHODS" ),
              ConsesLow.list( makeSymbol( "TASK" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-OPERATORS" ), ConsesLow.list( makeSymbol( "TASK" ) ), makeKeyword(
                  "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-CONDITIONAL-OPERATORS" ), ConsesLow.list( makeSymbol( "TASK" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                      makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT-ALL-METHODS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PRINT-ALL-OPERATORS" ),
                          ConsesLow.list( makeSymbol( "STREAM" ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym2$SHOP_BASIC_DOMAIN = makeSymbol( "SHOP-BASIC-DOMAIN" );
    $sym3$OBJECT = makeSymbol( "OBJECT" );
    $list4 = ConsesLow.list( makeSymbol( "SHOP-DOMAIN" ) );
    $list5 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "METHODS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "PRECONDITIONS" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "OPERATORS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "COND-OPERATORS" ), makeKeyword( "INSTANCE" ),
            makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SUFFICIENCIES" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "MT" ), makeKeyword( "INSTANCE" ),
                makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "SIMPLE-SITUATION-PREDS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                    makeSymbol( "INITIALIZATION-SANITY-CHECK" ), NIL, makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FLUENT-PREDICATE?" ), ConsesLow.list( makeSymbol(
                        "PRED" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADDABLE-PREDICATE?" ), ConsesLow.list( makeSymbol( "PRED" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DELETEABLE-PREDICATE?" ), ConsesLow.list( makeSymbol( "PRED" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
          makeSymbol( "RULE-TABLE-FOR-TYPE" ), ConsesLow.list( makeSymbol( "TYPE" ) ), makeKeyword( "PRIVATE" ) )
    } );
    $sym6$SIMPLE_SITUATION_PREDS = makeSymbol( "SIMPLE-SITUATION-PREDS" );
    $sym7$MT = makeSymbol( "MT" );
    $sym8$SUFFICIENCIES = makeSymbol( "SUFFICIENCIES" );
    $sym9$COND_OPERATORS = makeSymbol( "COND-OPERATORS" );
    $sym10$OPERATORS = makeSymbol( "OPERATORS" );
    $sym11$PRECONDITIONS = makeSymbol( "PRECONDITIONS" );
    $sym12$METHODS = makeSymbol( "METHODS" );
    $sym13$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym14$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_DOMAIN_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-DOMAIN-CLASS" );
    $sym15$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym16$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym17$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_DOMAIN_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-DOMAIN-INSTANCE" );
    $list18 = ConsesLow.list( ConsesLow.cons( makeSymbol( "SHOP-METHOD-P" ), makeSymbol( "METHODS" ) ), ConsesLow.cons( makeSymbol( "SHOP-PRECONDITION-P" ), makeSymbol( "PRECONDITIONS" ) ), ConsesLow.cons( makeSymbol(
        "SHOP-OPERATOR-P" ), makeSymbol( "OPERATORS" ) ), ConsesLow.cons( makeSymbol( "SHOP-SUFFICIENCY-CONDITION-P" ), makeSymbol( "SUFFICIENCIES" ) ), ConsesLow.cons( makeSymbol( "SHOP-CONDITIONAL-EFFECT-P" ),
            makeSymbol( "COND-OPERATORS" ) ) );
    $sym19$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list20 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list21 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MT" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
        "METHODS" ), ConsesLow.list( makeSymbol( "MAKE-HASH-TABLE" ), makeInteger( 100 ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "OPERATORS" ), ConsesLow.list( makeSymbol( "MAKE-HASH-TABLE" ),
            makeInteger( 100 ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PRECONDITIONS" ), ConsesLow.list( makeSymbol( "MAKE-HASH-TABLE" ), makeInteger( 100 ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                makeSymbol( "SUFFICIENCIES" ), ConsesLow.list( makeSymbol( "MAKE-HASH-TABLE" ), TEN_INTEGER ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "COND-OPERATORS" ), ConsesLow.list( makeSymbol(
                    "MAKE-HASH-TABLE" ), TEN_INTEGER ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym22$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD" );
    $int23$100 = makeInteger( 100 );
    $sym24$SHOP_BASIC_DOMAIN_INITIALIZE_METHOD = makeSymbol( "SHOP-BASIC-DOMAIN-INITIALIZE-METHOD" );
    $sym25$PRINT = makeSymbol( "PRINT" );
    $list26 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list27 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "SELF" ) ), ConsesLow.list(
        makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "#<DOMAIN-~S:~S>" ), makeSymbol( "INSTANCE-NUMBER" ), makeSymbol( "MT" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString(
            "#<Malformed Instance>" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym28$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD" );
    $str29$__DOMAIN__S__S_ = makeString( "#<DOMAIN-~S:~S>" );
    $str30$__Malformed_Instance_ = makeString( "#<Malformed Instance>" );
    $sym31$SHOP_BASIC_DOMAIN_PRINT_METHOD = makeSymbol( "SHOP-BASIC-DOMAIN-PRINT-METHOD" );
    $sym32$GET_NAME = makeSymbol( "GET-NAME" );
    $list33 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list34 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "MT" ) ) );
    $sym35$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD" );
    $sym36$SHOP_BASIC_DOMAIN_GET_NAME_METHOD = makeSymbol( "SHOP-BASIC-DOMAIN-GET-NAME-METHOD" );
    $str37$var_A = makeString( "var~A" );
    $sym38$HL_VAR_ = makeSymbol( "HL-VAR?" );
    $sym39$RULE_TABLE_FOR_TYPE = makeSymbol( "RULE-TABLE-FOR-TYPE" );
    $list40 = ConsesLow.list( makeKeyword( "PRIVATE" ) );
    $list41 = ConsesLow.list( makeSymbol( "TYPE" ) );
    $list42 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SLOTNAME" ), ConsesLow.list( makeSymbol( "SHOP-DOMAIN-RULE-TABLE-FOR-TYPE" ), makeSymbol( "TYPE" ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), makeSymbol( "SLOTNAME" ) ) ) ) );
    $sym43$SHOP_BASIC_DOMAIN_RULE_TABLE_FOR_TYPE_METHOD = makeSymbol( "SHOP-BASIC-DOMAIN-RULE-TABLE-FOR-TYPE-METHOD" );
    $sym44$GET_PLANNER_RULES = makeSymbol( "GET-PLANNER-RULES" );
    $list45 = ConsesLow.list( makeSymbol( "TASK" ), makeSymbol( "TYPE" ) );
    $list46 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "TASK" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "TYPE" ), makeSymbol(
        "FUNCTION-SPEC-P" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RULE-TABLE" ), ConsesLow.list( makeSymbol( "RULE-TABLE-FOR-TYPE" ), makeSymbol( "SELF" ), makeSymbol(
            "TYPE" ) ) ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "RULE-TABLE" ), makeSymbol( "HASH-TABLE-P" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                "RULE-LIST" ), ConsesLow.list( makeSymbol( "SHOP-FIND-ALL-MATCHING-RULES" ), makeSymbol( "TASK" ), makeSymbol( "RULE-TABLE" ) ) ), ConsesLow.list( makeSymbol( "UNIFIED-RULES" ), NIL ) ), ConsesLow.list(
                    makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-RULE" ), makeSymbol( "RULE-LIST" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "SHOP-UNIFY-FAILED?" ), ConsesLow
                        .list( makeSymbol( "SHOP-UNIFY" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "HEAD" ), makeSymbol( "SHOP-BASIC-PLANNER-RULE" ) ), makeSymbol( "CUR-RULE" ) ),
                            makeSymbol( "TASK" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "CUR-RULE" ), makeSymbol( "UNIFIED-RULES" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                                "UNIFIED-RULES" ) ) ) ) );
    $sym47$LISTP = makeSymbol( "LISTP" );
    $sym48$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym49$HASH_TABLE_P = makeSymbol( "HASH-TABLE-P" );
    $sym50$SHOP_BASIC_DOMAIN_GET_PLANNER_RULES_METHOD = makeSymbol( "SHOP-BASIC-DOMAIN-GET-PLANNER-RULES-METHOD" );
    $sym51$HTML_DISPLAY_ALL_RULES_OF_TYPE = makeSymbol( "HTML-DISPLAY-ALL-RULES-OF-TYPE" );
    $list52 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "TYPE" ), makeSymbol( "FUNCTION-SPEC-P" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "RULE-TABLE" ), ConsesLow.list( makeSymbol( "RULE-TABLE-FOR-TYPE" ), makeSymbol( "SELF" ), makeSymbol( "TYPE" ) ) ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "RULE-TABLE" ), makeSymbol(
            "HASH-TABLE-P" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ALIST" ), ConsesLow.list( makeSymbol( "HASH-TABLE-TO-ALIST" ), makeSymbol( "RULE-TABLE" ) ) ) ),
                ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ALIST" ), ConsesLow.list( makeSymbol( "SORT" ), makeSymbol( "ALIST" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "STRING<=" ) ), ConsesLow
                    .list( makeSymbol( "QUOTE" ), makeSymbol( "SHOP-TASK-PRED-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "DO-ALIST" ), ConsesLow.list( makeSymbol( "CUR-NAME" ), makeSymbol( "CUR-RULES" ), makeSymbol(
                        "ALIST" ) ), ConsesLow.list( makeSymbol( "CB-FORM" ), makeSymbol( "CUR-NAME" ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
                            makeSymbol( "CUR-RULE" ), makeSymbol( "CUR-RULES" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CUR-RULE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "HTML-DISPLAY" ) ) ) ),
                        ConsesLow.list( makeSymbol( "HTML-HR" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym53$STRING__ = makeSymbol( "STRING<=" );
    $sym54$SHOP_TASK_PRED_STRING = makeSymbol( "SHOP-TASK-PRED-STRING" );
    $list55 = ConsesLow.cons( makeSymbol( "CUR-NAME" ), makeSymbol( "CUR-RULES" ) );
    $sym56$HTML_DISPLAY = makeSymbol( "HTML-DISPLAY" );
    $sym57$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_RULES_OF_TYPE_METHOD = makeSymbol( "SHOP-BASIC-DOMAIN-HTML-DISPLAY-ALL-RULES-OF-TYPE-METHOD" );
    $sym58$ADD_SUFFICIENT_CONDS = makeSymbol( "ADD-SUFFICIENT-CONDS" );
    $list59 = ConsesLow.list( makeSymbol( "COND" ) );
    $list60 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SHOP-PLANNER-RULE-P" ), makeSymbol( "COND" ) ), makeString(
        "(ADD-SUFFICIENCY-COND ~S): ~S is not a valid SHOP-PLANNER-RULE-P object." ), makeSymbol( "SELF" ), makeSymbol( "COND" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "GETHASH" ),
            ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "COND" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PRED" ) ) ), makeSymbol( "SUFFICIENCIES" ) ), makeSymbol( "COND" ) ), ConsesLow.list( makeSymbol(
                "RET" ), NIL ) );
    $sym61$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD" );
    $str62$_ADD_SUFFICIENCY_COND__S____S_is_ = makeString( "(ADD-SUFFICIENCY-COND ~S): ~S is not a valid SHOP-PLANNER-RULE-P object." );
    $sym63$PRED = makeSymbol( "PRED" );
    $sym64$SHOP_BASIC_DOMAIN_ADD_SUFFICIENT_CONDS_METHOD = makeSymbol( "SHOP-BASIC-DOMAIN-ADD-SUFFICIENT-CONDS-METHOD" );
    $sym65$GET_SUFFICIENT_CONDS = makeSymbol( "GET-SUFFICIENT-CONDS" );
    $list66 = ConsesLow.list( makeSymbol( "TASK" ) );
    $list67 = ConsesLow.list( makeString( "@param TASK hl-formula-p" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "TASK" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
        ConsesLow.list( makeSymbol( "TASK-OP" ), ConsesLow.list( makeSymbol( "FORMULA-OPERATOR" ), makeSymbol( "TASK" ) ) ), ConsesLow.list( makeSymbol( "SCOND-LIST" ), ConsesLow.list( makeSymbol( "GETHASH" ),
            makeSymbol( "TASK-OP" ), makeSymbol( "SUFFICIENCIES" ) ) ), ConsesLow.list( makeSymbol( "UNIFIED-SCONDS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-SCOND" ),
                makeSymbol( "SCOND-LIST" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( EQ, makeKeyword( "FAIL" ), ConsesLow.list( makeSymbol( "SHOP-UNIFY" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ),
                    ConsesLow.list( makeSymbol( "HEAD" ), makeSymbol( "SHOP-BASIC-SUFFICIENCY-COND" ) ), makeSymbol( "CUR-SCOND" ) ), makeSymbol( "TASK" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol(
                        "CUR-SCOND" ), makeSymbol( "UNIFIED-SCONDS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "UNIFIED-SCONDS" ) ) ) );
    $sym68$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD" );
    $kw69$FAIL = makeKeyword( "FAIL" );
    $sym70$SHOP_BASIC_DOMAIN_GET_SUFFICIENT_CONDS_METHOD = makeSymbol( "SHOP-BASIC-DOMAIN-GET-SUFFICIENT-CONDS-METHOD" );
    $sym71$PRINT_ALL_SCONDS = makeSymbol( "PRINT-ALL-SCONDS" );
    $list72 = ConsesLow.list( ConsesLow.list( makeSymbol( "CDOHASH" ), ConsesLow.list( makeSymbol( "CUR-NAME" ), makeSymbol( "CUR-SCONDS" ), makeSymbol( "SUFFICIENCIES" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), T,
        makeString( "~%~s" ), makeSymbol( "CUR-NAME" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-SCOND" ), makeSymbol( "CUR-SCONDS" ) ), ConsesLow.list( makeSymbol(
            "DESCRIBE-INSTANCE" ), makeSymbol( "CUR-SCOND" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym73$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD" );
    $str74$___s = makeString( "~%~s" );
    $sym75$SHOP_BASIC_DOMAIN_PRINT_ALL_SCONDS_METHOD = makeSymbol( "SHOP-BASIC-DOMAIN-PRINT-ALL-SCONDS-METHOD" );
    $sym76$HTML_DISPLAY_ALL_SCONDS = makeSymbol( "HTML-DISPLAY-ALL-SCONDS" );
    $list77 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ALIST" ), ConsesLow.list( makeSymbol( "HASH-TABLE-TO-ALIST" ), makeSymbol( "SUFFICIENCIES" ) ) ) ),
        ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ALIST" ), ConsesLow.list( makeSymbol( "SORT" ), makeSymbol( "ALIST" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "STRING<=" ) ), ConsesLow.list(
            makeSymbol( "QUOTE" ), makeSymbol( "SHOP-TASK-PRED-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "DO-ALIST" ), ConsesLow.list( makeSymbol( "CUR-NAME" ), makeSymbol( "CUR-SCONDS" ), makeSymbol( "ALIST" ) ),
                ConsesLow.list( makeSymbol( "CB-FORM" ), makeSymbol( "CUR-NAME" ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-SCOND" ),
                    makeSymbol( "CUR-SCONDS" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CUR-SCOND" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "HTML-DISPLAY" ) ) ) ), ConsesLow.list( makeSymbol(
                        "HTML-HR" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym78$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD" );
    $list79 = ConsesLow.cons( makeSymbol( "CUR-NAME" ), makeSymbol( "CUR-SCONDS" ) );
    $sym80$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_SCONDS_METHOD = makeSymbol( "SHOP-BASIC-DOMAIN-HTML-DISPLAY-ALL-SCONDS-METHOD" );
    $sym81$ADD_METHOD = makeSymbol( "ADD-METHOD" );
    $list82 = ConsesLow.list( makeSymbol( "METHOD" ) );
    $list83 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SHOP-METHOD-P" ), makeSymbol( "METHOD" ) ), makeString( "(ADD-METHOD ~S): ~S is not a valid SHOP-METHOD-P object." ),
        makeSymbol( "SELF" ), makeSymbol( "METHOD" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "METHOD" ), ConsesLow.list( makeSymbol( "GETHASH" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow
            .list( makeSymbol( "PRED" ), makeSymbol( "SHOP-BASIC-METHOD" ) ), makeSymbol( "METHOD" ) ), makeSymbol( "METHODS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym84$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD" );
    $str85$_ADD_METHOD__S____S_is_not_a_vali = makeString( "(ADD-METHOD ~S): ~S is not a valid SHOP-METHOD-P object." );
    $sym86$SHOP_BASIC_DOMAIN_ADD_METHOD_METHOD = makeSymbol( "SHOP-BASIC-DOMAIN-ADD-METHOD-METHOD" );
    $sym87$GET_METHODS = makeSymbol( "GET-METHODS" );
    $list88 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "TASK" ), makeSymbol( "LISTP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "METHOD-LIST" ),
        ConsesLow.list( makeSymbol( "SHOP-FIND-ALL-MATCHING-RULES" ), makeSymbol( "TASK" ), makeSymbol( "METHODS" ) ) ), ConsesLow.list( makeSymbol( "UNIFIED-METHODS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ),
            ConsesLow.list( makeSymbol( "CUR-METHOD" ), makeSymbol( "METHOD-LIST" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "SHOP-UNIFY-FAILED?" ), ConsesLow.list( makeSymbol(
                "SHOP-UNIFY" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "HEAD" ), makeSymbol( "SHOP-BASIC-METHOD" ) ), makeSymbol( "CUR-METHOD" ) ), makeSymbol( "TASK" ) ) ), ConsesLow
                    .list( makeSymbol( "CPUSH" ), makeSymbol( "CUR-METHOD" ), makeSymbol( "UNIFIED-METHODS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "UNIFIED-METHODS" ) ) ) );
    $sym89$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD" );
    $sym90$SHOP_BASIC_DOMAIN_GET_METHODS_METHOD = makeSymbol( "SHOP-BASIC-DOMAIN-GET-METHODS-METHOD" );
    $sym91$PRINT_ALL_METHODS = makeSymbol( "PRINT-ALL-METHODS" );
    $list92 = ConsesLow.list( ConsesLow.list( makeSymbol( "CDOHASH" ), ConsesLow.list( makeSymbol( "CUR-NAME" ), makeSymbol( "CUR-METHODS" ), makeSymbol( "METHODS" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), T,
        makeString( "~%~s" ), makeSymbol( "CUR-NAME" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-METHOD" ), makeSymbol( "CUR-METHODS" ) ), ConsesLow.list( makeSymbol(
            "DESCRIBE-INSTANCE" ), makeSymbol( "CUR-METHOD" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym93$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD" );
    $sym94$SHOP_BASIC_DOMAIN_PRINT_ALL_METHODS_METHOD = makeSymbol( "SHOP-BASIC-DOMAIN-PRINT-ALL-METHODS-METHOD" );
    $sym95$HTML_DISPLAY_ALL_METHODS = makeSymbol( "HTML-DISPLAY-ALL-METHODS" );
    $list96 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ALIST" ), ConsesLow.list( makeSymbol( "HASH-TABLE-TO-ALIST" ), makeSymbol( "METHODS" ) ) ) ), ConsesLow
        .list( makeSymbol( "PUNLESS" ), makeSymbol( "ALIST" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ALIST" ), ConsesLow.list( makeSymbol( "SORT" ), makeSymbol(
            "ALIST" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "STRING<=" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SHOP-TASK-PRED-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "DO-ALIST" ),
                ConsesLow.list( makeSymbol( "CUR-NAME" ), makeSymbol( "CUR-METHODS" ), makeSymbol( "ALIST" ) ), ConsesLow.list( makeSymbol( "CB-FORM" ), makeSymbol( "CUR-NAME" ) ), ConsesLow.list( makeSymbol(
                    "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-METHOD" ), makeSymbol( "CUR-METHODS" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CUR-METHOD" ),
                        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "HTML-DISPLAY" ) ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ) ), ConsesLow.list( makeSymbol( "HTML-HR" ) ) ), ConsesLow.list( makeSymbol(
                            "RET" ), NIL ) ) );
    $sym97$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD" );
    $list98 = ConsesLow.cons( makeSymbol( "CUR-NAME" ), makeSymbol( "CUR-METHODS" ) );
    $sym99$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_METHODS_METHOD = makeSymbol( "SHOP-BASIC-DOMAIN-HTML-DISPLAY-ALL-METHODS-METHOD" );
    $sym100$ADD_OPERATOR = makeSymbol( "ADD-OPERATOR" );
    $list101 = ConsesLow.list( makeSymbol( "OPERATOR" ) );
    $list102 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "SHOP-OPERATOR-P" ), makeSymbol( "OPERATOR" ) ), makeString(
        "(ADD-OPERATOR ~S): ~S is not a valid SHOP-OPERATOR-P object." ), makeSymbol( "SELF" ), makeSymbol( "OPERATOR" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "OPERATOR" ), ConsesLow.list( makeSymbol(
            "GETHASH" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "OPERATOR" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NAME" ) ) ), makeSymbol( "OPERATORS" ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                NIL ) );
    $sym103$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD" );
    $str104$_ADD_OPERATOR__S____S_is_not_a_va = makeString( "(ADD-OPERATOR ~S): ~S is not a valid SHOP-OPERATOR-P object." );
    $sym105$NAME = makeSymbol( "NAME" );
    $sym106$SHOP_BASIC_DOMAIN_ADD_OPERATOR_METHOD = makeSymbol( "SHOP-BASIC-DOMAIN-ADD-OPERATOR-METHOD" );
    $sym107$GET_OPERATORS = makeSymbol( "GET-OPERATORS" );
    $list108 = ConsesLow.list( makeString( "@param TASK hl-formula-p\n   @return listp ;; of shop-operator-p" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "TASK" ), makeSymbol( "LISTP" ) ), ConsesLow.list(
        makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PRED" ), ConsesLow.list( makeSymbol( "FORMULA-OPERATOR" ), makeSymbol( "TASK" ) ) ), ConsesLow.list( makeSymbol( "OPERATOR-LIST" ), ConsesLow
            .list( makeSymbol( "GETHASH" ), makeSymbol( "PRED" ), makeSymbol( "OPERATORS" ) ) ), ConsesLow.list( makeSymbol( "RESULTS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol(
                "OP" ), makeSymbol( "OPERATOR-LIST" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CUR-HEAD" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list(
                    makeSymbol( "HEAD" ), makeSymbol( "SHOP-BASIC-OPERATOR" ) ), makeSymbol( "OP" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "SHOP-UNIFY-FAILED?" ), ConsesLow.list(
                        makeSymbol( "SHOP-UNIFY" ), ConsesLow.list( makeSymbol( "REST" ), makeSymbol( "CUR-HEAD" ) ), ConsesLow.list( makeSymbol( "REST" ), makeSymbol( "TASK" ) ) ) ), ConsesLow.list( makeSymbol(
                            "CPUSH" ), makeSymbol( "OP" ), makeSymbol( "RESULTS" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "RESULTS" ) ) ) ) );
    $sym109$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD" );
    $sym110$SHOP_BASIC_DOMAIN_GET_OPERATORS_METHOD = makeSymbol( "SHOP-BASIC-DOMAIN-GET-OPERATORS-METHOD" );
    $sym111$PRINT_ALL_OPERATORS = makeSymbol( "PRINT-ALL-OPERATORS" );
    $list112 = ConsesLow.list( makeSymbol( "STREAM" ) );
    $list113 = ConsesLow.list( ConsesLow.list( makeSymbol( "CDOHASH" ), ConsesLow.list( makeSymbol( "X" ), makeSymbol( "Y" ), makeSymbol( "OPERATORS" ) ), ConsesLow.list( new SubLObject[] { makeSymbol( "CLET" ),
      ConsesLow.list( ConsesLow.list( makeSymbol( "TEMP" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "Y" ) ) ), ConsesLow.list( makeSymbol( "HEAD" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ),
          makeSymbol( "TEMP" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "HEAD" ) ) ) ), ConsesLow.list( makeSymbol( "ADD-LITERALS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "TEMP" ), ConsesLow
              .list( makeSymbol( "QUOTE" ), makeSymbol( "ADDS" ) ) ) ), ConsesLow.list( makeSymbol( "DELETE-LITERALS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "TEMP" ), ConsesLow.list( makeSymbol(
                  "QUOTE" ), makeSymbol( "DELETES" ) ) ) ), ConsesLow.list( makeSymbol( "CONDITIONAL-EFFECTS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "TEMP" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                      makeSymbol( "CONDITIONAL-EFFECTS" ) ) ) ), ConsesLow.list( makeSymbol( "COST" ), ConsesLow.list( makeSymbol( "GET-SHOP-BASIC-OPERATOR-COST" ), makeSymbol( "TEMP" ) ) ) ), ConsesLow.list( makeSymbol(
                          "FORMAT" ), makeSymbol( "STREAM" ), makeString( "~%~s" ), makeSymbol( "X" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "~%  Head: ~S" ), makeSymbol(
                              "HEAD" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "~%  Add-literals:     ~S" ), makeSymbol( "ADD-LITERALS" ) ), ConsesLow.list( makeSymbol( "FORMAT" ),
                                  makeSymbol( "STREAM" ), makeString( "~%  Delete-literals: ~S" ), makeSymbol( "DELETE-LITERALS" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString(
                                      "~%  Conditional Effects: ~s" ), makeSymbol( "CONDITIONAL-EFFECTS" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "~%  Cost: ~S" ), makeSymbol(
                                          "COST" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "~%" ) )
    } ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym114$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD" );
    $sym115$HEAD = makeSymbol( "HEAD" );
    $sym116$ADDS = makeSymbol( "ADDS" );
    $sym117$DELETES = makeSymbol( "DELETES" );
    $sym118$CONDITIONAL_EFFECTS = makeSymbol( "CONDITIONAL-EFFECTS" );
    $str119$____Head___S = makeString( "~%  Head: ~S" );
    $str120$____Add_literals_______S = makeString( "~%  Add-literals:     ~S" );
    $str121$____Delete_literals___S = makeString( "~%  Delete-literals: ~S" );
    $str122$____Conditional_Effects___s = makeString( "~%  Conditional Effects: ~s" );
    $str123$____Cost___S = makeString( "~%  Cost: ~S" );
    $str124$__ = makeString( "~%" );
    $sym125$SHOP_BASIC_DOMAIN_PRINT_ALL_OPERATORS_METHOD = makeSymbol( "SHOP-BASIC-DOMAIN-PRINT-ALL-OPERATORS-METHOD" );
    $sym126$HTML_DISPLAY_ALL_OPERATORS = makeSymbol( "HTML-DISPLAY-ALL-OPERATORS" );
    $list127 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ALIST" ), ConsesLow.list( makeSymbol( "HASH-TABLE-TO-ALIST" ), makeSymbol( "OPERATORS" ) ) ) ), ConsesLow
        .list( makeSymbol( "PUNLESS" ), makeSymbol( "ALIST" ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ALIST" ), ConsesLow.list( makeSymbol( "SORT" ), makeSymbol(
            "ALIST" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "STRING<=" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SHOP-TASK-PRED-STRING" ) ) ) ), ConsesLow.list( makeSymbol( "DO-ALIST" ),
                ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "OPS" ), makeSymbol( "ALIST" ) ), ConsesLow.list( makeSymbol( "CB-FORM" ), makeSymbol( "PRED" ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ),
                ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-OP" ), makeSymbol( "OPS" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CUR-OP" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                    makeSymbol( "HTML-DISPLAY" ) ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym128$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD" );
    $list129 = ConsesLow.cons( makeSymbol( "PRED" ), makeSymbol( "OPS" ) );
    $sym130$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_OPERATORS_METHOD = makeSymbol( "SHOP-BASIC-DOMAIN-HTML-DISPLAY-ALL-OPERATORS-METHOD" );
    $sym131$GET_CONDITIONAL_OPERATORS = makeSymbol( "GET-CONDITIONAL-OPERATORS" );
    $list132 = ConsesLow.list( makeString( "@param TASK hl-formula-p\n   @return listp ;; of shop-operator-p" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "TASK" ), makeSymbol( "LISTP" ) ), ConsesLow.list(
        makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PRED" ), ConsesLow.list( makeSymbol( "FORMULA-OPERATOR" ), makeSymbol( "TASK" ) ) ), ConsesLow.list( makeSymbol( "RESULTS" ), NIL ) ), ConsesLow
            .list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "FORT-P" ), makeSymbol( "PRED" ) ), makeString( "(get-conditional-operators shop-basic-domain) Error with ~a, ~a is not a fort-p" ), makeSymbol(
                "TASK" ), makeSymbol( "PRED" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "OP" ), ConsesLow.list( makeSymbol( "SHOP-FIND-ALL-MATCHING-RULES" ), makeSymbol( "TASK" ),
                    makeSymbol( "COND-OPERATORS" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CUR-HEAD" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list(
                        makeSymbol( "HEAD" ), makeSymbol( "SHOP-BASIC-PLANNER-RULE" ) ), makeSymbol( "OP" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "SHOP-UNIFY-FAILED?" ), ConsesLow
                            .list( makeSymbol( "SHOP-UNIFY" ), ConsesLow.list( makeSymbol( "REST" ), makeSymbol( "CUR-HEAD" ) ), ConsesLow.list( makeSymbol( "REST" ), makeSymbol( "TASK" ) ) ) ), ConsesLow.list(
                                makeSymbol( "CPUSH" ), makeSymbol( "OP" ), makeSymbol( "RESULTS" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "RESULTS" ) ) ) ) );
    $sym133$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD" );
    $str134$_get_conditional_operators_shop_b = makeString( "(get-conditional-operators shop-basic-domain) Error with ~a, ~a is not a fort-p" );
    $sym135$SHOP_BASIC_DOMAIN_GET_CONDITIONAL_OPERATORS_METHOD = makeSymbol( "SHOP-BASIC-DOMAIN-GET-CONDITIONAL-OPERATORS-METHOD" );
    $sym136$HTML_DISPLAY_ALL_CONDITIONAL_OPERATORS = makeSymbol( "HTML-DISPLAY-ALL-CONDITIONAL-OPERATORS" );
    $list137 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ALIST" ), ConsesLow.list( makeSymbol( "HASH-TABLE-TO-ALIST" ), makeSymbol( "COND-OPERATORS" ) ) ) ),
        ConsesLow.list( makeSymbol( "SORT" ), makeSymbol( "ALIST" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "STRING<=" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SHOP-TASK-PRED-STRING" ) ) ),
        ConsesLow.list( makeSymbol( "DO-ALIST" ), ConsesLow.list( makeSymbol( "PRED" ), makeSymbol( "OPS" ), makeSymbol( "ALIST" ) ), ConsesLow.list( makeSymbol( "CB-FORM" ), makeSymbol( "PRED" ) ), ConsesLow.list(
            makeSymbol( "HTML-NEWLINE" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-OP" ), makeSymbol( "OPS" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "CUR-OP" ), ConsesLow
                .list( makeSymbol( "QUOTE" ), makeSymbol( "HTML-DISPLAY" ) ) ), ConsesLow.list( makeSymbol( "HTML-NEWLINE" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym138$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD" );
    $sym139$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_CONDITIONAL_OPERATORS_METHOD = makeSymbol( "SHOP-BASIC-DOMAIN-HTML-DISPLAY-ALL-CONDITIONAL-OPERATORS-METHOD" );
    $sym140$SHOP_CYC_DOMAIN = makeSymbol( "SHOP-CYC-DOMAIN" );
    $list141 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PROCESS-METHOD" ), ConsesLow.list( makeSymbol( "ASSERTION" ) ), makeKeyword( "PRIVATE" ) ), ConsesLow
        .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PROCESS-AXIOM" ), ConsesLow.list( makeSymbol( "ASSERTION" ) ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "PROCESS-PRECONDITION" ), ConsesLow.list( makeSymbol( "ASSERTION" ) ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PROCESS-EFFECT" ), ConsesLow.list(
                makeSymbol( "ASSERTION" ) ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PROCESS-CONDITIONAL-EFFECT" ), ConsesLow.list( makeSymbol( "ASSERTION" ) ),
                    makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PROCESS-SUFFICIENT-COND" ), ConsesLow.list( makeSymbol( "ASSERTION" ) ), makeKeyword( "PRIVATE" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PROCESS-PLAN-ASSERTIONS-LIST" ), ConsesLow.list( makeSymbol( "ASSERTIONS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
          "DEF-INSTANCE-METHOD" ), makeSymbol( "PROCESS-PLAN-ASSERTIONS" ), ConsesLow.list( makeSymbol( "MT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
              "INIT-DOMAIN-WITH-RULES" ), ConsesLow.list( makeSymbol( "RULES" ), makeSymbol( "MT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "POPULATE-DOMAIN" ),
                  ConsesLow.list( makeSymbol( "DOMAIN" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INIT-SIMPLE-SITUATION-PREDS" ), ConsesLow.list( makeSymbol(
                      "MT" ) ), makeKeyword( "PRIVATE" ) )
    } );
    $sym142$SUBLOOP_RESERVED_INITIALIZE_SHOP_CYC_DOMAIN_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-CYC-DOMAIN-CLASS" );
    $sym143$SUBLOOP_RESERVED_INITIALIZE_SHOP_CYC_DOMAIN_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-CYC-DOMAIN-INSTANCE" );
    $list144 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym145$SHOP_CYC_DOMAIN_INITIALIZE_METHOD = makeSymbol( "SHOP-CYC-DOMAIN-INITIALIZE-METHOD" );
    $list146 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "SELF" ) ), ConsesLow.list(
        makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "#<SHOP-CYC-DOMAIN-~S:~S>" ), makeSymbol( "INSTANCE-NUMBER" ), makeSymbol( "MT" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ),
            makeString( "#<Malformed Instance>" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym147$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-CYC-DOMAIN-METHOD" );
    $str148$__SHOP_CYC_DOMAIN__S__S_ = makeString( "#<SHOP-CYC-DOMAIN-~S:~S>" );
    $sym149$SHOP_CYC_DOMAIN_PRINT_METHOD = makeSymbol( "SHOP-CYC-DOMAIN-PRINT-METHOD" );
    $sym150$PROCESS_PLAN_ASSERTIONS_LIST = makeSymbol( "PROCESS-PLAN-ASSERTIONS-LIST" );
    $list151 = ConsesLow.list( makeSymbol( "ASSERTIONS" ) );
    $list152 = ConsesLow.list( makeString(
        "@param ASSERTIONS listp ;; of assertion-p\n   process a list of ASSERTIONS, so that they can be entered into the domain\n   description. ASSERTIONS is a list of elements satisfying ASSERTION-P. \n   Returns T." ),
        ConsesLow.list( new SubLObject[]
        { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PRECONDS" ), NIL ), ConsesLow.list( makeSymbol( "EFFECTS" ), NIL ), ConsesLow.list( makeSymbol( "PRE-METHODS" ), NIL ), ConsesLow.list(
            makeSymbol( "METHODS" ), NIL ), ConsesLow.list( makeSymbol( "AXIOMS" ), NIL ), ConsesLow.list( makeSymbol( "SUFFICIENT-CONDS" ), NIL ), ConsesLow.list( makeSymbol( "COND-EFFECTS" ), NIL ) ), ConsesLow.list(
                makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "ASSERTIONS" ) ), ConsesLow.list( makeSymbol( "PCOND" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                    "ASSERTION-MENTIONS-TERM" ), makeSymbol( "ASSERTION" ), constant_handles.reader_make_constant_shell( makeString( "preconditionForMethod" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol(
                        "ASSERTION" ), makeSymbol( "PRE-METHODS" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION-MENTIONS-TERM" ), makeSymbol( "ASSERTION" ), constant_handles.reader_make_constant_shell(
                            makeString( "methodForAction" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "ASSERTION" ), makeSymbol( "METHODS" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                "ASSERTION-MENTIONS-TERM" ), makeSymbol( "ASSERTION" ), constant_handles.reader_make_constant_shell( makeString( "preconditionFor-Props" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                                    makeSymbol( "ASSERTION" ), makeSymbol( "PRECONDS" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION-MENTIONS-TERM" ), makeSymbol( "ASSERTION" ), constant_handles
                                        .reader_make_constant_shell( makeString( "effectOfAction-Props" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "ASSERTION" ), makeSymbol( "EFFECTS" ) ) ), ConsesLow
                                            .list( ConsesLow.list( makeSymbol( "ASSERTION-MENTIONS-TERM" ), makeSymbol( "ASSERTION" ), constant_handles.reader_make_constant_shell( makeString( "sufficientFor-Props" ) ) ),
                                                ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "ASSERTION" ), makeSymbol( "SUFFICIENT-CONDS" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                                    "ASSERTION-MENTIONS-TERM" ), makeSymbol( "ASSERTION" ), constant_handles.reader_make_constant_shell( makeString( "effectOfActionIf-Props" ) ) ), ConsesLow.list(
                                                        makeSymbol( "CPUSH" ), makeSymbol( "ASSERTION" ), makeSymbol( "COND-EFFECTS" ) ) ), ConsesLow.list( T, ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol(
                                                            "ASSERTION" ), makeSymbol( "AXIOMS" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "*SHOP-USE-PRECONDITION-FOR-METHOD?*" ), ConsesLow.list(
                                                                makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "FORMAT" ), T, makeString( "******************* --> using preconditionForMethod~%~%" ) ), ConsesLow.list(
                                                                    makeSymbol( "CSETQ" ), makeSymbol( "METHODS" ), makeSymbol( "PRE-METHODS" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol(
                                                                        "PRECOND" ), makeSymbol( "PRECONDS" ) ), ConsesLow.list( makeSymbol( "PROCESS-PRECONDITION" ), makeSymbol( "SELF" ), makeSymbol( "PRECOND" ) ) ),
          ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "EFFECT" ), makeSymbol( "EFFECTS" ) ), ConsesLow.list( makeSymbol( "PROCESS-EFFECT" ), makeSymbol( "SELF" ), makeSymbol( "EFFECT" ) ) ),
          ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "COND-EFFECT" ), makeSymbol( "COND-EFFECTS" ) ), ConsesLow.list( makeSymbol( "PROCESS-CONDITIONAL-EFFECT" ), makeSymbol( "SELF" ),
              makeSymbol( "COND-EFFECT" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "METHOD" ), makeSymbol( "METHODS" ) ), ConsesLow.list( makeSymbol( "PROCESS-METHOD" ), makeSymbol(
                  "SELF" ), makeSymbol( "METHOD" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "SCOND" ), makeSymbol( "SUFFICIENT-CONDS" ) ), ConsesLow.list( makeSymbol(
                      "PROCESS-SUFFICIENT-COND" ), makeSymbol( "SELF" ), makeSymbol( "SCOND" ) ) )
        } ), ConsesLow.list( makeSymbol( "RET" ), T ) );
    $sym153$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-CYC-DOMAIN-METHOD" );
    $const154$preconditionForMethod = constant_handles.reader_make_constant_shell( makeString( "preconditionForMethod" ) );
    $const155$methodForAction = constant_handles.reader_make_constant_shell( makeString( "methodForAction" ) );
    $const156$preconditionFor_Props = constant_handles.reader_make_constant_shell( makeString( "preconditionFor-Props" ) );
    $const157$effectOfAction_Props = constant_handles.reader_make_constant_shell( makeString( "effectOfAction-Props" ) );
    $const158$sufficientFor_Props = constant_handles.reader_make_constant_shell( makeString( "sufficientFor-Props" ) );
    $const159$effectOfActionIf_Props = constant_handles.reader_make_constant_shell( makeString( "effectOfActionIf-Props" ) );
    $str160$________________________using_pre = makeString( "******************* --> using preconditionForMethod~%~%" );
    $sym161$SHOP_CYC_DOMAIN_PROCESS_PLAN_ASSERTIONS_LIST_METHOD = makeSymbol( "SHOP-CYC-DOMAIN-PROCESS-PLAN-ASSERTIONS-LIST-METHOD" );
    $sym162$GATHER_PLANNING_ASSERTIONS = makeSymbol( "GATHER-PLANNING-ASSERTIONS" );
    $list163 = ConsesLow.list( makeSymbol( "DOMAIN-MT" ) );
    $list164 = ConsesLow.list( makeString( "@param DOMAIN-MT hlmt-p\n   Returns the el form of assertions in MT which are likely planning assertions." ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow
        .list( makeSymbol( "ASS-SET" ), ConsesLow.list( makeSymbol( "NEW-SET" ) ) ) ), ConsesLow.list( makeSymbol( "WITH-MT" ), makeSymbol( "DOMAIN-MT" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
            makeSymbol( "CUR-PRED" ), makeSymbol( "*SHOP-DOMAIN-DEFINITION-PREDICATES*" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-ASS" ), ConsesLow.list( makeSymbol(
                "GATHER-PREDICATE-RULE-INDEX" ), makeSymbol( "CUR-PRED" ), makeKeyword( "POS" ) ) ), ConsesLow.list( makeSymbol( "SET-ADD" ), makeSymbol( "CUR-ASS" ), makeSymbol( "ASS-SET" ) ) ) ), ConsesLow.list(
                    makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-ASS" ), ConsesLow.list( makeSymbol( "GATHER-PREDICATE-EXTENT-INDEX" ), constant_handles.reader_make_constant_shell( makeString(
                        "preconditionForMethod" ) ) ) ), ConsesLow.list( makeSymbol( "SET-ADD" ), makeSymbol( "CUR-ASS" ), makeSymbol( "ASS-SET" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol(
                            "SET-ELEMENT-LIST" ), makeSymbol( "ASS-SET" ) ) ) ) );
    $sym165$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $kw166$POS = makeKeyword( "POS" );
    $sym167$SHOP_CYC_DOMAIN_GATHER_PLANNING_ASSERTIONS_METHOD = makeSymbol( "SHOP-CYC-DOMAIN-GATHER-PLANNING-ASSERTIONS-METHOD" );
    $sym168$INIT_SIMPLE_SITUATION_PREDS = makeSymbol( "INIT-SIMPLE-SITUATION-PREDS" );
    $list169 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "HLMT-P" ), makeSymbol( "DOMAIN-MT" ) ), makeString( "(init-simple-situation-preds shop-cyc-domain): ~s is not hlmt-p" ) ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SIMPLE-PREDS" ), ConsesLow.list( makeSymbol( "ALL-FORT-INSTANCES" ), constant_handles.reader_make_constant_shell( makeString(
            "SimpleSituationPredicate" ) ), makeSymbol( "DOMAIN-MT" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "SIMPLE-SITUATION-PREDS" ), ConsesLow.list( makeSymbol( "CONSTRUCT-SET-FROM-LIST" ),
                makeSymbol( "SIMPLE-PREDS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym170$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-CYC-DOMAIN-METHOD" );
    $str171$_init_simple_situation_preds_shop = makeString( "(init-simple-situation-preds shop-cyc-domain): ~s is not hlmt-p" );
    $const172$SimpleSituationPredicate = constant_handles.reader_make_constant_shell( makeString( "SimpleSituationPredicate" ) );
    $sym173$SHOP_CYC_DOMAIN_INIT_SIMPLE_SITUATION_PREDS_METHOD = makeSymbol( "SHOP-CYC-DOMAIN-INIT-SIMPLE-SITUATION-PREDS-METHOD" );
    $sym174$INIT_DOMAIN_WITH_RULES = makeSymbol( "INIT-DOMAIN-WITH-RULES" );
    $list175 = ConsesLow.list( makeSymbol( "RULES" ), makeSymbol( "DOMAIN-MT" ) );
    $list176 = ConsesLow.list( makeString( "This function is used primarily for creating domains from the proof checker." ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MT" ), makeSymbol( "DOMAIN-MT" ) ),
        ConsesLow.list( makeSymbol( "PROCESS-PLAN-ASSERTIONS-LIST" ), makeSymbol( "SELF" ), makeSymbol( "RULES" ) ), ConsesLow.list( makeSymbol( "INIT-SIMPLE-SITUATION-PREDS" ), makeSymbol( "SELF" ), makeSymbol(
            "DOMAIN-MT" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) );
    $sym177$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-CYC-DOMAIN-METHOD" );
    $sym178$SHOP_CYC_DOMAIN_INIT_DOMAIN_WITH_RULES_METHOD = makeSymbol( "SHOP-CYC-DOMAIN-INIT-DOMAIN-WITH-RULES-METHOD" );
    $sym179$PROCESS_PLAN_ASSERTIONS = makeSymbol( "PROCESS-PLAN-ASSERTIONS" );
    $list180 = ConsesLow.list( makeString( "Reads planning domain assertions in microtheory mt and\n   translates them into a planning domain data structure\n   for use by the planner." ), ConsesLow.list( makeSymbol(
        "PWHEN" ), makeSymbol( "MT" ), ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "MT" ), makeSymbol( "DOMAIN-MT" ) ), ConsesLow.list(
            makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTIONS" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GATHER-PLANNING-ASSERTIONS" ), makeSymbol(
                "SHOP-CYC-DOMAIN" ) ), makeSymbol( "SELF" ), makeSymbol( "DOMAIN-MT" ) ) ) ), ConsesLow.list( makeSymbol( "PROCESS-PLAN-ASSERTIONS-LIST" ), makeSymbol( "SELF" ), makeSymbol( "ASSERTIONS" ) ), ConsesLow
                    .list( makeSymbol( "INIT-SIMPLE-SITUATION-PREDS" ), makeSymbol( "SELF" ), makeSymbol( "DOMAIN-MT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) );
    $sym181$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-CYC-DOMAIN-METHOD" );
    $sym182$SHOP_CYC_DOMAIN_PROCESS_PLAN_ASSERTIONS_METHOD = makeSymbol( "SHOP-CYC-DOMAIN-PROCESS-PLAN-ASSERTIONS-METHOD" );
    $sym183$PROCESS_METHOD = makeSymbol( "PROCESS-METHOD" );
    $list184 = ConsesLow.list( makeSymbol( "ASSERTION" ) );
    $list185 = ConsesLow.list( makeString( "@param ASSERION assertion-p\n   turns #$methodForAction formula into a planner method datastructure." ), ConsesLow.list( makeSymbol( "CMULTIPLE-VALUE-BIND" ), ConsesLow.list(
        makeSymbol( "METHOD-HEAD" ), makeSymbol( "PRECONDITIONS" ), makeSymbol( "DECOMPOSITION" ) ), ConsesLow.list( makeSymbol( "SHOP-EXTRACT-METHOD-FROM-ASSERTION" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list(
            makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "METHOD-NAME" ), ConsesLow.list( makeSymbol( "FORMULA-OPERATOR" ), makeSymbol( "METHOD-HEAD" ) ) ) ), ConsesLow.list( makeSymbol( "CLET" ),
                ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-METHOD" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ), makeSymbol( "SHOP-BASIC-METHOD" ) ), ConsesLow.list(
                    makeSymbol( "QUOTE" ), makeSymbol( "SHOP-BASIC-METHOD" ) ) ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "INIT" ), makeSymbol( "SHOP-BASIC-METHOD" ) ), makeSymbol(
                        "NEW-METHOD" ), makeSymbol( "ASSERTION" ), makeSymbol( "METHOD-HEAD" ), makeSymbol( "PRECONDITIONS" ), makeSymbol( "DECOMPOSITION" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol(
                            "NEW-METHOD" ), ConsesLow.list( makeSymbol( "GETHASH" ), makeSymbol( "METHOD-NAME" ), makeSymbol( "METHODS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) ) );
    $sym186$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-CYC-DOMAIN-METHOD" );
    $sym187$SHOP_BASIC_METHOD = makeSymbol( "SHOP-BASIC-METHOD" );
    $sym188$SHOP_CYC_DOMAIN_PROCESS_METHOD_METHOD = makeSymbol( "SHOP-CYC-DOMAIN-PROCESS-METHOD-METHOD" );
    $sym189$PROCESS_PRECONDITION = makeSymbol( "PROCESS-PRECONDITION" );
    $list190 = ConsesLow.list( makeString( "@param ASSERTION assertion-p\n   Turn el precondition formulas into  preconditions for action operators." ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow
        .list( makeSymbol( "ASSERTION-FORM" ), ConsesLow.list( makeSymbol( "ASSERTION-FORMULA" ), makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( makeSymbol( "ACTION-HEAD" ), ConsesLow.list( makeSymbol( "FORMULA-ARG2" ),
            makeSymbol( "ASSERTION-FORM" ) ) ), ConsesLow.list( makeSymbol( "DECOMPOSITION" ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "LIST" ), makeKeyword( "PRIMITIVE" ), makeSymbol(
                "ACTION-HEAD" ) ) ) ), ConsesLow.list( makeSymbol( "CONDITIONS" ), ConsesLow.list( makeSymbol( "FORMULA-ARG1" ), makeSymbol( "ASSERTION-FORM" ) ) ), ConsesLow.list( makeSymbol( "NEW-PRECONDITION" ),
                    ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ), makeSymbol( "SHOP-BASIC-PRECONDITION" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                        "SHOP-BASIC-PRECONDITION" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CONDITIONS" ), ConsesLow.list( makeSymbol( "POSSIBLY-CONJUNCTIVE-FORMULA-TO-LITERALS" ), makeSymbol(
                            "CONDITIONS" ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "INIT" ), makeSymbol( "SHOP-BASIC-PRECONDITION" ) ), makeSymbol( "NEW-PRECONDITION" ),
                                makeSymbol( "ASSERTION" ), makeSymbol( "ACTION-HEAD" ), makeSymbol( "CONDITIONS" ), makeSymbol( "DECOMPOSITION" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol(
                                    "NEW-PRECONDITION" ), ConsesLow.list( makeSymbol( "GETHASH" ), ConsesLow.list( makeSymbol( "FORMULA-OPERATOR" ), makeSymbol( "ACTION-HEAD" ) ), makeSymbol( "PRECONDITIONS" ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym191$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-CYC-DOMAIN-METHOD" );
    $kw192$PRIMITIVE = makeKeyword( "PRIMITIVE" );
    $sym193$SHOP_BASIC_PRECONDITION = makeSymbol( "SHOP-BASIC-PRECONDITION" );
    $sym194$SHOP_CYC_DOMAIN_PROCESS_PRECONDITION_METHOD = makeSymbol( "SHOP-CYC-DOMAIN-PROCESS-PRECONDITION-METHOD" );
    $sym195$PROCESS_EFFECT = makeSymbol( "PROCESS-EFFECT" );
    $list196 = ConsesLow.list( makeString( "@param ASSERTION assertion-p \n   Turn el effect statements into add and delete lists for action operators." ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow
        .list( makeSymbol( "ASSERTION-FORM" ), ConsesLow.list( makeSymbol( "ASSERTION-FORMULA" ), makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( makeSymbol( "ACTION-HEAD" ), ConsesLow.list( makeSymbol( "FORMULA-ARG1" ),
            makeSymbol( "ASSERTION-FORM" ) ) ), ConsesLow.list( makeSymbol( "EFFECTS" ), ConsesLow.list( makeSymbol( "FORMULA-ARG2" ), makeSymbol( "ASSERTION-FORM" ) ) ), ConsesLow.list( makeSymbol( "NEW-OPERATOR" ),
                ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ), makeSymbol( "SHOP-BASIC-OPERATOR" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                    "SHOP-BASIC-OPERATOR" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "EFFECTS" ), ConsesLow.list( makeSymbol( "POSSIBLY-CONJUNCTIVE-FORMULA-TO-LITERALS" ), makeSymbol( "EFFECTS" ) ) ),
        ConsesLow.list( makeSymbol( "CMULTIPLE-VALUE-BIND" ), ConsesLow.list( makeSymbol( "ADD-LIST" ), makeSymbol( "DELETE-LIST" ) ), ConsesLow.list( makeSymbol( "SHOP-SEPARATE-EFFECT-LIST" ), makeSymbol( "EFFECTS" ) ),
            ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "INIT" ), makeSymbol( "SHOP-BASIC-OPERATOR" ) ), makeSymbol( "NEW-OPERATOR" ), makeSymbol( "ASSERTION" ), makeSymbol(
                "ACTION-HEAD" ), makeSymbol( "ADD-LIST" ), makeSymbol( "DELETE-LIST" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "NEW-OPERATOR" ), ConsesLow.list( makeSymbol( "GETHASH" ), ConsesLow.list(
                    makeSymbol( "FORMULA-OPERATOR" ), makeSymbol( "ACTION-HEAD" ) ), makeSymbol( "OPERATORS" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) );
    $sym197$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-CYC-DOMAIN-METHOD" );
    $sym198$SHOP_BASIC_OPERATOR = makeSymbol( "SHOP-BASIC-OPERATOR" );
    $sym199$SHOP_CYC_DOMAIN_PROCESS_EFFECT_METHOD = makeSymbol( "SHOP-CYC-DOMAIN-PROCESS-EFFECT-METHOD" );
    $sym200$PROCESS_SUFFICIENT_COND = makeSymbol( "PROCESS-SUFFICIENT-COND" );
    $list201 = ConsesLow.list( makeString( "@param ASSERTION assertion-p" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION-FORM" ), ConsesLow.list( makeSymbol(
        "ASSERTION-FORMULA" ), makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( makeSymbol( "PRECONDITION" ), ConsesLow.list( makeSymbol( "FORMULA-ARG1" ), makeSymbol( "ASSERTION-FORM" ) ) ), ConsesLow.list( makeSymbol(
            "ACTION-FORM" ), ConsesLow.list( makeSymbol( "FORMULA-ARG2" ), makeSymbol( "ASSERTION-FORM" ) ) ), ConsesLow.list( makeSymbol( "NEW-SCOND" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list(
                makeSymbol( "NEW" ), makeSymbol( "SHOP-BASIC-SUFFICIENCY-COND" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SHOP-BASIC-SUFFICIENCY-COND" ) ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                    makeSymbol( "PRECONDITION" ), ConsesLow.list( makeSymbol( "POSSIBLY-CONJUNCTIVE-FORMULA-TO-LITERALS" ), makeSymbol( "PRECONDITION" ) ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol(
                        "NEW-SCOND" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SET-HEAD" ) ), makeSymbol( "ACTION-FORM" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NEW-SCOND" ), ConsesLow.list(
                            makeSymbol( "QUOTE" ), makeSymbol( "SET-COND-FORMULA" ) ), makeSymbol( "PRECONDITION" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NEW-SCOND" ), ConsesLow.list( makeSymbol(
                                "QUOTE" ), makeSymbol( "SET-ASSERTIONS" ) ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "NEW-SCOND" ),
                                    ConsesLow.list( makeSymbol( "GETHASH" ), ConsesLow.list( makeSymbol( "FORMULA-OPERATOR" ), makeSymbol( "ACTION-FORM" ) ), makeSymbol( "SUFFICIENCIES" ) ) ), ConsesLow.list( makeSymbol(
                                        "RET" ), NIL ) ) );
    $sym202$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-CYC-DOMAIN-METHOD" );
    $sym203$SHOP_BASIC_SUFFICIENCY_COND = makeSymbol( "SHOP-BASIC-SUFFICIENCY-COND" );
    $sym204$SET_HEAD = makeSymbol( "SET-HEAD" );
    $sym205$SET_COND_FORMULA = makeSymbol( "SET-COND-FORMULA" );
    $sym206$SET_ASSERTIONS = makeSymbol( "SET-ASSERTIONS" );
    $sym207$SHOP_CYC_DOMAIN_PROCESS_SUFFICIENT_COND_METHOD = makeSymbol( "SHOP-CYC-DOMAIN-PROCESS-SUFFICIENT-COND-METHOD" );
    $sym208$PROCESS_CONDITIONAL_EFFECT = makeSymbol( "PROCESS-CONDITIONAL-EFFECT" );
    $list209 = ConsesLow.list( makeString( "@param ASSERTION assertion-p" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FORMULA" ), ConsesLow.list( makeSymbol(
        "ASSERTION-FORMULA" ), makeSymbol( "ASSERTION" ) ) ), ConsesLow.list( makeSymbol( "PRED" ), ConsesLow.list( makeSymbol( "FORMULA-OPERATOR" ), makeSymbol( "FORMULA" ) ) ), ConsesLow.list( makeSymbol(
            "ACTION-FORMULA" ), ConsesLow.list( makeSymbol( "FORMULA-ARG1" ), makeSymbol( "FORMULA" ) ) ), ConsesLow.list( makeSymbol( "ACTION-HEAD" ), makeSymbol( "ACTION-FORMULA" ) ), ConsesLow.list( makeSymbol(
                "CONDITION" ), ConsesLow.list( makeSymbol( "FORMULA-ARG2" ), makeSymbol( "FORMULA" ) ) ), ConsesLow.list( makeSymbol( "EFFECTS" ), ConsesLow.list( makeSymbol( "FORMULA-ARG3" ), makeSymbol(
                    "FORMULA" ) ) ), ConsesLow.list( makeSymbol( "COND-EFFECT-OPERATOR" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ), makeSymbol(
                        "SHOP-BASIC-CONDITIONAL-EFFECT" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SHOP-BASIC-CONDITIONAL-EFFECT" ) ) ) ) ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( EQ,
                            makeSymbol( "PRED" ), constant_handles.reader_make_constant_shell( makeString( "effectOfActionIf-Props" ) ) ), makeString(
                                "process-conditional-effect:~a is not at conditional effect assertion." ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "EFFECTS" ), ConsesLow.list(
                                    makeSymbol( "POSSIBLY-CONJUNCTIVE-FORMULA-TO-LITERALS" ), makeSymbol( "EFFECTS" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CONDITION" ), ConsesLow.list( makeSymbol(
                                        "POSSIBLY-CONJUNCTIVE-FORMULA-TO-LITERALS" ), makeSymbol( "CONDITION" ) ) ), ConsesLow.list( makeSymbol( "CMULTIPLE-VALUE-BIND" ), ConsesLow.list( makeSymbol( "ADD-LIST" ),
                                            makeSymbol( "DELETE-LIST" ) ), ConsesLow.list( makeSymbol( "SHOP-SEPARATE-EFFECT-LIST" ), makeSymbol( "EFFECTS" ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow
                                                .list( makeSymbol( "INIT" ), makeSymbol( "SHOP-BASIC-CONDITIONAL-EFFECT" ) ), makeSymbol( "COND-EFFECT-OPERATOR" ), makeSymbol( "ACTION-HEAD" ), makeSymbol( "CONDITION" ),
                                                makeSymbol( "ADD-LIST" ), makeSymbol( "DELETE-LIST" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "COND-EFFECT-OPERATOR" ), ConsesLow
                                                    .list( makeSymbol( "GETHASH" ), ConsesLow.list( makeSymbol( "FORMULA-OPERATOR" ), makeSymbol( "ACTION-HEAD" ) ), makeSymbol( "COND-OPERATORS" ) ) ) ) ), ConsesLow.list(
                                                        makeSymbol( "RET" ), NIL ) );
    $sym210$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-CYC-DOMAIN-METHOD" );
    $sym211$SHOP_BASIC_CONDITIONAL_EFFECT = makeSymbol( "SHOP-BASIC-CONDITIONAL-EFFECT" );
    $str212$process_conditional_effect__a_is_ = makeString( "process-conditional-effect:~a is not at conditional effect assertion." );
    $sym213$SHOP_CYC_DOMAIN_PROCESS_CONDITIONAL_EFFECT_METHOD = makeSymbol( "SHOP-CYC-DOMAIN-PROCESS-CONDITIONAL-EFFECT-METHOD" );
    $const214$implies = constant_handles.reader_make_constant_shell( makeString( "implies" ) );
    $sym215$SHOP_METHOD_FORMULA_P = makeSymbol( "SHOP-METHOD-FORMULA-P" );
    $sym216$NEGATE = makeSymbol( "NEGATE" );
    $const217$equals = constant_handles.reader_make_constant_shell( makeString( "equals" ) );
    $const218$TheList = constant_handles.reader_make_constant_shell( makeString( "TheList" ) );
    $const219$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
  }
}
/*
 * 
 * Total time: 1000 ms
 * 
 */