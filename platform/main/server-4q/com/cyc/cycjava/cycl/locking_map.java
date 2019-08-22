package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class locking_map
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.locking_map";
  public static final String myFingerPrint = "70fcfd1edec2c251ea139afe430b22849d81a16a900fcc68bb17bbbeff9dd4e6";
  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 1220L)
  public static SubLSymbol $dtp_locking_map$;
  private static final SubLSymbol $sym0$MAP_P;
  private static final SubLSymbol $sym1$LOCKING_MAP;
  private static final SubLSymbol $sym2$LOCKING_MAP_P;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PRINT_LOCKING_MAP;
  private static final SubLSymbol $sym8$LOCKING_MAP_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$LMAP_MAP;
  private static final SubLSymbol $sym11$_CSETF_LMAP_MAP;
  private static final SubLSymbol $sym12$LMAP_LOCK;
  private static final SubLSymbol $sym13$_CSETF_LMAP_LOCK;
  private static final SubLSymbol $kw14$MAP;
  private static final SubLSymbol $kw15$LOCK;
  private static final SubLString $str16$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw17$BEGIN;
  private static final SubLSymbol $sym18$MAKE_LOCKING_MAP;
  private static final SubLSymbol $kw19$SLOT;
  private static final SubLSymbol $kw20$END;
  private static final SubLSymbol $sym21$VISIT_DEFSTRUCT_OBJECT_LOCKING_MAP_METHOD;
  private static final SubLString $str22$_LOCKING_MAP__A_;
  private static final SubLSymbol $sym23$IS_MAP_OBJECT_P_LOCKING_MAP_METHOD;
  private static final SubLSymbol $sym24$MAP_OBJECT_SIZE_LOCKING_MAP_METHOD;
  private static final SubLSymbol $sym25$MAP_OBJECT_TEST_LOCKING_MAP_METHOD;
  private static final SubLSymbol $sym26$MAP_OBJECT_PUT_LOCKING_MAP_METHOD;
  private static final SubLSymbol $sym27$MAP_OBJECT_GET_LOCKING_MAP_METHOD;
  private static final SubLSymbol $sym28$MAP_OBJECT_GET_WITHOUT_VALUES_LOCKING_MAP_METHOD;
  private static final SubLSymbol $sym29$MAP_OBJECT_REMOVE_LOCKING_MAP_METHOD;
  private static final SubLSymbol $sym30$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_LOCKING_MAP_METHOD;
  private static final SubLSymbol $sym31$MAP_OBJECT_ARBITRARY_KEY_LOCKING_MAP_METHOD;
  private static final SubLSymbol $sym32$NEW_MAP_OBJECT_ITERATOR_LOCKING_MAP_METHOD;
  private static final SubLSymbol $sym33$MAP_OBJECT_REMOVE_ALL_LOCKING_MAP_METHOD;
  private static final SubLSymbol $sym34$MAP_OBJECT_KEYS_LOCKING_MAP_METHOD;
  private static final SubLSymbol $sym35$MAP_OBJECT_VALUES_LOCKING_MAP_METHOD;
  private static final SubLString $str36$Locking_Map;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$WITH_WRITER_LOCK;
  private static final SubLSymbol $sym39$LOCKING_MAP_LOCK;
  private static final SubLSymbol $sym40$WITH_READER_LOCK;
  private static final SubLSymbol $sym41$SXHASH_LOCKING_MAP_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 940L)
  public static SubLObject create_locking_map(final SubLObject map)
  {
    assert NIL != map_utilities.map_p( map ) : map;
    return new_locking_map( map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 1220L)
  public static SubLObject locking_map_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_locking_map( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 1220L)
  public static SubLObject locking_map_p(final SubLObject v_object)
  {
    return ( v_object.getJavaClass() ==$locking_map_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 1220L)
  public static SubLObject lmap_map(final SubLObject v_object)
  {
    assert NIL != locking_map_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 1220L)
  public static SubLObject lmap_lock(final SubLObject v_object)
  {
    assert NIL != locking_map_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 1220L)
  public static SubLObject _csetf_lmap_map(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != locking_map_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 1220L)
  public static SubLObject _csetf_lmap_lock(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != locking_map_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 1220L)
  public static SubLObject make_locking_map(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $locking_map_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw14$MAP ) )
      {
        _csetf_lmap_map( v_new, current_value );
      }
      else if( pcase_var.eql( $kw15$LOCK ) )
      {
        _csetf_lmap_lock( v_new, current_value );
      }
      else
      {
        Errors.error( $str16$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 1220L)
  public static SubLObject visit_defstruct_locking_map(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw17$BEGIN, $sym18$MAKE_LOCKING_MAP, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw19$SLOT, $kw14$MAP, lmap_map( obj ) );
    Functions.funcall( visitor_fn, obj, $kw19$SLOT, $kw15$LOCK, lmap_lock( obj ) );
    Functions.funcall( visitor_fn, obj, $kw20$END, $sym18$MAKE_LOCKING_MAP, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 1220L)
  public static SubLObject visit_defstruct_object_locking_map_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_locking_map( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 1335L)
  public static SubLObject print_locking_map(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str22$_LOCKING_MAP__A_, locking_map_map( v_object ) );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 1495L)
  public static SubLObject is_map_object_p_locking_map_method(final SubLObject v_object)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 1591L)
  public static SubLObject map_object_size_locking_map_method(final SubLObject v_object)
  {
    SubLObject size = NIL;
    final SubLObject rw_lock_var = locking_map_lock( v_object );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      size = map_utilities.map_size( locking_map_map( v_object ) );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    return size;
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 1784L)
  public static SubLObject map_object_test_locking_map_method(final SubLObject v_object)
  {
    SubLObject test = NIL;
    final SubLObject rw_lock_var = locking_map_lock( v_object );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      test = map_utilities.map_test( locking_map_map( v_object ) );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    return test;
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 1977L)
  public static SubLObject map_object_put_locking_map_method(final SubLObject v_object, final SubLObject key, final SubLObject value)
  {
    return locking_map_put( v_object, key, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 2085L)
  public static SubLObject locking_map_put(final SubLObject lmap, final SubLObject key, final SubLObject value)
  {
    SubLObject result = NIL;
    final SubLObject rw_lock_var = locking_map_lock( lmap );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock( rw_lock_var );
      result = map_utilities.map_put( locking_map_map( lmap ), key, value );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_write_lock( rw_lock_var );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 2284L)
  public static SubLObject map_object_get_locking_map_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found)
  {
    return locking_map_get( v_object, key, not_found );
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 2400L)
  public static SubLObject locking_map_get(final SubLObject lmap, final SubLObject key, final SubLObject not_found)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject foundP = NIL;
    final SubLObject rw_lock_var = locking_map_lock( lmap );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      thread.resetMultipleValues();
      final SubLObject result_$1 = map_utilities.map_get( locking_map_map( lmap ), key, not_found );
      final SubLObject foundP_$2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      result = result_$1;
      foundP = foundP_$2;
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    return Values.values( result, foundP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 2654L)
  public static SubLObject map_object_get_without_values_locking_map_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found)
  {
    return locking_map_get_without_values( v_object, key, not_found );
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 2800L)
  public static SubLObject locking_map_get_without_values(final SubLObject lmap, final SubLObject key, final SubLObject not_found)
  {
    SubLObject result = NIL;
    final SubLObject rw_lock_var = locking_map_lock( lmap );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      result = map_utilities.map_get_without_values( locking_map_map( lmap ), key, not_found );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 3037L)
  public static SubLObject map_object_remove_locking_map_method(final SubLObject v_object, final SubLObject key)
  {
    return locking_map_remove( v_object, key );
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 3139L)
  public static SubLObject locking_map_remove(final SubLObject lmap, final SubLObject key)
  {
    SubLObject result = NIL;
    final SubLObject rw_lock_var = locking_map_lock( lmap );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock( rw_lock_var );
      result = map_utilities.map_remove( locking_map_map( lmap ), key );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_write_lock( rw_lock_var );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 3332L)
  public static SubLObject new_map_object_with_same_properties_locking_map_method(final SubLObject v_object, final SubLObject test, final SubLObject size)
  {
    SubLObject result = NIL;
    final SubLObject rw_lock_var = locking_map_lock( v_object );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      result = new_locking_map( map_utilities.new_map_with_same_properties( locking_map_map( v_object ) ) );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 3627L)
  public static SubLObject map_object_arbitrary_key_locking_map_method(final SubLObject v_object)
  {
    SubLObject result = NIL;
    final SubLObject rw_lock_var = locking_map_lock( v_object );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      result = map_utilities.map_arbitrary_key( locking_map_map( v_object ), UNPROVIDED );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 3844L)
  public static SubLObject new_map_object_iterator_locking_map_method(final SubLObject v_object)
  {
    SubLObject result = NIL;
    final SubLObject rw_lock_var = locking_map_lock( v_object );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      result = map_utilities.new_map_iterator( locking_map_map( v_object ) );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 4059L)
  public static SubLObject map_object_remove_all_locking_map_method(final SubLObject v_object)
  {
    return locking_map_remove_all( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 4161L)
  public static SubLObject locking_map_remove_all(final SubLObject lmap)
  {
    SubLObject result = NIL;
    final SubLObject rw_lock_var = locking_map_lock( lmap );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock( rw_lock_var );
      result = map_utilities.map_remove_all( locking_map_map( lmap ) );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_write_lock( rw_lock_var );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 4354L)
  public static SubLObject map_object_keys_locking_map_method(final SubLObject v_object)
  {
    SubLObject result = NIL;
    final SubLObject rw_lock_var = locking_map_lock( v_object );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      result = map_utilities.map_keys( locking_map_map( v_object ) );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 4553L)
  public static SubLObject map_object_values_locking_map_method(final SubLObject v_object)
  {
    SubLObject result = NIL;
    final SubLObject rw_lock_var = locking_map_lock( v_object );
    SubLObject needs_to_releaseP = NIL;
    try
    {
      needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock( rw_lock_var );
      result = map_utilities.map_values( locking_map_map( v_object ) );
    }
    finally
    {
      if( NIL != needs_to_releaseP )
      {
        ReadWriteLocks.rw_lock_release_read_lock( rw_lock_var );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 4756L)
  public static SubLObject new_locking_map(final SubLObject map)
  {
    final SubLObject lmap = make_locking_map( UNPROVIDED );
    _csetf_lmap_map( lmap, map );
    _csetf_lmap_lock( lmap, ReadWriteLocks.new_rw_lock( $str36$Locking_Map ) );
    return lmap;
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 4954L)
  public static SubLObject locking_map_map(final SubLObject map)
  {
    assert NIL != locking_map_p( map ) : map;
    return lmap_map( map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 5061L)
  public static SubLObject locking_map_lock(final SubLObject map)
  {
    assert NIL != locking_map_p( map ) : map;
    return lmap_lock( map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 5158L)
  public static SubLObject with_locking_map_writer_lock(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject map = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    map = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym38$WITH_WRITER_LOCK, ConsesLow.list( ConsesLow.list( $sym39$LOCKING_MAP_LOCK, map ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 5287L)
  public static SubLObject with_locking_map_reader_lock(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject map = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    map = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym40$WITH_READER_LOCK, ConsesLow.list( ConsesLow.list( $sym39$LOCKING_MAP_LOCK, map ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 5416L)
  public static SubLObject sxhash_locking_map_method(final SubLObject v_object)
  {
    return sxhash_locking_map( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/locking-map.lisp", position = 5518L)
  public static SubLObject sxhash_locking_map(final SubLObject map)
  {
    return Sxhash.sxhash( lmap_map( map ) );
  }

  public static SubLObject declare_locking_map_file()
  {
    SubLFiles.declareFunction( me, "create_locking_map", "CREATE-LOCKING-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "locking_map_print_function_trampoline", "LOCKING-MAP-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "locking_map_p", "LOCKING-MAP-P", 1, 0, false );
    new $locking_map_p$UnaryFunction();
    SubLFiles.declareFunction( me, "lmap_map", "LMAP-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "lmap_lock", "LMAP-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lmap_map", "_CSETF-LMAP-MAP", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_lmap_lock", "_CSETF-LMAP-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "make_locking_map", "MAKE-LOCKING-MAP", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_locking_map", "VISIT-DEFSTRUCT-LOCKING-MAP", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_locking_map_method", "VISIT-DEFSTRUCT-OBJECT-LOCKING-MAP-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_locking_map", "PRINT-LOCKING-MAP", 3, 0, false );
    SubLFiles.declareFunction( me, "is_map_object_p_locking_map_method", "IS-MAP-OBJECT-P-LOCKING-MAP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "map_object_size_locking_map_method", "MAP-OBJECT-SIZE-LOCKING-MAP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "map_object_test_locking_map_method", "MAP-OBJECT-TEST-LOCKING-MAP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "map_object_put_locking_map_method", "MAP-OBJECT-PUT-LOCKING-MAP-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "locking_map_put", "LOCKING-MAP-PUT", 3, 0, false );
    SubLFiles.declareFunction( me, "map_object_get_locking_map_method", "MAP-OBJECT-GET-LOCKING-MAP-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "locking_map_get", "LOCKING-MAP-GET", 3, 0, false );
    SubLFiles.declareFunction( me, "map_object_get_without_values_locking_map_method", "MAP-OBJECT-GET-WITHOUT-VALUES-LOCKING-MAP-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "locking_map_get_without_values", "LOCKING-MAP-GET-WITHOUT-VALUES", 3, 0, false );
    SubLFiles.declareFunction( me, "map_object_remove_locking_map_method", "MAP-OBJECT-REMOVE-LOCKING-MAP-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "locking_map_remove", "LOCKING-MAP-REMOVE", 2, 0, false );
    SubLFiles.declareFunction( me, "new_map_object_with_same_properties_locking_map_method", "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-LOCKING-MAP-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "map_object_arbitrary_key_locking_map_method", "MAP-OBJECT-ARBITRARY-KEY-LOCKING-MAP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "new_map_object_iterator_locking_map_method", "NEW-MAP-OBJECT-ITERATOR-LOCKING-MAP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "map_object_remove_all_locking_map_method", "MAP-OBJECT-REMOVE-ALL-LOCKING-MAP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "locking_map_remove_all", "LOCKING-MAP-REMOVE-ALL", 1, 0, false );
    SubLFiles.declareFunction( me, "map_object_keys_locking_map_method", "MAP-OBJECT-KEYS-LOCKING-MAP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "map_object_values_locking_map_method", "MAP-OBJECT-VALUES-LOCKING-MAP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "new_locking_map", "NEW-LOCKING-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "locking_map_map", "LOCKING-MAP-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "locking_map_lock", "LOCKING-MAP-LOCK", 1, 0, false );
    SubLFiles.declareMacro( me, "with_locking_map_writer_lock", "WITH-LOCKING-MAP-WRITER-LOCK" );
    SubLFiles.declareMacro( me, "with_locking_map_reader_lock", "WITH-LOCKING-MAP-READER-LOCK" );
    SubLFiles.declareFunction( me, "sxhash_locking_map_method", "SXHASH-LOCKING-MAP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_locking_map", "SXHASH-LOCKING-MAP", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_locking_map_file()
  {
    $dtp_locking_map$ = SubLFiles.defconstant( "*DTP-LOCKING-MAP*", $sym1$LOCKING_MAP );
    return NIL;
  }

  public static SubLObject setup_locking_map_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), Symbols.symbol_function( $sym8$LOCKING_MAP_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list9 );
    Structures.def_csetf( $sym10$LMAP_MAP, $sym11$_CSETF_LMAP_MAP );
    Structures.def_csetf( $sym12$LMAP_LOCK, $sym13$_CSETF_LMAP_LOCK );
    Equality.identity( $sym1$LOCKING_MAP );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), Symbols.symbol_function( $sym21$VISIT_DEFSTRUCT_OBJECT_LOCKING_MAP_METHOD ) );
    utilities_macros.note_funcall_helper_function( $sym7$PRINT_LOCKING_MAP );
    Structures.register_method( map_utilities.$is_map_object_p_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), Symbols.symbol_function( $sym23$IS_MAP_OBJECT_P_LOCKING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$map_object_size_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), Symbols.symbol_function( $sym24$MAP_OBJECT_SIZE_LOCKING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$map_object_test_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), Symbols.symbol_function( $sym25$MAP_OBJECT_TEST_LOCKING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$map_object_put_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), Symbols.symbol_function( $sym26$MAP_OBJECT_PUT_LOCKING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$map_object_get_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), Symbols.symbol_function( $sym27$MAP_OBJECT_GET_LOCKING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$map_object_get_without_values_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), Symbols.symbol_function(
        $sym28$MAP_OBJECT_GET_WITHOUT_VALUES_LOCKING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$map_object_remove_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), Symbols.symbol_function( $sym29$MAP_OBJECT_REMOVE_LOCKING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$new_map_object_with_same_properties_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), Symbols.symbol_function(
        $sym30$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_LOCKING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$map_object_arbitrary_key_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), Symbols.symbol_function( $sym31$MAP_OBJECT_ARBITRARY_KEY_LOCKING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$new_map_object_iterator_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), Symbols.symbol_function( $sym32$NEW_MAP_OBJECT_ITERATOR_LOCKING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$map_object_remove_all_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), Symbols.symbol_function( $sym33$MAP_OBJECT_REMOVE_ALL_LOCKING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$map_object_keys_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), Symbols.symbol_function( $sym34$MAP_OBJECT_KEYS_LOCKING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$map_object_values_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), Symbols.symbol_function( $sym35$MAP_OBJECT_VALUES_LOCKING_MAP_METHOD ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_locking_map$.getGlobalValue(), Symbols.symbol_function( $sym41$SXHASH_LOCKING_MAP_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_locking_map_file();
  }

  @Override
  public void initializeVariables()
  {
    init_locking_map_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_locking_map_file();
  }
  static
  {
    me = new locking_map();
    $dtp_locking_map$ = null;
    $sym0$MAP_P = makeSymbol( "MAP-P" );
    $sym1$LOCKING_MAP = makeSymbol( "LOCKING-MAP" );
    $sym2$LOCKING_MAP_P = makeSymbol( "LOCKING-MAP-P" );
    $list3 = ConsesLow.list( makeSymbol( "MAP" ), makeSymbol( "LOCK" ) );
    $list4 = ConsesLow.list( makeKeyword( "MAP" ), makeKeyword( "LOCK" ) );
    $list5 = ConsesLow.list( makeSymbol( "LMAP-MAP" ), makeSymbol( "LMAP-LOCK" ) );
    $list6 = ConsesLow.list( makeSymbol( "_CSETF-LMAP-MAP" ), makeSymbol( "_CSETF-LMAP-LOCK" ) );
    $sym7$PRINT_LOCKING_MAP = makeSymbol( "PRINT-LOCKING-MAP" );
    $sym8$LOCKING_MAP_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "LOCKING-MAP-PRINT-FUNCTION-TRAMPOLINE" );
    $list9 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "LOCKING-MAP-P" ) );
    $sym10$LMAP_MAP = makeSymbol( "LMAP-MAP" );
    $sym11$_CSETF_LMAP_MAP = makeSymbol( "_CSETF-LMAP-MAP" );
    $sym12$LMAP_LOCK = makeSymbol( "LMAP-LOCK" );
    $sym13$_CSETF_LMAP_LOCK = makeSymbol( "_CSETF-LMAP-LOCK" );
    $kw14$MAP = makeKeyword( "MAP" );
    $kw15$LOCK = makeKeyword( "LOCK" );
    $str16$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw17$BEGIN = makeKeyword( "BEGIN" );
    $sym18$MAKE_LOCKING_MAP = makeSymbol( "MAKE-LOCKING-MAP" );
    $kw19$SLOT = makeKeyword( "SLOT" );
    $kw20$END = makeKeyword( "END" );
    $sym21$VISIT_DEFSTRUCT_OBJECT_LOCKING_MAP_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-LOCKING-MAP-METHOD" );
    $str22$_LOCKING_MAP__A_ = makeString( "<LOCKING-MAP ~A>" );
    $sym23$IS_MAP_OBJECT_P_LOCKING_MAP_METHOD = makeSymbol( "IS-MAP-OBJECT-P-LOCKING-MAP-METHOD" );
    $sym24$MAP_OBJECT_SIZE_LOCKING_MAP_METHOD = makeSymbol( "MAP-OBJECT-SIZE-LOCKING-MAP-METHOD" );
    $sym25$MAP_OBJECT_TEST_LOCKING_MAP_METHOD = makeSymbol( "MAP-OBJECT-TEST-LOCKING-MAP-METHOD" );
    $sym26$MAP_OBJECT_PUT_LOCKING_MAP_METHOD = makeSymbol( "MAP-OBJECT-PUT-LOCKING-MAP-METHOD" );
    $sym27$MAP_OBJECT_GET_LOCKING_MAP_METHOD = makeSymbol( "MAP-OBJECT-GET-LOCKING-MAP-METHOD" );
    $sym28$MAP_OBJECT_GET_WITHOUT_VALUES_LOCKING_MAP_METHOD = makeSymbol( "MAP-OBJECT-GET-WITHOUT-VALUES-LOCKING-MAP-METHOD" );
    $sym29$MAP_OBJECT_REMOVE_LOCKING_MAP_METHOD = makeSymbol( "MAP-OBJECT-REMOVE-LOCKING-MAP-METHOD" );
    $sym30$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_LOCKING_MAP_METHOD = makeSymbol( "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-LOCKING-MAP-METHOD" );
    $sym31$MAP_OBJECT_ARBITRARY_KEY_LOCKING_MAP_METHOD = makeSymbol( "MAP-OBJECT-ARBITRARY-KEY-LOCKING-MAP-METHOD" );
    $sym32$NEW_MAP_OBJECT_ITERATOR_LOCKING_MAP_METHOD = makeSymbol( "NEW-MAP-OBJECT-ITERATOR-LOCKING-MAP-METHOD" );
    $sym33$MAP_OBJECT_REMOVE_ALL_LOCKING_MAP_METHOD = makeSymbol( "MAP-OBJECT-REMOVE-ALL-LOCKING-MAP-METHOD" );
    $sym34$MAP_OBJECT_KEYS_LOCKING_MAP_METHOD = makeSymbol( "MAP-OBJECT-KEYS-LOCKING-MAP-METHOD" );
    $sym35$MAP_OBJECT_VALUES_LOCKING_MAP_METHOD = makeSymbol( "MAP-OBJECT-VALUES-LOCKING-MAP-METHOD" );
    $str36$Locking_Map = makeString( "Locking Map" );
    $list37 = ConsesLow.list( makeSymbol( "MAP" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym38$WITH_WRITER_LOCK = makeSymbol( "WITH-WRITER-LOCK" );
    $sym39$LOCKING_MAP_LOCK = makeSymbol( "LOCKING-MAP-LOCK" );
    $sym40$WITH_READER_LOCK = makeSymbol( "WITH-READER-LOCK" );
    $sym41$SXHASH_LOCKING_MAP_METHOD = makeSymbol( "SXHASH-LOCKING-MAP-METHOD" );
  }

  public static final class $locking_map_native
      extends
        SubLStructNative
  {
    public SubLObject $map;
    public SubLObject $lock;
    private static final SubLStructDeclNative structDecl;

    public $locking_map_native()
    {
      this.$map = CommonSymbols.NIL;
      this.$lock = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $locking_map_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$map;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$lock;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$map = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$lock = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $locking_map_native.class, $sym1$LOCKING_MAP, $sym2$LOCKING_MAP_P, $list3, $list4, new String[] { "$map", "$lock"
      }, $list5, $list6, $sym7$PRINT_LOCKING_MAP );
    }
  }

  public static final class $locking_map_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $locking_map_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "LOCKING-MAP-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return locking_map_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 153 ms
 * 
 */