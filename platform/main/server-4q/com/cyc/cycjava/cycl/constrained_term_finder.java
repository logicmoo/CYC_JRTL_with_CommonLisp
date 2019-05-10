package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class constrained_term_finder
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.constrained_term_finder";
  public static final String myFingerPrint = "25a32c1181bf144f20d83b0ccc81fe98b6e261327117e838e8fee1b92ad267e3";
  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 2016L)
  public static SubLSymbol $constrained_term_finder_queries_browsableP$;
  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 2446L)
  private static SubLSymbol $constraint_match_ignore_vars$;
  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 3142L)
  private static SubLSymbol $constraint_match_constraints$;
  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 3200L)
  private static SubLSymbol $expand_spatially_transitive_constraintsP$;
  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 3290L)
  private static SubLSymbol $spatially_transitive_constraints$;
  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 14742L)
  private static SubLSymbol $fuzzy_quantity_functions$;
  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 19008L)
  public static SubLSymbol $use_mt_and_dims_variablesP$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$EL_VAR_;
  private static final SubLSymbol $sym2$LISTP;
  private static final SubLSymbol $sym3$HLMT_P;
  private static final SubLSymbol $sym4$PROPERTY_LIST_P;
  private static final SubLSymbol $kw5$ANSWER_LANGUAGE;
  private static final SubLSymbol $kw6$HL;
  private static final SubLSymbol $kw7$PROBABLY_APPROXIMATELY_DONE;
  private static final SubLFloat $float8$1_0;
  private static final SubLSymbol $kw9$NEW_TERMS_ALLOWED_;
  private static final SubLSymbol $kw10$BROWSABLE_;
  private static final SubLSymbol $sym11$CLET;
  private static final SubLList $list12;
  private static final SubLString $str13$___A_D;
  private static final SubLSymbol $kw14$UNBOUND;
  private static final SubLObject $const15$ist_Intermediate;
  private static final SubLSymbol $kw16$TRUE;
  private static final SubLSymbol $kw17$CASE_INSENSITIVE;
  private static final SubLSymbol $kw18$REGULAR_EXPRESSIONS;
  private static final SubLObject $const19$temporallySubsumes;
  private static final SubLSymbol $sym20$REGULAR_EXPRESSION_STRING_P;
  private static final SubLSymbol $sym21$NON_REGULAR_EXPRESSION_STRING_P;
  private static final SubLSymbol $sym22$CONSTRAINT_MATCH_FUZZY_QUANTITY_NAT_P;
  private static final SubLSymbol $sym23$CONSTRAINT_MATCH_SOME_FN_TERM_P;
  private static final SubLSymbol $sym24$CONSTRAINT_MATCH_INFN_TERNARY_TERM_P;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$ARG0;
  private static final SubLSymbol $sym27$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const28$EverythingPSC;
  private static final SubLObject $const29$transitiveViaArgInverse;
  private static final SubLSymbol $kw30$GAF;
  private static final SubLSymbol $sym31$_DATE;
  private static final SubLSymbol $sym32$SPATIALLY_TRANSITIVE_CONSTRAINT_;
  private static final SubLSymbol $sym33$TRANSFORM_SPATIALLY_TRANSITIVE_CONSTRAINT;
  private static final SubLObject $const34$geographicallySubsumes;
  private static final SubLSymbol $sym35$_PLACE;
  private static final SubLSymbol $sym36$_REFSPEC;
  private static final SubLSymbol $sym37$_ASSERTION;
  private static final SubLSymbol $sym38$CONSTRAINT_MATCH_MT_TEMPORAL_CONSTRAINT_;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$BOUNDING_TIME_INTERVAL;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$END;
  private static final SubLSymbol $sym43$START;
  private static final SubLList $list44;
  private static final SubLList $list45;
  private static final SubLList $list46;
  private static final SubLObject $const47$IntervalOfTypeMinFn;
  private static final SubLObject $const48$greaterThanOrEqualTo;
  private static final SubLObject $const49$IntervalOfTypeMaxFn;
  private static final SubLObject $const50$lessThanOrEqualTo;
  private static final SubLObject $const51$ApproximatelyFn;
  private static final SubLObject $const52$TimesFn;
  private static final SubLList $list53;
  private static final SubLList $list54;
  private static final SubLObject $const55$AlmostFn;
  private static final SubLObject $const56$lessThan;
  private static final SubLObject $const57$Unity;
  private static final SubLObject $const58$IntervalRangeFn;
  private static final SubLList $list59;
  private static final SubLString $str60$QUANTITY;
  private static final SubLString $str61$INSTANCE;
  private static final SubLObject $const62$SomeFn;
  private static final SubLObject $const63$Thing;
  private static final SubLObject $const64$isa;
  private static final SubLList $list65;
  private static final SubLString $str66$GUID;
  private static final SubLObject $const67$InstanceNamedFn_Ternary;
  private static final SubLObject $const68$trueSentence_CaseInsensitive;
  private static final SubLObject $const69$ist;
  private static final SubLList $list70;
  private static final SubLList $list71;
  private static final SubLSymbol $sym72$DATE_VAR;
  private static final SubLSymbol $sym73$TEMPORAL_MT;
  private static final SubLList $list74;
  private static final SubLSymbol $sym75$DATE;
  private static final SubLObject $const76$AnytimeDuringPSCFn;
  private static final SubLString $str77$MT;
  private static final SubLString $str78$MT_DIMS;
  private static final SubLObject $const79$MtSpace;
  private static final SubLObject $const80$ist_Asserted;
  private static final SubLObject $const81$and;
  private static final SubLObject $const82$MtUnionFn;
  private static final SubLObject $const83$genlMt;
  private static final SubLObject $const84$regexStringMatch_CaseInsensitive;
  private static final SubLObject $const85$regexStringMatch;
  private static final SubLSymbol $sym86$UNPARSABLE_INSTANCE_EXPRESSION_P;
  private static final SubLString $str87$STANDIN;
  private static final SubLObject $const88$termStrings;
  private static final SubLString $str89$REGEX;
  private static final SubLObject $const90$assertionProducedByReformulation;

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 1072L)
  public static SubLObject find_terms_matching_constraints(final SubLObject term_variable, final SubLObject constraints, final SubLObject mt, SubLObject string_match_options, SubLObject non_reformulatable_constraints)
  {
    if( string_match_options == UNPROVIDED )
    {
      string_match_options = $list0;
    }
    if( non_reformulatable_constraints == UNPROVIDED )
    {
      non_reformulatable_constraints = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != cycl_variables.el_varP( term_variable ) : term_variable;
    assert NIL != Types.listp( constraints ) : constraints;
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    assert NIL != list_utilities.property_list_p( string_match_options ) : string_match_options;
    thread.resetMultipleValues();
    final SubLObject query_sentence = build_constraint_match_query_from_constraints_and_options( term_variable, constraints, string_match_options, mt, non_reformulatable_constraints );
    final SubLObject ignored_constraints = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return find_terms_matching_constraints_perform_query( term_variable, query_sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 2088L)
  public static SubLObject find_terms_matching_constraints_perform_query(final SubLObject term_variable, final SubLObject query_sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_properties = ConsesLow.list( $kw5$ANSWER_LANGUAGE, $kw6$HL, $kw7$PROBABLY_APPROXIMATELY_DONE, $float8$1_0, $kw9$NEW_TERMS_ALLOWED_, NIL, $kw10$BROWSABLE_,
        $constrained_term_finder_queries_browsableP$.getDynamicValue( thread ) );
    return ask_utilities.query_variable( term_variable, query_sentence, mt, v_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 2556L)
  public static SubLObject with_new_constraint_match_ignore_vars(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym11$CLET, $list12, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 2699L)
  public static SubLObject new_constraint_match_ignore_var(final SubLObject stem)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject index = ZERO_INTEGER;
    SubLObject variable = NIL;
    while ( NIL == variable)
    {
      final SubLObject guessed_variable_name = PrintLow.format( NIL, $str13$___A_D, stem, index );
      final SubLObject el_var = cycl_variables.make_el_var( guessed_variable_name );
      if( NIL == subl_promotions.memberP( el_var, $constraint_match_ignore_vars$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
      {
        variable = el_var;
      }
      index = Numbers.add( index, ONE_INTEGER );
    }
    $constraint_match_ignore_vars$.setDynamicValue( ConsesLow.cons( variable, $constraint_match_ignore_vars$.getDynamicValue( thread ) ), thread );
    return variable;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 3357L)
  public static SubLObject constraint_match_constraint_variable_mentioned_in_mt_p(final SubLObject constraint)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject vars = cycl_utilities.expression_gather( constraint, $sym1$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == ans )
    {
      SubLObject csome_list_var = vars;
      SubLObject var = NIL;
      var = csome_list_var.first();
      while ( NIL == ans && NIL != csome_list_var)
      {
        if( NIL == ans )
        {
          SubLObject csome_list_var_$1 = $constraint_match_constraints$.getDynamicValue( thread );
          SubLObject constraint_$2 = NIL;
          constraint_$2 = csome_list_var_$1.first();
          while ( NIL == ans && NIL != csome_list_var_$1)
          {
            if( NIL != el_utilities.el_formula_with_operator_p( constraint_$2, $const15$ist_Intermediate ) && NIL != cycl_utilities.expression_find( var, constraint_$2, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
            {
              ans = T;
            }
            csome_list_var_$1 = csome_list_var_$1.rest();
            constraint_$2 = csome_list_var_$1.first();
          }
        }
        csome_list_var = csome_list_var.rest();
        var = csome_list_var.first();
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 3748L)
  public static SubLObject build_constraint_match_query_from_constraints_and_options(final SubLObject term_variable, final SubLObject constraints, final SubLObject string_match_options, final SubLObject domain_mt,
      final SubLObject non_reformulatable_constraints)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject case_insensitiveP = Equality.eq( $kw16$TRUE, conses_high.getf( string_match_options, $kw17$CASE_INSENSITIVE, UNPROVIDED ) );
    final SubLObject regular_expressionsP = makeBoolean( NIL != regular_expressions.is_regular_expressions_support_availableP() && $kw16$TRUE == conses_high.getf( string_match_options, $kw18$REGULAR_EXPRESSIONS,
        UNPROVIDED ) );
    SubLObject query_conjuncts = NIL;
    SubLObject ignored_constraints = NIL;
    SubLObject query_sentence = NIL;
    final SubLObject _prev_bind_0 = $constraint_match_ignore_vars$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $constraint_match_constraints$.currentBinding( thread );
    try
    {
      $constraint_match_ignore_vars$.bind( NIL, thread );
      $constraint_match_constraints$.bind( constraints, thread );
      SubLObject cdolist_list_var = constraints;
      SubLObject constraint = NIL;
      constraint = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject transformed = transform_constraint_match_query_constraint( term_variable, constraint, case_insensitiveP, regular_expressionsP, domain_mt, T );
        if( NIL != transformed )
        {
          query_conjuncts = ConsesLow.cons( transformed, query_conjuncts );
        }
        else
        {
          ignored_constraints = ConsesLow.cons( constraint, ignored_constraints );
        }
        cdolist_list_var = cdolist_list_var.rest();
        constraint = cdolist_list_var.first();
      }
      cdolist_list_var = non_reformulatable_constraints;
      constraint = NIL;
      constraint = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject transformed = transform_constraint_match_query_constraint( term_variable, constraint, case_insensitiveP, regular_expressionsP, domain_mt, NIL );
        if( NIL != transformed )
        {
          query_conjuncts = ConsesLow.cons( transformed, query_conjuncts );
        }
        else
        {
          ignored_constraints = ConsesLow.cons( constraint, ignored_constraints );
        }
        cdolist_list_var = cdolist_list_var.rest();
        constraint = cdolist_list_var.first();
      }
      query_sentence = simplifier.conjoin( Sequences.nreverse( query_conjuncts ), UNPROVIDED );
    }
    finally
    {
      $constraint_match_constraints$.rebind( _prev_bind_2, thread );
      $constraint_match_ignore_vars$.rebind( _prev_bind_0, thread );
    }
    SubLObject cdolist_list_var2 = obsolete.formula_free_variables( query_sentence, ConsesLow.list( term_variable ), $sym1$EL_VAR_, UNPROVIDED );
    SubLObject ignore_var = NIL;
    ignore_var = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      query_sentence = el_utilities.make_existential( ignore_var, query_sentence );
      cdolist_list_var2 = cdolist_list_var2.rest();
      ignore_var = cdolist_list_var2.first();
    }
    return Values.values( query_sentence, ignored_constraints );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 5396L)
  public static SubLObject constraint_match_mt_temporal_constraintP(final SubLObject constraint)
  {
    return makeBoolean( NIL != el_utilities.el_formula_with_operator_p( constraint, $const19$temporallySubsumes ) && NIL != constraint_match_constraint_variable_mentioned_in_mt_p( constraint ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 5725L)
  public static SubLObject constraint_match_temporal_constraint_on_mt_constraintP(final SubLObject temporal_constraint, final SubLObject mt_constraint)
  {
    final SubLObject var = cycl_utilities.formula_arg2( temporal_constraint, UNPROVIDED );
    return makeBoolean( NIL != cycl_variables.el_varP( var ) && NIL != cycl_utilities.expression_find( var, mt_constraint, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 6050L)
  public static SubLObject transform_constraint_match_query_constraint(final SubLObject term_variable, SubLObject constraint, final SubLObject case_insensitiveP, final SubLObject regular_expressionsP,
      final SubLObject domain_mt, final SubLObject check_reformulatedP)
  {
    final SubLObject original_constraint = el_utilities.copy_expression( constraint );
    if( NIL != constraint_match_mt_temporal_constraintP( constraint ) )
    {
      constraint = NIL;
    }
    else if( NIL != el_utilities.el_formula_with_operator_p( constraint, $const15$ist_Intermediate ) )
    {
      constraint = transform_temporal_qualification_on_query_constraint( constraint, domain_mt );
    }
    else if( NIL != temporally_transitive_constraintP( constraint, domain_mt ) )
    {
      constraint = transform_temporally_transitive_constraint( constraint );
    }
    if( NIL != constraint && NIL != regular_expressionsP && NIL != cycl_utilities.expression_find_if( Symbols.symbol_function( $sym20$REGULAR_EXPRESSION_STRING_P ), constraint, UNPROVIDED, UNPROVIDED ) )
    {
      constraint = add_regular_expression_marker_to_query_constraint( constraint, case_insensitiveP );
    }
    if( NIL != constraint && NIL != case_insensitiveP && ( NIL == regular_expressionsP || NIL != cycl_utilities.expression_find_if( Symbols.symbol_function( $sym21$NON_REGULAR_EXPRESSION_STRING_P ), constraint,
        UNPROVIDED, UNPROVIDED ) ) && NIL != el_utilities.sentence_has_nontrivial_true_sentence_case_insensitive_supportP( constraint ) )
    {
      constraint = add_case_insensitivity_marker_to_query_constraint( constraint );
    }
    while ( NIL != cycl_utilities.expression_find_if( $sym22$CONSTRAINT_MATCH_FUZZY_QUANTITY_NAT_P, constraint, UNPROVIDED, UNPROVIDED ))
    {
      constraint = transform_constraint_match_fuzzy_quantity_constraint( constraint );
    }
    for( constraint = constraint_match_reformulate_temporal_constraint( constraint ), constraint = transform_spatially_transitive_constraints( constraint ); NIL != cycl_utilities.expression_find_if(
        $sym23$CONSTRAINT_MATCH_SOME_FN_TERM_P, constraint, UNPROVIDED, UNPROVIDED ); constraint = transform_constraint_match_some_fn_term( constraint ) )
    {
    }
    if( NIL != check_reformulatedP && NIL != constraint )
    {
      constraint = constraint_match_constraint_add_reformulation_option( term_variable, constraint, original_constraint );
    }
    while ( NIL != cycl_utilities.expression_find_if( $sym24$CONSTRAINT_MATCH_INFN_TERNARY_TERM_P, constraint, UNPROVIDED, UNPROVIDED ))
    {
      constraint = transform_constraint_match_infn_ternary_term( constraint );
    }
    return constraint;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 9253L)
  public static SubLObject temporally_transitive_constraintP(final SubLObject constraint, final SubLObject mt)
  {
    return transitive_constraintP( constraint, $const19$temporallySubsumes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 9400L)
  public static SubLObject transitive_constraintP(final SubLObject constraint, final SubLObject transitive_pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    thread.resetMultipleValues();
    final SubLObject success = formula_pattern_match.formula_matches_pattern( constraint, $list25 );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject arg0 = list_utilities.alist_lookup_without_values( v_bindings, $sym26$ARG0, UNPROVIDED, UNPROVIDED );
      if( !arg0.eql( transitive_pred ) )
      {
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$relevant_mt_function$.bind( $sym27$RELEVANT_MT_IS_EVERYTHING, thread );
          mt_relevance_macros.$mt$.bind( $const28$EverythingPSC, thread );
          final SubLObject pred_var = $const29$transitiveViaArgInverse;
          if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( arg0, NIL, pred_var ) )
          {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( arg0, NIL, pred_var );
            SubLObject done_var = ans;
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
                  final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw30$GAF, NIL, NIL );
                  SubLObject done_var_$3 = ans;
                  final SubLObject token_var_$4 = NIL;
                  while ( NIL == done_var_$3)
                  {
                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$4 );
                    final SubLObject valid_$5 = makeBoolean( !token_var_$4.eql( gaf ) );
                    if( NIL != valid_$5 )
                    {
                      ans = makeBoolean( transitive_pred.eql( assertions_high.gaf_arg2( gaf ) ) && TWO_INTEGER.eql( assertions_high.gaf_arg3( gaf ) ) );
                    }
                    done_var_$3 = makeBoolean( NIL == valid_$5 || NIL != ans );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
                  }
                }
              }
              done_var = makeBoolean( NIL == valid || NIL != ans );
            }
          }
        }
        finally
        {
          mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
        }
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 9898L)
  public static SubLObject transform_temporally_transitive_constraint(final SubLObject constraint)
  {
    final SubLObject date_var = czer_utilities.unique_el_var_wrt_expression( constraint, $sym31$_DATE );
    final SubLObject varified_original = el_utilities.replace_formula_arg( TWO_INTEGER, date_var, constraint );
    final SubLObject subsumption_constraint = ConsesLow.list( $const19$temporallySubsumes, cycl_utilities.formula_arg2( constraint, UNPROVIDED ), date_var );
    return el_utilities.make_existential( date_var, simplifier.conjoin( ConsesLow.list( varified_original, subsumption_constraint ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 10303L)
  public static SubLObject transform_spatially_transitive_constraints(SubLObject constraint)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $expand_spatially_transitive_constraintsP$.getDynamicValue( thread ) )
    {
      final SubLObject _prev_bind_0 = $spatially_transitive_constraints$.currentBinding( thread );
      try
      {
        $spatially_transitive_constraints$.bind( NIL, thread );
        constraint = cycl_utilities.expression_transform( constraint, $sym32$SPATIALLY_TRANSITIVE_CONSTRAINT_, $sym33$TRANSFORM_SPATIALLY_TRANSITIVE_CONSTRAINT, UNPROVIDED, UNPROVIDED );
        SubLObject cdolist_list_var = $spatially_transitive_constraints$.getDynamicValue( thread );
        SubLObject spatially_transitive_constraint = NIL;
        spatially_transitive_constraint = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject place_var = cycl_utilities.formula_arg2( spatially_transitive_constraint, UNPROVIDED );
          constraint = el_utilities.make_existential( place_var, simplifier.conjoin( ConsesLow.list( spatially_transitive_constraint, constraint ), UNPROVIDED ) );
          cdolist_list_var = cdolist_list_var.rest();
          spatially_transitive_constraint = cdolist_list_var.first();
        }
      }
      finally
      {
        $spatially_transitive_constraints$.rebind( _prev_bind_0, thread );
      }
    }
    return constraint;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 10947L)
  public static SubLObject spatially_transitive_constraintP(final SubLObject constraint)
  {
    return transitive_constraintP( constraint, $const34$geographicallySubsumes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 11080L)
  public static SubLObject transform_spatially_transitive_constraint(final SubLObject constraint)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject place_var = czer_utilities.unique_el_var_wrt_expression( constraint, $sym35$_PLACE );
    if( $spatially_transitive_constraints$.getDynamicValue( thread ).isList() )
    {
      SubLObject cdolist_list_var = $spatially_transitive_constraints$.getDynamicValue( thread );
      SubLObject existing = NIL;
      existing = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        place_var = czer_utilities.unique_el_var_wrt_expression( existing, $sym35$_PLACE );
        cdolist_list_var = cdolist_list_var.rest();
        existing = cdolist_list_var.first();
      }
    }
    final SubLObject varified_original = el_utilities.replace_formula_arg( TWO_INTEGER, place_var, constraint );
    final SubLObject subsumption_constraint = ConsesLow.list( $const34$geographicallySubsumes, cycl_utilities.formula_arg2( constraint, UNPROVIDED ), place_var );
    if( $spatially_transitive_constraints$.getDynamicValue( thread ).isList() )
    {
      $spatially_transitive_constraints$.setDynamicValue( ConsesLow.cons( subsumption_constraint, $spatially_transitive_constraints$.getDynamicValue( thread ) ), thread );
    }
    return varified_original;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 11737L)
  public static SubLObject constraint_match_constraint_add_reformulation_option(final SubLObject term_variable, final SubLObject new_constraint, final SubLObject original_constraint)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject refspec_var = $sym36$_REFSPEC;
    final SubLObject assertion_var = $sym37$_ASSERTION;
    SubLObject ref_option = el_utilities.make_existential( assertion_var, el_utilities.make_existential( refspec_var, generate_note_reformulation_formula( assertion_var, term_variable, original_constraint,
        refspec_var ) ) );
    if( NIL != el_utilities.el_formula_with_operator_p( original_constraint, $const15$ist_Intermediate ) )
    {
      SubLObject cdolist_list_var;
      final SubLObject temporal_constraints = cdolist_list_var = list_utilities.find_all_if( $sym38$CONSTRAINT_MATCH_MT_TEMPORAL_CONSTRAINT_, $constraint_match_constraints$.getDynamicValue( thread ), UNPROVIDED );
      SubLObject temporal_constraint = NIL;
      temporal_constraint = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL != constraint_match_temporal_constraint_on_mt_constraintP( temporal_constraint, original_constraint ) )
        {
          final SubLObject reformulated_temporal_constraint = constraint_match_reformulate_temporal_constraint( temporal_constraint );
          ref_option = simplifier.conjoin( ConsesLow.list( ref_option, reformulated_temporal_constraint ), UNPROVIDED );
        }
        cdolist_list_var = cdolist_list_var.rest();
        temporal_constraint = cdolist_list_var.first();
      }
    }
    ref_option = transform_spatially_transitive_constraints( ref_option );
    ref_option = transform_constraint_match_some_fn_term( ref_option );
    final SubLObject disjuncts = ConsesLow.list( new_constraint, ref_option );
    return simplifier.disjoin( disjuncts, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 13293L)
  public static SubLObject constraint_match_reformulate_temporal_constraint(final SubLObject temporal_constraint)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject success = formula_pattern_match.formula_matches_pattern( temporal_constraint, $list39 );
    SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject bounding_time_interval = list_utilities.alist_lookup_without_values( v_bindings, $sym40$BOUNDING_TIME_INTERVAL, UNPROVIDED, UNPROVIDED );
      return constraint_match_reformulate_temporal_constraint( el_utilities.replace_formula_arg( ONE_INTEGER, bounding_time_interval, temporal_constraint ) );
    }
    thread.resetMultipleValues();
    success = formula_pattern_match.formula_matches_pattern( temporal_constraint, $list41 );
    v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject end = list_utilities.alist_lookup_without_values( v_bindings, $sym42$END, UNPROVIDED, UNPROVIDED );
      final SubLObject start = list_utilities.alist_lookup_without_values( v_bindings, $sym43$START, UNPROVIDED, UNPROVIDED );
      return constraint_match_reformulate_temporal_constraint( el_utilities.replace_formula_arg_position( $list44, start, el_utilities.replace_formula_arg_position( $list45, end, temporal_constraint ) ) );
    }
    return temporal_constraint;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 14592L)
  public static SubLObject constraint_match_fuzzy_quantity_nat_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != term.nautP( v_object, UNPROVIDED ) && NIL != fuzzy_quantity_function_p( cycl_utilities.nat_functor( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 14928L)
  public static SubLObject fuzzy_quantity_function_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $fuzzy_quantity_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 15043L)
  public static SubLObject fuzzy_quantity_constraint(final SubLObject quantity_var, final SubLObject fuzzy_quantity)
  {
    final SubLObject pcase_var = cycl_utilities.nat_functor( fuzzy_quantity );
    if( pcase_var.eql( $const47$IntervalOfTypeMinFn ) )
    {
      final SubLObject min = cycl_utilities.nat_arg2( fuzzy_quantity, UNPROVIDED );
      return el_utilities.make_binary_formula( $const48$greaterThanOrEqualTo, quantity_var, min );
    }
    if( pcase_var.eql( $const49$IntervalOfTypeMaxFn ) )
    {
      final SubLObject min = cycl_utilities.nat_arg2( fuzzy_quantity, UNPROVIDED );
      return el_utilities.make_binary_formula( $const50$lessThanOrEqualTo, quantity_var, min );
    }
    if( pcase_var.eql( $const51$ApproximatelyFn ) )
    {
      final SubLObject exact_value = cycl_utilities.nat_arg1( fuzzy_quantity, UNPROVIDED );
      final SubLObject min2 = relation_evaluation.cyc_evaluate( ConsesLow.listS( $const52$TimesFn, exact_value, $list53 ) );
      final SubLObject max = relation_evaluation.cyc_evaluate( ConsesLow.listS( $const52$TimesFn, exact_value, $list54 ) );
      return simplifier.nconjoin( ConsesLow.list( ConsesLow.list( $const48$greaterThanOrEqualTo, quantity_var, min2 ), ConsesLow.list( $const50$lessThanOrEqualTo, quantity_var, max ) ), UNPROVIDED );
    }
    if( pcase_var.eql( $const55$AlmostFn ) )
    {
      final SubLObject exact_value = cycl_utilities.nat_arg1( fuzzy_quantity, UNPROVIDED );
      final SubLObject min2 = relation_evaluation.cyc_evaluate( ConsesLow.listS( $const52$TimesFn, exact_value, $list53 ) );
      return simplifier.nconjoin( ConsesLow.list( ConsesLow.list( $const48$greaterThanOrEqualTo, quantity_var, min2 ), ConsesLow.list( $const56$lessThan, quantity_var, exact_value ) ), UNPROVIDED );
    }
    if( !pcase_var.eql( $const57$Unity ) && !pcase_var.eql( $const58$IntervalRangeFn ) )
    {
      return NIL;
    }
    if( NIL == cycl_utilities.nat_arg2( fuzzy_quantity, UNPROVIDED ) )
    {
      return cycl_utilities.nat_arg1( fuzzy_quantity, UNPROVIDED );
    }
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.nat_args( fuzzy_quantity, UNPROVIDED );
    SubLObject min3 = NIL;
    SubLObject max2 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
    min3 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
    max2 = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return simplifier.nconjoin( ConsesLow.list( ConsesLow.list( $const48$greaterThanOrEqualTo, quantity_var, min3 ), ConsesLow.list( $const50$lessThanOrEqualTo, quantity_var, max2 ) ), UNPROVIDED );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list59 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 16391L)
  public static SubLObject transform_constraint_match_fuzzy_quantity_constraint(final SubLObject constraint)
  {
    final SubLObject fuzzy_quantity = cycl_utilities.expression_find_if( $sym22$CONSTRAINT_MATCH_FUZZY_QUANTITY_NAT_P, constraint, UNPROVIDED, UNPROVIDED );
    final SubLObject fuzzy_quantity_argpos = cycl_utilities.arg_positions_bfs( fuzzy_quantity, constraint, Symbols.symbol_function( EQUAL ) ).first();
    final SubLObject quantity_var = new_constraint_match_ignore_var( $str60$QUANTITY );
    final SubLObject new_main_constraint = el_utilities.replace_formula_arg_position( fuzzy_quantity_argpos, quantity_var, constraint );
    final SubLObject quantity_constraint = fuzzy_quantity_constraint( quantity_var, fuzzy_quantity );
    return ( NIL != quantity_constraint ) ? simplifier.nconjoin( ConsesLow.list( new_main_constraint, quantity_constraint ), UNPROVIDED ) : new_main_constraint;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 17183L)
  public static SubLObject transform_constraint_match_some_fn_term(final SubLObject constraint)
  {
    final SubLObject some_fn_term = cycl_utilities.expression_find_if( $sym23$CONSTRAINT_MATCH_SOME_FN_TERM_P, constraint, UNPROVIDED, UNPROVIDED );
    if( NIL == some_fn_term )
    {
      return constraint;
    }
    final SubLObject some_fn_term_argpos = cycl_utilities.arg_positions_bfs( some_fn_term, constraint, Symbols.symbol_function( EQUAL ) ).first();
    final SubLObject instance_var = new_constraint_match_ignore_var( $str61$INSTANCE );
    final SubLObject new_main_constraint = el_utilities.replace_formula_arg_position( some_fn_term_argpos, instance_var, constraint );
    final SubLObject type_constraint = some_fn_term_constraint( instance_var, some_fn_term );
    return ( NIL != type_constraint ) ? simplifier.nconjoin( ConsesLow.list( new_main_constraint, type_constraint ), UNPROVIDED ) : new_main_constraint;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 17847L)
  public static SubLObject constraint_match_some_fn_term_p(final SubLObject v_object)
  {
    return cycl_utilities.naut_with_functor_p( v_object, $const62$SomeFn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 17952L)
  public static SubLObject some_fn_term_constraint(final SubLObject instance_var, final SubLObject some_fn_term)
  {
    final SubLObject type = cycl_utilities.nat_arg1( some_fn_term, UNPROVIDED );
    return type.eql( $const63$Thing ) ? NIL : el_utilities.make_binary_formula( $const64$isa, instance_var, type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 18180L)
  public static SubLObject transform_constraint_match_infn_ternary_term(final SubLObject constraint)
  {
    final SubLObject infn_ternary_term = cycl_utilities.expression_find_if( $sym24$CONSTRAINT_MATCH_INFN_TERNARY_TERM_P, constraint, UNPROVIDED, UNPROVIDED );
    final SubLObject infn_ternary_term_argpos = cycl_utilities.arg_positions_bfs( infn_ternary_term, constraint, Symbols.symbol_function( EQUAL ) ).first();
    final SubLObject guid_argpos = ConsesLow.append( infn_ternary_term_argpos, $list65 );
    final SubLObject guid_var = new_constraint_match_ignore_var( $str66$GUID );
    final SubLObject new_main_constraint = el_utilities.replace_formula_arg_position( guid_argpos, guid_var, constraint );
    return new_main_constraint;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 18687L)
  public static SubLObject constraint_match_infn_ternary_term_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != cycl_utilities.naut_with_functor_p( v_object, $const67$InstanceNamedFn_Ternary ) && cycl_utilities.nat_arg3( v_object, UNPROVIDED ).isString() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 18855L)
  public static SubLObject add_case_insensitivity_marker_to_query_constraint(final SubLObject constraint)
  {
    return el_utilities.make_unary_formula( $const68$trueSentence_CaseInsensitive, constraint );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 19064L)
  public static SubLObject transform_temporal_qualification_on_query_constraint(final SubLObject constraint, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $use_mt_and_dims_variablesP$.getDynamicValue( thread ) )
    {
      return transform_temporal_qualification_on_query_constraint_old( constraint, domain_mt );
    }
    return transform_temporal_qualification_on_query_constraint_new( constraint, domain_mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 19381L)
  public static SubLObject transform_temporal_qualification_on_query_constraint_new(final SubLObject constraint, final SubLObject domain_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject possibly_qualified_constraint = el_utilities.replace_formula_arg( ZERO_INTEGER, $const69$ist, cycl_utilities.expression_subst( domain_mt, narts_high.find_nart( $list70 ), constraint, UNPROVIDED,
        UNPROVIDED ) );
    final SubLObject temporal_constraints = list_utilities.find_all_if( $sym38$CONSTRAINT_MATCH_MT_TEMPORAL_CONSTRAINT_, $constraint_match_constraints$.getDynamicValue( thread ), UNPROVIDED );
    SubLObject constrainedP = NIL;
    thread.resetMultipleValues();
    final SubLObject success = formula_pattern_match.formula_matches_pattern( possibly_qualified_constraint, $list71 );
    final SubLObject v_bindings = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != success )
    {
      final SubLObject date_var = list_utilities.alist_lookup_without_values( v_bindings, $sym72$DATE_VAR, UNPROVIDED, UNPROVIDED );
      final SubLObject temporal_mt = list_utilities.alist_lookup_without_values( v_bindings, $sym73$TEMPORAL_MT, UNPROVIDED, UNPROVIDED );
      if( NIL == constrainedP )
      {
        SubLObject csome_list_var = temporal_constraints;
        SubLObject temporal_constraint = NIL;
        temporal_constraint = csome_list_var.first();
        while ( NIL == constrainedP && NIL != csome_list_var)
        {
          if( NIL != constraint_match_temporal_constraint_on_mt_constraintP( temporal_constraint, possibly_qualified_constraint ) )
          {
            final SubLObject reformulated_temporal_constraint = constraint_match_reformulate_temporal_constraint( temporal_constraint );
            thread.resetMultipleValues();
            final SubLObject success_$7 = formula_pattern_match.formula_matches_pattern( reformulated_temporal_constraint, ConsesLow.list( $const19$temporallySubsumes, $list74, date_var ) );
            final SubLObject v_bindings_$8 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != success_$7 )
            {
              final SubLObject date = list_utilities.alist_lookup_without_values( v_bindings_$8, $sym75$DATE, UNPROVIDED, UNPROVIDED );
              final SubLObject specified_temporal_mt = ConsesLow.list( $const76$AnytimeDuringPSCFn, date );
              possibly_qualified_constraint = el_utilities.replace_formula_arg_position( $list45, specified_temporal_mt, possibly_qualified_constraint );
              constrainedP = T;
            }
          }
          csome_list_var = csome_list_var.rest();
          temporal_constraint = csome_list_var.first();
        }
      }
    }
    return possibly_qualified_constraint;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 20959L)
  public static SubLObject transform_temporal_qualification_on_query_constraint_old(final SubLObject constraint, final SubLObject domain_mt)
  {
    final SubLObject sentence = cycl_utilities.formula_arg2( constraint, UNPROVIDED );
    final SubLObject mt_var = new_constraint_match_ignore_var( $str77$MT );
    final SubLObject mt_dim_var = new_constraint_match_ignore_var( $str78$MT_DIMS );
    final SubLObject mt_space_expression = el_utilities.make_el_formula( $const79$MtSpace, ConsesLow.list( mt_var ), mt_dim_var );
    final SubLObject temporally_qualified = el_utilities.make_binary_formula( $const80$ist_Asserted, mt_space_expression, sentence );
    final SubLObject mt_reasoning = compute_mt_expression_for_temporal_qualification_on_query_constraint( mt_var, domain_mt );
    return el_utilities.make_binary_formula( $const81$and, mt_reasoning, temporally_qualified );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 21594L)
  public static SubLObject compute_mt_expression_for_temporal_qualification_on_query_constraint(final SubLObject mt_var, final SubLObject domain_mt)
  {
    if( NIL != el_utilities.el_formula_with_operator_p( domain_mt, $const82$MtUnionFn ) )
    {
      SubLObject mt_reasoning = NIL;
      SubLObject cdolist_list_var = list_utilities.flatten( mt_union_fn_mts_only( domain_mt ) );
      SubLObject elmt = NIL;
      elmt = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        mt_reasoning = ConsesLow.cons( el_utilities.make_binary_formula( $const83$genlMt, elmt, mt_var ), mt_reasoning );
        cdolist_list_var = cdolist_list_var.rest();
        elmt = cdolist_list_var.first();
      }
      return simplifier.disjoin( mt_reasoning, UNPROVIDED );
    }
    return el_utilities.make_binary_formula( $const83$genlMt, domain_mt, mt_var );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 22185L)
  public static SubLObject mt_union_fn_mts_only(final SubLObject mt_denotation)
  {
    if( NIL != forts.fort_p( mt_denotation ) )
    {
      return mt_denotation;
    }
    if( NIL != el_utilities.el_formula_with_operator_p( mt_denotation, $const82$MtUnionFn ) )
    {
      return mt_union_fn_mts_only( cycl_utilities.nat_args( mt_denotation, UNPROVIDED ) );
    }
    if( NIL != narts_high.naut_p( mt_denotation ) )
    {
      return mt_denotation;
    }
    if( NIL != list_utilities.proper_list_p( mt_denotation ) )
    {
      return ConsesLow.cons( mt_union_fn_mts_only( mt_denotation.first() ), mt_union_fn_mts_only( mt_denotation.rest() ) );
    }
    return mt_denotation;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 22682L)
  public static SubLObject add_regular_expression_marker_to_query_constraint(final SubLObject constraint, final SubLObject case_insensitiveP)
  {
    SubLObject new_constraint = el_utilities.copy_sentence( constraint );
    final SubLObject regex_pred = ( NIL != case_insensitiveP ) ? $const84$regexStringMatch_CaseInsensitive : $const85$regexStringMatch;
    final SubLObject unparsable = cycl_utilities.expression_find_if( Symbols.symbol_function( $sym86$UNPARSABLE_INSTANCE_EXPRESSION_P ), new_constraint, UNPROVIDED, UNPROVIDED );
    if( NIL != unparsable )
    {
      final SubLObject regex_string = cycl_utilities.expression_find_if( Symbols.symbol_function( $sym20$REGULAR_EXPRESSION_STRING_P ), unparsable, UNPROVIDED, UNPROVIDED );
      final SubLObject el_var = new_constraint_match_ignore_var( $str87$STANDIN );
      new_constraint = cycl_utilities.expression_nsubst( el_var, unparsable, new_constraint, UNPROVIDED, UNPROVIDED );
      new_constraint = simplifier.conjoin( ConsesLow.list( new_constraint, el_utilities.make_binary_formula( $const88$termStrings, el_var, regex_string ) ), UNPROVIDED );
    }
    final SubLObject regex_string = cycl_utilities.expression_find_if( Symbols.symbol_function( $sym20$REGULAR_EXPRESSION_STRING_P ), new_constraint, UNPROVIDED, UNPROVIDED );
    final SubLObject el_var = new_constraint_match_ignore_var( $str89$REGEX );
    new_constraint = cycl_utilities.expression_nsubst( el_var, regex_string, new_constraint, UNPROVIDED, UNPROVIDED );
    return el_utilities.make_binary_formula( $const81$and, new_constraint, el_utilities.make_binary_formula( regex_pred, regex_string, el_var ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 24012L)
  public static SubLObject generate_note_reformulation_formula(final SubLObject formula, final SubLObject v_term, final SubLObject original, final SubLObject refspec_id)
  {
    return el_utilities.make_quaternary_formula( $const90$assertionProducedByReformulation, formula, v_term, original, refspec_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constrained-term-finder.lisp", position = 24254L)
  public static SubLObject is_note_reformulation_assertionP(final SubLObject assertion)
  {
    return assertion_utilities.gaf_assertion_with_pred_p( assertion, $const90$assertionProducedByReformulation );
  }

  public static SubLObject declare_constrained_term_finder_file()
  {
    SubLFiles.declareFunction( me, "find_terms_matching_constraints", "FIND-TERMS-MATCHING-CONSTRAINTS", 3, 2, false );
    SubLFiles.declareFunction( me, "find_terms_matching_constraints_perform_query", "FIND-TERMS-MATCHING-CONSTRAINTS-PERFORM-QUERY", 3, 0, false );
    SubLFiles.declareMacro( me, "with_new_constraint_match_ignore_vars", "WITH-NEW-CONSTRAINT-MATCH-IGNORE-VARS" );
    SubLFiles.declareFunction( me, "new_constraint_match_ignore_var", "NEW-CONSTRAINT-MATCH-IGNORE-VAR", 1, 0, false );
    SubLFiles.declareFunction( me, "constraint_match_constraint_variable_mentioned_in_mt_p", "CONSTRAINT-MATCH-CONSTRAINT-VARIABLE-MENTIONED-IN-MT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "build_constraint_match_query_from_constraints_and_options", "BUILD-CONSTRAINT-MATCH-QUERY-FROM-CONSTRAINTS-AND-OPTIONS", 5, 0, false );
    SubLFiles.declareFunction( me, "constraint_match_mt_temporal_constraintP", "CONSTRAINT-MATCH-MT-TEMPORAL-CONSTRAINT?", 1, 0, false );
    SubLFiles.declareFunction( me, "constraint_match_temporal_constraint_on_mt_constraintP", "CONSTRAINT-MATCH-TEMPORAL-CONSTRAINT-ON-MT-CONSTRAINT?", 2, 0, false );
    SubLFiles.declareFunction( me, "transform_constraint_match_query_constraint", "TRANSFORM-CONSTRAINT-MATCH-QUERY-CONSTRAINT", 6, 0, false );
    SubLFiles.declareFunction( me, "temporally_transitive_constraintP", "TEMPORALLY-TRANSITIVE-CONSTRAINT?", 2, 0, false );
    SubLFiles.declareFunction( me, "transitive_constraintP", "TRANSITIVE-CONSTRAINT?", 2, 0, false );
    SubLFiles.declareFunction( me, "transform_temporally_transitive_constraint", "TRANSFORM-TEMPORALLY-TRANSITIVE-CONSTRAINT", 1, 0, false );
    SubLFiles.declareFunction( me, "transform_spatially_transitive_constraints", "TRANSFORM-SPATIALLY-TRANSITIVE-CONSTRAINTS", 1, 0, false );
    SubLFiles.declareFunction( me, "spatially_transitive_constraintP", "SPATIALLY-TRANSITIVE-CONSTRAINT?", 1, 0, false );
    SubLFiles.declareFunction( me, "transform_spatially_transitive_constraint", "TRANSFORM-SPATIALLY-TRANSITIVE-CONSTRAINT", 1, 0, false );
    SubLFiles.declareFunction( me, "constraint_match_constraint_add_reformulation_option", "CONSTRAINT-MATCH-CONSTRAINT-ADD-REFORMULATION-OPTION", 3, 0, false );
    SubLFiles.declareFunction( me, "constraint_match_reformulate_temporal_constraint", "CONSTRAINT-MATCH-REFORMULATE-TEMPORAL-CONSTRAINT", 1, 0, false );
    SubLFiles.declareFunction( me, "constraint_match_fuzzy_quantity_nat_p", "CONSTRAINT-MATCH-FUZZY-QUANTITY-NAT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "fuzzy_quantity_function_p", "FUZZY-QUANTITY-FUNCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "fuzzy_quantity_constraint", "FUZZY-QUANTITY-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "transform_constraint_match_fuzzy_quantity_constraint", "TRANSFORM-CONSTRAINT-MATCH-FUZZY-QUANTITY-CONSTRAINT", 1, 0, false );
    SubLFiles.declareFunction( me, "transform_constraint_match_some_fn_term", "TRANSFORM-CONSTRAINT-MATCH-SOME-FN-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "constraint_match_some_fn_term_p", "CONSTRAINT-MATCH-SOME-FN-TERM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "some_fn_term_constraint", "SOME-FN-TERM-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "transform_constraint_match_infn_ternary_term", "TRANSFORM-CONSTRAINT-MATCH-INFN-TERNARY-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "constraint_match_infn_ternary_term_p", "CONSTRAINT-MATCH-INFN-TERNARY-TERM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "add_case_insensitivity_marker_to_query_constraint", "ADD-CASE-INSENSITIVITY-MARKER-TO-QUERY-CONSTRAINT", 1, 0, false );
    SubLFiles.declareFunction( me, "transform_temporal_qualification_on_query_constraint", "TRANSFORM-TEMPORAL-QUALIFICATION-ON-QUERY-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "transform_temporal_qualification_on_query_constraint_new", "TRANSFORM-TEMPORAL-QUALIFICATION-ON-QUERY-CONSTRAINT-NEW", 2, 0, false );
    SubLFiles.declareFunction( me, "transform_temporal_qualification_on_query_constraint_old", "TRANSFORM-TEMPORAL-QUALIFICATION-ON-QUERY-CONSTRAINT-OLD", 2, 0, false );
    SubLFiles.declareFunction( me, "compute_mt_expression_for_temporal_qualification_on_query_constraint", "COMPUTE-MT-EXPRESSION-FOR-TEMPORAL-QUALIFICATION-ON-QUERY-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "mt_union_fn_mts_only", "MT-UNION-FN-MTS-ONLY", 1, 0, false );
    SubLFiles.declareFunction( me, "add_regular_expression_marker_to_query_constraint", "ADD-REGULAR-EXPRESSION-MARKER-TO-QUERY-CONSTRAINT", 2, 0, false );
    SubLFiles.declareFunction( me, "generate_note_reformulation_formula", "GENERATE-NOTE-REFORMULATION-FORMULA", 4, 0, false );
    SubLFiles.declareFunction( me, "is_note_reformulation_assertionP", "IS-NOTE-REFORMULATION-ASSERTION?", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_constrained_term_finder_file()
  {
    $constrained_term_finder_queries_browsableP$ = SubLFiles.defparameter( "*CONSTRAINED-TERM-FINDER-QUERIES-BROWSABLE?*", NIL );
    $constraint_match_ignore_vars$ = SubLFiles.defparameter( "*CONSTRAINT-MATCH-IGNORE-VARS*", NIL );
    $constraint_match_constraints$ = SubLFiles.defparameter( "*CONSTRAINT-MATCH-CONSTRAINTS*", NIL );
    $expand_spatially_transitive_constraintsP$ = SubLFiles.defparameter( "*EXPAND-SPATIALLY-TRANSITIVE-CONSTRAINTS?*", NIL );
    $spatially_transitive_constraints$ = SubLFiles.defparameter( "*SPATIALLY-TRANSITIVE-CONSTRAINTS*", $kw14$UNBOUND );
    $fuzzy_quantity_functions$ = SubLFiles.deflexical( "*FUZZY-QUANTITY-FUNCTIONS*", $list46 );
    $use_mt_and_dims_variablesP$ = SubLFiles.defparameter( "*USE-MT-AND-DIMS-VARIABLES?*", NIL );
    return NIL;
  }

  public static SubLObject setup_constrained_term_finder_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_constrained_term_finder_file();
  }

  @Override
  public void initializeVariables()
  {
    init_constrained_term_finder_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_constrained_term_finder_file();
  }
  static
  {
    me = new constrained_term_finder();
    $constrained_term_finder_queries_browsableP$ = null;
    $constraint_match_ignore_vars$ = null;
    $constraint_match_constraints$ = null;
    $expand_spatially_transitive_constraintsP$ = null;
    $spatially_transitive_constraints$ = null;
    $fuzzy_quantity_functions$ = null;
    $use_mt_and_dims_variablesP$ = null;
    $list0 = ConsesLow.list( makeKeyword( "CASE-INSENSITIVE" ), makeKeyword( "TRUE" ), makeKeyword( "REGULAR-EXPRESSIONS" ), makeKeyword( "FALSE" ) );
    $sym1$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $sym2$LISTP = makeSymbol( "LISTP" );
    $sym3$HLMT_P = makeSymbol( "HLMT-P" );
    $sym4$PROPERTY_LIST_P = makeSymbol( "PROPERTY-LIST-P" );
    $kw5$ANSWER_LANGUAGE = makeKeyword( "ANSWER-LANGUAGE" );
    $kw6$HL = makeKeyword( "HL" );
    $kw7$PROBABLY_APPROXIMATELY_DONE = makeKeyword( "PROBABLY-APPROXIMATELY-DONE" );
    $float8$1_0 = makeDouble( 1.0 );
    $kw9$NEW_TERMS_ALLOWED_ = makeKeyword( "NEW-TERMS-ALLOWED?" );
    $kw10$BROWSABLE_ = makeKeyword( "BROWSABLE?" );
    $sym11$CLET = makeSymbol( "CLET" );
    $list12 = ConsesLow.list( ConsesLow.list( makeSymbol( "*CONSTRAINT-MATCH-IGNORE-VARS*" ), NIL ) );
    $str13$___A_D = makeString( "??~A~D" );
    $kw14$UNBOUND = makeKeyword( "UNBOUND" );
    $const15$ist_Intermediate = constant_handles.reader_make_constant_shell( makeString( "ist-Intermediate" ) );
    $kw16$TRUE = makeKeyword( "TRUE" );
    $kw17$CASE_INSENSITIVE = makeKeyword( "CASE-INSENSITIVE" );
    $kw18$REGULAR_EXPRESSIONS = makeKeyword( "REGULAR-EXPRESSIONS" );
    $const19$temporallySubsumes = constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) );
    $sym20$REGULAR_EXPRESSION_STRING_P = makeSymbol( "REGULAR-EXPRESSION-STRING-P" );
    $sym21$NON_REGULAR_EXPRESSION_STRING_P = makeSymbol( "NON-REGULAR-EXPRESSION-STRING-P" );
    $sym22$CONSTRAINT_MATCH_FUZZY_QUANTITY_NAT_P = makeSymbol( "CONSTRAINT-MATCH-FUZZY-QUANTITY-NAT-P" );
    $sym23$CONSTRAINT_MATCH_SOME_FN_TERM_P = makeSymbol( "CONSTRAINT-MATCH-SOME-FN-TERM-P" );
    $sym24$CONSTRAINT_MATCH_INFN_TERNARY_TERM_P = makeSymbol( "CONSTRAINT-MATCH-INFN-TERNARY-TERM-P" );
    $list25 = ConsesLow.list( ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ARG0" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "FORT" ) );
    $sym26$ARG0 = makeSymbol( "ARG0" );
    $sym27$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const28$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const29$transitiveViaArgInverse = constant_handles.reader_make_constant_shell( makeString( "transitiveViaArgInverse" ) );
    $kw30$GAF = makeKeyword( "GAF" );
    $sym31$_DATE = makeSymbol( "?DATE" );
    $sym32$SPATIALLY_TRANSITIVE_CONSTRAINT_ = makeSymbol( "SPATIALLY-TRANSITIVE-CONSTRAINT?" );
    $sym33$TRANSFORM_SPATIALLY_TRANSITIVE_CONSTRAINT = makeSymbol( "TRANSFORM-SPATIALLY-TRANSITIVE-CONSTRAINT" );
    $const34$geographicallySubsumes = constant_handles.reader_make_constant_shell( makeString( "geographicallySubsumes" ) );
    $sym35$_PLACE = makeSymbol( "?PLACE" );
    $sym36$_REFSPEC = makeSymbol( "?REFSPEC" );
    $sym37$_ASSERTION = makeSymbol( "?ASSERTION" );
    $sym38$CONSTRAINT_MATCH_MT_TEMPORAL_CONSTRAINT_ = makeSymbol( "CONSTRAINT-MATCH-MT-TEMPORAL-CONSTRAINT?" );
    $list39 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ),
        ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "BOUNDING-TIME-INTERVAL" ) ), makeKeyword( "ANYTHING" ) ), makeKeyword( "ANYTHING" ) );
    $sym40$BOUNDING_TIME_INTERVAL = makeSymbol( "BOUNDING-TIME-INTERVAL" );
    $list41 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "START" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list(
            constant_handles.reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "END" ) ), makeKeyword( "ANYTHING" ) ) ), makeKeyword( "ANYTHING" ) );
    $sym42$END = makeSymbol( "END" );
    $sym43$START = makeSymbol( "START" );
    $list44 = ConsesLow.list( ONE_INTEGER, ONE_INTEGER );
    $list45 = ConsesLow.list( ONE_INTEGER, TWO_INTEGER );
    $list46 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "IntervalOfTypeMinFn" ) ), constant_handles.reader_make_constant_shell( makeString( "IntervalOfTypeMaxFn" ) ), constant_handles
        .reader_make_constant_shell( makeString( "IntervalRangeFn" ) ), constant_handles.reader_make_constant_shell( makeString( "ApproximatelyFn" ) ), constant_handles.reader_make_constant_shell( makeString(
            "AlmostFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Unity" ) ) );
    $const47$IntervalOfTypeMinFn = constant_handles.reader_make_constant_shell( makeString( "IntervalOfTypeMinFn" ) );
    $const48$greaterThanOrEqualTo = constant_handles.reader_make_constant_shell( makeString( "greaterThanOrEqualTo" ) );
    $const49$IntervalOfTypeMaxFn = constant_handles.reader_make_constant_shell( makeString( "IntervalOfTypeMaxFn" ) );
    $const50$lessThanOrEqualTo = constant_handles.reader_make_constant_shell( makeString( "lessThanOrEqualTo" ) );
    $const51$ApproximatelyFn = constant_handles.reader_make_constant_shell( makeString( "ApproximatelyFn" ) );
    $const52$TimesFn = constant_handles.reader_make_constant_shell( makeString( "TimesFn" ) );
    $list53 = ConsesLow.list( makeDouble( 0.9 ) );
    $list54 = ConsesLow.list( makeDouble( 1.1 ) );
    $const55$AlmostFn = constant_handles.reader_make_constant_shell( makeString( "AlmostFn" ) );
    $const56$lessThan = constant_handles.reader_make_constant_shell( makeString( "lessThan" ) );
    $const57$Unity = constant_handles.reader_make_constant_shell( makeString( "Unity" ) );
    $const58$IntervalRangeFn = constant_handles.reader_make_constant_shell( makeString( "IntervalRangeFn" ) );
    $list59 = ConsesLow.list( makeSymbol( "MIN" ), makeSymbol( "MAX" ) );
    $str60$QUANTITY = makeString( "QUANTITY" );
    $str61$INSTANCE = makeString( "INSTANCE" );
    $const62$SomeFn = constant_handles.reader_make_constant_shell( makeString( "SomeFn" ) );
    $const63$Thing = constant_handles.reader_make_constant_shell( makeString( "Thing" ) );
    $const64$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list65 = ConsesLow.list( THREE_INTEGER );
    $str66$GUID = makeString( "GUID" );
    $const67$InstanceNamedFn_Ternary = constant_handles.reader_make_constant_shell( makeString( "InstanceNamedFn-Ternary" ) );
    $const68$trueSentence_CaseInsensitive = constant_handles.reader_make_constant_shell( makeString( "trueSentence-CaseInsensitive" ) );
    $const69$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $list70 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "The" ) ), constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) ) );
    $list71 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ist" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) ), makeKeyword( "ANYTHING" ),
        ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-MT" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
            "MtTimeWithGranularityDimFn" ) ), ConsesLow.list( makeKeyword( "AND" ), makeKeyword( "EL-VARIABLE" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATE-VAR" ) ) ), constant_handles
                .reader_make_constant_shell( makeString( "TimePoint" ) ) ) ) ), makeKeyword( "ANYTHING" ) );
    $sym72$DATE_VAR = makeSymbol( "DATE-VAR" );
    $sym73$TEMPORAL_MT = makeSymbol( "TEMPORAL-MT" );
    $list74 = ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATE" ) );
    $sym75$DATE = makeSymbol( "DATE" );
    $const76$AnytimeDuringPSCFn = constant_handles.reader_make_constant_shell( makeString( "AnytimeDuringPSCFn" ) );
    $str77$MT = makeString( "MT" );
    $str78$MT_DIMS = makeString( "MT-DIMS" );
    $const79$MtSpace = constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) );
    $const80$ist_Asserted = constant_handles.reader_make_constant_shell( makeString( "ist-Asserted" ) );
    $const81$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const82$MtUnionFn = constant_handles.reader_make_constant_shell( makeString( "MtUnionFn" ) );
    $const83$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $const84$regexStringMatch_CaseInsensitive = constant_handles.reader_make_constant_shell( makeString( "regexStringMatch-CaseInsensitive" ) );
    $const85$regexStringMatch = constant_handles.reader_make_constant_shell( makeString( "regexStringMatch" ) );
    $sym86$UNPARSABLE_INSTANCE_EXPRESSION_P = makeSymbol( "UNPARSABLE-INSTANCE-EXPRESSION-P" );
    $str87$STANDIN = makeString( "STANDIN" );
    $const88$termStrings = constant_handles.reader_make_constant_shell( makeString( "termStrings" ) );
    $str89$REGEX = makeString( "REGEX" );
    $const90$assertionProducedByReformulation = constant_handles.reader_make_constant_shell( makeString( "assertionProducedByReformulation" ) );
  }
}
/*
 * 
 * Total time: 346 ms
 * 
 */