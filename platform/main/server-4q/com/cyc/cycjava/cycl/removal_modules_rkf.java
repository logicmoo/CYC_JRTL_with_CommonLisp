package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_rkf
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.removal_modules_rkf";
  public static final String myFingerPrint = "90296c19f21fe16b0c421973137fb04657dbf8d7c931a9f77f2ddff8da016ed8";
  private static final SubLObject $const0$keAssertedTermSentences;
  private static final SubLSymbol $sym1$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const2$EverythingPSC;
  private static final SubLSymbol $kw3$OPAQUE;
  private static final SubLSymbol $kw4$REMOVAL_KE_ASSERTED_TERM_FORMULAS_INDEX_VARIABLE;
  private static final SubLList $list5;
  private static final SubLObject $const6$keComparisonSentences;
  private static final SubLSymbol $kw7$REMOVAL_KE_COMPARISON_SENTENCES_BOUND_TERMS_UNBOUND_SENTENCE;
  private static final SubLList $list8;
  private static final SubLObject $const9$keContrastingSentences;
  private static final SubLSymbol $kw10$REMOVAL_KE_CONTRASTING_SENTENCES_BOUND_TERMS_UNBOUND_SENTENCE;
  private static final SubLList $list11;
  private static final SubLObject $const12$predicateArgIsaSummary;
  private static final SubLSymbol $kw13$REMOVAL_PREDICATE_ARG_ISA_SUMMARY_UNIFY;
  private static final SubLList $list14;

  @SubLTranslatedFile.SubL(source = "cycl/removal-modules-rkf.lisp", position = 1096L)
  public static SubLObject removal_ke_asserted_term_formulas_term_index_cost(final SubLObject v_term)
  {
    return kb_indexing.num_index( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/removal-modules-rkf.lisp", position = 2367L)
  public static SubLObject removal_ke_asserted_term_formulas_index_variable_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject v_term = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    return removal_ke_asserted_term_formulas_term_index_cost( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/removal-modules-rkf.lisp", position = 2826L)
  public static SubLObject removal_ke_asserted_term_formulas_index_variable_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_term = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject sentences = cdolist_list_var = rkf_concept_summarizer.rkf_asserted_sentences( v_term, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
    SubLObject sentence = NIL;
    sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject v_bindings = ConsesLow.list( ConsesLow.cons( arg2, sentence ) );
      if( NIL != v_bindings )
      {
        SubLObject assertion = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
          assertion = czer_meta.find_assertion_cycl( sentence, UNPROVIDED );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
        final SubLObject support = ( NIL != assertion ) ? assertion : arguments.make_hl_support( $kw3$OPAQUE, sentence, UNPROVIDED, UNPROVIDED );
        backward.removal_add_node( support, v_bindings, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sentence = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/removal-modules-rkf.lisp", position = 4301L)
  public static SubLObject removal_ke_comparison_sentences_bound_terms_unbound_sentence_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject term1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
    final SubLObject term2 = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
    return Numbers.min( kb_indexing.num_index( term1 ), kb_indexing.num_index( term2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/removal-modules-rkf.lisp", position = 4639L)
  public static SubLObject removal_ke_comparison_sentences_bound_terms_unbound_sentence_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject term2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject variable = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject sentences = cdolist_list_var = rkf_tools.rkf_compare_terms( term1, term2, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
    SubLObject sentence = NIL;
    sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject v_bindings = ConsesLow.list( ConsesLow.cons( variable, sentence ) );
      if( NIL != v_bindings )
      {
        SubLObject assertion = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
          assertion = czer_meta.find_assertion_cycl( sentence, UNPROVIDED );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
        final SubLObject support = ( NIL != assertion ) ? assertion : arguments.make_hl_support( $kw3$OPAQUE, sentence, UNPROVIDED, UNPROVIDED );
        backward.removal_add_node( support, v_bindings, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sentence = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/removal-modules-rkf.lisp", position = 6341L)
  public static SubLObject removal_ke_contrasting_sentences_bound_terms_unbound_sentence_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject term1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
    final SubLObject term2 = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
    return Numbers.min( kb_indexing.num_index( term1 ), kb_indexing.num_index( term2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/removal-modules-rkf.lisp", position = 6680L)
  public static SubLObject removal_ke_contrasting_sentences_bound_terms_unbound_sentence_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject term1 = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject term2 = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
    final SubLObject variable = cycl_utilities.atomic_sentence_arg3( asent, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject common_sentences = rkf_tools.rkf_compare_terms( term1, term2, mt_relevance_macros.$mt$.getDynamicValue( thread ) );
    final SubLObject term1_unique_sentences = thread.secondMultipleValue();
    final SubLObject term2_unique_sentences = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    SubLObject cdolist_list_var = term1_unique_sentences;
    SubLObject sentence = NIL;
    sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject v_bindings = ConsesLow.list( ConsesLow.cons( variable, sentence ) );
      if( NIL != v_bindings )
      {
        SubLObject assertion = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym1$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const2$EverythingPSC, thread );
          assertion = czer_meta.find_assertion_cycl( sentence, UNPROVIDED );
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
        final SubLObject support = ( NIL != assertion ) ? assertion : arguments.make_hl_support( $kw3$OPAQUE, sentence, UNPROVIDED, UNPROVIDED );
        backward.removal_add_node( support, v_bindings, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sentence = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/removal-modules-rkf.lisp", position = 9244L)
  public static SubLObject removal_predicate_arg_isa_summary_unify_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject predicate = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject summary = rkf_concept_communicator.rkf_arg_type_summary_cycl_for_pred( predicate, mt_relevance_macros.$mt$.getDynamicValue( thread ), UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject v_bindings = unification_utilities.term_unify( asent, summary, T, T );
    final SubLObject unify_justification = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != v_bindings )
    {
      return backward.removal_add_node( arguments.make_hl_support( $kw3$OPAQUE, summary, UNPROVIDED, UNPROVIDED ), v_bindings, unify_justification );
    }
    return NIL;
  }

  public static SubLObject declare_removal_modules_rkf_file()
  {
    SubLFiles.declareFunction( me, "removal_ke_asserted_term_formulas_term_index_cost", "REMOVAL-KE-ASSERTED-TERM-FORMULAS-TERM-INDEX-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_ke_asserted_term_formulas_index_variable_cost", "REMOVAL-KE-ASSERTED-TERM-FORMULAS-INDEX-VARIABLE-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_ke_asserted_term_formulas_index_variable_expand", "REMOVAL-KE-ASSERTED-TERM-FORMULAS-INDEX-VARIABLE-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_ke_comparison_sentences_bound_terms_unbound_sentence_cost", "REMOVAL-KE-COMPARISON-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_ke_comparison_sentences_bound_terms_unbound_sentence_expand", "REMOVAL-KE-COMPARISON-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_ke_contrasting_sentences_bound_terms_unbound_sentence_cost", "REMOVAL-KE-CONTRASTING-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_ke_contrasting_sentences_bound_terms_unbound_sentence_expand", "REMOVAL-KE-CONTRASTING-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_predicate_arg_isa_summary_unify_expand", "REMOVAL-PREDICATE-ARG-ISA-SUMMARY-UNIFY-EXPAND", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_rkf_file()
  {
    return NIL;
  }

  public static SubLObject setup_removal_modules_rkf_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$keAssertedTermSentences );
    inference_modules.inference_removal_module( $kw4$REMOVAL_KE_ASSERTED_TERM_FORMULAS_INDEX_VARIABLE, $list5 );
    inference_modules.register_solely_specific_removal_module_predicate( $const6$keComparisonSentences );
    inference_modules.inference_removal_module( $kw7$REMOVAL_KE_COMPARISON_SENTENCES_BOUND_TERMS_UNBOUND_SENTENCE, $list8 );
    inference_modules.register_solely_specific_removal_module_predicate( $const9$keContrastingSentences );
    inference_modules.inference_removal_module( $kw10$REMOVAL_KE_CONTRASTING_SENTENCES_BOUND_TERMS_UNBOUND_SENTENCE, $list11 );
    inference_modules.register_solely_specific_removal_module_predicate( $const12$predicateArgIsaSummary );
    inference_modules.inference_removal_module( $kw13$REMOVAL_PREDICATE_ARG_ISA_SUMMARY_UNIFY, $list14 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_rkf_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_rkf_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_rkf_file();
  }
  static
  {
    me = new removal_modules_rkf();
    $const0$keAssertedTermSentences = constant_handles.reader_make_constant_shell( makeString( "keAssertedTermSentences" ) );
    $sym1$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const2$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw3$OPAQUE = makeKeyword( "OPAQUE" );
    $kw4$REMOVAL_KE_ASSERTED_TERM_FORMULAS_INDEX_VARIABLE = makeKeyword( "REMOVAL-KE-ASSERTED-TERM-FORMULAS-INDEX-VARIABLE" );
    $list5 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "keAssertedTermSentences" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "keAssertedTermSentences" ) ), makeKeyword( "FORT" ), makeKeyword( "VARIABLE" ) ), makeKeyword( "COST" ),
      makeSymbol( "REMOVAL-KE-ASSERTED-TERM-FORMULAS-INDEX-VARIABLE-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
          "REMOVAL-KE-ASSERTED-TERM-FORMULAS-INDEX-VARIABLE-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
              "(#$keAssertedTermSentences <fort> <variable>)\nusing only the KB indexing, explicit assertions involving <fort>,\nand keIrrelevantTerm reasoning." ), makeKeyword( "EXAMPLE" ), makeString(
                  "(#$keAssertedTermSentences #$Dog ?FORMULA))" )
    } );
    $const6$keComparisonSentences = constant_handles.reader_make_constant_shell( makeString( "keComparisonSentences" ) );
    $kw7$REMOVAL_KE_COMPARISON_SENTENCES_BOUND_TERMS_UNBOUND_SENTENCE = makeKeyword( "REMOVAL-KE-COMPARISON-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE" );
    $list8 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "keComparisonSentences" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "keComparisonSentences" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list(
            makeKeyword( "TEST" ), makeSymbol( "FORT-OR-NAUT-P" ) ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "FORT-OR-NAUT-P" ) ) ),
            makeKeyword( "VARIABLE" ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-KE-COMPARISON-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
                "EXPAND" ), makeSymbol( "REMOVAL-KE-COMPARISON-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                    "(#$keComparisonSentences <fully-bound1> <fully-bound2> <variable>)\ncalls rkf-compare-terms and returns the CycL sentences they have in common,\nin terms of <fully-bound1>." ), makeKeyword(
                        "EXAMPLE" ), makeString( "(#$keComparisonSentences #$Beer #$Wine ?FORMULA))" )
    } );
    $const9$keContrastingSentences = constant_handles.reader_make_constant_shell( makeString( "keContrastingSentences" ) );
    $kw10$REMOVAL_KE_CONTRASTING_SENTENCES_BOUND_TERMS_UNBOUND_SENTENCE = makeKeyword( "REMOVAL-KE-CONTRASTING-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE" );
    $list11 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "keContrastingSentences" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "keContrastingSentences" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ),
          ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "FORT-OR-NAUT-P" ) ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
              "FORT-OR-NAUT-P" ) ) ), makeKeyword( "VARIABLE" ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-KE-CONTRASTING-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
                  "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-KE-CONTRASTING-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                      "(#$keContrastingSentences <fully-bound1> <fully-bound2> <variable>)\ncalls rkf-compare-terms and returns the CycL sentences true of <fully-bound1>\nbut not <fully-bound2>." ), makeKeyword(
                          "EXAMPLE" ), makeString( "(#$keContrastingSentences #$Beer #$Wine ?FORMULA))" )
    } );
    $const12$predicateArgIsaSummary = constant_handles.reader_make_constant_shell( makeString( "predicateArgIsaSummary" ) );
    $kw13$REMOVAL_PREDICATE_ARG_ISA_SUMMARY_UNIFY = makeKeyword( "REMOVAL-PREDICATE-ARG-ISA-SUMMARY-UNIFY" );
    $list14 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "predicateArgIsaSummary" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.listS( constant_handles.reader_make_constant_shell( makeString( "predicateArgIsaSummary" ) ), makeKeyword( "FULLY-BOUND" ),
          makeKeyword( "NOT-FULLY-BOUND" ) ), ConsesLow.listS( makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "ISA" ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ) ), makeKeyword(
              "ANYTHING" ) ) ), makeKeyword( "COST-EXPRESSION" ), ONE_INTEGER, makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
                  "REMOVAL-PREDICATE-ARG-ISA-SUMMARY-UNIFY-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$predicateArgIsaSummary <fully-bound> . <not-fully-bound>) where ARG1 is a predicate." ), makeKeyword(
                      "EXAMPLE" ), makeString( "(#$predicateArgIsaSummary #$behaviorCapable . ?X)\n    (#$predicateArgIsaSummary #$behaviorCapable ?X . ?Y)\n    (#$predicateArgIsaSummary #$behaviorCapable ?X ?Y ?Z)" )
    } );
  }
}
/*
 * 
 * Total time: 145 ms
 * 
 */