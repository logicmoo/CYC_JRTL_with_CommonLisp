package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_kb_indexing
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kb_indexing";
  public static final String myFingerPrint = "1959364b4582ae9b9e9bf72f2a0ff961803c07a48542748f344b058668ce79aa";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-indexing.lisp", position = 868L)
  private static SubLSymbol $default_removal_mt_cardinality_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-indexing.lisp", position = 2131L)
  private static SubLSymbol $default_removal_mt_cardinality_for_term_cost$;
  private static final SubLObject $const0$mtCardinality;
  private static final SubLSymbol $kw1$POS;
  private static final SubLSymbol $kw2$REMOVAL_MT_CARDINALITY_GENERATE;
  private static final SubLList $list3;
  private static final SubLObject $const4$mtCardinalityForTerm;
  private static final SubLSymbol $sym5$RELEVANT_MT_IS_EQ;
  private static final SubLSymbol $kw6$REMOVAL_MT_CARDINALITY_FOR_TERM_GENERATE;
  private static final SubLList $list7;
  private static final SubLObject $const8$assertionCountForTermsInSet;
  private static final SubLSymbol $sym9$IMPLEMENTATION_ASSERTION_;
  private static final SubLObject $const10$quotedIsa;
  private static final SubLSymbol $kw11$REMOVAL_ASSERTION_COUNT_FOR_TERMS_SET_GENERATE;
  private static final SubLList $list12;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-indexing.lisp", position = 930L)
  public static SubLObject removal_mt_cardinality(final SubLObject mt)
  {
    if( NIL != forts.fort_p( mt ) && NIL == kb_indexing.broad_mtP( mt ) )
    {
      return kb_indexing.num_mt_index( mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-indexing.lisp", position = 2202L)
  public static SubLObject removal_mt_cardinality_for_term(final SubLObject mt, final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( NIL != forts.fort_p( mt ) && NIL != forts.fort_p( v_term ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym5$RELEVANT_MT_IS_EQ, thread );
        mt_relevance_macros.$mt$.bind( mt, thread );
        result = kb_indexing.relevant_num_index( v_term );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-indexing.lisp", position = 3493L)
  public static SubLObject removal_assertion_count_for_terms_set(final SubLObject term_set)
  {
    SubLObject result = NIL;
    if( NIL != el_utilities.el_extensional_set_p( term_set ) )
    {
      final SubLObject terms = el_utilities.el_extensional_set_elements( term_set );
      result = cardinality_estimates.terms_assertion_count( terms, NIL, $sym9$IMPLEMENTATION_ASSERTION_ );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-indexing.lisp", position = 3778L)
  public static SubLObject implementation_assertionP(final SubLObject a)
  {
    if( NIL != assertions_high.gaf_assertionP( a ) )
    {
      final SubLObject pred = assertions_high.gaf_predicate( a );
      if( pred.eql( $const10$quotedIsa ) || NIL != fort_types_interface.distributing_meta_knowledge_predicate_p( pred ) || NIL != fort_types_interface.documentation_predicate_p( pred, UNPROVIDED ) )
      {
        return T;
      }
    }
    return NIL;
  }

  public static SubLObject declare_removal_modules_kb_indexing_file()
  {
    SubLFiles.declareFunction( me, "removal_mt_cardinality", "REMOVAL-MT-CARDINALITY", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_mt_cardinality_for_term", "REMOVAL-MT-CARDINALITY-FOR-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_assertion_count_for_terms_set", "REMOVAL-ASSERTION-COUNT-FOR-TERMS-SET", 1, 0, false );
    SubLFiles.declareFunction( me, "implementation_assertionP", "IMPLEMENTATION-ASSERTION?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_kb_indexing_file()
  {
    $default_removal_mt_cardinality_cost$ = SubLFiles.deflexical( "*DEFAULT-REMOVAL-MT-CARDINALITY-COST*", ONE_INTEGER );
    $default_removal_mt_cardinality_for_term_cost$ = SubLFiles.deflexical( "*DEFAULT-REMOVAL-MT-CARDINALITY-FOR-TERM-COST*", ONE_INTEGER );
    return NIL;
  }

  public static SubLObject setup_removal_modules_kb_indexing_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$mtCardinality );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const0$mtCardinality, ONE_INTEGER );
    inference_modules.inference_removal_module( $kw2$REMOVAL_MT_CARDINALITY_GENERATE, $list3 );
    inference_modules.register_solely_specific_removal_module_predicate( $const4$mtCardinalityForTerm );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const4$mtCardinalityForTerm, ONE_INTEGER );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const4$mtCardinalityForTerm, TWO_INTEGER );
    inference_modules.inference_removal_module( $kw6$REMOVAL_MT_CARDINALITY_FOR_TERM_GENERATE, $list7 );
    inference_modules.register_solely_specific_removal_module_predicate( $const8$assertionCountForTermsInSet );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const8$assertionCountForTermsInSet, TWO_INTEGER );
    utilities_macros.note_funcall_helper_function( $sym9$IMPLEMENTATION_ASSERTION_ );
    inference_modules.inference_removal_module( $kw11$REMOVAL_ASSERTION_COUNT_FOR_TERMS_SET_GENERATE, $list12 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_kb_indexing_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_kb_indexing_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_kb_indexing_file();
  }
  static
  {
    me = new removal_modules_kb_indexing();
    $default_removal_mt_cardinality_cost$ = null;
    $default_removal_mt_cardinality_for_term_cost$ = null;
    $const0$mtCardinality = constant_handles.reader_make_constant_shell( makeString( "mtCardinality" ) );
    $kw1$POS = makeKeyword( "POS" );
    $kw2$REMOVAL_MT_CARDINALITY_GENERATE = makeKeyword( "REMOVAL-MT-CARDINALITY-GENERATE" );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "mtCardinality" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "mtCardinality" ) ), makeKeyword( "FORT" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ),
      makeSymbol( "*DEFAULT-REMOVAL-MT-CARDINALITY-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "mtCardinality" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "MT" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "MT" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-MT-CARDINALITY" ), makeKeyword( "INPUT" ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "mtCardinality" ) ), ConsesLow
                      .list( makeKeyword( "VALUE" ), makeSymbol( "MT" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol( "*MT*" ), makeKeyword( "DOCUMENTATION" ), makeString(
                          "(#$mtCardinality <fort> <not-fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$mtCardinality #$CyclistsMt ?COUNT)" )
    } );
    $const4$mtCardinalityForTerm = constant_handles.reader_make_constant_shell( makeString( "mtCardinalityForTerm" ) );
    $sym5$RELEVANT_MT_IS_EQ = makeSymbol( "RELEVANT-MT-IS-EQ" );
    $kw6$REMOVAL_MT_CARDINALITY_FOR_TERM_GENERATE = makeKeyword( "REMOVAL-MT-CARDINALITY-FOR-TERM-GENERATE" );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "mtCardinalityForTerm" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "mtCardinalityForTerm" ) ), makeKeyword( "FORT" ), makeKeyword( "FORT" ), makeKeyword( "NOT-FULLY-BOUND" ) ),
      makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-REMOVAL-MT-CARDINALITY-FOR-TERM-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list(
          makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "mtCardinalityForTerm" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "MT" ) ), ConsesLow.list(
              makeKeyword( "BIND" ), makeSymbol( "TERM" ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "NA" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-MT-CARDINALITY-FOR-TERM" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "MT" ) ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "mtCardinalityForTerm" ) ),
                          ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "MT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MT" ), makeSymbol(
                              "*MT*" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$mtCardinalityForTerm <fort> <fort> <not-fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString(
                                  "(#$mtCardinalityForTerm #$CyclistsMt #$Cyc ?COUNT)" )
    } );
    $const8$assertionCountForTermsInSet = constant_handles.reader_make_constant_shell( makeString( "assertionCountForTermsInSet" ) );
    $sym9$IMPLEMENTATION_ASSERTION_ = makeSymbol( "IMPLEMENTATION-ASSERTION?" );
    $const10$quotedIsa = constant_handles.reader_make_constant_shell( makeString( "quotedIsa" ) );
    $kw11$REMOVAL_ASSERTION_COUNT_FOR_TERMS_SET_GENERATE = makeKeyword( "REMOVAL-ASSERTION-COUNT-FOR-TERMS-SET-GENERATE" );
    $list12 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "assertionCountForTermsInSet" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "assertionCountForTermsInSet" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FULLY-BOUND" ) ),
      makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "assertionCountForTermsInSet" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TERM-SET" ) ) ), makeKeyword( "NA" ) ),
      makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "NON-NULL-ANSWER-TO-SINGLETON" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
          "REMOVAL-ASSERTION-COUNT-FOR-TERMS-SET" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM-SET" ) ) ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles
              .reader_make_constant_shell( makeString( "assertionCountForTermsInSet" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TERM-SET" ) ) ), makeKeyword( "SUPPORT-MT" ),
      makeSymbol( "*MT*" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$assertionCountForTermsInSet <not-fully-bound> <el-set>)" ), makeKeyword( "EXAMPLE" ), makeString(
          "(#$isa CyclistsMt (#$assertionCountForTermsInSet ?COUNT #$Cyc)" )
    } );
  }
}
/*
 * 
 * Total time: 101 ms
 * 
 */