package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class temporal_projection extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.temporal_projection";
    public static final String myFingerPrint = "0f83255037d0cbed384b89e8c7fdc80f25320b7053f47f0669766176a7cfbf92";
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 701L)
    public static SubLSymbol $numeric_likelihood_fn_zero$;
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 802L)
    public static SubLSymbol $numeric_likelihood_fn_one$;
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 901L)
    public static SubLSymbol $temporal_projection_upper_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 968L)
    public static SubLSymbol $temporal_projection_lower_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 1035L)
    public static SubLSymbol $temporal_projection_mode$;
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 1089L)
    public static SubLSymbol $extended_temporal_projection_mode$;
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 1154L)
    public static SubLSymbol $temporal_projection_list_of_starting_dates$;
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 1228L)
    public static SubLSymbol $temporal_projection_list_of_ending_dates$;
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 1300L)
    public static SubLSymbol $intervals_from_genls_assertions$;
    private static final SubLObject $const0$NumericLikelihoodFn;
    private static final SubLFloat $float1$0_8;
    private static final SubLFloat $float2$0_2;
    private static final SubLObject $const3$MtSpace;
    private static final SubLList $list4;
    private static final SubLObject $const5$isa;
    private static final SubLSymbol $sym6$_EXIT;
    private static final SubLObject $const7$TimeDependentCollection;
    private static final SubLObject $const8$BiologicalLivingObject;
    private static final SubLObject $const9$conditionalProbabilityOfStateAfte;
    private static final SubLObject $const10$timeElapsed;
    private static final SubLObject $const11$BaseKB;
    private static final SubLObject $const12$conditionalProbabilityOfStateAfte;
    private static final SubLObject $const13$defaultConditionalProbabilityOfSt;
    private static final SubLObject $const14$conditionalProbabilityOfEnteringS;
    private static final SubLObject $const15$YearsDuration;
    private static final SubLObject $const16$conditionalProbabilityOfLeavingSt;
    private static final SubLObject $const17$TimeIntervalInclusiveFn;
    private static final SubLObject $const18$temporallyIntersects;
    private static final SubLSymbol $kw19$POS;
    private static final SubLObject $const20$TemporallyQualifiableRelation;
    private static final SubLObject $const21$not;
    private static final SubLSymbol $kw22$ASSERTED_TRUE_DEF;
    private static final SubLSymbol $kw23$ASSERTED_TRUE_MON;
    private static final SubLSymbol $kw24$ASSERTED_FALSE_DEF;
    private static final SubLSymbol $kw25$ASSERTED_FALSE_MON;
    private static final SubLObject $const26$startingPointOfIntervalForSentenc;
    private static final SubLObject $const27$endingPointOfIntervalForSentence;
    private static final SubLObject $const28$statePersistsForDurationFromDate;
    private static final SubLSymbol $sym29$TEMPORALLY_PROJECT;
    private static final SubLObject $const30$relevantDistributionForSentence;
    private static final SubLSymbol $kw31$GAF;
    private static final SubLObject $const32$Forever_Quantity;
    private static final SubLObject $const33$IntervalStartedByFn;
    private static final SubLObject $const34$IntervalEndedByFn;
    private static final SubLObject $const35$conditionalProbabilityForSentence;
    private static final SubLObject $const36$Always_TimeInterval;
    private static final SubLObject $const37$SecondsDuration;
    private static final SubLObject $const38$contemporaryInArg;
    private static final SubLObject $const39$SomethingExisting;
    private static final SubLSymbol $kw40$GENLS;
    private static final SubLObject $const41$genls;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLObject $const44$temporallySubsumes;
    private static final SubLObject $const45$laterThan;
    private static final SubLObject $const46$temporalConstraintBetweenCollecti;
    private static final SubLObject $const47$startsAfterStartingOf;
    private static final SubLObject $const48$TimePoint;
    private static final SubLObject $const49$Now;
    private static final SubLObject $const50$endsAfterStartingOf;
    private static final SubLObject $const51$temporalRelationBetweenArguments;
    private static final SubLSymbol $kw52$DISJOINTWITH;
    private static final SubLObject $const53$disjointWith;
    private static final SubLSymbol $kw54$TRUE;
    private static final SubLObject $const55$startingDate;
    private static final SubLObject $const56$birthDate;
    private static final SubLObject $const57$earliestDateForCollectionMembers;
    private static final SubLObject $const58$dateOfDeath;
    private static final SubLObject $const59$endingDate;
    private static final SubLObject $const60$defaultConditionalProbabilityForS;
    private static final SubLObject $const61$defaultConditionalProbabilityForS;
    private static final SubLObject $const62$TheEmptyTimeInterval;
    private static final SubLObject $const63$temporallyDisjoint;
    private static final SubLObject $const64$TimeInterval_Incl_Excl_Fn;
    private static final SubLObject $const65$initialInArg;
    private static final SubLObject $const66$terminalInArg;
    private static final SubLObject $const67$Person;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$FORMULA_ARG0;
    private static final SubLObject $const70$EverythingPSC;
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 1364L)
    public static SubLObject likelihood_of_truth_of_sentence(final SubLObject fact, SubLObject mt, SubLObject justifyP) {
        if (mt == temporal_projection.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (justifyP == temporal_projection.UNPROVIDED) {
            justifyP = (SubLObject)temporal_projection.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (temporal_projection.NIL != temporal_projection.$temporal_projection_mode$.getDynamicValue(thread)) {
            init_temporal_projection_global_variables();
            final SubLObject monad_mt = temporal_projection_utilities.get_monad_mt(mt);
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate((SubLObject)ConsesLow.listS(temporal_projection.$const3$MtSpace, monad_mt, (SubLObject)temporal_projection.$list4));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (mt.isList()) {
                    final SubLObject mt_time = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(mt, (SubLObject)temporal_projection.UNPROVIDED), (SubLObject)temporal_projection.UNPROVIDED);
                    if (temporal_projection.NIL != mt_time) {
                        final SubLObject predicate = cycl_utilities.formula_arg0(fact);
                        update_temporal_projection_global_variables(fact);
                        if (predicate.eql(temporal_projection.$const5$isa)) {
                            thread.resetMultipleValues();
                            final SubLObject result = find_likelihood_of_truth_of_isa_sentence(fact, mt_time, justifyP);
                            final SubLObject justifications = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (temporal_projection.NIL == result) {
                                return Values.values((SubLObject)temporal_projection.NIL, (SubLObject)temporal_projection.NIL);
                            }
                            if (temporal_projection.NIL != justifyP) {
                                return Values.values(result, justifications);
                            }
                            return Values.values(result, (SubLObject)temporal_projection.NIL);
                        }
                        else {
                            thread.resetMultipleValues();
                            final SubLObject result = find_likelihood_of_truth_of_non_isa_sentence(fact, mt_time, justifyP);
                            final SubLObject justifications = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (temporal_projection.NIL != result) {
                                if (temporal_projection.NIL != justifyP) {
                                    return Values.values(result, justifications);
                                }
                                return Values.values(result, (SubLObject)temporal_projection.NIL);
                            }
                        }
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 2395L)
    public static SubLObject find_likelihood_of_truth_of_isa_sentence(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        if (temporal_projection.NIL != isa.isaP(col, temporal_projection.$const7$TimeDependentCollection, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
            thread.resetMultipleValues();
            SubLObject result = verify_starting_and_ending_times(fact, mt_time);
            SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection.NIL != result) {
                if (temporal_projection.NIL != justifyP) {
                    return Values.values(result, justifications);
                }
                return result;
            }
            else {
                thread.resetMultipleValues();
                result = verify_genls_and_disjoint_with_constraints(fact, mt_time, justifyP);
                justifications = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection.NIL != result) {
                    return Values.values(result, justifications);
                }
                thread.resetMultipleValues();
                result = verify_temporal_constraints_between_collections(fact, mt_time, justifyP);
                justifications = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection.NIL != result) {
                    if (temporal_projection.NIL != justifyP) {
                        return Values.values(result, justifications);
                    }
                    return result;
                }
                else {
                    thread.resetMultipleValues();
                    result = find_likelihood_for_absorbing_states(fact, mt_time, justifyP);
                    justifications = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (temporal_projection.NIL != result) {
                        return Values.values(result, justifications);
                    }
                    if (col.eql(temporal_projection.$const8$BiologicalLivingObject)) {
                        thread.resetMultipleValues();
                        result = temporal_projection_utilities.find_likelihood_of_survival_of_spec(fact, mt_time, justifyP);
                        justifications = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (temporal_projection.NIL != result) {
                            return Values.values(result, justifications);
                        }
                    }
                    thread.resetMultipleValues();
                    result = find_likelihood_by_using_conditional_probability_of_entering_state_when_age_in_interval(fact, mt_time, justifyP);
                    justifications = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (temporal_projection.NIL != result) {
                        return Values.values(result, justifications);
                    }
                    thread.resetMultipleValues();
                    result = find_likelihood_by_using_conditional_probability_of_leaving_state_when_age_in_interval(fact, mt_time, justifyP);
                    justifications = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (temporal_projection.NIL != result) {
                        return Values.values(result, justifications);
                    }
                    thread.resetMultipleValues();
                    result = find_likelihood_of_truth_of_isa_facts_by_using_decay_distributions(fact, mt_time, justifyP);
                    justifications = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (temporal_projection.NIL != result) {
                        return Values.values(result, justifications);
                    }
                }
            }
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 4255L)
    public static SubLObject find_likelihood_of_truth_of_isa_facts_by_using_decay_distributions(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject result = find_likelihood_of_isa_facts_by_using_forward_distributions(fact, mt_time, justifyP);
        SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection.NIL != result) {
            return Values.values(result, justifications);
        }
        thread.resetMultipleValues();
        result = find_likelihood_of_isa_facts_by_using_backward_distributions(fact, mt_time, justifyP);
        justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection.NIL != result) {
            return Values.values(result, justifications);
        }
        thread.resetMultipleValues();
        result = find_likelihood_of_isa_facts_by_using_default_decay_distributions(fact, mt_time, justifyP);
        justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection.NIL != result) {
            return Values.values(result, justifications);
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 4974L)
    public static SubLObject find_likelihood_of_isa_facts_by_using_backward_distributions(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const9$conditionalProbabilityOfStateAfte, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED));
        if (temporal_projection.NIL != assertion) {
            final SubLObject assertion_time_pair = get_closest_assertion_after_time(fact, mt_time);
            if (temporal_projection.NIL != assertion_time_pair) {
                final SubLObject time = cycl_utilities.formula_arg0(assertion_time_pair);
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject prob = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                SubLObject justifications = (SubLObject)temporal_projection.NIL;
                final SubLObject duration_of_time_interval = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
                final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject justification_1 = cycl_utilities.formula_arg1(assertion_time_pair, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject time_elapsed = find_time_elapsed_between_time_points(time, mt_time);
                final SubLObject no_of_iterations = Numbers.multiply(cycl_utilities.formula_arg1(time_elapsed, (SubLObject)temporal_projection.UNPROVIDED), quantities.convert_to_units(unit_of_duration_of_time_interval, cycl_utilities.formula_arg0(time_elapsed), value_of_duration_of_time_interval, (SubLObject)temporal_projection.UNPROVIDED));
                final SubLObject computed_prob = Numbers.expt(prob, no_of_iterations);
                final SubLObject likelihood = (SubLObject)ConsesLow.list(temporal_projection.$const0$NumericLikelihoodFn, computed_prob);
                if (temporal_projection.NIL != justifyP) {
                    justifications = ConsesLow.append((SubLObject)ConsesLow.list(assertion), (SubLObject)ConsesLow.list(justification_1), plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection.$const10$timeElapsed, time, mt_time, time_elapsed), temporal_projection.$const11$BaseKB));
                }
                return Values.values(likelihood, justifications);
            }
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 6368L)
    public static SubLObject find_likelihood_of_isa_facts_by_using_forward_distributions(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const12$conditionalProbabilityOfStateAfte, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED));
        if (temporal_projection.NIL != assertion) {
            final SubLObject assertion_time_pair = get_closest_assertion_before_time(fact, mt_time);
            if (temporal_projection.NIL != assertion_time_pair) {
                final SubLObject time = cycl_utilities.formula_arg0(assertion_time_pair);
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject prob = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                SubLObject justifications = (SubLObject)temporal_projection.NIL;
                final SubLObject duration_of_time_interval = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
                final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject justification_1 = cycl_utilities.formula_arg1(assertion_time_pair, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject time_elapsed = find_time_elapsed_between_time_points(time, mt_time);
                final SubLObject no_of_iterations = Numbers.multiply(cycl_utilities.formula_arg1(time_elapsed, (SubLObject)temporal_projection.UNPROVIDED), quantities.convert_to_units(unit_of_duration_of_time_interval, cycl_utilities.formula_arg0(time_elapsed), value_of_duration_of_time_interval, (SubLObject)temporal_projection.UNPROVIDED));
                final SubLObject computed_prob = Numbers.expt(prob, no_of_iterations);
                final SubLObject likelihood = (SubLObject)ConsesLow.list(temporal_projection.$const0$NumericLikelihoodFn, computed_prob);
                if (temporal_projection.NIL != justifyP) {
                    justifications = ConsesLow.append((SubLObject)ConsesLow.list(assertion), (SubLObject)ConsesLow.list(justification_1), plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection.$const10$timeElapsed, time, mt_time, time_elapsed), temporal_projection.$const11$BaseKB));
                }
                return Values.values(likelihood, justifications);
            }
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 7761L)
    public static SubLObject find_likelihood_of_isa_facts_by_using_default_decay_distributions(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const13$defaultConditionalProbabilityOfSt, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED));
        final SubLObject assertion_time_pair = get_assertion_closest_to_given_time(fact, mt_time);
        if (temporal_projection.NIL != assertion_time_pair && temporal_projection.NIL != assertion) {
            final SubLObject time = cycl_utilities.formula_arg0(assertion_time_pair);
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject prob = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            SubLObject justifications = (SubLObject)temporal_projection.NIL;
            final SubLObject allowed_interval = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject unit_of_allowed_interval = cycl_utilities.formula_arg0(allowed_interval);
            final SubLObject allowed_lower_limit = cycl_utilities.formula_arg1(allowed_interval, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject allowed_upper_limit = cycl_utilities.formula_arg2(allowed_interval, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
            final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject justification_1 = cycl_utilities.formula_arg1(assertion_time_pair, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject time_elapsed = find_time_elapsed_between_time_points(time, mt_time);
            if (temporal_projection.NIL != quantities.cyc_less_than_quantities(time_elapsed, (SubLObject)ConsesLow.list(unit_of_allowed_interval, allowed_upper_limit)) && temporal_projection.NIL != arithmetic.cyc_less_than_or_equal_to((SubLObject)ConsesLow.list(unit_of_allowed_interval, allowed_lower_limit), time_elapsed)) {
                final SubLObject no_of_iterations = Numbers.multiply(cycl_utilities.formula_arg1(time_elapsed, (SubLObject)temporal_projection.UNPROVIDED), quantities.convert_to_units(unit_of_duration_of_time_interval, cycl_utilities.formula_arg0(time_elapsed), value_of_duration_of_time_interval, (SubLObject)temporal_projection.UNPROVIDED));
                final SubLObject computed_prob = Numbers.expt(prob, no_of_iterations);
                final SubLObject likelihood = (SubLObject)ConsesLow.list(temporal_projection.$const0$NumericLikelihoodFn, computed_prob);
                if (temporal_projection.NIL != justifyP) {
                    justifications = ConsesLow.append((SubLObject)ConsesLow.list(assertion), (SubLObject)ConsesLow.list(justification_1), plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection.$const10$timeElapsed, time, mt_time, time_elapsed), temporal_projection.$const11$BaseKB));
                }
                return Values.values(likelihood, justifications);
            }
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 9603L)
    public static SubLObject find_likelihood_by_using_conditional_probability_of_entering_state_when_age_in_interval(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject instance = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject justifications = (SubLObject)temporal_projection.NIL;
        SubLObject prob_of_not_entering = (SubLObject)temporal_projection.ONE_INTEGER;
        thread.resetMultipleValues();
        final SubLObject birth_date = lookup_starting_date_for_entity(instance);
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection.NIL != justifyP) {
            justifications = ConsesLow.append(justifications, justification_1);
        }
        if (temporal_projection.NIL != birth_date) {
            final SubLObject assertions = kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const14$conditionalProbabilityOfEnteringS, (SubLObject)temporal_projection.TWO_INTEGER, (SubLObject)temporal_projection.UNPROVIDED);
            if (temporal_projection.NIL != assertions) {
                final SubLObject age_at_mt_time = find_time_elapsed_between_time_points(mt_time, birth_date);
                if (temporal_projection.NIL != age_at_mt_time) {
                    SubLObject age_in_correct_units;
                    SubLObject age;
                    SubLObject relevant_assertion;
                    SubLObject gaf;
                    SubLObject prob;
                    SubLObject item_var;
                    for (age_in_correct_units = quantities.convert_to_units(temporal_projection.$const15$YearsDuration, cycl_utilities.formula_arg0(age_at_mt_time), cycl_utilities.formula_arg1(age_at_mt_time, (SubLObject)temporal_projection.UNPROVIDED), (SubLObject)temporal_projection.UNPROVIDED), age = (SubLObject)temporal_projection.NIL, age = (SubLObject)temporal_projection.ZERO_INTEGER; age.numL(age_in_correct_units); age = Numbers.add(age, (SubLObject)temporal_projection.ONE_INTEGER)) {
                        relevant_assertion = find_relevant_age_related_distribution_at_age(assertions, age, instance);
                        if (temporal_projection.NIL == relevant_assertion) {
                            return (SubLObject)temporal_projection.NIL;
                        }
                        if (temporal_projection.NIL != relevant_assertion) {
                            gaf = assertions_high.gaf_formula(relevant_assertion);
                            prob = cycl_utilities.formula_arg5(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                            prob_of_not_entering = Numbers.multiply(prob_of_not_entering, Numbers.subtract((SubLObject)temporal_projection.ONE_INTEGER, prob));
                            if (temporal_projection.NIL != justifyP) {
                                item_var = relevant_assertion;
                                if (temporal_projection.NIL == conses_high.member(item_var, justifications, Symbols.symbol_function((SubLObject)temporal_projection.EQUAL), Symbols.symbol_function((SubLObject)temporal_projection.IDENTITY))) {
                                    justifications = (SubLObject)ConsesLow.cons(item_var, justifications);
                                }
                            }
                        }
                    }
                    if (temporal_projection.NIL != justifyP) {
                        return Values.values((SubLObject)ConsesLow.list(temporal_projection.$const0$NumericLikelihoodFn, Numbers.subtract((SubLObject)temporal_projection.ONE_INTEGER, prob_of_not_entering)), justifications);
                    }
                    return Values.values((SubLObject)ConsesLow.list(temporal_projection.$const0$NumericLikelihoodFn, Numbers.subtract((SubLObject)temporal_projection.ONE_INTEGER, prob_of_not_entering)), (SubLObject)temporal_projection.NIL);
                }
            }
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 11101L)
    public static SubLObject find_likelihood_by_using_conditional_probability_of_leaving_state_when_age_in_interval(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject instance = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject justifications = (SubLObject)temporal_projection.NIL;
        SubLObject prob_of_not_leaving = (SubLObject)temporal_projection.ONE_INTEGER;
        thread.resetMultipleValues();
        final SubLObject birth_date = lookup_starting_date_for_entity(instance);
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection.NIL != justifyP) {
            justifications = ConsesLow.append(justifications, justification_1);
        }
        if (temporal_projection.NIL != birth_date) {
            final SubLObject assertions = kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const16$conditionalProbabilityOfLeavingSt, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED);
            if (temporal_projection.NIL != assertions) {
                final SubLObject closest_assertion_time_pair = get_closest_assertion_before_time(fact, mt_time);
                if (temporal_projection.NIL != closest_assertion_time_pair) {
                    final SubLObject time_of_most_recent_assertion = cycl_utilities.formula_arg0(closest_assertion_time_pair);
                    final SubLObject age_at_time_of_most_recent_assertion = find_time_elapsed_between_time_points(birth_date, time_of_most_recent_assertion);
                    if (temporal_projection.NIL != age_at_time_of_most_recent_assertion) {
                        final SubLObject age_at_time_of_most_recent_assertion_in_correct_units = quantities.convert_to_units(temporal_projection.$const15$YearsDuration, cycl_utilities.formula_arg0(age_at_time_of_most_recent_assertion), cycl_utilities.formula_arg1(age_at_time_of_most_recent_assertion, (SubLObject)temporal_projection.UNPROVIDED), (SubLObject)temporal_projection.UNPROVIDED);
                        final SubLObject age_at_mt_time = find_time_elapsed_between_time_points(birth_date, mt_time);
                        if (temporal_projection.NIL != age_at_mt_time) {
                            final SubLObject age_at_mt_time_in_correct_units = quantities.convert_to_units(temporal_projection.$const15$YearsDuration, cycl_utilities.formula_arg0(age_at_mt_time), cycl_utilities.formula_arg1(age_at_mt_time, (SubLObject)temporal_projection.UNPROVIDED), (SubLObject)temporal_projection.UNPROVIDED);
                            if (temporal_projection.NIL != justifyP) {
                                justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(cycl_utilities.formula_arg1(closest_assertion_time_pair, (SubLObject)temporal_projection.UNPROVIDED)));
                            }
                            SubLObject count;
                            SubLObject relevant_assertion;
                            SubLObject gaf;
                            SubLObject prob;
                            SubLObject item_var;
                            for (count = (SubLObject)temporal_projection.NIL, count = (SubLObject)temporal_projection.ZERO_INTEGER; count.numL(age_at_mt_time_in_correct_units); count = Numbers.add(count, (SubLObject)temporal_projection.ONE_INTEGER)) {
                                if (count.numGE(age_at_time_of_most_recent_assertion_in_correct_units) && count.numL(age_at_mt_time_in_correct_units)) {
                                    relevant_assertion = find_relevant_age_related_distribution_at_age_2(assertions, count);
                                    if (temporal_projection.NIL == relevant_assertion) {
                                        return (SubLObject)temporal_projection.NIL;
                                    }
                                    if (temporal_projection.NIL != relevant_assertion) {
                                        gaf = assertions_high.gaf_formula(relevant_assertion);
                                        prob = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                                        prob_of_not_leaving = Numbers.multiply(prob_of_not_leaving, Numbers.subtract((SubLObject)temporal_projection.ONE_INTEGER, prob));
                                        if (temporal_projection.NIL != justifyP) {
                                            item_var = relevant_assertion;
                                            if (temporal_projection.NIL == conses_high.member(item_var, justifications, Symbols.symbol_function((SubLObject)temporal_projection.EQUAL), Symbols.symbol_function((SubLObject)temporal_projection.IDENTITY))) {
                                                justifications = (SubLObject)ConsesLow.cons(item_var, justifications);
                                            }
                                        }
                                    }
                                }
                            }
                            if (temporal_projection.NIL != justifyP) {
                                return Values.values((SubLObject)ConsesLow.list(temporal_projection.$const0$NumericLikelihoodFn, prob_of_not_leaving), justifications);
                            }
                            return Values.values((SubLObject)ConsesLow.list(temporal_projection.$const0$NumericLikelihoodFn, prob_of_not_leaving), (SubLObject)temporal_projection.NIL);
                        }
                    }
                }
            }
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 13482L)
    public static SubLObject find_relevant_age_related_distribution_at_age(final SubLObject assertions, final SubLObject age, final SubLObject instance) {
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)temporal_projection.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject relevant_col = cycl_utilities.formula_arg1(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            if (temporal_projection.NIL != isa.isaP(instance, relevant_col, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
                final SubLObject age_interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject unit = cycl_utilities.formula_arg0(age_interval);
                final SubLObject lower = cycl_utilities.formula_arg1(age_interval, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject upper = cycl_utilities.formula_arg2(age_interval, (SubLObject)temporal_projection.UNPROVIDED);
                if (unit.eql(temporal_projection.$const15$YearsDuration) && lower.numLE(age) && age.numL(upper)) {
                    return assertion;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 14030L)
    public static SubLObject find_relevant_age_related_distribution_at_age_2(final SubLObject assertions, final SubLObject age) {
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)temporal_projection.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject age_interval = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject unit = cycl_utilities.formula_arg0(age_interval);
            final SubLObject lower = cycl_utilities.formula_arg1(age_interval, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject upper = cycl_utilities.formula_arg2(age_interval, (SubLObject)temporal_projection.UNPROVIDED);
            if (unit.eql(temporal_projection.$const15$YearsDuration) && lower.numLE(age) && age.numL(upper)) {
                return assertion;
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 14455L)
    public static SubLObject collect_time_intervals_for_negated_isa_sentence_by_conditional_probability_when_age(final SubLObject fact, final SubLObject lower_threshold, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject instance = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject result_justification_pairs = (SubLObject)temporal_projection.NIL;
        thread.resetMultipleValues();
        final SubLObject date = lookup_starting_date_for_entity(instance);
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection.NIL != date) {
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const14$conditionalProbabilityOfEnteringS, (SubLObject)temporal_projection.TWO_INTEGER, (SubLObject)temporal_projection.UNPROVIDED);
            SubLObject assertion = (SubLObject)temporal_projection.NIL;
            assertion = cdolist_list_var.first();
            while (temporal_projection.NIL != cdolist_list_var) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject relevant_col = cycl_utilities.formula_arg1(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                if (temporal_projection.NIL != isa.isaP(instance, relevant_col, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
                    SubLObject entry = (SubLObject)temporal_projection.NIL;
                    final SubLObject age_interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                    final SubLObject age_unit = cycl_utilities.formula_arg0(age_interval);
                    final SubLObject age_lower_bound = (SubLObject)ConsesLow.list(age_unit, cycl_utilities.formula_arg1(age_interval, (SubLObject)temporal_projection.UNPROVIDED));
                    final SubLObject age_upper_bound = (SubLObject)ConsesLow.list(age_unit, cycl_utilities.formula_arg2(age_interval, (SubLObject)temporal_projection.UNPROVIDED));
                    final SubLObject prob = cycl_utilities.formula_arg5(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                    if (prob.numL(lower_threshold)) {
                        final SubLObject lower_bound = date_utilities.date_after(date, age_lower_bound);
                        final SubLObject upper_bound = date_utilities.date_after(date, age_upper_bound);
                        if (temporal_projection.NIL != justifyP) {
                            entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, lower_bound, upper_bound), ConsesLow.append((SubLObject)ConsesLow.list(assertion), justification_1), Numbers.subtract((SubLObject)temporal_projection.ONE_INTEGER, prob));
                        }
                        else {
                            entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, lower_bound, upper_bound), (SubLObject)temporal_projection.NIL, Numbers.subtract((SubLObject)temporal_projection.ONE_INTEGER, prob));
                        }
                        result_justification_pairs = (SubLObject)ConsesLow.cons(entry, result_justification_pairs);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        return result_justification_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 15814L)
    public static SubLObject collect_time_intervals_for_negated_isa_sentence_by_conditional_probability_when_age_single(final SubLObject fact, final SubLObject lower_threshold, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject instance = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject result_justification_pairs = (SubLObject)temporal_projection.NIL;
        thread.resetMultipleValues();
        final SubLObject date = lookup_starting_date_for_entity(instance);
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection.NIL != date) {
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const14$conditionalProbabilityOfEnteringS, (SubLObject)temporal_projection.TWO_INTEGER, (SubLObject)temporal_projection.UNPROVIDED);
            SubLObject assertion = (SubLObject)temporal_projection.NIL;
            assertion = cdolist_list_var.first();
            while (temporal_projection.NIL != cdolist_list_var) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject relevant_col = cycl_utilities.formula_arg1(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                if (temporal_projection.NIL != isa.isaP(instance, relevant_col, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
                    SubLObject entry = (SubLObject)temporal_projection.NIL;
                    final SubLObject age_interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                    final SubLObject age_unit = cycl_utilities.formula_arg0(age_interval);
                    final SubLObject age_lower_bound = (SubLObject)ConsesLow.list(age_unit, cycl_utilities.formula_arg1(age_interval, (SubLObject)temporal_projection.UNPROVIDED));
                    final SubLObject age_upper_bound = (SubLObject)ConsesLow.list(age_unit, cycl_utilities.formula_arg2(age_interval, (SubLObject)temporal_projection.UNPROVIDED));
                    final SubLObject prob = cycl_utilities.formula_arg5(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                    if (prob.numL(lower_threshold)) {
                        final SubLObject lower_bound = date_utilities.date_after(date, age_lower_bound);
                        final SubLObject upper_bound = date_utilities.date_after(date, age_upper_bound);
                        entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, lower_bound, upper_bound), ConsesLow.append((SubLObject)ConsesLow.list(assertion), justification_1), Numbers.subtract((SubLObject)temporal_projection.ONE_INTEGER, prob));
                        final SubLObject interval = cycl_utilities.formula_arg0(entry);
                        if (temporal_projection.NIL != sbhl_time_query_processing.true_temporal_relation_literalP(temporal_projection.$const18$temporallyIntersects, interval, time, (SubLObject)temporal_projection.$kw19$POS, temporal_projection.$const11$BaseKB)) {
                            result_justification_pairs = (SubLObject)ConsesLow.cons(entry, result_justification_pairs);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        return result_justification_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 17198L)
    public static SubLObject collect_time_intervals_for_non_negated_isa_sentence_by_conditional_probability_when_age(final SubLObject fact, final SubLObject upper_threshold, final SubLObject justifyP) {
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject entering_state_assertions = kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const14$conditionalProbabilityOfEnteringS, (SubLObject)temporal_projection.TWO_INTEGER, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject leaving_state_assertions = kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const16$conditionalProbabilityOfLeavingSt, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject result = collect_time_intervals_from_absorbing_states(fact, entering_state_assertions, leaving_state_assertions, upper_threshold, justifyP);
        if (temporal_projection.NIL != result) {
            return result;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 17780L)
    public static SubLObject collect_time_intervals_for_non_negated_isa_sentence_by_conditional_probability_when_age_single(final SubLObject fact, final SubLObject upper_threshold, final SubLObject time) {
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject entering_state_assertions = kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const14$conditionalProbabilityOfEnteringS, (SubLObject)temporal_projection.TWO_INTEGER, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject leaving_state_assertions = kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const16$conditionalProbabilityOfLeavingSt, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject result = collect_time_intervals_from_absorbing_states_single(fact, entering_state_assertions, leaving_state_assertions, upper_threshold, time);
        if (temporal_projection.NIL != result) {
            return result;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 18369L)
    public static SubLObject find_likelihood_for_absorbing_states(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject absorbing_assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const16$conditionalProbabilityOfLeavingSt, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED));
        if (temporal_projection.NIL != absorbing_assertion) {
            final SubLObject gaf = assertions_high.gaf_formula(absorbing_assertion);
            final SubLObject prob = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject leaving_duration = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject upper_limit = (SubLObject)ConsesLow.list(cycl_utilities.formula_arg0(leaving_duration), cycl_utilities.formula_arg2(leaving_duration, (SubLObject)temporal_projection.UNPROVIDED));
            if (prob.numE((SubLObject)temporal_projection.ZERO_INTEGER)) {
                final SubLObject entering_state_assertions = kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const14$conditionalProbabilityOfEnteringS, (SubLObject)temporal_projection.TWO_INTEGER, (SubLObject)temporal_projection.UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject ending_date = find_known_or_expected_ending_date(entity, (SubLObject)temporal_projection.$float1$0_8, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject justifications = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject starting_date = lookup_starting_date_for_entity(entity);
                final SubLObject just_2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection.NIL != starting_date && temporal_projection.NIL != ending_date && temporal_projection.NIL != date_utilities.later_than(ending_date, mt_time)) {
                    final SubLObject age_at_mt_time = date_utilities.time_elapsed(mt_time, starting_date, (SubLObject)temporal_projection.UNPROVIDED);
                    SubLObject cdolist_list_var = entering_state_assertions;
                    SubLObject entering_state_assertion = (SubLObject)temporal_projection.NIL;
                    entering_state_assertion = cdolist_list_var.first();
                    while (temporal_projection.NIL != cdolist_list_var) {
                        final SubLObject entering_gaf = assertions_high.gaf_formula(entering_state_assertion);
                        final SubLObject col_prereq = cycl_utilities.formula_arg1(entering_gaf, (SubLObject)temporal_projection.UNPROVIDED);
                        final SubLObject entering_duration = cycl_utilities.formula_arg3(entering_gaf, (SubLObject)temporal_projection.UNPROVIDED);
                        final SubLObject entering_prob = cycl_utilities.formula_arg5(entering_gaf, (SubLObject)temporal_projection.UNPROVIDED);
                        if (entering_prob.numE((SubLObject)temporal_projection.ONE_INTEGER) && temporal_projection.NIL != isa.isaP(entity, col_prereq, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED) && temporal_projection.NIL != quantities.cyc_less_than_or_equal_to_quantities(age_at_mt_time, upper_limit) && temporal_projection.NIL != quantities.cyc_less_than_or_equal_to_quantities(entering_duration, age_at_mt_time)) {
                            if (temporal_projection.NIL != justifyP) {
                                return Values.values(temporal_projection.$numeric_likelihood_fn_one$.getDynamicValue(thread), ConsesLow.append(just_2, justifications, (SubLObject)ConsesLow.list(entering_state_assertion, absorbing_assertion)));
                            }
                            return Values.values(temporal_projection.$numeric_likelihood_fn_one$.getDynamicValue(thread), (SubLObject)temporal_projection.NIL);
                        }
                        else {
                            cdolist_list_var = cdolist_list_var.rest();
                            entering_state_assertion = cdolist_list_var.first();
                        }
                    }
                }
            }
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 20142L)
    public static SubLObject collect_time_intervals_from_absorbing_states(final SubLObject fact, final SubLObject entering_state_assertions, final SubLObject leaving_state_assertions, final SubLObject upper_threshold, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = entering_state_assertions;
        SubLObject assertion_1 = (SubLObject)temporal_projection.NIL;
        assertion_1 = cdolist_list_var.first();
        while (temporal_projection.NIL != cdolist_list_var) {
            SubLObject assertion_2 = (SubLObject)temporal_projection.NIL;
            assertion_2 = leaving_state_assertions.first();
            if (temporal_projection.NIL != leaving_state_assertions) {
                final SubLObject gaf_1 = assertions_high.gaf_formula(assertion_1);
                final SubLObject gaf_2 = assertions_high.gaf_formula(assertion_2);
                final SubLObject relevant_col = cycl_utilities.formula_arg1(gaf_1, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject prob_1 = cycl_utilities.formula_arg5(gaf_1, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject prob_2 = cycl_utilities.formula_arg4(gaf_2, (SubLObject)temporal_projection.UNPROVIDED);
                SubLObject result_entry = (SubLObject)temporal_projection.NIL;
                if (temporal_projection.NIL != isa.isaP(entity, relevant_col, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED) && prob_1.numE((SubLObject)temporal_projection.ONE_INTEGER) && prob_2.numE((SubLObject)temporal_projection.ZERO_INTEGER)) {
                    final SubLObject interval_1 = cycl_utilities.formula_arg3(gaf_1, (SubLObject)temporal_projection.UNPROVIDED);
                    final SubLObject interval_2 = cycl_utilities.formula_arg2(gaf_2, (SubLObject)temporal_projection.UNPROVIDED);
                    final SubLObject unit_2 = cycl_utilities.formula_arg0(interval_2);
                    final SubLObject upper_limit_of_interval_2 = cycl_utilities.formula_arg2(interval_2, (SubLObject)temporal_projection.UNPROVIDED);
                    final SubLObject new_upper_limit = (SubLObject)ConsesLow.list(unit_2, upper_limit_of_interval_2);
                    if (temporal_projection.NIL != quantities.cyc_quantity_subsumes(interval_2, interval_1)) {
                        thread.resetMultipleValues();
                        final SubLObject starting_date = find_known_or_expected_starting_date(entity);
                        final SubLObject justification_1 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (temporal_projection.NIL != starting_date) {
                            final SubLObject starting_point = date_utilities.date_after(starting_date, interval_1);
                            final SubLObject ending_point = date_utilities.date_after(starting_date, new_upper_limit);
                            if (temporal_projection.NIL != justifyP) {
                                result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, starting_point, ending_point), ConsesLow.append(justification_1, (SubLObject)ConsesLow.list(assertion_1, assertion_2)), upper_threshold);
                            }
                            else {
                                result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, starting_point, ending_point), (SubLObject)temporal_projection.NIL, upper_threshold);
                            }
                        }
                    }
                }
                return (SubLObject)ConsesLow.list(verify_starting_and_ending_dates_for_isa_result_entry(result_entry, fact, justifyP, upper_threshold));
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion_1 = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 21730L)
    public static SubLObject collect_time_intervals_from_absorbing_states_single(final SubLObject fact, final SubLObject entering_state_assertions, final SubLObject leaving_state_assertions, final SubLObject upper_threshold, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = entering_state_assertions;
        SubLObject assertion_1 = (SubLObject)temporal_projection.NIL;
        assertion_1 = cdolist_list_var.first();
        while (temporal_projection.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = leaving_state_assertions;
            SubLObject assertion_2 = (SubLObject)temporal_projection.NIL;
            assertion_2 = cdolist_list_var_$2.first();
            while (temporal_projection.NIL != cdolist_list_var_$2) {
                final SubLObject gaf_1 = assertions_high.gaf_formula(assertion_1);
                final SubLObject gaf_2 = assertions_high.gaf_formula(assertion_2);
                final SubLObject relevant_col = cycl_utilities.formula_arg1(gaf_1, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject prob_1 = cycl_utilities.formula_arg5(gaf_1, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject prob_2 = cycl_utilities.formula_arg4(gaf_2, (SubLObject)temporal_projection.UNPROVIDED);
                SubLObject result_entry = (SubLObject)temporal_projection.NIL;
                if (temporal_projection.NIL != isa.isaP(entity, relevant_col, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED) && prob_1.numE((SubLObject)temporal_projection.ONE_INTEGER) && prob_2.numE((SubLObject)temporal_projection.ZERO_INTEGER)) {
                    final SubLObject interval_1 = cycl_utilities.formula_arg3(gaf_1, (SubLObject)temporal_projection.UNPROVIDED);
                    final SubLObject interval_2 = cycl_utilities.formula_arg2(gaf_2, (SubLObject)temporal_projection.UNPROVIDED);
                    final SubLObject unit_2 = cycl_utilities.formula_arg0(interval_2);
                    final SubLObject upper_limit_of_interval_2 = cycl_utilities.formula_arg2(interval_2, (SubLObject)temporal_projection.UNPROVIDED);
                    final SubLObject new_upper_limit = (SubLObject)ConsesLow.list(unit_2, upper_limit_of_interval_2);
                    if (temporal_projection.NIL != quantities.cyc_quantity_subsumes(interval_2, interval_1)) {
                        thread.resetMultipleValues();
                        final SubLObject starting_date = find_known_or_expected_starting_date(entity);
                        final SubLObject justification_1 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (temporal_projection.NIL != starting_date) {
                            final SubLObject starting_point = date_utilities.date_after(starting_date, interval_1);
                            final SubLObject ending_point = date_utilities.date_after(starting_date, new_upper_limit);
                            result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, starting_point, ending_point), ConsesLow.append(justification_1, (SubLObject)ConsesLow.list(assertion_1, assertion_2)), upper_threshold);
                            final SubLObject interval = cycl_utilities.formula_arg0(result_entry);
                            if (temporal_projection.NIL != sbhl_time_query_processing.true_temporal_relation_literalP(temporal_projection.$const18$temporallyIntersects, interval, time, (SubLObject)temporal_projection.$kw19$POS, temporal_projection.$const11$BaseKB)) {
                                return (SubLObject)ConsesLow.list(verify_starting_and_ending_dates_for_isa_result_entry(result_entry, fact, (SubLObject)temporal_projection.T, upper_threshold));
                            }
                        }
                    }
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                assertion_2 = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion_1 = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 23338L)
    public static SubLObject find_likelihood_of_truth_of_non_isa_sentence(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (temporal_projection.NIL != isa.isaP(cycl_utilities.formula_arg0(fact), temporal_projection.$const20$TemporallyQualifiableRelation, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
            thread.resetMultipleValues();
            SubLObject result = verify_starting_and_ending_times(fact, mt_time);
            SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection.NIL != result) {
                if (temporal_projection.NIL != justifyP) {
                    return Values.values(result, justifications);
                }
                return result;
            }
            else {
                thread.resetMultipleValues();
                result = temporal_projection_cols.compute_likelihoods_from_event_calculus(fact, mt_time, justifyP);
                justifications = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection.NIL != result) {
                    if (temporal_projection.NIL != justifyP) {
                        return Values.values(result, justifications);
                    }
                    return result;
                }
                else {
                    thread.resetMultipleValues();
                    result = verify_temporal_relation_between_arguments(fact, justifyP);
                    justifications = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (temporal_projection.NIL != result) {
                        if (temporal_projection.NIL != justifyP) {
                            return Values.values(temporal_projection.$numeric_likelihood_fn_zero$.getDynamicValue(thread), justifications);
                        }
                        return temporal_projection.$numeric_likelihood_fn_zero$.getDynamicValue(thread);
                    }
                    else {
                        thread.resetMultipleValues();
                        result = find_likelihood_of_truth_of_non_isa_sentence_by_using_decay_distributions(fact, mt_time, justifyP);
                        justifications = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (temporal_projection.NIL != result) {
                            if (temporal_projection.NIL != justifyP) {
                                return Values.values(result, justifications);
                            }
                            return Values.values(result, (SubLObject)temporal_projection.NIL);
                        }
                    }
                }
            }
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 24466L)
    public static SubLObject time_intervals_for_sentence(final SubLObject sentence, SubLObject mt, SubLObject justifyP, SubLObject upper_threshold, SubLObject lower_threshold) {
        if (mt == temporal_projection.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (justifyP == temporal_projection.UNPROVIDED) {
            justifyP = (SubLObject)temporal_projection.NIL;
        }
        if (upper_threshold == temporal_projection.UNPROVIDED) {
            upper_threshold = temporal_projection.$temporal_projection_upper_threshold$.getDynamicValue();
        }
        if (lower_threshold == temporal_projection.UNPROVIDED) {
            lower_threshold = temporal_projection.$temporal_projection_lower_threshold$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (temporal_projection.NIL != temporal_projection.$temporal_projection_mode$.getDynamicValue(thread)) {
            init_temporal_projection_global_variables();
            final SubLObject new_mt = temporal_projection_utilities.mt_with_anytime_psc_time_parameter(mt);
            SubLObject results = (SubLObject)temporal_projection.NIL;
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(new_mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (cycl_utilities.formula_arg0(sentence).eql(temporal_projection.$const21$not)) {
                    results = find_time_intervals_for_negated_sentence(cycl_utilities.formula_arg1(sentence, (SubLObject)temporal_projection.UNPROVIDED), justifyP, upper_threshold, lower_threshold);
                }
                else {
                    results = find_time_intervals_for_non_negated_sentence(sentence, justifyP, upper_threshold, lower_threshold);
                }
                init_temporal_projection_global_variables();
                return results;
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 25329L)
    public static SubLObject temporally_project(SubLObject source, final SubLObject assertion, SubLObject upper_threshold, SubLObject lower_threshold) {
        if (upper_threshold == temporal_projection.UNPROVIDED) {
            upper_threshold = temporal_projection.$temporal_projection_upper_threshold$.getDynamicValue();
        }
        if (lower_threshold == temporal_projection.UNPROVIDED) {
            lower_threshold = temporal_projection.$temporal_projection_lower_threshold$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (temporal_projection.NIL != hl_transcript_tracing.within_hl_evalP()) {
            return (SubLObject)temporal_projection.NIL;
        }
        if (temporal_projection.NIL != temporal_projection.$temporal_projection_mode$.getDynamicValue(thread)) {
            if (temporal_projection.NIL != temporal_projection_utilities.temporal_projection_quick_failP(assertion)) {
                return (SubLObject)temporal_projection.NIL;
            }
            if (source.eql((SubLObject)temporal_projection.$kw22$ASSERTED_TRUE_DEF) || source.eql((SubLObject)temporal_projection.$kw23$ASSERTED_TRUE_MON) || source.eql((SubLObject)temporal_projection.$kw24$ASSERTED_FALSE_DEF) || source.eql((SubLObject)temporal_projection.$kw25$ASSERTED_FALSE_MON) || temporal_projection.NIL != temporal_projection_utilities.deduction_not_produced_by_temporal_projectionP(source)) {
                init_temporal_projection_global_variables();
                final SubLObject new_mt = temporal_projection_utilities.mt_with_anytime_psc_time_parameter(assertions_high.assertion_mt(assertion));
                final SubLObject time = get_time_for_assertion_1(assertion);
                final SubLObject sentence = assertions_high.gaf_el_formula(assertion);
                final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
                SubLObject results = (SubLObject)temporal_projection.NIL;
                if (predicate.eql(temporal_projection.$const26$startingPointOfIntervalForSentenc) || predicate.eql(temporal_projection.$const27$endingPointOfIntervalForSentence)) {
                    return find_time_intervals_from_starting_and_ending_points_of_sentence(assertion, upper_threshold, lower_threshold);
                }
                if (predicate.eql(temporal_projection.$const28$statePersistsForDurationFromDate)) {
                    return find_time_intervals_from_state_persists_assertions(assertion);
                }
                if (temporal_projection.NIL != time) {
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(new_mt);
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (cycl_utilities.formula_arg0(sentence).eql(temporal_projection.$const21$not)) {
                            results = find_time_intervals_for_negated_sentence_single(cycl_utilities.formula_arg1(sentence, (SubLObject)temporal_projection.UNPROVIDED), time, upper_threshold, lower_threshold);
                        }
                        else {
                            results = find_time_intervals_for_non_negated_sentence_single(sentence, time, upper_threshold, lower_threshold);
                        }
                        init_temporal_projection_global_variables();
                        temporal_projection_utilities.store_temporal_projection_results(sentence, results, assertion, new_mt);
                    }
                    finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return (SubLObject)temporal_projection.NIL;
            }
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 27184L)
    public static SubLObject find_time_intervals_from_state_persists_assertions(final SubLObject assertion) {
        final SubLObject new_mt = temporal_projection_utilities.mt_with_anytime_psc_time_parameter(assertions_high.assertion_mt(assertion));
        final SubLObject sentence = assertions_high.gaf_el_formula(assertion);
        final SubLObject sentence_in_assertion = cycl_utilities.formula_arg1(sentence, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject duration_for_sentence = cycl_utilities.formula_arg2(sentence, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject starting_date = temporal_projection_utilities.find_first_point_of_time(cycl_utilities.formula_arg3(sentence, (SubLObject)temporal_projection.UNPROVIDED));
        SubLObject results = (SubLObject)temporal_projection.NIL;
        if (temporal_projection.NIL != starting_date) {
            final SubLObject ending_point = date_utilities.date_after(starting_date, duration_for_sentence);
            SubLObject entry = (SubLObject)temporal_projection.NIL;
            entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, starting_date, ending_point), (SubLObject)ConsesLow.list(assertion), (SubLObject)temporal_projection.ONE_INTEGER);
            results = (SubLObject)ConsesLow.cons(entry, results);
            temporal_projection_utilities.store_temporal_projection_results(sentence_in_assertion, results, assertion, new_mt);
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 27916L)
    public static SubLObject find_time_intervals_from_starting_and_ending_points_of_sentence(final SubLObject assertion, final SubLObject upper, final SubLObject lower) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_mt = temporal_projection_utilities.mt_with_anytime_psc_time_parameter(assertions_high.assertion_mt(assertion));
        final SubLObject sentence = assertions_high.gaf_el_formula(assertion);
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        final SubLObject sentence_in_assertion = cycl_utilities.formula_arg1(sentence, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject results = (SubLObject)temporal_projection.NIL;
        if (predicate.eql(temporal_projection.$const26$startingPointOfIntervalForSentenc)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(new_mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                results = temporal_projection_cols.create_forward_intervals_from_events(assertion, upper, lower);
                temporal_projection_utilities.store_temporal_projection_results(sentence_in_assertion, results, assertion, new_mt);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        if (predicate.eql(temporal_projection.$const27$endingPointOfIntervalForSentence)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(new_mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                results = temporal_projection_cols.create_backward_intervals_from_events(assertion, upper, lower);
                temporal_projection_utilities.store_temporal_projection_results(sentence_in_assertion, results, assertion, new_mt);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 28806L)
    public static SubLObject find_time_intervals_for_non_negated_sentence(final SubLObject sentence, final SubLObject justifyP, final SubLObject upper, final SubLObject lower) {
        if (cycl_utilities.formula_arg0(sentence).eql(temporal_projection.$const5$isa)) {
            return find_time_intervals_for_non_negated_isa_sentence(sentence, justifyP, upper, lower);
        }
        return find_time_intervals_for_non_negated_non_isa_sentence(sentence, justifyP, upper, lower);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 29166L)
    public static SubLObject find_time_intervals_for_non_negated_sentence_single(final SubLObject sentence, final SubLObject time, final SubLObject upper, final SubLObject lower) {
        if (cycl_utilities.formula_arg0(sentence).eql(temporal_projection.$const5$isa)) {
            return find_time_intervals_for_non_negated_isa_sentence_single(sentence, time, upper, lower);
        }
        return find_time_intervals_for_non_negated_non_isa_sentence_single(sentence, time, upper, lower);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 29504L)
    public static SubLObject find_time_intervals_for_negated_sentence(final SubLObject sentence, final SubLObject justifyP, final SubLObject upper_threshold, final SubLObject lower_threshold) {
        if (cycl_utilities.formula_arg0(sentence).eql(temporal_projection.$const5$isa)) {
            return find_time_intervals_for_negated_isa_sentence(sentence, justifyP, upper_threshold, lower_threshold);
        }
        return find_time_intervals_for_negated_non_isa_sentence(sentence, justifyP, upper_threshold, lower_threshold);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 29890L)
    public static SubLObject find_time_intervals_for_negated_sentence_single(final SubLObject sentence, final SubLObject time, final SubLObject upper_threshold, final SubLObject lower_threshold) {
        if (cycl_utilities.formula_arg0(sentence).eql(temporal_projection.$const5$isa)) {
            return find_time_intervals_for_negated_isa_sentence_single(sentence, time, upper_threshold, lower_threshold);
        }
        return find_time_intervals_for_negated_non_isa_sentence_single(sentence, time, upper_threshold, lower_threshold);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 30273L)
    public static SubLObject find_time_intervals_for_negated_isa_sentence(final SubLObject sentence, final SubLObject justifyP, final SubLObject upper, final SubLObject lower) {
        final SubLObject col = cycl_utilities.formula_arg2(sentence, (SubLObject)temporal_projection.UNPROVIDED);
        if (temporal_projection.NIL != isa.isaP(col, temporal_projection.$const7$TimeDependentCollection, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
            update_temporal_projection_global_variables(sentence);
            SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
            SubLObject result = collect_intervals_from_starting_and_ending_dates(sentence, justifyP);
            if (temporal_projection.NIL != result) {
                interval_justification_pairs = ConsesLow.append(interval_justification_pairs, result);
            }
            result = collect_intervals_from_disjoint_assertions(sentence, justifyP);
            if (temporal_projection.NIL != result) {
                interval_justification_pairs = ConsesLow.append(interval_justification_pairs, result);
            }
            result = collect_intervals_from_temporal_constraints_between_collections_for_negated_isa_sentence(sentence, justifyP);
            if (temporal_projection.NIL != result) {
                interval_justification_pairs = ConsesLow.append(result, interval_justification_pairs);
            }
            result = collect_time_intervals_for_negated_isa_sentence_by_conditional_probability_when_age(sentence, lower, justifyP);
            if (temporal_projection.NIL != result) {
                interval_justification_pairs = ConsesLow.append(result, interval_justification_pairs);
            }
            return interval_justification_pairs;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 31471L)
    public static SubLObject find_time_intervals_for_negated_isa_sentence_single(final SubLObject sentence, final SubLObject time, final SubLObject upper, final SubLObject lower) {
        final SubLObject col = cycl_utilities.formula_arg2(sentence, (SubLObject)temporal_projection.UNPROVIDED);
        if (temporal_projection.NIL != isa.isaP(col, temporal_projection.$const7$TimeDependentCollection, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
            update_temporal_projection_global_variables(sentence);
            SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
            SubLObject result = collect_intervals_from_starting_and_ending_dates_single(sentence, time);
            if (temporal_projection.NIL != result) {
                interval_justification_pairs = ConsesLow.append(interval_justification_pairs, result);
            }
            result = collect_intervals_from_disjoint_assertions_single(sentence, time);
            if (temporal_projection.NIL != result) {
                interval_justification_pairs = ConsesLow.append(interval_justification_pairs, result);
            }
            result = collect_intervals_from_temporal_constraints_between_collections_for_negated_isa_sentence_single(sentence, time);
            if (temporal_projection.NIL != result) {
                interval_justification_pairs = ConsesLow.append(result, interval_justification_pairs);
            }
            result = collect_time_intervals_for_negated_isa_sentence_by_conditional_probability_when_age_single(sentence, lower, time);
            if (temporal_projection.NIL != result) {
                interval_justification_pairs = ConsesLow.append(result, interval_justification_pairs);
            }
            return interval_justification_pairs;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 32683L)
    public static SubLObject find_time_intervals_for_non_negated_non_isa_sentence(final SubLObject sentence, final SubLObject justifyP, final SubLObject upper, final SubLObject lower) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        if (temporal_projection.NIL == isa.isaP(predicate, temporal_projection.$const20$TemporallyQualifiableRelation, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
            return (SubLObject)temporal_projection.NIL;
        }
        update_temporal_projection_global_variables(sentence);
        thread.resetMultipleValues();
        final SubLObject inconsistentP = verify_temporal_relation_between_arguments(sentence, justifyP);
        final SubLObject justifications_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection.NIL == inconsistentP) {
            SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
            SubLObject result = collect_intervals_from_decay_distributions_for_predicate(sentence, upper, justifyP);
            if (temporal_projection.NIL != result) {
                interval_justification_pairs = ConsesLow.append(interval_justification_pairs, result);
            }
            result = collect_intervals_from_initial_and_terminal_in_args_facts(sentence, upper, justifyP);
            if (temporal_projection.NIL != result) {
                interval_justification_pairs = ConsesLow.append(interval_justification_pairs, result);
            }
            return interval_justification_pairs;
        }
        if (temporal_projection.NIL != justifyP) {
            return Values.values((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)temporal_projection.NIL, justifications_1)));
        }
        return Values.values((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)temporal_projection.NIL, (SubLObject)temporal_projection.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 33751L)
    public static SubLObject find_time_intervals_for_non_negated_non_isa_sentence_single(final SubLObject sentence, final SubLObject time, final SubLObject upper, final SubLObject lower) {
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        if (temporal_projection.NIL != isa.isaP(predicate, temporal_projection.$const20$TemporallyQualifiableRelation, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
            update_temporal_projection_global_variables(sentence);
            SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
            SubLObject result = collect_intervals_from_decay_distributions_for_predicate_single(sentence, upper, time);
            if (temporal_projection.NIL != result) {
                interval_justification_pairs = ConsesLow.append(interval_justification_pairs, result);
            }
            result = collect_intervals_from_initial_and_terminal_in_args_facts_single(sentence, upper, time);
            if (temporal_projection.NIL != result) {
                interval_justification_pairs = ConsesLow.append(interval_justification_pairs, result);
            }
            return interval_justification_pairs;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 34552L)
    public static SubLObject collect_intervals_from_decay_distributions_for_predicate(final SubLObject sentence, final SubLObject upper, final SubLObject justifyP) {
        SubLObject result = temporal_projection_cols.collect_intervals_from_events(sentence, upper, justifyP);
        if (temporal_projection.NIL != result) {
            return result;
        }
        result = collect_intervals_from_specific_distributions_for_predicate(sentence, upper, justifyP);
        if (temporal_projection.NIL != result) {
            return result;
        }
        result = collect_intervals_from_default_conditional_probability_for_sentence_in_interval(sentence, justifyP, upper);
        if (temporal_projection.NIL != result) {
            return result;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 35075L)
    public static SubLObject collect_intervals_from_decay_distributions_for_predicate_single(final SubLObject sentence, final SubLObject upper, final SubLObject time) {
        SubLObject result = collect_intervals_from_specific_distributions_for_predicate_single(sentence, upper, time);
        if (temporal_projection.NIL != result) {
            return result;
        }
        result = collect_intervals_from_default_conditional_probability_for_sentence_in_interval_single(sentence, time, upper);
        if (temporal_projection.NIL != result) {
            return result;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 35493L)
    public static SubLObject collect_intervals_from_specific_distributions_for_predicate(final SubLObject sentence, final SubLObject upper_threshold, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
        if (temporal_projection.NIL != predicate_has_type_level_distributionsP(predicate)) {
            final SubLObject pred_var = temporal_projection.$const30$relevantDistributionForSentence;
            if (temporal_projection.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)temporal_projection.NIL;
                final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)temporal_projection.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)temporal_projection.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)temporal_projection.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)temporal_projection.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((temporal_projection.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : temporal_projection.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)temporal_projection.NIL;
                    final SubLObject token_var = (SubLObject)temporal_projection.NIL;
                    while (temporal_projection.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (temporal_projection.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)temporal_projection.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)temporal_projection.$kw31$GAF, (SubLObject)temporal_projection.NIL, (SubLObject)temporal_projection.NIL);
                                SubLObject done_var_$3 = (SubLObject)temporal_projection.NIL;
                                final SubLObject token_var_$4 = (SubLObject)temporal_projection.NIL;
                                while (temporal_projection.NIL == done_var_$3) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                    final SubLObject valid_$5 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$4.eql(assertion));
                                    if (temporal_projection.NIL != valid_$5) {
                                        final SubLObject gaf = assertions_high.gaf_formula(assertion);
                                        final SubLObject sent = cycl_utilities.formula_arg1(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                                        if (sent.equal(sentence)) {
                                            final SubLObject assertions_and_time_for_fact = get_assertion_time_pairs_for_fact(sentence);
                                            SubLObject result_entry = (SubLObject)temporal_projection.NIL;
                                            final SubLObject distribution_gaf = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                                            final SubLObject prob = cycl_utilities.formula_arg6(distribution_gaf, (SubLObject)temporal_projection.UNPROVIDED);
                                            final SubLObject allowed_interval = cycl_utilities.formula_arg2(distribution_gaf, (SubLObject)temporal_projection.UNPROVIDED);
                                            final SubLObject unit_of_allowed_interval = cycl_utilities.formula_arg0(allowed_interval);
                                            final SubLObject allowed_lower_limit = cycl_utilities.formula_arg1(allowed_interval, (SubLObject)temporal_projection.UNPROVIDED);
                                            final SubLObject allowed_upper_limit = cycl_utilities.formula_arg2(allowed_interval, (SubLObject)temporal_projection.UNPROVIDED);
                                            final SubLObject duration_of_time_interval = cycl_utilities.formula_arg5(distribution_gaf, (SubLObject)temporal_projection.UNPROVIDED);
                                            final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
                                            final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, (SubLObject)temporal_projection.UNPROVIDED);
                                            final SubLObject no_of_iterations = Numbers.multiply(value_of_duration_of_time_interval, Numbers.divide(Numbers.log(prob, (SubLObject)temporal_projection.UNPROVIDED), Numbers.log(upper_threshold, (SubLObject)temporal_projection.UNPROVIDED)));
                                            final SubLObject derived_lower_limit = (SubLObject)ConsesLow.list(unit_of_duration_of_time_interval, no_of_iterations);
                                            final SubLObject derived_upper_limit = (SubLObject)ConsesLow.list(unit_of_duration_of_time_interval, no_of_iterations);
                                            final SubLObject new_allowed_lower_limit = (SubLObject)ConsesLow.list(unit_of_allowed_interval, allowed_lower_limit);
                                            final SubLObject new_allowed_upper_limit = (SubLObject)ConsesLow.list(unit_of_allowed_interval, allowed_upper_limit);
                                            SubLObject lower_limit = (SubLObject)temporal_projection.NIL;
                                            SubLObject upper_limit = (SubLObject)temporal_projection.NIL;
                                            SubLObject cdolist_list_var = assertions_and_time_for_fact;
                                            SubLObject entry = (SubLObject)temporal_projection.NIL;
                                            entry = cdolist_list_var.first();
                                            while (temporal_projection.NIL != cdolist_list_var) {
                                                final SubLObject time_of_assertion = cycl_utilities.formula_arg0(entry);
                                                SubLObject justifications = (SubLObject)temporal_projection.NIL;
                                                final SubLObject assertion_1 = cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection.UNPROVIDED);
                                                final SubLObject initial_point = temporal_projection_utilities.find_first_point_of_time(time_of_assertion);
                                                final SubLObject final_point = temporal_projection_utilities.find_last_point_of_time(time_of_assertion);
                                                if (allowed_interval.eql(temporal_projection.$const32$Forever_Quantity)) {
                                                    lower_limit = derived_lower_limit;
                                                }
                                                else if (temporal_projection.NIL != quantities.cyc_less_than_quantities(new_allowed_lower_limit, derived_lower_limit)) {
                                                    lower_limit = derived_lower_limit;
                                                }
                                                else {
                                                    lower_limit = new_allowed_lower_limit;
                                                }
                                                if (allowed_interval.eql(temporal_projection.$const32$Forever_Quantity)) {
                                                    upper_limit = derived_upper_limit;
                                                }
                                                else if (temporal_projection.NIL != quantities.cyc_less_than_quantities(derived_upper_limit, new_allowed_upper_limit)) {
                                                    upper_limit = derived_upper_limit;
                                                }
                                                else {
                                                    upper_limit = new_allowed_upper_limit;
                                                }
                                                if (temporal_projection.NIL != initial_point && temporal_projection.NIL != final_point) {
                                                    if (temporal_projection.NIL != justifyP) {
                                                        justifications = ConsesLow.append((SubLObject)ConsesLow.list(assertion), (SubLObject)ConsesLow.list(assertion_1));
                                                        result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, date_utilities.date_before(initial_point, lower_limit), date_utilities.date_after(final_point, upper_limit)), justifications, upper_threshold);
                                                    }
                                                    else {
                                                        result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, date_utilities.date_before(initial_point, lower_limit), date_utilities.date_after(final_point, upper_limit)), (SubLObject)temporal_projection.NIL, upper_threshold);
                                                    }
                                                    interval_justification_pairs = (SubLObject)ConsesLow.cons(verify_starting_and_ending_dates_for_result_entry(result_entry, sentence, justifyP, upper_threshold), interval_justification_pairs);
                                                }
                                                if (temporal_projection.NIL != initial_point && temporal_projection.NIL == final_point) {
                                                    if (temporal_projection.NIL != justifyP) {
                                                        justifications = ConsesLow.append((SubLObject)ConsesLow.list(assertion), (SubLObject)ConsesLow.list(assertion_1));
                                                        result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, date_utilities.date_before(initial_point, lower_limit)), justifications, upper_threshold);
                                                    }
                                                    else {
                                                        result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, date_utilities.date_before(initial_point, lower_limit)), (SubLObject)temporal_projection.NIL, upper_threshold);
                                                    }
                                                    interval_justification_pairs = (SubLObject)ConsesLow.cons(verify_starting_and_ending_dates_for_result_entry(result_entry, sentence, justifyP, upper_threshold), interval_justification_pairs);
                                                }
                                                if (temporal_projection.NIL != final_point && temporal_projection.NIL == initial_point) {
                                                    if (temporal_projection.NIL != justifyP) {
                                                        justifications = ConsesLow.append((SubLObject)ConsesLow.list(assertion), (SubLObject)ConsesLow.list(assertion_1));
                                                        result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const34$IntervalEndedByFn, date_utilities.date_after(final_point, upper_limit)), justifications, upper_threshold);
                                                    }
                                                    else {
                                                        result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const34$IntervalEndedByFn, date_utilities.date_after(final_point, upper_limit)), (SubLObject)temporal_projection.NIL, upper_threshold);
                                                    }
                                                    interval_justification_pairs = (SubLObject)ConsesLow.cons(verify_starting_and_ending_dates_for_result_entry(result_entry, sentence, justifyP, upper_threshold), interval_justification_pairs);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                entry = cdolist_list_var.first();
                                            }
                                        }
                                    }
                                    done_var_$3 = (SubLObject)SubLObjectFactory.makeBoolean(temporal_projection.NIL == valid_$5);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)temporal_projection.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (temporal_projection.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(temporal_projection.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return interval_justification_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 39748L)
    public static SubLObject collect_intervals_from_specific_distributions_for_predicate_single(final SubLObject sentence, final SubLObject upper_threshold, final SubLObject time_of_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
        if (temporal_projection.NIL != predicate_has_type_level_distributionsP(predicate)) {
            final SubLObject pred_var = temporal_projection.$const30$relevantDistributionForSentence;
            if (temporal_projection.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)temporal_projection.NIL;
                final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)temporal_projection.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)temporal_projection.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)temporal_projection.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)temporal_projection.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((temporal_projection.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : temporal_projection.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)temporal_projection.NIL;
                    final SubLObject token_var = (SubLObject)temporal_projection.NIL;
                    while (temporal_projection.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (temporal_projection.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)temporal_projection.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)temporal_projection.$kw31$GAF, (SubLObject)temporal_projection.NIL, (SubLObject)temporal_projection.NIL);
                                SubLObject done_var_$7 = (SubLObject)temporal_projection.NIL;
                                final SubLObject token_var_$8 = (SubLObject)temporal_projection.NIL;
                                while (temporal_projection.NIL == done_var_$7) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$8);
                                    final SubLObject valid_$9 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$8.eql(assertion));
                                    if (temporal_projection.NIL != valid_$9) {
                                        final SubLObject gaf = assertions_high.gaf_formula(assertion);
                                        final SubLObject sent = cycl_utilities.formula_arg1(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                                        if (sent.equal(sentence)) {
                                            SubLObject result_entry = (SubLObject)temporal_projection.NIL;
                                            final SubLObject distribution_gaf = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                                            final SubLObject prob = cycl_utilities.formula_arg6(distribution_gaf, (SubLObject)temporal_projection.UNPROVIDED);
                                            final SubLObject allowed_interval = cycl_utilities.formula_arg2(distribution_gaf, (SubLObject)temporal_projection.UNPROVIDED);
                                            final SubLObject unit_of_allowed_interval = cycl_utilities.formula_arg0(allowed_interval);
                                            final SubLObject allowed_lower_limit = cycl_utilities.formula_arg1(allowed_interval, (SubLObject)temporal_projection.UNPROVIDED);
                                            final SubLObject allowed_upper_limit = cycl_utilities.formula_arg2(allowed_interval, (SubLObject)temporal_projection.UNPROVIDED);
                                            final SubLObject duration_of_time_interval = cycl_utilities.formula_arg5(distribution_gaf, (SubLObject)temporal_projection.UNPROVIDED);
                                            final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
                                            final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, (SubLObject)temporal_projection.UNPROVIDED);
                                            final SubLObject no_of_iterations = Numbers.multiply(value_of_duration_of_time_interval, Numbers.divide(Numbers.log(upper_threshold, (SubLObject)temporal_projection.UNPROVIDED), Numbers.log(prob, (SubLObject)temporal_projection.UNPROVIDED)));
                                            final SubLObject derived_lower_limit = (SubLObject)ConsesLow.list(unit_of_duration_of_time_interval, no_of_iterations);
                                            final SubLObject derived_upper_limit = (SubLObject)ConsesLow.list(unit_of_duration_of_time_interval, no_of_iterations);
                                            final SubLObject new_allowed_lower_limit = (SubLObject)ConsesLow.list(unit_of_allowed_interval, allowed_lower_limit);
                                            final SubLObject new_allowed_upper_limit = (SubLObject)ConsesLow.list(unit_of_allowed_interval, allowed_upper_limit);
                                            SubLObject lower_limit = (SubLObject)temporal_projection.NIL;
                                            SubLObject upper_limit = (SubLObject)temporal_projection.NIL;
                                            SubLObject justifications = (SubLObject)temporal_projection.NIL;
                                            final SubLObject initial_point = temporal_projection_utilities.find_first_point_of_time(time_of_assertion);
                                            final SubLObject final_point = temporal_projection_utilities.find_last_point_of_time(time_of_assertion);
                                            if (allowed_interval.eql(temporal_projection.$const32$Forever_Quantity)) {
                                                lower_limit = derived_lower_limit;
                                            }
                                            else if (temporal_projection.NIL != quantities.cyc_less_than_quantities(new_allowed_lower_limit, derived_lower_limit)) {
                                                lower_limit = derived_lower_limit;
                                            }
                                            else {
                                                lower_limit = new_allowed_lower_limit;
                                            }
                                            if (allowed_interval.eql(temporal_projection.$const32$Forever_Quantity)) {
                                                upper_limit = derived_upper_limit;
                                            }
                                            else if (temporal_projection.NIL != quantities.cyc_less_than_quantities(derived_upper_limit, new_allowed_upper_limit)) {
                                                upper_limit = derived_upper_limit;
                                            }
                                            else {
                                                upper_limit = new_allowed_upper_limit;
                                            }
                                            if (temporal_projection.NIL != initial_point && temporal_projection.NIL != final_point) {
                                                justifications = (SubLObject)ConsesLow.list(assertion);
                                                result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, date_utilities.date_before(initial_point, lower_limit), date_utilities.date_after(final_point, upper_limit)), justifications, upper_threshold);
                                                interval_justification_pairs = (SubLObject)ConsesLow.cons(verify_starting_and_ending_dates_for_result_entry(result_entry, sentence, (SubLObject)temporal_projection.T, upper_threshold), interval_justification_pairs);
                                            }
                                            if (temporal_projection.NIL != initial_point && temporal_projection.NIL == final_point) {
                                                justifications = (SubLObject)ConsesLow.list(assertion);
                                                result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, date_utilities.date_before(initial_point, lower_limit)), justifications, upper_threshold);
                                                interval_justification_pairs = (SubLObject)ConsesLow.cons(verify_starting_and_ending_dates_for_result_entry(result_entry, sentence, (SubLObject)temporal_projection.T, upper_threshold), interval_justification_pairs);
                                            }
                                            if (temporal_projection.NIL != final_point && temporal_projection.NIL == initial_point) {
                                                justifications = (SubLObject)ConsesLow.list(assertion);
                                                result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const34$IntervalEndedByFn, date_utilities.date_after(final_point, upper_limit)), justifications, upper_threshold);
                                                interval_justification_pairs = (SubLObject)ConsesLow.cons(verify_starting_and_ending_dates_for_result_entry(result_entry, sentence, (SubLObject)temporal_projection.T, upper_threshold), interval_justification_pairs);
                                            }
                                        }
                                    }
                                    done_var_$7 = (SubLObject)SubLObjectFactory.makeBoolean(temporal_projection.NIL == valid_$9);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)temporal_projection.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (temporal_projection.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(temporal_projection.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return interval_justification_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 43194L)
    public static SubLObject predicate_has_type_level_distributionsP(final SubLObject predicate) {
        if (temporal_projection.NIL != kb_mapping_utilities.pred_value_gafs(predicate, temporal_projection.$const35$conditionalProbabilityForSentence, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED)) {
            return (SubLObject)temporal_projection.T;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 43380L)
    public static SubLObject find_time_intervals_for_negated_non_isa_sentence(final SubLObject sentence, final SubLObject justifyP, final SubLObject upper, final SubLObject lower) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        if (temporal_projection.NIL == isa.isaP(predicate, temporal_projection.$const20$TemporallyQualifiableRelation, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
            return (SubLObject)temporal_projection.NIL;
        }
        update_temporal_projection_global_variables(sentence);
        thread.resetMultipleValues();
        final SubLObject inconsistentP = verify_temporal_relation_between_arguments(sentence, justifyP);
        final SubLObject justifications_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection.NIL == inconsistentP) {
            SubLObject result = collect_intervals_from_starting_and_ending_dates(sentence, justifyP);
            if (temporal_projection.NIL != result) {
                interval_justification_pairs = ConsesLow.append(interval_justification_pairs, result);
            }
            result = collect_intervals_from_temporal_relation_between_arguments_assertions_for_negated_non_isa_sentence(sentence, justifyP);
            if (temporal_projection.NIL != result) {
                interval_justification_pairs = ConsesLow.append(interval_justification_pairs, result);
            }
            result = temporal_projection_cols.collect_intervals_from_events_for_negated_sentence(sentence, lower, justifyP);
            if (temporal_projection.NIL != result) {
                interval_justification_pairs = ConsesLow.append(interval_justification_pairs, result);
            }
            return interval_justification_pairs;
        }
        if (temporal_projection.NIL != justifyP) {
            return Values.values((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const36$Always_TimeInterval, justifications_2)));
        }
        return Values.values((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const36$Always_TimeInterval, (SubLObject)temporal_projection.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 44703L)
    public static SubLObject find_time_intervals_for_negated_non_isa_sentence_single(final SubLObject sentence, final SubLObject time, final SubLObject upper, final SubLObject lower) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        if (temporal_projection.NIL == isa.isaP(predicate, temporal_projection.$const20$TemporallyQualifiableRelation, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
            return (SubLObject)temporal_projection.NIL;
        }
        update_temporal_projection_global_variables(sentence);
        thread.resetMultipleValues();
        final SubLObject inconsistentP = verify_temporal_relation_between_arguments(sentence, (SubLObject)temporal_projection.T);
        final SubLObject justifications_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection.NIL != inconsistentP) {
            return Values.values((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const36$Always_TimeInterval, justifications_2)));
        }
        SubLObject result = collect_intervals_from_starting_and_ending_dates_single(sentence, time);
        if (temporal_projection.NIL != result) {
            interval_justification_pairs = ConsesLow.append(interval_justification_pairs, result);
        }
        result = collect_intervals_from_temporal_relation_between_arguments_assertions_for_negated_non_isa_sentence_single(sentence, time);
        if (temporal_projection.NIL != result) {
            interval_justification_pairs = ConsesLow.append(interval_justification_pairs, result);
        }
        return interval_justification_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 45753L)
    public static SubLObject find_time_intervals_for_non_negated_isa_sentence(final SubLObject sentence, final SubLObject justifyP, final SubLObject upper, final SubLObject lower) {
        SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
        final SubLObject col = cycl_utilities.formula_arg2(sentence, (SubLObject)temporal_projection.UNPROVIDED);
        if (temporal_projection.NIL != isa.isaP(col, temporal_projection.$const7$TimeDependentCollection, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
            update_temporal_projection_global_variables(sentence);
            SubLObject result = collect_intervals_from_genls_assertions(sentence, justifyP);
            if (temporal_projection.NIL != result) {
                interval_justification_pairs = ConsesLow.append(result, interval_justification_pairs);
            }
            result = collect_time_intervals_for_non_negated_isa_sentence_by_conditional_probability_when_age(sentence, upper, justifyP);
            if (temporal_projection.NIL != result) {
                interval_justification_pairs = ConsesLow.append(result, interval_justification_pairs);
            }
            result = collect_intervals_from_decay_distributions_for_collections(sentence, upper, justifyP);
            if (temporal_projection.NIL != result) {
                interval_justification_pairs = ConsesLow.append(result, interval_justification_pairs);
            }
            return interval_justification_pairs;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 46738L)
    public static SubLObject find_time_intervals_for_non_negated_isa_sentence_single(final SubLObject sentence, final SubLObject time, final SubLObject upper, final SubLObject lower) {
        SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
        final SubLObject col = cycl_utilities.formula_arg2(sentence, (SubLObject)temporal_projection.UNPROVIDED);
        if (temporal_projection.NIL != isa.isaP(col, temporal_projection.$const7$TimeDependentCollection, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
            update_temporal_projection_global_variables(sentence);
            SubLObject result = collect_time_intervals_for_non_negated_isa_sentence_by_conditional_probability_when_age_single(sentence, upper, time);
            if (temporal_projection.NIL != result) {
                interval_justification_pairs = ConsesLow.append(result, interval_justification_pairs);
            }
            result = collect_intervals_from_decay_distributions_for_collections_single(sentence, upper, time);
            if (temporal_projection.NIL != result) {
                interval_justification_pairs = ConsesLow.append(result, interval_justification_pairs);
            }
            return interval_justification_pairs;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 47548L)
    public static SubLObject collect_intervals_from_decay_distributions_for_collections(final SubLObject sentence, final SubLObject upper_threshold, final SubLObject justifyP) {
        SubLObject result = collect_intervals_from_forward_and_backward_distributions_for_collections(sentence, upper_threshold, justifyP);
        if (temporal_projection.NIL != result) {
            return result;
        }
        result = collect_intervals_from_default_conditional_probability_statements(sentence, upper_threshold, justifyP);
        if (temporal_projection.NIL != result) {
            return result;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 47990L)
    public static SubLObject collect_intervals_from_decay_distributions_for_collections_single(final SubLObject sentence, final SubLObject upper_threshold, final SubLObject time) {
        SubLObject result = collect_intervals_from_forward_and_backward_distributions_for_collections_single(sentence, upper_threshold, time);
        if (temporal_projection.NIL != result) {
            return result;
        }
        result = collect_intervals_from_default_conditional_probability_statements_single(sentence, upper_threshold, time);
        if (temporal_projection.NIL != result) {
            return result;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 48440L)
    public static SubLObject collect_intervals_from_forward_and_backward_distributions_for_collections(final SubLObject sentence, final SubLObject upper, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = cycl_utilities.formula_arg2(sentence, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject entity = cycl_utilities.formula_arg1(sentence, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject results_list = (SubLObject)temporal_projection.NIL;
        SubLObject interval = (SubLObject)temporal_projection.NIL;
        SubLObject justifications = (SubLObject)temporal_projection.NIL;
        final SubLObject forward_assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const12$conditionalProbabilityOfStateAfte, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED));
        final SubLObject backward_assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const9$conditionalProbabilityOfStateAfte, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED));
        if (temporal_projection.NIL != forward_assertion && temporal_projection.NIL != backward_assertion) {
            final SubLObject gaf_1 = assertions_high.gaf_formula(forward_assertion);
            final SubLObject gaf_2 = assertions_high.gaf_formula(backward_assertion);
            final SubLObject prob_1 = cycl_utilities.formula_arg3(gaf_1, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject prob_2 = cycl_utilities.formula_arg3(gaf_2, (SubLObject)temporal_projection.UNPROVIDED);
            if (prob_1.numE((SubLObject)temporal_projection.ONE_INTEGER) && prob_2.numE((SubLObject)temporal_projection.ONE_INTEGER)) {
                SubLObject cdolist_list_var;
                final SubLObject interval_justification_pairs = cdolist_list_var = collect_intervals_from_genls_assertions(sentence, justifyP);
                SubLObject pair = (SubLObject)temporal_projection.NIL;
                pair = cdolist_list_var.first();
                while (temporal_projection.NIL != cdolist_list_var) {
                    final SubLObject just = cycl_utilities.formula_arg1(pair, (SubLObject)temporal_projection.UNPROVIDED);
                    thread.resetMultipleValues();
                    final SubLObject starting_date = find_known_or_expected_starting_date(entity);
                    final SubLObject justification_1 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (temporal_projection.NIL == starting_date) {
                        return (SubLObject)temporal_projection.NIL;
                    }
                    thread.resetMultipleValues();
                    final SubLObject ending_date = find_known_or_expected_ending_date(entity, upper, justifyP);
                    final SubLObject justification_2 = thread.secondMultipleValue();
                    final SubLObject likelihood = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (temporal_projection.NIL != ending_date) {
                        interval = (SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, starting_date, ending_date);
                        if (temporal_projection.NIL != justifyP) {
                            justifications = ConsesLow.append(just, justification_1, justification_2, (SubLObject)ConsesLow.list(forward_assertion, backward_assertion));
                            results_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(interval, justifications, likelihood), results_list);
                        }
                        else {
                            results_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(interval, (SubLObject)temporal_projection.NIL, likelihood), results_list);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    pair = cdolist_list_var.first();
                }
                return results_list;
            }
        }
        if (temporal_projection.NIL != forward_assertion) {
            final SubLObject results_list_$11 = use_forward_distribution_for_collections(sentence, forward_assertion, upper, justifyP);
            if (temporal_projection.NIL != results_list_$11) {
                return results_list_$11;
            }
        }
        if (temporal_projection.NIL != backward_assertion) {
            final SubLObject results_list_$12 = use_backward_distribution_for_collections(sentence, backward_assertion, upper, justifyP);
            if (temporal_projection.NIL != results_list_$12) {
                return results_list_$12;
            }
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 50508L)
    public static SubLObject collect_intervals_from_forward_and_backward_distributions_for_collections_single(final SubLObject sentence, final SubLObject upper, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = cycl_utilities.formula_arg2(sentence, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject entity = cycl_utilities.formula_arg1(sentence, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject results_list = (SubLObject)temporal_projection.NIL;
        SubLObject interval = (SubLObject)temporal_projection.NIL;
        SubLObject justifications = (SubLObject)temporal_projection.NIL;
        final SubLObject forward_assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const12$conditionalProbabilityOfStateAfte, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED));
        final SubLObject backward_assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const9$conditionalProbabilityOfStateAfte, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED));
        if (temporal_projection.NIL != forward_assertion && temporal_projection.NIL != backward_assertion) {
            final SubLObject gaf_1 = assertions_high.gaf_formula(forward_assertion);
            final SubLObject gaf_2 = assertions_high.gaf_formula(backward_assertion);
            final SubLObject prob_1 = cycl_utilities.formula_arg3(gaf_1, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject prob_2 = cycl_utilities.formula_arg3(gaf_2, (SubLObject)temporal_projection.UNPROVIDED);
            if (prob_1.numE((SubLObject)temporal_projection.ONE_INTEGER) && prob_2.numE((SubLObject)temporal_projection.ONE_INTEGER)) {
                thread.resetMultipleValues();
                final SubLObject starting_date = find_known_or_expected_starting_date(entity);
                final SubLObject justification_1 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection.NIL == starting_date) {
                    return (SubLObject)temporal_projection.NIL;
                }
                thread.resetMultipleValues();
                final SubLObject ending_date = find_known_or_expected_ending_date(entity, upper, (SubLObject)temporal_projection.T);
                final SubLObject justification_2 = thread.secondMultipleValue();
                final SubLObject likelihood = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection.NIL != ending_date) {
                    interval = (SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, starting_date, ending_date);
                    justifications = ConsesLow.append(justification_1, justification_2, (SubLObject)ConsesLow.list(forward_assertion, backward_assertion));
                    results_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(interval, justifications, likelihood), results_list);
                    return results_list;
                }
            }
        }
        if (temporal_projection.NIL != forward_assertion) {
            final SubLObject results_list_$13 = use_forward_distribution_for_collections_single(sentence, forward_assertion, upper, time);
            if (temporal_projection.NIL != results_list_$13) {
                return results_list_$13;
            }
        }
        if (temporal_projection.NIL != backward_assertion) {
            final SubLObject results_list_$14 = use_backward_distribution_for_collections_single(sentence, backward_assertion, upper, time);
            if (temporal_projection.NIL != results_list_$14) {
                return results_list_$14;
            }
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 52264L)
    public static SubLObject use_backward_distribution_for_collections(final SubLObject sentence, final SubLObject backward_assertion, final SubLObject upper_threshold, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gaf = assertions_high.gaf_formula(backward_assertion);
        final SubLObject prob = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        if (prob.numE((SubLObject)temporal_projection.ONE_INTEGER)) {
            final SubLObject interval_justification_pairs = collect_intervals_from_genls_assertions(sentence, justifyP);
            SubLObject results_list = (SubLObject)temporal_projection.NIL;
            final SubLObject entity = cycl_utilities.formula_arg1(sentence, (SubLObject)temporal_projection.UNPROVIDED);
            SubLObject interval = (SubLObject)temporal_projection.NIL;
            SubLObject justifications = (SubLObject)temporal_projection.NIL;
            SubLObject cdolist_list_var = interval_justification_pairs;
            SubLObject pair = (SubLObject)temporal_projection.NIL;
            pair = cdolist_list_var.first();
            while (temporal_projection.NIL != cdolist_list_var) {
                final SubLObject time = cycl_utilities.formula_arg0(pair);
                final SubLObject just = cycl_utilities.formula_arg1(pair, (SubLObject)temporal_projection.UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject starting_date = find_known_or_expected_starting_date(entity);
                final SubLObject justification_2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection.NIL != starting_date) {
                    interval = (SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, starting_date, time);
                    if (temporal_projection.NIL != justifyP) {
                        justifications = ConsesLow.append(just, justification_2, (SubLObject)ConsesLow.list(backward_assertion));
                        results_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(interval, justifications, (SubLObject)temporal_projection.ONE_INTEGER), results_list);
                    }
                    else {
                        results_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(interval, (SubLObject)temporal_projection.NIL, (SubLObject)temporal_projection.ONE_INTEGER), results_list);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            }
            return results_list;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 53301L)
    public static SubLObject use_backward_distribution_for_collections_single(final SubLObject sentence, final SubLObject backward_assertion, final SubLObject upper_threshold, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gaf = assertions_high.gaf_formula(backward_assertion);
        final SubLObject prob = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        if (prob.numE((SubLObject)temporal_projection.ONE_INTEGER)) {
            SubLObject results_list = (SubLObject)temporal_projection.NIL;
            final SubLObject entity = cycl_utilities.formula_arg1(sentence, (SubLObject)temporal_projection.UNPROVIDED);
            SubLObject interval = (SubLObject)temporal_projection.NIL;
            SubLObject justifications = (SubLObject)temporal_projection.NIL;
            thread.resetMultipleValues();
            final SubLObject starting_date = find_known_or_expected_starting_date(entity);
            final SubLObject justification_2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection.NIL != starting_date) {
                interval = (SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, starting_date, time);
                justifications = ConsesLow.append(justification_2, (SubLObject)ConsesLow.list(backward_assertion));
                results_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(interval, justifications, (SubLObject)temporal_projection.ONE_INTEGER), results_list);
            }
            return results_list;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 54033L)
    public static SubLObject use_forward_distribution_for_collections(final SubLObject sentence, final SubLObject forward_assertion, final SubLObject upper_threshold, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gaf = assertions_high.gaf_formula(forward_assertion);
        final SubLObject prob = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject col = cycl_utilities.formula_arg2(sentence, (SubLObject)temporal_projection.UNPROVIDED);
        if (prob.numE((SubLObject)temporal_projection.ONE_INTEGER)) {
            final SubLObject interval_justification_pairs = collect_intervals_from_genls_assertions(sentence, justifyP);
            SubLObject results_list = (SubLObject)temporal_projection.NIL;
            final SubLObject entity = cycl_utilities.formula_arg1(sentence, (SubLObject)temporal_projection.UNPROVIDED);
            SubLObject interval = (SubLObject)temporal_projection.NIL;
            SubLObject justifications = (SubLObject)temporal_projection.NIL;
            SubLObject cdolist_list_var = interval_justification_pairs;
            SubLObject pair = (SubLObject)temporal_projection.NIL;
            pair = cdolist_list_var.first();
            while (temporal_projection.NIL != cdolist_list_var) {
                final SubLObject time = cycl_utilities.formula_arg0(pair);
                final SubLObject just = cycl_utilities.formula_arg1(pair, (SubLObject)temporal_projection.UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject ending_date = find_known_or_expected_ending_date(entity, upper_threshold, justifyP);
                final SubLObject justification_2 = thread.secondMultipleValue();
                final SubLObject likelihood = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection.NIL != ending_date) {
                    if (temporal_projection.NIL != genls.genlP(col, temporal_projection.$const8$BiologicalLivingObject, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
                        interval = (SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, time, ending_date);
                    }
                    else {
                        interval = (SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, time);
                    }
                    if (temporal_projection.NIL != justifyP) {
                        justifications = ConsesLow.append(just, justification_2, (SubLObject)ConsesLow.list(forward_assertion));
                        results_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(interval, justifications, likelihood), results_list);
                    }
                    else {
                        results_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(interval, (SubLObject)temporal_projection.NIL, likelihood), results_list);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            }
            return results_list;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 55227L)
    public static SubLObject use_forward_distribution_for_collections_single(final SubLObject sentence, final SubLObject forward_assertion, final SubLObject upper_threshold, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gaf = assertions_high.gaf_formula(forward_assertion);
        final SubLObject prob = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject col = cycl_utilities.formula_arg2(sentence, (SubLObject)temporal_projection.UNPROVIDED);
        if (prob.numE((SubLObject)temporal_projection.ONE_INTEGER)) {
            SubLObject results_list = (SubLObject)temporal_projection.NIL;
            final SubLObject entity = cycl_utilities.formula_arg1(sentence, (SubLObject)temporal_projection.UNPROVIDED);
            SubLObject interval = (SubLObject)temporal_projection.NIL;
            SubLObject justifications = (SubLObject)temporal_projection.NIL;
            thread.resetMultipleValues();
            final SubLObject ending_date = find_known_or_expected_ending_date(entity, upper_threshold, (SubLObject)temporal_projection.T);
            final SubLObject justification_2 = thread.secondMultipleValue();
            final SubLObject likelihood = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection.NIL != ending_date) {
                if (temporal_projection.NIL != genls.genlP(col, temporal_projection.$const8$BiologicalLivingObject, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
                    interval = (SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, time, ending_date);
                }
                else {
                    interval = (SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, time);
                }
                justifications = ConsesLow.append(justification_2, (SubLObject)ConsesLow.list(forward_assertion));
                results_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(interval, justifications, likelihood), results_list);
                return results_list;
            }
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 56091L)
    public static SubLObject collect_intervals_from_default_conditional_probability_statements(final SubLObject sentence, final SubLObject upper, final SubLObject justifyP) {
        final SubLObject col = cycl_utilities.formula_arg2(sentence, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const13$defaultConditionalProbabilityOfSt, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED));
        if (temporal_projection.NIL != assertion) {
            final SubLObject prob = cycl_utilities.formula_arg4(assertion, (SubLObject)temporal_projection.UNPROVIDED);
            if (prob.numL((SubLObject)temporal_projection.ONE_INTEGER)) {
                return collect_intervals_from_default_conditional_probability_statements_with_decaying_persistence(sentence, assertion, upper, justifyP);
            }
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 56589L)
    public static SubLObject collect_intervals_from_default_conditional_probability_statements_single(final SubLObject sentence, final SubLObject upper, final SubLObject time) {
        final SubLObject col = cycl_utilities.formula_arg2(sentence, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const13$defaultConditionalProbabilityOfSt, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED));
        if (temporal_projection.NIL != assertion) {
            final SubLObject prob = cycl_utilities.formula_arg4(assertion, (SubLObject)temporal_projection.UNPROVIDED);
            if (prob.numL((SubLObject)temporal_projection.ONE_INTEGER)) {
                return collect_intervals_from_default_conditional_probability_statements_with_decaying_persistence_single(sentence, assertion, upper, time);
            }
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 57087L)
    public static SubLObject collect_intervals_from_default_conditional_probability_statements_with_decaying_persistence(final SubLObject sentence, final SubLObject assertion, final SubLObject upper, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion_time_pairs_for_fact = get_assertion_time_pairs_for_fact(sentence);
        SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
        SubLObject result_entry = (SubLObject)temporal_projection.NIL;
        if (temporal_projection.NIL != assertion_time_pairs_for_fact || temporal_projection.NIL != temporal_projection.$intervals_from_genls_assertions$.getDynamicValue(thread)) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject prob = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject allowed_interval = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject unit_of_allowed_interval = cycl_utilities.formula_arg0(allowed_interval);
            final SubLObject allowed_lower_limit = cycl_utilities.formula_arg1(allowed_interval, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject allowed_upper_limit = cycl_utilities.formula_arg2(allowed_interval, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
            final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject no_of_iterations = Numbers.multiply(value_of_duration_of_time_interval, Numbers.divide(Numbers.log(upper, (SubLObject)temporal_projection.UNPROVIDED), Numbers.log(prob, (SubLObject)temporal_projection.UNPROVIDED)));
            final SubLObject derived_lower_limit = (SubLObject)ConsesLow.list(unit_of_duration_of_time_interval, no_of_iterations);
            final SubLObject derived_upper_limit = (SubLObject)ConsesLow.list(unit_of_duration_of_time_interval, no_of_iterations);
            final SubLObject new_allowed_lower_limit = (SubLObject)ConsesLow.list(unit_of_allowed_interval, allowed_lower_limit);
            final SubLObject new_allowed_upper_limit = (SubLObject)ConsesLow.list(unit_of_allowed_interval, allowed_upper_limit);
            SubLObject lower_limit = (SubLObject)temporal_projection.NIL;
            SubLObject upper_limit = (SubLObject)temporal_projection.NIL;
            SubLObject cdolist_list_var = ConsesLow.append(assertion_time_pairs_for_fact, temporal_projection.$intervals_from_genls_assertions$.getDynamicValue(thread));
            SubLObject entry = (SubLObject)temporal_projection.NIL;
            entry = cdolist_list_var.first();
            while (temporal_projection.NIL != cdolist_list_var) {
                final SubLObject time_of_assertion = cycl_utilities.formula_arg0(entry);
                SubLObject justifications = (SubLObject)temporal_projection.NIL;
                final SubLObject just_1 = temporal_projection_utilities.format_justification_entry(cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection.UNPROVIDED));
                final SubLObject initial_point = temporal_projection_utilities.find_first_point_of_time(time_of_assertion);
                final SubLObject final_point = temporal_projection_utilities.find_last_point_of_time(time_of_assertion);
                if (allowed_interval.eql(temporal_projection.$const32$Forever_Quantity)) {
                    lower_limit = derived_lower_limit;
                }
                else if (temporal_projection.NIL != quantities.cyc_less_than_quantities(new_allowed_lower_limit, derived_lower_limit)) {
                    lower_limit = derived_lower_limit;
                }
                else {
                    lower_limit = new_allowed_lower_limit;
                }
                if (allowed_interval.eql(temporal_projection.$const32$Forever_Quantity)) {
                    upper_limit = derived_upper_limit;
                }
                else if (temporal_projection.NIL != quantities.cyc_less_than_quantities(derived_upper_limit, new_allowed_upper_limit)) {
                    upper_limit = derived_upper_limit;
                }
                else {
                    upper_limit = new_allowed_upper_limit;
                }
                if (temporal_projection.NIL != initial_point && temporal_projection.NIL != final_point) {
                    if (temporal_projection.NIL != justifyP) {
                        justifications = ConsesLow.append((SubLObject)ConsesLow.list(assertion), just_1);
                        result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, date_utilities.date_before(initial_point, lower_limit), date_utilities.date_after(final_point, upper_limit)), justifications, upper);
                    }
                    else {
                        result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, date_utilities.date_before(initial_point, lower_limit), date_utilities.date_after(final_point, upper_limit)), (SubLObject)temporal_projection.NIL, upper);
                    }
                    interval_justification_pairs = (SubLObject)ConsesLow.cons(verify_starting_and_ending_dates_for_isa_result_entry(result_entry, sentence, justifyP, upper), interval_justification_pairs);
                }
                if (temporal_projection.NIL != initial_point && temporal_projection.NIL == final_point) {
                    if (temporal_projection.NIL != justifyP) {
                        justifications = ConsesLow.append((SubLObject)ConsesLow.list(assertion), just_1);
                        result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, date_utilities.date_before(initial_point, lower_limit)), justifications, upper);
                    }
                    else {
                        result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, date_utilities.date_before(initial_point, lower_limit)), (SubLObject)temporal_projection.NIL, upper);
                    }
                    interval_justification_pairs = (SubLObject)ConsesLow.cons(verify_starting_and_ending_dates_for_isa_result_entry(result_entry, sentence, justifyP, upper), interval_justification_pairs);
                }
                if (temporal_projection.NIL != final_point && temporal_projection.NIL == initial_point) {
                    if (temporal_projection.NIL != justifyP) {
                        justifications = ConsesLow.append((SubLObject)ConsesLow.list(assertion), just_1);
                        result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const34$IntervalEndedByFn, date_utilities.date_after(final_point, upper_limit)), justifications, upper);
                    }
                    else {
                        result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const34$IntervalEndedByFn, date_utilities.date_after(final_point, upper_limit)), (SubLObject)temporal_projection.NIL, upper);
                    }
                    interval_justification_pairs = (SubLObject)ConsesLow.cons(verify_starting_and_ending_dates_for_isa_result_entry(result_entry, sentence, justifyP, upper), interval_justification_pairs);
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        return interval_justification_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 61105L)
    public static SubLObject collect_intervals_from_default_conditional_probability_statements_with_decaying_persistence_single(final SubLObject sentence, final SubLObject assertion, final SubLObject upper, final SubLObject time_of_assertion) {
        SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
        SubLObject result_entry = (SubLObject)temporal_projection.NIL;
        final SubLObject gaf = assertions_high.gaf_formula(assertion);
        final SubLObject prob = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject allowed_interval = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject unit_of_allowed_interval = cycl_utilities.formula_arg0(allowed_interval);
        final SubLObject allowed_lower_limit = cycl_utilities.formula_arg1(allowed_interval, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject allowed_upper_limit = cycl_utilities.formula_arg2(allowed_interval, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
        final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject no_of_iterations = Numbers.multiply(value_of_duration_of_time_interval, Numbers.divide(Numbers.log(upper, (SubLObject)temporal_projection.UNPROVIDED), Numbers.log(prob, (SubLObject)temporal_projection.UNPROVIDED)));
        final SubLObject derived_lower_limit = (SubLObject)ConsesLow.list(unit_of_duration_of_time_interval, no_of_iterations);
        final SubLObject derived_upper_limit = (SubLObject)ConsesLow.list(unit_of_duration_of_time_interval, no_of_iterations);
        final SubLObject new_allowed_lower_limit = (SubLObject)ConsesLow.list(unit_of_allowed_interval, allowed_lower_limit);
        final SubLObject new_allowed_upper_limit = (SubLObject)ConsesLow.list(unit_of_allowed_interval, allowed_upper_limit);
        SubLObject lower_limit = (SubLObject)temporal_projection.NIL;
        SubLObject upper_limit = (SubLObject)temporal_projection.NIL;
        SubLObject justifications = (SubLObject)temporal_projection.NIL;
        final SubLObject initial_point = temporal_projection_utilities.find_first_point_of_time(time_of_assertion);
        final SubLObject final_point = temporal_projection_utilities.find_last_point_of_time(time_of_assertion);
        if (allowed_interval.eql(temporal_projection.$const32$Forever_Quantity)) {
            lower_limit = derived_lower_limit;
        }
        else if (temporal_projection.NIL != quantities.cyc_less_than_quantities(new_allowed_lower_limit, derived_lower_limit)) {
            lower_limit = derived_lower_limit;
        }
        else {
            lower_limit = new_allowed_lower_limit;
        }
        if (allowed_interval.eql(temporal_projection.$const32$Forever_Quantity)) {
            upper_limit = derived_upper_limit;
        }
        else if (temporal_projection.NIL != quantities.cyc_less_than_quantities(derived_upper_limit, new_allowed_upper_limit)) {
            upper_limit = derived_upper_limit;
        }
        else {
            upper_limit = new_allowed_upper_limit;
        }
        if (cycl_utilities.formula_arg0(lower_limit).eql(temporal_projection.$const37$SecondsDuration)) {
            lower_limit = (SubLObject)ConsesLow.list(temporal_projection.$const37$SecondsDuration, Numbers.floor(cycl_utilities.formula_arg1(lower_limit, (SubLObject)temporal_projection.UNPROVIDED), (SubLObject)temporal_projection.UNPROVIDED));
        }
        if (cycl_utilities.formula_arg0(upper_limit).eql(temporal_projection.$const37$SecondsDuration)) {
            upper_limit = (SubLObject)ConsesLow.list(temporal_projection.$const37$SecondsDuration, Numbers.floor(cycl_utilities.formula_arg1(upper_limit, (SubLObject)temporal_projection.UNPROVIDED), (SubLObject)temporal_projection.UNPROVIDED));
        }
        if (temporal_projection.NIL != initial_point && temporal_projection.NIL != final_point) {
            justifications = (SubLObject)ConsesLow.list(assertion);
            result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, date_utilities.date_before(initial_point, lower_limit), date_utilities.date_after(final_point, upper_limit)), justifications, upper);
            interval_justification_pairs = (SubLObject)ConsesLow.cons(verify_starting_and_ending_dates_for_isa_result_entry(result_entry, sentence, (SubLObject)temporal_projection.T, upper), interval_justification_pairs);
        }
        if (temporal_projection.NIL != initial_point && temporal_projection.NIL == final_point) {
            justifications = (SubLObject)ConsesLow.list(assertion);
            result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, date_utilities.date_before(initial_point, lower_limit)), justifications, upper);
            interval_justification_pairs = (SubLObject)ConsesLow.cons(verify_starting_and_ending_dates_for_isa_result_entry(result_entry, sentence, (SubLObject)temporal_projection.T, upper), interval_justification_pairs);
        }
        if (temporal_projection.NIL != final_point && temporal_projection.NIL == initial_point) {
            justifications = (SubLObject)ConsesLow.list(assertion);
            result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const34$IntervalEndedByFn, date_utilities.date_after(final_point, upper_limit)), justifications, upper);
        }
        interval_justification_pairs = (SubLObject)ConsesLow.cons(verify_starting_and_ending_dates_for_isa_result_entry(result_entry, sentence, (SubLObject)temporal_projection.T, upper), interval_justification_pairs);
        return interval_justification_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 64524L)
    public static SubLObject collect_intervals_from_starting_and_ending_dates_for_arg(final SubLObject instance, final SubLObject assertions, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_justification_pairs = (SubLObject)temporal_projection.NIL;
        SubLObject entry = (SubLObject)temporal_projection.NIL;
        thread.resetMultipleValues();
        final SubLObject starting_date = earliest_possible_starting_date_of_concept(instance);
        final SubLObject justifications_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection.NIL != starting_date) {
            if (temporal_projection.NIL != justifyP) {
                entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const34$IntervalEndedByFn, starting_date), ConsesLow.append(assertions, justifications_1), (SubLObject)temporal_projection.ONE_INTEGER);
            }
            else {
                entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const34$IntervalEndedByFn, starting_date), (SubLObject)temporal_projection.NIL, (SubLObject)temporal_projection.ONE_INTEGER);
            }
            result_justification_pairs = (SubLObject)ConsesLow.cons(entry, result_justification_pairs);
        }
        thread.resetMultipleValues();
        final SubLObject ending_date = ending_date_of_concept(instance);
        final SubLObject justifications_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection.NIL != ending_date) {
            if (temporal_projection.NIL != justifyP) {
                entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, ending_date), ConsesLow.append(assertions, justifications_2), (SubLObject)temporal_projection.ONE_INTEGER);
            }
            else {
                entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, ending_date), (SubLObject)temporal_projection.NIL, (SubLObject)temporal_projection.ONE_INTEGER);
            }
            result_justification_pairs = (SubLObject)ConsesLow.cons(entry, result_justification_pairs);
        }
        return result_justification_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 65542L)
    public static SubLObject collect_intervals_for_non_isa_facts_from_starting_and_ending_dates(final SubLObject fact, final SubLObject justifyP) {
        final SubLObject pred = cycl_utilities.formula_arg0(fact);
        final SubLObject arg1 = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject result_justification_pairs = (SubLObject)temporal_projection.NIL;
        SubLObject assertions = kb_mapping_utilities.pred_u_v_holds_gafs(temporal_projection.$const38$contemporaryInArg, pred, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED);
        if (temporal_projection.NIL != assertions) {
            final SubLObject result = collect_intervals_from_starting_and_ending_dates_for_arg(arg1, assertions, justifyP);
            if (temporal_projection.NIL != result) {
                result_justification_pairs = ConsesLow.append(result, result_justification_pairs);
            }
        }
        assertions = kb_mapping_utilities.pred_u_v_holds_gafs(temporal_projection.$const38$contemporaryInArg, pred, (SubLObject)temporal_projection.TWO_INTEGER, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED);
        if (temporal_projection.NIL != assertions) {
            final SubLObject result = collect_intervals_from_starting_and_ending_dates_for_arg(arg2, assertions, justifyP);
            if (temporal_projection.NIL != result) {
                result_justification_pairs = ConsesLow.append(result, result_justification_pairs);
            }
        }
        return result_justification_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 66495L)
    public static SubLObject collect_intervals_for_non_isa_facts_from_starting_and_ending_dates_single(final SubLObject fact, final SubLObject time) {
        final SubLObject pred = cycl_utilities.formula_arg0(fact);
        final SubLObject arg1 = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject result_justification_pairs = (SubLObject)temporal_projection.NIL;
        SubLObject assertions = kb_mapping_utilities.pred_u_v_holds_gafs(temporal_projection.$const38$contemporaryInArg, pred, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED);
        if (temporal_projection.NIL != assertions) {
            SubLObject cdolist_list_var;
            final SubLObject result = cdolist_list_var = collect_intervals_from_starting_and_ending_dates_for_arg(arg1, assertions, (SubLObject)temporal_projection.T);
            SubLObject entry = (SubLObject)temporal_projection.NIL;
            entry = cdolist_list_var.first();
            while (temporal_projection.NIL != cdolist_list_var) {
                final SubLObject interval = cycl_utilities.formula_arg0(entry);
                if (temporal_projection.NIL != sbhl_time_query_processing.true_temporal_relation_literalP(temporal_projection.$const18$temporallyIntersects, interval, time, (SubLObject)temporal_projection.$kw19$POS, temporal_projection.$const11$BaseKB)) {
                    result_justification_pairs = (SubLObject)ConsesLow.cons(entry, result_justification_pairs);
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        assertions = kb_mapping_utilities.pred_u_v_holds_gafs(temporal_projection.$const38$contemporaryInArg, pred, (SubLObject)temporal_projection.TWO_INTEGER, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED);
        if (temporal_projection.NIL != assertions) {
            SubLObject cdolist_list_var;
            final SubLObject result = cdolist_list_var = collect_intervals_from_starting_and_ending_dates_for_arg(arg2, assertions, (SubLObject)temporal_projection.T);
            SubLObject entry = (SubLObject)temporal_projection.NIL;
            entry = cdolist_list_var.first();
            while (temporal_projection.NIL != cdolist_list_var) {
                final SubLObject interval = cycl_utilities.formula_arg0(entry);
                if (temporal_projection.NIL != sbhl_time_query_processing.true_temporal_relation_literalP(temporal_projection.$const18$temporallyIntersects, interval, time, (SubLObject)temporal_projection.$kw19$POS, temporal_projection.$const11$BaseKB)) {
                    result_justification_pairs = (SubLObject)ConsesLow.cons(entry, result_justification_pairs);
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        return result_justification_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 67634L)
    public static SubLObject collect_intervals_from_starting_and_ending_dates(final SubLObject fact, final SubLObject justifyP) {
        if (cycl_utilities.formula_arg0(fact).eql(temporal_projection.$const5$isa)) {
            return collect_intervals_for_isa_facts_from_starting_and_ending_dates(fact, justifyP);
        }
        return collect_intervals_for_non_isa_facts_from_starting_and_ending_dates(fact, justifyP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 67945L)
    public static SubLObject collect_intervals_from_starting_and_ending_dates_single(final SubLObject fact, final SubLObject time) {
        if (cycl_utilities.formula_arg0(fact).eql(temporal_projection.$const5$isa)) {
            return collect_intervals_for_isa_facts_from_starting_and_ending_dates_single(fact, time);
        }
        return collect_intervals_for_non_isa_facts_from_starting_and_ending_dates_single(fact, time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 68265L)
    public static SubLObject verify_starting_and_ending_times_of_isa_facts(final SubLObject fact, final SubLObject mt_time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        if (temporal_projection.NIL != genls.genlP(col, temporal_projection.$const39$SomethingExisting, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
            thread.resetMultipleValues();
            SubLObject result = check_starting_time_of_concept(entity, mt_time);
            SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection.NIL != result) {
                return Values.values(temporal_projection.$numeric_likelihood_fn_zero$.getDynamicValue(thread), ConsesLow.append(justifications, (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)temporal_projection.$kw40$GENLS, narts_high.nart_substitute((SubLObject)ConsesLow.listS(temporal_projection.$const41$genls, col, (SubLObject)temporal_projection.$list42)), (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED))));
            }
            thread.resetMultipleValues();
            result = check_ending_time_of_concept(entity, mt_time);
            justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection.NIL != result) {
                return Values.values(temporal_projection.$numeric_likelihood_fn_zero$.getDynamicValue(thread), ConsesLow.append(justifications, (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)temporal_projection.$kw40$GENLS, narts_high.nart_substitute((SubLObject)ConsesLow.listS(temporal_projection.$const41$genls, col, (SubLObject)temporal_projection.$list42)), (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED))));
            }
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 69051L)
    public static SubLObject collect_intervals_for_isa_facts_from_starting_and_ending_dates(final SubLObject fact, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject result_justification_pairs = (SubLObject)temporal_projection.NIL;
        SubLObject entry = (SubLObject)temporal_projection.NIL;
        if (temporal_projection.NIL != genls.genlP(col, temporal_projection.$const8$BiologicalLivingObject, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject starting_date = earliest_possible_starting_date_of_concept(entity);
            final SubLObject justifications_1 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection.NIL != starting_date) {
                if (temporal_projection.NIL != justifyP) {
                    entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const34$IntervalEndedByFn, starting_date), ConsesLow.append(justifications_1, (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)temporal_projection.$kw40$GENLS, narts_high.nart_substitute((SubLObject)ConsesLow.listS(temporal_projection.$const41$genls, col, (SubLObject)temporal_projection.$list43)), (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED))), (SubLObject)temporal_projection.ONE_INTEGER);
                }
                else {
                    entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const34$IntervalEndedByFn, starting_date), (SubLObject)temporal_projection.NIL, (SubLObject)temporal_projection.ONE_INTEGER);
                }
                result_justification_pairs = (SubLObject)ConsesLow.cons(entry, result_justification_pairs);
            }
            thread.resetMultipleValues();
            final SubLObject ending_date = ending_date_of_concept(entity);
            final SubLObject justifications_2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection.NIL != ending_date) {
                if (temporal_projection.NIL != justifyP) {
                    entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, ending_date), ConsesLow.append(justifications_2, (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)temporal_projection.$kw40$GENLS, narts_high.nart_substitute((SubLObject)ConsesLow.listS(temporal_projection.$const41$genls, col, (SubLObject)temporal_projection.$list43)), (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED))), (SubLObject)temporal_projection.ONE_INTEGER);
                }
                else {
                    entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, ending_date), (SubLObject)temporal_projection.NIL, (SubLObject)temporal_projection.ONE_INTEGER);
                }
                result_justification_pairs = (SubLObject)ConsesLow.cons(entry, result_justification_pairs);
            }
            return result_justification_pairs;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 70305L)
    public static SubLObject collect_intervals_for_isa_facts_from_starting_and_ending_dates_single(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject result_justification_pairs = (SubLObject)temporal_projection.NIL;
        SubLObject entry = (SubLObject)temporal_projection.NIL;
        if (temporal_projection.NIL != genls.genlP(col, temporal_projection.$const8$BiologicalLivingObject, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject starting_date = earliest_possible_starting_date_of_concept(entity);
            final SubLObject justifications_1 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection.NIL != starting_date) {
                entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const34$IntervalEndedByFn, starting_date), ConsesLow.append(justifications_1, (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)temporal_projection.$kw40$GENLS, narts_high.nart_substitute((SubLObject)ConsesLow.listS(temporal_projection.$const41$genls, col, (SubLObject)temporal_projection.$list43)), (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED))), (SubLObject)temporal_projection.ONE_INTEGER);
                final SubLObject interval = cycl_utilities.formula_arg0(entry);
                if (temporal_projection.NIL != sbhl_time_query_processing.true_temporal_relation_literalP(temporal_projection.$const44$temporallySubsumes, interval, time, (SubLObject)temporal_projection.$kw19$POS, temporal_projection.$const11$BaseKB)) {
                    result_justification_pairs = (SubLObject)ConsesLow.cons(entry, result_justification_pairs);
                }
            }
            thread.resetMultipleValues();
            final SubLObject ending_date = ending_date_of_concept(entity);
            final SubLObject justifications_2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection.NIL != ending_date) {
                entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, ending_date), ConsesLow.append(justifications_2, (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)temporal_projection.$kw40$GENLS, narts_high.nart_substitute((SubLObject)ConsesLow.listS(temporal_projection.$const41$genls, col, (SubLObject)temporal_projection.$list43)), (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED))), (SubLObject)temporal_projection.ONE_INTEGER);
                final SubLObject interval = cycl_utilities.formula_arg0(entry);
                if (temporal_projection.NIL != sbhl_time_query_processing.true_temporal_relation_literalP(temporal_projection.$const44$temporallySubsumes, interval, time, (SubLObject)temporal_projection.$kw19$POS, temporal_projection.$const11$BaseKB)) {
                    result_justification_pairs = (SubLObject)ConsesLow.cons(entry, result_justification_pairs);
                }
            }
            return result_justification_pairs;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 71676L)
    public static SubLObject verify_starting_and_ending_times_of_non_isa_facts(final SubLObject fact, final SubLObject mt_time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.formula_arg0(fact);
        final SubLObject arg_1 = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject arg_2 = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject assertions = kb_mapping_utilities.pred_u_v_holds_gafs(temporal_projection.$const38$contemporaryInArg, pred, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED);
        if (temporal_projection.NIL != assertions) {
            thread.resetMultipleValues();
            SubLObject result = check_starting_time_of_concept(arg_1, mt_time);
            SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection.NIL != result) {
                return Values.values(temporal_projection.$numeric_likelihood_fn_zero$.getDynamicValue(thread), ConsesLow.append(justifications, assertions));
            }
            thread.resetMultipleValues();
            result = check_ending_time_of_concept(arg_1, mt_time);
            justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection.NIL != result) {
                return Values.values(temporal_projection.$numeric_likelihood_fn_zero$.getDynamicValue(thread), ConsesLow.append(justifications, justifications));
            }
        }
        assertions = kb_mapping_utilities.pred_u_v_holds_gafs(temporal_projection.$const38$contemporaryInArg, pred, (SubLObject)temporal_projection.TWO_INTEGER, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED);
        if (temporal_projection.NIL != assertions) {
            thread.resetMultipleValues();
            SubLObject result = check_starting_time_of_concept(arg_2, mt_time);
            SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection.NIL != result) {
                return Values.values(temporal_projection.$numeric_likelihood_fn_zero$.getDynamicValue(thread), ConsesLow.append(assertions, justifications));
            }
            thread.resetMultipleValues();
            result = check_ending_time_of_concept(arg_2, mt_time);
            justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection.NIL != result) {
                return Values.values(temporal_projection.$numeric_likelihood_fn_zero$.getDynamicValue(thread), ConsesLow.append(assertions, justifications));
            }
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 73090L)
    public static SubLObject verify_temporal_constraints_between_collections(final SubLObject fact, final SubLObject mt_time, SubLObject justifyP) {
        if (justifyP == temporal_projection.UNPROVIDED) {
            justifyP = (SubLObject)temporal_projection.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ins = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const46$temporalConstraintBetweenCollecti, (SubLObject)temporal_projection.THREE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject assertion = (SubLObject)temporal_projection.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject relation = cycl_utilities.formula_arg1(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject new_fact = (SubLObject)ConsesLow.list(temporal_projection.$const5$isa, ins, cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED));
            SubLObject cdolist_list_var_$15;
            final SubLObject assertion_time_pairs = cdolist_list_var_$15 = get_assertion_time_pairs_for_fact(new_fact);
            SubLObject pair = (SubLObject)temporal_projection.NIL;
            pair = cdolist_list_var_$15.first();
            while (temporal_projection.NIL != cdolist_list_var_$15) {
                final SubLObject time = cycl_utilities.formula_arg0(pair);
                final SubLObject assertion_1 = cycl_utilities.formula_arg1(pair, (SubLObject)temporal_projection.UNPROVIDED);
                if (relation.eql(temporal_projection.$const45$laterThan) && temporal_projection.NIL != not_all_points_are_later_thanP(time, mt_time)) {
                    if (temporal_projection.NIL != justifyP) {
                        return Values.values(temporal_projection.$numeric_likelihood_fn_zero$.getDynamicValue(thread), (SubLObject)ConsesLow.list(assertion_1, assertion));
                    }
                    return temporal_projection.$numeric_likelihood_fn_zero$.getDynamicValue(thread);
                }
                else {
                    cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                    pair = cdolist_list_var_$15.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 74017L)
    public static SubLObject collect_intervals_from_temporal_constraints_between_collections_for_negated_isa_sentence(final SubLObject sentence, final SubLObject justifyP) {
        final SubLObject col = cycl_utilities.formula_arg2(sentence, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject entry = (SubLObject)temporal_projection.NIL;
        SubLObject interval_justification = (SubLObject)temporal_projection.NIL;
        final SubLObject ins = cycl_utilities.formula_arg1(sentence, (SubLObject)temporal_projection.UNPROVIDED);
        if (temporal_projection.NIL != isa.isaP(ins, col, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const46$temporalConstraintBetweenCollecti, (SubLObject)temporal_projection.THREE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED);
            SubLObject assertion = (SubLObject)temporal_projection.NIL;
            assertion = cdolist_list_var.first();
            while (temporal_projection.NIL != cdolist_list_var) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject relation = cycl_utilities.formula_arg1(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject new_fact = (SubLObject)ConsesLow.list(temporal_projection.$const5$isa, ins, cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED));
                final SubLObject assertion_time_pairs = get_assertion_time_pairs_for_fact(new_fact);
                if (relation.eql(temporal_projection.$const45$laterThan)) {
                    SubLObject cdolist_list_var_$16 = assertion_time_pairs;
                    SubLObject pair = (SubLObject)temporal_projection.NIL;
                    pair = cdolist_list_var_$16.first();
                    while (temporal_projection.NIL != cdolist_list_var_$16) {
                        final SubLObject time = cycl_utilities.formula_arg0(pair);
                        final SubLObject assertion_1 = cycl_utilities.formula_arg1(pair, (SubLObject)temporal_projection.UNPROVIDED);
                        if (temporal_projection.NIL != justifyP) {
                            entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, time), (SubLObject)ConsesLow.list(assertion, assertion_1), (SubLObject)temporal_projection.ONE_INTEGER);
                        }
                        else {
                            entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, time), (SubLObject)temporal_projection.NIL, (SubLObject)temporal_projection.ONE_INTEGER);
                        }
                        interval_justification = (SubLObject)ConsesLow.cons(entry, interval_justification);
                        cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                        pair = cdolist_list_var_$16.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
            return interval_justification;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 75003L)
    public static SubLObject collect_intervals_from_temporal_constraints_between_collections_for_negated_isa_sentence_single(final SubLObject sentence, final SubLObject time_of_sentence) {
        final SubLObject col = cycl_utilities.formula_arg2(sentence, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject entry = (SubLObject)temporal_projection.NIL;
        SubLObject interval_justification = (SubLObject)temporal_projection.NIL;
        final SubLObject ins = cycl_utilities.formula_arg1(sentence, (SubLObject)temporal_projection.UNPROVIDED);
        if (temporal_projection.NIL != isa.isaP(ins, col, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const46$temporalConstraintBetweenCollecti, (SubLObject)temporal_projection.THREE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED);
            SubLObject assertion = (SubLObject)temporal_projection.NIL;
            assertion = cdolist_list_var.first();
            while (temporal_projection.NIL != cdolist_list_var) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject relation = cycl_utilities.formula_arg1(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject new_fact = (SubLObject)ConsesLow.list(temporal_projection.$const5$isa, ins, cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED));
                final SubLObject assertion_time_pairs = get_assertion_time_pairs_for_fact(new_fact);
                if (relation.eql(temporal_projection.$const45$laterThan)) {
                    SubLObject cdolist_list_var_$17 = assertion_time_pairs;
                    SubLObject pair = (SubLObject)temporal_projection.NIL;
                    pair = cdolist_list_var_$17.first();
                    while (temporal_projection.NIL != cdolist_list_var_$17) {
                        final SubLObject time = cycl_utilities.formula_arg0(pair);
                        final SubLObject assertion_1 = cycl_utilities.formula_arg1(pair, (SubLObject)temporal_projection.UNPROVIDED);
                        entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, time), (SubLObject)ConsesLow.list(assertion, assertion_1), (SubLObject)temporal_projection.ONE_INTEGER);
                        final SubLObject interval = cycl_utilities.formula_arg0(entry);
                        if (temporal_projection.NIL != sbhl_time_query_processing.true_temporal_relation_literalP(temporal_projection.$const18$temporallyIntersects, interval, time_of_sentence, (SubLObject)temporal_projection.$kw19$POS, temporal_projection.$const11$BaseKB)) {
                            interval_justification = (SubLObject)ConsesLow.cons(entry, interval_justification);
                        }
                        cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                        pair = cdolist_list_var_$17.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
            return interval_justification;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 76073L)
    public static SubLObject not_all_points_are_later_thanP(final SubLObject time_1, final SubLObject time_2) {
        final SubLObject first_point_1 = temporal_projection_utilities.find_first_point_of_time(time_1);
        final SubLObject first_point_2 = temporal_projection_utilities.find_first_point_of_time(time_2);
        if (temporal_projection.NIL != first_point_1 && temporal_projection.NIL != first_point_2) {
            return (SubLObject)SubLObjectFactory.makeBoolean(temporal_projection.NIL != date_utilities.dateL(first_point_1, first_point_2) || temporal_projection.NIL == sbhl_time_query_processing.true_temporal_relation_literalP(temporal_projection.$const47$startsAfterStartingOf, first_point_1, first_point_2, (SubLObject)temporal_projection.$kw19$POS, temporal_projection.$const11$BaseKB));
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 76549L)
    public static SubLObject get_assertion_time_pairs_for_fact(final SubLObject fact) {
        final SubLObject assertions = get_assertions_for_fact_1(fact);
        SubLObject result = (SubLObject)temporal_projection.NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)temporal_projection.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection.NIL != cdolist_list_var) {
            final SubLObject time_for_assertion = get_time_for_assertion_1(assertion);
            if (temporal_projection.NIL != time_for_assertion && !time_for_assertion.eql(temporal_projection.$const36$Always_TimeInterval) && temporal_projection.NIL == temporal_projection_utilities.assertion_produced_by_temporal_projectionP(assertion) && temporal_projection.NIL == nart_handles.nart_p(time_for_assertion)) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(time_for_assertion, assertion), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 77114L)
    public static SubLObject get_time_for_assertion_1(final SubLObject assertion) {
        final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
        if (assertion_mt.isList() && temporal_projection.NIL != cycl_utilities.formula_arg2(assertion_mt, (SubLObject)temporal_projection.UNPROVIDED) && (cycl_utilities.formula_arg2(cycl_utilities.formula_arg2(assertion_mt, (SubLObject)temporal_projection.UNPROVIDED), (SubLObject)temporal_projection.UNPROVIDED).eql(temporal_projection.$const48$TimePoint) || temporal_projection.NIL == cycl_utilities.formula_arg2(cycl_utilities.formula_arg2(assertion_mt, (SubLObject)temporal_projection.UNPROVIDED), (SubLObject)temporal_projection.UNPROVIDED))) {
            return possibly_replace_indexicals(cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(assertion_mt, (SubLObject)temporal_projection.UNPROVIDED), (SubLObject)temporal_projection.UNPROVIDED));
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 77587L)
    public static SubLObject get_time_for_assertion_2(final SubLObject assertion) {
        final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
        if (assertion_mt.isList() && temporal_projection.NIL != cycl_utilities.formula_arg2(assertion_mt, (SubLObject)temporal_projection.UNPROVIDED) && (cycl_utilities.formula_arg2(cycl_utilities.formula_arg2(assertion_mt, (SubLObject)temporal_projection.UNPROVIDED), (SubLObject)temporal_projection.UNPROVIDED).eql(temporal_projection.$const48$TimePoint) || temporal_projection.NIL == cycl_utilities.formula_arg2(cycl_utilities.formula_arg2(assertion_mt, (SubLObject)temporal_projection.UNPROVIDED), (SubLObject)temporal_projection.UNPROVIDED))) {
            return cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(assertion_mt, (SubLObject)temporal_projection.UNPROVIDED), (SubLObject)temporal_projection.UNPROVIDED);
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 78043L)
    public static SubLObject possibly_replace_indexicals(final SubLObject mt_time) {
        if (cycl_utilities.formula_arg2(mt_time, (SubLObject)temporal_projection.UNPROVIDED).eql(temporal_projection.$const49$Now)) {
            return (SubLObject)ConsesLow.list(cycl_utilities.formula_arg0(mt_time), cycl_utilities.formula_arg1(mt_time, (SubLObject)temporal_projection.UNPROVIDED), date_utilities.indexical_now());
        }
        return mt_time;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 78239L)
    public static SubLObject verify_temporal_relation_between_arguments(final SubLObject fact, SubLObject justifyP) {
        if (justifyP == temporal_projection.UNPROVIDED) {
            justifyP = (SubLObject)temporal_projection.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.formula_arg0(fact);
        final SubLObject arg_1 = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject arg_2 = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(predicate, temporal_projection.$const51$temporalRelationBetweenArguments, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject assertion = (SubLObject)temporal_projection.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject pos_1 = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject pos_2 = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject relation = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            SubLObject result = (SubLObject)temporal_projection.NIL;
            if (pos_1.numE((SubLObject)temporal_projection.ONE_INTEGER) && pos_2.numE((SubLObject)temporal_projection.TWO_INTEGER) && relation.eql(temporal_projection.$const50$endsAfterStartingOf)) {
                thread.resetMultipleValues();
                final SubLObject ending_date = lookup_ending_date_for_entity(arg_1);
                final SubLObject justification_1 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject starting_date = lookup_starting_date_for_entity(arg_2);
                final SubLObject justification_2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection.NIL != ending_date && temporal_projection.NIL != starting_date) {
                    result = (SubLObject)SubLObjectFactory.makeBoolean(temporal_projection.NIL == sbhl_time_query_processing.true_temporal_relation_literalP(relation, ending_date, starting_date, (SubLObject)temporal_projection.$kw19$POS, temporal_projection.$const11$BaseKB));
                    if (temporal_projection.NIL != result) {
                        if (temporal_projection.NIL != justifyP) {
                            return Values.values((SubLObject)temporal_projection.T, ConsesLow.append((SubLObject)ConsesLow.list(assertion), justification_1, justification_2));
                        }
                        return Values.values((SubLObject)temporal_projection.T, (SubLObject)temporal_projection.NIL);
                    }
                }
            }
            if (pos_1.numE((SubLObject)temporal_projection.TWO_INTEGER) && pos_2.numE((SubLObject)temporal_projection.ONE_INTEGER) && relation.eql(temporal_projection.$const50$endsAfterStartingOf)) {
                thread.resetMultipleValues();
                final SubLObject ending_date = lookup_ending_date_for_entity(arg_2);
                final SubLObject justification_1 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject starting_date = lookup_starting_date_for_entity(arg_1);
                final SubLObject justification_2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection.NIL != starting_date && temporal_projection.NIL != ending_date) {
                    result = (SubLObject)SubLObjectFactory.makeBoolean(temporal_projection.NIL == sbhl_time_query_processing.true_temporal_relation_literalP(relation, ending_date, starting_date, (SubLObject)temporal_projection.$kw19$POS, temporal_projection.$const11$BaseKB));
                    if (temporal_projection.NIL != result) {
                        if (temporal_projection.NIL != justifyP) {
                            return Values.values((SubLObject)temporal_projection.T, ConsesLow.append(justification_1, justification_2, (SubLObject)ConsesLow.list(assertion)));
                        }
                        return Values.values((SubLObject)temporal_projection.T, (SubLObject)temporal_projection.NIL);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 80075L)
    public static SubLObject collect_intervals_from_temporal_relation_between_arguments_assertions_for_negated_non_isa_sentence(final SubLObject fact, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg_1 = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject arg_2 = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject predicate = cycl_utilities.formula_arg0(fact);
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(predicate, temporal_projection.$const51$temporalRelationBetweenArguments, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject assertion = (SubLObject)temporal_projection.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject relation = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject pos_1 = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject pos_2 = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            if (pos_1.numE((SubLObject)temporal_projection.ONE_INTEGER) && pos_2.numE((SubLObject)temporal_projection.TWO_INTEGER) && relation.eql(temporal_projection.$const50$endsAfterStartingOf)) {
                thread.resetMultipleValues();
                final SubLObject ending_date = ending_date_of_concept(arg_1);
                final SubLObject justification_1 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection.NIL != ending_date) {
                    thread.resetMultipleValues();
                    final SubLObject starting_date = earliest_possible_starting_date_of_concept(arg_2);
                    final SubLObject justification_2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (temporal_projection.NIL != starting_date) {
                        if (temporal_projection.NIL == sbhl_time_query_processing.true_temporal_relation_literalP(relation, arg_1, arg_2, (SubLObject)temporal_projection.$kw19$POS, (SubLObject)temporal_projection.UNPROVIDED)) {
                            if (temporal_projection.NIL != justifyP) {
                                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const36$Always_TimeInterval, ConsesLow.append(justification_1, justification_2, (SubLObject)ConsesLow.list(assertion)), (SubLObject)temporal_projection.ONE_INTEGER));
                            }
                            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const36$Always_TimeInterval, (SubLObject)temporal_projection.NIL, (SubLObject)temporal_projection.ONE_INTEGER));
                        }
                        else {
                            if (temporal_projection.NIL != justifyP) {
                                return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const34$IntervalEndedByFn, starting_date), ConsesLow.append(justification_1, justification_2, (SubLObject)ConsesLow.list(assertion)), (SubLObject)temporal_projection.ONE_INTEGER));
                            }
                            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const34$IntervalEndedByFn, starting_date), (SubLObject)temporal_projection.NIL, (SubLObject)temporal_projection.ONE_INTEGER));
                        }
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 81388L)
    public static SubLObject collect_intervals_from_temporal_relation_between_arguments_assertions_for_negated_non_isa_sentence_single(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg_1 = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject arg_2 = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject predicate = cycl_utilities.formula_arg0(fact);
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(predicate, temporal_projection.$const51$temporalRelationBetweenArguments, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject assertion = (SubLObject)temporal_projection.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject relation = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject pos_1 = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject pos_2 = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            if (pos_1.numE((SubLObject)temporal_projection.ONE_INTEGER) && pos_2.numE((SubLObject)temporal_projection.TWO_INTEGER) && relation.eql(temporal_projection.$const50$endsAfterStartingOf)) {
                thread.resetMultipleValues();
                final SubLObject ending_date = ending_date_of_concept(arg_1);
                final SubLObject justification_1 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection.NIL != ending_date) {
                    thread.resetMultipleValues();
                    final SubLObject starting_date = earliest_possible_starting_date_of_concept(arg_2);
                    final SubLObject justification_2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (temporal_projection.NIL != starting_date) {
                        if (temporal_projection.NIL == sbhl_time_query_processing.true_temporal_relation_literalP(relation, ending_date, starting_date, (SubLObject)temporal_projection.$kw19$POS, temporal_projection.$const11$BaseKB)) {
                            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const36$Always_TimeInterval, ConsesLow.append(justification_1, justification_2, (SubLObject)ConsesLow.list(assertion)), (SubLObject)temporal_projection.ONE_INTEGER));
                        }
                        final SubLObject interval = (SubLObject)ConsesLow.list(temporal_projection.$const34$IntervalEndedByFn, starting_date);
                        if (temporal_projection.NIL != sbhl_time_query_processing.true_temporal_relation_literalP(temporal_projection.$const18$temporallyIntersects, interval, time, (SubLObject)temporal_projection.$kw19$POS, temporal_projection.$const11$BaseKB)) {
                            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(interval, ConsesLow.append(justification_1, justification_2, (SubLObject)ConsesLow.list(assertion)), (SubLObject)temporal_projection.ONE_INTEGER));
                        }
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 82709L)
    public static SubLObject verify_genls_and_disjoint_with_constraints(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
        try {
            sdc.$ignoring_sdcP$.bind((SubLObject)temporal_projection.T, thread);
            final SubLObject entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject col_1 = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject pred_var = temporal_projection.$const5$isa;
            if (temporal_projection.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(entity, (SubLObject)temporal_projection.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(entity, (SubLObject)temporal_projection.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)temporal_projection.NIL;
                final SubLObject token_var = (SubLObject)temporal_projection.NIL;
                while (temporal_projection.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (temporal_projection.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)temporal_projection.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)temporal_projection.$kw31$GAF, (SubLObject)temporal_projection.NIL, (SubLObject)temporal_projection.NIL);
                            SubLObject done_var_$18 = (SubLObject)temporal_projection.NIL;
                            final SubLObject token_var_$19 = (SubLObject)temporal_projection.NIL;
                            while (temporal_projection.NIL == done_var_$18) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                final SubLObject valid_$20 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$19.eql(assertion));
                                if (temporal_projection.NIL != valid_$20) {
                                    final SubLObject gaf = assertions_high.gaf_formula(assertion);
                                    final SubLObject assertion_time = get_time_for_assertion_1(assertion);
                                    if (temporal_projection.NIL != assertion_time) {
                                        final SubLObject col_2 = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                                        if (temporal_projection.NIL != sbhl_time_query_processing.true_temporal_relation_literalP(temporal_projection.$const44$temporallySubsumes, assertion_time, mt_time, (SubLObject)temporal_projection.$kw19$POS, temporal_projection.$const11$BaseKB)) {
                                            if (temporal_projection.NIL != disjoint_with.disjoint_withP(col_1, col_2, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
                                                if (temporal_projection.NIL != justifyP) {
                                                    return Values.values(temporal_projection.$numeric_likelihood_fn_zero$.getDynamicValue(thread), ConsesLow.append((SubLObject)ConsesLow.list(assertion), (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)temporal_projection.$kw52$DISJOINTWITH, narts_high.nart_substitute((SubLObject)ConsesLow.list(temporal_projection.$const53$disjointWith, col_1, col_2)), (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED))));
                                                }
                                                return Values.values(temporal_projection.$numeric_likelihood_fn_zero$.getDynamicValue(thread), (SubLObject)temporal_projection.NIL);
                                            }
                                            else if (temporal_projection.NIL != genls.genlP(col_2, col_1, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
                                                if (temporal_projection.NIL != justifyP) {
                                                    return Values.values(temporal_projection.$numeric_likelihood_fn_one$.getDynamicValue(thread), ConsesLow.append((SubLObject)ConsesLow.list(assertion), (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)temporal_projection.$kw40$GENLS, narts_high.nart_substitute((SubLObject)ConsesLow.list(temporal_projection.$const41$genls, col_2, col_1)), (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED))));
                                                }
                                                return Values.values(temporal_projection.$numeric_likelihood_fn_one$.getDynamicValue(thread), (SubLObject)temporal_projection.NIL);
                                            }
                                        }
                                    }
                                }
                                done_var_$18 = (SubLObject)SubLObjectFactory.makeBoolean(temporal_projection.NIL == valid_$20);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)temporal_projection.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (temporal_projection.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(temporal_projection.NIL == valid);
                }
            }
        }
        finally {
            sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 83866L)
    public static SubLObject collect_intervals_from_disjoint_assertions(final SubLObject sentence, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
        try {
            sdc.$ignoring_sdcP$.bind((SubLObject)temporal_projection.T, thread);
            final SubLObject entity = cycl_utilities.formula_arg1(sentence, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject col_1 = cycl_utilities.formula_arg2(sentence, (SubLObject)temporal_projection.UNPROVIDED);
            SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
            SubLObject entry = (SubLObject)temporal_projection.NIL;
            final SubLObject pred_var = temporal_projection.$const5$isa;
            if (temporal_projection.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(entity, (SubLObject)temporal_projection.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(entity, (SubLObject)temporal_projection.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)temporal_projection.NIL;
                final SubLObject token_var = (SubLObject)temporal_projection.NIL;
                while (temporal_projection.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (temporal_projection.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)temporal_projection.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)temporal_projection.$kw31$GAF, (SubLObject)temporal_projection.NIL, (SubLObject)temporal_projection.NIL);
                            SubLObject done_var_$22 = (SubLObject)temporal_projection.NIL;
                            final SubLObject token_var_$23 = (SubLObject)temporal_projection.NIL;
                            while (temporal_projection.NIL == done_var_$22) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$23);
                                final SubLObject valid_$24 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$23.eql(assertion));
                                if (temporal_projection.NIL != valid_$24 && assertions_high.assertion_truth(assertion).eql((SubLObject)temporal_projection.$kw54$TRUE) && temporal_projection.NIL == temporal_projection_utilities.assertion_produced_by_temporal_projectionP(assertion)) {
                                    final SubLObject gaf = assertions_high.gaf_formula(assertion);
                                    final SubLObject assertion_time = temporal_projection_utilities.possibly_get_nauts_from_narts(get_time_for_assertion_2(assertion));
                                    if (temporal_projection.NIL != assertion_time) {
                                        final SubLObject col_2 = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                                        if (temporal_projection.NIL != disjoint_with.disjoint_withP(col_1, col_2, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
                                            if (temporal_projection.NIL != justifyP) {
                                                entry = (SubLObject)ConsesLow.list(assertion_time, ConsesLow.append(new SubLObject[] { ConsesLow.list(assertion, arguments.make_hl_support((SubLObject)temporal_projection.$kw52$DISJOINTWITH, narts_high.nart_substitute((SubLObject)ConsesLow.list(temporal_projection.$const53$disjointWith, col_1, col_2)), (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) }), (SubLObject)temporal_projection.ONE_INTEGER);
                                            }
                                            else {
                                                entry = (SubLObject)ConsesLow.list(assertion_time, (SubLObject)temporal_projection.NIL, (SubLObject)temporal_projection.ONE_INTEGER);
                                            }
                                            interval_justification_pairs = (SubLObject)ConsesLow.cons(entry, interval_justification_pairs);
                                        }
                                    }
                                }
                                done_var_$22 = (SubLObject)SubLObjectFactory.makeBoolean(temporal_projection.NIL == valid_$24);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)temporal_projection.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (temporal_projection.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(temporal_projection.NIL == valid);
                }
            }
            return interval_justification_pairs;
        }
        finally {
            sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 84870L)
    public static SubLObject collect_intervals_from_disjoint_assertions_single(final SubLObject sentence, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
        try {
            sdc.$ignoring_sdcP$.bind((SubLObject)temporal_projection.T, thread);
            final SubLObject entity = cycl_utilities.formula_arg1(sentence, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject col_1 = cycl_utilities.formula_arg2(sentence, (SubLObject)temporal_projection.UNPROVIDED);
            SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
            SubLObject entry = (SubLObject)temporal_projection.NIL;
            final SubLObject pred_var = temporal_projection.$const5$isa;
            if (temporal_projection.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(entity, (SubLObject)temporal_projection.ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(entity, (SubLObject)temporal_projection.ONE_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)temporal_projection.NIL;
                final SubLObject token_var = (SubLObject)temporal_projection.NIL;
                while (temporal_projection.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (temporal_projection.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)temporal_projection.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)temporal_projection.$kw31$GAF, (SubLObject)temporal_projection.NIL, (SubLObject)temporal_projection.NIL);
                            SubLObject done_var_$26 = (SubLObject)temporal_projection.NIL;
                            final SubLObject token_var_$27 = (SubLObject)temporal_projection.NIL;
                            while (temporal_projection.NIL == done_var_$26) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$27);
                                final SubLObject valid_$28 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$27.eql(assertion));
                                if (temporal_projection.NIL != valid_$28 && assertions_high.assertion_truth(assertion).eql((SubLObject)temporal_projection.$kw54$TRUE) && temporal_projection.NIL == temporal_projection_utilities.assertion_produced_by_temporal_projectionP(assertion)) {
                                    final SubLObject gaf = assertions_high.gaf_formula(assertion);
                                    final SubLObject assertion_time = temporal_projection_utilities.possibly_get_nauts_from_narts(get_time_for_assertion_2(assertion));
                                    if (temporal_projection.NIL != assertion_time) {
                                        final SubLObject col_2 = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                                        if (temporal_projection.NIL != disjoint_with.disjoint_withP(col_1, col_2, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
                                            entry = (SubLObject)ConsesLow.list(assertion_time, ConsesLow.append(new SubLObject[] { ConsesLow.list(assertion, arguments.make_hl_support((SubLObject)temporal_projection.$kw52$DISJOINTWITH, narts_high.nart_substitute((SubLObject)ConsesLow.list(temporal_projection.$const53$disjointWith, col_1, col_2)), (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) }), (SubLObject)temporal_projection.ONE_INTEGER);
                                            final SubLObject interval = cycl_utilities.formula_arg0(entry);
                                            if (temporal_projection.NIL != sbhl_time_query_processing.true_temporal_relation_literalP(temporal_projection.$const44$temporallySubsumes, interval, time, (SubLObject)temporal_projection.$kw19$POS, temporal_projection.$const11$BaseKB)) {
                                                interval_justification_pairs = (SubLObject)ConsesLow.cons(entry, interval_justification_pairs);
                                            }
                                        }
                                    }
                                }
                                done_var_$26 = (SubLObject)SubLObjectFactory.makeBoolean(temporal_projection.NIL == valid_$28);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)temporal_projection.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (temporal_projection.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(temporal_projection.NIL == valid);
                }
            }
            return interval_justification_pairs;
        }
        finally {
            sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 85943L)
    public static SubLObject collect_intervals_from_genls_assertions(final SubLObject sentence, final SubLObject justifyP) {
        final SubLObject entity = cycl_utilities.formula_arg1(sentence, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject col_1 = cycl_utilities.formula_arg2(sentence, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject entry = (SubLObject)temporal_projection.NIL;
        SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
        final SubLObject pred_var = temporal_projection.$const5$isa;
        if (temporal_projection.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(entity, (SubLObject)temporal_projection.ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(entity, (SubLObject)temporal_projection.ONE_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)temporal_projection.NIL;
            final SubLObject token_var = (SubLObject)temporal_projection.NIL;
            while (temporal_projection.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (temporal_projection.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)temporal_projection.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)temporal_projection.$kw31$GAF, (SubLObject)temporal_projection.NIL, (SubLObject)temporal_projection.NIL);
                        SubLObject done_var_$30 = (SubLObject)temporal_projection.NIL;
                        final SubLObject token_var_$31 = (SubLObject)temporal_projection.NIL;
                        while (temporal_projection.NIL == done_var_$30) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$31);
                            final SubLObject valid_$32 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$31.eql(assertion));
                            if (temporal_projection.NIL != valid_$32 && temporal_projection.NIL == temporal_projection_utilities.assertion_produced_by_temporal_projectionP(assertion) && assertions_high.assertion_truth(assertion).eql((SubLObject)temporal_projection.$kw54$TRUE)) {
                                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                                final SubLObject assertion_time = temporal_projection_utilities.possibly_get_nauts_from_narts(get_time_for_assertion_2(assertion));
                                if (temporal_projection.NIL != assertion_time) {
                                    final SubLObject col_2 = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                                    if (temporal_projection.NIL != genls.genlP(col_2, col_1, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
                                        if (temporal_projection.NIL != justifyP) {
                                            entry = (SubLObject)ConsesLow.list(assertion_time, ConsesLow.append((SubLObject)ConsesLow.list(assertion), (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)temporal_projection.$kw40$GENLS, narts_high.nart_substitute((SubLObject)ConsesLow.list(temporal_projection.$const41$genls, col_2, col_1)), (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED))), (SubLObject)temporal_projection.ONE_INTEGER);
                                        }
                                        else {
                                            entry = (SubLObject)ConsesLow.list(assertion_time, (SubLObject)temporal_projection.NIL, (SubLObject)temporal_projection.ONE_INTEGER);
                                        }
                                        interval_justification_pairs = (SubLObject)ConsesLow.cons(entry, interval_justification_pairs);
                                    }
                                }
                            }
                            done_var_$30 = (SubLObject)SubLObjectFactory.makeBoolean(temporal_projection.NIL == valid_$32);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)temporal_projection.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (temporal_projection.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(temporal_projection.NIL == valid);
            }
        }
        temporal_projection.$intervals_from_genls_assertions$.setDynamicValue(interval_justification_pairs);
        return interval_justification_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 86984L)
    public static SubLObject verify_starting_and_ending_times(final SubLObject fact, final SubLObject mt_time) {
        if (cycl_utilities.formula_arg0(fact).eql(temporal_projection.$const5$isa)) {
            return verify_starting_and_ending_times_of_isa_facts(fact, mt_time);
        }
        return verify_starting_and_ending_times_of_non_isa_facts(fact, mt_time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 87402L)
    public static SubLObject check_starting_time_of_concept(final SubLObject entity, final SubLObject mt_time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject starting_time = find_known_or_expected_starting_date(entity);
        final SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(date_utilities.dateL(mt_time, starting_time), justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 87716L)
    public static SubLObject check_ending_time_of_concept(final SubLObject entity, final SubLObject mt_time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject ending_time = lookup_ending_date_for_entity(entity);
        final SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(date_utilities.dateL(ending_time, mt_time), justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 87999L)
    public static SubLObject earliest_possible_starting_date_of_concept(final SubLObject entity) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs(entity, temporal_projection.$const55$startingDate, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject assertion = (SubLObject)temporal_projection.NIL;
        assertion = cdolist_list_var.first();
        if (temporal_projection.NIL != cdolist_list_var) {
            final SubLObject date = cycl_utilities.formula_arg2(assertions_high.gaf_formula(assertion), (SubLObject)temporal_projection.UNPROVIDED);
            temporal_projection.$temporal_projection_list_of_starting_dates$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(entity, date, (SubLObject)ConsesLow.list(assertion)), temporal_projection.$temporal_projection_list_of_starting_dates$.getDynamicValue(thread)), thread);
            return Values.values(date, (SubLObject)ConsesLow.list(assertion));
        }
        all_assertions = (cdolist_list_var = kb_mapping_utilities.pred_value_gafs(entity, temporal_projection.$const56$birthDate, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED));
        assertion = (SubLObject)temporal_projection.NIL;
        assertion = cdolist_list_var.first();
        if (temporal_projection.NIL != cdolist_list_var) {
            final SubLObject date = cycl_utilities.formula_arg2(assertions_high.gaf_formula(assertion), (SubLObject)temporal_projection.UNPROVIDED);
            temporal_projection.$temporal_projection_list_of_starting_dates$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(entity, date, (SubLObject)ConsesLow.list(assertion)), temporal_projection.$temporal_projection_list_of_starting_dates$.getDynamicValue(thread)), thread);
            return Values.values(date, (SubLObject)ConsesLow.list(assertion));
        }
        if (temporal_projection.NIL != isa.isaP(entity, temporal_projection.$const39$SomethingExisting, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
            SubLObject cdolist_list_var2 = isa.isa(entity, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED);
            SubLObject col = (SubLObject)temporal_projection.NIL;
            col = cdolist_list_var2.first();
            while (temporal_projection.NIL != cdolist_list_var2) {
                final SubLObject cdolist_list_var_$33 = kb_mapping_utilities.pred_value_gafs(col, temporal_projection.$const57$earliestDateForCollectionMembers, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED);
                SubLObject assertion2 = (SubLObject)temporal_projection.NIL;
                assertion2 = cdolist_list_var_$33.first();
                if (temporal_projection.NIL != cdolist_list_var_$33) {
                    final SubLObject date2 = cycl_utilities.formula_arg2(assertions_high.gaf_formula(assertion2), (SubLObject)temporal_projection.UNPROVIDED);
                    temporal_projection.$temporal_projection_list_of_starting_dates$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(entity, date2, (SubLObject)ConsesLow.list(assertion2)), temporal_projection.$temporal_projection_list_of_starting_dates$.getDynamicValue(thread)), thread);
                    return Values.values(date2, (SubLObject)ConsesLow.list(assertion2));
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                col = cdolist_list_var2.first();
            }
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 89220L)
    public static SubLObject ending_date_of_concept(final SubLObject entity) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs(entity, temporal_projection.$const58$dateOfDeath, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject assertion = (SubLObject)temporal_projection.NIL;
        assertion = cdolist_list_var.first();
        if (temporal_projection.NIL != cdolist_list_var) {
            final SubLObject date = cycl_utilities.formula_arg2(assertions_high.gaf_formula(assertion), (SubLObject)temporal_projection.UNPROVIDED);
            temporal_projection.$temporal_projection_list_of_ending_dates$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(entity, date, (SubLObject)ConsesLow.list(assertion)), temporal_projection.$temporal_projection_list_of_ending_dates$.getDynamicValue(thread)), thread);
            return Values.values(date, (SubLObject)ConsesLow.list(assertion));
        }
        all_assertions = (cdolist_list_var = kb_mapping_utilities.pred_value_gafs(entity, temporal_projection.$const59$endingDate, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED));
        assertion = (SubLObject)temporal_projection.NIL;
        assertion = cdolist_list_var.first();
        if (temporal_projection.NIL != cdolist_list_var) {
            final SubLObject date = cycl_utilities.formula_arg2(assertions_high.gaf_formula(assertion), (SubLObject)temporal_projection.UNPROVIDED);
            temporal_projection.$temporal_projection_list_of_ending_dates$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(entity, date, (SubLObject)ConsesLow.list(assertion)), temporal_projection.$temporal_projection_list_of_ending_dates$.getDynamicValue(thread)), thread);
            return Values.values(date, (SubLObject)ConsesLow.list(assertion));
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 89905L)
    public static SubLObject get_assertions_for_fact_1(final SubLObject fact) {
        final SubLObject a = cycl_utilities.formula_arg0(fact);
        SubLObject b = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject c = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        if (temporal_projection.NIL != b && b.isList()) {
            final SubLObject b_nart = narts_high.find_nart(b);
            if (temporal_projection.NIL != b_nart) {
                b = b_nart;
            }
        }
        if (temporal_projection.NIL != c && c.isList()) {
            final SubLObject c_nart = narts_high.find_nart(c);
            if (temporal_projection.NIL != c_nart) {
                c = c_nart;
            }
        }
        if (Sequences.length(fact).numE((SubLObject)temporal_projection.THREE_INTEGER)) {
            return kb_mapping_utilities.pred_u_v_holds_gafs(a, b, c, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED);
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 90408L)
    public static SubLObject find_likelihood_of_truth_of_non_isa_sentence_by_using_decay_distributions(final SubLObject fact, final SubLObject time, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject result = use_type_level_distributions_for_computing_likelihood(fact, time, justifyP);
        SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection.NIL != result) {
            return Values.values(result, justifications);
        }
        thread.resetMultipleValues();
        result = use_default_conditional_probability_for_sentence_in_interval(fact, time, justifyP);
        justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection.NIL != result) {
            return Values.values(result, justifications);
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 90924L)
    public static SubLObject use_type_level_distributions_for_computing_likelihood(final SubLObject fact, final SubLObject time, final SubLObject justifyP) {
        final SubLObject type_level_distribution = temporal_projection_cols.find_type_level_distribution_for_sentence(fact);
        if (temporal_projection.NIL != type_level_distribution) {
            final SubLObject assertion_time_pair = get_assertion_closest_to_given_time(fact, time);
            if (temporal_projection.NIL != assertion_time_pair) {
                final SubLObject dist_sent = cycl_utilities.formula_arg2(type_level_distribution, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject prob = cycl_utilities.formula_arg6(dist_sent, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject duration_of_interval = cycl_utilities.formula_arg5(dist_sent, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_interval);
                final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_interval, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject time_1 = cycl_utilities.formula_arg0(assertion_time_pair);
                SubLObject justifications = (SubLObject)ConsesLow.list(cycl_utilities.formula_arg1(assertion_time_pair, (SubLObject)temporal_projection.UNPROVIDED));
                final SubLObject time_elapsed = find_time_elapsed_between_time_points(time, time_1);
                final SubLObject no_of_iterations = Numbers.multiply(cycl_utilities.formula_arg1(time_elapsed, (SubLObject)temporal_projection.UNPROVIDED), quantities.convert_to_units(unit_of_duration_of_time_interval, cycl_utilities.formula_arg0(time_elapsed), value_of_duration_of_time_interval, (SubLObject)temporal_projection.UNPROVIDED));
                final SubLObject likelihood = Numbers.expt(prob, no_of_iterations);
                if (temporal_projection.NIL != justifyP) {
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(type_level_distribution));
                }
                else {
                    justifications = (SubLObject)temporal_projection.NIL;
                }
                return Values.values((SubLObject)ConsesLow.list(temporal_projection.$const0$NumericLikelihoodFn, likelihood), justifications);
            }
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 92150L)
    public static SubLObject use_default_conditional_probability_for_sentence_in_interval(final SubLObject fact, final SubLObject time, final SubLObject justifyP) {
        final SubLObject predicate = cycl_utilities.formula_arg0(fact);
        SubLObject justifications = (SubLObject)temporal_projection.NIL;
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(predicate, temporal_projection.$const60$defaultConditionalProbabilityForS, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject assertion = (SubLObject)temporal_projection.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject interval = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject prob = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject closest_assertion_time_pair = get_assertion_closest_to_given_time(fact, time);
            if (temporal_projection.NIL != closest_assertion_time_pair) {
                final SubLObject assertion_2 = cycl_utilities.formula_arg1(closest_assertion_time_pair, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject time_2 = cycl_utilities.formula_arg0(closest_assertion_time_pair);
                final SubLObject time_elapsed = find_time_elapsed_between_time_points(time, time_2);
                if (interval.eql(temporal_projection.$const32$Forever_Quantity) || temporal_projection.NIL != quantities.cyc_quantity_subsumes(interval, time_elapsed)) {
                    final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
                    final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, (SubLObject)temporal_projection.UNPROVIDED);
                    final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0(time_elapsed);
                    final SubLObject value_of_time_elapsed = cycl_utilities.formula_arg1(time_elapsed, (SubLObject)temporal_projection.UNPROVIDED);
                    final SubLObject unit_conversion = quantities.convert_to_units(unit_of_duration_of_time_interval, unit_of_time_elapsed, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED);
                    if (temporal_projection.NIL != unit_conversion && temporal_projection.NIL != value_of_time_elapsed && temporal_projection.NIL != prob && temporal_projection.NIL != value_of_duration_of_time_interval) {
                        final SubLObject likelihood = Numbers.expt(prob, Numbers.multiply(Numbers.divide(value_of_time_elapsed, value_of_duration_of_time_interval), unit_conversion));
                        if (temporal_projection.NIL != likelihood) {
                            if (temporal_projection.NIL != justifyP) {
                                justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion, assertion_2));
                                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection.$const10$timeElapsed, time, time_2, time_elapsed), temporal_projection.$const11$BaseKB));
                                return Values.values((SubLObject)ConsesLow.list(temporal_projection.$const0$NumericLikelihoodFn, likelihood), justifications);
                            }
                            return Values.values((SubLObject)ConsesLow.list(temporal_projection.$const0$NumericLikelihoodFn, likelihood));
                        }
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 94039L)
    public static SubLObject collect_intervals_from_default_conditional_probability_for_sentence_in_interval(final SubLObject fact, final SubLObject justifyP, final SubLObject upper) {
        final SubLObject predicate = cycl_utilities.formula_arg0(fact);
        final SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(predicate, temporal_projection.$const60$defaultConditionalProbabilityForS, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED));
        if (temporal_projection.NIL != assertion) {
            return collect_intervals_from_default_conditional_prob_for_sentence(fact, assertion, justifyP, upper);
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 94445L)
    public static SubLObject collect_intervals_from_default_conditional_probability_for_sentence_in_interval_single(final SubLObject fact, final SubLObject time, final SubLObject upper) {
        final SubLObject result = collect_intervals_from_forward_and_backward_distributions_for_predicates_single(fact, time, upper);
        if (temporal_projection.NIL != result) {
            return result;
        }
        final SubLObject predicate = cycl_utilities.formula_arg0(fact);
        final SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(predicate, temporal_projection.$const60$defaultConditionalProbabilityForS, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED));
        if (temporal_projection.NIL != assertion) {
            return collect_intervals_from_default_conditional_prob_for_sentence_single(fact, assertion, time, upper);
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 95011L)
    public static SubLObject collect_intervals_from_forward_and_backward_distributions_for_predicates_single(final SubLObject fact, final SubLObject time, final SubLObject upper) {
        final SubLObject predicate = cycl_utilities.formula_arg0(fact);
        final SubLObject forward_assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(predicate, temporal_projection.$const61$defaultConditionalProbabilityForS, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED));
        if (temporal_projection.NIL != forward_assertion) {
            return collect_intervals_from_forward_distributions_for_predicates_single(fact, forward_assertion, time, upper);
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 95444L)
    public static SubLObject collect_intervals_from_forward_distributions_for_predicates_single(final SubLObject fact, final SubLObject forward_distribution, final SubLObject time, final SubLObject upper) {
        final SubLObject gaf = assertions_high.gaf_formula(forward_distribution);
        final SubLObject prob = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject result = (SubLObject)temporal_projection.NIL;
        SubLObject entry = (SubLObject)temporal_projection.NIL;
        if (prob.numE((SubLObject)temporal_projection.ONE_INTEGER)) {
            SubLObject interval = (SubLObject)temporal_projection.NIL;
            interval = (SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, time);
            entry = (SubLObject)ConsesLow.list(interval, (SubLObject)ConsesLow.list(forward_distribution), (SubLObject)temporal_projection.ONE_INTEGER);
            result = (SubLObject)ConsesLow.cons(verify_result_entry(entry, fact, (SubLObject)temporal_projection.T, upper), result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 95914L)
    public static SubLObject collect_intervals_from_default_conditional_prob_for_sentence(final SubLObject fact, final SubLObject assertion, final SubLObject justifyP, final SubLObject upper) {
        if (cycl_utilities.formula_arg4(assertions_high.gaf_formula(assertion), (SubLObject)temporal_projection.UNPROVIDED).numE((SubLObject)temporal_projection.ONE_INTEGER)) {
            return get_intervals_for_always_true_sentence(fact, assertion, justifyP, upper);
        }
        return get_intervals_for_sentence_with_decaying_persistence(fact, assertion, justifyP, upper);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 96278L)
    public static SubLObject collect_intervals_from_default_conditional_prob_for_sentence_single(final SubLObject fact, final SubLObject assertion, final SubLObject time, final SubLObject upper) {
        if (cycl_utilities.formula_arg4(assertions_high.gaf_formula(assertion), (SubLObject)temporal_projection.UNPROVIDED).numE((SubLObject)temporal_projection.ONE_INTEGER)) {
            return get_intervals_for_always_true_sentence_single(fact, assertion, time, upper);
        }
        return get_intervals_for_sentence_with_decaying_persistence_single(fact, assertion, time, upper);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 96635L)
    public static SubLObject collect_intervals_from_default_conditional_prob_for_sentence_backward_from_time(final SubLObject fact, final SubLObject dist_assertion, final SubLObject time, final SubLObject justifications, final SubLObject justifyP, final SubLObject upper_threshold) {
        if (cycl_utilities.formula_arg4(assertions_high.gaf_formula(dist_assertion), (SubLObject)temporal_projection.UNPROVIDED).numL((SubLObject)temporal_projection.ONE_INTEGER)) {
            return get_intervals_for_sentence_with_decaying_persistence_backwards_in_time(fact, dist_assertion, time, justifications, justifyP, upper_threshold);
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 97012L)
    public static SubLObject collect_intervals_from_default_conditional_prob_for_sentence_forward_from_time(final SubLObject fact, final SubLObject dist_assertion, final SubLObject time, final SubLObject justifications, final SubLObject justifyP, final SubLObject upper_threshold) {
        if (cycl_utilities.formula_arg4(assertions_high.gaf_formula(dist_assertion), (SubLObject)temporal_projection.UNPROVIDED).numL((SubLObject)temporal_projection.ONE_INTEGER)) {
            return get_intervals_for_sentence_with_decaying_persistence_forward_in_time(fact, dist_assertion, time, justifications, justifyP, upper_threshold);
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 97384L)
    public static SubLObject collect_intervals_from_default_conditional_prob_of_state_forward_from_time(final SubLObject sentence, final SubLObject forward_distribution, final SubLObject time, final SubLObject justifications, final SubLObject justifyP, final SubLObject upper_threshold) {
        if (cycl_utilities.formula_arg4(assertions_high.gaf_formula(forward_distribution), (SubLObject)temporal_projection.UNPROVIDED).numL((SubLObject)temporal_projection.ONE_INTEGER)) {
            return get_intervals_for_state_with_decaying_persistence_forward_in_time(sentence, forward_distribution, time, justifications, justifyP, upper_threshold);
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 97775L)
    public static SubLObject collect_intervals_from_type_level_distributions_forward(final SubLObject sentence, final SubLObject forward_distribution, final SubLObject time, final SubLObject justifications, final SubLObject justifyP, final SubLObject upper_threshold) {
        if (cycl_utilities.formula_arg6(assertions_high.gaf_formula(forward_distribution), (SubLObject)temporal_projection.UNPROVIDED).numL((SubLObject)temporal_projection.ONE_INTEGER)) {
            return get_intervals_from_decaying_type_level_distributions_forward_in_time(sentence, forward_distribution, time, justifications, justifyP, upper_threshold);
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 98151L)
    public static SubLObject get_intervals_from_decaying_type_level_distributions_forward_in_time(final SubLObject fact, final SubLObject assertion, final SubLObject time_of_assertion, final SubLObject justifications, final SubLObject justifyP, final SubLObject upper) {
        SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
        SubLObject result_entry = (SubLObject)temporal_projection.NIL;
        final SubLObject gaf = assertions_high.gaf_formula(assertion);
        final SubLObject prob = cycl_utilities.formula_arg6(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject allowed_interval = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject unit_of_allowed_interval = cycl_utilities.formula_arg0(allowed_interval);
        final SubLObject allowed_upper_limit = cycl_utilities.formula_arg2(allowed_interval, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject duration_of_time_interval = cycl_utilities.formula_arg5(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
        final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject no_of_iterations = Numbers.multiply(value_of_duration_of_time_interval, Numbers.divide(Numbers.log(upper, (SubLObject)temporal_projection.UNPROVIDED), Numbers.log(prob, (SubLObject)temporal_projection.UNPROVIDED)));
        final SubLObject derived_upper_limit = (SubLObject)ConsesLow.list(unit_of_duration_of_time_interval, no_of_iterations);
        final SubLObject new_allowed_upper_limit = (SubLObject)ConsesLow.list(unit_of_allowed_interval, allowed_upper_limit);
        SubLObject upper_limit = (SubLObject)temporal_projection.NIL;
        SubLObject justifications_1 = (SubLObject)temporal_projection.NIL;
        final SubLObject initial_point = temporal_projection_utilities.find_first_point_of_time(time_of_assertion);
        final SubLObject final_point = temporal_projection_utilities.find_last_point_of_time(time_of_assertion);
        if (allowed_interval.eql(temporal_projection.$const32$Forever_Quantity)) {
            upper_limit = derived_upper_limit;
        }
        else if (temporal_projection.NIL != quantities.cyc_less_than_quantities(derived_upper_limit, new_allowed_upper_limit)) {
            upper_limit = derived_upper_limit;
        }
        else {
            upper_limit = new_allowed_upper_limit;
        }
        if (temporal_projection.NIL != initial_point && temporal_projection.NIL != final_point) {
            if (temporal_projection.NIL != justifyP) {
                justifications_1 = ConsesLow.append((SubLObject)ConsesLow.list(assertion), justifications);
                result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, time_of_assertion, date_utilities.date_after(final_point, upper_limit)), justifications_1, upper);
            }
            else {
                result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, time_of_assertion, date_utilities.date_after(final_point, upper_limit)), (SubLObject)temporal_projection.NIL, upper);
            }
            interval_justification_pairs = (SubLObject)ConsesLow.cons(verify_result_entry(result_entry, fact, justifyP, upper), interval_justification_pairs);
        }
        return interval_justification_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 100042L)
    public static SubLObject get_intervals_for_sentence_with_decaying_persistence_backwards_in_time(final SubLObject fact, final SubLObject assertion, final SubLObject time_of_assertion, final SubLObject justifications, final SubLObject justifyP, final SubLObject upper) {
        SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
        SubLObject result_entry = (SubLObject)temporal_projection.NIL;
        final SubLObject gaf = assertions_high.gaf_formula(assertion);
        final SubLObject prob = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject allowed_interval = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject unit_of_allowed_interval = cycl_utilities.formula_arg0(allowed_interval);
        final SubLObject allowed_lower_limit = cycl_utilities.formula_arg1(allowed_interval, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
        final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject no_of_iterations = Numbers.multiply(value_of_duration_of_time_interval, Numbers.divide(Numbers.log(prob, (SubLObject)temporal_projection.UNPROVIDED), Numbers.log(upper, (SubLObject)temporal_projection.UNPROVIDED)));
        final SubLObject derived_lower_limit = (SubLObject)ConsesLow.list(unit_of_duration_of_time_interval, no_of_iterations);
        final SubLObject new_allowed_lower_limit = (SubLObject)ConsesLow.list(unit_of_allowed_interval, allowed_lower_limit);
        SubLObject lower_limit = (SubLObject)temporal_projection.NIL;
        SubLObject justifications_1 = (SubLObject)temporal_projection.NIL;
        final SubLObject initial_point = temporal_projection_utilities.find_first_point_of_time(time_of_assertion);
        final SubLObject final_point = temporal_projection_utilities.find_last_point_of_time(time_of_assertion);
        if (allowed_interval.eql(temporal_projection.$const32$Forever_Quantity)) {
            lower_limit = derived_lower_limit;
        }
        else if (temporal_projection.NIL != quantities.cyc_less_than_quantities(new_allowed_lower_limit, derived_lower_limit)) {
            lower_limit = derived_lower_limit;
        }
        else {
            lower_limit = new_allowed_lower_limit;
        }
        if (temporal_projection.NIL != initial_point && temporal_projection.NIL != final_point) {
            if (temporal_projection.NIL != justifyP) {
                justifications_1 = ConsesLow.append((SubLObject)ConsesLow.list(assertion), justifications);
                result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, date_utilities.date_before(initial_point, lower_limit), time_of_assertion), justifications_1, upper);
            }
            else {
                result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, date_utilities.date_before(initial_point, lower_limit), time_of_assertion), (SubLObject)temporal_projection.NIL, upper);
            }
            interval_justification_pairs = (SubLObject)ConsesLow.cons(verify_result_entry(result_entry, fact, justifyP, upper), interval_justification_pairs);
        }
        return interval_justification_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 101944L)
    public static SubLObject get_intervals_for_sentence_with_decaying_persistence_forward_in_time(final SubLObject fact, final SubLObject assertion, final SubLObject time_of_assertion, final SubLObject justifications, final SubLObject justifyP, final SubLObject upper) {
        SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
        SubLObject result_entry = (SubLObject)temporal_projection.NIL;
        final SubLObject gaf = assertions_high.gaf_formula(assertion);
        final SubLObject prob = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject allowed_interval = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject unit_of_allowed_interval = cycl_utilities.formula_arg0(allowed_interval);
        final SubLObject allowed_upper_limit = cycl_utilities.formula_arg2(allowed_interval, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
        final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject no_of_iterations = Numbers.multiply(value_of_duration_of_time_interval, Numbers.divide(Numbers.log(prob, (SubLObject)temporal_projection.UNPROVIDED), Numbers.log(upper, (SubLObject)temporal_projection.UNPROVIDED)));
        final SubLObject derived_upper_limit = (SubLObject)ConsesLow.list(unit_of_duration_of_time_interval, no_of_iterations);
        final SubLObject new_allowed_upper_limit = (SubLObject)ConsesLow.list(unit_of_allowed_interval, allowed_upper_limit);
        SubLObject upper_limit = (SubLObject)temporal_projection.NIL;
        SubLObject justifications_1 = (SubLObject)temporal_projection.NIL;
        final SubLObject initial_point = temporal_projection_utilities.find_first_point_of_time(time_of_assertion);
        final SubLObject final_point = temporal_projection_utilities.find_last_point_of_time(time_of_assertion);
        if (allowed_interval.eql(temporal_projection.$const32$Forever_Quantity)) {
            upper_limit = derived_upper_limit;
        }
        else if (temporal_projection.NIL != quantities.cyc_less_than_quantities(derived_upper_limit, new_allowed_upper_limit)) {
            upper_limit = derived_upper_limit;
        }
        else {
            upper_limit = new_allowed_upper_limit;
        }
        if (temporal_projection.NIL != initial_point && temporal_projection.NIL != final_point) {
            if (temporal_projection.NIL != justifyP) {
                justifications_1 = ConsesLow.append((SubLObject)ConsesLow.list(assertion), justifications);
                result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, time_of_assertion, date_utilities.date_after(final_point, upper_limit)), justifications_1, upper);
            }
            else {
                result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, time_of_assertion, date_utilities.date_after(final_point, upper_limit)), (SubLObject)temporal_projection.NIL, upper);
            }
            interval_justification_pairs = (SubLObject)ConsesLow.cons(verify_result_entry(result_entry, fact, justifyP, upper), interval_justification_pairs);
        }
        return interval_justification_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 103836L)
    public static SubLObject get_intervals_for_state_with_decaying_persistence_forward_in_time(final SubLObject fact, final SubLObject assertion, final SubLObject time_of_assertion, final SubLObject justifications, final SubLObject justifyP, final SubLObject upper) {
        SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
        SubLObject result_entry = (SubLObject)temporal_projection.NIL;
        final SubLObject gaf = assertions_high.gaf_formula(assertion);
        final SubLObject prob = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject allowed_interval = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject unit_of_allowed_interval = cycl_utilities.formula_arg0(allowed_interval);
        final SubLObject allowed_upper_limit = cycl_utilities.formula_arg2(allowed_interval, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
        final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject no_of_iterations = Numbers.multiply(value_of_duration_of_time_interval, Numbers.divide(Numbers.log(upper, (SubLObject)temporal_projection.UNPROVIDED), Numbers.log(prob, (SubLObject)temporal_projection.UNPROVIDED)));
        final SubLObject derived_upper_limit = (SubLObject)ConsesLow.list(unit_of_duration_of_time_interval, no_of_iterations);
        final SubLObject new_allowed_upper_limit = (SubLObject)ConsesLow.list(unit_of_allowed_interval, allowed_upper_limit);
        SubLObject upper_limit = (SubLObject)temporal_projection.NIL;
        SubLObject justifications_1 = (SubLObject)temporal_projection.NIL;
        final SubLObject initial_point = temporal_projection_utilities.find_first_point_of_time(time_of_assertion);
        final SubLObject final_point = temporal_projection_utilities.find_last_point_of_time(time_of_assertion);
        if (allowed_interval.eql(temporal_projection.$const32$Forever_Quantity)) {
            upper_limit = derived_upper_limit;
        }
        else if (temporal_projection.NIL != quantities.cyc_less_than_quantities(derived_upper_limit, new_allowed_upper_limit)) {
            upper_limit = derived_upper_limit;
        }
        else {
            upper_limit = new_allowed_upper_limit;
        }
        if (temporal_projection.NIL != initial_point && temporal_projection.NIL != final_point) {
            if (temporal_projection.NIL != justifyP) {
                justifications_1 = ConsesLow.append((SubLObject)ConsesLow.list(assertion), justifications);
                result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, time_of_assertion, date_utilities.date_after(final_point, upper_limit)), justifications_1, upper);
            }
            else {
                result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, time_of_assertion, date_utilities.date_after(final_point, upper_limit)), (SubLObject)temporal_projection.NIL, upper);
            }
            interval_justification_pairs = (SubLObject)ConsesLow.cons(verify_result_entry(result_entry, fact, justifyP, upper), interval_justification_pairs);
        }
        return interval_justification_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 105724L)
    public static SubLObject get_intervals_for_sentence_with_decaying_persistence(final SubLObject fact, final SubLObject assertion, final SubLObject justifyP, final SubLObject upper) {
        final SubLObject assertions_and_time_for_fact = get_assertion_time_pairs_for_fact(fact);
        SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
        SubLObject result_entry = (SubLObject)temporal_projection.NIL;
        if (temporal_projection.NIL != assertions_and_time_for_fact) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject prob = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject allowed_interval = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject unit_of_allowed_interval = cycl_utilities.formula_arg0(allowed_interval);
            final SubLObject allowed_lower_limit = cycl_utilities.formula_arg1(allowed_interval, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject allowed_upper_limit = cycl_utilities.formula_arg2(allowed_interval, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
            final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject no_of_iterations = Numbers.multiply(value_of_duration_of_time_interval, Numbers.divide(Numbers.log(prob, (SubLObject)temporal_projection.UNPROVIDED), Numbers.log(upper, (SubLObject)temporal_projection.UNPROVIDED)));
            final SubLObject derived_lower_limit = (SubLObject)ConsesLow.list(unit_of_duration_of_time_interval, no_of_iterations);
            final SubLObject derived_upper_limit = (SubLObject)ConsesLow.list(unit_of_duration_of_time_interval, no_of_iterations);
            final SubLObject new_allowed_lower_limit = (SubLObject)ConsesLow.list(unit_of_allowed_interval, allowed_lower_limit);
            final SubLObject new_allowed_upper_limit = (SubLObject)ConsesLow.list(unit_of_allowed_interval, allowed_upper_limit);
            SubLObject lower_limit = (SubLObject)temporal_projection.NIL;
            SubLObject upper_limit = (SubLObject)temporal_projection.NIL;
            SubLObject cdolist_list_var = assertions_and_time_for_fact;
            SubLObject entry = (SubLObject)temporal_projection.NIL;
            entry = cdolist_list_var.first();
            while (temporal_projection.NIL != cdolist_list_var) {
                final SubLObject time_of_assertion = cycl_utilities.formula_arg0(entry);
                SubLObject justifications = (SubLObject)temporal_projection.NIL;
                final SubLObject assertion_1 = cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection.UNPROVIDED);
                final SubLObject initial_point = temporal_projection_utilities.find_first_point_of_time(time_of_assertion);
                final SubLObject final_point = temporal_projection_utilities.find_last_point_of_time(time_of_assertion);
                if (allowed_interval.eql(temporal_projection.$const32$Forever_Quantity)) {
                    lower_limit = derived_lower_limit;
                }
                else if (temporal_projection.NIL != quantities.cyc_less_than_quantities(new_allowed_lower_limit, derived_lower_limit)) {
                    lower_limit = derived_lower_limit;
                }
                else {
                    lower_limit = new_allowed_lower_limit;
                }
                if (allowed_interval.eql(temporal_projection.$const32$Forever_Quantity)) {
                    upper_limit = derived_upper_limit;
                }
                else if (temporal_projection.NIL != quantities.cyc_less_than_quantities(derived_upper_limit, new_allowed_upper_limit)) {
                    upper_limit = derived_upper_limit;
                }
                else {
                    upper_limit = new_allowed_upper_limit;
                }
                if (temporal_projection.NIL != initial_point && temporal_projection.NIL != final_point) {
                    if (temporal_projection.NIL != justifyP) {
                        justifications = ConsesLow.append((SubLObject)ConsesLow.list(assertion), (SubLObject)ConsesLow.list(assertion_1));
                        result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, date_utilities.date_before(initial_point, lower_limit), date_utilities.date_after(final_point, upper_limit)), justifications, upper);
                    }
                    else {
                        result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, date_utilities.date_before(initial_point, lower_limit), date_utilities.date_after(final_point, upper_limit)), (SubLObject)temporal_projection.NIL, upper);
                    }
                    interval_justification_pairs = (SubLObject)ConsesLow.cons(verify_starting_and_ending_dates_for_result_entry(result_entry, fact, justifyP, upper), interval_justification_pairs);
                }
                if (temporal_projection.NIL != initial_point && temporal_projection.NIL == final_point) {
                    if (temporal_projection.NIL != justifyP) {
                        justifications = ConsesLow.append((SubLObject)ConsesLow.list(assertion), (SubLObject)ConsesLow.list(assertion_1));
                        result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, date_utilities.date_before(initial_point, lower_limit)), justifications, upper);
                    }
                    else {
                        result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, date_utilities.date_before(initial_point, lower_limit)), (SubLObject)temporal_projection.NIL, upper);
                    }
                    interval_justification_pairs = (SubLObject)ConsesLow.cons(verify_starting_and_ending_dates_for_result_entry(result_entry, fact, justifyP, upper), interval_justification_pairs);
                }
                if (temporal_projection.NIL != final_point && temporal_projection.NIL == initial_point) {
                    if (temporal_projection.NIL != justifyP) {
                        justifications = ConsesLow.append((SubLObject)ConsesLow.list(assertion), (SubLObject)ConsesLow.list(assertion_1));
                        result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const34$IntervalEndedByFn, date_utilities.date_after(final_point, upper_limit)), justifications, upper);
                    }
                    else {
                        result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const34$IntervalEndedByFn, date_utilities.date_after(final_point, upper_limit)), (SubLObject)temporal_projection.NIL, upper);
                    }
                    interval_justification_pairs = (SubLObject)ConsesLow.cons(verify_starting_and_ending_dates_for_result_entry(result_entry, fact, justifyP, upper), interval_justification_pairs);
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        return interval_justification_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 109595L)
    public static SubLObject get_intervals_for_sentence_with_decaying_persistence_single(final SubLObject fact, final SubLObject assertion, final SubLObject time_of_assertion, final SubLObject upper) {
        SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
        SubLObject result_entry = (SubLObject)temporal_projection.NIL;
        final SubLObject gaf = assertions_high.gaf_formula(assertion);
        final SubLObject prob = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject allowed_interval = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject unit_of_allowed_interval = cycl_utilities.formula_arg0(allowed_interval);
        final SubLObject allowed_lower_limit = cycl_utilities.formula_arg1(allowed_interval, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject allowed_upper_limit = cycl_utilities.formula_arg2(allowed_interval, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
        final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject no_of_iterations = Numbers.multiply(value_of_duration_of_time_interval, Numbers.divide(Numbers.log(upper, (SubLObject)temporal_projection.UNPROVIDED), Numbers.log(prob, (SubLObject)temporal_projection.UNPROVIDED)));
        final SubLObject derived_lower_limit = (SubLObject)ConsesLow.list(unit_of_duration_of_time_interval, no_of_iterations);
        final SubLObject derived_upper_limit = (SubLObject)ConsesLow.list(unit_of_duration_of_time_interval, no_of_iterations);
        final SubLObject new_allowed_lower_limit = (SubLObject)ConsesLow.list(unit_of_allowed_interval, allowed_lower_limit);
        final SubLObject new_allowed_upper_limit = (SubLObject)ConsesLow.list(unit_of_allowed_interval, allowed_upper_limit);
        SubLObject lower_limit = (SubLObject)temporal_projection.NIL;
        SubLObject upper_limit = (SubLObject)temporal_projection.NIL;
        SubLObject justifications = (SubLObject)temporal_projection.NIL;
        final SubLObject initial_point = temporal_projection_utilities.find_first_point_of_time(time_of_assertion);
        final SubLObject final_point = temporal_projection_utilities.find_last_point_of_time(time_of_assertion);
        if (allowed_interval.eql(temporal_projection.$const32$Forever_Quantity)) {
            lower_limit = derived_lower_limit;
        }
        else if (temporal_projection.NIL != quantities.cyc_less_than_quantities(new_allowed_lower_limit, derived_lower_limit)) {
            lower_limit = derived_lower_limit;
        }
        else {
            lower_limit = new_allowed_lower_limit;
        }
        if (allowed_interval.eql(temporal_projection.$const32$Forever_Quantity)) {
            upper_limit = derived_upper_limit;
        }
        else if (temporal_projection.NIL != quantities.cyc_less_than_quantities(derived_upper_limit, new_allowed_upper_limit)) {
            upper_limit = derived_upper_limit;
        }
        else {
            upper_limit = new_allowed_upper_limit;
        }
        if (temporal_projection.NIL != initial_point && temporal_projection.NIL != final_point) {
            justifications = (SubLObject)ConsesLow.list(assertion);
            result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, date_utilities.date_before(initial_point, lower_limit), date_utilities.date_after(final_point, upper_limit)), justifications, upper);
            interval_justification_pairs = (SubLObject)ConsesLow.cons(verify_starting_and_ending_dates_for_result_entry(result_entry, fact, (SubLObject)temporal_projection.T, upper), interval_justification_pairs);
        }
        if (temporal_projection.NIL != initial_point && temporal_projection.NIL == final_point) {
            justifications = (SubLObject)ConsesLow.list(assertion);
            result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, date_utilities.date_before(initial_point, lower_limit)), justifications, upper);
            interval_justification_pairs = (SubLObject)ConsesLow.cons(verify_starting_and_ending_dates_for_result_entry(result_entry, fact, (SubLObject)temporal_projection.T, upper), interval_justification_pairs);
        }
        if (temporal_projection.NIL != final_point && temporal_projection.NIL == initial_point) {
            justifications = (SubLObject)ConsesLow.list(assertion);
            result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const34$IntervalEndedByFn, date_utilities.date_after(final_point, upper_limit)), justifications, upper);
            interval_justification_pairs = (SubLObject)ConsesLow.cons(verify_starting_and_ending_dates_for_result_entry(result_entry, fact, (SubLObject)temporal_projection.T, upper), interval_justification_pairs);
        }
        return interval_justification_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 112486L)
    public static SubLObject verify_result_entry(final SubLObject entry, final SubLObject sentence, final SubLObject justifyP, final SubLObject upper) {
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        if (predicate.eql(temporal_projection.$const5$isa)) {
            return verify_starting_and_ending_dates_for_isa_result_entry(entry, sentence, justifyP, upper);
        }
        return verify_starting_and_ending_dates_for_result_entry(entry, sentence, justifyP, upper);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 112823L)
    public static SubLObject verify_starting_and_ending_dates_for_result_entry(final SubLObject entry, final SubLObject fact, final SubLObject justifyP, final SubLObject upper_threshold) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject time = cycl_utilities.formula_arg0(entry);
        final SubLObject justifications = cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject arg1 = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject likelihood = cycl_utilities.formula_arg2(entry, (SubLObject)temporal_projection.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject interval_1 = find_known_or_expected_lifespan_of_entity(arg1, justifyP, upper_threshold, fact);
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject interval_2 = find_known_or_expected_lifespan_of_entity(arg2, justifyP, upper_threshold, fact);
        final SubLObject justification_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection.NIL != interval_1 && temporal_projection.NIL != interval_2) {
            if (temporal_projection.NIL != justifyP) {
                return Values.values((SubLObject)ConsesLow.list(hlmt_relevance.temporal_intersection_set((SubLObject)ConsesLow.list(time, interval_1, interval_2)), ConsesLow.append(justifications, justification_1, justification_2), likelihood));
            }
            return Values.values((SubLObject)ConsesLow.list(hlmt_relevance.temporal_intersection_set((SubLObject)ConsesLow.list(time, interval_1, interval_2)), (SubLObject)temporal_projection.NIL, likelihood));
        }
        else if (temporal_projection.NIL != interval_1) {
            if (temporal_projection.NIL != justifyP) {
                return Values.values((SubLObject)ConsesLow.list(hlmt_relevance.temporal_intersection_set((SubLObject)ConsesLow.list(time, interval_1)), ConsesLow.append(justifications, justification_1), likelihood));
            }
            return Values.values((SubLObject)ConsesLow.list(hlmt_relevance.temporal_intersection_set((SubLObject)ConsesLow.list(time, interval_1)), (SubLObject)temporal_projection.NIL, likelihood));
        }
        else if (temporal_projection.NIL != interval_2) {
            if (temporal_projection.NIL != justifyP) {
                return Values.values((SubLObject)ConsesLow.list(hlmt_relevance.temporal_intersection_set((SubLObject)ConsesLow.list(time, interval_2))), ConsesLow.append(justifications, justification_2), likelihood);
            }
            return Values.values((SubLObject)ConsesLow.list(hlmt_relevance.temporal_intersection_set((SubLObject)ConsesLow.list(time, interval_2)), (SubLObject)temporal_projection.NIL, likelihood));
        }
        else {
            if (!cycl_utilities.formula_arg0(entry).eql(temporal_projection.$const62$TheEmptyTimeInterval)) {
                return entry;
            }
            return (SubLObject)temporal_projection.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 114310L)
    public static SubLObject verify_starting_and_ending_dates_for_isa_result_entry(final SubLObject entry, final SubLObject sentence, final SubLObject justifyP, final SubLObject upper) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_interval = cycl_utilities.formula_arg0(entry);
        SubLObject justifications = cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject likelihood_1 = cycl_utilities.formula_arg2(entry, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject arg1 = cycl_utilities.formula_arg1(sentence, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject interval_justification_pairs_from_temporal_constraint_between_collections = collect_intervals_from_temporal_constraints_between_collections_for_negated_isa_sentence(sentence, justifyP);
        thread.resetMultipleValues();
        final SubLObject interval_1 = find_known_or_expected_lifespan_of_entity(arg1, justifyP, upper, (SubLObject)temporal_projection.NIL);
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection.NIL != interval_1) {
            current_interval = hlmt_relevance.temporal_intersection_set((SubLObject)ConsesLow.list(current_interval, interval_1));
            if (temporal_projection.NIL != justifyP) {
                justifications = ConsesLow.append(justifications, justification_1);
            }
        }
        SubLObject cdolist_list_var = interval_justification_pairs_from_temporal_constraint_between_collections;
        SubLObject interval_justification_pair = (SubLObject)temporal_projection.NIL;
        interval_justification_pair = cdolist_list_var.first();
        while (temporal_projection.NIL != cdolist_list_var) {
            final SubLObject interval = cycl_utilities.formula_arg0(interval_justification_pair);
            final SubLObject just_1 = cycl_utilities.formula_arg1(interval_justification_pair, (SubLObject)temporal_projection.UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject difference_interval = subtract_interval(current_interval, interval);
            final SubLObject changedP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection.NIL != changedP) {
                current_interval = difference_interval;
                if (temporal_projection.NIL != justifyP) {
                    justifications = ConsesLow.append(justifications, just_1);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            interval_justification_pair = cdolist_list_var.first();
        }
        if (!current_interval.eql(temporal_projection.$const62$TheEmptyTimeInterval)) {
            return (SubLObject)ConsesLow.list(current_interval, justifications, likelihood_1);
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 115733L)
    public static SubLObject subtract_interval(final SubLObject interval_1, final SubLObject interval_2) {
        if (temporal_projection.NIL != sbhl_time_query_processing.true_temporal_relation_literalP(temporal_projection.$const63$temporallyDisjoint, interval_1, interval_2, (SubLObject)temporal_projection.$kw19$POS, temporal_projection.$const11$BaseKB)) {
            return Values.values(interval_1, (SubLObject)temporal_projection.NIL);
        }
        if (temporal_projection.NIL != sbhl_time_query_processing.true_temporal_relation_literalP(temporal_projection.$const47$startsAfterStartingOf, interval_2, interval_1, (SubLObject)temporal_projection.$kw19$POS, temporal_projection.$const11$BaseKB)) {
            SubLObject temporal_function = cycl_utilities.formula_arg0(interval_1);
            final SubLObject first_point_1 = temporal_projection_utilities.find_first_point_of_time(interval_1);
            final SubLObject first_point_2 = temporal_projection_utilities.find_first_point_of_time(interval_2);
            if (temporal_projection.NIL != first_point_1 && temporal_projection.NIL != first_point_2) {
                if (temporal_function.eql(temporal_projection.$const17$TimeIntervalInclusiveFn)) {
                    temporal_function = temporal_projection.$const64$TimeInterval_Incl_Excl_Fn;
                }
                return Values.values((SubLObject)ConsesLow.list(temporal_function, first_point_1, first_point_2), (SubLObject)temporal_projection.T);
            }
        }
        return Values.values(interval_1, (SubLObject)temporal_projection.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 116601L)
    public static SubLObject find_known_or_expected_lifespan_of_entity(final SubLObject entity, final SubLObject justifyP, final SubLObject threshold, final SubLObject fact) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject starting_date = find_known_or_expected_starting_date(entity);
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject ending_date = find_known_or_expected_ending_date(entity, threshold, fact);
        final SubLObject justification_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection.NIL != starting_date && temporal_projection.NIL != ending_date) {
            if (temporal_projection.NIL != justifyP) {
                return Values.values((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, starting_date, ending_date), ConsesLow.append(justification_1, justification_2), threshold);
            }
            return Values.values((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, starting_date, ending_date), (SubLObject)temporal_projection.NIL, threshold);
        }
        else if (temporal_projection.NIL != starting_date) {
            if (temporal_projection.NIL != justifyP) {
                return Values.values((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, starting_date), justification_1, threshold);
            }
            return Values.values((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, starting_date), (SubLObject)temporal_projection.NIL, threshold);
        }
        else {
            if (temporal_projection.NIL == ending_date) {
                return (SubLObject)temporal_projection.NIL;
            }
            if (temporal_projection.NIL != justifyP) {
                return Values.values((SubLObject)ConsesLow.list(temporal_projection.$const34$IntervalEndedByFn, ending_date), justification_2, threshold);
            }
            return Values.values((SubLObject)ConsesLow.list(temporal_projection.$const34$IntervalEndedByFn, ending_date), (SubLObject)temporal_projection.NIL, threshold);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 117607L)
    public static SubLObject get_intervals_for_always_true_sentence(final SubLObject fact, final SubLObject dist_assertion, final SubLObject justifyP, final SubLObject upper_threshold) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertions_and_time_pairs_for_fact = get_assertion_time_pairs_for_fact(fact);
        SubLObject result = (SubLObject)temporal_projection.NIL;
        SubLObject cdolist_list_var = assertions_and_time_pairs_for_fact;
        SubLObject pair = (SubLObject)temporal_projection.NIL;
        pair = cdolist_list_var.first();
        while (temporal_projection.NIL != cdolist_list_var) {
            final SubLObject time = cycl_utilities.formula_arg0(pair);
            final SubLObject assertion = cycl_utilities.formula_arg1(pair, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject arg1 = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
            SubLObject lower = (SubLObject)temporal_projection.NIL;
            SubLObject upper = (SubLObject)temporal_projection.NIL;
            thread.resetMultipleValues();
            final SubLObject starting_date_1 = find_known_or_expected_starting_date(arg1);
            final SubLObject justification_1 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject starting_date_2 = find_known_or_expected_starting_date(arg2);
            final SubLObject justification_2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject ending_date_1 = find_known_or_expected_ending_date(arg1, upper_threshold, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject justification_3 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject ending_date_2 = find_known_or_expected_ending_date(arg2, upper_threshold, fact);
            final SubLObject justification_4 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            lower = find_later_date(starting_date_1, starting_date_2);
            if (temporal_projection.NIL != lower) {
                upper = find_earlier_date(ending_date_1, ending_date_2);
                if (temporal_projection.NIL != lower && temporal_projection.NIL != upper) {
                    if (temporal_projection.NIL != justifyP) {
                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, lower, upper), ConsesLow.append(new SubLObject[] { ConsesLow.list(assertion), ConsesLow.list(dist_assertion), justification_1, justification_2, justification_3, justification_4 }), (SubLObject)temporal_projection.ONE_INTEGER), result);
                    }
                    else {
                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, lower, upper), (SubLObject)temporal_projection.NIL, (SubLObject)temporal_projection.ONE_INTEGER), result);
                    }
                }
                if (temporal_projection.NIL == upper) {
                    if (temporal_projection.NIL != justifyP) {
                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, lower), ConsesLow.append(justification_1, justification_2, (SubLObject)ConsesLow.list(assertion), (SubLObject)ConsesLow.list(dist_assertion)), (SubLObject)temporal_projection.ONE_INTEGER), result);
                    }
                    else {
                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, lower), (SubLObject)temporal_projection.NIL, (SubLObject)temporal_projection.ONE_INTEGER), result);
                    }
                }
            }
            if (temporal_projection.NIL == lower) {
                if (temporal_projection.NIL != justifyP) {
                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, time), ConsesLow.append(justification_2, justification_4, (SubLObject)ConsesLow.list(dist_assertion, assertion)), (SubLObject)temporal_projection.ONE_INTEGER), result);
                }
                else {
                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, time), (SubLObject)temporal_projection.NIL, (SubLObject)temporal_projection.ONE_INTEGER), result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 119534L)
    public static SubLObject get_intervals_for_always_true_sentence_single(final SubLObject fact, final SubLObject dist_assertion, final SubLObject time, final SubLObject upper_threshold) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)temporal_projection.NIL;
        final SubLObject arg1 = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        SubLObject lower = (SubLObject)temporal_projection.NIL;
        SubLObject upper = (SubLObject)temporal_projection.NIL;
        thread.resetMultipleValues();
        final SubLObject starting_date_1 = find_known_or_expected_starting_date(arg1);
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject starting_date_2 = find_known_or_expected_starting_date(arg2);
        final SubLObject justification_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject ending_date_1 = find_known_or_expected_ending_date(arg1, upper_threshold, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject justification_3 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject ending_date_2 = find_known_or_expected_ending_date(arg2, upper_threshold, fact);
        final SubLObject justification_4 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        lower = find_later_date(starting_date_1, starting_date_2);
        if (temporal_projection.NIL != lower) {
            upper = find_earlier_date(ending_date_1, ending_date_2);
            if (temporal_projection.NIL != lower && temporal_projection.NIL != upper) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, lower, upper), ConsesLow.append(new SubLObject[] { ConsesLow.list(dist_assertion), justification_1, justification_2, justification_3, justification_4 }), (SubLObject)temporal_projection.ONE_INTEGER), result);
            }
            if (temporal_projection.NIL == upper) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, lower), ConsesLow.append(justification_1, justification_2, (SubLObject)ConsesLow.list(dist_assertion), (SubLObject)ConsesLow.list(dist_assertion)), (SubLObject)temporal_projection.ONE_INTEGER), result);
            }
            if (temporal_projection.NIL == lower) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const33$IntervalStartedByFn, time), ConsesLow.append(justification_3, justification_4, (SubLObject)ConsesLow.list(dist_assertion), (SubLObject)temporal_projection.ONE_INTEGER)), result);
            }
        }
        if (temporal_projection.NIL == lower && temporal_projection.NIL == upper && temporal_projection.NIL == isa.isaP(arg1, temporal_projection.$const8$BiologicalLivingObject, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED) && temporal_projection.NIL == isa.isaP(arg2, temporal_projection.$const8$BiologicalLivingObject, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
            result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(temporal_projection.$const36$Always_TimeInterval, (SubLObject)ConsesLow.list(dist_assertion), (SubLObject)temporal_projection.ONE_INTEGER), result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 121138L)
    public static SubLObject collect_intervals_from_initial_and_terminal_in_args_facts(final SubLObject sentence, final SubLObject upper, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
        final SubLObject initial_in_arg_assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(predicate, temporal_projection.$const65$initialInArg, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED));
        final SubLObject terminal_in_arg_assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(predicate, temporal_projection.$const66$terminalInArg, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED));
        if (temporal_projection.NIL != initial_in_arg_assertion || temporal_projection.NIL != terminal_in_arg_assertion) {
            final SubLObject assertion_time_pairs = get_assertion_time_pairs_for_fact(sentence);
            if (temporal_projection.NIL != assertion_time_pairs) {
                if (temporal_projection.NIL != initial_in_arg_assertion) {
                    final SubLObject gaf = assertions_high.gaf_formula(initial_in_arg_assertion);
                    final SubLObject arg_pos = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                    final SubLObject entity = ConsesLow.nth(arg_pos, sentence);
                    thread.resetMultipleValues();
                    final SubLObject starting_date = find_known_or_expected_starting_date(entity);
                    final SubLObject justification_1 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (temporal_projection.NIL != starting_date) {
                        SubLObject cdolist_list_var = assertion_time_pairs;
                        SubLObject pair = (SubLObject)temporal_projection.NIL;
                        pair = cdolist_list_var.first();
                        while (temporal_projection.NIL != cdolist_list_var) {
                            final SubLObject time = cycl_utilities.formula_arg0(pair);
                            final SubLObject assertion = cycl_utilities.formula_arg1(pair, (SubLObject)temporal_projection.UNPROVIDED);
                            if (temporal_projection.NIL != justifyP) {
                                interval_justification_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, starting_date, time), ConsesLow.append((SubLObject)ConsesLow.list(assertion, initial_in_arg_assertion), justification_1), (SubLObject)temporal_projection.ONE_INTEGER), interval_justification_pairs);
                            }
                            else {
                                interval_justification_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, starting_date, time), (SubLObject)temporal_projection.NIL, (SubLObject)temporal_projection.ONE_INTEGER), interval_justification_pairs);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            pair = cdolist_list_var.first();
                        }
                    }
                }
                if (temporal_projection.NIL != terminal_in_arg_assertion) {
                    final SubLObject gaf = assertions_high.gaf_formula(terminal_in_arg_assertion);
                    final SubLObject arg_pos = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
                    final SubLObject entity = ConsesLow.nth(arg_pos, sentence);
                    thread.resetMultipleValues();
                    final SubLObject ending_date = find_known_or_expected_ending_date(entity, upper, justifyP);
                    final SubLObject justification_1 = thread.secondMultipleValue();
                    final SubLObject likelihood = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (temporal_projection.NIL != ending_date) {
                        SubLObject cdolist_list_var2 = assertion_time_pairs;
                        SubLObject pair2 = (SubLObject)temporal_projection.NIL;
                        pair2 = cdolist_list_var2.first();
                        while (temporal_projection.NIL != cdolist_list_var2) {
                            final SubLObject time2 = cycl_utilities.formula_arg0(pair2);
                            final SubLObject assertion2 = cycl_utilities.formula_arg1(pair2, (SubLObject)temporal_projection.UNPROVIDED);
                            if (temporal_projection.NIL != justifyP) {
                                interval_justification_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, time2, ending_date), ConsesLow.append((SubLObject)ConsesLow.list(assertion2, terminal_in_arg_assertion), justification_1), likelihood), interval_justification_pairs);
                            }
                            else {
                                interval_justification_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, time2, ending_date), (SubLObject)temporal_projection.NIL, likelihood), interval_justification_pairs);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            pair2 = cdolist_list_var2.first();
                        }
                    }
                }
            }
            return interval_justification_pairs;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 123206L)
    public static SubLObject collect_intervals_from_initial_and_terminal_in_args_facts_single(final SubLObject sentence, final SubLObject upper, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        SubLObject interval_justification_pairs = (SubLObject)temporal_projection.NIL;
        final SubLObject initial_in_arg_assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(predicate, temporal_projection.$const65$initialInArg, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED));
        final SubLObject terminal_in_arg_assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(predicate, temporal_projection.$const66$terminalInArg, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED));
        if (temporal_projection.NIL != initial_in_arg_assertion) {
            final SubLObject gaf = assertions_high.gaf_formula(initial_in_arg_assertion);
            final SubLObject arg_pos = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject entity = ConsesLow.nth(arg_pos, sentence);
            thread.resetMultipleValues();
            final SubLObject starting_date = find_known_or_expected_starting_date(entity);
            final SubLObject justification_1 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection.NIL != starting_date) {
                interval_justification_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, starting_date, time), ConsesLow.append((SubLObject)ConsesLow.list(initial_in_arg_assertion), justification_1), (SubLObject)temporal_projection.ONE_INTEGER), interval_justification_pairs);
            }
        }
        if (temporal_projection.NIL != terminal_in_arg_assertion) {
            final SubLObject gaf = assertions_high.gaf_formula(terminal_in_arg_assertion);
            final SubLObject arg_pos = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection.UNPROVIDED);
            final SubLObject entity = ConsesLow.nth(arg_pos, sentence);
            thread.resetMultipleValues();
            final SubLObject ending_date = find_known_or_expected_ending_date(entity, upper, (SubLObject)temporal_projection.T);
            final SubLObject justification_1 = thread.secondMultipleValue();
            final SubLObject likelihood = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection.NIL != ending_date) {
                interval_justification_pairs = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection.$const17$TimeIntervalInclusiveFn, time, ending_date), ConsesLow.append((SubLObject)ConsesLow.list(terminal_in_arg_assertion), justification_1), likelihood), interval_justification_pairs);
            }
        }
        return interval_justification_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 124574L)
    public static SubLObject find_later_date(final SubLObject date_1, final SubLObject date_2) {
        if (temporal_projection.NIL == date_1) {
            return date_2;
        }
        if (temporal_projection.NIL == date_2) {
            return date_1;
        }
        if (temporal_projection.NIL != time_is_before_thanP(date_1, date_2)) {
            return date_2;
        }
        return date_1;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 124785L)
    public static SubLObject find_earlier_date(final SubLObject date_1, final SubLObject date_2) {
        if (temporal_projection.NIL == date_1) {
            return date_2;
        }
        if (temporal_projection.NIL == date_2) {
            return date_1;
        }
        if (temporal_projection.NIL != time_is_before_thanP(date_1, date_2)) {
            return date_1;
        }
        return date_2;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 125004L)
    public static SubLObject find_known_or_expected_starting_date(final SubLObject entity) {
        return lookup_starting_date_for_entity(entity);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 125119L)
    public static SubLObject find_known_or_expected_ending_date(final SubLObject entity, final SubLObject upper, SubLObject fact) {
        if (fact == temporal_projection.UNPROVIDED) {
            fact = (SubLObject)temporal_projection.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.formula_arg0(fact);
        if (temporal_projection.NIL != pred) {
            if (entity.equal(cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED)) && temporal_projection.NIL == kb_mapping_utilities.pred_u_v_holds_gafs(temporal_projection.$const38$contemporaryInArg, pred, (SubLObject)temporal_projection.TWO_INTEGER, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
                return (SubLObject)temporal_projection.NIL;
            }
            if (entity.equal(cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED)) && temporal_projection.NIL == kb_mapping_utilities.pred_u_v_holds_gafs(temporal_projection.$const38$contemporaryInArg, pred, (SubLObject)temporal_projection.ONE_INTEGER, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
                return (SubLObject)temporal_projection.NIL;
            }
        }
        thread.resetMultipleValues();
        final SubLObject ending_date = lookup_ending_date_for_entity(entity);
        SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection.NIL != ending_date) {
            return Values.values(ending_date, justifications, (SubLObject)temporal_projection.ONE_INTEGER);
        }
        if (temporal_projection.NIL != isa.isaP(entity, temporal_projection.$const67$Person, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject starting_date = lookup_starting_date_for_entity(entity);
            justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection.NIL != starting_date) {
                if (temporal_projection.NIL == temporal_projection.$extended_temporal_projection_mode$.getDynamicValue(thread)) {
                    return Values.values(date_utilities.date_after(starting_date, (SubLObject)temporal_projection.$list68), justifications, upper);
                }
                final SubLObject last_known_point_of_existence = temporal_projection_utilities.find_the_latest_known_time_point_of_existence(entity);
                if (temporal_projection.NIL != last_known_point_of_existence) {
                    final SubLObject age = date_utilities.time_elapsed(starting_date, last_known_point_of_existence, (SubLObject)temporal_projection.UNPROVIDED);
                    final SubLObject expected_life = temporal_projection_utilities.find_expected_survival_duration_at_age(age, upper);
                    return date_utilities.date_after(starting_date, expected_life);
                }
            }
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 126330L)
    public static SubLObject get_assertion_closest_to_given_time(final SubLObject fact, final SubLObject time) {
        final SubLObject assertion_time_pairs = get_assertion_time_pairs_for_fact(fact);
        if (Sequences.length(assertion_time_pairs).numE((SubLObject)temporal_projection.ONE_INTEGER)) {
            return cycl_utilities.formula_arg0(assertion_time_pairs);
        }
        if (temporal_projection.NIL != assertion_time_pairs) {
            SubLObject current_best_assertion_time_pair = cycl_utilities.formula_arg0(assertion_time_pairs);
            SubLObject current_best_time_elapsed = find_time_elapsed_between_time_points(time, cycl_utilities.formula_arg0(current_best_assertion_time_pair));
            SubLObject cdolist_list_var = cycl_utilities.formula_args(assertion_time_pairs, (SubLObject)temporal_projection.UNPROVIDED);
            SubLObject assertion_time_pair = (SubLObject)temporal_projection.NIL;
            assertion_time_pair = cdolist_list_var.first();
            while (temporal_projection.NIL != cdolist_list_var) {
                final SubLObject current_time_elapsed = find_time_elapsed_between_time_points(time, cycl_utilities.formula_arg0(assertion_time_pair));
                if (temporal_projection.NIL != quantities.cyc_less_than_quantities(current_time_elapsed, current_best_time_elapsed)) {
                    current_best_assertion_time_pair = assertion_time_pair;
                    current_best_time_elapsed = current_time_elapsed;
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion_time_pair = cdolist_list_var.first();
            }
            return current_best_assertion_time_pair;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 127279L)
    public static SubLObject get_closest_assertion_before_time(final SubLObject fact, final SubLObject time) {
        final SubLObject assertion_time_pairs = get_assertion_time_pairs_for_fact(fact);
        if (temporal_projection.NIL != assertion_time_pairs) {
            SubLObject current_best_assertion_time_pair = (SubLObject)temporal_projection.NIL;
            SubLObject current_best_time_elapsed = (SubLObject)temporal_projection.NIL;
            SubLObject cdolist_list_var = assertion_time_pairs;
            SubLObject assertion_time_pair = (SubLObject)temporal_projection.NIL;
            assertion_time_pair = cdolist_list_var.first();
            while (temporal_projection.NIL != cdolist_list_var) {
                final SubLObject time_of_assertion = cycl_utilities.formula_arg0(assertion_time_pair);
                if (temporal_projection.NIL != time_is_before_thanP(time_of_assertion, time)) {
                    if (temporal_projection.NIL != current_best_assertion_time_pair) {
                        final SubLObject current_time_elapsed = find_time_elapsed_between_time_points(time, cycl_utilities.formula_arg0(assertion_time_pair));
                        if (temporal_projection.NIL != quantities.cyc_less_than_quantities(current_time_elapsed, current_best_time_elapsed)) {
                            current_best_assertion_time_pair = assertion_time_pair;
                            current_best_time_elapsed = current_time_elapsed;
                        }
                    }
                    else {
                        current_best_assertion_time_pair = assertion_time_pair;
                        current_best_time_elapsed = find_time_elapsed_between_time_points(time, cycl_utilities.formula_arg0(assertion_time_pair));
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion_time_pair = cdolist_list_var.first();
            }
            return current_best_assertion_time_pair;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 128362L)
    public static SubLObject get_closest_assertion_after_time(final SubLObject fact, final SubLObject time) {
        final SubLObject assertion_time_pairs = get_assertion_time_pairs_for_fact(fact);
        if (temporal_projection.NIL != assertion_time_pairs) {
            SubLObject current_best_assertion_time_pair = (SubLObject)temporal_projection.NIL;
            SubLObject current_best_time_elapsed = (SubLObject)temporal_projection.NIL;
            SubLObject cdolist_list_var = assertion_time_pairs;
            SubLObject assertion_time_pair = (SubLObject)temporal_projection.NIL;
            assertion_time_pair = cdolist_list_var.first();
            while (temporal_projection.NIL != cdolist_list_var) {
                final SubLObject time_of_assertion = cycl_utilities.formula_arg0(assertion_time_pair);
                if (temporal_projection.NIL != time_is_before_thanP(time, time_of_assertion)) {
                    if (temporal_projection.NIL != current_best_assertion_time_pair) {
                        final SubLObject current_time_elapsed = find_time_elapsed_between_time_points(time, cycl_utilities.formula_arg0(assertion_time_pair));
                        if (temporal_projection.NIL != quantities.cyc_less_than_quantities(current_time_elapsed, current_best_time_elapsed)) {
                            current_best_assertion_time_pair = assertion_time_pair;
                            current_best_time_elapsed = current_time_elapsed;
                        }
                    }
                    else {
                        current_best_assertion_time_pair = assertion_time_pair;
                        current_best_time_elapsed = find_time_elapsed_between_time_points(time, cycl_utilities.formula_arg0(assertion_time_pair));
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion_time_pair = cdolist_list_var.first();
            }
            return current_best_assertion_time_pair;
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 129443L)
    public static SubLObject find_time_elapsed_between_time_points(final SubLObject time_1, final SubLObject time_2) {
        final SubLObject first_point_1 = temporal_projection_utilities.find_first_point_of_time(time_1);
        final SubLObject first_point_2 = temporal_projection_utilities.find_first_point_of_time(time_2);
        if (temporal_projection.NIL != first_point_1 && temporal_projection.NIL != first_point_2) {
            return date_utilities.time_elapsed(first_point_1, first_point_2, (SubLObject)temporal_projection.UNPROVIDED);
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 129750L)
    public static SubLObject time_is_before_thanP(final SubLObject time_1, final SubLObject time_2) {
        final SubLObject first_point_1 = temporal_projection_utilities.find_first_point_of_time(time_1);
        final SubLObject first_point_2 = temporal_projection_utilities.find_first_point_of_time(time_2);
        if (temporal_projection.NIL != first_point_1 && temporal_projection.NIL != first_point_2) {
            return date_utilities.dateL(first_point_1, first_point_2);
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 130015L)
    public static SubLObject init_temporal_projection_global_variables() {
        temporal_projection.$temporal_projection_list_of_starting_dates$.setDynamicValue((SubLObject)temporal_projection.NIL);
        temporal_projection.$temporal_projection_list_of_ending_dates$.setDynamicValue((SubLObject)temporal_projection.NIL);
        temporal_projection.$intervals_from_genls_assertions$.setDynamicValue((SubLObject)temporal_projection.NIL);
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 130254L)
    public static SubLObject update_temporal_projection_global_variables(final SubLObject fact) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (temporal_projection.NIL != temporal_projection.$temporal_projection_list_of_starting_dates$.getDynamicValue(thread) || temporal_projection.NIL != temporal_projection.$temporal_projection_list_of_ending_dates$.getDynamicValue(thread)) {
            return (SubLObject)temporal_projection.NIL;
        }
        final SubLObject arg1 = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection.UNPROVIDED);
        earliest_possible_starting_date_of_concept(arg1);
        earliest_possible_starting_date_of_concept(arg2);
        ending_date_of_concept(arg1);
        ending_date_of_concept(arg2);
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 130697L)
    public static SubLObject lookup_starting_date_for_entity(final SubLObject entity) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = temporal_projection.$temporal_projection_list_of_starting_dates$.getDynamicValue(thread);
        SubLObject entry = (SubLObject)temporal_projection.NIL;
        entry = cdolist_list_var.first();
        while (temporal_projection.NIL != cdolist_list_var) {
            if (cycl_utilities.formula_arg0(entry).equal(entity)) {
                return Values.values(cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection.UNPROVIDED), cycl_utilities.formula_arg2(entry, (SubLObject)temporal_projection.UNPROVIDED));
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 130945L)
    public static SubLObject lookup_ending_date_for_entity(final SubLObject entity) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = temporal_projection.$temporal_projection_list_of_ending_dates$.getDynamicValue(thread);
        SubLObject entry = (SubLObject)temporal_projection.NIL;
        entry = cdolist_list_var.first();
        while (temporal_projection.NIL != cdolist_list_var) {
            if (cycl_utilities.formula_arg0(entry).equal(entity)) {
                return Values.values(cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection.UNPROVIDED), cycl_utilities.formula_arg2(entry, (SubLObject)temporal_projection.UNPROVIDED));
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection.lisp", position = 131188L)
    public static SubLObject test_table_entry(final SubLObject query) {
        final SubLObject answers = Mapping.mapcar(Symbols.symbol_function((SubLObject)temporal_projection.$sym69$FORMULA_ARG0), time_intervals_for_sentence(query, temporal_projection.$const70$EverythingPSC, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED, (SubLObject)temporal_projection.UNPROVIDED));
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(query, answers), (SubLObject)temporal_projection.T);
    }
    
    public static SubLObject declare_temporal_projection_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "likelihood_of_truth_of_sentence", "LIKELIHOOD-OF-TRUTH-OF-SENTENCE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_likelihood_of_truth_of_isa_sentence", "FIND-LIKELIHOOD-OF-TRUTH-OF-ISA-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_likelihood_of_truth_of_isa_facts_by_using_decay_distributions", "FIND-LIKELIHOOD-OF-TRUTH-OF-ISA-FACTS-BY-USING-DECAY-DISTRIBUTIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_likelihood_of_isa_facts_by_using_backward_distributions", "FIND-LIKELIHOOD-OF-ISA-FACTS-BY-USING-BACKWARD-DISTRIBUTIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_likelihood_of_isa_facts_by_using_forward_distributions", "FIND-LIKELIHOOD-OF-ISA-FACTS-BY-USING-FORWARD-DISTRIBUTIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_likelihood_of_isa_facts_by_using_default_decay_distributions", "FIND-LIKELIHOOD-OF-ISA-FACTS-BY-USING-DEFAULT-DECAY-DISTRIBUTIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_likelihood_by_using_conditional_probability_of_entering_state_when_age_in_interval", "FIND-LIKELIHOOD-BY-USING-CONDITIONAL-PROBABILITY-OF-ENTERING-STATE-WHEN-AGE-IN-INTERVAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_likelihood_by_using_conditional_probability_of_leaving_state_when_age_in_interval", "FIND-LIKELIHOOD-BY-USING-CONDITIONAL-PROBABILITY-OF-LEAVING-STATE-WHEN-AGE-IN-INTERVAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_relevant_age_related_distribution_at_age", "FIND-RELEVANT-AGE-RELATED-DISTRIBUTION-AT-AGE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_relevant_age_related_distribution_at_age_2", "FIND-RELEVANT-AGE-RELATED-DISTRIBUTION-AT-AGE-2", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_time_intervals_for_negated_isa_sentence_by_conditional_probability_when_age", "COLLECT-TIME-INTERVALS-FOR-NEGATED-ISA-SENTENCE-BY-CONDITIONAL-PROBABILITY-WHEN-AGE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_time_intervals_for_negated_isa_sentence_by_conditional_probability_when_age_single", "COLLECT-TIME-INTERVALS-FOR-NEGATED-ISA-SENTENCE-BY-CONDITIONAL-PROBABILITY-WHEN-AGE-SINGLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_time_intervals_for_non_negated_isa_sentence_by_conditional_probability_when_age", "COLLECT-TIME-INTERVALS-FOR-NON-NEGATED-ISA-SENTENCE-BY-CONDITIONAL-PROBABILITY-WHEN-AGE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_time_intervals_for_non_negated_isa_sentence_by_conditional_probability_when_age_single", "COLLECT-TIME-INTERVALS-FOR-NON-NEGATED-ISA-SENTENCE-BY-CONDITIONAL-PROBABILITY-WHEN-AGE-SINGLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_likelihood_for_absorbing_states", "FIND-LIKELIHOOD-FOR-ABSORBING-STATES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_time_intervals_from_absorbing_states", "COLLECT-TIME-INTERVALS-FROM-ABSORBING-STATES", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_time_intervals_from_absorbing_states_single", "COLLECT-TIME-INTERVALS-FROM-ABSORBING-STATES-SINGLE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_likelihood_of_truth_of_non_isa_sentence", "FIND-LIKELIHOOD-OF-TRUTH-OF-NON-ISA-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "time_intervals_for_sentence", "TIME-INTERVALS-FOR-SENTENCE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "temporally_project", "TEMPORALLY-PROJECT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_time_intervals_from_state_persists_assertions", "FIND-TIME-INTERVALS-FROM-STATE-PERSISTS-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_time_intervals_from_starting_and_ending_points_of_sentence", "FIND-TIME-INTERVALS-FROM-STARTING-AND-ENDING-POINTS-OF-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_time_intervals_for_non_negated_sentence", "FIND-TIME-INTERVALS-FOR-NON-NEGATED-SENTENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_time_intervals_for_non_negated_sentence_single", "FIND-TIME-INTERVALS-FOR-NON-NEGATED-SENTENCE-SINGLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_time_intervals_for_negated_sentence", "FIND-TIME-INTERVALS-FOR-NEGATED-SENTENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_time_intervals_for_negated_sentence_single", "FIND-TIME-INTERVALS-FOR-NEGATED-SENTENCE-SINGLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_time_intervals_for_negated_isa_sentence", "FIND-TIME-INTERVALS-FOR-NEGATED-ISA-SENTENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_time_intervals_for_negated_isa_sentence_single", "FIND-TIME-INTERVALS-FOR-NEGATED-ISA-SENTENCE-SINGLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_time_intervals_for_non_negated_non_isa_sentence", "FIND-TIME-INTERVALS-FOR-NON-NEGATED-NON-ISA-SENTENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_time_intervals_for_non_negated_non_isa_sentence_single", "FIND-TIME-INTERVALS-FOR-NON-NEGATED-NON-ISA-SENTENCE-SINGLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_decay_distributions_for_predicate", "COLLECT-INTERVALS-FROM-DECAY-DISTRIBUTIONS-FOR-PREDICATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_decay_distributions_for_predicate_single", "COLLECT-INTERVALS-FROM-DECAY-DISTRIBUTIONS-FOR-PREDICATE-SINGLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_specific_distributions_for_predicate", "COLLECT-INTERVALS-FROM-SPECIFIC-DISTRIBUTIONS-FOR-PREDICATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_specific_distributions_for_predicate_single", "COLLECT-INTERVALS-FROM-SPECIFIC-DISTRIBUTIONS-FOR-PREDICATE-SINGLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "predicate_has_type_level_distributionsP", "PREDICATE-HAS-TYPE-LEVEL-DISTRIBUTIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_time_intervals_for_negated_non_isa_sentence", "FIND-TIME-INTERVALS-FOR-NEGATED-NON-ISA-SENTENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_time_intervals_for_negated_non_isa_sentence_single", "FIND-TIME-INTERVALS-FOR-NEGATED-NON-ISA-SENTENCE-SINGLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_time_intervals_for_non_negated_isa_sentence", "FIND-TIME-INTERVALS-FOR-NON-NEGATED-ISA-SENTENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_time_intervals_for_non_negated_isa_sentence_single", "FIND-TIME-INTERVALS-FOR-NON-NEGATED-ISA-SENTENCE-SINGLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_decay_distributions_for_collections", "COLLECT-INTERVALS-FROM-DECAY-DISTRIBUTIONS-FOR-COLLECTIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_decay_distributions_for_collections_single", "COLLECT-INTERVALS-FROM-DECAY-DISTRIBUTIONS-FOR-COLLECTIONS-SINGLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_forward_and_backward_distributions_for_collections", "COLLECT-INTERVALS-FROM-FORWARD-AND-BACKWARD-DISTRIBUTIONS-FOR-COLLECTIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_forward_and_backward_distributions_for_collections_single", "COLLECT-INTERVALS-FROM-FORWARD-AND-BACKWARD-DISTRIBUTIONS-FOR-COLLECTIONS-SINGLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "use_backward_distribution_for_collections", "USE-BACKWARD-DISTRIBUTION-FOR-COLLECTIONS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "use_backward_distribution_for_collections_single", "USE-BACKWARD-DISTRIBUTION-FOR-COLLECTIONS-SINGLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "use_forward_distribution_for_collections", "USE-FORWARD-DISTRIBUTION-FOR-COLLECTIONS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "use_forward_distribution_for_collections_single", "USE-FORWARD-DISTRIBUTION-FOR-COLLECTIONS-SINGLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_default_conditional_probability_statements", "COLLECT-INTERVALS-FROM-DEFAULT-CONDITIONAL-PROBABILITY-STATEMENTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_default_conditional_probability_statements_single", "COLLECT-INTERVALS-FROM-DEFAULT-CONDITIONAL-PROBABILITY-STATEMENTS-SINGLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_default_conditional_probability_statements_with_decaying_persistence", "COLLECT-INTERVALS-FROM-DEFAULT-CONDITIONAL-PROBABILITY-STATEMENTS-WITH-DECAYING-PERSISTENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_default_conditional_probability_statements_with_decaying_persistence_single", "COLLECT-INTERVALS-FROM-DEFAULT-CONDITIONAL-PROBABILITY-STATEMENTS-WITH-DECAYING-PERSISTENCE-SINGLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_starting_and_ending_dates_for_arg", "COLLECT-INTERVALS-FROM-STARTING-AND-ENDING-DATES-FOR-ARG", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_for_non_isa_facts_from_starting_and_ending_dates", "COLLECT-INTERVALS-FOR-NON-ISA-FACTS-FROM-STARTING-AND-ENDING-DATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_for_non_isa_facts_from_starting_and_ending_dates_single", "COLLECT-INTERVALS-FOR-NON-ISA-FACTS-FROM-STARTING-AND-ENDING-DATES-SINGLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_starting_and_ending_dates", "COLLECT-INTERVALS-FROM-STARTING-AND-ENDING-DATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_starting_and_ending_dates_single", "COLLECT-INTERVALS-FROM-STARTING-AND-ENDING-DATES-SINGLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "verify_starting_and_ending_times_of_isa_facts", "VERIFY-STARTING-AND-ENDING-TIMES-OF-ISA-FACTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_for_isa_facts_from_starting_and_ending_dates", "COLLECT-INTERVALS-FOR-ISA-FACTS-FROM-STARTING-AND-ENDING-DATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_for_isa_facts_from_starting_and_ending_dates_single", "COLLECT-INTERVALS-FOR-ISA-FACTS-FROM-STARTING-AND-ENDING-DATES-SINGLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "verify_starting_and_ending_times_of_non_isa_facts", "VERIFY-STARTING-AND-ENDING-TIMES-OF-NON-ISA-FACTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "verify_temporal_constraints_between_collections", "VERIFY-TEMPORAL-CONSTRAINTS-BETWEEN-COLLECTIONS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_temporal_constraints_between_collections_for_negated_isa_sentence", "COLLECT-INTERVALS-FROM-TEMPORAL-CONSTRAINTS-BETWEEN-COLLECTIONS-FOR-NEGATED-ISA-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_temporal_constraints_between_collections_for_negated_isa_sentence_single", "COLLECT-INTERVALS-FROM-TEMPORAL-CONSTRAINTS-BETWEEN-COLLECTIONS-FOR-NEGATED-ISA-SENTENCE-SINGLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "not_all_points_are_later_thanP", "NOT-ALL-POINTS-ARE-LATER-THAN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "get_assertion_time_pairs_for_fact", "GET-ASSERTION-TIME-PAIRS-FOR-FACT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "get_time_for_assertion_1", "GET-TIME-FOR-ASSERTION-1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "get_time_for_assertion_2", "GET-TIME-FOR-ASSERTION-2", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "possibly_replace_indexicals", "POSSIBLY-REPLACE-INDEXICALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "verify_temporal_relation_between_arguments", "VERIFY-TEMPORAL-RELATION-BETWEEN-ARGUMENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_temporal_relation_between_arguments_assertions_for_negated_non_isa_sentence", "COLLECT-INTERVALS-FROM-TEMPORAL-RELATION-BETWEEN-ARGUMENTS-ASSERTIONS-FOR-NEGATED-NON-ISA-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_temporal_relation_between_arguments_assertions_for_negated_non_isa_sentence_single", "COLLECT-INTERVALS-FROM-TEMPORAL-RELATION-BETWEEN-ARGUMENTS-ASSERTIONS-FOR-NEGATED-NON-ISA-SENTENCE-SINGLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "verify_genls_and_disjoint_with_constraints", "VERIFY-GENLS-AND-DISJOINT-WITH-CONSTRAINTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_disjoint_assertions", "COLLECT-INTERVALS-FROM-DISJOINT-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_disjoint_assertions_single", "COLLECT-INTERVALS-FROM-DISJOINT-ASSERTIONS-SINGLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_genls_assertions", "COLLECT-INTERVALS-FROM-GENLS-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "verify_starting_and_ending_times", "VERIFY-STARTING-AND-ENDING-TIMES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "check_starting_time_of_concept", "CHECK-STARTING-TIME-OF-CONCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "check_ending_time_of_concept", "CHECK-ENDING-TIME-OF-CONCEPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "earliest_possible_starting_date_of_concept", "EARLIEST-POSSIBLE-STARTING-DATE-OF-CONCEPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "ending_date_of_concept", "ENDING-DATE-OF-CONCEPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "get_assertions_for_fact_1", "GET-ASSERTIONS-FOR-FACT-1", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_likelihood_of_truth_of_non_isa_sentence_by_using_decay_distributions", "FIND-LIKELIHOOD-OF-TRUTH-OF-NON-ISA-SENTENCE-BY-USING-DECAY-DISTRIBUTIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "use_type_level_distributions_for_computing_likelihood", "USE-TYPE-LEVEL-DISTRIBUTIONS-FOR-COMPUTING-LIKELIHOOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "use_default_conditional_probability_for_sentence_in_interval", "USE-DEFAULT-CONDITIONAL-PROBABILITY-FOR-SENTENCE-IN-INTERVAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_default_conditional_probability_for_sentence_in_interval", "COLLECT-INTERVALS-FROM-DEFAULT-CONDITIONAL-PROBABILITY-FOR-SENTENCE-IN-INTERVAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_default_conditional_probability_for_sentence_in_interval_single", "COLLECT-INTERVALS-FROM-DEFAULT-CONDITIONAL-PROBABILITY-FOR-SENTENCE-IN-INTERVAL-SINGLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_forward_and_backward_distributions_for_predicates_single", "COLLECT-INTERVALS-FROM-FORWARD-AND-BACKWARD-DISTRIBUTIONS-FOR-PREDICATES-SINGLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_forward_distributions_for_predicates_single", "COLLECT-INTERVALS-FROM-FORWARD-DISTRIBUTIONS-FOR-PREDICATES-SINGLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_default_conditional_prob_for_sentence", "COLLECT-INTERVALS-FROM-DEFAULT-CONDITIONAL-PROB-FOR-SENTENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_default_conditional_prob_for_sentence_single", "COLLECT-INTERVALS-FROM-DEFAULT-CONDITIONAL-PROB-FOR-SENTENCE-SINGLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_default_conditional_prob_for_sentence_backward_from_time", "COLLECT-INTERVALS-FROM-DEFAULT-CONDITIONAL-PROB-FOR-SENTENCE-BACKWARD-FROM-TIME", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_default_conditional_prob_for_sentence_forward_from_time", "COLLECT-INTERVALS-FROM-DEFAULT-CONDITIONAL-PROB-FOR-SENTENCE-FORWARD-FROM-TIME", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_default_conditional_prob_of_state_forward_from_time", "COLLECT-INTERVALS-FROM-DEFAULT-CONDITIONAL-PROB-OF-STATE-FORWARD-FROM-TIME", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_type_level_distributions_forward", "COLLECT-INTERVALS-FROM-TYPE-LEVEL-DISTRIBUTIONS-FORWARD", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "get_intervals_from_decaying_type_level_distributions_forward_in_time", "GET-INTERVALS-FROM-DECAYING-TYPE-LEVEL-DISTRIBUTIONS-FORWARD-IN-TIME", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "get_intervals_for_sentence_with_decaying_persistence_backwards_in_time", "GET-INTERVALS-FOR-SENTENCE-WITH-DECAYING-PERSISTENCE-BACKWARDS-IN-TIME", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "get_intervals_for_sentence_with_decaying_persistence_forward_in_time", "GET-INTERVALS-FOR-SENTENCE-WITH-DECAYING-PERSISTENCE-FORWARD-IN-TIME", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "get_intervals_for_state_with_decaying_persistence_forward_in_time", "GET-INTERVALS-FOR-STATE-WITH-DECAYING-PERSISTENCE-FORWARD-IN-TIME", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "get_intervals_for_sentence_with_decaying_persistence", "GET-INTERVALS-FOR-SENTENCE-WITH-DECAYING-PERSISTENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "get_intervals_for_sentence_with_decaying_persistence_single", "GET-INTERVALS-FOR-SENTENCE-WITH-DECAYING-PERSISTENCE-SINGLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "verify_result_entry", "VERIFY-RESULT-ENTRY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "verify_starting_and_ending_dates_for_result_entry", "VERIFY-STARTING-AND-ENDING-DATES-FOR-RESULT-ENTRY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "verify_starting_and_ending_dates_for_isa_result_entry", "VERIFY-STARTING-AND-ENDING-DATES-FOR-ISA-RESULT-ENTRY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "subtract_interval", "SUBTRACT-INTERVAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_known_or_expected_lifespan_of_entity", "FIND-KNOWN-OR-EXPECTED-LIFESPAN-OF-ENTITY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "get_intervals_for_always_true_sentence", "GET-INTERVALS-FOR-ALWAYS-TRUE-SENTENCE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "get_intervals_for_always_true_sentence_single", "GET-INTERVALS-FOR-ALWAYS-TRUE-SENTENCE-SINGLE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_initial_and_terminal_in_args_facts", "COLLECT-INTERVALS-FROM-INITIAL-AND-TERMINAL-IN-ARGS-FACTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "collect_intervals_from_initial_and_terminal_in_args_facts_single", "COLLECT-INTERVALS-FROM-INITIAL-AND-TERMINAL-IN-ARGS-FACTS-SINGLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_later_date", "FIND-LATER-DATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_earlier_date", "FIND-EARLIER-DATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_known_or_expected_starting_date", "FIND-KNOWN-OR-EXPECTED-STARTING-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_known_or_expected_ending_date", "FIND-KNOWN-OR-EXPECTED-ENDING-DATE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "get_assertion_closest_to_given_time", "GET-ASSERTION-CLOSEST-TO-GIVEN-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "get_closest_assertion_before_time", "GET-CLOSEST-ASSERTION-BEFORE-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "get_closest_assertion_after_time", "GET-CLOSEST-ASSERTION-AFTER-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "find_time_elapsed_between_time_points", "FIND-TIME-ELAPSED-BETWEEN-TIME-POINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "time_is_before_thanP", "TIME-IS-BEFORE-THAN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "init_temporal_projection_global_variables", "INIT-TEMPORAL-PROJECTION-GLOBAL-VARIABLES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "update_temporal_projection_global_variables", "UPDATE-TEMPORAL-PROJECTION-GLOBAL-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "lookup_starting_date_for_entity", "LOOKUP-STARTING-DATE-FOR-ENTITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "lookup_ending_date_for_entity", "LOOKUP-ENDING-DATE-FOR-ENTITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection", "test_table_entry", "TEST-TABLE-ENTRY", 1, 0, false);
        return (SubLObject)temporal_projection.NIL;
    }
    
    public static SubLObject init_temporal_projection_file() {
        temporal_projection.$numeric_likelihood_fn_zero$ = SubLFiles.defparameter("*NUMERIC-LIKELIHOOD-FN-ZERO*", el_utilities.make_unary_formula(temporal_projection.$const0$NumericLikelihoodFn, (SubLObject)temporal_projection.ZERO_INTEGER));
        temporal_projection.$numeric_likelihood_fn_one$ = SubLFiles.defparameter("*NUMERIC-LIKELIHOOD-FN-ONE*", el_utilities.make_unary_formula(temporal_projection.$const0$NumericLikelihoodFn, (SubLObject)temporal_projection.ONE_INTEGER));
        temporal_projection.$temporal_projection_upper_threshold$ = SubLFiles.defparameter("*TEMPORAL-PROJECTION-UPPER-THRESHOLD*", (SubLObject)temporal_projection.$float1$0_8);
        temporal_projection.$temporal_projection_lower_threshold$ = SubLFiles.defparameter("*TEMPORAL-PROJECTION-LOWER-THRESHOLD*", (SubLObject)temporal_projection.$float2$0_2);
        temporal_projection.$temporal_projection_mode$ = SubLFiles.defparameter("*TEMPORAL-PROJECTION-MODE*", (SubLObject)temporal_projection.T);
        temporal_projection.$extended_temporal_projection_mode$ = SubLFiles.defparameter("*EXTENDED-TEMPORAL-PROJECTION-MODE*", (SubLObject)temporal_projection.NIL);
        temporal_projection.$temporal_projection_list_of_starting_dates$ = SubLFiles.defparameter("*TEMPORAL-PROJECTION-LIST-OF-STARTING-DATES*", (SubLObject)temporal_projection.NIL);
        temporal_projection.$temporal_projection_list_of_ending_dates$ = SubLFiles.defparameter("*TEMPORAL-PROJECTION-LIST-OF-ENDING-DATES*", (SubLObject)temporal_projection.NIL);
        temporal_projection.$intervals_from_genls_assertions$ = SubLFiles.defparameter("*INTERVALS-FROM-GENLS-ASSERTIONS*", (SubLObject)temporal_projection.NIL);
        return (SubLObject)temporal_projection.NIL;
    }
    
    public static SubLObject setup_temporal_projection_file() {
        utilities_macros.register_kb_function((SubLObject)temporal_projection.$sym29$TEMPORALLY_PROJECT);
        return (SubLObject)temporal_projection.NIL;
    }
    
    public void declareFunctions() {
        declare_temporal_projection_file();
    }
    
    public void initializeVariables() {
        init_temporal_projection_file();
    }
    
    public void runTopLevelForms() {
        setup_temporal_projection_file();
    }
    
    static {
        me = (SubLFile)new temporal_projection();
        temporal_projection.$numeric_likelihood_fn_zero$ = null;
        temporal_projection.$numeric_likelihood_fn_one$ = null;
        temporal_projection.$temporal_projection_upper_threshold$ = null;
        temporal_projection.$temporal_projection_lower_threshold$ = null;
        temporal_projection.$temporal_projection_mode$ = null;
        temporal_projection.$extended_temporal_projection_mode$ = null;
        temporal_projection.$temporal_projection_list_of_starting_dates$ = null;
        temporal_projection.$temporal_projection_list_of_ending_dates$ = null;
        temporal_projection.$intervals_from_genls_assertions$ = null;
        $const0$NumericLikelihoodFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NumericLikelihoodFn"));
        $float1$0_8 = (SubLFloat)SubLObjectFactory.makeDouble(0.8);
        $float2$0_2 = (SubLFloat)SubLObjectFactory.makeDouble(0.2);
        $const3$MtSpace = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtSpace"));
        $list4 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnytimePSC")));
        $const5$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym6$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $const7$TimeDependentCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeDependentCollection"));
        $const8$BiologicalLivingObject = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BiologicalLivingObject"));
        $const9$conditionalProbabilityOfStateAfte = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conditionalProbabilityOfStateAfterIntervalOfLength-Backward"));
        $const10$timeElapsed = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("timeElapsed"));
        $const11$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $const12$conditionalProbabilityOfStateAfte = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conditionalProbabilityOfStateAfterIntervalOfLength-Forward"));
        $const13$defaultConditionalProbabilityOfSt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultConditionalProbabilityOfStateAfterIntervalOfLength"));
        $const14$conditionalProbabilityOfEnteringS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conditionalProbabilityOfEnteringStateWhenAgeInInterval"));
        $const15$YearsDuration = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearsDuration"));
        $const16$conditionalProbabilityOfLeavingSt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conditionalProbabilityOfLeavingStateWhenAgeInInterval"));
        $const17$TimeIntervalInclusiveFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn"));
        $const18$temporallyIntersects = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallyIntersects"));
        $kw19$POS = SubLObjectFactory.makeKeyword("POS");
        $const20$TemporallyQualifiableRelation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporallyQualifiableRelation"));
        $const21$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $kw22$ASSERTED_TRUE_DEF = SubLObjectFactory.makeKeyword("ASSERTED-TRUE-DEF");
        $kw23$ASSERTED_TRUE_MON = SubLObjectFactory.makeKeyword("ASSERTED-TRUE-MON");
        $kw24$ASSERTED_FALSE_DEF = SubLObjectFactory.makeKeyword("ASSERTED-FALSE-DEF");
        $kw25$ASSERTED_FALSE_MON = SubLObjectFactory.makeKeyword("ASSERTED-FALSE-MON");
        $const26$startingPointOfIntervalForSentenc = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startingPointOfIntervalForSentence"));
        $const27$endingPointOfIntervalForSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endingPointOfIntervalForSentence"));
        $const28$statePersistsForDurationFromDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("statePersistsForDurationFromDate"));
        $sym29$TEMPORALLY_PROJECT = SubLObjectFactory.makeSymbol("TEMPORALLY-PROJECT");
        $const30$relevantDistributionForSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relevantDistributionForSentence"));
        $kw31$GAF = SubLObjectFactory.makeKeyword("GAF");
        $const32$Forever_Quantity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Forever-Quantity"));
        $const33$IntervalStartedByFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFn"));
        $const34$IntervalEndedByFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn"));
        $const35$conditionalProbabilityForSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conditionalProbabilityForSentenceWhenTypeInArg"));
        $const36$Always_TimeInterval = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Always-TimeInterval"));
        $const37$SecondsDuration = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondsDuration"));
        $const38$contemporaryInArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("contemporaryInArg"));
        $const39$SomethingExisting = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomethingExisting"));
        $kw40$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $const41$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $list42 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomethingExisting")));
        $list43 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BiologicalLivingObject")));
        $const44$temporallySubsumes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes"));
        $const45$laterThan = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("laterThan"));
        $const46$temporalConstraintBetweenCollecti = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporalConstraintBetweenCollections"));
        $const47$startsAfterStartingOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startsAfterStartingOf"));
        $const48$TimePoint = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimePoint"));
        $const49$Now = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Now"));
        $const50$endsAfterStartingOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endsAfterStartingOf"));
        $const51$temporalRelationBetweenArguments = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporalRelationBetweenArguments"));
        $kw52$DISJOINTWITH = SubLObjectFactory.makeKeyword("DISJOINTWITH");
        $const53$disjointWith = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $kw54$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $const55$startingDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startingDate"));
        $const56$birthDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("birthDate"));
        $const57$earliestDateForCollectionMembers = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("earliestDateForCollectionMembers"));
        $const58$dateOfDeath = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfDeath"));
        $const59$endingDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endingDate"));
        $const60$defaultConditionalProbabilityForS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultConditionalProbabilityForSentenceInInterval"));
        $const61$defaultConditionalProbabilityForS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultConditionalProbabilityForSentenceInInterval-Forward"));
        $const62$TheEmptyTimeInterval = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheEmptyTimeInterval"));
        $const63$temporallyDisjoint = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallyDisjoint"));
        $const64$TimeInterval_Incl_Excl_Fn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeInterval-Incl-Excl-Fn"));
        $const65$initialInArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("initialInArg"));
        $const66$terminalInArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("terminalInArg"));
        $const67$Person = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"));
        $list68 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearsDuration")), (SubLObject)SubLObjectFactory.makeInteger(75));
        $sym69$FORMULA_ARG0 = SubLObjectFactory.makeSymbol("FORMULA-ARG0");
        $const70$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
    }
}

/*

	Total time: 1141 ms
	
*/