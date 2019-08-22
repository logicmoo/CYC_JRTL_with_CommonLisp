package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class opencyc_api_widgets
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.opencyc_api_widgets";
  public static final String myFingerPrint = "f1c4b962d02df577b7c50620ca05715a576374ffde6fcf1c77611b114b5bee9d";
  private static final SubLObject $const0$CurrentWorldDataCollectorMt_NonHo;
  private static final SubLSymbol $sym1$CYCL_SENTENCE_P;
  private static final SubLSymbol $sym2$HLMT_P;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$OPENCYC_EXPLANATION_OF_WHY_NOT_WFF_ASSERT;
  private static final SubLList $list5;
  private static final SubLString $str6$Returns_an_English_explanation_of;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$OPENCYC_EXPLANATION_OF_WHY_NOT_WFF;

  @SubLTranslatedFile.SubL(source = "cycl/opencyc-api-widgets.lisp", position = 843L)
  public static SubLObject opencyc_explanation_of_why_not_wff_assert(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const0$CurrentWorldDataCollectorMt_NonHo;
    }
    enforceType( sentence, $sym1$CYCL_SENTENCE_P );
    enforceType( mt, $sym2$HLMT_P );
    return wff.explanation_of_why_not_wff_assert( sentence, mt, $list3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/opencyc-api-widgets.lisp", position = 1278L)
  public static SubLObject opencyc_explanation_of_why_not_wff(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const0$CurrentWorldDataCollectorMt_NonHo;
    }
    enforceType( sentence, $sym1$CYCL_SENTENCE_P );
    enforceType( mt, $sym2$HLMT_P );
    return wff.explanation_of_why_not_wff( sentence, mt, $list3 );
  }

  public static SubLObject declare_opencyc_api_widgets_file()
  {
    SubLFiles.declareFunction( me, "opencyc_explanation_of_why_not_wff_assert", "OPENCYC-EXPLANATION-OF-WHY-NOT-WFF-ASSERT", 1, 1, false );
    SubLFiles.declareFunction( me, "opencyc_explanation_of_why_not_wff", "OPENCYC-EXPLANATION-OF-WHY-NOT-WFF", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_opencyc_api_widgets_file()
  {
    return NIL;
  }

  public static SubLObject setup_opencyc_api_widgets_file()
  {
    utilities_macros.register_cyc_api_function( $sym4$OPENCYC_EXPLANATION_OF_WHY_NOT_WFF_ASSERT, $list5, $str6$Returns_an_English_explanation_of, $list7, $list8 );
    utilities_macros.register_cyc_api_function( $sym9$OPENCYC_EXPLANATION_OF_WHY_NOT_WFF, $list5, $str6$Returns_an_English_explanation_of, $list7, $list8 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_opencyc_api_widgets_file();
  }

  @Override
  public void initializeVariables()
  {
    init_opencyc_api_widgets_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_opencyc_api_widgets_file();
  }
  static
  {
    me = new opencyc_api_widgets();
    $const0$CurrentWorldDataCollectorMt_NonHo = constant_handles.reader_make_constant_shell( makeString( "CurrentWorldDataCollectorMt-NonHomocentric" ) );
    $sym1$CYCL_SENTENCE_P = makeSymbol( "CYCL-SENTENCE-P" );
    $sym2$HLMT_P = makeSymbol( "HLMT-P" );
    $list3 = ConsesLow.list( makeKeyword( "IO-MODE" ), makeKeyword( "NL" ) );
    $sym4$OPENCYC_EXPLANATION_OF_WHY_NOT_WFF_ASSERT = makeSymbol( "OPENCYC-EXPLANATION-OF-WHY-NOT-WFF-ASSERT" );
    $list5 = ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MT" ), constant_handles.reader_make_constant_shell( makeString(
        "CurrentWorldDataCollectorMt-NonHomocentric" ) ) ) );
    $str6$Returns_an_English_explanation_of = makeString( "Returns an English explanation of why SENTENCE is not assertible in MT.  An assertible sentence results in a NIL return value." );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "CYCL-SENTENCE-P" ) ), ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "HLMT-P" ) ) );
    $list8 = ConsesLow.list( makeSymbol( "STRING-OR-NIL-P" ) );
    $sym9$OPENCYC_EXPLANATION_OF_WHY_NOT_WFF = makeSymbol( "OPENCYC-EXPLANATION-OF-WHY-NOT-WFF" );
  }
}
/*
 * 
 * Total time: 89 ms
 * 
 */