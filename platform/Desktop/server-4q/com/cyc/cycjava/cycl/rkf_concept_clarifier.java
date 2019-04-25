package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_concept_clarifier
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_concept_clarifier";
  public static final String myFingerPrint = "5a2c7f03a4bd7de61a10e882074a7c45c03cfdae5c257e727d90db12ba5ab4b4";
  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 837L)
  private static SubLSymbol $max_rkf_clarifying_sentences$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 5501L)
  private static SubLSymbol $rkf_salient_generalizations_caching_state$;
  private static final SubLSymbol $kw0$GENLS;
  private static final SubLSymbol $kw1$ISAS;
  private static final SubLObject $const2$genls;
  private static final SubLObject $const3$isa;
  private static final SubLSymbol $kw4$ALL;
  private static final SubLObject $const5$interestingSentence;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $kw9$REGION;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$GENLS_FOR_COLLECTIONS;
  private static final SubLSymbol $sym12$RKF_SALIENT_GENERALIZATIONS;
  private static final SubLSymbol $sym13$CYCL_DENOTATIONAL_TERM_P;
  private static final SubLSymbol $sym14$CLOSED_;
  private static final SubLSymbol $sym15$GENL_IN_ANY_MT_;
  private static final SubLSymbol $sym16$_RKF_SALIENT_GENERALIZATIONS_CACHING_STATE_;
  private static final SubLInteger $int17$4096;
  private static final SubLSymbol $sym18$CLEAR_RKF_SALIENT_GENERALIZATIONS;
  private static final SubLObject $const19$mostNotableGenls;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLSymbol $kw22$ASCENDING;
  private static final SubLObject $const23$mostNotableIsa;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLSymbol $kw26$BREADTH;
  private static final SubLSymbol $kw27$QUEUE;
  private static final SubLSymbol $kw28$STACK;
  private static final SubLSymbol $sym29$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw30$ERROR;
  private static final SubLString $str31$_A_is_not_a__A;
  private static final SubLSymbol $sym32$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw33$CERROR;
  private static final SubLString $str34$continue_anyway;
  private static final SubLSymbol $kw35$WARN;
  private static final SubLString $str36$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLString $str37$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str38$attempting_to_bind_direction_link;
  private static final SubLString $str39$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLObject $const40$ClarifyingCollectionType;
  private static final SubLObject $const41$salientTermImagePathname;
  private static final SubLSymbol $sym42$_PATHNAME;
  private static final SubLObject $const43$salientTermsImageRoot;
  private static final SubLSymbol $sym44$_URL;
  private static final SubLObject $const45$Thing;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$_RMP_ARGNUM;
  private static final SubLObject $const48$relatedArgPositions;
  private static final SubLObject $const49$ParaphraseMt;
  private static final SubLObject $const50$SpecsFn;
  private static final SubLObject $const51$SetOrCollection;
  private static final SubLSymbol $sym52$SPEC_;
  private static final SubLString $str53$QuantifiedBinaryPredicateFn;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 986L)
  public static SubLObject rkf_clarifying_sentences(final SubLObject v_term, final SubLObject domain_mt, SubLObject max_count, SubLObject allow_redundant, SubLObject strict_clarification_checkingP)
  {
    if( max_count == UNPROVIDED )
    {
      max_count = $max_rkf_clarifying_sentences$.getGlobalValue();
    }
    if( allow_redundant == UNPROVIDED )
    {
      allow_redundant = NIL;
    }
    if( strict_clarification_checkingP == UNPROVIDED )
    {
      strict_clarification_checkingP = NIL;
    }
    final SubLObject raw_term = parsing_utilities.strip_nl_tags( v_term, UNPROVIDED );
    final SubLObject collectionP = fort_types_interface.isa_collectionP( raw_term, UNPROVIDED );
    final SubLObject isas_or_genlsP = ( NIL != collectionP ) ? $kw0$GENLS : $kw1$ISAS;
    final SubLObject generalizations = rkf_salient_generalizations( raw_term, domain_mt, T, allow_redundant, max_count, strict_clarification_checkingP, isas_or_genlsP );
    SubLObject count = ZERO_INTEGER;
    SubLObject enoughP = NIL;
    SubLObject clarifying_sentences = NIL;
    if( NIL == enoughP )
    {
      SubLObject csome_list_var = generalizations;
      SubLObject generalization = NIL;
      generalization = csome_list_var.first();
      while ( NIL == enoughP && NIL != csome_list_var)
      {
        final SubLObject pred = ( NIL != collectionP ) ? $const2$genls : $const3$isa;
        clarifying_sentences = ConsesLow.cons( el_utilities.make_binary_formula( pred, raw_term, generalization ), clarifying_sentences );
        count = Numbers.add( count, ONE_INTEGER );
        if( max_count.isNumber() && count.numGE( max_count ) )
        {
          enoughP = T;
        }
        csome_list_var = csome_list_var.rest();
        generalization = csome_list_var.first();
      }
    }
    if( NIL != collectionP && NIL == enoughP )
    {
      final SubLObject number_left = max_count.isNumber() ? Numbers.subtract( max_count, count ) : max_count;
      final SubLObject isas = rkf_salient_generalizations( raw_term, domain_mt, T, allow_redundant, number_left, strict_clarification_checkingP, $kw1$ISAS );
      if( NIL == enoughP )
      {
        SubLObject csome_list_var2 = isas;
        SubLObject generalization2 = NIL;
        generalization2 = csome_list_var2.first();
        while ( NIL == enoughP && NIL != csome_list_var2)
        {
          clarifying_sentences = ConsesLow.cons( el_utilities.make_binary_formula( $const3$isa, raw_term, generalization2 ), clarifying_sentences );
          count = Numbers.add( count, ONE_INTEGER );
          if( max_count.isNumber() && count.numGE( max_count ) )
          {
            enoughP = T;
          }
          csome_list_var2 = csome_list_var2.rest();
          generalization2 = csome_list_var2.first();
        }
      }
    }
    if( NIL != forts.fort_p( raw_term ) && NIL != fort_types_interface.predicateP( raw_term ) )
    {
      final SubLObject arg_type_summary = rkf_concept_communicator.rkf_arg_type_summary_cycl_for_pred( raw_term, domain_mt, $kw4$ALL );
      if( NIL != el_utilities.el_formula_p( arg_type_summary ) )
      {
        clarifying_sentences = ConsesLow.cons( arg_type_summary, clarifying_sentences );
      }
    }
    return Sequences.nreverse( clarifying_sentences );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 3041L)
  public static SubLObject rkf_interesting_clarifying_sentences(final SubLObject v_term, final SubLObject domain_mt, SubLObject max_count, SubLObject allow_redundant, SubLObject strict_clarification_checkingP)
  {
    if( max_count == UNPROVIDED )
    {
      max_count = $max_rkf_clarifying_sentences$.getGlobalValue();
    }
    if( allow_redundant == UNPROVIDED )
    {
      allow_redundant = NIL;
    }
    if( strict_clarification_checkingP == UNPROVIDED )
    {
      strict_clarification_checkingP = NIL;
    }
    final SubLObject raw_term = parsing_utilities.strip_nl_tags( v_term, UNPROVIDED );
    final SubLObject interesting_sentences = inference_kernel.new_cyc_query( ConsesLow.listS( $const5$interestingSentence, raw_term, $list6 ), domain_mt, $list7 );
    return separate_isa_or_genls_sentences_from_inference_answer( interesting_sentences );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 3523L)
  public static SubLObject separate_isa_or_genls_sentences_from_inference_answer(final SubLObject v_answer)
  {
    SubLObject isa_genls_sentences = NIL;
    SubLObject other_sentences = NIL;
    SubLObject cdolist_list_var = v_answer;
    SubLObject binding_set = NIL;
    binding_set = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cycl = binding_set.first().rest();
      if( NIL != conses_high.member( cycl_utilities.formula_operator( cycl ), $list8, EQ, UNPROVIDED ) )
      {
        isa_genls_sentences = ConsesLow.cons( cycl, isa_genls_sentences );
      }
      else
      {
        other_sentences = ConsesLow.cons( cycl, other_sentences );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding_set = cdolist_list_var.first();
    }
    return Values.values( isa_genls_sentences, other_sentences );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 3938L)
  public static SubLObject rkf_terms_distinguishing_sentences(final SubLObject terms, final SubLObject domain_mt)
  {
    SubLObject v_answer = NIL;
    SubLObject cdolist_list_var = terms;
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject clarifying_sentences = rkf_clarifying_sentences( v_term, domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject distinguishing_sentence = clarifying_sentences.first();
      v_answer = ConsesLow.cons( ConsesLow.list( v_term, distinguishing_sentence ), v_answer );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return Sequences.nreverse( v_answer );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 4470L)
  public static SubLObject rkf_region_clarification(final SubLObject sub_region, final SubLObject mt)
  {
    SubLObject region = NIL;
    if( NIL == region )
    {
      SubLObject csome_list_var = $list10;
      SubLObject predicate = NIL;
      predicate = csome_list_var.first();
      while ( NIL == region && NIL != csome_list_var)
      {
        final SubLObject query_formula = el_utilities.make_binary_formula( predicate, $kw9$REGION, sub_region );
        region = backward.removal_ask_variable( $kw9$REGION, query_formula, mt, UNPROVIDED, UNPROVIDED );
        csome_list_var = csome_list_var.rest();
        predicate = csome_list_var.first();
      }
    }
    return region;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 5369L)
  public static SubLObject rkf_salient_generalization(final SubLObject v_term, final SubLObject domain_mt)
  {
    return rkf_salient_generalizations( v_term, domain_mt, T, T, ONE_INTEGER, UNPROVIDED, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 5501L)
  public static SubLObject clear_rkf_salient_generalizations()
  {
    final SubLObject cs = $rkf_salient_generalizations_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 5501L)
  public static SubLObject remove_rkf_salient_generalizations(final SubLObject v_term, final SubLObject domain_mt, SubLObject exclusiveP, SubLObject allow_redundantP, SubLObject max_to_return,
      SubLObject strict_clarification_checkingP, SubLObject isas_or_genlsP)
  {
    if( exclusiveP == UNPROVIDED )
    {
      exclusiveP = T;
    }
    if( allow_redundantP == UNPROVIDED )
    {
      allow_redundantP = NIL;
    }
    if( max_to_return == UNPROVIDED )
    {
      max_to_return = $kw4$ALL;
    }
    if( strict_clarification_checkingP == UNPROVIDED )
    {
      strict_clarification_checkingP = T;
    }
    if( isas_or_genlsP == UNPROVIDED )
    {
      isas_or_genlsP = $kw11$GENLS_FOR_COLLECTIONS;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $rkf_salient_generalizations_caching_state$.getGlobalValue(), ConsesLow.list( v_term, domain_mt, exclusiveP, allow_redundantP, max_to_return,
        strict_clarification_checkingP, isas_or_genlsP ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 5501L)
  public static SubLObject rkf_salient_generalizations_internal(final SubLObject v_term, final SubLObject domain_mt, final SubLObject exclusiveP, final SubLObject allow_redundantP, final SubLObject max_to_return,
      final SubLObject strict_clarification_checkingP, SubLObject isas_or_genlsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != cycl_grammar.cycl_denotational_term_p( v_term ) : v_term;
    assert NIL != el_utilities.closedP( v_term, UNPROVIDED ) : v_term;
    SubLObject generalizations = NIL;
    SubLObject enoughP = NIL;
    final SubLObject _prev_bind_0 = control_vars.$cache_inference_results$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$compute_inference_results$.currentBinding( thread );
    final SubLObject _prev_bind_3 = control_vars.$unique_inference_result_bindings$.currentBinding( thread );
    final SubLObject _prev_bind_4 = api_control_vars.$generate_readable_fi_results$.currentBinding( thread );
    try
    {
      control_vars.$cache_inference_results$.bind( NIL, thread );
      control_vars.$compute_inference_results$.bind( NIL, thread );
      control_vars.$unique_inference_result_bindings$.bind( T, thread );
      api_control_vars.$generate_readable_fi_results$.bind( NIL, thread );
      final SubLObject already_seen = set.new_set( EQ, UNPROVIDED );
      if( $kw11$GENLS_FOR_COLLECTIONS == isas_or_genlsP )
      {
        isas_or_genlsP = ( NIL != fort_types_interface.isa_collectionP( v_term, UNPROVIDED ) ) ? $kw0$GENLS : $kw1$ISAS;
      }
      if( isas_or_genlsP == $kw0$GENLS && NIL != rkf_generalization_okP( v_term, v_term, domain_mt, already_seen, exclusiveP, allow_redundantP, strict_clarification_checkingP ) )
      {
        thread.resetMultipleValues();
        final SubLObject generalizations_$1 = rkf_update_generalizations( v_term, generalizations, already_seen, max_to_return );
        final SubLObject enoughP_$2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        generalizations = generalizations_$1;
        enoughP = enoughP_$2;
      }
      final SubLObject _prev_bind_0_$3 = control_vars.$within_assert$.currentBinding( thread );
      final SubLObject _prev_bind_1_$4 = wff_utilities.$check_arg_typesP$.currentBinding( thread );
      final SubLObject _prev_bind_2_$5 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
      final SubLObject _prev_bind_3_$6 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
      final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding( thread );
      final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding( thread );
      final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding( thread );
      final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
      final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
      final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding( thread );
      final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
      try
      {
        control_vars.$within_assert$.bind( NIL, thread );
        wff_utilities.$check_arg_typesP$.bind( NIL, thread );
        at_vars.$at_check_arg_typesP$.bind( NIL, thread );
        wff_utilities.$check_wff_semanticsP$.bind( NIL, thread );
        wff_utilities.$check_wff_coherenceP$.bind( NIL, thread );
        wff_utilities.$check_var_typesP$.bind( NIL, thread );
        czer_vars.$simplify_literalP$.bind( NIL, thread );
        at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
        at_vars.$at_check_arg_formatP$.bind( NIL, thread );
        wff_vars.$validate_constantsP$.bind( NIL, thread );
        system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
        final SubLObject pcase_var = isas_or_genlsP;
        if( pcase_var.eql( $kw0$GENLS ) )
        {
          final SubLObject notable = rkf_most_notable_genls( v_term, domain_mt, allow_redundantP, max_to_return );
          if( NIL == enoughP )
          {
            SubLObject csome_list_var = notable;
            SubLObject generalization = NIL;
            generalization = csome_list_var.first();
            while ( NIL == enoughP && NIL != csome_list_var)
            {
              thread.resetMultipleValues();
              final SubLObject generalizations_$2 = rkf_update_generalizations( generalization, generalizations, already_seen, max_to_return );
              final SubLObject enoughP_$3 = thread.secondMultipleValue();
              thread.resetMultipleValues();
              generalizations = generalizations_$2;
              enoughP = enoughP_$3;
              csome_list_var = csome_list_var.rest();
              generalization = csome_list_var.first();
            }
          }
          if( max_to_return.eql( ONE_INTEGER ) && NIL == enoughP )
          {
            thread.resetMultipleValues();
            final SubLObject generalizations_$3 = rkf_add_most_specific_genl( v_term, already_seen, domain_mt, strict_clarification_checkingP, max_to_return );
            final SubLObject enoughP_$4 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            generalizations = generalizations_$3;
            enoughP = enoughP_$4;
          }
          if( NIL == enoughP )
          {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( domain_mt );
            final SubLObject _prev_bind_0_$4 = mt_relevance_macros.$mt$.currentBinding( thread );
            final SubLObject _prev_bind_1_$5 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_2_$6 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
              mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
              mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
              final SubLObject v_genls = rkf_ontology_utilities.rkf_all_genls( v_term, UNPROVIDED );
              if( NIL == enoughP )
              {
                SubLObject csome_list_var2 = v_genls;
                SubLObject generalization2 = NIL;
                generalization2 = csome_list_var2.first();
                while ( NIL == enoughP && NIL != csome_list_var2)
                {
                  if( NIL != rkf_generalization_okP( generalization2, v_term, domain_mt, already_seen, exclusiveP, allow_redundantP, strict_clarification_checkingP ) )
                  {
                    thread.resetMultipleValues();
                    final SubLObject generalizations_$4 = rkf_update_generalizations( generalization2, generalizations, already_seen, max_to_return );
                    final SubLObject enoughP_$5 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    generalizations = generalizations_$4;
                    enoughP = enoughP_$5;
                  }
                  csome_list_var2 = csome_list_var2.rest();
                  generalization2 = csome_list_var2.first();
                }
              }
            }
            finally
            {
              mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$6, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$5, thread );
              mt_relevance_macros.$mt$.rebind( _prev_bind_0_$4, thread );
            }
          }
        }
        else if( pcase_var.eql( $kw1$ISAS ) )
        {
          thread.resetMultipleValues();
          final SubLObject generalizations_$5 = rkf_add_most_notable_isas( v_term, generalizations, domain_mt, allow_redundantP, max_to_return );
          final SubLObject enoughP_$6 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          generalizations = generalizations_$5;
          enoughP = enoughP_$6;
          if( max_to_return.eql( ONE_INTEGER ) && NIL == enoughP )
          {
            thread.resetMultipleValues();
            final SubLObject generalizations_$6 = rkf_add_most_specific_isa( v_term, already_seen, domain_mt, strict_clarification_checkingP, max_to_return );
            final SubLObject enoughP_$7 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            generalizations = generalizations_$6;
            enoughP = enoughP_$7;
          }
          if( NIL == enoughP )
          {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( domain_mt );
            final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$mt$.currentBinding( thread );
            final SubLObject _prev_bind_1_$6 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
            final SubLObject _prev_bind_2_$7 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
              mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
              mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
              final SubLObject isas = cardinality_estimates.sort_by_generality_estimate( isa.all_isa( v_term, UNPROVIDED, UNPROVIDED ), UNPROVIDED );
              if( NIL == enoughP )
              {
                SubLObject csome_list_var2 = isas;
                SubLObject generalization2 = NIL;
                generalization2 = csome_list_var2.first();
                while ( NIL == enoughP && NIL != csome_list_var2)
                {
                  if( NIL != rkf_generalization_okP( generalization2, v_term, domain_mt, already_seen, exclusiveP, allow_redundantP, strict_clarification_checkingP ) )
                  {
                    thread.resetMultipleValues();
                    final SubLObject generalizations_$7 = rkf_update_generalizations( generalization2, generalizations, already_seen, max_to_return );
                    final SubLObject enoughP_$8 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    generalizations = generalizations_$7;
                    enoughP = enoughP_$8;
                  }
                  csome_list_var2 = csome_list_var2.rest();
                  generalization2 = csome_list_var2.first();
                }
              }
            }
            finally
            {
              mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_2_$7, thread );
              mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_1_$6, thread );
              mt_relevance_macros.$mt$.rebind( _prev_bind_0_$5, thread );
            }
          }
        }
      }
      finally
      {
        system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_11, thread );
        wff_vars.$validate_constantsP$.rebind( _prev_bind_10, thread );
        at_vars.$at_check_arg_formatP$.rebind( _prev_bind_9, thread );
        at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_8, thread );
        czer_vars.$simplify_literalP$.rebind( _prev_bind_7, thread );
        wff_utilities.$check_var_typesP$.rebind( _prev_bind_6, thread );
        wff_utilities.$check_wff_coherenceP$.rebind( _prev_bind_5, thread );
        wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_3_$6, thread );
        at_vars.$at_check_arg_typesP$.rebind( _prev_bind_2_$5, thread );
        wff_utilities.$check_arg_typesP$.rebind( _prev_bind_1_$4, thread );
        control_vars.$within_assert$.rebind( _prev_bind_0_$3, thread );
      }
    }
    finally
    {
      api_control_vars.$generate_readable_fi_results$.rebind( _prev_bind_4, thread );
      control_vars.$unique_inference_result_bindings$.rebind( _prev_bind_3, thread );
      control_vars.$compute_inference_results$.rebind( _prev_bind_2, thread );
      control_vars.$cache_inference_results$.rebind( _prev_bind_0, thread );
    }
    generalizations = Sequences.reverse( generalizations );
    generalizations = Sort.stable_sort( generalizations, Symbols.symbol_function( $sym15$GENL_IN_ANY_MT_ ), UNPROVIDED );
    return max_to_return.isInteger() ? list_utilities.first_n( max_to_return, generalizations ) : generalizations;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 5501L)
  public static SubLObject rkf_salient_generalizations(final SubLObject v_term, final SubLObject domain_mt, SubLObject exclusiveP, SubLObject allow_redundantP, SubLObject max_to_return,
      SubLObject strict_clarification_checkingP, SubLObject isas_or_genlsP)
  {
    if( exclusiveP == UNPROVIDED )
    {
      exclusiveP = T;
    }
    if( allow_redundantP == UNPROVIDED )
    {
      allow_redundantP = NIL;
    }
    if( max_to_return == UNPROVIDED )
    {
      max_to_return = $kw4$ALL;
    }
    if( strict_clarification_checkingP == UNPROVIDED )
    {
      strict_clarification_checkingP = T;
    }
    if( isas_or_genlsP == UNPROVIDED )
    {
      isas_or_genlsP = $kw11$GENLS_FOR_COLLECTIONS;
    }
    SubLObject caching_state = $rkf_salient_generalizations_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym12$RKF_SALIENT_GENERALIZATIONS, $sym16$_RKF_SALIENT_GENERALIZATIONS_CACHING_STATE_, $int17$4096, EQL, SEVEN_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym18$CLEAR_RKF_SALIENT_GENERALIZATIONS );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_7( v_term, domain_mt, exclusiveP, allow_redundantP, max_to_return, strict_clarification_checkingP, isas_or_genlsP );
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
        if( v_term.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( domain_mt.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( exclusiveP.eql( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( allow_redundantP.eql( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( max_to_return.eql( cached_args.first() ) )
                {
                  cached_args = cached_args.rest();
                  if( strict_clarification_checkingP.eql( cached_args.first() ) )
                  {
                    cached_args = cached_args.rest();
                    if( NIL != cached_args && NIL == cached_args.rest() && isas_or_genlsP.eql( cached_args.first() ) )
                    {
                      return memoization_state.caching_results( results2 );
                    }
                  }
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( rkf_salient_generalizations_internal( v_term, domain_mt, exclusiveP, allow_redundantP, max_to_return,
        strict_clarification_checkingP, isas_or_genlsP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, domain_mt, exclusiveP, allow_redundantP, max_to_return, strict_clarification_checkingP,
        isas_or_genlsP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 9254L)
  public static SubLObject rkf_most_notable_genls(final SubLObject v_term, final SubLObject domain_mt, final SubLObject allow_redundantP, final SubLObject max_to_return)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject most_notable_genls = ( NIL != narts_high.naut_p( v_term ) ) ? genls.naut_genls( v_term, domain_mt )
        : ( ( NIL != somewhere_cache.some_pred_assertion_somewhereP( $const19$mostNotableGenls, v_term, ONE_INTEGER, UNPROVIDED ) ) ? inference_kernel.new_cyc_query( ConsesLow.listS( $const19$mostNotableGenls, v_term,
            $list20 ), domain_mt, $list21 ) : NIL );
    final SubLObject already_seen = set.new_set( UNPROVIDED, UNPROVIDED );
    final SubLObject sorted = cardinality_estimates.sort_by_generality_estimate( most_notable_genls, $kw22$ASCENDING );
    SubLObject generalizations = NIL;
    SubLObject enoughP = NIL;
    if( NIL == enoughP )
    {
      SubLObject csome_list_var = sorted;
      SubLObject notable = NIL;
      notable = csome_list_var.first();
      while ( NIL == enoughP && NIL != csome_list_var)
      {
        if( NIL != rkf_generalization_okP( notable, v_term, domain_mt, already_seen, NIL, allow_redundantP, NIL ) )
        {
          thread.resetMultipleValues();
          final SubLObject generalizations_$25 = rkf_update_generalizations( notable, generalizations, already_seen, max_to_return );
          final SubLObject enoughP_$26 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          generalizations = generalizations_$25;
          enoughP = enoughP_$26;
        }
        csome_list_var = csome_list_var.rest();
        notable = csome_list_var.first();
      }
    }
    return Values.values( generalizations, enoughP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 10249L)
  public static SubLObject rkf_add_most_notable_isas(final SubLObject v_term, SubLObject generalizations, final SubLObject domain_mt, final SubLObject allow_redundantP, final SubLObject max_to_return)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject most_notable_isas = ( NIL != forts.fort_p( v_term ) && NIL != somewhere_cache.some_pred_assertion_somewhereP( $const23$mostNotableIsa, v_term, ONE_INTEGER, UNPROVIDED ) ) ? inference_kernel
        .new_cyc_query( ConsesLow.listS( $const23$mostNotableIsa, v_term, $list24 ), domain_mt, $list25 ) : NIL;
    final SubLObject already_seen = set.new_set( UNPROVIDED, UNPROVIDED );
    final SubLObject sorted = cardinality_estimates.sort_by_generality_estimate( most_notable_isas, $kw22$ASCENDING );
    SubLObject enoughP = NIL;
    if( NIL == enoughP )
    {
      SubLObject csome_list_var = sorted;
      SubLObject notable = NIL;
      notable = csome_list_var.first();
      while ( NIL == enoughP && NIL != csome_list_var)
      {
        if( NIL != rkf_generalization_okP( notable, v_term, domain_mt, already_seen, NIL, allow_redundantP, NIL ) )
        {
          thread.resetMultipleValues();
          final SubLObject generalizations_$27 = rkf_update_generalizations( notable, generalizations, already_seen, max_to_return );
          final SubLObject enoughP_$28 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          generalizations = generalizations_$27;
          enoughP = enoughP_$28;
        }
        csome_list_var = csome_list_var.rest();
        notable = csome_list_var.first();
      }
    }
    return Values.values( generalizations, enoughP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 11153L)
  public static SubLObject rkf_add_most_specific_isa(final SubLObject v_term, final SubLObject seen_set, final SubLObject mt, final SubLObject strict_clarification_checkingP, final SubLObject count)
  {
    final SubLObject min_isas = isa.min_isa( v_term, mt, UNPROVIDED );
    final SubLObject min_isa = cardinality_estimates.sort_by_generality_estimate( min_isas, UNPROVIDED ).first();
    final SubLObject okP = rkf_generalization_okP( min_isa, v_term, mt, seen_set, NIL, NIL, strict_clarification_checkingP );
    if( NIL != okP )
    {
      set.set_add( min_isa, seen_set );
      return Values.values( ConsesLow.list( min_isa ), Numbers.numE( count, ONE_INTEGER ) );
    }
    return Values.values( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 11577L)
  public static SubLObject rkf_add_most_specific_genl(final SubLObject v_term, final SubLObject seen_set, final SubLObject mt, final SubLObject strict_clarification_checkingP, final SubLObject count)
  {
    final SubLObject min_genls = genls.min_genls( v_term, mt, UNPROVIDED );
    final SubLObject min_genl = cardinality_estimates.sort_by_generality_estimate( min_genls, UNPROVIDED ).first();
    final SubLObject okP = rkf_generalization_okP( min_genl, v_term, mt, seen_set, NIL, NIL, strict_clarification_checkingP );
    if( NIL != okP )
    {
      set.set_add( min_genl, seen_set );
      return Values.values( ConsesLow.list( min_genl ), Numbers.numE( count, ONE_INTEGER ) );
    }
    return Values.values( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 12010L)
  public static SubLObject rkf_update_generalizations(final SubLObject v_new, final SubLObject generalizations, final SubLObject seen_set, final SubLObject max_to_return)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject updated_generalizations = ( NIL != conses_high.member( v_new, generalizations, Symbols.symbol_function( EQUAL ), UNPROVIDED ) ) ? generalizations : ConsesLow.cons( v_new, generalizations );
    final SubLObject enoughP = makeBoolean( max_to_return.isInteger() && NIL != list_utilities.lengthGE( updated_generalizations, max_to_return, UNPROVIDED ) );
    SubLObject node_var = v_new;
    final SubLObject deck_type = $kw28$STACK;
    final SubLObject recur_deck = deck.create_deck( deck_type );
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$29 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym29$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw30$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str31$_A_is_not_a__A, tv_var, $sym32$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw33$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str34$continue_anyway, $str31$_A_is_not_a__A, tv_var, $sym32$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw35$WARN ) )
            {
              Errors.warn( $str31$_A_is_not_a__A, tv_var, $sym32$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str36$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str34$continue_anyway, $str31$_A_is_not_a__A, tv_var, $sym32$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$30 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
          final SubLObject _prev_bind_1_$31 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
          final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const2$genls ), thread );
            sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const2$genls ) ), thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const2$genls ) ), thread );
            sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
            sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const2$genls ), thread );
            if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( v_new, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
            {
              final SubLObject _prev_bind_0_$31 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
              final SubLObject _prev_bind_1_$32 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
              final SubLObject _prev_bind_2_$34 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                    $const2$genls ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                while ( NIL != node_var)
                {
                  final SubLObject genl = node_var;
                  set.set_add( genl, seen_set );
                  SubLObject cdolist_list_var;
                  final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const2$genls ) );
                  SubLObject module_var = NIL;
                  module_var = cdolist_list_var.first();
                  while ( NIL != cdolist_list_var)
                  {
                    final SubLObject _prev_bind_0_$32 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$33 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    try
                    {
                      sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                          .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                      final SubLObject node = function_terms.naut_to_nart( node_var );
                      if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                      {
                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                        if( NIL != d_link )
                        {
                          final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
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
                                final SubLObject _prev_bind_0_$33 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                  SubLObject iteration_state_$38;
                                  for( iteration_state_$38 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                      iteration_state_$38 ); iteration_state_$38 = dictionary_contents.do_dictionary_contents_next( iteration_state_$38 ) )
                                  {
                                    thread.resetMultipleValues();
                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$38 );
                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                    {
                                      final SubLObject _prev_bind_0_$34 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                        final SubLObject sol = link_nodes;
                                        if( NIL != set.set_p( sol ) )
                                        {
                                          final SubLObject set_contents_var = set.do_set_internal( sol );
                                          SubLObject basis_object;
                                          SubLObject state;
                                          SubLObject node_vars_link_node;
                                          for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                              set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                          {
                                            node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                            if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                UNPROVIDED ) )
                                            {
                                              sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                              deck.deck_push( node_vars_link_node, recur_deck );
                                            }
                                          }
                                        }
                                        else if( sol.isList() )
                                        {
                                          SubLObject csome_list_var = sol;
                                          SubLObject node_vars_link_node2 = NIL;
                                          node_vars_link_node2 = csome_list_var.first();
                                          while ( NIL != csome_list_var)
                                          {
                                            if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                            {
                                              sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                              deck.deck_push( node_vars_link_node2, recur_deck );
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            node_vars_link_node2 = csome_list_var.first();
                                          }
                                        }
                                        else
                                        {
                                          Errors.error( $str37$_A_is_neither_SET_P_nor_LISTP_, sol );
                                        }
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$34, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state_$38 );
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$33, thread );
                                }
                              }
                            }
                            dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                          }
                        }
                        else
                        {
                          sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str38$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                        }
                      }
                      else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                      {
                        SubLObject cdolist_list_var_$40;
                        final SubLObject new_list = cdolist_list_var_$40 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                            .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                UNPROVIDED ) ) )
                            : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                .get_sbhl_module( UNPROVIDED ) ) );
                        SubLObject generating_fn = NIL;
                        generating_fn = cdolist_list_var_$40.first();
                        while ( NIL != cdolist_list_var_$40)
                        {
                          final SubLObject _prev_bind_0_$35 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                          try
                          {
                            sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                            final SubLObject sol2;
                            final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                            if( NIL != set.set_p( sol2 ) )
                            {
                              final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                              SubLObject basis_object2;
                              SubLObject state2;
                              SubLObject node_vars_link_node3;
                              for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                  set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                              {
                                node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3, UNPROVIDED ) )
                                {
                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                  deck.deck_push( node_vars_link_node3, recur_deck );
                                }
                              }
                            }
                            else if( sol2.isList() )
                            {
                              SubLObject csome_list_var2 = sol2;
                              SubLObject node_vars_link_node4 = NIL;
                              node_vars_link_node4 = csome_list_var2.first();
                              while ( NIL != csome_list_var2)
                              {
                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                {
                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                  deck.deck_push( node_vars_link_node4, recur_deck );
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                node_vars_link_node4 = csome_list_var2.first();
                              }
                            }
                            else
                            {
                              Errors.error( $str37$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                            }
                          }
                          finally
                          {
                            sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$35, thread );
                          }
                          cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                          generating_fn = cdolist_list_var_$40.first();
                        }
                      }
                    }
                    finally
                    {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$33, thread );
                      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$32, thread );
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    module_var = cdolist_list_var.first();
                  }
                  node_var = deck.deck_pop( recur_deck );
                }
              }
              finally
              {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$34, thread );
                sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$32, thread );
                sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$31, thread );
              }
            }
            else
            {
              sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str39$Node__a_does_not_pass_sbhl_type_t, v_new, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                  UNPROVIDED );
            }
          }
          finally
          {
            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
            sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$31, thread );
            sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$30, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$29, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$36, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
    }
    return Values.values( updated_generalizations, enoughP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 12452L)
  public static SubLObject rkf_generalization_okP(final SubLObject generalization, final SubLObject v_term, final SubLObject domain_mt, final SubLObject already_seen, final SubLObject exclusiveP,
      final SubLObject allow_redundantP, final SubLObject strict_clarification_checkingP)
  {
    if( NIL != exclusiveP && v_term.equal( generalization ) )
    {
      return NIL;
    }
    if( NIL == allow_redundantP && NIL != set.set_memberP( generalization, already_seen ) )
    {
      return NIL;
    }
    if( NIL != rkf_relevance_utilities.rkf_irrelevant_term( generalization, domain_mt ) )
    {
      return NIL;
    }
    if( NIL != strict_clarification_checkingP )
    {
      return rkf_clarifying_collectionP( generalization, domain_mt );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 13040L)
  public static SubLObject rkf_clarifying_collectionP(final SubLObject generalization, final SubLObject domain_mt)
  {
    return makeBoolean( NIL != forts.fort_p( generalization ) && NIL != isa.isaP( generalization, $const40$ClarifyingCollectionType, domain_mt, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 13218L)
  public static SubLObject rkf_terms_distinguishing_pictures(final SubLObject terms, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    if( NIL != constant_handles.valid_constantP( $const41$salientTermImagePathname, T ) )
    {
      SubLObject cdolist_list_var = terms;
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject image = NIL;
        SubLObject images = NIL;
        final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
        final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding( thread );
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
        final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
        final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding( thread );
        final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding( thread );
        final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding( thread );
        final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
        final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
        final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding( thread );
        final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
        try
        {
          control_vars.$within_assert$.bind( NIL, thread );
          wff_utilities.$check_arg_typesP$.bind( NIL, thread );
          at_vars.$at_check_arg_typesP$.bind( NIL, thread );
          wff_utilities.$check_wff_semanticsP$.bind( NIL, thread );
          wff_utilities.$check_wff_coherenceP$.bind( NIL, thread );
          wff_utilities.$check_var_typesP$.bind( NIL, thread );
          czer_vars.$simplify_literalP$.bind( NIL, thread );
          at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
          at_vars.$at_check_arg_formatP$.bind( NIL, thread );
          wff_vars.$validate_constantsP$.bind( NIL, thread );
          system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
          final SubLObject pathname = $sym42$_PATHNAME;
          images = fi.fi_ask_int( ConsesLow.list( $const41$salientTermImagePathname, v_term, pathname ), domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          image = conses_high.assoc( pathname, images.first(), UNPROVIDED, UNPROVIDED ).rest();
        }
        finally
        {
          system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_11, thread );
          wff_vars.$validate_constantsP$.rebind( _prev_bind_10, thread );
          at_vars.$at_check_arg_formatP$.rebind( _prev_bind_9, thread );
          at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_8, thread );
          czer_vars.$simplify_literalP$.rebind( _prev_bind_7, thread );
          wff_utilities.$check_var_typesP$.rebind( _prev_bind_6, thread );
          wff_utilities.$check_wff_coherenceP$.rebind( _prev_bind_5, thread );
          wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_4, thread );
          at_vars.$at_check_arg_typesP$.rebind( _prev_bind_3, thread );
          wff_utilities.$check_arg_typesP$.rebind( _prev_bind_2, thread );
          control_vars.$within_assert$.rebind( _prev_bind_0, thread );
        }
        if( NIL != image )
        {
          final SubLObject root_url = rkf_terms_distinguishing_picture_database_url( domain_mt );
          SubLObject full_path = NIL;
          if( NIL != root_url )
          {
            full_path = Sequences.cconcatenate( root_url, image );
            v_answer = ConsesLow.cons( ConsesLow.list( v_term, full_path ), v_answer );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 14176L)
  public static SubLObject rkf_terms_distinguishing_picture_database_url(final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    if( NIL != constant_handles.valid_constantP( $const43$salientTermsImageRoot, T ) )
    {
      final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
      final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding( thread );
      final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
      final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
      final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding( thread );
      final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding( thread );
      final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding( thread );
      final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
      final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
      final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding( thread );
      final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
      try
      {
        control_vars.$within_assert$.bind( NIL, thread );
        wff_utilities.$check_arg_typesP$.bind( NIL, thread );
        at_vars.$at_check_arg_typesP$.bind( NIL, thread );
        wff_utilities.$check_wff_semanticsP$.bind( NIL, thread );
        wff_utilities.$check_wff_coherenceP$.bind( NIL, thread );
        wff_utilities.$check_var_typesP$.bind( NIL, thread );
        czer_vars.$simplify_literalP$.bind( NIL, thread );
        at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
        at_vars.$at_check_arg_formatP$.bind( NIL, thread );
        wff_vars.$validate_constantsP$.bind( NIL, thread );
        system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
        final SubLObject url = $sym44$_URL;
        SubLObject v_bindings = NIL;
        v_bindings = fi.fi_ask_int( ConsesLow.list( $const43$salientTermsImageRoot, url ), domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        v_answer = conses_high.assoc( url, v_bindings.first(), UNPROVIDED, UNPROVIDED ).rest();
      }
      finally
      {
        system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_11, thread );
        wff_vars.$validate_constantsP$.rebind( _prev_bind_10, thread );
        at_vars.$at_check_arg_formatP$.rebind( _prev_bind_9, thread );
        at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_8, thread );
        czer_vars.$simplify_literalP$.rebind( _prev_bind_7, thread );
        wff_utilities.$check_var_typesP$.rebind( _prev_bind_6, thread );
        wff_utilities.$check_wff_coherenceP$.rebind( _prev_bind_5, thread );
        wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_4, thread );
        at_vars.$at_check_arg_typesP$.rebind( _prev_bind_3, thread );
        wff_utilities.$check_arg_typesP$.rebind( _prev_bind_2, thread );
        control_vars.$within_assert$.rebind( _prev_bind_0, thread );
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 14761L)
  public static SubLObject rkf_salient_argn_isa(final SubLObject relation, final SubLObject argnum, final SubLObject domain_mt)
  {
    final SubLObject all_isa_cols = rkf_argn_isa( relation, argnum, domain_mt );
    final SubLObject all_genl_cols = rkf_argn_genl( relation, argnum, domain_mt );
    SubLObject csome_list_var = all_isa_cols;
    SubLObject col = NIL;
    col = csome_list_var.first();
    while ( NIL != csome_list_var)
    {
      if( NIL == rkf_relevance_utilities.rkf_irrelevant_term( col, domain_mt ) )
      {
        return col;
      }
      csome_list_var = csome_list_var.rest();
      col = csome_list_var.first();
    }
    csome_list_var = all_genl_cols;
    col = NIL;
    col = csome_list_var.first();
    while ( NIL != csome_list_var)
    {
      if( NIL == rkf_relevance_utilities.rkf_irrelevant_term( col, domain_mt ) )
      {
        return rkf_make_type_level( col );
      }
      csome_list_var = csome_list_var.rest();
      col = csome_list_var.first();
    }
    if( NIL != all_isa_cols )
    {
      return all_isa_cols.first();
    }
    if( NIL != all_genl_cols )
    {
      return all_genl_cols.first();
    }
    return $const45$Thing;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 15451L)
  public static SubLObject rkf_argn_isa(final SubLObject relation, final SubLObject argnum, final SubLObject mt)
  {
    if( NIL == rkf_quantified_binary_predicate_naut_p( relation ) )
    {
      return kb_accessors.argn_isa( relation, argnum, mt );
    }
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.nat_args( relation, UNPROVIDED );
    SubLObject rmp = NIL;
    SubLObject binpred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    rmp = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    binpred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject rmp_argnum = rkf_rmp_corresponding_argnum( rmp, argnum );
      final SubLObject type_levelP = rkf_reln_type_level_in_argP( rmp, rmp_argnum, mt );
      final SubLObject embedded_argn_isa = ( NIL != type_levelP ) ? NIL : rkf_argn_isa( binpred, argnum, mt );
      return embedded_argn_isa;
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list46 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 15999L)
  public static SubLObject rkf_argn_genl(final SubLObject relation, final SubLObject argnum, final SubLObject mt)
  {
    if( NIL == rkf_quantified_binary_predicate_naut_p( relation ) )
    {
      return kb_accessors.argn_genl( relation, argnum, mt );
    }
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.nat_args( relation, UNPROVIDED );
    SubLObject rmp = NIL;
    SubLObject binpred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    rmp = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list46 );
    binpred = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject rmp_argnum = rkf_rmp_corresponding_argnum( rmp, argnum );
      final SubLObject type_levelP = rkf_reln_type_level_in_argP( rmp, rmp_argnum, mt );
      final SubLObject embedded_argn_genl = ( NIL != type_levelP ) ? rkf_argn_isa( binpred, argnum, mt ) : rkf_argn_genl( binpred, argnum, mt );
      return embedded_argn_genl;
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list46 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 16596L)
  public static SubLObject rkf_rmp_corresponding_argnum(final SubLObject rmp, final SubLObject argnum)
  {
    final SubLObject kb_answer = ask_utilities.ask_variable( $sym47$_RMP_ARGNUM, ConsesLow.list( $const48$relatedArgPositions, rmp, $sym47$_RMP_ARGNUM, argnum ), $const49$ParaphraseMt, ZERO_INTEGER, UNPROVIDED,
        UNPROVIDED, UNPROVIDED );
    if( NIL != list_utilities.singletonP( kb_answer ) && NIL != subl_promotions.positive_integer_p( kb_answer.first() ) )
    {
      return kb_answer.first();
    }
    return number_utilities.f_1X( argnum );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 17032L)
  public static SubLObject rkf_arity(final SubLObject reln)
  {
    if( NIL != rkf_quantified_binary_predicate_naut_p( reln ) )
    {
      return rkf_arity( cycl_utilities.nat_arg2( reln, UNPROVIDED ) );
    }
    return ( NIL != arity.arity( reln ) ) ? arity.arity( reln ) : arity.arity_min( reln );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 17229L)
  public static SubLObject rkf_make_type_level(final SubLObject col)
  {
    return el_utilities.make_unary_formula( $const50$SpecsFn, col );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 17409L)
  public static SubLObject rkf_reln_type_level_in_argP(final SubLObject reln, final SubLObject argnum, final SubLObject mt)
  {
    return list_utilities.sublisp_boolean( Sequences.find( $const51$SetOrCollection, kb_accessors.argn_isa( reln, argnum, mt ), $sym52$SPEC_, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-concept-clarifier.lisp", position = 17599L)
  public static SubLObject rkf_quantified_binary_predicate_naut_p(final SubLObject relation)
  {
    return makeBoolean( NIL != el_utilities.possibly_naut_p( relation ) && cycl_utilities.nat_functor( relation ).eql( constants_high.find_constant( $str53$QuantifiedBinaryPredicateFn ) ) );
  }

  public static SubLObject declare_rkf_concept_clarifier_file()
  {
    SubLFiles.declareFunction( me, "rkf_clarifying_sentences", "RKF-CLARIFYING-SENTENCES", 2, 3, false );
    SubLFiles.declareFunction( me, "rkf_interesting_clarifying_sentences", "RKF-INTERESTING-CLARIFYING-SENTENCES", 2, 3, false );
    SubLFiles.declareFunction( me, "separate_isa_or_genls_sentences_from_inference_answer", "SEPARATE-ISA-OR-GENLS-SENTENCES-FROM-INFERENCE-ANSWER", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_terms_distinguishing_sentences", "RKF-TERMS-DISTINGUISHING-SENTENCES", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_region_clarification", "RKF-REGION-CLARIFICATION", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_generalization", "RKF-SALIENT-GENERALIZATION", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_rkf_salient_generalizations", "CLEAR-RKF-SALIENT-GENERALIZATIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_rkf_salient_generalizations", "REMOVE-RKF-SALIENT-GENERALIZATIONS", 2, 5, false );
    SubLFiles.declareFunction( me, "rkf_salient_generalizations_internal", "RKF-SALIENT-GENERALIZATIONS-INTERNAL", 7, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_generalizations", "RKF-SALIENT-GENERALIZATIONS", 2, 5, false );
    SubLFiles.declareFunction( me, "rkf_most_notable_genls", "RKF-MOST-NOTABLE-GENLS", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_add_most_notable_isas", "RKF-ADD-MOST-NOTABLE-ISAS", 5, 0, false );
    SubLFiles.declareFunction( me, "rkf_add_most_specific_isa", "RKF-ADD-MOST-SPECIFIC-ISA", 5, 0, false );
    SubLFiles.declareFunction( me, "rkf_add_most_specific_genl", "RKF-ADD-MOST-SPECIFIC-GENL", 5, 0, false );
    SubLFiles.declareFunction( me, "rkf_update_generalizations", "RKF-UPDATE-GENERALIZATIONS", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_generalization_okP", "RKF-GENERALIZATION-OK?", 7, 0, false );
    SubLFiles.declareFunction( me, "rkf_clarifying_collectionP", "RKF-CLARIFYING-COLLECTION?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_terms_distinguishing_pictures", "RKF-TERMS-DISTINGUISHING-PICTURES", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_terms_distinguishing_picture_database_url", "RKF-TERMS-DISTINGUISHING-PICTURE-DATABASE-URL", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_salient_argn_isa", "RKF-SALIENT-ARGN-ISA", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_argn_isa", "RKF-ARGN-ISA", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_argn_genl", "RKF-ARGN-GENL", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_rmp_corresponding_argnum", "RKF-RMP-CORRESPONDING-ARGNUM", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_arity", "RKF-ARITY", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_make_type_level", "RKF-MAKE-TYPE-LEVEL", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_reln_type_level_in_argP", "RKF-RELN-TYPE-LEVEL-IN-ARG?", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_quantified_binary_predicate_naut_p", "RKF-QUANTIFIED-BINARY-PREDICATE-NAUT-P", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_concept_clarifier_file()
  {
    $max_rkf_clarifying_sentences$ = SubLFiles.deflexical( "*MAX-RKF-CLARIFYING-SENTENCES*", ONE_INTEGER );
    $rkf_salient_generalizations_caching_state$ = SubLFiles.deflexical( "*RKF-SALIENT-GENERALIZATIONS-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_rkf_concept_clarifier_file()
  {
    memoization_state.note_globally_cached_function( $sym12$RKF_SALIENT_GENERALIZATIONS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_concept_clarifier_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_concept_clarifier_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_concept_clarifier_file();
  }
  static
  {
    me = new rkf_concept_clarifier();
    $max_rkf_clarifying_sentences$ = null;
    $rkf_salient_generalizations_caching_state$ = null;
    $kw0$GENLS = makeKeyword( "GENLS" );
    $kw1$ISAS = makeKeyword( "ISAS" );
    $const2$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const3$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $kw4$ALL = makeKeyword( "ALL" );
    $const5$interestingSentence = constant_handles.reader_make_constant_shell( makeString( "interestingSentence" ) );
    $list6 = ConsesLow.list( makeSymbol( "?SENT" ) );
    $list7 = ConsesLow.list( makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), TWO_INTEGER );
    $list8 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ) );
    $kw9$REGION = makeKeyword( "REGION" );
    $list10 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "geographicalSubRegionsOfUSState" ) ), constant_handles.reader_make_constant_shell( makeString(
        "geographicalSubRegionsOfCountry" ) ), constant_handles.reader_make_constant_shell( makeString( "geographicalSubRegionsOfContinent" ) ), constant_handles.reader_make_constant_shell( makeString(
            "geographicalSubRegionsOfBodyOfWater" ) ) );
    $kw11$GENLS_FOR_COLLECTIONS = makeKeyword( "GENLS-FOR-COLLECTIONS" );
    $sym12$RKF_SALIENT_GENERALIZATIONS = makeSymbol( "RKF-SALIENT-GENERALIZATIONS" );
    $sym13$CYCL_DENOTATIONAL_TERM_P = makeSymbol( "CYCL-DENOTATIONAL-TERM-P" );
    $sym14$CLOSED_ = makeSymbol( "CLOSED?" );
    $sym15$GENL_IN_ANY_MT_ = makeSymbol( "GENL-IN-ANY-MT?" );
    $sym16$_RKF_SALIENT_GENERALIZATIONS_CACHING_STATE_ = makeSymbol( "*RKF-SALIENT-GENERALIZATIONS-CACHING-STATE*" );
    $int17$4096 = makeInteger( 4096 );
    $sym18$CLEAR_RKF_SALIENT_GENERALIZATIONS = makeSymbol( "CLEAR-RKF-SALIENT-GENERALIZATIONS" );
    $const19$mostNotableGenls = constant_handles.reader_make_constant_shell( makeString( "mostNotableGenls" ) );
    $list20 = ConsesLow.list( makeSymbol( "?GENLS" ) );
    $list21 = ConsesLow.list( makeKeyword( "RETURN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), makeSymbol( "?GENLS" ) ), makeKeyword( "TRANSFORMATION-ALLOWED?" ), NIL, makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword(
        "HL" ) );
    $kw22$ASCENDING = makeKeyword( "ASCENDING" );
    $const23$mostNotableIsa = constant_handles.reader_make_constant_shell( makeString( "mostNotableIsa" ) );
    $list24 = ConsesLow.list( makeSymbol( "?ISA" ) );
    $list25 = ConsesLow.list( makeKeyword( "RETURN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), makeSymbol( "?ISA" ) ), makeKeyword( "TRANSFORMATION-ALLOWED?" ), NIL, makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword(
        "HL" ) );
    $kw26$BREADTH = makeKeyword( "BREADTH" );
    $kw27$QUEUE = makeKeyword( "QUEUE" );
    $kw28$STACK = makeKeyword( "STACK" );
    $sym29$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw30$ERROR = makeKeyword( "ERROR" );
    $str31$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym32$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw33$CERROR = makeKeyword( "CERROR" );
    $str34$continue_anyway = makeString( "continue anyway" );
    $kw35$WARN = makeKeyword( "WARN" );
    $str36$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $str37$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str38$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str39$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $const40$ClarifyingCollectionType = constant_handles.reader_make_constant_shell( makeString( "ClarifyingCollectionType" ) );
    $const41$salientTermImagePathname = constant_handles.reader_make_constant_shell( makeString( "salientTermImagePathname" ) );
    $sym42$_PATHNAME = makeSymbol( "?PATHNAME" );
    $const43$salientTermsImageRoot = constant_handles.reader_make_constant_shell( makeString( "salientTermsImageRoot" ) );
    $sym44$_URL = makeSymbol( "?URL" );
    $const45$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $list46 = ConsesLow.list( makeSymbol( "RMP" ), makeSymbol( "BINPRED" ) );
    $sym47$_RMP_ARGNUM = makeSymbol( "?RMP-ARGNUM" );
    $const48$relatedArgPositions = constant_handles.reader_make_constant_shell( makeString( "relatedArgPositions" ) );
    $const49$ParaphraseMt = constant_handles.reader_make_constant_shell( makeString( "ParaphraseMt" ) );
    $const50$SpecsFn = constant_handles.reader_make_constant_shell( makeString( "SpecsFn" ) );
    $const51$SetOrCollection = constant_handles.reader_make_constant_shell( makeString( "SetOrCollection" ) );
    $sym52$SPEC_ = makeSymbol( "SPEC?" );
    $str53$QuantifiedBinaryPredicateFn = makeString( "QuantifiedBinaryPredicateFn" );
  }
}
/*
 * 
 * Total time: 610 ms
 * 
 */