package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class psc
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.psc";
  public static final String myFingerPrint = "ef5ad1fc4c5aedc9bb00e7911555eb532a0ab27fde14c4516434571388593a77";
  private static final SubLObject $const0$EverythingPSC;
  private static final SubLSymbol $sym1$ALL_MTS_INFERENCE;
  private static final SubLObject $const2$InferencePSC;
  private static final SubLSymbol $sym3$PSC_INFERENCE;
  private static final SubLSymbol $sym4$NORMAL_INFERENCE;
  private static final SubLSymbol $sym5$MT_UNION_INFERENCE;
  private static final SubLSymbol $sym6$ANYTIME_PSC_INFERENCE;
  private static final SubLObject $const7$ProblemSolvingCntxt;

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 878L)
  public static SubLObject mt_inference_function(final SubLObject mt)
  {
    if( NIL != kb_utilities.kbeq( mt, $const0$EverythingPSC ) )
    {
      return $sym1$ALL_MTS_INFERENCE;
    }
    if( NIL != kb_utilities.kbeq( mt, $const2$InferencePSC ) )
    {
      return $sym3$PSC_INFERENCE;
    }
    if( NIL == el_utilities.possibly_naut_p( mt ) )
    {
      return $sym4$NORMAL_INFERENCE;
    }
    if( NIL != hlmt.mt_union_naut_p( mt ) )
    {
      return $sym5$MT_UNION_INFERENCE;
    }
    if( NIL != hlmt.hlmt_with_anytime_psc_p( mt ) )
    {
      return $sym6$ANYTIME_PSC_INFERENCE;
    }
    return $sym4$NORMAL_INFERENCE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/lisp", position = 1342L)
  public static SubLObject pscP(final SubLObject constant)
  {
    return isa.isaP( constant, $const7$ProblemSolvingCntxt, mt_vars.$psc_mt$.getGlobalValue(), UNPROVIDED );
  }

  public static SubLObject declare_psc_file()
  {
    SubLFiles.declareFunction( me, "mt_inference_function", "MT-INFERENCE-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "pscP", "PSC?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_psc_file()
  {
    return NIL;
  }

  public static SubLObject setup_psc_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_psc_file();
  }

  @Override
  public void initializeVariables()
  {
    init_psc_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_psc_file();
  }
  static
  {
    me = new psc();
    $const0$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym1$ALL_MTS_INFERENCE = makeSymbol( "ALL-MTS-INFERENCE" );
    $const2$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $sym3$PSC_INFERENCE = makeSymbol( "PSC-INFERENCE" );
    $sym4$NORMAL_INFERENCE = makeSymbol( "NORMAL-INFERENCE" );
    $sym5$MT_UNION_INFERENCE = makeSymbol( "MT-UNION-INFERENCE" );
    $sym6$ANYTIME_PSC_INFERENCE = makeSymbol( "ANYTIME-PSC-INFERENCE" );
    $const7$ProblemSolvingCntxt = constant_handles.reader_make_constant_shell( makeString( "ProblemSolvingCntxt" ) );
  }
}
/*
 * 
 * Total time: 36 ms
 * 
 */