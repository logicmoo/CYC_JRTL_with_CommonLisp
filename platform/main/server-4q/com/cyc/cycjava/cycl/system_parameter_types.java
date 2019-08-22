package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class system_parameter_types
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.system_parameter_types";
  public static final String myFingerPrint = "6d16ff56b981d4679e71541ba19745f517a5aad1849d687da9ba953cf7c1f95e";
  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-types.lisp", position = 1053L)
  private static SubLSymbol $system_parameter_type_definitions$;
  private static final SubLSymbol $sym0$_SYSTEM_PARAMETER_TYPE_DEFINITIONS_;
  private static final SubLSymbol $kw1$SYMBOL;
  private static final SubLSymbol $kw2$VALUES;
  private static final SubLSymbol $kw3$CHECKER;
  private static final SubLInteger $int4$65536;
  private static final SubLSymbol $sym5$UNDEFINED;
  private static final SubLString $str6$undefined;
  private static final SubLSymbol $sym7$NULL;
  private static final SubLSymbol $sym8$BOOLEAN;
  private static final SubLString $str9$__TRUE___or___FALSE__;
  private static final SubLSymbol $sym10$BOOLEAN_CHECKER_P;
  private static final SubLSymbol $sym11$STRING;
  private static final SubLString $str12$a_string;
  private static final SubLSymbol $sym13$STRINGP;
  private static final SubLSymbol $sym14$FULL_PATH;
  private static final SubLString $str15$a_valid_directory_path;
  private static final SubLSymbol $sym16$DIRECTORY_P;
  private static final SubLSymbol $sym17$INTEGER;
  private static final SubLString $str18$an_integer;
  private static final SubLSymbol $sym19$INTEGERP;
  private static final SubLSymbol $sym20$SYMBOL;
  private static final SubLString $str21$a_symbol;
  private static final SubLSymbol $sym22$SYMBOLP;
  private static final SubLSymbol $sym23$PORT;
  private static final SubLString $str24$a_TCP_IP_port_number;
  private static final SubLSymbol $sym25$PORT_CHECKER_P;
  private static final SubLSymbol $sym26$PORT_OFFSET;
  private static final SubLString $str27$a_TCP_IP_port_offset;
  private static final SubLString $str28$;
  private static final SubLSymbol $sym29$FALSE;
  private static final SubLSymbol $sym30$CAR;
  private static final SubLSymbol $kw31$SUBL;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$OR;
  private static final SubLSymbol $sym34$AND;
  private static final SubLString $str35$_;
  private static final SubLSymbol $sym36$MEMBER;
  private static final SubLString $str37$one_of_;
  private static final SubLString $str38$__;
  private static final SubLString $str39$Cannot_interpret_type__A_declarat;
  private static final SubLString $str40$Invalid_operator__A_should_have_b;
  private static final SubLString $str41$Implementation_error__invalid_typ;

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-types.lisp", position = 1266L)
  public static SubLObject register_system_parameter_type(final SubLObject symbol, final SubLObject possible_value_string, final SubLObject checker_fn)
  {
    final SubLObject description = ConsesLow.list( $kw1$SYMBOL, symbol, $kw2$VALUES, possible_value_string, $kw3$CHECKER, checker_fn );
    $system_parameter_type_definitions$.setGlobalValue( list_utilities.alist_enter( $system_parameter_type_definitions$.getGlobalValue(), symbol, description, UNPROVIDED ) );
    return symbol;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-types.lisp", position = 1774L)
  public static SubLObject boolean_checker_p(final SubLObject obj)
  {
    return makeBoolean( obj == T || obj == NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-types.lisp", position = 1854L)
  public static SubLObject port_checker_p(final SubLObject obj)
  {
    return makeBoolean( NIL != subl_promotions.non_negative_integer_p( obj ) && obj.numL( $int4$65536 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-types.lisp", position = 2659L)
  public static SubLObject get_system_parameter_type_possible_values_string(final SubLObject type)
  {
    final SubLObject description = list_utilities.alist_lookup( $system_parameter_type_definitions$.getGlobalValue(), type, UNPROVIDED, UNPROVIDED );
    return conses_high.getf( description, $kw2$VALUES, $str28$ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-types.lisp", position = 2898L)
  public static SubLObject get_system_parameter_type_checker(final SubLObject type)
  {
    final SubLObject description = list_utilities.alist_lookup( $system_parameter_type_definitions$.getGlobalValue(), type, UNPROVIDED, UNPROVIDED );
    return conses_high.getf( description, $kw3$CHECKER, $sym29$FALSE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-types.lisp", position = 3140L)
  public static SubLObject get_system_parameter_member_type_members(final SubLObject inner_types)
  {
    final SubLObject alist = Symbols.symbol_value( inner_types.first() );
    final SubLObject values = Mapping.mapcar( $sym30$CAR, alist );
    return values;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-types.lisp", position = 3325L)
  public static SubLObject determine_system_parameter_type_possible_values_string(final SubLObject type, SubLObject flavor)
  {
    if( flavor == UNPROVIDED )
    {
      flavor = $kw31$SUBL;
    }
    SubLObject value_string = $str28$;
    if( type.isCons() )
    {
      SubLObject s = NIL;
      try
      {
        s = streams_high.make_private_string_output_stream();
        SubLObject operator = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( type, type, $list32 );
        operator = type.first();
        final SubLObject inner_types;
        final SubLObject current = inner_types = type.rest();
        if( $sym33$OR == operator || $sym34$AND == operator )
        {
          final SubLObject op_name = Strings.string_downcase( Symbols.symbol_name( operator ), UNPROVIDED, UNPROVIDED );
          SubLObject list_var = NIL;
          SubLObject inner_type = NIL;
          SubLObject index = NIL;
          list_var = inner_types;
          inner_type = list_var.first();
          for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), inner_type = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
          {
            final SubLObject inner_value_string = determine_system_parameter_type_possible_values_string( inner_type, UNPROVIDED );
            if( !index.isZero() )
            {
              streams_high.write_string( $str35$_, s, UNPROVIDED, UNPROVIDED );
              streams_high.write_string( op_name, s, UNPROVIDED, UNPROVIDED );
              streams_high.write_string( $str35$_, s, UNPROVIDED, UNPROVIDED );
            }
            streams_high.write_string( inner_value_string, s, UNPROVIDED, UNPROVIDED );
          }
        }
        else if( $sym36$MEMBER == operator )
        {
          final SubLObject values = get_system_parameter_member_type_members( inner_types );
          SubLObject list_var = NIL;
          SubLObject value = NIL;
          SubLObject index = NIL;
          list_var = values;
          value = list_var.first();
          for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), value = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
          {
            if( index.isZero() )
            {
              streams_high.write_string( $str37$one_of_, s, UNPROVIDED, UNPROVIDED );
            }
            else
            {
              streams_high.write_string( $str38$__, s, UNPROVIDED, UNPROVIDED );
            }
            if( $kw31$SUBL == flavor )
            {
              print_high.prin1( value, s );
            }
            else
            {
              print_high.princ( value, s );
            }
          }
        }
        else
        {
          Errors.error( $str39$Cannot_interpret_type__A_declarat );
        }
        value_string = streams_high.get_output_stream_string( s );
      }
      finally
      {
        final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values = Values.getValuesAsVector();
          streams_high.close( s, UNPROVIDED );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
    }
    else if( type.isSymbol() )
    {
      value_string = get_system_parameter_type_possible_values_string( type );
    }
    return value_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-types.lisp", position = 4824L)
  public static SubLObject valid_system_parameter_typeP(final SubLObject type)
  {
    if( type.isCons() )
    {
      SubLObject operator = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( type, type, $list32 );
      operator = type.first();
      final SubLObject inner_types;
      final SubLObject current = inner_types = type.rest();
      if( $sym33$OR == operator || $sym34$AND == operator )
      {
        SubLObject cdolist_list_var = inner_types;
        SubLObject inner_type = NIL;
        inner_type = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == valid_system_parameter_typeP( inner_type ) )
          {
            return NIL;
          }
          cdolist_list_var = cdolist_list_var.rest();
          inner_type = cdolist_list_var.first();
        }
      }
      else
      {
        if( $sym36$MEMBER != operator )
        {
          return NIL;
        }
        final SubLObject values = get_system_parameter_member_type_members( inner_types );
      }
      return T;
    }
    if( type.isSymbol() )
    {
      return list_utilities.alist_has_keyP( $system_parameter_type_definitions$.getGlobalValue(), type, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-parameter-types.lisp", position = 5685L)
  public static SubLObject check_system_parameter_value(final SubLObject value, final SubLObject type)
  {
    if( type.isCons() )
    {
      SubLObject operator = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( type, type, $list32 );
      operator = type.first();
      final SubLObject inner_types;
      final SubLObject current = inner_types = type.rest();
      final SubLObject pcase_var = operator;
      if( pcase_var.eql( $sym33$OR ) )
      {
        SubLObject cdolist_list_var = inner_types;
        SubLObject inner_type = NIL;
        inner_type = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL != check_system_parameter_value( value, inner_type ) )
          {
            return T;
          }
          cdolist_list_var = cdolist_list_var.rest();
          inner_type = cdolist_list_var.first();
        }
        return NIL;
      }
      if( pcase_var.eql( $sym34$AND ) )
      {
        SubLObject cdolist_list_var = inner_types;
        SubLObject inner_type = NIL;
        inner_type = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == check_system_parameter_value( value, inner_type ) )
          {
            return NIL;
          }
          cdolist_list_var = cdolist_list_var.rest();
          inner_type = cdolist_list_var.first();
        }
        return T;
      }
      if( pcase_var.eql( $sym36$MEMBER ) )
      {
        final SubLObject values = get_system_parameter_member_type_members( inner_types );
        return subl_promotions.memberP( value, values, EQUAL, UNPROVIDED );
      }
      Errors.error( $str40$Invalid_operator__A_should_have_b, type );
    }
    else
    {
      if( type.isSymbol() )
      {
        final SubLObject checker_fn = get_system_parameter_type_checker( type );
        return Functions.funcall( checker_fn, value );
      }
      Errors.error( $str41$Implementation_error__invalid_typ );
    }
    return NIL;
  }

  public static SubLObject declare_system_parameter_types_file()
  {
    SubLFiles.declareFunction( me, "register_system_parameter_type", "REGISTER-SYSTEM-PARAMETER-TYPE", 3, 0, false );
    SubLFiles.declareFunction( me, "boolean_checker_p", "BOOLEAN-CHECKER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "port_checker_p", "PORT-CHECKER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_system_parameter_type_possible_values_string", "GET-SYSTEM-PARAMETER-TYPE-POSSIBLE-VALUES-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "get_system_parameter_type_checker", "GET-SYSTEM-PARAMETER-TYPE-CHECKER", 1, 0, false );
    SubLFiles.declareFunction( me, "get_system_parameter_member_type_members", "GET-SYSTEM-PARAMETER-MEMBER-TYPE-MEMBERS", 1, 0, false );
    SubLFiles.declareFunction( me, "determine_system_parameter_type_possible_values_string", "DETERMINE-SYSTEM-PARAMETER-TYPE-POSSIBLE-VALUES-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "valid_system_parameter_typeP", "VALID-SYSTEM-PARAMETER-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "check_system_parameter_value", "CHECK-SYSTEM-PARAMETER-VALUE", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_system_parameter_types_file()
  {
    $system_parameter_type_definitions$ = SubLFiles.deflexical( "*SYSTEM-PARAMETER-TYPE-DEFINITIONS*", ( maybeDefault( $sym0$_SYSTEM_PARAMETER_TYPE_DEFINITIONS_, $system_parameter_type_definitions$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_system_parameter_types_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_SYSTEM_PARAMETER_TYPE_DEFINITIONS_ );
    register_system_parameter_type( $sym5$UNDEFINED, $str6$undefined, $sym7$NULL );
    register_system_parameter_type( $sym8$BOOLEAN, $str9$__TRUE___or___FALSE__, $sym10$BOOLEAN_CHECKER_P );
    register_system_parameter_type( $sym11$STRING, $str12$a_string, $sym13$STRINGP );
    register_system_parameter_type( $sym14$FULL_PATH, $str15$a_valid_directory_path, $sym16$DIRECTORY_P );
    register_system_parameter_type( $sym17$INTEGER, $str18$an_integer, $sym19$INTEGERP );
    register_system_parameter_type( $sym20$SYMBOL, $str21$a_symbol, $sym22$SYMBOLP );
    register_system_parameter_type( $sym23$PORT, $str24$a_TCP_IP_port_number, $sym25$PORT_CHECKER_P );
    register_system_parameter_type( $sym26$PORT_OFFSET, $str27$a_TCP_IP_port_offset, $sym25$PORT_CHECKER_P );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_system_parameter_types_file();
  }

  @Override
  public void initializeVariables()
  {
    init_system_parameter_types_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_system_parameter_types_file();
  }
  static
  {
    me = new system_parameter_types();
    $system_parameter_type_definitions$ = null;
    $sym0$_SYSTEM_PARAMETER_TYPE_DEFINITIONS_ = makeSymbol( "*SYSTEM-PARAMETER-TYPE-DEFINITIONS*" );
    $kw1$SYMBOL = makeKeyword( "SYMBOL" );
    $kw2$VALUES = makeKeyword( "VALUES" );
    $kw3$CHECKER = makeKeyword( "CHECKER" );
    $int4$65536 = makeInteger( 65536 );
    $sym5$UNDEFINED = makeSymbol( "UNDEFINED" );
    $str6$undefined = makeString( "undefined" );
    $sym7$NULL = makeSymbol( "NULL" );
    $sym8$BOOLEAN = makeSymbol( "BOOLEAN" );
    $str9$__TRUE___or___FALSE__ = makeString( "::TRUE:: or ::FALSE::" );
    $sym10$BOOLEAN_CHECKER_P = makeSymbol( "BOOLEAN-CHECKER-P" );
    $sym11$STRING = makeSymbol( "STRING" );
    $str12$a_string = makeString( "a string" );
    $sym13$STRINGP = makeSymbol( "STRINGP" );
    $sym14$FULL_PATH = makeSymbol( "FULL-PATH" );
    $str15$a_valid_directory_path = makeString( "a valid directory path" );
    $sym16$DIRECTORY_P = makeSymbol( "DIRECTORY-P" );
    $sym17$INTEGER = makeSymbol( "INTEGER" );
    $str18$an_integer = makeString( "an integer" );
    $sym19$INTEGERP = makeSymbol( "INTEGERP" );
    $sym20$SYMBOL = makeSymbol( "SYMBOL" );
    $str21$a_symbol = makeString( "a symbol" );
    $sym22$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym23$PORT = makeSymbol( "PORT" );
    $str24$a_TCP_IP_port_number = makeString( "a TCP/IP port number" );
    $sym25$PORT_CHECKER_P = makeSymbol( "PORT-CHECKER-P" );
    $sym26$PORT_OFFSET = makeSymbol( "PORT-OFFSET" );
    $str27$a_TCP_IP_port_offset = makeString( "a TCP/IP port offset" );
    $str28$ = makeString( "" );
    $sym29$FALSE = makeSymbol( "FALSE" );
    $sym30$CAR = makeSymbol( "CAR" );
    $kw31$SUBL = makeKeyword( "SUBL" );
    $list32 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "&REST" ), makeSymbol( "INNER-TYPES" ) );
    $sym33$OR = makeSymbol( "OR" );
    $sym34$AND = makeSymbol( "AND" );
    $str35$_ = makeString( " " );
    $sym36$MEMBER = makeSymbol( "MEMBER" );
    $str37$one_of_ = makeString( "one of " );
    $str38$__ = makeString( ", " );
    $str39$Cannot_interpret_type__A_declarat = makeString( "Cannot interpret type ~A declaration." );
    $str40$Invalid_operator__A_should_have_b = makeString( "Invalid operator ~A should have been filtered before here." );
    $str41$Implementation_error__invalid_typ = makeString( "Implementation error, invalid type ~A should have been filtered before here." );
  }
}
/*
 * 
 * Total time: 138 ms
 * 
 */