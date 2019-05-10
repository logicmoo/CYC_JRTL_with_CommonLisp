package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_assertion_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_assertion_utilities";
  public static final String myFingerPrint = "63b24526759c6c36a244292e29a45b3ce443722c2ced28e0d2345a71a5ec9a06";
  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 2477L)
  private static SubLSymbol $rkf_assertion_attribution_mt_caching_state$;
  private static final SubLString $str0$HYP_RKF;
  private static final SubLSymbol $sym1$RKF_ASSERTION_ATTRIBUTION_MT;
  private static final SubLObject $const2$UIABookkeepingMt;
  private static final SubLObject $const3$BookkeepingMt;
  private static final SubLSymbol $sym4$_RKF_ASSERTION_ATTRIBUTION_MT_CACHING_STATE_;
  private static final SubLObject $const5$ist;
  private static final SubLObject $const6$assertedUsingTool;
  private static final SubLSymbol $kw7$PARTIAL;
  private static final SubLSymbol $sym8$HL_CONJUNCT_TO_SUPPORT;
  private static final SubLList $list9;
  private static final SubLObject $const10$unknownSentence;
  private static final SubLObject $const11$isa;
  private static final SubLObject $const12$disjointWith;
  private static final SubLObject $const13$not;
  private static final SubLSymbol $kw14$ISA;
  private static final SubLObject $const15$genls;
  private static final SubLSymbol $kw16$GENLS;
  private static final SubLSymbol $kw17$DISJOINTWITH;
  private static final SubLSymbol $kw18$OPAQUE;
  private static final SubLObject $const19$rejectedSentence;
  private static final SubLList $list20;
  private static final SubLSymbol $kw21$MT;
  private static final SubLObject $const22$definingMt;
  private static final SubLList $list23;
  private static final SubLObject $const24$InferencePSC;
  private static final SubLList $list25;
  private static final SubLObject $const26$defaultDefiningMtForSentenceOnTer;
  private static final SubLObject $const27$and;
  private static final SubLObject $const28$implies;
  private static final SubLObject $const29$defaultDefiningMtForSentence;
  private static final SubLSymbol $kw30$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $kw31$CONDITIONAL_SENTENCE_;
  private static final SubLSymbol $kw32$ARG;
  private static final SubLObject $const33$argIsa;
  private static final SubLList $list34;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 776L)
  public static SubLObject rkf_assert(final SubLObject formula, SubLObject mt, SubLObject nowP, SubLObject assume_wffP)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    if( nowP == UNPROVIDED )
    {
      nowP = NIL;
    }
    if( assume_wffP == UNPROVIDED )
    {
      assume_wffP = NIL;
    }
    return rkf_assert_int( formula, mt, nowP, assume_wffP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 908L)
  public static SubLObject rkf_assert_now(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    return rkf_assert_int( formula, mt, T, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 1016L)
  public static SubLObject rkf_assert_wff_now(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    return rkf_assert_int( formula, mt, T, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 1126L)
  public static SubLObject rkf_assert_int(final SubLObject formula, final SubLObject mt, final SubLObject nowP, final SubLObject assume_wffP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject successP = NIL;
    SubLObject error = NIL;
    final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding( thread );
    try
    {
      api_control_vars.$use_local_queueP$.bind( NIL, thread );
      Errors.$continue_cerrorP$.bind( T, thread );
      if( NIL != nowP )
      {
        if( NIL != assume_wffP )
        {
          thread.resetMultipleValues();
          final SubLObject successP_$1 = ke.ke_assert_wff_now( formula, mt, UNPROVIDED, UNPROVIDED );
          final SubLObject error_$2 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          successP = successP_$1;
          error = error_$2;
        }
        else
        {
          thread.resetMultipleValues();
          final SubLObject successP_$2 = ke.ke_assert_now( formula, mt, UNPROVIDED, UNPROVIDED );
          final SubLObject error_$3 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          successP = successP_$2;
          error = error_$3;
        }
      }
      else if( NIL != assume_wffP )
      {
        successP = ke.ke_assert( formula, mt, UNPROVIDED, UNPROVIDED );
        error = fi.$fi_error$.getDynamicValue( thread );
      }
      else
      {
        successP = ke.ke_assert( formula, mt, UNPROVIDED, UNPROVIDED );
        error = fi.$fi_error$.getDynamicValue( thread );
      }
    }
    finally
    {
      Errors.$continue_cerrorP$.rebind( _prev_bind_2, thread );
      api_control_vars.$use_local_queueP$.rebind( _prev_bind_0, thread );
    }
    if( NIL != successP )
    {
      final SubLObject tool = rkf_macros.$rkf_asserting_tool$.getDynamicValue( thread );
      if( NIL != tool )
      {
        final SubLObject new_as = czer_meta.find_assertion_cycl( formula, mt );
        if( NIL != assertion_handles.assertion_p( new_as ) )
        {
          rkf_attribute_assertion_to_tool( formula, mt, tool );
        }
      }
      rkf_event_dispatcher.rkf_post_assert_event( formula, mt, NIL, tool );
    }
    return Values.values( successP, error );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 2002L)
  public static SubLObject rkf_hypothesize(final SubLObject formula, final SubLObject domain_mt, SubLObject prefix)
  {
    if( prefix == UNPROVIDED )
    {
      prefix = $str0$HYP_RKF;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject error_string = NIL;
    SubLObject terms = NIL;
    terms = prove.fi_hypothesize_int( formula, domain_mt, prefix, UNPROVIDED );
    if( NIL == terms )
    {
      error_string = fi.fi_error_string( fi.$fi_error$.getDynamicValue( thread ) );
    }
    return Values.values( terms, error_string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 2477L)
  public static SubLObject clear_rkf_assertion_attribution_mt()
  {
    final SubLObject cs = $rkf_assertion_attribution_mt_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 2477L)
  public static SubLObject remove_rkf_assertion_attribution_mt()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $rkf_assertion_attribution_mt_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 2477L)
  public static SubLObject rkf_assertion_attribution_mt_internal()
  {
    return ( NIL != constant_handles.valid_constantP( $const2$UIABookkeepingMt, UNPROVIDED ) ) ? $const2$UIABookkeepingMt : $const3$BookkeepingMt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 2477L)
  public static SubLObject rkf_assertion_attribution_mt()
  {
    SubLObject caching_state = $rkf_assertion_attribution_mt_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym1$RKF_ASSERTION_ATTRIBUTION_MT, $sym4$_RKF_ASSERTION_ATTRIBUTION_MT_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( rkf_assertion_attribution_mt_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 2735L)
  public static SubLObject rkf_attribute_assertion_to_tool(final SubLObject sentence, final SubLObject mt, final SubLObject tool)
  {
    final SubLObject arg_sentence = el_utilities.make_binary_formula( $const5$ist, mt, sentence );
    final SubLObject author_sentence = el_utilities.make_binary_formula( $const6$assertedUsingTool, arg_sentence, tool );
    return ke.ke_assert( author_sentence, rkf_assertion_attribution_mt(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 3122L)
  public static SubLObject rkf_unassert(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = control_vars.$rkf_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    SubLObject el_sentence = NIL;
    if( NIL != assertion_handles.assertion_p( sentence ) )
    {
      el_sentence = uncanonicalizer.assertion_el_formula( sentence );
      mt = assertions_high.assertion_mt( sentence );
      v_answer = ke.ke_unassert_assertion_now( sentence );
    }
    else
    {
      thread.resetMultipleValues();
      final SubLObject assertions = czer_meta.find_assertions_cycl( sentence, mt );
      final SubLObject missingP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      el_sentence = sentence;
      if( NIL == assertions )
      {
        v_answer = NIL;
      }
      else
      {
        v_answer = ke.ke_unassert_now( sentence, mt );
        if( NIL != v_answer && NIL != missingP )
        {
          v_answer = $kw7$PARTIAL;
        }
      }
    }
    if( NIL != v_answer )
    {
      rkf_event_dispatcher.rkf_post_unassert_event( el_sentence, mt, UNPROVIDED, UNPROVIDED );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 3948L)
  public static SubLObject rkf_scenario_assert(final SubLObject formula, final SubLObject mt)
  {
    return rkf_assert( formula, mt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 4129L)
  public static SubLObject rkf_why_not_assertible_compliant(final SubLObject sentence, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
    final SubLObject _prev_bind_2 = wff_vars.$validate_expansionsP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = at_vars.$at_admit_consistent_nautsP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = at_vars.$at_admit_consistent_nartsP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = wff_vars.$include_suf_defn_violationsP$.currentBinding( thread );
    try
    {
      control_vars.$within_assert$.bind( T, thread );
      wff_vars.$validate_expansionsP$.bind( T, thread );
      at_vars.$at_admit_consistent_nautsP$.bind( T, thread );
      at_vars.$at_admit_consistent_nartsP$.bind( NIL, thread );
      wff_vars.$include_suf_defn_violationsP$.bind( NIL, thread );
      result = rkf_supports_for_why_not_wff( sentence, domain_mt );
    }
    finally
    {
      wff_vars.$include_suf_defn_violationsP$.rebind( _prev_bind_5, thread );
      at_vars.$at_admit_consistent_nartsP$.rebind( _prev_bind_4, thread );
      at_vars.$at_admit_consistent_nautsP$.rebind( _prev_bind_3, thread );
      wff_vars.$validate_expansionsP$.rebind( _prev_bind_2, thread );
      control_vars.$within_assert$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 4718L)
  public static SubLObject rkf_supports_for_why_not_wff(final SubLObject sentence, final SubLObject domain_mt)
  {
    return hl_explanation_to_argument( wff.hl_explanation_of_why_not_wff( sentence, domain_mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 4990L)
  public static SubLObject rkf_supports_for_why_not_wft(final SubLObject expression, final SubLObject domain_mt)
  {
    return hl_explanation_to_argument( wff.hl_explanation_of_why_not_wft( expression, domain_mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 5181L)
  public static SubLObject hl_explanation_to_argument(final SubLObject hl_explanation)
  {
    if( NIL == hl_explanation )
    {
      return NIL;
    }
    if( NIL != el_utilities.el_conjunction_p( hl_explanation ) )
    {
      return Sequences.nreverse( Sequences.delete( NIL, Mapping.mapcar( $sym8$HL_CONJUNCT_TO_SUPPORT, cycl_utilities.formula_args( hl_explanation, UNPROVIDED ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED ) );
    }
    return Sequences.delete( NIL, ConsesLow.list( hl_conjunct_to_support( hl_explanation ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 5692L)
  public static SubLObject hl_conjunct_to_support(final SubLObject hl_conjunct)
  {
    if( NIL != arguments.support_p( hl_conjunct ) )
    {
      return hl_conjunct;
    }
    if( NIL != el_utilities.el_formula_with_operator_p( hl_conjunct, $const5$ist ) )
    {
      SubLObject current;
      final SubLObject datum = current = cycl_utilities.formula_args( hl_conjunct, UNPROVIDED );
      SubLObject mt = NIL;
      SubLObject sentence = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
      sentence = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != hlmt.hlmt_p( mt ) && NIL != el_utilities.possibly_sentence_p( sentence ) )
        {
          final SubLObject modified_sentence = fix_hl_conjunct_sentence( sentence, mt );
          final SubLObject hl_support_module = hl_support_module_for_sentence( modified_sentence );
          return arguments.make_hl_support( hl_support_module, modified_sentence, mt, UNPROVIDED );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list9 );
      }
    }
    else if( NIL != el_utilities.possibly_sentence_p( hl_conjunct ) )
    {
      final SubLObject modified_sentence2 = fix_hl_conjunct_sentence( hl_conjunct, UNPROVIDED );
      final SubLObject hl_support_module2 = hl_support_module_for_sentence( modified_sentence2 );
      return arguments.make_hl_support( hl_support_module2, modified_sentence2, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 6505L)
  public static SubLObject fix_hl_conjunct_sentence(SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != disjoint_with_hl_conjunct_sentenceP( sentence ) )
    {
      return hl_conjunct_sentence_to_disjoint_with( sentence );
    }
    if( NIL != el_utilities.el_negation_p( sentence ) && NIL == fi.fi_ask_int( sentence, mt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED ) )
    {
      sentence = el_utilities.make_unary_formula( $const10$unknownSentence, cycl_utilities.formula_arg1( sentence, UNPROVIDED ) );
    }
    return sentence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 6951L)
  public static SubLObject disjoint_with_hl_conjunct_sentenceP(final SubLObject sentence)
  {
    if( NIL != el_utilities.el_negation_p( sentence ) && NIL != el_utilities.el_conjunction_p( cycl_utilities.formula_arg1( sentence, UNPROVIDED ) ) )
    {
      SubLObject failP = NIL;
      SubLObject var = NIL;
      if( NIL == failP )
      {
        SubLObject csome_list_var = cycl_utilities.formula_args( cycl_utilities.formula_arg1( sentence, UNPROVIDED ), UNPROVIDED );
        SubLObject conjunct = NIL;
        conjunct = csome_list_var.first();
        while ( NIL == failP && NIL != csome_list_var)
        {
          if( NIL != el_utilities.el_formula_with_operator_p( conjunct, $const11$isa ) && ( NIL == var || var.eql( cycl_utilities.formula_arg1( conjunct, UNPROVIDED ) ) ) )
          {
            if( NIL == var )
            {
              var = cycl_utilities.formula_arg1( conjunct, UNPROVIDED );
            }
          }
          else
          {
            failP = T;
          }
          csome_list_var = csome_list_var.rest();
          conjunct = csome_list_var.first();
        }
      }
      return makeBoolean( NIL == failP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 7515L)
  public static SubLObject hl_conjunct_sentence_to_disjoint_with(final SubLObject sentence)
  {
    SubLObject disjoint_cols = NIL;
    SubLObject cdolist_list_var = cycl_utilities.formula_args( cycl_utilities.formula_arg1( sentence, UNPROVIDED ), UNPROVIDED );
    SubLObject conjunct = NIL;
    conjunct = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      disjoint_cols = ConsesLow.cons( cycl_utilities.formula_arg2( conjunct, UNPROVIDED ), disjoint_cols );
      cdolist_list_var = cdolist_list_var.rest();
      conjunct = cdolist_list_var.first();
    }
    return el_utilities.make_el_formula( $const12$disjointWith, Sequences.nreverse( disjoint_cols ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 7885L)
  public static SubLObject hl_support_module_for_sentence(final SubLObject sentence)
  {
    final SubLObject pcase_var = cycl_utilities.formula_operator( sentence );
    if( pcase_var.eql( $const13$not ) )
    {
      return hl_support_module_for_sentence( cycl_utilities.formula_arg1( sentence, UNPROVIDED ) );
    }
    if( pcase_var.eql( $const11$isa ) )
    {
      return $kw14$ISA;
    }
    if( pcase_var.eql( $const15$genls ) )
    {
      return $kw16$GENLS;
    }
    if( pcase_var.eql( $const12$disjointWith ) )
    {
      return $kw17$DISJOINTWITH;
    }
    return $kw18$OPAQUE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 8284L)
  public static SubLObject rkf_edit_with_implicature(final SubLObject old_sentence, final SubLObject new_sentence, final SubLObject domain_mt)
  {
    rkf_unassert( old_sentence, domain_mt );
    return rkf_assert_with_implicature( new_sentence, domain_mt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 8849L)
  public static SubLObject rkf_assert_with_implicature(SubLObject sentence, SubLObject domain_mt, SubLObject now)
  {
    if( now == UNPROVIDED )
    {
      now = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject successes = set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject sentence_$5 = czer_utilities.unwrap_if_ist( sentence, domain_mt, UNPROVIDED );
    final SubLObject domain_mt_$6 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    sentence = sentence_$5;
    domain_mt = domain_mt_$6;
    thread.resetMultipleValues();
    final SubLObject successP = rkf_assert_with_implicature_int( sentence, domain_mt, successes, now );
    final SubLObject reason = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( successP, reason, set.set_element_list( successes ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 9677L)
  public static SubLObject rkf_assert_with_implicature_int(final SubLObject sentence, final SubLObject domain_mt, final SubLObject successes, SubLObject now)
  {
    if( now == UNPROVIDED )
    {
      now = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != rkf_assert( sentence, domain_mt, now, UNPROVIDED ) )
    {
      rkf_note_successful_assertion( sentence, successes );
      return Values.values( T, sentence );
    }
    final SubLObject reasons = rkf_why_not_assertible_compliant( sentence, domain_mt );
    SubLObject repairs = ZERO_INTEGER;
    SubLObject cdolist_list_var = reasons;
    SubLObject argument = NIL;
    argument = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      thread.resetMultipleValues();
      final SubLObject can_be_fixedP = rkf_formula_usable_for_implicature_repairP( argument );
      final SubLObject how = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != can_be_fixedP )
      {
        final SubLObject missing_sentence = how;
        if( missing_sentence.equal( sentence ) )
        {
          return Values.values( NIL, el_utilities.make_unary_formula( $const19$rejectedSentence, el_utilities.make_binary_formula( $const5$ist, domain_mt, missing_sentence ) ) );
        }
        if( NIL != rkf_contradiction_finder.rkf_rejected( missing_sentence, domain_mt, UNPROVIDED, UNPROVIDED ) )
        {
          return Values.values( NIL, arguments.support_formula( argument ) );
        }
        if( NIL != rkf_assertion_that_succeededP( missing_sentence, successes ) )
        {
          return Values.values( NIL, el_utilities.make_unary_formula( $const19$rejectedSentence, el_utilities.make_binary_formula( $const5$ist, domain_mt, arguments.support_formula( argument ) ) ) );
        }
        thread.resetMultipleValues();
        final SubLObject successP = rkf_assert_with_implicature_int( missing_sentence, domain_mt, successes, now );
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL == successP )
        {
          return Values.values( NIL, reason );
        }
        repairs = Numbers.add( repairs, ONE_INTEGER );
      }
      cdolist_list_var = cdolist_list_var.rest();
      argument = cdolist_list_var.first();
    }
    if( !repairs.isPositive() )
    {
      return Values.values( NIL, sentence );
    }
    return rkf_assert_with_implicature_int( sentence, domain_mt, successes, now );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 11544L)
  public static SubLObject rkf_note_successful_assertion(final SubLObject sentence, final SubLObject v_set)
  {
    return set.set_add( sentence, v_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 11638L)
  public static SubLObject rkf_assertion_that_succeededP(final SubLObject sentence, final SubLObject v_set)
  {
    return set.set_memberP( sentence, v_set );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 11736L)
  public static SubLObject rkf_formula_usable_for_implicature_repairP(final SubLObject argument)
  {
    final SubLObject module = arguments.support_module( argument );
    final SubLObject formula = arguments.support_sentence( argument );
    if( NIL != hl_supports.opaque_hl_support_p( argument ) && cycl_utilities.formula_arg0( formula ).eql( $const10$unknownSentence ) )
    {
      final SubLObject repair_sentence = cycl_utilities.formula_arg1( formula, UNPROVIDED );
      SubLObject fix_will_workP = T;
      if( NIL != kb_accessors.not_assertible_predicateP( cycl_utilities.formula_arg0( repair_sentence ), UNPROVIDED ) )
      {
        fix_will_workP = NIL;
      }
      return Values.values( fix_will_workP, repair_sentence );
    }
    if( NIL != subl_promotions.memberP( module, $list20, UNPROVIDED, UNPROVIDED ) && cycl_utilities.formula_arg0( formula ).eql( $const13$not ) )
    {
      return Values.values( T, cycl_utilities.formula_arg1( formula, UNPROVIDED ) );
    }
    return Values.values( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 12543L)
  public static SubLObject rkf_best_defining_mt_for_fort(final SubLObject fort, final SubLObject default_mt)
  {
    SubLObject result = NIL;
    final SubLObject default_defining_mts = ask_utilities.query_variable( $kw21$MT, ConsesLow.listS( $const22$definingMt, fort, $list23 ), $const24$InferencePSC, $list25 );
    result = ( ( NIL != default_defining_mts.first() ) ? default_defining_mts.first() : default_mt );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 13008L)
  public static SubLObject rkf_best_defining_mt_for_fort_and_sentence(final SubLObject fort, final SubLObject sentence, final SubLObject default_mt)
  {
    if( NIL != el_utilities.el_formula_p( sentence ) )
    {
      SubLObject result = NIL;
      final SubLObject default_defining_mts = ask_utilities.query_variable( $kw21$MT, ConsesLow.listS( $const26$defaultDefiningMtForSentenceOnTer, sentence, fort, $list23 ), $const24$InferencePSC, $list25 );
      result = ( ( NIL != default_defining_mts.first() ) ? default_defining_mts.first() : default_mt );
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 13673L)
  public static SubLObject rkf_best_defining_mt_for_sentence(final SubLObject sentence, final SubLObject default_mt)
  {
    SubLObject result = NIL;
    final SubLObject presupposed_asserts = rkf_gather_expression_assertion_args( sentence, UNPROVIDED );
    final SubLObject precondition_sentence = ( NIL != presupposed_asserts ) ? ConsesLow.cons( $const27$and, presupposed_asserts ) : NIL;
    final SubLObject query_sentence = ( NIL != precondition_sentence ) ? ConsesLow.list( $const28$implies, precondition_sentence, ConsesLow.listS( $const29$defaultDefiningMtForSentence, sentence, $list23 ) )
        : ConsesLow.listS( $const29$defaultDefiningMtForSentence, sentence, $list23 );
    final SubLObject conditionalP = inference_strategist.inference_conditional_sentence_p( query_sentence );
    final SubLObject default_defining_mts = ask_utilities.query_variable( $kw21$MT, query_sentence, $const24$InferencePSC, ConsesLow.list( $kw30$MAX_TRANSFORMATION_DEPTH, TWO_INTEGER, $kw31$CONDITIONAL_SENTENCE_,
        conditionalP ) );
    result = ( ( NIL != default_defining_mts.first() ) ? default_defining_mts.first() : default_mt );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-assertion-utilities.lisp", position = 14580L)
  public static SubLObject rkf_gather_expression_assertion_args(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject meta_preds = ( NIL != czer_meta.meta_predicateP( cycl_utilities.formula_arg0( sentence ), UNPROVIDED ) ) ? ConsesLow.list( cycl_utilities.formula_arg0( sentence ) ) : NIL;
    SubLObject assertion_args = NIL;
    SubLObject result = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( ( NIL != mt ) ? mt : mt_relevance_macros.$mt$.getDynamicValue( thread ) );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject cdolist_list_var = meta_preds;
      SubLObject pred = NIL;
      pred = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        assertion_args = Sequences.cconcatenate( ask_utilities.ask_variable( $kw32$ARG, ConsesLow.listS( $const33$argIsa, pred, $list34 ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), assertion_args );
        cdolist_list_var = cdolist_list_var.rest();
        pred = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    SubLObject cdolist_list_var2 = assertion_args;
    SubLObject arg_num = NIL;
    arg_num = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      result = ConsesLow.cons( cycl_utilities.formula_arg( sentence, arg_num, UNPROVIDED ), result );
      cdolist_list_var2 = cdolist_list_var2.rest();
      arg_num = cdolist_list_var2.first();
    }
    return result;
  }

  public static SubLObject declare_rkf_assertion_utilities_file()
  {
    SubLFiles.declareFunction( me, "rkf_assert", "RKF-ASSERT", 1, 3, false );
    SubLFiles.declareFunction( me, "rkf_assert_now", "RKF-ASSERT-NOW", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_assert_wff_now", "RKF-ASSERT-WFF-NOW", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_assert_int", "RKF-ASSERT-INT", 4, 0, false );
    SubLFiles.declareFunction( me, "rkf_hypothesize", "RKF-HYPOTHESIZE", 2, 1, false );
    SubLFiles.declareFunction( me, "clear_rkf_assertion_attribution_mt", "CLEAR-RKF-ASSERTION-ATTRIBUTION-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_rkf_assertion_attribution_mt", "REMOVE-RKF-ASSERTION-ATTRIBUTION-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "rkf_assertion_attribution_mt_internal", "RKF-ASSERTION-ATTRIBUTION-MT-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "rkf_assertion_attribution_mt", "RKF-ASSERTION-ATTRIBUTION-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "rkf_attribute_assertion_to_tool", "RKF-ATTRIBUTE-ASSERTION-TO-TOOL", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_unassert", "RKF-UNASSERT", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_scenario_assert", "RKF-SCENARIO-ASSERT", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_why_not_assertible_compliant", "RKF-WHY-NOT-ASSERTIBLE-COMPLIANT", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_supports_for_why_not_wff", "RKF-SUPPORTS-FOR-WHY-NOT-WFF", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_supports_for_why_not_wft", "RKF-SUPPORTS-FOR-WHY-NOT-WFT", 2, 0, false );
    SubLFiles.declareFunction( me, "hl_explanation_to_argument", "HL-EXPLANATION-TO-ARGUMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_conjunct_to_support", "HL-CONJUNCT-TO-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "fix_hl_conjunct_sentence", "FIX-HL-CONJUNCT-SENTENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "disjoint_with_hl_conjunct_sentenceP", "DISJOINT-WITH-HL-CONJUNCT-SENTENCE?", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_conjunct_sentence_to_disjoint_with", "HL-CONJUNCT-SENTENCE-TO-DISJOINT-WITH", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_support_module_for_sentence", "HL-SUPPORT-MODULE-FOR-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_edit_with_implicature", "RKF-EDIT-WITH-IMPLICATURE", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_assert_with_implicature", "RKF-ASSERT-WITH-IMPLICATURE", 2, 1, false );
    SubLFiles.declareFunction( me, "rkf_assert_with_implicature_int", "RKF-ASSERT-WITH-IMPLICATURE-INT", 3, 1, false );
    SubLFiles.declareFunction( me, "rkf_note_successful_assertion", "RKF-NOTE-SUCCESSFUL-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_assertion_that_succeededP", "RKF-ASSERTION-THAT-SUCCEEDED?", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_formula_usable_for_implicature_repairP", "RKF-FORMULA-USABLE-FOR-IMPLICATURE-REPAIR?", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_best_defining_mt_for_fort", "RKF-BEST-DEFINING-MT-FOR-FORT", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_best_defining_mt_for_fort_and_sentence", "RKF-BEST-DEFINING-MT-FOR-FORT-AND-SENTENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "rkf_best_defining_mt_for_sentence", "RKF-BEST-DEFINING-MT-FOR-SENTENCE", 2, 0, false );
    SubLFiles.declareFunction( me, "rkf_gather_expression_assertion_args", "RKF-GATHER-EXPRESSION-ASSERTION-ARGS", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_rkf_assertion_utilities_file()
  {
    $rkf_assertion_attribution_mt_caching_state$ = SubLFiles.deflexical( "*RKF-ASSERTION-ATTRIBUTION-MT-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_rkf_assertion_utilities_file()
  {
    memoization_state.note_globally_cached_function( $sym1$RKF_ASSERTION_ATTRIBUTION_MT );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_assertion_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_assertion_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_assertion_utilities_file();
  }
  static
  {
    me = new rkf_assertion_utilities();
    $rkf_assertion_attribution_mt_caching_state$ = null;
    $str0$HYP_RKF = makeString( "HYP-RKF" );
    $sym1$RKF_ASSERTION_ATTRIBUTION_MT = makeSymbol( "RKF-ASSERTION-ATTRIBUTION-MT" );
    $const2$UIABookkeepingMt = constant_handles.reader_make_constant_shell( makeString( "UIABookkeepingMt" ) );
    $const3$BookkeepingMt = constant_handles.reader_make_constant_shell( makeString( "BookkeepingMt" ) );
    $sym4$_RKF_ASSERTION_ATTRIBUTION_MT_CACHING_STATE_ = makeSymbol( "*RKF-ASSERTION-ATTRIBUTION-MT-CACHING-STATE*" );
    $const5$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $const6$assertedUsingTool = constant_handles.reader_make_constant_shell( makeString( "assertedUsingTool" ) );
    $kw7$PARTIAL = makeKeyword( "PARTIAL" );
    $sym8$HL_CONJUNCT_TO_SUPPORT = makeSymbol( "HL-CONJUNCT-TO-SUPPORT" );
    $list9 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "SENTENCE" ) );
    $const10$unknownSentence = constant_handles.reader_make_constant_shell( makeString( "unknownSentence" ) );
    $const11$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const12$disjointWith = constant_handles.reader_make_constant_shell( makeString( "disjointWith" ) );
    $const13$not = constant_handles.reader_make_constant_shell( makeString( "not" ) );
    $kw14$ISA = makeKeyword( "ISA" );
    $const15$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $kw16$GENLS = makeKeyword( "GENLS" );
    $kw17$DISJOINTWITH = makeKeyword( "DISJOINTWITH" );
    $kw18$OPAQUE = makeKeyword( "OPAQUE" );
    $const19$rejectedSentence = constant_handles.reader_make_constant_shell( makeString( "rejectedSentence" ) );
    $list20 = ConsesLow.list( makeKeyword( "ISA" ), makeKeyword( "GENLS" ) );
    $kw21$MT = makeKeyword( "MT" );
    $const22$definingMt = constant_handles.reader_make_constant_shell( makeString( "definingMt" ) );
    $list23 = ConsesLow.list( makeKeyword( "MT" ) );
    $const24$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $list25 = ConsesLow.list( makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), TWO_INTEGER );
    $const26$defaultDefiningMtForSentenceOnTer = constant_handles.reader_make_constant_shell( makeString( "defaultDefiningMtForSentenceOnTerm" ) );
    $const27$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const28$implies = constant_handles.reader_make_constant_shell( makeString( "implies" ) );
    $const29$defaultDefiningMtForSentence = constant_handles.reader_make_constant_shell( makeString( "defaultDefiningMtForSentence" ) );
    $kw30$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw31$CONDITIONAL_SENTENCE_ = makeKeyword( "CONDITIONAL-SENTENCE?" );
    $kw32$ARG = makeKeyword( "ARG" );
    $const33$argIsa = constant_handles.reader_make_constant_shell( makeString( "argIsa" ) );
    $list34 = ConsesLow.list( makeKeyword( "ARG" ), constant_handles.reader_make_constant_shell( makeString( "CycLAssertion" ) ) );
  }
}
/*
 * 
 * Total time: 264 ms
 * 
 */