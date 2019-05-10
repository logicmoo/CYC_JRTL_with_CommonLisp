package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class interfaces
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.interfaces";
  public static final String myFingerPrint = "611eba854dd7b2fe740e4a095b6ca5fa79f2f577a93f8f5c7bc0d3ccf5f5fdc3";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 830L)
  private static SubLSymbol $interfaces_initial_hashtable_size$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 893L)
  private static SubLSymbol $interfaces_interface_table_update_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 999L)
  private static SubLSymbol $interfaces_interface_table$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1261L)
  private static SubLSymbol $interfaces_alist_of_all_interfaces$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1323L)
  private static SubLSymbol $interfaces_marked_interfaces$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1381L)
  private static SubLSymbol $interface_method_impossible_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1481L)
  private static SubLSymbol $interface_method_required_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17312L)
  private static SubLSymbol $invalid_interface_method_name_message$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18692L)
  private static SubLSymbol $invalid_interface_name_message$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18855L)
  private static SubLSymbol $undeclare_method_name_message$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19029L)
  private static SubLSymbol $non_existing_interface_message$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19162L)
  private static SubLSymbol $invalid_lambda_list_message$;
  private static final SubLInteger $int0$400;
  private static final SubLString $str1$Interface_Table_Update_Lock;
  private static final SubLSymbol $sym2$_INTERFACES_INTERFACE_TABLE_;
  private static final SubLSymbol $sym3$_INTERFACES_ALIST_OF_ALL_INTERFACES_;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$CLET;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$CUNWIND_PROTECT;
  private static final SubLSymbol $sym9$PROGN;
  private static final SubLList $list10;
  private static final SubLString $str11$__Describing_Interface__S;
  private static final SubLString $str12$____name_____S;
  private static final SubLString $str13$____parents_____S;
  private static final SubLString $str14$____compiled_inheritance_path____;
  private static final SubLString $str15$____subinterfaces_____S;
  private static final SubLString $str16$____implementers_____S;
  private static final SubLString $str17$____instance_method_decls_____S;
  private static final SubLString $str18$____class_method_decls_____S;
  private static final SubLString $str19$____compiled_instance_method_decl;
  private static final SubLString $str20$____compiled_class_method_decls__;
  private static final SubLString $str21$____local_class_methods_____S;
  private static final SubLString $str22$____local_instance_methods_____S;
  private static final SubLString $str23$___S_is_not_an_interface_;
  private static final SubLList $list24;
  private static final SubLSymbol $sym25$WITH_LOCK_HELD;
  private static final SubLSymbol $sym26$INTERFACE_DEFINITION_LOCK;
  private static final SubLSymbol $kw27$COMPILED_INHERITANCE_PATH_FROM_ABOVE;
  private static final SubLSymbol $kw28$TRANSMIT_COMPILED_INHERITANCE_PATH_DOWNWARD;
  private static final SubLSymbol $kw29$COMPILE_INSTANCE_METHOD_DECLS_FROM_ABOVE;
  private static final SubLSymbol $sym30$CADR;
  private static final SubLSymbol $kw31$TRANSMIT_COMPILE_INSTANCE_METHOD_DECLS_DOWNWARD;
  private static final SubLSymbol $kw32$COMPILE_CLASS_METHOD_DECLS_FROM_ABOVE;
  private static final SubLSymbol $kw33$TRANSMIT_COMPILE_CLASS_METHOD_DECLS_DOWNWARD;
  private static final SubLString $str34$_P;
  private static final SubLSymbol $sym35$DEFINE_PUBLIC;
  private static final SubLSymbol $sym36$RET;
  private static final SubLSymbol $sym37$SUBLOOP_INSTANCEOF_INTERFACE;
  private static final SubLSymbol $sym38$QUOTE;
  private static final SubLSymbol $sym39$NEW_INTERFACE;
  private static final SubLList $list40;
  private static final SubLSymbol $kw41$EXTENDS;
  private static final SubLString $str42$__Interface_names_must_be_a_symbo;
  private static final SubLString $str43$__Interface_names_must_not_be_NIL;
  private static final SubLString $str44$Interface_;
  private static final SubLString $str45$_Definition_Lock;
  private static final SubLString $str46$___S_is_not_a_valid_parent_interf;
  private static final SubLString $str47$___S_is_not_a_valid_parent_interf;
  private static final SubLString $str48$__Parent_interface__S_is_undefine;
  private static final SubLString $str49$___S_is_not_a_valid_interface_met;
  private static final SubLString $str50$___S_is_not_a_valid_interface_met;
  private static final SubLString $str51$The_interface_method_name__S_is_n;
  private static final SubLString $str52$The_interface_name__S_is_not_a_va;
  private static final SubLString $str53$The_method__S_of_interface__S_is_;
  private static final SubLString $str54$The_interface__S_which_appears_in;
  private static final SubLString $str55$Lambda_list__S_of_method__S_of_in;
  private static final SubLSymbol $sym56$INTERFACES_ADD_INTERFACE_CLASS_METHOD;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$INTERFACES_ADD_INTERFACE_INSTANCE_METHOD;
  private static final SubLSymbol $kw59$INTERFACES_FIND_CLASS_METHOD_INTERNAL;
  private static final SubLSymbol $kw60$INTERFACES_FIND_INSTANCE_METHOD_INTERNAL;
  private static final SubLSymbol $sym61$DEF_CLASS_METHOD;
  private static final SubLSymbol $kw62$BEFORE_LISTENERS;
  private static final SubLSymbol $kw63$AFTER_LISTENERS;
  private static final SubLSymbol $sym64$DEF_INSTANCE_METHOD;
  private static final SubLString $str65$SUBLOOP_ALL_METHODS_OF_INTERFACE_;
  private static final SubLList $list66;
  private static final SubLSymbol $sym67$CLASSES_GETF;
  private static final SubLSymbol $sym68$INTERFACE_PLIST;
  private static final SubLString $str69$interface;
  private static final SubLSymbol $sym70$CSETF;
  private static final SubLSymbol $sym71$CLASSES_PUTF;
  private static final SubLString $str72$queue;
  private static final SubLString $str73$current_interface;
  private static final SubLSymbol $sym74$LIST;
  private static final SubLList $list75;
  private static final SubLSymbol $sym76$WHILE;
  private static final SubLSymbol $sym77$CSETQ;
  private static final SubLSymbol $sym78$CAR;
  private static final SubLSymbol $sym79$CPOP;
  private static final SubLSymbol $sym80$NCONC;
  private static final SubLSymbol $sym81$COPY_LIST;
  private static final SubLSymbol $sym82$INTERFACE_PARENTS;
  private static final SubLSymbol $sym83$INTERFACES_RETRIEVE_INTERFACE;
  private static final SubLList $list84;
  private static final SubLSymbol $sym85$INTERFACE_SUBINTERFACES;
  private static final SubLString $str86$next_generation;
  private static final SubLSymbol $sym87$CONS;
  private static final SubLList $list88;
  private static final SubLSymbol $sym89$CDR;
  private static final SubLList $list90;
  private static final SubLSymbol $sym91$NEW_DEPTH;
  private static final SubLSymbol $sym92$_;
  private static final SubLList $list93;
  private static final SubLSymbol $sym94$CDOLIST_COLLECTING;
  private static final SubLSymbol $sym95$INTERFACE_NAME;
  private static final SubLList $list96;
  private static final SubLList $list97;
  private static final SubLList $list98;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1102L)
  public static SubLObject interfaces_reset_interface_table()
  {
    $interfaces_interface_table$.setGlobalValue( Hashtables.make_hash_table( $interfaces_initial_hashtable_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1566L)
  public static SubLObject with_interface_marking(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym6$CLET, $list7, ConsesLow.listS( $sym8$CUNWIND_PROTECT, reader.bq_cons( $sym9$PROGN, body ), $list10 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1799L)
  public static SubLObject display_interface(final SubLObject interface_or_interface_name, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    final SubLObject v_interface = ( NIL != subloop_structures.interface_p( interface_or_interface_name ) ) ? interface_or_interface_name : interfaces_retrieve_interface( interface_or_interface_name );
    if( NIL != v_interface )
    {
      final SubLObject v_interface_$1 = v_interface;
      final SubLObject name = subloop_structures.interface_name( v_interface_$1 );
      final SubLObject parents = subloop_structures.interface_parents( v_interface_$1 );
      final SubLObject compiled_inheritance_path = subloop_structures.interface_compiled_inheritance_path( v_interface_$1 );
      final SubLObject subinterfaces = subloop_structures.interface_subinterfaces( v_interface_$1 );
      final SubLObject implementers = subloop_structures.interface_implementers( v_interface_$1 );
      final SubLObject instance_method_decls = subloop_structures.interface_instance_method_decls( v_interface_$1 );
      final SubLObject class_method_decls = subloop_structures.interface_class_method_decls( v_interface_$1 );
      final SubLObject compiled_instance_method_decls = subloop_structures.interface_compiled_instance_method_decls( v_interface_$1 );
      final SubLObject compiled_class_method_decls = subloop_structures.interface_compiled_class_method_decls( v_interface_$1 );
      final SubLObject local_class_methods = subloop_structures.interface_local_class_methods( v_interface_$1 );
      final SubLObject local_instance_methods = subloop_structures.interface_local_instance_methods( v_interface_$1 );
      PrintLow.format( stream, $str11$__Describing_Interface__S, v_interface );
      PrintLow.format( stream, $str12$____name_____S, name );
      PrintLow.format( stream, $str13$____parents_____S, parents );
      PrintLow.format( stream, $str14$____compiled_inheritance_path____, compiled_inheritance_path );
      PrintLow.format( stream, $str15$____subinterfaces_____S, subinterfaces );
      PrintLow.format( stream, $str16$____implementers_____S, implementers );
      PrintLow.format( stream, $str17$____instance_method_decls_____S, instance_method_decls );
      PrintLow.format( stream, $str18$____class_method_decls_____S, class_method_decls );
      PrintLow.format( stream, $str19$____compiled_instance_method_decl, compiled_instance_method_decls );
      PrintLow.format( stream, $str20$____compiled_class_method_decls__, compiled_class_method_decls );
      PrintLow.format( stream, $str21$____local_class_methods_____S, local_class_methods );
      PrintLow.format( stream, $str22$____local_instance_methods_____S, local_instance_methods );
    }
    else
    {
      PrintLow.format( stream, $str23$___S_is_not_an_interface_, interface_or_interface_name );
    }
    return v_interface;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3034L)
  public static SubLObject with_interface_definition_lock(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_interface = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
    v_interface = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym25$WITH_LOCK_HELD, ConsesLow.list( ConsesLow.list( $sym26$INTERFACE_DEFINITION_LOCK, v_interface ) ), body );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3213L)
  public static SubLObject interfaces_mark_interface(final SubLObject v_interface, final SubLObject mark)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mark_list = subloop_structures.interface_mark_list( v_interface );
    if( NIL != mark_list )
    {
      if( NIL == conses_high.member( mark, subloop_structures.interface_mark_list( v_interface ), Symbols.symbol_function( EQ ), Symbols.symbol_function( IDENTITY ) ) )
      {
        subloop_structures._csetf_interface_mark_list( v_interface, ConsesLow.cons( mark, subloop_structures.interface_mark_list( v_interface ) ) );
      }
    }
    else
    {
      subloop_structures._csetf_interface_mark_list( v_interface, ConsesLow.list( mark ) );
      $interfaces_marked_interfaces$.setDynamicValue( ConsesLow.cons( v_interface, $interfaces_marked_interfaces$.getDynamicValue( thread ) ), thread );
    }
    return mark;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3561L)
  public static SubLObject interfaces_remove_mark(final SubLObject v_interface, final SubLObject mark)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject mark_list = subloop_structures.interface_mark_list( v_interface );
    if( NIL != mark_list )
    {
      mark_list = Sequences.delete( mark, mark_list, Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      subloop_structures._csetf_interface_mark_list( v_interface, mark_list );
      if( NIL == mark_list )
      {
        $interfaces_marked_interfaces$.setDynamicValue( Sequences.delete( v_interface, $interfaces_marked_interfaces$.getDynamicValue( thread ), Symbols.symbol_function( EQ ), UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED ), thread );
      }
    }
    return mark;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3947L)
  public static SubLObject interfaces_marked_p(final SubLObject v_interface, final SubLObject mark)
  {
    return ( NIL != conses_high.member( mark, subloop_structures.interface_mark_list( v_interface ), Symbols.symbol_function( EQ ), UNPROVIDED ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4073L)
  public static SubLObject interfaces_unmark_all_marked_interfaces(final SubLObject v_interfaces)
  {
    SubLObject cdolist_list_var = v_interfaces;
    SubLObject v_interface = NIL;
    v_interface = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      subloop_structures._csetf_interface_mark_list( v_interface, NIL );
      cdolist_list_var = cdolist_list_var.rest();
      v_interface = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4239L)
  public static SubLObject interfaces_retrieve_interface(final SubLObject interface_name)
  {
    if( interface_name.isSymbol() )
    {
      return Hashtables.gethash( interface_name, $interfaces_interface_table$.getGlobalValue(), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4442L)
  public static SubLObject interfaces_intern_interface(final SubLObject interface_name, final SubLObject v_interface)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $interfaces_interface_table_update_lock$.getDynamicValue( thread ) );
      if( interface_name.isSymbol() && NIL != subloop_structures.interface_p( v_interface ) )
      {
        Hashtables.sethash( interface_name, $interfaces_interface_table$.getGlobalValue(), v_interface );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $interfaces_interface_table_update_lock$.getDynamicValue( thread ) );
      }
    }
    return v_interface;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4741L)
  public static SubLObject interfaces_delete_interface(final SubLObject interface_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $interfaces_interface_table_update_lock$.getDynamicValue( thread ) );
      if( interface_name.isSymbol() )
      {
        Hashtables.remhash( interface_name, $interfaces_interface_table$.getGlobalValue() );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $interfaces_interface_table_update_lock$.getDynamicValue( thread ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4975L)
  public static SubLObject interfaces_compile_inheritance_path_from_above(final SubLObject v_interface)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $interfaces_marked_interfaces$.currentBinding( thread );
    try
    {
      $interfaces_marked_interfaces$.bind( NIL, thread );
      try
      {
        interfaces_mark_interface( v_interface, $kw27$COMPILED_INHERITANCE_PATH_FROM_ABOVE );
        interfaces_compile_inheritance_path_from_above_aux( v_interface );
        interfaces_transmit_compiled_inheritance_path_downward( v_interface );
      }
      finally
      {
        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          interfaces_unmark_all_marked_interfaces( $interfaces_marked_interfaces$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
        }
      }
    }
    finally
    {
      $interfaces_marked_interfaces$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5345L)
  public static SubLObject interfaces_compile_inheritance_path_from_above_aux(final SubLObject v_interface)
  {
    final SubLObject name = subloop_structures.interface_name( v_interface );
    final SubLObject parents = subloop_structures.interface_parents( v_interface );
    SubLObject parent_interface = NIL;
    SubLObject parent_inheritance_path = NIL;
    SubLObject intermediate_path = NIL;
    SubLObject new_inheritance_path = NIL;
    SubLObject cdolist_list_var = parents;
    SubLObject parent = NIL;
    parent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      parent_interface = interfaces_retrieve_interface( parent );
      if( NIL != parent_interface )
      {
        if( NIL != interfaces_marked_p( parent_interface, $kw27$COMPILED_INHERITANCE_PATH_FROM_ABOVE ) )
        {
          parent_inheritance_path = subloop_structures.interface_compiled_inheritance_path( parent_interface );
        }
        else
        {
          interfaces_mark_interface( parent_interface, $kw27$COMPILED_INHERITANCE_PATH_FROM_ABOVE );
          parent_inheritance_path = interfaces_compile_inheritance_path_from_above_aux( parent_interface );
        }
        final SubLObject item_var = name;
        if( NIL == conses_high.member( item_var, subloop_structures.interface_subinterfaces( parent_interface ), Symbols.symbol_function( EQ ), Symbols.symbol_function( IDENTITY ) ) )
        {
          subloop_structures._csetf_interface_subinterfaces( parent_interface, ConsesLow.cons( item_var, subloop_structures.interface_subinterfaces( parent_interface ) ) );
        }
        intermediate_path = NIL;
        SubLObject cdolist_list_var_$4 = parent_inheritance_path;
        SubLObject grand_parent = NIL;
        grand_parent = cdolist_list_var_$4.first();
        while ( NIL != cdolist_list_var_$4)
        {
          if( NIL == conses_high.member( grand_parent, new_inheritance_path, Symbols.symbol_function( EQ ), UNPROVIDED ) )
          {
            intermediate_path = ConsesLow.cons( grand_parent, intermediate_path );
          }
          cdolist_list_var_$4 = cdolist_list_var_$4.rest();
          grand_parent = cdolist_list_var_$4.first();
        }
        if( NIL == conses_high.member( parent_interface, new_inheritance_path, Symbols.symbol_function( EQ ), UNPROVIDED ) )
        {
          intermediate_path = ConsesLow.cons( parent_interface, intermediate_path );
        }
        new_inheritance_path = ConsesLow.nconc( new_inheritance_path, intermediate_path );
      }
      cdolist_list_var = cdolist_list_var.rest();
      parent = cdolist_list_var.first();
    }
    subloop_structures._csetf_interface_compiled_inheritance_path( v_interface, new_inheritance_path );
    return new_inheritance_path;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6668L)
  public static SubLObject interfaces_transmit_compiled_inheritance_path_downward(final SubLObject v_interface)
  {
    interfaces_mark_interface( v_interface, $kw28$TRANSMIT_COMPILED_INHERITANCE_PATH_DOWNWARD );
    interfaces_transmit_compiled_inheritance_path_downward_aux( v_interface );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6923L)
  public static SubLObject interfaces_transmit_compiled_inheritance_path_downward_aux(final SubLObject v_interface)
  {
    final SubLObject subinterfaces = subloop_structures.interface_subinterfaces( v_interface );
    SubLObject subinterface_interface = NIL;
    SubLObject cdolist_list_var = subinterfaces;
    SubLObject subinterface = NIL;
    subinterface = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      subinterface_interface = interfaces_retrieve_interface( subinterface );
      if( NIL != subinterface_interface && NIL == interfaces_marked_p( subinterface_interface, $kw28$TRANSMIT_COMPILED_INHERITANCE_PATH_DOWNWARD ) )
      {
        interfaces_compile_inheritance_path_from_above( subinterface_interface );
        interfaces_mark_interface( subinterface_interface, $kw28$TRANSMIT_COMPILED_INHERITANCE_PATH_DOWNWARD );
        interfaces_transmit_compiled_inheritance_path_downward_aux( subinterface_interface );
      }
      cdolist_list_var = cdolist_list_var.rest();
      subinterface = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7628L)
  public static SubLObject interfaces_compile_instance_method_decls_from_above(final SubLObject v_interface)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $interfaces_marked_interfaces$.currentBinding( thread );
    try
    {
      $interfaces_marked_interfaces$.bind( NIL, thread );
      try
      {
        interfaces_mark_interface( v_interface, $kw29$COMPILE_INSTANCE_METHOD_DECLS_FROM_ABOVE );
        interfaces_compile_instance_method_decls_from_above_aux( v_interface );
        interfaces_transmit_compile_instance_method_decls_downward( v_interface );
      }
      finally
      {
        final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          interfaces_unmark_all_marked_interfaces( $interfaces_marked_interfaces$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
        }
      }
    }
    finally
    {
      $interfaces_marked_interfaces$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8020L)
  public static SubLObject interfaces_compile_instance_method_decls_from_above_aux(final SubLObject v_interface)
  {
    SubLObject result = NIL;
    final SubLObject compiled_inheritance_path = subloop_structures.interface_compiled_inheritance_path( v_interface );
    final SubLObject instance_method_decls = subloop_structures.interface_instance_method_decls( v_interface );
    SubLObject compiled_instance_method_decls = subloop_structures.interface_compiled_instance_method_decls( v_interface );
    try
    {
      SubLObject parent_compiled_instance_method_decls = NIL;
      SubLObject own_decls = NIL;
      SubLObject new_compiled_decls = NIL;
      SubLObject cdolist_list_var = compiled_inheritance_path;
      SubLObject parent_interface = NIL;
      parent_interface = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != interfaces_marked_p( parent_interface, $kw29$COMPILE_INSTANCE_METHOD_DECLS_FROM_ABOVE ) )
        {
          parent_compiled_instance_method_decls = conses_high.copy_list( subloop_structures.interface_compiled_instance_method_decls( parent_interface ) );
        }
        else
        {
          interfaces_mark_interface( parent_interface, $kw29$COMPILE_INSTANCE_METHOD_DECLS_FROM_ABOVE );
          parent_compiled_instance_method_decls = interfaces_compile_instance_method_decls_from_above_aux( parent_interface );
        }
        SubLObject cdolist_list_var_$8 = parent_compiled_instance_method_decls;
        SubLObject decl = NIL;
        decl = cdolist_list_var_$8.first();
        while ( NIL != cdolist_list_var_$8)
        {
          if( NIL == conses_high.member( conses_high.cadr( decl ), new_compiled_decls, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym30$CADR ) ) )
          {
            new_compiled_decls = ConsesLow.cons( decl, new_compiled_decls );
          }
          cdolist_list_var_$8 = cdolist_list_var_$8.rest();
          decl = cdolist_list_var_$8.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        parent_interface = cdolist_list_var.first();
      }
      cdolist_list_var = instance_method_decls;
      SubLObject decl2 = NIL;
      decl2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == conses_high.member( conses_high.cadr( decl2 ), new_compiled_decls, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym30$CADR ) ) )
        {
          own_decls = ConsesLow.cons( decl2, own_decls );
        }
        cdolist_list_var = cdolist_list_var.rest();
        decl2 = cdolist_list_var.first();
      }
      compiled_instance_method_decls = ( result = ConsesLow.nconc( Sequences.nreverse( own_decls ), Sequences.nreverse( new_compiled_decls ) ) );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        subloop_structures._csetf_interface_compiled_inheritance_path( v_interface, compiled_inheritance_path );
        subloop_structures._csetf_interface_instance_method_decls( v_interface, instance_method_decls );
        subloop_structures._csetf_interface_compiled_instance_method_decls( v_interface, compiled_instance_method_decls );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9254L)
  public static SubLObject interfaces_transmit_compile_instance_method_decls_downward(final SubLObject v_interface)
  {
    interfaces_mark_interface( v_interface, $kw31$TRANSMIT_COMPILE_INSTANCE_METHOD_DECLS_DOWNWARD );
    interfaces_transmit_compile_instance_method_decls_downward_aux( v_interface );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9521L)
  public static SubLObject interfaces_transmit_compile_instance_method_decls_downward_aux(final SubLObject v_interface)
  {
    final SubLObject subinterfaces = subloop_structures.interface_subinterfaces( v_interface );
    SubLObject subinterface_interface = NIL;
    SubLObject cdolist_list_var = subinterfaces;
    SubLObject subinterface = NIL;
    subinterface = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      subinterface_interface = interfaces_retrieve_interface( subinterface );
      if( NIL != subinterface_interface && NIL == interfaces_marked_p( subinterface_interface, $kw31$TRANSMIT_COMPILE_INSTANCE_METHOD_DECLS_DOWNWARD ) )
      {
        interfaces_compile_instance_method_decls_from_above( subinterface_interface );
        interfaces_mark_interface( subinterface_interface, $kw31$TRANSMIT_COMPILE_INSTANCE_METHOD_DECLS_DOWNWARD );
        interfaces_transmit_compile_instance_method_decls_downward_aux( subinterface_interface );
      }
      cdolist_list_var = cdolist_list_var.rest();
      subinterface = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10247L)
  public static SubLObject interfaces_compile_class_method_decls_from_above(final SubLObject v_interface)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $interfaces_marked_interfaces$.currentBinding( thread );
    try
    {
      $interfaces_marked_interfaces$.bind( NIL, thread );
      try
      {
        interfaces_mark_interface( v_interface, $kw32$COMPILE_CLASS_METHOD_DECLS_FROM_ABOVE );
        interfaces_compile_class_method_decls_from_above_aux( v_interface );
        interfaces_transmit_compile_class_method_decls_downward( v_interface );
      }
      finally
      {
        final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          interfaces_unmark_all_marked_interfaces( $interfaces_marked_interfaces$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
        }
      }
    }
    finally
    {
      $interfaces_marked_interfaces$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10624L)
  public static SubLObject interfaces_compile_class_method_decls_from_above_aux(final SubLObject v_interface)
  {
    SubLObject result = NIL;
    final SubLObject compiled_inheritance_path = subloop_structures.interface_compiled_inheritance_path( v_interface );
    final SubLObject class_method_decls = subloop_structures.interface_class_method_decls( v_interface );
    SubLObject compiled_class_method_decls = subloop_structures.interface_compiled_class_method_decls( v_interface );
    try
    {
      SubLObject parent_compiled_class_method_decls = NIL;
      SubLObject own_decls = NIL;
      SubLObject new_compiled_decls = NIL;
      SubLObject cdolist_list_var = compiled_inheritance_path;
      SubLObject parent_interface = NIL;
      parent_interface = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != interfaces_marked_p( parent_interface, $kw32$COMPILE_CLASS_METHOD_DECLS_FROM_ABOVE ) )
        {
          parent_compiled_class_method_decls = conses_high.copy_list( subloop_structures.interface_compiled_class_method_decls( parent_interface ) );
        }
        else
        {
          interfaces_mark_interface( parent_interface, $kw32$COMPILE_CLASS_METHOD_DECLS_FROM_ABOVE );
          parent_compiled_class_method_decls = interfaces_compile_class_method_decls_from_above_aux( parent_interface );
        }
        SubLObject cdolist_list_var_$12 = parent_compiled_class_method_decls;
        SubLObject decl = NIL;
        decl = cdolist_list_var_$12.first();
        while ( NIL != cdolist_list_var_$12)
        {
          if( NIL == conses_high.member( conses_high.cadr( decl ), new_compiled_decls, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym30$CADR ) ) )
          {
            new_compiled_decls = ConsesLow.cons( decl, new_compiled_decls );
          }
          cdolist_list_var_$12 = cdolist_list_var_$12.rest();
          decl = cdolist_list_var_$12.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        parent_interface = cdolist_list_var.first();
      }
      cdolist_list_var = class_method_decls;
      SubLObject decl2 = NIL;
      decl2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == conses_high.member( conses_high.cadr( decl2 ), new_compiled_decls, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym30$CADR ) ) )
        {
          own_decls = ConsesLow.cons( decl2, own_decls );
        }
        cdolist_list_var = cdolist_list_var.rest();
        decl2 = cdolist_list_var.first();
      }
      compiled_class_method_decls = ( result = ConsesLow.nconc( Sequences.nreverse( own_decls ), Sequences.nreverse( new_compiled_decls ) ) );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        subloop_structures._csetf_interface_compiled_inheritance_path( v_interface, compiled_inheritance_path );
        subloop_structures._csetf_interface_class_method_decls( v_interface, class_method_decls );
        subloop_structures._csetf_interface_compiled_class_method_decls( v_interface, compiled_class_method_decls );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11822L)
  public static SubLObject interfaces_transmit_compile_class_method_decls_downward(final SubLObject v_interface)
  {
    interfaces_mark_interface( v_interface, $kw33$TRANSMIT_COMPILE_CLASS_METHOD_DECLS_DOWNWARD );
    interfaces_transmit_compile_class_method_decls_downward_aux( v_interface );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12080L)
  public static SubLObject interfaces_transmit_compile_class_method_decls_downward_aux(final SubLObject v_interface)
  {
    final SubLObject subinterfaces = subloop_structures.interface_subinterfaces( v_interface );
    SubLObject subinterface_interface = NIL;
    SubLObject cdolist_list_var = subinterfaces;
    SubLObject subinterface = NIL;
    subinterface = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      subinterface_interface = interfaces_retrieve_interface( subinterface );
      if( NIL != subinterface_interface && NIL == interfaces_marked_p( subinterface_interface, $kw33$TRANSMIT_COMPILE_CLASS_METHOD_DECLS_DOWNWARD ) )
      {
        interfaces_compile_class_method_decls_from_above( subinterface_interface );
        interfaces_mark_interface( subinterface_interface, $kw33$TRANSMIT_COMPILE_CLASS_METHOD_DECLS_DOWNWARD );
        interfaces_transmit_compile_class_method_decls_downward_aux( subinterface_interface );
      }
      cdolist_list_var = cdolist_list_var.rest();
      subinterface = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12791L)
  public static SubLObject expand_interface_predicator(final SubLObject interface_name)
  {
    final SubLObject predicator_name = Packages.intern( Sequences.cconcatenate( Symbols.symbol_name( interface_name ), $str34$_P ), UNPROVIDED );
    return ConsesLow.list( $sym35$DEFINE_PUBLIC, predicator_name, ConsesLow.list( interface_name ), ConsesLow.list( $sym36$RET, ConsesLow.list( $sym37$SUBLOOP_INSTANCEOF_INTERFACE, interface_name, ConsesLow.list(
        $sym38$QUOTE, interface_name ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13107L)
  public static SubLObject subloop_instanceof_interface(final SubLObject v_object, final SubLObject v_interface)
  {
    if( NIL != subloop_structures.instance_p( v_object ) )
    {
      final SubLObject direct_class = subloop_structures.instance_class( v_object );
      return classes.classes_implements_p( direct_class, v_interface );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13343L)
  public static SubLObject expand_define_interface(final SubLObject interface_name, final SubLObject parent_interfaces, final SubLObject interface_properties, final SubLObject method_decls)
  {
    new_interface( interface_name, parent_interfaces, interface_properties, method_decls );
    return ConsesLow.list( $sym9$PROGN, ConsesLow.list( $sym39$NEW_INTERFACE, ConsesLow.list( $sym38$QUOTE, interface_name ), ConsesLow.list( $sym38$QUOTE, parent_interfaces ), ConsesLow.list( $sym38$QUOTE,
        interface_properties ), ConsesLow.list( $sym38$QUOTE, method_decls ) ), expand_interface_predicator( interface_name ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13701L)
  public static SubLObject define_interface(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject interface_name_and_properties = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list40 );
    interface_name_and_properties = current.first();
    final SubLObject method_decls;
    current = ( method_decls = current.rest() );
    final SubLObject interface_name = interface_name_and_properties.first();
    final SubLObject interface_properties = interface_name_and_properties.rest();
    final SubLObject parent_interfaces = classes.classes_getf( interface_properties, $kw41$EXTENDS );
    return expand_define_interface( interface_name, parent_interfaces, interface_properties, method_decls );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14076L)
  public static SubLObject new_interface(final SubLObject interface_name, SubLObject parent_interfaces, final SubLObject interface_properties, final SubLObject method_decls)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !interface_name.isSymbol() )
    {
      Errors.error( $str42$__Interface_names_must_be_a_symbo, interface_name );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == interface_name )
    {
      Errors.error( $str43$__Interface_names_must_not_be_NIL );
    }
    if( parent_interfaces.isSymbol() && NIL != parent_interfaces )
    {
      parent_interfaces = ConsesLow.list( parent_interfaces );
    }
    interfaces_check_parent_interfaces( parent_interfaces );
    interfaces_must_be_valid_method_interface_decl_list( method_decls );
    SubLObject v_interface = interfaces_retrieve_interface( interface_name );
    final SubLObject apriori_interface = ( NIL != v_interface ) ? T : NIL;
    if( NIL == v_interface )
    {
      v_interface = subloop_structures.make_interface( UNPROVIDED );
      subloop_structures._csetf_interface_definition_lock( v_interface, Locks.make_lock( Sequences.cconcatenate( $str44$Interface_, new SubLObject[] { Symbols.symbol_name( interface_name ), $str45$_Definition_Lock
      } ) ) );
    }
    final SubLObject lock = subloop_structures.interface_definition_lock( v_interface );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject v_interface_$14 = v_interface;
      SubLObject name = subloop_structures.interface_name( v_interface_$14 );
      SubLObject parents = subloop_structures.interface_parents( v_interface_$14 );
      try
      {
        name = interface_name;
        parents = conses_high.copy_list( parent_interfaces );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          subloop_structures._csetf_interface_name( v_interface_$14, name );
          subloop_structures._csetf_interface_parents( v_interface_$14, parents );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
      interfaces_compile_inheritance_path_from_above( v_interface );
      thread.resetMultipleValues();
      final SubLObject new_class_method_decls = classes.class_separate_decls_into_class_and_instance_method_decls( method_decls );
      final SubLObject new_instance_method_decls = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject v_interface_$15 = v_interface;
      SubLObject instance_method_decls = subloop_structures.interface_instance_method_decls( v_interface_$15 );
      SubLObject class_method_decls = subloop_structures.interface_class_method_decls( v_interface_$15 );
      try
      {
        class_method_decls = new_class_method_decls;
        instance_method_decls = new_instance_method_decls;
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          subloop_structures._csetf_interface_instance_method_decls( v_interface_$15, instance_method_decls );
          subloop_structures._csetf_interface_class_method_decls( v_interface_$15, class_method_decls );
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
      interfaces_compile_instance_method_decls_from_above( v_interface );
      interfaces_compile_class_method_decls_from_above( v_interface );
      if( NIL == apriori_interface )
      {
        interfaces_intern_interface( interface_name, v_interface );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return v_interface;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16251L)
  public static SubLObject interfaces_check_parent_interfaces(final SubLObject parent_interfaces)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !parent_interfaces.isList() )
    {
      Errors.error( $str46$___S_is_not_a_valid_parent_interf, parent_interfaces );
    }
    SubLObject cdolist_list_var = parent_interfaces;
    SubLObject parent_interface = NIL;
    parent_interface = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !parent_interface.isSymbol() || NIL == parent_interfaces ) )
      {
        Errors.error( $str47$___S_is_not_a_valid_parent_interf, parent_interface );
      }
      if( NIL == interfaces_retrieve_interface( parent_interface ) )
      {
        Errors.warn( $str48$__Parent_interface__S_is_undefine, parent_interface );
      }
      cdolist_list_var = cdolist_list_var.rest();
      parent_interface = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16767L)
  public static SubLObject interfaces_must_be_valid_method_interface_decl(final SubLObject method_decl)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == classes.classes_valid_method_interface_decl_p( method_decl ) )
    {
      Errors.error( $str49$___S_is_not_a_valid_interface_met, method_decl );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16987L)
  public static SubLObject interfaces_must_be_valid_method_interface_decl_list(final SubLObject method_decl_list)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !method_decl_list.isList() )
    {
      Errors.error( $str50$___S_is_not_a_valid_interface_met, method_decl_list );
    }
    SubLObject cdolist_list_var = method_decl_list;
    SubLObject method_decl = NIL;
    method_decl = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      interfaces_must_be_valid_method_interface_decl( method_decl );
      cdolist_list_var = cdolist_list_var.rest();
      method_decl = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19293L)
  public static SubLObject interfaces_add_interface_class_method(final SubLObject method_name, final SubLObject interface_name, SubLObject method_properties, final SubLObject lambda_list, final SubLObject body)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_interface = interfaces_retrieve_interface( interface_name );
    SubLObject result = NIL;
    method_properties = conses_high.set_difference( method_properties, $interface_method_impossible_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    method_properties = conses_high.set_difference( method_properties, $interface_method_required_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    if( NIL != v_interface )
    {
      final SubLObject v_interface_$16 = v_interface;
      final SubLObject compiled_class_method_decls = subloop_structures.interface_compiled_class_method_decls( v_interface_$16 );
      SubLObject local_class_methods = subloop_structures.interface_local_class_methods( v_interface_$16 );
      try
      {
        final SubLObject method = methods.method_assoc( method_name, local_class_methods );
        final SubLObject method_decl_location = conses_high.member( method_name, compiled_class_method_decls, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym30$CADR ) );
        final SubLObject method_decl = ( NIL != method_decl_location ) ? method_decl_location.first() : NIL;
        if( NIL != method )
        {
          subloop_structures._csetf_method_class_name( method, interface_name );
          subloop_structures._csetf_method_lambda_list( method, conses_high.copy_tree( lambda_list ) );
          subloop_structures._csetf_method_body( method, conses_high.copy_tree( body ) );
          subloop_structures._csetf_method_protection( method, methods.methods_protection_level_of_method_decl( method_properties ) );
          subloop_structures._csetf_method_scope( method, methods.methods_scope_level_of_method_decl( method_properties ) );
          subloop_structures._csetf_method_update_type( method, methods.methods_update_type_of_method_decl( method_properties ) );
          result = method;
        }
        else
        {
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method_decl )
          {
            Errors.error( $undeclare_method_name_message$.getGlobalValue(), method_name, interface_name );
          }
          final SubLObject new_method = methods.new_method( method_name, interface_name, lambda_list );
          subloop_structures._csetf_method_body( new_method, conses_high.copy_tree( body ) );
          subloop_structures._csetf_method_protection( new_method, methods.methods_protection_level_of_method_decl( method_properties ) );
          subloop_structures._csetf_method_scope( new_method, methods.methods_scope_level_of_method_decl( method_properties ) );
          subloop_structures._csetf_method_update_type( new_method, methods.methods_update_type_of_method_decl( method_properties ) );
          local_class_methods = ConsesLow.nconc( local_class_methods, ConsesLow.list( new_method ) );
          result = new_method;
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          subloop_structures._csetf_interface_compiled_class_method_decls( v_interface_$16, compiled_class_method_decls );
          subloop_structures._csetf_interface_local_class_methods( v_interface_$16, local_class_methods );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21677L)
  public static SubLObject expand_def_class_method_template(final SubLObject method_name, final SubLObject interface_name, final SubLObject method_properties, final SubLObject lambda_list, final SubLObject body)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $invalid_interface_method_name_message$.getGlobalValue(), method_name );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == interface_name || !interface_name.isSymbol() ) )
    {
      Errors.error( $invalid_interface_name_message$.getGlobalValue(), interface_name );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == classes.classes_valid_lambda_list_p( lambda_list ) )
    {
      Errors.error( $invalid_lambda_list_message$.getGlobalValue(), lambda_list, method_name, interface_name );
    }
    final SubLObject preprocessed_body = ( body.isCons() && body.first().isString() ) ? body.rest() : body;
    final SubLObject v_interface = interfaces_retrieve_interface( interface_name );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_interface )
    {
      Errors.error( $non_existing_interface_message$.getGlobalValue(), v_interface );
    }
    interfaces_add_interface_class_method( method_name, interface_name, method_properties, lambda_list, preprocessed_body );
    return ConsesLow.list( $sym56$INTERFACES_ADD_INTERFACE_CLASS_METHOD, ConsesLow.list( $sym38$QUOTE, method_name ), ConsesLow.list( $sym38$QUOTE, interface_name ), ConsesLow.list( $sym38$QUOTE, method_properties ),
        ConsesLow.list( $sym38$QUOTE, conses_high.copy_tree( lambda_list ) ), ConsesLow.list( $sym38$QUOTE, conses_high.copy_tree( preprocessed_body ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22888L)
  public static SubLObject def_class_method_template(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject method_name = NIL;
    SubLObject interface_name = NIL;
    SubLObject method_properties = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    method_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    interface_name = current.first();
    current = ( method_properties = current.rest() );
    current = temp;
    SubLObject lambda_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    lambda_list = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return expand_def_class_method_template( method_name, interface_name, method_properties, lambda_list, body );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23105L)
  public static SubLObject interfaces_add_interface_instance_method(final SubLObject method_name, final SubLObject interface_name, SubLObject method_properties, final SubLObject lambda_list, final SubLObject body)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_interface = interfaces_retrieve_interface( interface_name );
    SubLObject result = NIL;
    method_properties = conses_high.set_difference( method_properties, $interface_method_impossible_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    method_properties = conses_high.set_difference( method_properties, $interface_method_required_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    if( NIL != v_interface )
    {
      final SubLObject v_interface_$17 = v_interface;
      final SubLObject compiled_instance_method_decls = subloop_structures.interface_compiled_instance_method_decls( v_interface_$17 );
      SubLObject local_instance_methods = subloop_structures.interface_local_instance_methods( v_interface_$17 );
      try
      {
        final SubLObject method = methods.method_assoc( method_name, local_instance_methods );
        final SubLObject method_decl_location = conses_high.member( method_name, compiled_instance_method_decls, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym30$CADR ) );
        final SubLObject method_decl = ( NIL != method_decl_location ) ? method_decl_location.first() : NIL;
        if( NIL != method )
        {
          subloop_structures._csetf_method_class_name( method, interface_name );
          subloop_structures._csetf_method_lambda_list( method, conses_high.copy_tree( lambda_list ) );
          subloop_structures._csetf_method_body( method, conses_high.copy_tree( body ) );
          subloop_structures._csetf_method_protection( method, methods.methods_protection_level_of_method_decl( method_properties ) );
          subloop_structures._csetf_method_scope( method, methods.methods_scope_level_of_method_decl( method_properties ) );
          subloop_structures._csetf_method_update_type( method, methods.methods_update_type_of_method_decl( method_properties ) );
          result = method;
        }
        else
        {
          if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method_decl )
          {
            Errors.error( $undeclare_method_name_message$.getGlobalValue(), method_name, interface_name );
          }
          final SubLObject new_method = methods.new_method( method_name, interface_name, lambda_list );
          subloop_structures._csetf_method_body( new_method, conses_high.copy_tree( body ) );
          subloop_structures._csetf_method_protection( new_method, methods.methods_protection_level_of_method_decl( method_properties ) );
          subloop_structures._csetf_method_scope( new_method, methods.methods_scope_level_of_method_decl( method_properties ) );
          subloop_structures._csetf_method_update_type( new_method, methods.methods_update_type_of_method_decl( method_properties ) );
          local_instance_methods = ConsesLow.nconc( local_instance_methods, ConsesLow.list( new_method ) );
          result = new_method;
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          subloop_structures._csetf_interface_compiled_instance_method_decls( v_interface_$17, compiled_instance_method_decls );
          subloop_structures._csetf_interface_local_instance_methods( v_interface_$17, local_instance_methods );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25504L)
  public static SubLObject expand_def_instance_method_template(final SubLObject method_name, final SubLObject interface_name, final SubLObject method_properties, final SubLObject lambda_list, final SubLObject body)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == method_name || !method_name.isSymbol() ) )
    {
      Errors.error( $invalid_interface_method_name_message$.getGlobalValue(), method_name );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == interface_name || !interface_name.isSymbol() ) )
    {
      Errors.error( $invalid_interface_name_message$.getGlobalValue(), interface_name );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == classes.classes_valid_lambda_list_p( lambda_list ) )
    {
      Errors.error( $invalid_lambda_list_message$.getGlobalValue(), lambda_list, method_name, interface_name );
    }
    final SubLObject preprocessed_body = ( body.isCons() && body.first().isString() ) ? body.rest() : body;
    final SubLObject v_interface = interfaces_retrieve_interface( interface_name );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == v_interface )
    {
      Errors.error( $non_existing_interface_message$.getGlobalValue(), v_interface );
    }
    interfaces_add_interface_instance_method( method_name, interface_name, method_properties, lambda_list, preprocessed_body );
    return ConsesLow.list( $sym58$INTERFACES_ADD_INTERFACE_INSTANCE_METHOD, ConsesLow.list( $sym38$QUOTE, method_name ), ConsesLow.list( $sym38$QUOTE, interface_name ), ConsesLow.list( $sym38$QUOTE, method_properties ),
        ConsesLow.list( $sym38$QUOTE, conses_high.copy_tree( lambda_list ) ), ConsesLow.list( $sym38$QUOTE, conses_high.copy_tree( preprocessed_body ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26720L)
  public static SubLObject def_instance_method_template(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject method_name = NIL;
    SubLObject interface_name = NIL;
    SubLObject method_properties = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    method_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    interface_name = current.first();
    current = ( method_properties = current.rest() );
    current = temp;
    SubLObject lambda_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    lambda_list = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return expand_def_instance_method_template( method_name, interface_name, method_properties, lambda_list, body );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26943L)
  public static SubLObject interfaces_find_class_method_internal(final SubLObject method_name, final SubLObject v_interface)
  {
    if( NIL != interfaces_marked_p( v_interface, $kw59$INTERFACES_FIND_CLASS_METHOD_INTERNAL ) )
    {
      return NIL;
    }
    if( NIL == v_interface )
    {
      return NIL;
    }
    final SubLObject parents = subloop_structures.interface_parents( v_interface );
    final SubLObject local_instance_methods = subloop_structures.interface_local_instance_methods( v_interface );
    SubLObject method = methods.method_assoc( method_name, local_instance_methods );
    if( NIL != method )
    {
      return method;
    }
    SubLObject parent_interface = NIL;
    interfaces_mark_interface( v_interface, $kw59$INTERFACES_FIND_CLASS_METHOD_INTERNAL );
    SubLObject cdolist_list_var = parents;
    SubLObject parent_interface_name = NIL;
    parent_interface_name = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      parent_interface = interfaces_retrieve_interface( parent_interface_name );
      if( NIL != parent_interface )
      {
        method = interfaces_find_class_method_internal( method_name, parent_interface );
        if( NIL != method )
        {
          return method;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      parent_interface_name = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27699L)
  public static SubLObject interfaces_find_class_method(final SubLObject method_name, final SubLObject interface_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject v_interface = interfaces_retrieve_interface( interface_name );
    final SubLObject _prev_bind_0 = $interfaces_marked_interfaces$.currentBinding( thread );
    try
    {
      $interfaces_marked_interfaces$.bind( NIL, thread );
      try
      {
        result = interfaces_find_class_method_internal( method_name, v_interface );
      }
      finally
      {
        final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          interfaces_unmark_all_marked_interfaces( $interfaces_marked_interfaces$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
        }
      }
    }
    finally
    {
      $interfaces_marked_interfaces$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 27991L)
  public static SubLObject interfaces_find_instance_method_internal(final SubLObject method_name, final SubLObject v_interface)
  {
    if( NIL != interfaces_marked_p( v_interface, $kw60$INTERFACES_FIND_INSTANCE_METHOD_INTERNAL ) )
    {
      return NIL;
    }
    if( NIL == v_interface )
    {
      return NIL;
    }
    final SubLObject parents = subloop_structures.interface_parents( v_interface );
    final SubLObject local_instance_methods = subloop_structures.interface_local_instance_methods( v_interface );
    SubLObject method = methods.method_assoc( method_name, local_instance_methods );
    if( NIL != method )
    {
      return method;
    }
    SubLObject parent_interface = NIL;
    interfaces_mark_interface( v_interface, $kw60$INTERFACES_FIND_INSTANCE_METHOD_INTERNAL );
    SubLObject cdolist_list_var = parents;
    SubLObject parent_interface_name = NIL;
    parent_interface_name = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      parent_interface = interfaces_retrieve_interface( parent_interface_name );
      if( NIL != parent_interface )
      {
        method = interfaces_find_instance_method_internal( method_name, parent_interface );
        if( NIL != method )
        {
          return method;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      parent_interface_name = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28759L)
  public static SubLObject interfaces_find_instance_method(final SubLObject method_name, final SubLObject interface_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject v_interface = interfaces_retrieve_interface( interface_name );
    final SubLObject _prev_bind_0 = $interfaces_marked_interfaces$.currentBinding( thread );
    try
    {
      $interfaces_marked_interfaces$.bind( NIL, thread );
      try
      {
        result = interfaces_find_instance_method_internal( method_name, v_interface );
      }
      finally
      {
        final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          interfaces_unmark_all_marked_interfaces( $interfaces_marked_interfaces$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
        }
      }
    }
    finally
    {
      $interfaces_marked_interfaces$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29057L)
  public static SubLObject interfaces_class_method_to_listed_def_class_method(final SubLObject true_class_name, final SubLObject method)
  {
    if( NIL != subloop_structures.method_p( method ) )
    {
      final SubLObject name = subloop_structures.method_name( method );
      final SubLObject lambda_list = subloop_structures.method_lambda_list( method );
      final SubLObject body = subloop_structures.method_body( method );
      final SubLObject protection = subloop_structures.method_protection( method );
      final SubLObject scope = subloop_structures.method_scope( method );
      final SubLObject update_type = subloop_structures.method_update_type( method );
      final SubLObject before_listeners = subloop_structures.method_before_listeners( method );
      final SubLObject after_listeners = subloop_structures.method_after_listeners( method );
      return ConsesLow.list( ConsesLow.listS( $sym61$DEF_CLASS_METHOD, ConsesLow.listS( name, true_class_name, ConsesLow.append( new SubLObject[] { ( NIL != protection ) ? ConsesLow.list( protection ) : NIL,
        ( NIL != scope ) ? ConsesLow.list( scope ) : NIL, ( NIL != update_type ) ? ConsesLow.list( update_type ) : NIL, ( NIL != before_listeners ) ? ConsesLow.list( $kw62$BEFORE_LISTENERS ) : NIL,
        ( NIL != after_listeners ) ? ConsesLow.list( $kw63$AFTER_LISTENERS ) : NIL, NIL
      } ) ), conses_high.copy_tree( lambda_list ), ConsesLow.append( conses_high.copy_tree( body ), NIL ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29573L)
  public static SubLObject interfaces_instance_method_to_listed_def_instance_method(final SubLObject true_class_name, final SubLObject method)
  {
    if( NIL != subloop_structures.method_p( method ) )
    {
      final SubLObject name = subloop_structures.method_name( method );
      final SubLObject lambda_list = subloop_structures.method_lambda_list( method );
      final SubLObject body = subloop_structures.method_body( method );
      final SubLObject protection = subloop_structures.method_protection( method );
      final SubLObject scope = subloop_structures.method_scope( method );
      final SubLObject update_type = subloop_structures.method_update_type( method );
      final SubLObject before_listeners = subloop_structures.method_before_listeners( method );
      final SubLObject after_listeners = subloop_structures.method_after_listeners( method );
      return ConsesLow.list( ConsesLow.listS( $sym64$DEF_INSTANCE_METHOD, ConsesLow.listS( name, true_class_name, ConsesLow.append( new SubLObject[] { ( NIL != protection ) ? ConsesLow.list( protection ) : NIL,
        ( NIL != scope ) ? ConsesLow.list( scope ) : NIL, ( NIL != update_type ) ? ConsesLow.list( update_type ) : NIL, ( NIL != before_listeners ) ? ConsesLow.list( $kw62$BEFORE_LISTENERS ) : NIL,
        ( NIL != after_listeners ) ? ConsesLow.list( $kw63$AFTER_LISTENERS ) : NIL, NIL
      } ) ), conses_high.copy_tree( lambda_list ), ConsesLow.append( conses_high.copy_tree( body ), NIL ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30113L)
  public static SubLObject interfaces_implements_p(final SubLObject target_interface, final SubLObject parent_interface)
  {
    final SubLObject target = ( NIL != subloop_structures.interface_p( target_interface ) ) ? target_interface : ( target_interface.isSymbol() ? interfaces_retrieve_interface( target_interface ) : NIL );
    final SubLObject parent = ( NIL != subloop_structures.interface_p( parent_interface ) ) ? parent_interface : ( parent_interface.isSymbol() ? interfaces_retrieve_interface( parent_interface ) : NIL );
    return ( target.eql( parent ) || NIL != conses_high.member( parent, subloop_structures.interface_compiled_inheritance_path( target ), UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30710L)
  public static SubLObject interfaces_collect_method_decls(final SubLObject v_interfaces)
  {
    SubLObject all_class_method_decls = NIL;
    SubLObject all_instance_method_decls = NIL;
    SubLObject cdolist_list_var = v_interfaces;
    SubLObject v_interface = NIL;
    v_interface = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != subloop_structures.interface_p( v_interface ) )
      {
        final SubLObject v_interface_$24 = v_interface;
        final SubLObject instance_method_decls = subloop_structures.interface_instance_method_decls( v_interface_$24 );
        SubLObject cdolist_list_var_$25;
        final SubLObject class_method_decls = cdolist_list_var_$25 = subloop_structures.interface_class_method_decls( v_interface_$24 );
        SubLObject class_method_decl = NIL;
        class_method_decl = cdolist_list_var_$25.first();
        while ( NIL != cdolist_list_var_$25)
        {
          if( NIL == conses_high.member( conses_high.cadr( class_method_decl ), all_class_method_decls, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym30$CADR ) ) )
          {
            all_class_method_decls = ConsesLow.cons( class_method_decl, all_class_method_decls );
          }
          cdolist_list_var_$25 = cdolist_list_var_$25.rest();
          class_method_decl = cdolist_list_var_$25.first();
        }
        SubLObject cdolist_list_var_$26 = instance_method_decls;
        SubLObject instance_method_decl = NIL;
        instance_method_decl = cdolist_list_var_$26.first();
        while ( NIL != cdolist_list_var_$26)
        {
          if( NIL == conses_high.member( conses_high.cadr( instance_method_decl ), all_instance_method_decls, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym30$CADR ) ) )
          {
            all_instance_method_decls = ConsesLow.cons( instance_method_decl, all_instance_method_decls );
          }
          cdolist_list_var_$26 = cdolist_list_var_$26.rest();
          instance_method_decl = cdolist_list_var_$26.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_interface = cdolist_list_var.first();
    }
    return Values.values( Sequences.nreverse( all_class_method_decls ), Sequences.nreverse( all_instance_method_decls ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31447L)
  public static SubLObject subloop_all_methods_of_interface(final SubLObject v_interface)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject actual_interface = v_interface.isSymbol() ? interfaces_retrieve_interface( v_interface ) : ( ( NIL != subloop_structures.interface_p( v_interface ) ) ? v_interface : NIL );
    SubLObject v_methods = NIL;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == actual_interface )
    {
      Errors.error( $str65$SUBLOOP_ALL_METHODS_OF_INTERFACE_, v_interface );
    }
    thread.resetMultipleValues();
    final SubLObject class_method_decls = interfaces_collect_method_decls( ConsesLow.list( actual_interface ) );
    final SubLObject instance_method_decls = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject list_expression = ConsesLow.nconc( class_method_decls, instance_method_decls );
    if( NIL == list_expression )
    {
      v_methods = NIL;
    }
    else if( list_expression.isAtom() )
    {
      v_methods = ConsesLow.list( list_expression );
    }
    else if( NIL == list_expression.rest() )
    {
      final SubLObject method_decl = list_expression.first();
      v_methods = ( method_decl.isCons() && method_decl.rest().isCons() ) ? ConsesLow.list( conses_high.cadr( method_decl ) ) : NIL;
    }
    else
    {
      SubLObject tail_cons = NIL;
      SubLObject result = NIL;
      v_methods = NIL;
      SubLObject cdolist_list_var = list_expression;
      SubLObject method_decl2 = NIL;
      method_decl2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ( method_decl2.isCons() && method_decl2.rest().isCons() ) ? ConsesLow.list( conses_high.cadr( method_decl2 ) ) : NIL;
        if( NIL != result )
        {
          if( NIL != tail_cons )
          {
            ConsesLow.rplacd( tail_cons, result );
            tail_cons = conses_high.last( result, UNPROVIDED );
          }
          else
          {
            v_methods = ( method_decl2.isCons() && method_decl2.rest().isCons() ) ? ConsesLow.list( conses_high.cadr( method_decl2 ) ) : NIL;
            tail_cons = conses_high.last( v_methods, UNPROVIDED );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        method_decl2 = cdolist_list_var.first();
      }
    }
    return v_methods;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32159L)
  public static SubLObject interface_get_property_internal(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_interface = NIL;
    SubLObject indicator = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list66 );
    v_interface = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list66 );
    indicator = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym67$CLASSES_GETF, ConsesLow.list( $sym68$INTERFACE_PLIST, v_interface ), indicator );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list66 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32299L)
  public static SubLObject interface_get_property(final SubLObject v_interface, final SubLObject indicator)
  {
    if( NIL != subloop_structures.interface_p( v_interface ) )
    {
      return classes.classes_getf( subloop_structures.interface_plist( v_interface ), indicator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32471L)
  public static SubLObject interface_set_property_internal(final SubLObject v_interface, final SubLObject indicator, final SubLObject value)
  {
    final SubLObject interface_var = Symbols.make_symbol( $str69$interface );
    return ConsesLow.list( $sym6$CLET, ConsesLow.list( ConsesLow.list( interface_var, v_interface ) ), ConsesLow.list( $sym70$CSETF, ConsesLow.list( $sym68$INTERFACE_PLIST, interface_var ), ConsesLow.list(
        $sym71$CLASSES_PUTF, ConsesLow.list( $sym68$INTERFACE_PLIST, interface_var ), indicator, value ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32769L)
  public static SubLObject interface_set_property(final SubLObject v_interface, final SubLObject indicator, final SubLObject value)
  {
    if( NIL != subloop_structures.interface_p( v_interface ) )
    {
      interface_set_property_internal( v_interface, indicator, value );
      return value;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32963L)
  public static SubLObject subloop_all_classes_implementing_interface(final SubLObject v_interface)
  {
    final SubLObject actual_interface = v_interface.isSymbol() ? interfaces_retrieve_interface( v_interface ) : ( ( NIL != subloop_structures.interface_p( v_interface ) ) ? v_interface : NIL );
    final SubLObject all_classes = classes.classes_get_all_classes();
    SubLObject all_classes_implementing_interface = NIL;
    final SubLObject list_expression = all_classes;
    if( NIL == list_expression )
    {
      all_classes_implementing_interface = NIL;
    }
    else if( list_expression.isAtom() )
    {
      all_classes_implementing_interface = ConsesLow.list( list_expression );
    }
    else if( NIL == list_expression.rest() )
    {
      final SubLObject v_class = list_expression.first();
      all_classes_implementing_interface = ( NIL != classes.classes_implements_p( v_class, actual_interface ) ) ? ConsesLow.list( v_class ) : NIL;
    }
    else
    {
      SubLObject tail_cons = NIL;
      SubLObject result = NIL;
      all_classes_implementing_interface = NIL;
      SubLObject cdolist_list_var = list_expression;
      SubLObject v_class2 = NIL;
      v_class2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ( NIL != classes.classes_implements_p( v_class2, actual_interface ) ) ? ConsesLow.list( v_class2 ) : NIL;
        if( NIL != result )
        {
          if( NIL != tail_cons )
          {
            ConsesLow.rplacd( tail_cons, result );
            tail_cons = conses_high.last( result, UNPROVIDED );
          }
          else
          {
            all_classes_implementing_interface = ( NIL != classes.classes_implements_p( v_class2, actual_interface ) ) ? ConsesLow.list( v_class2 ) : NIL;
            tail_cons = conses_high.last( all_classes_implementing_interface, UNPROVIDED );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_class2 = cdolist_list_var.first();
      }
    }
    return all_classes_implementing_interface;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33498L)
  public static SubLObject subloop_all_interfaces_of_class(final SubLObject v_class)
  {
    final SubLObject actual_class = v_class.isSymbol() ? classes.classes_retrieve_class( v_class ) : ( ( NIL != subloop_structures.class_p( v_class ) ) ? v_class : NIL );
    if( NIL == actual_class )
    {
      return NIL;
    }
    final SubLObject inheritance_path = subloop_structures.class_compiled_inheritance_path( actual_class );
    SubLObject interface_names = NIL;
    SubLObject cdolist_list_var = inheritance_path;
    SubLObject super_class = NIL;
    super_class = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      interface_names = conses_high.union( interface_names, subloop_structures.class_interface_names( super_class ), UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      super_class = cdolist_list_var.first();
    }
    return interface_names;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33989L)
  public static SubLObject subloop_all_instance_method_decls_of_interface(final SubLObject v_interface)
  {
    final SubLObject actual_interface = v_interface.isSymbol() ? interfaces_retrieve_interface( v_interface ) : ( ( NIL != subloop_structures.interface_p( v_interface ) ) ? v_interface : NIL );
    if( NIL != actual_interface )
    {
      SubLObject union_of_all_parent_methods = NIL;
      SubLObject cdolist_list_var = subloop_structures.interface_parents( actual_interface );
      SubLObject parent_interface = NIL;
      parent_interface = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        union_of_all_parent_methods = conses_high.union( union_of_all_parent_methods, subloop_all_instance_method_decls_of_interface( parent_interface ), Symbols.symbol_function( EQ ), Symbols.symbol_function(
            $sym30$CADR ) );
        cdolist_list_var = cdolist_list_var.rest();
        parent_interface = cdolist_list_var.first();
      }
      return conses_high.union( subloop_structures.interface_instance_method_decls( actual_interface ), union_of_all_parent_methods, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym30$CADR ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34674L)
  public static SubLObject subloop_all_class_method_decls_of_interface(final SubLObject v_interface)
  {
    final SubLObject actual_interface = v_interface.isSymbol() ? interfaces_retrieve_interface( v_interface ) : ( ( NIL != subloop_structures.interface_p( v_interface ) ) ? v_interface : NIL );
    if( NIL != actual_interface )
    {
      SubLObject union_of_all_parent_methods = NIL;
      SubLObject cdolist_list_var = subloop_structures.interface_parents( actual_interface );
      SubLObject parent_interface = NIL;
      parent_interface = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        union_of_all_parent_methods = conses_high.union( union_of_all_parent_methods, subloop_all_class_method_decls_of_interface( parent_interface ), Symbols.symbol_function( EQ ), Symbols.symbol_function(
            $sym30$CADR ) );
        cdolist_list_var = cdolist_list_var.rest();
        parent_interface = cdolist_list_var.first();
      }
      return conses_high.union( subloop_structures.interface_class_method_decls( actual_interface ), union_of_all_parent_methods, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym30$CADR ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35350L)
  public static SubLObject interfaces_who_introduced_method(final SubLObject v_interface, final SubLObject method_name)
  {
    final SubLObject actual_interface = v_interface.isSymbol() ? interfaces_retrieve_interface( v_interface ) : ( ( NIL != subloop_structures.interface_p( v_interface ) ) ? v_interface : NIL );
    if( NIL != actual_interface )
    {
      if( NIL != conses_high.member( method_name, subloop_structures.interface_instance_method_decls( actual_interface ), Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym30$CADR ) ) )
      {
        return subloop_structures.interface_name( actual_interface );
      }
      if( NIL != conses_high.member( method_name, subloop_structures.interface_class_method_decls( actual_interface ), Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym30$CADR ) ) )
      {
        return subloop_structures.interface_name( actual_interface );
      }
      SubLObject cdolist_list_var = subloop_structures.interface_parents( actual_interface );
      SubLObject parent_interface = NIL;
      parent_interface = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject found = interfaces_who_introduced_method( parent_interface, method_name );
        if( NIL != found )
        {
          return found;
        }
        cdolist_list_var = cdolist_list_var.rest();
        parent_interface = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36088L)
  public static SubLObject expand_do_interfaces_upward(final SubLObject var, final SubLObject start_interface, final SubLObject body)
  {
    final SubLObject queue_var = Symbols.make_symbol( $str72$queue );
    final SubLObject current_interface = Symbols.make_symbol( $str73$current_interface );
    return ConsesLow.list( $sym6$CLET, ConsesLow.list( ConsesLow.list( queue_var, ConsesLow.list( $sym74$LIST, start_interface ) ), reader.bq_cons( current_interface, $list75 ), reader.bq_cons( var, $list75 ) ),
        ConsesLow.listS( $sym76$WHILE, queue_var, ConsesLow.list( $sym77$CSETQ, current_interface, ConsesLow.list( $sym78$CAR, queue_var ) ), ConsesLow.list( $sym77$CSETQ, var, current_interface ), ConsesLow.list(
            $sym79$CPOP, queue_var ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym77$CSETQ, queue_var, ConsesLow.list( $sym80$NCONC, ConsesLow.list( $sym81$COPY_LIST, ConsesLow.list(
                $sym82$INTERFACE_PARENTS, ConsesLow.list( $sym83$INTERFACES_RETRIEVE_INTERFACE, current_interface ) ) ), queue_var ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36656L)
  public static SubLObject do_interfaces_upward(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject start_interface = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    start_interface = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return expand_do_interfaces_upward( var, start_interface, body );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list84 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 36794L)
  public static SubLObject expand_do_interfaces_downward(final SubLObject var, final SubLObject start_interface, final SubLObject body)
  {
    final SubLObject queue_var = Symbols.make_symbol( $str72$queue );
    final SubLObject current_interface = Symbols.make_symbol( $str73$current_interface );
    return ConsesLow.list( $sym6$CLET, ConsesLow.list( ConsesLow.list( queue_var, ConsesLow.list( $sym74$LIST, start_interface ) ), reader.bq_cons( current_interface, $list75 ), reader.bq_cons( var, $list75 ) ),
        ConsesLow.listS( $sym76$WHILE, queue_var, ConsesLow.list( $sym77$CSETQ, current_interface, ConsesLow.list( $sym78$CAR, queue_var ) ), ConsesLow.list( $sym77$CSETQ, var, current_interface ), ConsesLow.list(
            $sym79$CPOP, queue_var ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym77$CSETQ, queue_var, ConsesLow.list( $sym80$NCONC, ConsesLow.list( $sym81$COPY_LIST, ConsesLow.list(
                $sym85$INTERFACE_SUBINTERFACES, ConsesLow.list( $sym83$INTERFACES_RETRIEVE_INTERFACE, current_interface ) ) ), queue_var ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37379L)
  public static SubLObject do_interfaces_downward(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject start_interface = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    start_interface = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return expand_do_interfaces_downward( var, start_interface, body );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list84 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37521L)
  public static SubLObject expand_do_interfaces_upward_with_depth(final SubLObject var, final SubLObject depth_var, final SubLObject start_interface, final SubLObject body)
  {
    final SubLObject queue_var = Symbols.make_symbol( $str72$queue );
    final SubLObject current_record = Symbols.make_symbol( $str73$current_interface );
    final SubLObject next_generation_var = Symbols.make_symbol( $str86$next_generation );
    return ConsesLow.list( $sym6$CLET, ConsesLow.list( ConsesLow.list( queue_var, ConsesLow.list( $sym74$LIST, ConsesLow.listS( $sym87$CONS, start_interface, $list88 ) ) ), reader.bq_cons( current_record, $list75 ),
        reader.bq_cons( var, $list75 ), reader.bq_cons( depth_var, $list75 ), reader.bq_cons( next_generation_var, $list75 ) ), ConsesLow.listS( $sym76$WHILE, new SubLObject[]
        { queue_var, ConsesLow.list( $sym77$CSETQ, current_record, ConsesLow.list( $sym78$CAR, queue_var ) ), ConsesLow.list( $sym77$CSETQ, var, ConsesLow.list( $sym78$CAR, current_record ) ), ConsesLow.list(
            $sym77$CSETQ, depth_var, ConsesLow.list( $sym89$CDR, current_record ) ), ConsesLow.list( $sym79$CPOP, queue_var ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym77$CSETQ, next_generation_var,
                ConsesLow.list( $sym81$COPY_LIST, ConsesLow.list( $sym82$INTERFACE_PARENTS, ConsesLow.list( $sym83$INTERFACES_RETRIEVE_INTERFACE, ConsesLow.list( $sym78$CAR, current_record ) ) ) ) ), ConsesLow.list(
                    $sym6$CLET, ConsesLow.list( $list90, ConsesLow.list( $sym91$NEW_DEPTH, ConsesLow.listS( $sym92$_, depth_var, $list93 ) ) ), ConsesLow.listS( $sym94$CDOLIST_COLLECTING, ConsesLow.listS(
                        $sym95$INTERFACE_NAME, next_generation_var, $list96 ), $list97 ), ConsesLow.listS( $sym77$CSETQ, next_generation_var, $list96 ) ), ConsesLow.list( $sym77$CSETQ, queue_var, ConsesLow.list(
                            $sym80$NCONC, next_generation_var, queue_var ) ) ) )
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38600L)
  public static SubLObject do_interfaces_upward_with_depth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject depth_var = NIL;
    SubLObject start_interface = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
    depth_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
    start_interface = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return expand_do_interfaces_upward_with_depth( var, depth_var, start_interface, body );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list98 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38780L)
  public static SubLObject expand_do_interfaces_downward_with_depth(final SubLObject var, final SubLObject depth_var, final SubLObject start_interface, final SubLObject body)
  {
    final SubLObject queue_var = Symbols.make_symbol( $str72$queue );
    final SubLObject current_record = Symbols.make_symbol( $str73$current_interface );
    final SubLObject next_generation_var = Symbols.make_symbol( $str86$next_generation );
    return ConsesLow.list( $sym6$CLET, ConsesLow.list( ConsesLow.list( queue_var, ConsesLow.list( $sym74$LIST, ConsesLow.listS( $sym87$CONS, start_interface, $list88 ) ) ), reader.bq_cons( current_record, $list75 ),
        reader.bq_cons( var, $list75 ), reader.bq_cons( depth_var, $list75 ), reader.bq_cons( next_generation_var, $list75 ) ), ConsesLow.listS( $sym76$WHILE, new SubLObject[]
        { queue_var, ConsesLow.list( $sym77$CSETQ, current_record, ConsesLow.list( $sym78$CAR, queue_var ) ), ConsesLow.list( $sym77$CSETQ, var, ConsesLow.list( $sym78$CAR, current_record ) ), ConsesLow.list(
            $sym77$CSETQ, depth_var, ConsesLow.list( $sym89$CDR, current_record ) ), ConsesLow.list( $sym79$CPOP, queue_var ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym77$CSETQ, next_generation_var,
                ConsesLow.list( $sym81$COPY_LIST, ConsesLow.list( $sym85$INTERFACE_SUBINTERFACES, ConsesLow.list( $sym83$INTERFACES_RETRIEVE_INTERFACE, ConsesLow.list( $sym78$CAR, current_record ) ) ) ) ), ConsesLow
                    .list( $sym6$CLET, ConsesLow.list( $list90, ConsesLow.list( $sym91$NEW_DEPTH, ConsesLow.listS( $sym92$_, depth_var, $list93 ) ) ), ConsesLow.listS( $sym94$CDOLIST_COLLECTING, ConsesLow.listS(
                        $sym95$INTERFACE_NAME, next_generation_var, $list96 ), $list97 ), ConsesLow.listS( $sym77$CSETQ, next_generation_var, $list96 ) ), ConsesLow.list( $sym77$CSETQ, queue_var, ConsesLow.list(
                            $sym80$NCONC, next_generation_var, queue_var ) ) ) )
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39867L)
  public static SubLObject do_interfaces_downward_with_depth(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject depth_var = NIL;
    SubLObject start_interface = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
    depth_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list98 );
    start_interface = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return expand_do_interfaces_downward_with_depth( var, depth_var, start_interface, body );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list98 );
    return NIL;
  }

  public static SubLObject declare_interfaces_file()
  {
    SubLFiles.declareFunction( me, "interfaces_reset_interface_table", "INTERFACES-RESET-INTERFACE-TABLE", 0, 0, false );
    SubLFiles.declareMacro( me, "with_interface_marking", "WITH-INTERFACE-MARKING" );
    SubLFiles.declareFunction( me, "display_interface", "DISPLAY-INTERFACE", 1, 1, false );
    SubLFiles.declareMacro( me, "with_interface_definition_lock", "WITH-INTERFACE-DEFINITION-LOCK" );
    SubLFiles.declareFunction( me, "interfaces_mark_interface", "INTERFACES-MARK-INTERFACE", 2, 0, false );
    SubLFiles.declareFunction( me, "interfaces_remove_mark", "INTERFACES-REMOVE-MARK", 2, 0, false );
    SubLFiles.declareFunction( me, "interfaces_marked_p", "INTERFACES-MARKED-P", 2, 0, false );
    SubLFiles.declareFunction( me, "interfaces_unmark_all_marked_interfaces", "INTERFACES-UNMARK-ALL-MARKED-INTERFACES", 1, 0, false );
    SubLFiles.declareFunction( me, "interfaces_retrieve_interface", "INTERFACES-RETRIEVE-INTERFACE", 1, 0, false );
    SubLFiles.declareFunction( me, "interfaces_intern_interface", "INTERFACES-INTERN-INTERFACE", 2, 0, false );
    SubLFiles.declareFunction( me, "interfaces_delete_interface", "INTERFACES-DELETE-INTERFACE", 1, 0, false );
    SubLFiles.declareFunction( me, "interfaces_compile_inheritance_path_from_above", "INTERFACES-COMPILE-INHERITANCE-PATH-FROM-ABOVE", 1, 0, false );
    SubLFiles.declareFunction( me, "interfaces_compile_inheritance_path_from_above_aux", "INTERFACES-COMPILE-INHERITANCE-PATH-FROM-ABOVE-AUX", 1, 0, false );
    SubLFiles.declareFunction( me, "interfaces_transmit_compiled_inheritance_path_downward", "INTERFACES-TRANSMIT-COMPILED-INHERITANCE-PATH-DOWNWARD", 1, 0, false );
    SubLFiles.declareFunction( me, "interfaces_transmit_compiled_inheritance_path_downward_aux", "INTERFACES-TRANSMIT-COMPILED-INHERITANCE-PATH-DOWNWARD-AUX", 1, 0, false );
    SubLFiles.declareFunction( me, "interfaces_compile_instance_method_decls_from_above", "INTERFACES-COMPILE-INSTANCE-METHOD-DECLS-FROM-ABOVE", 1, 0, false );
    SubLFiles.declareFunction( me, "interfaces_compile_instance_method_decls_from_above_aux", "INTERFACES-COMPILE-INSTANCE-METHOD-DECLS-FROM-ABOVE-AUX", 1, 0, false );
    SubLFiles.declareFunction( me, "interfaces_transmit_compile_instance_method_decls_downward", "INTERFACES-TRANSMIT-COMPILE-INSTANCE-METHOD-DECLS-DOWNWARD", 1, 0, false );
    SubLFiles.declareFunction( me, "interfaces_transmit_compile_instance_method_decls_downward_aux", "INTERFACES-TRANSMIT-COMPILE-INSTANCE-METHOD-DECLS-DOWNWARD-AUX", 1, 0, false );
    SubLFiles.declareFunction( me, "interfaces_compile_class_method_decls_from_above", "INTERFACES-COMPILE-CLASS-METHOD-DECLS-FROM-ABOVE", 1, 0, false );
    SubLFiles.declareFunction( me, "interfaces_compile_class_method_decls_from_above_aux", "INTERFACES-COMPILE-CLASS-METHOD-DECLS-FROM-ABOVE-AUX", 1, 0, false );
    SubLFiles.declareFunction( me, "interfaces_transmit_compile_class_method_decls_downward", "INTERFACES-TRANSMIT-COMPILE-CLASS-METHOD-DECLS-DOWNWARD", 1, 0, false );
    SubLFiles.declareFunction( me, "interfaces_transmit_compile_class_method_decls_downward_aux", "INTERFACES-TRANSMIT-COMPILE-CLASS-METHOD-DECLS-DOWNWARD-AUX", 1, 0, false );
    SubLFiles.declareFunction( me, "expand_interface_predicator", "EXPAND-INTERFACE-PREDICATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_instanceof_interface", "SUBLOOP-INSTANCEOF-INTERFACE", 2, 0, false );
    SubLFiles.declareFunction( me, "expand_define_interface", "EXPAND-DEFINE-INTERFACE", 4, 0, false );
    SubLFiles.declareMacro( me, "define_interface", "DEFINE-INTERFACE" );
    SubLFiles.declareFunction( me, "new_interface", "NEW-INTERFACE", 4, 0, false );
    SubLFiles.declareFunction( me, "interfaces_check_parent_interfaces", "INTERFACES-CHECK-PARENT-INTERFACES", 1, 0, false );
    SubLFiles.declareFunction( me, "interfaces_must_be_valid_method_interface_decl", "INTERFACES-MUST-BE-VALID-METHOD-INTERFACE-DECL", 1, 0, false );
    SubLFiles.declareFunction( me, "interfaces_must_be_valid_method_interface_decl_list", "INTERFACES-MUST-BE-VALID-METHOD-INTERFACE-DECL-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "interfaces_add_interface_class_method", "INTERFACES-ADD-INTERFACE-CLASS-METHOD", 5, 0, false );
    SubLFiles.declareFunction( me, "expand_def_class_method_template", "EXPAND-DEF-CLASS-METHOD-TEMPLATE", 5, 0, false );
    SubLFiles.declareMacro( me, "def_class_method_template", "DEF-CLASS-METHOD-TEMPLATE" );
    SubLFiles.declareFunction( me, "interfaces_add_interface_instance_method", "INTERFACES-ADD-INTERFACE-INSTANCE-METHOD", 5, 0, false );
    SubLFiles.declareFunction( me, "expand_def_instance_method_template", "EXPAND-DEF-INSTANCE-METHOD-TEMPLATE", 5, 0, false );
    SubLFiles.declareMacro( me, "def_instance_method_template", "DEF-INSTANCE-METHOD-TEMPLATE" );
    SubLFiles.declareFunction( me, "interfaces_find_class_method_internal", "INTERFACES-FIND-CLASS-METHOD-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "interfaces_find_class_method", "INTERFACES-FIND-CLASS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "interfaces_find_instance_method_internal", "INTERFACES-FIND-INSTANCE-METHOD-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "interfaces_find_instance_method", "INTERFACES-FIND-INSTANCE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "interfaces_class_method_to_listed_def_class_method", "INTERFACES-CLASS-METHOD-TO-LISTED-DEF-CLASS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "interfaces_instance_method_to_listed_def_instance_method", "INTERFACES-INSTANCE-METHOD-TO-LISTED-DEF-INSTANCE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "interfaces_implements_p", "INTERFACES-IMPLEMENTS-P", 2, 0, false );
    SubLFiles.declareFunction( me, "interfaces_collect_method_decls", "INTERFACES-COLLECT-METHOD-DECLS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_all_methods_of_interface", "SUBLOOP-ALL-METHODS-OF-INTERFACE", 1, 0, false );
    SubLFiles.declareMacro( me, "interface_get_property_internal", "INTERFACE-GET-PROPERTY-INTERNAL" );
    SubLFiles.declareFunction( me, "interface_get_property", "INTERFACE-GET-PROPERTY", 2, 0, false );
    SubLFiles.declareFunction( me, "interface_set_property_internal", "INTERFACE-SET-PROPERTY-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "interface_set_property", "INTERFACE-SET-PROPERTY", 3, 0, false );
    SubLFiles.declareFunction( me, "subloop_all_classes_implementing_interface", "SUBLOOP-ALL-CLASSES-IMPLEMENTING-INTERFACE", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_all_interfaces_of_class", "SUBLOOP-ALL-INTERFACES-OF-CLASS", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_all_instance_method_decls_of_interface", "SUBLOOP-ALL-INSTANCE-METHOD-DECLS-OF-INTERFACE", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_all_class_method_decls_of_interface", "SUBLOOP-ALL-CLASS-METHOD-DECLS-OF-INTERFACE", 1, 0, false );
    SubLFiles.declareFunction( me, "interfaces_who_introduced_method", "INTERFACES-WHO-INTRODUCED-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "expand_do_interfaces_upward", "EXPAND-DO-INTERFACES-UPWARD", 3, 0, false );
    SubLFiles.declareMacro( me, "do_interfaces_upward", "DO-INTERFACES-UPWARD" );
    SubLFiles.declareFunction( me, "expand_do_interfaces_downward", "EXPAND-DO-INTERFACES-DOWNWARD", 3, 0, false );
    SubLFiles.declareMacro( me, "do_interfaces_downward", "DO-INTERFACES-DOWNWARD" );
    SubLFiles.declareFunction( me, "expand_do_interfaces_upward_with_depth", "EXPAND-DO-INTERFACES-UPWARD-WITH-DEPTH", 4, 0, false );
    SubLFiles.declareMacro( me, "do_interfaces_upward_with_depth", "DO-INTERFACES-UPWARD-WITH-DEPTH" );
    SubLFiles.declareFunction( me, "expand_do_interfaces_downward_with_depth", "EXPAND-DO-INTERFACES-DOWNWARD-WITH-DEPTH", 4, 0, false );
    SubLFiles.declareMacro( me, "do_interfaces_downward_with_depth", "DO-INTERFACES-DOWNWARD-WITH-DEPTH" );
    return NIL;
  }

  public static SubLObject init_interfaces_file()
  {
    $interfaces_initial_hashtable_size$ = SubLFiles.defconstant( "*INTERFACES-INITIAL-HASHTABLE-SIZE*", $int0$400 );
    $interfaces_interface_table_update_lock$ = SubLFiles.defparameter( "*INTERFACES-INTERFACE-TABLE-UPDATE-LOCK*", Locks.make_lock( $str1$Interface_Table_Update_Lock ) );
    $interfaces_interface_table$ = SubLFiles.deflexical( "*INTERFACES-INTERFACE-TABLE*", maybeDefault( $sym2$_INTERFACES_INTERFACE_TABLE_, $interfaces_interface_table$, () -> ( Hashtables.make_hash_table(
        $interfaces_initial_hashtable_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) ) ) );
    $interfaces_alist_of_all_interfaces$ = SubLFiles.deflexical( "*INTERFACES-ALIST-OF-ALL-INTERFACES*", ( maybeDefault( $sym3$_INTERFACES_ALIST_OF_ALL_INTERFACES_, $interfaces_alist_of_all_interfaces$, NIL ) ) );
    $interfaces_marked_interfaces$ = SubLFiles.defparameter( "*INTERFACES-MARKED-INTERFACES*", NIL );
    $interface_method_impossible_properties$ = SubLFiles.defconstant( "*INTERFACE-METHOD-IMPOSSIBLE-PROPERTIES*", $list4 );
    $interface_method_required_properties$ = SubLFiles.defconstant( "*INTERFACE-METHOD-REQUIRED-PROPERTIES*", $list5 );
    $invalid_interface_method_name_message$ = SubLFiles.defconstant( "*INVALID-INTERFACE-METHOD-NAME-MESSAGE*", $str51$The_interface_method_name__S_is_n );
    $invalid_interface_name_message$ = SubLFiles.defconstant( "*INVALID-INTERFACE-NAME-MESSAGE*", $str52$The_interface_name__S_is_not_a_va );
    $undeclare_method_name_message$ = SubLFiles.defconstant( "*UNDECLARE-METHOD-NAME-MESSAGE*", $str53$The_method__S_of_interface__S_is_ );
    $non_existing_interface_message$ = SubLFiles.defconstant( "*NON-EXISTING-INTERFACE-MESSAGE*", $str54$The_interface__S_which_appears_in );
    $invalid_lambda_list_message$ = SubLFiles.defconstant( "*INVALID-LAMBDA-LIST-MESSAGE*", $str55$Lambda_list__S_of_method__S_of_in );
    return NIL;
  }

  public static SubLObject setup_interfaces_file()
  {
    subl_macro_promotions.declare_defglobal( $sym2$_INTERFACES_INTERFACE_TABLE_ );
    subl_macro_promotions.declare_defglobal( $sym3$_INTERFACES_ALIST_OF_ALL_INTERFACES_ );
    access_macros.register_macro_helper( $sym37$SUBLOOP_INSTANCEOF_INTERFACE, $sym39$NEW_INTERFACE );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_interfaces_file();
  }

  @Override
  public void initializeVariables()
  {
    init_interfaces_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_interfaces_file();
  }
  static
  {
    me = new interfaces();
    $interfaces_initial_hashtable_size$ = null;
    $interfaces_interface_table_update_lock$ = null;
    $interfaces_interface_table$ = null;
    $interfaces_alist_of_all_interfaces$ = null;
    $interfaces_marked_interfaces$ = null;
    $interface_method_impossible_properties$ = null;
    $interface_method_required_properties$ = null;
    $invalid_interface_method_name_message$ = null;
    $invalid_interface_name_message$ = null;
    $undeclare_method_name_message$ = null;
    $non_existing_interface_message$ = null;
    $invalid_lambda_list_message$ = null;
    $int0$400 = makeInteger( 400 );
    $str1$Interface_Table_Update_Lock = makeString( "Interface Table Update Lock" );
    $sym2$_INTERFACES_INTERFACE_TABLE_ = makeSymbol( "*INTERFACES-INTERFACE-TABLE*" );
    $sym3$_INTERFACES_ALIST_OF_ALL_INTERFACES_ = makeSymbol( "*INTERFACES-ALIST-OF-ALL-INTERFACES*" );
    $list4 = ConsesLow.list( makeKeyword( "DEFAULT" ), makeKeyword( "AUTO-UPDATE" ), makeKeyword( "READ-ONLY" ) );
    $list5 = ConsesLow.list( makeKeyword( "NO-MEMBER-VARIABLES" ) );
    $sym6$CLET = makeSymbol( "CLET" );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "*INTERFACES-MARKED-INTERFACES*" ), NIL ) );
    $sym8$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym9$PROGN = makeSymbol( "PROGN" );
    $list10 = ConsesLow.list( ConsesLow.list( makeSymbol( "INTERFACES-UNMARK-ALL-MARKED-INTERFACES" ), makeSymbol( "*INTERFACES-MARKED-INTERFACES*" ) ) );
    $str11$__Describing_Interface__S = makeString( "~%Describing Interface ~S" );
    $str12$____name_____S = makeString( "~%  name -> ~S" );
    $str13$____parents_____S = makeString( "~%  parents -> ~S" );
    $str14$____compiled_inheritance_path____ = makeString( "~%  compiled-inheritance-path -> ~S" );
    $str15$____subinterfaces_____S = makeString( "~%  subinterfaces -> ~S" );
    $str16$____implementers_____S = makeString( "~%  implementers -> ~S" );
    $str17$____instance_method_decls_____S = makeString( "~%  instance-method-decls -> ~S" );
    $str18$____class_method_decls_____S = makeString( "~%  class-method-decls -> ~S" );
    $str19$____compiled_instance_method_decl = makeString( "~%  compiled-instance-method-decls -> ~S" );
    $str20$____compiled_class_method_decls__ = makeString( "~%  compiled-class-method-decls -> ~S" );
    $str21$____local_class_methods_____S = makeString( "~%  local-class-methods -> ~S" );
    $str22$____local_instance_methods_____S = makeString( "~%  local-instance-methods -> ~S" );
    $str23$___S_is_not_an_interface_ = makeString( "~%~S is not an interface." );
    $list24 = ConsesLow.list( makeSymbol( "INTERFACE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym25$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $sym26$INTERFACE_DEFINITION_LOCK = makeSymbol( "INTERFACE-DEFINITION-LOCK" );
    $kw27$COMPILED_INHERITANCE_PATH_FROM_ABOVE = makeKeyword( "COMPILED-INHERITANCE-PATH-FROM-ABOVE" );
    $kw28$TRANSMIT_COMPILED_INHERITANCE_PATH_DOWNWARD = makeKeyword( "TRANSMIT-COMPILED-INHERITANCE-PATH-DOWNWARD" );
    $kw29$COMPILE_INSTANCE_METHOD_DECLS_FROM_ABOVE = makeKeyword( "COMPILE-INSTANCE-METHOD-DECLS-FROM-ABOVE" );
    $sym30$CADR = makeSymbol( "CADR" );
    $kw31$TRANSMIT_COMPILE_INSTANCE_METHOD_DECLS_DOWNWARD = makeKeyword( "TRANSMIT-COMPILE-INSTANCE-METHOD-DECLS-DOWNWARD" );
    $kw32$COMPILE_CLASS_METHOD_DECLS_FROM_ABOVE = makeKeyword( "COMPILE-CLASS-METHOD-DECLS-FROM-ABOVE" );
    $kw33$TRANSMIT_COMPILE_CLASS_METHOD_DECLS_DOWNWARD = makeKeyword( "TRANSMIT-COMPILE-CLASS-METHOD-DECLS-DOWNWARD" );
    $str34$_P = makeString( "-P" );
    $sym35$DEFINE_PUBLIC = makeSymbol( "DEFINE-PUBLIC" );
    $sym36$RET = makeSymbol( "RET" );
    $sym37$SUBLOOP_INSTANCEOF_INTERFACE = makeSymbol( "SUBLOOP-INSTANCEOF-INTERFACE" );
    $sym38$QUOTE = makeSymbol( "QUOTE" );
    $sym39$NEW_INTERFACE = makeSymbol( "NEW-INTERFACE" );
    $list40 = ConsesLow.list( makeSymbol( "INTERFACE-NAME-AND-PROPERTIES" ), makeSymbol( "&BODY" ), makeSymbol( "METHOD-DECLS" ) );
    $kw41$EXTENDS = makeKeyword( "EXTENDS" );
    $str42$__Interface_names_must_be_a_symbo = makeString( "~%Interface names must be a symbol.  ~S is an invalid interface name." );
    $str43$__Interface_names_must_not_be_NIL = makeString( "~%Interface names must not be NIL.  NIL is an invalid interface name." );
    $str44$Interface_ = makeString( "Interface " );
    $str45$_Definition_Lock = makeString( " Definition Lock" );
    $str46$___S_is_not_a_valid_parent_interf = makeString( "~%~S is not a valid parent interface specification." );
    $str47$___S_is_not_a_valid_parent_interf = makeString( "~%~S is not a valid parent interface." );
    $str48$__Parent_interface__S_is_undefine = makeString( "~%Parent interface ~S is undefined." );
    $str49$___S_is_not_a_valid_interface_met = makeString( "~%~S is not a valid interface method declaration." );
    $str50$___S_is_not_a_valid_interface_met = makeString( "~%~S is not a valid interface method declaration sequence." );
    $str51$The_interface_method_name__S_is_n = makeString( "The interface method name ~S is not a valid method name.  Valid method names must be non-nil symbols." );
    $str52$The_interface_name__S_is_not_a_va = makeString( "The interface name ~S is not a valid interface name.  Valid interface names must be non-nil symbols." );
    $str53$The_method__S_of_interface__S_is_ = makeString( "The method ~S of interface ~S is undeclared.  The method must be declared within the body of a define-interface." );
    $str54$The_interface__S_which_appears_in = makeString( "The interface ~S which appears in a method declaration does not exist." );
    $str55$Lambda_list__S_of_method__S_of_in = makeString( "Lambda list ~S of method ~S of interface ~S is not a valid lambda list." );
    $sym56$INTERFACES_ADD_INTERFACE_CLASS_METHOD = makeSymbol( "INTERFACES-ADD-INTERFACE-CLASS-METHOD" );
    $list57 = ConsesLow.list( ConsesLow.listS( makeSymbol( "METHOD-NAME" ), makeSymbol( "INTERFACE-NAME" ), makeSymbol( "METHOD-PROPERTIES" ) ), makeSymbol( "LAMBDA-LIST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym58$INTERFACES_ADD_INTERFACE_INSTANCE_METHOD = makeSymbol( "INTERFACES-ADD-INTERFACE-INSTANCE-METHOD" );
    $kw59$INTERFACES_FIND_CLASS_METHOD_INTERNAL = makeKeyword( "INTERFACES-FIND-CLASS-METHOD-INTERNAL" );
    $kw60$INTERFACES_FIND_INSTANCE_METHOD_INTERNAL = makeKeyword( "INTERFACES-FIND-INSTANCE-METHOD-INTERNAL" );
    $sym61$DEF_CLASS_METHOD = makeSymbol( "DEF-CLASS-METHOD" );
    $kw62$BEFORE_LISTENERS = makeKeyword( "BEFORE-LISTENERS" );
    $kw63$AFTER_LISTENERS = makeKeyword( "AFTER-LISTENERS" );
    $sym64$DEF_INSTANCE_METHOD = makeSymbol( "DEF-INSTANCE-METHOD" );
    $str65$SUBLOOP_ALL_METHODS_OF_INTERFACE_ = makeString( "SUBLOOP-ALL-METHODS-OF-INTERFACE: ~S is not an interface." );
    $list66 = ConsesLow.list( makeSymbol( "INTERFACE" ), makeSymbol( "INDICATOR" ) );
    $sym67$CLASSES_GETF = makeSymbol( "CLASSES-GETF" );
    $sym68$INTERFACE_PLIST = makeSymbol( "INTERFACE-PLIST" );
    $str69$interface = makeString( "interface" );
    $sym70$CSETF = makeSymbol( "CSETF" );
    $sym71$CLASSES_PUTF = makeSymbol( "CLASSES-PUTF" );
    $str72$queue = makeString( "queue" );
    $str73$current_interface = makeString( "current-interface" );
    $sym74$LIST = makeSymbol( "LIST" );
    $list75 = ConsesLow.list( NIL );
    $sym76$WHILE = makeSymbol( "WHILE" );
    $sym77$CSETQ = makeSymbol( "CSETQ" );
    $sym78$CAR = makeSymbol( "CAR" );
    $sym79$CPOP = makeSymbol( "CPOP" );
    $sym80$NCONC = makeSymbol( "NCONC" );
    $sym81$COPY_LIST = makeSymbol( "COPY-LIST" );
    $sym82$INTERFACE_PARENTS = makeSymbol( "INTERFACE-PARENTS" );
    $sym83$INTERFACES_RETRIEVE_INTERFACE = makeSymbol( "INTERFACES-RETRIEVE-INTERFACE" );
    $list84 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "START-INTERFACE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym85$INTERFACE_SUBINTERFACES = makeSymbol( "INTERFACE-SUBINTERFACES" );
    $str86$next_generation = makeString( "next-generation" );
    $sym87$CONS = makeSymbol( "CONS" );
    $list88 = ConsesLow.list( ZERO_INTEGER );
    $sym89$CDR = makeSymbol( "CDR" );
    $list90 = ConsesLow.list( makeSymbol( "PROCESSED-NEXT-GENERATION" ), NIL );
    $sym91$NEW_DEPTH = makeSymbol( "NEW-DEPTH" );
    $sym92$_ = makeSymbol( "+" );
    $list93 = ConsesLow.list( ONE_INTEGER );
    $sym94$CDOLIST_COLLECTING = makeSymbol( "CDOLIST-COLLECTING" );
    $sym95$INTERFACE_NAME = makeSymbol( "INTERFACE-NAME" );
    $list96 = ConsesLow.list( makeSymbol( "PROCESSED-NEXT-GENERATION" ) );
    $list97 = ConsesLow.list( ConsesLow.list( makeSymbol( "CONS" ), makeSymbol( "INTERFACE-NAME" ), makeSymbol( "NEW-DEPTH" ) ) );
    $list98 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "DEPTH-VAR" ), makeSymbol( "START-INTERFACE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  }
}
/*
 * 
 * Total time: 452 ms
 * 
 */