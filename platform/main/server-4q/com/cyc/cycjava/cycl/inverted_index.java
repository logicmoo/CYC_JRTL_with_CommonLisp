package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inverted_index
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inverted_index";
  public static final String myFingerPrint = "b96b97c2d1987939c5875acfb7af848094e7dc4aa37643f632c599399f06e143";
  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
  public static SubLSymbol $dtp_indexed_items$;
  private static final SubLSymbol $sym0$INVERTED_INDEX;
  private static final SubLSymbol $sym1$OBJECT;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$INDEXED_ITEMS;
  private static final SubLSymbol $sym4$VALUE_TEST;
  private static final SubLSymbol $sym5$INDEX_ENTRY_COMPUTER;
  private static final SubLSymbol $sym6$PHYSICAL_INDEX;
  private static final SubLSymbol $sym7$INSTANCE_COUNT;
  private static final SubLSymbol $sym8$SUBLOOP_RESERVED_INITIALIZE_INVERTED_INDEX_CLASS;
  private static final SubLSymbol $sym9$ISOLATED_P;
  private static final SubLSymbol $sym10$INSTANCE_NUMBER;
  private static final SubLSymbol $sym11$SUBLOOP_RESERVED_INITIALIZE_INVERTED_INDEX_INSTANCE;
  private static final SubLSymbol $sym12$ISOLATE;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD;
  private static final SubLSymbol $sym16$INVERTED_INDEX_ISOLATE_METHOD;
  private static final SubLSymbol $sym17$INDEX_AN_ITEM;
  private static final SubLList $list18;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD;
  private static final SubLString $str21$trying_to_index__S_before_the_ind;
  private static final SubLSymbol $sym22$COMPUTE_INDEX_ENTRIES;
  private static final SubLSymbol $sym23$INSERT;
  private static final SubLSymbol $sym24$INVERTED_INDEX_INDEX_AN_ITEM_METHOD;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD;
  private static final SubLSymbol $sym29$INVERTED_INDEX_COMPUTE_INDEX_ENTRIES_METHOD;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD;
  private static final SubLSymbol $sym33$INVERTED_INDEX_INSERT_METHOD;
  private static final SubLSymbol $sym34$INDEXED_ITEMS_P;
  private static final SubLList $list35;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLList $list38;
  private static final SubLSymbol $sym39$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym40$INDEXED_ITEMS_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$INDEXED_ITEMS_NEXT_INDEX;
  private static final SubLSymbol $sym43$_CSETF_INDEXED_ITEMS_NEXT_INDEX;
  private static final SubLSymbol $sym44$INDEXED_ITEMS_ITEM_SUID_MAP;
  private static final SubLSymbol $sym45$_CSETF_INDEXED_ITEMS_ITEM_SUID_MAP;
  private static final SubLSymbol $sym46$INDEXED_ITEMS_SUID_ITEM_MAP;
  private static final SubLSymbol $sym47$_CSETF_INDEXED_ITEMS_SUID_ITEM_MAP;
  private static final SubLSymbol $kw48$NEXT_INDEX;
  private static final SubLSymbol $kw49$ITEM_SUID_MAP;
  private static final SubLSymbol $kw50$SUID_ITEM_MAP;
  private static final SubLString $str51$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw52$BEGIN;
  private static final SubLSymbol $sym53$MAKE_INDEXED_ITEMS;
  private static final SubLSymbol $kw54$SLOT;
  private static final SubLSymbol $kw55$END;
  private static final SubLSymbol $sym56$VISIT_DEFSTRUCT_OBJECT_INDEXED_ITEMS_METHOD;
  private static final SubLInteger $int57$50;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$SUBLOOP_RESERVED_INITIALIZE_INDEX_ENTRY_COMPUTER_CLASS;
  private static final SubLSymbol $sym60$SUBLOOP_RESERVED_INITIALIZE_INDEX_ENTRY_COMPUTER_INSTANCE;
  private static final SubLList $list61;
  private static final SubLSymbol $sym62$INDEX_STRUCTURE;
  private static final SubLSymbol $sym63$SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_INDEX_CLASS;
  private static final SubLSymbol $sym64$SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_INDEX_INSTANCE;
  private static final SubLSymbol $sym65$IN_MEMORY_INDEX;
  private static final SubLList $list66;
  private static final SubLSymbol $sym67$VAL_TEST;
  private static final SubLSymbol $sym68$DICTIONARY_INDEX;
  private static final SubLSymbol $sym69$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_INDEX_CLASS;
  private static final SubLSymbol $sym70$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_INDEX_INSTANCE;
  private static final SubLList $list71;
  private static final SubLSymbol $sym72$IN_MEMORY_INDEX_ISOLATE_METHOD;
  private static final SubLList $list73;
  private static final SubLSymbol $sym74$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD;
  private static final SubLSymbol $sym75$IN_MEMORY_INDEX_INSERT_METHOD;
  private static final SubLSymbol $sym76$LOOKUP;
  private static final SubLList $list77;
  private static final SubLList $list78;
  private static final SubLSymbol $sym79$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD;
  private static final SubLSymbol $sym80$IN_MEMORY_INDEX_LOOKUP_METHOD;
  private static final SubLSymbol $sym81$REMOVE;
  private static final SubLList $list82;
  private static final SubLSymbol $sym83$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD;
  private static final SubLSymbol $sym84$IN_MEMORY_INDEX_REMOVE_METHOD;
  private static final SubLSymbol $sym85$IN_MEMORY_EQUALP_INDEX;
  private static final SubLList $list86;
  private static final SubLSymbol $sym87$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUALP_INDEX_CLASS;
  private static final SubLSymbol $sym88$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUALP_INDEX_INSTANCE;
  private static final SubLSymbol $sym89$INITIALIZE;
  private static final SubLList $list90;
  private static final SubLList $list91;
  private static final SubLSymbol $sym92$OUTER_CATCH_FOR_IN_MEMORY_EQUALP_INDEX_METHOD;
  private static final SubLSymbol $sym93$IN_MEMORY_EQUALP_INDEX_INITIALIZE_METHOD;
  private static final SubLSymbol $sym94$IN_MEMORY_EQUAL_INDEX;
  private static final SubLSymbol $sym95$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUAL_INDEX_CLASS;
  private static final SubLSymbol $sym96$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUAL_INDEX_INSTANCE;
  private static final SubLList $list97;
  private static final SubLSymbol $sym98$OUTER_CATCH_FOR_IN_MEMORY_EQUAL_INDEX_METHOD;
  private static final SubLSymbol $sym99$IN_MEMORY_EQUAL_INDEX_INITIALIZE_METHOD;
  private static final SubLSymbol $sym100$IN_MEMORY_EQ_INDEX;
  private static final SubLSymbol $sym101$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQ_INDEX_CLASS;
  private static final SubLSymbol $sym102$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQ_INDEX_INSTANCE;
  private static final SubLList $list103;
  private static final SubLSymbol $sym104$OUTER_CATCH_FOR_IN_MEMORY_EQ_INDEX_METHOD;
  private static final SubLSymbol $sym105$IN_MEMORY_EQ_INDEX_INITIALIZE_METHOD;
  private static final SubLSymbol $sym106$SIMPLE_STRING_INDEX;
  private static final SubLList $list107;
  private static final SubLSymbol $sym108$SUBLOOP_RESERVED_INITIALIZE_SIMPLE_STRING_INDEX_CLASS;
  private static final SubLSymbol $sym109$SUBLOOP_RESERVED_INITIALIZE_SIMPLE_STRING_INDEX_INSTANCE;
  private static final SubLList $list110;
  private static final SubLSymbol $sym111$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD;
  private static final SubLSymbol $sym112$STRING_INDEX_ENTRY_COMPUTER;
  private static final SubLSymbol $sym113$SIMPLE_STRING_INDEX_INITIALIZE_METHOD;
  private static final SubLList $list114;
  private static final SubLList $list115;
  private static final SubLSymbol $sym116$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD;
  private static final SubLSymbol $sym117$SIMPLE_STRING_INDEX_LOOKUP_METHOD;
  private static final SubLSymbol $sym118$REMOVE_VALUE;
  private static final SubLList $list119;
  private static final SubLSymbol $sym120$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD;
  private static final SubLSymbol $sym121$SIMPLE_STRING_INDEX_REMOVE_VALUE_METHOD;
  private static final SubLList $list122;
  private static final SubLSymbol $sym123$SUBLOOP_RESERVED_INITIALIZE_STRING_INDEX_ENTRY_COMPUTER_CLASS;
  private static final SubLSymbol $sym124$SUBLOOP_RESERVED_INITIALIZE_STRING_INDEX_ENTRY_COMPUTER_INSTANCE;
  private static final SubLList $list125;
  private static final SubLSymbol $sym126$STRING_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIES_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 1106L)
  public static SubLObject get_inverted_index_indexed_items(final SubLObject v_inverted_index)
  {
    return classes.subloop_get_access_protected_instance_slot( v_inverted_index, FOUR_INTEGER, $sym3$INDEXED_ITEMS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 1106L)
  public static SubLObject set_inverted_index_indexed_items(final SubLObject v_inverted_index, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_inverted_index, value, FOUR_INTEGER, $sym3$INDEXED_ITEMS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 1106L)
  public static SubLObject get_inverted_index_value_test(final SubLObject v_inverted_index)
  {
    return classes.subloop_get_access_protected_instance_slot( v_inverted_index, THREE_INTEGER, $sym4$VALUE_TEST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 1106L)
  public static SubLObject set_inverted_index_value_test(final SubLObject v_inverted_index, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_inverted_index, value, THREE_INTEGER, $sym4$VALUE_TEST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 1106L)
  public static SubLObject get_inverted_index_index_entry_computer(final SubLObject v_inverted_index)
  {
    return classes.subloop_get_access_protected_instance_slot( v_inverted_index, TWO_INTEGER, $sym5$INDEX_ENTRY_COMPUTER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 1106L)
  public static SubLObject set_inverted_index_index_entry_computer(final SubLObject v_inverted_index, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_inverted_index, value, TWO_INTEGER, $sym5$INDEX_ENTRY_COMPUTER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 1106L)
  public static SubLObject get_inverted_index_physical_index(final SubLObject v_inverted_index)
  {
    return classes.subloop_get_access_protected_instance_slot( v_inverted_index, ONE_INTEGER, $sym6$PHYSICAL_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 1106L)
  public static SubLObject set_inverted_index_physical_index(final SubLObject v_inverted_index, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( v_inverted_index, value, ONE_INTEGER, $sym6$PHYSICAL_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 1106L)
  public static SubLObject subloop_reserved_initialize_inverted_index_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 1106L)
  public static SubLObject subloop_reserved_initialize_inverted_index_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym10$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$INVERTED_INDEX, $sym6$PHYSICAL_INDEX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$INVERTED_INDEX, $sym5$INDEX_ENTRY_COMPUTER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$INVERTED_INDEX, $sym4$VALUE_TEST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$INVERTED_INDEX, $sym3$INDEXED_ITEMS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 1106L)
  public static SubLObject inverted_index_p(final SubLObject v_inverted_index)
  {
    return classes.subloop_instanceof_class( v_inverted_index, $sym0$INVERTED_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 2236L)
  public static SubLObject inverted_index_isolate_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_inverted_index_method = NIL;
    final SubLObject physical_index = get_inverted_index_physical_index( self );
    try
    {
      thread.throwStack.push( $sym15$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD );
      try
      {
        methods.funcall_instance_method_with_0_args( physical_index, $sym12$ISOLATE );
        object.object_isolate_method( self );
        Dynamic.sublisp_throw( $sym15$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_inverted_index_physical_index( self, physical_index );
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
      catch_var_for_inverted_index_method = Errors.handleThrowable( ccatch_env_var, $sym15$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_inverted_index_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 2378L)
  public static SubLObject inverted_index_index_an_item_method(final SubLObject self, final SubLObject index_item)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_inverted_index_method = NIL;
    final SubLObject index_entry_computer = get_inverted_index_index_entry_computer( self );
    final SubLObject physical_index = get_inverted_index_physical_index( self );
    try
    {
      thread.throwStack.push( $sym20$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD );
      try
      {
        if( NIL == index_entry_computer_p( index_entry_computer ) || NIL == physical_index_p( physical_index ) )
        {
          Errors.error( $str21$trying_to_index__S_before_the_ind, index_item );
        }
        SubLObject cdolist_list_var;
        final SubLObject entries = cdolist_list_var = methods.funcall_instance_method_with_1_args( index_entry_computer, $sym22$COMPUTE_INDEX_ENTRIES, index_item );
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          methods.funcall_instance_method_with_1_args( physical_index, $sym23$INSERT, entry );
          cdolist_list_var = cdolist_list_var.rest();
          entry = cdolist_list_var.first();
        }
        Dynamic.sublisp_throw( $sym20$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_inverted_index_index_entry_computer( self, index_entry_computer );
          set_inverted_index_physical_index( self, physical_index );
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
      catch_var_for_inverted_index_method = Errors.handleThrowable( ccatch_env_var, $sym20$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_inverted_index_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 2832L)
  public static SubLObject inverted_index_compute_index_entries_method(final SubLObject self, final SubLObject item_to_index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_inverted_index_method = NIL;
    final SubLObject index_entry_computer = get_inverted_index_index_entry_computer( self );
    try
    {
      thread.throwStack.push( $sym28$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym28$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD, methods.funcall_instance_method_with_1_args( index_entry_computer, $sym22$COMPUTE_INDEX_ENTRIES, item_to_index ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_inverted_index_index_entry_computer( self, index_entry_computer );
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
      catch_var_for_inverted_index_method = Errors.handleThrowable( ccatch_env_var, $sym28$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_inverted_index_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3011L)
  public static SubLObject inverted_index_insert_method(final SubLObject self, final SubLObject index_entry)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_inverted_index_method = NIL;
    final SubLObject physical_index = get_inverted_index_physical_index( self );
    try
    {
      thread.throwStack.push( $sym32$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym32$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD, methods.funcall_instance_method_with_1_args( physical_index, $sym23$INSERT, index_entry ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_inverted_index_physical_index( self, physical_index );
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
      catch_var_for_inverted_index_method = Errors.handleThrowable( ccatch_env_var, $sym32$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_inverted_index_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3150L)
  public static SubLObject new_inverted_index_entry(final SubLObject key, final SubLObject value)
  {
    return ConsesLow.list( key, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3328L)
  public static SubLObject index_entry_key(final SubLObject index_entry)
  {
    return index_entry.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3404L)
  public static SubLObject index_entry_value(final SubLObject index_entry)
  {
    return conses_high.second( index_entry );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
  public static SubLObject indexed_items_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
  public static SubLObject indexed_items_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $indexed_items_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
  public static SubLObject indexed_items_next_index(final SubLObject v_object)
  {
    assert NIL != indexed_items_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
  public static SubLObject indexed_items_item_suid_map(final SubLObject v_object)
  {
    assert NIL != indexed_items_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
  public static SubLObject indexed_items_suid_item_map(final SubLObject v_object)
  {
    assert NIL != indexed_items_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
  public static SubLObject _csetf_indexed_items_next_index(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != indexed_items_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
  public static SubLObject _csetf_indexed_items_item_suid_map(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != indexed_items_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
  public static SubLObject _csetf_indexed_items_suid_item_map(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != indexed_items_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
  public static SubLObject make_indexed_items(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $indexed_items_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw48$NEXT_INDEX ) )
      {
        _csetf_indexed_items_next_index( v_new, current_value );
      }
      else if( pcase_var.eql( $kw49$ITEM_SUID_MAP ) )
      {
        _csetf_indexed_items_item_suid_map( v_new, current_value );
      }
      else if( pcase_var.eql( $kw50$SUID_ITEM_MAP ) )
      {
        _csetf_indexed_items_suid_item_map( v_new, current_value );
      }
      else
      {
        Errors.error( $str51$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
  public static SubLObject visit_defstruct_indexed_items(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw52$BEGIN, $sym53$MAKE_INDEXED_ITEMS, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw54$SLOT, $kw48$NEXT_INDEX, indexed_items_next_index( obj ) );
    Functions.funcall( visitor_fn, obj, $kw54$SLOT, $kw49$ITEM_SUID_MAP, indexed_items_item_suid_map( obj ) );
    Functions.funcall( visitor_fn, obj, $kw54$SLOT, $kw50$SUID_ITEM_MAP, indexed_items_suid_item_map( obj ) );
    Functions.funcall( visitor_fn, obj, $kw55$END, $sym53$MAKE_INDEXED_ITEMS, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3483L)
  public static SubLObject visit_defstruct_object_indexed_items_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_indexed_items( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 3932L)
  public static SubLObject new_indexed_items()
  {
    final SubLObject result = make_indexed_items( UNPROVIDED );
    _csetf_indexed_items_next_index( result, ZERO_INTEGER );
    _csetf_indexed_items_item_suid_map( result, dictionary.new_dictionary( EQUAL, UNPROVIDED ) );
    _csetf_indexed_items_suid_item_map( result, Vectors.make_vector( $int57$50, UNPROVIDED ) );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 4218L)
  public static SubLObject maybe_add_new_indexed_item(final SubLObject indexed_items, final SubLObject item)
  {
    SubLObject suid = dictionary.dictionary_lookup( indexed_items_item_suid_map( indexed_items ), item, UNPROVIDED );
    if( suid.isInteger() )
    {
      return suid;
    }
    suid = indexed_items_next_index( indexed_items );
    _csetf_indexed_items_next_index( indexed_items, Numbers.add( indexed_items_next_index( indexed_items ), ONE_INTEGER ) );
    dictionary.dictionary_enter( indexed_items_item_suid_map( indexed_items ), item, suid );
    if( indexed_items_next_index( indexed_items ).numG( Sequences.length( indexed_items_suid_item_map( indexed_items ) ) ) )
    {
      _csetf_indexed_items_suid_item_map( indexed_items, vector_utilities.grow_vector( indexed_items_suid_item_map( indexed_items ), UNPROVIDED, UNPROVIDED ) );
    }
    Vectors.set_aref( indexed_items_suid_item_map( indexed_items ), suid, item );
    return suid;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 5285L)
  public static SubLObject get_item_from_index_suid(final SubLObject indexed_items, final SubLObject suid)
  {
    return Vectors.aref( indexed_items_suid_item_map( indexed_items ), suid );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 5415L)
  public static SubLObject subloop_reserved_initialize_index_entry_computer_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 5415L)
  public static SubLObject subloop_reserved_initialize_index_entry_computer_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym10$INSTANCE_NUMBER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 5415L)
  public static SubLObject index_entry_computer_p(final SubLObject index_entry_computer)
  {
    return classes.subloop_instanceof_class( index_entry_computer, $sym5$INDEX_ENTRY_COMPUTER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 5712L)
  public static SubLObject get_physical_index_index_structure(final SubLObject physical_index)
  {
    return classes.subloop_get_access_protected_instance_slot( physical_index, ONE_INTEGER, $sym62$INDEX_STRUCTURE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 5712L)
  public static SubLObject set_physical_index_index_structure(final SubLObject physical_index, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( physical_index, value, ONE_INTEGER, $sym62$INDEX_STRUCTURE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 5712L)
  public static SubLObject subloop_reserved_initialize_physical_index_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 5712L)
  public static SubLObject subloop_reserved_initialize_physical_index_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym10$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym6$PHYSICAL_INDEX, $sym62$INDEX_STRUCTURE, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 5712L)
  public static SubLObject physical_index_p(final SubLObject physical_index)
  {
    return classes.subloop_instanceof_class( physical_index, $sym6$PHYSICAL_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 6440L)
  public static SubLObject get_in_memory_index_val_test(final SubLObject in_memory_index)
  {
    return classes.subloop_get_access_protected_instance_slot( in_memory_index, THREE_INTEGER, $sym67$VAL_TEST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 6440L)
  public static SubLObject set_in_memory_index_val_test(final SubLObject in_memory_index, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( in_memory_index, value, THREE_INTEGER, $sym67$VAL_TEST );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 6440L)
  public static SubLObject get_in_memory_index_dictionary_index(final SubLObject in_memory_index)
  {
    return classes.subloop_get_access_protected_instance_slot( in_memory_index, TWO_INTEGER, $sym68$DICTIONARY_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 6440L)
  public static SubLObject set_in_memory_index_dictionary_index(final SubLObject in_memory_index, final SubLObject value)
  {
    return classes.subloop_set_access_protected_instance_slot( in_memory_index, value, TWO_INTEGER, $sym68$DICTIONARY_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 6440L)
  public static SubLObject subloop_reserved_initialize_in_memory_index_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 6440L)
  public static SubLObject subloop_reserved_initialize_in_memory_index_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym10$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym6$PHYSICAL_INDEX, $sym62$INDEX_STRUCTURE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym65$IN_MEMORY_INDEX, $sym68$DICTIONARY_INDEX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym65$IN_MEMORY_INDEX, $sym67$VAL_TEST, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 6440L)
  public static SubLObject in_memory_index_p(final SubLObject in_memory_index)
  {
    return classes.subloop_instanceof_class( in_memory_index, $sym65$IN_MEMORY_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 6668L)
  public static SubLObject in_memory_index_isolate_method(final SubLObject self)
  {
    return self;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 6743L)
  public static SubLObject in_memory_index_insert_method(final SubLObject self, final SubLObject index_entry)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_in_memory_index_method = NIL;
    final SubLObject dictionary_index = get_in_memory_index_dictionary_index( self );
    try
    {
      thread.throwStack.push( $sym74$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD );
      try
      {
        dictionary_utilities.dictionary_pushnew( dictionary_index, index_entry_key( index_entry ), index_entry_value( index_entry ), UNPROVIDED, UNPROVIDED );
        Dynamic.sublisp_throw( $sym74$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_in_memory_index_dictionary_index( self, dictionary_index );
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
      catch_var_for_in_memory_index_method = Errors.handleThrowable( ccatch_env_var, $sym74$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_in_memory_index_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 6940L)
  public static SubLObject in_memory_index_lookup_method(final SubLObject self, final SubLObject index_key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_in_memory_index_method = NIL;
    final SubLObject dictionary_index = get_in_memory_index_dictionary_index( self );
    try
    {
      thread.throwStack.push( $sym79$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym79$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD, dictionary.dictionary_lookup( dictionary_index, index_key, UNPROVIDED ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_in_memory_index_dictionary_index( self, dictionary_index );
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
      catch_var_for_in_memory_index_method = Errors.handleThrowable( ccatch_env_var, $sym79$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_in_memory_index_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7064L)
  public static SubLObject in_memory_index_remove_method(final SubLObject self, final SubLObject index_entry)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_in_memory_index_method = NIL;
    final SubLObject val_test = get_in_memory_index_val_test( self );
    final SubLObject dictionary_index = get_in_memory_index_dictionary_index( self );
    try
    {
      thread.throwStack.push( $sym83$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD );
      try
      {
        dictionary_utilities.dictionary_remove_from_value( dictionary_index, index_entry_key( index_entry ), index_entry_value( index_entry ), val_test, UNPROVIDED );
        Dynamic.sublisp_throw( $sym83$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_in_memory_index_val_test( self, val_test );
          set_in_memory_index_dictionary_index( self, dictionary_index );
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
      catch_var_for_in_memory_index_method = Errors.handleThrowable( ccatch_env_var, $sym83$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_in_memory_index_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7278L)
  public static SubLObject subloop_reserved_initialize_in_memory_equalp_index_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7278L)
  public static SubLObject subloop_reserved_initialize_in_memory_equalp_index_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym10$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym6$PHYSICAL_INDEX, $sym62$INDEX_STRUCTURE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym65$IN_MEMORY_INDEX, $sym68$DICTIONARY_INDEX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym65$IN_MEMORY_INDEX, $sym67$VAL_TEST, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7278L)
  public static SubLObject in_memory_equalp_index_p(final SubLObject in_memory_equalp_index)
  {
    return classes.subloop_instanceof_class( in_memory_equalp_index, $sym85$IN_MEMORY_EQUALP_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7395L)
  public static SubLObject in_memory_equalp_index_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_in_memory_equalp_index_method = NIL;
    SubLObject val_test = get_in_memory_index_val_test( self );
    SubLObject dictionary_index = get_in_memory_index_dictionary_index( self );
    try
    {
      thread.throwStack.push( $sym92$OUTER_CATCH_FOR_IN_MEMORY_EQUALP_INDEX_METHOD );
      try
      {
        val_test = EQUALP;
        dictionary_index = dictionary.new_dictionary( val_test, UNPROVIDED );
        Dynamic.sublisp_throw( $sym92$OUTER_CATCH_FOR_IN_MEMORY_EQUALP_INDEX_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_in_memory_index_val_test( self, val_test );
          set_in_memory_index_dictionary_index( self, dictionary_index );
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
      catch_var_for_in_memory_equalp_index_method = Errors.handleThrowable( ccatch_env_var, $sym92$OUTER_CATCH_FOR_IN_MEMORY_EQUALP_INDEX_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_in_memory_equalp_index_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7565L)
  public static SubLObject subloop_reserved_initialize_in_memory_equal_index_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7565L)
  public static SubLObject subloop_reserved_initialize_in_memory_equal_index_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym10$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym6$PHYSICAL_INDEX, $sym62$INDEX_STRUCTURE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym65$IN_MEMORY_INDEX, $sym68$DICTIONARY_INDEX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym65$IN_MEMORY_INDEX, $sym67$VAL_TEST, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7565L)
  public static SubLObject in_memory_equal_index_p(final SubLObject in_memory_equal_index)
  {
    return classes.subloop_instanceof_class( in_memory_equal_index, $sym94$IN_MEMORY_EQUAL_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7635L)
  public static SubLObject in_memory_equal_index_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_in_memory_equal_index_method = NIL;
    SubLObject val_test = get_in_memory_index_val_test( self );
    SubLObject dictionary_index = get_in_memory_index_dictionary_index( self );
    try
    {
      thread.throwStack.push( $sym98$OUTER_CATCH_FOR_IN_MEMORY_EQUAL_INDEX_METHOD );
      try
      {
        val_test = Symbols.symbol_function( EQUAL );
        dictionary_index = dictionary.new_dictionary( val_test, UNPROVIDED );
        Dynamic.sublisp_throw( $sym98$OUTER_CATCH_FOR_IN_MEMORY_EQUAL_INDEX_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_in_memory_index_val_test( self, val_test );
          set_in_memory_index_dictionary_index( self, dictionary_index );
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
      catch_var_for_in_memory_equal_index_method = Errors.handleThrowable( ccatch_env_var, $sym98$OUTER_CATCH_FOR_IN_MEMORY_EQUAL_INDEX_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_in_memory_equal_index_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7804L)
  public static SubLObject subloop_reserved_initialize_in_memory_eq_index_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7804L)
  public static SubLObject subloop_reserved_initialize_in_memory_eq_index_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym10$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym6$PHYSICAL_INDEX, $sym62$INDEX_STRUCTURE, NIL );
    classes.subloop_initialize_slot( new_instance, $sym65$IN_MEMORY_INDEX, $sym68$DICTIONARY_INDEX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym65$IN_MEMORY_INDEX, $sym67$VAL_TEST, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7804L)
  public static SubLObject in_memory_eq_index_p(final SubLObject in_memory_eq_index)
  {
    return classes.subloop_instanceof_class( in_memory_eq_index, $sym100$IN_MEMORY_EQ_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 7871L)
  public static SubLObject in_memory_eq_index_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_in_memory_eq_index_method = NIL;
    SubLObject val_test = get_in_memory_index_val_test( self );
    SubLObject dictionary_index = get_in_memory_index_dictionary_index( self );
    try
    {
      thread.throwStack.push( $sym104$OUTER_CATCH_FOR_IN_MEMORY_EQ_INDEX_METHOD );
      try
      {
        val_test = EQ;
        dictionary_index = dictionary.new_dictionary( val_test, UNPROVIDED );
        Dynamic.sublisp_throw( $sym104$OUTER_CATCH_FOR_IN_MEMORY_EQ_INDEX_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_in_memory_index_val_test( self, val_test );
          set_in_memory_index_dictionary_index( self, dictionary_index );
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
      catch_var_for_in_memory_eq_index_method = Errors.handleThrowable( ccatch_env_var, $sym104$OUTER_CATCH_FOR_IN_MEMORY_EQ_INDEX_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_in_memory_eq_index_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 8033L)
  public static SubLObject subloop_reserved_initialize_simple_string_index_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 8033L)
  public static SubLObject subloop_reserved_initialize_simple_string_index_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym10$INSTANCE_NUMBER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$INVERTED_INDEX, $sym6$PHYSICAL_INDEX, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$INVERTED_INDEX, $sym5$INDEX_ENTRY_COMPUTER, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$INVERTED_INDEX, $sym4$VALUE_TEST, NIL );
    classes.subloop_initialize_slot( new_instance, $sym0$INVERTED_INDEX, $sym3$INDEXED_ITEMS, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 8033L)
  public static SubLObject simple_string_index_p(final SubLObject simple_string_index)
  {
    return classes.subloop_instanceof_class( simple_string_index, $sym106$SIMPLE_STRING_INDEX );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 8451L)
  public static SubLObject simple_string_index_initialize_method(final SubLObject self)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_simple_string_index_method = NIL;
    SubLObject indexed_items = get_inverted_index_indexed_items( self );
    SubLObject value_test = get_inverted_index_value_test( self );
    SubLObject index_entry_computer = get_inverted_index_index_entry_computer( self );
    SubLObject physical_index = get_inverted_index_physical_index( self );
    try
    {
      thread.throwStack.push( $sym111$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD );
      try
      {
        indexed_items = new_indexed_items();
        value_test = Symbols.symbol_function( EQUALP );
        index_entry_computer = object.new_class_instance( $sym112$STRING_INDEX_ENTRY_COMPUTER );
        physical_index = object.new_class_instance( $sym85$IN_MEMORY_EQUALP_INDEX );
        Dynamic.sublisp_throw( $sym111$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_inverted_index_indexed_items( self, indexed_items );
          set_inverted_index_value_test( self, value_test );
          set_inverted_index_index_entry_computer( self, index_entry_computer );
          set_inverted_index_physical_index( self, physical_index );
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
      catch_var_for_simple_string_index_method = Errors.handleThrowable( ccatch_env_var, $sym111$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_simple_string_index_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 8782L)
  public static SubLObject simple_string_index_lookup_method(final SubLObject self, final SubLObject key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_simple_string_index_method = NIL;
    final SubLObject physical_index = get_inverted_index_physical_index( self );
    try
    {
      thread.throwStack.push( $sym116$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD );
      try
      {
        Dynamic.sublisp_throw( $sym116$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD, methods.funcall_instance_method_with_1_args( physical_index, $sym76$LOOKUP, key ) );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_inverted_index_physical_index( self, physical_index );
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
      catch_var_for_simple_string_index_method = Errors.handleThrowable( ccatch_env_var, $sym116$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_simple_string_index_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 8909L)
  public static SubLObject simple_string_index_remove_value_method(final SubLObject self, final SubLObject index_entry)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject catch_var_for_simple_string_index_method = NIL;
    final SubLObject physical_index = get_inverted_index_physical_index( self );
    try
    {
      thread.throwStack.push( $sym120$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD );
      try
      {
        methods.funcall_instance_method_with_1_args( physical_index, $sym81$REMOVE, index_entry );
        Dynamic.sublisp_throw( $sym120$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD, self );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          set_inverted_index_physical_index( self, physical_index );
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
      catch_var_for_simple_string_index_method = Errors.handleThrowable( ccatch_env_var, $sym120$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return catch_var_for_simple_string_index_method;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 9065L)
  public static SubLObject subloop_reserved_initialize_string_index_entry_computer_class(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym7$INSTANCE_COUNT, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 9065L)
  public static SubLObject subloop_reserved_initialize_string_index_entry_computer_instance(final SubLObject new_instance)
  {
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym9$ISOLATED_P, NIL );
    classes.subloop_initialize_slot( new_instance, $sym1$OBJECT, $sym10$INSTANCE_NUMBER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 9065L)
  public static SubLObject string_index_entry_computer_p(final SubLObject string_index_entry_computer)
  {
    return classes.subloop_instanceof_class( string_index_entry_computer, $sym112$STRING_INDEX_ENTRY_COMPUTER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inverted-index.lisp", position = 9215L)
  public static SubLObject string_index_entry_computer_compute_index_entries_method(final SubLObject self, final SubLObject item_to_index)
  {
    SubLObject result = NIL;
    SubLObject list_var = NIL;
    SubLObject word = NIL;
    SubLObject num = NIL;
    list_var = document.string_tokenize_via_wordify( item_to_index );
    word = list_var.first();
    for( num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), word = list_var.first(), num = Numbers.add( ONE_INTEGER, num ) )
    {
      result = ConsesLow.cons( new_inverted_index_entry( word, ConsesLow.list( num, item_to_index ) ), result );
    }
    return result;
  }

  public static SubLObject declare_inverted_index_file()
  {
    SubLFiles.declareFunction( me, "get_inverted_index_indexed_items", "GET-INVERTED-INDEX-INDEXED-ITEMS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_inverted_index_indexed_items", "SET-INVERTED-INDEX-INDEXED-ITEMS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_inverted_index_value_test", "GET-INVERTED-INDEX-VALUE-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "set_inverted_index_value_test", "SET-INVERTED-INDEX-VALUE-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "get_inverted_index_index_entry_computer", "GET-INVERTED-INDEX-INDEX-ENTRY-COMPUTER", 1, 0, false );
    SubLFiles.declareFunction( me, "set_inverted_index_index_entry_computer", "SET-INVERTED-INDEX-INDEX-ENTRY-COMPUTER", 2, 0, false );
    SubLFiles.declareFunction( me, "get_inverted_index_physical_index", "GET-INVERTED-INDEX-PHYSICAL-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "set_inverted_index_physical_index", "SET-INVERTED-INDEX-PHYSICAL-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_inverted_index_class", "SUBLOOP-RESERVED-INITIALIZE-INVERTED-INDEX-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_inverted_index_instance", "SUBLOOP-RESERVED-INITIALIZE-INVERTED-INDEX-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "inverted_index_p", "INVERTED-INDEX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inverted_index_isolate_method", "INVERTED-INDEX-ISOLATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "inverted_index_index_an_item_method", "INVERTED-INDEX-INDEX-AN-ITEM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "inverted_index_compute_index_entries_method", "INVERTED-INDEX-COMPUTE-INDEX-ENTRIES-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "inverted_index_insert_method", "INVERTED-INDEX-INSERT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_inverted_index_entry", "NEW-INVERTED-INDEX-ENTRY", 2, 0, false );
    SubLFiles.declareFunction( me, "index_entry_key", "INDEX-ENTRY-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "index_entry_value", "INDEX-ENTRY-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "indexed_items_print_function_trampoline", "INDEXED-ITEMS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "indexed_items_p", "INDEXED-ITEMS-P", 1, 0, false );
    new $indexed_items_p$UnaryFunction();
    SubLFiles.declareFunction( me, "indexed_items_next_index", "INDEXED-ITEMS-NEXT-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "indexed_items_item_suid_map", "INDEXED-ITEMS-ITEM-SUID-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "indexed_items_suid_item_map", "INDEXED-ITEMS-SUID-ITEM-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_indexed_items_next_index", "_CSETF-INDEXED-ITEMS-NEXT-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_indexed_items_item_suid_map", "_CSETF-INDEXED-ITEMS-ITEM-SUID-MAP", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_indexed_items_suid_item_map", "_CSETF-INDEXED-ITEMS-SUID-ITEM-MAP", 2, 0, false );
    SubLFiles.declareFunction( me, "make_indexed_items", "MAKE-INDEXED-ITEMS", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_indexed_items", "VISIT-DEFSTRUCT-INDEXED-ITEMS", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_indexed_items_method", "VISIT-DEFSTRUCT-OBJECT-INDEXED-ITEMS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_indexed_items", "NEW-INDEXED-ITEMS", 0, 0, false );
    SubLFiles.declareFunction( me, "maybe_add_new_indexed_item", "MAYBE-ADD-NEW-INDEXED-ITEM", 2, 0, false );
    SubLFiles.declareFunction( me, "get_item_from_index_suid", "GET-ITEM-FROM-INDEX-SUID", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_index_entry_computer_class", "SUBLOOP-RESERVED-INITIALIZE-INDEX-ENTRY-COMPUTER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_index_entry_computer_instance", "SUBLOOP-RESERVED-INITIALIZE-INDEX-ENTRY-COMPUTER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "index_entry_computer_p", "INDEX-ENTRY-COMPUTER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_physical_index_index_structure", "GET-PHYSICAL-INDEX-INDEX-STRUCTURE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_physical_index_index_structure", "SET-PHYSICAL-INDEX-INDEX-STRUCTURE", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_physical_index_class", "SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-INDEX-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_physical_index_instance", "SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-INDEX-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "physical_index_p", "PHYSICAL-INDEX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_in_memory_index_val_test", "GET-IN-MEMORY-INDEX-VAL-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "set_in_memory_index_val_test", "SET-IN-MEMORY-INDEX-VAL-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "get_in_memory_index_dictionary_index", "GET-IN-MEMORY-INDEX-DICTIONARY-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "set_in_memory_index_dictionary_index", "SET-IN-MEMORY-INDEX-DICTIONARY-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_in_memory_index_class", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-INDEX-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_in_memory_index_instance", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-INDEX-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "in_memory_index_p", "IN-MEMORY-INDEX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "in_memory_index_isolate_method", "IN-MEMORY-INDEX-ISOLATE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "in_memory_index_insert_method", "IN-MEMORY-INDEX-INSERT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "in_memory_index_lookup_method", "IN-MEMORY-INDEX-LOOKUP-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "in_memory_index_remove_method", "IN-MEMORY-INDEX-REMOVE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_in_memory_equalp_index_class", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUALP-INDEX-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_in_memory_equalp_index_instance", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUALP-INDEX-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "in_memory_equalp_index_p", "IN-MEMORY-EQUALP-INDEX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "in_memory_equalp_index_initialize_method", "IN-MEMORY-EQUALP-INDEX-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_in_memory_equal_index_class", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUAL-INDEX-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_in_memory_equal_index_instance", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUAL-INDEX-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "in_memory_equal_index_p", "IN-MEMORY-EQUAL-INDEX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "in_memory_equal_index_initialize_method", "IN-MEMORY-EQUAL-INDEX-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_in_memory_eq_index_class", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQ-INDEX-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_in_memory_eq_index_instance", "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQ-INDEX-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "in_memory_eq_index_p", "IN-MEMORY-EQ-INDEX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "in_memory_eq_index_initialize_method", "IN-MEMORY-EQ-INDEX-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_simple_string_index_class", "SUBLOOP-RESERVED-INITIALIZE-SIMPLE-STRING-INDEX-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_simple_string_index_instance", "SUBLOOP-RESERVED-INITIALIZE-SIMPLE-STRING-INDEX-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "simple_string_index_p", "SIMPLE-STRING-INDEX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "simple_string_index_initialize_method", "SIMPLE-STRING-INDEX-INITIALIZE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "simple_string_index_lookup_method", "SIMPLE-STRING-INDEX-LOOKUP-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "simple_string_index_remove_value_method", "SIMPLE-STRING-INDEX-REMOVE-VALUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_string_index_entry_computer_class", "SUBLOOP-RESERVED-INITIALIZE-STRING-INDEX-ENTRY-COMPUTER-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_reserved_initialize_string_index_entry_computer_instance", "SUBLOOP-RESERVED-INITIALIZE-STRING-INDEX-ENTRY-COMPUTER-INSTANCE", 1, 0, false );
    SubLFiles.declareFunction( me, "string_index_entry_computer_p", "STRING-INDEX-ENTRY-COMPUTER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "string_index_entry_computer_compute_index_entries_method", "STRING-INDEX-ENTRY-COMPUTER-COMPUTE-INDEX-ENTRIES-METHOD", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_inverted_index_file()
  {
    $dtp_indexed_items$ = SubLFiles.defconstant( "*DTP-INDEXED-ITEMS*", $sym3$INDEXED_ITEMS );
    return NIL;
  }

  public static SubLObject setup_inverted_index_file()
  {
    classes.subloop_new_class( $sym0$INVERTED_INDEX, $sym1$OBJECT, NIL, T, $list2 );
    classes.class_set_implements_slot_listeners( $sym0$INVERTED_INDEX, NIL );
    classes.subloop_note_class_initialization_function( $sym0$INVERTED_INDEX, $sym8$SUBLOOP_RESERVED_INITIALIZE_INVERTED_INDEX_CLASS );
    classes.subloop_note_instance_initialization_function( $sym0$INVERTED_INDEX, $sym11$SUBLOOP_RESERVED_INITIALIZE_INVERTED_INDEX_INSTANCE );
    subloop_reserved_initialize_inverted_index_class( $sym0$INVERTED_INDEX );
    methods.methods_incorporate_instance_method( $sym12$ISOLATE, $sym0$INVERTED_INDEX, $list13, NIL, $list14 );
    methods.subloop_register_instance_method( $sym0$INVERTED_INDEX, $sym12$ISOLATE, $sym16$INVERTED_INDEX_ISOLATE_METHOD );
    methods.methods_incorporate_instance_method( $sym17$INDEX_AN_ITEM, $sym0$INVERTED_INDEX, $list13, $list18, $list19 );
    methods.subloop_register_instance_method( $sym0$INVERTED_INDEX, $sym17$INDEX_AN_ITEM, $sym24$INVERTED_INDEX_INDEX_AN_ITEM_METHOD );
    methods.methods_incorporate_instance_method( $sym22$COMPUTE_INDEX_ENTRIES, $sym0$INVERTED_INDEX, $list25, $list26, $list27 );
    methods.subloop_register_instance_method( $sym0$INVERTED_INDEX, $sym22$COMPUTE_INDEX_ENTRIES, $sym29$INVERTED_INDEX_COMPUTE_INDEX_ENTRIES_METHOD );
    methods.methods_incorporate_instance_method( $sym23$INSERT, $sym0$INVERTED_INDEX, $list25, $list30, $list31 );
    methods.subloop_register_instance_method( $sym0$INVERTED_INDEX, $sym23$INSERT, $sym33$INVERTED_INDEX_INSERT_METHOD );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_indexed_items$.getGlobalValue(), Symbols.symbol_function( $sym40$INDEXED_ITEMS_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list41 );
    Structures.def_csetf( $sym42$INDEXED_ITEMS_NEXT_INDEX, $sym43$_CSETF_INDEXED_ITEMS_NEXT_INDEX );
    Structures.def_csetf( $sym44$INDEXED_ITEMS_ITEM_SUID_MAP, $sym45$_CSETF_INDEXED_ITEMS_ITEM_SUID_MAP );
    Structures.def_csetf( $sym46$INDEXED_ITEMS_SUID_ITEM_MAP, $sym47$_CSETF_INDEXED_ITEMS_SUID_ITEM_MAP );
    Equality.identity( $sym3$INDEXED_ITEMS );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_indexed_items$.getGlobalValue(), Symbols.symbol_function( $sym56$VISIT_DEFSTRUCT_OBJECT_INDEXED_ITEMS_METHOD ) );
    classes.subloop_new_class( $sym5$INDEX_ENTRY_COMPUTER, $sym1$OBJECT, NIL, T, $list58 );
    classes.class_set_implements_slot_listeners( $sym5$INDEX_ENTRY_COMPUTER, NIL );
    classes.subloop_note_class_initialization_function( $sym5$INDEX_ENTRY_COMPUTER, $sym59$SUBLOOP_RESERVED_INITIALIZE_INDEX_ENTRY_COMPUTER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym5$INDEX_ENTRY_COMPUTER, $sym60$SUBLOOP_RESERVED_INITIALIZE_INDEX_ENTRY_COMPUTER_INSTANCE );
    subloop_reserved_initialize_index_entry_computer_class( $sym5$INDEX_ENTRY_COMPUTER );
    classes.subloop_new_class( $sym6$PHYSICAL_INDEX, $sym1$OBJECT, NIL, T, $list61 );
    classes.class_set_implements_slot_listeners( $sym6$PHYSICAL_INDEX, NIL );
    classes.subloop_note_class_initialization_function( $sym6$PHYSICAL_INDEX, $sym63$SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_INDEX_CLASS );
    classes.subloop_note_instance_initialization_function( $sym6$PHYSICAL_INDEX, $sym64$SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_INDEX_INSTANCE );
    subloop_reserved_initialize_physical_index_class( $sym6$PHYSICAL_INDEX );
    classes.subloop_new_class( $sym65$IN_MEMORY_INDEX, $sym6$PHYSICAL_INDEX, NIL, NIL, $list66 );
    classes.class_set_implements_slot_listeners( $sym65$IN_MEMORY_INDEX, NIL );
    classes.subloop_note_class_initialization_function( $sym65$IN_MEMORY_INDEX, $sym69$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_INDEX_CLASS );
    classes.subloop_note_instance_initialization_function( $sym65$IN_MEMORY_INDEX, $sym70$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_INDEX_INSTANCE );
    subloop_reserved_initialize_in_memory_index_class( $sym65$IN_MEMORY_INDEX );
    methods.methods_incorporate_instance_method( $sym12$ISOLATE, $sym65$IN_MEMORY_INDEX, $list13, NIL, $list71 );
    methods.subloop_register_instance_method( $sym65$IN_MEMORY_INDEX, $sym12$ISOLATE, $sym72$IN_MEMORY_INDEX_ISOLATE_METHOD );
    methods.methods_incorporate_instance_method( $sym23$INSERT, $sym65$IN_MEMORY_INDEX, $list13, $list30, $list73 );
    methods.subloop_register_instance_method( $sym65$IN_MEMORY_INDEX, $sym23$INSERT, $sym75$IN_MEMORY_INDEX_INSERT_METHOD );
    methods.methods_incorporate_instance_method( $sym76$LOOKUP, $sym65$IN_MEMORY_INDEX, $list13, $list77, $list78 );
    methods.subloop_register_instance_method( $sym65$IN_MEMORY_INDEX, $sym76$LOOKUP, $sym80$IN_MEMORY_INDEX_LOOKUP_METHOD );
    methods.methods_incorporate_instance_method( $sym81$REMOVE, $sym65$IN_MEMORY_INDEX, $list13, $list30, $list82 );
    methods.subloop_register_instance_method( $sym65$IN_MEMORY_INDEX, $sym81$REMOVE, $sym84$IN_MEMORY_INDEX_REMOVE_METHOD );
    classes.subloop_new_class( $sym85$IN_MEMORY_EQUALP_INDEX, $sym65$IN_MEMORY_INDEX, NIL, NIL, $list86 );
    classes.class_set_implements_slot_listeners( $sym85$IN_MEMORY_EQUALP_INDEX, NIL );
    classes.subloop_note_class_initialization_function( $sym85$IN_MEMORY_EQUALP_INDEX, $sym87$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUALP_INDEX_CLASS );
    classes.subloop_note_instance_initialization_function( $sym85$IN_MEMORY_EQUALP_INDEX, $sym88$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUALP_INDEX_INSTANCE );
    subloop_reserved_initialize_in_memory_equalp_index_class( $sym85$IN_MEMORY_EQUALP_INDEX );
    methods.methods_incorporate_instance_method( $sym89$INITIALIZE, $sym85$IN_MEMORY_EQUALP_INDEX, $list90, NIL, $list91 );
    methods.subloop_register_instance_method( $sym85$IN_MEMORY_EQUALP_INDEX, $sym89$INITIALIZE, $sym93$IN_MEMORY_EQUALP_INDEX_INITIALIZE_METHOD );
    classes.subloop_new_class( $sym94$IN_MEMORY_EQUAL_INDEX, $sym65$IN_MEMORY_INDEX, NIL, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym94$IN_MEMORY_EQUAL_INDEX, NIL );
    classes.subloop_note_class_initialization_function( $sym94$IN_MEMORY_EQUAL_INDEX, $sym95$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUAL_INDEX_CLASS );
    classes.subloop_note_instance_initialization_function( $sym94$IN_MEMORY_EQUAL_INDEX, $sym96$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUAL_INDEX_INSTANCE );
    subloop_reserved_initialize_in_memory_equal_index_class( $sym94$IN_MEMORY_EQUAL_INDEX );
    methods.methods_incorporate_instance_method( $sym89$INITIALIZE, $sym94$IN_MEMORY_EQUAL_INDEX, $list90, NIL, $list97 );
    methods.subloop_register_instance_method( $sym94$IN_MEMORY_EQUAL_INDEX, $sym89$INITIALIZE, $sym99$IN_MEMORY_EQUAL_INDEX_INITIALIZE_METHOD );
    classes.subloop_new_class( $sym100$IN_MEMORY_EQ_INDEX, $sym65$IN_MEMORY_INDEX, NIL, NIL, NIL );
    classes.class_set_implements_slot_listeners( $sym100$IN_MEMORY_EQ_INDEX, NIL );
    classes.subloop_note_class_initialization_function( $sym100$IN_MEMORY_EQ_INDEX, $sym101$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQ_INDEX_CLASS );
    classes.subloop_note_instance_initialization_function( $sym100$IN_MEMORY_EQ_INDEX, $sym102$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQ_INDEX_INSTANCE );
    subloop_reserved_initialize_in_memory_eq_index_class( $sym100$IN_MEMORY_EQ_INDEX );
    methods.methods_incorporate_instance_method( $sym89$INITIALIZE, $sym100$IN_MEMORY_EQ_INDEX, $list90, NIL, $list103 );
    methods.subloop_register_instance_method( $sym100$IN_MEMORY_EQ_INDEX, $sym89$INITIALIZE, $sym105$IN_MEMORY_EQ_INDEX_INITIALIZE_METHOD );
    classes.subloop_new_class( $sym106$SIMPLE_STRING_INDEX, $sym0$INVERTED_INDEX, NIL, NIL, $list107 );
    classes.class_set_implements_slot_listeners( $sym106$SIMPLE_STRING_INDEX, NIL );
    classes.subloop_note_class_initialization_function( $sym106$SIMPLE_STRING_INDEX, $sym108$SUBLOOP_RESERVED_INITIALIZE_SIMPLE_STRING_INDEX_CLASS );
    classes.subloop_note_instance_initialization_function( $sym106$SIMPLE_STRING_INDEX, $sym109$SUBLOOP_RESERVED_INITIALIZE_SIMPLE_STRING_INDEX_INSTANCE );
    subloop_reserved_initialize_simple_string_index_class( $sym106$SIMPLE_STRING_INDEX );
    methods.methods_incorporate_instance_method( $sym89$INITIALIZE, $sym106$SIMPLE_STRING_INDEX, $list90, NIL, $list110 );
    methods.subloop_register_instance_method( $sym106$SIMPLE_STRING_INDEX, $sym89$INITIALIZE, $sym113$SIMPLE_STRING_INDEX_INITIALIZE_METHOD );
    methods.methods_incorporate_instance_method( $sym76$LOOKUP, $sym106$SIMPLE_STRING_INDEX, $list13, $list114, $list115 );
    methods.subloop_register_instance_method( $sym106$SIMPLE_STRING_INDEX, $sym76$LOOKUP, $sym117$SIMPLE_STRING_INDEX_LOOKUP_METHOD );
    methods.methods_incorporate_instance_method( $sym118$REMOVE_VALUE, $sym106$SIMPLE_STRING_INDEX, $list13, $list30, $list119 );
    methods.subloop_register_instance_method( $sym106$SIMPLE_STRING_INDEX, $sym118$REMOVE_VALUE, $sym121$SIMPLE_STRING_INDEX_REMOVE_VALUE_METHOD );
    classes.subloop_new_class( $sym112$STRING_INDEX_ENTRY_COMPUTER, $sym5$INDEX_ENTRY_COMPUTER, NIL, NIL, $list122 );
    classes.class_set_implements_slot_listeners( $sym112$STRING_INDEX_ENTRY_COMPUTER, NIL );
    classes.subloop_note_class_initialization_function( $sym112$STRING_INDEX_ENTRY_COMPUTER, $sym123$SUBLOOP_RESERVED_INITIALIZE_STRING_INDEX_ENTRY_COMPUTER_CLASS );
    classes.subloop_note_instance_initialization_function( $sym112$STRING_INDEX_ENTRY_COMPUTER, $sym124$SUBLOOP_RESERVED_INITIALIZE_STRING_INDEX_ENTRY_COMPUTER_INSTANCE );
    subloop_reserved_initialize_string_index_entry_computer_class( $sym112$STRING_INDEX_ENTRY_COMPUTER );
    methods.methods_incorporate_instance_method( $sym22$COMPUTE_INDEX_ENTRIES, $sym112$STRING_INDEX_ENTRY_COMPUTER, $list90, $list26, $list125 );
    methods.subloop_register_instance_method( $sym112$STRING_INDEX_ENTRY_COMPUTER, $sym22$COMPUTE_INDEX_ENTRIES, $sym126$STRING_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIES_METHOD );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inverted_index_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inverted_index_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inverted_index_file();
  }
  static
  {
    me = new inverted_index();
    $dtp_indexed_items$ = null;
    $sym0$INVERTED_INDEX = makeSymbol( "INVERTED-INDEX" );
    $sym1$OBJECT = makeSymbol( "OBJECT" );
    $list2 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "PHYSICAL-INDEX" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "INDEX-ENTRY-COMPUTER" ), makeKeyword(
        "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "VALUE-TEST" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "INDEXED-ITEMS" ), makeKeyword(
            "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INDEX-AN-ITEM" ), ConsesLow.list( makeSymbol( "INDEX-ITEM" ) ), makeKeyword( "PUBLIC" ) ),
      ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INSERT" ), ConsesLow.list( makeSymbol( "INDEX-ENTRY" ) ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ),
          makeSymbol( "REMOVE-KEY" ), ConsesLow.list( makeSymbol( "INDEX-ITEM" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "LOOKUP" ), ConsesLow.list( makeSymbol(
              "INDEXABLE" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "COMPUTE-INDEX-ENTRIES" ), ConsesLow.list( makeSymbol( "INDEX-ITEM" ) ), makeKeyword(
                  "PRIVATE" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol(
                      "ISOLATE" ), NIL, makeKeyword( "PUBLIC" ) )
    } );
    $sym3$INDEXED_ITEMS = makeSymbol( "INDEXED-ITEMS" );
    $sym4$VALUE_TEST = makeSymbol( "VALUE-TEST" );
    $sym5$INDEX_ENTRY_COMPUTER = makeSymbol( "INDEX-ENTRY-COMPUTER" );
    $sym6$PHYSICAL_INDEX = makeSymbol( "PHYSICAL-INDEX" );
    $sym7$INSTANCE_COUNT = makeSymbol( "INSTANCE-COUNT" );
    $sym8$SUBLOOP_RESERVED_INITIALIZE_INVERTED_INDEX_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-INVERTED-INDEX-CLASS" );
    $sym9$ISOLATED_P = makeSymbol( "ISOLATED-P" );
    $sym10$INSTANCE_NUMBER = makeSymbol( "INSTANCE-NUMBER" );
    $sym11$SUBLOOP_RESERVED_INITIALIZE_INVERTED_INDEX_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-INVERTED-INDEX-INSTANCE" );
    $sym12$ISOLATE = makeSymbol( "ISOLATE" );
    $list13 = ConsesLow.list( makeKeyword( "PUBLIC" ) );
    $list14 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PHYSICAL-INDEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "ISOLATE" ) ) ), ConsesLow.list( makeSymbol(
        "ISOLATE" ), makeSymbol( "SUPER" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym15$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-INVERTED-INDEX-METHOD" );
    $sym16$INVERTED_INDEX_ISOLATE_METHOD = makeSymbol( "INVERTED-INDEX-ISOLATE-METHOD" );
    $sym17$INDEX_AN_ITEM = makeSymbol( "INDEX-AN-ITEM" );
    $list18 = ConsesLow.list( makeSymbol( "INDEX-ITEM" ) );
    $list19 = ConsesLow.list( ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "INDEX-ENTRY-COMPUTER-P" ), makeSymbol( "INDEX-ENTRY-COMPUTER" ) ), ConsesLow.list(
        makeSymbol( "PHYSICAL-INDEX-P" ), makeSymbol( "PHYSICAL-INDEX" ) ) ), ConsesLow.list( makeSymbol( "ERROR" ), makeString( "trying to index ~S before the index has been properly initialized" ), makeSymbol(
            "INDEX-ITEM" ) ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "ENTRIES" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol(
                "INDEX-ENTRY-COMPUTER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "COMPUTE-INDEX-ENTRIES" ) ), makeSymbol( "INDEX-ITEM" ) ) ) ), ConsesLow.list( makeSymbol( "CDOLIST" ), ConsesLow.list(
                    makeSymbol( "ENTRY" ), makeSymbol( "ENTRIES" ) ), ConsesLow.list( makeSymbol( "FIM" ), makeSymbol( "PHYSICAL-INDEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INSERT" ) ), makeSymbol(
                        "ENTRY" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym20$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-INVERTED-INDEX-METHOD" );
    $str21$trying_to_index__S_before_the_ind = makeString( "trying to index ~S before the index has been properly initialized" );
    $sym22$COMPUTE_INDEX_ENTRIES = makeSymbol( "COMPUTE-INDEX-ENTRIES" );
    $sym23$INSERT = makeSymbol( "INSERT" );
    $sym24$INVERTED_INDEX_INDEX_AN_ITEM_METHOD = makeSymbol( "INVERTED-INDEX-INDEX-AN-ITEM-METHOD" );
    $list25 = ConsesLow.list( makeKeyword( "PRIVATE" ) );
    $list26 = ConsesLow.list( makeSymbol( "ITEM-TO-INDEX" ) );
    $list27 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "INDEX-ENTRY-COMPUTER" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "COMPUTE-INDEX-ENTRIES" ) ), makeSymbol( "ITEM-TO-INDEX" ) ) ) );
    $sym28$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-INVERTED-INDEX-METHOD" );
    $sym29$INVERTED_INDEX_COMPUTE_INDEX_ENTRIES_METHOD = makeSymbol( "INVERTED-INDEX-COMPUTE-INDEX-ENTRIES-METHOD" );
    $list30 = ConsesLow.list( makeSymbol( "INDEX-ENTRY" ) );
    $list31 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PHYSICAL-INDEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "INSERT" ) ),
        makeSymbol( "INDEX-ENTRY" ) ) ) );
    $sym32$OUTER_CATCH_FOR_INVERTED_INDEX_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-INVERTED-INDEX-METHOD" );
    $sym33$INVERTED_INDEX_INSERT_METHOD = makeSymbol( "INVERTED-INDEX-INSERT-METHOD" );
    $sym34$INDEXED_ITEMS_P = makeSymbol( "INDEXED-ITEMS-P" );
    $list35 = ConsesLow.list( makeSymbol( "NEXT-INDEX" ), makeSymbol( "ITEM-SUID-MAP" ), makeSymbol( "SUID-ITEM-MAP" ) );
    $list36 = ConsesLow.list( makeKeyword( "NEXT-INDEX" ), makeKeyword( "ITEM-SUID-MAP" ), makeKeyword( "SUID-ITEM-MAP" ) );
    $list37 = ConsesLow.list( makeSymbol( "INDEXED-ITEMS-NEXT-INDEX" ), makeSymbol( "INDEXED-ITEMS-ITEM-SUID-MAP" ), makeSymbol( "INDEXED-ITEMS-SUID-ITEM-MAP" ) );
    $list38 = ConsesLow.list( makeSymbol( "_CSETF-INDEXED-ITEMS-NEXT-INDEX" ), makeSymbol( "_CSETF-INDEXED-ITEMS-ITEM-SUID-MAP" ), makeSymbol( "_CSETF-INDEXED-ITEMS-SUID-ITEM-MAP" ) );
    $sym39$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym40$INDEXED_ITEMS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "INDEXED-ITEMS-PRINT-FUNCTION-TRAMPOLINE" );
    $list41 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "INDEXED-ITEMS-P" ) );
    $sym42$INDEXED_ITEMS_NEXT_INDEX = makeSymbol( "INDEXED-ITEMS-NEXT-INDEX" );
    $sym43$_CSETF_INDEXED_ITEMS_NEXT_INDEX = makeSymbol( "_CSETF-INDEXED-ITEMS-NEXT-INDEX" );
    $sym44$INDEXED_ITEMS_ITEM_SUID_MAP = makeSymbol( "INDEXED-ITEMS-ITEM-SUID-MAP" );
    $sym45$_CSETF_INDEXED_ITEMS_ITEM_SUID_MAP = makeSymbol( "_CSETF-INDEXED-ITEMS-ITEM-SUID-MAP" );
    $sym46$INDEXED_ITEMS_SUID_ITEM_MAP = makeSymbol( "INDEXED-ITEMS-SUID-ITEM-MAP" );
    $sym47$_CSETF_INDEXED_ITEMS_SUID_ITEM_MAP = makeSymbol( "_CSETF-INDEXED-ITEMS-SUID-ITEM-MAP" );
    $kw48$NEXT_INDEX = makeKeyword( "NEXT-INDEX" );
    $kw49$ITEM_SUID_MAP = makeKeyword( "ITEM-SUID-MAP" );
    $kw50$SUID_ITEM_MAP = makeKeyword( "SUID-ITEM-MAP" );
    $str51$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw52$BEGIN = makeKeyword( "BEGIN" );
    $sym53$MAKE_INDEXED_ITEMS = makeSymbol( "MAKE-INDEXED-ITEMS" );
    $kw54$SLOT = makeKeyword( "SLOT" );
    $kw55$END = makeKeyword( "END" );
    $sym56$VISIT_DEFSTRUCT_OBJECT_INDEXED_ITEMS_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-INDEXED-ITEMS-METHOD" );
    $int57$50 = makeInteger( 50 );
    $list58 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "COMPUTE-INDEX-ENTRIES" ), ConsesLow.list( makeSymbol( "ITEM-TO-INDEX" ) ), makeKeyword( "PROTECTED" ) ) );
    $sym59$SUBLOOP_RESERVED_INITIALIZE_INDEX_ENTRY_COMPUTER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-INDEX-ENTRY-COMPUTER-CLASS" );
    $sym60$SUBLOOP_RESERVED_INITIALIZE_INDEX_ENTRY_COMPUTER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-INDEX-ENTRY-COMPUTER-INSTANCE" );
    $list61 = ConsesLow.list( ConsesLow.list( makeSymbol( "INDEX-STRUCTURE" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "ISOLATE" ), NIL,
        makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INSERT" ), ConsesLow.list( makeSymbol( "INDEX-ENTRY" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol(
            "DEF-INSTANCE-METHOD" ), makeSymbol( "LOOKUP" ), ConsesLow.list( makeSymbol( "INDEX-KEY" ) ), makeKeyword( "PUBLIC" ) ), ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "REMOVE" ), ConsesLow
                .list( makeSymbol( "INDEX-ENTRY" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym62$INDEX_STRUCTURE = makeSymbol( "INDEX-STRUCTURE" );
    $sym63$SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_INDEX_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-INDEX-CLASS" );
    $sym64$SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_INDEX_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-INDEX-INSTANCE" );
    $sym65$IN_MEMORY_INDEX = makeSymbol( "IN-MEMORY-INDEX" );
    $list66 = ConsesLow.list( ConsesLow.list( makeSymbol( "DICTIONARY-INDEX" ), makeKeyword( "INSTANCE" ), makeKeyword( "PROTECTED" ) ), ConsesLow.list( makeSymbol( "VAL-TEST" ), makeKeyword( "INSTANCE" ), makeKeyword(
        "PROTECTED" ) ) );
    $sym67$VAL_TEST = makeSymbol( "VAL-TEST" );
    $sym68$DICTIONARY_INDEX = makeSymbol( "DICTIONARY-INDEX" );
    $sym69$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_INDEX_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-INDEX-CLASS" );
    $sym70$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_INDEX_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-INDEX-INSTANCE" );
    $list71 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym72$IN_MEMORY_INDEX_ISOLATE_METHOD = makeSymbol( "IN-MEMORY-INDEX-ISOLATE-METHOD" );
    $list73 = ConsesLow.list( ConsesLow.list( makeSymbol( "DICTIONARY-PUSHNEW" ), makeSymbol( "DICTIONARY-INDEX" ), ConsesLow.list( makeSymbol( "INDEX-ENTRY-KEY" ), makeSymbol( "INDEX-ENTRY" ) ), ConsesLow.list(
        makeSymbol( "INDEX-ENTRY-VALUE" ), makeSymbol( "INDEX-ENTRY" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym74$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-IN-MEMORY-INDEX-METHOD" );
    $sym75$IN_MEMORY_INDEX_INSERT_METHOD = makeSymbol( "IN-MEMORY-INDEX-INSERT-METHOD" );
    $sym76$LOOKUP = makeSymbol( "LOOKUP" );
    $list77 = ConsesLow.list( makeSymbol( "INDEX-KEY" ) );
    $list78 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "DICTIONARY-LOOKUP" ), makeSymbol( "DICTIONARY-INDEX" ), makeSymbol( "INDEX-KEY" ) ) ) );
    $sym79$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-IN-MEMORY-INDEX-METHOD" );
    $sym80$IN_MEMORY_INDEX_LOOKUP_METHOD = makeSymbol( "IN-MEMORY-INDEX-LOOKUP-METHOD" );
    $sym81$REMOVE = makeSymbol( "REMOVE" );
    $list82 = ConsesLow.list( ConsesLow.list( makeSymbol( "DICTIONARY-REMOVE-FROM-VALUE" ), makeSymbol( "DICTIONARY-INDEX" ), ConsesLow.list( makeSymbol( "INDEX-ENTRY-KEY" ), makeSymbol( "INDEX-ENTRY" ) ), ConsesLow
        .list( makeSymbol( "INDEX-ENTRY-VALUE" ), makeSymbol( "INDEX-ENTRY" ) ), makeSymbol( "VAL-TEST" ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym83$OUTER_CATCH_FOR_IN_MEMORY_INDEX_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-IN-MEMORY-INDEX-METHOD" );
    $sym84$IN_MEMORY_INDEX_REMOVE_METHOD = makeSymbol( "IN-MEMORY-INDEX-REMOVE-METHOD" );
    $sym85$IN_MEMORY_EQUALP_INDEX = makeSymbol( "IN-MEMORY-EQUALP-INDEX" );
    $list86 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PRIVATE" ) ) );
    $sym87$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUALP_INDEX_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUALP-INDEX-CLASS" );
    $sym88$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUALP_INDEX_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUALP-INDEX-INSTANCE" );
    $sym89$INITIALIZE = makeSymbol( "INITIALIZE" );
    $list90 = ConsesLow.list( makeKeyword( "PROTECTED" ) );
    $list91 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "VAL-TEST" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQUALP ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DICTIONARY-INDEX" ),
        ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ), makeSymbol( "VAL-TEST" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym92$OUTER_CATCH_FOR_IN_MEMORY_EQUALP_INDEX_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-IN-MEMORY-EQUALP-INDEX-METHOD" );
    $sym93$IN_MEMORY_EQUALP_INDEX_INITIALIZE_METHOD = makeSymbol( "IN-MEMORY-EQUALP-INDEX-INITIALIZE-METHOD" );
    $sym94$IN_MEMORY_EQUAL_INDEX = makeSymbol( "IN-MEMORY-EQUAL-INDEX" );
    $sym95$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUAL_INDEX_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUAL-INDEX-CLASS" );
    $sym96$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQUAL_INDEX_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQUAL-INDEX-INSTANCE" );
    $list97 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "VAL-TEST" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DICTIONARY-INDEX" ),
        ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ), makeSymbol( "VAL-TEST" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym98$OUTER_CATCH_FOR_IN_MEMORY_EQUAL_INDEX_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-IN-MEMORY-EQUAL-INDEX-METHOD" );
    $sym99$IN_MEMORY_EQUAL_INDEX_INITIALIZE_METHOD = makeSymbol( "IN-MEMORY-EQUAL-INDEX-INITIALIZE-METHOD" );
    $sym100$IN_MEMORY_EQ_INDEX = makeSymbol( "IN-MEMORY-EQ-INDEX" );
    $sym101$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQ_INDEX_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQ-INDEX-CLASS" );
    $sym102$SUBLOOP_RESERVED_INITIALIZE_IN_MEMORY_EQ_INDEX_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-IN-MEMORY-EQ-INDEX-INSTANCE" );
    $list103 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "VAL-TEST" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQ ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "DICTIONARY-INDEX" ),
        ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ), makeSymbol( "VAL-TEST" ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym104$OUTER_CATCH_FOR_IN_MEMORY_EQ_INDEX_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-IN-MEMORY-EQ-INDEX-METHOD" );
    $sym105$IN_MEMORY_EQ_INDEX_INITIALIZE_METHOD = makeSymbol( "IN-MEMORY-EQ-INDEX-INITIALIZE-METHOD" );
    $sym106$SIMPLE_STRING_INDEX = makeSymbol( "SIMPLE-STRING-INDEX" );
    $list107 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "INITIALIZE" ), NIL, makeKeyword( "PUBLIC" ) ) );
    $sym108$SUBLOOP_RESERVED_INITIALIZE_SIMPLE_STRING_INDEX_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SIMPLE-STRING-INDEX-CLASS" );
    $sym109$SUBLOOP_RESERVED_INITIALIZE_SIMPLE_STRING_INDEX_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-SIMPLE-STRING-INDEX-INSTANCE" );
    $list110 = ConsesLow.list( ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INDEXED-ITEMS" ), ConsesLow.list( makeSymbol( "NEW-INDEXED-ITEMS" ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
        "VALUE-TEST" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUALP ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "INDEX-ENTRY-COMPUTER" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ), ConsesLow
            .list( makeSymbol( "QUOTE" ), makeSymbol( "STRING-INDEX-ENTRY-COMPUTER" ) ) ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "PHYSICAL-INDEX" ), ConsesLow.list( makeSymbol( "NEW-CLASS-INSTANCE" ),
                ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "IN-MEMORY-EQUALP-INDEX" ) ) ) ), ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym111$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SIMPLE-STRING-INDEX-METHOD" );
    $sym112$STRING_INDEX_ENTRY_COMPUTER = makeSymbol( "STRING-INDEX-ENTRY-COMPUTER" );
    $sym113$SIMPLE_STRING_INDEX_INITIALIZE_METHOD = makeSymbol( "SIMPLE-STRING-INDEX-INITIALIZE-METHOD" );
    $list114 = ConsesLow.list( makeSymbol( "KEY" ) );
    $list115 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PHYSICAL-INDEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol(
        "LOOKUP" ) ), makeSymbol( "KEY" ) ) ) );
    $sym116$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SIMPLE-STRING-INDEX-METHOD" );
    $sym117$SIMPLE_STRING_INDEX_LOOKUP_METHOD = makeSymbol( "SIMPLE-STRING-INDEX-LOOKUP-METHOD" );
    $sym118$REMOVE_VALUE = makeSymbol( "REMOVE-VALUE" );
    $list119 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCALL-INSTANCE-METHOD" ), makeSymbol( "PHYSICAL-INDEX" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "REMOVE" ) ), makeSymbol( "INDEX-ENTRY" ) ),
        ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "SELF" ) ) );
    $sym120$OUTER_CATCH_FOR_SIMPLE_STRING_INDEX_METHOD = makeUninternedSymbol( "OUTER-CATCH-FOR-SIMPLE-STRING-INDEX-METHOD" );
    $sym121$SIMPLE_STRING_INDEX_REMOVE_VALUE_METHOD = makeSymbol( "SIMPLE-STRING-INDEX-REMOVE-VALUE-METHOD" );
    $list122 = ConsesLow.list( ConsesLow.list( makeSymbol( "DEF-INSTANCE-METHOD" ), makeSymbol( "COMPUTE-INDEX-ENTRIES" ), ConsesLow.list( makeSymbol( "ITEM-TO-INDEX" ) ), makeKeyword( "PUBLIC" ) ) );
    $sym123$SUBLOOP_RESERVED_INITIALIZE_STRING_INDEX_ENTRY_COMPUTER_CLASS = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-STRING-INDEX-ENTRY-COMPUTER-CLASS" );
    $sym124$SUBLOOP_RESERVED_INITIALIZE_STRING_INDEX_ENTRY_COMPUTER_INSTANCE = makeSymbol( "SUBLOOP-RESERVED-INITIALIZE-STRING-INDEX-ENTRY-COMPUTER-INSTANCE" );
    $list125 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "RESULT" ) ) ), ConsesLow.list( makeSymbol( "CDOLIST-NUMBERED" ), ConsesLow.list( makeSymbol( "WORD" ),
        makeSymbol( "NUM" ), ConsesLow.list( makeSymbol( "STRING-TOKENIZE-VIA-WORDIFY" ), makeSymbol( "ITEM-TO-INDEX" ) ) ), ConsesLow.list( makeSymbol( "CPUSH" ), ConsesLow.list( makeSymbol(
            "NEW-INVERTED-INDEX-ENTRY" ), makeSymbol( "WORD" ), ConsesLow.list( makeSymbol( "BQ-LIST" ), makeSymbol( "NUM" ), makeSymbol( "ITEM-TO-INDEX" ) ) ), makeSymbol( "RESULT" ) ) ), ConsesLow.list( makeSymbol(
                "RET" ), makeSymbol( "RESULT" ) ) ) );
    $sym126$STRING_INDEX_ENTRY_COMPUTER_COMPUTE_INDEX_ENTRIES_METHOD = makeSymbol( "STRING-INDEX-ENTRY-COMPUTER-COMPUTE-INDEX-ENTRIES-METHOD" );
  }

  public static final class $indexed_items_native
      extends
        SubLStructNative
  {
    public SubLObject $next_index;
    public SubLObject $item_suid_map;
    public SubLObject $suid_item_map;
    private static final SubLStructDeclNative structDecl;

    public $indexed_items_native()
    {
      this.$next_index = CommonSymbols.NIL;
      this.$item_suid_map = CommonSymbols.NIL;
      this.$suid_item_map = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $indexed_items_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$next_index;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$item_suid_map;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$suid_item_map;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$next_index = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$item_suid_map = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$suid_item_map = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $indexed_items_native.class, $sym3$INDEXED_ITEMS, $sym34$INDEXED_ITEMS_P, $list35, $list36, new String[] { "$next_index", "$item_suid_map", "$suid_item_map"
      }, $list37, $list38, $sym39$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $indexed_items_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $indexed_items_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INDEXED-ITEMS-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return indexed_items_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 421 ms
 * 
 */