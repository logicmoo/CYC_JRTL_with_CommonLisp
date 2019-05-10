package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_non_wff
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_non_wff";
  public static final String myFingerPrint = "a222370274558e9f7c472bde77a238b30c3fbf9685fa2fd4a495c5feb86106ee";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-non-wff.lisp", position = 1407L)
  private static SubLSymbol $default_non_wff_check_neg_cost$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$REMOVAL_NON_WFF_CHECK_NEG;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$ADMIT;
  private static final SubLObject $const5$not;
  private static final SubLObject $const6$admittedSentence;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-non-wff.lisp", position = 709L)
  public static SubLObject removal_non_wffP(final SubLObject asent, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject wffP = NIL;
    final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
    try
    {
      control_vars.$within_assert$.bind( NIL, thread );
      wffP = makeBoolean( NIL != wff.el_wffP( asent, mt, $list0 ) || NIL != wff.el_wffP( asent, mt, $list1 ) );
    }
    finally
    {
      control_vars.$within_assert$.rebind( _prev_bind_0, thread );
    }
    return makeBoolean( NIL == wffP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-non-wff.lisp", position = 2088L)
  public static SubLObject removal_non_wff_check_neg_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != removal_non_wffP( asent, mt_relevance_macros.$mt$.getDynamicValue( thread ) ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw4$ADMIT, ConsesLow.list( $const5$not, ConsesLow.list( $const6$admittedSentence, asent ) ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-non-wff.lisp", position = 2370L)
  public static SubLObject proof_has_some_non_wff_subproofP(final SubLObject new_proof)
  {
    SubLObject foundP;
    SubLObject rest;
    SubLObject subproof;
    for( foundP = NIL, rest = NIL, rest = inference_datastructures_proof.all_proof_subproofs( new_proof ); NIL == foundP && NIL != rest; foundP = non_wff_removal_proof_p( subproof ), rest = rest.rest() )
    {
      subproof = rest.first();
    }
    return foundP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-non-wff.lisp", position = 2600L)
  public static SubLObject non_wff_removal_module_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_modules.removal_module_p( v_object ) && $kw2$REMOVAL_NON_WFF_CHECK_NEG == inference_modules.hl_module_name( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-non-wff.lisp", position = 2758L)
  public static SubLObject non_wff_removal_proof_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != inference_worker_removal.removal_proof_p( v_object ) && NIL != non_wff_removal_module_p( inference_worker.content_proof_hl_module( v_object ) ) );
  }

  public static SubLObject declare_removal_modules_non_wff_file()
  {
    SubLFiles.declareFunction( me, "removal_non_wffP", "REMOVAL-NON-WFF?", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_non_wff_check_neg_expand", "REMOVAL-NON-WFF-CHECK-NEG-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "proof_has_some_non_wff_subproofP", "PROOF-HAS-SOME-NON-WFF-SUBPROOF?", 1, 0, false );
    SubLFiles.declareFunction( me, "non_wff_removal_module_p", "NON-WFF-REMOVAL-MODULE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "non_wff_removal_proof_p", "NON-WFF-REMOVAL-PROOF-P", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_non_wff_file()
  {
    $default_non_wff_check_neg_cost$ = SubLFiles.deflexical( "*DEFAULT-NON-WFF-CHECK-NEG-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue() );
    return NIL;
  }

  public static SubLObject setup_removal_modules_non_wff_file()
  {
    inference_modules.inference_removal_module( $kw2$REMOVAL_NON_WFF_CHECK_NEG, $list3 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_non_wff_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_non_wff_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_non_wff_file();
  }
  static
  {
    me = new removal_modules_non_wff();
    $default_non_wff_check_neg_cost$ = null;
    $list0 = ConsesLow.list( makeKeyword( "WFF-MODE" ), makeKeyword( "STRICT" ) );
    $list1 = ConsesLow.list( makeKeyword( "WFF-MODE" ), makeKeyword( "LENIENT" ) );
    $kw2$REMOVAL_NON_WFF_CHECK_NEG = makeKeyword( "REMOVAL-NON-WFF-CHECK-NEG" );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "UNIVERSAL" ), T, makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "REQUIRED-PATTERN" ), makeKeyword( "FULLY-BOUND" ), makeKeyword(
        "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-NON-WFF-CHECK-NEG-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "INCOMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NON-WFF-CHECK-NEG-EXPAND" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "Prove (#$not <fully-bound asent>)\nwhere the fully-bound asent is not well formed" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$not (#$biologicalFather #$Cyc #$Lenat))\nas (#$biologicalFather #$Cyc #$Lenat) is not well formed " )
    } );
    $kw4$ADMIT = makeKeyword( "ADMIT" );
    $const5$not = constant_handles.reader_make_constant_shell( makeString( "not" ) );
    $const6$admittedSentence = constant_handles.reader_make_constant_shell( makeString( "admittedSentence" ) );
  }
}
/*
 * 
 * Total time: 74 ms
 * 
 */