//
// For LarKC
//
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import java.math.BigInteger;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStreamFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class streams_high
    extends
      SubLTrampolineFile
{
  private static SubLObject peekChar(SubLInputTextStream stream, SubLObject eof_error_p, SubLObject eof_value)
  {
    int theChar = stream.readChar();
    if( theChar != -1 )
    {
      stream.unread( theChar );
      SubLCharacter result = SubLObjectFactory.makeChar( theChar );
      return result;
    }
    if( eof_error_p != SubLNil.NIL )
    {
      reader.end_of_file_error( stream );
      return SubLNil.NIL;
    }
    return eof_value;
  }

  private static SubLObject peekCharSkippingChar(int charToSkip, SubLInputTextStream stream, SubLObject eof_error_p, SubLObject eof_value)
  {
    int theChar;
    do
      theChar = stream.readChar();
    while ( theChar == charToSkip);
    if( theChar != -1 )
    {
      stream.unread( theChar );
      SubLCharacter result = SubLObjectFactory.makeChar( theChar );
      return result;
    }
    if( eof_error_p != SubLNil.NIL )
    {
      reader.end_of_file_error( stream );
      return SubLNil.NIL;
    }
    return eof_value;
  }

  private static SubLObject peekCharSkippingWS(SubLInputTextStream stream, SubLObject eof_error_p, SubLObject eof_value)
  {
    int theChar;
    do
      theChar = stream.readChar();
    while ( Character.isWhitespace( (char) theChar ));
    if( theChar != -1 )
    {
      stream.unread( theChar );
      SubLCharacter result = SubLObjectFactory.makeChar( theChar );
      return result;
    }
    if( eof_error_p != SubLNil.NIL )
    {
      reader.end_of_file_error( stream );
      return SubLNil.NIL;
    }
    return eof_value;
  }

  private static void writeString(SubLObject string, SubLObject stream, SubLObject start, SubLObject end, boolean addNewline)
  {
    if( stream == UNPROVIDED )
      stream = StreamsLow.$standard_output$.getDynamicValue();
    String stringTyped = string.getStringValue();
    SubLOutputTextStream streamTyped = stream.toOutputTextStream();
    int startTyped = SubLTrampolineFile.extractStart( start );
    int endTyped = SubLTrampolineFile.extractEndUsingSize( end, string );
    streamTyped.writeString( stringTyped, startTyped, endTyped - startTyped );
    if( addNewline )
      streamTyped.writeNewline();
  }

  public static SubLObject broadcast_stream_streams(SubLObject stream)
  {
    return stream.getStream( true ).getStreams();
  }

  public static SubLObject clear_input(SubLObject stream)
  {
    if( stream == UNPROVIDED )
      stream = StreamsLow.$standard_input$.getValue();
    if( stream instanceof SubLInputTextStream )
    {
      SubLInputTextStream streamTyped = stream.toInputTextStream();
      while ( streamTyped.ready())
        streamTyped.readChar();
    }
    else if( stream instanceof SubLInputBinaryStream )
    {
      SubLInputBinaryStream streamTyped2 = stream.toInputBinaryStream();
      while ( streamTyped2.numBytesAvailable() > 0L)
        streamTyped2.read();
    }
    return SubLNil.NIL;
  }

  public static SubLObject clear_output(SubLObject stream)
  {
    return force_output( stream );
  }

  public static SubLObject close(SubLObject stream, SubLObject abort)
  {
    // if( stream != NIL )
    stream.enforceType( STREAMP );
    SubLStream streamTyped = stream.getStream( false );
    boolean isOpen = !streamTyped.isClosed();
    SubLObject result = isOpen ? T : SubLNil.NIL;
    if( isOpen )
      streamTyped.close();
    return result;
  }

  public static SubLObject declare_streams_high_file()
  {
    SubLFiles.declareFunction( streams_high.me, "stream_p", "STREAM-P", 1, 0, false );
    SubLFiles.declareFunction( streams_high.me, "stream_direction", "STREAM-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( streams_high.me, "stream_element_type", "STREAM-ELEMENT-TYPE", 1, 0, false );
    SubLFiles.declareFunction( streams_high.me, "open_stream_p", "OPEN-STREAM-P", 1, 0, false );
    SubLFiles.declareFunction( streams_high.me, "input_stream_p", "INPUT-STREAM-P", 1, 0, false );
    SubLFiles.declareFunction( streams_high.me, "output_stream_p", "OUTPUT-STREAM-P", 1, 0, false );
    SubLFiles.declareFunction( streams_high.me, "open_input_stream_p", "OPEN-INPUT-STREAM-P", 1, 0, false );
    SubLFiles.declareFunction( streams_high.me, "open_output_stream_p", "OPEN-OUTPUT-STREAM-P", 1, 0, false );
    SubLFiles.declareFunction( streams_high.me, "interactive_stream_p", "INTERACTIVE-STREAM-P", 1, 0, false );
    SubLFiles.declareFunction( streams_high.me, "close", "CLOSE", 1, 1, false );
    SubLFiles.declareFunction( streams_high.me, "get_output_stream_string", "GET-OUTPUT-STREAM-STRING", 1, 0, false );
    SubLFiles.declareFunction( streams_high.me, "listen", "LISTEN", 0, 1, false );
    SubLFiles.declareFunction( streams_high.me, "read_byte", "READ-BYTE", 1, 2, false );
    SubLFiles.declareFunction( streams_high.me, "read_char", "READ-CHAR", 0, 4, false );
    SubLFiles.declareFunction( streams_high.me, "read_byte_sequence_into_string", "READ-BYTE-SEQUENCE-INTO-STRING", 1, 3, false );
    SubLFiles.declareFunction( streams_high.me, "write_string_to_byte_sequence", "WRITE-STRING-TO-BYTE-SEQUENCE", 1, 3, false );
    SubLFiles.declareFunction( streams_high.me, "read_byte_sequence_to_positive_integer", "READ-BYTE-SEQUENCE-TO-POSITIVE-INTEGER", 1, 4, false );
    SubLFiles.declareFunction( streams_high.me, "write_positive_integer_as_byte_sequence", "WRITE-POSITIVE-INTEGER-AS-BYTE-SEQUENCE", 2, 2, false );
    SubLFiles.declareFunction( streams_high.me, "read_char_no_hang", "READ-CHAR-NO-HANG", 0, 4, false );
    SubLFiles.declareFunction( streams_high.me, "unread_char", "UNREAD-CHAR", 1, 1, false );
    SubLFiles.declareFunction( streams_high.me, "unread_byte", "UNREAD-BYTE", 2, 0, false );
    SubLFiles.declareFunction( streams_high.me, "read_line", "READ-LINE", 0, 4, false );
    SubLFiles.declareFunction( streams_high.me, "peek_char", "PEEK-CHAR", 0, 5, false );
    SubLFiles.declareFunction( streams_high.me, "clear_input", "CLEAR-INPUT", 0, 1, false );
    SubLFiles.declareFunction( streams_high.me, "read_sequence", "READ-SEQUENCE", 2, 2, false );
    SubLFiles.declareFunction( streams_high.me, "write_byte", "WRITE-BYTE", 2, 0, false );
    SubLFiles.declareFunction( streams_high.me, "write_char", "WRITE-CHAR", 1, 1, false );
    SubLFiles.declareFunction( streams_high.me, "write_string", "WRITE-STRING", 1, 3, false );
    SubLFiles.declareFunction( streams_high.me, "write_line", "WRITE-LINE", 1, 3, false );
    SubLFiles.declareFunction( streams_high.me, "terpri", "TERPRI", 0, 1, false );
    SubLFiles.declareFunction( streams_high.me, "fresh_line", "FRESH-LINE", 0, 1, false );
    SubLFiles.declareFunction( streams_high.me, "finish_output", "FINISH-OUTPUT", 0, 1, false );
    SubLFiles.declareFunction( streams_high.me, "force_output", "FORCE-OUTPUT", 0, 1, false );
    SubLFiles.declareFunction( streams_high.me, "clear_output", "CLEAR-OUTPUT", 0, 1, false );
    SubLFiles.declareFunction( streams_high.me, "file_length", "FILE-LENGTH", 1, 0, false );
    SubLFiles.declareFunction( streams_high.me, "file_position", "FILE-POSITION", 1, 1, false );
    SubLFiles.declareFunction( streams_high.me, "write_sequence", "WRITE-SEQUENCE", 2, 2, false );
    SubLFiles.declareFunction( streams_high.me, "make_string_input_stream", "MAKE-STRING-INPUT-STREAM", 1, 2, false );
    SubLFiles.declareFunction( streams_high.me, "make_string_output_stream", "MAKE-STRING-OUTPUT-STREAM", 0, 0, false );
    SubLFiles.declareFunction( streams_high.me, "make_private_string_output_stream", "MAKE-PRIVATE-STRING-OUTPUT-STREAM", 0, 0, false );
    SubLFiles.declareFunction( streams_high.me, "make_private_string_input_stream", "MAKE-PRIVATE-STRING-INPUT-STREAM", 1, 2, false );
    SubLFiles.declareFunction( streams_high.me, "make_broadcast_stream", "MAKE-BROADCAST-STREAM", 1, 0, false );
    SubLFiles.declareFunction( streams_high.me, "make_private_broadcast_stream", "MAKE-PRIVATE-BROADCAST-STREAM", 1, 0, false );
    SubLFiles.declareFunction( streams_high.me, "broadcast_stream_streams", "BROADCAST-STREAM-STREAMS", 1, 0, false );
    SubLFiles.declareFunction( streams_high.me, "make_synonym_stream", "MAKE-SYNONYM-STREAM", 1, 0, false );
    SubLFiles.declareFunction( streams_high.me, "make_private_synonym_stream", "MAKE-PRIVATE-SYNONYM-STREAM", 1, 0, false );
    SubLFiles.declareFunction( streams_high.me, "synonym_stream_symbol", "SYNONYM-STREAM-SYMBOL", 1, 0, false );
    SubLFiles.declareFunction( streams_high.me, "follow_synonym_stream", "FOLLOW-SYNONYM-STREAM", 1, 0, false );
    return SubLNil.NIL;
  }

  public static SubLObject file_length(SubLObject stream)
  {
    long result = stream.getStream( true ).file_length();
    return SubLObjectFactory.makeInteger( result );
  }

  public static SubLObject file_position(SubLObject stream, SubLObject position_spec)
  {
    SubLStream streamTyped = stream.getStream( true );
    if( position_spec == UNPROVIDED )
    {
      long result = streamTyped.getFilePointer();
      return SubLObjectFactory.makeInteger( result );
    }
    long positionTyped = 0L;
    if( position_spec != START_KEYWORD )
      if( position_spec == END_KEYWORD )
        positionTyped = streamTyped.file_length();
      else
        positionTyped = position_spec.longValue();
    streamTyped.seek( positionTyped );
    boolean result2 = streamTyped.getFilePointer() == positionTyped;
    return SubLObjectFactory.makeBoolean( result2 );
  }

  public static SubLObject finish_output(SubLObject stream)
  {
    return force_output( stream );
  }

  public static SubLObject follow_synonym_stream(SubLObject stream)
  {
    return stream.getStream( true );
  }

  public static SubLObject force_output(SubLObject stream)
  {
    if( stream == UNPROVIDED )
      stream = StreamsLow.$standard_output$.getDynamicValue();
    stream.toOutputStream().flush();
    return SubLNil.NIL;
  }

  public static SubLObject fresh_line(SubLObject stream)
  {
    if( stream == UNPROVIDED )
      stream = StreamsLow.$standard_output$.getDynamicValue();
    SubLOutputTextStream streamTyped = stream.toOutputTextStream();
    if( streamTyped.freshLine() )
      return SubLNil.NIL;
    terpri( stream );
    return T;
  }

  public static SubLObject get_output_stream_string(SubLObject stream)
  {
    return SubLObjectFactory.makeString( stream.toOutputTextStream().getStringOutput() );
  }

  public static SubLObject init_streams_high_file()
  {
    return SubLNil.NIL;
  }

  public static SubLObject input_stream_p(SubLObject stream)
  {
    return stream.getStream( true ) instanceof SubLInputStream ? RET_T : SubLNil.NIL;
  }

  public static SubLObject interactive_stream_p(SubLObject stream)
  {
    boolean result = stream.getStream( true ).isInteractive();
    return SubLObjectFactory.makeBoolean( result );
  }

  public static SubLObject listen(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
    }
    SubLInputStream streamTyped = stream.toInputStream();
    if( streamTyped.getElementType() == BINARY_KEYWORD )
    {
      SubLInputBinaryStream inStream = (SubLInputBinaryStream) streamTyped;
      long result = inStream.numBytesAvailable();
      return SubLObjectFactory.makeBoolean( result > 0L );
    }
    SubLInputTextStream inStream2 = (SubLInputTextStream) streamTyped;
    boolean result2 = inStream2.ready();
    return SubLObjectFactory.makeBoolean( result2 );
  }

  public static SubLObject make_broadcast_stream(SubLObject streams)
  {
    return SubLStreamFactory.makeBroadcastStream( streams.toList() );
  }

  public static SubLObject make_private_broadcast_stream(SubLObject streams)
  {
    SubLObject stream = SubLNil.NIL;
    SubLObject oldValue = stream_macros.$stream_requires_locking$.getDynamicValue();
    try
    {
      Dynamic.bind( stream_macros.$stream_requires_locking$, SubLNil.NIL );
      stream = make_broadcast_stream( streams );
    }
    finally
    {
      Dynamic.rebind( stream_macros.$stream_requires_locking$, oldValue );
    }
    return stream;
  }

  public static SubLObject make_private_string_input_stream(SubLObject string, SubLObject start, SubLObject end)
  {
    SubLObject stream = SubLNil.NIL;
    SubLObject oldValue = stream_macros.$stream_requires_locking$.getDynamicValue();
    try
    {
      Dynamic.bind( stream_macros.$stream_requires_locking$, SubLNil.NIL );
      stream = make_string_input_stream( string, start, end );
    }
    finally
    {
      Dynamic.rebind( stream_macros.$stream_requires_locking$, oldValue );
    }
    return stream;
  }

  public static SubLObject make_private_string_output_stream()
  {
    SubLObject stream = SubLNil.NIL;
    SubLObject oldValue = stream_macros.$stream_requires_locking$.getDynamicValue();
    try
    {
      Dynamic.bind( stream_macros.$stream_requires_locking$, SubLNil.NIL );
      stream = make_string_output_stream();
    }
    finally
    {
      Dynamic.rebind( stream_macros.$stream_requires_locking$, oldValue );
    }
    return stream;
  }

  public static SubLObject make_private_synonym_stream(SubLObject symbol)
  {
    SubLObject stream = SubLNil.NIL;
    SubLObject oldValue = stream_macros.$stream_requires_locking$.getDynamicValue();
    try
    {
      Dynamic.bind( stream_macros.$stream_requires_locking$, SubLNil.NIL );
      stream = make_synonym_stream( symbol );
    }
    finally
    {
      Dynamic.rebind( stream_macros.$stream_requires_locking$, oldValue );
    }
    return stream;
  }

  public static SubLObject make_string_input_stream(SubLObject string, SubLObject start, SubLObject end)
  {
    String stringTyped = string.getStringValue();
    int startTyped = SubLTrampolineFile.extractStart( start );
    int endTyped = SubLTrampolineFile.extractEndUsingSize( end, string );
    SubLInputStream result = SubLStreamFactory.makeStringInputStream( stringTyped, startTyped, endTyped );
    return result;
  }

  public static SubLObject make_string_output_stream()
  {
    return SubLStreamFactory.makeStringOutputStream();
  }

  public static SubLObject make_synonym_stream(SubLObject symbol)
  {
    return SubLStreamFactory.makeSynonymStream( symbol.toSymbol() );
  }

  public static SubLObject open_input_stream_p(SubLObject stream)
  {
    if( !stream.isStream() )
      return SubLNil.NIL;
    SubLStream streamTyped = stream.getStream( true );
    boolean result = streamTyped instanceof SubLInputStream && !streamTyped.isClosed();
    return SubLObjectFactory.makeBoolean( result );
  }

  public static SubLObject open_output_stream_p(SubLObject stream)
  {
    if( !stream.isStream() )
      return SubLNil.NIL;
    SubLStream streamTyped = stream.getStream( true );
    boolean result = streamTyped instanceof SubLOutputStream && !streamTyped.isClosed();
    return SubLObjectFactory.makeBoolean( result );
  }

  public static SubLObject open_stream_p(SubLObject stream)
  {
    boolean result = !stream.getStream( true ).isClosed();
    return SubLObjectFactory.makeBoolean( result );
  }

  public static SubLObject output_stream_p(SubLObject stream)
  {
    return stream.getStream( true ) instanceof SubLOutputStream ? RET_T : SubLNil.NIL;
  }

  public static SubLObject peek_char(SubLObject peek_type, SubLObject stream, SubLObject eof_error_p, SubLObject eof_value, SubLObject recursivep)
  {
    if( stream == UNPROVIDED )
      stream = StreamsLow.$standard_input$.getDynamicValue();
    if( eof_error_p == UNPROVIDED )
      eof_error_p = T;
    if( eof_value == UNPROVIDED )
      eof_value = SubLNil.NIL;
    if( peek_type == UNPROVIDED )
      peek_type = SubLNil.NIL;
    SubLInputTextStream streamTyped = stream.toInputTextStream();
    SubLObject result = null;
    if( peek_type == SubLNil.NIL )
      result = peekChar( streamTyped, eof_error_p, eof_value );
    else if( peek_type == T )
      result = peekCharSkippingWS( streamTyped, eof_error_p, eof_value );
    else
    {
      char peek_typeTyped = peek_type.charValue();
      result = peekCharSkippingChar( peek_typeTyped, streamTyped, eof_error_p, eof_value );
    }
    return result;
  }

  public static SubLObject read_byte(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value)
  {
    int theByte = stream.toInputBinaryStream().read();
    if( theByte != -1 )
      return SubLNumberFactory.makeSmallInteger( theByte );
    if( eof_error_p == UNPROVIDED || eof_error_p != SubLNil.NIL )
    {
      reader.end_of_file_error( stream );
      return SubLNil.NIL;
    }
    return eof_value == UNPROVIDED ? SubLNil.NIL : eof_value;
  }

  public static SubLObject read_byte_sequence_into_string(SubLObject string, SubLObject stream, SubLObject eof_error_p, SubLObject eof_value)
  {
    if( stream == UNPROVIDED )
      stream = StreamsLow.$standard_input$.getDynamicValue();
    int theByte = stream.toInputBinaryStream().readByteSequenceToString( string.toStr() );
    if( theByte != -1 )
      return string;
    if( eof_error_p == UNPROVIDED || eof_error_p != SubLNil.NIL )
    {
      reader.end_of_file_error( stream );
      return SubLNil.NIL;
    }
    return eof_value == UNPROVIDED ? SubLNil.NIL : eof_value;
  }

  public static SubLObject read_byte_sequence_to_positive_integer(SubLObject byteCount, SubLObject stream, SubLObject eof_error_p, SubLObject eof_value)
  {
    return read_byte_sequence_to_positive_integer( byteCount, stream, eof_error_p, eof_value, T );
  }

  public static SubLObject read_byte_sequence_to_positive_integer(SubLObject byteCount, SubLObject stream, SubLObject eof_error_p, SubLObject eof_value, SubLObject networkByteOrder)
  {
    if( stream == UNPROVIDED )
      stream = StreamsLow.$standard_input$.getDynamicValue();
    if( networkByteOrder == UNPROVIDED )
      networkByteOrder = SubLNil.NIL;
    int byteCountVal = byteCount.intValue();
    boolean useNetworkByteOrder = networkByteOrder != SubLNil.NIL;
    long positiveInteger = 0L;
    try
    {
      positiveInteger = stream.toInputBinaryStream().readByteSequenceToPositiveInteger( byteCountVal, useNetworkByteOrder );
    }
    catch( RuntimeException re )
    {
      if( !re.getMessage().equals( "EOF" ) )
        throw re;
      if( eof_error_p == UNPROVIDED || eof_error_p != SubLNil.NIL )
      {
        reader.end_of_file_error( stream );
        return SubLNil.NIL;
      }
      return eof_value == UNPROVIDED ? SubLNil.NIL : eof_value;
    }
    if( positiveInteger < 0L )
    {
      int offset = 64;
      byte[] array = new byte[ 9 ];
      array[ 0 ] = 0;
      int n = 1;
      long n2 = positiveInteger;
      offset -= 8;
      array[ n ] = (byte) ( n2 >>> offset & 0xFFL );
      int n3 = 2;
      long n4 = positiveInteger;
      offset -= 8;
      array[ n3 ] = (byte) ( n4 >>> offset & 0xFFL );
      int n5 = 3;
      long n6 = positiveInteger;
      offset -= 8;
      array[ n5 ] = (byte) ( n6 >>> offset & 0xFFL );
      int n7 = 4;
      long n8 = positiveInteger;
      offset -= 8;
      array[ n7 ] = (byte) ( n8 >>> offset & 0xFFL );
      int n9 = 5;
      long n10 = positiveInteger;
      offset -= 8;
      array[ n9 ] = (byte) ( n10 >>> offset & 0xFFL );
      int n11 = 6;
      long n12 = positiveInteger;
      offset -= 8;
      array[ n11 ] = (byte) ( n12 >>> offset & 0xFFL );
      int n13 = 7;
      long n14 = positiveInteger;
      offset -= 8;
      array[ n13 ] = (byte) ( n14 >>> offset & 0xFFL );
      int n15 = 8;
      long n16 = positiveInteger;
      offset -= 8;
      array[ n15 ] = (byte) ( n16 >>> offset & 0xFFL );
      BigInteger newPosInt = new BigInteger( array );
      newPosInt = newPosInt.abs();
      return SubLNumberFactory.makeInteger( newPosInt );
    }
    return SubLNumberFactory.makeInteger( positiveInteger );
  }

  public static SubLObject read_char(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value, SubLObject recursive_p)
  {
    if( stream == UNPROVIDED )
      stream = StreamsLow.$standard_input$.getDynamicValue();
    int theByte = stream.toInputTextStream().readChar();
    if( theByte != -1 )
      return SubLCharacter.makeChar( theByte );
    if( eof_error_p == UNPROVIDED || eof_error_p != SubLNil.NIL )
    {
      reader.end_of_file_error( stream );
      return SubLNil.NIL;
    }
    return eof_value == UNPROVIDED ? SubLNil.NIL : eof_value;
  }

  public static SubLObject read_char_no_hang(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value, SubLObject recursive_p)
  {
    if( stream == UNPROVIDED )
      stream = StreamsLow.$standard_input$.getDynamicValue();
    SubLInputTextStream streamTyped = stream.toInputTextStream();
    if( !streamTyped.ready() )
      return SubLNil.NIL;
    int theByte = streamTyped.readChar();
    if( theByte != -1 )
      return SubLCharacter.makeChar( theByte );
    if( eof_error_p != SubLNil.NIL )
    {
      reader.end_of_file_error( stream );
      return SubLNil.NIL;
    }
    return eof_value;
  }

  public static SubLObject read_line(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value, SubLObject recursive_p)
  {
    if( stream == UNPROVIDED )
      stream = StreamsLow.$standard_input$.getValue();
    if( eof_error_p == UNPROVIDED )
      eof_error_p = T;
    if( eof_value == UNPROVIDED )
      eof_value = SubLNil.NIL;
    SubLInputTextStream streamTyped = stream.toInputTextStream();
    StringBuilder buf = new StringBuilder( 256 );
    String eolChars = streamTyped.getNewline();
    int eolCharsSize = eolChars.length();
    int currentChar = 0;
    boolean isEOL = false;
    while ( currentChar != -1)
    {
      currentChar = streamTyped.readChar();
      if( currentChar == -1 )
        break;
      if( currentChar != -1 )
        buf.append( (char) currentChar );
      isEOL = true;
      int i;
      int j;
      for( i = buf.length() - 1, j = eolCharsSize - 1; j >= 0 && i >= 0; --i, --j )
        if( buf.charAt( i ) != eolChars.charAt( j ) )
          isEOL = false;
      isEOL = isEOL && j < 0;
      if( isEOL )
        break;
    }
    if( buf.length() <= 0 && currentChar == -1 )
    {
      if( eof_error_p != SubLNil.NIL )
        reader.end_of_file_error( stream );
      return Values.values( eof_value, T );
    }
    String result = isEOL ? buf.substring( 0, buf.length() - eolCharsSize ) : buf.toString();
    return Values.values( SubLObjectFactory.makeString( result ), SubLObjectFactory.makeBoolean( currentChar == -1 ) );
  }

  public static SubLObject read_sequence(SubLObject sequence, SubLObject stream, SubLObject start, SubLObject end)
  {
    int startTyped = SubLTrampolineFile.extractStart( start );
    int endTyped = SubLTrampolineFile.extractEndUsingSize( end, sequence );
    if( startTyped < 0 )
      Errors.error( "Got invalid start index: " + startTyped );
    if( endTyped < 0 )
      Errors.error( "Got invalid end index: " + endTyped );
    if( endTyped < startTyped )
      Errors.error( "Got end index which is too small: " + endTyped );
    SubLInputTextStream inputTextStream = null;
    SubLInputBinaryStream inputBinaryStream = null;
    SubLStream sublstream = stream.getStream( true );
    if( !( sublstream instanceof SubLInputStream ) )
      Errors.error( "read-sequence called with a non-readable stream: " + stream );
    if( sublstream instanceof SubLInputTextStream )
      inputTextStream = stream.toInputTextStream();
    if( sublstream instanceof SubLInputBinaryStream )
      inputBinaryStream = stream.toInputBinaryStream();
    if( sequence.isString() && inputTextStream != null )
    {
      SubLString str = sequence.toStr();
      int position = inputTextStream.readChar( str.toCharArray(), startTyped, endTyped - startTyped );
      return SubLObjectFactory.makeInteger( position );
    }
    SubLSequence seq = sequence.toSeq();
    if( seq.isArrayBased() )
    {
      int i = startTyped;
      for( int size = seq.size(); i < size && i < endTyped; ++i )
      {
        int cur = inputTextStream != null ? inputTextStream.readChar() : inputBinaryStream.read();
        if( cur < 0 )
          return SubLObjectFactory.makeInteger( i );
        seq.set( i, inputTextStream != null ? SubLCharacter.makeChar( cur ) : SubLObjectFactory.makeInteger( cur ) );
      }
      return SubLObjectFactory.makeInteger( i );
    }
    int i = startTyped;
    for( SubLList curList = seq.toList().nthCdr( startTyped ).toList(); curList != SubLNil.NIL && i < endTyped; curList = curList.rest().toList() )
    {
      SubLCons cons = curList.toCons();
      int cur2 = inputTextStream != null ? inputTextStream.readChar() : inputBinaryStream.read();
      if( cur2 < 0 )
        return SubLObjectFactory.makeInteger( i );
      ++i;
      cons.setFirst( inputTextStream != null ? SubLCharacter.makeChar( cur2 ) : SubLObjectFactory.makeInteger( cur2 ) );
    }
    return SubLObjectFactory.makeInteger( i );
  }

  public static SubLObject setup_streams_high_file()
  {
    return SubLNil.NIL;
  }

  public static SubLObject stream_direction(SubLObject stream)
  {
    return stream.getStream( true ).getDirection();
  }

  public static SubLObject stream_element_type(SubLObject stream)
  {
    return stream.getStream( true ).getElementType();
  }

  public static SubLObject stream_input_index(SubLObject stream)
  {
    return SubLNumberFactory.makeInteger( stream.toInputStream().getInputIndex() );
  }

  public static SubLObject stream_line_column(SubLObject stream)
  {
    return SubLNil.NIL;
  }

  public static SubLObject stream_p(SubLObject possibleStream)
  {
    return SubLObjectFactory.makeBoolean( possibleStream.isStream() );
  }

  public static SubLObject synonym_stream_symbol(SubLObject stream)
  {
    return stream.getStream( false ).getStreamSymbol();
  }

  public static SubLObject terpri(SubLObject stream)
  {
    if( stream == UNPROVIDED )
      stream = StreamsLow.$standard_output$.getDynamicValue();
    SubLOutputTextStream streamTyped = stream.toOutputTextStream();
    streamTyped.writeNewline();
    return SubLNil.NIL;
  }

  public static SubLObject unread_byte(SubLObject thebyte, SubLObject stream)
  {
    stream.toInputBinaryStream().unread( thebyte.intValue() );
    return SubLNil.NIL;
  }

  public static SubLObject unread_char(SubLObject character, SubLObject stream)
  {
    if( stream == UNPROVIDED )
      stream = StreamsLow.$standard_input$.getDynamicValue();
    stream.toInputTextStream().unread( character.toChar().charValue() );
    return SubLNil.NIL;
  }

  public static SubLObject write_byte(SubLObject theByte, SubLObject stream)
  {
    if( stream == UNPROVIDED )
      stream = StreamsLow.$standard_output$.getDynamicValue();
    stream.toOutputBinaryStream().write( theByte.intValue() );
    return theByte;
  }

  public static SubLObject write_char(SubLObject character, SubLObject stream)
  {
    if( stream == UNPROVIDED )
      stream = StreamsLow.$standard_output$.getDynamicValue();
    stream.toOutputTextStream().writeChar( character.charValue() );
    return character;
  }

  public static SubLObject write_line(SubLObject string, SubLObject stream, SubLObject start, SubLObject end)
  {
    writeString( string, stream, start, end, true );
    return string;
  }

  public static SubLObject write_positive_integer_as_byte_sequence(SubLObject positiveInteger, SubLObject byteCount, SubLObject stream, SubLObject networkByteOrder)
  {
    if( stream == UNPROVIDED )
      stream = StreamsLow.$standard_output$.getDynamicValue();
    if( networkByteOrder == UNPROVIDED )
      networkByteOrder = SubLNil.NIL;
    int byteCountVal = byteCount.intValue();
    boolean useNetworkByteOrder = networkByteOrder != SubLNil.NIL;
    long positiveIntegerVal = positiveInteger.longValue();
    stream.toOutputBinaryStream().writePositiveIntegerAsByteSequence( positiveIntegerVal, byteCountVal, useNetworkByteOrder );
    return positiveInteger;
  }

  public static SubLObject write_sequence(SubLObject sequence, SubLObject stream, SubLObject start, SubLObject end)
  {
    Errors.unimplementedMethod( "WRITE-SEQUENCE" );
    return SubLNil.NIL;
  }

  public static SubLObject write_string(SubLObject string, SubLObject stream)
  {
    writeString( string, stream, ZERO_INTEGER, SubLNumberFactory.makeInteger( string.toStr().length() ), false );
    return string;
  }

  public static SubLObject write_string(SubLObject string, SubLObject stream, SubLObject start, SubLObject end)
  {
    writeString( string, stream, start, end, false );
    return string;
  }

  public static SubLObject write_string_to_byte_sequence(SubLObject string, SubLObject stream, SubLObject offset, SubLObject length)
  {
    SubLString str = string.toStr();
    if( stream == UNPROVIDED )
      stream = StreamsLow.$standard_output$.getDynamicValue();
    int off = offset == UNPROVIDED ? 0 : offset.intValue();
    int len = length == UNPROVIDED ? str.size() : length.intValue();
    if( off + len > str.size() )
      len = str.size() - off;
    byte[] data = SubLProcess.currentSubLThread().byteBufferLarge;
    if( data.length < len )
      data = new byte[ len ];
    for( int j = 0, i = off; j < len; data[ j++ ] = (byte) str.charAt( i++ ) )
    {
    }
    stream.toOutputBinaryStream().write( data, 0, len );
    return string;
  }

  public static void writeString(String string, SubLOutputTextStream stream)
  {
    writeString( string, stream, 0, string.length(), false );
  }

  public static void writeString(String string, SubLOutputTextStream stream, int start, int end, boolean addNewline)
  {
    stream.writeString( string, start, end - start );
    if( addNewline )
      stream.writeNewline();
  }
  public static SubLFile me;
  public static int EOF_CHAR = -1;
  static
  {
    me = new streams_high();
  }

  @Override
  public void declareFunctions()
  {
    declare_streams_high_file();
  }

  @Override
  public void initializeVariables()
  {
    init_streams_high_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_streams_high_file();
  }
}
