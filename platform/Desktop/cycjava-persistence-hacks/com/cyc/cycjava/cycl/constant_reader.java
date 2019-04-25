//
//
package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class constant_reader extends SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.constant_reader";
  public static final String myFingerPrint = "6a2258c4d1229cb28a5b3caa6a93d18a0228da4c9ade1491c17c39f661698cef";
  @SubLTranslatedFile.SubL(
    source = "cycl/constant-reader.lisp",
    position = 1014L)
  private static SubLSymbol $constant_reader_macro_char$;
  @SubLTranslatedFile.SubL(
    source = "cycl/constant-reader.lisp",
    position = 1428L)
  private static SubLSymbol $constant_reader_prefix$;
  private static final SubLString $str0$_;
  private static final SubLString $str1$The__S_reader_macro_does_not_take;
  private static final SubLInteger $int2$64;
  private static final SubLString $str3$_S_is_not_the_name_of_a_constant_;
  private static final SubLSymbol $sym4$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $sym5$SHARPSIGN_DOLLAR_RMF;

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-reader.lisp",
    position = 1223L)
  public static SubLObject constant_reader_macro_char()
  {
    return $constant_reader_macro_char$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-reader.lisp",
    position = 1590L)
  public static SubLObject constant_reader_prefix()
  {
    return $constant_reader_prefix$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-reader.lisp",
    position = 1736L)
  public static SubLObject sharpsign_dollar_rmf(final SubLObject stream, final SubLObject ch, final SubLObject arg)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != arg )
    {
      reader.simple_reader_error( $str1$The__S_reader_macro_does_not_take, ConsesLow.list( ch ) );
    }
    SubLObject length = $int2$64;
    SubLObject buffer = Strings.make_string( length, UNPROVIDED );
    SubLObject i = ZERO_INTEGER;
    SubLObject next;
    for( next = streams_high.read_char( stream, NIL, NIL, UNPROVIDED ); NIL != next && NIL != constant_completion_high
        .valid_constant_name_char_p( next ); next = streams_high.read_char( stream, NIL, NIL, UNPROVIDED ) )
    {
      if( i.numGE( length ) )
      {
        length = Numbers.multiply( length, TWO_INTEGER );
        final SubLObject new_buffer = Strings.make_string( length, UNPROVIDED );
        SubLObject j;
        for( j = NIL, j = ZERO_INTEGER; j.numL( i ); j = Numbers.add( j, ONE_INTEGER ) )
        {
          Strings.set_char( new_buffer, j, Strings.sublisp_char( buffer, j ) );
        }
        buffer = new_buffer;
      }
      Strings.set_char( buffer, i, next );
      i = Numbers.add( i, ONE_INTEGER );
    }
    if( NIL != next )
    {
      streams_high.unread_char( next, stream );
    }
    if( NIL != reader.$read_suppress$.getDynamicValue( thread ) )
    {
      return Values.values( NIL, T );
    }
    final SubLObject name = i.numE( length ) ? buffer : Sequences.subseq( buffer, ZERO_INTEGER, i );
    SubLObject constant = find_constant_by_name( name );
    if( NIL != constant )
    {
      return Values.values( constant, T );
    }
    if( NIL != stream_forbids_constant_creation( stream ) )
    {
      reader.simple_reader_error( $str3$_S_is_not_the_name_of_a_constant_, ConsesLow.list( name ) );
      return NIL;
    }
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym4$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          constant = constant_handles.reader_make_constant_shell( name );
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
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error_message )
    {
      reader.simple_reader_error( error_message, NIL );
    }
    return Values.values( constant, T );
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-reader.lisp",
    position = 3066L)
  public static SubLObject find_constant_by_name(final SubLObject name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject constant = NIL;
    final SubLObject _prev_bind_0 = constant_completion_low.$require_valid_constants$.currentBinding( thread );
    try
    {
      constant_completion_low.$require_valid_constants$.bind( NIL, thread );
      constant = constant_completion_high.constant_complete_exact( name, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      constant_completion_low.$require_valid_constants$.rebind( _prev_bind_0, thread );
    }
    if( NIL == constant )
    {
      constant = constant_handles.find_invalid_constant( name );
    }
    if( NIL == constant )
    {
      if( ke.NIL == ke.$old_constant_names_table$.getGlobalValue() )
      {
        ke.initialize_old_constant_names();
      }
      constant = ke.old_constant_names( name ).first();
      if( NIL != constant )
      {
        System.err.println( ";;; using old constant! " + constant + " for " + name );
      }
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(
    source = "cycl/constant-reader.lisp",
    position = 3475L)
  public static SubLObject stream_forbids_constant_creation(final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == control_vars.$read_require_constant_exists$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    return T;
  }

  public static SubLObject declare_constant_reader_file()
  {
    SubLFiles.declareFunction( myName, "constant_reader_macro_char", "CONSTANT-READER-MACRO-CHAR", 0, 0, false );
    SubLFiles.declareFunction( myName, "constant_reader_prefix", "CONSTANT-READER-PREFIX", 0, 0, false );
    SubLFiles.declareFunction( myName, "sharpsign_dollar_rmf", "SHARPSIGN-DOLLAR-RMF", 3, 0, false );
    SubLFiles.declareFunction( myName, "find_constant_by_name", "FIND-CONSTANT-BY-NAME", 1, 0, false );
    SubLFiles.declareFunction( myName, "stream_forbids_constant_creation", "STREAM-FORBIDS-CONSTANT-CREATION", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_constant_reader_file()
  {
    $constant_reader_macro_char$ = SubLFiles.defconstant( "*CONSTANT-READER-MACRO-CHAR*", Characters.CHAR_dollar );
    $constant_reader_prefix$ = SubLFiles.defconstant( "*CONSTANT-READER-PREFIX*", Sequences.cconcatenate( $str0$_, Strings.string( $constant_reader_macro_char$
        .getGlobalValue() ) ) );
    return NIL;
  }

  public static SubLObject setup_constant_reader_file()
  {
    reader.set_dispatch_macro_character( Characters.CHAR_hash, constant_reader_macro_char(), $sym5$SHARPSIGN_DOLLAR_RMF, UNPROVIDED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_constant_reader_file();
  }

  @Override
  public void initializeVariables()
  {
    init_constant_reader_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_constant_reader_file();
  }
  static
  {
    me = new constant_reader();
    $constant_reader_macro_char$ = null;
    $constant_reader_prefix$ = null;
    $str0$_ = SubLObjectFactory.makeString( "#" );
    $str1$The__S_reader_macro_does_not_take = SubLObjectFactory.makeString( "The ~S reader macro does not take an argument." );
    $int2$64 = SubLObjectFactory.makeInteger( 64 );
    $str3$_S_is_not_the_name_of_a_constant_ = SubLObjectFactory.makeString( "~S is not the name of a constant." );
    $sym4$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $sym5$SHARPSIGN_DOLLAR_RMF = SubLObjectFactory.makeSymbol( "SHARPSIGN-DOLLAR-RMF" );
  }
}
