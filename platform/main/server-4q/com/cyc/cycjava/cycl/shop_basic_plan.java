package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class shop_basic_plan
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.shop_basic_plan";
  public static final String myFingerPrint = "77d46e7f84ed2708593f8d6de523d56059434f7a870b5adde08744edcf4bcc20";
  private static final SubLSymbol $sym0$SHOP_TASK;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$SHOP_BASIC_TASK;
  private static final SubLSymbol $sym3$SHOP_INDEXED_OBJECT;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$OBJECT;
  private static final SubLSymbol $sym7$INSTANCE_COUNT;
  private static final SubLSymbol $sym8$INSTANCE_INDEX;
  private static final SubLSymbol $sym9$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_TASK_CLASS;
  private static final SubLSymbol $sym10$ISOLATED_P;
  private static final SubLSymbol $sym11$INSTANCE_NUMBER;
  private static final SubLSymbol $sym12$FORMULA;
  private static final SubLSymbol $sym13$BINDINGS;
  private static final SubLSymbol $sym14$PRECOND;
  private static final SubLSymbol $sym15$TASK_STRUC;
  private static final SubLSymbol $sym16$STATUS;
  private static final SubLSymbol $sym17$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_TASK_INSTANCE;
  private static final SubLSymbol $sym18$STRIP_TASK;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD;
  private static final SubLSymbol $sym21$SHOP_BASIC_TASK_STRIP_TASK_METHOD;
  private static final SubLSymbol $sym22$PRINT;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD;
  private static final SubLString $str27$__Task__S__S_;
  private static final SubLString $str28$__Malformed_Instance_;
  private static final SubLSymbol $sym29$SHOP_BASIC_TASK_PRINT_METHOD;
  private static final SubLSymbol $sym30$INIT;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD;
  private static final SubLSymbol $kw34$PRIMITIVE;
  private static final SubLSymbol $kw35$COMPLEX;
  private static final SubLSymbol $sym36$SHOP_BASIC_TASK_INIT_METHOD;
  private static final SubLSymbol $sym37$PLANNER_RULE;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD;
  private static final SubLSymbol $sym40$SHOP_BASIC_TASK_PLANNER_RULE_METHOD;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD;
  private static final SubLSymbol $sym43$SHOP_BASIC_TASK_FORMULA_METHOD;
  private static final SubLSymbol $sym44$PRECONDITION;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD;
  private static final SubLSymbol $sym47$SHOP_BASIC_TASK_PRECONDITION_METHOD;
  private static final SubLSymbol $sym48$PRIMITIVE_;
  private static final SubLList $list49;
  private static final SubLSymbol $sym50$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD;
  private static final SubLSymbol $sym51$SHOP_BASIC_TASK_PRIMITIVE__METHOD;
  private static final SubLSymbol $sym52$MBINDINGS;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD;
  private static final SubLSymbol $sym55$SHOP_BASIC_TASK_MBINDINGS_METHOD;
  private static final SubLSymbol $sym56$SHOP_PLAN_I;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$SHOP_BASIC_PLAN;
  private static final SubLList $list59;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_CLASS;
  private static final SubLSymbol $sym62$PRE_ORDERING;
  private static final SubLSymbol $sym63$POST_ORDERING;
  private static final SubLSymbol $sym64$TASK_STRUCS;
  private static final SubLSymbol $sym65$SIMPLE_BINDING_LIST;
  private static final SubLSymbol $sym66$TOTAL_COST;
  private static final SubLSymbol $sym67$OPEN_VARIABLES;
  private static final SubLSymbol $sym68$VARIABLE_MANAGER;
  private static final SubLSymbol $sym69$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_INSTANCE;
  private static final SubLSymbol $sym70$POPULATE_PLAN;
  private static final SubLList $list71;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
  private static final SubLInteger $int74$50;
  private static final SubLString $str75$tried_to_add_null_entry_to_task_l;
  private static final SubLSymbol $sym76$VAR_MANAGER;
  private static final SubLSymbol $sym77$SHOP_BASIC_PLAN_POPULATE_PLAN_METHOD;
  private static final SubLSymbol $sym78$GROUND_FORMS;
  private static final SubLList $list79;
  private static final SubLSymbol $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
  private static final SubLSymbol $sym81$SHOP_BASIC_PLAN_GROUND_FORMS_METHOD;
  private static final SubLSymbol $sym82$PRIMITIVE_FORM;
  private static final SubLList $list83;
  private static final SubLSymbol $sym84$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
  private static final SubLSymbol $sym85$SHOP_BASIC_PLAN_PRIMITIVE_FORM_METHOD;
  private static final SubLSymbol $sym86$NON_PRIMITIVE_PRE_ORDERING;
  private static final SubLList $list87;
  private static final SubLSymbol $sym88$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
  private static final SubLSymbol $sym89$SHOP_BASIC_PLAN_NON_PRIMITIVE_PRE_ORDERING_METHOD;
  private static final SubLSymbol $sym90$GOAL_TASK;
  private static final SubLList $list91;
  private static final SubLSymbol $sym92$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
  private static final SubLSymbol $sym93$SHOP_BASIC_PLAN_GOAL_TASK_METHOD;
  private static final SubLList $list94;
  private static final SubLSymbol $sym95$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
  private static final SubLSymbol $sym96$SHOP_BASIC_PLAN_POST_ORDERING_METHOD;
  private static final SubLSymbol $sym97$COST;
  private static final SubLList $list98;
  private static final SubLSymbol $sym99$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
  private static final SubLSymbol $sym100$SHOP_BASIC_PLAN_COST_METHOD;
  private static final SubLList $list101;
  private static final SubLSymbol $sym102$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
  private static final SubLSymbol $sym103$SHOP_BASIC_PLAN_VARIABLE_MANAGER_METHOD;
  private static final SubLSymbol $sym104$MBINDING;
  private static final SubLSymbol $sym105$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
  private static final SubLSymbol $sym106$SHOP_BASIC_PLAN_MBINDING_METHOD;
  private static final SubLSymbol $sym107$GATHER_PLANNER_RULES;
  private static final SubLList $list108;
  private static final SubLSymbol $sym109$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
  private static final SubLSymbol $sym110$SHOP_BASIC_PLAN_GATHER_PLANNER_RULES_METHOD;
  private static final SubLSymbol $sym111$GATHER_PRECONDITIONS;
  private static final SubLList $list112;
  private static final SubLSymbol $sym113$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
  private static final SubLSymbol $sym114$SHOP_BASIC_PLAN_GATHER_PRECONDITIONS_METHOD;
  private static final SubLSymbol $sym115$SINGLE_AGENT_PLAN_;
  private static final SubLList $list116;
  private static final SubLSymbol $sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD;
  private static final SubLSymbol $sym118$SHOP_BASIC_PLAN_SINGLE_AGENT_PLAN__METHOD;
  private static final SubLSymbol $sym119$SHOP_VARIABLEP;
  private static final SubLList $list120;
  private static final SubLSymbol $sym121$CUR_PRE;
  private static final SubLSymbol $sym122$NEXT;
  private static final SubLSymbol $sym123$STACK;
  private static final SubLSymbol $sym124$CLET;
  private static final SubLList $list125;
  private static final SubLList $list126;
  private static final SubLSymbol $sym127$CDO;
  private static final SubLSymbol $sym128$REST;
  private static final SubLSymbol $sym129$NULL;
  private static final SubLSymbol $sym130$FIRST;
  private static final SubLSymbol $sym131$SECOND;
  private static final SubLSymbol $sym132$WHILE;
  private static final SubLSymbol $sym133$CAND;
  private static final SubLSymbol $sym134$CNOT;
  private static final SubLSymbol $sym135$PPO_TREE_DESCENDANT_;
  private static final SubLSymbol $sym136$CDEC;
  private static final SubLSymbol $sym137$CPOP;
  private static final SubLSymbol $sym138$PWHEN;
  private static final SubLSymbol $sym139$CINC;
  private static final SubLSymbol $sym140$CPUSH;

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 781L)
  public static SubLObject shop_task_p(final SubLObject shop_task)
  {
    return interfaces.subloop_instanceof_interface( shop_task, $sym0$SHOP_TASK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
  public static SubLObject get_shop_basic_task_status(final SubLObject shop_basic_task)
  {
    return classes.subloop_get_instance_slot( shop_basic_task, FIVE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
  public static SubLObject set_shop_basic_task_status(final SubLObject shop_basic_task, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( shop_basic_task, value, FIVE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
  public static SubLObject get_shop_basic_task_task_struc(final SubLObject shop_basic_task)
  {
    return classes.subloop_get_instance_slot( shop_basic_task, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
  public static SubLObject set_shop_basic_task_task_struc(final SubLObject shop_basic_task, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( shop_basic_task, value, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
  public static SubLObject get_shop_basic_task_precond(final SubLObject shop_basic_task)
  {
    return classes.subloop_get_instance_slot( shop_basic_task, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
  public static SubLObject set_shop_basic_task_precond(final SubLObject shop_basic_task, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( shop_basic_task, value, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
  public static SubLObject get_shop_basic_task_bindings(final SubLObject shop_basic_task)
  {
    return classes.subloop_get_instance_slot( shop_basic_task, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
  public static SubLObject set_shop_basic_task_bindings(final SubLObject shop_basic_task, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( shop_basic_task, value, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
  public static SubLObject get_shop_basic_task_formula(final SubLObject shop_basic_task)
  {
    return classes.subloop_get_instance_slot( shop_basic_task, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
  public static SubLObject set_shop_basic_task_formula(final SubLObject shop_basic_task, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( shop_basic_task, value, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
  public static SubLObject subloop_reserved_initialize_shop_basic_task_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym6$OBJECT, $sym7$INSTANCE_COUNT, ZERO_INTEGER );
    classes.subloop_initialize_slot( new_instance, $sym3$SHOP_INDEXED_OBJECT, $sym8$INSTANCE_INDEX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
  public static SubLObject subloop_reserved_initialize_shop_basic_task_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym6$OBJECT, $sym10$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym6$OBJECT, $sym11$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$SHOP_BASIC_TASK, $sym12$FORMULA, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$SHOP_BASIC_TASK, $sym13$BINDINGS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$SHOP_BASIC_TASK, $sym14$PRECOND, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$SHOP_BASIC_TASK, $sym15$TASK_STRUC, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$SHOP_BASIC_TASK, $sym16$STATUS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1122L)
  public static SubLObject shop_basic_task_p(final SubLObject shop_basic_task)
  {
    return classes.subloop_instanceof_class( shop_basic_task, $sym2$SHOP_BASIC_TASK );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1586L)
  public static SubLObject shop_basic_task_strip_task_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_task_method = NIL;
    final SubLObject formula = get_shop_basic_task_formula( self );
    try
    {
      thread.throwStack.push( $sym20$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD );
      try
      {
        instances.set_slot( self, $sym12$FORMULA, conses_high.second( instances.get_slot( self, $sym12$FORMULA ) ) );
        Dynamic.sublisp_throw( $sym20$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_task_formula( self, formula );
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
      catch_var_for_shop_basic_task_method = Errors.handleThrowable( ccatch_env_var, $sym20$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_task_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1758L)
  public static SubLObject shop_basic_task_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_task_method = NIL;
    final SubLObject formula = get_shop_basic_task_formula( self );
    final SubLObject instance_number = object.get_object_instance_number( self );
    try
    {
      thread.throwStack.push( $sym26$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD );
      try
      {
        if( NIL != subloop_structures.instance_p( self ) )
        {
          PrintLow.format( stream, $str27$__Task__S__S_, instance_number, formula );
        }
        else
        {
          PrintLow.format( stream, $str28$__Malformed_Instance_ );
        }
        Dynamic.sublisp_throw( $sym26$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_task_formula( self, formula );
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
      catch_var_for_shop_basic_task_method = Errors.handleThrowable( ccatch_env_var, $sym26$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_task_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 1995L)
  public static SubLObject shop_basic_task_init_method(final SubLObject self, final SubLObject new_task, final SubLObject new_binding, final SubLObject new_precond, final SubLObject new_task_struc)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_task_method = NIL;
    SubLObject status = get_shop_basic_task_status( self );
    SubLObject task_struc = get_shop_basic_task_task_struc( self );
    SubLObject precond = get_shop_basic_task_precond( self );
    SubLObject v_bindings = get_shop_basic_task_bindings( self );
    SubLObject formula = get_shop_basic_task_formula( self );
    try
    {
      thread.throwStack.push( $sym33$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD );
      try
      {
        if( new_task.first() == $kw34$PRIMITIVE )
        {
          formula = conses_high.second( new_task );
          status = $kw34$PRIMITIVE;
        }
        else
        {
          formula = new_task;
          status = $kw35$COMPLEX;
        }
        v_bindings = new_binding;
        precond = new_precond;
        task_struc = new_task_struc;
        Dynamic.sublisp_throw( $sym33$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_task_status( self, status );
          set_shop_basic_task_task_struc( self, task_struc );
          set_shop_basic_task_precond( self, precond );
          set_shop_basic_task_bindings( self, v_bindings );
          set_shop_basic_task_formula( self, formula );
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
      catch_var_for_shop_basic_task_method = Errors.handleThrowable( ccatch_env_var, $sym33$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_task_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 2563L)
  public static SubLObject shop_basic_task_planner_rule_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_task_method = NIL;
    final SubLObject task_struc = get_shop_basic_task_task_struc( self );
    try
    {
      thread.throwStack.push( $sym39$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym39$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, task_struc );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_task_task_struc( self, task_struc );
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
      catch_var_for_shop_basic_task_method = Errors.handleThrowable( ccatch_env_var, $sym39$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_task_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 2680L)
  public static SubLObject shop_basic_task_formula_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_task_method = NIL;
    final SubLObject formula = get_shop_basic_task_formula( self );
    try
    {
      thread.throwStack.push( $sym42$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym42$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, formula );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_task_formula( self, formula );
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
      catch_var_for_shop_basic_task_method = Errors.handleThrowable( ccatch_env_var, $sym42$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_task_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 2756L)
  public static SubLObject shop_basic_task_precondition_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_task_method = NIL;
    final SubLObject precond = get_shop_basic_task_precond( self );
    try
    {
      thread.throwStack.push( $sym46$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym46$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, precond );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_task_precond( self, precond );
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
      catch_var_for_shop_basic_task_method = Errors.handleThrowable( ccatch_env_var, $sym46$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_task_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 2837L)
  public static SubLObject shop_basic_task_primitiveP_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_task_method = NIL;
    final SubLObject status = get_shop_basic_task_status( self );
    try
    {
      thread.throwStack.push( $sym50$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym50$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, Equality.eq( status, $kw34$PRIMITIVE ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_task_status( self, status );
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
      catch_var_for_shop_basic_task_method = Errors.handleThrowable( ccatch_env_var, $sym50$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_task_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 2931L)
  public static SubLObject shop_basic_task_mbindings_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_task_method = NIL;
    final SubLObject v_bindings = get_shop_basic_task_bindings( self );
    try
    {
      thread.throwStack.push( $sym54$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym54$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD, v_bindings );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_task_bindings( self, v_bindings );
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
      catch_var_for_shop_basic_task_method = Errors.handleThrowable( ccatch_env_var, $sym54$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_task_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3010L)
  public static SubLObject shop_plan_i_p(final SubLObject shop_plan_i)
  {
    return interfaces.subloop_instanceof_interface( shop_plan_i, $sym56$SHOP_PLAN_I );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
  public static SubLObject get_shop_basic_plan_variable_manager(final SubLObject v_shop_basic_plan)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_plan, EIGHT_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
  public static SubLObject set_shop_basic_plan_variable_manager(final SubLObject v_shop_basic_plan, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_plan, value, EIGHT_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
  public static SubLObject get_shop_basic_plan_open_variables(final SubLObject v_shop_basic_plan)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_plan, SEVEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
  public static SubLObject set_shop_basic_plan_open_variables(final SubLObject v_shop_basic_plan, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_plan, value, SEVEN_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
  public static SubLObject get_shop_basic_plan_total_cost(final SubLObject v_shop_basic_plan)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_plan, SIX_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
  public static SubLObject set_shop_basic_plan_total_cost(final SubLObject v_shop_basic_plan, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_plan, value, SIX_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
  public static SubLObject get_shop_basic_plan_simple_binding_list(final SubLObject v_shop_basic_plan)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_plan, FIVE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
  public static SubLObject set_shop_basic_plan_simple_binding_list(final SubLObject v_shop_basic_plan, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_plan, value, FIVE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
  public static SubLObject get_shop_basic_plan_bindings(final SubLObject v_shop_basic_plan)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_plan, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
  public static SubLObject set_shop_basic_plan_bindings(final SubLObject v_shop_basic_plan, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_plan, value, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
  public static SubLObject get_shop_basic_plan_task_strucs(final SubLObject v_shop_basic_plan)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_plan, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
  public static SubLObject set_shop_basic_plan_task_strucs(final SubLObject v_shop_basic_plan, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_plan, value, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
  public static SubLObject get_shop_basic_plan_post_ordering(final SubLObject v_shop_basic_plan)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_plan, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
  public static SubLObject set_shop_basic_plan_post_ordering(final SubLObject v_shop_basic_plan, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_plan, value, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
  public static SubLObject get_shop_basic_plan_pre_ordering(final SubLObject v_shop_basic_plan)
  {
    return classes.subloop_get_instance_slot( v_shop_basic_plan, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
  public static SubLObject set_shop_basic_plan_pre_ordering(final SubLObject v_shop_basic_plan, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( v_shop_basic_plan, value, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
  public static SubLObject subloop_reserved_initialize_shop_basic_plan_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym6$OBJECT, $sym7$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
  public static SubLObject subloop_reserved_initialize_shop_basic_plan_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym6$OBJECT, $sym10$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym6$OBJECT, $sym11$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym58$SHOP_BASIC_PLAN, $sym62$PRE_ORDERING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym58$SHOP_BASIC_PLAN, $sym63$POST_ORDERING, NIL );
    classes.subloop_initialize_slot( new_instance, $sym58$SHOP_BASIC_PLAN, $sym64$TASK_STRUCS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym58$SHOP_BASIC_PLAN, $sym13$BINDINGS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym58$SHOP_BASIC_PLAN, $sym65$SIMPLE_BINDING_LIST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym58$SHOP_BASIC_PLAN, $sym66$TOTAL_COST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym58$SHOP_BASIC_PLAN, $sym67$OPEN_VARIABLES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym58$SHOP_BASIC_PLAN, $sym68$VARIABLE_MANAGER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 3693L)
  public static SubLObject shop_basic_plan_p(final SubLObject v_shop_basic_plan)
  {
    return classes.subloop_instanceof_class( v_shop_basic_plan, $sym58$SHOP_BASIC_PLAN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 4362L)
  public static SubLObject shop_basic_plan_populate_plan_method(final SubLObject self, final SubLObject plan_state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_method = NIL;
    SubLObject variable_manager = get_shop_basic_plan_variable_manager( self );
    SubLObject open_variables = get_shop_basic_plan_open_variables( self );
    SubLObject total_cost = get_shop_basic_plan_total_cost( self );
    SubLObject simple_binding_list = get_shop_basic_plan_simple_binding_list( self );
    SubLObject v_bindings = get_shop_basic_plan_bindings( self );
    final SubLObject task_strucs = get_shop_basic_plan_task_strucs( self );
    SubLObject post_ordering = get_shop_basic_plan_post_ordering( self );
    SubLObject pre_ordering = get_shop_basic_plan_pre_ordering( self );
    try
    {
      thread.throwStack.push( $sym73$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
      try
      {
        SubLObject task_pre_ordering = shop_basic_plan_state.get_shop_basic_plan_state_partial_plan( plan_state );
        SubLObject task_post_ordering = Sequences.reverse( shop_basic_plan_state.get_shop_basic_plan_state_post_ordering( plan_state ) );
        final SubLObject task_bindings = shop_basic_plan_state.shop_basic_plan_state_mbinding_method( plan_state );
        final SubLObject simple_bindings = multibindings.mbind_simple_binding_list( task_bindings );
        SubLObject task_strucs_$1 = shop_basic_plan_state.shop_basic_plan_state_task_strucs_method( plan_state );
        final SubLObject preconds = shop_basic_plan_state.shop_basic_plan_state_support_lists_method( plan_state );
        SubLObject task_list = NIL;
        final SubLObject task_assoc = Hashtables.make_hash_table( $int74$50, Symbols.symbol_function( EQ ), UNPROVIDED );
        thread.resetMultipleValues();
        final SubLObject new_task_pre_ordering = shop_process_open_variables( task_pre_ordering, task_bindings, UNPROVIDED );
        final SubLObject new_open_variables = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject new_task_post_ordering = shop_process_open_variables( task_post_ordering, task_bindings, new_open_variables );
        final SubLObject new_open_variables_$2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        task_pre_ordering = new_task_pre_ordering;
        task_post_ordering = new_task_post_ordering;
        open_variables = new_open_variables_$2;
        SubLObject task = NIL;
        SubLObject task_$3 = NIL;
        SubLObject precond = NIL;
        SubLObject precond_$4 = NIL;
        SubLObject task_struc = NIL;
        SubLObject task_struc_$5 = NIL;
        task = task_pre_ordering;
        task_$3 = task.first();
        precond = preconds;
        precond_$4 = precond.first();
        task_struc = task_strucs_$1;
        task_struc_$5 = task_struc.first();
        while ( NIL != task_struc || NIL != precond || NIL != task)
        {
          final SubLObject new_task_obj = object.object_new_method( $sym2$SHOP_BASIC_TASK );
          shop_basic_task_init_method( new_task_obj, task_$3, task_bindings, precond_$4, task_struc_$5 );
          Hashtables.sethash( task_$3, task_assoc, new_task_obj );
          task_list = ConsesLow.cons( new_task_obj, task_list );
          task = task.rest();
          task_$3 = task.first();
          precond = precond.rest();
          precond_$4 = precond.first();
          task_struc = task_struc.rest();
          task_struc_$5 = task_struc.first();
        }
        pre_ordering = Sequences.reverse( task_list );
        task_list = NIL;
        SubLObject cdolist_list_var = task_post_ordering;
        SubLObject task2 = NIL;
        task2 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject task_entry = Hashtables.gethash( task2, task_assoc, UNPROVIDED );
          if( NIL == task_entry )
          {
            Errors.warn( $str75$tried_to_add_null_entry_to_task_l, task2 );
          }
          else
          {
            task_list = ConsesLow.cons( task_entry, task_list );
          }
          cdolist_list_var = cdolist_list_var.rest();
          task2 = cdolist_list_var.first();
        }
        task_strucs_$1 = shop_basic_plan_state.get_shop_basic_plan_state_task_strucs( plan_state );
        post_ordering = Sequences.reverse( task_list );
        v_bindings = task_bindings;
        simple_binding_list = simple_bindings;
        variable_manager = instances.get_slot( shop_basic_plan_state.get_shop_basic_plan_state_planner( plan_state ), $sym76$VAR_MANAGER );
        total_cost = conses_high.list_length( task_pre_ordering );
        Dynamic.sublisp_throw( $sym73$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_variable_manager( self, variable_manager );
          set_shop_basic_plan_open_variables( self, open_variables );
          set_shop_basic_plan_total_cost( self, total_cost );
          set_shop_basic_plan_simple_binding_list( self, simple_binding_list );
          set_shop_basic_plan_bindings( self, v_bindings );
          set_shop_basic_plan_task_strucs( self, task_strucs );
          set_shop_basic_plan_post_ordering( self, post_ordering );
          set_shop_basic_plan_pre_ordering( self, pre_ordering );
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
      catch_var_for_shop_basic_plan_method = Errors.handleThrowable( ccatch_env_var, $sym73$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 6775L)
  public static SubLObject shop_basic_plan_ground_forms_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_method = NIL;
    final SubLObject open_variables = get_shop_basic_plan_open_variables( self );
    final SubLObject v_bindings = get_shop_basic_plan_bindings( self );
    try
    {
      thread.throwStack.push( $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
      try
      {
        final SubLObject primitive_form = shop_basic_plan_primitive_form_method( self );
        if( NIL == open_variables )
        {
          Dynamic.sublisp_throw( $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, ConsesLow.list( primitive_form ) );
        }
        else
        {
          Dynamic.sublisp_throw( $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, multibindings.apply_multibinding( primitive_form, v_bindings ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_open_variables( self, open_variables );
          set_shop_basic_plan_bindings( self, v_bindings );
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
      catch_var_for_shop_basic_plan_method = Errors.handleThrowable( ccatch_env_var, $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 7212L)
  public static SubLObject shop_basic_plan_primitive_form_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_method = NIL;
    final SubLObject post_ordering = get_shop_basic_plan_post_ordering( self );
    final SubLObject pre_ordering = get_shop_basic_plan_pre_ordering( self );
    try
    {
      thread.throwStack.push( $sym84$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
      try
      {
        final SubLObject primitive_tasks = ppo_tree_leaves( Sequences.reverse( pre_ordering ), post_ordering, Symbols.symbol_function( EQ ) );
        SubLObject primitive_forms = NIL;
        SubLObject cdolist_list_var = primitive_tasks;
        SubLObject cur_task = NIL;
        cur_task = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          primitive_forms = ConsesLow.cons( shop_basic_task_formula_method( cur_task ), primitive_forms );
          cdolist_list_var = cdolist_list_var.rest();
          cur_task = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym84$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, Sequences.nreverse( primitive_forms ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_post_ordering( self, post_ordering );
          set_shop_basic_plan_pre_ordering( self, pre_ordering );
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
      catch_var_for_shop_basic_plan_method = Errors.handleThrowable( ccatch_env_var, $sym84$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 7615L)
  public static SubLObject shop_basic_plan_non_primitive_pre_ordering_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_method = NIL;
    final SubLObject pre_ordering = get_shop_basic_plan_pre_ordering( self );
    try
    {
      thread.throwStack.push( $sym88$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
      try
      {
        SubLObject non_primitive_list = NIL;
        SubLObject cdolist_list_var = pre_ordering;
        SubLObject cur_task = NIL;
        cur_task = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == shop_basic_task_primitiveP_method( cur_task ) )
          {
            non_primitive_list = ConsesLow.cons( cur_task, non_primitive_list );
          }
          cdolist_list_var = cdolist_list_var.rest();
          cur_task = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym88$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, non_primitive_list );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_pre_ordering( self, pre_ordering );
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
      catch_var_for_shop_basic_plan_method = Errors.handleThrowable( ccatch_env_var, $sym88$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 7970L)
  public static SubLObject shop_basic_plan_goal_task_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_method = NIL;
    final SubLObject pre_ordering = get_shop_basic_plan_pre_ordering( self );
    try
    {
      thread.throwStack.push( $sym92$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym92$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, list_utilities.last_one( pre_ordering ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_pre_ordering( self, pre_ordering );
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
      catch_var_for_shop_basic_plan_method = Errors.handleThrowable( ccatch_env_var, $sym92$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 8128L)
  public static SubLObject shop_basic_plan_post_ordering_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_method = NIL;
    final SubLObject post_ordering = get_shop_basic_plan_post_ordering( self );
    try
    {
      thread.throwStack.push( $sym95$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym95$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, post_ordering );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_post_ordering( self, post_ordering );
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
      catch_var_for_shop_basic_plan_method = Errors.handleThrowable( ccatch_env_var, $sym95$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 8216L)
  public static SubLObject shop_basic_plan_cost_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_method = NIL;
    final SubLObject total_cost = get_shop_basic_plan_total_cost( self );
    try
    {
      thread.throwStack.push( $sym99$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym99$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, total_cost );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_total_cost( self, total_cost );
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
      catch_var_for_shop_basic_plan_method = Errors.handleThrowable( ccatch_env_var, $sym99$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 8292L)
  public static SubLObject shop_basic_plan_variable_manager_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_method = NIL;
    final SubLObject variable_manager = get_shop_basic_plan_variable_manager( self );
    try
    {
      thread.throwStack.push( $sym102$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym102$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, variable_manager );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_variable_manager( self, variable_manager );
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
      catch_var_for_shop_basic_plan_method = Errors.handleThrowable( ccatch_env_var, $sym102$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 8386L)
  public static SubLObject shop_basic_plan_mbinding_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_method = NIL;
    final SubLObject v_bindings = get_shop_basic_plan_bindings( self );
    try
    {
      thread.throwStack.push( $sym105$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym105$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, v_bindings );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_bindings( self, v_bindings );
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
      catch_var_for_shop_basic_plan_method = Errors.handleThrowable( ccatch_env_var, $sym105$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 8464L)
  public static SubLObject shop_basic_plan_gather_planner_rules_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_method = NIL;
    final SubLObject pre_ordering = get_shop_basic_plan_pre_ordering( self );
    try
    {
      thread.throwStack.push( $sym109$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
      try
      {
        SubLObject planner_rules = NIL;
        SubLObject cdolist_list_var = pre_ordering;
        SubLObject cur_item = NIL;
        cur_item = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          planner_rules = ConsesLow.cons( methods.funcall_instance_method_with_0_args( cur_item, $sym37$PLANNER_RULE ), planner_rules );
          cdolist_list_var = cdolist_list_var.rest();
          cur_item = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym109$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, planner_rules );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_pre_ordering( self, pre_ordering );
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
      catch_var_for_shop_basic_plan_method = Errors.handleThrowable( ccatch_env_var, $sym109$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 8799L)
  public static SubLObject shop_basic_plan_gather_preconditions_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_method = NIL;
    final SubLObject pre_ordering = get_shop_basic_plan_pre_ordering( self );
    try
    {
      thread.throwStack.push( $sym113$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
      try
      {
        SubLObject planner_rules = NIL;
        SubLObject cdolist_list_var = pre_ordering;
        SubLObject cur_item = NIL;
        cur_item = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          planner_rules = ConsesLow.cons( methods.funcall_instance_method_with_0_args( cur_item, $sym44$PRECONDITION ), planner_rules );
          cdolist_list_var = cdolist_list_var.rest();
          cur_item = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym113$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, planner_rules );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_pre_ordering( self, pre_ordering );
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
      catch_var_for_shop_basic_plan_method = Errors.handleThrowable( ccatch_env_var, $sym113$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 9064L)
  public static SubLObject shop_basic_plan_single_agent_planP_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_plan_method = NIL;
    final SubLObject simple_binding_list = get_shop_basic_plan_simple_binding_list( self );
    final SubLObject pre_ordering = get_shop_basic_plan_pre_ordering( self );
    try
    {
      thread.throwStack.push( $sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
      try
      {
        final SubLObject first_agent = cycl_utilities.formula_arg1( conses_high.sublis( simple_binding_list, methods.funcall_instance_method_with_0_args( pre_ordering.first(), $sym12$FORMULA ), UNPROVIDED, UNPROVIDED ),
            UNPROVIDED );
        SubLObject cdolist_list_var = pre_ordering.rest();
        SubLObject cur_task = NIL;
        cur_task = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( !first_agent.equal( cycl_utilities.formula_arg1( conses_high.sublis( simple_binding_list, methods.funcall_instance_method_with_0_args( cur_task, $sym12$FORMULA ), UNPROVIDED, UNPROVIDED ), UNPROVIDED ) ) )
          {
            Dynamic.sublisp_throw( $sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, NIL );
          }
          cdolist_list_var = cdolist_list_var.rest();
          cur_task = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_plan_simple_binding_list( self, simple_binding_list );
          set_shop_basic_plan_pre_ordering( self, pre_ordering );
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
      catch_var_for_shop_basic_plan_method = Errors.handleThrowable( ccatch_env_var, $sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_plan_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 9646L)
  public static SubLObject shop_process_open_variables(final SubLObject v_object, final SubLObject mbinding, SubLObject open_vars)
  {
    if( open_vars == UNPROVIDED )
    {
      open_vars = NIL;
    }
    final SubLObject object_vars = list_utilities.tree_gather( v_object, $sym119$SHOP_VARIABLEP, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == open_vars )
    {
      SubLObject cdolist_list_var = object_vars;
      SubLObject cur_var = NIL;
      cur_var = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == multibindings.atomic_binding_in_multibindingP( cur_var, mbinding ) )
        {
          open_vars = ConsesLow.cons( cur_var, open_vars );
        }
        cdolist_list_var = cdolist_list_var.rest();
        cur_var = cdolist_list_var.first();
      }
    }
    return Values.values( v_object, open_vars );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 10463L)
  public static SubLObject ppo_tree_leaves(final SubLObject pre, final SubLObject post, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQ );
    }
    SubLObject leaves = NIL;
    SubLObject cur_pre;
    SubLObject cur_item;
    SubLObject next_item;
    for( cur_pre = NIL, cur_pre = pre; NIL != cur_pre; cur_pre = cur_pre.rest() )
    {
      cur_item = cur_pre.first();
      next_item = conses_high.second( cur_pre );
      if( NIL != list_utilities.singletonP( cur_pre ) )
      {
        leaves = ConsesLow.cons( cur_item, leaves );
      }
      else if( NIL == ppo_tree_ancestorP( pre, post, cur_item, next_item, test ) )
      {
        leaves = ConsesLow.cons( cur_item, leaves );
      }
    }
    return Sequences.nreverse( leaves );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 11289L)
  public static SubLObject ppo_tree_ancestorP(final SubLObject pre, final SubLObject post, final SubLObject item1, final SubLObject item2, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQ );
    }
    return makeBoolean( NIL != list_utilities.position_L( item1, item2, pre, test, UNPROVIDED ) && NIL != list_utilities.position_L( item2, item1, post, test, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 11657L)
  public static SubLObject ppo_tree_descendantP(final SubLObject pre, final SubLObject post, final SubLObject item1, final SubLObject item2, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQ );
    }
    return ppo_tree_ancestorP( pre, post, item2, item1, test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 11995L)
  public static SubLObject do_ppo_tree_depth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject item = NIL;
    SubLObject depth = NIL;
    SubLObject pre = NIL;
    SubLObject post = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
    item = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
    depth = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
    pre = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
    post = current.first();
    current = current.rest();
    final SubLObject test = current.isCons() ? current.first() : Symbols.symbol_function( EQ );
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list120 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject cur_pre = $sym121$CUR_PRE;
      final SubLObject next = $sym122$NEXT;
      final SubLObject stack = $sym123$STACK;
      return ConsesLow.list( $sym124$CLET, ConsesLow.list( reader.bq_cons( stack, $list125 ), reader.bq_cons( depth, $list126 ) ), ConsesLow.list( $sym127$CDO, ConsesLow.list( ConsesLow.list( cur_pre, pre, ConsesLow
          .list( $sym128$REST, cur_pre ) ) ), ConsesLow.list( ConsesLow.list( $sym129$NULL, cur_pre ) ), ConsesLow.listS( $sym124$CLET, ConsesLow.list( ConsesLow.list( item, ConsesLow.list( $sym130$FIRST, cur_pre ) ),
              ConsesLow.list( next, ConsesLow.list( $sym131$SECOND, cur_pre ) ) ), ConsesLow.list( $sym132$WHILE, ConsesLow.list( $sym133$CAND, ConsesLow.list( $sym134$CNOT, ConsesLow.list( $sym135$PPO_TREE_DESCENDANT_,
                  pre, post, item, ConsesLow.list( $sym130$FIRST, stack ), test ) ), ConsesLow.list( $sym134$CNOT, ConsesLow.list( $sym129$NULL, stack ) ) ), ConsesLow.list( $sym136$CDEC, depth ), ConsesLow.list(
                      $sym137$CPOP, stack ) ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym138$PWHEN, ConsesLow.list( $sym135$PPO_TREE_DESCENDANT_, pre, post, next, item, test ), ConsesLow.list(
                          $sym139$CINC, depth ), ConsesLow.list( $sym140$CPUSH, item, stack ) ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list120 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-plan.lisp", position = 12633L)
  public static SubLObject shop_plan_compare(final SubLObject plan1, final SubLObject plan2)
  {
    SubLObject entry1 = NIL;
    SubLObject entry1_$6 = NIL;
    SubLObject entry2 = NIL;
    SubLObject entry2_$7 = NIL;
    entry1 = get_shop_basic_plan_post_ordering( plan1 );
    entry1_$6 = entry1.first();
    entry2 = get_shop_basic_plan_post_ordering( plan2 );
    entry2_$7 = entry2.first();
    while ( NIL != entry2 || NIL != entry1)
    {
      final SubLObject sentence1 = methods.funcall_instance_method_with_0_args( entry1_$6, $sym12$FORMULA );
      final SubLObject sentence2 = methods.funcall_instance_method_with_0_args( entry2_$7, $sym12$FORMULA );
      if( !sentence1.equal( sentence2 ) )
      {
        return ConsesLow.list( sentence1, sentence2 );
      }
      entry1 = entry1.rest();
      entry1_$6 = entry1.first();
      entry2 = entry2.rest();
      entry2_$7 = entry2.first();
    }
    return T;
  }

  public static SubLObject declare_shop_basic_plan_file()
  {
    SubLFiles.declareFunction( me, "shop_task_p", "SHOP-TASK-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_task_status", "GET-SHOP-BASIC-TASK-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_task_status", "SET-SHOP-BASIC-TASK-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_task_task_struc", "GET-SHOP-BASIC-TASK-TASK-STRUC", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_task_task_struc", "SET-SHOP-BASIC-TASK-TASK-STRUC", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_task_precond", "GET-SHOP-BASIC-TASK-PRECOND", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_task_precond", "SET-SHOP-BASIC-TASK-PRECOND", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_task_bindings", "GET-SHOP-BASIC-TASK-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_task_bindings", "SET-SHOP-BASIC-TASK-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_task_formula", "GET-SHOP-BASIC-TASK-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_task_formula", "SET-SHOP-BASIC-TASK-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_task_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-TASK-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_task_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-TASK-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_task_p", "SHOP-BASIC-TASK-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_task_strip_task_method", "SHOP-BASIC-TASK-STRIP-TASK-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_task_print_method", "SHOP-BASIC-TASK-PRINT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_task_init_method", "SHOP-BASIC-TASK-INIT-METHOD", 5, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_task_planner_rule_method", "SHOP-BASIC-TASK-PLANNER-RULE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_task_formula_method", "SHOP-BASIC-TASK-FORMULA-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_task_precondition_method", "SHOP-BASIC-TASK-PRECONDITION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_task_primitiveP_method", "SHOP-BASIC-TASK-PRIMITIVE?-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_task_mbindings_method", "SHOP-BASIC-TASK-MBINDINGS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_plan_i_p", "SHOP-PLAN-I-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_variable_manager", "GET-SHOP-BASIC-PLAN-VARIABLE-MANAGER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_variable_manager", "SET-SHOP-BASIC-PLAN-VARIABLE-MANAGER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_open_variables", "GET-SHOP-BASIC-PLAN-OPEN-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_open_variables", "SET-SHOP-BASIC-PLAN-OPEN-VARIABLES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_total_cost", "GET-SHOP-BASIC-PLAN-TOTAL-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_total_cost", "SET-SHOP-BASIC-PLAN-TOTAL-COST", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_simple_binding_list", "GET-SHOP-BASIC-PLAN-SIMPLE-BINDING-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_simple_binding_list", "SET-SHOP-BASIC-PLAN-SIMPLE-BINDING-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_bindings", "GET-SHOP-BASIC-PLAN-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_bindings", "SET-SHOP-BASIC-PLAN-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_task_strucs", "GET-SHOP-BASIC-PLAN-TASK-STRUCS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_task_strucs", "SET-SHOP-BASIC-PLAN-TASK-STRUCS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_post_ordering", "GET-SHOP-BASIC-PLAN-POST-ORDERING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_post_ordering", "SET-SHOP-BASIC-PLAN-POST-ORDERING", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_plan_pre_ordering", "GET-SHOP-BASIC-PLAN-PRE-ORDERING", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_plan_pre_ordering", "SET-SHOP-BASIC-PLAN-PRE-ORDERING", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_plan_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_plan_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_p", "SHOP-BASIC-PLAN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_populate_plan_method", "SHOP-BASIC-PLAN-POPULATE-PLAN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_ground_forms_method", "SHOP-BASIC-PLAN-GROUND-FORMS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_primitive_form_method", "SHOP-BASIC-PLAN-PRIMITIVE-FORM-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_non_primitive_pre_ordering_method", "SHOP-BASIC-PLAN-NON-PRIMITIVE-PRE-ORDERING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_goal_task_method", "SHOP-BASIC-PLAN-GOAL-TASK-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_post_ordering_method", "SHOP-BASIC-PLAN-POST-ORDERING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_cost_method", "SHOP-BASIC-PLAN-COST-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_variable_manager_method", "SHOP-BASIC-PLAN-VARIABLE-MANAGER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_mbinding_method", "SHOP-BASIC-PLAN-MBINDING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_gather_planner_rules_method", "SHOP-BASIC-PLAN-GATHER-PLANNER-RULES-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_gather_preconditions_method", "SHOP-BASIC-PLAN-GATHER-PRECONDITIONS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_plan_single_agent_planP_method", "SHOP-BASIC-PLAN-SINGLE-AGENT-PLAN?-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_process_open_variables", "SHOP-PROCESS-OPEN-VARIABLES", 2, 1, false );
    SubLFiles.declareFunction( me, "ppo_tree_leaves", "PPO-TREE-LEAVES", 2, 1, false );
    SubLFiles.declareFunction( me, "ppo_tree_ancestorP", "PPO-TREE-ANCESTOR?", 4, 1, false );
    SubLFiles.declareFunction( me, "ppo_tree_descendantP", "PPO-TREE-DESCENDANT?", 4, 1, false );
    SubLFiles.declareMacro( me, "do_ppo_tree_depth", "DO-PPO-TREE-DEPTH" );
    SubLFiles.declareFunction( me, "shop_plan_compare", "SHOP-PLAN-COMPARE", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_shop_basic_plan_file()
  {
    return NIL;
  }

  public static SubLObject setup_shop_basic_plan_file()
  {
    interfaces.new_interface( $sym0$SHOP_TASK, NIL, NIL, $list1 );
    classes.subloop_new_class( $sym2$SHOP_BASIC_TASK, $sym3$SHOP_INDEXED_OBJECT, $list4, NIL, $list5 );
    classes.class_set_implements_slot_listeners( $sym2$SHOP_BASIC_TASK, NIL );
    classes.subloop_note_class_initialization_function( $sym2$SHOP_BASIC_TASK, $sym9$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_TASK_CLASS );
    classes.subloop_note_instance_initialization_function( $sym2$SHOP_BASIC_TASK, $sym17$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_TASK_INSTANCE );
    subloop_reserved_initialize_shop_basic_task_class( $sym2$SHOP_BASIC_TASK );
    methods.methods_incorporate_instance_method( $sym18$STRIP_TASK, $sym2$SHOP_BASIC_TASK, NIL, NIL, $list19 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_TASK, $sym18$STRIP_TASK, $sym21$SHOP_BASIC_TASK_STRIP_TASK_METHOD );
    methods.methods_incorporate_instance_method( $sym22$PRINT, $sym2$SHOP_BASIC_TASK, $list23, $list24, $list25 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_TASK, $sym22$PRINT, $sym29$SHOP_BASIC_TASK_PRINT_METHOD );
    methods.methods_incorporate_instance_method( $sym30$INIT, $sym2$SHOP_BASIC_TASK, $list23, $list31, $list32 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_TASK, $sym30$INIT, $sym36$SHOP_BASIC_TASK_INIT_METHOD );
    methods.methods_incorporate_instance_method( $sym37$PLANNER_RULE, $sym2$SHOP_BASIC_TASK, $list23, NIL, $list38 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_TASK, $sym37$PLANNER_RULE, $sym40$SHOP_BASIC_TASK_PLANNER_RULE_METHOD );
    methods.methods_incorporate_instance_method( $sym12$FORMULA, $sym2$SHOP_BASIC_TASK, $list23, NIL, $list41 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_TASK, $sym12$FORMULA, $sym43$SHOP_BASIC_TASK_FORMULA_METHOD );
    methods.methods_incorporate_instance_method( $sym44$PRECONDITION, $sym2$SHOP_BASIC_TASK, $list23, NIL, $list45 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_TASK, $sym44$PRECONDITION, $sym47$SHOP_BASIC_TASK_PRECONDITION_METHOD );
    methods.methods_incorporate_instance_method( $sym48$PRIMITIVE_, $sym2$SHOP_BASIC_TASK, $list23, NIL, $list49 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_TASK, $sym48$PRIMITIVE_, $sym51$SHOP_BASIC_TASK_PRIMITIVE__METHOD );
    methods.methods_incorporate_instance_method( $sym52$MBINDINGS, $sym2$SHOP_BASIC_TASK, $list23, NIL, $list53 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_TASK, $sym52$MBINDINGS, $sym55$SHOP_BASIC_TASK_MBINDINGS_METHOD );
    interfaces.new_interface( $sym56$SHOP_PLAN_I, NIL, NIL, $list57 );
    classes.subloop_new_class( $sym58$SHOP_BASIC_PLAN, $sym6$OBJECT, $list59, NIL, $list60 );
    classes.class_set_implements_slot_listeners( $sym58$SHOP_BASIC_PLAN, NIL );
    classes.subloop_note_class_initialization_function( $sym58$SHOP_BASIC_PLAN, $sym61$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_CLASS );
    classes.subloop_note_instance_initialization_function( $sym58$SHOP_BASIC_PLAN, $sym69$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_INSTANCE );
    subloop_reserved_initialize_shop_basic_plan_class( $sym58$SHOP_BASIC_PLAN );
    methods.methods_incorporate_instance_method( $sym70$POPULATE_PLAN, $sym58$SHOP_BASIC_PLAN, $list23, $list71, $list72 );
    methods.subloop_register_instance_method( $sym58$SHOP_BASIC_PLAN, $sym70$POPULATE_PLAN, $sym77$SHOP_BASIC_PLAN_POPULATE_PLAN_METHOD );
    methods.methods_incorporate_instance_method( $sym78$GROUND_FORMS, $sym58$SHOP_BASIC_PLAN, $list23, NIL, $list79 );
    methods.subloop_register_instance_method( $sym58$SHOP_BASIC_PLAN, $sym78$GROUND_FORMS, $sym81$SHOP_BASIC_PLAN_GROUND_FORMS_METHOD );
    methods.methods_incorporate_instance_method( $sym82$PRIMITIVE_FORM, $sym58$SHOP_BASIC_PLAN, $list23, NIL, $list83 );
    methods.subloop_register_instance_method( $sym58$SHOP_BASIC_PLAN, $sym82$PRIMITIVE_FORM, $sym85$SHOP_BASIC_PLAN_PRIMITIVE_FORM_METHOD );
    methods.methods_incorporate_instance_method( $sym86$NON_PRIMITIVE_PRE_ORDERING, $sym58$SHOP_BASIC_PLAN, $list23, NIL, $list87 );
    methods.subloop_register_instance_method( $sym58$SHOP_BASIC_PLAN, $sym86$NON_PRIMITIVE_PRE_ORDERING, $sym89$SHOP_BASIC_PLAN_NON_PRIMITIVE_PRE_ORDERING_METHOD );
    methods.methods_incorporate_instance_method( $sym90$GOAL_TASK, $sym58$SHOP_BASIC_PLAN, $list23, NIL, $list91 );
    methods.subloop_register_instance_method( $sym58$SHOP_BASIC_PLAN, $sym90$GOAL_TASK, $sym93$SHOP_BASIC_PLAN_GOAL_TASK_METHOD );
    methods.methods_incorporate_instance_method( $sym63$POST_ORDERING, $sym58$SHOP_BASIC_PLAN, $list23, NIL, $list94 );
    methods.subloop_register_instance_method( $sym58$SHOP_BASIC_PLAN, $sym63$POST_ORDERING, $sym96$SHOP_BASIC_PLAN_POST_ORDERING_METHOD );
    methods.methods_incorporate_instance_method( $sym97$COST, $sym58$SHOP_BASIC_PLAN, $list23, NIL, $list98 );
    methods.subloop_register_instance_method( $sym58$SHOP_BASIC_PLAN, $sym97$COST, $sym100$SHOP_BASIC_PLAN_COST_METHOD );
    methods.methods_incorporate_instance_method( $sym68$VARIABLE_MANAGER, $sym58$SHOP_BASIC_PLAN, $list23, NIL, $list101 );
    methods.subloop_register_instance_method( $sym58$SHOP_BASIC_PLAN, $sym68$VARIABLE_MANAGER, $sym103$SHOP_BASIC_PLAN_VARIABLE_MANAGER_METHOD );
    methods.methods_incorporate_instance_method( $sym104$MBINDING, $sym58$SHOP_BASIC_PLAN, $list23, NIL, $list53 );
    methods.subloop_register_instance_method( $sym58$SHOP_BASIC_PLAN, $sym104$MBINDING, $sym106$SHOP_BASIC_PLAN_MBINDING_METHOD );
    methods.methods_incorporate_instance_method( $sym107$GATHER_PLANNER_RULES, $sym58$SHOP_BASIC_PLAN, $list23, NIL, $list108 );
    methods.subloop_register_instance_method( $sym58$SHOP_BASIC_PLAN, $sym107$GATHER_PLANNER_RULES, $sym110$SHOP_BASIC_PLAN_GATHER_PLANNER_RULES_METHOD );
    methods.methods_incorporate_instance_method( $sym111$GATHER_PRECONDITIONS, $sym58$SHOP_BASIC_PLAN, $list23, NIL, $list112 );
    methods.subloop_register_instance_method( $sym58$SHOP_BASIC_PLAN, $sym111$GATHER_PRECONDITIONS, $sym114$SHOP_BASIC_PLAN_GATHER_PRECONDITIONS_METHOD );
    methods.methods_incorporate_instance_method( $sym115$SINGLE_AGENT_PLAN_, $sym58$SHOP_BASIC_PLAN, $list23, NIL, $list116 );
    methods.subloop_register_instance_method( $sym58$SHOP_BASIC_PLAN, $sym115$SINGLE_AGENT_PLAN_, $sym118$SHOP_BASIC_PLAN_SINGLE_AGENT_PLAN__METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_shop_basic_plan_file();
  }

  @Override
  public void initializeVariables()
  {
    init_shop_basic_plan_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_shop_basic_plan_file();
  }
  static
  {
    me = new shop_basic_plan();
    $sym0$SHOP_TASK = makeSymbol( "SHOP-TASK" );
    $list1 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FORMULA" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "MBINDINGS" ),
        NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INIT" ), ConsesLow.list( makeSymbol( "TASK" ), makeSymbol( "BINDING" ), makeSymbol( "PRECOND" ), makeSymbol(
            "TASK-STRUC" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "PLANNER-RULE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                "DEF-INSTANCE-METHOD" ), makeSymbol( "PRIMITIVE?" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym2$SHOP_BASIC_TASK = makeSymbol( "SHOP-BASIC-TASK" );
    $sym3$SHOP_INDEXED_OBJECT = makeSymbol( "SHOP-INDEXED-OBJECT" );
    $list4 = ConsesLow.list( makeSymbol( "SHOP-TASK" ) );
    $list5 = ConsesLow.list( ConsesLow.list( makeSymbol( "FORMULA" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "BINDINGS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ),
        ConsesLow.list( makeSymbol( "PRECOND" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "TASK-STRUC" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
            makeSymbol( "STATUS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ) );
    $sym6$OBJECT = makeSymbol( "OBJECT" );
    $sym7$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym8$INSTANCE_INDEX = makeSymbol( "INSTANCE-INDEX" );
    $sym9$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_TASK_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-TASK-CLASS" );
    $sym10$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym11$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym12$FORMULA = makeSymbol( "FORMULA" );
    $sym13$BINDINGS = makeSymbol( "BINDINGS" );
    $sym14$PRECOND = makeSymbol( "PRECOND" );
    $sym15$TASK_STRUC = makeSymbol( "TASK-STRUC" );
    $sym16$STATUS = makeSymbol( "STATUS" );
    $sym17$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_TASK_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-TASK-INSTANCE" );
    $sym18$STRIP_TASK = makeSymbol( "STRIP-TASK" );
    $list19 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-TASK" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "NEW-TASK" ),
        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FORMULA" ) ), ConsesLow.list( makeSymbol( "SECOND" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "FORMULA" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-TASK" ) ) ) );
    $sym20$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD" );
    $sym21$SHOP_BASIC_TASK_STRIP_TASK_METHOD = makeSymbol( "SHOP-BASIC-TASK-STRIP-TASK-METHOD" );
    $sym22$PRINT = makeSymbol( "PRINT" );
    $list23 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list24 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "DEPTH" ) );
    $list25 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "DEPTH" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "SELF" ) ), ConsesLow.list(
        makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ), makeString( "#<Task-~S:~S>" ), makeSymbol( "INSTANCE-NUMBER" ), makeSymbol( "FORMULA" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeSymbol( "STREAM" ),
            makeString( "#<Malformed Instance>" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym26$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD" );
    $str27$__Task__S__S_ = makeString( "#<Task-~S:~S>" );
    $str28$__Malformed_Instance_ = makeString( "#<Malformed Instance>" );
    $sym29$SHOP_BASIC_TASK_PRINT_METHOD = makeSymbol( "SHOP-BASIC-TASK-PRINT-METHOD" );
    $sym30$INIT = makeSymbol( "INIT" );
    $list31 = ConsesLow.list( makeSymbol( "NEW-TASK" ), makeSymbol( "NEW-BINDING" ), makeSymbol( "NEW-PRECOND" ), makeSymbol( "NEW-TASK-STRUC" ) );
    $list32 = ConsesLow.list( makeString( "@param TASK hl-formula-p\n   @param BINDING multibinding-p\n   @param PRECOND listp\n   @param TASK-STRUC shop-planner-rule-p\n   @return shop-html-task-p" ), ConsesLow.list(
        makeSymbol( "PIF" ), ConsesLow.list( EQ, ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "NEW-TASK" ) ), makeKeyword( "PRIMITIVE" ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol(
            "CSETQ" ), makeSymbol( "FORMULA" ), ConsesLow.list( makeSymbol( "SECOND" ), makeSymbol( "NEW-TASK" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "STATUS" ), makeKeyword( "PRIMITIVE" ) ) ),
        ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "FORMULA" ), makeSymbol( "NEW-TASK" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "STATUS" ), makeKeyword(
            "COMPLEX" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "BINDINGS" ), makeSymbol( "NEW-BINDING" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PRECOND" ), makeSymbol(
                "NEW-PRECOND" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TASK-STRUC" ), makeSymbol( "NEW-TASK-STRUC" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym33$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD" );
    $kw34$PRIMITIVE = makeKeyword( "PRIMITIVE" );
    $kw35$COMPLEX = makeKeyword( "COMPLEX" );
    $sym36$SHOP_BASIC_TASK_INIT_METHOD = makeSymbol( "SHOP-BASIC-TASK-INIT-METHOD" );
    $sym37$PLANNER_RULE = makeSymbol( "PLANNER-RULE" );
    $list38 = ConsesLow.list( makeString( "@return shop-planner-rule-p" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TASK-STRUC" ) ) );
    $sym39$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD" );
    $sym40$SHOP_BASIC_TASK_PLANNER_RULE_METHOD = makeSymbol( "SHOP-BASIC-TASK-PLANNER-RULE-METHOD" );
    $list41 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "FORMULA" ) ) );
    $sym42$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD" );
    $sym43$SHOP_BASIC_TASK_FORMULA_METHOD = makeSymbol( "SHOP-BASIC-TASK-FORMULA-METHOD" );
    $sym44$PRECONDITION = makeSymbol( "PRECONDITION" );
    $list45 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PRECOND" ) ) );
    $sym46$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD" );
    $sym47$SHOP_BASIC_TASK_PRECONDITION_METHOD = makeSymbol( "SHOP-BASIC-TASK-PRECONDITION-METHOD" );
    $sym48$PRIMITIVE_ = makeSymbol( "PRIMITIVE?" );
    $list49 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( EQ, makeSymbol( "STATUS" ), makeKeyword( "PRIMITIVE" ) ) ) );
    $sym50$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD" );
    $sym51$SHOP_BASIC_TASK_PRIMITIVE__METHOD = makeSymbol( "SHOP-BASIC-TASK-PRIMITIVE?-METHOD" );
    $sym52$MBINDINGS = makeSymbol( "MBINDINGS" );
    $list53 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "BINDINGS" ) ) );
    $sym54$OUTER_CATCH_FOR_SHOP_BASIC_TASK_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-TASK-METHOD" );
    $sym55$SHOP_BASIC_TASK_MBINDINGS_METHOD = makeSymbol( "SHOP-BASIC-TASK-MBINDINGS-METHOD" );
    $sym56$SHOP_PLAN_I = makeSymbol( "SHOP-PLAN-I" );
    $list57 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "POST-ORDERING" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "PRIMITIVE-FORM" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GROUND-FORMS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "COST" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GOAL-TASK" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "POPULATE-PLAN" ), ConsesLow.list( makeSymbol( "PLAN-STATE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
                    makeSymbol( "GATHER-PLANNER-RULES" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GATHER-PRECONDITIONS" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym58$SHOP_BASIC_PLAN = makeSymbol( "SHOP-BASIC-PLAN" );
    $list59 = ConsesLow.list( makeSymbol( "SHOP-PLAN-I" ) );
    $list60 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "PRE-ORDERING" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "POST-ORDERING" ), makeKeyword(
        "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "TASK-STRUCS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "BINDINGS" ), makeKeyword( "INSTANCE" ),
            makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "SIMPLE-BINDING-LIST" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "TOTAL-COST" ), makeKeyword( "INSTANCE" ),
                makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "OPEN-VARIABLES" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "VARIABLE-MANAGER" ), makeKeyword(
                    "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "VARIABLE-MANAGER" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                        "DEF-INSTANCE-METHOD" ), makeSymbol( "NON-PRIMITIVE-PRE-ORDERING" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "SINGLE-AGENT-PLAN?" ), NIL,
                            makeKeyword( "PUBLIC" ) )
    } );
    $sym61$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-CLASS" );
    $sym62$PRE_ORDERING = makeSymbol( "PRE-ORDERING" );
    $sym63$POST_ORDERING = makeSymbol( "POST-ORDERING" );
    $sym64$TASK_STRUCS = makeSymbol( "TASK-STRUCS" );
    $sym65$SIMPLE_BINDING_LIST = makeSymbol( "SIMPLE-BINDING-LIST" );
    $sym66$TOTAL_COST = makeSymbol( "TOTAL-COST" );
    $sym67$OPEN_VARIABLES = makeSymbol( "OPEN-VARIABLES" );
    $sym68$VARIABLE_MANAGER = makeSymbol( "VARIABLE-MANAGER" );
    $sym69$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_PLAN_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-PLAN-INSTANCE" );
    $sym70$POPULATE_PLAN = makeSymbol( "POPULATE-PLAN" );
    $list71 = ConsesLow.list( makeSymbol( "PLAN-STATE" ) );
    $list72 = ConsesLow.list( makeString( "@param PLAN-STATE shop-basic-plan-state-p" ), ConsesLow.list( new SubLObject[] { makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TASK-PRE-ORDERING" ),
        ConsesLow.list( makeSymbol( "GET-SHOP-BASIC-PLAN-STATE-PARTIAL-PLAN" ), makeSymbol( "PLAN-STATE" ) ) ), ConsesLow.list( makeSymbol( "TASK-POST-ORDERING" ), ConsesLow.list( makeSymbol( "REVERSE" ), ConsesLow.list(
            makeSymbol( "GET-SHOP-BASIC-PLAN-STATE-POST-ORDERING" ), makeSymbol( "PLAN-STATE" ) ) ) ), ConsesLow.list( makeSymbol( "TASK-BINDINGS" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list(
                makeSymbol( "MBINDING" ), makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ), makeSymbol( "PLAN-STATE" ) ) ), ConsesLow.list( makeSymbol( "SIMPLE-BINDINGS" ), ConsesLow.list( makeSymbol(
                    "MBIND-SIMPLE-BINDING-LIST" ), makeSymbol( "TASK-BINDINGS" ) ) ), ConsesLow.list( makeSymbol( "TASK-STRUCS" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol(
                        "TASK-STRUCS" ), makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ), makeSymbol( "PLAN-STATE" ) ) ), ConsesLow.list( makeSymbol( "PRECONDS" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list(
                            makeSymbol( "SUPPORT-LISTS" ), makeSymbol( "SHOP-BASIC-PLAN-STATE" ) ), makeSymbol( "PLAN-STATE" ) ) ), ConsesLow.list( makeSymbol( "TASK-LIST" ), NIL ), ConsesLow.list( makeSymbol(
                                "TASK-ASSOC" ), ConsesLow.list( makeSymbol( "MAKE-HASH-TABLE" ), makeInteger( 50 ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQ ) ) ) ), ConsesLow.list( makeSymbol(
                                    "CMULTIPLE-VALUE-BIND" ), ConsesLow.list( makeSymbol( "NEW-TASK-PRE-ORDERING" ), makeSymbol( "NEW-OPEN-VARIABLES" ) ), ConsesLow.list( makeSymbol( "SHOP-PROCESS-OPEN-VARIABLES" ),
                                        makeSymbol( "TASK-PRE-ORDERING" ), makeSymbol( "TASK-BINDINGS" ) ), ConsesLow.list( makeSymbol( "CMULTIPLE-VALUE-BIND" ), ConsesLow.list( makeSymbol( "NEW-TASK-POST-ORDERING" ),
                                            makeSymbol( "NEW-OPEN-VARIABLES" ) ), ConsesLow.list( makeSymbol( "SHOP-PROCESS-OPEN-VARIABLES" ), makeSymbol( "TASK-POST-ORDERING" ), makeSymbol( "TASK-BINDINGS" ),
                                                makeSymbol( "NEW-OPEN-VARIABLES" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TASK-PRE-ORDERING" ), makeSymbol( "NEW-TASK-PRE-ORDERING" ) ), ConsesLow.list(
                                                    makeSymbol( "CSETQ" ), makeSymbol( "TASK-POST-ORDERING" ), makeSymbol( "NEW-TASK-POST-ORDERING" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                                        "OPEN-VARIABLES" ), makeSymbol( "NEW-OPEN-VARIABLES" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST-MULTIPLE" ), ConsesLow.list( ConsesLow.list( makeSymbol(
                                                            "TASK" ), makeSymbol( "TASK-PRE-ORDERING" ) ), ConsesLow.list( makeSymbol( "PRECOND" ), makeSymbol( "PRECONDS" ) ), ConsesLow.list( makeSymbol( "TASK-STRUC" ),
                                                                makeSymbol( "TASK-STRUCS" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-TASK-OBJ" ), ConsesLow.list(
                                                                    makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ), makeSymbol( "SHOP-BASIC-TASK" ) ), ConsesLow.list( makeSymbol( "QUOTE" ),
                                                                        makeSymbol( "SHOP-BASIC-TASK" ) ) ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "INIT" ), makeSymbol(
                                                                            "SHOP-BASIC-TASK" ) ), makeSymbol( "NEW-TASK-OBJ" ), makeSymbol( "TASK" ), makeSymbol( "TASK-BINDINGS" ), makeSymbol( "PRECOND" ), makeSymbol(
                                                                                "TASK-STRUC" ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "GETHASH" ), makeSymbol( "TASK" ), makeSymbol(
                                                                                    "TASK-ASSOC" ) ), makeSymbol( "NEW-TASK-OBJ" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "NEW-TASK-OBJ" ), makeSymbol(
                                                                                        "TASK-LIST" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PRE-ORDERING" ), ConsesLow.list( makeSymbol( "REVERSE" ),
                                                                                            makeSymbol( "TASK-LIST" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "TASK-LIST" ), NIL ), ConsesLow.list(
                                                                                                makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "TASK" ), makeSymbol( "TASK-POST-ORDERING" ) ), ConsesLow.list(
                                                                                                    makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "TASK-ENTRY" ), ConsesLow.list( makeSymbol(
                                                                                                        "GETHASH" ), makeSymbol( "TASK" ), makeSymbol( "TASK-ASSOC" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow
                                                                                                            .list( makeSymbol( "NULL" ), makeSymbol( "TASK-ENTRY" ) ), ConsesLow.list( makeSymbol( "WARN" ), makeString(
                                                                                                                "tried to add null entry to task-list from task ~a" ), makeSymbol( "TASK" ) ), ConsesLow.list( makeSymbol(
                                                                                                                    "CPUSH" ), makeSymbol( "TASK-ENTRY" ), makeSymbol( "TASK-LIST" ) ) ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                        "CSETQ" ), makeSymbol( "TASK-STRUCS" ), ConsesLow.list( makeSymbol(
                                                                                                                            "GET-SHOP-BASIC-PLAN-STATE-TASK-STRUCS" ), makeSymbol( "PLAN-STATE" ) ) ), ConsesLow.list(
                                                                                                                                makeSymbol( "CSETQ" ), makeSymbol( "POST-ORDERING" ), ConsesLow.list( makeSymbol(
                                                                                                                                    "REVERSE" ), makeSymbol( "TASK-LIST" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ),
                                                                                                                                        makeSymbol( "BINDINGS" ), makeSymbol( "TASK-BINDINGS" ) ), ConsesLow.list(
                                                                                                                                            makeSymbol( "CSETQ" ), makeSymbol( "SIMPLE-BINDING-LIST" ), makeSymbol(
                                                                                                                                                "SIMPLE-BINDINGS" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                                                                                                                                    "VARIABLE-MANAGER" ), ConsesLow.list( makeSymbol( "GET-SLOT" ),
                                                                                                                                                        ConsesLow.list( makeSymbol( "GET-SHOP-BASIC-PLAN-STATE-PLANNER" ),
                                                                                                                                                            makeSymbol( "PLAN-STATE" ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                                "QUOTE" ), makeSymbol( "VAR-MANAGER" ) ) ) ), ConsesLow
                                                                                                                                                                    .list( makeSymbol( "CSETQ" ), makeSymbol(
                                                                                                                                                                        "TOTAL-COST" ), ConsesLow.list( makeSymbol(
                                                                                                                                                                            "LIST-LENGTH" ), makeSymbol(
                                                                                                                                                                                "TASK-PRE-ORDERING" ) ) ), ConsesLow.list(
                                                                                                                                                                                    makeSymbol( "RET" ), NIL )
    } ) );
    $sym73$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD" );
    $int74$50 = makeInteger( 50 );
    $str75$tried_to_add_null_entry_to_task_l = makeString( "tried to add null entry to task-list from task ~a" );
    $sym76$VAR_MANAGER = makeSymbol( "VAR-MANAGER" );
    $sym77$SHOP_BASIC_PLAN_POPULATE_PLAN_METHOD = makeSymbol( "SHOP-BASIC-PLAN-POPULATE-PLAN-METHOD" );
    $sym78$GROUND_FORMS = makeSymbol( "GROUND-FORMS" );
    $list79 = ConsesLow.list( makeString(
        "@param listp ;; singleton list containing the plan's simple actions, if there are no multibound variables.\n              ;; o/w, the list of plans produced when the multibinding is expanded." ), ConsesLow.list(
            makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PRIMITIVE-FORM" ), ConsesLow.list( makeSymbol( "PRIMITIVE-FORM" ), makeSymbol( "SELF" ) ) ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow
                .list( makeSymbol( "NULL" ), makeSymbol( "OPEN-VARIABLES" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "PRIMITIVE-FORM" ) ) ), ConsesLow.list( makeSymbol(
                    "PROGN" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "APPLY-MULTIBINDING" ), makeSymbol( "PRIMITIVE-FORM" ), makeSymbol( "BINDINGS" ) ) ) ) ) ) );
    $sym80$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD" );
    $sym81$SHOP_BASIC_PLAN_GROUND_FORMS_METHOD = makeSymbol( "SHOP-BASIC-PLAN-GROUND-FORMS-METHOD" );
    $sym82$PRIMITIVE_FORM = makeSymbol( "PRIMITIVE-FORM" );
    $list83 = ConsesLow.list( makeString( "@return listp ;;The plan's simple actions only, in sequence." ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PRIMITIVE-TASKS" ), ConsesLow
        .list( makeSymbol( "PPO-TREE-LEAVES" ), ConsesLow.list( makeSymbol( "REVERSE" ), makeSymbol( "PRE-ORDERING" ) ), makeSymbol( "POST-ORDERING" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQ ) ) ), ConsesLow.list(
            makeSymbol( "PRIMITIVE-FORMS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-TASK" ), makeSymbol( "PRIMITIVE-TASKS" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow
                .list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "FORMULA" ), makeSymbol( "SHOP-BASIC-TASK" ) ), makeSymbol( "CUR-TASK" ) ), makeSymbol( "PRIMITIVE-FORMS" ) ) ), ConsesLow.list(
                    makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "PRIMITIVE-FORMS" ) ) ) ) );
    $sym84$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD" );
    $sym85$SHOP_BASIC_PLAN_PRIMITIVE_FORM_METHOD = makeSymbol( "SHOP-BASIC-PLAN-PRIMITIVE-FORM-METHOD" );
    $sym86$NON_PRIMITIVE_PRE_ORDERING = makeSymbol( "NON-PRIMITIVE-PRE-ORDERING" );
    $list87 = ConsesLow.list( makeString( "@return listp ;; the pre-order of complex tasks in the plan." ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NON-PRIMITIVE-LIST" ),
        NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-TASK" ), makeSymbol( "PRE-ORDERING" ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ),
            ConsesLow.list( makeSymbol( "PRIMITIVE?" ), makeSymbol( "SHOP-BASIC-TASK" ) ), makeSymbol( "CUR-TASK" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "CUR-TASK" ), makeSymbol(
                "NON-PRIMITIVE-LIST" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NON-PRIMITIVE-LIST" ) ) ) );
    $sym88$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD" );
    $sym89$SHOP_BASIC_PLAN_NON_PRIMITIVE_PRE_ORDERING_METHOD = makeSymbol( "SHOP-BASIC-PLAN-NON-PRIMITIVE-PRE-ORDERING-METHOD" );
    $sym90$GOAL_TASK = makeSymbol( "GOAL-TASK" );
    $list91 = ConsesLow.list( makeString( "@return hl-formula-p ;; the goal for which SELF is a plan." ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "LAST-ONE" ), makeSymbol( "PRE-ORDERING" ) ) ) );
    $sym92$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD" );
    $sym93$SHOP_BASIC_PLAN_GOAL_TASK_METHOD = makeSymbol( "SHOP-BASIC-PLAN-GOAL-TASK-METHOD" );
    $list94 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "POST-ORDERING" ) ) );
    $sym95$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD" );
    $sym96$SHOP_BASIC_PLAN_POST_ORDERING_METHOD = makeSymbol( "SHOP-BASIC-PLAN-POST-ORDERING-METHOD" );
    $sym97$COST = makeSymbol( "COST" );
    $list98 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "TOTAL-COST" ) ) );
    $sym99$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD" );
    $sym100$SHOP_BASIC_PLAN_COST_METHOD = makeSymbol( "SHOP-BASIC-PLAN-COST-METHOD" );
    $list101 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "VARIABLE-MANAGER" ) ) );
    $sym102$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD" );
    $sym103$SHOP_BASIC_PLAN_VARIABLE_MANAGER_METHOD = makeSymbol( "SHOP-BASIC-PLAN-VARIABLE-MANAGER-METHOD" );
    $sym104$MBINDING = makeSymbol( "MBINDING" );
    $sym105$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD" );
    $sym106$SHOP_BASIC_PLAN_MBINDING_METHOD = makeSymbol( "SHOP-BASIC-PLAN-MBINDING-METHOD" );
    $sym107$GATHER_PLANNER_RULES = makeSymbol( "GATHER-PLANNER-RULES" );
    $list108 = ConsesLow.list( makeString( "@return lisp ;; of shop-planner-rule-p ;; the planner rules used to derive the plan." ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol(
        "PLANNER-RULES" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-ITEM" ), makeSymbol( "PRE-ORDERING" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
            "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "CUR-ITEM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLANNER-RULE" ) ) ), makeSymbol( "PLANNER-RULES" ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                makeSymbol( "PLANNER-RULES" ) ) ) );
    $sym109$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD" );
    $sym110$SHOP_BASIC_PLAN_GATHER_PLANNER_RULES_METHOD = makeSymbol( "SHOP-BASIC-PLAN-GATHER-PLANNER-RULES-METHOD" );
    $sym111$GATHER_PRECONDITIONS = makeSymbol( "GATHER-PRECONDITIONS" );
    $list112 = ConsesLow.list( makeString( "@return lisp" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PLANNER-RULES" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ),
        ConsesLow.list( makeSymbol( "CUR-ITEM" ), makeSymbol( "PRE-ORDERING" ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "CUR-ITEM" ), ConsesLow.list(
            makeSymbol( "QUOTE" ), makeSymbol( "PRECONDITION" ) ) ), makeSymbol( "PLANNER-RULES" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PLANNER-RULES" ) ) ) );
    $sym113$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD" );
    $sym114$SHOP_BASIC_PLAN_GATHER_PRECONDITIONS_METHOD = makeSymbol( "SHOP-BASIC-PLAN-GATHER-PRECONDITIONS-METHOD" );
    $sym115$SINGLE_AGENT_PLAN_ = makeSymbol( "SINGLE-AGENT-PLAN?" );
    $list116 = ConsesLow.list( makeString( "@return booleanp ;; t if the only one agent executes every step in the plan.\n   Note: for now we assume the agent is always the first argument of each action sentence." ),
        ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "FIRST-AGENT" ), ConsesLow.list( makeSymbol( "FORMULA-ARG1" ), ConsesLow.list( makeSymbol( "SUBLIS" ), makeSymbol(
            "SIMPLE-BINDING-LIST" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), ConsesLow.list( makeSymbol( "FIRST" ), makeSymbol( "PRE-ORDERING" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
                "FORMULA" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "CUR-TASK" ), ConsesLow.list( makeSymbol( "REST" ), makeSymbol( "PRE-ORDERING" ) ) ), ConsesLow.list(
                    makeSymbol( "PUNLESS" ), ConsesLow.list( EQUAL, makeSymbol( "FIRST-AGENT" ), ConsesLow.list( makeSymbol( "FORMULA-ARG1" ), ConsesLow.list( makeSymbol( "SUBLIS" ), makeSymbol( "SIMPLE-BINDING-LIST" ),
                        ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "CUR-TASK" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "FORMULA" ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ),
                            NIL ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ) );
    $sym117$OUTER_CATCH_FOR_SHOP_BASIC_PLAN_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-PLAN-METHOD" );
    $sym118$SHOP_BASIC_PLAN_SINGLE_AGENT_PLAN__METHOD = makeSymbol( "SHOP-BASIC-PLAN-SINGLE-AGENT-PLAN?-METHOD" );
    $sym119$SHOP_VARIABLEP = makeSymbol( "SHOP-VARIABLEP" );
    $list120 = ConsesLow.list( ConsesLow.list( makeSymbol( "ITEM" ), makeSymbol( "DEPTH" ), makeSymbol( "PRE" ), makeSymbol( "POST" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TEST" ), ConsesLow.list(
        makeSymbol( "FUNCTION" ), EQ ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym121$CUR_PRE = makeUninternedSymbol( "CUR-PRE" );
    $sym122$NEXT = makeUninternedSymbol( "NEXT" );
    $sym123$STACK = makeUninternedSymbol( "STACK" );
    $sym124$CLET = makeSymbol( "CLET" );
    $list125 = ConsesLow.list( NIL );
    $list126 = ConsesLow.list( ZERO_INTEGER );
    $sym127$CDO = makeSymbol( "CDO" );
    $sym128$REST = makeSymbol( "REST" );
    $sym129$NULL = makeSymbol( "NULL" );
    $sym130$FIRST = makeSymbol( "FIRST" );
    $sym131$SECOND = makeSymbol( "SECOND" );
    $sym132$WHILE = makeSymbol( "WHILE" );
    $sym133$CAND = makeSymbol( "CAND" );
    $sym134$CNOT = makeSymbol( "CNOT" );
    $sym135$PPO_TREE_DESCENDANT_ = makeSymbol( "PPO-TREE-DESCENDANT?" );
    $sym136$CDEC = makeSymbol( "CDEC" );
    $sym137$CPOP = makeSymbol( "CPOP" );
    $sym138$PWHEN = makeSymbol( "PWHEN" );
    $sym139$CINC = makeSymbol( "CINC" );
    $sym140$CPUSH = makeSymbol( "CPUSH" );
  }
}
/*
 * 
 * Total time: 749 ms
 * 
 */