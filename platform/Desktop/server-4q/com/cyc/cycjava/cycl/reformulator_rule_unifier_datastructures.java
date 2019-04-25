package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_rule_unifier_datastructures
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.reformulator_rule_unifier_datastructures";
  public static final String myFingerPrint = "20e84ec9804c2a30f49e27ced1111d8eaad1b62abf113d90686f188feccae11c";
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 1767L)
  public static SubLSymbol $dtp_reformulator_template$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLSymbol $dtp_reformulator_rule$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 9295L)
  private static SubLSymbol $reformulator_rules$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 9858L)
  private static SubLSymbol $fort_reformulator_rule_table$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 10137L)
  private static SubLSymbol $constant_reformulator_rule_table$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 10417L)
  private static SubLSymbol $nart_reformulator_rule_table$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 10685L)
  private static SubLSymbol $unassociated_reformulator_rules$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 30395L)
  private static SubLSymbol $reformulator_shared_vars$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 30649L)
  private static SubLSymbol $reformulator_shared_var_bindings$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 30775L)
  private static SubLSymbol $reformulator_next_available_hl_var_num$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 33612L)
  public static SubLSymbol $reformulator_skolem_dwimming_space$;
  private static final SubLSymbol $sym0$REFORMULATOR_TEMPLATE;
  private static final SubLSymbol $sym1$REFORMULATOR_TEMPLATE_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_REFORMULATOR_TEMPLATE;
  private static final SubLSymbol $sym7$REFORMULATOR_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$RT_EXPRESSION;
  private static final SubLSymbol $sym10$_CSETF_RT_EXPRESSION;
  private static final SubLSymbol $sym11$RT_SHARED_VAR_BINDINGS;
  private static final SubLSymbol $sym12$_CSETF_RT_SHARED_VAR_BINDINGS;
  private static final SubLSymbol $sym13$RT_MT;
  private static final SubLSymbol $sym14$_CSETF_RT_MT;
  private static final SubLSymbol $sym15$RT_FORTS;
  private static final SubLSymbol $sym16$_CSETF_RT_FORTS;
  private static final SubLSymbol $kw17$EXPRESSION;
  private static final SubLSymbol $kw18$SHARED_VAR_BINDINGS;
  private static final SubLSymbol $kw19$MT;
  private static final SubLSymbol $kw20$FORTS;
  private static final SubLString $str21$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw22$BEGIN;
  private static final SubLSymbol $sym23$MAKE_REFORMULATOR_TEMPLATE;
  private static final SubLSymbol $kw24$SLOT;
  private static final SubLSymbol $kw25$END;
  private static final SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_REFORMULATOR_TEMPLATE_METHOD;
  private static final SubLSymbol $sym27$REFORMULATOR_RULE;
  private static final SubLSymbol $sym28$REFORMULATOR_RULE_P;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$PRINT_REFORMULATOR_RULE;
  private static final SubLSymbol $sym34$REFORMULATOR_RULE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$REFR_FIRST_RT;
  private static final SubLSymbol $sym37$_CSETF_REFR_FIRST_RT;
  private static final SubLSymbol $sym38$REFR_SECOND_RT;
  private static final SubLSymbol $sym39$_CSETF_REFR_SECOND_RT;
  private static final SubLSymbol $sym40$REFR_MT;
  private static final SubLSymbol $sym41$_CSETF_REFR_MT;
  private static final SubLSymbol $sym42$REFR_WFF_DEGREE;
  private static final SubLSymbol $sym43$_CSETF_REFR_WFF_DEGREE;
  private static final SubLSymbol $sym44$REFR_DIRECTIONS;
  private static final SubLSymbol $sym45$_CSETF_REFR_DIRECTIONS;
  private static final SubLSymbol $sym46$REFR_ASSERTION;
  private static final SubLSymbol $sym47$_CSETF_REFR_ASSERTION;
  private static final SubLSymbol $sym48$REFR_RULE_PRED;
  private static final SubLSymbol $sym49$_CSETF_REFR_RULE_PRED;
  private static final SubLSymbol $sym50$REFR_PRECONDITIONS;
  private static final SubLSymbol $sym51$_CSETF_REFR_PRECONDITIONS;
  private static final SubLSymbol $sym52$REFR_PROPERTIES;
  private static final SubLSymbol $sym53$_CSETF_REFR_PROPERTIES;
  private static final SubLSymbol $kw54$FIRST_RT;
  private static final SubLSymbol $kw55$SECOND_RT;
  private static final SubLSymbol $kw56$WFF_DEGREE;
  private static final SubLSymbol $kw57$DIRECTIONS;
  private static final SubLSymbol $kw58$ASSERTION;
  private static final SubLSymbol $kw59$RULE_PRED;
  private static final SubLSymbol $kw60$PRECONDITIONS;
  private static final SubLSymbol $kw61$PROPERTIES;
  private static final SubLSymbol $sym62$MAKE_REFORMULATOR_RULE;
  private static final SubLSymbol $sym63$VISIT_DEFSTRUCT_OBJECT_REFORMULATOR_RULE_METHOD;
  private static final SubLString $str64$__RT_;
  private static final SubLString $str65$__RT__s_;
  private static final SubLString $str66$__RT__s__s__s_;
  private static final SubLString $str67$__RR__s_;
  private static final SubLString $str68$__REFORMULATOR_RULE__s__s__s_;
  private static final SubLString $str69$__REFORMULATOR_RULE__s__s__s__s__;
  private static final SubLString $str70$__REFORMULATOR_RULE__s__s__s__s__;
  private static final SubLObject $const71$ReformulationForwardDirection;
  private static final SubLObject $const72$ReformulationBackwardDirection;
  private static final SubLSymbol $sym73$_REFORMULATOR_RULES_;
  private static final SubLSymbol $sym74$_FORT_REFORMULATOR_RULE_TABLE_;
  private static final SubLSymbol $sym75$_CONSTANT_REFORMULATOR_RULE_TABLE_;
  private static final SubLSymbol $sym76$_NART_REFORMULATOR_RULE_TABLE_;
  private static final SubLSymbol $sym77$_UNASSOCIATED_REFORMULATOR_RULES_;
  private static final SubLString $str78$Found_an_ill_formed_reformulation;
  private static final SubLSymbol $sym79$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const80$EverythingPSC;
  private static final SubLSymbol $sym81$GATHER_PREDICATE_EXTENT_INDEX;
  private static final SubLString $str82$Initializing_Reformulator_Rules;
  private static final SubLSymbol $sym83$DEFAULT_EL_VAR_;
  private static final SubLString $str84$expansion_rule__s_contains_a_defa;
  private static final SubLSymbol $sym85$GENERIC_ARG_P;
  private static final SubLSymbol $sym86$GENERIC_ARG_TO_DEFAULT_EL_VAR;
  private static final SubLSymbol $sym87$FIND_DEFAULT_EL_VAR_BY_ID;
  private static final SubLSymbol $sym88$CHLMT_P;
  private static final SubLString $str89$Found_a_reformulator_rule_that_wo;
  private static final SubLString $str90$Encountered__A_which_is_not_a_CYC;
  private static final SubLSymbol $kw91$NONE;
  private static final SubLSymbol $kw92$KB;
  private static final SubLSymbol $kw93$ARITY;
  private static final SubLSymbol $kw94$ALL;
  private static final SubLList $list95;
  private static final SubLSymbol $sym96$HIGHEST_VAR_NUM;
  private static final SubLSymbol $sym97$CLET;
  private static final SubLSymbol $sym98$_REFORMULATOR_SHARED_VARS_;
  private static final SubLList $list99;
  private static final SubLSymbol $sym100$SAFE_MAX;
  private static final SubLSymbol $sym101$MAPCAR;
  private static final SubLList $list102;
  private static final SubLSymbol $sym103$EXPRESSION_GATHER;
  private static final SubLList $list104;
  private static final SubLSymbol $sym105$_REFORMULATOR_NEXT_AVAILABLE_HL_VAR_NUM_;
  private static final SubLSymbol $sym106$VARIABLE_ID;
  private static final SubLSymbol $sym107$VARIABLE_P;
  private static final SubLSymbol $sym108$REFORMULATOR_SHARED_EL_VAR_OR_DONT_CARE_VAR_;
  private static final SubLSymbol $sym109$REFORMULATOR_APPROPRIATE_HL_VAR;
  private static final SubLSymbol $sym110$UNREIFIED_SKOLEM_TERM_;
  private static final SubLSymbol $sym111$REFORMULATOR_DWIM_SKOLEM;
  private static final SubLInteger $int112$100;
  private static final SubLSymbol $sym113$REFORMULATOR_SKOLEM_FUNCTION_FN_TO_CLEAN_UP_;
  private static final SubLObject $const114$SkolemFunctionFn;
  private static final SubLSymbol $sym115$EL_VARIABLE_;
  private static final SubLObject $const116$reformulationPrecondition;
  private static final SubLObject $const117$reformulationDirectionInMode;
  private static final SubLObject $const118$reformulatorRuleProperties;
  private static final SubLSymbol $sym119$REFORMULATOR_RELEVANT_FORT_;
  private static final SubLObject $const120$ReformulatorHighlyRelevantFORT;
  private static final SubLObject $const121$expansion;
  private static final SubLObject $const122$rewriteOf;
  private static final SubLObject $const123$ELRelation;
  private static final SubLString $str124$This_code_can_only_handle_reformu;
  private static final SubLList $list125;

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 1767L)
  public static SubLObject reformulator_template_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_reformulator_template( v_object, stream, ZERO_INTEGER, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 1767L)
  public static SubLObject reformulator_template_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $reformulator_template_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 1767L)
  public static SubLObject rt_expression(final SubLObject v_object)
  {
    assert NIL != reformulator_template_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 1767L)
  public static SubLObject rt_shared_var_bindings(final SubLObject v_object)
  {
    assert NIL != reformulator_template_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 1767L)
  public static SubLObject rt_mt(final SubLObject v_object)
  {
    assert NIL != reformulator_template_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 1767L)
  public static SubLObject rt_forts(final SubLObject v_object)
  {
    assert NIL != reformulator_template_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 1767L)
  public static SubLObject _csetf_rt_expression(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != reformulator_template_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 1767L)
  public static SubLObject _csetf_rt_shared_var_bindings(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != reformulator_template_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 1767L)
  public static SubLObject _csetf_rt_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != reformulator_template_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 1767L)
  public static SubLObject _csetf_rt_forts(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != reformulator_template_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 1767L)
  public static SubLObject make_reformulator_template(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $reformulator_template_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw17$EXPRESSION ) )
      {
        _csetf_rt_expression( v_new, current_value );
      }
      else if( pcase_var.eql( $kw18$SHARED_VAR_BINDINGS ) )
      {
        _csetf_rt_shared_var_bindings( v_new, current_value );
      }
      else if( pcase_var.eql( $kw19$MT ) )
      {
        _csetf_rt_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$FORTS ) )
      {
        _csetf_rt_forts( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 1767L)
  public static SubLObject visit_defstruct_reformulator_template(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym23$MAKE_REFORMULATOR_TEMPLATE, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw17$EXPRESSION, rt_expression( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw18$SHARED_VAR_BINDINGS, rt_shared_var_bindings( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw19$MT, rt_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw20$FORTS, rt_forts( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym23$MAKE_REFORMULATOR_TEMPLATE, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 1767L)
  public static SubLObject visit_defstruct_object_reformulator_template_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_reformulator_template( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject reformulator_rule_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_reformulator_rule( v_object, stream, ZERO_INTEGER, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject reformulator_rule_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $reformulator_rule_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject refr_first_rt(final SubLObject v_object)
  {
    assert NIL != reformulator_rule_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject refr_second_rt(final SubLObject v_object)
  {
    assert NIL != reformulator_rule_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject refr_mt(final SubLObject v_object)
  {
    assert NIL != reformulator_rule_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject refr_wff_degree(final SubLObject v_object)
  {
    assert NIL != reformulator_rule_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject refr_directions(final SubLObject v_object)
  {
    assert NIL != reformulator_rule_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject refr_assertion(final SubLObject v_object)
  {
    assert NIL != reformulator_rule_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject refr_rule_pred(final SubLObject v_object)
  {
    assert NIL != reformulator_rule_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject refr_preconditions(final SubLObject v_object)
  {
    assert NIL != reformulator_rule_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject refr_properties(final SubLObject v_object)
  {
    assert NIL != reformulator_rule_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject _csetf_refr_first_rt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != reformulator_rule_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject _csetf_refr_second_rt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != reformulator_rule_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject _csetf_refr_mt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != reformulator_rule_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject _csetf_refr_wff_degree(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != reformulator_rule_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject _csetf_refr_directions(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != reformulator_rule_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject _csetf_refr_assertion(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != reformulator_rule_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject _csetf_refr_rule_pred(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != reformulator_rule_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject _csetf_refr_preconditions(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != reformulator_rule_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject _csetf_refr_properties(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != reformulator_rule_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject make_reformulator_rule(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $reformulator_rule_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw54$FIRST_RT ) )
      {
        _csetf_refr_first_rt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw55$SECOND_RT ) )
      {
        _csetf_refr_second_rt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw19$MT ) )
      {
        _csetf_refr_mt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw56$WFF_DEGREE ) )
      {
        _csetf_refr_wff_degree( v_new, current_value );
      }
      else if( pcase_var.eql( $kw57$DIRECTIONS ) )
      {
        _csetf_refr_directions( v_new, current_value );
      }
      else if( pcase_var.eql( $kw58$ASSERTION ) )
      {
        _csetf_refr_assertion( v_new, current_value );
      }
      else if( pcase_var.eql( $kw59$RULE_PRED ) )
      {
        _csetf_refr_rule_pred( v_new, current_value );
      }
      else if( pcase_var.eql( $kw60$PRECONDITIONS ) )
      {
        _csetf_refr_preconditions( v_new, current_value );
      }
      else if( pcase_var.eql( $kw61$PROPERTIES ) )
      {
        _csetf_refr_properties( v_new, current_value );
      }
      else
      {
        Errors.error( $str21$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject visit_defstruct_reformulator_rule(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw22$BEGIN, $sym62$MAKE_REFORMULATOR_RULE, NINE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw54$FIRST_RT, refr_first_rt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw55$SECOND_RT, refr_second_rt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw19$MT, refr_mt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw56$WFF_DEGREE, refr_wff_degree( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw57$DIRECTIONS, refr_directions( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw58$ASSERTION, refr_assertion( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw59$RULE_PRED, refr_rule_pred( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw60$PRECONDITIONS, refr_preconditions( obj ) );
    Functions.funcall( visitor_fn, obj, $kw24$SLOT, $kw61$PROPERTIES, refr_properties( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$END, $sym62$MAKE_REFORMULATOR_RULE, NINE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 2677L)
  public static SubLObject visit_defstruct_object_reformulator_rule_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_reformulator_rule( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 3680L)
  public static SubLObject print_reformulator_template(final SubLObject v_object, final SubLObject stream, final SubLObject depth, SubLObject verbosity_level)
  {
    if( verbosity_level == UNPROVIDED )
    {
      verbosity_level = reformulator_datastructures.reformulator_print_verbosity_level();
    }
    if( verbosity_level.isZero() )
    {
      PrintLow.format( stream, $str64$__RT_ );
    }
    else if( ONE_INTEGER.numE( verbosity_level ) )
    {
      PrintLow.format( stream, $str65$__RT__s_, reformulator_template_expression( v_object ) );
    }
    else if( verbosity_level.numGE( TWO_INTEGER ) )
    {
      PrintLow.format( stream, $str66$__RT__s__s__s_, new SubLObject[] { reformulator_template_expression( v_object ), reformulator_template_shared_var_bindings( v_object ), reformulator_template_mt( v_object ),
        reformulator_template_forts( v_object )
      } );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 4605L)
  public static SubLObject reformulator_template_expression(final SubLObject rt)
  {
    return rt_expression( rt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 4691L)
  public static SubLObject reformulator_template_el_var_expression(final SubLObject rt)
  {
    return subl_promotions.nrsublis( reformulator_template_shared_var_bindings( rt ), el_utilities.copy_expression( reformulator_template_expression( rt ) ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 4904L)
  public static SubLObject reformulator_template_shared_var_bindings(final SubLObject rt)
  {
    return rt_shared_var_bindings( rt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 5007L)
  public static SubLObject reformulator_template_mt(final SubLObject rt)
  {
    return rt_mt( rt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 5076L)
  public static SubLObject reformulator_template_forts(final SubLObject rt)
  {
    return rt_forts( rt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 5151L)
  public static SubLObject reformulator_template_clausesP(final SubLObject rt)
  {
    return clauses.clauses_p( rt_expression( rt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 5246L)
  public static SubLObject print_reformulator_rule(final SubLObject v_object, final SubLObject stream, final SubLObject depth, SubLObject verbosity_level)
  {
    if( verbosity_level == UNPROVIDED )
    {
      verbosity_level = reformulator_datastructures.reformulator_print_verbosity_level();
    }
    if( verbosity_level.isZero() )
    {
      PrintLow.format( stream, $str67$__RR__s_, reformulator_rule_assertion_id( v_object ) );
    }
    else if( ONE_INTEGER.numE( verbosity_level ) )
    {
      PrintLow.format( stream, $str68$__REFORMULATOR_RULE__s__s__s_, new SubLObject[] { reformulator_rule_first_rt( v_object ), reformulator_rule_second_rt( v_object ), reformulator_rule_mt( v_object )
      } );
    }
    else if( TWO_INTEGER.numE( verbosity_level ) )
    {
      PrintLow.format( stream, $str69$__REFORMULATOR_RULE__s__s__s__s__, new SubLObject[] { reformulator_rule_first_rt( v_object ), reformulator_rule_second_rt( v_object ), reformulator_rule_mt( v_object ),
        reformulator_rule_wff_degree( v_object ), reformulator_rule_directions( v_object ), reformulator_rule_assertion_id( v_object ), reformulator_rule_rule_pred( v_object )
      } );
    }
    else if( THREE_INTEGER.numGE( verbosity_level ) )
    {
      PrintLow.format( stream, $str70$__REFORMULATOR_RULE__s__s__s__s__, new SubLObject[] { reformulator_rule_first_rt( v_object ), reformulator_rule_second_rt( v_object ), reformulator_rule_mt( v_object ),
        reformulator_rule_wff_degree( v_object ), reformulator_rule_directions( v_object ), reformulator_rule_assertion_id( v_object ), reformulator_rule_rule_pred( v_object ), reformulator_rule_preconditions(
            v_object ), reformulator_rule_properties( v_object )
      } );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 6829L)
  public static SubLObject reformulator_rule_first_rt(final SubLObject rr)
  {
    return refr_first_rt( rr );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 6909L)
  public static SubLObject reformulator_rule_second_rt(final SubLObject rr)
  {
    return refr_second_rt( rr );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 6990L)
  public static SubLObject reformulator_rule_source_rt(final SubLObject rr, final SubLObject direction)
  {
    if( direction.eql( $const71$ReformulationForwardDirection ) )
    {
      return reformulator_rule_first_rt( rr );
    }
    if( direction.eql( $const72$ReformulationBackwardDirection ) )
    {
      return reformulator_rule_second_rt( rr );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 7325L)
  public static SubLObject reformulator_rule_target_rt(final SubLObject rr, final SubLObject direction)
  {
    if( direction.eql( $const71$ReformulationForwardDirection ) )
    {
      return reformulator_rule_second_rt( rr );
    }
    if( direction.eql( $const72$ReformulationBackwardDirection ) )
    {
      return reformulator_rule_first_rt( rr );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 7660L)
  public static SubLObject reformulator_rule_first_shared_var_bindings(final SubLObject rr)
  {
    return reformulator_template_shared_var_bindings( reformulator_rule_first_rt( rr ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 7811L)
  public static SubLObject reformulator_rule_second_shared_var_bindings(final SubLObject rr)
  {
    return reformulator_template_shared_var_bindings( reformulator_rule_second_rt( rr ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 7964L)
  public static SubLObject reformulator_rule_source_shared_var_bindings(final SubLObject rr, final SubLObject direction)
  {
    if( direction.eql( $const71$ReformulationForwardDirection ) )
    {
      return reformulator_rule_first_shared_var_bindings( rr );
    }
    if( direction.eql( $const72$ReformulationBackwardDirection ) )
    {
      return reformulator_rule_second_shared_var_bindings( rr );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 8290L)
  public static SubLObject reformulator_rule_target_shared_var_bindings(final SubLObject rr, final SubLObject direction)
  {
    if( direction.eql( $const71$ReformulationForwardDirection ) )
    {
      return reformulator_rule_second_shared_var_bindings( rr );
    }
    if( direction.eql( $const72$ReformulationBackwardDirection ) )
    {
      return reformulator_rule_first_shared_var_bindings( rr );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 8616L)
  public static SubLObject reformulator_rule_mt(final SubLObject rr)
  {
    return refr_mt( rr );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 8683L)
  public static SubLObject reformulator_rule_wff_degree(final SubLObject rr)
  {
    return refr_wff_degree( rr );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 8766L)
  public static SubLObject reformulator_rule_directions(final SubLObject rr)
  {
    return refr_directions( rr );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 8849L)
  public static SubLObject reformulator_rule_assertion(final SubLObject rr)
  {
    return refr_assertion( rr );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 8930L)
  public static SubLObject reformulator_rule_assertion_id(final SubLObject rr)
  {
    return assertion_handles.assertion_id( reformulator_rule_assertion( rr ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 9042L)
  public static SubLObject reformulator_rule_rule_pred(final SubLObject rr)
  {
    return refr_rule_pred( rr );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 9123L)
  public static SubLObject reformulator_rule_preconditions(final SubLObject rr)
  {
    return refr_preconditions( rr );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 9212L)
  public static SubLObject reformulator_rule_properties(final SubLObject rr)
  {
    return refr_properties( rr );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 10914L)
  public static SubLObject reformulator_rules()
  {
    return $reformulator_rules$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 11227L)
  public static SubLObject fort_reformulator_rule_table()
  {
    return $fort_reformulator_rule_table$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 11318L)
  public static SubLObject constant_reformulator_rule_table()
  {
    return $constant_reformulator_rule_table$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 11417L)
  public static SubLObject nart_reformulator_rule_table()
  {
    return $nart_reformulator_rule_table$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 11508L)
  public static SubLObject unassociated_reformulator_rules()
  {
    return $unassociated_reformulator_rules$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 11605L)
  public static SubLObject add_reformulator_rule_assertion(final SubLObject assertion, SubLObject lock)
  {
    if( lock == UNPROVIDED )
    {
      lock = NIL;
    }
    final SubLObject rr = reformulation_assertion_to_reformulator_rule( assertion );
    if( NIL != rr )
    {
      return add_reformulator_rule( rr, lock );
    }
    reformulator_hub.ref_warn( THREE_INTEGER, $str78$Found_an_ill_formed_reformulation, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 12601L)
  public static SubLObject add_reformulator_precondition_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject rule_assertion = precondition_assertion_rule_assertion_arg( assertion );
    final SubLObject rr = reformulator_datastructures.find_reformulator_rule_for_rule_assertion( rule_assertion );
    final SubLObject precondition_struct = reformulation_precondition_struct( assertion );
    if( NIL != rr )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
        _csetf_refr_preconditions( rr, ConsesLow.cons( precondition_struct, refr_preconditions( rr ) ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
        }
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 13147L)
  public static SubLObject add_reformulation_direction_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject direction = direction_in_mode_assertion_direction_arg( assertion );
    final SubLObject mode = direction_in_mode_assertion_mode_arg( assertion );
    final SubLObject rule_assertion = direction_in_mode_assertion_rule_assertion_arg( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject rr = reformulator_datastructures.find_reformulator_rule_for_rule_assertion( rule_assertion );
    final SubLObject direction_struct = construct_reformulation_direction_struct( direction, mt );
    if( NIL != rr )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
        _csetf_refr_directions( rr, add_direction_struct_for_mode( mode, direction_struct, refr_directions( rr ) ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
        }
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 13910L)
  public static SubLObject add_reformulator_rule_property_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject property = reformulator_rule_property_assertion_property_arg( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject property_struct = construct_rule_property_struct( property, mt );
    final SubLObject rule_assertion = reformulator_rule_property_assertion_rule_assertion_arg( assertion );
    final SubLObject rr = reformulator_datastructures.find_reformulator_rule_for_rule_assertion( rule_assertion );
    if( NIL != rr )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
        _csetf_refr_properties( rr, reformulator_datastructures.add_reformulator_info( property_struct, refr_properties( rr ) ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
        }
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 14607L)
  public static SubLObject remove_reformulator_rule_assertion(final SubLObject assertion)
  {
    final SubLObject rr = reformulator_datastructures.find_reformulator_rule_for_rule_assertion( assertion );
    if( NIL != rr )
    {
      return remove_reformulator_rule( rr );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 14995L)
  public static SubLObject remove_reformulator_precondition_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject rule_assertion = precondition_assertion_rule_assertion_arg( assertion );
    final SubLObject rr = reformulator_datastructures.find_reformulator_rule_for_rule_assertion( rule_assertion );
    final SubLObject precondition_struct = reformulation_precondition_struct( assertion );
    if( NIL != rr )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
        _csetf_refr_preconditions( rr, Sequences.delete( precondition_struct, refr_preconditions( rr ), Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
        }
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 15590L)
  public static SubLObject remove_reformulation_direction_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject direction = direction_in_mode_assertion_direction_arg( assertion );
    final SubLObject mode = direction_in_mode_assertion_mode_arg( assertion );
    final SubLObject rule_assertion = direction_in_mode_assertion_rule_assertion_arg( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject rr = reformulator_datastructures.find_reformulator_rule_for_rule_assertion( rule_assertion );
    final SubLObject direction_struct = construct_reformulation_direction_struct( direction, mt );
    if( NIL != rr )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
        _csetf_refr_directions( rr, remove_direction_struct_for_mode( mode, direction_struct, refr_directions( rr ) ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
        }
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 16364L)
  public static SubLObject remove_reformulator_rule_property_assertion(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject property = reformulator_rule_property_assertion_property_arg( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject property_struct = construct_rule_property_struct( property, mt );
    final SubLObject rule_assertion = reformulator_rule_property_assertion_rule_assertion_arg( assertion );
    final SubLObject rr = reformulator_datastructures.find_reformulator_rule_for_rule_assertion( rule_assertion );
    if( NIL != rr )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
        _csetf_refr_properties( rr, reformulator_datastructures.remove_reformulator_info( property_struct, refr_properties( rr ) ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
        }
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 17071L)
  public static SubLObject add_reformulator_rule(final SubLObject rr, SubLObject lock)
  {
    if( lock == UNPROVIDED )
    {
      lock = NIL;
    }
    final SubLObject assertion = reformulator_rule_assertion( rr );
    final SubLObject first_rt = reformulator_rule_first_rt( rr );
    final SubLObject second_rt = reformulator_rule_second_rt( rr );
    final SubLObject first_rt_expr = reformulator_template_expression( first_rt );
    final SubLObject second_rt_expr = reformulator_template_expression( second_rt );
    final SubLObject first_rt_forts = reformulator_template_forts( first_rt );
    final SubLObject second_rt_forts = reformulator_template_forts( second_rt );
    SubLObject indexed_first_rtP = NIL;
    SubLObject indexed_second_rtP = NIL;
    if( NIL != lock )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        Hashtables.sethash( assertion, $reformulator_rules$.getGlobalValue(), rr );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
    }
    else
    {
      Hashtables.sethash( assertion, $reformulator_rules$.getGlobalValue(), rr );
    }
    indexed_first_rtP = index_reformulator_template_expression_if_possible( first_rt_expr, assertion, lock );
    indexed_second_rtP = index_reformulator_template_expression_if_possible( second_rt_expr, assertion, lock );
    if( NIL == indexed_first_rtP || NIL == indexed_second_rtP )
    {
      SubLObject v_forts = NIL;
      if( NIL != indexed_first_rtP )
      {
        v_forts = second_rt_forts;
      }
      else if( NIL != indexed_second_rtP )
      {
        v_forts = first_rt_forts;
      }
      else
      {
        v_forts = ConsesLow.append( first_rt_forts, second_rt_forts );
      }
      SubLObject cdolist_list_var = v_forts;
      SubLObject fort = NIL;
      fort = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != lock )
        {
          SubLObject release2 = NIL;
          try
          {
            release2 = Locks.seize_lock( lock );
            hash_table_utilities.push_hash( fort, assertion, $fort_reformulator_rule_table$.getGlobalValue() );
          }
          finally
          {
            if( NIL != release2 )
            {
              Locks.release_lock( lock );
            }
          }
        }
        else
        {
          hash_table_utilities.push_hash( fort, assertion, $fort_reformulator_rule_table$.getGlobalValue() );
        }
        cdolist_list_var = cdolist_list_var.rest();
        fort = cdolist_list_var.first();
      }
      if( NIL == first_rt_forts || NIL == second_rt_forts )
      {
        $unassociated_reformulator_rules$.setGlobalValue( ConsesLow.cons( rr, $unassociated_reformulator_rules$.getGlobalValue() ) );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 19198L)
  public static SubLObject index_reformulator_template_expression_if_possible(final SubLObject rt_expr, final SubLObject assertion, final SubLObject lock)
  {
    SubLObject indexedP = NIL;
    if( NIL != constant_handles.constant_p( rt_expr ) )
    {
      if( NIL != lock )
      {
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( lock );
          hash_table_utilities.push_hash( rt_expr, assertion, $constant_reformulator_rule_table$.getGlobalValue() );
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( lock );
          }
        }
      }
      else
      {
        hash_table_utilities.push_hash( rt_expr, assertion, $constant_reformulator_rule_table$.getGlobalValue() );
      }
      indexedP = T;
    }
    else if( NIL != nart_handles.nart_p( rt_expr ) )
    {
      if( NIL != lock )
      {
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( lock );
          hash_table_utilities.push_hash( rt_expr, assertion, $nart_reformulator_rule_table$.getGlobalValue() );
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( lock );
          }
        }
      }
      else
      {
        hash_table_utilities.push_hash( rt_expr, assertion, $nart_reformulator_rule_table$.getGlobalValue() );
      }
      indexedP = T;
    }
    return indexedP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 19790L)
  public static SubLObject remove_reformulator_rule(final SubLObject rr)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject assertion = reformulator_rule_assertion( rr );
    final SubLObject first_rt_expr = reformulator_template_expression( reformulator_rule_first_rt( rr ) );
    final SubLObject second_rt_expr = reformulator_template_expression( reformulator_rule_second_rt( rr ) );
    final SubLObject rr_forts = reformulator_rule_forts( rr );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
      Hashtables.remhash( assertion, $reformulator_rules$.getGlobalValue() );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
      }
    }
    unindex_reformulator_template_expression_if_possible( first_rt_expr, assertion );
    unindex_reformulator_template_expression_if_possible( second_rt_expr, assertion );
    SubLObject cdolist_list_var = rr_forts;
    SubLObject fort = NIL;
    fort = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject release_$1 = NIL;
      try
      {
        release_$1 = Locks.seize_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
        hash_table_utilities.prune_hash( fort, assertion, $fort_reformulator_rule_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        if( NIL != release_$1 )
        {
          Locks.release_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      fort = cdolist_list_var.first();
    }
    SubLObject release_$2 = NIL;
    try
    {
      release_$2 = Locks.seize_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
      $unassociated_reformulator_rules$.setGlobalValue( Sequences.delete( rr, $unassociated_reformulator_rules$.getGlobalValue(), Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      if( NIL != release_$2 )
      {
        Locks.release_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 20768L)
  public static SubLObject unindex_reformulator_template_expression_if_possible(final SubLObject rt_expr, final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != constant_handles.constant_p( rt_expr ) )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
        hash_table_utilities.prune_hash( rt_expr, assertion, $constant_reformulator_rule_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
        }
      }
    }
    else if( NIL != nart_handles.nart_p( rt_expr ) )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
        hash_table_utilities.prune_hash( rt_expr, assertion, $nart_reformulator_rule_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 21249L)
  public static SubLObject reformulator_rule_forts(final SubLObject rr)
  {
    return conses_high.union( reformulator_template_forts( reformulator_rule_first_rt( rr ) ), reformulator_template_forts( reformulator_rule_second_rt( rr ) ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 21447L)
  public static SubLObject initialize_reformulator_rules()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result_num = ZERO_INTEGER;
    SubLObject all_rule_assertions = NIL;
    SubLObject total_num = NIL;
    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym79$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const80$EverythingPSC, thread );
      all_rule_assertions = Mapping.mapcan( $sym81$GATHER_PREDICATE_EXTENT_INDEX, reformulator_datastructures.reformulator_rule_predicates(), EMPTY_SUBL_OBJECT_ARRAY );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    total_num = Sequences.length( all_rule_assertions );
    $reformulator_rules$.setGlobalValue( Hashtables.make_hash_table( total_num, Symbols.symbol_function( EQL ), UNPROVIDED ) );
    $fort_reformulator_rule_table$.setGlobalValue( Hashtables.make_hash_table( Numbers.multiply( TWO_INTEGER, total_num ), Symbols.symbol_function( EQL ), UNPROVIDED ) );
    $constant_reformulator_rule_table$.setGlobalValue( Hashtables.make_hash_table( Numbers.integerDivide( total_num, FOUR_INTEGER ), Symbols.symbol_function( EQL ), UNPROVIDED ) );
    $nart_reformulator_rule_table$.setGlobalValue( Hashtables.make_hash_table( Numbers.integerDivide( total_num, FOUR_INTEGER ), Symbols.symbol_function( EQL ), UNPROVIDED ) );
    $unassociated_reformulator_rules$.setGlobalValue( NIL );
    _prev_bind_0 = wff_vars.$wff_memoization_state$.currentBinding( thread );
    try
    {
      wff_vars.$wff_memoization_state$.bind( wff_macros.possibly_new_wff_memoization_state(), thread );
      final SubLObject local_state = wff_vars.$wff_memoization_state$.getDynamicValue( thread );
      final SubLObject _prev_bind_0_$3 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          if( NIL == wff_macros.within_wffP() )
          {
            wff.reset_wff_state();
          }
          final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$4 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
          final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_resource_limit( already_resourcing_p, TWELVE_INTEGER ), thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_marking_vars.possibly_new_marking_resource( already_resourcing_p ), thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( $str82$Initializing_Reformulator_Rules );
              SubLObject release = NIL;
              try
              {
                release = Locks.seize_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
                SubLObject cdolist_list_var = all_rule_assertions;
                SubLObject ass = NIL;
                ass = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  if( NIL != assertions_high.code_assertionP( ass ) || NIL != add_reformulator_rule_assertion( ass, UNPROVIDED ) )
                  {
                    result_num = Numbers.add( result_num, ONE_INTEGER );
                    utilities_macros.note_percent_progress( result_num, total_num );
                  }
                  cdolist_list_var = cdolist_list_var.rest();
                  ass = cdolist_list_var.first();
                }
              }
              finally
              {
                if( NIL != release )
                {
                  Locks.release_lock( reformulator_datastructures.$reformulator_lock$.getDynamicValue( thread ) );
                }
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_4, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_3, thread );
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_0_$4, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$3, thread );
      }
    }
    finally
    {
      wff_vars.$wff_memoization_state$.rebind( _prev_bind_0, thread );
    }
    return result_num;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 22920L)
  public static SubLObject expected_reformulator_rule_count()
  {
    SubLObject count = ZERO_INTEGER;
    SubLObject cdolist_list_var = reformulator_datastructures.reformulator_rule_predicates();
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      count = Numbers.add( count, kb_indexing.num_predicate_extent_index( pred, UNPROVIDED ) );
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 23118L)
  public static SubLObject reformulation_assertion_to_reformulator_rule(final SubLObject assertion)
  {
    if( NIL != expansion_ruleP( assertion ) )
    {
      return expansion_rule_to_reformulator_rule( assertion );
    }
    if( NIL != rewrite_ruleP( assertion ) )
    {
      return rewrite_rule_to_reformulator_rule( assertion );
    }
    if( NIL != cycl_reformulation_ruleP( assertion ) )
    {
      return reformulation_rule_to_reformulator_rule( assertion );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 23650L)
  public static SubLObject expansion_rule_to_reformulator_rule(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject rule_pred = assertions_high.gaf_arg0( assertion );
    final SubLObject relation = assertions_high.gaf_arg1( assertion );
    final SubLObject mt = assertions_high.assertion_mt( assertion );
    final SubLObject raw_expanded_expr = assertions_high.gaf_arg2( assertion );
    if( NIL != cycl_utilities.expression_find_if( $sym83$DEFAULT_EL_VAR_, raw_expanded_expr, UNPROVIDED, UNPROVIDED ) )
    {
      reformulator_hub.ref_warn( ONE_INTEGER, $str84$expansion_rule__s_contains_a_defa, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    final SubLObject expanded_expr = cycl_utilities.expression_transform( raw_expanded_expr, $sym85$GENERIC_ARG_P, $sym86$GENERIC_ARG_TO_DEFAULT_EL_VAR, UNPROVIDED, UNPROVIDED );
    final SubLObject highest_generic_arg = tersifier.highest_generic_arg_num( raw_expanded_expr );
    final SubLObject concise_expr = el_utilities.make_el_formula( relation, Mapping.mapcar( $sym87$FIND_DEFAULT_EL_VAR_BY_ID, list_utilities.numlist( highest_generic_arg, ONE_INTEGER ) ), UNPROVIDED );
    final SubLObject shared_vars = el_utilities.expression_shared_free_variables( expanded_expr, concise_expr, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject expanded_rt = new_reformulator_template( assertion, expanded_expr, mt, rule_pred, shared_vars );
    final SubLObject first_wff_degree = thread.secondMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject concise_rt = new_reformulator_template( assertion, concise_expr, mt, rule_pred, shared_vars );
    final SubLObject second_wff_degree = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject rule_wff_degree = compute_wff_degree_for_reformulator_rule( ConsesLow.list( first_wff_degree, second_wff_degree ) );
    final SubLObject rr = ( NIL != el_relation_expansion_assertionP( assertion ) ) ? new_reformulator_rule( expanded_rt, concise_rt, mt, assertion, rule_wff_degree )
        : new_reformulator_rule( concise_rt, expanded_rt, mt, assertion, rule_wff_degree );
    return rr;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 25193L)
  public static SubLObject rewrite_rule_to_reformulator_rule(final SubLObject assertion)
  {
    return reformulation_rule_to_reformulator_rule( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 25417L)
  public static SubLObject reformulation_rule_to_reformulator_rule(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject rule_pred = assertions_high.gaf_arg0( assertion );
    final SubLObject first_expr = assertions_high.gaf_arg1( assertion );
    final SubLObject second_expr = assertions_high.gaf_arg2( assertion );
    if( NIL != first_expr && NIL != second_expr )
    {
      final SubLObject mt = assertions_high.assertion_mt( assertion );
      final SubLObject shared_vars = el_utilities.expression_shared_free_variables( first_expr, second_expr, UNPROVIDED );
      thread.resetMultipleValues();
      final SubLObject first_rt = new_reformulator_template( assertion, first_expr, mt, rule_pred, shared_vars );
      final SubLObject first_wff_degree = thread.secondMultipleValue();
      thread.resetMultipleValues();
      thread.resetMultipleValues();
      final SubLObject second_rt = new_reformulator_template( assertion, second_expr, mt, rule_pred, shared_vars );
      final SubLObject second_wff_degree = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return new_reformulator_rule( first_rt, second_rt, mt, assertion, compute_wff_degree_for_reformulator_rule( ConsesLow.list( first_wff_degree, second_wff_degree ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 26338L)
  public static SubLObject new_reformulator_rule(final SubLObject first_rt, final SubLObject second_rt, final SubLObject mt, final SubLObject assertion, final SubLObject wff_degree)
  {
    if( NIL == first_rt || NIL == second_rt || NIL == assertions_high.valid_assertion( assertion, UNPROVIDED ) )
    {
      return NIL;
    }
    assert NIL != reformulator_template_p( first_rt ) : first_rt;
    assert NIL != reformulator_template_p( second_rt ) : second_rt;
    assert NIL != hlmt.chlmt_p( mt ) : mt;
    if( first_rt.equalp( second_rt ) )
    {
      reformulator_hub.ref_warn( THREE_INTEGER, $str89$Found_a_reformulator_rule_that_wo, reformulator_template_expression( first_rt ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    final SubLObject rr = make_reformulator_rule( UNPROVIDED );
    final SubLObject fortified_mt = cycl_utilities.reify_when_closed_naut( mt );
    final SubLObject rr_rule_pred = assertions_high.gaf_arg0( assertion );
    final SubLObject rr_preconditions = reformulation_precondition_assertions( assertion );
    final SubLObject rr_directions = gather_reformulator_rule_directions( assertion );
    final SubLObject rr_properties = gather_reformulator_rule_properties( assertion );
    _csetf_refr_first_rt( rr, first_rt );
    _csetf_refr_second_rt( rr, second_rt );
    _csetf_refr_mt( rr, fortified_mt );
    _csetf_refr_wff_degree( rr, wff_degree );
    _csetf_refr_directions( rr, rr_directions );
    _csetf_refr_assertion( rr, assertion );
    _csetf_refr_rule_pred( rr, rr_rule_pred );
    _csetf_refr_preconditions( rr, rr_preconditions );
    _csetf_refr_properties( rr, rr_properties );
    return rr;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 27834L)
  public static SubLObject new_reformulator_template(final SubLObject assertion, final SubLObject expression, final SubLObject mt, final SubLObject rule_pred, final SubLObject shared_vars)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject errorP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym79$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const80$EverythingPSC, thread );
      if( NIL == collection_defns.cycl_expressionP( expression ) )
      {
        Errors.warn( $str90$Encountered__A_which_is_not_a_CYC, expression, assertion );
        errorP = T;
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    if( NIL != errorP )
    {
      return NIL;
    }
    assert NIL != hlmt.chlmt_p( mt ) : mt;
    final SubLObject rt = make_reformulator_template( UNPROVIDED );
    final SubLObject fortified_mt = cycl_utilities.reify_when_closed_naut( mt );
    _csetf_rt_expression( rt, expression );
    _csetf_rt_mt( rt, fortified_mt );
    return canonicalize_reformulator_template( rt, rule_pred, shared_vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 29076L)
  public static SubLObject canonicalize_reformulator_template(final SubLObject rt, final SubLObject rule_pred, final SubLObject shared_vars)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject canon_expression = reformulator_hub.canonicalize_reformulator_expression( reformulator_template_expression( rt ), reformulator_template_mt( rt ), T, NIL, rule_pred );
    final SubLObject wff_degree = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == canon_expression )
    {
      return NIL;
    }
    thread.resetMultipleValues();
    final SubLObject hl_var_expr = reformulator_transform_shared_el_vars_to_hl_vars( canon_expression, shared_vars );
    final SubLObject shared_var_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    _csetf_rt_expression( rt, hl_var_expr );
    _csetf_rt_shared_var_bindings( rt, shared_var_bindings );
    _csetf_rt_forts( rt, reformulator_relevant_forts( canon_expression ) );
    return Values.values( rt, wff_degree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 30047L)
  public static SubLObject compute_wff_degree_for_reformulator_rule(final SubLObject wff_degrees)
  {
    SubLObject result = NIL;
    if( NIL != conses_high.member( $kw91$NONE, wff_degrees, UNPROVIDED, UNPROVIDED ) )
    {
      result = $kw91$NONE;
    }
    else if( NIL != conses_high.member( $kw92$KB, wff_degrees, UNPROVIDED, UNPROVIDED ) )
    {
      result = $kw92$KB;
    }
    else if( NIL != conses_high.member( $kw93$ARITY, wff_degrees, UNPROVIDED, UNPROVIDED ) )
    {
      result = $kw93$ARITY;
    }
    else if( NIL != conses_high.member( $kw94$ALL, wff_degrees, UNPROVIDED, UNPROVIDED ) )
    {
      result = $kw94$ALL;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 30911L)
  public static SubLObject with_reformulator_variable_variables(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list95 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject shared_vars = NIL;
    SubLObject expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list95 );
    shared_vars = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list95 );
    expression = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject highest_var_num = $sym96$HIGHEST_VAR_NUM;
      return ConsesLow.listS( $sym97$CLET, ConsesLow.list( ConsesLow.list( $sym98$_REFORMULATOR_SHARED_VARS_, shared_vars ), $list99, ConsesLow.list( highest_var_num, ConsesLow.list( $sym100$SAFE_MAX, ConsesLow.list(
          $sym101$MAPCAR, $list102, ConsesLow.listS( $sym103$EXPRESSION_GATHER, expression, $list104 ) ) ) ), ConsesLow.list( $sym105$_REFORMULATOR_NEXT_AVAILABLE_HL_VAR_NUM_, highest_var_num ) ), ConsesLow.append( body,
              NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list95 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 31329L)
  public static SubLObject reformulator_transform_shared_el_vars_to_hl_vars(final SubLObject expression, final SubLObject shared_vars)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject v_bindings = NIL;
    final SubLObject _prev_bind_0 = $reformulator_shared_vars$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $reformulator_shared_var_bindings$.currentBinding( thread );
    try
    {
      $reformulator_shared_vars$.bind( shared_vars, thread );
      $reformulator_shared_var_bindings$.bind( NIL, thread );
      final SubLObject highest_var_num = list_utilities.safe_max( Mapping.mapcar( $sym106$VARIABLE_ID, cycl_utilities.expression_gather( expression, Symbols.symbol_function( $sym107$VARIABLE_P ), NIL, UNPROVIDED,
          UNPROVIDED, UNPROVIDED ) ), UNPROVIDED );
      final SubLObject _prev_bind_0_$7 = $reformulator_next_available_hl_var_num$.currentBinding( thread );
      try
      {
        $reformulator_next_available_hl_var_num$.bind( highest_var_num, thread );
        result = cycl_utilities.expression_transform( expression, $sym108$REFORMULATOR_SHARED_EL_VAR_OR_DONT_CARE_VAR_, $sym109$REFORMULATOR_APPROPRIATE_HL_VAR, T, UNPROVIDED );
        v_bindings = $reformulator_shared_var_bindings$.getDynamicValue( thread );
      }
      finally
      {
        $reformulator_next_available_hl_var_num$.rebind( _prev_bind_0_$7, thread );
      }
    }
    finally
    {
      $reformulator_shared_var_bindings$.rebind( _prev_bind_2, thread );
      $reformulator_shared_vars$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result, v_bindings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 31747L)
  public static SubLObject reformulator_shared_el_varP(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return subl_promotions.memberP( v_object, $reformulator_shared_vars$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 32000L)
  public static SubLObject reformulator_shared_el_var_or_dont_care_varP(final SubLObject v_object)
  {
    return makeBoolean( NIL != reformulator_shared_el_varP( v_object ) || NIL != cycl_variables.dont_care_varP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 32152L)
  public static SubLObject reformulator_appropriate_hl_var(final SubLObject el_var)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject binding = conses_high.assoc( el_var, $reformulator_shared_var_bindings$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
    if( NIL != binding )
    {
      return binding.rest();
    }
    final SubLObject id = $reformulator_next_available_hl_var_num$.getDynamicValue( thread );
    final SubLObject hl_var = variables.find_variable_by_id( id );
    $reformulator_next_available_hl_var_num$.setDynamicValue( Numbers.add( $reformulator_next_available_hl_var_num$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    $reformulator_shared_var_bindings$.setDynamicValue( ConsesLow.cons( ConsesLow.cons( el_var, hl_var ), $reformulator_shared_var_bindings$.getDynamicValue( thread ) ), thread );
    return hl_var;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 32552L)
  public static SubLObject reformulator_dwim_skolem(final SubLObject skolem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject new_skolem = conses_high.copy_tree( skolem );
    final SubLObject doomed_skolem_cons = new_skolem.rest();
    final SubLObject replacement_var = variables.find_variable_by_id( $reformulator_next_available_hl_var_num$.getDynamicValue( thread ) );
    note_reformulator_skolem_dwimming( doomed_skolem_cons.first(), replacement_var );
    ConsesLow.rplaca( doomed_skolem_cons, replacement_var );
    $reformulator_next_available_hl_var_num$.setDynamicValue( Numbers.add( $reformulator_next_available_hl_var_num$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    return new_skolem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 33276L)
  public static SubLObject reformulator_dwim_skolems(final SubLObject expression)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != cycl_utilities.expression_find_if( $sym110$UNREIFIED_SKOLEM_TERM_, expression, UNPROVIDED, UNPROVIDED ) )
    {
      SubLObject result = NIL;
      final SubLObject _prev_bind_0 = $reformulator_shared_vars$.currentBinding( thread );
      final SubLObject _prev_bind_2 = $reformulator_shared_var_bindings$.currentBinding( thread );
      try
      {
        $reformulator_shared_vars$.bind( NIL, thread );
        $reformulator_shared_var_bindings$.bind( NIL, thread );
        final SubLObject highest_var_num = list_utilities.safe_max( Mapping.mapcar( $sym106$VARIABLE_ID, cycl_utilities.expression_gather( expression, Symbols.symbol_function( $sym107$VARIABLE_P ), NIL, UNPROVIDED,
            UNPROVIDED, UNPROVIDED ) ), UNPROVIDED );
        final SubLObject _prev_bind_0_$8 = $reformulator_next_available_hl_var_num$.currentBinding( thread );
        try
        {
          $reformulator_next_available_hl_var_num$.bind( highest_var_num, thread );
          result = transform_list_utilities.transform( expression, $sym110$UNREIFIED_SKOLEM_TERM_, $sym111$REFORMULATOR_DWIM_SKOLEM, UNPROVIDED );
        }
        finally
        {
          $reformulator_next_available_hl_var_num$.rebind( _prev_bind_0_$8, thread );
        }
      }
      finally
      {
        $reformulator_shared_var_bindings$.rebind( _prev_bind_2, thread );
        $reformulator_shared_vars$.rebind( _prev_bind_0, thread );
      }
      return result;
    }
    return expression;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 33679L)
  public static SubLObject reformulator_undwim_skolems(final SubLObject expression)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return conses_high.nsublis( $reformulator_skolem_dwimming_space$.getDynamicValue( thread ), expression, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 33874L)
  public static SubLObject note_reformulator_skolem_dwimming(final SubLObject sane, final SubLObject crazy)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject future_crazy = ( NIL != cycl_grammar.hl_variable_p( crazy ) && variables.variable_id( crazy ).numL( $int112$100 ) ) ? variables.get_variable( Numbers.add( variables.variable_id( crazy ),
        $int112$100 ) ) : crazy;
    $reformulator_skolem_dwimming_space$.setDynamicValue( ConsesLow.cons( ConsesLow.cons( future_crazy, sane ), $reformulator_skolem_dwimming_space$.getDynamicValue( thread ) ), thread );
    return $reformulator_skolem_dwimming_space$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 34284L)
  public static SubLObject rru_clean_up_skolem_function_fns(SubLObject target_expr)
  {
    SubLObject cdolist_list_var = list_utilities.tree_find_all_if( $sym113$REFORMULATOR_SKOLEM_FUNCTION_FN_TO_CLEAN_UP_, target_expr, UNPROVIDED );
    SubLObject dirty_skolem_function_fn_expression = NIL;
    dirty_skolem_function_fn_expression = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      target_expr = list_utilities.tree_substitute( target_expr, dirty_skolem_function_fn_expression, reformulator_skolem_function_fn_clean( dirty_skolem_function_fn_expression ) );
      cdolist_list_var = cdolist_list_var.rest();
      dirty_skolem_function_fn_expression = cdolist_list_var.first();
    }
    return target_expr;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 35036L)
  public static SubLObject reformulator_skolem_function_fn_to_clean_upP(final SubLObject expression)
  {
    return makeBoolean( $const114$SkolemFunctionFn.eql( cycl_utilities.formula_arg0( expression ) ) && NIL != list_utilities.find_if_not( $sym115$EL_VARIABLE_, cycl_utilities.formula_arg1( expression, UNPROVIDED ),
        UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 35238L)
  public static SubLObject reformulator_skolem_function_fn_clean(final SubLObject expression)
  {
    if( $const114$SkolemFunctionFn.eql( cycl_utilities.formula_arg0( expression ) ) )
    {
      return el_utilities.make_ternary_formula( $const114$SkolemFunctionFn, list_utilities.remove_if_not( $sym115$EL_VARIABLE_, cycl_utilities.formula_arg1( expression, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED ), cycl_utilities.formula_arg2( expression, UNPROVIDED ), cycl_utilities.formula_arg3( expression, UNPROVIDED ) );
    }
    return expression;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 35572L)
  public static SubLObject reformulation_precondition_assertions(final SubLObject rule_assertion)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = assertions_low.assertion_index( rule_assertion );
    SubLObject meta_ass = NIL;
    meta_ass = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertion_utilities.gaf_assertion_with_pred_p( meta_ass, $const116$reformulationPrecondition ) && NIL == assertions_high.code_assertionP( meta_ass ) )
      {
        result = ConsesLow.cons( reformulation_precondition_struct( meta_ass ), result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      meta_ass = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 36514L)
  public static SubLObject reformulation_precondition_struct(final SubLObject precondition_ass)
  {
    final SubLObject direction = precondition_assertion_direction_arg( precondition_ass );
    final SubLObject precondition = precondition_assertion_precondition_arg( precondition_ass );
    final SubLObject mt = assertions_high.assertion_mt( precondition_ass );
    return ConsesLow.list( direction, precondition, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 36929L)
  public static SubLObject precondition_assertion_direction_arg(final SubLObject assertion)
  {
    return assertions_high.gaf_arg1( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 37026L)
  public static SubLObject precondition_assertion_precondition_arg(final SubLObject assertion)
  {
    return assertions_high.gaf_arg2( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 37125L)
  public static SubLObject precondition_assertion_rule_assertion_arg(final SubLObject assertion)
  {
    return assertions_high.gaf_arg3( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 37226L)
  public static SubLObject gather_reformulator_rule_directions(final SubLObject rule_assertion)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = assertions_low.assertion_index( rule_assertion );
    SubLObject meta_ass = NIL;
    meta_ass = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertion_utilities.gaf_assertion_with_pred_p( meta_ass, $const117$reformulationDirectionInMode ) && NIL == assertions_high.code_assertionP( meta_ass ) )
      {
        final SubLObject direction = direction_in_mode_assertion_direction_arg( meta_ass );
        final SubLObject mode = direction_in_mode_assertion_mode_arg( meta_ass );
        final SubLObject mt = assertions_high.assertion_mt( meta_ass );
        final SubLObject direction_struct = construct_reformulation_direction_struct( direction, mt );
        result = add_direction_struct_for_mode( mode, direction_struct, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      meta_ass = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 38712L)
  public static SubLObject add_direction_struct_for_mode(final SubLObject mode, final SubLObject direction_struct, SubLObject current_direction_list)
  {
    SubLObject current_pairs = directions_for_mode( mode, current_direction_list );
    current_pairs = reformulator_datastructures.add_reformulator_info( direction_struct, current_pairs );
    current_direction_list = substitute_directions_for_mode( mode, current_pairs, current_direction_list );
    return current_direction_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 39205L)
  public static SubLObject remove_direction_struct_for_mode(final SubLObject mode, final SubLObject direction_struct, SubLObject current_direction_list)
  {
    SubLObject current_pairs = directions_for_mode( mode, current_direction_list );
    if( NIL != current_pairs )
    {
      current_pairs = reformulator_datastructures.remove_reformulator_info( direction_struct, current_pairs );
      current_direction_list = substitute_directions_for_mode( mode, current_pairs, current_direction_list );
    }
    return current_direction_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 39740L)
  public static SubLObject directions_for_mode(final SubLObject mode, final SubLObject directions)
  {
    return conses_high.getf( directions, mode, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 39830L)
  public static SubLObject substitute_directions_for_mode(final SubLObject mode, final SubLObject new_directions_for_mode, final SubLObject direction_list)
  {
    return conses_high.putf( conses_high.remf( direction_list, mode ), mode, new_directions_for_mode );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 40086L)
  public static SubLObject construct_reformulation_direction_struct(final SubLObject direction, final SubLObject mt)
  {
    return ConsesLow.list( direction, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 40191L)
  public static SubLObject direction_in_mode_assertion_direction_arg(final SubLObject assertion)
  {
    return assertions_high.gaf_arg1( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 40292L)
  public static SubLObject direction_in_mode_assertion_mode_arg(final SubLObject assertion)
  {
    return assertions_high.gaf_arg2( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 40388L)
  public static SubLObject direction_in_mode_assertion_rule_assertion_arg(final SubLObject assertion)
  {
    return assertions_high.gaf_arg3( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 40494L)
  public static SubLObject gather_reformulator_rule_properties(final SubLObject rule_assertion)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = assertions_low.assertion_index( rule_assertion );
    SubLObject meta_ass = NIL;
    meta_ass = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != assertion_utilities.gaf_assertion_with_pred_p( meta_ass, $const118$reformulatorRuleProperties ) && NIL == assertions_high.code_assertionP( meta_ass ) )
      {
        final SubLObject property = reformulator_rule_property_assertion_property_arg( meta_ass );
        final SubLObject mt = assertions_high.assertion_mt( meta_ass );
        final SubLObject property_struct = construct_rule_property_struct( property, mt );
        result = reformulator_datastructures.add_reformulator_info( property_struct, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      meta_ass = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 41827L)
  public static SubLObject construct_rule_property_struct(final SubLObject property, final SubLObject mt)
  {
    return ConsesLow.list( property, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 41919L)
  public static SubLObject reformulator_rule_property_assertion_property_arg(final SubLObject assertion)
  {
    return assertions_high.gaf_arg1( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 42029L)
  public static SubLObject reformulator_rule_property_assertion_rule_assertion_arg(final SubLObject assertion)
  {
    return assertions_high.gaf_arg2( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 42146L)
  public static SubLObject kb_reformulator_relevant_assertion_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject total = ZERO_INTEGER;
    SubLObject cdolist_list_var = reformulator_datastructures.reformulator_relevant_predicates();
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym79$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const80$EverythingPSC, thread );
        total = Numbers.add( total, kb_indexing.num_predicate_extent_index( pred, UNPROVIDED ) );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 42512L)
  public static SubLObject kb_reformulator_rule_assertion_count()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject total = ZERO_INTEGER;
    SubLObject cdolist_list_var = reformulator_datastructures.reformulator_rule_predicates();
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym79$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const80$EverythingPSC, thread );
        total = Numbers.add( total, kb_indexing.num_predicate_extent_index( pred, UNPROVIDED ) );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 42729L)
  public static SubLObject reformulator_relevant_fortP(final SubLObject fort)
  {
    return makeBoolean( NIL == subl_promotions.memberP( fort, reformulator_datastructures.reformulator_irrelevant_forts(), UNPROVIDED, UNPROVIDED ) && NIL == el_utilities.cyc_const_logical_operator_p( fort )
        && NIL == el_utilities.cyc_const_quantifier_p( fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 42925L)
  public static SubLObject reformulator_relevant_forts(final SubLObject expression)
  {
    return kb_utilities.sort_forts( list_utilities.delete_if_not( $sym119$REFORMULATOR_RELEVANT_FORT_, cycl_utilities.expression_constants( expression, T ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 43213L)
  public static SubLObject reformulator_highly_relevant_fortP(final SubLObject fort, final SubLObject mt)
  {
    return isa.isaP( fort, $const120$ReformulatorHighlyRelevantFORT, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 43333L)
  public static SubLObject expansion_ruleP(final SubLObject assertion)
  {
    return assertion_utilities.gaf_assertion_with_pred_p( assertion, $const121$expansion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 43438L)
  public static SubLObject rewrite_ruleP(final SubLObject assertion)
  {
    return assertion_utilities.gaf_assertion_with_pred_p( assertion, $const122$rewriteOf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 43541L)
  public static SubLObject cycl_reformulation_ruleP(final SubLObject assertion)
  {
    return assertion_utilities.gaf_assertion_with_any_of_preds_p( assertion, reformulator_datastructures.reformulator_rule_spec_preds() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 43682L)
  public static SubLObject generic_arg_to_default_el_var(final SubLObject generic_arg)
  {
    return variables.default_el_var_for_hl_var( tersifier.generic_arg_to_hl_var( generic_arg ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 43816L)
  public static SubLObject find_default_el_var_by_id(final SubLObject id)
  {
    return variables.default_el_var_for_hl_var( variables.find_variable_by_id( id ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 43926L)
  public static SubLObject el_relation_expansion_assertionP(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertions_high.gaf_assertionP( assertion ) && $const121$expansion.eql( assertions_high.gaf_arg0( assertion ) ) && NIL != isa.isaP( assertions_high.gaf_arg1( assertion ),
        $const123$ELRelation, assertions_high.assertion_mt( assertion ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 44238L)
  public static SubLObject rebuild_reformulator_rules()
  {
    reformulator_datastructures.initialize_reformulator();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 44368L)
  public static SubLObject dump_reformulator_rules_to_stream(final SubLObject stream)
  {
    cfasl.cfasl_output( ONE_INTEGER, stream );
    cfasl.cfasl_output( reformulator_datastructures.reformulator_rule_count(), stream );
    final SubLObject cdohash_table = reformulator_rules();
    SubLObject key = NIL;
    SubLObject rr = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        rr = Hashtables.getEntryValue( cdohash_entry );
        output_reformulator_rule_to_stream( rr, stream );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    cfasl.cfasl_output( $fort_reformulator_rule_table$.getGlobalValue(), stream );
    cfasl.cfasl_output( $constant_reformulator_rule_table$.getGlobalValue(), stream );
    cfasl.cfasl_output( $nart_reformulator_rule_table$.getGlobalValue(), stream );
    cfasl.cfasl_output( reformulator_datastructures.unassociated_reformulator_rule_count(), stream );
    SubLObject cdolist_list_var = unassociated_reformulator_rules();
    SubLObject rr2 = NIL;
    rr2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != Hashtables.gethash_without_values( refr_assertion( rr2 ), $reformulator_rules$.getGlobalValue(), UNPROVIDED ) )
      {
        cfasl.cfasl_output( refr_assertion( rr2 ), stream );
      }
      else
      {
        output_reformulator_rule_to_stream( rr2, stream );
      }
      cdolist_list_var = cdolist_list_var.rest();
      rr2 = cdolist_list_var.first();
    }
    cfasl.cfasl_output( NIL, stream );
    cfasl.cfasl_output( NIL, stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 45391L)
  public static SubLObject load_reformulator_rules_from_stream(final SubLObject stream)
  {
    final SubLObject version_number = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    if( !version_number.eql( ONE_INTEGER ) )
    {
      Errors.warn( $str124$This_code_can_only_handle_reformu, version_number );
    }
    final SubLObject rr_count = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    $reformulator_rules$.setGlobalValue( Hashtables.make_hash_table( rr_count, Symbols.symbol_function( EQL ), UNPROVIDED ) );
    SubLObject i;
    SubLObject rr;
    for( i = NIL, i = ZERO_INTEGER; i.numL( rr_count ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      rr = load_reformulator_rule_from_stream( stream );
      Hashtables.sethash( refr_assertion( rr ), $reformulator_rules$.getGlobalValue(), rr );
    }
    $fort_reformulator_rule_table$.setGlobalValue( cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    $constant_reformulator_rule_table$.setGlobalValue( cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    $nart_reformulator_rule_table$.setGlobalValue( cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    SubLObject unassociated_rr_count;
    SubLObject rr_spec;
    SubLObject rr2;
    for( unassociated_rr_count = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ), i = NIL, i = ZERO_INTEGER; i.numL( unassociated_rr_count ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      rr_spec = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      rr2 = NIL;
      if( NIL != assertion_handles.assertion_p( rr_spec ) )
      {
        rr2 = Hashtables.gethash_without_values( rr_spec, $reformulator_rules$.getGlobalValue(), UNPROVIDED );
      }
      else
      {
        rr2 = rr_spec;
      }
      $unassociated_reformulator_rules$.setGlobalValue( ConsesLow.cons( rr2, $unassociated_reformulator_rules$.getGlobalValue() ) );
    }
    $unassociated_reformulator_rules$.setGlobalValue( Sequences.nreverse( $unassociated_reformulator_rules$.getGlobalValue() ) );
    cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 46673L)
  public static SubLObject output_reformulator_rule_to_stream(final SubLObject rr, final SubLObject stream)
  {
    output_reformulator_template_to_stream( refr_first_rt( rr ), stream );
    output_reformulator_template_to_stream( refr_second_rt( rr ), stream );
    cfasl.cfasl_output( refr_mt( rr ), stream );
    cfasl.cfasl_output( refr_wff_degree( rr ), stream );
    cfasl.cfasl_output( refr_directions( rr ), stream );
    cfasl.cfasl_output( refr_assertion( rr ), stream );
    cfasl.cfasl_output( refr_rule_pred( rr ), stream );
    cfasl.cfasl_output( refr_preconditions( rr ), stream );
    cfasl.cfasl_output( refr_properties( rr ), stream );
    return rr;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 47196L)
  public static SubLObject load_reformulator_rule_from_stream(final SubLObject stream)
  {
    final SubLObject first_rt = load_reformulator_template_from_stream( stream );
    final SubLObject second_rt = load_reformulator_template_from_stream( stream );
    final SubLObject rr = make_reformulator_rule( UNPROVIDED );
    _csetf_refr_first_rt( rr, first_rt );
    _csetf_refr_second_rt( rr, second_rt );
    _csetf_refr_mt( rr, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_refr_wff_degree( rr, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_refr_directions( rr, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_refr_assertion( rr, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_refr_rule_pred( rr, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_refr_preconditions( rr, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_refr_properties( rr, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    return rr;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 47888L)
  public static SubLObject output_reformulator_template_to_stream(final SubLObject rt, final SubLObject stream)
  {
    cfasl.cfasl_output( rt_expression( rt ), stream );
    cfasl.cfasl_output( rt_shared_var_bindings( rt ), stream );
    cfasl.cfasl_output( rt_mt( rt ), stream );
    cfasl.cfasl_output( rt_forts( rt ), stream );
    return rt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 48136L)
  public static SubLObject load_reformulator_template_from_stream(final SubLObject stream)
  {
    final SubLObject rt = make_reformulator_template( UNPROVIDED );
    _csetf_rt_expression( rt, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_rt_shared_var_bindings( rt, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_rt_mt( rt, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    _csetf_rt_forts( rt, cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED ) );
    return rt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 48464L)
  public static SubLObject possibly_convert_reformulator_datastructures_from_ids_to_assertions()
  {
    SubLObject did_somethingP = NIL;
    if( NIL != possibly_convert_reformulator_rules_table_from_ids_to_assertions() )
    {
      did_somethingP = T;
    }
    if( NIL != possibly_convert_fort_reformulator_rules_table_from_ids_to_assertions() )
    {
      did_somethingP = T;
    }
    if( NIL != possibly_convert_constant_reformulator_rules_table_from_ids_to_assertions() )
    {
      did_somethingP = T;
    }
    if( NIL != possibly_convert_nart_reformulator_rules_table_from_ids_to_assertions() )
    {
      did_somethingP = T;
    }
    return did_somethingP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 49209L)
  public static SubLObject possibly_convert_reformulator_rules_table_from_ids_to_assertions()
  {
    if( $reformulator_rules$.getGlobalValue().isHashtable() && hash_table_utilities.hash_table_arbitrary_key( $reformulator_rules$.getGlobalValue() ).isInteger() )
    {
      SubLObject cdolist_list_var;
      final SubLObject alist = cdolist_list_var = hash_table_utilities.hash_table_to_alist( $reformulator_rules$.getGlobalValue() );
      SubLObject pair = NIL;
      pair = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject id = pair.first();
        final SubLObject assertion = assertion_handles.find_assertion_by_id( id );
        final SubLObject rr = pair.rest();
        convert_rr_from_id_to_assertion( rr );
        ConsesLow.rplaca( pair, assertion );
        cdolist_list_var = cdolist_list_var.rest();
        pair = cdolist_list_var.first();
      }
      $reformulator_rules$.setGlobalValue( hash_table_utilities.new_hash_table_from_alist( alist, Symbols.symbol_function( EQL ) ) );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 49760L)
  public static SubLObject convert_rr_from_id_to_assertion(final SubLObject rr)
  {
    final SubLObject id = refr_assertion( rr );
    if( id.isInteger() )
    {
      final SubLObject assertion = assertion_handles.find_assertion_by_id( id );
      _csetf_refr_assertion( rr, assertion );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 49978L)
  public static SubLObject possibly_convert_fort_reformulator_rules_table_from_ids_to_assertions()
  {
    if( $fort_reformulator_rule_table$.getGlobalValue().isHashtable() && hash_table_utilities.hash_table_arbitrary_value( $fort_reformulator_rule_table$.getGlobalValue() ).first().isInteger() )
    {
      SubLObject cdolist_list_var;
      final SubLObject alist = cdolist_list_var = hash_table_utilities.hash_table_to_alist( $fort_reformulator_rule_table$.getGlobalValue() );
      SubLObject cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = cons;
        SubLObject key = NIL;
        SubLObject ids = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list125 );
        key = current.first();
        current = ( ids = current.rest() );
        SubLObject cons_$9;
        for( cons_$9 = NIL, cons_$9 = ids; !cons_$9.isAtom(); cons_$9 = cons_$9.rest() )
        {
          ConsesLow.rplaca( cons_$9, assertion_handles.find_assertion_by_id( cons_$9.first() ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
      }
      $fort_reformulator_rule_table$.setGlobalValue( hash_table_utilities.new_hash_table_from_alist( alist, Symbols.symbol_function( EQL ) ) );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 50501L)
  public static SubLObject possibly_convert_constant_reformulator_rules_table_from_ids_to_assertions()
  {
    if( $constant_reformulator_rule_table$.getGlobalValue().isHashtable() && hash_table_utilities.hash_table_arbitrary_value( $constant_reformulator_rule_table$.getGlobalValue() ).first().isInteger() )
    {
      SubLObject cdolist_list_var;
      final SubLObject alist = cdolist_list_var = hash_table_utilities.hash_table_to_alist( $constant_reformulator_rule_table$.getGlobalValue() );
      SubLObject cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = cons;
        SubLObject key = NIL;
        SubLObject ids = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list125 );
        key = current.first();
        current = ( ids = current.rest() );
        SubLObject cons_$10;
        for( cons_$10 = NIL, cons_$10 = ids; !cons_$10.isAtom(); cons_$10 = cons_$10.rest() )
        {
          ConsesLow.rplaca( cons_$10, assertion_handles.find_assertion_by_id( cons_$10.first() ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
      }
      $constant_reformulator_rule_table$.setGlobalValue( hash_table_utilities.new_hash_table_from_alist( alist, Symbols.symbol_function( EQL ) ) );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-rule-unifier-datastructures.lisp", position = 51044L)
  public static SubLObject possibly_convert_nart_reformulator_rules_table_from_ids_to_assertions()
  {
    if( $nart_reformulator_rule_table$.getGlobalValue().isHashtable() && hash_table_utilities.hash_table_arbitrary_value( $nart_reformulator_rule_table$.getGlobalValue() ).first().isInteger() )
    {
      SubLObject cdolist_list_var;
      final SubLObject alist = cdolist_list_var = hash_table_utilities.hash_table_to_alist( $nart_reformulator_rule_table$.getGlobalValue() );
      SubLObject cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = cons;
        SubLObject key = NIL;
        SubLObject ids = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list125 );
        key = current.first();
        current = ( ids = current.rest() );
        SubLObject cons_$11;
        for( cons_$11 = NIL, cons_$11 = ids; !cons_$11.isAtom(); cons_$11 = cons_$11.rest() )
        {
          ConsesLow.rplaca( cons_$11, assertion_handles.find_assertion_by_id( cons_$11.first() ) );
        }
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
      }
      $nart_reformulator_rule_table$.setGlobalValue( hash_table_utilities.new_hash_table_from_alist( alist, Symbols.symbol_function( EQL ) ) );
      return T;
    }
    return NIL;
  }

  public static SubLObject declare_reformulator_rule_unifier_datastructures_file()
  {
    SubLFiles.declareFunction( me, "reformulator_template_print_function_trampoline", "REFORMULATOR-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "reformulator_template_p", "REFORMULATOR-TEMPLATE-P", 1, 0, false );
    new $reformulator_template_p$UnaryFunction();
    SubLFiles.declareFunction( me, "rt_expression", "RT-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "rt_shared_var_bindings", "RT-SHARED-VAR-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "rt_mt", "RT-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "rt_forts", "RT-FORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rt_expression", "_CSETF-RT-EXPRESSION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rt_shared_var_bindings", "_CSETF-RT-SHARED-VAR-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rt_mt", "_CSETF-RT-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_rt_forts", "_CSETF-RT-FORTS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_reformulator_template", "MAKE-REFORMULATOR-TEMPLATE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_reformulator_template", "VISIT-DEFSTRUCT-REFORMULATOR-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_reformulator_template_method", "VISIT-DEFSTRUCT-OBJECT-REFORMULATOR-TEMPLATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_print_function_trampoline", "REFORMULATOR-RULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_p", "REFORMULATOR-RULE-P", 1, 0, false );
    new $reformulator_rule_p$UnaryFunction();
    SubLFiles.declareFunction( me, "refr_first_rt", "REFR-FIRST-RT", 1, 0, false );
    SubLFiles.declareFunction( me, "refr_second_rt", "REFR-SECOND-RT", 1, 0, false );
    SubLFiles.declareFunction( me, "refr_mt", "REFR-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "refr_wff_degree", "REFR-WFF-DEGREE", 1, 0, false );
    SubLFiles.declareFunction( me, "refr_directions", "REFR-DIRECTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "refr_assertion", "REFR-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "refr_rule_pred", "REFR-RULE-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "refr_preconditions", "REFR-PRECONDITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "refr_properties", "REFR-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_refr_first_rt", "_CSETF-REFR-FIRST-RT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_refr_second_rt", "_CSETF-REFR-SECOND-RT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_refr_mt", "_CSETF-REFR-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_refr_wff_degree", "_CSETF-REFR-WFF-DEGREE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_refr_directions", "_CSETF-REFR-DIRECTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_refr_assertion", "_CSETF-REFR-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_refr_rule_pred", "_CSETF-REFR-RULE-PRED", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_refr_preconditions", "_CSETF-REFR-PRECONDITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_refr_properties", "_CSETF-REFR-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_reformulator_rule", "MAKE-REFORMULATOR-RULE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_reformulator_rule", "VISIT-DEFSTRUCT-REFORMULATOR-RULE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_reformulator_rule_method", "VISIT-DEFSTRUCT-OBJECT-REFORMULATOR-RULE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_reformulator_template", "PRINT-REFORMULATOR-TEMPLATE", 3, 1, false );
    SubLFiles.declareFunction( me, "reformulator_template_expression", "REFORMULATOR-TEMPLATE-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_template_el_var_expression", "REFORMULATOR-TEMPLATE-EL-VAR-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_template_shared_var_bindings", "REFORMULATOR-TEMPLATE-SHARED-VAR-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_template_mt", "REFORMULATOR-TEMPLATE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_template_forts", "REFORMULATOR-TEMPLATE-FORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_template_clausesP", "REFORMULATOR-TEMPLATE-CLAUSES?", 1, 0, false );
    SubLFiles.declareFunction( me, "print_reformulator_rule", "PRINT-REFORMULATOR-RULE", 3, 1, false );
    SubLFiles.declareFunction( me, "reformulator_rule_first_rt", "REFORMULATOR-RULE-FIRST-RT", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_second_rt", "REFORMULATOR-RULE-SECOND-RT", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_source_rt", "REFORMULATOR-RULE-SOURCE-RT", 2, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_target_rt", "REFORMULATOR-RULE-TARGET-RT", 2, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_first_shared_var_bindings", "REFORMULATOR-RULE-FIRST-SHARED-VAR-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_second_shared_var_bindings", "REFORMULATOR-RULE-SECOND-SHARED-VAR-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_source_shared_var_bindings", "REFORMULATOR-RULE-SOURCE-SHARED-VAR-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_target_shared_var_bindings", "REFORMULATOR-RULE-TARGET-SHARED-VAR-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_mt", "REFORMULATOR-RULE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_wff_degree", "REFORMULATOR-RULE-WFF-DEGREE", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_directions", "REFORMULATOR-RULE-DIRECTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_assertion", "REFORMULATOR-RULE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_assertion_id", "REFORMULATOR-RULE-ASSERTION-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_rule_pred", "REFORMULATOR-RULE-RULE-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_preconditions", "REFORMULATOR-RULE-PRECONDITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_properties", "REFORMULATOR-RULE-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rules", "REFORMULATOR-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "fort_reformulator_rule_table", "FORT-REFORMULATOR-RULE-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "constant_reformulator_rule_table", "CONSTANT-REFORMULATOR-RULE-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "nart_reformulator_rule_table", "NART-REFORMULATOR-RULE-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "unassociated_reformulator_rules", "UNASSOCIATED-REFORMULATOR-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "add_reformulator_rule_assertion", "ADD-REFORMULATOR-RULE-ASSERTION", 1, 1, false );
    SubLFiles.declareFunction( me, "add_reformulator_precondition_assertion", "ADD-REFORMULATOR-PRECONDITION-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "add_reformulation_direction_assertion", "ADD-REFORMULATION-DIRECTION-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "add_reformulator_rule_property_assertion", "ADD-REFORMULATOR-RULE-PROPERTY-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_reformulator_rule_assertion", "REMOVE-REFORMULATOR-RULE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_reformulator_precondition_assertion", "REMOVE-REFORMULATOR-PRECONDITION-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_reformulation_direction_assertion", "REMOVE-REFORMULATION-DIRECTION-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "remove_reformulator_rule_property_assertion", "REMOVE-REFORMULATOR-RULE-PROPERTY-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "add_reformulator_rule", "ADD-REFORMULATOR-RULE", 1, 1, false );
    SubLFiles.declareFunction( me, "index_reformulator_template_expression_if_possible", "INDEX-REFORMULATOR-TEMPLATE-EXPRESSION-IF-POSSIBLE", 3, 0, false );
    SubLFiles.declareFunction( me, "remove_reformulator_rule", "REMOVE-REFORMULATOR-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "unindex_reformulator_template_expression_if_possible", "UNINDEX-REFORMULATOR-TEMPLATE-EXPRESSION-IF-POSSIBLE", 2, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_forts", "REFORMULATOR-RULE-FORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_reformulator_rules", "INITIALIZE-REFORMULATOR-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "expected_reformulator_rule_count", "EXPECTED-REFORMULATOR-RULE-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "reformulation_assertion_to_reformulator_rule", "REFORMULATION-ASSERTION-TO-REFORMULATOR-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "expansion_rule_to_reformulator_rule", "EXPANSION-RULE-TO-REFORMULATOR-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "rewrite_rule_to_reformulator_rule", "REWRITE-RULE-TO-REFORMULATOR-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulation_rule_to_reformulator_rule", "REFORMULATION-RULE-TO-REFORMULATOR-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_reformulator_rule", "NEW-REFORMULATOR-RULE", 5, 0, false );
    SubLFiles.declareFunction( me, "new_reformulator_template", "NEW-REFORMULATOR-TEMPLATE", 5, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_reformulator_template", "CANONICALIZE-REFORMULATOR-TEMPLATE", 3, 0, false );
    SubLFiles.declareFunction( me, "compute_wff_degree_for_reformulator_rule", "COMPUTE-WFF-DEGREE-FOR-REFORMULATOR-RULE", 1, 0, false );
    SubLFiles.declareMacro( me, "with_reformulator_variable_variables", "WITH-REFORMULATOR-VARIABLE-VARIABLES" );
    SubLFiles.declareFunction( me, "reformulator_transform_shared_el_vars_to_hl_vars", "REFORMULATOR-TRANSFORM-SHARED-EL-VARS-TO-HL-VARS", 2, 0, false );
    SubLFiles.declareFunction( me, "reformulator_shared_el_varP", "REFORMULATOR-SHARED-EL-VAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_shared_el_var_or_dont_care_varP", "REFORMULATOR-SHARED-EL-VAR-OR-DONT-CARE-VAR?", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_appropriate_hl_var", "REFORMULATOR-APPROPRIATE-HL-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_dwim_skolem", "REFORMULATOR-DWIM-SKOLEM", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_dwim_skolems", "REFORMULATOR-DWIM-SKOLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_undwim_skolems", "REFORMULATOR-UNDWIM-SKOLEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "note_reformulator_skolem_dwimming", "NOTE-REFORMULATOR-SKOLEM-DWIMMING", 2, 0, false );
    SubLFiles.declareFunction( me, "rru_clean_up_skolem_function_fns", "RRU-CLEAN-UP-SKOLEM-FUNCTION-FNS", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_skolem_function_fn_to_clean_upP", "REFORMULATOR-SKOLEM-FUNCTION-FN-TO-CLEAN-UP?", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_skolem_function_fn_clean", "REFORMULATOR-SKOLEM-FUNCTION-FN-CLEAN", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulation_precondition_assertions", "REFORMULATION-PRECONDITION-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulation_precondition_struct", "REFORMULATION-PRECONDITION-STRUCT", 1, 0, false );
    SubLFiles.declareFunction( me, "precondition_assertion_direction_arg", "PRECONDITION-ASSERTION-DIRECTION-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "precondition_assertion_precondition_arg", "PRECONDITION-ASSERTION-PRECONDITION-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "precondition_assertion_rule_assertion_arg", "PRECONDITION-ASSERTION-RULE-ASSERTION-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_reformulator_rule_directions", "GATHER-REFORMULATOR-RULE-DIRECTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "add_direction_struct_for_mode", "ADD-DIRECTION-STRUCT-FOR-MODE", 3, 0, false );
    SubLFiles.declareFunction( me, "remove_direction_struct_for_mode", "REMOVE-DIRECTION-STRUCT-FOR-MODE", 3, 0, false );
    SubLFiles.declareFunction( me, "directions_for_mode", "DIRECTIONS-FOR-MODE", 2, 0, false );
    SubLFiles.declareFunction( me, "substitute_directions_for_mode", "SUBSTITUTE-DIRECTIONS-FOR-MODE", 3, 0, false );
    SubLFiles.declareFunction( me, "construct_reformulation_direction_struct", "CONSTRUCT-REFORMULATION-DIRECTION-STRUCT", 2, 0, false );
    SubLFiles.declareFunction( me, "direction_in_mode_assertion_direction_arg", "DIRECTION-IN-MODE-ASSERTION-DIRECTION-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "direction_in_mode_assertion_mode_arg", "DIRECTION-IN-MODE-ASSERTION-MODE-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "direction_in_mode_assertion_rule_assertion_arg", "DIRECTION-IN-MODE-ASSERTION-RULE-ASSERTION-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "gather_reformulator_rule_properties", "GATHER-REFORMULATOR-RULE-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "construct_rule_property_struct", "CONSTRUCT-RULE-PROPERTY-STRUCT", 2, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_property_assertion_property_arg", "REFORMULATOR-RULE-PROPERTY-ASSERTION-PROPERTY-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_property_assertion_rule_assertion_arg", "REFORMULATOR-RULE-PROPERTY-ASSERTION-RULE-ASSERTION-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_reformulator_relevant_assertion_count", "KB-REFORMULATOR-RELEVANT-ASSERTION-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "kb_reformulator_rule_assertion_count", "KB-REFORMULATOR-RULE-ASSERTION-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "reformulator_relevant_fortP", "REFORMULATOR-RELEVANT-FORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_relevant_forts", "REFORMULATOR-RELEVANT-FORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_highly_relevant_fortP", "REFORMULATOR-HIGHLY-RELEVANT-FORT?", 2, 0, false );
    SubLFiles.declareFunction( me, "expansion_ruleP", "EXPANSION-RULE?", 1, 0, false );
    SubLFiles.declareFunction( me, "rewrite_ruleP", "REWRITE-RULE?", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_reformulation_ruleP", "CYCL-REFORMULATION-RULE?", 1, 0, false );
    SubLFiles.declareFunction( me, "generic_arg_to_default_el_var", "GENERIC-ARG-TO-DEFAULT-EL-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "find_default_el_var_by_id", "FIND-DEFAULT-EL-VAR-BY-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "el_relation_expansion_assertionP", "EL-RELATION-EXPANSION-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "rebuild_reformulator_rules", "REBUILD-REFORMULATOR-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "dump_reformulator_rules_to_stream", "DUMP-REFORMULATOR-RULES-TO-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "load_reformulator_rules_from_stream", "LOAD-REFORMULATOR-RULES-FROM-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "output_reformulator_rule_to_stream", "OUTPUT-REFORMULATOR-RULE-TO-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "load_reformulator_rule_from_stream", "LOAD-REFORMULATOR-RULE-FROM-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "output_reformulator_template_to_stream", "OUTPUT-REFORMULATOR-TEMPLATE-TO-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "load_reformulator_template_from_stream", "LOAD-REFORMULATOR-TEMPLATE-FROM-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_convert_reformulator_datastructures_from_ids_to_assertions", "POSSIBLY-CONVERT-REFORMULATOR-DATASTRUCTURES-FROM-IDS-TO-ASSERTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "possibly_convert_reformulator_rules_table_from_ids_to_assertions", "POSSIBLY-CONVERT-REFORMULATOR-RULES-TABLE-FROM-IDS-TO-ASSERTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "convert_rr_from_id_to_assertion", "CONVERT-RR-FROM-ID-TO-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_convert_fort_reformulator_rules_table_from_ids_to_assertions", "POSSIBLY-CONVERT-FORT-REFORMULATOR-RULES-TABLE-FROM-IDS-TO-ASSERTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "possibly_convert_constant_reformulator_rules_table_from_ids_to_assertions", "POSSIBLY-CONVERT-CONSTANT-REFORMULATOR-RULES-TABLE-FROM-IDS-TO-ASSERTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "possibly_convert_nart_reformulator_rules_table_from_ids_to_assertions", "POSSIBLY-CONVERT-NART-REFORMULATOR-RULES-TABLE-FROM-IDS-TO-ASSERTIONS", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_reformulator_rule_unifier_datastructures_file()
  {
    $dtp_reformulator_template$ = SubLFiles.defconstant( "*DTP-REFORMULATOR-TEMPLATE*", $sym0$REFORMULATOR_TEMPLATE );
    $dtp_reformulator_rule$ = SubLFiles.defconstant( "*DTP-REFORMULATOR-RULE*", $sym27$REFORMULATOR_RULE );
    $reformulator_rules$ = SubLFiles.deflexical( "*REFORMULATOR-RULES*", ( maybeDefault( $sym73$_REFORMULATOR_RULES_, $reformulator_rules$, NIL ) ) );
    $fort_reformulator_rule_table$ = SubLFiles.deflexical( "*FORT-REFORMULATOR-RULE-TABLE*", ( maybeDefault( $sym74$_FORT_REFORMULATOR_RULE_TABLE_, $fort_reformulator_rule_table$, NIL ) ) );
    $constant_reformulator_rule_table$ = SubLFiles.deflexical( "*CONSTANT-REFORMULATOR-RULE-TABLE*", ( maybeDefault( $sym75$_CONSTANT_REFORMULATOR_RULE_TABLE_, $constant_reformulator_rule_table$, NIL ) ) );
    $nart_reformulator_rule_table$ = SubLFiles.deflexical( "*NART-REFORMULATOR-RULE-TABLE*", ( maybeDefault( $sym76$_NART_REFORMULATOR_RULE_TABLE_, $nart_reformulator_rule_table$, NIL ) ) );
    $unassociated_reformulator_rules$ = SubLFiles.deflexical( "*UNASSOCIATED-REFORMULATOR-RULES*", ( maybeDefault( $sym77$_UNASSOCIATED_REFORMULATOR_RULES_, $unassociated_reformulator_rules$, NIL ) ) );
    $reformulator_shared_vars$ = SubLFiles.defparameter( "*REFORMULATOR-SHARED-VARS*", NIL );
    $reformulator_shared_var_bindings$ = SubLFiles.defparameter( "*REFORMULATOR-SHARED-VAR-BINDINGS*", NIL );
    $reformulator_next_available_hl_var_num$ = SubLFiles.defparameter( "*REFORMULATOR-NEXT-AVAILABLE-HL-VAR-NUM*", ZERO_INTEGER );
    $reformulator_skolem_dwimming_space$ = SubLFiles.defparameter( "*REFORMULATOR-SKOLEM-DWIMMING-SPACE*", NIL );
    return NIL;
  }

  public static SubLObject setup_reformulator_rule_unifier_datastructures_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_reformulator_template$.getGlobalValue(), Symbols.symbol_function( $sym7$REFORMULATOR_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$RT_EXPRESSION, $sym10$_CSETF_RT_EXPRESSION );
    Structures.def_csetf( $sym11$RT_SHARED_VAR_BINDINGS, $sym12$_CSETF_RT_SHARED_VAR_BINDINGS );
    Structures.def_csetf( $sym13$RT_MT, $sym14$_CSETF_RT_MT );
    Structures.def_csetf( $sym15$RT_FORTS, $sym16$_CSETF_RT_FORTS );
    Equality.identity( $sym0$REFORMULATOR_TEMPLATE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_reformulator_template$.getGlobalValue(), Symbols.symbol_function(
        $sym26$VISIT_DEFSTRUCT_OBJECT_REFORMULATOR_TEMPLATE_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_reformulator_rule$.getGlobalValue(), Symbols.symbol_function( $sym34$REFORMULATOR_RULE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list35 );
    Structures.def_csetf( $sym36$REFR_FIRST_RT, $sym37$_CSETF_REFR_FIRST_RT );
    Structures.def_csetf( $sym38$REFR_SECOND_RT, $sym39$_CSETF_REFR_SECOND_RT );
    Structures.def_csetf( $sym40$REFR_MT, $sym41$_CSETF_REFR_MT );
    Structures.def_csetf( $sym42$REFR_WFF_DEGREE, $sym43$_CSETF_REFR_WFF_DEGREE );
    Structures.def_csetf( $sym44$REFR_DIRECTIONS, $sym45$_CSETF_REFR_DIRECTIONS );
    Structures.def_csetf( $sym46$REFR_ASSERTION, $sym47$_CSETF_REFR_ASSERTION );
    Structures.def_csetf( $sym48$REFR_RULE_PRED, $sym49$_CSETF_REFR_RULE_PRED );
    Structures.def_csetf( $sym50$REFR_PRECONDITIONS, $sym51$_CSETF_REFR_PRECONDITIONS );
    Structures.def_csetf( $sym52$REFR_PROPERTIES, $sym53$_CSETF_REFR_PROPERTIES );
    Equality.identity( $sym27$REFORMULATOR_RULE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_reformulator_rule$.getGlobalValue(), Symbols.symbol_function(
        $sym63$VISIT_DEFSTRUCT_OBJECT_REFORMULATOR_RULE_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym73$_REFORMULATOR_RULES_ );
    subl_macro_promotions.declare_defglobal( $sym74$_FORT_REFORMULATOR_RULE_TABLE_ );
    subl_macro_promotions.declare_defglobal( $sym75$_CONSTANT_REFORMULATOR_RULE_TABLE_ );
    subl_macro_promotions.declare_defglobal( $sym76$_NART_REFORMULATOR_RULE_TABLE_ );
    subl_macro_promotions.declare_defglobal( $sym77$_UNASSOCIATED_REFORMULATOR_RULES_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_reformulator_rule_unifier_datastructures_file();
  }

  @Override
  public void initializeVariables()
  {
    init_reformulator_rule_unifier_datastructures_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_reformulator_rule_unifier_datastructures_file();
  }
  static
  {
    me = new reformulator_rule_unifier_datastructures();
    $dtp_reformulator_template$ = null;
    $dtp_reformulator_rule$ = null;
    $reformulator_rules$ = null;
    $fort_reformulator_rule_table$ = null;
    $constant_reformulator_rule_table$ = null;
    $nart_reformulator_rule_table$ = null;
    $unassociated_reformulator_rules$ = null;
    $reformulator_shared_vars$ = null;
    $reformulator_shared_var_bindings$ = null;
    $reformulator_next_available_hl_var_num$ = null;
    $reformulator_skolem_dwimming_space$ = null;
    $sym0$REFORMULATOR_TEMPLATE = makeSymbol( "REFORMULATOR-TEMPLATE" );
    $sym1$REFORMULATOR_TEMPLATE_P = makeSymbol( "REFORMULATOR-TEMPLATE-P" );
    $list2 = ConsesLow.list( makeSymbol( "EXPRESSION" ), makeSymbol( "SHARED-VAR-BINDINGS" ), makeSymbol( "MT" ), makeSymbol( "FORTS" ) );
    $list3 = ConsesLow.list( makeKeyword( "EXPRESSION" ), makeKeyword( "SHARED-VAR-BINDINGS" ), makeKeyword( "MT" ), makeKeyword( "FORTS" ) );
    $list4 = ConsesLow.list( makeSymbol( "RT-EXPRESSION" ), makeSymbol( "RT-SHARED-VAR-BINDINGS" ), makeSymbol( "RT-MT" ), makeSymbol( "RT-FORTS" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-RT-EXPRESSION" ), makeSymbol( "_CSETF-RT-SHARED-VAR-BINDINGS" ), makeSymbol( "_CSETF-RT-MT" ), makeSymbol( "_CSETF-RT-FORTS" ) );
    $sym6$PRINT_REFORMULATOR_TEMPLATE = makeSymbol( "PRINT-REFORMULATOR-TEMPLATE" );
    $sym7$REFORMULATOR_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "REFORMULATOR-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "REFORMULATOR-TEMPLATE-P" ) );
    $sym9$RT_EXPRESSION = makeSymbol( "RT-EXPRESSION" );
    $sym10$_CSETF_RT_EXPRESSION = makeSymbol( "_CSETF-RT-EXPRESSION" );
    $sym11$RT_SHARED_VAR_BINDINGS = makeSymbol( "RT-SHARED-VAR-BINDINGS" );
    $sym12$_CSETF_RT_SHARED_VAR_BINDINGS = makeSymbol( "_CSETF-RT-SHARED-VAR-BINDINGS" );
    $sym13$RT_MT = makeSymbol( "RT-MT" );
    $sym14$_CSETF_RT_MT = makeSymbol( "_CSETF-RT-MT" );
    $sym15$RT_FORTS = makeSymbol( "RT-FORTS" );
    $sym16$_CSETF_RT_FORTS = makeSymbol( "_CSETF-RT-FORTS" );
    $kw17$EXPRESSION = makeKeyword( "EXPRESSION" );
    $kw18$SHARED_VAR_BINDINGS = makeKeyword( "SHARED-VAR-BINDINGS" );
    $kw19$MT = makeKeyword( "MT" );
    $kw20$FORTS = makeKeyword( "FORTS" );
    $str21$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw22$BEGIN = makeKeyword( "BEGIN" );
    $sym23$MAKE_REFORMULATOR_TEMPLATE = makeSymbol( "MAKE-REFORMULATOR-TEMPLATE" );
    $kw24$SLOT = makeKeyword( "SLOT" );
    $kw25$END = makeKeyword( "END" );
    $sym26$VISIT_DEFSTRUCT_OBJECT_REFORMULATOR_TEMPLATE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-REFORMULATOR-TEMPLATE-METHOD" );
    $sym27$REFORMULATOR_RULE = makeSymbol( "REFORMULATOR-RULE" );
    $sym28$REFORMULATOR_RULE_P = makeSymbol( "REFORMULATOR-RULE-P" );
    $list29 = ConsesLow.list( new SubLObject[] { makeSymbol( "FIRST-RT" ), makeSymbol( "SECOND-RT" ), makeSymbol( "MT" ), makeSymbol( "WFF-DEGREE" ), makeSymbol( "DIRECTIONS" ), makeSymbol( "ASSERTION" ), makeSymbol(
        "RULE-PRED" ), makeSymbol( "PRECONDITIONS" ), makeSymbol( "PROPERTIES" )
    } );
    $list30 = ConsesLow.list( new SubLObject[] { makeKeyword( "FIRST-RT" ), makeKeyword( "SECOND-RT" ), makeKeyword( "MT" ), makeKeyword( "WFF-DEGREE" ), makeKeyword( "DIRECTIONS" ), makeKeyword( "ASSERTION" ),
      makeKeyword( "RULE-PRED" ), makeKeyword( "PRECONDITIONS" ), makeKeyword( "PROPERTIES" )
    } );
    $list31 = ConsesLow.list( new SubLObject[] { makeSymbol( "REFR-FIRST-RT" ), makeSymbol( "REFR-SECOND-RT" ), makeSymbol( "REFR-MT" ), makeSymbol( "REFR-WFF-DEGREE" ), makeSymbol( "REFR-DIRECTIONS" ), makeSymbol(
        "REFR-ASSERTION" ), makeSymbol( "REFR-RULE-PRED" ), makeSymbol( "REFR-PRECONDITIONS" ), makeSymbol( "REFR-PROPERTIES" )
    } );
    $list32 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-REFR-FIRST-RT" ), makeSymbol( "_CSETF-REFR-SECOND-RT" ), makeSymbol( "_CSETF-REFR-MT" ), makeSymbol( "_CSETF-REFR-WFF-DEGREE" ), makeSymbol(
        "_CSETF-REFR-DIRECTIONS" ), makeSymbol( "_CSETF-REFR-ASSERTION" ), makeSymbol( "_CSETF-REFR-RULE-PRED" ), makeSymbol( "_CSETF-REFR-PRECONDITIONS" ), makeSymbol( "_CSETF-REFR-PROPERTIES" )
    } );
    $sym33$PRINT_REFORMULATOR_RULE = makeSymbol( "PRINT-REFORMULATOR-RULE" );
    $sym34$REFORMULATOR_RULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "REFORMULATOR-RULE-PRINT-FUNCTION-TRAMPOLINE" );
    $list35 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "REFORMULATOR-RULE-P" ) );
    $sym36$REFR_FIRST_RT = makeSymbol( "REFR-FIRST-RT" );
    $sym37$_CSETF_REFR_FIRST_RT = makeSymbol( "_CSETF-REFR-FIRST-RT" );
    $sym38$REFR_SECOND_RT = makeSymbol( "REFR-SECOND-RT" );
    $sym39$_CSETF_REFR_SECOND_RT = makeSymbol( "_CSETF-REFR-SECOND-RT" );
    $sym40$REFR_MT = makeSymbol( "REFR-MT" );
    $sym41$_CSETF_REFR_MT = makeSymbol( "_CSETF-REFR-MT" );
    $sym42$REFR_WFF_DEGREE = makeSymbol( "REFR-WFF-DEGREE" );
    $sym43$_CSETF_REFR_WFF_DEGREE = makeSymbol( "_CSETF-REFR-WFF-DEGREE" );
    $sym44$REFR_DIRECTIONS = makeSymbol( "REFR-DIRECTIONS" );
    $sym45$_CSETF_REFR_DIRECTIONS = makeSymbol( "_CSETF-REFR-DIRECTIONS" );
    $sym46$REFR_ASSERTION = makeSymbol( "REFR-ASSERTION" );
    $sym47$_CSETF_REFR_ASSERTION = makeSymbol( "_CSETF-REFR-ASSERTION" );
    $sym48$REFR_RULE_PRED = makeSymbol( "REFR-RULE-PRED" );
    $sym49$_CSETF_REFR_RULE_PRED = makeSymbol( "_CSETF-REFR-RULE-PRED" );
    $sym50$REFR_PRECONDITIONS = makeSymbol( "REFR-PRECONDITIONS" );
    $sym51$_CSETF_REFR_PRECONDITIONS = makeSymbol( "_CSETF-REFR-PRECONDITIONS" );
    $sym52$REFR_PROPERTIES = makeSymbol( "REFR-PROPERTIES" );
    $sym53$_CSETF_REFR_PROPERTIES = makeSymbol( "_CSETF-REFR-PROPERTIES" );
    $kw54$FIRST_RT = makeKeyword( "FIRST-RT" );
    $kw55$SECOND_RT = makeKeyword( "SECOND-RT" );
    $kw56$WFF_DEGREE = makeKeyword( "WFF-DEGREE" );
    $kw57$DIRECTIONS = makeKeyword( "DIRECTIONS" );
    $kw58$ASSERTION = makeKeyword( "ASSERTION" );
    $kw59$RULE_PRED = makeKeyword( "RULE-PRED" );
    $kw60$PRECONDITIONS = makeKeyword( "PRECONDITIONS" );
    $kw61$PROPERTIES = makeKeyword( "PROPERTIES" );
    $sym62$MAKE_REFORMULATOR_RULE = makeSymbol( "MAKE-REFORMULATOR-RULE" );
    $sym63$VISIT_DEFSTRUCT_OBJECT_REFORMULATOR_RULE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-REFORMULATOR-RULE-METHOD" );
    $str64$__RT_ = makeString( "#<RT>" );
    $str65$__RT__s_ = makeString( "#<RT:~s>" );
    $str66$__RT__s__s__s_ = makeString( "#<RT:~s:~s:~s>" );
    $str67$__RR__s_ = makeString( "#<RR:~s>" );
    $str68$__REFORMULATOR_RULE__s__s__s_ = makeString( "#<REFORMULATOR-RULE:~s:~s:~s>" );
    $str69$__REFORMULATOR_RULE__s__s__s__s__ = makeString( "#<REFORMULATOR-RULE:~s:~s:~s:~s:~s:~s:~s>" );
    $str70$__REFORMULATOR_RULE__s__s__s__s__ = makeString( "#<REFORMULATOR-RULE:~s:~s:~s:~s:~s:~s:~s:~s:~s>" );
    $const71$ReformulationForwardDirection = constant_handles.reader_make_constant_shell( makeString( "ReformulationForwardDirection" ) );
    $const72$ReformulationBackwardDirection = constant_handles.reader_make_constant_shell( makeString( "ReformulationBackwardDirection" ) );
    $sym73$_REFORMULATOR_RULES_ = makeSymbol( "*REFORMULATOR-RULES*" );
    $sym74$_FORT_REFORMULATOR_RULE_TABLE_ = makeSymbol( "*FORT-REFORMULATOR-RULE-TABLE*" );
    $sym75$_CONSTANT_REFORMULATOR_RULE_TABLE_ = makeSymbol( "*CONSTANT-REFORMULATOR-RULE-TABLE*" );
    $sym76$_NART_REFORMULATOR_RULE_TABLE_ = makeSymbol( "*NART-REFORMULATOR-RULE-TABLE*" );
    $sym77$_UNASSOCIATED_REFORMULATOR_RULES_ = makeSymbol( "*UNASSOCIATED-REFORMULATOR-RULES*" );
    $str78$Found_an_ill_formed_reformulation = makeString( "Found an ill-formed reformulation assertion: ~s - ignoring it~%" );
    $sym79$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const80$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym81$GATHER_PREDICATE_EXTENT_INDEX = makeSymbol( "GATHER-PREDICATE-EXTENT-INDEX" );
    $str82$Initializing_Reformulator_Rules = makeString( "Initializing Reformulator Rules" );
    $sym83$DEFAULT_EL_VAR_ = makeSymbol( "DEFAULT-EL-VAR?" );
    $str84$expansion_rule__s_contains_a_defa = makeString( "expansion rule ~s contains a default EL variable and cannot be used by the CycL reformulator." );
    $sym85$GENERIC_ARG_P = makeSymbol( "GENERIC-ARG-P" );
    $sym86$GENERIC_ARG_TO_DEFAULT_EL_VAR = makeSymbol( "GENERIC-ARG-TO-DEFAULT-EL-VAR" );
    $sym87$FIND_DEFAULT_EL_VAR_BY_ID = makeSymbol( "FIND-DEFAULT-EL-VAR-BY-ID" );
    $sym88$CHLMT_P = makeSymbol( "CHLMT-P" );
    $str89$Found_a_reformulator_rule_that_wo = makeString( "Found a reformulator rule that would reformulate ~s to itself - ignoring rule~%" );
    $str90$Encountered__A_which_is_not_a_CYC = makeString( "Encountered ~A which is not a CYCL-EXPRESSION.  Skipping the reformulator rule ~A." );
    $kw91$NONE = makeKeyword( "NONE" );
    $kw92$KB = makeKeyword( "KB" );
    $kw93$ARITY = makeKeyword( "ARITY" );
    $kw94$ALL = makeKeyword( "ALL" );
    $list95 = ConsesLow.list( ConsesLow.list( makeSymbol( "SHARED-VARS" ), makeSymbol( "EXPRESSION" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym96$HIGHEST_VAR_NUM = makeUninternedSymbol( "HIGHEST-VAR-NUM" );
    $sym97$CLET = makeSymbol( "CLET" );
    $sym98$_REFORMULATOR_SHARED_VARS_ = makeSymbol( "*REFORMULATOR-SHARED-VARS*" );
    $list99 = ConsesLow.list( makeSymbol( "*REFORMULATOR-SHARED-VAR-BINDINGS*" ), NIL );
    $sym100$SAFE_MAX = makeSymbol( "SAFE-MAX" );
    $sym101$MAPCAR = makeSymbol( "MAPCAR" );
    $list102 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VARIABLE-ID" ) );
    $sym103$EXPRESSION_GATHER = makeSymbol( "EXPRESSION-GATHER" );
    $list104 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "VARIABLE-P" ) ), NIL );
    $sym105$_REFORMULATOR_NEXT_AVAILABLE_HL_VAR_NUM_ = makeSymbol( "*REFORMULATOR-NEXT-AVAILABLE-HL-VAR-NUM*" );
    $sym106$VARIABLE_ID = makeSymbol( "VARIABLE-ID" );
    $sym107$VARIABLE_P = makeSymbol( "VARIABLE-P" );
    $sym108$REFORMULATOR_SHARED_EL_VAR_OR_DONT_CARE_VAR_ = makeSymbol( "REFORMULATOR-SHARED-EL-VAR-OR-DONT-CARE-VAR?" );
    $sym109$REFORMULATOR_APPROPRIATE_HL_VAR = makeSymbol( "REFORMULATOR-APPROPRIATE-HL-VAR" );
    $sym110$UNREIFIED_SKOLEM_TERM_ = makeSymbol( "UNREIFIED-SKOLEM-TERM?" );
    $sym111$REFORMULATOR_DWIM_SKOLEM = makeSymbol( "REFORMULATOR-DWIM-SKOLEM" );
    $int112$100 = makeInteger( 100 );
    $sym113$REFORMULATOR_SKOLEM_FUNCTION_FN_TO_CLEAN_UP_ = makeSymbol( "REFORMULATOR-SKOLEM-FUNCTION-FN-TO-CLEAN-UP?" );
    $const114$SkolemFunctionFn = constant_handles.reader_make_constant_shell( makeString( "SkolemFunctionFn" ) );
    $sym115$EL_VARIABLE_ = makeSymbol( "EL-VARIABLE?" );
    $const116$reformulationPrecondition = constant_handles.reader_make_constant_shell( makeString( "reformulationPrecondition" ) );
    $const117$reformulationDirectionInMode = constant_handles.reader_make_constant_shell( makeString( "reformulationDirectionInMode" ) );
    $const118$reformulatorRuleProperties = constant_handles.reader_make_constant_shell( makeString( "reformulatorRuleProperties" ) );
    $sym119$REFORMULATOR_RELEVANT_FORT_ = makeSymbol( "REFORMULATOR-RELEVANT-FORT?" );
    $const120$ReformulatorHighlyRelevantFORT = constant_handles.reader_make_constant_shell( makeString( "ReformulatorHighlyRelevantFORT" ) );
    $const121$expansion = constant_handles.reader_make_constant_shell( makeString( "expansion" ) );
    $const122$rewriteOf = constant_handles.reader_make_constant_shell( makeString( "rewriteOf" ) );
    $const123$ELRelation = constant_handles.reader_make_constant_shell( makeString( "ELRelation" ) );
    $str124$This_code_can_only_handle_reformu = makeString( "This code can only handle reformulator unit version 1.  Got version ~a, but will try anyway..." );
    $list125 = ConsesLow.cons( makeUninternedSymbol( "KEY" ), makeSymbol( "IDS" ) );
  }

  public static final class $reformulator_template_native
      extends
        SubLStructNative
  {
    public SubLObject $expression;
    public SubLObject $shared_var_bindings;
    public SubLObject $mt;
    public SubLObject $forts;
    private static final SubLStructDeclNative structDecl;

    public $reformulator_template_native()
    {
      this.$expression = CommonSymbols.NIL;
      this.$shared_var_bindings = CommonSymbols.NIL;
      this.$mt = CommonSymbols.NIL;
      this.$forts = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $reformulator_template_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$expression;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$shared_var_bindings;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$mt;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$forts;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$expression = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$shared_var_bindings = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$mt = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$forts = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $reformulator_template_native.class, $sym0$REFORMULATOR_TEMPLATE, $sym1$REFORMULATOR_TEMPLATE_P, $list2, $list3, new String[] { "$expression", "$shared_var_bindings",
        "$mt", "$forts"
      }, $list4, $list5, $sym6$PRINT_REFORMULATOR_TEMPLATE );
    }
  }

  public static final class $reformulator_template_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $reformulator_template_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REFORMULATOR-TEMPLATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return reformulator_template_p( arg1 );
    }
  }

  public static final class $reformulator_rule_native
      extends
        SubLStructNative
  {
    public SubLObject $first_rt;
    public SubLObject $second_rt;
    public SubLObject $mt;
    public SubLObject $wff_degree;
    public SubLObject $directions;
    public SubLObject $assertion;
    public SubLObject $rule_pred;
    public SubLObject $preconditions;
    public SubLObject $properties;
    private static final SubLStructDeclNative structDecl;

    public $reformulator_rule_native()
    {
      this.$first_rt = CommonSymbols.NIL;
      this.$second_rt = CommonSymbols.NIL;
      this.$mt = CommonSymbols.NIL;
      this.$wff_degree = CommonSymbols.NIL;
      this.$directions = CommonSymbols.NIL;
      this.$assertion = CommonSymbols.NIL;
      this.$rule_pred = CommonSymbols.NIL;
      this.$preconditions = CommonSymbols.NIL;
      this.$properties = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $reformulator_rule_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$first_rt;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$second_rt;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$mt;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$wff_degree;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$directions;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$assertion;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$rule_pred;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$preconditions;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$properties;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$first_rt = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$second_rt = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$mt = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$wff_degree = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$directions = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$assertion = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$rule_pred = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$preconditions = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$properties = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $reformulator_rule_native.class, $sym27$REFORMULATOR_RULE, $sym28$REFORMULATOR_RULE_P, $list29, $list30, new String[] { "$first_rt", "$second_rt", "$mt", "$wff_degree",
        "$directions", "$assertion", "$rule_pred", "$preconditions", "$properties"
      }, $list31, $list32, $sym33$PRINT_REFORMULATOR_RULE );
    }
  }

  public static final class $reformulator_rule_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $reformulator_rule_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "REFORMULATOR-RULE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return reformulator_rule_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 456 ms
 * 
 */