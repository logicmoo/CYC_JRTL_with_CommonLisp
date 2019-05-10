package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_parameter_declaration
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.pph_parameter_declaration";
  public static final String myFingerPrint = "94447e5cf4ec5d4e6110478a69562e148c74bcaf802ed5ff3577eae5b461da5d";
  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 870L)
  private static SubLSymbol $pph_parameter_declarations$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 4637L)
  private static SubLSymbol $pph_parameter_declaration_keywords$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 5046L)
  private static SubLSymbol $pph_parameter_types$;
  private static final SubLSymbol $sym0$_PPH_PARAMETER_DECLARATIONS_;
  private static final SubLSymbol $sym1$PPH_PARAMETER_DECLARATIONS;
  private static final SubLSymbol $sym2$DO_PPH_PARAMETER_DECLARATIONS;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$DO_DICTIONARY;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PROPERTIES;
  private static final SubLSymbol $kw8$SETTER;
  private static final SubLSymbol $sym9$CLET;
  private static final SubLSymbol $sym10$VALIDATE_PPH_PARAMETER_DECLARATION;
  private static final SubLSymbol $sym11$ENTER_PPH_PARAMETER_DECLARATION;
  private static final SubLSymbol $sym12$PROGN;
  private static final SubLSymbol $sym13$DEFINE_PPH_PARAMETER_SETTER;
  private static final SubLSymbol $sym14$PLIST_ENTER;
  private static final SubLSymbol $sym15$PPH_PARAMETER_SETTER_NAME;
  private static final SubLSymbol $sym16$DECLARE_PPH_PARAMETER;
  private static final SubLList $list17;
  private static final SubLString $str18$Set_value_of_;
  private static final SubLString $str19$_in_PARAMS_to_VALUE_;
  private static final SubLSymbol $kw20$CHECK_TYPE;
  private static final SubLSymbol $sym21$TRUE;
  private static final SubLSymbol $sym22$DEFINE_MACRO_HELPER;
  private static final SubLList $list23;
  private static final SubLSymbol $kw24$MACRO;
  private static final SubLSymbol $sym25$CHECK_TYPE;
  private static final SubLSymbol $sym26$VALUE;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$SET_PPH_PARAMETER_VALUE;
  private static final SubLSymbol $sym29$PARAMS;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$DEFMACRO_API_PROVISIONAL;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$WITH_TEMP_VARS;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$RET;
  private static final SubLSymbol $sym38$PPH_PARAMETER_SETTER_BODY;
  private static final SubLSymbol $sym39$PARAMS_FORM;
  private static final SubLSymbol $sym40$QUOTE;
  private static final SubLString $str41$SET_;
  private static final SubLString $str42$_INTERNAL;
  private static final SubLList $list43;
  private static final SubLSymbol $kw44$ARGUMENT_TYPES;
  private static final SubLList $list45;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$KEYWORDP;
  private static final SubLString $str48$Unrecognized_property_in_declarat;
  private static final SubLString $str49$Value__S_fails_test__S_for__S;
  private static final SubLSymbol $kw50$TYPE;
  private static final SubLSymbol $kw51$CORRESPONDING_GLOBAL;
  private static final SubLSymbol $kw52$DEFAULT_VALUE_FORM;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$TUPLE;
  private static final SubLSymbol $sym55$DO_ITERATOR;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$FIRST;
  private static final SubLSymbol $sym58$NEW_PPH_API_PARAM_ITERATOR;
  private static final SubLSymbol $sym59$DO_PPH_API_PARAMS;
  private static final SubLSymbol $kw60$DOCUMENTATION;
  private static final SubLString $str61$______S_________Description_____A;

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 938L)
  public static SubLObject pph_parameter_declarations()
  {
    return $pph_parameter_declarations$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 1070L)
  public static SubLObject do_pph_parameter_declarations(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject param = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    param = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym4$DO_DICTIONARY, ConsesLow.listS( param, value, $list5 ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 1326L)
  public static SubLObject declare_pph_parameter(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject plist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    plist = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list6 );
      return NIL;
    }
    final SubLObject v_properties = $sym7$PROPERTIES;
    if( NIL != conses_high.getf( plist, $kw8$SETTER, NIL ) )
    {
      return ConsesLow.list( $sym9$CLET, ConsesLow.list( ConsesLow.list( v_properties, plist ) ), ConsesLow.list( $sym10$VALIDATE_PPH_PARAMETER_DECLARATION, name, v_properties ), ConsesLow.list(
          $sym11$ENTER_PPH_PARAMETER_DECLARATION, name, v_properties ) );
    }
    return ConsesLow.list( $sym12$PROGN, ConsesLow.list( $sym13$DEFINE_PPH_PARAMETER_SETTER, name, plist ), ConsesLow.list( $sym9$CLET, ConsesLow.list( ConsesLow.list( v_properties, plist ) ), ConsesLow.list(
        $sym14$PLIST_ENTER, v_properties, $kw8$SETTER, ConsesLow.list( $sym15$PPH_PARAMETER_SETTER_NAME, name ) ), ConsesLow.list( $sym10$VALIDATE_PPH_PARAMETER_DECLARATION, name, v_properties ), ConsesLow.list(
            $sym11$ENTER_PPH_PARAMETER_DECLARATION, name, v_properties ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 2438L)
  public static SubLObject enter_pph_parameter_declaration(final SubLObject name, final SubLObject v_properties)
  {
    return dictionary.dictionary_enter( $pph_parameter_declarations$.getGlobalValue(), name, v_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 2616L)
  public static SubLObject define_pph_parameter_setter(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    SubLObject plist_form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
    plist_form = current.first();
    current = current.rest();
    if( NIL == current )
    {
      thread.resetMultipleValues();
      final SubLObject macro_name = pph_parameter_setter_name( name );
      final SubLObject helper_name = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject doc_string = Sequences.cconcatenate( $str18$Set_value_of_, new SubLObject[] { format_nil.format_nil_s_no_copy( name ), $str19$_in_PARAMS_to_VALUE_, format_nil.$format_nil_percent$.getGlobalValue()
      } );
      final SubLObject plist = Eval.eval( plist_form );
      final SubLObject arg_types = pph_parameter_setter_arg_types( plist );
      final SubLObject check_type = conses_high.getf( plist, $kw20$CHECK_TYPE, $sym21$TRUE );
      return ConsesLow.list( $sym12$PROGN, ConsesLow.listS( $sym22$DEFINE_MACRO_HELPER, new SubLObject[] { helper_name, $list23, ConsesLow.list( $kw24$MACRO, macro_name ), doc_string, ConsesLow.list( $sym25$CHECK_TYPE,
          $sym26$VALUE, check_type ), $list27, ConsesLow.listS( $sym28$SET_PPH_PARAMETER_VALUE, $sym29$PARAMS, name, $list30 ), $list31
      } ), ConsesLow.list( $sym32$DEFMACRO_API_PROVISIONAL, macro_name, $list33, doc_string, reader.bq_cons( arg_types, $list34 ), ConsesLow.list( $sym35$WITH_TEMP_VARS, $list36, ConsesLow.list( $sym37$RET, ConsesLow
          .list( $sym38$PPH_PARAMETER_SETTER_BODY, $sym39$PARAMS_FORM, $sym29$PARAMS, $sym26$VALUE, ConsesLow.list( $sym40$QUOTE, helper_name ) ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list17 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 3517L)
  public static SubLObject set_pph_parameter_value(final SubLObject params, final SubLObject name, final SubLObject value)
  {
    dictionary.dictionary_enter( params, name, value );
    return params;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 3635L)
  public static SubLObject pph_parameter_setter_body(final SubLObject params_form, final SubLObject params, final SubLObject value, final SubLObject helper_name)
  {
    return ConsesLow.list( $sym9$CLET, ConsesLow.list( ConsesLow.list( params, params_form ) ), ConsesLow.list( helper_name, params, value ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 3836L)
  public static SubLObject pph_parameter_setter_name(final SubLObject parameter_keyword)
  {
    final SubLObject keyword_name = Symbols.symbol_name( parameter_keyword );
    final SubLObject macro_name = Packages.intern( Symbols.make_symbol( Sequences.cconcatenate( $str41$SET_, keyword_name ) ), UNPROVIDED );
    final SubLObject helper_name = Packages.intern( Symbols.make_symbol( Sequences.cconcatenate( $str41$SET_, new SubLObject[] { keyword_name, $str42$_INTERNAL
    } ) ), UNPROVIDED );
    return Values.values( macro_name, helper_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 4203L)
  public static SubLObject pph_parameter_setter_arg_types(final SubLObject plist)
  {
    SubLObject arg_types = NIL;
    final SubLObject check_type = conses_high.getf( plist, $kw20$CHECK_TYPE, UNPROVIDED );
    if( NIL != Symbols.fboundp( check_type ) )
    {
      arg_types = ConsesLow.cons( ConsesLow.list( $sym26$VALUE, check_type ), arg_types );
    }
    arg_types = ConsesLow.cons( $list43, arg_types );
    arg_types = ConsesLow.cons( $kw44$ARGUMENT_TYPES, arg_types );
    return arg_types;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 4526L)
  public static SubLObject undeclare_pph_parameter(final SubLObject name)
  {
    return dictionary.dictionary_remove( $pph_parameter_declarations$.getGlobalValue(), name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 5188L)
  public static SubLObject pph_parameter_type_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $pph_parameter_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 5281L)
  public static SubLObject validate_pph_parameter_declaration(final SubLObject name, final SubLObject plist)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.keywordp( name ) : name;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    SubLObject pred;
    for( remainder = NIL, remainder = plist; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      pred = list_utilities.alist_lookup( $pph_parameter_declaration_keywords$.getGlobalValue(), property, UNPROVIDED, UNPROVIDED );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == Symbols.fboundp( pred ) )
      {
        Errors.error( $str48$Unrecognized_property_in_declarat, property );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == Functions.funcall( pred, value ) )
      {
        Errors.error( $str49$Value__S_fails_test__S_for__S, value, pred, property );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 5709L)
  public static SubLObject get_pph_param_type(final SubLObject param)
  {
    final SubLObject plist = dictionary.dictionary_lookup_without_values( pph_parameter_declarations(), param, NIL );
    return conses_high.getf( plist, $kw50$TYPE, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 5937L)
  public static SubLObject get_pph_param_corresponding_global(final SubLObject param)
  {
    final SubLObject plist = dictionary.dictionary_lookup_without_values( pph_parameter_declarations(), param, NIL );
    return conses_high.getf( plist, $kw51$CORRESPONDING_GLOBAL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 6207L)
  public static SubLObject valid_pph_param_value_pair_p(final SubLObject param, final SubLObject value)
  {
    final SubLObject plist = dictionary.dictionary_lookup_without_values( pph_parameter_declarations(), param, UNPROVIDED );
    final SubLObject check_type = conses_high.getf( plist, $kw20$CHECK_TYPE, UNPROVIDED );
    if( NIL == plist )
    {
      return NIL;
    }
    if( NIL != Symbols.fboundp( check_type ) )
    {
      return Functions.funcall( check_type, value );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 6535L)
  public static SubLObject pph_default_for_param(final SubLObject param)
  {
    final SubLObject plist = dictionary.dictionary_lookup_without_values( pph_parameter_declarations(), param, NIL );
    final SubLObject corresponding_global = conses_high.getf( plist, $kw51$CORRESPONDING_GLOBAL, NIL );
    final SubLObject default_value_form = conses_high.getf( plist, $kw52$DEFAULT_VALUE_FORM, NIL );
    return ( NIL != corresponding_global ) ? Symbols.symbol_value( corresponding_global ) : Eval.eval( default_value_form );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 6958L)
  public static SubLObject do_pph_api_params(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list53 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject param = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list53 );
    param = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject tuple = $sym54$TUPLE;
      return ConsesLow.list( $sym55$DO_ITERATOR, reader.bq_cons( tuple, $list56 ), ConsesLow.listS( $sym9$CLET, ConsesLow.list( ConsesLow.list( param, ConsesLow.list( $sym57$FIRST, tuple ) ) ), ConsesLow.append( body,
          NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list53 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 7161L)
  public static SubLObject new_pph_api_param_iterator()
  {
    return dictionary.new_dictionary_iterator( pph_parameter_declarations() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declaration.lisp", position = 7306L)
  public static SubLObject print_wiki_documentation_for_pph_api_param(final SubLObject param)
  {
    final SubLObject plist = dictionary.dictionary_lookup_without_values( pph_parameter_declarations(), param, UNPROVIDED );
    final SubLObject setter = conses_high.getf( plist, $kw8$SETTER, UNPROVIDED );
    final SubLObject doc_string = conses_high.getf( plist, $kw60$DOCUMENTATION, UNPROVIDED );
    final SubLObject check_type = conses_high.getf( plist, $kw20$CHECK_TYPE, UNPROVIDED );
    PrintLow.format( T, $str61$______S_________Description_____A, new SubLObject[] { param, doc_string, Strings.string_downcase( Symbols.symbol_name( setter ), UNPROVIDED, UNPROVIDED ), pph_default_for_param( param ),
      check_type
    } );
    return NIL;
  }

  public static SubLObject declare_pph_parameter_declaration_file()
  {
    SubLFiles.declareFunction( me, "pph_parameter_declarations", "PPH-PARAMETER-DECLARATIONS", 0, 0, false );
    SubLFiles.declareMacro( me, "do_pph_parameter_declarations", "DO-PPH-PARAMETER-DECLARATIONS" );
    SubLFiles.declareMacro( me, "declare_pph_parameter", "DECLARE-PPH-PARAMETER" );
    SubLFiles.declareFunction( me, "enter_pph_parameter_declaration", "ENTER-PPH-PARAMETER-DECLARATION", 2, 0, false );
    SubLFiles.declareMacro( me, "define_pph_parameter_setter", "DEFINE-PPH-PARAMETER-SETTER" );
    SubLFiles.declareFunction( me, "set_pph_parameter_value", "SET-PPH-PARAMETER-VALUE", 3, 0, false );
    SubLFiles.declareFunction( me, "pph_parameter_setter_body", "PPH-PARAMETER-SETTER-BODY", 4, 0, false );
    SubLFiles.declareFunction( me, "pph_parameter_setter_name", "PPH-PARAMETER-SETTER-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_parameter_setter_arg_types", "PPH-PARAMETER-SETTER-ARG-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "undeclare_pph_parameter", "UNDECLARE-PPH-PARAMETER", 1, 0, false );
    SubLFiles.declareFunction( me, "pph_parameter_type_p", "PPH-PARAMETER-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "validate_pph_parameter_declaration", "VALIDATE-PPH-PARAMETER-DECLARATION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_pph_param_type", "GET-PPH-PARAM-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_pph_param_corresponding_global", "GET-PPH-PARAM-CORRESPONDING-GLOBAL", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_pph_param_value_pair_p", "VALID-PPH-PARAM-VALUE-PAIR-P", 2, 0, false );
    SubLFiles.declareFunction( me, "pph_default_for_param", "PPH-DEFAULT-FOR-PARAM", 1, 0, false );
    SubLFiles.declareMacro( me, "do_pph_api_params", "DO-PPH-API-PARAMS" );
    SubLFiles.declareFunction( me, "new_pph_api_param_iterator", "NEW-PPH-API-PARAM-ITERATOR", 0, 0, false );
    SubLFiles.declareFunction( me, "print_wiki_documentation_for_pph_api_param", "PRINT-WIKI-DOCUMENTATION-FOR-PPH-API-PARAM", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_pph_parameter_declaration_file()
  {
    $pph_parameter_declarations$ = SubLFiles.deflexical( "*PPH-PARAMETER-DECLARATIONS*", maybeDefault( $sym0$_PPH_PARAMETER_DECLARATIONS_, $pph_parameter_declarations$, () -> ( dictionary.new_dictionary( UNPROVIDED,
        UNPROVIDED ) ) ) );
    $pph_parameter_declaration_keywords$ = SubLFiles.deflexical( "*PPH-PARAMETER-DECLARATION-KEYWORDS*", $list45 );
    $pph_parameter_types$ = SubLFiles.deflexical( "*PPH-PARAMETER-TYPES*", $list46 );
    return NIL;
  }

  public static SubLObject setup_pph_parameter_declaration_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_PPH_PARAMETER_DECLARATIONS_ );
    access_macros.register_macro_helper( $sym1$PPH_PARAMETER_DECLARATIONS, $sym2$DO_PPH_PARAMETER_DECLARATIONS );
    access_macros.register_macro_helper( $sym11$ENTER_PPH_PARAMETER_DECLARATION, $sym16$DECLARE_PPH_PARAMETER );
    access_macros.register_macro_helper( $sym13$DEFINE_PPH_PARAMETER_SETTER, $sym16$DECLARE_PPH_PARAMETER );
    access_macros.register_macro_helper( $sym38$PPH_PARAMETER_SETTER_BODY, $sym13$DEFINE_PPH_PARAMETER_SETTER );
    access_macros.register_macro_helper( $sym15$PPH_PARAMETER_SETTER_NAME, $sym13$DEFINE_PPH_PARAMETER_SETTER );
    access_macros.register_macro_helper( $sym10$VALIDATE_PPH_PARAMETER_DECLARATION, $sym16$DECLARE_PPH_PARAMETER );
    access_macros.register_macro_helper( $sym58$NEW_PPH_API_PARAM_ITERATOR, $sym59$DO_PPH_API_PARAMS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_pph_parameter_declaration_file();
  }

  @Override
  public void initializeVariables()
  {
    init_pph_parameter_declaration_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_pph_parameter_declaration_file();
  }
  static
  {
    me = new pph_parameter_declaration();
    $pph_parameter_declarations$ = null;
    $pph_parameter_declaration_keywords$ = null;
    $pph_parameter_types$ = null;
    $sym0$_PPH_PARAMETER_DECLARATIONS_ = makeSymbol( "*PPH-PARAMETER-DECLARATIONS*" );
    $sym1$PPH_PARAMETER_DECLARATIONS = makeSymbol( "PPH-PARAMETER-DECLARATIONS" );
    $sym2$DO_PPH_PARAMETER_DECLARATIONS = makeSymbol( "DO-PPH-PARAMETER-DECLARATIONS" );
    $list3 = ConsesLow.list( ConsesLow.list( makeSymbol( "PARAM" ), makeSymbol( "VALUE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym4$DO_DICTIONARY = makeSymbol( "DO-DICTIONARY" );
    $list5 = ConsesLow.list( ConsesLow.list( makeSymbol( "PPH-PARAMETER-DECLARATIONS" ) ) );
    $list6 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "PLIST" ) );
    $sym7$PROPERTIES = makeUninternedSymbol( "PROPERTIES" );
    $kw8$SETTER = makeKeyword( "SETTER" );
    $sym9$CLET = makeSymbol( "CLET" );
    $sym10$VALIDATE_PPH_PARAMETER_DECLARATION = makeSymbol( "VALIDATE-PPH-PARAMETER-DECLARATION" );
    $sym11$ENTER_PPH_PARAMETER_DECLARATION = makeSymbol( "ENTER-PPH-PARAMETER-DECLARATION" );
    $sym12$PROGN = makeSymbol( "PROGN" );
    $sym13$DEFINE_PPH_PARAMETER_SETTER = makeSymbol( "DEFINE-PPH-PARAMETER-SETTER" );
    $sym14$PLIST_ENTER = makeSymbol( "PLIST-ENTER" );
    $sym15$PPH_PARAMETER_SETTER_NAME = makeSymbol( "PPH-PARAMETER-SETTER-NAME" );
    $sym16$DECLARE_PPH_PARAMETER = makeSymbol( "DECLARE-PPH-PARAMETER" );
    $list17 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "PLIST-FORM" ) );
    $str18$Set_value_of_ = makeString( "Set value of " );
    $str19$_in_PARAMS_to_VALUE_ = makeString( " in PARAMS to VALUE." );
    $kw20$CHECK_TYPE = makeKeyword( "CHECK-TYPE" );
    $sym21$TRUE = makeSymbol( "TRUE" );
    $sym22$DEFINE_MACRO_HELPER = makeSymbol( "DEFINE-MACRO-HELPER" );
    $list23 = ConsesLow.list( makeSymbol( "PARAMS" ), makeSymbol( "VALUE" ) );
    $kw24$MACRO = makeKeyword( "MACRO" );
    $sym25$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $sym26$VALUE = makeSymbol( "VALUE" );
    $list27 = ConsesLow.list( makeSymbol( "CHECK-TYPE" ), makeSymbol( "PARAMS" ), makeSymbol( "PPH-MUTABLE-API-PARAMS-P" ) );
    $sym28$SET_PPH_PARAMETER_VALUE = makeSymbol( "SET-PPH-PARAMETER-VALUE" );
    $sym29$PARAMS = makeSymbol( "PARAMS" );
    $list30 = ConsesLow.list( makeSymbol( "VALUE" ) );
    $list31 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), makeSymbol( "PARAMS" ) ) );
    $sym32$DEFMACRO_API_PROVISIONAL = makeSymbol( "DEFMACRO-API-PROVISIONAL" );
    $list33 = ConsesLow.list( makeSymbol( "PARAMS-FORM" ), makeSymbol( "VALUE" ) );
    $list34 = ConsesLow.list( ConsesLow.list( makeKeyword( "RETURN-TYPES" ), makeSymbol( "PPH-API-PARAM-LIST-P" ) ) );
    $sym35$WITH_TEMP_VARS = makeSymbol( "WITH-TEMP-VARS" );
    $list36 = ConsesLow.list( makeSymbol( "PARAMS" ) );
    $sym37$RET = makeSymbol( "RET" );
    $sym38$PPH_PARAMETER_SETTER_BODY = makeSymbol( "PPH-PARAMETER-SETTER-BODY" );
    $sym39$PARAMS_FORM = makeSymbol( "PARAMS-FORM" );
    $sym40$QUOTE = makeSymbol( "QUOTE" );
    $str41$SET_ = makeString( "SET-" );
    $str42$_INTERNAL = makeString( "-INTERNAL" );
    $list43 = ConsesLow.list( makeSymbol( "PARAMS" ), makeSymbol( "PPH-MUTABLE-API-PARAMS-P" ) );
    $kw44$ARGUMENT_TYPES = makeKeyword( "ARGUMENT-TYPES" );
    $list45 = ConsesLow.list( ConsesLow.cons( makeKeyword( "CORRESPONDING-GLOBAL" ), makeSymbol( "SYMBOLP" ) ), ConsesLow.cons( makeKeyword( "SETTER" ), makeSymbol( "SYMBOLP" ) ), ConsesLow.cons( makeKeyword( "TYPE" ),
        makeSymbol( "PPH-PARAMETER-TYPE-P" ) ), ConsesLow.cons( makeKeyword( "CHECK-TYPE" ), makeSymbol( "SYMBOLP" ) ), ConsesLow.cons( makeKeyword( "DOCUMENTATION" ), makeSymbol( "STRINGP" ) ), ConsesLow.cons(
            makeKeyword( "DEFAULT-VALUE-FORM" ), makeSymbol( "TRUE" ) ) );
    $list46 = ConsesLow.list( makeKeyword( "TOP-LEVEL" ), makeKeyword( "PPH-GOODNESS" ), makeKeyword( "PPH-FORMAT" ), makeKeyword( "PPH-FORMALITY" ), makeKeyword( "PPH-PRECISION" ), makeKeyword( "PPH-MISC" ) );
    $sym47$KEYWORDP = makeSymbol( "KEYWORDP" );
    $str48$Unrecognized_property_in_declarat = makeString( "Unrecognized property in declaration: ~S" );
    $str49$Value__S_fails_test__S_for__S = makeString( "Value ~S fails test ~S for ~S" );
    $kw50$TYPE = makeKeyword( "TYPE" );
    $kw51$CORRESPONDING_GLOBAL = makeKeyword( "CORRESPONDING-GLOBAL" );
    $kw52$DEFAULT_VALUE_FORM = makeKeyword( "DEFAULT-VALUE-FORM" );
    $list53 = ConsesLow.list( ConsesLow.list( makeSymbol( "PARAM" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym54$TUPLE = makeUninternedSymbol( "TUPLE" );
    $sym55$DO_ITERATOR = makeSymbol( "DO-ITERATOR" );
    $list56 = ConsesLow.list( ConsesLow.list( makeSymbol( "NEW-PPH-API-PARAM-ITERATOR" ) ) );
    $sym57$FIRST = makeSymbol( "FIRST" );
    $sym58$NEW_PPH_API_PARAM_ITERATOR = makeSymbol( "NEW-PPH-API-PARAM-ITERATOR" );
    $sym59$DO_PPH_API_PARAMS = makeSymbol( "DO-PPH-API-PARAMS" );
    $kw60$DOCUMENTATION = makeKeyword( "DOCUMENTATION" );
    $str61$______S_________Description_____A = makeString( "~%===~S===\n* '''Description''' ~A\n* '''Setter Macro''' <tt>~A</tt>\n* '''Default Value''' <tt>~S</tt>\n* '''Values must pass ~A.~%" );
  }
}
/*
 * 
 * Total time: 185 ms
 * 
 */