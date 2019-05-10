package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
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

public final class inverted_indexes_concrete
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inverted_indexes_concrete";
  public static final String myFingerPrint = "7d215c0194c0f1ca3bf246c196dc4cb32a69c14ecfbd4d8926528c7a5f7fb487";
  private static final SubLSymbol $sym0$CYCL_AND_GEN_INDEX;
  private static final SubLSymbol $sym1$INVERTED_INDEX;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$OBJECT;
  private static final SubLSymbol $sym4$INSTANCE_COUNT;
  private static final SubLSymbol $sym5$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_CLASS;
  private static final SubLSymbol $sym6$ISOLATED_P;
  private static final SubLSymbol $sym7$INSTANCE_NUMBER;
  private static final SubLSymbol $sym8$PHYSICAL_INDEX;
  private static final SubLSymbol $sym9$INDEX_ENTRY_COMPUTER;
  private static final SubLSymbol $sym10$VALUE_TEST;
  private static final SubLSymbol $sym11$INDEXED_ITEMS;
  private static final SubLSymbol $sym12$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_INSTANCE;
  private static final SubLSymbol $sym13$INITIALIZE;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD;
  private static final SubLSymbol $sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER;
  private static final SubLSymbol $sym18$SET_INDEX;
  private static final SubLSymbol $sym19$IN_MEMORY_EQUALP_INDEX;
  private static final SubLSymbol $sym20$CYCL_AND_GEN_INDEX_INITIALIZE_METHOD;
  private static final SubLSymbol $sym21$LOOKUP;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD;
  private static final SubLSymbol $sym26$CYCL_AND_GEN_INDEX_LOOKUP_METHOD;
  private static final SubLSymbol $sym27$REMOVE_KEY;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD;
  private static final SubLSymbol $sym31$COMPUTE_INDEX_ENTRIES;
  private static final SubLSymbol $sym32$REMOVE_VALUE;
  private static final SubLSymbol $sym33$CYCL_AND_GEN_INDEX_REMOVE_KEY_METHOD;
  private static final SubLList $list34;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD;
  private static final SubLSymbol $sym37$REMOVE;
  private static final SubLSymbol $sym38$CYCL_AND_GEN_INDEX_REMOVE_VALUE_METHOD;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$PARENT_INDEX;
  private static final SubLSymbol $sym41$GENERATION_DOMAIN_MT;
  private static final SubLSymbol $sym42$GENERATION_MT;
  private static final SubLSymbol $sym43$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_CLA;
  private static final SubLSymbol $sym44$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_INS;
  private static final SubLList $list45;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD;
  private static final SubLSymbol $sym48$INVERTED_INDEX_P;
  private static final SubLSymbol $sym49$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_INDEX_METHOD;
  private static final SubLSymbol $sym50$SET_GENERATION_MT;
  private static final SubLList $list51;
  private static final SubLList $list52;
  private static final SubLSymbol $sym53$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD;
  private static final SubLSymbol $sym54$HLMT_P;
  private static final SubLSymbol $sym55$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_GENERATION_MT_METHOD;
  private static final SubLSymbol $sym56$SET_GENERATION_DOMAIN_MT;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD;
  private static final SubLSymbol $sym59$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_GENERATION_DOMAIN_MT_METHOD;
  private static final SubLList $list60;
  private static final SubLList $list61;
  private static final SubLSymbol $sym62$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD;
  private static final SubLSymbol $sym63$FORT_P;
  private static final SubLSymbol $sym64$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIES_METHOD;
  private static final SubLString $str65$Inverted_Index_Test_Suite;
  private static final SubLList $list66;
  private static final SubLList $list67;

  @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
  public static SubLObject subloop_reserved_initialize_cycl_and_gen_index_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym4$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
  public static SubLObject subloop_reserved_initialize_cycl_and_gen_index_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym6$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym7$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$INVERTED_INDEX, $sym8$PHYSICAL_INDEX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$INVERTED_INDEX, $sym9$INDEX_ENTRY_COMPUTER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$INVERTED_INDEX, $sym10$VALUE_TEST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$INVERTED_INDEX, $sym11$INDEXED_ITEMS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
  public static SubLObject cycl_and_gen_index_p(final SubLObject cycl_and_gen_index)
  {
    return classes.subloop_instanceof_class( cycl_and_gen_index, $sym0$CYCL_AND_GEN_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
  public static SubLObject cycl_and_gen_index_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cycl_and_gen_index_method = NIL;
    SubLObject indexed_items = inverted_index.get_inverted_index_indexed_items( self );
    SubLObject value_test = inverted_index.get_inverted_index_value_test( self );
    SubLObject index_entry_computer = inverted_index.get_inverted_index_index_entry_computer( self );
    SubLObject physical_index = inverted_index.get_inverted_index_physical_index( self );
    try
    {
      thread.throwStack.push( $sym16$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD );
      try
      {
        value_test = Symbols.symbol_function( EQUALP );
        indexed_items = inverted_index.new_indexed_items();
        index_entry_computer = object.new_class_instance( $sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER );
        methods.funcall_instance_method_with_1_args( index_entry_computer, $sym18$SET_INDEX, self );
        physical_index = object.new_class_instance( $sym19$IN_MEMORY_EQUALP_INDEX );
        Dynamic.sublisp_throw( $sym16$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          inverted_index.set_inverted_index_indexed_items( self, indexed_items );
          inverted_index.set_inverted_index_value_test( self, value_test );
          inverted_index.set_inverted_index_index_entry_computer( self, index_entry_computer );
          inverted_index.set_inverted_index_physical_index( self, physical_index );
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
      catch_var_for_cycl_and_gen_index_method = Errors.handleThrowable( ccatch_env_var, $sym16$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cycl_and_gen_index_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
  public static SubLObject cycl_and_gen_index_lookup_method(final SubLObject self, final SubLObject key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cycl_and_gen_index_method = NIL;
    final SubLObject indexed_items = inverted_index.get_inverted_index_indexed_items( self );
    final SubLObject physical_index = inverted_index.get_inverted_index_physical_index( self );
    try
    {
      thread.throwStack.push( $sym25$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD );
      try
      {
        final SubLObject suids = methods.funcall_instance_method_with_1_args( physical_index, $sym21$LOOKUP, key );
        SubLObject result = NIL;
        SubLObject cdolist_list_var = suids;
        SubLObject suid = NIL;
        suid = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject item = inverted_index.get_item_from_index_suid( indexed_items, suid );
          if( NIL != item )
          {
            result = ConsesLow.cons( item, result );
          }
          cdolist_list_var = cdolist_list_var.rest();
          suid = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym25$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD, Sequences.nreverse( result ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          inverted_index.set_inverted_index_indexed_items( self, indexed_items );
          inverted_index.set_inverted_index_physical_index( self, physical_index );
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
      catch_var_for_cycl_and_gen_index_method = Errors.handleThrowable( ccatch_env_var, $sym25$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cycl_and_gen_index_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
  public static SubLObject cycl_and_gen_index_remove_key_method(final SubLObject self, final SubLObject index_key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cycl_and_gen_index_method = NIL;
    final SubLObject index_entry_computer = inverted_index.get_inverted_index_index_entry_computer( self );
    try
    {
      thread.throwStack.push( $sym30$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD );
      try
      {
        SubLObject cdolist_list_var;
        final SubLObject entries = cdolist_list_var = methods.funcall_instance_method_with_1_args( index_entry_computer, $sym31$COMPUTE_INDEX_ENTRIES, index_key );
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          methods.funcall_instance_method_with_1_args( self, $sym32$REMOVE_VALUE, entry );
          cdolist_list_var = cdolist_list_var.rest();
          entry = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym30$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          inverted_index.set_inverted_index_index_entry_computer( self, index_entry_computer );
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
      catch_var_for_cycl_and_gen_index_method = Errors.handleThrowable( ccatch_env_var, $sym30$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cycl_and_gen_index_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
  public static SubLObject cycl_and_gen_index_remove_value_method(final SubLObject self, final SubLObject index_entry)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cycl_and_gen_index_method = NIL;
    final SubLObject physical_index = inverted_index.get_inverted_index_physical_index( self );
    try
    {
      thread.throwStack.push( $sym36$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD );
      try
      {
        methods.funcall_instance_method_with_1_args( physical_index, $sym37$REMOVE, index_entry );
        Dynamic.sublisp_throw( $sym36$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          inverted_index.set_inverted_index_physical_index( self, physical_index );
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
      catch_var_for_cycl_and_gen_index_method = Errors.handleThrowable( ccatch_env_var, $sym36$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cycl_and_gen_index_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
  public static SubLObject get_cycl_and_gen_index_entry_computer_parent_index(final SubLObject cycl_and_gen_index_entry_computer)
  {
    return classes.subloop_get_access_protected_instance_slot( cycl_and_gen_index_entry_computer, THREE_INTEGER, $sym40$PARENT_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
  public static SubLObject set_cycl_and_gen_index_entry_computer_parent_index(final SubLObject cycl_and_gen_index_entry_computer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( cycl_and_gen_index_entry_computer, value, THREE_INTEGER, $sym40$PARENT_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
  public static SubLObject get_cycl_and_gen_index_entry_computer_generation_domain_mt(final SubLObject cycl_and_gen_index_entry_computer)
  {
    return classes.subloop_get_access_protected_instance_slot( cycl_and_gen_index_entry_computer, TWO_INTEGER, $sym41$GENERATION_DOMAIN_MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
  public static SubLObject set_cycl_and_gen_index_entry_computer_generation_domain_mt(final SubLObject cycl_and_gen_index_entry_computer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( cycl_and_gen_index_entry_computer, value, TWO_INTEGER, $sym41$GENERATION_DOMAIN_MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
  public static SubLObject get_cycl_and_gen_index_entry_computer_generation_mt(final SubLObject cycl_and_gen_index_entry_computer)
  {
    return classes.subloop_get_access_protected_instance_slot( cycl_and_gen_index_entry_computer, ONE_INTEGER, $sym42$GENERATION_MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
  public static SubLObject set_cycl_and_gen_index_entry_computer_generation_mt(final SubLObject cycl_and_gen_index_entry_computer, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( cycl_and_gen_index_entry_computer, value, ONE_INTEGER, $sym42$GENERATION_MT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
  public static SubLObject subloop_reserved_initialize_cycl_and_gen_index_entry_computer_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym4$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
  public static SubLObject subloop_reserved_initialize_cycl_and_gen_index_entry_computer_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym6$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym3$OBJECT, $sym7$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $sym42$GENERATION_MT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $sym41$GENERATION_DOMAIN_MT, NIL );
    classes.subloop_initialize_slot( new_instance, $sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $sym40$PARENT_INDEX, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
  public static SubLObject cycl_and_gen_index_entry_computer_p(final SubLObject cycl_and_gen_index_entry_computer)
  {
    return classes.subloop_instanceof_class( cycl_and_gen_index_entry_computer, $sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
  public static SubLObject cycl_and_gen_index_entry_computer_set_index_method(final SubLObject self, final SubLObject v_inverted_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cycl_and_gen_index_entry_computer_method = NIL;
    SubLObject parent_index = get_cycl_and_gen_index_entry_computer_parent_index( self );
    try
    {
      thread.throwStack.push( $sym47$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD );
      try
      {
        assert NIL != inverted_index.inverted_index_p( v_inverted_index ) : v_inverted_index;
        parent_index = v_inverted_index;
        Dynamic.sublisp_throw( $sym47$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cycl_and_gen_index_entry_computer_parent_index( self, parent_index );
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
      catch_var_for_cycl_and_gen_index_entry_computer_method = Errors.handleThrowable( ccatch_env_var, $sym47$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cycl_and_gen_index_entry_computer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
  public static SubLObject cycl_and_gen_index_entry_computer_set_generation_mt_method(final SubLObject self, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cycl_and_gen_index_entry_computer_method = NIL;
    SubLObject generation_mt = get_cycl_and_gen_index_entry_computer_generation_mt( self );
    try
    {
      thread.throwStack.push( $sym53$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD );
      try
      {
        assert NIL != hlmt.hlmt_p( mt ) : mt;
        generation_mt = mt;
        Dynamic.sublisp_throw( $sym53$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cycl_and_gen_index_entry_computer_generation_mt( self, generation_mt );
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
      catch_var_for_cycl_and_gen_index_entry_computer_method = Errors.handleThrowable( ccatch_env_var, $sym53$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cycl_and_gen_index_entry_computer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
  public static SubLObject cycl_and_gen_index_entry_computer_set_generation_domain_mt_method(final SubLObject self, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cycl_and_gen_index_entry_computer_method = NIL;
    SubLObject generation_domain_mt = get_cycl_and_gen_index_entry_computer_generation_domain_mt( self );
    try
    {
      thread.throwStack.push( $sym58$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD );
      try
      {
        assert NIL != hlmt.hlmt_p( mt ) : mt;
        generation_domain_mt = mt;
        Dynamic.sublisp_throw( $sym58$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cycl_and_gen_index_entry_computer_generation_domain_mt( self, generation_domain_mt );
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
      catch_var_for_cycl_and_gen_index_entry_computer_method = Errors.handleThrowable( ccatch_env_var, $sym58$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cycl_and_gen_index_entry_computer_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-indexes-concrete.lisp", position = 1330L)
  public static SubLObject cycl_and_gen_index_entry_computer_compute_index_entries_method(final SubLObject self, final SubLObject cycl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_cycl_and_gen_index_entry_computer_method = NIL;
    final SubLObject parent_index = get_cycl_and_gen_index_entry_computer_parent_index( self );
    try
    {
      thread.throwStack.push( $sym62$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD );
      try
      {
        final SubLObject indexed_items = instances.get_slot( parent_index, $sym11$INDEXED_ITEMS );
        final SubLObject my_index = inverted_index.maybe_add_new_indexed_item( indexed_items, cycl );
        SubLObject result = NIL;
        SubLObject cdolist_list_var = cycl_utilities.expression_gather( cycl, $sym63$FORT_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject fort = NIL;
        fort = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          result = ConsesLow.cons( inverted_index.new_inverted_index_entry( fort, my_index ), result );
          cdolist_list_var = cdolist_list_var.rest();
          fort = cdolist_list_var.first();
        }
        cdolist_list_var = document.string_tokenize_via_wordify( pph_main.generate_phrase( cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          result = ConsesLow.cons( inverted_index.new_inverted_index_entry( word, my_index ), result );
          cdolist_list_var = cdolist_list_var.rest();
          word = cdolist_list_var.first();
        }
        cdolist_list_var = document.string_tokenize_via_wordify( pph_question.generate_question( cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        word = NIL;
        word = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          result = ConsesLow.cons( inverted_index.new_inverted_index_entry( word, my_index ), result );
          cdolist_list_var = cdolist_list_var.rest();
          word = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym62$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD, result );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_cycl_and_gen_index_entry_computer_parent_index( self, parent_index );
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
      catch_var_for_cycl_and_gen_index_entry_computer_method = Errors.handleThrowable( ccatch_env_var, $sym62$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_cycl_and_gen_index_entry_computer_method;
  }

  public static SubLObject declare_inverted_indexes_concrete_file()
  {
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cycl_and_gen_index_class", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cycl_and_gen_index_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_and_gen_index_p", "CYCL-AND-GEN-INDEX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_and_gen_index_initialize_method", "CYCL-AND-GEN-INDEX-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_and_gen_index_lookup_method", "CYCL-AND-GEN-INDEX-LOOKUP-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cycl_and_gen_index_remove_key_method", "CYCL-AND-GEN-INDEX-REMOVE-KEY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cycl_and_gen_index_remove_value_method", "CYCL-AND-GEN-INDEX-REMOVE-VALUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cycl_and_gen_index_entry_computer_parent_index", "GET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-PARENT-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cycl_and_gen_index_entry_computer_parent_index", "SET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-PARENT-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cycl_and_gen_index_entry_computer_generation_domain_mt", "GET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-DOMAIN-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cycl_and_gen_index_entry_computer_generation_domain_mt", "SET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-DOMAIN-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_cycl_and_gen_index_entry_computer_generation_mt", "GET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cycl_and_gen_index_entry_computer_generation_mt", "SET-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-GENERATION-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cycl_and_gen_index_entry_computer_class", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_cycl_and_gen_index_entry_computer_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_and_gen_index_entry_computer_p", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_and_gen_index_entry_computer_set_index_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-INDEX-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cycl_and_gen_index_entry_computer_set_generation_mt_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-GENERATION-MT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cycl_and_gen_index_entry_computer_set_generation_domain_mt_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-GENERATION-DOMAIN-MT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cycl_and_gen_index_entry_computer_compute_index_entries_method", "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-COMPUTE-INDEX-ENTRIES-METHOD", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_inverted_indexes_concrete_file()
  {
    return NIL;
  }

  public static SubLObject setup_inverted_indexes_concrete_file()
  {
    classes.subloop_new_class( $sym0$CYCL_AND_GEN_INDEX, $sym1$INVERTED_INDEX, NIL, NIL, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$CYCL_AND_GEN_INDEX, NIL );
    classes.subloop_note_class_initialization_function( $sym0$CYCL_AND_GEN_INDEX, $sym5$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$CYCL_AND_GEN_INDEX, $sym12$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_INSTANCE );
    subloop_reserved_initialize_cycl_and_gen_index_class( $sym0$CYCL_AND_GEN_INDEX );
    methods.methods_incorporate_instance_method( $sym13$INITIALIZE, $sym0$CYCL_AND_GEN_INDEX, $list14, NIL, $list15 );
    methods.subloop_register_instance_method( $sym0$CYCL_AND_GEN_INDEX, $sym13$INITIALIZE, $sym20$CYCL_AND_GEN_INDEX_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym21$LOOKUP, $sym0$CYCL_AND_GEN_INDEX, $list22, $list23, $list24 );
    methods.subloop_register_instance_method( $sym0$CYCL_AND_GEN_INDEX, $sym21$LOOKUP, $sym26$CYCL_AND_GEN_INDEX_LOOKUP_METHOD );
    methods.methods_incorporate_instance_method( $sym27$REMOVE_KEY, $sym0$CYCL_AND_GEN_INDEX, $list22, $list28, $list29 );
    methods.subloop_register_instance_method( $sym0$CYCL_AND_GEN_INDEX, $sym27$REMOVE_KEY, $sym33$CYCL_AND_GEN_INDEX_REMOVE_KEY_METHOD );
    methods.methods_incorporate_instance_method( $sym32$REMOVE_VALUE, $sym0$CYCL_AND_GEN_INDEX, $list22, $list34, $list35 );
    methods.subloop_register_instance_method( $sym0$CYCL_AND_GEN_INDEX, $sym32$REMOVE_VALUE, $sym38$CYCL_AND_GEN_INDEX_REMOVE_VALUE_METHOD );
    classes.subloop_new_class( $sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $sym9$INDEX_ENTRY_COMPUTER, NIL, NIL, $list39 );
    classes.class_set_implements_slot_listeners( $sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, NIL );
    classes.subloop_note_class_initialization_function( $sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $sym43$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_CLA );
    classes.subloop_note_instance_initialization_function( $sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $sym44$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_INS );
    subloop_reserved_initialize_cycl_and_gen_index_entry_computer_class( $sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER );
    methods.methods_incorporate_instance_method( $sym18$SET_INDEX, $sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $list14, $list45, $list46 );
    methods.subloop_register_instance_method( $sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $sym18$SET_INDEX, $sym49$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_INDEX_METHOD );
    methods.methods_incorporate_instance_method( $sym50$SET_GENERATION_MT, $sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $list14, $list51, $list52 );
    methods.subloop_register_instance_method( $sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $sym50$SET_GENERATION_MT, $sym55$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_GENERATION_MT_METHOD );
    methods.methods_incorporate_instance_method( $sym56$SET_GENERATION_DOMAIN_MT, $sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $list14, $list51, $list57 );
    methods.subloop_register_instance_method( $sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $sym56$SET_GENERATION_DOMAIN_MT, $sym59$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_GENERATION_DOMAIN_MT_METHOD );
    methods.methods_incorporate_instance_method( $sym31$COMPUTE_INDEX_ENTRIES, $sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $list14, $list60, $list61 );
    methods.subloop_register_instance_method( $sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER, $sym31$COMPUTE_INDEX_ENTRIES, $sym64$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIES_METHOD );
    sunit_external.define_test_suite( $str65$Inverted_Index_Test_Suite, NIL, $list66, $list67 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inverted_indexes_concrete_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inverted_indexes_concrete_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inverted_indexes_concrete_file();
  }
  static
  {
    me = new inverted_indexes_concrete();
    $sym0$CYCL_AND_GEN_INDEX = makeSymbol( "CYCL-AND-GEN-INDEX" );
    $sym1$INVERTED_INDEX = makeSymbol( "INVERTED-INDEX" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ) );
    $sym3$OBJECT = makeSymbol( "OBJECT" );
    $sym4$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym5$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-CLASS" );
    $sym6$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym7$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym8$PHYSICAL_INDEX = makeSymbol( "PHYSICAL-INDEX" );
    $sym9$INDEX_ENTRY_COMPUTER = makeSymbol( "INDEX-ENTRY-COMPUTER" );
    $sym10$VALUE_TEST = makeSymbol( "VALUE-TEST" );
    $sym11$INDEXED_ITEMS = makeSymbol( "INDEXED-ITEMS" );
    $sym12$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-INSTANCE" );
    $sym13$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list14 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list15 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "VALUE-TEST" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUALP ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INDEXED-ITEMS" ),
        ConsesLow.list( makeSymbol( "NEW-INDEXED-ITEMS" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INDEX-ENTRY-COMPUTER" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol(
            "QUOTE" ), makeSymbol( "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER" ) ) ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "INDEX-ENTRY-COMPUTER" ), ConsesLow.list( makeSymbol( "QUOTE" ),
                makeSymbol( "SET-INDEX" ) ), makeSymbol( "SELF" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PHYSICAL-INDEX" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow.list( makeSymbol(
                    "QUOTE" ), makeSymbol( "IN-MEMORY-EQUALP-INDEX" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym16$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-METHOD" );
    $sym17$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER = makeSymbol( "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER" );
    $sym18$SET_INDEX = makeSymbol( "SET-INDEX" );
    $sym19$IN_MEMORY_EQUALP_INDEX = makeSymbol( "IN-MEMORY-EQUALP-INDEX" );
    $sym20$CYCL_AND_GEN_INDEX_INITIALIZE_METHOD = makeSymbol( "CYCL-AND-GEN-INDEX-INITIALIZE-METHOD" );
    $sym21$LOOKUP = makeSymbol( "LOOKUP" );
    $list22 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list23 = ConsesLow.list( makeSymbol( "KEY" ) );
    $list24 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "SUIDS" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PHYSICAL-INDEX" ),
        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "LOOKUP" ) ), makeSymbol( "KEY" ) ) ), ConsesLow.list( makeSymbol( "RESULT" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "SUID" ),
            makeSymbol( "SUIDS" ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ITEM" ), ConsesLow.list( makeSymbol( "GET-ITEM-FROM-INDEX-SUID" ), makeSymbol( "INDEXED-ITEMS" ),
                makeSymbol( "SUID" ) ) ) ), ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "ITEM" ), ConsesLow.list( makeSymbol( "CPUSH" ), makeSymbol( "ITEM" ), makeSymbol( "RESULT" ) ) ) ) ), ConsesLow.list(
                    makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeSymbol( "RESULT" ) ) ) ) );
    $sym25$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-METHOD" );
    $sym26$CYCL_AND_GEN_INDEX_LOOKUP_METHOD = makeSymbol( "CYCL-AND-GEN-INDEX-LOOKUP-METHOD" );
    $sym27$REMOVE_KEY = makeSymbol( "REMOVE-KEY" );
    $list28 = ConsesLow.list( makeSymbol( "INDEX-KEY" ) );
    $list29 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ENTRIES" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "INDEX-ENTRY-COMPUTER" ),
        ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COMPUTE-INDEX-ENTRIES" ) ), makeSymbol( "INDEX-KEY" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "ENTRY" ), makeSymbol(
            "ENTRIES" ) ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "SELF" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "REMOVE-VALUE" ) ), makeSymbol( "ENTRY" ) ) ) ), ConsesLow
                .list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym30$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-METHOD" );
    $sym31$COMPUTE_INDEX_ENTRIES = makeSymbol( "COMPUTE-INDEX-ENTRIES" );
    $sym32$REMOVE_VALUE = makeSymbol( "REMOVE-VALUE" );
    $sym33$CYCL_AND_GEN_INDEX_REMOVE_KEY_METHOD = makeSymbol( "CYCL-AND-GEN-INDEX-REMOVE-KEY-METHOD" );
    $list34 = ConsesLow.list( makeSymbol( "INDEX-ENTRY" ) );
    $list35 = ConsesLow.list( ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PHYSICAL-INDEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "REMOVE" ) ), makeSymbol( "INDEX-ENTRY" ) ), ConsesLow.list(
        makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym36$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-METHOD" );
    $sym37$REMOVE = makeSymbol( "REMOVE" );
    $sym38$CYCL_AND_GEN_INDEX_REMOVE_VALUE_METHOD = makeSymbol( "CYCL-AND-GEN-INDEX-REMOVE-VALUE-METHOD" );
    $list39 = ConsesLow.list( ConsesLow.list( makeSymbol( "GENERATION-MT" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "GENERATION-DOMAIN-MT" ), makeKeyword( "INSTANCE" ),
        makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "PARENT-INDEX" ), makeKeyword( "INSTANCE" ), makeKeyword( "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
            "COMPUTE-INDEX-ENTRIES" ), ConsesLow.list( makeSymbol( "ITEM-TO-INDEX" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym40$PARENT_INDEX = makeSymbol( "PARENT-INDEX" );
    $sym41$GENERATION_DOMAIN_MT = makeSymbol( "GENERATION-DOMAIN-MT" );
    $sym42$GENERATION_MT = makeSymbol( "GENERATION-MT" );
    $sym43$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_CLA = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-CLASS" );
    $sym44$SUBLOOP_RESERVED_INITIALIZE_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_INS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-INSTANCE" );
    $list45 = ConsesLow.list( makeSymbol( "INVERTED-INDEX" ) );
    $list46 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "INVERTED-INDEX" ), makeSymbol( "INVERTED-INDEX-P" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PARENT-INDEX" ),
        makeSymbol( "INVERTED-INDEX" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym47$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-METHOD" );
    $sym48$INVERTED_INDEX_P = makeSymbol( "INVERTED-INDEX-P" );
    $sym49$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_INDEX_METHOD = makeSymbol( "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-INDEX-METHOD" );
    $sym50$SET_GENERATION_MT = makeSymbol( "SET-GENERATION-MT" );
    $list51 = ConsesLow.list( makeSymbol( "MT" ) );
    $list52 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "MT" ), makeSymbol( "HLMT-P" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "GENERATION-MT" ), makeSymbol( "MT" ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym53$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-METHOD" );
    $sym54$HLMT_P = makeSymbol( "HLMT-P" );
    $sym55$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_GENERATION_MT_METHOD = makeSymbol( "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-GENERATION-MT-METHOD" );
    $sym56$SET_GENERATION_DOMAIN_MT = makeSymbol( "SET-GENERATION-DOMAIN-MT" );
    $list57 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "MT" ), makeSymbol( "HLMT-P" ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "GENERATION-DOMAIN-MT" ), makeSymbol( "MT" ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym58$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-METHOD" );
    $sym59$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_SET_GENERATION_DOMAIN_MT_METHOD = makeSymbol( "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-SET-GENERATION-DOMAIN-MT-METHOD" );
    $list60 = ConsesLow.list( makeSymbol( "CYCL" ) );
    $list61 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "INDEXED-ITEMS" ), ConsesLow.list( makeSymbol( "GET-SLOT" ), makeSymbol( "PARENT-INDEX" ), ConsesLow.list(
        makeSymbol( "QUOTE" ), makeSymbol( "INDEXED-ITEMS" ) ) ) ), ConsesLow.list( makeSymbol( "MY-INDEX" ), ConsesLow.list( makeSymbol( "MAYBE-ADD-NEW-INDEXED-ITEM" ), makeSymbol( "INDEXED-ITEMS" ), makeSymbol(
            "CYCL" ) ) ), makeSymbol( "RESULT" ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "FORT" ), ConsesLow.list( makeSymbol( "EXPRESSION-GATHER" ), makeSymbol( "CYCL" ), ConsesLow.list(
                makeSymbol( "QUOTE" ), makeSymbol( "FORT-P" ) ), T ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-INVERTED-INDEX-ENTRY" ), makeSymbol( "FORT" ), makeSymbol( "MY-INDEX" ) ),
                    makeSymbol( "RESULT" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "WORD" ), ConsesLow.list( makeSymbol( "STRING-TOKENIZE-VIA-WORDIFY" ), ConsesLow.list( makeSymbol(
                        "GENERATE-PHRASE" ), makeSymbol( "CYCL" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-INVERTED-INDEX-ENTRY" ), makeSymbol( "WORD" ), makeSymbol( "MY-INDEX" ) ),
                            makeSymbol( "RESULT" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list( makeSymbol( "WORD" ), ConsesLow.list( makeSymbol( "STRING-TOKENIZE-VIA-WORDIFY" ), ConsesLow.list(
                                makeSymbol( "GENERATE-QUESTION" ), makeSymbol( "CYCL" ) ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol( "NEW-INVERTED-INDEX-ENTRY" ), makeSymbol( "WORD" ),
                                    makeSymbol( "MY-INDEX" ) ), makeSymbol( "RESULT" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "RESULT" ) ) ) );
    $sym62$OUTER_CATCH_FOR_CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-METHOD" );
    $sym63$FORT_P = makeSymbol( "FORT-P" );
    $sym64$CYCL_AND_GEN_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIES_METHOD = makeSymbol( "CYCL-AND-GEN-INDEX-ENTRY-COMPUTER-COMPUTE-INDEX-ENTRIES-METHOD" );
    $str65$Inverted_Index_Test_Suite = makeString( "Inverted Index Test Suite" );
    $list66 = ConsesLow.list( ConsesLow.list( makeString( "inverted-index" ), makeString( "cycl" ) ) );
    $list67 = ConsesLow.list( makeSymbol( "INVERTED-INDEX-CYCL-GEN-INSERT-DELETE" ) );
  }
}
/*
 * 
 * Total time: 265 ms
 * 
 */