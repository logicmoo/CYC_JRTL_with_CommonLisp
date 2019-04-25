package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class shop_mt_world_state
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.shop_mt_world_state";
  public static final String myFingerPrint = "16a63f1cb90db97b51a1f3127c0c67f259c9d352e831d5eab8d3e050c7335cbc";
  @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 2150L)
  private static SubLSymbol $shop_hyp_mt_prefix$;
  private static final SubLSymbol $sym0$SHOP_MT_WORLD_STATE;
  private static final SubLSymbol $sym1$OBJECT;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$DELETES;
  private static final SubLSymbol $sym5$MT;
  private static final SubLSymbol $sym6$INSTANCE_COUNT;
  private static final SubLSymbol $sym7$SUBLOOP_RESERVED_INITIALIZE_SHOP_MT_WORLD_STATE_CLASS;
  private static final SubLSymbol $sym8$ISOLATED_P;
  private static final SubLSymbol $sym9$INSTANCE_NUMBER;
  private static final SubLSymbol $sym10$SUBLOOP_RESERVED_INITIALIZE_SHOP_MT_WORLD_STATE_INSTANCE;
  private static final SubLString $str11$SHOP_WS;
  private static final SubLSymbol $sym12$INITIALIZE;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD;
  private static final SubLSymbol $sym16$SHOP_MT_WORLD_STATE_INITIALIZE_METHOD;
  private static final SubLSymbol $sym17$COPY_STATE;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD;
  private static final SubLSymbol $sym20$SHOP_MT_WORLD_STATE_COPY_STATE_METHOD;
  private static final SubLSymbol $sym21$NEXT_STATE;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD;
  private static final SubLSymbol $sym24$SHOP_MT_WORLD_STATE_NEXT_STATE_METHOD;
  private static final SubLSymbol $sym25$ADD_ATOM;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$SHOP_MT_WORLD_STATE_ADD_ATOM_METHOD;
  private static final SubLSymbol $sym31$DELETE_ATOM;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD;
  private static final SubLObject $const34$not;
  private static final SubLSymbol $sym35$SHOP_MT_WORLD_STATE_DELETE_ATOM_METHOD;
  private static final SubLSymbol $sym36$ADD_LITERALS;
  private static final SubLList $list37;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$SHOP_MT_WORLD_STATE_ADD_LITERALS_METHOD;
  private static final SubLSymbol $sym40$DELETE_LITERALS;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$SHOP_MT_WORLD_STATE_DELETE_LITERALS_METHOD;
  private static final SubLSymbol $sym43$ADD_LITERAL;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$SHOP_MT_WORLD_STATE_ADD_LITERAL_METHOD;
  private static final SubLSymbol $sym46$DELETE_LITERAL;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$SHOP_MT_WORLD_STATE_DELETE_LITERAL_METHOD;
  private static final SubLSymbol $sym49$SAME_STATE_P;
  private static final SubLList $list50;
  private static final SubLList $list51;
  private static final SubLSymbol $sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD;
  private static final SubLSymbol $sym53$SHOP_MT_WORLD_STATE_SAME_STATE_P_METHOD;
  private static final SubLSymbol $sym54$FILTER_DELETED_BINDINGS;
  private static final SubLList $list55;
  private static final SubLList $list56;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD;
  private static final SubLSymbol $sym59$SHOP_MT_WORLD_STATE_FILTER_DELETED_BINDINGS_METHOD;
  private static final SubLSymbol $sym60$ASK;
  private static final SubLList $list61;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD;
  private static final SubLSymbol $sym64$INFERENCE_RETURN_BLISTS_AND_SUPPORTS;
  private static final SubLSymbol $sym65$INFERENCE_RETURN_BLISTS;
  private static final SubLSymbol $sym66$SHOP_MT_WORLD_STATE_ASK_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 1889L)
  public static SubLObject get_shop_mt_world_state_deletes(final SubLObject v_shop_mt_world_state)
  {
    return classes.subloop_get_access_protected_instance_slot( v_shop_mt_world_state, TWO_INTEGER, $sym4$DELETES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 1889L)
  public static SubLObject set_shop_mt_world_state_deletes(final SubLObject v_shop_mt_world_state, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_shop_mt_world_state, value, TWO_INTEGER, $sym4$DELETES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 1889L)
  public static SubLObject get_shop_mt_world_state_mt(final SubLObject v_shop_mt_world_state)
  {
    return classes.subloop_get_access_protected_instance_slot( v_shop_mt_world_state, ONE_INTEGER, $sym5$MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 1889L)
  public static SubLObject set_shop_mt_world_state_mt(final SubLObject v_shop_mt_world_state, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_shop_mt_world_state, value, ONE_INTEGER, $sym5$MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 1889L)
  public static SubLObject subloop_reserved_initialize_shop_mt_world_state_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym6$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 1889L)
  public static SubLObject subloop_reserved_initialize_shop_mt_world_state_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym8$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SHOP_MT_WORLD_STATE, $sym5$MT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$SHOP_MT_WORLD_STATE, $sym4$DELETES, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 1889L)
  public static SubLObject shop_mt_world_state_p(final SubLObject v_shop_mt_world_state)
  {
    return classes.subloop_instanceof_class( v_shop_mt_world_state, $sym0$SHOP_MT_WORLD_STATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 2293L)
  public static SubLObject shop_mt_world_state_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_mt_world_state_method = NIL;
    SubLObject deletes = get_shop_mt_world_state_deletes( self );
    try
    {
      thread.throwStack.push( $sym15$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD );
      try
      {
        object.object_initialize_method( self );
        deletes = set.new_set( Symbols.symbol_function( EQUAL ), TEN_INTEGER );
        Dynamic.sublisp_throw( $sym15$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_mt_world_state_deletes( self, deletes );
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
      catch_var_for_shop_mt_world_state_method = Errors.handleThrowable( ccatch_env_var, $sym15$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_mt_world_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 2438L)
  public static SubLObject shop_mt_world_state_copy_state_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_mt_world_state_method = NIL;
    final SubLObject mt = get_shop_mt_world_state_mt( self );
    try
    {
      thread.throwStack.push( $sym19$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD );
      try
      {
        final SubLObject new_state = object.object_new_method( $sym0$SHOP_MT_WORLD_STATE );
        instances.set_slot( new_state, $sym5$MT, mt );
        Dynamic.sublisp_throw( $sym19$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, new_state );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_mt_world_state_mt( self, mt );
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
      catch_var_for_shop_mt_world_state_method = Errors.handleThrowable( ccatch_env_var, $sym19$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_mt_world_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 2704L)
  public static SubLObject shop_mt_world_state_next_state_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_mt_world_state_method = NIL;
    final SubLObject mt = get_shop_mt_world_state_mt( self );
    try
    {
      thread.throwStack.push( $sym23$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD );
      try
      {
        final SubLObject next_state = shop_mt_world_state_copy_state_method( self );
        final SubLObject next_mt = prove.hypothesize_spec_mt( mt, $shop_hyp_mt_prefix$.getDynamicValue( thread ) );
        instances.set_slot( next_state, $sym5$MT, next_mt );
        Dynamic.sublisp_throw( $sym23$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, next_state );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_mt_world_state_mt( self, mt );
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
      catch_var_for_shop_mt_world_state_method = Errors.handleThrowable( ccatch_env_var, $sym23$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_mt_world_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 2974L)
  public static SubLObject shop_mt_world_state_add_atom_method(final SubLObject self, final SubLObject literal)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_mt_world_state_method = NIL;
    final SubLObject deletes = get_shop_mt_world_state_deletes( self );
    final SubLObject mt = get_shop_mt_world_state_mt( self );
    try
    {
      thread.throwStack.push( $sym28$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD );
      try
      {
        cyc_kernel.cyc_assert( literal, mt, $list29 );
        if( NIL != set.set_memberP( literal, deletes ) )
        {
          set.set_remove( literal, deletes );
        }
        Dynamic.sublisp_throw( $sym28$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_mt_world_state_deletes( self, deletes );
          set_shop_mt_world_state_mt( self, mt );
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
      catch_var_for_shop_mt_world_state_method = Errors.handleThrowable( ccatch_env_var, $sym28$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_mt_world_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 3298L)
  public static SubLObject shop_mt_world_state_delete_atom_method(final SubLObject self, final SubLObject literal)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_mt_world_state_method = NIL;
    final SubLObject deletes = get_shop_mt_world_state_deletes( self );
    final SubLObject mt = get_shop_mt_world_state_mt( self );
    try
    {
      thread.throwStack.push( $sym33$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD );
      try
      {
        cyc_kernel.cyc_assert( ConsesLow.list( $const34$not, literal ), mt, $list29 );
        Dynamic.sublisp_throw( $sym33$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, set.set_add( literal, deletes ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_mt_world_state_deletes( self, deletes );
          set_shop_mt_world_state_mt( self, mt );
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
      catch_var_for_shop_mt_world_state_method = Errors.handleThrowable( ccatch_env_var, $sym33$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_mt_world_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 3582L)
  public static SubLObject shop_mt_world_state_add_literals_method(final SubLObject self, final SubLObject literals)
  {
    SubLObject cdolist_list_var = literals;
    SubLObject lit = NIL;
    lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      shop_mt_world_state_add_atom_method( self, lit );
      cdolist_list_var = cdolist_list_var.rest();
      lit = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 3756L)
  public static SubLObject shop_mt_world_state_delete_literals_method(final SubLObject self, final SubLObject literals)
  {
    SubLObject cdolist_list_var = literals;
    SubLObject lit = NIL;
    lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      shop_mt_world_state_delete_atom_method( self, lit );
      cdolist_list_var = cdolist_list_var.rest();
      lit = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 3934L)
  public static SubLObject shop_mt_world_state_add_literal_method(final SubLObject self, final SubLObject literal)
  {
    return shop_mt_world_state_add_atom_method( self, literal );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 4082L)
  public static SubLObject shop_mt_world_state_delete_literal_method(final SubLObject self, final SubLObject literal)
  {
    return shop_mt_world_state_delete_atom_method( self, literal );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 4236L)
  public static SubLObject shop_mt_world_state_same_state_p_method(final SubLObject self, final SubLObject state1, final SubLObject state2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_mt_world_state_method = NIL;
    final SubLObject deletes = get_shop_mt_world_state_deletes( self );
    final SubLObject mt = get_shop_mt_world_state_mt( self );
    try
    {
      thread.throwStack.push( $sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD );
      try
      {
        final SubLObject mt2 = get_shop_mt_world_state_mt( state1 );
        final SubLObject deletes2 = get_shop_mt_world_state_deletes( state1 );
        final SubLObject mt3 = get_shop_mt_world_state_mt( state2 );
        final SubLObject deletes3 = get_shop_mt_world_state_deletes( state2 );
        if( NIL == set_utilities.set_subsetP( deletes2, deletes3 ) || NIL == set_utilities.set_subsetP( deletes3, deletes2 ) )
        {
          Dynamic.sublisp_throw( $sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, NIL );
        }
        if( mt2.equal( mt3 ) )
        {
          Dynamic.sublisp_throw( $sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, T );
        }
        Dynamic.sublisp_throw( $sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, NIL );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_mt_world_state_deletes( self, deletes );
          set_shop_mt_world_state_mt( self, mt );
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
      catch_var_for_shop_mt_world_state_method = Errors.handleThrowable( ccatch_env_var, $sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_mt_world_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 4830L)
  public static SubLObject shop_mt_world_state_filter_deleted_bindings_method(final SubLObject self, final SubLObject v_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_mt_world_state_method = NIL;
    final SubLObject deletes = get_shop_mt_world_state_deletes( self );
    try
    {
      thread.throwStack.push( $sym58$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD );
      try
      {
        SubLObject new_bindings = NIL;
        if( NIL != set.set_emptyP( deletes ) )
        {
          new_bindings = v_bindings;
        }
        else
        {
          SubLObject cdolist_list_var = v_bindings;
          SubLObject cur_binding = NIL;
          cur_binding = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            SubLObject doneP = NIL;
            SubLObject bad_bindingP = NIL;
            if( NIL == doneP )
            {
              SubLObject csome_list_var = conses_high.second( cur_binding );
              SubLObject cur_support = NIL;
              cur_support = csome_list_var.first();
              while ( NIL == doneP && NIL != csome_list_var)
              {
                if( NIL != assertions_high.gaf_assertionP( cur_support ) && NIL != set.set_memberP( cur_support, deletes ) )
                {
                  doneP = T;
                  bad_bindingP = T;
                }
                csome_list_var = csome_list_var.rest();
                cur_support = csome_list_var.first();
              }
            }
            if( NIL == bad_bindingP )
            {
              new_bindings = ConsesLow.cons( cur_binding, new_bindings );
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_binding = cdolist_list_var.first();
          }
        }
        Dynamic.sublisp_throw( $sym58$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, Sequences.nreverse( new_bindings ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_mt_world_state_deletes( self, deletes );
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
      catch_var_for_shop_mt_world_state_method = Errors.handleThrowable( ccatch_env_var, $sym58$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_mt_world_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 5490L)
  public static SubLObject shop_mt_world_state_ask_method(final SubLObject self, final SubLObject formula, final SubLObject mbind, final SubLObject backchain)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_mt_world_state_method = NIL;
    final SubLObject mt = get_shop_mt_world_state_mt( self );
    try
    {
      thread.throwStack.push( $sym63$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD );
      try
      {
        final SubLObject _prev_bind_0 = control_vars.$inference_answer_handler$.currentBinding( thread );
        try
        {
          control_vars.$inference_answer_handler$.bind( ( NIL != shop_parameters.$shop_use_inference_supportsP$.getDynamicValue( thread ) ) ? $sym64$INFERENCE_RETURN_BLISTS_AND_SUPPORTS : $sym65$INFERENCE_RETURN_BLISTS,
              thread );
          SubLObject v_bindings = NIL;
          if( NIL != shop_parameters.$shop_use_shop_askP$.getDynamicValue( thread ) )
          {
            v_bindings = shop_inference.shop_ask( formula, mt, backchain, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          else
          {
            v_bindings = fi.fi_ask_int( formula, mt, backchain, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          }
          v_bindings = shop_mt_world_state_filter_deleted_bindings_method( self, v_bindings );
          Dynamic.sublisp_throw( $sym63$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, v_bindings );
        }
        finally
        {
          control_vars.$inference_answer_handler$.rebind( _prev_bind_0, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_mt_world_state_mt( self, mt );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var_for_shop_mt_world_state_method = Errors.handleThrowable( ccatch_env_var, $sym63$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_mt_world_state_method;
  }

  public static SubLObject declare_shop_mt_world_state_file()
  {
    SubLFiles.declareFunction( me, "get_shop_mt_world_state_deletes", "GET-SHOP-MT-WORLD-STATE-DELETES", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_mt_world_state_deletes", "SET-SHOP-MT-WORLD-STATE-DELETES", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_mt_world_state_mt", "GET-SHOP-MT-WORLD-STATE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_mt_world_state_mt", "SET-SHOP-MT-WORLD-STATE-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_mt_world_state_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-MT-WORLD-STATE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_mt_world_state_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-MT-WORLD-STATE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_mt_world_state_p", "SHOP-MT-WORLD-STATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_mt_world_state_initialize_method", "SHOP-MT-WORLD-STATE-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_mt_world_state_copy_state_method", "SHOP-MT-WORLD-STATE-COPY-STATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_mt_world_state_next_state_method", "SHOP-MT-WORLD-STATE-NEXT-STATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_mt_world_state_add_atom_method", "SHOP-MT-WORLD-STATE-ADD-ATOM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_mt_world_state_delete_atom_method", "SHOP-MT-WORLD-STATE-DELETE-ATOM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_mt_world_state_add_literals_method", "SHOP-MT-WORLD-STATE-ADD-LITERALS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_mt_world_state_delete_literals_method", "SHOP-MT-WORLD-STATE-DELETE-LITERALS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_mt_world_state_add_literal_method", "SHOP-MT-WORLD-STATE-ADD-LITERAL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_mt_world_state_delete_literal_method", "SHOP-MT-WORLD-STATE-DELETE-LITERAL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_mt_world_state_same_state_p_method", "SHOP-MT-WORLD-STATE-SAME-STATE-P-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_mt_world_state_filter_deleted_bindings_method", "SHOP-MT-WORLD-STATE-FILTER-DELETED-BINDINGS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_mt_world_state_ask_method", "SHOP-MT-WORLD-STATE-ASK-METHOD", 4, 0, false );
    return NIL;
  }

  public static SubLObject init_shop_mt_world_state_file()
  {
    $shop_hyp_mt_prefix$ = SubLFiles.defparameter( "*SHOP-HYP-MT-PREFIX*", $str11$SHOP_WS );
    return NIL;
  }

  public static SubLObject setup_shop_mt_world_state_file()
  {
    classes.subloop_new_class( $sym0$SHOP_MT_WORLD_STATE, $sym1$OBJECT, $list2, NIL, $list3 );
    classes.class_set_implements_slot_listeners( $sym0$SHOP_MT_WORLD_STATE, NIL );
    classes.subloop_note_class_initialization_function( $sym0$SHOP_MT_WORLD_STATE, $sym7$SUBLOOP_RESERVED_INITIALIZE_SHOP_MT_WORLD_STATE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$SHOP_MT_WORLD_STATE, $sym10$SUBLOOP_RESERVED_INITIALIZE_SHOP_MT_WORLD_STATE_INSTANCE );
    subloop_reserved_initialize_shop_mt_world_state_class( $sym0$SHOP_MT_WORLD_STATE );
    methods.methods_incorporate_instance_method( $sym12$INITIALIZE, $sym0$SHOP_MT_WORLD_STATE, $list13, NIL, $list14 );
    methods.subloop_register_instance_method( $sym0$SHOP_MT_WORLD_STATE, $sym12$INITIALIZE, $sym16$SHOP_MT_WORLD_STATE_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym17$COPY_STATE, $sym0$SHOP_MT_WORLD_STATE, $list13, NIL, $list18 );
    methods.subloop_register_instance_method( $sym0$SHOP_MT_WORLD_STATE, $sym17$COPY_STATE, $sym20$SHOP_MT_WORLD_STATE_COPY_STATE_METHOD );
    methods.methods_incorporate_instance_method( $sym21$NEXT_STATE, $sym0$SHOP_MT_WORLD_STATE, $list13, NIL, $list22 );
    methods.subloop_register_instance_method( $sym0$SHOP_MT_WORLD_STATE, $sym21$NEXT_STATE, $sym24$SHOP_MT_WORLD_STATE_NEXT_STATE_METHOD );
    methods.methods_incorporate_instance_method( $sym25$ADD_ATOM, $sym0$SHOP_MT_WORLD_STATE, $list13, $list26, $list27 );
    methods.subloop_register_instance_method( $sym0$SHOP_MT_WORLD_STATE, $sym25$ADD_ATOM, $sym30$SHOP_MT_WORLD_STATE_ADD_ATOM_METHOD );
    methods.methods_incorporate_instance_method( $sym31$DELETE_ATOM, $sym0$SHOP_MT_WORLD_STATE, $list13, $list26, $list32 );
    methods.subloop_register_instance_method( $sym0$SHOP_MT_WORLD_STATE, $sym31$DELETE_ATOM, $sym35$SHOP_MT_WORLD_STATE_DELETE_ATOM_METHOD );
    methods.methods_incorporate_instance_method( $sym36$ADD_LITERALS, $sym0$SHOP_MT_WORLD_STATE, $list13, $list37, $list38 );
    methods.subloop_register_instance_method( $sym0$SHOP_MT_WORLD_STATE, $sym36$ADD_LITERALS, $sym39$SHOP_MT_WORLD_STATE_ADD_LITERALS_METHOD );
    methods.methods_incorporate_instance_method( $sym40$DELETE_LITERALS, $sym0$SHOP_MT_WORLD_STATE, $list13, $list37, $list41 );
    methods.subloop_register_instance_method( $sym0$SHOP_MT_WORLD_STATE, $sym40$DELETE_LITERALS, $sym42$SHOP_MT_WORLD_STATE_DELETE_LITERALS_METHOD );
    methods.methods_incorporate_instance_method( $sym43$ADD_LITERAL, $sym0$SHOP_MT_WORLD_STATE, $list13, $list26, $list44 );
    methods.subloop_register_instance_method( $sym0$SHOP_MT_WORLD_STATE, $sym43$ADD_LITERAL, $sym45$SHOP_MT_WORLD_STATE_ADD_LITERAL_METHOD );
    methods.methods_incorporate_instance_method( $sym46$DELETE_LITERAL, $sym0$SHOP_MT_WORLD_STATE, $list13, $list26, $list47 );
    methods.subloop_register_instance_method( $sym0$SHOP_MT_WORLD_STATE, $sym46$DELETE_LITERAL, $sym48$SHOP_MT_WORLD_STATE_DELETE_LITERAL_METHOD );
    methods.methods_incorporate_class_method( $sym49$SAME_STATE_P, $sym0$SHOP_MT_WORLD_STATE, $list13, $list50, $list51 );
    methods.subloop_register_class_method( $sym0$SHOP_MT_WORLD_STATE, $sym49$SAME_STATE_P, $sym53$SHOP_MT_WORLD_STATE_SAME_STATE_P_METHOD );
    methods.methods_incorporate_instance_method( $sym54$FILTER_DELETED_BINDINGS, $sym0$SHOP_MT_WORLD_STATE, $list55, $list56, $list57 );
    methods.subloop_register_instance_method( $sym0$SHOP_MT_WORLD_STATE, $sym54$FILTER_DELETED_BINDINGS, $sym59$SHOP_MT_WORLD_STATE_FILTER_DELETED_BINDINGS_METHOD );
    methods.methods_incorporate_instance_method( $sym60$ASK, $sym0$SHOP_MT_WORLD_STATE, $list13, $list61, $list62 );
    methods.subloop_register_instance_method( $sym0$SHOP_MT_WORLD_STATE, $sym60$ASK, $sym66$SHOP_MT_WORLD_STATE_ASK_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_shop_mt_world_state_file();
  }

  @Override
  public void initializeVariables()
  {
    init_shop_mt_world_state_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_shop_mt_world_state_file();
  }
  static
  {
    me = new shop_mt_world_state();
    $shop_hyp_mt_prefix$ = null;
    $sym0$SHOP_MT_WORLD_STATE = makeSymbol( "SHOP-MT-WORLD-STATE" );
    $sym1$OBJECT = makeSymbol( "OBJECT" );
    $list2 = ConsesLow.list( makeSymbol( "SHOP-WORLD-STATE" ) );
    $list3 = ConsesLow.list( ConsesLow.list( makeSymbol( "MT" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DELETES" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ),
        ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "FILTER-DELETED-BINDINGS" ), ConsesLow.list( makeSymbol( "BINDINGS" ) ), makeKeyword( "PROTECTED" ) ) );
    $sym4$DELETES = makeSymbol( "DELETES" );
    $sym5$MT = makeSymbol( "MT" );
    $sym6$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym7$SUBLOOP_RESERVED_INITIALIZE_SHOP_MT_WORLD_STATE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-MT-WORLD-STATE-CLASS" );
    $sym8$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym9$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym10$SUBLOOP_RESERVED_INITIALIZE_SHOP_MT_WORLD_STATE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-MT-WORLD-STATE-INSTANCE" );
    $str11$SHOP_WS = makeString( "SHOP-WS" );
    $sym12$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list13 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list14 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DELETES" ), ConsesLow.list( makeSymbol( "NEW-SET" ), ConsesLow.list(
        makeSymbol( "FUNCTION" ), EQUAL ), TEN_INTEGER ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym15$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD" );
    $sym16$SHOP_MT_WORLD_STATE_INITIALIZE_METHOD = makeSymbol( "SHOP-MT-WORLD-STATE-INITIALIZE-METHOD" );
    $sym17$COPY_STATE = makeSymbol( "COPY-STATE" );
    $list18 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-STATE" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ),
        makeSymbol( "SHOP-MT-WORLD-STATE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SHOP-MT-WORLD-STATE" ) ) ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "NEW-STATE" ), ConsesLow.list(
            makeSymbol( "QUOTE" ), makeSymbol( "MT" ) ), makeSymbol( "MT" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-STATE" ) ) ) );
    $sym19$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD" );
    $sym20$SHOP_MT_WORLD_STATE_COPY_STATE_METHOD = makeSymbol( "SHOP-MT-WORLD-STATE-COPY-STATE-METHOD" );
    $sym21$NEXT_STATE = makeSymbol( "NEXT-STATE" );
    $list22 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEXT-STATE" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "COPY-STATE" ),
        makeSymbol( "SHOP-MT-WORLD-STATE" ) ), makeSymbol( "SELF" ) ) ), ConsesLow.list( makeSymbol( "NEXT-MT" ), ConsesLow.list( makeSymbol( "HYPOTHESIZE-SPEC-MT" ), makeSymbol( "MT" ), makeSymbol(
            "*SHOP-HYP-MT-PREFIX*" ) ) ) ), ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "NEXT-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "MT" ) ), makeSymbol( "NEXT-MT" ) ), ConsesLow.list(
                makeSymbol( "RET" ), makeSymbol( "NEXT-STATE" ) ) ) );
    $sym23$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD" );
    $sym24$SHOP_MT_WORLD_STATE_NEXT_STATE_METHOD = makeSymbol( "SHOP-MT-WORLD-STATE-NEXT-STATE-METHOD" );
    $sym25$ADD_ATOM = makeSymbol( "ADD-ATOM" );
    $list26 = ConsesLow.list( makeSymbol( "LITERAL" ) );
    $list27 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERT-MUST" ), ConsesLow.list( makeSymbol( "GAF?" ), makeSymbol( "LITERAL" ) ), makeString(
        "(ADD-ATOM SHOP-MT-WORLD-STATE) (LITERAL): LITERAL is not ground." ) ), ConsesLow.list( makeSymbol( "CYC-ASSERT" ), makeSymbol( "LITERAL" ), makeSymbol( "MT" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow
            .list( makeKeyword( "MONOTONIC" ), makeKeyword( "FORWARD" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "SET-MEMBER?" ), makeSymbol( "LITERAL" ), makeSymbol( "DELETES" ) ),
                ConsesLow.list( makeSymbol( "SET-REMOVE" ), makeSymbol( "LITERAL" ), makeSymbol( "DELETES" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym28$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD" );
    $list29 = ConsesLow.list( makeKeyword( "MONOTONIC" ), makeKeyword( "FORWARD" ) );
    $sym30$SHOP_MT_WORLD_STATE_ADD_ATOM_METHOD = makeSymbol( "SHOP-MT-WORLD-STATE-ADD-ATOM-METHOD" );
    $sym31$DELETE_ATOM = makeSymbol( "DELETE-ATOM" );
    $list32 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERT-MUST" ), ConsesLow.list( makeSymbol( "GAF?" ), makeSymbol( "LITERAL" ) ), makeString(
        "(ADD-ATOM SHOP-MT-WORLD-STATE) (LITERAL): LITERAL is not ground." ) ), ConsesLow.list( makeSymbol( "CYC-ASSERT" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), constant_handles.reader_make_constant_shell(
            makeString( "not" ) ), makeSymbol( "LITERAL" ) ), makeSymbol( "MT" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeKeyword( "MONOTONIC" ), makeKeyword( "FORWARD" ) ) ) ), ConsesLow.list(
                makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "SET-ADD" ), makeSymbol( "LITERAL" ), makeSymbol( "DELETES" ) ) ) );
    $sym33$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD" );
    $const34$not = constant_handles.reader_make_constant_shell( makeString( "not" ) );
    $sym35$SHOP_MT_WORLD_STATE_DELETE_ATOM_METHOD = makeSymbol( "SHOP-MT-WORLD-STATE-DELETE-ATOM-METHOD" );
    $sym36$ADD_LITERALS = makeSymbol( "ADD-LITERALS" );
    $list37 = ConsesLow.list( makeSymbol( "LITERALS" ) );
    $list38 = ConsesLow.list( makeString( "@param LITERALS listp" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LIT" ), makeSymbol( "LITERALS" ) ), ConsesLow.list( makeSymbol( "ADD-ATOM" ),
        makeSymbol( "SELF" ), makeSymbol( "LIT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym39$SHOP_MT_WORLD_STATE_ADD_LITERALS_METHOD = makeSymbol( "SHOP-MT-WORLD-STATE-ADD-LITERALS-METHOD" );
    $sym40$DELETE_LITERALS = makeSymbol( "DELETE-LITERALS" );
    $list41 = ConsesLow.list( makeString( "@param LITERALS listp" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LIT" ), makeSymbol( "LITERALS" ) ), ConsesLow.list( makeSymbol( "DELETE-ATOM" ),
        makeSymbol( "SELF" ), makeSymbol( "LIT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym42$SHOP_MT_WORLD_STATE_DELETE_LITERALS_METHOD = makeSymbol( "SHOP-MT-WORLD-STATE-DELETE-LITERALS-METHOD" );
    $sym43$ADD_LITERAL = makeSymbol( "ADD-LITERAL" );
    $list44 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "ADD-ATOM" ), makeSymbol( "SHOP-MT-WORLD-STATE" ) ), makeSymbol( "SELF" ),
        makeSymbol( "LITERAL" ) ) ) );
    $sym45$SHOP_MT_WORLD_STATE_ADD_LITERAL_METHOD = makeSymbol( "SHOP-MT-WORLD-STATE-ADD-LITERAL-METHOD" );
    $sym46$DELETE_LITERAL = makeSymbol( "DELETE-LITERAL" );
    $list47 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "DELETE-ATOM" ), makeSymbol( "SHOP-MT-WORLD-STATE" ) ), makeSymbol( "SELF" ),
        makeSymbol( "LITERAL" ) ) ) );
    $sym48$SHOP_MT_WORLD_STATE_DELETE_LITERAL_METHOD = makeSymbol( "SHOP-MT-WORLD-STATE-DELETE-LITERAL-METHOD" );
    $sym49$SAME_STATE_P = makeSymbol( "SAME-STATE-P" );
    $list50 = ConsesLow.list( makeSymbol( "STATE1" ), makeSymbol( "STATE2" ) );
    $list51 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MT1" ), ConsesLow.list( makeSymbol( "INLINE-GET-SLOT" ), ConsesLow.list( makeSymbol( "MT" ), makeSymbol(
        "SHOP-MT-WORLD-STATE" ) ), makeSymbol( "STATE1" ) ) ), ConsesLow.list( makeSymbol( "DELETES1" ), ConsesLow.list( makeSymbol( "INLINE-GET-SLOT" ), ConsesLow.list( makeSymbol( "DELETES" ), makeSymbol(
            "SHOP-MT-WORLD-STATE" ) ), makeSymbol( "STATE1" ) ) ), ConsesLow.list( makeSymbol( "MT2" ), ConsesLow.list( makeSymbol( "INLINE-GET-SLOT" ), ConsesLow.list( makeSymbol( "MT" ), makeSymbol(
                "SHOP-MT-WORLD-STATE" ) ), makeSymbol( "STATE2" ) ) ), ConsesLow.list( makeSymbol( "DELETES2" ), ConsesLow.list( makeSymbol( "INLINE-GET-SLOT" ), ConsesLow.list( makeSymbol( "DELETES" ), makeSymbol(
                    "SHOP-MT-WORLD-STATE" ) ), makeSymbol( "STATE2" ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "SET-SUBSET?" ), makeSymbol(
                        "DELETES1" ), makeSymbol( "DELETES2" ) ), ConsesLow.list( makeSymbol( "SET-SUBSET?" ), makeSymbol( "DELETES2" ), makeSymbol( "DELETES1" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ),
        ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( EQUAL, makeSymbol( "MT1" ), makeSymbol( "MT2" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD" );
    $sym53$SHOP_MT_WORLD_STATE_SAME_STATE_P_METHOD = makeSymbol( "SHOP-MT-WORLD-STATE-SAME-STATE-P-METHOD" );
    $sym54$FILTER_DELETED_BINDINGS = makeSymbol( "FILTER-DELETED-BINDINGS" );
    $list55 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list56 = ConsesLow.list( makeSymbol( "BINDINGS" ) );
    $list57 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-BINDINGS" ), NIL ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "SET-EMPTY?" ),
        makeSymbol( "DELETES" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEW-BINDINGS" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "CDOLIST" ),
            ConsesLow.list( makeSymbol( "CUR-BINDING" ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "DONE?" ), NIL ), ConsesLow.list( makeSymbol(
                "BAD-BINDING?" ), NIL ) ), ConsesLow.list( makeSymbol( "CSOME" ), ConsesLow.list( makeSymbol( "CUR-SUPPORT" ), ConsesLow.list( makeSymbol( "SECOND" ), makeSymbol( "CUR-BINDING" ) ), makeSymbol(
                    "DONE?" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "GAF-ASSERTION?" ), makeSymbol( "CUR-SUPPORT" ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol(
                        "SET-MEMBER?" ), makeSymbol( "CUR-SUPPORT" ), makeSymbol( "DELETES" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DONE?" ), T ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                            "BAD-BINDING?" ), T ) ) ) ), ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "BAD-BINDING?" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "CUR-BINDING" ), makeSymbol(
                                "NEW-BINDINGS" ) ) ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "NEW-BINDINGS" ) ) ) ) );
    $sym58$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD" );
    $sym59$SHOP_MT_WORLD_STATE_FILTER_DELETED_BINDINGS_METHOD = makeSymbol( "SHOP-MT-WORLD-STATE-FILTER-DELETED-BINDINGS-METHOD" );
    $sym60$ASK = makeSymbol( "ASK" );
    $list61 = ConsesLow.list( makeSymbol( "FORMULA" ), makeSymbol( "MBIND" ), makeSymbol( "BACKCHAIN" ) );
    $list62 = ConsesLow.list( ConsesLow.list( makeSymbol( "IGNORE" ), makeSymbol( "MBIND" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "*INFERENCE-ANSWER-HANDLER*" ), ConsesLow
        .list( makeSymbol( "FIF" ), makeSymbol( "*SHOP-USE-INFERENCE-SUPPORTS?*" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INFERENCE-RETURN-BLISTS-AND-SUPPORTS" ) ), ConsesLow.list( makeSymbol( "QUOTE" ),
            makeSymbol( "INFERENCE-RETURN-BLISTS" ) ) ) ), makeSymbol( "BINDINGS" ) ), ConsesLow.list( makeSymbol( "PIF" ), makeSymbol( "*SHOP-USE-SHOP-ASK?*" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                "BINDINGS" ), ConsesLow.list( makeSymbol( "SHOP-ASK" ), makeSymbol( "FORMULA" ), makeSymbol( "MT" ), makeSymbol( "BACKCHAIN" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "BINDINGS" ),
                    ConsesLow.list( makeSymbol( "FI-ASK-INT" ), makeSymbol( "FORMULA" ), makeSymbol( "MT" ), makeSymbol( "BACKCHAIN" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "BINDINGS" ), ConsesLow
                        .list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "FILTER-DELETED-BINDINGS" ), makeSymbol( "SHOP-MT-WORLD-STATE" ) ), makeSymbol( "SELF" ), makeSymbol( "BINDINGS" ) ) ), ConsesLow
                            .list( makeSymbol( "RET" ), makeSymbol( "BINDINGS" ) ) ) );
    $sym63$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD" );
    $sym64$INFERENCE_RETURN_BLISTS_AND_SUPPORTS = makeSymbol( "INFERENCE-RETURN-BLISTS-AND-SUPPORTS" );
    $sym65$INFERENCE_RETURN_BLISTS = makeSymbol( "INFERENCE-RETURN-BLISTS" );
    $sym66$SHOP_MT_WORLD_STATE_ASK_METHOD = makeSymbol( "SHOP-MT-WORLD-STATE-ASK-METHOD" );
  }
}
/*
 * 
 * Total time: 266 ms
 * 
 */