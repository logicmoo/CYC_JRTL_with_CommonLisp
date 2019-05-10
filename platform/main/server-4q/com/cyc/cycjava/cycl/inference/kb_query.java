package com.cyc.cycjava.cycl.inference;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.subl_identifier;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.encapsulation;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.bookkeeping_store;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.canon_tl;
import com.cyc.cycjava.cycl.parameter_specification_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.browser.cb_kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_proof_spec;
import com.cyc.cycjava.cycl.hlmt_czer;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.inference.harness.inference_trivial;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.cb_kct_test;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_query
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.kb_query";
  public static final String myFingerPrint = "1f2f8f77798bb4a84ea2d7b9d9df50e6931844b3a61744863fc12118b651d402";
  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 2319L)
  private static SubLSymbol $transcript_kbq_definition_assertionsP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 24951L)
  public static SubLSymbol $use_kbq_practice_rulesP$;
  private static final SubLObject $const0$CycLQuerySpecification;
  private static final SubLSymbol $sym1$CYCL_SENTENCE_P;
  private static final SubLSymbol $sym2$POSSIBLY_MT_P;
  private static final SubLSymbol $sym3$QUERY_PROPERTIES_P;
  private static final SubLObject $const4$isa;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$UPDATE_KBQ_DEFINITION;
  private static final SubLObject $const8$TestVocabularyMt;
  private static final SubLSymbol $sym9$UPDATE_KBQ_DEFINITION_SILENT;
  private static final SubLSymbol $sym10$_EXIT;
  private static final SubLSymbol $sym11$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const12$EverythingPSC;
  private static final SubLObject $const13$InferenceSentenceParameter;
  private static final SubLObject $const14$sentenceParameterValueInSpecifica;
  private static final SubLSymbol $kw15$GAF;
  private static final SubLSymbol $kw16$TRUE;
  private static final SubLObject $const17$InferenceMicrotheoryParameter;
  private static final SubLObject $const18$microtheoryParameterValueInSpecif;
  private static final SubLObject $const19$InferenceModeParameter;
  private static final SubLObject $const20$inferenceModeParameterValueInSpec;
  private static final SubLObject $const21$softwareParameterValueInSpecifica;
  private static final SubLObject $const22$ist_Asserted;
  private static final SubLObject $const23$BaseKB;
  private static final SubLObject $const24$Quote;
  private static final SubLObject $const25$EscapeQuote;
  private static final SubLString $str26$Inference_Parameter__S_unknown_by;
  private static final SubLObject $const27$InferenceAllowedRulesParameter;
  private static final SubLObject $const28$queryPracticeRules;
  private static final SubLSymbol $kw29$NON_EXPLANATORY_SENTENCE;
  private static final SubLList $list30;
  private static final SubLSymbol $sym31$INTEGERP;
  private static final SubLSymbol $sym32$STRINGP;
  private static final SubLSymbol $sym33$KB_SET_OF_BINDING_SETS_P;
  private static final SubLObject $const34$MCQuestionNthOptionFn;
  private static final SubLObject $const35$multipleChoiceOptionFullLabel;
  private static final SubLObject $const36$multipleChoiceOptionIndexLabel;
  private static final SubLObject $const37$multipleChoiceOptionPayload;
  private static final SubLObject $const38$comment;
  private static final SubLList $list39;
  private static final SubLString $str40$The_template___A__passed_for_the_;
  private static final SubLObject $const41$TemplateFromTestQueryFn;
  private static final SubLList $list42;
  private static final SubLObject $const43$formulaTemplateGloss;
  private static final SubLObject $const44$folderContainsResource;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$QUOTED_SENTENCE;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$EL_SUBSTITUTIONS;
  private static final SubLSymbol $sym49$QUESTION_TEMPLATE;
  private static final SubLString $str50$The_query_specification___A__has_;
  private static final SubLString $str51$The_query_specification___A__has_;
  private static final SubLObject $const52$cycLPattern;
  private static final SubLObject $const53$metaTemplate;
  private static final SubLList $list54;
  private static final SubLObject $const55$QuestionSuggestionTemplate_Single;
  private static final SubLObject $const56$questionTemplateInstantiations;
  private static final SubLObject $const57$InferenceNonExplanatorySentencePa;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$MT;
  private static final SubLObject $const60$InferencePSC;
  private static final SubLString $str61$The_query_specification___A__has_;
  private static final SubLObject $const62$querySpecificationForFormulaTempl;
  private static final SubLSymbol $sym63$KBQ_QUERY_PROPERTIES;
  private static final SubLSymbol $kw64$ALLOWED_RULES;
  private static final SubLSymbol $sym65$QUERY_PROPERTY_P;
  private static final SubLObject $const66$MultipleChoiceKBContentTest;
  private static final SubLObject $const67$MultipleChoiceQuerySpecification;
  private static final SubLSymbol $sym68$KBQ_QUERY_SPEC_P;
  private static final SubLObject $const69$mcQuestionNthOption;
  private static final SubLSymbol $sym70$SAFE__;
  private static final SubLSymbol $sym71$FIRST;
  private static final SubLList $list72;
  private static final SubLSymbol $kw73$MAX_TIME;
  private static final SubLSymbol $kw74$FORWARD_MAX_TIME;
  private static final SubLSymbol $kw75$IGNORE;
  private static final SubLObject $const76$TheEmptySet;
  private static final SubLSymbol $kw77$RESULT_UNIQUENESS;
  private static final SubLSymbol $kw78$MAX_NUMBER;
  private static final SubLSymbol $kw79$MAX_PROOF_DEPTH;
  private static final SubLSymbol $kw80$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $kw81$METRICS;
  private static final SubLSymbol $sym82$FORT_P;
  private static final SubLObject $const83$TestQueryFn;
  private static final SubLSymbol $kw84$SEVERE;
  private static final SubLObject $const85$UnrunnableQuery;
  private static final SubLObject $const86$QueryFn;
  private static final SubLList $list87;
  private static final SubLString $str88$___A_has_no_query_sentence_;
  private static final SubLSymbol $kw89$NO_QUERY_SENTENCE;
  private static final SubLString $str90$___A_has_too_many_arguments_;
  private static final SubLSymbol $kw91$TOO_MANY_ARGUMENTS;
  private static final SubLString $str92$;
  private static final SubLSymbol $sym93$IST_SENTENCE_WITH_CHLMT_P;
  private static final SubLString $str94$___A_has_more_than_one_query_sent;
  private static final SubLSymbol $kw95$MORE_THAN_ONE_QUERY_SENTENCE;
  private static final SubLString $str96$___A_has_no_query_Mt_;
  private static final SubLSymbol $kw97$NO_QUERY_MT;
  private static final SubLString $str98$___A_has_more_than_one_query_Mt_;
  private static final SubLSymbol $kw99$MORE_THAN_ONE_QUERY_MT;
  private static final SubLSymbol $kw100$TRANSFORMATION_ALLOWED_;
  private static final SubLSymbol $kw101$BINDINGS;
  private static final SubLSymbol $kw102$CONDITIONAL_SENTENCE_;
  private static final SubLSymbol $sym103$PROPERTY_LIST_P;
  private static final SubLSymbol $sym104$REMOVAL_ASK_QUERY_PROPERTY_P;
  private static final SubLList $list105;
  private static final SubLSymbol $sym106$REMOVAL_ASK_QUERY_METRIC_P;
  private static final SubLSymbol $kw107$ANSWER_COUNT;
  private static final SubLSymbol $kw108$TIME_TO_FIRST_ANSWER;
  private static final SubLSymbol $kw109$TIME_TO_LAST_ANSWER;
  private static final SubLSymbol $kw110$TOTAL_TIME;
  private static final SubLSymbol $kw111$COMPLETE_TOTAL_TIME;
  private static final SubLSymbol $kw112$TIME_PER_ANSWER;
  private static final SubLSymbol $kw113$LATENCY_IMPROVEMENT_FROM_ITERATIVITY;
  private static final SubLString $str114$time_to_implement_metric__S;
  private static final SubLSymbol $kw115$CACHE_INFERENCE_RESULTS_;
  private static final SubLList $list116;
  private static final SubLList $list117;
  private static final SubLList $list118;
  private static final SubLSymbol $sym119$EL_LIST_ITEMS;
  private static final SubLList $list120;
  private static final SubLSymbol $sym121$KEYWORDP;
  private static final SubLObject $const122$InferenceParameter;
  private static final SubLObject $const123$CycHLSupportModule;
  private static final SubLSymbol $sym124$CONSTANT_P;
  private static final SubLObject $const125$CycHLTruthValue;
  private static final SubLObject $const126$SecondsDuration;
  private static final SubLString $str127$Unit__A_can_t_be_converted_to_sec;
  private static final SubLSymbol $sym128$KBQ_PARSE_KB_INFERENCE_PARAMETER_VALUE;
  private static final SubLSymbol $kw129$TEST;
  private static final SubLSymbol $kw130$OWNER;
  private static final SubLSymbol $kw131$CLASSES;
  private static final SubLSymbol $kw132$KB;
  private static final SubLSymbol $kw133$FULL;
  private static final SubLSymbol $kw134$WORKING_;
  private static final SubLList $list135;

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 850L)
  public static SubLObject kbq_query_spec_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != isa.isa_in_any_mtP( v_object, $const0$CycLQuerySpecification ) || NIL != janus.janus_operation_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 1011L)
  public static SubLObject kbq_assert_query_spec_definition(final SubLObject query_spec, final SubLObject sentence, final SubLObject mt, final SubLObject v_inference_parameters, final SubLObject defining_mt,
      final SubLObject non_explanatory_sentence, final SubLObject multiple_choice_option_specs)
  {
    assert NIL != cycl_grammar.cycl_sentence_p( sentence ) : sentence;
    if( NIL != non_explanatory_sentence && !assertionsDisabledInClass && NIL == cycl_grammar.cycl_sentence_p( non_explanatory_sentence ) )
    {
      throw new AssertionError( non_explanatory_sentence );
    }
    assert NIL != hlmt.possibly_mt_p( mt ) : mt;
    assert NIL != inference_datastructures_enumerated_types.query_properties_p( v_inference_parameters ) : v_inference_parameters;
    assert NIL != hlmt.possibly_mt_p( defining_mt ) : defining_mt;
    if( NIL != cb_kct_test.multiple_choice_option_specs_non_trivialP( multiple_choice_option_specs ) )
    {
      ke.ke_assert_now( ConsesLow.listS( $const4$isa, query_spec, $list5 ), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    }
    else
    {
      ke.ke_assert_now( ConsesLow.listS( $const4$isa, query_spec, $list6 ), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
    }
    kbq_assert_query_spec_sentence( query_spec, sentence, defining_mt );
    if( NIL != non_explanatory_sentence )
    {
      kbq_assert_query_spec_pragmatics( query_spec, non_explanatory_sentence, defining_mt );
    }
    kbq_assert_query_spec_mt( query_spec, mt, defining_mt );
    SubLObject remainder;
    SubLObject inference_parameter;
    SubLObject value;
    for( remainder = NIL, remainder = inference_parameters.remove_inference_engine_query_property_defaults( v_inference_parameters ); NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      inference_parameter = remainder.first();
      value = conses_high.cadr( remainder );
      kbq_assert_query_spec_inference_parameter_value( query_spec, inference_parameter, value, defining_mt );
    }
    SubLObject cdolist_list_var = multiple_choice_option_specs;
    SubLObject mc_option_spec = NIL;
    mc_option_spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      kbq_assert_multiple_choice_option_spec( query_spec, mc_option_spec, defining_mt );
      cdolist_list_var = cdolist_list_var.rest();
      mc_option_spec = cdolist_list_var.first();
    }
    return query_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 2385L)
  public static SubLObject kbq_assert(final SubLObject sentence, final SubLObject mt, SubLObject transcriptP)
  {
    if( transcriptP == UNPROVIDED )
    {
      transcriptP = $transcript_kbq_definition_assertionsP$.getDynamicValue();
    }
    return ( NIL != transcriptP ) ? ke.ke_assert_now( sentence, mt, UNPROVIDED, UNPROVIDED ) : cyc_kernel.cyc_assert( sentence, mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 2581L)
  public static SubLObject update_kbq_definition(final SubLObject query_spec, final SubLObject sentence, final SubLObject mt, SubLObject v_inference_parameters, SubLObject defining_mt,
      SubLObject non_explanatory_sentence, SubLObject multiple_choice_option_specs)
  {
    if( v_inference_parameters == UNPROVIDED )
    {
      v_inference_parameters = NIL;
    }
    if( defining_mt == UNPROVIDED )
    {
      defining_mt = $const8$TestVocabularyMt;
    }
    if( non_explanatory_sentence == UNPROVIDED )
    {
      non_explanatory_sentence = NIL;
    }
    if( multiple_choice_option_specs == UNPROVIDED )
    {
      multiple_choice_option_specs = NIL;
    }
    return kbq_ensure_query_spec_definition( query_spec, sentence, mt, v_inference_parameters, defining_mt, non_explanatory_sentence, multiple_choice_option_specs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 3069L)
  public static SubLObject update_kbq_definition_silent(final SubLObject query_spec, final SubLObject sentence, final SubLObject mt, SubLObject v_inference_parameters, SubLObject defining_mt,
      SubLObject non_explanatory_sentence, SubLObject multiple_choice_option_specs)
  {
    if( v_inference_parameters == UNPROVIDED )
    {
      v_inference_parameters = NIL;
    }
    if( defining_mt == UNPROVIDED )
    {
      defining_mt = $const8$TestVocabularyMt;
    }
    if( non_explanatory_sentence == UNPROVIDED )
    {
      non_explanatory_sentence = NIL;
    }
    if( multiple_choice_option_specs == UNPROVIDED )
    {
      multiple_choice_option_specs = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $transcript_kbq_definition_assertionsP$.currentBinding( thread );
    try
    {
      $transcript_kbq_definition_assertionsP$.bind( NIL, thread );
      return kbq_ensure_query_spec_definition( query_spec, sentence, mt, v_inference_parameters, defining_mt, non_explanatory_sentence, multiple_choice_option_specs );
    }
    finally
    {
      $transcript_kbq_definition_assertionsP$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 3665L)
  public static SubLObject kbq_ensure_query_spec_definition(final SubLObject query_spec, final SubLObject sentence, final SubLObject mt, final SubLObject v_inference_parameters, final SubLObject defining_mt,
      final SubLObject non_explanatory_sentence, final SubLObject multiple_choice_option_specs)
  {
    assert NIL != cycl_grammar.cycl_sentence_p( sentence ) : sentence;
    if( NIL != non_explanatory_sentence && !assertionsDisabledInClass && NIL == cycl_grammar.cycl_sentence_p( non_explanatory_sentence ) )
    {
      throw new AssertionError( non_explanatory_sentence );
    }
    assert NIL != hlmt.possibly_mt_p( mt ) : mt;
    assert NIL != inference_datastructures_enumerated_types.query_properties_p( v_inference_parameters ) : v_inference_parameters;
    assert NIL != hlmt.possibly_mt_p( defining_mt ) : defining_mt;
    if( NIL != cb_kct_test.multiple_choice_option_specs_non_trivialP( multiple_choice_option_specs ) )
    {
      kbq_assert( ConsesLow.listS( $const4$isa, query_spec, $list5 ), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED );
    }
    else
    {
      kbq_assert( ConsesLow.listS( $const4$isa, query_spec, $list6 ), mt_vars.$anect_mt$.getGlobalValue(), UNPROVIDED );
    }
    kbq_ensure_query_spec_sentence( query_spec, sentence, defining_mt );
    kbq_ensure_query_spec_pragmatics( query_spec, non_explanatory_sentence, defining_mt );
    kbq_ensure_query_spec_mt( query_spec, mt, defining_mt );
    SubLObject remainder;
    SubLObject inference_parameter;
    SubLObject value;
    for( remainder = NIL, remainder = v_inference_parameters; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      inference_parameter = remainder.first();
      value = conses_high.cadr( remainder );
      kbq_ensure_query_spec_inference_parameter_value( query_spec, inference_parameter, value, defining_mt );
    }
    SubLObject cdolist_list_var = multiple_choice_option_specs;
    SubLObject mc_option_spec = NIL;
    mc_option_spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      kbq_ensure_multiple_choice_option_spec( query_spec, mc_option_spec, defining_mt );
      cdolist_list_var = cdolist_list_var.rest();
      mc_option_spec = cdolist_list_var.first();
    }
    return query_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 4892L)
  public static SubLObject kbq_current_query_spec_assertions_for_parameter(final SubLObject query_spec, final SubLObject parameter)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject assertions = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym11$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const12$EverythingPSC, thread );
      if( $const13$InferenceSentenceParameter.eql( parameter ) )
      {
        final SubLObject pred_var = $const14$sentenceParameterValueInSpecifica;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( query_spec, TWO_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( query_spec, TWO_INTEGER, pred_var );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw15$GAF, $kw16$TRUE, NIL );
                SubLObject done_var_$1 = NIL;
                final SubLObject token_var_$2 = NIL;
                while ( NIL == done_var_$1)
                {
                  final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$2 );
                  final SubLObject valid_$3 = makeBoolean( !token_var_$2.eql( gaf ) );
                  if( NIL != valid_$3 )
                  {
                    assertions = ConsesLow.cons( gaf, assertions );
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
      }
      else if( $const17$InferenceMicrotheoryParameter.eql( parameter ) )
      {
        final SubLObject pred_var = $const18$microtheoryParameterValueInSpecif;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( query_spec, TWO_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( query_spec, TWO_INTEGER, pred_var );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw15$GAF, $kw16$TRUE, NIL );
                SubLObject done_var_$2 = NIL;
                final SubLObject token_var_$3 = NIL;
                while ( NIL == done_var_$2)
                {
                  final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$3 );
                  final SubLObject valid_$4 = makeBoolean( !token_var_$3.eql( gaf ) );
                  if( NIL != valid_$4 )
                  {
                    assertions = ConsesLow.cons( gaf, assertions );
                  }
                  done_var_$2 = makeBoolean( NIL == valid_$4 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else if( $const19$InferenceModeParameter.eql( parameter ) )
      {
        final SubLObject pred_var = $const20$inferenceModeParameterValueInSpec;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( query_spec, TWO_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( query_spec, TWO_INTEGER, pred_var );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw15$GAF, $kw16$TRUE, NIL );
                SubLObject done_var_$3 = NIL;
                final SubLObject token_var_$4 = NIL;
                while ( NIL == done_var_$3)
                {
                  final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$4 );
                  final SubLObject valid_$5 = makeBoolean( !token_var_$4.eql( gaf ) );
                  if( NIL != valid_$5 )
                  {
                    assertions = ConsesLow.cons( gaf, assertions );
                  }
                  done_var_$3 = makeBoolean( NIL == valid_$5 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values3 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values3 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      else
      {
        final SubLObject pred_var = $const21$softwareParameterValueInSpecifica;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( query_spec, THREE_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( query_spec, THREE_INTEGER, pred_var );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw15$GAF, $kw16$TRUE, NIL );
                SubLObject done_var_$4 = NIL;
                final SubLObject token_var_$5 = NIL;
                while ( NIL == done_var_$4)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
                  final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( assertion ) );
                  if( NIL != valid_$6 && assertions_high.gaf_arg1( assertion ).eql( parameter ) )
                  {
                    assertions = ConsesLow.cons( assertion, assertions );
                  }
                  done_var_$4 = makeBoolean( NIL == valid_$6 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values4 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values4 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return assertions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 5895L)
  public static SubLObject kbq_ensure_query_spec_sentence(final SubLObject query_spec, final SubLObject sentence, final SubLObject defining_mt)
  {
    SubLObject cdolist_list_var;
    final SubLObject current_sentence_assertions = cdolist_list_var = kbq_current_query_spec_assertions_for_parameter( query_spec, $const13$InferenceSentenceParameter );
    SubLObject sentence_assertion = NIL;
    sentence_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( !assertions_high.assertion_mt( sentence_assertion ).eql( defining_mt ) || !assertions_high.gaf_arg2( sentence_assertion ).equal( sentence ) )
      {
        ke.ke_unassert_assertion_now( sentence_assertion );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sentence_assertion = cdolist_list_var.first();
    }
    if( NIL == inference_trivial.new_cyc_trivial_query( ConsesLow.list( $const22$ist_Asserted, defining_mt, kbq_assertible_query_spec_sentence( sentence, query_spec ) ), $const23$BaseKB, UNPROVIDED ) )
    {
      kbq_assert_query_spec_sentence( query_spec, sentence, defining_mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 6582L)
  public static SubLObject kbq_assert_query_spec_sentence(final SubLObject query_spec, final SubLObject sentence, final SubLObject defining_mt)
  {
    return kbq_assert( kbq_assertible_query_spec_sentence( sentence, query_spec ), defining_mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 6763L)
  public static SubLObject kbq_assertible_query_spec_sentence(final SubLObject sentence, final SubLObject query_spec)
  {
    return ConsesLow.list( $const14$sentenceParameterValueInSpecifica, ConsesLow.list( $const24$Quote, sentence ), query_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 6923L)
  public static SubLObject kbq_askable_query_spec_sentence(final SubLObject sentence_var, final SubLObject query_spec, SubLObject hlP)
  {
    if( hlP == UNPROVIDED )
    {
      hlP = NIL;
    }
    SubLObject sentence_arg = NIL;
    if( NIL != hlP )
    {
      sentence_arg = ConsesLow.list( $const24$Quote, sentence_var );
    }
    else
    {
      sentence_arg = ConsesLow.list( $const24$Quote, ConsesLow.list( $const25$EscapeQuote, sentence_var ) );
    }
    return ConsesLow.list( $const14$sentenceParameterValueInSpecifica, sentence_arg, query_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 7245L)
  public static SubLObject kbq_ensure_query_spec_mt(final SubLObject query_spec, final SubLObject mt, final SubLObject defining_mt)
  {
    final SubLObject current_mt_assertions = kbq_current_query_spec_assertions_for_parameter( query_spec, $const17$InferenceMicrotheoryParameter );
    SubLObject already_known = NIL;
    SubLObject cdolist_list_var = current_mt_assertions;
    SubLObject mt_assertion = NIL;
    mt_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( assertions_high.assertion_mt( mt_assertion ).eql( defining_mt ) && assertions_high.gaf_arg2( mt_assertion ).equal( mt ) )
      {
        already_known = T;
      }
      else
      {
        ke.ke_unassert_assertion_now( mt_assertion );
      }
      cdolist_list_var = cdolist_list_var.rest();
      mt_assertion = cdolist_list_var.first();
    }
    if( NIL == already_known )
    {
      kbq_assert_query_spec_mt( query_spec, mt, defining_mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 7800L)
  public static SubLObject kbq_assert_query_spec_mt(final SubLObject query_spec, final SubLObject mt, final SubLObject defining_mt)
  {
    return kbq_assert( ConsesLow.list( $const18$microtheoryParameterValueInSpecif, mt, query_spec ), defining_mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 7966L)
  public static SubLObject kbq_ensure_query_spec_inference_parameter_value(final SubLObject query_spec, final SubLObject query_property, final SubLObject value, final SubLObject defining_mt)
  {
    final SubLObject inference_parameter_constant = kbq_inference_parameter_from_keyword( query_property );
    final SubLObject current_query_property_assertions = kbq_current_query_spec_assertions_for_parameter( query_spec, inference_parameter_constant );
    SubLObject already_knownP = NIL;
    final SubLObject kb_value = kbq_encode_kb_inference_parameter_value( value, query_property );
    SubLObject cdolist_list_var = current_query_property_assertions;
    SubLObject qp_assertion = NIL;
    qp_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( assertions_high.assertion_mt( qp_assertion ).eql( defining_mt ) && assertions_high.gaf_arg2( qp_assertion ).equal( kb_value ) )
      {
        already_knownP = T;
      }
      else
      {
        ke.ke_unassert_assertion_now( qp_assertion );
      }
      cdolist_list_var = cdolist_list_var.rest();
      qp_assertion = cdolist_list_var.first();
    }
    if( NIL == already_knownP )
    {
      kbq_assert_query_spec_inference_parameter_value( query_spec, query_property, value, defining_mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 8882L)
  public static SubLObject kbq_assert_query_spec_inference_parameter_value(final SubLObject query_spec, final SubLObject query_property, final SubLObject value, final SubLObject defining_mt)
  {
    final SubLObject inference_parameter_constant = kbq_inference_parameter_from_keyword( query_property );
    final SubLObject kb_value = kbq_encode_kb_inference_parameter_value( value, query_property );
    if( NIL != forts.fort_p( inference_parameter_constant ) )
    {
      return kbq_assert_query_spec_inference_parameter_value_int( query_spec, inference_parameter_constant, kb_value, defining_mt );
    }
    Errors.warn( $str26$Inference_Parameter__S_unknown_by, query_property );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 9433L)
  public static SubLObject kbq_assert_query_spec_inference_parameter_value_int(final SubLObject query_spec, final SubLObject inference_parameter_constant, final SubLObject value, final SubLObject defining_mt)
  {
    if( $const19$InferenceModeParameter.eql( inference_parameter_constant ) )
    {
      return kbq_assert( ConsesLow.list( $const20$inferenceModeParameterValueInSpec, value, query_spec ), defining_mt, UNPROVIDED );
    }
    if( $const27$InferenceAllowedRulesParameter.eql( inference_parameter_constant ) && value.isList() )
    {
      SubLObject cdolist_list_var = value;
      SubLObject value_ass = NIL;
      value_ass = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        kbq_assert( ConsesLow.list( $const28$queryPracticeRules, query_spec, value_ass ), defining_mt, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        value_ass = cdolist_list_var.first();
      }
      return NIL;
    }
    return kbq_assert( ConsesLow.list( $const21$softwareParameterValueInSpecifica, inference_parameter_constant, value, query_spec ), defining_mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 10098L)
  public static SubLObject kbq_ensure_query_spec_pragmatics(final SubLObject query_spec, final SubLObject non_explanatory_sentence, final SubLObject defining_mt)
  {
    return kbq_ensure_query_spec_inference_parameter_value( query_spec, $kw29$NON_EXPLANATORY_SENTENCE, ConsesLow.list( $const24$Quote, non_explanatory_sentence ), defining_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 10345L)
  public static SubLObject kbq_assert_query_spec_pragmatics(final SubLObject query_spec, final SubLObject non_explanatory_sentence, final SubLObject defining_mt)
  {
    return kbq_assert_query_spec_inference_parameter_value( query_spec, $kw29$NON_EXPLANATORY_SENTENCE, ConsesLow.list( $const24$Quote, non_explanatory_sentence ), defining_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 10592L)
  public static SubLObject kbq_ensure_multiple_choice_option_spec(final SubLObject query_spec, final SubLObject mc_option_spec, final SubLObject defining_mt)
  {
    if( NIL == list_utilities.member_equalP( mc_option_spec, kbq_multiple_choice_option_specs( query_spec ) ) )
    {
      SubLObject option_num = NIL;
      SubLObject full_label = NIL;
      SubLObject index_label = NIL;
      SubLObject payload = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( mc_option_spec, mc_option_spec, $list30 );
      option_num = mc_option_spec.first();
      SubLObject current = mc_option_spec.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, mc_option_spec, $list30 );
      full_label = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, mc_option_spec, $list30 );
      index_label = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, mc_option_spec, $list30 );
      payload = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != payload )
        {
          assert NIL != Types.integerp( option_num ) : option_num;
          assert NIL != Types.stringp( full_label ) : full_label;
          assert NIL != Types.stringp( index_label ) : index_label;
          assert NIL != bindings.kb_set_of_binding_sets_p( payload ) : payload;
          final SubLObject existing_option = narts_high.find_nart( ConsesLow.list( $const34$MCQuestionNthOptionFn, query_spec, option_num ) );
          if( NIL != existing_option )
          {
            ke.ke_kill_now( existing_option );
          }
          if( NIL == string_utilities.empty_string_p( full_label ) )
          {
            kbq_assert( ConsesLow.list( $const35$multipleChoiceOptionFullLabel, ConsesLow.list( $const34$MCQuestionNthOptionFn, query_spec, option_num ), full_label ), defining_mt, UNPROVIDED );
          }
          if( NIL == string_utilities.empty_string_p( index_label ) )
          {
            kbq_assert( ConsesLow.list( $const36$multipleChoiceOptionIndexLabel, ConsesLow.list( $const34$MCQuestionNthOptionFn, query_spec, option_num ), index_label ), defining_mt, UNPROVIDED );
          }
          kbq_assert( ConsesLow.list( $const37$multipleChoiceOptionPayload, ConsesLow.list( $const34$MCQuestionNthOptionFn, query_spec, option_num ), payload ), defining_mt, UNPROVIDED );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( mc_option_spec, $list30 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 11647L)
  public static SubLObject kbq_assert_multiple_choice_option_spec(final SubLObject query_spec, final SubLObject mc_option_spec, final SubLObject defining_mt)
  {
    SubLObject option_num = NIL;
    SubLObject full_label = NIL;
    SubLObject index_label = NIL;
    SubLObject payload = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( mc_option_spec, mc_option_spec, $list30 );
    option_num = mc_option_spec.first();
    SubLObject current = mc_option_spec.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, mc_option_spec, $list30 );
    full_label = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, mc_option_spec, $list30 );
    index_label = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, mc_option_spec, $list30 );
    payload = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL != payload )
      {
        assert NIL != Types.integerp( option_num ) : option_num;
        assert NIL != Types.stringp( full_label ) : full_label;
        assert NIL != Types.stringp( index_label ) : index_label;
        assert NIL != bindings.kb_set_of_binding_sets_p( payload ) : payload;
        if( NIL == string_utilities.empty_string_p( full_label ) )
        {
          kbq_assert( ConsesLow.list( $const35$multipleChoiceOptionFullLabel, ConsesLow.list( $const34$MCQuestionNthOptionFn, query_spec, option_num ), full_label ), defining_mt, UNPROVIDED );
        }
        if( NIL == string_utilities.empty_string_p( index_label ) )
        {
          kbq_assert( ConsesLow.list( $const36$multipleChoiceOptionIndexLabel, ConsesLow.list( $const34$MCQuestionNthOptionFn, query_spec, option_num ), index_label ), defining_mt, UNPROVIDED );
        }
        kbq_assert( ConsesLow.list( $const37$multipleChoiceOptionPayload, ConsesLow.list( $const34$MCQuestionNthOptionFn, query_spec, option_num ), payload ), defining_mt, UNPROVIDED );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( mc_option_spec, $list30 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 12487L)
  public static SubLObject kbq_ensure_query_spec_comments(final SubLObject query_spec, final SubLObject comments, final SubLObject defining_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current_comment_assertions = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym11$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const12$EverythingPSC, thread );
      final SubLObject pred_var = $const38$comment;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( query_spec, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( query_spec, ONE_INTEGER, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw15$GAF, $kw16$TRUE, NIL );
              SubLObject done_var_$17 = NIL;
              final SubLObject token_var_$18 = NIL;
              while ( NIL == done_var_$17)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$18 );
                final SubLObject valid_$19 = makeBoolean( !token_var_$18.eql( assertion ) );
                if( NIL != valid_$19 )
                {
                  current_comment_assertions = ConsesLow.cons( assertion, current_comment_assertions );
                }
                done_var_$17 = makeBoolean( NIL == valid_$19 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    SubLObject cdolist_list_var = current_comment_assertions;
    SubLObject assertion2 = NIL;
    assertion2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject current_comment = assertions_high.gaf_arg2( assertion2 );
      final SubLObject current_mt = assertions_high.assertion_mt( assertion2 );
      if( !current_mt.eql( defining_mt ) || NIL == conses_high.member( current_comment, comments, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        ke.ke_unassert_assertion_now( assertion2 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion2 = cdolist_list_var.first();
    }
    SubLObject cdolist_list_var2 = comments;
    SubLObject comment = NIL;
    comment = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( NIL == kb_mapping_utilities.tuple_holds_in_mt( ConsesLow.listS( $const38$comment, query_spec, $list39 ), defining_mt, UNPROVIDED, UNPROVIDED ) )
      {
        kbq_assert_query_spec_comment( query_spec, comment, defining_mt );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      comment = cdolist_list_var2.first();
    }
    return query_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 13327L)
  public static SubLObject kbq_assert_query_spec_comment(final SubLObject query_spec, final SubLObject comment, final SubLObject defining_mt)
  {
    return kbq_assert( ConsesLow.list( $const38$comment, query_spec, comment ), defining_mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 13478L)
  public static SubLObject kbq_assert_template_definition(final SubLObject query_spec, SubLObject template, final SubLObject glosses, final SubLObject folder_mt_pairs, final SubLObject defining_mt)
  {
    final SubLObject current_template = kbq_template( query_spec );
    if( NIL != current_template && NIL != template && !current_template.eql( template ) )
    {
      Errors.error( $str40$The_template___A__passed_for_the_, template, query_spec, current_template );
    }
    if( NIL != current_template )
    {
      template = current_template;
    }
    if( NIL == template )
    {
      template = el_utilities.make_el_formula( $const41$TemplateFromTestQueryFn, ConsesLow.list( query_spec ), UNPROVIDED );
    }
    SubLObject cdolist_list_var = glosses;
    SubLObject gloss = NIL;
    gloss = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      kbq_assert_template_gloss( template, gloss, defining_mt );
      cdolist_list_var = cdolist_list_var.rest();
      gloss = cdolist_list_var.first();
    }
    cdolist_list_var = folder_mt_pairs;
    SubLObject folder_mt_pair = NIL;
    folder_mt_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = folder_mt_pair;
      SubLObject folder = NIL;
      SubLObject mt = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
      folder = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
      mt = current.first();
      current = current.rest();
      if( NIL == current )
      {
        kbq_assert_template_folder( template, folder, mt );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list42 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      folder_mt_pair = cdolist_list_var.first();
    }
    return template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 14333L)
  public static SubLObject kbq_ensure_template_definition(final SubLObject query_spec, SubLObject template, final SubLObject glosses, final SubLObject folder_mt_pairs, final SubLObject defining_mt)
  {
    final SubLObject current_template = kbq_template( query_spec );
    if( NIL != current_template && NIL != template && !current_template.eql( template ) )
    {
      Errors.error( $str40$The_template___A__passed_for_the_, template, query_spec, current_template );
    }
    if( NIL != current_template )
    {
      template = current_template;
    }
    if( NIL == template )
    {
      template = el_utilities.make_el_formula( $const41$TemplateFromTestQueryFn, ConsesLow.list( query_spec ), UNPROVIDED );
    }
    kbq_ensure_template_glosses( template, glosses, defining_mt );
    kbq_ensure_template_folders( template, folder_mt_pairs );
    return template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 15051L)
  public static SubLObject kbq_ensure_template_glosses(final SubLObject template, final SubLObject glosses, final SubLObject defining_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current_gloss_assertions = NIL;
    if( NIL != forts.fort_p( template ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym11$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const12$EverythingPSC, thread );
        final SubLObject pred_var = $const43$formulaTemplateGloss;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( template, ONE_INTEGER, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( template, ONE_INTEGER, pred_var );
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
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw15$GAF, $kw16$TRUE, NIL );
                SubLObject done_var_$21 = NIL;
                final SubLObject token_var_$22 = NIL;
                while ( NIL == done_var_$21)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$22 );
                  final SubLObject valid_$23 = makeBoolean( !token_var_$22.eql( assertion ) );
                  if( NIL != valid_$23 )
                  {
                    current_gloss_assertions = ConsesLow.cons( assertion, current_gloss_assertions );
                  }
                  done_var_$21 = makeBoolean( NIL == valid_$23 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$24, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    SubLObject cdolist_list_var = current_gloss_assertions;
    SubLObject assertion2 = NIL;
    assertion2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject current_gloss = assertions_high.gaf_arg2( assertion2 );
      final SubLObject current_mt = assertions_high.assertion_mt( assertion2 );
      if( !current_mt.eql( defining_mt ) || NIL == conses_high.member( current_gloss, glosses, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        ke.ke_unassert_assertion_now( assertion2 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion2 = cdolist_list_var.first();
    }
    SubLObject cdolist_list_var2 = glosses;
    SubLObject gloss = NIL;
    gloss = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      if( NIL == kb_mapping_utilities.tuple_holds_in_mt( ConsesLow.list( $const43$formulaTemplateGloss, template, gloss ), defining_mt, UNPROVIDED, UNPROVIDED ) )
      {
        kbq_assert_template_gloss( template, gloss, defining_mt );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      gloss = cdolist_list_var2.first();
    }
    return template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 15893L)
  public static SubLObject kbq_assert_template_gloss(final SubLObject template, final SubLObject gloss, final SubLObject defining_mt)
  {
    return kbq_assert( ConsesLow.list( $const43$formulaTemplateGloss, template, gloss ), defining_mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 16045L)
  public static SubLObject kbq_ensure_template_folders(final SubLObject template, final SubLObject folder_mt_pairs)
  {
    SubLObject cdolist_list_var;
    final SubLObject current_folder_mt_pairs = cdolist_list_var = ( NIL != forts.fort_p( template ) ) ? template_folders( template ) : NIL;
    SubLObject current_folder_mt_pair = NIL;
    current_folder_mt_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == subl_promotions.memberP( current_folder_mt_pair, folder_mt_pairs, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        SubLObject current;
        final SubLObject datum = current = current_folder_mt_pair;
        SubLObject folder = NIL;
        SubLObject mt = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
        folder = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
        mt = current.first();
        current = current.rest();
        if( NIL == current )
        {
          ke.ke_unassert_now( ConsesLow.list( $const44$folderContainsResource, folder, template ), mt );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list42 );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      current_folder_mt_pair = cdolist_list_var.first();
    }
    cdolist_list_var = folder_mt_pairs;
    SubLObject folder_mt_pair = NIL;
    folder_mt_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == subl_promotions.memberP( folder_mt_pair, current_folder_mt_pairs, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        SubLObject current;
        final SubLObject datum = current = folder_mt_pair;
        SubLObject folder = NIL;
        SubLObject mt = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
        folder = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list42 );
        mt = current.first();
        current = current.rest();
        if( NIL == current )
        {
          kbq_assert_template_folder( template, folder, mt );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum, $list42 );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      folder_mt_pair = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 16731L)
  public static SubLObject kbq_assert_template_folder(final SubLObject template, final SubLObject folder, final SubLObject mt)
  {
    return kbq_assert( ConsesLow.list( $const44$folderContainsResource, folder, template ), mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 16875L)
  public static SubLObject kbq_sentences(final SubLObject query_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject success = formula_pattern_match.formula_matches_pattern( query_spec, $list45 );
    SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject quoted_sentence = list_utilities.alist_lookup_without_values( v_bindings, $sym46$QUOTED_SENTENCE, UNPROVIDED, UNPROVIDED );
      return ConsesLow.list( czer_main.unquote_quoted_term( quoted_sentence, UNPROVIDED ) );
    }
    thread.resetMultipleValues();
    success = formula_pattern_match.formula_matches_pattern( query_spec, $list47 );
    v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject el_substitutions = list_utilities.alist_lookup_without_values( v_bindings, $sym48$EL_SUBSTITUTIONS, UNPROVIDED, UNPROVIDED );
      final SubLObject question_template = list_utilities.alist_lookup_without_values( v_bindings, $sym49$QUESTION_TEMPLATE, UNPROVIDED, UNPROVIDED );
      return query_from_template_sentences( question_template, el_substitutions );
    }
    final SubLObject sentences = conses_high.union( kb_mapping_utilities.pred_values_in_any_mt( query_spec, $const14$sentenceParameterValueInSpecifica, TWO_INTEGER, ONE_INTEGER, $kw16$TRUE ), kb_mapping_utilities
        .pred_arg_values_in_any_mt( query_spec, $const21$softwareParameterValueInSpecifica, $const13$InferenceSentenceParameter, THREE_INTEGER, ONE_INTEGER, TWO_INTEGER, $kw16$TRUE ), Symbols.symbol_function( EQUAL ),
        UNPROVIDED );
    SubLObject result = NIL;
    SubLObject cdolist_list_var = sentences;
    SubLObject sentence = NIL;
    sentence = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      result = ConsesLow.cons( czer_main.unquote_quoted_term( sentence, UNPROVIDED ), result );
      cdolist_list_var = cdolist_list_var.rest();
      sentence = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 17898L)
  public static SubLObject kbq_sentence(final SubLObject query_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject success = formula_pattern_match.formula_matches_pattern( query_spec, $list45 );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject quoted_sentence = list_utilities.alist_lookup_without_values( v_bindings, $sym46$QUOTED_SENTENCE, UNPROVIDED, UNPROVIDED );
      return czer_main.unquote_quoted_term( quoted_sentence, UNPROVIDED );
    }
    final SubLObject sentences = kbq_sentences( query_spec );
    if( NIL != list_utilities.singletonP( sentences ) )
    {
      return sentences.first();
    }
    if( NIL == sentences )
    {
      Errors.error( $str50$The_query_specification___A__has_, query_spec );
    }
    else
    {
      Errors.error( $str51$The_query_specification___A__has_, query_spec );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 18569L)
  public static SubLObject query_from_template_sentences(final SubLObject question_template, final SubLObject el_substitutions)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sentences = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym11$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const12$EverythingPSC, thread );
      SubLObject cycl_pattern = NIL;
      final SubLObject pred_var = $const52$cycLPattern;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( question_template, ONE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( question_template, ONE_INTEGER, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw15$GAF, NIL, NIL );
              SubLObject done_var_$25 = NIL;
              final SubLObject token_var_$26 = NIL;
              while ( NIL == done_var_$25)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$26 );
                final SubLObject valid_$27 = makeBoolean( !token_var_$26.eql( assertion ) );
                if( NIL != valid_$27 )
                {
                  cycl_pattern = assertions_high.gaf_arg( assertion, TWO_INTEGER );
                  final SubLObject sentence_pattern = czer_main.unquote_quoted_term( cycl_pattern, UNPROVIDED );
                  final SubLObject item_var = perform_query_from_template_substitutions( sentence_pattern, el_substitutions );
                  if( NIL == conses_high.member( item_var, sentences, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    sentences = ConsesLow.cons( item_var, sentences );
                  }
                }
                done_var_$25 = makeBoolean( NIL == valid_$27 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$28, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      final SubLObject meta_template = kb_mapping_utilities.fpred_value_in_any_mt( question_template, $const53$metaTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != meta_template )
      {
        final SubLObject items_var = query_from_template_sentences( meta_template, el_substitutions );
        if( items_var.isVector() )
        {
          final SubLObject vector_var = items_var;
          final SubLObject backwardP_var = NIL;
          SubLObject length;
          SubLObject v_iteration;
          SubLObject element_num;
          SubLObject item_var2;
          SubLObject item;
          for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
          {
            element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
            item = ( item_var2 = Vectors.aref( vector_var, element_num ) );
            if( NIL == conses_high.member( item_var2, sentences, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              sentences = ConsesLow.cons( item_var2, sentences );
            }
          }
        }
        else
        {
          SubLObject cdolist_list_var = items_var;
          SubLObject item2 = NIL;
          item2 = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject item_var3 = item2;
            if( NIL == conses_high.member( item_var3, sentences, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
            {
              sentences = ConsesLow.cons( item_var3, sentences );
            }
            cdolist_list_var = cdolist_list_var.rest();
            item2 = cdolist_list_var.first();
          }
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return sentences;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 19204L)
  public static SubLObject perform_query_from_template_substitutions(final SubLObject expression_template, final SubLObject el_substitutions)
  {
    SubLObject substitutions_alist = NIL;
    SubLObject cdolist_list_var = el_utilities.el_set_items( el_substitutions );
    SubLObject el_substitution = NIL;
    el_substitution = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = el_utilities.el_list_items( el_substitution );
      SubLObject template_term = NIL;
      SubLObject actual_term = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
      template_term = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
      actual_term = current.first();
      current = current.rest();
      if( NIL == current )
      {
        substitutions_alist = list_utilities.alist_enter( substitutions_alist, template_term, actual_term, UNPROVIDED );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list54 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      el_substitution = cdolist_list_var.first();
    }
    return ( NIL != expression_template ) ? cycl_utilities.expression_sublis( substitutions_alist, expression_template, Symbols.symbol_function( EQUAL ), UNPROVIDED ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 19686L)
  public static SubLObject query_from_template_mts(final SubLObject question_template, final SubLObject el_substitutions)
  {
    if( NIL != isa.isa_in_any_mtP( question_template, $const55$QuestionSuggestionTemplate_Single ) )
    {
      final SubLObject instantiation = kb_mapping_utilities.fpred_value_in_any_mt( question_template, $const56$questionTemplateInstantiations, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return ( NIL != instantiation ) ? kbq_mts( instantiation ) : NIL;
    }
    final SubLObject meta_template = kb_mapping_utilities.fpred_value_in_any_mt( question_template, $const53$metaTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject mts = ( NIL != meta_template ) ? kbq_mts( meta_template ) : NIL;
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = mts;
    SubLObject mt = NIL;
    mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ans = ConsesLow.cons( perform_query_from_template_substitutions( mt, el_substitutions ), ans );
      cdolist_list_var = cdolist_list_var.rest();
      mt = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 20312L)
  public static SubLObject query_from_template_inference_params(final SubLObject question_template, final SubLObject el_substitutions)
  {
    if( NIL != isa.isa_in_any_mtP( question_template, $const55$QuestionSuggestionTemplate_Single ) )
    {
      final SubLObject instantiation = kb_mapping_utilities.fpred_value_in_any_mt( question_template, $const56$questionTemplateInstantiations, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return ( NIL != instantiation ) ? kbq_inference_params( instantiation ) : NIL;
    }
    final SubLObject meta_template = kb_mapping_utilities.fpred_value_in_any_mt( question_template, $const53$metaTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject inference_params = ( NIL != meta_template ) ? kbq_inference_params( meta_template ) : NIL;
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = inference_params;
    SubLObject param = NIL;
    param = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ans = ConsesLow.cons( perform_query_from_template_substitutions( param, el_substitutions ), ans );
      cdolist_list_var = cdolist_list_var.rest();
      param = cdolist_list_var.first();
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 21009L)
  public static SubLObject kbq_sentence_closedP(final SubLObject query_spec)
  {
    return el_utilities.closedP( kbq_sentence( query_spec ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 21104L)
  public static SubLObject kbq_sentence_openP(final SubLObject query_spec)
  {
    return makeBoolean( NIL == kbq_sentence_closedP( query_spec ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 21202L)
  public static SubLObject kbq_pragmatics(final SubLObject query_spec)
  {
    if( NIL == kb_indexing_datastructures.indexed_term_p( query_spec ) )
    {
      return NIL;
    }
    final SubLObject kb_value = czer_main.unquote_quoted_term( kb_mapping_utilities.pred_arg_values_in_any_mt( query_spec, $const21$softwareParameterValueInSpecifica, $const57$InferenceNonExplanatorySentencePa,
        THREE_INTEGER, ONE_INTEGER, TWO_INTEGER, UNPROVIDED ).first(), UNPROVIDED );
    return kbq_parse_kb_inference_parameter_value( kb_value, $kw29$NON_EXPLANATORY_SENTENCE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 21634L)
  public static SubLObject kbq_mts(final SubLObject query_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject success = formula_pattern_match.formula_matches_pattern( query_spec, $list47 );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject el_substitutions = list_utilities.alist_lookup_without_values( v_bindings, $sym48$EL_SUBSTITUTIONS, UNPROVIDED, UNPROVIDED );
      final SubLObject question_template = list_utilities.alist_lookup_without_values( v_bindings, $sym49$QUESTION_TEMPLATE, UNPROVIDED, UNPROVIDED );
      return query_from_template_mts( question_template, el_substitutions );
    }
    return kb_mapping_utilities.pred_values_in_any_mt( query_spec, $const18$microtheoryParameterValueInSpecif, TWO_INTEGER, ONE_INTEGER, $kw16$TRUE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 22195L)
  public static SubLObject kbq_mt(final SubLObject query_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject success = formula_pattern_match.formula_matches_pattern( query_spec, $list58 );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject mt = list_utilities.alist_lookup_without_values( v_bindings, $sym59$MT, UNPROVIDED, UNPROVIDED );
      return mt;
    }
    final SubLObject mts = kbq_mts( query_spec );
    final SubLObject sentence = kbq_sentence( query_spec );
    if( NIL != el_utilities.ist_sentence_with_chlmt_p( sentence ) )
    {
      return NIL;
    }
    if( NIL == mts )
    {
      return $const60$InferencePSC;
    }
    if( NIL != list_utilities.singletonP( mts ) )
    {
      return czer_main.canonicalize_term( mts.first(), UNPROVIDED );
    }
    Errors.error( $str61$The_query_specification___A__has_, query_spec );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 23003L)
  public static SubLObject kbq_canonical_mt(final SubLObject query_spec)
  {
    final SubLObject mt = kbq_mt( query_spec );
    if( NIL != mt )
    {
      return hlmt_czer.canonicalize_hlmt( mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 23175L)
  public static SubLObject kbq_comments(final SubLObject query_spec)
  {
    final SubLObject comments = kb_mapping_utilities.pred_values_in_any_mt( query_spec, $const38$comment, ONE_INTEGER, TWO_INTEGER, $kw16$TRUE );
    return comments;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 23370L)
  public static SubLObject kbq_template_glosses(final SubLObject query_template)
  {
    final SubLObject glosses = kb_mapping_utilities.pred_values_in_any_mt( query_template, $const43$formulaTemplateGloss, ONE_INTEGER, TWO_INTEGER, $kw16$TRUE );
    return glosses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 23611L)
  public static SubLObject kbq_template(final SubLObject query_spec)
  {
    final SubLObject template = kb_mapping_utilities.fpred_value_in_any_mt( query_spec, $const62$querySpecificationForFormulaTempl, TWO_INTEGER, ONE_INTEGER, $kw16$TRUE );
    return template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 23838L)
  public static SubLObject template_folders(final SubLObject template)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym11$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const12$EverythingPSC, thread );
      final SubLObject pred_var = $const44$folderContainsResource;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( template, TWO_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( template, TWO_INTEGER, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw15$GAF, $kw16$TRUE, NIL );
              SubLObject done_var_$29 = NIL;
              final SubLObject token_var_$30 = NIL;
              while ( NIL == done_var_$29)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$30 );
                final SubLObject valid_$31 = makeBoolean( !token_var_$30.eql( assertion ) );
                if( NIL != valid_$31 )
                {
                  final SubLObject folder = assertions_high.gaf_arg1( assertion );
                  final SubLObject mt = assertions_high.assertion_mt( assertion );
                  result = ConsesLow.cons( ConsesLow.list( folder, mt ), result );
                }
                done_var_$29 = makeBoolean( NIL == valid_$31 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$32, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 24255L)
  public static SubLObject kbq_query_properties(SubLObject query_spec)
  {
    query_spec = czer_main.canonicalize_term( query_spec, UNPROVIDED );
    final SubLObject inf_tuples = kbq_inference_params( query_spec );
    SubLObject query_properties = kb_inference_params_to_query_properties( inf_tuples );
    if( NIL != inference_proof_spec.use_kbq_proof_spec_tableP() )
    {
      query_properties = list_utilities.merge_plist( query_properties, inference_proof_spec.overriding_experimental_proof_spec_properties( query_spec ) );
    }
    if( NIL != use_kbq_practice_rulesP() )
    {
      query_properties = list_utilities.merge_plist( query_properties, overriding_query_practice_rules_properties( query_spec ) );
    }
    return query_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 25043L)
  public static SubLObject use_kbq_practice_rulesP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $use_kbq_practice_rulesP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 25124L)
  public static SubLObject overriding_query_practice_rules_properties(final SubLObject query_spec)
  {
    final SubLObject practice_rules = cb_kb_query.kbq_query_practice_rules( query_spec );
    final SubLObject overriding_properties = ( NIL != practice_rules ) ? ConsesLow.list( $kw64$ALLOWED_RULES, practice_rules ) : NIL;
    return overriding_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 25382L)
  public static SubLObject kbq_query_property_value_from_keyword(final SubLObject query_spec, final SubLObject query_property)
  {
    assert NIL != inference_datastructures_enumerated_types.query_property_p( query_property ) : query_property;
    final SubLObject query_properties = kbq_query_properties( query_spec );
    return inference_strategist.query_property_value( query_properties, query_property );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 25641L)
  public static SubLObject kbq_allowed_rules(final SubLObject query_spec)
  {
    return inference_strategist.query_property_value( kbq_query_properties( query_spec ), $kw64$ALLOWED_RULES );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 25769L)
  public static SubLObject kbq_default_defining_mt()
  {
    return $const8$TestVocabularyMt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 25915L)
  public static SubLObject kbq_defining_mt(final SubLObject query_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject candidates = NIL;
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym11$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const12$EverythingPSC, thread );
      SubLObject pred_var = $const14$sentenceParameterValueInSpecifica;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( query_spec, TWO_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( query_spec, TWO_INTEGER, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw15$GAF, $kw16$TRUE, NIL );
              SubLObject done_var_$33 = NIL;
              final SubLObject token_var_$34 = NIL;
              while ( NIL == done_var_$33)
              {
                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$34 );
                final SubLObject valid_$35 = makeBoolean( !token_var_$34.eql( gaf ) );
                if( NIL != valid_$35 )
                {
                  final SubLObject mt = assertions_high.assertion_mt( gaf );
                  final SubLObject item_var;
                  final SubLObject monad = item_var = hlmt.hlmt_monad_mt( mt );
                  if( NIL == conses_high.member( item_var, candidates, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    candidates = ConsesLow.cons( item_var, candidates );
                  }
                }
                done_var_$33 = makeBoolean( NIL == valid_$35 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$36, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      pred_var = $const18$microtheoryParameterValueInSpecif;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( query_spec, TWO_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( query_spec, TWO_INTEGER, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw15$GAF, $kw16$TRUE, NIL );
              SubLObject done_var_$34 = NIL;
              final SubLObject token_var_$35 = NIL;
              while ( NIL == done_var_$34)
              {
                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$35 );
                final SubLObject valid_$36 = makeBoolean( !token_var_$35.eql( gaf ) );
                if( NIL != valid_$36 )
                {
                  final SubLObject mt = assertions_high.assertion_mt( gaf );
                  final SubLObject item_var;
                  final SubLObject monad = item_var = hlmt.hlmt_monad_mt( mt );
                  if( NIL == conses_high.member( item_var, candidates, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    candidates = ConsesLow.cons( item_var, candidates );
                  }
                }
                done_var_$34 = makeBoolean( NIL == valid_$36 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$37, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      pred_var = $const20$inferenceModeParameterValueInSpec;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( query_spec, TWO_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( query_spec, TWO_INTEGER, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw15$GAF, $kw16$TRUE, NIL );
              SubLObject done_var_$35 = NIL;
              final SubLObject token_var_$36 = NIL;
              while ( NIL == done_var_$35)
              {
                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$36 );
                final SubLObject valid_$37 = makeBoolean( !token_var_$36.eql( gaf ) );
                if( NIL != valid_$37 )
                {
                  final SubLObject mt = assertions_high.assertion_mt( gaf );
                  final SubLObject item_var;
                  final SubLObject monad = item_var = hlmt.hlmt_monad_mt( mt );
                  if( NIL == conses_high.member( item_var, candidates, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    candidates = ConsesLow.cons( item_var, candidates );
                  }
                }
                done_var_$35 = makeBoolean( NIL == valid_$37 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values3 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values3 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$38, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
      pred_var = $const21$softwareParameterValueInSpecifica;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( query_spec, THREE_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( query_spec, THREE_INTEGER, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw15$GAF, $kw16$TRUE, NIL );
              SubLObject done_var_$36 = NIL;
              final SubLObject token_var_$37 = NIL;
              while ( NIL == done_var_$36)
              {
                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$37 );
                final SubLObject valid_$38 = makeBoolean( !token_var_$37.eql( assertion ) );
                if( NIL != valid_$38 )
                {
                  final SubLObject mt = assertions_high.assertion_mt( assertion );
                  final SubLObject item_var;
                  final SubLObject monad = item_var = hlmt.hlmt_monad_mt( mt );
                  if( NIL == conses_high.member( item_var, candidates, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
                  {
                    candidates = ConsesLow.cons( item_var, candidates );
                  }
                }
                done_var_$36 = makeBoolean( NIL == valid_$38 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values4 = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values4 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$39, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
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
    return kbq_default_defining_mt();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 27217L)
  public static SubLObject multiple_choice_testP(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL != isa.isa_in_any_mtP( v_object, $const66$MultipleChoiceKBContentTest ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 27356L)
  public static SubLObject multiple_choice_queryP(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL != isa.isa_in_any_mtP( v_object, $const67$MultipleChoiceQuerySpecification ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 27501L)
  public static SubLObject kbq_multiple_choice_option_specs(final SubLObject query_spec)
  {
    return kbq_multiple_choice_option_specs_int( query_spec, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 27629L)
  public static SubLObject kbq_multiple_choice_option_spec(final SubLObject query_spec, final SubLObject n)
  {
    return kbq_multiple_choice_option_specs_int( query_spec, n ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 27764L)
  public static SubLObject kbq_multiple_choice_option_specs_int(final SubLObject query_spec, final SubLObject specified_n)
  {
    assert NIL != kbq_query_spec_p( query_spec ) : query_spec;
    final SubLObject mc_option_spec_dict = dictionary.new_dictionary( Symbols.symbol_function( EQL ), UNPROVIDED );
    if( NIL != multiple_choice_queryP( query_spec ) )
    {
      final SubLObject pred_var = $const69$mcQuestionNthOption;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( query_spec, NIL, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( query_spec, NIL, pred_var );
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
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw15$GAF, $kw16$TRUE, NIL );
              SubLObject done_var_$49 = NIL;
              final SubLObject token_var_$50 = NIL;
              while ( NIL == done_var_$49)
              {
                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$50 );
                final SubLObject valid_$51 = makeBoolean( !token_var_$50.eql( gaf ) );
                if( NIL != valid_$51 )
                {
                  final SubLObject n = assertions_high.gaf_arg2( gaf );
                  final SubLObject mc_option = assertions_high.gaf_arg3( gaf );
                  final SubLObject full_label = kb_mapping_utilities.fpred_value( mc_option, $const35$multipleChoiceOptionFullLabel, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  final SubLObject index_label = kb_mapping_utilities.fpred_value( mc_option, $const36$multipleChoiceOptionIndexLabel, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  final SubLObject kb_bindings = kb_mapping_utilities.fpred_value( mc_option, $const37$multipleChoiceOptionPayload, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                  if( NIL == specified_n || n.equal( specified_n ) )
                  {
                    dictionary.dictionary_enter( mc_option_spec_dict, mc_option, ConsesLow.list( n, full_label, index_label, kb_bindings ) );
                  }
                }
                done_var_$49 = makeBoolean( NIL == valid_$51 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
              try
              {
                Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
      }
    }
    return Sort.sort( dictionary.dictionary_values( mc_option_spec_dict ), Symbols.symbol_function( $sym70$SAFE__ ), Symbols.symbol_function( $sym71$FIRST ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 28616L)
  public static SubLObject kbq_assert_query_spec_inference_parameters(final SubLObject query_spec, final SubLObject query_properties, final SubLObject defining_mt)
  {
    SubLObject remainder;
    SubLObject query_property;
    SubLObject value;
    for( remainder = NIL, remainder = query_properties; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      query_property = remainder.first();
      value = conses_high.cadr( remainder );
      kbq_assert_query_spec_inference_parameter_value( query_spec, query_property, value, defining_mt );
    }
    return query_spec;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 28989L)
  public static SubLObject kb_inference_params_to_query_properties(final SubLObject inf_tuples)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = inf_tuples;
    SubLObject tuple = NIL;
    tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = tuple;
      SubLObject parameter = NIL;
      SubLObject kb_value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
      parameter = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
      kb_value = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject keyword = kbq_keyword_from_inference_parameter( parameter );
        final SubLObject value = kbq_parse_kb_inference_parameter_value( kb_value, keyword );
        result = conses_high.putf( result, keyword, value );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list72 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      tuple = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 29534L)
  public static SubLObject kbq_parse_kb_inference_parameter_value(final SubLObject value, final SubLObject keyword)
  {
    if( keyword.eql( $kw73$MAX_TIME ) || keyword.eql( $kw74$FORWARD_MAX_TIME ) )
    {
      return kbq_convert_time_to_seconds( value );
    }
    if( keyword.eql( $kw29$NON_EXPLANATORY_SENTENCE ) )
    {
      return czer_main.unquote_quoted_term( parameter_specification_utilities.parse_standard_parameter_value( value ), UNPROVIDED );
    }
    if( !keyword.eql( $kw64$ALLOWED_RULES ) )
    {
      return parameter_specification_utilities.parse_standard_parameter_value( value );
    }
    if( NIL != el_utilities.el_list_p( value ) )
    {
      SubLObject rules = NIL;
      SubLObject cdolist_list_var;
      final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( value, $kw75$IGNORE );
      SubLObject rule = NIL;
      rule = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != canon_tl.tl_termP( rule ) )
        {
          rule = canon_tl.tl_term_to_hl( rule );
        }
        else if( NIL != el_utilities.ist_sentence_p( rule, UNPROVIDED ) )
        {
          rule = czer_meta.find_assertion_cycl( rule, UNPROVIDED );
        }
        final SubLObject var = rule;
        if( NIL != var )
        {
          rules = ConsesLow.cons( var, rules );
        }
        cdolist_list_var = cdolist_list_var.rest();
        rule = cdolist_list_var.first();
      }
      return Sequences.nreverse( rules );
    }
    return parameter_specification_utilities.parse_standard_parameter_value( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 30363L)
  public static SubLObject kbq_encode_kb_inference_parameter_value(final SubLObject value, final SubLObject keyword)
  {
    if( keyword.eql( $kw73$MAX_TIME ) || keyword.eql( $kw74$FORWARD_MAX_TIME ) )
    {
      return value.isInteger() ? kbq_convert_seconds_to_kb_time( value ) : $const76$TheEmptySet;
    }
    if( keyword.eql( $kw77$RESULT_UNIQUENESS ) || keyword.eql( $kw29$NON_EXPLANATORY_SENTENCE ) || keyword.eql( $kw64$ALLOWED_RULES ) || keyword.eql( $kw78$MAX_NUMBER ) || keyword.eql( $kw79$MAX_PROOF_DEPTH ) || keyword
        .eql( $kw80$MAX_TRANSFORMATION_DEPTH ) || keyword.eql( $kw81$METRICS ) )
    {
      return ( NIL != value ) ? value : $const76$TheEmptySet;
    }
    return parameter_specification_utilities.encode_parameter_value( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 30892L)
  public static SubLObject kbq_inference_params(final SubLObject query_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject success = formula_pattern_match.formula_matches_pattern( query_spec, $list47 );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject el_substitutions = list_utilities.alist_lookup_without_values( v_bindings, $sym48$EL_SUBSTITUTIONS, UNPROVIDED, UNPROVIDED );
      final SubLObject question_template = list_utilities.alist_lookup_without_values( v_bindings, $sym49$QUESTION_TEMPLATE, UNPROVIDED, UNPROVIDED );
      return query_from_template_inference_params( question_template, el_substitutions );
    }
    SubLObject tuples = parameter_specification_utilities.parameter_specification_tuples( query_spec );
    if( NIL != kb_indexing_datastructures.indexed_term_p( query_spec ) )
    {
      final SubLObject tuple = inference_mode_parameter_specification_tuple( query_spec );
      final SubLObject mode = conses_high.second( tuple );
      if( NIL != mode )
      {
        tuples = ConsesLow.cons( tuple, tuples );
      }
      if( NIL != control_vars.$kbq_run_query_practice_modeP$.getDynamicValue( thread ) )
      {
        final SubLObject practice_rules = kb_mapping_utilities.pred_values_in_any_mt( query_spec, $const28$queryPracticeRules, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL != practice_rules )
        {
          tuples = Sequences.delete( $const27$InferenceAllowedRulesParameter, tuples, Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym71$FIRST ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
          tuples = ConsesLow.cons( ConsesLow.list( $const27$InferenceAllowedRulesParameter, el_utilities.make_el_list( practice_rules, UNPROVIDED ) ), tuples );
        }
      }
    }
    tuples = Sequences.delete( $const13$InferenceSentenceParameter, tuples, Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym71$FIRST ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    tuples = Sequences.delete( $const17$InferenceMicrotheoryParameter, tuples, Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym71$FIRST ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return tuples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 32137L)
  public static SubLObject inference_mode_parameter_specification_tuple(final SubLObject query_spec)
  {
    assert NIL != forts.fort_p( query_spec ) : query_spec;
    final SubLObject value = kb_mapping_utilities.fpred_value_in_any_mt( query_spec, $const20$inferenceModeParameterValueInSpec, TWO_INTEGER, ONE_INTEGER, $kw16$TRUE );
    return make_inference_mode_parameter_tuple( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 32461L)
  public static SubLObject make_inference_mode_parameter_tuple(final SubLObject value)
  {
    return ConsesLow.list( $const19$InferenceModeParameter, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 32569L)
  public static SubLObject kbq_cyclist(final SubLObject query)
  {
    if( NIL != constant_handles.constant_p( query ) )
    {
      final SubLObject cyclist = bookkeeping_store.creator( query, UNPROVIDED );
      if( NIL != cyclist )
      {
        return cyclist;
      }
    }
    if( NIL != nart_handles.nart_p( query ) && $const83$TestQueryFn.eql( cycl_utilities.nat_functor( query ) ) )
    {
      return kbq_cyclist( cycl_utilities.nat_arg1( query, UNPROVIDED ) );
    }
    if( NIL != kb_indexing_datastructures.indexed_term_p( query ) )
    {
      return kb_accessors.cyclist_with_most_assertions_about( query );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 32974L)
  public static SubLObject kbq_runnableP(final SubLObject query_spec)
  {
    return makeBoolean( NIL == kbq_known_unrunnableP( query_spec ) && $kw84$SEVERE != why_not_kbq_valid( query_spec, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 33187L)
  public static SubLObject kbq_known_unrunnableP(final SubLObject query_spec)
  {
    return makeBoolean( NIL != forts.fort_p( query_spec ) && NIL != isa.isa_in_any_mtP( query_spec, $const85$UnrunnableQuery ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 33326L)
  public static SubLObject why_not_kbq_valid(final SubLObject query_spec, SubLObject test_spec)
  {
    if( test_spec == UNPROVIDED )
    {
      test_spec = NIL;
    }
    if( NIL == test_spec )
    {
      test_spec = query_spec;
    }
    if( NIL != janus.janus_operation_p( query_spec ) )
    {
      return Values.values( NIL, NIL, NIL );
    }
    if( NIL == el_utilities.el_formula_with_operator_p( query_spec, $const86$QueryFn ) )
    {
      SubLObject result = NIL;
      SubLObject message = $str92$;
      SubLObject problem_keywords = NIL;
      final SubLObject mts = kbq_mts( query_spec );
      final SubLObject sentences = kbq_sentences( query_spec );
      final SubLObject some_ist_sentenceP = Sequences.find_if( $sym93$IST_SENTENCE_WITH_CHLMT_P, sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL == list_utilities.singletonP( sentences ) )
      {
        result = $kw84$SEVERE;
        if( Sequences.length( sentences ).numE( ZERO_INTEGER ) )
        {
          message = Sequences.cconcatenate( message, PrintLow.format( NIL, $str88$___A_has_no_query_sentence_, test_spec ) );
          problem_keywords = ConsesLow.cons( $kw89$NO_QUERY_SENTENCE, problem_keywords );
        }
        else
        {
          message = Sequences.cconcatenate( message, PrintLow.format( NIL, $str94$___A_has_more_than_one_query_sent, test_spec ) );
          problem_keywords = ConsesLow.cons( $kw95$MORE_THAN_ONE_QUERY_SENTENCE, problem_keywords );
        }
      }
      if( NIL == list_utilities.singletonP( mts ) )
      {
        if( Sequences.length( mts ).numE( ZERO_INTEGER ) )
        {
          if( NIL == some_ist_sentenceP )
          {
            result = $kw84$SEVERE;
            message = Sequences.cconcatenate( message, PrintLow.format( NIL, $str96$___A_has_no_query_Mt_, test_spec ) );
            problem_keywords = ConsesLow.cons( $kw97$NO_QUERY_MT, problem_keywords );
          }
        }
        else
        {
          result = $kw84$SEVERE;
          message = Sequences.cconcatenate( message, PrintLow.format( NIL, $str98$___A_has_more_than_one_query_Mt_, test_spec ) );
          problem_keywords = ConsesLow.cons( $kw99$MORE_THAN_ONE_QUERY_MT, problem_keywords );
        }
      }
      return Values.values( result, message, Sequences.nreverse( problem_keywords ) );
    }
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.nat_args( query_spec, UNPROVIDED );
    final SubLObject sentence = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list87 );
    current = current.rest();
    final SubLObject parameters = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list87 );
    final SubLObject rest;
    current = ( rest = current.rest() );
    if( NIL == sentence )
    {
      return Values.values( $kw84$SEVERE, PrintLow.format( NIL, $str88$___A_has_no_query_sentence_, test_spec ), ConsesLow.list( $kw89$NO_QUERY_SENTENCE ) );
    }
    if( NIL != rest )
    {
      return Values.values( $kw84$SEVERE, PrintLow.format( NIL, $str90$___A_has_too_many_arguments_, test_spec ), ConsesLow.list( $kw91$TOO_MANY_ARGUMENTS ) );
    }
    return Values.values( NIL, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 35975L)
  public static SubLObject kbq_removal_only_queryP(final SubLObject query)
  {
    return makeBoolean( ZERO_INTEGER.eql( kbq_query_property_value_from_keyword( query, $kw80$MAX_TRANSFORMATION_DEPTH ) ) || NIL == kbq_query_property_value_from_keyword( query, $kw100$TRANSFORMATION_ALLOWED_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 36261L)
  public static SubLObject kbq_transformation_queryP(final SubLObject query)
  {
    return makeBoolean( NIL != kbq_query_property_value_from_keyword( query, $kw100$TRANSFORMATION_ALLOWED_ ) && NIL == kbq_removal_only_queryP( query ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 36504L)
  public static SubLObject kbq_trivial_queryP(final SubLObject query)
  {
    return makeBoolean( NIL != kbq_removal_only_queryP( query ) && NIL != kbq_query_run.kbq_single_literal_query_p( query ) && $kw101$BINDINGS.eql( kbq_query_property_value_from_keyword( query,
        $kw77$RESULT_UNIQUENESS ) ) && NIL == kbq_query_property_value_from_keyword( query, $kw78$MAX_NUMBER ) && NIL == kbq_query_property_value_from_keyword( query, $kw73$MAX_TIME )
        && NIL == kbq_query_property_value_from_keyword( query, $kw79$MAX_PROOF_DEPTH ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 37128L)
  public static SubLObject kbq_simple_queryP(final SubLObject query)
  {
    return makeBoolean( NIL != kbq_removal_only_queryP( query ) && NIL == kbq_trivial_queryP( query ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 37360L)
  public static SubLObject kbq_shallow_queryP(final SubLObject query)
  {
    return makeBoolean( NIL != kbq_transformation_queryP( query ) && ONE_INTEGER.eql( kbq_query_property_value_from_keyword( query, $kw80$MAX_TRANSFORMATION_DEPTH ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 37665L)
  public static SubLObject kbq_deep_queryP(final SubLObject query)
  {
    return makeBoolean( NIL != kbq_transformation_queryP( query ) && NIL == kbq_shallow_queryP( query ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 37904L)
  public static SubLObject kbq_conditional_queryP(final SubLObject query)
  {
    final SubLObject query_properties = kbq_query_properties( query );
    return list_utilities.sublisp_boolean( inference_strategist.query_property_value( query_properties, $kw102$CONDITIONAL_SENTENCE_ ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 38097L)
  public static SubLObject new_continuable_inference_from_kbq(final SubLObject query_spec, SubLObject overriding_query_properties, SubLObject substitutions)
  {
    if( overriding_query_properties == UNPROVIDED )
    {
      overriding_query_properties = NIL;
    }
    if( substitutions == UNPROVIDED )
    {
      substitutions = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject plist_var = overriding_query_properties;
    assert NIL != list_utilities.property_list_p( plist_var ) : plist_var;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = plist_var; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      assert NIL != inference_datastructures_enumerated_types.query_property_p( property ) : property;
    }
    thread.resetMultipleValues();
    final SubLObject sentence = kbq_query_arguments( query_spec, substitutions );
    final SubLObject mt = thread.secondMultipleValue();
    SubLObject query_properties = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    query_properties = inference_datastructures_enumerated_types.merge_query_properties( query_properties, overriding_query_properties );
    final SubLObject query_static_properties = inference_datastructures_enumerated_types.extract_query_static_or_meta_properties( query_properties );
    return inference_kernel.new_continuable_inference( sentence, mt, query_static_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 38930L)
  public static SubLObject new_removal_ask_from_kbq(final SubLObject query_spec, final SubLObject metrics_template, SubLObject overriding_query_properties)
  {
    if( overriding_query_properties == UNPROVIDED )
    {
      overriding_query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject plist_var = overriding_query_properties;
    assert NIL != list_utilities.property_list_p( plist_var ) : plist_var;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = plist_var; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      assert NIL != inference_datastructures_enumerated_types.query_property_p( property ) : property;
    }
    SubLObject result = NIL;
    SubLObject metrics = NIL;
    thread.resetMultipleValues();
    final SubLObject sentence = kbq_query_arguments( query_spec, UNPROVIDED );
    final SubLObject mt = thread.secondMultipleValue();
    SubLObject query_properties = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    query_properties = inference_datastructures_enumerated_types.merge_query_properties( query_properties, overriding_query_properties );
    query_properties = list_utilities.filter_plist( query_properties, Symbols.symbol_function( $sym104$REMOVAL_ASK_QUERY_PROPERTY_P ) );
    SubLObject complete_total_time = NIL;
    SubLObject total_time = NIL;
    SubLObject sentence_clauses = NIL;
    SubLObject v_bindings = NIL;
    SubLObject free_vars = NIL;
    final SubLObject time_var = Time.get_internal_real_time();
    thread.resetMultipleValues();
    final SubLObject sentence_clauses_$52 = inference_czer.inference_canonicalize_ask_int( sentence, mt, inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue() );
    final SubLObject v_bindings_$53 = thread.secondMultipleValue();
    final SubLObject free_vars_$54 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    sentence_clauses = sentence_clauses_$52;
    v_bindings = v_bindings_$53;
    free_vars = free_vars_$54;
    SubLObject current;
    final SubLObject datum = current = clauses.pos_lits( sentence_clauses.first() ).first();
    SubLObject hl_mt = NIL;
    SubLObject hl_sentence = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list105 );
    hl_mt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list105 );
    hl_sentence = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject time_var_$55 = Time.get_internal_real_time();
      result = backward.removal_ask( hl_sentence, hl_mt, $kw16$TRUE, query_properties );
      total_time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var_$55 ), time_high.$internal_time_units_per_second$.getGlobalValue() );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list105 );
    }
    complete_total_time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
    metrics = removal_ask_compute_metrics( metrics_template, result, complete_total_time, total_time );
    return Values.values( result, metrics );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 40169L)
  public static SubLObject removal_ask_compute_metrics(final SubLObject template, final SubLObject result, final SubLObject complete_total_time, final SubLObject total_time)
  {
    SubLObject v_answer = conses_high.copy_tree( template );
    SubLObject cdolist_list_var;
    final SubLObject metrics = cdolist_list_var = list_utilities.tree_gather( template, Symbols.symbol_function( $sym106$REMOVAL_ASK_QUERY_METRIC_P ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject metric = NIL;
    metric = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject pcase_var = metric;
      if( pcase_var.eql( $kw107$ANSWER_COUNT ) )
      {
        final SubLObject answer_count = Sequences.length( result );
        v_answer = conses_high.nsubst( answer_count, $kw107$ANSWER_COUNT, v_answer, Symbols.symbol_function( EQ ), UNPROVIDED );
      }
      else if( pcase_var.eql( $kw108$TIME_TO_FIRST_ANSWER ) )
      {
        final SubLObject first_answer_time = ( NIL != result ) ? total_time : NIL;
        v_answer = conses_high.nsubst( first_answer_time, $kw108$TIME_TO_FIRST_ANSWER, v_answer, Symbols.symbol_function( EQ ), UNPROVIDED );
      }
      else if( pcase_var.eql( $kw109$TIME_TO_LAST_ANSWER ) )
      {
        final SubLObject last_answer_time = ( NIL != result ) ? total_time : NIL;
        v_answer = conses_high.nsubst( last_answer_time, $kw109$TIME_TO_LAST_ANSWER, v_answer, Symbols.symbol_function( EQ ), UNPROVIDED );
      }
      else if( pcase_var.eql( $kw110$TOTAL_TIME ) )
      {
        v_answer = conses_high.nsubst( total_time, $kw110$TOTAL_TIME, v_answer, Symbols.symbol_function( EQ ), UNPROVIDED );
      }
      else if( pcase_var.eql( $kw111$COMPLETE_TOTAL_TIME ) )
      {
        v_answer = conses_high.nsubst( complete_total_time, $kw111$COMPLETE_TOTAL_TIME, v_answer, Symbols.symbol_function( EQ ), UNPROVIDED );
      }
      else if( pcase_var.eql( $kw112$TIME_PER_ANSWER ) )
      {
        final SubLObject answer_count = Sequences.length( result );
        SubLObject time_per_answer = NIL;
        if( total_time.isNumber() && NIL != subl_promotions.positive_integer_p( answer_count ) )
        {
          time_per_answer = Numbers.divide( total_time, answer_count );
        }
        v_answer = conses_high.nsubst( time_per_answer, $kw112$TIME_PER_ANSWER, v_answer, Symbols.symbol_function( EQ ), UNPROVIDED );
      }
      else if( pcase_var.eql( $kw113$LATENCY_IMPROVEMENT_FROM_ITERATIVITY ) )
      {
        final SubLObject latency_improvement_from_iterativity = list_utilities.safe_difference( total_time, total_time );
        v_answer = conses_high.nsubst( latency_improvement_from_iterativity, $kw113$LATENCY_IMPROVEMENT_FROM_ITERATIVITY, v_answer, Symbols.symbol_function( EQ ), UNPROVIDED );
      }
      else
      {
        Errors.sublisp_break( $str114$time_to_implement_metric__S, new SubLObject[] { metric
        } );
      }
      cdolist_list_var = cdolist_list_var.rest();
      metric = cdolist_list_var.first();
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 41713L)
  public static SubLObject continue_inference_from_kbq(final SubLObject inference, final SubLObject query_spec, SubLObject overriding_query_properties)
  {
    if( overriding_query_properties == UNPROVIDED )
    {
      overriding_query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject plist_var = overriding_query_properties;
    assert NIL != list_utilities.property_list_p( plist_var ) : plist_var;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = plist_var; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      assert NIL != inference_datastructures_enumerated_types.query_property_p( property ) : property;
    }
    thread.resetMultipleValues();
    final SubLObject sentence = kbq_query_arguments( query_spec, UNPROVIDED );
    final SubLObject mt = thread.secondMultipleValue();
    SubLObject query_properties = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    query_properties = inference_datastructures_enumerated_types.merge_query_properties( query_properties, overriding_query_properties );
    final SubLObject query_dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties( query_properties );
    return inference_kernel.continue_inference( inference, query_dynamic_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 42467L)
  public static SubLObject new_cyc_query_from_kbq(final SubLObject query_spec, SubLObject overriding_query_properties, SubLObject substitutions)
  {
    if( overriding_query_properties == UNPROVIDED )
    {
      overriding_query_properties = NIL;
    }
    if( substitutions == UNPROVIDED )
    {
      substitutions = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject plist_var = overriding_query_properties;
    assert NIL != list_utilities.property_list_p( plist_var ) : plist_var;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = plist_var; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      assert NIL != inference_datastructures_enumerated_types.query_property_p( property ) : property;
    }
    SubLObject result = NIL;
    SubLObject halt_reason = NIL;
    SubLObject inference = NIL;
    SubLObject metric_values = NIL;
    final SubLObject _prev_bind_0 = control_vars.$save_asked_queriesP$.currentBinding( thread );
    try
    {
      control_vars.$save_asked_queriesP$.bind( NIL, thread );
      if( NIL != janus.janus_modification_operation_p( query_spec ) )
      {
        thread.resetMultipleValues();
        final SubLObject result_$56 = janus.execute_janus_modification_operation( query_spec );
        final SubLObject halt_reason_$57 = thread.secondMultipleValue();
        final SubLObject inference_$58 = thread.thirdMultipleValue();
        final SubLObject metric_values_$59 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        result = result_$56;
        halt_reason = halt_reason_$57;
        inference = inference_$58;
        metric_values = metric_values_$59;
      }
      else
      {
        thread.resetMultipleValues();
        final SubLObject sentence = kbq_query_arguments( query_spec, substitutions );
        final SubLObject mt = thread.secondMultipleValue();
        SubLObject query_properties = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        query_properties = inference_datastructures_enumerated_types.merge_query_properties( query_properties, overriding_query_properties );
        thread.resetMultipleValues();
        final SubLObject result_$57 = inference_kernel.new_cyc_query( sentence, mt, query_properties );
        final SubLObject halt_reason_$58 = thread.secondMultipleValue();
        final SubLObject inference_$59 = thread.thirdMultipleValue();
        final SubLObject metric_values_$60 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        result = result_$57;
        halt_reason = halt_reason_$58;
        inference = inference_$59;
        metric_values = metric_values_$60;
      }
    }
    finally
    {
      control_vars.$save_asked_queriesP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result, halt_reason, inference, metric_values );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 43574L)
  public static SubLObject ask_multiple_choice_query_from_kbq(final SubLObject query_spec, SubLObject overriding_query_properties)
  {
    if( overriding_query_properties == UNPROVIDED )
    {
      overriding_query_properties = NIL;
    }
    return new_cyc_query_from_kbq( query_spec, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 44543L)
  public static SubLObject cache_kbq_extent(final SubLObject query_spec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject sentence = kbq_query_arguments( query_spec, UNPROVIDED );
    SubLObject mt = thread.secondMultipleValue();
    SubLObject query_properties = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    if( NIL == mt )
    {
      mt = mt_relevance_macros.inference_relevant_mt();
    }
    query_properties = conses_high.putf( query_properties, $kw115$CACHE_INFERENCE_RESULTS_, T );
    return inference_kernel.new_cyc_query( sentence, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 44987L)
  public static SubLObject kbq_query_arguments(final SubLObject query_spec, SubLObject substitutions)
  {
    if( substitutions == UNPROVIDED )
    {
      substitutions = NIL;
    }
    if( NIL != el_utilities.el_formula_with_operator_p( query_spec, $const86$QueryFn ) )
    {
      return query_fn_term_to_new_cyc_query_arguments( query_spec );
    }
    if( NIL != formula_pattern_match.formula_matches_pattern( query_spec, $list116 ) )
    {
      return predicate_query_fn_term_to_new_cyc_query_arguments( query_spec );
    }
    if( NIL == janus.janus_query_operation_p( query_spec ) )
    {
      final SubLObject sentence = kbq_sentence( query_spec );
      final SubLObject mt = kbq_mt( query_spec );
      final SubLObject query_properties = kbq_query_properties( query_spec );
      return kbq_possibly_apply_substitutions( substitutions, sentence, mt, query_properties );
    }
    SubLObject current;
    final SubLObject datum = current = encapsulation.unencapsulate( query_spec );
    SubLObject janus_op = NIL;
    SubLObject type = NIL;
    SubLObject sentence2 = NIL;
    SubLObject mt2 = NIL;
    SubLObject query_properties2 = NIL;
    SubLObject expected_result = NIL;
    SubLObject expected_halt_reason = NIL;
    SubLObject tag = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list117 );
    janus_op = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list117 );
    type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list117 );
    sentence2 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list117 );
    mt2 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list117 );
    query_properties2 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list117 );
    expected_result = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list117 );
    expected_halt_reason = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list117 );
    tag = current.first();
    current = current.rest();
    if( NIL == current )
    {
      query_properties2 = janus.dwim_janus_query_properties( query_properties2 );
      return Values.values( sentence2, mt2, query_properties2 );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list117 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 46339L)
  public static SubLObject kbq_possibly_apply_substitutions(final SubLObject substitutions, SubLObject sentence, SubLObject mt, SubLObject query_properties)
  {
    if( NIL != substitutions )
    {
      sentence = cycl_utilities.expression_sublis( substitutions, sentence, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      mt = cycl_utilities.expression_sublis( substitutions, mt, Symbols.symbol_function( EQUAL ), UNPROVIDED );
      query_properties = conses_high.sublis( substitutions, query_properties, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    return Values.values( sentence, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 46747L)
  public static SubLObject query_fn_term_to_new_cyc_query_arguments(final SubLObject query_fn_term)
  {
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.nat_args( query_fn_term, UNPROVIDED );
    final SubLObject quoted_sentence = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list118 );
    current = current.rest();
    final SubLObject cycl_parameters = current.isCons() ? current.first() : $const76$TheEmptySet;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list118 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject sentence = czer_main.unquote_quoted_term( quoted_sentence, UNPROVIDED );
      SubLObject tuples = Mapping.mapcar( Symbols.symbol_function( $sym119$EL_LIST_ITEMS ), el_utilities.extensional_set_elements( cycl_parameters ) );
      final SubLObject mt = conses_high.second( conses_high.assoc( $const17$InferenceMicrotheoryParameter, tuples, UNPROVIDED, UNPROVIDED ) );
      tuples = list_utilities.alist_delete( tuples, $const13$InferenceSentenceParameter, UNPROVIDED );
      tuples = list_utilities.alist_delete( tuples, $const17$InferenceMicrotheoryParameter, UNPROVIDED );
      final SubLObject query_properties = kb_inference_params_to_query_properties( tuples );
      return Values.values( sentence, mt, query_properties );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list118 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 47874L)
  public static SubLObject predicate_query_fn_term_to_new_cyc_query_arguments(final SubLObject predicate_query_fn_term)
  {
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.nat_args( predicate_query_fn_term, UNPROVIDED );
    SubLObject kappa_predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
    kappa_predicate = current.first();
    current = current.rest();
    final SubLObject cycl_parameters = current.isCons() ? current.first() : $const76$TheEmptySet;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list120 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject query_free_variables = cycl_utilities.nat_arg1( kappa_predicate, UNPROVIDED );
      final SubLObject sentence = cycl_utilities.nat_arg2( kappa_predicate, UNPROVIDED );
      SubLObject tuples = Mapping.mapcar( Symbols.symbol_function( $sym119$EL_LIST_ITEMS ), el_utilities.extensional_set_elements( cycl_parameters ) );
      final SubLObject mt = conses_high.second( conses_high.assoc( $const17$InferenceMicrotheoryParameter, tuples, UNPROVIDED, UNPROVIDED ) );
      tuples = list_utilities.alist_delete( tuples, $const13$InferenceSentenceParameter, UNPROVIDED );
      tuples = list_utilities.alist_delete( tuples, $const17$InferenceMicrotheoryParameter, UNPROVIDED );
      final SubLObject query_properties = kb_inference_params_to_query_properties( tuples );
      return Values.values( sentence, mt, query_properties );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list120 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 49214L)
  public static SubLObject kbq_inference_parameter_from_keyword(final SubLObject keyword)
  {
    assert NIL != Types.keywordp( keyword ) : keyword;
    return parameter_specification_utilities.parameter_from_keyword( keyword, $const122$InferenceParameter );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 49574L)
  public static SubLObject kbq_keyword_from_inference_parameter(final SubLObject parameter)
  {
    assert NIL != forts.fort_p( parameter ) : parameter;
    return parameter_specification_utilities.keyword_from_parameter( parameter );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 49715L)
  public static SubLObject kbq_hl_support_module_from_keyword(final SubLObject keyword)
  {
    assert NIL != Types.keywordp( keyword ) : keyword;
    return subl_identifier.cyc_entity_from_sublid( keyword, $const123$CycHLSupportModule );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 49942L)
  public static SubLObject kbq_keyword_from_hl_support_module(final SubLObject module)
  {
    assert NIL != constant_handles.constant_p( module ) : module;
    return subl_identifier.sublid_from_cyc_entity( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 50076L)
  public static SubLObject kbq_kb_tv_from_hl_tv(final SubLObject identifier)
  {
    assert NIL != Types.keywordp( identifier ) : identifier;
    return subl_identifier.cyc_entity_from_sublid( identifier, $const125$CycHLTruthValue );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 50291L)
  public static SubLObject kbq_hl_tv_from_kb_tv(final SubLObject fort)
  {
    assert NIL != forts.fort_p( fort ) : fort;
    return subl_identifier.sublid_from_cyc_entity( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 50401L)
  public static SubLObject kbq_convert_time_to_seconds(final SubLObject value)
  {
    if( value.isInteger() )
    {
      return value;
    }
    if( NIL == el_utilities.possibly_naut_p( value ) )
    {
      return NIL;
    }
    final SubLObject unit = cycl_utilities.nat_arg0( value );
    final SubLObject quantity = cycl_utilities.nat_arg1( value, UNPROVIDED );
    SubLObject seconds = NIL;
    if( unit.eql( $const126$SecondsDuration ) )
    {
      return quantity;
    }
    if( NIL != quantities.comparable_units( $const126$SecondsDuration, unit ) )
    {
      seconds = quantities.convert_to_units( $const126$SecondsDuration, unit, quantity, UNPROVIDED );
    }
    if( NIL == seconds )
    {
      Errors.error( $str127$Unit__A_can_t_be_converted_to_sec, unit );
    }
    return seconds;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/kb-query.lisp", position = 51076L)
  public static SubLObject kbq_convert_seconds_to_kb_time(final SubLObject integer)
  {
    assert NIL != Types.integerp( integer ) : integer;
    return el_utilities.make_formula( $const126$SecondsDuration, ConsesLow.list( integer ), UNPROVIDED );
  }

  public static SubLObject declare_kb_query_file()
  {
    SubLFiles.declareFunction( me, "kbq_query_spec_p", "KBQ-QUERY-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_assert_query_spec_definition", "KBQ-ASSERT-QUERY-SPEC-DEFINITION", 7, 0, false );
    SubLFiles.declareFunction( me, "kbq_assert", "KBQ-ASSERT", 2, 1, false );
    SubLFiles.declareFunction( me, "update_kbq_definition", "UPDATE-KBQ-DEFINITION", 3, 4, false );
    SubLFiles.declareFunction( me, "update_kbq_definition_silent", "UPDATE-KBQ-DEFINITION-SILENT", 3, 4, false );
    SubLFiles.declareFunction( me, "kbq_ensure_query_spec_definition", "KBQ-ENSURE-QUERY-SPEC-DEFINITION", 7, 0, false );
    SubLFiles.declareFunction( me, "kbq_current_query_spec_assertions_for_parameter", "KBQ-CURRENT-QUERY-SPEC-ASSERTIONS-FOR-PARAMETER", 2, 0, false );
    SubLFiles.declareFunction( me, "kbq_ensure_query_spec_sentence", "KBQ-ENSURE-QUERY-SPEC-SENTENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "kbq_assert_query_spec_sentence", "KBQ-ASSERT-QUERY-SPEC-SENTENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "kbq_assertible_query_spec_sentence", "KBQ-ASSERTIBLE-QUERY-SPEC-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "kbq_askable_query_spec_sentence", "KBQ-ASKABLE-QUERY-SPEC-SENTENCE", 2, 1, false );
    SubLFiles.declareFunction( me, "kbq_ensure_query_spec_mt", "KBQ-ENSURE-QUERY-SPEC-MT", 3, 0, false );
    SubLFiles.declareFunction( me, "kbq_assert_query_spec_mt", "KBQ-ASSERT-QUERY-SPEC-MT", 3, 0, false );
    SubLFiles.declareFunction( me, "kbq_ensure_query_spec_inference_parameter_value", "KBQ-ENSURE-QUERY-SPEC-INFERENCE-PARAMETER-VALUE", 4, 0, false );
    SubLFiles.declareFunction( me, "kbq_assert_query_spec_inference_parameter_value", "KBQ-ASSERT-QUERY-SPEC-INFERENCE-PARAMETER-VALUE", 4, 0, false );
    SubLFiles.declareFunction( me, "kbq_assert_query_spec_inference_parameter_value_int", "KBQ-ASSERT-QUERY-SPEC-INFERENCE-PARAMETER-VALUE-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "kbq_ensure_query_spec_pragmatics", "KBQ-ENSURE-QUERY-SPEC-PRAGMATICS", 3, 0, false );
    SubLFiles.declareFunction( me, "kbq_assert_query_spec_pragmatics", "KBQ-ASSERT-QUERY-SPEC-PRAGMATICS", 3, 0, false );
    SubLFiles.declareFunction( me, "kbq_ensure_multiple_choice_option_spec", "KBQ-ENSURE-MULTIPLE-CHOICE-OPTION-SPEC", 3, 0, false );
    SubLFiles.declareFunction( me, "kbq_assert_multiple_choice_option_spec", "KBQ-ASSERT-MULTIPLE-CHOICE-OPTION-SPEC", 3, 0, false );
    SubLFiles.declareFunction( me, "kbq_ensure_query_spec_comments", "KBQ-ENSURE-QUERY-SPEC-COMMENTS", 3, 0, false );
    SubLFiles.declareFunction( me, "kbq_assert_query_spec_comment", "KBQ-ASSERT-QUERY-SPEC-COMMENT", 3, 0, false );
    SubLFiles.declareFunction( me, "kbq_assert_template_definition", "KBQ-ASSERT-TEMPLATE-DEFINITION", 5, 0, false );
    SubLFiles.declareFunction( me, "kbq_ensure_template_definition", "KBQ-ENSURE-TEMPLATE-DEFINITION", 5, 0, false );
    SubLFiles.declareFunction( me, "kbq_ensure_template_glosses", "KBQ-ENSURE-TEMPLATE-GLOSSES", 3, 0, false );
    SubLFiles.declareFunction( me, "kbq_assert_template_gloss", "KBQ-ASSERT-TEMPLATE-GLOSS", 3, 0, false );
    SubLFiles.declareFunction( me, "kbq_ensure_template_folders", "KBQ-ENSURE-TEMPLATE-FOLDERS", 2, 0, false );
    SubLFiles.declareFunction( me, "kbq_assert_template_folder", "KBQ-ASSERT-TEMPLATE-FOLDER", 3, 0, false );
    SubLFiles.declareFunction( me, "kbq_sentences", "KBQ-SENTENCES", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_sentence", "KBQ-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "query_from_template_sentences", "QUERY-FROM-TEMPLATE-SENTENCES", 2, 0, false );
    SubLFiles.declareFunction( me, "perform_query_from_template_substitutions", "PERFORM-QUERY-FROM-TEMPLATE-SUBSTITUTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "query_from_template_mts", "QUERY-FROM-TEMPLATE-MTS", 2, 0, false );
    SubLFiles.declareFunction( me, "query_from_template_inference_params", "QUERY-FROM-TEMPLATE-INFERENCE-PARAMS", 2, 0, false );
    SubLFiles.declareFunction( me, "kbq_sentence_closedP", "KBQ-SENTENCE-CLOSED?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_sentence_openP", "KBQ-SENTENCE-OPEN?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_pragmatics", "KBQ-PRAGMATICS", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_mts", "KBQ-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_mt", "KBQ-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_canonical_mt", "KBQ-CANONICAL-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_comments", "KBQ-COMMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_template_glosses", "KBQ-TEMPLATE-GLOSSES", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_template", "KBQ-TEMPLATE", 1, 0, false );
    SubLFiles.declareFunction( me, "template_folders", "TEMPLATE-FOLDERS", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_query_properties", "KBQ-QUERY-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "use_kbq_practice_rulesP", "USE-KBQ-PRACTICE-RULES?", 0, 0, false );
    SubLFiles.declareFunction( me, "overriding_query_practice_rules_properties", "OVERRIDING-QUERY-PRACTICE-RULES-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_query_property_value_from_keyword", "KBQ-QUERY-PROPERTY-VALUE-FROM-KEYWORD", 2, 0, false );
    SubLFiles.declareFunction( me, "kbq_allowed_rules", "KBQ-ALLOWED-RULES", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_default_defining_mt", "KBQ-DEFAULT-DEFINING-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "kbq_defining_mt", "KBQ-DEFINING-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "multiple_choice_testP", "MULTIPLE-CHOICE-TEST?", 1, 0, false );
    SubLFiles.declareFunction( me, "multiple_choice_queryP", "MULTIPLE-CHOICE-QUERY?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_multiple_choice_option_specs", "KBQ-MULTIPLE-CHOICE-OPTION-SPECS", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_multiple_choice_option_spec", "KBQ-MULTIPLE-CHOICE-OPTION-SPEC", 2, 0, false );
    SubLFiles.declareFunction( me, "kbq_multiple_choice_option_specs_int", "KBQ-MULTIPLE-CHOICE-OPTION-SPECS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "kbq_assert_query_spec_inference_parameters", "KBQ-ASSERT-QUERY-SPEC-INFERENCE-PARAMETERS", 3, 0, false );
    SubLFiles.declareFunction( me, "kb_inference_params_to_query_properties", "KB-INFERENCE-PARAMS-TO-QUERY-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_parse_kb_inference_parameter_value", "KBQ-PARSE-KB-INFERENCE-PARAMETER-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "kbq_encode_kb_inference_parameter_value", "KBQ-ENCODE-KB-INFERENCE-PARAMETER-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "kbq_inference_params", "KBQ-INFERENCE-PARAMS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_mode_parameter_specification_tuple", "INFERENCE-MODE-PARAMETER-SPECIFICATION-TUPLE", 1, 0, false );
    SubLFiles.declareFunction( me, "make_inference_mode_parameter_tuple", "MAKE-INFERENCE-MODE-PARAMETER-TUPLE", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_cyclist", "KBQ-CYCLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_runnableP", "KBQ-RUNNABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_known_unrunnableP", "KBQ-KNOWN-UNRUNNABLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "why_not_kbq_valid", "WHY-NOT-KBQ-VALID", 1, 1, false );
    SubLFiles.declareFunction( me, "kbq_removal_only_queryP", "KBQ-REMOVAL-ONLY-QUERY?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_transformation_queryP", "KBQ-TRANSFORMATION-QUERY?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_trivial_queryP", "KBQ-TRIVIAL-QUERY?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_simple_queryP", "KBQ-SIMPLE-QUERY?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_shallow_queryP", "KBQ-SHALLOW-QUERY?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_deep_queryP", "KBQ-DEEP-QUERY?", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_conditional_queryP", "KBQ-CONDITIONAL-QUERY?", 1, 0, false );
    SubLFiles.declareFunction( me, "new_continuable_inference_from_kbq", "NEW-CONTINUABLE-INFERENCE-FROM-KBQ", 1, 2, false );
    SubLFiles.declareFunction( me, "new_removal_ask_from_kbq", "NEW-REMOVAL-ASK-FROM-KBQ", 2, 1, false );
    SubLFiles.declareFunction( me, "removal_ask_compute_metrics", "REMOVAL-ASK-COMPUTE-METRICS", 4, 0, false );
    SubLFiles.declareFunction( me, "continue_inference_from_kbq", "CONTINUE-INFERENCE-FROM-KBQ", 2, 1, false );
    SubLFiles.declareFunction( me, "new_cyc_query_from_kbq", "NEW-CYC-QUERY-FROM-KBQ", 1, 2, false );
    SubLFiles.declareFunction( me, "ask_multiple_choice_query_from_kbq", "ASK-MULTIPLE-CHOICE-QUERY-FROM-KBQ", 1, 1, false );
    SubLFiles.declareFunction( me, "cache_kbq_extent", "CACHE-KBQ-EXTENT", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_query_arguments", "KBQ-QUERY-ARGUMENTS", 1, 1, false );
    SubLFiles.declareFunction( me, "kbq_possibly_apply_substitutions", "KBQ-POSSIBLY-APPLY-SUBSTITUTIONS", 4, 0, false );
    SubLFiles.declareFunction( me, "query_fn_term_to_new_cyc_query_arguments", "QUERY-FN-TERM-TO-NEW-CYC-QUERY-ARGUMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "predicate_query_fn_term_to_new_cyc_query_arguments", "PREDICATE-QUERY-FN-TERM-TO-NEW-CYC-QUERY-ARGUMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_inference_parameter_from_keyword", "KBQ-INFERENCE-PARAMETER-FROM-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_keyword_from_inference_parameter", "KBQ-KEYWORD-FROM-INFERENCE-PARAMETER", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_hl_support_module_from_keyword", "KBQ-HL-SUPPORT-MODULE-FROM-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_keyword_from_hl_support_module", "KBQ-KEYWORD-FROM-HL-SUPPORT-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_kb_tv_from_hl_tv", "KBQ-KB-TV-FROM-HL-TV", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_hl_tv_from_kb_tv", "KBQ-HL-TV-FROM-KB-TV", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_convert_time_to_seconds", "KBQ-CONVERT-TIME-TO-SECONDS", 1, 0, false );
    SubLFiles.declareFunction( me, "kbq_convert_seconds_to_kb_time", "KBQ-CONVERT-SECONDS-TO-KB-TIME", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_kb_query_file()
  {
    $transcript_kbq_definition_assertionsP$ = SubLFiles.defparameter( "*TRANSCRIPT-KBQ-DEFINITION-ASSERTIONS?*", T );
    $use_kbq_practice_rulesP$ = SubLFiles.defparameter( "*USE-KBQ-PRACTICE-RULES?*", NIL );
    return NIL;
  }

  public static SubLObject setup_kb_query_file()
  {
    access_macros.register_external_symbol( $sym7$UPDATE_KBQ_DEFINITION );
    access_macros.register_external_symbol( $sym9$UPDATE_KBQ_DEFINITION_SILENT );
    access_macros.register_external_symbol( $sym63$KBQ_QUERY_PROPERTIES );
    generic_testing.define_test_case_table_int( $sym128$KBQ_PARSE_KB_INFERENCE_PARAMETER_VALUE, ConsesLow.list( new SubLObject[] { $kw129$TEST, NIL, $kw130$OWNER, NIL, $kw131$CLASSES, NIL, $kw132$KB, $kw133$FULL,
      $kw134$WORKING_, T
    } ), $list135 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kb_query_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kb_query_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kb_query_file();
  }
  static
  {
    me = new kb_query();
    $transcript_kbq_definition_assertionsP$ = null;
    $use_kbq_practice_rulesP$ = null;
    $const0$CycLQuerySpecification = constant_handles.reader_make_constant_shell( makeString( "CycLQuerySpecification" ) );
    $sym1$CYCL_SENTENCE_P = makeSymbol( "CYCL-SENTENCE-P" );
    $sym2$POSSIBLY_MT_P = makeSymbol( "POSSIBLY-MT-P" );
    $sym3$QUERY_PROPERTIES_P = makeSymbol( "QUERY-PROPERTIES-P" );
    $const4$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list5 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MultipleChoiceQuerySpecification" ) ) );
    $list6 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycLQuerySpecification" ) ) );
    $sym7$UPDATE_KBQ_DEFINITION = makeSymbol( "UPDATE-KBQ-DEFINITION" );
    $const8$TestVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "TestVocabularyMt" ) );
    $sym9$UPDATE_KBQ_DEFINITION_SILENT = makeSymbol( "UPDATE-KBQ-DEFINITION-SILENT" );
    $sym10$_EXIT = makeSymbol( "%EXIT" );
    $sym11$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const12$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const13$InferenceSentenceParameter = constant_handles.reader_make_constant_shell( makeString( "InferenceSentenceParameter" ) );
    $const14$sentenceParameterValueInSpecifica = constant_handles.reader_make_constant_shell( makeString( "sentenceParameterValueInSpecification" ) );
    $kw15$GAF = makeKeyword( "GAF" );
    $kw16$TRUE = makeKeyword( "TRUE" );
    $const17$InferenceMicrotheoryParameter = constant_handles.reader_make_constant_shell( makeString( "InferenceMicrotheoryParameter" ) );
    $const18$microtheoryParameterValueInSpecif = constant_handles.reader_make_constant_shell( makeString( "microtheoryParameterValueInSpecification" ) );
    $const19$InferenceModeParameter = constant_handles.reader_make_constant_shell( makeString( "InferenceModeParameter" ) );
    $const20$inferenceModeParameterValueInSpec = constant_handles.reader_make_constant_shell( makeString( "inferenceModeParameterValueInSpecification" ) );
    $const21$softwareParameterValueInSpecifica = constant_handles.reader_make_constant_shell( makeString( "softwareParameterValueInSpecification" ) );
    $const22$ist_Asserted = constant_handles.reader_make_constant_shell( makeString( "ist-Asserted" ) );
    $const23$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $const24$Quote = constant_handles.reader_make_constant_shell( makeString( "Quote" ) );
    $const25$EscapeQuote = constant_handles.reader_make_constant_shell( makeString( "EscapeQuote" ) );
    $str26$Inference_Parameter__S_unknown_by = makeString( "Inference Parameter ~S unknown by the KB." );
    $const27$InferenceAllowedRulesParameter = constant_handles.reader_make_constant_shell( makeString( "InferenceAllowedRulesParameter" ) );
    $const28$queryPracticeRules = constant_handles.reader_make_constant_shell( makeString( "queryPracticeRules" ) );
    $kw29$NON_EXPLANATORY_SENTENCE = makeKeyword( "NON-EXPLANATORY-SENTENCE" );
    $list30 = ConsesLow.list( makeSymbol( "OPTION-NUM" ), makeSymbol( "FULL-LABEL" ), makeSymbol( "INDEX-LABEL" ), makeSymbol( "PAYLOAD" ) );
    $sym31$INTEGERP = makeSymbol( "INTEGERP" );
    $sym32$STRINGP = makeSymbol( "STRINGP" );
    $sym33$KB_SET_OF_BINDING_SETS_P = makeSymbol( "KB-SET-OF-BINDING-SETS-P" );
    $const34$MCQuestionNthOptionFn = constant_handles.reader_make_constant_shell( makeString( "MCQuestionNthOptionFn" ) );
    $const35$multipleChoiceOptionFullLabel = constant_handles.reader_make_constant_shell( makeString( "multipleChoiceOptionFullLabel" ) );
    $const36$multipleChoiceOptionIndexLabel = constant_handles.reader_make_constant_shell( makeString( "multipleChoiceOptionIndexLabel" ) );
    $const37$multipleChoiceOptionPayload = constant_handles.reader_make_constant_shell( makeString( "multipleChoiceOptionPayload" ) );
    $const38$comment = constant_handles.reader_make_constant_shell( makeString( "comment" ) );
    $list39 = ConsesLow.list( makeSymbol( "COMMENT" ) );
    $str40$The_template___A__passed_for_the_ = makeString( "The template, ~A, passed for the query spec, ~A, is not the one known in the KB (~A)." );
    $const41$TemplateFromTestQueryFn = constant_handles.reader_make_constant_shell( makeString( "TemplateFromTestQueryFn" ) );
    $list42 = ConsesLow.list( makeSymbol( "FOLDER" ), makeSymbol( "MT" ) );
    $const43$formulaTemplateGloss = constant_handles.reader_make_constant_shell( makeString( "formulaTemplateGloss" ) );
    $const44$folderContainsResource = constant_handles.reader_make_constant_shell( makeString( "folderContainsResource" ) );
    $list45 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QueryFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "QUOTED-SENTENCE" ) ), makeKeyword( "ANYTHING" ) );
    $sym46$QUOTED_SENTENCE = makeSymbol( "QUOTED-SENTENCE" );
    $list47 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QueryFromTemplateFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "QUESTION-TEMPLATE" ) ), ConsesLow.list( makeKeyword(
        "BIND" ), makeSymbol( "EL-SUBSTITUTIONS" ) ) );
    $sym48$EL_SUBSTITUTIONS = makeSymbol( "EL-SUBSTITUTIONS" );
    $sym49$QUESTION_TEMPLATE = makeSymbol( "QUESTION-TEMPLATE" );
    $str50$The_query_specification___A__has_ = makeString( "The query specification, ~A, has no #$InferenceSentenceParameter." );
    $str51$The_query_specification___A__has_ = makeString( "The query specification, ~A, has more than one #$InferenceSentenceParameter." );
    $const52$cycLPattern = constant_handles.reader_make_constant_shell( makeString( "cycLPattern" ) );
    $const53$metaTemplate = constant_handles.reader_make_constant_shell( makeString( "metaTemplate" ) );
    $list54 = ConsesLow.list( makeSymbol( "TEMPLATE-TERM" ), makeSymbol( "ACTUAL-TERM" ) );
    $const55$QuestionSuggestionTemplate_Single = constant_handles.reader_make_constant_shell( makeString( "QuestionSuggestionTemplate-SingleOption" ) );
    $const56$questionTemplateInstantiations = constant_handles.reader_make_constant_shell( makeString( "questionTemplateInstantiations" ) );
    $const57$InferenceNonExplanatorySentencePa = constant_handles.reader_make_constant_shell( makeString( "InferenceNonExplanatorySentenceParameter" ) );
    $list58 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QueryFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Quote" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "ist" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "MT" ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "ANYTHING" ) );
    $sym59$MT = makeSymbol( "MT" );
    $const60$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $str61$The_query_specification___A__has_ = makeString( "The query specification, ~A, has more than one #$InferenceMicrotheoryParameter." );
    $const62$querySpecificationForFormulaTempl = constant_handles.reader_make_constant_shell( makeString( "querySpecificationForFormulaTemplate" ) );
    $sym63$KBQ_QUERY_PROPERTIES = makeSymbol( "KBQ-QUERY-PROPERTIES" );
    $kw64$ALLOWED_RULES = makeKeyword( "ALLOWED-RULES" );
    $sym65$QUERY_PROPERTY_P = makeSymbol( "QUERY-PROPERTY-P" );
    $const66$MultipleChoiceKBContentTest = constant_handles.reader_make_constant_shell( makeString( "MultipleChoiceKBContentTest" ) );
    $const67$MultipleChoiceQuerySpecification = constant_handles.reader_make_constant_shell( makeString( "MultipleChoiceQuerySpecification" ) );
    $sym68$KBQ_QUERY_SPEC_P = makeSymbol( "KBQ-QUERY-SPEC-P" );
    $const69$mcQuestionNthOption = constant_handles.reader_make_constant_shell( makeString( "mcQuestionNthOption" ) );
    $sym70$SAFE__ = makeSymbol( "SAFE-<" );
    $sym71$FIRST = makeSymbol( "FIRST" );
    $list72 = ConsesLow.list( makeSymbol( "PARAMETER" ), makeSymbol( "KB-VALUE" ) );
    $kw73$MAX_TIME = makeKeyword( "MAX-TIME" );
    $kw74$FORWARD_MAX_TIME = makeKeyword( "FORWARD-MAX-TIME" );
    $kw75$IGNORE = makeKeyword( "IGNORE" );
    $const76$TheEmptySet = constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) );
    $kw77$RESULT_UNIQUENESS = makeKeyword( "RESULT-UNIQUENESS" );
    $kw78$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $kw79$MAX_PROOF_DEPTH = makeKeyword( "MAX-PROOF-DEPTH" );
    $kw80$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw81$METRICS = makeKeyword( "METRICS" );
    $sym82$FORT_P = makeSymbol( "FORT-P" );
    $const83$TestQueryFn = constant_handles.reader_make_constant_shell( makeString( "TestQueryFn" ) );
    $kw84$SEVERE = makeKeyword( "SEVERE" );
    $const85$UnrunnableQuery = constant_handles.reader_make_constant_shell( makeString( "UnrunnableQuery" ) );
    $const86$QueryFn = constant_handles.reader_make_constant_shell( makeString( "QueryFn" ) );
    $list87 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "SENTENCE" ), makeSymbol( "PARAMETERS" ), makeSymbol( "&REST" ), makeSymbol( "REST" ) );
    $str88$___A_has_no_query_sentence_ = makeString( "~%~A has no query sentence." );
    $kw89$NO_QUERY_SENTENCE = makeKeyword( "NO-QUERY-SENTENCE" );
    $str90$___A_has_too_many_arguments_ = makeString( "~%~A has too many arguments." );
    $kw91$TOO_MANY_ARGUMENTS = makeKeyword( "TOO-MANY-ARGUMENTS" );
    $str92$ = makeString( "" );
    $sym93$IST_SENTENCE_WITH_CHLMT_P = makeSymbol( "IST-SENTENCE-WITH-CHLMT-P" );
    $str94$___A_has_more_than_one_query_sent = makeString( "~%~A has more than one query sentence." );
    $kw95$MORE_THAN_ONE_QUERY_SENTENCE = makeKeyword( "MORE-THAN-ONE-QUERY-SENTENCE" );
    $str96$___A_has_no_query_Mt_ = makeString( "~%~A has no query Mt." );
    $kw97$NO_QUERY_MT = makeKeyword( "NO-QUERY-MT" );
    $str98$___A_has_more_than_one_query_Mt_ = makeString( "~%~A has more than one query Mt." );
    $kw99$MORE_THAN_ONE_QUERY_MT = makeKeyword( "MORE-THAN-ONE-QUERY-MT" );
    $kw100$TRANSFORMATION_ALLOWED_ = makeKeyword( "TRANSFORMATION-ALLOWED?" );
    $kw101$BINDINGS = makeKeyword( "BINDINGS" );
    $kw102$CONDITIONAL_SENTENCE_ = makeKeyword( "CONDITIONAL-SENTENCE?" );
    $sym103$PROPERTY_LIST_P = makeSymbol( "PROPERTY-LIST-P" );
    $sym104$REMOVAL_ASK_QUERY_PROPERTY_P = makeSymbol( "REMOVAL-ASK-QUERY-PROPERTY-P" );
    $list105 = ConsesLow.list( makeSymbol( "HL-MT" ), makeSymbol( "HL-SENTENCE" ) );
    $sym106$REMOVAL_ASK_QUERY_METRIC_P = makeSymbol( "REMOVAL-ASK-QUERY-METRIC-P" );
    $kw107$ANSWER_COUNT = makeKeyword( "ANSWER-COUNT" );
    $kw108$TIME_TO_FIRST_ANSWER = makeKeyword( "TIME-TO-FIRST-ANSWER" );
    $kw109$TIME_TO_LAST_ANSWER = makeKeyword( "TIME-TO-LAST-ANSWER" );
    $kw110$TOTAL_TIME = makeKeyword( "TOTAL-TIME" );
    $kw111$COMPLETE_TOTAL_TIME = makeKeyword( "COMPLETE-TOTAL-TIME" );
    $kw112$TIME_PER_ANSWER = makeKeyword( "TIME-PER-ANSWER" );
    $kw113$LATENCY_IMPROVEMENT_FROM_ITERATIVITY = makeKeyword( "LATENCY-IMPROVEMENT-FROM-ITERATIVITY" );
    $str114$time_to_implement_metric__S = makeString( "time to implement metric ~S" );
    $kw115$CACHE_INFERENCE_RESULTS_ = makeKeyword( "CACHE-INFERENCE-RESULTS?" );
    $list116 = ConsesLow.listS( constant_handles.reader_make_constant_shell( makeString( "PredicateQueryFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Kappa" ) ), makeKeyword(
        "ANYTHING" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "ANYTHING" ) );
    $list117 = ConsesLow.list( makeSymbol( "JANUS-OP" ), makeSymbol( "TYPE" ), makeSymbol( "SENTENCE" ), makeSymbol( "MT" ), makeSymbol( "QUERY-PROPERTIES" ), makeSymbol( "EXPECTED-RESULT" ), makeSymbol(
        "EXPECTED-HALT-REASON" ), makeSymbol( "TAG" ) );
    $list118 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "QUOTED-SENTENCE" ), ConsesLow.list( makeSymbol( "CYCL-PARAMETERS" ), constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) ) ) );
    $sym119$EL_LIST_ITEMS = makeSymbol( "EL-LIST-ITEMS" );
    $list120 = ConsesLow.list( makeSymbol( "KAPPA-PREDICATE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "CYCL-PARAMETERS" ), constant_handles.reader_make_constant_shell( makeString( "TheEmptySet" ) ) ) );
    $sym121$KEYWORDP = makeSymbol( "KEYWORDP" );
    $const122$InferenceParameter = constant_handles.reader_make_constant_shell( makeString( "InferenceParameter" ) );
    $const123$CycHLSupportModule = constant_handles.reader_make_constant_shell( makeString( "CycHLSupportModule" ) );
    $sym124$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $const125$CycHLTruthValue = constant_handles.reader_make_constant_shell( makeString( "CycHLTruthValue" ) );
    $const126$SecondsDuration = constant_handles.reader_make_constant_shell( makeString( "SecondsDuration" ) );
    $str127$Unit__A_can_t_be_converted_to_sec = makeString( "Unit ~A can't be converted to seconds." );
    $sym128$KBQ_PARSE_KB_INFERENCE_PARAMETER_VALUE = makeSymbol( "KBQ-PARSE-KB-INFERENCE-PARAMETER-VALUE" );
    $kw129$TEST = makeKeyword( "TEST" );
    $kw130$OWNER = makeKeyword( "OWNER" );
    $kw131$CLASSES = makeKeyword( "CLASSES" );
    $kw132$KB = makeKeyword( "KB" );
    $kw133$FULL = makeKeyword( "FULL" );
    $kw134$WORKING_ = makeKeyword( "WORKING?" );
    $list135 = ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "False" ) ), makeKeyword( "ALLOW-HL-PREDICATE-TRANSFORMATION?" ) ), NIL ), ConsesLow.list( ConsesLow
        .list( constant_handles.reader_make_constant_shell( makeString( "True" ) ), makeKeyword( "ALLOW-HL-PREDICATE-TRANSFORMATION?" ) ), T ), ConsesLow.list( ConsesLow.list( makeKeyword( "ALL" ), makeKeyword(
            "ALLOWED-RULES" ) ), makeKeyword( "ALL" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SubLQuoteFn" ) ), makeKeyword( "ALL" ) ), makeKeyword(
                "ALLOWED-RULES" ) ), makeKeyword( "ALL" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SubLQuoteFn" ) ), makeKeyword( "ALL" ) ),
                    makeKeyword( "EQUALITY-REASONING-DOMAIN" ) ), makeKeyword( "ALL" ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheList" ) ) ),
                        makeKeyword( "ALLOWED-RULES" ) ), NIL ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TheEmptyList" ) ), makeKeyword( "ALLOWED-RULES" ) ), NIL ) );
  }
}
/*
 *
 * Total time: 871 ms synthetic
 */