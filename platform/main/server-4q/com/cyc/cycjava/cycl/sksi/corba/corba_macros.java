package com.cyc.cycjava.cycl.sksi.corba;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class corba_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.corba.corba_macros";
  public static final String myFingerPrint = "4ec1400e1d3ba72ef4878621dbed9ef5558b9b2f9f942d17faa31d24f742a64c";
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw3$CONNECTION_TIMEOUT;
  private static final SubLSymbol $kw4$TRANSACTION_TIMEOUT;
  private static final SubLSymbol $kw5$ACCESS_MODE;
  private static final SubLSymbol $kw6$PUBLIC;
  private static final SubLSymbol $sym7$TRANSACTION_TIMED_OUT;
  private static final SubLSymbol $sym8$CLET;
  private static final SubLSymbol $sym9$IGNORE;
  private static final SubLSymbol $sym10$WITH_TIMEOUT;
  private static final SubLSymbol $sym11$CUNWIND_PROTECT;
  private static final SubLSymbol $sym12$PWHEN;
  private static final SubLSymbol $sym13$CORBA_CONNECTION_OPEN;
  private static final SubLSymbol $sym14$CORBA_CONNECTION_OPEN_P;
  private static final SubLSymbol $sym15$CORBA_CONNECTION_CLOSE;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-macros.lisp", position = 954L)
  public static SubLObject with_open_corba_connection(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject corba_connection = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    corba_connection = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      if( NIL == conses_high.member( current_$1, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    }
    final SubLObject connection_timeout_tail = cdestructuring_bind.property_list_member( $kw3$CONNECTION_TIMEOUT, current );
    final SubLObject connection_timeout = ( NIL != connection_timeout_tail ) ? conses_high.cadr( connection_timeout_tail ) : NIL;
    final SubLObject transaction_timeout_tail = cdestructuring_bind.property_list_member( $kw4$TRANSACTION_TIMEOUT, current );
    final SubLObject transaction_timeout = ( NIL != transaction_timeout_tail ) ? conses_high.cadr( transaction_timeout_tail ) : NIL;
    final SubLObject access_mode_tail = cdestructuring_bind.property_list_member( $kw5$ACCESS_MODE, current );
    final SubLObject access_mode = ( NIL != access_mode_tail ) ? conses_high.cadr( access_mode_tail ) : $kw6$PUBLIC;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject transaction_timed_out = $sym7$TRANSACTION_TIMED_OUT;
    return ConsesLow.list( $sym8$CLET, ConsesLow.list( transaction_timed_out ), ConsesLow.list( $sym9$IGNORE, transaction_timed_out ), ConsesLow.list( $sym10$WITH_TIMEOUT, ConsesLow.list( transaction_timeout,
        transaction_timed_out ), ConsesLow.list( $sym11$CUNWIND_PROTECT, ConsesLow.listS( $sym12$PWHEN, ConsesLow.list( $sym13$CORBA_CONNECTION_OPEN, corba_connection, connection_timeout, access_mode ), ConsesLow.append(
            body, NIL ) ), ConsesLow.list( $sym12$PWHEN, ConsesLow.list( $sym14$CORBA_CONNECTION_OPEN_P, corba_connection ), ConsesLow.list( $sym15$CORBA_CONNECTION_CLOSE, corba_connection ) ) ) ) );
  }

  public static SubLObject declare_corba_macros_file()
  {
    SubLFiles.declareMacro( me, "with_open_corba_connection", "WITH-OPEN-CORBA-CONNECTION" );
    return NIL;
  }

  public static SubLObject init_corba_macros_file()
  {
    return NIL;
  }

  public static SubLObject setup_corba_macros_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_corba_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_corba_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_corba_macros_file();
  }
  static
  {
    me = new corba_macros();
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "CORBA-CONNECTION" ), makeSymbol( "&KEY" ), makeSymbol( "CONNECTION-TIMEOUT" ), makeSymbol( "TRANSACTION-TIMEOUT" ), ConsesLow.list( makeSymbol( "ACCESS-MODE" ),
        makeKeyword( "PUBLIC" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list1 = ConsesLow.list( makeKeyword( "CONNECTION-TIMEOUT" ), makeKeyword( "TRANSACTION-TIMEOUT" ), makeKeyword( "ACCESS-MODE" ) );
    $kw2$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw3$CONNECTION_TIMEOUT = makeKeyword( "CONNECTION-TIMEOUT" );
    $kw4$TRANSACTION_TIMEOUT = makeKeyword( "TRANSACTION-TIMEOUT" );
    $kw5$ACCESS_MODE = makeKeyword( "ACCESS-MODE" );
    $kw6$PUBLIC = makeKeyword( "PUBLIC" );
    $sym7$TRANSACTION_TIMED_OUT = makeUninternedSymbol( "TRANSACTION-TIMED-OUT" );
    $sym8$CLET = makeSymbol( "CLET" );
    $sym9$IGNORE = makeSymbol( "IGNORE" );
    $sym10$WITH_TIMEOUT = makeSymbol( "WITH-TIMEOUT" );
    $sym11$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym12$PWHEN = makeSymbol( "PWHEN" );
    $sym13$CORBA_CONNECTION_OPEN = makeSymbol( "CORBA-CONNECTION-OPEN" );
    $sym14$CORBA_CONNECTION_OPEN_P = makeSymbol( "CORBA-CONNECTION-OPEN-P" );
    $sym15$CORBA_CONNECTION_CLOSE = makeSymbol( "CORBA-CONNECTION-CLOSE" );
  }
}
/*
 * 
 * Total time: 23 ms
 * 
 */