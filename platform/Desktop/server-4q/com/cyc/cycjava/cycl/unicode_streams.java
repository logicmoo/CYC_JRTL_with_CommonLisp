package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
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

public final class unicode_streams
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.unicode_streams";
  public static final String myFingerPrint = "14bf9cb315d3916ff5dceb5432c10726a6d202645bc60cf01952124ad17b49c2";
  @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 912L)
  private static SubLSymbol $unicode_linefeed$;
  @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 955L)
  private static SubLSymbol $unicode_carriage_return$;
  @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1005L)
  public static SubLSymbol $dtp_utf8_stream$;
  private static final SubLSymbol $sym0$UTF8_STREAM;
  private static final SubLSymbol $sym1$UTF8_STREAM_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_UTF8_STREAM;
  private static final SubLSymbol $sym7$UTF8_STREAM_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$UTF8_STREAM_STREAM;
  private static final SubLSymbol $sym10$_CSETF_UTF8_STREAM_STREAM;
  private static final SubLSymbol $sym11$UTF8_STREAM_CACHE;
  private static final SubLSymbol $sym12$_CSETF_UTF8_STREAM_CACHE;
  private static final SubLSymbol $kw13$STREAM;
  private static final SubLSymbol $kw14$CACHE;
  private static final SubLString $str15$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw16$BEGIN;
  private static final SubLSymbol $sym17$MAKE_UTF8_STREAM;
  private static final SubLSymbol $kw18$SLOT;
  private static final SubLSymbol $kw19$END;
  private static final SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_UTF8_STREAM_METHOD;
  private static final SubLString $str21$__utf8_stream__s_cache___s_;
  private static final SubLSymbol $kw22$CLOSED;
  private static final SubLString $str23$Invalid_utf8_stream___s__;
  private static final SubLSymbol $sym24$UNICODE_CHARACTER_P;
  private static final SubLSymbol $sym25$UNICODE_STRING_P;
  private static final SubLSymbol $sym26$INTEGERP;
  private static final SubLString $str27$Invalid_Unicode_character_in_Stre;
  private static final SubLString $str28$Invalid_Unicode_character_in_Stre;
  private static final SubLInteger $int29$256;
  private static final SubLString $str30$EOF_in_Unicode_stream___s__;
  private static final SubLSymbol $kw31$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym32$IGNORE_ERRORS_HANDLER;
  private static final SubLString $str33$Internal_Error_in_Unicode_stream_;

  @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1005L)
  public static SubLObject utf8_stream_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_utf8_stream( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1005L)
  public static SubLObject utf8_stream_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $utf8_stream_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1005L)
  public static SubLObject utf8_stream_stream(final SubLObject v_object)
  {
    assert NIL != utf8_stream_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1005L)
  public static SubLObject utf8_stream_cache(final SubLObject v_object)
  {
    assert NIL != utf8_stream_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1005L)
  public static SubLObject _csetf_utf8_stream_stream(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != utf8_stream_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1005L)
  public static SubLObject _csetf_utf8_stream_cache(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != utf8_stream_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1005L)
  public static SubLObject make_utf8_stream(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $utf8_stream_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw13$STREAM ) )
      {
        _csetf_utf8_stream_stream( v_new, current_value );
      }
      else if( pcase_var.eql( $kw14$CACHE ) )
      {
        _csetf_utf8_stream_cache( v_new, current_value );
      }
      else
      {
        Errors.error( $str15$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1005L)
  public static SubLObject visit_defstruct_utf8_stream(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw16$BEGIN, $sym17$MAKE_UTF8_STREAM, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw13$STREAM, utf8_stream_stream( obj ) );
    Functions.funcall( visitor_fn, obj, $kw18$SLOT, $kw14$CACHE, utf8_stream_cache( obj ) );
    Functions.funcall( visitor_fn, obj, $kw19$END, $sym17$MAKE_UTF8_STREAM, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1005L)
  public static SubLObject visit_defstruct_object_utf8_stream_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_utf8_stream( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1162L)
  public static SubLObject utf8_stream_create(final SubLObject stream)
  {
    final SubLObject utf8_stream_obj = make_utf8_stream( UNPROVIDED );
    _csetf_utf8_stream_stream( utf8_stream_obj, stream );
    _csetf_utf8_stream_cache( utf8_stream_obj, NIL );
    return utf8_stream_obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1408L)
  public static SubLObject print_utf8_stream(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    PrintLow.format( stream, $str21$__utf8_stream__s_cache___s_, utf8_stream_stream( v_object ), utf8_stream_cache( v_object ) );
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1651L)
  public static SubLObject open_utf8(final SubLObject filename, final SubLObject direction)
  {
    final SubLObject stream = compatibility.open_binary( filename, direction );
    if( NIL == stream )
    {
      return NIL;
    }
    return utf8_stream_create( stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 1839L)
  public static SubLObject close_utf8(final SubLObject stream)
  {
    if( NIL == utf8_stream_p( stream ) )
    {
      return NIL;
    }
    final SubLObject utf8_stream = utf8_stream_stream( stream );
    if( NIL != utf8_stream )
    {
      streams_high.close( utf8_stream, UNPROVIDED );
      _csetf_utf8_stream_stream( stream, NIL );
    }
    return $kw22$CLOSED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 2107L)
  public static SubLObject write_unicode_char_to_utf8(final SubLObject unicode_character, SubLObject ustream)
  {
    if( ustream == UNPROVIDED )
    {
      ustream = utf8_stream_create( StreamsLow.$standard_output$.getDynamicValue() );
    }
    if( NIL == utf8_stream_p( ustream ) )
    {
      Errors.error( $str23$Invalid_utf8_stream___s__, ustream );
    }
    assert NIL != unicode_strings.unicode_character_p( unicode_character ) : unicode_character;
    final SubLObject vect = unicode_strings.to_utf8_vector( unicode_character );
    final SubLObject stream = utf8_stream_stream( ustream );
    SubLObject cdotimes_end_var;
    SubLObject i;
    for( cdotimes_end_var = Sequences.length( vect ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      streams_high.write_byte( Vectors.aref( vect, i ), stream );
    }
    return unicode_character;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 2662L)
  public static SubLObject write_unicode_string_to_utf8(final SubLObject ucode_string, SubLObject ustream, SubLObject start, SubLObject end)
  {
    if( ustream == UNPROVIDED )
    {
      ustream = utf8_stream_create( StreamsLow.$standard_output$.getDynamicValue() );
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    if( NIL == utf8_stream_p( ustream ) )
    {
      Errors.error( $str23$Invalid_utf8_stream___s__, ustream );
    }
    assert NIL != unicode_strings.unicode_string_p( ucode_string ) : ucode_string;
    if( NIL == end )
    {
      end = Numbers.subtract( Sequences.length( unicode_strings.unicode_string_vect( ucode_string ) ), ONE_INTEGER );
    }
    assert NIL != Types.integerp( end ) : end;
    assert NIL != Types.integerp( start ) : start;
    final SubLObject stream = utf8_stream_stream( ustream );
    final SubLObject ucode_vector = unicode_strings.unicode_string_vect( ucode_string );
    final SubLObject utf8_vector = unicode_strings.unicode_vector_to_utf8_vector( ucode_vector, start, end );
    SubLObject cdotimes_end_var;
    SubLObject i;
    for( cdotimes_end_var = Sequences.length( utf8_vector ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      streams_high.write_byte( Vectors.aref( utf8_vector, i ), stream );
    }
    return ucode_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 3507L)
  public static SubLObject write_unicode_string_to_utf8_line(final SubLObject ucode_string, SubLObject ustream, SubLObject start, SubLObject end)
  {
    if( ustream == UNPROVIDED )
    {
      ustream = utf8_stream_create( StreamsLow.$standard_output$.getDynamicValue() );
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    if( NIL == utf8_stream_p( ustream ) )
    {
      Errors.error( $str23$Invalid_utf8_stream___s__, ustream );
    }
    write_unicode_string_to_utf8( ucode_string, ustream, start, end );
    streams_high.write_byte( $unicode_linefeed$.getGlobalValue(), utf8_stream_stream( ustream ) );
    return ucode_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 4011L)
  public static SubLObject read_utf8_char(SubLObject ustream, SubLObject eof_error_p, SubLObject eof_value, SubLObject recursive_p)
  {
    if( ustream == UNPROVIDED )
    {
      ustream = utf8_stream_create( StreamsLow.$standard_input$.getDynamicValue() );
    }
    if( eof_error_p == UNPROVIDED )
    {
      eof_error_p = T;
    }
    if( eof_value == UNPROVIDED )
    {
      eof_value = NIL;
    }
    if( recursive_p == UNPROVIDED )
    {
      recursive_p = NIL;
    }
    final SubLObject val = read_utf8_char_helper( ustream, eof_error_p, eof_value, recursive_p );
    if( NIL == eof_error_p && eof_value.equal( val ) )
    {
      return eof_value;
    }
    return unicode_strings.unicode_char_create( val );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 4877L)
  public static SubLObject read_utf8_char_helper(SubLObject ustream, SubLObject eof_error_p, SubLObject eof_value, SubLObject recursive_p)
  {
    if( ustream == UNPROVIDED )
    {
      ustream = utf8_stream_create( StreamsLow.$standard_input$.getDynamicValue() );
    }
    if( eof_error_p == UNPROVIDED )
    {
      eof_error_p = T;
    }
    if( eof_value == UNPROVIDED )
    {
      eof_value = NIL;
    }
    if( recursive_p == UNPROVIDED )
    {
      recursive_p = NIL;
    }
    if( NIL == utf8_stream_p( ustream ) )
    {
      Errors.error( $str23$Invalid_utf8_stream___s__, ustream );
    }
    final SubLObject stream = utf8_stream_stream( ustream );
    final SubLObject v_char = utf8_stream_cache( ustream );
    if( NIL != v_char )
    {
      _csetf_utf8_stream_cache( ustream, NIL );
      return v_char;
    }
    final SubLObject first = streams_high.read_byte( stream, eof_error_p, eof_value );
    if( eof_value.equal( first ) )
    {
      return first;
    }
    final SubLObject len = unicode_strings.length_utf8_from_first_byte( first );
    if( len.isNegative() )
    {
      Errors.error( $str27$Invalid_Unicode_character_in_Stre, stream, first );
      return eof_value;
    }
    if( len.eql( ONE_INTEGER ) )
    {
      return first;
    }
    final SubLObject vect = Vectors.make_vector( len, UNPROVIDED );
    Vectors.set_aref( vect, ZERO_INTEGER, first );
    SubLObject cdotimes_end_var;
    SubLObject i;
    SubLObject v_byte;
    for( cdotimes_end_var = Numbers.subtract( len, ONE_INTEGER ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      v_byte = streams_high.read_byte( stream, eof_error_p, eof_value );
      if( eof_value.equal( v_byte ) && NIL != eof_error_p )
      {
        Errors.error( $str28$Invalid_Unicode_character_in_Stre, stream, first );
        return eof_value;
      }
      Vectors.set_aref( vect, Numbers.add( i, ONE_INTEGER ), v_byte );
    }
    final SubLObject v_char2 = unicode_strings.get_unicode_char_at_offset( vect, ZERO_INTEGER );
    if( v_char2.isNegative() )
    {
      Errors.error( $str27$Invalid_Unicode_character_in_Stre, stream, first );
    }
    return v_char2;
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-streams.lisp", position = 6511L)
  public static SubLObject read_utf8_line(SubLObject ustream, SubLObject eof_error_p, SubLObject eof_value, SubLObject recursive_p)
  {
    if( ustream == UNPROVIDED )
    {
      ustream = utf8_stream_create( StreamsLow.$standard_input$.getDynamicValue() );
    }
    if( eof_error_p == UNPROVIDED )
    {
      eof_error_p = T;
    }
    if( eof_value == UNPROVIDED )
    {
      eof_value = NIL;
    }
    if( recursive_p == UNPROVIDED )
    {
      recursive_p = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == utf8_stream_p( ustream ) )
    {
      Errors.error( $str23$Invalid_utf8_stream___s__, ustream );
    }
    SubLObject output_buffer = Vectors.make_vector( $int29$256, UNPROVIDED );
    SubLObject offset = ZERO_INTEGER;
    SubLObject v_char;
    SubLObject newlen;
    SubLObject new_o_buffer;
    SubLObject cdotimes_end_var;
    SubLObject i;
    for( v_char = eof_value, v_char = read_utf8_char_helper( ustream, eof_error_p, eof_value, recursive_p ); !v_char.equal( eof_value ) && NIL != Numbers.numNE( v_char, $unicode_linefeed$.getGlobalValue() )
        && NIL != Numbers.numNE( v_char, $unicode_carriage_return$.getGlobalValue() ); v_char = read_utf8_char_helper( ustream, eof_error_p, eof_value, recursive_p ) )
    {
      if( offset.numGE( Sequences.length( output_buffer ) ) )
      {
        newlen = Numbers.add( Sequences.length( output_buffer ), $int29$256 );
        new_o_buffer = Vectors.make_vector( newlen, UNPROVIDED );
        for( cdotimes_end_var = Sequences.length( output_buffer ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          Vectors.set_aref( new_o_buffer, i, Vectors.aref( output_buffer, i ) );
        }
        output_buffer = new_o_buffer;
      }
      Vectors.set_aref( output_buffer, offset, v_char );
      offset = Numbers.add( offset, ONE_INTEGER );
    }
    if( v_char.equal( eof_value ) )
    {
      if( offset.isZero() )
      {
        if( NIL == eof_error_p )
        {
          return eof_value;
        }
        Errors.error( $str30$EOF_in_Unicode_stream___s__, ustream );
      }
    }
    else if( v_char.numE( $unicode_linefeed$.getGlobalValue() ) )
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw31$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym32$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            final SubLObject next_char = read_utf8_char_helper( ustream, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            if( !next_char.numE( $unicode_carriage_return$.getGlobalValue() ) )
            {
              _csetf_utf8_stream_cache( ustream, next_char );
            }
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw31$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    else if( v_char.numE( $unicode_carriage_return$.getGlobalValue() ) )
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw31$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym32$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            final SubLObject next_char = read_utf8_char_helper( ustream, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            if( !next_char.numE( $unicode_linefeed$.getGlobalValue() ) )
            {
              _csetf_utf8_stream_cache( ustream, next_char );
            }
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw31$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    else
    {
      Errors.error( $str33$Internal_Error_in_Unicode_stream_, ustream );
    }
    return unicode_strings.unicode_string_create( Sequences.subseq( output_buffer, ZERO_INTEGER, offset ) );
  }

  public static SubLObject declare_unicode_streams_file()
  {
    SubLFiles.declareFunction( me, "utf8_stream_print_function_trampoline", "UTF8-STREAM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "utf8_stream_p", "UTF8-STREAM-P", 1, 0, false );
    new $utf8_stream_p$UnaryFunction();
    SubLFiles.declareFunction( me, "utf8_stream_stream", "UTF8-STREAM-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "utf8_stream_cache", "UTF8-STREAM-CACHE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_utf8_stream_stream", "_CSETF-UTF8-STREAM-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_utf8_stream_cache", "_CSETF-UTF8-STREAM-CACHE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_utf8_stream", "MAKE-UTF8-STREAM", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_utf8_stream", "VISIT-DEFSTRUCT-UTF8-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_utf8_stream_method", "VISIT-DEFSTRUCT-OBJECT-UTF8-STREAM-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "utf8_stream_create", "UTF8-STREAM-CREATE", 1, 0, false );
    SubLFiles.declareFunction( me, "print_utf8_stream", "PRINT-UTF8-STREAM", 3, 0, false );
    SubLFiles.declareFunction( me, "open_utf8", "OPEN-UTF8", 2, 0, false );
    SubLFiles.declareFunction( me, "close_utf8", "CLOSE-UTF8", 1, 0, false );
    SubLFiles.declareFunction( me, "write_unicode_char_to_utf8", "WRITE-UNICODE-CHAR-TO-UTF8", 1, 1, false );
    SubLFiles.declareFunction( me, "write_unicode_string_to_utf8", "WRITE-UNICODE-STRING-TO-UTF8", 1, 3, false );
    SubLFiles.declareFunction( me, "write_unicode_string_to_utf8_line", "WRITE-UNICODE-STRING-TO-UTF8-LINE", 1, 3, false );
    SubLFiles.declareFunction( me, "read_utf8_char", "READ-UTF8-CHAR", 0, 4, false );
    SubLFiles.declareFunction( me, "read_utf8_char_helper", "READ-UTF8-CHAR-HELPER", 0, 4, false );
    SubLFiles.declareFunction( me, "read_utf8_line", "READ-UTF8-LINE", 0, 4, false );
    return NIL;
  }

  public static SubLObject init_unicode_streams_file()
  {
    $unicode_linefeed$ = SubLFiles.defconstant( "UNICODE-LINEFEED", TEN_INTEGER );
    $unicode_carriage_return$ = SubLFiles.defconstant( "UNICODE-CARRIAGE-RETURN", THIRTEEN_INTEGER );
    $dtp_utf8_stream$ = SubLFiles.defconstant( "*DTP-UTF8-STREAM*", $sym0$UTF8_STREAM );
    return NIL;
  }

  public static SubLObject setup_unicode_streams_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_utf8_stream$.getGlobalValue(), Symbols.symbol_function( $sym7$UTF8_STREAM_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$UTF8_STREAM_STREAM, $sym10$_CSETF_UTF8_STREAM_STREAM );
    Structures.def_csetf( $sym11$UTF8_STREAM_CACHE, $sym12$_CSETF_UTF8_STREAM_CACHE );
    Equality.identity( $sym0$UTF8_STREAM );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_utf8_stream$.getGlobalValue(), Symbols.symbol_function( $sym20$VISIT_DEFSTRUCT_OBJECT_UTF8_STREAM_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_unicode_streams_file();
  }

  @Override
  public void initializeVariables()
  {
    init_unicode_streams_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_unicode_streams_file();
  }
  static
  {
    me = new unicode_streams();
    $unicode_linefeed$ = null;
    $unicode_carriage_return$ = null;
    $dtp_utf8_stream$ = null;
    $sym0$UTF8_STREAM = makeSymbol( "UTF8-STREAM" );
    $sym1$UTF8_STREAM_P = makeSymbol( "UTF8-STREAM-P" );
    $list2 = ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "CACHE" ) );
    $list3 = ConsesLow.list( makeKeyword( "STREAM" ), makeKeyword( "CACHE" ) );
    $list4 = ConsesLow.list( makeSymbol( "UTF8-STREAM-STREAM" ), makeSymbol( "UTF8-STREAM-CACHE" ) );
    $list5 = ConsesLow.list( makeSymbol( "_CSETF-UTF8-STREAM-STREAM" ), makeSymbol( "_CSETF-UTF8-STREAM-CACHE" ) );
    $sym6$PRINT_UTF8_STREAM = makeSymbol( "PRINT-UTF8-STREAM" );
    $sym7$UTF8_STREAM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "UTF8-STREAM-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "UTF8-STREAM-P" ) );
    $sym9$UTF8_STREAM_STREAM = makeSymbol( "UTF8-STREAM-STREAM" );
    $sym10$_CSETF_UTF8_STREAM_STREAM = makeSymbol( "_CSETF-UTF8-STREAM-STREAM" );
    $sym11$UTF8_STREAM_CACHE = makeSymbol( "UTF8-STREAM-CACHE" );
    $sym12$_CSETF_UTF8_STREAM_CACHE = makeSymbol( "_CSETF-UTF8-STREAM-CACHE" );
    $kw13$STREAM = makeKeyword( "STREAM" );
    $kw14$CACHE = makeKeyword( "CACHE" );
    $str15$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw16$BEGIN = makeKeyword( "BEGIN" );
    $sym17$MAKE_UTF8_STREAM = makeSymbol( "MAKE-UTF8-STREAM" );
    $kw18$SLOT = makeKeyword( "SLOT" );
    $kw19$END = makeKeyword( "END" );
    $sym20$VISIT_DEFSTRUCT_OBJECT_UTF8_STREAM_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-UTF8-STREAM-METHOD" );
    $str21$__utf8_stream__s_cache___s_ = makeString( "#<utf8-stream ~s cache: ~s>" );
    $kw22$CLOSED = makeKeyword( "CLOSED" );
    $str23$Invalid_utf8_stream___s__ = makeString( "Invalid utf8 stream: ~s~%" );
    $sym24$UNICODE_CHARACTER_P = makeSymbol( "UNICODE-CHARACTER-P" );
    $sym25$UNICODE_STRING_P = makeSymbol( "UNICODE-STRING-P" );
    $sym26$INTEGERP = makeSymbol( "INTEGERP" );
    $str27$Invalid_Unicode_character_in_Stre = makeString( "Invalid Unicode character in Stream ~s, its first byte was ~x~%" );
    $str28$Invalid_Unicode_character_in_Stre = makeString( "Invalid Unicode character in Stream ~s, Stream EOF in the middle of unicode character, its first byte was ~x~%" );
    $int29$256 = makeInteger( 256 );
    $str30$EOF_in_Unicode_stream___s__ = makeString( "EOF in Unicode stream: ~s~%" );
    $kw31$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym32$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $str33$Internal_Error_in_Unicode_stream_ = makeString( "Internal Error in Unicode stream: ~s~%" );
  }

  public static final class $utf8_stream_native
      extends
        SubLStructNative
  {
    public SubLObject $stream;
    public SubLObject $cache;
    private static final SubLStructDeclNative structDecl;

    public $utf8_stream_native()
    {
      this.$stream = CommonSymbols.NIL;
      this.$cache = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $utf8_stream_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$stream;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$cache;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$stream = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$cache = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $utf8_stream_native.class, $sym0$UTF8_STREAM, $sym1$UTF8_STREAM_P, $list2, $list3, new String[] { "$stream", "$cache"
      }, $list4, $list5, $sym6$PRINT_UTF8_STREAM );
    }
  }

  public static final class $utf8_stream_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $utf8_stream_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "UTF8-STREAM-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return utf8_stream_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 177 ms
 * 
 */