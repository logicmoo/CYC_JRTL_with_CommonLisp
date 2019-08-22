package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_sks_registered
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_sks_registered";
  public static final String myFingerPrint = "c311cc18147476e0224b980fea02bde503dcc3d77612f84d0f7a3956bbdd41a6";
  private static final SubLObject $const0$sksRegistered;
  private static final SubLSymbol $kw1$REMOVAL_SKS_REGISTERED_CHECK_POS;
  private static final SubLList $list2;
  private static final SubLSymbol $kw3$REMOVAL_SKS_REGISTERED_CHECK_NEG;
  private static final SubLList $list4;
  private static final SubLSymbol $kw5$REMOVAL_SKS_REGISTERED_UNIFY_POS;
  private static final SubLList $list6;

  public static SubLObject declare_removal_modules_sks_registered_file()
  {
    return NIL;
  }

  public static SubLObject init_removal_modules_sks_registered_file()
  {
    return NIL;
  }

  public static SubLObject setup_removal_modules_sks_registered_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$sksRegistered );
    inference_modules.inference_removal_module( $kw1$REMOVAL_SKS_REGISTERED_CHECK_POS, $list2 );
    inference_modules.inference_removal_module( $kw3$REMOVAL_SKS_REGISTERED_CHECK_NEG, $list4 );
    inference_modules.inference_removal_module( $kw5$REMOVAL_SKS_REGISTERED_UNIFY_POS, $list6 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_sks_registered_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_sks_registered_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_sks_registered_file();
  }
  static
  {
    me = new removal_modules_sks_registered();
    $const0$sksRegistered = constant_handles.reader_make_constant_shell( makeString( "sksRegistered" ) );
    $kw1$REMOVAL_SKS_REGISTERED_CHECK_POS = makeKeyword( "REMOVAL-SKS-REGISTERED-CHECK-POS" );
    $list2 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "sksRegistered" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "sksRegistered" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword(
            "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "sksRegistered" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SOURCE" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SOURCE" ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow
                    .list( makeKeyword( "CALL" ), makeSymbol( "EXTERNAL-SOURCE-ACTIVATED-IN-IMAGE?" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles
                        .reader_make_constant_shell( makeString( "sksRegistered" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$sksRegistered <fully-bound>)" ), makeKeyword( "EXAMPLE" ),
      makeString( "(#$sksRegistered #$BLN-Example1-KS)" )
    } );
    $kw3$REMOVAL_SKS_REGISTERED_CHECK_NEG = makeKeyword( "REMOVAL-SKS-REGISTERED-CHECK-NEG" );
    $list4 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "sksRegistered" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "sksRegistered" ) ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword(
            "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "sksRegistered" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "SOURCE" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "SOURCE" ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow
                    .list( makeKeyword( "CALL" ), makeSymbol( "INVERT-BOOLEAN-ANSWER" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "EXTERNAL-SOURCE-ACTIVATED-IN-IMAGE?" ), makeKeyword( "INPUT" ) ) ),
      makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "sksRegistered" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$not (#$sksRegistered <fully-bound>))" ), makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$sksRegistered #$BLN-Example1-KS))" )
    } );
    $kw5$REMOVAL_SKS_REGISTERED_UNIFY_POS = makeKeyword( "REMOVAL-SKS-REGISTERED-UNIFY-POS" );
    $list6 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "sksRegistered" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "sksRegistered" ) ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-PATTERN" ), ConsesLow.list( makeKeyword(
            "CALL" ), makeSymbol( "NUMBER-OF-EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE" ) ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword(
                "CALL" ), makeSymbol( "LIST-OF-EXTERNAL-SOURCES-ACTIVATED-IN-IMAGE" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                    "sksRegistered" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$sksRegistered <not-fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$sksRegistered ?SOURCE)" )
    } );
  }
}
/*
 * 
 * Total time: 69 ms
 * 
 */