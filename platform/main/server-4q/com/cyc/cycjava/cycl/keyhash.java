package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class keyhash
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.keyhash";
  public static final String myFingerPrint = "3ee8348a59c71557c9acc373ecdb23c285615a19693f590f7440f7b0b52c18f8";
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2342L)
  public static SubLSymbol $dtp_keyhash$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3179L)
  private static SubLSymbol $keyhash_empty_key$;
  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10926L)
  private static SubLSymbol $cfasl_opcode_keyhash$;
  private static final SubLSymbol $sym0$KEYHASH;
  private static final SubLSymbol $sym1$KEYHASH_P;
  private static final SubLInteger $int2$137;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PRINT_KEY_HASH;
  private static final SubLSymbol $sym8$KEYHASH_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$KHASH_NODES;
  private static final SubLSymbol $sym11$_CSETF_KHASH_NODES;
  private static final SubLSymbol $sym12$KHASH_TEST;
  private static final SubLSymbol $sym13$_CSETF_KHASH_TEST;
  private static final SubLSymbol $sym14$KHASH_COUNT;
  private static final SubLSymbol $sym15$_CSETF_KHASH_COUNT;
  private static final SubLSymbol $sym16$KHASH_HASH_STASH;
  private static final SubLSymbol $sym17$_CSETF_KHASH_HASH_STASH;
  private static final SubLSymbol $kw18$NODES;
  private static final SubLSymbol $kw19$TEST;
  private static final SubLSymbol $kw20$COUNT;
  private static final SubLSymbol $kw21$HASH_STASH;
  private static final SubLString $str22$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw23$BEGIN;
  private static final SubLSymbol $sym24$MAKE_KEYHASH;
  private static final SubLSymbol $kw25$SLOT;
  private static final SubLSymbol $kw26$END;
  private static final SubLSymbol $sym27$VISIT_DEFSTRUCT_OBJECT_KEYHASH_METHOD;
  private static final SubLString $str28$_;
  private static final SubLString $str29$_;
  private static final SubLSymbol $sym30$_KEYHASH_EMPTY_KEY_;
  private static final SubLString $str31$The_Empty_KEYHASH_Key;
  private static final SubLList $list32;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$LEGACY_KEYHASH_FORMAT_P;
  private static final SubLSymbol $sym36$FIXNUMP;
  private static final SubLSymbol $sym37$VALID_HASH_TEST_P;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLSymbol $kw40$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw41$DONE;
  private static final SubLSymbol $sym42$THE_VALUE;
  private static final SubLSymbol $sym43$DO_HASH_TABLE;
  private static final SubLSymbol $sym44$DO_KEYHASH_NODES;
  private static final SubLSymbol $sym45$IGNORE;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$DO_KEYHASH;
  private static final SubLList $list48;
  private static final SubLSymbol $sym49$KEYHASH_EMPTY_KEY;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$DO_KEYHASH_VALID_KEY_P;
  private static final SubLSymbol $sym52$FUNCTION_SPEC_P;
  private static final SubLInteger $int53$68;
  private static final SubLSymbol $sym54$CFASL_INPUT_KEYHASH;
  private static final SubLSymbol $sym55$CFASL_OUTPUT_OBJECT_KEYHASH_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2342L)
  public static SubLObject keyhash_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_key_hash( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2342L)
  public static SubLObject keyhash_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $keyhash_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2342L)
  public static SubLObject khash_nodes(final SubLObject v_object)
  {
    assert NIL != keyhash_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2342L)
  public static SubLObject khash_test(final SubLObject v_object)
  {
    assert NIL != keyhash_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2342L)
  public static SubLObject khash_count(final SubLObject v_object)
  {
    assert NIL != keyhash_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2342L)
  public static SubLObject khash_hash_stash(final SubLObject v_object)
  {
    assert NIL != keyhash_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2342L)
  public static SubLObject _csetf_khash_nodes(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != keyhash_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2342L)
  public static SubLObject _csetf_khash_test(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != keyhash_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2342L)
  public static SubLObject _csetf_khash_count(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != keyhash_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2342L)
  public static SubLObject _csetf_khash_hash_stash(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != keyhash_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2342L)
  public static SubLObject make_keyhash(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $keyhash_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw18$NODES ) )
      {
        _csetf_khash_nodes( v_new, current_value );
      }
      else if( pcase_var.eql( $kw19$TEST ) )
      {
        _csetf_khash_test( v_new, current_value );
      }
      else if( pcase_var.eql( $kw20$COUNT ) )
      {
        _csetf_khash_count( v_new, current_value );
      }
      else if( pcase_var.eql( $kw21$HASH_STASH ) )
      {
        _csetf_khash_hash_stash( v_new, current_value );
      }
      else
      {
        Errors.error( $str22$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2342L)
  public static SubLObject visit_defstruct_keyhash(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw23$BEGIN, $sym24$MAKE_KEYHASH, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw25$SLOT, $kw18$NODES, khash_nodes( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$SLOT, $kw19$TEST, khash_test( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$SLOT, $kw20$COUNT, khash_count( obj ) );
    Functions.funcall( visitor_fn, obj, $kw25$SLOT, $kw21$HASH_STASH, khash_hash_stash( obj ) );
    Functions.funcall( visitor_fn, obj, $kw26$END, $sym24$MAKE_KEYHASH, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2342L)
  public static SubLObject visit_defstruct_object_keyhash_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_keyhash( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 2840L)
  public static SubLObject print_key_hash(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( v_object, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, v_object, T, T );
      print_high.princ( keyhash_test( v_object ), stream );
      streams_high.write_string( $str28$_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( keyhash_count( v_object ), stream );
      streams_high.write_string( $str29$_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( keyhash_capacity( v_object ), stream );
      print_macros.print_unreadable_object_postamble( stream, v_object, T, T );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3258L)
  public static SubLObject is_empty_keyhash_key_p(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject val = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list32 );
    val = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.listS( EQ, val, $list33 );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list32 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3346L)
  public static SubLObject set_keyhash_nodes(final SubLObject v_keyhash, final SubLObject nodes)
  {
    _csetf_khash_nodes( v_keyhash, nodes );
    return v_keyhash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3452L)
  public static SubLObject keyhash_nodes(final SubLObject v_keyhash)
  {
    return khash_nodes( v_keyhash );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3524L)
  public static SubLObject allocate_keyhash_nodes(final SubLObject size, final SubLObject test)
  {
    return Hashtables.make_hash_table( size, test, $list34 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3628L)
  public static SubLObject clear_all_keyhash_nodes(final SubLObject v_keyhash)
  {
    Hashtables.clrhash( keyhash_nodes( v_keyhash ) );
    return v_keyhash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3732L)
  public static SubLObject keyhash_test_internal(final SubLObject v_keyhash)
  {
    return Hashtables.hash_table_test( keyhash_nodes( v_keyhash ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3832L)
  public static SubLObject keyhash_count_internal(final SubLObject v_keyhash)
  {
    return Hashtables.hash_table_count( keyhash_nodes( v_keyhash ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 3934L)
  public static SubLObject keyhash_capacity_internal(final SubLObject v_keyhash)
  {
    return Hashtables.hash_table_size( keyhash_nodes( v_keyhash ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4038L)
  public static SubLObject keyhash_matching_key_internal(final SubLObject key, final SubLObject v_keyhash)
  {
    return Hashtables.gethash_without_values( key, keyhash_nodes( v_keyhash ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4272L)
  public static SubLObject keyhash_set_key(final SubLObject key, final SubLObject v_keyhash)
  {
    Hashtables.sethash( key, keyhash_nodes( v_keyhash ), key );
    return key;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4376L)
  public static SubLObject keyhash_remove_key(final SubLObject key, final SubLObject v_keyhash)
  {
    return Hashtables.remhash( key, keyhash_nodes( v_keyhash ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4473L)
  public static SubLObject new_keyhash_iterator_internal(final SubLObject v_keyhash)
  {
    return iteration.new_hash_table_keys_iterator( keyhash_nodes( v_keyhash ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4594L)
  public static SubLObject keyhash_random_key_internal(final SubLObject v_keyhash)
  {
    return hash_table_utilities.hash_table_random_key( keyhash_nodes( v_keyhash ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4706L)
  public static SubLObject legacy_keyhash_test_function(final SubLObject v_keyhash)
  {
    return khash_test( v_keyhash );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 4883L)
  public static SubLObject clear_legacy_keyhash_data(final SubLObject v_keyhash)
  {
    _csetf_khash_test( v_keyhash, NIL );
    _csetf_khash_count( v_keyhash, NIL );
    _csetf_khash_hash_stash( v_keyhash, NIL );
    return v_keyhash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5065L)
  public static SubLObject legacy_keyhash_format_p(final SubLObject v_keyhash)
  {
    return Types.vectorp( keyhash_nodes( v_keyhash ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5159L)
  public static SubLObject new_keyhash_format_p(final SubLObject v_keyhash)
  {
    return Types.hash_table_p( keyhash_nodes( v_keyhash ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5255L)
  public static SubLObject maybe_swizzle_old_vector_to_hash(final SubLObject v_keyhash)
  {
    if( NIL == new_keyhash_format_p( v_keyhash ) )
    {
      enforceType( v_keyhash, $sym35$LEGACY_KEYHASH_FORMAT_P );
      final SubLObject old_nodes = keyhash_nodes( v_keyhash );
      final SubLObject size = Sequences.length( old_nodes );
      final SubLObject test = legacy_keyhash_test_function( v_keyhash );
      clear_legacy_keyhash_data( v_keyhash );
      set_keyhash_nodes( v_keyhash, allocate_keyhash_nodes( size, test ) );
      final SubLObject vector_var = old_nodes;
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject key;
      for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        key = Vectors.aref( vector_var, element_num );
        if( !key.eql( $keyhash_empty_key$.getGlobalValue() ) )
        {
          setkeyhash( key, v_keyhash );
        }
      }
    }
    return v_keyhash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 5796L)
  public static SubLObject new_keyhash(final SubLObject size, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    assert NIL != Types.fixnump( size ) : size;
    assert NIL != hash_table_utilities.valid_hash_test_p( test ) : test;
    if( test.isFunction() )
    {
      test = hash_table_utilities.hash_test_to_symbol( test );
    }
    final SubLObject v_keyhash = make_keyhash( UNPROVIDED );
    set_keyhash_nodes( v_keyhash, allocate_keyhash_nodes( size, test ) );
    return v_keyhash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6494L)
  public static SubLObject clrkeyhash(final SubLObject v_keyhash)
  {
    assert NIL != keyhash_p( v_keyhash ) : v_keyhash;
    maybe_swizzle_old_vector_to_hash( v_keyhash );
    clear_all_keyhash_nodes( v_keyhash );
    return v_keyhash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 6766L)
  public static SubLObject keyhash_test(final SubLObject v_keyhash)
  {
    assert NIL != keyhash_p( v_keyhash ) : v_keyhash;
    maybe_swizzle_old_vector_to_hash( v_keyhash );
    return keyhash_test_internal( v_keyhash );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7067L)
  public static SubLObject keyhash_count(final SubLObject v_keyhash)
  {
    assert NIL != keyhash_p( v_keyhash ) : v_keyhash;
    maybe_swizzle_old_vector_to_hash( v_keyhash );
    return keyhash_count_internal( v_keyhash );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7345L)
  public static SubLObject keyhash_capacity(final SubLObject v_keyhash)
  {
    assert NIL != keyhash_p( v_keyhash ) : v_keyhash;
    return keyhash_capacity_internal( v_keyhash );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7576L)
  public static SubLObject getkeyhash(final SubLObject key, final SubLObject v_keyhash)
  {
    final SubLObject matching_key = keyhash_matching_key( key, v_keyhash );
    return list_utilities.sublisp_boolean( matching_key );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 7816L)
  public static SubLObject keyhash_matching_key(final SubLObject key, final SubLObject v_keyhash)
  {
    assert NIL != keyhash_p( v_keyhash ) : v_keyhash;
    maybe_swizzle_old_vector_to_hash( v_keyhash );
    return keyhash_matching_key_internal( key, v_keyhash );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8118L)
  public static SubLObject setkeyhash(final SubLObject key, final SubLObject v_keyhash)
  {
    assert NIL != keyhash_p( v_keyhash ) : v_keyhash;
    maybe_swizzle_old_vector_to_hash( v_keyhash );
    return keyhash_set_key( key, v_keyhash );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8409L)
  public static SubLObject remkeyhash(final SubLObject key, final SubLObject v_keyhash)
  {
    assert NIL != keyhash_p( v_keyhash ) : v_keyhash;
    maybe_swizzle_old_vector_to_hash( v_keyhash );
    return keyhash_remove_key( key, v_keyhash );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8688L)
  public static SubLObject new_keyhash_iterator(final SubLObject v_keyhash)
  {
    assert NIL != keyhash_p( v_keyhash ) : v_keyhash;
    maybe_swizzle_old_vector_to_hash( v_keyhash );
    return new_keyhash_iterator_internal( v_keyhash );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 8973L)
  public static SubLObject keyhash_iterator_next(final SubLObject it)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject element = iteration.iteration_next( it );
    final SubLObject validP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return ( NIL != validP ) ? element : $keyhash_empty_key$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9248L)
  public static SubLObject do_keyhash(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject v_keyhash = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list38 );
    v_keyhash = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list38 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list38 );
      if( NIL == conses_high.member( current_$1, $list39, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw40$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list38 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw41$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject the_value = $sym42$THE_VALUE;
    return ConsesLow.listS( $sym43$DO_HASH_TABLE, ConsesLow.list( key, the_value, ConsesLow.list( $sym44$DO_KEYHASH_NODES, v_keyhash ), $kw41$DONE, done ), ConsesLow.list( $sym45$IGNORE, the_value ), ConsesLow.append(
        body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 9819L)
  public static SubLObject some_keyhash(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject v_keyhash = NIL;
    SubLObject done = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    v_keyhash = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    done = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym47$DO_KEYHASH, ConsesLow.list( key, v_keyhash, $kw41$DONE, done ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list46 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10052L)
  public static SubLObject do_keyhash_nodes(final SubLObject v_keyhash)
  {
    assert NIL != keyhash_p( v_keyhash ) : v_keyhash;
    maybe_swizzle_old_vector_to_hash( v_keyhash );
    return keyhash_nodes( v_keyhash );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10264L)
  public static SubLObject keyhash_empty_key()
  {
    return $keyhash_empty_key$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10365L)
  public static SubLObject do_keyhash_valid_key_p(final SubLObject key)
  {
    return keyhash_valid_key_p( key );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10480L)
  public static SubLObject keyhash_valid_key_p(final SubLObject key)
  {
    return makeBoolean( !key.eql( $keyhash_empty_key$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 10570L)
  public static SubLObject mapkeyhash(final SubLObject function, final SubLObject v_keyhash)
  {
    assert NIL != keyhash_p( v_keyhash ) : v_keyhash;
    assert NIL != Types.function_spec_p( function ) : function;
    final SubLObject cdohash_table = do_keyhash_nodes( v_keyhash );
    SubLObject node_key = NIL;
    SubLObject the_value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        node_key = Hashtables.getEntryKey( cdohash_entry );
        the_value = Hashtables.getEntryValue( cdohash_entry );
        Functions.funcall( function, node_key );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11048L)
  public static SubLObject cfasl_output_object_keyhash_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_keyhash( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11167L)
  public static SubLObject cfasl_output_keyhash(final SubLObject v_object, final SubLObject stream)
  {
    cfasl.cfasl_raw_write_byte( $cfasl_opcode_keyhash$.getGlobalValue(), stream );
    final SubLObject test = hash_table_utilities.hash_test_to_symbol( keyhash_test( v_object ) );
    final SubLObject size = keyhash_count( v_object );
    cfasl.cfasl_output( test, stream );
    cfasl.cfasl_output( size, stream );
    final SubLObject cdohash_table = do_keyhash_nodes( v_object );
    SubLObject key = NIL;
    SubLObject the_value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        the_value = Hashtables.getEntryValue( cdohash_entry );
        cfasl.cfasl_output( key, stream );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11510L)
  public static SubLObject cfasl_input_keyhash(final SubLObject stream)
  {
    final SubLObject type = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    final SubLObject size = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    SubLObject test = NIL;
    SubLObject v_keyhash = NIL;
    final SubLObject pcase_var = type;
    if( pcase_var.eql( EQ ) || pcase_var.eql( EQL ) || pcase_var.eql( EQUAL ) || pcase_var.eql( EQUALP ) )
    {
      test = Symbols.symbol_function( type );
    }
    v_keyhash = new_keyhash( size, test );
    SubLObject index;
    SubLObject key;
    for( index = NIL, index = ZERO_INTEGER; index.numL( size ); index = Numbers.add( index, ONE_INTEGER ) )
    {
      key = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      setkeyhash( key, v_keyhash );
    }
    return v_keyhash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 11934L)
  public static SubLObject copy_keyhash(final SubLObject v_keyhash)
  {
    assert NIL != keyhash_p( v_keyhash ) : v_keyhash;
    maybe_swizzle_old_vector_to_hash( v_keyhash );
    final SubLObject size = keyhash_count( v_keyhash );
    final SubLObject test = keyhash_test( v_keyhash );
    final SubLObject new_keyhash = new_keyhash( size, test );
    final SubLObject cdohash_table = do_keyhash_nodes( v_keyhash );
    SubLObject key = NIL;
    SubLObject the_value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        the_value = Hashtables.getEntryValue( cdohash_entry );
        setkeyhash( key, new_keyhash );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return new_keyhash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 12610L)
  public static SubLObject keyhash_random_key(final SubLObject v_keyhash)
  {
    assert NIL != keyhash_p( v_keyhash ) : v_keyhash;
    maybe_swizzle_old_vector_to_hash( v_keyhash );
    return keyhash_random_key_internal( v_keyhash );
  }

  public static SubLObject declare_keyhash_file()
  {
    SubLFiles.declareFunction( me, "keyhash_print_function_trampoline", "KEYHASH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "keyhash_p", "KEYHASH-P", 1, 0, false );
    new $keyhash_p$UnaryFunction();
    SubLFiles.declareFunction( me, "khash_nodes", "KHASH-NODES", 1, 0, false );
    SubLFiles.declareFunction( me, "khash_test", "KHASH-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "khash_count", "KHASH-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "khash_hash_stash", "KHASH-HASH-STASH", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_khash_nodes", "_CSETF-KHASH-NODES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_khash_test", "_CSETF-KHASH-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_khash_count", "_CSETF-KHASH-COUNT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_khash_hash_stash", "_CSETF-KHASH-HASH-STASH", 2, 0, false );
    SubLFiles.declareFunction( me, "make_keyhash", "MAKE-KEYHASH", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_keyhash", "VISIT-DEFSTRUCT-KEYHASH", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_keyhash_method", "VISIT-DEFSTRUCT-OBJECT-KEYHASH-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_key_hash", "PRINT-KEY-HASH", 3, 0, false );
    SubLFiles.declareMacro( me, "is_empty_keyhash_key_p", "IS-EMPTY-KEYHASH-KEY-P" );
    SubLFiles.declareFunction( me, "set_keyhash_nodes", "SET-KEYHASH-NODES", 2, 0, false );
    SubLFiles.declareFunction( me, "keyhash_nodes", "KEYHASH-NODES", 1, 0, false );
    SubLFiles.declareFunction( me, "allocate_keyhash_nodes", "ALLOCATE-KEYHASH-NODES", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_all_keyhash_nodes", "CLEAR-ALL-KEYHASH-NODES", 1, 0, false );
    SubLFiles.declareFunction( me, "keyhash_test_internal", "KEYHASH-TEST-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "keyhash_count_internal", "KEYHASH-COUNT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "keyhash_capacity_internal", "KEYHASH-CAPACITY-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "keyhash_matching_key_internal", "KEYHASH-MATCHING-KEY-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "keyhash_set_key", "KEYHASH-SET-KEY", 2, 0, false );
    SubLFiles.declareFunction( me, "keyhash_remove_key", "KEYHASH-REMOVE-KEY", 2, 0, false );
    SubLFiles.declareFunction( me, "new_keyhash_iterator_internal", "NEW-KEYHASH-ITERATOR-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "keyhash_random_key_internal", "KEYHASH-RANDOM-KEY-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "legacy_keyhash_test_function", "LEGACY-KEYHASH-TEST-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_legacy_keyhash_data", "CLEAR-LEGACY-KEYHASH-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "legacy_keyhash_format_p", "LEGACY-KEYHASH-FORMAT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_keyhash_format_p", "NEW-KEYHASH-FORMAT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "maybe_swizzle_old_vector_to_hash", "MAYBE-SWIZZLE-OLD-VECTOR-TO-HASH", 1, 0, false );
    SubLFiles.declareFunction( me, "new_keyhash", "NEW-KEYHASH", 1, 1, false );
    SubLFiles.declareFunction( me, "clrkeyhash", "CLRKEYHASH", 1, 0, false );
    SubLFiles.declareFunction( me, "keyhash_test", "KEYHASH-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "keyhash_count", "KEYHASH-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "keyhash_capacity", "KEYHASH-CAPACITY", 1, 0, false );
    SubLFiles.declareFunction( me, "getkeyhash", "GETKEYHASH", 2, 0, false );
    SubLFiles.declareFunction( me, "keyhash_matching_key", "KEYHASH-MATCHING-KEY", 2, 0, false );
    SubLFiles.declareFunction( me, "setkeyhash", "SETKEYHASH", 2, 0, false );
    SubLFiles.declareFunction( me, "remkeyhash", "REMKEYHASH", 2, 0, false );
    SubLFiles.declareFunction( me, "new_keyhash_iterator", "NEW-KEYHASH-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "keyhash_iterator_next", "KEYHASH-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareMacro( me, "do_keyhash", "DO-KEYHASH" );
    SubLFiles.declareMacro( me, "some_keyhash", "SOME-KEYHASH" );
    SubLFiles.declareFunction( me, "do_keyhash_nodes", "DO-KEYHASH-NODES", 1, 0, false );
    SubLFiles.declareFunction( me, "keyhash_empty_key", "KEYHASH-EMPTY-KEY", 0, 0, false );
    SubLFiles.declareFunction( me, "do_keyhash_valid_key_p", "DO-KEYHASH-VALID-KEY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "keyhash_valid_key_p", "KEYHASH-VALID-KEY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "mapkeyhash", "MAPKEYHASH", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_keyhash_method", "CFASL-OUTPUT-OBJECT-KEYHASH-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_keyhash", "CFASL-OUTPUT-KEYHASH", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_keyhash", "CFASL-INPUT-KEYHASH", 1, 0, false );
    SubLFiles.declareFunction( me, "copy_keyhash", "COPY-KEYHASH", 1, 0, false );
    SubLFiles.declareFunction( me, "keyhash_random_key", "KEYHASH-RANDOM-KEY", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_keyhash_file()
  {
    $dtp_keyhash$ = SubLFiles.defconstant( "*DTP-KEYHASH*", $sym0$KEYHASH );
    $keyhash_empty_key$ = SubLFiles.deflexical( "*KEYHASH-EMPTY-KEY*", maybeDefault( $sym30$_KEYHASH_EMPTY_KEY_, $keyhash_empty_key$, () -> ( Symbols.make_symbol( $str31$The_Empty_KEYHASH_Key ) ) ) );
    $cfasl_opcode_keyhash$ = SubLFiles.defconstant( "*CFASL-OPCODE-KEYHASH*", $int53$68 );
    return NIL;
  }

  public static SubLObject setup_keyhash_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_keyhash$.getGlobalValue(), Symbols.symbol_function( $sym8$KEYHASH_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list9 );
    Structures.def_csetf( $sym10$KHASH_NODES, $sym11$_CSETF_KHASH_NODES );
    Structures.def_csetf( $sym12$KHASH_TEST, $sym13$_CSETF_KHASH_TEST );
    Structures.def_csetf( $sym14$KHASH_COUNT, $sym15$_CSETF_KHASH_COUNT );
    Structures.def_csetf( $sym16$KHASH_HASH_STASH, $sym17$_CSETF_KHASH_HASH_STASH );
    Equality.identity( $sym0$KEYHASH );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_keyhash$.getGlobalValue(), Symbols.symbol_function( $sym27$VISIT_DEFSTRUCT_OBJECT_KEYHASH_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym30$_KEYHASH_EMPTY_KEY_ );
    access_macros.register_macro_helper( $sym44$DO_KEYHASH_NODES, $list48 );
    access_macros.register_macro_helper( $sym49$KEYHASH_EMPTY_KEY, $list50 );
    access_macros.register_macro_helper( $sym51$DO_KEYHASH_VALID_KEY_P, $list50 );
    cfasl.register_cfasl_input_function( $cfasl_opcode_keyhash$.getGlobalValue(), $sym54$CFASL_INPUT_KEYHASH );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_keyhash$.getGlobalValue(), Symbols.symbol_function( $sym55$CFASL_OUTPUT_OBJECT_KEYHASH_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_keyhash_file();
  }

  @Override
  public void initializeVariables()
  {
    init_keyhash_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_keyhash_file();
  }
  static
  {
    me = new keyhash();
    $dtp_keyhash$ = null;
    $keyhash_empty_key$ = null;
    $cfasl_opcode_keyhash$ = null;
    $sym0$KEYHASH = makeSymbol( "KEYHASH" );
    $sym1$KEYHASH_P = makeSymbol( "KEYHASH-P" );
    $int2$137 = makeInteger( 137 );
    $list3 = ConsesLow.list( makeSymbol( "NODES" ), makeSymbol( "TEST" ), makeSymbol( "COUNT" ), makeSymbol( "HASH-STASH" ) );
    $list4 = ConsesLow.list( makeKeyword( "NODES" ), makeKeyword( "TEST" ), makeKeyword( "COUNT" ), makeKeyword( "HASH-STASH" ) );
    $list5 = ConsesLow.list( makeSymbol( "KHASH-NODES" ), makeSymbol( "KHASH-TEST" ), makeSymbol( "KHASH-COUNT" ), makeSymbol( "KHASH-HASH-STASH" ) );
    $list6 = ConsesLow.list( makeSymbol( "_CSETF-KHASH-NODES" ), makeSymbol( "_CSETF-KHASH-TEST" ), makeSymbol( "_CSETF-KHASH-COUNT" ), makeSymbol( "_CSETF-KHASH-HASH-STASH" ) );
    $sym7$PRINT_KEY_HASH = makeSymbol( "PRINT-KEY-HASH" );
    $sym8$KEYHASH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "KEYHASH-PRINT-FUNCTION-TRAMPOLINE" );
    $list9 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "KEYHASH-P" ) );
    $sym10$KHASH_NODES = makeSymbol( "KHASH-NODES" );
    $sym11$_CSETF_KHASH_NODES = makeSymbol( "_CSETF-KHASH-NODES" );
    $sym12$KHASH_TEST = makeSymbol( "KHASH-TEST" );
    $sym13$_CSETF_KHASH_TEST = makeSymbol( "_CSETF-KHASH-TEST" );
    $sym14$KHASH_COUNT = makeSymbol( "KHASH-COUNT" );
    $sym15$_CSETF_KHASH_COUNT = makeSymbol( "_CSETF-KHASH-COUNT" );
    $sym16$KHASH_HASH_STASH = makeSymbol( "KHASH-HASH-STASH" );
    $sym17$_CSETF_KHASH_HASH_STASH = makeSymbol( "_CSETF-KHASH-HASH-STASH" );
    $kw18$NODES = makeKeyword( "NODES" );
    $kw19$TEST = makeKeyword( "TEST" );
    $kw20$COUNT = makeKeyword( "COUNT" );
    $kw21$HASH_STASH = makeKeyword( "HASH-STASH" );
    $str22$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw23$BEGIN = makeKeyword( "BEGIN" );
    $sym24$MAKE_KEYHASH = makeSymbol( "MAKE-KEYHASH" );
    $kw25$SLOT = makeKeyword( "SLOT" );
    $kw26$END = makeKeyword( "END" );
    $sym27$VISIT_DEFSTRUCT_OBJECT_KEYHASH_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-KEYHASH-METHOD" );
    $str28$_ = makeString( " " );
    $str29$_ = makeString( "/" );
    $sym30$_KEYHASH_EMPTY_KEY_ = makeSymbol( "*KEYHASH-EMPTY-KEY*" );
    $str31$The_Empty_KEYHASH_Key = makeString( "The Empty KEYHASH Key" );
    $list32 = ConsesLow.list( makeSymbol( "VAL" ) );
    $list33 = ConsesLow.list( makeSymbol( "*KEYHASH-EMPTY-KEY*" ) );
    $list34 = ConsesLow.list( makeKeyword( "VALUES" ), NIL );
    $sym35$LEGACY_KEYHASH_FORMAT_P = makeSymbol( "LEGACY-KEYHASH-FORMAT-P" );
    $sym36$FIXNUMP = makeSymbol( "FIXNUMP" );
    $sym37$VALID_HASH_TEST_P = makeSymbol( "VALID-HASH-TEST-P" );
    $list38 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "KEYHASH" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list39 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw40$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw41$DONE = makeKeyword( "DONE" );
    $sym42$THE_VALUE = makeUninternedSymbol( "THE-VALUE" );
    $sym43$DO_HASH_TABLE = makeSymbol( "DO-HASH-TABLE" );
    $sym44$DO_KEYHASH_NODES = makeSymbol( "DO-KEYHASH-NODES" );
    $sym45$IGNORE = makeSymbol( "IGNORE" );
    $list46 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "KEYHASH" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym47$DO_KEYHASH = makeSymbol( "DO-KEYHASH" );
    $list48 = ConsesLow.list( makeSymbol( "DO-KEYHASH" ), makeSymbol( "DO-SET-CONTENTS" ) );
    $sym49$KEYHASH_EMPTY_KEY = makeSymbol( "KEYHASH-EMPTY-KEY" );
    $list50 = ConsesLow.list( makeSymbol( "DO-SET-CONTENTS" ) );
    $sym51$DO_KEYHASH_VALID_KEY_P = makeSymbol( "DO-KEYHASH-VALID-KEY-P" );
    $sym52$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $int53$68 = makeInteger( 68 );
    $sym54$CFASL_INPUT_KEYHASH = makeSymbol( "CFASL-INPUT-KEYHASH" );
    $sym55$CFASL_OUTPUT_OBJECT_KEYHASH_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-KEYHASH-METHOD" );
  }

  public static final class $keyhash_native
      extends
        SubLStructNative
  {
    public SubLObject $nodes;
    public SubLObject $test;
    public SubLObject $count;
    public SubLObject $hash_stash;
    private static final SubLStructDeclNative structDecl;

    public $keyhash_native()
    {
      this.$nodes = CommonSymbols.NIL;
      this.$test = CommonSymbols.NIL;
      this.$count = CommonSymbols.NIL;
      this.$hash_stash = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $keyhash_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$nodes;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$test;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$count;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$hash_stash;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$nodes = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$test = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$count = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$hash_stash = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $keyhash_native.class, $sym0$KEYHASH, $sym1$KEYHASH_P, $list3, $list4, new String[] { "$nodes", "$test", "$count", "$hash_stash"
      }, $list5, $list6, $sym7$PRINT_KEY_HASH );
    }
  }

  public static final class $keyhash_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $keyhash_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "KEYHASH-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return keyhash_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 210 ms
 * 
 */