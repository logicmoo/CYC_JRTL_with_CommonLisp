package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class context
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.context";
  public static final String myFingerPrint = "71ef8a70d50e9aa5da7f97d1ddfaed2a08d51faf507018293ecbf721256a31f8";
  private static final SubLSymbol $sym0$CONTEXT;
  private static final SubLSymbol $sym1$OBJECT;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$PARSE_TREE_CONTEXT;
  private static final SubLSymbol $sym4$INSTANCE_COUNT;
  private static final SubLSymbol $sym5$SUBLOOP_RESERVED_INITIALIZE_CONTEXT_CLASS;
  private static final SubLSymbol $sym6$ISOLATED_P;
  private static final SubLSymbol $sym7$INSTANCE_NUMBER;
  private static final SubLSymbol $sym8$SUBLOOP_RESERVED_INITIALIZE_CONTEXT_INSTANCE;
  private static final SubLSymbol $sym9$INITIALIZE;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$OUTER_CATCH_FOR_CONTEXT_METHOD;
  private static final SubLSymbol $sym13$CONTEXT_INITIALIZE_METHOD;
  private static final SubLSymbol $sym14$GET_PARSE_TREE_CONTEXT;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$OUTER_CATCH_FOR_CONTEXT_METHOD;
  private static final SubLSymbol $sym18$CONTEXT_GET_PARSE_TREE_CONTEXT_METHOD;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$INSTANCES;
  private static final SubLSymbol $sym21$PARSE_TREES;
  private static final SubLSymbol $sym22$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_CONTEXT_CLASS;
  private static final SubLSymbol $sym23$INSTANCE_COUNTER;
  private static final SubLSymbol $sym24$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_CONTEXT_INSTANCE;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD;
  private static final SubLInteger $int27$32;
  private static final SubLSymbol $sym28$PARSE_TREE_CONTEXT_INITIALIZE_METHOD;
  private static final SubLSymbol $sym29$ADD_TREE;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD;
  private static final SubLSymbol $sym33$PARSE_TREE_P;
  private static final SubLSymbol $sym34$PARSE_TREE_CONTEXT_ADD_TREE_METHOD;
  private static final SubLSymbol $sym35$GET_TREE;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD;
  private static final SubLSymbol $sym39$INTEGERP;
  private static final SubLSymbol $sym40$PARSE_TREE_CONTEXT_GET_TREE_METHOD;
  private static final SubLSymbol $sym41$GET_PRECEDING_TREES;
  private static final SubLList $list42;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD;
  private static final SubLSymbol $sym45$PARSE_TREE_CONTEXT_GET_PRECEDING_TREES_METHOD;
  private static final SubLSymbol $sym46$GET_FOLLOWING_TREES;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD;
  private static final SubLSymbol $sym49$PARSE_TREE_CONTEXT_GET_FOLLOWING_TREES_METHOD;
  private static final SubLSymbol $sym50$GET_INSTANCE;
  private static final SubLList $list51;
  private static final SubLList $list52;
  private static final SubLSymbol $sym53$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD;
  private static final SubLSymbol $sym54$CYCLIFIABLE_P;
  private static final SubLSymbol $sym55$GET_REFS;
  private static final SubLSymbol $sym56$CREATE_INSTANCE;
  private static final SubLSymbol $sym57$PARSE_TREE_CONTEXT_GET_INSTANCE_METHOD;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD;
  private static final SubLObject $const60$InstanceFn;
  private static final SubLSymbol $sym61$PARSE_TREE_CONTEXT_CREATE_INSTANCE_METHOD;
  private static final SubLSymbol $sym62$NEW_VARIABLE;
  private static final SubLList $list63;
  private static final SubLList $list64;
  private static final SubLString $str65$X;
  private static final SubLSymbol $sym66$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD;
  private static final SubLSymbol $sym67$PARSE_TREE_CONTEXT_NEW_VARIABLE_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1234L)
  public static SubLObject get_context_parse_tree_context(final SubLObject v_context)
  {
    return classes.subloop_get_access_protected_instance_slot( v_context, ONE_INTEGER, $sym3$PARSE_TREE_CONTEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1234L)
  public static SubLObject set_context_parse_tree_context(final SubLObject v_context, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_context, value, ONE_INTEGER, $sym3$PARSE_TREE_CONTEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1234L)
  public static SubLObject subloop_reserved_initialize_context_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym4$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1234L)
  public static SubLObject subloop_reserved_initialize_context_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$CONTEXT, $sym3$PARSE_TREE_CONTEXT, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1234L)
  public static SubLObject context_p(final SubLObject v_context)
  {
    return classes.subloop_instanceof_class( v_context, $sym0$CONTEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1475L)
  public static SubLObject context_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_context_method = NIL;
    SubLObject parse_tree_context = get_context_parse_tree_context( self );
    try
    {
      thread.throwStack.push( $sym12$OUTER_CATCH_FOR_CONTEXT_METHOD );
      try
      {
        object.object_initialize_method( self );
        parse_tree_context = object.new_class_instance( $sym3$PARSE_TREE_CONTEXT );
        Dynamic.sublisp_throw( $sym12$OUTER_CATCH_FOR_CONTEXT_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_context_parse_tree_context( self, parse_tree_context );
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
      catch_var_for_context_method = Errors.handleThrowable( ccatch_env_var, $sym12$OUTER_CATCH_FOR_CONTEXT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_context_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1680L)
  public static SubLObject context_get_parse_tree_context_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_context_method = NIL;
    final SubLObject parse_tree_context = get_context_parse_tree_context( self );
    try
    {
      thread.throwStack.push( $sym17$OUTER_CATCH_FOR_CONTEXT_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym17$OUTER_CATCH_FOR_CONTEXT_METHOD, parse_tree_context );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_context_parse_tree_context( self, parse_tree_context );
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
      catch_var_for_context_method = Errors.handleThrowable( ccatch_env_var, $sym17$OUTER_CATCH_FOR_CONTEXT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_context_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1832L)
  public static SubLObject get_parse_tree_context_instance_counter(final SubLObject parse_tree_context)
  {
    return classes.subloop_get_instance_slot( parse_tree_context, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1832L)
  public static SubLObject set_parse_tree_context_instance_counter(final SubLObject parse_tree_context, final SubLObject value)
  {
    return classes.subloop_set_instance_slot( parse_tree_context, value, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1832L)
  public static SubLObject get_parse_tree_context_instances(final SubLObject parse_tree_context)
  {
    return classes.subloop_get_access_protected_instance_slot( parse_tree_context, TWO_INTEGER, $sym20$INSTANCES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1832L)
  public static SubLObject set_parse_tree_context_instances(final SubLObject parse_tree_context, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( parse_tree_context, value, TWO_INTEGER, $sym20$INSTANCES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1832L)
  public static SubLObject get_parse_tree_context_parse_trees(final SubLObject parse_tree_context)
  {
    return classes.subloop_get_access_protected_instance_slot( parse_tree_context, ONE_INTEGER, $sym21$PARSE_TREES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1832L)
  public static SubLObject set_parse_tree_context_parse_trees(final SubLObject parse_tree_context, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( parse_tree_context, value, ONE_INTEGER, $sym21$PARSE_TREES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1832L)
  public static SubLObject subloop_reserved_initialize_parse_tree_context_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym4$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1832L)
  public static SubLObject subloop_reserved_initialize_parse_tree_context_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$PARSE_TREE_CONTEXT, $sym21$PARSE_TREES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$PARSE_TREE_CONTEXT, $sym20$INSTANCES, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$PARSE_TREE_CONTEXT, $sym23$INSTANCE_COUNTER, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1832L)
  public static SubLObject parse_tree_context_p(final SubLObject parse_tree_context)
  {
    return classes.subloop_instanceof_class( parse_tree_context, $sym3$PARSE_TREE_CONTEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2537L)
  public static SubLObject parse_tree_context_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_parse_tree_context_method = NIL;
    SubLObject v_instances = get_parse_tree_context_instances( self );
    try
    {
      thread.throwStack.push( $sym26$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD );
      try
      {
        object.object_initialize_method( self );
        v_instances = Hashtables.make_hash_table( $int27$32, EQL, UNPROVIDED );
        Dynamic.sublisp_throw( $sym26$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_context_instances( self, v_instances );
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
      catch_var_for_parse_tree_context_method = Errors.handleThrowable( ccatch_env_var, $sym26$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_parse_tree_context_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2686L)
  public static SubLObject parse_tree_context_add_tree_method(final SubLObject self, final SubLObject v_parse_tree)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_parse_tree_context_method = NIL;
    SubLObject parse_trees = get_parse_tree_context_parse_trees( self );
    try
    {
      thread.throwStack.push( $sym32$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD );
      try
      {
        assert NIL != parse_tree.parse_tree_p( v_parse_tree ) : v_parse_tree;
        if( NIL == conses_high.member( v_parse_tree, parse_trees, EQ, Symbols.symbol_function( IDENTITY ) ) )
        {
          parse_trees = ConsesLow.cons( v_parse_tree, parse_trees );
        }
        Dynamic.sublisp_throw( $sym32$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, parse_trees );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_context_parse_trees( self, parse_trees );
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
      catch_var_for_parse_tree_context_method = Errors.handleThrowable( ccatch_env_var, $sym32$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_parse_tree_context_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3018L)
  public static SubLObject parse_tree_context_get_tree_method(final SubLObject self, final SubLObject tree, final SubLObject i)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_parse_tree_context_method = NIL;
    final SubLObject parse_trees = get_parse_tree_context_parse_trees( self );
    try
    {
      thread.throwStack.push( $sym38$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD );
      try
      {
        assert NIL != parse_tree.parse_tree_p( tree ) : tree;
        assert NIL != Types.integerp( i ) : i;
        SubLObject position = Sequences.position( tree, parse_trees, EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject offset = NIL;
        if( NIL == position )
        {
          position = MINUS_ONE_INTEGER;
        }
        offset = Numbers.subtract( position, i );
        Dynamic.sublisp_throw( $sym38$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, ( NIL != subl_promotions.non_negative_integer_p( offset ) ) ? ConsesLow.nth( offset, parse_trees ) : NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_context_parse_trees( self, parse_trees );
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
      catch_var_for_parse_tree_context_method = Errors.handleThrowable( ccatch_env_var, $sym38$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_parse_tree_context_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3477L)
  public static SubLObject parse_tree_context_get_preceding_trees_method(final SubLObject self, final SubLObject tree)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_parse_tree_context_method = NIL;
    final SubLObject parse_trees = get_parse_tree_context_parse_trees( self );
    try
    {
      thread.throwStack.push( $sym44$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD );
      try
      {
        assert NIL != parse_tree.parse_tree_p( tree ) : tree;
        SubLObject position = Sequences.position( tree, parse_trees, EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL == position )
        {
          position = MINUS_ONE_INTEGER;
        }
        Dynamic.sublisp_throw( $sym44$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, Sequences.subseq( parse_trees, number_utilities.f_1X( position ), UNPROVIDED ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_context_parse_trees( self, parse_trees );
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
      catch_var_for_parse_tree_context_method = Errors.handleThrowable( ccatch_env_var, $sym44$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_parse_tree_context_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3818L)
  public static SubLObject parse_tree_context_get_following_trees_method(final SubLObject self, final SubLObject tree)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_parse_tree_context_method = NIL;
    final SubLObject parse_trees = get_parse_tree_context_parse_trees( self );
    try
    {
      thread.throwStack.push( $sym48$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD );
      try
      {
        assert NIL != parse_tree.parse_tree_p( tree ) : tree;
        final SubLObject position = Sequences.position( tree, parse_trees, EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        Dynamic.sublisp_throw( $sym48$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, ( NIL != position ) ? Sequences.nreverse( Sequences.subseq( parse_trees, ZERO_INTEGER, position ) ) : NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_context_parse_trees( self, parse_trees );
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
      catch_var_for_parse_tree_context_method = Errors.handleThrowable( ccatch_env_var, $sym48$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_parse_tree_context_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4141L)
  public static SubLObject parse_tree_context_get_instance_method(final SubLObject self, final SubLObject np)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_parse_tree_context_method = NIL;
    final SubLObject v_instances = get_parse_tree_context_instances( self );
    try
    {
      thread.throwStack.push( $sym53$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD );
      try
      {
        assert NIL != cyclifier_interface.cyclifiable_p( np ) : np;
        SubLObject instance = Hashtables.gethash( methods.funcall_instance_method_with_0_args( np, $sym55$GET_REFS ), v_instances, UNPROVIDED );
        if( NIL == instance )
        {
          instance = methods.funcall_instance_method_with_1_args( self, $sym56$CREATE_INSTANCE, np );
        }
        Dynamic.sublisp_throw( $sym53$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, instance );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_context_instances( self, v_instances );
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
      catch_var_for_parse_tree_context_method = Errors.handleThrowable( ccatch_env_var, $sym53$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_parse_tree_context_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4447L)
  public static SubLObject parse_tree_context_create_instance_method(final SubLObject self, final SubLObject np)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_parse_tree_context_method = NIL;
    final SubLObject v_instances = get_parse_tree_context_instances( self );
    try
    {
      thread.throwStack.push( $sym59$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD );
      try
      {
        final SubLObject ref = methods.funcall_instance_method_with_0_args( np, $sym55$GET_REFS ).first();
        final SubLObject instance = ConsesLow.list( $const60$InstanceFn, cycl_variables.el_var_name( ref ) );
        Hashtables.sethash( ref, v_instances, instance );
        Dynamic.sublisp_throw( $sym59$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, instance );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_context_instances( self, v_instances );
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
      catch_var_for_parse_tree_context_method = Errors.handleThrowable( ccatch_env_var, $sym59$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_parse_tree_context_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4715L)
  public static SubLObject parse_tree_context_new_variable_method(final SubLObject self, SubLObject string)
  {
    if( string == UNPROVIDED )
    {
      string = $str65$X;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_parse_tree_context_method = NIL;
    SubLObject instance_counter = get_parse_tree_context_instance_counter( self );
    try
    {
      thread.throwStack.push( $sym66$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD );
      try
      {
        instance_counter = Numbers.add( instance_counter, ONE_INTEGER );
        Dynamic.sublisp_throw( $sym66$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, cycl_variables.make_el_var( el_utilities.string_to_el_var_name( Sequences.cconcatenate( string, PrintLow.write_to_string( instance_counter,
            EMPTY_SUBL_OBJECT_ARRAY ) ) ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_parse_tree_context_instance_counter( self, instance_counter );
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
      catch_var_for_parse_tree_context_method = Errors.handleThrowable( ccatch_env_var, $sym66$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_parse_tree_context_method;
  }

  public static SubLObject declare_context_file()
  {
    SubLFiles.declareFunction( me, "get_context_parse_tree_context", "GET-CONTEXT-PARSE-TREE-CONTEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_context_parse_tree_context", "SET-CONTEXT-PARSE-TREE-CONTEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_context_class", "SUBLOOP-RESERVED-INITIALIZE-CONTEXT-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_context_instance", "SUBLOOP-RESERVED-INITIALIZE-CONTEXT-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "context_p", "CONTEXT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "context_initialize_method", "CONTEXT-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "context_get_parse_tree_context_method", "CONTEXT-GET-PARSE-TREE-CONTEXT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "get_parse_tree_context_instance_counter", "GET-PARSE-TREE-CONTEXT-INSTANCE-COUNTER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_parse_tree_context_instance_counter", "SET-PARSE-TREE-CONTEXT-INSTANCE-COUNTER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_parse_tree_context_instances", "GET-PARSE-TREE-CONTEXT-INSTANCES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_parse_tree_context_instances", "SET-PARSE-TREE-CONTEXT-INSTANCES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_parse_tree_context_parse_trees", "GET-PARSE-TREE-CONTEXT-PARSE-TREES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_parse_tree_context_parse_trees", "SET-PARSE-TREE-CONTEXT-PARSE-TREES", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_parse_tree_context_class", "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-CONTEXT-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_parse_tree_context_instance", "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-CONTEXT-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_context_p", "PARSE-TREE-CONTEXT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_context_initialize_method", "PARSE-TREE-CONTEXT-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_context_add_tree_method", "PARSE-TREE-CONTEXT-ADD-TREE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_context_get_tree_method", "PARSE-TREE-CONTEXT-GET-TREE-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_context_get_preceding_trees_method", "PARSE-TREE-CONTEXT-GET-PRECEDING-TREES-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_context_get_following_trees_method", "PARSE-TREE-CONTEXT-GET-FOLLOWING-TREES-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_context_get_instance_method", "PARSE-TREE-CONTEXT-GET-INSTANCE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_context_create_instance_method", "PARSE-TREE-CONTEXT-CREATE-INSTANCE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "parse_tree_context_new_variable_method", "PARSE-TREE-CONTEXT-NEW-VARIABLE-METHOD", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_context_file()
  {
    return NIL;
  }

  public static SubLObject setup_context_file()
  {
    classes.subloop_new_class( $sym0$CONTEXT, $sym1$OBJECT, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$CONTEXT, NIL );
    classes.subloop_note_class_initialization_function( $sym0$CONTEXT, $sym5$SUBLOOP_RESERVED_INITIALIZE_CONTEXT_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$CONTEXT, $sym8$SUBLOOP_RESERVED_INITIALIZE_CONTEXT_INSTANCE );
    subloop_reserved_initialize_context_class( $sym0$CONTEXT );
    methods.methods_incorporate_instance_method( $sym9$INITIALIZE, $sym0$CONTEXT, $list10, NIL, $list11 );
    methods.subloop_register_instance_method( $sym0$CONTEXT, $sym9$INITIALIZE, $sym13$CONTEXT_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym14$GET_PARSE_TREE_CONTEXT, $sym0$CONTEXT, $list15, NIL, $list16 );
    methods.subloop_register_instance_method( $sym0$CONTEXT, $sym14$GET_PARSE_TREE_CONTEXT, $sym18$CONTEXT_GET_PARSE_TREE_CONTEXT_METHOD );
    classes.subloop_new_class( $sym3$PARSE_TREE_CONTEXT, $sym1$OBJECT, NIL, NIL, $list19 );
    classes.class_set_implements_slot_listeners( $sym3$PARSE_TREE_CONTEXT, NIL );
    classes.subloop_note_class_initialization_function( $sym3$PARSE_TREE_CONTEXT, $sym22$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_CONTEXT_CLASS );
    classes.subloop_note_instance_initialization_function( $sym3$PARSE_TREE_CONTEXT, $sym24$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_CONTEXT_INSTANCE );
    subloop_reserved_initialize_parse_tree_context_class( $sym3$PARSE_TREE_CONTEXT );
    methods.methods_incorporate_instance_method( $sym9$INITIALIZE, $sym3$PARSE_TREE_CONTEXT, $list10, NIL, $list25 );
    methods.subloop_register_instance_method( $sym3$PARSE_TREE_CONTEXT, $sym9$INITIALIZE, $sym28$PARSE_TREE_CONTEXT_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym29$ADD_TREE, $sym3$PARSE_TREE_CONTEXT, $list15, $list30, $list31 );
    methods.subloop_register_instance_method( $sym3$PARSE_TREE_CONTEXT, $sym29$ADD_TREE, $sym34$PARSE_TREE_CONTEXT_ADD_TREE_METHOD );
    methods.methods_incorporate_instance_method( $sym35$GET_TREE, $sym3$PARSE_TREE_CONTEXT, $list15, $list36, $list37 );
    methods.subloop_register_instance_method( $sym3$PARSE_TREE_CONTEXT, $sym35$GET_TREE, $sym40$PARSE_TREE_CONTEXT_GET_TREE_METHOD );
    methods.methods_incorporate_instance_method( $sym41$GET_PRECEDING_TREES, $sym3$PARSE_TREE_CONTEXT, $list15, $list42, $list43 );
    methods.subloop_register_instance_method( $sym3$PARSE_TREE_CONTEXT, $sym41$GET_PRECEDING_TREES, $sym45$PARSE_TREE_CONTEXT_GET_PRECEDING_TREES_METHOD );
    methods.methods_incorporate_instance_method( $sym46$GET_FOLLOWING_TREES, $sym3$PARSE_TREE_CONTEXT, $list15, $list42, $list47 );
    methods.subloop_register_instance_method( $sym3$PARSE_TREE_CONTEXT, $sym46$GET_FOLLOWING_TREES, $sym49$PARSE_TREE_CONTEXT_GET_FOLLOWING_TREES_METHOD );
    methods.methods_incorporate_instance_method( $sym50$GET_INSTANCE, $sym3$PARSE_TREE_CONTEXT, $list15, $list51, $list52 );
    methods.subloop_register_instance_method( $sym3$PARSE_TREE_CONTEXT, $sym50$GET_INSTANCE, $sym57$PARSE_TREE_CONTEXT_GET_INSTANCE_METHOD );
    methods.methods_incorporate_instance_method( $sym56$CREATE_INSTANCE, $sym3$PARSE_TREE_CONTEXT, $list10, $list51, $list58 );
    methods.subloop_register_instance_method( $sym3$PARSE_TREE_CONTEXT, $sym56$CREATE_INSTANCE, $sym61$PARSE_TREE_CONTEXT_CREATE_INSTANCE_METHOD );
    methods.methods_incorporate_instance_method( $sym62$NEW_VARIABLE, $sym3$PARSE_TREE_CONTEXT, $list10, $list63, $list64 );
    methods.subloop_register_instance_method( $sym3$PARSE_TREE_CONTEXT, $sym62$NEW_VARIABLE, $sym67$PARSE_TREE_CONTEXT_NEW_VARIABLE_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_context_file();
  }

  @Override
  public void initializeVariables()
  {
    init_context_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_context_file();
  }
  static
  {
    me = new context();
    $sym0$CONTEXT = makeSymbol( "CONTEXT" );
    $sym1$OBJECT = makeSymbol( "OBJECT" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "PARSE-TREE-CONTEXT" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
        "GET-PARSE-TREE-CONTEXT" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym3$PARSE_TREE_CONTEXT = makeSymbol( "PARSE-TREE-CONTEXT" );
    $sym4$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym5$SUBLOOP_RESERVED_INITIALIZE_CONTEXT_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CONTEXT-CLASS" );
    $sym6$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym7$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym8$SUBLOOP_RESERVED_INITIALIZE_CONTEXT_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CONTEXT-INSTANCE" );
    $sym9$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list10 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list11 = ConsesLow.list( makeString( "@return context-p; a new empty context" ), ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
        "PARSE-TREE-CONTEXT" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "PARSE-TREE-CONTEXT" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
            "SELF" ) ) );
    $sym12$OUTER_CATCH_FOR_CONTEXT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CONTEXT-METHOD" );
    $sym13$CONTEXT_INITIALIZE_METHOD = makeSymbol( "CONTEXT-INITIALIZE-METHOD" );
    $sym14$GET_PARSE_TREE_CONTEXT = makeSymbol( "GET-PARSE-TREE-CONTEXT" );
    $list15 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list16 = ConsesLow.list( makeString( "@return listp; the parse-tree-context of this context" ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PARSE-TREE-CONTEXT" ) ) );
    $sym17$OUTER_CATCH_FOR_CONTEXT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CONTEXT-METHOD" );
    $sym18$CONTEXT_GET_PARSE_TREE_CONTEXT_METHOD = makeSymbol( "CONTEXT-GET-PARSE-TREE-CONTEXT-METHOD" );
    $list19 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "PARSE-TREES" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "INSTANCES" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "INSTANCE-COUNTER" ), makeKeyword( "INSTANCE" ), makeKeyword( "VALUE" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-TREE" ), ConsesLow.list( makeSymbol( "PARSE-TREE" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-TREE" ), ConsesLow.list( makeSymbol( "TREE" ), makeSymbol( "I" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
          "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-PRECEDING-TREES" ), ConsesLow.list( makeSymbol( "TREE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
              "GET-FOLLOWING-TREES" ), ConsesLow.list( makeSymbol( "TREE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "GET-INSTANCE" ), ConsesLow.list( makeSymbol(
                  "NP" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NEW-VARIABLE" ), ConsesLow.list( makeSymbol( "STRING" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow
                      .list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "CREATE-INSTANCE" ), ConsesLow.list( makeSymbol( "NP" ) ), makeKeyword( "PROTECTED" ) )
    } );
    $sym20$INSTANCES = makeSymbol( "INSTANCES" );
    $sym21$PARSE_TREES = makeSymbol( "PARSE-TREES" );
    $sym22$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_CONTEXT_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-CONTEXT-CLASS" );
    $sym23$INSTANCE_COUNTER = makeSymbol( "INSTANCE-COUNTER" );
    $sym24$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_CONTEXT_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-CONTEXT-INSTANCE" );
    $list25 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETF" ), makeSymbol( "INSTANCES" ), ConsesLow.list( makeSymbol( "MAKE-HASH-TABLE" ),
        makeInteger( 32 ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym26$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD" );
    $int27$32 = makeInteger( 32 );
    $sym28$PARSE_TREE_CONTEXT_INITIALIZE_METHOD = makeSymbol( "PARSE-TREE-CONTEXT-INITIALIZE-METHOD" );
    $sym29$ADD_TREE = makeSymbol( "ADD-TREE" );
    $list30 = ConsesLow.list( makeSymbol( "PARSE-TREE" ) );
    $list31 = ConsesLow.list( makeString( "@param PARSE-TREE parse-tree-; the parse tree to be added to this context\n   @return listp; a list of all trees of this context, from most to least recent" ), ConsesLow.list(
        makeSymbol( "CHECK-TYPE" ), makeSymbol( "PARSE-TREE" ), makeSymbol( "PARSE-TREE-P" ) ), ConsesLow.list( makeSymbol( "CPUSHNEW" ), makeSymbol( "PARSE-TREE" ), makeSymbol( "PARSE-TREES" ), ConsesLow.list(
            makeSymbol( "QUOTE" ), EQ ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PARSE-TREES" ) ) );
    $sym32$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD" );
    $sym33$PARSE_TREE_P = makeSymbol( "PARSE-TREE-P" );
    $sym34$PARSE_TREE_CONTEXT_ADD_TREE_METHOD = makeSymbol( "PARSE-TREE-CONTEXT-ADD-TREE-METHOD" );
    $sym35$GET_TREE = makeSymbol( "GET-TREE" );
    $list36 = ConsesLow.list( makeSymbol( "TREE" ), makeSymbol( "I" ) );
    $list37 = ConsesLow.list( makeString( "@return parse-tree-p; the Ith parse tree preceding (if I is negative) or succeeding\n   (if I is positive) TREE" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol(
        "TREE" ), makeSymbol( "PARSE-TREE-P" ) ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "I" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
            makeSymbol( "POSITION" ), ConsesLow.list( makeSymbol( "POSITION" ), makeSymbol( "TREE" ), makeSymbol( "PARSE-TREES" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQ ) ) ), makeSymbol( "OFFSET" ) ), ConsesLow
                .list( makeSymbol( "PUNLESS" ), makeSymbol( "POSITION" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "POSITION" ), MINUS_ONE_INTEGER ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                    "OFFSET" ), ConsesLow.list( makeSymbol( "-" ), makeSymbol( "POSITION" ), makeSymbol( "I" ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), ConsesLow.list( makeSymbol(
                        "NON-NEGATIVE-INTEGER-P" ), makeSymbol( "OFFSET" ) ), ConsesLow.list( makeSymbol( "NTH" ), makeSymbol( "OFFSET" ), makeSymbol( "PARSE-TREES" ) ) ) ) ) );
    $sym38$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD" );
    $sym39$INTEGERP = makeSymbol( "INTEGERP" );
    $sym40$PARSE_TREE_CONTEXT_GET_TREE_METHOD = makeSymbol( "PARSE-TREE-CONTEXT-GET-TREE-METHOD" );
    $sym41$GET_PRECEDING_TREES = makeSymbol( "GET-PRECEDING-TREES" );
    $list42 = ConsesLow.list( makeSymbol( "TREE" ) );
    $list43 = ConsesLow.list( makeString( "@return listp; all trees in this context preceding TREE, from most to least recent" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "TREE" ), makeSymbol(
        "PARSE-TREE-P" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "POSITION" ), ConsesLow.list( makeSymbol( "POSITION" ), makeSymbol( "TREE" ), makeSymbol( "PARSE-TREES" ),
            ConsesLow.list( makeSymbol( "QUOTE" ), EQ ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "POSITION" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "POSITION" ), MINUS_ONE_INTEGER ) ),
            ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "SUBSEQ" ), makeSymbol( "PARSE-TREES" ), ConsesLow.list( makeSymbol( "1+" ), makeSymbol( "POSITION" ) ) ) ) ) );
    $sym44$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD" );
    $sym45$PARSE_TREE_CONTEXT_GET_PRECEDING_TREES_METHOD = makeSymbol( "PARSE-TREE-CONTEXT-GET-PRECEDING-TREES-METHOD" );
    $sym46$GET_FOLLOWING_TREES = makeSymbol( "GET-FOLLOWING-TREES" );
    $list47 = ConsesLow.list( makeString( "@return listp; all trees in this context following TREE, from least to most recent" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "TREE" ), makeSymbol(
        "PARSE-TREE-P" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "POSITION" ), ConsesLow.list( makeSymbol( "POSITION" ), makeSymbol( "TREE" ), makeSymbol( "PARSE-TREES" ),
            ConsesLow.list( makeSymbol( "QUOTE" ), EQ ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FWHEN" ), makeSymbol( "POSITION" ), ConsesLow.list( makeSymbol( "NREVERSE" ), ConsesLow
                .list( makeSymbol( "SUBSEQ" ), makeSymbol( "PARSE-TREES" ), ZERO_INTEGER, makeSymbol( "POSITION" ) ) ) ) ) ) );
    $sym48$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD" );
    $sym49$PARSE_TREE_CONTEXT_GET_FOLLOWING_TREES_METHOD = makeSymbol( "PARSE-TREE-CONTEXT-GET-FOLLOWING-TREES-METHOD" );
    $sym50$GET_INSTANCE = makeSymbol( "GET-INSTANCE" );
    $list51 = ConsesLow.list( makeSymbol( "NP" ) );
    $list52 = ConsesLow.list( makeString( "@return listp; the instance denoted by NP" ), ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "NP" ), makeSymbol( "CYCLIFIABLE-P" ) ), ConsesLow.list( makeSymbol(
        "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INSTANCE" ), ConsesLow.list( makeSymbol( "GETHASH" ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NP" ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "GET-REFS" ) ) ), makeSymbol( "INSTANCES" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "INSTANCE" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INSTANCE" ), ConsesLow
                .list( makeSymbol( "FIM" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CREATE-INSTANCE" ) ), makeSymbol( "NP" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol(
                    "INSTANCE" ) ) ) );
    $sym53$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD" );
    $sym54$CYCLIFIABLE_P = makeSymbol( "CYCLIFIABLE-P" );
    $sym55$GET_REFS = makeSymbol( "GET-REFS" );
    $sym56$CREATE_INSTANCE = makeSymbol( "CREATE-INSTANCE" );
    $sym57$PARSE_TREE_CONTEXT_GET_INSTANCE_METHOD = makeSymbol( "PARSE-TREE-CONTEXT-GET-INSTANCE-METHOD" );
    $list58 = ConsesLow.list( makeString( "@return listp; a newly created instance" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "REF" ), ConsesLow.list( makeSymbol( "FIRST" ),
        ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "NP" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "GET-REFS" ) ) ) ) ), ConsesLow.list( makeSymbol( "INSTANCE" ), ConsesLow.list( makeSymbol( "BQ-LIST" ),
            constant_handles.reader_make_constant_shell( makeString( "InstanceFn" ) ), ConsesLow.list( makeSymbol( "EL-VAR-NAME" ), makeSymbol( "REF" ) ) ) ) ), ConsesLow.list( makeSymbol( "SETHASH" ), makeSymbol(
                "REF" ), makeSymbol( "INSTANCES" ), makeSymbol( "INSTANCE" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "INSTANCE" ) ) ) );
    $sym59$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD" );
    $const60$InstanceFn = constant_handles.reader_make_constant_shell( makeString( "InstanceFn" ) );
    $sym61$PARSE_TREE_CONTEXT_CREATE_INSTANCE_METHOD = makeSymbol( "PARSE-TREE-CONTEXT-CREATE-INSTANCE-METHOD" );
    $sym62$NEW_VARIABLE = makeSymbol( "NEW-VARIABLE" );
    $list63 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "STRING" ), makeString( "X" ) ) );
    $list64 = ConsesLow.list( makeString( "@return el-variable-p; a new variable unique for this context, containing STRING" ), ConsesLow.list( makeSymbol( "CINC" ), makeSymbol( "INSTANCE-COUNTER" ) ), ConsesLow.list(
        makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "MAKE-EL-VAR" ), ConsesLow.list( makeSymbol( "STRING-TO-EL-VAR-NAME" ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeSymbol( "STRING" ), ConsesLow.list(
            makeSymbol( "WRITE-TO-STRING" ), makeSymbol( "INSTANCE-COUNTER" ) ) ) ) ) ) );
    $str65$X = makeString( "X" );
    $sym66$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD" );
    $sym67$PARSE_TREE_CONTEXT_NEW_VARIABLE_METHOD = makeSymbol( "PARSE-TREE-CONTEXT-NEW-VARIABLE-METHOD" );
  }
}
/*
 * 
 * Total time: 384 ms
 * 
 */