package com.cyc.cycjava.cycl.cyc_testing.kb_content_test;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.inference.janus;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.cyc_testing.ctest_utils;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kct_utils
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils";
  public static final String myFingerPrint = "ce078627860d195bb6fbd005bb96bb2b37cb71129e7f37e0955588335c25abfe";
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 1131L)
  public static SubLSymbol $kct_test_execution_type$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 1272L)
  public static SubLSymbol $kct_collection_execution_type$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 1329L)
  public static SubLSymbol $kct_default_error_notify_cyclist$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 1390L)
  public static SubLSymbol $kct_use_sampling_mode$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 1440L)
  public static SubLSymbol $kct_debug$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 1478L)
  private static SubLSymbol $kct_core_constants$;
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 21779L)
  private static SubLSymbol $hypothetical_bindings_to_substitute$;
  private static final SubLString $str0$I;
  private static final SubLString $str1$C;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$VALID_CONSTANT_;
  private static final SubLSymbol $sym4$FORT_P;
  private static final SubLObject $const5$testQuerySpecification;
  private static final SubLSymbol $kw6$TRUE;
  private static final SubLSymbol $sym7$KBQ_QUERY_SPEC_P;
  private static final SubLObject $const8$KBContentTest_FullySpecified;
  private static final SubLObject $const9$KBContentTest;
  private static final SubLObject $const10$KBContentTestSpecificationType;
  private static final SubLObject $const11$isa;
  private static final SubLSymbol $sym12$KCT_TEST_COLLECTION_P;
  private static final SubLObject $const13$comment;
  private static final SubLSymbol $sym14$COLLECTION_P;
  private static final SubLSymbol $kw15$WHO;
  private static final SubLObject $const16$testResponsibleCyclist;
  private static final SubLList $list17;
  private static final SubLObject $const18$testCollectionCyclistResponsible;
  private static final SubLObject $const19$testMetricsToGather;
  private static final SubLObject $const20$testAnswersCycL_Exact;
  private static final SubLObject $const21$testAnswersCycL_Wanted;
  private static final SubLObject $const22$testAnswersCycL_NotWanted;
  private static final SubLObject $const23$testAnswersCycLUnimportant;
  private static final SubLObject $const24$testAnswers_Cardinality_Exact;
  private static final SubLObject $const25$testAnswers_Cardinality_Min;
  private static final SubLObject $const26$testAnswers_Cardinality_Max;
  private static final SubLList $list27;
  private static final SubLSymbol $sym28$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const29$EverythingPSC;
  private static final SubLSymbol $kw30$GAF;
  private static final SubLObject $const31$TestVocabularyMt;
  private static final SubLSymbol $kw32$SEVERE;
  private static final SubLString $str33$;
  private static final SubLString $str34$___A_is_not_a___KBContentTest_Ful;
  private static final SubLSymbol $kw35$NOT_A_TEST_SPECIFICATION;
  private static final SubLString $str36$___A_does_not_have_a_valid_arg2_f;
  private static final SubLSymbol $kw37$NO_VALID_QUERY;
  private static final SubLString $str38$_has_no___testAnswer_MultipleChoi;
  private static final SubLSymbol $kw39$NO_TEST_EXPECTATION;
  private static final SubLObject $const40$testAnswerSupport_Wanted;
  private static final SubLObject $const41$testAnswerSupport_NotWanted;
  private static final SubLObject $const42$testAnswerSupportedByHLSupportMod;
  private static final SubLObject $const43$testAnswerSupportedByHLSupportMod;
  private static final SubLString $str44$___A_has_no_stated_test_expectati;
  private static final SubLString $str45$___A_s_exact_answer_should_includ;
  private static final SubLSymbol $kw46$EXACT_ANSWER_CONTAINS_MALFORMED_INFERENCE_BINDING_SET;
  private static final SubLString $str47$_A_;
  private static final SubLString $str48$___A_s_wanted_answer_should_be_an;
  private static final SubLSymbol $kw49$WANTED_ANSWER_IS_NOT_AN_INFERENCE_BINDING_SET;
  private static final SubLString $str50$___A_s_unwanted_answer_should_be_;
  private static final SubLSymbol $kw51$UNWANTED_ANSWER_IS_NOT_AN_INFERENCE_BINDING_SET;
  private static final SubLSymbol $kw52$PROBLEM;
  private static final SubLString $str53$___A_does_not_have_a_responsible_;
  private static final SubLSymbol $kw54$NO_RESPONSIBLE_CYCLIST;
  private static final SubLSymbol $kw55$BREADTH;
  private static final SubLSymbol $kw56$QUEUE;
  private static final SubLSymbol $kw57$STACK;
  private static final SubLSymbol $sym58$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw59$ERROR;
  private static final SubLString $str60$_A_is_not_a__A;
  private static final SubLSymbol $sym61$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw62$CERROR;
  private static final SubLString $str63$continue_anyway;
  private static final SubLSymbol $kw64$WARN;
  private static final SubLString $str65$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLObject $const66$AreteQuery;
  private static final SubLString $str67$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str68$attempting_to_bind_direction_link;
  private static final SubLList $list69;
  private static final SubLString $str70$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLString $str71$___A_is_not_a___KBContentTestSpec;
  private static final SubLString $str72$___A_has_no_responsible_Cyclists_;
  private static final SubLString $str73$___A_has_no_instances_;
  private static final SubLString $str74$Sampling;
  private static final SubLString $str75$Hypothesize;
  private static final SubLString $str76$Simple;
  private static final SubLString $str77$Test_Set;
  private static final SubLString $str78$Individual_Test;
  private static final SubLObject $const79$CycArchitectureMt;
  private static final SubLObject $const80$CycKBContentTestFramework;
  private static final SubLObject $const81$defaultSoftwareParameterValueInSo;
  private static final SubLObject $const82$True;
  private static final SubLObject $const83$False;
  private static final SubLSymbol $sym84$CANONICALIZE_QUERY_BINDINGS_INT;
  private static final SubLSymbol $kw85$UNINITIALIZED;
  private static final SubLSymbol $sym86$_EXIT;
  private static final SubLSymbol $sym87$HYPOTHETICAL_FOR_VARIABLE_FN_TERM_P;
  private static final SubLSymbol $sym88$HYPOTHETICAL_FOR_VARIABLE;
  private static final SubLObject $const89$HypotheticalForVariableFn;
  private static final SubLString $str90$When_determining_test_results__co;
  private static final SubLSymbol $sym91$NCANONICALIZE_QUERY_BINDING_INT;
  private static final SubLSymbol $sym92$TERM__;
  private static final SubLSymbol $sym93$VARIABLE_BINDING_VARIABLE;
  private static final SubLList $list94;

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 791L)
  public static SubLObject initialize_kct()
  {
    ctest_utils.initialize_ctest();
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 1700L)
  public static SubLObject initialize_kct_kb_feature()
  {
    if( NIL != list_utilities.every_in_list( $sym3$VALID_CONSTANT_, $kct_core_constants$.getGlobalValue(), UNPROVIDED ) )
    {
      kb_control_vars.set_kct_kb_loaded();
    }
    else
    {
      kb_control_vars.unset_kct_kb_loaded();
    }
    return kb_control_vars.kct_kb_loaded_p();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 1968L)
  public static SubLObject kct_query_specification(final SubLObject kct_constant, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = kct_variables.kct_mt();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != janus.janus_operation_p( kct_constant ) )
    {
      return kct_constant;
    }
    assert NIL != forts.fort_p( kct_constant ) : kct_constant;
    SubLObject result = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      result = kb_mapping_utilities.fpred_value( kct_constant, $const5$testQuerySpecification, ONE_INTEGER, TWO_INTEGER, $kw6$TRUE );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 2464L)
  public static SubLObject query_specification_kcts(final SubLObject query_spec, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = kct_variables.kct_mt();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != janus.janus_operation_p( query_spec ) )
    {
      return query_spec;
    }
    assert NIL != kb_query.kbq_query_spec_p( query_spec ) : query_spec;
    SubLObject result = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      result = kb_mapping_utilities.pred_values( query_spec, $const5$testQuerySpecification, TWO_INTEGER, ONE_INTEGER, $kw6$TRUE );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 2862L)
  public static SubLObject kct_initialize()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 3013L)
  public static SubLObject kct_test_spec_p(final SubLObject v_object, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = kct_variables.kct_mt();
    }
    return makeBoolean( ( NIL != kb_control_vars.kct_kb_loaded_p() && NIL != forts.fort_p( v_object ) && NIL != isa.isaP( v_object, $const8$KBContentTest_FullySpecified, mt, UNPROVIDED ) ) || NIL != janus
        .janus_operation_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 3225L)
  public static SubLObject kct_test_spec_permissive_p(final SubLObject v_object)
  {
    return makeBoolean( ( NIL != kb_control_vars.kct_kb_loaded_p() && NIL != forts.fort_p( v_object ) && NIL != isa.isa_in_any_mtP( v_object, $const9$KBContentTest ) ) || NIL != janus.janus_operation_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 3471L)
  public static SubLObject kct_test_collection_p(final SubLObject v_object, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = kct_variables.kct_mt();
    }
    if( NIL != kb_control_vars.kct_kb_loaded_p() && NIL != forts.fort_p( v_object ) )
    {
      return isa.isaP( v_object, $const10$KBContentTestSpecificationType, mt, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 3665L)
  public static SubLObject kct_asserted_test_collections(final SubLObject test_spec, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = kct_variables.kct_mt();
    }
    assert NIL != forts.fort_p( test_spec ) : test_spec;
    final SubLObject result = kb_mapping_utilities.pred_values_in_relevant_mts( test_spec, $const11$isa, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return list_utilities.remove_if_not( Symbols.symbol_function( $sym12$KCT_TEST_COLLECTION_P ), result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 3909L)
  public static SubLObject kct_comments(final SubLObject test_spec, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = kct_variables.kct_mt();
    }
    assert NIL != forts.fort_p( test_spec ) : test_spec;
    return kb_mapping_utilities.pred_values_in_relevant_mts( test_spec, $const13$comment, mt, ONE_INTEGER, TWO_INTEGER, $kw6$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 4081L)
  public static SubLObject kct_test_collection_instances(final SubLObject test_col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = kct_variables.kct_mt();
    }
    assert NIL != fort_types_interface.collection_p( test_col ) : test_col;
    return isa.all_fort_instances( test_col, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 4244L)
  public static SubLObject kct_responsible_cyclists(final SubLObject test_spec, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = kct_variables.kct_mt_for_now( UNPROVIDED );
    }
    assert NIL != forts.fort_p( test_spec ) : test_spec;
    return ask_utilities.ask_variable( $kw15$WHO, ConsesLow.listS( $const16$testResponsibleCyclist, test_spec, $list17 ), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 4447L)
  public static SubLObject kct_collection_responsible_cyclists(final SubLObject test_col, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = kct_variables.kct_mt_for_now( UNPROVIDED );
    }
    assert NIL != forts.fort_p( test_col ) : test_col;
    return ask_utilities.ask_variable( $kw15$WHO, ConsesLow.listS( $const18$testCollectionCyclistResponsible, test_col, $list17 ), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 4668L)
  public static SubLObject kct_test_metrics(final SubLObject test_spec, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = kct_variables.kct_mt();
    }
    if( NIL != janus.janus_operation_p( test_spec ) )
    {
      return NIL;
    }
    assert NIL != forts.fort_p( test_spec ) : test_spec;
    return kb_mapping_utilities.pred_values_in_relevant_mts( test_spec, $const19$testMetricsToGather, mt, ONE_INTEGER, TWO_INTEGER, $kw6$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 4970L)
  public static SubLObject kct_exact_set_of_binding_sets(final SubLObject test_spec, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = kct_variables.kct_mt();
    }
    assert NIL != forts.fort_p( test_spec ) : test_spec;
    return kb_mapping_utilities.fpred_value_in_mt( test_spec, $const20$testAnswersCycL_Exact, mt, ONE_INTEGER, TWO_INTEGER, $kw6$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 5200L)
  public static SubLObject kct_exact_binding_sets(final SubLObject test_spec, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = kct_variables.kct_mt();
    }
    assert NIL != forts.fort_p( test_spec ) : test_spec;
    return cycl_utilities.nat_args( kct_exact_set_of_binding_sets( test_spec, mt ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 5416L)
  public static SubLObject kct_wanted_binding_sets(final SubLObject test_spec, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = kct_variables.kct_mt();
    }
    assert NIL != forts.fort_p( test_spec ) : test_spec;
    return kb_mapping_utilities.pred_values_in_mt( test_spec, $const21$testAnswersCycL_Wanted, mt, ONE_INTEGER, TWO_INTEGER, $kw6$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 5643L)
  public static SubLObject kct_unwanted_binding_sets(final SubLObject test_spec, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = kct_variables.kct_mt();
    }
    assert NIL != forts.fort_p( test_spec ) : test_spec;
    return kb_mapping_utilities.pred_values_in_mt( test_spec, $const22$testAnswersCycL_NotWanted, mt, ONE_INTEGER, TWO_INTEGER, $kw6$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 5877L)
  public static SubLObject kct_bindings_unimportantP(final SubLObject test_spec, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = kct_variables.kct_mt();
    }
    assert NIL != forts.fort_p( test_spec ) : test_spec;
    return list_utilities.sublisp_boolean( kb_mapping_utilities.some_pred_value_in_mt( test_spec, $const23$testAnswersCycLUnimportant, mt, ONE_INTEGER, $kw6$TRUE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 6103L)
  public static SubLObject kct_binding_sets_cardinality(final SubLObject test_spec, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = kct_variables.kct_mt();
    }
    assert NIL != forts.fort_p( test_spec ) : test_spec;
    return kb_mapping_utilities.fpred_value_in_mt( test_spec, $const24$testAnswers_Cardinality_Exact, mt, ONE_INTEGER, TWO_INTEGER, $kw6$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 6323L)
  public static SubLObject kct_binding_sets_min_cardinality(final SubLObject test_spec, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = kct_variables.kct_mt();
    }
    assert NIL != forts.fort_p( test_spec ) : test_spec;
    return kb_mapping_utilities.fpred_value_in_mt( test_spec, $const25$testAnswers_Cardinality_Min, mt, ONE_INTEGER, TWO_INTEGER, $kw6$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 6545L)
  public static SubLObject kct_binding_sets_max_cardinality(final SubLObject test_spec, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = kct_variables.kct_mt();
    }
    assert NIL != forts.fort_p( test_spec ) : test_spec;
    return kb_mapping_utilities.fpred_value_in_mt( test_spec, $const26$testAnswers_Cardinality_Max, mt, ONE_INTEGER, TWO_INTEGER, $kw6$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 6767L)
  public static SubLObject kct_defining_mt(final SubLObject test_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject candidates = NIL;
    SubLObject result = NIL;
    final SubLObject predicates = $list27;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym28$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const29$EverythingPSC, thread );
      SubLObject cdolist_list_var = predicates;
      SubLObject predicate = NIL;
      predicate = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject pred_var = predicate;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( test_spec, ONE_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( test_spec, ONE_INTEGER, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw30$GAF, $kw6$TRUE, NIL );
                SubLObject done_var_$1 = NIL;
                final SubLObject token_var_$2 = NIL;
                while ( NIL == done_var_$1)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$2 );
                  final SubLObject valid_$3 = makeBoolean( !token_var_$2.eql( assertion ) );
                  if( NIL != valid_$3 )
                  {
                    final SubLObject mt = assertions_high.assertion_mt( assertion );
                    final SubLObject item_var;
                    final SubLObject monad = item_var = hlmt.hlmt_monad_mt( mt );
                    if( NIL == conses_high.member( item_var, candidates, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                    {
                      candidates = ConsesLow.cons( item_var, candidates );
                    }
                  }
                  done_var_$1 = makeBoolean( NIL == valid_$3 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        predicate = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    result = genl_mts.max_floor_mts( candidates, candidates, UNPROVIDED );
    if( NIL != list_utilities.singletonP( result ) )
    {
      return result.first();
    }
    return $const31$TestVocabularyMt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 7790L)
  public static SubLObject kct_test_runnableP(final SubLObject test_spec)
  {
    return makeBoolean( NIL == kct_test_known_unrunnableP( test_spec ) && $kw32$SEVERE != why_not_kct_test_valid( test_spec ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 7961L)
  public static SubLObject kct_test_known_unrunnableP(final SubLObject test_spec)
  {
    if( NIL != kct_test_spec_p( test_spec, UNPROVIDED ) )
    {
      final SubLObject query_spec = kct_query_specification( test_spec, UNPROVIDED );
      if( NIL != query_spec )
      {
        return kb_query.kbq_known_unrunnableP( query_spec );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 8184L)
  public static SubLObject why_not_kct_test_valid(final SubLObject test_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != janus.janus_operation_p( test_spec ) )
    {
      return Values.values( NIL, NIL, NIL );
    }
    SubLObject result = NIL;
    SubLObject message = $str33$;
    SubLObject problem_keywords = NIL;
    if( NIL == kct_test_spec_p( test_spec, UNPROVIDED ) )
    {
      message = PrintLow.format( NIL, $str34$___A_is_not_a___KBContentTest_Ful, test_spec );
      problem_keywords = ConsesLow.cons( $kw35$NOT_A_TEST_SPECIFICATION, problem_keywords );
      return Values.values( $kw32$SEVERE, message, Sequences.nreverse( problem_keywords ) );
    }
    final SubLObject query_spec = kct_query_specification( test_spec, UNPROVIDED );
    if( NIL == kb_query.kbq_query_spec_p( query_spec ) )
    {
      message = PrintLow.format( NIL, $str36$___A_does_not_have_a_valid_arg2_f, test_spec );
      problem_keywords = ConsesLow.cons( $kw37$NO_VALID_QUERY, problem_keywords );
      return Values.values( $kw32$SEVERE, message, Sequences.nreverse( problem_keywords ) );
    }
    thread.resetMultipleValues();
    final SubLObject query_problem = kb_query.why_not_kbq_valid( query_spec, test_spec );
    final SubLObject query_problem_message = thread.secondMultipleValue();
    final SubLObject query_problem_keywords = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL != query_problem )
    {
      result = query_problem;
      message = query_problem_message;
      problem_keywords = ConsesLow.append( query_problem_keywords, problem_keywords );
    }
    if( NIL != kb_query.multiple_choice_testP( test_spec ) )
    {
      if( NIL == Functions.funcall( makeSymbol( "MULTIPLE-CHOICE-TEST-DESIRED-OPTION" ), test_spec ) )
      {
        result = $kw32$SEVERE;
        message = Sequences.cconcatenate( message, Sequences.cconcatenate( format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[] { format_nil.format_nil_a_no_copy( test_spec ),
          $str38$_has_no___testAnswer_MultipleChoi
        } ) );
        problem_keywords = ConsesLow.cons( $kw39$NO_TEST_EXPECTATION, problem_keywords );
      }
    }
    else
    {
      final SubLObject exact = kct_exact_set_of_binding_sets( test_spec, kct_variables.kct_mt() );
      final SubLObject unimportant = kct_bindings_unimportantP( test_spec, kct_variables.kct_mt() );
      final SubLObject wanted = kct_wanted_binding_sets( test_spec, kct_variables.kct_mt() );
      final SubLObject not_wanted = kct_unwanted_binding_sets( test_spec, kct_variables.kct_mt() );
      final SubLObject binding_sets_cardinality = kct_binding_sets_cardinality( test_spec, kct_variables.kct_mt() );
      final SubLObject binding_sets_min_cardinality = kct_binding_sets_min_cardinality( test_spec, kct_variables.kct_mt() );
      final SubLObject binding_sets_max_cardinality = kct_binding_sets_max_cardinality( test_spec, kct_variables.kct_mt() );
      final SubLObject support_wanted = kb_mapping_utilities.pred_values_in_mt( test_spec, $const40$testAnswerSupport_Wanted, kct_variables.kct_mt(), ONE_INTEGER, TWO_INTEGER, UNPROVIDED );
      final SubLObject support_not_wanted = kb_mapping_utilities.pred_values_in_mt( test_spec, $const41$testAnswerSupport_NotWanted, kct_variables.kct_mt(), ONE_INTEGER, TWO_INTEGER, UNPROVIDED );
      final SubLObject support_module_wanted = kb_mapping_utilities.pred_values_in_mt( test_spec, $const42$testAnswerSupportedByHLSupportMod, kct_variables.kct_mt(), ONE_INTEGER, TWO_INTEGER, UNPROVIDED );
      final SubLObject support_module_not_wanted = kb_mapping_utilities.pred_values_in_mt( test_spec, $const43$testAnswerSupportedByHLSupportMod, kct_variables.kct_mt(), ONE_INTEGER, TWO_INTEGER, UNPROVIDED );
      SubLObject bad_exact = NIL;
      SubLObject bad_wanted = NIL;
      SubLObject bad_not_wanted = NIL;
      if( NIL == exact && NIL == unimportant && NIL == wanted && NIL == not_wanted && NIL == binding_sets_cardinality && NIL == binding_sets_min_cardinality && NIL == binding_sets_max_cardinality && NIL == support_wanted
          && NIL == support_not_wanted && NIL == support_module_wanted && NIL == support_module_not_wanted )
      {
        result = $kw32$SEVERE;
        message = Sequences.cconcatenate( message, PrintLow.format( NIL, $str44$___A_has_no_stated_test_expectati, test_spec ) );
        problem_keywords = ConsesLow.cons( $kw39$NO_TEST_EXPECTATION, problem_keywords );
      }
      SubLObject cdolist_list_var = cycl_utilities.nat_args( exact, UNPROVIDED );
      SubLObject binding_set = NIL;
      binding_set = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == bindings.kb_binding_set_p( binding_set ) )
        {
          bad_exact = ConsesLow.cons( binding_set, bad_exact );
        }
        cdolist_list_var = cdolist_list_var.rest();
        binding_set = cdolist_list_var.first();
      }
      if( NIL != bad_exact )
      {
        result = $kw32$SEVERE;
        message = Sequences.cconcatenate( message, PrintLow.format( NIL, $str45$___A_s_exact_answer_should_includ, test_spec ) );
        problem_keywords = ConsesLow.cons( $kw46$EXACT_ANSWER_CONTAINS_MALFORMED_INFERENCE_BINDING_SET, problem_keywords );
        cdolist_list_var = bad_exact;
        SubLObject bad = NIL;
        bad = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          message = Sequences.cconcatenate( message, PrintLow.format( NIL, $str47$_A_, bad ) );
          cdolist_list_var = cdolist_list_var.rest();
          bad = cdolist_list_var.first();
        }
      }
      cdolist_list_var = wanted;
      binding_set = NIL;
      binding_set = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == bindings.kb_binding_set_p( binding_set ) )
        {
          bad_wanted = ConsesLow.cons( binding_set, bad_wanted );
        }
        cdolist_list_var = cdolist_list_var.rest();
        binding_set = cdolist_list_var.first();
      }
      if( NIL != bad_wanted )
      {
        result = $kw32$SEVERE;
        message = Sequences.cconcatenate( message, PrintLow.format( NIL, $str48$___A_s_wanted_answer_should_be_an, test_spec ) );
        problem_keywords = ConsesLow.cons( $kw49$WANTED_ANSWER_IS_NOT_AN_INFERENCE_BINDING_SET, problem_keywords );
        cdolist_list_var = bad_wanted;
        SubLObject bad = NIL;
        bad = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          message = Sequences.cconcatenate( message, PrintLow.format( NIL, $str47$_A_, bad ) );
          cdolist_list_var = cdolist_list_var.rest();
          bad = cdolist_list_var.first();
        }
      }
      cdolist_list_var = not_wanted;
      binding_set = NIL;
      binding_set = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == bindings.kb_binding_set_p( binding_set ) )
        {
          bad_not_wanted = ConsesLow.cons( binding_set, bad_not_wanted );
        }
        cdolist_list_var = cdolist_list_var.rest();
        binding_set = cdolist_list_var.first();
      }
      if( NIL != bad_not_wanted )
      {
        result = $kw32$SEVERE;
        message = Sequences.cconcatenate( message, PrintLow.format( NIL, $str50$___A_s_unwanted_answer_should_be_, test_spec ) );
        problem_keywords = ConsesLow.cons( $kw51$UNWANTED_ANSWER_IS_NOT_AN_INFERENCE_BINDING_SET, problem_keywords );
        cdolist_list_var = bad_not_wanted;
        SubLObject bad = NIL;
        bad = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          message = Sequences.cconcatenate( message, PrintLow.format( NIL, $str47$_A_, bad ) );
          cdolist_list_var = cdolist_list_var.rest();
          bad = cdolist_list_var.first();
        }
      }
    }
    final SubLObject cyclists = kct_responsible_cyclists( test_spec, UNPROVIDED );
    if( NIL == cyclists )
    {
      if( result != $kw32$SEVERE )
      {
        result = $kw52$PROBLEM;
      }
      message = Sequences.cconcatenate( message, PrintLow.format( NIL, $str53$___A_does_not_have_a_responsible_, test_spec ) );
      problem_keywords = ConsesLow.cons( $kw54$NO_RESPONSIBLE_CYCLIST, problem_keywords );
    }
    return Values.values( result, message, Sequences.nreverse( problem_keywords ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 13732L)
  public static SubLObject categorize_kct_invalidity_reasons()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject dict = dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym28$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const29$EverythingPSC, thread );
      final SubLObject node_var = $const8$KBContentTest_FullySpecified;
      final SubLObject _prev_bind_0_$5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
      final SubLObject _prev_bind_1_$6 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
      try
      {
        sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const11$isa ), thread );
        sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          SubLObject node_var_$7 = node_var;
          final SubLObject deck_type = $kw57$STACK;
          final SubLObject recur_deck = deck.create_deck( deck_type );
          final SubLObject _prev_bind_0_$6 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
          try
          {
            sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              final SubLObject tv_var = NIL;
              final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
              final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym58$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                {
                  final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                  if( pcase_var.eql( $kw59$ERROR ) )
                  {
                    sbhl_paranoia.sbhl_error( ONE_INTEGER, $str60$_A_is_not_a__A, tv_var, $sym61$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw62$CERROR ) )
                  {
                    sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str63$continue_anyway, $str60$_A_is_not_a__A, tv_var, $sym61$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  }
                  else if( pcase_var.eql( $kw64$WARN ) )
                  {
                    Errors.warn( $str60$_A_is_not_a__A, tv_var, $sym61$SBHL_TRUE_TV_P );
                  }
                  else
                  {
                    Errors.warn( $str65$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                    Errors.cerror( $str63$continue_anyway, $str60$_A_is_not_a__A, tv_var, $sym61$SBHL_TRUE_TV_P );
                  }
                }
                final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const11$isa ) ), thread );
                  sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                      $const11$isa ) ) ), thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                      $const11$isa ) ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const11$isa ) ), thread );
                  if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( node_var, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                  {
                    final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$9 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                          .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const11$isa ) ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$7, UNPROVIDED );
                      while ( NIL != node_var_$7)
                      {
                        final SubLObject tt_node_var = node_var_$7;
                        SubLObject cdolist_list_var;
                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const11$isa ) );
                        SubLObject module_var = NIL;
                        module_var = cdolist_list_var.first();
                        while ( NIL != cdolist_list_var)
                        {
                          final SubLObject _prev_bind_0_$10 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node = function_terms.naut_to_nart( tt_node_var );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                            {
                              final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link )
                              {
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const11$isa ) ),
                                    sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links )
                                {
                                  SubLObject iteration_state;
                                  for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                    {
                                      final SubLObject _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                        SubLObject iteration_state_$19;
                                        for( iteration_state_$19 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$19 ); iteration_state_$19 = dictionary_contents.do_dictionary_contents_next( iteration_state_$19 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$19 );
                                          final SubLObject link_nodes = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                          {
                                            final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                              final SubLObject sol = link_nodes;
                                              if( NIL != set.set_p( sol ) )
                                              {
                                                final SubLObject set_contents_var = set.do_set_internal( sol );
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject test;
                                                SubLObject invalid;
                                                SubLObject why_string;
                                                SubLObject why_keywords;
                                                SubLObject query;
                                                for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                    set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                {
                                                  test = set_contents.do_set_contents_next( basis_object, state );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state, test ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( test,
                                                      sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( test, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( test ) )
                                                    {
                                                      thread.resetMultipleValues();
                                                      invalid = why_not_kct_test_valid( test );
                                                      why_string = thread.secondMultipleValue();
                                                      why_keywords = thread.thirdMultipleValue();
                                                      thread.resetMultipleValues();
                                                      if( $kw32$SEVERE == invalid )
                                                      {
                                                        query = kct_query_specification( test, UNPROVIDED );
                                                        if( NIL == isa.not_isaP( query, $const66$AreteQuery, UNPROVIDED, UNPROVIDED ) )
                                                        {
                                                          why_keywords = Sequences.delete( $kw54$NO_RESPONSIBLE_CYCLIST, why_keywords, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                                          dictionary_utilities.dictionary_push( dict, why_keywords, test );
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              else if( sol.isList() )
                                              {
                                                SubLObject csome_list_var = sol;
                                                SubLObject test2 = NIL;
                                                test2 = csome_list_var.first();
                                                while ( NIL != csome_list_var)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( test2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( test2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                    if( NIL != forts.fort_p( test2 ) )
                                                    {
                                                      thread.resetMultipleValues();
                                                      final SubLObject invalid2 = why_not_kct_test_valid( test2 );
                                                      final SubLObject why_string2 = thread.secondMultipleValue();
                                                      SubLObject why_keywords2 = thread.thirdMultipleValue();
                                                      thread.resetMultipleValues();
                                                      if( $kw32$SEVERE == invalid2 )
                                                      {
                                                        final SubLObject query2 = kct_query_specification( test2, UNPROVIDED );
                                                        if( NIL == isa.not_isaP( query2, $const66$AreteQuery, UNPROVIDED, UNPROVIDED ) )
                                                        {
                                                          why_keywords2 = Sequences.delete( $kw54$NO_RESPONSIBLE_CYCLIST, why_keywords2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                                          dictionary_utilities.dictionary_push( dict, why_keywords2, test2 );
                                                        }
                                                      }
                                                    }
                                                  }
                                                  csome_list_var = csome_list_var.rest();
                                                  test2 = csome_list_var.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str67$_A_is_neither_SET_P_nor_LISTP_, sol );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$12, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$19 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$11, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str68$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                              if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                              {
                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                SubLObject instance_tuple = NIL;
                                instance_tuple = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  SubLObject current;
                                  final SubLObject datum = current = instance_tuple;
                                  SubLObject link_node = NIL;
                                  SubLObject mt2 = NIL;
                                  SubLObject tv2 = NIL;
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list69 );
                                  link_node = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list69 );
                                  mt2 = current.first();
                                  current = current.rest();
                                  cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list69 );
                                  tv2 = current.first();
                                  current = current.rest();
                                  if( NIL == current )
                                  {
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                    {
                                      final SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                        {
                                          final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                            final SubLObject sol;
                                            final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                            if( NIL != set.set_p( sol ) )
                                            {
                                              final SubLObject set_contents_var = set.do_set_internal( sol );
                                              SubLObject basis_object;
                                              SubLObject state;
                                              SubLObject test;
                                              SubLObject invalid;
                                              SubLObject why_string;
                                              SubLObject why_keywords;
                                              SubLObject query;
                                              for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                  set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                              {
                                                test = set_contents.do_set_contents_next( basis_object, state );
                                                if( NIL != set_contents.do_set_contents_element_validP( state, test ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( test,
                                                    sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( test, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL != forts.fort_p( test ) )
                                                  {
                                                    thread.resetMultipleValues();
                                                    invalid = why_not_kct_test_valid( test );
                                                    why_string = thread.secondMultipleValue();
                                                    why_keywords = thread.thirdMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if( $kw32$SEVERE == invalid )
                                                    {
                                                      query = kct_query_specification( test, UNPROVIDED );
                                                      if( NIL == isa.not_isaP( query, $const66$AreteQuery, UNPROVIDED, UNPROVIDED ) )
                                                      {
                                                        why_keywords = Sequences.delete( $kw54$NO_RESPONSIBLE_CYCLIST, why_keywords, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                                        dictionary_utilities.dictionary_push( dict, why_keywords, test );
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            else if( sol.isList() )
                                            {
                                              SubLObject csome_list_var_$23 = sol;
                                              SubLObject test2 = NIL;
                                              test2 = csome_list_var_$23.first();
                                              while ( NIL != csome_list_var_$23)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( test2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( test2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                  if( NIL != forts.fort_p( test2 ) )
                                                  {
                                                    thread.resetMultipleValues();
                                                    final SubLObject invalid2 = why_not_kct_test_valid( test2 );
                                                    final SubLObject why_string2 = thread.secondMultipleValue();
                                                    SubLObject why_keywords2 = thread.thirdMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if( $kw32$SEVERE == invalid2 )
                                                    {
                                                      final SubLObject query2 = kct_query_specification( test2, UNPROVIDED );
                                                      if( NIL == isa.not_isaP( query2, $const66$AreteQuery, UNPROVIDED, UNPROVIDED ) )
                                                      {
                                                        why_keywords2 = Sequences.delete( $kw54$NO_RESPONSIBLE_CYCLIST, why_keywords2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                                        dictionary_utilities.dictionary_push( dict, why_keywords2, test2 );
                                                      }
                                                    }
                                                  }
                                                }
                                                csome_list_var_$23 = csome_list_var_$23.rest();
                                                test2 = csome_list_var_$23.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str67$_A_is_neither_SET_P_nor_LISTP_, sol );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$14, thread );
                                          }
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$13, thread );
                                      }
                                    }
                                  }
                                  else
                                  {
                                    cdestructuring_bind.cdestructuring_bind_error( datum, $list69 );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  instance_tuple = csome_list_var2.first();
                                }
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$24;
                              final SubLObject new_list = cdolist_list_var_$24 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const11$isa ) ), sbhl_search_vars.$sbhl_tv$
                                      .getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const11$isa ) ),
                                      sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn = NIL;
                              generating_fn = cdolist_list_var_$24.first();
                              while ( NIL != cdolist_list_var_$24)
                              {
                                final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                  final SubLObject sol2;
                                  final SubLObject link_nodes3 = sol2 = Functions.funcall( generating_fn, node );
                                  if( NIL != set.set_p( sol2 ) )
                                  {
                                    final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                    SubLObject basis_object2;
                                    SubLObject state2;
                                    SubLObject test3;
                                    SubLObject invalid3;
                                    SubLObject why_string3;
                                    SubLObject why_keywords3;
                                    SubLObject query3;
                                    for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                        set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                    {
                                      test3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state2, test3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( test3, sbhl_marking_vars.$sbhl_gather_space$
                                          .getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( test3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        if( NIL != forts.fort_p( test3 ) )
                                        {
                                          thread.resetMultipleValues();
                                          invalid3 = why_not_kct_test_valid( test3 );
                                          why_string3 = thread.secondMultipleValue();
                                          why_keywords3 = thread.thirdMultipleValue();
                                          thread.resetMultipleValues();
                                          if( $kw32$SEVERE == invalid3 )
                                          {
                                            query3 = kct_query_specification( test3, UNPROVIDED );
                                            if( NIL == isa.not_isaP( query3, $const66$AreteQuery, UNPROVIDED, UNPROVIDED ) )
                                            {
                                              why_keywords3 = Sequences.delete( $kw54$NO_RESPONSIBLE_CYCLIST, why_keywords3, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                              dictionary_utilities.dictionary_push( dict, why_keywords3, test3 );
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  else if( sol2.isList() )
                                  {
                                    SubLObject csome_list_var3 = sol2;
                                    SubLObject test4 = NIL;
                                    test4 = csome_list_var3.first();
                                    while ( NIL != csome_list_var3)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( test4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( test4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                        if( NIL != forts.fort_p( test4 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject invalid4 = why_not_kct_test_valid( test4 );
                                          final SubLObject why_string4 = thread.secondMultipleValue();
                                          SubLObject why_keywords4 = thread.thirdMultipleValue();
                                          thread.resetMultipleValues();
                                          if( $kw32$SEVERE == invalid4 )
                                          {
                                            final SubLObject query4 = kct_query_specification( test4, UNPROVIDED );
                                            if( NIL == isa.not_isaP( query4, $const66$AreteQuery, UNPROVIDED, UNPROVIDED ) )
                                            {
                                              why_keywords4 = Sequences.delete( $kw54$NO_RESPONSIBLE_CYCLIST, why_keywords4, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                              dictionary_utilities.dictionary_push( dict, why_keywords4, test4 );
                                            }
                                          }
                                        }
                                      }
                                      csome_list_var3 = csome_list_var3.rest();
                                      test4 = csome_list_var3.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str67$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$15, thread );
                                }
                                cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                                generating_fn = cdolist_list_var_$24.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$10, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$10, thread );
                          }
                          cdolist_list_var = cdolist_list_var.rest();
                          module_var = cdolist_list_var.first();
                        }
                        SubLObject cdolist_list_var2;
                        final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                            $const11$isa ) ) );
                        SubLObject module_var2 = NIL;
                        module_var2 = cdolist_list_var2.first();
                        while ( NIL != cdolist_list_var2)
                        {
                          final SubLObject _prev_bind_0_$16 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            final SubLObject node2 = function_terms.naut_to_nart( node_var_$7 );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                            {
                              final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link2 )
                              {
                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links2 )
                                {
                                  SubLObject iteration_state2;
                                  for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                    {
                                      final SubLObject _prev_bind_0_$17 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                        SubLObject iteration_state_$20;
                                        for( iteration_state_$20 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                            iteration_state_$20 ); iteration_state_$20 = dictionary_contents.do_dictionary_contents_next( iteration_state_$20 ) )
                                        {
                                          thread.resetMultipleValues();
                                          final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$20 );
                                          final SubLObject link_nodes4 = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                          {
                                            final SubLObject _prev_bind_0_$18 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                              final SubLObject sol3 = link_nodes4;
                                              if( NIL != set.set_p( sol3 ) )
                                              {
                                                final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                                SubLObject basis_object3;
                                                SubLObject state3;
                                                SubLObject node_vars_link_node;
                                                for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                    set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                                                {
                                                  node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state3 );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                      node_vars_link_node, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node, recur_deck );
                                                  }
                                                }
                                              }
                                              else if( sol3.isList() )
                                              {
                                                SubLObject csome_list_var4 = sol3;
                                                SubLObject node_vars_link_node2 = NIL;
                                                node_vars_link_node2 = csome_list_var4.first();
                                                while ( NIL != csome_list_var4)
                                                {
                                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node2, recur_deck );
                                                  }
                                                  csome_list_var4 = csome_list_var4.rest();
                                                  node_vars_link_node2 = csome_list_var4.first();
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str67$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$18, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$20 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$17, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str68$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                            {
                              SubLObject cdolist_list_var_$25;
                              final SubLObject new_list2 = cdolist_list_var_$25 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                  .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                      UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              SubLObject generating_fn2 = NIL;
                              generating_fn2 = cdolist_list_var_$25.first();
                              while ( NIL != cdolist_list_var_$25)
                              {
                                final SubLObject _prev_bind_0_$19 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                  final SubLObject sol4;
                                  final SubLObject link_nodes5 = sol4 = Functions.funcall( generating_fn2, node2 );
                                  if( NIL != set.set_p( sol4 ) )
                                  {
                                    final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                    SubLObject basis_object4;
                                    SubLObject state4;
                                    SubLObject node_vars_link_node3;
                                    for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                        set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                    {
                                      node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state4 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                          UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node3, recur_deck );
                                      }
                                    }
                                  }
                                  else if( sol4.isList() )
                                  {
                                    SubLObject csome_list_var5 = sol4;
                                    SubLObject node_vars_link_node4 = NIL;
                                    node_vars_link_node4 = csome_list_var5.first();
                                    while ( NIL != csome_list_var5)
                                    {
                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node4, recur_deck );
                                      }
                                      csome_list_var5 = csome_list_var5.rest();
                                      node_vars_link_node4 = csome_list_var5.first();
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str67$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$19, thread );
                                }
                                cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                                generating_fn2 = cdolist_list_var_$25.first();
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$11, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$16, thread );
                          }
                          cdolist_list_var2 = cdolist_list_var2.rest();
                          module_var2 = cdolist_list_var2.first();
                        }
                        node_var_$7 = deck.deck_pop( recur_deck );
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$15, thread );
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$9, thread );
                      sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$9, thread );
                    }
                  }
                  else
                  {
                    sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str70$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                        UNPROVIDED, UNPROVIDED );
                  }
                }
                finally
                {
                  sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                  sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$8, thread );
                  sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$8, thread );
                }
              }
              finally
              {
                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$7, thread );
                sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$7, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$6, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_1_$6, thread );
        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$5, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return dict;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 14530L)
  public static SubLObject why_not_kct_test_collection_valid(final SubLObject test_col)
  {
    SubLObject result = NIL;
    SubLObject message = $str33$;
    if( NIL == kct_test_collection_p( test_col, UNPROVIDED ) )
    {
      result = $kw32$SEVERE;
      message = Sequences.cconcatenate( message, PrintLow.format( NIL, $str71$___A_is_not_a___KBContentTestSpec, test_col ) );
      return Values.values( result, message );
    }
    final SubLObject cyclists = kct_collection_responsible_cyclists( test_col, UNPROVIDED );
    if( NIL == cyclists )
    {
      result = $kw52$PROBLEM;
      message = Sequences.cconcatenate( message, PrintLow.format( NIL, $str72$___A_has_no_responsible_Cyclists_, test_col ) );
    }
    final SubLObject test_specs = kct_test_collection_instances( test_col, UNPROVIDED );
    if( NIL == test_specs )
    {
      result = $kw52$PROBLEM;
      message = Sequences.cconcatenate( message, PrintLow.format( NIL, $str73$___A_has_no_instances_, test_col ) );
    }
    return Values.values( result, message );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 19810L)
  public static SubLObject printable_execution_mode(final SubLObject execution_mode)
  {
    final SubLObject alist = ConsesLow.list( ConsesLow.cons( ctest_utils.$sampling_execution_mode$.getGlobalValue(), $str74$Sampling ), ConsesLow.cons( ctest_utils.$hypothesize_execution_mode$.getGlobalValue(),
        $str75$Hypothesize ), ConsesLow.cons( ctest_utils.$simple_execution_mode$.getGlobalValue(), $str76$Simple ) );
    return conses_high.assoc( execution_mode, alist, Symbols.symbol_function( EQUAL ), UNPROVIDED ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 20185L)
  public static SubLObject printable_execution_type(final SubLObject execution_type)
  {
    final SubLObject alist = ConsesLow.list( ConsesLow.cons( ctest_utils.$collection_execution_type$.getGlobalValue(), $str77$Test_Set ), ConsesLow.cons( ctest_utils.$individual_execution_type$.getGlobalValue(),
        $str78$Individual_Test ) );
    return conses_high.assoc( execution_type, alist, Symbols.symbol_function( EQUAL ), UNPROVIDED ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 20430L)
  public static SubLObject kct_default_for_parameter(final SubLObject parameter_constant)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( parameter_constant ) : parameter_constant;
    SubLObject result = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( $const79$CycArchitectureMt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject pcase_var;
      final SubLObject value = pcase_var = kb_mapping_utilities.pred_arg_values( $const80$CycKBContentTestFramework, $const81$defaultSoftwareParameterValueInSo, parameter_constant, THREE_INTEGER, ONE_INTEGER,
          TWO_INTEGER, UNPROVIDED, UNPROVIDED ).first();
      if( pcase_var.eql( $const82$True ) )
      {
        result = T;
      }
      else if( pcase_var.eql( $const83$False ) )
      {
        result = NIL;
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 20966L)
  public static SubLObject kct_new_hlmt(final SubLObject monad_mt, final SubLObject temporal_object, final SubLObject time_param)
  {
    return hlmt.new_hlmt( ConsesLow.list( monad_mt, hlmt.new_time_dimension( temporal_object, time_param ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 21166L)
  public static SubLObject kct_transform_query_results_for_comparison(final SubLObject query_results, final SubLObject hypothetical_bindings)
  {
    final SubLObject substituted_results = substitute_hypothetical_terms_for_indexicals( query_results, hypothetical_bindings );
    SubLObject el_results = cycl_utilities.binding_lists_hl_to_el( substituted_results );
    if( NIL != bindings.binding_lists_p( query_results ) )
    {
      el_results = Mapping.mapcar( $sym84$CANONICALIZE_QUERY_BINDINGS_INT, el_results );
    }
    return el_results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 21932L)
  public static SubLObject substitute_hypothetical_terms_for_indexicals(final SubLObject query_results, final SubLObject hypothetical_bindings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == hypothetical_bindings )
    {
      return query_results;
    }
    final SubLObject _prev_bind_0 = $hypothetical_bindings_to_substitute$.currentBinding( thread );
    try
    {
      $hypothetical_bindings_to_substitute$.bind( hypothetical_bindings, thread );
      return transform_list_utilities.transform( query_results, $sym87$HYPOTHETICAL_FOR_VARIABLE_FN_TERM_P, $sym88$HYPOTHETICAL_FOR_VARIABLE, UNPROVIDED );
    }
    finally
    {
      $hypothetical_bindings_to_substitute$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 22279L)
  public static SubLObject hypothetical_for_variable_fn_term_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != el_utilities.possibly_naut_p( v_object ) && NIL != el_utilities.el_formula_with_operator_p( v_object, $const89$HypotheticalForVariableFn ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 22452L)
  public static SubLObject hypothetical_for_variable(final SubLObject hfv_naut)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject variable = cycl_utilities.nat_arg1( hfv_naut, UNPROVIDED );
    final SubLObject thing = list_utilities.alist_lookup( $hypothetical_bindings_to_substitute$.getDynamicValue( thread ), variable, UNPROVIDED, UNPROVIDED );
    if( NIL == thing )
    {
      Errors.warn( $str90$When_determining_test_results__co, variable );
    }
    return thing;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 22773L)
  public static SubLObject canonicalize_query_bindings_int(final SubLObject v_bindings)
  {
    return ncanonicalize_query_bindings_int( conses_high.copy_list( v_bindings ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 22898L)
  public static SubLObject ncanonicalize_query_bindings_int(final SubLObject v_bindings)
  {
    final SubLObject canonical_bindings = Mapping.mapcar( $sym91$NCANONICALIZE_QUERY_BINDING_INT, v_bindings );
    final SubLObject sorted_bindings = Sort.sort( canonical_bindings, $sym92$TERM__, $sym93$VARIABLE_BINDING_VARIABLE );
    return list_utilities.delete_duplicates_sorted( sorted_bindings, Symbols.symbol_function( EQUAL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 23185L)
  public static SubLObject ncanonicalize_query_binding_int(final SubLObject binding)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject variable = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( binding, binding, $list94 );
    variable = binding.first();
    final SubLObject current = value = binding.rest();
    final SubLObject _prev_bind_0 = czer_vars.$reify_skolemsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$canonicalize_functionsP$.currentBinding( thread );
    try
    {
      czer_vars.$reify_skolemsP$.bind( NIL, thread );
      czer_vars.$canonicalize_functionsP$.bind( NIL, thread );
      final SubLObject canonical_value = cycl_utilities.hl_to_el( czer_main.canonicalize_term( value, UNPROVIDED ) );
      result = bindings.make_variable_binding( variable, canonical_value );
    }
    finally
    {
      czer_vars.$canonicalize_functionsP$.rebind( _prev_bind_2, thread );
      czer_vars.$reify_skolemsP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 23653L)
  public static SubLObject kct_transform_set_of_binding_sets(final SubLObject inference_set_of_binding_sets, final SubLObject filter)
  {
    SubLObject new_set_of_binding_sets = NIL;
    SubLObject cdolist_list_var = inference_set_of_binding_sets;
    SubLObject binding_set = NIL;
    binding_set = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject new_binding_set = NIL;
      SubLObject cdolist_list_var_$35 = binding_set;
      SubLObject binding = NIL;
      binding = cdolist_list_var_$35.first();
      while ( NIL != cdolist_list_var_$35)
      {
        new_binding_set = ConsesLow.cons( bindings.make_variable_binding( bindings.variable_binding_variable( binding ), Functions.funcall( filter, bindings.variable_binding_value( binding ) ) ), new_binding_set );
        cdolist_list_var_$35 = cdolist_list_var_$35.rest();
        binding = cdolist_list_var_$35.first();
      }
      new_binding_set = Sequences.nreverse( new_binding_set );
      new_set_of_binding_sets = ConsesLow.cons( new_binding_set, new_set_of_binding_sets );
      cdolist_list_var = cdolist_list_var.rest();
      binding_set = cdolist_list_var.first();
    }
    new_set_of_binding_sets = Sequences.nreverse( new_set_of_binding_sets );
    return new_set_of_binding_sets;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 24278L)
  public static SubLObject kct_formula_if_assertion(final SubLObject v_object)
  {
    if( NIL != assertion_handles.assertion_p( v_object ) )
    {
      return fi.assertion_hl_formula( v_object, UNPROVIDED );
    }
    return v_object;
  }

  public static SubLObject declare_kct_utils_file()
  {
    SubLFiles.declareFunction( me, "initialize_kct", "INITIALIZE-KCT", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_kct_kb_feature", "INITIALIZE-KCT-KB-FEATURE", 0, 0, false );
    SubLFiles.declareFunction( me, "kct_query_specification", "KCT-QUERY-SPECIFICATION", 1, 1, false );
    SubLFiles.declareFunction( me, "query_specification_kcts", "QUERY-SPECIFICATION-KCTS", 1, 1, false );
    SubLFiles.declareFunction( me, "kct_initialize", "KCT-INITIALIZE", 0, 0, false );
    SubLFiles.declareFunction( me, "kct_test_spec_p", "KCT-TEST-SPEC-P", 1, 1, false );
    SubLFiles.declareFunction( me, "kct_test_spec_permissive_p", "KCT-TEST-SPEC-PERMISSIVE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_collection_p", "KCT-TEST-COLLECTION-P", 1, 1, false );
    SubLFiles.declareFunction( me, "kct_asserted_test_collections", "KCT-ASSERTED-TEST-COLLECTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "kct_comments", "KCT-COMMENTS", 1, 1, false );
    SubLFiles.declareFunction( me, "kct_test_collection_instances", "KCT-TEST-COLLECTION-INSTANCES", 1, 1, false );
    SubLFiles.declareFunction( me, "kct_responsible_cyclists", "KCT-RESPONSIBLE-CYCLISTS", 1, 1, false );
    SubLFiles.declareFunction( me, "kct_collection_responsible_cyclists", "KCT-COLLECTION-RESPONSIBLE-CYCLISTS", 1, 1, false );
    SubLFiles.declareFunction( me, "kct_test_metrics", "KCT-TEST-METRICS", 1, 1, false );
    SubLFiles.declareFunction( me, "kct_exact_set_of_binding_sets", "KCT-EXACT-SET-OF-BINDING-SETS", 1, 1, false );
    SubLFiles.declareFunction( me, "kct_exact_binding_sets", "KCT-EXACT-BINDING-SETS", 1, 1, false );
    SubLFiles.declareFunction( me, "kct_wanted_binding_sets", "KCT-WANTED-BINDING-SETS", 1, 1, false );
    SubLFiles.declareFunction( me, "kct_unwanted_binding_sets", "KCT-UNWANTED-BINDING-SETS", 1, 1, false );
    SubLFiles.declareFunction( me, "kct_bindings_unimportantP", "KCT-BINDINGS-UNIMPORTANT?", 1, 1, false );
    SubLFiles.declareFunction( me, "kct_binding_sets_cardinality", "KCT-BINDING-SETS-CARDINALITY", 1, 1, false );
    SubLFiles.declareFunction( me, "kct_binding_sets_min_cardinality", "KCT-BINDING-SETS-MIN-CARDINALITY", 1, 1, false );
    SubLFiles.declareFunction( me, "kct_binding_sets_max_cardinality", "KCT-BINDING-SETS-MAX-CARDINALITY", 1, 1, false );
    SubLFiles.declareFunction( me, "kct_defining_mt", "KCT-DEFINING-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_runnableP", "KCT-TEST-RUNNABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_test_known_unrunnableP", "KCT-TEST-KNOWN-UNRUNNABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "why_not_kct_test_valid", "WHY-NOT-KCT-TEST-VALID", 1, 0, false );
    SubLFiles.declareFunction( me, "categorize_kct_invalidity_reasons", "CATEGORIZE-KCT-INVALIDITY-REASONS", 0, 0, false );
    SubLFiles.declareFunction( me, "why_not_kct_test_collection_valid", "WHY-NOT-KCT-TEST-COLLECTION-VALID", 1, 0, false );
    SubLFiles.declareFunction( me, "printable_execution_mode", "PRINTABLE-EXECUTION-MODE", 1, 0, false );
    SubLFiles.declareFunction( me, "printable_execution_type", "PRINTABLE-EXECUTION-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_default_for_parameter", "KCT-DEFAULT-FOR-PARAMETER", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_new_hlmt", "KCT-NEW-HLMT", 3, 0, false );
    SubLFiles.declareFunction( me, "kct_transform_query_results_for_comparison", "KCT-TRANSFORM-QUERY-RESULTS-FOR-COMPARISON", 2, 0, false );
    SubLFiles.declareFunction( me, "substitute_hypothetical_terms_for_indexicals", "SUBSTITUTE-HYPOTHETICAL-TERMS-FOR-INDEXICALS", 2, 0, false );
    SubLFiles.declareFunction( me, "hypothetical_for_variable_fn_term_p", "HYPOTHETICAL-FOR-VARIABLE-FN-TERM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "hypothetical_for_variable", "HYPOTHETICAL-FOR-VARIABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_query_bindings_int", "CANONICALIZE-QUERY-BINDINGS-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "ncanonicalize_query_bindings_int", "NCANONICALIZE-QUERY-BINDINGS-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "ncanonicalize_query_binding_int", "NCANONICALIZE-QUERY-BINDING-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "kct_transform_set_of_binding_sets", "KCT-TRANSFORM-SET-OF-BINDING-SETS", 2, 0, false );
    SubLFiles.declareFunction( me, "kct_formula_if_assertion", "KCT-FORMULA-IF-ASSERTION", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_kct_utils_file()
  {
    $kct_test_execution_type$ = SubLFiles.defconstant( "*KCT-TEST-EXECUTION-TYPE*", $str0$I );
    $kct_collection_execution_type$ = SubLFiles.defconstant( "*KCT-COLLECTION-EXECUTION-TYPE*", $str1$C );
    $kct_default_error_notify_cyclist$ = SubLFiles.defparameter( "*KCT-DEFAULT-ERROR-NOTIFY-CYCLIST*", NIL );
    $kct_use_sampling_mode$ = SubLFiles.defparameter( "*KCT-USE-SAMPLING-MODE*", NIL );
    $kct_debug$ = SubLFiles.defparameter( "*KCT-DEBUG*", NIL );
    $kct_core_constants$ = SubLFiles.deflexical( "*KCT-CORE-CONSTANTS*", $list2 );
    $hypothetical_bindings_to_substitute$ = SubLFiles.defparameter( "*HYPOTHETICAL-BINDINGS-TO-SUBSTITUTE*", $kw85$UNINITIALIZED );
    return NIL;
  }

  public static SubLObject setup_kct_utils_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kct_utils_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kct_utils_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kct_utils_file();
  }
  static
  {
    me = new kct_utils();
    $kct_test_execution_type$ = null;
    $kct_collection_execution_type$ = null;
    $kct_default_error_notify_cyclist$ = null;
    $kct_use_sampling_mode$ = null;
    $kct_debug$ = null;
    $kct_core_constants$ = null;
    $hypothetical_bindings_to_substitute$ = null;
    $str0$I = makeString( "I" );
    $str1$C = makeString( "C" );
    $list2 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TestVocabularyMt" ) ), constant_handles.reader_make_constant_shell( makeString( "testQuerySpecification" ) ) );
    $sym3$VALID_CONSTANT_ = makeSymbol( "VALID-CONSTANT?" );
    $sym4$FORT_P = makeSymbol( "FORT-P" );
    $const5$testQuerySpecification = constant_handles.reader_make_constant_shell( makeString( "testQuerySpecification" ) );
    $kw6$TRUE = makeKeyword( "TRUE" );
    $sym7$KBQ_QUERY_SPEC_P = makeSymbol( "KBQ-QUERY-SPEC-P" );
    $const8$KBContentTest_FullySpecified = constant_handles.reader_make_constant_shell( makeString( "KBContentTest-FullySpecified" ) );
    $const9$KBContentTest = constant_handles.reader_make_constant_shell( makeString( "KBContentTest" ) );
    $const10$KBContentTestSpecificationType = constant_handles.reader_make_constant_shell( makeString( "KBContentTestSpecificationType" ) );
    $const11$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $sym12$KCT_TEST_COLLECTION_P = makeSymbol( "KCT-TEST-COLLECTION-P" );
    $const13$comment = constant_handles.reader_make_constant_shell( makeString( "comment" ) );
    $sym14$COLLECTION_P = makeSymbol( "COLLECTION-P" );
    $kw15$WHO = makeKeyword( "WHO" );
    $const16$testResponsibleCyclist = constant_handles.reader_make_constant_shell( makeString( "testResponsibleCyclist" ) );
    $list17 = ConsesLow.list( makeKeyword( "WHO" ) );
    $const18$testCollectionCyclistResponsible = constant_handles.reader_make_constant_shell( makeString( "testCollectionCyclistResponsible" ) );
    $const19$testMetricsToGather = constant_handles.reader_make_constant_shell( makeString( "testMetricsToGather" ) );
    $const20$testAnswersCycL_Exact = constant_handles.reader_make_constant_shell( makeString( "testAnswersCycL-Exact" ) );
    $const21$testAnswersCycL_Wanted = constant_handles.reader_make_constant_shell( makeString( "testAnswersCycL-Wanted" ) );
    $const22$testAnswersCycL_NotWanted = constant_handles.reader_make_constant_shell( makeString( "testAnswersCycL-NotWanted" ) );
    $const23$testAnswersCycLUnimportant = constant_handles.reader_make_constant_shell( makeString( "testAnswersCycLUnimportant" ) );
    $const24$testAnswers_Cardinality_Exact = constant_handles.reader_make_constant_shell( makeString( "testAnswers-Cardinality-Exact" ) );
    $const25$testAnswers_Cardinality_Min = constant_handles.reader_make_constant_shell( makeString( "testAnswers-Cardinality-Min" ) );
    $const26$testAnswers_Cardinality_Max = constant_handles.reader_make_constant_shell( makeString( "testAnswers-Cardinality-Max" ) );
    $list27 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "testAnswersCycL-Exact" ) ), constant_handles.reader_make_constant_shell( makeString(
        "testAnswersCycL-Wanted" ) ), constant_handles.reader_make_constant_shell( makeString( "testAnswersCycL-NotWanted" ) ), constant_handles.reader_make_constant_shell( makeString( "testAnswersCycLUnimportant" ) ),
      constant_handles.reader_make_constant_shell( makeString( "testAnswerSupport-Wanted" ) ), constant_handles.reader_make_constant_shell( makeString( "testAnswerSupport-NotWanted" ) ), constant_handles
          .reader_make_constant_shell( makeString( "testAnswerSupportedByHLSupportModule-Wanted" ) ), constant_handles.reader_make_constant_shell( makeString( "testAnswerSupportedByHLSupportModule-NotWanted" ) ),
      constant_handles.reader_make_constant_shell( makeString( "testResponsibleCyclist" ) ), constant_handles.reader_make_constant_shell( makeString( "testQuerySpecification" ) )
    } );
    $sym28$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const29$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw30$GAF = makeKeyword( "GAF" );
    $const31$TestVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "TestVocabularyMt" ) );
    $kw32$SEVERE = makeKeyword( "SEVERE" );
    $str33$ = makeString( "" );
    $str34$___A_is_not_a___KBContentTest_Ful = makeString( "~%~A is not a #$KBContentTest-FullySpecified." );
    $kw35$NOT_A_TEST_SPECIFICATION = makeKeyword( "NOT-A-TEST-SPECIFICATION" );
    $str36$___A_does_not_have_a_valid_arg2_f = makeString( "~%~A does not have a valid arg2 for #$testQuerySpecification." );
    $kw37$NO_VALID_QUERY = makeKeyword( "NO-VALID-QUERY" );
    $str38$_has_no___testAnswer_MultipleChoi = makeString( " has no #$testAnswer-MultipleChoice." );
    $kw39$NO_TEST_EXPECTATION = makeKeyword( "NO-TEST-EXPECTATION" );
    $const40$testAnswerSupport_Wanted = constant_handles.reader_make_constant_shell( makeString( "testAnswerSupport-Wanted" ) );
    $const41$testAnswerSupport_NotWanted = constant_handles.reader_make_constant_shell( makeString( "testAnswerSupport-NotWanted" ) );
    $const42$testAnswerSupportedByHLSupportMod = constant_handles.reader_make_constant_shell( makeString( "testAnswerSupportedByHLSupportModule-Wanted" ) );
    $const43$testAnswerSupportedByHLSupportMod = constant_handles.reader_make_constant_shell( makeString( "testAnswerSupportedByHLSupportModule-NotWanted" ) );
    $str44$___A_has_no_stated_test_expectati = makeString( "~%~A has no stated test expectation." );
    $str45$___A_s_exact_answer_should_includ = makeString( "~%~A's exact answer should include only #$ELInferenceBindingSets, but these are not: " );
    $kw46$EXACT_ANSWER_CONTAINS_MALFORMED_INFERENCE_BINDING_SET = makeKeyword( "EXACT-ANSWER-CONTAINS-MALFORMED-INFERENCE-BINDING-SET" );
    $str47$_A_ = makeString( "~A " );
    $str48$___A_s_wanted_answer_should_be_an = makeString( "~%~A's wanted answer should be an #$ELInferenceBindingSet but isn't: " );
    $kw49$WANTED_ANSWER_IS_NOT_AN_INFERENCE_BINDING_SET = makeKeyword( "WANTED-ANSWER-IS-NOT-AN-INFERENCE-BINDING-SET" );
    $str50$___A_s_unwanted_answer_should_be_ = makeString( "~%~A's unwanted answer should be an #$ELInferenceBindingSet but isn't: " );
    $kw51$UNWANTED_ANSWER_IS_NOT_AN_INFERENCE_BINDING_SET = makeKeyword( "UNWANTED-ANSWER-IS-NOT-AN-INFERENCE-BINDING-SET" );
    $kw52$PROBLEM = makeKeyword( "PROBLEM" );
    $str53$___A_does_not_have_a_responsible_ = makeString( "~%~A does not have a responsible Cyclist." );
    $kw54$NO_RESPONSIBLE_CYCLIST = makeKeyword( "NO-RESPONSIBLE-CYCLIST" );
    $kw55$BREADTH = makeKeyword( "BREADTH" );
    $kw56$QUEUE = makeKeyword( "QUEUE" );
    $kw57$STACK = makeKeyword( "STACK" );
    $sym58$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw59$ERROR = makeKeyword( "ERROR" );
    $str60$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym61$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw62$CERROR = makeKeyword( "CERROR" );
    $str63$continue_anyway = makeString( "continue anyway" );
    $kw64$WARN = makeKeyword( "WARN" );
    $str65$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const66$AreteQuery = constant_handles.reader_make_constant_shell( makeString( "AreteQuery" ) );
    $str67$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str68$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $list69 = ConsesLow.list( makeUninternedSymbol( "LINK-NODE" ), makeUninternedSymbol( "MT" ), makeUninternedSymbol( "TV" ) );
    $str70$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $str71$___A_is_not_a___KBContentTestSpec = makeString( "~%~A is not a #$KBContentTestSpecificationType!" );
    $str72$___A_has_no_responsible_Cyclists_ = makeString( "~%~A has no responsible Cyclists." );
    $str73$___A_has_no_instances_ = makeString( "~%~A has no instances." );
    $str74$Sampling = makeString( "Sampling" );
    $str75$Hypothesize = makeString( "Hypothesize" );
    $str76$Simple = makeString( "Simple" );
    $str77$Test_Set = makeString( "Test Set" );
    $str78$Individual_Test = makeString( "Individual Test" );
    $const79$CycArchitectureMt = constant_handles.reader_make_constant_shell( makeString( "CycArchitectureMt" ) );
    $const80$CycKBContentTestFramework = constant_handles.reader_make_constant_shell( makeString( "CycKBContentTestFramework" ) );
    $const81$defaultSoftwareParameterValueInSo = constant_handles.reader_make_constant_shell( makeString( "defaultSoftwareParameterValueInSoftwareObject" ) );
    $const82$True = constant_handles.reader_make_constant_shell( makeString( "True" ) );
    $const83$False = constant_handles.reader_make_constant_shell( makeString( "False" ) );
    $sym84$CANONICALIZE_QUERY_BINDINGS_INT = makeSymbol( "CANONICALIZE-QUERY-BINDINGS-INT" );
    $kw85$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $sym86$_EXIT = makeSymbol( "%EXIT" );
    $sym87$HYPOTHETICAL_FOR_VARIABLE_FN_TERM_P = makeSymbol( "HYPOTHETICAL-FOR-VARIABLE-FN-TERM-P" );
    $sym88$HYPOTHETICAL_FOR_VARIABLE = makeSymbol( "HYPOTHETICAL-FOR-VARIABLE" );
    $const89$HypotheticalForVariableFn = constant_handles.reader_make_constant_shell( makeString( "HypotheticalForVariableFn" ) );
    $str90$When_determining_test_results__co = makeString( "When determining test results, could not find a hypothetical binding for the variable ~a" );
    $sym91$NCANONICALIZE_QUERY_BINDING_INT = makeSymbol( "NCANONICALIZE-QUERY-BINDING-INT" );
    $sym92$TERM__ = makeSymbol( "TERM-<" );
    $sym93$VARIABLE_BINDING_VARIABLE = makeSymbol( "VARIABLE-BINDING-VARIABLE" );
    $list94 = ConsesLow.cons( makeSymbol( "VARIABLE" ), makeSymbol( "VALUE" ) );
  }
}
/*
 * 
 * Total time: 1283 ms
 * 
 */