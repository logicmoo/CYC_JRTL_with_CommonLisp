package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class shop_internals
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.shop_internals";
  public static final String myFingerPrint = "a83b6c727ec29e1e8c8612e4ba76cdf7df05a2a76259c9a4c22688293159e72a";
  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 1157L)
  public static SubLSymbol $shop_verbose_keys$;
  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 1482L)
  public static SubLSymbol $shop_gc$;
  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 1566L)
  private static SubLSymbol $shop_verbose_target$;
  private static final SubLList $list0;
  private static final SubLSymbol $kw1$STDOUT;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$SET_SLOT;
  private static final SubLSymbol $sym6$1_;
  private static final SubLSymbol $sym7$GET_SLOT;
  private static final SubLSymbol $sym8$PROCESS_TIMER;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$STATISTIC_MANAGER;
  private static final SubLSymbol $sym11$OBJECT;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$LAST_CALL_REAL_TIME;
  private static final SubLSymbol $sym15$LAST_CALL_RUN_TIME;
  private static final SubLSymbol $sym16$END_REAL_TIME;
  private static final SubLSymbol $sym17$END_RUN_TIME;
  private static final SubLSymbol $sym18$START_REAL_TIME;
  private static final SubLSymbol $sym19$START_RUN_TIME;
  private static final SubLSymbol $sym20$TIMING_;
  private static final SubLSymbol $sym21$INSTANCE_COUNT;
  private static final SubLSymbol $sym22$SUBLOOP_RESERVED_INITIALIZE_STATISTIC_MANAGER_CLASS;
  private static final SubLSymbol $sym23$ISOLATED_P;
  private static final SubLSymbol $sym24$INSTANCE_NUMBER;
  private static final SubLSymbol $sym25$SUBLOOP_RESERVED_INITIALIZE_STATISTIC_MANAGER_INSTANCE;
  private static final SubLSymbol $sym26$INITIALIZE;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$STATISTIC_MANAGER_INITIALIZE_METHOD;
  private static final SubLSymbol $sym30$GET_RUN_TIME;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$STATISTIC_MANAGER_GET_RUN_TIME_METHOD;
  private static final SubLSymbol $sym34$GET_REAL_TIME;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$STATISTIC_MANAGER_GET_REAL_TIME_METHOD;
  private static final SubLSymbol $sym37$RESET_LAST_CALL_TIME;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD;
  private static final SubLSymbol $sym40$STATISTIC_MANAGER_RESET_LAST_CALL_TIME_METHOD;
  private static final SubLSymbol $sym41$START_TIMING;
  private static final SubLList $list42;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD;
  private static final SubLSymbol $sym45$STATISTIC_MANAGER_START_TIMING_METHOD;
  private static final SubLSymbol $sym46$RESUME_TIMING;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD;
  private static final SubLSymbol $sym49$STATISTIC_MANAGER_RESUME_TIMING_METHOD;
  private static final SubLSymbol $sym50$STOP_TIMING;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD;
  private static final SubLSymbol $sym53$STATISTIC_MANAGER_STOP_TIMING_METHOD;
  private static final SubLSymbol $sym54$IS_TIMING_;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD;
  private static final SubLSymbol $sym57$STATISTIC_MANAGER_IS_TIMING__METHOD;
  private static final SubLSymbol $sym58$ELAPSED_REAL_TIME;
  private static final SubLList $list59;
  private static final SubLSymbol $sym60$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD;
  private static final SubLSymbol $sym61$STATISTIC_MANAGER_ELAPSED_REAL_TIME_METHOD;
  private static final SubLSymbol $sym62$ELAPSED_RUN_TIME;
  private static final SubLList $list63;
  private static final SubLSymbol $sym64$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD;
  private static final SubLSymbol $sym65$STATISTIC_MANAGER_ELAPSED_RUN_TIME_METHOD;
  private static final SubLSymbol $sym66$RESET_TIMING;
  private static final SubLList $list67;
  private static final SubLSymbol $sym68$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD;
  private static final SubLSymbol $sym69$STATISTIC_MANAGER_RESET_TIMING_METHOD;
  private static final SubLSymbol $sym70$ELAPSED_REAL_TIME_SINCE_LAST_CALL;
  private static final SubLList $list71;
  private static final SubLSymbol $sym72$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD;
  private static final SubLSymbol $sym73$STATISTIC_MANAGER_ELAPSED_REAL_TIME_SINCE_LAST_CALL_METHOD;
  private static final SubLSymbol $sym74$ELAPSED_RUN_TIME_SINCE_LAST_CALL;
  private static final SubLList $list75;
  private static final SubLSymbol $sym76$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD;
  private static final SubLSymbol $sym77$STATISTIC_MANAGER_ELAPSED_RUN_TIME_SINCE_LAST_CALL_METHOD;
  private static final SubLSymbol $sym78$SHOP_STATISTIC_MANAGER;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$SUBLOOP_RESERVED_INITIALIZE_SHOP_STATISTIC_MANAGER_CLASS;
  private static final SubLSymbol $sym81$METHOD_COUNTER;
  private static final SubLSymbol $sym82$INFERENCE_COUNTER;
  private static final SubLSymbol $sym83$FI_ASK_COUNTER;
  private static final SubLSymbol $sym84$PLAN_STATE_ASK_COUNTER;
  private static final SubLSymbol $sym85$PLAN_COUNTER;
  private static final SubLSymbol $sym86$PLANS;
  private static final SubLSymbol $sym87$SUBLOOP_RESERVED_INITIALIZE_SHOP_STATISTIC_MANAGER_INSTANCE;
  private static final SubLList $list88;
  private static final SubLSymbol $sym89$SHOP_STATISTIC_MANAGER_INITIALIZE_METHOD;
  private static final SubLSymbol $sym90$RESET_COUNTERS;
  private static final SubLList $list91;
  private static final SubLSymbol $sym92$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD;
  private static final SubLSymbol $sym93$SHOP_STATISTIC_MANAGER_RESET_COUNTERS_METHOD;
  private static final SubLSymbol $sym94$ADD_FI_ASK;
  private static final SubLList $list95;
  private static final SubLList $list96;
  private static final SubLSymbol $sym97$SHOP_STATISTIC_MANAGER_ADD_FI_ASK_METHOD;
  private static final SubLSymbol $sym98$ADD_PLAN_STATE_ASK;
  private static final SubLList $list99;
  private static final SubLSymbol $sym100$SHOP_STATISTIC_MANAGER_ADD_PLAN_STATE_ASK_METHOD;
  private static final SubLSymbol $sym101$ADD_EXPANSION;
  private static final SubLList $list102;
  private static final SubLSymbol $sym103$SHOP_STATISTIC_MANAGER_ADD_EXPANSION_METHOD;
  private static final SubLSymbol $sym104$ADD_INFERENCE;
  private static final SubLList $list105;
  private static final SubLSymbol $sym106$SHOP_STATISTIC_MANAGER_ADD_INFERENCE_METHOD;
  private static final SubLSymbol $sym107$ADD_PLAN;
  private static final SubLList $list108;
  private static final SubLList $list109;
  private static final SubLSymbol $sym110$SHOP_STATISTIC_MANAGER_ADD_PLAN_METHOD;
  private static final SubLSymbol $sym111$NUMBER_OF_INFERENCES;
  private static final SubLList $list112;
  private static final SubLSymbol $sym113$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD;
  private static final SubLSymbol $sym114$SHOP_STATISTIC_MANAGER_NUMBER_OF_INFERENCES_METHOD;
  private static final SubLSymbol $sym115$NUMBER_OF_METHODS;
  private static final SubLList $list116;
  private static final SubLSymbol $sym117$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD;
  private static final SubLSymbol $sym118$SHOP_STATISTIC_MANAGER_NUMBER_OF_METHODS_METHOD;
  private static final SubLSymbol $sym119$NUMBER_OF_EXPANSIONS;
  private static final SubLSymbol $sym120$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD;
  private static final SubLSymbol $sym121$SHOP_STATISTIC_MANAGER_NUMBER_OF_EXPANSIONS_METHOD;
  private static final SubLSymbol $sym122$NUMBER_OF_PLANS;
  private static final SubLList $list123;
  private static final SubLSymbol $sym124$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD;
  private static final SubLSymbol $sym125$SHOP_STATISTIC_MANAGER_NUMBER_OF_PLANS_METHOD;
  private static final SubLSymbol $sym126$NUMBER_OF_FI_ASKS;
  private static final SubLList $list127;
  private static final SubLSymbol $sym128$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD;
  private static final SubLSymbol $sym129$SHOP_STATISTIC_MANAGER_NUMBER_OF_FI_ASKS_METHOD;
  private static final SubLSymbol $sym130$NUMBER_OF_PLAN_STATE_ASKS;
  private static final SubLList $list131;
  private static final SubLSymbol $sym132$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD;
  private static final SubLSymbol $sym133$SHOP_STATISTIC_MANAGER_NUMBER_OF_PLAN_STATE_ASKS_METHOD;
  private static final SubLSymbol $sym134$SHOP_VARIABLE_MANAGER;
  private static final SubLList $list135;
  private static final SubLSymbol $sym136$VARIABLE_COUNTER;
  private static final SubLSymbol $sym137$VARIABLE_PREFIX;
  private static final SubLSymbol $sym138$SUBLOOP_RESERVED_INITIALIZE_SHOP_VARIABLE_MANAGER_CLASS;
  private static final SubLSymbol $sym139$VARIABLE_ASSOC_TABLE;
  private static final SubLSymbol $sym140$SUBLOOP_RESERVED_INITIALIZE_SHOP_VARIABLE_MANAGER_INSTANCE;
  private static final SubLList $list141;
  private static final SubLList $list142;
  private static final SubLString $str143$_PV_;
  private static final SubLInteger $int144$100;
  private static final SubLSymbol $sym145$SHOP_VARIABLE_MANAGER_INITIALIZE_METHOD;
  private static final SubLSymbol $sym146$GENERATE_VARIABLE;
  private static final SubLList $list147;
  private static final SubLSymbol $sym148$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD;
  private static final SubLString $str149$CYC;
  private static final SubLSymbol $sym150$SHOP_VARIABLE_MANAGER_GENERATE_VARIABLE_METHOD;
  private static final SubLSymbol $sym151$GENERATE_BINDING_PAIR;
  private static final SubLList $list152;
  private static final SubLList $list153;
  private static final SubLSymbol $sym154$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD;
  private static final SubLSymbol $sym155$SHOP_VARIABLE_MANAGER_GENERATE_BINDING_PAIR_METHOD;
  private static final SubLSymbol $sym156$GENERATE_BINDING_LIST;
  private static final SubLList $list157;
  private static final SubLList $list158;
  private static final SubLSymbol $sym159$SHOP_VARIABLE_MANAGER_GENERATE_BINDING_LIST_METHOD;
  private static final SubLSymbol $sym160$RECOVER_EL_VARIABLE;
  private static final SubLList $list161;
  private static final SubLList $list162;
  private static final SubLSymbol $sym163$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD;
  private static final SubLString $str164$VARIABLE_ERROR;
  private static final SubLString $str165$_s_is_not_a_known_variable_to__s_;
  private static final SubLSymbol $sym166$SHOP_VARIABLE_MANAGER_RECOVER_EL_VARIABLE_METHOD;
  private static final SubLSymbol $sym167$GATHER_EL_VARIABLES;
  private static final SubLList $list168;
  private static final SubLList $list169;
  private static final SubLSymbol $sym170$SHOP_VARIABLEP;
  private static final SubLSymbol $sym171$SHOP_VARIABLE_MANAGER_GATHER_EL_VARIABLES_METHOD;
  private static final SubLSymbol $sym172$MANAGED_VARIABLE_;
  private static final SubLList $list173;
  private static final SubLList $list174;
  private static final SubLSymbol $sym175$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD;
  private static final SubLSymbol $sym176$SHOP_VARIABLE_MANAGER_MANAGED_VARIABLE__METHOD;
  private static final SubLSymbol $sym177$GENERATED_VARIABLE_;
  private static final SubLList $list178;
  private static final SubLSymbol $sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD;
  private static final SubLString $str180$;
  private static final SubLSymbol $sym181$SHOP_VARIABLE_MANAGER_GENERATED_VARIABLE__METHOD;
  private static final SubLSymbol $sym182$GENERATED_VARIABLES_BOUND;
  private static final SubLList $list183;
  private static final SubLList $list184;
  private static final SubLSymbol $sym185$SHOP_VARIABLE_MANAGER_GENERATED_VARIABLES_BOUND_METHOD;
  private static final SubLSymbol $sym186$REPLACE_VARIABLES;
  private static final SubLList $list187;
  private static final SubLSymbol $sym188$SHOP_VARIABLE_MANAGER_REPLACE_VARIABLES_METHOD;
  private static final SubLSymbol $sym189$RECOVER_EL;
  private static final SubLList $list190;
  private static final SubLList $list191;
  private static final SubLSymbol $sym192$SHOP_VARIABLE_MANAGER_RECOVER_EL_METHOD;
  private static final SubLObject $const193$argIsa;
  private static final SubLSymbol $sym194$RELEVANT_MT_IS_GENL_MT;
  private static final SubLObject $const195$argGenl;

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 1885L)
  public static SubLObject lispify_cyc_bindings(final SubLObject cyc_bindings_list)
  {
    SubLObject shop_bindings = NIL;
    SubLObject cdolist_list_var = cyc_bindings_list;
    SubLObject cyc_binding = NIL;
    cyc_binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( cyc_binding.eql( $list2 ) )
      {
        shop_bindings = ConsesLow.cons( $list3, shop_bindings );
      }
      else
      {
        shop_bindings = ConsesLow.cons( ConsesLow.cons( cyc_binding.first(), cyc_binding.rest() ), shop_bindings );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cyc_binding = cdolist_list_var.first();
    }
    return shop_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 2257L)
  public static SubLObject shop_translate_plan(final SubLObject plan)
  {
    final SubLObject plan_length = Sequences.length( plan );
    SubLObject cyc_assertions = NIL;
    SubLObject formula = NIL;
    SubLObject cyc_assertion = NIL;
    SubLObject index;
    SubLObject cdolist_list_var;
    SubLObject v_term;
    for( index = NIL, index = ZERO_INTEGER; !index.numGE( plan_length ); index = Numbers.add( index, ONE_INTEGER ) )
    {
      formula = ConsesLow.nth( index, plan );
      cyc_assertion = NIL;
      cdolist_list_var = formula;
      v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == v_term )
        {
          return NIL;
        }
        cyc_assertion = ConsesLow.cons( v_term, cyc_assertion );
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
      cyc_assertion = Sequences.reverse( cyc_assertion );
      cyc_assertions = ConsesLow.cons( cyc_assertion, cyc_assertions );
    }
    Sequences.reverse( cyc_assertions );
    return Sequences.reverse( cyc_assertions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 2778L)
  public static SubLObject inc_slot(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_object = NIL;
    SubLObject slot = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list4 );
    slot = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym5$SET_SLOT, v_object, slot, ConsesLow.list( $sym6$1_, ConsesLow.list( $sym7$GET_SLOT, v_object, slot ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list4 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 2885L)
  public static SubLObject process_timer_p(final SubLObject process_timer)
  {
    return interfaces.subloop_instanceof_interface( process_timer, $sym8$PROCESS_TIMER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
  public static SubLObject get_statistic_manager_last_call_real_time(final SubLObject statistic_manager)
  {
    return classes.subloop_get_access_protected_instance_slot( statistic_manager, SEVEN_INTEGER, $sym14$LAST_CALL_REAL_TIME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
  public static SubLObject set_statistic_manager_last_call_real_time(final SubLObject statistic_manager, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( statistic_manager, value, SEVEN_INTEGER, $sym14$LAST_CALL_REAL_TIME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
  public static SubLObject get_statistic_manager_last_call_run_time(final SubLObject statistic_manager)
  {
    return classes.subloop_get_access_protected_instance_slot( statistic_manager, SIX_INTEGER, $sym15$LAST_CALL_RUN_TIME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
  public static SubLObject set_statistic_manager_last_call_run_time(final SubLObject statistic_manager, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( statistic_manager, value, SIX_INTEGER, $sym15$LAST_CALL_RUN_TIME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
  public static SubLObject get_statistic_manager_end_real_time(final SubLObject statistic_manager)
  {
    return classes.subloop_get_access_protected_instance_slot( statistic_manager, FIVE_INTEGER, $sym16$END_REAL_TIME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
  public static SubLObject set_statistic_manager_end_real_time(final SubLObject statistic_manager, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( statistic_manager, value, FIVE_INTEGER, $sym16$END_REAL_TIME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
  public static SubLObject get_statistic_manager_end_run_time(final SubLObject statistic_manager)
  {
    return classes.subloop_get_access_protected_instance_slot( statistic_manager, FOUR_INTEGER, $sym17$END_RUN_TIME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
  public static SubLObject set_statistic_manager_end_run_time(final SubLObject statistic_manager, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( statistic_manager, value, FOUR_INTEGER, $sym17$END_RUN_TIME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
  public static SubLObject get_statistic_manager_start_real_time(final SubLObject statistic_manager)
  {
    return classes.subloop_get_access_protected_instance_slot( statistic_manager, THREE_INTEGER, $sym18$START_REAL_TIME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
  public static SubLObject set_statistic_manager_start_real_time(final SubLObject statistic_manager, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( statistic_manager, value, THREE_INTEGER, $sym18$START_REAL_TIME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
  public static SubLObject get_statistic_manager_start_run_time(final SubLObject statistic_manager)
  {
    return classes.subloop_get_access_protected_instance_slot( statistic_manager, TWO_INTEGER, $sym19$START_RUN_TIME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
  public static SubLObject set_statistic_manager_start_run_time(final SubLObject statistic_manager, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( statistic_manager, value, TWO_INTEGER, $sym19$START_RUN_TIME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
  public static SubLObject get_statistic_manager_timingP(final SubLObject statistic_manager)
  {
    return classes.subloop_get_access_protected_instance_slot( statistic_manager, ONE_INTEGER, $sym20$TIMING_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
  public static SubLObject set_statistic_manager_timingP(final SubLObject statistic_manager, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( statistic_manager, value, ONE_INTEGER, $sym20$TIMING_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
  public static SubLObject subloop_reserved_initialize_statistic_manager_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym21$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
  public static SubLObject subloop_reserved_initialize_statistic_manager_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym23$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym24$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym10$STATISTIC_MANAGER, $sym20$TIMING_, NIL );
    classes.subloop_initialize_slot( new_instance, $sym10$STATISTIC_MANAGER, $sym19$START_RUN_TIME, NIL );
    classes.subloop_initialize_slot( new_instance, $sym10$STATISTIC_MANAGER, $sym18$START_REAL_TIME, NIL );
    classes.subloop_initialize_slot( new_instance, $sym10$STATISTIC_MANAGER, $sym17$END_RUN_TIME, NIL );
    classes.subloop_initialize_slot( new_instance, $sym10$STATISTIC_MANAGER, $sym16$END_REAL_TIME, NIL );
    classes.subloop_initialize_slot( new_instance, $sym10$STATISTIC_MANAGER, $sym15$LAST_CALL_RUN_TIME, NIL );
    classes.subloop_initialize_slot( new_instance, $sym10$STATISTIC_MANAGER, $sym14$LAST_CALL_REAL_TIME, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 3620L)
  public static SubLObject statistic_manager_p(final SubLObject statistic_manager)
  {
    return classes.subloop_instanceof_class( statistic_manager, $sym10$STATISTIC_MANAGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 4321L)
  public static SubLObject statistic_manager_initialize_method(final SubLObject self)
  {
    object.object_initialize_method( self );
    statistic_manager_reset_timing_method( self );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 4445L)
  public static SubLObject statistic_manager_get_run_time_method(final SubLObject self)
  {
    return Time.get_internal_run_time();
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 4545L)
  public static SubLObject statistic_manager_get_real_time_method(final SubLObject self)
  {
    return Time.get_internal_real_time();
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 4647L)
  public static SubLObject statistic_manager_reset_last_call_time_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_statistic_manager_method = NIL;
    SubLObject last_call_real_time = get_statistic_manager_last_call_real_time( self );
    SubLObject last_call_run_time = get_statistic_manager_last_call_run_time( self );
    try
    {
      thread.throwStack.push( $sym39$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD );
      try
      {
        last_call_run_time = statistic_manager_get_run_time_method( self );
        last_call_real_time = statistic_manager_get_real_time_method( self );
        Dynamic.sublisp_throw( $sym39$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_statistic_manager_last_call_real_time( self, last_call_real_time );
          set_statistic_manager_last_call_run_time( self, last_call_run_time );
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
      catch_var_for_statistic_manager_method = Errors.handleThrowable( ccatch_env_var, $sym39$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_statistic_manager_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 4836L)
  public static SubLObject statistic_manager_start_timing_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_statistic_manager_method = NIL;
    SubLObject start_real_time = get_statistic_manager_start_real_time( self );
    SubLObject start_run_time = get_statistic_manager_start_run_time( self );
    SubLObject timingP = get_statistic_manager_timingP( self );
    try
    {
      thread.throwStack.push( $sym44$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD );
      try
      {
        start_run_time = statistic_manager_get_run_time_method( self );
        start_real_time = statistic_manager_get_real_time_method( self );
        statistic_manager_reset_last_call_time_method( self );
        timingP = T;
        Dynamic.sublisp_throw( $sym44$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_statistic_manager_start_real_time( self, start_real_time );
          set_statistic_manager_start_run_time( self, start_run_time );
          set_statistic_manager_timingP( self, timingP );
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
      catch_var_for_statistic_manager_method = Errors.handleThrowable( ccatch_env_var, $sym44$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_statistic_manager_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 5059L)
  public static SubLObject statistic_manager_resume_timing_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_statistic_manager_method = NIL;
    SubLObject timingP = get_statistic_manager_timingP( self );
    try
    {
      thread.throwStack.push( $sym48$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD );
      try
      {
        statistic_manager_reset_last_call_time_method( self );
        timingP = T;
        Dynamic.sublisp_throw( $sym48$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_statistic_manager_timingP( self, timingP );
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
      catch_var_for_statistic_manager_method = Errors.handleThrowable( ccatch_env_var, $sym48$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_statistic_manager_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 5189L)
  public static SubLObject statistic_manager_stop_timing_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_statistic_manager_method = NIL;
    SubLObject end_real_time = get_statistic_manager_end_real_time( self );
    SubLObject end_run_time = get_statistic_manager_end_run_time( self );
    SubLObject timingP = get_statistic_manager_timingP( self );
    try
    {
      thread.throwStack.push( $sym52$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD );
      try
      {
        end_run_time = statistic_manager_get_run_time_method( self );
        end_real_time = statistic_manager_get_real_time_method( self );
        timingP = NIL;
        Dynamic.sublisp_throw( $sym52$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_statistic_manager_end_real_time( self, end_real_time );
          set_statistic_manager_end_run_time( self, end_run_time );
          set_statistic_manager_timingP( self, timingP );
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
      catch_var_for_statistic_manager_method = Errors.handleThrowable( ccatch_env_var, $sym52$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_statistic_manager_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 5377L)
  public static SubLObject statistic_manager_is_timingP_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_statistic_manager_method = NIL;
    final SubLObject timingP = get_statistic_manager_timingP( self );
    try
    {
      thread.throwStack.push( $sym56$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym56$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, timingP );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_statistic_manager_timingP( self, timingP );
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
      catch_var_for_statistic_manager_method = Errors.handleThrowable( ccatch_env_var, $sym56$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_statistic_manager_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 5458L)
  public static SubLObject statistic_manager_elapsed_real_time_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_statistic_manager_method = NIL;
    final SubLObject end_real_time = get_statistic_manager_end_real_time( self );
    final SubLObject start_real_time = get_statistic_manager_start_real_time( self );
    final SubLObject timingP = get_statistic_manager_timingP( self );
    try
    {
      thread.throwStack.push( $sym60$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD );
      try
      {
        if( NIL != timingP )
        {
          Dynamic.sublisp_throw( $sym60$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, Numbers.subtract( statistic_manager_get_real_time_method( self ), start_real_time ) );
        }
        else
        {
          Dynamic.sublisp_throw( $sym60$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, Numbers.subtract( end_real_time, start_real_time ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_statistic_manager_end_real_time( self, end_real_time );
          set_statistic_manager_start_real_time( self, start_real_time );
          set_statistic_manager_timingP( self, timingP );
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
      catch_var_for_statistic_manager_method = Errors.handleThrowable( ccatch_env_var, $sym60$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_statistic_manager_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 5648L)
  public static SubLObject statistic_manager_elapsed_run_time_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_statistic_manager_method = NIL;
    final SubLObject end_run_time = get_statistic_manager_end_run_time( self );
    final SubLObject start_run_time = get_statistic_manager_start_run_time( self );
    final SubLObject timingP = get_statistic_manager_timingP( self );
    try
    {
      thread.throwStack.push( $sym64$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD );
      try
      {
        if( NIL != timingP )
        {
          Dynamic.sublisp_throw( $sym64$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, Numbers.subtract( statistic_manager_get_run_time_method( self ), start_run_time ) );
        }
        else
        {
          Dynamic.sublisp_throw( $sym64$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, Numbers.subtract( end_run_time, start_run_time ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_statistic_manager_end_run_time( self, end_run_time );
          set_statistic_manager_start_run_time( self, start_run_time );
          set_statistic_manager_timingP( self, timingP );
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
      catch_var_for_statistic_manager_method = Errors.handleThrowable( ccatch_env_var, $sym64$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_statistic_manager_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 5832L)
  public static SubLObject statistic_manager_reset_timing_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_statistic_manager_method = NIL;
    SubLObject last_call_real_time = get_statistic_manager_last_call_real_time( self );
    SubLObject last_call_run_time = get_statistic_manager_last_call_run_time( self );
    SubLObject end_real_time = get_statistic_manager_end_real_time( self );
    SubLObject end_run_time = get_statistic_manager_end_run_time( self );
    SubLObject start_real_time = get_statistic_manager_start_real_time( self );
    SubLObject start_run_time = get_statistic_manager_start_run_time( self );
    SubLObject timingP = get_statistic_manager_timingP( self );
    try
    {
      thread.throwStack.push( $sym68$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD );
      try
      {
        timingP = NIL;
        start_real_time = ZERO_INTEGER;
        end_real_time = ZERO_INTEGER;
        start_run_time = ZERO_INTEGER;
        end_run_time = ZERO_INTEGER;
        last_call_run_time = ZERO_INTEGER;
        last_call_real_time = ZERO_INTEGER;
        Dynamic.sublisp_throw( $sym68$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_statistic_manager_last_call_real_time( self, last_call_real_time );
          set_statistic_manager_last_call_run_time( self, last_call_run_time );
          set_statistic_manager_end_real_time( self, end_real_time );
          set_statistic_manager_end_run_time( self, end_run_time );
          set_statistic_manager_start_real_time( self, start_real_time );
          set_statistic_manager_start_run_time( self, start_run_time );
          set_statistic_manager_timingP( self, timingP );
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
      catch_var_for_statistic_manager_method = Errors.handleThrowable( ccatch_env_var, $sym68$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_statistic_manager_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6103L)
  public static SubLObject statistic_manager_elapsed_real_time_since_last_call_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_statistic_manager_method = NIL;
    final SubLObject last_call_real_time = get_statistic_manager_last_call_real_time( self );
    final SubLObject end_real_time = get_statistic_manager_end_real_time( self );
    final SubLObject timingP = get_statistic_manager_timingP( self );
    try
    {
      thread.throwStack.push( $sym72$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD );
      try
      {
        if( NIL != timingP )
        {
          final SubLObject elapsed_time = Numbers.subtract( statistic_manager_get_real_time_method( self ), last_call_real_time );
          statistic_manager_reset_last_call_time_method( self );
          Dynamic.sublisp_throw( $sym72$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, elapsed_time );
        }
        else
        {
          final SubLObject elapsed_time = Numbers.subtract( end_real_time, last_call_real_time );
          Dynamic.sublisp_throw( $sym72$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, elapsed_time );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_statistic_manager_last_call_real_time( self, last_call_real_time );
          set_statistic_manager_end_real_time( self, end_real_time );
          set_statistic_manager_timingP( self, timingP );
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
      catch_var_for_statistic_manager_method = Errors.handleThrowable( ccatch_env_var, $sym72$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_statistic_manager_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6424L)
  public static SubLObject statistic_manager_elapsed_run_time_since_last_call_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_statistic_manager_method = NIL;
    final SubLObject last_call_run_time = get_statistic_manager_last_call_run_time( self );
    final SubLObject end_run_time = get_statistic_manager_end_run_time( self );
    final SubLObject timingP = get_statistic_manager_timingP( self );
    try
    {
      thread.throwStack.push( $sym76$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD );
      try
      {
        if( NIL != timingP )
        {
          final SubLObject elapsed_time = Numbers.subtract( statistic_manager_get_run_time_method( self ), last_call_run_time );
          statistic_manager_reset_last_call_time_method( self );
          Dynamic.sublisp_throw( $sym76$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, elapsed_time );
        }
        else
        {
          final SubLObject elapsed_time = Numbers.subtract( end_run_time, last_call_run_time );
          Dynamic.sublisp_throw( $sym76$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD, elapsed_time );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_statistic_manager_last_call_run_time( self, last_call_run_time );
          set_statistic_manager_end_run_time( self, end_run_time );
          set_statistic_manager_timingP( self, timingP );
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
      catch_var_for_statistic_manager_method = Errors.handleThrowable( ccatch_env_var, $sym76$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_statistic_manager_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
  public static SubLObject get_shop_statistic_manager_plans(final SubLObject shop_statistic_manager)
  {
    return classes.subloop_get_instance_slot( shop_statistic_manager, THIRTEEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
  public static SubLObject set_shop_statistic_manager_plans(final SubLObject shop_statistic_manager, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( shop_statistic_manager, value, THIRTEEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
  public static SubLObject get_shop_statistic_manager_plan_counter(final SubLObject shop_statistic_manager)
  {
    return classes.subloop_get_instance_slot( shop_statistic_manager, TWELVE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
  public static SubLObject set_shop_statistic_manager_plan_counter(final SubLObject shop_statistic_manager, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( shop_statistic_manager, value, TWELVE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
  public static SubLObject get_shop_statistic_manager_plan_state_ask_counter(final SubLObject shop_statistic_manager)
  {
    return classes.subloop_get_instance_slot( shop_statistic_manager, ELEVEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
  public static SubLObject set_shop_statistic_manager_plan_state_ask_counter(final SubLObject shop_statistic_manager, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( shop_statistic_manager, value, ELEVEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
  public static SubLObject get_shop_statistic_manager_fi_ask_counter(final SubLObject shop_statistic_manager)
  {
    return classes.subloop_get_instance_slot( shop_statistic_manager, TEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
  public static SubLObject set_shop_statistic_manager_fi_ask_counter(final SubLObject shop_statistic_manager, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( shop_statistic_manager, value, TEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
  public static SubLObject get_shop_statistic_manager_inference_counter(final SubLObject shop_statistic_manager)
  {
    return classes.subloop_get_instance_slot( shop_statistic_manager, NINE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
  public static SubLObject set_shop_statistic_manager_inference_counter(final SubLObject shop_statistic_manager, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( shop_statistic_manager, value, NINE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
  public static SubLObject get_shop_statistic_manager_method_counter(final SubLObject shop_statistic_manager)
  {
    return classes.subloop_get_instance_slot( shop_statistic_manager, EIGHT_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
  public static SubLObject set_shop_statistic_manager_method_counter(final SubLObject shop_statistic_manager, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( shop_statistic_manager, value, EIGHT_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
  public static SubLObject subloop_reserved_initialize_shop_statistic_manager_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym21$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
  public static SubLObject subloop_reserved_initialize_shop_statistic_manager_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym23$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym24$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym10$STATISTIC_MANAGER, $sym20$TIMING_, NIL );
    classes.subloop_initialize_slot( new_instance, $sym10$STATISTIC_MANAGER, $sym19$START_RUN_TIME, NIL );
    classes.subloop_initialize_slot( new_instance, $sym10$STATISTIC_MANAGER, $sym18$START_REAL_TIME, NIL );
    classes.subloop_initialize_slot( new_instance, $sym10$STATISTIC_MANAGER, $sym17$END_RUN_TIME, NIL );
    classes.subloop_initialize_slot( new_instance, $sym10$STATISTIC_MANAGER, $sym16$END_REAL_TIME, NIL );
    classes.subloop_initialize_slot( new_instance, $sym10$STATISTIC_MANAGER, $sym15$LAST_CALL_RUN_TIME, NIL );
    classes.subloop_initialize_slot( new_instance, $sym10$STATISTIC_MANAGER, $sym14$LAST_CALL_REAL_TIME, NIL );
    classes.subloop_initialize_slot( new_instance, $sym78$SHOP_STATISTIC_MANAGER, $sym81$METHOD_COUNTER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym78$SHOP_STATISTIC_MANAGER, $sym82$INFERENCE_COUNTER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym78$SHOP_STATISTIC_MANAGER, $sym83$FI_ASK_COUNTER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym78$SHOP_STATISTIC_MANAGER, $sym84$PLAN_STATE_ASK_COUNTER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym78$SHOP_STATISTIC_MANAGER, $sym85$PLAN_COUNTER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym78$SHOP_STATISTIC_MANAGER, $sym86$PLANS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 6742L)
  public static SubLObject shop_statistic_manager_p(final SubLObject shop_statistic_manager)
  {
    return classes.subloop_instanceof_class( shop_statistic_manager, $sym78$SHOP_STATISTIC_MANAGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 7450L)
  public static SubLObject shop_statistic_manager_initialize_method(final SubLObject self)
  {
    statistic_manager_initialize_method( self );
    shop_statistic_manager_reset_counters_method( self );
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 7582L)
  public static SubLObject shop_statistic_manager_reset_counters_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_statistic_manager_method = NIL;
    SubLObject plans = get_shop_statistic_manager_plans( self );
    SubLObject plan_counter = get_shop_statistic_manager_plan_counter( self );
    SubLObject plan_state_ask_counter = get_shop_statistic_manager_plan_state_ask_counter( self );
    SubLObject fi_ask_counter = get_shop_statistic_manager_fi_ask_counter( self );
    SubLObject inference_counter = get_shop_statistic_manager_inference_counter( self );
    SubLObject method_counter = get_shop_statistic_manager_method_counter( self );
    try
    {
      thread.throwStack.push( $sym92$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD );
      try
      {
        method_counter = ZERO_INTEGER;
        inference_counter = ZERO_INTEGER;
        fi_ask_counter = ZERO_INTEGER;
        plan_state_ask_counter = ZERO_INTEGER;
        plan_counter = ZERO_INTEGER;
        plans = NIL;
        Dynamic.sublisp_throw( $sym92$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_statistic_manager_plans( self, plans );
          set_shop_statistic_manager_plan_counter( self, plan_counter );
          set_shop_statistic_manager_plan_state_ask_counter( self, plan_state_ask_counter );
          set_shop_statistic_manager_fi_ask_counter( self, fi_ask_counter );
          set_shop_statistic_manager_inference_counter( self, inference_counter );
          set_shop_statistic_manager_method_counter( self, method_counter );
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
      catch_var_for_shop_statistic_manager_method = Errors.handleThrowable( ccatch_env_var, $sym92$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_statistic_manager_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 7833L)
  public static SubLObject shop_statistic_manager_add_fi_ask_method(final SubLObject self)
  {
    return instances.set_slot( self, $sym83$FI_ASK_COUNTER, Numbers.add( instances.get_slot( self, $sym83$FI_ASK_COUNTER ), ONE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 8002L)
  public static SubLObject shop_statistic_manager_add_plan_state_ask_method(final SubLObject self)
  {
    return instances.set_slot( self, $sym84$PLAN_STATE_ASK_COUNTER, Numbers.add( instances.get_slot( self, $sym84$PLAN_STATE_ASK_COUNTER ), ONE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 8196L)
  public static SubLObject shop_statistic_manager_add_expansion_method(final SubLObject self)
  {
    return instances.set_slot( self, $sym81$METHOD_COUNTER, Numbers.add( instances.get_slot( self, $sym81$METHOD_COUNTER ), ONE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 8369L)
  public static SubLObject shop_statistic_manager_add_inference_method(final SubLObject self)
  {
    return instances.set_slot( self, $sym82$INFERENCE_COUNTER, Numbers.add( instances.get_slot( self, $sym82$INFERENCE_COUNTER ), ONE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 8548L)
  public static SubLObject shop_statistic_manager_add_plan_method(final SubLObject self, final SubLObject plan)
  {
    instances.set_slot( self, $sym86$PLANS, ConsesLow.cons( plan, instances.get_slot( self, $sym86$PLANS ) ) );
    return instances.set_slot( self, $sym85$PLAN_COUNTER, Numbers.add( instances.get_slot( self, $sym85$PLAN_COUNTER ), ONE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 8776L)
  public static SubLObject shop_statistic_manager_number_of_inferences_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_statistic_manager_method = NIL;
    final SubLObject inference_counter = get_shop_statistic_manager_inference_counter( self );
    try
    {
      thread.throwStack.push( $sym113$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym113$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD, inference_counter );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_statistic_manager_inference_counter( self, inference_counter );
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
      catch_var_for_shop_statistic_manager_method = Errors.handleThrowable( ccatch_env_var, $sym113$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_statistic_manager_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 8883L)
  public static SubLObject shop_statistic_manager_number_of_methods_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_statistic_manager_method = NIL;
    final SubLObject method_counter = get_shop_statistic_manager_method_counter( self );
    try
    {
      thread.throwStack.push( $sym117$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym117$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD, method_counter );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_statistic_manager_method_counter( self, method_counter );
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
      catch_var_for_shop_statistic_manager_method = Errors.handleThrowable( ccatch_env_var, $sym117$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_statistic_manager_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 8983L)
  public static SubLObject shop_statistic_manager_number_of_expansions_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_statistic_manager_method = NIL;
    final SubLObject method_counter = get_shop_statistic_manager_method_counter( self );
    try
    {
      thread.throwStack.push( $sym120$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym120$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD, method_counter );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_statistic_manager_method_counter( self, method_counter );
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
      catch_var_for_shop_statistic_manager_method = Errors.handleThrowable( ccatch_env_var, $sym120$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_statistic_manager_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9086L)
  public static SubLObject shop_statistic_manager_number_of_plans_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_statistic_manager_method = NIL;
    final SubLObject plan_counter = get_shop_statistic_manager_plan_counter( self );
    try
    {
      thread.throwStack.push( $sym124$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym124$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD, plan_counter );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_statistic_manager_plan_counter( self, plan_counter );
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
      catch_var_for_shop_statistic_manager_method = Errors.handleThrowable( ccatch_env_var, $sym124$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_statistic_manager_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9182L)
  public static SubLObject shop_statistic_manager_number_of_fi_asks_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_statistic_manager_method = NIL;
    final SubLObject fi_ask_counter = get_shop_statistic_manager_fi_ask_counter( self );
    try
    {
      thread.throwStack.push( $sym128$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym128$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD, fi_ask_counter );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_statistic_manager_fi_ask_counter( self, fi_ask_counter );
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
      catch_var_for_shop_statistic_manager_method = Errors.handleThrowable( ccatch_env_var, $sym128$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_statistic_manager_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9282L)
  public static SubLObject shop_statistic_manager_number_of_plan_state_asks_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_statistic_manager_method = NIL;
    final SubLObject plan_state_ask_counter = get_shop_statistic_manager_plan_state_ask_counter( self );
    try
    {
      thread.throwStack.push( $sym132$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym132$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD, plan_state_ask_counter );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_statistic_manager_plan_state_ask_counter( self, plan_state_ask_counter );
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
      catch_var_for_shop_statistic_manager_method = Errors.handleThrowable( ccatch_env_var, $sym132$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_statistic_manager_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9398L)
  public static SubLObject get_shop_variable_manager_variable_assoc_table(final SubLObject shop_variable_manager)
  {
    return classes.subloop_get_instance_slot( shop_variable_manager, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9398L)
  public static SubLObject set_shop_variable_manager_variable_assoc_table(final SubLObject shop_variable_manager, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( shop_variable_manager, value, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9398L)
  public static SubLObject get_shop_variable_manager_variable_prefix(final SubLObject shop_variable_manager)
  {
    final SubLObject v_class = shop_variable_manager.isSymbol() ? classes.classes_retrieve_class( shop_variable_manager )
        : ( ( NIL != subloop_structures.class_p( shop_variable_manager ) ) ? shop_variable_manager
            : ( ( NIL != subloop_structures.instance_p( shop_variable_manager ) ) ? subloop_structures.instance_class( shop_variable_manager ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), TWO_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9398L)
  public static SubLObject set_shop_variable_manager_variable_prefix(final SubLObject shop_variable_manager, final SubLObject value)
  {
    final SubLObject v_class = shop_variable_manager.isSymbol() ? classes.classes_retrieve_class( shop_variable_manager )
        : ( ( NIL != subloop_structures.class_p( shop_variable_manager ) ) ? shop_variable_manager
            : ( ( NIL != subloop_structures.instance_p( shop_variable_manager ) ) ? subloop_structures.instance_class( shop_variable_manager ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), TWO_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9398L)
  public static SubLObject get_shop_variable_manager_variable_counter(final SubLObject shop_variable_manager)
  {
    final SubLObject v_class = shop_variable_manager.isSymbol() ? classes.classes_retrieve_class( shop_variable_manager )
        : ( ( NIL != subloop_structures.class_p( shop_variable_manager ) ) ? shop_variable_manager
            : ( ( NIL != subloop_structures.instance_p( shop_variable_manager ) ) ? subloop_structures.instance_class( shop_variable_manager ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.aref( subloop_structures.class_any_slots( v_class ), ONE_INTEGER );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9398L)
  public static SubLObject set_shop_variable_manager_variable_counter(final SubLObject shop_variable_manager, final SubLObject value)
  {
    final SubLObject v_class = shop_variable_manager.isSymbol() ? classes.classes_retrieve_class( shop_variable_manager )
        : ( ( NIL != subloop_structures.class_p( shop_variable_manager ) ) ? shop_variable_manager
            : ( ( NIL != subloop_structures.instance_p( shop_variable_manager ) ) ? subloop_structures.instance_class( shop_variable_manager ) : NIL ) );
    if( NIL != v_class )
    {
      return Vectors.set_aref( subloop_structures.class_any_slots( v_class ), ONE_INTEGER, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9398L)
  public static SubLObject subloop_reserved_initialize_shop_variable_manager_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym21$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym134$SHOP_VARIABLE_MANAGER, $sym136$VARIABLE_COUNTER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym134$SHOP_VARIABLE_MANAGER, $sym137$VARIABLE_PREFIX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9398L)
  public static SubLObject subloop_reserved_initialize_shop_variable_manager_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym23$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym11$OBJECT, $sym24$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym134$SHOP_VARIABLE_MANAGER, $sym139$VARIABLE_ASSOC_TABLE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 9398L)
  public static SubLObject shop_variable_manager_p(final SubLObject shop_variable_manager)
  {
    return classes.subloop_instanceof_class( shop_variable_manager, $sym134$SHOP_VARIABLE_MANAGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 10204L)
  public static SubLObject shop_variable_manager_initialize_method(final SubLObject self)
  {
    object.object_initialize_method( self );
    instances.set_slot( self, $sym137$VARIABLE_PREFIX, $str143$_PV_ );
    if( NIL == instances.get_slot( self, $sym139$VARIABLE_ASSOC_TABLE ) )
    {
      instances.set_slot( self, $sym136$VARIABLE_COUNTER, ZERO_INTEGER );
      instances.set_slot( self, $sym139$VARIABLE_ASSOC_TABLE, Hashtables.make_hash_table( $int144$100, UNPROVIDED, UNPROVIDED ) );
    }
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 10533L)
  public static SubLObject shop_variable_manager_generate_variable_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_variable_manager_method = NIL;
    final SubLObject variable_prefix = get_shop_variable_manager_variable_prefix( self );
    SubLObject variable_counter = get_shop_variable_manager_variable_counter( self );
    try
    {
      thread.throwStack.push( $sym148$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD );
      try
      {
        final SubLObject var_name = Sequences.cconcatenate( variable_prefix, PrintLow.write_to_string( variable_counter, EMPTY_SUBL_OBJECT_ARRAY ) );
        final SubLObject var_symbol = Packages.intern( var_name, Packages.find_package( $str149$CYC ) );
        variable_counter = Numbers.add( variable_counter, ONE_INTEGER );
        Dynamic.sublisp_throw( $sym148$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, var_symbol );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_variable_manager_variable_prefix( self, variable_prefix );
          set_shop_variable_manager_variable_counter( self, variable_counter );
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
      catch_var_for_shop_variable_manager_method = Errors.handleThrowable( ccatch_env_var, $sym148$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_variable_manager_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 10859L)
  public static SubLObject shop_variable_manager_generate_binding_pair_method(final SubLObject self, final SubLObject old_var)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_variable_manager_method = NIL;
    final SubLObject variable_assoc_table = get_shop_variable_manager_variable_assoc_table( self );
    try
    {
      thread.throwStack.push( $sym154$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD );
      try
      {
        final SubLObject new_var = shop_variable_manager_generate_variable_method( self );
        Hashtables.sethash( new_var, variable_assoc_table, old_var );
        Dynamic.sublisp_throw( $sym154$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, ConsesLow.cons( old_var, new_var ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_variable_manager_variable_assoc_table( self, variable_assoc_table );
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
      catch_var_for_shop_variable_manager_method = Errors.handleThrowable( ccatch_env_var, $sym154$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_variable_manager_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 11267L)
  public static SubLObject shop_variable_manager_generate_binding_list_method(final SubLObject self, final SubLObject old_var_list)
  {
    SubLObject blist = NIL;
    SubLObject cdolist_list_var = old_var_list;
    SubLObject old_var = NIL;
    old_var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      blist = ConsesLow.cons( shop_variable_manager_generate_binding_pair_method( self, old_var ), blist );
      cdolist_list_var = cdolist_list_var.rest();
      old_var = cdolist_list_var.first();
    }
    return blist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 11616L)
  public static SubLObject shop_variable_manager_recover_el_variable_method(final SubLObject self, final SubLObject hl_var)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_variable_manager_method = NIL;
    final SubLObject variable_assoc_table = get_shop_variable_manager_variable_assoc_table( self );
    try
    {
      thread.throwStack.push( $sym163$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD );
      try
      {
        final SubLObject el_var = Hashtables.gethash( hl_var, variable_assoc_table, UNPROVIDED );
        if( NIL != el_var )
        {
          Dynamic.sublisp_throw( $sym163$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, el_var );
        }
        Errors.cerror( $str164$VARIABLE_ERROR, $str165$_s_is_not_a_known_variable_to__s_, hl_var, self );
        Dynamic.sublisp_throw( $sym163$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_variable_manager_variable_assoc_table( self, variable_assoc_table );
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
      catch_var_for_shop_variable_manager_method = Errors.handleThrowable( ccatch_env_var, $sym163$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_variable_manager_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 12053L)
  public static SubLObject shop_variable_manager_gather_el_variables_method(final SubLObject self, final SubLObject form, final SubLObject mbinding)
  {
    SubLObject unbound_vars = NIL;
    SubLObject cdolist_list_var = list_utilities.tree_gather( form, Symbols.symbol_function( $sym170$SHOP_VARIABLEP ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject cur_var = NIL;
    cur_var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == shop_variable_manager_generated_variableP_method( $sym134$SHOP_VARIABLE_MANAGER, cur_var ) && NIL != multibindings.free_variable_in_multibindingP( cur_var, mbinding ) )
      {
        unbound_vars = ConsesLow.cons( cur_var, unbound_vars );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cur_var = cdolist_list_var.first();
    }
    return Sequences.reverse( unbound_vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 12721L)
  public static SubLObject shop_variable_manager_managed_variableP_method(final SubLObject self, final SubLObject var)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_variable_manager_method = NIL;
    final SubLObject variable_assoc_table = get_shop_variable_manager_variable_assoc_table( self );
    try
    {
      thread.throwStack.push( $sym175$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym175$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, ( NIL != Hashtables.gethash( var, variable_assoc_table, UNPROVIDED ) ) ? T : NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_variable_manager_variable_assoc_table( self, variable_assoc_table );
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
      catch_var_for_shop_variable_manager_method = Errors.handleThrowable( ccatch_env_var, $sym175$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_variable_manager_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 12874L)
  public static SubLObject shop_variable_manager_generated_variableP_method(final SubLObject self, final SubLObject var)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_variable_manager_method = NIL;
    final SubLObject variable_prefix = get_shop_variable_manager_variable_prefix( self );
    try
    {
      thread.throwStack.push( $sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD );
      try
      {
        if( !var.isSymbol() )
        {
          Dynamic.sublisp_throw( $sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, NIL );
        }
        if( NIL != variables.variable_p( var ) )
        {
          Dynamic.sublisp_throw( $sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, NIL );
        }
        final SubLObject var_name = Symbols.symbol_name( var );
        final SubLObject min_length = Sequences.length( variable_prefix );
        final SubLObject var_prefix = Sequences.length( var_name ).numGE( min_length ) ? string_utilities.substring( Symbols.symbol_name( var ), ZERO_INTEGER, Sequences.length( variable_prefix ) ) : $str180$;
        if( NIL != Strings.stringE( var_prefix, variable_prefix, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          Dynamic.sublisp_throw( $sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, T );
        }
        else
        {
          Dynamic.sublisp_throw( $sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD, NIL );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_variable_manager_variable_prefix( self, variable_prefix );
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
      catch_var_for_shop_variable_manager_method = Errors.handleThrowable( ccatch_env_var, $sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_variable_manager_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 13514L)
  public static SubLObject shop_variable_manager_generated_variables_bound_method(final SubLObject self, final SubLObject binding)
  {
    SubLObject bpairs = NIL;
    SubLObject cdolist_list_var = binding;
    SubLObject cur_pair = NIL;
    cur_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != shop_variable_manager_generated_variableP_method( $sym134$SHOP_VARIABLE_MANAGER, cur_pair.first() ) )
      {
        bpairs = ConsesLow.cons( cur_pair, bpairs );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cur_pair = cdolist_list_var.first();
    }
    return bpairs;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 13862L)
  public static SubLObject shop_variable_manager_replace_variables_method(final SubLObject self, final SubLObject form, final SubLObject mbinding)
  {
    final SubLObject old_vars = shop_variable_manager_gather_el_variables_method( self, form, mbinding );
    final SubLObject blist = shop_variable_manager_generate_binding_list_method( self, old_vars );
    return conses_high.sublis( blist, form, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 14361L)
  public static SubLObject shop_variable_manager_recover_el_method(final SubLObject self, final SubLObject tree)
  {
    final SubLObject hl_vars = list_utilities.tree_gather( tree, Symbols.symbol_function( $sym170$SHOP_VARIABLEP ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject new_tree = conses_high.copy_tree( tree );
    SubLObject cdolist_list_var = hl_vars;
    SubLObject cur_var = NIL;
    cur_var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != shop_variable_manager_managed_variableP_method( self, cur_var ) )
      {
        new_tree = conses_high.nsubst( shop_variable_manager_recover_el_variable_method( self, cur_var ), cur_var, new_tree, UNPROVIDED, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cur_var = cdolist_list_var.first();
    }
    return new_tree;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 14809L)
  public static SubLObject shop_arg_isa_for_pred(final SubLObject pred, final SubLObject pos, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject assertions = NIL;
    SubLObject cols = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      assertions = kb_mapping.gather_gaf_arg_index( pred, ONE_INTEGER, $const193$argIsa, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    SubLObject cdolist_list_var = assertions;
    SubLObject cur_assertion = NIL;
    cur_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( assertions_high.gaf_arg2( cur_assertion ).eql( pos ) )
      {
        cols = ConsesLow.cons( assertions_high.gaf_arg3( cur_assertion ), cols );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cur_assertion = cdolist_list_var.first();
    }
    return genls.min_cols( cols, mt, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 15438L)
  public static SubLObject shop_arg_genl_for_pred(final SubLObject pred, final SubLObject pos, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject assertions = NIL;
    SubLObject cols = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym194$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      assertions = kb_mapping.gather_gaf_arg_index( pred, ONE_INTEGER, $const195$argGenl, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    SubLObject cdolist_list_var = assertions;
    SubLObject cur_assertion = NIL;
    cur_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( assertions_high.gaf_arg2( cur_assertion ).eql( pos ) )
      {
        cols = ConsesLow.cons( assertions_high.gaf_arg3( cur_assertion ), cols );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cur_assertion = cdolist_list_var.first();
    }
    return genls.min_cols( cols, mt, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 16000L)
  public static SubLObject shop_initial_extent_for_position(final SubLObject pred, final SubLObject pos, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg_isa = shop_arg_isa_for_pred( pred, pos, mt );
    final SubLObject arg_genls = shop_arg_genl_for_pred( pred, pos, mt );
    SubLObject extent = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL != arg_genls )
      {
        extent = keyhash_utilities.fast_intersection( isa.all_fort_instances( arg_isa, UNPROVIDED, UNPROVIDED ), genls.all_specs( arg_genls, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        extent = isa.all_fort_instances( arg_isa, UNPROVIDED, UNPROVIDED );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return extent;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-internals.lisp", position = 16410L)
  public static SubLObject shop_initial_multibinding_for_task(final SubLObject task, final SubLObject mt)
  {
    final SubLObject free_variables = el_utilities.sentence_free_variables( task, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject predicate = el_utilities.literal_predicate( task, UNPROVIDED );
    final SubLObject mbinding = multibindings.create_mb();
    SubLObject cdolist_list_var = free_variables;
    SubLObject cur_var = NIL;
    cur_var = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject position = Sequences.position( cur_var, task, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject initial_extent = shop_initial_extent_for_position( predicate, position, mt );
      final SubLObject initial_items = multibindings.mb_make_entry_with_null_supports( initial_extent );
      if( NIL != initial_extent )
      {
        multibindings.set_mb_var_entry( mbinding, cur_var, initial_items );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cur_var = cdolist_list_var.first();
    }
    return mbinding;
  }

  public static SubLObject declare_shop_internals_file()
  {
    SubLFiles.declareFunction( me, "lispify_cyc_bindings", "LISPIFY-CYC-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_translate_plan", "SHOP-TRANSLATE-PLAN", 1, 0, false );
    SubLFiles.declareMacro( me, "inc_slot", "INC-SLOT" );
    SubLFiles.declareFunction( me, "process_timer_p", "PROCESS-TIMER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_statistic_manager_last_call_real_time", "GET-STATISTIC-MANAGER-LAST-CALL-REAL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "set_statistic_manager_last_call_real_time", "SET-STATISTIC-MANAGER-LAST-CALL-REAL-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "get_statistic_manager_last_call_run_time", "GET-STATISTIC-MANAGER-LAST-CALL-RUN-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "set_statistic_manager_last_call_run_time", "SET-STATISTIC-MANAGER-LAST-CALL-RUN-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "get_statistic_manager_end_real_time", "GET-STATISTIC-MANAGER-END-REAL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "set_statistic_manager_end_real_time", "SET-STATISTIC-MANAGER-END-REAL-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "get_statistic_manager_end_run_time", "GET-STATISTIC-MANAGER-END-RUN-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "set_statistic_manager_end_run_time", "SET-STATISTIC-MANAGER-END-RUN-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "get_statistic_manager_start_real_time", "GET-STATISTIC-MANAGER-START-REAL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "set_statistic_manager_start_real_time", "SET-STATISTIC-MANAGER-START-REAL-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "get_statistic_manager_start_run_time", "GET-STATISTIC-MANAGER-START-RUN-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "set_statistic_manager_start_run_time", "SET-STATISTIC-MANAGER-START-RUN-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "get_statistic_manager_timingP", "GET-STATISTIC-MANAGER-TIMING?", 1, 0, false );
    SubLFiles.declareFunction( me, "set_statistic_manager_timingP", "SET-STATISTIC-MANAGER-TIMING?", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_statistic_manager_class", "SUBLOOP-RESERVED-INITIALIZE-STATISTIC-MANAGER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_statistic_manager_instance", "SUBLOOP-RESERVED-INITIALIZE-STATISTIC-MANAGER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "statistic_manager_p", "STATISTIC-MANAGER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "statistic_manager_initialize_method", "STATISTIC-MANAGER-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "statistic_manager_get_run_time_method", "STATISTIC-MANAGER-GET-RUN-TIME-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "statistic_manager_get_real_time_method", "STATISTIC-MANAGER-GET-REAL-TIME-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "statistic_manager_reset_last_call_time_method", "STATISTIC-MANAGER-RESET-LAST-CALL-TIME-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "statistic_manager_start_timing_method", "STATISTIC-MANAGER-START-TIMING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "statistic_manager_resume_timing_method", "STATISTIC-MANAGER-RESUME-TIMING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "statistic_manager_stop_timing_method", "STATISTIC-MANAGER-STOP-TIMING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "statistic_manager_is_timingP_method", "STATISTIC-MANAGER-IS-TIMING?-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "statistic_manager_elapsed_real_time_method", "STATISTIC-MANAGER-ELAPSED-REAL-TIME-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "statistic_manager_elapsed_run_time_method", "STATISTIC-MANAGER-ELAPSED-RUN-TIME-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "statistic_manager_reset_timing_method", "STATISTIC-MANAGER-RESET-TIMING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "statistic_manager_elapsed_real_time_since_last_call_method", "STATISTIC-MANAGER-ELAPSED-REAL-TIME-SINCE-LAST-CALL-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "statistic_manager_elapsed_run_time_since_last_call_method", "STATISTIC-MANAGER-ELAPSED-RUN-TIME-SINCE-LAST-CALL-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_shop_statistic_manager_plans", "GET-SHOP-STATISTIC-MANAGER-PLANS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_statistic_manager_plans", "SET-SHOP-STATISTIC-MANAGER-PLANS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_statistic_manager_plan_counter", "GET-SHOP-STATISTIC-MANAGER-PLAN-COUNTER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_statistic_manager_plan_counter", "SET-SHOP-STATISTIC-MANAGER-PLAN-COUNTER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_statistic_manager_plan_state_ask_counter", "GET-SHOP-STATISTIC-MANAGER-PLAN-STATE-ASK-COUNTER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_statistic_manager_plan_state_ask_counter", "SET-SHOP-STATISTIC-MANAGER-PLAN-STATE-ASK-COUNTER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_statistic_manager_fi_ask_counter", "GET-SHOP-STATISTIC-MANAGER-FI-ASK-COUNTER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_statistic_manager_fi_ask_counter", "SET-SHOP-STATISTIC-MANAGER-FI-ASK-COUNTER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_statistic_manager_inference_counter", "GET-SHOP-STATISTIC-MANAGER-INFERENCE-COUNTER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_statistic_manager_inference_counter", "SET-SHOP-STATISTIC-MANAGER-INFERENCE-COUNTER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_statistic_manager_method_counter", "GET-SHOP-STATISTIC-MANAGER-METHOD-COUNTER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_statistic_manager_method_counter", "SET-SHOP-STATISTIC-MANAGER-METHOD-COUNTER", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_statistic_manager_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-STATISTIC-MANAGER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_statistic_manager_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-STATISTIC-MANAGER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_statistic_manager_p", "SHOP-STATISTIC-MANAGER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_statistic_manager_initialize_method", "SHOP-STATISTIC-MANAGER-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_statistic_manager_reset_counters_method", "SHOP-STATISTIC-MANAGER-RESET-COUNTERS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_statistic_manager_add_fi_ask_method", "SHOP-STATISTIC-MANAGER-ADD-FI-ASK-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_statistic_manager_add_plan_state_ask_method", "SHOP-STATISTIC-MANAGER-ADD-PLAN-STATE-ASK-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_statistic_manager_add_expansion_method", "SHOP-STATISTIC-MANAGER-ADD-EXPANSION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_statistic_manager_add_inference_method", "SHOP-STATISTIC-MANAGER-ADD-INFERENCE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_statistic_manager_add_plan_method", "SHOP-STATISTIC-MANAGER-ADD-PLAN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_statistic_manager_number_of_inferences_method", "SHOP-STATISTIC-MANAGER-NUMBER-OF-INFERENCES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_statistic_manager_number_of_methods_method", "SHOP-STATISTIC-MANAGER-NUMBER-OF-METHODS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_statistic_manager_number_of_expansions_method", "SHOP-STATISTIC-MANAGER-NUMBER-OF-EXPANSIONS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_statistic_manager_number_of_plans_method", "SHOP-STATISTIC-MANAGER-NUMBER-OF-PLANS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_statistic_manager_number_of_fi_asks_method", "SHOP-STATISTIC-MANAGER-NUMBER-OF-FI-ASKS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_statistic_manager_number_of_plan_state_asks_method", "SHOP-STATISTIC-MANAGER-NUMBER-OF-PLAN-STATE-ASKS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_shop_variable_manager_variable_assoc_table", "GET-SHOP-VARIABLE-MANAGER-VARIABLE-ASSOC-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_variable_manager_variable_assoc_table", "SET-SHOP-VARIABLE-MANAGER-VARIABLE-ASSOC-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_variable_manager_variable_prefix", "GET-SHOP-VARIABLE-MANAGER-VARIABLE-PREFIX", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_variable_manager_variable_prefix", "SET-SHOP-VARIABLE-MANAGER-VARIABLE-PREFIX", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_variable_manager_variable_counter", "GET-SHOP-VARIABLE-MANAGER-VARIABLE-COUNTER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_variable_manager_variable_counter", "SET-SHOP-VARIABLE-MANAGER-VARIABLE-COUNTER", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_variable_manager_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-VARIABLE-MANAGER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_variable_manager_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-VARIABLE-MANAGER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_variable_manager_p", "SHOP-VARIABLE-MANAGER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_variable_manager_initialize_method", "SHOP-VARIABLE-MANAGER-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_variable_manager_generate_variable_method", "SHOP-VARIABLE-MANAGER-GENERATE-VARIABLE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_variable_manager_generate_binding_pair_method", "SHOP-VARIABLE-MANAGER-GENERATE-BINDING-PAIR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_variable_manager_generate_binding_list_method", "SHOP-VARIABLE-MANAGER-GENERATE-BINDING-LIST-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_variable_manager_recover_el_variable_method", "SHOP-VARIABLE-MANAGER-RECOVER-EL-VARIABLE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_variable_manager_gather_el_variables_method", "SHOP-VARIABLE-MANAGER-GATHER-EL-VARIABLES-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_variable_manager_managed_variableP_method", "SHOP-VARIABLE-MANAGER-MANAGED-VARIABLE?-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_variable_manager_generated_variableP_method", "SHOP-VARIABLE-MANAGER-GENERATED-VARIABLE?-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_variable_manager_generated_variables_bound_method", "SHOP-VARIABLE-MANAGER-GENERATED-VARIABLES-BOUND-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_variable_manager_replace_variables_method", "SHOP-VARIABLE-MANAGER-REPLACE-VARIABLES-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_variable_manager_recover_el_method", "SHOP-VARIABLE-MANAGER-RECOVER-EL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_arg_isa_for_pred", "SHOP-ARG-ISA-FOR-PRED", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_arg_genl_for_pred", "SHOP-ARG-GENL-FOR-PRED", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_initial_extent_for_position", "SHOP-INITIAL-EXTENT-FOR-POSITION", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_initial_multibinding_for_task", "SHOP-INITIAL-MULTIBINDING-FOR-TASK", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_shop_internals_file()
  {
    $shop_verbose_keys$ = SubLFiles.defparameter( "*SHOP-VERBOSE-KEYS*", $list0 );
    $shop_gc$ = SubLFiles.defparameter( "*SHOP-GC*", NIL );
    $shop_verbose_target$ = SubLFiles.defparameter( "*SHOP-VERBOSE-TARGET*", $kw1$STDOUT );
    return NIL;
  }

  public static SubLObject setup_shop_internals_file()
  {
    interfaces.new_interface( $sym8$PROCESS_TIMER, NIL, NIL, $list9 );
    classes.subloop_new_class( $sym10$STATISTIC_MANAGER, $sym11$OBJECT, $list12, NIL, $list13 );
    classes.class_set_implements_slot_listeners( $sym10$STATISTIC_MANAGER, NIL );
    classes.subloop_note_class_initialization_function( $sym10$STATISTIC_MANAGER, $sym22$SUBLOOP_RESERVED_INITIALIZE_STATISTIC_MANAGER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym10$STATISTIC_MANAGER, $sym25$SUBLOOP_RESERVED_INITIALIZE_STATISTIC_MANAGER_INSTANCE );
    subloop_reserved_initialize_statistic_manager_class( $sym10$STATISTIC_MANAGER );
    methods.methods_incorporate_instance_method( $sym26$INITIALIZE, $sym10$STATISTIC_MANAGER, $list27, NIL, $list28 );
    methods.subloop_register_instance_method( $sym10$STATISTIC_MANAGER, $sym26$INITIALIZE, $sym29$STATISTIC_MANAGER_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym30$GET_RUN_TIME, $sym10$STATISTIC_MANAGER, $list31, NIL, $list32 );
    methods.subloop_register_instance_method( $sym10$STATISTIC_MANAGER, $sym30$GET_RUN_TIME, $sym33$STATISTIC_MANAGER_GET_RUN_TIME_METHOD );
    methods.methods_incorporate_instance_method( $sym34$GET_REAL_TIME, $sym10$STATISTIC_MANAGER, $list31, NIL, $list35 );
    methods.subloop_register_instance_method( $sym10$STATISTIC_MANAGER, $sym34$GET_REAL_TIME, $sym36$STATISTIC_MANAGER_GET_REAL_TIME_METHOD );
    methods.methods_incorporate_instance_method( $sym37$RESET_LAST_CALL_TIME, $sym10$STATISTIC_MANAGER, $list31, NIL, $list38 );
    methods.subloop_register_instance_method( $sym10$STATISTIC_MANAGER, $sym37$RESET_LAST_CALL_TIME, $sym40$STATISTIC_MANAGER_RESET_LAST_CALL_TIME_METHOD );
    methods.methods_incorporate_instance_method( $sym41$START_TIMING, $sym10$STATISTIC_MANAGER, $list42, NIL, $list43 );
    methods.subloop_register_instance_method( $sym10$STATISTIC_MANAGER, $sym41$START_TIMING, $sym45$STATISTIC_MANAGER_START_TIMING_METHOD );
    methods.methods_incorporate_instance_method( $sym46$RESUME_TIMING, $sym10$STATISTIC_MANAGER, $list42, NIL, $list47 );
    methods.subloop_register_instance_method( $sym10$STATISTIC_MANAGER, $sym46$RESUME_TIMING, $sym49$STATISTIC_MANAGER_RESUME_TIMING_METHOD );
    methods.methods_incorporate_instance_method( $sym50$STOP_TIMING, $sym10$STATISTIC_MANAGER, $list42, NIL, $list51 );
    methods.subloop_register_instance_method( $sym10$STATISTIC_MANAGER, $sym50$STOP_TIMING, $sym53$STATISTIC_MANAGER_STOP_TIMING_METHOD );
    methods.methods_incorporate_instance_method( $sym54$IS_TIMING_, $sym10$STATISTIC_MANAGER, $list42, NIL, $list55 );
    methods.subloop_register_instance_method( $sym10$STATISTIC_MANAGER, $sym54$IS_TIMING_, $sym57$STATISTIC_MANAGER_IS_TIMING__METHOD );
    methods.methods_incorporate_instance_method( $sym58$ELAPSED_REAL_TIME, $sym10$STATISTIC_MANAGER, $list42, NIL, $list59 );
    methods.subloop_register_instance_method( $sym10$STATISTIC_MANAGER, $sym58$ELAPSED_REAL_TIME, $sym61$STATISTIC_MANAGER_ELAPSED_REAL_TIME_METHOD );
    methods.methods_incorporate_instance_method( $sym62$ELAPSED_RUN_TIME, $sym10$STATISTIC_MANAGER, $list42, NIL, $list63 );
    methods.subloop_register_instance_method( $sym10$STATISTIC_MANAGER, $sym62$ELAPSED_RUN_TIME, $sym65$STATISTIC_MANAGER_ELAPSED_RUN_TIME_METHOD );
    methods.methods_incorporate_instance_method( $sym66$RESET_TIMING, $sym10$STATISTIC_MANAGER, $list42, NIL, $list67 );
    methods.subloop_register_instance_method( $sym10$STATISTIC_MANAGER, $sym66$RESET_TIMING, $sym69$STATISTIC_MANAGER_RESET_TIMING_METHOD );
    methods.methods_incorporate_instance_method( $sym70$ELAPSED_REAL_TIME_SINCE_LAST_CALL, $sym10$STATISTIC_MANAGER, $list42, NIL, $list71 );
    methods.subloop_register_instance_method( $sym10$STATISTIC_MANAGER, $sym70$ELAPSED_REAL_TIME_SINCE_LAST_CALL, $sym73$STATISTIC_MANAGER_ELAPSED_REAL_TIME_SINCE_LAST_CALL_METHOD );
    methods.methods_incorporate_instance_method( $sym74$ELAPSED_RUN_TIME_SINCE_LAST_CALL, $sym10$STATISTIC_MANAGER, $list42, NIL, $list75 );
    methods.subloop_register_instance_method( $sym10$STATISTIC_MANAGER, $sym74$ELAPSED_RUN_TIME_SINCE_LAST_CALL, $sym77$STATISTIC_MANAGER_ELAPSED_RUN_TIME_SINCE_LAST_CALL_METHOD );
    classes.subloop_new_class( $sym78$SHOP_STATISTIC_MANAGER, $sym10$STATISTIC_MANAGER, NIL, NIL, $list79 );
    classes.class_set_implements_slot_listeners( $sym78$SHOP_STATISTIC_MANAGER, NIL );
    classes.subloop_note_class_initialization_function( $sym78$SHOP_STATISTIC_MANAGER, $sym80$SUBLOOP_RESERVED_INITIALIZE_SHOP_STATISTIC_MANAGER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym78$SHOP_STATISTIC_MANAGER, $sym87$SUBLOOP_RESERVED_INITIALIZE_SHOP_STATISTIC_MANAGER_INSTANCE );
    subloop_reserved_initialize_shop_statistic_manager_class( $sym78$SHOP_STATISTIC_MANAGER );
    methods.methods_incorporate_instance_method( $sym26$INITIALIZE, $sym78$SHOP_STATISTIC_MANAGER, $list27, NIL, $list88 );
    methods.subloop_register_instance_method( $sym78$SHOP_STATISTIC_MANAGER, $sym26$INITIALIZE, $sym89$SHOP_STATISTIC_MANAGER_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym90$RESET_COUNTERS, $sym78$SHOP_STATISTIC_MANAGER, $list42, NIL, $list91 );
    methods.subloop_register_instance_method( $sym78$SHOP_STATISTIC_MANAGER, $sym90$RESET_COUNTERS, $sym93$SHOP_STATISTIC_MANAGER_RESET_COUNTERS_METHOD );
    methods.methods_incorporate_instance_method( $sym94$ADD_FI_ASK, $sym78$SHOP_STATISTIC_MANAGER, $list95, NIL, $list96 );
    methods.subloop_register_instance_method( $sym78$SHOP_STATISTIC_MANAGER, $sym94$ADD_FI_ASK, $sym97$SHOP_STATISTIC_MANAGER_ADD_FI_ASK_METHOD );
    methods.methods_incorporate_instance_method( $sym98$ADD_PLAN_STATE_ASK, $sym78$SHOP_STATISTIC_MANAGER, $list95, NIL, $list99 );
    methods.subloop_register_instance_method( $sym78$SHOP_STATISTIC_MANAGER, $sym98$ADD_PLAN_STATE_ASK, $sym100$SHOP_STATISTIC_MANAGER_ADD_PLAN_STATE_ASK_METHOD );
    methods.methods_incorporate_instance_method( $sym101$ADD_EXPANSION, $sym78$SHOP_STATISTIC_MANAGER, $list95, NIL, $list102 );
    methods.subloop_register_instance_method( $sym78$SHOP_STATISTIC_MANAGER, $sym101$ADD_EXPANSION, $sym103$SHOP_STATISTIC_MANAGER_ADD_EXPANSION_METHOD );
    methods.methods_incorporate_instance_method( $sym104$ADD_INFERENCE, $sym78$SHOP_STATISTIC_MANAGER, $list95, NIL, $list105 );
    methods.subloop_register_instance_method( $sym78$SHOP_STATISTIC_MANAGER, $sym104$ADD_INFERENCE, $sym106$SHOP_STATISTIC_MANAGER_ADD_INFERENCE_METHOD );
    methods.methods_incorporate_instance_method( $sym107$ADD_PLAN, $sym78$SHOP_STATISTIC_MANAGER, $list95, $list108, $list109 );
    methods.subloop_register_instance_method( $sym78$SHOP_STATISTIC_MANAGER, $sym107$ADD_PLAN, $sym110$SHOP_STATISTIC_MANAGER_ADD_PLAN_METHOD );
    methods.methods_incorporate_instance_method( $sym111$NUMBER_OF_INFERENCES, $sym78$SHOP_STATISTIC_MANAGER, $list42, NIL, $list112 );
    methods.subloop_register_instance_method( $sym78$SHOP_STATISTIC_MANAGER, $sym111$NUMBER_OF_INFERENCES, $sym114$SHOP_STATISTIC_MANAGER_NUMBER_OF_INFERENCES_METHOD );
    methods.methods_incorporate_instance_method( $sym115$NUMBER_OF_METHODS, $sym78$SHOP_STATISTIC_MANAGER, $list42, NIL, $list116 );
    methods.subloop_register_instance_method( $sym78$SHOP_STATISTIC_MANAGER, $sym115$NUMBER_OF_METHODS, $sym118$SHOP_STATISTIC_MANAGER_NUMBER_OF_METHODS_METHOD );
    methods.methods_incorporate_instance_method( $sym119$NUMBER_OF_EXPANSIONS, $sym78$SHOP_STATISTIC_MANAGER, $list42, NIL, $list116 );
    methods.subloop_register_instance_method( $sym78$SHOP_STATISTIC_MANAGER, $sym119$NUMBER_OF_EXPANSIONS, $sym121$SHOP_STATISTIC_MANAGER_NUMBER_OF_EXPANSIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym122$NUMBER_OF_PLANS, $sym78$SHOP_STATISTIC_MANAGER, $list42, NIL, $list123 );
    methods.subloop_register_instance_method( $sym78$SHOP_STATISTIC_MANAGER, $sym122$NUMBER_OF_PLANS, $sym125$SHOP_STATISTIC_MANAGER_NUMBER_OF_PLANS_METHOD );
    methods.methods_incorporate_instance_method( $sym126$NUMBER_OF_FI_ASKS, $sym78$SHOP_STATISTIC_MANAGER, $list42, NIL, $list127 );
    methods.subloop_register_instance_method( $sym78$SHOP_STATISTIC_MANAGER, $sym126$NUMBER_OF_FI_ASKS, $sym129$SHOP_STATISTIC_MANAGER_NUMBER_OF_FI_ASKS_METHOD );
    methods.methods_incorporate_instance_method( $sym130$NUMBER_OF_PLAN_STATE_ASKS, $sym78$SHOP_STATISTIC_MANAGER, $list42, NIL, $list131 );
    methods.subloop_register_instance_method( $sym78$SHOP_STATISTIC_MANAGER, $sym130$NUMBER_OF_PLAN_STATE_ASKS, $sym133$SHOP_STATISTIC_MANAGER_NUMBER_OF_PLAN_STATE_ASKS_METHOD );
    classes.subloop_new_class( $sym134$SHOP_VARIABLE_MANAGER, $sym11$OBJECT, NIL, NIL, $list135 );
    classes.class_set_implements_slot_listeners( $sym134$SHOP_VARIABLE_MANAGER, NIL );
    classes.subloop_note_class_initialization_function( $sym134$SHOP_VARIABLE_MANAGER, $sym138$SUBLOOP_RESERVED_INITIALIZE_SHOP_VARIABLE_MANAGER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym134$SHOP_VARIABLE_MANAGER, $sym140$SUBLOOP_RESERVED_INITIALIZE_SHOP_VARIABLE_MANAGER_INSTANCE );
    subloop_reserved_initialize_shop_variable_manager_class( $sym134$SHOP_VARIABLE_MANAGER );
    methods.methods_incorporate_instance_method( $sym26$INITIALIZE, $sym134$SHOP_VARIABLE_MANAGER, $list141, NIL, $list142 );
    methods.subloop_register_instance_method( $sym134$SHOP_VARIABLE_MANAGER, $sym26$INITIALIZE, $sym145$SHOP_VARIABLE_MANAGER_INITIALIZE_METHOD );
    methods.methods_incorporate_class_method( $sym146$GENERATE_VARIABLE, $sym134$SHOP_VARIABLE_MANAGER, $list31, NIL, $list147 );
    methods.subloop_register_class_method( $sym134$SHOP_VARIABLE_MANAGER, $sym146$GENERATE_VARIABLE, $sym150$SHOP_VARIABLE_MANAGER_GENERATE_VARIABLE_METHOD );
    methods.methods_incorporate_instance_method( $sym151$GENERATE_BINDING_PAIR, $sym134$SHOP_VARIABLE_MANAGER, $list42, $list152, $list153 );
    methods.subloop_register_instance_method( $sym134$SHOP_VARIABLE_MANAGER, $sym151$GENERATE_BINDING_PAIR, $sym155$SHOP_VARIABLE_MANAGER_GENERATE_BINDING_PAIR_METHOD );
    methods.methods_incorporate_instance_method( $sym156$GENERATE_BINDING_LIST, $sym134$SHOP_VARIABLE_MANAGER, $list42, $list157, $list158 );
    methods.subloop_register_instance_method( $sym134$SHOP_VARIABLE_MANAGER, $sym156$GENERATE_BINDING_LIST, $sym159$SHOP_VARIABLE_MANAGER_GENERATE_BINDING_LIST_METHOD );
    methods.methods_incorporate_instance_method( $sym160$RECOVER_EL_VARIABLE, $sym134$SHOP_VARIABLE_MANAGER, $list42, $list161, $list162 );
    methods.subloop_register_instance_method( $sym134$SHOP_VARIABLE_MANAGER, $sym160$RECOVER_EL_VARIABLE, $sym166$SHOP_VARIABLE_MANAGER_RECOVER_EL_VARIABLE_METHOD );
    methods.methods_incorporate_instance_method( $sym167$GATHER_EL_VARIABLES, $sym134$SHOP_VARIABLE_MANAGER, $list42, $list168, $list169 );
    methods.subloop_register_instance_method( $sym134$SHOP_VARIABLE_MANAGER, $sym167$GATHER_EL_VARIABLES, $sym171$SHOP_VARIABLE_MANAGER_GATHER_EL_VARIABLES_METHOD );
    methods.methods_incorporate_instance_method( $sym172$MANAGED_VARIABLE_, $sym134$SHOP_VARIABLE_MANAGER, $list31, $list173, $list174 );
    methods.subloop_register_instance_method( $sym134$SHOP_VARIABLE_MANAGER, $sym172$MANAGED_VARIABLE_, $sym176$SHOP_VARIABLE_MANAGER_MANAGED_VARIABLE__METHOD );
    methods.methods_incorporate_class_method( $sym177$GENERATED_VARIABLE_, $sym134$SHOP_VARIABLE_MANAGER, $list42, $list173, $list178 );
    methods.subloop_register_class_method( $sym134$SHOP_VARIABLE_MANAGER, $sym177$GENERATED_VARIABLE_, $sym181$SHOP_VARIABLE_MANAGER_GENERATED_VARIABLE__METHOD );
    methods.methods_incorporate_class_method( $sym182$GENERATED_VARIABLES_BOUND, $sym134$SHOP_VARIABLE_MANAGER, $list42, $list183, $list184 );
    methods.subloop_register_class_method( $sym134$SHOP_VARIABLE_MANAGER, $sym182$GENERATED_VARIABLES_BOUND, $sym185$SHOP_VARIABLE_MANAGER_GENERATED_VARIABLES_BOUND_METHOD );
    methods.methods_incorporate_instance_method( $sym186$REPLACE_VARIABLES, $sym134$SHOP_VARIABLE_MANAGER, $list42, $list168, $list187 );
    methods.subloop_register_instance_method( $sym134$SHOP_VARIABLE_MANAGER, $sym186$REPLACE_VARIABLES, $sym188$SHOP_VARIABLE_MANAGER_REPLACE_VARIABLES_METHOD );
    methods.methods_incorporate_instance_method( $sym189$RECOVER_EL, $sym134$SHOP_VARIABLE_MANAGER, $list42, $list190, $list191 );
    methods.subloop_register_instance_method( $sym134$SHOP_VARIABLE_MANAGER, $sym189$RECOVER_EL, $sym192$SHOP_VARIABLE_MANAGER_RECOVER_EL_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_shop_internals_file();
  }

  @Override
  public void initializeVariables()
  {
    init_shop_internals_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_shop_internals_file();
  }
  static
  {
    me = new shop_internals();
    $shop_verbose_keys$ = null;
    $shop_gc$ = null;
    $shop_verbose_target$ = null;
    $list0 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeKeyword( "CUTOFFS" ), ONE_INTEGER ), ConsesLow.cons( makeKeyword( "TASKS" ), TWO_INTEGER ), ConsesLow.cons( makeKeyword( "OPERATORS" ), THREE_INTEGER ),
      ConsesLow.cons( makeKeyword( "STATES" ), FOUR_INTEGER ), ConsesLow.cons( makeKeyword( "METHODS" ), FIVE_INTEGER ), ConsesLow.cons( makeKeyword( "PLANNER-RULES" ), makeDouble( 5.5 ) ), ConsesLow.cons( makeKeyword(
          "MBIND-CUTOFFS" ), SIX_INTEGER ), ConsesLow.cons( makeKeyword( "GOALS" ), SEVEN_INTEGER ), ConsesLow.cons( makeKeyword( "CYC-QUERY" ), EIGHT_INTEGER ), ConsesLow.cons( makeKeyword( "ALL" ), NINE_INTEGER )
    } );
    $kw1$STDOUT = makeKeyword( "STDOUT" );
    $list2 = ConsesLow.list( ConsesLow.cons( T, T ) );
    $list3 = ConsesLow.list( NIL );
    $list4 = ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "SLOT" ) );
    $sym5$SET_SLOT = makeSymbol( "SET-SLOT" );
    $sym6$1_ = makeSymbol( "1+" );
    $sym7$GET_SLOT = makeSymbol( "GET-SLOT" );
    $sym8$PROCESS_TIMER = makeSymbol( "PROCESS-TIMER" );
    $list9 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "START-TIMING" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
        makeSymbol( "RESET-TIMING" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "STOP-TIMING" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "RESUME-TIMING" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ELAPSED-REAL-TIME" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ELAPSED-RUN-TIME" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
          "ELAPSED-REAL-TIME-SINCE-LAST-CALL" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ELAPSED-RUN-TIME-SINCE-LAST-CALL" ), NIL, makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "IS-TIMING?" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym10$STATISTIC_MANAGER = makeSymbol( "STATISTIC-MANAGER" );
    $sym11$OBJECT = makeSymbol( "OBJECT" );
    $list12 = ConsesLow.list( makeSymbol( "PROCESS-TIMER" ) );
    $list13 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "TIMING?" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "START-RUN-TIME" ), makeKeyword(
        "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "START-REAL-TIME" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "END-RUN-TIME" ), makeKeyword(
            "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "END-REAL-TIME" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LAST-CALL-RUN-TIME" ),
                makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "LAST-CALL-REAL-TIME" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol(
                    "DEF-INSTANCE-METHOD" ), makeSymbol( "RESET-LAST-CALL-TIME" ), NIL, makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-RUN-TIME" ), NIL, makeKeyword(
                        "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-REAL-TIME" ), NIL, makeKeyword( "PRIVATE" ) )
    } );
    $sym14$LAST_CALL_REAL_TIME = makeSymbol( "LAST-CALL-REAL-TIME" );
    $sym15$LAST_CALL_RUN_TIME = makeSymbol( "LAST-CALL-RUN-TIME" );
    $sym16$END_REAL_TIME = makeSymbol( "END-REAL-TIME" );
    $sym17$END_RUN_TIME = makeSymbol( "END-RUN-TIME" );
    $sym18$START_REAL_TIME = makeSymbol( "START-REAL-TIME" );
    $sym19$START_RUN_TIME = makeSymbol( "START-RUN-TIME" );
    $sym20$TIMING_ = makeSymbol( "TIMING?" );
    $sym21$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym22$SUBLOOP_RESERVED_INITIALIZE_STATISTIC_MANAGER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-STATISTIC-MANAGER-CLASS" );
    $sym23$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym24$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym25$SUBLOOP_RESERVED_INITIALIZE_STATISTIC_MANAGER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-STATISTIC-MANAGER-INSTANCE" );
    $sym26$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list27 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list28 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "RESET-TIMING" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
        "SELF" ) ) );
    $sym29$STATISTIC_MANAGER_INITIALIZE_METHOD = makeSymbol( "STATISTIC-MANAGER-INITIALIZE-METHOD" );
    $sym30$GET_RUN_TIME = makeSymbol( "GET-RUN-TIME" );
    $list31 = ConsesLow.list( makeKeyword( "PRIVATE" ) );
    $list32 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-RUN-TIME" ) ) ) );
    $sym33$STATISTIC_MANAGER_GET_RUN_TIME_METHOD = makeSymbol( "STATISTIC-MANAGER-GET-RUN-TIME-METHOD" );
    $sym34$GET_REAL_TIME = makeSymbol( "GET-REAL-TIME" );
    $list35 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "GET-INTERNAL-REAL-TIME" ) ) ) );
    $sym36$STATISTIC_MANAGER_GET_REAL_TIME_METHOD = makeSymbol( "STATISTIC-MANAGER-GET-REAL-TIME-METHOD" );
    $sym37$RESET_LAST_CALL_TIME = makeSymbol( "RESET-LAST-CALL-TIME" );
    $list38 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LAST-CALL-RUN-TIME" ), ConsesLow.list( makeSymbol( "GET-RUN-TIME" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
        makeSymbol( "LAST-CALL-REAL-TIME" ), ConsesLow.list( makeSymbol( "GET-REAL-TIME" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym39$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD" );
    $sym40$STATISTIC_MANAGER_RESET_LAST_CALL_TIME_METHOD = makeSymbol( "STATISTIC-MANAGER-RESET-LAST-CALL-TIME-METHOD" );
    $sym41$START_TIMING = makeSymbol( "START-TIMING" );
    $list42 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list43 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "START-RUN-TIME" ), ConsesLow.list( makeSymbol( "GET-RUN-TIME" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
        makeSymbol( "START-REAL-TIME" ), ConsesLow.list( makeSymbol( "GET-REAL-TIME" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "RESET-LAST-CALL-TIME" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol(
            "CSETQ" ), makeSymbol( "TIMING?" ), T ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym44$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD" );
    $sym45$STATISTIC_MANAGER_START_TIMING_METHOD = makeSymbol( "STATISTIC-MANAGER-START-TIMING-METHOD" );
    $sym46$RESUME_TIMING = makeSymbol( "RESUME-TIMING" );
    $list47 = ConsesLow.list( ConsesLow.list( makeSymbol( "RESET-LAST-CALL-TIME" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TIMING?" ), T ), ConsesLow.list( makeSymbol( "RET" ),
        NIL ) );
    $sym48$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD" );
    $sym49$STATISTIC_MANAGER_RESUME_TIMING_METHOD = makeSymbol( "STATISTIC-MANAGER-RESUME-TIMING-METHOD" );
    $sym50$STOP_TIMING = makeSymbol( "STOP-TIMING" );
    $list51 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "END-RUN-TIME" ), ConsesLow.list( makeSymbol( "GET-RUN-TIME" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
        makeSymbol( "END-REAL-TIME" ), ConsesLow.list( makeSymbol( "GET-REAL-TIME" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TIMING?" ), NIL ), ConsesLow.list( makeSymbol( "RET" ),
            NIL ) );
    $sym52$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD" );
    $sym53$STATISTIC_MANAGER_STOP_TIMING_METHOD = makeSymbol( "STATISTIC-MANAGER-STOP-TIMING-METHOD" );
    $sym54$IS_TIMING_ = makeSymbol( "IS-TIMING?" );
    $list55 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TIMING?" ) ) );
    $sym56$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD" );
    $sym57$STATISTIC_MANAGER_IS_TIMING__METHOD = makeSymbol( "STATISTIC-MANAGER-IS-TIMING?-METHOD" );
    $sym58$ELAPSED_REAL_TIME = makeSymbol( "ELAPSED-REAL-TIME" );
    $list59 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "TIMING?" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "-" ), ConsesLow.list( makeSymbol( "GET-REAL-TIME" ),
        makeSymbol( "SELF" ) ), makeSymbol( "START-REAL-TIME" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "-" ), makeSymbol( "END-REAL-TIME" ), makeSymbol( "START-REAL-TIME" ) ) ) ) );
    $sym60$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD" );
    $sym61$STATISTIC_MANAGER_ELAPSED_REAL_TIME_METHOD = makeSymbol( "STATISTIC-MANAGER-ELAPSED-REAL-TIME-METHOD" );
    $sym62$ELAPSED_RUN_TIME = makeSymbol( "ELAPSED-RUN-TIME" );
    $list63 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "TIMING?" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "-" ), ConsesLow.list( makeSymbol( "GET-RUN-TIME" ),
        makeSymbol( "SELF" ) ), makeSymbol( "START-RUN-TIME" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "-" ), makeSymbol( "END-RUN-TIME" ), makeSymbol( "START-RUN-TIME" ) ) ) ) );
    $sym64$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD" );
    $sym65$STATISTIC_MANAGER_ELAPSED_RUN_TIME_METHOD = makeSymbol( "STATISTIC-MANAGER-ELAPSED-RUN-TIME-METHOD" );
    $sym66$RESET_TIMING = makeSymbol( "RESET-TIMING" );
    $list67 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TIMING?" ), NIL ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "START-REAL-TIME" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol(
        "CSETQ" ), makeSymbol( "END-REAL-TIME" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "START-RUN-TIME" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
            "END-RUN-TIME" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LAST-CALL-RUN-TIME" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "LAST-CALL-REAL-TIME" ),
                ZERO_INTEGER ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym68$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD" );
    $sym69$STATISTIC_MANAGER_RESET_TIMING_METHOD = makeSymbol( "STATISTIC-MANAGER-RESET-TIMING-METHOD" );
    $sym70$ELAPSED_REAL_TIME_SINCE_LAST_CALL = makeSymbol( "ELAPSED-REAL-TIME-SINCE-LAST-CALL" );
    $list71 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "TIMING?" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ELAPSED-TIME" ), ConsesLow.list( makeSymbol(
        "-" ), ConsesLow.list( makeSymbol( "GET-REAL-TIME" ), makeSymbol( "SELF" ) ), makeSymbol( "LAST-CALL-REAL-TIME" ) ) ) ), ConsesLow.list( makeSymbol( "RESET-LAST-CALL-TIME" ), makeSymbol( "SELF" ) ), ConsesLow
            .list( makeSymbol( "RET" ), makeSymbol( "ELAPSED-TIME" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ELAPSED-TIME" ), ConsesLow.list( makeSymbol( "-" ), makeSymbol(
                "END-REAL-TIME" ), makeSymbol( "LAST-CALL-REAL-TIME" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ELAPSED-TIME" ) ) ) ) );
    $sym72$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD" );
    $sym73$STATISTIC_MANAGER_ELAPSED_REAL_TIME_SINCE_LAST_CALL_METHOD = makeSymbol( "STATISTIC-MANAGER-ELAPSED-REAL-TIME-SINCE-LAST-CALL-METHOD" );
    $sym74$ELAPSED_RUN_TIME_SINCE_LAST_CALL = makeSymbol( "ELAPSED-RUN-TIME-SINCE-LAST-CALL" );
    $list75 = ConsesLow.list( ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "TIMING?" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ELAPSED-TIME" ), ConsesLow.list( makeSymbol(
        "-" ), ConsesLow.list( makeSymbol( "GET-RUN-TIME" ), makeSymbol( "SELF" ) ), makeSymbol( "LAST-CALL-RUN-TIME" ) ) ) ), ConsesLow.list( makeSymbol( "RESET-LAST-CALL-TIME" ), makeSymbol( "SELF" ) ), ConsesLow.list(
            makeSymbol( "RET" ), makeSymbol( "ELAPSED-TIME" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ELAPSED-TIME" ), ConsesLow.list( makeSymbol( "-" ), makeSymbol(
                "END-RUN-TIME" ), makeSymbol( "LAST-CALL-RUN-TIME" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ELAPSED-TIME" ) ) ) ) );
    $sym76$OUTER_CATCH_FOR_STATISTIC_MANAGER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-STATISTIC-MANAGER-METHOD" );
    $sym77$STATISTIC_MANAGER_ELAPSED_RUN_TIME_SINCE_LAST_CALL_METHOD = makeSymbol( "STATISTIC-MANAGER-ELAPSED-RUN-TIME-SINCE-LAST-CALL-METHOD" );
    $sym78$SHOP_STATISTIC_MANAGER = makeSymbol( "SHOP-STATISTIC-MANAGER" );
    $list79 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "METHOD-COUNTER" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "INFERENCE-COUNTER" ), makeKeyword(
        "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "FI-ASK-COUNTER" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "PLAN-STATE-ASK-COUNTER" ), makeKeyword(
            "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "PLAN-COUNTER" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "PLANS" ), makeKeyword( "INSTANCE" ),
                makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                    makeSymbol( "RESET-COUNTERS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-EXPANSION" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                        makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-INFERENCE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-PLAN" ), ConsesLow.list(
                            makeSymbol( "PLAN" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NUMBER-OF-INFERENCES" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                                makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NUMBER-OF-EXPANSIONS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                                    "NUMBER-OF-PLANS" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym80$SUBLOOP_RESERVED_INITIALIZE_SHOP_STATISTIC_MANAGER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-STATISTIC-MANAGER-CLASS" );
    $sym81$METHOD_COUNTER = makeSymbol( "METHOD-COUNTER" );
    $sym82$INFERENCE_COUNTER = makeSymbol( "INFERENCE-COUNTER" );
    $sym83$FI_ASK_COUNTER = makeSymbol( "FI-ASK-COUNTER" );
    $sym84$PLAN_STATE_ASK_COUNTER = makeSymbol( "PLAN-STATE-ASK-COUNTER" );
    $sym85$PLAN_COUNTER = makeSymbol( "PLAN-COUNTER" );
    $sym86$PLANS = makeSymbol( "PLANS" );
    $sym87$SUBLOOP_RESERVED_INITIALIZE_SHOP_STATISTIC_MANAGER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-STATISTIC-MANAGER-INSTANCE" );
    $list88 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "RESET-COUNTERS" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
        "SELF" ) ) );
    $sym89$SHOP_STATISTIC_MANAGER_INITIALIZE_METHOD = makeSymbol( "SHOP-STATISTIC-MANAGER-INITIALIZE-METHOD" );
    $sym90$RESET_COUNTERS = makeSymbol( "RESET-COUNTERS" );
    $list91 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "METHOD-COUNTER" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INFERENCE-COUNTER" ), ZERO_INTEGER ), ConsesLow
        .list( makeSymbol( "CSETQ" ), makeSymbol( "FI-ASK-COUNTER" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PLAN-STATE-ASK-COUNTER" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ),
            makeSymbol( "PLAN-COUNTER" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PLANS" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym92$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-STATISTIC-MANAGER-METHOD" );
    $sym93$SHOP_STATISTIC_MANAGER_RESET_COUNTERS_METHOD = makeSymbol( "SHOP-STATISTIC-MANAGER-RESET-COUNTERS-METHOD" );
    $sym94$ADD_FI_ASK = makeSymbol( "ADD-FI-ASK" );
    $list95 = ConsesLow.list( makeKeyword( "NO-MEMBER-VARIABLES" ), makeKeyword( "PUBLIC" ) );
    $list96 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FI-ASK-COUNTER" ) ), ConsesLow.list(
        makeSymbol( "+" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FI-ASK-COUNTER" ) ) ), ONE_INTEGER ) ) ) );
    $sym97$SHOP_STATISTIC_MANAGER_ADD_FI_ASK_METHOD = makeSymbol( "SHOP-STATISTIC-MANAGER-ADD-FI-ASK-METHOD" );
    $sym98$ADD_PLAN_STATE_ASK = makeSymbol( "ADD-PLAN-STATE-ASK" );
    $list99 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLAN-STATE-ASK-COUNTER" ) ),
        ConsesLow.list( makeSymbol( "+" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLAN-STATE-ASK-COUNTER" ) ) ), ONE_INTEGER ) ) ) );
    $sym100$SHOP_STATISTIC_MANAGER_ADD_PLAN_STATE_ASK_METHOD = makeSymbol( "SHOP-STATISTIC-MANAGER-ADD-PLAN-STATE-ASK-METHOD" );
    $sym101$ADD_EXPANSION = makeSymbol( "ADD-EXPANSION" );
    $list102 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "METHOD-COUNTER" ) ), ConsesLow.list(
        makeSymbol( "+" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "METHOD-COUNTER" ) ) ), ONE_INTEGER ) ) ) );
    $sym103$SHOP_STATISTIC_MANAGER_ADD_EXPANSION_METHOD = makeSymbol( "SHOP-STATISTIC-MANAGER-ADD-EXPANSION-METHOD" );
    $sym104$ADD_INFERENCE = makeSymbol( "ADD-INFERENCE" );
    $list105 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INFERENCE-COUNTER" ) ), ConsesLow
        .list( makeSymbol( "+" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INFERENCE-COUNTER" ) ) ), ONE_INTEGER ) ) ) );
    $sym106$SHOP_STATISTIC_MANAGER_ADD_INFERENCE_METHOD = makeSymbol( "SHOP-STATISTIC-MANAGER-ADD-INFERENCE-METHOD" );
    $sym107$ADD_PLAN = makeSymbol( "ADD-PLAN" );
    $list108 = ConsesLow.list( makeSymbol( "PLAN" ) );
    $list109 = ConsesLow.list( ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLANS" ) ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "PLAN" ),
        ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLANS" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "SET-SLOT" ),
            makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLAN-COUNTER" ) ), ConsesLow.list( makeSymbol( "+" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list(
                makeSymbol( "QUOTE" ), makeSymbol( "PLAN-COUNTER" ) ) ), ONE_INTEGER ) ) ) );
    $sym110$SHOP_STATISTIC_MANAGER_ADD_PLAN_METHOD = makeSymbol( "SHOP-STATISTIC-MANAGER-ADD-PLAN-METHOD" );
    $sym111$NUMBER_OF_INFERENCES = makeSymbol( "NUMBER-OF-INFERENCES" );
    $list112 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "INFERENCE-COUNTER" ) ) );
    $sym113$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-STATISTIC-MANAGER-METHOD" );
    $sym114$SHOP_STATISTIC_MANAGER_NUMBER_OF_INFERENCES_METHOD = makeSymbol( "SHOP-STATISTIC-MANAGER-NUMBER-OF-INFERENCES-METHOD" );
    $sym115$NUMBER_OF_METHODS = makeSymbol( "NUMBER-OF-METHODS" );
    $list116 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "METHOD-COUNTER" ) ) );
    $sym117$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-STATISTIC-MANAGER-METHOD" );
    $sym118$SHOP_STATISTIC_MANAGER_NUMBER_OF_METHODS_METHOD = makeSymbol( "SHOP-STATISTIC-MANAGER-NUMBER-OF-METHODS-METHOD" );
    $sym119$NUMBER_OF_EXPANSIONS = makeSymbol( "NUMBER-OF-EXPANSIONS" );
    $sym120$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-STATISTIC-MANAGER-METHOD" );
    $sym121$SHOP_STATISTIC_MANAGER_NUMBER_OF_EXPANSIONS_METHOD = makeSymbol( "SHOP-STATISTIC-MANAGER-NUMBER-OF-EXPANSIONS-METHOD" );
    $sym122$NUMBER_OF_PLANS = makeSymbol( "NUMBER-OF-PLANS" );
    $list123 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PLAN-COUNTER" ) ) );
    $sym124$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-STATISTIC-MANAGER-METHOD" );
    $sym125$SHOP_STATISTIC_MANAGER_NUMBER_OF_PLANS_METHOD = makeSymbol( "SHOP-STATISTIC-MANAGER-NUMBER-OF-PLANS-METHOD" );
    $sym126$NUMBER_OF_FI_ASKS = makeSymbol( "NUMBER-OF-FI-ASKS" );
    $list127 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "FI-ASK-COUNTER" ) ) );
    $sym128$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-STATISTIC-MANAGER-METHOD" );
    $sym129$SHOP_STATISTIC_MANAGER_NUMBER_OF_FI_ASKS_METHOD = makeSymbol( "SHOP-STATISTIC-MANAGER-NUMBER-OF-FI-ASKS-METHOD" );
    $sym130$NUMBER_OF_PLAN_STATE_ASKS = makeSymbol( "NUMBER-OF-PLAN-STATE-ASKS" );
    $list131 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PLAN-STATE-ASK-COUNTER" ) ) );
    $sym132$OUTER_CATCH_FOR_SHOP_STATISTIC_MANAGER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-STATISTIC-MANAGER-METHOD" );
    $sym133$SHOP_STATISTIC_MANAGER_NUMBER_OF_PLAN_STATE_ASKS_METHOD = makeSymbol( "SHOP-STATISTIC-MANAGER-NUMBER-OF-PLAN-STATE-ASKS-METHOD" );
    $sym134$SHOP_VARIABLE_MANAGER = makeSymbol( "SHOP-VARIABLE-MANAGER" );
    $list135 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "VARIABLE-ASSOC-TABLE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "VARIABLE-COUNTER" ), makeKeyword(
        "CLASS" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "VARIABLE-PREFIX" ), makeKeyword( "CLASS" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "GENERATE-VARIABLE" ), NIL, makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol(
                "DEF-CLASS-METHOD" ), makeSymbol( "GENERATED-VARIABLE?" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GENERATE-BINDING-PAIR" ), ConsesLow.list(
                    makeSymbol( "OLD-VAR" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "RECOVER-EL-VARIABLE" ), ConsesLow.list( makeSymbol( "HL-VAR" ) ), makeKeyword(
                        "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GATHER-EL-VARIABLES" ), ConsesLow.list( makeSymbol( "FORM" ), makeSymbol( "MBINDING" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "MANAGED-VARIABLE?" ), ConsesLow.list( makeSymbol( "VAR" ) ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
          makeSymbol( "REPLACE-VARIABLES" ), ConsesLow.list( makeSymbol( "FORM" ), makeSymbol( "MBINDING" ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym136$VARIABLE_COUNTER = makeSymbol( "VARIABLE-COUNTER" );
    $sym137$VARIABLE_PREFIX = makeSymbol( "VARIABLE-PREFIX" );
    $sym138$SUBLOOP_RESERVED_INITIALIZE_SHOP_VARIABLE_MANAGER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-VARIABLE-MANAGER-CLASS" );
    $sym139$VARIABLE_ASSOC_TABLE = makeSymbol( "VARIABLE-ASSOC-TABLE" );
    $sym140$SUBLOOP_RESERVED_INITIALIZE_SHOP_VARIABLE_MANAGER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-VARIABLE-MANAGER-INSTANCE" );
    $list141 = ConsesLow.list( makeKeyword( "PROTECTED" ), makeKeyword( "NO-MEMBER-VARIABLES" ) );
    $list142 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "VARIABLE-PREFIX" ) ), makeString( "?PV-" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NULL" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list(
            makeSymbol( "QUOTE" ), makeSymbol( "VARIABLE-ASSOC-TABLE" ) ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VARIABLE-COUNTER" ) ),
                ZERO_INTEGER ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "VARIABLE-ASSOC-TABLE" ) ), ConsesLow.list( makeSymbol(
                    "MAKE-HASH-TABLE" ), makeInteger( 100 ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $str143$_PV_ = makeString( "?PV-" );
    $int144$100 = makeInteger( 100 );
    $sym145$SHOP_VARIABLE_MANAGER_INITIALIZE_METHOD = makeSymbol( "SHOP-VARIABLE-MANAGER-INITIALIZE-METHOD" );
    $sym146$GENERATE_VARIABLE = makeSymbol( "GENERATE-VARIABLE" );
    $list147 = ConsesLow.list( makeString( "@return shop-variablep; a previously unused variable" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "VAR-NAME" ), ConsesLow.list(
        makeSymbol( "CCONCATENATE" ), makeSymbol( "VARIABLE-PREFIX" ), ConsesLow.list( makeSymbol( "WRITE-TO-STRING" ), makeSymbol( "VARIABLE-COUNTER" ) ) ) ), ConsesLow.list( makeSymbol( "VAR-SYMBOL" ), ConsesLow.list(
            makeSymbol( "INTERN" ), makeSymbol( "VAR-NAME" ), ConsesLow.list( makeSymbol( "FIND-PACKAGE" ), makeString( "CYC" ) ) ) ) ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "VARIABLE-COUNTER" ) ), ConsesLow
                .list( makeSymbol( "RET" ), makeSymbol( "VAR-SYMBOL" ) ) ) );
    $sym148$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-VARIABLE-MANAGER-METHOD" );
    $str149$CYC = makeString( "CYC" );
    $sym150$SHOP_VARIABLE_MANAGER_GENERATE_VARIABLE_METHOD = makeSymbol( "SHOP-VARIABLE-MANAGER-GENERATE-VARIABLE-METHOD" );
    $sym151$GENERATE_BINDING_PAIR = makeSymbol( "GENERATE-BINDING-PAIR" );
    $list152 = ConsesLow.list( makeSymbol( "OLD-VAR" ) );
    $list153 = ConsesLow.list( makeString(
        "Returns a binding pair that maps OLD-VAR to a new, previously unused variable.\n  @param   OLD-VAR  shop-variablep; variable to be replaced.\n  @return consp ; (OLD-VAR . NEW-VAR)" ), ConsesLow.list( makeSymbol(
            "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-VAR" ), ConsesLow.list( makeSymbol( "GENERATE-VARIABLE" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list(
                makeSymbol( "GETHASH" ), makeSymbol( "NEW-VAR" ), makeSymbol( "VARIABLE-ASSOC-TABLE" ) ), makeSymbol( "OLD-VAR" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "CONS" ), makeSymbol(
                    "OLD-VAR" ), makeSymbol( "NEW-VAR" ) ) ) ) );
    $sym154$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-VARIABLE-MANAGER-METHOD" );
    $sym155$SHOP_VARIABLE_MANAGER_GENERATE_BINDING_PAIR_METHOD = makeSymbol( "SHOP-VARIABLE-MANAGER-GENERATE-BINDING-PAIR-METHOD" );
    $sym156$GENERATE_BINDING_LIST = makeSymbol( "GENERATE-BINDING-LIST" );
    $list157 = ConsesLow.list( makeSymbol( "OLD-VAR-LIST" ) );
    $list158 = ConsesLow.list( makeString( "@param OLD-VAR-LIST consp; the list of variables to be replaced.\n   @return consp ; the list of variable bindings." ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list(
        ConsesLow.list( makeSymbol( "BLIST" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "OLD-VAR" ), makeSymbol( "OLD-VAR-LIST" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow
            .list( makeSymbol( "GENERATE-BINDING-PAIR" ), makeSymbol( "SELF" ), makeSymbol( "OLD-VAR" ) ), makeSymbol( "BLIST" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "BLIST" ) ) ) );
    $sym159$SHOP_VARIABLE_MANAGER_GENERATE_BINDING_LIST_METHOD = makeSymbol( "SHOP-VARIABLE-MANAGER-GENERATE-BINDING-LIST-METHOD" );
    $sym160$RECOVER_EL_VARIABLE = makeSymbol( "RECOVER-EL-VARIABLE" );
    $list161 = ConsesLow.list( makeSymbol( "HL-VAR" ) );
    $list162 = ConsesLow.list( makeString( "@param    HL-VAR shop-variablep; a variable managed by SELF\n   @return  shop-variablep; the original, and usually more user-friendly name for the variable." ), ConsesLow.list(
        makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "EL-VAR" ), ConsesLow.list( makeSymbol( "GETHASH" ), makeSymbol( "HL-VAR" ), makeSymbol( "VARIABLE-ASSOC-TABLE" ) ) ) ), ConsesLow.list(
            makeSymbol( "PWHEN" ), makeSymbol( "EL-VAR" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "EL-VAR" ) ) ), ConsesLow.list( makeSymbol( "CERROR" ), makeString( "VARIABLE ERROR" ), makeString(
                "~s is not a known variable to ~s~%" ), makeSymbol( "HL-VAR" ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym163$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-VARIABLE-MANAGER-METHOD" );
    $str164$VARIABLE_ERROR = makeString( "VARIABLE ERROR" );
    $str165$_s_is_not_a_known_variable_to__s_ = makeString( "~s is not a known variable to ~s~%" );
    $sym166$SHOP_VARIABLE_MANAGER_RECOVER_EL_VARIABLE_METHOD = makeSymbol( "SHOP-VARIABLE-MANAGER-RECOVER-EL-VARIABLE-METHOD" );
    $sym167$GATHER_EL_VARIABLES = makeSymbol( "GATHER-EL-VARIABLES" );
    $list168 = ConsesLow.list( makeSymbol( "FORM" ), makeSymbol( "MBINDING" ) );
    $list169 = ConsesLow.list( makeString(
        "Finds all the variables in FORM unbound by MBINDING\n   @param  FORM      consp ;the formula with variables \n   @param  MBINDING  multibinding-p ;mbinding that binds some of the variables.\n   @return consp ;list of all unbound variables." ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "UNBOUND-VARS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-VAR" ), ConsesLow.list(
            makeSymbol( "TREE-GATHER" ), makeSymbol( "FORM" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "SHOP-VARIABLEP" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol(
                "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "GENERATED-VARIABLE?" ), makeSymbol( "SHOP-VARIABLE-MANAGER" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SHOP-VARIABLE-MANAGER" ) ), makeSymbol(
                    "CUR-VAR" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "FREE-VARIABLE-IN-MULTIBINDING?" ), makeSymbol( "CUR-VAR" ), makeSymbol( "MBINDING" ) ), ConsesLow.list( makeSymbol(
                        "CPUSH" ), makeSymbol( "CUR-VAR" ), makeSymbol( "UNBOUND-VARS" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "REVERSE" ), makeSymbol( "UNBOUND-VARS" ) ) ) ) );
    $sym170$SHOP_VARIABLEP = makeSymbol( "SHOP-VARIABLEP" );
    $sym171$SHOP_VARIABLE_MANAGER_GATHER_EL_VARIABLES_METHOD = makeSymbol( "SHOP-VARIABLE-MANAGER-GATHER-EL-VARIABLES-METHOD" );
    $sym172$MANAGED_VARIABLE_ = makeSymbol( "MANAGED-VARIABLE?" );
    $list173 = ConsesLow.list( makeSymbol( "VAR" ) );
    $list174 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "GETHASH" ), makeSymbol( "VAR" ), makeSymbol( "VARIABLE-ASSOC-TABLE" ) ), T, NIL ) ) );
    $sym175$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-VARIABLE-MANAGER-METHOD" );
    $sym176$SHOP_VARIABLE_MANAGER_MANAGED_VARIABLE__METHOD = makeSymbol( "SHOP-VARIABLE-MANAGER-MANAGED-VARIABLE?-METHOD" );
    $sym177$GENERATED_VARIABLE_ = makeSymbol( "GENERATED-VARIABLE?" );
    $list178 = ConsesLow.list( makeString(
        "@param VAR shop-variablep\n   @return booleanp\n   returns T if VAR could have been generated by an instance of\n   SHOP-VARIABLE-MANAGER, and NIL otherwise.\n   (check-type var shop-variablep)" ), ConsesLow
            .list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "SYMBOLP" ), makeSymbol( "VAR" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                "VARIABLE-P" ), makeSymbol( "VAR" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "VAR-NAME" ), ConsesLow.list(
                    makeSymbol( "SYMBOL-NAME" ), makeSymbol( "VAR" ) ) ), ConsesLow.list( makeSymbol( "MIN-LENGTH" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "VARIABLE-PREFIX" ) ) ), ConsesLow.list(
                        makeSymbol( "VAR-PREFIX" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( ">=" ), ConsesLow.list( makeSymbol( "LENGTH" ), makeSymbol( "VAR-NAME" ) ), makeSymbol(
                            "MIN-LENGTH" ) ), ConsesLow.list( makeSymbol( "SUBSTRING" ), ConsesLow.list( makeSymbol( "SYMBOL-NAME" ), makeSymbol( "VAR" ) ), ZERO_INTEGER, ConsesLow.list( makeSymbol( "LENGTH" ),
                                makeSymbol( "VARIABLE-PREFIX" ) ) ), makeString( "" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "STRING=" ), makeSymbol( "VAR-PREFIX" ), makeSymbol(
                                    "VARIABLE-PREFIX" ) ), ConsesLow.list( makeSymbol( "RET" ), T ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ) );
    $sym179$OUTER_CATCH_FOR_SHOP_VARIABLE_MANAGER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-VARIABLE-MANAGER-METHOD" );
    $str180$ = makeString( "" );
    $sym181$SHOP_VARIABLE_MANAGER_GENERATED_VARIABLE__METHOD = makeSymbol( "SHOP-VARIABLE-MANAGER-GENERATED-VARIABLE?-METHOD" );
    $sym182$GENERATED_VARIABLES_BOUND = makeSymbol( "GENERATED-VARIABLES-BOUND" );
    $list183 = ConsesLow.list( makeSymbol( "BINDING" ) );
    $list184 = ConsesLow.list( makeString( "@param BINDING listp\n   @return listp" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "BPAIRS" ), NIL ) ), ConsesLow.list( makeSymbol(
        "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-PAIR" ), makeSymbol( "BINDING" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol(
            "GENERATED-VARIABLE?" ), makeSymbol( "SHOP-VARIABLE-MANAGER" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SHOP-VARIABLE-MANAGER" ) ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol(
                "CUR-PAIR" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "CUR-PAIR" ), makeSymbol( "BPAIRS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "BPAIRS" ) ) ) );
    $sym185$SHOP_VARIABLE_MANAGER_GENERATED_VARIABLES_BOUND_METHOD = makeSymbol( "SHOP-VARIABLE-MANAGER-GENERATED-VARIABLES-BOUND-METHOD" );
    $sym186$REPLACE_VARIABLES = makeSymbol( "REPLACE-VARIABLES" );
    $list187 = ConsesLow.list( makeString(
        "replaces all variables in FORM that are currently not bound by \n   MBINDING. \n   @param    FORM      hl-formula-p        ;formula with vars to replace\n   @param    MBINDING  multibinding-p      ;multibinding that applies to FORM's vars\n   @return  consp" ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "OLD-VARS" ), ConsesLow.list( makeSymbol( "GATHER-EL-VARIABLES" ), makeSymbol( "SELF" ), makeSymbol( "FORM" ), makeSymbol(
            "MBINDING" ) ) ), ConsesLow.list( makeSymbol( "BLIST" ), ConsesLow.list( makeSymbol( "GENERATE-BINDING-LIST" ), makeSymbol( "SELF" ), makeSymbol( "OLD-VARS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                ConsesLow.list( makeSymbol( "SUBLIS" ), makeSymbol( "BLIST" ), makeSymbol( "FORM" ) ) ) ) );
    $sym188$SHOP_VARIABLE_MANAGER_REPLACE_VARIABLES_METHOD = makeSymbol( "SHOP-VARIABLE-MANAGER-REPLACE-VARIABLES-METHOD" );
    $sym189$RECOVER_EL = makeSymbol( "RECOVER-EL" );
    $list190 = ConsesLow.list( makeSymbol( "TREE" ) );
    $list191 = ConsesLow.list( makeString( "@param TREE listp\n   Return the TREE, will all managed variables replaced with\n   their el labels." ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
        makeSymbol( "HL-VARS" ), ConsesLow.list( makeSymbol( "TREE-GATHER" ), makeSymbol( "TREE" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "SHOP-VARIABLEP" ) ) ) ), ConsesLow.list( makeSymbol(
            "NEW-TREE" ), ConsesLow.list( makeSymbol( "COPY-TREE" ), makeSymbol( "TREE" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-VAR" ), makeSymbol( "HL-VARS" ) ), ConsesLow
                .list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "MANAGED-VARIABLE?" ), makeSymbol( "SELF" ), makeSymbol( "CUR-VAR" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEW-TREE" ), ConsesLow
                    .list( makeSymbol( "NSUBST" ), ConsesLow.list( makeSymbol( "RECOVER-EL-VARIABLE" ), makeSymbol( "SELF" ), makeSymbol( "CUR-VAR" ) ), makeSymbol( "CUR-VAR" ), makeSymbol( "NEW-TREE" ) ) ) ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-TREE" ) ) ) );
    $sym192$SHOP_VARIABLE_MANAGER_RECOVER_EL_METHOD = makeSymbol( "SHOP-VARIABLE-MANAGER-RECOVER-EL-METHOD" );
    $const193$argIsa = constant_handles.reader_make_constant_shell( makeString( "argIsa" ) );
    $sym194$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $const195$argGenl = constant_handles.reader_make_constant_shell( makeString( "argGenl" ) );
  }
}
/*
 * 
 * Total time: 732 ms
 * 
 */