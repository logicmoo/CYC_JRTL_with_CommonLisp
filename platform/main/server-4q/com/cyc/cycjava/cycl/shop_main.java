package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class shop_main
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.shop_main";
  public static final String myFingerPrint = "3e580fdae342dc282c9661fdbf9c0ed772d195305c2ea2aac2009e5d6ed2fcb0";
  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 1701L)
  private static SubLSymbol $new_method_pred$;
  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 1746L)
  public static SubLSymbol $shop_simple_action_definition_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 1888L)
  public static SubLSymbol $shop_complex_action_definition_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 2022L)
  public static SubLSymbol $shop_domain_definition_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 2186L)
  public static SubLSymbol $shop_domain_definition_collections$;
  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 2277L)
  private static SubLSymbol $planner_core_constants$;
  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 2875L)
  public static SubLSymbol $shop$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$VALID_CONSTANT_;
  private static final SubLSymbol $sym4$_SHOP_;
  private static final SubLSymbol $sym5$SHOP_PLANNER;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$SHOP_PLAN_DISPLAYER_FACTORY;
  private static final SubLSymbol $sym8$OBJECT;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$INSTANCE_COUNT;
  private static final SubLSymbol $sym11$SUBLOOP_RESERVED_INITIALIZE_SHOP_PLAN_DISPLAYER_FACTORY_CLASS;
  private static final SubLSymbol $sym12$ISOLATED_P;
  private static final SubLSymbol $sym13$INSTANCE_NUMBER;
  private static final SubLSymbol $sym14$SUBLOOP_RESERVED_INITIALIZE_SHOP_PLAN_DISPLAYER_FACTORY_INSTANCE;
  private static final SubLSymbol $sym15$SHOP;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$SUBLOOP_RESERVED_INITIALIZE_SHOP_CLASS;
  private static final SubLSymbol $sym19$DISPLAYER_FACTORY;
  private static final SubLSymbol $sym20$DOMAIN_TABLE;
  private static final SubLSymbol $sym21$PROBLEM_TABLE;
  private static final SubLSymbol $sym22$THREADS;
  private static final SubLSymbol $sym23$SUBLOOP_RESERVED_INITIALIZE_SHOP_INSTANCE;
  private static final SubLSymbol $sym24$INITIALIZE;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$OUTER_CATCH_FOR_SHOP_METHOD;
  private static final SubLSymbol $sym28$SHOP_INITIALIZE_METHOD;
  private static final SubLSymbol $sym29$GET_DOMAIN;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$OUTER_CATCH_FOR_SHOP_METHOD;
  private static final SubLSymbol $sym33$SHOP_GET_DOMAIN_METHOD;
  private static final SubLSymbol $sym34$GET_PROBLEM;
  private static final SubLList $list35;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$OUTER_CATCH_FOR_SHOP_METHOD;
  private static final SubLString $str38$No_planning_problem_of_the_name__;
  private static final SubLSymbol $sym39$SHOP_GET_PROBLEM_METHOD;
  private static final SubLSymbol $sym40$MAKE_NEW_THREAD;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$OUTER_CATCH_FOR_SHOP_METHOD;
  private static final SubLSymbol $sym43$SHOP_BASIC_PLANNER_THREAD;
  private static final SubLSymbol $sym44$PLANNER;
  private static final SubLSymbol $sym45$SHOP_MAKE_NEW_THREAD_METHOD;
  private static final SubLSymbol $sym46$MAKE_PROBLEM;
  private static final SubLList $list47;
  private static final SubLList $list48;
  private static final SubLSymbol $sym49$OUTER_CATCH_FOR_SHOP_METHOD;
  private static final SubLSymbol $sym50$SHOP_BASIC_PROBLEM;
  private static final SubLSymbol $sym51$SHOP_BASIC_WORLD_STATE;
  private static final SubLSymbol $sym52$MAKE_STATEBODY;
  private static final SubLSymbol $sym53$SHOP_MAKE_PROBLEM_METHOD;
  private static final SubLSymbol $sym54$CLEANUP_THREADS;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$OUTER_CATCH_FOR_SHOP_METHOD;
  private static final SubLSymbol $sym57$SHOP_CLEANUP_THREADS_METHOD;
  private static final SubLSymbol $sym58$GATHER_INITIAL_STATE;
  private static final SubLList $list59;
  private static final SubLList $list60;
  private static final SubLList $list61;
  private static final SubLSymbol $kw62$BREADTH;
  private static final SubLSymbol $kw63$QUEUE;
  private static final SubLSymbol $kw64$STACK;
  private static final SubLSymbol $sym65$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw66$ERROR;
  private static final SubLString $str67$_A_is_not_a__A;
  private static final SubLSymbol $sym68$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw69$CERROR;
  private static final SubLString $str70$continue_anyway;
  private static final SubLSymbol $kw71$WARN;
  private static final SubLString $str72$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLObject $const73$genlMt;
  private static final SubLObject $const74$PlanDynamicSituationMicrotheory;
  private static final SubLString $str75$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str76$attempting_to_bind_direction_link;
  private static final SubLString $str77$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLSymbol $sym78$ASSERTION_HL_FORMULA;
  private static final SubLSymbol $sym79$APPEND;
  private static final SubLSymbol $sym80$GATHER_MT_INDEX;
  private static final SubLSymbol $sym81$SHOP_GATHER_INITIAL_STATE_METHOD;
  private static final SubLSymbol $sym82$MAKE_PROBLEM_FROM_MT;
  private static final SubLList $list83;
  private static final SubLList $list84;
  private static final SubLString $str85$STOP;
  private static final SubLString $str86$Microtheory__s_is_empty;
  private static final SubLSymbol $sym87$SHOP_MAKE_PROBLEM_FROM_MT_METHOD;
  private static final SubLSymbol $sym88$MAKE_DOMAIN_FROM_MT;
  private static final SubLList $list89;
  private static final SubLList $list90;
  private static final SubLSymbol $sym91$OUTER_CATCH_FOR_SHOP_METHOD;
  private static final SubLSymbol $sym92$SHOP_CYC_DOMAIN;
  private static final SubLSymbol $sym93$SHOP_MAKE_DOMAIN_FROM_MT_METHOD;
  private static final SubLSymbol $sym94$HLMT_P;
  private static final SubLSymbol $sym95$DO_FI_ASKS_;
  private static final SubLSymbol $sym96$NUM_BACKCHAINS;
  private static final SubLSymbol $kw97$ALL;
  private static final SubLObject $const98$preconditionForMethod;
  private static final SubLObject $const99$methodForAction;
  private static final SubLObject $const100$preconditionFor_Props;
  private static final SubLObject $const101$effectOfAction_Props;
  private static final SubLObject $const102$sufficientFor_Props;
  private static final SubLObject $const103$effectOfActionIf_Props;
  private static final SubLSymbol $sym104$SHOP_FIND_PLANS;
  private static final SubLList $list105;
  private static final SubLString $str106$Returns_a_list_of_plan_datastruct;
  private static final SubLList $list107;
  private static final SubLSymbol $sym108$SHOP_PLAN_P;
  private static final SubLList $list109;
  private static final SubLString $str110$Returns_T_iff_OBJECT_is_a_SHOP_pl;
  private static final SubLList $list111;
  private static final SubLSymbol $sym112$PRIMITIVE_FORM;
  private static final SubLSymbol $sym113$SHOP_PLAN_SIMPLE_ACTIONS;
  private static final SubLList $list114;
  private static final SubLString $str115$Returns_list_of_simple_action_sen;
  private static final SubLList $list116;
  private static final SubLSymbol $sym117$VARIABLE_MANAGER;
  private static final SubLSymbol $sym118$GOAL_TASK;
  private static final SubLSymbol $sym119$FORMULA;
  private static final SubLSymbol $sym120$RECOVER_EL;
  private static final SubLSymbol $sym121$SHOP_PLAN_GOAL;
  private static final SubLString $str122$Returns_the_task_that_has_PLAN_as;

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 2523L)
  public static SubLObject initialize_planner_kb_feature()
  {
    if( NIL != list_utilities.every_in_list( $sym3$VALID_CONSTANT_, $planner_core_constants$.getGlobalValue(), UNPROVIDED ) )
    {
      kb_control_vars.set_planner_kb_loaded();
    }
    else
    {
      kb_control_vars.unset_planner_kb_loaded();
    }
    return kb_control_vars.planner_kb_loaded_p();
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 3084L)
  public static SubLObject shop_planner_p(final SubLObject shop_planner)
  {
    return interfaces.subloop_instanceof_interface( shop_planner, $sym5$SHOP_PLANNER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 3455L)
  public static SubLObject subloop_reserved_initialize_shop_plan_displayer_factory_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym8$OBJECT, $sym10$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 3455L)
  public static SubLObject subloop_reserved_initialize_shop_plan_displayer_factory_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym8$OBJECT, $sym12$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym8$OBJECT, $sym13$INSTANCE_NUMBER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 3455L)
  public static SubLObject shop_plan_displayer_factory_p(final SubLObject shop_plan_displayer_factory)
  {
    return classes.subloop_instanceof_class( shop_plan_displayer_factory, $sym7$SHOP_PLAN_DISPLAYER_FACTORY );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4018L)
  public static SubLObject get_shop_threads(final SubLObject shop)
  {
    return classes.subloop_get_instance_slot( shop, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4018L)
  public static SubLObject set_shop_threads(final SubLObject shop, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( shop, value, FOUR_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4018L)
  public static SubLObject get_shop_problem_table(final SubLObject shop)
  {
    return classes.subloop_get_instance_slot( shop, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4018L)
  public static SubLObject set_shop_problem_table(final SubLObject shop, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( shop, value, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4018L)
  public static SubLObject get_shop_domain_table(final SubLObject shop)
  {
    return classes.subloop_get_instance_slot( shop, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4018L)
  public static SubLObject set_shop_domain_table(final SubLObject shop, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( shop, value, TWO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4018L)
  public static SubLObject get_shop_displayer_factory(final SubLObject shop)
  {
    return classes.subloop_get_instance_slot( shop, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4018L)
  public static SubLObject set_shop_displayer_factory(final SubLObject shop, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( shop, value, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4018L)
  public static SubLObject subloop_reserved_initialize_shop_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym8$OBJECT, $sym10$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4018L)
  public static SubLObject subloop_reserved_initialize_shop_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym8$OBJECT, $sym12$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym8$OBJECT, $sym13$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$SHOP, $sym19$DISPLAYER_FACTORY, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$SHOP, $sym20$DOMAIN_TABLE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$SHOP, $sym21$PROBLEM_TABLE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym15$SHOP, $sym22$THREADS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4018L)
  public static SubLObject shop_p(final SubLObject shop)
  {
    return classes.subloop_instanceof_class( shop, $sym15$SHOP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4465L)
  public static SubLObject shop_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_method = NIL;
    SubLObject problem_table = get_shop_problem_table( self );
    SubLObject domain_table = get_shop_domain_table( self );
    SubLObject displayer_factory = get_shop_displayer_factory( self );
    try
    {
      thread.throwStack.push( $sym27$OUTER_CATCH_FOR_SHOP_METHOD );
      try
      {
        object.object_initialize_method( self );
        domain_table = Hashtables.make_hash_table( TEN_INTEGER, UNPROVIDED, UNPROVIDED );
        problem_table = Hashtables.make_hash_table( TEN_INTEGER, UNPROVIDED, UNPROVIDED );
        displayer_factory = NIL;
        Dynamic.sublisp_throw( $sym27$OUTER_CATCH_FOR_SHOP_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_problem_table( self, problem_table );
          set_shop_domain_table( self, domain_table );
          set_shop_displayer_factory( self, displayer_factory );
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
      catch_var_for_shop_method = Errors.handleThrowable( ccatch_env_var, $sym27$OUTER_CATCH_FOR_SHOP_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4689L)
  public static SubLObject shop_get_domain_method(final SubLObject self, final SubLObject domain_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_method = NIL;
    final SubLObject domain_table = get_shop_domain_table( self );
    try
    {
      thread.throwStack.push( $sym32$OUTER_CATCH_FOR_SHOP_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym32$OUTER_CATCH_FOR_SHOP_METHOD, Hashtables.gethash( domain_name, domain_table, UNPROVIDED ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_domain_table( self, domain_table );
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
      catch_var_for_shop_method = Errors.handleThrowable( ccatch_env_var, $sym32$OUTER_CATCH_FOR_SHOP_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 4811L)
  public static SubLObject shop_get_problem_method(final SubLObject self, final SubLObject problem_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_method = NIL;
    final SubLObject problem_table = get_shop_problem_table( self );
    try
    {
      thread.throwStack.push( $sym37$OUTER_CATCH_FOR_SHOP_METHOD );
      try
      {
        final SubLObject prob = Hashtables.gethash( problem_name, problem_table, UNPROVIDED );
        if( NIL == prob )
        {
          Errors.cerror( $str38$No_planning_problem_of_the_name__, problem_name );
        }
        Dynamic.sublisp_throw( $sym37$OUTER_CATCH_FOR_SHOP_METHOD, prob );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_problem_table( self, problem_table );
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
      catch_var_for_shop_method = Errors.handleThrowable( ccatch_env_var, $sym37$OUTER_CATCH_FOR_SHOP_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 5051L)
  public static SubLObject shop_make_new_thread_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_method = NIL;
    SubLObject threads = get_shop_threads( self );
    try
    {
      thread.throwStack.push( $sym42$OUTER_CATCH_FOR_SHOP_METHOD );
      try
      {
        final SubLObject new_thread = object.object_new_method( $sym43$SHOP_BASIC_PLANNER_THREAD );
        if( conses_high.list_length( threads ).numGE( TWENTY_INTEGER ) )
        {
          shop_cleanup_threads_method( self );
        }
        threads = ConsesLow.cons( new_thread, threads );
        instances.set_slot( new_thread, $sym44$PLANNER, self );
        Dynamic.sublisp_throw( $sym42$OUTER_CATCH_FOR_SHOP_METHOD, new_thread );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_threads( self, threads );
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
      catch_var_for_shop_method = Errors.handleThrowable( ccatch_env_var, $sym42$OUTER_CATCH_FOR_SHOP_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 5401L)
  public static SubLObject shop_make_problem_method(final SubLObject self, final SubLObject problem_name, final SubLObject domain_name, final SubLObject state, final SubLObject tasks, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_method = NIL;
    final SubLObject problem_table = get_shop_problem_table( self );
    try
    {
      thread.throwStack.push( $sym49$OUTER_CATCH_FOR_SHOP_METHOD );
      try
      {
        SubLObject domain = NIL;
        SubLObject new_problem = NIL;
        SubLObject new_statebody = NIL;
        new_problem = object.object_new_method( $sym50$SHOP_BASIC_PROBLEM );
        new_statebody = object.object_new_method( $sym51$SHOP_BASIC_WORLD_STATE );
        domain = shop_get_domain_method( self, domain_name );
        methods.funcall_instance_method_with_1_args( new_statebody, $sym52$MAKE_STATEBODY, state );
        shop_datastructures.shop_basic_problem_initialize_problem_method( new_problem, problem_name, domain, new_statebody, tasks, mt );
        Hashtables.sethash( problem_name, problem_table, new_problem );
        Dynamic.sublisp_throw( $sym49$OUTER_CATCH_FOR_SHOP_METHOD, new_problem );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_problem_table( self, problem_table );
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
      catch_var_for_shop_method = Errors.handleThrowable( ccatch_env_var, $sym49$OUTER_CATCH_FOR_SHOP_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 6062L)
  public static SubLObject shop_cleanup_threads_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_method = NIL;
    SubLObject threads = get_shop_threads( self );
    try
    {
      thread.throwStack.push( $sym56$OUTER_CATCH_FOR_SHOP_METHOD );
      try
      {
        threads = NIL;
        Dynamic.sublisp_throw( $sym56$OUTER_CATCH_FOR_SHOP_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_threads( self, threads );
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
      catch_var_for_shop_method = Errors.handleThrowable( ccatch_env_var, $sym56$OUTER_CATCH_FOR_SHOP_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 6263L)
  public static SubLObject shop_gather_initial_state_method(final SubLObject self, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject init_mts = NIL;
    SubLObject node_var = mt;
    final SubLObject deck_type = $kw64$STACK;
    final SubLObject recur_deck = deck.create_deck( deck_type );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$1 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym65$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw66$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str67$_A_is_not_a__A, tv_var, $sym68$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw69$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str70$continue_anyway, $str67$_A_is_not_a__A, tv_var, $sym68$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw71$WARN ) )
            {
              Errors.warn( $str67$_A_is_not_a__A, tv_var, $sym68$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str72$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str70$continue_anyway, $str67$_A_is_not_a__A, tv_var, $sym68$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
          final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
          final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const73$genlMt ), thread );
            sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const73$genlMt ) ), thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const73$genlMt ) ), thread );
            sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
            sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const73$genlMt ), thread );
            if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( mt, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
            {
              final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
              final SubLObject _prev_bind_1_$4 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
              final SubLObject _prev_bind_2_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                    $const73$genlMt ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                while ( NIL != node_var)
                {
                  final SubLObject genl_mt = node_var;
                  if( NIL == subl_promotions.memberP( genl_mt, init_mts, UNPROVIDED, UNPROVIDED ) && NIL != isa.isaP( genl_mt, $const74$PlanDynamicSituationMicrotheory, UNPROVIDED, UNPROVIDED ) )
                  {
                    init_mts = ConsesLow.cons( genl_mt, init_mts );
                  }
                  SubLObject cdolist_list_var;
                  final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const73$genlMt ) );
                  SubLObject module_var = NIL;
                  module_var = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    final SubLObject _prev_bind_0_$4 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
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
                              final SubLObject mt_$9 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                              final SubLObject tv_links = thread.secondMultipleValue();
                              thread.resetMultipleValues();
                              if( NIL != mt_relevance_macros.relevant_mtP( mt_$9 ) )
                              {
                                final SubLObject _prev_bind_0_$5 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_mt$.bind( mt_$9, thread );
                                  SubLObject iteration_state_$11;
                                  for( iteration_state_$11 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state_$11 ); iteration_state_$11 = dictionary_contents.do_dictionary_contents_next( iteration_state_$11 ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$11 );
                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                    {
                                      final SubLObject _prev_bind_0_$6 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
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
                                          Errors.error( $str75$_A_is_neither_SET_P_nor_LISTP_, sol );
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$6, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state_$11 );
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$5, thread );
                                }
                              }
                            }
                            dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                          }
                        }
                        else
                        {
                          sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str76$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                        }
                      }
                      else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                      {
                        SubLObject cdolist_list_var_$13;
                        final SubLObject new_list = cdolist_list_var_$13 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                            .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                UNPROVIDED ) ) )
                            : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                .get_sbhl_module( UNPROVIDED ) ) );
                        SubLObject generating_fn = NIL;
                        generating_fn = cdolist_list_var_$13.first();
                        while ( NIL != cdolist_list_var_$13)
                        {
                          final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
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
                              Errors.error( $str75$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                            }
                          }
                          finally
                          {
                            sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$7, thread );
                          }
                          cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                          generating_fn = cdolist_list_var_$13.first();
                        }
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$5, thread );
                      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$4, thread );
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    module_var = cdolist_list_var.first();
                  }
                  node_var = deck.deck_pop( recur_deck );
                }
              }
              finally
              {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$6, thread );
                sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$4, thread );
                sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$3, thread );
              }
            }
            else
            {
              sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str77$Node__a_does_not_pass_sbhl_type_t, mt, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                  UNPROVIDED );
            }
          }
          finally
          {
            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
            sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$3, thread );
            sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$2, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$1, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
    }
    return Mapping.mapcar( $sym78$ASSERTION_HL_FORMULA, Functions.apply( $sym79$APPEND, Mapping.mapcar( $sym80$GATHER_MT_INDEX, init_mts ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 6622L)
  public static SubLObject shop_make_problem_from_mt_method(final SubLObject self, final SubLObject domain_symbol, final SubLObject mt)
  {
    SubLObject cyc_tasks = NIL;
    final SubLObject initial_state = shop_gather_initial_state_method( self, mt );
    SubLObject new_problem = NIL;
    cyc_tasks = Mapping.mapcar( $sym78$ASSERTION_HL_FORMULA, kb_mapping.gather_mt_index( mt ) );
    if( NIL == cyc_tasks )
    {
      Errors.cerror( $str85$STOP, $str86$Microtheory__s_is_empty, mt );
      return NIL;
    }
    new_problem = shop_make_problem_method( self, mt, domain_symbol, initial_state, cyc_tasks, mt );
    return new_problem;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 7270L)
  public static SubLObject shop_make_domain_from_mt_method(final SubLObject self, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_method = NIL;
    final SubLObject domain_table = get_shop_domain_table( self );
    try
    {
      thread.throwStack.push( $sym91$OUTER_CATCH_FOR_SHOP_METHOD );
      try
      {
        final SubLObject domain = object.object_new_method( $sym92$SHOP_CYC_DOMAIN );
        shop_domain.shop_cyc_domain_process_plan_assertions_method( domain, domain_mt );
        Hashtables.sethash( domain_mt, domain_table, domain );
        Dynamic.sublisp_throw( $sym91$OUTER_CATCH_FOR_SHOP_METHOD, domain );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_domain_table( self, domain_table );
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
      catch_var_for_shop_method = Errors.handleThrowable( ccatch_env_var, $sym91$OUTER_CATCH_FOR_SHOP_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 7712L)
  public static SubLObject shop_find_plans_int(final SubLObject task, final SubLObject mt, final SubLObject verbose, final SubLObject number, final SubLObject time, final SubLObject depth, final SubLObject backchain)
  {
    if( NIL == $shop$.getGlobalValue() )
    {
      $shop$.setGlobalValue( object.object_new_method( $sym15$SHOP ) );
    }
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    final SubLObject planner_thread = shop_make_new_thread_method( $shop$.getGlobalValue() );
    if( NIL != backchain )
    {
      instances.set_slot( planner_thread, $sym95$DO_FI_ASKS_, T );
      instances.set_slot( planner_thread, $sym96$NUM_BACKCHAINS, backchain );
    }
    shop_make_domain_from_mt_method( $shop$.getGlobalValue(), mt );
    shop_basic_planner_thread.shop_basic_planner_thread_find_plans_method( planner_thread, task, mt, $kw97$ALL, verbose, number, time, depth );
    return shop_basic_planner_thread.shop_basic_planner_thread_cycl_plans_method( planner_thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 8482L)
  public static SubLObject shop_planning_assertionP(final SubLObject assertion)
  {
    if( NIL != assertions_high.gaf_assertionP( assertion ) )
    {
      return Equality.eq( assertions_high.gaf_predicate( assertion ), $const98$preconditionForMethod );
    }
    if( NIL != assertions_high.assertion_mentions_term( assertion, $const99$methodForAction ) )
    {
      return T;
    }
    if( NIL != assertions_high.assertion_mentions_term( assertion, $const100$preconditionFor_Props ) )
    {
      return T;
    }
    if( NIL != assertions_high.assertion_mentions_term( assertion, $const101$effectOfAction_Props ) )
    {
      return T;
    }
    if( NIL != assertions_high.assertion_mentions_term( assertion, $const102$sufficientFor_Props ) )
    {
      return T;
    }
    if( NIL != assertions_high.assertion_mentions_term( assertion, $const103$effectOfActionIf_Props ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 9166L)
  public static SubLObject shop_find_plans(final SubLObject task, final SubLObject mt, SubLObject verbose, SubLObject number, SubLObject time, SubLObject depth, SubLObject backchain)
  {
    if( verbose == UNPROVIDED )
    {
      verbose = ZERO_INTEGER;
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
    if( backchain == UNPROVIDED )
    {
      backchain = NIL;
    }
    return shop_find_plans_int( task, mt, verbose, number, time, depth, backchain );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 10390L)
  public static SubLObject shop_plan_p(final SubLObject v_object)
  {
    return shop_basic_plan.shop_basic_plan_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 10628L)
  public static SubLObject shop_plan_simple_actions(final SubLObject plan)
  {
    enforceType( plan, $sym108$SHOP_PLAN_P );
    assert NIL != shop_plan_p( plan ) : plan;
    return methods.funcall_instance_method_with_0_args( plan, $sym112$PRIMITIVE_FORM );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-main.lisp", position = 11040L)
  public static SubLObject shop_plan_goal(final SubLObject plan)
  {
    enforceType( plan, $sym108$SHOP_PLAN_P );
    assert NIL != shop_plan_p( plan ) : plan;
    final SubLObject var_manager = instances.get_slot( plan, $sym117$VARIABLE_MANAGER );
    final SubLObject task_struc = methods.funcall_instance_method_with_0_args( plan, $sym118$GOAL_TASK );
    final SubLObject task_pl_form = methods.funcall_instance_method_with_0_args( task_struc, $sym119$FORMULA );
    final SubLObject task_el_form = methods.funcall_instance_method_with_1_args( var_manager, $sym120$RECOVER_EL, task_pl_form );
    return task_el_form;
  }

  public static SubLObject declare_shop_main_file()
  {
    SubLFiles.declareFunction( me, "initialize_planner_kb_feature", "INITIALIZE-PLANNER-KB-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "shop_planner_p", "SHOP-PLANNER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_plan_displayer_factory_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-PLAN-DISPLAYER-FACTORY-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_plan_displayer_factory_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-PLAN-DISPLAYER-FACTORY-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_plan_displayer_factory_p", "SHOP-PLAN-DISPLAYER-FACTORY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_shop_threads", "GET-SHOP-THREADS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_threads", "SET-SHOP-THREADS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_problem_table", "GET-SHOP-PROBLEM-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_problem_table", "SET-SHOP-PROBLEM-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_domain_table", "GET-SHOP-DOMAIN-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_domain_table", "SET-SHOP-DOMAIN-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_displayer_factory", "GET-SHOP-DISPLAYER-FACTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_displayer_factory", "SET-SHOP-DISPLAYER-FACTORY", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_p", "SHOP-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_initialize_method", "SHOP-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_get_domain_method", "SHOP-GET-DOMAIN-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_get_problem_method", "SHOP-GET-PROBLEM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_make_new_thread_method", "SHOP-MAKE-NEW-THREAD-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_make_problem_method", "SHOP-MAKE-PROBLEM-METHOD", 6, 0, false );
    SubLFiles.declareFunction( me, "shop_cleanup_threads_method", "SHOP-CLEANUP-THREADS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_gather_initial_state_method", "SHOP-GATHER-INITIAL-STATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_make_problem_from_mt_method", "SHOP-MAKE-PROBLEM-FROM-MT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_make_domain_from_mt_method", "SHOP-MAKE-DOMAIN-FROM-MT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_find_plans_int", "SHOP-FIND-PLANS-INT", 7, 0, false );
    SubLFiles.declareFunction( me, "shop_planning_assertionP", "SHOP-PLANNING-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_find_plans", "SHOP-FIND-PLANS", 2, 5, false );
    SubLFiles.declareFunction( me, "shop_plan_p", "SHOP-PLAN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_plan_simple_actions", "SHOP-PLAN-SIMPLE-ACTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_plan_goal", "SHOP-PLAN-GOAL", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_shop_main_file()
  {
    $new_method_pred$ = SubLFiles.deflexical( "*NEW-METHOD-PRED*", NIL );
    $shop_simple_action_definition_predicates$ = SubLFiles.deflexical( "*SHOP-SIMPLE-ACTION-DEFINITION-PREDICATES*", $list0 );
    $shop_complex_action_definition_predicates$ = SubLFiles.deflexical( "*SHOP-COMPLEX-ACTION-DEFINITION-PREDICATES*", $list1 );
    $shop_domain_definition_predicates$ = SubLFiles.deflexical( "*SHOP-DOMAIN-DEFINITION-PREDICATES*", conses_high.union( $shop_simple_action_definition_predicates$.getGlobalValue(),
        $shop_complex_action_definition_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
    $shop_domain_definition_collections$ = SubLFiles.deflexical( "*SHOP-DOMAIN-DEFINITION-COLLECTIONS*", $list2 );
    $planner_core_constants$ = SubLFiles.deflexical( "*PLANNER-CORE-CONSTANTS*", ConsesLow.append( $shop_domain_definition_predicates$.getGlobalValue(), $shop_domain_definition_collections$.getGlobalValue() ) );
    $shop$ = SubLFiles.deflexical( "*SHOP*", ( maybeDefault( $sym4$_SHOP_, $shop$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_shop_main_file()
  {
    subl_macro_promotions.declare_defglobal( $sym4$_SHOP_ );
    interfaces.new_interface( $sym5$SHOP_PLANNER, NIL, NIL, $list6 );
    classes.subloop_new_class( $sym7$SHOP_PLAN_DISPLAYER_FACTORY, $sym8$OBJECT, NIL, NIL, $list9 );
    classes.class_set_implements_slot_listeners( $sym7$SHOP_PLAN_DISPLAYER_FACTORY, NIL );
    classes.subloop_note_class_initialization_function( $sym7$SHOP_PLAN_DISPLAYER_FACTORY, $sym11$SUBLOOP_RESERVED_INITIALIZE_SHOP_PLAN_DISPLAYER_FACTORY_CLASS );
    classes.subloop_note_instance_initialization_function( $sym7$SHOP_PLAN_DISPLAYER_FACTORY, $sym14$SUBLOOP_RESERVED_INITIALIZE_SHOP_PLAN_DISPLAYER_FACTORY_INSTANCE );
    subloop_reserved_initialize_shop_plan_displayer_factory_class( $sym7$SHOP_PLAN_DISPLAYER_FACTORY );
    classes.subloop_new_class( $sym15$SHOP, $sym8$OBJECT, $list16, NIL, $list17 );
    classes.class_set_implements_slot_listeners( $sym15$SHOP, NIL );
    classes.subloop_note_class_initialization_function( $sym15$SHOP, $sym18$SUBLOOP_RESERVED_INITIALIZE_SHOP_CLASS );
    classes.subloop_note_instance_initialization_function( $sym15$SHOP, $sym23$SUBLOOP_RESERVED_INITIALIZE_SHOP_INSTANCE );
    subloop_reserved_initialize_shop_class( $sym15$SHOP );
    methods.methods_incorporate_instance_method( $sym24$INITIALIZE, $sym15$SHOP, $list25, NIL, $list26 );
    methods.subloop_register_instance_method( $sym15$SHOP, $sym24$INITIALIZE, $sym28$SHOP_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym29$GET_DOMAIN, $sym15$SHOP, $list25, $list30, $list31 );
    methods.subloop_register_instance_method( $sym15$SHOP, $sym29$GET_DOMAIN, $sym33$SHOP_GET_DOMAIN_METHOD );
    methods.methods_incorporate_instance_method( $sym34$GET_PROBLEM, $sym15$SHOP, $list25, $list35, $list36 );
    methods.subloop_register_instance_method( $sym15$SHOP, $sym34$GET_PROBLEM, $sym39$SHOP_GET_PROBLEM_METHOD );
    methods.methods_incorporate_instance_method( $sym40$MAKE_NEW_THREAD, $sym15$SHOP, $list25, NIL, $list41 );
    methods.subloop_register_instance_method( $sym15$SHOP, $sym40$MAKE_NEW_THREAD, $sym45$SHOP_MAKE_NEW_THREAD_METHOD );
    methods.methods_incorporate_instance_method( $sym46$MAKE_PROBLEM, $sym15$SHOP, $list25, $list47, $list48 );
    methods.subloop_register_instance_method( $sym15$SHOP, $sym46$MAKE_PROBLEM, $sym53$SHOP_MAKE_PROBLEM_METHOD );
    methods.methods_incorporate_instance_method( $sym54$CLEANUP_THREADS, $sym15$SHOP, $list25, NIL, $list55 );
    methods.subloop_register_instance_method( $sym15$SHOP, $sym54$CLEANUP_THREADS, $sym57$SHOP_CLEANUP_THREADS_METHOD );
    methods.methods_incorporate_instance_method( $sym58$GATHER_INITIAL_STATE, $sym15$SHOP, $list59, $list60, $list61 );
    methods.subloop_register_instance_method( $sym15$SHOP, $sym58$GATHER_INITIAL_STATE, $sym81$SHOP_GATHER_INITIAL_STATE_METHOD );
    methods.methods_incorporate_instance_method( $sym82$MAKE_PROBLEM_FROM_MT, $sym15$SHOP, $list25, $list83, $list84 );
    methods.subloop_register_instance_method( $sym15$SHOP, $sym82$MAKE_PROBLEM_FROM_MT, $sym87$SHOP_MAKE_PROBLEM_FROM_MT_METHOD );
    methods.methods_incorporate_instance_method( $sym88$MAKE_DOMAIN_FROM_MT, $sym15$SHOP, $list25, $list89, $list90 );
    methods.subloop_register_instance_method( $sym15$SHOP, $sym88$MAKE_DOMAIN_FROM_MT, $sym93$SHOP_MAKE_DOMAIN_FROM_MT_METHOD );
    utilities_macros.register_cyc_api_function( $sym104$SHOP_FIND_PLANS, $list105, $str106$Returns_a_list_of_plan_datastruct, NIL, $list107 );
    utilities_macros.register_cyc_api_function( $sym108$SHOP_PLAN_P, $list109, $str110$Returns_T_iff_OBJECT_is_a_SHOP_pl, NIL, $list111 );
    utilities_macros.register_cyc_api_function( $sym113$SHOP_PLAN_SIMPLE_ACTIONS, $list114, $str115$Returns_list_of_simple_action_sen, $list116, $list107 );
    utilities_macros.register_cyc_api_function( $sym121$SHOP_PLAN_GOAL, $list114, $str122$Returns_the_task_that_has_PLAN_as, $list116, $list107 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_shop_main_file();
  }

  @Override
  public void initializeVariables()
  {
    init_shop_main_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_shop_main_file();
  }
  static
  {
    me = new shop_main();
    $new_method_pred$ = null;
    $shop_simple_action_definition_predicates$ = null;
    $shop_complex_action_definition_predicates$ = null;
    $shop_domain_definition_predicates$ = null;
    $shop_domain_definition_collections$ = null;
    $planner_core_constants$ = null;
    $shop$ = null;
    $list0 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "preconditionFor-Props" ) ), constant_handles.reader_make_constant_shell( makeString( "effectOfAction-Props" ) ), constant_handles
        .reader_make_constant_shell( makeString( "effectOfActionIf-Props" ) ) );
    $list1 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "methodForAction" ) ), constant_handles.reader_make_constant_shell( makeString( "sufficientFor-Props" ) ), constant_handles
        .reader_make_constant_shell( makeString( "preconditionForMethod" ) ) );
    $list2 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SimpleSituationPredicate" ) ) );
    $sym3$VALID_CONSTANT_ = makeSymbol( "VALID-CONSTANT?" );
    $sym4$_SHOP_ = makeSymbol( "*SHOP*" );
    $sym5$SHOP_PLANNER = makeSymbol( "SHOP-PLANNER" );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "MAKE-NEW-THREAD" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "MAKE-PROBLEM-FROM-MT" ), ConsesLow.list( makeSymbol( "DOMAIN" ), makeSymbol( "MT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "MAKE-DOMAIN-FROM-MT" ),
            ConsesLow.list( makeSymbol( "MT" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PROBLEM" ), ConsesLow.list( makeSymbol( "NAME" ) ), makeKeyword(
                "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-DOMAIN" ), ConsesLow.list( makeSymbol( "NAME" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym7$SHOP_PLAN_DISPLAYER_FACTORY = makeSymbol( "SHOP-PLAN-DISPLAYER-FACTORY" );
    $sym8$OBJECT = makeSymbol( "OBJECT" );
    $list9 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-CLASS-METHOD" ), makeSymbol( "CREATE-PLAN-DISPLAYER" ), ConsesLow.list( makeSymbol( "PLAN" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
        "DEF-CLASS-METHOD" ), makeSymbol( "CREATE-TASK-DISPLAYER" ), ConsesLow.list( makeSymbol( "TASK" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym10$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym11$SUBLOOP_RESERVED_INITIALIZE_SHOP_PLAN_DISPLAYER_FACTORY_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-PLAN-DISPLAYER-FACTORY-CLASS" );
    $sym12$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym13$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym14$SUBLOOP_RESERVED_INITIALIZE_SHOP_PLAN_DISPLAYER_FACTORY_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-PLAN-DISPLAYER-FACTORY-INSTANCE" );
    $sym15$SHOP = makeSymbol( "SHOP" );
    $list16 = ConsesLow.list( makeSymbol( "SHOP-PLANNER" ) );
    $list17 = ConsesLow.list( ConsesLow.list( makeSymbol( "DISPLAYER-FACTORY" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DOMAIN-TABLE" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PUBLIC" ) ), ConsesLow.list( makeSymbol( "PROBLEM-TABLE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "THREADS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PUBLIC" ) ),
        ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CLEANUP-THREADS" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GATHER-INITIAL-STATE" ),
            ConsesLow.list( makeSymbol( "MT" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym18$SUBLOOP_RESERVED_INITIALIZE_SHOP_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-CLASS" );
    $sym19$DISPLAYER_FACTORY = makeSymbol( "DISPLAYER-FACTORY" );
    $sym20$DOMAIN_TABLE = makeSymbol( "DOMAIN-TABLE" );
    $sym21$PROBLEM_TABLE = makeSymbol( "PROBLEM-TABLE" );
    $sym22$THREADS = makeSymbol( "THREADS" );
    $sym23$SUBLOOP_RESERVED_INITIALIZE_SHOP_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-INSTANCE" );
    $sym24$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list25 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list26 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DOMAIN-TABLE" ), ConsesLow.list( makeSymbol( "MAKE-HASH-TABLE" ),
        TEN_INTEGER ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PROBLEM-TABLE" ), ConsesLow.list( makeSymbol( "MAKE-HASH-TABLE" ), TEN_INTEGER ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
            "DISPLAYER-FACTORY" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym27$OUTER_CATCH_FOR_SHOP_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-METHOD" );
    $sym28$SHOP_INITIALIZE_METHOD = makeSymbol( "SHOP-INITIALIZE-METHOD" );
    $sym29$GET_DOMAIN = makeSymbol( "GET-DOMAIN" );
    $list30 = ConsesLow.list( makeSymbol( "DOMAIN-NAME" ) );
    $list31 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "GETHASH" ), makeSymbol( "DOMAIN-NAME" ), makeSymbol( "DOMAIN-TABLE" ) ) ) );
    $sym32$OUTER_CATCH_FOR_SHOP_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-METHOD" );
    $sym33$SHOP_GET_DOMAIN_METHOD = makeSymbol( "SHOP-GET-DOMAIN-METHOD" );
    $sym34$GET_PROBLEM = makeSymbol( "GET-PROBLEM" );
    $list35 = ConsesLow.list( makeSymbol( "PROBLEM-NAME" ) );
    $list36 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PROB" ), ConsesLow.list( makeSymbol( "GETHASH" ), makeSymbol( "PROBLEM-NAME" ), makeSymbol(
        "PROBLEM-TABLE" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "NULL" ), makeSymbol( "PROB" ) ), ConsesLow.list( makeSymbol( "CERROR" ), makeString(
            "No planning problem of the name ~s" ), makeSymbol( "PROBLEM-NAME" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PROB" ) ) ) );
    $sym37$OUTER_CATCH_FOR_SHOP_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-METHOD" );
    $str38$No_planning_problem_of_the_name__ = makeString( "No planning problem of the name ~s" );
    $sym39$SHOP_GET_PROBLEM_METHOD = makeSymbol( "SHOP-GET-PROBLEM-METHOD" );
    $sym40$MAKE_NEW_THREAD = makeSymbol( "MAKE-NEW-THREAD" );
    $list41 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-THREAD" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ),
        makeSymbol( "SHOP-BASIC-PLANNER-THREAD" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SHOP-BASIC-PLANNER-THREAD" ) ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( ">=" ),
            ConsesLow.list( makeSymbol( "LIST-LENGTH" ), makeSymbol( "THREADS" ) ), TWENTY_INTEGER ), ConsesLow.list( makeSymbol( "CLEANUP-THREADS" ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ),
                makeSymbol( "NEW-THREAD" ), makeSymbol( "THREADS" ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "NEW-THREAD" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PLANNER" ) ), makeSymbol(
                    "SELF" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-THREAD" ) ) ) );
    $sym42$OUTER_CATCH_FOR_SHOP_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-METHOD" );
    $sym43$SHOP_BASIC_PLANNER_THREAD = makeSymbol( "SHOP-BASIC-PLANNER-THREAD" );
    $sym44$PLANNER = makeSymbol( "PLANNER" );
    $sym45$SHOP_MAKE_NEW_THREAD_METHOD = makeSymbol( "SHOP-MAKE-NEW-THREAD-METHOD" );
    $sym46$MAKE_PROBLEM = makeSymbol( "MAKE-PROBLEM" );
    $list47 = ConsesLow.list( makeSymbol( "PROBLEM-NAME" ), makeSymbol( "DOMAIN-NAME" ), makeSymbol( "STATE" ), makeSymbol( "TASKS" ), makeSymbol( "MT" ) );
    $list48 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "CLET" ), ConsesLow.list( makeSymbol( "DOMAIN" ), makeSymbol( "NEW-PROBLEM" ), makeSymbol( "NEW-STATEBODY" ) ), ConsesLow.list( makeSymbol(
        "CSETQ" ), makeSymbol( "NEW-PROBLEM" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ), makeSymbol( "SHOP-BASIC-PROBLEM" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "SHOP-BASIC-PROBLEM" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEW-STATEBODY" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ), makeSymbol(
                "SHOP-BASIC-WORLD-STATE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SHOP-BASIC-WORLD-STATE" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DOMAIN" ), ConsesLow.list(
                    makeSymbol( "GET-DOMAIN" ), makeSymbol( "SELF" ), makeSymbol( "DOMAIN-NAME" ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "MAKE-STATEBODY" ), makeSymbol(
                        "SHOP-BASIC-WORLD-STATE" ) ), makeSymbol( "NEW-STATEBODY" ), makeSymbol( "STATE" ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "INITIALIZE-PROBLEM" ), makeSymbol(
                            "SHOP-BASIC-PROBLEM" ) ), makeSymbol( "NEW-PROBLEM" ), makeSymbol( "PROBLEM-NAME" ), makeSymbol( "DOMAIN" ), makeSymbol( "NEW-STATEBODY" ), makeSymbol( "TASKS" ), makeSymbol( "MT" ) ),
      ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "GETHASH" ), makeSymbol( "PROBLEM-NAME" ), makeSymbol( "PROBLEM-TABLE" ) ), makeSymbol( "NEW-PROBLEM" ) ), ConsesLow.list( makeSymbol( "RET" ),
          makeSymbol( "NEW-PROBLEM" ) )
    } ) );
    $sym49$OUTER_CATCH_FOR_SHOP_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-METHOD" );
    $sym50$SHOP_BASIC_PROBLEM = makeSymbol( "SHOP-BASIC-PROBLEM" );
    $sym51$SHOP_BASIC_WORLD_STATE = makeSymbol( "SHOP-BASIC-WORLD-STATE" );
    $sym52$MAKE_STATEBODY = makeSymbol( "MAKE-STATEBODY" );
    $sym53$SHOP_MAKE_PROBLEM_METHOD = makeSymbol( "SHOP-MAKE-PROBLEM-METHOD" );
    $sym54$CLEANUP_THREADS = makeSymbol( "CLEANUP-THREADS" );
    $list55 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "THREADS" ), NIL ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym56$OUTER_CATCH_FOR_SHOP_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-METHOD" );
    $sym57$SHOP_CLEANUP_THREADS_METHOD = makeSymbol( "SHOP-CLEANUP-THREADS-METHOD" );
    $sym58$GATHER_INITIAL_STATE = makeSymbol( "GATHER-INITIAL-STATE" );
    $list59 = ConsesLow.list( makeKeyword( "PRIVATE" ) );
    $list60 = ConsesLow.list( makeSymbol( "MT" ) );
    $list61 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INIT-MTS" ), NIL ) ), ConsesLow.list( makeSymbol( "DO-ALL-GENL-MTS" ), ConsesLow.list( makeSymbol(
        "GENL-MT" ), makeSymbol( "MT" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "MEMBER?" ), makeSymbol(
            "GENL-MT" ), makeSymbol( "INIT-MTS" ) ) ), ConsesLow.list( makeSymbol( "ISA?" ), makeSymbol( "GENL-MT" ), constant_handles.reader_make_constant_shell( makeString( "PlanDynamicSituationMicrotheory" ) ) ) ),
            ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "GENL-MT" ), makeSymbol( "INIT-MTS" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list( makeSymbol(
                "QUOTE" ), makeSymbol( "ASSERTION-HL-FORMULA" ) ), ConsesLow.list( makeSymbol( "APPLY" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "APPEND" ) ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow
                    .list( makeSymbol( "QUOTE" ), makeSymbol( "GATHER-MT-INDEX" ) ), makeSymbol( "INIT-MTS" ) ) ) ) ) ) );
    $kw62$BREADTH = makeKeyword( "BREADTH" );
    $kw63$QUEUE = makeKeyword( "QUEUE" );
    $kw64$STACK = makeKeyword( "STACK" );
    $sym65$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw66$ERROR = makeKeyword( "ERROR" );
    $str67$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym68$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw69$CERROR = makeKeyword( "CERROR" );
    $str70$continue_anyway = makeString( "continue anyway" );
    $kw71$WARN = makeKeyword( "WARN" );
    $str72$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const73$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $const74$PlanDynamicSituationMicrotheory = constant_handles.reader_make_constant_shell( makeString( "PlanDynamicSituationMicrotheory" ) );
    $str75$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str76$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str77$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $sym78$ASSERTION_HL_FORMULA = makeSymbol( "ASSERTION-HL-FORMULA" );
    $sym79$APPEND = makeSymbol( "APPEND" );
    $sym80$GATHER_MT_INDEX = makeSymbol( "GATHER-MT-INDEX" );
    $sym81$SHOP_GATHER_INITIAL_STATE_METHOD = makeSymbol( "SHOP-GATHER-INITIAL-STATE-METHOD" );
    $sym82$MAKE_PROBLEM_FROM_MT = makeSymbol( "MAKE-PROBLEM-FROM-MT" );
    $list83 = ConsesLow.list( makeSymbol( "DOMAIN-SYMBOL" ), makeSymbol( "MT" ) );
    $list84 = ConsesLow.list( makeString( "Creates a planning problem object for the planner from \n   the information in PROBLEM-MT, that has planning domain \n   DOMAIN-NAME." ), ConsesLow.list( makeSymbol( "CLET" ),
        ConsesLow.list( makeSymbol( "CYC-TASKS" ), ConsesLow.list( makeSymbol( "PROBLEM-NAME" ), makeSymbol( "MT" ) ), ConsesLow.list( makeSymbol( "INITIAL-STATE" ), ConsesLow.list( makeSymbol( "GATHER-INITIAL-STATE" ),
            makeSymbol( "SELF" ), makeSymbol( "MT" ) ) ), makeSymbol( "NEW-PROBLEM" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "CYC-TASKS" ), ConsesLow.list( makeSymbol( "MAPCAR" ), ConsesLow.list(
                makeSymbol( "QUOTE" ), makeSymbol( "ASSERTION-HL-FORMULA" ) ), ConsesLow.list( makeSymbol( "GATHER-MT-INDEX" ), makeSymbol( "MT" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol(
                    "CYC-TASKS" ), ConsesLow.list( makeSymbol( "CERROR" ), makeString( "STOP" ), makeString( "Microtheory ~s is empty" ), makeSymbol( "MT" ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ), ConsesLow
                        .list( makeSymbol( "CSETQ" ), makeSymbol( "NEW-PROBLEM" ), ConsesLow.list( makeSymbol( "MAKE-PROBLEM" ), makeSymbol( "SELF" ), makeSymbol( "PROBLEM-NAME" ), makeSymbol( "DOMAIN-SYMBOL" ),
                            makeSymbol( "INITIAL-STATE" ), makeSymbol( "CYC-TASKS" ), makeSymbol( "MT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-PROBLEM" ) ) ) );
    $str85$STOP = makeString( "STOP" );
    $str86$Microtheory__s_is_empty = makeString( "Microtheory ~s is empty" );
    $sym87$SHOP_MAKE_PROBLEM_FROM_MT_METHOD = makeSymbol( "SHOP-MAKE-PROBLEM-FROM-MT-METHOD" );
    $sym88$MAKE_DOMAIN_FROM_MT = makeSymbol( "MAKE-DOMAIN-FROM-MT" );
    $list89 = ConsesLow.list( makeSymbol( "DOMAIN-MT" ) );
    $list90 = ConsesLow.list( makeString( "Creates a planning domain structure for the planner from \n   the information in DOMAIN-MT.\n   @param DOMAIN-MT hlmt-p\n   @return shop-domain-p" ), ConsesLow.list( makeSymbol(
        "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DOMAIN" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ), makeSymbol( "SHOP-CYC-DOMAIN" ) ), ConsesLow.list( makeSymbol(
            "QUOTE" ), makeSymbol( "SHOP-CYC-DOMAIN" ) ) ) ) ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "PROCESS-PLAN-ASSERTIONS" ), makeSymbol( "SHOP-CYC-DOMAIN" ) ), makeSymbol(
                "DOMAIN" ), makeSymbol( "DOMAIN-MT" ) ), ConsesLow.list( makeSymbol( "CSETF" ), ConsesLow.list( makeSymbol( "GETHASH" ), makeSymbol( "DOMAIN-MT" ), makeSymbol( "DOMAIN-TABLE" ) ), makeSymbol(
                    "DOMAIN" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "DOMAIN" ) ) ) );
    $sym91$OUTER_CATCH_FOR_SHOP_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-METHOD" );
    $sym92$SHOP_CYC_DOMAIN = makeSymbol( "SHOP-CYC-DOMAIN" );
    $sym93$SHOP_MAKE_DOMAIN_FROM_MT_METHOD = makeSymbol( "SHOP-MAKE-DOMAIN-FROM-MT-METHOD" );
    $sym94$HLMT_P = makeSymbol( "HLMT-P" );
    $sym95$DO_FI_ASKS_ = makeSymbol( "DO-FI-ASKS?" );
    $sym96$NUM_BACKCHAINS = makeSymbol( "NUM-BACKCHAINS" );
    $kw97$ALL = makeKeyword( "ALL" );
    $const98$preconditionForMethod = constant_handles.reader_make_constant_shell( makeString( "preconditionForMethod" ) );
    $const99$methodForAction = constant_handles.reader_make_constant_shell( makeString( "methodForAction" ) );
    $const100$preconditionFor_Props = constant_handles.reader_make_constant_shell( makeString( "preconditionFor-Props" ) );
    $const101$effectOfAction_Props = constant_handles.reader_make_constant_shell( makeString( "effectOfAction-Props" ) );
    $const102$sufficientFor_Props = constant_handles.reader_make_constant_shell( makeString( "sufficientFor-Props" ) );
    $const103$effectOfActionIf_Props = constant_handles.reader_make_constant_shell( makeString( "effectOfActionIf-Props" ) );
    $sym104$SHOP_FIND_PLANS = makeSymbol( "SHOP-FIND-PLANS" );
    $list105 = ConsesLow.list( makeSymbol( "TASK" ), makeSymbol( "MT" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "VERBOSE" ), ZERO_INTEGER ), makeSymbol( "NUMBER" ), makeSymbol( "TIME" ), makeSymbol(
        "DEPTH" ), makeSymbol( "BACKCHAIN" ) );
    $str106$Returns_a_list_of_plan_datastruct = makeString(
        "Returns a list of plan datastructures for TASK in the context of MT.\n   TASK is a formula with an instance of #$ActionPredicate as its first argument. \n   MT is a microtheory.\n   VERBOSE is an integer between 0 and 9, that controls how much logging information\n   shop should send to standard output.\n   NUMBER is the maximum number of plans to return.\n   TIME is the maximum amount of time allocated to the planner.\n   DEPTH is the maximum depth the planner can reach searching for plans.\n   BACKCHAIN is the maximum number of backchains allowed when querying the KB when matching\n   rule conditions." );
    $list107 = ConsesLow.list( makeSymbol( "LISTP" ) );
    $sym108$SHOP_PLAN_P = makeSymbol( "SHOP-PLAN-P" );
    $list109 = ConsesLow.list( makeSymbol( "OBJECT" ) );
    $str110$Returns_T_iff_OBJECT_is_a_SHOP_pl = makeString( "Returns T iff OBJECT is a SHOP plan datastructure." );
    $list111 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $sym112$PRIMITIVE_FORM = makeSymbol( "PRIMITIVE-FORM" );
    $sym113$SHOP_PLAN_SIMPLE_ACTIONS = makeSymbol( "SHOP-PLAN-SIMPLE-ACTIONS" );
    $list114 = ConsesLow.list( makeSymbol( "PLAN" ) );
    $str115$Returns_list_of_simple_action_sen = makeString(
        "Returns list of simple action sentences for PLAN.\n   A return value of NIL means that PLAN is trivial\n   (i.e. the original task for the plan is already achieved." );
    $list116 = ConsesLow.list( ConsesLow.list( makeSymbol( "PLAN" ), makeSymbol( "SHOP-PLAN-P" ) ) );
    $sym117$VARIABLE_MANAGER = makeSymbol( "VARIABLE-MANAGER" );
    $sym118$GOAL_TASK = makeSymbol( "GOAL-TASK" );
    $sym119$FORMULA = makeSymbol( "FORMULA" );
    $sym120$RECOVER_EL = makeSymbol( "RECOVER-EL" );
    $sym121$SHOP_PLAN_GOAL = makeSymbol( "SHOP-PLAN-GOAL" );
    $str122$Returns_the_task_that_has_PLAN_as = makeString( "Returns the task that has PLAN as a solution." );
  }
}
/*
 * 
 * Total time: 582 ms
 * 
 */