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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
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

public final class sparse_vector
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sparse_vector";
  public static final String myFingerPrint = "19f7471a9e5ee638769e68ee54c1de1d6560a689a64fd84997c2606af3286468";
  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 3370L)
  public static SubLSymbol $dtp_sparse_vector$;
  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 13767L)
  private static SubLSymbol $cfasl_opcode_sparse_vector$;
  private static final SubLSymbol $sym0$SPARSE_VECTOR;
  private static final SubLSymbol $sym1$SPARSE_VECTOR_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$SVECTOR_PRINT;
  private static final SubLSymbol $sym7$SPARSE_VECTOR_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$SVECTOR_MAGNITUDE;
  private static final SubLSymbol $sym10$_CSETF_SVECTOR_MAGNITUDE;
  private static final SubLSymbol $sym11$SVECTOR_DIMENSIONS;
  private static final SubLSymbol $sym12$_CSETF_SVECTOR_DIMENSIONS;
  private static final SubLSymbol $kw13$MAGNITUDE;
  private static final SubLSymbol $kw14$DIMENSIONS;
  private static final SubLString $str15$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw16$BEGIN;
  private static final SubLSymbol $sym17$MAKE_SPARSE_VECTOR;
  private static final SubLSymbol $kw18$SLOT;
  private static final SubLSymbol $kw19$END;
  private static final SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_SPARSE_VECTOR_METHOD;
  private static final SubLInteger $int21$50;
  private static final SubLSymbol $sym22$VALID_HASH_TEST_P;
  private static final SubLSymbol $sym23$INTEGERP;
  private static final SubLString $str24$__SVECTOR__;
  private static final SubLSymbol $kw25$DO_HASH_TABLE;
  private static final SubLString $str26$____;
  private static final SubLString $str27$__;
  private static final SubLString $str28$___;
  private static final SubLString $str29$_;
  private static final SubLSymbol $sym30$NUMBERP;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$CDOHASH;
  private static final SubLSymbol $sym33$NON_EMPTY_LIST_P;
  private static final SubLString $str34$_a_is_not_a_sparse_vector_with_te;
  private static final SubLString $str35$Non_matching_vector_tests__a_and_;
  private static final SubLInteger $int36$64;
  private static final SubLInteger $int37$65;
  private static final SubLSymbol $sym38$CFASL_INPUT_SPARSE_VECTOR;
  private static final SubLSymbol $sym39$CFASL_OUTPUT_OBJECT_SPARSE_VECTOR_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 3370L)
  public static SubLObject sparse_vector_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    svector_print( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 3370L)
  public static SubLObject sparse_vector_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sparse_vector_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 3370L)
  public static SubLObject svector_magnitude(final SubLObject v_object)
  {
    assert NIL != sparse_vector_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 3370L)
  public static SubLObject svector_dimensions(final SubLObject v_object)
  {
    assert NIL != sparse_vector_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 3370L)
  public static SubLObject _csetf_svector_magnitude(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sparse_vector_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 3370L)
  public static SubLObject _csetf_svector_dimensions(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sparse_vector_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 3370L)
  public static SubLObject make_sparse_vector(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sparse_vector_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw13$MAGNITUDE ) )
      {
        _csetf_svector_magnitude( v_new, current_value );
      }
      else if( pcase_var.eql( $kw14$DIMENSIONS ) )
      {
        _csetf_svector_dimensions( v_new, current_value );
      }
      else
      {
        Errors.error( $str15$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 3370L)
  public static SubLObject visit_defstruct_sparse_vector(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw16$BEGIN, $sym17$MAKE_SPARSE_VECTOR, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw13$MAGNITUDE, svector_magnitude( obj ) );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw14$DIMENSIONS, svector_dimensions( obj ) );
    Functions.funcall( visitor_fn, obj, $kw19$END, $sym17$MAKE_SPARSE_VECTOR, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 3370L)
  public static SubLObject visit_defstruct_object_sparse_vector_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sparse_vector( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 3576L)
  public static SubLObject new_sparse_vector(SubLObject test, SubLObject capacity)
  {
    if( test == UNPROVIDED )
    {
      test = EQL;
    }
    if( capacity == UNPROVIDED )
    {
      capacity = $int21$50;
    }
    assert NIL != hash_table_utilities.valid_hash_test_p( test ) : test;
    assert NIL != Types.integerp( capacity ) : capacity;
    final SubLObject vector = make_sparse_vector( UNPROVIDED );
    _csetf_svector_dimensions( vector, Hashtables.make_hash_table( capacity, test, UNPROVIDED ) );
    return vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 4146L)
  public static SubLObject svector_print(final SubLObject vector, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    streams_high.write_string( $str24$__SVECTOR__, stream, UNPROVIDED, UNPROVIDED );
    SubLObject i = ZERO_INTEGER;
    final SubLObject count = Hashtables.hash_table_count( svector_dimensions( vector ) );
    if( !i.numE( Numbers.min( count, TEN_INTEGER ) ) )
    {
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw25$DO_HASH_TABLE );
        final SubLObject cdohash_table = svector_dimensions( vector );
        SubLObject dimension = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
        try
        {
          while ( Hashtables.iteratorHasNext( cdohash_iterator ))
          {
            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
            dimension = Hashtables.getEntryKey( cdohash_entry );
            value = Hashtables.getEntryValue( cdohash_entry );
            subl_macros.do_hash_table_done_check( Numbers.numE( i, Numbers.min( count, TEN_INTEGER ) ) );
            print_high.princ( dimension, stream );
            streams_high.write_string( $str26$____, stream, UNPROVIDED, UNPROVIDED );
            print_high.princ( value, stream );
            print_high.princ( $str27$__, stream );
            i = Numbers.add( i, ONE_INTEGER );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( cdohash_iterator );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw25$DO_HASH_TABLE );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    if( count.numG( i ) )
    {
      streams_high.write_string( $str28$___, stream, UNPROVIDED, UNPROVIDED );
    }
    streams_high.write_string( $str29$_, stream, UNPROVIDED, UNPROVIDED );
    return vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 4685L)
  public static SubLObject svector_test(final SubLObject vector)
  {
    assert NIL != sparse_vector_p( vector ) : vector;
    return Hashtables.hash_table_test( svector_dimensions( vector ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 4898L)
  public static SubLObject svector_cardinality(final SubLObject vector)
  {
    assert NIL != sparse_vector_p( vector ) : vector;
    return Hashtables.hash_table_count( svector_dimensions( vector ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 5150L)
  public static SubLObject svector_copy(final SubLObject vector)
  {
    assert NIL != sparse_vector_p( vector ) : vector;
    final SubLObject copy = new_sparse_vector( svector_test( vector ), UNPROVIDED );
    final SubLObject cdohash_table = svector_dimensions( vector );
    SubLObject dim = NIL;
    SubLObject value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        dim = Hashtables.getEntryKey( cdohash_entry );
        value = Hashtables.getEntryValue( cdohash_entry );
        svector_set( copy, dim, value );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return copy;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 5471L)
  public static SubLObject svector_get(final SubLObject vector, final SubLObject dimension)
  {
    assert NIL != sparse_vector_p( vector ) : vector;
    return Hashtables.gethash( dimension, svector_dimensions( vector ), ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 5730L)
  public static SubLObject svector_set(final SubLObject vector, final SubLObject dimension, final SubLObject value)
  {
    assert NIL != sparse_vector_p( vector ) : vector;
    assert NIL != Types.numberp( value ) : value;
    if( value.isZero() )
    {
      Hashtables.remhash( dimension, svector_dimensions( vector ) );
    }
    else
    {
      Hashtables.sethash( dimension, svector_dimensions( vector ), value );
    }
    return vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 6192L)
  public static SubLObject svector_inc(final SubLObject vector, final SubLObject dimension)
  {
    assert NIL != sparse_vector_p( vector ) : vector;
    Hashtables.sethash( dimension, svector_dimensions( vector ), Numbers.add( Hashtables.gethash( dimension, svector_dimensions( vector ), ZERO_INTEGER ), ONE_INTEGER ) );
    return vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 6501L)
  public static SubLObject svector_dec(final SubLObject vector, final SubLObject dimension)
  {
    assert NIL != sparse_vector_p( vector ) : vector;
    Hashtables.sethash( dimension, svector_dimensions( vector ), Numbers.subtract( Hashtables.gethash( dimension, svector_dimensions( vector ), ZERO_INTEGER ), ONE_INTEGER ) );
    return vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 6810L)
  public static SubLObject svector_length(final SubLObject vector)
  {
    assert NIL != sparse_vector_p( vector ) : vector;
    if( NIL == svector_magnitude( vector ) )
    {
      SubLObject sum = ZERO_INTEGER;
      final SubLObject cdohash_table = svector_dimensions( vector );
      SubLObject dimension = NIL;
      SubLObject value = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          dimension = Hashtables.getEntryKey( cdohash_entry );
          value = Hashtables.getEntryValue( cdohash_entry );
          sum = Numbers.add( sum, number_utilities.square( value ) );
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
      _csetf_svector_magnitude( vector, Numbers.sqrt( sum ) );
    }
    return svector_magnitude( vector );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 7211L)
  public static SubLObject do_svector(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject dimension = NIL;
    SubLObject value = NIL;
    SubLObject vector = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
    dimension = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
    value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list31 );
    vector = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym32$CDOHASH, ConsesLow.list( dimension, value, ConsesLow.list( $sym11$SVECTOR_DIMENSIONS, vector ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list31 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 7466L)
  public static SubLObject zero_svector_p(final SubLObject vector)
  {
    assert NIL != sparse_vector_p( vector ) : vector;
    return Numbers.zerop( Hashtables.hash_table_count( svector_dimensions( vector ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 7689L)
  public static SubLObject svector_euclidean_norm(final SubLObject vector)
  {
    assert NIL != sparse_vector_p( vector ) : vector;
    return svector_length( vector );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 7891L)
  public static SubLObject svector_sum_norm(final SubLObject vector)
  {
    assert NIL != sparse_vector_p( vector ) : vector;
    SubLObject norm = ZERO_INTEGER;
    final SubLObject cdohash_table = svector_dimensions( vector );
    SubLObject dim = NIL;
    SubLObject value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        dim = Hashtables.getEntryKey( cdohash_entry );
        value = Hashtables.getEntryValue( cdohash_entry );
        norm = Numbers.add( norm, value );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return norm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 8181L)
  public static SubLObject svector_max_norm(final SubLObject vector)
  {
    assert NIL != sparse_vector_p( vector ) : vector;
    SubLObject max = ZERO_INTEGER;
    final SubLObject cdohash_table = svector_dimensions( vector );
    SubLObject dim = NIL;
    SubLObject value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        dim = Hashtables.getEntryKey( cdohash_entry );
        value = Hashtables.getEntryValue( cdohash_entry );
        if( value.numG( max ) )
        {
          max = value;
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return max;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 8495L)
  public static SubLObject svector_add(final SubLObject vector2, final SubLObject vector1)
  {
    assert NIL != sparse_vector_p( vector1 ) : vector1;
    assert NIL != sparse_vector_p( vector2 ) : vector2;
    final SubLObject dimensions2 = svector_dimensions( vector2 );
    final SubLObject cdohash_table = svector_dimensions( vector1 );
    SubLObject dimension = NIL;
    SubLObject value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        dimension = Hashtables.getEntryKey( cdohash_entry );
        value = Hashtables.getEntryValue( cdohash_entry );
        Hashtables.sethash( dimension, dimensions2, Numbers.add( Hashtables.gethash( dimension, dimensions2, ZERO_INTEGER ), value ) );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    _csetf_svector_magnitude( vector2, NIL );
    return vector2;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 9168L)
  public static SubLObject svector_sum(final SubLObject vector1, final SubLObject vector2)
  {
    assert NIL != sparse_vector_p( vector1 ) : vector1;
    assert NIL != sparse_vector_p( vector2 ) : vector2;
    final SubLObject sum_vector = new_sparse_vector( UNPROVIDED, UNPROVIDED );
    svector_add( vector1, sum_vector );
    svector_add( vector2, sum_vector );
    return sum_vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 9613L)
  public static SubLObject svector_scalar_product(final SubLObject vector1, final SubLObject vector2)
  {
    assert NIL != sparse_vector_p( vector1 ) : vector1;
    assert NIL != sparse_vector_p( vector2 ) : vector2;
    SubLObject dot_product = ZERO_INTEGER;
    final SubLObject dimensions2 = svector_dimensions( vector2 );
    final SubLObject cdohash_table = svector_dimensions( vector1 );
    SubLObject dimension = NIL;
    SubLObject value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        dimension = Hashtables.getEntryKey( cdohash_entry );
        value = Hashtables.getEntryValue( cdohash_entry );
        dot_product = Numbers.add( dot_product, Numbers.multiply( value, Hashtables.gethash( dimension, dimensions2, ZERO_INTEGER ) ) );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return dot_product;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 10035L)
  public static SubLObject svector_scale(final SubLObject vector, final SubLObject factor)
  {
    assert NIL != sparse_vector_p( vector ) : vector;
    assert NIL != Types.numberp( factor ) : factor;
    _csetf_svector_magnitude( vector, NIL );
    final SubLObject cdohash_table = svector_dimensions( vector );
    SubLObject dimension = NIL;
    SubLObject value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        dimension = Hashtables.getEntryKey( cdohash_entry );
        value = Hashtables.getEntryValue( cdohash_entry );
        svector_set( vector, dimension, Numbers.multiply( value, factor ) );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return vector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 10481L)
  public static SubLObject svector_normalize(final SubLObject vector)
  {
    assert NIL != sparse_vector_p( vector ) : vector;
    final SubLObject length = svector_length( vector );
    if( !length.isZero() )
    {
      return svector_scale( vector, Numbers.divide( ONE_INTEGER, length ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 10983L)
  public static SubLObject svector_normalizedP(final SubLObject vector)
  {
    assert NIL != sparse_vector_p( vector ) : vector;
    return Numbers.numE( svector_length( vector ), ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 11201L)
  public static SubLObject svector_distance(final SubLObject vector1, final SubLObject vector2)
  {
    assert NIL != sparse_vector_p( vector1 ) : vector1;
    assert NIL != sparse_vector_p( vector2 ) : vector2;
    SubLObject sum = ZERO_INTEGER;
    final SubLObject dimensions2 = svector_dimensions( vector2 );
    final SubLObject cdohash_table = svector_dimensions( vector1 );
    SubLObject dimension = NIL;
    SubLObject value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        dimension = Hashtables.getEntryKey( cdohash_entry );
        value = Hashtables.getEntryValue( cdohash_entry );
        sum = Numbers.add( sum, number_utilities.square( Numbers.subtract( value, Hashtables.gethash( dimension, dimensions2, ZERO_INTEGER ) ) ) );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return Numbers.sqrt( sum );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 11701L)
  public static SubLObject svector_centroid(final SubLObject vectors)
  {
    assert NIL != list_utilities.non_empty_list_p( vectors ) : vectors;
    final SubLObject test = svector_test( vectors.first() );
    final SubLObject centroid = new_sparse_vector( test, UNPROVIDED );
    SubLObject cdolist_list_var = vectors;
    SubLObject vector = NIL;
    vector = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == sparse_vector_p( vector ) || !svector_test( vector ).eql( test ) )
      {
        Errors.error( $str34$_a_is_not_a_sparse_vector_with_te, vector, test );
      }
      svector_add( centroid, vector );
      cdolist_list_var = cdolist_list_var.rest();
      vector = cdolist_list_var.first();
    }
    return svector_scale( centroid, Numbers.divide( ONE_INTEGER, Sequences.length( vectors ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 12236L)
  public static SubLObject svector_matching_coefficient(final SubLObject vector1, final SubLObject vector2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != sparse_vector_p( vector1 ) : vector1;
    assert NIL != sparse_vector_p( vector2 ) : vector2;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !svector_test( vector1 ).eql( svector_test( vector2 ) ) )
    {
      Errors.error( $str35$Non_matching_vector_tests__a_and_, svector_test( vector1 ), svector_test( vector2 ) );
    }
    final SubLObject intersection = set.new_set( svector_test( vector1 ), $int36$64 );
    final SubLObject cdohash_table = svector_dimensions( vector1 );
    SubLObject dimension = NIL;
    SubLObject value = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        dimension = Hashtables.getEntryKey( cdohash_entry );
        value = Hashtables.getEntryValue( cdohash_entry );
        if( !svector_get( vector2, dimension ).isZero() )
        {
          set.set_add( dimension, intersection );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    return set.set_size( intersection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 12933L)
  public static SubLObject svector_cosine_angle(final SubLObject vector1, final SubLObject vector2)
  {
    assert NIL != sparse_vector_p( vector1 ) : vector1;
    assert NIL != sparse_vector_p( vector2 ) : vector2;
    return Numbers.divide( svector_scalar_product( vector1, vector2 ), Numbers.multiply( svector_length( vector1 ), svector_length( vector2 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 13318L)
  public static SubLObject svector_overlap_coefficient(final SubLObject vector1, final SubLObject vector2)
  {
    assert NIL != sparse_vector_p( vector1 ) : vector1;
    assert NIL != sparse_vector_p( vector2 ) : vector2;
    return Numbers.divide( svector_matching_coefficient( vector1, vector2 ), Numbers.min( Hashtables.hash_table_count( svector_dimensions( vector1 ) ), Hashtables.hash_table_count( svector_dimensions( vector2 ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 13906L)
  public static SubLObject cfasl_output_object_sparse_vector_method(final SubLObject v_object, final SubLObject stream)
  {
    return cfasl_output_sparse_vector( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 14037L)
  public static SubLObject cfasl_output_sparse_vector(final SubLObject svector, final SubLObject stream)
  {
    cfasl.cfasl_raw_write_byte( $cfasl_opcode_sparse_vector$.getGlobalValue(), stream );
    cfasl.cfasl_output( svector_dimensions( svector ), stream );
    return svector;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sparse-vector.lisp", position = 14230L)
  public static SubLObject cfasl_input_sparse_vector(final SubLObject stream)
  {
    final SubLObject svector = make_sparse_vector( UNPROVIDED );
    _csetf_svector_dimensions( svector, cfasl.cfasl_input_object( stream ) );
    return svector;
  }

  public static SubLObject declare_sparse_vector_file()
  {
    SubLFiles.declareFunction( me, "sparse_vector_print_function_trampoline", "SPARSE-VECTOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sparse_vector_p", "SPARSE-VECTOR-P", 1, 0, false );
    new $sparse_vector_p$UnaryFunction();
    SubLFiles.declareFunction( me, "svector_magnitude", "SVECTOR-MAGNITUDE", 1, 0, false );
    SubLFiles.declareFunction( me, "svector_dimensions", "SVECTOR-DIMENSIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_svector_magnitude", "_CSETF-SVECTOR-MAGNITUDE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_svector_dimensions", "_CSETF-SVECTOR-DIMENSIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sparse_vector", "MAKE-SPARSE-VECTOR", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sparse_vector", "VISIT-DEFSTRUCT-SPARSE-VECTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sparse_vector_method", "VISIT-DEFSTRUCT-OBJECT-SPARSE-VECTOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_sparse_vector", "NEW-SPARSE-VECTOR", 0, 2, false );
    SubLFiles.declareFunction( me, "svector_print", "SVECTOR-PRINT", 3, 0, false );
    SubLFiles.declareFunction( me, "svector_test", "SVECTOR-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "svector_cardinality", "SVECTOR-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "svector_copy", "SVECTOR-COPY", 1, 0, false );
    SubLFiles.declareFunction( me, "svector_get", "SVECTOR-GET", 2, 0, false );
    SubLFiles.declareFunction( me, "svector_set", "SVECTOR-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "svector_inc", "SVECTOR-INC", 2, 0, false );
    SubLFiles.declareFunction( me, "svector_dec", "SVECTOR-DEC", 2, 0, false );
    SubLFiles.declareFunction( me, "svector_length", "SVECTOR-LENGTH", 1, 0, false );
    SubLFiles.declareMacro( me, "do_svector", "DO-SVECTOR" );
    SubLFiles.declareFunction( me, "zero_svector_p", "ZERO-SVECTOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "svector_euclidean_norm", "SVECTOR-EUCLIDEAN-NORM", 1, 0, false );
    SubLFiles.declareFunction( me, "svector_sum_norm", "SVECTOR-SUM-NORM", 1, 0, false );
    SubLFiles.declareFunction( me, "svector_max_norm", "SVECTOR-MAX-NORM", 1, 0, false );
    SubLFiles.declareFunction( me, "svector_add", "SVECTOR-ADD", 2, 0, false );
    SubLFiles.declareFunction( me, "svector_sum", "SVECTOR-SUM", 2, 0, false );
    SubLFiles.declareFunction( me, "svector_scalar_product", "SVECTOR-SCALAR-PRODUCT", 2, 0, false );
    SubLFiles.declareFunction( me, "svector_scale", "SVECTOR-SCALE", 2, 0, false );
    SubLFiles.declareFunction( me, "svector_normalize", "SVECTOR-NORMALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "svector_normalizedP", "SVECTOR-NORMALIZED?", 1, 0, false );
    SubLFiles.declareFunction( me, "svector_distance", "SVECTOR-DISTANCE", 2, 0, false );
    SubLFiles.declareFunction( me, "svector_centroid", "SVECTOR-CENTROID", 1, 0, false );
    SubLFiles.declareFunction( me, "svector_matching_coefficient", "SVECTOR-MATCHING-COEFFICIENT", 2, 0, false );
    SubLFiles.declareFunction( me, "svector_cosine_angle", "SVECTOR-COSINE-ANGLE", 2, 0, false );
    SubLFiles.declareFunction( me, "svector_overlap_coefficient", "SVECTOR-OVERLAP-COEFFICIENT", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_object_sparse_vector_method", "CFASL-OUTPUT-OBJECT-SPARSE-VECTOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_output_sparse_vector", "CFASL-OUTPUT-SPARSE-VECTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_sparse_vector", "CFASL-INPUT-SPARSE-VECTOR", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_sparse_vector_file()
  {
    $dtp_sparse_vector$ = SubLFiles.defconstant( "*DTP-SPARSE-VECTOR*", $sym0$SPARSE_VECTOR );
    $cfasl_opcode_sparse_vector$ = SubLFiles.defconstant( "*CFASL-OPCODE-SPARSE-VECTOR*", $int37$65 );
    return NIL;
  }

  public static SubLObject setup_sparse_vector_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sparse_vector$.getGlobalValue(), Symbols.symbol_function( $sym7$SPARSE_VECTOR_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$SVECTOR_MAGNITUDE, $sym10$_CSETF_SVECTOR_MAGNITUDE );
    Structures.def_csetf( $sym11$SVECTOR_DIMENSIONS, $sym12$_CSETF_SVECTOR_DIMENSIONS );
    Equality.identity( $sym0$SPARSE_VECTOR );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sparse_vector$.getGlobalValue(), Symbols.symbol_function( $sym20$VISIT_DEFSTRUCT_OBJECT_SPARSE_VECTOR_METHOD ) );
    cfasl.register_cfasl_input_function( $cfasl_opcode_sparse_vector$.getGlobalValue(), $sym38$CFASL_INPUT_SPARSE_VECTOR );
    Structures.register_method( cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_sparse_vector$.getGlobalValue(), Symbols.symbol_function( $sym39$CFASL_OUTPUT_OBJECT_SPARSE_VECTOR_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sparse_vector_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sparse_vector_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sparse_vector_file();
  }
  static
  {
    me = new sparse_vector();
    $dtp_sparse_vector$ = null;
    $cfasl_opcode_sparse_vector$ = null;
    $sym0$SPARSE_VECTOR = makeSymbol( "SPARSE-VECTOR" );
    $sym1$SPARSE_VECTOR_P = makeSymbol( "SPARSE-VECTOR-P" );
    $list2 = ConsesLow.list( makeSymbol( "MAGNITUDE" ), makeSymbol( "DIMENSIONS" ) );
    $list3 = ConsesLow.list( makeKeyword( "MAGNITUDE" ), makeKeyword( "DIMENSIONS" ) );
    $list4 = ConsesLow.list( makeSymbol( "SVECTOR-MAGNITUDE" ), makeSymbol( "SVECTOR-DIMENSIONS" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-SVECTOR-MAGNITUDE" ), makeSymbol( "_CSETF-SVECTOR-DIMENSIONS" ) );
    $sym6$SVECTOR_PRINT = makeSymbol( "SVECTOR-PRINT" );
    $sym7$SPARSE_VECTOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SPARSE-VECTOR-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SPARSE-VECTOR-P" ) );
    $sym9$SVECTOR_MAGNITUDE = makeSymbol( "SVECTOR-MAGNITUDE" );
    $sym10$_CSETF_SVECTOR_MAGNITUDE = makeSymbol( "_CSETF-SVECTOR-MAGNITUDE" );
    $sym11$SVECTOR_DIMENSIONS = makeSymbol( "SVECTOR-DIMENSIONS" );
    $sym12$_CSETF_SVECTOR_DIMENSIONS = makeSymbol( "_CSETF-SVECTOR-DIMENSIONS" );
    $kw13$MAGNITUDE = makeKeyword( "MAGNITUDE" );
    $kw14$DIMENSIONS = makeKeyword( "DIMENSIONS" );
    $str15$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw16$BEGIN = makeKeyword( "BEGIN" );
    $sym17$MAKE_SPARSE_VECTOR = makeSymbol( "MAKE-SPARSE-VECTOR" );
    $kw18$SLOT = makeKeyword( "SLOT" );
    $kw19$END = makeKeyword( "END" );
    $sym20$VISIT_DEFSTRUCT_OBJECT_SPARSE_VECTOR_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SPARSE-VECTOR-METHOD" );
    $int21$50 = makeInteger( 50 );
    $sym22$VALID_HASH_TEST_P = makeSymbol( "VALID-HASH-TEST-P" );
    $sym23$INTEGERP = makeSymbol( "INTEGERP" );
    $str24$__SVECTOR__ = makeString( "#<SVECTOR: " );
    $kw25$DO_HASH_TABLE = makeKeyword( "DO-HASH-TABLE" );
    $str26$____ = makeString( " -> " );
    $str27$__ = makeString( ", " );
    $str28$___ = makeString( "..." );
    $str29$_ = makeString( ">" );
    $sym30$NUMBERP = makeSymbol( "NUMBERP" );
    $list31 = ConsesLow.list( ConsesLow.list( makeSymbol( "DIMENSION" ), makeSymbol( "VALUE" ), makeSymbol( "VECTOR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym32$CDOHASH = makeSymbol( "CDOHASH" );
    $sym33$NON_EMPTY_LIST_P = makeSymbol( "NON-EMPTY-LIST-P" );
    $str34$_a_is_not_a_sparse_vector_with_te = makeString( "~a is not a sparse vector with test ~a" );
    $str35$Non_matching_vector_tests__a_and_ = makeString( "Non-matching vector tests ~a and ~a" );
    $int36$64 = makeInteger( 64 );
    $int37$65 = makeInteger( 65 );
    $sym38$CFASL_INPUT_SPARSE_VECTOR = makeSymbol( "CFASL-INPUT-SPARSE-VECTOR" );
    $sym39$CFASL_OUTPUT_OBJECT_SPARSE_VECTOR_METHOD = makeSymbol( "CFASL-OUTPUT-OBJECT-SPARSE-VECTOR-METHOD" );
  }

  public static final class $sparse_vector_native
      extends
        SubLStructNative
  {
    public SubLObject $magnitude;
    public SubLObject $dimensions;
    private static final SubLStructDeclNative structDecl;

    public $sparse_vector_native()
    {
      this.$magnitude = CommonSymbols.NIL;
      this.$dimensions = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sparse_vector_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$magnitude;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$dimensions;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$magnitude = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$dimensions = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sparse_vector_native.class, $sym0$SPARSE_VECTOR, $sym1$SPARSE_VECTOR_P, $list2, $list3, new String[] { "$magnitude", "$dimensions"
      }, $list4, $list5, $sym6$SVECTOR_PRINT );
    }
  }

  public static final class $sparse_vector_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sparse_vector_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SPARSE-VECTOR-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sparse_vector_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 321 ms
 * 
 */