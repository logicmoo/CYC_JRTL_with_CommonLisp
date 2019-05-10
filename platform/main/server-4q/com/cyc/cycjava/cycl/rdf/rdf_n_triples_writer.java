package com.cyc.cycjava.cycl.rdf;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.unicode_strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rdf_n_triples_writer
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rdf.rdf_n_triples_writer";
  public static final String myFingerPrint = "fc0ee80313438d893b60aed7f07fe41e7859f609f733b3dca1e666292089d326";
  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 847L)
  private static SubLSymbol $n_triples_writer_stream$;
  private static final SubLSymbol $sym0$RDF_TRIPLE_P;
  private static final SubLString $str1$Can_t_write_subject__S;
  private static final SubLString $str2$Can_t_write_predicate__S;
  private static final SubLString $str3$Can_t_write_object__S;
  private static final SubLString $str4$__A;
  private static final SubLString $str5$__;
  private static final SubLString $str6$___A;
  private static final SubLSymbol $sym7$URI_P;
  private static final SubLString $str8$__A_;
  private static final SubLSymbol $sym9$INVALID_N_TRIPLE_CHAR_P;
  private static final SubLInteger $int10$32;
  private static final SubLInteger $int11$34;
  private static final SubLInteger $int12$92;
  private static final SubLInteger $int13$127;
  private static final SubLString $str14$_t;
  private static final SubLString $str15$_n;
  private static final SubLString $str16$_r;
  private static final SubLString $str17$__;
  private static final SubLString $str18$__;
  private static final SubLString $str19$_U_8_1_0__0_A;
  private static final SubLString $str20$_u_4_1_0__0_A;

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 948L)
  public static SubLObject write_n_triple(final SubLObject v_rdf_triple, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = $n_triples_writer_stream$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != rdf_triple.rdf_triple_p( v_rdf_triple, UNPROVIDED ) : v_rdf_triple;
    final SubLObject _prev_bind_0 = $n_triples_writer_stream$.currentBinding( thread );
    try
    {
      $n_triples_writer_stream$.bind( stream, thread );
      write_n_subject( rdf_triple.rdf_triple_subject( v_rdf_triple ) );
      print_high.princ( Characters.CHAR_space, $n_triples_writer_stream$.getDynamicValue( thread ) );
      write_n_predicate( rdf_triple.rdf_triple_predicate( v_rdf_triple ) );
      print_high.princ( Characters.CHAR_space, $n_triples_writer_stream$.getDynamicValue( thread ) );
      write_n_object( rdf_triple.rdf_triple_object( v_rdf_triple ) );
      print_high.princ( Characters.CHAR_space, $n_triples_writer_stream$.getDynamicValue( thread ) );
      print_high.princ( Characters.CHAR_period, $n_triples_writer_stream$.getDynamicValue( thread ) );
      streams_high.terpri( $n_triples_writer_stream$.getDynamicValue( thread ) );
    }
    finally
    {
      $n_triples_writer_stream$.rebind( _prev_bind_0, thread );
    }
    return v_rdf_triple;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 1556L)
  public static SubLObject write_n_subject(final SubLObject subject)
  {
    if( NIL != rdf_uri.rdf_uri_p( subject ) )
    {
      write_n_uri( rdf_uri.rdf_uri_utf8_string( subject ) );
    }
    else if( NIL != web_utilities.uri_p( subject, UNPROVIDED ) )
    {
      write_n_uri( subject );
    }
    else if( NIL != rdf_blank_node.rdf_blank_node_p( subject ) )
    {
      write_n_blank_node( subject );
    }
    else
    {
      Errors.error( $str1$Can_t_write_subject__S, subject );
    }
    return subject;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 1895L)
  public static SubLObject write_n_predicate(final SubLObject predicate)
  {
    if( NIL != rdf_uri.rdf_uri_p( predicate ) )
    {
      write_n_uri( rdf_uri.rdf_uri_utf8_string( predicate ) );
    }
    else if( NIL != web_utilities.uri_p( predicate, UNPROVIDED ) )
    {
      write_n_uri( predicate );
    }
    else
    {
      Errors.error( $str2$Can_t_write_predicate__S, predicate );
    }
    return predicate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 2155L)
  public static SubLObject write_n_object(final SubLObject v_object)
  {
    if( NIL != rdf_uri.rdf_uri_p( v_object ) )
    {
      write_n_uri( rdf_uri.rdf_uri_utf8_string( v_object ) );
    }
    else if( NIL != rdf_blank_node.rdf_blank_node_p( v_object ) )
    {
      write_n_blank_node( v_object );
    }
    else if( NIL != web_utilities.uri_p( v_object, UNPROVIDED ) )
    {
      write_n_uri( v_object );
    }
    else if( NIL != rdf_literal.rdf_literal_p( v_object ) )
    {
      write_n_literal( v_object );
    }
    else
    {
      Errors.error( $str3$Can_t_write_object__S, v_object );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 2508L)
  public static SubLObject write_n_literal(final SubLObject literal)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    print_high.princ( Characters.CHAR_quotation, $n_triples_writer_stream$.getDynamicValue( thread ) );
    print_high.princ( n_triple_string_from_utf8_string( rdf_literal.rdf_literal_utf8_lexical_form( literal ) ), $n_triples_writer_stream$.getDynamicValue( thread ) );
    print_high.princ( Characters.CHAR_quotation, $n_triples_writer_stream$.getDynamicValue( thread ) );
    if( NIL != rdf_literal.rdf_literal_language_tag( literal ) )
    {
      PrintLow.format( $n_triples_writer_stream$.getDynamicValue( thread ), $str4$__A, rdf_literal.rdf_literal_language_tag( literal ) );
    }
    else if( NIL != rdf_literal.rdf_literal_datatype( literal ) )
    {
      print_high.princ( $str5$__, $n_triples_writer_stream$.getDynamicValue( thread ) );
      write_n_uri( rdf_uri.rdf_uri_utf8_string( rdf_literal.rdf_literal_datatype( literal ) ) );
    }
    return literal;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 3039L)
  public static SubLObject write_n_blank_node(final SubLObject node)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    PrintLow.format( $n_triples_writer_stream$.getDynamicValue( thread ), $str6$___A, rdf_blank_node.rdf_blank_node_id_string( node ) );
    return node;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 3172L)
  public static SubLObject write_n_uri(final SubLObject uri)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != web_utilities.uri_p( uri, UNPROVIDED ) : uri;
    PrintLow.format( $n_triples_writer_stream$.getDynamicValue( thread ), $str8$__A_, n_triple_string_from_utf8_string( uri ) );
    return uri;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 3328L)
  public static SubLObject n_triple_string_from_utf8_string(final SubLObject string)
  {
    if( NIL == Sequences.find_if( $sym9$INVALID_N_TRIPLE_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return string;
    }
    return n_triple_string_from_unicode_vector( unicode_strings.utf8_vector_to_unicode_vector( unicode_strings.utf8_string_to_utf8_vector( string ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 3576L)
  public static SubLObject invalid_n_triple_char_p(final SubLObject v_char)
  {
    return invalid_n_triple_char_code_p( Characters.char_code( v_char ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 3681L)
  public static SubLObject invalid_n_triple_char_code_p(final SubLObject code)
  {
    return makeBoolean( code.numL( $int10$32 ) || code.eql( $int11$34 ) || code.eql( $int12$92 ) || code.numGE( $int13$127 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 3825L)
  public static SubLObject n_triple_string_from_unicode_vector(final SubLObject vector)
  {
    SubLObject string = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject code_point;
      for( length = Sequences.length( vector ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        code_point = Vectors.aref( vector, element_num );
        output_n_triple_char_code( code_point, stream );
      }
      string = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 4053L)
  public static SubLObject output_n_triple_char_code(final SubLObject code_point, final SubLObject stream)
  {
    if( code_point.eql( NINE_INTEGER ) )
    {
      print_high.princ( $str14$_t, stream );
    }
    else if( code_point.eql( TEN_INTEGER ) )
    {
      print_high.princ( $str15$_n, stream );
    }
    else if( code_point.eql( THIRTEEN_INTEGER ) )
    {
      print_high.princ( $str16$_r, stream );
    }
    else if( code_point.eql( $int11$34 ) )
    {
      print_high.princ( $str17$__, stream );
    }
    else if( code_point.eql( $int12$92 ) )
    {
      print_high.princ( $str18$__, stream );
    }
    else if( code_point.numL( $int10$32 ) )
    {
      output_n_triple_unicode_escape( code_point, stream );
    }
    else if( code_point.numL( $int13$127 ) )
    {
      print_high.princ( Characters.code_char( code_point ), stream );
    }
    else
    {
      output_n_triple_unicode_escape( code_point, stream );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rdf/rdf-n-triples-writer.lisp", position = 4565L)
  public static SubLObject output_n_triple_unicode_escape(final SubLObject code_point, final SubLObject stream)
  {
    final SubLObject hex_string = number_utilities.convert_to_hexadecimal( code_point );
    if( NIL != list_utilities.lengthG( hex_string, FOUR_INTEGER, UNPROVIDED ) )
    {
      PrintLow.format( stream, $str19$_U_8_1_0__0_A, hex_string );
    }
    else
    {
      PrintLow.format( stream, $str20$_u_4_1_0__0_A, hex_string );
    }
    return NIL;
  }

  public static SubLObject declare_rdf_n_triples_writer_file()
  {
    SubLFiles.declareFunction( me, "write_n_triple", "WRITE-N-TRIPLE", 1, 1, false );
    SubLFiles.declareFunction( me, "write_n_subject", "WRITE-N-SUBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "write_n_predicate", "WRITE-N-PREDICATE", 1, 0, false );
    SubLFiles.declareFunction( me, "write_n_object", "WRITE-N-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "write_n_literal", "WRITE-N-LITERAL", 1, 0, false );
    SubLFiles.declareFunction( me, "write_n_blank_node", "WRITE-N-BLANK-NODE", 1, 0, false );
    SubLFiles.declareFunction( me, "write_n_uri", "WRITE-N-URI", 1, 0, false );
    SubLFiles.declareFunction( me, "n_triple_string_from_utf8_string", "N-TRIPLE-STRING-FROM-UTF8-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "invalid_n_triple_char_p", "INVALID-N-TRIPLE-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "invalid_n_triple_char_code_p", "INVALID-N-TRIPLE-CHAR-CODE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "n_triple_string_from_unicode_vector", "N-TRIPLE-STRING-FROM-UNICODE-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "output_n_triple_char_code", "OUTPUT-N-TRIPLE-CHAR-CODE", 2, 0, false );
    SubLFiles.declareFunction( me, "output_n_triple_unicode_escape", "OUTPUT-N-TRIPLE-UNICODE-ESCAPE", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_rdf_n_triples_writer_file()
  {
    $n_triples_writer_stream$ = SubLFiles.defparameter( "*N-TRIPLES-WRITER-STREAM*", StreamsLow.$standard_output$.getDynamicValue() );
    return NIL;
  }

  public static SubLObject setup_rdf_n_triples_writer_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rdf_n_triples_writer_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rdf_n_triples_writer_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rdf_n_triples_writer_file();
  }
  static
  {
    me = new rdf_n_triples_writer();
    $n_triples_writer_stream$ = null;
    $sym0$RDF_TRIPLE_P = makeSymbol( "RDF-TRIPLE-P" );
    $str1$Can_t_write_subject__S = makeString( "Can't write subject ~S" );
    $str2$Can_t_write_predicate__S = makeString( "Can't write predicate ~S" );
    $str3$Can_t_write_object__S = makeString( "Can't write object ~S" );
    $str4$__A = makeString( "@~A" );
    $str5$__ = makeString( "^^" );
    $str6$___A = makeString( "_:~A" );
    $sym7$URI_P = makeSymbol( "URI-P" );
    $str8$__A_ = makeString( "<~A>" );
    $sym9$INVALID_N_TRIPLE_CHAR_P = makeSymbol( "INVALID-N-TRIPLE-CHAR-P" );
    $int10$32 = makeInteger( 32 );
    $int11$34 = makeInteger( 34 );
    $int12$92 = makeInteger( 92 );
    $int13$127 = makeInteger( 127 );
    $str14$_t = makeString( "\\t" );
    $str15$_n = makeString( "\\n" );
    $str16$_r = makeString( "\\r" );
    $str17$__ = makeString( "\\\"" );
    $str18$__ = makeString( "\\\\" );
    $str19$_U_8_1_0__0_A = makeString( "\\U~8,1,0,'0@A" );
    $str20$_u_4_1_0__0_A = makeString( "\\u~4,1,0,'0@A" );
  }
}
/*
 * 
 * Total time: 158 ms
 * 
 */