package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.log;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class temporal_projection extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new temporal_projection();



    // defparameter
    public static final SubLSymbol $numeric_likelihood_fn_zero$ = makeSymbol("*NUMERIC-LIKELIHOOD-FN-ZERO*");

    // defparameter
    public static final SubLSymbol $numeric_likelihood_fn_one$ = makeSymbol("*NUMERIC-LIKELIHOOD-FN-ONE*");

    // defparameter
    public static final SubLSymbol $temporal_projection_upper_threshold$ = makeSymbol("*TEMPORAL-PROJECTION-UPPER-THRESHOLD*");

    // defparameter
    public static final SubLSymbol $temporal_projection_lower_threshold$ = makeSymbol("*TEMPORAL-PROJECTION-LOWER-THRESHOLD*");

    // defparameter
    public static final SubLSymbol $temporal_projection_mode$ = makeSymbol("*TEMPORAL-PROJECTION-MODE*");

    // defparameter
    public static final SubLSymbol $extended_temporal_projection_mode$ = makeSymbol("*EXTENDED-TEMPORAL-PROJECTION-MODE*");

    // defparameter
    public static final SubLSymbol $temporal_projection_list_of_starting_dates$ = makeSymbol("*TEMPORAL-PROJECTION-LIST-OF-STARTING-DATES*");

    // defparameter
    public static final SubLSymbol $temporal_projection_list_of_ending_dates$ = makeSymbol("*TEMPORAL-PROJECTION-LIST-OF-ENDING-DATES*");

    // defparameter
    public static final SubLSymbol $intervals_from_genls_assertions$ = makeSymbol("*INTERVALS-FROM-GENLS-ASSERTIONS*");

    private static final SubLObject $$NumericLikelihoodFn = reader_make_constant_shell(makeString("NumericLikelihoodFn"));

    private static final SubLFloat $float$0_8 = makeDouble(0.8);

    private static final SubLFloat $float$0_2 = makeDouble(0.2);

    private static final SubLObject $$MtSpace = reader_make_constant_shell(makeString("MtSpace"));

    private static final SubLList $list4 = list(reader_make_constant_shell(makeString("AnytimePSC")));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLSymbol $sym6$_EXIT = makeSymbol("%EXIT");

    private static final SubLObject $$TimeDependentCollection = reader_make_constant_shell(makeString("TimeDependentCollection"));

    private static final SubLObject $$BiologicalLivingObject = reader_make_constant_shell(makeString("BiologicalLivingObject"));

    private static final SubLObject $const9$conditionalProbabilityOfStateAfte = reader_make_constant_shell(makeString("conditionalProbabilityOfStateAfterIntervalOfLength-Backward"));

    private static final SubLObject $$timeElapsed = reader_make_constant_shell(makeString("timeElapsed"));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLObject $const12$conditionalProbabilityOfStateAfte = reader_make_constant_shell(makeString("conditionalProbabilityOfStateAfterIntervalOfLength-Forward"));

    private static final SubLObject $const13$defaultConditionalProbabilityOfSt = reader_make_constant_shell(makeString("defaultConditionalProbabilityOfStateAfterIntervalOfLength"));

    private static final SubLObject $const14$conditionalProbabilityOfEnteringS = reader_make_constant_shell(makeString("conditionalProbabilityOfEnteringStateWhenAgeInInterval"));

    private static final SubLObject $$YearsDuration = reader_make_constant_shell(makeString("YearsDuration"));

    private static final SubLObject $const16$conditionalProbabilityOfLeavingSt = reader_make_constant_shell(makeString("conditionalProbabilityOfLeavingStateWhenAgeInInterval"));

    private static final SubLObject $$TimeIntervalInclusiveFn = reader_make_constant_shell(makeString("TimeIntervalInclusiveFn"));

    private static final SubLObject $$temporallyIntersects = reader_make_constant_shell(makeString("temporallyIntersects"));



    private static final SubLObject $$TemporallyQualifiableRelation = reader_make_constant_shell(makeString("TemporallyQualifiableRelation"));

    private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));

    private static final SubLSymbol $ASSERTED_TRUE_DEF = makeKeyword("ASSERTED-TRUE-DEF");

    private static final SubLSymbol $ASSERTED_TRUE_MON = makeKeyword("ASSERTED-TRUE-MON");

    private static final SubLSymbol $ASSERTED_FALSE_DEF = makeKeyword("ASSERTED-FALSE-DEF");

    private static final SubLSymbol $ASSERTED_FALSE_MON = makeKeyword("ASSERTED-FALSE-MON");

    private static final SubLObject $const26$startingPointOfIntervalForSentenc = reader_make_constant_shell(makeString("startingPointOfIntervalForSentence"));

    private static final SubLObject $$endingPointOfIntervalForSentence = reader_make_constant_shell(makeString("endingPointOfIntervalForSentence"));

    private static final SubLObject $$statePersistsForDurationFromDate = reader_make_constant_shell(makeString("statePersistsForDurationFromDate"));

    private static final SubLSymbol TEMPORALLY_PROJECT = makeSymbol("TEMPORALLY-PROJECT");

    private static final SubLObject $$relevantDistributionForSentence = reader_make_constant_shell(makeString("relevantDistributionForSentence"));



    private static final SubLObject $$Forever_Quantity = reader_make_constant_shell(makeString("Forever-Quantity"));

    private static final SubLObject $$IntervalStartedByFn = reader_make_constant_shell(makeString("IntervalStartedByFn"));

    private static final SubLObject $$IntervalEndedByFn = reader_make_constant_shell(makeString("IntervalEndedByFn"));

    private static final SubLObject $const35$conditionalProbabilityForSentence = reader_make_constant_shell(makeString("conditionalProbabilityForSentenceWhenTypeInArg"));

    private static final SubLObject $$Always_TimeInterval = reader_make_constant_shell(makeString("Always-TimeInterval"));

    private static final SubLObject $$SecondsDuration = reader_make_constant_shell(makeString("SecondsDuration"));

    private static final SubLObject $$contemporaryInArg = reader_make_constant_shell(makeString("contemporaryInArg"));

    private static final SubLObject $$SomethingExisting = reader_make_constant_shell(makeString("SomethingExisting"));



    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLList $list42 = list(reader_make_constant_shell(makeString("SomethingExisting")));

    private static final SubLList $list43 = list(reader_make_constant_shell(makeString("BiologicalLivingObject")));

    private static final SubLObject $$temporallySubsumes = reader_make_constant_shell(makeString("temporallySubsumes"));

    private static final SubLObject $$laterThan = reader_make_constant_shell(makeString("laterThan"));

    private static final SubLObject $const46$temporalConstraintBetweenCollecti = reader_make_constant_shell(makeString("temporalConstraintBetweenCollections"));

    private static final SubLObject $$startsAfterStartingOf = reader_make_constant_shell(makeString("startsAfterStartingOf"));

    private static final SubLObject $$TimePoint = reader_make_constant_shell(makeString("TimePoint"));

    private static final SubLObject $$Now = reader_make_constant_shell(makeString("Now"));

    private static final SubLObject $$endsAfterStartingOf = reader_make_constant_shell(makeString("endsAfterStartingOf"));

    private static final SubLObject $$temporalRelationBetweenArguments = reader_make_constant_shell(makeString("temporalRelationBetweenArguments"));



    private static final SubLObject $$disjointWith = reader_make_constant_shell(makeString("disjointWith"));



    private static final SubLObject $$startingDate = reader_make_constant_shell(makeString("startingDate"));

    private static final SubLObject $$birthDate = reader_make_constant_shell(makeString("birthDate"));

    private static final SubLObject $$earliestDateForCollectionMembers = reader_make_constant_shell(makeString("earliestDateForCollectionMembers"));

    private static final SubLObject $$dateOfDeath = reader_make_constant_shell(makeString("dateOfDeath"));

    private static final SubLObject $$endingDate = reader_make_constant_shell(makeString("endingDate"));

    private static final SubLObject $const60$defaultConditionalProbabilityForS = reader_make_constant_shell(makeString("defaultConditionalProbabilityForSentenceInInterval"));

    private static final SubLObject $const61$defaultConditionalProbabilityForS = reader_make_constant_shell(makeString("defaultConditionalProbabilityForSentenceInInterval-Forward"));

    private static final SubLObject $$TheEmptyTimeInterval = reader_make_constant_shell(makeString("TheEmptyTimeInterval"));

    private static final SubLObject $$temporallyDisjoint = reader_make_constant_shell(makeString("temporallyDisjoint"));

    private static final SubLObject $$TimeInterval_Incl_Excl_Fn = reader_make_constant_shell(makeString("TimeInterval-Incl-Excl-Fn"));

    private static final SubLObject $$initialInArg = reader_make_constant_shell(makeString("initialInArg"));

    private static final SubLObject $$terminalInArg = reader_make_constant_shell(makeString("terminalInArg"));

    private static final SubLObject $$Person = reader_make_constant_shell(makeString("Person"));

    private static final SubLList $list68 = list(reader_make_constant_shell(makeString("YearsDuration")), makeInteger(75));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    public static SubLObject likelihood_of_truth_of_sentence(final SubLObject fact, SubLObject mt, SubLObject justifyP) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $temporal_projection_mode$.getDynamicValue(thread)) {
            init_temporal_projection_global_variables();
            final SubLObject monad_mt = temporal_projection_utilities.get_monad_mt(mt);
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(listS($$MtSpace, monad_mt, $list4));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (mt.isList()) {
                    final SubLObject mt_time = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(mt, UNPROVIDED), UNPROVIDED);
                    if (NIL != mt_time) {
                        final SubLObject predicate = cycl_utilities.formula_arg0(fact);
                        update_temporal_projection_global_variables(fact);
                        if (predicate.eql($$isa)) {
                            thread.resetMultipleValues();
                            final SubLObject result = find_likelihood_of_truth_of_isa_sentence(fact, mt_time, justifyP);
                            final SubLObject justifications = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL == result) {
                                return values(NIL, NIL);
                            }
                            if (NIL != justifyP) {
                                return values(result, justifications);
                            }
                            return values(result, NIL);
                        } else {
                            thread.resetMultipleValues();
                            final SubLObject result = find_likelihood_of_truth_of_non_isa_sentence(fact, mt_time, justifyP);
                            final SubLObject justifications = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != result) {
                                if (NIL != justifyP) {
                                    return values(result, justifications);
                                }
                                return values(result, NIL);
                            }
                        }
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject find_likelihood_of_truth_of_isa_sentence(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        if (NIL != isa.isaP(col, $$TimeDependentCollection, UNPROVIDED, UNPROVIDED)) {
            thread.resetMultipleValues();
            SubLObject result = verify_starting_and_ending_times(fact, mt_time);
            SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != result) {
                if (NIL != justifyP) {
                    return values(result, justifications);
                }
                return result;
            } else {
                thread.resetMultipleValues();
                result = verify_genls_and_disjoint_with_constraints(fact, mt_time, justifyP);
                justifications = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != result) {
                    return values(result, justifications);
                }
                thread.resetMultipleValues();
                result = verify_temporal_constraints_between_collections(fact, mt_time, justifyP);
                justifications = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != result) {
                    if (NIL != justifyP) {
                        return values(result, justifications);
                    }
                    return result;
                } else {
                    thread.resetMultipleValues();
                    result = find_likelihood_for_absorbing_states(fact, mt_time, justifyP);
                    justifications = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != result) {
                        return values(result, justifications);
                    }
                    if (col.eql($$BiologicalLivingObject)) {
                        thread.resetMultipleValues();
                        result = temporal_projection_utilities.find_likelihood_of_survival_of_spec(fact, mt_time, justifyP);
                        justifications = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != result) {
                            return values(result, justifications);
                        }
                    }
                    thread.resetMultipleValues();
                    result = find_likelihood_by_using_conditional_probability_of_entering_state_when_age_in_interval(fact, mt_time, justifyP);
                    justifications = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != result) {
                        return values(result, justifications);
                    }
                    thread.resetMultipleValues();
                    result = find_likelihood_by_using_conditional_probability_of_leaving_state_when_age_in_interval(fact, mt_time, justifyP);
                    justifications = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != result) {
                        return values(result, justifications);
                    }
                    thread.resetMultipleValues();
                    result = find_likelihood_of_truth_of_isa_facts_by_using_decay_distributions(fact, mt_time, justifyP);
                    justifications = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != result) {
                        return values(result, justifications);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject find_likelihood_of_truth_of_isa_facts_by_using_decay_distributions(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject result = find_likelihood_of_isa_facts_by_using_forward_distributions(fact, mt_time, justifyP);
        SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != result) {
            return values(result, justifications);
        }
        thread.resetMultipleValues();
        result = find_likelihood_of_isa_facts_by_using_backward_distributions(fact, mt_time, justifyP);
        justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != result) {
            return values(result, justifications);
        }
        thread.resetMultipleValues();
        result = find_likelihood_of_isa_facts_by_using_default_decay_distributions(fact, mt_time, justifyP);
        justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != result) {
            return values(result, justifications);
        }
        return NIL;
    }

    public static SubLObject find_likelihood_of_isa_facts_by_using_backward_distributions(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLObject col = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        final SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, $const9$conditionalProbabilityOfStateAfte, UNPROVIDED, UNPROVIDED));
        if (NIL != assertion) {
            final SubLObject assertion_time_pair = get_closest_assertion_after_time(fact, mt_time);
            if (NIL != assertion_time_pair) {
                final SubLObject time = cycl_utilities.formula_arg0(assertion_time_pair);
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject prob = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
                SubLObject justifications = NIL;
                final SubLObject duration_of_time_interval = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
                final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
                final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, UNPROVIDED);
                final SubLObject justification_1 = cycl_utilities.formula_arg1(assertion_time_pair, UNPROVIDED);
                final SubLObject time_elapsed = find_time_elapsed_between_time_points(time, mt_time);
                final SubLObject no_of_iterations = multiply(cycl_utilities.formula_arg1(time_elapsed, UNPROVIDED), quantities.convert_to_units(unit_of_duration_of_time_interval, cycl_utilities.formula_arg0(time_elapsed), value_of_duration_of_time_interval, UNPROVIDED));
                final SubLObject computed_prob = expt(prob, no_of_iterations);
                final SubLObject likelihood = list($$NumericLikelihoodFn, computed_prob);
                if (NIL != justifyP) {
                    justifications = append(list(assertion), list(justification_1), plausibility_utilities.hl_justify_asent_fast(list($$timeElapsed, time, mt_time, time_elapsed), $$BaseKB));
                }
                return values(likelihood, justifications);
            }
        }
        return NIL;
    }

    public static SubLObject find_likelihood_of_isa_facts_by_using_forward_distributions(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLObject col = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        final SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, $const12$conditionalProbabilityOfStateAfte, UNPROVIDED, UNPROVIDED));
        if (NIL != assertion) {
            final SubLObject assertion_time_pair = get_closest_assertion_before_time(fact, mt_time);
            if (NIL != assertion_time_pair) {
                final SubLObject time = cycl_utilities.formula_arg0(assertion_time_pair);
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject prob = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
                SubLObject justifications = NIL;
                final SubLObject duration_of_time_interval = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
                final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
                final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, UNPROVIDED);
                final SubLObject justification_1 = cycl_utilities.formula_arg1(assertion_time_pair, UNPROVIDED);
                final SubLObject time_elapsed = find_time_elapsed_between_time_points(time, mt_time);
                final SubLObject no_of_iterations = multiply(cycl_utilities.formula_arg1(time_elapsed, UNPROVIDED), quantities.convert_to_units(unit_of_duration_of_time_interval, cycl_utilities.formula_arg0(time_elapsed), value_of_duration_of_time_interval, UNPROVIDED));
                final SubLObject computed_prob = expt(prob, no_of_iterations);
                final SubLObject likelihood = list($$NumericLikelihoodFn, computed_prob);
                if (NIL != justifyP) {
                    justifications = append(list(assertion), list(justification_1), plausibility_utilities.hl_justify_asent_fast(list($$timeElapsed, time, mt_time, time_elapsed), $$BaseKB));
                }
                return values(likelihood, justifications);
            }
        }
        return NIL;
    }

    public static SubLObject find_likelihood_of_isa_facts_by_using_default_decay_distributions(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLObject col = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        final SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, $const13$defaultConditionalProbabilityOfSt, UNPROVIDED, UNPROVIDED));
        final SubLObject assertion_time_pair = get_assertion_closest_to_given_time(fact, mt_time);
        if ((NIL != assertion_time_pair) && (NIL != assertion)) {
            final SubLObject time = cycl_utilities.formula_arg0(assertion_time_pair);
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject prob = cycl_utilities.formula_arg4(gaf, UNPROVIDED);
            SubLObject justifications = NIL;
            final SubLObject allowed_interval = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
            final SubLObject unit_of_allowed_interval = cycl_utilities.formula_arg0(allowed_interval);
            final SubLObject allowed_lower_limit = cycl_utilities.formula_arg1(allowed_interval, UNPROVIDED);
            final SubLObject allowed_upper_limit = cycl_utilities.formula_arg2(allowed_interval, UNPROVIDED);
            final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
            final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
            final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, UNPROVIDED);
            final SubLObject justification_1 = cycl_utilities.formula_arg1(assertion_time_pair, UNPROVIDED);
            final SubLObject time_elapsed = find_time_elapsed_between_time_points(time, mt_time);
            if ((NIL != quantities.cyc_less_than_quantities(time_elapsed, list(unit_of_allowed_interval, allowed_upper_limit))) && (NIL != arithmetic.cyc_less_than_or_equal_to(list(unit_of_allowed_interval, allowed_lower_limit), time_elapsed))) {
                final SubLObject no_of_iterations = multiply(cycl_utilities.formula_arg1(time_elapsed, UNPROVIDED), quantities.convert_to_units(unit_of_duration_of_time_interval, cycl_utilities.formula_arg0(time_elapsed), value_of_duration_of_time_interval, UNPROVIDED));
                final SubLObject computed_prob = expt(prob, no_of_iterations);
                final SubLObject likelihood = list($$NumericLikelihoodFn, computed_prob);
                if (NIL != justifyP) {
                    justifications = append(list(assertion), list(justification_1), plausibility_utilities.hl_justify_asent_fast(list($$timeElapsed, time, mt_time, time_elapsed), $$BaseKB));
                }
                return values(likelihood, justifications);
            }
        }
        return NIL;
    }

    public static SubLObject find_likelihood_by_using_conditional_probability_of_entering_state_when_age_in_interval(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        final SubLObject instance = cycl_utilities.formula_arg1(fact, UNPROVIDED);
        SubLObject justifications = NIL;
        SubLObject prob_of_not_entering = ONE_INTEGER;
        thread.resetMultipleValues();
        final SubLObject birth_date = lookup_starting_date_for_entity(instance);
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != justifyP) {
            justifications = append(justifications, justification_1);
        }
        if (NIL != birth_date) {
            final SubLObject assertions = kb_mapping_utilities.pred_value_gafs(col, $const14$conditionalProbabilityOfEnteringS, TWO_INTEGER, UNPROVIDED);
            if (NIL != assertions) {
                final SubLObject age_at_mt_time = find_time_elapsed_between_time_points(mt_time, birth_date);
                if (NIL != age_at_mt_time) {
                    SubLObject age_in_correct_units;
                    SubLObject age;
                    SubLObject relevant_assertion;
                    SubLObject gaf;
                    SubLObject prob;
                    SubLObject item_var;
                    for (age_in_correct_units = quantities.convert_to_units($$YearsDuration, cycl_utilities.formula_arg0(age_at_mt_time), cycl_utilities.formula_arg1(age_at_mt_time, UNPROVIDED), UNPROVIDED), age = NIL, age = ZERO_INTEGER; age.numL(age_in_correct_units); age = add(age, ONE_INTEGER)) {
                        relevant_assertion = find_relevant_age_related_distribution_at_age(assertions, age, instance);
                        if (NIL == relevant_assertion) {
                            return NIL;
                        }
                        if (NIL != relevant_assertion) {
                            gaf = assertions_high.gaf_formula(relevant_assertion);
                            prob = cycl_utilities.formula_arg5(gaf, UNPROVIDED);
                            prob_of_not_entering = multiply(prob_of_not_entering, subtract(ONE_INTEGER, prob));
                            if (NIL != justifyP) {
                                item_var = relevant_assertion;
                                if (NIL == member(item_var, justifications, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                    justifications = cons(item_var, justifications);
                                }
                            }
                        }
                    }
                    if (NIL != justifyP) {
                        return values(list($$NumericLikelihoodFn, subtract(ONE_INTEGER, prob_of_not_entering)), justifications);
                    }
                    return values(list($$NumericLikelihoodFn, subtract(ONE_INTEGER, prob_of_not_entering)), NIL);
                }
            }
        }
        return NIL;
    }

    public static SubLObject find_likelihood_by_using_conditional_probability_of_leaving_state_when_age_in_interval(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        final SubLObject instance = cycl_utilities.formula_arg1(fact, UNPROVIDED);
        SubLObject justifications = NIL;
        SubLObject prob_of_not_leaving = ONE_INTEGER;
        thread.resetMultipleValues();
        final SubLObject birth_date = lookup_starting_date_for_entity(instance);
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != justifyP) {
            justifications = append(justifications, justification_1);
        }
        if (NIL != birth_date) {
            final SubLObject assertions = kb_mapping_utilities.pred_value_gafs(col, $const16$conditionalProbabilityOfLeavingSt, ONE_INTEGER, UNPROVIDED);
            if (NIL != assertions) {
                final SubLObject closest_assertion_time_pair = get_closest_assertion_before_time(fact, mt_time);
                if (NIL != closest_assertion_time_pair) {
                    final SubLObject time_of_most_recent_assertion = cycl_utilities.formula_arg0(closest_assertion_time_pair);
                    final SubLObject age_at_time_of_most_recent_assertion = find_time_elapsed_between_time_points(birth_date, time_of_most_recent_assertion);
                    if (NIL != age_at_time_of_most_recent_assertion) {
                        final SubLObject age_at_time_of_most_recent_assertion_in_correct_units = quantities.convert_to_units($$YearsDuration, cycl_utilities.formula_arg0(age_at_time_of_most_recent_assertion), cycl_utilities.formula_arg1(age_at_time_of_most_recent_assertion, UNPROVIDED), UNPROVIDED);
                        final SubLObject age_at_mt_time = find_time_elapsed_between_time_points(birth_date, mt_time);
                        if (NIL != age_at_mt_time) {
                            final SubLObject age_at_mt_time_in_correct_units = quantities.convert_to_units($$YearsDuration, cycl_utilities.formula_arg0(age_at_mt_time), cycl_utilities.formula_arg1(age_at_mt_time, UNPROVIDED), UNPROVIDED);
                            if (NIL != justifyP) {
                                justifications = append(justifications, list(cycl_utilities.formula_arg1(closest_assertion_time_pair, UNPROVIDED)));
                            }
                            SubLObject count;
                            SubLObject relevant_assertion;
                            SubLObject gaf;
                            SubLObject prob;
                            SubLObject item_var;
                            for (count = NIL, count = ZERO_INTEGER; count.numL(age_at_mt_time_in_correct_units); count = add(count, ONE_INTEGER)) {
                                if (count.numGE(age_at_time_of_most_recent_assertion_in_correct_units) && count.numL(age_at_mt_time_in_correct_units)) {
                                    relevant_assertion = find_relevant_age_related_distribution_at_age_2(assertions, count);
                                    if (NIL == relevant_assertion) {
                                        return NIL;
                                    }
                                    if (NIL != relevant_assertion) {
                                        gaf = assertions_high.gaf_formula(relevant_assertion);
                                        prob = cycl_utilities.formula_arg4(gaf, UNPROVIDED);
                                        prob_of_not_leaving = multiply(prob_of_not_leaving, subtract(ONE_INTEGER, prob));
                                        if (NIL != justifyP) {
                                            item_var = relevant_assertion;
                                            if (NIL == member(item_var, justifications, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                justifications = cons(item_var, justifications);
                                            }
                                        }
                                    }
                                }
                            }
                            if (NIL != justifyP) {
                                return values(list($$NumericLikelihoodFn, prob_of_not_leaving), justifications);
                            }
                            return values(list($$NumericLikelihoodFn, prob_of_not_leaving), NIL);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject find_relevant_age_related_distribution_at_age(final SubLObject assertions, final SubLObject age, final SubLObject instance) {
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject relevant_col = cycl_utilities.formula_arg1(gaf, UNPROVIDED);
            if (NIL != isa.isaP(instance, relevant_col, UNPROVIDED, UNPROVIDED)) {
                final SubLObject age_interval = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
                final SubLObject unit = cycl_utilities.formula_arg0(age_interval);
                final SubLObject lower = cycl_utilities.formula_arg1(age_interval, UNPROVIDED);
                final SubLObject upper = cycl_utilities.formula_arg2(age_interval, UNPROVIDED);
                if ((unit.eql($$YearsDuration) && lower.numLE(age)) && age.numL(upper)) {
                    return assertion;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject find_relevant_age_related_distribution_at_age_2(final SubLObject assertions, final SubLObject age) {
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject age_interval = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
            final SubLObject unit = cycl_utilities.formula_arg0(age_interval);
            final SubLObject lower = cycl_utilities.formula_arg1(age_interval, UNPROVIDED);
            final SubLObject upper = cycl_utilities.formula_arg2(age_interval, UNPROVIDED);
            if ((unit.eql($$YearsDuration) && lower.numLE(age)) && age.numL(upper)) {
                return assertion;
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject collect_time_intervals_for_negated_isa_sentence_by_conditional_probability_when_age(final SubLObject fact, final SubLObject lower_threshold, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        final SubLObject instance = cycl_utilities.formula_arg1(fact, UNPROVIDED);
        SubLObject result_justification_pairs = NIL;
        thread.resetMultipleValues();
        final SubLObject date = lookup_starting_date_for_entity(instance);
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != date) {
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(col, $const14$conditionalProbabilityOfEnteringS, TWO_INTEGER, UNPROVIDED);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject relevant_col = cycl_utilities.formula_arg1(gaf, UNPROVIDED);
                if (NIL != isa.isaP(instance, relevant_col, UNPROVIDED, UNPROVIDED)) {
                    SubLObject entry = NIL;
                    final SubLObject age_interval = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
                    final SubLObject age_unit = cycl_utilities.formula_arg0(age_interval);
                    final SubLObject age_lower_bound = list(age_unit, cycl_utilities.formula_arg1(age_interval, UNPROVIDED));
                    final SubLObject age_upper_bound = list(age_unit, cycl_utilities.formula_arg2(age_interval, UNPROVIDED));
                    final SubLObject prob = cycl_utilities.formula_arg5(gaf, UNPROVIDED);
                    if (prob.numL(lower_threshold)) {
                        final SubLObject lower_bound = date_utilities.date_after(date, age_lower_bound);
                        final SubLObject upper_bound = date_utilities.date_after(date, age_upper_bound);
                        if (NIL != justifyP) {
                            entry = list(list($$TimeIntervalInclusiveFn, lower_bound, upper_bound), append(list(assertion), justification_1), subtract(ONE_INTEGER, prob));
                        } else {
                            entry = list(list($$TimeIntervalInclusiveFn, lower_bound, upper_bound), NIL, subtract(ONE_INTEGER, prob));
                        }
                        result_justification_pairs = cons(entry, result_justification_pairs);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        }
        return result_justification_pairs;
    }

    public static SubLObject collect_time_intervals_for_negated_isa_sentence_by_conditional_probability_when_age_single(final SubLObject fact, final SubLObject lower_threshold, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        final SubLObject instance = cycl_utilities.formula_arg1(fact, UNPROVIDED);
        SubLObject result_justification_pairs = NIL;
        thread.resetMultipleValues();
        final SubLObject date = lookup_starting_date_for_entity(instance);
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != date) {
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(col, $const14$conditionalProbabilityOfEnteringS, TWO_INTEGER, UNPROVIDED);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject relevant_col = cycl_utilities.formula_arg1(gaf, UNPROVIDED);
                if (NIL != isa.isaP(instance, relevant_col, UNPROVIDED, UNPROVIDED)) {
                    SubLObject entry = NIL;
                    final SubLObject age_interval = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
                    final SubLObject age_unit = cycl_utilities.formula_arg0(age_interval);
                    final SubLObject age_lower_bound = list(age_unit, cycl_utilities.formula_arg1(age_interval, UNPROVIDED));
                    final SubLObject age_upper_bound = list(age_unit, cycl_utilities.formula_arg2(age_interval, UNPROVIDED));
                    final SubLObject prob = cycl_utilities.formula_arg5(gaf, UNPROVIDED);
                    if (prob.numL(lower_threshold)) {
                        final SubLObject lower_bound = date_utilities.date_after(date, age_lower_bound);
                        final SubLObject upper_bound = date_utilities.date_after(date, age_upper_bound);
                        entry = list(list($$TimeIntervalInclusiveFn, lower_bound, upper_bound), append(list(assertion), justification_1), subtract(ONE_INTEGER, prob));
                        final SubLObject interval = cycl_utilities.formula_arg0(entry);
                        if (NIL != sbhl_time_query_processing.true_temporal_relation_literalP($$temporallyIntersects, interval, time, $POS, $$BaseKB)) {
                            result_justification_pairs = cons(entry, result_justification_pairs);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        }
        return result_justification_pairs;
    }

    public static SubLObject collect_time_intervals_for_non_negated_isa_sentence_by_conditional_probability_when_age(final SubLObject fact, final SubLObject upper_threshold, final SubLObject justifyP) {
        final SubLObject col = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        final SubLObject entering_state_assertions = kb_mapping_utilities.pred_value_gafs(col, $const14$conditionalProbabilityOfEnteringS, TWO_INTEGER, UNPROVIDED);
        final SubLObject leaving_state_assertions = kb_mapping_utilities.pred_value_gafs(col, $const16$conditionalProbabilityOfLeavingSt, ONE_INTEGER, UNPROVIDED);
        final SubLObject result = collect_time_intervals_from_absorbing_states(fact, entering_state_assertions, leaving_state_assertions, upper_threshold, justifyP);
        if (NIL != result) {
            return result;
        }
        return NIL;
    }

    public static SubLObject collect_time_intervals_for_non_negated_isa_sentence_by_conditional_probability_when_age_single(final SubLObject fact, final SubLObject upper_threshold, final SubLObject time) {
        final SubLObject col = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        final SubLObject entering_state_assertions = kb_mapping_utilities.pred_value_gafs(col, $const14$conditionalProbabilityOfEnteringS, TWO_INTEGER, UNPROVIDED);
        final SubLObject leaving_state_assertions = kb_mapping_utilities.pred_value_gafs(col, $const16$conditionalProbabilityOfLeavingSt, ONE_INTEGER, UNPROVIDED);
        final SubLObject result = collect_time_intervals_from_absorbing_states_single(fact, entering_state_assertions, leaving_state_assertions, upper_threshold, time);
        if (NIL != result) {
            return result;
        }
        return NIL;
    }

    public static SubLObject find_likelihood_for_absorbing_states(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        final SubLObject entity = cycl_utilities.formula_arg1(fact, UNPROVIDED);
        final SubLObject absorbing_assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, $const16$conditionalProbabilityOfLeavingSt, UNPROVIDED, UNPROVIDED));
        if (NIL != absorbing_assertion) {
            final SubLObject gaf = assertions_high.gaf_formula(absorbing_assertion);
            final SubLObject prob = cycl_utilities.formula_arg4(gaf, UNPROVIDED);
            final SubLObject leaving_duration = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
            final SubLObject upper_limit = list(cycl_utilities.formula_arg0(leaving_duration), cycl_utilities.formula_arg2(leaving_duration, UNPROVIDED));
            if (prob.numE(ZERO_INTEGER)) {
                final SubLObject entering_state_assertions = kb_mapping_utilities.pred_value_gafs(col, $const14$conditionalProbabilityOfEnteringS, TWO_INTEGER, UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject ending_date = find_known_or_expected_ending_date(entity, $float$0_8, UNPROVIDED);
                final SubLObject justifications = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject starting_date = lookup_starting_date_for_entity(entity);
                final SubLObject just_2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (((NIL != starting_date) && (NIL != ending_date)) && (NIL != date_utilities.later_than(ending_date, mt_time))) {
                    final SubLObject age_at_mt_time = date_utilities.time_elapsed(mt_time, starting_date, UNPROVIDED);
                    SubLObject cdolist_list_var = entering_state_assertions;
                    SubLObject entering_state_assertion = NIL;
                    entering_state_assertion = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject entering_gaf = assertions_high.gaf_formula(entering_state_assertion);
                        final SubLObject col_prereq = cycl_utilities.formula_arg1(entering_gaf, UNPROVIDED);
                        final SubLObject entering_duration = cycl_utilities.formula_arg3(entering_gaf, UNPROVIDED);
                        final SubLObject entering_prob = cycl_utilities.formula_arg5(entering_gaf, UNPROVIDED);
                        if (((entering_prob.numE(ONE_INTEGER) && (NIL != isa.isaP(entity, col_prereq, UNPROVIDED, UNPROVIDED))) && (NIL != quantities.cyc_less_than_or_equal_to_quantities(age_at_mt_time, upper_limit))) && (NIL != quantities.cyc_less_than_or_equal_to_quantities(entering_duration, age_at_mt_time))) {
                            if (NIL != justifyP) {
                                return values($numeric_likelihood_fn_one$.getDynamicValue(thread), append(just_2, justifications, list(entering_state_assertion, absorbing_assertion)));
                            }
                            return values($numeric_likelihood_fn_one$.getDynamicValue(thread), NIL);
                        } else {
                            cdolist_list_var = cdolist_list_var.rest();
                            entering_state_assertion = cdolist_list_var.first();
                        }
                    } 
                }
            }
        }
        return NIL;
    }

    public static SubLObject collect_time_intervals_from_absorbing_states(final SubLObject fact, final SubLObject entering_state_assertions, final SubLObject leaving_state_assertions, final SubLObject upper_threshold, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = entering_state_assertions;
        SubLObject assertion_1 = NIL;
        assertion_1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject assertion_2 = NIL;
            assertion_2 = leaving_state_assertions.first();
            if (NIL != leaving_state_assertions) {
                final SubLObject gaf_1 = assertions_high.gaf_formula(assertion_1);
                final SubLObject gaf_2 = assertions_high.gaf_formula(assertion_2);
                final SubLObject relevant_col = cycl_utilities.formula_arg1(gaf_1, UNPROVIDED);
                final SubLObject entity = cycl_utilities.formula_arg1(fact, UNPROVIDED);
                final SubLObject prob_1 = cycl_utilities.formula_arg5(gaf_1, UNPROVIDED);
                final SubLObject prob_2 = cycl_utilities.formula_arg4(gaf_2, UNPROVIDED);
                SubLObject result_entry = NIL;
                if (((NIL != isa.isaP(entity, relevant_col, UNPROVIDED, UNPROVIDED)) && prob_1.numE(ONE_INTEGER)) && prob_2.numE(ZERO_INTEGER)) {
                    final SubLObject interval_1 = cycl_utilities.formula_arg3(gaf_1, UNPROVIDED);
                    final SubLObject interval_2 = cycl_utilities.formula_arg2(gaf_2, UNPROVIDED);
                    final SubLObject unit_2 = cycl_utilities.formula_arg0(interval_2);
                    final SubLObject upper_limit_of_interval_2 = cycl_utilities.formula_arg2(interval_2, UNPROVIDED);
                    final SubLObject new_upper_limit = list(unit_2, upper_limit_of_interval_2);
                    if (NIL != quantities.cyc_quantity_subsumes(interval_2, interval_1)) {
                        thread.resetMultipleValues();
                        final SubLObject starting_date = find_known_or_expected_starting_date(entity);
                        final SubLObject justification_1 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != starting_date) {
                            final SubLObject starting_point = date_utilities.date_after(starting_date, interval_1);
                            final SubLObject ending_point = date_utilities.date_after(starting_date, new_upper_limit);
                            if (NIL != justifyP) {
                                result_entry = list(list($$TimeIntervalInclusiveFn, starting_point, ending_point), append(justification_1, list(assertion_1, assertion_2)), upper_threshold);
                            } else {
                                result_entry = list(list($$TimeIntervalInclusiveFn, starting_point, ending_point), NIL, upper_threshold);
                            }
                        }
                    }
                }
                return list(verify_starting_and_ending_dates_for_isa_result_entry(result_entry, fact, justifyP, upper_threshold));
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion_1 = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject collect_time_intervals_from_absorbing_states_single(final SubLObject fact, final SubLObject entering_state_assertions, final SubLObject leaving_state_assertions, final SubLObject upper_threshold, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = entering_state_assertions;
        SubLObject assertion_1 = NIL;
        assertion_1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = leaving_state_assertions;
            SubLObject assertion_2 = NIL;
            assertion_2 = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                final SubLObject gaf_1 = assertions_high.gaf_formula(assertion_1);
                final SubLObject gaf_2 = assertions_high.gaf_formula(assertion_2);
                final SubLObject relevant_col = cycl_utilities.formula_arg1(gaf_1, UNPROVIDED);
                final SubLObject entity = cycl_utilities.formula_arg1(fact, UNPROVIDED);
                final SubLObject prob_1 = cycl_utilities.formula_arg5(gaf_1, UNPROVIDED);
                final SubLObject prob_2 = cycl_utilities.formula_arg4(gaf_2, UNPROVIDED);
                SubLObject result_entry = NIL;
                if (((NIL != isa.isaP(entity, relevant_col, UNPROVIDED, UNPROVIDED)) && prob_1.numE(ONE_INTEGER)) && prob_2.numE(ZERO_INTEGER)) {
                    final SubLObject interval_1 = cycl_utilities.formula_arg3(gaf_1, UNPROVIDED);
                    final SubLObject interval_2 = cycl_utilities.formula_arg2(gaf_2, UNPROVIDED);
                    final SubLObject unit_2 = cycl_utilities.formula_arg0(interval_2);
                    final SubLObject upper_limit_of_interval_2 = cycl_utilities.formula_arg2(interval_2, UNPROVIDED);
                    final SubLObject new_upper_limit = list(unit_2, upper_limit_of_interval_2);
                    if (NIL != quantities.cyc_quantity_subsumes(interval_2, interval_1)) {
                        thread.resetMultipleValues();
                        final SubLObject starting_date = find_known_or_expected_starting_date(entity);
                        final SubLObject justification_1 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != starting_date) {
                            final SubLObject starting_point = date_utilities.date_after(starting_date, interval_1);
                            final SubLObject ending_point = date_utilities.date_after(starting_date, new_upper_limit);
                            result_entry = list(list($$TimeIntervalInclusiveFn, starting_point, ending_point), append(justification_1, list(assertion_1, assertion_2)), upper_threshold);
                            final SubLObject interval = cycl_utilities.formula_arg0(result_entry);
                            if (NIL != sbhl_time_query_processing.true_temporal_relation_literalP($$temporallyIntersects, interval, time, $POS, $$BaseKB)) {
                                return list(verify_starting_and_ending_dates_for_isa_result_entry(result_entry, fact, T, upper_threshold));
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
        return NIL;
    }

    public static SubLObject find_likelihood_of_truth_of_non_isa_sentence(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != isa.isaP(cycl_utilities.formula_arg0(fact), $$TemporallyQualifiableRelation, UNPROVIDED, UNPROVIDED)) {
            thread.resetMultipleValues();
            SubLObject result = verify_starting_and_ending_times(fact, mt_time);
            SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != result) {
                if (NIL != justifyP) {
                    return values(result, justifications);
                }
                return result;
            } else {
                thread.resetMultipleValues();
                result = temporal_projection_cols.compute_likelihoods_from_event_calculus(fact, mt_time, justifyP);
                justifications = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != result) {
                    if (NIL != justifyP) {
                        return values(result, justifications);
                    }
                    return result;
                } else {
                    thread.resetMultipleValues();
                    result = verify_temporal_relation_between_arguments(fact, justifyP);
                    justifications = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != result) {
                        if (NIL != justifyP) {
                            return values($numeric_likelihood_fn_zero$.getDynamicValue(thread), justifications);
                        }
                        return $numeric_likelihood_fn_zero$.getDynamicValue(thread);
                    } else {
                        thread.resetMultipleValues();
                        result = find_likelihood_of_truth_of_non_isa_sentence_by_using_decay_distributions(fact, mt_time, justifyP);
                        justifications = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != result) {
                            if (NIL != justifyP) {
                                return values(result, justifications);
                            }
                            return values(result, NIL);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject time_intervals_for_sentence(final SubLObject sentence, SubLObject mt, SubLObject justifyP, SubLObject upper_threshold, SubLObject lower_threshold) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        if (upper_threshold == UNPROVIDED) {
            upper_threshold = $temporal_projection_upper_threshold$.getDynamicValue();
        }
        if (lower_threshold == UNPROVIDED) {
            lower_threshold = $temporal_projection_lower_threshold$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $temporal_projection_mode$.getDynamicValue(thread)) {
            init_temporal_projection_global_variables();
            final SubLObject new_mt = temporal_projection_utilities.mt_with_anytime_psc_time_parameter(mt);
            SubLObject results = NIL;
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(new_mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (cycl_utilities.formula_arg0(sentence).eql($$not)) {
                    results = find_time_intervals_for_negated_sentence(cycl_utilities.formula_arg1(sentence, UNPROVIDED), justifyP, upper_threshold, lower_threshold);
                } else {
                    results = find_time_intervals_for_non_negated_sentence(sentence, justifyP, upper_threshold, lower_threshold);
                }
                init_temporal_projection_global_variables();
                return results;
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject temporally_project(SubLObject source, final SubLObject assertion, SubLObject upper_threshold, SubLObject lower_threshold) {
        if (upper_threshold == UNPROVIDED) {
            upper_threshold = $temporal_projection_upper_threshold$.getDynamicValue();
        }
        if (lower_threshold == UNPROVIDED) {
            lower_threshold = $temporal_projection_lower_threshold$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != hl_transcript_tracing.within_hl_evalP()) {
            return NIL;
        }
        if (NIL != $temporal_projection_mode$.getDynamicValue(thread)) {
            if (NIL != temporal_projection_utilities.temporal_projection_quick_failP(assertion)) {
                return NIL;
            }
            if ((((source.eql($ASSERTED_TRUE_DEF) || source.eql($ASSERTED_TRUE_MON)) || source.eql($ASSERTED_FALSE_DEF)) || source.eql($ASSERTED_FALSE_MON)) || (NIL != temporal_projection_utilities.deduction_not_produced_by_temporal_projectionP(source))) {
                init_temporal_projection_global_variables();
                final SubLObject new_mt = temporal_projection_utilities.mt_with_anytime_psc_time_parameter(assertions_high.assertion_mt(assertion));
                final SubLObject time = get_time_for_assertion_1(assertion);
                final SubLObject sentence = assertions_high.gaf_el_formula(assertion);
                final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
                SubLObject results = NIL;
                if (predicate.eql($const26$startingPointOfIntervalForSentenc) || predicate.eql($$endingPointOfIntervalForSentence)) {
                    return find_time_intervals_from_starting_and_ending_points_of_sentence(assertion, upper_threshold, lower_threshold);
                }
                if (predicate.eql($$statePersistsForDurationFromDate)) {
                    return find_time_intervals_from_state_persists_assertions(assertion);
                }
                if (NIL != time) {
                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(new_mt);
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (cycl_utilities.formula_arg0(sentence).eql($$not)) {
                            results = find_time_intervals_for_negated_sentence_single(cycl_utilities.formula_arg1(sentence, UNPROVIDED), time, upper_threshold, lower_threshold);
                        } else {
                            results = find_time_intervals_for_non_negated_sentence_single(sentence, time, upper_threshold, lower_threshold);
                        }
                        init_temporal_projection_global_variables();
                        temporal_projection_utilities.store_temporal_projection_results(sentence, results, assertion, new_mt);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return NIL;
            }
        }
        return NIL;
    }

    public static SubLObject find_time_intervals_from_state_persists_assertions(final SubLObject assertion) {
        final SubLObject new_mt = temporal_projection_utilities.mt_with_anytime_psc_time_parameter(assertions_high.assertion_mt(assertion));
        final SubLObject sentence = assertions_high.gaf_el_formula(assertion);
        final SubLObject sentence_in_assertion = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
        final SubLObject duration_for_sentence = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
        final SubLObject starting_date = temporal_projection_utilities.find_first_point_of_time(cycl_utilities.formula_arg3(sentence, UNPROVIDED));
        SubLObject results = NIL;
        if (NIL != starting_date) {
            final SubLObject ending_point = date_utilities.date_after(starting_date, duration_for_sentence);
            SubLObject entry = NIL;
            entry = list(list($$TimeIntervalInclusiveFn, starting_date, ending_point), list(assertion), ONE_INTEGER);
            results = cons(entry, results);
            temporal_projection_utilities.store_temporal_projection_results(sentence_in_assertion, results, assertion, new_mt);
        }
        return NIL;
    }

    public static SubLObject find_time_intervals_from_starting_and_ending_points_of_sentence(final SubLObject assertion, final SubLObject upper, final SubLObject lower) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_mt = temporal_projection_utilities.mt_with_anytime_psc_time_parameter(assertions_high.assertion_mt(assertion));
        final SubLObject sentence = assertions_high.gaf_el_formula(assertion);
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        final SubLObject sentence_in_assertion = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
        SubLObject results = NIL;
        if (predicate.eql($const26$startingPointOfIntervalForSentenc)) {
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
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        if (predicate.eql($$endingPointOfIntervalForSentence)) {
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
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject find_time_intervals_for_non_negated_sentence(final SubLObject sentence, final SubLObject justifyP, final SubLObject upper, final SubLObject lower) {
        if (cycl_utilities.formula_arg0(sentence).eql($$isa)) {
            return find_time_intervals_for_non_negated_isa_sentence(sentence, justifyP, upper, lower);
        }
        return find_time_intervals_for_non_negated_non_isa_sentence(sentence, justifyP, upper, lower);
    }

    public static SubLObject find_time_intervals_for_non_negated_sentence_single(final SubLObject sentence, final SubLObject time, final SubLObject upper, final SubLObject lower) {
        if (cycl_utilities.formula_arg0(sentence).eql($$isa)) {
            return find_time_intervals_for_non_negated_isa_sentence_single(sentence, time, upper, lower);
        }
        return find_time_intervals_for_non_negated_non_isa_sentence_single(sentence, time, upper, lower);
    }

    public static SubLObject find_time_intervals_for_negated_sentence(final SubLObject sentence, final SubLObject justifyP, final SubLObject upper_threshold, final SubLObject lower_threshold) {
        if (cycl_utilities.formula_arg0(sentence).eql($$isa)) {
            return find_time_intervals_for_negated_isa_sentence(sentence, justifyP, upper_threshold, lower_threshold);
        }
        return find_time_intervals_for_negated_non_isa_sentence(sentence, justifyP, upper_threshold, lower_threshold);
    }

    public static SubLObject find_time_intervals_for_negated_sentence_single(final SubLObject sentence, final SubLObject time, final SubLObject upper_threshold, final SubLObject lower_threshold) {
        if (cycl_utilities.formula_arg0(sentence).eql($$isa)) {
            return find_time_intervals_for_negated_isa_sentence_single(sentence, time, upper_threshold, lower_threshold);
        }
        return find_time_intervals_for_negated_non_isa_sentence_single(sentence, time, upper_threshold, lower_threshold);
    }

    public static SubLObject find_time_intervals_for_negated_isa_sentence(final SubLObject sentence, final SubLObject justifyP, final SubLObject upper, final SubLObject lower) {
        final SubLObject col = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
        if (NIL != isa.isaP(col, $$TimeDependentCollection, UNPROVIDED, UNPROVIDED)) {
            update_temporal_projection_global_variables(sentence);
            SubLObject interval_justification_pairs = NIL;
            SubLObject result = collect_intervals_from_starting_and_ending_dates(sentence, justifyP);
            if (NIL != result) {
                interval_justification_pairs = append(interval_justification_pairs, result);
            }
            result = collect_intervals_from_disjoint_assertions(sentence, justifyP);
            if (NIL != result) {
                interval_justification_pairs = append(interval_justification_pairs, result);
            }
            result = collect_intervals_from_temporal_constraints_between_collections_for_negated_isa_sentence(sentence, justifyP);
            if (NIL != result) {
                interval_justification_pairs = append(result, interval_justification_pairs);
            }
            result = collect_time_intervals_for_negated_isa_sentence_by_conditional_probability_when_age(sentence, lower, justifyP);
            if (NIL != result) {
                interval_justification_pairs = append(result, interval_justification_pairs);
            }
            return interval_justification_pairs;
        }
        return NIL;
    }

    public static SubLObject find_time_intervals_for_negated_isa_sentence_single(final SubLObject sentence, final SubLObject time, final SubLObject upper, final SubLObject lower) {
        final SubLObject col = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
        if (NIL != isa.isaP(col, $$TimeDependentCollection, UNPROVIDED, UNPROVIDED)) {
            update_temporal_projection_global_variables(sentence);
            SubLObject interval_justification_pairs = NIL;
            SubLObject result = collect_intervals_from_starting_and_ending_dates_single(sentence, time);
            if (NIL != result) {
                interval_justification_pairs = append(interval_justification_pairs, result);
            }
            result = collect_intervals_from_disjoint_assertions_single(sentence, time);
            if (NIL != result) {
                interval_justification_pairs = append(interval_justification_pairs, result);
            }
            result = collect_intervals_from_temporal_constraints_between_collections_for_negated_isa_sentence_single(sentence, time);
            if (NIL != result) {
                interval_justification_pairs = append(result, interval_justification_pairs);
            }
            result = collect_time_intervals_for_negated_isa_sentence_by_conditional_probability_when_age_single(sentence, lower, time);
            if (NIL != result) {
                interval_justification_pairs = append(result, interval_justification_pairs);
            }
            return interval_justification_pairs;
        }
        return NIL;
    }

    public static SubLObject find_time_intervals_for_non_negated_non_isa_sentence(final SubLObject sentence, final SubLObject justifyP, final SubLObject upper, final SubLObject lower) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        if (NIL == isa.isaP(predicate, $$TemporallyQualifiableRelation, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        update_temporal_projection_global_variables(sentence);
        thread.resetMultipleValues();
        final SubLObject inconsistentP = verify_temporal_relation_between_arguments(sentence, justifyP);
        final SubLObject justifications_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == inconsistentP) {
            SubLObject interval_justification_pairs = NIL;
            SubLObject result = collect_intervals_from_decay_distributions_for_predicate(sentence, upper, justifyP);
            if (NIL != result) {
                interval_justification_pairs = append(interval_justification_pairs, result);
            }
            result = collect_intervals_from_initial_and_terminal_in_args_facts(sentence, upper, justifyP);
            if (NIL != result) {
                interval_justification_pairs = append(interval_justification_pairs, result);
            }
            return interval_justification_pairs;
        }
        if (NIL != justifyP) {
            return values(list(list(NIL, justifications_1)));
        }
        return values(list(list(NIL, NIL)));
    }

    public static SubLObject find_time_intervals_for_non_negated_non_isa_sentence_single(final SubLObject sentence, final SubLObject time, final SubLObject upper, final SubLObject lower) {
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        if (NIL != isa.isaP(predicate, $$TemporallyQualifiableRelation, UNPROVIDED, UNPROVIDED)) {
            update_temporal_projection_global_variables(sentence);
            SubLObject interval_justification_pairs = NIL;
            SubLObject result = collect_intervals_from_decay_distributions_for_predicate_single(sentence, upper, time);
            if (NIL != result) {
                interval_justification_pairs = append(interval_justification_pairs, result);
            }
            result = collect_intervals_from_initial_and_terminal_in_args_facts_single(sentence, upper, time);
            if (NIL != result) {
                interval_justification_pairs = append(interval_justification_pairs, result);
            }
            return interval_justification_pairs;
        }
        return NIL;
    }

    public static SubLObject collect_intervals_from_decay_distributions_for_predicate(final SubLObject sentence, final SubLObject upper, final SubLObject justifyP) {
        SubLObject result = temporal_projection_cols.collect_intervals_from_events(sentence, upper, justifyP);
        if (NIL != result) {
            return result;
        }
        result = collect_intervals_from_specific_distributions_for_predicate(sentence, upper, justifyP);
        if (NIL != result) {
            return result;
        }
        result = collect_intervals_from_default_conditional_probability_for_sentence_in_interval(sentence, justifyP, upper);
        if (NIL != result) {
            return result;
        }
        return NIL;
    }

    public static SubLObject collect_intervals_from_decay_distributions_for_predicate_single(final SubLObject sentence, final SubLObject upper, final SubLObject time) {
        SubLObject result = collect_intervals_from_specific_distributions_for_predicate_single(sentence, upper, time);
        if (NIL != result) {
            return result;
        }
        result = collect_intervals_from_default_conditional_probability_for_sentence_in_interval_single(sentence, time, upper);
        if (NIL != result) {
            return result;
        }
        return NIL;
    }

    public static SubLObject collect_intervals_from_specific_distributions_for_predicate(final SubLObject sentence, final SubLObject upper_threshold, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        SubLObject interval_justification_pairs = NIL;
        if (NIL != predicate_has_type_level_distributionsP(predicate)) {
            final SubLObject pred_var = $$relevantDistributionForSentence;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$3 = NIL;
                                final SubLObject token_var_$4 = NIL;
                                while (NIL == done_var_$3) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                    final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(assertion));
                                    if (NIL != valid_$5) {
                                        final SubLObject gaf = assertions_high.gaf_formula(assertion);
                                        final SubLObject sent = cycl_utilities.formula_arg1(gaf, UNPROVIDED);
                                        if (sent.equal(sentence)) {
                                            final SubLObject assertions_and_time_for_fact = get_assertion_time_pairs_for_fact(sentence);
                                            SubLObject result_entry = NIL;
                                            final SubLObject distribution_gaf = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
                                            final SubLObject prob = cycl_utilities.formula_arg6(distribution_gaf, UNPROVIDED);
                                            final SubLObject allowed_interval = cycl_utilities.formula_arg2(distribution_gaf, UNPROVIDED);
                                            final SubLObject unit_of_allowed_interval = cycl_utilities.formula_arg0(allowed_interval);
                                            final SubLObject allowed_lower_limit = cycl_utilities.formula_arg1(allowed_interval, UNPROVIDED);
                                            final SubLObject allowed_upper_limit = cycl_utilities.formula_arg2(allowed_interval, UNPROVIDED);
                                            final SubLObject duration_of_time_interval = cycl_utilities.formula_arg5(distribution_gaf, UNPROVIDED);
                                            final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
                                            final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, UNPROVIDED);
                                            final SubLObject no_of_iterations = multiply(value_of_duration_of_time_interval, divide(log(prob, UNPROVIDED), log(upper_threshold, UNPROVIDED)));
                                            final SubLObject derived_lower_limit = list(unit_of_duration_of_time_interval, no_of_iterations);
                                            final SubLObject derived_upper_limit = list(unit_of_duration_of_time_interval, no_of_iterations);
                                            final SubLObject new_allowed_lower_limit = list(unit_of_allowed_interval, allowed_lower_limit);
                                            final SubLObject new_allowed_upper_limit = list(unit_of_allowed_interval, allowed_upper_limit);
                                            SubLObject lower_limit = NIL;
                                            SubLObject upper_limit = NIL;
                                            SubLObject cdolist_list_var = assertions_and_time_for_fact;
                                            SubLObject entry = NIL;
                                            entry = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject time_of_assertion = cycl_utilities.formula_arg0(entry);
                                                SubLObject justifications = NIL;
                                                final SubLObject assertion_1 = cycl_utilities.formula_arg1(entry, UNPROVIDED);
                                                final SubLObject initial_point = temporal_projection_utilities.find_first_point_of_time(time_of_assertion);
                                                final SubLObject final_point = temporal_projection_utilities.find_last_point_of_time(time_of_assertion);
                                                if (allowed_interval.eql($$Forever_Quantity)) {
                                                    lower_limit = derived_lower_limit;
                                                } else
                                                    if (NIL != quantities.cyc_less_than_quantities(new_allowed_lower_limit, derived_lower_limit)) {
                                                        lower_limit = derived_lower_limit;
                                                    } else {
                                                        lower_limit = new_allowed_lower_limit;
                                                    }

                                                if (allowed_interval.eql($$Forever_Quantity)) {
                                                    upper_limit = derived_upper_limit;
                                                } else
                                                    if (NIL != quantities.cyc_less_than_quantities(derived_upper_limit, new_allowed_upper_limit)) {
                                                        upper_limit = derived_upper_limit;
                                                    } else {
                                                        upper_limit = new_allowed_upper_limit;
                                                    }

                                                if ((NIL != initial_point) && (NIL != final_point)) {
                                                    if (NIL != justifyP) {
                                                        justifications = append(list(assertion), list(assertion_1));
                                                        result_entry = list(list($$TimeIntervalInclusiveFn, date_utilities.date_before(initial_point, lower_limit), date_utilities.date_after(final_point, upper_limit)), justifications, upper_threshold);
                                                    } else {
                                                        result_entry = list(list($$TimeIntervalInclusiveFn, date_utilities.date_before(initial_point, lower_limit), date_utilities.date_after(final_point, upper_limit)), NIL, upper_threshold);
                                                    }
                                                    interval_justification_pairs = cons(verify_starting_and_ending_dates_for_result_entry(result_entry, sentence, justifyP, upper_threshold), interval_justification_pairs);
                                                }
                                                if ((NIL != initial_point) && (NIL == final_point)) {
                                                    if (NIL != justifyP) {
                                                        justifications = append(list(assertion), list(assertion_1));
                                                        result_entry = list(list($$IntervalStartedByFn, date_utilities.date_before(initial_point, lower_limit)), justifications, upper_threshold);
                                                    } else {
                                                        result_entry = list(list($$IntervalStartedByFn, date_utilities.date_before(initial_point, lower_limit)), NIL, upper_threshold);
                                                    }
                                                    interval_justification_pairs = cons(verify_starting_and_ending_dates_for_result_entry(result_entry, sentence, justifyP, upper_threshold), interval_justification_pairs);
                                                }
                                                if ((NIL != final_point) && (NIL == initial_point)) {
                                                    if (NIL != justifyP) {
                                                        justifications = append(list(assertion), list(assertion_1));
                                                        result_entry = list(list($$IntervalEndedByFn, date_utilities.date_after(final_point, upper_limit)), justifications, upper_threshold);
                                                    } else {
                                                        result_entry = list(list($$IntervalEndedByFn, date_utilities.date_after(final_point, upper_limit)), NIL, upper_threshold);
                                                    }
                                                    interval_justification_pairs = cons(verify_starting_and_ending_dates_for_result_entry(result_entry, sentence, justifyP, upper_threshold), interval_justification_pairs);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                entry = cdolist_list_var.first();
                                            } 
                                        }
                                    }
                                    done_var_$3 = makeBoolean(NIL == valid_$5);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    $progress_start_time$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return interval_justification_pairs;
    }

    public static SubLObject collect_intervals_from_specific_distributions_for_predicate_single(final SubLObject sentence, final SubLObject upper_threshold, final SubLObject time_of_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        SubLObject interval_justification_pairs = NIL;
        if (NIL != predicate_has_type_level_distributionsP(predicate)) {
            final SubLObject pred_var = $$relevantDistributionForSentence;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$7 = NIL;
                                final SubLObject token_var_$8 = NIL;
                                while (NIL == done_var_$7) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$8);
                                    final SubLObject valid_$9 = makeBoolean(!token_var_$8.eql(assertion));
                                    if (NIL != valid_$9) {
                                        final SubLObject gaf = assertions_high.gaf_formula(assertion);
                                        final SubLObject sent = cycl_utilities.formula_arg1(gaf, UNPROVIDED);
                                        if (sent.equal(sentence)) {
                                            SubLObject result_entry = NIL;
                                            final SubLObject distribution_gaf = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
                                            final SubLObject prob = cycl_utilities.formula_arg6(distribution_gaf, UNPROVIDED);
                                            final SubLObject allowed_interval = cycl_utilities.formula_arg2(distribution_gaf, UNPROVIDED);
                                            final SubLObject unit_of_allowed_interval = cycl_utilities.formula_arg0(allowed_interval);
                                            final SubLObject allowed_lower_limit = cycl_utilities.formula_arg1(allowed_interval, UNPROVIDED);
                                            final SubLObject allowed_upper_limit = cycl_utilities.formula_arg2(allowed_interval, UNPROVIDED);
                                            final SubLObject duration_of_time_interval = cycl_utilities.formula_arg5(distribution_gaf, UNPROVIDED);
                                            final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
                                            final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, UNPROVIDED);
                                            final SubLObject no_of_iterations = multiply(value_of_duration_of_time_interval, divide(log(upper_threshold, UNPROVIDED), log(prob, UNPROVIDED)));
                                            final SubLObject derived_lower_limit = list(unit_of_duration_of_time_interval, no_of_iterations);
                                            final SubLObject derived_upper_limit = list(unit_of_duration_of_time_interval, no_of_iterations);
                                            final SubLObject new_allowed_lower_limit = list(unit_of_allowed_interval, allowed_lower_limit);
                                            final SubLObject new_allowed_upper_limit = list(unit_of_allowed_interval, allowed_upper_limit);
                                            SubLObject lower_limit = NIL;
                                            SubLObject upper_limit = NIL;
                                            SubLObject justifications = NIL;
                                            final SubLObject initial_point = temporal_projection_utilities.find_first_point_of_time(time_of_assertion);
                                            final SubLObject final_point = temporal_projection_utilities.find_last_point_of_time(time_of_assertion);
                                            if (allowed_interval.eql($$Forever_Quantity)) {
                                                lower_limit = derived_lower_limit;
                                            } else
                                                if (NIL != quantities.cyc_less_than_quantities(new_allowed_lower_limit, derived_lower_limit)) {
                                                    lower_limit = derived_lower_limit;
                                                } else {
                                                    lower_limit = new_allowed_lower_limit;
                                                }

                                            if (allowed_interval.eql($$Forever_Quantity)) {
                                                upper_limit = derived_upper_limit;
                                            } else
                                                if (NIL != quantities.cyc_less_than_quantities(derived_upper_limit, new_allowed_upper_limit)) {
                                                    upper_limit = derived_upper_limit;
                                                } else {
                                                    upper_limit = new_allowed_upper_limit;
                                                }

                                            if ((NIL != initial_point) && (NIL != final_point)) {
                                                justifications = list(assertion);
                                                result_entry = list(list($$TimeIntervalInclusiveFn, date_utilities.date_before(initial_point, lower_limit), date_utilities.date_after(final_point, upper_limit)), justifications, upper_threshold);
                                                interval_justification_pairs = cons(verify_starting_and_ending_dates_for_result_entry(result_entry, sentence, T, upper_threshold), interval_justification_pairs);
                                            }
                                            if ((NIL != initial_point) && (NIL == final_point)) {
                                                justifications = list(assertion);
                                                result_entry = list(list($$IntervalStartedByFn, date_utilities.date_before(initial_point, lower_limit)), justifications, upper_threshold);
                                                interval_justification_pairs = cons(verify_starting_and_ending_dates_for_result_entry(result_entry, sentence, T, upper_threshold), interval_justification_pairs);
                                            }
                                            if ((NIL != final_point) && (NIL == initial_point)) {
                                                justifications = list(assertion);
                                                result_entry = list(list($$IntervalEndedByFn, date_utilities.date_after(final_point, upper_limit)), justifications, upper_threshold);
                                                interval_justification_pairs = cons(verify_starting_and_ending_dates_for_result_entry(result_entry, sentence, T, upper_threshold), interval_justification_pairs);
                                            }
                                        }
                                    }
                                    done_var_$7 = makeBoolean(NIL == valid_$9);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    $progress_start_time$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return interval_justification_pairs;
    }

    public static SubLObject predicate_has_type_level_distributionsP(final SubLObject predicate) {
        if (NIL != kb_mapping_utilities.pred_value_gafs(predicate, $const35$conditionalProbabilityForSentence, ONE_INTEGER, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject find_time_intervals_for_negated_non_isa_sentence(final SubLObject sentence, final SubLObject justifyP, final SubLObject upper, final SubLObject lower) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject interval_justification_pairs = NIL;
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        if (NIL == isa.isaP(predicate, $$TemporallyQualifiableRelation, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        update_temporal_projection_global_variables(sentence);
        thread.resetMultipleValues();
        final SubLObject inconsistentP = verify_temporal_relation_between_arguments(sentence, justifyP);
        final SubLObject justifications_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == inconsistentP) {
            SubLObject result = collect_intervals_from_starting_and_ending_dates(sentence, justifyP);
            if (NIL != result) {
                interval_justification_pairs = append(interval_justification_pairs, result);
            }
            result = collect_intervals_from_temporal_relation_between_arguments_assertions_for_negated_non_isa_sentence(sentence, justifyP);
            if (NIL != result) {
                interval_justification_pairs = append(interval_justification_pairs, result);
            }
            result = temporal_projection_cols.collect_intervals_from_events_for_negated_sentence(sentence, lower, justifyP);
            if (NIL != result) {
                interval_justification_pairs = append(interval_justification_pairs, result);
            }
            return interval_justification_pairs;
        }
        if (NIL != justifyP) {
            return values(list(list($$Always_TimeInterval, justifications_2)));
        }
        return values(list(list($$Always_TimeInterval, NIL)));
    }

    public static SubLObject find_time_intervals_for_negated_non_isa_sentence_single(final SubLObject sentence, final SubLObject time, final SubLObject upper, final SubLObject lower) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject interval_justification_pairs = NIL;
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        if (NIL == isa.isaP(predicate, $$TemporallyQualifiableRelation, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        update_temporal_projection_global_variables(sentence);
        thread.resetMultipleValues();
        final SubLObject inconsistentP = verify_temporal_relation_between_arguments(sentence, T);
        final SubLObject justifications_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != inconsistentP) {
            return values(list(list($$Always_TimeInterval, justifications_2)));
        }
        SubLObject result = collect_intervals_from_starting_and_ending_dates_single(sentence, time);
        if (NIL != result) {
            interval_justification_pairs = append(interval_justification_pairs, result);
        }
        result = collect_intervals_from_temporal_relation_between_arguments_assertions_for_negated_non_isa_sentence_single(sentence, time);
        if (NIL != result) {
            interval_justification_pairs = append(interval_justification_pairs, result);
        }
        return interval_justification_pairs;
    }

    public static SubLObject find_time_intervals_for_non_negated_isa_sentence(final SubLObject sentence, final SubLObject justifyP, final SubLObject upper, final SubLObject lower) {
        SubLObject interval_justification_pairs = NIL;
        final SubLObject col = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
        if (NIL != isa.isaP(col, $$TimeDependentCollection, UNPROVIDED, UNPROVIDED)) {
            update_temporal_projection_global_variables(sentence);
            SubLObject result = collect_intervals_from_genls_assertions(sentence, justifyP);
            if (NIL != result) {
                interval_justification_pairs = append(result, interval_justification_pairs);
            }
            result = collect_time_intervals_for_non_negated_isa_sentence_by_conditional_probability_when_age(sentence, upper, justifyP);
            if (NIL != result) {
                interval_justification_pairs = append(result, interval_justification_pairs);
            }
            result = collect_intervals_from_decay_distributions_for_collections(sentence, upper, justifyP);
            if (NIL != result) {
                interval_justification_pairs = append(result, interval_justification_pairs);
            }
            return interval_justification_pairs;
        }
        return NIL;
    }

    public static SubLObject find_time_intervals_for_non_negated_isa_sentence_single(final SubLObject sentence, final SubLObject time, final SubLObject upper, final SubLObject lower) {
        SubLObject interval_justification_pairs = NIL;
        final SubLObject col = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
        if (NIL != isa.isaP(col, $$TimeDependentCollection, UNPROVIDED, UNPROVIDED)) {
            update_temporal_projection_global_variables(sentence);
            SubLObject result = collect_time_intervals_for_non_negated_isa_sentence_by_conditional_probability_when_age_single(sentence, upper, time);
            if (NIL != result) {
                interval_justification_pairs = append(result, interval_justification_pairs);
            }
            result = collect_intervals_from_decay_distributions_for_collections_single(sentence, upper, time);
            if (NIL != result) {
                interval_justification_pairs = append(result, interval_justification_pairs);
            }
            return interval_justification_pairs;
        }
        return NIL;
    }

    public static SubLObject collect_intervals_from_decay_distributions_for_collections(final SubLObject sentence, final SubLObject upper_threshold, final SubLObject justifyP) {
        SubLObject result = collect_intervals_from_forward_and_backward_distributions_for_collections(sentence, upper_threshold, justifyP);
        if (NIL != result) {
            return result;
        }
        result = collect_intervals_from_default_conditional_probability_statements(sentence, upper_threshold, justifyP);
        if (NIL != result) {
            return result;
        }
        return NIL;
    }

    public static SubLObject collect_intervals_from_decay_distributions_for_collections_single(final SubLObject sentence, final SubLObject upper_threshold, final SubLObject time) {
        SubLObject result = collect_intervals_from_forward_and_backward_distributions_for_collections_single(sentence, upper_threshold, time);
        if (NIL != result) {
            return result;
        }
        result = collect_intervals_from_default_conditional_probability_statements_single(sentence, upper_threshold, time);
        if (NIL != result) {
            return result;
        }
        return NIL;
    }

    public static SubLObject collect_intervals_from_forward_and_backward_distributions_for_collections(final SubLObject sentence, final SubLObject upper, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
        final SubLObject entity = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
        SubLObject results_list = NIL;
        SubLObject interval = NIL;
        SubLObject justifications = NIL;
        final SubLObject forward_assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, $const12$conditionalProbabilityOfStateAfte, ONE_INTEGER, UNPROVIDED));
        final SubLObject backward_assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, $const9$conditionalProbabilityOfStateAfte, ONE_INTEGER, UNPROVIDED));
        if ((NIL != forward_assertion) && (NIL != backward_assertion)) {
            final SubLObject gaf_1 = assertions_high.gaf_formula(forward_assertion);
            final SubLObject gaf_2 = assertions_high.gaf_formula(backward_assertion);
            final SubLObject prob_1 = cycl_utilities.formula_arg3(gaf_1, UNPROVIDED);
            final SubLObject prob_2 = cycl_utilities.formula_arg3(gaf_2, UNPROVIDED);
            if (prob_1.numE(ONE_INTEGER) && prob_2.numE(ONE_INTEGER)) {
                SubLObject cdolist_list_var;
                final SubLObject interval_justification_pairs = cdolist_list_var = collect_intervals_from_genls_assertions(sentence, justifyP);
                SubLObject pair = NIL;
                pair = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject just = cycl_utilities.formula_arg1(pair, UNPROVIDED);
                    thread.resetMultipleValues();
                    final SubLObject starting_date = find_known_or_expected_starting_date(entity);
                    final SubLObject justification_1 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == starting_date) {
                        return NIL;
                    }
                    thread.resetMultipleValues();
                    final SubLObject ending_date = find_known_or_expected_ending_date(entity, upper, justifyP);
                    final SubLObject justification_2 = thread.secondMultipleValue();
                    final SubLObject likelihood = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != ending_date) {
                        interval = list($$TimeIntervalInclusiveFn, starting_date, ending_date);
                        if (NIL != justifyP) {
                            justifications = append(just, justification_1, justification_2, list(forward_assertion, backward_assertion));
                            results_list = cons(list(interval, justifications, likelihood), results_list);
                        } else {
                            results_list = cons(list(interval, NIL, likelihood), results_list);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    pair = cdolist_list_var.first();
                } 
                return results_list;
            }
        }
        if (NIL != forward_assertion) {
            final SubLObject results_list_$11 = use_forward_distribution_for_collections(sentence, forward_assertion, upper, justifyP);
            if (NIL != results_list_$11) {
                return results_list_$11;
            }
        }
        if (NIL != backward_assertion) {
            final SubLObject results_list_$12 = use_backward_distribution_for_collections(sentence, backward_assertion, upper, justifyP);
            if (NIL != results_list_$12) {
                return results_list_$12;
            }
        }
        return NIL;
    }

    public static SubLObject collect_intervals_from_forward_and_backward_distributions_for_collections_single(final SubLObject sentence, final SubLObject upper, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
        final SubLObject entity = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
        SubLObject results_list = NIL;
        SubLObject interval = NIL;
        SubLObject justifications = NIL;
        final SubLObject forward_assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, $const12$conditionalProbabilityOfStateAfte, ONE_INTEGER, UNPROVIDED));
        final SubLObject backward_assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, $const9$conditionalProbabilityOfStateAfte, ONE_INTEGER, UNPROVIDED));
        if ((NIL != forward_assertion) && (NIL != backward_assertion)) {
            final SubLObject gaf_1 = assertions_high.gaf_formula(forward_assertion);
            final SubLObject gaf_2 = assertions_high.gaf_formula(backward_assertion);
            final SubLObject prob_1 = cycl_utilities.formula_arg3(gaf_1, UNPROVIDED);
            final SubLObject prob_2 = cycl_utilities.formula_arg3(gaf_2, UNPROVIDED);
            if (prob_1.numE(ONE_INTEGER) && prob_2.numE(ONE_INTEGER)) {
                thread.resetMultipleValues();
                final SubLObject starting_date = find_known_or_expected_starting_date(entity);
                final SubLObject justification_1 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == starting_date) {
                    return NIL;
                }
                thread.resetMultipleValues();
                final SubLObject ending_date = find_known_or_expected_ending_date(entity, upper, T);
                final SubLObject justification_2 = thread.secondMultipleValue();
                final SubLObject likelihood = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != ending_date) {
                    interval = list($$TimeIntervalInclusiveFn, starting_date, ending_date);
                    justifications = append(justification_1, justification_2, list(forward_assertion, backward_assertion));
                    results_list = cons(list(interval, justifications, likelihood), results_list);
                    return results_list;
                }
            }
        }
        if (NIL != forward_assertion) {
            final SubLObject results_list_$13 = use_forward_distribution_for_collections_single(sentence, forward_assertion, upper, time);
            if (NIL != results_list_$13) {
                return results_list_$13;
            }
        }
        if (NIL != backward_assertion) {
            final SubLObject results_list_$14 = use_backward_distribution_for_collections_single(sentence, backward_assertion, upper, time);
            if (NIL != results_list_$14) {
                return results_list_$14;
            }
        }
        return NIL;
    }

    public static SubLObject use_backward_distribution_for_collections(final SubLObject sentence, final SubLObject backward_assertion, final SubLObject upper_threshold, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gaf = assertions_high.gaf_formula(backward_assertion);
        final SubLObject prob = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
        if (prob.numE(ONE_INTEGER)) {
            final SubLObject interval_justification_pairs = collect_intervals_from_genls_assertions(sentence, justifyP);
            SubLObject results_list = NIL;
            final SubLObject entity = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
            SubLObject interval = NIL;
            SubLObject justifications = NIL;
            SubLObject cdolist_list_var = interval_justification_pairs;
            SubLObject pair = NIL;
            pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject time = cycl_utilities.formula_arg0(pair);
                final SubLObject just = cycl_utilities.formula_arg1(pair, UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject starting_date = find_known_or_expected_starting_date(entity);
                final SubLObject justification_2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != starting_date) {
                    interval = list($$TimeIntervalInclusiveFn, starting_date, time);
                    if (NIL != justifyP) {
                        justifications = append(just, justification_2, list(backward_assertion));
                        results_list = cons(list(interval, justifications, ONE_INTEGER), results_list);
                    } else {
                        results_list = cons(list(interval, NIL, ONE_INTEGER), results_list);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            } 
            return results_list;
        }
        return NIL;
    }

    public static SubLObject use_backward_distribution_for_collections_single(final SubLObject sentence, final SubLObject backward_assertion, final SubLObject upper_threshold, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gaf = assertions_high.gaf_formula(backward_assertion);
        final SubLObject prob = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
        if (prob.numE(ONE_INTEGER)) {
            SubLObject results_list = NIL;
            final SubLObject entity = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
            SubLObject interval = NIL;
            SubLObject justifications = NIL;
            thread.resetMultipleValues();
            final SubLObject starting_date = find_known_or_expected_starting_date(entity);
            final SubLObject justification_2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != starting_date) {
                interval = list($$TimeIntervalInclusiveFn, starting_date, time);
                justifications = append(justification_2, list(backward_assertion));
                results_list = cons(list(interval, justifications, ONE_INTEGER), results_list);
            }
            return results_list;
        }
        return NIL;
    }

    public static SubLObject use_forward_distribution_for_collections(final SubLObject sentence, final SubLObject forward_assertion, final SubLObject upper_threshold, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gaf = assertions_high.gaf_formula(forward_assertion);
        final SubLObject prob = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
        final SubLObject col = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
        if (prob.numE(ONE_INTEGER)) {
            final SubLObject interval_justification_pairs = collect_intervals_from_genls_assertions(sentence, justifyP);
            SubLObject results_list = NIL;
            final SubLObject entity = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
            SubLObject interval = NIL;
            SubLObject justifications = NIL;
            SubLObject cdolist_list_var = interval_justification_pairs;
            SubLObject pair = NIL;
            pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject time = cycl_utilities.formula_arg0(pair);
                final SubLObject just = cycl_utilities.formula_arg1(pair, UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject ending_date = find_known_or_expected_ending_date(entity, upper_threshold, justifyP);
                final SubLObject justification_2 = thread.secondMultipleValue();
                final SubLObject likelihood = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != ending_date) {
                    if (NIL != genls.genlP(col, $$BiologicalLivingObject, UNPROVIDED, UNPROVIDED)) {
                        interval = list($$TimeIntervalInclusiveFn, time, ending_date);
                    } else {
                        interval = list($$IntervalStartedByFn, time);
                    }
                    if (NIL != justifyP) {
                        justifications = append(just, justification_2, list(forward_assertion));
                        results_list = cons(list(interval, justifications, likelihood), results_list);
                    } else {
                        results_list = cons(list(interval, NIL, likelihood), results_list);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            } 
            return results_list;
        }
        return NIL;
    }

    public static SubLObject use_forward_distribution_for_collections_single(final SubLObject sentence, final SubLObject forward_assertion, final SubLObject upper_threshold, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gaf = assertions_high.gaf_formula(forward_assertion);
        final SubLObject prob = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
        final SubLObject col = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
        if (prob.numE(ONE_INTEGER)) {
            SubLObject results_list = NIL;
            final SubLObject entity = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
            SubLObject interval = NIL;
            SubLObject justifications = NIL;
            thread.resetMultipleValues();
            final SubLObject ending_date = find_known_or_expected_ending_date(entity, upper_threshold, T);
            final SubLObject justification_2 = thread.secondMultipleValue();
            final SubLObject likelihood = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != ending_date) {
                if (NIL != genls.genlP(col, $$BiologicalLivingObject, UNPROVIDED, UNPROVIDED)) {
                    interval = list($$TimeIntervalInclusiveFn, time, ending_date);
                } else {
                    interval = list($$IntervalStartedByFn, time);
                }
                justifications = append(justification_2, list(forward_assertion));
                results_list = cons(list(interval, justifications, likelihood), results_list);
                return results_list;
            }
        }
        return NIL;
    }

    public static SubLObject collect_intervals_from_default_conditional_probability_statements(final SubLObject sentence, final SubLObject upper, final SubLObject justifyP) {
        final SubLObject col = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
        final SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, $const13$defaultConditionalProbabilityOfSt, ONE_INTEGER, UNPROVIDED));
        if (NIL != assertion) {
            final SubLObject prob = cycl_utilities.formula_arg4(assertion, UNPROVIDED);
            if (prob.numL(ONE_INTEGER)) {
                return collect_intervals_from_default_conditional_probability_statements_with_decaying_persistence(sentence, assertion, upper, justifyP);
            }
        }
        return NIL;
    }

    public static SubLObject collect_intervals_from_default_conditional_probability_statements_single(final SubLObject sentence, final SubLObject upper, final SubLObject time) {
        final SubLObject col = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
        final SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, $const13$defaultConditionalProbabilityOfSt, ONE_INTEGER, UNPROVIDED));
        if (NIL != assertion) {
            final SubLObject prob = cycl_utilities.formula_arg4(assertion, UNPROVIDED);
            if (prob.numL(ONE_INTEGER)) {
                return collect_intervals_from_default_conditional_probability_statements_with_decaying_persistence_single(sentence, assertion, upper, time);
            }
        }
        return NIL;
    }

    public static SubLObject collect_intervals_from_default_conditional_probability_statements_with_decaying_persistence(final SubLObject sentence, final SubLObject assertion, final SubLObject upper, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertion_time_pairs_for_fact = get_assertion_time_pairs_for_fact(sentence);
        SubLObject interval_justification_pairs = NIL;
        SubLObject result_entry = NIL;
        if ((NIL != assertion_time_pairs_for_fact) || (NIL != $intervals_from_genls_assertions$.getDynamicValue(thread))) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject prob = cycl_utilities.formula_arg4(gaf, UNPROVIDED);
            final SubLObject allowed_interval = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
            final SubLObject unit_of_allowed_interval = cycl_utilities.formula_arg0(allowed_interval);
            final SubLObject allowed_lower_limit = cycl_utilities.formula_arg1(allowed_interval, UNPROVIDED);
            final SubLObject allowed_upper_limit = cycl_utilities.formula_arg2(allowed_interval, UNPROVIDED);
            final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
            final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
            final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, UNPROVIDED);
            final SubLObject no_of_iterations = multiply(value_of_duration_of_time_interval, divide(log(upper, UNPROVIDED), log(prob, UNPROVIDED)));
            final SubLObject derived_lower_limit = list(unit_of_duration_of_time_interval, no_of_iterations);
            final SubLObject derived_upper_limit = list(unit_of_duration_of_time_interval, no_of_iterations);
            final SubLObject new_allowed_lower_limit = list(unit_of_allowed_interval, allowed_lower_limit);
            final SubLObject new_allowed_upper_limit = list(unit_of_allowed_interval, allowed_upper_limit);
            SubLObject lower_limit = NIL;
            SubLObject upper_limit = NIL;
            SubLObject cdolist_list_var = append(assertion_time_pairs_for_fact, $intervals_from_genls_assertions$.getDynamicValue(thread));
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject time_of_assertion = cycl_utilities.formula_arg0(entry);
                SubLObject justifications = NIL;
                final SubLObject just_1 = temporal_projection_utilities.format_justification_entry(cycl_utilities.formula_arg1(entry, UNPROVIDED));
                final SubLObject initial_point = temporal_projection_utilities.find_first_point_of_time(time_of_assertion);
                final SubLObject final_point = temporal_projection_utilities.find_last_point_of_time(time_of_assertion);
                if (allowed_interval.eql($$Forever_Quantity)) {
                    lower_limit = derived_lower_limit;
                } else
                    if (NIL != quantities.cyc_less_than_quantities(new_allowed_lower_limit, derived_lower_limit)) {
                        lower_limit = derived_lower_limit;
                    } else {
                        lower_limit = new_allowed_lower_limit;
                    }

                if (allowed_interval.eql($$Forever_Quantity)) {
                    upper_limit = derived_upper_limit;
                } else
                    if (NIL != quantities.cyc_less_than_quantities(derived_upper_limit, new_allowed_upper_limit)) {
                        upper_limit = derived_upper_limit;
                    } else {
                        upper_limit = new_allowed_upper_limit;
                    }

                if ((NIL != initial_point) && (NIL != final_point)) {
                    if (NIL != justifyP) {
                        justifications = append(list(assertion), just_1);
                        result_entry = list(list($$TimeIntervalInclusiveFn, date_utilities.date_before(initial_point, lower_limit), date_utilities.date_after(final_point, upper_limit)), justifications, upper);
                    } else {
                        result_entry = list(list($$TimeIntervalInclusiveFn, date_utilities.date_before(initial_point, lower_limit), date_utilities.date_after(final_point, upper_limit)), NIL, upper);
                    }
                    interval_justification_pairs = cons(verify_starting_and_ending_dates_for_isa_result_entry(result_entry, sentence, justifyP, upper), interval_justification_pairs);
                }
                if ((NIL != initial_point) && (NIL == final_point)) {
                    if (NIL != justifyP) {
                        justifications = append(list(assertion), just_1);
                        result_entry = list(list($$IntervalStartedByFn, date_utilities.date_before(initial_point, lower_limit)), justifications, upper);
                    } else {
                        result_entry = list(list($$IntervalStartedByFn, date_utilities.date_before(initial_point, lower_limit)), NIL, upper);
                    }
                    interval_justification_pairs = cons(verify_starting_and_ending_dates_for_isa_result_entry(result_entry, sentence, justifyP, upper), interval_justification_pairs);
                }
                if ((NIL != final_point) && (NIL == initial_point)) {
                    if (NIL != justifyP) {
                        justifications = append(list(assertion), just_1);
                        result_entry = list(list($$IntervalEndedByFn, date_utilities.date_after(final_point, upper_limit)), justifications, upper);
                    } else {
                        result_entry = list(list($$IntervalEndedByFn, date_utilities.date_after(final_point, upper_limit)), NIL, upper);
                    }
                    interval_justification_pairs = cons(verify_starting_and_ending_dates_for_isa_result_entry(result_entry, sentence, justifyP, upper), interval_justification_pairs);
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        }
        return interval_justification_pairs;
    }

    public static SubLObject collect_intervals_from_default_conditional_probability_statements_with_decaying_persistence_single(final SubLObject sentence, final SubLObject assertion, final SubLObject upper, final SubLObject time_of_assertion) {
        SubLObject interval_justification_pairs = NIL;
        SubLObject result_entry = NIL;
        final SubLObject gaf = assertions_high.gaf_formula(assertion);
        final SubLObject prob = cycl_utilities.formula_arg4(gaf, UNPROVIDED);
        final SubLObject allowed_interval = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
        final SubLObject unit_of_allowed_interval = cycl_utilities.formula_arg0(allowed_interval);
        final SubLObject allowed_lower_limit = cycl_utilities.formula_arg1(allowed_interval, UNPROVIDED);
        final SubLObject allowed_upper_limit = cycl_utilities.formula_arg2(allowed_interval, UNPROVIDED);
        final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
        final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
        final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, UNPROVIDED);
        final SubLObject no_of_iterations = multiply(value_of_duration_of_time_interval, divide(log(upper, UNPROVIDED), log(prob, UNPROVIDED)));
        final SubLObject derived_lower_limit = list(unit_of_duration_of_time_interval, no_of_iterations);
        final SubLObject derived_upper_limit = list(unit_of_duration_of_time_interval, no_of_iterations);
        final SubLObject new_allowed_lower_limit = list(unit_of_allowed_interval, allowed_lower_limit);
        final SubLObject new_allowed_upper_limit = list(unit_of_allowed_interval, allowed_upper_limit);
        SubLObject lower_limit = NIL;
        SubLObject upper_limit = NIL;
        SubLObject justifications = NIL;
        final SubLObject initial_point = temporal_projection_utilities.find_first_point_of_time(time_of_assertion);
        final SubLObject final_point = temporal_projection_utilities.find_last_point_of_time(time_of_assertion);
        if (allowed_interval.eql($$Forever_Quantity)) {
            lower_limit = derived_lower_limit;
        } else
            if (NIL != quantities.cyc_less_than_quantities(new_allowed_lower_limit, derived_lower_limit)) {
                lower_limit = derived_lower_limit;
            } else {
                lower_limit = new_allowed_lower_limit;
            }

        if (allowed_interval.eql($$Forever_Quantity)) {
            upper_limit = derived_upper_limit;
        } else
            if (NIL != quantities.cyc_less_than_quantities(derived_upper_limit, new_allowed_upper_limit)) {
                upper_limit = derived_upper_limit;
            } else {
                upper_limit = new_allowed_upper_limit;
            }

        if (cycl_utilities.formula_arg0(lower_limit).eql($$SecondsDuration)) {
            lower_limit = list($$SecondsDuration, floor(cycl_utilities.formula_arg1(lower_limit, UNPROVIDED), UNPROVIDED));
        }
        if (cycl_utilities.formula_arg0(upper_limit).eql($$SecondsDuration)) {
            upper_limit = list($$SecondsDuration, floor(cycl_utilities.formula_arg1(upper_limit, UNPROVIDED), UNPROVIDED));
        }
        if ((NIL != initial_point) && (NIL != final_point)) {
            justifications = list(assertion);
            result_entry = list(list($$TimeIntervalInclusiveFn, date_utilities.date_before(initial_point, lower_limit), date_utilities.date_after(final_point, upper_limit)), justifications, upper);
            interval_justification_pairs = cons(verify_starting_and_ending_dates_for_isa_result_entry(result_entry, sentence, T, upper), interval_justification_pairs);
        }
        if ((NIL != initial_point) && (NIL == final_point)) {
            justifications = list(assertion);
            result_entry = list(list($$IntervalStartedByFn, date_utilities.date_before(initial_point, lower_limit)), justifications, upper);
            interval_justification_pairs = cons(verify_starting_and_ending_dates_for_isa_result_entry(result_entry, sentence, T, upper), interval_justification_pairs);
        }
        if ((NIL != final_point) && (NIL == initial_point)) {
            justifications = list(assertion);
            result_entry = list(list($$IntervalEndedByFn, date_utilities.date_after(final_point, upper_limit)), justifications, upper);
        }
        interval_justification_pairs = cons(verify_starting_and_ending_dates_for_isa_result_entry(result_entry, sentence, T, upper), interval_justification_pairs);
        return interval_justification_pairs;
    }

    public static SubLObject collect_intervals_from_starting_and_ending_dates_for_arg(final SubLObject instance, final SubLObject assertions, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result_justification_pairs = NIL;
        SubLObject entry = NIL;
        thread.resetMultipleValues();
        final SubLObject starting_date = earliest_possible_starting_date_of_concept(instance);
        final SubLObject justifications_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != starting_date) {
            if (NIL != justifyP) {
                entry = list(list($$IntervalEndedByFn, starting_date), append(assertions, justifications_1), ONE_INTEGER);
            } else {
                entry = list(list($$IntervalEndedByFn, starting_date), NIL, ONE_INTEGER);
            }
            result_justification_pairs = cons(entry, result_justification_pairs);
        }
        thread.resetMultipleValues();
        final SubLObject ending_date = ending_date_of_concept(instance);
        final SubLObject justifications_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != ending_date) {
            if (NIL != justifyP) {
                entry = list(list($$IntervalStartedByFn, ending_date), append(assertions, justifications_2), ONE_INTEGER);
            } else {
                entry = list(list($$IntervalStartedByFn, ending_date), NIL, ONE_INTEGER);
            }
            result_justification_pairs = cons(entry, result_justification_pairs);
        }
        return result_justification_pairs;
    }

    public static SubLObject collect_intervals_for_non_isa_facts_from_starting_and_ending_dates(final SubLObject fact, final SubLObject justifyP) {
        final SubLObject pred = cycl_utilities.formula_arg0(fact);
        final SubLObject arg1 = cycl_utilities.formula_arg1(fact, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        SubLObject result_justification_pairs = NIL;
        SubLObject assertions = kb_mapping_utilities.pred_u_v_holds_gafs($$contemporaryInArg, pred, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != assertions) {
            final SubLObject result = collect_intervals_from_starting_and_ending_dates_for_arg(arg1, assertions, justifyP);
            if (NIL != result) {
                result_justification_pairs = append(result, result_justification_pairs);
            }
        }
        assertions = kb_mapping_utilities.pred_u_v_holds_gafs($$contemporaryInArg, pred, TWO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != assertions) {
            final SubLObject result = collect_intervals_from_starting_and_ending_dates_for_arg(arg2, assertions, justifyP);
            if (NIL != result) {
                result_justification_pairs = append(result, result_justification_pairs);
            }
        }
        return result_justification_pairs;
    }

    public static SubLObject collect_intervals_for_non_isa_facts_from_starting_and_ending_dates_single(final SubLObject fact, final SubLObject time) {
        final SubLObject pred = cycl_utilities.formula_arg0(fact);
        final SubLObject arg1 = cycl_utilities.formula_arg1(fact, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        SubLObject result_justification_pairs = NIL;
        SubLObject assertions = kb_mapping_utilities.pred_u_v_holds_gafs($$contemporaryInArg, pred, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != assertions) {
            SubLObject cdolist_list_var;
            final SubLObject result = cdolist_list_var = collect_intervals_from_starting_and_ending_dates_for_arg(arg1, assertions, T);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject interval = cycl_utilities.formula_arg0(entry);
                if (NIL != sbhl_time_query_processing.true_temporal_relation_literalP($$temporallyIntersects, interval, time, $POS, $$BaseKB)) {
                    result_justification_pairs = cons(entry, result_justification_pairs);
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        }
        assertions = kb_mapping_utilities.pred_u_v_holds_gafs($$contemporaryInArg, pred, TWO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != assertions) {
            SubLObject cdolist_list_var;
            final SubLObject result = cdolist_list_var = collect_intervals_from_starting_and_ending_dates_for_arg(arg2, assertions, T);
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject interval = cycl_utilities.formula_arg0(entry);
                if (NIL != sbhl_time_query_processing.true_temporal_relation_literalP($$temporallyIntersects, interval, time, $POS, $$BaseKB)) {
                    result_justification_pairs = cons(entry, result_justification_pairs);
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        }
        return result_justification_pairs;
    }

    public static SubLObject collect_intervals_from_starting_and_ending_dates(final SubLObject fact, final SubLObject justifyP) {
        if (cycl_utilities.formula_arg0(fact).eql($$isa)) {
            return collect_intervals_for_isa_facts_from_starting_and_ending_dates(fact, justifyP);
        }
        return collect_intervals_for_non_isa_facts_from_starting_and_ending_dates(fact, justifyP);
    }

    public static SubLObject collect_intervals_from_starting_and_ending_dates_single(final SubLObject fact, final SubLObject time) {
        if (cycl_utilities.formula_arg0(fact).eql($$isa)) {
            return collect_intervals_for_isa_facts_from_starting_and_ending_dates_single(fact, time);
        }
        return collect_intervals_for_non_isa_facts_from_starting_and_ending_dates_single(fact, time);
    }

    public static SubLObject verify_starting_and_ending_times_of_isa_facts(final SubLObject fact, final SubLObject mt_time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entity = cycl_utilities.formula_arg1(fact, UNPROVIDED);
        final SubLObject col = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        if (NIL != genls.genlP(col, $$SomethingExisting, UNPROVIDED, UNPROVIDED)) {
            thread.resetMultipleValues();
            SubLObject result = check_starting_time_of_concept(entity, mt_time);
            SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != result) {
                return values($numeric_likelihood_fn_zero$.getDynamicValue(thread), append(justifications, list(arguments.make_hl_support($GENLS, narts_high.nart_substitute(listS($$genls, col, $list42)), UNPROVIDED, UNPROVIDED))));
            }
            thread.resetMultipleValues();
            result = check_ending_time_of_concept(entity, mt_time);
            justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != result) {
                return values($numeric_likelihood_fn_zero$.getDynamicValue(thread), append(justifications, list(arguments.make_hl_support($GENLS, narts_high.nart_substitute(listS($$genls, col, $list42)), UNPROVIDED, UNPROVIDED))));
            }
        }
        return NIL;
    }

    public static SubLObject collect_intervals_for_isa_facts_from_starting_and_ending_dates(final SubLObject fact, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entity = cycl_utilities.formula_arg1(fact, UNPROVIDED);
        final SubLObject col = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        SubLObject result_justification_pairs = NIL;
        SubLObject entry = NIL;
        if (NIL != genls.genlP(col, $$BiologicalLivingObject, UNPROVIDED, UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject starting_date = earliest_possible_starting_date_of_concept(entity);
            final SubLObject justifications_1 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != starting_date) {
                if (NIL != justifyP) {
                    entry = list(list($$IntervalEndedByFn, starting_date), append(justifications_1, list(arguments.make_hl_support($GENLS, narts_high.nart_substitute(listS($$genls, col, $list43)), UNPROVIDED, UNPROVIDED))), ONE_INTEGER);
                } else {
                    entry = list(list($$IntervalEndedByFn, starting_date), NIL, ONE_INTEGER);
                }
                result_justification_pairs = cons(entry, result_justification_pairs);
            }
            thread.resetMultipleValues();
            final SubLObject ending_date = ending_date_of_concept(entity);
            final SubLObject justifications_2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != ending_date) {
                if (NIL != justifyP) {
                    entry = list(list($$IntervalStartedByFn, ending_date), append(justifications_2, list(arguments.make_hl_support($GENLS, narts_high.nart_substitute(listS($$genls, col, $list43)), UNPROVIDED, UNPROVIDED))), ONE_INTEGER);
                } else {
                    entry = list(list($$IntervalStartedByFn, ending_date), NIL, ONE_INTEGER);
                }
                result_justification_pairs = cons(entry, result_justification_pairs);
            }
            return result_justification_pairs;
        }
        return NIL;
    }

    public static SubLObject collect_intervals_for_isa_facts_from_starting_and_ending_dates_single(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entity = cycl_utilities.formula_arg1(fact, UNPROVIDED);
        final SubLObject col = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        SubLObject result_justification_pairs = NIL;
        SubLObject entry = NIL;
        if (NIL != genls.genlP(col, $$BiologicalLivingObject, UNPROVIDED, UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject starting_date = earliest_possible_starting_date_of_concept(entity);
            final SubLObject justifications_1 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != starting_date) {
                entry = list(list($$IntervalEndedByFn, starting_date), append(justifications_1, list(arguments.make_hl_support($GENLS, narts_high.nart_substitute(listS($$genls, col, $list43)), UNPROVIDED, UNPROVIDED))), ONE_INTEGER);
                final SubLObject interval = cycl_utilities.formula_arg0(entry);
                if (NIL != sbhl_time_query_processing.true_temporal_relation_literalP($$temporallySubsumes, interval, time, $POS, $$BaseKB)) {
                    result_justification_pairs = cons(entry, result_justification_pairs);
                }
            }
            thread.resetMultipleValues();
            final SubLObject ending_date = ending_date_of_concept(entity);
            final SubLObject justifications_2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != ending_date) {
                entry = list(list($$IntervalStartedByFn, ending_date), append(justifications_2, list(arguments.make_hl_support($GENLS, narts_high.nart_substitute(listS($$genls, col, $list43)), UNPROVIDED, UNPROVIDED))), ONE_INTEGER);
                final SubLObject interval = cycl_utilities.formula_arg0(entry);
                if (NIL != sbhl_time_query_processing.true_temporal_relation_literalP($$temporallySubsumes, interval, time, $POS, $$BaseKB)) {
                    result_justification_pairs = cons(entry, result_justification_pairs);
                }
            }
            return result_justification_pairs;
        }
        return NIL;
    }

    public static SubLObject verify_starting_and_ending_times_of_non_isa_facts(final SubLObject fact, final SubLObject mt_time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.formula_arg0(fact);
        final SubLObject arg_1 = cycl_utilities.formula_arg1(fact, UNPROVIDED);
        final SubLObject arg_2 = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        SubLObject assertions = kb_mapping_utilities.pred_u_v_holds_gafs($$contemporaryInArg, pred, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != assertions) {
            thread.resetMultipleValues();
            SubLObject result = check_starting_time_of_concept(arg_1, mt_time);
            SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != result) {
                return values($numeric_likelihood_fn_zero$.getDynamicValue(thread), append(justifications, assertions));
            }
            thread.resetMultipleValues();
            result = check_ending_time_of_concept(arg_1, mt_time);
            justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != result) {
                return values($numeric_likelihood_fn_zero$.getDynamicValue(thread), append(justifications, justifications));
            }
        }
        assertions = kb_mapping_utilities.pred_u_v_holds_gafs($$contemporaryInArg, pred, TWO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != assertions) {
            thread.resetMultipleValues();
            SubLObject result = check_starting_time_of_concept(arg_2, mt_time);
            SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != result) {
                return values($numeric_likelihood_fn_zero$.getDynamicValue(thread), append(assertions, justifications));
            }
            thread.resetMultipleValues();
            result = check_ending_time_of_concept(arg_2, mt_time);
            justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != result) {
                return values($numeric_likelihood_fn_zero$.getDynamicValue(thread), append(assertions, justifications));
            }
        }
        return NIL;
    }

    public static SubLObject verify_temporal_constraints_between_collections(final SubLObject fact, final SubLObject mt_time, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ins = cycl_utilities.formula_arg1(fact, UNPROVIDED);
        final SubLObject col = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(col, $const46$temporalConstraintBetweenCollecti, THREE_INTEGER, UNPROVIDED);
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject relation = cycl_utilities.formula_arg1(gaf, UNPROVIDED);
            final SubLObject new_fact = list($$isa, ins, cycl_utilities.formula_arg2(gaf, UNPROVIDED));
            SubLObject cdolist_list_var_$15;
            final SubLObject assertion_time_pairs = cdolist_list_var_$15 = get_assertion_time_pairs_for_fact(new_fact);
            SubLObject pair = NIL;
            pair = cdolist_list_var_$15.first();
            while (NIL != cdolist_list_var_$15) {
                final SubLObject time = cycl_utilities.formula_arg0(pair);
                final SubLObject assertion_1 = cycl_utilities.formula_arg1(pair, UNPROVIDED);
                if (relation.eql($$laterThan) && (NIL != not_all_points_are_later_thanP(time, mt_time))) {
                    if (NIL != justifyP) {
                        return values($numeric_likelihood_fn_zero$.getDynamicValue(thread), list(assertion_1, assertion));
                    }
                    return $numeric_likelihood_fn_zero$.getDynamicValue(thread);
                } else {
                    cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                    pair = cdolist_list_var_$15.first();
                }
            } 
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject collect_intervals_from_temporal_constraints_between_collections_for_negated_isa_sentence(final SubLObject sentence, final SubLObject justifyP) {
        final SubLObject col = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
        SubLObject entry = NIL;
        SubLObject interval_justification = NIL;
        final SubLObject ins = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
        if (NIL != isa.isaP(ins, col, UNPROVIDED, UNPROVIDED)) {
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(col, $const46$temporalConstraintBetweenCollecti, THREE_INTEGER, UNPROVIDED);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject relation = cycl_utilities.formula_arg1(gaf, UNPROVIDED);
                final SubLObject new_fact = list($$isa, ins, cycl_utilities.formula_arg2(gaf, UNPROVIDED));
                final SubLObject assertion_time_pairs = get_assertion_time_pairs_for_fact(new_fact);
                if (relation.eql($$laterThan)) {
                    SubLObject cdolist_list_var_$16 = assertion_time_pairs;
                    SubLObject pair = NIL;
                    pair = cdolist_list_var_$16.first();
                    while (NIL != cdolist_list_var_$16) {
                        final SubLObject time = cycl_utilities.formula_arg0(pair);
                        final SubLObject assertion_1 = cycl_utilities.formula_arg1(pair, UNPROVIDED);
                        if (NIL != justifyP) {
                            entry = list(list($$IntervalStartedByFn, time), list(assertion, assertion_1), ONE_INTEGER);
                        } else {
                            entry = list(list($$IntervalStartedByFn, time), NIL, ONE_INTEGER);
                        }
                        interval_justification = cons(entry, interval_justification);
                        cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                        pair = cdolist_list_var_$16.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
            return interval_justification;
        }
        return NIL;
    }

    public static SubLObject collect_intervals_from_temporal_constraints_between_collections_for_negated_isa_sentence_single(final SubLObject sentence, final SubLObject time_of_sentence) {
        final SubLObject col = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
        SubLObject entry = NIL;
        SubLObject interval_justification = NIL;
        final SubLObject ins = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
        if (NIL != isa.isaP(ins, col, UNPROVIDED, UNPROVIDED)) {
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(col, $const46$temporalConstraintBetweenCollecti, THREE_INTEGER, UNPROVIDED);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject relation = cycl_utilities.formula_arg1(gaf, UNPROVIDED);
                final SubLObject new_fact = list($$isa, ins, cycl_utilities.formula_arg2(gaf, UNPROVIDED));
                final SubLObject assertion_time_pairs = get_assertion_time_pairs_for_fact(new_fact);
                if (relation.eql($$laterThan)) {
                    SubLObject cdolist_list_var_$17 = assertion_time_pairs;
                    SubLObject pair = NIL;
                    pair = cdolist_list_var_$17.first();
                    while (NIL != cdolist_list_var_$17) {
                        final SubLObject time = cycl_utilities.formula_arg0(pair);
                        final SubLObject assertion_1 = cycl_utilities.formula_arg1(pair, UNPROVIDED);
                        entry = list(list($$IntervalStartedByFn, time), list(assertion, assertion_1), ONE_INTEGER);
                        final SubLObject interval = cycl_utilities.formula_arg0(entry);
                        if (NIL != sbhl_time_query_processing.true_temporal_relation_literalP($$temporallyIntersects, interval, time_of_sentence, $POS, $$BaseKB)) {
                            interval_justification = cons(entry, interval_justification);
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
        return NIL;
    }

    public static SubLObject not_all_points_are_later_thanP(final SubLObject time_1, final SubLObject time_2) {
        final SubLObject first_point_1 = temporal_projection_utilities.find_first_point_of_time(time_1);
        final SubLObject first_point_2 = temporal_projection_utilities.find_first_point_of_time(time_2);
        if ((NIL != first_point_1) && (NIL != first_point_2)) {
            return makeBoolean((NIL != date_utilities.dateL(first_point_1, first_point_2)) || (NIL == sbhl_time_query_processing.true_temporal_relation_literalP($$startsAfterStartingOf, first_point_1, first_point_2, $POS, $$BaseKB)));
        }
        return NIL;
    }

    public static SubLObject get_assertion_time_pairs_for_fact(final SubLObject fact) {
        final SubLObject assertions = get_assertions_for_fact_1(fact);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject time_for_assertion = get_time_for_assertion_1(assertion);
            if ((((NIL != time_for_assertion) && (!time_for_assertion.eql($$Always_TimeInterval))) && (NIL == temporal_projection_utilities.assertion_produced_by_temporal_projectionP(assertion))) && (NIL == nart_handles.nart_p(time_for_assertion))) {
                result = cons(list(time_for_assertion, assertion), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject get_time_for_assertion_1(final SubLObject assertion) {
        final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
        if ((assertion_mt.isList() && (NIL != cycl_utilities.formula_arg2(assertion_mt, UNPROVIDED))) && (cycl_utilities.formula_arg2(cycl_utilities.formula_arg2(assertion_mt, UNPROVIDED), UNPROVIDED).eql($$TimePoint) || (NIL == cycl_utilities.formula_arg2(cycl_utilities.formula_arg2(assertion_mt, UNPROVIDED), UNPROVIDED)))) {
            return possibly_replace_indexicals(cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(assertion_mt, UNPROVIDED), UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject get_time_for_assertion_2(final SubLObject assertion) {
        final SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
        if ((assertion_mt.isList() && (NIL != cycl_utilities.formula_arg2(assertion_mt, UNPROVIDED))) && (cycl_utilities.formula_arg2(cycl_utilities.formula_arg2(assertion_mt, UNPROVIDED), UNPROVIDED).eql($$TimePoint) || (NIL == cycl_utilities.formula_arg2(cycl_utilities.formula_arg2(assertion_mt, UNPROVIDED), UNPROVIDED)))) {
            return cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(assertion_mt, UNPROVIDED), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject possibly_replace_indexicals(final SubLObject mt_time) {
        if (cycl_utilities.formula_arg2(mt_time, UNPROVIDED).eql($$Now)) {
            return list(cycl_utilities.formula_arg0(mt_time), cycl_utilities.formula_arg1(mt_time, UNPROVIDED), date_utilities.indexical_now());
        }
        return mt_time;
    }

    public static SubLObject verify_temporal_relation_between_arguments(final SubLObject fact, SubLObject justifyP) {
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.formula_arg0(fact);
        final SubLObject arg_1 = cycl_utilities.formula_arg1(fact, UNPROVIDED);
        final SubLObject arg_2 = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(predicate, $$temporalRelationBetweenArguments, ONE_INTEGER, UNPROVIDED);
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject pos_1 = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
            final SubLObject pos_2 = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
            final SubLObject relation = cycl_utilities.formula_arg4(gaf, UNPROVIDED);
            SubLObject result = NIL;
            if ((pos_1.numE(ONE_INTEGER) && pos_2.numE(TWO_INTEGER)) && relation.eql($$endsAfterStartingOf)) {
                thread.resetMultipleValues();
                final SubLObject ending_date = lookup_ending_date_for_entity(arg_1);
                final SubLObject justification_1 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject starting_date = lookup_starting_date_for_entity(arg_2);
                final SubLObject justification_2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != ending_date) && (NIL != starting_date)) {
                    result = makeBoolean(NIL == sbhl_time_query_processing.true_temporal_relation_literalP(relation, ending_date, starting_date, $POS, $$BaseKB));
                    if (NIL != result) {
                        if (NIL != justifyP) {
                            return values(T, append(list(assertion), justification_1, justification_2));
                        }
                        return values(T, NIL);
                    }
                }
            }
            if ((pos_1.numE(TWO_INTEGER) && pos_2.numE(ONE_INTEGER)) && relation.eql($$endsAfterStartingOf)) {
                thread.resetMultipleValues();
                final SubLObject ending_date = lookup_ending_date_for_entity(arg_2);
                final SubLObject justification_1 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject starting_date = lookup_starting_date_for_entity(arg_1);
                final SubLObject justification_2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != starting_date) && (NIL != ending_date)) {
                    result = makeBoolean(NIL == sbhl_time_query_processing.true_temporal_relation_literalP(relation, ending_date, starting_date, $POS, $$BaseKB));
                    if (NIL != result) {
                        if (NIL != justifyP) {
                            return values(T, append(justification_1, justification_2, list(assertion)));
                        }
                        return values(T, NIL);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject collect_intervals_from_temporal_relation_between_arguments_assertions_for_negated_non_isa_sentence(final SubLObject fact, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg_1 = cycl_utilities.formula_arg1(fact, UNPROVIDED);
        final SubLObject arg_2 = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        final SubLObject predicate = cycl_utilities.formula_arg0(fact);
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(predicate, $$temporalRelationBetweenArguments, ONE_INTEGER, UNPROVIDED);
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject relation = cycl_utilities.formula_arg4(gaf, UNPROVIDED);
            final SubLObject pos_1 = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
            final SubLObject pos_2 = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
            if ((pos_1.numE(ONE_INTEGER) && pos_2.numE(TWO_INTEGER)) && relation.eql($$endsAfterStartingOf)) {
                thread.resetMultipleValues();
                final SubLObject ending_date = ending_date_of_concept(arg_1);
                final SubLObject justification_1 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != ending_date) {
                    thread.resetMultipleValues();
                    final SubLObject starting_date = earliest_possible_starting_date_of_concept(arg_2);
                    final SubLObject justification_2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != starting_date) {
                        if (NIL == sbhl_time_query_processing.true_temporal_relation_literalP(relation, arg_1, arg_2, $POS, UNPROVIDED)) {
                            if (NIL != justifyP) {
                                return list(list($$Always_TimeInterval, append(justification_1, justification_2, list(assertion)), ONE_INTEGER));
                            }
                            return list(list($$Always_TimeInterval, NIL, ONE_INTEGER));
                        } else {
                            if (NIL != justifyP) {
                                return list(list(list($$IntervalEndedByFn, starting_date), append(justification_1, justification_2, list(assertion)), ONE_INTEGER));
                            }
                            return list(list(list($$IntervalEndedByFn, starting_date), NIL, ONE_INTEGER));
                        }
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject collect_intervals_from_temporal_relation_between_arguments_assertions_for_negated_non_isa_sentence_single(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg_1 = cycl_utilities.formula_arg1(fact, UNPROVIDED);
        final SubLObject arg_2 = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        final SubLObject predicate = cycl_utilities.formula_arg0(fact);
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(predicate, $$temporalRelationBetweenArguments, ONE_INTEGER, UNPROVIDED);
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject relation = cycl_utilities.formula_arg4(gaf, UNPROVIDED);
            final SubLObject pos_1 = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
            final SubLObject pos_2 = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
            if ((pos_1.numE(ONE_INTEGER) && pos_2.numE(TWO_INTEGER)) && relation.eql($$endsAfterStartingOf)) {
                thread.resetMultipleValues();
                final SubLObject ending_date = ending_date_of_concept(arg_1);
                final SubLObject justification_1 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != ending_date) {
                    thread.resetMultipleValues();
                    final SubLObject starting_date = earliest_possible_starting_date_of_concept(arg_2);
                    final SubLObject justification_2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != starting_date) {
                        if (NIL == sbhl_time_query_processing.true_temporal_relation_literalP(relation, ending_date, starting_date, $POS, $$BaseKB)) {
                            return list(list($$Always_TimeInterval, append(justification_1, justification_2, list(assertion)), ONE_INTEGER));
                        }
                        final SubLObject interval = list($$IntervalEndedByFn, starting_date);
                        if (NIL != sbhl_time_query_processing.true_temporal_relation_literalP($$temporallyIntersects, interval, time, $POS, $$BaseKB)) {
                            return list(list(interval, append(justification_1, justification_2, list(assertion)), ONE_INTEGER));
                        }
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject verify_genls_and_disjoint_with_constraints(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
        try {
            sdc.$ignoring_sdcP$.bind(T, thread);
            final SubLObject entity = cycl_utilities.formula_arg1(fact, UNPROVIDED);
            final SubLObject col_1 = cycl_utilities.formula_arg2(fact, UNPROVIDED);
            final SubLObject pred_var = $$isa;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(entity, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(entity, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$18 = NIL;
                            final SubLObject token_var_$19 = NIL;
                            while (NIL == done_var_$18) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                final SubLObject valid_$20 = makeBoolean(!token_var_$19.eql(assertion));
                                if (NIL != valid_$20) {
                                    final SubLObject gaf = assertions_high.gaf_formula(assertion);
                                    final SubLObject assertion_time = get_time_for_assertion_1(assertion);
                                    if (NIL != assertion_time) {
                                        final SubLObject col_2 = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
                                        if (NIL != sbhl_time_query_processing.true_temporal_relation_literalP($$temporallySubsumes, assertion_time, mt_time, $POS, $$BaseKB)) {
                                            if (NIL != disjoint_with.disjoint_withP(col_1, col_2, UNPROVIDED, UNPROVIDED)) {
                                                if (NIL != justifyP) {
                                                    return values($numeric_likelihood_fn_zero$.getDynamicValue(thread), append(list(assertion), list(arguments.make_hl_support($DISJOINTWITH, narts_high.nart_substitute(list($$disjointWith, col_1, col_2)), UNPROVIDED, UNPROVIDED))));
                                                }
                                                return values($numeric_likelihood_fn_zero$.getDynamicValue(thread), NIL);
                                            } else
                                                if (NIL != genls.genlP(col_2, col_1, UNPROVIDED, UNPROVIDED)) {
                                                    if (NIL != justifyP) {
                                                        return values($numeric_likelihood_fn_one$.getDynamicValue(thread), append(list(assertion), list(arguments.make_hl_support($GENLS, narts_high.nart_substitute(list($$genls, col_2, col_1)), UNPROVIDED, UNPROVIDED))));
                                                    }
                                                    return values($numeric_likelihood_fn_one$.getDynamicValue(thread), NIL);
                                                }

                                        }
                                    }
                                }
                                done_var_$18 = makeBoolean(NIL == valid_$20);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject collect_intervals_from_disjoint_assertions(final SubLObject sentence, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
        try {
            sdc.$ignoring_sdcP$.bind(T, thread);
            final SubLObject entity = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
            final SubLObject col_1 = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
            SubLObject interval_justification_pairs = NIL;
            SubLObject entry = NIL;
            final SubLObject pred_var = $$isa;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(entity, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(entity, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$22 = NIL;
                            final SubLObject token_var_$23 = NIL;
                            while (NIL == done_var_$22) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$23);
                                final SubLObject valid_$24 = makeBoolean(!token_var_$23.eql(assertion));
                                if (((NIL != valid_$24) && assertions_high.assertion_truth(assertion).eql($TRUE)) && (NIL == temporal_projection_utilities.assertion_produced_by_temporal_projectionP(assertion))) {
                                    final SubLObject gaf = assertions_high.gaf_formula(assertion);
                                    final SubLObject assertion_time = temporal_projection_utilities.possibly_get_nauts_from_narts(get_time_for_assertion_2(assertion));
                                    if (NIL != assertion_time) {
                                        final SubLObject col_2 = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
                                        if (NIL != disjoint_with.disjoint_withP(col_1, col_2, UNPROVIDED, UNPROVIDED)) {
                                            if (NIL != justifyP) {
                                                entry = list(assertion_time, append(new SubLObject[]{ list(assertion, arguments.make_hl_support($DISJOINTWITH, narts_high.nart_substitute(list($$disjointWith, col_1, col_2)), UNPROVIDED, UNPROVIDED)) }), ONE_INTEGER);
                                            } else {
                                                entry = list(assertion_time, NIL, ONE_INTEGER);
                                            }
                                            interval_justification_pairs = cons(entry, interval_justification_pairs);
                                        }
                                    }
                                }
                                done_var_$22 = makeBoolean(NIL == valid_$24);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            return interval_justification_pairs;
        } finally {
            sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject collect_intervals_from_disjoint_assertions_single(final SubLObject sentence, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
        try {
            sdc.$ignoring_sdcP$.bind(T, thread);
            final SubLObject entity = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
            final SubLObject col_1 = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
            SubLObject interval_justification_pairs = NIL;
            SubLObject entry = NIL;
            final SubLObject pred_var = $$isa;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(entity, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(entity, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$26 = NIL;
                            final SubLObject token_var_$27 = NIL;
                            while (NIL == done_var_$26) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$27);
                                final SubLObject valid_$28 = makeBoolean(!token_var_$27.eql(assertion));
                                if (((NIL != valid_$28) && assertions_high.assertion_truth(assertion).eql($TRUE)) && (NIL == temporal_projection_utilities.assertion_produced_by_temporal_projectionP(assertion))) {
                                    final SubLObject gaf = assertions_high.gaf_formula(assertion);
                                    final SubLObject assertion_time = temporal_projection_utilities.possibly_get_nauts_from_narts(get_time_for_assertion_2(assertion));
                                    if (NIL != assertion_time) {
                                        final SubLObject col_2 = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
                                        if (NIL != disjoint_with.disjoint_withP(col_1, col_2, UNPROVIDED, UNPROVIDED)) {
                                            entry = list(assertion_time, append(new SubLObject[]{ list(assertion, arguments.make_hl_support($DISJOINTWITH, narts_high.nart_substitute(list($$disjointWith, col_1, col_2)), UNPROVIDED, UNPROVIDED)) }), ONE_INTEGER);
                                            final SubLObject interval = cycl_utilities.formula_arg0(entry);
                                            if (NIL != sbhl_time_query_processing.true_temporal_relation_literalP($$temporallySubsumes, interval, time, $POS, $$BaseKB)) {
                                                interval_justification_pairs = cons(entry, interval_justification_pairs);
                                            }
                                        }
                                    }
                                }
                                done_var_$26 = makeBoolean(NIL == valid_$28);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            return interval_justification_pairs;
        } finally {
            sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject collect_intervals_from_genls_assertions(final SubLObject sentence, final SubLObject justifyP) {
        final SubLObject entity = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
        final SubLObject col_1 = cycl_utilities.formula_arg2(sentence, UNPROVIDED);
        SubLObject entry = NIL;
        SubLObject interval_justification_pairs = NIL;
        final SubLObject pred_var = $$isa;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(entity, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(entity, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                        SubLObject done_var_$30 = NIL;
                        final SubLObject token_var_$31 = NIL;
                        while (NIL == done_var_$30) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$31);
                            final SubLObject valid_$32 = makeBoolean(!token_var_$31.eql(assertion));
                            if (((NIL != valid_$32) && (NIL == temporal_projection_utilities.assertion_produced_by_temporal_projectionP(assertion))) && assertions_high.assertion_truth(assertion).eql($TRUE)) {
                                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                                final SubLObject assertion_time = temporal_projection_utilities.possibly_get_nauts_from_narts(get_time_for_assertion_2(assertion));
                                if (NIL != assertion_time) {
                                    final SubLObject col_2 = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
                                    if (NIL != genls.genlP(col_2, col_1, UNPROVIDED, UNPROVIDED)) {
                                        if (NIL != justifyP) {
                                            entry = list(assertion_time, append(list(assertion), list(arguments.make_hl_support($GENLS, narts_high.nart_substitute(list($$genls, col_2, col_1)), UNPROVIDED, UNPROVIDED))), ONE_INTEGER);
                                        } else {
                                            entry = list(assertion_time, NIL, ONE_INTEGER);
                                        }
                                        interval_justification_pairs = cons(entry, interval_justification_pairs);
                                    }
                                }
                            }
                            done_var_$30 = makeBoolean(NIL == valid_$32);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        $intervals_from_genls_assertions$.setDynamicValue(interval_justification_pairs);
        return interval_justification_pairs;
    }

    public static SubLObject verify_starting_and_ending_times(final SubLObject fact, final SubLObject mt_time) {
        if (cycl_utilities.formula_arg0(fact).eql($$isa)) {
            return verify_starting_and_ending_times_of_isa_facts(fact, mt_time);
        }
        return verify_starting_and_ending_times_of_non_isa_facts(fact, mt_time);
    }

    public static SubLObject check_starting_time_of_concept(final SubLObject entity, final SubLObject mt_time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject starting_time = find_known_or_expected_starting_date(entity);
        final SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(date_utilities.dateL(mt_time, starting_time), justifications);
    }

    public static SubLObject check_ending_time_of_concept(final SubLObject entity, final SubLObject mt_time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject ending_time = lookup_ending_date_for_entity(entity);
        final SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(date_utilities.dateL(ending_time, mt_time), justifications);
    }

    public static SubLObject earliest_possible_starting_date_of_concept(final SubLObject entity) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs(entity, $$startingDate, ONE_INTEGER, UNPROVIDED);
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        if (NIL != cdolist_list_var) {
            final SubLObject date = cycl_utilities.formula_arg2(assertions_high.gaf_formula(assertion), UNPROVIDED);
            $temporal_projection_list_of_starting_dates$.setDynamicValue(cons(list(entity, date, list(assertion)), $temporal_projection_list_of_starting_dates$.getDynamicValue(thread)), thread);
            return values(date, list(assertion));
        }
        all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs(entity, $$birthDate, ONE_INTEGER, UNPROVIDED);
        assertion = NIL;
        assertion = cdolist_list_var.first();
        if (NIL != cdolist_list_var) {
            final SubLObject date = cycl_utilities.formula_arg2(assertions_high.gaf_formula(assertion), UNPROVIDED);
            $temporal_projection_list_of_starting_dates$.setDynamicValue(cons(list(entity, date, list(assertion)), $temporal_projection_list_of_starting_dates$.getDynamicValue(thread)), thread);
            return values(date, list(assertion));
        }
        if (NIL != isa.isaP(entity, $$SomethingExisting, UNPROVIDED, UNPROVIDED)) {
            SubLObject cdolist_list_var2 = isa.isa(entity, UNPROVIDED, UNPROVIDED);
            SubLObject col = NIL;
            col = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject cdolist_list_var_$33 = kb_mapping_utilities.pred_value_gafs(col, $$earliestDateForCollectionMembers, ONE_INTEGER, UNPROVIDED);
                SubLObject assertion2 = NIL;
                assertion2 = cdolist_list_var_$33.first();
                if (NIL != cdolist_list_var_$33) {
                    final SubLObject date2 = cycl_utilities.formula_arg2(assertions_high.gaf_formula(assertion2), UNPROVIDED);
                    $temporal_projection_list_of_starting_dates$.setDynamicValue(cons(list(entity, date2, list(assertion2)), $temporal_projection_list_of_starting_dates$.getDynamicValue(thread)), thread);
                    return values(date2, list(assertion2));
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                col = cdolist_list_var2.first();
            } 
        }
        return NIL;
    }

    public static SubLObject ending_date_of_concept(final SubLObject entity) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs(entity, $$dateOfDeath, ONE_INTEGER, UNPROVIDED);
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        if (NIL != cdolist_list_var) {
            final SubLObject date = cycl_utilities.formula_arg2(assertions_high.gaf_formula(assertion), UNPROVIDED);
            $temporal_projection_list_of_ending_dates$.setDynamicValue(cons(list(entity, date, list(assertion)), $temporal_projection_list_of_ending_dates$.getDynamicValue(thread)), thread);
            return values(date, list(assertion));
        }
        all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs(entity, $$endingDate, ONE_INTEGER, UNPROVIDED);
        assertion = NIL;
        assertion = cdolist_list_var.first();
        if (NIL != cdolist_list_var) {
            final SubLObject date = cycl_utilities.formula_arg2(assertions_high.gaf_formula(assertion), UNPROVIDED);
            $temporal_projection_list_of_ending_dates$.setDynamicValue(cons(list(entity, date, list(assertion)), $temporal_projection_list_of_ending_dates$.getDynamicValue(thread)), thread);
            return values(date, list(assertion));
        }
        return NIL;
    }

    public static SubLObject get_assertions_for_fact_1(final SubLObject fact) {
        final SubLObject a = cycl_utilities.formula_arg0(fact);
        SubLObject b = cycl_utilities.formula_arg1(fact, UNPROVIDED);
        SubLObject c = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        if ((NIL != b) && b.isList()) {
            final SubLObject b_nart = narts_high.find_nart(b);
            if (NIL != b_nart) {
                b = b_nart;
            }
        }
        if ((NIL != c) && c.isList()) {
            final SubLObject c_nart = narts_high.find_nart(c);
            if (NIL != c_nart) {
                c = c_nart;
            }
        }
        if (length(fact).numE(THREE_INTEGER)) {
            return kb_mapping_utilities.pred_u_v_holds_gafs(a, b, c, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject find_likelihood_of_truth_of_non_isa_sentence_by_using_decay_distributions(final SubLObject fact, final SubLObject time, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject result = use_type_level_distributions_for_computing_likelihood(fact, time, justifyP);
        SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != result) {
            return values(result, justifications);
        }
        thread.resetMultipleValues();
        result = use_default_conditional_probability_for_sentence_in_interval(fact, time, justifyP);
        justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != result) {
            return values(result, justifications);
        }
        return NIL;
    }

    public static SubLObject use_type_level_distributions_for_computing_likelihood(final SubLObject fact, final SubLObject time, final SubLObject justifyP) {
        final SubLObject type_level_distribution = temporal_projection_cols.find_type_level_distribution_for_sentence(fact);
        if (NIL != type_level_distribution) {
            final SubLObject assertion_time_pair = get_assertion_closest_to_given_time(fact, time);
            if (NIL != assertion_time_pair) {
                final SubLObject dist_sent = cycl_utilities.formula_arg2(type_level_distribution, UNPROVIDED);
                final SubLObject prob = cycl_utilities.formula_arg6(dist_sent, UNPROVIDED);
                final SubLObject duration_of_interval = cycl_utilities.formula_arg5(dist_sent, UNPROVIDED);
                final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_interval);
                final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_interval, UNPROVIDED);
                final SubLObject time_1 = cycl_utilities.formula_arg0(assertion_time_pair);
                SubLObject justifications = list(cycl_utilities.formula_arg1(assertion_time_pair, UNPROVIDED));
                final SubLObject time_elapsed = find_time_elapsed_between_time_points(time, time_1);
                final SubLObject no_of_iterations = multiply(cycl_utilities.formula_arg1(time_elapsed, UNPROVIDED), quantities.convert_to_units(unit_of_duration_of_time_interval, cycl_utilities.formula_arg0(time_elapsed), value_of_duration_of_time_interval, UNPROVIDED));
                final SubLObject likelihood = expt(prob, no_of_iterations);
                if (NIL != justifyP) {
                    justifications = append(justifications, list(type_level_distribution));
                } else {
                    justifications = NIL;
                }
                return values(list($$NumericLikelihoodFn, likelihood), justifications);
            }
        }
        return NIL;
    }

    public static SubLObject use_default_conditional_probability_for_sentence_in_interval(final SubLObject fact, final SubLObject time, final SubLObject justifyP) {
        final SubLObject predicate = cycl_utilities.formula_arg0(fact);
        SubLObject justifications = NIL;
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(predicate, $const60$defaultConditionalProbabilityForS, ONE_INTEGER, UNPROVIDED);
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject interval = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
            final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
            final SubLObject prob = cycl_utilities.formula_arg4(gaf, UNPROVIDED);
            final SubLObject closest_assertion_time_pair = get_assertion_closest_to_given_time(fact, time);
            if (NIL != closest_assertion_time_pair) {
                final SubLObject assertion_2 = cycl_utilities.formula_arg1(closest_assertion_time_pair, UNPROVIDED);
                final SubLObject time_2 = cycl_utilities.formula_arg0(closest_assertion_time_pair);
                final SubLObject time_elapsed = find_time_elapsed_between_time_points(time, time_2);
                if (interval.eql($$Forever_Quantity) || (NIL != quantities.cyc_quantity_subsumes(interval, time_elapsed))) {
                    final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
                    final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, UNPROVIDED);
                    final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0(time_elapsed);
                    final SubLObject value_of_time_elapsed = cycl_utilities.formula_arg1(time_elapsed, UNPROVIDED);
                    final SubLObject unit_conversion = quantities.convert_to_units(unit_of_duration_of_time_interval, unit_of_time_elapsed, ONE_INTEGER, UNPROVIDED);
                    if ((((NIL != unit_conversion) && (NIL != value_of_time_elapsed)) && (NIL != prob)) && (NIL != value_of_duration_of_time_interval)) {
                        final SubLObject likelihood = expt(prob, multiply(divide(value_of_time_elapsed, value_of_duration_of_time_interval), unit_conversion));
                        if (NIL != likelihood) {
                            if (NIL != justifyP) {
                                justifications = append(justifications, list(assertion, assertion_2));
                                justifications = append(justifications, plausibility_utilities.hl_justify_asent_fast(list($$timeElapsed, time, time_2, time_elapsed), $$BaseKB));
                                return values(list($$NumericLikelihoodFn, likelihood), justifications);
                            }
                            return values(list($$NumericLikelihoodFn, likelihood));
                        }
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject collect_intervals_from_default_conditional_probability_for_sentence_in_interval(final SubLObject fact, final SubLObject justifyP, final SubLObject upper) {
        final SubLObject predicate = cycl_utilities.formula_arg0(fact);
        final SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(predicate, $const60$defaultConditionalProbabilityForS, ONE_INTEGER, UNPROVIDED));
        if (NIL != assertion) {
            return collect_intervals_from_default_conditional_prob_for_sentence(fact, assertion, justifyP, upper);
        }
        return NIL;
    }

    public static SubLObject collect_intervals_from_default_conditional_probability_for_sentence_in_interval_single(final SubLObject fact, final SubLObject time, final SubLObject upper) {
        final SubLObject result = collect_intervals_from_forward_and_backward_distributions_for_predicates_single(fact, time, upper);
        if (NIL != result) {
            return result;
        }
        final SubLObject predicate = cycl_utilities.formula_arg0(fact);
        final SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(predicate, $const60$defaultConditionalProbabilityForS, ONE_INTEGER, UNPROVIDED));
        if (NIL != assertion) {
            return collect_intervals_from_default_conditional_prob_for_sentence_single(fact, assertion, time, upper);
        }
        return NIL;
    }

    public static SubLObject collect_intervals_from_forward_and_backward_distributions_for_predicates_single(final SubLObject fact, final SubLObject time, final SubLObject upper) {
        final SubLObject predicate = cycl_utilities.formula_arg0(fact);
        final SubLObject forward_assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(predicate, $const61$defaultConditionalProbabilityForS, UNPROVIDED, UNPROVIDED));
        if (NIL != forward_assertion) {
            return collect_intervals_from_forward_distributions_for_predicates_single(fact, forward_assertion, time, upper);
        }
        return NIL;
    }

    public static SubLObject collect_intervals_from_forward_distributions_for_predicates_single(final SubLObject fact, final SubLObject forward_distribution, final SubLObject time, final SubLObject upper) {
        final SubLObject gaf = assertions_high.gaf_formula(forward_distribution);
        final SubLObject prob = cycl_utilities.formula_arg4(gaf, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject entry = NIL;
        if (prob.numE(ONE_INTEGER)) {
            SubLObject interval = NIL;
            interval = list($$IntervalStartedByFn, time);
            entry = list(interval, list(forward_distribution), ONE_INTEGER);
            result = cons(verify_result_entry(entry, fact, T, upper), result);
        }
        return result;
    }

    public static SubLObject collect_intervals_from_default_conditional_prob_for_sentence(final SubLObject fact, final SubLObject assertion, final SubLObject justifyP, final SubLObject upper) {
        if (cycl_utilities.formula_arg4(assertions_high.gaf_formula(assertion), UNPROVIDED).numE(ONE_INTEGER)) {
            return get_intervals_for_always_true_sentence(fact, assertion, justifyP, upper);
        }
        return get_intervals_for_sentence_with_decaying_persistence(fact, assertion, justifyP, upper);
    }

    public static SubLObject collect_intervals_from_default_conditional_prob_for_sentence_single(final SubLObject fact, final SubLObject assertion, final SubLObject time, final SubLObject upper) {
        if (cycl_utilities.formula_arg4(assertions_high.gaf_formula(assertion), UNPROVIDED).numE(ONE_INTEGER)) {
            return get_intervals_for_always_true_sentence_single(fact, assertion, time, upper);
        }
        return get_intervals_for_sentence_with_decaying_persistence_single(fact, assertion, time, upper);
    }

    public static SubLObject collect_intervals_from_default_conditional_prob_for_sentence_backward_from_time(final SubLObject fact, final SubLObject dist_assertion, final SubLObject time, final SubLObject justifications, final SubLObject justifyP, final SubLObject upper_threshold) {
        if (cycl_utilities.formula_arg4(assertions_high.gaf_formula(dist_assertion), UNPROVIDED).numL(ONE_INTEGER)) {
            return get_intervals_for_sentence_with_decaying_persistence_backwards_in_time(fact, dist_assertion, time, justifications, justifyP, upper_threshold);
        }
        return NIL;
    }

    public static SubLObject collect_intervals_from_default_conditional_prob_for_sentence_forward_from_time(final SubLObject fact, final SubLObject dist_assertion, final SubLObject time, final SubLObject justifications, final SubLObject justifyP, final SubLObject upper_threshold) {
        if (cycl_utilities.formula_arg4(assertions_high.gaf_formula(dist_assertion), UNPROVIDED).numL(ONE_INTEGER)) {
            return get_intervals_for_sentence_with_decaying_persistence_forward_in_time(fact, dist_assertion, time, justifications, justifyP, upper_threshold);
        }
        return NIL;
    }

    public static SubLObject collect_intervals_from_default_conditional_prob_of_state_forward_from_time(final SubLObject sentence, final SubLObject forward_distribution, final SubLObject time, final SubLObject justifications, final SubLObject justifyP, final SubLObject upper_threshold) {
        if (cycl_utilities.formula_arg4(assertions_high.gaf_formula(forward_distribution), UNPROVIDED).numL(ONE_INTEGER)) {
            return get_intervals_for_state_with_decaying_persistence_forward_in_time(sentence, forward_distribution, time, justifications, justifyP, upper_threshold);
        }
        return NIL;
    }

    public static SubLObject collect_intervals_from_type_level_distributions_forward(final SubLObject sentence, final SubLObject forward_distribution, final SubLObject time, final SubLObject justifications, final SubLObject justifyP, final SubLObject upper_threshold) {
        if (cycl_utilities.formula_arg6(assertions_high.gaf_formula(forward_distribution), UNPROVIDED).numL(ONE_INTEGER)) {
            return get_intervals_from_decaying_type_level_distributions_forward_in_time(sentence, forward_distribution, time, justifications, justifyP, upper_threshold);
        }
        return NIL;
    }

    public static SubLObject get_intervals_from_decaying_type_level_distributions_forward_in_time(final SubLObject fact, final SubLObject assertion, final SubLObject time_of_assertion, final SubLObject justifications, final SubLObject justifyP, final SubLObject upper) {
        SubLObject interval_justification_pairs = NIL;
        SubLObject result_entry = NIL;
        final SubLObject gaf = assertions_high.gaf_formula(assertion);
        final SubLObject prob = cycl_utilities.formula_arg6(gaf, UNPROVIDED);
        final SubLObject allowed_interval = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
        final SubLObject unit_of_allowed_interval = cycl_utilities.formula_arg0(allowed_interval);
        final SubLObject allowed_upper_limit = cycl_utilities.formula_arg2(allowed_interval, UNPROVIDED);
        final SubLObject duration_of_time_interval = cycl_utilities.formula_arg5(gaf, UNPROVIDED);
        final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
        final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, UNPROVIDED);
        final SubLObject no_of_iterations = multiply(value_of_duration_of_time_interval, divide(log(upper, UNPROVIDED), log(prob, UNPROVIDED)));
        final SubLObject derived_upper_limit = list(unit_of_duration_of_time_interval, no_of_iterations);
        final SubLObject new_allowed_upper_limit = list(unit_of_allowed_interval, allowed_upper_limit);
        SubLObject upper_limit = NIL;
        SubLObject justifications_1 = NIL;
        final SubLObject initial_point = temporal_projection_utilities.find_first_point_of_time(time_of_assertion);
        final SubLObject final_point = temporal_projection_utilities.find_last_point_of_time(time_of_assertion);
        if (allowed_interval.eql($$Forever_Quantity)) {
            upper_limit = derived_upper_limit;
        } else
            if (NIL != quantities.cyc_less_than_quantities(derived_upper_limit, new_allowed_upper_limit)) {
                upper_limit = derived_upper_limit;
            } else {
                upper_limit = new_allowed_upper_limit;
            }

        if ((NIL != initial_point) && (NIL != final_point)) {
            if (NIL != justifyP) {
                justifications_1 = append(list(assertion), justifications);
                result_entry = list(list($$TimeIntervalInclusiveFn, time_of_assertion, date_utilities.date_after(final_point, upper_limit)), justifications_1, upper);
            } else {
                result_entry = list(list($$TimeIntervalInclusiveFn, time_of_assertion, date_utilities.date_after(final_point, upper_limit)), NIL, upper);
            }
            interval_justification_pairs = cons(verify_result_entry(result_entry, fact, justifyP, upper), interval_justification_pairs);
        }
        return interval_justification_pairs;
    }

    public static SubLObject get_intervals_for_sentence_with_decaying_persistence_backwards_in_time(final SubLObject fact, final SubLObject assertion, final SubLObject time_of_assertion, final SubLObject justifications, final SubLObject justifyP, final SubLObject upper) {
        SubLObject interval_justification_pairs = NIL;
        SubLObject result_entry = NIL;
        final SubLObject gaf = assertions_high.gaf_formula(assertion);
        final SubLObject prob = cycl_utilities.formula_arg4(gaf, UNPROVIDED);
        final SubLObject allowed_interval = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
        final SubLObject unit_of_allowed_interval = cycl_utilities.formula_arg0(allowed_interval);
        final SubLObject allowed_lower_limit = cycl_utilities.formula_arg1(allowed_interval, UNPROVIDED);
        final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
        final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
        final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, UNPROVIDED);
        final SubLObject no_of_iterations = multiply(value_of_duration_of_time_interval, divide(log(prob, UNPROVIDED), log(upper, UNPROVIDED)));
        final SubLObject derived_lower_limit = list(unit_of_duration_of_time_interval, no_of_iterations);
        final SubLObject new_allowed_lower_limit = list(unit_of_allowed_interval, allowed_lower_limit);
        SubLObject lower_limit = NIL;
        SubLObject justifications_1 = NIL;
        final SubLObject initial_point = temporal_projection_utilities.find_first_point_of_time(time_of_assertion);
        final SubLObject final_point = temporal_projection_utilities.find_last_point_of_time(time_of_assertion);
        if (allowed_interval.eql($$Forever_Quantity)) {
            lower_limit = derived_lower_limit;
        } else
            if (NIL != quantities.cyc_less_than_quantities(new_allowed_lower_limit, derived_lower_limit)) {
                lower_limit = derived_lower_limit;
            } else {
                lower_limit = new_allowed_lower_limit;
            }

        if ((NIL != initial_point) && (NIL != final_point)) {
            if (NIL != justifyP) {
                justifications_1 = append(list(assertion), justifications);
                result_entry = list(list($$TimeIntervalInclusiveFn, date_utilities.date_before(initial_point, lower_limit), time_of_assertion), justifications_1, upper);
            } else {
                result_entry = list(list($$TimeIntervalInclusiveFn, date_utilities.date_before(initial_point, lower_limit), time_of_assertion), NIL, upper);
            }
            interval_justification_pairs = cons(verify_result_entry(result_entry, fact, justifyP, upper), interval_justification_pairs);
        }
        return interval_justification_pairs;
    }

    public static SubLObject get_intervals_for_sentence_with_decaying_persistence_forward_in_time(final SubLObject fact, final SubLObject assertion, final SubLObject time_of_assertion, final SubLObject justifications, final SubLObject justifyP, final SubLObject upper) {
        SubLObject interval_justification_pairs = NIL;
        SubLObject result_entry = NIL;
        final SubLObject gaf = assertions_high.gaf_formula(assertion);
        final SubLObject prob = cycl_utilities.formula_arg4(gaf, UNPROVIDED);
        final SubLObject allowed_interval = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
        final SubLObject unit_of_allowed_interval = cycl_utilities.formula_arg0(allowed_interval);
        final SubLObject allowed_upper_limit = cycl_utilities.formula_arg2(allowed_interval, UNPROVIDED);
        final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
        final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
        final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, UNPROVIDED);
        final SubLObject no_of_iterations = multiply(value_of_duration_of_time_interval, divide(log(prob, UNPROVIDED), log(upper, UNPROVIDED)));
        final SubLObject derived_upper_limit = list(unit_of_duration_of_time_interval, no_of_iterations);
        final SubLObject new_allowed_upper_limit = list(unit_of_allowed_interval, allowed_upper_limit);
        SubLObject upper_limit = NIL;
        SubLObject justifications_1 = NIL;
        final SubLObject initial_point = temporal_projection_utilities.find_first_point_of_time(time_of_assertion);
        final SubLObject final_point = temporal_projection_utilities.find_last_point_of_time(time_of_assertion);
        if (allowed_interval.eql($$Forever_Quantity)) {
            upper_limit = derived_upper_limit;
        } else
            if (NIL != quantities.cyc_less_than_quantities(derived_upper_limit, new_allowed_upper_limit)) {
                upper_limit = derived_upper_limit;
            } else {
                upper_limit = new_allowed_upper_limit;
            }

        if ((NIL != initial_point) && (NIL != final_point)) {
            if (NIL != justifyP) {
                justifications_1 = append(list(assertion), justifications);
                result_entry = list(list($$TimeIntervalInclusiveFn, time_of_assertion, date_utilities.date_after(final_point, upper_limit)), justifications_1, upper);
            } else {
                result_entry = list(list($$TimeIntervalInclusiveFn, time_of_assertion, date_utilities.date_after(final_point, upper_limit)), NIL, upper);
            }
            interval_justification_pairs = cons(verify_result_entry(result_entry, fact, justifyP, upper), interval_justification_pairs);
        }
        return interval_justification_pairs;
    }

    public static SubLObject get_intervals_for_state_with_decaying_persistence_forward_in_time(final SubLObject fact, final SubLObject assertion, final SubLObject time_of_assertion, final SubLObject justifications, final SubLObject justifyP, final SubLObject upper) {
        SubLObject interval_justification_pairs = NIL;
        SubLObject result_entry = NIL;
        final SubLObject gaf = assertions_high.gaf_formula(assertion);
        final SubLObject prob = cycl_utilities.formula_arg4(gaf, UNPROVIDED);
        final SubLObject allowed_interval = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
        final SubLObject unit_of_allowed_interval = cycl_utilities.formula_arg0(allowed_interval);
        final SubLObject allowed_upper_limit = cycl_utilities.formula_arg2(allowed_interval, UNPROVIDED);
        final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
        final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
        final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, UNPROVIDED);
        final SubLObject no_of_iterations = multiply(value_of_duration_of_time_interval, divide(log(upper, UNPROVIDED), log(prob, UNPROVIDED)));
        final SubLObject derived_upper_limit = list(unit_of_duration_of_time_interval, no_of_iterations);
        final SubLObject new_allowed_upper_limit = list(unit_of_allowed_interval, allowed_upper_limit);
        SubLObject upper_limit = NIL;
        SubLObject justifications_1 = NIL;
        final SubLObject initial_point = temporal_projection_utilities.find_first_point_of_time(time_of_assertion);
        final SubLObject final_point = temporal_projection_utilities.find_last_point_of_time(time_of_assertion);
        if (allowed_interval.eql($$Forever_Quantity)) {
            upper_limit = derived_upper_limit;
        } else
            if (NIL != quantities.cyc_less_than_quantities(derived_upper_limit, new_allowed_upper_limit)) {
                upper_limit = derived_upper_limit;
            } else {
                upper_limit = new_allowed_upper_limit;
            }

        if ((NIL != initial_point) && (NIL != final_point)) {
            if (NIL != justifyP) {
                justifications_1 = append(list(assertion), justifications);
                result_entry = list(list($$TimeIntervalInclusiveFn, time_of_assertion, date_utilities.date_after(final_point, upper_limit)), justifications_1, upper);
            } else {
                result_entry = list(list($$TimeIntervalInclusiveFn, time_of_assertion, date_utilities.date_after(final_point, upper_limit)), NIL, upper);
            }
            interval_justification_pairs = cons(verify_result_entry(result_entry, fact, justifyP, upper), interval_justification_pairs);
        }
        return interval_justification_pairs;
    }

    public static SubLObject get_intervals_for_sentence_with_decaying_persistence(final SubLObject fact, final SubLObject assertion, final SubLObject justifyP, final SubLObject upper) {
        final SubLObject assertions_and_time_for_fact = get_assertion_time_pairs_for_fact(fact);
        SubLObject interval_justification_pairs = NIL;
        SubLObject result_entry = NIL;
        if (NIL != assertions_and_time_for_fact) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject prob = cycl_utilities.formula_arg4(gaf, UNPROVIDED);
            final SubLObject allowed_interval = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
            final SubLObject unit_of_allowed_interval = cycl_utilities.formula_arg0(allowed_interval);
            final SubLObject allowed_lower_limit = cycl_utilities.formula_arg1(allowed_interval, UNPROVIDED);
            final SubLObject allowed_upper_limit = cycl_utilities.formula_arg2(allowed_interval, UNPROVIDED);
            final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
            final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
            final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, UNPROVIDED);
            final SubLObject no_of_iterations = multiply(value_of_duration_of_time_interval, divide(log(prob, UNPROVIDED), log(upper, UNPROVIDED)));
            final SubLObject derived_lower_limit = list(unit_of_duration_of_time_interval, no_of_iterations);
            final SubLObject derived_upper_limit = list(unit_of_duration_of_time_interval, no_of_iterations);
            final SubLObject new_allowed_lower_limit = list(unit_of_allowed_interval, allowed_lower_limit);
            final SubLObject new_allowed_upper_limit = list(unit_of_allowed_interval, allowed_upper_limit);
            SubLObject lower_limit = NIL;
            SubLObject upper_limit = NIL;
            SubLObject cdolist_list_var = assertions_and_time_for_fact;
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject time_of_assertion = cycl_utilities.formula_arg0(entry);
                SubLObject justifications = NIL;
                final SubLObject assertion_1 = cycl_utilities.formula_arg1(entry, UNPROVIDED);
                final SubLObject initial_point = temporal_projection_utilities.find_first_point_of_time(time_of_assertion);
                final SubLObject final_point = temporal_projection_utilities.find_last_point_of_time(time_of_assertion);
                if (allowed_interval.eql($$Forever_Quantity)) {
                    lower_limit = derived_lower_limit;
                } else
                    if (NIL != quantities.cyc_less_than_quantities(new_allowed_lower_limit, derived_lower_limit)) {
                        lower_limit = derived_lower_limit;
                    } else {
                        lower_limit = new_allowed_lower_limit;
                    }

                if (allowed_interval.eql($$Forever_Quantity)) {
                    upper_limit = derived_upper_limit;
                } else
                    if (NIL != quantities.cyc_less_than_quantities(derived_upper_limit, new_allowed_upper_limit)) {
                        upper_limit = derived_upper_limit;
                    } else {
                        upper_limit = new_allowed_upper_limit;
                    }

                if ((NIL != initial_point) && (NIL != final_point)) {
                    if (NIL != justifyP) {
                        justifications = append(list(assertion), list(assertion_1));
                        result_entry = list(list($$TimeIntervalInclusiveFn, date_utilities.date_before(initial_point, lower_limit), date_utilities.date_after(final_point, upper_limit)), justifications, upper);
                    } else {
                        result_entry = list(list($$TimeIntervalInclusiveFn, date_utilities.date_before(initial_point, lower_limit), date_utilities.date_after(final_point, upper_limit)), NIL, upper);
                    }
                    interval_justification_pairs = cons(verify_starting_and_ending_dates_for_result_entry(result_entry, fact, justifyP, upper), interval_justification_pairs);
                }
                if ((NIL != initial_point) && (NIL == final_point)) {
                    if (NIL != justifyP) {
                        justifications = append(list(assertion), list(assertion_1));
                        result_entry = list(list($$IntervalStartedByFn, date_utilities.date_before(initial_point, lower_limit)), justifications, upper);
                    } else {
                        result_entry = list(list($$IntervalStartedByFn, date_utilities.date_before(initial_point, lower_limit)), NIL, upper);
                    }
                    interval_justification_pairs = cons(verify_starting_and_ending_dates_for_result_entry(result_entry, fact, justifyP, upper), interval_justification_pairs);
                }
                if ((NIL != final_point) && (NIL == initial_point)) {
                    if (NIL != justifyP) {
                        justifications = append(list(assertion), list(assertion_1));
                        result_entry = list(list($$IntervalEndedByFn, date_utilities.date_after(final_point, upper_limit)), justifications, upper);
                    } else {
                        result_entry = list(list($$IntervalEndedByFn, date_utilities.date_after(final_point, upper_limit)), NIL, upper);
                    }
                    interval_justification_pairs = cons(verify_starting_and_ending_dates_for_result_entry(result_entry, fact, justifyP, upper), interval_justification_pairs);
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        }
        return interval_justification_pairs;
    }

    public static SubLObject get_intervals_for_sentence_with_decaying_persistence_single(final SubLObject fact, final SubLObject assertion, final SubLObject time_of_assertion, final SubLObject upper) {
        SubLObject interval_justification_pairs = NIL;
        SubLObject result_entry = NIL;
        final SubLObject gaf = assertions_high.gaf_formula(assertion);
        final SubLObject prob = cycl_utilities.formula_arg4(gaf, UNPROVIDED);
        final SubLObject allowed_interval = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
        final SubLObject unit_of_allowed_interval = cycl_utilities.formula_arg0(allowed_interval);
        final SubLObject allowed_lower_limit = cycl_utilities.formula_arg1(allowed_interval, UNPROVIDED);
        final SubLObject allowed_upper_limit = cycl_utilities.formula_arg2(allowed_interval, UNPROVIDED);
        final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
        final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
        final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, UNPROVIDED);
        final SubLObject no_of_iterations = multiply(value_of_duration_of_time_interval, divide(log(upper, UNPROVIDED), log(prob, UNPROVIDED)));
        final SubLObject derived_lower_limit = list(unit_of_duration_of_time_interval, no_of_iterations);
        final SubLObject derived_upper_limit = list(unit_of_duration_of_time_interval, no_of_iterations);
        final SubLObject new_allowed_lower_limit = list(unit_of_allowed_interval, allowed_lower_limit);
        final SubLObject new_allowed_upper_limit = list(unit_of_allowed_interval, allowed_upper_limit);
        SubLObject lower_limit = NIL;
        SubLObject upper_limit = NIL;
        SubLObject justifications = NIL;
        final SubLObject initial_point = temporal_projection_utilities.find_first_point_of_time(time_of_assertion);
        final SubLObject final_point = temporal_projection_utilities.find_last_point_of_time(time_of_assertion);
        if (allowed_interval.eql($$Forever_Quantity)) {
            lower_limit = derived_lower_limit;
        } else
            if (NIL != quantities.cyc_less_than_quantities(new_allowed_lower_limit, derived_lower_limit)) {
                lower_limit = derived_lower_limit;
            } else {
                lower_limit = new_allowed_lower_limit;
            }

        if (allowed_interval.eql($$Forever_Quantity)) {
            upper_limit = derived_upper_limit;
        } else
            if (NIL != quantities.cyc_less_than_quantities(derived_upper_limit, new_allowed_upper_limit)) {
                upper_limit = derived_upper_limit;
            } else {
                upper_limit = new_allowed_upper_limit;
            }

        if ((NIL != initial_point) && (NIL != final_point)) {
            justifications = list(assertion);
            result_entry = list(list($$TimeIntervalInclusiveFn, date_utilities.date_before(initial_point, lower_limit), date_utilities.date_after(final_point, upper_limit)), justifications, upper);
            interval_justification_pairs = cons(verify_starting_and_ending_dates_for_result_entry(result_entry, fact, T, upper), interval_justification_pairs);
        }
        if ((NIL != initial_point) && (NIL == final_point)) {
            justifications = list(assertion);
            result_entry = list(list($$IntervalStartedByFn, date_utilities.date_before(initial_point, lower_limit)), justifications, upper);
            interval_justification_pairs = cons(verify_starting_and_ending_dates_for_result_entry(result_entry, fact, T, upper), interval_justification_pairs);
        }
        if ((NIL != final_point) && (NIL == initial_point)) {
            justifications = list(assertion);
            result_entry = list(list($$IntervalEndedByFn, date_utilities.date_after(final_point, upper_limit)), justifications, upper);
            interval_justification_pairs = cons(verify_starting_and_ending_dates_for_result_entry(result_entry, fact, T, upper), interval_justification_pairs);
        }
        return interval_justification_pairs;
    }

    public static SubLObject verify_result_entry(final SubLObject entry, final SubLObject sentence, final SubLObject justifyP, final SubLObject upper) {
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        if (predicate.eql($$isa)) {
            return verify_starting_and_ending_dates_for_isa_result_entry(entry, sentence, justifyP, upper);
        }
        return verify_starting_and_ending_dates_for_result_entry(entry, sentence, justifyP, upper);
    }

    public static SubLObject verify_starting_and_ending_dates_for_result_entry(final SubLObject entry, final SubLObject fact, final SubLObject justifyP, final SubLObject upper_threshold) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject time = cycl_utilities.formula_arg0(entry);
        final SubLObject justifications = cycl_utilities.formula_arg1(entry, UNPROVIDED);
        final SubLObject arg1 = cycl_utilities.formula_arg1(fact, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        final SubLObject likelihood = cycl_utilities.formula_arg2(entry, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject interval_1 = find_known_or_expected_lifespan_of_entity(arg1, justifyP, upper_threshold, fact);
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject interval_2 = find_known_or_expected_lifespan_of_entity(arg2, justifyP, upper_threshold, fact);
        final SubLObject justification_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != interval_1) && (NIL != interval_2)) {
            if (NIL != justifyP) {
                return values(list(hlmt_relevance.temporal_intersection_set(list(time, interval_1, interval_2)), append(justifications, justification_1, justification_2), likelihood));
            }
            return values(list(hlmt_relevance.temporal_intersection_set(list(time, interval_1, interval_2)), NIL, likelihood));
        } else
            if (NIL != interval_1) {
                if (NIL != justifyP) {
                    return values(list(hlmt_relevance.temporal_intersection_set(list(time, interval_1)), append(justifications, justification_1), likelihood));
                }
                return values(list(hlmt_relevance.temporal_intersection_set(list(time, interval_1)), NIL, likelihood));
            } else
                if (NIL != interval_2) {
                    if (NIL != justifyP) {
                        return values(list(hlmt_relevance.temporal_intersection_set(list(time, interval_2))), append(justifications, justification_2), likelihood);
                    }
                    return values(list(hlmt_relevance.temporal_intersection_set(list(time, interval_2)), NIL, likelihood));
                } else {
                    if (!cycl_utilities.formula_arg0(entry).eql($$TheEmptyTimeInterval)) {
                        return entry;
                    }
                    return NIL;
                }


    }

    public static SubLObject verify_starting_and_ending_dates_for_isa_result_entry(final SubLObject entry, final SubLObject sentence, final SubLObject justifyP, final SubLObject upper) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current_interval = cycl_utilities.formula_arg0(entry);
        SubLObject justifications = cycl_utilities.formula_arg1(entry, UNPROVIDED);
        final SubLObject likelihood_1 = cycl_utilities.formula_arg2(entry, UNPROVIDED);
        final SubLObject arg1 = cycl_utilities.formula_arg1(sentence, UNPROVIDED);
        final SubLObject interval_justification_pairs_from_temporal_constraint_between_collections = collect_intervals_from_temporal_constraints_between_collections_for_negated_isa_sentence(sentence, justifyP);
        thread.resetMultipleValues();
        final SubLObject interval_1 = find_known_or_expected_lifespan_of_entity(arg1, justifyP, upper, NIL);
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != interval_1) {
            current_interval = hlmt_relevance.temporal_intersection_set(list(current_interval, interval_1));
            if (NIL != justifyP) {
                justifications = append(justifications, justification_1);
            }
        }
        SubLObject cdolist_list_var = interval_justification_pairs_from_temporal_constraint_between_collections;
        SubLObject interval_justification_pair = NIL;
        interval_justification_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject interval = cycl_utilities.formula_arg0(interval_justification_pair);
            final SubLObject just_1 = cycl_utilities.formula_arg1(interval_justification_pair, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject difference_interval = subtract_interval(current_interval, interval);
            final SubLObject changedP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != changedP) {
                current_interval = difference_interval;
                if (NIL != justifyP) {
                    justifications = append(justifications, just_1);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            interval_justification_pair = cdolist_list_var.first();
        } 
        if (!current_interval.eql($$TheEmptyTimeInterval)) {
            return list(current_interval, justifications, likelihood_1);
        }
        return NIL;
    }

    public static SubLObject subtract_interval(final SubLObject interval_1, final SubLObject interval_2) {
        if (NIL != sbhl_time_query_processing.true_temporal_relation_literalP($$temporallyDisjoint, interval_1, interval_2, $POS, $$BaseKB)) {
            return values(interval_1, NIL);
        }
        if (NIL != sbhl_time_query_processing.true_temporal_relation_literalP($$startsAfterStartingOf, interval_2, interval_1, $POS, $$BaseKB)) {
            SubLObject temporal_function = cycl_utilities.formula_arg0(interval_1);
            final SubLObject first_point_1 = temporal_projection_utilities.find_first_point_of_time(interval_1);
            final SubLObject first_point_2 = temporal_projection_utilities.find_first_point_of_time(interval_2);
            if ((NIL != first_point_1) && (NIL != first_point_2)) {
                if (temporal_function.eql($$TimeIntervalInclusiveFn)) {
                    temporal_function = $$TimeInterval_Incl_Excl_Fn;
                }
                return values(list(temporal_function, first_point_1, first_point_2), T);
            }
        }
        return values(interval_1, NIL);
    }

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
        if ((NIL != starting_date) && (NIL != ending_date)) {
            if (NIL != justifyP) {
                return values(list($$TimeIntervalInclusiveFn, starting_date, ending_date), append(justification_1, justification_2), threshold);
            }
            return values(list($$TimeIntervalInclusiveFn, starting_date, ending_date), NIL, threshold);
        } else
            if (NIL != starting_date) {
                if (NIL != justifyP) {
                    return values(list($$IntervalStartedByFn, starting_date), justification_1, threshold);
                }
                return values(list($$IntervalStartedByFn, starting_date), NIL, threshold);
            } else {
                if (NIL == ending_date) {
                    return NIL;
                }
                if (NIL != justifyP) {
                    return values(list($$IntervalEndedByFn, ending_date), justification_2, threshold);
                }
                return values(list($$IntervalEndedByFn, ending_date), NIL, threshold);
            }

    }

    public static SubLObject get_intervals_for_always_true_sentence(final SubLObject fact, final SubLObject dist_assertion, final SubLObject justifyP, final SubLObject upper_threshold) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assertions_and_time_pairs_for_fact = get_assertion_time_pairs_for_fact(fact);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = assertions_and_time_pairs_for_fact;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject time = cycl_utilities.formula_arg0(pair);
            final SubLObject assertion = cycl_utilities.formula_arg1(pair, UNPROVIDED);
            final SubLObject arg1 = cycl_utilities.formula_arg1(fact, UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.formula_arg2(fact, UNPROVIDED);
            SubLObject lower = NIL;
            SubLObject upper = NIL;
            thread.resetMultipleValues();
            final SubLObject starting_date_1 = find_known_or_expected_starting_date(arg1);
            final SubLObject justification_1 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject starting_date_2 = find_known_or_expected_starting_date(arg2);
            final SubLObject justification_2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject ending_date_1 = find_known_or_expected_ending_date(arg1, upper_threshold, UNPROVIDED);
            final SubLObject justification_3 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject ending_date_2 = find_known_or_expected_ending_date(arg2, upper_threshold, fact);
            final SubLObject justification_4 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            lower = find_later_date(starting_date_1, starting_date_2);
            if (NIL != lower) {
                upper = find_earlier_date(ending_date_1, ending_date_2);
                if ((NIL != lower) && (NIL != upper)) {
                    if (NIL != justifyP) {
                        result = cons(list(list($$TimeIntervalInclusiveFn, lower, upper), append(new SubLObject[]{ list(assertion), list(dist_assertion), justification_1, justification_2, justification_3, justification_4 }), ONE_INTEGER), result);
                    } else {
                        result = cons(list(list($$TimeIntervalInclusiveFn, lower, upper), NIL, ONE_INTEGER), result);
                    }
                }
                if (NIL == upper) {
                    if (NIL != justifyP) {
                        result = cons(list(list($$IntervalStartedByFn, lower), append(justification_1, justification_2, list(assertion), list(dist_assertion)), ONE_INTEGER), result);
                    } else {
                        result = cons(list(list($$IntervalStartedByFn, lower), NIL, ONE_INTEGER), result);
                    }
                }
            }
            if (NIL == lower) {
                if (NIL != justifyP) {
                    result = cons(list(list($$IntervalStartedByFn, time), append(justification_2, justification_4, list(dist_assertion, assertion)), ONE_INTEGER), result);
                } else {
                    result = cons(list(list($$IntervalStartedByFn, time), NIL, ONE_INTEGER), result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject get_intervals_for_always_true_sentence_single(final SubLObject fact, final SubLObject dist_assertion, final SubLObject time, final SubLObject upper_threshold) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject arg1 = cycl_utilities.formula_arg1(fact, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        SubLObject lower = NIL;
        SubLObject upper = NIL;
        thread.resetMultipleValues();
        final SubLObject starting_date_1 = find_known_or_expected_starting_date(arg1);
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject starting_date_2 = find_known_or_expected_starting_date(arg2);
        final SubLObject justification_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject ending_date_1 = find_known_or_expected_ending_date(arg1, upper_threshold, UNPROVIDED);
        final SubLObject justification_3 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject ending_date_2 = find_known_or_expected_ending_date(arg2, upper_threshold, fact);
        final SubLObject justification_4 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        lower = find_later_date(starting_date_1, starting_date_2);
        if (NIL != lower) {
            upper = find_earlier_date(ending_date_1, ending_date_2);
            if ((NIL != lower) && (NIL != upper)) {
                result = cons(list(list($$TimeIntervalInclusiveFn, lower, upper), append(new SubLObject[]{ list(dist_assertion), justification_1, justification_2, justification_3, justification_4 }), ONE_INTEGER), result);
            }
            if (NIL == upper) {
                result = cons(list(list($$IntervalStartedByFn, lower), append(justification_1, justification_2, list(dist_assertion), list(dist_assertion)), ONE_INTEGER), result);
            }
            if (NIL == lower) {
                result = cons(list(list($$IntervalStartedByFn, time), append(justification_3, justification_4, list(dist_assertion), ONE_INTEGER)), result);
            }
        }
        if ((((NIL == lower) && (NIL == upper)) && (NIL == isa.isaP(arg1, $$BiologicalLivingObject, UNPROVIDED, UNPROVIDED))) && (NIL == isa.isaP(arg2, $$BiologicalLivingObject, UNPROVIDED, UNPROVIDED))) {
            result = cons(list($$Always_TimeInterval, list(dist_assertion), ONE_INTEGER), result);
        }
        return result;
    }

    public static SubLObject collect_intervals_from_initial_and_terminal_in_args_facts(final SubLObject sentence, final SubLObject upper, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        SubLObject interval_justification_pairs = NIL;
        final SubLObject initial_in_arg_assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(predicate, $$initialInArg, UNPROVIDED, UNPROVIDED));
        final SubLObject terminal_in_arg_assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(predicate, $$terminalInArg, UNPROVIDED, UNPROVIDED));
        if ((NIL != initial_in_arg_assertion) || (NIL != terminal_in_arg_assertion)) {
            final SubLObject assertion_time_pairs = get_assertion_time_pairs_for_fact(sentence);
            if (NIL != assertion_time_pairs) {
                if (NIL != initial_in_arg_assertion) {
                    final SubLObject gaf = assertions_high.gaf_formula(initial_in_arg_assertion);
                    final SubLObject arg_pos = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
                    final SubLObject entity = nth(arg_pos, sentence);
                    thread.resetMultipleValues();
                    final SubLObject starting_date = find_known_or_expected_starting_date(entity);
                    final SubLObject justification_1 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != starting_date) {
                        SubLObject cdolist_list_var = assertion_time_pairs;
                        SubLObject pair = NIL;
                        pair = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject time = cycl_utilities.formula_arg0(pair);
                            final SubLObject assertion = cycl_utilities.formula_arg1(pair, UNPROVIDED);
                            if (NIL != justifyP) {
                                interval_justification_pairs = cons(list(list($$TimeIntervalInclusiveFn, starting_date, time), append(list(assertion, initial_in_arg_assertion), justification_1), ONE_INTEGER), interval_justification_pairs);
                            } else {
                                interval_justification_pairs = cons(list(list($$TimeIntervalInclusiveFn, starting_date, time), NIL, ONE_INTEGER), interval_justification_pairs);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            pair = cdolist_list_var.first();
                        } 
                    }
                }
                if (NIL != terminal_in_arg_assertion) {
                    final SubLObject gaf = assertions_high.gaf_formula(terminal_in_arg_assertion);
                    final SubLObject arg_pos = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
                    final SubLObject entity = nth(arg_pos, sentence);
                    thread.resetMultipleValues();
                    final SubLObject ending_date = find_known_or_expected_ending_date(entity, upper, justifyP);
                    final SubLObject justification_1 = thread.secondMultipleValue();
                    final SubLObject likelihood = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != ending_date) {
                        SubLObject cdolist_list_var2 = assertion_time_pairs;
                        SubLObject pair2 = NIL;
                        pair2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            final SubLObject time2 = cycl_utilities.formula_arg0(pair2);
                            final SubLObject assertion2 = cycl_utilities.formula_arg1(pair2, UNPROVIDED);
                            if (NIL != justifyP) {
                                interval_justification_pairs = cons(list(list($$TimeIntervalInclusiveFn, time2, ending_date), append(list(assertion2, terminal_in_arg_assertion), justification_1), likelihood), interval_justification_pairs);
                            } else {
                                interval_justification_pairs = cons(list(list($$TimeIntervalInclusiveFn, time2, ending_date), NIL, likelihood), interval_justification_pairs);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            pair2 = cdolist_list_var2.first();
                        } 
                    }
                }
            }
            return interval_justification_pairs;
        }
        return NIL;
    }

    public static SubLObject collect_intervals_from_initial_and_terminal_in_args_facts_single(final SubLObject sentence, final SubLObject upper, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        SubLObject interval_justification_pairs = NIL;
        final SubLObject initial_in_arg_assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(predicate, $$initialInArg, UNPROVIDED, UNPROVIDED));
        final SubLObject terminal_in_arg_assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(predicate, $$terminalInArg, UNPROVIDED, UNPROVIDED));
        if (NIL != initial_in_arg_assertion) {
            final SubLObject gaf = assertions_high.gaf_formula(initial_in_arg_assertion);
            final SubLObject arg_pos = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
            final SubLObject entity = nth(arg_pos, sentence);
            thread.resetMultipleValues();
            final SubLObject starting_date = find_known_or_expected_starting_date(entity);
            final SubLObject justification_1 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != starting_date) {
                interval_justification_pairs = cons(list(list($$TimeIntervalInclusiveFn, starting_date, time), append(list(initial_in_arg_assertion), justification_1), ONE_INTEGER), interval_justification_pairs);
            }
        }
        if (NIL != terminal_in_arg_assertion) {
            final SubLObject gaf = assertions_high.gaf_formula(terminal_in_arg_assertion);
            final SubLObject arg_pos = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
            final SubLObject entity = nth(arg_pos, sentence);
            thread.resetMultipleValues();
            final SubLObject ending_date = find_known_or_expected_ending_date(entity, upper, T);
            final SubLObject justification_1 = thread.secondMultipleValue();
            final SubLObject likelihood = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != ending_date) {
                interval_justification_pairs = cons(list(list($$TimeIntervalInclusiveFn, time, ending_date), append(list(terminal_in_arg_assertion), justification_1), likelihood), interval_justification_pairs);
            }
        }
        return interval_justification_pairs;
    }

    public static SubLObject find_later_date(final SubLObject date_1, final SubLObject date_2) {
        if (NIL == date_1) {
            return date_2;
        }
        if (NIL == date_2) {
            return date_1;
        }
        if (NIL != time_is_before_thanP(date_1, date_2)) {
            return date_2;
        }
        return date_1;
    }

    public static SubLObject find_earlier_date(final SubLObject date_1, final SubLObject date_2) {
        if (NIL == date_1) {
            return date_2;
        }
        if (NIL == date_2) {
            return date_1;
        }
        if (NIL != time_is_before_thanP(date_1, date_2)) {
            return date_1;
        }
        return date_2;
    }

    public static SubLObject find_known_or_expected_starting_date(final SubLObject entity) {
        return lookup_starting_date_for_entity(entity);
    }

    public static SubLObject find_known_or_expected_ending_date(final SubLObject entity, final SubLObject upper, SubLObject fact) {
        if (fact == UNPROVIDED) {
            fact = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.formula_arg0(fact);
        if (NIL != pred) {
            if (entity.equal(cycl_utilities.formula_arg2(fact, UNPROVIDED)) && (NIL == kb_mapping_utilities.pred_u_v_holds_gafs($$contemporaryInArg, pred, TWO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                return NIL;
            }
            if (entity.equal(cycl_utilities.formula_arg1(fact, UNPROVIDED)) && (NIL == kb_mapping_utilities.pred_u_v_holds_gafs($$contemporaryInArg, pred, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                return NIL;
            }
        }
        thread.resetMultipleValues();
        final SubLObject ending_date = lookup_ending_date_for_entity(entity);
        SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != ending_date) {
            return values(ending_date, justifications, ONE_INTEGER);
        }
        if (NIL != isa.isaP(entity, $$Person, UNPROVIDED, UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject starting_date = lookup_starting_date_for_entity(entity);
            justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != starting_date) {
                if (NIL == $extended_temporal_projection_mode$.getDynamicValue(thread)) {
                    return values(date_utilities.date_after(starting_date, $list68), justifications, upper);
                }
                final SubLObject last_known_point_of_existence = temporal_projection_utilities.find_the_latest_known_time_point_of_existence(entity);
                if (NIL != last_known_point_of_existence) {
                    final SubLObject age = date_utilities.time_elapsed(starting_date, last_known_point_of_existence, UNPROVIDED);
                    final SubLObject expected_life = temporal_projection_utilities.find_expected_survival_duration_at_age(age, upper);
                    return date_utilities.date_after(starting_date, expected_life);
                }
            }
        }
        return NIL;
    }

    public static SubLObject get_assertion_closest_to_given_time(final SubLObject fact, final SubLObject time) {
        final SubLObject assertion_time_pairs = get_assertion_time_pairs_for_fact(fact);
        if (length(assertion_time_pairs).numE(ONE_INTEGER)) {
            return cycl_utilities.formula_arg0(assertion_time_pairs);
        }
        if (NIL != assertion_time_pairs) {
            SubLObject current_best_assertion_time_pair = cycl_utilities.formula_arg0(assertion_time_pairs);
            SubLObject current_best_time_elapsed = find_time_elapsed_between_time_points(time, cycl_utilities.formula_arg0(current_best_assertion_time_pair));
            SubLObject cdolist_list_var = cycl_utilities.formula_args(assertion_time_pairs, UNPROVIDED);
            SubLObject assertion_time_pair = NIL;
            assertion_time_pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject current_time_elapsed = find_time_elapsed_between_time_points(time, cycl_utilities.formula_arg0(assertion_time_pair));
                if (NIL != quantities.cyc_less_than_quantities(current_time_elapsed, current_best_time_elapsed)) {
                    current_best_assertion_time_pair = assertion_time_pair;
                    current_best_time_elapsed = current_time_elapsed;
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion_time_pair = cdolist_list_var.first();
            } 
            return current_best_assertion_time_pair;
        }
        return NIL;
    }

    public static SubLObject get_closest_assertion_before_time(final SubLObject fact, final SubLObject time) {
        final SubLObject assertion_time_pairs = get_assertion_time_pairs_for_fact(fact);
        if (NIL != assertion_time_pairs) {
            SubLObject current_best_assertion_time_pair = NIL;
            SubLObject current_best_time_elapsed = NIL;
            SubLObject cdolist_list_var = assertion_time_pairs;
            SubLObject assertion_time_pair = NIL;
            assertion_time_pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject time_of_assertion = cycl_utilities.formula_arg0(assertion_time_pair);
                if (NIL != time_is_before_thanP(time_of_assertion, time)) {
                    if (NIL != current_best_assertion_time_pair) {
                        final SubLObject current_time_elapsed = find_time_elapsed_between_time_points(time, cycl_utilities.formula_arg0(assertion_time_pair));
                        if (NIL != quantities.cyc_less_than_quantities(current_time_elapsed, current_best_time_elapsed)) {
                            current_best_assertion_time_pair = assertion_time_pair;
                            current_best_time_elapsed = current_time_elapsed;
                        }
                    } else {
                        current_best_assertion_time_pair = assertion_time_pair;
                        current_best_time_elapsed = find_time_elapsed_between_time_points(time, cycl_utilities.formula_arg0(assertion_time_pair));
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion_time_pair = cdolist_list_var.first();
            } 
            return current_best_assertion_time_pair;
        }
        return NIL;
    }

    public static SubLObject get_closest_assertion_after_time(final SubLObject fact, final SubLObject time) {
        final SubLObject assertion_time_pairs = get_assertion_time_pairs_for_fact(fact);
        if (NIL != assertion_time_pairs) {
            SubLObject current_best_assertion_time_pair = NIL;
            SubLObject current_best_time_elapsed = NIL;
            SubLObject cdolist_list_var = assertion_time_pairs;
            SubLObject assertion_time_pair = NIL;
            assertion_time_pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject time_of_assertion = cycl_utilities.formula_arg0(assertion_time_pair);
                if (NIL != time_is_before_thanP(time, time_of_assertion)) {
                    if (NIL != current_best_assertion_time_pair) {
                        final SubLObject current_time_elapsed = find_time_elapsed_between_time_points(time, cycl_utilities.formula_arg0(assertion_time_pair));
                        if (NIL != quantities.cyc_less_than_quantities(current_time_elapsed, current_best_time_elapsed)) {
                            current_best_assertion_time_pair = assertion_time_pair;
                            current_best_time_elapsed = current_time_elapsed;
                        }
                    } else {
                        current_best_assertion_time_pair = assertion_time_pair;
                        current_best_time_elapsed = find_time_elapsed_between_time_points(time, cycl_utilities.formula_arg0(assertion_time_pair));
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion_time_pair = cdolist_list_var.first();
            } 
            return current_best_assertion_time_pair;
        }
        return NIL;
    }

    public static SubLObject find_time_elapsed_between_time_points(final SubLObject time_1, final SubLObject time_2) {
        final SubLObject first_point_1 = temporal_projection_utilities.find_first_point_of_time(time_1);
        final SubLObject first_point_2 = temporal_projection_utilities.find_first_point_of_time(time_2);
        if ((NIL != first_point_1) && (NIL != first_point_2)) {
            return date_utilities.time_elapsed(first_point_1, first_point_2, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject time_is_before_thanP(final SubLObject time_1, final SubLObject time_2) {
        final SubLObject first_point_1 = temporal_projection_utilities.find_first_point_of_time(time_1);
        final SubLObject first_point_2 = temporal_projection_utilities.find_first_point_of_time(time_2);
        if ((NIL != first_point_1) && (NIL != first_point_2)) {
            return date_utilities.dateL(first_point_1, first_point_2);
        }
        return NIL;
    }

    public static SubLObject init_temporal_projection_global_variables() {
        $temporal_projection_list_of_starting_dates$.setDynamicValue(NIL);
        $temporal_projection_list_of_ending_dates$.setDynamicValue(NIL);
        $intervals_from_genls_assertions$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject update_temporal_projection_global_variables(final SubLObject fact) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $temporal_projection_list_of_starting_dates$.getDynamicValue(thread)) || (NIL != $temporal_projection_list_of_ending_dates$.getDynamicValue(thread))) {
            return NIL;
        }
        final SubLObject arg1 = cycl_utilities.formula_arg1(fact, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.formula_arg2(fact, UNPROVIDED);
        earliest_possible_starting_date_of_concept(arg1);
        earliest_possible_starting_date_of_concept(arg2);
        ending_date_of_concept(arg1);
        ending_date_of_concept(arg2);
        return NIL;
    }

    public static SubLObject lookup_starting_date_for_entity(final SubLObject entity) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = $temporal_projection_list_of_starting_dates$.getDynamicValue(thread);
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (cycl_utilities.formula_arg0(entry).equal(entity)) {
                return values(cycl_utilities.formula_arg1(entry, UNPROVIDED), cycl_utilities.formula_arg2(entry, UNPROVIDED));
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject lookup_ending_date_for_entity(final SubLObject entity) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = $temporal_projection_list_of_ending_dates$.getDynamicValue(thread);
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (cycl_utilities.formula_arg0(entry).equal(entity)) {
                return values(cycl_utilities.formula_arg1(entry, UNPROVIDED), cycl_utilities.formula_arg2(entry, UNPROVIDED));
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject test_table_entry(final SubLObject query) {
        final SubLObject answers = Mapping.mapcar(symbol_function(FORMULA_ARG0), time_intervals_for_sentence(query, $$EverythingPSC, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return list(list(query, answers), T);
    }

    public static SubLObject declare_temporal_projection_file() {
        declareFunction("likelihood_of_truth_of_sentence", "LIKELIHOOD-OF-TRUTH-OF-SENTENCE", 1, 2, false);
        declareFunction("find_likelihood_of_truth_of_isa_sentence", "FIND-LIKELIHOOD-OF-TRUTH-OF-ISA-SENTENCE", 3, 0, false);
        declareFunction("find_likelihood_of_truth_of_isa_facts_by_using_decay_distributions", "FIND-LIKELIHOOD-OF-TRUTH-OF-ISA-FACTS-BY-USING-DECAY-DISTRIBUTIONS", 3, 0, false);
        declareFunction("find_likelihood_of_isa_facts_by_using_backward_distributions", "FIND-LIKELIHOOD-OF-ISA-FACTS-BY-USING-BACKWARD-DISTRIBUTIONS", 3, 0, false);
        declareFunction("find_likelihood_of_isa_facts_by_using_forward_distributions", "FIND-LIKELIHOOD-OF-ISA-FACTS-BY-USING-FORWARD-DISTRIBUTIONS", 3, 0, false);
        declareFunction("find_likelihood_of_isa_facts_by_using_default_decay_distributions", "FIND-LIKELIHOOD-OF-ISA-FACTS-BY-USING-DEFAULT-DECAY-DISTRIBUTIONS", 3, 0, false);
        declareFunction("find_likelihood_by_using_conditional_probability_of_entering_state_when_age_in_interval", "FIND-LIKELIHOOD-BY-USING-CONDITIONAL-PROBABILITY-OF-ENTERING-STATE-WHEN-AGE-IN-INTERVAL", 3, 0, false);
        declareFunction("find_likelihood_by_using_conditional_probability_of_leaving_state_when_age_in_interval", "FIND-LIKELIHOOD-BY-USING-CONDITIONAL-PROBABILITY-OF-LEAVING-STATE-WHEN-AGE-IN-INTERVAL", 3, 0, false);
        declareFunction("find_relevant_age_related_distribution_at_age", "FIND-RELEVANT-AGE-RELATED-DISTRIBUTION-AT-AGE", 3, 0, false);
        declareFunction("find_relevant_age_related_distribution_at_age_2", "FIND-RELEVANT-AGE-RELATED-DISTRIBUTION-AT-AGE-2", 2, 0, false);
        declareFunction("collect_time_intervals_for_negated_isa_sentence_by_conditional_probability_when_age", "COLLECT-TIME-INTERVALS-FOR-NEGATED-ISA-SENTENCE-BY-CONDITIONAL-PROBABILITY-WHEN-AGE", 3, 0, false);
        declareFunction("collect_time_intervals_for_negated_isa_sentence_by_conditional_probability_when_age_single", "COLLECT-TIME-INTERVALS-FOR-NEGATED-ISA-SENTENCE-BY-CONDITIONAL-PROBABILITY-WHEN-AGE-SINGLE", 3, 0, false);
        declareFunction("collect_time_intervals_for_non_negated_isa_sentence_by_conditional_probability_when_age", "COLLECT-TIME-INTERVALS-FOR-NON-NEGATED-ISA-SENTENCE-BY-CONDITIONAL-PROBABILITY-WHEN-AGE", 3, 0, false);
        declareFunction("collect_time_intervals_for_non_negated_isa_sentence_by_conditional_probability_when_age_single", "COLLECT-TIME-INTERVALS-FOR-NON-NEGATED-ISA-SENTENCE-BY-CONDITIONAL-PROBABILITY-WHEN-AGE-SINGLE", 3, 0, false);
        declareFunction("find_likelihood_for_absorbing_states", "FIND-LIKELIHOOD-FOR-ABSORBING-STATES", 3, 0, false);
        declareFunction("collect_time_intervals_from_absorbing_states", "COLLECT-TIME-INTERVALS-FROM-ABSORBING-STATES", 5, 0, false);
        declareFunction("collect_time_intervals_from_absorbing_states_single", "COLLECT-TIME-INTERVALS-FROM-ABSORBING-STATES-SINGLE", 5, 0, false);
        declareFunction("find_likelihood_of_truth_of_non_isa_sentence", "FIND-LIKELIHOOD-OF-TRUTH-OF-NON-ISA-SENTENCE", 3, 0, false);
        declareFunction("time_intervals_for_sentence", "TIME-INTERVALS-FOR-SENTENCE", 1, 4, false);
        declareFunction("temporally_project", "TEMPORALLY-PROJECT", 2, 2, false);
        declareFunction("find_time_intervals_from_state_persists_assertions", "FIND-TIME-INTERVALS-FROM-STATE-PERSISTS-ASSERTIONS", 1, 0, false);
        declareFunction("find_time_intervals_from_starting_and_ending_points_of_sentence", "FIND-TIME-INTERVALS-FROM-STARTING-AND-ENDING-POINTS-OF-SENTENCE", 3, 0, false);
        declareFunction("find_time_intervals_for_non_negated_sentence", "FIND-TIME-INTERVALS-FOR-NON-NEGATED-SENTENCE", 4, 0, false);
        declareFunction("find_time_intervals_for_non_negated_sentence_single", "FIND-TIME-INTERVALS-FOR-NON-NEGATED-SENTENCE-SINGLE", 4, 0, false);
        declareFunction("find_time_intervals_for_negated_sentence", "FIND-TIME-INTERVALS-FOR-NEGATED-SENTENCE", 4, 0, false);
        declareFunction("find_time_intervals_for_negated_sentence_single", "FIND-TIME-INTERVALS-FOR-NEGATED-SENTENCE-SINGLE", 4, 0, false);
        declareFunction("find_time_intervals_for_negated_isa_sentence", "FIND-TIME-INTERVALS-FOR-NEGATED-ISA-SENTENCE", 4, 0, false);
        declareFunction("find_time_intervals_for_negated_isa_sentence_single", "FIND-TIME-INTERVALS-FOR-NEGATED-ISA-SENTENCE-SINGLE", 4, 0, false);
        declareFunction("find_time_intervals_for_non_negated_non_isa_sentence", "FIND-TIME-INTERVALS-FOR-NON-NEGATED-NON-ISA-SENTENCE", 4, 0, false);
        declareFunction("find_time_intervals_for_non_negated_non_isa_sentence_single", "FIND-TIME-INTERVALS-FOR-NON-NEGATED-NON-ISA-SENTENCE-SINGLE", 4, 0, false);
        declareFunction("collect_intervals_from_decay_distributions_for_predicate", "COLLECT-INTERVALS-FROM-DECAY-DISTRIBUTIONS-FOR-PREDICATE", 3, 0, false);
        declareFunction("collect_intervals_from_decay_distributions_for_predicate_single", "COLLECT-INTERVALS-FROM-DECAY-DISTRIBUTIONS-FOR-PREDICATE-SINGLE", 3, 0, false);
        declareFunction("collect_intervals_from_specific_distributions_for_predicate", "COLLECT-INTERVALS-FROM-SPECIFIC-DISTRIBUTIONS-FOR-PREDICATE", 3, 0, false);
        declareFunction("collect_intervals_from_specific_distributions_for_predicate_single", "COLLECT-INTERVALS-FROM-SPECIFIC-DISTRIBUTIONS-FOR-PREDICATE-SINGLE", 3, 0, false);
        declareFunction("predicate_has_type_level_distributionsP", "PREDICATE-HAS-TYPE-LEVEL-DISTRIBUTIONS?", 1, 0, false);
        declareFunction("find_time_intervals_for_negated_non_isa_sentence", "FIND-TIME-INTERVALS-FOR-NEGATED-NON-ISA-SENTENCE", 4, 0, false);
        declareFunction("find_time_intervals_for_negated_non_isa_sentence_single", "FIND-TIME-INTERVALS-FOR-NEGATED-NON-ISA-SENTENCE-SINGLE", 4, 0, false);
        declareFunction("find_time_intervals_for_non_negated_isa_sentence", "FIND-TIME-INTERVALS-FOR-NON-NEGATED-ISA-SENTENCE", 4, 0, false);
        declareFunction("find_time_intervals_for_non_negated_isa_sentence_single", "FIND-TIME-INTERVALS-FOR-NON-NEGATED-ISA-SENTENCE-SINGLE", 4, 0, false);
        declareFunction("collect_intervals_from_decay_distributions_for_collections", "COLLECT-INTERVALS-FROM-DECAY-DISTRIBUTIONS-FOR-COLLECTIONS", 3, 0, false);
        declareFunction("collect_intervals_from_decay_distributions_for_collections_single", "COLLECT-INTERVALS-FROM-DECAY-DISTRIBUTIONS-FOR-COLLECTIONS-SINGLE", 3, 0, false);
        declareFunction("collect_intervals_from_forward_and_backward_distributions_for_collections", "COLLECT-INTERVALS-FROM-FORWARD-AND-BACKWARD-DISTRIBUTIONS-FOR-COLLECTIONS", 3, 0, false);
        declareFunction("collect_intervals_from_forward_and_backward_distributions_for_collections_single", "COLLECT-INTERVALS-FROM-FORWARD-AND-BACKWARD-DISTRIBUTIONS-FOR-COLLECTIONS-SINGLE", 3, 0, false);
        declareFunction("use_backward_distribution_for_collections", "USE-BACKWARD-DISTRIBUTION-FOR-COLLECTIONS", 4, 0, false);
        declareFunction("use_backward_distribution_for_collections_single", "USE-BACKWARD-DISTRIBUTION-FOR-COLLECTIONS-SINGLE", 4, 0, false);
        declareFunction("use_forward_distribution_for_collections", "USE-FORWARD-DISTRIBUTION-FOR-COLLECTIONS", 4, 0, false);
        declareFunction("use_forward_distribution_for_collections_single", "USE-FORWARD-DISTRIBUTION-FOR-COLLECTIONS-SINGLE", 4, 0, false);
        declareFunction("collect_intervals_from_default_conditional_probability_statements", "COLLECT-INTERVALS-FROM-DEFAULT-CONDITIONAL-PROBABILITY-STATEMENTS", 3, 0, false);
        declareFunction("collect_intervals_from_default_conditional_probability_statements_single", "COLLECT-INTERVALS-FROM-DEFAULT-CONDITIONAL-PROBABILITY-STATEMENTS-SINGLE", 3, 0, false);
        declareFunction("collect_intervals_from_default_conditional_probability_statements_with_decaying_persistence", "COLLECT-INTERVALS-FROM-DEFAULT-CONDITIONAL-PROBABILITY-STATEMENTS-WITH-DECAYING-PERSISTENCE", 4, 0, false);
        declareFunction("collect_intervals_from_default_conditional_probability_statements_with_decaying_persistence_single", "COLLECT-INTERVALS-FROM-DEFAULT-CONDITIONAL-PROBABILITY-STATEMENTS-WITH-DECAYING-PERSISTENCE-SINGLE", 4, 0, false);
        declareFunction("collect_intervals_from_starting_and_ending_dates_for_arg", "COLLECT-INTERVALS-FROM-STARTING-AND-ENDING-DATES-FOR-ARG", 3, 0, false);
        declareFunction("collect_intervals_for_non_isa_facts_from_starting_and_ending_dates", "COLLECT-INTERVALS-FOR-NON-ISA-FACTS-FROM-STARTING-AND-ENDING-DATES", 2, 0, false);
        declareFunction("collect_intervals_for_non_isa_facts_from_starting_and_ending_dates_single", "COLLECT-INTERVALS-FOR-NON-ISA-FACTS-FROM-STARTING-AND-ENDING-DATES-SINGLE", 2, 0, false);
        declareFunction("collect_intervals_from_starting_and_ending_dates", "COLLECT-INTERVALS-FROM-STARTING-AND-ENDING-DATES", 2, 0, false);
        declareFunction("collect_intervals_from_starting_and_ending_dates_single", "COLLECT-INTERVALS-FROM-STARTING-AND-ENDING-DATES-SINGLE", 2, 0, false);
        declareFunction("verify_starting_and_ending_times_of_isa_facts", "VERIFY-STARTING-AND-ENDING-TIMES-OF-ISA-FACTS", 2, 0, false);
        declareFunction("collect_intervals_for_isa_facts_from_starting_and_ending_dates", "COLLECT-INTERVALS-FOR-ISA-FACTS-FROM-STARTING-AND-ENDING-DATES", 2, 0, false);
        declareFunction("collect_intervals_for_isa_facts_from_starting_and_ending_dates_single", "COLLECT-INTERVALS-FOR-ISA-FACTS-FROM-STARTING-AND-ENDING-DATES-SINGLE", 2, 0, false);
        declareFunction("verify_starting_and_ending_times_of_non_isa_facts", "VERIFY-STARTING-AND-ENDING-TIMES-OF-NON-ISA-FACTS", 2, 0, false);
        declareFunction("verify_temporal_constraints_between_collections", "VERIFY-TEMPORAL-CONSTRAINTS-BETWEEN-COLLECTIONS", 2, 1, false);
        declareFunction("collect_intervals_from_temporal_constraints_between_collections_for_negated_isa_sentence", "COLLECT-INTERVALS-FROM-TEMPORAL-CONSTRAINTS-BETWEEN-COLLECTIONS-FOR-NEGATED-ISA-SENTENCE", 2, 0, false);
        declareFunction("collect_intervals_from_temporal_constraints_between_collections_for_negated_isa_sentence_single", "COLLECT-INTERVALS-FROM-TEMPORAL-CONSTRAINTS-BETWEEN-COLLECTIONS-FOR-NEGATED-ISA-SENTENCE-SINGLE", 2, 0, false);
        declareFunction("not_all_points_are_later_thanP", "NOT-ALL-POINTS-ARE-LATER-THAN?", 2, 0, false);
        declareFunction("get_assertion_time_pairs_for_fact", "GET-ASSERTION-TIME-PAIRS-FOR-FACT", 1, 0, false);
        declareFunction("get_time_for_assertion_1", "GET-TIME-FOR-ASSERTION-1", 1, 0, false);
        declareFunction("get_time_for_assertion_2", "GET-TIME-FOR-ASSERTION-2", 1, 0, false);
        declareFunction("possibly_replace_indexicals", "POSSIBLY-REPLACE-INDEXICALS", 1, 0, false);
        declareFunction("verify_temporal_relation_between_arguments", "VERIFY-TEMPORAL-RELATION-BETWEEN-ARGUMENTS", 1, 1, false);
        declareFunction("collect_intervals_from_temporal_relation_between_arguments_assertions_for_negated_non_isa_sentence", "COLLECT-INTERVALS-FROM-TEMPORAL-RELATION-BETWEEN-ARGUMENTS-ASSERTIONS-FOR-NEGATED-NON-ISA-SENTENCE", 2, 0, false);
        declareFunction("collect_intervals_from_temporal_relation_between_arguments_assertions_for_negated_non_isa_sentence_single", "COLLECT-INTERVALS-FROM-TEMPORAL-RELATION-BETWEEN-ARGUMENTS-ASSERTIONS-FOR-NEGATED-NON-ISA-SENTENCE-SINGLE", 2, 0, false);
        declareFunction("verify_genls_and_disjoint_with_constraints", "VERIFY-GENLS-AND-DISJOINT-WITH-CONSTRAINTS", 3, 0, false);
        declareFunction("collect_intervals_from_disjoint_assertions", "COLLECT-INTERVALS-FROM-DISJOINT-ASSERTIONS", 2, 0, false);
        declareFunction("collect_intervals_from_disjoint_assertions_single", "COLLECT-INTERVALS-FROM-DISJOINT-ASSERTIONS-SINGLE", 2, 0, false);
        declareFunction("collect_intervals_from_genls_assertions", "COLLECT-INTERVALS-FROM-GENLS-ASSERTIONS", 2, 0, false);
        declareFunction("verify_starting_and_ending_times", "VERIFY-STARTING-AND-ENDING-TIMES", 2, 0, false);
        declareFunction("check_starting_time_of_concept", "CHECK-STARTING-TIME-OF-CONCEPT", 2, 0, false);
        declareFunction("check_ending_time_of_concept", "CHECK-ENDING-TIME-OF-CONCEPT", 2, 0, false);
        declareFunction("earliest_possible_starting_date_of_concept", "EARLIEST-POSSIBLE-STARTING-DATE-OF-CONCEPT", 1, 0, false);
        declareFunction("ending_date_of_concept", "ENDING-DATE-OF-CONCEPT", 1, 0, false);
        declareFunction("get_assertions_for_fact_1", "GET-ASSERTIONS-FOR-FACT-1", 1, 0, false);
        declareFunction("find_likelihood_of_truth_of_non_isa_sentence_by_using_decay_distributions", "FIND-LIKELIHOOD-OF-TRUTH-OF-NON-ISA-SENTENCE-BY-USING-DECAY-DISTRIBUTIONS", 3, 0, false);
        declareFunction("use_type_level_distributions_for_computing_likelihood", "USE-TYPE-LEVEL-DISTRIBUTIONS-FOR-COMPUTING-LIKELIHOOD", 3, 0, false);
        declareFunction("use_default_conditional_probability_for_sentence_in_interval", "USE-DEFAULT-CONDITIONAL-PROBABILITY-FOR-SENTENCE-IN-INTERVAL", 3, 0, false);
        declareFunction("collect_intervals_from_default_conditional_probability_for_sentence_in_interval", "COLLECT-INTERVALS-FROM-DEFAULT-CONDITIONAL-PROBABILITY-FOR-SENTENCE-IN-INTERVAL", 3, 0, false);
        declareFunction("collect_intervals_from_default_conditional_probability_for_sentence_in_interval_single", "COLLECT-INTERVALS-FROM-DEFAULT-CONDITIONAL-PROBABILITY-FOR-SENTENCE-IN-INTERVAL-SINGLE", 3, 0, false);
        declareFunction("collect_intervals_from_forward_and_backward_distributions_for_predicates_single", "COLLECT-INTERVALS-FROM-FORWARD-AND-BACKWARD-DISTRIBUTIONS-FOR-PREDICATES-SINGLE", 3, 0, false);
        declareFunction("collect_intervals_from_forward_distributions_for_predicates_single", "COLLECT-INTERVALS-FROM-FORWARD-DISTRIBUTIONS-FOR-PREDICATES-SINGLE", 4, 0, false);
        declareFunction("collect_intervals_from_default_conditional_prob_for_sentence", "COLLECT-INTERVALS-FROM-DEFAULT-CONDITIONAL-PROB-FOR-SENTENCE", 4, 0, false);
        declareFunction("collect_intervals_from_default_conditional_prob_for_sentence_single", "COLLECT-INTERVALS-FROM-DEFAULT-CONDITIONAL-PROB-FOR-SENTENCE-SINGLE", 4, 0, false);
        declareFunction("collect_intervals_from_default_conditional_prob_for_sentence_backward_from_time", "COLLECT-INTERVALS-FROM-DEFAULT-CONDITIONAL-PROB-FOR-SENTENCE-BACKWARD-FROM-TIME", 6, 0, false);
        declareFunction("collect_intervals_from_default_conditional_prob_for_sentence_forward_from_time", "COLLECT-INTERVALS-FROM-DEFAULT-CONDITIONAL-PROB-FOR-SENTENCE-FORWARD-FROM-TIME", 6, 0, false);
        declareFunction("collect_intervals_from_default_conditional_prob_of_state_forward_from_time", "COLLECT-INTERVALS-FROM-DEFAULT-CONDITIONAL-PROB-OF-STATE-FORWARD-FROM-TIME", 6, 0, false);
        declareFunction("collect_intervals_from_type_level_distributions_forward", "COLLECT-INTERVALS-FROM-TYPE-LEVEL-DISTRIBUTIONS-FORWARD", 6, 0, false);
        declareFunction("get_intervals_from_decaying_type_level_distributions_forward_in_time", "GET-INTERVALS-FROM-DECAYING-TYPE-LEVEL-DISTRIBUTIONS-FORWARD-IN-TIME", 6, 0, false);
        declareFunction("get_intervals_for_sentence_with_decaying_persistence_backwards_in_time", "GET-INTERVALS-FOR-SENTENCE-WITH-DECAYING-PERSISTENCE-BACKWARDS-IN-TIME", 6, 0, false);
        declareFunction("get_intervals_for_sentence_with_decaying_persistence_forward_in_time", "GET-INTERVALS-FOR-SENTENCE-WITH-DECAYING-PERSISTENCE-FORWARD-IN-TIME", 6, 0, false);
        declareFunction("get_intervals_for_state_with_decaying_persistence_forward_in_time", "GET-INTERVALS-FOR-STATE-WITH-DECAYING-PERSISTENCE-FORWARD-IN-TIME", 6, 0, false);
        declareFunction("get_intervals_for_sentence_with_decaying_persistence", "GET-INTERVALS-FOR-SENTENCE-WITH-DECAYING-PERSISTENCE", 4, 0, false);
        declareFunction("get_intervals_for_sentence_with_decaying_persistence_single", "GET-INTERVALS-FOR-SENTENCE-WITH-DECAYING-PERSISTENCE-SINGLE", 4, 0, false);
        declareFunction("verify_result_entry", "VERIFY-RESULT-ENTRY", 4, 0, false);
        declareFunction("verify_starting_and_ending_dates_for_result_entry", "VERIFY-STARTING-AND-ENDING-DATES-FOR-RESULT-ENTRY", 4, 0, false);
        declareFunction("verify_starting_and_ending_dates_for_isa_result_entry", "VERIFY-STARTING-AND-ENDING-DATES-FOR-ISA-RESULT-ENTRY", 4, 0, false);
        declareFunction("subtract_interval", "SUBTRACT-INTERVAL", 2, 0, false);
        declareFunction("find_known_or_expected_lifespan_of_entity", "FIND-KNOWN-OR-EXPECTED-LIFESPAN-OF-ENTITY", 4, 0, false);
        declareFunction("get_intervals_for_always_true_sentence", "GET-INTERVALS-FOR-ALWAYS-TRUE-SENTENCE", 4, 0, false);
        declareFunction("get_intervals_for_always_true_sentence_single", "GET-INTERVALS-FOR-ALWAYS-TRUE-SENTENCE-SINGLE", 4, 0, false);
        declareFunction("collect_intervals_from_initial_and_terminal_in_args_facts", "COLLECT-INTERVALS-FROM-INITIAL-AND-TERMINAL-IN-ARGS-FACTS", 3, 0, false);
        declareFunction("collect_intervals_from_initial_and_terminal_in_args_facts_single", "COLLECT-INTERVALS-FROM-INITIAL-AND-TERMINAL-IN-ARGS-FACTS-SINGLE", 3, 0, false);
        declareFunction("find_later_date", "FIND-LATER-DATE", 2, 0, false);
        declareFunction("find_earlier_date", "FIND-EARLIER-DATE", 2, 0, false);
        declareFunction("find_known_or_expected_starting_date", "FIND-KNOWN-OR-EXPECTED-STARTING-DATE", 1, 0, false);
        declareFunction("find_known_or_expected_ending_date", "FIND-KNOWN-OR-EXPECTED-ENDING-DATE", 2, 1, false);
        declareFunction("get_assertion_closest_to_given_time", "GET-ASSERTION-CLOSEST-TO-GIVEN-TIME", 2, 0, false);
        declareFunction("get_closest_assertion_before_time", "GET-CLOSEST-ASSERTION-BEFORE-TIME", 2, 0, false);
        declareFunction("get_closest_assertion_after_time", "GET-CLOSEST-ASSERTION-AFTER-TIME", 2, 0, false);
        declareFunction("find_time_elapsed_between_time_points", "FIND-TIME-ELAPSED-BETWEEN-TIME-POINTS", 2, 0, false);
        declareFunction("time_is_before_thanP", "TIME-IS-BEFORE-THAN?", 2, 0, false);
        declareFunction("init_temporal_projection_global_variables", "INIT-TEMPORAL-PROJECTION-GLOBAL-VARIABLES", 0, 0, false);
        declareFunction("update_temporal_projection_global_variables", "UPDATE-TEMPORAL-PROJECTION-GLOBAL-VARIABLES", 1, 0, false);
        declareFunction("lookup_starting_date_for_entity", "LOOKUP-STARTING-DATE-FOR-ENTITY", 1, 0, false);
        declareFunction("lookup_ending_date_for_entity", "LOOKUP-ENDING-DATE-FOR-ENTITY", 1, 0, false);
        declareFunction("test_table_entry", "TEST-TABLE-ENTRY", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_temporal_projection_file() {
        defparameter("*NUMERIC-LIKELIHOOD-FN-ZERO*", make_unary_formula($$NumericLikelihoodFn, ZERO_INTEGER));
        defparameter("*NUMERIC-LIKELIHOOD-FN-ONE*", make_unary_formula($$NumericLikelihoodFn, ONE_INTEGER));
        defparameter("*TEMPORAL-PROJECTION-UPPER-THRESHOLD*", $float$0_8);
        defparameter("*TEMPORAL-PROJECTION-LOWER-THRESHOLD*", $float$0_2);
        defparameter("*TEMPORAL-PROJECTION-MODE*", T);
        defparameter("*EXTENDED-TEMPORAL-PROJECTION-MODE*", NIL);
        defparameter("*TEMPORAL-PROJECTION-LIST-OF-STARTING-DATES*", NIL);
        defparameter("*TEMPORAL-PROJECTION-LIST-OF-ENDING-DATES*", NIL);
        defparameter("*INTERVALS-FROM-GENLS-ASSERTIONS*", NIL);
        return NIL;
    }

    public static SubLObject setup_temporal_projection_file() {
        register_kb_function(TEMPORALLY_PROJECT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_temporal_projection_file();
    }

    @Override
    public void initializeVariables() {
        init_temporal_projection_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_temporal_projection_file();
    }

    static {

















































































    }
}

/**
 * Total time: 1141 ms
 */
