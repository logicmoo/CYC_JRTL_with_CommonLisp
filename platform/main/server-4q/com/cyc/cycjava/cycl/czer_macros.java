package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class czer_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.czer_macros";
  public static final String myFingerPrint = "523b28e7eb7c8dcb88b7cc8c1d92e95805e194dfe1a715c4b81c3439afddf8ec";
  private static final SubLSymbol $sym0$WITH_MEMOIZATION_STATE;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$CLET;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$PROGN;
  private static final SubLSymbol $sym15$PUNLESS;
  private static final SubLSymbol $sym16$VALID_TENSE_CZER_MODE_P;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$_TENSE_CZER_MODE_;

  @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 718L)
  public static SubLObject with_czer_memoization_state(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym0$WITH_MEMOIZATION_STATE, $list1, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 852L)
  public static SubLObject with_new_czer_memoization_state(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym2$CLET, $list3, ConsesLow.listS( $sym0$WITH_MEMOIZATION_STATE, $list1, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 1080L)
  public static SubLObject within_canonicalizer(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list4, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 1182L)
  public static SubLObject within_negation(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list5, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 1298L)
  public static SubLObject within_disjunction(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list6, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 1455L)
  public static SubLObject within_conjunction(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list7, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 1685L)
  public static SubLObject within_assert(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list8, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 1824L)
  public static SubLObject not_within_assert(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list9, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 2020L)
  public static SubLObject within_ask(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list10, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 2150L)
  public static SubLObject within_query(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list11, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 2280L)
  public static SubLObject within_tou_gaf(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list12, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-macros.lisp", position = 2419L)
  public static SubLObject with_tense_czer_mode(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject mode = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list13 );
    mode = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym14$PROGN, ConsesLow.listS( $sym15$PUNLESS, ConsesLow.list( $sym16$VALID_TENSE_CZER_MODE_P, mode ), $list17 ), ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list(
        $sym18$_TENSE_CZER_MODE_, mode ) ), ConsesLow.append( body, NIL ) ) );
  }

  public static SubLObject declare_czer_macros_file()
  {
    SubLFiles.declareMacro( me, "with_czer_memoization_state", "WITH-CZER-MEMOIZATION-STATE" );
    SubLFiles.declareMacro( me, "with_new_czer_memoization_state", "WITH-NEW-CZER-MEMOIZATION-STATE" );
    SubLFiles.declareMacro( me, "within_canonicalizer", "WITHIN-CANONICALIZER" );
    SubLFiles.declareMacro( me, "within_negation", "WITHIN-NEGATION" );
    SubLFiles.declareMacro( me, "within_disjunction", "WITHIN-DISJUNCTION" );
    SubLFiles.declareMacro( me, "within_conjunction", "WITHIN-CONJUNCTION" );
    SubLFiles.declareMacro( me, "within_assert", "WITHIN-ASSERT" );
    SubLFiles.declareMacro( me, "not_within_assert", "NOT-WITHIN-ASSERT" );
    SubLFiles.declareMacro( me, "within_ask", "WITHIN-ASK" );
    SubLFiles.declareMacro( me, "within_query", "WITHIN-QUERY" );
    SubLFiles.declareMacro( me, "within_tou_gaf", "WITHIN-TOU-GAF" );
    SubLFiles.declareMacro( me, "with_tense_czer_mode", "WITH-TENSE-CZER-MODE" );
    return NIL;
  }

  public static SubLObject init_czer_macros_file()
  {
    return NIL;
  }

  public static SubLObject setup_czer_macros_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_czer_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_czer_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_czer_macros_file();
  }
  static
  {
    me = new czer_macros();
    $sym0$WITH_MEMOIZATION_STATE = makeSymbol( "WITH-MEMOIZATION-STATE" );
    $list1 = ConsesLow.list( makeSymbol( "*CZER-MEMOIZATION-STATE*" ) );
    $sym2$CLET = makeSymbol( "CLET" );
    $list3 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CZER-MEMOIZATION-STATE*" ), ConsesLow.list( makeSymbol( "NEW-MEMOIZATION-STATE" ), makeString( "czer memoization state" ) ) ) );
    $list4 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITHIN-CANONICALIZER?*" ), T ) );
    $list5 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITHIN-NEGATION?*" ), ConsesLow.list( makeSymbol( "CNOT" ), makeSymbol( "*WITHIN-NEGATION?*" ) ) ) );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITHIN-DISJUNCTION?*" ), T ), ConsesLow.list( makeSymbol( "*WITHIN-NEGATED-DISJUNCTION?*" ), makeSymbol( "*WITHIN-NEGATION?*" ) ) );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITHIN-CONJUNCTION?*" ), T ), ConsesLow.list( makeSymbol( "*WITHIN-NEGATED-CONJUNCTION?*" ), makeSymbol( "*WITHIN-NEGATION?*" ) ) );
    $list8 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITHIN-ASSERT*" ), T ) );
    $list9 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITHIN-ASSERT*" ), NIL ) );
    $list10 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITHIN-ASK*" ), T ) );
    $list11 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITHIN-QUERY*" ), T ) );
    $list12 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITHIN-TOU-GAF?*" ), T ) );
    $list13 = ConsesLow.list( makeSymbol( "MODE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym14$PROGN = makeSymbol( "PROGN" );
    $sym15$PUNLESS = makeSymbol( "PUNLESS" );
    $sym16$VALID_TENSE_CZER_MODE_P = makeSymbol( "VALID-TENSE-CZER-MODE-P" );
    $list17 = ConsesLow.list( ConsesLow.list( makeSymbol( "ERROR" ), makeString( "Cannot set tense czer to invalid mode." ) ) );
    $sym18$_TENSE_CZER_MODE_ = makeSymbol( "*TENSE-CZER-MODE*" );
  }
}
/*
 * 
 * Total time: 147 ms
 * 
 */