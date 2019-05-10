package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class unicode_nauts
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.unicode_nauts";
  public static final String myFingerPrint = "496e602149a697bd8ce0766b00e5b094cd3b5f6ee7a7c9e80d03db94cd54ed07";
  @SubLTranslatedFile.SubL(source = "cycl/unicode-nauts.lisp", position = 846L)
  public static SubLSymbol $empty_unicode_naut$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$UNICODE_NAUT_P;
  private static final SubLSymbol $sym2$CONVERT_UNICODE_STRING_NAUT_TO_UTF8;
  private static final SubLObject $const3$UnicodeStringFn;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$DISPLAY_VECTOR_STRING_P;
  private static final SubLString $str6$_u;
  private static final SubLSymbol $sym7$CHAR_EQUAL;
  private static final SubLSymbol $sym8$UNICODE_CHAR_CODE_EQUAL_;
  private static final SubLString $str9$Can_t_get_substring_from__S_to__S;
  private static final SubLSymbol $sym10$ASCII_CHAR_P;
  private static final SubLSymbol $sym11$CODE_CHAR;

  @SubLTranslatedFile.SubL(source = "cycl/unicode-nauts.lisp", position = 916L)
  public static SubLObject empty_cycl_string_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != string_utilities.empty_string_p( v_object ) || $empty_unicode_naut$.getGlobalValue().equal( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-nauts.lisp", position = 1041L)
  public static SubLObject convert_unicode_nauts_to_utf8_strings(final SubLObject sexpr)
  {
    return transform_list_utilities.transform( sexpr, $sym1$UNICODE_NAUT_P, $sym2$CONVERT_UNICODE_STRING_NAUT_TO_UTF8, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-nauts.lisp", position = 1259L)
  public static SubLObject convert_unicode_string_naut_to_utf8(final SubLObject obj)
  {
    return unicode_strings.unicode_display_to_utf8( cycl_utilities.formula_arg1( obj, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-nauts.lisp", position = 1374L)
  public static SubLObject unicode_naut_p(final SubLObject string, SubLObject strict)
  {
    if( strict == UNPROVIDED )
    {
      strict = NIL;
    }
    return makeBoolean( NIL != cycl_grammar.cycl_nat_p( string ) && cycl_utilities.nat_functor( string ).eql( $const3$UnicodeStringFn ) && ( NIL == strict || NIL != pattern_match.tree_matches_pattern( string,
        $list4 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-nauts.lisp", position = 1631L)
  public static SubLObject make_unicode_naut(final SubLObject unicode_display)
  {
    assert NIL != unicode_strings.display_vector_string_p( unicode_display ) : unicode_display;
    return el_utilities.make_unary_formula( $const3$UnicodeStringFn, unicode_display );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-nauts.lisp", position = 1802L)
  public static SubLObject utf8_string_to_cycl_safe_string(final SubLObject utf8_string)
  {
    if( NIL != unicode_strings.ascii_string_p( utf8_string ) )
    {
      return utf8_string;
    }
    return make_unicode_naut( unicode_strings.utf8_string_to_display( utf8_string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-nauts.lisp", position = 2000L)
  public static SubLObject unicode_string_to_cycl_safe_string(final SubLObject unicode_string)
  {
    if( NIL != unicode_strings.unicode_string_p( unicode_string ) )
    {
      return utf8_string_to_cycl_safe_string( unicode_strings.unicode_string_to_utf8( unicode_string ) );
    }
    return utf8_string_to_cycl_safe_string( unicode_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-nauts.lisp", position = 2263L)
  public static SubLObject display_vector_string_to_cycl_safe_string(final SubLObject display_vector_string)
  {
    assert NIL != unicode_strings.display_vector_string_p( display_vector_string ) : display_vector_string;
    if( NIL != Sequences.search( $str6$_u, display_vector_string, Symbols.symbol_function( $sym7$CHAR_EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return make_unicode_naut( display_vector_string );
    }
    return unicode_strings.display_to_subl_string( display_vector_string, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-nauts.lisp", position = 2739L)
  public static SubLObject non_ascii_string_to_unicode(final SubLObject string)
  {
    return make_unicode_naut( unicode_strings.utf8_string_to_display( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-nauts.lisp", position = 2921L)
  public static SubLObject string_or_unicode_naut_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isString() || NIL != unicode_naut_p( v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-nauts.lisp", position = 3032L)
  public static SubLObject unicode_substringP(final SubLObject substring, final SubLObject string, final SubLObject case_sensitiveP)
  {
    final SubLObject subvector = string_or_unicode_naut_to_unicode_vector( substring );
    final SubLObject vector = string_or_unicode_naut_to_unicode_vector( string );
    final SubLObject test = ( NIL != case_sensitiveP ) ? Symbols.symbol_function( EQL ) : $sym8$UNICODE_CHAR_CODE_EQUAL_;
    return list_utilities.sublisp_boolean( Sequences.search( subvector, vector, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-nauts.lisp", position = 3484L)
  public static SubLObject string_or_unicode_naut_to_unicode_vector(final SubLObject string)
  {
    if( NIL != unicode_naut_p( string, UNPROVIDED ) )
    {
      return unicode_strings.display_to_unicode_vector( cycl_utilities.nat_arg1( string, UNPROVIDED ) );
    }
    final SubLObject as_html_escaped = unicode_strings.html_escaped_to_unicode_vector( string );
    return ( NIL != as_html_escaped ) ? as_html_escaped : unicode_strings.display_to_unicode_vector( unicode_strings.utf8_string_to_display( string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-nauts.lisp", position = 3819L)
  public static SubLObject unicode_char_code_equalP(final SubLObject code1, final SubLObject code2)
  {
    if( code1.eql( code2 ) )
    {
      return T;
    }
    final SubLObject char1 = Characters.code_char( code1 );
    final SubLObject char2 = Characters.code_char( code2 );
    return makeBoolean( NIL != char1 && NIL != char2 && NIL != Characters.char_equal( char1, char2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/unicode-nauts.lisp", position = 4119L)
  public static SubLObject unicode_substring(final SubLObject string, final SubLObject start, final SubLObject end)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != unicode_naut_p( string, UNPROVIDED ) : string;
    final SubLObject vector = unicode_strings.display_to_unicode_vector( cycl_utilities.nat_arg1( string, UNPROVIDED ) );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == list_utilities.lengthGE( vector, start, UNPROVIDED ) || ( NIL != end && NIL == list_utilities.lengthGE( vector, end, UNPROVIDED ) ) || !end
        .numGE( start ) ) )
    {
      Errors.error( $str9$Can_t_get_substring_from__S_to__S, start, end, string );
    }
    final SubLObject subvector = Sequences.subseq( vector, start, end );
    return ( NIL != list_utilities.find_if_not( $sym10$ASCII_CHAR_P, subvector, $sym11$CODE_CHAR, UNPROVIDED, UNPROVIDED ) ) ? make_unicode_naut( unicode_strings.unicode_vector_to_display( subvector ) )
        : unicode_strings.utf8_vector_to_utf8_string( unicode_strings.unicode_vector_to_utf8_vector( subvector, UNPROVIDED, UNPROVIDED ) );
  }

  public static SubLObject declare_unicode_nauts_file()
  {
    SubLFiles.declareFunction( me, "empty_cycl_string_p", "EMPTY-CYCL-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_unicode_nauts_to_utf8_strings", "CONVERT-UNICODE-NAUTS-TO-UTF8-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_unicode_string_naut_to_utf8", "CONVERT-UNICODE-STRING-NAUT-TO-UTF8", 1, 0, false );
    SubLFiles.declareFunction( me, "unicode_naut_p", "UNICODE-NAUT-P", 1, 1, false );
    SubLFiles.declareFunction( me, "make_unicode_naut", "MAKE-UNICODE-NAUT", 1, 0, false );
    SubLFiles.declareFunction( me, "utf8_string_to_cycl_safe_string", "UTF8-STRING-TO-CYCL-SAFE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "unicode_string_to_cycl_safe_string", "UNICODE-STRING-TO-CYCL-SAFE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "display_vector_string_to_cycl_safe_string", "DISPLAY-VECTOR-STRING-TO-CYCL-SAFE-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "non_ascii_string_to_unicode", "NON-ASCII-STRING-TO-UNICODE", 1, 0, false );
    SubLFiles.declareFunction( me, "string_or_unicode_naut_p", "STRING-OR-UNICODE-NAUT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "unicode_substringP", "UNICODE-SUBSTRING?", 3, 0, false );
    SubLFiles.declareFunction( me, "string_or_unicode_naut_to_unicode_vector", "STRING-OR-UNICODE-NAUT-TO-UNICODE-VECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "unicode_char_code_equalP", "UNICODE-CHAR-CODE-EQUAL?", 2, 0, false );
    SubLFiles.declareFunction( me, "unicode_substring", "UNICODE-SUBSTRING", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_unicode_nauts_file()
  {
    $empty_unicode_naut$ = SubLFiles.defconstant( "*EMPTY-UNICODE-NAUT*", $list0 );
    return NIL;
  }

  public static SubLObject setup_unicode_nauts_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_unicode_nauts_file();
  }

  @Override
  public void initializeVariables()
  {
    init_unicode_nauts_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_unicode_nauts_file();
  }
  static
  {
    me = new unicode_nauts();
    $empty_unicode_naut$ = null;
    $list0 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "UnicodeStringFn" ) ), makeString( "" ) );
    $sym1$UNICODE_NAUT_P = makeSymbol( "UNICODE-NAUT-P" );
    $sym2$CONVERT_UNICODE_STRING_NAUT_TO_UTF8 = makeSymbol( "CONVERT-UNICODE-STRING-NAUT-TO-UTF8" );
    $const3$UnicodeStringFn = constant_handles.reader_make_constant_shell( makeString( "UnicodeStringFn" ) );
    $list4 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "UnicodeStringFn" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "DISPLAY-VECTOR-STRING-P" ) ) );
    $sym5$DISPLAY_VECTOR_STRING_P = makeSymbol( "DISPLAY-VECTOR-STRING-P" );
    $str6$_u = makeString( "&u" );
    $sym7$CHAR_EQUAL = makeSymbol( "CHAR-EQUAL" );
    $sym8$UNICODE_CHAR_CODE_EQUAL_ = makeSymbol( "UNICODE-CHAR-CODE-EQUAL?" );
    $str9$Can_t_get_substring_from__S_to__S = makeString( "Can't get substring from ~S to ~S of ~S" );
    $sym10$ASCII_CHAR_P = makeSymbol( "ASCII-CHAR-P" );
    $sym11$CODE_CHAR = makeSymbol( "CODE-CHAR" );
  }
}
/*
 * 
 * Total time: 94 ms
 * 
 */