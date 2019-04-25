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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cache
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cache";
  public static final String myFingerPrint = "4360149d4e45bdd12bec7882df8970799b220ca03c6e1872e78ca529f7575799";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3645L)
  public static SubLSymbol $dtp_cache$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4058L)
  public static SubLSymbol $dtp_cache_entry$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4308L)
  public static SubLSymbol $print_cache_elementsP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5358L)
  private static SubLSymbol $cache_entries_preallocateP$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19225L)
  private static SubLSymbol $cfasl_opcode_cache$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26147L)
  public static SubLSymbol $print_cache_valuesP$;
  private static final SubLSymbol $sym0$CACHE;
  private static final SubLSymbol $sym1$CACHE_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$CACHE_PRINT;
  private static final SubLSymbol $sym7$CACHE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$CACHE_CAPACITY;
  private static final SubLSymbol $sym10$_CSETF_CACHE_CAPACITY;
  private static final SubLSymbol $sym11$CACHE_MAP;
  private static final SubLSymbol $sym12$_CSETF_CACHE_MAP;
  private static final SubLSymbol $sym13$CACHE_HEAD_ENTRY;
  private static final SubLSymbol $sym14$_CSETF_CACHE_HEAD_ENTRY;
  private static final SubLSymbol $kw15$CAPACITY;
  private static final SubLSymbol $kw16$MAP;
  private static final SubLSymbol $kw17$HEAD_ENTRY;
  private static final SubLString $str18$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw19$BEGIN;
  private static final SubLSymbol $sym20$MAKE_CACHE;
  private static final SubLSymbol $kw21$SLOT;
  private static final SubLSymbol $kw22$END;
  private static final SubLSymbol $sym23$VISIT_DEFSTRUCT_OBJECT_CACHE_METHOD;
  private static final SubLSymbol $sym24$CACHE_ENTRY;
  private static final SubLSymbol $sym25$CACHE_ENTRY_P;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$CACHE_ENTRY_PRINT;
  private static final SubLSymbol $sym31$CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$CACHE_ENTRY_NEWER;
  private static final SubLSymbol $sym34$_CSETF_CACHE_ENTRY_NEWER;
  private static final SubLSymbol $sym35$CACHE_ENTRY_KEY;
  private static final SubLSymbol $sym36$_CSETF_CACHE_ENTRY_KEY;
  private static final SubLSymbol $sym37$CACHE_ENTRY_VALUE;
  private static final SubLSymbol $sym38$_CSETF_CACHE_ENTRY_VALUE;
  private static final SubLSymbol $sym39$CACHE_ENTRY_OLDER;
  private static final SubLSymbol $sym40$_CSETF_CACHE_ENTRY_OLDER;
  private static final SubLSymbol $kw41$NEWER;
  private static final SubLSymbol $kw42$KEY;
  private static final SubLSymbol $kw43$VALUE;
  private static final SubLSymbol $kw44$OLDER;
  private static final SubLSymbol $sym45$MAKE_CACHE_ENTRY;
  private static final SubLSymbol $sym46$VISIT_DEFSTRUCT_OBJECT_CACHE_ENTRY_METHOD;
  private static final SubLString $str47$__CACHE_;
  private static final SubLString $str48$_;
  private static final SubLString $str49$_;
  private static final SubLString $str50$__;
  private static final SubLString $str51$___;
  private static final SubLString $str52$_;
  private static final SubLString $str53$_;
  private static final SubLSymbol $sym54$POSITIVE_INTEGER_P;
  private static final SubLSymbol $sym55$VALID_HASH_TEST_P;
  private static final SubLSymbol $kw56$RESOURCED;
  private static final SubLSymbol $kw57$UNKNOWN;
  private static final SubLList $list58;
  private static final SubLList $list59;
  private static final SubLSymbol $kw60$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw61$ORDER;
  private static final SubLSymbol $kw62$NEWEST;
  private static final SubLSymbol $sym63$CACHE_VAR;
  private static final SubLSymbol $sym64$ORDER_VAR;
  private static final SubLSymbol $sym65$ENTRY;
  private static final SubLSymbol $sym66$CLET;
  private static final SubLSymbol $sym67$DO_CACHE_FIRST;
  private static final SubLSymbol $sym68$WHILE;
  private static final SubLSymbol $sym69$CNOT;
  private static final SubLSymbol $sym70$DO_CACHE_DONE_;
  private static final SubLSymbol $sym71$CSETQ;
  private static final SubLSymbol $sym72$DO_CACHE_KEY;
  private static final SubLSymbol $sym73$DO_CACHE_VALUE;
  private static final SubLSymbol $sym74$DO_CACHE_NEXT;
  private static final SubLSymbol $kw75$OLDEST;
  private static final SubLSymbol $sym76$DO_CACHE;
  private static final SubLString $str77$_S_was_not_either__NEWEST_or__OLD;
  private static final SubLSymbol $sym78$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym79$CACHE_ITERATOR_DONE;
  private static final SubLSymbol $sym80$CACHE_ITERATOR_NEXT;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$CACHE_CONTENT_ITERATOR_DONE;
  private static final SubLSymbol $sym83$CACHE_CONTENT_ITERATOR_NEXT;
  private static final SubLInteger $int84$63;
  private static final SubLSymbol $sym85$CFASL_INPUT_CACHE;
  private static final SubLSymbol $sym86$CFASL_OUTPUT_OBJECT_CACHE_METHOD;
  private static final SubLString $str87$____;
  private static final SubLInteger $int88$100;
  private static final SubLSymbol $sym89$_;
  private static final SubLSymbol $sym90$CDR;
  private static final SubLFloat $float91$0_5;
  private static final SubLString $str92$Content_iterator__A_was_exhausted;
  private static final SubLString $str93$The_content_iterator_at_item__A_s;
  private static final SubLString $str94$The_content_iterator_at_item__A_s;
  private static final SubLString $str95$The_content_iterator__A_is_not_ex;
  private static final SubLString $str96$The_two_iterators_do_not_seem_to_;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3645L)
  public static SubLObject cache_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    cache_print( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3645L)
  public static SubLObject cache_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $cache_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3645L)
  public static SubLObject cache_capacity(final SubLObject v_object)
  {
    assert NIL != cache_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3645L)
  public static SubLObject cache_map(final SubLObject v_object)
  {
    assert NIL != cache_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3645L)
  public static SubLObject cache_head_entry(final SubLObject v_object)
  {
    assert NIL != cache_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3645L)
  public static SubLObject _csetf_cache_capacity(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cache_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3645L)
  public static SubLObject _csetf_cache_map(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cache_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3645L)
  public static SubLObject _csetf_cache_head_entry(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cache_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3645L)
  public static SubLObject make_cache(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $cache_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw15$CAPACITY ) )
      {
        _csetf_cache_capacity( v_new, current_value );
      }
      else if( pcase_var.eql( $kw16$MAP ) )
      {
        _csetf_cache_map( v_new, current_value );
      }
      else if( pcase_var.eql( $kw17$HEAD_ENTRY ) )
      {
        _csetf_cache_head_entry( v_new, current_value );
      }
      else
      {
        Errors.error( $str18$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3645L)
  public static SubLObject visit_defstruct_cache(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw19$BEGIN, $sym20$MAKE_CACHE, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw15$CAPACITY, cache_capacity( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw16$MAP, cache_map( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw17$HEAD_ENTRY, cache_head_entry( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$END, $sym20$MAKE_CACHE, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3645L)
  public static SubLObject visit_defstruct_object_cache_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_cache( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4058L)
  public static SubLObject cache_entry_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    cache_entry_print( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4058L)
  public static SubLObject cache_entry_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $cache_entry_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4058L)
  public static SubLObject cache_entry_newer(final SubLObject v_object)
  {
    assert NIL != cache_entry_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4058L)
  public static SubLObject cache_entry_key(final SubLObject v_object)
  {
    assert NIL != cache_entry_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4058L)
  public static SubLObject cache_entry_value(final SubLObject v_object)
  {
    assert NIL != cache_entry_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4058L)
  public static SubLObject cache_entry_older(final SubLObject v_object)
  {
    assert NIL != cache_entry_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4058L)
  public static SubLObject _csetf_cache_entry_newer(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cache_entry_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4058L)
  public static SubLObject _csetf_cache_entry_key(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cache_entry_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4058L)
  public static SubLObject _csetf_cache_entry_value(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cache_entry_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4058L)
  public static SubLObject _csetf_cache_entry_older(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cache_entry_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4058L)
  public static SubLObject make_cache_entry(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $cache_entry_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw41$NEWER ) )
      {
        _csetf_cache_entry_newer( v_new, current_value );
      }
      else if( pcase_var.eql( $kw42$KEY ) )
      {
        _csetf_cache_entry_key( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$VALUE ) )
      {
        _csetf_cache_entry_value( v_new, current_value );
      }
      else if( pcase_var.eql( $kw44$OLDER ) )
      {
        _csetf_cache_entry_older( v_new, current_value );
      }
      else
      {
        Errors.error( $str18$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4058L)
  public static SubLObject visit_defstruct_cache_entry(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw19$BEGIN, $sym45$MAKE_CACHE_ENTRY, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw41$NEWER, cache_entry_newer( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw42$KEY, cache_entry_key( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw43$VALUE, cache_entry_value( obj ) );
    Functions.funcall( visitor_fn, obj, $kw21$SLOT, $kw44$OLDER, cache_entry_older( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$END, $sym45$MAKE_CACHE_ENTRY, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4058L)
  public static SubLObject visit_defstruct_object_cache_entry_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_cache_entry( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4482L)
  public static SubLObject cache_print(final SubLObject v_cache, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    streams_high.write_string( $str47$__CACHE_, stream, UNPROVIDED, UNPROVIDED );
    print_high.princ( Hashtables.hash_table_test( cache_map( v_cache ) ), stream );
    streams_high.write_string( $str48$_, stream, UNPROVIDED, UNPROVIDED );
    print_high.princ( cache_size( v_cache ), stream );
    if( NIL != $print_cache_elementsP$.getDynamicValue( thread ) )
    {
      streams_high.write_string( $str49$_, stream, UNPROVIDED, UNPROVIDED );
      SubLObject i = ZERO_INTEGER;
      final SubLObject count = cache_size( v_cache );
      SubLObject entry = cache_head_entry( v_cache );
      while ( i.numL( Numbers.min( NINE_INTEGER, Numbers.subtract( count, ONE_INTEGER ) ) ))
      {
        entry = cache_entry_newer( entry );
        print_high.princ( entry, stream );
        print_high.princ( $str50$__, stream );
        i = Numbers.add( i, ONE_INTEGER );
      }
      if( count.numG( ZERO_INTEGER ) )
      {
        print_high.princ( cache_entry_newer( entry ), stream );
      }
      if( count.numG( TEN_INTEGER ) )
      {
        print_high.princ( $str51$___, UNPROVIDED );
      }
      streams_high.write_string( $str52$_, stream, UNPROVIDED, UNPROVIDED );
    }
    streams_high.write_string( $str53$_, stream, UNPROVIDED, UNPROVIDED );
    return v_cache;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5483L)
  public static SubLObject new_cache(final SubLObject capacity, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.positive_integer_p( capacity ) : capacity;
    assert NIL != hash_table_utilities.valid_hash_test_p( test ) : test;
    final SubLObject v_cache = make_cache( UNPROVIDED );
    final SubLObject head_entry = make_cache_entry( UNPROVIDED );
    _csetf_cache_capacity( v_cache, capacity );
    _csetf_cache_map( v_cache, Hashtables.make_hash_table( ZERO_INTEGER, test, UNPROVIDED ) );
    _csetf_cache_entry_newer( head_entry, head_entry );
    _csetf_cache_entry_older( head_entry, head_entry );
    _csetf_cache_head_entry( v_cache, head_entry );
    if( NIL != $cache_entries_preallocateP$.getDynamicValue( thread ) )
    {
      set_cache_free_list( v_cache, $kw56$RESOURCED );
      SubLObject i;
      for( i = NIL, i = ZERO_INTEGER; i.numL( capacity ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        resource_cache_entry( v_cache, make_cache_entry( UNPROVIDED ) );
      }
    }
    return v_cache;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6417L)
  public static SubLObject new_preallocated_cache(final SubLObject capacity, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_cache = NIL;
    final SubLObject _prev_bind_0 = $cache_entries_preallocateP$.currentBinding( thread );
    try
    {
      $cache_entries_preallocateP$.bind( T, thread );
      v_cache = new_cache( capacity, test );
    }
    finally
    {
      $cache_entries_preallocateP$.rebind( _prev_bind_0, thread );
    }
    return v_cache;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6862L)
  public static SubLObject cache_full_p(final SubLObject v_cache)
  {
    assert NIL != cache_p( v_cache ) : v_cache;
    return Numbers.numGE( cache_size( v_cache ), cache_capacity( v_cache ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7159L)
  public static SubLObject cache_empty_p(final SubLObject v_cache)
  {
    assert NIL != cache_p( v_cache ) : v_cache;
    return Equality.eq( cache_newest( v_cache ), cache_head_entry( v_cache ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7463L)
  public static SubLObject cache_get(final SubLObject v_cache, final SubLObject key)
  {
    assert NIL != cache_p( v_cache ) : v_cache;
    return cache_get_int( v_cache, key, NIL, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7912L)
  public static SubLObject cache_get_without_values(final SubLObject v_cache, final SubLObject key, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = NIL;
    }
    assert NIL != cache_p( v_cache ) : v_cache;
    return cache_get_int( v_cache, key, v_default, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8365L)
  public static SubLObject cache_get_int(final SubLObject v_cache, final SubLObject key, final SubLObject v_default, final SubLObject return_entry_p)
  {
    final SubLObject entry = Hashtables.gethash_without_values( key, cache_map( v_cache ), UNPROVIDED );
    if( NIL == entry )
    {
      if( NIL != return_entry_p )
      {
        return subl_promotions.values2( NIL, NIL );
      }
      return v_default;
    }
    else
    {
      cache_queue_requeue( v_cache, entry );
      if( NIL != return_entry_p )
      {
        return subl_promotions.values2( cache_entry_value( entry ), T );
      }
      return cache_entry_value( entry );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8734L)
  public static SubLObject cache_contains_key_p(final SubLObject v_cache, final SubLObject key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject value = Hashtables.gethash( key, cache_map( v_cache ), UNPROVIDED );
    final SubLObject found_p = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return found_p;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9252L)
  public static SubLObject cache_set(final SubLObject v_cache, final SubLObject key, final SubLObject value)
  {
    assert NIL != cache_p( v_cache ) : v_cache;
    return cache_set_int( v_cache, key, value, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9773L)
  public static SubLObject cache_set_without_values(final SubLObject v_cache, final SubLObject key, final SubLObject value)
  {
    assert NIL != cache_p( v_cache ) : v_cache;
    return cache_set_int( v_cache, key, value, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10192L)
  public static SubLObject cache_set_return_dropped(final SubLObject v_cache, final SubLObject key, final SubLObject value)
  {
    SubLObject oldest_key = NIL;
    SubLObject oldest_value = NIL;
    SubLObject dropped = NIL;
    if( NIL != cache_full_p( v_cache ) && $kw57$UNKNOWN == cache_get_without_values( v_cache, key, $kw57$UNKNOWN ) )
    {
      oldest_key = cache_entry_key( cache_oldest( v_cache ) );
      oldest_value = cache_get_without_values( v_cache, oldest_key, UNPROVIDED );
      dropped = T;
      cache_remove( v_cache, oldest_key );
    }
    cache_set_without_values( v_cache, key, value );
    return subl_promotions.values3( oldest_key, oldest_value, dropped );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11195L)
  public static SubLObject cache_set_int(final SubLObject v_cache, final SubLObject key, final SubLObject value, final SubLObject return_old_entry)
  {
    final SubLObject old_entry = Hashtables.gethash_without_values( key, cache_map( v_cache ), UNPROVIDED );
    SubLObject previous = NIL;
    if( NIL != old_entry )
    {
      previous = cache_entry_value( old_entry );
      _csetf_cache_entry_value( old_entry, value );
      cache_queue_requeue( v_cache, old_entry );
    }
    else
    {
      SubLObject entry = NIL;
      if( NIL != cache_full_p( v_cache ) )
      {
        entry = cache_oldest( v_cache );
        Hashtables.remhash( cache_entry_key( entry ), cache_map( v_cache ) );
        cache_queue_unlink( entry );
      }
      else
      {
        entry = get_new_cache_entry( v_cache );
      }
      _csetf_cache_entry_key( entry, key );
      _csetf_cache_entry_value( entry, value );
      Hashtables.sethash( key, cache_map( v_cache ), entry );
      cache_queue_enqueue( v_cache, entry );
    }
    if( NIL != return_old_entry )
    {
      return subl_promotions.values2( previous, list_utilities.sublisp_boolean( old_entry ) );
    }
    return previous;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12286L)
  public static SubLObject cache_remove(final SubLObject v_cache, final SubLObject key)
  {
    assert NIL != cache_p( v_cache ) : v_cache;
    final SubLObject entry = Hashtables.gethash_without_values( key, cache_map( v_cache ), UNPROVIDED );
    SubLObject value = NIL;
    if( NIL != entry )
    {
      cache_queue_remove( v_cache, entry );
      Hashtables.remhash( key, cache_map( v_cache ) );
      value = cache_entry_value( entry );
    }
    return subl_promotions.values2( value, list_utilities.sublisp_boolean( entry ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12950L)
  public static SubLObject cache_clear(final SubLObject v_cache)
  {
    assert NIL != cache_p( v_cache ) : v_cache;
    if( NIL != is_cache_preallocated_p( v_cache ) )
    {
      while ( NIL == cache_empty_p( v_cache ))
      {
        final SubLObject oldest = cache_oldest( v_cache );
        cache_remove( v_cache, cache_entry_key( oldest ) );
      }
    }
    else
    {
      final SubLObject head_entry = cache_head_entry( v_cache );
      _csetf_cache_entry_newer( head_entry, head_entry );
      _csetf_cache_entry_older( head_entry, head_entry );
      Hashtables.clrhash( cache_map( v_cache ) );
    }
    return v_cache;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13663L)
  public static SubLObject cache_test(final SubLObject v_cache)
  {
    assert NIL != cache_p( v_cache ) : v_cache;
    return Hashtables.hash_table_test( cache_map( v_cache ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 13933L)
  public static SubLObject cache_size(final SubLObject v_cache)
  {
    assert NIL != cache_p( v_cache ) : v_cache;
    return Hashtables.hash_table_count( cache_map( v_cache ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14198L)
  public static SubLObject do_cache(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject value = NIL;
    SubLObject v_cache = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    v_cache = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list58 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list58 );
      if( NIL == conses_high.member( current_$1, $list59, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw60$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list58 );
    }
    final SubLObject order_tail = cdestructuring_bind.property_list_member( $kw61$ORDER, current );
    final SubLObject order = ( NIL != order_tail ) ? conses_high.cadr( order_tail ) : $kw62$NEWEST;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject cache_var = $sym63$CACHE_VAR;
    final SubLObject order_var = $sym64$ORDER_VAR;
    final SubLObject entry = $sym65$ENTRY;
    return ConsesLow.list( $sym66$CLET, ConsesLow.list( ConsesLow.list( cache_var, v_cache ), ConsesLow.list( order_var, order ), ConsesLow.list( entry, ConsesLow.list( $sym67$DO_CACHE_FIRST, cache_var, order_var ) ),
        key, value ), ConsesLow.listS( $sym68$WHILE, ConsesLow.list( $sym69$CNOT, ConsesLow.list( $sym70$DO_CACHE_DONE_, cache_var, entry ) ), ConsesLow.list( $sym71$CSETQ, key, ConsesLow.list( $sym72$DO_CACHE_KEY,
            entry ) ), ConsesLow.list( $sym71$CSETQ, value, ConsesLow.list( $sym73$DO_CACHE_VALUE, entry ) ), ConsesLow.list( $sym71$CSETQ, entry, ConsesLow.list( $sym74$DO_CACHE_NEXT, entry, order_var ) ), ConsesLow
                .append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 14949L)
  public static SubLObject cache_copy(final SubLObject v_cache)
  {
    final SubLObject copy = new_cache( cache_capacity( v_cache ), cache_test( v_cache ) );
    final SubLObject order_var = $kw75$OLDEST;
    SubLObject entry = do_cache_first( v_cache, order_var );
    SubLObject key = NIL;
    SubLObject value = NIL;
    while ( NIL == do_cache_doneP( v_cache, entry ))
    {
      key = do_cache_key( entry );
      value = do_cache_value( entry );
      entry = do_cache_next( entry, order_var );
      cache_set( copy, key, value );
    }
    return copy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15335L)
  public static SubLObject do_cache_first(final SubLObject v_cache, final SubLObject order)
  {
    assert NIL != cache_p( v_cache ) : v_cache;
    return do_cache_next( cache_head_entry( v_cache ), order );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15510L)
  public static SubLObject do_cache_doneP(final SubLObject v_cache, final SubLObject entry)
  {
    return Equality.eq( entry, cache_head_entry( v_cache ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15626L)
  public static SubLObject do_cache_key(final SubLObject entry)
  {
    return cache_entry_key( entry );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15722L)
  public static SubLObject do_cache_value(final SubLObject entry)
  {
    return cache_entry_value( entry );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 15822L)
  public static SubLObject do_cache_next(final SubLObject entry, final SubLObject order)
  {
    if( order.eql( $kw62$NEWEST ) )
    {
      return cache_entry_older( entry );
    }
    if( order.eql( $kw75$OLDEST ) )
    {
      return cache_entry_newer( entry );
    }
    return Errors.error( $str77$_S_was_not_either__NEWEST_or__OLD, order );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16080L)
  public static SubLObject cache_keys(final SubLObject v_cache)
  {
    assert NIL != cache_p( v_cache ) : v_cache;
    SubLObject keys = NIL;
    final SubLObject order_var = $kw62$NEWEST;
    SubLObject entry = do_cache_first( v_cache, order_var );
    SubLObject key = NIL;
    SubLObject value = NIL;
    while ( NIL == do_cache_doneP( v_cache, entry ))
    {
      key = do_cache_key( entry );
      value = do_cache_value( entry );
      entry = do_cache_next( entry, order_var );
      keys = ConsesLow.cons( key, keys );
    }
    return Sequences.nreverse( keys );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16371L)
  public static SubLObject cache_values(final SubLObject v_cache)
  {
    assert NIL != cache_p( v_cache ) : v_cache;
    SubLObject values = NIL;
    final SubLObject order_var = $kw62$NEWEST;
    SubLObject entry = do_cache_first( v_cache, order_var );
    SubLObject key = NIL;
    for( SubLObject value = NIL; NIL == do_cache_doneP( v_cache, entry ); entry = do_cache_next( entry, order_var ), values = ConsesLow.cons( value, values ) )
    {
      key = do_cache_key( entry );
      value = do_cache_value( entry );
    }
    return Sequences.nreverse( values );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 16671L)
  public static SubLObject map_cache(final SubLObject v_cache, final SubLObject function)
  {
    assert NIL != cache_p( v_cache ) : v_cache;
    assert NIL != Types.function_spec_p( function ) : function;
    final SubLObject order_var = $kw62$NEWEST;
    SubLObject entry = do_cache_first( v_cache, order_var );
    SubLObject key = NIL;
    SubLObject value = NIL;
    while ( NIL == do_cache_doneP( v_cache, entry ))
    {
      key = do_cache_key( entry );
      value = do_cache_value( entry );
      entry = do_cache_next( entry, order_var );
      Functions.funcall( function, key, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17002L)
  public static SubLObject new_cache_iterator(final SubLObject v_cache)
  {
    assert NIL != cache_p( v_cache ) : v_cache;
    return iteration.new_iterator( make_iterator_cache_state( v_cache ), $sym79$CACHE_ITERATOR_DONE, $sym80$CACHE_ITERATOR_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17405L)
  public static SubLObject make_iterator_cache_state(final SubLObject v_cache)
  {
    final SubLObject current = cache_entry_older( cache_head_entry( v_cache ) );
    return ConsesLow.list( current, cache_head_entry( v_cache ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17598L)
  public static SubLObject cache_iterator_done(final SubLObject state)
  {
    SubLObject current_$2 = NIL;
    SubLObject head_entry = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list81 );
    current_$2 = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list81 );
    head_entry = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return Equality.eq( current_$2, head_entry );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list81 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17729L)
  public static SubLObject cache_iterator_next(final SubLObject state)
  {
    SubLObject current_$3 = NIL;
    SubLObject head_entry = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list81 );
    current_$3 = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list81 );
    head_entry = current.first();
    current = current.rest();
    if( NIL == current )
    {
      ConsesLow.rplaca( state, cache_entry_older( current_$3 ) );
      return subl_promotions.values3( current_$3, state, Equality.eq( current_$3, head_entry ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list81 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 17931L)
  public static SubLObject new_cache_content_iterator(final SubLObject v_cache)
  {
    assert NIL != cache_p( v_cache ) : v_cache;
    return iteration.new_iterator( make_cache_content_iterator_state( v_cache ), $sym82$CACHE_CONTENT_ITERATOR_DONE, $sym83$CACHE_CONTENT_ITERATOR_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18438L)
  public static SubLObject make_cache_content_iterator_state(final SubLObject v_cache)
  {
    final SubLObject interior_iterator = new_cache_iterator( v_cache );
    return interior_iterator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18606L)
  public static SubLObject cache_content_iterator_done(final SubLObject state)
  {
    return iteration.iteration_done( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 18742L)
  public static SubLObject cache_content_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject current_entry = iteration.iteration_next( state );
    final SubLObject valid_p = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != valid_p )
    {
      final SubLObject key = cache_entry_key( current_entry );
      final SubLObject value = cache_entry_value( current_entry );
      return subl_promotions.values3( ConsesLow.cons( key, value ), state, NIL );
    }
    return subl_promotions.values3( NIL, state, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19344L)
  public static SubLObject cfasl_output_object_cache_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_cache( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19459L)
  public static SubLObject cfasl_output_cache(final SubLObject v_object, final SubLObject stream)
  {
    cfasl.cfasl_raw_write_byte( $cfasl_opcode_cache$.getGlobalValue(), stream );
    final SubLObject capacity = cache_capacity( v_object );
    final SubLObject test = hash_table_utilities.hash_test_to_symbol( cache_test( v_object ) );
    final SubLObject size = cache_size( v_object );
    cfasl.cfasl_output( capacity, stream );
    cfasl.cfasl_output( test, stream );
    cfasl.cfasl_output( size, stream );
    final SubLObject order_var = $kw75$OLDEST;
    SubLObject entry = do_cache_first( v_object, order_var );
    SubLObject key = NIL;
    SubLObject value = NIL;
    while ( NIL == do_cache_doneP( v_object, entry ))
    {
      key = do_cache_key( entry );
      value = do_cache_value( entry );
      entry = do_cache_next( entry, order_var );
      cfasl.cfasl_output( key, stream );
      cfasl.cfasl_output( value, stream );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 19928L)
  public static SubLObject cfasl_input_cache(final SubLObject stream)
  {
    final SubLObject capacity = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    SubLObject test = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject size = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    SubLObject v_cache = NIL;
    final SubLObject pcase_var = test;
    if( pcase_var.eql( EQ ) || pcase_var.eql( EQL ) || pcase_var.eql( EQUAL ) || pcase_var.eql( EQUALP ) )
    {
      test = Symbols.symbol_function( test );
    }
    v_cache = new_cache( capacity, test );
    SubLObject i;
    SubLObject key;
    SubLObject value;
    for( i = NIL, i = ZERO_INTEGER; i.numL( size ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      key = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      value = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      cache_set_without_values( v_cache, key, value );
    }
    return v_cache;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20466L)
  public static SubLObject cache_newest(final SubLObject v_cache)
  {
    return cache_entry_older( cache_head_entry( v_cache ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 20830L)
  public static SubLObject cache_oldest(final SubLObject v_cache)
  {
    return cache_entry_newer( cache_head_entry( v_cache ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21148L)
  public static SubLObject cache_queue_remove(final SubLObject v_cache, final SubLObject entry)
  {
    cache_queue_unlink( entry );
    possibly_resource_cache_entry( v_cache, entry );
    return v_cache;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 21648L)
  public static SubLObject cache_queue_requeue(final SubLObject v_cache, final SubLObject entry)
  {
    if( !entry.eql( cache_newest( v_cache ) ) )
    {
      cache_queue_unlink( entry );
      cache_queue_append( v_cache, entry );
    }
    return v_cache;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22071L)
  public static SubLObject cache_queue_enqueue(final SubLObject v_cache, final SubLObject entry)
  {
    return cache_queue_append( v_cache, entry );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 22467L)
  public static SubLObject cache_queue_append(final SubLObject v_cache, final SubLObject entry)
  {
    _csetf_cache_entry_newer( entry, cache_head_entry( v_cache ) );
    _csetf_cache_entry_older( entry, cache_newest( v_cache ) );
    _csetf_cache_entry_newer( cache_newest( v_cache ), entry );
    _csetf_cache_entry_older( cache_head_entry( v_cache ), entry );
    return v_cache;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23077L)
  public static SubLObject cache_queue_unlink(final SubLObject entry)
  {
    _csetf_cache_entry_newer( cache_entry_older( entry ), cache_entry_newer( entry ) );
    _csetf_cache_entry_older( cache_entry_newer( entry ), cache_entry_older( entry ) );
    return entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23412L)
  public static SubLObject is_cache_preallocated_p(final SubLObject v_cache)
  {
    final SubLObject free_list = cache_free_list( v_cache );
    return makeBoolean( free_list == $kw56$RESOURCED || NIL != cache_entry_p( free_list ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 23655L)
  public static SubLObject get_new_cache_entry(final SubLObject v_cache)
  {
    SubLObject entry = unresource_cache_entry( v_cache );
    if( NIL == entry )
    {
      entry = make_cache_entry( UNPROVIDED );
    }
    return entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24020L)
  public static SubLObject cache_free_list(final SubLObject v_cache)
  {
    return cache_entry_key( cache_head_entry( v_cache ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24394L)
  public static SubLObject set_cache_free_list(final SubLObject v_cache, final SubLObject head)
  {
    _csetf_cache_entry_key( cache_head_entry( v_cache ), head );
    return v_cache;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 24858L)
  public static SubLObject possibly_resource_cache_entry(final SubLObject v_cache, final SubLObject entry)
  {
    if( NIL != is_cache_preallocated_p( v_cache ) )
    {
      resource_cache_entry( v_cache, entry );
    }
    return v_cache;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25239L)
  public static SubLObject resource_cache_entry(final SubLObject v_cache, final SubLObject entry)
  {
    scrub_cache_entry( entry );
    _csetf_cache_entry_newer( entry, cache_free_list( v_cache ) );
    return set_cache_free_list( v_cache, entry );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 25631L)
  public static SubLObject unresource_cache_entry(final SubLObject v_cache)
  {
    final SubLObject free_list = cache_free_list( v_cache );
    SubLObject entry = NIL;
    if( NIL != cache_entry_p( free_list ) )
    {
      entry = free_list;
      set_cache_free_list( v_cache, cache_entry_newer( entry ) );
      _csetf_cache_entry_newer( entry, NIL );
    }
    return entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26323L)
  public static SubLObject cache_entry_print(final SubLObject entry, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    print_high.princ( cache_entry_key( entry ), stream );
    if( NIL != $print_cache_valuesP$.getDynamicValue( thread ) )
    {
      streams_high.write_string( $str87$____, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( cache_entry_value( entry ), stream );
    }
    return entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26711L)
  public static SubLObject scrub_cache_entry(final SubLObject entry)
  {
    _csetf_cache_entry_value( entry, NIL );
    _csetf_cache_entry_key( entry, NIL );
    _csetf_cache_entry_newer( entry, NIL );
    _csetf_cache_entry_older( entry, NIL );
    return entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 26976L)
  public static SubLObject test_cache(SubLObject cardinality)
  {
    if( cardinality == UNPROVIDED )
    {
      cardinality = $int88$100;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.positive_integer_p( cardinality ) : cardinality;
    final SubLObject capacity = Numbers.divide( cardinality, TEN_INTEGER );
    SubLObject j = ZERO_INTEGER;
    SubLObject passP = T;
    SubLObject order = NIL;
    thread.resetMultipleValues();
    final SubLObject v_cache = test_get_randomly_populated_cache_and_control_map( capacity );
    final SubLObject hash = thread.secondMultipleValue();
    thread.resetMultipleValues();
    order = Vectors.make_vector( Hashtables.hash_table_count( hash ), UNPROVIDED );
    SubLObject key = NIL;
    SubLObject time = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( hash );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        time = Hashtables.getEntryValue( cdohash_entry );
        Vectors.set_aref( order, j, ConsesLow.cons( key, time ) );
        j = Numbers.add( j, ONE_INTEGER );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    Sort.sort( order, Symbols.symbol_function( $sym89$_ ), Symbols.symbol_function( $sym90$CDR ) );
    final SubLObject hits = Numbers.min( capacity, Hashtables.hash_table_count( hash ) );
    SubLObject key2 = NIL;
    SubLObject value = NIL;
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( hits ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      key2 = Vectors.aref( order, i ).first();
      value = cache_get( v_cache, key2 );
      passP = makeBoolean( NIL != passP && value.eql( Numbers.add( key2, $float91$0_5 ) ) );
    }
    SubLObject cdotimes_end_var;
    SubLObject k;
    for( cdotimes_end_var = Numbers.subtract( Hashtables.hash_table_count( hash ), hits ), k = NIL, k = ZERO_INTEGER; k.numL( cdotimes_end_var ); k = Numbers.add( k, ONE_INTEGER ) )
    {
      passP = makeBoolean( NIL != passP && NIL == cache_get( v_cache, Vectors.aref( order, Numbers.add( k, capacity ) ).first() ) );
    }
    return passP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 28363L)
  public static SubLObject test_get_randomly_populated_cache_and_control_map(final SubLObject capacity)
  {
    final SubLObject v_cache = new_cache( capacity, UNPROVIDED );
    final SubLObject estimated_cardinality = Numbers.multiply( TEN_INTEGER, capacity );
    final SubLObject map = Hashtables.make_hash_table( estimated_cardinality, UNPROVIDED, UNPROVIDED );
    SubLObject time;
    SubLObject key;
    for( time = NIL, time = ZERO_INTEGER; time.numL( estimated_cardinality ); time = Numbers.add( time, ONE_INTEGER ) )
    {
      key = random.random( estimated_cardinality );
      cache_set( v_cache, key, Numbers.add( key, $float91$0_5 ) );
      map_utilities.map_put( map, key, time );
    }
    return subl_promotions.values2( v_cache, map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 29146L)
  public static SubLObject test_cache_iterators(SubLObject cardinality)
  {
    if( cardinality == UNPROVIDED )
    {
      cardinality = $int88$100;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject v_cache = test_get_randomly_populated_cache_and_control_map( Numbers.integerDivide( cardinality, TEN_INTEGER ) );
    final SubLObject map = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject entry_iterator = new_cache_iterator( v_cache );
    final SubLObject content_iterator = new_cache_content_iterator( v_cache );
    SubLObject item_number = ZERO_INTEGER;
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject entry = iteration.iteration_next( entry_iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        item_number = Numbers.add( item_number, ONE_INTEGER );
        if( NIL != iteration.iteration_done( content_iterator ) )
        {
          Errors.warn( $str92$Content_iterator__A_was_exhausted, content_iterator, item_number, entry_iterator );
          return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject key_value_pair = iteration.iteration_next( content_iterator );
        final SubLObject valid_p = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL == valid_p )
        {
          Errors.warn( $str92$Content_iterator__A_was_exhausted, content_iterator, item_number, entry_iterator );
          return NIL;
        }
        final SubLObject entry_key = cache_entry_key( entry );
        final SubLObject entry_value = cache_entry_value( entry );
        final SubLObject content_key = key_value_pair.first();
        final SubLObject content_value = key_value_pair.rest();
        if( !entry_key.eql( content_key ) )
        {
          Errors.warn( $str93$The_content_iterator_at_item__A_s, item_number, content_key, entry_key );
          return NIL;
        }
        if( !entry_value.eql( content_value ) )
        {
          Errors.warn( $str94$The_content_iterator_at_item__A_s, item_number, content_value, entry_value );
          return NIL;
        }
      }
    }
    if( NIL == iteration.iteration_done( content_iterator ) )
    {
      Errors.warn( $str95$The_content_iterator__A_is_not_ex, item_number, content_iterator, entry_iterator );
      return NIL;
    }
    if( !item_number.numE( cache_size( v_cache ) ) )
    {
      Errors.warn( $str96$The_two_iterators_do_not_seem_to_, item_number, cache_size( v_cache ) );
      return NIL;
    }
    return T;
  }

  public static SubLObject declare_cache_file()
  {
    SubLFiles.declareFunction( me, "cache_print_function_trampoline", "CACHE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_p", "CACHE-P", 1, 0, false );
    new $cache_p$UnaryFunction();
    SubLFiles.declareFunction( me, "cache_capacity", "CACHE-CAPACITY", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_map", "CACHE-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_head_entry", "CACHE-HEAD-ENTRY", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cache_capacity", "_CSETF-CACHE-CAPACITY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cache_map", "_CSETF-CACHE-MAP", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cache_head_entry", "_CSETF-CACHE-HEAD-ENTRY", 2, 0, false );
    SubLFiles.declareFunction( me, "make_cache", "MAKE-CACHE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_cache", "VISIT-DEFSTRUCT-CACHE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_cache_method", "VISIT-DEFSTRUCT-OBJECT-CACHE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_entry_print_function_trampoline", "CACHE-ENTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_entry_p", "CACHE-ENTRY-P", 1, 0, false );
    new $cache_entry_p$UnaryFunction();
    SubLFiles.declareFunction( me, "cache_entry_newer", "CACHE-ENTRY-NEWER", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_entry_key", "CACHE-ENTRY-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_entry_value", "CACHE-ENTRY-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_entry_older", "CACHE-ENTRY-OLDER", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cache_entry_newer", "_CSETF-CACHE-ENTRY-NEWER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cache_entry_key", "_CSETF-CACHE-ENTRY-KEY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cache_entry_value", "_CSETF-CACHE-ENTRY-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cache_entry_older", "_CSETF-CACHE-ENTRY-OLDER", 2, 0, false );
    SubLFiles.declareFunction( me, "make_cache_entry", "MAKE-CACHE-ENTRY", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_cache_entry", "VISIT-DEFSTRUCT-CACHE-ENTRY", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_cache_entry_method", "VISIT-DEFSTRUCT-OBJECT-CACHE-ENTRY-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_print", "CACHE-PRINT", 3, 0, false );
    SubLFiles.declareFunction( me, "new_cache", "NEW-CACHE", 1, 1, false );
    SubLFiles.declareFunction( me, "new_preallocated_cache", "NEW-PREALLOCATED-CACHE", 1, 1, false );
    SubLFiles.declareFunction( me, "cache_full_p", "CACHE-FULL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_empty_p", "CACHE-EMPTY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_get", "CACHE-GET", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_get_without_values", "CACHE-GET-WITHOUT-VALUES", 2, 1, false );
    SubLFiles.declareFunction( me, "cache_get_int", "CACHE-GET-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "cache_contains_key_p", "CACHE-CONTAINS-KEY-P", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_set", "CACHE-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "cache_set_without_values", "CACHE-SET-WITHOUT-VALUES", 3, 0, false );
    SubLFiles.declareFunction( me, "cache_set_return_dropped", "CACHE-SET-RETURN-DROPPED", 3, 0, false );
    SubLFiles.declareFunction( me, "cache_set_int", "CACHE-SET-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "cache_remove", "CACHE-REMOVE", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_clear", "CACHE-CLEAR", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_test", "CACHE-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_size", "CACHE-SIZE", 1, 0, false );
    SubLFiles.declareMacro( me, "do_cache", "DO-CACHE" );
    SubLFiles.declareFunction( me, "cache_copy", "CACHE-COPY", 1, 0, false );
    SubLFiles.declareFunction( me, "do_cache_first", "DO-CACHE-FIRST", 2, 0, false );
    SubLFiles.declareFunction( me, "do_cache_doneP", "DO-CACHE-DONE?", 2, 0, false );
    SubLFiles.declareFunction( me, "do_cache_key", "DO-CACHE-KEY", 1, 0, false );
    SubLFiles.declareFunction( me, "do_cache_value", "DO-CACHE-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "do_cache_next", "DO-CACHE-NEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_keys", "CACHE-KEYS", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_values", "CACHE-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "map_cache", "MAP-CACHE", 2, 0, false );
    SubLFiles.declareFunction( me, "new_cache_iterator", "NEW-CACHE-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "make_iterator_cache_state", "MAKE-ITERATOR-CACHE-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_iterator_done", "CACHE-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_iterator_next", "CACHE-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cache_content_iterator", "NEW-CACHE-CONTENT-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "make_cache_content_iterator_state", "MAKE-CACHE-CONTENT-ITERATOR-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_content_iterator_done", "CACHE-CONTENT-ITERATOR-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_content_iterator_next", "CACHE-CONTENT-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_cache_method", "CFASL-OUTPUT-OBJECT-CACHE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_cache", "CFASL-OUTPUT-CACHE", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_cache", "CFASL-INPUT-CACHE", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_newest", "CACHE-NEWEST", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_oldest", "CACHE-OLDEST", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_queue_remove", "CACHE-QUEUE-REMOVE", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_queue_requeue", "CACHE-QUEUE-REQUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_queue_enqueue", "CACHE-QUEUE-ENQUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_queue_append", "CACHE-QUEUE-APPEND", 2, 0, false );
    SubLFiles.declareFunction( me, "cache_queue_unlink", "CACHE-QUEUE-UNLINK", 1, 0, false );
    SubLFiles.declareFunction( me, "is_cache_preallocated_p", "IS-CACHE-PREALLOCATED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_new_cache_entry", "GET-NEW-CACHE-ENTRY", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_free_list", "CACHE-FREE-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "set_cache_free_list", "SET-CACHE-FREE-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "possibly_resource_cache_entry", "POSSIBLY-RESOURCE-CACHE-ENTRY", 2, 0, false );
    SubLFiles.declareFunction( me, "resource_cache_entry", "RESOURCE-CACHE-ENTRY", 2, 0, false );
    SubLFiles.declareFunction( me, "unresource_cache_entry", "UNRESOURCE-CACHE-ENTRY", 1, 0, false );
    SubLFiles.declareFunction( me, "cache_entry_print", "CACHE-ENTRY-PRINT", 3, 0, false );
    SubLFiles.declareFunction( me, "scrub_cache_entry", "SCRUB-CACHE-ENTRY", 1, 0, false );
    SubLFiles.declareFunction( me, "test_cache", "TEST-CACHE", 0, 1, false );
    SubLFiles.declareFunction( me, "test_get_randomly_populated_cache_and_control_map", "TEST-GET-RANDOMLY-POPULATED-CACHE-AND-CONTROL-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "test_cache_iterators", "TEST-CACHE-ITERATORS", 0, 1, false );
    return NIL;
  }

  public static SubLObject init_cache_file()
  {
    $dtp_cache$ = SubLFiles.defconstant( "*DTP-CACHE*", $sym0$CACHE );
    $dtp_cache_entry$ = SubLFiles.defconstant( "*DTP-CACHE-ENTRY*", $sym24$CACHE_ENTRY );
    $print_cache_elementsP$ = SubLFiles.defparameter( "*PRINT-CACHE-ELEMENTS?*", NIL );
    $cache_entries_preallocateP$ = SubLFiles.defparameter( "*CACHE-ENTRIES-PREALLOCATE?*", NIL );
    $cfasl_opcode_cache$ = SubLFiles.defconstant( "*CFASL-OPCODE-CACHE*", $int84$63 );
    $print_cache_valuesP$ = SubLFiles.defparameter( "*PRINT-CACHE-VALUES?*", NIL );
    return NIL;
  }

  public static SubLObject setup_cache_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_cache$.getGlobalValue(), Symbols.symbol_function( $sym7$CACHE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$CACHE_CAPACITY, $sym10$_CSETF_CACHE_CAPACITY );
    Structures.def_csetf( $sym11$CACHE_MAP, $sym12$_CSETF_CACHE_MAP );
    Structures.def_csetf( $sym13$CACHE_HEAD_ENTRY, $sym14$_CSETF_CACHE_HEAD_ENTRY );
    Equality.identity( $sym0$CACHE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cache$.getGlobalValue(), Symbols.symbol_function( $sym23$VISIT_DEFSTRUCT_OBJECT_CACHE_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_cache_entry$.getGlobalValue(), Symbols.symbol_function( $sym31$CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list32 );
    Structures.def_csetf( $sym33$CACHE_ENTRY_NEWER, $sym34$_CSETF_CACHE_ENTRY_NEWER );
    Structures.def_csetf( $sym35$CACHE_ENTRY_KEY, $sym36$_CSETF_CACHE_ENTRY_KEY );
    Structures.def_csetf( $sym37$CACHE_ENTRY_VALUE, $sym38$_CSETF_CACHE_ENTRY_VALUE );
    Structures.def_csetf( $sym39$CACHE_ENTRY_OLDER, $sym40$_CSETF_CACHE_ENTRY_OLDER );
    Equality.identity( $sym24$CACHE_ENTRY );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cache_entry$.getGlobalValue(), Symbols.symbol_function( $sym46$VISIT_DEFSTRUCT_OBJECT_CACHE_ENTRY_METHOD ) );
    access_macros.register_macro_helper( $sym67$DO_CACHE_FIRST, $sym76$DO_CACHE );
    access_macros.register_macro_helper( $sym70$DO_CACHE_DONE_, $sym76$DO_CACHE );
    access_macros.register_macro_helper( $sym72$DO_CACHE_KEY, $sym76$DO_CACHE );
    access_macros.register_macro_helper( $sym73$DO_CACHE_VALUE, $sym76$DO_CACHE );
    access_macros.register_macro_helper( $sym74$DO_CACHE_NEXT, $sym76$DO_CACHE );
    cfasl.register_cfasl_input_function( $cfasl_opcode_cache$.getGlobalValue(), $sym85$CFASL_INPUT_CACHE );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_cache$.getGlobalValue(), Symbols.symbol_function( $sym86$CFASL_OUTPUT_OBJECT_CACHE_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cache_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cache_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cache_file();
  }
  static
  {
    me = new cache();
    $dtp_cache$ = null;
    $dtp_cache_entry$ = null;
    $print_cache_elementsP$ = null;
    $cache_entries_preallocateP$ = null;
    $cfasl_opcode_cache$ = null;
    $print_cache_valuesP$ = null;
    $sym0$CACHE = makeSymbol( "CACHE" );
    $sym1$CACHE_P = makeSymbol( "CACHE-P" );
    $list2 = ConsesLow.list( makeSymbol( "CAPACITY" ), makeSymbol( "MAP" ), makeSymbol( "HEAD-ENTRY" ) );
    $list3 = ConsesLow.list( makeKeyword( "CAPACITY" ), makeKeyword( "MAP" ), makeKeyword( "HEAD-ENTRY" ) );
    $list4 = ConsesLow.list( makeSymbol( "CACHE-CAPACITY" ), makeSymbol( "CACHE-MAP" ), makeSymbol( "CACHE-HEAD-ENTRY" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-CACHE-CAPACITY" ), makeSymbol( "_CSETF-CACHE-MAP" ), makeSymbol( "_CSETF-CACHE-HEAD-ENTRY" ) );
    $sym6$CACHE_PRINT = makeSymbol( "CACHE-PRINT" );
    $sym7$CACHE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "CACHE-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "CACHE-P" ) );
    $sym9$CACHE_CAPACITY = makeSymbol( "CACHE-CAPACITY" );
    $sym10$_CSETF_CACHE_CAPACITY = makeSymbol( "_CSETF-CACHE-CAPACITY" );
    $sym11$CACHE_MAP = makeSymbol( "CACHE-MAP" );
    $sym12$_CSETF_CACHE_MAP = makeSymbol( "_CSETF-CACHE-MAP" );
    $sym13$CACHE_HEAD_ENTRY = makeSymbol( "CACHE-HEAD-ENTRY" );
    $sym14$_CSETF_CACHE_HEAD_ENTRY = makeSymbol( "_CSETF-CACHE-HEAD-ENTRY" );
    $kw15$CAPACITY = makeKeyword( "CAPACITY" );
    $kw16$MAP = makeKeyword( "MAP" );
    $kw17$HEAD_ENTRY = makeKeyword( "HEAD-ENTRY" );
    $str18$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw19$BEGIN = makeKeyword( "BEGIN" );
    $sym20$MAKE_CACHE = makeSymbol( "MAKE-CACHE" );
    $kw21$SLOT = makeKeyword( "SLOT" );
    $kw22$END = makeKeyword( "END" );
    $sym23$VISIT_DEFSTRUCT_OBJECT_CACHE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-CACHE-METHOD" );
    $sym24$CACHE_ENTRY = makeSymbol( "CACHE-ENTRY" );
    $sym25$CACHE_ENTRY_P = makeSymbol( "CACHE-ENTRY-P" );
    $list26 = ConsesLow.list( makeSymbol( "NEWER" ), makeSymbol( "KEY" ), makeSymbol( "VALUE" ), makeSymbol( "OLDER" ) );
    $list27 = ConsesLow.list( makeKeyword( "NEWER" ), makeKeyword( "KEY" ), makeKeyword( "VALUE" ), makeKeyword( "OLDER" ) );
    $list28 = ConsesLow.list( makeSymbol( "CACHE-ENTRY-NEWER" ), makeSymbol( "CACHE-ENTRY-KEY" ), makeSymbol( "CACHE-ENTRY-VALUE" ), makeSymbol( "CACHE-ENTRY-OLDER" ) );
    $list29 = ConsesLow.list( makeSymbol( "_CSETF-CACHE-ENTRY-NEWER" ), makeSymbol( "_CSETF-CACHE-ENTRY-KEY" ), makeSymbol( "_CSETF-CACHE-ENTRY-VALUE" ), makeSymbol( "_CSETF-CACHE-ENTRY-OLDER" ) );
    $sym30$CACHE_ENTRY_PRINT = makeSymbol( "CACHE-ENTRY-PRINT" );
    $sym31$CACHE_ENTRY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "CACHE-ENTRY-PRINT-FUNCTION-TRAMPOLINE" );
    $list32 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "CACHE-ENTRY-P" ) );
    $sym33$CACHE_ENTRY_NEWER = makeSymbol( "CACHE-ENTRY-NEWER" );
    $sym34$_CSETF_CACHE_ENTRY_NEWER = makeSymbol( "_CSETF-CACHE-ENTRY-NEWER" );
    $sym35$CACHE_ENTRY_KEY = makeSymbol( "CACHE-ENTRY-KEY" );
    $sym36$_CSETF_CACHE_ENTRY_KEY = makeSymbol( "_CSETF-CACHE-ENTRY-KEY" );
    $sym37$CACHE_ENTRY_VALUE = makeSymbol( "CACHE-ENTRY-VALUE" );
    $sym38$_CSETF_CACHE_ENTRY_VALUE = makeSymbol( "_CSETF-CACHE-ENTRY-VALUE" );
    $sym39$CACHE_ENTRY_OLDER = makeSymbol( "CACHE-ENTRY-OLDER" );
    $sym40$_CSETF_CACHE_ENTRY_OLDER = makeSymbol( "_CSETF-CACHE-ENTRY-OLDER" );
    $kw41$NEWER = makeKeyword( "NEWER" );
    $kw42$KEY = makeKeyword( "KEY" );
    $kw43$VALUE = makeKeyword( "VALUE" );
    $kw44$OLDER = makeKeyword( "OLDER" );
    $sym45$MAKE_CACHE_ENTRY = makeSymbol( "MAKE-CACHE-ENTRY" );
    $sym46$VISIT_DEFSTRUCT_OBJECT_CACHE_ENTRY_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-CACHE-ENTRY-METHOD" );
    $str47$__CACHE_ = makeString( "#<CACHE/" );
    $str48$_ = makeString( "/" );
    $str49$_ = makeString( "(" );
    $str50$__ = makeString( ", " );
    $str51$___ = makeString( "..." );
    $str52$_ = makeString( ")" );
    $str53$_ = makeString( ">" );
    $sym54$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $sym55$VALID_HASH_TEST_P = makeSymbol( "VALID-HASH-TEST-P" );
    $kw56$RESOURCED = makeKeyword( "RESOURCED" );
    $kw57$UNKNOWN = makeKeyword( "UNKNOWN" );
    $list58 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VALUE" ), makeSymbol( "CACHE" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "ORDER" ), makeKeyword( "NEWEST" ) ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $list59 = ConsesLow.list( makeKeyword( "ORDER" ) );
    $kw60$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw61$ORDER = makeKeyword( "ORDER" );
    $kw62$NEWEST = makeKeyword( "NEWEST" );
    $sym63$CACHE_VAR = makeUninternedSymbol( "CACHE-VAR" );
    $sym64$ORDER_VAR = makeUninternedSymbol( "ORDER-VAR" );
    $sym65$ENTRY = makeUninternedSymbol( "ENTRY" );
    $sym66$CLET = makeSymbol( "CLET" );
    $sym67$DO_CACHE_FIRST = makeSymbol( "DO-CACHE-FIRST" );
    $sym68$WHILE = makeSymbol( "WHILE" );
    $sym69$CNOT = makeSymbol( "CNOT" );
    $sym70$DO_CACHE_DONE_ = makeSymbol( "DO-CACHE-DONE?" );
    $sym71$CSETQ = makeSymbol( "CSETQ" );
    $sym72$DO_CACHE_KEY = makeSymbol( "DO-CACHE-KEY" );
    $sym73$DO_CACHE_VALUE = makeSymbol( "DO-CACHE-VALUE" );
    $sym74$DO_CACHE_NEXT = makeSymbol( "DO-CACHE-NEXT" );
    $kw75$OLDEST = makeKeyword( "OLDEST" );
    $sym76$DO_CACHE = makeSymbol( "DO-CACHE" );
    $str77$_S_was_not_either__NEWEST_or__OLD = makeString( "~S was not either :NEWEST or :OLDEST" );
    $sym78$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym79$CACHE_ITERATOR_DONE = makeSymbol( "CACHE-ITERATOR-DONE" );
    $sym80$CACHE_ITERATOR_NEXT = makeSymbol( "CACHE-ITERATOR-NEXT" );
    $list81 = ConsesLow.list( makeSymbol( "CURRENT" ), makeSymbol( "HEAD-ENTRY" ) );
    $sym82$CACHE_CONTENT_ITERATOR_DONE = makeSymbol( "CACHE-CONTENT-ITERATOR-DONE" );
    $sym83$CACHE_CONTENT_ITERATOR_NEXT = makeSymbol( "CACHE-CONTENT-ITERATOR-NEXT" );
    $int84$63 = makeInteger( 63 );
    $sym85$CFASL_INPUT_CACHE = makeSymbol( "CFASL-INPUT-CACHE" );
    $sym86$CFASL_OUTPUT_OBJECT_CACHE_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-CACHE-METHOD" );
    $str87$____ = makeString( " -> " );
    $int88$100 = makeInteger( 100 );
    $sym89$_ = makeSymbol( ">" );
    $sym90$CDR = makeSymbol( "CDR" );
    $float91$0_5 = makeDouble( 0.5 );
    $str92$Content_iterator__A_was_exhausted = makeString( "Content iterator ~A was exhausted at item ~A before the entry iterator ~A!" );
    $str93$The_content_iterator_at_item__A_s = makeString( "The content iterator at item ~A suggests key ~A, but the entry iterator says ~A." );
    $str94$The_content_iterator_at_item__A_s = makeString( "The content iterator at item ~A suggests value ~A, but the entry iterator suggests ~A." );
    $str95$The_content_iterator__A_is_not_ex = makeString( "The content iterator ~A is not exhausted after ~A items, but the entry iterator ~A is done." );
    $str96$The_two_iterators_do_not_seem_to_ = makeString( "The two iterators do not seem to have touched every item: ~A items touched, but cache size is ~A." );
  }

  public static final class $cache_native
      extends
        SubLStructNative
  {
    public SubLObject $capacity;
    public SubLObject $map;
    public SubLObject $head_entry;
    private static final SubLStructDeclNative structDecl;

    public $cache_native()
    {
      this.$capacity = CommonSymbols.NIL;
      this.$map = CommonSymbols.NIL;
      this.$head_entry = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $cache_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$capacity;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$map;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$head_entry;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$capacity = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$map = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$head_entry = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $cache_native.class, $sym0$CACHE, $sym1$CACHE_P, $list2, $list3, new String[] { "$capacity", "$map", "$head_entry"
      }, $list4, $list5, $sym6$CACHE_PRINT );
    }
  }

  public static final class $cache_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $cache_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CACHE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cache_p( arg1 );
    }
  }

  public static final class $cache_entry_native
      extends
        SubLStructNative
  {
    public SubLObject $newer;
    public SubLObject $key;
    public SubLObject $value;
    public SubLObject $older;
    private static final SubLStructDeclNative structDecl;

    public $cache_entry_native()
    {
      this.$newer = CommonSymbols.NIL;
      this.$key = CommonSymbols.NIL;
      this.$value = CommonSymbols.NIL;
      this.$older = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $cache_entry_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$newer;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$key;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$value;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$older;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$newer = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$key = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$value = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$older = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $cache_entry_native.class, $sym24$CACHE_ENTRY, $sym25$CACHE_ENTRY_P, $list26, $list27, new String[] { "$newer", "$key", "$value", "$older"
      }, $list28, $list29, $sym30$CACHE_ENTRY_PRINT );
    }
  }

  public static final class $cache_entry_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $cache_entry_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CACHE-ENTRY-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cache_entry_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 307 ms
 * 
 */