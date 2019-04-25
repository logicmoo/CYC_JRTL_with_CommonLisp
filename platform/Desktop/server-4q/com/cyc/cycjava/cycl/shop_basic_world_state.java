package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
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

public final class shop_basic_world_state
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.shop_basic_world_state";
  public static final String myFingerPrint = "64a0fd173aa588ef90e6ab7d2e695a42f375cc1bef5c22da955be50f39c000f9";
  private static final SubLSymbol $sym0$SHOP_WORLD_STATE;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$SHOP_BASIC_WORLD_STATE;
  private static final SubLSymbol $sym3$OBJECT;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$VAR_MANAGER;
  private static final SubLSymbol $sym7$NEGATIVE_LITERALS;
  private static final SubLSymbol $sym8$POSITIVE_LITERALS;
  private static final SubLSymbol $sym9$INSTANCE_COUNT;
  private static final SubLSymbol $sym10$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_WORLD_STATE_CLASS;
  private static final SubLSymbol $sym11$ISOLATED_P;
  private static final SubLSymbol $sym12$INSTANCE_NUMBER;
  private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_WORLD_STATE_INSTANCE;
  private static final SubLSymbol $sym14$INITIALIZE;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD;
  private static final SubLSymbol $sym18$SHOP_BASIC_WORLD_STATE_INITIALIZE_METHOD;
  private static final SubLSymbol $sym19$SAME_STATE_P;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD;
  private static final SubLSymbol $sym24$SHOP_BASIC_WORLD_STATE_SAME_STATE_P_METHOD;
  private static final SubLSymbol $sym25$ADD_ATOM;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD;
  private static final SubLString $str29$ADD_ATOM___s_is_negated___;
  private static final SubLSymbol $sym30$SHOP_BASIC_WORLD_STATE_ADD_ATOM_METHOD;
  private static final SubLSymbol $sym31$DELETE_ATOM;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD;
  private static final SubLString $str34$DELETE_ATOM___s_is_negated___;
  private static final SubLSymbol $sym35$SHOP_BASIC_WORLD_STATE_DELETE_ATOM_METHOD;
  private static final SubLSymbol $sym36$ADD_LITERAL;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$SHOP_BASIC_WORLD_STATE_ADD_LITERAL_METHOD;
  private static final SubLSymbol $sym39$DELETE_LITERAL;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$SHOP_BASIC_WORLD_STATE_DELETE_LITERAL_METHOD;
  private static final SubLSymbol $sym42$ADD_LITERALS;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$SHOP_BASIC_WORLD_STATE_ADD_LITERALS_METHOD;
  private static final SubLSymbol $sym46$DELETE_LITERALS;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$SHOP_BASIC_WORLD_STATE_DELETE_LITERALS_METHOD;
  private static final SubLSymbol $sym49$COPY_STATE;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD;
  private static final SubLSymbol $sym52$SHOP_BASIC_WORLD_STATE_COPY_STATE_METHOD;
  private static final SubLSymbol $sym53$NEXT_STATE;
  private static final SubLList $list54;
  private static final SubLSymbol $sym55$SHOP_BASIC_WORLD_STATE_NEXT_STATE_METHOD;
  private static final SubLSymbol $sym56$POSITIVE_MATCHES_TO_PREDICATE;
  private static final SubLList $list57;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD;
  private static final SubLSymbol $sym60$CCONCATENATE;
  private static final SubLSymbol $sym61$SHOP_BASIC_WORLD_STATE_POSITIVE_MATCHES_TO_PREDICATE_METHOD;
  private static final SubLSymbol $sym62$NEGATIVE_MATCHES_TO_PREDICATE;
  private static final SubLList $list63;
  private static final SubLSymbol $sym64$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD;
  private static final SubLSymbol $sym65$SHOP_BASIC_WORLD_STATE_NEGATIVE_MATCHES_TO_PREDICATE_METHOD;
  private static final SubLSymbol $sym66$ASK_GROUND_LITERAL;
  private static final SubLList $list67;
  private static final SubLString $str68$ask_ground_literal___s_is_not_gro;
  private static final SubLSymbol $sym69$SHOP_BASIC_WORLD_STATE_ASK_GROUND_LITERAL_METHOD;
  private static final SubLSymbol $sym70$ASK_IF_NOT_GROUND_LITERAL;
  private static final SubLList $list71;
  private static final SubLString $str72$ask_if_not_ground_literal___s_is_;
  private static final SubLSymbol $sym73$SHOP_BASIC_WORLD_STATE_ASK_IF_NOT_GROUND_LITERAL_METHOD;
  private static final SubLSymbol $sym74$ASK;
  private static final SubLList $list75;
  private static final SubLList $list76;
  private static final SubLSymbol $sym77$SHOP_BASIC_WORLD_STATE_ASK_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 795L)
  public static SubLObject shop_world_state_p(final SubLObject shop_world_state)
  {
    return interfaces.subloop_instanceof_interface( shop_world_state, $sym0$SHOP_WORLD_STATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 1414L)
  public static SubLObject get_shop_basic_world_state_var_manager(final SubLObject v_shop_basic_world_state)
  {
    return classes.subloop_get_access_protected_instance_slot( v_shop_basic_world_state, THREE_INTEGER, $sym6$VAR_MANAGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 1414L)
  public static SubLObject set_shop_basic_world_state_var_manager(final SubLObject v_shop_basic_world_state, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_shop_basic_world_state, value, THREE_INTEGER, $sym6$VAR_MANAGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 1414L)
  public static SubLObject get_shop_basic_world_state_negative_literals(final SubLObject v_shop_basic_world_state)
  {
    return classes.subloop_get_access_protected_instance_slot( v_shop_basic_world_state, TWO_INTEGER, $sym7$NEGATIVE_LITERALS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 1414L)
  public static SubLObject set_shop_basic_world_state_negative_literals(final SubLObject v_shop_basic_world_state, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_shop_basic_world_state, value, TWO_INTEGER, $sym7$NEGATIVE_LITERALS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 1414L)
  public static SubLObject get_shop_basic_world_state_positive_literals(final SubLObject v_shop_basic_world_state)
  {
    return classes.subloop_get_access_protected_instance_slot( v_shop_basic_world_state, ONE_INTEGER, $sym8$POSITIVE_LITERALS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 1414L)
  public static SubLObject set_shop_basic_world_state_positive_literals(final SubLObject v_shop_basic_world_state, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_shop_basic_world_state, value, ONE_INTEGER, $sym8$POSITIVE_LITERALS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 1414L)
  public static SubLObject subloop_reserved_initialize_shop_basic_world_state_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym9$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 1414L)
  public static SubLObject subloop_reserved_initialize_shop_basic_world_state_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym11$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym12$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$SHOP_BASIC_WORLD_STATE, $sym8$POSITIVE_LITERALS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$SHOP_BASIC_WORLD_STATE, $sym7$NEGATIVE_LITERALS, NIL );
    classes.subloop_initialize_slot( new_instance, $sym2$SHOP_BASIC_WORLD_STATE, $sym6$VAR_MANAGER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 1414L)
  public static SubLObject shop_basic_world_state_p(final SubLObject v_shop_basic_world_state)
  {
    return classes.subloop_instanceof_class( v_shop_basic_world_state, $sym2$SHOP_BASIC_WORLD_STATE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 2103L)
  public static SubLObject shop_basic_world_state_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_world_state_method = NIL;
    SubLObject negative_literals = get_shop_basic_world_state_negative_literals( self );
    SubLObject positive_literals = get_shop_basic_world_state_positive_literals( self );
    try
    {
      thread.throwStack.push( $sym17$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD );
      try
      {
        object.object_initialize_method( self );
        positive_literals = dictionary.new_dictionary( Symbols.symbol_function( EQ ), TEN_INTEGER );
        negative_literals = dictionary.new_dictionary( Symbols.symbol_function( EQ ), TEN_INTEGER );
        Dynamic.sublisp_throw( $sym17$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_world_state_negative_literals( self, negative_literals );
          set_shop_basic_world_state_positive_literals( self, positive_literals );
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
      catch_var_for_shop_basic_world_state_method = Errors.handleThrowable( ccatch_env_var, $sym17$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_world_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 2317L)
  public static SubLObject shop_basic_world_state_same_state_p_method(final SubLObject self, final SubLObject state1, final SubLObject state2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_world_state_method = NIL;
    final SubLObject negative_literals = get_shop_basic_world_state_negative_literals( self );
    final SubLObject positive_literals = get_shop_basic_world_state_positive_literals( self );
    try
    {
      thread.throwStack.push( $sym23$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD );
      try
      {
        final SubLObject pos_lits2 = instances.get_slot( state2, $sym8$POSITIVE_LITERALS );
        final SubLObject neg_lits2 = instances.get_slot( state2, $sym7$NEGATIVE_LITERALS );
        SubLObject v_answer = T;
        SubLObject doneP;
        SubLObject iteration_state;
        for( doneP = NIL, iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( instances.get_slot( state1, $sym8$POSITIVE_LITERALS ) ) ); NIL == doneP
            && NIL == dictionary_contents.do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
        {
          thread.resetMultipleValues();
          final SubLObject key = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
          final SubLObject value1 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          final SubLObject value2 = dictionary.dictionary_lookup( key, pos_lits2, UNPROVIDED );
          if( NIL != conses_high.subsetp( value1, value2, UNPROVIDED, UNPROVIDED ) && NIL != conses_high.subsetp( value2, value1, UNPROVIDED, UNPROVIDED ) )
          {
            doneP = T;
            v_answer = NIL;
          }
        }
        dictionary_contents.do_dictionary_contents_finalize( iteration_state );
        for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( instances.get_slot( state1, $sym7$NEGATIVE_LITERALS ) ) ); NIL == doneP && NIL == dictionary_contents
            .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
        {
          thread.resetMultipleValues();
          final SubLObject key = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
          final SubLObject value1 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          final SubLObject value2 = dictionary.dictionary_lookup( key, neg_lits2, UNPROVIDED );
          if( NIL != conses_high.subsetp( value1, value2, UNPROVIDED, UNPROVIDED ) && NIL != conses_high.subsetp( value2, value1, UNPROVIDED, UNPROVIDED ) )
          {
            doneP = T;
            v_answer = NIL;
          }
        }
        dictionary_contents.do_dictionary_contents_finalize( iteration_state );
        Dynamic.sublisp_throw( $sym23$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD, v_answer );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_world_state_negative_literals( self, negative_literals );
          set_shop_basic_world_state_positive_literals( self, positive_literals );
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
      catch_var_for_shop_basic_world_state_method = Errors.handleThrowable( ccatch_env_var, $sym23$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_world_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 3060L)
  public static SubLObject shop_basic_world_state_add_atom_method(final SubLObject self, final SubLObject literal)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_world_state_method = NIL;
    final SubLObject negative_literals = get_shop_basic_world_state_negative_literals( self );
    final SubLObject positive_literals = get_shop_basic_world_state_positive_literals( self );
    try
    {
      thread.throwStack.push( $sym28$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != cycl_utilities.negatedP( literal ) )
        {
          Errors.error( $str29$ADD_ATOM___s_is_negated___, literal );
        }
        final SubLObject pred = el_utilities.literal_predicate( literal, UNPROVIDED );
        final SubLObject negated_lits = dictionary.dictionary_lookup( negative_literals, pred, UNPROVIDED );
        dictionary_utilities.dictionary_pushnew( positive_literals, pred, literal, Symbols.symbol_function( EQUAL ), UNPROVIDED );
        dictionary.dictionary_enter( negative_literals, pred, Sequences.remove( literal, negated_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        Dynamic.sublisp_throw( $sym28$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_world_state_negative_literals( self, negative_literals );
          set_shop_basic_world_state_positive_literals( self, positive_literals );
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
      catch_var_for_shop_basic_world_state_method = Errors.handleThrowable( ccatch_env_var, $sym28$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_world_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 3596L)
  public static SubLObject shop_basic_world_state_delete_atom_method(final SubLObject self, final SubLObject literal)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_world_state_method = NIL;
    final SubLObject negative_literals = get_shop_basic_world_state_negative_literals( self );
    final SubLObject positive_literals = get_shop_basic_world_state_positive_literals( self );
    try
    {
      thread.throwStack.push( $sym33$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD );
      try
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != cycl_utilities.negatedP( literal ) )
        {
          Errors.error( $str34$DELETE_ATOM___s_is_negated___, literal );
        }
        final SubLObject pred = el_utilities.literal_predicate( literal, UNPROVIDED );
        final SubLObject positive_lits = dictionary.dictionary_lookup( positive_literals, pred, UNPROVIDED );
        dictionary_utilities.dictionary_pushnew( negative_literals, pred, literal, Symbols.symbol_function( EQUAL ), UNPROVIDED );
        dictionary.dictionary_enter( positive_literals, pred, Sequences.remove( literal, positive_lits, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        Dynamic.sublisp_throw( $sym33$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD, T );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_world_state_negative_literals( self, negative_literals );
          set_shop_basic_world_state_positive_literals( self, positive_literals );
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
      catch_var_for_shop_basic_world_state_method = Errors.handleThrowable( ccatch_env_var, $sym33$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_world_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 4137L)
  public static SubLObject shop_basic_world_state_add_literal_method(final SubLObject self, final SubLObject literal)
  {
    return shop_basic_world_state_add_atom_method( self, literal );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 4280L)
  public static SubLObject shop_basic_world_state_delete_literal_method(final SubLObject self, final SubLObject literal)
  {
    return shop_basic_world_state_delete_atom_method( self, literal );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 4422L)
  public static SubLObject shop_basic_world_state_add_literals_method(final SubLObject self, final SubLObject literals)
  {
    SubLObject cdolist_list_var = literals;
    SubLObject lit = NIL;
    lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      shop_basic_world_state_add_atom_method( self, lit );
      cdolist_list_var = cdolist_list_var.rest();
      lit = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 4592L)
  public static SubLObject shop_basic_world_state_delete_literals_method(final SubLObject self, final SubLObject literals)
  {
    SubLObject cdolist_list_var = literals;
    SubLObject lit = NIL;
    lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      shop_basic_world_state_delete_atom_method( self, lit );
      cdolist_list_var = cdolist_list_var.rest();
      lit = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 4767L)
  public static SubLObject shop_basic_world_state_copy_state_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_world_state_method = NIL;
    final SubLObject negative_literals = get_shop_basic_world_state_negative_literals( self );
    final SubLObject positive_literals = get_shop_basic_world_state_positive_literals( self );
    try
    {
      thread.throwStack.push( $sym51$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD );
      try
      {
        final SubLObject new_state = object.object_new_method( $sym2$SHOP_BASIC_WORLD_STATE );
        instances.set_slot( new_state, $sym8$POSITIVE_LITERALS, dictionary_utilities.copy_dictionary( positive_literals ) );
        instances.set_slot( new_state, $sym7$NEGATIVE_LITERALS, dictionary_utilities.copy_dictionary( negative_literals ) );
        Dynamic.sublisp_throw( $sym51$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD, new_state );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_world_state_negative_literals( self, negative_literals );
          set_shop_basic_world_state_positive_literals( self, positive_literals );
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
      catch_var_for_shop_basic_world_state_method = Errors.handleThrowable( ccatch_env_var, $sym51$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_world_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 5147L)
  public static SubLObject shop_basic_world_state_next_state_method(final SubLObject self)
  {
    return shop_basic_world_state_copy_state_method( self );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 5319L)
  public static SubLObject shop_basic_world_state_positive_matches_to_predicate_method(final SubLObject self, final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_world_state_method = NIL;
    final SubLObject positive_literals = get_shop_basic_world_state_positive_literals( self );
    try
    {
      thread.throwStack.push( $sym59$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym59$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD, Functions.apply( Symbols.symbol_function( $sym60$CCONCATENATE ), multibindings.apply_mb( dictionary.dictionary_lookup(
            positive_literals, pred, UNPROVIDED ), shop_parameters.$shop_ask_multibinding$.getDynamicValue( thread ) ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_world_state_positive_literals( self, positive_literals );
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
      catch_var_for_shop_basic_world_state_method = Errors.handleThrowable( ccatch_env_var, $sym59$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_world_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 5534L)
  public static SubLObject shop_basic_world_state_negative_matches_to_predicate_method(final SubLObject self, final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_shop_basic_world_state_method = NIL;
    final SubLObject negative_literals = get_shop_basic_world_state_negative_literals( self );
    try
    {
      thread.throwStack.push( $sym64$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym64$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD, Functions.apply( Symbols.symbol_function( $sym60$CCONCATENATE ), multibindings.apply_mb( dictionary.dictionary_lookup(
            negative_literals, pred, UNPROVIDED ), shop_parameters.$shop_ask_multibinding$.getDynamicValue( thread ) ) ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_shop_basic_world_state_negative_literals( self, negative_literals );
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
      catch_var_for_shop_basic_world_state_method = Errors.handleThrowable( ccatch_env_var, $sym64$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_shop_basic_world_state_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 5750L)
  public static SubLObject shop_basic_world_state_ask_ground_literal_method(final SubLObject self, final SubLObject literal)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == el_utilities.groundP( literal, UNPROVIDED ) )
    {
      Errors.error( $str68$ask_ground_literal___s_is_not_gro, literal );
    }
    return conses_high.member( literal, shop_basic_world_state_positive_matches_to_predicate_method( self, el_utilities.literal_predicate( literal, UNPROVIDED ) ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 6013L)
  public static SubLObject shop_basic_world_state_ask_if_not_ground_literal_method(final SubLObject self, final SubLObject literal)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == el_utilities.groundP( literal, UNPROVIDED ) )
    {
      Errors.error( $str72$ask_if_not_ground_literal___s_is_, literal );
    }
    return conses_high.member( literal, shop_basic_world_state_negative_matches_to_predicate_method( self, el_utilities.literal_predicate( literal, UNPROVIDED ) ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 6290L)
  public static SubLObject shop_basic_world_state_ask_method(final SubLObject self, final SubLObject literal)
  {
    if( NIL == el_utilities.groundP( literal, UNPROVIDED ) )
    {
      final SubLObject pred = el_utilities.literal_predicate( literal, UNPROVIDED );
      final SubLObject positive_matches = shop_basic_world_state_positive_matches_to_predicate_method( self, pred );
      SubLObject v_bindings = NIL;
      SubLObject cdolist_list_var = positive_matches;
      SubLObject cur_lit = NIL;
      cur_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject mgu = unification_utilities.term_unify( literal, cur_lit, UNPROVIDED, UNPROVIDED );
        if( NIL != mgu )
        {
          v_bindings = ConsesLow.cons( mgu, v_bindings );
        }
        cdolist_list_var = cdolist_list_var.rest();
        cur_lit = cdolist_list_var.first();
      }
      return v_bindings;
    }
    if( NIL != shop_basic_world_state_ask_ground_literal_method( self, literal ) )
    {
      return $list76;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 6934L)
  public static SubLObject confirm_bindings_against_world_state(final SubLObject world_state, final SubLObject goals, final SubLObject v_bindings)
  {
    if( v_bindings.equal( $list76 ) )
    {
      SubLObject confirmedP = T;
      SubLObject cdolist_list_var = goals;
      SubLObject cur_lit = NIL;
      cur_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject pred = el_utilities.literal_predicate( cur_lit, UNPROVIDED );
        final SubLObject neg_matches = methods.funcall_instance_method_with_1_args( world_state, $sym62$NEGATIVE_MATCHES_TO_PREDICATE, pred );
        if( NIL != subl_promotions.memberP( cur_lit, neg_matches, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          confirmedP = NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        cur_lit = cdolist_list_var.first();
      }
      return ( NIL != confirmedP ) ? v_bindings : NIL;
    }
    SubLObject new_bindings = NIL;
    SubLObject cdolist_list_var = v_bindings;
    SubLObject cur_binding = NIL;
    cur_binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject confirmedP2 = T;
      SubLObject cdolist_list_var_$1 = goals;
      SubLObject cur_lit2 = NIL;
      cur_lit2 = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        if( NIL == cycl_utilities.negatedP( cur_lit2 ) )
        {
          final SubLObject pred2 = el_utilities.literal_predicate( cur_lit2, UNPROVIDED );
          final SubLObject neg_matches2 = methods.funcall_instance_method_with_1_args( world_state, $sym62$NEGATIVE_MATCHES_TO_PREDICATE, pred2 );
          if( NIL != subl_promotions.memberP( shop_datastructures.shop_apply_substitution( cur_lit2, cur_binding ), neg_matches2, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
          {
            confirmedP2 = NIL;
          }
        }
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        cur_lit2 = cdolist_list_var_$1.first();
      }
      if( NIL != confirmedP2 )
      {
        new_bindings = ConsesLow.cons( cur_binding, new_bindings );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cur_binding = cdolist_list_var.first();
    }
    return new_bindings;
  }

  public static SubLObject declare_shop_basic_world_state_file()
  {
    SubLFiles.declareFunction( me, "shop_world_state_p", "SHOP-WORLD-STATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_world_state_var_manager", "GET-SHOP-BASIC-WORLD-STATE-VAR-MANAGER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_world_state_var_manager", "SET-SHOP-BASIC-WORLD-STATE-VAR-MANAGER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_world_state_negative_literals", "GET-SHOP-BASIC-WORLD-STATE-NEGATIVE-LITERALS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_world_state_negative_literals", "SET-SHOP-BASIC-WORLD-STATE-NEGATIVE-LITERALS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_shop_basic_world_state_positive_literals", "GET-SHOP-BASIC-WORLD-STATE-POSITIVE-LITERALS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_shop_basic_world_state_positive_literals", "SET-SHOP-BASIC-WORLD-STATE-POSITIVE-LITERALS", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_world_state_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-WORLD-STATE-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_shop_basic_world_state_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-WORLD-STATE-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_world_state_p", "SHOP-BASIC-WORLD-STATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_world_state_initialize_method", "SHOP-BASIC-WORLD-STATE-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_world_state_same_state_p_method", "SHOP-BASIC-WORLD-STATE-SAME-STATE-P-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_world_state_add_atom_method", "SHOP-BASIC-WORLD-STATE-ADD-ATOM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_world_state_delete_atom_method", "SHOP-BASIC-WORLD-STATE-DELETE-ATOM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_world_state_add_literal_method", "SHOP-BASIC-WORLD-STATE-ADD-LITERAL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_world_state_delete_literal_method", "SHOP-BASIC-WORLD-STATE-DELETE-LITERAL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_world_state_add_literals_method", "SHOP-BASIC-WORLD-STATE-ADD-LITERALS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_world_state_delete_literals_method", "SHOP-BASIC-WORLD-STATE-DELETE-LITERALS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_world_state_copy_state_method", "SHOP-BASIC-WORLD-STATE-COPY-STATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_world_state_next_state_method", "SHOP-BASIC-WORLD-STATE-NEXT-STATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_world_state_positive_matches_to_predicate_method", "SHOP-BASIC-WORLD-STATE-POSITIVE-MATCHES-TO-PREDICATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_world_state_negative_matches_to_predicate_method", "SHOP-BASIC-WORLD-STATE-NEGATIVE-MATCHES-TO-PREDICATE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_world_state_ask_ground_literal_method", "SHOP-BASIC-WORLD-STATE-ASK-GROUND-LITERAL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_world_state_ask_if_not_ground_literal_method", "SHOP-BASIC-WORLD-STATE-ASK-IF-NOT-GROUND-LITERAL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "shop_basic_world_state_ask_method", "SHOP-BASIC-WORLD-STATE-ASK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "confirm_bindings_against_world_state", "CONFIRM-BINDINGS-AGAINST-WORLD-STATE", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_shop_basic_world_state_file()
  {
    return NIL;
  }

  public static SubLObject setup_shop_basic_world_state_file()
  {
    interfaces.new_interface( $sym0$SHOP_WORLD_STATE, NIL, NIL, $list1 );
    classes.subloop_new_class( $sym2$SHOP_BASIC_WORLD_STATE, $sym3$OBJECT, $list4, NIL, $list5 );
    classes.class_set_implements_slot_listeners( $sym2$SHOP_BASIC_WORLD_STATE, NIL );
    classes.subloop_note_class_initialization_function( $sym2$SHOP_BASIC_WORLD_STATE, $sym10$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_WORLD_STATE_CLASS );
    classes.subloop_note_instance_initialization_function( $sym2$SHOP_BASIC_WORLD_STATE, $sym13$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_WORLD_STATE_INSTANCE );
    subloop_reserved_initialize_shop_basic_world_state_class( $sym2$SHOP_BASIC_WORLD_STATE );
    methods.methods_incorporate_instance_method( $sym14$INITIALIZE, $sym2$SHOP_BASIC_WORLD_STATE, $list15, NIL, $list16 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_WORLD_STATE, $sym14$INITIALIZE, $sym18$SHOP_BASIC_WORLD_STATE_INITIALIZE_METHOD );
    methods.methods_incorporate_class_method( $sym19$SAME_STATE_P, $sym2$SHOP_BASIC_WORLD_STATE, $list20, $list21, $list22 );
    methods.subloop_register_class_method( $sym2$SHOP_BASIC_WORLD_STATE, $sym19$SAME_STATE_P, $sym24$SHOP_BASIC_WORLD_STATE_SAME_STATE_P_METHOD );
    methods.methods_incorporate_instance_method( $sym25$ADD_ATOM, $sym2$SHOP_BASIC_WORLD_STATE, $list20, $list26, $list27 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_WORLD_STATE, $sym25$ADD_ATOM, $sym30$SHOP_BASIC_WORLD_STATE_ADD_ATOM_METHOD );
    methods.methods_incorporate_instance_method( $sym31$DELETE_ATOM, $sym2$SHOP_BASIC_WORLD_STATE, $list20, $list26, $list32 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_WORLD_STATE, $sym31$DELETE_ATOM, $sym35$SHOP_BASIC_WORLD_STATE_DELETE_ATOM_METHOD );
    methods.methods_incorporate_instance_method( $sym36$ADD_LITERAL, $sym2$SHOP_BASIC_WORLD_STATE, $list20, $list26, $list37 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_WORLD_STATE, $sym36$ADD_LITERAL, $sym38$SHOP_BASIC_WORLD_STATE_ADD_LITERAL_METHOD );
    methods.methods_incorporate_instance_method( $sym39$DELETE_LITERAL, $sym2$SHOP_BASIC_WORLD_STATE, $list20, $list26, $list40 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_WORLD_STATE, $sym39$DELETE_LITERAL, $sym41$SHOP_BASIC_WORLD_STATE_DELETE_LITERAL_METHOD );
    methods.methods_incorporate_instance_method( $sym42$ADD_LITERALS, $sym2$SHOP_BASIC_WORLD_STATE, $list20, $list43, $list44 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_WORLD_STATE, $sym42$ADD_LITERALS, $sym45$SHOP_BASIC_WORLD_STATE_ADD_LITERALS_METHOD );
    methods.methods_incorporate_instance_method( $sym46$DELETE_LITERALS, $sym2$SHOP_BASIC_WORLD_STATE, $list20, $list43, $list47 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_WORLD_STATE, $sym46$DELETE_LITERALS, $sym48$SHOP_BASIC_WORLD_STATE_DELETE_LITERALS_METHOD );
    methods.methods_incorporate_instance_method( $sym49$COPY_STATE, $sym2$SHOP_BASIC_WORLD_STATE, $list20, NIL, $list50 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_WORLD_STATE, $sym49$COPY_STATE, $sym52$SHOP_BASIC_WORLD_STATE_COPY_STATE_METHOD );
    methods.methods_incorporate_instance_method( $sym53$NEXT_STATE, $sym2$SHOP_BASIC_WORLD_STATE, $list20, NIL, $list54 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_WORLD_STATE, $sym53$NEXT_STATE, $sym55$SHOP_BASIC_WORLD_STATE_NEXT_STATE_METHOD );
    methods.methods_incorporate_instance_method( $sym56$POSITIVE_MATCHES_TO_PREDICATE, $sym2$SHOP_BASIC_WORLD_STATE, $list15, $list57, $list58 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_WORLD_STATE, $sym56$POSITIVE_MATCHES_TO_PREDICATE, $sym61$SHOP_BASIC_WORLD_STATE_POSITIVE_MATCHES_TO_PREDICATE_METHOD );
    methods.methods_incorporate_instance_method( $sym62$NEGATIVE_MATCHES_TO_PREDICATE, $sym2$SHOP_BASIC_WORLD_STATE, $list15, $list57, $list63 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_WORLD_STATE, $sym62$NEGATIVE_MATCHES_TO_PREDICATE, $sym65$SHOP_BASIC_WORLD_STATE_NEGATIVE_MATCHES_TO_PREDICATE_METHOD );
    methods.methods_incorporate_instance_method( $sym66$ASK_GROUND_LITERAL, $sym2$SHOP_BASIC_WORLD_STATE, $list20, $list26, $list67 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_WORLD_STATE, $sym66$ASK_GROUND_LITERAL, $sym69$SHOP_BASIC_WORLD_STATE_ASK_GROUND_LITERAL_METHOD );
    methods.methods_incorporate_instance_method( $sym70$ASK_IF_NOT_GROUND_LITERAL, $sym2$SHOP_BASIC_WORLD_STATE, $list20, $list26, $list71 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_WORLD_STATE, $sym70$ASK_IF_NOT_GROUND_LITERAL, $sym73$SHOP_BASIC_WORLD_STATE_ASK_IF_NOT_GROUND_LITERAL_METHOD );
    methods.methods_incorporate_instance_method( $sym74$ASK, $sym2$SHOP_BASIC_WORLD_STATE, $list20, $list26, $list75 );
    methods.subloop_register_instance_method( $sym2$SHOP_BASIC_WORLD_STATE, $sym74$ASK, $sym77$SHOP_BASIC_WORLD_STATE_ASK_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_shop_basic_world_state_file();
  }

  @Override
  public void initializeVariables()
  {
    init_shop_basic_world_state_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_shop_basic_world_state_file();
  }
  static
  {
    me = new shop_basic_world_state();
    $sym0$SHOP_WORLD_STATE = makeSymbol( "SHOP-WORLD-STATE" );
    $list1 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-LITERAL" ), ConsesLow.list( makeSymbol( "LITERAL" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
        makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DELETE-LITERAL" ), ConsesLow.list( makeSymbol( "LITERAL" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "ADD-LITERALS" ), ConsesLow.list( makeSymbol( "LITERALS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DELETE-LITERALS" ), ConsesLow.list( makeSymbol(
                "LITERALS" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ADD-ATOM" ), ConsesLow.list( makeSymbol( "ATOM" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list(
                    makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "DELETE-ATOM" ), ConsesLow.list( makeSymbol( "ATOM" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                        "COPY-STATE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NEXT-STATE" ), NIL, makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                            "DEF-CLASS-METHOD" ), makeSymbol( "SAME-STATE-P" ), ConsesLow.list( makeSymbol( "STATE1" ), makeSymbol( "STATE2" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
                                "DEF-INSTANCE-METHOD" ), makeSymbol( "ASK" ), ConsesLow.list( makeSymbol( "LITERAL" ) ), makeKeyword( "PUBLIC" ) )
    } );
    $sym2$SHOP_BASIC_WORLD_STATE = makeSymbol( "SHOP-BASIC-WORLD-STATE" );
    $sym3$OBJECT = makeSymbol( "OBJECT" );
    $list4 = ConsesLow.list( makeSymbol( "SHOP-WORLD-STATE" ) );
    $list5 = ConsesLow.list( ConsesLow.list( makeSymbol( "POSITIVE-LITERALS" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "NEGATIVE-LITERALS" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "VAR-MANAGER" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "ASK-GROUND-LITERAL" ), ConsesLow.list( makeSymbol( "LITERAL" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ASK-IF-NOT-GROUND-LITERAL" ), ConsesLow.list(
                makeSymbol( "LITERAL" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "POSITIVE-MATCHES-TO-PREDICATE" ), ConsesLow.list( makeSymbol( "PRED" ) ),
                    makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "NEGATIVE-MATCHES-TO-PREDICATE" ), ConsesLow.list( makeSymbol( "PRED" ) ), makeKeyword( "PROTECTED" ) ),
        ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ASK-WITH-MULTIBINDING" ), ConsesLow.list( makeSymbol( "LITERAL" ), makeSymbol( "MBINDING" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym6$VAR_MANAGER = makeSymbol( "VAR-MANAGER" );
    $sym7$NEGATIVE_LITERALS = makeSymbol( "NEGATIVE-LITERALS" );
    $sym8$POSITIVE_LITERALS = makeSymbol( "POSITIVE-LITERALS" );
    $sym9$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym10$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_WORLD_STATE_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-WORLD-STATE-CLASS" );
    $sym11$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym12$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym13$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_WORLD_STATE_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-WORLD-STATE-INSTANCE" );
    $sym14$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list15 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list16 = ConsesLow.list( ConsesLow.list( makeSymbol( "INITIALIZE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "POSITIVE-LITERALS" ), ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ),
        ConsesLow.list( makeSymbol( "FUNCTION" ), EQ ), TEN_INTEGER ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "NEGATIVE-LITERALS" ), ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ), ConsesLow.list(
            makeSymbol( "FUNCTION" ), EQ ), TEN_INTEGER ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym17$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-WORLD-STATE-METHOD" );
    $sym18$SHOP_BASIC_WORLD_STATE_INITIALIZE_METHOD = makeSymbol( "SHOP-BASIC-WORLD-STATE-INITIALIZE-METHOD" );
    $sym19$SAME_STATE_P = makeSymbol( "SAME-STATE-P" );
    $list20 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list21 = ConsesLow.list( makeSymbol( "STATE1" ), makeSymbol( "STATE2" ) );
    $list22 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "POS-LITS2" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "STATE2" ), ConsesLow.list( makeSymbol(
        "QUOTE" ), makeSymbol( "POSITIVE-LITERALS" ) ) ) ), ConsesLow.list( makeSymbol( "NEG-LITS2" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "STATE2" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
            "NEGATIVE-LITERALS" ) ) ) ), ConsesLow.list( makeSymbol( "ANSWER" ), T ), ConsesLow.list( makeSymbol( "DONE?" ), NIL ) ), ConsesLow.list( makeSymbol( "DO-DICTIONARY" ), ConsesLow.list( makeSymbol( "KEY" ),
                makeSymbol( "VALUE1" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "STATE1" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "POSITIVE-LITERALS" ) ) ), makeSymbol( "DONE?" ) ), ConsesLow
                    .list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "VALUE2" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol( "KEY" ), makeSymbol( "POS-LITS2" ) ) ) ), ConsesLow
                        .list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "SUBSETP" ), makeSymbol( "VALUE1" ), makeSymbol( "VALUE2" ) ), ConsesLow.list( makeSymbol(
                            "SUBSETP" ), makeSymbol( "VALUE2" ), makeSymbol( "VALUE1" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DONE?" ), T ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                                "ANSWER" ), NIL ) ) ) ), ConsesLow.list( makeSymbol( "DO-DICTIONARY" ), ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VALUE1" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol(
                                    "STATE1" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEGATIVE-LITERALS" ) ) ), makeSymbol( "DONE?" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list(
                                        makeSymbol( "VALUE2" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol( "KEY" ), makeSymbol( "NEG-LITS2" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow
                                            .list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "SUBSETP" ), makeSymbol( "VALUE1" ), makeSymbol( "VALUE2" ) ), ConsesLow.list( makeSymbol( "SUBSETP" ), makeSymbol(
                                                "VALUE2" ), makeSymbol( "VALUE1" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DONE?" ), T ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "ANSWER" ),
                                                    NIL ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "ANSWER" ) ) ) );
    $sym23$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-WORLD-STATE-METHOD" );
    $sym24$SHOP_BASIC_WORLD_STATE_SAME_STATE_P_METHOD = makeSymbol( "SHOP-BASIC-WORLD-STATE-SAME-STATE-P-METHOD" );
    $sym25$ADD_ATOM = makeSymbol( "ADD-ATOM" );
    $list26 = ConsesLow.list( makeSymbol( "LITERAL" ) );
    $list27 = ConsesLow.list( makeString( "@param LITERAL consp\n   @return booleanp" ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "NEGATED?" ), makeSymbol(
        "LITERAL" ) ) ), makeString( "ADD-ATOM: ~s is negated.~%" ), makeSymbol( "LITERAL" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PRED" ), ConsesLow.list( makeSymbol(
            "LITERAL-PREDICATE" ), makeSymbol( "LITERAL" ) ) ), ConsesLow.list( makeSymbol( "NEGATED-LITS" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol( "NEGATIVE-LITERALS" ), makeSymbol(
                "PRED" ) ) ) ), ConsesLow.list( makeSymbol( "DICTIONARY-PUSHNEW" ), makeSymbol( "POSITIVE-LITERALS" ), makeSymbol( "PRED" ), makeSymbol( "LITERAL" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ),
            ConsesLow.list( makeSymbol( "DICTIONARY-ENTER" ), makeSymbol( "NEGATIVE-LITERALS" ), makeSymbol( "PRED" ), ConsesLow.list( makeSymbol( "REMOVE" ), makeSymbol( "LITERAL" ), makeSymbol( "NEGATED-LITS" ),
                ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) );
    $sym28$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-WORLD-STATE-METHOD" );
    $str29$ADD_ATOM___s_is_negated___ = makeString( "ADD-ATOM: ~s is negated.~%" );
    $sym30$SHOP_BASIC_WORLD_STATE_ADD_ATOM_METHOD = makeSymbol( "SHOP-BASIC-WORLD-STATE-ADD-ATOM-METHOD" );
    $sym31$DELETE_ATOM = makeSymbol( "DELETE-ATOM" );
    $list32 = ConsesLow.list( makeString( "@param LITERAL consp\n   @return booleanp" ), ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "CNOT" ), ConsesLow.list( makeSymbol( "NEGATED?" ), makeSymbol(
        "LITERAL" ) ) ), makeString( "DELETE-ATOM: ~s is negated.~%" ), makeSymbol( "LITERAL" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "PRED" ), ConsesLow.list( makeSymbol(
            "LITERAL-PREDICATE" ), makeSymbol( "LITERAL" ) ) ), ConsesLow.list( makeSymbol( "POSITIVE-LITS" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol( "POSITIVE-LITERALS" ), makeSymbol(
                "PRED" ) ) ) ), ConsesLow.list( makeSymbol( "DICTIONARY-PUSHNEW" ), makeSymbol( "NEGATIVE-LITERALS" ), makeSymbol( "PRED" ), makeSymbol( "LITERAL" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ),
            ConsesLow.list( makeSymbol( "DICTIONARY-ENTER" ), makeSymbol( "POSITIVE-LITERALS" ), makeSymbol( "PRED" ), ConsesLow.list( makeSymbol( "REMOVE" ), makeSymbol( "LITERAL" ), makeSymbol( "POSITIVE-LITS" ),
                ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), T ) );
    $sym33$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-WORLD-STATE-METHOD" );
    $str34$DELETE_ATOM___s_is_negated___ = makeString( "DELETE-ATOM: ~s is negated.~%" );
    $sym35$SHOP_BASIC_WORLD_STATE_DELETE_ATOM_METHOD = makeSymbol( "SHOP-BASIC-WORLD-STATE-DELETE-ATOM-METHOD" );
    $sym36$ADD_LITERAL = makeSymbol( "ADD-LITERAL" );
    $list37 = ConsesLow.list( makeString( "@param LITERAL listp" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "ADD-ATOM" ), makeSymbol( "SELF" ), makeSymbol( "LITERAL" ) ) ) );
    $sym38$SHOP_BASIC_WORLD_STATE_ADD_LITERAL_METHOD = makeSymbol( "SHOP-BASIC-WORLD-STATE-ADD-LITERAL-METHOD" );
    $sym39$DELETE_LITERAL = makeSymbol( "DELETE-LITERAL" );
    $list40 = ConsesLow.list( makeString( "@param LITERAL listp" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DELETE-ATOM" ), makeSymbol( "SELF" ), makeSymbol( "LITERAL" ) ) ) );
    $sym41$SHOP_BASIC_WORLD_STATE_DELETE_LITERAL_METHOD = makeSymbol( "SHOP-BASIC-WORLD-STATE-DELETE-LITERAL-METHOD" );
    $sym42$ADD_LITERALS = makeSymbol( "ADD-LITERALS" );
    $list43 = ConsesLow.list( makeSymbol( "LITERALS" ) );
    $list44 = ConsesLow.list( makeString( "@param LITERALS listp" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LIT" ), makeSymbol( "LITERALS" ) ), ConsesLow.list( makeSymbol( "ADD-ATOM" ),
        makeSymbol( "SELF" ), makeSymbol( "LIT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym45$SHOP_BASIC_WORLD_STATE_ADD_LITERALS_METHOD = makeSymbol( "SHOP-BASIC-WORLD-STATE-ADD-LITERALS-METHOD" );
    $sym46$DELETE_LITERALS = makeSymbol( "DELETE-LITERALS" );
    $list47 = ConsesLow.list( makeString( "@param LITERALS listp" ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "LIT" ), makeSymbol( "LITERALS" ) ), ConsesLow.list( makeSymbol( "DELETE-ATOM" ),
        makeSymbol( "SELF" ), makeSymbol( "LIT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $sym48$SHOP_BASIC_WORLD_STATE_DELETE_LITERALS_METHOD = makeSymbol( "SHOP-BASIC-WORLD-STATE-DELETE-LITERALS-METHOD" );
    $sym49$COPY_STATE = makeSymbol( "COPY-STATE" );
    $list50 = ConsesLow.list( makeString( "@return shop-basic-world-state-p" ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-STATE" ), ConsesLow.list( makeSymbol(
        "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "NEW" ), makeSymbol( "SHOP-BASIC-WORLD-STATE" ) ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "SHOP-BASIC-WORLD-STATE" ) ) ) ) ), ConsesLow.list( makeSymbol(
            "SET-SLOT" ), makeSymbol( "NEW-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "POSITIVE-LITERALS" ) ), ConsesLow.list( makeSymbol( "COPY-DICTIONARY" ), makeSymbol( "POSITIVE-LITERALS" ) ) ),
        ConsesLow.list( makeSymbol( "SET-SLOT" ), makeSymbol( "NEW-STATE" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "NEGATIVE-LITERALS" ) ), ConsesLow.list( makeSymbol( "COPY-DICTIONARY" ), makeSymbol(
            "NEGATIVE-LITERALS" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "NEW-STATE" ) ) ) );
    $sym51$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-WORLD-STATE-METHOD" );
    $sym52$SHOP_BASIC_WORLD_STATE_COPY_STATE_METHOD = makeSymbol( "SHOP-BASIC-WORLD-STATE-COPY-STATE-METHOD" );
    $sym53$NEXT_STATE = makeSymbol( "NEXT-STATE" );
    $list54 = ConsesLow.list( makeString( "@return shop-basic-world-state-p" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "INLINE-METHOD" ), ConsesLow.list( makeSymbol( "COPY-STATE" ), makeSymbol(
        "SHOP-BASIC-WORLD-STATE" ) ), makeSymbol( "SELF" ) ) ) );
    $sym55$SHOP_BASIC_WORLD_STATE_NEXT_STATE_METHOD = makeSymbol( "SHOP-BASIC-WORLD-STATE-NEXT-STATE-METHOD" );
    $sym56$POSITIVE_MATCHES_TO_PREDICATE = makeSymbol( "POSITIVE-MATCHES-TO-PREDICATE" );
    $list57 = ConsesLow.list( makeSymbol( "PRED" ) );
    $list58 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "APPLY" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "CCONCATENATE" ) ), ConsesLow.list( makeSymbol(
        "APPLY-MB" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol( "POSITIVE-LITERALS" ), makeSymbol( "PRED" ) ), makeSymbol( "*SHOP-ASK-MULTIBINDING*" ) ) ) ) );
    $sym59$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-WORLD-STATE-METHOD" );
    $sym60$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $sym61$SHOP_BASIC_WORLD_STATE_POSITIVE_MATCHES_TO_PREDICATE_METHOD = makeSymbol( "SHOP-BASIC-WORLD-STATE-POSITIVE-MATCHES-TO-PREDICATE-METHOD" );
    $sym62$NEGATIVE_MATCHES_TO_PREDICATE = makeSymbol( "NEGATIVE-MATCHES-TO-PREDICATE" );
    $list63 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "APPLY" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "CCONCATENATE" ) ), ConsesLow.list( makeSymbol(
        "APPLY-MB" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol( "NEGATIVE-LITERALS" ), makeSymbol( "PRED" ) ), makeSymbol( "*SHOP-ASK-MULTIBINDING*" ) ) ) ) );
    $sym64$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SHOP-BASIC-WORLD-STATE-METHOD" );
    $sym65$SHOP_BASIC_WORLD_STATE_NEGATIVE_MATCHES_TO_PREDICATE_METHOD = makeSymbol( "SHOP-BASIC-WORLD-STATE-NEGATIVE-MATCHES-TO-PREDICATE-METHOD" );
    $sym66$ASK_GROUND_LITERAL = makeSymbol( "ASK-GROUND-LITERAL" );
    $list67 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "GROUND?" ), makeSymbol( "LITERAL" ) ), makeString( "ask-ground-literal: ~s is not ground.~%" ), makeSymbol( "LITERAL" ) ),
        ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeSymbol( "LITERAL" ), ConsesLow.list( makeSymbol( "POSITIVE-MATCHES-TO-PREDICATE" ), makeSymbol( "SELF" ), ConsesLow.list(
            makeSymbol( "LITERAL-PREDICATE" ), makeSymbol( "LITERAL" ) ) ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ) ) );
    $str68$ask_ground_literal___s_is_not_gro = makeString( "ask-ground-literal: ~s is not ground.~%" );
    $sym69$SHOP_BASIC_WORLD_STATE_ASK_GROUND_LITERAL_METHOD = makeSymbol( "SHOP-BASIC-WORLD-STATE-ASK-GROUND-LITERAL-METHOD" );
    $sym70$ASK_IF_NOT_GROUND_LITERAL = makeSymbol( "ASK-IF-NOT-GROUND-LITERAL" );
    $list71 = ConsesLow.list( ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "GROUND?" ), makeSymbol( "LITERAL" ) ), makeString( "ask-if-not-ground-literal: ~s is not ground.~%" ), makeSymbol(
        "LITERAL" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "MEMBER" ), makeSymbol( "LITERAL" ), ConsesLow.list( makeSymbol( "NEGATIVE-MATCHES-TO-PREDICATE" ), makeSymbol( "SELF" ), ConsesLow
            .list( makeSymbol( "LITERAL-PREDICATE" ), makeSymbol( "LITERAL" ) ) ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ) ) );
    $str72$ask_if_not_ground_literal___s_is_ = makeString( "ask-if-not-ground-literal: ~s is not ground.~%" );
    $sym73$SHOP_BASIC_WORLD_STATE_ASK_IF_NOT_GROUND_LITERAL_METHOD = makeSymbol( "SHOP-BASIC-WORLD-STATE-ASK-IF-NOT-GROUND-LITERAL-METHOD" );
    $sym74$ASK = makeSymbol( "ASK" );
    $list75 = ConsesLow.list( makeString( "@param LITERAL consp\n   @param MBINDING multibinding-p\n   @return binding-list-p" ), ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "GROUND?" ),
        makeSymbol( "LITERAL" ) ), ConsesLow.list( makeSymbol( "PIF" ), ConsesLow.list( makeSymbol( "ASK-GROUND-LITERAL" ), makeSymbol( "SELF" ), makeSymbol( "LITERAL" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow
            .list( makeSymbol( "QUOTE" ), ConsesLow.list( ConsesLow.list( ConsesLow.cons( T, T ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), NIL ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow
                .list( makeSymbol( "PRED" ), ConsesLow.list( makeSymbol( "LITERAL-PREDICATE" ), makeSymbol( "LITERAL" ) ) ), ConsesLow.list( makeSymbol( "POSITIVE-MATCHES" ), ConsesLow.list( makeSymbol(
                    "POSITIVE-MATCHES-TO-PREDICATE" ), makeSymbol( "SELF" ), makeSymbol( "PRED" ) ) ), ConsesLow.list( makeSymbol( "BINDINGS" ), NIL ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
                        makeSymbol( "CUR-LIT" ), makeSymbol( "POSITIVE-MATCHES" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "MGU" ), ConsesLow.list( makeSymbol( "TERM-UNIFY" ),
                            makeSymbol( "LITERAL" ), makeSymbol( "CUR-LIT" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "MGU" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "MGU" ), makeSymbol(
                                "BINDINGS" ) ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "BINDINGS" ) ) ) );
    $list76 = ConsesLow.list( ConsesLow.list( ConsesLow.cons( T, T ) ) );
    $sym77$SHOP_BASIC_WORLD_STATE_ASK_METHOD = makeSymbol( "SHOP-BASIC-WORLD-STATE-ASK-METHOD" );
  }
}
/*
 * 
 * Total time: 315 ms
 * 
 */