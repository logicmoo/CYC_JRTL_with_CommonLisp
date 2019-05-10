package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyc_bookkeeping
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cyc_bookkeeping";
  public static final String myFingerPrint = "5e63efaf0c4abecba62228f463ba077a2e4985a20a041af661f568e9b8b4de47";
  @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 761L)
  public static SubLSymbol $bookkeeping_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 993L)
  public static SubLSymbol $cyc_bookkeeping_info$;
  private static final SubLSymbol $sym0$_BOOKKEEPING_ENABLED__;
  private static final SubLSymbol $sym1$WITH_BOOKKEEPING_INFO;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$CLET;
  private static final SubLSymbol $sym4$_CYC_BOOKKEEPING_INFO_;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$ASSERTION_VAR;
  private static final SubLSymbol $sym7$_THE_CYCLIST_;
  private static final SubLSymbol $sym8$ASSERTED_BY;
  private static final SubLSymbol $sym9$_THE_DATE_;
  private static final SubLSymbol $sym10$ASSERTED_WHEN;
  private static final SubLSymbol $sym11$_KE_PURPOSE_;
  private static final SubLSymbol $sym12$ASSERTED_WHY;
  private static final SubLSymbol $sym13$_THE_SECOND_;
  private static final SubLSymbol $sym14$ASSERTED_SECOND;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$PROGN;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$NEW_BOOKKEEPING_INFO;
  private static final SubLSymbol $kw19$SECOND;
  private static final SubLSymbol $kw20$PURPOSE;
  private static final SubLSymbol $kw21$WHEN;
  private static final SubLSymbol $kw22$WHO;
  private static final SubLSymbol $sym23$ASSERTION_P;

  @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 1155L)
  public static SubLObject with_bookkeeping_info(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject bookkeeping_info = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    bookkeeping_info = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym3$CLET, ConsesLow.list( ConsesLow.list( $sym4$_CYC_BOOKKEEPING_INFO_, bookkeeping_info ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 1774L)
  public static SubLObject with_assertion_bookkeeping_info(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject assertion = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list5 );
    assertion = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject assertion_var = $sym6$ASSERTION_VAR;
    return ConsesLow.list( $sym3$CLET, ConsesLow.list( ConsesLow.list( assertion_var, assertion ), ConsesLow.list( $sym7$_THE_CYCLIST_, ConsesLow.list( $sym8$ASSERTED_BY, assertion_var ) ), ConsesLow.list(
        $sym9$_THE_DATE_, ConsesLow.list( $sym10$ASSERTED_WHEN, assertion_var ) ), ConsesLow.list( $sym11$_KE_PURPOSE_, ConsesLow.list( $sym12$ASSERTED_WHY, assertion_var ) ), ConsesLow.list( $sym13$_THE_SECOND_,
            ConsesLow.list( $sym14$ASSERTED_SECOND, assertion_var ) ) ), ConsesLow.listS( $sym1$WITH_BOOKKEEPING_INFO, $list15, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 2545L)
  public static SubLObject possibly_with_bookkeeping_info(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject bookkeeping_info = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list2 );
    bookkeeping_info = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    if( NIL != bookkeeping_info )
    {
      return ConsesLow.listS( $sym1$WITH_BOOKKEEPING_INFO, bookkeeping_info, ConsesLow.append( body, NIL ) );
    }
    return reader.bq_cons( $sym16$PROGN, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 2868L)
  public static SubLObject without_bookkeeping(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym3$CLET, $list17, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 3092L)
  public static SubLObject cyc_bookkeeping_info()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cyc_bookkeeping_info$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 3211L)
  public static SubLObject do_bookkeepingP()
  {
    return makeBoolean( NIL != $bookkeeping_enabledP$.getGlobalValue() && NIL != cyc_bookkeeping_info() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 3315L)
  public static SubLObject new_bookkeeping_info(SubLObject who, SubLObject when, SubLObject why, SubLObject when_sec)
  {
    if( who == UNPROVIDED )
    {
      who = NIL;
    }
    if( when == UNPROVIDED )
    {
      when = NIL;
    }
    if( why == UNPROVIDED )
    {
      why = NIL;
    }
    if( when_sec == UNPROVIDED )
    {
      when_sec = NIL;
    }
    SubLObject plist = NIL;
    if( NIL != when_sec )
    {
      plist = ConsesLow.nconc( ConsesLow.list( $kw19$SECOND, when_sec ), plist );
    }
    if( NIL != why )
    {
      plist = ConsesLow.nconc( ConsesLow.list( $kw20$PURPOSE, why ), plist );
    }
    if( NIL != when )
    {
      plist = ConsesLow.nconc( ConsesLow.list( $kw21$WHEN, when ), plist );
    }
    if( NIL != who )
    {
      plist = ConsesLow.nconc( ConsesLow.list( $kw22$WHO, who ), plist );
    }
    return plist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 3824L)
  public static SubLObject assertion_bookkeeping_info(final SubLObject assertion)
  {
    assert NIL != assertion_handles.assertion_p( assertion ) : assertion;
    final SubLObject who = assertions_high.asserted_by( assertion );
    final SubLObject when = assertions_high.asserted_when( assertion );
    final SubLObject why = assertions_high.asserted_why( assertion );
    final SubLObject when_sec = assertions_high.asserted_second( assertion );
    return new_bookkeeping_info( who, when, why, when_sec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 4262L)
  public static SubLObject cyc_bookkeeping_info_for(final SubLObject what)
  {
    return conses_high.getf( cyc_bookkeeping_info(), what, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 4415L)
  public static SubLObject perform_constant_bookkeeping(final SubLObject constant)
  {
    if( NIL != do_bookkeepingP() )
    {
      final SubLObject who = cyc_bookkeeping_info_for( $kw22$WHO );
      final SubLObject when = cyc_bookkeeping_info_for( $kw21$WHEN );
      final SubLObject purpose = cyc_bookkeeping_info_for( $kw20$PURPOSE );
      final SubLObject when_sec = cyc_bookkeeping_info_for( $kw19$SECOND );
      return fi.fi_timestamp_constant_int( who, when, purpose, when_sec );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-bookkeeping.lisp", position = 4794L)
  public static SubLObject perform_assertion_bookkeeping(final SubLObject assertion)
  {
    if( NIL != do_bookkeepingP() )
    {
      final SubLObject who = cyc_bookkeeping_info_for( $kw22$WHO );
      final SubLObject when = cyc_bookkeeping_info_for( $kw21$WHEN );
      final SubLObject purpose = cyc_bookkeeping_info_for( $kw20$PURPOSE );
      final SubLObject when_sec = cyc_bookkeeping_info_for( $kw19$SECOND );
      return fi.fi_timestamp_assertion_int( who, when, purpose, when_sec );
    }
    return NIL;
  }

  public static SubLObject declare_cyc_bookkeeping_file()
  {
    SubLFiles.declareMacro( me, "with_bookkeeping_info", "WITH-BOOKKEEPING-INFO" );
    SubLFiles.declareMacro( me, "with_assertion_bookkeeping_info", "WITH-ASSERTION-BOOKKEEPING-INFO" );
    SubLFiles.declareMacro( me, "possibly_with_bookkeeping_info", "POSSIBLY-WITH-BOOKKEEPING-INFO" );
    SubLFiles.declareMacro( me, "without_bookkeeping", "WITHOUT-BOOKKEEPING" );
    SubLFiles.declareFunction( me, "cyc_bookkeeping_info", "CYC-BOOKKEEPING-INFO", 0, 0, false );
    SubLFiles.declareFunction( me, "do_bookkeepingP", "DO-BOOKKEEPING?", 0, 0, false );
    SubLFiles.declareFunction( me, "new_bookkeeping_info", "NEW-BOOKKEEPING-INFO", 0, 4, false );
    SubLFiles.declareFunction( me, "assertion_bookkeeping_info", "ASSERTION-BOOKKEEPING-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_bookkeeping_info_for", "CYC-BOOKKEEPING-INFO-FOR", 1, 0, false );
    SubLFiles.declareFunction( me, "perform_constant_bookkeeping", "PERFORM-CONSTANT-BOOKKEEPING", 1, 0, false );
    SubLFiles.declareFunction( me, "perform_assertion_bookkeeping", "PERFORM-ASSERTION-BOOKKEEPING", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cyc_bookkeeping_file()
  {
    $bookkeeping_enabledP$ = SubLFiles.deflexical( "*BOOKKEEPING-ENABLED?*", ( maybeDefault( $sym0$_BOOKKEEPING_ENABLED__, $bookkeeping_enabledP$, T ) ) );
    $cyc_bookkeeping_info$ = SubLFiles.defparameter( "*CYC-BOOKKEEPING-INFO*", NIL );
    return NIL;
  }

  public static SubLObject setup_cyc_bookkeeping_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_BOOKKEEPING_ENABLED__ );
    access_macros.register_external_symbol( $sym1$WITH_BOOKKEEPING_INFO );
    access_macros.register_external_symbol( $sym18$NEW_BOOKKEEPING_INFO );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cyc_bookkeeping_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cyc_bookkeeping_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cyc_bookkeeping_file();
  }
  static
  {
    me = new cyc_bookkeeping();
    $bookkeeping_enabledP$ = null;
    $cyc_bookkeeping_info$ = null;
    $sym0$_BOOKKEEPING_ENABLED__ = makeSymbol( "*BOOKKEEPING-ENABLED?*" );
    $sym1$WITH_BOOKKEEPING_INFO = makeSymbol( "WITH-BOOKKEEPING-INFO" );
    $list2 = ConsesLow.list( makeSymbol( "BOOKKEEPING-INFO" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym3$CLET = makeSymbol( "CLET" );
    $sym4$_CYC_BOOKKEEPING_INFO_ = makeSymbol( "*CYC-BOOKKEEPING-INFO*" );
    $list5 = ConsesLow.list( makeSymbol( "ASSERTION" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym6$ASSERTION_VAR = makeUninternedSymbol( "ASSERTION-VAR" );
    $sym7$_THE_CYCLIST_ = makeSymbol( "*THE-CYCLIST*" );
    $sym8$ASSERTED_BY = makeSymbol( "ASSERTED-BY" );
    $sym9$_THE_DATE_ = makeSymbol( "*THE-DATE*" );
    $sym10$ASSERTED_WHEN = makeSymbol( "ASSERTED-WHEN" );
    $sym11$_KE_PURPOSE_ = makeSymbol( "*KE-PURPOSE*" );
    $sym12$ASSERTED_WHY = makeSymbol( "ASSERTED-WHY" );
    $sym13$_THE_SECOND_ = makeSymbol( "*THE-SECOND*" );
    $sym14$ASSERTED_SECOND = makeSymbol( "ASSERTED-SECOND" );
    $list15 = ConsesLow.list( makeSymbol( "NEW-BOOKKEEPING-INFO" ), makeSymbol( "*THE-CYCLIST*" ), makeSymbol( "*THE-DATE*" ), makeSymbol( "*KE-PURPOSE*" ), makeSymbol( "*THE-SECOND*" ) );
    $sym16$PROGN = makeSymbol( "PROGN" );
    $list17 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CYC-BOOKKEEPING-INFO*" ), NIL ) );
    $sym18$NEW_BOOKKEEPING_INFO = makeSymbol( "NEW-BOOKKEEPING-INFO" );
    $kw19$SECOND = makeKeyword( "SECOND" );
    $kw20$PURPOSE = makeKeyword( "PURPOSE" );
    $kw21$WHEN = makeKeyword( "WHEN" );
    $kw22$WHO = makeKeyword( "WHO" );
    $sym23$ASSERTION_P = makeSymbol( "ASSERTION-P" );
  }
}
/*
 * 
 * Total time: 100 ms
 * 
 */