package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.temporal_projection_preds;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.temporal_projection_preds.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class temporal_projection_preds extends SubLTranslatedFile {
    public static final SubLFile me = new temporal_projection_preds();

    public static final String myName = "com.cyc.cycjava.cycl.temporal_projection_preds";

    public static final String myFingerPrint = "4647529fcbeac15ec04e63d758965acb1143dfcd5f7bc0b294c1031b29751e36";

    private static final SubLObject $$Now = reader_make_constant_shell(makeString("Now"));

    private static final SubLObject $$Forever_Quantity = reader_make_constant_shell(makeString("Forever-Quantity"));

    private static final SubLObject $$NumericLikelihoodFn = reader_make_constant_shell(makeString("NumericLikelihoodFn"));

    private static final SubLObject $const3$defaultConditionalProbabilityForS = reader_make_constant_shell(makeString("defaultConditionalProbabilityForSentenceInInterval"));

    private static final SubLObject $$YearFn = reader_make_constant_shell(makeString("YearFn"));

    private static final SubLObject $$MtSpace = reader_make_constant_shell(makeString("MtSpace"));

    private static final SubLObject $$MtTimeWithGranularityDimFn = reader_make_constant_shell(makeString("MtTimeWithGranularityDimFn"));

    private static final SubLList $list7 = list(reader_make_constant_shell(makeString("TimePoint")));

    private static final SubLObject $const8$agentsOverlapInPositionAtOrganiza = reader_make_constant_shell(makeString("agentsOverlapInPositionAtOrganizationForPeriod"));

    private static final SubLList $list9 = list(makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?Z"));

    private static final SubLSymbol $sym10$_Z = makeSymbol("?Z");

    private static final SubLObject $$YearsDuration = reader_make_constant_shell(makeString("YearsDuration"));

    private static final SubLFloat $float$3_5 = makeDouble(3.5);

    private static final SubLFloat $float$0_75 = makeDouble(0.75);

    private static final SubLSymbol $sym14$_X = makeSymbol("?X");

    private static final SubLSymbol $sym15$_Y = makeSymbol("?Y");

    private static final SubLList $list16 = list(reader_make_constant_shell(makeString("DaysDuration")), ZERO_INTEGER);

    private static final SubLObject $$numberInPositionAtOrganization = reader_make_constant_shell(makeString("numberInPositionAtOrganization"));

    private static final SubLObject $const18$covariateScalesConditionalProbabi = reader_make_constant_shell(makeString("covariateScalesConditionalProbabilityByFactor"));

    private static final SubLObject $$likelyCloseAcquaintances = reader_make_constant_shell(makeString("likelyCloseAcquaintances"));



    private static final SubLObject $const21$typicalGroupCardinalityForTypeWit = reader_make_constant_shell(makeString("typicalGroupCardinalityForTypeWithinOrgType"));

    private static final SubLString $str22$___Scaling_factor_1__a_ = makeString("~% Scaling factor 1 ~a ");

    private static final SubLString $str23$___Scaling_factor_2__a_ = makeString("~% Scaling factor 2 ~a ");

    private static final SubLString $str24$___Net_scaling_factor__a_ = makeString("~% Net scaling factor ~a ");

    private static final SubLString $str25$___Scaled_prob__a_ = makeString("~% Scaled prob ~a ");

    private static final SubLString $str26$___Net_likelihood__a_ = makeString("~% Net likelihood ~a ");

    private static final SubLObject $const27$hasLevelOfOpaqueExpertiseOnTopicT = reader_make_constant_shell(makeString("hasLevelOfOpaqueExpertiseOnTopicToFrom"));



    private static final SubLObject $const29$hasLevelOfOpaqueExpertiseOnTopicW = reader_make_constant_shell(makeString("hasLevelOfOpaqueExpertiseOnTopicWithRating"));

    private static final SubLObject $const30$scoreForGenericValuePredicateForE = reader_make_constant_shell(makeString("scoreForGenericValuePredicateForExperienceEvaluation"));

    private static final SubLString $str31$____a__a_ = makeString("~% ~a ~a ");

    private static final SubLString $str32$_____likelihood__a_value_of_time_ = makeString("~% - likelihood ~a value-of-time-elapsed ~a ~a");

    private static final SubLInteger $int$31536000 = makeInteger(31536000);

    private static final SubLObject $$timeElapsed = reader_make_constant_shell(makeString("timeElapsed"));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLFloat $float$2_71 = makeDouble(2.71);

    private static final SubLString $str37$____a__a__a_ = makeString("~% ~a ~a ~a ");

    private static final SubLFloat $float$0_98 = makeDouble(0.98);

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));





    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");



    private static final SubLSymbol $kw44$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");

    private static final SubLSymbol $kw45$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");

    private static final SubLSymbol $DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");



    private static final SubLSymbol $kw48$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");

    private static final SubLSymbol $kw49$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");



    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLList $list52 = list(makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), NIL);

    public static SubLObject find_likelihood_of_language_spoken(final SubLObject fact, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_time = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(mt, UNPROVIDED), UNPROVIDED);
        if (!mt_time.eql($$Now)) {
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject v_answer = get_nearest_time_for_fact_truth(fact, mt);
        final SubLObject time = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_answer) {
            SubLObject time_1 = NIL;
            SubLObject list_of_answer_and_justifications = NIL;
            SubLObject justifications = cycl_utilities.formula_arg1(v_answer, UNPROVIDED);
            if (mt_time.eql($$Now)) {
                time_1 = date_utilities.indexical_now();
            } else {
                time_1 = mt_time;
            }
            final SubLObject time_elapsed = date_utilities.time_elapsed(time_1, time, UNPROVIDED);
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg0(fact), $const3$defaultConditionalProbabilityForS, ONE_INTEGER, UNPROVIDED);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject applicable_time_interval = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
                final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
                final SubLObject prob = cycl_utilities.formula_arg4(gaf, UNPROVIDED);
                if (NIL != date_utilities.later_than(time_1, time)) {
                    final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
                    final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, UNPROVIDED);
                    final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0(time_elapsed);
                    final SubLObject value_of_time_elapsed = cycl_utilities.formula_arg1(time_elapsed, UNPROVIDED);
                    final SubLObject unit_conversion = quantities.convert_to_units(unit_of_duration_of_time_interval, unit_of_time_elapsed, ONE_INTEGER, UNPROVIDED);
                    if ((((applicable_time_interval.eql($$Forever_Quantity) && (NIL != unit_conversion)) && (NIL != value_of_time_elapsed)) && (NIL != prob)) && (NIL != value_of_duration_of_time_interval)) {
                        final SubLObject likelihood = expt(prob, multiply(divide(value_of_time_elapsed, value_of_duration_of_time_interval), unit_conversion));
                        if (((NIL != likelihood) && (!likelihood.numG(ONE_INTEGER))) && (!likelihood.numL(ZERO_INTEGER))) {
                            justifications = append(justifications, list(assertion));
                            list_of_answer_and_justifications = cons(list(list($$NumericLikelihoodFn, likelihood), justifications), list_of_answer_and_justifications);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
            return return_best_explanation(list_of_answer_and_justifications);
        }
        return NIL;
    }

    public static SubLObject get_nearest_time_for_fact_truth(final SubLObject fact, final SubLObject mt) {
        final SubLObject monad_mt = temporal_projection_utilities.get_monad_mt(mt);
        final SubLObject time_1 = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(mt, UNPROVIDED), UNPROVIDED);
        SubLObject time = NIL;
        SubLObject year_of_date = NIL;
        if (time_1.eql($$Now)) {
            time = date_utilities.indexical_now();
        } else {
            time = time_1;
        }
        year_of_date = cycl_utilities.formula_arg1(date_utilities.year_of_date(time), UNPROVIDED);
        if (NIL != year_of_date) {
            SubLObject count;
            SubLObject time_for_query;
            SubLObject mt_for_query;
            SubLObject v_answer;
            for (count = NIL, count = ZERO_INTEGER; count.numL(SEVEN_INTEGER); count = add(count, ONE_INTEGER)) {
                time_for_query = list($$YearFn, subtract(year_of_date, count));
                mt_for_query = list($$MtSpace, monad_mt, listS($$MtTimeWithGranularityDimFn, time_for_query, $list7));
                v_answer = get_answers_from_new_cyc_query(fact, mt_for_query, UNPROVIDED, UNPROVIDED);
                if (NIL != v_answer) {
                    return values(cycl_utilities.formula_arg0(v_answer), time_for_query);
                }
            }
        }
        return NIL;
    }

    public static SubLObject find_likelihood_of_acquaintances(final SubLObject fact, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject answers = get_answers_from_new_cyc_query(listS($const8$agentsOverlapInPositionAtOrganiza, cycl_utilities.formula_arg1(fact, UNPROVIDED), cycl_utilities.formula_arg2(fact, UNPROVIDED), $list9), mt, UNPROVIDED, UNPROVIDED);
        SubLObject list_of_answer_and_justifications = NIL;
        final SubLObject predicate = cycl_utilities.formula_arg0(fact);
        SubLObject time = NIL;
        if (NIL != mt) {
            final SubLObject time_1 = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(mt, UNPROVIDED), UNPROVIDED);
            if (time_1.eql($$Now)) {
                time = date_utilities.indexical_now();
            } else {
                time = time_1;
            }
        }
        if (NIL == time) {
            return NIL;
        }
        final SubLObject cdolist_list_var = answers;
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        if (NIL != cdolist_list_var) {
            SubLObject justifications = NIL;
            final SubLObject v_bindings = cycl_utilities.formula_arg0(v_answer);
            final SubLObject justification_1 = cycl_utilities.formula_arg1(v_answer, UNPROVIDED);
            final SubLObject time_interval = bindings.variable_lookup($sym10$_Z, v_bindings);
            final SubLObject starting_time = cycl_utilities.formula_arg1(time_interval, UNPROVIDED);
            final SubLObject ending_time = cycl_utilities.formula_arg2(time_interval, UNPROVIDED);
            final SubLObject time_elapsed = time_interval_utilities.time_interval_duration(time_interval, UNPROVIDED);
            final SubLObject time_elapsed_in_years = quantities.convert_to_units($$YearsDuration, cycl_utilities.formula_arg0(time_elapsed), cycl_utilities.formula_arg1(time_elapsed, UNPROVIDED), UNPROVIDED);
            final SubLObject scaling_factor_2 = multiply($float$3_5, expt(time_elapsed_in_years, $float$0_75));
            final SubLObject position = bindings.variable_lookup($sym14$_X, v_bindings);
            final SubLObject org = bindings.variable_lookup($sym15$_Y, v_bindings);
            SubLObject net_scaling_factor = NIL;
            thread.resetMultipleValues();
            final SubLObject scaling_factor_3 = find_scaling_factor_from_org(org, position, mt);
            final SubLObject scaling_just = thread.secondMultipleValue();
            thread.resetMultipleValues();
            net_scaling_factor = multiply(scaling_factor_3, scaling_factor_2);
            justifications = append(scaling_just, justification_1);
            SubLObject cdolist_list_var_$1 = kb_mapping_utilities.pred_value_gafs_in_any_mt(predicate, $const3$defaultConditionalProbabilityForS, ONE_INTEGER, UNPROVIDED);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject applicable_time_interval = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
                final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
                final SubLObject prob = cycl_utilities.formula_arg4(gaf, UNPROVIDED);
                final SubLObject alpha = divide(subtract(ONE_INTEGER, prob), prob);
                final SubLObject alpha_times_covariate = divide(alpha, net_scaling_factor);
                final SubLObject net_prob = divide(ONE_INTEGER, add(ONE_INTEGER, alpha_times_covariate));
                SubLObject time_elapsed_2 = temporal_projection.find_time_elapsed_between_time_points(ending_time, time);
                if (NIL == date_utilities.later_than(starting_time, time)) {
                    if (NIL != date_utilities.later_than(ending_time, time)) {
                        time_elapsed_2 = $list16;
                    }
                    final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
                    final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, UNPROVIDED);
                    final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0(time_elapsed_2);
                    final SubLObject value_of_time_elapsed = cycl_utilities.formula_arg1(time_elapsed_2, UNPROVIDED);
                    final SubLObject unit_conversion = quantities.convert_to_units(unit_of_duration_of_time_interval, unit_of_time_elapsed, ONE_INTEGER, UNPROVIDED);
                    if ((((applicable_time_interval.eql($$Forever_Quantity) && (NIL != unit_conversion)) && (NIL != value_of_time_elapsed)) && (NIL != prob)) && (NIL != value_of_duration_of_time_interval)) {
                        final SubLObject likelihood = expt(net_prob, multiply(divide(value_of_time_elapsed, value_of_duration_of_time_interval), unit_conversion));
                        if (((NIL != likelihood) && (!likelihood.numG(ONE_INTEGER))) && (!likelihood.numL(ZERO_INTEGER))) {
                            if (NIL != justifyP) {
                                if (NIL != date_utilities.later_than(time, ending_time)) {
                                    justifications = append(justifications, list(assertion));
                                }
                                list_of_answer_and_justifications = cons(list(list($$NumericLikelihoodFn, likelihood), justifications), list_of_answer_and_justifications);
                            } else {
                                list_of_answer_and_justifications = cons(list(list($$NumericLikelihoodFn, likelihood)), list_of_answer_and_justifications);
                            }
                        }
                    }
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                assertion = cdolist_list_var_$1.first();
            } 
            return return_best_explanation(list_of_answer_and_justifications);
        }
        return NIL;
    }

    public static SubLObject find_scaling_factor_from_org(final SubLObject org, SubLObject position, final SubLObject mt) {
        SubLObject number = NIL;
        final SubLObject number_in_pos_assertion = kb_mapping_utilities.pred_u_v_holds_gafs_in_relevant_mts($$numberInPositionAtOrganization, position, org, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != number_in_pos_assertion) {
            final SubLObject number_in_pos_gaf = assertions_high.gaf_formula(cycl_utilities.formula_arg0(number_in_pos_assertion));
            number = cycl_utilities.formula_arg2(cycl_utilities.formula_arg3(number_in_pos_gaf, UNPROVIDED), UNPROVIDED);
        }
        if (NIL != number) {
            final SubLObject just = kb_mapping_utilities.pred_u_v_holds_gafs_in_relevant_mts($const18$covariateScalesConditionalProbabi, $$likelyCloseAcquaintances, $$numberInPositionAtOrganization, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != just) {
                return values(add(ONE_INTEGER, divide($int$100, number)), append(just, number_in_pos_assertion));
            }
        }
        final SubLObject typical_no_assertion = kb_mapping_utilities.pred_value_gafs_in_relevant_mts(position, $const21$typicalGroupCardinalityForTypeWit, mt, UNPROVIDED, UNPROVIDED);
        if (NIL != typical_no_assertion) {
            final SubLObject typical_no_gaf = assertions_high.gaf_formula(cycl_utilities.formula_arg0(typical_no_assertion));
            final SubLObject just2 = kb_mapping_utilities.pred_u_v_holds_gafs_in_relevant_mts($const18$covariateScalesConditionalProbabi, $$likelyCloseAcquaintances, $$numberInPositionAtOrganization, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != just2) {
                number = cycl_utilities.formula_arg2(cycl_utilities.formula_arg3(typical_no_gaf, UNPROVIDED), UNPROVIDED);
                return values(add(ONE_INTEGER, divide($int$100, number)), append(just2, typical_no_assertion));
            }
        }
        return values(ONE_INTEGER, NIL);
    }

    public static SubLObject find_likelihood_given_value_of_parameters(final SubLObject overlap_in_years, final SubLObject max_size, final SubLObject base_prob, final SubLObject time_elapsed_in_years) {
        final SubLObject scaling_factor_2 = multiply($float$3_5, expt(overlap_in_years, $float$0_75));
        final SubLObject alpha = divide(subtract(ONE_INTEGER, base_prob), base_prob);
        SubLObject scaling_factor_3 = ONE_INTEGER;
        SubLObject scaled_prob = NIL;
        SubLObject net_scaling_factor = ONE_INTEGER;
        if (NIL != max_size) {
            scaling_factor_3 = add(ONE_INTEGER, divide($int$100, max_size));
        }
        format(T, $str22$___Scaling_factor_1__a_, scaling_factor_3);
        format(T, $str23$___Scaling_factor_2__a_, scaling_factor_2);
        net_scaling_factor = multiply(scaling_factor_3, scaling_factor_2);
        format(T, $str24$___Net_scaling_factor__a_, net_scaling_factor);
        scaled_prob = divide(alpha, net_scaling_factor);
        format(T, $str25$___Scaled_prob__a_, scaled_prob);
        format(T, $str26$___Net_likelihood__a_, expt(divide(ONE_INTEGER, add(ONE_INTEGER, scaled_prob)), time_elapsed_in_years));
        return NIL;
    }

    public static SubLObject find_level_of_opaque_expertise_on_topic_with_rating(final SubLObject sent, final SubLObject mt, final SubLObject justifyP) {
        return NIL;
    }

    public static SubLObject scale_prob_from_covariates_for_familiarity_queries(final SubLObject prob, final SubLObject time_elapsed, final SubLObject scaling_assertion, final SubLObject applicableP) {
        if (NIL == scaling_assertion) {
            return prob;
        }
        if (NIL == applicableP) {
            return prob;
        }
        if (prob.isNumber() && prob.numE(ZERO_INTEGER)) {
            return prob;
        }
        final SubLObject gaf = assertions_high.gaf_formula(scaling_assertion);
        final SubLObject minus_alpha = log(divide(subtract(ONE_INTEGER, prob), prob), $float$2_71);
        final SubLObject factor = cycl_utilities.formula_arg4(gaf, UNPROVIDED);
        final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
        final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
        final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, UNPROVIDED);
        final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0(time_elapsed);
        final SubLObject value_of_time_elapsed = cycl_utilities.formula_arg1(time_elapsed, UNPROVIDED);
        final SubLObject unit_conversion = quantities.convert_to_units(unit_of_duration_of_time_interval, unit_of_time_elapsed, ONE_INTEGER, UNPROVIDED);
        if (((((NIL != unit_conversion) && (NIL != value_of_time_elapsed)) && (NIL != factor)) && (NIL != prob)) && (NIL != value_of_duration_of_time_interval)) {
            final SubLObject e_to_the_power_minus_beta = multiply(divide(value_of_time_elapsed, value_of_duration_of_time_interval), unit_conversion);
            final SubLObject e_to_the_power_minus_alpha = expt($float$2_71, minus_alpha);
            format(T, $str31$____a__a_, e_to_the_power_minus_beta, e_to_the_power_minus_alpha);
            return min(ONE_INTEGER, multiply(prob, add(ONE_INTEGER, divide(e_to_the_power_minus_beta, $int$100))));
        }
        return NIL;
    }

    public static SubLObject scale_prob_from_covariates_for_familiarity_queries_2(final SubLObject prob, final SubLObject time_elapsed, final SubLObject scaling_assertion, final SubLObject applicableP) {
        if (NIL == scaling_assertion) {
            return prob;
        }
        if (NIL == applicableP) {
            return prob;
        }
        if (prob.isNumber() && prob.numE(ZERO_INTEGER)) {
            return prob;
        }
        final SubLObject gaf = assertions_high.gaf_formula(scaling_assertion);
        final SubLObject factor = cycl_utilities.formula_arg4(gaf, UNPROVIDED);
        final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
        final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
        final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, UNPROVIDED);
        final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0(time_elapsed);
        final SubLObject value_of_time_elapsed = cycl_utilities.formula_arg1(time_elapsed, UNPROVIDED);
        final SubLObject unit_conversion = quantities.convert_to_units(unit_of_duration_of_time_interval, unit_of_time_elapsed, ONE_INTEGER, UNPROVIDED);
        if (((((NIL != unit_conversion) && (NIL != value_of_time_elapsed)) && (NIL != factor)) && (NIL != prob)) && (NIL != value_of_duration_of_time_interval)) {
            final SubLObject pow = multiply(divide(value_of_time_elapsed, value_of_duration_of_time_interval), unit_conversion);
            format(T, $str37$____a__a__a_, new SubLObject[]{ prob, factor, pow });
            return min($float$0_98, multiply(prob, expt(factor, pow)));
        }
        return NIL;
    }

    public static SubLObject return_best_explanation(final SubLObject lst) {
        if (length(lst).numE(ONE_INTEGER)) {
            final SubLObject entry = cycl_utilities.formula_arg0(lst);
            return values(cycl_utilities.formula_arg0(entry), cycl_utilities.formula_arg1(entry, UNPROVIDED));
        }
        SubLObject current_best_entry = cycl_utilities.formula_arg0(lst);
        SubLObject current_best_score = cycl_utilities.formula_arg1(cycl_utilities.formula_arg0(current_best_entry), UNPROVIDED);
        SubLObject cdolist_list_var = cycl_utilities.formula_args(lst, UNPROVIDED);
        SubLObject entry2 = NIL;
        entry2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject score = cycl_utilities.formula_arg1(cycl_utilities.formula_arg0(entry2), UNPROVIDED);
            if (score.numG(current_best_score)) {
                current_best_entry = entry2;
                current_best_score = score;
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry2 = cdolist_list_var.first();
        } 
        if (NIL != cycl_utilities.formula_arg1(current_best_entry, UNPROVIDED)) {
            return values(cycl_utilities.formula_arg0(current_best_entry), cycl_utilities.formula_arg1(current_best_entry, UNPROVIDED));
        }
        return values(cycl_utilities.formula_arg0(current_best_entry));
    }

    public static SubLObject get_answers_from_new_cyc_query(final SubLObject query, SubLObject mt, SubLObject depth, SubLObject mode) {
        if (mt == UNPROVIDED) {
            mt = $$EverythingPSC;
        }
        if (depth == UNPROVIDED) {
            depth = ONE_INTEGER;
        }
        if (mode == UNPROVIDED) {
            mode = $SHALLOW;
        }
        return ask_utilities.recursive_query(query, mt, listS($RETURN, new SubLObject[]{ $BINDINGS_AND_SUPPORTS, $INFERENCE_MODE, mode, $kw44$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, T, $kw45$ALLOW_INDETERMINATE_RESULTS_, NIL, $DISJUNCTION_FREE_EL_VARS_POLICY, $COMPUTE_INTERSECTION, $kw48$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, T, $kw49$COMPUTE_ANSWER_JUSTIFICATIONS_, T, $MAX_TIME, ONE_INTEGER, $MAX_TRANSFORMATION_DEPTH, depth, $list52 }));
    }

    public static SubLObject declare_temporal_projection_preds_file() {
        declareFunction(me, "find_likelihood_of_language_spoken", "FIND-LIKELIHOOD-OF-LANGUAGE-SPOKEN", 2, 0, false);
        declareFunction(me, "get_nearest_time_for_fact_truth", "GET-NEAREST-TIME-FOR-FACT-TRUTH", 2, 0, false);
        declareFunction(me, "find_likelihood_of_acquaintances", "FIND-LIKELIHOOD-OF-ACQUAINTANCES", 3, 0, false);
        declareFunction(me, "find_scaling_factor_from_org", "FIND-SCALING-FACTOR-FROM-ORG", 3, 0, false);
        declareFunction(me, "find_likelihood_given_value_of_parameters", "FIND-LIKELIHOOD-GIVEN-VALUE-OF-PARAMETERS", 4, 0, false);
        declareFunction(me, "find_level_of_opaque_expertise_on_topic_with_rating", "FIND-LEVEL-OF-OPAQUE-EXPERTISE-ON-TOPIC-WITH-RATING", 3, 0, false);
        declareFunction(me, "scale_prob_from_covariates_for_familiarity_queries", "SCALE-PROB-FROM-COVARIATES-FOR-FAMILIARITY-QUERIES", 4, 0, false);
        declareFunction(me, "scale_prob_from_covariates_for_familiarity_queries_2", "SCALE-PROB-FROM-COVARIATES-FOR-FAMILIARITY-QUERIES-2", 4, 0, false);
        declareFunction(me, "return_best_explanation", "RETURN-BEST-EXPLANATION", 1, 0, false);
        declareFunction(me, "get_answers_from_new_cyc_query", "GET-ANSWERS-FROM-NEW-CYC-QUERY", 1, 3, false);
        return NIL;
    }

    public static SubLObject init_temporal_projection_preds_file() {
        return NIL;
    }

    public static SubLObject setup_temporal_projection_preds_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_temporal_projection_preds_file();
    }

    @Override
    public void initializeVariables() {
        init_temporal_projection_preds_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_temporal_projection_preds_file();
    }

    static {






















































    }
}

/**
 * Total time: 136 ms
 */
