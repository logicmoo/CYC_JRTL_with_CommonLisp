package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class red_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.red_utilities";
  public static final String myFingerPrint = "6e1e2aafeccd7a124af8e98da861614af90f8b6dcc4f389efa86bdd3b9decb19";
  @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 853L)
  public static SubLSymbol $red_key_name_separator$;
  @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 1033L)
  public static SubLSymbol $red_root_key_os$;
  @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 1141L)
  public static SubLSymbol $red_root_key_application$;
  @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 1262L)
  public static SubLSymbol $red_root_key_external$;
  @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 1374L)
  public static SubLSymbol $red_root_key_license_keys$;
  @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 4482L)
  private static SubLSymbol $interpretable_red_element_value_key$;
  @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 4551L)
  private static SubLSymbol $interpretable_red_element_interpretation_key$;
  @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 4636L)
  private static SubLSymbol $red_element_interpret_as_literal$;
  @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 4703L)
  private static SubLSymbol $red_element_interpret_as_symbol_value$;
  private static final SubLString $str0$_;
  private static final SubLString $str1$os;
  private static final SubLString $str2$application;
  private static final SubLString $str3$external;
  private static final SubLString $str4$license_keys;
  private static final SubLSymbol $kw5$LEAST_PRIVILEGED;
  private static final SubLString $str6$master_license_key;
  private static final SubLSymbol $sym7$RED_ELEMENT_STRUCT_P;
  private static final SubLSymbol $sym8$LISTP;
  private static final SubLSymbol $sym9$STRING_;
  private static final SubLSymbol $sym10$RED_ELEMENT_GET_KEY;
  private static final SubLString $str11$value;
  private static final SubLString $str12$interpretation;
  private static final SubLString $str13$literal;
  private static final SubLString $str14$symbol_value;
  private static final SubLString $str15$CYC;
  private static final SubLSymbol $sym16$EMPTY_STRING_P;
  private static final SubLList $list17;

  @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 1488L)
  public static SubLObject get_red_application_element()
  {
    return red_api.red_get_element( red_api.red_repository_list_struct_create( $kw5$LEAST_PRIVILEGED ), $red_root_key_application$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 1726L)
  public static SubLObject get_red_external_element()
  {
    return red_api.red_get_element( red_api.red_repository_list_struct_create( $kw5$LEAST_PRIVILEGED ), $red_root_key_external$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 1900L)
  public static SubLObject get_red_application_elements()
  {
    final SubLObject red_application_element = get_red_application_element();
    return ( NIL != red_application_element ) ? red_api.red_element_get_sub_elements( red_application_element ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 2113L)
  public static SubLObject get_red_root_element_for_application(final SubLObject application_name)
  {
    final SubLObject red_application_element = get_red_application_element();
    return ( NIL != red_application_element ) ? red_api.red_get_element_get_sub_element_by_key( red_application_element, application_name ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 2378L)
  public static SubLObject get_red_root_element_for_external(final SubLObject external_name)
  {
    final SubLObject red_external_element = get_red_external_element();
    return ( NIL != red_external_element ) ? red_api.red_get_element_get_sub_element_by_key( red_external_element, external_name ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 2622L)
  public static SubLObject get_red_os_element()
  {
    return red_api.red_get_element( red_api.red_repository_list_struct_create( $kw5$LEAST_PRIVILEGED ), $red_root_key_os$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 2784L)
  public static SubLObject get_red_os_elements()
  {
    return red_api.red_element_get_sub_elements( get_red_os_element() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 2884L)
  public static SubLObject get_red_master_license_key()
  {
    final SubLObject keys_element = red_api.red_get_element( red_api.red_repository_list_struct_create( $kw5$LEAST_PRIVILEGED ), $red_root_key_license_keys$.getGlobalValue() );
    if( NIL != keys_element )
    {
      final SubLObject master_key_element = red_api.red_get_element_get_sub_element_by_key( keys_element, $str6$master_license_key );
      if( NIL != master_key_element )
      {
        return red_api.red_element_get_value( master_key_element );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 3303L)
  public static SubLObject red_get_element_get_sub_element_by_path(final SubLObject repository_element_struct, final SubLObject path)
  {
    assert NIL != red_api.red_element_struct_p( repository_element_struct ) : repository_element_struct;
    assert NIL != Types.listp( path ) : path;
    SubLObject sub_element = repository_element_struct;
    SubLObject cdolist_list_var = path;
    SubLObject key = NIL;
    key = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      sub_element = red_api.red_get_element_get_sub_element_by_key( sub_element, key );
      if( NIL == red_api.red_element_struct_p( sub_element ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      key = cdolist_list_var.first();
    }
    return sub_element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 4083L)
  public static SubLObject interpret_red_element_subtree(final SubLObject root_element)
  {
    final SubLObject elements = red_api.red_element_get_sub_elements( root_element );
    SubLObject interpretation = NIL;
    SubLObject cdolist_list_var = Sort.sort( elements, $sym9$STRING_, $sym10$RED_ELEMENT_GET_KEY );
    SubLObject element = NIL;
    element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      interpretation = ConsesLow.cons( interpret_red_element_subelements( element ), interpretation );
      cdolist_list_var = cdolist_list_var.rest();
      element = cdolist_list_var.first();
    }
    return Sequences.nreverse( interpretation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 4779L)
  public static SubLObject interpret_red_element_subelements(final SubLObject element)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject value = red_api.red_element_get_value( red_api.red_get_element_get_sub_element_by_key( element, $interpretable_red_element_value_key$.getGlobalValue() ) );
    final SubLObject interpretation = red_api.red_element_get_value( red_api.red_get_element_get_sub_element_by_key( element, $interpretable_red_element_interpretation_key$.getGlobalValue() ) );
    if( NIL != Strings.string_equal( $red_element_interpret_as_literal$.getGlobalValue(), interpretation, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return value;
    }
    if( NIL != Strings.string_equal( $red_element_interpret_as_symbol_value$.getGlobalValue(), interpretation, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject v_package = interpret_red_element_value_as_symbol_reference( value, UNPROVIDED );
      final SubLObject symbol = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return Symbols.symbol_value( Packages.find_symbol( symbol, Packages.find_package( v_package ) ) );
    }
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-utilities.lisp", position = 5579L)
  public static SubLObject interpret_red_element_value_as_symbol_reference(final SubLObject reference, SubLObject default_package_name)
  {
    if( default_package_name == UNPROVIDED )
    {
      default_package_name = $str15$CYC;
    }
    final SubLObject pieces = Sequences.delete_if( Symbols.symbol_function( $sym16$EMPTY_STRING_P ), string_utilities.split_string( reference, $list17 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != list_utilities.lengthE( pieces, TWO_INTEGER, UNPROVIDED ) )
    {
      return Values.values( pieces.first(), conses_high.second( pieces ) );
    }
    return Values.values( default_package_name, pieces.first() );
  }

  public static SubLObject declare_red_utilities_file()
  {
    SubLFiles.declareFunction( me, "get_red_application_element", "GET-RED-APPLICATION-ELEMENT", 0, 0, false );
    SubLFiles.declareFunction( me, "get_red_external_element", "GET-RED-EXTERNAL-ELEMENT", 0, 0, false );
    SubLFiles.declareFunction( me, "get_red_application_elements", "GET-RED-APPLICATION-ELEMENTS", 0, 0, false );
    SubLFiles.declareFunction( me, "get_red_root_element_for_application", "GET-RED-ROOT-ELEMENT-FOR-APPLICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "get_red_root_element_for_external", "GET-RED-ROOT-ELEMENT-FOR-EXTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_red_os_element", "GET-RED-OS-ELEMENT", 0, 0, false );
    SubLFiles.declareFunction( me, "get_red_os_elements", "GET-RED-OS-ELEMENTS", 0, 0, false );
    SubLFiles.declareFunction( me, "get_red_master_license_key", "GET-RED-MASTER-LICENSE-KEY", 0, 0, false );
    SubLFiles.declareFunction( me, "red_get_element_get_sub_element_by_path", "RED-GET-ELEMENT-GET-SUB-ELEMENT-BY-PATH", 2, 0, false );
    SubLFiles.declareFunction( me, "interpret_red_element_subtree", "INTERPRET-RED-ELEMENT-SUBTREE", 1, 0, false );
    SubLFiles.declareFunction( me, "interpret_red_element_subelements", "INTERPRET-RED-ELEMENT-SUBELEMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "interpret_red_element_value_as_symbol_reference", "INTERPRET-RED-ELEMENT-VALUE-AS-SYMBOL-REFERENCE", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_red_utilities_file()
  {
    $red_key_name_separator$ = SubLFiles.deflexical( "*RED-KEY-NAME-SEPARATOR*", $str0$_ );
    $red_root_key_os$ = SubLFiles.deflexical( "*RED-ROOT-KEY-OS*", $str1$os );
    $red_root_key_application$ = SubLFiles.deflexical( "*RED-ROOT-KEY-APPLICATION*", $str2$application );
    $red_root_key_external$ = SubLFiles.deflexical( "*RED-ROOT-KEY-EXTERNAL*", $str3$external );
    $red_root_key_license_keys$ = SubLFiles.deflexical( "*RED-ROOT-KEY-LICENSE-KEYS*", $str4$license_keys );
    $interpretable_red_element_value_key$ = SubLFiles.deflexical( "*INTERPRETABLE-RED-ELEMENT-VALUE-KEY*", $str11$value );
    $interpretable_red_element_interpretation_key$ = SubLFiles.deflexical( "*INTERPRETABLE-RED-ELEMENT-INTERPRETATION-KEY*", $str12$interpretation );
    $red_element_interpret_as_literal$ = SubLFiles.deflexical( "*RED-ELEMENT-INTERPRET-AS-LITERAL*", $str13$literal );
    $red_element_interpret_as_symbol_value$ = SubLFiles.deflexical( "*RED-ELEMENT-INTERPRET-AS-SYMBOL-VALUE*", $str14$symbol_value );
    return NIL;
  }

  public static SubLObject setup_red_utilities_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_red_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_red_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_red_utilities_file();
  }
  static
  {
    me = new red_utilities();
    $red_key_name_separator$ = null;
    $red_root_key_os$ = null;
    $red_root_key_application$ = null;
    $red_root_key_external$ = null;
    $red_root_key_license_keys$ = null;
    $interpretable_red_element_value_key$ = null;
    $interpretable_red_element_interpretation_key$ = null;
    $red_element_interpret_as_literal$ = null;
    $red_element_interpret_as_symbol_value$ = null;
    $str0$_ = makeString( "." );
    $str1$os = makeString( "os" );
    $str2$application = makeString( "application" );
    $str3$external = makeString( "external" );
    $str4$license_keys = makeString( "license-keys" );
    $kw5$LEAST_PRIVILEGED = makeKeyword( "LEAST-PRIVILEGED" );
    $str6$master_license_key = makeString( "master-license-key" );
    $sym7$RED_ELEMENT_STRUCT_P = makeSymbol( "RED-ELEMENT-STRUCT-P" );
    $sym8$LISTP = makeSymbol( "LISTP" );
    $sym9$STRING_ = makeSymbol( "STRING<" );
    $sym10$RED_ELEMENT_GET_KEY = makeSymbol( "RED-ELEMENT-GET-KEY" );
    $str11$value = makeString( "value" );
    $str12$interpretation = makeString( "interpretation" );
    $str13$literal = makeString( "literal" );
    $str14$symbol_value = makeString( "symbol-value" );
    $str15$CYC = makeString( "CYC" );
    $sym16$EMPTY_STRING_P = makeSymbol( "EMPTY-STRING-P" );
    $list17 = ConsesLow.list( Characters.CHAR_colon );
  }
}
/*
 * 
 * Total time: 129 ms
 * 
 */