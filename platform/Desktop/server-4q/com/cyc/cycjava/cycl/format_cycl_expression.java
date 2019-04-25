package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.cycjava.cycl.owl.owlification;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class format_cycl_expression
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.format_cycl_expression";
  public static final String myFingerPrint = "fbc878f5940ca3ed6c5bc3629c937a3a201b2e066bc35c293f44aa051a54c615";
  @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 2949L)
  public static SubLSymbol $format_cycl_expression_newline_method$;
  @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 3037L)
  public static SubLSymbol $format_cycl_expression_indent_method$;
  @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 3698L)
  public static SubLSymbol $format_cycl_expression_atom_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 3945L)
  public static SubLSymbol $format_cycl_expression_constant_method$;
  @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 4310L)
  public static SubLSymbol $format_cycl_expression_nat_method$;
  @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 4766L)
  public static SubLSymbol $format_cycl_expression_assertion_method$;
  private static final SubLSymbol $sym0$GET_PRETTY_FORMATTED_STRING;
  private static final SubLString $str1$_;
  private static final SubLString $str2$_;
  private static final SubLString $str3$___;
  private static final SubLString $str4$_;
  private static final SubLSymbol $sym5$TERPRI;
  private static final SubLSymbol $sym6$FORMAT_CYCL_EXPRESSION_DEFAULT_INDENT;
  private static final SubLInteger $int7$256;
  private static final SubLSymbol $sym8$FORMAT_CYCL_EXPRESSION_ATOM_CONSTANT_METHOD;
  private static final SubLSymbol $sym9$FORMAT_CYCL_EXPRESSION_ATOM_NART_METHOD;
  private static final SubLSymbol $sym10$FORMAT_CYCL_EXPRESSION_ATOM_ASSERTION_METHOD;
  private static final SubLSymbol $kw11$TEST;
  private static final SubLSymbol $kw12$OWNER;
  private static final SubLSymbol $kw13$CLASSES;
  private static final SubLSymbol $kw14$KB;
  private static final SubLSymbol $kw15$FULL;
  private static final SubLSymbol $kw16$WORKING_;
  private static final SubLList $list17;

  @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 1050L)
  public static SubLObject get_pretty_formatted_string(final SubLObject obj, SubLObject include_constant_reader_prefix, SubLObject wrap_lines)
  {
    if( include_constant_reader_prefix == UNPROVIDED )
    {
      include_constant_reader_prefix = NIL;
    }
    if( wrap_lines == UNPROVIDED )
    {
      wrap_lines = NIL;
    }
    final SubLObject depth = ( NIL != wrap_lines ) ? ZERO_INTEGER : NIL;
    SubLObject s = format_cycl_expression_to_string( obj, depth );
    if( NIL == include_constant_reader_prefix )
    {
      s = owlification.strip_hl_artifacts( s );
    }
    s = string_utilities.left_trim_whitespace( s );
    return s;
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 1512L)
  public static SubLObject format_cycl_expression(final SubLObject expression, SubLObject stream, SubLObject depth)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( depth == UNPROVIDED )
    {
      depth = ZERO_INTEGER;
    }
    return format_cycl_expression_recursive( expression, stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 1866L)
  public static SubLObject format_cycl_expression_to_string(final SubLObject expression, SubLObject depth)
  {
    if( depth == UNPROVIDED )
    {
      depth = ZERO_INTEGER;
    }
    SubLObject result = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      format_cycl_expression( expression, stream, depth );
      result = streams_high.get_output_stream_string( stream );
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
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 2245L)
  public static SubLObject format_cycl_expression_recursive(final SubLObject expression, final SubLObject stream, final SubLObject depth)
  {
    if( expression.isAtom() )
    {
      format_cycl_expression_atom( expression, stream, depth );
    }
    else
    {
      format_cycl_expression_indent( stream, depth );
      print_high.princ( $str1$_, stream );
      format_cycl_expression_recursive( expression.first(), stream, NIL );
      SubLObject rest;
      for( rest = NIL, rest = expression.rest(); rest.isCons(); rest = rest.rest() )
      {
        print_high.princ( $str2$_, stream );
        format_cycl_expression_recursive( rest.first(), stream, depth.isInteger() ? Numbers.add( depth, ONE_INTEGER ) : NIL );
      }
      if( NIL != rest )
      {
        print_high.princ( $str3$___, stream );
        format_cycl_expression_recursive( rest, stream, depth.isInteger() ? Numbers.add( depth, ONE_INTEGER ) : NIL );
      }
      print_high.princ( $str4$_, stream );
    }
    return expression;
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 3141L)
  public static SubLObject format_cycl_expression_default_indent(final SubLObject stream, final SubLObject depth)
  {
    return string_utilities.indent( stream, Numbers.multiply( TWO_INTEGER, depth ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 3248L)
  public static SubLObject format_cycl_expression_indent(final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( depth.isInteger() )
    {
      Functions.funcall( $format_cycl_expression_newline_method$.getDynamicValue( thread ), stream );
      if( depth.numG( ZERO_INTEGER ) )
      {
        Functions.funcall( $format_cycl_expression_indent_method$.getDynamicValue( thread ), stream, depth );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 3698L)
  public static SubLObject format_cycl_expression_atom(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLObject method_function = Structures.method_func( v_object, $format_cycl_expression_atom_method_table$.getGlobalValue() );
    if( NIL != method_function )
    {
      return Functions.funcall( method_function, v_object, stream, depth );
    }
    return format_cycl_expression_default( v_object, stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 3826L)
  public static SubLObject format_cycl_expression_default(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    return print_high.prin1( v_object, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 4030L)
  public static SubLObject format_cycl_expression_atom_constant_method(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $format_cycl_expression_constant_method$.getDynamicValue( thread ) )
    {
      Functions.funcall( $format_cycl_expression_constant_method$.getDynamicValue( thread ), v_object, stream, depth );
    }
    else
    {
      format_cycl_expression_default( v_object, stream, depth );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 4385L)
  public static SubLObject format_cycl_expression_atom_nart_method(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    return format_cycl_expression_nat( v_object, stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 4516L)
  public static SubLObject format_cycl_expression_nat(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $format_cycl_expression_nat_method$.getDynamicValue( thread ) )
    {
      Functions.funcall( $format_cycl_expression_nat_method$.getDynamicValue( thread ), v_object, stream, depth );
      return NIL;
    }
    return format_cycl_expression_default( v_object, stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 4853L)
  public static SubLObject format_cycl_expression_atom_assertion_method(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    return format_cycl_expression_assertion( v_object, stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/format-cycl-expression.lisp", position = 4995L)
  public static SubLObject format_cycl_expression_assertion(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $format_cycl_expression_assertion_method$.getDynamicValue( thread ) )
    {
      Functions.funcall( $format_cycl_expression_assertion_method$.getDynamicValue( thread ), v_object, stream, depth );
      return NIL;
    }
    return format_cycl_expression_default( v_object, stream, depth );
  }

  public static SubLObject declare_format_cycl_expression_file()
  {
    SubLFiles.declareFunction( me, "get_pretty_formatted_string", "GET-PRETTY-FORMATTED-STRING", 1, 2, false );
    SubLFiles.declareFunction( me, "format_cycl_expression", "FORMAT-CYCL-EXPRESSION", 1, 2, false );
    SubLFiles.declareFunction( me, "format_cycl_expression_to_string", "FORMAT-CYCL-EXPRESSION-TO-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "format_cycl_expression_recursive", "FORMAT-CYCL-EXPRESSION-RECURSIVE", 3, 0, false );
    SubLFiles.declareFunction( me, "format_cycl_expression_default_indent", "FORMAT-CYCL-EXPRESSION-DEFAULT-INDENT", 2, 0, false );
    SubLFiles.declareFunction( me, "format_cycl_expression_indent", "FORMAT-CYCL-EXPRESSION-INDENT", 2, 0, false );
    SubLFiles.declareFunction( me, "format_cycl_expression_atom", "FORMAT-CYCL-EXPRESSION-ATOM", 3, 0, false );
    SubLFiles.declareFunction( me, "format_cycl_expression_default", "FORMAT-CYCL-EXPRESSION-DEFAULT", 3, 0, false );
    SubLFiles.declareFunction( me, "format_cycl_expression_atom_constant_method", "FORMAT-CYCL-EXPRESSION-ATOM-CONSTANT-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "format_cycl_expression_atom_nart_method", "FORMAT-CYCL-EXPRESSION-ATOM-NART-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "format_cycl_expression_nat", "FORMAT-CYCL-EXPRESSION-NAT", 3, 0, false );
    SubLFiles.declareFunction( me, "format_cycl_expression_atom_assertion_method", "FORMAT-CYCL-EXPRESSION-ATOM-ASSERTION-METHOD", 3, 0, false );
    SubLFiles.declareFunction( me, "format_cycl_expression_assertion", "FORMAT-CYCL-EXPRESSION-ASSERTION", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_format_cycl_expression_file()
  {
    $format_cycl_expression_newline_method$ = SubLFiles.defparameter( "*FORMAT-CYCL-EXPRESSION-NEWLINE-METHOD*", $sym5$TERPRI );
    $format_cycl_expression_indent_method$ = SubLFiles.defparameter( "*FORMAT-CYCL-EXPRESSION-INDENT-METHOD*", $sym6$FORMAT_CYCL_EXPRESSION_DEFAULT_INDENT );
    $format_cycl_expression_atom_method_table$ = SubLFiles.deflexical( "*FORMAT-CYCL-EXPRESSION-ATOM-METHOD-TABLE*", Vectors.make_vector( $int7$256, NIL ) );
    $format_cycl_expression_constant_method$ = SubLFiles.defparameter( "*FORMAT-CYCL-EXPRESSION-CONSTANT-METHOD*", NIL );
    $format_cycl_expression_nat_method$ = SubLFiles.defparameter( "*FORMAT-CYCL-EXPRESSION-NAT-METHOD*", NIL );
    $format_cycl_expression_assertion_method$ = SubLFiles.defparameter( "*FORMAT-CYCL-EXPRESSION-ASSERTION-METHOD*", NIL );
    return NIL;
  }

  public static SubLObject setup_format_cycl_expression_file()
  {
    access_macros.register_external_symbol( $sym0$GET_PRETTY_FORMATTED_STRING );
    Structures.register_method( $format_cycl_expression_atom_method_table$.getGlobalValue(), constant_handles.$dtp_constant$.getGlobalValue(), Symbols.symbol_function(
        $sym8$FORMAT_CYCL_EXPRESSION_ATOM_CONSTANT_METHOD ) );
    Structures.register_method( $format_cycl_expression_atom_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function( $sym9$FORMAT_CYCL_EXPRESSION_ATOM_NART_METHOD ) );
    Structures.register_method( $format_cycl_expression_atom_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), Symbols.symbol_function(
        $sym10$FORMAT_CYCL_EXPRESSION_ATOM_ASSERTION_METHOD ) );
    generic_testing.define_test_case_table_int( $sym0$GET_PRETTY_FORMATTED_STRING, ConsesLow.list( new SubLObject[] { $kw11$TEST, NIL, $kw12$OWNER, NIL, $kw13$CLASSES, NIL, $kw14$KB, $kw15$FULL, $kw16$WORKING_, T
    } ), $list17 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_format_cycl_expression_file();
  }

  @Override
  public void initializeVariables()
  {
    init_format_cycl_expression_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_format_cycl_expression_file();
  }
  static
  {
    me = new format_cycl_expression();
    $format_cycl_expression_newline_method$ = null;
    $format_cycl_expression_indent_method$ = null;
    $format_cycl_expression_atom_method_table$ = null;
    $format_cycl_expression_constant_method$ = null;
    $format_cycl_expression_nat_method$ = null;
    $format_cycl_expression_assertion_method$ = null;
    $sym0$GET_PRETTY_FORMATTED_STRING = makeSymbol( "GET-PRETTY-FORMATTED-STRING" );
    $str1$_ = makeString( "(" );
    $str2$_ = makeString( " " );
    $str3$___ = makeString( " . " );
    $str4$_ = makeString( ")" );
    $sym5$TERPRI = makeSymbol( "TERPRI" );
    $sym6$FORMAT_CYCL_EXPRESSION_DEFAULT_INDENT = makeSymbol( "FORMAT-CYCL-EXPRESSION-DEFAULT-INDENT" );
    $int7$256 = makeInteger( 256 );
    $sym8$FORMAT_CYCL_EXPRESSION_ATOM_CONSTANT_METHOD = makeSymbol( "FORMAT-CYCL-EXPRESSION-ATOM-CONSTANT-METHOD" );
    $sym9$FORMAT_CYCL_EXPRESSION_ATOM_NART_METHOD = makeSymbol( "FORMAT-CYCL-EXPRESSION-ATOM-NART-METHOD" );
    $sym10$FORMAT_CYCL_EXPRESSION_ATOM_ASSERTION_METHOD = makeSymbol( "FORMAT-CYCL-EXPRESSION-ATOM-ASSERTION-METHOD" );
    $kw11$TEST = makeKeyword( "TEST" );
    $kw12$OWNER = makeKeyword( "OWNER" );
    $kw13$CLASSES = makeKeyword( "CLASSES" );
    $kw14$KB = makeKeyword( "KB" );
    $kw15$FULL = makeKeyword( "FULL" );
    $kw16$WORKING_ = makeKeyword( "WORKING?" );
    $list17 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
        makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Cat" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "likesAsFriend" ) ),
            makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "DaveS" ) ) ) ), T, T ), makeString( "(#$implies \n  (#$isa ?X #$Cat) \n  (#$likesAsFriend ?X #$DaveS))" ) ), ConsesLow.list(
                ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol(
                    "?X" ), constant_handles.reader_make_constant_shell( makeString( "Cat" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "likesAsFriend" ) ), makeSymbol( "?X" ),
                        constant_handles.reader_make_constant_shell( makeString( "DaveS" ) ) ) ), T, NIL ), makeString( "(#$implies (#$isa ?X #$Cat) (#$likesAsFriend ?X #$DaveS))" ) ), ConsesLow.list( ConsesLow.list(
                            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ),
                                constant_handles.reader_make_constant_shell( makeString( "Cat" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "likesAsFriend" ) ), makeSymbol( "?X" ),
                                    constant_handles.reader_make_constant_shell( makeString( "DaveS" ) ) ) ), NIL, T ), makeString( "(implies \n  (isa ?X Cat) \n  (likesAsFriend ?X DaveS))" ) ), ConsesLow.list( ConsesLow
                                        .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ),
                                            makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "Cat" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                "likesAsFriend" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString( "DaveS" ) ) ) ), NIL, NIL ), makeString(
                                                    "(implies (isa ?X Cat) (likesAsFriend ?X DaveS))" ) ) );
  }
}
/*
 * 
 * Total time: 134 ms
 * 
 */