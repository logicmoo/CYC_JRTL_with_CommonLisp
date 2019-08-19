package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_semantically_related
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_semantically_related";
  public static final String myFingerPrint = "6fe3a210f5a7a0ab00b0170463d13c0bb0d86fb347662d4d5a84a73bef8fbff3";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-semantically-related.lisp", position = 3595L)
  private static SubLSymbol $default_mutually_coherent_cost$;
  private static final SubLSymbol $sym0$FORT_P;
  private static final SubLObject $const1$or;
  private static final SubLObject $const2$geographicalSubRegions;
  private static final SubLObject $const3$geopoliticalSubdivision;
  private static final SubLObject $const4$genls;
  private static final SubLSymbol $kw5$GENLS;
  private static final SubLObject $const6$isa;
  private static final SubLSymbol $kw7$ISA;
  private static final SubLSymbol $kw8$OPAQUE;
  private static final SubLObject $const9$mutuallyCoherent;
  private static final SubLSymbol $kw10$POS;
  private static final SubLSymbol $kw11$REMOVAL_MUTUALLY_COHERENT;
  private static final SubLList $list12;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-semantically-related.lisp", position = 828L)
  public static SubLObject mutually_coherentP(SubLObject source, final SubLObject target, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != forts.fort_p( source ) : source;
    if( NIL != subl_promotions.positive_integer_p( virtual_indexing.num_overlap_index( ConsesLow.list( source, target ), mt ) ) )
    {
      return T;
    }
    if( NIL != genls.hierarchical_collectionsP( source, target, mt ) )
    {
      return T;
    }
    if( NIL != isa.isaP( source, target, mt, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != isa.isaP( target, source, mt, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != ask_utilities.query_boolean( ConsesLow.list( $const1$or, ConsesLow.list( $const2$geographicalSubRegions, source, target ), ConsesLow.list( $const2$geographicalSubRegions, target, source ), ConsesLow.list(
        $const3$geopoliticalSubdivision, target, source ), ConsesLow.list( $const3$geopoliticalSubdivision, source, target ) ), mt, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-semantically-related.lisp", position = 1862L)
  public static SubLObject why_mutually_coherentP(SubLObject source, final SubLObject target, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    assert NIL != forts.fort_p( source ) : source;
    assert NIL != forts.fort_p( target ) : target;
    return why_mutually_coherentP_internal( source, target, mt ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-semantically-related.lisp", position = 2228L)
  public static SubLObject why_mutually_coherentP_internal(SubLObject source, final SubLObject target, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_arguments = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt ), thread );
      if( NIL != subl_promotions.positive_integer_p( virtual_indexing.num_overlap_index( ConsesLow.list( source, target ), UNPROVIDED ) ) )
      {
        v_arguments = ConsesLow.cons( virtual_indexing.gather_overlap_index( ConsesLow.list( source, target ), mt ).first(), v_arguments );
      }
      else if( NIL != genls.genlP( source, target, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject formula = ConsesLow.list( $const4$genls, source, target );
        v_arguments = ConsesLow.cons( arguments.make_hl_support( $kw5$GENLS, formula, UNPROVIDED, UNPROVIDED ), v_arguments );
      }
      else if( NIL != genls.genlP( target, source, UNPROVIDED, UNPROVIDED ) )
      {
        final SubLObject formula = ConsesLow.list( $const4$genls, target, source );
        v_arguments = ConsesLow.cons( arguments.make_hl_support( $kw5$GENLS, formula, UNPROVIDED, UNPROVIDED ), v_arguments );
      }
      else if( NIL != isa.isaP( source, target, mt, UNPROVIDED ) )
      {
        final SubLObject formula = ConsesLow.list( $const6$isa, source, target );
        v_arguments = ConsesLow.cons( arguments.make_hl_support( $kw7$ISA, formula, UNPROVIDED, UNPROVIDED ), v_arguments );
      }
      else if( NIL != isa.isaP( target, source, mt, UNPROVIDED ) )
      {
        final SubLObject formula = ConsesLow.list( $const6$isa, target, source );
        v_arguments = ConsesLow.cons( arguments.make_hl_support( $kw7$ISA, formula, UNPROVIDED, UNPROVIDED ), v_arguments );
      }
      else
      {
        v_arguments = ConsesLow.cons( arguments.make_hl_support( $kw8$OPAQUE, ConsesLow.list( $const9$mutuallyCoherent, source, target ), mt, UNPROVIDED ), v_arguments );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return v_arguments;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-semantically-related.lisp", position = 3759L)
  public static SubLObject removal_mutually_coherent_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject source = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject target = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    if( NIL != mutually_coherentP( source, target, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw8$OPAQUE, asent, UNPROVIDED, UNPROVIDED ), NIL, why_mutually_coherentP_internal( source, target, mt_relevance_macros.$mt$.getDynamicValue( thread ) ) );
    }
    return NIL;
  }

  public static SubLObject declare_removal_modules_semantically_related_file()
  {
    SubLFiles.declareFunction( me, "mutually_coherentP", "MUTUALLY-COHERENT?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_mutually_coherentP", "WHY-MUTUALLY-COHERENT?", 2, 1, false );
    SubLFiles.declareFunction( me, "why_mutually_coherentP_internal", "WHY-MUTUALLY-COHERENT?-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_mutually_coherent_expand", "REMOVAL-MUTUALLY-COHERENT-EXPAND", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_semantically_related_file()
  {
    $default_mutually_coherent_cost$ = SubLFiles.defparameter( "*DEFAULT-MUTUALLY-COHERENT-COST*", ONE_INTEGER );
    return NIL;
  }

  public static SubLObject setup_removal_modules_semantically_related_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const9$mutuallyCoherent );
    preference_modules.doomed_unless_all_args_bindable( $kw10$POS, $const9$mutuallyCoherent );
    inference_modules.inference_removal_module( $kw11$REMOVAL_MUTUALLY_COHERENT, $list12 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_semantically_related_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_semantically_related_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_semantically_related_file();
  }
  static
  {
    me = new removal_modules_semantically_related();
    $default_mutually_coherent_cost$ = null;
    $sym0$FORT_P = makeSymbol( "FORT-P" );
    $const1$or = makeConstSym(( "or" ) );
    $const2$geographicalSubRegions = makeConstSym(( "geographicalSubRegions" ) );
    $const3$geopoliticalSubdivision = makeConstSym(( "geopoliticalSubdivision" ) );
    $const4$genls = makeConstSym(( "genls" ) );
    $kw5$GENLS = makeKeyword( "GENLS" );
    $const6$isa = makeConstSym(( "isa" ) );
    $kw7$ISA = makeKeyword( "ISA" );
    $kw8$OPAQUE = makeKeyword( "OPAQUE" );
    $const9$mutuallyCoherent = makeConstSym(( "mutuallyCoherent" ) );
    $kw10$POS = makeKeyword( "POS" );
    $kw11$REMOVAL_MUTUALLY_COHERENT = makeKeyword( "REMOVAL-MUTUALLY-COHERENT" );
    $list12 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), makeConstSym(( "mutuallyCoherent" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( makeConstSym(( "mutuallyCoherent" ) ), makeKeyword( "FORT" ), makeKeyword( "FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*DEFAULT-MUTUALLY-COHERENT-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-MUTUALLY-COHERENT-EXPAND" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$mutuallyCoherent <fort> <fully bound>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$mutuallyCoherent #$BillClinton HilaryClinton)" )
    } );
  }
}
/*
 * 
 * Total time: 104 ms
 * 
 */