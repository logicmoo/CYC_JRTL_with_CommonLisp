package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class c_name_translation
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.c_name_translation";
  public static final String myFingerPrint = "6c995291f6918fef663112a5980012678570328a91ebe0ccf6ea39bd73a01cbb";
  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 1114L)
  private static SubLSymbol $c_backend_defined_function_name_data$;
  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 23589L)
  private static SubLSymbol $c_backend_undefined_function_name_data$;
  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 43809L)
  private static SubLSymbol $c_backend_function_arity_version_table$;
  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 44578L)
  private static SubLSymbol $c_backend_undefined_arity_function_name_data$;
  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 46392L)
  private static SubLSymbol $c_backend_function_boolean_version_table$;
  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 48923L)
  private static SubLSymbol $c_backend_function_boolean_hash$;
  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 49559L)
  private static SubLSymbol $c_backend_undefined_boolean_function_name_data$;
  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 53188L)
  private static SubLSymbol $c_backend_function_name_table$;
  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 54467L)
  private static SubLSymbol $c_backend_function_arglist_table$;
  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 55871L)
  private static SubLSymbol $c_backend_predefined_constant_table$;
  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 59331L)
  private static SubLSymbol $c_backend_defined_global_name_data$;
  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 63118L)
  private static SubLSymbol $c_backend_undefined_global_name_data$;
  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 64742L)
  private static SubLSymbol $c_backend_global_name_table$;
  private static final SubLObject $list0;
  private static final SubLObject $list1;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$_DTB;
  private static final SubLSymbol $sym6$_BTD;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$UNINITIALIZED;
  private static final SubLList $list9;
  private static final SubLObject $list10;
  private static final SubLList $list11;
  private static final SubLSymbol $kw12$UNSPECIFIED;
  private static final SubLInteger $int13$500;
  private static final SubLList $list14;
  private static final SubLObject $list15;
  private static final SubLList $list16;
  private static final SubLList $list17;

  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 23407L)
  public static SubLObject c_backend_defined_function_p(final SubLObject function)
  {
    SubLObject cdolist_list_var = $c_backend_defined_function_name_data$.getGlobalValue();
    SubLObject datum = NIL;
    datum = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( function.eql( datum.first() ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      datum = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 43188L)
  public static SubLObject c_backend_function_call_arity_transform(final SubLObject function_call_form)
  {
    if( function_call_form.isCons() )
    {
      SubLObject operator = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( function_call_form, function_call_form, $list2 );
      operator = function_call_form.first();
      final SubLObject args;
      final SubLObject current = args = function_call_form.rest();
      final SubLObject call_arity = Sequences.length( args );
      final SubLObject call_arity_operator = c_backend_function_call_arity_lookup( operator, call_arity );
      if( NIL != call_arity_operator )
      {
        return reader.bq_cons( call_arity_operator, ConsesLow.append( args, NIL ) );
      }
    }
    return function_call_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 45384L)
  public static SubLObject c_backend_function_call_arity_lookup(final SubLObject operator, final SubLObject call_arity)
  {
    final SubLObject operator_arity_versions = list_utilities.alist_lookup_without_values( $c_backend_function_arity_version_table$.getGlobalValue(), operator, Symbols.symbol_function( EQ ), UNPROVIDED );
    if( NIL != operator_arity_versions )
    {
      return list_utilities.alist_lookup_without_values( operator_arity_versions, call_arity, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 45718L)
  public static SubLObject c_backend_simplify_Xdtb_transform(final SubLObject dtb_form)
  {
    if( dtb_form.isCons() && $sym5$_DTB == dtb_form.first() )
    {
      final SubLObject subform = conses_high.second( dtb_form );
      if( subform.isCons() )
      {
        SubLObject current;
        final SubLObject datum = current = subform;
        SubLObject operator = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
        operator = current.first();
        final SubLObject args;
        current = ( args = current.rest() );
        if( operator == $sym6$_BTD )
        {
          return args.first();
        }
        final SubLObject boolean_version = c_backend_boolean_function_call_lookup( operator );
        if( NIL != boolean_version )
        {
          return reader.bq_cons( boolean_version, ConsesLow.append( args, NIL ) );
        }
      }
    }
    return dtb_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 49002L)
  public static SubLObject initialize_c_backend_function_boolean_hash()
  {
    final SubLObject table = Hashtables.make_hash_table( Sequences.length( $c_backend_function_boolean_version_table$.getGlobalValue() ), Symbols.symbol_function( EQ ), UNPROVIDED );
    SubLObject cdolist_list_var = $c_backend_function_boolean_version_table$.getGlobalValue();
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject function = NIL;
      SubLObject boolean_version = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
      function = current.first();
      current = ( boolean_version = current.rest() );
      Hashtables.sethash( function, table, boolean_version );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    $c_backend_function_boolean_hash$.setGlobalValue( table );
    return table;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 49411L)
  public static SubLObject c_backend_boolean_function_call_lookup(final SubLObject operator)
  {
    return Hashtables.gethash_without_values( operator, $c_backend_function_boolean_hash$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 53462L)
  public static SubLObject c_backend_function_name_lookup(final SubLObject function)
  {
    return Hashtables.gethash_without_values( function, $c_backend_function_name_table$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 53599L)
  public static SubLObject c_backend_predefined_function_p(final SubLObject function)
  {
    return list_utilities.sublisp_boolean( Hashtables.gethash_without_values( function, $c_backend_function_name_table$.getGlobalValue(), NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 53816L)
  public static SubLObject initialize_c_backend_function_name_table()
  {
    final SubLObject data = ConsesLow.nconc( new SubLObject[] { conses_high.copy_list( $c_backend_defined_function_name_data$.getGlobalValue() ), conses_high.copy_list( $c_backend_undefined_function_name_data$
        .getGlobalValue() ), conses_high.copy_list( $c_backend_undefined_arity_function_name_data$.getGlobalValue() ), conses_high.copy_list( $c_backend_undefined_boolean_function_name_data$.getGlobalValue() )
    } );
    final SubLObject table = Hashtables.make_hash_table( Sequences.length( data ), Symbols.symbol_function( EQ ), UNPROVIDED );
    SubLObject cdolist_list_var = data;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = item;
      SubLObject symbol = NIL;
      SubLObject c_backend_name = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
      symbol = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
      c_backend_name = current.first();
      current = current.rest();
      final SubLObject arglist = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list11 );
      current = current.rest();
      if( NIL == current )
      {
        Hashtables.sethash( symbol, table, c_backend_name );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list11 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    $c_backend_function_name_table$.setGlobalValue( table );
    return table;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 54747L)
  public static SubLObject c_backend_function_arglist_lookup(final SubLObject function)
  {
    return Hashtables.gethash_without_values( function, $c_backend_function_arglist_table$.getGlobalValue(), $kw12$UNSPECIFIED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 54899L)
  public static SubLObject initialize_c_backend_function_arglist_table()
  {
    final SubLObject table = Hashtables.make_hash_table( $int13$500, Symbols.symbol_function( EQ ), UNPROVIDED );
    SubLObject cdolist_list_var = $c_backend_defined_function_name_data$.getGlobalValue();
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = item;
      SubLObject symbol = NIL;
      SubLObject c_backend_name = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
      symbol = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list14 );
      c_backend_name = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != subl_promotions.function_symbol_p( symbol ) )
        {
          final SubLObject arglist = subl_promotions.function_symbol_arglist( symbol );
          Hashtables.sethash( symbol, table, arglist );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list14 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    SubLObject cdolist_list_var2;
    final SubLObject data = cdolist_list_var2 = ConsesLow.nconc( conses_high.copy_list( $c_backend_undefined_function_name_data$.getGlobalValue() ), conses_high.copy_list( $c_backend_undefined_arity_function_name_data$
        .getGlobalValue() ), conses_high.copy_list( $c_backend_undefined_boolean_function_name_data$.getGlobalValue() ) );
    SubLObject item2 = NIL;
    item2 = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      SubLObject current2;
      final SubLObject datum2 = current2 = item2;
      SubLObject symbol2 = NIL;
      SubLObject c_backend_name2 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list11 );
      symbol2 = current2.first();
      current2 = current2.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list11 );
      c_backend_name2 = current2.first();
      current2 = current2.rest();
      final SubLObject arglist2 = current2.isCons() ? current2.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current2, datum2, $list11 );
      current2 = current2.rest();
      if( NIL == current2 )
      {
        Hashtables.sethash( symbol2, table, arglist2 );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum2, $list11 );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      item2 = cdolist_list_var2.first();
    }
    $c_backend_function_arglist_table$.setGlobalValue( table );
    return table;
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 59174L)
  public static SubLObject c_backend_predefined_constant_name(final SubLObject constant)
  {
    return list_utilities.alist_lookup_without_values( $c_backend_predefined_constant_table$.getGlobalValue(), constant, Symbols.symbol_function( EQL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 64588L)
  public static SubLObject c_backend_undefined_variable_binding_type_lookup(final SubLObject variable)
  {
    return conses_high.third( conses_high.assoc( variable, $c_backend_undefined_global_name_data$.getGlobalValue(), Symbols.symbol_function( EQ ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 65012L)
  public static SubLObject c_backend_global_name_lookup(final SubLObject global)
  {
    return Hashtables.gethash_without_values( global, $c_backend_global_name_table$.getGlobalValue(), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 65141L)
  public static SubLObject c_backend_predefined_global_p(final SubLObject global)
  {
    return list_utilities.sublisp_boolean( Hashtables.gethash_without_values( global, $c_backend_global_name_table$.getGlobalValue(), NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/c-name-translation.lisp", position = 65346L)
  public static SubLObject initialize_c_backend_global_name_table()
  {
    final SubLObject data = ConsesLow.nconc( conses_high.copy_list( $c_backend_defined_global_name_data$.getGlobalValue() ), conses_high.copy_list( $c_backend_undefined_global_name_data$.getGlobalValue() ) );
    final SubLObject table = Hashtables.make_hash_table( Sequences.length( data ), Symbols.symbol_function( EQ ), UNPROVIDED );
    SubLObject cdolist_list_var = data;
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = item;
      SubLObject symbol = NIL;
      SubLObject c_backend_name = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
      symbol = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
      c_backend_name = current.first();
      current = current.rest();
      final SubLObject arglist = current.isCons() ? current.first() : NIL;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list11 );
      current = current.rest();
      if( NIL == current )
      {
        Hashtables.sethash( symbol, table, c_backend_name );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list11 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    $c_backend_global_name_table$.setGlobalValue( table );
    return table;
  }

  public static SubLObject declare_c_name_translation_file()
  {
    SubLFiles.declareFunction( me, "c_backend_defined_function_p", "C-BACKEND-DEFINED-FUNCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_function_call_arity_transform", "C-BACKEND-FUNCTION-CALL-ARITY-TRANSFORM", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_function_call_arity_lookup", "C-BACKEND-FUNCTION-CALL-ARITY-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "c_backend_simplify_Xdtb_transform", "C-BACKEND-SIMPLIFY-%DTB-TRANSFORM", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_c_backend_function_boolean_hash", "INITIALIZE-C-BACKEND-FUNCTION-BOOLEAN-HASH", 0, 0, false );
    SubLFiles.declareFunction( me, "c_backend_boolean_function_call_lookup", "C-BACKEND-BOOLEAN-FUNCTION-CALL-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_function_name_lookup", "C-BACKEND-FUNCTION-NAME-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_predefined_function_p", "C-BACKEND-PREDEFINED-FUNCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_c_backend_function_name_table", "INITIALIZE-C-BACKEND-FUNCTION-NAME-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "c_backend_function_arglist_lookup", "C-BACKEND-FUNCTION-ARGLIST-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_c_backend_function_arglist_table", "INITIALIZE-C-BACKEND-FUNCTION-ARGLIST-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "c_backend_predefined_constant_name", "C-BACKEND-PREDEFINED-CONSTANT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_undefined_variable_binding_type_lookup", "C-BACKEND-UNDEFINED-VARIABLE-BINDING-TYPE-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_global_name_lookup", "C-BACKEND-GLOBAL-NAME-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "c_backend_predefined_global_p", "C-BACKEND-PREDEFINED-GLOBAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_c_backend_global_name_table", "INITIALIZE-C-BACKEND-GLOBAL-NAME-TABLE", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_c_name_translation_file()
  {
    $c_backend_defined_function_name_data$ = SubLFiles.deflexical( "*C-BACKEND-DEFINED-FUNCTION-NAME-DATA*", $list0 );
    $c_backend_undefined_function_name_data$ = SubLFiles.deflexical( "*C-BACKEND-UNDEFINED-FUNCTION-NAME-DATA*", $list1 );
    $c_backend_function_arity_version_table$ = SubLFiles.deflexical( "*C-BACKEND-FUNCTION-ARITY-VERSION-TABLE*", $list3 );
    $c_backend_undefined_arity_function_name_data$ = SubLFiles.deflexical( "*C-BACKEND-UNDEFINED-ARITY-FUNCTION-NAME-DATA*", $list4 );
    $c_backend_function_boolean_version_table$ = SubLFiles.deflexical( "*C-BACKEND-FUNCTION-BOOLEAN-VERSION-TABLE*", $list7 );
    $c_backend_function_boolean_hash$ = SubLFiles.deflexical( "*C-BACKEND-FUNCTION-BOOLEAN-HASH*", $kw8$UNINITIALIZED );
    $c_backend_undefined_boolean_function_name_data$ = SubLFiles.deflexical( "*C-BACKEND-UNDEFINED-BOOLEAN-FUNCTION-NAME-DATA*", $list10 );
    $c_backend_function_name_table$ = SubLFiles.deflexical( "*C-BACKEND-FUNCTION-NAME-TABLE*", $kw8$UNINITIALIZED );
    $c_backend_function_arglist_table$ = SubLFiles.deflexical( "*C-BACKEND-FUNCTION-ARGLIST-TABLE*", $kw8$UNINITIALIZED );
    $c_backend_predefined_constant_table$ = SubLFiles.deflexical( "*C-BACKEND-PREDEFINED-CONSTANT-TABLE*", $list15 );
    $c_backend_defined_global_name_data$ = SubLFiles.deflexical( "*C-BACKEND-DEFINED-GLOBAL-NAME-DATA*", $list16 );
    $c_backend_undefined_global_name_data$ = SubLFiles.deflexical( "*C-BACKEND-UNDEFINED-GLOBAL-NAME-DATA*", $list17 );
    $c_backend_global_name_table$ = SubLFiles.deflexical( "*C-BACKEND-GLOBAL-NAME-TABLE*", $kw8$UNINITIALIZED );
    return NIL;
  }

  public static SubLObject setup_c_name_translation_file()
  {
    initialize_c_backend_function_boolean_hash();
    initialize_c_backend_function_name_table();
    initialize_c_backend_function_arglist_table();
    initialize_c_backend_global_name_table();
    return NIL;
  }

  private static SubLObject _constant_0_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "*" ), makeString( "mult" ) ), ConsesLow.list( makeSymbol( "+" ), makeString( "add" ) ), ConsesLow.list( makeSymbol( "-" ), makeString( "sub" ) ),
      ConsesLow.list( makeSymbol( "/" ), makeString( "divide" ) ), ConsesLow.list( makeSymbol( "/=" ), makeString( "dp_numNE" ) ), ConsesLow.list( makeSymbol( "<" ), makeString( "dp_numL" ) ), ConsesLow.list( makeSymbol(
          "<=" ), makeString( "dp_numLE" ) ), ConsesLow.list( makeSymbol( "=" ), makeString( "dp_numE" ) ), ConsesLow.list( makeSymbol( ">" ), makeString( "dp_numG" ) ), ConsesLow.list( makeSymbol( ">=" ), makeString(
              "dp_numGE" ) ), ConsesLow.list( makeSymbol( "ABS" ), makeString( "sublisp_abs" ) ), ConsesLow.list( makeSymbol( "ACONS" ), makeString( "acons" ) ), ConsesLow.list( makeSymbol( "ACOS" ), makeString(
                  "sublisp_acos" ) ), ConsesLow.list( makeSymbol( "ADJOIN" ), makeString( "adjoin" ) ), ConsesLow.list( makeSymbol( "ALERT-USER" ), makeString( "alert_user" ) ), ConsesLow.list( makeSymbol(
                      "ALL-PROCESSES" ), makeString( "all_processes" ) ), ConsesLow.list( makeSymbol( "ALPHA-CHAR-P" ), makeString( "dp_alpha_char_p" ) ), ConsesLow.list( makeSymbol( "ALPHANUMERICP" ), makeString(
                          "dp_alphanumericp" ) ), ConsesLow.list( makeSymbol( "APPEND" ), makeString( "append" ) ), ConsesLow.list( makeSymbol( "APPLY" ), makeString( "apply" ) ), ConsesLow.list( makeSymbol( "APROPOS" ),
                              makeString( "apropos" ) ), ConsesLow.list( makeSymbol( "AREF" ), makeString( "aref" ) ), ConsesLow.list( makeSymbol( "ASH" ), makeString( "ash" ) ), ConsesLow.list( makeSymbol( "ASIN" ),
                                  makeString( "sublisp_asin" ) ), ConsesLow.list( makeSymbol( "ASSEMBLE-FIXNUMS-TO-GUID" ), makeString( "assemble_fixnums_to_guid" ) ), ConsesLow.list( makeSymbol(
                                      "ASSEMBLE-FIXNUMS-TO-INTEGER" ), makeString( "assemble_fixnums_to_integer" ) ), ConsesLow.list( makeSymbol( "ASSOC" ), makeString( "assoc" ) ), ConsesLow.list( makeSymbol(
                                          "ASSOC-IF" ), makeString( "assoc_if" ) ), ConsesLow.list( makeSymbol( "ATAN" ), makeString( "sublisp_atan" ) ), ConsesLow.list( makeSymbol( "ATOM" ), makeString( "dp_atom" ) ),
      ConsesLow.list( makeSymbol( "BOOLE" ), makeString( "boole" ) ), ConsesLow.list( makeSymbol( "BOTH-CASE-P" ), makeString( "dp_both_case_p" ) ), ConsesLow.list( makeSymbol( "BOUNDP" ), makeString( "dp_boundp" ) ),
      ConsesLow.list( makeSymbol( "BREAK" ), makeString( "sublisp_break" ) ), ConsesLow.list( makeSymbol( "BROADCAST-STREAM-STREAMS" ), makeString( "broadcast_stream_streams" ) ), ConsesLow.list( makeSymbol( "BUTLAST" ),
          makeString( "butlast" ) ), ConsesLow.list( makeSymbol( "BYTE" ), makeString( "f_byte" ) ), ConsesLow.list( makeSymbol( "CAAR" ), makeString( "caar" ) ), ConsesLow.list( makeSymbol( "CADR" ), makeString(
              "cadr" ) ), ConsesLow.list( makeSymbol( "CAR" ), makeString( "car" ) ), ConsesLow.list( makeSymbol( "CCONCATENATE" ), makeString( "cconcatenate" ) ), ConsesLow.list( makeSymbol( "CDAR" ), makeString(
                  "cdar" ) ), ConsesLow.list( makeSymbol( "CDDR" ), makeString( "cddr" ) ), ConsesLow.list( makeSymbol( "CDR" ), makeString( "cdr" ) ), ConsesLow.list( makeSymbol( "CEILING" ), makeString(
                      "sublisp_ceiling" ) ), ConsesLow.list( makeSymbol( "CERROR" ), makeString( "sublisp_cerror" ) ), ConsesLow.list( makeSymbol( "CHAR" ), makeString( "sublisp_char" ) ), ConsesLow.list( makeSymbol(
                          "CHAR-CODE" ), makeString( "char_code" ) ), ConsesLow.list( makeSymbol( "CHAR-DOWNCASE" ), makeString( "char_downcase" ) ), ConsesLow.list( makeSymbol( "CHAR-EQUAL" ), makeString(
                              "dp_char_equal" ) ), ConsesLow.list( makeSymbol( "CHAR-GREATERP" ), makeString( "dp_char_greaterp" ) ), ConsesLow.list( makeSymbol( "CHAR-LESSP" ), makeString( "dp_char_lessp" ) ), ConsesLow
                                  .list( makeSymbol( "CHAR-NOT-EQUAL" ), makeString( "dp_char_not_equal" ) ), ConsesLow.list( makeSymbol( "CHAR-NOT-GREATERP" ), makeString( "dp_char_not_greaterp" ) ), ConsesLow.list(
                                      makeSymbol( "CHAR-NOT-LESSP" ), makeString( "dp_char_not_lessp" ) ), ConsesLow.list( makeSymbol( "CHAR-UPCASE" ), makeString( "char_upcase" ) ), ConsesLow.list( makeSymbol(
                                          "CHAR/=" ), makeString( "dp_charNE" ) ), ConsesLow.list( makeSymbol( "CHAR<" ), makeString( "dp_charL" ) ), ConsesLow.list( makeSymbol( "CHAR<=" ), makeString( "dp_charLE" ) ),
      ConsesLow.list( makeSymbol( "CHAR=" ), makeString( "dp_charE" ) ), ConsesLow.list( makeSymbol( "CHAR>" ), makeString( "dp_charG" ) ), ConsesLow.list( makeSymbol( "CHAR>=" ), makeString( "dp_charGE" ) ), ConsesLow
          .list( makeSymbol( "CHARACTERP" ), makeString( "dp_characterp" ) ), ConsesLow.list( makeSymbol( "CIRCULAR-LIST-P" ), makeString( "dp_circular_list_p" ) ), ConsesLow.list( makeSymbol( "CLEAR-INPUT" ),
              makeString( "clear_input" ) ), ConsesLow.list( makeSymbol( "CLEAR-OUTPUT" ), makeString( "clear_output" ) ), ConsesLow.list( makeSymbol( "CLOSE" ), makeString( "sublisp_close" ) ), ConsesLow.list(
                  makeSymbol( "CLRHASH" ), makeString( "clrhash" ) ), ConsesLow.list( makeSymbol( "CMERGE" ), makeString( "cmerge" ) ), ConsesLow.list( makeSymbol( "CODE-CHAR" ), makeString( "code_char" ) ), ConsesLow
                      .list( makeSymbol( "CONCATENATED-STREAM-STREAMS" ), makeString( "concatenated_stream_streams" ) ), ConsesLow.list( makeSymbol( "CONS" ), makeString( "cons" ) ), ConsesLow.list( makeSymbol(
                          "CONSP" ), makeString( "dp_consp" ) ), ConsesLow.list( makeSymbol( "CONSTANTP" ), makeString( "dp_constantp" ) ), ConsesLow.list( makeSymbol( "CONSTRUCT-FILENAME" ), makeString(
                              "construct_filename" ) ), ConsesLow.list( makeSymbol( "COPY-ALIST" ), makeString( "copy_alist" ) ), ConsesLow.list( makeSymbol( "COPY-LIST" ), makeString( "copy_list" ) ), ConsesLow.list(
                                  makeSymbol( "COPY-READTABLE" ), makeString( "copy_readtable" ) ), ConsesLow.list( makeSymbol( "COPY-SEQ" ), makeString( "copy_seq" ) ), ConsesLow.list( makeSymbol( "COPY-TREE" ),
                                      makeString( "copy_tree" ) ), ConsesLow.list( makeSymbol( "COS" ), makeString( "sublisp_cos" ) ), ConsesLow.list( makeSymbol( "COUNT" ), makeString( "count" ) ), ConsesLow.list(
                                          makeSymbol( "COUNT-IF" ), makeString( "count_if" ) ), ConsesLow.list( makeSymbol( "CRACK-DATE-RELATIVE-GUID" ), makeString( "crack_date_relative_guid" ) ), ConsesLow.list(
                                              makeSymbol( "CREDUCE" ), makeString( "creduce" ) ), ConsesLow.list( makeSymbol( "CURRENT-PROCESS" ), makeString( "current_process" ) ), ConsesLow.list( makeSymbol(
                                                  "DATE-RELATIVE-GUID-P" ), makeString( "date_relative_guid_p" ) ), ConsesLow.list( makeSymbol( "DEBUG" ), makeString( "debug" ) ), ConsesLow.list( makeSymbol(
                                                      "DEBUG-PROCESS" ), makeString( "debug_process" ) ), ConsesLow.list( makeSymbol( "DECODE-FLOAT" ), makeString( "decode_float" ) ), ConsesLow.list( makeSymbol(
                                                          "DECODE-UNIVERSAL-TIME" ), makeString( "decode_universal_time" ) ), ConsesLow.list( makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" ), makeString(
                                                              "default_struct_print_function" ) ), ConsesLow.list( makeSymbol( "DELETE" ), makeString( "delete" ) ), ConsesLow.list( makeSymbol( "DELETE-DIRECTORY" ),
                                                                  makeString( "delete_directory" ) ), ConsesLow.list( makeSymbol( "DELETE-DUPLICATES" ), makeString( "delete_duplicates" ) ), ConsesLow.list( makeSymbol(
                                                                      "DELETE-FILE" ), makeString( "delete_file" ) ), ConsesLow.list( makeSymbol( "DELETE-IF" ), makeString( "delete_if" ) ), ConsesLow.list( makeSymbol(
                                                                          "DESTROY-HASH-TABLE-ITERATOR" ), makeString( "destroy_hash_table_iterator" ) ), ConsesLow.list( makeSymbol( "DIGIT-CHAR" ), makeString(
                                                                              "digit_char" ) ), ConsesLow.list( makeSymbol( "DIGIT-CHAR-P" ), makeString( "dp_digit_char_p" ) ), ConsesLow.list( makeSymbol( "DIRECTORY" ),
                                                                                  makeString( "directory" ) ), ConsesLow.list( makeSymbol( "DIRECTORY-P" ), makeString( "directory_p" ) ), ConsesLow.list( makeSymbol(
                                                                                      "DISASSEMBLE-GUID-TO-FIXNUMS" ), makeString( "disassemble_guid_to_fixnums" ) ), ConsesLow.list( makeSymbol(
                                                                                          "DISASSEMBLE-INTEGER-TO-FIXNUMS" ), makeString( "disassemble_integer_to_fixnums" ) ), ConsesLow.list( makeSymbol( "DPB" ),
                                                                                              makeString( "f_dpb" ) ), ConsesLow.list( makeSymbol( "ECHO-STREAM-INPUT-STREAM" ), makeString( "echo_stream_input_stream" ) ),
      ConsesLow.list( makeSymbol( "ECHO-STREAM-OUTPUT-STREAM" ), makeString( "echo_stream_output_stream" ) ), ConsesLow.list( makeSymbol( "EIGHTH" ), makeString( "eighth" ) ), ConsesLow.list( makeSymbol( "ELT" ),
          makeString( "elt" ) ), ConsesLow.list( makeSymbol( "ENCODE-UNIVERSAL-TIME" ), makeString( "encode_universal_time" ) ), ConsesLow.list( makeSymbol( "ENDP" ), makeString( "dp_endp" ) ), ConsesLow.list( EQ,
              makeString( "dp_eq" ) ), ConsesLow.list( EQL, makeString( "dp_eql" ) ), ConsesLow.list( EQUAL, makeString( "dp_equal" ) ), ConsesLow.list( EQUALP, makeString( "dp_equalp" ) ), ConsesLow.list( makeSymbol(
                  "ERROR" ), makeString( "sublisp_error" ) ), ConsesLow.list( makeSymbol( "EVAL" ), makeString( "eval" ) ), ConsesLow.list( makeSymbol( "EVENP" ), makeString( "dp_evenp" ) ), ConsesLow.list( makeSymbol(
                      "EXIT" ), makeString( "sublisp_exit" ) ), ConsesLow.list( makeSymbol( "EXP" ), makeString( "sublisp_exp" ) ), ConsesLow.list( makeSymbol( "EXPORT" ), makeString( "export" ) ), ConsesLow.list(
                          makeSymbol( "EXPT" ), makeString( "expt" ) ), ConsesLow.list( makeSymbol( "FALSE" ), makeString( "sublisp_false" ) ), ConsesLow.list( makeSymbol( "FBOUNDP" ), makeString( "dp_fboundp" ) ),
      ConsesLow.list( makeSymbol( "FIFTH" ), makeString( "fifth" ) ), ConsesLow.list( makeSymbol( "FILE-AUTHOR" ), makeString( "file_author" ) ), ConsesLow.list( makeSymbol( "FILE-LENGTH" ), makeString(
          "file_length" ) ), ConsesLow.list( makeSymbol( "FILE-LENGTH" ), makeString( "file_length" ) ), ConsesLow.list( makeSymbol( "FILE-POSITION" ), makeString( "file_position" ) ), ConsesLow.list( makeSymbol(
              "FILE-STRING-LENGTH" ), makeString( "file_string_length" ) ), ConsesLow.list( makeSymbol( "FILE-WRITE-DATE" ), makeString( "file_write_date" ) ), ConsesLow.list( makeSymbol( "FILL" ), makeString(
                  "fill" ) ), ConsesLow.list( makeSymbol( "FIND" ), makeString( "find" ) ), ConsesLow.list( makeSymbol( "FIND-IF" ), makeString( "find_if" ) ), ConsesLow.list( makeSymbol( "FIND-PACKAGE" ), makeString(
                      "find_package" ) ), ConsesLow.list( makeSymbol( "FIND-SYMBOL" ), makeString( "find_symbol" ) ), ConsesLow.list( makeSymbol( "FINISH-OUTPUT" ), makeString( "finish_output" ) ), ConsesLow.list(
                          makeSymbol( "FIRST" ), makeString( "first" ) ), ConsesLow.list( makeSymbol( "FIXNUM*" ), makeString( "fixnum_mult" ) ), ConsesLow.list( makeSymbol( "FIXNUMP" ), makeString( "dp_fixnump" ) ),
      ConsesLow.list( makeSymbol( "FLOAT" ), makeString( "sublisp_float" ) ), ConsesLow.list( makeSymbol( "FLOAT-DIGITS" ), makeString( "float_digits" ) ), ConsesLow.list( makeSymbol( "FLOAT-RADIX" ), makeString(
          "float_radix" ) ), ConsesLow.list( makeSymbol( "FLOAT-SIGN" ), makeString( "float_sign" ) ), ConsesLow.list( makeSymbol( "FLOATP" ), makeString( "dp_floatp" ) ), ConsesLow.list( makeSymbol( "FLOOR" ),
              makeString( "sublisp_floor" ) ), ConsesLow.list( makeSymbol( "FMAKUNBOUND" ), makeString( "fmakunbound" ) ), ConsesLow.list( makeSymbol( "FORCE-OUTPUT" ), makeString( "force_output" ) ), ConsesLow.list(
                  makeSymbol( "FORK-PROCESS" ), makeString( "fork_process" ) ), ConsesLow.list( makeSymbol( "FORMAT" ), makeString( "format_g" ) ), ConsesLow.list( makeSymbol( "FOURTH" ), makeString( "fourth" ) ),
      ConsesLow.list( makeSymbol( "FRESH-LINE" ), makeString( "fresh_line" ) ), ConsesLow.list( makeSymbol( "FUNCALL" ), makeString( "funcall" ) ), ConsesLow.list( makeSymbol( "FUNCTION-INFORMATION" ), makeString(
          "function_information" ) ), ConsesLow.list( makeSymbol( "FUNCTION-SPEC-P" ), makeString( "dp_function_spec_p" ) ), ConsesLow.list( makeSymbol( "FUNCTIONP" ), makeString( "dp_functionp" ) ), ConsesLow.list(
              makeSymbol( "GC" ), makeString( "gc" ) ), ConsesLow.list( makeSymbol( "GC-DYNAMIC" ), makeString( "gc_dynamic" ) ), ConsesLow.list( makeSymbol( "GC-EPHEMERAL" ), makeString( "gc_ephemeral" ) ), ConsesLow
                  .list( makeSymbol( "GC-FULL" ), makeString( "gc_full" ) ), ConsesLow.list( makeSymbol( "GENSYM" ), makeString( "gensym" ) ), ConsesLow.list( makeSymbol( "GENTEMP" ), makeString( "gentemp" ) ), ConsesLow
                      .list( makeSymbol( "GET" ), makeString( "get" ) ), ConsesLow.list( makeSymbol( "GET-DECODED-TIME" ), makeString( "get_decoded_time" ) ), ConsesLow.list( makeSymbol( "GET-DISPATCH-MACRO-CHARACTER" ),
                          makeString( "get_dispatch_macro_character" ) ), ConsesLow.list( makeSymbol( "GET-FILE-POSITION" ), makeString( "get_file_position" ) ), ConsesLow.list( makeSymbol( "GET-FILE-POSITION" ),
                              makeString( "get_file_position" ) ), ConsesLow.list( makeSymbol( "GET-INTERNAL-REAL-TIME" ), makeString( "get_internal_real_time" ) ), ConsesLow.list( makeSymbol( "GET-INTERNAL-RUN-TIME" ),
                                  makeString( "get_internal_run_time" ) ), ConsesLow.list( makeSymbol( "GET-MACHINE-NAME" ), makeString( "get_machine_name" ) ), ConsesLow.list( makeSymbol( "GET-MACRO-CHARACTER" ),
                                      makeString( "get_macro_character" ) ), ConsesLow.list( makeSymbol( "GET-NETWORK-NAME" ), makeString( "get_network_name" ) ), ConsesLow.list( makeSymbol( "GET-OUTPUT-STREAM-STRING" ),
                                          makeString( "get_output_stream_string" ) ), ConsesLow.list( makeSymbol( "GET-PROCESS-ID" ), makeString( "get_process_id" ) ), ConsesLow.list( makeSymbol(
                                              "GET-STRING-FROM-USER" ), makeString( "get_string_from_user" ) ), ConsesLow.list( makeSymbol( "GET-UNIVERSAL-TIME" ), makeString( "get_universal_time" ) ), ConsesLow.list(
                                                  makeSymbol( "GET-USER-NAME" ), makeString( "get_user_name" ) ), ConsesLow.list( makeSymbol( "GETF" ), makeString( "getf" ) ), ConsesLow.list( makeSymbol( "GETHASH" ),
                                                      makeString( "gethash" ) ), ConsesLow.list( makeSymbol( "GETHASH-WITHOUT-VALUES" ), makeString( "gethash_without_values" ) ), ConsesLow.list( makeSymbol( "GUID-P" ),
                                                          makeString( "dp_guid_p" ) ), ConsesLow.list( makeSymbol( "GUID-STRING-P" ), makeString( "guid_string_p" ) ), ConsesLow.list( makeSymbol( "GUID-TO-STRING" ),
                                                              makeString( "guid_to_string" ) ), ConsesLow.list( makeSymbol( "GUID/=" ), makeString( "dp_guidNE" ) ), ConsesLow.list( makeSymbol( "GUID<" ), makeString(
                                                                  "dp_guidL" ) ), ConsesLow.list( makeSymbol( "GUID<=" ), makeString( "dp_guidLE" ) ), ConsesLow.list( makeSymbol( "GUID=" ), makeString( "dp_guidE" ) ),
      ConsesLow.list( makeSymbol( "GUID>" ), makeString( "dp_guidG" ) ), ConsesLow.list( makeSymbol( "GUID>=" ), makeString( "dp_guidGE" ) ), ConsesLow.list( makeSymbol( "HASH-TABLE-COUNT" ), makeString(
          "hash_table_count" ) ), ConsesLow.list( makeSymbol( "HASH-TABLE-ITERATOR-DONE-P" ), makeString( "hash_table_iterator_done_p" ) ), ConsesLow.list( makeSymbol( "HASH-TABLE-ITERATOR-HASH-TABLE" ), makeString(
              "hash_table_iterator_hash_table" ) ), ConsesLow.list( makeSymbol( "HASH-TABLE-ITERATOR-KEY" ), makeString( "hash_table_iterator_key" ) ), ConsesLow.list( makeSymbol( "HASH-TABLE-ITERATOR-NEXT" ),
                  makeString( "hash_table_iterator_next" ) ), ConsesLow.list( makeSymbol( "HASH-TABLE-ITERATOR-P" ), makeString( "hash_table_iterator_p" ) ), ConsesLow.list( makeSymbol( "HASH-TABLE-ITERATOR-VALUE" ),
                      makeString( "hash_table_iterator_value" ) ), ConsesLow.list( makeSymbol( "HASH-TABLE-P" ), makeString( "dp_hash_table_p" ) ), ConsesLow.list( makeSymbol( "HASH-TABLE-SIZE" ), makeString(
                          "hash_table_size" ) ), ConsesLow.list( makeSymbol( "HASH-TABLE-TEST" ), makeString( "hash_table_test" ) ), ConsesLow.list( IDENTITY, makeString( "identity" ) ), ConsesLow.list( makeSymbol(
                              "IGNORE" ), makeString( "ignore" ) ), ConsesLow.list( makeSymbol( "IMPORT" ), makeString( "import" ) ), ConsesLow.list( makeSymbol( "INFINITY-P" ), makeString( "dp_infinity_p" ) ), ConsesLow
                                  .list( makeSymbol( "INPUT-STREAM-P" ), makeString( "input_stream_p" ) ), ConsesLow.list( makeSymbol( "INT/" ), makeString( "int_div" ) ), ConsesLow.list( makeSymbol(
                                      "INTEGER-DECODE-FLOAT" ), makeString( "integer_decode_float" ) ), ConsesLow.list( makeSymbol( "INTEGER-LENGTH" ), makeString( "integer_length" ) ), ConsesLow.list( makeSymbol(
                                          "INTEGERP" ), makeString( "dp_integerp" ) ), ConsesLow.list( makeSymbol( "INTERACTIVE-STREAM-P" ), makeString( "interactive_stream_p" ) ), ConsesLow.list( makeSymbol( "INTERN" ),
                                              makeString( "intern" ) ), ConsesLow.list( makeSymbol( "INTERNAL-REAL-TIME-HAS-ARRIVED?" ), makeString( "internal_real_time_has_arrived_p" ) ), ConsesLow.list( makeSymbol(
                                                  "INTERRUPT-PROCESS" ), makeString( "interrupt_process" ) ), ConsesLow.list( makeSymbol( "INTERSECTION" ), makeString( "intersection" ) ), ConsesLow.list( makeSymbol(
                                                      "ISQRT" ), makeString( "isqrt" ) ), ConsesLow.list( makeSymbol( "KEYWORDP" ), makeString( "dp_keywordp" ) ), ConsesLow.list( makeSymbol( "KILL-PROCESS" ), makeString(
                                                          "kill_process" ) ), ConsesLow.list( makeSymbol( "LAST" ), makeString( "last" ) ), ConsesLow.list( makeSymbol( "LDB" ), makeString( "f_ldb" ) ), ConsesLow.list(
                                                              makeSymbol( "LDIFF" ), makeString( "ldiff" ) ), ConsesLow.list( makeSymbol( "LENGTH" ), makeString( "length" ) ), ConsesLow.list( makeSymbol(
                                                                  "LISP-IMPLEMENTATION-TYPE" ), makeString( "lisp_implementation_type" ) ), ConsesLow.list( makeSymbol( "LISP-IMPLEMENTATION-VERSION" ), makeString(
                                                                      "lisp_implementation_version" ) ), ConsesLow.list( makeSymbol( "LIST" ), makeString( "list" ) ), ConsesLow.list( makeSymbol( "LIST*" ), makeString(
                                                                          "listS" ) ), ConsesLow.list( makeSymbol( "LIST-ALL-PACKAGES" ), makeString( "list_all_packages" ) ), ConsesLow.list( makeSymbol( "LIST-LENGTH" ),
                                                                              makeString( "list_length" ) ), ConsesLow.list( makeSymbol( "LISTEN" ), makeString( "sublisp_listen" ) ), ConsesLow.list( makeSymbol(
                                                                                  "LISTP" ), makeString( "dp_listp" ) ), ConsesLow.list( makeSymbol( "LOAD" ), makeString( "load" ) ), ConsesLow.list( makeSymbol(
                                                                                      "LOCK-IDLE-P" ), makeString( "lock_idle_p" ) ), ConsesLow.list( makeSymbol( "LOCK-LOCKER" ), makeString( "lock_locker" ) ), ConsesLow
                                                                                          .list( makeSymbol( "LOCK-NAME" ), makeString( "lock_name" ) ), ConsesLow.list( makeSymbol( "LOCK-P" ), makeString( "dp_lockp" ) ),
      ConsesLow.list( makeSymbol( "LOCK-PACKAGE" ), makeString( "lock_package" ) ), ConsesLow.list( makeSymbol( "LOG" ), makeString( "sublisp_log" ) ), ConsesLow.list( makeSymbol( "LOG-MESSAGE" ), makeString(
          "log_message" ) ), ConsesLow.list( makeSymbol( "LOGAND" ), makeString( "logand" ) ), ConsesLow.list( makeSymbol( "LOGANDC1" ), makeString( "logandc1" ) ), ConsesLow.list( makeSymbol( "LOGANDC2" ), makeString(
              "logandc2" ) ), ConsesLow.list( makeSymbol( "LOGBITP" ), makeString( "logbitp" ) ), ConsesLow.list( makeSymbol( "LOGCOUNT" ), makeString( "logcount" ) ), ConsesLow.list( makeSymbol( "LOGEQV" ), makeString(
                  "logeqv" ) ), ConsesLow.list( makeSymbol( "LOGIOR" ), makeString( "logior" ) ), ConsesLow.list( makeSymbol( "LOGNAND" ), makeString( "lognand" ) ), ConsesLow.list( makeSymbol( "LOGNOR" ), makeString(
                      "lognor" ) ), ConsesLow.list( makeSymbol( "LOGNOT" ), makeString( "lognot" ) ), ConsesLow.list( makeSymbol( "LOGORC1" ), makeString( "logorc1" ) ), ConsesLow.list( makeSymbol( "LOGORC2" ),
                          makeString( "logorc2" ) ), ConsesLow.list( makeSymbol( "LOGTEST" ), makeString( "logtest" ) ), ConsesLow.list( makeSymbol( "LOGXOR" ), makeString( "logxor" ) ), ConsesLow.list( makeSymbol(
                              "LONG-SITE-NAME" ), makeString( "long_site_name" ) ), ConsesLow.list( makeSymbol( "LOWER-CASE-P" ), makeString( "dp_lower_case_p" ) ), ConsesLow.list( makeSymbol( "MACHINE-INSTANCE" ),
                                  makeString( "machine_instance" ) ), ConsesLow.list( makeSymbol( "MACHINE-TYPE" ), makeString( "machine_type" ) ), ConsesLow.list( makeSymbol( "MACHINE-VERSION" ), makeString(
                                      "machine_version" ) ), ConsesLow.list( makeSymbol( "MACRO-OPERATOR-P" ), makeString( "dp_macro_operator_p" ) ), ConsesLow.list( makeSymbol( "MACROEXPAND" ), makeString(
                                          "sublisp_macroexpand" ) ), ConsesLow.list( makeSymbol( "MACROEXPAND-1" ), makeString( "sublisp_macroexpand_one" ) ), ConsesLow.list( makeSymbol( "MAKE-BROADCAST-STREAM" ),
                                              makeString( "make_broadcast_stream" ) ), ConsesLow.list( makeSymbol( "MAKE-CONCATENATED-STREAM" ), makeString( "make_concatenated_stream" ) ), ConsesLow.list( makeSymbol(
                                                  "MAKE-DATE-RELATIVE-GUID" ), makeString( "make_date_relative_guid" ) ), ConsesLow.list( makeSymbol( "MAKE-DIRECTORY" ), makeString( "make_directory" ) ), ConsesLow.list(
                                                      makeSymbol( "MAKE-DISPATCH-MACRO-CHARACTER" ), makeString( "make_dispatch_macro_character" ) ), ConsesLow.list( makeSymbol( "MAKE-ECHO-STREAM" ), makeString(
                                                          "make_echo_stream" ) ), ConsesLow.list( makeSymbol( "MAKE-HASH-TABLE" ), makeString( "make_hash_table" ) ), ConsesLow.list( makeSymbol(
                                                              "MAKE-HASH-TABLE-ITERATOR" ), makeString( "make_hash_table_iterator" ) ), ConsesLow.list( makeSymbol( "MAKE-KEYWORD" ), makeString( "make_keyword" ) ),
      ConsesLow.list( makeSymbol( "MAKE-LIST" ), makeString( "make_list" ) ), ConsesLow.list( makeSymbol( "MAKE-LOCK" ), makeString( "make_lock" ) ), ConsesLow.list( makeSymbol( "MAKE-PACKAGE" ), makeString(
          "make_package" ) ), ConsesLow.list( makeSymbol( "MAKE-PRIVATE-BROADCAST-STREAM" ), makeString( "make_private_broadcast_stream" ) ), ConsesLow.list( makeSymbol( "MAKE-PRIVATE-CONCATENATED-STREAM" ), makeString(
              "make_private_concatenated_stream" ) ), ConsesLow.list( makeSymbol( "MAKE-PRIVATE-ECHO-STREAM" ), makeString( "make_private_echo_stream" ) ), ConsesLow.list( makeSymbol(
                  "MAKE-PRIVATE-STRING-INPUT-STREAM" ), makeString( "make_private_string_input_stream" ) ), ConsesLow.list( makeSymbol( "MAKE-PRIVATE-STRING-OUTPUT-STREAM" ), makeString(
                      "make_private_string_output_stream" ) ), ConsesLow.list( makeSymbol( "MAKE-PRIVATE-SYNONYM-STREAM" ), makeString( "make_private_synonym_stream" ) ), ConsesLow.list( makeSymbol(
                          "MAKE-PRIVATE-TWO-WAY-STREAM" ), makeString( "make_private_two_way_stream" ) ), ConsesLow.list( makeSymbol( "MAKE-PROCESS" ), makeString( "make_process" ) ), ConsesLow.list( makeSymbol(
                              "MAKE-STRING" ), makeString( "make_string" ) ), ConsesLow.list( makeSymbol( "MAKE-STRING-INPUT-STREAM" ), makeString( "make_string_input_stream" ) ), ConsesLow.list( makeSymbol(
                                  "MAKE-STRING-OUTPUT-STREAM" ), makeString( "make_string_output_stream" ) ), ConsesLow.list( makeSymbol( "MAKE-SYMBOL" ), makeString( "make_symbol" ) ), ConsesLow.list( makeSymbol(
                                      "MAKE-SYNONYM-STREAM" ), makeString( "make_synonym_stream" ) ), ConsesLow.list( makeSymbol( "MAKE-TWO-WAY-STREAM" ), makeString( "make_two_way_stream" ) ), ConsesLow.list(
                                          makeSymbol( "MAKE-VECTOR" ), makeString( "make_vector" ) ), ConsesLow.list( makeSymbol( "MAKUNBOUND" ), makeString( "makunbound" ) ), ConsesLow.list( makeSymbol( "MAPC" ),
                                              makeString( "mapc" ) ), ConsesLow.list( makeSymbol( "MAPCAN" ), makeString( "mapcan" ) ), ConsesLow.list( makeSymbol( "MAPCAR" ), makeString( "mapcar" ) ), ConsesLow.list(
                                                  makeSymbol( "MAPCON" ), makeString( "mapcon" ) ), ConsesLow.list( makeSymbol( "MAPHASH" ), makeString( "maphash" ) ), ConsesLow.list( makeSymbol( "MAPL" ), makeString(
                                                      "mapl" ) ), ConsesLow.list( makeSymbol( "MAPLIST" ), makeString( "maplist" ) ), ConsesLow.list( makeSymbol( "MAX" ), makeString( "max" ) ), ConsesLow.list(
                                                          makeSymbol( "MEMBER" ), makeString( "member" ) ), ConsesLow.list( makeSymbol( "MEMBER-IF" ), makeString( "member_if" ) ), ConsesLow.list( makeSymbol( "MIN" ),
                                                              makeString( "min" ) ), ConsesLow.list( makeSymbol( "MINUSP" ), makeString( "dp_minusp" ) ), ConsesLow.list( makeSymbol( "MISMATCH" ), makeString(
                                                                  "mismatch" ) ), ConsesLow.list( makeSymbol( "MOD" ), makeString( "mod" ) ), ConsesLow.list( makeSymbol( "NBUTLAST" ), makeString( "nbutlast" ) ),
      ConsesLow.list( makeSymbol( "NCONC" ), makeString( "nconc" ) ), ConsesLow.list( makeSymbol( "NEW-GUID" ), makeString( "new_guid" ) ), ConsesLow.list( makeSymbol( "NINTERSECTION" ), makeString( "nintersection" ) ),
      ConsesLow.list( makeSymbol( "NINTH" ), makeString( "ninth" ) ), ConsesLow.list( makeSymbol( "NON-CIRCULAR-LIST-P" ), makeString( "dp_non_circular_list_p" ) ), ConsesLow.list( makeSymbol( "NOT-A-NUMBER-P" ),
          makeString( "dp_not_a_number_p" ) ), ConsesLow.list( makeSymbol( "NOTIFY" ), makeString( "notify" ) ), ConsesLow.list( makeSymbol( "NOTIFY-USER" ), makeString( "notify_user" ) ), ConsesLow.list( makeSymbol(
              "NRECONC" ), makeString( "nreconc" ) ), ConsesLow.list( makeSymbol( "NREVERSE" ), makeString( "nreverse" ) ), ConsesLow.list( makeSymbol( "NSET-DIFFERENCE" ), makeString( "nset_difference" ) ), ConsesLow
                  .list( makeSymbol( "NSET-EXCLUSIVE-OR" ), makeString( "nset_exclusive_or" ) ), ConsesLow.list( makeSymbol( "NSTRING-CAPITALIZE" ), makeString( "nstring_capitalize" ) ), ConsesLow.list( makeSymbol(
                      "NSTRING-DOWNCASE" ), makeString( "nstring_downcase" ) ), ConsesLow.list( makeSymbol( "NSTRING-UPCASE" ), makeString( "nstring_upcase" ) ), ConsesLow.list( makeSymbol( "NSUBLIS" ), makeString(
                          "nsublis" ) ), ConsesLow.list( makeSymbol( "NSUBST" ), makeString( "nsubst" ) ), ConsesLow.list( makeSymbol( "NSUBST-IF" ), makeString( "nsubst_if" ) ), ConsesLow.list( makeSymbol(
                              "NSUBSTITUTE" ), makeString( "nsubstitute" ) ), ConsesLow.list( makeSymbol( "NSUBSTITUTE-IF" ), makeString( "nsubstitute_if" ) ), ConsesLow.list( makeSymbol( "NTH" ), makeString( "nth" ) ),
      ConsesLow.list( makeSymbol( "NTHCDR" ), makeString( "nthcdr" ) ), ConsesLow.list( makeSymbol( "NULL" ), makeString( "dp_null" ) ), ConsesLow.list( makeSymbol( "NUMBERP" ), makeString( "dp_numberp" ) ), ConsesLow
          .list( makeSymbol( "NUNION" ), makeString( "sublisp_nunion" ) ), ConsesLow.list( makeSymbol( "ODDP" ), makeString( "dp_oddp" ) ), ConsesLow.list( makeSymbol( "OPEN-BINARY" ), makeString( "open_binary" ) ),
      ConsesLow.list( makeSymbol( "OPEN-STREAM-P" ), makeString( "open_stream_p" ) ), ConsesLow.list( makeSymbol( "OPEN-TCP-STREAM" ), makeString( "open_tcp_stream" ) ), ConsesLow.list( makeSymbol( "OPEN-TEXT" ),
          makeString( "open_text" ) ), ConsesLow.list( makeSymbol( "OUTPUT-STREAM-P" ), makeString( "output_stream_p" ) ), ConsesLow.list( makeSymbol( "PACKAGE-LOCKED-P" ), makeString( "dp_package_locked_p" ) ),
      ConsesLow.list( makeSymbol( "PACKAGE-NAME" ), makeString( "package_name" ) ), ConsesLow.list( makeSymbol( "PACKAGE-NICKNAMES" ), makeString( "package_nicknames" ) ), ConsesLow.list( makeSymbol(
          "PACKAGE-SHADOWING-SYMBOLS" ), makeString( "package_shadowing_symbols" ) ), ConsesLow.list( makeSymbol( "PACKAGE-USE-LIST" ), makeString( "package_use_list" ) ), ConsesLow.list( makeSymbol(
              "PACKAGE-USED-BY-LIST" ), makeString( "package_used_by_list" ) ), ConsesLow.list( makeSymbol( "PACKAGEP" ), makeString( "dp_packagep" ) ), ConsesLow.list( makeSymbol( "PAIRLIS" ), makeString( "pairlis" ) ),
      ConsesLow.list( makeSymbol( "PARSE-INTEGER" ), makeString( "parse_integer" ) ), ConsesLow.list( makeSymbol( "PEEK-CHAR" ), makeString( "peek_char" ) ), ConsesLow.list( makeSymbol( "PLUSP" ), makeString(
          "dp_plusp" ) ), ConsesLow.list( makeSymbol( "POSITION" ), makeString( "position" ) ), ConsesLow.list( makeSymbol( "POSITION-IF" ), makeString( "position_if" ) ), ConsesLow.list( makeSymbol( "PRIN1" ),
              makeString( "prin1" ) ), ConsesLow.list( makeSymbol( "PRIN1-TO-STRING" ), makeString( "prin1_to_string" ) ), ConsesLow.list( makeSymbol( "PRINC" ), makeString( "princ" ) ), ConsesLow.list( makeSymbol(
                  "PRINC-TO-STRING" ), makeString( "princ_to_string" ) ), ConsesLow.list( makeSymbol( "PRINT" ), makeString( "print" ) ), ConsesLow.list( makeSymbol( "PRINT-OBJECT" ), makeString( "print_object" ) ),
      ConsesLow.list( makeSymbol( "PROBE-FILE" ), makeString( "dp_probe_file" ) ), ConsesLow.list( makeSymbol( "PROCESS-ACTIVE-P" ), makeString( "process_active_p" ) ), ConsesLow.list( makeSymbol( "PROCESS-BLOCK" ),
          makeString( "process_block" ) ), ConsesLow.list( makeSymbol( "PROCESS-NAME" ), makeString( "process_name" ) ), ConsesLow.list( makeSymbol( "PROCESS-PRIORITY" ), makeString( "process_priority" ) ), ConsesLow
              .list( makeSymbol( "PROCESS-STATE" ), makeString( "process_state" ) ), ConsesLow.list( makeSymbol( "PROCESS-UNBLOCK" ), makeString( "process_unblock" ) ), ConsesLow.list( makeSymbol( "PROCESS-WAIT" ),
                  makeString( "process_wait" ) ), ConsesLow.list( makeSymbol( "PROCESS-WAIT-WITH-TIMEOUT" ), makeString( "process_wait_with_timeout" ) ), ConsesLow.list( makeSymbol( "PROCESS-WHOSTATE" ), makeString(
                      "process_whostate" ) ), ConsesLow.list( makeSymbol( "PROCESSP" ), makeString( "dp_processp" ) ), ConsesLow.list( makeSymbol( "PUT" ), makeString( "put" ) ), ConsesLow.list( makeSymbol( "PUTF" ),
                          makeString( "putf" ) ), ConsesLow.list( makeSymbol( "RANDOM" ), makeString( "sublisp_random" ) ), ConsesLow.list( makeSymbol( "RASSOC" ), makeString( "rassoc" ) ), ConsesLow.list( makeSymbol(
                              "RASSOC-IF" ), makeString( "rassoc_if" ) ), ConsesLow.list( makeSymbol( "READ" ), makeString( "sublisp_read" ) ), ConsesLow.list( makeSymbol( "READ-BYTE" ), makeString( "read_byte" ) ),
      ConsesLow.list( makeSymbol( "READ-CHAR" ), makeString( "read_char" ) ), ConsesLow.list( makeSymbol( "READ-CHAR-NO-HANG" ), makeString( "read_char_no_hang" ) ), ConsesLow.list( makeSymbol( "READ-DELIMITED-LIST" ),
          makeString( "read_delimited_list" ) ), ConsesLow.list( makeSymbol( "READ-FROM-STRING" ), makeString( "read_from_string" ) ), ConsesLow.list( makeSymbol( "READ-FROM-STRING-IGNORING-ERRORS" ), makeString(
              "f_read_from_string_ignoring_errors" ) ), ConsesLow.list( makeSymbol( "READ-IGNORING-ERRORS" ), makeString( "read_ignoring_errors" ) ), ConsesLow.list( makeSymbol( "READ-LINE" ), makeString(
                  "read_line" ) ), ConsesLow.list( makeSymbol( "READ-PRESERVING-WHITESPACE" ), makeString( "read_preserving_whitespace" ) ), ConsesLow.list( makeSymbol( "READ-SEQUENCE" ), makeString( "read_sequence" ) ),
      ConsesLow.list( makeSymbol( "READTABLE-CASE" ), makeString( "readtable_case" ) ), ConsesLow.list( makeSymbol( "READTABLEP" ), makeString( "readtablep" ) ), ConsesLow.list( makeSymbol(
          "REGISTER-LOW-MEMORY-CALLBACK" ), makeString( "register_low_memory_callback" ) ), ConsesLow.list( makeSymbol( "DEREGISTER-LOW-MEMORY-CALLBACK" ), makeString( "deregister_low_memory_callback" ) ), ConsesLow
              .list( makeSymbol( "LOW-MEMORY-CALLBACKS" ), makeString( "register_low_memory_callback" ) ), ConsesLow.list( makeSymbol( "REM" ), makeString( "rem" ) ), ConsesLow.list( makeSymbol( "REMF" ), makeString(
                  "remf" ) ), ConsesLow.list( makeSymbol( "REMHASH" ), makeString( "remhash" ) ), ConsesLow.list( makeSymbol( "REMOVE" ), makeString( "sublisp_remove" ) ), ConsesLow.list( makeSymbol(
                      "REMOVE-DUPLICATES" ), makeString( "remove_duplicates" ) ), ConsesLow.list( makeSymbol( "REMOVE-IF" ), makeString( "sublisp_remove_if" ) ), ConsesLow.list( makeSymbol( "REMPROP" ), makeString(
                          "remprop" ) ), ConsesLow.list( makeSymbol( "RENAME-FILE" ), makeString( "rename_file" ) ), ConsesLow.list( makeSymbol( "REPLACE" ), makeString( "replace" ) ), ConsesLow.list( makeSymbol(
                              "REST" ), makeString( "rest" ) ), ConsesLow.list( makeSymbol( "RESTART-PROCESS" ), makeString( "restart_process" ) ), ConsesLow.list( makeSymbol( "REVAPPEND" ), makeString( "revappend" ) ),
      ConsesLow.list( makeSymbol( "REVERSE" ), makeString( "reverse" ) ), ConsesLow.list( makeSymbol( "ROOM" ), makeString( "room" ) ), ConsesLow.list( makeSymbol( "ROUND" ), makeString( "sublisp_round" ) ), ConsesLow
          .list( makeSymbol( "RPLACA" ), makeString( "rplaca" ) ), ConsesLow.list( makeSymbol( "RPLACD" ), makeString( "rplacd" ) ), ConsesLow.list( makeSymbol( "SCALE-FLOAT" ), makeString( "scale_float" ) ), ConsesLow
              .list( makeSymbol( "SEARCH" ), makeString( "search" ) ), ConsesLow.list( makeSymbol( "SECOND" ), makeString( "second" ) ), ConsesLow.list( makeSymbol( "SEED-RANDOM" ), makeString( "seed_random" ) ),
      ConsesLow.list( makeSymbol( "SEQUENCEP" ), makeString( "dp_sequencep" ) ), ConsesLow.list( makeSymbol( "SET" ), makeString( "set" ) ), ConsesLow.list( makeSymbol( "SET-AREF" ), makeString( "set_aref" ) ), ConsesLow
          .list( makeSymbol( "SET-CHAR" ), makeString( "sublisp_set_char" ) ), ConsesLow.list( makeSymbol( "SET-DIFFERENCE" ), makeString( "set_difference" ) ), ConsesLow.list( makeSymbol(
              "SET-DISPATCH-MACRO-CHARACTER" ), makeString( "set_dispatch_macro_character" ) ), ConsesLow.list( makeSymbol( "SET-EXCLUSIVE-OR" ), makeString( "set_exclusive_or" ) ), ConsesLow.list( makeSymbol(
                  "SET-FILE-POSITION" ), makeString( "set_file_position" ) ), ConsesLow.list( makeSymbol( "SET-MACRO-CHARACTER" ), makeString( "set_macro_character" ) ), ConsesLow.list( makeSymbol( "SET-NTH" ),
                      makeString( "set_nth" ) ), ConsesLow.list( makeSymbol( "SET-PROCESS-PRIORITY" ), makeString( "set_process_priority" ) ), ConsesLow.list( makeSymbol( "SET-SYNTAX-FROM-CHAR" ), makeString(
                          "set_syntax_from_char" ) ), ConsesLow.list( makeSymbol( "SETHASH" ), makeString( "sethash" ) ), ConsesLow.list( makeSymbol( "SEVENTH" ), makeString( "seventh" ) ), ConsesLow.list( makeSymbol(
                              "SHORT-SITE-NAME" ), makeString( "short_site_name" ) ), ConsesLow.list( makeSymbol( "SHOW-PROCESSES" ), makeString( "show_processes" ) ), ConsesLow.list( makeSymbol( "SIMPLE-READER-ERROR" ),
                                  makeString( "simple_reader_error" ) ), ConsesLow.list( makeSymbol( "SIN" ), makeString( "sublisp_sin" ) ), ConsesLow.list( makeSymbol( "SIXTH" ), makeString( "sixth" ) ), ConsesLow.list(
                                      makeSymbol( "SLEEP" ), makeString( "sublisp_sleep" ) ), ConsesLow.list( makeSymbol( "SOFTWARE-TYPE" ), makeString( "software_type" ) ), ConsesLow.list( makeSymbol(
                                          "SOFTWARE-VERSION" ), makeString( "software_version" ) ), ConsesLow.list( makeSymbol( "SORT" ), makeString( "sort" ) ), ConsesLow.list( makeSymbol( "SQRT" ), makeString(
                                              "sublisp_sqrt" ) ), ConsesLow.list( makeSymbol( "STABLE-SORT" ), makeString( "stable_sort" ) ), ConsesLow.list( makeSymbol( "STREAM-ELEMENT-TYPE" ), makeString(
                                                  "stream_element_type" ) ), ConsesLow.list( makeSymbol( "STREAMP" ), makeString( "dp_streamp" ) ), ConsesLow.list( makeSymbol( "STRING" ), makeString(
                                                      "sublisp_string" ) ), ConsesLow.list( makeSymbol( "STRING-CAPITALIZE" ), makeString( "string_capitalize" ) ), ConsesLow.list( makeSymbol( "STRING-DOWNCASE" ),
                                                          makeString( "string_downcase" ) ), ConsesLow.list( makeSymbol( "STRING-EQUAL" ), makeString( "dp_string_equal" ) ), ConsesLow.list( makeSymbol(
                                                              "STRING-GREATERP" ), makeString( "dp_string_greaterp" ) ), ConsesLow.list( makeSymbol( "STRING-LEFT-TRIM" ), makeString( "string_left_trim" ) ), ConsesLow
                                                                  .list( makeSymbol( "STRING-LESSP" ), makeString( "dp_string_lessp" ) ), ConsesLow.list( makeSymbol( "STRING-NOT-EQUAL" ), makeString(
                                                                      "dp_string_not_equal" ) ), ConsesLow.list( makeSymbol( "STRING-NOT-GREATERP" ), makeString( "dp_string_not_greaterp" ) ), ConsesLow.list( makeSymbol(
                                                                          "STRING-NOT-LESSP" ), makeString( "dp_string_not_lessp" ) ), ConsesLow.list( makeSymbol( "STRING-RIGHT-TRIM" ), makeString(
                                                                              "string_right_trim" ) ), ConsesLow.list( makeSymbol( "STRING-TO-GUID" ), makeString( "string_to_guid" ) ), ConsesLow.list( makeSymbol(
                                                                                  "STRING-TRIM" ), makeString( "string_trim" ) ), ConsesLow.list( makeSymbol( "STRING-UPCASE" ), makeString( "string_upcase" ) ), ConsesLow
                                                                                      .list( makeSymbol( "STRING/=" ), makeString( "dp_stringNE" ) ), ConsesLow.list( makeSymbol( "STRING<" ), makeString( "dp_stringL" ) ),
      ConsesLow.list( makeSymbol( "STRING<=" ), makeString( "dp_stringLE" ) ), ConsesLow.list( makeSymbol( "STRING=" ), makeString( "dp_stringE" ) ), ConsesLow.list( makeSymbol( "STRING>" ), makeString( "dp_stringG" ) ),
      ConsesLow.list( makeSymbol( "STRING>=" ), makeString( "dp_stringGE" ) ), ConsesLow.list( makeSymbol( "STRINGP" ), makeString( "dp_stringp" ) ), ConsesLow.list( makeSymbol( "SUBLIS" ), makeString( "sublis" ) ),
      ConsesLow.list( makeSymbol( "ALIEN-NULL-PTR?", "SUBLISP" ), makeString( "alien_null_ptr_P" ) ), ConsesLow.list( makeSymbol( "ALIEN-P", "SUBLISP" ), makeString( "dp_alienp" ) ), ConsesLow.list( makeSymbol(
          "ALIEN-TYPE", "SUBLISP" ), makeString( "alien_type" ) ), ConsesLow.list( makeSymbol( "BACKUP-ARGS", "SUBLISP" ), makeString( "backup_args" ) ), ConsesLow.list( makeSymbol( "BAD-FORMAT-DIRECTIVE", "SUBLISP" ),
              makeString( "bad_format_directive" ) ), ConsesLow.list( makeSymbol( "CALL-FORMAT-DIRECTIVE", "SUBLISP" ), makeString( "call_format_directive" ) ), ConsesLow.list( makeSymbol( "CHECK-FLAGS", "SUBLISP" ),
                  makeString( "check_flags" ) ), ConsesLow.list( makeSymbol( "DECLARATION-INFORMATION", "SUBLISP" ), makeString( "declaration_information" ) ), ConsesLow.list( makeSymbol( "END-OF-FILE-ERROR",
                      "SUBLISP" ), makeString( "end_of_file_error" ) ), ConsesLow.list( makeSymbol( "FIND-DIRECTIVE", "SUBLISP" ), makeString( "find_directive" ) ), ConsesLow.list( makeSymbol( "FORMAT-CARDINAL",
                          "SUBLISP" ), makeString( "format_cardinal" ) ), ConsesLow.list( makeSymbol( "FORMAT-CARDINAL-INTERNAL", "SUBLISP" ), makeString( "format_cardinal_internal" ) ), ConsesLow.list( makeSymbol(
                              "FORMAT-DIRECTIVE-P", "SUBLISP" ), makeString( "format_directive_p" ) ), ConsesLow.list( makeSymbol( "FORMAT-INTEGER", "SUBLISP" ), makeString( "format_integer" ) ), ConsesLow.list(
                                  makeSymbol( "FORMAT-INTEGER-INTERNAL", "SUBLISP" ), makeString( "format_integer_internal" ) ), ConsesLow.list( makeSymbol( "FORMAT-INTERNAL", "SUBLISP" ), makeString(
                                      "format_internal" ) ), ConsesLow.list( makeSymbol( "FORMAT-ITERATION", "SUBLISP" ), makeString( "format_iteration" ) ), ConsesLow.list( makeSymbol( "FORMAT-ORDINAL", "SUBLISP" ),
                                          makeString( "format_ordinal" ) ), ConsesLow.list( makeSymbol( "FORMAT-PADDED", "SUBLISP" ), makeString( "format_padded" ) ), ConsesLow.list( makeSymbol( "FORMAT-REPEAT",
                                              "SUBLISP" ), makeString( "format_repeat" ) ), ConsesLow.list( makeSymbol( "FORMAT-SUBLIST-ITERATION", "SUBLISP" ), makeString( "format_sublist_iteration" ) ), ConsesLow.list(
                                                  makeSymbol( "FORMAT-TYPEP", "SUBLISP" ), makeString( "format_typep" ) ), ConsesLow.list( makeSymbol( "GETHASH-BUCKET", "SUBLISP" ), makeString( "gethash_bucket" ) ),
      ConsesLow.list( makeSymbol( "ILLEGAL-DIRECTIVE", "SUBLISP" ), makeString( "illegal_directive" ) ), ConsesLow.list( makeSymbol( "MATCHING-BRACKET", "SUBLISP" ), makeString( "matching_bracket" ) ), ConsesLow.list(
          makeSymbol( "MATCHING-BRACKET-NOT-FOUND", "SUBLISP" ), makeString( "matching_bracket_not_found" ) ), ConsesLow.list( makeSymbol( "NOT-A-FORMAT-CONTROL", "SUBLISP" ), makeString( "not_a_format_control" ) ),
      ConsesLow.list( makeSymbol( "NOT-A-LIST-ARGUMENT", "SUBLISP" ), makeString( "not_a_list_argument" ) ), ConsesLow.list( makeSymbol( "NOT-ENOUGH-FORMAT-ARGUMENTS", "SUBLISP" ), makeString(
          "not_enough_format_arguments" ) ), ConsesLow.list( makeSymbol( "PARSE-FORMAT-COMMAND", "SUBLISP" ), makeString( "parse_format_command" ) ), ConsesLow.list( makeSymbol( "POSSIBLY-NOTE-FUNCTION-ENTRY",
              "SUBLISP" ), makeString( "f_possibly_note_function_entry" ) ), ConsesLow.list( makeSymbol( "REALLY-FORMAT", "SUBLISP" ), makeString( "really_format" ) ), ConsesLow.list( makeSymbol(
                  "REPITITION-DESIGNATOR-VALUE", "SUBLISP" ), makeString( "repitition_designator_value" ) ), ConsesLow.list( makeSymbol( "ROUND-DIGITS", "SUBLISP" ), makeString( "round_digits" ) ), ConsesLow.list(
                      makeSymbol( "SPLIT-FLONUM-DIGITS", "SUBLISP" ), makeString( "split_flonum_digits" ) ), ConsesLow.list( makeSymbol( "STREAM-LINE-COLUMN", "SUBLISP" ), makeString( "stream_line_column" ) ), ConsesLow
                          .list( makeSymbol( "STREAM-LINE-COLUMN", "SUBLISP" ), makeString( "stream_line_column" ) ), ConsesLow.list( makeSymbol( "SXHASH-ROT", "SUBLISP" ), makeString( "sxhash_rot" ) ), ConsesLow.list(
                              makeSymbol( "UNIMPLEMENTED-FORMAT-DIRECTIVE", "SUBLISP" ), makeString( "unimplemented_format_directive" ) ), ConsesLow.list( makeSymbol( "SUBSEQ" ), makeString( "subseq" ) ), ConsesLow.list(
                                  makeSymbol( "SUBSETP" ), makeString( "dp_subsetp" ) ), ConsesLow.list( makeSymbol( "SUBST" ), makeString( "subst" ) ), ConsesLow.list( makeSymbol( "SUBST-IF" ), makeString(
                                      "subst_if" ) ), ConsesLow.list( makeSymbol( "SUBSTITUTE" ), makeString( "substitute" ) ), ConsesLow.list( makeSymbol( "SUBSTITUTE-IF" ), makeString( "substitute_if" ) ), ConsesLow
                                          .list( makeSymbol( "SXHASH" ), makeString( "sxhash" ) ), ConsesLow.list( makeSymbol( "SYMBOL-FUNCTION" ), makeString( "symbol_function" ) ), ConsesLow.list( makeSymbol(
                                              "SYMBOL-NAME" ), makeString( "symbol_name" ) ), ConsesLow.list( makeSymbol( "SYMBOL-PACKAGE" ), makeString( "symbol_package" ) ), ConsesLow.list( makeSymbol(
                                                  "SYMBOL-PLIST" ), makeString( "symbol_plist" ) ), ConsesLow.list( makeSymbol( "SYMBOL-VALUE" ), makeString( "symbol_value" ) ), ConsesLow.list( makeSymbol( "SYMBOLP" ),
                                                      makeString( "dp_symbolp" ) ), ConsesLow.list( makeSymbol( "SYNONYM-STREAM-SYMBOL" ), makeString( "synonym_stream_symbol" ) ), ConsesLow.list( makeSymbol( "TAILP" ),
                                                          makeString( "dp_tailp" ) ), ConsesLow.list( makeSymbol( "TAN" ), makeString( "sublisp_tan" ) ), ConsesLow.list( makeSymbol( "TENTH" ), makeString( "tenth" ) ),
      ConsesLow.list( makeSymbol( "TERPRI" ), makeString( "terpri" ) ), ConsesLow.list( makeSymbol( "THIRD" ), makeString( "third" ) ), ConsesLow.list( makeSymbol( "THROW" ), makeString( "sublisp_throw" ) ), ConsesLow
          .list( makeSymbol( "TIME-HAS-ARRIVED?" ), makeString( "time_has_arrived_p" ) ), ConsesLow.list( makeSymbol( "TREE-EQUAL" ), makeString( "dp_tree_equal" ) ), ConsesLow.list( makeSymbol( "TRUE" ), makeString(
              "sublisp_true" ) ), ConsesLow.list( makeSymbol( "TRUNCATE" ), makeString( "sublisp_truncate" ) ), ConsesLow.list( makeSymbol( "TWO-WAY-STREAM-INPUT-STREAM" ), makeString( "two_way_stream_input_stream" ) ),
      ConsesLow.list( makeSymbol( "TWO-WAY-STREAM-OUTPUT-STREAM" ), makeString( "two_way_stream_output_stream" ) ), ConsesLow.list( makeSymbol( "TYPE-OF" ), makeString( "sublisp_type_of" ) ), ConsesLow.list( makeSymbol(
          "UNINTERN" ), makeString( "unintern" ) ), ConsesLow.list( makeSymbol( "UNION" ), makeString( "sublisp_union" ) ), ConsesLow.list( makeSymbol( "UNREAD-CHAR" ), makeString( "unread_char" ) ), ConsesLow.list(
              makeSymbol( "UPPER-CASE-P" ), makeString( "dp_upper_case_p" ) ), ConsesLow.list( makeSymbol( "USER-CONFIRM" ), makeString( "user_confirm" ) ), ConsesLow.list( makeSymbol( "VALID-PROCESS-P" ), makeString(
                  "valid_process_p" ) ), ConsesLow.list( makeSymbol( "VALUES" ), makeString( "values" ) ), ConsesLow.list( makeSymbol( "VARIABLE-INFORMATION" ), makeString( "variable_information" ) ), ConsesLow.list(
                      makeSymbol( "VECTOR" ), makeString( "sublisp_vector" ) ), ConsesLow.list( makeSymbol( "VECTORP" ), makeString( "dp_vectorp" ) ), ConsesLow.list( makeSymbol( "VISIT-DEFSTRUCT" ), makeString(
                          "f_visit_defstruct" ) ), ConsesLow.list( makeSymbol( "WARN" ), makeString( "sublisp_warn" ) ), ConsesLow.list( makeSymbol( "WRITE" ), makeString( "write_g" ) ), ConsesLow.list( makeSymbol(
                              "WRITE-BYTE" ), makeString( "write_byte" ) ), ConsesLow.list( makeSymbol( "WRITE-CHAR" ), makeString( "write_char" ) ), ConsesLow.list( makeSymbol( "WRITE-IMAGE" ), makeString(
                                  "write_image" ) ), ConsesLow.list( makeSymbol( "WRITE-LINE" ), makeString( "write_line" ) ), ConsesLow.list( makeSymbol( "WRITE-SEQUENCE" ), makeString( "write_sequence" ) ), ConsesLow
                                      .list( makeSymbol( "WRITE-STRING" ), makeString( "write_string" ) ), ConsesLow.list( makeSymbol( "WRITE-TO-STRING" ), makeString( "write_to_string_g" ) ), ConsesLow.list( makeSymbol(
                                          "ZEROP" ), makeString( "dp_zerop" ) ), ConsesLow.list( makeSymbol( "DECLARE-FOREIGN-SHARED-LIBRARY", "SUBLISP" ), makeString( "f_declare_foreign_shared_library" ) ), ConsesLow
                                              .list( makeSymbol( "DEFINE-FOREIGN-FUNCTION-INTERNAL", "SUBLISP" ), makeString( "f_define_foreign_function_internal" ) ), ConsesLow.list( makeSymbol(
                                                  "FOREIGN-SHARED-LIBRARY-INSTALLED?", "SUBLISP" ), makeString( "f_foreign_shared_library_installedP" ) ), ConsesLow.list( makeSymbol(
                                                      "ENSURE-FOREIGN-SHARED-LIBRARY-LOADED", "SUBLISP" ), makeString( "f_ensure_foreign_shared_library_loaded" ) ), ConsesLow.list( makeSymbol( "VECTOR-FOR-MARSHALLING",
                                                          "SUBLISP" ), makeString( "f_vector_for_marshalling" ) ), ConsesLow.list( makeSymbol( "CDESTRUCTURING-BIND-ERROR", "SUBLISP" ), makeString(
                                                              "f_cdestructuring_bind_error" ) ), ConsesLow.list( makeSymbol( "DESTRUCTURING-BIND-MUST-CONSP", "SUBLISP" ), makeString(
                                                                  "f_destructuring_bind_must_consp" ) ), ConsesLow.list( makeSymbol( "DESTRUCTURING-BIND-MUST-LISTP", "SUBLISP" ), makeString(
                                                                      "f_destructuring_bind_must_listp" ) ), ConsesLow.list( makeSymbol( "PROPERTY-LIST-MEMBER", "SUBLISP" ), makeString( "f_property_list_member" ) ),
      ConsesLow.list( makeSymbol( "PRINT-UNREADABLE-OBJECT-PREAMBLE", "SUBLISP" ), makeString( "f_print_unreadable_object_preamble" ) ), ConsesLow.list( makeSymbol( "PRINT-UNREADABLE-OBJECT-POSTAMBLE", "SUBLISP" ),
          makeString( "f_print_unreadable_object_postamble" ) ), ConsesLow.list( makeSymbol( "BQ-CONS" ), makeString( "f_bq_cons" ) ), ConsesLow.list( makeSymbol( "BQ-VECTOR" ), makeString( "f_bq_vector" ) ), ConsesLow
              .list( makeSymbol( "DEFSTRUCT-ANALYZE", "SUBLISP" ), makeString( "f_defstruct_analyze" ) ), ConsesLow.list( makeSymbol( "JAVA-CALL" ), makeString( "java_call" ) ), ConsesLow.list( makeSymbol(
                  "JAVA-CLASS" ), makeString( "java_class" ) ), ConsesLow.list( makeSymbol( "JAVA-CONSTRUCTOR" ), makeString( "java_constructor" ) ), ConsesLow.list( makeSymbol( "JAVA-METHOD" ), makeString(
                      "java_method" ) ), ConsesLow.list( makeSymbol( "JAVA-NEW" ), makeString( "java_new" ) ), ConsesLow.list( makeSymbol( "JAVA-OBJECT-P" ), makeString( "java_object_p" ) ), ConsesLow.list( makeSymbol(
                          "JAVA-STATIC" ), makeString( "java_static" ) )
    } );
  }

  private static SubLObject _constant_1_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "OPEN" ), makeString( "open_g" ), ConsesLow.list( makeSymbol( "FILESPEC" ), makeSymbol( "&REST" ), makeSymbol( "KEYS" ) ) ), ConsesLow.list(
        makeSymbol( "%B-CHECK-TYPE" ), makeString( "CHECK_TYPE" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "TYPE" ) ) ), ConsesLow.list( makeSymbol( "%B-ENFORCE-TYPE" ), makeString( "ENFORCE_TYPE" ),
            ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "TYPE" ) ) ), ConsesLow.list( makeSymbol( "%BEGIN-WITH-PROCESS-RESOURCE-TRACKING" ), makeString( "BEGIN_WITH_PROCESS_RESOURCE_TRACKING" ), ConsesLow.list(
                makeSymbol( "ENV" ), makeSymbol( "RESULT" ) ) ), ConsesLow.list( makeSymbol( "%BIND" ), makeString( "BIND" ), ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "VAL" ) ) ), ConsesLow.list( makeSymbol(
                    "%BIND-SPECIAL-VARS" ), makeString( "BIND_SPECIAL_VARS" ), ConsesLow.list( makeSymbol( "SPECIAL-VARS" ), makeSymbol( "BINDINGS" ) ) ), ConsesLow.list( makeSymbol( "%BTD" ), makeString( "BTD" ),
                        ConsesLow.list( makeSymbol( "OBJ" ) ) ), ConsesLow.list( makeSymbol( "%CATCH-VALUE" ), makeString( "CATCH_VALUE" ), NIL ), ConsesLow.list( makeSymbol( "%CBIG" ), makeString( "CBIG" ), ConsesLow
                            .list( makeSymbol( "INTEGER" ) ) ), ConsesLow.list( makeSymbol( "%CCHAR" ), makeString( "CCHAR" ), ConsesLow.list( makeSymbol( "CODE" ) ) ), ConsesLow.list( makeSymbol( "%CFIX" ), makeString(
                                "CFIX" ), ConsesLow.list( makeSymbol( "FIXNUM" ) ) ), ConsesLow.list( makeSymbol( "%CFLOAT" ), makeString( "CFLOAT" ), ConsesLow.list( makeSymbol( "FLOAT" ) ) ), ConsesLow.list(
                                    makeSymbol( "%CGUID" ), makeString( "CGUID" ), ConsesLow.list( makeSymbol( "STRING" ) ) ), ConsesLow.list( makeSymbol( "%CINTERN" ), makeString( "CINTERN" ), ConsesLow.list(
                                        makeSymbol( "STRING" ) ) ), ConsesLow.list( makeSymbol( "%CKEYWORD" ), makeString( "CKEYWORD" ), ConsesLow.list( makeSymbol( "STRING" ) ) ), ConsesLow.list( makeSymbol(
                                            "%CMAKE-SYMBOL" ), makeString( "CMAKE_SYMBOL" ), ConsesLow.list( makeSymbol( "STRING" ) ) ), ConsesLow.list( makeSymbol( "%CPACKAGE" ), makeString( "CPACKAGE" ), ConsesLow
                                                .list( makeSymbol( "STRING" ) ) ), ConsesLow.list( makeSymbol( "%CSTRING" ), makeString( "CSTRING" ), ConsesLow.list( makeSymbol( "STRING" ) ) ), ConsesLow.list(
                                                    makeSymbol( "%CSYMBOL" ), makeString( "CSYMBOL" ), ConsesLow.list( makeSymbol( "SYMBOL-NAME" ), makeSymbol( "PACKAGE-NAME" ) ) ), ConsesLow.list( makeSymbol(
                                                        "%CDO-SYMBOLS-END" ), makeString( "CDO_SYMBOLS_DONE" ), ConsesLow.list( makeSymbol( "PKG-VAR" ), makeSymbol( "ITERATOR-VAR" ) ) ), ConsesLow.list( makeSymbol(
                                                            "%CDO-SYMBOLS-LOOP" ), makeString( "CDO_SYMBOLS_LOOP_DEFAULT" ), ConsesLow.list( makeSymbol( "SYM-VAR" ), makeSymbol( "ITERATOR-VAR" ) ) ), ConsesLow.list(
                                                                makeSymbol( "%CDO-SYMBOLS-SETUP" ), makeString( "CDO_SYMBOLS_SETUP" ), ConsesLow.list( makeSymbol( "PKG-VAR" ), makeSymbol( "ITERATOR-VAR" ) ) ), ConsesLow
                                                                    .list( makeSymbol( "%CDOHASH-BEGIN" ), makeString( "CDOHASH_BEGIN" ), ConsesLow.list( makeSymbol( "KEY-VAR" ), makeSymbol( "OBJ-VAR" ), makeSymbol(
                                                                        "TABLE-FORM" ), makeSymbol( "TABLE-VAR" ), makeSymbol( "INDEX-VAR" ) ) ), ConsesLow.list( makeSymbol( "%CDOHASH-END" ), makeString( "CDOHASH_END" ),
                                                                            ConsesLow.list( makeSymbol( "KEY-VAR" ), makeSymbol( "OBJ-VAR" ), makeSymbol( "TABLE-VAR" ), makeSymbol( "INDEX-VAR" ) ) ), ConsesLow.list(
                                                                                makeSymbol( "%CDOLIST-BEGIN" ), makeString( "CDOLIST_BEGIN" ), ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "INIT-FORM" ), makeSymbol(
                                                                                    "CDOLIST-VAR" ) ) ), ConsesLow.list( makeSymbol( "%CDOLIST-END" ), makeString( "CDOLIST_END" ), ConsesLow.list( makeSymbol( "VAR" ) ) ),
      ConsesLow.list( makeSymbol( "%CDOTIMES-BEGIN" ), makeString( "CDOTIMES_BEGIN" ), ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "INIT-FORM" ), makeSymbol( "CDOTIMES-VAR" ) ) ), ConsesLow.list( makeSymbol(
          "%CDOTIMES-END" ), makeString( "CDOTIMES_END" ), ConsesLow.list( makeSymbol( "VAR" ) ) ), ConsesLow.list( makeSymbol( "%CSOME-BEGIN" ), makeString( "CSOME_BEGIN" ), ConsesLow.list( makeSymbol( "VAR" ),
              makeSymbol( "INIT-FORM" ), makeSymbol( "DONE-FORM" ), makeSymbol( "CSOME-VAR" ) ) ), ConsesLow.list( makeSymbol( "%CSOME-END" ), makeString( "CSOME_END" ), ConsesLow.list( makeSymbol( "VAR" ) ) ), ConsesLow
                  .list( makeSymbol( "%DP-CHECK-TYPE" ), makeString( "DP_CHECK_TYPE" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "TYPE" ) ) ), ConsesLow.list( makeSymbol( "%DP-ENFORCE-TYPE" ), makeString(
                      "DP_ENFORCE_TYPE" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "TYPE" ) ) ), ConsesLow.list( makeSymbol( "%DTB" ), makeString( "DTB" ), ConsesLow.list( makeSymbol( "OBJ" ) ) ), ConsesLow
                          .list( makeSymbol( "%DYN" ), makeString( "DYN" ), ConsesLow.list( makeSymbol( "VAR" ) ) ), ConsesLow.list( makeSymbol( "%END-PRINTING-OBJECT" ), makeString( "END_PRINTING_OBJECT" ), ConsesLow
                              .list( makeSymbol( "OBJECT" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "%END-WITH-PROCESS-RESOURCE-TRACKING" ), makeString( "END_WITH_PROCESS_RESOURCE_TRACKING" ), ConsesLow
                                  .list( makeSymbol( "ENV" ), makeSymbol( "RESULT" ) ) ), ConsesLow.list( makeSymbol( "%FINISH-CATCH" ), makeString( "FINISH_CATCH" ), ConsesLow.list( makeSymbol( "TAG" ), makeSymbol(
                                      "ENV" ) ) ), ConsesLow.list( makeSymbol( "%FINISH-UNWIND" ), makeString( "FINISH_UNWIND" ), ConsesLow.list( makeSymbol( "ENV" ) ) ), ConsesLow.list( makeSymbol(
                                          "%FORMAT-0A-DIRECTIVE" ), makeString( "format_0a_directive" ), ConsesLow.list( new SubLObject[]
                                          { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ), makeSymbol( "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ),
                                            makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-24-DIRECTIVE" ), makeString( "format_24_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ),
        makeSymbol( "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-25-DIRECTIVE" ), makeString( "format_25_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ),
        makeSymbol( "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-26-DIRECTIVE" ), makeString( "format_26_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ),
        makeSymbol( "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-28-DIRECTIVE" ), makeString( "format_28_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ),
        makeSymbol( "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-29-DIRECTIVE" ), makeString( "format_29_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ),
        makeSymbol( "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-2A-DIRECTIVE" ), makeString( "format_2a_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ),
        makeSymbol( "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-2F-DIRECTIVE" ), makeString( "format_2f_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ),
        makeSymbol( "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-3B-DIRECTIVE" ), makeString( "format_3b_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ),
        makeSymbol( "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-3C-DIRECTIVE" ), makeString( "format_3c_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ),
        makeSymbol( "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-3E-DIRECTIVE" ), makeString( "format_3e_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ),
        makeSymbol( "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-3F-DIRECTIVE" ), makeString( "format_3f_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ),
        makeSymbol( "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-5B-DIRECTIVE" ), makeString( "format_5b_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ),
        makeSymbol( "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-5D-DIRECTIVE" ), makeString( "format_5d_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ),
        makeSymbol( "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-5E-DIRECTIVE" ), makeString( "format_5e_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ),
        makeSymbol( "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-5F-DIRECTIVE" ), makeString( "format_5f_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ),
        makeSymbol( "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-7B-DIRECTIVE" ), makeString( "format_7b_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ),
        makeSymbol( "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-7C-DIRECTIVE" ), makeString( "format_7c_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ),
        makeSymbol( "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-7D-DIRECTIVE" ), makeString( "format_7d_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ),
        makeSymbol( "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-7E-DIRECTIVE" ), makeString( "format_7e_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ),
        makeSymbol( "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-A-DIRECTIVE" ), makeString( "format_a_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ), makeSymbol(
          "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-B-DIRECTIVE" ), makeString( "format_b_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ), makeSymbol(
          "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-C-DIRECTIVE" ), makeString( "format_c_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ), makeSymbol(
          "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-D-DIRECTIVE" ), makeString( "format_d_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ), makeSymbol(
          "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-E-DIRECTIVE" ), makeString( "format_e_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ), makeSymbol(
          "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-F-DIRECTIVE" ), makeString( "format_f_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ), makeSymbol(
          "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-G-DIRECTIVE" ), makeString( "format_g_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ), makeSymbol(
          "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-I-DIRECTIVE" ), makeString( "format_i_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ), makeSymbol(
          "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-O-DIRECTIVE" ), makeString( "format_o_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ), makeSymbol(
          "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-P-DIRECTIVE" ), makeString( "format_p_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ), makeSymbol(
          "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-R-DIRECTIVE" ), makeString( "format_r_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ), makeSymbol(
          "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-S-DIRECTIVE" ), makeString( "format_s_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ), makeSymbol(
          "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-T-DIRECTIVE" ), makeString( "format_t_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ), makeSymbol(
          "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-W-DIRECTIVE" ), makeString( "format_w_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ), makeSymbol(
          "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "%FORMAT-X-DIRECTIVE" ), makeString( "format_x_directive" ), ConsesLow.list( new SubLObject[] { makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "START" ), makeSymbol(
          "END" ), makeSymbol( "ARGS" ), makeSymbol( "ALL-ARGS" ), makeSymbol( "PARAMETERS" ), makeSymbol( "AT-SIGN-P" ), makeSymbol( "COLONP" )
      } ) ), ConsesLow.list( makeSymbol( "GET-STATIC-AREA" ), makeString( "get_static_area" ) ), ConsesLow.list( makeSymbol( "GET-THREAD-PRIVATE-AREA" ), makeString( "get_thread-private_area" ) ), ConsesLow.list(
          makeSymbol( "GET-WORKING-AREA" ), makeString( "get_working_area" ) ), ConsesLow.list( makeSymbol( "%HASH-INDEX-KEY", "SUBLISP" ), makeString( "HASH_INDEX_KEY" ), ConsesLow.list( makeSymbol( "TABLE" ),
              makeSymbol( "INDEX" ) ) ), ConsesLow.list( makeSymbol( "%HASH-INDEX-OBJ", "SUBLISP" ), makeString( "HASH_INDEX_OBJ" ), ConsesLow.list( makeSymbol( "TABLE" ), makeSymbol( "INDEX" ) ) ), ConsesLow.list(
                  makeSymbol( "%INIT-OPT-ARG" ), makeString( "INIT_OPT_ARG" ), ConsesLow.list( makeSymbol( "ARG" ), makeSymbol( "VAL" ) ) ), ConsesLow.list( makeSymbol( "%LEX" ), makeString( "LEX" ), ConsesLow.list(
                      makeSymbol( "VAR" ) ) ), ConsesLow.list( makeSymbol( "%MULTIPLE-VALUE-LIST" ), makeString( "MULTIPLE_VALUE_LIST" ), ConsesLow.list( makeSymbol( "EXPRESSION" ) ) ), ConsesLow.list( makeSymbol(
                          "%MVAL" ), makeString( "MVAL" ), ConsesLow.list( makeSymbol( "N" ) ) ), ConsesLow.list( makeSymbol( "%MVAL-COUNT" ), makeString( "MVAL_COUNT" ), NIL ), ConsesLow.list( makeSymbol(
                              "%NEXT-HASH-INDEX", "SUBLISP" ), makeString( "NEXT_HASH_INDEX" ), ConsesLow.list( makeSymbol( "TABLE" ), makeSymbol( "INDEX" ) ) ), ConsesLow.list( makeSymbol( "%NOTE-SUPPLIED" ),
                                  makeString( "NOTE_SUPPLIED" ), ConsesLow.list( makeSymbol( "VAR" ) ) ), ConsesLow.list( makeSymbol( "%NTH-VALUE" ), makeString( "NTH_VALUE" ), ConsesLow.list( makeSymbol( "N" ),
                                      makeSymbol( "FORM" ) ) ), ConsesLow.list( makeSymbol( "PRINT-NOT-READABLE" ), makeString( "print_not_readable" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "STREAM" ) ) ),
      ConsesLow.list( makeSymbol( "%PROCLAIM" ), makeString( "PROCLAIM" ), ConsesLow.list( makeSymbol( "DECL" ) ) ), ConsesLow.list( makeSymbol( "%REBIND" ), makeString( "REBIND" ), ConsesLow.list( makeSymbol(
          "VAR" ) ) ), ConsesLow.list( makeSymbol( "%REBIND-SPECIAL-VARS" ), makeString( "REBIND_SPECIAL_VARS" ), ConsesLow.list( makeSymbol( "SPECIAL-VARS" ) ) ), ConsesLow.list( makeSymbol( "%RESET-MVAL" ), makeString(
              "RESET_MVAL" ), NIL ), ConsesLow.list( makeSymbol( "%SET-CATCH" ), makeString( "SET_CATCH" ), ConsesLow.list( makeSymbol( "TAG" ), makeSymbol( "ENV" ) ) ), ConsesLow.list( makeSymbol( "%SET-DYN" ),
                  makeString( "SET_DYN" ), ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "VAL" ) ) ), ConsesLow.list( makeSymbol( "%SET-LEX" ), makeString( "SET_LEX" ), ConsesLow.list( makeSymbol( "VAR" ), makeSymbol(
                      "VAL" ) ) ), ConsesLow.list( makeSymbol( "%SET-UNWIND" ), makeString( "SET_UNWIND" ), ConsesLow.list( makeSymbol( "ENV" ) ) ), ConsesLow.list( makeSymbol( "%START-PRINTING-OBJECT" ), makeString(
                          "START_PRINTING_OBJECT" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "%START-UNWIND" ), makeString( "START_UNWIND" ), ConsesLow.list(
                              makeSymbol( "ENV" ) ) ), ConsesLow.list( makeSymbol( "%THROWN-TO" ), makeString( "DP_THROWN_TO" ), ConsesLow.list( makeSymbol( "ENV" ) ) ), ConsesLow.list( makeSymbol( "IN-PACKAGE" ),
                                  makeString( "in_package" ), ConsesLow.list( makeSymbol( "NAME" ) ) ), ConsesLow.list( makeSymbol( "%CLEAR-GC-RESOURCE-ACCUMULATOR", "SUBLISP" ), makeString(
                                      "sublisp_clear_gc_resource_accumulator" ), NIL ), ConsesLow.list( makeSymbol( "%CURRENT-GC-RESOURCE-ACCUMULATOR", "SUBLISP" ), makeString(
                                          "sublisp_current_gc_resource_accumulator" ), NIL ), ConsesLow.list( makeSymbol( "%GET-INITIAL-CONTINUATION", "SUBLISP" ), makeString( "_get_initial_continuation" ), NIL ),
      ConsesLow.list( makeSymbol( "%GET-RED-OBJECT", "SUBLISP" ), makeString( "_get_red_object" ), NIL ), ConsesLow.list( makeSymbol( "%INTERPRET-CSPACE-RESULTS", "SUBLISP" ), makeString(
          "sublisp_interpret_cspace_results" ), ConsesLow.list( makeSymbol( "PROBE" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "%SET-INITIAL-CONTINUATION", "SUBLISP" ), makeString(
              "_set_initial_continuation" ), ConsesLow.list( makeSymbol( "FUNCTIONSPEC" ) ) ), ConsesLow.list( makeSymbol( "ADD-SPACE-PROBE", "SUBLISP" ), makeString( "add_space_probe" ), NIL ), ConsesLow.list(
                  makeSymbol( "ALIEN-AS-STRING", "SUBLISP" ), makeString( "alien_as_string" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "CANONICAL-NULL-FILE-STREAM-PATH", "SUBLISP" ),
                      makeString( "canonical_null_file_stream_path" ) ), ConsesLow.list( makeSymbol( "CIRCULAR-REFERENCE-P", "SUBLISP" ), makeString( "circular_reference_p" ), ConsesLow.list( makeSymbol( "OBJECT" ),
                          makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "DEF-FOREIGN-FUNCTION", "SUBLISP" ), makeString( "sublisp_def_foreign_function" ), ConsesLow.list( makeSymbol( "FOREIGN-SHARED-LIBRARY" ),
                              makeSymbol( "FOREIGN-NAME" ), makeSymbol( "SYMBOL" ), makeSymbol( "ARG-CONVERSION" ), makeSymbol( "RET-TYPE" ), makeSymbol( "CALLING-CONVENTION" ), makeSymbol( "NULL-DEFAULT-RETURN" ) ) ),
      ConsesLow.list( makeSymbol( "DESCRIPTOR-STREAM-CLOSE", "SUBLISP" ), makeString( "descriptor_stream_close" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "ABORT" ) ) ), ConsesLow.list( makeSymbol(
          "DESCRIPTOR-STREAM-FILE-LENGTH", "SUBLISP" ), makeString( "descriptor_stream_file_length" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "DESCRIPTOR-STREAM-FILE-POSITION",
              "SUBLISP" ), makeString( "descriptor_stream_file_position" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "DESCRIPTOR-STREAM-NEXT-INPUT-BUFFER", "SUBLISP" ), makeString(
                  "descriptor_stream_next_input_buffer" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "WAITP" ) ) ), ConsesLow.list( makeSymbol( "DESCRIPTOR-STREAM-SEND-OUTPUT-BUFFER", "SUBLISP" ), makeString(
                      "descriptor_stream_send_output_buffer" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "DESCRIPTOR-STREAM-SET-FILE-POSITION", "SUBLISP" ), makeString(
                          "descriptor_stream_set_file_position" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "POSITION-SPEC" ) ) ), ConsesLow.list( makeSymbol( "ENCODE-UNIVERSAL-TIME-INTERNAL", "SUBLISP" ),
                              makeString( "encode_universal_time_internal" ), ConsesLow.list( makeSymbol( "SECOND" ), makeSymbol( "MINUTE" ), makeSymbol( "HOUR" ), makeSymbol( "DATE" ), makeSymbol( "MONTH" ), makeSymbol(
                                  "YEAR" ), makeSymbol( "TIME-ZONE" ) ) ), ConsesLow.list( makeSymbol( "EXTERNAL-PROCESSES-SUPPORTED?", "SUBLISP" ), makeString( "external_processes_supportedP" ), NIL ), ConsesLow.list(
                                      makeSymbol( "FILE-POINTER-STREAM-CLOSE", "SUBLISP" ), makeString( "file_pointer_stream_close" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "ABORT" ) ) ), ConsesLow.list(
                                          makeSymbol( "FILE-POINTER-STREAM-FILE-LENGTH", "SUBLISP" ), makeString( "file_pointer_stream_file_length" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list(
                                              makeSymbol( "FILE-POINTER-STREAM-FILE-POSITION", "SUBLISP" ), makeString( "file_pointer_stream_file_position" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list(
                                                  makeSymbol( "FILE-POINTER-STREAM-NEXT-INPUT-BUFFER", "SUBLISP" ), makeString( "file_pointer_stream_next_input_buffer" ), ConsesLow.list( makeSymbol( "STREAM" ),
                                                      makeSymbol( "WAITP" ) ) ), ConsesLow.list( makeSymbol( "FILE-POINTER-STREAM-SEND-OUTPUT-BUFFER", "SUBLISP" ), makeString( "file_pointer_stream_send_output_buffer" ),
                                                          ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "FILE-POINTER-STREAM-SET-FILE-POSITION", "SUBLISP" ), makeString(
                                                              "file_pointer_stream_set_file_position" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "POSITION-SPEC" ) ) ), ConsesLow.list( makeSymbol(
                                                                  "FOLLOW-SYNONYM-STREAM", "SUBLISP" ), makeString( "follow_synonym_stream" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol(
                                                                      "GET-EXTERNAL-PROCESS-STATUS", "SUBLISP" ), makeString( "get_external_process_status" ), ConsesLow.list( makeSymbol( "PROCESS-ID" ), makeSymbol(
                                                                          "&OPTIONAL" ), makeSymbol( "WAIT-UNTIL-DONE?" ) ) ), ConsesLow.list( makeSymbol( "GET-TIME", "SUBLISP" ), makeString( "get_time" ), NIL ),
      ConsesLow.list( makeSymbol( "GET-TIMEZONE", "SUBLISP" ), makeString( "get_timezone" ), ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "UNIVERSAL-TIME" ) ) ), ConsesLow.list( makeSymbol(
          "HANDLE-CIRCULARITY", "SUBLISP" ), makeString( "handle_circularity" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "ILLEGAL-STREAM-OPERATION", "SUBLISP" ),
              makeString( "illegal_stream_operation" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "OPERATION" ) ) ), ConsesLow.list( makeSymbol( "INHIBIT-PREEMPTION-P", "SUBLISP" ), makeString(
                  "inhibit_preemption_p" ), NIL ), ConsesLow.list( makeSymbol( "INPUT-STREAM-DESIGNATOR-STREAM", "SUBLISP" ), makeString( "input_stream_designator_stream" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ),
      ConsesLow.list( makeSymbol( "INTERNED-SYMBOLP", "SUBLISP" ), makeString( "interned_symbolp" ), ConsesLow.list( makeSymbol( "SYMBOL" ) ) ), ConsesLow.list( makeSymbol( "JVM-CALL", "SUBLISP" ), makeString(
          "f_jvm_call" ), ConsesLow.list( makeSymbol( "FUNC" ), makeSymbol( "STACK-FRAME" ), makeSymbol( "ARGSTART" ), makeSymbol( "ARGCNT" ) ) ), ConsesLow.list( makeSymbol( "JVMI-OPCODE-INTERPRETER", "SUBLISP" ),
              makeString( "jvmi_opcode_interpreter" ), ConsesLow.list( makeSymbol( "JVMI" ), makeSymbol( "CODE" ) ) ), ConsesLow.list( makeSymbol( "KILL-EXTERNAL-PROCESS", "SUBLISP" ), makeString(
                  "kill_external_process" ), ConsesLow.list( makeSymbol( "PROCESS-ID" ) ) ), ConsesLow.list( makeSymbol( "LOAD-SHARED-OBJECT", "SUBLISP" ), makeString( "sublisp_load_shared_object" ), ConsesLow.list(
                      makeSymbol( "MONIKER" ), makeSymbol( "PATHNAME" ), makeSymbol( "OPTIONS" ) ) ), ConsesLow.list( makeSymbol( "MAKE-DESCRIPTOR-STREAM", "SUBLISP" ), makeString( "make_descriptor_stream" ), ConsesLow
                          .list( makeSymbol( "DESCRIPTOR" ), makeSymbol( "DIRECTION" ), makeSymbol( "ELEMENT-TYPE" ) ) ), ConsesLow.list( makeSymbol( "MAKE-GUID-BLOCK", "SUBLISP" ), makeString( "make_block_of_guids" ) ),
      ConsesLow.list( makeSymbol( "MAKE-PRIVATE-DESCRIPTOR-STREAM", "SUBLISP" ), makeString( "make_private_descriptor_stream" ), ConsesLow.list( makeSymbol( "DESCRIPTOR" ), makeSymbol( "DIRECTION" ), makeSymbol(
          "ELEMENT-TYPE" ) ) ), ConsesLow.list( makeSymbol( "MAKE-STREAM", "SUBLISP" ), makeString( "make_stream" ), ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "ARGLIST" ) ) ), ConsesLow.list( makeSymbol(
              "MY-GETF", "SUBLISP" ), makeString( "my_getf" ), ConsesLow.list( makeSymbol( "PLIST" ), makeSymbol( "INDICATOR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DEFAULT" ) ) ), ConsesLow.list( makeSymbol(
                  "OPEN-DESCRIPTOR", "SUBLISP" ), makeString( "open_descriptor" ), ConsesLow.list( makeSymbol( "FILESPEC" ), makeSymbol( "DIRECTION" ), makeSymbol( "ELEMENT-TYPE" ), makeSymbol( "IF-EXISTS" ), makeSymbol(
                      "IF-DOES-NOT-EXIST" ), makeSymbol( "EXTERNAL-FORMAT" ) ) ), ConsesLow.list( makeSymbol( "OUTPUT-STREAM-DESIGNATOR-STREAM", "SUBLISP" ), makeString( "output_stream_designator_stream" ), ConsesLow
                          .list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "PATHNAME-DESIGNATOR-PATHNAME", "SUBLISP" ), makeString( "pathname_designator_pathname" ), ConsesLow.list( makeSymbol(
                              "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "POINTER", "SUBLISP" ), makeString( "sublisp_pointer" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol(
                                  "PRINT-BIGNUM-INTERNAL", "SUBLISP" ), makeString( "print_bignum_internal" ), ConsesLow.list( makeSymbol( "BIGNUM" ), makeSymbol( "STREAM" ), makeSymbol( "RADIX" ), makeSymbol(
                                      "DIVISOR" ), makeSymbol( "POWER-LESS-ONE" ) ) ), ConsesLow.list( makeSymbol( "PRINT-CHARACTER", "SUBLISP" ), makeString( "print_character" ), ConsesLow.list( makeSymbol(
                                          "CHARACTER" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "PRINT-CONS-CELLS", "SUBLISP" ), makeString( "print_cons_cells" ), ConsesLow.list( makeSymbol( "CONS" ),
                                              makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "PRINT-ERROR", "SUBLISP" ), makeString( "print_error" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol(
                                                  "STREAM" ) ) ), ConsesLow.list( makeSymbol( "PRINT-FLONUM", "SUBLISP" ), makeString( "print_flonum" ), ConsesLow.list( makeSymbol( "FLONUM" ), makeSymbol( "STREAM" ) ) ),
      ConsesLow.list( makeSymbol( "PRINT-FUNCTION", "SUBLISP" ), makeString( "print_function" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "PRINT-HASHTABLE",
          "SUBLISP" ), makeString( "print_hashtable" ), ConsesLow.list( makeSymbol( "HASH-TABLE" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "PRINT-INTEGER", "SUBLISP" ), makeString( "print_integer" ),
              ConsesLow.list( makeSymbol( "INTEGER" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "PRINT-INTEGER-INTERNAL", "SUBLISP" ), makeString( "print_integer_internal" ), ConsesLow.list( makeSymbol(
                  "INTEGER" ), makeSymbol( "STREAM" ), makeSymbol( "PRINT-BASE" ) ) ), ConsesLow.list( makeSymbol( "PRINT-OBJECT-WRAPPER", "SUBLISP" ), makeString( "print_object_wrapper" ), ConsesLow.list( makeSymbol(
                      "OBJECT" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "PRINT-STREAM", "SUBLISP" ), makeString( "print_stream" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "STREAM" ),
                          makeSymbol( "DEPTH" ) ) ), ConsesLow.list( makeSymbol( "PRINT-STRING", "SUBLISP" ), makeString( "print_string" ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "STREAM" ) ) ), ConsesLow
                              .list( makeSymbol( "PRINT-SYMBOL", "SUBLISP" ), makeString( "print_symbol" ), ConsesLow.list( makeSymbol( "SYMBOL" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "PRINT-VECTOR",
                                  "SUBLISP" ), makeString( "print_vector" ), ConsesLow.list( makeSymbol( "VECTOR" ), makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "PROCESS-YIELD", "SUBLISP" ), makeString(
                                      "process_yield" ), NIL ), ConsesLow.list( makeSymbol( "READ-PRINT-EQ", "SUBLISP" ), makeString( "read_print_eq" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list(
                                          makeSymbol( "REALLY-OPEN", "SUBLISP" ), makeString( "really_open" ), ConsesLow.list( makeSymbol( "FILESPEC" ), makeSymbol( "KEYS" ) ) ), ConsesLow.list( makeSymbol(
                                              "REALLY-WRITE", "SUBLISP" ), makeString( "really_write" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "KEYS" ) ) ), ConsesLow.list( makeSymbol(
                                                  "REALLY-WRITE-TO-STRING", "SUBLISP" ), makeString( "really_write_to_string" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "KEYS" ) ) ), ConsesLow.list(
                                                      makeSymbol( "RELEASE-LOCK", "SUBLISP" ), makeString( "release_lock" ), ConsesLow.list( makeSymbol( "LOCK" ) ) ), ConsesLow.list( makeSymbol( "REMOVE-SPACE-PROBE",
                                                          "SUBLISP" ), makeString( "remove_space_probe" ), ConsesLow.list( makeSymbol( "PROBE" ) ) ), ConsesLow.list( makeSymbol( "RESTART-CYC", "SUBLISP" ), makeString(
                                                              "restart_cyc" ), ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "WORLD" ), makeSymbol( "INIT-FILE" ), makeSymbol( "INIT-FORM" ) ) ), ConsesLow.list(
                                                                  makeSymbol( "RUN-EXTERNAL-PROCESS", "SUBLISP" ), makeString( "run_external_process" ), ConsesLow.list( makeSymbol( "PROGRAM" ), makeSymbol( "&OPTIONAL" ),
                                                                      makeSymbol( "ARGS" ), makeSymbol( "STDIN-SPEC" ), makeSymbol( "STDOUT-SPEC" ), makeSymbol( "STDERR-SPEC" ) ) ), ConsesLow.list( makeSymbol(
                                                                          "SEIZE-LOCK", "SUBLISP" ), makeString( "seize_lock" ), ConsesLow.list( makeSymbol( "LOCK" ) ) ), ConsesLow.list( makeSymbol(
                                                                              "SET-INHIBIT-PREEMPTION", "SUBLISP" ), makeString( "set_inhibit_preemption" ), ConsesLow.list( makeSymbol( "VALUE" ) ) ), ConsesLow.list(
                                                                                  makeSymbol( "SET-STREAM-COLUMN", "SUBLISP" ), makeString( "set_stream_column" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol(
                                                                                      "VALUE" ) ) ), ConsesLow.list( makeSymbol( "SET-STREAM-COMPONENTS", "SUBLISP" ), makeString( "set_stream_components" ), ConsesLow
                                                                                          .list( makeSymbol( "OBJECT" ), makeSymbol( "VALUE" ) ) ), ConsesLow.list( makeSymbol( "SET-STREAM-DIRECTION", "SUBLISP" ),
                                                                                              makeString( "set_stream_direction" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "VALUE" ) ) ), ConsesLow.list(
                                                                                                  makeSymbol( "SET-STREAM-ELEMENT-TYPE", "SUBLISP" ), makeString( "set_stream_element_type" ), ConsesLow.list( makeSymbol(
                                                                                                      "OBJECT" ), makeSymbol( "VALUE" ) ) ), ConsesLow.list( makeSymbol( "SET-STREAM-HANDLE", "SUBLISP" ), makeString(
                                                                                                          "set_stream_handle" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "VALUE" ) ) ), ConsesLow.list(
                                                                                                              makeSymbol( "SET-STREAM-INPUT-BUFFER", "SUBLISP" ), makeString( "set_stream_input_buffer" ), ConsesLow.list(
                                                                                                                  makeSymbol( "OBJECT" ), makeSymbol( "VALUE" ) ) ), ConsesLow.list( makeSymbol( "SET-STREAM-INPUT-INDEX",
                                                                                                                      "SUBLISP" ), makeString( "set_stream_input_index" ), ConsesLow.list( makeSymbol( "OBJECT" ),
                                                                                                                          makeSymbol( "VALUE" ) ) ), ConsesLow.list( makeSymbol( "SET-STREAM-INPUT-LIMIT", "SUBLISP" ),
                                                                                                                              makeString( "set_stream_input_limit" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol(
                                                                                                                                  "VALUE" ) ) ), ConsesLow.list( makeSymbol( "SET-STREAM-LAST-CHAR", "SUBLISP" ),
                                                                                                                                      makeString( "set_stream_last_char" ), ConsesLow.list( makeSymbol( "OBJECT" ),
                                                                                                                                          makeSymbol( "VALUE" ) ) ), ConsesLow.list( makeSymbol( "SET-STREAM-LOCK",
                                                                                                                                              "SUBLISP" ), makeString( "set_stream_lock" ), ConsesLow.list( makeSymbol(
                                                                                                                                                  "OBJECT" ), makeSymbol( "VALUE" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                                                      "SET-STREAM-OPEN-P", "SUBLISP" ), makeString( "set_stream_open_p" ),
                                                                                                                                                      ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "VALUE" ) ) ),
      ConsesLow.list( makeSymbol( "SET-STREAM-OUTPUT-BUFFER", "SUBLISP" ), makeString( "set_stream_output_buffer" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "VALUE" ) ) ), ConsesLow.list( makeSymbol(
          "SET-STREAM-OUTPUT-INDEX", "SUBLISP" ), makeString( "set_stream_output_index" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "VALUE" ) ) ), ConsesLow.list( makeSymbol( "SET-STREAM-OUTPUT-LIMIT",
              "SUBLISP" ), makeString( "set_stream_output_limit" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "VALUE" ) ) ), ConsesLow.list( makeSymbol( "SET-STREAM-PATHNAME", "SUBLISP" ), makeString(
                  "set_stream_pathname" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "VALUE" ) ) ), ConsesLow.list( makeSymbol( "SET-STREAM-STREAM-TYPE", "SUBLISP" ), makeString( "set_stream_stream_type" ),
                      ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "VALUE" ) ) ), ConsesLow.list( makeSymbol( "SIMPLE-STREAM-ERROR", "SUBLISP" ), makeString( "simple_stream_error" ), ConsesLow.list( makeSymbol(
                          "FORMAT-CONTROL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "ARGS" ) ) ), ConsesLow.list( makeSymbol( "STREAM-ADVANCE-TO-COLUMN", "SUBLISP" ), makeString( "stream_advance_to_column" ), ConsesLow
                              .list( makeSymbol( "STREAM" ), makeSymbol( "COLUMN" ) ) ), ConsesLow.list( makeSymbol( "STREAM-CHECK-TYPE", "SUBLISP" ), makeString( "stream_check_type" ), ConsesLow.list( makeSymbol(
                                  "STREAM" ), makeSymbol( "TYPE" ) ) ), ConsesLow.list( makeSymbol( "STREAM-CLEAR-INPUT", "SUBLISP" ), makeString( "stream_clear_input" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ),
      ConsesLow.list( makeSymbol( "STREAM-CLEAR-OUTPUT", "SUBLISP" ), makeString( "stream_clear_output" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "STREAM-COLUMN", "SUBLISP" ), makeString(
          "stream_column" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "STREAM-COMPONENTS", "SUBLISP" ), makeString( "stream_components" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ),
      ConsesLow.list( makeSymbol( "STREAM-DIRECTION", "SUBLISP" ), makeString( "stream_direction" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "STREAM-FILE-LENGTH", "SUBLISP" ), makeString(
          "stream_file_length" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "STREAM-FILE-POSITION", "SUBLISP" ), makeString( "stream_file_position" ), ConsesLow.list( makeSymbol(
              "STREAM" ) ) ), ConsesLow.list( makeSymbol( "STREAM-FILE-STRING-LENGTH", "SUBLISP" ), makeString( "stream_file_string_length" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "OBJECT" ) ) ), ConsesLow
                  .list( makeSymbol( "STREAM-FINISH-OUTPUT", "SUBLISP" ), makeString( "stream_finish_output" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "STREAM-FORCE-OUTPUT", "SUBLISP" ),
                      makeString( "stream_force_output" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "STREAM-FRESH-LINE", "SUBLISP" ), makeString( "stream_fresh_line" ), ConsesLow.list(
                          makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "STREAM-HANDLE", "SUBLISP" ), makeString( "stream_handle" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol(
                              "STREAM-INPUT-BUFFER", "SUBLISP" ), makeString( "stream_input_buffer" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "STREAM-INPUT-INDEX", "SUBLISP" ),
                                  makeString( "stream_input_index" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "STREAM-INPUT-LIMIT", "SUBLISP" ), makeString( "stream_input_limit" ),
                                      ConsesLow.list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "STREAM-LAST-CHAR", "SUBLISP" ), makeString( "stream_last_char" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ),
      ConsesLow.list( makeSymbol( "STREAM-LISTEN", "SUBLISP" ), makeString( "stream_listen" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "STREAM-LOCK", "SUBLISP" ), makeString(
          "stream_lock" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "STREAM-NEXT-INPUT-BUFFER", "SUBLISP" ), makeString( "stream_next_input_buffer" ), ConsesLow.list( makeSymbol(
              "STREAM" ), makeSymbol( "WAITP" ) ) ), ConsesLow.list( makeSymbol( "STREAM-OPEN-P", "SUBLISP" ), makeString( "stream_open_p" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol(
                  "STREAM-OUTPUT-BUFFER", "SUBLISP" ), makeString( "stream_output_buffer" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "STREAM-OUTPUT-INDEX", "SUBLISP" ), makeString(
                      "stream_output_index" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "STREAM-OUTPUT-LIMIT", "SUBLISP" ), makeString( "stream_output_limit" ), ConsesLow.list( makeSymbol(
                          "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "STREAM-P", "SUBLISP" ), makeString( "stream_p" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "STREAM-PATHNAME",
                              "SUBLISP" ), makeString( "stream_pathname" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "STREAM-PEEK-CHAR", "SUBLISP" ), makeString( "stream_peek_char" ),
                                  ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "STREAM-READ-BYTE", "SUBLISP" ), makeString( "stream_read_byte" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ),
      ConsesLow.list( makeSymbol( "STREAM-READ-CHAR", "SUBLISP" ), makeString( "stream_read_char" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "STREAM-READ-CHAR-NO-HANG", "SUBLISP" ),
          makeString( "stream_read_char_no_hang" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "STREAM-READ-LINE", "SUBLISP" ), makeString( "stream_read_line" ), ConsesLow.list( makeSymbol(
              "STREAM" ) ) ), ConsesLow.list( makeSymbol( "STREAM-READ-SEQUENCE", "SUBLISP" ), makeString( "stream_read_sequence" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "SEQUENCE" ), makeSymbol(
                  "START" ), makeSymbol( "END" ) ) ), ConsesLow.list( makeSymbol( "STREAM-SEND-OUTPUT-BUFFER", "SUBLISP" ), makeString( "stream_send_output_buffer" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow
                      .list( makeSymbol( "STREAM-SET-FILE-POSITION", "SUBLISP" ), makeString( "stream_set_file_position" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "POSITION-SPEC" ) ) ), ConsesLow.list(
                          makeSymbol( "STREAM-START-LINE-P", "SUBLISP" ), makeString( "stream_start_line_p" ), ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "STREAM-STREAM-TYPE", "SUBLISP" ),
                              makeString( "stream_stream_type" ), ConsesLow.list( makeSymbol( "OBJECT" ) ) ), ConsesLow.list( makeSymbol( "STREAM-TERPRI", "SUBLISP" ), makeString( "stream_terpri" ), ConsesLow.list(
                                  makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "STREAM-UNREAD-CHAR", "SUBLISP" ), makeString( "stream_unread_char" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol(
                                      "CHARACTER" ) ) ), ConsesLow.list( makeSymbol( "STREAM-WRITE-BYTE", "SUBLISP" ), makeString( "stream_write_byte" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol(
                                          "INTEGER" ) ) ), ConsesLow.list( makeSymbol( "STREAM-WRITE-CHAR", "SUBLISP" ), makeString( "stream_write_char" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol(
                                              "CHARACTER" ) ) ), ConsesLow.list( makeSymbol( "STREAM-WRITE-SEQUENCE", "SUBLISP" ), makeString( "stream_write_sequence" ), ConsesLow.list( makeSymbol( "STREAM" ),
                                                  makeSymbol( "SEQUENCE" ), makeSymbol( "START" ), makeSymbol( "END" ) ) ), ConsesLow.list( makeSymbol( "STREAM-WRITE-STRING", "SUBLISP" ), makeString(
                                                      "stream_write_string" ), ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "STRING" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "START" ),
                                                          ZERO_INTEGER ), makeSymbol( "END" ) ) ), ConsesLow.list( makeSymbol( "TIMESTRING", "SUBLISP" ), makeString( "f_timestring" ), ConsesLow.list( makeSymbol(
                                                              "&OPTIONAL" ), makeSymbol( "UNIVERSAL-TIME" ) ) ), ConsesLow.list( makeSymbol( "UNKNOWN-STREAM-TYPE", "SUBLISP" ), makeString( "unknown_stream_type" ),
                                                                  ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "UNLOAD-SHARED-OBJECT", "SUBLISP" ), makeString( "sublisp_unload_shared_object" ),
                                                                      ConsesLow.list( makeSymbol( "PATHNAME" ) ) ), ConsesLow.list( makeSymbol( "WIDE-NEWLINE-STREAM-P", "SUBLISP" ), makeString( "wide_newline_stream_p" ),
                                                                          ConsesLow.list( makeSymbol( "STREAM" ) ) ), ConsesLow.list( makeSymbol( "_CLEAR-STRUCTURE", "SUBLISP" ), makeString( "CLEAR_STRUCTURE" ),
                                                                              ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "SIZE" ) ) ), ConsesLow.list( makeSymbol( "_CLEAR-SUB-STRUCTURE", "SUBLISP" ), makeString(
                                                                                  "CLEAR_SUB_STRUCTURE" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "SIZE" ), makeSymbol( "TYPE" ) ) ), ConsesLow.list(
                                                                                      makeSymbol( "_CSETF-READTABLE-CASE", "SUBLISP" ), makeString( "f__csetf_readtable_case" ), ConsesLow.list( makeSymbol( "OBJECT" ),
                                                                                          makeSymbol( "VALUE" ) ) ), ConsesLow.list( makeSymbol( "_DEF-CSETF", "SUBLISP" ), makeString( "DEF_CSETF" ), ConsesLow.list(
                                                                                              makeSymbol( "ACCESSOR" ), makeSymbol( "SETTER" ) ) ), ConsesLow.list( makeSymbol( "_METHOD", "SUBLISP" ), makeString(
                                                                                                  "METHOD_FUNC" ), ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "METHOD-TABLE" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                      "_NEW-STRUCTURE", "SUBLISP" ), makeString( "NEW_STRUCTURE" ), ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol(
                                                                                                          "SIZE" ) ) ), ConsesLow.list( makeSymbol( "_REGISTER-DEFSTRUCT", "SUBLISP" ), makeString( "REGISTER_DEFSTRUCT" ),
                                                                                                              ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "TYPE" ), makeSymbol( "SIZE" ), makeSymbol(
                                                                                                                  "PRINT-FUNCTION" ), makeSymbol( "SLOTS" ) ) ), ConsesLow.list( makeSymbol( "_REGISTER-METHOD",
                                                                                                                      "SUBLISP" ), makeString( "REGISTER_METHOD" ), ConsesLow.list( makeSymbol( "METHOD-TABLE" ),
                                                                                                                          makeSymbol( "TYPE" ), makeSymbol( "FUNCTION" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                                              "_SET-STRUCTURE-SLOT", "SUBLISP" ), makeString( "SET_STRUCTURE_SLOT" ), ConsesLow.list(
                                                                                                                                  makeSymbol( "OBJECT" ), makeSymbol( "SLOT" ), makeSymbol( "VALUE" ) ) ), ConsesLow.list(
                                                                                                                                      makeSymbol( "_STRUCTURE-SLOT", "SUBLISP" ), makeString( "STRUCTURE_SLOT" ), ConsesLow
                                                                                                                                          .list( makeSymbol( "OBJECT" ), makeSymbol( "SLOT" ) ) ), ConsesLow.list(
                                                                                                                                              makeSymbol( "_STRUCTURE-TYPE", "SUBLISP" ), makeString( "STRUCTURE_TYPE" ),
                                                                                                                                              ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "TYPE" ) ) ), ConsesLow
                                                                                                                                                  .list( makeSymbol( "_STRUCTURES-BAG-P", "SUBLISP" ), makeString(
                                                                                                                                                      "dp_structures_bag_p" ), ConsesLow.list( makeSymbol( "X" ) ) )
    } );
  }

  private static SubLObject _constant_10_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "%B-/=" ), makeString( "numNE" ), ConsesLow.list( makeSymbol( "NUM1" ), makeSymbol( "NUM2" ) ) ), ConsesLow.list( makeSymbol( "%B-<" ),
        makeString( "numL" ), ConsesLow.list( makeSymbol( "NUM1" ), makeSymbol( "NUM2" ) ) ), ConsesLow.list( makeSymbol( "%B-<=" ), makeString( "numLE" ), ConsesLow.list( makeSymbol( "NUM1" ), makeSymbol( "NUM2" ) ) ),
      ConsesLow.list( makeSymbol( "%B-=" ), makeString( "numE" ), ConsesLow.list( makeSymbol( "NUM1" ), makeSymbol( "NUM2" ) ) ), ConsesLow.list( makeSymbol( "%B->" ), makeString( "numG" ), ConsesLow.list( makeSymbol(
          "NUM1" ), makeSymbol( "NUM2" ) ) ), ConsesLow.list( makeSymbol( "%B->=" ), makeString( "numGE" ), ConsesLow.list( makeSymbol( "NUM1" ), makeSymbol( "NUM2" ) ) ), ConsesLow.list( makeSymbol( "%B-ALIEN-P" ),
              makeString( "alienp" ), ConsesLow.list( makeSymbol( "X" ) ) ), ConsesLow.list( makeSymbol( "%B-ALPHA-CHARP" ), makeString( "alpha_char_p" ), ConsesLow.list( makeSymbol( "CHAR" ) ) ), ConsesLow.list(
                  makeSymbol( "%B-ALPHANUMERICP" ), makeString( "alphanumericp" ), ConsesLow.list( makeSymbol( "CHAR" ) ) ), ConsesLow.list( makeSymbol( "%B-ATOM" ), makeString( "atom" ), ConsesLow.list( makeSymbol(
                      "X" ) ) ), ConsesLow.list( makeSymbol( "%B-BOTH-CASEP" ), makeString( "both_case_p" ), ConsesLow.list( makeSymbol( "CHAR" ) ) ), ConsesLow.list( makeSymbol( "%B-BOUNDP" ), makeString( "boundp" ),
                          ConsesLow.list( makeSymbol( "SYMBOL" ) ) ), ConsesLow.list( makeSymbol( "%B-CHAR-EQUAL" ), makeString( "char_equal" ), ConsesLow.list( makeSymbol( "CHAR1" ), makeSymbol( "CHAR2" ) ) ), ConsesLow
                              .list( makeSymbol( "%B-CHAR-GREATERP" ), makeString( "char_greaterp" ), ConsesLow.list( makeSymbol( "CHAR1" ), makeSymbol( "CHAR2" ) ) ), ConsesLow.list( makeSymbol( "%B-CHAR-LESSP" ),
                                  makeString( "char_lessp" ), ConsesLow.list( makeSymbol( "CHAR1" ), makeSymbol( "CHAR2" ) ) ), ConsesLow.list( makeSymbol( "%B-CHAR-NOT-EQUAL" ), makeString( "char_not_equal" ), ConsesLow
                                      .list( makeSymbol( "CHAR1" ), makeSymbol( "CHAR2" ) ) ), ConsesLow.list( makeSymbol( "%B-CHAR-NOT-GREATERP" ), makeString( "char_not_greaterp" ), ConsesLow.list( makeSymbol(
                                          "CHAR1" ), makeSymbol( "CHAR2" ) ) ), ConsesLow.list( makeSymbol( "%B-CHAR-NOT-LESSP" ), makeString( "char_not_lessp" ), ConsesLow.list( makeSymbol( "CHAR1" ), makeSymbol(
                                              "CHAR2" ) ) ), ConsesLow.list( makeSymbol( "%B-CHAR/=" ), makeString( "charNE" ), ConsesLow.list( makeSymbol( "CHAR1" ), makeSymbol( "CHAR2" ) ) ), ConsesLow.list(
                                                  makeSymbol( "%B-CHAR<" ), makeString( "charL" ), ConsesLow.list( makeSymbol( "CHAR1" ), makeSymbol( "CHAR2" ) ) ), ConsesLow.list( makeSymbol( "%B-CHAR<=" ), makeString(
                                                      "charLE" ), ConsesLow.list( makeSymbol( "CHAR1" ), makeSymbol( "CHAR2" ) ) ), ConsesLow.list( makeSymbol( "%B-CHAR=" ), makeString( "charE" ), ConsesLow.list(
                                                          makeSymbol( "CHAR1" ), makeSymbol( "CHAR2" ) ) ), ConsesLow.list( makeSymbol( "%B-CHAR>" ), makeString( "charG" ), ConsesLow.list( makeSymbol( "CHAR1" ),
                                                              makeSymbol( "CHAR2" ) ) ), ConsesLow.list( makeSymbol( "%B-CHAR>=" ), makeString( "charGE" ), ConsesLow.list( makeSymbol( "CHAR1" ), makeSymbol(
                                                                  "CHAR2" ) ) ), ConsesLow.list( makeSymbol( "%B-CHARACTERP" ), makeString( "characterp" ), ConsesLow.list( makeSymbol( "X" ) ) ), ConsesLow.list(
                                                                      makeSymbol( "%B-CONSP" ), makeString( "consp" ), ConsesLow.list( makeSymbol( "X" ) ) ), ConsesLow.list( makeSymbol( "%B-EQ" ), makeString( "EQ" ),
                                                                          ConsesLow.list( makeSymbol( "X" ), makeSymbol( "Y" ) ) ), ConsesLow.list( makeSymbol( "%B-EQL" ), makeString( "eql" ), ConsesLow.list( makeSymbol(
                                                                              "X" ), makeSymbol( "Y" ) ) ), ConsesLow.list( makeSymbol( "%B-EQUAL" ), makeString( "equal" ), ConsesLow.list( makeSymbol( "X" ), makeSymbol(
                                                                                  "Y" ) ) ), ConsesLow.list( makeSymbol( "%B-EQUALP" ), makeString( "equalp" ), ConsesLow.list( makeSymbol( "X" ), makeSymbol( "Y" ) ) ),
      ConsesLow.list( makeSymbol( "%B-EVENP" ), makeString( "evenp" ), ConsesLow.list( makeSymbol( "NUMBER" ) ) ), ConsesLow.list( makeSymbol( "%B-FBOUNDP" ), makeString( "fboundp" ), ConsesLow.list( makeSymbol(
          "SYMBOL" ) ) ), ConsesLow.list( makeSymbol( "%B-FIXNUMP" ), makeString( "fixnump" ), ConsesLow.list( makeSymbol( "X" ) ) ), ConsesLow.list( makeSymbol( "%B-FLOATP" ), makeString( "floatp" ), ConsesLow.list(
              makeSymbol( "X" ) ) ), ConsesLow.list( makeSymbol( "%B-FUNCTION-SPEC-P" ), makeString( "function_spec_p" ), ConsesLow.list( makeSymbol( "X" ) ) ), ConsesLow.list( makeSymbol( "%B-FUNCTIONP" ), makeString(
                  "functionp" ), ConsesLow.list( makeSymbol( "X" ) ) ), ConsesLow.list( makeSymbol( "%B-GUID-P" ), makeString( "guid_p" ), ConsesLow.list( makeSymbol( "OBJ" ) ) ), ConsesLow.list( makeSymbol(
                      "%B-HASH-TABLE-P" ), makeString( "hash_table_p" ), ConsesLow.list( makeSymbol( "X" ) ) ), ConsesLow.list( makeSymbol( "%B-INTEGERP" ), makeString( "integerp" ), ConsesLow.list( makeSymbol(
                          "X" ) ) ), ConsesLow.list( makeSymbol( "%B-KEYWORDP" ), makeString( "keywordp" ), ConsesLow.list( makeSymbol( "X" ) ) ), ConsesLow.list( makeSymbol( "%B-LISTP" ), makeString( "listp" ),
                              ConsesLow.list( makeSymbol( "X" ) ) ), ConsesLow.list( makeSymbol( "%B-LOCK-P" ), makeString( "lockp" ), ConsesLow.list( makeSymbol( "X" ) ) ), ConsesLow.list( makeSymbol(
                                  "%B-LOWER-CASEP" ), makeString( "lower_case_p" ), ConsesLow.list( makeSymbol( "CHAR" ) ) ), ConsesLow.list( makeSymbol( "%B-MACRO-OPERATOR-P" ), makeString( "macro_operator_p" ),
                                      ConsesLow.list( makeSymbol( "X" ) ) ), ConsesLow.list( makeSymbol( "%B-MINUSP" ), makeString( "minusp" ), ConsesLow.list( makeSymbol( "NUMBER" ) ) ), ConsesLow.list( makeSymbol(
                                          "%B-NULL" ), makeString( "SUBLISP_NULL" ), ConsesLow.list( makeSymbol( "X" ) ) ), ConsesLow.list( makeSymbol( "%B-NUMBERP" ), makeString( "numberp" ), ConsesLow.list( makeSymbol(
                                              "X" ) ) ), ConsesLow.list( makeSymbol( "%B-ODDP" ), makeString( "oddp" ), ConsesLow.list( makeSymbol( "NUMBER" ) ) ), ConsesLow.list( makeSymbol( "%B-PACKAGEP" ), makeString(
                                                  "packagep" ), ConsesLow.list( makeSymbol( "X" ) ) ), ConsesLow.list( makeSymbol( "%B-PLUSP" ), makeString( "plusp" ), ConsesLow.list( makeSymbol( "NUMBER" ) ) ),
      ConsesLow.list( makeSymbol( "%B-PROBE-FILE" ), makeString( "probe_file" ), ConsesLow.list( makeSymbol( "FILENAME" ) ) ), ConsesLow.list( makeSymbol( "%B-PROCESSP" ), makeString( "processp" ), ConsesLow.list(
          makeSymbol( "X" ) ) ), ConsesLow.list( makeSymbol( "%B-SEQUENCEP" ), makeString( "sequencep" ), ConsesLow.list( makeSymbol( "X" ) ) ), ConsesLow.list( makeSymbol( "%B-STREAMP" ), makeString( "streamp" ),
              ConsesLow.list( makeSymbol( "X" ) ) ), ConsesLow.list( makeSymbol( "%B-STRING-EQUAL" ), makeString( "string_equal" ), ConsesLow.list( makeSymbol( "STRING1" ), makeSymbol( "STRING2" ), makeSymbol(
                  "&OPTIONAL" ), makeSymbol( "START1" ), makeSymbol( "END1" ), makeSymbol( "START2" ), makeSymbol( "END2" ) ) ), ConsesLow.list( makeSymbol( "%B-STRING-GREATERP" ), makeString( "string_greaterp" ),
                      ConsesLow.list( makeSymbol( "STRING1" ), makeSymbol( "STRING2" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "START1" ), makeSymbol( "END1" ), makeSymbol( "START2" ), makeSymbol( "END2" ) ) ), ConsesLow
                          .list( makeSymbol( "%B-STRING-LESSP" ), makeString( "string_lessp" ), ConsesLow.list( makeSymbol( "STRING1" ), makeSymbol( "STRING2" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "START1" ),
                              makeSymbol( "END1" ), makeSymbol( "START2" ), makeSymbol( "END2" ) ) ), ConsesLow.list( makeSymbol( "%B-STRING-NOT-EQUAL" ), makeString( "string_not_equal" ), ConsesLow.list( makeSymbol(
                                  "STRING1" ), makeSymbol( "STRING2" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "START1" ), makeSymbol( "END1" ), makeSymbol( "START2" ), makeSymbol( "END2" ) ) ), ConsesLow.list(
                                      makeSymbol( "%B-STRING-NOT-GREATERP" ), makeString( "string_not_greaterp" ), ConsesLow.list( makeSymbol( "STRING1" ), makeSymbol( "STRING2" ), makeSymbol( "&OPTIONAL" ), makeSymbol(
                                          "START1" ), makeSymbol( "END1" ), makeSymbol( "START2" ), makeSymbol( "END2" ) ) ), ConsesLow.list( makeSymbol( "%B-STRING-NOT-LESSP" ), makeString( "string_not_lessp" ),
                                              ConsesLow.list( makeSymbol( "STRING1" ), makeSymbol( "STRING2" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "START1" ), makeSymbol( "END1" ), makeSymbol( "START2" ), makeSymbol(
                                                  "END2" ) ) ), ConsesLow.list( makeSymbol( "%B-STRING/=" ), makeString( "stringNE" ), ConsesLow.list( makeSymbol( "STRING1" ), makeSymbol( "STRING2" ), makeSymbol(
                                                      "&OPTIONAL" ), makeSymbol( "START1" ), makeSymbol( "END1" ), makeSymbol( "START2" ), makeSymbol( "END2" ) ) ), ConsesLow.list( makeSymbol( "%B-STRING<" ), makeString(
                                                          "stringL" ), ConsesLow.list( makeSymbol( "STRING1" ), makeSymbol( "STRING2" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "START1" ), makeSymbol( "END1" ),
                                                              makeSymbol( "START2" ), makeSymbol( "END2" ) ) ), ConsesLow.list( makeSymbol( "%B-STRING<=" ), makeString( "stringLE" ), ConsesLow.list( makeSymbol(
                                                                  "STRING1" ), makeSymbol( "STRING2" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "START1" ), makeSymbol( "END1" ), makeSymbol( "START2" ), makeSymbol(
                                                                      "END2" ) ) ), ConsesLow.list( makeSymbol( "%B-STRING=" ), makeString( "stringE" ), ConsesLow.list( makeSymbol( "STRING1" ), makeSymbol( "STRING2" ),
                                                                          makeSymbol( "&OPTIONAL" ), makeSymbol( "START1" ), makeSymbol( "END1" ), makeSymbol( "START2" ), makeSymbol( "END2" ) ) ), ConsesLow.list(
                                                                              makeSymbol( "%B-STRING>" ), makeString( "stringG" ), ConsesLow.list( makeSymbol( "STRING1" ), makeSymbol( "STRING2" ), makeSymbol(
                                                                                  "&OPTIONAL" ), makeSymbol( "START1" ), makeSymbol( "END1" ), makeSymbol( "START2" ), makeSymbol( "END2" ) ) ), ConsesLow.list( makeSymbol(
                                                                                      "%B-STRING>=" ), makeString( "stringGE" ), ConsesLow.list( makeSymbol( "STRING1" ), makeSymbol( "STRING2" ), makeSymbol(
                                                                                          "&OPTIONAL" ), makeSymbol( "START1" ), makeSymbol( "END1" ), makeSymbol( "START2" ), makeSymbol( "END2" ) ) ), ConsesLow.list(
                                                                                              makeSymbol( "%B-STRINGP" ), makeString( "stringp" ), ConsesLow.list( makeSymbol( "X" ) ) ), ConsesLow.list( makeSymbol(
                                                                                                  "%B-STRUCTURES-BAG-P" ), makeString( "structures_bag_p" ), ConsesLow.list( makeSymbol( "X" ) ) ), ConsesLow.list(
                                                                                                      makeSymbol( "%B-SYMBOLP" ), makeString( "symbolp" ), ConsesLow.list( makeSymbol( "X" ) ) ), ConsesLow.list(
                                                                                                          makeSymbol( "%B-THROWN-TO" ), makeString( "THROWN_TO" ), ConsesLow.list( makeSymbol( "ENV" ) ) ), ConsesLow.list(
                                                                                                              makeSymbol( "%B-UPPER-CASEP" ), makeString( "upper_case_p" ), ConsesLow.list( makeSymbol( "CHAR" ) ) ),
      ConsesLow.list( makeSymbol( "%B-VECTORP" ), makeString( "vectorp" ), ConsesLow.list( makeSymbol( "X" ) ) ), ConsesLow.list( makeSymbol( "%B-ZEROP" ), makeString( "zerop" ), ConsesLow.list( makeSymbol(
          "NUMBER" ) ) )
    } );
  }

  private static SubLObject _constant_15_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.cons( T, makeString( "T" ) ), ConsesLow.cons( NIL, makeString( "NIL" ) ), ConsesLow.cons( EQ, makeString( "eq_sym" ) ), ConsesLow.cons( EQL, makeString(
        "eql_sym" ) ), ConsesLow.cons( EQUAL, makeString( "equal_sym" ) ), ConsesLow.cons( EQUALP, makeString( "equalp_sym" ) ), ConsesLow.cons( IDENTITY, makeString( "identity_sym" ) ), ConsesLow.cons(
            MINUS_ONE_INTEGER, makeString( "minus_one" ) ), ConsesLow.cons( ZERO_INTEGER, makeString( "zero" ) ), ConsesLow.cons( ONE_INTEGER, makeString( "one" ) ), ConsesLow.cons( TWO_INTEGER, makeString( "two" ) ),
      ConsesLow.cons( THREE_INTEGER, makeString( "three" ) ), ConsesLow.cons( FOUR_INTEGER, makeString( "four" ) ), ConsesLow.cons( FIVE_INTEGER, makeString( "five" ) ), ConsesLow.cons( SIX_INTEGER, makeString(
          "six" ) ), ConsesLow.cons( SEVEN_INTEGER, makeString( "seven" ) ), ConsesLow.cons( EIGHT_INTEGER, makeString( "eight" ) ), ConsesLow.cons( NINE_INTEGER, makeString( "nine" ) ), ConsesLow.cons( TEN_INTEGER,
              makeString( "ten" ) ), ConsesLow.cons( ELEVEN_INTEGER, makeString( "eleven" ) ), ConsesLow.cons( TWELVE_INTEGER, makeString( "twelve" ) ), ConsesLow.cons( THIRTEEN_INTEGER, makeString( "thirteen" ) ),
      ConsesLow.cons( FOURTEEN_INTEGER, makeString( "fourteen" ) ), ConsesLow.cons( FIFTEEN_INTEGER, makeString( "fifteen" ) ), ConsesLow.cons( SIXTEEN_INTEGER, makeString( "sixteen" ) ), ConsesLow.cons(
          SEVENTEEN_INTEGER, makeString( "seventeen" ) ), ConsesLow.cons( EIGHTEEN_INTEGER, makeString( "eighteen" ) ), ConsesLow.cons( NINETEEN_INTEGER, makeString( "nineteen" ) ), ConsesLow.cons( TWENTY_INTEGER,
              makeString( "twenty" ) ), ConsesLow.cons( Characters.CHAR_null, makeString( "c_null" ) ), ConsesLow.cons( Characters.CHAR_backspace, makeString( "c_backspace" ) ), ConsesLow.cons( Characters.CHAR_tab,
                  makeString( "c_tab" ) ), ConsesLow.cons( Characters.CHAR_newline, makeString( "c_newline" ) ), ConsesLow.cons( Characters.CHAR_return, makeString( "c_return" ) ), ConsesLow.cons( Characters.CHAR_page,
                      makeString( "c_page" ) ), ConsesLow.cons( Characters.CHAR_escape, makeString( "c_esc" ) ), ConsesLow.cons( Characters.CHAR_space, makeString( "c_space" ) ), ConsesLow.cons(
                          Characters.CHAR_exclamation, makeString( "c_exclamation" ) ), ConsesLow.cons( Characters.CHAR_quotation, makeString( "c_quotation" ) ), ConsesLow.cons( Characters.CHAR_hash, makeString(
                              "c_hash" ) ), ConsesLow.cons( Characters.CHAR_dollar, makeString( "c_dollar" ) ), ConsesLow.cons( Characters.CHAR_percent, makeString( "c_percent" ) ), ConsesLow.cons(
                                  Characters.CHAR_ampersand, makeString( "c_ampersand" ) ), ConsesLow.cons( Characters.CHAR_quote, makeString( "c_quote" ) ), ConsesLow.cons( Characters.CHAR_lparen, makeString(
                                      "c_lparen" ) ), ConsesLow.cons( Characters.CHAR_rparen, makeString( "c_rparen" ) ), ConsesLow.cons( Characters.CHAR_asterisk, makeString( "c_asterisk" ) ), ConsesLow.cons(
                                          Characters.CHAR_plus, makeString( "c_plus" ) ), ConsesLow.cons( Characters.CHAR_comma, makeString( "c_comma" ) ), ConsesLow.cons( Characters.CHAR_hyphen, makeString(
                                              "c_hyphen" ) ), ConsesLow.cons( Characters.CHAR_period, makeString( "c_period" ) ), ConsesLow.cons( Characters.CHAR_slash, makeString( "c_slash" ) ), ConsesLow.cons(
                                                  Characters.CHAR_0, makeString( "c_0" ) ), ConsesLow.cons( Characters.CHAR_1, makeString( "c_1" ) ), ConsesLow.cons( Characters.CHAR_2, makeString( "c_2" ) ), ConsesLow
                                                      .cons( Characters.CHAR_3, makeString( "c_3" ) ), ConsesLow.cons( Characters.CHAR_4, makeString( "c_4" ) ), ConsesLow.cons( Characters.CHAR_5, makeString( "c_5" ) ),
      ConsesLow.cons( Characters.CHAR_6, makeString( "c_6" ) ), ConsesLow.cons( Characters.CHAR_7, makeString( "c_7" ) ), ConsesLow.cons( Characters.CHAR_8, makeString( "c_8" ) ), ConsesLow.cons( Characters.CHAR_9,
          makeString( "c_9" ) ), ConsesLow.cons( Characters.CHAR_colon, makeString( "c_colon" ) ), ConsesLow.cons( Characters.CHAR_semicolon, makeString( "c_semicolon" ) ), ConsesLow.cons( Characters.CHAR_less,
              makeString( "c_less" ) ), ConsesLow.cons( Characters.CHAR_equal, makeString( "c_equal" ) ), ConsesLow.cons( Characters.CHAR_greater, makeString( "c_greater" ) ), ConsesLow.cons( Characters.CHAR_question,
                  makeString( "c_question" ) ), ConsesLow.cons( Characters.CHAR_at, makeString( "c_at" ) ), ConsesLow.cons( Characters.CHAR_A, makeString( "c_A" ) ), ConsesLow.cons( Characters.CHAR_B, makeString(
                      "c_B" ) ), ConsesLow.cons( Characters.CHAR_C, makeString( "c_C" ) ), ConsesLow.cons( Characters.CHAR_D, makeString( "c_D" ) ), ConsesLow.cons( Characters.CHAR_E, makeString( "c_E" ) ), ConsesLow
                          .cons( Characters.CHAR_F, makeString( "c_F" ) ), ConsesLow.cons( Characters.CHAR_G, makeString( "c_G" ) ), ConsesLow.cons( Characters.CHAR_H, makeString( "c_H" ) ), ConsesLow.cons(
                              Characters.CHAR_I, makeString( "c_I" ) ), ConsesLow.cons( Characters.CHAR_J, makeString( "c_J" ) ), ConsesLow.cons( Characters.CHAR_K, makeString( "c_K" ) ), ConsesLow.cons(
                                  Characters.CHAR_L, makeString( "c_L" ) ), ConsesLow.cons( Characters.CHAR_M, makeString( "c_M" ) ), ConsesLow.cons( Characters.CHAR_N, makeString( "c_N" ) ), ConsesLow.cons(
                                      Characters.CHAR_O, makeString( "c_O" ) ), ConsesLow.cons( Characters.CHAR_P, makeString( "c_P" ) ), ConsesLow.cons( Characters.CHAR_Q, makeString( "c_Q" ) ), ConsesLow.cons(
                                          Characters.CHAR_R, makeString( "c_R" ) ), ConsesLow.cons( Characters.CHAR_S, makeString( "c_S" ) ), ConsesLow.cons( Characters.CHAR_T, makeString( "c_T" ) ), ConsesLow.cons(
                                              Characters.CHAR_U, makeString( "c_U" ) ), ConsesLow.cons( Characters.CHAR_V, makeString( "c_V" ) ), ConsesLow.cons( Characters.CHAR_W, makeString( "c_W" ) ), ConsesLow.cons(
                                                  Characters.CHAR_X, makeString( "c_X" ) ), ConsesLow.cons( Characters.CHAR_Y, makeString( "c_Y" ) ), ConsesLow.cons( Characters.CHAR_Z, makeString( "c_Z" ) ), ConsesLow
                                                      .cons( Characters.CHAR_lbracket, makeString( "c_lbracket" ) ), ConsesLow.cons( Characters.CHAR_backslash, makeString( "c_backslash" ) ), ConsesLow.cons(
                                                          Characters.CHAR_rbracket, makeString( "c_rbracket" ) ), ConsesLow.cons( Characters.CHAR_caret, makeString( "c_caret" ) ), ConsesLow.cons(
                                                              Characters.CHAR_underbar, makeString( "c_underbar" ) ), ConsesLow.cons( Characters.CHAR_backquote, makeString( "c_backquote" ) ), ConsesLow.cons(
                                                                  Characters.CHAR_a, makeString( "c_a" ) ), ConsesLow.cons( Characters.CHAR_b, makeString( "c_b" ) ), ConsesLow.cons( Characters.CHAR_c, makeString(
                                                                      "c_c" ) ), ConsesLow.cons( Characters.CHAR_d, makeString( "c_d" ) ), ConsesLow.cons( Characters.CHAR_e, makeString( "c_e" ) ), ConsesLow.cons(
                                                                          Characters.CHAR_f, makeString( "c_f" ) ), ConsesLow.cons( Characters.CHAR_g, makeString( "c_g" ) ), ConsesLow.cons( Characters.CHAR_h, makeString(
                                                                              "c_h" ) ), ConsesLow.cons( Characters.CHAR_i, makeString( "c_i" ) ), ConsesLow.cons( Characters.CHAR_j, makeString( "c_j" ) ), ConsesLow.cons(
                                                                                  Characters.CHAR_k, makeString( "c_k" ) ), ConsesLow.cons( Characters.CHAR_l, makeString( "c_l" ) ), ConsesLow.cons( Characters.CHAR_m,
                                                                                      makeString( "c_m" ) ), ConsesLow.cons( Characters.CHAR_n, makeString( "c_n" ) ), ConsesLow.cons( Characters.CHAR_o, makeString(
                                                                                          "c_o" ) ), ConsesLow.cons( Characters.CHAR_p, makeString( "c_p" ) ), ConsesLow.cons( Characters.CHAR_q, makeString( "c_q" ) ),
      ConsesLow.cons( Characters.CHAR_r, makeString( "c_r" ) ), ConsesLow.cons( Characters.CHAR_s, makeString( "c_s" ) ), ConsesLow.cons( Characters.CHAR_t, makeString( "c_t" ) ), ConsesLow.cons( Characters.CHAR_u,
          makeString( "c_u" ) ), ConsesLow.cons( Characters.CHAR_v, makeString( "c_v" ) ), ConsesLow.cons( Characters.CHAR_w, makeString( "c_w" ) ), ConsesLow.cons( Characters.CHAR_x, makeString( "c_x" ) ), ConsesLow
              .cons( Characters.CHAR_y, makeString( "c_y" ) ), ConsesLow.cons( Characters.CHAR_z, makeString( "c_z" ) ), ConsesLow.cons( Characters.CHAR_lbrace, makeString( "c_lbrace" ) ), ConsesLow.cons(
                  Characters.CHAR_vertical, makeString( "c_vertical" ) ), ConsesLow.cons( Characters.CHAR_rbrace, makeString( "c_rbrace" ) ), ConsesLow.cons( Characters.CHAR_tilde, makeString( "c_tilde" ) ), ConsesLow
                      .cons( Characters.CHAR_rubout, makeString( "c_rubout" ) )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_c_name_translation_file();
  }

  @Override
  public void initializeVariables()
  {
    init_c_name_translation_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_c_name_translation_file();
  }
  static
  {
    me = new c_name_translation();
    $c_backend_defined_function_name_data$ = null;
    $c_backend_undefined_function_name_data$ = null;
    $c_backend_function_arity_version_table$ = null;
    $c_backend_undefined_arity_function_name_data$ = null;
    $c_backend_function_boolean_version_table$ = null;
    $c_backend_function_boolean_hash$ = null;
    $c_backend_undefined_boolean_function_name_data$ = null;
    $c_backend_function_name_table$ = null;
    $c_backend_function_arglist_table$ = null;
    $c_backend_predefined_constant_table$ = null;
    $c_backend_defined_global_name_data$ = null;
    $c_backend_undefined_global_name_data$ = null;
    $c_backend_global_name_table$ = null;
    $list0 = _constant_0_initializer();
    $list1 = _constant_1_initializer();
    $list2 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $list3 = ConsesLow.list( ConsesLow.list( makeSymbol( "*" ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%MULT2" ) ) ), ConsesLow.list( makeSymbol( "+" ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%ADD2" ) ) ),
        ConsesLow.list( makeSymbol( "-" ), ConsesLow.cons( ONE_INTEGER, makeSymbol( "%MINUS" ) ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%SUB2" ) ) ), ConsesLow.list( makeSymbol( "/" ), ConsesLow.cons( ONE_INTEGER,
            makeSymbol( "%INVERT" ) ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%DIV2" ) ) ), ConsesLow.list( makeSymbol( "FUNCALL" ), ConsesLow.cons( ONE_INTEGER, makeSymbol( "%FUNCALL0" ) ), ConsesLow.cons(
                TWO_INTEGER, makeSymbol( "%FUNCALL1" ) ), ConsesLow.cons( THREE_INTEGER, makeSymbol( "%FUNCALL2" ) ), ConsesLow.cons( FOUR_INTEGER, makeSymbol( "%FUNCALL3" ) ) ), ConsesLow.list( makeSymbol( "MAX" ),
                    ConsesLow.cons( TWO_INTEGER, makeSymbol( "%MAX2" ) ) ), ConsesLow.list( makeSymbol( "MIN" ), ConsesLow.cons( TWO_INTEGER, makeSymbol( "%MIN2" ) ) ) );
    $list4 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "%ADD2" ), makeString( "add2" ), ConsesLow.list( makeSymbol( "NUM1" ), makeSymbol( "NUM2" ) ) ), ConsesLow.list( makeSymbol( "%DIV2" ),
        makeString( "div2" ), ConsesLow.list( makeSymbol( "NUM1" ), makeSymbol( "NUM2" ) ) ), ConsesLow.list( makeSymbol( "%FUNCALL0" ), makeString( "funcall0" ), ConsesLow.list( makeSymbol( "FUNCTION" ) ) ), ConsesLow
            .list( makeSymbol( "%FUNCALL1" ), makeString( "funcall1" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "ARG1" ) ) ), ConsesLow.list( makeSymbol( "%FUNCALL2" ), makeString( "funcall2" ), ConsesLow
                .list( makeSymbol( "FUNCTION" ), makeSymbol( "ARG1" ), makeSymbol( "ARG2" ) ) ), ConsesLow.list( makeSymbol( "%FUNCALL3" ), makeString( "funcall3" ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol(
                    "ARG1" ), makeSymbol( "ARG2" ), makeSymbol( "ARG3" ) ) ), ConsesLow.list( makeSymbol( "%INVERT" ), makeString( "invert" ), ConsesLow.list( makeSymbol( "NUM" ) ) ), ConsesLow.list( makeSymbol(
                        "%MAX2" ), makeString( "max2" ), ConsesLow.list( makeSymbol( "NUM1" ), makeSymbol( "NUM2" ) ) ), ConsesLow.list( makeSymbol( "%MIN2" ), makeString( "min2" ), ConsesLow.list( makeSymbol( "NUM1" ),
                            makeSymbol( "NUM2" ) ) ), ConsesLow.list( makeSymbol( "%MINUS" ), makeString( "minus" ), ConsesLow.list( makeSymbol( "NUM" ) ) ), ConsesLow.list( makeSymbol( "%MULT2" ), makeString( "mult2" ),
                                ConsesLow.list( makeSymbol( "NUM1" ), makeSymbol( "NUM2" ) ) ), ConsesLow.list( makeSymbol( "%SUB2" ), makeString( "sub2" ), ConsesLow.list( makeSymbol( "NUM1" ), makeSymbol( "NUM2" ) ) )
    } );
    $sym5$_DTB = makeSymbol( "%DTB" );
    $sym6$_BTD = makeSymbol( "%BTD" );
    $list7 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeSymbol( "%THROWN-TO" ), makeSymbol( "%B-THROWN-TO" ) ), ConsesLow.cons( makeSymbol( "/=" ), makeSymbol( "%B-/=" ) ), ConsesLow.cons( makeSymbol( "<" ),
        makeSymbol( "%B-<" ) ), ConsesLow.cons( makeSymbol( "<=" ), makeSymbol( "%B-<=" ) ), ConsesLow.cons( makeSymbol( "=" ), makeSymbol( "%B-=" ) ), ConsesLow.cons( makeSymbol( ">" ), makeSymbol( "%B->" ) ), ConsesLow
            .cons( makeSymbol( ">=" ), makeSymbol( "%B->=" ) ), ConsesLow.cons( makeSymbol( "ALPHA-CHAR-P" ), makeSymbol( "%B-ALPHA-CHARP" ) ), ConsesLow.cons( makeSymbol( "ALPHANUMERICP" ), makeSymbol(
                "%B-ALPHANUMERICP" ) ), ConsesLow.cons( makeSymbol( "ATOM" ), makeSymbol( "%B-ATOM" ) ), ConsesLow.cons( makeSymbol( "BOTH-CASE-P" ), makeSymbol( "%B-BOTH-CASEP" ) ), ConsesLow.cons( makeSymbol(
                    "BOUNDP" ), makeSymbol( "%B-BOUNDP" ) ), ConsesLow.cons( makeSymbol( "CHAR-EQUAL" ), makeSymbol( "%B-CHAR-EQUAL" ) ), ConsesLow.cons( makeSymbol( "CHAR-GREATERP" ), makeSymbol( "%B-CHAR-GREATERP" ) ),
      ConsesLow.cons( makeSymbol( "CHAR-LESSP" ), makeSymbol( "%B-CHAR-LESSP" ) ), ConsesLow.cons( makeSymbol( "CHAR-NOT-EQUAL" ), makeSymbol( "%B-CHAR-NOT-EQUAL" ) ), ConsesLow.cons( makeSymbol( "CHAR-NOT-GREATERP" ),
          makeSymbol( "%B-CHAR-NOT-GREATERP" ) ), ConsesLow.cons( makeSymbol( "CHAR-NOT-LESSP" ), makeSymbol( "%B-CHAR-NOT-LESSP" ) ), ConsesLow.cons( makeSymbol( "CHAR/=" ), makeSymbol( "%B-CHAR/=" ) ), ConsesLow.cons(
              makeSymbol( "CHAR<" ), makeSymbol( "%B-CHAR<" ) ), ConsesLow.cons( makeSymbol( "CHAR<=" ), makeSymbol( "%B-CHAR<=" ) ), ConsesLow.cons( makeSymbol( "CHAR=" ), makeSymbol( "%B-CHAR=" ) ), ConsesLow.cons(
                  makeSymbol( "CHAR>" ), makeSymbol( "%B-CHAR>" ) ), ConsesLow.cons( makeSymbol( "CHAR>=" ), makeSymbol( "%B-CHAR>=" ) ), ConsesLow.cons( makeSymbol( "CHARACTERP" ), makeSymbol( "%B-CHARACTERP" ) ),
      ConsesLow.cons( makeSymbol( "CONSP" ), makeSymbol( "%B-CONSP" ) ), ConsesLow.cons( EQ, makeSymbol( "%B-EQ" ) ), ConsesLow.cons( EQL, makeSymbol( "%B-EQL" ) ), ConsesLow.cons( EQUAL, makeSymbol( "%B-EQUAL" ) ),
      ConsesLow.cons( EQUALP, makeSymbol( "%B-EQUALP" ) ), ConsesLow.cons( makeSymbol( "EVENP" ), makeSymbol( "%B-EVENP" ) ), ConsesLow.cons( makeSymbol( "FBOUNDP" ), makeSymbol( "%B-FBOUNDP" ) ), ConsesLow.cons(
          makeSymbol( "FIXNUMP" ), makeSymbol( "%B-FIXNUMP" ) ), ConsesLow.cons( makeSymbol( "FLOATP" ), makeSymbol( "%B-FLOATP" ) ), ConsesLow.cons( makeSymbol( "FUNCTION-SPEC-P" ), makeSymbol( "%B-FUNCTION-SPEC-P" ) ),
      ConsesLow.cons( makeSymbol( "FUNCTIONP" ), makeSymbol( "%B-FUNCTIONP" ) ), ConsesLow.cons( makeSymbol( "GUID-P" ), makeSymbol( "%B-GUID-P" ) ), ConsesLow.cons( makeSymbol( "HASH-TABLE-P" ), makeSymbol(
          "%B-HASH-TABLE-P" ) ), ConsesLow.cons( makeSymbol( "INTEGERP" ), makeSymbol( "%B-INTEGERP" ) ), ConsesLow.cons( makeSymbol( "KEYWORDP" ), makeSymbol( "%B-KEYWORDP" ) ), ConsesLow.cons( makeSymbol( "LISTP" ),
              makeSymbol( "%B-LISTP" ) ), ConsesLow.cons( makeSymbol( "LOCK-P" ), makeSymbol( "%B-LOCK-P" ) ), ConsesLow.cons( makeSymbol( "LOWER-CASE-P" ), makeSymbol( "%B-LOWER-CASEP" ) ), ConsesLow.cons( makeSymbol(
                  "MACRO-OPERATOR-P" ), makeSymbol( "%B-MACRO-OPERATOR-P" ) ), ConsesLow.cons( makeSymbol( "MINUSP" ), makeSymbol( "%B-MINUSP" ) ), ConsesLow.cons( makeSymbol( "NULL" ), makeSymbol( "%B-NULL" ) ),
      ConsesLow.cons( makeSymbol( "NUMBERP" ), makeSymbol( "%B-NUMBERP" ) ), ConsesLow.cons( makeSymbol( "ODDP" ), makeSymbol( "%B-ODDP" ) ), ConsesLow.cons( makeSymbol( "PACKAGEP" ), makeSymbol( "%B-PACKAGEP" ) ),
      ConsesLow.cons( makeSymbol( "PLUSP" ), makeSymbol( "%B-PLUSP" ) ), ConsesLow.cons( makeSymbol( "PROBE-FILE" ), makeSymbol( "%B-PROBE-FILE" ) ), ConsesLow.cons( makeSymbol( "PROCESSP" ), makeSymbol(
          "%B-PROCESSP" ) ), ConsesLow.cons( makeSymbol( "SEQUENCEP" ), makeSymbol( "%B-SEQUENCEP" ) ), ConsesLow.cons( makeSymbol( "STREAMP" ), makeSymbol( "%B-STREAMP" ) ), ConsesLow.cons( makeSymbol( "STRING-EQUAL" ),
              makeSymbol( "%B-STRING-EQUAL" ) ), ConsesLow.cons( makeSymbol( "STRING-GREATERP" ), makeSymbol( "%B-STRING-GREATERP" ) ), ConsesLow.cons( makeSymbol( "STRING-LESSP" ), makeSymbol( "%B-STRING-LESSP" ) ),
      ConsesLow.cons( makeSymbol( "STRING-NOT-EQUAL" ), makeSymbol( "%B-STRING-NOT-EQUAL" ) ), ConsesLow.cons( makeSymbol( "STRING-NOT-GREATERP" ), makeSymbol( "%B-STRING-NOT-GREATERP" ) ), ConsesLow.cons( makeSymbol(
          "STRING-NOT-LESSP" ), makeSymbol( "%B-STRING-NOT-LESSP" ) ), ConsesLow.cons( makeSymbol( "STRING/=" ), makeSymbol( "%B-STRING/=" ) ), ConsesLow.cons( makeSymbol( "STRING<" ), makeSymbol( "%B-STRING<" ) ),
      ConsesLow.cons( makeSymbol( "STRING<=" ), makeSymbol( "%B-STRING<=" ) ), ConsesLow.cons( makeSymbol( "STRING=" ), makeSymbol( "%B-STRING=" ) ), ConsesLow.cons( makeSymbol( "STRING>" ), makeSymbol( "%B-STRING>" ) ),
      ConsesLow.cons( makeSymbol( "STRING>=" ), makeSymbol( "%B-STRING>=" ) ), ConsesLow.cons( makeSymbol( "STRINGP" ), makeSymbol( "%B-STRINGP" ) ), ConsesLow.cons( makeSymbol( "ALIEN-P", "SUBLISP" ), makeSymbol(
          "%B-ALIEN-P" ) ), ConsesLow.cons( makeSymbol( "_STRUCTURES-BAG-P", "SUBLISP" ), makeSymbol( "%B-STRUCTURES-BAG-P" ) ), ConsesLow.cons( makeSymbol( "SYMBOLP" ), makeSymbol( "%B-SYMBOLP" ) ), ConsesLow.cons(
              makeSymbol( "UPPER-CASE-P" ), makeSymbol( "%B-UPPER-CASEP" ) ), ConsesLow.cons( makeSymbol( "VECTORP" ), makeSymbol( "%B-VECTORP" ) ), ConsesLow.cons( makeSymbol( "ZEROP" ), makeSymbol( "%B-ZEROP" ) )
    } );
    $kw8$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $list9 = ConsesLow.cons( makeSymbol( "FUNCTION" ), makeSymbol( "BOOLEAN-VERSION" ) );
    $list10 = _constant_10_initializer();
    $list11 = ConsesLow.list( makeSymbol( "SYMBOL" ), makeSymbol( "C-BACKEND-NAME" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "ARGLIST" ) );
    $kw12$UNSPECIFIED = makeKeyword( "UNSPECIFIED" );
    $int13$500 = makeInteger( 500 );
    $list14 = ConsesLow.list( makeSymbol( "SYMBOL" ), makeSymbol( "C-BACKEND-NAME" ) );
    $list15 = _constant_15_initializer();
    $list16 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "*" ), makeString( "gv_S" ) ), ConsesLow.list( makeSymbol( "**" ), makeString( "gv_SS" ) ), ConsesLow.list( makeSymbol( "***" ), makeString(
        "gv_SSS" ) ), ConsesLow.list( makeSymbol( "*BREAK-ON-ERROR?*" ), makeString( "gv_break_on_errorP" ) ), ConsesLow.list( makeSymbol( "*BREAK-ON-WARN?*" ), makeString( "gv_break_on_warnP" ) ), ConsesLow.list(
            makeSymbol( "*CONTINUE-CERROR?*" ), makeString( "gv_continue_cerrorP" ) ), ConsesLow.list( makeSymbol( "*CURRENT-AREA*" ), makeString( "gv_current_area" ) ), ConsesLow.list( makeSymbol( "*DEBUG-IO*" ),
                makeString( "gv_debug_io" ) ), ConsesLow.list( makeSymbol( "*DEFAULT-PATHNAME-DEFAULTS*" ), makeString( "gv_default_pathname_defaults" ) ), ConsesLow.list( makeSymbol( "*ERROR-ABORT-HANDLER*" ),
                    makeString( "gv_error_abort_handler" ) ), ConsesLow.list( makeSymbol( "*ERROR-HANDLER*" ), makeString( "gv_error_handler" ) ), ConsesLow.list( makeSymbol( "*ERROR-MESSAGE*" ), makeString(
                        "gv_error_message" ) ), ConsesLow.list( makeSymbol( "*ERROR-OUTPUT*" ), makeString( "gv_error_output" ) ), ConsesLow.list( makeSymbol( "*EXP1*" ), makeString( "gv_exp1" ) ), ConsesLow.list(
                            makeSymbol( "*FEATURES*" ), makeString( "gv_features" ) ), ConsesLow.list( makeSymbol( "*GENSYM-COUNTER*" ), makeString( "gv_gensym_counter" ) ), ConsesLow.list( makeSymbol(
                                "*IGNORE-BREAKS?*" ), makeString( "gv_ignore_breaksP" ) ), ConsesLow.list( makeSymbol( "*IGNORE-MUSTS?*" ), makeString( "gv_ignore_mustsP" ) ), ConsesLow.list( makeSymbol(
                                    "*IGNORE-WARNS?*" ), makeString( "gv_ignore_warnsP" ) ), ConsesLow.list( makeSymbol( "*INTERNAL-TIME-UNITS-PER-SECOND*" ), makeString( "gv_internal_time_units_per_second" ) ),
      ConsesLow.list( makeSymbol( "*MOST-NEGATIVE-FIXNUM*" ), makeString( "gv_most_negative_fixnum" ) ), ConsesLow.list( makeSymbol( "*MOST-POSITIVE-FIXNUM*" ), makeString( "gv_most_positive_fixnum" ) ), ConsesLow.list(
          makeSymbol( "*NULL-INPUT*" ), makeString( "gv_null_input" ) ), ConsesLow.list( makeSymbol( "*NULL-OUTPUT*" ), makeString( "gv_null_output" ) ), ConsesLow.list( makeSymbol( "*PACKAGE*" ), makeString(
              "gv_current_package" ) ), ConsesLow.list( makeSymbol( "*PRINT-BASE*" ), makeString( "gv_print_base" ) ), ConsesLow.list( makeSymbol( "*PRINT-CASE*" ), makeString( "gv_print_case" ) ), ConsesLow.list(
                  makeSymbol( "*PRINT-ESCAPE*" ), makeString( "gv_print_escape" ) ), ConsesLow.list( makeSymbol( "*PRINT-LENGTH*" ), makeString( "gv_print_length" ) ), ConsesLow.list( makeSymbol( "*PRINT-LEVEL*" ),
                      makeString( "gv_print_level" ) ), ConsesLow.list( makeSymbol( "*PRINT-PRETTY*" ), makeString( "gv_print_pretty" ) ), ConsesLow.list( makeSymbol( "*PRINT-READABLY*" ), makeString(
                          "gv_print_readably" ) ), ConsesLow.list( makeSymbol( "*PROCESS-BACKGROUND-PRIORITY*" ), makeString( "gv_process_background_priority" ) ), ConsesLow.list( makeSymbol( "*PROCESS-MAX-PRIORITY*" ),
                              makeString( "gv_process_max_priority" ) ), ConsesLow.list( makeSymbol( "*PROCESS-MIN-PRIORITY*" ), makeString( "gv_process_min_priority" ) ), ConsesLow.list( makeSymbol(
                                  "*PROCESS-NORMAL-PRIORITY*" ), makeString( "gv_process_normal_priority" ) ), ConsesLow.list( makeSymbol( "*RAND-MAX*" ), makeString( "gv_rand_max" ) ), ConsesLow.list( makeSymbol(
                                      "*READ-DEFAULT-FLOAT-FORMAT*" ), makeString( "gv_read_default_float_format" ) ), ConsesLow.list( makeSymbol( "*READ-EVAL*" ), makeString( "gv_read_eval" ) ), ConsesLow.list(
                                          makeSymbol( "*READ-SUPPRESS*" ), makeString( "gv_read_suppress" ) ), ConsesLow.list( makeSymbol( "*READTABLE*" ), makeString( "gv_readtable" ) ), ConsesLow.list( makeSymbol(
                                              "*RETAIN-CLIENT-SOCKET?*" ), makeString( "gv_retain_client_socketP" ) ), ConsesLow.list( makeSymbol( "*STANDARD-INPUT*" ), makeString( "gv_standard_input" ) ), ConsesLow
                                                  .list( makeSymbol( "*STANDARD-OUTPUT*" ), makeString( "gv_standard_output" ) ), ConsesLow.list( makeSymbol( "*STREAM-INITIAL-INPUT-BUFFER-SIZE*" ), makeString(
                                                      "gv_stream_initial_input_buffer_size" ) ), ConsesLow.list( makeSymbol( "*STREAM-INITIAL-OUTPUT-BUFFER-SIZE*" ), makeString(
                                                          "gv_stream_initial_output_buffer_size" ) ), ConsesLow.list( makeSymbol( "*SUSPEND-TYPE-CHECKING?*" ), makeString( "gv_suspend_type_checkingP" ) ), ConsesLow.list(
                                                              makeSymbol( "*TERMINAL-IO*" ), makeString( "gv_terminal_io" ) ), ConsesLow.list( makeSymbol( "*TCP-LOCALHOST-ONLY?*" ), makeString(
                                                                  "gv_tcp_localhost_onlyP" ) ), ConsesLow.list( makeSymbol( "*TRACE-OUTPUT*" ), makeString( "gv_trace_output" ) ), ConsesLow.list( makeSymbol( "BOOLE-1" ),
                                                                      makeString( "gv_boole_1" ) ), ConsesLow.list( makeSymbol( "BOOLE-2" ), makeString( "gv_boole_2" ) ), ConsesLow.list( makeSymbol( "BOOLE-AND" ),
                                                                          makeString( "gv_boole_and" ) ), ConsesLow.list( makeSymbol( "BOOLE-ANDC1" ), makeString( "gv_boole_andc1" ) ), ConsesLow.list( makeSymbol(
                                                                              "BOOLE-ANDC2" ), makeString( "gv_boole_andc2" ) ), ConsesLow.list( makeSymbol( "BOOLE-C1" ), makeString( "gv_boole_c1" ) ), ConsesLow.list(
                                                                                  makeSymbol( "BOOLE-C2" ), makeString( "gv_boole_c2" ) ), ConsesLow.list( makeSymbol( "BOOLE-CLR" ), makeString( "gv_boole_clr" ) ),
      ConsesLow.list( makeSymbol( "BOOLE-EQV" ), makeString( "gv_boole_eqv" ) ), ConsesLow.list( makeSymbol( "BOOLE-IOR" ), makeString( "gv_boole_ior" ) ), ConsesLow.list( makeSymbol( "BOOLE-NAND" ), makeString(
          "gv_boole_nand" ) ), ConsesLow.list( makeSymbol( "BOOLE-NOR" ), makeString( "gv_boole_nor" ) ), ConsesLow.list( makeSymbol( "BOOLE-ORC1" ), makeString( "gv_boole_orc1" ) ), ConsesLow.list( makeSymbol(
              "BOOLE-ORC2" ), makeString( "gv_boole_orc2" ) ), ConsesLow.list( makeSymbol( "BOOLE-SET" ), makeString( "gv_boole_set" ) ), ConsesLow.list( makeSymbol( "BOOLE-XOR" ), makeString( "gv_boole_xor" ) ),
      ConsesLow.list( makeSymbol( "*PRINT-OBJECT-METHOD-TABLE*", "SUBLISP" ), makeString( "gv_print_object_method_table" ) ), ConsesLow.list( makeSymbol( "*RESTARTS*", "SUBLISP" ), makeString( "gv_restarts" ) ),
      ConsesLow.list( makeSymbol( "*STREAM-REQUIRES-LOCKING*", "SUBLISP" ), makeString( "gv_stream_requires_locking" ) ), ConsesLow.list( makeSymbol( "*SXHASH-METHOD-TABLE*" ), makeString( "gv_sxhash_method_table" ) ),
      ConsesLow.list( makeSymbol( "*VISIT-DEFSTRUCT-OBJECT-METHOD-TABLE*", "SUBLISP" ), makeString( "gv_visit_defstruct_object_method_table" ) ), ConsesLow.list( makeSymbol( "*CALL-PROFILING-ENABLED?*", "SUBLISP" ),
          makeString( "gv_call_profiling_enabledP" ) ), ConsesLow.list( makeSymbol( "*CALL-PROFILING-TABLE*", "SUBLISP" ), makeString( "gv_call_profiling_table" ) )
    } );
    $list17 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeSymbol( "*DTP-SYMBOL*" ), makeString( "gv_dtp_symbol" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*DTP-CONS*" ), makeString(
        "gv_dtp_cons" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*DTP-FIXNUM*" ), makeString( "gv_dtp_fixnum" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*DTP-FLOAT*" ), makeString(
            "gv_dtp_float" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*DTP-CHARACTER*" ), makeString( "gv_dtp_character" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*DTP-STRING*" ),
                makeString( "gv_dtp_string" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*DTP-VECTOR*" ), makeString( "gv_dtp_vector" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol(
                    "*DTP-FUNCTION*" ), makeString( "gv_dtp_function" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*DTP-HASH-TABLE*" ), makeString( "gv_dtp_hash_table" ), makeKeyword( "CONSTANT" ) ),
      ConsesLow.list( makeSymbol( "*DTP-PACKAGE*" ), makeString( "gv_dtp_package" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*DTP-STREAM*" ), makeString( "gv_dtp_stream" ), makeKeyword( "CONSTANT" ) ),
      ConsesLow.list( makeSymbol( "*DTP-BIGNUM*" ), makeString( "gv_dtp_bignum" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*DTP-GUID*" ), makeString( "gv_dtp_guid" ), makeKeyword( "CONSTANT" ) ),
      ConsesLow.list( makeSymbol( "*DTP-LOCK*" ), makeString( "gv_dtp_lock" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*DTP-PROCESS*" ), makeString( "gv_dtp_process" ), makeKeyword( "CONSTANT" ) ),
      ConsesLow.list( makeSymbol( "*DTP-STRUCTURES-BAG*" ), makeString( "gv_dtp_structures_bag" ), makeKeyword( "CONSTANT" ) ), ConsesLow.list( makeSymbol( "*%EVALUATOR-METHOD*", "SUBLISP" ), makeString(
          "gv_evaluator_method" ), makeKeyword( "DYNAMIC" ) ), ConsesLow.list( makeSymbol( "*REMOTE-ADDRESS*", "SUBLISP" ), makeString( "gv_remote_address" ), makeKeyword( "DYNAMIC" ) ), ConsesLow.list( makeSymbol(
              "*REMOTE-HOSTNAME*", "SUBLISP" ), makeString( "gv_remote_hostname" ), makeKeyword( "DYNAMIC" ) )
    } );
  }
}
/*
 * 
 * Total time: 1160 ms
 * 
 */