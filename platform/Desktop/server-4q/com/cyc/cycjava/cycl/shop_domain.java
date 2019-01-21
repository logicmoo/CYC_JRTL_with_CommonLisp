package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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

public final class shop_domain extends SubLTranslatedFile
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
    public static SubLObject shop_domain_p(final SubLObject v_shop_domain) {
        return interfaces.subloop_instanceof_interface(v_shop_domain, (SubLObject)shop_domain.$sym0$SHOP_DOMAIN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
    public static SubLObject get_shop_basic_domain_simple_situation_preds(final SubLObject shop_basic_domain) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_domain, (SubLObject)shop_domain.SEVEN_INTEGER, (SubLObject)shop_domain.$sym6$SIMPLE_SITUATION_PREDS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
    public static SubLObject set_shop_basic_domain_simple_situation_preds(final SubLObject shop_basic_domain, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_domain, value, (SubLObject)shop_domain.SEVEN_INTEGER, (SubLObject)shop_domain.$sym6$SIMPLE_SITUATION_PREDS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
    public static SubLObject get_shop_basic_domain_mt(final SubLObject shop_basic_domain) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_domain, (SubLObject)shop_domain.SIX_INTEGER, (SubLObject)shop_domain.$sym7$MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
    public static SubLObject set_shop_basic_domain_mt(final SubLObject shop_basic_domain, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_domain, value, (SubLObject)shop_domain.SIX_INTEGER, (SubLObject)shop_domain.$sym7$MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
    public static SubLObject get_shop_basic_domain_sufficiencies(final SubLObject shop_basic_domain) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_domain, (SubLObject)shop_domain.FIVE_INTEGER, (SubLObject)shop_domain.$sym8$SUFFICIENCIES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
    public static SubLObject set_shop_basic_domain_sufficiencies(final SubLObject shop_basic_domain, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_domain, value, (SubLObject)shop_domain.FIVE_INTEGER, (SubLObject)shop_domain.$sym8$SUFFICIENCIES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
    public static SubLObject get_shop_basic_domain_cond_operators(final SubLObject shop_basic_domain) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_domain, (SubLObject)shop_domain.FOUR_INTEGER, (SubLObject)shop_domain.$sym9$COND_OPERATORS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
    public static SubLObject set_shop_basic_domain_cond_operators(final SubLObject shop_basic_domain, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_domain, value, (SubLObject)shop_domain.FOUR_INTEGER, (SubLObject)shop_domain.$sym9$COND_OPERATORS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
    public static SubLObject get_shop_basic_domain_operators(final SubLObject shop_basic_domain) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_domain, (SubLObject)shop_domain.THREE_INTEGER, (SubLObject)shop_domain.$sym10$OPERATORS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
    public static SubLObject set_shop_basic_domain_operators(final SubLObject shop_basic_domain, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_domain, value, (SubLObject)shop_domain.THREE_INTEGER, (SubLObject)shop_domain.$sym10$OPERATORS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
    public static SubLObject get_shop_basic_domain_preconditions(final SubLObject shop_basic_domain) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_domain, (SubLObject)shop_domain.TWO_INTEGER, (SubLObject)shop_domain.$sym11$PRECONDITIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
    public static SubLObject set_shop_basic_domain_preconditions(final SubLObject shop_basic_domain, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_domain, value, (SubLObject)shop_domain.TWO_INTEGER, (SubLObject)shop_domain.$sym11$PRECONDITIONS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
    public static SubLObject get_shop_basic_domain_methods(final SubLObject shop_basic_domain) {
        return classes.subloop_get_access_protected_instance_slot(shop_basic_domain, (SubLObject)shop_domain.ONE_INTEGER, (SubLObject)shop_domain.$sym12$METHODS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
    public static SubLObject set_shop_basic_domain_methods(final SubLObject shop_basic_domain, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(shop_basic_domain, value, (SubLObject)shop_domain.ONE_INTEGER, (SubLObject)shop_domain.$sym12$METHODS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
    public static SubLObject subloop_reserved_initialize_shop_basic_domain_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_domain.$sym3$OBJECT, (SubLObject)shop_domain.$sym13$INSTANCE_COUNT, (SubLObject)shop_domain.ZERO_INTEGER);
        return (SubLObject)shop_domain.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
    public static SubLObject subloop_reserved_initialize_shop_basic_domain_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_domain.$sym3$OBJECT, (SubLObject)shop_domain.$sym15$ISOLATED_P, (SubLObject)shop_domain.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_domain.$sym3$OBJECT, (SubLObject)shop_domain.$sym16$INSTANCE_NUMBER, (SubLObject)shop_domain.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym12$METHODS, (SubLObject)shop_domain.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym11$PRECONDITIONS, (SubLObject)shop_domain.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym10$OPERATORS, (SubLObject)shop_domain.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym9$COND_OPERATORS, (SubLObject)shop_domain.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym8$SUFFICIENCIES, (SubLObject)shop_domain.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym7$MT, (SubLObject)shop_domain.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym6$SIMPLE_SITUATION_PREDS, (SubLObject)shop_domain.NIL);
        return (SubLObject)shop_domain.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 1410L)
    public static SubLObject shop_basic_domain_p(final SubLObject shop_basic_domain) {
        return classes.subloop_instanceof_class(shop_basic_domain, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 2792L)
    public static SubLObject shop_domain_rule_table_for_type(final SubLObject type) {
        return list_utilities.alist_lookup(shop_domain.$shop_domain_planner_rule_slot_map$.getGlobalValue(), type, (SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 2914L)
    public static SubLObject shop_basic_domain_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_domain_method = (SubLObject)shop_domain.NIL;
        SubLObject mt = get_shop_basic_domain_mt(self);
        SubLObject sufficiencies = get_shop_basic_domain_sufficiencies(self);
        SubLObject cond_operators = get_shop_basic_domain_cond_operators(self);
        SubLObject operators = get_shop_basic_domain_operators(self);
        SubLObject preconditions = get_shop_basic_domain_preconditions(self);
        SubLObject v_methods = get_shop_basic_domain_methods(self);
        try {
            thread.throwStack.push(shop_domain.$sym22$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
            try {
                object.object_initialize_method(self);
                mt = (SubLObject)shop_domain.NIL;
                v_methods = Hashtables.make_hash_table((SubLObject)shop_domain.$int23$100, (SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED);
                operators = Hashtables.make_hash_table((SubLObject)shop_domain.$int23$100, (SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED);
                preconditions = Hashtables.make_hash_table((SubLObject)shop_domain.$int23$100, (SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED);
                sufficiencies = Hashtables.make_hash_table((SubLObject)shop_domain.TEN_INTEGER, (SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED);
                cond_operators = Hashtables.make_hash_table((SubLObject)shop_domain.TEN_INTEGER, (SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym22$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_mt(self, mt);
                    set_shop_basic_domain_sufficiencies(self, sufficiencies);
                    set_shop_basic_domain_cond_operators(self, cond_operators);
                    set_shop_basic_domain_operators(self, operators);
                    set_shop_basic_domain_preconditions(self, preconditions);
                    set_shop_basic_domain_methods(self, v_methods);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym22$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 3437L)
    public static SubLObject shop_basic_domain_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject mt = get_shop_basic_domain_mt(self);
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push(shop_domain.$sym28$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
            try {
                if (shop_domain.NIL != subloop_structures.instance_p(self)) {
                    PrintLow.format(stream, (SubLObject)shop_domain.$str29$__DOMAIN__S__S_, instance_number, mt);
                }
                else {
                    PrintLow.format(stream, (SubLObject)shop_domain.$str30$__Malformed_Instance_);
                }
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym28$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_mt(self, mt);
                    object.set_object_instance_number(self, instance_number);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym28$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 3665L)
    public static SubLObject shop_basic_domain_get_name_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject mt = get_shop_basic_domain_mt(self);
        try {
            thread.throwStack.push(shop_domain.$sym35$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym35$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, mt);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_mt(self, mt);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym35$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 3740L)
    public static SubLObject shop_task_pred_string(final SubLObject entry) {
        if (entry.isList()) {
            final SubLObject item = entry.first();
            if (shop_domain.NIL != constant_handles.constant_p(item)) {
                return constants_high.constant_name(item);
            }
            if (shop_domain.NIL != variables.variable_p(item)) {
                return PrintLow.format((SubLObject)shop_domain.NIL, (SubLObject)shop_domain.$str37$var_A, variables.variable_id(item));
            }
        }
        return string_utilities.$empty_string$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 5551L)
    public static SubLObject shop_find_all_matching_rules(final SubLObject task, final SubLObject hash_table) {
        final SubLObject keys = hash_table_utilities.hash_table_keys(hash_table);
        final SubLObject var_keys = list_utilities.remove_if_not((SubLObject)shop_domain.$sym38$HL_VAR_, keys, (SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED);
        SubLObject values = (SubLObject)shop_domain.NIL;
        SubLObject cdolist_list_var = var_keys;
        SubLObject item = (SubLObject)shop_domain.NIL;
        item = cdolist_list_var.first();
        while (shop_domain.NIL != cdolist_list_var) {
            values = ConsesLow.append(Hashtables.gethash(item, hash_table, (SubLObject)shop_domain.UNPROVIDED), values);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return ConsesLow.append(Hashtables.gethash(cycl_utilities.formula_operator(task), hash_table, (SubLObject)shop_domain.UNPROVIDED), values);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 5886L)
    public static SubLObject shop_basic_domain_rule_table_for_type_method(final SubLObject self, final SubLObject type) {
        final SubLObject slotname = shop_domain_rule_table_for_type(type);
        return instances.get_slot(self, slotname);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 6062L)
    public static SubLObject shop_basic_domain_get_planner_rules_method(final SubLObject self, final SubLObject task, final SubLObject type) {
        assert shop_domain.NIL != Types.listp(task) : task;
        assert shop_domain.NIL != Types.function_spec_p(type) : type;
        final SubLObject rule_table = shop_basic_domain_rule_table_for_type_method(self, type);
        assert shop_domain.NIL != Types.hash_table_p(rule_table) : rule_table;
        final SubLObject rule_list = shop_find_all_matching_rules(task, rule_table);
        SubLObject unified_rules = (SubLObject)shop_domain.NIL;
        SubLObject cdolist_list_var = rule_list;
        SubLObject cur_rule = (SubLObject)shop_domain.NIL;
        cur_rule = cdolist_list_var.first();
        while (shop_domain.NIL != cdolist_list_var) {
            if (shop_domain.NIL == shop_datastructures.shop_unify_failedP(shop_datastructures.shop_unify(shop_datastructures.shop_basic_planner_rule_head_method(cur_rule), task))) {
                unified_rules = (SubLObject)ConsesLow.cons(cur_rule, unified_rules);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_rule = cdolist_list_var.first();
        }
        return unified_rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 6625L)
    public static SubLObject shop_basic_domain_html_display_all_rules_of_type_method(final SubLObject self, final SubLObject type) {
        assert shop_domain.NIL != Types.function_spec_p(type) : type;
        final SubLObject rule_table = shop_basic_domain_rule_table_for_type_method(self, type);
        assert shop_domain.NIL != Types.hash_table_p(rule_table) : rule_table;
        SubLObject alist = hash_table_utilities.hash_table_to_alist(rule_table);
        SubLObject cdolist_list_var;
        alist = (cdolist_list_var = Sort.sort(alist, Symbols.symbol_function((SubLObject)shop_domain.$sym53$STRING__), (SubLObject)shop_domain.$sym54$SHOP_TASK_PRED_STRING));
        SubLObject cons = (SubLObject)shop_domain.NIL;
        cons = cdolist_list_var.first();
        while (shop_domain.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject cur_name = (SubLObject)shop_domain.NIL;
            SubLObject cur_rules = (SubLObject)shop_domain.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_domain.$list55);
            cur_name = current.first();
            current = (cur_rules = current.rest());
            cb_utilities.cb_form(cur_name, (SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED);
            html_utilities.html_newline((SubLObject)shop_domain.UNPROVIDED);
            SubLObject cdolist_list_var_$1 = cur_rules;
            SubLObject cur_rule = (SubLObject)shop_domain.NIL;
            cur_rule = cdolist_list_var_$1.first();
            while (shop_domain.NIL != cdolist_list_var_$1) {
                methods.funcall_instance_method_with_0_args(cur_rule, (SubLObject)shop_domain.$sym56$HTML_DISPLAY);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                cur_rule = cdolist_list_var_$1.first();
            }
            html_utilities.html_hr((SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return (SubLObject)shop_domain.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 7146L)
    public static SubLObject shop_basic_domain_add_sufficient_conds_method(final SubLObject self, SubLObject cond) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject sufficiencies = get_shop_basic_domain_sufficiencies(self);
        try {
            thread.throwStack.push(shop_domain.$sym61$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
            try {
                if (shop_domain.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && shop_domain.NIL == shop_datastructures.shop_planner_rule_p(cond)) {
                    Errors.error((SubLObject)shop_domain.$str62$_ADD_SUFFICIENCY_COND__S____S_is_, self, cond);
                }
                cond = (SubLObject)ConsesLow.cons(Hashtables.gethash(methods.funcall_instance_method_with_0_args(cond, (SubLObject)shop_domain.$sym63$PRED), sufficiencies, (SubLObject)shop_domain.UNPROVIDED), cond);
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym61$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, (SubLObject)shop_domain.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_sufficiencies(self, sufficiencies);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym61$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 7442L)
    public static SubLObject shop_basic_domain_get_sufficient_conds_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject sufficiencies = get_shop_basic_domain_sufficiencies(self);
        try {
            thread.throwStack.push(shop_domain.$sym68$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
            try {
                assert shop_domain.NIL != Types.listp(task) : task;
                final SubLObject task_op = cycl_utilities.formula_operator(task);
                final SubLObject scond_list = Hashtables.gethash(task_op, sufficiencies, (SubLObject)shop_domain.UNPROVIDED);
                SubLObject unified_sconds = (SubLObject)shop_domain.NIL;
                SubLObject cdolist_list_var = scond_list;
                SubLObject cur_scond = (SubLObject)shop_domain.NIL;
                cur_scond = cdolist_list_var.first();
                while (shop_domain.NIL != cdolist_list_var) {
                    if (shop_domain.$kw69$FAIL != shop_datastructures.shop_unify(shop_datastructures.shop_basic_planner_rule_head_method(cur_scond), task)) {
                        unified_sconds = (SubLObject)ConsesLow.cons(cur_scond, unified_sconds);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cur_scond = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym68$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, unified_sconds);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_sufficiencies(self, sufficiencies);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym68$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 8134L)
    public static SubLObject shop_basic_domain_print_all_sconds_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject sufficiencies = get_shop_basic_domain_sufficiencies(self);
        try {
            thread.throwStack.push(shop_domain.$sym73$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
            try {
                SubLObject cur_name = (SubLObject)shop_domain.NIL;
                SubLObject cur_sconds = (SubLObject)shop_domain.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(sufficiencies);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        cur_name = Hashtables.getEntryKey(cdohash_entry);
                        cur_sconds = Hashtables.getEntryValue(cdohash_entry);
                        PrintLow.format((SubLObject)shop_domain.T, (SubLObject)shop_domain.$str74$___s, cur_name);
                        SubLObject cdolist_list_var = cur_sconds;
                        SubLObject cur_scond = (SubLObject)shop_domain.NIL;
                        cur_scond = cdolist_list_var.first();
                        while (shop_domain.NIL != cdolist_list_var) {
                            object.describe_instance(cur_scond);
                            cdolist_list_var = cdolist_list_var.rest();
                            cur_scond = cdolist_list_var.first();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym73$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, (SubLObject)shop_domain.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_sufficiencies(self, sufficiencies);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym73$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 8372L)
    public static SubLObject shop_basic_domain_html_display_all_sconds_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject sufficiencies = get_shop_basic_domain_sufficiencies(self);
        try {
            thread.throwStack.push(shop_domain.$sym78$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
            try {
                SubLObject alist = hash_table_utilities.hash_table_to_alist(sufficiencies);
                SubLObject cdolist_list_var;
                alist = (cdolist_list_var = Sort.sort(alist, Symbols.symbol_function((SubLObject)shop_domain.$sym53$STRING__), (SubLObject)shop_domain.$sym54$SHOP_TASK_PRED_STRING));
                SubLObject cons = (SubLObject)shop_domain.NIL;
                cons = cdolist_list_var.first();
                while (shop_domain.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = cons;
                    SubLObject cur_name = (SubLObject)shop_domain.NIL;
                    SubLObject cur_sconds = (SubLObject)shop_domain.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_domain.$list79);
                    cur_name = current.first();
                    current = (cur_sconds = current.rest());
                    cb_utilities.cb_form(cur_name, (SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED);
                    html_utilities.html_newline((SubLObject)shop_domain.UNPROVIDED);
                    SubLObject cdolist_list_var_$2 = cur_sconds;
                    SubLObject cur_scond = (SubLObject)shop_domain.NIL;
                    cur_scond = cdolist_list_var_$2.first();
                    while (shop_domain.NIL != cdolist_list_var_$2) {
                        methods.funcall_instance_method_with_0_args(cur_scond, (SubLObject)shop_domain.$sym56$HTML_DISPLAY);
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        cur_scond = cdolist_list_var_$2.first();
                    }
                    html_utilities.html_hr((SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    cons = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym78$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, (SubLObject)shop_domain.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_sufficiencies(self, sufficiencies);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym78$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 8759L)
    public static SubLObject shop_basic_domain_add_method_method(final SubLObject self, final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject v_methods = get_shop_basic_domain_methods(self);
        try {
            thread.throwStack.push(shop_domain.$sym84$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
            try {
                if (shop_domain.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && shop_domain.NIL == shop_datastructures.shop_method_p(method)) {
                    Errors.error((SubLObject)shop_domain.$str85$_ADD_METHOD__S____S_is_not_a_vali, self, method);
                }
                Hashtables.sethash(shop_datastructures.shop_basic_planner_rule_pred_method(method), v_methods, (SubLObject)ConsesLow.cons(method, Hashtables.gethash(shop_datastructures.shop_basic_planner_rule_pred_method(method), v_methods, (SubLObject)shop_domain.UNPROVIDED)));
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym84$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, (SubLObject)shop_domain.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_methods(self, v_methods);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym84$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 9050L)
    public static SubLObject shop_basic_domain_get_methods_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject v_methods = get_shop_basic_domain_methods(self);
        try {
            thread.throwStack.push(shop_domain.$sym89$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
            try {
                assert shop_domain.NIL != Types.listp(task) : task;
                final SubLObject method_list = shop_find_all_matching_rules(task, v_methods);
                SubLObject unified_methods = (SubLObject)shop_domain.NIL;
                SubLObject cdolist_list_var = method_list;
                SubLObject cur_method = (SubLObject)shop_domain.NIL;
                cur_method = cdolist_list_var.first();
                while (shop_domain.NIL != cdolist_list_var) {
                    if (shop_domain.NIL == shop_datastructures.shop_unify_failedP(shop_datastructures.shop_unify(shop_datastructures.shop_basic_planner_rule_head_method(cur_method), task))) {
                        unified_methods = (SubLObject)ConsesLow.cons(cur_method, unified_methods);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cur_method = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym89$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, unified_methods);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_methods(self, v_methods);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym89$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 9773L)
    public static SubLObject shop_basic_domain_print_all_methods_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject v_methods = get_shop_basic_domain_methods(self);
        try {
            thread.throwStack.push(shop_domain.$sym93$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
            try {
                SubLObject cur_name = (SubLObject)shop_domain.NIL;
                SubLObject cur_methods = (SubLObject)shop_domain.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(v_methods);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        cur_name = Hashtables.getEntryKey(cdohash_entry);
                        cur_methods = Hashtables.getEntryValue(cdohash_entry);
                        PrintLow.format((SubLObject)shop_domain.T, (SubLObject)shop_domain.$str74$___s, cur_name);
                        SubLObject cdolist_list_var = cur_methods;
                        SubLObject cur_method = (SubLObject)shop_domain.NIL;
                        cur_method = cdolist_list_var.first();
                        while (shop_domain.NIL != cdolist_list_var) {
                            object.describe_instance(cur_method);
                            cdolist_list_var = cdolist_list_var.rest();
                            cur_method = cdolist_list_var.first();
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym93$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, (SubLObject)shop_domain.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_methods(self, v_methods);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym93$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 10086L)
    public static SubLObject shop_basic_domain_html_display_all_methods_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject v_methods = get_shop_basic_domain_methods(self);
        try {
            thread.throwStack.push(shop_domain.$sym97$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
            try {
                SubLObject alist = hash_table_utilities.hash_table_to_alist(v_methods);
                if (shop_domain.NIL == alist) {
                    Dynamic.sublisp_throw((SubLObject)shop_domain.$sym97$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, (SubLObject)shop_domain.NIL);
                }
                SubLObject cdolist_list_var;
                alist = (cdolist_list_var = Sort.sort(alist, Symbols.symbol_function((SubLObject)shop_domain.$sym53$STRING__), (SubLObject)shop_domain.$sym54$SHOP_TASK_PRED_STRING));
                SubLObject cons = (SubLObject)shop_domain.NIL;
                cons = cdolist_list_var.first();
                while (shop_domain.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = cons;
                    SubLObject cur_name = (SubLObject)shop_domain.NIL;
                    SubLObject cur_methods = (SubLObject)shop_domain.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_domain.$list98);
                    cur_name = current.first();
                    current = (cur_methods = current.rest());
                    cb_utilities.cb_form(cur_name, (SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED);
                    html_utilities.html_newline((SubLObject)shop_domain.UNPROVIDED);
                    SubLObject cdolist_list_var_$3 = cur_methods;
                    SubLObject cur_method = (SubLObject)shop_domain.NIL;
                    cur_method = cdolist_list_var_$3.first();
                    while (shop_domain.NIL != cdolist_list_var_$3) {
                        methods.funcall_instance_method_with_0_args(cur_method, (SubLObject)shop_domain.$sym56$HTML_DISPLAY);
                        html_utilities.html_newline((SubLObject)shop_domain.UNPROVIDED);
                        cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                        cur_method = cdolist_list_var_$3.first();
                    }
                    html_utilities.html_hr((SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    cons = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym97$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, (SubLObject)shop_domain.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_methods(self, v_methods);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym97$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 10525L)
    public static SubLObject shop_basic_domain_add_operator_method(final SubLObject self, final SubLObject operator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject operators = get_shop_basic_domain_operators(self);
        try {
            thread.throwStack.push(shop_domain.$sym103$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
            try {
                if (shop_domain.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && shop_domain.NIL == shop_datastructures.shop_operator_p(operator)) {
                    Errors.error((SubLObject)shop_domain.$str104$_ADD_OPERATOR__S____S_is_not_a_va, self, operator);
                }
                Hashtables.sethash(methods.funcall_instance_method_with_0_args(operator, (SubLObject)shop_domain.$sym105$NAME), operators, (SubLObject)ConsesLow.cons(operator, Hashtables.gethash(methods.funcall_instance_method_with_0_args(operator, (SubLObject)shop_domain.$sym105$NAME), operators, (SubLObject)shop_domain.UNPROVIDED)));
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym103$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, (SubLObject)shop_domain.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_operators(self, operators);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym103$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 10809L)
    public static SubLObject shop_basic_domain_get_operators_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject operators = get_shop_basic_domain_operators(self);
        try {
            thread.throwStack.push(shop_domain.$sym109$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
            try {
                assert shop_domain.NIL != Types.listp(task) : task;
                final SubLObject pred = cycl_utilities.formula_operator(task);
                final SubLObject operator_list = Hashtables.gethash(pred, operators, (SubLObject)shop_domain.UNPROVIDED);
                SubLObject results = (SubLObject)shop_domain.NIL;
                SubLObject cdolist_list_var = operator_list;
                SubLObject op = (SubLObject)shop_domain.NIL;
                op = cdolist_list_var.first();
                while (shop_domain.NIL != cdolist_list_var) {
                    final SubLObject cur_head = shop_datastructures.shop_basic_planner_rule_head_method(op);
                    if (shop_domain.NIL == shop_datastructures.shop_unify_failedP(shop_datastructures.shop_unify(cur_head.rest(), task.rest()))) {
                        results = (SubLObject)ConsesLow.cons(op, results);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    op = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym109$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, Sequences.nreverse(results));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_operators(self, operators);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym109$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 11313L)
    public static SubLObject shop_basic_domain_print_all_operators_method(final SubLObject self, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject operators = get_shop_basic_domain_operators(self);
        try {
            thread.throwStack.push(shop_domain.$sym114$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
            try {
                SubLObject x = (SubLObject)shop_domain.NIL;
                SubLObject y = (SubLObject)shop_domain.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(operators);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        x = Hashtables.getEntryKey(cdohash_entry);
                        y = Hashtables.getEntryValue(cdohash_entry);
                        final SubLObject temp = y.first();
                        final SubLObject head = methods.funcall_instance_method_with_0_args(temp, (SubLObject)shop_domain.$sym115$HEAD);
                        final SubLObject add_literals = instances.get_slot(temp, (SubLObject)shop_domain.$sym116$ADDS);
                        final SubLObject delete_literals = instances.get_slot(temp, (SubLObject)shop_domain.$sym117$DELETES);
                        final SubLObject conditional_effects = instances.get_slot(temp, (SubLObject)shop_domain.$sym118$CONDITIONAL_EFFECTS);
                        final SubLObject cost = shop_datastructures.get_shop_basic_operator_cost(temp);
                        PrintLow.format(stream, (SubLObject)shop_domain.$str74$___s, x);
                        PrintLow.format(stream, (SubLObject)shop_domain.$str119$____Head___S, head);
                        PrintLow.format(stream, (SubLObject)shop_domain.$str120$____Add_literals_______S, add_literals);
                        PrintLow.format(stream, (SubLObject)shop_domain.$str121$____Delete_literals___S, delete_literals);
                        PrintLow.format(stream, (SubLObject)shop_domain.$str122$____Conditional_Effects___s, conditional_effects);
                        PrintLow.format(stream, (SubLObject)shop_domain.$str123$____Cost___S, cost);
                        PrintLow.format(stream, (SubLObject)shop_domain.$str124$__);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym114$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, (SubLObject)shop_domain.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_operators(self, operators);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym114$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 12062L)
    public static SubLObject shop_basic_domain_html_display_all_operators_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject operators = get_shop_basic_domain_operators(self);
        try {
            thread.throwStack.push(shop_domain.$sym128$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
            try {
                SubLObject alist = hash_table_utilities.hash_table_to_alist(operators);
                if (shop_domain.NIL == alist) {
                    Dynamic.sublisp_throw((SubLObject)shop_domain.$sym128$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, (SubLObject)shop_domain.NIL);
                }
                SubLObject cdolist_list_var;
                alist = (cdolist_list_var = Sort.sort(alist, Symbols.symbol_function((SubLObject)shop_domain.$sym53$STRING__), (SubLObject)shop_domain.$sym54$SHOP_TASK_PRED_STRING));
                SubLObject cons = (SubLObject)shop_domain.NIL;
                cons = cdolist_list_var.first();
                while (shop_domain.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = cons;
                    SubLObject pred = (SubLObject)shop_domain.NIL;
                    SubLObject ops = (SubLObject)shop_domain.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_domain.$list129);
                    pred = current.first();
                    current = (ops = current.rest());
                    cb_utilities.cb_form(pred, (SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED);
                    html_utilities.html_newline((SubLObject)shop_domain.UNPROVIDED);
                    SubLObject cdolist_list_var_$4 = ops;
                    SubLObject cur_op = (SubLObject)shop_domain.NIL;
                    cur_op = cdolist_list_var_$4.first();
                    while (shop_domain.NIL != cdolist_list_var_$4) {
                        methods.funcall_instance_method_with_0_args(cur_op, (SubLObject)shop_domain.$sym56$HTML_DISPLAY);
                        html_utilities.html_newline((SubLObject)shop_domain.UNPROVIDED);
                        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                        cur_op = cdolist_list_var_$4.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cons = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym128$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, (SubLObject)shop_domain.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_operators(self, operators);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym128$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 12457L)
    public static SubLObject shop_basic_domain_get_conditional_operators_method(final SubLObject self, final SubLObject task) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject cond_operators = get_shop_basic_domain_cond_operators(self);
        try {
            thread.throwStack.push(shop_domain.$sym133$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
            try {
                assert shop_domain.NIL != Types.listp(task) : task;
                final SubLObject pred = cycl_utilities.formula_operator(task);
                SubLObject results = (SubLObject)shop_domain.NIL;
                if (shop_domain.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && shop_domain.NIL == forts.fort_p(pred)) {
                    Errors.error((SubLObject)shop_domain.$str134$_get_conditional_operators_shop_b, task, pred);
                }
                SubLObject cdolist_list_var = shop_find_all_matching_rules(task, cond_operators);
                SubLObject op = (SubLObject)shop_domain.NIL;
                op = cdolist_list_var.first();
                while (shop_domain.NIL != cdolist_list_var) {
                    final SubLObject cur_head = shop_datastructures.shop_basic_planner_rule_head_method(op);
                    if (shop_domain.NIL == shop_datastructures.shop_unify_failedP(shop_datastructures.shop_unify(cur_head.rest(), task.rest()))) {
                        results = (SubLObject)ConsesLow.cons(op, results);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    op = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym133$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, Sequences.nreverse(results));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_cond_operators(self, cond_operators);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym133$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 13137L)
    public static SubLObject shop_basic_domain_html_display_all_conditional_operators_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject cond_operators = get_shop_basic_domain_cond_operators(self);
        try {
            thread.throwStack.push(shop_domain.$sym138$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
            try {
                final SubLObject alist = hash_table_utilities.hash_table_to_alist(cond_operators);
                Sort.sort(alist, Symbols.symbol_function((SubLObject)shop_domain.$sym53$STRING__), (SubLObject)shop_domain.$sym54$SHOP_TASK_PRED_STRING);
                SubLObject cdolist_list_var = alist;
                SubLObject cons = (SubLObject)shop_domain.NIL;
                cons = cdolist_list_var.first();
                while (shop_domain.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = cons;
                    SubLObject pred = (SubLObject)shop_domain.NIL;
                    SubLObject ops = (SubLObject)shop_domain.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)shop_domain.$list129);
                    pred = current.first();
                    current = (ops = current.rest());
                    cb_utilities.cb_form(pred, (SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED);
                    html_utilities.html_newline((SubLObject)shop_domain.UNPROVIDED);
                    SubLObject cdolist_list_var_$5 = ops;
                    SubLObject cur_op = (SubLObject)shop_domain.NIL;
                    cur_op = cdolist_list_var_$5.first();
                    while (shop_domain.NIL != cdolist_list_var_$5) {
                        methods.funcall_instance_method_with_0_args(cur_op, (SubLObject)shop_domain.$sym56$HTML_DISPLAY);
                        html_utilities.html_newline((SubLObject)shop_domain.UNPROVIDED);
                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                        cur_op = cdolist_list_var_$5.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cons = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym138$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD, (SubLObject)shop_domain.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_cond_operators(self, cond_operators);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym138$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 13499L)
    public static SubLObject subloop_reserved_initialize_shop_cyc_domain_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_domain.$sym3$OBJECT, (SubLObject)shop_domain.$sym13$INSTANCE_COUNT, (SubLObject)shop_domain.ZERO_INTEGER);
        return (SubLObject)shop_domain.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 13499L)
    public static SubLObject subloop_reserved_initialize_shop_cyc_domain_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_domain.$sym3$OBJECT, (SubLObject)shop_domain.$sym15$ISOLATED_P, (SubLObject)shop_domain.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_domain.$sym3$OBJECT, (SubLObject)shop_domain.$sym16$INSTANCE_NUMBER, (SubLObject)shop_domain.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym12$METHODS, (SubLObject)shop_domain.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym11$PRECONDITIONS, (SubLObject)shop_domain.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym10$OPERATORS, (SubLObject)shop_domain.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym9$COND_OPERATORS, (SubLObject)shop_domain.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym8$SUFFICIENCIES, (SubLObject)shop_domain.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym7$MT, (SubLObject)shop_domain.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym6$SIMPLE_SITUATION_PREDS, (SubLObject)shop_domain.NIL);
        return (SubLObject)shop_domain.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 13499L)
    public static SubLObject shop_cyc_domain_p(final SubLObject shop_cyc_domain) {
        return classes.subloop_instanceof_class(shop_cyc_domain, (SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 14378L)
    public static SubLObject shop_cyc_domain_initialize_method(final SubLObject self) {
        shop_basic_domain_initialize_method(self);
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 14478L)
    public static SubLObject shop_cyc_domain_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_cyc_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject mt = get_shop_basic_domain_mt(self);
        final SubLObject instance_number = object.get_object_instance_number(self);
        try {
            thread.throwStack.push(shop_domain.$sym147$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD);
            try {
                if (shop_domain.NIL != subloop_structures.instance_p(self)) {
                    PrintLow.format(stream, (SubLObject)shop_domain.$str148$__SHOP_CYC_DOMAIN__S__S_, instance_number, mt);
                }
                else {
                    PrintLow.format(stream, (SubLObject)shop_domain.$str30$__Malformed_Instance_);
                }
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym147$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_mt(self, mt);
                    object.set_object_instance_number(self, instance_number);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_cyc_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym147$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_cyc_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 14713L)
    public static SubLObject shop_cyc_domain_process_plan_assertions_list_method(final SubLObject self, final SubLObject assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_cyc_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject v_methods = get_shop_basic_domain_methods(self);
        try {
            thread.throwStack.push(shop_domain.$sym153$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD);
            try {
                SubLObject preconds = (SubLObject)shop_domain.NIL;
                SubLObject effects = (SubLObject)shop_domain.NIL;
                SubLObject pre_methods = (SubLObject)shop_domain.NIL;
                SubLObject v_methods_$6 = (SubLObject)shop_domain.NIL;
                SubLObject axioms = (SubLObject)shop_domain.NIL;
                SubLObject sufficient_conds = (SubLObject)shop_domain.NIL;
                SubLObject cond_effects = (SubLObject)shop_domain.NIL;
                SubLObject cdolist_list_var = assertions;
                SubLObject assertion = (SubLObject)shop_domain.NIL;
                assertion = cdolist_list_var.first();
                while (shop_domain.NIL != cdolist_list_var) {
                    if (shop_domain.NIL != assertions_high.assertion_mentions_term(assertion, shop_domain.$const154$preconditionForMethod)) {
                        pre_methods = (SubLObject)ConsesLow.cons(assertion, pre_methods);
                    }
                    else if (shop_domain.NIL != assertions_high.assertion_mentions_term(assertion, shop_domain.$const155$methodForAction)) {
                        v_methods_$6 = (SubLObject)ConsesLow.cons(assertion, v_methods_$6);
                    }
                    else if (shop_domain.NIL != assertions_high.assertion_mentions_term(assertion, shop_domain.$const156$preconditionFor_Props)) {
                        preconds = (SubLObject)ConsesLow.cons(assertion, preconds);
                    }
                    else if (shop_domain.NIL != assertions_high.assertion_mentions_term(assertion, shop_domain.$const157$effectOfAction_Props)) {
                        effects = (SubLObject)ConsesLow.cons(assertion, effects);
                    }
                    else if (shop_domain.NIL != assertions_high.assertion_mentions_term(assertion, shop_domain.$const158$sufficientFor_Props)) {
                        sufficient_conds = (SubLObject)ConsesLow.cons(assertion, sufficient_conds);
                    }
                    else if (shop_domain.NIL != assertions_high.assertion_mentions_term(assertion, shop_domain.$const159$effectOfActionIf_Props)) {
                        cond_effects = (SubLObject)ConsesLow.cons(assertion, cond_effects);
                    }
                    else {
                        axioms = (SubLObject)ConsesLow.cons(assertion, axioms);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                }
                if (shop_domain.NIL != shop_parameters.$shop_use_precondition_for_methodP$.getDynamicValue(thread)) {
                    PrintLow.format((SubLObject)shop_domain.T, (SubLObject)shop_domain.$str160$________________________using_pre);
                    v_methods_$6 = pre_methods;
                }
                cdolist_list_var = preconds;
                SubLObject precond = (SubLObject)shop_domain.NIL;
                precond = cdolist_list_var.first();
                while (shop_domain.NIL != cdolist_list_var) {
                    shop_cyc_domain_process_precondition_method(self, precond);
                    cdolist_list_var = cdolist_list_var.rest();
                    precond = cdolist_list_var.first();
                }
                cdolist_list_var = effects;
                SubLObject effect = (SubLObject)shop_domain.NIL;
                effect = cdolist_list_var.first();
                while (shop_domain.NIL != cdolist_list_var) {
                    shop_cyc_domain_process_effect_method(self, effect);
                    cdolist_list_var = cdolist_list_var.rest();
                    effect = cdolist_list_var.first();
                }
                cdolist_list_var = cond_effects;
                SubLObject cond_effect = (SubLObject)shop_domain.NIL;
                cond_effect = cdolist_list_var.first();
                while (shop_domain.NIL != cdolist_list_var) {
                    shop_cyc_domain_process_conditional_effect_method(self, cond_effect);
                    cdolist_list_var = cdolist_list_var.rest();
                    cond_effect = cdolist_list_var.first();
                }
                cdolist_list_var = v_methods_$6;
                SubLObject method = (SubLObject)shop_domain.NIL;
                method = cdolist_list_var.first();
                while (shop_domain.NIL != cdolist_list_var) {
                    shop_cyc_domain_process_method_method(self, method);
                    cdolist_list_var = cdolist_list_var.rest();
                    method = cdolist_list_var.first();
                }
                cdolist_list_var = sufficient_conds;
                SubLObject scond = (SubLObject)shop_domain.NIL;
                scond = cdolist_list_var.first();
                while (shop_domain.NIL != cdolist_list_var) {
                    shop_cyc_domain_process_sufficient_cond_method(self, scond);
                    cdolist_list_var = cdolist_list_var.rest();
                    scond = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym153$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD, (SubLObject)shop_domain.T);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_methods(self, v_methods);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_cyc_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym153$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_cyc_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 16702L)
    public static SubLObject shop_cyc_domain_gather_planning_assertions_method(final SubLObject self, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ass_set = set.new_set((SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)shop_domain.$sym165$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(domain_mt, thread);
            SubLObject cdolist_list_var = shop_main.$shop_domain_definition_predicates$.getGlobalValue();
            SubLObject cur_pred = (SubLObject)shop_domain.NIL;
            cur_pred = cdolist_list_var.first();
            while (shop_domain.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$7 = kb_mapping.gather_predicate_rule_index(cur_pred, (SubLObject)shop_domain.$kw166$POS, (SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED);
                SubLObject cur_ass = (SubLObject)shop_domain.NIL;
                cur_ass = cdolist_list_var_$7.first();
                while (shop_domain.NIL != cdolist_list_var_$7) {
                    set.set_add(cur_ass, ass_set);
                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                    cur_ass = cdolist_list_var_$7.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                cur_pred = cdolist_list_var.first();
            }
            cdolist_list_var = kb_mapping.gather_predicate_extent_index(shop_domain.$const154$preconditionForMethod, (SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED);
            SubLObject cur_ass2 = (SubLObject)shop_domain.NIL;
            cur_ass2 = cdolist_list_var.first();
            while (shop_domain.NIL != cdolist_list_var) {
                set.set_add(cur_ass2, ass_set);
                cdolist_list_var = cdolist_list_var.rest();
                cur_ass2 = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return set.set_element_list(ass_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 17255L)
    public static SubLObject shop_cyc_domain_init_simple_situation_preds_method(final SubLObject self, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_cyc_domain_method = (SubLObject)shop_domain.NIL;
        SubLObject simple_situation_preds = get_shop_basic_domain_simple_situation_preds(self);
        try {
            thread.throwStack.push(shop_domain.$sym170$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD);
            try {
                if (shop_domain.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && shop_domain.NIL == hlmt.hlmt_p(domain_mt)) {
                    Errors.error((SubLObject)shop_domain.$str171$_init_simple_situation_preds_shop);
                }
                final SubLObject simple_preds = isa.all_fort_instances(shop_domain.$const172$SimpleSituationPredicate, domain_mt, (SubLObject)shop_domain.UNPROVIDED);
                simple_situation_preds = set_utilities.construct_set_from_list(simple_preds, (SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym170$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD, (SubLObject)shop_domain.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_simple_situation_preds(self, simple_situation_preds);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_cyc_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym170$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_cyc_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 17612L)
    public static SubLObject shop_cyc_domain_init_domain_with_rules_method(final SubLObject self, final SubLObject rules, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_cyc_domain_method = (SubLObject)shop_domain.NIL;
        SubLObject mt = get_shop_basic_domain_mt(self);
        try {
            thread.throwStack.push(shop_domain.$sym177$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD);
            try {
                mt = domain_mt;
                shop_cyc_domain_process_plan_assertions_list_method(self, rules);
                shop_cyc_domain_init_simple_situation_preds_method(self, domain_mt);
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym177$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD, (SubLObject)shop_domain.T);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_mt(self, mt);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_cyc_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym177$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_cyc_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 18011L)
    public static SubLObject shop_cyc_domain_process_plan_assertions_method(final SubLObject self, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_cyc_domain_method = (SubLObject)shop_domain.NIL;
        SubLObject mt = get_shop_basic_domain_mt(self);
        try {
            thread.throwStack.push(shop_domain.$sym181$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD);
            try {
                if (shop_domain.NIL != mt) {
                    shop_cyc_domain_initialize_method(self);
                }
                mt = domain_mt;
                final SubLObject assertions = shop_cyc_domain_gather_planning_assertions_method(self, domain_mt);
                shop_cyc_domain_process_plan_assertions_list_method(self, assertions);
                shop_cyc_domain_init_simple_situation_preds_method(self, domain_mt);
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym181$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD, (SubLObject)shop_domain.T);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_mt(self, mt);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_cyc_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym181$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_cyc_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 18628L)
    public static SubLObject shop_cyc_domain_process_method_method(final SubLObject self, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_cyc_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject preconditions = get_shop_basic_domain_preconditions(self);
        final SubLObject v_methods = get_shop_basic_domain_methods(self);
        try {
            thread.throwStack.push(shop_domain.$sym186$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD);
            try {
                thread.resetMultipleValues();
                final SubLObject method_head = shop_extract_method_from_assertion(assertion);
                final SubLObject preconditions_$8 = thread.secondMultipleValue();
                final SubLObject decomposition = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                final SubLObject method_name = cycl_utilities.formula_operator(method_head);
                final SubLObject new_method = object.object_new_method((SubLObject)shop_domain.$sym187$SHOP_BASIC_METHOD);
                shop_datastructures.shop_basic_method_init_method(new_method, assertion, method_head, preconditions_$8, decomposition);
                Hashtables.sethash(method_name, v_methods, (SubLObject)ConsesLow.cons(new_method, Hashtables.gethash(method_name, v_methods, (SubLObject)shop_domain.UNPROVIDED)));
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym186$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD, (SubLObject)shop_domain.T);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_preconditions(self, preconditions);
                    set_shop_basic_domain_methods(self, v_methods);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_cyc_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym186$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_cyc_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 19311L)
    public static SubLObject shop_cyc_domain_process_precondition_method(final SubLObject self, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_cyc_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject preconditions = get_shop_basic_domain_preconditions(self);
        try {
            thread.throwStack.push(shop_domain.$sym191$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD);
            try {
                final SubLObject assertion_form = assertions_high.assertion_formula(assertion);
                final SubLObject action_head = cycl_utilities.formula_arg2(assertion_form, (SubLObject)shop_domain.UNPROVIDED);
                final SubLObject decomposition = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)shop_domain.$kw192$PRIMITIVE, action_head));
                SubLObject conditions = cycl_utilities.formula_arg1(assertion_form, (SubLObject)shop_domain.UNPROVIDED);
                final SubLObject new_precondition = object.object_new_method((SubLObject)shop_domain.$sym193$SHOP_BASIC_PRECONDITION);
                conditions = possibly_conjunctive_formula_to_literals(conditions);
                shop_datastructures.shop_basic_method_init_method(new_precondition, assertion, action_head, conditions, decomposition);
                Hashtables.sethash(cycl_utilities.formula_operator(action_head), preconditions, (SubLObject)ConsesLow.cons(new_precondition, Hashtables.gethash(cycl_utilities.formula_operator(action_head), preconditions, (SubLObject)shop_domain.UNPROVIDED)));
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym191$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD, (SubLObject)shop_domain.T);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_preconditions(self, preconditions);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_cyc_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym191$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_cyc_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 20125L)
    public static SubLObject shop_cyc_domain_process_effect_method(final SubLObject self, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_cyc_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject operators = get_shop_basic_domain_operators(self);
        try {
            thread.throwStack.push(shop_domain.$sym197$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD);
            try {
                final SubLObject assertion_form = assertions_high.assertion_formula(assertion);
                final SubLObject action_head = cycl_utilities.formula_arg1(assertion_form, (SubLObject)shop_domain.UNPROVIDED);
                SubLObject effects = cycl_utilities.formula_arg2(assertion_form, (SubLObject)shop_domain.UNPROVIDED);
                final SubLObject new_operator = object.object_new_method((SubLObject)shop_domain.$sym198$SHOP_BASIC_OPERATOR);
                effects = possibly_conjunctive_formula_to_literals(effects);
                thread.resetMultipleValues();
                final SubLObject add_list = shop_separate_effect_list(effects);
                final SubLObject delete_list = thread.secondMultipleValue();
                thread.resetMultipleValues();
                shop_datastructures.shop_basic_operator_init_method(new_operator, assertion, action_head, add_list, delete_list);
                Hashtables.sethash(cycl_utilities.formula_operator(action_head), operators, (SubLObject)ConsesLow.cons(new_operator, Hashtables.gethash(cycl_utilities.formula_operator(action_head), operators, (SubLObject)shop_domain.UNPROVIDED)));
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym197$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD, (SubLObject)shop_domain.T);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_operators(self, operators);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_cyc_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym197$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_cyc_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 21099L)
    public static SubLObject shop_cyc_domain_process_sufficient_cond_method(final SubLObject self, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_cyc_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject sufficiencies = get_shop_basic_domain_sufficiencies(self);
        try {
            thread.throwStack.push(shop_domain.$sym202$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD);
            try {
                final SubLObject assertion_form = assertions_high.assertion_formula(assertion);
                SubLObject precondition = cycl_utilities.formula_arg1(assertion_form, (SubLObject)shop_domain.UNPROVIDED);
                final SubLObject action_form = cycl_utilities.formula_arg2(assertion_form, (SubLObject)shop_domain.UNPROVIDED);
                final SubLObject new_scond = object.object_new_method((SubLObject)shop_domain.$sym203$SHOP_BASIC_SUFFICIENCY_COND);
                precondition = possibly_conjunctive_formula_to_literals(precondition);
                methods.funcall_instance_method_with_1_args(new_scond, (SubLObject)shop_domain.$sym204$SET_HEAD, action_form);
                methods.funcall_instance_method_with_1_args(new_scond, (SubLObject)shop_domain.$sym205$SET_COND_FORMULA, precondition);
                methods.funcall_instance_method_with_1_args(new_scond, (SubLObject)shop_domain.$sym206$SET_ASSERTIONS, (SubLObject)ConsesLow.list(assertion));
                Hashtables.sethash(cycl_utilities.formula_operator(action_form), sufficiencies, (SubLObject)ConsesLow.cons(new_scond, Hashtables.gethash(cycl_utilities.formula_operator(action_form), sufficiencies, (SubLObject)shop_domain.UNPROVIDED)));
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym202$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD, (SubLObject)shop_domain.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_sufficiencies(self, sufficiencies);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_cyc_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym202$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_cyc_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 21800L)
    public static SubLObject shop_cyc_domain_process_conditional_effect_method(final SubLObject self, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_cyc_domain_method = (SubLObject)shop_domain.NIL;
        final SubLObject cond_operators = get_shop_basic_domain_cond_operators(self);
        try {
            thread.throwStack.push(shop_domain.$sym210$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD);
            try {
                final SubLObject formula = assertions_high.assertion_formula(assertion);
                final SubLObject pred = cycl_utilities.formula_operator(formula);
                final SubLObject action_head;
                final SubLObject action_formula = action_head = cycl_utilities.formula_arg1(formula, (SubLObject)shop_domain.UNPROVIDED);
                SubLObject condition = cycl_utilities.formula_arg2(formula, (SubLObject)shop_domain.UNPROVIDED);
                SubLObject effects = cycl_utilities.formula_arg3(formula, (SubLObject)shop_domain.UNPROVIDED);
                final SubLObject cond_effect_operator = object.object_new_method((SubLObject)shop_domain.$sym211$SHOP_BASIC_CONDITIONAL_EFFECT);
                if (shop_domain.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !pred.eql(shop_domain.$const159$effectOfActionIf_Props)) {
                    Errors.error((SubLObject)shop_domain.$str212$process_conditional_effect__a_is_, assertion);
                }
                effects = possibly_conjunctive_formula_to_literals(effects);
                condition = possibly_conjunctive_formula_to_literals(condition);
                thread.resetMultipleValues();
                final SubLObject add_list = shop_separate_effect_list(effects);
                final SubLObject delete_list = thread.secondMultipleValue();
                thread.resetMultipleValues();
                shop_datastructures.shop_basic_conditional_effect_init_method(cond_effect_operator, action_head, condition, add_list, delete_list, assertion);
                Hashtables.sethash(cycl_utilities.formula_operator(action_head), cond_operators, (SubLObject)ConsesLow.cons(cond_effect_operator, Hashtables.gethash(cycl_utilities.formula_operator(action_head), cond_operators, (SubLObject)shop_domain.UNPROVIDED)));
                Dynamic.sublisp_throw((SubLObject)shop_domain.$sym210$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD, (SubLObject)shop_domain.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_domain.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_domain_cond_operators(self, cond_operators);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_cyc_domain_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_domain.$sym210$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_cyc_domain_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 22909L)
    public static SubLObject shop_method_formula_p(final SubLObject formula) {
        if (!formula.isCons()) {
            return (SubLObject)shop_domain.NIL;
        }
        return Equality.eq(cycl_utilities.formula_operator(formula), shop_domain.$const155$methodForAction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 23159L)
    public static SubLObject shop_extract_method_from_assertion(final SubLObject assertion) {
        SubLObject head = (SubLObject)shop_domain.NIL;
        SubLObject preconditions = (SubLObject)shop_domain.NIL;
        SubLObject decomposition = (SubLObject)shop_domain.NIL;
        final SubLObject assertion_form = assertions_high.assertion_formula(assertion);
        SubLObject methodstatement = (SubLObject)shop_domain.NIL;
        SubLObject legal_form = (SubLObject)shop_domain.T;
        SubLObject negatedatoms = (SubLObject)shop_domain.NIL;
        SubLObject consequent = (SubLObject)shop_domain.NIL;
        final SubLObject pcase_var = assertion_form.first();
        if (pcase_var.eql(shop_domain.$const214$implies) || pcase_var.eql(shop_domain.$const154$preconditionForMethod)) {
            preconditions = conses_high.second(assertion_form);
            consequent = conses_high.third(assertion_form);
            if (shop_domain.NIL != shop_method_formula_p(consequent)) {
                methodstatement = consequent;
            }
            else {
                methodstatement = cycl_utilities.formula_find_if((SubLObject)shop_domain.$sym215$SHOP_METHOD_FORMULA_P, consequent, (SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED);
                negatedatoms = Sequences.remove_if((SubLObject)shop_domain.$sym215$SHOP_METHOD_FORMULA_P, cycl_utilities.formula_args(consequent, (SubLObject)shop_domain.UNPROVIDED), (SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED, (SubLObject)shop_domain.UNPROVIDED);
            }
            if (shop_domain.NIL == methodstatement) {
                return (SubLObject)shop_domain.NIL;
            }
            if (shop_domain.NIL != negatedatoms) {
                negatedatoms = Mapping.mapcar(Symbols.symbol_function((SubLObject)shop_domain.$sym216$NEGATE), negatedatoms);
            }
            preconditions = possibly_conjunctive_formula_to_literals(preconditions);
            preconditions = ConsesLow.append(preconditions, negatedatoms);
        }
        else if (pcase_var.eql(shop_domain.$const155$methodForAction)) {
            preconditions = (SubLObject)shop_domain.NIL;
            methodstatement = assertion_form;
        }
        else {
            legal_form = (SubLObject)shop_domain.NIL;
        }
        if (shop_domain.NIL != legal_form) {
            head = cycl_utilities.formula_arg1(methodstatement, (SubLObject)shop_domain.UNPROVIDED);
            final SubLObject action_sequence = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(methodstatement, (SubLObject)shop_domain.UNPROVIDED), (SubLObject)shop_domain.UNPROVIDED);
            if (action_sequence.isList()) {
                decomposition = action_sequence.rest();
            }
            else if (shop_domain.NIL != variables.variable_p(action_sequence)) {
                final SubLObject hl_vars = assertions_high.assertion_hl_variables(assertion);
                final SubLObject actions_var = variables.get_variable(Sequences.length(hl_vars));
                preconditions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(shop_domain.$const217$equals, action_sequence, reader.bq_cons(shop_domain.$const218$TheList, actions_var)), preconditions);
                decomposition = actions_var;
            }
        }
        return Values.values(head, preconditions, decomposition);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 25020L)
    public static SubLObject possibly_conjunctive_formula_to_literals(final SubLObject form) {
        if (cycl_utilities.formula_operator(form).eql(shop_domain.$const219$and)) {
            return cycl_utilities.formula_args(form, (SubLObject)shop_domain.UNPROVIDED);
        }
        return (SubLObject)ConsesLow.list(form);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-domain.lisp", position = 25257L)
    public static SubLObject shop_separate_effect_list(final SubLObject effects) {
        SubLObject add_list = (SubLObject)shop_domain.NIL;
        SubLObject delete_list = (SubLObject)shop_domain.NIL;
        SubLObject cdolist_list_var = effects;
        SubLObject e_formula = (SubLObject)shop_domain.NIL;
        e_formula = cdolist_list_var.first();
        while (shop_domain.NIL != cdolist_list_var) {
            if (shop_domain.NIL != cycl_utilities.negatedP(e_formula)) {
                delete_list = (SubLObject)ConsesLow.cons(cycl_utilities.formula_arg1(e_formula, (SubLObject)shop_domain.UNPROVIDED), delete_list);
            }
            else {
                add_list = (SubLObject)ConsesLow.cons(e_formula, add_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            e_formula = cdolist_list_var.first();
        }
        return Values.values(add_list, delete_list);
    }
    
    public static SubLObject declare_shop_domain_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_domain_p", "SHOP-DOMAIN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "get_shop_basic_domain_simple_situation_preds", "GET-SHOP-BASIC-DOMAIN-SIMPLE-SITUATION-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "set_shop_basic_domain_simple_situation_preds", "SET-SHOP-BASIC-DOMAIN-SIMPLE-SITUATION-PREDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "get_shop_basic_domain_mt", "GET-SHOP-BASIC-DOMAIN-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "set_shop_basic_domain_mt", "SET-SHOP-BASIC-DOMAIN-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "get_shop_basic_domain_sufficiencies", "GET-SHOP-BASIC-DOMAIN-SUFFICIENCIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "set_shop_basic_domain_sufficiencies", "SET-SHOP-BASIC-DOMAIN-SUFFICIENCIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "get_shop_basic_domain_cond_operators", "GET-SHOP-BASIC-DOMAIN-COND-OPERATORS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "set_shop_basic_domain_cond_operators", "SET-SHOP-BASIC-DOMAIN-COND-OPERATORS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "get_shop_basic_domain_operators", "GET-SHOP-BASIC-DOMAIN-OPERATORS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "set_shop_basic_domain_operators", "SET-SHOP-BASIC-DOMAIN-OPERATORS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "get_shop_basic_domain_preconditions", "GET-SHOP-BASIC-DOMAIN-PRECONDITIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "set_shop_basic_domain_preconditions", "SET-SHOP-BASIC-DOMAIN-PRECONDITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "get_shop_basic_domain_methods", "GET-SHOP-BASIC-DOMAIN-METHODS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "set_shop_basic_domain_methods", "SET-SHOP-BASIC-DOMAIN-METHODS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "subloop_reserved_initialize_shop_basic_domain_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-DOMAIN-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "subloop_reserved_initialize_shop_basic_domain_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-DOMAIN-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_basic_domain_p", "SHOP-BASIC-DOMAIN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_domain_rule_table_for_type", "SHOP-DOMAIN-RULE-TABLE-FOR-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_basic_domain_initialize_method", "SHOP-BASIC-DOMAIN-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_basic_domain_print_method", "SHOP-BASIC-DOMAIN-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_basic_domain_get_name_method", "SHOP-BASIC-DOMAIN-GET-NAME-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_task_pred_string", "SHOP-TASK-PRED-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_find_all_matching_rules", "SHOP-FIND-ALL-MATCHING-RULES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_basic_domain_rule_table_for_type_method", "SHOP-BASIC-DOMAIN-RULE-TABLE-FOR-TYPE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_basic_domain_get_planner_rules_method", "SHOP-BASIC-DOMAIN-GET-PLANNER-RULES-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_basic_domain_html_display_all_rules_of_type_method", "SHOP-BASIC-DOMAIN-HTML-DISPLAY-ALL-RULES-OF-TYPE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_basic_domain_add_sufficient_conds_method", "SHOP-BASIC-DOMAIN-ADD-SUFFICIENT-CONDS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_basic_domain_get_sufficient_conds_method", "SHOP-BASIC-DOMAIN-GET-SUFFICIENT-CONDS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_basic_domain_print_all_sconds_method", "SHOP-BASIC-DOMAIN-PRINT-ALL-SCONDS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_basic_domain_html_display_all_sconds_method", "SHOP-BASIC-DOMAIN-HTML-DISPLAY-ALL-SCONDS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_basic_domain_add_method_method", "SHOP-BASIC-DOMAIN-ADD-METHOD-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_basic_domain_get_methods_method", "SHOP-BASIC-DOMAIN-GET-METHODS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_basic_domain_print_all_methods_method", "SHOP-BASIC-DOMAIN-PRINT-ALL-METHODS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_basic_domain_html_display_all_methods_method", "SHOP-BASIC-DOMAIN-HTML-DISPLAY-ALL-METHODS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_basic_domain_add_operator_method", "SHOP-BASIC-DOMAIN-ADD-OPERATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_basic_domain_get_operators_method", "SHOP-BASIC-DOMAIN-GET-OPERATORS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_basic_domain_print_all_operators_method", "SHOP-BASIC-DOMAIN-PRINT-ALL-OPERATORS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_basic_domain_html_display_all_operators_method", "SHOP-BASIC-DOMAIN-HTML-DISPLAY-ALL-OPERATORS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_basic_domain_get_conditional_operators_method", "SHOP-BASIC-DOMAIN-GET-CONDITIONAL-OPERATORS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_basic_domain_html_display_all_conditional_operators_method", "SHOP-BASIC-DOMAIN-HTML-DISPLAY-ALL-CONDITIONAL-OPERATORS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "subloop_reserved_initialize_shop_cyc_domain_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-CYC-DOMAIN-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "subloop_reserved_initialize_shop_cyc_domain_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-CYC-DOMAIN-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_cyc_domain_p", "SHOP-CYC-DOMAIN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_cyc_domain_initialize_method", "SHOP-CYC-DOMAIN-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_cyc_domain_print_method", "SHOP-CYC-DOMAIN-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_cyc_domain_process_plan_assertions_list_method", "SHOP-CYC-DOMAIN-PROCESS-PLAN-ASSERTIONS-LIST-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_cyc_domain_gather_planning_assertions_method", "SHOP-CYC-DOMAIN-GATHER-PLANNING-ASSERTIONS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_cyc_domain_init_simple_situation_preds_method", "SHOP-CYC-DOMAIN-INIT-SIMPLE-SITUATION-PREDS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_cyc_domain_init_domain_with_rules_method", "SHOP-CYC-DOMAIN-INIT-DOMAIN-WITH-RULES-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_cyc_domain_process_plan_assertions_method", "SHOP-CYC-DOMAIN-PROCESS-PLAN-ASSERTIONS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_cyc_domain_process_method_method", "SHOP-CYC-DOMAIN-PROCESS-METHOD-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_cyc_domain_process_precondition_method", "SHOP-CYC-DOMAIN-PROCESS-PRECONDITION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_cyc_domain_process_effect_method", "SHOP-CYC-DOMAIN-PROCESS-EFFECT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_cyc_domain_process_sufficient_cond_method", "SHOP-CYC-DOMAIN-PROCESS-SUFFICIENT-COND-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_cyc_domain_process_conditional_effect_method", "SHOP-CYC-DOMAIN-PROCESS-CONDITIONAL-EFFECT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_method_formula_p", "SHOP-METHOD-FORMULA-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_extract_method_from_assertion", "SHOP-EXTRACT-METHOD-FROM-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "possibly_conjunctive_formula_to_literals", "POSSIBLY-CONJUNCTIVE-FORMULA-TO-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_domain", "shop_separate_effect_list", "SHOP-SEPARATE-EFFECT-LIST", 1, 0, false);
        return (SubLObject)shop_domain.NIL;
    }
    
    public static SubLObject init_shop_domain_file() {
        shop_domain.$shop_domain_planner_rule_slot_map$ = SubLFiles.deflexical("*SHOP-DOMAIN-PLANNER-RULE-SLOT-MAP*", (SubLObject)shop_domain.$list18);
        return (SubLObject)shop_domain.NIL;
    }
    
    public static SubLObject setup_shop_domain_file() {
        interfaces.new_interface((SubLObject)shop_domain.$sym0$SHOP_DOMAIN, (SubLObject)shop_domain.NIL, (SubLObject)shop_domain.NIL, (SubLObject)shop_domain.$list1);
        classes.subloop_new_class((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym3$OBJECT, (SubLObject)shop_domain.$list4, (SubLObject)shop_domain.NIL, (SubLObject)shop_domain.$list5);
        classes.class_set_implements_slot_listeners((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym14$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_DOMAIN_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym17$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_DOMAIN_INSTANCE);
        subloop_reserved_initialize_shop_basic_domain_class((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym19$INITIALIZE, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$list20, (SubLObject)shop_domain.NIL, (SubLObject)shop_domain.$list21);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym19$INITIALIZE, (SubLObject)shop_domain.$sym24$SHOP_BASIC_DOMAIN_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym25$PRINT, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.NIL, (SubLObject)shop_domain.$list26, (SubLObject)shop_domain.$list27);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym25$PRINT, (SubLObject)shop_domain.$sym31$SHOP_BASIC_DOMAIN_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym32$GET_NAME, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$list33, (SubLObject)shop_domain.NIL, (SubLObject)shop_domain.$list34);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym32$GET_NAME, (SubLObject)shop_domain.$sym36$SHOP_BASIC_DOMAIN_GET_NAME_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym39$RULE_TABLE_FOR_TYPE, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$list40, (SubLObject)shop_domain.$list41, (SubLObject)shop_domain.$list42);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym39$RULE_TABLE_FOR_TYPE, (SubLObject)shop_domain.$sym43$SHOP_BASIC_DOMAIN_RULE_TABLE_FOR_TYPE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym44$GET_PLANNER_RULES, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$list33, (SubLObject)shop_domain.$list45, (SubLObject)shop_domain.$list46);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym44$GET_PLANNER_RULES, (SubLObject)shop_domain.$sym50$SHOP_BASIC_DOMAIN_GET_PLANNER_RULES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym51$HTML_DISPLAY_ALL_RULES_OF_TYPE, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$list33, (SubLObject)shop_domain.$list41, (SubLObject)shop_domain.$list52);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym51$HTML_DISPLAY_ALL_RULES_OF_TYPE, (SubLObject)shop_domain.$sym57$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_RULES_OF_TYPE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym58$ADD_SUFFICIENT_CONDS, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$list33, (SubLObject)shop_domain.$list59, (SubLObject)shop_domain.$list60);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym58$ADD_SUFFICIENT_CONDS, (SubLObject)shop_domain.$sym64$SHOP_BASIC_DOMAIN_ADD_SUFFICIENT_CONDS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym65$GET_SUFFICIENT_CONDS, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$list33, (SubLObject)shop_domain.$list66, (SubLObject)shop_domain.$list67);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym65$GET_SUFFICIENT_CONDS, (SubLObject)shop_domain.$sym70$SHOP_BASIC_DOMAIN_GET_SUFFICIENT_CONDS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym71$PRINT_ALL_SCONDS, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$list33, (SubLObject)shop_domain.NIL, (SubLObject)shop_domain.$list72);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym71$PRINT_ALL_SCONDS, (SubLObject)shop_domain.$sym75$SHOP_BASIC_DOMAIN_PRINT_ALL_SCONDS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym76$HTML_DISPLAY_ALL_SCONDS, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$list33, (SubLObject)shop_domain.NIL, (SubLObject)shop_domain.$list77);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym76$HTML_DISPLAY_ALL_SCONDS, (SubLObject)shop_domain.$sym80$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_SCONDS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym81$ADD_METHOD, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$list33, (SubLObject)shop_domain.$list82, (SubLObject)shop_domain.$list83);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym81$ADD_METHOD, (SubLObject)shop_domain.$sym86$SHOP_BASIC_DOMAIN_ADD_METHOD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym87$GET_METHODS, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$list33, (SubLObject)shop_domain.$list66, (SubLObject)shop_domain.$list88);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym87$GET_METHODS, (SubLObject)shop_domain.$sym90$SHOP_BASIC_DOMAIN_GET_METHODS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym91$PRINT_ALL_METHODS, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$list33, (SubLObject)shop_domain.NIL, (SubLObject)shop_domain.$list92);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym91$PRINT_ALL_METHODS, (SubLObject)shop_domain.$sym94$SHOP_BASIC_DOMAIN_PRINT_ALL_METHODS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym95$HTML_DISPLAY_ALL_METHODS, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$list33, (SubLObject)shop_domain.NIL, (SubLObject)shop_domain.$list96);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym95$HTML_DISPLAY_ALL_METHODS, (SubLObject)shop_domain.$sym99$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_METHODS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym100$ADD_OPERATOR, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$list33, (SubLObject)shop_domain.$list101, (SubLObject)shop_domain.$list102);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym100$ADD_OPERATOR, (SubLObject)shop_domain.$sym106$SHOP_BASIC_DOMAIN_ADD_OPERATOR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym107$GET_OPERATORS, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$list33, (SubLObject)shop_domain.$list66, (SubLObject)shop_domain.$list108);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym107$GET_OPERATORS, (SubLObject)shop_domain.$sym110$SHOP_BASIC_DOMAIN_GET_OPERATORS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym111$PRINT_ALL_OPERATORS, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$list33, (SubLObject)shop_domain.$list112, (SubLObject)shop_domain.$list113);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym111$PRINT_ALL_OPERATORS, (SubLObject)shop_domain.$sym125$SHOP_BASIC_DOMAIN_PRINT_ALL_OPERATORS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym126$HTML_DISPLAY_ALL_OPERATORS, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$list33, (SubLObject)shop_domain.NIL, (SubLObject)shop_domain.$list127);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym126$HTML_DISPLAY_ALL_OPERATORS, (SubLObject)shop_domain.$sym130$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_OPERATORS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym131$GET_CONDITIONAL_OPERATORS, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$list33, (SubLObject)shop_domain.$list66, (SubLObject)shop_domain.$list132);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym131$GET_CONDITIONAL_OPERATORS, (SubLObject)shop_domain.$sym135$SHOP_BASIC_DOMAIN_GET_CONDITIONAL_OPERATORS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym136$HTML_DISPLAY_ALL_CONDITIONAL_OPERATORS, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$list33, (SubLObject)shop_domain.NIL, (SubLObject)shop_domain.$list137);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.$sym136$HTML_DISPLAY_ALL_CONDITIONAL_OPERATORS, (SubLObject)shop_domain.$sym139$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_CONDITIONAL_OPERATORS_METHOD);
        classes.subloop_new_class((SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$sym2$SHOP_BASIC_DOMAIN, (SubLObject)shop_domain.NIL, (SubLObject)shop_domain.NIL, (SubLObject)shop_domain.$list141);
        classes.class_set_implements_slot_listeners((SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$sym142$SUBLOOP_RESERVED_INITIALIZE_SHOP_CYC_DOMAIN_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$sym143$SUBLOOP_RESERVED_INITIALIZE_SHOP_CYC_DOMAIN_INSTANCE);
        subloop_reserved_initialize_shop_cyc_domain_class((SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym19$INITIALIZE, (SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$list33, (SubLObject)shop_domain.NIL, (SubLObject)shop_domain.$list144);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$sym19$INITIALIZE, (SubLObject)shop_domain.$sym145$SHOP_CYC_DOMAIN_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym25$PRINT, (SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.NIL, (SubLObject)shop_domain.$list26, (SubLObject)shop_domain.$list146);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$sym25$PRINT, (SubLObject)shop_domain.$sym149$SHOP_CYC_DOMAIN_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym150$PROCESS_PLAN_ASSERTIONS_LIST, (SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$list40, (SubLObject)shop_domain.$list151, (SubLObject)shop_domain.$list152);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$sym150$PROCESS_PLAN_ASSERTIONS_LIST, (SubLObject)shop_domain.$sym161$SHOP_CYC_DOMAIN_PROCESS_PLAN_ASSERTIONS_LIST_METHOD);
        methods.methods_incorporate_class_method((SubLObject)shop_domain.$sym162$GATHER_PLANNING_ASSERTIONS, (SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$list33, (SubLObject)shop_domain.$list163, (SubLObject)shop_domain.$list164);
        methods.subloop_register_class_method((SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$sym162$GATHER_PLANNING_ASSERTIONS, (SubLObject)shop_domain.$sym167$SHOP_CYC_DOMAIN_GATHER_PLANNING_ASSERTIONS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym168$INIT_SIMPLE_SITUATION_PREDS, (SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$list40, (SubLObject)shop_domain.$list163, (SubLObject)shop_domain.$list169);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$sym168$INIT_SIMPLE_SITUATION_PREDS, (SubLObject)shop_domain.$sym173$SHOP_CYC_DOMAIN_INIT_SIMPLE_SITUATION_PREDS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym174$INIT_DOMAIN_WITH_RULES, (SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$list33, (SubLObject)shop_domain.$list175, (SubLObject)shop_domain.$list176);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$sym174$INIT_DOMAIN_WITH_RULES, (SubLObject)shop_domain.$sym178$SHOP_CYC_DOMAIN_INIT_DOMAIN_WITH_RULES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym179$PROCESS_PLAN_ASSERTIONS, (SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$list33, (SubLObject)shop_domain.$list163, (SubLObject)shop_domain.$list180);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$sym179$PROCESS_PLAN_ASSERTIONS, (SubLObject)shop_domain.$sym182$SHOP_CYC_DOMAIN_PROCESS_PLAN_ASSERTIONS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym183$PROCESS_METHOD, (SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$list40, (SubLObject)shop_domain.$list184, (SubLObject)shop_domain.$list185);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$sym183$PROCESS_METHOD, (SubLObject)shop_domain.$sym188$SHOP_CYC_DOMAIN_PROCESS_METHOD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym189$PROCESS_PRECONDITION, (SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$list40, (SubLObject)shop_domain.$list184, (SubLObject)shop_domain.$list190);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$sym189$PROCESS_PRECONDITION, (SubLObject)shop_domain.$sym194$SHOP_CYC_DOMAIN_PROCESS_PRECONDITION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym195$PROCESS_EFFECT, (SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$list40, (SubLObject)shop_domain.$list184, (SubLObject)shop_domain.$list196);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$sym195$PROCESS_EFFECT, (SubLObject)shop_domain.$sym199$SHOP_CYC_DOMAIN_PROCESS_EFFECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym200$PROCESS_SUFFICIENT_COND, (SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$list40, (SubLObject)shop_domain.$list184, (SubLObject)shop_domain.$list201);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$sym200$PROCESS_SUFFICIENT_COND, (SubLObject)shop_domain.$sym207$SHOP_CYC_DOMAIN_PROCESS_SUFFICIENT_COND_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_domain.$sym208$PROCESS_CONDITIONAL_EFFECT, (SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$list40, (SubLObject)shop_domain.$list184, (SubLObject)shop_domain.$list209);
        methods.subloop_register_instance_method((SubLObject)shop_domain.$sym140$SHOP_CYC_DOMAIN, (SubLObject)shop_domain.$sym208$PROCESS_CONDITIONAL_EFFECT, (SubLObject)shop_domain.$sym213$SHOP_CYC_DOMAIN_PROCESS_CONDITIONAL_EFFECT_METHOD);
        return (SubLObject)shop_domain.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_shop_domain_file();
    }
    
    @Override
	public void initializeVariables() {
        init_shop_domain_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_shop_domain_file();
    }
    
    static {
        me = (SubLFile)new shop_domain();
        shop_domain.$shop_domain_planner_rule_slot_map$ = null;
        $sym0$SHOP_DOMAIN = SubLObjectFactory.makeSymbol("SHOP-DOMAIN");
        $list1 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-NAME"), (SubLObject)shop_domain.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SET-NAME"), (SubLObject)shop_domain.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PLANNER-RULES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-METHODS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OPERATORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONDITIONAL-OPERATORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT-ALL-METHODS"), (SubLObject)shop_domain.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PRINT-ALL-OPERATORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym2$SHOP_BASIC_DOMAIN = SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN");
        $sym3$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-DOMAIN"));
        $list5 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHODS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRECONDITIONS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATORS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COND-OPERATORS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUFFICIENCIES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-SITUATION-PREDS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZATION-SANITY-CHECK"), (SubLObject)shop_domain.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FLUENT-PREDICATE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADDABLE-PREDICATE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DELETEABLE-PREDICATE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-TABLE-FOR-TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")) });
        $sym6$SIMPLE_SITUATION_PREDS = SubLObjectFactory.makeSymbol("SIMPLE-SITUATION-PREDS");
        $sym7$MT = SubLObjectFactory.makeSymbol("MT");
        $sym8$SUFFICIENCIES = SubLObjectFactory.makeSymbol("SUFFICIENCIES");
        $sym9$COND_OPERATORS = SubLObjectFactory.makeSymbol("COND-OPERATORS");
        $sym10$OPERATORS = SubLObjectFactory.makeSymbol("OPERATORS");
        $sym11$PRECONDITIONS = SubLObjectFactory.makeSymbol("PRECONDITIONS");
        $sym12$METHODS = SubLObjectFactory.makeSymbol("METHODS");
        $sym13$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym14$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_DOMAIN_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-DOMAIN-CLASS");
        $sym15$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym16$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym17$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_DOMAIN_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-DOMAIN-INSTANCE");
        $list18 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("SHOP-METHOD-P"), (SubLObject)SubLObjectFactory.makeSymbol("METHODS")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("SHOP-PRECONDITION-P"), (SubLObject)SubLObjectFactory.makeSymbol("PRECONDITIONS")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("SHOP-OPERATOR-P"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATORS")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("SHOP-SUFFICIENCY-CONDITION-P"), (SubLObject)SubLObjectFactory.makeSymbol("SUFFICIENCIES")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("SHOP-CONDITIONAL-EFFECT-P"), (SubLObject)SubLObjectFactory.makeSymbol("COND-OPERATORS")));
        $sym19$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list21 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)shop_domain.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("METHODS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)SubLObjectFactory.makeInteger(100))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)SubLObjectFactory.makeInteger(100))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PRECONDITIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)SubLObjectFactory.makeInteger(100))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SUFFICIENCIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)shop_domain.TEN_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COND-OPERATORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)shop_domain.TEN_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym22$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD");
        $int23$100 = SubLObjectFactory.makeInteger(100);
        $sym24$SHOP_BASIC_DOMAIN_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN-INITIALIZE-METHOD");
        $sym25$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list27 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<DOMAIN-~S:~S>"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<Malformed Instance>"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym28$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD");
        $str29$__DOMAIN__S__S_ = SubLObjectFactory.makeString("#<DOMAIN-~S:~S>");
        $str30$__Malformed_Instance_ = SubLObjectFactory.makeString("#<Malformed Instance>");
        $sym31$SHOP_BASIC_DOMAIN_PRINT_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN-PRINT-METHOD");
        $sym32$GET_NAME = SubLObjectFactory.makeSymbol("GET-NAME");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list34 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MT")));
        $sym35$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD");
        $sym36$SHOP_BASIC_DOMAIN_GET_NAME_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN-GET-NAME-METHOD");
        $str37$var_A = SubLObjectFactory.makeString("var~A");
        $sym38$HL_VAR_ = SubLObjectFactory.makeSymbol("HL-VAR?");
        $sym39$RULE_TABLE_FOR_TYPE = SubLObjectFactory.makeSymbol("RULE-TABLE-FOR-TYPE");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRIVATE"));
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"));
        $list42 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOTNAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-DOMAIN-RULE-TABLE-FOR-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("SLOTNAME")))));
        $sym43$SHOP_BASIC_DOMAIN_RULE_TABLE_FOR_TYPE_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN-RULE-TABLE-FOR-TYPE-METHOD");
        $sym44$GET_PLANNER_RULES = SubLObjectFactory.makeSymbol("GET-PLANNER-RULES");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"));
        $list46 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE-TABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE-TABLE-FOR-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("HASH-TABLE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-FIND-ALL-MATCHING-RULES"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-TABLE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIFIED-RULES"), (SubLObject)shop_domain.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-RULE"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-UNIFY-FAILED?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-UNIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-RULE")), (SubLObject)SubLObjectFactory.makeSymbol("CUR-RULE")), (SubLObject)SubLObjectFactory.makeSymbol("TASK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-RULE"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIED-RULES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIED-RULES")))));
        $sym47$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym48$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym49$HASH_TABLE_P = SubLObjectFactory.makeSymbol("HASH-TABLE-P");
        $sym50$SHOP_BASIC_DOMAIN_GET_PLANNER_RULES_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN-GET-PLANNER-RULES-METHOD");
        $sym51$HTML_DISPLAY_ALL_RULES_OF_TYPE = SubLObjectFactory.makeSymbol("HTML-DISPLAY-ALL-RULES-OF-TYPE");
        $list52 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE-TABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE-TABLE-FOR-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("HASH-TABLE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HASH-TABLE-TO-ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-TABLE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SORT"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("STRING<=")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-TASK-PRED-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-RULES"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-NAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-RULE"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-RULES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-RULE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-DISPLAY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-HR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_domain.NIL)));
        $sym53$STRING__ = SubLObjectFactory.makeSymbol("STRING<=");
        $sym54$SHOP_TASK_PRED_STRING = SubLObjectFactory.makeSymbol("SHOP-TASK-PRED-STRING");
        $list55 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CUR-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-RULES"));
        $sym56$HTML_DISPLAY = SubLObjectFactory.makeSymbol("HTML-DISPLAY");
        $sym57$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_RULES_OF_TYPE_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN-HTML-DISPLAY-ALL-RULES-OF-TYPE-METHOD");
        $sym58$ADD_SUFFICIENT_CONDS = SubLObjectFactory.makeSymbol("ADD-SUFFICIENT-CONDS");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COND"));
        $list60 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-PLANNER-RULE-P"), (SubLObject)SubLObjectFactory.makeSymbol("COND")), (SubLObject)SubLObjectFactory.makeString("(ADD-SUFFICIENCY-COND ~S): ~S is not a valid SHOP-PLANNER-RULE-P object."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("COND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("COND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"))), (SubLObject)SubLObjectFactory.makeSymbol("SUFFICIENCIES")), (SubLObject)SubLObjectFactory.makeSymbol("COND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_domain.NIL));
        $sym61$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD");
        $str62$_ADD_SUFFICIENCY_COND__S____S_is_ = SubLObjectFactory.makeString("(ADD-SUFFICIENCY-COND ~S): ~S is not a valid SHOP-PLANNER-RULE-P object.");
        $sym63$PRED = SubLObjectFactory.makeSymbol("PRED");
        $sym64$SHOP_BASIC_DOMAIN_ADD_SUFFICIENT_CONDS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN-ADD-SUFFICIENT-CONDS-METHOD");
        $sym65$GET_SUFFICIENT_CONDS = SubLObjectFactory.makeSymbol("GET-SUFFICIENT-CONDS");
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK"));
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TASK hl-formula-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-OP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCOND-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-OP"), (SubLObject)SubLObjectFactory.makeSymbol("SUFFICIENCIES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIFIED-SCONDS"), (SubLObject)shop_domain.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-SCOND"), (SubLObject)SubLObjectFactory.makeSymbol("SCOND-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)shop_domain.EQ, (SubLObject)SubLObjectFactory.makeKeyword("FAIL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-UNIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-SUFFICIENCY-COND")), (SubLObject)SubLObjectFactory.makeSymbol("CUR-SCOND")), (SubLObject)SubLObjectFactory.makeSymbol("TASK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-SCOND"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIED-SCONDS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIED-SCONDS"))));
        $sym68$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD");
        $kw69$FAIL = SubLObjectFactory.makeKeyword("FAIL");
        $sym70$SHOP_BASIC_DOMAIN_GET_SUFFICIENT_CONDS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN-GET-SUFFICIENT-CONDS-METHOD");
        $sym71$PRINT_ALL_SCONDS = SubLObjectFactory.makeSymbol("PRINT-ALL-SCONDS");
        $list72 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOHASH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-SCONDS"), (SubLObject)SubLObjectFactory.makeSymbol("SUFFICIENCIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)shop_domain.T, (SubLObject)SubLObjectFactory.makeString("~%~s"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-NAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-SCOND"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-SCONDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DESCRIBE-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-SCOND")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_domain.NIL));
        $sym73$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD");
        $str74$___s = SubLObjectFactory.makeString("~%~s");
        $sym75$SHOP_BASIC_DOMAIN_PRINT_ALL_SCONDS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN-PRINT-ALL-SCONDS-METHOD");
        $sym76$HTML_DISPLAY_ALL_SCONDS = SubLObjectFactory.makeSymbol("HTML-DISPLAY-ALL-SCONDS");
        $list77 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HASH-TABLE-TO-ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("SUFFICIENCIES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SORT"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("STRING<=")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-TASK-PRED-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-SCONDS"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-NAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-SCOND"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-SCONDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-SCOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-DISPLAY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-HR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_domain.NIL));
        $sym78$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD");
        $list79 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CUR-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-SCONDS"));
        $sym80$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_SCONDS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN-HTML-DISPLAY-ALL-SCONDS-METHOD");
        $sym81$ADD_METHOD = SubLObjectFactory.makeSymbol("ADD-METHOD");
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"));
        $list83 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-METHOD-P"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD")), (SubLObject)SubLObjectFactory.makeString("(ADD-METHOD ~S): ~S is not a valid SHOP-METHOD-P object."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-METHOD")), (SubLObject)SubLObjectFactory.makeSymbol("METHOD")), (SubLObject)SubLObjectFactory.makeSymbol("METHODS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_domain.NIL));
        $sym84$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD");
        $str85$_ADD_METHOD__S____S_is_not_a_vali = SubLObjectFactory.makeString("(ADD-METHOD ~S): ~S is not a valid SHOP-METHOD-P object.");
        $sym86$SHOP_BASIC_DOMAIN_ADD_METHOD_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN-ADD-METHOD-METHOD");
        $sym87$GET_METHODS = SubLObjectFactory.makeSymbol("GET-METHODS");
        $list88 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-FIND-ALL-MATCHING-RULES"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("METHODS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNIFIED-METHODS"), (SubLObject)shop_domain.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-UNIFY-FAILED?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-UNIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-METHOD")), (SubLObject)SubLObjectFactory.makeSymbol("CUR-METHOD")), (SubLObject)SubLObjectFactory.makeSymbol("TASK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIED-METHODS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("UNIFIED-METHODS"))));
        $sym89$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD");
        $sym90$SHOP_BASIC_DOMAIN_GET_METHODS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN-GET-METHODS-METHOD");
        $sym91$PRINT_ALL_METHODS = SubLObjectFactory.makeSymbol("PRINT-ALL-METHODS");
        $list92 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOHASH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-METHODS"), (SubLObject)SubLObjectFactory.makeSymbol("METHODS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)shop_domain.T, (SubLObject)SubLObjectFactory.makeString("~%~s"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-NAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-METHODS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DESCRIBE-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-METHOD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_domain.NIL));
        $sym93$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD");
        $sym94$SHOP_BASIC_DOMAIN_PRINT_ALL_METHODS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN-PRINT-ALL-METHODS-METHOD");
        $sym95$HTML_DISPLAY_ALL_METHODS = SubLObjectFactory.makeSymbol("HTML-DISPLAY-ALL-METHODS");
        $list96 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HASH-TABLE-TO-ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("METHODS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_domain.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SORT"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("STRING<=")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-TASK-PRED-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-METHODS"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-NAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-METHODS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-DISPLAY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-HR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_domain.NIL)));
        $sym97$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD");
        $list98 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CUR-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-METHODS"));
        $sym99$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_METHODS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN-HTML-DISPLAY-ALL-METHODS-METHOD");
        $sym100$ADD_OPERATOR = SubLObjectFactory.makeSymbol("ADD-OPERATOR");
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"));
        $list102 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-OPERATOR-P"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATOR")), (SubLObject)SubLObjectFactory.makeString("(ADD-OPERATOR ~S): ~S is not a valid SHOP-OPERATOR-P object."), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"))), (SubLObject)SubLObjectFactory.makeSymbol("OPERATORS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_domain.NIL));
        $sym103$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD");
        $str104$_ADD_OPERATOR__S____S_is_not_a_va = SubLObjectFactory.makeString("(ADD-OPERATOR ~S): ~S is not a valid SHOP-OPERATOR-P object.");
        $sym105$NAME = SubLObjectFactory.makeSymbol("NAME");
        $sym106$SHOP_BASIC_DOMAIN_ADD_OPERATOR_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN-ADD-OPERATOR-METHOD");
        $sym107$GET_OPERATORS = SubLObjectFactory.makeSymbol("GET-OPERATORS");
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TASK hl-formula-p\n   @return listp ;; of shop-operator-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATORS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULTS"), (SubLObject)shop_domain.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OP"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATOR-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-OPERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("OP")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-UNIFY-FAILED?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-UNIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-HEAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("OP"), (SubLObject)SubLObjectFactory.makeSymbol("RESULTS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("RESULTS")))));
        $sym109$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD");
        $sym110$SHOP_BASIC_DOMAIN_GET_OPERATORS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN-GET-OPERATORS-METHOD");
        $sym111$PRINT_ALL_OPERATORS = SubLObjectFactory.makeSymbol("PRINT-ALL-OPERATORS");
        $list112 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"));
        $list113 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOHASH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("X"), (SubLObject)SubLObjectFactory.makeSymbol("Y"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATORS")), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("Y"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TEMP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-LITERALS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ADDS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE-LITERALS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONDITIONAL-EFFECTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITIONAL-EFFECTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SHOP-BASIC-OPERATOR-COST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMP")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("~%~s"), (SubLObject)SubLObjectFactory.makeSymbol("X")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("~%  Head: ~S"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("~%  Add-literals:     ~S"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-LITERALS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("~%  Delete-literals: ~S"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-LITERALS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("~%  Conditional Effects: ~s"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITIONAL-EFFECTS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("~%  Cost: ~S"), (SubLObject)SubLObjectFactory.makeSymbol("COST")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("~%")) })), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_domain.NIL));
        $sym114$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD");
        $sym115$HEAD = SubLObjectFactory.makeSymbol("HEAD");
        $sym116$ADDS = SubLObjectFactory.makeSymbol("ADDS");
        $sym117$DELETES = SubLObjectFactory.makeSymbol("DELETES");
        $sym118$CONDITIONAL_EFFECTS = SubLObjectFactory.makeSymbol("CONDITIONAL-EFFECTS");
        $str119$____Head___S = SubLObjectFactory.makeString("~%  Head: ~S");
        $str120$____Add_literals_______S = SubLObjectFactory.makeString("~%  Add-literals:     ~S");
        $str121$____Delete_literals___S = SubLObjectFactory.makeString("~%  Delete-literals: ~S");
        $str122$____Conditional_Effects___s = SubLObjectFactory.makeString("~%  Conditional Effects: ~s");
        $str123$____Cost___S = SubLObjectFactory.makeString("~%  Cost: ~S");
        $str124$__ = SubLObjectFactory.makeString("~%");
        $sym125$SHOP_BASIC_DOMAIN_PRINT_ALL_OPERATORS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN-PRINT-ALL-OPERATORS-METHOD");
        $sym126$HTML_DISPLAY_ALL_OPERATORS = SubLObjectFactory.makeSymbol("HTML-DISPLAY-ALL-OPERATORS");
        $list127 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HASH-TABLE-TO-ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("OPERATORS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_domain.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SORT"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("STRING<=")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-TASK-PRED-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("OPS"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-OP"), (SubLObject)SubLObjectFactory.makeSymbol("OPS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-OP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-DISPLAY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_domain.NIL)));
        $sym128$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD");
        $list129 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("OPS"));
        $sym130$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_OPERATORS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN-HTML-DISPLAY-ALL-OPERATORS-METHOD");
        $sym131$GET_CONDITIONAL_OPERATORS = SubLObjectFactory.makeSymbol("GET-CONDITIONAL-OPERATORS");
        $list132 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TASK hl-formula-p\n   @return listp ;; of shop-operator-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULTS"), (SubLObject)shop_domain.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-P"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)SubLObjectFactory.makeString("(get-conditional-operators shop-basic-domain) Error with ~a, ~a is not a fort-p"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-FIND-ALL-MATCHING-RULES"), (SubLObject)SubLObjectFactory.makeSymbol("TASK"), (SubLObject)SubLObjectFactory.makeSymbol("COND-OPERATORS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PLANNER-RULE")), (SubLObject)SubLObjectFactory.makeSymbol("OP")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-UNIFY-FAILED?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-UNIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-HEAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REST"), (SubLObject)SubLObjectFactory.makeSymbol("TASK")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("OP"), (SubLObject)SubLObjectFactory.makeSymbol("RESULTS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("RESULTS")))));
        $sym133$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD");
        $str134$_get_conditional_operators_shop_b = SubLObjectFactory.makeString("(get-conditional-operators shop-basic-domain) Error with ~a, ~a is not a fort-p");
        $sym135$SHOP_BASIC_DOMAIN_GET_CONDITIONAL_OPERATORS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN-GET-CONDITIONAL-OPERATORS-METHOD");
        $sym136$HTML_DISPLAY_ALL_CONDITIONAL_OPERATORS = SubLObjectFactory.makeSymbol("HTML-DISPLAY-ALL-CONDITIONAL-OPERATORS");
        $list137 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HASH-TABLE-TO-ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("COND-OPERATORS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SORT"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("STRING<=")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-TASK-PRED-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-ALIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("OPS"), (SubLObject)SubLObjectFactory.makeSymbol("ALIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CB-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-OP"), (SubLObject)SubLObjectFactory.makeSymbol("OPS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-OP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-DISPLAY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HTML-NEWLINE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_domain.NIL)));
        $sym138$OUTER_CATCH_FOR_SHOP_BASIC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-DOMAIN-METHOD");
        $sym139$SHOP_BASIC_DOMAIN_HTML_DISPLAY_ALL_CONDITIONAL_OPERATORS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-DOMAIN-HTML-DISPLAY-ALL-CONDITIONAL-OPERATORS-METHOD");
        $sym140$SHOP_CYC_DOMAIN = SubLObjectFactory.makeSymbol("SHOP-CYC-DOMAIN");
        $list141 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-AXIOM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-PRECONDITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-EFFECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-CONDITIONAL-EFFECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-SUFFICIENT-COND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-PLAN-ASSERTIONS-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTIONS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-PLAN-ASSERTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INIT-DOMAIN-WITH-RULES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULES"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("POPULATE-DOMAIN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOMAIN")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INIT-SIMPLE-SITUATION-PREDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")) });
        $sym142$SUBLOOP_RESERVED_INITIALIZE_SHOP_CYC_DOMAIN_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-CYC-DOMAIN-CLASS");
        $sym143$SUBLOOP_RESERVED_INITIALIZE_SHOP_CYC_DOMAIN_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-CYC-DOMAIN-INSTANCE");
        $list144 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym145$SHOP_CYC_DOMAIN_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SHOP-CYC-DOMAIN-INITIALIZE-METHOD");
        $list146 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<SHOP-CYC-DOMAIN-~S:~S>"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("#<Malformed Instance>"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym147$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-CYC-DOMAIN-METHOD");
        $str148$__SHOP_CYC_DOMAIN__S__S_ = SubLObjectFactory.makeString("#<SHOP-CYC-DOMAIN-~S:~S>");
        $sym149$SHOP_CYC_DOMAIN_PRINT_METHOD = SubLObjectFactory.makeSymbol("SHOP-CYC-DOMAIN-PRINT-METHOD");
        $sym150$PROCESS_PLAN_ASSERTIONS_LIST = SubLObjectFactory.makeSymbol("PROCESS-PLAN-ASSERTIONS-LIST");
        $list151 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTIONS"));
        $list152 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param ASSERTIONS listp ;; of assertion-p\n   process a list of ASSERTIONS, so that they can be entered into the domain\n   description. ASSERTIONS is a list of elements satisfying ASSERTION-P. \n   Returns T."), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRECONDS"), (SubLObject)shop_domain.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EFFECTS"), (SubLObject)shop_domain.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRE-METHODS"), (SubLObject)shop_domain.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHODS"), (SubLObject)shop_domain.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AXIOMS"), (SubLObject)shop_domain.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUFFICIENT-CONDS"), (SubLObject)shop_domain.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COND-EFFECTS"), (SubLObject)shop_domain.NIL)), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTIONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-MENTIONS-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preconditionForMethod"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("PRE-METHODS"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-MENTIONS-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("methodForAction"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("METHODS"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-MENTIONS-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preconditionFor-Props"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("PRECONDS"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-MENTIONS-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("effectOfAction-Props"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("EFFECTS"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-MENTIONS-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sufficientFor-Props"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("SUFFICIENT-CONDS"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-MENTIONS-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("effectOfActionIf-Props"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("COND-EFFECTS"))), (SubLObject)ConsesLow.list((SubLObject)shop_domain.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("AXIOMS"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("*SHOP-USE-PRECONDITION-FOR-METHOD?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)shop_domain.T, (SubLObject)SubLObjectFactory.makeString("******************* --> using preconditionForMethod~%~%")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("METHODS"), (SubLObject)SubLObjectFactory.makeSymbol("PRE-METHODS")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRECOND"), (SubLObject)SubLObjectFactory.makeSymbol("PRECONDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS-PRECONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("PRECOND"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EFFECT"), (SubLObject)SubLObjectFactory.makeSymbol("EFFECTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS-EFFECT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("EFFECT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COND-EFFECT"), (SubLObject)SubLObjectFactory.makeSymbol("COND-EFFECTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS-CONDITIONAL-EFFECT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("COND-EFFECT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("METHODS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCOND"), (SubLObject)SubLObjectFactory.makeSymbol("SUFFICIENT-CONDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS-SUFFICIENT-COND"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("SCOND"))) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_domain.T));
        $sym153$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-CYC-DOMAIN-METHOD");
        $const154$preconditionForMethod = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preconditionForMethod"));
        $const155$methodForAction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("methodForAction"));
        $const156$preconditionFor_Props = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preconditionFor-Props"));
        $const157$effectOfAction_Props = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("effectOfAction-Props"));
        $const158$sufficientFor_Props = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sufficientFor-Props"));
        $const159$effectOfActionIf_Props = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("effectOfActionIf-Props"));
        $str160$________________________using_pre = SubLObjectFactory.makeString("******************* --> using preconditionForMethod~%~%");
        $sym161$SHOP_CYC_DOMAIN_PROCESS_PLAN_ASSERTIONS_LIST_METHOD = SubLObjectFactory.makeSymbol("SHOP-CYC-DOMAIN-PROCESS-PLAN-ASSERTIONS-LIST-METHOD");
        $sym162$GATHER_PLANNING_ASSERTIONS = SubLObjectFactory.makeSymbol("GATHER-PLANNING-ASSERTIONS");
        $list163 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-MT"));
        $list164 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param DOMAIN-MT hlmt-p\n   Returns the el form of assertions in MT which are likely planning assertions."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASS-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SET")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-MT"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("*SHOP-DOMAIN-DEFINITION-PREDICATES*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-ASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-PREDICATE-RULE-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-PRED"), (SubLObject)SubLObjectFactory.makeKeyword("POS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ADD"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-ASS"), (SubLObject)SubLObjectFactory.makeSymbol("ASS-SET")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-ASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-PREDICATE-EXTENT-INDEX"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preconditionForMethod")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ADD"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-ASS"), (SubLObject)SubLObjectFactory.makeSymbol("ASS-SET")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ELEMENT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("ASS-SET")))));
        $sym165$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $kw166$POS = SubLObjectFactory.makeKeyword("POS");
        $sym167$SHOP_CYC_DOMAIN_GATHER_PLANNING_ASSERTIONS_METHOD = SubLObjectFactory.makeSymbol("SHOP-CYC-DOMAIN-GATHER-PLANNING-ASSERTIONS-METHOD");
        $sym168$INIT_SIMPLE_SITUATION_PREDS = SubLObjectFactory.makeSymbol("INIT-SIMPLE-SITUATION-PREDS");
        $list169 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HLMT-P"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-MT")), (SubLObject)SubLObjectFactory.makeString("(init-simple-situation-preds shop-cyc-domain): ~s is not hlmt-p")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-PREDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ALL-FORT-INSTANCES"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimpleSituationPredicate")), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-MT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-SITUATION-PREDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTRUCT-SET-FROM-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SIMPLE-PREDS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_domain.NIL)));
        $sym170$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-CYC-DOMAIN-METHOD");
        $str171$_init_simple_situation_preds_shop = SubLObjectFactory.makeString("(init-simple-situation-preds shop-cyc-domain): ~s is not hlmt-p");
        $const172$SimpleSituationPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimpleSituationPredicate"));
        $sym173$SHOP_CYC_DOMAIN_INIT_SIMPLE_SITUATION_PREDS_METHOD = SubLObjectFactory.makeSymbol("SHOP-CYC-DOMAIN-INIT-SIMPLE-SITUATION-PREDS-METHOD");
        $sym174$INIT_DOMAIN_WITH_RULES = SubLObjectFactory.makeSymbol("INIT-DOMAIN-WITH-RULES");
        $list175 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULES"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-MT"));
        $list176 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("This function is used primarily for creating domains from the proof checker."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS-PLAN-ASSERTIONS-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("RULES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INIT-SIMPLE-SITUATION-PREDS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_domain.T));
        $sym177$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-CYC-DOMAIN-METHOD");
        $sym178$SHOP_CYC_DOMAIN_INIT_DOMAIN_WITH_RULES_METHOD = SubLObjectFactory.makeSymbol("SHOP-CYC-DOMAIN-INIT-DOMAIN-WITH-RULES-METHOD");
        $sym179$PROCESS_PLAN_ASSERTIONS = SubLObjectFactory.makeSymbol("PROCESS-PLAN-ASSERTIONS");
        $list180 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Reads planning domain assertions in microtheory mt and\n   translates them into a planning domain data structure\n   for use by the planner."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER-PLANNING-ASSERTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-CYC-DOMAIN")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-MT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS-PLAN-ASSERTIONS-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTIONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INIT-SIMPLE-SITUATION-PREDS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("DOMAIN-MT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_domain.T));
        $sym181$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-CYC-DOMAIN-METHOD");
        $sym182$SHOP_CYC_DOMAIN_PROCESS_PLAN_ASSERTIONS_METHOD = SubLObjectFactory.makeSymbol("SHOP-CYC-DOMAIN-PROCESS-PLAN-ASSERTIONS-METHOD");
        $sym183$PROCESS_METHOD = SubLObjectFactory.makeSymbol("PROCESS-METHOD");
        $list184 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"));
        $list185 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param ASSERION assertion-p\n   turns #$methodForAction formula into a planner method datastructure."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("PRECONDITIONS"), (SubLObject)SubLObjectFactory.makeSymbol("DECOMPOSITION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-EXTRACT-METHOD-FROM-ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-HEAD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-METHOD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INIT"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-METHOD")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("PRECONDITIONS"), (SubLObject)SubLObjectFactory.makeSymbol("DECOMPOSITION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("METHODS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_domain.T))));
        $sym186$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-CYC-DOMAIN-METHOD");
        $sym187$SHOP_BASIC_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-METHOD");
        $sym188$SHOP_CYC_DOMAIN_PROCESS_METHOD_METHOD = SubLObjectFactory.makeSymbol("SHOP-CYC-DOMAIN-PROCESS-METHOD-METHOD");
        $sym189$PROCESS_PRECONDITION = SubLObjectFactory.makeSymbol("PROCESS-PRECONDITION");
        $list190 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param ASSERTION assertion-p\n   Turn el precondition formulas into  preconditions for action operators."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACTION-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-FORM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DECOMPOSITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeKeyword("PRIMITIVE"), (SubLObject)SubLObjectFactory.makeSymbol("ACTION-HEAD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONDITIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-FORM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PRECONDITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PRECONDITION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PRECONDITION"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-CONJUNCTIVE-FORMULA-TO-LITERALS"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITIONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INIT"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-PRECONDITION")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRECONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ACTION-HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITIONS"), (SubLObject)SubLObjectFactory.makeSymbol("DECOMPOSITION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-PRECONDITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ACTION-HEAD")), (SubLObject)SubLObjectFactory.makeSymbol("PRECONDITIONS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_domain.T)));
        $sym191$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-CYC-DOMAIN-METHOD");
        $kw192$PRIMITIVE = SubLObjectFactory.makeKeyword("PRIMITIVE");
        $sym193$SHOP_BASIC_PRECONDITION = SubLObjectFactory.makeSymbol("SHOP-BASIC-PRECONDITION");
        $sym194$SHOP_CYC_DOMAIN_PROCESS_PRECONDITION_METHOD = SubLObjectFactory.makeSymbol("SHOP-CYC-DOMAIN-PROCESS-PRECONDITION-METHOD");
        $sym195$PROCESS_EFFECT = SubLObjectFactory.makeSymbol("PROCESS-EFFECT");
        $list196 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param ASSERTION assertion-p \n   Turn el effect statements into add and delete lists for action operators."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACTION-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-FORM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EFFECTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-FORM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-OPERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-OPERATOR"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("EFFECTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-CONJUNCTIVE-FORMULA-TO-LITERALS"), (SubLObject)SubLObjectFactory.makeSymbol("EFFECTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-SEPARATE-EFFECT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("EFFECTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INIT"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-OPERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("ACTION-HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ACTION-HEAD")), (SubLObject)SubLObjectFactory.makeSymbol("OPERATORS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_domain.T));
        $sym197$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-CYC-DOMAIN-METHOD");
        $sym198$SHOP_BASIC_OPERATOR = SubLObjectFactory.makeSymbol("SHOP-BASIC-OPERATOR");
        $sym199$SHOP_CYC_DOMAIN_PROCESS_EFFECT_METHOD = SubLObjectFactory.makeSymbol("SHOP-CYC-DOMAIN-PROCESS-EFFECT-METHOD");
        $sym200$PROCESS_SUFFICIENT_COND = SubLObjectFactory.makeSymbol("PROCESS-SUFFICIENT-COND");
        $list201 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param ASSERTION assertion-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRECONDITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-FORM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACTION-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-FORM"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SCOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-SUFFICIENCY-COND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-SUFFICIENCY-COND"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PRECONDITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-CONJUNCTIVE-FORMULA-TO-LITERALS"), (SubLObject)SubLObjectFactory.makeSymbol("PRECONDITION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SCOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-HEAD")), (SubLObject)SubLObjectFactory.makeSymbol("ACTION-FORM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SCOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-COND-FORMULA")), (SubLObject)SubLObjectFactory.makeSymbol("PRECONDITION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SCOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET-ASSERTIONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-SCOND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ACTION-FORM")), (SubLObject)SubLObjectFactory.makeSymbol("SUFFICIENCIES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_domain.NIL)));
        $sym202$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-CYC-DOMAIN-METHOD");
        $sym203$SHOP_BASIC_SUFFICIENCY_COND = SubLObjectFactory.makeSymbol("SHOP-BASIC-SUFFICIENCY-COND");
        $sym204$SET_HEAD = SubLObjectFactory.makeSymbol("SET-HEAD");
        $sym205$SET_COND_FORMULA = SubLObjectFactory.makeSymbol("SET-COND-FORMULA");
        $sym206$SET_ASSERTIONS = SubLObjectFactory.makeSymbol("SET-ASSERTIONS");
        $sym207$SHOP_CYC_DOMAIN_PROCESS_SUFFICIENT_COND_METHOD = SubLObjectFactory.makeSymbol("SHOP-CYC-DOMAIN-PROCESS-SUFFICIENT-COND-METHOD");
        $sym208$PROCESS_CONDITIONAL_EFFECT = SubLObjectFactory.makeSymbol("PROCESS-CONDITIONAL-EFFECT");
        $list209 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param ASSERTION assertion-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACTION-FORMULA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACTION-HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("ACTION-FORMULA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EFFECTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-ARG3"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COND-EFFECT-OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)shop_domain.EQ, (SubLObject)SubLObjectFactory.makeSymbol("PRED"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("effectOfActionIf-Props"))), (SubLObject)SubLObjectFactory.makeString("process-conditional-effect:~a is not at conditional effect assertion."), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("EFFECTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-CONJUNCTIVE-FORMULA-TO-LITERALS"), (SubLObject)SubLObjectFactory.makeSymbol("EFFECTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-CONJUNCTIVE-FORMULA-TO-LITERALS"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-SEPARATE-EFFECT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("EFFECTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INIT"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT")), (SubLObject)SubLObjectFactory.makeSymbol("COND-EFFECT-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ACTION-HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("COND-EFFECT-OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA-OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ACTION-HEAD")), (SubLObject)SubLObjectFactory.makeSymbol("COND-OPERATORS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_domain.NIL));
        $sym210$OUTER_CATCH_FOR_SHOP_CYC_DOMAIN_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-CYC-DOMAIN-METHOD");
        $sym211$SHOP_BASIC_CONDITIONAL_EFFECT = SubLObjectFactory.makeSymbol("SHOP-BASIC-CONDITIONAL-EFFECT");
        $str212$process_conditional_effect__a_is_ = SubLObjectFactory.makeString("process-conditional-effect:~a is not at conditional effect assertion.");
        $sym213$SHOP_CYC_DOMAIN_PROCESS_CONDITIONAL_EFFECT_METHOD = SubLObjectFactory.makeSymbol("SHOP-CYC-DOMAIN-PROCESS-CONDITIONAL-EFFECT-METHOD");
        $const214$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $sym215$SHOP_METHOD_FORMULA_P = SubLObjectFactory.makeSymbol("SHOP-METHOD-FORMULA-P");
        $sym216$NEGATE = SubLObjectFactory.makeSymbol("NEGATE");
        $const217$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $const218$TheList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList"));
        $const219$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
    }
}

/*

	Total time: 1000 ms
	
*/