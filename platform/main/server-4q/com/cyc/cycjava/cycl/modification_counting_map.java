package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class modification_counting_map
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.modification_counting_map";
  public static final String myFingerPrint = "9646675d5d0d965bddc6b59dbbe3f5d139563b5da75488c72108496c3cb83f49";
  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 1454L)
  public static SubLSymbol $dtp_modification_counting_map$;
  private static final SubLSymbol $sym0$MAP_P;
  private static final SubLSymbol $sym1$MODIFICATION_COUNTING_MAP;
  private static final SubLSymbol $sym2$MODIFICATION_COUNTING_MAP_P;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PRINT_MODIFICATION_COUNTING_MAP;
  private static final SubLSymbol $sym8$MODIFICATION_COUNTING_MAP_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$MCMAP_MAP;
  private static final SubLSymbol $sym11$_CSETF_MCMAP_MAP;
  private static final SubLSymbol $sym12$MCMAP_PUT_COUNT;
  private static final SubLSymbol $sym13$_CSETF_MCMAP_PUT_COUNT;
  private static final SubLSymbol $sym14$MCMAP_REMOVE_COUNT;
  private static final SubLSymbol $sym15$_CSETF_MCMAP_REMOVE_COUNT;
  private static final SubLSymbol $kw16$MAP;
  private static final SubLSymbol $kw17$PUT_COUNT;
  private static final SubLSymbol $kw18$REMOVE_COUNT;
  private static final SubLString $str19$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw20$BEGIN;
  private static final SubLSymbol $sym21$MAKE_MODIFICATION_COUNTING_MAP;
  private static final SubLSymbol $kw22$SLOT;
  private static final SubLSymbol $kw23$END;
  private static final SubLSymbol $sym24$VISIT_DEFSTRUCT_OBJECT_MODIFICATION_COUNTING_MAP_METHOD;
  private static final SubLString $str25$_MODIFICATION_COUNTING_MAP__A_;
  private static final SubLSymbol $sym26$IS_MAP_OBJECT_P_MODIFICATION_COUNTING_MAP_METHOD;
  private static final SubLSymbol $sym27$MAP_OBJECT_SIZE_MODIFICATION_COUNTING_MAP_METHOD;
  private static final SubLSymbol $sym28$MAP_OBJECT_TEST_MODIFICATION_COUNTING_MAP_METHOD;
  private static final SubLSymbol $sym29$MAP_OBJECT_PUT_MODIFICATION_COUNTING_MAP_METHOD;
  private static final SubLSymbol $sym30$MAP_OBJECT_GET_MODIFICATION_COUNTING_MAP_METHOD;
  private static final SubLSymbol $sym31$MAP_OBJECT_GET_WITHOUT_VALUES_MODIFICATION_COUNTING_MAP_METHOD;
  private static final SubLSymbol $sym32$MAP_OBJECT_REMOVE_MODIFICATION_COUNTING_MAP_METHOD;
  private static final SubLSymbol $sym33$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_MODIFICATION_COUNTING_MAP_MET;
  private static final SubLSymbol $sym34$MAP_OBJECT_ARBITRARY_KEY_MODIFICATION_COUNTING_MAP_METHOD;
  private static final SubLSymbol $sym35$NEW_MAP_OBJECT_ITERATOR_MODIFICATION_COUNTING_MAP_METHOD;
  private static final SubLSymbol $sym36$MAP_OBJECT_REMOVE_ALL_MODIFICATION_COUNTING_MAP_METHOD;
  private static final SubLSymbol $sym37$MAP_OBJECT_KEYS_MODIFICATION_COUNTING_MAP_METHOD;
  private static final SubLSymbol $sym38$MAP_OBJECT_VALUES_MODIFICATION_COUNTING_MAP_METHOD;
  private static final SubLSymbol $sym39$SXHASH_MODIFICATION_COUNTING_MAP_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 1081L)
  public static SubLObject create_modification_counting_map(final SubLObject map)
  {
    assert NIL != map_utilities.map_p( map ) : map;
    return new_modification_counting_map( map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 1454L)
  public static SubLObject modification_counting_map_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_modification_counting_map( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 1454L)
  public static SubLObject modification_counting_map_p(final SubLObject v_object)
  {
    return ( v_object.getJavaClass() ==$modification_counting_map_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 1454L)
  public static SubLObject mcmap_map(final SubLObject v_object)
  {
    assert NIL != modification_counting_map_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 1454L)
  public static SubLObject mcmap_put_count(final SubLObject v_object)
  {
    assert NIL != modification_counting_map_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 1454L)
  public static SubLObject mcmap_remove_count(final SubLObject v_object)
  {
    assert NIL != modification_counting_map_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 1454L)
  public static SubLObject _csetf_mcmap_map(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != modification_counting_map_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 1454L)
  public static SubLObject _csetf_mcmap_put_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != modification_counting_map_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 1454L)
  public static SubLObject _csetf_mcmap_remove_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != modification_counting_map_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 1454L)
  public static SubLObject make_modification_counting_map(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $modification_counting_map_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw16$MAP ) )
      {
        _csetf_mcmap_map( v_new, current_value );
      }
      else if( pcase_var.eql( $kw17$PUT_COUNT ) )
      {
        _csetf_mcmap_put_count( v_new, current_value );
      }
      else if( pcase_var.eql( $kw18$REMOVE_COUNT ) )
      {
        _csetf_mcmap_remove_count( v_new, current_value );
      }
      else
      {
        Errors.error( $str19$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 1454L)
  public static SubLObject visit_defstruct_modification_counting_map(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw20$BEGIN, $sym21$MAKE_MODIFICATION_COUNTING_MAP, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw22$SLOT, $kw16$MAP, mcmap_map( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$SLOT, $kw17$PUT_COUNT, mcmap_put_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw22$SLOT, $kw18$REMOVE_COUNT, mcmap_remove_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw23$END, $sym21$MAKE_MODIFICATION_COUNTING_MAP, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 1454L)
  public static SubLObject visit_defstruct_object_modification_counting_map_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_modification_counting_map( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 1618L)
  public static SubLObject print_modification_counting_map(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str25$_MODIFICATION_COUNTING_MAP__A_, modification_counting_map_map( v_object ) );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 1820L)
  public static SubLObject is_map_object_p_modification_counting_map_method(final SubLObject v_object)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 1930L)
  public static SubLObject map_object_size_modification_counting_map_method(final SubLObject v_object)
  {
    return map_utilities.map_size( modification_counting_map_map( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 2058L)
  public static SubLObject map_object_test_modification_counting_map_method(final SubLObject v_object)
  {
    return map_utilities.map_test( modification_counting_map_map( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 2186L)
  public static SubLObject map_object_put_modification_counting_map_method(final SubLObject v_object, final SubLObject key, final SubLObject value)
  {
    return modification_counting_map_put( v_object, key, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 2322L)
  public static SubLObject modification_counting_map_put(final SubLObject mcmap, final SubLObject key, final SubLObject value)
  {
    mcmap_note_put( mcmap );
    return map_utilities.map_put( modification_counting_map_map( mcmap ), key, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 2479L)
  public static SubLObject map_object_get_modification_counting_map_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found)
  {
    return modification_counting_map_get( v_object, key, not_found );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 2623L)
  public static SubLObject modification_counting_map_get(final SubLObject mcmap, final SubLObject key, final SubLObject not_found)
  {
    return map_utilities.map_get( modification_counting_map_map( mcmap ), key, not_found );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 2763L)
  public static SubLObject map_object_get_without_values_modification_counting_map_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found)
  {
    return modification_counting_map_get_without_values( v_object, key, not_found );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 2937L)
  public static SubLObject modification_counting_map_get_without_values(final SubLObject mcmap, final SubLObject key, final SubLObject not_found)
  {
    return map_utilities.map_get_without_values( modification_counting_map_map( mcmap ), key, not_found );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 3107L)
  public static SubLObject map_object_remove_modification_counting_map_method(final SubLObject v_object, final SubLObject key)
  {
    return modification_counting_map_remove( v_object, key );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 3237L)
  public static SubLObject modification_counting_map_remove(final SubLObject mcmap, final SubLObject key)
  {
    mcmap_note_remove( mcmap );
    return map_utilities.map_remove( modification_counting_map_map( mcmap ), key );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 3391L)
  public static SubLObject new_map_object_with_same_properties_modification_counting_map_method(final SubLObject v_object, final SubLObject test, final SubLObject size)
  {
    return new_modification_counting_map( map_utilities.new_map_with_same_properties( modification_counting_map_map( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 3623L)
  public static SubLObject map_object_arbitrary_key_modification_counting_map_method(final SubLObject v_object)
  {
    return map_utilities.map_arbitrary_key( modification_counting_map_map( v_object ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 3769L)
  public static SubLObject new_map_object_iterator_modification_counting_map_method(final SubLObject v_object)
  {
    return map_utilities.new_map_iterator( modification_counting_map_map( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 3913L)
  public static SubLObject map_object_remove_all_modification_counting_map_method(final SubLObject v_object)
  {
    return modification_counting_map_remove_all( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 4043L)
  public static SubLObject modification_counting_map_remove_all(final SubLObject mcmap)
  {
    return map_utilities.map_remove_all( modification_counting_map_map( mcmap ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 4169L)
  public static SubLObject map_object_keys_modification_counting_map_method(final SubLObject v_object)
  {
    return map_utilities.map_keys( modification_counting_map_map( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 4297L)
  public static SubLObject map_object_values_modification_counting_map_method(final SubLObject v_object)
  {
    return map_utilities.map_values( modification_counting_map_map( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 4429L)
  public static SubLObject new_modification_counting_map(final SubLObject map)
  {
    final SubLObject mcmap = make_modification_counting_map( UNPROVIDED );
    _csetf_mcmap_map( mcmap, map );
    _csetf_mcmap_put_count( mcmap, ZERO_INTEGER );
    _csetf_mcmap_remove_count( mcmap, ZERO_INTEGER );
    return mcmap;
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 4681L)
  public static SubLObject modification_counting_map_map(final SubLObject map)
  {
    assert NIL != modification_counting_map_p( map ) : map;
    return mcmap_map( map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 4818L)
  public static SubLObject modification_counting_map_put_count(final SubLObject map)
  {
    assert NIL != modification_counting_map_p( map ) : map;
    return mcmap_put_count( map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 4954L)
  public static SubLObject mcmap_note_put(final SubLObject map)
  {
    _csetf_mcmap_put_count( map, Numbers.add( mcmap_put_count( map ), ONE_INTEGER ) );
    return mcmap_put_count( map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 5054L)
  public static SubLObject modification_counting_map_remove_count(final SubLObject map)
  {
    assert NIL != modification_counting_map_p( map ) : map;
    return mcmap_remove_count( map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 5196L)
  public static SubLObject mcmap_note_remove(final SubLObject map)
  {
    _csetf_mcmap_remove_count( map, Numbers.add( mcmap_remove_count( map ), ONE_INTEGER ) );
    return mcmap_remove_count( map );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 5305L)
  public static SubLObject sxhash_modification_counting_map_method(final SubLObject v_object)
  {
    return sxhash_modification_counting_map( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/modification-counting-map.lisp", position = 5435L)
  public static SubLObject sxhash_modification_counting_map(final SubLObject map)
  {
    return Sxhash.sxhash( mcmap_map( map ) );
  }

  public static SubLObject declare_modification_counting_map_file()
  {
    SubLFiles.declareFunction( me, "create_modification_counting_map", "CREATE-MODIFICATION-COUNTING-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "modification_counting_map_print_function_trampoline", "MODIFICATION-COUNTING-MAP-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "modification_counting_map_p", "MODIFICATION-COUNTING-MAP-P", 1, 0, false );
    new $modification_counting_map_p$UnaryFunction();
    SubLFiles.declareFunction( me, "mcmap_map", "MCMAP-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "mcmap_put_count", "MCMAP-PUT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "mcmap_remove_count", "MCMAP-REMOVE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_mcmap_map", "_CSETF-MCMAP-MAP", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_mcmap_put_count", "_CSETF-MCMAP-PUT-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_mcmap_remove_count", "_CSETF-MCMAP-REMOVE-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "make_modification_counting_map", "MAKE-MODIFICATION-COUNTING-MAP", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_modification_counting_map", "VISIT-DEFSTRUCT-MODIFICATION-COUNTING-MAP", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_modification_counting_map_method", "VISIT-DEFSTRUCT-OBJECT-MODIFICATION-COUNTING-MAP-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_modification_counting_map", "PRINT-MODIFICATION-COUNTING-MAP", 3, 0, false );
    SubLFiles.declareFunction( me, "is_map_object_p_modification_counting_map_method", "IS-MAP-OBJECT-P-MODIFICATION-COUNTING-MAP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "map_object_size_modification_counting_map_method", "MAP-OBJECT-SIZE-MODIFICATION-COUNTING-MAP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "map_object_test_modification_counting_map_method", "MAP-OBJECT-TEST-MODIFICATION-COUNTING-MAP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "map_object_put_modification_counting_map_method", "MAP-OBJECT-PUT-MODIFICATION-COUNTING-MAP-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "modification_counting_map_put", "MODIFICATION-COUNTING-MAP-PUT", 3, 0, false );
    SubLFiles.declareFunction( me, "map_object_get_modification_counting_map_method", "MAP-OBJECT-GET-MODIFICATION-COUNTING-MAP-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "modification_counting_map_get", "MODIFICATION-COUNTING-MAP-GET", 3, 0, false );
    SubLFiles.declareFunction( me, "map_object_get_without_values_modification_counting_map_method", "MAP-OBJECT-GET-WITHOUT-VALUES-MODIFICATION-COUNTING-MAP-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "modification_counting_map_get_without_values", "MODIFICATION-COUNTING-MAP-GET-WITHOUT-VALUES", 3, 0, false );
    SubLFiles.declareFunction( me, "map_object_remove_modification_counting_map_method", "MAP-OBJECT-REMOVE-MODIFICATION-COUNTING-MAP-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "modification_counting_map_remove", "MODIFICATION-COUNTING-MAP-REMOVE", 2, 0, false );
    SubLFiles.declareFunction( me, "new_map_object_with_same_properties_modification_counting_map_method", "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-MODIFICATION-COUNTING-MAP-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "map_object_arbitrary_key_modification_counting_map_method", "MAP-OBJECT-ARBITRARY-KEY-MODIFICATION-COUNTING-MAP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "new_map_object_iterator_modification_counting_map_method", "NEW-MAP-OBJECT-ITERATOR-MODIFICATION-COUNTING-MAP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "map_object_remove_all_modification_counting_map_method", "MAP-OBJECT-REMOVE-ALL-MODIFICATION-COUNTING-MAP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "modification_counting_map_remove_all", "MODIFICATION-COUNTING-MAP-REMOVE-ALL", 1, 0, false );
    SubLFiles.declareFunction( me, "map_object_keys_modification_counting_map_method", "MAP-OBJECT-KEYS-MODIFICATION-COUNTING-MAP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "map_object_values_modification_counting_map_method", "MAP-OBJECT-VALUES-MODIFICATION-COUNTING-MAP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "new_modification_counting_map", "NEW-MODIFICATION-COUNTING-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "modification_counting_map_map", "MODIFICATION-COUNTING-MAP-MAP", 1, 0, false );
    SubLFiles.declareFunction( me, "modification_counting_map_put_count", "MODIFICATION-COUNTING-MAP-PUT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "mcmap_note_put", "MCMAP-NOTE-PUT", 1, 0, false );
    SubLFiles.declareFunction( me, "modification_counting_map_remove_count", "MODIFICATION-COUNTING-MAP-REMOVE-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "mcmap_note_remove", "MCMAP-NOTE-REMOVE", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_modification_counting_map_method", "SXHASH-MODIFICATION-COUNTING-MAP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_modification_counting_map", "SXHASH-MODIFICATION-COUNTING-MAP", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_modification_counting_map_file()
  {
    $dtp_modification_counting_map$ = SubLFiles.defconstant( "*DTP-MODIFICATION-COUNTING-MAP*", $sym1$MODIFICATION_COUNTING_MAP );
    return NIL;
  }

  public static SubLObject setup_modification_counting_map_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), Symbols.symbol_function(
        $sym8$MODIFICATION_COUNTING_MAP_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list9 );
    Structures.def_csetf( $sym10$MCMAP_MAP, $sym11$_CSETF_MCMAP_MAP );
    Structures.def_csetf( $sym12$MCMAP_PUT_COUNT, $sym13$_CSETF_MCMAP_PUT_COUNT );
    Structures.def_csetf( $sym14$MCMAP_REMOVE_COUNT, $sym15$_CSETF_MCMAP_REMOVE_COUNT );
    Equality.identity( $sym1$MODIFICATION_COUNTING_MAP );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), Symbols.symbol_function(
        $sym24$VISIT_DEFSTRUCT_OBJECT_MODIFICATION_COUNTING_MAP_METHOD ) );
    utilities_macros.note_funcall_helper_function( $sym7$PRINT_MODIFICATION_COUNTING_MAP );
    Structures.register_method( map_utilities.$is_map_object_p_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), Symbols.symbol_function(
        $sym26$IS_MAP_OBJECT_P_MODIFICATION_COUNTING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$map_object_size_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), Symbols.symbol_function(
        $sym27$MAP_OBJECT_SIZE_MODIFICATION_COUNTING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$map_object_test_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), Symbols.symbol_function(
        $sym28$MAP_OBJECT_TEST_MODIFICATION_COUNTING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$map_object_put_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), Symbols.symbol_function(
        $sym29$MAP_OBJECT_PUT_MODIFICATION_COUNTING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$map_object_get_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), Symbols.symbol_function(
        $sym30$MAP_OBJECT_GET_MODIFICATION_COUNTING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$map_object_get_without_values_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), Symbols.symbol_function(
        $sym31$MAP_OBJECT_GET_WITHOUT_VALUES_MODIFICATION_COUNTING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$map_object_remove_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), Symbols.symbol_function(
        $sym32$MAP_OBJECT_REMOVE_MODIFICATION_COUNTING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$new_map_object_with_same_properties_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), Symbols.symbol_function(
        $sym33$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_MODIFICATION_COUNTING_MAP_MET ) );
    Structures.register_method( map_utilities.$map_object_arbitrary_key_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), Symbols.symbol_function(
        $sym34$MAP_OBJECT_ARBITRARY_KEY_MODIFICATION_COUNTING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$new_map_object_iterator_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), Symbols.symbol_function(
        $sym35$NEW_MAP_OBJECT_ITERATOR_MODIFICATION_COUNTING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$map_object_remove_all_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), Symbols.symbol_function(
        $sym36$MAP_OBJECT_REMOVE_ALL_MODIFICATION_COUNTING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$map_object_keys_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), Symbols.symbol_function(
        $sym37$MAP_OBJECT_KEYS_MODIFICATION_COUNTING_MAP_METHOD ) );
    Structures.register_method( map_utilities.$map_object_values_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), Symbols.symbol_function(
        $sym38$MAP_OBJECT_VALUES_MODIFICATION_COUNTING_MAP_METHOD ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_modification_counting_map$.getGlobalValue(), Symbols.symbol_function( $sym39$SXHASH_MODIFICATION_COUNTING_MAP_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_modification_counting_map_file();
  }

  @Override
  public void initializeVariables()
  {
    init_modification_counting_map_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_modification_counting_map_file();
  }
  static
  {
    me = new modification_counting_map();
    $dtp_modification_counting_map$ = null;
    $sym0$MAP_P = makeSymbol( "MAP-P" );
    $sym1$MODIFICATION_COUNTING_MAP = makeSymbol( "MODIFICATION-COUNTING-MAP" );
    $sym2$MODIFICATION_COUNTING_MAP_P = makeSymbol( "MODIFICATION-COUNTING-MAP-P" );
    $list3 = ConsesLow.list( makeSymbol( "MAP" ), makeSymbol( "PUT-COUNT" ), makeSymbol( "REMOVE-COUNT" ) );
    $list4 = ConsesLow.list( makeKeyword( "MAP" ), makeKeyword( "PUT-COUNT" ), makeKeyword( "REMOVE-COUNT" ) );
    $list5 = ConsesLow.list( makeSymbol( "MCMAP-MAP" ), makeSymbol( "MCMAP-PUT-COUNT" ), makeSymbol( "MCMAP-REMOVE-COUNT" ) );
    $list6 = ConsesLow.list( makeSymbol( "_CSETF-MCMAP-MAP" ), makeSymbol( "_CSETF-MCMAP-PUT-COUNT" ), makeSymbol( "_CSETF-MCMAP-REMOVE-COUNT" ) );
    $sym7$PRINT_MODIFICATION_COUNTING_MAP = makeSymbol( "PRINT-MODIFICATION-COUNTING-MAP" );
    $sym8$MODIFICATION_COUNTING_MAP_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "MODIFICATION-COUNTING-MAP-PRINT-FUNCTION-TRAMPOLINE" );
    $list9 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "MODIFICATION-COUNTING-MAP-P" ) );
    $sym10$MCMAP_MAP = makeSymbol( "MCMAP-MAP" );
    $sym11$_CSETF_MCMAP_MAP = makeSymbol( "_CSETF-MCMAP-MAP" );
    $sym12$MCMAP_PUT_COUNT = makeSymbol( "MCMAP-PUT-COUNT" );
    $sym13$_CSETF_MCMAP_PUT_COUNT = makeSymbol( "_CSETF-MCMAP-PUT-COUNT" );
    $sym14$MCMAP_REMOVE_COUNT = makeSymbol( "MCMAP-REMOVE-COUNT" );
    $sym15$_CSETF_MCMAP_REMOVE_COUNT = makeSymbol( "_CSETF-MCMAP-REMOVE-COUNT" );
    $kw16$MAP = makeKeyword( "MAP" );
    $kw17$PUT_COUNT = makeKeyword( "PUT-COUNT" );
    $kw18$REMOVE_COUNT = makeKeyword( "REMOVE-COUNT" );
    $str19$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw20$BEGIN = makeKeyword( "BEGIN" );
    $sym21$MAKE_MODIFICATION_COUNTING_MAP = makeSymbol( "MAKE-MODIFICATION-COUNTING-MAP" );
    $kw22$SLOT = makeKeyword( "SLOT" );
    $kw23$END = makeKeyword( "END" );
    $sym24$VISIT_DEFSTRUCT_OBJECT_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-MODIFICATION-COUNTING-MAP-METHOD" );
    $str25$_MODIFICATION_COUNTING_MAP__A_ = makeString( "<MODIFICATION-COUNTING-MAP ~A>" );
    $sym26$IS_MAP_OBJECT_P_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol( "IS-MAP-OBJECT-P-MODIFICATION-COUNTING-MAP-METHOD" );
    $sym27$MAP_OBJECT_SIZE_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol( "MAP-OBJECT-SIZE-MODIFICATION-COUNTING-MAP-METHOD" );
    $sym28$MAP_OBJECT_TEST_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol( "MAP-OBJECT-TEST-MODIFICATION-COUNTING-MAP-METHOD" );
    $sym29$MAP_OBJECT_PUT_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol( "MAP-OBJECT-PUT-MODIFICATION-COUNTING-MAP-METHOD" );
    $sym30$MAP_OBJECT_GET_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol( "MAP-OBJECT-GET-MODIFICATION-COUNTING-MAP-METHOD" );
    $sym31$MAP_OBJECT_GET_WITHOUT_VALUES_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol( "MAP-OBJECT-GET-WITHOUT-VALUES-MODIFICATION-COUNTING-MAP-METHOD" );
    $sym32$MAP_OBJECT_REMOVE_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol( "MAP-OBJECT-REMOVE-MODIFICATION-COUNTING-MAP-METHOD" );
    $sym33$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_MODIFICATION_COUNTING_MAP_MET = makeSymbol( "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-MODIFICATION-COUNTING-MAP-METHOD" );
    $sym34$MAP_OBJECT_ARBITRARY_KEY_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol( "MAP-OBJECT-ARBITRARY-KEY-MODIFICATION-COUNTING-MAP-METHOD" );
    $sym35$NEW_MAP_OBJECT_ITERATOR_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol( "NEW-MAP-OBJECT-ITERATOR-MODIFICATION-COUNTING-MAP-METHOD" );
    $sym36$MAP_OBJECT_REMOVE_ALL_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol( "MAP-OBJECT-REMOVE-ALL-MODIFICATION-COUNTING-MAP-METHOD" );
    $sym37$MAP_OBJECT_KEYS_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol( "MAP-OBJECT-KEYS-MODIFICATION-COUNTING-MAP-METHOD" );
    $sym38$MAP_OBJECT_VALUES_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol( "MAP-OBJECT-VALUES-MODIFICATION-COUNTING-MAP-METHOD" );
    $sym39$SXHASH_MODIFICATION_COUNTING_MAP_METHOD = makeSymbol( "SXHASH-MODIFICATION-COUNTING-MAP-METHOD" );
  }

  public static final class $modification_counting_map_native
      extends
        SubLStructNative
  {
    public SubLObject $map;
    public SubLObject $put_count;
    public SubLObject $remove_count;
    private static final SubLStructDeclNative structDecl;

    public $modification_counting_map_native()
    {
      this.$map = CommonSymbols.NIL;
      this.$put_count = CommonSymbols.NIL;
      this.$remove_count = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $modification_counting_map_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$map;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$put_count;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$remove_count;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$map = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$put_count = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$remove_count = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $modification_counting_map_native.class, $sym1$MODIFICATION_COUNTING_MAP, $sym2$MODIFICATION_COUNTING_MAP_P, $list3, $list4, new String[] { "$map", "$put_count",
        "$remove_count"
      }, $list5, $list6, $sym7$PRINT_MODIFICATION_COUNTING_MAP );
    }
  }

  public static final class $modification_counting_map_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $modification_counting_map_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "MODIFICATION-COUNTING-MAP-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return modification_counting_map_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 147 ms
 * 
 */