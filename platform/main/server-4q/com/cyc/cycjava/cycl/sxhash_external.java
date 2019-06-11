package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sxhash_external
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sxhash_external";
  public static final String myFingerPrint = "61a4a80447ff730f851ceae8803ae61c6c25b83d3873749dc02d1e720724d48b";
  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 969L)
  private static SubLSymbol $sxhash_external_depth$;
  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 1275L)
  private static SubLSymbol $sxhash_external_maximum_depth$;
  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 1422L)
  private static SubLSymbol $sxhash_external_maximum_length$;
  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 1572L)
  private static SubLSymbol $sxhash_external_bit_limit$;
  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 1837L)
  private static SubLSymbol $sxhash_external_fixnum_limit$;
  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 2008L)
  private static SubLSymbol $sxhash_external_ensure_fixnum_bytespec$;
  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 4805L)
  public static SubLSymbol $sxhash_external_method_table$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$CLET;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$CSETQ;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PROGN;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$SXHASH_EXTERNAL_UPDATE_HASH;
  private static final SubLSymbol $sym9$_SXHASH_EXTERNAL_STATE;
  private static final SubLList $list10;
  private static final SubLInteger $int11$256;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$SXHASH_EXTERNAL_INTEGER_METHOD;
  private static final SubLInteger $int14$89;
  private static final SubLSymbol $sym15$SXHASH_EXTERNAL_FLOAT_METHOD;
  private static final SubLInteger $int16$223;
  private static final SubLSymbol $sym17$SXHASH_EXTERNAL_CHARACTER_METHOD;
  private static final SubLInteger $int18$131;
  private static final SubLInteger $int19$32;
  private static final SubLSymbol $sym20$SXHASH_EXTERNAL_STRING_METHOD;
  private static final SubLInteger $int21$229;
  private static final SubLSymbol $sym22$SXHASH_EXTERNAL_PACKAGE_METHOD;
  private static final SubLSymbol $kw23$SXHASH_EXTERNAL;
  private static final SubLInteger $int24$263;
  private static final SubLSymbol $sym25$SXHASH_EXTERNAL_SYMBOL_METHOD;
  private static final SubLSymbol $sym26$SXHASH_EXTERNAL_GUID_METHOD;
  private static final SubLList $list27;
  private static final SubLInteger $int28$167;
  private static final SubLSymbol $sym29$SXHASH_EXTERNAL_CONS_METHOD;
  private static final SubLInteger $int30$199;
  private static final SubLSymbol $sym31$SXHASH_EXTERNAL_VECTOR_METHOD;
  private static final SubLObject $ic32;
  private static final SubLInteger $int33$27;

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 2203L)
  public static SubLObject sxhash_external_fixnump(final SubLObject integer)
  {
    return Numbers.numLE( integer, $sxhash_external_fixnum_limit$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 2307L)
  public static SubLObject sxhash_external_ensure_fixnum(final SubLObject integer)
  {
    if( integer.isNegative() )
    {
      return sxhash_external_ensure_fixnum( Numbers.abs( integer ) );
    }
    if( NIL != sxhash_external_fixnump( integer ) )
    {
      return integer;
    }
    return bytes.ldb( $sxhash_external_ensure_fixnum_bytespec$.getGlobalValue(), integer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 2671L)
  public static SubLObject compute_sxhash_external_composite(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject hash = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    hash = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym1$CLET, $list2, ConsesLow.listS( $sym3$CSETQ, hash, $list4 ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 3152L)
  public static SubLObject sxhash_external_composite_update(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject hash = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    hash = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym6$PROGN, $list7, ConsesLow.list( $sym3$CSETQ, hash, ConsesLow.list( $sym8$SXHASH_EXTERNAL_UPDATE_HASH, hash, $sym9$_SXHASH_EXTERNAL_STATE, value ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list5 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 3608L)
  public static SubLObject sxhash_external_rot(final SubLObject fixnum, final SubLObject high_bits)
  {
    if( high_bits.numGE( $sxhash_external_bit_limit$.getGlobalValue() ) )
    {
      return fixnum;
    }
    final SubLObject rest_bits = Numbers.subtract( $sxhash_external_bit_limit$.getGlobalValue(), high_bits );
    final SubLObject high_fixnum = Numbers.ash( fixnum, Numbers.minus( rest_bits ) );
    final SubLObject low_mask = Numbers.lognot( Numbers.ash( MINUS_ONE_INTEGER, rest_bits ) );
    final SubLObject low_fixnum = Numbers.logand( fixnum, low_mask );
    final SubLObject low_rotated = Numbers.ash( low_fixnum, high_bits );
    final SubLObject result = Numbers.logior( high_fixnum, low_rotated );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 4293L)
  public static SubLObject sxhash_external_update_state(final SubLObject state)
  {
    return utilities_macros.sxhash_update_state( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 4420L)
  public static SubLObject sxhash_external_update_hash(final SubLObject hash, final SubLObject state, final SubLObject value)
  {
    return Numbers.logxor( sxhash_external_rot( value, state ), hash );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 4805L)
  public static SubLObject sxhash_external(final SubLObject v_object)
  {
    final SubLObject method_function = Structures.method_func( v_object, $sxhash_external_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, v_object );
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 5139L)
  public static SubLObject sxhash_external_integer(final SubLObject integer)
  {
    return sxhash_external_ensure_fixnum( integer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 5239L)
  public static SubLObject sxhash_external_integer_method(final SubLObject v_object)
  {
    return sxhash_external_integer( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 5332L)
  public static SubLObject sxhash_external_float(final SubLObject v_float)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject hash = NIL;
    final SubLObject _prev_bind_0 = $sxhash_external_depth$.currentBinding( thread );
    try
    {
      $sxhash_external_depth$.bind( Numbers.add( $sxhash_external_depth$.getDynamicValue( thread ), ONE_INTEGER ), thread );
      SubLObject _sxhash_external_state = FOUR_INTEGER;
      hash = ZERO_INTEGER;
      hash = $int14$89;
      thread.resetMultipleValues();
      final SubLObject signif = Numbers.integer_decode_float( v_float );
      final SubLObject exp = thread.secondMultipleValue();
      final SubLObject sign = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      _sxhash_external_state = sxhash_external_update_state( _sxhash_external_state );
      hash = sxhash_external_update_hash( hash, _sxhash_external_state, sxhash_external( signif ) );
      _sxhash_external_state = sxhash_external_update_state( _sxhash_external_state );
      hash = sxhash_external_update_hash( hash, _sxhash_external_state, sxhash_external( exp ) );
      _sxhash_external_state = sxhash_external_update_state( _sxhash_external_state );
      hash = sxhash_external_update_hash( hash, _sxhash_external_state, sxhash_external( sign ) );
    }
    finally
    {
      $sxhash_external_depth$.rebind( _prev_bind_0, thread );
    }
    return hash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 5782L)
  public static SubLObject sxhash_external_float_method(final SubLObject v_object)
  {
    return sxhash_external_float( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 5873L)
  public static SubLObject sxhash_external_character(final SubLObject character)
  {
    return Numbers.logand( Characters.char_code( character ), $int16$223 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 5975L)
  public static SubLObject sxhash_external_character_method(final SubLObject v_object)
  {
    return sxhash_external_character( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 6072L)
  public static SubLObject sxhash_external_string(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject hash = NIL;
    final SubLObject _prev_bind_0 = $sxhash_external_depth$.currentBinding( thread );
    try
    {
      $sxhash_external_depth$.bind( Numbers.add( $sxhash_external_depth$.getDynamicValue( thread ), ONE_INTEGER ), thread );
      SubLObject _sxhash_external_state = FOUR_INTEGER;
      hash = ZERO_INTEGER;
      hash = $int18$131;
      SubLObject total;
      SubLObject i;
      SubLObject subhash;
      for( total = Sequences.length( string ), i = NIL, i = ZERO_INTEGER; i.numL( total ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        subhash = sxhash_external_character( Strings.sublisp_char( string, i ) );
        _sxhash_external_state = sxhash_external_update_state( _sxhash_external_state );
        hash = sxhash_external_update_hash( hash, _sxhash_external_state, subhash );
      }
    }
    finally
    {
      $sxhash_external_depth$.rebind( _prev_bind_0, thread );
    }
    return hash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 6529L)
  public static SubLObject sxhash_external_string_new(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject hash = NIL;
    final SubLObject _prev_bind_0 = $sxhash_external_depth$.currentBinding( thread );
    try
    {
      $sxhash_external_depth$.bind( Numbers.add( $sxhash_external_depth$.getDynamicValue( thread ), ONE_INTEGER ), thread );
      SubLObject _sxhash_external_state = FOUR_INTEGER;
      hash = ZERO_INTEGER;
      hash = $int18$131;
      final SubLObject length = Sequences.length( string );
      final SubLObject subhash = sxhash_external_ensure_fixnum( length );
      _sxhash_external_state = sxhash_external_update_state( _sxhash_external_state );
      hash = sxhash_external_update_hash( hash, _sxhash_external_state, subhash );
      SubLObject range_marker = $int19$32;
      for( SubLObject step = ONE_INTEGER, index = ZERO_INTEGER; index.numL( length ); index = Numbers.add( index, step ) )
      {
        final SubLObject subhash2 = sxhash_external_character( Strings.sublisp_char( string, index ) );
        _sxhash_external_state = sxhash_external_update_state( _sxhash_external_state );
        hash = sxhash_external_update_hash( hash, _sxhash_external_state, subhash2 );
        if( index.numG( range_marker ) )
        {
          step = Numbers.add( step, step );
          if( step.numG( $int19$32 ) )
          {
            index = length;
          }
          else
          {
           //range_marker = range_marker;
          }
        }
      }
    }
    finally
    {
      $sxhash_external_depth$.rebind( _prev_bind_0, thread );
    }
    return hash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 7523L)
  public static SubLObject sxhash_external_string_method(final SubLObject v_object)
  {
    return sxhash_external_string( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 7614L)
  public static SubLObject sxhash_external_package(final SubLObject v_package)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject hash = NIL;
    final SubLObject _prev_bind_0 = $sxhash_external_depth$.currentBinding( thread );
    try
    {
      $sxhash_external_depth$.bind( Numbers.add( $sxhash_external_depth$.getDynamicValue( thread ), ONE_INTEGER ), thread );
      SubLObject _sxhash_external_state = FOUR_INTEGER;
      hash = ZERO_INTEGER;
      hash = $int21$229;
      final SubLObject subhash = sxhash_external_string( Packages.package_name( v_package ) );
      _sxhash_external_state = sxhash_external_update_state( _sxhash_external_state );
      hash = sxhash_external_update_hash( hash, _sxhash_external_state, subhash );
    }
    finally
    {
      $sxhash_external_depth$.rebind( _prev_bind_0, thread );
    }
    return hash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 7919L)
  public static SubLObject sxhash_external_package_method(final SubLObject v_object)
  {
    return sxhash_external_package( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 8012L)
  public static SubLObject sxhash_external_symbol(final SubLObject symbol)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject hash = Symbols.get( symbol, $kw23$SXHASH_EXTERNAL, UNPROVIDED );
    if( NIL == hash )
    {
      final SubLObject _prev_bind_0 = $sxhash_external_depth$.currentBinding( thread );
      try
      {
        $sxhash_external_depth$.bind( Numbers.add( $sxhash_external_depth$.getDynamicValue( thread ), ONE_INTEGER ), thread );
        SubLObject _sxhash_external_state = FOUR_INTEGER;
        hash = ZERO_INTEGER;
        hash = $int24$263;
        final SubLObject v_package = Symbols.symbol_package( symbol );
        if( NIL != v_package )
        {
          final SubLObject subhash = sxhash_external_package( v_package );
          _sxhash_external_state = sxhash_external_update_state( _sxhash_external_state );
          hash = sxhash_external_update_hash( hash, _sxhash_external_state, subhash );
        }
        final SubLObject subhash2 = sxhash_external_string( Symbols.symbol_name( symbol ) );
        _sxhash_external_state = sxhash_external_update_state( _sxhash_external_state );
        hash = sxhash_external_update_hash( hash, _sxhash_external_state, subhash2 );
      }
      finally
      {
        $sxhash_external_depth$.rebind( _prev_bind_0, thread );
      }
      Symbols.put( symbol, $kw23$SXHASH_EXTERNAL, hash );
    }
    return hash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 8606L)
  public static SubLObject clear_cached_symbol_sxhash_external_codes()
  {
    SubLObject total = ZERO_INTEGER;
    SubLObject cdolist_list_var = Packages.list_all_packages();
    SubLObject v_package = NIL;
    v_package = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cdo_symbols_package = v_package;
      final SubLObject cdo_symbols_iterator = NIL;
      SubLObject symbol = NIL;
      final Iterator cdo_symbols_iterator_$1 = Packages.makeSymbolIterator( cdo_symbols_package );
      while ( Packages.symbolIteratorHasNext( cdo_symbols_iterator_$1 ))
      {
        symbol = Packages.symbolIteratorNext( cdo_symbols_iterator_$1 );
        if( NIL != Symbols.get( symbol, $kw23$SXHASH_EXTERNAL, UNPROVIDED ) )
        {
          total = Numbers.add( total, ONE_INTEGER );
          Symbols.remprop( symbol, $kw23$SXHASH_EXTERNAL );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_package = cdolist_list_var.first();
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 8941L)
  public static SubLObject cache_all_symbol_sxhash_external_codes()
  {
    SubLObject total = ZERO_INTEGER;
    SubLObject cdolist_list_var = Packages.list_all_packages();
    SubLObject v_package = NIL;
    v_package = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cdo_symbols_package = v_package;
      final SubLObject cdo_symbols_iterator = NIL;
      SubLObject symbol = NIL;
      final Iterator cdo_symbols_iterator_$2 = Packages.makeSymbolIterator( cdo_symbols_package );
      while ( Packages.symbolIteratorHasNext( cdo_symbols_iterator_$2 ))
      {
        symbol = Packages.symbolIteratorNext( cdo_symbols_iterator_$2 );
        if( NIL == Symbols.get( symbol, $kw23$SXHASH_EXTERNAL, UNPROVIDED ) )
        {
          total = Numbers.add( total, ONE_INTEGER );
          sxhash_external( symbol );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_package = cdolist_list_var.first();
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 9264L)
  public static SubLObject sxhash_external_symbol_method(final SubLObject v_object)
  {
    return sxhash_external_symbol( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 9355L)
  public static SubLObject sxhash_external_guid(final SubLObject guid)
  {
    return sxhash_external( Guids.guid_to_string( guid ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 9495L)
  public static SubLObject sxhash_external_guid_method(final SubLObject v_object)
  {
    return sxhash_external_guid( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 9717L)
  public static SubLObject sxhash_external_cons(final SubLObject cons)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject hash = NIL;
    final SubLObject _prev_bind_0 = $sxhash_external_depth$.currentBinding( thread );
    try
    {
      $sxhash_external_depth$.bind( Numbers.add( $sxhash_external_depth$.getDynamicValue( thread ), ONE_INTEGER ), thread );
      SubLObject _sxhash_external_state = FOUR_INTEGER;
      hash = ZERO_INTEGER;
      hash = $int28$167;
      if( !$sxhash_external_depth$.getDynamicValue( thread ).numG( $sxhash_external_maximum_depth$.getGlobalValue() ) )
      {
        SubLObject tail;
        SubLObject i;
        SubLObject subhash;
        for( tail = NIL, i = NIL, tail = cons, i = ZERO_INTEGER; !i.numGE( $sxhash_external_maximum_length$.getGlobalValue() ) && !tail.isAtom(); tail = tail.rest(), i = Numbers.add( i, ONE_INTEGER ) )
        {
          subhash = sxhash_external( tail.first() );
          _sxhash_external_state = sxhash_external_update_state( _sxhash_external_state );
          hash = sxhash_external_update_hash( hash, _sxhash_external_state, subhash );
        }
        if( !i.numGE( $sxhash_external_maximum_length$.getGlobalValue() ) && NIL != tail )
        {
          subhash = sxhash_external( tail );
          _sxhash_external_state = sxhash_external_update_state( _sxhash_external_state );
          hash = sxhash_external_update_hash( hash, _sxhash_external_state, subhash );
        }
      }
    }
    finally
    {
      $sxhash_external_depth$.rebind( _prev_bind_0, thread );
    }
    return hash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 10536L)
  public static SubLObject sxhash_external_cons_method(final SubLObject v_object)
  {
    return sxhash_external_cons( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 10623L)
  public static SubLObject sxhash_external_vector(final SubLObject vector)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject hash = NIL;
    final SubLObject _prev_bind_0 = $sxhash_external_depth$.currentBinding( thread );
    try
    {
      $sxhash_external_depth$.bind( Numbers.add( $sxhash_external_depth$.getDynamicValue( thread ), ONE_INTEGER ), thread );
      SubLObject _sxhash_external_state = FOUR_INTEGER;
      hash = ZERO_INTEGER;
      hash = $int30$199;
      if( !$sxhash_external_depth$.getDynamicValue( thread ).numG( $sxhash_external_maximum_depth$.getGlobalValue() ) )
      {
        SubLObject total;
        SubLObject i;
        SubLObject subhash;
        for( total = Numbers.min( Sequences.length( vector ), $sxhash_external_maximum_length$.getGlobalValue() ), i = NIL, i = ZERO_INTEGER; i.numL( total ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          subhash = sxhash_external( Vectors.aref( vector, i ) );
          _sxhash_external_state = sxhash_external_update_state( _sxhash_external_state );
          hash = sxhash_external_update_hash( hash, _sxhash_external_state, subhash );
        }
      }
    }
    finally
    {
      $sxhash_external_depth$.rebind( _prev_bind_0, thread );
    }
    return hash;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 11133L)
  public static SubLObject sxhash_external_vector_method(final SubLObject v_object)
  {
    return sxhash_external_vector( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external.lisp", position = 11224L)
  public static SubLObject sxhash_external_string_standalone(final SubLObject string)
  {
    final SubLObject total = Sequences.length( string );
    final SubLObject state_vector = $ic32;
    SubLObject state = FOUR_INTEGER;
    SubLObject hash = $int18$131;
    SubLObject i;
    SubLObject subhash;
    SubLObject fixnum;
    SubLObject high_bits;
    SubLObject bit_limit;
    SubLObject result;
    SubLObject rest_bits;
    SubLObject high_fixnum;
    SubLObject low_mask;
    SubLObject low_fixnum;
    SubLObject low_rotated;
    for( i = NIL, i = ZERO_INTEGER; i.numL( total ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      subhash = Numbers.logand( Characters.char_code( Strings.sublisp_char( string, i ) ), $int16$223 );
      state = Vectors.aref( state_vector, state );
      fixnum = subhash;
      high_bits = state;
      bit_limit = $int33$27;
      result = NIL;
      if( high_bits.numGE( bit_limit ) )
      {
        result = fixnum;
      }
      else
      {
        rest_bits = Numbers.subtract( bit_limit, high_bits );
        high_fixnum = Numbers.ash( fixnum, Numbers.minus( rest_bits ) );
        low_mask = Numbers.lognot( Numbers.ash( MINUS_ONE_INTEGER, rest_bits ) );
        low_fixnum = Numbers.logand( fixnum, low_mask );
        low_rotated = Numbers.ash( low_fixnum, high_bits );
        result = Numbers.logior( high_fixnum, low_rotated );
      }
      hash = Numbers.logxor( result, hash );
    }
    return hash;
  }

  public static SubLObject declare_sxhash_external_file()
  {
    SubLFiles.declareFunction( me, "sxhash_external_fixnump", "SXHASH-EXTERNAL-FIXNUMP", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_ensure_fixnum", "SXHASH-EXTERNAL-ENSURE-FIXNUM", 1, 0, false );
    SubLFiles.declareMacro( me, "compute_sxhash_external_composite", "COMPUTE-SXHASH-EXTERNAL-COMPOSITE" );
    SubLFiles.declareMacro( me, "sxhash_external_composite_update", "SXHASH-EXTERNAL-COMPOSITE-UPDATE" );
    SubLFiles.declareFunction( me, "sxhash_external_rot", "SXHASH-EXTERNAL-ROT", 2, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_update_state", "SXHASH-EXTERNAL-UPDATE-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_update_hash", "SXHASH-EXTERNAL-UPDATE-HASH", 3, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external", "SXHASH-EXTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_integer", "SXHASH-EXTERNAL-INTEGER", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_integer_method", "SXHASH-EXTERNAL-INTEGER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_float", "SXHASH-EXTERNAL-FLOAT", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_float_method", "SXHASH-EXTERNAL-FLOAT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_character", "SXHASH-EXTERNAL-CHARACTER", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_character_method", "SXHASH-EXTERNAL-CHARACTER-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_string", "SXHASH-EXTERNAL-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_string_new", "SXHASH-EXTERNAL-STRING-NEW", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_string_method", "SXHASH-EXTERNAL-STRING-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_package", "SXHASH-EXTERNAL-PACKAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_package_method", "SXHASH-EXTERNAL-PACKAGE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_symbol", "SXHASH-EXTERNAL-SYMBOL", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_cached_symbol_sxhash_external_codes", "CLEAR-CACHED-SYMBOL-SXHASH-EXTERNAL-CODES", 0, 0, false );
    SubLFiles.declareFunction( me, "cache_all_symbol_sxhash_external_codes", "CACHE-ALL-SYMBOL-SXHASH-EXTERNAL-CODES", 0, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_symbol_method", "SXHASH-EXTERNAL-SYMBOL-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_guid", "SXHASH-EXTERNAL-GUID", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_guid_method", "SXHASH-EXTERNAL-GUID-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_cons", "SXHASH-EXTERNAL-CONS", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_cons_method", "SXHASH-EXTERNAL-CONS-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_vector", "SXHASH-EXTERNAL-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_vector_method", "SXHASH-EXTERNAL-VECTOR-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_string_standalone", "SXHASH-EXTERNAL-STRING-STANDALONE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_sxhash_external_file()
  {
    $sxhash_external_depth$ = SubLFiles.defparameter( "*SXHASH-EXTERNAL-DEPTH*", ZERO_INTEGER );
    $sxhash_external_maximum_depth$ = SubLFiles.defconstant( "*SXHASH-EXTERNAL-MAXIMUM-DEPTH*", EIGHT_INTEGER );
    $sxhash_external_maximum_length$ = SubLFiles.defconstant( "*SXHASH-EXTERNAL-MAXIMUM-LENGTH*", EIGHT_INTEGER );
    $sxhash_external_bit_limit$ = SubLFiles.defconstant( "*SXHASH-EXTERNAL-BIT-LIMIT*", utilities_macros.$sxhash_bit_limit$.getGlobalValue() );
    $sxhash_external_fixnum_limit$ = SubLFiles.defconstant( "*SXHASH-EXTERNAL-FIXNUM-LIMIT*", Numbers.subtract( Numbers.expt( TWO_INTEGER, $sxhash_external_bit_limit$.getGlobalValue() ), ONE_INTEGER ) );
    $sxhash_external_ensure_fixnum_bytespec$ = SubLFiles.defconstant( "*SXHASH-EXTERNAL-ENSURE-FIXNUM-BYTESPEC*", bytes.sublisp_byte( $sxhash_external_bit_limit$.getGlobalValue(), ZERO_INTEGER ) );
    $sxhash_external_method_table$ = SubLFiles.deflexical( "*SXHASH-EXTERNAL-METHOD-TABLE*", Vectors.make_vector( $int11$256, NIL ) );
    return NIL;
  }

  public static SubLObject setup_sxhash_external_file()
  {
    SubLSpecialOperatorDeclarations.proclaim( $list10 );
    SubLSpecialOperatorDeclarations.proclaim( $list12 );
    Structures.register_method( $sxhash_external_method_table$.getGlobalValue(), Types.$dtp_bignum$.getGlobalValue(), Symbols.symbol_function( $sym13$SXHASH_EXTERNAL_INTEGER_METHOD ) );
    Structures.register_method( $sxhash_external_method_table$.getGlobalValue(), Types.$dtp_fixnum$.getGlobalValue(), Symbols.symbol_function( $sym13$SXHASH_EXTERNAL_INTEGER_METHOD ) );
    Structures.register_method( $sxhash_external_method_table$.getGlobalValue(), Types.$dtp_float$.getGlobalValue(), Symbols.symbol_function( $sym15$SXHASH_EXTERNAL_FLOAT_METHOD ) );
    Structures.register_method( $sxhash_external_method_table$.getGlobalValue(), Types.$dtp_character$.getGlobalValue(), Symbols.symbol_function( $sym17$SXHASH_EXTERNAL_CHARACTER_METHOD ) );
    Structures.register_method( $sxhash_external_method_table$.getGlobalValue(), Types.$dtp_string$.getGlobalValue(), Symbols.symbol_function( $sym20$SXHASH_EXTERNAL_STRING_METHOD ) );
    Structures.register_method( $sxhash_external_method_table$.getGlobalValue(), Types.$dtp_package$.getGlobalValue(), Symbols.symbol_function( $sym22$SXHASH_EXTERNAL_PACKAGE_METHOD ) );
    Structures.register_method( $sxhash_external_method_table$.getGlobalValue(), Types.$dtp_symbol$.getGlobalValue(), Symbols.symbol_function( $sym25$SXHASH_EXTERNAL_SYMBOL_METHOD ) );
    Structures.register_method( $sxhash_external_method_table$.getGlobalValue(), Guids.$dtp_guid$.getGlobalValue(), Symbols.symbol_function( $sym26$SXHASH_EXTERNAL_GUID_METHOD ) );
    SubLSpecialOperatorDeclarations.proclaim( $list27 );
    Structures.register_method( $sxhash_external_method_table$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function( $sym29$SXHASH_EXTERNAL_CONS_METHOD ) );
    Structures.register_method( $sxhash_external_method_table$.getGlobalValue(), Types.$dtp_vector$.getGlobalValue(), Symbols.symbol_function( $sym31$SXHASH_EXTERNAL_VECTOR_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sxhash_external_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sxhash_external_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sxhash_external_file();
  }
  static
  {
    me = new sxhash_external();
    $sxhash_external_depth$ = null;
    $sxhash_external_maximum_depth$ = null;
    $sxhash_external_maximum_length$ = null;
    $sxhash_external_bit_limit$ = null;
    $sxhash_external_fixnum_limit$ = null;
    $sxhash_external_ensure_fixnum_bytespec$ = null;
    $sxhash_external_method_table$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "HASH" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$CLET = makeSymbol( "CLET" );
    $list2 = ConsesLow.list( ConsesLow.list( makeSymbol( "*SXHASH-EXTERNAL-DEPTH*" ), ConsesLow.list( makeSymbol( "+" ), makeSymbol( "*SXHASH-EXTERNAL-DEPTH*" ), ONE_INTEGER ) ), ConsesLow.list( makeSymbol(
        "_SXHASH-EXTERNAL-STATE" ), FOUR_INTEGER ) );
    $sym3$CSETQ = makeSymbol( "CSETQ" );
    $list4 = ConsesLow.list( ZERO_INTEGER );
    $list5 = ConsesLow.list( makeSymbol( "HASH" ), makeSymbol( "VALUE" ) );
    $sym6$PROGN = makeSymbol( "PROGN" );
    $list7 = ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "_SXHASH-EXTERNAL-STATE" ), ConsesLow.list( makeSymbol( "SXHASH-EXTERNAL-UPDATE-STATE" ), makeSymbol( "_SXHASH-EXTERNAL-STATE" ) ) );
    $sym8$SXHASH_EXTERNAL_UPDATE_HASH = makeSymbol( "SXHASH-EXTERNAL-UPDATE-HASH" );
    $sym9$_SXHASH_EXTERNAL_STATE = makeSymbol( "_SXHASH-EXTERNAL-STATE" );
    $list10 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "SXHASH-EXTERNAL-ROT" ), makeSymbol( "SXHASH-EXTERNAL-UPDATE-STATE" ), makeSymbol( "SXHASH-EXTERNAL-UPDATE-HASH" ) );
    $int11$256 = makeInteger( 256 );
    $list12 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "SXHASH-EXTERNAL-INTEGER" ), makeSymbol( "SXHASH-EXTERNAL-FLOAT" ), makeSymbol( "SXHASH-EXTERNAL-CHARACTER" ), makeSymbol( "SXHASH-EXTERNAL-STRING" ),
        makeSymbol( "SXHASH-EXTERNAL-PACKAGE" ), makeSymbol( "SXHASH-EXTERNAL-SYMBOL" ), makeSymbol( "SXHASH-EXTERNAL-GUID" ) );
    $sym13$SXHASH_EXTERNAL_INTEGER_METHOD = makeSymbol( "SXHASH-EXTERNAL-INTEGER-METHOD" );
    $int14$89 = makeInteger( 89 );
    $sym15$SXHASH_EXTERNAL_FLOAT_METHOD = makeSymbol( "SXHASH-EXTERNAL-FLOAT-METHOD" );
    $int16$223 = makeInteger( 223 );
    $sym17$SXHASH_EXTERNAL_CHARACTER_METHOD = makeSymbol( "SXHASH-EXTERNAL-CHARACTER-METHOD" );
    $int18$131 = makeInteger( 131 );
    $int19$32 = makeInteger( 32 );
    $sym20$SXHASH_EXTERNAL_STRING_METHOD = makeSymbol( "SXHASH-EXTERNAL-STRING-METHOD" );
    $int21$229 = makeInteger( 229 );
    $sym22$SXHASH_EXTERNAL_PACKAGE_METHOD = makeSymbol( "SXHASH-EXTERNAL-PACKAGE-METHOD" );
    $kw23$SXHASH_EXTERNAL = makeKeyword( "SXHASH-EXTERNAL" );
    $int24$263 = makeInteger( 263 );
    $sym25$SXHASH_EXTERNAL_SYMBOL_METHOD = makeSymbol( "SXHASH-EXTERNAL-SYMBOL-METHOD" );
    $sym26$SXHASH_EXTERNAL_GUID_METHOD = makeSymbol( "SXHASH-EXTERNAL-GUID-METHOD" );
    $list27 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "SXHASH-EXTERNAL-CONS" ), makeSymbol( "SXHASH-EXTERNAL-VECTOR" ) );
    $int28$167 = makeInteger( 167 );
    $sym29$SXHASH_EXTERNAL_CONS_METHOD = makeSymbol( "SXHASH-EXTERNAL-CONS-METHOD" );
    $int30$199 = makeInteger( 199 );
    $sym31$SXHASH_EXTERNAL_VECTOR_METHOD = makeSymbol( "SXHASH-EXTERNAL-VECTOR-METHOD" );
    $ic32 = Vectors.vector( new SubLObject[] { SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER,
      SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger( 21 ), makeInteger( 22 ), makeInteger( 23 ), makeInteger( 24 ), makeInteger( 25 ), makeInteger( 26 ), makeInteger( 27 ),
      makeInteger( 28 ), makeInteger( 29 ), makeInteger( 30 ), makeInteger( 31 ), ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER
    } );
    $int33$27 = makeInteger( 27 );
  }
}
/*
 * 
 * Total time: 106 ms
 * 
 */