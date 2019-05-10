package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class mt_suggestor
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.mt_suggestor";
  public static final String myFingerPrint = "2c39bcf7f5a0e4e591febd0ea8e36fc5ed345f9a20939e3f88c6863a84bd2b62";
  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 2634L)
  public static SubLSymbol $mts_forbid_lexical_mts$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 2829L)
  public static SubLSymbol $mts_forbid_project_mts$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 3054L)
  public static SubLSymbol $mts_forbid_high_level_mts_for_content_assertions$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 4220L)
  private static SubLSymbol $predicate_determined_gaf_cutoff_percent$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 5053L)
  private static SubLSymbol $predicate_determined_gaf_cutoff_number$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 7065L)
  private static SubLSymbol $mtsugg_related_assertion_formulas_query_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 7370L)
  private static SubLSymbol $mtsugg_related_assertion_formulas_query_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 11075L)
  private static SubLSymbol $frequency_list_of_mts_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 16387L)
  private static SubLSymbol $mtsugg_too_general_term_filter$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 16676L)
  private static SubLSymbol $mtsugg_too_general_collection_filter$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 16783L)
  private static SubLSymbol $mtsugg_too_general_quoted_collection_filter$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 18977L)
  private static SubLSymbol $top_mt_percent_count_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 20289L)
  private static SubLSymbol $examination_formulas$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 21076L)
  private static SubLSymbol $examination_mts$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 21247L)
  private static SubLSymbol $mts_incorrect_formulas$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 21368L)
  private static SubLSymbol $mts_actual_mts$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 21530L)
  private static SubLSymbol $mts_guessed_mts$;
  private static final SubLSymbol $sym0$EL_FORMULA_P;
  private static final SubLSymbol $sym1$MTS_NOT_COMMONSENSE_MT_;
  private static final SubLSymbol $sym2$CAR;
  private static final SubLObject $const3$BaseKB;
  private static final SubLFloat $float4$0_8;
  private static final SubLObject $const5$BookkeepingMt;
  private static final SubLObject $const6$UniversalVocabularyMt;
  private static final SubLObject $const7$LexicalMicrotheory;
  private static final SubLObject $const8$ProjectMicrotheory;
  private static final SubLObject $const9$ApplicationContext;
  private static final SubLObject $const10$SourceMicrotheory;
  private static final SubLObject $const11$MappingMicrotheory;
  private static final SubLObject $const12$ProblemSolvingCntxt;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLSymbol $sym15$GAF_;
  private static final SubLSymbol $sym16$_X;
  private static final SubLSymbol $sym17$_MT;
  private static final SubLSymbol $kw18$IGNORE;
  private static final SubLObject $const19$ist_Asserted;
  private static final SubLSymbol $sym20$ASSERTION_MONAD_MT;
  private static final SubLInteger $int21$100;
  private static final SubLInteger $int22$10000;
  private static final SubLFloat $float23$0_5;
  private static final SubLFloat $float24$0_2;
  private static final SubLSymbol $sym25$FREQUENCY_LIST_OF_MTS;
  private static final SubLSymbol $sym26$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const27$EverythingPSC;
  private static final SubLSymbol $kw28$GAF;
  private static final SubLSymbol $kw29$RULE;
  private static final SubLSymbol $sym30$_FREQUENCY_LIST_OF_MTS_CACHING_STATE_;
  private static final SubLSymbol $sym31$MTS_TOO_GENERAL_;
  private static final SubLObject $const32$Dog;
  private static final SubLSymbol $sym33$MTS_TOO_GENERAL_LIGHT_FILTERING_;
  private static final SubLSymbol $sym34$CONS;
  private static final SubLSymbol $sym35$_;
  private static final SubLSymbol $sym36$CADDR;
  private static final SubLSymbol $sym37$CADR;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLList $list40;
  private static final SubLObject $const41$MetaRelation;
  private static final SubLObject $const42$CoreConstant;
  private static final SubLObject $const43$KEFacilitationPredicate;
  private static final SubLInteger $int44$20000;
  private static final SubLSymbol $sym45$RELEVANT_MT_IS_ANY_MT;
  private static final SubLSymbol $sym46$ASSERTION_MT;
  private static final SubLSymbol $sym47$TOP_MT_PERCENT_COUNT;
  private static final SubLSymbol $sym48$_;
  private static final SubLSymbol $sym49$CDR;
  private static final SubLSymbol $sym50$_TOP_MT_PERCENT_COUNT_CACHING_STATE_;
  private static final SubLInteger $int51$25;
  private static final SubLSymbol $sym52$LISTP;
  private static final SubLSymbol $sym53$ATOM;
  private static final SubLSymbol $sym54$LAST;
  private static final SubLList $list55;
  private static final SubLString $str56$Running_test__;
  private static final SubLString $str57$_RESULTS__;
  private static final SubLString $str58$Incorrect_Formula__;
  private static final SubLString $str59$Suggested_Mt__;
  private static final SubLString $str60$Actual_Mt__;
  private static final SubLString $str61$Frequency_list_of_suggested_mts__;
  private static final SubLString $str62$Frequency_list_of_actual_mts__;
  private static final SubLObject $const63$SAICLegacyAssertionsMt;
  private static final SubLObject $const64$PredicatePopulationMt;
  private static final SubLObject $const65$TestVocabularyMt;
  private static final SubLObject $const66$MotleyFoolUKGlossaryMt;
  private static final SubLObject $const67$WebSearchEnhancementMt;
  private static final SubLObject $const68$DesertShieldMt;
  private static final SubLObject $const69$OilEconModelMt;
  private static final SubLObject $const70$Y2Scenario_Stage1Mt;
  private static final SubLObject $const71$BeachWalkIMt;
  private static final SubLObject $const72$PQ204Mt;
  private static final SubLObject $const73$isa;
  private static final SubLObject $const74$genls;
  private static final SubLObject $const75$MetaPredicate;
  private static final SubLObject $const76$RuleMacroPredicate;
  private static final SubLObject $const77$BiologyMt;
  private static final SubLObject $const78$ModernMilitaryTacticsMt;
  private static final SubLObject $const79$HumanSocialLifeMt;
  private static final SubLObject $const80$ChemistryMt;
  private static final SubLObject $const81$EnglishLexiconMt;
  private static final SubLObject $const82$EnglishParaphraseMt;
  private static final SubLObject $const83$LogicalTruthMt;
  private static final SubLObject $const84$LogicalTruthImplementationMt;
  private static final SubLObject $const85$CoreCycLMt;
  private static final SubLString $str86$Trying_Formula__;
  private static final SubLString $str87$Got_;
  private static final SubLString $str88$_out_of_;
  private static final SubLSymbol $kw89$MT;
  private static final SubLSymbol $kw90$BROAD_MT;
  private static final SubLSymbol $kw91$MAPPING_DONE;
  private static final SubLString $str92$do_broad_mt_index;
  private static final SubLSymbol $sym93$STRINGP;
  private static final SubLSymbol $kw94$SKIP;
  private static final SubLInteger $int95$100000;
  private static final SubLObject $const96$InferencePSC;

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 3251L)
  public static SubLObject suggest_mt(final SubLObject formula)
  {
    assert NIL != el_utilities.el_formula_p( formula ) : formula;
    if( NIL != el_utilities.gafP( formula ) )
    {
      return suggest_mt_for_gaf( formula );
    }
    return suggest_mt_by_content( formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 3556L)
  public static SubLObject suggest_mt_by_content(final SubLObject formula)
  {
    final SubLObject data = mts_get_summed_data( formula );
    final SubLObject filtered = Sequences.remove_if( $sym1$MTS_NOT_COMMONSENSE_MT_, data, $sym2$CAR, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject just_mts = Mapping.mapcar( $sym2$CAR, filtered );
    return ( NIL == just_mts ) ? $const3$BaseKB : just_mts.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 5119L)
  public static SubLObject suggest_mt_for_gaf(final SubLObject gaf)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_list_with_count = mt_list_from_related( gaf );
    final SubLObject mt_list = Mapping.mapcar( $sym2$CAR, mt_list_with_count );
    if( NIL != mt_list_with_count && THREE_INTEGER.numL( conses_high.cdar( mt_list_with_count ) ) )
    {
      return mt_list.first();
    }
    final SubLObject predicate_results = top_mt_percent_count( gaf.first(), UNPROVIDED );
    if( NIL != predicate_results && conses_high.second( predicate_results ).numG( $predicate_determined_gaf_cutoff_percent$.getDynamicValue( thread ) ) && conses_high.third( predicate_results ).numG(
        $predicate_determined_gaf_cutoff_number$.getDynamicValue( thread ) ) )
    {
      return predicate_results.first();
    }
    return suggest_mt_by_content( gaf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 5904L)
  public static SubLObject mts_not_commonsense_mtP(final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( mt.equal( $const5$BookkeepingMt ) || ( NIL != $mts_forbid_high_level_mts_for_content_assertions$.getDynamicValue( thread ) && mt.equal( $const3$BaseKB ) )
        || ( NIL != $mts_forbid_high_level_mts_for_content_assertions$.getDynamicValue( thread ) && mt.equal( $const6$UniversalVocabularyMt ) ) || ( NIL != $mts_forbid_lexical_mts$.getDynamicValue( thread ) && NIL != isa
            .isaP( mt, $const7$LexicalMicrotheory, UNPROVIDED, UNPROVIDED ) ) || ( NIL != $mts_forbid_project_mts$.getDynamicValue( thread ) && NIL != likely_project_related_assertionP( mt ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 6585L)
  public static SubLObject likely_project_related_assertionP(final SubLObject mt)
  {
    return makeBoolean( NIL == constant_handles.constant_p( mt ) || NIL != isa.isa_in_any_mtP( mt, $const8$ProjectMicrotheory ) || ( NIL != isa.isa_in_any_mtP( mt, $const9$ApplicationContext ) && NIL == isa.isaP( mt,
        $const7$LexicalMicrotheory, UNPROVIDED, UNPROVIDED ) ) || NIL != isa.isaP( mt, $const10$SourceMicrotheory, UNPROVIDED, UNPROVIDED ) || NIL != isa.isaP( mt, $const11$MappingMicrotheory, UNPROVIDED, UNPROVIDED )
        || NIL != isa.isaP( mt, $const12$ProblemSolvingCntxt, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 7527L)
  public static SubLObject mtsugg_get_related_assertions(final SubLObject formula)
  {
    assert NIL != el_utilities.gafP( formula ) : formula;
    if( arity.arity( cycl_utilities.formula_arg0( formula ) ).numL( TWO_INTEGER ) )
    {
      return NIL;
    }
    final SubLObject missing_term = $sym16$_X;
    final SubLObject mt_term = $sym17$_MT;
    SubLObject answers = NIL;
    SubLObject query_formula = NIL;
    SubLObject term_num = ZERO_INTEGER;
    SubLObject cdolist_list_var;
    final SubLObject args = cdolist_list_var = cycl_utilities.formula_args( formula, $kw18$IGNORE );
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      term_num = Numbers.add( term_num, ONE_INTEGER );
      query_formula = conses_high.copy_tree( formula );
      ConsesLow.set_nth( term_num, query_formula, missing_term );
      SubLObject cdolist_list_var_$1;
      final SubLObject v_bindings = cdolist_list_var_$1 = inference_kernel.new_cyc_query( ConsesLow.list( $const19$ist_Asserted, mt_term, query_formula ), $mtsugg_related_assertion_formulas_query_mt$.getGlobalValue(),
          $mtsugg_related_assertion_formulas_query_properties$.getGlobalValue() );
      SubLObject binding = NIL;
      binding = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        final SubLObject related_formula = conses_high.copy_tree( formula );
        ConsesLow.set_nth( term_num, related_formula, bindings.variable_binding_value( bindings.get_variable_binding( missing_term, binding ) ) );
        final SubLObject mt = bindings.variable_binding_value( bindings.get_variable_binding( mt_term, binding ) );
        final SubLObject assertion = czer_meta.find_assertion_cycl( related_formula, mt );
        if( NIL != assertion_handles.assertion_p( assertion ) )
        {
          answers = ConsesLow.cons( assertion, answers );
        }
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        binding = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return answers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 9351L)
  public static SubLObject mt_list_from_related(final SubLObject formula)
  {
    assert NIL != el_utilities.gafP( formula ) : formula;
    final SubLObject assertions = mtsugg_get_related_assertions( formula );
    if( NIL != assertions )
    {
      final SubLObject mts = Mapping.mapcar( $sym20$ASSERTION_MONAD_MT, assertions );
      return number_utilities.get_sorted_frequency_list( mts );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 10008L)
  public static SubLObject mts_specificity_estimate(final SubLObject v_term)
  {
    final SubLObject generality = cardinality_estimates.generality_estimate( v_term );
    if( generality.numL( $int21$100 ) )
    {
      return ONE_INTEGER;
    }
    if( generality.numL( $int22$10000 ) )
    {
      return $float23$0_5;
    }
    return $float24$0_2;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 10331L)
  public static SubLObject frequency_list_of_mts_adjusted(final SubLObject v_term, SubLObject function_or_predicate, SubLObject rule_assertion)
  {
    if( function_or_predicate == UNPROVIDED )
    {
      function_or_predicate = NIL;
    }
    if( rule_assertion == UNPROVIDED )
    {
      rule_assertion = NIL;
    }
    final SubLObject freqlist = frequency_list_of_mts( v_term, function_or_predicate, rule_assertion );
    final SubLObject specificity = mts_specificity_estimate( v_term );
    SubLObject adjusted = NIL;
    SubLObject cdolist_list_var = freqlist;
    SubLObject pair = NIL;
    pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      adjusted = ConsesLow.cons( ConsesLow.cons( pair.first(), Numbers.multiply( pair.rest(), specificity ) ), adjusted );
      cdolist_list_var = cdolist_list_var.rest();
      pair = cdolist_list_var.first();
    }
    return Sequences.nreverse( adjusted );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 11075L)
  public static SubLObject clear_frequency_list_of_mts()
  {
    final SubLObject cs = $frequency_list_of_mts_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 11075L)
  public static SubLObject remove_frequency_list_of_mts(final SubLObject v_term, SubLObject function_or_predicate, SubLObject rule_assertion)
  {
    if( function_or_predicate == UNPROVIDED )
    {
      function_or_predicate = NIL;
    }
    if( rule_assertion == UNPROVIDED )
    {
      rule_assertion = NIL;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $frequency_list_of_mts_caching_state$.getGlobalValue(), ConsesLow.list( v_term, function_or_predicate, rule_assertion ), UNPROVIDED,
        UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 11075L)
  public static SubLObject frequency_list_of_mts_internal(final SubLObject v_term, final SubLObject function_or_predicate, final SubLObject rule_assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject mts = NIL;
    if( NIL != list_utilities.sublisp_boolean( function_or_predicate ) )
    {
      if( NIL != fort_types_interface.predicateP( v_term ) )
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym26$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const27$EverythingPSC, thread );
          if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( v_term ) )
          {
            final SubLObject str = NIL;
            final SubLObject _prev_bind_0_$2 = utilities_macros.$progress_start_time$.currentBinding( thread );
            final SubLObject _prev_bind_1_$3 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
            final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
            final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
            final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
            final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
            final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
            final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
            try
            {
              utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
              utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
              utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
              utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
              utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
              utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
              utilities_macros.$is_noting_progressP$.bind( T, thread );
              utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
              utilities_macros.noting_progress_preamble( str );
              final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( v_term );
              SubLObject done_var = NIL;
              final SubLObject token_var = NIL;
              while ( NIL == done_var)
              {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                if( NIL != valid )
                {
                  utilities_macros.note_progress();
                  SubLObject final_index_iterator = NIL;
                  try
                  {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw28$GAF, NIL, NIL );
                    SubLObject done_var_$4 = NIL;
                    final SubLObject token_var_$5 = NIL;
                    while ( NIL == done_var_$4)
                    {
                      final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
                      final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( gaf ) );
                      if( NIL != valid_$6 )
                      {
                        mts = ConsesLow.cons( hlmt.assertion_monad_mt( gaf ), mts );
                      }
                      done_var_$4 = makeBoolean( NIL == valid_$6 );
                    }
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$3, thread );
                    }
                  }
                }
                done_var = makeBoolean( NIL == valid );
              }
              utilities_macros.noting_progress_postamble();
            }
            finally
            {
              utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
              utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
              utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
              utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
              utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
              utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
              utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$3, thread );
              utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$2, thread );
            }
          }
          if( NIL != kb_mapping_macros.do_predicate_rule_index_key_validator( v_term, NIL, NIL ) )
          {
            final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator( v_term, NIL, NIL );
            SubLObject done_var2 = NIL;
            final SubLObject token_var2 = NIL;
            while ( NIL == done_var2)
            {
              final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper( iterator_var2, token_var2 );
              final SubLObject valid2 = makeBoolean( !token_var2.eql( final_index_spec2 ) );
              if( NIL != valid2 )
              {
                SubLObject final_index_iterator2 = NIL;
                try
                {
                  final_index_iterator2 = kb_mapping_macros.new_final_index_iterator( final_index_spec2, $kw29$RULE, NIL, NIL );
                  SubLObject done_var_$5 = NIL;
                  final SubLObject token_var_$6 = NIL;
                  while ( NIL == done_var_$5)
                  {
                    final SubLObject asst = iteration.iteration_next_without_values_macro_helper( final_index_iterator2, token_var_$6 );
                    final SubLObject valid_$7 = makeBoolean( !token_var_$6.eql( asst ) );
                    if( NIL != valid_$7 )
                    {
                      mts = ConsesLow.cons( hlmt.assertion_monad_mt( asst ), mts );
                    }
                    done_var_$5 = makeBoolean( NIL == valid_$7 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator2 )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator2 );
                    }
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
                  }
                }
              }
              done_var2 = makeBoolean( NIL == valid2 );
            }
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
      else
      {
        if( NIL == fort_types_interface.functionP( v_term ) )
        {
          return frequency_list_of_mts( v_term, NIL, UNPROVIDED );
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym26$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const27$EverythingPSC, thread );
          if( NIL != kb_mapping_macros.do_function_rule_index_key_validator( v_term, NIL ) )
          {
            final SubLObject iterator_var3 = kb_mapping_macros.new_function_rule_final_index_spec_iterator( v_term, NIL );
            SubLObject done_var3 = NIL;
            final SubLObject token_var3 = NIL;
            while ( NIL == done_var3)
            {
              final SubLObject final_index_spec3 = iteration.iteration_next_without_values_macro_helper( iterator_var3, token_var3 );
              final SubLObject valid3 = makeBoolean( !token_var3.eql( final_index_spec3 ) );
              if( NIL != valid3 )
              {
                SubLObject final_index_iterator3 = NIL;
                try
                {
                  final_index_iterator3 = kb_mapping_macros.new_final_index_iterator( final_index_spec3, $kw29$RULE, NIL, NIL );
                  SubLObject done_var_$6 = NIL;
                  final SubLObject token_var_$7 = NIL;
                  while ( NIL == done_var_$6)
                  {
                    final SubLObject asst2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator3, token_var_$7 );
                    final SubLObject valid_$8 = makeBoolean( !token_var_$7.eql( asst2 ) );
                    if( NIL != valid_$8 )
                    {
                      mts = ConsesLow.cons( hlmt.assertion_monad_mt( asst2 ), mts );
                    }
                    done_var_$6 = makeBoolean( NIL == valid_$8 );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values3 = Values.getValuesAsVector();
                    if( NIL != final_index_iterator3 )
                    {
                      kb_mapping_macros.destroy_final_index_iterator( final_index_iterator3 );
                    }
                    Values.restoreValuesFromVector( _values3 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
                  }
                }
              }
              done_var3 = makeBoolean( NIL == valid3 );
            }
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
      if( Sequences.length( mts ).numL( FOUR_INTEGER ) )
      {
        return frequency_list_of_mts( v_term, NIL, UNPROVIDED );
      }
    }
    else if( NIL != list_utilities.sublisp_boolean( rule_assertion ) )
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym26$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const27$EverythingPSC, thread );
        if( NIL != kb_mapping_macros.do_term_index_key_validator( v_term, NIL ) )
        {
          final SubLObject iterator_var3 = kb_mapping_macros.new_term_final_index_spec_iterator( v_term, NIL );
          SubLObject done_var3 = NIL;
          final SubLObject token_var3 = NIL;
          while ( NIL == done_var3)
          {
            final SubLObject final_index_spec3 = iteration.iteration_next_without_values_macro_helper( iterator_var3, token_var3 );
            final SubLObject valid3 = makeBoolean( !token_var3.eql( final_index_spec3 ) );
            if( NIL != valid3 )
            {
              SubLObject final_index_iterator3 = NIL;
              try
              {
                final_index_iterator3 = kb_mapping_macros.new_final_index_iterator( final_index_spec3, NIL, NIL, NIL );
                SubLObject done_var_$7 = NIL;
                final SubLObject token_var_$8 = NIL;
                while ( NIL == done_var_$7)
                {
                  final SubLObject asst2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator3, token_var_$8 );
                  final SubLObject valid_$9 = makeBoolean( !token_var_$8.eql( asst2 ) );
                  if( NIL != valid_$9 && NIL != kb_mapping_macros.do_term_index_assertion_match_p( asst2, final_index_spec3 ) && NIL != assertions_high.rule_assertionP( asst2 ) )
                  {
                    mts = ConsesLow.cons( hlmt.assertion_monad_mt( asst2 ), mts );
                  }
                  done_var_$7 = makeBoolean( NIL == valid_$9 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values4 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator3 )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator3 );
                  }
                  Values.restoreValuesFromVector( _values4 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
                }
              }
            }
            done_var3 = makeBoolean( NIL == valid3 );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym26$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const27$EverythingPSC, thread );
        if( NIL != kb_mapping_macros.do_term_index_key_validator( v_term, NIL ) )
        {
          final SubLObject iterator_var3 = kb_mapping_macros.new_term_final_index_spec_iterator( v_term, NIL );
          SubLObject done_var3 = NIL;
          final SubLObject token_var3 = NIL;
          while ( NIL == done_var3)
          {
            final SubLObject final_index_spec3 = iteration.iteration_next_without_values_macro_helper( iterator_var3, token_var3 );
            final SubLObject valid3 = makeBoolean( !token_var3.eql( final_index_spec3 ) );
            if( NIL != valid3 )
            {
              SubLObject final_index_iterator3 = NIL;
              try
              {
                final_index_iterator3 = kb_mapping_macros.new_final_index_iterator( final_index_spec3, NIL, NIL, NIL );
                SubLObject done_var_$8 = NIL;
                final SubLObject token_var_$9 = NIL;
                while ( NIL == done_var_$8)
                {
                  final SubLObject asst2 = iteration.iteration_next_without_values_macro_helper( final_index_iterator3, token_var_$9 );
                  final SubLObject valid_$10 = makeBoolean( !token_var_$9.eql( asst2 ) );
                  if( NIL != valid_$10 && NIL != kb_mapping_macros.do_term_index_assertion_match_p( asst2, final_index_spec3 ) )
                  {
                    mts = ConsesLow.cons( hlmt.assertion_monad_mt( asst2 ), mts );
                  }
                  done_var_$8 = makeBoolean( NIL == valid_$10 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values5 = Values.getValuesAsVector();
                  if( NIL != final_index_iterator3 )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator3 );
                  }
                  Values.restoreValuesFromVector( _values5 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
                }
              }
            }
            done_var3 = makeBoolean( NIL == valid3 );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL != list_utilities.sublisp_boolean( mts ) )
    {
      return number_utilities.get_sorted_frequency_list( mts );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 11075L)
  public static SubLObject frequency_list_of_mts(final SubLObject v_term, SubLObject function_or_predicate, SubLObject rule_assertion)
  {
    if( function_or_predicate == UNPROVIDED )
    {
      function_or_predicate = NIL;
    }
    if( rule_assertion == UNPROVIDED )
    {
      rule_assertion = NIL;
    }
    SubLObject caching_state = $frequency_list_of_mts_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym25$FREQUENCY_LIST_OF_MTS, $sym30$_FREQUENCY_LIST_OF_MTS_CACHING_STATE_, NIL, EQUAL, THREE_INTEGER, FOUR_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( v_term, function_or_predicate, rule_assertion );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( v_term.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( function_or_predicate.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && rule_assertion.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( frequency_list_of_mts_internal( v_term, function_or_predicate, rule_assertion ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, function_or_predicate, rule_assertion ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 12674L)
  public static SubLObject mts_get_formula_frequency_data(final SubLObject formula)
  {
    final SubLObject v_forts = cycl_utilities.formula_forts( formula, T, UNPROVIDED, UNPROVIDED );
    final SubLObject filtered = Sequences.remove_if( $sym31$MTS_TOO_GENERAL_, v_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject frequency_data = NIL;
    SubLObject cdolist_list_var = filtered;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      frequency_data = ConsesLow.cons( reader.bq_cons( v_term, Sequences.subseq( Sequences.remove_if( $sym1$MTS_NOT_COMMONSENSE_MT_, frequency_list_of_mts_adjusted( v_term, used_as_function_or_predicateP( $const32$Dog,
          formula ), UNPROVIDED ), $sym2$CAR, UNPROVIDED, UNPROVIDED, UNPROVIDED ), ZERO_INTEGER, FIVE_INTEGER ) ), frequency_data );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return frequency_data;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 13577L)
  public static SubLObject mts_get_summed_data(final SubLObject formula)
  {
    final SubLObject v_forts = cycl_utilities.formula_forts( formula, T, UNPROVIDED, UNPROVIDED );
    SubLObject filtered = Sequences.remove_if( $sym31$MTS_TOO_GENERAL_, v_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject mts_for_term = NIL;
    SubLObject mts_for_term_adjusted = NIL;
    SubLObject all_mt_frequencies = NIL;
    SubLObject freqlist = NIL;
    SubLObject summed_data = NIL;
    if( Sequences.length( filtered ).numLE( TWO_INTEGER ) )
    {
      filtered = Sequences.remove_if( $sym33$MTS_TOO_GENERAL_LIGHT_FILTERING_, v_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    SubLObject cdolist_list_var = filtered;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      freqlist = list_utilities.first_n( FIVE_INTEGER, Sequences.remove_if( $sym1$MTS_NOT_COMMONSENSE_MT_, frequency_list_of_mts_adjusted( v_term, used_as_function_or_predicateP( v_term, formula ), el_utilities
          .el_implication_p( formula ) ), $sym2$CAR, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      mts_for_term = Mapping.mapcar( $sym2$CAR, freqlist );
      mts_for_term_adjusted = Mapping.mapcar( $sym34$CONS, mts_for_term, new SubLObject[] { ConsesLow.make_list( Sequences.length( mts_for_term ), mts_specificity_estimate( v_term ) )
      } );
      all_mt_frequencies = ConsesLow.append( all_mt_frequencies, freqlist );
      summed_data = ConsesLow.append( summed_data, mts_for_term_adjusted );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    final SubLObject small_number_hash = Hashtables.make_hash_table( TEN_INTEGER, EQUAL, UNPROVIDED );
    final SubLObject big_number_hash = Hashtables.make_hash_table( TEN_INTEGER, EQUAL, UNPROVIDED );
    SubLObject cdolist_list_var2 = summed_data;
    SubLObject dotted_pair = NIL;
    dotted_pair = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      hash_table_utilities.cinc_hash( dotted_pair.first(), small_number_hash, dotted_pair.rest(), UNPROVIDED );
      cdolist_list_var2 = cdolist_list_var2.rest();
      dotted_pair = cdolist_list_var2.first();
    }
    cdolist_list_var2 = all_mt_frequencies;
    dotted_pair = NIL;
    dotted_pair = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      hash_table_utilities.cinc_hash( dotted_pair.first(), big_number_hash, dotted_pair.rest(), UNPROVIDED );
      cdolist_list_var2 = cdolist_list_var2.rest();
      dotted_pair = cdolist_list_var2.first();
    }
    final SubLObject combined_data = get_combined_list_for_mts_summed_data( hash_table_utilities.hash_table_to_alist( small_number_hash ), hash_table_utilities.hash_table_to_alist( big_number_hash ) );
    final SubLObject semi_sorted = Sort.sort( combined_data, $sym35$_, $sym36$CADDR );
    final SubLObject sorted = Sort.stable_sort( semi_sorted, $sym35$_, $sym37$CADR );
    return sorted;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 16027L)
  public static SubLObject get_combined_list_for_mts_summed_data(final SubLObject lst1, final SubLObject lst2)
  {
    SubLObject final_list = NIL;
    SubLObject one_element = NIL;
    SubLObject pair = NIL;
    SubLObject cdolist_list_var = lst1;
    SubLObject elt = NIL;
    elt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      pair = Sequences.find( elt.first(), lst2, EQUAL, $sym2$CAR, UNPROVIDED, UNPROVIDED );
      one_element = ConsesLow.list( elt.first(), elt.rest(), pair.rest() );
      final_list = ConsesLow.cons( one_element, final_list );
      cdolist_list_var = cdolist_list_var.rest();
      elt = cdolist_list_var.first();
    }
    return final_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 16872L)
  public static SubLObject mts_too_generalP(final SubLObject v_term, SubLObject light_filtering)
  {
    if( light_filtering == UNPROVIDED )
    {
      light_filtering = NIL;
    }
    return makeBoolean( NIL != subl_promotions.memberP( v_term, $mtsugg_too_general_term_filter$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) || ( NIL == light_filtering && ( NIL != isa.isaP( v_term, $const41$MetaRelation,
        UNPROVIDED, UNPROVIDED ) || NIL != isa.quoted_isaP( v_term, $const42$CoreConstant, $const27$EverythingPSC, UNPROVIDED ) || NIL != isa.isaP( v_term, $const43$KEFacilitationPredicate, UNPROVIDED,
            UNPROVIDED ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 18067L)
  public static SubLObject mts_too_general_light_filteringP(final SubLObject v_term)
  {
    return mts_too_generalP( v_term, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 18227L)
  public static SubLObject get_mt_list_for_predicate(final SubLObject predicate, SubLObject max_assertions)
  {
    if( max_assertions == UNPROVIDED )
    {
      max_assertions = $int44$20000;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( kb_indexing.num_predicate_extent_index( predicate, UNPROVIDED ).numG( max_assertions ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym45$RELEVANT_MT_IS_ANY_MT, thread );
      final SubLObject assertions = kb_mapping.gather_predicate_extent_index( predicate, UNPROVIDED, UNPROVIDED );
      final SubLObject mts = Mapping.mapcar( $sym46$ASSERTION_MT, assertions );
      result = ( NIL != mts ) ? number_utilities.get_sorted_frequency_list( mts ) : NIL;
    }
    finally
    {
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 18977L)
  public static SubLObject clear_top_mt_percent_count()
  {
    final SubLObject cs = $top_mt_percent_count_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 18977L)
  public static SubLObject remove_top_mt_percent_count(final SubLObject predicate, SubLObject max_assertions)
  {
    if( max_assertions == UNPROVIDED )
    {
      max_assertions = $int44$20000;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $top_mt_percent_count_caching_state$.getGlobalValue(), ConsesLow.list( predicate, max_assertions ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 18977L)
  public static SubLObject top_mt_percent_count_internal(final SubLObject predicate, final SubLObject max_assertions)
  {
    final SubLObject freq_list = get_mt_list_for_predicate( predicate, max_assertions );
    final SubLObject total = ( NIL != freq_list ) ? Functions.apply( $sym48$_, Mapping.mapcar( $sym49$CDR, freq_list ) ) : NIL;
    return ( NIL != freq_list ) ? ConsesLow.list( conses_high.caar( freq_list ), Numbers.divide( conses_high.cdar( freq_list ), total ), total ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 18977L)
  public static SubLObject top_mt_percent_count(final SubLObject predicate, SubLObject max_assertions)
  {
    if( max_assertions == UNPROVIDED )
    {
      max_assertions = $int44$20000;
    }
    SubLObject caching_state = $top_mt_percent_count_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym47$TOP_MT_PERCENT_COUNT, $sym50$_TOP_MT_PERCENT_COUNT_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, $int51$25 );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( predicate, max_assertions );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( predicate.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && max_assertions.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( top_mt_percent_count_internal( predicate, max_assertions ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( predicate, max_assertions ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 19805L)
  public static SubLObject used_as_function_or_predicateP(final SubLObject v_term, final SubLObject formula)
  {
    final SubLObject positions = list_utilities.tree_positions( v_term, formula, EQUAL, UNPROVIDED );
    final SubLObject atoms = Sequences.remove_if( $sym52$LISTP, positions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject lists = Sequences.remove_if( $sym53$ATOM, positions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject last_elements = Mapping.mapcar( $sym2$CAR, Mapping.mapcar( $sym54$LAST, lists ) );
    return makeBoolean( NIL != subl_promotions.memberP( ZERO_INTEGER, atoms, EQUAL, UNPROVIDED ) || NIL != conses_high.member( ZERO_INTEGER, last_elements, EQUAL, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 21685L)
  public static SubLObject mts_run_all_tests(SubLObject verbose)
  {
    if( verbose == UNPROVIDED )
    {
      verbose = NIL;
    }
    final SubLObject all_tests = $list55;
    SubLObject results = NIL;
    SubLObject testname = NIL;
    mts_clear_test_results();
    mts_clear_tests();
    SubLObject cdolist_list_var = all_tests;
    SubLObject test = NIL;
    test = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      testname = Sequences.subseq( Symbols.symbol_name( test ), FOUR_INTEGER, UNPROVIDED );
      print_high.princ( $str56$Running_test__, UNPROVIDED );
      print_high.princ( testname, UNPROVIDED );
      streams_high.terpri( UNPROVIDED );
      results = Functions.funcall( test, verbose );
      streams_high.terpri( UNPROVIDED );
      print_high.princ( testname, UNPROVIDED );
      print_high.princ( $str57$_RESULTS__, UNPROVIDED );
      print_high.princ( results, UNPROVIDED );
      streams_high.terpri( UNPROVIDED );
      streams_high.terpri( UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      test = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 22618L)
  public static SubLObject mts_clear_tests()
  {
    $examination_mts$.setGlobalValue( NIL );
    $examination_formulas$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 22795L)
  public static SubLObject mts_clear_test_results()
  {
    $mts_incorrect_formulas$.setGlobalValue( NIL );
    $mts_actual_mts$.setGlobalValue( NIL );
    $mts_guessed_mts$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 23012L)
  public static SubLObject mts_print_test_results(SubLObject verbose)
  {
    if( verbose == UNPROVIDED )
    {
      verbose = T;
    }
    if( NIL != verbose )
    {
      SubLObject cdotimes_end_var;
      SubLObject n;
      for( cdotimes_end_var = Sequences.length( $mts_incorrect_formulas$.getGlobalValue() ), n = NIL, n = ZERO_INTEGER; n.numL( cdotimes_end_var ); n = Numbers.add( n, ONE_INTEGER ) )
      {
        print_high.princ( $str58$Incorrect_Formula__, UNPROVIDED );
        streams_high.terpri( UNPROVIDED );
        print_high.princ( ConsesLow.nth( n, $mts_incorrect_formulas$.getGlobalValue() ), UNPROVIDED );
        streams_high.terpri( UNPROVIDED );
        print_high.princ( $str59$Suggested_Mt__, UNPROVIDED );
        print_high.princ( ConsesLow.nth( n, $mts_guessed_mts$.getGlobalValue() ), UNPROVIDED );
        streams_high.terpri( UNPROVIDED );
        print_high.princ( $str60$Actual_Mt__, UNPROVIDED );
        print_high.princ( ConsesLow.nth( n, $mts_actual_mts$.getGlobalValue() ), UNPROVIDED );
        streams_high.terpri( UNPROVIDED );
      }
    }
    print_high.princ( $str61$Frequency_list_of_suggested_mts__, UNPROVIDED );
    streams_high.terpri( UNPROVIDED );
    print_high.princ( number_utilities.get_sorted_frequency_list( $mts_guessed_mts$.getGlobalValue() ), UNPROVIDED );
    streams_high.terpri( UNPROVIDED );
    print_high.princ( $str62$Frequency_list_of_actual_mts__, UNPROVIDED );
    streams_high.terpri( UNPROVIDED );
    print_high.princ( number_utilities.get_sorted_frequency_list( $mts_actual_mts$.getGlobalValue() ), UNPROVIDED );
    streams_high.terpri( UNPROVIDED );
    streams_high.terpri( UNPROVIDED );
    streams_high.terpri( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 23845L)
  public static SubLObject mts_default_test(SubLObject print)
  {
    if( print == UNPROVIDED )
    {
      print = NIL;
    }
    return test_mt_suggestor( $examination_formulas$.getGlobalValue(), $examination_mts$.getGlobalValue(), print );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 24059L)
  public static SubLObject run_new_project_assertions_test(SubLObject print, SubLObject assertions)
  {
    if( print == UNPROVIDED )
    {
      print = NIL;
    }
    if( assertions == UNPROVIDED )
    {
      assertions = $int21$100;
    }
    mts_clear_tests();
    final SubLObject numassertions = Numbers.divide( assertions, FOUR_INTEGER );
    add_n_assertions_in_mt( $const63$SAICLegacyAssertionsMt, numassertions, T, T );
    add_n_assertions_in_mt( $const64$PredicatePopulationMt, numassertions, T, T );
    add_n_assertions_in_mt( $const65$TestVocabularyMt, numassertions, T, T );
    add_n_assertions_in_mt( $const66$MotleyFoolUKGlossaryMt, numassertions, T, T );
    return mts_default_test( print );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 24868L)
  public static SubLObject run_old_project_assertions_test(SubLObject print, SubLObject assertions)
  {
    if( print == UNPROVIDED )
    {
      print = NIL;
    }
    if( assertions == UNPROVIDED )
    {
      assertions = $int21$100;
    }
    mts_clear_tests();
    final SubLObject numrules = Numbers.divide( assertions, SIX_INTEGER );
    add_n_assertions_in_mt( $const67$WebSearchEnhancementMt, numrules, T, T );
    add_n_assertions_in_mt( $const68$DesertShieldMt, numrules, T, T );
    add_n_assertions_in_mt( $const69$OilEconModelMt, numrules, T, T );
    add_n_assertions_in_mt( $const70$Y2Scenario_Stage1Mt, numrules, T, T );
    add_n_assertions_in_mt( $const71$BeachWalkIMt, numrules, T, T );
    add_n_assertions_in_mt( $const72$PQ204Mt, numrules, T, T );
    return mts_default_test( print );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 25665L)
  public static SubLObject run_definitional_assertions_test(SubLObject print, SubLObject assertions)
  {
    if( print == UNPROVIDED )
    {
      print = NIL;
    }
    if( assertions == UNPROVIDED )
    {
      assertions = $int21$100;
    }
    mts_clear_tests();
    SubLObject cdolist_list_var;
    final SubLObject assts = cdolist_list_var = ConsesLow.append( get_about_n_representative_assertions_from_pred( $const73$isa, Numbers.divide( assertions, TWO_INTEGER ) ),
        get_about_n_representative_assertions_from_pred( $const74$genls, Numbers.divide( assertions, TWO_INTEGER ) ) );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      $examination_formulas$.setGlobalValue( ConsesLow.cons( assertions_high.assertion_formula( assertion ), $examination_formulas$.getGlobalValue() ) );
      $examination_mts$.setGlobalValue( ConsesLow.cons( assertions_high.assertion_mt( assertion ), $examination_mts$.getGlobalValue() ) );
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return mts_default_test( print );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 26440L)
  public static SubLObject run_meta_predicates_test(SubLObject print, SubLObject assertions)
  {
    if( print == UNPROVIDED )
    {
      print = NIL;
    }
    if( assertions == UNPROVIDED )
    {
      assertions = $int21$100;
    }
    mts_clear_tests();
    final SubLObject numpredicates = Numbers.ceiling( Numbers.divide( assertions, FIVE_INTEGER ), UNPROVIDED );
    final SubLObject predicates = mts_random_subset( isa.all_fort_instances( $const75$MetaPredicate, UNPROVIDED, UNPROVIDED ), numpredicates );
    SubLObject assts = NIL;
    SubLObject cdolist_list_var = predicates;
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assts = ConsesLow.append( assts, get_about_n_representative_assertions_from_pred( pred, Numbers.ceiling( Numbers.divide( assertions, numpredicates ), UNPROVIDED ) ) );
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    cdolist_list_var = assts;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      $examination_formulas$.setGlobalValue( ConsesLow.cons( assertions_high.assertion_formula( assertion ), $examination_formulas$.getGlobalValue() ) );
      $examination_mts$.setGlobalValue( ConsesLow.cons( assertions_high.assertion_mt( assertion ), $examination_mts$.getGlobalValue() ) );
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return mts_default_test( print );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 27301L)
  public static SubLObject run_rule_macro_predicates_test(SubLObject print, SubLObject assertions)
  {
    if( print == UNPROVIDED )
    {
      print = NIL;
    }
    if( assertions == UNPROVIDED )
    {
      assertions = $int21$100;
    }
    mts_clear_tests();
    final SubLObject numpredicates = Numbers.ceiling( Numbers.divide( assertions, FIVE_INTEGER ), UNPROVIDED );
    final SubLObject predicates = mts_random_subset( isa.all_fort_instances( $const76$RuleMacroPredicate, UNPROVIDED, UNPROVIDED ), numpredicates );
    SubLObject assts = NIL;
    SubLObject cdolist_list_var = predicates;
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assts = ConsesLow.append( assts, get_about_n_representative_assertions_from_pred( pred, Numbers.ceiling( Numbers.divide( assertions, numpredicates ), UNPROVIDED ) ) );
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    cdolist_list_var = assts;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      $examination_formulas$.setGlobalValue( ConsesLow.cons( assertions_high.assertion_formula( assertion ), $examination_formulas$.getGlobalValue() ) );
      $examination_mts$.setGlobalValue( ConsesLow.cons( assertions_high.assertion_mt( assertion ), $examination_mts$.getGlobalValue() ) );
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return mts_default_test( print );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 28167L)
  public static SubLObject run_large_commonsense_mt_rules_test(SubLObject print, SubLObject assertions)
  {
    if( print == UNPROVIDED )
    {
      print = NIL;
    }
    if( assertions == UNPROVIDED )
    {
      assertions = $int21$100;
    }
    mts_clear_tests();
    final SubLObject numrules = Numbers.divide( assertions, FOUR_INTEGER );
    add_n_assertions_in_mt( $const77$BiologyMt, numrules, NIL, T );
    add_n_assertions_in_mt( $const78$ModernMilitaryTacticsMt, numrules, NIL, T );
    add_n_assertions_in_mt( $const79$HumanSocialLifeMt, numrules, NIL, T );
    add_n_assertions_in_mt( $const80$ChemistryMt, numrules, NIL, T );
    return mts_default_test( print );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 28884L)
  public static SubLObject run_large_commonsense_mt_gafs_test(SubLObject print, SubLObject assertions)
  {
    if( print == UNPROVIDED )
    {
      print = NIL;
    }
    if( assertions == UNPROVIDED )
    {
      assertions = $int21$100;
    }
    mts_clear_tests();
    final SubLObject numgafs = Numbers.divide( assertions, FOUR_INTEGER );
    add_n_assertions_in_mt( $const77$BiologyMt, numgafs, T, NIL );
    add_n_assertions_in_mt( $const78$ModernMilitaryTacticsMt, numgafs, T, NIL );
    add_n_assertions_in_mt( $const79$HumanSocialLifeMt, numgafs, T, NIL );
    add_n_assertions_in_mt( $const80$ChemistryMt, numgafs, T, NIL );
    return mts_default_test( print );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 29584L)
  public static SubLObject run_base_kb_rules_test(SubLObject print, SubLObject assertions)
  {
    if( print == UNPROVIDED )
    {
      print = NIL;
    }
    if( assertions == UNPROVIDED )
    {
      assertions = $int21$100;
    }
    mts_clear_tests();
    add_n_assertions_in_mt( $const3$BaseKB, assertions, UNPROVIDED, UNPROVIDED );
    return mts_default_test( print );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 30022L)
  public static SubLObject run_lexical_rules_test(SubLObject print, SubLObject assertions)
  {
    if( print == UNPROVIDED )
    {
      print = NIL;
    }
    if( assertions == UNPROVIDED )
    {
      assertions = $int21$100;
    }
    mts_clear_tests();
    add_n_assertions_in_mt( $const81$EnglishLexiconMt, assertions, NIL, T );
    return mts_default_test( print );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 30469L)
  public static SubLObject run_lexical_gafs_test(SubLObject print, SubLObject assertions)
  {
    if( print == UNPROVIDED )
    {
      print = NIL;
    }
    if( assertions == UNPROVIDED )
    {
      assertions = $int21$100;
    }
    mts_clear_tests();
    final SubLObject numgafs = Numbers.divide( assertions, TWO_INTEGER );
    add_n_assertions_in_mt( $const82$EnglishParaphraseMt, numgafs, T, NIL );
    add_n_assertions_in_mt( $const81$EnglishLexiconMt, numgafs, T, NIL );
    return mts_default_test( print );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 31010L)
  public static SubLObject run_high_level_assertions_test(SubLObject print, SubLObject assertions, SubLObject gafsP, SubLObject rulesP)
  {
    if( print == UNPROVIDED )
    {
      print = NIL;
    }
    if( assertions == UNPROVIDED )
    {
      assertions = $int21$100;
    }
    if( gafsP == UNPROVIDED )
    {
      gafsP = T;
    }
    if( rulesP == UNPROVIDED )
    {
      rulesP = T;
    }
    mts_clear_tests();
    final SubLObject numassertions = Numbers.divide( assertions, FOUR_INTEGER );
    add_n_assertions_in_mt( $const83$LogicalTruthMt, numassertions, gafsP, rulesP );
    add_n_assertions_in_mt( $const84$LogicalTruthImplementationMt, numassertions, gafsP, rulesP );
    add_n_assertions_in_mt( $const85$CoreCycLMt, numassertions, gafsP, rulesP );
    add_n_assertions_in_mt( $const85$CoreCycLMt, numassertions, gafsP, rulesP );
    return mts_default_test( print );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 31886L)
  public static SubLObject test_mt_suggestor(final SubLObject assertionlist, final SubLObject mtlist, SubLObject print)
  {
    if( print == UNPROVIDED )
    {
      print = T;
    }
    SubLObject i = ZERO_INTEGER;
    SubLObject right = ZERO_INTEGER;
    SubLObject suggestion = NIL;
    SubLObject cdolist_list_var = assertionlist;
    SubLObject asst = NIL;
    asst = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != print )
      {
        print_high.princ( $str86$Trying_Formula__, UNPROVIDED );
        print_high.princ( i, UNPROVIDED );
        streams_high.terpri( UNPROVIDED );
      }
      suggestion = suggest_mt( asst );
      if( NIL != print )
      {
        print_high.princ( $str59$Suggested_Mt__, UNPROVIDED );
        print_high.princ( suggestion, UNPROVIDED );
        streams_high.terpri( UNPROVIDED );
        print_high.princ( $str60$Actual_Mt__, UNPROVIDED );
        print_high.princ( ConsesLow.nth( i, mtlist ), UNPROVIDED );
        streams_high.terpri( UNPROVIDED );
        streams_high.terpri( UNPROVIDED );
      }
      if( suggestion.equal( ConsesLow.nth( i, mtlist ) ) )
      {
        right = Numbers.add( right, ONE_INTEGER );
      }
      else
      {
        $mts_incorrect_formulas$.setGlobalValue( ConsesLow.cons( asst, $mts_incorrect_formulas$.getGlobalValue() ) );
        $mts_guessed_mts$.setGlobalValue( ConsesLow.cons( suggestion, $mts_guessed_mts$.getGlobalValue() ) );
        $mts_actual_mts$.setGlobalValue( ConsesLow.cons( ConsesLow.nth( i, mtlist ), $mts_actual_mts$.getGlobalValue() ) );
      }
      i = Numbers.add( i, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      asst = cdolist_list_var.first();
    }
    if( NIL != print )
    {
      print_high.princ( $str87$Got_, UNPROVIDED );
      print_high.princ( right, UNPROVIDED );
      print_high.princ( $str88$_out_of_, UNPROVIDED );
      print_high.princ( i, UNPROVIDED );
      streams_high.terpri( UNPROVIDED );
    }
    return Numbers.divide( right, i );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 32910L)
  public static SubLObject add_n_assertions_in_mt(final SubLObject mt, SubLObject n, SubLObject include_gafs, SubLObject include_rules)
  {
    if( n == UNPROVIDED )
    {
      n = $int21$100;
    }
    if( include_gafs == UNPROVIDED )
    {
      include_gafs = NIL;
    }
    if( include_rules == UNPROVIDED )
    {
      include_rules = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject stopP = NIL;
    SubLObject numsofar = ZERO_INTEGER;
    SubLObject formula = NIL;
    final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method( mt );
    if( pcase_var.eql( $kw89$MT ) )
    {
      if( NIL != kb_mapping_macros.do_mt_index_key_validator( mt, NIL ) )
      {
        final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec( mt );
        SubLObject final_index_iterator = NIL;
        try
        {
          final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, NIL, NIL, NIL );
          SubLObject done_var = stopP;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( assertion ) );
            if( NIL != valid )
            {
              formula = assertions_high.assertion_formula( assertion );
              if( ( NIL != include_rules && NIL != el_utilities.el_implication_p( formula ) ) || ( NIL != include_gafs && NIL == el_utilities.el_implication_p( formula ) && ( Sequences.length( formula ).numL(
                  TWO_INTEGER ) || NIL == fort_types_interface.skolem_functionP( conses_high.second( formula ), UNPROVIDED ) ) ) )
              {
                $examination_formulas$.setGlobalValue( ConsesLow.cons( formula, $examination_formulas$.getGlobalValue() ) );
                $examination_mts$.setGlobalValue( ConsesLow.cons( assertions_high.assertion_mt( assertion ), $examination_mts$.getGlobalValue() ) );
                numsofar = Numbers.add( numsofar, ONE_INTEGER );
              }
              if( numsofar.numGE( n ) )
              {
                stopP = T;
              }
            }
            done_var = makeBoolean( NIL == valid || NIL != stopP );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
          }
        }
      }
    }
    else if( pcase_var.eql( $kw90$BROAD_MT ) && NIL != kb_mapping_macros.do_broad_mt_index_key_validator( mt, NIL ) )
    {
      SubLObject catch_var = NIL;
      try
      {
        thread.throwStack.push( $kw91$MAPPING_DONE );
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $str92$do_broad_mt_index;
        final SubLObject total = id_index.id_index_count( idx );
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != Types.stringp( mess ) : mess;
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
          utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
          utilities_macros.$within_noting_percent_progress$.bind( T, thread );
          utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
          try
          {
            utilities_macros.noting_percent_progress_preamble( mess );
            final SubLObject idx_$24 = idx;
            if( NIL == id_index.id_index_objects_empty_p( idx_$24, $kw94$SKIP ) )
            {
              final SubLObject idx_$25 = idx_$24;
              if( NIL == id_index.id_index_dense_objects_empty_p( idx_$25, $kw94$SKIP ) )
              {
                final SubLObject vector_var = id_index.id_index_dense_objects( idx_$25 );
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject a_id;
                SubLObject a_handle;
                SubLObject assertion2;
                for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                {
                  a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                  a_handle = Vectors.aref( vector_var, a_id );
                  if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw94$SKIP ) )
                  {
                    if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                    {
                      a_handle = $kw94$SKIP;
                    }
                    assertion2 = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                    if( NIL != stopP )
                    {
                      utilities_macros.mapping_finished();
                    }
                    if( NIL != kb_mapping_macros.do_broad_mt_index_match_p( assertion2, mt, NIL, NIL ) )
                    {
                      formula = assertions_high.assertion_formula( assertion2 );
                      if( ( NIL != include_rules && NIL != el_utilities.el_implication_p( formula ) ) || ( NIL != include_gafs && NIL == el_utilities.el_implication_p( formula ) && ( Sequences.length( formula ).numL(
                          TWO_INTEGER ) || NIL == fort_types_interface.skolem_functionP( conses_high.second( formula ), UNPROVIDED ) ) ) )
                      {
                        $examination_formulas$.setGlobalValue( ConsesLow.cons( formula, $examination_formulas$.getGlobalValue() ) );
                        $examination_mts$.setGlobalValue( ConsesLow.cons( assertions_high.assertion_mt( assertion2 ), $examination_mts$.getGlobalValue() ) );
                        numsofar = Numbers.add( numsofar, ONE_INTEGER );
                      }
                      if( numsofar.numGE( n ) )
                      {
                        stopP = T;
                      }
                    }
                    sofar = Numbers.add( sofar, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar, total );
                  }
                }
              }
              final SubLObject idx_$26 = idx_$24;
              if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$26 ) || NIL == id_index.id_index_skip_tombstones_p( $kw94$SKIP ) )
              {
                final SubLObject sparse = id_index.id_index_sparse_objects( idx_$26 );
                SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$26 );
                final SubLObject end_id = id_index.id_index_next_id( idx_$26 );
                final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw94$SKIP ) ) ? NIL : $kw94$SKIP;
                while ( a_id2.numL( end_id ))
                {
                  final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
                  if( NIL == id_index.id_index_skip_tombstones_p( $kw94$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
                  {
                    final SubLObject assertion3 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                    if( NIL != stopP )
                    {
                      utilities_macros.mapping_finished();
                    }
                    if( NIL != kb_mapping_macros.do_broad_mt_index_match_p( assertion3, mt, NIL, NIL ) )
                    {
                      formula = assertions_high.assertion_formula( assertion3 );
                      if( ( NIL != include_rules && NIL != el_utilities.el_implication_p( formula ) ) || ( NIL != include_gafs && NIL == el_utilities.el_implication_p( formula ) && ( Sequences.length( formula ).numL(
                          TWO_INTEGER ) || NIL == fort_types_interface.skolem_functionP( conses_high.second( formula ), UNPROVIDED ) ) ) )
                      {
                        $examination_formulas$.setGlobalValue( ConsesLow.cons( formula, $examination_formulas$.getGlobalValue() ) );
                        $examination_mts$.setGlobalValue( ConsesLow.cons( assertions_high.assertion_mt( assertion3 ), $examination_mts$.getGlobalValue() ) );
                        numsofar = Numbers.add( numsofar, ONE_INTEGER );
                      }
                      if( numsofar.numGE( n ) )
                      {
                        stopP = T;
                      }
                    }
                    sofar = Numbers.add( sofar, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar, total );
                  }
                  a_id2 = Numbers.add( a_id2, ONE_INTEGER );
                }
              }
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values2 = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values2 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$27, thread );
            }
          }
        }
        finally
        {
          utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_5, thread );
          utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_4, thread );
          utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_3, thread );
          utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_2, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        catch_var = Errors.handleThrowable( ccatch_env_var, $kw91$MAPPING_DONE );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 33792L)
  public static SubLObject get_about_n_representative_assertions_from_pred(final SubLObject pred, final SubLObject n)
  {
    final SubLObject extent = kb_indexing.num_predicate_extent_index( pred, UNPROVIDED );
    final SubLObject prob = extent.numE( ZERO_INTEGER ) ? ONE_INTEGER : Numbers.min( ONE_INTEGER, Numbers.divide( n, extent ) );
    return get_n_assertions_from_pred_with_prob( pred, n, prob );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 34394L)
  public static SubLObject get_about_n_representative_assertions_from_mt(final SubLObject mt, final SubLObject n)
  {
    final SubLObject extent = ( NIL != kb_indexing.broad_mtP( mt ) ) ? $int95$100000 : kb_indexing.num_mt_index( mt );
    final SubLObject prob = extent.numE( ZERO_INTEGER ) ? ONE_INTEGER : Numbers.min( ONE_INTEGER, Numbers.divide( n, extent ) );
    return get_n_assertions_from_mt_with_prob( mt, n, prob );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 35100L)
  public static SubLObject get_n_assertions_from_pred_with_prob(final SubLObject pred, final SubLObject n, final SubLObject prob)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject doneP = NIL;
    SubLObject assertion_count = ZERO_INTEGER;
    SubLObject assertions = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym45$RELEVANT_MT_IS_ANY_MT, thread );
      mt_relevance_macros.$mt$.bind( $const96$InferencePSC, thread );
      if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred ) )
      {
        final SubLObject str = NIL;
        final SubLObject _prev_bind_0_$28 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_1_$29 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
          utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
          utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
          utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
          utilities_macros.$is_noting_progressP$.bind( T, thread );
          utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
          utilities_macros.noting_progress_preamble( str );
          final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred );
          SubLObject done_var = doneP;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              utilities_macros.note_progress();
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw28$GAF, NIL, NIL );
                SubLObject done_var_$30 = doneP;
                final SubLObject token_var_$31 = NIL;
                while ( NIL == done_var_$30)
                {
                  final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$31 );
                  final SubLObject valid_$32 = makeBoolean( !token_var_$31.eql( assertion ) );
                  if( NIL != valid_$32 && NIL != number_utilities.true_with_probability( prob ) )
                  {
                    assertions = ConsesLow.cons( assertion, assertions );
                    assertion_count = Numbers.add( assertion_count, ONE_INTEGER );
                    doneP = Numbers.numGE( assertion_count, n );
                  }
                  done_var_$30 = makeBoolean( NIL == valid_$32 || NIL != doneP );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$29, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid || NIL != doneP );
          }
          utilities_macros.noting_progress_postamble();
        }
        finally
        {
          utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
          utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
          utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
          utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
          utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
          utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
          utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_1_$29, thread );
          utilities_macros.$progress_start_time$.rebind( _prev_bind_0_$28, thread );
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

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 35752L)
  public static SubLObject get_n_assertions_from_mt_with_prob(final SubLObject mt, final SubLObject n, final SubLObject prob)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject doneP = NIL;
    SubLObject assertion_count = ZERO_INTEGER;
    SubLObject assertions = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym45$RELEVANT_MT_IS_ANY_MT, thread );
      mt_relevance_macros.$mt$.bind( $const96$InferencePSC, thread );
      final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method( mt );
      if( pcase_var.eql( $kw89$MT ) )
      {
        if( NIL != kb_mapping_macros.do_mt_index_key_validator( mt, NIL ) )
        {
          final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec( mt );
          SubLObject final_index_iterator = NIL;
          try
          {
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, NIL, NIL, NIL );
            SubLObject done_var = doneP;
            final SubLObject token_var = NIL;
            while ( NIL == done_var)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var );
              final SubLObject valid = makeBoolean( !token_var.eql( assertion ) );
              if( NIL != valid && NIL != number_utilities.true_with_probability( prob ) )
              {
                assertions = ConsesLow.cons( assertion, assertions );
                assertion_count = Numbers.add( assertion_count, ONE_INTEGER );
                doneP = Numbers.numGE( assertion_count, n );
              }
              done_var = makeBoolean( NIL == valid || NIL != doneP );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
            }
          }
        }
      }
      else if( pcase_var.eql( $kw90$BROAD_MT ) && NIL != kb_mapping_macros.do_broad_mt_index_key_validator( mt, NIL ) )
      {
        SubLObject catch_var = NIL;
        try
        {
          thread.throwStack.push( $kw91$MAPPING_DONE );
          final SubLObject idx = assertion_handles.do_assertions_table();
          final SubLObject mess = $str92$do_broad_mt_index;
          final SubLObject total = id_index.id_index_count( idx );
          SubLObject sofar = ZERO_INTEGER;
          assert NIL != Types.stringp( mess ) : mess;
          final SubLObject _prev_bind_0_$35 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
          final SubLObject _prev_bind_1_$36 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
          final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
          final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
          try
          {
            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
            try
            {
              utilities_macros.noting_percent_progress_preamble( mess );
              final SubLObject idx_$37 = idx;
              if( NIL == id_index.id_index_objects_empty_p( idx_$37, $kw94$SKIP ) )
              {
                final SubLObject idx_$38 = idx_$37;
                if( NIL == id_index.id_index_dense_objects_empty_p( idx_$38, $kw94$SKIP ) )
                {
                  final SubLObject vector_var = id_index.id_index_dense_objects( idx_$38 );
                  final SubLObject backwardP_var = NIL;
                  SubLObject length;
                  SubLObject v_iteration;
                  SubLObject a_id;
                  SubLObject a_handle;
                  SubLObject assertion2;
                  for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                  {
                    a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                    a_handle = Vectors.aref( vector_var, a_id );
                    if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw94$SKIP ) )
                    {
                      if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                      {
                        a_handle = $kw94$SKIP;
                      }
                      assertion2 = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                      if( NIL != doneP )
                      {
                        utilities_macros.mapping_finished();
                      }
                      if( NIL != kb_mapping_macros.do_broad_mt_index_match_p( assertion2, mt, NIL, NIL ) && NIL != number_utilities.true_with_probability( prob ) )
                      {
                        assertions = ConsesLow.cons( assertion2, assertions );
                        assertion_count = Numbers.add( assertion_count, ONE_INTEGER );
                        doneP = Numbers.numGE( assertion_count, n );
                      }
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                    }
                  }
                }
                final SubLObject idx_$39 = idx_$37;
                if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$39 ) || NIL == id_index.id_index_skip_tombstones_p( $kw94$SKIP ) )
                {
                  final SubLObject sparse = id_index.id_index_sparse_objects( idx_$39 );
                  SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$39 );
                  final SubLObject end_id = id_index.id_index_next_id( idx_$39 );
                  final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw94$SKIP ) ) ? NIL : $kw94$SKIP;
                  while ( a_id2.numL( end_id ))
                  {
                    final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
                    if( NIL == id_index.id_index_skip_tombstones_p( $kw94$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
                    {
                      final SubLObject assertion3 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                      if( NIL != doneP )
                      {
                        utilities_macros.mapping_finished();
                      }
                      if( NIL != kb_mapping_macros.do_broad_mt_index_match_p( assertion3, mt, NIL, NIL ) && NIL != number_utilities.true_with_probability( prob ) )
                      {
                        assertions = ConsesLow.cons( assertion3, assertions );
                        assertion_count = Numbers.add( assertion_count, ONE_INTEGER );
                        doneP = Numbers.numGE( assertion_count, n );
                      }
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                    }
                    a_id2 = Numbers.add( a_id2, ONE_INTEGER );
                  }
                }
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                utilities_macros.noting_percent_progress_postamble();
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$36, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$36, thread );
            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$35, thread );
          }
        }
        catch( final Throwable ccatch_env_var )
        {
          catch_var = Errors.handleThrowable( ccatch_env_var, $kw91$MAPPING_DONE );
        }
        finally
        {
          thread.throwStack.pop();
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

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 36360L)
  public static SubLObject get_summed_frequencies_from_frequency_list(final SubLObject freq_list)
  {
    return Functions.apply( $sym48$_, Mapping.mapcar( $sym49$CDR, freq_list ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-suggestor.lisp", position = 36476L)
  public static SubLObject mts_random_subset(final SubLObject lst, final SubLObject size)
  {
    final SubLObject integers = number_utilities.n_random_integers( size, Sequences.length( lst ), UNPROVIDED );
    SubLObject subset = NIL;
    SubLObject cdolist_list_var = integers;
    SubLObject integer = NIL;
    integer = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      subset = ConsesLow.cons( ConsesLow.nth( integer, lst ), subset );
      cdolist_list_var = cdolist_list_var.rest();
      integer = cdolist_list_var.first();
    }
    return subset;
  }

  public static SubLObject declare_mt_suggestor_file()
  {
    SubLFiles.declareFunction( me, "suggest_mt", "SUGGEST-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "suggest_mt_by_content", "SUGGEST-MT-BY-CONTENT", 1, 0, false );
    SubLFiles.declareFunction( me, "suggest_mt_for_gaf", "SUGGEST-MT-FOR-GAF", 1, 0, false );
    SubLFiles.declareFunction( me, "mts_not_commonsense_mtP", "MTS-NOT-COMMONSENSE-MT?", 1, 0, false );
    SubLFiles.declareFunction( me, "likely_project_related_assertionP", "LIKELY-PROJECT-RELATED-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "mtsugg_get_related_assertions", "MTSUGG-GET-RELATED-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "mt_list_from_related", "MT-LIST-FROM-RELATED", 1, 0, false );
    SubLFiles.declareFunction( me, "mts_specificity_estimate", "MTS-SPECIFICITY-ESTIMATE", 1, 0, false );
    SubLFiles.declareFunction( me, "frequency_list_of_mts_adjusted", "FREQUENCY-LIST-OF-MTS-ADJUSTED", 1, 2, false );
    SubLFiles.declareFunction( me, "clear_frequency_list_of_mts", "CLEAR-FREQUENCY-LIST-OF-MTS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_frequency_list_of_mts", "REMOVE-FREQUENCY-LIST-OF-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "frequency_list_of_mts_internal", "FREQUENCY-LIST-OF-MTS-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "frequency_list_of_mts", "FREQUENCY-LIST-OF-MTS", 1, 2, false );
    SubLFiles.declareFunction( me, "mts_get_formula_frequency_data", "MTS-GET-FORMULA-FREQUENCY-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "mts_get_summed_data", "MTS-GET-SUMMED-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "get_combined_list_for_mts_summed_data", "GET-COMBINED-LIST-FOR-MTS-SUMMED-DATA", 2, 0, false );
    SubLFiles.declareFunction( me, "mts_too_generalP", "MTS-TOO-GENERAL?", 1, 1, false );
    SubLFiles.declareFunction( me, "mts_too_general_light_filteringP", "MTS-TOO-GENERAL-LIGHT-FILTERING?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_mt_list_for_predicate", "GET-MT-LIST-FOR-PREDICATE", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_top_mt_percent_count", "CLEAR-TOP-MT-PERCENT-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_top_mt_percent_count", "REMOVE-TOP-MT-PERCENT-COUNT", 1, 1, false );
    SubLFiles.declareFunction( me, "top_mt_percent_count_internal", "TOP-MT-PERCENT-COUNT-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "top_mt_percent_count", "TOP-MT-PERCENT-COUNT", 1, 1, false );
    SubLFiles.declareFunction( me, "used_as_function_or_predicateP", "USED-AS-FUNCTION-OR-PREDICATE?", 2, 0, false );
    SubLFiles.declareFunction( me, "mts_run_all_tests", "MTS-RUN-ALL-TESTS", 0, 1, false );
    SubLFiles.declareFunction( me, "mts_clear_tests", "MTS-CLEAR-TESTS", 0, 0, false );
    SubLFiles.declareFunction( me, "mts_clear_test_results", "MTS-CLEAR-TEST-RESULTS", 0, 0, false );
    SubLFiles.declareFunction( me, "mts_print_test_results", "MTS-PRINT-TEST-RESULTS", 0, 1, false );
    SubLFiles.declareFunction( me, "mts_default_test", "MTS-DEFAULT-TEST", 0, 1, false );
    SubLFiles.declareFunction( me, "run_new_project_assertions_test", "RUN-NEW-PROJECT-ASSERTIONS-TEST", 0, 2, false );
    SubLFiles.declareFunction( me, "run_old_project_assertions_test", "RUN-OLD-PROJECT-ASSERTIONS-TEST", 0, 2, false );
    SubLFiles.declareFunction( me, "run_definitional_assertions_test", "RUN-DEFINITIONAL-ASSERTIONS-TEST", 0, 2, false );
    SubLFiles.declareFunction( me, "run_meta_predicates_test", "RUN-META-PREDICATES-TEST", 0, 2, false );
    SubLFiles.declareFunction( me, "run_rule_macro_predicates_test", "RUN-RULE-MACRO-PREDICATES-TEST", 0, 2, false );
    SubLFiles.declareFunction( me, "run_large_commonsense_mt_rules_test", "RUN-LARGE-COMMONSENSE-MT-RULES-TEST", 0, 2, false );
    SubLFiles.declareFunction( me, "run_large_commonsense_mt_gafs_test", "RUN-LARGE-COMMONSENSE-MT-GAFS-TEST", 0, 2, false );
    SubLFiles.declareFunction( me, "run_base_kb_rules_test", "RUN-BASE-KB-RULES-TEST", 0, 2, false );
    SubLFiles.declareFunction( me, "run_lexical_rules_test", "RUN-LEXICAL-RULES-TEST", 0, 2, false );
    SubLFiles.declareFunction( me, "run_lexical_gafs_test", "RUN-LEXICAL-GAFS-TEST", 0, 2, false );
    SubLFiles.declareFunction( me, "run_high_level_assertions_test", "RUN-HIGH-LEVEL-ASSERTIONS-TEST", 0, 4, false );
    SubLFiles.declareFunction( me, "test_mt_suggestor", "TEST-MT-SUGGESTOR", 2, 1, false );
    SubLFiles.declareFunction( me, "add_n_assertions_in_mt", "ADD-N-ASSERTIONS-IN-MT", 1, 3, false );
    SubLFiles.declareFunction( me, "get_about_n_representative_assertions_from_pred", "GET-ABOUT-N-REPRESENTATIVE-ASSERTIONS-FROM-PRED", 2, 0, false );
    SubLFiles.declareFunction( me, "get_about_n_representative_assertions_from_mt", "GET-ABOUT-N-REPRESENTATIVE-ASSERTIONS-FROM-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "get_n_assertions_from_pred_with_prob", "GET-N-ASSERTIONS-FROM-PRED-WITH-PROB", 3, 0, false );
    SubLFiles.declareFunction( me, "get_n_assertions_from_mt_with_prob", "GET-N-ASSERTIONS-FROM-MT-WITH-PROB", 3, 0, false );
    SubLFiles.declareFunction( me, "get_summed_frequencies_from_frequency_list", "GET-SUMMED-FREQUENCIES-FROM-FREQUENCY-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "mts_random_subset", "MTS-RANDOM-SUBSET", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_mt_suggestor_file()
  {
    $mts_forbid_lexical_mts$ = SubLFiles.defparameter( "*MTS-FORBID-LEXICAL-MTS*", NIL );
    $mts_forbid_project_mts$ = SubLFiles.defparameter( "*MTS-FORBID-PROJECT-MTS*", NIL );
    $mts_forbid_high_level_mts_for_content_assertions$ = SubLFiles.defparameter( "*MTS-FORBID-HIGH-LEVEL-MTS-FOR-CONTENT-ASSERTIONS*", T );
    $predicate_determined_gaf_cutoff_percent$ = SubLFiles.defparameter( "*PREDICATE-DETERMINED-GAF-CUTOFF-PERCENT*", $float4$0_8 );
    $predicate_determined_gaf_cutoff_number$ = SubLFiles.defparameter( "*PREDICATE-DETERMINED-GAF-CUTOFF-NUMBER*", THREE_INTEGER );
    $mtsugg_related_assertion_formulas_query_properties$ = SubLFiles.deflexical( "*MTSUGG-RELATED-ASSERTION-FORMULAS-QUERY-PROPERTIES*", $list13 );
    $mtsugg_related_assertion_formulas_query_mt$ = SubLFiles.deflexical( "*MTSUGG-RELATED-ASSERTION-FORMULAS-QUERY-MT*", $list14 );
    $frequency_list_of_mts_caching_state$ = SubLFiles.deflexical( "*FREQUENCY-LIST-OF-MTS-CACHING-STATE*", NIL );
    $mtsugg_too_general_term_filter$ = SubLFiles.deflexical( "*MTSUGG-TOO-GENERAL-TERM-FILTER*", $list38 );
    $mtsugg_too_general_collection_filter$ = SubLFiles.deflexical( "*MTSUGG-TOO-GENERAL-COLLECTION-FILTER*", $list39 );
    $mtsugg_too_general_quoted_collection_filter$ = SubLFiles.deflexical( "*MTSUGG-TOO-GENERAL-QUOTED-COLLECTION-FILTER*", $list40 );
    $top_mt_percent_count_caching_state$ = SubLFiles.deflexical( "*TOP-MT-PERCENT-COUNT-CACHING-STATE*", NIL );
    $examination_formulas$ = SubLFiles.deflexical( "*EXAMINATION-FORMULAS*", NIL );
    $examination_mts$ = SubLFiles.deflexical( "*EXAMINATION-MTS*", NIL );
    $mts_incorrect_formulas$ = SubLFiles.deflexical( "*MTS-INCORRECT-FORMULAS*", NIL );
    $mts_actual_mts$ = SubLFiles.deflexical( "*MTS-ACTUAL-MTS*", NIL );
    $mts_guessed_mts$ = SubLFiles.deflexical( "*MTS-GUESSED-MTS*", NIL );
    return NIL;
  }

  public static SubLObject setup_mt_suggestor_file()
  {
    memoization_state.note_globally_cached_function( $sym25$FREQUENCY_LIST_OF_MTS );
    memoization_state.note_globally_cached_function( $sym47$TOP_MT_PERCENT_COUNT );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_mt_suggestor_file();
  }

  @Override
  public void initializeVariables()
  {
    init_mt_suggestor_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_mt_suggestor_file();
  }
  static
  {
    me = new mt_suggestor();
    $mts_forbid_lexical_mts$ = null;
    $mts_forbid_project_mts$ = null;
    $mts_forbid_high_level_mts_for_content_assertions$ = null;
    $predicate_determined_gaf_cutoff_percent$ = null;
    $predicate_determined_gaf_cutoff_number$ = null;
    $mtsugg_related_assertion_formulas_query_properties$ = null;
    $mtsugg_related_assertion_formulas_query_mt$ = null;
    $frequency_list_of_mts_caching_state$ = null;
    $mtsugg_too_general_term_filter$ = null;
    $mtsugg_too_general_collection_filter$ = null;
    $mtsugg_too_general_quoted_collection_filter$ = null;
    $top_mt_percent_count_caching_state$ = null;
    $examination_formulas$ = null;
    $examination_mts$ = null;
    $mts_incorrect_formulas$ = null;
    $mts_actual_mts$ = null;
    $mts_guessed_mts$ = null;
    $sym0$EL_FORMULA_P = makeSymbol( "EL-FORMULA-P" );
    $sym1$MTS_NOT_COMMONSENSE_MT_ = makeSymbol( "MTS-NOT-COMMONSENSE-MT?" );
    $sym2$CAR = makeSymbol( "CAR" );
    $const3$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $float4$0_8 = makeDouble( 0.8 );
    $const5$BookkeepingMt = constant_handles.reader_make_constant_shell( makeString( "BookkeepingMt" ) );
    $const6$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $const7$LexicalMicrotheory = constant_handles.reader_make_constant_shell( makeString( "LexicalMicrotheory" ) );
    $const8$ProjectMicrotheory = constant_handles.reader_make_constant_shell( makeString( "ProjectMicrotheory" ) );
    $const9$ApplicationContext = constant_handles.reader_make_constant_shell( makeString( "ApplicationContext" ) );
    $const10$SourceMicrotheory = constant_handles.reader_make_constant_shell( makeString( "SourceMicrotheory" ) );
    $const11$MappingMicrotheory = constant_handles.reader_make_constant_shell( makeString( "MappingMicrotheory" ) );
    $const12$ProblemSolvingCntxt = constant_handles.reader_make_constant_shell( makeString( "ProblemSolvingCntxt" ) );
    $list13 = ConsesLow.list( new SubLObject[] { makeKeyword( "DISJUNCTION-FREE-EL-VARS-POLICY" ), makeKeyword( "COMPUTE-INTERSECTION" ), makeKeyword( "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" ), T, makeKeyword(
        "MAX-TIME" ), makeInteger( 30 ), makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ), makeKeyword( "CONTINUABLE?" ), T, makeKeyword( "PRODUCTIVITY-LIMIT" ), makeKeyword( "POSITIVE-INFINITY" )
    } );
    $list14 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) ), constant_handles.reader_make_constant_shell( makeString( "CurrentWorldDataCollectorMt-NonHomocentric" ) ), ConsesLow
        .list( constant_handles.reader_make_constant_shell( makeString( "MtTimeDimFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Now" ) ) ) );
    $sym15$GAF_ = makeSymbol( "GAF?" );
    $sym16$_X = makeSymbol( "?X" );
    $sym17$_MT = makeSymbol( "?MT" );
    $kw18$IGNORE = makeKeyword( "IGNORE" );
    $const19$ist_Asserted = constant_handles.reader_make_constant_shell( makeString( "ist-Asserted" ) );
    $sym20$ASSERTION_MONAD_MT = makeSymbol( "ASSERTION-MONAD-MT" );
    $int21$100 = makeInteger( 100 );
    $int22$10000 = makeInteger( 10000 );
    $float23$0_5 = makeDouble( 0.5 );
    $float24$0_2 = makeDouble( 0.2 );
    $sym25$FREQUENCY_LIST_OF_MTS = makeSymbol( "FREQUENCY-LIST-OF-MTS" );
    $sym26$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const27$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw28$GAF = makeKeyword( "GAF" );
    $kw29$RULE = makeKeyword( "RULE" );
    $sym30$_FREQUENCY_LIST_OF_MTS_CACHING_STATE_ = makeSymbol( "*FREQUENCY-LIST-OF-MTS-CACHING-STATE*" );
    $sym31$MTS_TOO_GENERAL_ = makeSymbol( "MTS-TOO-GENERAL?" );
    $const32$Dog = constant_handles.reader_make_constant_shell( makeString( "Dog" ) );
    $sym33$MTS_TOO_GENERAL_LIGHT_FILTERING_ = makeSymbol( "MTS-TOO-GENERAL-LIGHT-FILTERING?" );
    $sym34$CONS = makeSymbol( "CONS" );
    $sym35$_ = makeSymbol( ">" );
    $sym36$CADDR = makeSymbol( "CADDR" );
    $sym37$CADR = makeSymbol( "CADR" );
    $list38 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "implies" ) ), constant_handles.reader_make_constant_shell( makeString( "and" ) ), constant_handles
        .reader_make_constant_shell( makeString( "not" ) ), constant_handles.reader_make_constant_shell( makeString( "or" ) ), constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) ), constant_handles
            .reader_make_constant_shell( makeString( "equals" ) ), constant_handles.reader_make_constant_shell( makeString( "ExistingObjectType" ) ), constant_handles.reader_make_constant_shell( makeString(
                "thereExists" ) ), constant_handles.reader_make_constant_shell( makeString( "forAll" ) ), constant_handles.reader_make_constant_shell( makeString( "comment" ) ), constant_handles
                    .reader_make_constant_shell( makeString( "cyclistNotes" ) ), constant_handles.reader_make_constant_shell( makeString( "sharedNotes" ) ), constant_handles.reader_make_constant_shell( makeString(
                        "different" ) ), constant_handles.reader_make_constant_shell( makeString( "Predicate" ) ), constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) ), constant_handles
                            .reader_make_constant_shell( makeString( "similarTo" ) ), constant_handles.reader_make_constant_shell( makeString( "CollectionType" ) ), constant_handles.reader_make_constant_shell(
                                makeString( "abnormal" ) ), constant_handles.reader_make_constant_shell( makeString( "evaluate" ) )
    } );
    $list39 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MetaRelation" ) ), constant_handles.reader_make_constant_shell( makeString( "KEFaciliationPredicate" ) ) );
    $list40 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CoreConstant" ) ) );
    $const41$MetaRelation = constant_handles.reader_make_constant_shell( makeString( "MetaRelation" ) );
    $const42$CoreConstant = constant_handles.reader_make_constant_shell( makeString( "CoreConstant" ) );
    $const43$KEFacilitationPredicate = constant_handles.reader_make_constant_shell( makeString( "KEFacilitationPredicate" ) );
    $int44$20000 = makeInteger( 20000 );
    $sym45$RELEVANT_MT_IS_ANY_MT = makeSymbol( "RELEVANT-MT-IS-ANY-MT" );
    $sym46$ASSERTION_MT = makeSymbol( "ASSERTION-MT" );
    $sym47$TOP_MT_PERCENT_COUNT = makeSymbol( "TOP-MT-PERCENT-COUNT" );
    $sym48$_ = makeSymbol( "+" );
    $sym49$CDR = makeSymbol( "CDR" );
    $sym50$_TOP_MT_PERCENT_COUNT_CACHING_STATE_ = makeSymbol( "*TOP-MT-PERCENT-COUNT-CACHING-STATE*" );
    $int51$25 = makeInteger( 25 );
    $sym52$LISTP = makeSymbol( "LISTP" );
    $sym53$ATOM = makeSymbol( "ATOM" );
    $sym54$LAST = makeSymbol( "LAST" );
    $list55 = ConsesLow.list( new SubLObject[] { makeSymbol( "RUN-LARGE-COMMONSENSE-MT-RULES-TEST" ), makeSymbol( "RUN-BASE-KB-RULES-TEST" ), makeSymbol( "RUN-LEXICAL-RULES-TEST" ), makeSymbol( "RUN-LEXICAL-GAFS-TEST" ),
      makeSymbol( "RUN-LARGE-COMMONSENSE-MT-GAFS-TEST" ), makeSymbol( "RUN-META-PREDICATES-TEST" ), makeSymbol( "RUN-RULE-MACRO-PREDICATES-TEST" ), makeSymbol( "RUN-NEW-PROJECT-ASSERTIONS-TEST" ), makeSymbol(
          "RUN-OLD-PROJECT-ASSERTIONS-TEST" )
    } );
    $str56$Running_test__ = makeString( "Running test: " );
    $str57$_RESULTS__ = makeString( " RESULTS: " );
    $str58$Incorrect_Formula__ = makeString( "Incorrect Formula: " );
    $str59$Suggested_Mt__ = makeString( "Suggested Mt: " );
    $str60$Actual_Mt__ = makeString( "Actual Mt: " );
    $str61$Frequency_list_of_suggested_mts__ = makeString( "Frequency list of suggested mts: " );
    $str62$Frequency_list_of_actual_mts__ = makeString( "Frequency list of actual mts: " );
    $const63$SAICLegacyAssertionsMt = constant_handles.reader_make_constant_shell( makeString( "SAICLegacyAssertionsMt" ) );
    $const64$PredicatePopulationMt = constant_handles.reader_make_constant_shell( makeString( "PredicatePopulationMt" ) );
    $const65$TestVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "TestVocabularyMt" ) );
    $const66$MotleyFoolUKGlossaryMt = constant_handles.reader_make_constant_shell( makeString( "MotleyFoolUKGlossaryMt" ) );
    $const67$WebSearchEnhancementMt = constant_handles.reader_make_constant_shell( makeString( "WebSearchEnhancementMt" ) );
    $const68$DesertShieldMt = constant_handles.reader_make_constant_shell( makeString( "DesertShieldMt" ) );
    $const69$OilEconModelMt = constant_handles.reader_make_constant_shell( makeString( "OilEconModelMt" ) );
    $const70$Y2Scenario_Stage1Mt = constant_handles.reader_make_constant_shell( makeString( "Y2Scenario-Stage1Mt" ) );
    $const71$BeachWalkIMt = constant_handles.reader_make_constant_shell( makeString( "BeachWalkIMt" ) );
    $const72$PQ204Mt = constant_handles.reader_make_constant_shell( makeString( "PQ204Mt" ) );
    $const73$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const74$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const75$MetaPredicate = constant_handles.reader_make_constant_shell( makeString( "MetaPredicate" ) );
    $const76$RuleMacroPredicate = constant_handles.reader_make_constant_shell( makeString( "RuleMacroPredicate" ) );
    $const77$BiologyMt = constant_handles.reader_make_constant_shell( makeString( "BiologyMt" ) );
    $const78$ModernMilitaryTacticsMt = constant_handles.reader_make_constant_shell( makeString( "ModernMilitaryTacticsMt" ) );
    $const79$HumanSocialLifeMt = constant_handles.reader_make_constant_shell( makeString( "HumanSocialLifeMt" ) );
    $const80$ChemistryMt = constant_handles.reader_make_constant_shell( makeString( "ChemistryMt" ) );
    $const81$EnglishLexiconMt = constant_handles.reader_make_constant_shell( makeString( "EnglishLexiconMt" ) );
    $const82$EnglishParaphraseMt = constant_handles.reader_make_constant_shell( makeString( "EnglishParaphraseMt" ) );
    $const83$LogicalTruthMt = constant_handles.reader_make_constant_shell( makeString( "LogicalTruthMt" ) );
    $const84$LogicalTruthImplementationMt = constant_handles.reader_make_constant_shell( makeString( "LogicalTruthImplementationMt" ) );
    $const85$CoreCycLMt = constant_handles.reader_make_constant_shell( makeString( "CoreCycLMt" ) );
    $str86$Trying_Formula__ = makeString( "Trying Formula: " );
    $str87$Got_ = makeString( "Got " );
    $str88$_out_of_ = makeString( " out of " );
    $kw89$MT = makeKeyword( "MT" );
    $kw90$BROAD_MT = makeKeyword( "BROAD-MT" );
    $kw91$MAPPING_DONE = makeKeyword( "MAPPING-DONE" );
    $str92$do_broad_mt_index = makeString( "do-broad-mt-index" );
    $sym93$STRINGP = makeSymbol( "STRINGP" );
    $kw94$SKIP = makeKeyword( "SKIP" );
    $int95$100000 = makeInteger( 100000 );
    $const96$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
  }
}
/*
 * 
 * Total time: 934 ms
 * 
 */