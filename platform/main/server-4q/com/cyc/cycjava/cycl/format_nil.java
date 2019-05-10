package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class format_nil
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.format_nil";
  public static final String myFingerPrint = "3430c26f2e1621fd1cd84a0ba5a8d8c2b25ca528b4d0a0602c74d99bb9ef3f77";
  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 3999L)
  public static SubLSymbol $format_nil_percent$;
  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 4175L)
  public static SubLSymbol $format_nil_tilde$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$FORMAT;
  private static final SubLSymbol $sym2$INTEGERP;
  private static final SubLString $str3$0123456789;
  private static final SubLSymbol $sym4$FORMAT_NIL_A;
  private static final SubLSymbol $sym5$FORMAT_NIL;
  private static final SubLSymbol $sym6$FORMAT_NIL_A_NO_COPY;
  private static final SubLSymbol $sym7$FORMAT_NIL_S;
  private static final SubLSymbol $sym8$FORMAT_NIL_S_NO_COPY;
  private static final SubLSymbol $sym9$FORMAT_NIL_D;
  private static final SubLSymbol $sym10$NUMBERP;
  private static final SubLSymbol $sym11$FORMAT_NIL_D_NO_COPY;
  private static final SubLString $str12$_;
  private static final SubLSymbol $sym13$FORMAT_NIL_PERCENT;
  private static final SubLString $str14$_;
  private static final SubLSymbol $sym15$FORMAT_NIL_TILDE;
  private static final SubLString $str16$ASD__;
  private static final SubLSymbol $sym17$CHAR_EQUAL;
  private static final SubLSymbol $sym18$_FORMAT_NIL_PERCENT_;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$_FORMAT_NIL_TILDE_;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$COPY_SEQ;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$CCONCATENATE;
  private static final SubLList $list25;
  private static final SubLString $str26$_A;
  private static final SubLString $str27$_S;
  private static final SubLString $str28$_D;
  private static final SubLString $str29$__;
  private static final SubLString $str30$__;
  private static final SubLSymbol $sym31$STRINGP;
  private static final SubLString $str32$;
  private static final SubLString $str33$___A;

  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 1219L)
  public static SubLObject format_nil(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject format_control = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    format_control = current.first();
    final SubLObject format_arguments;
    current = ( format_arguments = current.rest() );
    if( NIL != format_nil_control_validator( format_control ) )
    {
      return format_nil_internal( format_control, format_arguments );
    }
    return ConsesLow.listS( $sym1$FORMAT, NIL, format_control, ConsesLow.append( format_arguments, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 1548L)
  public static SubLObject princ_integer_to_string(final SubLObject integer)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.integerp( integer ) : integer;
    if( integer.isBignum() || !TEN_INTEGER.eql( print_high.$print_base$.getDynamicValue( thread ) ) )
    {
      return print_high.princ_to_string( integer );
    }
    final SubLObject string_length = Numbers.add( integer.isNegative() ? ONE_INTEGER : ZERO_INTEGER, integer_decimal_length( integer ) );
    SubLObject string = Strings.make_string( string_length, UNPROVIDED );
    SubLObject magnitude = Numbers.abs( integer );
    final SubLObject digits = $str3$0123456789;
    SubLObject digit = NIL;
    SubLObject index = ZERO_INTEGER;
    while ( !magnitude.numL( TEN_INTEGER ))
    {
      digit = Numbers.mod( magnitude, TEN_INTEGER );
      magnitude = Numbers.integerDivide( magnitude, TEN_INTEGER );
      Strings.set_char( string, index, Strings.sublisp_char( digits, digit ) );
      index = Numbers.add( index, ONE_INTEGER );
    }
    Strings.set_char( string, index, Strings.sublisp_char( digits, magnitude ) );
    index = Numbers.add( index, ONE_INTEGER );
    if( integer.isNegative() )
    {
      Strings.set_char( string, index, Characters.CHAR_hyphen );
    }
    string = Sequences.nreverse( string );
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 2386L)
  public static SubLObject format_nil_a(final SubLObject v_object)
  {
    if( v_object.isSymbol() )
    {
      return Sequences.copy_seq( Symbols.symbol_name( v_object ) );
    }
    if( v_object.isString() )
    {
      return Sequences.copy_seq( v_object );
    }
    if( v_object.isInteger() )
    {
      return princ_integer_to_string( v_object );
    }
    return print_high.princ_to_string( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 2699L)
  public static SubLObject format_nil_a_no_copy(final SubLObject v_object)
  {
    if( v_object.isSymbol() )
    {
      return Symbols.symbol_name( v_object );
    }
    if( v_object.isString() )
    {
      return v_object;
    }
    if( v_object.isInteger() )
    {
      return princ_integer_to_string( v_object );
    }
    return print_high.princ_to_string( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 3019L)
  public static SubLObject format_nil_s(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( v_object.isSymbol() && Packages.$package$.getDynamicValue( thread ).eql( Symbols.symbol_package( v_object ) ) && v_object.eql( Packages.find_symbol( Symbols.symbol_name( v_object ), Packages.$package$
        .getDynamicValue( thread ) ) ) )
    {
      return format_nil_a( v_object );
    }
    if( v_object.isNumber() )
    {
      return format_nil_a( v_object );
    }
    return print_high.prin1_to_string( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 3362L)
  public static SubLObject format_nil_s_no_copy(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( v_object.isSymbol() && Packages.$package$.getDynamicValue( thread ).eql( Symbols.symbol_package( v_object ) ) && v_object.eql( Packages.find_symbol( Symbols.symbol_name( v_object ), Packages.$package$
        .getDynamicValue( thread ) ) ) )
    {
      return format_nil_a_no_copy( v_object );
    }
    if( v_object.isNumber() )
    {
      return format_nil_a_no_copy( v_object );
    }
    return print_high.prin1_to_string( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 3728L)
  public static SubLObject format_nil_d(final SubLObject v_object)
  {
    assert NIL != Types.numberp( v_object ) : v_object;
    return format_nil_a( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 3856L)
  public static SubLObject format_nil_d_no_copy(final SubLObject v_object)
  {
    assert NIL != Types.numberp( v_object ) : v_object;
    return format_nil_a_no_copy( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 4068L)
  public static SubLObject format_nil_percent()
  {
    return Sequences.copy_seq( $format_nil_percent$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 4241L)
  public static SubLObject format_nil_tilde()
  {
    return Sequences.copy_seq( $format_nil_tilde$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 4344L)
  public static SubLObject format_nil_internal(final SubLObject format_control, final SubLObject format_arguments)
  {
    return format_nil_simplify( format_nil_expand( format_nil_control_split( format_control ), format_arguments ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 4627L)
  public static SubLObject format_nil_control_validator(final SubLObject format_control)
  {
    if( !format_control.isString() )
    {
      return NIL;
    }
    final SubLObject length = Sequences.length( format_control );
    SubLObject next_start;
    SubLObject next_control;
    SubLObject control_type_pos;
    SubLObject control_type;
    for( next_start = NIL, next_control = NIL, next_start = ZERO_INTEGER, next_control = Sequences.position( Characters.CHAR_tilde, format_control, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ),
        next_start, NIL ); NIL != next_control; next_control = Sequences.position( Characters.CHAR_tilde, format_control, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), next_start, NIL ) )
    {
      control_type_pos = Numbers.add( ONE_INTEGER, next_control );
      if( !control_type_pos.numL( length ) )
      {
        return NIL;
      }
      control_type = Strings.sublisp_char( format_control, control_type_pos );
      if( NIL == Sequences.find( control_type, $str16$ASD__, Symbols.symbol_function( $sym17$CHAR_EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return NIL;
      }
      next_start = Numbers.add( next_control, TWO_INTEGER );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 5398L)
  public static SubLObject format_nil_simplify(final SubLObject expansion)
  {
    if( NIL == expansion.rest() )
    {
      final SubLObject item = expansion.first();
      if( item.isAtom() )
      {
        if( item == $sym18$_FORMAT_NIL_PERCENT_ )
        {
          return $list19;
        }
        if( item == $sym20$_FORMAT_NIL_TILDE_ )
        {
          return $list21;
        }
        if( item.isString() )
        {
          return ConsesLow.list( $sym22$COPY_SEQ, item );
        }
      }
      else
      {
        SubLObject current;
        final SubLObject datum = current = item;
        SubLObject operator = NIL;
        SubLObject arg = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
        operator = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
        arg = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( operator == $sym6$FORMAT_NIL_A_NO_COPY )
          {
            return ConsesLow.list( $sym4$FORMAT_NIL_A, arg );
          }
          if( operator == $sym8$FORMAT_NIL_S_NO_COPY )
          {
            return ConsesLow.list( $sym7$FORMAT_NIL_S, arg );
          }
          if( operator == $sym11$FORMAT_NIL_D_NO_COPY )
          {
            return ConsesLow.list( $sym9$FORMAT_NIL_D, arg );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
        }
      }
    }
    return reader.bq_cons( $sym24$CCONCATENATE, ConsesLow.append( expansion, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 6182L)
  public static SubLObject format_nil_expand(final SubLObject format_controls, final SubLObject format_arguments)
  {
    if( NIL == format_controls )
    {
      return NIL;
    }
    SubLObject next_control = NIL;
    SubLObject rest_control = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( format_controls, format_controls, $list25 );
    next_control = format_controls.first();
    final SubLObject current = rest_control = format_controls.rest();
    final SubLObject next_argument = format_arguments.first();
    final SubLObject rest_arguments = format_arguments.rest();
    if( $str26$_A.equalp( next_control ) )
    {
      return ConsesLow.cons( ConsesLow.list( $sym6$FORMAT_NIL_A_NO_COPY, next_argument ), format_nil_expand( rest_control, rest_arguments ) );
    }
    if( $str27$_S.equalp( next_control ) )
    {
      return ConsesLow.cons( ConsesLow.list( $sym8$FORMAT_NIL_S_NO_COPY, next_argument ), format_nil_expand( rest_control, rest_arguments ) );
    }
    if( $str28$_D.equalp( next_control ) )
    {
      return ConsesLow.cons( ConsesLow.list( $sym11$FORMAT_NIL_D_NO_COPY, next_argument ), format_nil_expand( rest_control, rest_arguments ) );
    }
    if( $str29$__.equalp( next_control ) )
    {
      return ConsesLow.cons( $sym18$_FORMAT_NIL_PERCENT_, format_nil_expand( rest_control, format_arguments ) );
    }
    if( $str30$__.equalp( next_control ) )
    {
      return ConsesLow.cons( $sym20$_FORMAT_NIL_TILDE_, format_nil_expand( rest_control, format_arguments ) );
    }
    return ConsesLow.cons( next_control, format_nil_expand( rest_control, format_arguments ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 7365L)
  public static SubLObject format_nil_control_split(final SubLObject format_control)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( format_control ) : format_control;
    if( format_control.equal( $str32$ ) )
    {
      return NIL;
    }
    thread.resetMultipleValues();
    final SubLObject next_control = format_nil_control_split_internal( format_control );
    final SubLObject rest_control = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return ConsesLow.cons( next_control, format_nil_control_split( rest_control ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 7772L)
  public static SubLObject format_nil_control_split_internal(final SubLObject format_control)
  {
    final SubLObject position = Sequences.position( Characters.CHAR_tilde, format_control, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == position )
    {
      return Values.values( format_control, $str32$ );
    }
    if( ZERO_INTEGER.numE( position ) )
    {
      return Values.values( Sequences.subseq( format_control, ZERO_INTEGER, TWO_INTEGER ), Sequences.subseq( format_control, TWO_INTEGER, NIL ) );
    }
    return Values.values( Sequences.subseq( format_control, ZERO_INTEGER, position ), Sequences.subseq( format_control, position, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 8182L)
  public static SubLObject integer_decimal_length(final SubLObject integer)
  {
    assert NIL != Types.integerp( integer ) : integer;
    SubLObject magnitude = Numbers.abs( integer );
    SubLObject length = ONE_INTEGER;
    while ( !magnitude.numL( TEN_INTEGER ))
    {
      length = Numbers.add( length, ONE_INTEGER );
      magnitude = Numbers.integerDivide( magnitude, TEN_INTEGER );
    }
    return length;
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 8502L)
  public static SubLObject format_one_per_line(final SubLObject objects, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    SubLObject cdolist_list_var = objects;
    SubLObject obj = NIL;
    obj = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      PrintLow.format( stream, $str33$___A, obj );
      cdolist_list_var = cdolist_list_var.rest();
      obj = cdolist_list_var.first();
    }
    streams_high.force_output( stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 8962L)
  public static SubLObject print_one_per_line(final SubLObject objects, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    return print_one_aspect_per_line( objects, Symbols.symbol_function( IDENTITY ), stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 9205L)
  public static SubLObject p1(final SubLObject objects, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    return print_one_per_line( objects, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 9359L)
  public static SubLObject print_one_aspect_per_line(final SubLObject objects, final SubLObject key, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    SubLObject cdolist_list_var = objects;
    SubLObject obj = NIL;
    obj = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      print_high.print( Functions.funcall( key, obj ), stream );
      cdolist_list_var = cdolist_list_var.rest();
      obj = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 9693L)
  public static SubLObject force_format(final SubLObject stream, final SubLObject control_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7,
      SubLObject arg8)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = NIL;
    }
    if( arg4 == UNPROVIDED )
    {
      arg4 = NIL;
    }
    if( arg5 == UNPROVIDED )
    {
      arg5 = NIL;
    }
    if( arg6 == UNPROVIDED )
    {
      arg6 = NIL;
    }
    if( arg7 == UNPROVIDED )
    {
      arg7 = NIL;
    }
    if( arg8 == UNPROVIDED )
    {
      arg8 = NIL;
    }
    final SubLObject result = PrintLow.format( stream, control_string, new SubLObject[] { arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8
    } );
    streams_high.force_output( stream );
    return result;
  }

  public static SubLObject declare_format_nil_file()
  {
    SubLFiles.declareMacro( me, "format_nil", "FORMAT-NIL" );
    SubLFiles.declareFunction( me, "princ_integer_to_string", "PRINC-INTEGER-TO-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "format_nil_a", "FORMAT-NIL-A", 1, 0, false );
    SubLFiles.declareFunction( me, "format_nil_a_no_copy", "FORMAT-NIL-A-NO-COPY", 1, 0, false );
    SubLFiles.declareFunction( me, "format_nil_s", "FORMAT-NIL-S", 1, 0, false );
    SubLFiles.declareFunction( me, "format_nil_s_no_copy", "FORMAT-NIL-S-NO-COPY", 1, 0, false );
    SubLFiles.declareFunction( me, "format_nil_d", "FORMAT-NIL-D", 1, 0, false );
    SubLFiles.declareFunction( me, "format_nil_d_no_copy", "FORMAT-NIL-D-NO-COPY", 1, 0, false );
    SubLFiles.declareFunction( me, "format_nil_percent", "FORMAT-NIL-PERCENT", 0, 0, false );
    SubLFiles.declareFunction( me, "format_nil_tilde", "FORMAT-NIL-TILDE", 0, 0, false );
    SubLFiles.declareFunction( me, "format_nil_internal", "FORMAT-NIL-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "format_nil_control_validator", "FORMAT-NIL-CONTROL-VALIDATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "format_nil_simplify", "FORMAT-NIL-SIMPLIFY", 1, 0, false );
    SubLFiles.declareFunction( me, "format_nil_expand", "FORMAT-NIL-EXPAND", 2, 0, false );
    SubLFiles.declareFunction( me, "format_nil_control_split", "FORMAT-NIL-CONTROL-SPLIT", 1, 0, false );
    SubLFiles.declareFunction( me, "format_nil_control_split_internal", "FORMAT-NIL-CONTROL-SPLIT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "integer_decimal_length", "INTEGER-DECIMAL-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "format_one_per_line", "FORMAT-ONE-PER-LINE", 1, 1, false );
    SubLFiles.declareFunction( me, "print_one_per_line", "PRINT-ONE-PER-LINE", 1, 1, false );
    SubLFiles.declareFunction( me, "p1", "P1", 1, 1, false );
    SubLFiles.declareFunction( me, "print_one_aspect_per_line", "PRINT-ONE-ASPECT-PER-LINE", 2, 1, false );
    SubLFiles.declareFunction( me, "force_format", "FORCE-FORMAT", 2, 8, false );
    return NIL;
  }

  public static SubLObject init_format_nil_file()
  {
    $format_nil_percent$ = SubLFiles.defconstant( "*FORMAT-NIL-PERCENT*", $str12$_ );
    $format_nil_tilde$ = SubLFiles.defconstant( "*FORMAT-NIL-TILDE*", $str14$_ );
    return NIL;
  }

  public static SubLObject setup_format_nil_file()
  {
    access_macros.register_macro_helper( $sym4$FORMAT_NIL_A, $sym5$FORMAT_NIL );
    access_macros.register_macro_helper( $sym6$FORMAT_NIL_A_NO_COPY, $sym5$FORMAT_NIL );
    access_macros.register_macro_helper( $sym7$FORMAT_NIL_S, $sym5$FORMAT_NIL );
    access_macros.register_macro_helper( $sym8$FORMAT_NIL_S_NO_COPY, $sym5$FORMAT_NIL );
    access_macros.register_macro_helper( $sym9$FORMAT_NIL_D, $sym5$FORMAT_NIL );
    access_macros.register_macro_helper( $sym11$FORMAT_NIL_D_NO_COPY, $sym5$FORMAT_NIL );
    access_macros.register_macro_helper( $sym13$FORMAT_NIL_PERCENT, $sym5$FORMAT_NIL );
    access_macros.register_macro_helper( $sym15$FORMAT_NIL_TILDE, $sym5$FORMAT_NIL );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_format_nil_file();
  }

  @Override
  public void initializeVariables()
  {
    init_format_nil_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_format_nil_file();
  }
  static
  {
    me = new format_nil();
    $format_nil_percent$ = null;
    $format_nil_tilde$ = null;
    $list0 = ConsesLow.list( makeSymbol( "FORMAT-CONTROL" ), makeSymbol( "&REST" ), makeSymbol( "FORMAT-ARGUMENTS" ) );
    $sym1$FORMAT = makeSymbol( "FORMAT" );
    $sym2$INTEGERP = makeSymbol( "INTEGERP" );
    $str3$0123456789 = makeString( "0123456789" );
    $sym4$FORMAT_NIL_A = makeSymbol( "FORMAT-NIL-A" );
    $sym5$FORMAT_NIL = makeSymbol( "FORMAT-NIL" );
    $sym6$FORMAT_NIL_A_NO_COPY = makeSymbol( "FORMAT-NIL-A-NO-COPY" );
    $sym7$FORMAT_NIL_S = makeSymbol( "FORMAT-NIL-S" );
    $sym8$FORMAT_NIL_S_NO_COPY = makeSymbol( "FORMAT-NIL-S-NO-COPY" );
    $sym9$FORMAT_NIL_D = makeSymbol( "FORMAT-NIL-D" );
    $sym10$NUMBERP = makeSymbol( "NUMBERP" );
    $sym11$FORMAT_NIL_D_NO_COPY = makeSymbol( "FORMAT-NIL-D-NO-COPY" );
    $str12$_ = makeString( "\n" );
    $sym13$FORMAT_NIL_PERCENT = makeSymbol( "FORMAT-NIL-PERCENT" );
    $str14$_ = makeString( "~" );
    $sym15$FORMAT_NIL_TILDE = makeSymbol( "FORMAT-NIL-TILDE" );
    $str16$ASD__ = makeString( "ASD%~" );
    $sym17$CHAR_EQUAL = makeSymbol( "CHAR-EQUAL" );
    $sym18$_FORMAT_NIL_PERCENT_ = makeSymbol( "*FORMAT-NIL-PERCENT*" );
    $list19 = ConsesLow.list( makeSymbol( "FORMAT-NIL-PERCENT" ) );
    $sym20$_FORMAT_NIL_TILDE_ = makeSymbol( "*FORMAT-NIL-TILDE*" );
    $list21 = ConsesLow.list( makeSymbol( "FORMAT-NIL-TILDE" ) );
    $sym22$COPY_SEQ = makeSymbol( "COPY-SEQ" );
    $list23 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "ARG" ) );
    $sym24$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $list25 = ConsesLow.cons( makeSymbol( "NEXT-CONTROL" ), makeSymbol( "REST-CONTROL" ) );
    $str26$_A = makeString( "~A" );
    $str27$_S = makeString( "~S" );
    $str28$_D = makeString( "~D" );
    $str29$__ = makeString( "~%" );
    $str30$__ = makeString( "~~" );
    $sym31$STRINGP = makeSymbol( "STRINGP" );
    $str32$ = makeString( "" );
    $str33$___A = makeString( "~%~A" );
  }
}
/*
 * 
 * Total time: 131 ms
 * 
 */