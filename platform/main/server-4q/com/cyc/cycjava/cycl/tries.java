package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class tries
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.tries";
  public static final String myFingerPrint = "63c2034ccd68b8e09c42febc79c365cb89d31757554afbe46cf04c5c8bea04f8";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1113L)
  public static SubLSymbol $trie_objects$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1249L)
  public static SubLSymbol $trie_relevant_marks$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1371L)
  public static SubLSymbol $trie_ancestor_tracking$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1509L)
  public static SubLSymbol $dtp_trie$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2397L)
  private static SubLSymbol $trie_free_list$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2397L)
  private static SubLSymbol $trie_free_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21792L)
  private static SubLSymbol $trie_maximum_search_size$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38144L)
  public static SubLSymbol $trie_ancestor_tracking_resource$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38362L)
  public static SubLSymbol $trie_ancestor_tracking_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38448L)
  public static SubLSymbol $trie_ancestor_tracking_vector_size$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39304L)
  public static SubLSymbol $trie_ancestor_vector$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39347L)
  public static SubLSymbol $trie_ancestor_next$;
  private static final SubLSymbol $kw0$ALL;
  private static final SubLSymbol $sym1$TRIE;
  private static final SubLSymbol $sym2$TRIE_P;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PRINT_TRIE;
  private static final SubLSymbol $sym8$TRIE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$TRIE_NAME;
  private static final SubLSymbol $sym11$_CSETF_TRIE_NAME;
  private static final SubLSymbol $sym12$TRIE_TOP_NODE;
  private static final SubLSymbol $sym13$_CSETF_TRIE_TOP_NODE;
  private static final SubLSymbol $sym14$TRIE_UNIQUE;
  private static final SubLSymbol $sym15$_CSETF_TRIE_UNIQUE;
  private static final SubLSymbol $sym16$TRIE_CASE_SENSITIVE;
  private static final SubLSymbol $sym17$_CSETF_TRIE_CASE_SENSITIVE;
  private static final SubLSymbol $sym18$TRIE_ENTRY_TEST_FUNC;
  private static final SubLSymbol $sym19$_CSETF_TRIE_ENTRY_TEST_FUNC;
  private static final SubLSymbol $sym20$TRIE_MULTI;
  private static final SubLSymbol $sym21$_CSETF_TRIE_MULTI;
  private static final SubLSymbol $sym22$TRIE_MULTI_KEYS;
  private static final SubLSymbol $sym23$_CSETF_TRIE_MULTI_KEYS;
  private static final SubLSymbol $sym24$TRIE_MULTI_KEY_FUNC;
  private static final SubLSymbol $sym25$_CSETF_TRIE_MULTI_KEY_FUNC;
  private static final SubLSymbol $kw26$NAME;
  private static final SubLSymbol $kw27$TOP_NODE;
  private static final SubLSymbol $kw28$UNIQUE;
  private static final SubLSymbol $kw29$CASE_SENSITIVE;
  private static final SubLSymbol $kw30$ENTRY_TEST_FUNC;
  private static final SubLSymbol $kw31$MULTI;
  private static final SubLSymbol $kw32$MULTI_KEYS;
  private static final SubLSymbol $kw33$MULTI_KEY_FUNC;
  private static final SubLString $str34$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw35$BEGIN;
  private static final SubLSymbol $sym36$MAKE_TRIE;
  private static final SubLSymbol $kw37$SLOT;
  private static final SubLSymbol $kw38$END;
  private static final SubLSymbol $sym39$VISIT_DEFSTRUCT_OBJECT_TRIE_METHOD;
  private static final SubLString $str40$__TRIE;
  private static final SubLString $str41$__A;
  private static final SubLString $str42$_UNIQUE;
  private static final SubLString $str43$_SENSITIVE;
  private static final SubLString $str44$_INSENSITIVE;
  private static final SubLString $str45$__S;
  private static final SubLString $str46$_;
  private static final SubLString $str47$TRIE_resource_lock;
  private static final SubLSymbol $kw48$FREE;
  private static final SubLSymbol $kw49$TOP;
  private static final SubLString $str50$_m___S;
  private static final SubLString $str51$_____S;
  private static final SubLSymbol $sym52$STRINGP;
  private static final SubLString $str53$There_is_already_an_object__S_not;
  private static final SubLString $str54$Remove_it_anyway;
  private static final SubLString $str55$The_object_found_in_trie_for__S_i;
  private static final SubLString $str56$TRIE__S_does_not_have_unique_entr;
  private static final SubLInteger $int57$1000;
  private static final SubLString $str58$_S_will_result_in_a_search_that_i;
  private static final SubLSymbol $kw59$MAPPING_DONE;
  private static final SubLList $list60;
  private static final SubLList $list61;
  private static final SubLSymbol $kw62$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw63$DONE;
  private static final SubLSymbol $kw64$FORWARD;
  private static final SubLSymbol $sym65$ITERATOR;
  private static final SubLSymbol $sym66$CLET;
  private static final SubLSymbol $sym67$NEW_TRIE_ITERATOR;
  private static final SubLSymbol $sym68$DO_ITERATOR;
  private static final SubLSymbol $sym69$TRIE_ITERATOR_DONE;
  private static final SubLSymbol $sym70$TRIE_ITERATOR_NEXT;
  private static final SubLSymbol $sym71$TRIE_ITERATOR_FINALIZE;
  private static final SubLString $str72$Ancestor_Tracking_Resource;
  private static final SubLInteger $int73$100;
  private static final SubLSymbol $kw74$ERROR;
  private static final SubLSymbol $sym75$MULTI_TRIE_P;
  private static final SubLList $list76;
  private static final SubLString $str77$_A__A;
  private static final SubLSymbol $sym78$CAR;
  private static final SubLList $list79;
  private static final SubLString $str80$___S_sub_tries;
  private static final SubLString $str81$____Sub_Trie__S;
  private static final SubLSymbol $sym82$TRIE_LEAF_NODE_P;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1509L)
  public static SubLObject trie_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_trie( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1509L)
  public static SubLObject trie_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $trie_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1509L)
  public static SubLObject trie_name(final SubLObject v_object)
  {
    assert NIL != trie_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1509L)
  public static SubLObject trie_top_node(final SubLObject v_object)
  {
    assert NIL != trie_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1509L)
  public static SubLObject trie_unique(final SubLObject v_object)
  {
    assert NIL != trie_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1509L)
  public static SubLObject trie_case_sensitive(final SubLObject v_object)
  {
    assert NIL != trie_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1509L)
  public static SubLObject trie_entry_test_func(final SubLObject v_object)
  {
    assert NIL != trie_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1509L)
  public static SubLObject trie_multi(final SubLObject v_object)
  {
    assert NIL != trie_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1509L)
  public static SubLObject trie_multi_keys(final SubLObject v_object)
  {
    assert NIL != trie_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1509L)
  public static SubLObject trie_multi_key_func(final SubLObject v_object)
  {
    assert NIL != trie_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1509L)
  public static SubLObject _csetf_trie_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trie_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1509L)
  public static SubLObject _csetf_trie_top_node(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trie_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1509L)
  public static SubLObject _csetf_trie_unique(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trie_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1509L)
  public static SubLObject _csetf_trie_case_sensitive(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trie_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1509L)
  public static SubLObject _csetf_trie_entry_test_func(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trie_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1509L)
  public static SubLObject _csetf_trie_multi(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trie_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1509L)
  public static SubLObject _csetf_trie_multi_keys(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trie_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1509L)
  public static SubLObject _csetf_trie_multi_key_func(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trie_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1509L)
  public static SubLObject make_trie(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $trie_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw26$NAME ) )
      {
        _csetf_trie_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw27$TOP_NODE ) )
      {
        _csetf_trie_top_node( v_new, current_value );
      }
      else if( pcase_var.eql( $kw28$UNIQUE ) )
      {
        _csetf_trie_unique( v_new, current_value );
      }
      else if( pcase_var.eql( $kw29$CASE_SENSITIVE ) )
      {
        _csetf_trie_case_sensitive( v_new, current_value );
      }
      else if( pcase_var.eql( $kw30$ENTRY_TEST_FUNC ) )
      {
        _csetf_trie_entry_test_func( v_new, current_value );
      }
      else if( pcase_var.eql( $kw31$MULTI ) )
      {
        _csetf_trie_multi( v_new, current_value );
      }
      else if( pcase_var.eql( $kw32$MULTI_KEYS ) )
      {
        _csetf_trie_multi_keys( v_new, current_value );
      }
      else if( pcase_var.eql( $kw33$MULTI_KEY_FUNC ) )
      {
        _csetf_trie_multi_key_func( v_new, current_value );
      }
      else
      {
        Errors.error( $str34$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1509L)
  public static SubLObject visit_defstruct_trie(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw35$BEGIN, $sym36$MAKE_TRIE, EIGHT_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw37$SLOT, $kw26$NAME, trie_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw37$SLOT, $kw27$TOP_NODE, trie_top_node( obj ) );
    Functions.funcall( visitor_fn, obj, $kw37$SLOT, $kw28$UNIQUE, trie_unique( obj ) );
    Functions.funcall( visitor_fn, obj, $kw37$SLOT, $kw29$CASE_SENSITIVE, trie_case_sensitive( obj ) );
    Functions.funcall( visitor_fn, obj, $kw37$SLOT, $kw30$ENTRY_TEST_FUNC, trie_entry_test_func( obj ) );
    Functions.funcall( visitor_fn, obj, $kw37$SLOT, $kw31$MULTI, trie_multi( obj ) );
    Functions.funcall( visitor_fn, obj, $kw37$SLOT, $kw32$MULTI_KEYS, trie_multi_keys( obj ) );
    Functions.funcall( visitor_fn, obj, $kw37$SLOT, $kw33$MULTI_KEY_FUNC, trie_multi_key_func( obj ) );
    Functions.funcall( visitor_fn, obj, $kw38$END, $sym36$MAKE_TRIE, EIGHT_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1509L)
  public static SubLObject visit_defstruct_object_trie_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_trie( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1764L)
  public static SubLObject print_trie(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject name = trie_name( v_object );
    PrintLow.format( stream, $str40$__TRIE );
    if( NIL != name )
    {
      PrintLow.format( stream, $str41$__A, name );
    }
    else
    {
      final SubLObject unique = trie_unique( v_object );
      final SubLObject entry_test_func = trie_entry_test_func( v_object );
      final SubLObject case_sensitive = trie_case_sensitive( v_object );
      final SubLObject multiP = trie_multi( v_object );
      if( NIL != unique )
      {
        PrintLow.format( stream, $str42$_UNIQUE );
      }
      PrintLow.format( stream, $str41$__A, entry_test_func );
      if( NIL != case_sensitive )
      {
        PrintLow.format( stream, $str43$_SENSITIVE );
      }
      else
      {
        PrintLow.format( stream, $str44$_INSENSITIVE );
      }
      if( NIL != multiP )
      {
        PrintLow.format( stream, $str45$__S, trie_multi_keys( v_object ) );
      }
    }
    PrintLow.format( stream, $str46$_ );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2397L)
  public static SubLObject make_static_trie()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_object = NIL;
    final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding( thread );
    try
    {
      Storage.$current_area$.bind( Storage.get_static_area(), thread );
      v_object = make_trie( UNPROVIDED );
    }
    finally
    {
      Storage.$current_area$.rebind( _prev_bind_0, thread );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2397L)
  public static SubLObject init_trie(final SubLObject trie)
  {
    _csetf_trie_name( trie, NIL );
    _csetf_trie_top_node( trie, NIL );
    _csetf_trie_unique( trie, NIL );
    _csetf_trie_case_sensitive( trie, NIL );
    _csetf_trie_entry_test_func( trie, NIL );
    _csetf_trie_multi( trie, NIL );
    _csetf_trie_multi_keys( trie, NIL );
    _csetf_trie_multi_key_func( trie, NIL );
    return trie;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2397L)
  public static SubLObject free_trie_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != trie_p( v_object ) && trie_top_node( v_object ) == $kw48$FREE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2397L)
  public static SubLObject free_trie(SubLObject v_object)
  {
    assert NIL != trie_p( v_object ) : v_object;
    if( NIL == free_trie_p( v_object ) )
    {
      v_object = init_trie( v_object );
      _csetf_trie_top_node( v_object, $kw48$FREE );
      if( NIL != utilities_macros.$structure_resourcing_enabled$.getGlobalValue() )
      {
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( $trie_free_lock$.getGlobalValue() );
          _csetf_trie_name( v_object, $trie_free_list$.getGlobalValue() );
          $trie_free_list$.setGlobalValue( v_object );
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( $trie_free_lock$.getGlobalValue() );
          }
        }
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2397L)
  public static SubLObject get_trie()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != utilities_macros.$structure_resourcing_enabled$.getGlobalValue() )
    {
      SubLObject v_object = NIL;
      SubLObject found = NIL;
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( $trie_free_lock$.getGlobalValue() );
        v_object = $trie_free_list$.getGlobalValue();
        while ( NIL == found && NIL != v_object)
        {
          if( NIL != free_trie_p( v_object ) )
          {
            $trie_free_list$.setGlobalValue( trie_name( v_object ) );
            found = T;
          }
          else
          {
            v_object = trie_name( v_object );
          }
        }
        if( NIL == found )
        {
          if( NIL != utilities_macros.$structure_resourcing_make_static$.getDynamicValue( thread ) )
          {
            v_object = make_static_trie();
          }
          else
          {
            v_object = make_trie( UNPROVIDED );
          }
          $trie_free_list$.setGlobalValue( NIL );
        }
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( $trie_free_lock$.getGlobalValue() );
        }
      }
      return init_trie( v_object );
    }
    if( NIL != utilities_macros.$structure_resourcing_make_static$.getDynamicValue( thread ) )
    {
      return init_trie( make_static_trie() );
    }
    return init_trie( make_trie( UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2833L)
  public static SubLObject trie_node_key(final SubLObject node)
  {
    final SubLObject car = node.first();
    return car.isAtom() ? car : car.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3011L)
  public static SubLObject trie_node_data(final SubLObject node)
  {
    return node.rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3070L)
  public static SubLObject trie_node_subnodes(final SubLObject node)
  {
    return node.rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3133L)
  public static SubLObject trie_leaf_node_p(final SubLObject node)
  {
    return Equality.eq( trie_node_key( node ), $kw38$END );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3214L)
  public static SubLObject new_trie_terminal_node(final SubLObject v_object, final SubLObject uniqueP)
  {
    return ( NIL != uniqueP ) ? ConsesLow.cons( $kw38$END, v_object ) : ConsesLow.list( $kw38$END, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3332L)
  public static SubLObject new_trie_nonterminal_node(final SubLObject v_char, final SubLObject case_sensitive)
  {
    return ConsesLow.cons( ( NIL != case_sensitive ) ? v_char : Characters.char_downcase( v_char ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3464L)
  public static SubLObject trie_key_E(final SubLObject key1, final SubLObject key2, final SubLObject case_sensitive)
  {
    return ( NIL != case_sensitive ) ? Characters.charE( key1, key2 ) : Characters.char_equal( key1, key2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3590L)
  public static SubLObject trie_key_L(final SubLObject key1, final SubLObject key2, final SubLObject case_sensitive)
  {
    return ( NIL != case_sensitive ) ? Characters.charL( key1, key2 ) : Characters.char_lessp( key1, key2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3716L)
  public static SubLObject trie_key_LE(final SubLObject key1, final SubLObject key2, final SubLObject case_sensitive)
  {
    return ( NIL != case_sensitive ) ? Characters.charLE( key1, key2 ) : Characters.char_not_greaterp( key1, key2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3851L)
  public static SubLObject trie_key_G(final SubLObject key1, final SubLObject key2, final SubLObject case_sensitive)
  {
    return trie_key_L( key2, key1, case_sensitive );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3954L)
  public static SubLObject trie_key_GE(final SubLObject key1, final SubLObject key2, final SubLObject case_sensitive)
  {
    return trie_key_LE( key2, key1, case_sensitive );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4058L)
  public static SubLObject add_trie_subnode(final SubLObject node, final SubLObject subnode, final SubLObject case_sensitive)
  {
    final SubLObject data = trie_node_subnodes( node );
    final SubLObject subkey = trie_node_key( subnode );
    SubLObject back = NIL;
    SubLObject next = NIL;
    SubLObject key = NIL;
    back = node;
    for( next = data, key = trie_node_key( next.first() ); NIL != next && subkey != $kw38$END && ( key == $kw38$END || NIL != trie_key_L( key, subkey, case_sensitive ) ); next = next.rest(), key = trie_node_key( next
        .first() ) )
    {
      back = next;
    }
    ConsesLow.rplacd( back, ConsesLow.cons( subnode, next ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4546L)
  public static SubLObject create_trie(final SubLObject unique, SubLObject name, SubLObject case_sensitive, SubLObject test)
  {
    if( name == UNPROVIDED )
    {
      name = NIL;
    }
    if( case_sensitive == UNPROVIDED )
    {
      case_sensitive = T;
    }
    if( test == UNPROVIDED )
    {
      test = EQL;
    }
    final SubLObject trie = get_trie();
    _csetf_trie_name( trie, name );
    _csetf_trie_top_node( trie, ConsesLow.listS( $kw49$TOP, NIL ) );
    _csetf_trie_unique( trie, unique );
    _csetf_trie_case_sensitive( trie, case_sensitive );
    _csetf_trie_entry_test_func( trie, test );
    _csetf_trie_multi( trie, NIL );
    return trie;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5020L)
  public static SubLObject trie_from_strings(final SubLObject strings, final SubLObject unique, SubLObject case_sensitive, SubLObject test, SubLObject save_strings)
  {
    if( case_sensitive == UNPROVIDED )
    {
      case_sensitive = T;
    }
    if( test == UNPROVIDED )
    {
      test = NIL;
    }
    if( save_strings == UNPROVIDED )
    {
      save_strings = NIL;
    }
    if( NIL == test )
    {
      if( NIL != save_strings )
      {
        test = ( NIL != case_sensitive ) ? EQUAL : EQUALP;
      }
      else
      {
        test = EQL;
      }
    }
    final SubLObject trie = create_trie( unique, NIL, case_sensitive, test );
    SubLObject cdolist_list_var = strings;
    SubLObject string = NIL;
    string = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      trie_insert( trie, string, ( NIL != save_strings ) ? string : T, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      string = cdolist_list_var.first();
    }
    return trie;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5516L)
  public static SubLObject clear_trie(final SubLObject trie)
  {
    assert NIL != trie_p( trie ) : trie;
    final SubLObject top_node = trie_top_node( trie );
    ConsesLow.rplacd( top_node, NIL );
    if( NIL != trie_multi( trie ) )
    {
      final SubLObject top_node_marks = trie_node_marks( top_node );
      final SubLObject trie_marks = trie_multi_keys( trie );
      SubLObject cdolist_list_var = top_node_marks;
      SubLObject mark = NIL;
      mark = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        rem_trie_node_mark( top_node, mark );
        cdolist_list_var = cdolist_list_var.rest();
        mark = cdolist_list_var.first();
      }
      cdolist_list_var = trie_marks;
      mark = NIL;
      mark = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        add_trie_node_mark( top_node, mark );
        cdolist_list_var = cdolist_list_var.rest();
        mark = cdolist_list_var.first();
      }
    }
    return trie;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5975L)
  public static SubLObject trie_emptyP(final SubLObject trie)
  {
    assert NIL != trie_p( trie ) : trie;
    return Types.sublisp_null( trie_top_node( trie ).rest() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6111L)
  public static SubLObject trie_count(final SubLObject trie)
  {
    return trie_node_count( trie_top_node( trie ), trie_unique( trie ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6263L)
  public static SubLObject trie_node_count(final SubLObject node, final SubLObject uniqueP)
  {
    SubLObject total = ZERO_INTEGER;
    if( NIL != node )
    {
      if( NIL != trie_leaf_node_p( node ) )
      {
        if( NIL != uniqueP )
        {
          total = Numbers.add( total, ONE_INTEGER );
        }
        else
        {
          total = Numbers.add( total, Sequences.length( trie_node_data( node ) ) );
        }
      }
      else
      {
        SubLObject cdolist_list_var = trie_node_subnodes( node );
        SubLObject subnode = NIL;
        subnode = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          total = Numbers.add( total, trie_node_count( subnode, uniqueP ) );
          cdolist_list_var = cdolist_list_var.rest();
          subnode = cdolist_list_var.first();
        }
      }
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6621L)
  public static SubLObject show_trie(final SubLObject trie, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    streams_high.terpri( stream );
    show_trie_node( trie_top_node( trie ), stream, ZERO_INTEGER, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6808L)
  public static SubLObject show_trie_node(final SubLObject node, final SubLObject stream, final SubLObject depth, final SubLObject indent)
  {
    if( NIL != indent )
    {
      streams_high.terpri( stream );
      string_utilities.indent( stream, depth );
    }
    final SubLObject key = trie_node_key( node );
    final SubLObject marks = trie_node_marks( node );
    if( key.isChar() )
    {
      final SubLObject subnodes = trie_node_subnodes( node );
      if( NIL != subnodes )
      {
        print_high.princ( key, UNPROVIDED );
        if( NIL != marks )
        {
          PrintLow.format( stream, $str50$_m___S, marks );
        }
        show_trie_node( subnodes.first(), stream, Numbers.add( depth, ONE_INTEGER ), marks );
        SubLObject cdolist_list_var = subnodes.rest();
        SubLObject subnode = NIL;
        subnode = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          show_trie_node( subnode, stream, Numbers.add( depth, ONE_INTEGER ), T );
          cdolist_list_var = cdolist_list_var.rest();
          subnode = cdolist_list_var.first();
        }
      }
    }
    else if( key == $kw38$END )
    {
      PrintLow.format( stream, $str51$_____S, trie_node_data( node ) );
    }
    else if( key == $kw49$TOP )
    {
      if( NIL != marks )
      {
        PrintLow.format( stream, $str50$_m___S, marks );
      }
      final SubLObject subnodes = trie_node_subnodes( node );
      if( NIL != subnodes )
      {
        show_trie_node( subnodes.first(), stream, ZERO_INTEGER, marks );
        SubLObject cdolist_list_var = subnodes.rest();
        SubLObject subnode = NIL;
        subnode = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          show_trie_node( subnode, stream, ZERO_INTEGER, T );
          cdolist_list_var = cdolist_list_var.rest();
          subnode = cdolist_list_var.first();
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7723L)
  public static SubLObject trie_insert(final SubLObject trie, final SubLObject string, SubLObject v_object, SubLObject start, SubLObject end)
  {
    if( v_object == UNPROVIDED )
    {
      v_object = string;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    assert NIL != trie_p( trie ) : trie;
    assert NIL != Types.stringp( string ) : string;
    final SubLObject unique = trie_unique( trie );
    final SubLObject case_sensitive = trie_case_sensitive( trie );
    final SubLObject test = trie_entry_test_func( trie );
    final SubLObject max = ( NIL != end ) ? end : Sequences.length( string );
    SubLObject node = trie_top_node( trie );
    SubLObject existing_terminal = NIL;
    SubLObject ch = NIL;
    initialize_trie_ancestor_tracking( node );
    SubLObject next_node = NIL;
    SubLObject index = NIL;
    next_node = NIL;
    for( index = start; !index.numE( max ); index = Numbers.add( index, ONE_INTEGER ) )
    {
      ch = Strings.sublisp_char( string, index );
      if( NIL == next_node )
      {
        SubLObject csome_list_var = trie_node_subnodes( node );
        SubLObject subnode = NIL;
        subnode = csome_list_var.first();
        while ( NIL == next_node && NIL != csome_list_var)
        {
          final SubLObject subkey = trie_node_key( subnode );
          if( subkey.isChar() && NIL != trie_key_E( ch, subkey, case_sensitive ) )
          {
            next_node = subnode;
          }
          csome_list_var = csome_list_var.rest();
          subnode = csome_list_var.first();
        }
      }
      if( NIL != next_node )
      {
        node = next_node;
      }
      else
      {
        final SubLObject new_node = new_trie_nonterminal_node( ch, case_sensitive );
        add_trie_subnode( node, new_node, case_sensitive );
        node = new_node;
      }
      trie_ancestor_tracking_descend( node );
      next_node = NIL;
    }
    if( NIL == existing_terminal )
    {
      SubLObject csome_list_var = trie_node_subnodes( node );
      SubLObject subnode = NIL;
      subnode = csome_list_var.first();
      while ( NIL == existing_terminal && NIL != csome_list_var)
      {
        if( NIL != trie_leaf_node_p( subnode ) )
        {
          existing_terminal = subnode;
        }
        csome_list_var = csome_list_var.rest();
        subnode = csome_list_var.first();
      }
    }
    if( NIL != existing_terminal )
    {
      trie_ancestor_tracking_descend( existing_terminal );
      if( NIL != unique )
      {
        if( NIL == Functions.funcall( test, v_object, trie_node_data( existing_terminal ) ) )
        {
          Errors.error( $str53$There_is_already_an_object__S_not, trie_node_data( existing_terminal ), test, v_object );
        }
      }
      else
      {
        final SubLObject old_data = trie_node_data( existing_terminal );
        if( NIL == subl_promotions.memberP( v_object, old_data, test, UNPROVIDED ) )
        {
          multi_trie_existing_insert_mark( trie, v_object );
          final SubLObject new_data = ConsesLow.cons( v_object, old_data );
          ConsesLow.rplacd( existing_terminal, new_data );
        }
      }
    }
    else
    {
      final SubLObject new_terminal = new_trie_terminal_node( v_object, unique );
      multi_trie_new_insert_mark( trie, v_object );
      add_trie_subnode( node, new_terminal, case_sensitive );
    }
    finish_trie_ancestor_tracking();
    return trie;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9998L)
  public static SubLObject trie_remove(final SubLObject trie, final SubLObject string, SubLObject v_object, SubLObject start, SubLObject end)
  {
    if( v_object == UNPROVIDED )
    {
      v_object = string;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    assert NIL != trie_p( trie ) : trie;
    assert NIL != Types.stringp( string ) : string;
    final SubLObject unique = trie_unique( trie );
    final SubLObject case_sensitive = trie_case_sensitive( trie );
    final SubLObject test = trie_entry_test_func( trie );
    final SubLObject max = ( NIL != end ) ? end : Sequences.length( string );
    SubLObject node = trie_top_node( trie );
    SubLObject last_branching_node = NIL;
    SubLObject end_node = NIL;
    SubLObject last_branch = NIL;
    SubLObject ch = NIL;
    initialize_trie_ancestor_tracking( node );
    SubLObject next_node = NIL;
    SubLObject index = NIL;
    next_node = NIL;
    for( index = start; !index.numE( max ); index = Numbers.add( index, ONE_INTEGER ) )
    {
      ch = Strings.sublisp_char( string, index );
      if( NIL == next_node )
      {
        SubLObject csome_list_var = trie_node_subnodes( node );
        SubLObject subnode = NIL;
        subnode = csome_list_var.first();
        while ( NIL == next_node && NIL != csome_list_var)
        {
          final SubLObject subkey = trie_node_key( subnode );
          if( subkey.isChar() && NIL != trie_key_E( ch, subkey, case_sensitive ) )
          {
            next_node = subnode;
          }
          csome_list_var = csome_list_var.rest();
          subnode = csome_list_var.first();
        }
      }
      if( NIL == next_node )
      {
        finish_trie_ancestor_tracking();
        return trie;
      }
      if( NIL != trie_node_subnodes( node ).rest() )
      {
        last_branching_node = node;
        last_branch = next_node;
      }
      node = next_node;
      trie_ancestor_tracking_descend( node );
      next_node = NIL;
    }
    if( NIL == end_node )
    {
      SubLObject csome_list_var = trie_node_subnodes( node );
      SubLObject subnode = NIL;
      subnode = csome_list_var.first();
      while ( NIL == end_node && NIL != csome_list_var)
      {
        if( NIL != trie_leaf_node_p( subnode ) )
        {
          trie_ancestor_tracking_descend( subnode );
          end_node = subnode;
        }
        csome_list_var = csome_list_var.rest();
        subnode = csome_list_var.first();
      }
    }
    if( NIL == end_node )
    {
      finish_trie_ancestor_tracking();
      return trie;
    }
    if( NIL != unique )
    {
      if( NIL == Functions.funcall( test, v_object, trie_node_data( end_node ) ) )
      {
        Errors.cerror( $str54$Remove_it_anyway, $str55$The_object_found_in_trie_for__S_i, string, trie_node_data( end_node ), v_object );
      }
    }
    else
    {
      final SubLObject old_data = trie_node_data( end_node );
      final SubLObject new_data = Sequences.delete( v_object, old_data, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( !old_data.eql( new_data ) )
      {
        ConsesLow.rplacd( end_node, new_data );
      }
      if( NIL != new_data )
      {
        multi_trie_remove_mark( trie, v_object );
        finish_trie_ancestor_tracking();
        return trie;
      }
    }
    multi_trie_remove_mark( trie, v_object );
    if( NIL != trie_node_subnodes( node ).rest() )
    {
      ConsesLow.rplacd( node, Sequences.delete( end_node, trie_node_subnodes( node ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    else if( NIL != last_branch && NIL != last_branching_node )
    {
      last_branching_node = Sequences.delete( last_branch, last_branching_node, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      clear_trie( trie );
    }
    finish_trie_ancestor_tracking();
    return trie;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13445L)
  public static SubLObject trie_remove_all(final SubLObject trie, final SubLObject string, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    assert NIL != trie_p( trie ) : trie;
    assert NIL != Types.stringp( string ) : string;
    final SubLObject case_sensitive = trie_case_sensitive( trie );
    final SubLObject max = ( NIL != end ) ? end : Sequences.length( string );
    SubLObject node = trie_top_node( trie );
    SubLObject last_branching_node = NIL;
    SubLObject last_branch = NIL;
    SubLObject ch = NIL;
    SubLObject total = ZERO_INTEGER;
    initialize_trie_ancestor_tracking( node );
    SubLObject next_node = NIL;
    SubLObject index = NIL;
    next_node = NIL;
    for( index = start; !index.numE( max ); index = Numbers.add( index, ONE_INTEGER ) )
    {
      ch = Strings.sublisp_char( string, index );
      if( NIL == next_node )
      {
        SubLObject csome_list_var = trie_node_subnodes( node );
        SubLObject subnode = NIL;
        subnode = csome_list_var.first();
        while ( NIL == next_node && NIL != csome_list_var)
        {
          final SubLObject subkey = trie_node_key( subnode );
          if( subkey.isChar() && NIL != trie_key_E( ch, subkey, case_sensitive ) )
          {
            next_node = subnode;
          }
          csome_list_var = csome_list_var.rest();
          subnode = csome_list_var.first();
        }
      }
      if( NIL == next_node )
      {
        finish_trie_ancestor_tracking();
        return total;
      }
      if( NIL != trie_node_subnodes( node ).rest() )
      {
        last_branching_node = node;
        last_branch = next_node;
      }
      node = next_node;
      trie_ancestor_tracking_descend( node );
      next_node = NIL;
    }
    if( NIL != last_branch && NIL != last_branching_node )
    {
      total = trie_node_count( node, trie_unique( trie ) );
      multi_trie_remove_all_mark( trie );
      last_branching_node = Sequences.delete( last_branch, last_branching_node, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      total = trie_count( trie );
      clear_trie( trie );
    }
    finish_trie_ancestor_tracking();
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15541L)
  public static SubLObject trie_exact(final SubLObject trie, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end)
  {
    if( case_sensitiveP == UNPROVIDED )
    {
      case_sensitiveP = NIL;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != trie_p( trie ) : trie;
    assert NIL != Types.stringp( string ) : string;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == trie_unique( trie ) )
    {
      Errors.error( $str56$TRIE__S_does_not_have_unique_entr, trie );
    }
    case_sensitiveP = makeBoolean( NIL != case_sensitiveP && NIL != trie_case_sensitive( trie ) );
    SubLObject node = trie_top_node( trie );
    SubLObject v_char = NIL;
    SubLObject v_answer = NIL;
    final SubLObject stop = ( NIL != end ) ? end : Sequences.length( string );
    initialize_trie_ancestor_tracking( node );
    SubLObject i = NIL;
    SubLObject next_node = NIL;
    i = start;
    next_node = NIL;
    while ( !i.numE( stop ) && ( !i.numG( ZERO_INTEGER ) || NIL != node ))
    {
      v_char = Strings.sublisp_char( string, i );
      if( NIL == next_node )
      {
        SubLObject csome_list_var = trie_node_subnodes( node );
        SubLObject subnode = NIL;
        subnode = csome_list_var.first();
        while ( NIL == next_node && NIL != csome_list_var)
        {
          final SubLObject subkey = trie_node_key( subnode );
          if( subkey.isChar() && NIL != trie_key_E( v_char, subkey, case_sensitiveP ) )
          {
            next_node = subnode;
          }
          csome_list_var = csome_list_var.rest();
          subnode = csome_list_var.first();
        }
      }
      node = next_node;
      trie_ancestor_tracking_descend( node );
      i = Numbers.add( i, ONE_INTEGER );
      next_node = NIL;
    }
    if( NIL != node && NIL == v_answer )
    {
      SubLObject csome_list_var = trie_node_subnodes( node );
      SubLObject subnode = NIL;
      subnode = csome_list_var.first();
      while ( NIL == v_answer && NIL != csome_list_var)
      {
        if( NIL != trie_leaf_node_p( subnode ) )
        {
          trie_ancestor_tracking_descend( subnode );
          if( NIL != trie_relevant_ancestor_pathP( trie ) )
          {
            final SubLObject v_object = trie_node_data( subnode );
            if( NIL != trie_relevant_object( trie, v_object ) )
            {
              v_answer = v_object;
            }
          }
        }
        csome_list_var = csome_list_var.rest();
        subnode = csome_list_var.first();
      }
    }
    finish_trie_ancestor_tracking();
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17030L)
  public static SubLObject trie_prefix(final SubLObject trie, final SubLObject string, SubLObject case_sensitiveP, SubLObject exact_lengthP, SubLObject start, SubLObject end)
  {
    if( case_sensitiveP == UNPROVIDED )
    {
      case_sensitiveP = NIL;
    }
    if( exact_lengthP == UNPROVIDED )
    {
      exact_lengthP = NIL;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    if( NIL != case_sensitiveP || NIL == trie_case_sensitive( trie ) )
    {
      return trie_prefix_iterative( trie, string, exact_lengthP, start, end );
    }
    return trie_prefix_recursive( trie, string, exact_lengthP, start, end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17655L)
  public static SubLObject trie_prefix_iterative(final SubLObject trie, final SubLObject string, final SubLObject exact_lengthP, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != trie_p( trie ) : trie;
    assert NIL != Types.stringp( string ) : string;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $trie_objects$.currentBinding( thread );
    try
    {
      $trie_objects$.bind( NIL, thread );
      final SubLObject case_sensitive = trie_case_sensitive( trie );
      final SubLObject stop = ( NIL != end ) ? end : Sequences.length( string );
      SubLObject v_char = NIL;
      SubLObject terminal = NIL;
      final SubLObject uniqueP = trie_unique( trie );
      SubLObject node = trie_top_node( trie );
      initialize_trie_ancestor_tracking( node );
      SubLObject i = NIL;
      SubLObject next_node = NIL;
      i = start;
      next_node = NIL;
      while ( !i.numE( stop ) && ( !i.numG( ZERO_INTEGER ) || NIL != node ))
      {
        v_char = Strings.sublisp_char( string, i );
        if( NIL == next_node )
        {
          SubLObject csome_list_var = trie_node_subnodes( node );
          SubLObject subnode = NIL;
          subnode = csome_list_var.first();
          while ( NIL == next_node && NIL != csome_list_var)
          {
            final SubLObject subkey = trie_node_key( subnode );
            if( subkey.isChar() && NIL != trie_key_E( v_char, subkey, case_sensitive ) )
            {
              next_node = subnode;
            }
            node = next_node;
            trie_ancestor_tracking_descend( node );
            csome_list_var = csome_list_var.rest();
            subnode = csome_list_var.first();
          }
        }
        i = Numbers.add( i, ONE_INTEGER );
        next_node = NIL;
      }
      if( NIL != node )
      {
        if( NIL != exact_lengthP )
        {
          if( NIL == terminal )
          {
            SubLObject csome_list_var = trie_node_subnodes( node );
            SubLObject subnode = NIL;
            subnode = csome_list_var.first();
            while ( NIL == terminal && NIL != csome_list_var)
            {
              if( NIL != trie_leaf_node_p( subnode ) )
              {
                terminal = subnode;
                trie_ancestor_tracking_descend( subnode );
              }
              csome_list_var = csome_list_var.rest();
              subnode = csome_list_var.first();
            }
          }
          if( NIL != terminal && NIL != trie_relevant_ancestor_pathP( trie ) )
          {
            final SubLObject v_object = trie_node_data( terminal );
            if( NIL != uniqueP )
            {
              if( NIL != trie_relevant_object( trie, v_object ) )
              {
                $trie_objects$.setDynamicValue( ConsesLow.list( v_object ), thread );
              }
            }
            else
            {
              $trie_objects$.setDynamicValue( trie_relevant_objects( trie, v_object ), thread );
            }
          }
        }
        else
        {
          all_trie_objects_under_node( trie, node, uniqueP );
        }
      }
      ans = $trie_objects$.getDynamicValue( thread );
    }
    finally
    {
      $trie_objects$.rebind( _prev_bind_0, thread );
    }
    finish_trie_ancestor_tracking();
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19387L)
  public static SubLObject trie_prefix_recursive(final SubLObject trie, final SubLObject string, final SubLObject exact_lengthP, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != trie_p( trie ) : trie;
    assert NIL != Types.stringp( string ) : string;
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $trie_objects$.currentBinding( thread );
    try
    {
      $trie_objects$.bind( NIL, thread );
      final SubLObject top_node = trie_top_node( trie );
      initialize_trie_ancestor_tracking( top_node );
      if( NIL != trie_relevant_ancestor_pathP( trie ) )
      {
        SubLObject cdolist_list_var = trie_node_subnodes( top_node );
        SubLObject subnode = NIL;
        subnode = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          trie_ancestor_tracking_descend( subnode );
          if( NIL != trie_relevant_ancestor_pathP( trie ) )
          {
            trie_prefix_recursive_int( trie, subnode, string, start, ( NIL != end ) ? end : Sequences.length( string ), exact_lengthP, trie_unique( trie ) );
          }
          trie_ancestor_tracking_ascend();
          cdolist_list_var = cdolist_list_var.rest();
          subnode = cdolist_list_var.first();
        }
      }
      ans = $trie_objects$.getDynamicValue( thread );
      finish_trie_ancestor_tracking();
    }
    finally
    {
      $trie_objects$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20289L)
  public static SubLObject trie_prefix_recursive_int(final SubLObject trie, final SubLObject node, final SubLObject string, final SubLObject index, final SubLObject stop, final SubLObject exact_lengthP,
      final SubLObject uniqueP)
  {
    if( index.numE( stop ) )
    {
      if( NIL != exact_lengthP )
      {
        if( NIL != trie_leaf_node_p( node ) )
        {
          all_trie_objects_in_leaf_node( trie, node, uniqueP );
        }
      }
      else
      {
        all_trie_objects_under_node( trie, node, uniqueP );
      }
    }
    else
    {
      final SubLObject key = trie_node_key( node );
      if( !key.isChar() || NIL == Characters.char_equal( Strings.sublisp_char( string, index ), key ) )
      {
        return NIL;
      }
      SubLObject cdolist_list_var = trie_node_subnodes( node );
      SubLObject subnode = NIL;
      subnode = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        trie_ancestor_tracking_descend( subnode );
        if( NIL != trie_relevant_ancestor_pathP( trie ) )
        {
          trie_prefix_recursive_int( trie, subnode, string, Numbers.add( index, ONE_INTEGER ), stop, exact_lengthP, uniqueP );
        }
        trie_ancestor_tracking_ascend();
        cdolist_list_var = cdolist_list_var.rest();
        subnode = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21049L)
  public static SubLObject all_trie_objects_under_node(final SubLObject trie, final SubLObject node, final SubLObject uniqueP)
  {
    if( NIL != node )
    {
      if( NIL != trie_leaf_node_p( node ) )
      {
        all_trie_objects_in_leaf_node( trie, node, uniqueP );
      }
      else
      {
        SubLObject cdolist_list_var = trie_node_subnodes( node );
        SubLObject subnode = NIL;
        subnode = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          trie_ancestor_tracking_descend( subnode );
          if( NIL != trie_relevant_ancestor_pathP( trie ) )
          {
            all_trie_objects_under_node( trie, subnode, uniqueP );
          }
          trie_ancestor_tracking_ascend();
          cdolist_list_var = cdolist_list_var.rest();
          subnode = cdolist_list_var.first();
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21462L)
  public static SubLObject all_trie_objects_in_leaf_node(final SubLObject trie, final SubLObject node, final SubLObject uniqueP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject data = trie_node_data( node );
    if( NIL != uniqueP )
    {
      if( NIL != trie_relevant_object( trie, data ) )
      {
        $trie_objects$.setDynamicValue( ConsesLow.cons( data, $trie_objects$.getDynamicValue( thread ) ), thread );
      }
    }
    else
    {
      data = trie_relevant_objects( trie, data );
      $trie_objects$.setDynamicValue( ConsesLow.append( data, $trie_objects$.getDynamicValue( thread ) ), thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21897L)
  public static SubLObject trie_search(final SubLObject trie, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end)
  {
    if( case_sensitiveP == UNPROVIDED )
    {
      case_sensitiveP = NIL;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != trie_p( trie ) : trie;
    assert NIL != Types.stringp( string ) : string;
    case_sensitiveP = makeBoolean( NIL != case_sensitiveP && NIL != trie_case_sensitive( trie ) );
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = $trie_objects$.currentBinding( thread );
    try
    {
      $trie_objects$.bind( NIL, thread );
      final SubLObject uniqueP = trie_unique( trie );
      final SubLObject stack = Strings.make_string( $trie_maximum_search_size$.getDynamicValue( thread ), UNPROVIDED );
      final SubLObject stack_index = ZERO_INTEGER;
      final SubLObject string_max = Numbers.subtract( ( NIL != end ) ? end : Sequences.length( string ), ONE_INTEGER );
      final SubLObject top_node = trie_top_node( trie );
      initialize_trie_ancestor_tracking( top_node );
      if( NIL != trie_relevant_ancestor_pathP( trie ) )
      {
        SubLObject cdolist_list_var = trie_node_subnodes( top_node );
        SubLObject node = NIL;
        node = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          trie_ancestor_tracking_descend( node );
          if( NIL != trie_relevant_ancestor_pathP( trie ) )
          {
            trie_search_internal( trie, node, string, start, string_max, stack, stack_index, case_sensitiveP, uniqueP );
          }
          trie_ancestor_tracking_ascend();
          cdolist_list_var = cdolist_list_var.rest();
          node = cdolist_list_var.first();
        }
      }
      ans = $trie_objects$.getDynamicValue( thread );
      finish_trie_ancestor_tracking();
    }
    finally
    {
      $trie_objects$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22828L)
  public static SubLObject trie_search_internal(final SubLObject trie, final SubLObject node, final SubLObject string, final SubLObject string_min, final SubLObject string_max, final SubLObject stack,
      SubLObject stack_index, final SubLObject case_sensitiveP, final SubLObject uniqueP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject key = trie_node_key( node );
    if( NIL != list_utilities.lengthLE( stack, stack_index, UNPROVIDED ) )
    {
      Errors.error( $str58$_S_will_result_in_a_search_that_i, stack, $trie_maximum_search_size$.getDynamicValue( thread ) );
    }
    if( key.isChar() )
    {
      Strings.set_char( stack, stack_index, key );
      if( NIL != trie_match( string, string_min, string_max, stack, stack_index, case_sensitiveP ) )
      {
        all_trie_objects_under_node( trie, node, uniqueP );
      }
      else
      {
        stack_index = Numbers.add( stack_index, ONE_INTEGER );
        SubLObject cdolist_list_var = trie_node_subnodes( node );
        SubLObject subnode = NIL;
        subnode = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          trie_ancestor_tracking_descend( subnode );
          if( NIL != trie_relevant_ancestor_pathP( trie ) )
          {
            trie_search_internal( trie, subnode, string, string_min, string_max, stack, stack_index, case_sensitiveP, uniqueP );
          }
          trie_ancestor_tracking_ascend();
          cdolist_list_var = cdolist_list_var.rest();
          subnode = cdolist_list_var.first();
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23733L)
  public static SubLObject trie_match(final SubLObject string, final SubLObject string_min, final SubLObject string_max, final SubLObject array, final SubLObject array_max, final SubLObject case_sensitiveP)
  {
    if( array_max.numGE( Numbers.subtract( string_max, string_min ) ) )
    {
      SubLObject i;
      SubLObject i2;
      SubLObject s_char;
      SubLObject a_char;
      for( i = NIL, i2 = NIL, i = string_max, i2 = array_max; !i.numL( string_min ) && !i2.isNegative(); i = Numbers.subtract( i, ONE_INTEGER ), i2 = Numbers.subtract( i2, ONE_INTEGER ) )
      {
        s_char = Strings.sublisp_char( string, i );
        a_char = Strings.sublisp_char( array, i2 );
        if( NIL == ( ( NIL != case_sensitiveP ) ? Characters.charE( s_char, a_char ) : Characters.char_equal( s_char, a_char ) ) )
        {
          return NIL;
        }
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24281L)
  public static SubLObject map_trie_data(final SubLObject function, final SubLObject trie)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != trie_p( trie ) : trie;
    final SubLObject top_node = trie_top_node( trie );
    initialize_trie_ancestor_tracking( top_node );
    if( NIL != trie_relevant_ancestor_pathP( trie ) )
    {
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw59$MAPPING_DONE );
        map_trie_data_internal( function, trie, top_node, trie_unique( trie ) );
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw59$MAPPING_DONE );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    finish_trie_ancestor_tracking();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24795L)
  public static SubLObject map_trie_data_internal(final SubLObject function, final SubLObject trie, final SubLObject node, final SubLObject uniqueP)
  {
    if( NIL != trie_leaf_node_p( node ) )
    {
      final SubLObject data = trie_node_data( node );
      if( NIL != uniqueP )
      {
        if( NIL != trie_relevant_object( trie, data ) )
        {
          Functions.funcall( function, data );
        }
      }
      else
      {
        SubLObject cdolist_list_var = data;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != trie_relevant_object( trie, item ) )
          {
            Functions.funcall( function, item );
          }
          cdolist_list_var = cdolist_list_var.rest();
          item = cdolist_list_var.first();
        }
      }
    }
    else
    {
      SubLObject cdolist_list_var2 = trie_node_subnodes( node );
      SubLObject subnode = NIL;
      subnode = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        trie_ancestor_tracking_descend( subnode );
        if( NIL != trie_relevant_ancestor_pathP( trie ) )
        {
          map_trie_data_internal( function, trie, subnode, uniqueP );
        }
        trie_ancestor_tracking_ascend();
        cdolist_list_var2 = cdolist_list_var2.rest();
        subnode = cdolist_list_var2.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25393L)
  public static SubLObject map_trie_data_direction(final SubLObject function, final SubLObject trie, final SubLObject string, SubLObject start, SubLObject end, SubLObject v_forward)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    if( v_forward == UNPROVIDED )
    {
      v_forward = T;
    }
    assert NIL != trie_p( trie ) : trie;
    assert NIL != Types.stringp( string ) : string;
    if( NIL == end )
    {
      end = Sequences.length( string );
    }
    final SubLObject top_node = trie_top_node( trie );
    final SubLObject unique = trie_unique( trie );
    final SubLObject case_sensitive = trie_case_sensitive( trie );
    initialize_trie_ancestor_tracking( top_node );
    if( NIL != trie_relevant_ancestor_pathP( trie ) )
    {
      if( NIL != v_forward )
      {
        map_trie_data_forward( function, trie, top_node, unique, case_sensitive, string, start, end );
      }
      else
      {
        map_trie_data_backward( function, trie, top_node, unique, case_sensitive, string, start, end );
      }
    }
    finish_trie_ancestor_tracking();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26185L)
  public static SubLObject map_trie_data_forward(final SubLObject function, final SubLObject trie, final SubLObject node, final SubLObject unique, final SubLObject case_sensitive, final SubLObject string,
      final SubLObject char_index, final SubLObject end_index)
  {
    if( NIL != string )
    {
      if( char_index.numE( end_index ) )
      {
        map_trie_data_forward( function, trie, node, unique, case_sensitive, NIL, NIL, NIL );
      }
      else
      {
        final SubLObject v_char = Strings.sublisp_char( string, char_index );
        SubLObject cdolist_list_var = trie_node_subnodes( node );
        SubLObject subnode = NIL;
        subnode = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          trie_ancestor_tracking_descend( subnode );
          if( NIL != trie_relevant_ancestor_pathP( trie ) )
          {
            final SubLObject subkey = trie_node_key( subnode );
            if( subkey != $kw38$END )
            {
              if( NIL == trie_key_L( subkey, v_char, case_sensitive ) )
              {
                if( NIL != trie_key_E( subkey, v_char, case_sensitive ) )
                {
                  map_trie_data_forward( function, trie, subnode, unique, case_sensitive, string, Numbers.add( char_index, ONE_INTEGER ), end_index );
                }
                else
                {
                  map_trie_data_forward( function, trie, subnode, unique, case_sensitive, NIL, NIL, NIL );
                }
              }
            }
          }
          trie_ancestor_tracking_ascend();
          cdolist_list_var = cdolist_list_var.rest();
          subnode = cdolist_list_var.first();
        }
      }
    }
    else if( NIL != trie_leaf_node_p( node ) )
    {
      final SubLObject data = trie_node_data( node );
      if( NIL != unique )
      {
        if( NIL != trie_relevant_object( trie, data ) )
        {
          Functions.funcall( function, data );
        }
      }
      else
      {
        SubLObject cdolist_list_var = data;
        SubLObject datum = NIL;
        datum = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != trie_relevant_object( trie, datum ) )
          {
            Functions.funcall( function, datum );
          }
          cdolist_list_var = cdolist_list_var.rest();
          datum = cdolist_list_var.first();
        }
      }
    }
    else
    {
      SubLObject cdolist_list_var2 = trie_node_subnodes( node );
      SubLObject subnode2 = NIL;
      subnode2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        trie_ancestor_tracking_descend( subnode2 );
        if( NIL != trie_relevant_ancestor_pathP( trie ) )
        {
          map_trie_data_forward( function, trie, subnode2, unique, case_sensitive, NIL, NIL, NIL );
        }
        trie_ancestor_tracking_ascend();
        cdolist_list_var2 = cdolist_list_var2.rest();
        subnode2 = cdolist_list_var2.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28085L)
  public static SubLObject map_trie_data_backward(final SubLObject function, final SubLObject trie, final SubLObject node, final SubLObject unique, final SubLObject case_sensitive, final SubLObject string,
      final SubLObject char_index, final SubLObject end_index)
  {
    if( NIL != string )
    {
      if( !char_index.numE( end_index ) )
      {
        final SubLObject v_char = Strings.sublisp_char( string, char_index );
        final SubLObject subnodes = trie_node_subnodes( node );
        SubLObject length;
        SubLObject index_from_end;
        SubLObject node_index;
        SubLObject subnode;
        SubLObject subkey;
        for( length = Sequences.length( subnodes ), index_from_end = NIL, index_from_end = ZERO_INTEGER; index_from_end.numL( length ); index_from_end = Numbers.add( index_from_end, ONE_INTEGER ) )
        {
          node_index = Numbers.subtract( length, index_from_end, ONE_INTEGER );
          subnode = ConsesLow.nth( node_index, subnodes );
          subkey = trie_node_key( subnode );
          trie_ancestor_tracking_descend( subnode );
          if( NIL != trie_relevant_ancestor_pathP( trie ) )
          {
            if( subkey == $kw38$END )
            {
              map_trie_data_backward( function, trie, subnode, unique, case_sensitive, NIL, NIL, NIL );
            }
            else if( NIL != trie_key_L( subkey, v_char, case_sensitive ) )
            {
              map_trie_data_backward( function, trie, subnode, unique, case_sensitive, NIL, NIL, NIL );
            }
            else if( NIL != trie_key_E( subkey, v_char, case_sensitive ) )
            {
              map_trie_data_backward( function, trie, subnode, unique, case_sensitive, string, Numbers.add( char_index, ONE_INTEGER ), end_index );
            }
          }
          trie_ancestor_tracking_ascend();
        }
      }
    }
    else if( NIL != trie_leaf_node_p( node ) )
    {
      final SubLObject data = trie_node_data( node );
      if( NIL != unique )
      {
        if( NIL != trie_relevant_object( trie, data ) )
        {
          Functions.funcall( function, data );
        }
      }
      else
      {
        SubLObject cdolist_list_var = data;
        SubLObject datum = NIL;
        datum = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != trie_relevant_object( trie, datum ) )
          {
            Functions.funcall( function, datum );
          }
          cdolist_list_var = cdolist_list_var.rest();
          datum = cdolist_list_var.first();
        }
      }
    }
    else
    {
      final SubLObject subnodes2 = trie_node_subnodes( node );
      SubLObject length2;
      SubLObject index_from_end2;
      SubLObject node_index2;
      SubLObject subnode2;
      for( length2 = Sequences.length( subnodes2 ), index_from_end2 = NIL, index_from_end2 = ZERO_INTEGER; index_from_end2.numL( length2 ); index_from_end2 = Numbers.add( index_from_end2, ONE_INTEGER ) )
      {
        node_index2 = Numbers.subtract( length2, index_from_end2, ONE_INTEGER );
        subnode2 = ConsesLow.nth( node_index2, subnodes2 );
        trie_ancestor_tracking_descend( subnode2 );
        if( NIL != trie_relevant_ancestor_pathP( trie ) )
        {
          map_trie_data_backward( function, trie, subnode2, unique, case_sensitive, NIL, NIL, NIL );
        }
        trie_ancestor_tracking_ascend();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30454L)
  public static SubLObject do_objects_in_trie(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject v_object = NIL;
    SubLObject trie = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    trie = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list60 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list60 );
      if( NIL == conses_high.member( current_$1, $list61, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw62$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list60 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw63$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject forward_tail = cdestructuring_bind.property_list_member( $kw64$FORWARD, current );
    final SubLObject v_forward = ( NIL != forward_tail ) ? conses_high.cadr( forward_tail ) : T;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject iterator = $sym65$ITERATOR;
    return ConsesLow.list( $sym66$CLET, ConsesLow.list( ConsesLow.list( iterator, ConsesLow.list( $sym67$NEW_TRIE_ITERATOR, trie, v_forward ) ) ), ConsesLow.listS( $sym68$DO_ITERATOR, ConsesLow.list( v_object, iterator,
        $kw63$DONE, done ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 30812L)
  public static SubLObject new_trie_iterator(final SubLObject trie, SubLObject forwardP)
  {
    if( forwardP == UNPROVIDED )
    {
      forwardP = T;
    }
    final SubLObject state = new_trie_iterator_state( trie, forwardP );
    return iteration.new_iterator( state, $sym69$TRIE_ITERATOR_DONE, $sym70$TRIE_ITERATOR_NEXT, $sym71$TRIE_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31058L)
  public static SubLObject new_trie_iterator_state(final SubLObject trie, final SubLObject forwardP)
  {
    final SubLObject state = Vectors.make_vector( FIVE_INTEGER, NIL );
    Vectors.set_aref( state, ZERO_INTEGER, trie );
    Vectors.set_aref( state, ONE_INTEGER, trie_top_node( trie ) );
    Vectors.set_aref( state, TWO_INTEGER, forwardP );
    Vectors.set_aref( state, THREE_INTEGER, ( NIL != trie_unique( trie ) ) ? NIL : queues.create_queue( UNPROVIDED ) );
    Vectors.set_aref( state, FOUR_INTEGER, stacks.create_stack() );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31513L)
  public static SubLObject trie_iterator_done(final SubLObject state)
  {
    return makeBoolean( NIL != trie_iterator_done_node( Vectors.aref( state, ONE_INTEGER ) ) && NIL != trie_iterator_done_queue( Vectors.aref( state, THREE_INTEGER ) ) && NIL != trie_iterator_done_stack( Vectors.aref(
        state, FOUR_INTEGER ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31713L)
  public static SubLObject trie_iterator_done_node(final SubLObject node)
  {
    return Types.sublisp_null( node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31782L)
  public static SubLObject trie_iterator_done_queue(final SubLObject possibly_queue)
  {
    return makeBoolean( NIL == queues.queue_p( possibly_queue ) || NIL != queues.queue_empty_p( possibly_queue ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 31924L)
  public static SubLObject trie_iterator_done_stack(final SubLObject stack)
  {
    return stacks.stack_empty_p( stack );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32005L)
  public static SubLObject trie_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject trie = Vectors.aref( state, ZERO_INTEGER );
    final SubLObject node = Vectors.aref( state, ONE_INTEGER );
    final SubLObject forwardP = Vectors.aref( state, TWO_INTEGER );
    final SubLObject queue = Vectors.aref( state, THREE_INTEGER );
    final SubLObject stack = Vectors.aref( state, FOUR_INTEGER );
    thread.resetMultipleValues();
    final SubLObject next = ( NIL != queues.queue_p( queue ) ) ? trie_iterator_next_non_unique( trie, node, forwardP, queue, stack ) : trie_iterator_next_unique( trie, node, forwardP, stack );
    final SubLObject invalidP = thread.secondMultipleValue();
    final SubLObject new_node = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != invalidP )
    {
      Vectors.set_aref( state, ONE_INTEGER, NIL );
      Vectors.set_aref( state, THREE_INTEGER, NIL );
      stacks.clear_stack( stack );
    }
    else
    {
      Vectors.set_aref( state, ONE_INTEGER, new_node );
    }
    return Values.values( next, state, invalidP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 32595L)
  public static SubLObject trie_iterator_next_unique(final SubLObject trie, SubLObject node, final SubLObject forwardP, final SubLObject stack)
  {
    SubLObject next;
    SubLObject invalidP;
    for( next = NIL, invalidP = NIL; NIL == next && NIL == invalidP; invalidP = T )
    {
      if( NIL != trie_leaf_node_p( node ) )
      {
        final SubLObject data = trie_node_data( node );
        if( NIL != trie_relevant_object( trie, data ) )
        {
          next = data;
        }
      }
      else
      {
        final SubLObject subnodes = trie_node_subnodes( node );
        if( NIL != forwardP )
        {
          SubLObject cdolist_list_var = Sequences.reverse( subnodes );
          SubLObject subnode = NIL;
          subnode = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            stacks.stack_push( subnode, stack );
            cdolist_list_var = cdolist_list_var.rest();
            subnode = cdolist_list_var.first();
          }
        }
        else
        {
          SubLObject cdolist_list_var = subnodes;
          SubLObject subnode = NIL;
          subnode = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            stacks.stack_push( subnode, stack );
            cdolist_list_var = cdolist_list_var.rest();
            subnode = cdolist_list_var.first();
          }
        }
      }
      node = stacks.stack_pop( stack );
      if( NIL == next && NIL == node && NIL != stacks.stack_empty_p( stack ) )
      {
      }
    }
    return Values.values( next, invalidP, node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 33260L)
  public static SubLObject trie_iterator_next_non_unique(final SubLObject trie, SubLObject node, final SubLObject forwardP, final SubLObject queue, final SubLObject stack)
  {
    SubLObject next;
    SubLObject invalidP;
    for( next = NIL, invalidP = NIL; NIL == next && NIL == invalidP; invalidP = T )
    {
      if( NIL != queues.queue_empty_p( queue ) )
      {
        if( NIL != trie_leaf_node_p( node ) )
        {
          SubLObject cdolist_list_var;
          final SubLObject data = cdolist_list_var = trie_node_data( node );
          SubLObject item = NIL;
          item = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( NIL != trie_relevant_object( trie, item ) )
            {
              queues.enqueue( item, queue );
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
          }
        }
        else
        {
          final SubLObject subnodes = trie_node_subnodes( node );
          if( NIL != forwardP )
          {
            SubLObject cdolist_list_var = Sequences.reverse( subnodes );
            SubLObject subnode = NIL;
            subnode = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              stacks.stack_push( subnode, stack );
              cdolist_list_var = cdolist_list_var.rest();
              subnode = cdolist_list_var.first();
            }
          }
          else
          {
            SubLObject cdolist_list_var = subnodes;
            SubLObject subnode = NIL;
            subnode = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              stacks.stack_push( subnode, stack );
              cdolist_list_var = cdolist_list_var.rest();
              subnode = cdolist_list_var.first();
            }
          }
        }
        node = stacks.stack_pop( stack );
      }
      else
      {
        next = queues.dequeue( queue );
      }
      if( NIL == next && NIL == node && NIL != stacks.stack_empty_p( stack ) && NIL != queues.queue_empty_p( queue ) )
      {
      }
    }
    return Values.values( next, invalidP, node );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34069L)
  public static SubLObject trie_iterator_finalize(SubLObject state)
  {
    if( NIL != queues.queue_p( Vectors.aref( state, THREE_INTEGER ) ) )
    {
      queues.clear_queue( Vectors.aref( state, THREE_INTEGER ) );
    }
    stacks.clear_stack( Vectors.aref( state, FOUR_INTEGER ) );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( FIVE_INTEGER ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      Vectors.set_aref( state, i, NIL );
    }
    state = NIL;
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34295L)
  public static SubLObject new_directed_trie_iterator(final SubLObject trie, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject forwardP, SubLObject strictP)
  {
    if( case_sensitiveP == UNPROVIDED )
    {
      case_sensitiveP = NIL;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    if( forwardP == UNPROVIDED )
    {
      forwardP = T;
    }
    if( strictP == UNPROVIDED )
    {
      strictP = NIL;
    }
    final SubLObject state = new_directed_trie_iterator_state( trie, string, case_sensitiveP, start, end, forwardP, strictP );
    return iteration.new_iterator( state, $sym69$TRIE_ITERATOR_DONE, $sym70$TRIE_ITERATOR_NEXT, $sym71$TRIE_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 34805L)
  public static SubLObject new_directed_trie_iterator_state(final SubLObject trie, final SubLObject string, final SubLObject case_sensitiveP, final SubLObject start, final SubLObject end, final SubLObject forwardP,
      final SubLObject strictP)
  {
    final SubLObject state = Vectors.make_vector( FIVE_INTEGER, NIL );
    final SubLObject stack = directed_trie_iterator_generate_stack( trie, string, case_sensitiveP, start, end, forwardP, strictP );
    final SubLObject node = stacks.stack_pop( stack );
    Vectors.set_aref( state, ZERO_INTEGER, trie );
    Vectors.set_aref( state, ONE_INTEGER, node );
    Vectors.set_aref( state, TWO_INTEGER, forwardP );
    Vectors.set_aref( state, THREE_INTEGER, ( NIL != trie_unique( trie ) ) ? NIL : queues.create_queue( UNPROVIDED ) );
    Vectors.set_aref( state, FOUR_INTEGER, stack );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35443L)
  public static SubLObject directed_trie_iterator_generate_stack(final SubLObject trie, final SubLObject string, final SubLObject case_sensitiveP, final SubLObject start, final SubLObject end, final SubLObject forwardP,
      final SubLObject strictP)
  {
    final SubLObject start_node = trie_top_node( trie );
    final SubLObject start_string = Sequences.subseq( string, start, end );
    final SubLObject stack = stacks.create_stack();
    if( NIL != forwardP )
    {
      forward_trie_iterator_generate_stack_recursive( start_node, stack, start_string, case_sensitiveP, strictP );
    }
    else
    {
      backward_trie_iterator_generate_stack_recursive( start_node, stack, start_string, case_sensitiveP, strictP );
    }
    return stack;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 35924L)
  public static SubLObject forward_trie_iterator_generate_stack_recursive(final SubLObject node, final SubLObject stack, final SubLObject string, final SubLObject case_sensitiveP, final SubLObject strictly_forwardP)
  {
    if( NIL != list_utilities.lengthE( string, ZERO_INTEGER, UNPROVIDED ) )
    {
      if( NIL == strictly_forwardP )
      {
        final SubLObject subnodes = trie_node_subnodes( node );
        SubLObject cdolist_list_var = Sequences.reverse( subnodes );
        SubLObject subnode = NIL;
        subnode = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          stacks.stack_push( subnode, stack );
          cdolist_list_var = cdolist_list_var.rest();
          subnode = cdolist_list_var.first();
        }
      }
    }
    else
    {
      final SubLObject subnodes = trie_node_subnodes( node );
      final SubLObject v_char = Sequences.elt( string, ZERO_INTEGER );
      SubLObject equal_nodes = NIL;
      SubLObject cdolist_list_var2 = Sequences.reverse( subnodes );
      SubLObject subnode2 = NIL;
      subnode2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        final SubLObject key = trie_node_key( subnode2 );
        if( key != $kw38$END )
        {
          if( NIL == trie_key_L( key, v_char, case_sensitiveP ) )
          {
            if( NIL != trie_key_E( key, v_char, case_sensitiveP ) )
            {
              equal_nodes = ConsesLow.cons( subnode2, equal_nodes );
            }
            else
            {
              stacks.stack_push( subnode2, stack );
            }
          }
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        subnode2 = cdolist_list_var2.first();
      }
      equal_nodes = ( cdolist_list_var2 = Sequences.nreverse( equal_nodes ) );
      subnode2 = NIL;
      subnode2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        forward_trie_iterator_generate_stack_recursive( subnode2, stack, Sequences.subseq( string, ONE_INTEGER, UNPROVIDED ), case_sensitiveP, strictly_forwardP );
        cdolist_list_var2 = cdolist_list_var2.rest();
        subnode2 = cdolist_list_var2.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 37031L)
  public static SubLObject backward_trie_iterator_generate_stack_recursive(final SubLObject node, final SubLObject stack, final SubLObject string, final SubLObject case_sensitiveP, final SubLObject strictly_backwardP)
  {
    if( NIL != list_utilities.lengthE( string, ZERO_INTEGER, UNPROVIDED ) )
    {
      if( NIL == strictly_backwardP )
      {
        SubLObject cdolist_list_var;
        final SubLObject subnodes = cdolist_list_var = trie_node_subnodes( node );
        SubLObject subnode = NIL;
        subnode = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          stacks.stack_push( subnode, stack );
          cdolist_list_var = cdolist_list_var.rest();
          subnode = cdolist_list_var.first();
        }
      }
    }
    else
    {
      final SubLObject subnodes = trie_node_subnodes( node );
      final SubLObject v_char = Sequences.elt( string, ZERO_INTEGER );
      SubLObject equal_nodes = NIL;
      SubLObject cdolist_list_var2 = subnodes;
      SubLObject subnode2 = NIL;
      subnode2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        final SubLObject key = trie_node_key( subnode2 );
        if( key == $kw38$END )
        {
          stacks.stack_push( subnode2, stack );
        }
        else if( NIL != trie_key_L( key, v_char, case_sensitiveP ) )
        {
          stacks.stack_push( subnode2, stack );
        }
        else if( NIL != trie_key_E( key, v_char, case_sensitiveP ) )
        {
          equal_nodes = ConsesLow.cons( subnode2, equal_nodes );
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        subnode2 = cdolist_list_var2.first();
      }
      equal_nodes = ( cdolist_list_var2 = Sequences.nreverse( equal_nodes ) );
      subnode2 = NIL;
      subnode2 = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        backward_trie_iterator_generate_stack_recursive( subnode2, stack, Sequences.subseq( string, ONE_INTEGER, UNPROVIDED ), case_sensitiveP, strictly_backwardP );
        cdolist_list_var2 = cdolist_list_var2.rest();
        subnode2 = cdolist_list_var2.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38505L)
  public static SubLObject new_trie_ancestor_tracking_vector()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Vectors.make_vector( $trie_ancestor_tracking_vector_size$.getDynamicValue( thread ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 38615L)
  public static SubLObject get_trie_ancestor_tracking_vector()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $trie_ancestor_tracking_lock$.getDynamicValue( thread ) );
      if( NIL != $trie_ancestor_tracking_resource$.getDynamicValue( thread ) )
      {
        final SubLObject resource = $trie_ancestor_tracking_resource$.getDynamicValue( thread );
        $trie_ancestor_tracking_resource$.setDynamicValue( Vectors.aref( resource, ZERO_INTEGER ), thread );
        Vectors.set_aref( resource, ZERO_INTEGER, NIL );
        ans = resource;
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $trie_ancestor_tracking_lock$.getDynamicValue( thread ) );
      }
    }
    if( NIL == ans )
    {
      ans = new_trie_ancestor_tracking_vector();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39039L)
  public static SubLObject free_trie_ancestor_tracking_vector(final SubLObject vector)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( vector.isVector() )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( $trie_ancestor_tracking_lock$.getDynamicValue( thread ) );
        Vectors.set_aref( vector, ZERO_INTEGER, $trie_ancestor_tracking_resource$.getDynamicValue( thread ) );
        $trie_ancestor_tracking_resource$.setDynamicValue( vector, thread );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( $trie_ancestor_tracking_lock$.getDynamicValue( thread ) );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39387L)
  public static SubLObject initialize_trie_ancestor_tracking(final SubLObject top_node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $trie_ancestor_tracking$.getDynamicValue( thread ) )
    {
      $trie_ancestor_vector$.setDynamicValue( get_trie_ancestor_tracking_vector(), thread );
      $trie_ancestor_next$.setDynamicValue( ZERO_INTEGER, thread );
      trie_ancestor_tracking_descend( top_node );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39684L)
  public static SubLObject finish_trie_ancestor_tracking()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $trie_ancestor_tracking$.getDynamicValue( thread ) )
    {
      free_trie_ancestor_tracking_vector( $trie_ancestor_vector$.getDynamicValue( thread ) );
      $trie_ancestor_next$.setDynamicValue( ZERO_INTEGER, thread );
      $trie_ancestor_vector$.setDynamicValue( NIL, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 39912L)
  public static SubLObject trie_ancestor_tracking_descend(final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $trie_ancestor_tracking$.getDynamicValue( thread ) )
    {
      if( $trie_ancestor_next$.getDynamicValue( thread ).numGE( Sequences.length( $trie_ancestor_vector$.getDynamicValue( thread ) ) ) )
      {
        $trie_ancestor_vector$.setDynamicValue( vector_utilities.grow_vector( $trie_ancestor_vector$.getDynamicValue( thread ), NIL, TWO_INTEGER ), thread );
      }
      Vectors.set_aref( $trie_ancestor_vector$.getDynamicValue( thread ), $trie_ancestor_next$.getDynamicValue( thread ), node );
      $trie_ancestor_next$.setDynamicValue( Numbers.add( $trie_ancestor_next$.getDynamicValue( thread ), ONE_INTEGER ), thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40286L)
  public static SubLObject trie_ancestor_tracking_ascend()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $trie_ancestor_tracking$.getDynamicValue( thread ) )
    {
      $trie_ancestor_next$.setDynamicValue( Numbers.subtract( $trie_ancestor_next$.getDynamicValue( thread ), ONE_INTEGER ), thread );
      Vectors.set_aref( $trie_ancestor_vector$.getDynamicValue( thread ), $trie_ancestor_next$.getDynamicValue( thread ), NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40475L)
  public static SubLObject trie_ancestor_path()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Values.values( $trie_ancestor_vector$.getDynamicValue( thread ), $trie_ancestor_next$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40568L)
  public static SubLObject no_more_ancestors(final SubLObject ancestor_index)
  {
    return Numbers.numE( ancestor_index, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40642L)
  public static SubLObject first_ancestor(final SubLObject ancestor_vector, final SubLObject ancestor_index)
  {
    if( NIL != no_more_ancestors( ancestor_index ) )
    {
      return NIL;
    }
    return Vectors.aref( ancestor_vector, Numbers.subtract( ancestor_index, ONE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40817L)
  public static SubLObject parent_ancestor(final SubLObject ancestor_vector, final SubLObject ancestor_index)
  {
    return first_ancestor( ancestor_vector, ancestor_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 40932L)
  public static SubLObject next_generation(final SubLObject ancestor_index)
  {
    return Numbers.subtract( ancestor_index, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41004L)
  public static SubLObject multi_trie_some_ancestor_marked(final SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject some_ancestor_marked = NIL;
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw59$MAPPING_DONE );
      SubLObject cdotimes_end_var;
      SubLObject index;
      SubLObject ancestor;
      for( cdotimes_end_var = Numbers.subtract( ancestor_index, ONE_INTEGER ), index = NIL, index = ZERO_INTEGER; index.numL( cdotimes_end_var ); index = Numbers.add( index, ONE_INTEGER ) )
      {
        ancestor = Vectors.aref( ancestor_vector, index );
        if( NIL != trie_node_has_mark( ancestor, mark ) )
        {
          some_ancestor_marked = T;
          utilities_macros.mapping_finished();
        }
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var, $kw59$MAPPING_DONE );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return some_ancestor_marked;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 41458L)
  public static SubLObject create_multi_trie(final SubLObject unique, final SubLObject multi_key_func, SubLObject name, SubLObject case_sensitive, SubLObject test)
  {
    if( name == UNPROVIDED )
    {
      name = NIL;
    }
    if( case_sensitive == UNPROVIDED )
    {
      case_sensitive = T;
    }
    if( test == UNPROVIDED )
    {
      test = EQL;
    }
    final SubLObject trie = create_trie( unique, name, case_sensitive, test );
    _csetf_trie_top_node( trie, $kw74$ERROR );
    _csetf_trie_multi( trie, T );
    _csetf_trie_multi_key_func( trie, multi_key_func );
    _csetf_trie_multi_keys( trie, NIL );
    return trie;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42001L)
  public static SubLObject multi_trie_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != trie_p( v_object ) && NIL != trie_multi( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42084L)
  public static SubLObject clear_multi_trie(final SubLObject trie, SubLObject clear_keys)
  {
    if( clear_keys == UNPROVIDED )
    {
      clear_keys = NIL;
    }
    assert NIL != multi_trie_p( trie ) : trie;
    _csetf_trie_top_node( trie, $kw74$ERROR );
    if( NIL != clear_keys )
    {
      _csetf_trie_multi_keys( trie, NIL );
    }
    else
    {
      SubLObject cdolist_list_var = trie_multi_keys( trie );
      SubLObject info = NIL;
      info = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = info;
        SubLObject key = NIL;
        SubLObject subtrie = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list76 );
        key = current.first();
        current = ( subtrie = current.rest() );
        clear_trie( subtrie );
        cdolist_list_var = cdolist_list_var.rest();
        info = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42479L)
  public static SubLObject add_multi_trie_key(final SubLObject trie, final SubLObject mark)
  {
    assert NIL != multi_trie_p( trie ) : trie;
    final SubLObject unique = trie_unique( trie );
    final SubLObject name = trie_name( trie );
    final SubLObject case_sensitive = trie_case_sensitive( trie );
    final SubLObject test = trie_entry_test_func( trie );
    final SubLObject sub_name = PrintLow.format( NIL, $str77$_A__A, name, mark );
    final SubLObject sub_trie = create_trie( unique, sub_name, case_sensitive, test );
    _csetf_trie_multi_keys( trie, ConsesLow.cons( ConsesLow.cons( mark, sub_trie ), trie_multi_keys( trie ) ) );
    return mark;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 42914L)
  public static SubLObject rem_multi_trie_key(final SubLObject trie, final SubLObject mark)
  {
    assert NIL != multi_trie_p( trie ) : trie;
    _csetf_trie_multi_keys( trie, Sequences.delete( mark, trie_multi_keys( trie ), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym78$CAR ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return mark;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43085L)
  public static SubLObject multi_trie_emptyP(final SubLObject trie)
  {
    assert NIL != multi_trie_p( trie ) : trie;
    SubLObject some_non_empty = NIL;
    if( NIL == some_non_empty )
    {
      SubLObject csome_list_var = trie_multi_keys( trie );
      SubLObject info = NIL;
      info = csome_list_var.first();
      while ( NIL == some_non_empty && NIL != csome_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = info;
        SubLObject mark = NIL;
        SubLObject subtrie = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
        mark = current.first();
        current = ( subtrie = current.rest() );
        some_non_empty = makeBoolean( NIL == trie_emptyP( subtrie ) );
        csome_list_var = csome_list_var.rest();
        info = csome_list_var.first();
      }
    }
    return makeBoolean( NIL == some_non_empty );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43423L)
  public static SubLObject multi_trie_count(final SubLObject trie)
  {
    assert NIL != multi_trie_p( trie ) : trie;
    SubLObject total_count = ZERO_INTEGER;
    SubLObject cdolist_list_var = trie_multi_keys( trie );
    SubLObject info = NIL;
    info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = info;
      SubLObject mark = NIL;
      SubLObject subtrie = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
      mark = current.first();
      current = ( subtrie = current.rest() );
      total_count = Numbers.add( total_count, trie_count( subtrie ) );
      cdolist_list_var = cdolist_list_var.rest();
      info = cdolist_list_var.first();
    }
    return total_count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 43746L)
  public static SubLObject show_multi_trie(final SubLObject trie, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    assert NIL != multi_trie_p( trie ) : trie;
    PrintLow.format( stream, $str80$___S_sub_tries, Sequences.length( trie_multi_keys( trie ) ) );
    SubLObject cdolist_list_var = trie_multi_keys( trie );
    SubLObject info = NIL;
    info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = info;
      SubLObject mark = NIL;
      SubLObject subtrie = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
      mark = current.first();
      current = ( subtrie = current.rest() );
      PrintLow.format( stream, $str81$____Sub_Trie__S, mark );
      show_trie( subtrie, stream );
      cdolist_list_var = cdolist_list_var.rest();
      info = cdolist_list_var.first();
    }
    return trie;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44143L)
  public static SubLObject multi_trie_insert(final SubLObject trie, final SubLObject string, SubLObject v_object, SubLObject start, SubLObject end)
  {
    if( v_object == UNPROVIDED )
    {
      v_object = string;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    assert NIL != multi_trie_p( trie ) : trie;
    final SubLObject key_func = trie_multi_key_func( trie );
    final SubLObject mark = Functions.funcall( key_func, v_object );
    final SubLObject subtrie = conses_high.assoc( mark, trie_multi_keys( trie ), UNPROVIDED, UNPROVIDED ).rest();
    if( NIL != trie_p( subtrie ) )
    {
      trie_insert( subtrie, string, v_object, start, end );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44507L)
  public static SubLObject multi_trie_remove(final SubLObject trie, final SubLObject string, SubLObject v_object, SubLObject start, SubLObject end)
  {
    if( v_object == UNPROVIDED )
    {
      v_object = string;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    assert NIL != multi_trie_p( trie ) : trie;
    final SubLObject key_func = trie_multi_key_func( trie );
    final SubLObject mark = Functions.funcall( key_func, v_object );
    final SubLObject subtrie = conses_high.assoc( mark, trie_multi_keys( trie ), UNPROVIDED, UNPROVIDED ).rest();
    if( NIL != trie_p( subtrie ) )
    {
      trie_remove( subtrie, string, v_object, start, end );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 44871L)
  public static SubLObject multi_trie_remove_all(final SubLObject trie, final SubLObject string, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    assert NIL != multi_trie_p( trie ) : trie;
    SubLObject total = ZERO_INTEGER;
    SubLObject cdolist_list_var = trie_multi_keys( trie );
    SubLObject info = NIL;
    info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = info;
      SubLObject mark = NIL;
      SubLObject subtrie = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
      mark = current.first();
      current = ( subtrie = current.rest() );
      total = Numbers.add( total, trie_remove_all( subtrie, string, start, end ) );
      cdolist_list_var = cdolist_list_var.rest();
      info = cdolist_list_var.first();
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45177L)
  public static SubLObject multi_trie_exact(final SubLObject trie, final SubLObject string, SubLObject case_sensitiveP, SubLObject relevant_marks, SubLObject start, SubLObject end)
  {
    if( case_sensitiveP == UNPROVIDED )
    {
      case_sensitiveP = NIL;
    }
    if( relevant_marks == UNPROVIDED )
    {
      relevant_marks = $kw0$ALL;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    assert NIL != multi_trie_p( trie ) : trie;
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = trie_multi_keys( trie );
    SubLObject info = NIL;
    info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = info;
      SubLObject mark = NIL;
      SubLObject subtrie = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
      mark = current.first();
      current = ( subtrie = current.rest() );
      if( relevant_marks == $kw0$ALL || NIL != conses_high.member( mark, relevant_marks, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject sub_ans = trie_exact( subtrie, string, case_sensitiveP, start, end );
        if( NIL != sub_ans )
        {
          ans = ConsesLow.cons( sub_ans, ans );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      info = cdolist_list_var.first();
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 45671L)
  public static SubLObject multi_trie_prefix(final SubLObject trie, final SubLObject string, SubLObject case_sensitiveP, SubLObject exact_lengthP, SubLObject relevant_marks, SubLObject start, SubLObject end)
  {
    if( case_sensitiveP == UNPROVIDED )
    {
      case_sensitiveP = NIL;
    }
    if( exact_lengthP == UNPROVIDED )
    {
      exact_lengthP = NIL;
    }
    if( relevant_marks == UNPROVIDED )
    {
      relevant_marks = $kw0$ALL;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    assert NIL != multi_trie_p( trie ) : trie;
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = trie_multi_keys( trie );
    SubLObject info = NIL;
    info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = info;
      SubLObject mark = NIL;
      SubLObject subtrie = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
      mark = current.first();
      current = ( subtrie = current.rest() );
      if( relevant_marks == $kw0$ALL || NIL != conses_high.member( mark, relevant_marks, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject sub_ans = trie_prefix( subtrie, string, case_sensitiveP, exact_lengthP, start, end );
        ans = ConsesLow.append( sub_ans, ans );
      }
      cdolist_list_var = cdolist_list_var.rest();
      info = cdolist_list_var.first();
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46160L)
  public static SubLObject multi_trie_search(final SubLObject trie, final SubLObject string, SubLObject case_sensitiveP, SubLObject relevant_marks, SubLObject start, SubLObject end)
  {
    if( case_sensitiveP == UNPROVIDED )
    {
      case_sensitiveP = NIL;
    }
    if( relevant_marks == UNPROVIDED )
    {
      relevant_marks = $kw0$ALL;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    assert NIL != multi_trie_p( trie ) : trie;
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = trie_multi_keys( trie );
    SubLObject info = NIL;
    info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = info;
      SubLObject mark = NIL;
      SubLObject subtrie = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
      mark = current.first();
      current = ( subtrie = current.rest() );
      if( relevant_marks == $kw0$ALL || NIL != conses_high.member( mark, relevant_marks, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject sub_ans = trie_search( subtrie, string, case_sensitiveP, start, end );
        ans = ConsesLow.append( sub_ans, ans );
      }
      cdolist_list_var = cdolist_list_var.rest();
      info = cdolist_list_var.first();
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 46621L)
  public static SubLObject map_multi_trie_data(final SubLObject function, final SubLObject trie, SubLObject relevant_marks)
  {
    if( relevant_marks == UNPROVIDED )
    {
      relevant_marks = $kw0$ALL;
    }
    assert NIL != multi_trie_p( trie ) : trie;
    SubLObject cdolist_list_var = trie_multi_keys( trie );
    SubLObject info = NIL;
    info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = info;
      SubLObject mark = NIL;
      SubLObject subtrie = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
      mark = current.first();
      current = ( subtrie = current.rest() );
      if( relevant_marks == $kw0$ALL || NIL != conses_high.member( mark, relevant_marks, UNPROVIDED, UNPROVIDED ) )
      {
        map_trie_data( function, subtrie );
      }
      cdolist_list_var = cdolist_list_var.rest();
      info = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47016L)
  public static SubLObject map_multi_trie_data_mark(final SubLObject function, final SubLObject trie, final SubLObject mark)
  {
    assert NIL != multi_trie_p( trie ) : trie;
    final SubLObject subtrie = conses_high.assoc( mark, trie_multi_keys( trie ), UNPROVIDED, UNPROVIDED ).rest();
    if( NIL != trie_p( subtrie ) )
    {
      map_trie_data( function, subtrie );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47308L)
  public static SubLObject map_multi_trie_data_direction(final SubLObject function, final SubLObject trie, final SubLObject string, SubLObject relevant_marks, SubLObject start, SubLObject end, SubLObject v_forward)
  {
    if( relevant_marks == UNPROVIDED )
    {
      relevant_marks = $kw0$ALL;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    if( v_forward == UNPROVIDED )
    {
      v_forward = T;
    }
    assert NIL != multi_trie_p( trie ) : trie;
    SubLObject cdolist_list_var = trie_multi_keys( trie );
    SubLObject info = NIL;
    info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = info;
      SubLObject mark = NIL;
      SubLObject subtrie = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list79 );
      mark = current.first();
      current = ( subtrie = current.rest() );
      if( relevant_marks == $kw0$ALL || NIL != conses_high.member( mark, relevant_marks, UNPROVIDED, UNPROVIDED ) )
      {
        map_trie_data_direction( function, subtrie, string, start, end, v_forward );
      }
      cdolist_list_var = cdolist_list_var.rest();
      info = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 47711L)
  public static SubLObject map_multi_trie_data_direction_mark(final SubLObject function, final SubLObject trie, final SubLObject string, final SubLObject mark, SubLObject start, SubLObject end, SubLObject v_forward)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    if( v_forward == UNPROVIDED )
    {
      v_forward = T;
    }
    assert NIL != multi_trie_p( trie ) : trie;
    final SubLObject subtrie = conses_high.assoc( mark, trie_multi_keys( trie ), UNPROVIDED, UNPROVIDED ).rest();
    if( NIL != trie_p( subtrie ) )
    {
      map_trie_data_direction( function, subtrie, string, start, end, v_forward );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48031L)
  public static SubLObject trie_relevant_ancestor_pathP(final SubLObject trie)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == trie_multi( trie ) )
    {
      return T;
    }
    if( NIL == $trie_relevant_marks$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    if( $trie_relevant_marks$.getDynamicValue( thread ).isAtom() )
    {
      return T;
    }
    SubLObject some_mark_not_on_any_ancestor = NIL;
    thread.resetMultipleValues();
    final SubLObject ancestor_vector = trie_ancestor_path();
    final SubLObject ancestor_end_index = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == some_mark_not_on_any_ancestor )
    {
      SubLObject csome_list_var = $trie_relevant_marks$.getDynamicValue( thread );
      SubLObject mark = NIL;
      mark = csome_list_var.first();
      while ( NIL == some_mark_not_on_any_ancestor && NIL != csome_list_var)
      {
        SubLObject mark_on_ancestor = NIL;
        SubLObject catch_var = NIL;
        try
        {
          thread.throwStack.push( $kw59$MAPPING_DONE );
          SubLObject index;
          SubLObject ancestor;
          for( index = NIL, index = ZERO_INTEGER; index.numL( ancestor_end_index ); index = Numbers.add( index, ONE_INTEGER ) )
          {
            ancestor = Vectors.aref( ancestor_vector, index );
            if( NIL != ( ( NIL != trie_leaf_node_p( ancestor ) ) ? trie_leaf_has_implicit_mark( trie, ancestor, mark ) : trie_node_has_mark( ancestor, mark ) ) )
            {
              mark_on_ancestor = T;
              utilities_macros.mapping_finished();
            }
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          catch_var = Errors.handleThrowable( ccatch_env_var, $kw59$MAPPING_DONE );
        }
        finally
        {
          thread.throwStack.pop();
        }
        if( NIL == mark_on_ancestor )
        {
          some_mark_not_on_any_ancestor = T;
        }
        csome_list_var = csome_list_var.rest();
        mark = csome_list_var.first();
      }
    }
    return some_mark_not_on_any_ancestor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 48955L)
  public static SubLObject trie_relevant_object(final SubLObject trie, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == trie_multi( trie ) )
    {
      return T;
    }
    if( NIL == $trie_relevant_marks$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    if( $trie_relevant_marks$.getDynamicValue( thread ).isAtom() )
    {
      return T;
    }
    final SubLObject object_mark = Functions.funcall( trie_multi_key_func( trie ), v_object );
    return conses_high.member( object_mark, $trie_relevant_marks$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49270L)
  public static SubLObject trie_relevant_objects(final SubLObject trie, final SubLObject objects)
  {
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = objects;
    SubLObject v_object = NIL;
    v_object = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != trie_relevant_object( trie, v_object ) )
      {
        ans = ConsesLow.cons( v_object, ans );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_object = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49446L)
  public static SubLObject add_trie_mark(final SubLObject trie, final SubLObject mark)
  {
    assert NIL != trie_p( trie ) : trie;
    if( NIL != trie_multi( trie ) )
    {
      final SubLObject marks = trie_multi_keys( trie );
      if( NIL == Sequences.find( mark, marks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        _csetf_trie_multi_keys( trie, ConsesLow.cons( mark, marks ) );
        add_trie_node_mark( trie_top_node( trie ), mark );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 49979L)
  public static SubLObject rem_trie_mark(final SubLObject trie, final SubLObject mark)
  {
    assert NIL != trie_p( trie ) : trie;
    if( NIL != trie_multi( trie ) )
    {
      final SubLObject marks = trie_multi_keys( trie );
      if( NIL != Sequences.find( mark, marks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        _csetf_trie_multi_keys( trie, list_utilities.delete_first( mark, marks, UNPROVIDED ) );
        rem_trie_node_mark( trie_top_node( trie ), mark );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50452L)
  public static SubLObject trie_node_marks(final SubLObject node)
  {
    final SubLObject car = node.first();
    if( car.isCons() )
    {
      return car.rest();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50603L)
  public static SubLObject trie_node_has_mark(final SubLObject node, final SubLObject mark)
  {
    return Sequences.find( mark, trie_node_marks( node ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 50741L)
  public static SubLObject set_trie_node_marks(final SubLObject node, final SubLObject marks)
  {
    final SubLObject key = trie_node_key( node );
    if( key != $kw38$END )
    {
      if( NIL == marks )
      {
        ConsesLow.rplaca( node, key );
      }
      else
      {
        final SubLObject car = node.first();
        if( car.isCons() )
        {
          ConsesLow.rplacd( car, marks );
        }
        else
        {
          ConsesLow.rplaca( node, ConsesLow.cons( key, marks ) );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51066L)
  public static SubLObject trie_leaf_has_implicit_mark(final SubLObject trie, final SubLObject leaf_node, final SubLObject mark)
  {
    final SubLObject data = trie_node_data( leaf_node );
    final SubLObject mark_func = trie_multi_key_func( trie );
    if( NIL != trie_unique( trie ) )
    {
      return makeBoolean( !mark.eql( Functions.funcall( mark_func, data ) ) );
    }
    SubLObject cdolist_list_var = data;
    SubLObject datum = NIL;
    datum = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( mark.eql( Functions.funcall( mark_func, datum ) ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      datum = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51390L)
  public static SubLObject add_trie_node_mark(final SubLObject node, final SubLObject mark)
  {
    if( NIL == trie_leaf_node_p( node ) )
    {
      final SubLObject marks = trie_node_marks( node );
      if( NIL == Sequences.find( mark, marks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        set_trie_node_marks( node, ConsesLow.cons( mark, marks ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 51724L)
  public static SubLObject rem_trie_node_mark(final SubLObject node, final SubLObject mark)
  {
    if( NIL == trie_leaf_node_p( node ) )
    {
      final SubLObject marks = trie_node_marks( node );
      if( NIL != Sequences.find( mark, marks, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        set_trie_node_marks( node, list_utilities.delete_first( mark, marks, UNPROVIDED ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52021L)
  public static SubLObject trie_node_mark_present_recursive(final SubLObject trie, SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark)
  {
    final SubLObject node = first_ancestor( ancestor_vector, ancestor_index );
    ancestor_index = next_generation( ancestor_index );
    if( NIL != trie_node_has_mark( node, mark ) )
    {
      return rem_trie_node_mark( node, mark );
    }
    final SubLObject parent = parent_ancestor( ancestor_vector, ancestor_index );
    SubLObject cdolist_list_var;
    final SubLObject siblings = cdolist_list_var = trie_node_subnodes( parent );
    SubLObject sibling = NIL;
    sibling = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !node.eql( sibling ) && NIL == trie_leaf_node_p( sibling ) )
      {
        add_trie_node_mark( sibling, mark );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sibling = cdolist_list_var.first();
    }
    return trie_node_mark_present_recursive( trie, ancestor_index, ancestor_vector, mark );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 52907L)
  public static SubLObject trie_node_mark_not_present_recursive(final SubLObject trie, SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark)
  {
    final SubLObject node = first_ancestor( ancestor_vector, ancestor_index );
    ancestor_index = next_generation( ancestor_index );
    if( NIL != no_more_ancestors( ancestor_index ) )
    {
      return add_trie_node_mark( node, mark );
    }
    final SubLObject parent = parent_ancestor( ancestor_vector, ancestor_index );
    SubLObject cdolist_list_var;
    final SubLObject siblings = cdolist_list_var = trie_node_subnodes( parent );
    SubLObject sibling = NIL;
    sibling = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !node.eql( sibling ) )
      {
        if( NIL != trie_leaf_node_p( sibling ) )
        {
          if( NIL == trie_leaf_has_implicit_mark( trie, sibling, mark ) )
          {
            return add_trie_node_mark( node, mark );
          }
        }
        else if( NIL == trie_node_has_mark( sibling, mark ) )
        {
          return add_trie_node_mark( node, mark );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      sibling = cdolist_list_var.first();
    }
    cdolist_list_var = siblings;
    sibling = NIL;
    sibling = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !node.eql( sibling ) && NIL == trie_leaf_node_p( sibling ) )
      {
        rem_trie_node_mark( sibling, mark );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sibling = cdolist_list_var.first();
    }
    return trie_node_mark_not_present_recursive( trie, ancestor_index, ancestor_vector, mark );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 54411L)
  public static SubLObject multi_trie_existing_insert_mark(final SubLObject trie, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != trie_multi( trie ) )
    {
      thread.resetMultipleValues();
      final SubLObject ancestor_vector = trie_ancestor_path();
      final SubLObject ancestor_index = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject object_mark = Functions.funcall( trie_multi_key_func( trie ), v_object );
      final SubLObject trie_marks = trie_multi_keys( trie );
      final SubLObject node = first_ancestor( ancestor_vector, ancestor_index );
      assert NIL != trie_leaf_node_p( node ) : node;
      SubLObject cdolist_list_var = trie_marks;
      SubLObject mark = NIL;
      mark = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( mark.eql( object_mark ) )
        {
          multi_trie_existing_insert_mark_present( trie, ancestor_index, ancestor_vector, mark );
        }
        else
        {
          multi_trie_existing_insert_mark_not_present( trie, ancestor_index, ancestor_vector, mark );
        }
        cdolist_list_var = cdolist_list_var.rest();
        mark = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55222L)
  public static SubLObject multi_trie_existing_insert_mark_present(final SubLObject trie, final SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark)
  {
    final SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked( ancestor_index, ancestor_vector, mark );
    if( NIL != some_ancestor_marked )
    {
      trie_node_mark_present_recursive( trie, ancestor_index, ancestor_vector, mark );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 55628L)
  public static SubLObject multi_trie_existing_insert_mark_not_present(final SubLObject trie, final SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark)
  {
    final SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked( ancestor_index, ancestor_vector, mark );
    if( NIL != some_ancestor_marked )
    {
      return NIL;
    }
    final SubLObject leaf_node = first_ancestor( ancestor_vector, ancestor_index );
    if( NIL == trie_leaf_has_implicit_mark( trie, leaf_node, mark ) )
    {
      return NIL;
    }
    trie_node_mark_not_present_recursive( trie, ancestor_index, ancestor_vector, mark );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 56399L)
  public static SubLObject multi_trie_new_insert_mark(final SubLObject trie, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != trie_multi( trie ) )
    {
      thread.resetMultipleValues();
      final SubLObject ancestor_vector = trie_ancestor_path();
      final SubLObject ancestor_index = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject object_mark = Functions.funcall( trie_multi_key_func( trie ), v_object );
      SubLObject cdolist_list_var;
      final SubLObject trie_marks = cdolist_list_var = trie_multi_keys( trie );
      SubLObject mark = NIL;
      mark = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( mark.eql( object_mark ) )
        {
          multi_trie_new_insert_mark_present( trie, ancestor_index, ancestor_vector, mark );
        }
        else
        {
          multi_trie_new_insert_mark_not_present( trie, ancestor_index, ancestor_vector, mark );
        }
        cdolist_list_var = cdolist_list_var.rest();
        mark = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57051L)
  public static SubLObject multi_trie_new_insert_mark_present(final SubLObject trie, final SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark)
  {
    final SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked( ancestor_index, ancestor_vector, mark );
    if( NIL != some_ancestor_marked )
    {
      return trie_node_mark_present_recursive( trie, ancestor_index, ancestor_vector, mark );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 57472L)
  public static SubLObject multi_trie_new_insert_mark_not_present(final SubLObject trie, final SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark)
  {
    final SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked( ancestor_index, ancestor_vector, mark );
    if( NIL != some_ancestor_marked )
    {
      return NIL;
    }
    final SubLObject node = first_ancestor( ancestor_vector, ancestor_index );
    if( NIL != trie_node_subnodes( node ) )
    {
      return NIL;
    }
    trie_node_mark_not_present_recursive( trie, ancestor_index, ancestor_vector, mark );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 58128L)
  public static SubLObject multi_trie_remove_mark(final SubLObject trie, final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != trie_multi( trie ) )
    {
      thread.resetMultipleValues();
      final SubLObject ancestor_vector = trie_ancestor_path();
      final SubLObject ancestor_index = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject mark = Functions.funcall( trie_multi_key_func( trie ), v_object );
      final SubLObject node = first_ancestor( ancestor_vector, ancestor_index );
      assert NIL != trie_leaf_node_p( node ) : node;
      if( NIL != trie_leaf_has_implicit_mark( trie, node, mark ) )
      {
        multi_trie_remove_mark_not_present( trie, ancestor_index, ancestor_vector, mark );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 58741L)
  public static SubLObject multi_trie_remove_mark_not_present(final SubLObject trie, final SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark)
  {
    final SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked( ancestor_index, ancestor_vector, mark );
    if( NIL != some_ancestor_marked )
    {
      return NIL;
    }
    trie_node_mark_not_present_recursive( trie, ancestor_index, ancestor_vector, mark );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59131L)
  public static SubLObject multi_trie_remove_all_mark(final SubLObject trie)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != trie_multi( trie ) )
    {
      thread.resetMultipleValues();
      final SubLObject ancestor_vector = trie_ancestor_path();
      final SubLObject ancestor_index = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var;
      final SubLObject trie_marks = cdolist_list_var = trie_multi_keys( trie );
      SubLObject mark = NIL;
      mark = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        multi_trie_remove_all_mark_not_present( trie, ancestor_index, ancestor_vector, mark );
        cdolist_list_var = cdolist_list_var.rest();
        mark = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 59571L)
  public static SubLObject multi_trie_remove_all_mark_not_present(final SubLObject trie, final SubLObject ancestor_index, final SubLObject ancestor_vector, final SubLObject mark)
  {
    final SubLObject some_ancestor_marked = multi_trie_some_ancestor_marked( ancestor_index, ancestor_vector, mark );
    if( NIL != some_ancestor_marked )
    {
      return NIL;
    }
    trie_node_mark_not_present_recursive( trie, ancestor_index, ancestor_vector, mark );
    return NIL;
  }

  public static SubLObject declare_tries_file()
  {
    SubLFiles.declareFunction( me, "trie_print_function_trampoline", "TRIE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "trie_p", "TRIE-P", 1, 0, false );
    new $trie_p$UnaryFunction();
    SubLFiles.declareFunction( me, "trie_name", "TRIE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "trie_top_node", "TRIE-TOP-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "trie_unique", "TRIE-UNIQUE", 1, 0, false );
    SubLFiles.declareFunction( me, "trie_case_sensitive", "TRIE-CASE-SENSITIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "trie_entry_test_func", "TRIE-ENTRY-TEST-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "trie_multi", "TRIE-MULTI", 1, 0, false );
    SubLFiles.declareFunction( me, "trie_multi_keys", "TRIE-MULTI-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "trie_multi_key_func", "TRIE-MULTI-KEY-FUNC", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_trie_name", "_CSETF-TRIE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_trie_top_node", "_CSETF-TRIE-TOP-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_trie_unique", "_CSETF-TRIE-UNIQUE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_trie_case_sensitive", "_CSETF-TRIE-CASE-SENSITIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_trie_entry_test_func", "_CSETF-TRIE-ENTRY-TEST-FUNC", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_trie_multi", "_CSETF-TRIE-MULTI", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_trie_multi_keys", "_CSETF-TRIE-MULTI-KEYS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_trie_multi_key_func", "_CSETF-TRIE-MULTI-KEY-FUNC", 2, 0, false );
    SubLFiles.declareFunction( me, "make_trie", "MAKE-TRIE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_trie", "VISIT-DEFSTRUCT-TRIE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_trie_method", "VISIT-DEFSTRUCT-OBJECT-TRIE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_trie", "PRINT-TRIE", 3, 0, false );
    SubLFiles.declareFunction( me, "make_static_trie", "MAKE-STATIC-TRIE", 0, 0, false );
    SubLFiles.declareFunction( me, "init_trie", "INIT-TRIE", 1, 0, false );
    SubLFiles.declareFunction( me, "free_trie_p", "FREE-TRIE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "free_trie", "FREE-TRIE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_trie", "GET-TRIE", 0, 0, false );
    SubLFiles.declareFunction( me, "trie_node_key", "TRIE-NODE-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "trie_node_data", "TRIE-NODE-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "trie_node_subnodes", "TRIE-NODE-SUBNODES", 1, 0, false );
    SubLFiles.declareFunction( me, "trie_leaf_node_p", "TRIE-LEAF-NODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_trie_terminal_node", "NEW-TRIE-TERMINAL-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "new_trie_nonterminal_node", "NEW-TRIE-NONTERMINAL-NODE", 2, 0, false );
    SubLFiles.declareFunction( me, "trie_key_E", "TRIE-KEY-=", 3, 0, false );
    SubLFiles.declareFunction( me, "trie_key_L", "TRIE-KEY-<", 3, 0, false );
    SubLFiles.declareFunction( me, "trie_key_LE", "TRIE-KEY-<=", 3, 0, false );
    SubLFiles.declareFunction( me, "trie_key_G", "TRIE-KEY->", 3, 0, false );
    SubLFiles.declareFunction( me, "trie_key_GE", "TRIE-KEY->=", 3, 0, false );
    SubLFiles.declareFunction( me, "add_trie_subnode", "ADD-TRIE-SUBNODE", 3, 0, false );
    SubLFiles.declareFunction( me, "create_trie", "CREATE-TRIE", 1, 3, false );
    SubLFiles.declareFunction( me, "trie_from_strings", "TRIE-FROM-STRINGS", 2, 3, false );
    SubLFiles.declareFunction( me, "clear_trie", "CLEAR-TRIE", 1, 0, false );
    SubLFiles.declareFunction( me, "trie_emptyP", "TRIE-EMPTY?", 1, 0, false );
    SubLFiles.declareFunction( me, "trie_count", "TRIE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "trie_node_count", "TRIE-NODE-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "show_trie", "SHOW-TRIE", 1, 1, false );
    SubLFiles.declareFunction( me, "show_trie_node", "SHOW-TRIE-NODE", 4, 0, false );
    SubLFiles.declareFunction( me, "trie_insert", "TRIE-INSERT", 2, 3, false );
    SubLFiles.declareFunction( me, "trie_remove", "TRIE-REMOVE", 2, 3, false );
    SubLFiles.declareFunction( me, "trie_remove_all", "TRIE-REMOVE-ALL", 2, 2, false );
    SubLFiles.declareFunction( me, "trie_exact", "TRIE-EXACT", 2, 3, false );
    SubLFiles.declareFunction( me, "trie_prefix", "TRIE-PREFIX", 2, 4, false );
    SubLFiles.declareFunction( me, "trie_prefix_iterative", "TRIE-PREFIX-ITERATIVE", 3, 2, false );
    SubLFiles.declareFunction( me, "trie_prefix_recursive", "TRIE-PREFIX-RECURSIVE", 3, 2, false );
    SubLFiles.declareFunction( me, "trie_prefix_recursive_int", "TRIE-PREFIX-RECURSIVE-INT", 7, 0, false );
    SubLFiles.declareFunction( me, "all_trie_objects_under_node", "ALL-TRIE-OBJECTS-UNDER-NODE", 3, 0, false );
    SubLFiles.declareFunction( me, "all_trie_objects_in_leaf_node", "ALL-TRIE-OBJECTS-IN-LEAF-NODE", 3, 0, false );
    SubLFiles.declareFunction( me, "trie_search", "TRIE-SEARCH", 2, 3, false );
    SubLFiles.declareFunction( me, "trie_search_internal", "TRIE-SEARCH-INTERNAL", 9, 0, false );
    SubLFiles.declareFunction( me, "trie_match", "TRIE-MATCH", 6, 0, false );
    SubLFiles.declareFunction( me, "map_trie_data", "MAP-TRIE-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "map_trie_data_internal", "MAP-TRIE-DATA-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "map_trie_data_direction", "MAP-TRIE-DATA-DIRECTION", 3, 3, false );
    SubLFiles.declareFunction( me, "map_trie_data_forward", "MAP-TRIE-DATA-FORWARD", 8, 0, false );
    SubLFiles.declareFunction( me, "map_trie_data_backward", "MAP-TRIE-DATA-BACKWARD", 8, 0, false );
    SubLFiles.declareMacro( me, "do_objects_in_trie", "DO-OBJECTS-IN-TRIE" );
    SubLFiles.declareFunction( me, "new_trie_iterator", "NEW-TRIE-ITERATOR", 1, 1, false );
    SubLFiles.declareFunction( me, "new_trie_iterator_state", "NEW-TRIE-ITERATOR-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "trie_iterator_done", "TRIE-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "trie_iterator_done_node", "TRIE-ITERATOR-DONE-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "trie_iterator_done_queue", "TRIE-ITERATOR-DONE-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "trie_iterator_done_stack", "TRIE-ITERATOR-DONE-STACK", 1, 0, false );
    SubLFiles.declareFunction( me, "trie_iterator_next", "TRIE-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "trie_iterator_next_unique", "TRIE-ITERATOR-NEXT-UNIQUE", 4, 0, false );
    SubLFiles.declareFunction( me, "trie_iterator_next_non_unique", "TRIE-ITERATOR-NEXT-NON-UNIQUE", 5, 0, false );
    SubLFiles.declareFunction( me, "trie_iterator_finalize", "TRIE-ITERATOR-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "new_directed_trie_iterator", "NEW-DIRECTED-TRIE-ITERATOR", 2, 5, false );
    SubLFiles.declareFunction( me, "new_directed_trie_iterator_state", "NEW-DIRECTED-TRIE-ITERATOR-STATE", 7, 0, false );
    SubLFiles.declareFunction( me, "directed_trie_iterator_generate_stack", "DIRECTED-TRIE-ITERATOR-GENERATE-STACK", 7, 0, false );
    SubLFiles.declareFunction( me, "forward_trie_iterator_generate_stack_recursive", "FORWARD-TRIE-ITERATOR-GENERATE-STACK-RECURSIVE", 5, 0, false );
    SubLFiles.declareFunction( me, "backward_trie_iterator_generate_stack_recursive", "BACKWARD-TRIE-ITERATOR-GENERATE-STACK-RECURSIVE", 5, 0, false );
    SubLFiles.declareFunction( me, "new_trie_ancestor_tracking_vector", "NEW-TRIE-ANCESTOR-TRACKING-VECTOR", 0, 0, false );
    SubLFiles.declareFunction( me, "get_trie_ancestor_tracking_vector", "GET-TRIE-ANCESTOR-TRACKING-VECTOR", 0, 0, false );
    SubLFiles.declareFunction( me, "free_trie_ancestor_tracking_vector", "FREE-TRIE-ANCESTOR-TRACKING-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_trie_ancestor_tracking", "INITIALIZE-TRIE-ANCESTOR-TRACKING", 1, 0, false );
    SubLFiles.declareFunction( me, "finish_trie_ancestor_tracking", "FINISH-TRIE-ANCESTOR-TRACKING", 0, 0, false );
    SubLFiles.declareFunction( me, "trie_ancestor_tracking_descend", "TRIE-ANCESTOR-TRACKING-DESCEND", 1, 0, false );
    SubLFiles.declareFunction( me, "trie_ancestor_tracking_ascend", "TRIE-ANCESTOR-TRACKING-ASCEND", 0, 0, false );
    SubLFiles.declareFunction( me, "trie_ancestor_path", "TRIE-ANCESTOR-PATH", 0, 0, false );
    SubLFiles.declareFunction( me, "no_more_ancestors", "NO-MORE-ANCESTORS", 1, 0, false );
    SubLFiles.declareFunction( me, "first_ancestor", "FIRST-ANCESTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "parent_ancestor", "PARENT-ANCESTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "next_generation", "NEXT-GENERATION", 1, 0, false );
    SubLFiles.declareFunction( me, "multi_trie_some_ancestor_marked", "MULTI-TRIE-SOME-ANCESTOR-MARKED", 3, 0, false );
    SubLFiles.declareFunction( me, "create_multi_trie", "CREATE-MULTI-TRIE", 2, 3, false );
    SubLFiles.declareFunction( me, "multi_trie_p", "MULTI-TRIE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_multi_trie", "CLEAR-MULTI-TRIE", 1, 1, false );
    SubLFiles.declareFunction( me, "add_multi_trie_key", "ADD-MULTI-TRIE-KEY", 2, 0, false );
    SubLFiles.declareFunction( me, "rem_multi_trie_key", "REM-MULTI-TRIE-KEY", 2, 0, false );
    SubLFiles.declareFunction( me, "multi_trie_emptyP", "MULTI-TRIE-EMPTY?", 1, 0, false );
    SubLFiles.declareFunction( me, "multi_trie_count", "MULTI-TRIE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "show_multi_trie", "SHOW-MULTI-TRIE", 1, 1, false );
    SubLFiles.declareFunction( me, "multi_trie_insert", "MULTI-TRIE-INSERT", 2, 3, false );
    SubLFiles.declareFunction( me, "multi_trie_remove", "MULTI-TRIE-REMOVE", 2, 3, false );
    SubLFiles.declareFunction( me, "multi_trie_remove_all", "MULTI-TRIE-REMOVE-ALL", 2, 2, false );
    SubLFiles.declareFunction( me, "multi_trie_exact", "MULTI-TRIE-EXACT", 2, 4, false );
    SubLFiles.declareFunction( me, "multi_trie_prefix", "MULTI-TRIE-PREFIX", 2, 5, false );
    SubLFiles.declareFunction( me, "multi_trie_search", "MULTI-TRIE-SEARCH", 2, 4, false );
    SubLFiles.declareFunction( me, "map_multi_trie_data", "MAP-MULTI-TRIE-DATA", 2, 1, false );
    SubLFiles.declareFunction( me, "map_multi_trie_data_mark", "MAP-MULTI-TRIE-DATA-MARK", 3, 0, false );
    SubLFiles.declareFunction( me, "map_multi_trie_data_direction", "MAP-MULTI-TRIE-DATA-DIRECTION", 3, 4, false );
    SubLFiles.declareFunction( me, "map_multi_trie_data_direction_mark", "MAP-MULTI-TRIE-DATA-DIRECTION-MARK", 4, 3, false );
    SubLFiles.declareFunction( me, "trie_relevant_ancestor_pathP", "TRIE-RELEVANT-ANCESTOR-PATH?", 1, 0, false );
    SubLFiles.declareFunction( me, "trie_relevant_object", "TRIE-RELEVANT-OBJECT", 2, 0, false );
    SubLFiles.declareFunction( me, "trie_relevant_objects", "TRIE-RELEVANT-OBJECTS", 2, 0, false );
    SubLFiles.declareFunction( me, "add_trie_mark", "ADD-TRIE-MARK", 2, 0, false );
    SubLFiles.declareFunction( me, "rem_trie_mark", "REM-TRIE-MARK", 2, 0, false );
    SubLFiles.declareFunction( me, "trie_node_marks", "TRIE-NODE-MARKS", 1, 0, false );
    SubLFiles.declareFunction( me, "trie_node_has_mark", "TRIE-NODE-HAS-MARK", 2, 0, false );
    SubLFiles.declareFunction( me, "set_trie_node_marks", "SET-TRIE-NODE-MARKS", 2, 0, false );
    SubLFiles.declareFunction( me, "trie_leaf_has_implicit_mark", "TRIE-LEAF-HAS-IMPLICIT-MARK", 3, 0, false );
    SubLFiles.declareFunction( me, "add_trie_node_mark", "ADD-TRIE-NODE-MARK", 2, 0, false );
    SubLFiles.declareFunction( me, "rem_trie_node_mark", "REM-TRIE-NODE-MARK", 2, 0, false );
    SubLFiles.declareFunction( me, "trie_node_mark_present_recursive", "TRIE-NODE-MARK-PRESENT-RECURSIVE", 4, 0, false );
    SubLFiles.declareFunction( me, "trie_node_mark_not_present_recursive", "TRIE-NODE-MARK-NOT-PRESENT-RECURSIVE", 4, 0, false );
    SubLFiles.declareFunction( me, "multi_trie_existing_insert_mark", "MULTI-TRIE-EXISTING-INSERT-MARK", 2, 0, false );
    SubLFiles.declareFunction( me, "multi_trie_existing_insert_mark_present", "MULTI-TRIE-EXISTING-INSERT-MARK-PRESENT", 4, 0, false );
    SubLFiles.declareFunction( me, "multi_trie_existing_insert_mark_not_present", "MULTI-TRIE-EXISTING-INSERT-MARK-NOT-PRESENT", 4, 0, false );
    SubLFiles.declareFunction( me, "multi_trie_new_insert_mark", "MULTI-TRIE-NEW-INSERT-MARK", 2, 0, false );
    SubLFiles.declareFunction( me, "multi_trie_new_insert_mark_present", "MULTI-TRIE-NEW-INSERT-MARK-PRESENT", 4, 0, false );
    SubLFiles.declareFunction( me, "multi_trie_new_insert_mark_not_present", "MULTI-TRIE-NEW-INSERT-MARK-NOT-PRESENT", 4, 0, false );
    SubLFiles.declareFunction( me, "multi_trie_remove_mark", "MULTI-TRIE-REMOVE-MARK", 2, 0, false );
    SubLFiles.declareFunction( me, "multi_trie_remove_mark_not_present", "MULTI-TRIE-REMOVE-MARK-NOT-PRESENT", 4, 0, false );
    SubLFiles.declareFunction( me, "multi_trie_remove_all_mark", "MULTI-TRIE-REMOVE-ALL-MARK", 1, 0, false );
    SubLFiles.declareFunction( me, "multi_trie_remove_all_mark_not_present", "MULTI-TRIE-REMOVE-ALL-MARK-NOT-PRESENT", 4, 0, false );
    return NIL;
  }

  public static SubLObject init_tries_file()
  {
    $trie_objects$ = SubLFiles.defparameter( "*TRIE-OBJECTS*", NIL );
    $trie_relevant_marks$ = SubLFiles.defparameter( "*TRIE-RELEVANT-MARKS*", $kw0$ALL );
    $trie_ancestor_tracking$ = SubLFiles.defparameter( "*TRIE-ANCESTOR-TRACKING*", NIL );
    $dtp_trie$ = SubLFiles.defconstant( "*DTP-TRIE*", $sym1$TRIE );
    $trie_free_list$ = SubLFiles.deflexical( "*TRIE-FREE-LIST*", NIL );
    $trie_free_lock$ = SubLFiles.deflexical( "*TRIE-FREE-LOCK*", Locks.make_lock( $str47$TRIE_resource_lock ) );
    $trie_maximum_search_size$ = SubLFiles.defparameter( "*TRIE-MAXIMUM-SEARCH-SIZE*", $int57$1000 );
    $trie_ancestor_tracking_resource$ = SubLFiles.defparameter( "*TRIE-ANCESTOR-TRACKING-RESOURCE*", NIL );
    $trie_ancestor_tracking_lock$ = SubLFiles.defparameter( "*TRIE-ANCESTOR-TRACKING-LOCK*", Locks.make_lock( $str72$Ancestor_Tracking_Resource ) );
    $trie_ancestor_tracking_vector_size$ = SubLFiles.defparameter( "*TRIE-ANCESTOR-TRACKING-VECTOR-SIZE*", $int73$100 );
    $trie_ancestor_vector$ = SubLFiles.defparameter( "*TRIE-ANCESTOR-VECTOR*", NIL );
    $trie_ancestor_next$ = SubLFiles.defparameter( "*TRIE-ANCESTOR-NEXT*", NIL );
    return NIL;
  }

  public static SubLObject setup_tries_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_trie$.getGlobalValue(), Symbols.symbol_function( $sym8$TRIE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list9 );
    Structures.def_csetf( $sym10$TRIE_NAME, $sym11$_CSETF_TRIE_NAME );
    Structures.def_csetf( $sym12$TRIE_TOP_NODE, $sym13$_CSETF_TRIE_TOP_NODE );
    Structures.def_csetf( $sym14$TRIE_UNIQUE, $sym15$_CSETF_TRIE_UNIQUE );
    Structures.def_csetf( $sym16$TRIE_CASE_SENSITIVE, $sym17$_CSETF_TRIE_CASE_SENSITIVE );
    Structures.def_csetf( $sym18$TRIE_ENTRY_TEST_FUNC, $sym19$_CSETF_TRIE_ENTRY_TEST_FUNC );
    Structures.def_csetf( $sym20$TRIE_MULTI, $sym21$_CSETF_TRIE_MULTI );
    Structures.def_csetf( $sym22$TRIE_MULTI_KEYS, $sym23$_CSETF_TRIE_MULTI_KEYS );
    Structures.def_csetf( $sym24$TRIE_MULTI_KEY_FUNC, $sym25$_CSETF_TRIE_MULTI_KEY_FUNC );
    Equality.identity( $sym1$TRIE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_trie$.getGlobalValue(), Symbols.symbol_function( $sym39$VISIT_DEFSTRUCT_OBJECT_TRIE_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_tries_file();
  }

  @Override
  public void initializeVariables()
  {
    init_tries_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_tries_file();
  }
  static
  {
    me = new tries();
    $trie_objects$ = null;
    $trie_relevant_marks$ = null;
    $trie_ancestor_tracking$ = null;
    $dtp_trie$ = null;
    $trie_free_list$ = null;
    $trie_free_lock$ = null;
    $trie_maximum_search_size$ = null;
    $trie_ancestor_tracking_resource$ = null;
    $trie_ancestor_tracking_lock$ = null;
    $trie_ancestor_tracking_vector_size$ = null;
    $trie_ancestor_vector$ = null;
    $trie_ancestor_next$ = null;
    $kw0$ALL = makeKeyword( "ALL" );
    $sym1$TRIE = makeSymbol( "TRIE" );
    $sym2$TRIE_P = makeSymbol( "TRIE-P" );
    $list3 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "TOP-NODE" ), makeSymbol( "UNIQUE" ), makeSymbol( "CASE-SENSITIVE" ), makeSymbol( "ENTRY-TEST-FUNC" ), makeSymbol( "MULTI" ), makeSymbol( "MULTI-KEYS" ),
        makeSymbol( "MULTI-KEY-FUNC" ) );
    $list4 = ConsesLow.list( makeKeyword( "NAME" ), makeKeyword( "TOP-NODE" ), makeKeyword( "UNIQUE" ), makeKeyword( "CASE-SENSITIVE" ), makeKeyword( "ENTRY-TEST-FUNC" ), makeKeyword( "MULTI" ), makeKeyword(
        "MULTI-KEYS" ), makeKeyword( "MULTI-KEY-FUNC" ) );
    $list5 = ConsesLow.list( makeSymbol( "TRIE-NAME" ), makeSymbol( "TRIE-TOP-NODE" ), makeSymbol( "TRIE-UNIQUE" ), makeSymbol( "TRIE-CASE-SENSITIVE" ), makeSymbol( "TRIE-ENTRY-TEST-FUNC" ), makeSymbol( "TRIE-MULTI" ),
        makeSymbol( "TRIE-MULTI-KEYS" ), makeSymbol( "TRIE-MULTI-KEY-FUNC" ) );
    $list6 = ConsesLow.list( makeSymbol( "_CSETF-TRIE-NAME" ), makeSymbol( "_CSETF-TRIE-TOP-NODE" ), makeSymbol( "_CSETF-TRIE-UNIQUE" ), makeSymbol( "_CSETF-TRIE-CASE-SENSITIVE" ), makeSymbol(
        "_CSETF-TRIE-ENTRY-TEST-FUNC" ), makeSymbol( "_CSETF-TRIE-MULTI" ), makeSymbol( "_CSETF-TRIE-MULTI-KEYS" ), makeSymbol( "_CSETF-TRIE-MULTI-KEY-FUNC" ) );
    $sym7$PRINT_TRIE = makeSymbol( "PRINT-TRIE" );
    $sym8$TRIE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "TRIE-PRINT-FUNCTION-TRAMPOLINE" );
    $list9 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "TRIE-P" ) );
    $sym10$TRIE_NAME = makeSymbol( "TRIE-NAME" );
    $sym11$_CSETF_TRIE_NAME = makeSymbol( "_CSETF-TRIE-NAME" );
    $sym12$TRIE_TOP_NODE = makeSymbol( "TRIE-TOP-NODE" );
    $sym13$_CSETF_TRIE_TOP_NODE = makeSymbol( "_CSETF-TRIE-TOP-NODE" );
    $sym14$TRIE_UNIQUE = makeSymbol( "TRIE-UNIQUE" );
    $sym15$_CSETF_TRIE_UNIQUE = makeSymbol( "_CSETF-TRIE-UNIQUE" );
    $sym16$TRIE_CASE_SENSITIVE = makeSymbol( "TRIE-CASE-SENSITIVE" );
    $sym17$_CSETF_TRIE_CASE_SENSITIVE = makeSymbol( "_CSETF-TRIE-CASE-SENSITIVE" );
    $sym18$TRIE_ENTRY_TEST_FUNC = makeSymbol( "TRIE-ENTRY-TEST-FUNC" );
    $sym19$_CSETF_TRIE_ENTRY_TEST_FUNC = makeSymbol( "_CSETF-TRIE-ENTRY-TEST-FUNC" );
    $sym20$TRIE_MULTI = makeSymbol( "TRIE-MULTI" );
    $sym21$_CSETF_TRIE_MULTI = makeSymbol( "_CSETF-TRIE-MULTI" );
    $sym22$TRIE_MULTI_KEYS = makeSymbol( "TRIE-MULTI-KEYS" );
    $sym23$_CSETF_TRIE_MULTI_KEYS = makeSymbol( "_CSETF-TRIE-MULTI-KEYS" );
    $sym24$TRIE_MULTI_KEY_FUNC = makeSymbol( "TRIE-MULTI-KEY-FUNC" );
    $sym25$_CSETF_TRIE_MULTI_KEY_FUNC = makeSymbol( "_CSETF-TRIE-MULTI-KEY-FUNC" );
    $kw26$NAME = makeKeyword( "NAME" );
    $kw27$TOP_NODE = makeKeyword( "TOP-NODE" );
    $kw28$UNIQUE = makeKeyword( "UNIQUE" );
    $kw29$CASE_SENSITIVE = makeKeyword( "CASE-SENSITIVE" );
    $kw30$ENTRY_TEST_FUNC = makeKeyword( "ENTRY-TEST-FUNC" );
    $kw31$MULTI = makeKeyword( "MULTI" );
    $kw32$MULTI_KEYS = makeKeyword( "MULTI-KEYS" );
    $kw33$MULTI_KEY_FUNC = makeKeyword( "MULTI-KEY-FUNC" );
    $str34$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw35$BEGIN = makeKeyword( "BEGIN" );
    $sym36$MAKE_TRIE = makeSymbol( "MAKE-TRIE" );
    $kw37$SLOT = makeKeyword( "SLOT" );
    $kw38$END = makeKeyword( "END" );
    $sym39$VISIT_DEFSTRUCT_OBJECT_TRIE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-TRIE-METHOD" );
    $str40$__TRIE = makeString( "#<TRIE" );
    $str41$__A = makeString( " ~A" );
    $str42$_UNIQUE = makeString( " UNIQUE" );
    $str43$_SENSITIVE = makeString( " SENSITIVE" );
    $str44$_INSENSITIVE = makeString( " INSENSITIVE" );
    $str45$__S = makeString( " ~S" );
    $str46$_ = makeString( ">" );
    $str47$TRIE_resource_lock = makeString( "TRIE resource lock" );
    $kw48$FREE = makeKeyword( "FREE" );
    $kw49$TOP = makeKeyword( "TOP" );
    $str50$_m___S = makeString( "<m> ~S" );
    $str51$_____S = makeString( " :  ~S" );
    $sym52$STRINGP = makeSymbol( "STRINGP" );
    $str53$There_is_already_an_object__S_not = makeString( "There is already an object ~S not ~S to ~S in the trie!" );
    $str54$Remove_it_anyway = makeString( "Remove it anyway" );
    $str55$The_object_found_in_trie_for__S_i = makeString( "The object found in trie for ~S is ~S, not ~S" );
    $str56$TRIE__S_does_not_have_unique_entr = makeString( "TRIE ~S does not have unique entries" );
    $int57$1000 = makeInteger( 1000 );
    $str58$_S_will_result_in_a_search_that_i = makeString( "~S will result in a search that is larger than the maximum search size of ~S" );
    $kw59$MAPPING_DONE = makeKeyword( "MAPPING-DONE" );
    $list60 = ConsesLow.list( ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "TRIE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ), ConsesLow.list( makeSymbol( "FORWARD" ), T ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $list61 = ConsesLow.list( makeKeyword( "DONE" ), makeKeyword( "FORWARD" ) );
    $kw62$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw63$DONE = makeKeyword( "DONE" );
    $kw64$FORWARD = makeKeyword( "FORWARD" );
    $sym65$ITERATOR = makeUninternedSymbol( "ITERATOR" );
    $sym66$CLET = makeSymbol( "CLET" );
    $sym67$NEW_TRIE_ITERATOR = makeSymbol( "NEW-TRIE-ITERATOR" );
    $sym68$DO_ITERATOR = makeSymbol( "DO-ITERATOR" );
    $sym69$TRIE_ITERATOR_DONE = makeSymbol( "TRIE-ITERATOR-DONE" );
    $sym70$TRIE_ITERATOR_NEXT = makeSymbol( "TRIE-ITERATOR-NEXT" );
    $sym71$TRIE_ITERATOR_FINALIZE = makeSymbol( "TRIE-ITERATOR-FINALIZE" );
    $str72$Ancestor_Tracking_Resource = makeString( "Ancestor Tracking Resource" );
    $int73$100 = makeInteger( 100 );
    $kw74$ERROR = makeKeyword( "ERROR" );
    $sym75$MULTI_TRIE_P = makeSymbol( "MULTI-TRIE-P" );
    $list76 = ConsesLow.cons( makeSymbol( "KEY" ), makeSymbol( "SUBTRIE" ) );
    $str77$_A__A = makeString( "~A:~A" );
    $sym78$CAR = makeSymbol( "CAR" );
    $list79 = ConsesLow.cons( makeSymbol( "MARK" ), makeSymbol( "SUBTRIE" ) );
    $str80$___S_sub_tries = makeString( "~%~S sub-tries" );
    $str81$____Sub_Trie__S = makeString( "~%~%Sub-Trie ~S" );
    $sym82$TRIE_LEAF_NODE_P = makeSymbol( "TRIE-LEAF-NODE-P" );
  }

  public static final class $trie_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $top_node;
    public SubLObject $unique;
    public SubLObject $case_sensitive;
    public SubLObject $entry_test_func;
    public SubLObject $multi;
    public SubLObject $multi_keys;
    public SubLObject $multi_key_func;
    private static final SubLStructDeclNative structDecl;

    public $trie_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$top_node = CommonSymbols.NIL;
      this.$unique = CommonSymbols.NIL;
      this.$case_sensitive = CommonSymbols.NIL;
      this.$entry_test_func = CommonSymbols.NIL;
      this.$multi = CommonSymbols.NIL;
      this.$multi_keys = CommonSymbols.NIL;
      this.$multi_key_func = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $trie_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$top_node;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$unique;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$case_sensitive;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$entry_test_func;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$multi;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$multi_keys;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$multi_key_func;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$top_node = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$unique = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$case_sensitive = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$entry_test_func = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$multi = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$multi_keys = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$multi_key_func = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $trie_native.class, $sym1$TRIE, $sym2$TRIE_P, $list3, $list4, new String[] { "$name", "$top_node", "$unique", "$case_sensitive", "$entry_test_func", "$multi",
        "$multi_keys", "$multi_key_func"
      }, $list5, $list6, $sym7$PRINT_TRIE );
    }
  }

  public static final class $trie_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $trie_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "TRIE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return trie_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 658 ms
 * 
 */