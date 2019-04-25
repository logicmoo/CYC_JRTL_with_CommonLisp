package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_java_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_java_utilities";
  public static final String myFingerPrint = "01487c5d8695cdfaa99211fdd6cf5b77db938df9db085326f3fbdb3be4f89970";
  @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 2152L)
  public static SubLSymbol $cb_java_applet_tunnel_active$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 2325L)
  public static SubLSymbol $cb_java_applet_tunnel_logins$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 2411L)
  public static SubLSymbol $cb_java_applet_tunnel_exposed_host$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 2540L)
  public static SubLSymbol $cb_java_applet_tunnel_exposed_port$;
  private static final SubLString $str0$_;
  private static final SubLList $list1;
  private static final SubLString $str2$_;
  private static final SubLSymbol $sym3$CCONCATENATE;
  private static final SubLInteger $int4$512;
  private static final SubLString $str5$;
  private static final SubLInteger $int6$9096;
  private static final SubLInteger $int7$30;
  private static final SubLString $str8$hiddenHost;
  private static final SubLString $str9$hiddenPort;
  private static final SubLString $str10$exposedHost;
  private static final SubLString $str11$exposedPort;
  private static final SubLString $str12$login;
  private static final SubLString $str13$password;

  @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 849L)
  public static SubLObject cb_java_applet_construct_window_options(final SubLObject options)
  {
    SubLObject pieces = NIL;
    SubLObject cdolist_list_var = options;
    SubLObject option = NIL;
    option = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      pieces = ConsesLow.cons( $str0$_, pieces );
      SubLObject current;
      final SubLObject datum = current = option;
      SubLObject command = NIL;
      SubLObject value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
      command = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
      value = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject command_string = cb_java_applet_convert_to_option_string( command );
        final SubLObject value_string = cb_java_applet_convert_to_option_string( value );
        pieces = ConsesLow.cons( command_string, pieces );
        pieces = ConsesLow.cons( $str2$_, pieces );
        pieces = ConsesLow.cons( value_string, pieces );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list1 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      option = cdolist_list_var.first();
    }
    pieces = Sequences.nreverse( pieces );
    pieces = pieces.rest();
    return Functions.apply( $sym3$CCONCATENATE, pieces );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 1811L)
  public static SubLObject cb_java_applet_convert_to_option_string(final SubLObject v_object)
  {
    SubLObject rc = NIL;
    if( v_object.isNumber() )
    {
      rc = string_utilities.to_string( v_object );
    }
    else if( v_object.isSymbol() )
    {
      rc = Strings.string_downcase( Symbols.symbol_name( v_object ), UNPROVIDED, UNPROVIDED );
    }
    else if( v_object.isString() )
    {
      rc = v_object;
    }
    else
    {
      rc = string_utilities.to_string( v_object );
    }
    return rc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 2607L)
  public static SubLObject cb_java_applet_tunnel_gen_token()
  {
    return random.random( Numbers.expt( TWO_INTEGER, $int7$30 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 2711L)
  public static SubLObject cb_java_applet_tunnel_create_login()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject user = cb_java_applet_tunnel_gen_token();
    final SubLObject pass = cb_java_applet_tunnel_gen_token();
    Hashtables.sethash( user, $cb_java_applet_tunnel_logins$.getDynamicValue( thread ), pass );
    return ConsesLow.list( user, pass );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 2943L)
  public static SubLObject tunnel_login_username(final SubLObject tunnel_login)
  {
    return tunnel_login.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 3027L)
  public static SubLObject tunnel_login_password(final SubLObject tunnel_login)
  {
    return conses_high.second( tunnel_login );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 3112L)
  public static SubLObject cb_java_applet_tunnel_test_login(final SubLObject user, final SubLObject pass)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject val = Hashtables.gethash( user, $cb_java_applet_tunnel_logins$.getDynamicValue( thread ), UNPROVIDED );
    return makeBoolean( NIL != pass && pass.equalp( val ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-java-utilities.lisp", position = 3417L)
  public static SubLObject cb_java_applet_tunnel_params(final SubLObject host, final SubLObject port, SubLObject tunnel_host, SubLObject tunnel_port)
  {
    if( tunnel_host == UNPROVIDED )
    {
      tunnel_host = $cb_java_applet_tunnel_exposed_host$.getDynamicValue();
    }
    if( tunnel_port == UNPROVIDED )
    {
      tunnel_port = $cb_java_applet_tunnel_exposed_port$.getDynamicValue();
    }
    final SubLObject tunnel_login = cb_java_applet_tunnel_create_login();
    final SubLObject tunnel_login_username = tunnel_login_username( tunnel_login );
    final SubLObject tunnel_login_password = tunnel_login_password( tunnel_login );
    html_utilities.html_markup( html_macros.$html_param_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_param_name$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str8$hiddenHost );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_param_value$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( host );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_param_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_param_name$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str9$hiddenPort );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_param_value$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( port );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_param_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_param_name$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str10$exposedHost );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_param_value$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( tunnel_host );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_param_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_param_name$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str11$exposedPort );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_param_value$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( tunnel_port );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_param_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_param_name$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str12$login );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_param_value$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( tunnel_login_username );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_param_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_param_name$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( $str13$password );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_param_value$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( tunnel_login_password );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    return NIL;
  }

  public static SubLObject declare_cb_java_utilities_file()
  {
    SubLFiles.declareFunction( me, "cb_java_applet_construct_window_options", "CB-JAVA-APPLET-CONSTRUCT-WINDOW-OPTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_java_applet_convert_to_option_string", "CB-JAVA-APPLET-CONVERT-TO-OPTION-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_java_applet_tunnel_gen_token", "CB-JAVA-APPLET-TUNNEL-GEN-TOKEN", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_java_applet_tunnel_create_login", "CB-JAVA-APPLET-TUNNEL-CREATE-LOGIN", 0, 0, false );
    SubLFiles.declareFunction( me, "tunnel_login_username", "TUNNEL-LOGIN-USERNAME", 1, 0, false );
    SubLFiles.declareFunction( me, "tunnel_login_password", "TUNNEL-LOGIN-PASSWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_java_applet_tunnel_test_login", "CB-JAVA-APPLET-TUNNEL-TEST-LOGIN", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_java_applet_tunnel_params", "CB-JAVA-APPLET-TUNNEL-PARAMS", 2, 2, false );
    return NIL;
  }

  public static SubLObject init_cb_java_utilities_file()
  {
    $cb_java_applet_tunnel_active$ = SubLFiles.defparameter( "*CB-JAVA-APPLET-TUNNEL-ACTIVE*", NIL );
    $cb_java_applet_tunnel_logins$ = SubLFiles.defparameter( "*CB-JAVA-APPLET-TUNNEL-LOGINS*", Hashtables.make_hash_table( $int4$512, EQUALP, UNPROVIDED ) );
    $cb_java_applet_tunnel_exposed_host$ = SubLFiles.defparameter( "*CB-JAVA-APPLET-TUNNEL-EXPOSED-HOST*", $str5$ );
    $cb_java_applet_tunnel_exposed_port$ = SubLFiles.defparameter( "*CB-JAVA-APPLET-TUNNEL-EXPOSED-PORT*", $int6$9096 );
    return NIL;
  }

  public static SubLObject setup_cb_java_utilities_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_java_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_java_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_java_utilities_file();
  }
  static
  {
    me = new cb_java_utilities();
    $cb_java_applet_tunnel_active$ = null;
    $cb_java_applet_tunnel_logins$ = null;
    $cb_java_applet_tunnel_exposed_host$ = null;
    $cb_java_applet_tunnel_exposed_port$ = null;
    $str0$_ = makeString( "," );
    $list1 = ConsesLow.list( makeSymbol( "COMMAND" ), makeSymbol( "VALUE" ) );
    $str2$_ = makeString( "=" );
    $sym3$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $int4$512 = makeInteger( 512 );
    $str5$ = makeString( "" );
    $int6$9096 = makeInteger( 9096 );
    $int7$30 = makeInteger( 30 );
    $str8$hiddenHost = makeString( "hiddenHost" );
    $str9$hiddenPort = makeString( "hiddenPort" );
    $str10$exposedHost = makeString( "exposedHost" );
    $str11$exposedPort = makeString( "exposedPort" );
    $str12$login = makeString( "login" );
    $str13$password = makeString( "password" );
  }
}
/*
 * 
 * Total time: 89 ms
 * 
 */