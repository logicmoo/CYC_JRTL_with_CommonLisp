package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class temporal_projection_preds
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.temporal_projection_preds";
  public static final String myFingerPrint = "4647529fcbeac15ec04e63d758965acb1143dfcd5f7bc0b294c1031b29751e36";
  private static final SubLObject $const0$Now;
  private static final SubLObject $const1$Forever_Quantity;
  private static final SubLObject $const2$NumericLikelihoodFn;
  private static final SubLObject $const3$defaultConditionalProbabilityForS;
  private static final SubLObject $const4$YearFn;
  private static final SubLObject $const5$MtSpace;
  private static final SubLObject $const6$MtTimeWithGranularityDimFn;
  private static final SubLList $list7;
  private static final SubLObject $const8$agentsOverlapInPositionAtOrganiza;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$_Z;
  private static final SubLObject $const11$YearsDuration;
  private static final SubLFloat $float12$3_5;
  private static final SubLFloat $float13$0_75;
  private static final SubLSymbol $sym14$_X;
  private static final SubLSymbol $sym15$_Y;
  private static final SubLList $list16;
  private static final SubLObject $const17$numberInPositionAtOrganization;
  private static final SubLObject $const18$covariateScalesConditionalProbabi;
  private static final SubLObject $const19$likelyCloseAcquaintances;
  private static final SubLInteger $int20$100;
  private static final SubLObject $const21$typicalGroupCardinalityForTypeWit;
  private static final SubLString $str22$___Scaling_factor_1__a_;
  private static final SubLString $str23$___Scaling_factor_2__a_;
  private static final SubLString $str24$___Net_scaling_factor__a_;
  private static final SubLString $str25$___Scaled_prob__a_;
  private static final SubLString $str26$___Net_likelihood__a_;
  private static final SubLObject $const27$hasLevelOfOpaqueExpertiseOnTopicT;
  private static final SubLSymbol $kw28$EXTENDED;
  private static final SubLObject $const29$hasLevelOfOpaqueExpertiseOnTopicW;
  private static final SubLObject $const30$scoreForGenericValuePredicateForE;
  private static final SubLString $str31$____a__a_;
  private static final SubLString $str32$_____likelihood__a_value_of_time_;
  private static final SubLInteger $int33$31536000;
  private static final SubLObject $const34$timeElapsed;
  private static final SubLObject $const35$BaseKB;
  private static final SubLFloat $float36$2_71;
  private static final SubLString $str37$____a__a__a_;
  private static final SubLFloat $float38$0_98;
  private static final SubLObject $const39$EverythingPSC;
  private static final SubLSymbol $kw40$SHALLOW;
  private static final SubLSymbol $kw41$RETURN;
  private static final SubLSymbol $kw42$BINDINGS_AND_SUPPORTS;
  private static final SubLSymbol $kw43$INFERENCE_MODE;
  private static final SubLSymbol $kw44$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_;
  private static final SubLSymbol $kw45$ALLOW_INDETERMINATE_RESULTS_;
  private static final SubLSymbol $kw46$DISJUNCTION_FREE_EL_VARS_POLICY;
  private static final SubLSymbol $kw47$COMPUTE_INTERSECTION;
  private static final SubLSymbol $kw48$ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
  private static final SubLSymbol $kw49$COMPUTE_ANSWER_JUSTIFICATIONS_;
  private static final SubLSymbol $kw50$MAX_TIME;
  private static final SubLSymbol $kw51$MAX_TRANSFORMATION_DEPTH;
  private static final SubLList $list52;

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-preds.lisp", position = 727L)
  public static SubLObject find_likelihood_of_language_spoken(final SubLObject fact, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_time = cycl_utilities.formula_arg1( cycl_utilities.formula_arg2( mt, UNPROVIDED ), UNPROVIDED );
    if( !mt_time.eql( $const0$Now ) )
    {
      return NIL;
    }
    thread.resetMultipleValues();
    final SubLObject v_answer = get_nearest_time_for_fact_truth( fact, mt );
    final SubLObject time = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != v_answer )
    {
      SubLObject time_1 = NIL;
      SubLObject list_of_answer_and_justifications = NIL;
      SubLObject justifications = cycl_utilities.formula_arg1( v_answer, UNPROVIDED );
      if( mt_time.eql( $const0$Now ) )
      {
        time_1 = date_utilities.indexical_now();
      }
      else
      {
        time_1 = mt_time;
      }
      final SubLObject time_elapsed = date_utilities.time_elapsed( time_1, time, UNPROVIDED );
      SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt( cycl_utilities.formula_arg0( fact ), $const3$defaultConditionalProbabilityForS, ONE_INTEGER, UNPROVIDED );
      SubLObject assertion = NIL;
      assertion = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject gaf = assertions_high.gaf_formula( assertion );
        final SubLObject applicable_time_interval = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
        final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
        final SubLObject prob = cycl_utilities.formula_arg4( gaf, UNPROVIDED );
        if( NIL != date_utilities.later_than( time_1, time ) )
        {
          final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0( duration_of_time_interval );
          final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1( duration_of_time_interval, UNPROVIDED );
          final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0( time_elapsed );
          final SubLObject value_of_time_elapsed = cycl_utilities.formula_arg1( time_elapsed, UNPROVIDED );
          final SubLObject unit_conversion = quantities.convert_to_units( unit_of_duration_of_time_interval, unit_of_time_elapsed, ONE_INTEGER, UNPROVIDED );
          if( applicable_time_interval.eql( $const1$Forever_Quantity ) && NIL != unit_conversion && NIL != value_of_time_elapsed && NIL != prob && NIL != value_of_duration_of_time_interval )
          {
            final SubLObject likelihood = Numbers.expt( prob, Numbers.multiply( Numbers.divide( value_of_time_elapsed, value_of_duration_of_time_interval ), unit_conversion ) );
            if( NIL != likelihood && !likelihood.numG( ONE_INTEGER ) && !likelihood.numL( ZERO_INTEGER ) )
            {
              justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
              list_of_answer_and_justifications = ConsesLow.cons( ConsesLow.list( ConsesLow.list( $const2$NumericLikelihoodFn, likelihood ), justifications ), list_of_answer_and_justifications );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        assertion = cdolist_list_var.first();
      }
      return return_best_explanation( list_of_answer_and_justifications );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-preds.lisp", position = 2744L)
  public static SubLObject get_nearest_time_for_fact_truth(final SubLObject fact, final SubLObject mt)
  {
    final SubLObject monad_mt = temporal_projection_utilities.get_monad_mt( mt );
    final SubLObject time_1 = cycl_utilities.formula_arg1( cycl_utilities.formula_arg2( mt, UNPROVIDED ), UNPROVIDED );
    SubLObject time = NIL;
    SubLObject year_of_date = NIL;
    if( time_1.eql( $const0$Now ) )
    {
      time = date_utilities.indexical_now();
    }
    else
    {
      time = time_1;
    }
    year_of_date = cycl_utilities.formula_arg1( date_utilities.year_of_date( time ), UNPROVIDED );
    if( NIL != year_of_date )
    {
      SubLObject count;
      SubLObject time_for_query;
      SubLObject mt_for_query;
      SubLObject v_answer;
      for( count = NIL, count = ZERO_INTEGER; count.numL( SEVEN_INTEGER ); count = Numbers.add( count, ONE_INTEGER ) )
      {
        time_for_query = ConsesLow.list( $const4$YearFn, Numbers.subtract( year_of_date, count ) );
        mt_for_query = ConsesLow.list( $const5$MtSpace, monad_mt, ConsesLow.listS( $const6$MtTimeWithGranularityDimFn, time_for_query, $list7 ) );
        v_answer = get_answers_from_new_cyc_query( fact, mt_for_query, UNPROVIDED, UNPROVIDED );
        if( NIL != v_answer )
        {
          return Values.values( cycl_utilities.formula_arg0( v_answer ), time_for_query );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-preds.lisp", position = 3429L)
  public static SubLObject find_likelihood_of_acquaintances(final SubLObject fact, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject answers = get_answers_from_new_cyc_query( ConsesLow.listS( $const8$agentsOverlapInPositionAtOrganiza, cycl_utilities.formula_arg1( fact, UNPROVIDED ), cycl_utilities.formula_arg2( fact, UNPROVIDED ),
        $list9 ), mt, UNPROVIDED, UNPROVIDED );
    SubLObject list_of_answer_and_justifications = NIL;
    final SubLObject predicate = cycl_utilities.formula_arg0( fact );
    SubLObject time = NIL;
    if( NIL != mt )
    {
      final SubLObject time_1 = cycl_utilities.formula_arg1( cycl_utilities.formula_arg2( mt, UNPROVIDED ), UNPROVIDED );
      if( time_1.eql( $const0$Now ) )
      {
        time = date_utilities.indexical_now();
      }
      else
      {
        time = time_1;
      }
    }
    if( NIL == time )
    {
      return NIL;
    }
    final SubLObject cdolist_list_var = answers;
    SubLObject v_answer = NIL;
    v_answer = cdolist_list_var.first();
    if( NIL != cdolist_list_var )
    {
      SubLObject justifications = NIL;
      final SubLObject v_bindings = cycl_utilities.formula_arg0( v_answer );
      final SubLObject justification_1 = cycl_utilities.formula_arg1( v_answer, UNPROVIDED );
      final SubLObject time_interval = bindings.variable_lookup( $sym10$_Z, v_bindings );
      final SubLObject starting_time = cycl_utilities.formula_arg1( time_interval, UNPROVIDED );
      final SubLObject ending_time = cycl_utilities.formula_arg2( time_interval, UNPROVIDED );
      final SubLObject time_elapsed = time_interval_utilities.time_interval_duration( time_interval, UNPROVIDED );
      final SubLObject time_elapsed_in_years = quantities.convert_to_units( $const11$YearsDuration, cycl_utilities.formula_arg0( time_elapsed ), cycl_utilities.formula_arg1( time_elapsed, UNPROVIDED ), UNPROVIDED );
      final SubLObject scaling_factor_2 = Numbers.multiply( $float12$3_5, Numbers.expt( time_elapsed_in_years, $float13$0_75 ) );
      final SubLObject position = bindings.variable_lookup( $sym14$_X, v_bindings );
      final SubLObject org = bindings.variable_lookup( $sym15$_Y, v_bindings );
      SubLObject net_scaling_factor = NIL;
      thread.resetMultipleValues();
      final SubLObject scaling_factor_3 = find_scaling_factor_from_org( org, position, mt );
      final SubLObject scaling_just = thread.secondMultipleValue();
      thread.resetMultipleValues();
      net_scaling_factor = Numbers.multiply( scaling_factor_3, scaling_factor_2 );
      justifications = ConsesLow.append( scaling_just, justification_1 );
      SubLObject cdolist_list_var_$1 = kb_mapping_utilities.pred_value_gafs_in_any_mt( predicate, $const3$defaultConditionalProbabilityForS, ONE_INTEGER, UNPROVIDED );
      SubLObject assertion = NIL;
      assertion = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        final SubLObject gaf = assertions_high.gaf_formula( assertion );
        final SubLObject applicable_time_interval = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
        final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
        final SubLObject prob = cycl_utilities.formula_arg4( gaf, UNPROVIDED );
        final SubLObject alpha = Numbers.divide( Numbers.subtract( ONE_INTEGER, prob ), prob );
        final SubLObject alpha_times_covariate = Numbers.divide( alpha, net_scaling_factor );
        final SubLObject net_prob = Numbers.divide( ONE_INTEGER, Numbers.add( ONE_INTEGER, alpha_times_covariate ) );
        SubLObject time_elapsed_2 = temporal_projection.find_time_elapsed_between_time_points( ending_time, time );
        if( NIL == date_utilities.later_than( starting_time, time ) )
        {
          if( NIL != date_utilities.later_than( ending_time, time ) )
          {
            time_elapsed_2 = $list16;
          }
          final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0( duration_of_time_interval );
          final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1( duration_of_time_interval, UNPROVIDED );
          final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0( time_elapsed_2 );
          final SubLObject value_of_time_elapsed = cycl_utilities.formula_arg1( time_elapsed_2, UNPROVIDED );
          final SubLObject unit_conversion = quantities.convert_to_units( unit_of_duration_of_time_interval, unit_of_time_elapsed, ONE_INTEGER, UNPROVIDED );
          if( applicable_time_interval.eql( $const1$Forever_Quantity ) && NIL != unit_conversion && NIL != value_of_time_elapsed && NIL != prob && NIL != value_of_duration_of_time_interval )
          {
            final SubLObject likelihood = Numbers.expt( net_prob, Numbers.multiply( Numbers.divide( value_of_time_elapsed, value_of_duration_of_time_interval ), unit_conversion ) );
            if( NIL != likelihood && !likelihood.numG( ONE_INTEGER ) && !likelihood.numL( ZERO_INTEGER ) )
            {
              if( NIL != justifyP )
              {
                if( NIL != date_utilities.later_than( time, ending_time ) )
                {
                  justifications = ConsesLow.append( justifications, ConsesLow.list( assertion ) );
                }
                list_of_answer_and_justifications = ConsesLow.cons( ConsesLow.list( ConsesLow.list( $const2$NumericLikelihoodFn, likelihood ), justifications ), list_of_answer_and_justifications );
              }
              else
              {
                list_of_answer_and_justifications = ConsesLow.cons( ConsesLow.list( ConsesLow.list( $const2$NumericLikelihoodFn, likelihood ) ), list_of_answer_and_justifications );
              }
            }
          }
        }
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        assertion = cdolist_list_var_$1.first();
      }
      return return_best_explanation( list_of_answer_and_justifications );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-preds.lisp", position = 7064L)
  public static SubLObject find_scaling_factor_from_org(final SubLObject org, SubLObject position, final SubLObject mt)
  {
    SubLObject number = NIL;
    final SubLObject number_in_pos_assertion = kb_mapping_utilities.pred_u_v_holds_gafs_in_relevant_mts( $const17$numberInPositionAtOrganization, position, org, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != number_in_pos_assertion )
    {
      final SubLObject number_in_pos_gaf = assertions_high.gaf_formula( cycl_utilities.formula_arg0( number_in_pos_assertion ) );
      number = cycl_utilities.formula_arg2( cycl_utilities.formula_arg3( number_in_pos_gaf, UNPROVIDED ), UNPROVIDED );
    }
    if( NIL != number )
    {
      final SubLObject just = kb_mapping_utilities.pred_u_v_holds_gafs_in_relevant_mts( $const18$covariateScalesConditionalProbabi, $const19$likelyCloseAcquaintances, $const17$numberInPositionAtOrganization, mt,
          UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != just )
      {
        return Values.values( Numbers.add( ONE_INTEGER, Numbers.divide( $int20$100, number ) ), ConsesLow.append( just, number_in_pos_assertion ) );
      }
    }
    final SubLObject typical_no_assertion = kb_mapping_utilities.pred_value_gafs_in_relevant_mts( position, $const21$typicalGroupCardinalityForTypeWit, mt, UNPROVIDED, UNPROVIDED );
    if( NIL != typical_no_assertion )
    {
      final SubLObject typical_no_gaf = assertions_high.gaf_formula( cycl_utilities.formula_arg0( typical_no_assertion ) );
      final SubLObject just2 = kb_mapping_utilities.pred_u_v_holds_gafs_in_relevant_mts( $const18$covariateScalesConditionalProbabi, $const19$likelyCloseAcquaintances, $const17$numberInPositionAtOrganization, mt,
          UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != just2 )
      {
        number = cycl_utilities.formula_arg2( cycl_utilities.formula_arg3( typical_no_gaf, UNPROVIDED ), UNPROVIDED );
        return Values.values( Numbers.add( ONE_INTEGER, Numbers.divide( $int20$100, number ) ), ConsesLow.append( just2, typical_no_assertion ) );
      }
    }
    return Values.values( ONE_INTEGER, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-preds.lisp", position = 8347L)
  public static SubLObject find_likelihood_given_value_of_parameters(final SubLObject overlap_in_years, final SubLObject max_size, final SubLObject base_prob, final SubLObject time_elapsed_in_years)
  {
    final SubLObject scaling_factor_2 = Numbers.multiply( $float12$3_5, Numbers.expt( overlap_in_years, $float13$0_75 ) );
    final SubLObject alpha = Numbers.divide( Numbers.subtract( ONE_INTEGER, base_prob ), base_prob );
    SubLObject scaling_factor_3 = ONE_INTEGER;
    SubLObject scaled_prob = NIL;
    SubLObject net_scaling_factor = ONE_INTEGER;
    if( NIL != max_size )
    {
      scaling_factor_3 = Numbers.add( ONE_INTEGER, Numbers.divide( $int20$100, max_size ) );
    }
    PrintLow.format( T, $str22$___Scaling_factor_1__a_, scaling_factor_3 );
    PrintLow.format( T, $str23$___Scaling_factor_2__a_, scaling_factor_2 );
    net_scaling_factor = Numbers.multiply( scaling_factor_3, scaling_factor_2 );
    PrintLow.format( T, $str24$___Net_scaling_factor__a_, net_scaling_factor );
    scaled_prob = Numbers.divide( alpha, net_scaling_factor );
    PrintLow.format( T, $str25$___Scaled_prob__a_, scaled_prob );
    PrintLow.format( T, $str26$___Net_likelihood__a_, Numbers.expt( Numbers.divide( ONE_INTEGER, Numbers.add( ONE_INTEGER, scaled_prob ) ), time_elapsed_in_years ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-preds.lisp", position = 9172L)
  public static SubLObject find_level_of_opaque_expertise_on_topic_with_rating(final SubLObject sent, final SubLObject mt, final SubLObject justifyP)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-preds.lisp", position = 13288L)
  public static SubLObject scale_prob_from_covariates_for_familiarity_queries(final SubLObject prob, final SubLObject time_elapsed, final SubLObject scaling_assertion, final SubLObject applicableP)
  {
    if( NIL == scaling_assertion )
    {
      return prob;
    }
    if( NIL == applicableP )
    {
      return prob;
    }
    if( prob.isNumber() && prob.numE( ZERO_INTEGER ) )
    {
      return prob;
    }
    final SubLObject gaf = assertions_high.gaf_formula( scaling_assertion );
    final SubLObject minus_alpha = Numbers.log( Numbers.divide( Numbers.subtract( ONE_INTEGER, prob ), prob ), $float36$2_71 );
    final SubLObject factor = cycl_utilities.formula_arg4( gaf, UNPROVIDED );
    final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
    final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0( duration_of_time_interval );
    final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1( duration_of_time_interval, UNPROVIDED );
    final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0( time_elapsed );
    final SubLObject value_of_time_elapsed = cycl_utilities.formula_arg1( time_elapsed, UNPROVIDED );
    final SubLObject unit_conversion = quantities.convert_to_units( unit_of_duration_of_time_interval, unit_of_time_elapsed, ONE_INTEGER, UNPROVIDED );
    if( NIL != unit_conversion && NIL != value_of_time_elapsed && NIL != factor && NIL != prob && NIL != value_of_duration_of_time_interval )
    {
      final SubLObject e_to_the_power_minus_beta = Numbers.multiply( Numbers.divide( value_of_time_elapsed, value_of_duration_of_time_interval ), unit_conversion );
      final SubLObject e_to_the_power_minus_alpha = Numbers.expt( $float36$2_71, minus_alpha );
      PrintLow.format( T, $str31$____a__a_, e_to_the_power_minus_beta, e_to_the_power_minus_alpha );
      return Numbers.min( ONE_INTEGER, Numbers.multiply( prob, Numbers.add( ONE_INTEGER, Numbers.divide( e_to_the_power_minus_beta, $int20$100 ) ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-preds.lisp", position = 14521L)
  public static SubLObject scale_prob_from_covariates_for_familiarity_queries_2(final SubLObject prob, final SubLObject time_elapsed, final SubLObject scaling_assertion, final SubLObject applicableP)
  {
    if( NIL == scaling_assertion )
    {
      return prob;
    }
    if( NIL == applicableP )
    {
      return prob;
    }
    if( prob.isNumber() && prob.numE( ZERO_INTEGER ) )
    {
      return prob;
    }
    final SubLObject gaf = assertions_high.gaf_formula( scaling_assertion );
    final SubLObject factor = cycl_utilities.formula_arg4( gaf, UNPROVIDED );
    final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
    final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0( duration_of_time_interval );
    final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1( duration_of_time_interval, UNPROVIDED );
    final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0( time_elapsed );
    final SubLObject value_of_time_elapsed = cycl_utilities.formula_arg1( time_elapsed, UNPROVIDED );
    final SubLObject unit_conversion = quantities.convert_to_units( unit_of_duration_of_time_interval, unit_of_time_elapsed, ONE_INTEGER, UNPROVIDED );
    if( NIL != unit_conversion && NIL != value_of_time_elapsed && NIL != factor && NIL != prob && NIL != value_of_duration_of_time_interval )
    {
      final SubLObject pow = Numbers.multiply( Numbers.divide( value_of_time_elapsed, value_of_duration_of_time_interval ), unit_conversion );
      PrintLow.format( T, $str37$____a__a__a_, new SubLObject[] { prob, factor, pow
      } );
      return Numbers.min( $float38$0_98, Numbers.multiply( prob, Numbers.expt( factor, pow ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-preds.lisp", position = 15578L)
  public static SubLObject return_best_explanation(final SubLObject lst)
  {
    if( Sequences.length( lst ).numE( ONE_INTEGER ) )
    {
      final SubLObject entry = cycl_utilities.formula_arg0( lst );
      return Values.values( cycl_utilities.formula_arg0( entry ), cycl_utilities.formula_arg1( entry, UNPROVIDED ) );
    }
    SubLObject current_best_entry = cycl_utilities.formula_arg0( lst );
    SubLObject current_best_score = cycl_utilities.formula_arg1( cycl_utilities.formula_arg0( current_best_entry ), UNPROVIDED );
    SubLObject cdolist_list_var = cycl_utilities.formula_args( lst, UNPROVIDED );
    SubLObject entry2 = NIL;
    entry2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject score = cycl_utilities.formula_arg1( cycl_utilities.formula_arg0( entry2 ), UNPROVIDED );
      if( score.numG( current_best_score ) )
      {
        current_best_entry = entry2;
        current_best_score = score;
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry2 = cdolist_list_var.first();
    }
    if( NIL != cycl_utilities.formula_arg1( current_best_entry, UNPROVIDED ) )
    {
      return Values.values( cycl_utilities.formula_arg0( current_best_entry ), cycl_utilities.formula_arg1( current_best_entry, UNPROVIDED ) );
    }
    return Values.values( cycl_utilities.formula_arg0( current_best_entry ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-preds.lisp", position = 16273L)
  public static SubLObject get_answers_from_new_cyc_query(final SubLObject query, SubLObject mt, SubLObject depth, SubLObject mode)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const39$EverythingPSC;
    }
    if( depth == UNPROVIDED )
    {
      depth = ONE_INTEGER;
    }
    if( mode == UNPROVIDED )
    {
      mode = $kw40$SHALLOW;
    }
    return ask_utilities.recursive_query( query, mt, ConsesLow.listS( $kw41$RETURN, new SubLObject[] { $kw42$BINDINGS_AND_SUPPORTS, $kw43$INFERENCE_MODE, mode, $kw44$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, T,
      $kw45$ALLOW_INDETERMINATE_RESULTS_, NIL, $kw46$DISJUNCTION_FREE_EL_VARS_POLICY, $kw47$COMPUTE_INTERSECTION, $kw48$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $kw49$COMPUTE_ANSWER_JUSTIFICATIONS_, T, $kw50$MAX_TIME,
      ONE_INTEGER, $kw51$MAX_TRANSFORMATION_DEPTH, depth, $list52
    } ) );
  }

  public static SubLObject declare_temporal_projection_preds_file()
  {
    SubLFiles.declareFunction( me, "find_likelihood_of_language_spoken", "FIND-LIKELIHOOD-OF-LANGUAGE-SPOKEN", 2, 0, false );
    SubLFiles.declareFunction( me, "get_nearest_time_for_fact_truth", "GET-NEAREST-TIME-FOR-FACT-TRUTH", 2, 0, false );
    SubLFiles.declareFunction( me, "find_likelihood_of_acquaintances", "FIND-LIKELIHOOD-OF-ACQUAINTANCES", 3, 0, false );
    SubLFiles.declareFunction( me, "find_scaling_factor_from_org", "FIND-SCALING-FACTOR-FROM-ORG", 3, 0, false );
    SubLFiles.declareFunction( me, "find_likelihood_given_value_of_parameters", "FIND-LIKELIHOOD-GIVEN-VALUE-OF-PARAMETERS", 4, 0, false );
    SubLFiles.declareFunction( me, "find_level_of_opaque_expertise_on_topic_with_rating", "FIND-LEVEL-OF-OPAQUE-EXPERTISE-ON-TOPIC-WITH-RATING", 3, 0, false );
    SubLFiles.declareFunction( me, "scale_prob_from_covariates_for_familiarity_queries", "SCALE-PROB-FROM-COVARIATES-FOR-FAMILIARITY-QUERIES", 4, 0, false );
    SubLFiles.declareFunction( me, "scale_prob_from_covariates_for_familiarity_queries_2", "SCALE-PROB-FROM-COVARIATES-FOR-FAMILIARITY-QUERIES-2", 4, 0, false );
    SubLFiles.declareFunction( me, "return_best_explanation", "RETURN-BEST-EXPLANATION", 1, 0, false );
    SubLFiles.declareFunction( me, "get_answers_from_new_cyc_query", "GET-ANSWERS-FROM-NEW-CYC-QUERY", 1, 3, false );
    return NIL;
  }

  public static SubLObject init_temporal_projection_preds_file()
  {
    return NIL;
  }

  public static SubLObject setup_temporal_projection_preds_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_temporal_projection_preds_file();
  }

  @Override
  public void initializeVariables()
  {
    init_temporal_projection_preds_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_temporal_projection_preds_file();
  }
  static
  {
    me = new temporal_projection_preds();
    $const0$Now = constant_handles.reader_make_constant_shell( makeString( "Now" ) );
    $const1$Forever_Quantity = constant_handles.reader_make_constant_shell( makeString( "Forever-Quantity" ) );
    $const2$NumericLikelihoodFn = constant_handles.reader_make_constant_shell( makeString( "NumericLikelihoodFn" ) );
    $const3$defaultConditionalProbabilityForS = constant_handles.reader_make_constant_shell( makeString( "defaultConditionalProbabilityForSentenceInInterval" ) );
    $const4$YearFn = constant_handles.reader_make_constant_shell( makeString( "YearFn" ) );
    $const5$MtSpace = constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) );
    $const6$MtTimeWithGranularityDimFn = constant_handles.reader_make_constant_shell( makeString( "MtTimeWithGranularityDimFn" ) );
    $list7 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimePoint" ) ) );
    $const8$agentsOverlapInPositionAtOrganiza = constant_handles.reader_make_constant_shell( makeString( "agentsOverlapInPositionAtOrganizationForPeriod" ) );
    $list9 = ConsesLow.list( makeSymbol( "?X" ), makeSymbol( "?Y" ), makeSymbol( "?Z" ) );
    $sym10$_Z = makeSymbol( "?Z" );
    $const11$YearsDuration = constant_handles.reader_make_constant_shell( makeString( "YearsDuration" ) );
    $float12$3_5 = makeDouble( 3.5 );
    $float13$0_75 = makeDouble( 0.75 );
    $sym14$_X = makeSymbol( "?X" );
    $sym15$_Y = makeSymbol( "?Y" );
    $list16 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DaysDuration" ) ), ZERO_INTEGER );
    $const17$numberInPositionAtOrganization = constant_handles.reader_make_constant_shell( makeString( "numberInPositionAtOrganization" ) );
    $const18$covariateScalesConditionalProbabi = constant_handles.reader_make_constant_shell( makeString( "covariateScalesConditionalProbabilityByFactor" ) );
    $const19$likelyCloseAcquaintances = constant_handles.reader_make_constant_shell( makeString( "likelyCloseAcquaintances" ) );
    $int20$100 = makeInteger( 100 );
    $const21$typicalGroupCardinalityForTypeWit = constant_handles.reader_make_constant_shell( makeString( "typicalGroupCardinalityForTypeWithinOrgType" ) );
    $str22$___Scaling_factor_1__a_ = makeString( "~% Scaling factor 1 ~a " );
    $str23$___Scaling_factor_2__a_ = makeString( "~% Scaling factor 2 ~a " );
    $str24$___Net_scaling_factor__a_ = makeString( "~% Net scaling factor ~a " );
    $str25$___Scaled_prob__a_ = makeString( "~% Scaled prob ~a " );
    $str26$___Net_likelihood__a_ = makeString( "~% Net likelihood ~a " );
    $const27$hasLevelOfOpaqueExpertiseOnTopicT = constant_handles.reader_make_constant_shell( makeString( "hasLevelOfOpaqueExpertiseOnTopicToFrom" ) );
    $kw28$EXTENDED = makeKeyword( "EXTENDED" );
    $const29$hasLevelOfOpaqueExpertiseOnTopicW = constant_handles.reader_make_constant_shell( makeString( "hasLevelOfOpaqueExpertiseOnTopicWithRating" ) );
    $const30$scoreForGenericValuePredicateForE = constant_handles.reader_make_constant_shell( makeString( "scoreForGenericValuePredicateForExperienceEvaluation" ) );
    $str31$____a__a_ = makeString( "~% ~a ~a " );
    $str32$_____likelihood__a_value_of_time_ = makeString( "~% - likelihood ~a value-of-time-elapsed ~a ~a" );
    $int33$31536000 = makeInteger( 31536000 );
    $const34$timeElapsed = constant_handles.reader_make_constant_shell( makeString( "timeElapsed" ) );
    $const35$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $float36$2_71 = makeDouble( 2.71 );
    $str37$____a__a__a_ = makeString( "~% ~a ~a ~a " );
    $float38$0_98 = makeDouble( 0.98 );
    $const39$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw40$SHALLOW = makeKeyword( "SHALLOW" );
    $kw41$RETURN = makeKeyword( "RETURN" );
    $kw42$BINDINGS_AND_SUPPORTS = makeKeyword( "BINDINGS-AND-SUPPORTS" );
    $kw43$INFERENCE_MODE = makeKeyword( "INFERENCE-MODE" );
    $kw44$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword( "ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" );
    $kw45$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" );
    $kw46$DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword( "DISJUNCTION-FREE-EL-VARS-POLICY" );
    $kw47$COMPUTE_INTERSECTION = makeKeyword( "COMPUTE-INTERSECTION" );
    $kw48$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword( "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" );
    $kw49$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword( "COMPUTE-ANSWER-JUSTIFICATIONS?" );
    $kw50$MAX_TIME = makeKeyword( "MAX-TIME" );
    $kw51$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $list52 = ConsesLow.list( makeKeyword( "PROBABLY-APPROXIMATELY-DONE" ), makeDouble( 1.0 ), makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ), makeKeyword( "CONTINUABLE?" ), NIL );
  }
}
/*
 * 
 * Total time: 136 ms
 * 
 */