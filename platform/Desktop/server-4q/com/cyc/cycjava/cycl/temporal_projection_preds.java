package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class temporal_projection_preds extends SubLTranslatedFile
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
    public static SubLObject find_likelihood_of_language_spoken(final SubLObject fact, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_time = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(mt, (SubLObject)temporal_projection_preds.UNPROVIDED), (SubLObject)temporal_projection_preds.UNPROVIDED);
        if (!mt_time.eql(temporal_projection_preds.$const0$Now)) {
            return (SubLObject)temporal_projection_preds.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject v_answer = get_nearest_time_for_fact_truth(fact, mt);
        final SubLObject time = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_preds.NIL != v_answer) {
            SubLObject time_1 = (SubLObject)temporal_projection_preds.NIL;
            SubLObject list_of_answer_and_justifications = (SubLObject)temporal_projection_preds.NIL;
            SubLObject justifications = cycl_utilities.formula_arg1(v_answer, (SubLObject)temporal_projection_preds.UNPROVIDED);
            if (mt_time.eql(temporal_projection_preds.$const0$Now)) {
                time_1 = date_utilities.indexical_now();
            }
            else {
                time_1 = mt_time;
            }
            final SubLObject time_elapsed = date_utilities.time_elapsed(time_1, time, (SubLObject)temporal_projection_preds.UNPROVIDED);
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg0(fact), temporal_projection_preds.$const3$defaultConditionalProbabilityForS, (SubLObject)temporal_projection_preds.ONE_INTEGER, (SubLObject)temporal_projection_preds.UNPROVIDED);
            SubLObject assertion = (SubLObject)temporal_projection_preds.NIL;
            assertion = cdolist_list_var.first();
            while (temporal_projection_preds.NIL != cdolist_list_var) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject applicable_time_interval = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_preds.UNPROVIDED);
                final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_preds.UNPROVIDED);
                final SubLObject prob = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_preds.UNPROVIDED);
                if (temporal_projection_preds.NIL != date_utilities.later_than(time_1, time)) {
                    final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
                    final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, (SubLObject)temporal_projection_preds.UNPROVIDED);
                    final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0(time_elapsed);
                    final SubLObject value_of_time_elapsed = cycl_utilities.formula_arg1(time_elapsed, (SubLObject)temporal_projection_preds.UNPROVIDED);
                    final SubLObject unit_conversion = quantities.convert_to_units(unit_of_duration_of_time_interval, unit_of_time_elapsed, (SubLObject)temporal_projection_preds.ONE_INTEGER, (SubLObject)temporal_projection_preds.UNPROVIDED);
                    if (applicable_time_interval.eql(temporal_projection_preds.$const1$Forever_Quantity) && temporal_projection_preds.NIL != unit_conversion && temporal_projection_preds.NIL != value_of_time_elapsed && temporal_projection_preds.NIL != prob && temporal_projection_preds.NIL != value_of_duration_of_time_interval) {
                        final SubLObject likelihood = Numbers.expt(prob, Numbers.multiply(Numbers.divide(value_of_time_elapsed, value_of_duration_of_time_interval), unit_conversion));
                        if (temporal_projection_preds.NIL != likelihood && !likelihood.numG((SubLObject)temporal_projection_preds.ONE_INTEGER) && !likelihood.numL((SubLObject)temporal_projection_preds.ZERO_INTEGER)) {
                            justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                            list_of_answer_and_justifications = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection_preds.$const2$NumericLikelihoodFn, likelihood), justifications), list_of_answer_and_justifications);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
            return return_best_explanation(list_of_answer_and_justifications);
        }
        return (SubLObject)temporal_projection_preds.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-preds.lisp", position = 2744L)
    public static SubLObject get_nearest_time_for_fact_truth(final SubLObject fact, final SubLObject mt) {
        final SubLObject monad_mt = temporal_projection_utilities.get_monad_mt(mt);
        final SubLObject time_1 = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(mt, (SubLObject)temporal_projection_preds.UNPROVIDED), (SubLObject)temporal_projection_preds.UNPROVIDED);
        SubLObject time = (SubLObject)temporal_projection_preds.NIL;
        SubLObject year_of_date = (SubLObject)temporal_projection_preds.NIL;
        if (time_1.eql(temporal_projection_preds.$const0$Now)) {
            time = date_utilities.indexical_now();
        }
        else {
            time = time_1;
        }
        year_of_date = cycl_utilities.formula_arg1(date_utilities.year_of_date(time), (SubLObject)temporal_projection_preds.UNPROVIDED);
        if (temporal_projection_preds.NIL != year_of_date) {
            SubLObject count;
            SubLObject time_for_query;
            SubLObject mt_for_query;
            SubLObject v_answer;
            for (count = (SubLObject)temporal_projection_preds.NIL, count = (SubLObject)temporal_projection_preds.ZERO_INTEGER; count.numL((SubLObject)temporal_projection_preds.SEVEN_INTEGER); count = Numbers.add(count, (SubLObject)temporal_projection_preds.ONE_INTEGER)) {
                time_for_query = (SubLObject)ConsesLow.list(temporal_projection_preds.$const4$YearFn, Numbers.subtract(year_of_date, count));
                mt_for_query = (SubLObject)ConsesLow.list(temporal_projection_preds.$const5$MtSpace, monad_mt, (SubLObject)ConsesLow.listS(temporal_projection_preds.$const6$MtTimeWithGranularityDimFn, time_for_query, (SubLObject)temporal_projection_preds.$list7));
                v_answer = get_answers_from_new_cyc_query(fact, mt_for_query, (SubLObject)temporal_projection_preds.UNPROVIDED, (SubLObject)temporal_projection_preds.UNPROVIDED);
                if (temporal_projection_preds.NIL != v_answer) {
                    return Values.values(cycl_utilities.formula_arg0(v_answer), time_for_query);
                }
            }
        }
        return (SubLObject)temporal_projection_preds.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-preds.lisp", position = 3429L)
    public static SubLObject find_likelihood_of_acquaintances(final SubLObject fact, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject answers = get_answers_from_new_cyc_query((SubLObject)ConsesLow.listS(temporal_projection_preds.$const8$agentsOverlapInPositionAtOrganiza, cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_preds.UNPROVIDED), cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_preds.UNPROVIDED), (SubLObject)temporal_projection_preds.$list9), mt, (SubLObject)temporal_projection_preds.UNPROVIDED, (SubLObject)temporal_projection_preds.UNPROVIDED);
        SubLObject list_of_answer_and_justifications = (SubLObject)temporal_projection_preds.NIL;
        final SubLObject predicate = cycl_utilities.formula_arg0(fact);
        SubLObject time = (SubLObject)temporal_projection_preds.NIL;
        if (temporal_projection_preds.NIL != mt) {
            final SubLObject time_1 = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(mt, (SubLObject)temporal_projection_preds.UNPROVIDED), (SubLObject)temporal_projection_preds.UNPROVIDED);
            if (time_1.eql(temporal_projection_preds.$const0$Now)) {
                time = date_utilities.indexical_now();
            }
            else {
                time = time_1;
            }
        }
        if (temporal_projection_preds.NIL == time) {
            return (SubLObject)temporal_projection_preds.NIL;
        }
        final SubLObject cdolist_list_var = answers;
        SubLObject v_answer = (SubLObject)temporal_projection_preds.NIL;
        v_answer = cdolist_list_var.first();
        if (temporal_projection_preds.NIL != cdolist_list_var) {
            SubLObject justifications = (SubLObject)temporal_projection_preds.NIL;
            final SubLObject v_bindings = cycl_utilities.formula_arg0(v_answer);
            final SubLObject justification_1 = cycl_utilities.formula_arg1(v_answer, (SubLObject)temporal_projection_preds.UNPROVIDED);
            final SubLObject time_interval = bindings.variable_lookup((SubLObject)temporal_projection_preds.$sym10$_Z, v_bindings);
            final SubLObject starting_time = cycl_utilities.formula_arg1(time_interval, (SubLObject)temporal_projection_preds.UNPROVIDED);
            final SubLObject ending_time = cycl_utilities.formula_arg2(time_interval, (SubLObject)temporal_projection_preds.UNPROVIDED);
            final SubLObject time_elapsed = time_interval_utilities.time_interval_duration(time_interval, (SubLObject)temporal_projection_preds.UNPROVIDED);
            final SubLObject time_elapsed_in_years = quantities.convert_to_units(temporal_projection_preds.$const11$YearsDuration, cycl_utilities.formula_arg0(time_elapsed), cycl_utilities.formula_arg1(time_elapsed, (SubLObject)temporal_projection_preds.UNPROVIDED), (SubLObject)temporal_projection_preds.UNPROVIDED);
            final SubLObject scaling_factor_2 = Numbers.multiply((SubLObject)temporal_projection_preds.$float12$3_5, Numbers.expt(time_elapsed_in_years, (SubLObject)temporal_projection_preds.$float13$0_75));
            final SubLObject position = bindings.variable_lookup((SubLObject)temporal_projection_preds.$sym14$_X, v_bindings);
            final SubLObject org = bindings.variable_lookup((SubLObject)temporal_projection_preds.$sym15$_Y, v_bindings);
            SubLObject net_scaling_factor = (SubLObject)temporal_projection_preds.NIL;
            thread.resetMultipleValues();
            final SubLObject scaling_factor_3 = find_scaling_factor_from_org(org, position, mt);
            final SubLObject scaling_just = thread.secondMultipleValue();
            thread.resetMultipleValues();
            net_scaling_factor = Numbers.multiply(scaling_factor_3, scaling_factor_2);
            justifications = ConsesLow.append(scaling_just, justification_1);
            SubLObject cdolist_list_var_$1 = kb_mapping_utilities.pred_value_gafs_in_any_mt(predicate, temporal_projection_preds.$const3$defaultConditionalProbabilityForS, (SubLObject)temporal_projection_preds.ONE_INTEGER, (SubLObject)temporal_projection_preds.UNPROVIDED);
            SubLObject assertion = (SubLObject)temporal_projection_preds.NIL;
            assertion = cdolist_list_var_$1.first();
            while (temporal_projection_preds.NIL != cdolist_list_var_$1) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject applicable_time_interval = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_preds.UNPROVIDED);
                final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_preds.UNPROVIDED);
                final SubLObject prob = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_preds.UNPROVIDED);
                final SubLObject alpha = Numbers.divide(Numbers.subtract((SubLObject)temporal_projection_preds.ONE_INTEGER, prob), prob);
                final SubLObject alpha_times_covariate = Numbers.divide(alpha, net_scaling_factor);
                final SubLObject net_prob = Numbers.divide((SubLObject)temporal_projection_preds.ONE_INTEGER, Numbers.add((SubLObject)temporal_projection_preds.ONE_INTEGER, alpha_times_covariate));
                SubLObject time_elapsed_2 = temporal_projection.find_time_elapsed_between_time_points(ending_time, time);
                if (temporal_projection_preds.NIL == date_utilities.later_than(starting_time, time)) {
                    if (temporal_projection_preds.NIL != date_utilities.later_than(ending_time, time)) {
                        time_elapsed_2 = (SubLObject)temporal_projection_preds.$list16;
                    }
                    final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
                    final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, (SubLObject)temporal_projection_preds.UNPROVIDED);
                    final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0(time_elapsed_2);
                    final SubLObject value_of_time_elapsed = cycl_utilities.formula_arg1(time_elapsed_2, (SubLObject)temporal_projection_preds.UNPROVIDED);
                    final SubLObject unit_conversion = quantities.convert_to_units(unit_of_duration_of_time_interval, unit_of_time_elapsed, (SubLObject)temporal_projection_preds.ONE_INTEGER, (SubLObject)temporal_projection_preds.UNPROVIDED);
                    if (applicable_time_interval.eql(temporal_projection_preds.$const1$Forever_Quantity) && temporal_projection_preds.NIL != unit_conversion && temporal_projection_preds.NIL != value_of_time_elapsed && temporal_projection_preds.NIL != prob && temporal_projection_preds.NIL != value_of_duration_of_time_interval) {
                        final SubLObject likelihood = Numbers.expt(net_prob, Numbers.multiply(Numbers.divide(value_of_time_elapsed, value_of_duration_of_time_interval), unit_conversion));
                        if (temporal_projection_preds.NIL != likelihood && !likelihood.numG((SubLObject)temporal_projection_preds.ONE_INTEGER) && !likelihood.numL((SubLObject)temporal_projection_preds.ZERO_INTEGER)) {
                            if (temporal_projection_preds.NIL != justifyP) {
                                if (temporal_projection_preds.NIL != date_utilities.later_than(time, ending_time)) {
                                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                                }
                                list_of_answer_and_justifications = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection_preds.$const2$NumericLikelihoodFn, likelihood), justifications), list_of_answer_and_justifications);
                            }
                            else {
                                list_of_answer_and_justifications = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection_preds.$const2$NumericLikelihoodFn, likelihood)), list_of_answer_and_justifications);
                            }
                        }
                    }
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                assertion = cdolist_list_var_$1.first();
            }
            return return_best_explanation(list_of_answer_and_justifications);
        }
        return (SubLObject)temporal_projection_preds.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-preds.lisp", position = 7064L)
    public static SubLObject find_scaling_factor_from_org(final SubLObject org, SubLObject position, final SubLObject mt) {
        SubLObject number = (SubLObject)temporal_projection_preds.NIL;
        final SubLObject number_in_pos_assertion = kb_mapping_utilities.pred_u_v_holds_gafs_in_relevant_mts(temporal_projection_preds.$const17$numberInPositionAtOrganization, position, org, mt, (SubLObject)temporal_projection_preds.UNPROVIDED, (SubLObject)temporal_projection_preds.UNPROVIDED, (SubLObject)temporal_projection_preds.UNPROVIDED);
        if (temporal_projection_preds.NIL != number_in_pos_assertion) {
            final SubLObject number_in_pos_gaf = assertions_high.gaf_formula(cycl_utilities.formula_arg0(number_in_pos_assertion));
            number = cycl_utilities.formula_arg2(cycl_utilities.formula_arg3(number_in_pos_gaf, (SubLObject)temporal_projection_preds.UNPROVIDED), (SubLObject)temporal_projection_preds.UNPROVIDED);
        }
        if (temporal_projection_preds.NIL != number) {
            final SubLObject just = kb_mapping_utilities.pred_u_v_holds_gafs_in_relevant_mts(temporal_projection_preds.$const18$covariateScalesConditionalProbabi, temporal_projection_preds.$const19$likelyCloseAcquaintances, temporal_projection_preds.$const17$numberInPositionAtOrganization, mt, (SubLObject)temporal_projection_preds.UNPROVIDED, (SubLObject)temporal_projection_preds.UNPROVIDED, (SubLObject)temporal_projection_preds.UNPROVIDED);
            if (temporal_projection_preds.NIL != just) {
                return Values.values(Numbers.add((SubLObject)temporal_projection_preds.ONE_INTEGER, Numbers.divide((SubLObject)temporal_projection_preds.$int20$100, number)), ConsesLow.append(just, number_in_pos_assertion));
            }
        }
        final SubLObject typical_no_assertion = kb_mapping_utilities.pred_value_gafs_in_relevant_mts(position, temporal_projection_preds.$const21$typicalGroupCardinalityForTypeWit, mt, (SubLObject)temporal_projection_preds.UNPROVIDED, (SubLObject)temporal_projection_preds.UNPROVIDED);
        if (temporal_projection_preds.NIL != typical_no_assertion) {
            final SubLObject typical_no_gaf = assertions_high.gaf_formula(cycl_utilities.formula_arg0(typical_no_assertion));
            final SubLObject just2 = kb_mapping_utilities.pred_u_v_holds_gafs_in_relevant_mts(temporal_projection_preds.$const18$covariateScalesConditionalProbabi, temporal_projection_preds.$const19$likelyCloseAcquaintances, temporal_projection_preds.$const17$numberInPositionAtOrganization, mt, (SubLObject)temporal_projection_preds.UNPROVIDED, (SubLObject)temporal_projection_preds.UNPROVIDED, (SubLObject)temporal_projection_preds.UNPROVIDED);
            if (temporal_projection_preds.NIL != just2) {
                number = cycl_utilities.formula_arg2(cycl_utilities.formula_arg3(typical_no_gaf, (SubLObject)temporal_projection_preds.UNPROVIDED), (SubLObject)temporal_projection_preds.UNPROVIDED);
                return Values.values(Numbers.add((SubLObject)temporal_projection_preds.ONE_INTEGER, Numbers.divide((SubLObject)temporal_projection_preds.$int20$100, number)), ConsesLow.append(just2, typical_no_assertion));
            }
        }
        return Values.values((SubLObject)temporal_projection_preds.ONE_INTEGER, (SubLObject)temporal_projection_preds.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-preds.lisp", position = 8347L)
    public static SubLObject find_likelihood_given_value_of_parameters(final SubLObject overlap_in_years, final SubLObject max_size, final SubLObject base_prob, final SubLObject time_elapsed_in_years) {
        final SubLObject scaling_factor_2 = Numbers.multiply((SubLObject)temporal_projection_preds.$float12$3_5, Numbers.expt(overlap_in_years, (SubLObject)temporal_projection_preds.$float13$0_75));
        final SubLObject alpha = Numbers.divide(Numbers.subtract((SubLObject)temporal_projection_preds.ONE_INTEGER, base_prob), base_prob);
        SubLObject scaling_factor_3 = (SubLObject)temporal_projection_preds.ONE_INTEGER;
        SubLObject scaled_prob = (SubLObject)temporal_projection_preds.NIL;
        SubLObject net_scaling_factor = (SubLObject)temporal_projection_preds.ONE_INTEGER;
        if (temporal_projection_preds.NIL != max_size) {
            scaling_factor_3 = Numbers.add((SubLObject)temporal_projection_preds.ONE_INTEGER, Numbers.divide((SubLObject)temporal_projection_preds.$int20$100, max_size));
        }
        PrintLow.format((SubLObject)temporal_projection_preds.T, (SubLObject)temporal_projection_preds.$str22$___Scaling_factor_1__a_, scaling_factor_3);
        PrintLow.format((SubLObject)temporal_projection_preds.T, (SubLObject)temporal_projection_preds.$str23$___Scaling_factor_2__a_, scaling_factor_2);
        net_scaling_factor = Numbers.multiply(scaling_factor_3, scaling_factor_2);
        PrintLow.format((SubLObject)temporal_projection_preds.T, (SubLObject)temporal_projection_preds.$str24$___Net_scaling_factor__a_, net_scaling_factor);
        scaled_prob = Numbers.divide(alpha, net_scaling_factor);
        PrintLow.format((SubLObject)temporal_projection_preds.T, (SubLObject)temporal_projection_preds.$str25$___Scaled_prob__a_, scaled_prob);
        PrintLow.format((SubLObject)temporal_projection_preds.T, (SubLObject)temporal_projection_preds.$str26$___Net_likelihood__a_, Numbers.expt(Numbers.divide((SubLObject)temporal_projection_preds.ONE_INTEGER, Numbers.add((SubLObject)temporal_projection_preds.ONE_INTEGER, scaled_prob)), time_elapsed_in_years));
        return (SubLObject)temporal_projection_preds.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-preds.lisp", position = 9172L)
    public static SubLObject find_level_of_opaque_expertise_on_topic_with_rating(final SubLObject sent, final SubLObject mt, final SubLObject justifyP) {
        return (SubLObject)temporal_projection_preds.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-preds.lisp", position = 13288L)
    public static SubLObject scale_prob_from_covariates_for_familiarity_queries(final SubLObject prob, final SubLObject time_elapsed, final SubLObject scaling_assertion, final SubLObject applicableP) {
        if (temporal_projection_preds.NIL == scaling_assertion) {
            return prob;
        }
        if (temporal_projection_preds.NIL == applicableP) {
            return prob;
        }
        if (prob.isNumber() && prob.numE((SubLObject)temporal_projection_preds.ZERO_INTEGER)) {
            return prob;
        }
        final SubLObject gaf = assertions_high.gaf_formula(scaling_assertion);
        final SubLObject minus_alpha = Numbers.log(Numbers.divide(Numbers.subtract((SubLObject)temporal_projection_preds.ONE_INTEGER, prob), prob), (SubLObject)temporal_projection_preds.$float36$2_71);
        final SubLObject factor = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_preds.UNPROVIDED);
        final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_preds.UNPROVIDED);
        final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
        final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, (SubLObject)temporal_projection_preds.UNPROVIDED);
        final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0(time_elapsed);
        final SubLObject value_of_time_elapsed = cycl_utilities.formula_arg1(time_elapsed, (SubLObject)temporal_projection_preds.UNPROVIDED);
        final SubLObject unit_conversion = quantities.convert_to_units(unit_of_duration_of_time_interval, unit_of_time_elapsed, (SubLObject)temporal_projection_preds.ONE_INTEGER, (SubLObject)temporal_projection_preds.UNPROVIDED);
        if (temporal_projection_preds.NIL != unit_conversion && temporal_projection_preds.NIL != value_of_time_elapsed && temporal_projection_preds.NIL != factor && temporal_projection_preds.NIL != prob && temporal_projection_preds.NIL != value_of_duration_of_time_interval) {
            final SubLObject e_to_the_power_minus_beta = Numbers.multiply(Numbers.divide(value_of_time_elapsed, value_of_duration_of_time_interval), unit_conversion);
            final SubLObject e_to_the_power_minus_alpha = Numbers.expt((SubLObject)temporal_projection_preds.$float36$2_71, minus_alpha);
            PrintLow.format((SubLObject)temporal_projection_preds.T, (SubLObject)temporal_projection_preds.$str31$____a__a_, e_to_the_power_minus_beta, e_to_the_power_minus_alpha);
            return Numbers.min((SubLObject)temporal_projection_preds.ONE_INTEGER, Numbers.multiply(prob, Numbers.add((SubLObject)temporal_projection_preds.ONE_INTEGER, Numbers.divide(e_to_the_power_minus_beta, (SubLObject)temporal_projection_preds.$int20$100))));
        }
        return (SubLObject)temporal_projection_preds.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-preds.lisp", position = 14521L)
    public static SubLObject scale_prob_from_covariates_for_familiarity_queries_2(final SubLObject prob, final SubLObject time_elapsed, final SubLObject scaling_assertion, final SubLObject applicableP) {
        if (temporal_projection_preds.NIL == scaling_assertion) {
            return prob;
        }
        if (temporal_projection_preds.NIL == applicableP) {
            return prob;
        }
        if (prob.isNumber() && prob.numE((SubLObject)temporal_projection_preds.ZERO_INTEGER)) {
            return prob;
        }
        final SubLObject gaf = assertions_high.gaf_formula(scaling_assertion);
        final SubLObject factor = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_preds.UNPROVIDED);
        final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_preds.UNPROVIDED);
        final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
        final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, (SubLObject)temporal_projection_preds.UNPROVIDED);
        final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0(time_elapsed);
        final SubLObject value_of_time_elapsed = cycl_utilities.formula_arg1(time_elapsed, (SubLObject)temporal_projection_preds.UNPROVIDED);
        final SubLObject unit_conversion = quantities.convert_to_units(unit_of_duration_of_time_interval, unit_of_time_elapsed, (SubLObject)temporal_projection_preds.ONE_INTEGER, (SubLObject)temporal_projection_preds.UNPROVIDED);
        if (temporal_projection_preds.NIL != unit_conversion && temporal_projection_preds.NIL != value_of_time_elapsed && temporal_projection_preds.NIL != factor && temporal_projection_preds.NIL != prob && temporal_projection_preds.NIL != value_of_duration_of_time_interval) {
            final SubLObject pow = Numbers.multiply(Numbers.divide(value_of_time_elapsed, value_of_duration_of_time_interval), unit_conversion);
            PrintLow.format((SubLObject)temporal_projection_preds.T, (SubLObject)temporal_projection_preds.$str37$____a__a__a_, new SubLObject[] { prob, factor, pow });
            return Numbers.min((SubLObject)temporal_projection_preds.$float38$0_98, Numbers.multiply(prob, Numbers.expt(factor, pow)));
        }
        return (SubLObject)temporal_projection_preds.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-preds.lisp", position = 15578L)
    public static SubLObject return_best_explanation(final SubLObject lst) {
        if (Sequences.length(lst).numE((SubLObject)temporal_projection_preds.ONE_INTEGER)) {
            final SubLObject entry = cycl_utilities.formula_arg0(lst);
            return Values.values(cycl_utilities.formula_arg0(entry), cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection_preds.UNPROVIDED));
        }
        SubLObject current_best_entry = cycl_utilities.formula_arg0(lst);
        SubLObject current_best_score = cycl_utilities.formula_arg1(cycl_utilities.formula_arg0(current_best_entry), (SubLObject)temporal_projection_preds.UNPROVIDED);
        SubLObject cdolist_list_var = cycl_utilities.formula_args(lst, (SubLObject)temporal_projection_preds.UNPROVIDED);
        SubLObject entry2 = (SubLObject)temporal_projection_preds.NIL;
        entry2 = cdolist_list_var.first();
        while (temporal_projection_preds.NIL != cdolist_list_var) {
            final SubLObject score = cycl_utilities.formula_arg1(cycl_utilities.formula_arg0(entry2), (SubLObject)temporal_projection_preds.UNPROVIDED);
            if (score.numG(current_best_score)) {
                current_best_entry = entry2;
                current_best_score = score;
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry2 = cdolist_list_var.first();
        }
        if (temporal_projection_preds.NIL != cycl_utilities.formula_arg1(current_best_entry, (SubLObject)temporal_projection_preds.UNPROVIDED)) {
            return Values.values(cycl_utilities.formula_arg0(current_best_entry), cycl_utilities.formula_arg1(current_best_entry, (SubLObject)temporal_projection_preds.UNPROVIDED));
        }
        return Values.values(cycl_utilities.formula_arg0(current_best_entry));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-preds.lisp", position = 16273L)
    public static SubLObject get_answers_from_new_cyc_query(final SubLObject query, SubLObject mt, SubLObject depth, SubLObject mode) {
        if (mt == temporal_projection_preds.UNPROVIDED) {
            mt = temporal_projection_preds.$const39$EverythingPSC;
        }
        if (depth == temporal_projection_preds.UNPROVIDED) {
            depth = (SubLObject)temporal_projection_preds.ONE_INTEGER;
        }
        if (mode == temporal_projection_preds.UNPROVIDED) {
            mode = (SubLObject)temporal_projection_preds.$kw40$SHALLOW;
        }
        return ask_utilities.recursive_query(query, mt, (SubLObject)ConsesLow.listS((SubLObject)temporal_projection_preds.$kw41$RETURN, new SubLObject[] { temporal_projection_preds.$kw42$BINDINGS_AND_SUPPORTS, temporal_projection_preds.$kw43$INFERENCE_MODE, mode, temporal_projection_preds.$kw44$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, temporal_projection_preds.T, temporal_projection_preds.$kw45$ALLOW_INDETERMINATE_RESULTS_, temporal_projection_preds.NIL, temporal_projection_preds.$kw46$DISJUNCTION_FREE_EL_VARS_POLICY, temporal_projection_preds.$kw47$COMPUTE_INTERSECTION, temporal_projection_preds.$kw48$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, temporal_projection_preds.T, temporal_projection_preds.$kw49$COMPUTE_ANSWER_JUSTIFICATIONS_, temporal_projection_preds.T, temporal_projection_preds.$kw50$MAX_TIME, temporal_projection_preds.ONE_INTEGER, temporal_projection_preds.$kw51$MAX_TRANSFORMATION_DEPTH, depth, temporal_projection_preds.$list52 }));
    }
    
    public static SubLObject declare_temporal_projection_preds_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_preds", "find_likelihood_of_language_spoken", "FIND-LIKELIHOOD-OF-LANGUAGE-SPOKEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_preds", "get_nearest_time_for_fact_truth", "GET-NEAREST-TIME-FOR-FACT-TRUTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_preds", "find_likelihood_of_acquaintances", "FIND-LIKELIHOOD-OF-ACQUAINTANCES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_preds", "find_scaling_factor_from_org", "FIND-SCALING-FACTOR-FROM-ORG", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_preds", "find_likelihood_given_value_of_parameters", "FIND-LIKELIHOOD-GIVEN-VALUE-OF-PARAMETERS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_preds", "find_level_of_opaque_expertise_on_topic_with_rating", "FIND-LEVEL-OF-OPAQUE-EXPERTISE-ON-TOPIC-WITH-RATING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_preds", "scale_prob_from_covariates_for_familiarity_queries", "SCALE-PROB-FROM-COVARIATES-FOR-FAMILIARITY-QUERIES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_preds", "scale_prob_from_covariates_for_familiarity_queries_2", "SCALE-PROB-FROM-COVARIATES-FOR-FAMILIARITY-QUERIES-2", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_preds", "return_best_explanation", "RETURN-BEST-EXPLANATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_preds", "get_answers_from_new_cyc_query", "GET-ANSWERS-FROM-NEW-CYC-QUERY", 1, 3, false);
        return (SubLObject)temporal_projection_preds.NIL;
    }
    
    public static SubLObject init_temporal_projection_preds_file() {
        return (SubLObject)temporal_projection_preds.NIL;
    }
    
    public static SubLObject setup_temporal_projection_preds_file() {
        return (SubLObject)temporal_projection_preds.NIL;
    }
    
    public void declareFunctions() {
        declare_temporal_projection_preds_file();
    }
    
    public void initializeVariables() {
        init_temporal_projection_preds_file();
    }
    
    public void runTopLevelForms() {
        setup_temporal_projection_preds_file();
    }
    
    static {
        me = (SubLFile)new temporal_projection_preds();
        $const0$Now = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Now"));
        $const1$Forever_Quantity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Forever-Quantity"));
        $const2$NumericLikelihoodFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NumericLikelihoodFn"));
        $const3$defaultConditionalProbabilityForS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultConditionalProbabilityForSentenceInInterval"));
        $const4$YearFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn"));
        $const5$MtSpace = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtSpace"));
        $const6$MtTimeWithGranularityDimFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtTimeWithGranularityDimFn"));
        $list7 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimePoint")));
        $const8$agentsOverlapInPositionAtOrganiza = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("agentsOverlapInPositionAtOrganizationForPeriod"));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)SubLObjectFactory.makeSymbol("?Z"));
        $sym10$_Z = SubLObjectFactory.makeSymbol("?Z");
        $const11$YearsDuration = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearsDuration"));
        $float12$3_5 = (SubLFloat)SubLObjectFactory.makeDouble(3.5);
        $float13$0_75 = (SubLFloat)SubLObjectFactory.makeDouble(0.75);
        $sym14$_X = SubLObjectFactory.makeSymbol("?X");
        $sym15$_Y = SubLObjectFactory.makeSymbol("?Y");
        $list16 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DaysDuration")), (SubLObject)temporal_projection_preds.ZERO_INTEGER);
        $const17$numberInPositionAtOrganization = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("numberInPositionAtOrganization"));
        $const18$covariateScalesConditionalProbabi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("covariateScalesConditionalProbabilityByFactor"));
        $const19$likelyCloseAcquaintances = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("likelyCloseAcquaintances"));
        $int20$100 = SubLObjectFactory.makeInteger(100);
        $const21$typicalGroupCardinalityForTypeWit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typicalGroupCardinalityForTypeWithinOrgType"));
        $str22$___Scaling_factor_1__a_ = SubLObjectFactory.makeString("~% Scaling factor 1 ~a ");
        $str23$___Scaling_factor_2__a_ = SubLObjectFactory.makeString("~% Scaling factor 2 ~a ");
        $str24$___Net_scaling_factor__a_ = SubLObjectFactory.makeString("~% Net scaling factor ~a ");
        $str25$___Scaled_prob__a_ = SubLObjectFactory.makeString("~% Scaled prob ~a ");
        $str26$___Net_likelihood__a_ = SubLObjectFactory.makeString("~% Net likelihood ~a ");
        $const27$hasLevelOfOpaqueExpertiseOnTopicT = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasLevelOfOpaqueExpertiseOnTopicToFrom"));
        $kw28$EXTENDED = SubLObjectFactory.makeKeyword("EXTENDED");
        $const29$hasLevelOfOpaqueExpertiseOnTopicW = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasLevelOfOpaqueExpertiseOnTopicWithRating"));
        $const30$scoreForGenericValuePredicateForE = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scoreForGenericValuePredicateForExperienceEvaluation"));
        $str31$____a__a_ = SubLObjectFactory.makeString("~% ~a ~a ");
        $str32$_____likelihood__a_value_of_time_ = SubLObjectFactory.makeString("~% - likelihood ~a value-of-time-elapsed ~a ~a");
        $int33$31536000 = SubLObjectFactory.makeInteger(31536000);
        $const34$timeElapsed = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("timeElapsed"));
        $const35$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $float36$2_71 = (SubLFloat)SubLObjectFactory.makeDouble(2.71);
        $str37$____a__a__a_ = SubLObjectFactory.makeString("~% ~a ~a ~a ");
        $float38$0_98 = (SubLFloat)SubLObjectFactory.makeDouble(0.98);
        $const39$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw40$SHALLOW = SubLObjectFactory.makeKeyword("SHALLOW");
        $kw41$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw42$BINDINGS_AND_SUPPORTS = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $kw43$INFERENCE_MODE = SubLObjectFactory.makeKeyword("INFERENCE-MODE");
        $kw44$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = SubLObjectFactory.makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
        $kw45$ALLOW_INDETERMINATE_RESULTS_ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $kw46$DISJUNCTION_FREE_EL_VARS_POLICY = SubLObjectFactory.makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");
        $kw47$COMPUTE_INTERSECTION = SubLObjectFactory.makeKeyword("COMPUTE-INTERSECTION");
        $kw48$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $kw49$COMPUTE_ANSWER_JUSTIFICATIONS_ = SubLObjectFactory.makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
        $kw50$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw51$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), (SubLObject)SubLObjectFactory.makeDouble(1.0), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeKeyword("CONTINUABLE?"), (SubLObject)temporal_projection_preds.NIL);
    }
}

/*

	Total time: 136 ms
	
*/