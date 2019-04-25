package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class unicode_support
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.unicode_support";
  public static final String myFingerPrint = "eceeceeb474a930c6a4664a7a5760d8ca4072ac62dd1c68e11dc6d3547b39c28";
  private static final SubLSymbol $kw0$IN_STRING;
  private static final SubLSymbol $kw1$OPEN;
  private static final SubLString $str2$_u__a__does_not_specify_a__UNICOD;
  private static final SubLSymbol $kw3$IN_CHARS;
  private static final SubLString $str4$Error_at_end_of_unicode_code_poin;
  private static final SubLSymbol $kw5$COMPLETE;
  private static final SubLString $str6$Error_at_end_in_unicode_code_poin;
  private static final SubLString $str7$Error_at_end_in_unicode_code_poin;
  private static final SubLString $str8$_u_x_does_not_specify_a__UNICODE_;
  private static final SubLString $str9$The__S_reader_macro_does_not_take;
  private static final SubLString $str10$Invalid_unicode_character_string_;
  private static final SubLString $str11$End_of_file_on_stream__S_;
  private static final SubLSymbol $sym12$SHARPSIGN_CAPITAL_U_RMF;

  @SubLTranslatedFile.SubL(source = "cycl/unicode-support.lisp", position = 688L)
  public static SubLObject read_unicode_string(final SubLObject stream)
  {
    SubLObject buffer = NIL;
    SubLObject state = $kw0$IN_STRING;
    SubLObject len = ZERO_INTEGER;
    while ( state == $kw0$IN_STRING)
    {
      final SubLObject curr = streams_high.read_char( stream, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL == curr )
      {
        unicode_end_of_file_error( stream );
      }
      final SubLObject pcase_var = curr;
      if( pcase_var.eql( Characters.CHAR_quotation ) )
      {
        state = $kw1$OPEN;
      }
      else if( pcase_var.eql( Characters.CHAR_backslash ) )
      {
        buffer = ConsesLow.cons( curr, buffer );
        len = Numbers.add( len, ONE_INTEGER );
        final SubLObject curr_$1 = streams_high.read_char( stream, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL == curr_$1 )
        {
          unicode_end_of_file_error( stream );
        }
        buffer = ConsesLow.cons( curr_$1, buffer );
        len = Numbers.add( len, ONE_INTEGER );
      }
      else
      {
        buffer = ConsesLow.cons( curr, buffer );
        len = Numbers.add( len, ONE_INTEGER );
      }
    }
    buffer = Sequences.nreverse( buffer );
    final SubLObject str = unicode_strings.string_from_char_list( buffer, len );
    final SubLObject retval = unicode_strings.unicode_string_create( str );
    if( NIL == retval )
    {
      return reader.simple_reader_error( $str2$_u__a__does_not_specify_a__UNICOD, ConsesLow.list( str ) );
    }
    return Values.values( retval, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-support.lisp", position = 1727L)
  public static SubLObject read_unicode_code_point(final SubLObject curr, final SubLObject stream)
  {
    SubLObject cc = curr;
    SubLObject state = $kw3$IN_CHARS;
    SubLObject count = ONE_INTEGER;
    SubLObject uvalue = ZERO_INTEGER;
    while ( state == $kw3$IN_CHARS)
    {
      if( NIL == cc )
      {
        unicode_end_of_file_error( stream );
      }
      final SubLObject pcase_var = cc;
      if( pcase_var.eql( Characters.CHAR_0 ) || pcase_var.eql( Characters.CHAR_1 ) || pcase_var.eql( Characters.CHAR_2 ) || pcase_var.eql( Characters.CHAR_3 ) || pcase_var.eql( Characters.CHAR_4 ) || pcase_var.eql(
          Characters.CHAR_5 ) || pcase_var.eql( Characters.CHAR_6 ) || pcase_var.eql( Characters.CHAR_7 ) || pcase_var.eql( Characters.CHAR_8 ) || pcase_var.eql( Characters.CHAR_9 ) || pcase_var.eql( Characters.CHAR_a )
          || pcase_var.eql( Characters.CHAR_b ) || pcase_var.eql( Characters.CHAR_c ) || pcase_var.eql( Characters.CHAR_d ) || pcase_var.eql( Characters.CHAR_e ) || pcase_var.eql( Characters.CHAR_f ) || pcase_var.eql(
              Characters.CHAR_A ) || pcase_var.eql( Characters.CHAR_B ) || pcase_var.eql( Characters.CHAR_C ) || pcase_var.eql( Characters.CHAR_D ) || pcase_var.eql( Characters.CHAR_E ) || pcase_var.eql(
                  Characters.CHAR_F ) )
      {
        uvalue = Numbers.add( Numbers.ash( uvalue, FOUR_INTEGER ), string_utilities.hex_char_value( cc ) );
        cc = streams_high.read_char( stream, NIL, NIL, UNPROVIDED );
        count = Numbers.add( count, ONE_INTEGER );
        if( NIL == cc )
        {
          return reader.simple_reader_error( $str4$Error_at_end_of_unicode_code_poin, ConsesLow.list( uvalue ) );
        }
        continue;
      }
      else
      {
        state = $kw5$COMPLETE;
        streams_high.unread_char( cc, stream );
      }
    }
    if( count.numG( SEVEN_INTEGER ) )
    {
      return reader.simple_reader_error( $str6$Error_at_end_in_unicode_code_poin, ConsesLow.list( uvalue ) );
    }
    if( count.numL( THREE_INTEGER ) )
    {
      return reader.simple_reader_error( $str7$Error_at_end_in_unicode_code_poin, ConsesLow.list( uvalue ) );
    }
    final SubLObject retval = unicode_strings.unicode_char_create( uvalue );
    if( NIL == retval )
    {
      return reader.simple_reader_error( $str8$_u_x_does_not_specify_a__UNICODE_, ConsesLow.list( uvalue ) );
    }
    return Values.values( retval, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-support.lisp", position = 3092L)
  public static SubLObject sharpsign_capital_u_rmf(final SubLObject stream, final SubLObject ch, final SubLObject arg)
  {
    if( NIL != arg )
    {
      return reader.simple_reader_error( $str9$The__S_reader_macro_does_not_take, ConsesLow.list( ch ) );
    }
    final SubLObject curr = streams_high.read_char( stream, NIL, NIL, UNPROVIDED );
    if( NIL == curr )
    {
      unicode_end_of_file_error( stream );
    }
    final SubLObject pcase_var = curr;
    if( pcase_var.eql( Characters.CHAR_quotation ) )
    {
      return read_unicode_string( stream );
    }
    if( pcase_var.eql( Characters.CHAR_0 ) || pcase_var.eql( Characters.CHAR_1 ) || pcase_var.eql( Characters.CHAR_2 ) || pcase_var.eql( Characters.CHAR_3 ) || pcase_var.eql( Characters.CHAR_4 ) || pcase_var.eql(
        Characters.CHAR_5 ) || pcase_var.eql( Characters.CHAR_6 ) || pcase_var.eql( Characters.CHAR_7 ) || pcase_var.eql( Characters.CHAR_8 ) || pcase_var.eql( Characters.CHAR_9 ) || pcase_var.eql( Characters.CHAR_a )
        || pcase_var.eql( Characters.CHAR_b ) || pcase_var.eql( Characters.CHAR_c ) || pcase_var.eql( Characters.CHAR_d ) || pcase_var.eql( Characters.CHAR_e ) || pcase_var.eql( Characters.CHAR_f ) || pcase_var.eql(
            Characters.CHAR_A ) || pcase_var.eql( Characters.CHAR_B ) || pcase_var.eql( Characters.CHAR_C ) || pcase_var.eql( Characters.CHAR_D ) || pcase_var.eql( Characters.CHAR_E ) || pcase_var.eql(
                Characters.CHAR_F ) )
    {
      return read_unicode_code_point( curr, stream );
    }
    return reader.simple_reader_error( $str10$Invalid_unicode_character_string_, ConsesLow.list( curr ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-support.lisp", position = 3812L)
  public static SubLObject unicode_end_of_file_error(final SubLObject stream)
  {
    return reader.simple_reader_error( $str11$End_of_file_on_stream__S_, ConsesLow.list( stream ) );
  }

  public static SubLObject declare_unicode_support_file()
  {
    SubLFiles.declareFunction( me, "read_unicode_string", "READ-UNICODE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "read_unicode_code_point", "READ-UNICODE-CODE-POINT", 2, 0, false );
    SubLFiles.declareFunction( me, "sharpsign_capital_u_rmf", "SHARPSIGN-CAPITAL-U-RMF", 3, 0, false );
    SubLFiles.declareFunction( me, "unicode_end_of_file_error", "UNICODE-END-OF-FILE-ERROR", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_unicode_support_file()
  {
    return NIL;
  }

  public static SubLObject setup_unicode_support_file()
  {
    reader.set_dispatch_macro_character( Characters.CHAR_hash, Characters.CHAR_U, $sym12$SHARPSIGN_CAPITAL_U_RMF, UNPROVIDED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_unicode_support_file();
  }

  @Override
  public void initializeVariables()
  {
    init_unicode_support_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_unicode_support_file();
  }
  static
  {
    me = new unicode_support();
    $kw0$IN_STRING = makeKeyword( "IN-STRING" );
    $kw1$OPEN = makeKeyword( "OPEN" );
    $str2$_u__a__does_not_specify_a__UNICOD = makeString( "#u\"~a\" does not specify a  UNICODE string." );
    $kw3$IN_CHARS = makeKeyword( "IN-CHARS" );
    $str4$Error_at_end_of_unicode_code_poin = makeString( "Error at end of unicode code point: #u~s~%" );
    $kw5$COMPLETE = makeKeyword( "COMPLETE" );
    $str6$Error_at_end_in_unicode_code_poin = makeString( "Error at end in unicode code point, too many digits: #u~s~%" );
    $str7$Error_at_end_in_unicode_code_poin = makeString( "Error at end in unicode code point, too few digits, at least 2 required: #u~s~%" );
    $str8$_u_x_does_not_specify_a__UNICODE_ = makeString( "#u~x does not specify a  UNICODE codpoint." );
    $str9$The__S_reader_macro_does_not_take = makeString( "The ~S reader macro does not take an argument." );
    $str10$Invalid_unicode_character_string_ = makeString( "Invalid unicode character/string, the char after #u, in this case (~s), must be either a hex-digit or a double quote(\")." );
    $str11$End_of_file_on_stream__S_ = makeString( "End of file on stream ~S." );
    $sym12$SHARPSIGN_CAPITAL_U_RMF = makeSymbol( "SHARPSIGN-CAPITAL-U-RMF" );
  }
}
/*
 * 
 * Total time: 33 ms
 * 
 */