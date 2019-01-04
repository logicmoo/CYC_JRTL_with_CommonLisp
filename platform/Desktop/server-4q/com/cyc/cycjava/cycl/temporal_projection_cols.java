package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class temporal_projection_cols extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.temporal_projection_cols";
    public static final String myFingerPrint = "17a4c4aaa1542d0bb67a5135f18fe391b5437e0a18ee10d254b8980dc07e80c7";
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 114037L)
    public static SubLSymbol $uniform_distribution_with_value_zero$;
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 114171L)
    public static SubLSymbol $uniform_distribution_with_value_one$;
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 114302L)
    public static SubLSymbol $tp_current_var$;
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 114348L)
    public static SubLSymbol $temporal_projection_justifications$;
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 114414L)
    public static SubLSymbol $mt_for_temporal_projection$;
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 114472L)
    public static SubLSymbol $temporal_projection_stack$;
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 114529L)
    public static SubLSymbol $temporal_projection_answers$;
    private static final SubLSymbol $sym0$INDEXED_TERM_P;
    private static final SubLObject $const1$startingPointOfIntervalForSentenc;
    private static final SubLObject $const2$endingPointOfIntervalForSentence;
    private static final SubLObject $const3$temporallyIntersects;
    private static final SubLSymbol $kw4$POS;
    private static final SubLObject $const5$BaseKB;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$CODE;
    private static final SubLSymbol $sym8$E;
    private static final SubLSymbol $sym9$S;
    private static final SubLObject $const10$TimeIntervalInclusiveFn;
    private static final SubLObject $const11$temporallySubsumes;
    private static final SubLObject $const12$defaultConditionalProbabilityForS;
    private static final SubLObject $const13$conditionalProbabilityForSentence;
    private static final SubLObject $const14$defaultConditionalProbabilityOfSt;
    private static final SubLObject $const15$isa;
    private static final SubLObject $const16$conditionalProbabilityOfStateAfte;
    private static final SubLObject $const17$defaultConditionalProbabilityForS;
    private static final SubLObject $const18$conditionalProbabilityOfStateAfte;
    private static final SubLObject $const19$defaultConditionalProbabilityForS;
    private static final SubLSymbol $sym20$LIST_TIME_COMPARATOR;
    private static final SubLObject $const21$timeElapsed;
    private static final SubLObject $const22$NumericLikelihoodFn;
    private static final SubLObject $const23$temporalInterpolationFunctionForP;
    private static final SubLObject $const24$durationWeightedDistributionForPr;
    private static final SubLObject $const25$duration;
    private static final SubLObject $const26$decayDistributionForAssertionInTi;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$_X;
    private static final SubLSymbol $sym29$_Y;
    private static final SubLObject $const30$distributionForSentenceGivenNeces;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$_Z;
    private static final SubLObject $const33$conditionalProbabilityOfStateGive;
    private static final SubLObject $const34$distributionForSentenceGivenSuffi;
    private static final SubLObject $const35$conditionalProbabilityPatternsFor;
    private static final SubLFloat $float36$0_001;
    private static final SubLSymbol $sym37$FORMULA_ARG0;
    private static final SubLObject $const38$delayBetweenStartOfEventTypesInSi;
    private static final SubLObject $const39$subEvents;
    private static final SubLList $list40;
    private static final SubLObject $const41$defaultDecayFunctionForPredicate;
    private static final SubLObject $const42$defaultDecayFunctionForPredicate_;
    private static final SubLObject $const43$decayDistributionForSpecs;
    private static final SubLObject $const44$EverythingPSC;
    private static final SubLObject $const45$temporalInterpolationFunctionForC;
    private static final SubLObject $const46$eventTypeEndsIntervalForState;
    private static final SubLObject $const47$eventTypeStartsIntervalForState;
    private static final SubLObject $const48$startingPointOfRiskPeriodForAsser;
    private static final SubLObject $const49$intensityFunctionForEventTypeInIn;
    private static final SubLObject $const50$startingDate;
    private static final SubLObject $const51$evaluate;
    private static final SubLObject $const52$DateAfterFn;
    private static final SubLObject $const53$QuotientFn;
    private static final SubLObject $const54$PlusFn;
    private static final SubLObject $const55$intensityFunctionForEventType;
    private static final SubLObject $const56$lessThan;
    private static final SubLObject $const57$transitionProbabilityBetweenColle;
    private static final SubLList $list58;
    private static final SubLObject $const59$startingPointForAssertion;
    private static final SubLObject $const60$DateBeforeFn;
    private static final SubLObject $const61$DifferenceFn;
    private static final SubLObject $const62$laterThan;
    private static final SubLString $str63$___query_result___a_diff__a_;
    private static final SubLString $str64$____a__a_;
    private static final SubLObject $const65$maximumCardinalityOfCollection;
    private static final SubLObject $const66$decayDistributionForAssertionInIn;
    private static final SubLList $list67;
    private static final SubLSymbol $sym68$_DATE;
    private static final SubLSymbol $sym69$_INTERVAL;
    private static final SubLList $list70;
    private static final SubLObject $const71$conditionalProbabilityForCollecti;
    private static final SubLObject $const72$conditionalProbabilityForCollecti;
    private static final SubLObject $const73$delayBetweenCollections;
    private static final SubLSymbol $sym74$MAX;
    private static final SubLObject $const75$defaultDecayFunctionForCollection;
    private static final SubLObject $const76$temporalRelationBetweenCollection;
    private static final SubLList $list77;
    private static final SubLObject $const78$decayDistributionForCollectionInI;
    private static final SubLObject $const79$defaultDecayDistributionForCollec;
    private static final SubLObject $const80$defaultDecayFunctionForCollection;
    private static final SubLObject $const81$ConstantFunction;
    private static final SubLObject $const82$defaultDecayFunctionForCollection;
    private static final SubLList $list83;
    private static final SubLSymbol $sym84$_W;
    private static final SubLObject $const85$decayFunctionForCollectionInInter;
    private static final SubLObject $const86$decayDistributionForAssertionInIn;
    private static final SubLObject $const87$hourNumberOfDate;
    private static final SubLInteger $int88$23;
    private static final SubLObject $const89$decayDistributionForAssertion_Cau;
    private static final SubLObject $const90$endingDate;
    private static final SubLList $list91;
    private static final SubLSymbol $sym92$_COL;
    private static final SubLObject $const93$InverseBinaryPredicateFn;
    private static final SubLObject $const94$UniformPersistenceDistributionWit;
    private static final SubLObject $const95$dateOfEvent;
    private static final SubLObject $const96$endsDuring;
    private static final SubLObject $const97$decayFunctionForPredicateInInterv;
    private static final SubLObject $const98$decayFunctionForSpecsInInterval;
    private static final SubLObject $const99$decayFunctionInInterval;
    private static final SubLObject $const100$intervalRange;
    private static final SubLObject $const101$PlusInfinity;
    private static final SubLObject $const102$lessThanOrEqualTo;
    private static final SubLObject $const103$ExponentialDecayDistributionWithI;
    private static final SubLObject $const104$ExponentialDecayDistributionWithI;
    private static final SubLObject $const105$BoundedExponentiallyIncreasingFun;
    private static final SubLObject $const106$NormalDistribution;
    private static final SubLObject $const107$LinearlyDecreasingFunction;
    private static final SubLObject $const108$ExponentiallyDecreasingFunction;
    private static final SubLObject $const109$BoundedExponentiallyIncreasingFun;
    private static final SubLObject $const110$LinearlyIncreasingFunction;
    private static final SubLObject $const111$ExponentialDecayDistributionWithP;
    private static final SubLObject $const112$exponentialDecayDistributionWithP;
    private static final SubLInteger $int113$50;
    private static final SubLFloat $float114$2_71;
    private static final SubLObject $const115$boundedExponentiallyIncreasingFun;
    private static final SubLObject $const116$boundedExponentiallyIncreasingFun;
    private static final SubLObject $const117$exponentialDecayDistributionWithI;
    private static final SubLObject $const118$exponentialDecayDistributionWithI;
    private static final SubLObject $const119$uniformPersistenceDistributionWit;
    private static final SubLObject $const120$normalDistributionWithParameters;
    private static final SubLFloat $float121$1_414;
    private static final SubLFloat $float122$0_5;
    private static final SubLObject $const123$linearDecayFunctionWithSlope;
    private static final SubLObject $const124$linearlyIncreasingFunctionWithSlo;
    private static final SubLObject $const125$MinusInfinity;
    private static final SubLObject $const126$greaterThan;
    private static final SubLObject $const127$equals;
    private static final SubLObject $const128$SomeTimeInIntervalFn;
    private static final SubLObject $const129$ist;
    private static final SubLObject $const130$TimeIntervalBetweenFn;
    private static final SubLObject $const131$Now;
    private static final SubLObject $const132$Now_Indexical;
    private static final SubLObject $const133$indexicalReferent;
    private static final SubLObject $const134$TimeInterval;
    private static final SubLList $list135;
    private static final SubLObject $const136$startsAfterEndingOf;
    private static final SubLSymbol $sym137$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLSymbol $sym138$_EXIT;
    private static final SubLObject $const139$TimeDependentCollection;
    private static final SubLObject $const140$TimeDependentRelation;
    private static final SubLObject $const141$unknownSentence;
    private static final SubLList $list142;
    private static final SubLList $list143;
    private static final SubLObject $const144$temporalRelationBetweenArguments;
    private static final SubLObject $const145$endsAfterStartingOf;
    private static final SubLObject $const146$FutureTensePredicate;
    private static final SubLObject $const147$CoexistingObjectsPredicate;
    private static final SubLList $list148;
    private static final SubLObject $const149$earliestDateForCollectionMembers;
    private static final SubLObject $const150$Date;
    private static final SubLObject $const151$BiologicalLivingObject;
    private static final SubLObject $const152$argIsa;
    private static final SubLObject $const153$genls;
    private static final SubLList $list154;
    private static final SubLObject $const155$quotedIsa;
    private static final SubLList $list156;
    private static final SubLObject $const157$valueEquals;
    private static final SubLObject $const158$TimeElapsedFn;
    private static final SubLList $list159;
    private static final SubLFloat $float160$0_278;
    private static final SubLFloat $float161$0_23;
    private static final SubLFloat $float162$8_999999999999999e_4;
    private static final SubLFloat $float163$0_078;
    private static final SubLObject $const164$startingPointOfSubIntervalForAsse;
    private static final SubLObject $const165$endingPointOfSubIntervalForAssert;
    private static final SubLSymbol $sym166$_;
    private static final SubLObject $const167$and;
    private static final SubLObject $const168$MonthsDuration;
    private static final SubLObject $const169$Lambda;
    private static final SubLObject $const170$TimesFn;
    private static final SubLObject $const171$ExponentFn;
    private static final SubLFloat $float172$2_78;
    private static final SubLObject $const173$MinusFn;
    private static final SubLSymbol $kw174$INFERENCE_MODE;
    private static final SubLSymbol $kw175$MINIMAL;
    private static final SubLSymbol $kw176$ALLOW_INDETERMINATE_RESULTS_;
    private static final SubLSymbol $kw177$DISJUNCTION_FREE_EL_VARS_POLICY;
    private static final SubLSymbol $kw178$COMPUTE_INTERSECTION;
    private static final SubLSymbol $kw179$TRANSFORMATION_ALLOWED_;
    private static final SubLSymbol $kw180$ADD_RESTRICTION_LAYER_OF_INDIRECTION_;
    private static final SubLSymbol $kw181$NEW_TERMS_ALLOWED_;
    private static final SubLSymbol $kw182$COMPUTE_ANSWER_JUSTIFICATIONS_;
    private static final SubLSymbol $kw183$MAX_NUMBER;
    private static final SubLSymbol $kw184$MAX_TIME;
    private static final SubLFloat $float185$0_01;
    private static final SubLSymbol $kw186$PROBABLY_APPROXIMATELY_DONE;
    private static final SubLFloat $float187$1_0;
    private static final SubLSymbol $kw188$MAX_PROOF_DEPTH;
    private static final SubLSymbol $kw189$ANSWER_LANGUAGE;
    private static final SubLSymbol $kw190$HL;
    private static final SubLSymbol $kw191$CONTINUABLE_;
    private static final SubLSymbol $kw192$PRODUCTIVITY_LIMIT;
    private static final SubLInteger $int193$20000000;
    private static final SubLObject $const194$priorProbabilityForPredicate_Type;
    private static final SubLSymbol $sym195$LAMBDA_FUNCTION_ELT;
    private static final SubLObject $const196$HomoSapiens;
    private static final SubLObject $const197$distributionForTerminationOfMembe;
    private static final SubLList $list198;
    private static final SubLObject $const199$distributionForCalculatingDuratio;
    private static final SubLFloat $float200$9_999999999999999e_7;
    private static final SubLString $str201$___Time___a__a_Not_ending___a;
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 726L)
    public static SubLObject collect_intervals_from_events(final SubLObject sentence, final SubLObject upper, final SubLObject justifyP) {
        final SubLObject list_of_terms_1 = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)temporal_projection_cols.$sym0$INDEXED_TERM_P), ConsesLow.append(sentence, (SubLObject)ConsesLow.list(temporal_projection_cols.$const1$startingPointOfIntervalForSentenc)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject list_of_terms_2 = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)temporal_projection_cols.$sym0$INDEXED_TERM_P), ConsesLow.append(sentence, (SubLObject)ConsesLow.list(temporal_projection_cols.$const2$endingPointOfIntervalForSentence)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject starting_point_assertions = virtual_indexing.assertions_mentioning_terms(list_of_terms_1, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject ending_point_assertions = virtual_indexing.assertions_mentioning_terms(list_of_terms_2, (SubLObject)temporal_projection_cols.UNPROVIDED);
        if (temporal_projection_cols.NIL != starting_point_assertions && temporal_projection_cols.NIL != ending_point_assertions) {
            return collect_intervals_from_both_starting_point_and_ending_point_assertions(sentence, starting_point_assertions, ending_point_assertions, upper, justifyP);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 1420L)
    public static SubLObject create_forward_intervals_from_events(final SubLObject assertion, final SubLObject upper, final SubLObject lower) {
        final SubLObject sentence = assertions_high.gaf_formula(assertion);
        final SubLObject sentence_in_assertion = cycl_utilities.formula_arg1(sentence, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject time = cycl_utilities.formula_arg2(sentence, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject ret_value = (SubLObject)temporal_projection_cols.NIL;
        final SubLObject list_of_terms_2 = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)temporal_projection_cols.$sym0$INDEXED_TERM_P), ConsesLow.append(sentence_in_assertion, (SubLObject)ConsesLow.list(temporal_projection_cols.$const2$endingPointOfIntervalForSentence)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject ending_point_assertions = virtual_indexing.assertions_mentioning_terms(list_of_terms_2, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = collect_intervals_from_both_starting_point_and_ending_point_assertions(sentence_in_assertion, (SubLObject)ConsesLow.list(assertion), ending_point_assertions, upper, (SubLObject)temporal_projection_cols.T);
        SubLObject entry = (SubLObject)temporal_projection_cols.NIL;
        entry = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject interval = cycl_utilities.formula_arg0(entry);
            if (temporal_projection_cols.NIL != sbhl_time_query_processing.true_temporal_relation_literalP(temporal_projection_cols.$const3$temporallyIntersects, time, interval, (SubLObject)temporal_projection_cols.$kw4$POS, temporal_projection_cols.$const5$BaseKB)) {
                ret_value = (SubLObject)ConsesLow.cons(entry, ret_value);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return ret_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 2242L)
    public static SubLObject create_backward_intervals_from_events(final SubLObject assertion, final SubLObject upper, final SubLObject lower) {
        final SubLObject sentence = assertions_high.gaf_formula(assertion);
        final SubLObject sentence_in_assertion = cycl_utilities.formula_arg1(sentence, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject time = cycl_utilities.formula_arg2(sentence, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject ret_value = (SubLObject)temporal_projection_cols.NIL;
        final SubLObject list_of_terms_2 = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)temporal_projection_cols.$sym0$INDEXED_TERM_P), ConsesLow.append(sentence_in_assertion, (SubLObject)ConsesLow.list(temporal_projection_cols.$const1$startingPointOfIntervalForSentenc)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject starting_point_assertions = virtual_indexing.assertions_mentioning_terms(list_of_terms_2, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = collect_intervals_from_both_starting_point_and_ending_point_assertions(sentence_in_assertion, starting_point_assertions, (SubLObject)ConsesLow.list(assertion), upper, (SubLObject)temporal_projection_cols.T);
        SubLObject entry = (SubLObject)temporal_projection_cols.NIL;
        entry = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject interval = cycl_utilities.formula_arg0(entry);
            if (temporal_projection_cols.NIL != sbhl_time_query_processing.true_temporal_relation_literalP(temporal_projection_cols.$const3$temporallyIntersects, time, interval, (SubLObject)temporal_projection_cols.$kw4$POS, temporal_projection_cols.$const5$BaseKB)) {
                ret_value = (SubLObject)ConsesLow.cons(entry, ret_value);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        possibly_retract_stale_deductions(sentence_in_assertion, ret_value);
        return ret_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 3143L)
    public static SubLObject possibly_retract_stale_deductions(final SubLObject sentence, final SubLObject lst_of_results) {
        SubLObject cdolist_list_var;
        final SubLObject all_assertions = cdolist_list_var = temporal_projection.get_assertions_for_fact_1(sentence);
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = assertions_high.assertion_arguments(assertion);
            SubLObject argument = (SubLObject)temporal_projection_cols.NIL;
            argument = cdolist_list_var_$1.first();
            while (temporal_projection_cols.NIL != cdolist_list_var_$1) {
                if (temporal_projection_cols.NIL != deduction_handles.deduction_p(argument) && temporal_projection_cols.NIL == temporal_projection_utilities.deduction_not_produced_by_temporal_projectionP(argument)) {
                    final SubLObject time = temporal_projection.get_time_for_assertion_1(assertion);
                    final SubLObject mt = assertions_high.assertion_mt(assertion);
                    final SubLObject canon_cnfs = czer_main.canonicalize_gaf(sentence, mt);
                    SubLObject cdolist_list_var_$2 = lst_of_results;
                    SubLObject result = (SubLObject)temporal_projection_cols.NIL;
                    result = cdolist_list_var_$2.first();
                    while (temporal_projection_cols.NIL != cdolist_list_var_$2) {
                        final SubLObject time_2 = cycl_utilities.formula_arg0(result);
                        if (temporal_projection_cols.NIL != sbhl_time_query_processing.true_temporal_relation_literalP(temporal_projection_cols.$const3$temporallyIntersects, time, time_2, (SubLObject)temporal_projection_cols.$kw4$POS, temporal_projection_cols.$const5$BaseKB) && temporal_projection_cols.NIL != argument_is_better_thanP(cycl_utilities.formula_arg1(result, (SubLObject)temporal_projection_cols.UNPROVIDED), deductions_high.deduction_supports(argument))) {
                            SubLObject cdolist_list_var_$3 = canon_cnfs;
                            SubLObject canon_cnf_bind_list_pair = (SubLObject)temporal_projection_cols.NIL;
                            canon_cnf_bind_list_pair = cdolist_list_var_$3.first();
                            while (temporal_projection_cols.NIL != cdolist_list_var_$3) {
                                SubLObject current;
                                final SubLObject datum = current = canon_cnf_bind_list_pair;
                                SubLObject canon_cnf = (SubLObject)temporal_projection_cols.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)temporal_projection_cols.$list6);
                                canon_cnf = current.first();
                                current = current.rest();
                                final SubLObject binding_list = (SubLObject)(current.isCons() ? current.first() : temporal_projection_cols.NIL);
                                cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)temporal_projection_cols.$list6);
                                current = current.rest();
                                if (temporal_projection_cols.NIL == current) {
                                    hl_storage_modules.hl_remove_deduction(canon_cnf, mt, deductions_high.deduction_supports(argument));
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)temporal_projection_cols.$list6);
                                }
                                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                canon_cnf_bind_list_pair = cdolist_list_var_$3.first();
                            }
                        }
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        result = cdolist_list_var_$2.first();
                    }
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                argument = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 4158L)
    public static SubLObject argument_is_better_thanP(final SubLObject argument_1, final SubLObject argument_2) {
        if (temporal_projection_cols.NIL != argument_has_more_factsP(argument_1, argument_2)) {
            return (SubLObject)temporal_projection_cols.T;
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 4300L)
    public static SubLObject argument_has_more_factsP(final SubLObject lst_1, final SubLObject lst_2) {
        SubLObject cdolist_list_var = lst_2;
        SubLObject x = (SubLObject)temporal_projection_cols.NIL;
        x = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (temporal_projection_cols.NIL == support_subsumed_by_justificationP(x, lst_1)) {
                return (SubLObject)temporal_projection_cols.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            x = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 4464L)
    public static SubLObject support_subsumed_by_justificationP(final SubLObject support, final SubLObject lst_of_supports) {
        if (temporal_projection_cols.NIL != conses_high.member(support, lst_of_supports, Symbols.symbol_function((SubLObject)temporal_projection_cols.EQUAL), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
            return (SubLObject)temporal_projection_cols.T;
        }
        if (cycl_utilities.formula_arg0(support).eql((SubLObject)temporal_projection_cols.$kw7$CODE)) {
            return (SubLObject)temporal_projection_cols.T;
        }
        if (temporal_projection_cols.NIL != assertion_handles.assertion_p(support)) {
            if (temporal_projection_cols.NIL != distribution_related_supportP(support)) {
                return (SubLObject)temporal_projection_cols.T;
            }
            SubLObject cdolist_list_var = assertions_high.assertion_arguments(support);
            SubLObject argument = (SubLObject)temporal_projection_cols.NIL;
            argument = cdolist_list_var.first();
            while (temporal_projection_cols.NIL != cdolist_list_var) {
                if (temporal_projection_cols.NIL != deduction_handles.deduction_p(argument)) {
                    SubLObject cdolist_list_var_$4 = deductions_high.deduction_supports(argument);
                    SubLObject support_1 = (SubLObject)temporal_projection_cols.NIL;
                    support_1 = cdolist_list_var_$4.first();
                    while (temporal_projection_cols.NIL != cdolist_list_var_$4) {
                        if (temporal_projection_cols.NIL != conses_high.member(support_1, lst_of_supports, Symbols.symbol_function((SubLObject)temporal_projection_cols.EQUAL), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                            return (SubLObject)temporal_projection_cols.T;
                        }
                        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                        support_1 = cdolist_list_var_$4.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                argument = cdolist_list_var.first();
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 4986L)
    public static SubLObject distribution_related_supportP(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject gaf = assertions_high.gaf_formula(support);
        final SubLObject pred = cycl_utilities.formula_arg0(gaf);
        if (temporal_projection_cols.NIL != conses_high.member(pred, temporal_projection_utilities.$temporal_projection_distribution_predicate_list$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
            return (SubLObject)temporal_projection_cols.T;
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 5202L)
    public static SubLObject collect_intervals_from_events_for_negated_sentence(final SubLObject sentence, final SubLObject lower, final SubLObject justifyP) {
        final SubLObject list_of_terms_1 = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)temporal_projection_cols.$sym0$INDEXED_TERM_P), ConsesLow.append(sentence, (SubLObject)ConsesLow.list(temporal_projection_cols.$const1$startingPointOfIntervalForSentenc)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject list_of_terms_2 = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)temporal_projection_cols.$sym0$INDEXED_TERM_P), ConsesLow.append(sentence, (SubLObject)ConsesLow.list(temporal_projection_cols.$const2$endingPointOfIntervalForSentence)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject starting_point_assertions = virtual_indexing.assertions_mentioning_terms(list_of_terms_1, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject ending_point_assertions = virtual_indexing.assertions_mentioning_terms(list_of_terms_2, (SubLObject)temporal_projection_cols.UNPROVIDED);
        if (temporal_projection_cols.NIL != starting_point_assertions && temporal_projection_cols.NIL != ending_point_assertions) {
            return collect_intervals_from_both_starting_point_and_ending_point_assertions_negated(sentence, starting_point_assertions, ending_point_assertions, lower, justifyP);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 5931L)
    public static SubLObject collect_intervals_from_both_starting_point_and_ending_point_assertions(final SubLObject sentence, final SubLObject starting_point_assertions, final SubLObject ending_point_assertions, final SubLObject upper, final SubLObject justifyP) {
        final SubLObject timeline = create_time_line_from_assertions(starting_point_assertions, ending_point_assertions);
        SubLObject previous_type = (SubLObject)temporal_projection_cols.NIL;
        final SubLObject len = Sequences.length(timeline);
        SubLObject previous_entry = (SubLObject)temporal_projection_cols.NIL;
        SubLObject interval_justification_pairs = (SubLObject)temporal_projection_cols.NIL;
        SubLObject count;
        SubLObject entry;
        SubLObject current_type;
        SubLObject result;
        SubLObject previous_time;
        SubLObject current_time;
        SubLObject result_entry;
        SubLObject time_interval_forward;
        SubLObject time_interval_from_both_starting_and_ending_dates;
        SubLObject time_interval_final;
        SubLObject justifications;
        for (count = (SubLObject)temporal_projection_cols.NIL, count = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count.numL(len); count = Numbers.add(count, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            entry = ConsesLow.nth(count, timeline);
            current_type = cycl_utilities.formula_arg2(entry, (SubLObject)temporal_projection_cols.UNPROVIDED);
            if (count.numE((SubLObject)temporal_projection_cols.ZERO_INTEGER) && current_type.eql((SubLObject)temporal_projection_cols.$sym8$E)) {
                result = backward_intervals_for_sentence(entry, upper, justifyP);
                if (temporal_projection_cols.NIL != result) {
                    interval_justification_pairs = ConsesLow.append(interval_justification_pairs, result);
                }
            }
            if (previous_type.eql((SubLObject)temporal_projection_cols.$sym9$S) && current_type.eql((SubLObject)temporal_projection_cols.$sym8$E)) {
                previous_time = cycl_utilities.formula_arg0(previous_entry);
                current_time = cycl_utilities.formula_arg0(entry);
                result_entry = cycl_utilities.formula_arg0(forward_intervals_for_sentence(previous_entry, upper, justifyP));
                time_interval_forward = cycl_utilities.formula_arg0(result_entry);
                time_interval_from_both_starting_and_ending_dates = (SubLObject)ConsesLow.list(temporal_projection_cols.$const10$TimeIntervalInclusiveFn, previous_time, current_time);
                time_interval_final = (SubLObject)temporal_projection_cols.NIL;
                justifications = (SubLObject)temporal_projection_cols.NIL;
                if (temporal_projection_cols.NIL != sbhl_time_query_processing.true_temporal_relation_literalP(temporal_projection_cols.$const11$temporallySubsumes, time_interval_from_both_starting_and_ending_dates, time_interval_forward, (SubLObject)temporal_projection_cols.$kw4$POS, temporal_projection_cols.$const5$BaseKB)) {
                    time_interval_final = time_interval_forward;
                    if (temporal_projection_cols.NIL != justifyP) {
                        justifications = ConsesLow.append(cycl_utilities.formula_arg1(result_entry, (SubLObject)temporal_projection_cols.UNPROVIDED), (SubLObject)ConsesLow.list(cycl_utilities.formula_arg1(previous_entry, (SubLObject)temporal_projection_cols.UNPROVIDED)));
                    }
                }
                else {
                    time_interval_final = time_interval_from_both_starting_and_ending_dates;
                    if (temporal_projection_cols.NIL != justifyP) {
                        justifications = (SubLObject)ConsesLow.list(cycl_utilities.formula_arg1(previous_entry, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection_cols.UNPROVIDED));
                    }
                }
                result_entry = (SubLObject)ConsesLow.list(time_interval_final, justifications, (SubLObject)temporal_projection_cols.ONE_INTEGER);
                interval_justification_pairs = (SubLObject)ConsesLow.cons(temporal_projection.verify_result_entry(result_entry, sentence, justifyP, upper), interval_justification_pairs);
            }
            previous_type = current_type;
            previous_entry = entry;
            if (count.numE(Numbers.subtract(len, (SubLObject)temporal_projection_cols.ONE_INTEGER)) && current_type.eql((SubLObject)temporal_projection_cols.$sym9$S)) {
                result = forward_intervals_for_sentence(entry, upper, justifyP);
                if (temporal_projection_cols.NIL != result) {
                    interval_justification_pairs = ConsesLow.append(interval_justification_pairs, result);
                }
            }
        }
        return interval_justification_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 8218L)
    public static SubLObject collect_intervals_from_both_starting_point_and_ending_point_assertions_negated(final SubLObject sentence, final SubLObject starting_point_assertions, final SubLObject ending_point_assertions, final SubLObject lower, final SubLObject justifyP) {
        final SubLObject timeline = create_time_line_from_assertions(starting_point_assertions, ending_point_assertions);
        SubLObject previous_type = (SubLObject)temporal_projection_cols.NIL;
        final SubLObject len = Sequences.length(timeline);
        SubLObject previous_entry = (SubLObject)temporal_projection_cols.NIL;
        SubLObject interval_justification_pairs = (SubLObject)temporal_projection_cols.NIL;
        SubLObject count;
        SubLObject entry;
        SubLObject current_type;
        SubLObject previous_time;
        SubLObject current_time;
        SubLObject result_entry;
        SubLObject justifications;
        for (count = (SubLObject)temporal_projection_cols.NIL, count = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count.numL(len); count = Numbers.add(count, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            entry = ConsesLow.nth(count, timeline);
            current_type = cycl_utilities.formula_arg2(entry, (SubLObject)temporal_projection_cols.UNPROVIDED);
            if (previous_type.eql((SubLObject)temporal_projection_cols.$sym8$E) && current_type.eql((SubLObject)temporal_projection_cols.$sym9$S)) {
                previous_time = cycl_utilities.formula_arg0(previous_entry);
                current_time = cycl_utilities.formula_arg0(entry);
                result_entry = (SubLObject)temporal_projection_cols.NIL;
                justifications = (SubLObject)temporal_projection_cols.NIL;
                if (temporal_projection_cols.NIL != justifyP) {
                    justifications = (SubLObject)ConsesLow.list(cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg1(previous_entry, (SubLObject)temporal_projection_cols.UNPROVIDED));
                }
                result_entry = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(temporal_projection_cols.$const10$TimeIntervalInclusiveFn, previous_time, current_time), justifications, (SubLObject)temporal_projection_cols.ONE_INTEGER);
                interval_justification_pairs = (SubLObject)ConsesLow.cons(temporal_projection.verify_result_entry(result_entry, sentence, justifyP, lower), interval_justification_pairs);
            }
            previous_type = current_type;
            previous_entry = entry;
        }
        return interval_justification_pairs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 9353L)
    public static SubLObject backward_intervals_for_sentence(final SubLObject entry, final SubLObject upper, final SubLObject justifyP) {
        final SubLObject assertion = cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject time_1 = cycl_utilities.formula_arg0(entry);
        final SubLObject gaf = assertions_high.gaf_formula(assertion);
        final SubLObject sentence = cycl_utilities.formula_arg1(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject backward_distribution = find_best_backward_distribution_for_sentence(sentence);
        if (temporal_projection_cols.NIL == backward_distribution) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        final SubLObject gaf_$5 = assertions_high.gaf_formula(backward_distribution);
        final SubLObject predicate_in_distribution = cycl_utilities.formula_arg0(gaf_$5);
        if (predicate_in_distribution.eql(temporal_projection_cols.$const12$defaultConditionalProbabilityForS)) {
            return temporal_projection.collect_intervals_from_default_conditional_prob_for_sentence_backward_from_time(sentence, backward_distribution, time_1, (SubLObject)ConsesLow.list(backward_distribution, assertion), justifyP, upper);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 10085L)
    public static SubLObject forward_intervals_for_sentence(final SubLObject entry, final SubLObject upper, final SubLObject justifyP) {
        final SubLObject assertion = cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject time_1 = cycl_utilities.formula_arg0(entry);
        final SubLObject gaf = assertions_high.gaf_formula(assertion);
        final SubLObject sentence = cycl_utilities.formula_arg1(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject forward_distribution = find_best_forward_distribution_for_sentence(sentence);
        if (temporal_projection_cols.NIL == forward_distribution) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        final SubLObject gaf_$6 = assertions_high.gaf_formula(forward_distribution);
        final SubLObject predicate_in_distribution = cycl_utilities.formula_arg0(gaf_$6);
        if (predicate_in_distribution.eql(temporal_projection_cols.$const13$conditionalProbabilityForSentence)) {
            return temporal_projection.collect_intervals_from_type_level_distributions_forward(sentence, forward_distribution, time_1, (SubLObject)ConsesLow.list(forward_distribution, assertion), justifyP, upper);
        }
        if (predicate_in_distribution.eql(temporal_projection_cols.$const12$defaultConditionalProbabilityForS)) {
            return temporal_projection.collect_intervals_from_default_conditional_prob_for_sentence_forward_from_time(sentence, forward_distribution, time_1, (SubLObject)ConsesLow.list(forward_distribution, assertion), justifyP, upper);
        }
        if (predicate_in_distribution.eql(temporal_projection_cols.$const14$defaultConditionalProbabilityOfSt)) {
            return temporal_projection.collect_intervals_from_default_conditional_prob_of_state_forward_from_time(sentence, forward_distribution, time_1, (SubLObject)ConsesLow.list(forward_distribution, assertion), justifyP, upper);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 11331L)
    public static SubLObject find_best_backward_distribution_for_sentence(final SubLObject sentence) {
        SubLObject dist = find_type_level_distribution_for_sentence(sentence);
        if (temporal_projection_cols.NIL != dist) {
            return dist;
        }
        dist = find_default_backward_distribution_for_sentence(sentence);
        if (temporal_projection_cols.NIL != dist) {
            return dist;
        }
        dist = find_default_distribution_for_sentence(sentence);
        if (temporal_projection_cols.NIL != dist) {
            return dist;
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 11723L)
    public static SubLObject find_best_forward_distribution_for_sentence(final SubLObject sentence) {
        SubLObject dist = find_type_level_distribution_for_sentence(sentence);
        if (temporal_projection_cols.NIL != dist) {
            return dist;
        }
        dist = find_default_forward_distribution_for_sentence(sentence);
        if (temporal_projection_cols.NIL != dist) {
            return dist;
        }
        dist = find_default_distribution_for_sentence(sentence);
        if (temporal_projection_cols.NIL != dist) {
            return dist;
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 12113L)
    public static SubLObject find_type_level_distribution_for_sentence(final SubLObject sentence) {
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        final SubLObject arg_2 = cycl_utilities.formula_arg2(sentence, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(predicate, temporal_projection_cols.$const13$conditionalProbabilityForSentence, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject arg_pos = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            if (arg_pos.numE((SubLObject)temporal_projection_cols.TWO_INTEGER)) {
                final SubLObject col_in_arg_pos = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                if (temporal_projection_cols.NIL != isa.isaP(arg_2, col_in_arg_pos, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    return assertion;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 12586L)
    public static SubLObject find_default_backward_distribution_for_sentence(final SubLObject sentence) {
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        if (predicate.eql(temporal_projection_cols.$const15$isa)) {
            final SubLObject col = cycl_utilities.formula_arg2(sentence, (SubLObject)temporal_projection_cols.UNPROVIDED);
            return cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, temporal_projection_cols.$const16$conditionalProbabilityOfStateAfte, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED));
        }
        return cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(predicate, temporal_projection_cols.$const17$defaultConditionalProbabilityForS, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 13016L)
    public static SubLObject find_default_forward_distribution_for_sentence(final SubLObject sentence) {
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        if (predicate.eql(temporal_projection_cols.$const15$isa)) {
            final SubLObject col = cycl_utilities.formula_arg2(sentence, (SubLObject)temporal_projection_cols.UNPROVIDED);
            return cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, temporal_projection_cols.$const18$conditionalProbabilityOfStateAfte, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED));
        }
        return cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(predicate, temporal_projection_cols.$const19$defaultConditionalProbabilityForS, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 13440L)
    public static SubLObject find_default_distribution_for_sentence(final SubLObject sentence) {
        final SubLObject predicate = cycl_utilities.formula_arg0(sentence);
        if (predicate.eql(temporal_projection_cols.$const15$isa)) {
            final SubLObject col = cycl_utilities.formula_arg2(sentence, (SubLObject)temporal_projection_cols.UNPROVIDED);
            return cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(col, temporal_projection_cols.$const14$defaultConditionalProbabilityOfSt, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED));
        }
        return cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(predicate, temporal_projection_cols.$const12$defaultConditionalProbabilityForS, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 13848L)
    public static SubLObject create_time_line_from_assertions(final SubLObject starting_assertions, final SubLObject ending_assertions) {
        SubLObject lst = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = starting_assertions;
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            lst = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(cycl_utilities.formula_arg2(assertions_high.gaf_formula(assertion), (SubLObject)temporal_projection_cols.UNPROVIDED), assertion, (SubLObject)temporal_projection_cols.$sym9$S), lst);
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        cdolist_list_var = ending_assertions;
        assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            lst = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(cycl_utilities.formula_arg2(assertions_high.gaf_formula(assertion), (SubLObject)temporal_projection_cols.UNPROVIDED), assertion, (SubLObject)temporal_projection_cols.$sym8$E), lst);
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return Sort.sort(lst, Symbols.symbol_function((SubLObject)temporal_projection_cols.$sym20$LIST_TIME_COMPARATOR), (SubLObject)temporal_projection_cols.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 14271L)
    public static SubLObject list_time_comparator(final SubLObject a, final SubLObject b) {
        if (temporal_projection_cols.NIL == a) {
            return (SubLObject)SubLObjectFactory.makeBoolean(temporal_projection_cols.NIL != b);
        }
        if (temporal_projection_cols.NIL == b) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        if (temporal_projection_cols.NIL != date_utilities.later_than(cycl_utilities.formula_arg0(b), cycl_utilities.formula_arg0(a))) {
            return (SubLObject)temporal_projection_cols.T;
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 14480L)
    public static SubLObject compute_likelihoods_from_event_calculus(final SubLObject sentence, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject list_of_terms_1 = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)temporal_projection_cols.$sym0$INDEXED_TERM_P), ConsesLow.append(sentence, (SubLObject)ConsesLow.list(temporal_projection_cols.$const1$startingPointOfIntervalForSentenc)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject list_of_terms_2 = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)temporal_projection_cols.$sym0$INDEXED_TERM_P), ConsesLow.append(sentence, (SubLObject)ConsesLow.list(temporal_projection_cols.$const2$endingPointOfIntervalForSentence)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject starting_point_assertions = virtual_indexing.assertions_mentioning_terms(list_of_terms_1, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject ending_point_assertions = virtual_indexing.assertions_mentioning_terms(list_of_terms_2, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject time_line = create_time_line_from_assertions(starting_point_assertions, ending_point_assertions);
        SubLObject cdotimes_end_var;
        SubLObject count;
        SubLObject current;
        SubLObject current_time;
        SubLObject current_assertion;
        SubLObject current_state;
        SubLObject prev;
        SubLObject best_dist;
        SubLObject predicate_in_distribution;
        SubLObject prev_time;
        SubLObject prev_assertion;
        SubLObject prev_state;
        SubLObject best_dist2;
        SubLObject predicate_in_distribution2;
        for (cdotimes_end_var = Sequences.length(time_line), count = (SubLObject)temporal_projection_cols.NIL, count = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count.numL(cdotimes_end_var); count = Numbers.add(count, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            current = ConsesLow.nth(count, time_line);
            current_time = ConsesLow.nth((SubLObject)temporal_projection_cols.ZERO_INTEGER, current);
            current_assertion = ConsesLow.nth((SubLObject)temporal_projection_cols.ONE_INTEGER, current);
            current_state = ConsesLow.nth((SubLObject)temporal_projection_cols.TWO_INTEGER, current);
            prev = (SubLObject)temporal_projection_cols.NIL;
            if (count.numG((SubLObject)temporal_projection_cols.ZERO_INTEGER)) {
                prev = ConsesLow.nth(Numbers.subtract(count, (SubLObject)temporal_projection_cols.ONE_INTEGER), time_line);
            }
            if (temporal_projection_cols.NIL == prev && temporal_projection_cols.NIL != date_utilities.later_than(current_time, mt_time) && current_state.eql((SubLObject)temporal_projection_cols.$sym8$E)) {
                best_dist = find_best_backward_distribution_for_sentence(sentence);
                predicate_in_distribution = cycl_utilities.formula_arg0(best_dist);
                if (predicate_in_distribution.eql(temporal_projection_cols.$const12$defaultConditionalProbabilityForS)) {
                    return find_likelihood_from_default_conditional_probability_for_sentence_backwards(sentence, best_dist, current_time, mt_time, (SubLObject)ConsesLow.list(best_dist, current_assertion), justifyP);
                }
            }
            if (temporal_projection_cols.NIL != prev) {
                prev_time = ConsesLow.nth((SubLObject)temporal_projection_cols.ZERO_INTEGER, prev);
                prev_assertion = ConsesLow.nth((SubLObject)temporal_projection_cols.ONE_INTEGER, prev);
                prev_state = ConsesLow.nth((SubLObject)temporal_projection_cols.TWO_INTEGER, prev);
                if (temporal_projection_cols.NIL != date_utilities.later_than(mt_time, prev_time) && temporal_projection_cols.NIL != date_utilities.later_than(current_time, mt_time)) {
                    if (current_state.eql((SubLObject)temporal_projection_cols.$sym9$S) && prev_state.eql((SubLObject)temporal_projection_cols.$sym8$E)) {
                        return Values.values(temporal_projection.$numeric_likelihood_fn_zero$.getDynamicValue(thread), (SubLObject)ConsesLow.list(prev_assertion, current_assertion));
                    }
                    if (current_state.eql((SubLObject)temporal_projection_cols.$sym8$E) && prev_state.eql((SubLObject)temporal_projection_cols.$sym9$S)) {
                        return Values.values(temporal_projection.$numeric_likelihood_fn_one$.getDynamicValue(thread), (SubLObject)ConsesLow.list(prev_assertion, current_assertion));
                    }
                }
                if (count.numE(Numbers.subtract(Sequences.length(time_line), (SubLObject)temporal_projection_cols.ONE_INTEGER)) && temporal_projection_cols.NIL != date_utilities.later_than(mt_time, current_time)) {
                    if (current_state.eql((SubLObject)temporal_projection_cols.$sym8$E)) {
                        return Values.values(temporal_projection.$numeric_likelihood_fn_zero$.getDynamicValue(thread), (SubLObject)ConsesLow.list(current_assertion));
                    }
                    if (current_state.eql((SubLObject)temporal_projection_cols.$sym9$S)) {
                        best_dist2 = find_best_forward_distribution_for_sentence(sentence);
                        predicate_in_distribution2 = cycl_utilities.formula_arg0(best_dist2);
                        if (predicate_in_distribution2.eql(temporal_projection_cols.$const12$defaultConditionalProbabilityForS)) {
                            return find_likelihood_from_default_conditional_probability_for_sentence_forwards(sentence, best_dist2, current_time, mt_time, (SubLObject)ConsesLow.list(best_dist2, current_assertion), justifyP);
                        }
                    }
                }
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 17047L)
    public static SubLObject find_likelihood_from_default_conditional_probability_for_sentence_backwards(final SubLObject sentence, final SubLObject dist, final SubLObject time, final SubLObject mt_time, SubLObject justifications, final SubLObject justifyP) {
        final SubLObject prob = cycl_utilities.formula_arg4(dist, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(dist, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject time_elapsed = temporal_projection.find_time_elapsed_between_time_points(time, mt_time);
        final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
        final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0(time_elapsed);
        final SubLObject value_of_time_elapsed = cycl_utilities.formula_arg1(time_elapsed, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject unit_conversion = quantities.convert_to_units(unit_of_duration_of_time_interval, unit_of_time_elapsed, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        if (!prob.numE((SubLObject)temporal_projection_cols.ONE_INTEGER) && temporal_projection_cols.NIL != unit_conversion && temporal_projection_cols.NIL != value_of_time_elapsed && temporal_projection_cols.NIL != prob && temporal_projection_cols.NIL != value_of_duration_of_time_interval) {
            final SubLObject likelihood = Numbers.expt(prob, Numbers.multiply(Numbers.divide(value_of_time_elapsed, value_of_duration_of_time_interval), unit_conversion));
            if (temporal_projection_cols.NIL != likelihood) {
                if (temporal_projection_cols.NIL != justifyP) {
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, time, mt_time, time_elapsed), temporal_projection_cols.$const5$BaseKB));
                    return Values.values((SubLObject)ConsesLow.list(temporal_projection_cols.$const22$NumericLikelihoodFn, likelihood), justifications);
                }
                return Values.values((SubLObject)ConsesLow.list(temporal_projection_cols.$const22$NumericLikelihoodFn, likelihood));
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 18288L)
    public static SubLObject find_likelihood_from_default_conditional_probability_for_sentence_forwards(final SubLObject sentence, final SubLObject dist, final SubLObject time, final SubLObject mt_time, SubLObject justifications, final SubLObject justifyP) {
        final SubLObject prob = cycl_utilities.formula_arg4(dist, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject duration_of_time_interval = cycl_utilities.formula_arg3(dist, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject time_elapsed = temporal_projection.find_time_elapsed_between_time_points(time, mt_time);
        final SubLObject unit_of_duration_of_time_interval = cycl_utilities.formula_arg0(duration_of_time_interval);
        final SubLObject value_of_duration_of_time_interval = cycl_utilities.formula_arg1(duration_of_time_interval, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0(time_elapsed);
        final SubLObject value_of_time_elapsed = cycl_utilities.formula_arg1(time_elapsed, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject unit_conversion = quantities.convert_to_units(unit_of_duration_of_time_interval, unit_of_time_elapsed, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        if (!prob.numE((SubLObject)temporal_projection_cols.ONE_INTEGER) && temporal_projection_cols.NIL != unit_conversion && temporal_projection_cols.NIL != value_of_time_elapsed && temporal_projection_cols.NIL != prob && temporal_projection_cols.NIL != value_of_duration_of_time_interval) {
            final SubLObject likelihood = Numbers.expt(prob, Numbers.multiply(Numbers.divide(value_of_time_elapsed, value_of_duration_of_time_interval), unit_conversion));
            if (temporal_projection_cols.NIL != likelihood) {
                if (temporal_projection_cols.NIL != justifyP) {
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, time, mt_time, time_elapsed), temporal_projection_cols.$const5$BaseKB));
                    return Values.values((SubLObject)ConsesLow.list(temporal_projection_cols.$const22$NumericLikelihoodFn, likelihood), justifications);
                }
                return Values.values((SubLObject)ConsesLow.list(temporal_projection_cols.$const22$NumericLikelihoodFn, likelihood));
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 19529L)
    public static SubLObject handle_temporal_interpolation_function_for_predicate(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg0(fact), temporal_projection_cols.$const23$temporalInterpolationFunctionForP, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject all_times = get_list_of_times_for_assertion(fact);
            final SubLObject earlier_time = find_closest_time_before(time, all_times);
            final SubLObject later_time = find_closest_time_after(time, all_times);
            SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
            if (temporal_projection_cols.NIL != earlier_time && temporal_projection_cols.NIL != later_time) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject dist = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject time_elapsed = find_time_elapsed(earlier_time, later_time);
                justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, earlier_time, later_time, time_elapsed), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                final SubLObject supporting_assertion = get_assertion_for_given_fact_and_time(fact, earlier_time);
                final SubLObject supporting_assertion_2 = get_assertion_for_given_fact_and_time(fact, later_time);
                if (temporal_projection_cols.NIL != supporting_assertion) {
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(supporting_assertion));
                }
                if (temporal_projection_cols.NIL != supporting_assertion_2) {
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(supporting_assertion_2));
                }
                return Values.values(dist, time_elapsed, justifications);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 21175L)
    public static SubLObject handle_duration_weighted_decay_distribution(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg0(fact), temporal_projection_cols.$const24$durationWeightedDistributionForPr, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject time_point_1 = get_farthest_time_for_assertion(fact, time);
        final SubLObject duration = get_duration_of_time_interval(time_point_1);
        final SubLObject arg_1_entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject arg_2_entity = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = all_assertions;
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            if (cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED).numE((SubLObject)temporal_projection_cols.TWO_INTEGER) && temporal_projection_cols.NIL != isa.isa_in_any_mtP(arg_2_entity, cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED))) {
                final SubLObject time_elapsed = find_time_elapsed(time_point_1, time);
                final SubLObject unit = cycl_utilities.formula_arg5(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject dist = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject scaled_dist = scale_distribution(dist, unit, duration);
                justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                if (temporal_projection_cols.NIL != time_point_1) {
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, time_point_1, time, time_elapsed), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                }
                if (temporal_projection_cols.NIL != duration) {
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const25$duration, time_point_1, duration), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                }
                final SubLObject supporting_assertion = get_assertion_for_binary_predicates(fact);
                if (temporal_projection_cols.NIL != supporting_assertion) {
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(supporting_assertion));
                }
                return Values.values(scaled_dist, time_elapsed, justifications);
            }
            if (cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED).numE((SubLObject)temporal_projection_cols.ONE_INTEGER) && temporal_projection_cols.NIL != isa.isa_in_any_mtP(arg_1_entity, cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED))) {
                final SubLObject time_elapsed = find_time_elapsed(time_point_1, time);
                final SubLObject dist2 = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject unit2 = cycl_utilities.formula_arg5(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject scaled_dist = scale_distribution(dist2, unit2, duration);
                justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                if (temporal_projection_cols.NIL != time_point_1) {
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, time_point_1, time, time_elapsed), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                }
                if (temporal_projection_cols.NIL != duration) {
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const25$duration, time_point_1, duration), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                }
                final SubLObject supporting_assertion = get_assertion_for_binary_predicates(fact);
                if (temporal_projection_cols.NIL != supporting_assertion) {
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(supporting_assertion));
                }
                return Values.values(scaled_dist, time_elapsed, justifications);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 24053L)
    public static SubLObject handle_decay_distribution_for_assertion_in_time_interval(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_bindings = mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const26$decayDistributionForAssertionInTi, fact, (SubLObject)temporal_projection_cols.$list27), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = all_bindings;
        SubLObject binding = (SubLObject)temporal_projection_cols.NIL;
        binding = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject interval = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, binding);
            final SubLObject dist = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym29$_Y, binding);
            thread.resetMultipleValues();
            final SubLObject result = time_falls_in_temporal_interval(interval, time);
            final SubLObject justification_1 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection_cols.NIL != result) {
                justifications = ConsesLow.append(justifications, justification_1);
                final SubLObject supporting_assertion = get_assertion_for_ternary_predicates(temporal_projection_cols.$const26$decayDistributionForAssertionInTi, fact, interval, dist);
                if (temporal_projection_cols.NIL != supporting_assertion) {
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(supporting_assertion));
                }
                return Values.values(dist, (SubLObject)temporal_projection_cols.NIL, justifications);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 24993L)
    public static SubLObject use_causal_analysis_to_find_likelihood(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject result = use_noisy_or_model_to_calculate_prob(fact, time);
        SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != result) {
            return Values.values(result, justifications);
        }
        thread.resetMultipleValues();
        result = use_noisy_and_model_to_calculate_prob(fact, time);
        justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != result) {
            return Values.values(result, justifications);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 25404L)
    public static SubLObject use_noisy_and_model_to_calculate_prob(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_bindings = mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const30$distributionForSentenceGivenNeces, fact, (SubLObject)temporal_projection_cols.$list31), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject observed_prob = (SubLObject)temporal_projection_cols.NIL;
        SubLObject observed_causes = (SubLObject)temporal_projection_cols.NIL;
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = all_bindings;
        SubLObject binding = (SubLObject)temporal_projection_cols.NIL;
        binding = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject cause = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, binding);
            final SubLObject interval = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym29$_Y, binding);
            final SubLObject dist = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym32$_Z, binding);
            final SubLObject closest_time_for_cause = get_closest_time_for_assertion_before_given_time(cause, time);
            if (temporal_projection_cols.NIL != closest_time_for_cause) {
                final SubLObject time_elapsed_since_cause = find_time_elapsed(closest_time_for_cause, time);
                if (temporal_projection_cols.NIL != time_falls_in_interval(closest_time_for_cause, time, interval, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    observed_causes = (SubLObject)ConsesLow.cons(cause, observed_causes);
                    final SubLObject prob_of_effect_given_cause = calculate_persistence_likelihood(time_elapsed_since_cause, dist);
                    if (temporal_projection_cols.NIL != prob_of_effect_given_cause) {
                        final SubLObject supporting_assertion = get_assertion_for_predicate_of_arity_four(temporal_projection_cols.$const30$distributionForSentenceGivenNeces, fact, cause, interval, dist);
                        if (temporal_projection_cols.NIL != supporting_assertion) {
                            justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(supporting_assertion));
                        }
                        if (temporal_projection_cols.NIL != observed_prob) {
                            observed_prob = Numbers.multiply(observed_prob, prob_of_effect_given_cause);
                        }
                        else {
                            observed_prob = prob_of_effect_given_cause;
                        }
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        thread.resetMultipleValues();
        final SubLObject prob_due_to_unobserved_causes = find_probabilities_due_to_unobserved_causes(fact, observed_causes);
        final SubLObject justification_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL == prob_due_to_unobserved_causes) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        if (temporal_projection_cols.NIL != observed_prob) {
            return Values.values(Numbers.multiply(observed_prob, prob_due_to_unobserved_causes), ConsesLow.append(justifications, justification_1));
        }
        return Values.values(prob_due_to_unobserved_causes, justification_1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 27589L)
    public static SubLObject find_probabilities_due_to_unobserved_causes(final SubLObject fact, final SubLObject observed_causes) {
        SubLObject prob_due_to_unobserved_causes = (SubLObject)temporal_projection_cols.NIL;
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var;
        final SubLObject all_bindings = cdolist_list_var = mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const33$conditionalProbabilityOfStateGive, cycl_utilities.formula_arg0(fact), cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), (SubLObject)temporal_projection_cols.$list31), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject binding = (SubLObject)temporal_projection_cols.NIL;
        binding = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject pred_in_condition = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, binding);
            final SubLObject col_in_first_arg_position = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym29$_Y, binding);
            final SubLObject prob = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym32$_Z, binding);
            if (temporal_projection_cols.NIL == check_presence_of_condition_in_observed_causes_ins_pos_1(pred_in_condition, col_in_first_arg_position, observed_causes)) {
                if (temporal_projection_cols.NIL != prob_due_to_unobserved_causes) {
                    prob_due_to_unobserved_causes = Numbers.multiply(prob_due_to_unobserved_causes, cycl_utilities.formula_arg1(prob, (SubLObject)temporal_projection_cols.UNPROVIDED));
                }
                else {
                    prob_due_to_unobserved_causes = cycl_utilities.formula_arg1(prob, (SubLObject)temporal_projection_cols.UNPROVIDED);
                }
                final SubLObject supporting_assertion = get_assertion_for_predicate_of_arity_five(temporal_projection_cols.$const33$conditionalProbabilityOfStateGive, cycl_utilities.formula_arg0(fact), cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), pred_in_condition, col_in_first_arg_position, prob);
                justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(supporting_assertion));
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        if (temporal_projection_cols.NIL != prob_due_to_unobserved_causes) {
            return Values.values(prob_due_to_unobserved_causes, justifications);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 29018L)
    public static SubLObject check_presence_of_condition_in_observed_causes_ins_pos_1(final SubLObject pred, final SubLObject col, final SubLObject observed_causes) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = observed_causes;
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (cycl_utilities.formula_arg0(assertion).eql(pred) && temporal_projection_cols.NIL != isa.isaP(cycl_utilities.formula_arg1(assertion, (SubLObject)temporal_projection_cols.UNPROVIDED), col, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                return (SubLObject)temporal_projection_cols.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 29323L)
    public static SubLObject use_noisy_or_model_to_calculate_prob(final SubLObject fact, final SubLObject time) {
        final SubLObject all_bindings = mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const34$distributionForSentenceGivenSuffi, fact, (SubLObject)temporal_projection_cols.$list31), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject list_of_causes_and_probabilities = (SubLObject)temporal_projection_cols.NIL;
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = all_bindings;
        SubLObject binding = (SubLObject)temporal_projection_cols.NIL;
        binding = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject cause = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, binding);
            final SubLObject interval = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym29$_Y, binding);
            final SubLObject dist = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym32$_Z, binding);
            final SubLObject closest_time_for_cause = get_closest_time_for_assertion_before_given_time(cause, time);
            if (temporal_projection_cols.NIL != closest_time_for_cause) {
                final SubLObject time_elapsed_since_cause = find_time_elapsed(closest_time_for_cause, time);
                if (temporal_projection_cols.NIL != time_falls_in_interval(closest_time_for_cause, time, interval, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    final SubLObject prob_of_effect_given_cause = calculate_persistence_likelihood(time_elapsed_since_cause, dist);
                    if (temporal_projection_cols.NIL != prob_of_effect_given_cause) {
                        final SubLObject supporting_assertion = get_assertion_for_predicate_of_arity_four(temporal_projection_cols.$const34$distributionForSentenceGivenSuffi, fact, cause, interval, dist);
                        if (temporal_projection_cols.NIL != supporting_assertion) {
                            justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(supporting_assertion));
                        }
                        list_of_causes_and_probabilities = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(cause, (SubLObject)temporal_projection_cols.ONE_INTEGER, prob_of_effect_given_cause), list_of_causes_and_probabilities);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return Values.values(compute_probability_for_list_of_causes(list_of_causes_and_probabilities), justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 31158L)
    public static SubLObject use_causal_analysis_to_find_likelihood_2(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.formula_arg0(fact);
        SubLObject lst_of_causes = (SubLObject)temporal_projection_cols.NIL;
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var;
        final SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt(pred, temporal_projection_cols.$const35$conditionalProbabilityPatternsFor, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject prob_for_node = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject bindings_list = get_list_of_bindings_for_cons(cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED), fact);
            if (temporal_projection_cols.NIL != check_whether_fact_satisfies_constraints(cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED), bindings_list)) {
                thread.resetMultipleValues();
                final SubLObject assertion_matching_conseq = find_assertion_matching_conditions_in_conseq(cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED), bindings_list);
                final SubLObject justification_1 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                justifications = ConsesLow.append(justifications, justification_1);
                if (temporal_projection_cols.NIL != assertion_matching_conseq) {
                    SubLObject lst_of_assertions_with_non_zero_prob = (SubLObject)temporal_projection_cols.NIL;
                    SubLObject cdolist_list_var_$7 = assertion_matching_conseq;
                    SubLObject assertion_1 = (SubLObject)temporal_projection_cols.NIL;
                    assertion_1 = cdolist_list_var_$7.first();
                    while (temporal_projection_cols.NIL != cdolist_list_var_$7) {
                        thread.resetMultipleValues();
                        final SubLObject persis_prob = get_persistence_likelihood_for_fact_at_time(assertion_1, time, (SubLObject)temporal_projection_cols.T, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.T, (SubLObject)temporal_projection_cols.UNPROVIDED);
                        final SubLObject justification_2 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (temporal_projection_cols.NIL != persis_prob && cycl_utilities.formula_arg1(persis_prob, (SubLObject)temporal_projection_cols.UNPROVIDED).numG((SubLObject)temporal_projection_cols.$float36$0_001)) {
                            justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                            justifications = ConsesLow.append(justifications, justification_2);
                            lst_of_assertions_with_non_zero_prob = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(assertion_1, cycl_utilities.formula_arg1(persis_prob, (SubLObject)temporal_projection_cols.UNPROVIDED), prob_for_node), lst_of_assertions_with_non_zero_prob);
                        }
                        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                        assertion_1 = cdolist_list_var_$7.first();
                    }
                    if (temporal_projection_cols.NIL != lst_of_assertions_with_non_zero_prob) {
                        final SubLObject entry_with_closest_event = get_fact_closest_to_time_point(lst_of_assertions_with_non_zero_prob, time);
                        lst_of_causes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(cycl_utilities.formula_arg0(entry_with_closest_event), cycl_utilities.formula_arg1(entry_with_closest_event, (SubLObject)temporal_projection_cols.UNPROVIDED), prob_for_node), lst_of_causes);
                    }
                }
                if (temporal_projection_cols.NIL == assertion_matching_conseq) {
                    thread.resetMultipleValues();
                    final SubLObject prior = get_prior_probability_for_pattern(cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED), bindings_list);
                    final SubLObject justification_3 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(justification_3));
                    lst_of_causes = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED), prior, prob_for_node), lst_of_causes);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return Values.values(compute_probability_for_list_of_causes(lst_of_causes), justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 33814L)
    public static SubLObject compute_probability_for_list_of_causes(final SubLObject lst) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (temporal_projection_cols.NIL == lst) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        final SubLObject all_subsets = generate_powerset(Mapping.mapcar(Symbols.symbol_function((SubLObject)temporal_projection_cols.$sym37$FORMULA_ARG0), lst));
        SubLObject net_prob = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = all_subsets;
        SubLObject subset = (SubLObject)temporal_projection_cols.NIL;
        subset = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject prob_of_subset = compute_probability_for_subset(subset, lst);
            final SubLObject prob_of_effect = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection_cols.NIL == net_prob) {
                net_prob = Numbers.multiply(prob_of_subset, prob_of_effect);
            }
            else {
                net_prob = Numbers.add(net_prob, Numbers.multiply(prob_of_subset, prob_of_effect));
            }
            cdolist_list_var = cdolist_list_var.rest();
            subset = cdolist_list_var.first();
        }
        return net_prob;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 34599L)
    public static SubLObject compute_probability_for_subset(final SubLObject subset, final SubLObject lst) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject prob_of_subset = (SubLObject)temporal_projection_cols.NIL;
        SubLObject complement_of_prob_of_effect_given_subset = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = subset;
        SubLObject element = (SubLObject)temporal_projection_cols.NIL;
        element = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject prob_of_truth = find_prior_and_probability_from_list(element, lst);
            final SubLObject prob_of_effect_given_cause = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection_cols.NIL == prob_of_subset) {
                prob_of_subset = prob_of_truth;
            }
            else {
                prob_of_subset = Numbers.multiply(prob_of_subset, prob_of_truth);
            }
            if (temporal_projection_cols.NIL == complement_of_prob_of_effect_given_subset) {
                complement_of_prob_of_effect_given_subset = Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, prob_of_effect_given_cause);
            }
            else {
                complement_of_prob_of_effect_given_subset = Numbers.multiply(complement_of_prob_of_effect_given_subset, Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, prob_of_effect_given_cause));
            }
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        cdolist_list_var = lst;
        SubLObject e = (SubLObject)temporal_projection_cols.NIL;
        e = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (temporal_projection_cols.NIL == conses_high.member(cycl_utilities.formula_arg0(e), subset, Symbols.symbol_function((SubLObject)temporal_projection_cols.EQUAL), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                final SubLObject prob_of_truth = find_prior_and_probability_from_list(cycl_utilities.formula_arg0(e), lst);
                if (temporal_projection_cols.NIL == prob_of_subset) {
                    prob_of_subset = Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, prob_of_truth);
                }
                else {
                    prob_of_subset = Numbers.multiply(prob_of_subset, Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, prob_of_truth));
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            e = cdolist_list_var.first();
        }
        if (temporal_projection_cols.NIL == complement_of_prob_of_effect_given_subset) {
            complement_of_prob_of_effect_given_subset = (SubLObject)temporal_projection_cols.ONE_INTEGER;
        }
        return Values.values(prob_of_subset, Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, complement_of_prob_of_effect_given_subset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 36575L)
    public static SubLObject find_prior_and_probability_from_list(final SubLObject element, final SubLObject lst) {
        SubLObject cdolist_list_var = lst;
        SubLObject e = (SubLObject)temporal_projection_cols.NIL;
        e = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (cycl_utilities.formula_arg0(e).equal(element)) {
                return Values.values(conses_high.second(e), conses_high.third(e));
            }
            cdolist_list_var = cdolist_list_var.rest();
            e = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 36755L)
    public static SubLObject check_delay_between_start_of_event_types_in_sit_type(final SubLObject fact) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject event = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject done_list = (SubLObject)temporal_projection_cols.NIL;
        final SubLObject date = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject cdolist_list_var = isa.isa(event, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject col = (SubLObject)temporal_projection_cols.NIL;
        col = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$8;
            final SubLObject all_assertions = cdolist_list_var_$8 = kb_mapping_utilities.pred_value_gafs_in_any_mt(col, temporal_projection_cols.$const38$delayBetweenStartOfEventTypesInSi, (SubLObject)temporal_projection_cols.THREE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
            SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
            assertion = cdolist_list_var_$8.first();
            while (temporal_projection_cols.NIL != cdolist_list_var_$8) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject duration = cycl_utilities.formula_arg6(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject super_event_type = cycl_utilities.formula_arg1(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject sub_event_type = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                if (temporal_projection_cols.NIL == conses_high.member(super_event_type, done_list, Symbols.symbol_function((SubLObject)temporal_projection_cols.EQUAL), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    done_list = (SubLObject)ConsesLow.cons(super_event_type, done_list);
                    SubLObject cdolist_list_var_$9 = mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const39$subEvents, (SubLObject)temporal_projection_cols.$sym28$_X, event), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
                    SubLObject binding = (SubLObject)temporal_projection_cols.NIL;
                    binding = cdolist_list_var_$9.first();
                    while (temporal_projection_cols.NIL != cdolist_list_var_$9) {
                        final SubLObject super_event = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, binding);
                        if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(super_event, super_event_type)) {
                            SubLObject cdolist_list_var_$10 = mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const39$subEvents, super_event, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
                            SubLObject bindings_2 = (SubLObject)temporal_projection_cols.NIL;
                            bindings_2 = cdolist_list_var_$10.first();
                            while (temporal_projection_cols.NIL != cdolist_list_var_$10) {
                                final SubLObject sub_event_2 = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, bindings_2);
                                if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(sub_event_2, sub_event_type)) {
                                    thread.resetMultipleValues();
                                    final SubLObject starting_date = get_starting_date_of_concept(sub_event_2);
                                    final SubLObject justification_1 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (temporal_projection_cols.NIL != starting_date) {
                                        final SubLObject time_elapsed = find_time_elapsed(starting_date, date);
                                        final SubLObject time_elapsed_since_start = find_time_elapsed(starting_date, starting_date);
                                        thread.resetMultipleValues();
                                        final SubLObject result = calculate_probability_of_delay_between_events(time_elapsed, all_assertions, duration, time_elapsed_since_start);
                                        SubLObject justifications = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        justifications = ConsesLow.append(justifications, justification_1);
                                        if (temporal_projection_cols.NIL != result) {
                                            return Values.values(result, justifications);
                                        }
                                    }
                                }
                                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                                bindings_2 = cdolist_list_var_$10.first();
                            }
                        }
                        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                        binding = cdolist_list_var_$9.first();
                    }
                }
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                assertion = cdolist_list_var_$8.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 38839L)
    public static SubLObject handle_default_decay_function_for_predicate(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg0(fact), temporal_projection_cols.$const41$defaultDecayFunctionForPredicate, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject times_for_fact = get_list_of_times_for_assertion(fact);
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        if (temporal_projection_cols.NIL != all_assertions) {
            SubLObject cdolist_list_var = all_assertions;
            SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
            assertion = cdolist_list_var.first();
            while (temporal_projection_cols.NIL != cdolist_list_var) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject dist = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject cdolist_list_var_$11 = times_for_fact;
                SubLObject time_of_fact = (SubLObject)temporal_projection_cols.NIL;
                time_of_fact = cdolist_list_var_$11.first();
                if (temporal_projection_cols.NIL != cdolist_list_var_$11) {
                    final SubLObject time_elapsed = find_time_elapsed(time, time_of_fact);
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                    if (temporal_projection_cols.NIL != time_elapsed) {
                        justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, time, time_of_fact, time_elapsed), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    }
                    final SubLObject supporting_assertion = get_assertion_for_given_fact_and_time(fact, time_of_fact);
                    if (temporal_projection_cols.NIL != supporting_assertion) {
                        justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(supporting_assertion));
                    }
                    return Values.values(dist, time_elapsed, justifications);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 40129L)
    public static SubLObject handle_default_decay_function_for_predicate_backwards(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg0(fact), temporal_projection_cols.$const42$defaultDecayFunctionForPredicate_, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject times_for_fact = get_list_of_times_for_assertion(fact);
        if (temporal_projection_cols.NIL != all_assertions) {
            SubLObject cdolist_list_var = all_assertions;
            SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
            assertion = cdolist_list_var.first();
            while (temporal_projection_cols.NIL != cdolist_list_var) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject dist = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                SubLObject cdolist_list_var_$12 = times_for_fact;
                SubLObject time_of_fact = (SubLObject)temporal_projection_cols.NIL;
                time_of_fact = cdolist_list_var_$12.first();
                while (temporal_projection_cols.NIL != cdolist_list_var_$12) {
                    thread.resetMultipleValues();
                    final SubLObject result = all_points_are_after_thanP(time_of_fact, time);
                    SubLObject justifications = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (temporal_projection_cols.NIL != result) {
                        final SubLObject time_elapsed = find_time_elapsed(time, time_of_fact);
                        justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                        if (temporal_projection_cols.NIL != time_elapsed) {
                            justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, time, time_of_fact, time_elapsed), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                        }
                        final SubLObject supporting_assertion = get_assertion_for_given_fact_and_time(fact, time_of_fact);
                        if (temporal_projection_cols.NIL != supporting_assertion) {
                            justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(supporting_assertion));
                        }
                        return Values.values(dist, time_elapsed, justifications);
                    }
                    cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                    time_of_fact = cdolist_list_var_$12.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 41533L)
    public static SubLObject handle_decay_distribution_for_specs(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg0(fact), temporal_projection_cols.$const43$decayDistributionForSpecs, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject time_point_1 = get_farthest_time_for_assertion(fact, time);
        final SubLObject arg_1_entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject arg_2_entity = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = all_assertions;
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            if (cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED).numE((SubLObject)temporal_projection_cols.TWO_INTEGER) && temporal_projection_cols.NIL != isa.isa_in_any_mtP(arg_2_entity, cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED))) {
                final SubLObject time_elapsed = find_time_elapsed(time_point_1, time);
                justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                if (temporal_projection_cols.NIL != time_point_1) {
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, time_point_1, time, time_elapsed), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                }
                final SubLObject supporting_assertion = get_assertion_for_binary_predicates(fact);
                if (temporal_projection_cols.NIL != supporting_assertion) {
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(supporting_assertion));
                }
                return Values.values(cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED), time_elapsed, justifications);
            }
            if (cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED).numE((SubLObject)temporal_projection_cols.ONE_INTEGER) && temporal_projection_cols.NIL != isa.isa_in_any_mtP(arg_1_entity, cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED))) {
                final SubLObject time_elapsed = find_time_elapsed(time_point_1, time);
                justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                if (temporal_projection_cols.NIL != time_point_1) {
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, time_point_1, time, time_elapsed), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                }
                final SubLObject supporting_assertion = get_assertion_for_binary_predicates(fact);
                if (temporal_projection_cols.NIL != supporting_assertion) {
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(supporting_assertion));
                }
                return Values.values(cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED), time_elapsed, justifications);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 43606L)
    public static SubLObject handle_decay_distribution_for_specs_2(final SubLObject fact, final SubLObject time, final SubLObject time_point_1) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg0(fact), temporal_projection_cols.$const43$decayDistributionForSpecs, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject arg_1_entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject arg_2_entity = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject cdolist_list_var = all_assertions;
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            if (cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED).numE((SubLObject)temporal_projection_cols.TWO_INTEGER) && temporal_projection_cols.NIL != isa.isa_in_any_mtP(arg_2_entity, cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED))) {
                final SubLObject time_elapsed = find_time_elapsed(time_point_1, time);
                temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue(ConsesLow.append(temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread), (SubLObject)ConsesLow.list(assertion)), thread);
                temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue(ConsesLow.append(temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread), plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, time_point_1, time, time_elapsed), temporal_projection_cols.$const44$EverythingPSC)), thread);
                final SubLObject supporting_assertion = get_assertion_for_binary_predicates(fact);
                if (temporal_projection_cols.NIL != supporting_assertion) {
                    temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue(ConsesLow.append(temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread), (SubLObject)ConsesLow.list(supporting_assertion)), thread);
                }
                return Values.values(cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED), time_elapsed);
            }
            if (cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED).numE((SubLObject)temporal_projection_cols.ONE_INTEGER) && temporal_projection_cols.NIL != isa.isa_in_any_mtP(arg_1_entity, cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED))) {
                final SubLObject time_elapsed = find_time_elapsed(time_point_1, time);
                temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue(ConsesLow.append(temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread), (SubLObject)ConsesLow.list(assertion)), thread);
                temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue(ConsesLow.append(temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread), plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, time_point_1, time, time_elapsed), temporal_projection_cols.$const44$EverythingPSC)), thread);
                final SubLObject supporting_assertion = get_assertion_for_binary_predicates(fact);
                if (temporal_projection_cols.NIL != supporting_assertion) {
                    temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue(ConsesLow.append(temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread), (SubLObject)ConsesLow.list(supporting_assertion)), thread);
                }
                return Values.values(cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED), time_elapsed);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 45739L)
    public static SubLObject get_assertions_for_fact(final SubLObject fact) {
        final SubLObject a = cycl_utilities.formula_arg0(fact);
        SubLObject b = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject c = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        if (temporal_projection_cols.NIL != b && b.isList()) {
            b = narts_high.find_nart(b);
        }
        if (temporal_projection_cols.NIL != c && c.isList()) {
            c = narts_high.find_nart(c);
        }
        if (Sequences.length(fact).numE((SubLObject)temporal_projection_cols.THREE_INTEGER)) {
            return kb_mapping_utilities.pred_u_v_holds_gafs_in_any_mt(a, b, c, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 46129L)
    public static SubLObject handle_temporal_interpolation_function_for_collection(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), temporal_projection_cols.$const45$temporalInterpolationFunctionForC, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject all_times = get_list_of_times_for_assertion(fact);
            final SubLObject earlier_time = find_closest_time_before(time, all_times);
            final SubLObject later_time = find_closest_time_after(time, all_times);
            SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
            if (temporal_projection_cols.NIL != earlier_time && temporal_projection_cols.NIL != later_time) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject dist = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject time_elapsed = find_time_elapsed(earlier_time, later_time);
                justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, earlier_time, later_time, time_elapsed), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                final SubLObject supporting_assertion = get_assertion_for_given_fact_and_time(fact, earlier_time);
                final SubLObject supporting_assertion_2 = get_assertion_for_given_fact_and_time(fact, later_time);
                if (temporal_projection_cols.NIL != supporting_assertion) {
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(supporting_assertion));
                }
                if (temporal_projection_cols.NIL != supporting_assertion_2) {
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(supporting_assertion_2));
                }
                return Values.values(dist, time_elapsed, justifications);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 47689L)
    public static SubLObject find_probability_of_end_of_event(final SubLObject fact, final SubLObject time, final SubLObject depth_of_recursion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        SubLObject sum_of_prob = (SubLObject)temporal_projection_cols.NIL;
        SubLObject list_of_times = (SubLObject)temporal_projection_cols.NIL;
        final SubLObject entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt(col, temporal_projection_cols.$const46$eventTypeEndsIntervalForState, (SubLObject)temporal_projection_cols.THREE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject event_type = cycl_utilities.formula_arg1(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject role = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject arg_cons = get_arg_cons_for_pos(role, (SubLObject)temporal_projection_cols.TWO_INTEGER);
            if (temporal_projection_cols.NIL == isa.not_isaP(entity, arg_cons, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                SubLObject cdolist_list_var_$13;
                final SubLObject all_assertions_2 = cdolist_list_var_$13 = kb_mapping_utilities.pred_value_gafs_in_any_mt(event_type, temporal_projection_cols.$const47$eventTypeStartsIntervalForState, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
                SubLObject assertion_2 = (SubLObject)temporal_projection_cols.NIL;
                assertion_2 = cdolist_list_var_$13.first();
                while (temporal_projection_cols.NIL != cdolist_list_var_$13) {
                    final SubLObject gaf_2 = assertions_high.gaf_formula(assertion_2);
                    final SubLObject state = cycl_utilities.formula_arg3(gaf_2, (SubLObject)temporal_projection_cols.UNPROVIDED);
                    SubLObject cdolist_list_var_$14;
                    final SubLObject all_starting_times = cdolist_list_var_$14 = mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const48$startingPointOfRiskPeriodForAsser, (SubLObject)ConsesLow.list(temporal_projection_cols.$const15$isa, entity, state), (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
                    SubLObject binding = (SubLObject)temporal_projection_cols.NIL;
                    binding = cdolist_list_var_$14.first();
                    while (temporal_projection_cols.NIL != cdolist_list_var_$14) {
                        list_of_times = (SubLObject)ConsesLow.cons(bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, binding), list_of_times);
                        cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                        binding = cdolist_list_var_$14.first();
                    }
                    final SubLObject closest_time_before_time = find_closest_time_before(time, list_of_times);
                    if (temporal_projection_cols.NIL != closest_time_before_time) {
                        thread.resetMultipleValues();
                        final SubLObject prob = get_persistence_likelihood_for_fact_at_time((SubLObject)ConsesLow.list(temporal_projection_cols.$const15$isa, entity, state), time, (SubLObject)temporal_projection_cols.T, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.T, depth_of_recursion);
                        final SubLObject justifications_1 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (temporal_projection_cols.NIL != prob) {
                            if (temporal_projection_cols.NIL == sum_of_prob) {
                                sum_of_prob = (SubLObject)temporal_projection_cols.ZERO_INTEGER;
                            }
                            justifications = ConsesLow.append(justifications, justifications_1);
                            sum_of_prob = Numbers.add(sum_of_prob, cycl_utilities.formula_arg1(prob, (SubLObject)temporal_projection_cols.UNPROVIDED));
                        }
                    }
                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                    assertion_2 = cdolist_list_var_$13.first();
                }
            }
            if (temporal_projection_cols.NIL != sum_of_prob) {
                return Values.values(Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, sum_of_prob), justifications);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 49589L)
    public static SubLObject find_probability_of_event_occurrence(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        final SubLObject entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt(col, temporal_projection_cols.$const47$eventTypeStartsIntervalForState, (SubLObject)temporal_projection_cols.THREE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject event_type = cycl_utilities.formula_arg1(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject role = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject arg_cons = get_arg_cons_for_pos(role, (SubLObject)temporal_projection_cols.TWO_INTEGER);
            if (temporal_projection_cols.NIL == isa.not_isaP(entity, arg_cons, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                final SubLObject all_assertions_2 = kb_mapping_utilities.pred_value_gafs_in_any_mt(event_type, temporal_projection_cols.$const49$intensityFunctionForEventTypeInIn, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
                if (temporal_projection_cols.NIL != all_assertions_2) {
                    final SubLObject gaf_2 = assertions_high.gaf_formula(cycl_utilities.formula_arg0(all_assertions_2));
                    final SubLObject duration = cycl_utilities.formula_arg4(gaf_2, (SubLObject)temporal_projection_cols.UNPROVIDED);
                    final SubLObject duration_unit = cycl_utilities.formula_arg0(duration);
                    SubLObject sum_of_prob = (SubLObject)temporal_projection_cols.ZERO_INTEGER;
                    final SubLObject starting_date = get_starting_date_of_concept(entity);
                    if (temporal_projection_cols.NIL != starting_date) {
                        final SubLObject time_elapsed = find_time_elapsed(starting_date, time);
                        final SubLObject number_of_iterations = Numbers.floor(cycl_utilities.formula_arg1(convert_to_unit(time_elapsed, duration_unit), (SubLObject)temporal_projection_cols.UNPROVIDED), (SubLObject)temporal_projection_cols.UNPROVIDED);
                        justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const50$startingDate, entity, starting_date), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                        SubLObject count;
                        SubLObject age_at_time;
                        SubLObject intensity_function_at_age;
                        SubLObject prob_1;
                        SubLObject time_1;
                        SubLObject prob_2;
                        for (count = (SubLObject)temporal_projection_cols.NIL, count = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count.numL(number_of_iterations); count = Numbers.add(count, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                            age_at_time = (SubLObject)ConsesLow.list(duration_unit, Numbers.add(count, (SubLObject)temporal_projection_cols.ONE_INTEGER));
                            intensity_function_at_age = find_intensity_function_at_age(event_type, age_at_time);
                            prob_1 = calculate_probability_of_event_occurring_before_age(event_type, role, age_at_time);
                            time_1 = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const52$DateAfterFn, starting_date, age_at_time)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
                            prob_2 = get_probability_of_state_persisting_from_time(time_1, fact, time, col);
                            if (temporal_projection_cols.NIL == intensity_function_at_age) {
                                return (SubLObject)temporal_projection_cols.NIL;
                            }
                            if (temporal_projection_cols.NIL != prob_1 && temporal_projection_cols.NIL != prob_2) {
                                if (temporal_projection_cols.NIL == conses_high.member(intensity_function_at_age, justifications, Symbols.symbol_function((SubLObject)temporal_projection_cols.EQUAL), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(intensity_function_at_age));
                                }
                                sum_of_prob = Numbers.add(sum_of_prob, Numbers.multiply(prob_1, prob_2));
                            }
                        }
                        return Values.values(sum_of_prob, justifications);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 52324L)
    public static SubLObject use_risk_analysis(final SubLObject fact, final SubLObject time) {
        final SubLObject all_starting_times = mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const48$startingPointOfRiskPeriodForAsser, fact, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject list_of_times = (SubLObject)temporal_projection_cols.NIL;
        SubLObject sum_of_prob = (SubLObject)temporal_projection_cols.NIL;
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject cdolist_list_var = all_starting_times;
        SubLObject binding = (SubLObject)temporal_projection_cols.NIL;
        binding = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            list_of_times = (SubLObject)ConsesLow.cons(bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, binding), list_of_times);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        final SubLObject closest_time_before_time = find_closest_time_before(time, list_of_times);
        if (temporal_projection_cols.NIL != closest_time_before_time) {
            SubLObject cdolist_list_var2;
            final SubLObject all_assertions = cdolist_list_var2 = kb_mapping_utilities.pred_value_gafs_in_any_mt(col, temporal_projection_cols.$const47$eventTypeStartsIntervalForState, (SubLObject)temporal_projection_cols.THREE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
            SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
            assertion = cdolist_list_var2.first();
            while (temporal_projection_cols.NIL != cdolist_list_var2) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject event_type = cycl_utilities.formula_arg1(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject role = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject assertion_for_intensity_function = get_intensity_function_for_event_type(event_type, role);
                if (temporal_projection_cols.NIL != assertion_for_intensity_function) {
                    final SubLObject gaf_$15 = assertions_high.gaf_formula(assertion_for_intensity_function);
                    final SubLObject duration = get_duration_from_intensity_function(gaf_$15);
                    final SubLObject time_elapsed = find_time_elapsed(closest_time_before_time, time);
                    final SubLObject duration_unit = cycl_utilities.formula_arg0(duration);
                    final SubLObject time_elapsed_in_correct_unit = convert_to_unit(time_elapsed, duration_unit);
                    SubLObject no_of_iterations;
                    SubLObject count;
                    SubLObject current_duration;
                    SubLObject current_value;
                    SubLObject prob_1;
                    SubLObject prob_2;
                    SubLObject supporting_assertion;
                    for (no_of_iterations = Numbers.floor(bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const53$QuotientFn, time_elapsed_in_correct_unit, duration)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED))), (SubLObject)temporal_projection_cols.UNPROVIDED), count = (SubLObject)temporal_projection_cols.NIL, count = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count.numL(no_of_iterations); count = Numbers.add(count, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                        current_duration = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const54$PlusFn, duration, (SubLObject)ConsesLow.list(duration_unit, count))), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
                        current_value = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const52$DateAfterFn, closest_time_before_time, current_duration)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
                        prob_1 = get_probability_of_event_occurrence(gaf_$15, current_duration);
                        prob_2 = get_probability_of_state_persisting_from_time(current_value, fact, time, col);
                        if (temporal_projection_cols.NIL != prob_1 && temporal_projection_cols.NIL != prob_2) {
                            if (temporal_projection_cols.NIL == sum_of_prob) {
                                sum_of_prob = (SubLObject)temporal_projection_cols.ZERO_INTEGER;
                            }
                            supporting_assertion = get_assertion_for_binary_predicates((SubLObject)ConsesLow.list(temporal_projection_cols.$const48$startingPointOfRiskPeriodForAsser, fact, closest_time_before_time));
                            if (temporal_projection_cols.NIL != supporting_assertion) {
                                justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(supporting_assertion));
                            }
                            justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                            justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion_for_intensity_function));
                            sum_of_prob = Numbers.add(sum_of_prob, Numbers.multiply(prob_1, prob_2));
                        }
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                assertion = cdolist_list_var2.first();
            }
        }
        if (temporal_projection_cols.NIL != sum_of_prob) {
            return Values.values(sum_of_prob, justifications);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 55673L)
    public static SubLObject get_probability_of_event_occurrence(final SubLObject gaf, final SubLObject current_duration) {
        SubLObject duration = (SubLObject)temporal_projection_cols.NIL;
        SubLObject dist = (SubLObject)temporal_projection_cols.NIL;
        if (cycl_utilities.formula_arg0(gaf).eql(temporal_projection_cols.$const55$intensityFunctionForEventType)) {
            duration = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            dist = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
        }
        final SubLObject duration_unit = cycl_utilities.formula_arg0(duration);
        final SubLObject time_elapsed_in_correct_unit = convert_to_unit(current_duration, duration_unit);
        final SubLObject no_of_iterations = Numbers.floor(bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const53$QuotientFn, time_elapsed_in_correct_unit, duration)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED))), (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject no_of_iterations_of_no_events = Numbers.subtract(no_of_iterations, (SubLObject)temporal_projection_cols.ONE_INTEGER);
        final SubLObject prob_of_occurrence_in_one_time_unit = calculate_persistence_likelihood((SubLObject)temporal_projection_cols.NIL, dist);
        if (no_of_iterations_of_no_events.numG((SubLObject)temporal_projection_cols.ZERO_INTEGER)) {
            return Numbers.multiply(Numbers.expt(Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, prob_of_occurrence_in_one_time_unit), no_of_iterations_of_no_events), prob_of_occurrence_in_one_time_unit);
        }
        if (no_of_iterations.numE((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            return prob_of_occurrence_in_one_time_unit;
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 56818L)
    public static SubLObject calculate_probability_of_event_occurring_before_age(final SubLObject event_type, final SubLObject role, final SubLObject age) {
        SubLObject prob_of_no_events = (SubLObject)temporal_projection_cols.ONE_INTEGER;
        final SubLObject final_value_for_iteration = Numbers.subtract(cycl_utilities.formula_arg1(age, (SubLObject)temporal_projection_cols.UNPROVIDED), (SubLObject)temporal_projection_cols.ONE_INTEGER);
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(event_type, temporal_projection_cols.$const49$intensityFunctionForEventTypeInIn, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject duration = cycl_utilities.formula_arg4(cycl_utilities.formula_arg0(all_assertions), (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject duration_unit = cycl_utilities.formula_arg0(duration);
        SubLObject cdotimes_end_var;
        SubLObject count;
        SubLObject intensity_function_assertion;
        SubLObject gaf;
        SubLObject dist;
        SubLObject prob;
        for (cdotimes_end_var = Numbers.subtract(cycl_utilities.formula_arg1(age, (SubLObject)temporal_projection_cols.UNPROVIDED), (SubLObject)temporal_projection_cols.ONE_INTEGER), count = (SubLObject)temporal_projection_cols.NIL, count = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count.numL(cdotimes_end_var); count = Numbers.add(count, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            intensity_function_assertion = find_intensity_function_at_age_for_role(event_type, (SubLObject)ConsesLow.list(duration_unit, count), role);
            if (temporal_projection_cols.NIL != intensity_function_assertion) {
                gaf = assertions_high.gaf_formula(intensity_function_assertion);
                dist = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                prob = calculate_persistence_likelihood((SubLObject)temporal_projection_cols.NIL, dist);
                prob_of_no_events = Numbers.multiply(prob_of_no_events, Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, prob));
            }
        }
        intensity_function_assertion = find_intensity_function_at_age_for_role(event_type, (SubLObject)ConsesLow.list(duration_unit, final_value_for_iteration), role);
        if (temporal_projection_cols.NIL != intensity_function_assertion) {
            gaf = assertions_high.gaf_formula(intensity_function_assertion);
            dist = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            prob = calculate_persistence_likelihood((SubLObject)temporal_projection_cols.NIL, dist);
            if (temporal_projection_cols.NIL != prob) {
                return Numbers.multiply(prob_of_no_events, prob);
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 58264L)
    public static SubLObject get_probability_of_state_persisting_from_time(final SubLObject time_1, final SubLObject fact, final SubLObject time_2, final SubLObject col) {
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(col, temporal_projection_cols.$const46$eventTypeEndsIntervalForState, (SubLObject)temporal_projection_cols.THREE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject all_events = (SubLObject)temporal_projection_cols.NIL;
        SubLObject result = (SubLObject)temporal_projection_cols.ONE_INTEGER;
        SubLObject cdolist_list_var = all_assertions;
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject item_var = cycl_utilities.formula_arg1(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            if (temporal_projection_cols.NIL == conses_high.member(item_var, all_events, Symbols.symbol_function((SubLObject)temporal_projection_cols.EQUAL), Symbols.symbol_function((SubLObject)temporal_projection_cols.IDENTITY))) {
                all_events = (SubLObject)ConsesLow.cons(item_var, all_events);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        cdolist_list_var = all_events;
        SubLObject event_type = (SubLObject)temporal_projection_cols.NIL;
        event_type = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject intensity_function = get_intensity_function_for_event_2(event_type, fact);
            final SubLObject gaf2 = assertions_high.gaf_formula(intensity_function);
            final SubLObject prob = get_probability_of_event_not_occurring(gaf2, time_1, time_2);
            if (temporal_projection_cols.NIL != prob) {
                result = Numbers.multiply(result, prob);
            }
            cdolist_list_var = cdolist_list_var.rest();
            event_type = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 59183L)
    public static SubLObject get_probability_of_event_not_occurring(final SubLObject gaf, final SubLObject time_1, final SubLObject time_2) {
        SubLObject duration = (SubLObject)temporal_projection_cols.NIL;
        SubLObject dist = (SubLObject)temporal_projection_cols.NIL;
        if (cycl_utilities.formula_arg0(gaf).eql(temporal_projection_cols.$const55$intensityFunctionForEventType)) {
            duration = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            dist = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
        }
        final SubLObject duration_unit = cycl_utilities.formula_arg0(duration);
        final SubLObject time_elapsed = find_time_elapsed(time_1, time_2);
        final SubLObject time_elapsed_in_correct_unit = convert_to_unit(time_elapsed, duration_unit);
        final SubLObject no_of_iterations = Numbers.floor(bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const53$QuotientFn, time_elapsed_in_correct_unit, duration)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED))), (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject prob_of_occurrence_in_one_unit = calculate_persistence_likelihood((SubLObject)temporal_projection_cols.NIL, dist);
        if (temporal_projection_cols.NIL != prob_of_occurrence_in_one_unit && temporal_projection_cols.NIL != no_of_iterations) {
            return Numbers.expt(Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, prob_of_occurrence_in_one_unit), no_of_iterations);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 60045L)
    public static SubLObject get_duration_from_intensity_function(final SubLObject gaf) {
        final SubLObject pred = cycl_utilities.formula_arg0(gaf);
        if (pred.eql(temporal_projection_cols.$const55$intensityFunctionForEventType)) {
            return cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 60240L)
    public static SubLObject get_intensity_function_for_event_type(final SubLObject event_type, final SubLObject role) {
        SubLObject cdolist_list_var;
        final SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt(event_type, temporal_projection_cols.$const55$intensityFunctionForEventType, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject role_in_gaf = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            if (role_in_gaf.equal(role)) {
                return assertion;
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 60632L)
    public static SubLObject find_intensity_function_at_age(final SubLObject event_type, final SubLObject age) {
        SubLObject cdolist_list_var;
        final SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt(event_type, temporal_projection_cols.$const49$intensityFunctionForEventTypeInIn, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject interval = narts_high.nart_hl_formula(cycl_utilities.formula_arg5(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED));
            final SubLObject lower = cycl_utilities.formula_arg1(interval, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject upper = cycl_utilities.formula_arg2(interval, (SubLObject)temporal_projection_cols.UNPROVIDED);
            if (temporal_projection_cols.NIL == mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const56$lessThan, age, lower), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED) && temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const56$lessThan, age, upper), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                return assertion;
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 61201L)
    public static SubLObject find_intensity_function_at_age_for_role(final SubLObject event_type, final SubLObject age, final SubLObject role) {
        SubLObject cdolist_list_var;
        final SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt(event_type, temporal_projection_cols.$const49$intensityFunctionForEventTypeInIn, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject interval = narts_high.nart_hl_formula(cycl_utilities.formula_arg5(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED));
            final SubLObject role_1 = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject lower = cycl_utilities.formula_arg1(interval, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject upper = cycl_utilities.formula_arg2(interval, (SubLObject)temporal_projection_cols.UNPROVIDED);
            if (temporal_projection_cols.NIL == mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const56$lessThan, age, lower), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED) && temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const56$lessThan, age, upper), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED) && role.eql(role_1)) {
                return assertion;
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 61862L)
    public static SubLObject get_intensity_function_for_event_2(final SubLObject event_type, final SubLObject fact) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(event_type, temporal_projection_cols.$const55$intensityFunctionForEventType, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject cdolist_list_var = all_assertions;
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject role_in_gaf = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject arg_cons = get_arg_cons_for_pos(role_in_gaf, (SubLObject)temporal_projection_cols.TWO_INTEGER);
            if (temporal_projection_cols.NIL == isa.not_isaP(entity, arg_cons, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                return assertion;
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 62375L)
    public static SubLObject find_transition_probability(final SubLObject fact, final SubLObject time, final SubLObject depth_of_recursion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject result_1 = find_forward_transition_probabilities(fact, time, depth_of_recursion);
        final SubLObject justifications_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != result_1) {
            return Values.values(result_1, justifications_1);
        }
        thread.resetMultipleValues();
        final SubLObject result_2 = find_probability_of_remaining_in_state_1(fact, time, depth_of_recursion);
        final SubLObject justifications_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != result_2) {
            return Values.values(result_2, justifications_2);
        }
        thread.resetMultipleValues();
        final SubLObject result_3 = find_backward_transition_probabilities(fact, time, depth_of_recursion);
        final SubLObject justifications_3 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != result_3) {
            return Values.values(result_3, justifications_3);
        }
        thread.resetMultipleValues();
        final SubLObject result_4 = find_backward_transition_probabilities_to_self(fact, time, depth_of_recursion);
        final SubLObject justifications_4 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != result_4) {
            return Values.values(result_4, justifications_4);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 63283L)
    public static SubLObject find_backward_transition_probabilities(final SubLObject fact, final SubLObject time, final SubLObject depth_of_recursion) {
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(col, temporal_projection_cols.$const57$transitionProbabilityBetweenColle, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject sum_of_probabilities = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = all_assertions;
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject parent = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject prob = find_prob_of_backward_transition(col, parent, fact, time, gaf, depth_of_recursion);
            if (temporal_projection_cols.NIL != prob) {
                if (temporal_projection_cols.NIL == sum_of_probabilities) {
                    sum_of_probabilities = (SubLObject)temporal_projection_cols.ZERO_INTEGER;
                }
                justifications = ConsesLow.append(justifications, ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion)));
                sum_of_probabilities = Numbers.add(sum_of_probabilities, prob);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return Values.values(sum_of_probabilities, justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 64143L)
    public static SubLObject find_backward_transition_probabilities_to_self(final SubLObject fact, final SubLObject time, final SubLObject depth_of_recursion) {
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(col, temporal_projection_cols.$const57$transitionProbabilityBetweenColle, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        if (temporal_projection_cols.NIL != all_assertions) {
            final SubLObject gaf = assertions_high.gaf_formula(cycl_utilities.formula_arg0(all_assertions));
            final SubLObject prob = find_prob_of_backward_transition(col, col, fact, time, gaf, depth_of_recursion);
            if (temporal_projection_cols.NIL != prob) {
                justifications = ConsesLow.append(justifications, all_assertions);
                return Values.values(prob, justifications);
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 64740L)
    public static SubLObject find_prob_of_backward_transition(final SubLObject col, final SubLObject parent, final SubLObject fact, final SubLObject time, final SubLObject gaf, final SubLObject depth_of_recursion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject new_query = (SubLObject)ConsesLow.list(temporal_projection_cols.$const15$isa, entity, parent);
        final SubLObject interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject lower = cycl_utilities.formula_arg1(interval, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject upper = cycl_utilities.formula_arg2(interval, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject unit = cycl_utilities.formula_arg0(interval);
        final SubLObject duration = cycl_utilities.formula_arg5(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject observation_matrix = (SubLObject)temporal_projection_cols.NIL;
        final SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        final SubLObject duration_unit = cycl_utilities.formula_arg0(duration);
        SubLObject matrix = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdotimes_end_var;
        SubLObject count;
        SubLObject duration_for_query;
        SubLObject duration_for_query_in_correct_unit;
        SubLObject time_for_new_query;
        SubLObject prob_of_parent;
        SubLObject all_assertions;
        SubLObject lst_of_other_nodes;
        SubLObject cdolist_list_var;
        SubLObject assertion;
        SubLObject gaf_node;
        SubLObject state_1;
        SubLObject temp_lst;
        SubLObject cdolist_list_var_$16;
        SubLObject state_2;
        SubLObject all_assertions_$17;
        SubLObject time_elapsed;
        SubLObject time_elapsed_since_start;
        SubLObject prob;
        SubLObject all_assertions_$18;
        SubLObject observation_entry;
        SubLObject cdotimes_end_var_$19;
        SubLObject index;
        for (cdotimes_end_var = Numbers.subtract(upper, lower), count = (SubLObject)temporal_projection_cols.NIL, count = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count.numL(cdotimes_end_var); count = Numbers.add(count, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            duration_for_query = (SubLObject)ConsesLow.list(unit, Numbers.add(count, lower));
            duration_for_query_in_correct_unit = convert_to_unit(duration_for_query, duration_unit);
            time_for_new_query = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const52$DateAfterFn, time, duration_for_query_in_correct_unit)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
            prob_of_parent = get_persistence_likelihood_for_fact_at_time(new_query, time_for_new_query, (SubLObject)temporal_projection_cols.T, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.T, depth_of_recursion);
            if (temporal_projection_cols.NIL != prob_of_parent) {
                all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(parent, temporal_projection_cols.$const57$transitionProbabilityBetweenColle, (SubLObject)temporal_projection_cols.TWO_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
                lst_of_other_nodes = (SubLObject)temporal_projection_cols.NIL;
                cdolist_list_var = all_assertions;
                assertion = (SubLObject)temporal_projection_cols.NIL;
                assertion = cdolist_list_var.first();
                while (temporal_projection_cols.NIL != cdolist_list_var) {
                    gaf_node = assertions_high.gaf_formula(assertion);
                    lst_of_other_nodes = (SubLObject)ConsesLow.cons(cycl_utilities.formula_arg1(gaf_node, (SubLObject)temporal_projection_cols.UNPROVIDED), lst_of_other_nodes);
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                }
                lst_of_other_nodes = (SubLObject)ConsesLow.cons(parent, lst_of_other_nodes);
                if (Sequences.length(lst_of_other_nodes).numG((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                    cdolist_list_var = lst_of_other_nodes;
                    state_1 = (SubLObject)temporal_projection_cols.NIL;
                    state_1 = cdolist_list_var.first();
                    while (temporal_projection_cols.NIL != cdolist_list_var) {
                        temp_lst = (SubLObject)temporal_projection_cols.NIL;
                        cdolist_list_var_$16 = lst_of_other_nodes;
                        state_2 = (SubLObject)temporal_projection_cols.NIL;
                        state_2 = cdolist_list_var_$16.first();
                        while (temporal_projection_cols.NIL != cdolist_list_var_$16) {
                            if (state_1.equal(state_2)) {
                                all_assertions_$17 = kb_mapping_utilities.pred_value_gafs_in_any_mt(state_1, temporal_projection_cols.$const57$transitionProbabilityBetweenColle, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
                                time_elapsed = duration_for_query_in_correct_unit;
                                time_elapsed_since_start = reader.bq_cons(duration_unit, (SubLObject)temporal_projection_cols.$list58);
                                prob = calculate_probability_of_remaining_in_state(time_elapsed, all_assertions_$17, duration, time_elapsed_since_start);
                                if (temporal_projection_cols.NIL != prob) {
                                    temp_lst = (SubLObject)ConsesLow.cons(prob, temp_lst);
                                }
                                else {
                                    temp_lst = (SubLObject)ConsesLow.cons((SubLObject)temporal_projection_cols.ZERO_INTEGER, temp_lst);
                                }
                            }
                            else {
                                all_assertions_$18 = get_assertions_for_transition_from_state_to_state(state_1, state_2);
                                time_elapsed = duration_for_query_in_correct_unit;
                                time_elapsed_since_start = reader.bq_cons(duration_unit, (SubLObject)temporal_projection_cols.$list58);
                                prob = calculate_probability_of_transition_to_state(time_elapsed, all_assertions_$18, duration, time_elapsed_since_start);
                                if (temporal_projection_cols.NIL != prob) {
                                    temp_lst = (SubLObject)ConsesLow.cons(prob, temp_lst);
                                }
                                else {
                                    temp_lst = (SubLObject)ConsesLow.cons((SubLObject)temporal_projection_cols.ZERO_INTEGER, temp_lst);
                                }
                            }
                            cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                            state_2 = cdolist_list_var_$16.first();
                        }
                        matrix = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(state_1, Sequences.reverse(temp_lst)), matrix);
                        observation_entry = (SubLObject)temporal_projection_cols.NIL;
                        for (cdotimes_end_var_$19 = Numbers.subtract(Sequences.length(lst_of_other_nodes), (SubLObject)temporal_projection_cols.ONE_INTEGER), index = (SubLObject)temporal_projection_cols.NIL, index = (SubLObject)temporal_projection_cols.ZERO_INTEGER; index.numL(cdotimes_end_var_$19); index = Numbers.add(index, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                            observation_entry = (SubLObject)ConsesLow.cons((SubLObject)temporal_projection_cols.ZERO_INTEGER, observation_entry);
                        }
                        if (state_1.equal(parent)) {
                            observation_entry = (SubLObject)ConsesLow.cons(cycl_utilities.formula_arg1(prob_of_parent, (SubLObject)temporal_projection_cols.UNPROVIDED), observation_entry);
                        }
                        else {
                            observation_entry = (SubLObject)ConsesLow.cons((SubLObject)temporal_projection_cols.ZERO_INTEGER, observation_entry);
                        }
                        observation_matrix = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(state_1, observation_entry), observation_matrix);
                        cdolist_list_var = cdolist_list_var.rest();
                        state_1 = cdolist_list_var.first();
                    }
                    return Values.values(find_probability_for_state(col, Sequences.reverse(matrix), Sequences.reverse(observation_matrix), lst_of_other_nodes), justifications);
                }
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 69087L)
    public static SubLObject find_probability_for_state(final SubLObject col, final SubLObject transition_matrix, final SubLObject observation_matrix, final SubLObject lst_of_nodes) {
        SubLObject reverse_product_of_transition_and_observation = (SubLObject)temporal_projection_cols.NIL;
        SubLObject product_of_transition_and_observation = (SubLObject)temporal_projection_cols.NIL;
        SubLObject reverse_product_from_b_matrix = (SubLObject)temporal_projection_cols.NIL;
        SubLObject sum_of_b_matrix = (SubLObject)temporal_projection_cols.ZERO_INTEGER;
        SubLObject product_from_b_matrix = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdotimes_end_var;
        SubLObject count_1;
        SubLObject entry_of_prodoct_of_transition_and_observation;
        SubLObject cdotimes_end_var_$20;
        SubLObject count_2;
        SubLObject temp_sum;
        SubLObject cdotimes_end_var_$21;
        SubLObject count_3;
        for (cdotimes_end_var = Sequences.length(lst_of_nodes), count_1 = (SubLObject)temporal_projection_cols.NIL, count_1 = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count_1.numL(cdotimes_end_var); count_1 = Numbers.add(count_1, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            entry_of_prodoct_of_transition_and_observation = (SubLObject)temporal_projection_cols.NIL;
            for (cdotimes_end_var_$20 = Sequences.length(lst_of_nodes), count_2 = (SubLObject)temporal_projection_cols.NIL, count_2 = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count_2.numL(cdotimes_end_var_$20); count_2 = Numbers.add(count_2, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                temp_sum = (SubLObject)temporal_projection_cols.ZERO_INTEGER;
                for (cdotimes_end_var_$21 = Sequences.length(lst_of_nodes), count_3 = (SubLObject)temporal_projection_cols.NIL, count_3 = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count_3.numL(cdotimes_end_var_$21); count_3 = Numbers.add(count_3, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                    temp_sum = Numbers.add(temp_sum, Numbers.multiply(get_array_element(transition_matrix, count_1, count_3), get_array_element(observation_matrix, count_3, count_2)));
                }
                entry_of_prodoct_of_transition_and_observation = (SubLObject)ConsesLow.cons(temp_sum, entry_of_prodoct_of_transition_and_observation);
            }
            reverse_product_of_transition_and_observation = (SubLObject)ConsesLow.cons(Sequences.reverse(entry_of_prodoct_of_transition_and_observation), reverse_product_of_transition_and_observation);
        }
        product_of_transition_and_observation = Sequences.reverse(reverse_product_of_transition_and_observation);
        SubLObject entry_of_product_from_b_matrix;
        SubLObject count_4;
        SubLObject temp_sum2;
        SubLObject cdotimes_end_var_$22;
        SubLObject count_5;
        for (cdotimes_end_var = Sequences.length(lst_of_nodes), count_1 = (SubLObject)temporal_projection_cols.NIL, count_1 = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count_1.numL(cdotimes_end_var); count_1 = Numbers.add(count_1, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            entry_of_product_from_b_matrix = (SubLObject)temporal_projection_cols.NIL;
            for (count_4 = (SubLObject)temporal_projection_cols.NIL, count_4 = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count_4.numL((SubLObject)temporal_projection_cols.ONE_INTEGER); count_4 = Numbers.add(count_4, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                temp_sum2 = (SubLObject)temporal_projection_cols.ZERO_INTEGER;
                for (cdotimes_end_var_$22 = Sequences.length(lst_of_nodes), count_5 = (SubLObject)temporal_projection_cols.NIL, count_5 = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count_5.numL(cdotimes_end_var_$22); count_5 = Numbers.add(count_5, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                    temp_sum2 = Numbers.add(temp_sum2, Numbers.multiply(ConsesLow.nth(count_5, ConsesLow.nth(count_1, product_of_transition_and_observation)), (SubLObject)temporal_projection_cols.ONE_INTEGER));
                }
                entry_of_product_from_b_matrix = (SubLObject)ConsesLow.cons(temp_sum2, entry_of_product_from_b_matrix);
            }
            reverse_product_from_b_matrix = (SubLObject)ConsesLow.cons(Sequences.reverse(entry_of_product_from_b_matrix), reverse_product_from_b_matrix);
        }
        SubLObject cdolist_list_var;
        product_from_b_matrix = (cdolist_list_var = Sequences.reverse(reverse_product_from_b_matrix));
        SubLObject entry = (SubLObject)temporal_projection_cols.NIL;
        entry = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            sum_of_b_matrix = Numbers.add(sum_of_b_matrix, cycl_utilities.formula_arg0(entry));
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        if (sum_of_b_matrix.numG((SubLObject)temporal_projection_cols.ZERO_INTEGER)) {
            final SubLObject pos = Sequences.position(col, lst_of_nodes, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
            entry = ConsesLow.nth(pos, product_from_b_matrix);
            return Numbers.divide(cycl_utilities.formula_arg0(entry), sum_of_b_matrix);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 71338L)
    public static SubLObject get_array_element(final SubLObject lst, final SubLObject count_1, final SubLObject count_2) {
        final SubLObject entry = cycl_utilities.formula_arg1(ConsesLow.nth(count_1, lst), (SubLObject)temporal_projection_cols.UNPROVIDED);
        return ConsesLow.nth(count_2, entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 71487L)
    public static SubLObject get_assertions_for_transition_from_state_to_state(final SubLObject state_1, final SubLObject state_2) {
        SubLObject results = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt(state_1, temporal_projection_cols.$const57$transitionProbabilityBetweenColle, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            if (state_2.equal(cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED))) {
                results = (SubLObject)ConsesLow.cons(assertion, results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 71919L)
    public static SubLObject find_probability_of_remaining_in_state_1(final SubLObject fact, final SubLObject time, final SubLObject depth_of_recursion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        final SubLObject entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(col, temporal_projection_cols.$const57$transitionProbabilityBetweenColle, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject sum_of_probabilities = (SubLObject)temporal_projection_cols.NIL;
        if (temporal_projection_cols.NIL != all_assertions) {
            SubLObject cdolist_list_var = all_assertions;
            SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
            assertion = cdolist_list_var.first();
            while (temporal_projection_cols.NIL != cdolist_list_var) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject previous_col = cycl_utilities.formula_arg1(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject lower = cycl_utilities.formula_arg1(interval, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject upper = cycl_utilities.formula_arg2(interval, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject unit = cycl_utilities.formula_arg0(interval);
                final SubLObject duration = cycl_utilities.formula_arg5(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject duration_unit = cycl_utilities.formula_arg0(duration);
                final SubLObject pred = cycl_utilities.formula_arg6(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject new_query = (SubLObject)ConsesLow.list(temporal_projection_cols.$const15$isa, entity, previous_col);
                if (pred.eql(temporal_projection_cols.$const59$startingPointForAssertion)) {
                    SubLObject cdotimes_end_var;
                    SubLObject count;
                    SubLObject duration_for_query;
                    SubLObject duration_for_query_in_correct_unit;
                    SubLObject query_result;
                    SubLObject diff;
                    SubLObject starting_time;
                    SubLObject time_elapsed_since_start;
                    SubLObject time_elapsed;
                    SubLObject time_elapsed_in_next_unit;
                    SubLObject prob_1;
                    SubLObject persis_prob;
                    SubLObject justifications_1;
                    SubLObject prob_2;
                    for (cdotimes_end_var = Numbers.subtract(upper, lower), count = (SubLObject)temporal_projection_cols.NIL, count = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count.numL(cdotimes_end_var); count = Numbers.add(count, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                        duration_for_query = (SubLObject)ConsesLow.list(unit, Numbers.add(count, lower));
                        duration_for_query_in_correct_unit = convert_to_unit(duration_for_query, duration_unit);
                        query_result = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const60$DateBeforeFn, time, duration_for_query)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
                        diff = cycl_utilities.formula_arg1(bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const61$DifferenceFn, duration_for_query_in_correct_unit, duration)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED))), (SubLObject)temporal_projection_cols.UNPROVIDED);
                        if (diff.numE((SubLObject)temporal_projection_cols.ZERO_INTEGER)) {
                            starting_time = get_farthest_time_for_assertion(new_query, time);
                            if (temporal_projection_cols.NIL != starting_time && temporal_projection_cols.NIL == mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, starting_time, query_result), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                                time_elapsed_since_start = find_time_elapsed(starting_time, starting_time);
                                time_elapsed = find_time_elapsed(starting_time, query_result);
                                time_elapsed_in_next_unit = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const54$PlusFn, time_elapsed, duration_for_query_in_correct_unit)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
                                prob_1 = calculate_probability_of_remaining_in_state(time_elapsed_in_next_unit, all_assertions, duration, time_elapsed_since_start);
                                if (temporal_projection_cols.NIL != prob_1) {
                                    thread.resetMultipleValues();
                                    persis_prob = get_persistence_likelihood_for_fact_at_time(new_query, query_result, (SubLObject)temporal_projection_cols.T, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.T, depth_of_recursion);
                                    justifications_1 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (temporal_projection_cols.NIL != persis_prob) {
                                        prob_2 = cycl_utilities.formula_arg1(persis_prob, (SubLObject)temporal_projection_cols.UNPROVIDED);
                                        if (temporal_projection_cols.NIL != prob_1 && temporal_projection_cols.NIL != prob_2) {
                                            if (temporal_projection_cols.NIL == sum_of_probabilities) {
                                                sum_of_probabilities = (SubLObject)temporal_projection_cols.ZERO_INTEGER;
                                            }
                                            justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                                            justifications = ConsesLow.append(justifications, justifications_1);
                                            sum_of_probabilities = Numbers.add(sum_of_probabilities, Numbers.multiply(prob_1, prob_2));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        if (temporal_projection_cols.NIL != sum_of_probabilities) {
            return Values.values(sum_of_probabilities, justifications);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 76006L)
    public static SubLObject find_probability_of_remaining_in_state_2(final SubLObject fact, final SubLObject time, final SubLObject depth_of_recursion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        final SubLObject entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(col, temporal_projection_cols.$const57$transitionProbabilityBetweenColle, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject sum_of_probabilities = (SubLObject)temporal_projection_cols.NIL;
        if (temporal_projection_cols.NIL != all_assertions) {
            SubLObject cdolist_list_var = all_assertions;
            SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
            assertion = cdolist_list_var.first();
            while (temporal_projection_cols.NIL != cdolist_list_var) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject previous_col = cycl_utilities.formula_arg1(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject lower = cycl_utilities.formula_arg1(interval, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject upper = cycl_utilities.formula_arg2(interval, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject unit = cycl_utilities.formula_arg0(interval);
                final SubLObject duration = cycl_utilities.formula_arg5(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject duration_unit = cycl_utilities.formula_arg0(duration);
                final SubLObject pred = cycl_utilities.formula_arg6(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject new_query = (SubLObject)ConsesLow.list(temporal_projection_cols.$const15$isa, entity, previous_col);
                if (pred.eql(temporal_projection_cols.$const59$startingPointForAssertion)) {
                    SubLObject cdotimes_end_var;
                    SubLObject count;
                    SubLObject duration_for_query;
                    SubLObject duration_for_query_in_correct_unit;
                    SubLObject query_result;
                    SubLObject diff;
                    SubLObject starting_time;
                    SubLObject time_elapsed_since_start;
                    SubLObject time_elapsed;
                    SubLObject time_elapsed_in_next_unit;
                    SubLObject prob_1;
                    SubLObject persis_prob;
                    SubLObject justifications_1;
                    SubLObject prob_2;
                    for (cdotimes_end_var = Numbers.subtract(upper, lower), count = (SubLObject)temporal_projection_cols.NIL, count = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count.numL(cdotimes_end_var); count = Numbers.add(count, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                        duration_for_query = (SubLObject)ConsesLow.list(unit, Numbers.add(count, lower));
                        duration_for_query_in_correct_unit = convert_to_unit(duration_for_query, duration_unit);
                        query_result = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const52$DateAfterFn, time, duration_for_query)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
                        diff = cycl_utilities.formula_arg1(bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const61$DifferenceFn, duration_for_query_in_correct_unit, duration)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED))), (SubLObject)temporal_projection_cols.UNPROVIDED);
                        PrintLow.format((SubLObject)temporal_projection_cols.T, (SubLObject)temporal_projection_cols.$str63$___query_result___a_diff__a_, query_result, diff);
                        if (diff.numE((SubLObject)temporal_projection_cols.ZERO_INTEGER)) {
                            starting_time = get_farthest_time_for_assertion(new_query, time);
                            if (temporal_projection_cols.NIL != starting_time) {
                                PrintLow.format((SubLObject)temporal_projection_cols.T, (SubLObject)temporal_projection_cols.$str64$____a__a_, starting_time, query_result);
                                if (temporal_projection_cols.NIL == mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, starting_time, query_result), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                                    time_elapsed_since_start = find_time_elapsed(starting_time, starting_time);
                                    time_elapsed = find_time_elapsed(starting_time, query_result);
                                    time_elapsed_in_next_unit = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const54$PlusFn, time_elapsed, duration_for_query_in_correct_unit)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
                                    prob_1 = calculate_probability_of_remaining_in_state(time_elapsed_in_next_unit, all_assertions, duration, time_elapsed_since_start);
                                    if (temporal_projection_cols.NIL != prob_1) {
                                        thread.resetMultipleValues();
                                        persis_prob = get_persistence_likelihood_for_fact_at_time(new_query, query_result, (SubLObject)temporal_projection_cols.T, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.T, depth_of_recursion);
                                        justifications_1 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (temporal_projection_cols.NIL != persis_prob) {
                                            prob_2 = cycl_utilities.formula_arg1(persis_prob, (SubLObject)temporal_projection_cols.UNPROVIDED);
                                            if (temporal_projection_cols.NIL != prob_1 && temporal_projection_cols.NIL != prob_2) {
                                                if (temporal_projection_cols.NIL == sum_of_probabilities) {
                                                    sum_of_probabilities = (SubLObject)temporal_projection_cols.ZERO_INTEGER;
                                                }
                                                justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                                                justifications = ConsesLow.append(justifications, justifications_1);
                                                sum_of_probabilities = Numbers.add(sum_of_probabilities, Numbers.multiply(prob_1, prob_2));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        if (temporal_projection_cols.NIL != sum_of_probabilities) {
            return Values.values(sum_of_probabilities, justifications);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 80079L)
    public static SubLObject find_forward_transition_probabilities(final SubLObject fact, final SubLObject time, final SubLObject depth_of_recursion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        SubLObject done_lst = (SubLObject)temporal_projection_cols.NIL;
        final SubLObject entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject list_of_times = cdolist_list_var = get_list_of_times_for_assertion(fact);
        SubLObject time_1 = (SubLObject)temporal_projection_cols.NIL;
        time_1 = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, time_1, time), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                return (SubLObject)temporal_projection_cols.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            time_1 = cdolist_list_var.first();
        }
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(col, temporal_projection_cols.$const57$transitionProbabilityBetweenColle, (SubLObject)temporal_projection_cols.TWO_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        if (temporal_projection_cols.NIL != all_assertions) {
            SubLObject sum_of_probabilities = (SubLObject)temporal_projection_cols.NIL;
            SubLObject cdolist_list_var2 = all_assertions;
            SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
            assertion = cdolist_list_var2.first();
            while (temporal_projection_cols.NIL != cdolist_list_var2) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject previous_col = cycl_utilities.formula_arg1(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject lower = cycl_utilities.formula_arg1(interval, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject upper = cycl_utilities.formula_arg2(interval, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject unit = cycl_utilities.formula_arg0(interval);
                final SubLObject duration = cycl_utilities.formula_arg5(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject duration_unit = cycl_utilities.formula_arg0(duration);
                final SubLObject pred = cycl_utilities.formula_arg6(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject new_query = (SubLObject)ConsesLow.list(temporal_projection_cols.$const15$isa, entity, previous_col);
                if (temporal_projection_cols.NIL == conses_high.member(previous_col, done_lst, Symbols.symbol_function((SubLObject)temporal_projection_cols.EQUAL), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    done_lst = (SubLObject)ConsesLow.cons(previous_col, done_lst);
                    if (pred.eql(temporal_projection_cols.$const59$startingPointForAssertion)) {
                        SubLObject cdotimes_end_var;
                        SubLObject count;
                        SubLObject duration_for_query;
                        SubLObject duration_for_query_in_correct_unit;
                        SubLObject query_result;
                        SubLObject diff;
                        SubLObject time_elapsed_since_start;
                        SubLObject time_elapsed;
                        SubLObject prob_1;
                        SubLObject persis_prob;
                        SubLObject justifications_1;
                        SubLObject prob_2;
                        for (cdotimes_end_var = Numbers.subtract(upper, lower), count = (SubLObject)temporal_projection_cols.NIL, count = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count.numL(cdotimes_end_var); count = Numbers.add(count, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                            duration_for_query = (SubLObject)ConsesLow.list(unit, Numbers.add(count, lower));
                            duration_for_query_in_correct_unit = convert_to_unit(duration_for_query, duration_unit);
                            query_result = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const60$DateBeforeFn, time, duration_for_query)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
                            diff = cycl_utilities.formula_arg1(bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const61$DifferenceFn, duration_for_query_in_correct_unit, duration)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED))), (SubLObject)temporal_projection_cols.UNPROVIDED);
                            if (!diff.numL(Numbers.subtract(lower, (SubLObject)temporal_projection_cols.ONE_INTEGER)) && diff.numL(upper)) {
                                time_elapsed_since_start = find_time_elapsed(query_result, query_result);
                                time_elapsed = duration_for_query_in_correct_unit;
                                prob_1 = calculate_probability_of_transition_to_state(time_elapsed, all_assertions, duration, time_elapsed_since_start);
                                if (temporal_projection_cols.NIL != prob_1) {
                                    thread.resetMultipleValues();
                                    persis_prob = get_persistence_likelihood_for_fact_at_time(new_query, query_result, (SubLObject)temporal_projection_cols.T, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.T, depth_of_recursion);
                                    justifications_1 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (temporal_projection_cols.NIL != persis_prob) {
                                        prob_2 = cycl_utilities.formula_arg1(persis_prob, (SubLObject)temporal_projection_cols.UNPROVIDED);
                                        if (temporal_projection_cols.NIL == sum_of_probabilities) {
                                            sum_of_probabilities = (SubLObject)temporal_projection_cols.ZERO_INTEGER;
                                        }
                                        justifications = ConsesLow.append(justifications, justifications_1);
                                        justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                                        sum_of_probabilities = Numbers.add(sum_of_probabilities, Numbers.multiply(prob_1, prob_2));
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                assertion = cdolist_list_var2.first();
            }
            if (temporal_projection_cols.NIL != sum_of_probabilities) {
                return Values.values(sum_of_probabilities, justifications);
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 84142L)
    public static SubLObject check_cardinality_of_collection(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), temporal_projection_cols.$const65$maximumCardinalityOfCollection, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject number_of_instances = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject result = check_number_of_instances(fact, number_of_instances, time);
            final SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection_cols.NIL != result) {
                return Values.values(result, ConsesLow.append((SubLObject)ConsesLow.list(assertion), justifications));
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 84839L)
    public static SubLObject check_number_of_instances(final SubLObject fact, final SubLObject number_of_instances, final SubLObject time) {
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        SubLObject instances_satisfying_cons = (SubLObject)temporal_projection_cols.NIL;
        final SubLObject entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject all_bindings = cdolist_list_var = mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const66$decayDistributionForAssertionInIn, (SubLObject)ConsesLow.list(temporal_projection_cols.$const15$isa, (SubLObject)temporal_projection_cols.$sym28$_X, col), (SubLObject)temporal_projection_cols.$list67), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject binding = (SubLObject)temporal_projection_cols.NIL;
        binding = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject person = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, binding);
            final SubLObject date = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym68$_DATE, binding);
            final SubLObject interval = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym69$_INTERVAL, binding);
            if (!person.equal(entity) && temporal_projection_cols.NIL == mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, date, time), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED) && temporal_projection_cols.NIL != time_falls_in_interval(date, time, interval, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                final SubLObject supporting_assertion = get_assertion_for_predicate_of_arity_four(temporal_projection_cols.$const66$decayDistributionForAssertionInIn, (SubLObject)ConsesLow.list(temporal_projection_cols.$const15$isa, person, col), date, interval, (SubLObject)temporal_projection_cols.$list70);
                if (temporal_projection_cols.NIL != supporting_assertion) {
                    justifications = ConsesLow.append((SubLObject)ConsesLow.list(supporting_assertion), justifications);
                }
                instances_satisfying_cons = (SubLObject)ConsesLow.cons(person, instances_satisfying_cons);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        if (!Sequences.length(instances_satisfying_cons).numL(number_of_instances)) {
            return Values.values((SubLObject)temporal_projection_cols.T, justifications);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 86244L)
    public static SubLObject use_event_calculus_to_find_likelihood(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject time_line = create_timeline_for_assertion(fact);
        thread.resetMultipleValues();
        final SubLObject dist = check_boundary_conditions(fact, time, time_line);
        final SubLObject tm = thread.secondMultipleValue();
        SubLObject justifications = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != dist) {
            return Values.values(dist, tm, justifications);
        }
        thread.resetMultipleValues();
        final SubLObject time_1 = find_closest_time_around_time_point(time, time_line);
        final SubLObject time_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL == time_1) {
            if (cycl_utilities.formula_arg1(time_2, (SubLObject)temporal_projection_cols.UNPROVIDED).eql((SubLObject)temporal_projection_cols.$sym8$E)) {
                thread.resetMultipleValues();
                final SubLObject dist2 = handle_decay_distribution_for_specs(fact, time);
                SubLObject tm2 = thread.secondMultipleValue();
                SubLObject justifications2 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection_cols.NIL == tm2) {
                    tm2 = find_time_elapsed(cycl_utilities.formula_arg0(time_2), time);
                    justifications2 = ConsesLow.append(justifications2, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const2$endingPointOfIntervalForSentence, fact, cycl_utilities.formula_arg0(time_2)), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    justifications2 = ConsesLow.append(justifications2, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, cycl_utilities.formula_arg0(time_2), time, tm2), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                }
                return Values.values(dist2, tm2, justifications2);
            }
            if (cycl_utilities.formula_arg1(time_2, (SubLObject)temporal_projection_cols.UNPROVIDED).eql((SubLObject)temporal_projection_cols.$sym9$S)) {
                justifications = (SubLObject)temporal_projection_cols.NIL;
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const1$startingPointOfIntervalForSentenc, fact, cycl_utilities.formula_arg0(time_1)), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                return Values.values(narts_high.find_nart(temporal_projection_cols.$uniform_distribution_with_value_zero$.getDynamicValue(thread)), (SubLObject)temporal_projection_cols.NIL, justifications);
            }
        }
        if (temporal_projection_cols.NIL != time_1 && temporal_projection_cols.NIL != time_2) {
            if (cycl_utilities.formula_arg1(time_1, (SubLObject)temporal_projection_cols.UNPROVIDED).eql((SubLObject)temporal_projection_cols.$sym9$S) && cycl_utilities.formula_arg1(time_2, (SubLObject)temporal_projection_cols.UNPROVIDED).eql((SubLObject)temporal_projection_cols.$sym8$E)) {
                justifications = (SubLObject)temporal_projection_cols.NIL;
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const2$endingPointOfIntervalForSentence, fact, cycl_utilities.formula_arg0(time_2)), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const1$startingPointOfIntervalForSentenc, fact, cycl_utilities.formula_arg0(time_1)), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                return Values.values(narts_high.find_nart(temporal_projection_cols.$uniform_distribution_with_value_one$.getDynamicValue(thread)), (SubLObject)temporal_projection_cols.NIL, justifications);
            }
            if (cycl_utilities.formula_arg1(time_1, (SubLObject)temporal_projection_cols.UNPROVIDED).eql((SubLObject)temporal_projection_cols.$sym8$E) && cycl_utilities.formula_arg1(time_2, (SubLObject)temporal_projection_cols.UNPROVIDED).eql((SubLObject)temporal_projection_cols.$sym9$S)) {
                justifications = (SubLObject)temporal_projection_cols.NIL;
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const2$endingPointOfIntervalForSentence, fact, cycl_utilities.formula_arg0(time_1)), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const1$startingPointOfIntervalForSentenc, fact, cycl_utilities.formula_arg0(time_2)), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                return Values.values(narts_high.find_nart(temporal_projection_cols.$uniform_distribution_with_value_zero$.getDynamicValue(thread)), (SubLObject)temporal_projection_cols.NIL, justifications);
            }
        }
        if (temporal_projection_cols.NIL == time_2) {
            if (cycl_utilities.formula_arg1(time_1, (SubLObject)temporal_projection_cols.UNPROVIDED).eql((SubLObject)temporal_projection_cols.$sym8$E)) {
                justifications = (SubLObject)temporal_projection_cols.NIL;
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const2$endingPointOfIntervalForSentence, fact, cycl_utilities.formula_arg0(time_1)), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                return Values.values(narts_high.find_nart(temporal_projection_cols.$uniform_distribution_with_value_zero$.getDynamicValue(thread)), (SubLObject)temporal_projection_cols.NIL, justifications);
            }
            if (cycl_utilities.formula_arg1(time_1, (SubLObject)temporal_projection_cols.UNPROVIDED).eql((SubLObject)temporal_projection_cols.$sym9$S)) {
                justifications = (SubLObject)temporal_projection_cols.NIL;
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const1$startingPointOfIntervalForSentenc, fact, cycl_utilities.formula_arg0(time_2)), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                return Values.values(narts_high.find_nart(temporal_projection_cols.$uniform_distribution_with_value_one$.getDynamicValue(thread)), (SubLObject)temporal_projection_cols.NIL, justifications);
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 89867L)
    public static SubLObject use_conditional_likelihood(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), temporal_projection_cols.$const71$conditionalProbabilityForCollecti, (SubLObject)temporal_projection_cols.TWO_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject all_assertions_2 = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), temporal_projection_cols.$const72$conditionalProbabilityForCollecti, (SubLObject)temporal_projection_cols.TWO_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = all_assertions;
        SubLObject assertion_1 = (SubLObject)temporal_projection_cols.NIL;
        assertion_1 = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$23 = all_assertions_2;
            SubLObject assertion_2 = (SubLObject)temporal_projection_cols.NIL;
            assertion_2 = cdolist_list_var_$23.first();
            while (temporal_projection_cols.NIL != cdolist_list_var_$23) {
                final SubLObject gaf_1 = assertions_high.gaf_formula(assertion_1);
                final SubLObject new_query = (SubLObject)ConsesLow.list(temporal_projection_cols.$const15$isa, cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg1(gaf_1, (SubLObject)temporal_projection_cols.UNPROVIDED));
                final SubLObject gaf_2 = assertions_high.gaf_formula(assertion_2);
                thread.resetMultipleValues();
                final SubLObject prob = get_persistence_likelihood_for_fact_at_time(new_query, time, (SubLObject)temporal_projection_cols.T, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.T, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject justification_1 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection_cols.NIL != prob) {
                    final SubLObject prob_1 = cycl_utilities.formula_arg1(prob, (SubLObject)temporal_projection_cols.UNPROVIDED);
                    final SubLObject prob_2 = cycl_utilities.formula_arg3(gaf_1, (SubLObject)temporal_projection_cols.UNPROVIDED);
                    final SubLObject prob_3 = cycl_utilities.formula_arg3(gaf_2, (SubLObject)temporal_projection_cols.UNPROVIDED);
                    if (prob_1.numE((SubLObject)temporal_projection_cols.ZERO_INTEGER) || prob_1.numE((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                        justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion_1));
                        justifications = ConsesLow.append(justifications, justification_1);
                        return Values.values(Numbers.multiply(prob_1, prob_2), justifications);
                    }
                    if (temporal_projection_cols.NIL != prob_1 && temporal_projection_cols.NIL != prob_2 && temporal_projection_cols.NIL != prob_3) {
                        justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion_1));
                        justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion_2));
                        justifications = ConsesLow.append(justifications, justification_1);
                        return Values.values(Numbers.add(Numbers.multiply(prob_1, prob_2), Numbers.multiply(Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, prob_1), prob_3)), justifications);
                    }
                }
                cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                assertion_2 = cdolist_list_var_$23.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion_1 = cdolist_list_var.first();
        }
        final SubLObject all_assertions_3 = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), temporal_projection_cols.$const72$conditionalProbabilityForCollecti, (SubLObject)temporal_projection_cols.TWO_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject justifications2 = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var2 = all_assertions_3;
        SubLObject assertion_3 = (SubLObject)temporal_projection_cols.NIL;
        assertion_3 = cdolist_list_var2.first();
        while (temporal_projection_cols.NIL != cdolist_list_var2) {
            final SubLObject gaf_3 = assertions_high.gaf_formula(assertion_3);
            final SubLObject new_query2 = (SubLObject)ConsesLow.list(temporal_projection_cols.$const15$isa, cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg1(gaf_3, (SubLObject)temporal_projection_cols.UNPROVIDED));
            thread.resetMultipleValues();
            final SubLObject prob2 = get_persistence_likelihood_for_fact_at_time(new_query2, time, (SubLObject)temporal_projection_cols.T, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.T, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject justification_2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection_cols.NIL != prob2) {
                final SubLObject prob_4 = Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, cycl_utilities.formula_arg1(prob2, (SubLObject)temporal_projection_cols.UNPROVIDED));
                final SubLObject prob_5 = cycl_utilities.formula_arg3(gaf_3, (SubLObject)temporal_projection_cols.UNPROVIDED);
                if (prob_4.numE((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                    justifications2 = ConsesLow.append(justifications2, (SubLObject)ConsesLow.list(assertion_3));
                    justifications2 = ConsesLow.append(justifications2, justification_2);
                    return Values.values(Numbers.multiply(prob_4, prob_5), justifications2);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            assertion_3 = cdolist_list_var2.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 92528L)
    public static SubLObject handle_delay_between_collections(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), temporal_projection_cols.$const73$delayBetweenCollections, (SubLObject)temporal_projection_cols.TWO_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject results = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = all_assertions;
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject new_query = (SubLObject)ConsesLow.list(temporal_projection_cols.$const15$isa, cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg1(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED));
            final SubLObject starting_time_for_assertions = mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const59$startingPointForAssertion, new_query, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject dist = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            SubLObject cdolist_list_var_$24 = starting_time_for_assertions;
            SubLObject starting_time = (SubLObject)temporal_projection_cols.NIL;
            starting_time = cdolist_list_var_$24.first();
            while (temporal_projection_cols.NIL != cdolist_list_var_$24) {
                final SubLObject starting_time_for_assertion = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, starting_time);
                if (temporal_projection_cols.NIL != time_falls_in_interval(starting_time_for_assertion, time, interval, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    final SubLObject time_elapsed = find_time_elapsed(time, starting_time_for_assertion);
                    temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue(ConsesLow.append(temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread), (SubLObject)ConsesLow.list(assertion)), thread);
                    temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue(ConsesLow.append(temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread), plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const59$startingPointForAssertion, new_query, starting_time_for_assertion), temporal_projection_cols.$const44$EverythingPSC)), thread);
                    temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue(ConsesLow.append(temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread), plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, time, starting_time_for_assertion, time_elapsed), temporal_projection_cols.$const44$EverythingPSC)), thread);
                    results = (SubLObject)ConsesLow.cons(calculate_persistence_likelihood(time_elapsed, dist), results);
                }
                cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                starting_time = cdolist_list_var_$24.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        if (temporal_projection_cols.NIL != results) {
            return Sequences.creduce(Symbols.symbol_function((SubLObject)temporal_projection_cols.$sym74$MAX), results, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 94174L)
    public static SubLObject handle_default_decay_distribution_for_collection_in_interval(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), temporal_projection_cols.$const75$defaultDecayFunctionForCollection, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = all_assertions;
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject interval = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject dist = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            SubLObject cdolist_list_var_$25;
            final SubLObject list_of_times = cdolist_list_var_$25 = get_list_of_times_for_assertion(fact);
            SubLObject time_of_assertion = (SubLObject)temporal_projection_cols.NIL;
            time_of_assertion = cdolist_list_var_$25.first();
            while (temporal_projection_cols.NIL != cdolist_list_var_$25) {
                SubLObject time_of_fact = get_last_time_point_of(time_of_assertion);
                if (temporal_projection_cols.NIL != time_falls_in_interval(time_of_fact, time, interval, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    final SubLObject time_elapsed = find_time_elapsed(time, time_of_fact);
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, time, time_of_fact, time_elapsed), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                    final SubLObject supporting_assertion = get_assertion_for_given_fact_and_time(fact, time_of_assertion);
                    if (temporal_projection_cols.NIL != supporting_assertion) {
                        justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(supporting_assertion));
                    }
                    return Values.values(dist, time_elapsed, justifications);
                }
                time_of_fact = get_first_time_point_of(time_of_assertion);
                if (temporal_projection_cols.NIL != time_falls_in_interval(time, time_of_fact, interval, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    final SubLObject time_elapsed = find_time_elapsed(time, time_of_fact);
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, time, time_of_fact, time_elapsed), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                    final SubLObject supporting_assertion = get_assertion_for_given_fact_and_time(fact, time_of_assertion);
                    if (temporal_projection_cols.NIL != supporting_assertion) {
                        justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(supporting_assertion));
                    }
                    return Values.values(dist, time_elapsed, justifications);
                }
                cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                time_of_assertion = cdolist_list_var_$25.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 96429L)
    public static SubLObject handle_temporal_relation_between_collections(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), temporal_projection_cols.$const76$temporalRelationBetweenCollection, (SubLObject)temporal_projection_cols.THREE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = all_assertions;
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject decay_fn = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject new_query = (SubLObject)ConsesLow.list(temporal_projection_cols.$const15$isa, cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED));
            SubLObject cdolist_list_var_$26;
            final SubLObject list_of_times = cdolist_list_var_$26 = get_list_of_times_for_assertion(new_query);
            SubLObject time_of_fact = (SubLObject)temporal_projection_cols.NIL;
            time_of_fact = cdolist_list_var_$26.first();
            while (temporal_projection_cols.NIL != cdolist_list_var_$26) {
                thread.resetMultipleValues();
                final SubLObject result = verify_temporal_relation(cycl_utilities.formula_arg1(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED), time_of_fact, time);
                final SubLObject justification_1 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection_cols.NIL != result) {
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                    justifications = ConsesLow.append(justifications, justification_1);
                    final SubLObject assertion_for_conflicting_fact = get_assertion_for_given_fact_and_time(new_query, time_of_fact);
                    final SubLObject time_elapsed = find_time_elapsed(time, time_of_fact);
                    if (temporal_projection_cols.NIL == mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const15$isa, decay_fn, (SubLObject)temporal_projection_cols.$list77), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                        justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, time_of_fact, time, time_elapsed), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    }
                    if (temporal_projection_cols.NIL != assertion_for_conflicting_fact) {
                        justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion_for_conflicting_fact));
                    }
                    return Values.values(decay_fn, time_elapsed, justifications);
                }
                cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                time_of_fact = cdolist_list_var_$26.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), temporal_projection_cols.$const76$temporalRelationBetweenCollection, (SubLObject)temporal_projection_cols.TWO_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        justifications = (SubLObject)temporal_projection_cols.NIL;
        cdolist_list_var = all_assertions;
        assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject decay_fn = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject new_query = (SubLObject)ConsesLow.list(temporal_projection_cols.$const15$isa, cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED));
            SubLObject cdolist_list_var_$27;
            final SubLObject list_of_times = cdolist_list_var_$27 = get_list_of_times_for_assertion(new_query);
            SubLObject time_of_fact = (SubLObject)temporal_projection_cols.NIL;
            time_of_fact = cdolist_list_var_$27.first();
            while (temporal_projection_cols.NIL != cdolist_list_var_$27) {
                thread.resetMultipleValues();
                final SubLObject result = verify_temporal_relation(cycl_utilities.formula_arg1(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED), time, time_of_fact);
                final SubLObject justification_1 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection_cols.NIL != result) {
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                    justifications = ConsesLow.append(justifications, justification_1);
                    final SubLObject assertion_for_conflicting_fact = get_assertion_for_given_fact_and_time(new_query, time_of_fact);
                    final SubLObject time_elapsed = find_time_elapsed(time, time_of_fact);
                    if (temporal_projection_cols.NIL == mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const15$isa, decay_fn, (SubLObject)temporal_projection_cols.$list77), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                        justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, time_of_fact, time, time_elapsed), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    }
                    if (temporal_projection_cols.NIL != assertion_for_conflicting_fact) {
                        justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion_for_conflicting_fact));
                    }
                    return Values.values(decay_fn, time_elapsed, justifications);
                }
                cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                time_of_fact = cdolist_list_var_$27.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 99570L)
    public static SubLObject handle_decay_distribution_for_collection_in_interval_when_instance_in_spec(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1_entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), temporal_projection_cols.$const78$decayDistributionForCollectionInI, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject set_of_all_consistent_assertions = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = all_assertions;
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(arg1_entity, cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED))) {
                final SubLObject pred = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject time_point_1 = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(pred, arg1_entity, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
                final SubLObject interval = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                if (temporal_projection_cols.NIL != time_point_1 && temporal_projection_cols.NIL != time_falls_in_interval(time_point_1, time, interval, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    set_of_all_consistent_assertions = (SubLObject)ConsesLow.cons(assertion, set_of_all_consistent_assertions);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        final SubLObject most_specific_assertion = find_most_specific_assertion(set_of_all_consistent_assertions);
        if (temporal_projection_cols.NIL != most_specific_assertion) {
            final SubLObject gaf2 = assertions_high.gaf_formula(most_specific_assertion);
            final SubLObject decay_fn = cycl_utilities.formula_arg5(gaf2, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject pred2 = cycl_utilities.formula_arg3(gaf2, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject time_point_2 = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(pred2, arg1_entity, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
            final SubLObject time_elapsed = find_time_elapsed(time_point_2, time);
            temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue(ConsesLow.append(temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread), (SubLObject)ConsesLow.list(most_specific_assertion)), thread);
            temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue(ConsesLow.append(temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread), plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(pred2, arg1_entity, time_point_2), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread))), thread);
            temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue(ConsesLow.append(temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread), plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, time_point_2, time, time_elapsed), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread))), thread);
            return Values.values(decay_fn, time_elapsed);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 101545L)
    public static SubLObject handle_default_decay_distribution_for_collection(final SubLObject fact) {
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), temporal_projection_cols.$const79$defaultDecayDistributionForCollec, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        if (temporal_projection_cols.NIL != all_assertions) {
            final SubLObject cdolist_list_var = all_assertions;
            SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
            assertion = cdolist_list_var.first();
            if (temporal_projection_cols.NIL != cdolist_list_var) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                return cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 101950L)
    public static SubLObject handle_default_decay_distribution_for_collection_backwards(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), temporal_projection_cols.$const80$defaultDecayFunctionForCollection, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        final SubLObject list_of_times = get_list_of_times_for_assertion(fact);
        SubLObject cdolist_list_var = all_assertions;
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$28 = list_of_times;
            SubLObject time_of_assertion = (SubLObject)temporal_projection_cols.NIL;
            time_of_assertion = cdolist_list_var_$28.first();
            while (temporal_projection_cols.NIL != cdolist_list_var_$28) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject time_of_fact = get_first_time_point_of(time_of_assertion);
                final SubLObject dist = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                SubLObject time_elapsed = (SubLObject)temporal_projection_cols.NIL;
                thread.resetMultipleValues();
                final SubLObject result = at_least_one_point_is_later_thanP(time_of_fact, time);
                final SubLObject justification_for_temporal_subsumption = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection_cols.NIL != result) {
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                    justifications = ConsesLow.append(justifications, justification_for_temporal_subsumption);
                    final SubLObject supporting_fact = get_assertion_for_given_fact_and_time(fact, time_of_assertion);
                    if (temporal_projection_cols.NIL != supporting_fact) {
                        justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(supporting_fact));
                    }
                    if (temporal_projection_cols.NIL == isa.isa_in_any_mtP(dist, temporal_projection_cols.$const81$ConstantFunction)) {
                        time_elapsed = find_time_elapsed(time, time_of_fact);
                        justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, time, time_of_fact, time_elapsed), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    }
                    return Values.values(dist, time_elapsed, justifications);
                }
                cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                time_of_assertion = cdolist_list_var_$28.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 103565L)
    public static SubLObject handle_decay_distribution_for_collection_forward(final SubLObject fact, final SubLObject time, final SubLObject time_of_fact) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), temporal_projection_cols.$const82$defaultDecayFunctionForCollection, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = all_assertions;
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            thread.resetMultipleValues();
            final SubLObject result = at_least_one_point_is_before_thanP(time_of_fact, time);
            final SubLObject justification_for_temporal_subsumption = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection_cols.NIL != result) {
                justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                justifications = ConsesLow.append(justifications, justification_for_temporal_subsumption);
                final SubLObject supporting_fact = get_assertion_for_given_fact_and_time(fact, time_of_fact);
                if (temporal_projection_cols.NIL != supporting_fact) {
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(supporting_fact));
                }
                return Values.values(cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED), justifications);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 104578L)
    public static SubLObject handle_decay_distribution_for_specs_collection(final SubLObject fact, final SubLObject time) {
        SubLObject cdolist_list_var;
        final SubLObject all_bindings = cdolist_list_var = mt_context.ask_mt_query((SubLObject)temporal_projection_cols.$list83, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject binding = (SubLObject)temporal_projection_cols.NIL;
        binding = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject arg1 = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, binding);
            final SubLObject arg2 = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym29$_Y, binding);
            final SubLObject predicate = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym32$_Z, binding);
            final SubLObject decay_fn = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym84$_W, binding);
            if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), arg2) && temporal_projection_cols.NIL != isa.isa_in_any_mtP(cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), arg1)) {
                final SubLObject query = (SubLObject)ConsesLow.listS(predicate, fact, (SubLObject)temporal_projection_cols.$list40);
                final SubLObject query_answer = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query(query, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
                if (temporal_projection_cols.NIL != query_answer) {
                    final SubLObject time_elapsed = find_time_elapsed(time, query_answer);
                    return Values.values(decay_fn, time_elapsed);
                }
                if (temporal_projection_cols.NIL == query_answer) {
                    return Values.values(decay_fn, (SubLObject)temporal_projection_cols.NIL);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 105604L)
    public static SubLObject handle_decay_distribution_for_collection_in_interval_backwards(final SubLObject fact, final SubLObject time) {
        SubLObject cdolist_list_var;
        final SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), temporal_projection_cols.$const85$decayFunctionForCollectionInInter, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject pred = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject arg_1_entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject time_point_1 = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(pred, arg_1_entity, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
            final SubLObject interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject time_elapsed_since_pred = find_time_elapsed(time_point_1, time);
            if (temporal_projection_cols.NIL != time_point_1 && temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, time_point_1, time), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED) && temporal_projection_cols.NIL != time_falls_in_interval(time, time_point_1, interval, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                return Values.values(cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED), time_elapsed_since_pred);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 106588L)
    public static SubLObject handle_decay_distribution_for_assertion_in_interval(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_bindings = mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const66$decayDistributionForAssertionInIn, fact, (SubLObject)temporal_projection_cols.$list31), (SubLObject)temporal_projection_cols.NIL, (SubLObject)temporal_projection_cols.NIL, (SubLObject)temporal_projection_cols.T);
        SubLObject lst_of_applicable_distributions = (SubLObject)temporal_projection_cols.NIL;
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = all_bindings;
        SubLObject binding = (SubLObject)temporal_projection_cols.NIL;
        binding = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject starting_time = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, binding);
            final SubLObject decay_fn = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym32$_Z, binding);
            final SubLObject interval = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym29$_Y, binding);
            if (temporal_projection_cols.NIL != starting_time && temporal_projection_cols.NIL == mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, starting_time, time), (SubLObject)temporal_projection_cols.NIL, (SubLObject)temporal_projection_cols.NIL, (SubLObject)temporal_projection_cols.T)) {
                final SubLObject time_elapsed = find_time_elapsed(starting_time, time);
                if (temporal_projection_cols.NIL != time_falls_in_interval(starting_time, time, interval, time_elapsed)) {
                    final SubLObject supporting_assertion = get_assertion_for_predicate_of_arity_four(temporal_projection_cols.$const66$decayDistributionForAssertionInIn, fact, starting_time, interval, decay_fn);
                    if (temporal_projection_cols.NIL != supporting_assertion) {
                        justifications = ConsesLow.append((SubLObject)ConsesLow.list(supporting_assertion), justifications);
                    }
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, starting_time, time, time_elapsed), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    lst_of_applicable_distributions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(time_elapsed, decay_fn, starting_time), lst_of_applicable_distributions);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        if (Sequences.length(lst_of_applicable_distributions).numE((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            final SubLObject entry = cycl_utilities.formula_arg0(lst_of_applicable_distributions);
            return Values.values(calculate_persistence_likelihood(cycl_utilities.formula_arg0(entry), cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection_cols.UNPROVIDED)), justifications);
        }
        return Values.values(find_persistence_by_combining_evidence(lst_of_applicable_distributions), justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 108351L)
    public static SubLObject handle_decay_distribution_for_assertion_in_interval_backwards(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_bindings = mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const86$decayDistributionForAssertionInIn, fact, (SubLObject)temporal_projection_cols.$list31), (SubLObject)temporal_projection_cols.NIL, (SubLObject)temporal_projection_cols.NIL, (SubLObject)temporal_projection_cols.T);
        SubLObject lst_of_applicable_distributions = (SubLObject)temporal_projection_cols.NIL;
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = all_bindings;
        SubLObject binding = (SubLObject)temporal_projection_cols.NIL;
        binding = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject starting_time = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, binding);
            final SubLObject decay_fn = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym32$_Z, binding);
            final SubLObject interval = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym29$_Y, binding);
            if (temporal_projection_cols.NIL != starting_time && temporal_projection_cols.NIL == mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, time, starting_time), (SubLObject)temporal_projection_cols.NIL, (SubLObject)temporal_projection_cols.NIL, (SubLObject)temporal_projection_cols.T)) {
                final SubLObject time_elapsed = find_time_elapsed(starting_time, time);
                if (temporal_projection_cols.NIL != time_falls_in_interval(time, starting_time, interval, time_elapsed)) {
                    final SubLObject supporting_assertion = get_assertion_for_predicate_of_arity_four(temporal_projection_cols.$const86$decayDistributionForAssertionInIn, fact, starting_time, interval, decay_fn);
                    if (temporal_projection_cols.NIL != supporting_assertion) {
                        justifications = ConsesLow.append((SubLObject)ConsesLow.list(supporting_assertion), justifications);
                    }
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, starting_time, time, time_elapsed), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    lst_of_applicable_distributions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(time_elapsed, decay_fn, starting_time), lst_of_applicable_distributions);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        if (Sequences.length(lst_of_applicable_distributions).numE((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            final SubLObject entry = cycl_utilities.formula_arg0(lst_of_applicable_distributions);
            return Values.values(calculate_persistence_likelihood(cycl_utilities.formula_arg0(entry), cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection_cols.UNPROVIDED)), justifications);
        }
        return Values.values(find_persistence_by_combining_evidence(lst_of_applicable_distributions), justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 110136L)
    public static SubLObject check_time_subsumption(final SubLObject predicate, final SubLObject time, final SubLObject lower, final SubLObject upper) {
        final SubLObject query = (SubLObject)ConsesLow.list(predicate, (SubLObject)temporal_projection_cols.$sym28$_X, time);
        final SubLObject query_answer = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query(query, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
        if (predicate.eql(temporal_projection_cols.$const87$hourNumberOfDate) && lower.numE((SubLObject)temporal_projection_cols.ZERO_INTEGER) && upper.numE((SubLObject)temporal_projection_cols.$int88$23)) {
            return (SubLObject)temporal_projection_cols.T;
        }
        if (temporal_projection_cols.NIL == query_answer) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        if (lower.numL(query_answer) && upper.numG(query_answer)) {
            return (SubLObject)temporal_projection_cols.T;
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 110664L)
    public static SubLObject handle_decay_distribution_for_assertion_causal(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_bindings = mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const89$decayDistributionForAssertion_Cau, fact, (SubLObject)temporal_projection_cols.$list27), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject results = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = all_bindings;
        SubLObject binding = (SubLObject)temporal_projection_cols.NIL;
        binding = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject cause = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, binding);
            final SubLObject decay_fn = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym29$_Y, binding);
            final SubLObject starting_time = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const50$startingDate, cause, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
            final SubLObject ending_time = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const90$endingDate, cause, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
            if (temporal_projection_cols.NIL != starting_time && temporal_projection_cols.NIL == mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, starting_time, time), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED) && temporal_projection_cols.NIL != ending_time) {
                if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, ending_time, time), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    results = (SubLObject)ConsesLow.cons((SubLObject)temporal_projection_cols.ONE_INTEGER, results);
                }
                final SubLObject time_elapsed = find_time_elapsed(ending_time, time);
                final SubLObject assertion = get_assertion_for_ternary_predicates(temporal_projection_cols.$const89$decayDistributionForAssertion_Cau, fact, cause, decay_fn);
                temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue(ConsesLow.append(temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread), (SubLObject)ConsesLow.list(assertion)), thread);
                temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue(ConsesLow.append(temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread), plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const50$startingDate, cause, starting_time), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread))), thread);
                if (temporal_projection_cols.NIL == conses_high.member((SubLObject)temporal_projection_cols.ONE_INTEGER, results, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue(ConsesLow.append(temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread), plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const21$timeElapsed, ending_time, time, time_elapsed), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread))), thread);
                }
                temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue(ConsesLow.append(temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread), plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const90$endingDate, cause, ending_time), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread))), thread);
                results = (SubLObject)ConsesLow.cons(calculate_persistence_likelihood(time_elapsed, decay_fn), results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        if (temporal_projection_cols.NIL != results) {
            return Sequences.creduce(Symbols.symbol_function((SubLObject)temporal_projection_cols.$sym74$MAX), results, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 112818L)
    public static SubLObject handle_decay_distribution_for_collection_when_time_in_interval(final SubLObject fact, final SubLObject time) {
        SubLObject cdolist_list_var;
        final SubLObject all_bindings = cdolist_list_var = mt_context.ask_mt_query((SubLObject)temporal_projection_cols.$list91, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject binding = (SubLObject)temporal_projection_cols.NIL;
        binding = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            SubLObject col = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym92$_COL, binding);
            if (temporal_projection_cols.NIL != nart_handles.nart_p(col)) {
                col = narts_high.nart_hl_formula(col);
            }
            if (col.equal(cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED))) {
                final SubLObject pred = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, binding);
                final SubLObject time_point = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym29$_Y, binding);
                final SubLObject dist = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym32$_Z, binding);
                if (temporal_projection_cols.NIL != check_temporal_relation(pred, time_point, time)) {
                    final SubLObject time_elapsed = find_time_elapsed(time_point, time);
                    return Values.values(dist, time_elapsed);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 113645L)
    public static SubLObject check_temporal_relation(final SubLObject predicate, final SubLObject time_point, final SubLObject time) {
        if (temporal_projection_cols.NIL != nart_handles.nart_p(predicate)) {
            final SubLObject hl_formula = narts_high.nart_hl_formula(predicate);
            if (cycl_utilities.formula_arg0(hl_formula).eql(temporal_projection_cols.$const93$InverseBinaryPredicateFn)) {
                final SubLObject p = cycl_utilities.formula_arg1(hl_formula, (SubLObject)temporal_projection_cols.UNPROVIDED);
                return mt_context.ask_mt_query((SubLObject)ConsesLow.list(p, time, time_point), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
            }
        }
        return mt_context.ask_mt_query((SubLObject)ConsesLow.list(predicate, time_point, time), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 114588L)
    public static SubLObject get_persistence_likelihood_for_fact_at_time(final SubLObject fact, final SubLObject time, SubLObject justifyP, SubLObject mt, SubLObject recursiveP, SubLObject depth_of_recursion) {
        if (justifyP == temporal_projection_cols.UNPROVIDED) {
            justifyP = (SubLObject)temporal_projection_cols.NIL;
        }
        if (mt == temporal_projection_cols.UNPROVIDED) {
            mt = temporal_projection_cols.$const44$EverythingPSC;
        }
        if (recursiveP == temporal_projection_cols.UNPROVIDED) {
            recursiveP = (SubLObject)temporal_projection_cols.NIL;
        }
        if (depth_of_recursion == temporal_projection_cols.UNPROVIDED) {
            depth_of_recursion = (SubLObject)temporal_projection_cols.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        temporal_projection_cols.$mt_for_temporal_projection$.setDynamicValue(mt, thread);
        if (temporal_projection_cols.NIL == recursiveP) {
            temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue((SubLObject)temporal_projection_cols.NIL, thread);
            temporal_projection_cols.$temporal_projection_answers$.setDynamicValue((SubLObject)temporal_projection_cols.NIL, thread);
            temporal_projection_cols.$temporal_projection_stack$.setDynamicValue((SubLObject)temporal_projection_cols.NIL, thread);
        }
        if (temporal_projection_cols.NIL != recursive_temporal_projection_queryP(fact, time)) {
            return get_already_computed_answers(fact, time);
        }
        if (temporal_projection_cols.NIL != recursiveP) {
            depth_of_recursion = Numbers.add(depth_of_recursion, (SubLObject)temporal_projection_cols.ONE_INTEGER);
            if (depth_of_recursion.numG((SubLObject)temporal_projection_cols.THREE_INTEGER)) {
                return (SubLObject)temporal_projection_cols.NIL;
            }
        }
        thread.resetMultipleValues();
        SubLObject result = check_always_trueP(fact);
        SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != result) {
            return Values.values(result, justifications);
        }
        temporal_projection_cols.$temporal_projection_stack$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(fact, time), temporal_projection_cols.$temporal_projection_stack$.getDynamicValue(thread)), thread);
        if (cycl_utilities.formula_arg0(fact).eql(temporal_projection_cols.$const15$isa)) {
            thread.resetMultipleValues();
            result = get_persistence_of_isa_assertion(fact, time, depth_of_recursion);
            justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            temporal_projection_cols.$temporal_projection_answers$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(fact, time, result, justifications), temporal_projection_cols.$temporal_projection_answers$.getDynamicValue(thread)), thread);
            return Values.values(result, ConsesLow.append(justifications, temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread)));
        }
        thread.resetMultipleValues();
        result = get_persistence_of_non_isa_assertion(fact, time, depth_of_recursion);
        justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        temporal_projection_cols.$temporal_projection_answers$.setDynamicValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(fact, time, result, justifications), temporal_projection_cols.$temporal_projection_answers$.getDynamicValue(thread)), thread);
        return Values.values(result, ConsesLow.append(justifications, temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 116058L)
    public static SubLObject get_persistence_of_isa_assertion(final SubLObject fact, final SubLObject time, final SubLObject depth_of_recursion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (temporal_projection_cols.NIL == check_starting_times(fact, time)) {
            return el_utilities.make_unary_formula(temporal_projection_cols.$const22$NumericLikelihoodFn, (SubLObject)temporal_projection_cols.ZERO_INTEGER);
        }
        thread.resetMultipleValues();
        SubLObject result = check_ending_times(fact, time);
        SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != result) {
            return Values.values(el_utilities.make_unary_formula(temporal_projection_cols.$const22$NumericLikelihoodFn, (SubLObject)temporal_projection_cols.ZERO_INTEGER), justifications);
        }
        thread.resetMultipleValues();
        result = check_fact_true_at_point(fact, time);
        justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != result) {
            return Values.values(el_utilities.make_unary_formula(temporal_projection_cols.$const22$NumericLikelihoodFn, (SubLObject)temporal_projection_cols.ONE_INTEGER), justifications);
        }
        thread.resetMultipleValues();
        result = check_isa_fact_false_at_point(fact, time);
        justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != result) {
            return Values.values(el_utilities.make_unary_formula(temporal_projection_cols.$const22$NumericLikelihoodFn, (SubLObject)temporal_projection_cols.ZERO_INTEGER), justifications);
        }
        thread.resetMultipleValues();
        result = check_cardinality_of_collection(fact, time);
        justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != result) {
            return Values.values(el_utilities.make_unary_formula(temporal_projection_cols.$const22$NumericLikelihoodFn, (SubLObject)temporal_projection_cols.ZERO_INTEGER), justifications);
        }
        thread.resetMultipleValues();
        SubLObject likelihood = collect_evidence_from_rules(fact, time, depth_of_recursion);
        justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (likelihood.isNumber() && !likelihood.numG((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            return Values.values(el_utilities.make_unary_formula(temporal_projection_cols.$const22$NumericLikelihoodFn, likelihood), justifications);
        }
        thread.resetMultipleValues();
        likelihood = use_conditional_likelihood(fact, time);
        justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (likelihood.isNumber() && !likelihood.numG((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            return Values.values(el_utilities.make_unary_formula(temporal_projection_cols.$const22$NumericLikelihoodFn, likelihood), justifications);
        }
        thread.resetMultipleValues();
        likelihood = use_risk_analysis(fact, time);
        justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (likelihood.isNumber() && !likelihood.numG((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            return Values.values(el_utilities.make_unary_formula(temporal_projection_cols.$const22$NumericLikelihoodFn, likelihood), justifications);
        }
        thread.resetMultipleValues();
        likelihood = find_probability_of_event_occurrence(fact, time);
        justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (likelihood.isNumber() && !likelihood.numG((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            return Values.values(el_utilities.make_unary_formula(temporal_projection_cols.$const22$NumericLikelihoodFn, likelihood), justifications);
        }
        thread.resetMultipleValues();
        likelihood = find_probability_of_end_of_event(fact, time, depth_of_recursion);
        justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (likelihood.isNumber() && !likelihood.numG((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            return Values.values(el_utilities.make_unary_formula(temporal_projection_cols.$const22$NumericLikelihoodFn, likelihood), justifications);
        }
        final SubLObject time_1 = get_mt_time_for_assertion(fact);
        if (temporal_projection_cols.NIL != time) {
            SubLObject likelihood2 = (SubLObject)temporal_projection_cols.NIL;
            thread.resetMultipleValues();
            final SubLObject relevant_decay_function = find_decay_function_for_collection(fact, time, time_1);
            final SubLObject time_elapsed = thread.secondMultipleValue();
            final SubLObject justifications2 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            likelihood2 = calculate_persistence_likelihood(time_elapsed, relevant_decay_function);
            if (likelihood2.isNumber() && !likelihood2.numG((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                return Values.values(el_utilities.make_unary_formula(temporal_projection_cols.$const22$NumericLikelihoodFn, likelihood2), justifications2);
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 118976L)
    public static SubLObject get_persistence_of_non_isa_assertion(final SubLObject fact, final SubLObject time, final SubLObject depth_of_recursion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject result = check_starting_times(fact, time);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL == result) {
            return Values.values(el_utilities.make_unary_formula(temporal_projection_cols.$const22$NumericLikelihoodFn, (SubLObject)temporal_projection_cols.ZERO_INTEGER), justification);
        }
        thread.resetMultipleValues();
        result = check_ending_times(fact, time);
        SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != result) {
            return Values.values(el_utilities.make_unary_formula(temporal_projection_cols.$const22$NumericLikelihoodFn, (SubLObject)temporal_projection_cols.ZERO_INTEGER), justifications);
        }
        thread.resetMultipleValues();
        result = check_fact_true_at_point(fact, time);
        justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != result) {
            return Values.values(el_utilities.make_unary_formula(temporal_projection_cols.$const22$NumericLikelihoodFn, (SubLObject)temporal_projection_cols.ONE_INTEGER), justifications);
        }
        thread.resetMultipleValues();
        final SubLObject prob = use_causal_analysis_to_find_likelihood(fact, time);
        justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != prob && !prob.numG((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            return Values.values(el_utilities.make_unary_formula(temporal_projection_cols.$const22$NumericLikelihoodFn, prob), justifications);
        }
        thread.resetMultipleValues();
        final SubLObject likelihood = collect_evidence_from_rules(fact, time, depth_of_recursion);
        justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (likelihood.isNumber() && !likelihood.numG((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            return Values.values(el_utilities.make_unary_formula(temporal_projection_cols.$const22$NumericLikelihoodFn, likelihood), justifications);
        }
        final SubLObject time_1 = get_mt_time_for_assertion(fact);
        if (temporal_projection_cols.NIL != time) {
            final SubLObject time_elapsed = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const21$timeElapsed, time_1, time, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
            SubLObject likelihood2 = (SubLObject)temporal_projection_cols.NIL;
            thread.resetMultipleValues();
            final SubLObject relevant_decay_function = find_decay_function_for_fact(fact, time_elapsed, time);
            final SubLObject tm = thread.secondMultipleValue();
            final SubLObject justifications2 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection_cols.NIL != tm) {
                likelihood2 = calculate_persistence_likelihood(tm, relevant_decay_function);
            }
            else {
                likelihood2 = calculate_persistence_likelihood(time_elapsed, relevant_decay_function);
            }
            if (likelihood2.isNumber() && !likelihood2.numG((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                return Values.values(el_utilities.make_unary_formula(temporal_projection_cols.$const22$NumericLikelihoodFn, likelihood2), justifications2);
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 120974L)
    public static SubLObject collect_evidence_from_rules(final SubLObject fact, final SubLObject time, final SubLObject depth_of_recursion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.formula_arg0(fact);
        if (pred.eql(temporal_projection_cols.$const15$isa)) {
            SubLObject ret_value = handle_delay_between_collections(fact, time);
            if (temporal_projection_cols.NIL != ret_value) {
                return ret_value;
            }
            thread.resetMultipleValues();
            ret_value = find_transition_probability(fact, time, depth_of_recursion);
            SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection_cols.NIL != ret_value) {
                return Values.values(ret_value, justifications);
            }
            thread.resetMultipleValues();
            ret_value = handle_decay_distribution_for_assertion_in_interval(fact, time);
            justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection_cols.NIL != ret_value) {
                return Values.values(ret_value, justifications);
            }
        }
        thread.resetMultipleValues();
        SubLObject ret_value = handle_decay_distribution_for_assertion_in_interval_backwards(fact, time);
        SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != ret_value) {
            return Values.values(ret_value, justifications);
        }
        thread.resetMultipleValues();
        ret_value = handle_decay_distribution_for_assertion_causal(fact, time);
        justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != ret_value) {
            Values.values(ret_value, justifications);
        }
        if (pred.eql(temporal_projection_cols.$const15$isa)) {
            thread.resetMultipleValues();
            ret_value = handle_distribution_for_termination_of_membership(fact, time);
            justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection_cols.NIL != ret_value) {
                return Values.values(ret_value, justifications);
            }
        }
        if (cycl_utilities.formula_arg0(fact).eql(temporal_projection_cols.$const95$dateOfEvent) || cycl_utilities.formula_arg0(fact).eql(temporal_projection_cols.$const50$startingDate)) {
            thread.resetMultipleValues();
            final SubLObject dist = check_delay_between_start_of_event_types_in_sit_type(fact);
            final SubLObject tm = thread.secondMultipleValue();
            final SubLObject justifications2 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection_cols.NIL != dist) {
                return Values.values(dist, tm, justifications2);
            }
        }
        if (cycl_utilities.formula_arg0(fact).eql(temporal_projection_cols.$const96$endsDuring)) {
            thread.resetMultipleValues();
            final SubLObject dist = check_duration_of_event_type(fact);
            final SubLObject tm = thread.secondMultipleValue();
            final SubLObject justifications2 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection_cols.NIL != dist) {
                return Values.values(dist, tm, justifications2);
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 122842L)
    public static SubLObject find_decay_function_for_collection(final SubLObject fact, final SubLObject time, final SubLObject time_of_fact) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject dist = use_event_calculus_to_find_likelihood(fact, time);
        SubLObject tm = thread.secondMultipleValue();
        SubLObject justifications = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != dist) {
            return Values.values(dist, tm, justifications);
        }
        thread.resetMultipleValues();
        dist = handle_temporal_relation_between_collections(fact, time);
        tm = thread.secondMultipleValue();
        justifications = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != dist) {
            return Values.values(dist, tm, justifications);
        }
        thread.resetMultipleValues();
        dist = handle_default_decay_distribution_for_collection_backwards(fact, time);
        tm = thread.secondMultipleValue();
        justifications = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != dist) {
            return Values.values(dist, tm, justifications);
        }
        thread.resetMultipleValues();
        dist = handle_decay_distribution_for_collection_in_interval_when_instance_in_spec(fact, time);
        tm = thread.secondMultipleValue();
        justifications = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != dist) {
            return Values.values(dist, tm, justifications);
        }
        thread.resetMultipleValues();
        dist = handle_decay_distribution_for_collection_when_time_in_interval(fact, time);
        tm = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != dist) {
            return Values.values(dist, tm);
        }
        SubLObject ret_value = handle_decay_distribution_for_collection_in_interval_backwards(fact, time);
        if (temporal_projection_cols.NIL != ret_value) {
            return ret_value;
        }
        thread.resetMultipleValues();
        dist = handle_decay_distribution_for_specs_collection(fact, time);
        tm = thread.secondMultipleValue();
        justifications = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != dist) {
            return Values.values(dist, tm, justifications);
        }
        ret_value = handle_default_decay_distribution_for_collection(fact);
        if (temporal_projection_cols.NIL != ret_value) {
            return ret_value;
        }
        thread.resetMultipleValues();
        dist = handle_temporal_interpolation_function_for_collection(fact, time);
        tm = thread.secondMultipleValue();
        justifications = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != dist) {
            return Values.values(dist, tm, justifications);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 124633L)
    public static SubLObject find_decay_function_for_fact(final SubLObject fact, final SubLObject time_elapsed, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject dist = use_event_calculus_to_find_likelihood(fact, time);
        SubLObject tm = thread.secondMultipleValue();
        SubLObject justifications = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != dist) {
            return Values.values(dist, tm, justifications);
        }
        thread.resetMultipleValues();
        dist = handle_decay_distribution_for_assertion_in_time_interval(fact, time);
        tm = thread.secondMultipleValue();
        justifications = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != dist) {
            return Values.values(dist, tm, justifications);
        }
        SubLObject cdolist_list_var;
        SubLObject all_assertions = cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg0(fact), temporal_projection_cols.$const97$decayFunctionForPredicateInInterv, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            if (cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED).numE((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                final SubLObject pred = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject arg_1_entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject time_point_1 = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(pred, arg_1_entity, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
                final SubLObject interval = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                if (temporal_projection_cols.NIL != time_point_1 && temporal_projection_cols.NIL != time_falls_in_interval(time_point_1, time, interval, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    return cycl_utilities.formula_arg5(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                }
            }
            if (cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED).numE((SubLObject)temporal_projection_cols.TWO_INTEGER)) {
                final SubLObject pred = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject arg_2_entity = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject time_point_1 = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(pred, arg_2_entity, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
                final SubLObject interval = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                if (temporal_projection_cols.NIL != time_point_1 && temporal_projection_cols.NIL != time_falls_in_interval(time_point_1, time, interval, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    return cycl_utilities.formula_arg5(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg0(fact), temporal_projection_cols.$const98$decayFunctionForSpecsInInterval, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject arg_1_entity2 = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject arg_2_entity2 = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject cdolist_list_var2 = all_assertions;
        SubLObject assertion2 = (SubLObject)temporal_projection_cols.NIL;
        assertion2 = cdolist_list_var2.first();
        while (temporal_projection_cols.NIL != cdolist_list_var2) {
            final SubLObject gaf2 = assertions_high.gaf_formula(assertion2);
            if (cycl_utilities.formula_arg3(gaf2, (SubLObject)temporal_projection_cols.UNPROVIDED).numE((SubLObject)temporal_projection_cols.TWO_INTEGER) && temporal_projection_cols.NIL != isa.isa_in_any_mtP(arg_2_entity2, cycl_utilities.formula_arg2(gaf2, (SubLObject)temporal_projection_cols.UNPROVIDED)) && temporal_projection_cols.NIL != time_elapsed_falls_in_interval(time_elapsed, cycl_utilities.formula_arg4(gaf2, (SubLObject)temporal_projection_cols.UNPROVIDED))) {
                return cycl_utilities.formula_arg5(gaf2, (SubLObject)temporal_projection_cols.UNPROVIDED);
            }
            if (cycl_utilities.formula_arg3(gaf2, (SubLObject)temporal_projection_cols.UNPROVIDED).numE((SubLObject)temporal_projection_cols.ONE_INTEGER) && temporal_projection_cols.NIL != isa.isa_in_any_mtP(arg_1_entity2, cycl_utilities.formula_arg2(gaf2, (SubLObject)temporal_projection_cols.UNPROVIDED)) && temporal_projection_cols.NIL != time_elapsed_falls_in_interval(time_elapsed, cycl_utilities.formula_arg4(gaf2, (SubLObject)temporal_projection_cols.UNPROVIDED))) {
                return cycl_utilities.formula_arg5(gaf2, (SubLObject)temporal_projection_cols.UNPROVIDED);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            assertion2 = cdolist_list_var2.first();
        }
        thread.resetMultipleValues();
        dist = handle_decay_distribution_for_specs(fact, time);
        tm = thread.secondMultipleValue();
        justifications = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != dist) {
            return Values.values(dist, tm, justifications);
        }
        all_assertions = (cdolist_list_var = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg0(fact), temporal_projection_cols.$const99$decayFunctionInInterval, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED));
        assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            if (temporal_projection_cols.NIL != time_elapsed_falls_in_interval(time_elapsed, cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED))) {
                return cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        thread.resetMultipleValues();
        dist = handle_default_decay_function_for_predicate(fact, time);
        tm = thread.secondMultipleValue();
        justifications = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != dist) {
            return Values.values(dist, tm, justifications);
        }
        thread.resetMultipleValues();
        dist = handle_default_decay_function_for_predicate_backwards(fact, time);
        tm = thread.secondMultipleValue();
        justifications = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != dist) {
            return Values.values(dist, tm, justifications);
        }
        thread.resetMultipleValues();
        dist = handle_duration_weighted_decay_distribution(fact, time);
        tm = thread.secondMultipleValue();
        justifications = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != dist) {
            return Values.values(dist, tm, justifications);
        }
        thread.resetMultipleValues();
        dist = handle_temporal_interpolation_function_for_predicate(fact, time);
        tm = thread.secondMultipleValue();
        justifications = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != dist) {
            return Values.values(dist, tm, justifications);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 128338L)
    public static SubLObject time_elapsed_falls_in_interval(final SubLObject time_elapsed, final SubLObject interval) {
        final SubLObject query_answer = cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const100$intervalRange, interval, (SubLObject)temporal_projection_cols.$list27), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED));
        final SubLObject lower = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, query_answer);
        final SubLObject upper = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym29$_Y, query_answer);
        SubLObject lower_bound_test = (SubLObject)temporal_projection_cols.NIL;
        SubLObject upper_bound_test = (SubLObject)temporal_projection_cols.NIL;
        if (cycl_utilities.formula_arg1(upper, (SubLObject)temporal_projection_cols.UNPROVIDED).eql(temporal_projection_cols.$const101$PlusInfinity)) {
            upper_bound_test = (SubLObject)temporal_projection_cols.T;
        }
        if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const102$lessThanOrEqualTo, lower, time_elapsed), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
            lower_bound_test = (SubLObject)temporal_projection_cols.T;
        }
        if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const56$lessThan, time_elapsed, upper), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
            upper_bound_test = (SubLObject)temporal_projection_cols.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(temporal_projection_cols.NIL != lower_bound_test && temporal_projection_cols.NIL != upper_bound_test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 129081L)
    public static SubLObject calculate_persistence_likelihood(final SubLObject time_elapsed, final SubLObject decay_function) {
        if (temporal_projection_cols.NIL == decay_function) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        if (temporal_projection_cols.NIL == nart_handles.nart_p(decay_function)) {
            return calculate_persistence_likelihood_from_non_narts(time_elapsed, decay_function);
        }
        if (cycl_utilities.formula_arg0(narts_high.nart_hl_formula(decay_function)).eql(temporal_projection_cols.$const103$ExponentialDecayDistributionWithI)) {
            return calculate_persistence_for_exponential_decay_distribution_with_initial_value_fn(time_elapsed, decay_function);
        }
        if (cycl_utilities.formula_arg0(narts_high.nart_hl_formula(decay_function)).eql(temporal_projection_cols.$const104$ExponentialDecayDistributionWithI)) {
            return calculate_persistence_for_exponential_decay_distribution_with_initial_and_final_value_fn(time_elapsed, decay_function);
        }
        if (cycl_utilities.formula_arg0(narts_high.nart_hl_formula(decay_function)).eql(temporal_projection_cols.$const105$BoundedExponentiallyIncreasingFun)) {
            return calculate_persistence_for_bounded_exponentially_increasing_function_with_initial_value(time_elapsed, decay_function);
        }
        if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(narts_high.nart_hl_formula(decay_function), temporal_projection_cols.$const106$NormalDistribution)) {
            return calculate_persistence_for_gaussian_decay_function(time_elapsed, decay_function);
        }
        if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(narts_high.nart_hl_formula(decay_function), temporal_projection_cols.$const81$ConstantFunction)) {
            return calculate_persistence_for_constant_function(decay_function);
        }
        if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(narts_high.nart_hl_formula(decay_function), temporal_projection_cols.$const107$LinearlyDecreasingFunction)) {
            return calculate_persistence_for_linear_decay_function(time_elapsed, decay_function);
        }
        if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(narts_high.nart_hl_formula(decay_function), temporal_projection_cols.$const108$ExponentiallyDecreasingFunction)) {
            return calculate_persistence_for_exponential_decay_function(time_elapsed, decay_function);
        }
        if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(narts_high.nart_hl_formula(decay_function), temporal_projection_cols.$const109$BoundedExponentiallyIncreasingFun)) {
            return calculate_persistence_for_bounded_exponentially_increasing_function(time_elapsed, decay_function);
        }
        if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(narts_high.nart_hl_formula(decay_function), temporal_projection_cols.$const110$LinearlyIncreasingFunction)) {
            return calculate_persistence_for_linearly_increasing_function(time_elapsed, decay_function);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 131233L)
    public static SubLObject calculate_persistence_likelihood_from_non_narts(final SubLObject time_elapsed, final SubLObject decay_function) {
        if (temporal_projection_cols.NIL == decay_function) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        if (cycl_utilities.formula_arg0(decay_function).eql(temporal_projection_cols.$const111$ExponentialDecayDistributionWithP)) {
            return calculate_persistence_for_exponential_decay_function_scaled(time_elapsed, decay_function);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 131590L)
    public static SubLObject calculate_persistence_for_exponential_decay_function(final SubLObject time_elapsed, final SubLObject decay_function) {
        final SubLObject v_answer = cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const112$exponentialDecayDistributionWithP, decay_function, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED));
        final SubLObject parameter = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, v_answer);
        final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0(time_elapsed);
        final SubLObject parameter_2 = convert_to_unit(parameter, unit_of_time_elapsed);
        if (temporal_projection_cols.NIL == parameter_2) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        final SubLObject x = Numbers.divide(cycl_utilities.formula_arg1(time_elapsed, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg1(parameter_2, (SubLObject)temporal_projection_cols.UNPROVIDED));
        if (x.numG((SubLObject)temporal_projection_cols.$int113$50)) {
            return (SubLObject)temporal_projection_cols.ZERO_INTEGER;
        }
        return Numbers.expt((SubLObject)temporal_projection_cols.$float114$2_71, Numbers.subtract((SubLObject)temporal_projection_cols.ZERO_INTEGER, x));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 132201L)
    public static SubLObject calculate_persistence_for_exponential_decay_function_scaled(final SubLObject time_elapsed, final SubLObject decay_function) {
        final SubLObject parameter = cycl_utilities.formula_arg1(decay_function, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0(time_elapsed);
        final SubLObject parameter_2 = convert_to_unit(parameter, unit_of_time_elapsed);
        if (temporal_projection_cols.NIL == parameter_2) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        final SubLObject x = Numbers.divide(cycl_utilities.formula_arg1(time_elapsed, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg1(parameter_2, (SubLObject)temporal_projection_cols.UNPROVIDED));
        if (x.numG((SubLObject)temporal_projection_cols.$int113$50)) {
            return (SubLObject)temporal_projection_cols.ZERO_INTEGER;
        }
        return Numbers.expt((SubLObject)temporal_projection_cols.$float114$2_71, Numbers.subtract((SubLObject)temporal_projection_cols.ZERO_INTEGER, x));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 132702L)
    public static SubLObject calculate_persistence_for_bounded_exponentially_increasing_function(final SubLObject time_elapsed, final SubLObject decay_fn) {
        final SubLObject v_answer = cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const115$boundedExponentiallyIncreasingFun, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)temporal_projection_cols.$sym29$_Y, decay_fn), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED));
        final SubLObject parameter = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, v_answer);
        final SubLObject upper_bound = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym29$_Y, v_answer);
        final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0(time_elapsed);
        final SubLObject parameter_2 = convert_to_unit(parameter, unit_of_time_elapsed);
        if (temporal_projection_cols.NIL != parameter_2 && temporal_projection_cols.NIL != upper_bound) {
            final SubLObject x = Numbers.divide(cycl_utilities.formula_arg1(time_elapsed, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg1(parameter_2, (SubLObject)temporal_projection_cols.UNPROVIDED));
            return Numbers.multiply(upper_bound, Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, Numbers.expt((SubLObject)temporal_projection_cols.$float114$2_71, Numbers.subtract((SubLObject)temporal_projection_cols.ZERO_INTEGER, x))));
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 133360L)
    public static SubLObject calculate_persistence_for_bounded_exponentially_increasing_function_with_initial_value(final SubLObject time_elapsed, final SubLObject decay_fn) {
        final SubLObject v_answer = cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const116$boundedExponentiallyIncreasingFun, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)temporal_projection_cols.$sym29$_Y, (SubLObject)temporal_projection_cols.$sym32$_Z, decay_fn), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED));
        final SubLObject parameter = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, v_answer);
        final SubLObject lower_bound = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym32$_Z, v_answer);
        final SubLObject upper_bound = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym29$_Y, v_answer);
        final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0(time_elapsed);
        final SubLObject parameter_2 = convert_to_unit(parameter, unit_of_time_elapsed);
        if (temporal_projection_cols.NIL != parameter_2 && temporal_projection_cols.NIL != upper_bound) {
            final SubLObject x = Numbers.divide(cycl_utilities.formula_arg1(time_elapsed, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg1(parameter_2, (SubLObject)temporal_projection_cols.UNPROVIDED));
            return Numbers.add(lower_bound, Numbers.multiply(upper_bound, Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, Numbers.expt((SubLObject)temporal_projection_cols.TEN_INTEGER, Numbers.subtract((SubLObject)temporal_projection_cols.ZERO_INTEGER, x)))));
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 134106L)
    public static SubLObject calculate_persistence_for_exponential_decay_distribution_with_initial_and_final_value_fn(final SubLObject time_elapsed, final SubLObject decay_fn) {
        final SubLObject v_answer = cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const117$exponentialDecayDistributionWithI, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)temporal_projection_cols.$sym29$_Y, (SubLObject)temporal_projection_cols.$sym32$_Z, decay_fn), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED));
        final SubLObject parameter = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym32$_Z, v_answer);
        final SubLObject lower_bound = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym29$_Y, v_answer);
        final SubLObject upper_bound = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, v_answer);
        final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0(time_elapsed);
        final SubLObject parameter_2 = convert_to_unit(parameter, unit_of_time_elapsed);
        if (temporal_projection_cols.NIL != parameter_2 && temporal_projection_cols.NIL != upper_bound) {
            final SubLObject x = Numbers.divide(cycl_utilities.formula_arg1(time_elapsed, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg1(parameter_2, (SubLObject)temporal_projection_cols.UNPROVIDED));
            final SubLObject ret_value = Numbers.multiply(upper_bound, Numbers.expt((SubLObject)temporal_projection_cols.$float114$2_71, Numbers.subtract((SubLObject)temporal_projection_cols.ZERO_INTEGER, x)));
            if (!ret_value.numL(lower_bound)) {
                return ret_value;
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 134921L)
    public static SubLObject calculate_persistence_for_exponential_decay_distribution_with_initial_value_fn(final SubLObject time_elapsed, final SubLObject decay_fn) {
        final SubLObject v_answer = cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const118$exponentialDecayDistributionWithI, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)temporal_projection_cols.$sym29$_Y, decay_fn), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED));
        final SubLObject parameter = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym29$_Y, v_answer);
        final SubLObject upper_bound = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, v_answer);
        final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0(time_elapsed);
        final SubLObject parameter_2 = convert_to_unit(parameter, unit_of_time_elapsed);
        if (temporal_projection_cols.NIL != parameter_2 && temporal_projection_cols.NIL != upper_bound) {
            final SubLObject x = Numbers.divide(cycl_utilities.formula_arg1(time_elapsed, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg1(parameter_2, (SubLObject)temporal_projection_cols.UNPROVIDED));
            return Numbers.multiply(upper_bound, Numbers.expt((SubLObject)temporal_projection_cols.$float114$2_71, Numbers.subtract((SubLObject)temporal_projection_cols.ZERO_INTEGER, x)));
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 135575L)
    public static SubLObject calculate_persistence_for_constant_function(final SubLObject decay_fn) {
        final SubLObject v_answer = cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const119$uniformPersistenceDistributionWit, decay_fn, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED));
        return bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, v_answer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 135814L)
    public static SubLObject calculate_persistence_for_gaussian_decay_function2(final SubLObject time_elapsed, final SubLObject decay_fn) {
        final SubLObject v_answer = cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const120$normalDistributionWithParameters, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)temporal_projection_cols.$sym29$_Y, decay_fn), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED));
        final SubLObject mean = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, v_answer);
        final SubLObject std_dev = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym29$_Y, v_answer);
        final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0(time_elapsed);
        final SubLObject mean_2 = convert_to_unit(mean, unit_of_time_elapsed);
        final SubLObject std_dev_2 = convert_to_unit(std_dev, unit_of_time_elapsed);
        if (temporal_projection_cols.NIL != mean_2 && temporal_projection_cols.NIL != std_dev_2) {
            final SubLObject x_mu = Numbers.subtract(cycl_utilities.formula_arg1(time_elapsed, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg1(mean_2, (SubLObject)temporal_projection_cols.UNPROVIDED));
            final SubLObject x_mu_div_std = Numbers.divide(x_mu, Numbers.multiply((SubLObject)temporal_projection_cols.$float121$1_414, cycl_utilities.formula_arg1(std_dev_2, (SubLObject)temporal_projection_cols.UNPROVIDED)));
            final SubLObject error_val = error_fn(x_mu_div_std);
            return Numbers.subtract((SubLObject)temporal_projection_cols.$float122$0_5, Numbers.multiply((SubLObject)temporal_projection_cols.$float122$0_5, error_val));
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 136577L)
    public static SubLObject calculate_persistence_for_gaussian_decay_function(final SubLObject time_elapsed, final SubLObject decay_fn) {
        final SubLObject v_answer = cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const120$normalDistributionWithParameters, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)temporal_projection_cols.$sym29$_Y, decay_fn), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED));
        final SubLObject mean = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, v_answer);
        final SubLObject std_dev = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym29$_Y, v_answer);
        final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0(time_elapsed);
        final SubLObject mean_2 = convert_to_unit(mean, unit_of_time_elapsed);
        final SubLObject std_dev_2 = convert_to_unit(std_dev, unit_of_time_elapsed);
        if (temporal_projection_cols.NIL != mean_2 && temporal_projection_cols.NIL != std_dev_2) {
            final SubLObject x_b = Numbers.subtract(cycl_utilities.formula_arg1(time_elapsed, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg1(mean_2, (SubLObject)temporal_projection_cols.UNPROVIDED));
            final SubLObject x_b_sq = Numbers.multiply(x_b, x_b);
            return Numbers.expt((SubLObject)temporal_projection_cols.$float114$2_71, Numbers.subtract((SubLObject)temporal_projection_cols.ZERO_INTEGER, Numbers.divide(x_b_sq, Numbers.multiply((SubLObject)temporal_projection_cols.TWO_INTEGER, cycl_utilities.formula_arg1(std_dev_2, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg1(std_dev_2, (SubLObject)temporal_projection_cols.UNPROVIDED)))));
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 137312L)
    public static SubLObject calculate_persistence_for_linear_decay_function(final SubLObject time_elapsed, final SubLObject decay_fn) {
        final SubLObject v_answer = cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const123$linearDecayFunctionWithSlope, decay_fn, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED));
        final SubLObject slope = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, v_answer);
        final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0(time_elapsed);
        final SubLObject slope_2 = convert_to_unit(slope, unit_of_time_elapsed);
        if (temporal_projection_cols.NIL != slope_2) {
            final SubLObject x = Numbers.divide(cycl_utilities.formula_arg1(time_elapsed, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg1(slope_2, (SubLObject)temporal_projection_cols.UNPROVIDED));
            return Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, x);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 137815L)
    public static SubLObject calculate_persistence_for_linearly_increasing_function(final SubLObject time_elapsed, final SubLObject decay_fn) {
        final SubLObject v_answer = cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const124$linearlyIncreasingFunctionWithSlo, decay_fn, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED));
        final SubLObject slope = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, v_answer);
        final SubLObject unit_of_time_elapsed = cycl_utilities.formula_arg0(time_elapsed);
        final SubLObject slope_2 = convert_to_unit(slope, unit_of_time_elapsed);
        if (temporal_projection_cols.NIL == slope_2) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        final SubLObject x = Numbers.divide(cycl_utilities.formula_arg1(time_elapsed, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg1(slope_2, (SubLObject)temporal_projection_cols.UNPROVIDED));
        if (x.numG((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            return (SubLObject)temporal_projection_cols.ONE_INTEGER;
        }
        return x;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 138364L)
    public static SubLObject time_falls_in_interval(final SubLObject time_1, final SubLObject time_2, final SubLObject interval, SubLObject time_elapsed) {
        if (time_elapsed == temporal_projection_cols.UNPROVIDED) {
            time_elapsed = (SubLObject)temporal_projection_cols.NIL;
        }
        final SubLObject query_answer = cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const100$intervalRange, interval, (SubLObject)temporal_projection_cols.$list27), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED));
        final SubLObject time_diff = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const21$timeElapsed, time_1, time_2, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
        final SubLObject lower = cycl_utilities.formula_args(cycl_utilities.formula_arg0(query_answer), (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject upper = cycl_utilities.formula_args(cycl_utilities.formula_arg1(query_answer, (SubLObject)temporal_projection_cols.UNPROVIDED), (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject lower_bound_test = (SubLObject)temporal_projection_cols.NIL;
        SubLObject upper_bound_test = (SubLObject)temporal_projection_cols.NIL;
        if (cycl_utilities.formula_arg1(lower, (SubLObject)temporal_projection_cols.UNPROVIDED).eql(temporal_projection_cols.$const125$MinusInfinity)) {
            lower_bound_test = (SubLObject)temporal_projection_cols.T;
        }
        if (time_1.equal(time_2) && time_diff.equal(lower)) {
            lower_bound_test = (SubLObject)temporal_projection_cols.T;
            upper_bound_test = (SubLObject)temporal_projection_cols.T;
        }
        if (cycl_utilities.formula_arg1(upper, (SubLObject)temporal_projection_cols.UNPROVIDED).eql(temporal_projection_cols.$const101$PlusInfinity)) {
            upper_bound_test = (SubLObject)temporal_projection_cols.T;
        }
        if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, time_2, time_1), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED) && (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const56$lessThan, lower, time_diff), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED) || time_diff.equal(lower))) {
            lower_bound_test = (SubLObject)temporal_projection_cols.T;
        }
        if (cycl_utilities.formula_arg1(lower, (SubLObject)temporal_projection_cols.UNPROVIDED).isNumber() && cycl_utilities.formula_arg1(lower, (SubLObject)temporal_projection_cols.UNPROVIDED).numL((SubLObject)temporal_projection_cols.ZERO_INTEGER)) {
            final SubLObject new_lower = Numbers.subtract((SubLObject)temporal_projection_cols.ZERO_INTEGER, cycl_utilities.formula_arg1(lower, (SubLObject)temporal_projection_cols.UNPROVIDED));
            if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const126$greaterThan, (SubLObject)ConsesLow.list(cycl_utilities.formula_arg0(lower), new_lower), time_diff), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                lower_bound_test = (SubLObject)temporal_projection_cols.T;
            }
        }
        if (cycl_utilities.formula_arg1(upper, (SubLObject)temporal_projection_cols.UNPROVIDED).isNumber() && cycl_utilities.formula_arg1(upper, (SubLObject)temporal_projection_cols.UNPROVIDED).numL((SubLObject)temporal_projection_cols.ZERO_INTEGER)) {
            final SubLObject new_upper = Numbers.subtract((SubLObject)temporal_projection_cols.ZERO_INTEGER, cycl_utilities.formula_arg1(upper, (SubLObject)temporal_projection_cols.UNPROVIDED));
            if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const126$greaterThan, time_diff, (SubLObject)ConsesLow.list(cycl_utilities.formula_arg0(upper), new_upper)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                upper_bound_test = (SubLObject)temporal_projection_cols.T;
            }
        }
        if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, time_2, time_1), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED) && temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const56$lessThan, time_diff, upper), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
            upper_bound_test = (SubLObject)temporal_projection_cols.T;
        }
        if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const56$lessThan, lower, time_elapsed), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED) || temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const127$equals, lower, time_elapsed), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
            lower_bound_test = (SubLObject)temporal_projection_cols.T;
        }
        if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const56$lessThan, time_elapsed, upper), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
            upper_bound_test = (SubLObject)temporal_projection_cols.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(temporal_projection_cols.NIL != lower_bound_test && temporal_projection_cols.NIL != upper_bound_test);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 141024L)
    public static SubLObject get_mt_time_for_assertion(final SubLObject fact) {
        SubLObject cdolist_list_var;
        final SubLObject assertions = cdolist_list_var = get_assertions_for_fact(fact);
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject time_for_assertion = temporal_projection.get_time_for_assertion_1(assertion);
            if (temporal_projection_cols.NIL != time_for_assertion) {
                if (cycl_utilities.formula_arg0(time_for_assertion).eql(temporal_projection_cols.$const128$SomeTimeInIntervalFn)) {
                    return cycl_utilities.formula_arg1(time_for_assertion, (SubLObject)temporal_projection_cols.UNPROVIDED);
                }
                return time_for_assertion;
            }
            else {
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 141485L)
    public static SubLObject get_time_from_ist_facts(final SubLObject fact) {
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 141798L)
    public static SubLObject get_farthest_time_for_assertion(final SubLObject fact, final SubLObject time) {
        final SubLObject list_of_times = get_list_of_times_for_assertion(fact);
        SubLObject lst_of_time_elapsed = (SubLObject)temporal_projection_cols.NIL;
        SubLObject current_best = (SubLObject)temporal_projection_cols.NIL;
        if (Sequences.length(list_of_times).numE((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            return cycl_utilities.formula_arg0(list_of_times);
        }
        SubLObject cdolist_list_var = list_of_times;
        SubLObject time_1 = (SubLObject)temporal_projection_cols.NIL;
        time_1 = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$29 = list_of_times;
            SubLObject time_2 = (SubLObject)temporal_projection_cols.NIL;
            time_2 = cdolist_list_var_$29.first();
            while (temporal_projection_cols.NIL != cdolist_list_var_$29) {
                if (!time_1.equal(time_2)) {
                    lst_of_time_elapsed = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(time_1, find_time_elapsed(time_1, time)), lst_of_time_elapsed);
                }
                cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                time_2 = cdolist_list_var_$29.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            time_1 = cdolist_list_var.first();
        }
        current_best = cycl_utilities.formula_arg0(lst_of_time_elapsed);
        cdolist_list_var = cycl_utilities.formula_args(lst_of_time_elapsed, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject entry = (SubLObject)temporal_projection_cols.NIL;
        entry = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const126$greaterThan, cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg1(current_best, (SubLObject)temporal_projection_cols.UNPROVIDED)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                current_best = entry;
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return cycl_utilities.formula_arg0(current_best);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 142561L)
    public static SubLObject get_closest_time_for_assertion(final SubLObject fact, final SubLObject time) {
        final SubLObject list_of_times = get_list_of_times_for_assertion(fact);
        SubLObject lst_of_time_elapsed = (SubLObject)temporal_projection_cols.NIL;
        SubLObject current_best = (SubLObject)temporal_projection_cols.NIL;
        if (Sequences.length(list_of_times).numE((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            return handle_time_intervals_closest(cycl_utilities.formula_arg0(list_of_times), time);
        }
        SubLObject cdolist_list_var = list_of_times;
        SubLObject time_1 = (SubLObject)temporal_projection_cols.NIL;
        time_1 = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$30 = list_of_times;
            SubLObject time_2 = (SubLObject)temporal_projection_cols.NIL;
            time_2 = cdolist_list_var_$30.first();
            while (temporal_projection_cols.NIL != cdolist_list_var_$30) {
                if (!time_1.equal(time_2)) {
                    lst_of_time_elapsed = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(time_1, find_time_elapsed(time_1, time)), lst_of_time_elapsed);
                }
                cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                time_2 = cdolist_list_var_$30.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            time_1 = cdolist_list_var.first();
        }
        current_best = cycl_utilities.formula_arg0(lst_of_time_elapsed);
        cdolist_list_var = cycl_utilities.formula_args(lst_of_time_elapsed, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject entry = (SubLObject)temporal_projection_cols.NIL;
        entry = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const56$lessThan, cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg1(current_best, (SubLObject)temporal_projection_cols.UNPROVIDED)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                current_best = entry;
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return handle_time_intervals_closest(current_best, time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 143375L)
    public static SubLObject get_closest_time_for_assertion_before_given_time(final SubLObject fact, final SubLObject time) {
        SubLObject list_of_times = get_list_of_times_for_assertion(fact);
        SubLObject current_best = (SubLObject)temporal_projection_cols.NIL;
        if (temporal_projection_cols.NIL == list_of_times) {
            list_of_times = find_list_of_starting_times(fact);
        }
        SubLObject cdolist_list_var = list_of_times;
        SubLObject x = (SubLObject)temporal_projection_cols.NIL;
        x = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, time, x), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                if (temporal_projection_cols.NIL == current_best) {
                    current_best = x;
                }
                else if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, x, current_best), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    current_best = x;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            x = cdolist_list_var.first();
        }
        return current_best;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 143940L)
    public static SubLObject get_earliest_time_for_fact(final SubLObject fact) {
        final SubLObject lst_of_times = get_list_of_times_for_assertion(fact);
        SubLObject current_best = cycl_utilities.formula_arg0(lst_of_times);
        if (Sequences.length(lst_of_times).numE((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            return cycl_utilities.formula_arg0(lst_of_times);
        }
        SubLObject cdolist_list_var = lst_of_times;
        SubLObject time = (SubLObject)temporal_projection_cols.NIL;
        time = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, current_best, time), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                current_best = time;
            }
            cdolist_list_var = cdolist_list_var.rest();
            time = cdolist_list_var.first();
        }
        return current_best;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 144368L)
    public static SubLObject handle_time_intervals_closest(final SubLObject current_best, final SubLObject time) {
        if (!current_best.isList()) {
            return current_best;
        }
        if (!cycl_utilities.formula_arg0(current_best).eql(temporal_projection_cols.$const130$TimeIntervalBetweenFn) && !cycl_utilities.formula_arg0(current_best).eql(temporal_projection_cols.$const10$TimeIntervalInclusiveFn)) {
            return current_best;
        }
        final SubLObject lower_limit = cycl_utilities.formula_arg1(current_best, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject upper_limit = cycl_utilities.formula_arg2(current_best, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject lower_limit_2 = map_indexicals_in_date(lower_limit);
        final SubLObject upper_limit_2 = map_indexicals_in_date(upper_limit);
        if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, time, upper_limit_2), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
            return upper_limit_2;
        }
        if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, lower_limit_2, time), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
            return lower_limit_2;
        }
        if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, time, lower_limit_2), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED) && temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, upper_limit_2, time), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
            return time;
        }
        return upper_limit_2;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 145302L)
    public static SubLObject map_indexicals_in_date(final SubLObject date) {
        if (date.eql(temporal_projection_cols.$const131$Now) || date.eql(temporal_projection_cols.$const132$Now_Indexical)) {
            return bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const133$indexicalReferent, date, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
        }
        return date;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 145543L)
    public static SubLObject check_fact_true_at_point(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject list_of_times = cdolist_list_var = get_list_of_times_for_assertion(fact);
        SubLObject time_1 = (SubLObject)temporal_projection_cols.NIL;
        time_1 = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject result = time_subsumes_anotherP(time_1, time);
            SubLObject justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection_cols.NIL != result) {
                final SubLObject supporting_assertion = get_assertion_for_given_fact_and_time(fact, time_1);
                if (temporal_projection_cols.NIL != supporting_assertion) {
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const11$temporallySubsumes, time_1, time), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(supporting_assertion));
                }
                return Values.values((SubLObject)temporal_projection_cols.T, justifications);
            }
            cdolist_list_var = cdolist_list_var.rest();
            time_1 = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 146288L)
    public static SubLObject check_isa_fact_false_at_point(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject list_of_cols = cdolist_list_var = isa.isa(entity, temporal_projection_cols.$const44$EverythingPSC, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject col_1 = (SubLObject)temporal_projection_cols.NIL;
        col_1 = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (temporal_projection_cols.NIL != disjoint_with.disjoint_withP(col_1, col, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                final SubLObject new_query = (SubLObject)ConsesLow.list(temporal_projection_cols.$const15$isa, entity, col_1);
                SubLObject cdolist_list_var_$31;
                final SubLObject list_of_times = cdolist_list_var_$31 = get_list_of_times_for_assertion(new_query);
                SubLObject time_1 = (SubLObject)temporal_projection_cols.NIL;
                time_1 = cdolist_list_var_$31.first();
                while (temporal_projection_cols.NIL != cdolist_list_var_$31) {
                    thread.resetMultipleValues();
                    final SubLObject result = time_subsumes_anotherP(time_1, time);
                    SubLObject justifications = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (temporal_projection_cols.NIL != result) {
                        final SubLObject supporting_assertion = get_assertion_for_given_fact_and_time(new_query, time_1);
                        if (temporal_projection_cols.NIL != supporting_assertion) {
                            justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const11$temporallySubsumes, time_1, time), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                            justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(supporting_assertion));
                        }
                        return Values.values((SubLObject)temporal_projection_cols.T, justifications);
                    }
                    cdolist_list_var_$31 = cdolist_list_var_$31.rest();
                    time_1 = cdolist_list_var_$31.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            col_1 = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 147342L)
    public static SubLObject time_subsumes_anotherP(final SubLObject time_1, final SubLObject time_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(time_1, temporal_projection_cols.$const134$TimeInterval) && time_1.isList() && cycl_utilities.formula_arg2(time_1, (SubLObject)temporal_projection_cols.UNPROVIDED).eql(temporal_projection_cols.$const131$Now)) {
            final SubLObject now_time_point = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)temporal_projection_cols.$list135, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
            if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const136$startsAfterEndingOf, now_time_point, time_2), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                thread.resetMultipleValues();
                final SubLObject result = mt_later_thanP(time_2, time_1);
                final SubLObject justifications = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection_cols.NIL != result) {
                    return Values.values((SubLObject)temporal_projection_cols.T, justifications);
                }
            }
        }
        return Values.values(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const11$temporallySubsumes, time_1, time_2), (SubLObject)temporal_projection_cols.NIL, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.UNPROVIDED), (SubLObject)temporal_projection_cols.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 148044L)
    public static SubLObject get_assertion_for_given_fact_and_time(final SubLObject fact, final SubLObject time) {
        SubLObject cdolist_list_var;
        final SubLObject assertions = cdolist_list_var = get_assertions_for_fact(fact);
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject time_for_assertion = temporal_projection.get_time_for_assertion_1(assertion);
            if (temporal_projection_cols.NIL != time_for_assertion && time_for_assertion.equal(time)) {
                return assertion;
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 148428L)
    public static SubLObject get_fact_closest_to_time_point(final SubLObject lst_of_facts_and_prob, final SubLObject time) {
        if (Sequences.length(lst_of_facts_and_prob).numE((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            return cycl_utilities.formula_arg0(lst_of_facts_and_prob);
        }
        SubLObject lst_of_times = (SubLObject)temporal_projection_cols.NIL;
        SubLObject current_best = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = lst_of_facts_and_prob;
        SubLObject fact_and_prob = (SubLObject)temporal_projection_cols.NIL;
        fact_and_prob = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject fact = cycl_utilities.formula_arg0(fact_and_prob);
            final SubLObject time_for_assertion = get_mt_time_for_assertion(fact);
            lst_of_times = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(fact_and_prob, find_time_elapsed(time_for_assertion, time)), lst_of_times);
            cdolist_list_var = cdolist_list_var.rest();
            fact_and_prob = cdolist_list_var.first();
        }
        current_best = cycl_utilities.formula_arg0(lst_of_times);
        cdolist_list_var = lst_of_times;
        SubLObject entry = (SubLObject)temporal_projection_cols.NIL;
        entry = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const56$lessThan, cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg1(current_best, (SubLObject)temporal_projection_cols.UNPROVIDED)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                current_best = entry;
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return cycl_utilities.formula_arg0(current_best);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 149188L)
    public static SubLObject get_assertion_for_binary_predicates(final SubLObject fact) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)temporal_projection_cols.$sym137$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(temporal_projection_cols.$const44$EverythingPSC, thread);
            return czer_meta.find_assertion_cycl(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 149316L)
    public static SubLObject get_assertion_for_ternary_predicates(final SubLObject pred, final SubLObject a, final SubLObject b, final SubLObject c) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject d = (SubLObject)temporal_projection_cols.NIL;
        SubLObject form = (SubLObject)temporal_projection_cols.NIL;
        if (temporal_projection_cols.NIL != nart_handles.nart_p(c)) {
            d = narts_high.nart_hl_formula(c);
        }
        else {
            d = c;
        }
        form = (SubLObject)ConsesLow.list(pred, a, b, d);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)temporal_projection_cols.$sym137$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(temporal_projection_cols.$const44$EverythingPSC, thread);
            return czer_meta.find_assertion_cycl(form, (SubLObject)temporal_projection_cols.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 149598L)
    public static SubLObject get_assertion_for_predicate_of_arity_five(final SubLObject pred, final SubLObject a, final SubLObject b, final SubLObject c, final SubLObject d, final SubLObject e) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject f = (SubLObject)temporal_projection_cols.NIL;
        SubLObject form = (SubLObject)temporal_projection_cols.NIL;
        if (temporal_projection_cols.NIL != nart_handles.nart_p(e)) {
            f = narts_high.nart_hl_formula(e);
        }
        else {
            f = e;
        }
        form = (SubLObject)ConsesLow.list(pred, a, b, c, d, f);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)temporal_projection_cols.$sym137$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(temporal_projection_cols.$const44$EverythingPSC, thread);
            return czer_meta.find_assertion_cycl(form, (SubLObject)temporal_projection_cols.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 149897L)
    public static SubLObject get_assertion_for_predicate_of_arity_four(final SubLObject pred, final SubLObject a, final SubLObject b, final SubLObject c, final SubLObject d) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject e = (SubLObject)temporal_projection_cols.NIL;
        SubLObject f = (SubLObject)temporal_projection_cols.NIL;
        SubLObject form = (SubLObject)temporal_projection_cols.NIL;
        if (temporal_projection_cols.NIL != nart_handles.nart_p(d)) {
            e = narts_high.nart_hl_formula(d);
        }
        else {
            e = d;
        }
        if (temporal_projection_cols.NIL != nart_handles.nart_p(c)) {
            f = narts_high.nart_hl_formula(c);
        }
        else {
            f = c;
        }
        form = (SubLObject)ConsesLow.list(pred, a, b, f, e);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)temporal_projection_cols.$sym137$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(temporal_projection_cols.$const44$EverythingPSC, thread);
            return czer_meta.find_assertion_cycl(form, (SubLObject)temporal_projection_cols.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 150274L)
    public static SubLObject find_assertion_for_predicate_of_arity_6(final SubLObject pred, final SubLObject a, final SubLObject b, final SubLObject c, final SubLObject d, final SubLObject e, final SubLObject f) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject g = (SubLObject)temporal_projection_cols.NIL;
        SubLObject form = (SubLObject)temporal_projection_cols.NIL;
        if (temporal_projection_cols.NIL != nart_handles.nart_p(f)) {
            g = narts_high.nart_hl_formula(f);
        }
        else {
            g = f;
        }
        form = (SubLObject)ConsesLow.list(pred, a, b, c, d, e, g);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)temporal_projection_cols.$sym137$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(temporal_projection_cols.$const44$EverythingPSC, thread);
            return czer_meta.find_assertion_cycl(form, (SubLObject)temporal_projection_cols.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 150571L)
    public static SubLObject check_always_trueP(final SubLObject fact) {
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 151762L)
    public static SubLObject check_temporal_relation_between_arguments(final SubLObject fact) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(cycl_utilities.formula_arg0(fact), temporal_projection_cols.$const144$temporalRelationBetweenArguments, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        final SubLObject arg1 = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject cdolist_list_var = all_assertions;
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject relation = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            if (relation.eql(temporal_projection_cols.$const3$temporallyIntersects)) {
                thread.resetMultipleValues();
                final SubLObject starting_date_arg2 = get_starting_date_of_concept(arg2);
                final SubLObject justification_1 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject ending_date_arg1 = get_ending_date_of_concept(arg1);
                if (temporal_projection_cols.NIL != verify_temporal_relation(temporal_projection_cols.$const62$laterThan, starting_date_arg2, ending_date_arg1)) {
                    justifications = ConsesLow.append(justifications, justification_1);
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, starting_date_arg2, ending_date_arg1), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const90$endingDate, arg1, ending_date_arg1), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    return Values.values((SubLObject)temporal_projection_cols.NIL, justifications);
                }
            }
            if (relation.eql(temporal_projection_cols.$const145$endsAfterStartingOf)) {
                thread.resetMultipleValues();
                final SubLObject ending_date_arg2 = get_ending_date_of_concept(arg1);
                final SubLObject justification_1 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject starting_date_arg3 = get_starting_date_of_concept(arg2);
                final SubLObject justification_2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection_cols.NIL != verify_temporal_relation(temporal_projection_cols.$const62$laterThan, starting_date_arg3, ending_date_arg2)) {
                    justifications = ConsesLow.append(justifications, justification_1);
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, starting_date_arg3, ending_date_arg2), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    justifications = ConsesLow.append(justifications, justification_2);
                    return Values.values((SubLObject)temporal_projection_cols.NIL, justifications);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 154065L)
    public static SubLObject check_starting_times(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.formula_arg0(fact);
        if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(predicate, temporal_projection_cols.$const146$FutureTensePredicate)) {
            return (SubLObject)temporal_projection_cols.T;
        }
        thread.resetMultipleValues();
        final SubLObject result = check_temporal_relation_between_arguments(fact);
        final SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL == result) {
            return Values.values(result, justifications);
        }
        SubLObject cdolist_list_var = cycl_utilities.formula_args(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject concept = (SubLObject)temporal_projection_cols.NIL;
        concept = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject starting_time = get_starting_date_of_concept(concept);
            if (temporal_projection_cols.NIL != starting_time && temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const136$startsAfterEndingOf, starting_time, time), (SubLObject)temporal_projection_cols.NIL, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue(ConsesLow.append(temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread), plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const50$startingDate, concept, starting_time), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread))), thread);
                temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue(ConsesLow.append(temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread), plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const136$startsAfterEndingOf, starting_time, time), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread))), thread);
                return (SubLObject)temporal_projection_cols.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            concept = cdolist_list_var.first();
        }
        if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(predicate, temporal_projection_cols.$const147$CoexistingObjectsPredicate)) {
            cdolist_list_var = cycl_utilities.formula_args(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
            concept = (SubLObject)temporal_projection_cols.NIL;
            concept = cdolist_list_var.first();
            while (temporal_projection_cols.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$32 = isa.isa(concept, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
                SubLObject col = (SubLObject)temporal_projection_cols.NIL;
                col = cdolist_list_var_$32.first();
                while (temporal_projection_cols.NIL != cdolist_list_var_$32) {
                    final SubLObject starting_time2 = get_starting_date_of_concept(col);
                    if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const136$startsAfterEndingOf, starting_time2, time), (SubLObject)temporal_projection_cols.NIL, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                        temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue(ConsesLow.append(temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread), plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.listS(temporal_projection_cols.$const15$isa, predicate, (SubLObject)temporal_projection_cols.$list148), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread))), thread);
                        temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue(ConsesLow.append(temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread), plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const15$isa, concept, col), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread))), thread);
                        temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue(ConsesLow.append(temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread), plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const149$earliestDateForCollectionMembers, col, starting_time2), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread))), thread);
                        temporal_projection_cols.$temporal_projection_justifications$.setDynamicValue(ConsesLow.append(temporal_projection_cols.$temporal_projection_justifications$.getDynamicValue(thread), plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const136$startsAfterEndingOf, starting_time2, time), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread))), thread);
                        return (SubLObject)temporal_projection_cols.NIL;
                    }
                    cdolist_list_var_$32 = cdolist_list_var_$32.rest();
                    col = cdolist_list_var_$32.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                concept = cdolist_list_var.first();
            }
        }
        return (SubLObject)temporal_projection_cols.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 156278L)
    public static SubLObject check_ending_times(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(cycl_utilities.formula_arg0(fact), temporal_projection_cols.$const146$FutureTensePredicate)) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), temporal_projection_cols.$const150$Date)) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED), temporal_projection_cols.$const134$TimeInterval)) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        final SubLObject concept = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject pred = cycl_utilities.formula_arg0(fact);
        final SubLObject arg_2 = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject arg_cons = get_arg_cons_for_pos(pred, (SubLObject)temporal_projection_cols.ONE_INTEGER);
        final SubLObject arg_cons_2 = get_arg_cons_for_pos(pred, (SubLObject)temporal_projection_cols.TWO_INTEGER);
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        final SubLObject ending_time_2 = get_ending_date_of_concept(arg_2);
        final SubLObject ending_time = get_ending_date_of_concept(concept);
        if (temporal_projection_cols.NIL != arg_cons && temporal_projection_cols.NIL != genls.genlP(arg_cons, temporal_projection_cols.$const151$BiologicalLivingObject, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
            if (temporal_projection_cols.NIL != ending_time && temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const136$startsAfterEndingOf, time, ending_time), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const136$startsAfterEndingOf, time, ending_time), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const90$endingDate, concept, ending_time), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const152$argIsa, pred, (SubLObject)temporal_projection_cols.ONE_INTEGER, arg_cons), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.listS(temporal_projection_cols.$const153$genls, arg_cons, (SubLObject)temporal_projection_cols.$list154), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                return Values.values((SubLObject)temporal_projection_cols.T, justifications);
            }
            thread.resetMultipleValues();
            final SubLObject result = use_conditional_likelihood((SubLObject)ConsesLow.list(temporal_projection_cols.$const15$isa, concept, arg_cons), time);
            SubLObject justification_1 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection_cols.NIL != result && result.numE((SubLObject)temporal_projection_cols.ZERO_INTEGER)) {
                justification_1 = ConsesLow.append(justification_1, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const152$argIsa, pred, (SubLObject)temporal_projection_cols.ONE_INTEGER, arg_cons), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                return Values.values(result, justification_1);
            }
        }
        if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(pred, temporal_projection_cols.$const147$CoexistingObjectsPredicate)) {
            if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(concept, temporal_projection_cols.$const151$BiologicalLivingObject)) {
                if (temporal_projection_cols.NIL != ending_time && temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const136$startsAfterEndingOf, time, ending_time), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const136$startsAfterEndingOf, time, ending_time), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const90$endingDate, concept, ending_time), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.listS(temporal_projection_cols.$const15$isa, pred, (SubLObject)temporal_projection_cols.$list148), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    return Values.values((SubLObject)temporal_projection_cols.T, justifications);
                }
                thread.resetMultipleValues();
                final SubLObject result = get_persistence_likelihood_for_fact_at_time((SubLObject)ConsesLow.listS(temporal_projection_cols.$const15$isa, concept, (SubLObject)temporal_projection_cols.$list154), time, (SubLObject)temporal_projection_cols.T, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.T, (SubLObject)temporal_projection_cols.UNPROVIDED);
                SubLObject justification_2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection_cols.NIL != result && cycl_utilities.formula_arg1(result, (SubLObject)temporal_projection_cols.UNPROVIDED).numE((SubLObject)temporal_projection_cols.ZERO_INTEGER)) {
                    justification_2 = ConsesLow.append(justification_2, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.listS(temporal_projection_cols.$const15$isa, pred, (SubLObject)temporal_projection_cols.$list148), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    return Values.values(result, justification_2);
                }
            }
            if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(arg_2, temporal_projection_cols.$const151$BiologicalLivingObject)) {
                if (temporal_projection_cols.NIL != ending_time_2 && temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const136$startsAfterEndingOf, time, ending_time_2), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const136$startsAfterEndingOf, time, ending_time_2), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const90$endingDate, arg_2, ending_time_2), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.listS(temporal_projection_cols.$const15$isa, pred, (SubLObject)temporal_projection_cols.$list148), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    return Values.values((SubLObject)temporal_projection_cols.T, justifications);
                }
                thread.resetMultipleValues();
                final SubLObject result = get_persistence_likelihood_for_fact_at_time((SubLObject)ConsesLow.listS(temporal_projection_cols.$const15$isa, arg_2, (SubLObject)temporal_projection_cols.$list154), time, (SubLObject)temporal_projection_cols.T, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.T, (SubLObject)temporal_projection_cols.UNPROVIDED);
                SubLObject justification_3 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection_cols.NIL != result && cycl_utilities.formula_arg1(result, (SubLObject)temporal_projection_cols.UNPROVIDED).numE((SubLObject)temporal_projection_cols.ZERO_INTEGER)) {
                    justification_3 = ConsesLow.append(justification_3, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.listS(temporal_projection_cols.$const15$isa, pred, (SubLObject)temporal_projection_cols.$list148), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    return Values.values(result, justification_3);
                }
            }
        }
        if (temporal_projection_cols.NIL != arg_cons_2 && temporal_projection_cols.NIL != genls.genlP(arg_cons_2, temporal_projection_cols.$const151$BiologicalLivingObject, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
            if (temporal_projection_cols.NIL != ending_time_2 && temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const136$startsAfterEndingOf, time, ending_time_2), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const136$startsAfterEndingOf, time, ending_time_2), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const90$endingDate, arg_2, ending_time_2), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const152$argIsa, pred, (SubLObject)temporal_projection_cols.TWO_INTEGER, arg_cons_2), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.listS(temporal_projection_cols.$const153$genls, arg_cons_2, (SubLObject)temporal_projection_cols.$list154), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                return Values.values((SubLObject)temporal_projection_cols.T, justifications);
            }
            thread.resetMultipleValues();
            final SubLObject result = use_conditional_likelihood((SubLObject)ConsesLow.list(temporal_projection_cols.$const15$isa, arg_2, arg_cons_2), time);
            SubLObject justification_4 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection_cols.NIL != result) {
                justification_4 = ConsesLow.append(justification_4, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const152$argIsa, pred, (SubLObject)temporal_projection_cols.TWO_INTEGER, arg_cons_2), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                return Values.values(result, justification_4);
            }
        }
        if (pred.eql(temporal_projection_cols.$const15$isa) && temporal_projection_cols.NIL != genls.genlP(arg_2, temporal_projection_cols.$const151$BiologicalLivingObject, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED) && temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, time, ending_time), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
            justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, time, ending_time), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
            justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.listS(temporal_projection_cols.$const153$genls, arg_2, (SubLObject)temporal_projection_cols.$list154), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
            justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const90$endingDate, concept, ending_time), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
            return Values.values((SubLObject)temporal_projection_cols.T, justifications);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 162749L)
    public static SubLObject get_arg_cons_for_pos(final SubLObject pred, final SubLObject pos) {
        return bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const152$argIsa, pred, pos, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 162889L)
    public static SubLObject get_starting_date_of_concept(final SubLObject concept) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject birth_date = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const50$startingDate, concept, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.NIL, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.UNPROVIDED)));
        if (temporal_projection_cols.NIL != birth_date) {
            return Values.values(birth_date, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.listS(temporal_projection_cols.$const50$startingDate, concept, (SubLObject)temporal_projection_cols.$list40), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
        }
        SubLObject cdolist_list_var = isa.isa(concept, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject col = (SubLObject)temporal_projection_cols.NIL;
        col = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
            final SubLObject result = get_date_for_earliest_collection_members(col);
            if (temporal_projection_cols.NIL != result) {
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const15$isa, concept, col), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const149$earliestDateForCollectionMembers, col, result), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                return Values.values(result, justifications);
            }
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 163760L)
    public static SubLObject get_ending_date_of_concept(final SubLObject concept) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ending_date = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const90$endingDate, concept, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
        if (temporal_projection_cols.NIL != ending_date) {
            return Values.values(ending_date, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const90$endingDate, concept, ending_date), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 164083L)
    public static SubLObject find_time_elapsed(final SubLObject time_1, final SubLObject time_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject result = find_time_elapsed_for_indeterminate_terms(time_1, time_2);
        final SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_cols.NIL != result) {
            return Values.values(result, justifications);
        }
        if (temporal_projection_cols.NIL == isa.isa_in_any_mtP(time_1, temporal_projection_cols.$const150$Date) && temporal_projection_cols.NIL != isa.isa_in_any_mtP(time_1, temporal_projection_cols.$const134$TimeInterval)) {
            final SubLObject lower = map_indexicals_in_date(cycl_utilities.formula_arg1(time_1, (SubLObject)temporal_projection_cols.UNPROVIDED));
            final SubLObject upper = map_indexicals_in_date(cycl_utilities.formula_arg2(time_1, (SubLObject)temporal_projection_cols.UNPROVIDED));
            if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, time_2, upper), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                return bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const21$timeElapsed, upper, time_2, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
            }
            if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, lower, time_2), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                return bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const21$timeElapsed, lower, time_2, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
            }
        }
        if (temporal_projection_cols.NIL == isa.isa_in_any_mtP(time_2, temporal_projection_cols.$const150$Date) && temporal_projection_cols.NIL != isa.isa_in_any_mtP(time_2, temporal_projection_cols.$const134$TimeInterval)) {
            final SubLObject lower = map_indexicals_in_date(cycl_utilities.formula_arg1(time_2, (SubLObject)temporal_projection_cols.UNPROVIDED));
            final SubLObject upper = map_indexicals_in_date(cycl_utilities.formula_arg2(time_2, (SubLObject)temporal_projection_cols.UNPROVIDED));
            if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, time_1, upper), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                return bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const21$timeElapsed, upper, time_1, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
            }
            if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, lower, time_1), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                return bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const21$timeElapsed, lower, time_1, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
            }
        }
        return bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const21$timeElapsed, time_1, time_2, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 165595L)
    public static SubLObject find_time_elapsed_for_indeterminate_terms(final SubLObject time_1, final SubLObject time_2) {
        if (temporal_projection_cols.NIL == mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const155$quotedIsa, time_1, (SubLObject)temporal_projection_cols.$list156), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED) && temporal_projection_cols.NIL == mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const155$quotedIsa, time_2, (SubLObject)temporal_projection_cols.$list156), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        final SubLObject v_answer = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const157$valueEquals, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const158$TimeElapsedFn, time_2, time_1)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
        if (temporal_projection_cols.NIL == v_answer) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        final SubLObject supporting_assertion = czer_meta.find_assertion_cycl((SubLObject)ConsesLow.list(temporal_projection_cols.$const157$valueEquals, v_answer, (SubLObject)ConsesLow.list(temporal_projection_cols.$const158$TimeElapsedFn, time_2, time_1)), (SubLObject)temporal_projection_cols.UNPROVIDED);
        if (temporal_projection_cols.NIL != supporting_assertion) {
            return Values.values(v_answer, (SubLObject)ConsesLow.list(supporting_assertion));
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 166244L)
    public static SubLObject mt_later_thanP(final SubLObject time_1, final SubLObject time_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Values.values(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, time_1, time_2), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED), plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, time_1, time_2), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 166464L)
    public static SubLObject at_least_one_point_is_later_thanP(final SubLObject time_1, final SubLObject time_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(time_1, temporal_projection_cols.$const150$Date)) {
            return mt_later_thanP(time_1, time_2);
        }
        if (time_1.isList()) {
            final SubLObject upper = cycl_utilities.formula_arg2(time_1, (SubLObject)temporal_projection_cols.UNPROVIDED);
            SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
            final SubLObject function = cycl_utilities.formula_arg0(time_1);
            if ((function.eql(temporal_projection_cols.$const130$TimeIntervalBetweenFn) || function.eql(temporal_projection_cols.$const10$TimeIntervalInclusiveFn)) && temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, upper, time_2), (SubLObject)temporal_projection_cols.NIL, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, upper, time_2), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                return Values.values((SubLObject)temporal_projection_cols.T, justifications);
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 167196L)
    public static SubLObject at_least_one_point_is_before_thanP(final SubLObject time_1, final SubLObject time_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(time_1, temporal_projection_cols.$const150$Date)) {
            return mt_later_thanP(time_2, time_1);
        }
        if (time_1.isList()) {
            final SubLObject lower = cycl_utilities.formula_arg1(time_1, (SubLObject)temporal_projection_cols.UNPROVIDED);
            SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
            final SubLObject function = cycl_utilities.formula_arg0(time_1);
            if ((function.eql(temporal_projection_cols.$const130$TimeIntervalBetweenFn) || function.eql(temporal_projection_cols.$const10$TimeIntervalInclusiveFn)) && temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, time_2, lower), (SubLObject)temporal_projection_cols.NIL, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, time_2, lower), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                return Values.values((SubLObject)temporal_projection_cols.T, justifications);
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 167920L)
    public static SubLObject all_points_are_before_thanP(final SubLObject time_1, final SubLObject time_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(time_1, temporal_projection_cols.$const150$Date)) {
            return mt_later_thanP(time_2, time_1);
        }
        if (time_1.isList()) {
            final SubLObject upper = map_indexicals_in_date(cycl_utilities.formula_arg2(time_1, (SubLObject)temporal_projection_cols.UNPROVIDED));
            if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, time_2, upper), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                justifications = plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, time_2, upper), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread));
                return Values.values((SubLObject)temporal_projection_cols.T, justifications);
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 168466L)
    public static SubLObject all_points_are_after_thanP(final SubLObject time_1, final SubLObject time_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(time_1, temporal_projection_cols.$const150$Date)) {
            return mt_later_thanP(time_1, time_2);
        }
        if (time_1.isList()) {
            final SubLObject lower = map_indexicals_in_date(cycl_utilities.formula_arg1(time_1, (SubLObject)temporal_projection_cols.UNPROVIDED));
            if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, lower, time_2), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                justifications = plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, lower, time_2), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread));
                return Values.values((SubLObject)temporal_projection_cols.T, justifications);
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 169010L)
    public static SubLObject get_last_time_point_of(final SubLObject time) {
        if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(time, temporal_projection_cols.$const150$Date)) {
            return time;
        }
        if (time.isList()) {
            final SubLObject function = cycl_utilities.formula_arg0(time);
            if (function.eql(temporal_projection_cols.$const10$TimeIntervalInclusiveFn) || function.eql(temporal_projection_cols.$const130$TimeIntervalBetweenFn)) {
                final SubLObject ret_value = cycl_utilities.formula_arg2(time, (SubLObject)temporal_projection_cols.UNPROVIDED);
                if (ret_value.eql(temporal_projection_cols.$const131$Now)) {
                    return bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)temporal_projection_cols.$list135, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
                }
                return ret_value;
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 169555L)
    public static SubLObject verify_temporal_relation(final SubLObject relation, final SubLObject time_1, final SubLObject time_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(time_1, temporal_projection_cols.$const150$Date) && temporal_projection_cols.NIL != isa.isa_in_any_mtP(time_2, temporal_projection_cols.$const150$Date)) {
            final SubLObject v_answer = mt_context.ask_mt_query((SubLObject)ConsesLow.list(relation, time_1, time_2), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
            if (temporal_projection_cols.NIL != v_answer) {
                return Values.values((SubLObject)temporal_projection_cols.T, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(relation, time_1, time_2), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
            }
        }
        if (relation.eql(temporal_projection_cols.$const62$laterThan)) {
            final SubLObject time_3 = get_first_time_point_of(time_1);
            final SubLObject time_4 = get_last_time_point_of(time_2);
            final SubLObject v_answer2 = mt_context.ask_mt_query((SubLObject)ConsesLow.list(relation, time_3, time_4), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
            if (temporal_projection_cols.NIL != v_answer2) {
                return Values.values((SubLObject)temporal_projection_cols.T, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(relation, time_3, time_4), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 170281L)
    public static SubLObject get_first_time_point_of(final SubLObject time) {
        if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(time, temporal_projection_cols.$const150$Date)) {
            return time;
        }
        if (time.isList()) {
            final SubLObject function = cycl_utilities.formula_arg0(time);
            if (function.eql(temporal_projection_cols.$const10$TimeIntervalInclusiveFn) || function.eql(temporal_projection_cols.$const130$TimeIntervalBetweenFn)) {
                return cycl_utilities.formula_arg1(time, (SubLObject)temporal_projection_cols.UNPROVIDED);
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 170633L)
    public static SubLObject convert_to_unit(final SubLObject scalar, final SubLObject unit) {
        return quantities.convert_quantity(unit, scalar);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 171064L)
    public static SubLObject error_fn(final SubLObject var1) {
        SubLObject var2 = (SubLObject)temporal_projection_cols.ZERO_INTEGER;
        if (var1.numG((SubLObject)temporal_projection_cols.ZERO_INTEGER)) {
            var2 = var1;
        }
        if (var1.numL((SubLObject)temporal_projection_cols.ZERO_INTEGER)) {
            var2 = Numbers.subtract((SubLObject)temporal_projection_cols.ZERO_INTEGER, var1);
        }
        final SubLObject a1x = Numbers.multiply((SubLObject)temporal_projection_cols.$float160$0_278, var2);
        final SubLObject a2x2 = Numbers.multiply((SubLObject)temporal_projection_cols.$float161$0_23, var2, var2);
        final SubLObject a3x3 = Numbers.multiply(new SubLObject[] { temporal_projection_cols.$float162$8_999999999999999e_4, var2, var2, var2 });
        final SubLObject a4x4 = Numbers.multiply(new SubLObject[] { temporal_projection_cols.$float163$0_078, var2, var2, var2, var2 });
        final SubLObject sum = Numbers.add(new SubLObject[] { temporal_projection_cols.ONE_INTEGER, a1x, a2x2, a3x3, a4x4 });
        final SubLObject reci = Numbers.divide((SubLObject)temporal_projection_cols.ONE_INTEGER, Numbers.multiply(new SubLObject[] { sum, sum, sum, sum }));
        if (var1.numG((SubLObject)temporal_projection_cols.ZERO_INTEGER)) {
            return Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, reci);
        }
        return Numbers.subtract(reci, (SubLObject)temporal_projection_cols.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 171521L)
    public static SubLObject find_list_of_starting_times(final SubLObject fact) {
        final SubLObject all_times = mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const1$startingPointOfIntervalForSentenc, fact, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject results = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = all_times;
        SubLObject time = (SubLObject)temporal_projection_cols.NIL;
        time = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            results = (SubLObject)ConsesLow.cons(cycl_utilities.formula_args(cycl_utilities.formula_arg0(time), (SubLObject)temporal_projection_cols.UNPROVIDED), results);
            cdolist_list_var = cdolist_list_var.rest();
            time = cdolist_list_var.first();
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 171798L)
    public static SubLObject find_list_of_ending_times(final SubLObject fact) {
        final SubLObject all_times = mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const2$endingPointOfIntervalForSentence, fact, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject results = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = all_times;
        SubLObject time = (SubLObject)temporal_projection_cols.NIL;
        time = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            results = (SubLObject)ConsesLow.cons(cycl_utilities.formula_args(cycl_utilities.formula_arg0(time), (SubLObject)temporal_projection_cols.UNPROVIDED), results);
            cdolist_list_var = cdolist_list_var.rest();
            time = cdolist_list_var.first();
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 172067L)
    public static SubLObject find_closest_time_after(final SubLObject time, final SubLObject list_of_times) {
        SubLObject current_best = cycl_utilities.formula_arg0(list_of_times);
        SubLObject cdolist_list_var = cycl_utilities.formula_args(list_of_times, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject entry = (SubLObject)temporal_projection_cols.NIL;
        entry = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, entry, time), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED) && temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, current_best, entry), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                current_best = entry;
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, current_best, time), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
            return current_best;
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 172526L)
    public static SubLObject find_closest_time_before(final SubLObject time, final SubLObject list_of_times) {
        SubLObject current_best = cycl_utilities.formula_arg0(list_of_times);
        SubLObject cdolist_list_var = cycl_utilities.formula_args(list_of_times, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject entry = (SubLObject)temporal_projection_cols.NIL;
        entry = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, time, entry), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED) && (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, entry, current_best), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED) || temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, current_best, time), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED))) {
                current_best = entry;
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, time, current_best), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
            return current_best;
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 173058L)
    public static SubLObject create_timeline_for_assertion(final SubLObject fact) {
        final SubLObject starting_points = find_list_of_starting_times(fact);
        final SubLObject ending_points = find_list_of_ending_times(fact);
        SubLObject lst = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = starting_points;
        SubLObject entry = (SubLObject)temporal_projection_cols.NIL;
        entry = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            lst = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(entry, (SubLObject)temporal_projection_cols.$sym9$S), lst);
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        cdolist_list_var = ending_points;
        entry = (SubLObject)temporal_projection_cols.NIL;
        entry = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            lst = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(entry, (SubLObject)temporal_projection_cols.$sym8$E), lst);
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return Sort.sort(lst, Symbols.symbol_function((SubLObject)temporal_projection_cols.$sym20$LIST_TIME_COMPARATOR), (SubLObject)temporal_projection_cols.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 173446L)
    public static SubLObject check_boundary_conditions(final SubLObject fact, final SubLObject time, final SubLObject time_line) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = time_line;
        SubLObject entry = (SubLObject)temporal_projection_cols.NIL;
        entry = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const11$temporallySubsumes, cycl_utilities.formula_arg0(entry), time), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const11$temporallySubsumes, cycl_utilities.formula_arg0(entry), time), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                if (cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection_cols.UNPROVIDED).eql((SubLObject)temporal_projection_cols.$sym9$S)) {
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const164$startingPointOfSubIntervalForAsse, fact, time), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    return Values.values(narts_high.find_nart(temporal_projection_cols.$uniform_distribution_with_value_one$.getDynamicValue(thread)), (SubLObject)temporal_projection_cols.NIL, justifications);
                }
                if (cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection_cols.UNPROVIDED).eql((SubLObject)temporal_projection_cols.$sym8$E)) {
                    justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const165$endingPointOfSubIntervalForAssert, fact, time), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                    return Values.values(narts_high.find_nart(temporal_projection_cols.$uniform_distribution_with_value_zero$.getDynamicValue(thread)), (SubLObject)temporal_projection_cols.NIL, justifications);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 174468L)
    public static SubLObject find_closest_time_around_time_point(final SubLObject time, final SubLObject time_line) {
        SubLObject prev = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = time_line;
        SubLObject entry = (SubLObject)temporal_projection_cols.NIL;
        entry = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, cycl_utilities.formula_arg0(entry), time), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                return Values.values(prev, entry);
            }
            prev = entry;
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return Values.values(prev, (SubLObject)temporal_projection_cols.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 174769L)
    public static SubLObject find_most_specific_assertion(final SubLObject set_of_all_consistent_assertions) {
        if (Sequences.length(set_of_all_consistent_assertions).numE((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            return cycl_utilities.formula_arg0(set_of_all_consistent_assertions);
        }
        SubLObject rejected = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = set_of_all_consistent_assertions;
        SubLObject assertion_1 = (SubLObject)temporal_projection_cols.NIL;
        assertion_1 = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$33 = set_of_all_consistent_assertions;
            SubLObject assertion_2 = (SubLObject)temporal_projection_cols.NIL;
            assertion_2 = cdolist_list_var_$33.first();
            while (temporal_projection_cols.NIL != cdolist_list_var_$33) {
                final SubLObject gaf_1 = assertions_high.gaf_formula(assertion_1);
                final SubLObject gaf_2 = assertions_high.gaf_formula(assertion_2);
                if (!gaf_1.equal(gaf_2)) {
                    final SubLObject col_1 = cycl_utilities.formula_arg2(gaf_1, (SubLObject)temporal_projection_cols.UNPROVIDED);
                    final SubLObject col_2 = cycl_utilities.formula_arg2(gaf_2, (SubLObject)temporal_projection_cols.UNPROVIDED);
                    if (temporal_projection_cols.NIL != genls.genlP(col_1, col_2, temporal_projection_cols.$const44$EverythingPSC, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                        rejected = (SubLObject)ConsesLow.cons(assertion_2, rejected);
                    }
                }
                cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                assertion_2 = cdolist_list_var_$33.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion_1 = cdolist_list_var.first();
        }
        cdolist_list_var = set_of_all_consistent_assertions;
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (temporal_projection_cols.NIL == conses_high.member(assertion, rejected, Symbols.symbol_function((SubLObject)temporal_projection_cols.EQUAL), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                return assertion;
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 175616L)
    public static SubLObject find_persistence_by_combining_evidence(final SubLObject lst_of_distributions) {
        SubLObject result = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = lst_of_distributions;
        SubLObject entry = (SubLObject)temporal_projection_cols.NIL;
        entry = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(calculate_persistence_likelihood(cycl_utilities.formula_arg0(entry), cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection_cols.UNPROVIDED)), result);
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return combined_evidence_for_persistence(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 175917L)
    public static SubLObject combined_evidence_for_persistence(final SubLObject lst) {
        if (temporal_projection_cols.NIL == lst) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        final SubLObject product = Sequences.creduce(Symbols.symbol_function((SubLObject)temporal_projection_cols.$sym166$_), lst, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject product_of_complements = Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, cycl_utilities.formula_arg0(lst));
        SubLObject cdolist_list_var = cycl_utilities.formula_args(lst, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject x = (SubLObject)temporal_projection_cols.NIL;
        x = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            product_of_complements = Numbers.multiply(product_of_complements, Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, x));
            cdolist_list_var = cdolist_list_var.rest();
            x = cdolist_list_var.first();
        }
        return Numbers.divide(product, Numbers.add(product, product_of_complements));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 176277L)
    public static SubLObject check_whether_fact_satisfies_constraints(final SubLObject bindings_list, final SubLObject constraint) {
        final SubLObject unwrapped_quotes = cycl_utilities.formula_arg0(cycl_utilities.formula_args(constraint, (SubLObject)temporal_projection_cols.UNPROVIDED));
        SubLObject lst_of_constraints = (SubLObject)temporal_projection_cols.NIL;
        SubLObject conditions_satisfied = (SubLObject)temporal_projection_cols.T;
        if (cycl_utilities.formula_arg0(unwrapped_quotes).eql(temporal_projection_cols.$const167$and)) {
            lst_of_constraints = cycl_utilities.formula_args(unwrapped_quotes, (SubLObject)temporal_projection_cols.UNPROVIDED);
        }
        else {
            lst_of_constraints = unwrapped_quotes;
        }
        SubLObject cdolist_list_var = lst_of_constraints;
        SubLObject cons = (SubLObject)temporal_projection_cols.NIL;
        cons = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (cycl_utilities.formula_arg0(cons).eql(temporal_projection_cols.$const15$isa) && temporal_projection_cols.NIL == check_isa_constraint(cons, bindings_list)) {
                conditions_satisfied = (SubLObject)temporal_projection_cols.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return conditions_satisfied;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 176899L)
    public static SubLObject find_assertion_matching_conditions_in_conseq(final SubLObject conditions, final SubLObject bindings_list) {
        SubLObject lst_of_constraints = (SubLObject)temporal_projection_cols.NIL;
        SubLObject arg2 = (SubLObject)temporal_projection_cols.NIL;
        SubLObject arg3 = (SubLObject)temporal_projection_cols.NIL;
        final SubLObject unwrapped_quotes = cycl_utilities.formula_arg0(cycl_utilities.formula_args(conditions, (SubLObject)temporal_projection_cols.UNPROVIDED));
        if (cycl_utilities.formula_arg0(unwrapped_quotes).eql(temporal_projection_cols.$const167$and)) {
            lst_of_constraints = cycl_utilities.formula_args(unwrapped_quotes, (SubLObject)temporal_projection_cols.UNPROVIDED);
        }
        else {
            lst_of_constraints = unwrapped_quotes;
        }
        SubLObject cdolist_list_var = lst_of_constraints;
        SubLObject cons = (SubLObject)temporal_projection_cols.NIL;
        cons = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (!cycl_utilities.formula_arg0(cons).eql(temporal_projection_cols.$const15$isa)) {
                final SubLObject arg1_now = cycl_utilities.formula_arg1(cons, (SubLObject)temporal_projection_cols.UNPROVIDED);
                final SubLObject arg2_now = cycl_utilities.formula_arg2(cons, (SubLObject)temporal_projection_cols.UNPROVIDED);
                SubLObject query = (SubLObject)temporal_projection_cols.NIL;
                SubLObject final_query = (SubLObject)temporal_projection_cols.NIL;
                final SubLObject pred = cycl_utilities.formula_arg0(cons);
                SubLObject result = (SubLObject)temporal_projection_cols.NIL;
                SubLObject vars_with_no_bindings = (SubLObject)temporal_projection_cols.NIL;
                if (temporal_projection_cols.NIL != collection_defns.el_variableP(arg1_now)) {
                    arg3 = get_binding_for_variable(arg1_now, bindings_list);
                }
                else {
                    arg3 = arg1_now;
                }
                if (temporal_projection_cols.NIL == arg3) {
                    arg3 = arg1_now;
                    vars_with_no_bindings = (SubLObject)ConsesLow.cons(arg3, vars_with_no_bindings);
                }
                if (temporal_projection_cols.NIL != collection_defns.el_variableP(arg2_now)) {
                    arg2 = get_binding_for_variable(arg2_now, bindings_list);
                }
                else {
                    arg2 = arg2_now;
                }
                if (temporal_projection_cols.NIL == arg2) {
                    arg2 = arg2_now;
                    vars_with_no_bindings = (SubLObject)ConsesLow.cons(arg2, vars_with_no_bindings);
                }
                query = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(pred, arg3, arg2));
                SubLObject cdolist_list_var_$34 = vars_with_no_bindings;
                SubLObject var = (SubLObject)temporal_projection_cols.NIL;
                var = cdolist_list_var_$34.first();
                while (temporal_projection_cols.NIL != cdolist_list_var_$34) {
                    final SubLObject new_constraint = find_constraints_for_variable_from_conditions(var, lst_of_constraints);
                    if (temporal_projection_cols.NIL != new_constraint) {
                        query = ConsesLow.append(query, new_constraint);
                    }
                    cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                    var = cdolist_list_var_$34.first();
                }
                if (Sequences.length(query).numE((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                    final_query = cycl_utilities.formula_arg0(query);
                }
                else {
                    final_query = query;
                    final_query = (SubLObject)ConsesLow.cons(temporal_projection_cols.$const167$and, final_query);
                }
                SubLObject cdolist_list_var_$35 = mt_context.ask_mt_query(final_query, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED);
                SubLObject v_answer = (SubLObject)temporal_projection_cols.NIL;
                v_answer = cdolist_list_var_$35.first();
                while (temporal_projection_cols.NIL != cdolist_list_var_$35) {
                    SubLObject cdolist_list_var_$36 = vars_with_no_bindings;
                    SubLObject var2 = (SubLObject)temporal_projection_cols.NIL;
                    var2 = cdolist_list_var_$36.first();
                    while (temporal_projection_cols.NIL != cdolist_list_var_$36) {
                        final SubLObject var_value = bindings.variable_lookup(var2, v_answer);
                        if (var2.eql(arg1_now)) {
                            arg3 = var_value;
                        }
                        if (var2.eql(arg2_now)) {
                            arg2 = var_value;
                        }
                        result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(pred, arg3, arg2), result);
                        cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                        var2 = cdolist_list_var_$36.first();
                    }
                    cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                    v_answer = cdolist_list_var_$35.first();
                }
                return result;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 179139L)
    public static SubLObject find_constraints_for_variable_from_conditions(final SubLObject var, final SubLObject conditions) {
        SubLObject results = (SubLObject)temporal_projection_cols.NIL;
        SubLObject cdolist_list_var = conditions;
        SubLObject cons = (SubLObject)temporal_projection_cols.NIL;
        cons = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (cycl_utilities.formula_arg0(cons).eql(temporal_projection_cols.$const15$isa) && temporal_projection_cols.NIL != conses_high.member(var, cons, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                results = (SubLObject)ConsesLow.cons(cons, results);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 179418L)
    public static SubLObject check_isa_constraint(final SubLObject cons, final SubLObject bindings_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.formula_arg1(cons, (SubLObject)temporal_projection_cols.UNPROVIDED);
        if (temporal_projection_cols.NIL != collection_defns.el_variableP(arg1)) {
            final SubLObject binding = get_binding_for_variable(arg1, bindings_list);
            if (temporal_projection_cols.NIL != binding && temporal_projection_cols.NIL != isa.isaP(binding, cycl_utilities.formula_arg2(cons, (SubLObject)temporal_projection_cols.UNPROVIDED), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                return (SubLObject)temporal_projection_cols.T;
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 179769L)
    public static SubLObject get_binding_for_variable(final SubLObject var, final SubLObject bindings_list) {
        SubLObject cdolist_list_var = bindings_list;
        SubLObject pair = (SubLObject)temporal_projection_cols.NIL;
        pair = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (var.eql(cycl_utilities.formula_arg0(pair))) {
                return cycl_utilities.formula_arg1(pair, (SubLObject)temporal_projection_cols.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 179946L)
    public static SubLObject get_list_of_bindings_for_cons(final SubLObject cons, final SubLObject fact) {
        final SubLObject unwrapped = cycl_utilities.formula_arg0(cycl_utilities.formula_args(cons, (SubLObject)temporal_projection_cols.UNPROVIDED));
        SubLObject lst_of_cons = (SubLObject)temporal_projection_cols.NIL;
        SubLObject result = (SubLObject)temporal_projection_cols.NIL;
        if (cycl_utilities.formula_arg0(unwrapped).eql(temporal_projection_cols.$const167$and)) {
            lst_of_cons = cycl_utilities.formula_args(unwrapped, (SubLObject)temporal_projection_cols.UNPROVIDED);
        }
        else {
            lst_of_cons = unwrapped;
        }
        SubLObject cdolist_list_var = lst_of_cons;
        SubLObject constraint = (SubLObject)temporal_projection_cols.NIL;
        constraint = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (cycl_utilities.formula_arg0(constraint).eql(cycl_utilities.formula_arg0(fact))) {
                if (temporal_projection_cols.NIL != collection_defns.el_variableP(cycl_utilities.formula_arg1(constraint, (SubLObject)temporal_projection_cols.UNPROVIDED))) {
                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(cycl_utilities.formula_arg1(constraint, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED)), result);
                }
                if (temporal_projection_cols.NIL != collection_defns.el_variableP(cycl_utilities.formula_arg2(constraint, (SubLObject)temporal_projection_cols.UNPROVIDED))) {
                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(cycl_utilities.formula_arg2(constraint, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED)), result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            constraint = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 180667L)
    public static SubLObject convert_exponential_decay_distribution_with_initial_value_fn_to_lambda_form(final SubLObject decay_fn, final SubLObject earliest_time, final SubLObject starting_time) {
        final SubLObject v_answer = cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const118$exponentialDecayDistributionWithI, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)temporal_projection_cols.$sym29$_Y, decay_fn), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED));
        final SubLObject parameter = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym29$_Y, v_answer);
        final SubLObject upper_bound = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, v_answer);
        final SubLObject gap_between_starting_times = find_time_elapsed(earliest_time, starting_time);
        final SubLObject gap_2 = cycl_utilities.formula_arg1(convert_to_unit(gap_between_starting_times, temporal_projection_cols.$const168$MonthsDuration), (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject parameter_2 = cycl_utilities.formula_arg1(convert_to_unit(parameter, temporal_projection_cols.$const168$MonthsDuration), (SubLObject)temporal_projection_cols.UNPROVIDED);
        if (cycl_utilities.formula_arg1(gap_between_starting_times, (SubLObject)temporal_projection_cols.UNPROVIDED).eql((SubLObject)temporal_projection_cols.ZERO_INTEGER)) {
            return (SubLObject)ConsesLow.list(temporal_projection_cols.$const169$Lambda, (SubLObject)temporal_projection_cols.$list40, (SubLObject)ConsesLow.list(temporal_projection_cols.$const170$TimesFn, upper_bound, (SubLObject)ConsesLow.list(temporal_projection_cols.$const171$ExponentFn, (SubLObject)temporal_projection_cols.$float172$2_78, (SubLObject)ConsesLow.list(temporal_projection_cols.$const173$MinusFn, (SubLObject)ConsesLow.list(temporal_projection_cols.$const53$QuotientFn, (SubLObject)temporal_projection_cols.$sym28$_X, parameter_2)))));
        }
        return (SubLObject)ConsesLow.list(temporal_projection_cols.$const169$Lambda, (SubLObject)temporal_projection_cols.$list40, (SubLObject)ConsesLow.list(temporal_projection_cols.$const170$TimesFn, upper_bound, (SubLObject)ConsesLow.list(temporal_projection_cols.$const171$ExponentFn, (SubLObject)temporal_projection_cols.$float172$2_78, (SubLObject)ConsesLow.list(temporal_projection_cols.$const173$MinusFn, (SubLObject)ConsesLow.list(temporal_projection_cols.$const53$QuotientFn, (SubLObject)ConsesLow.list(temporal_projection_cols.$const61$DifferenceFn, (SubLObject)temporal_projection_cols.$sym28$_X, gap_2), parameter_2)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 181603L)
    public static SubLObject get_date_for_earliest_collection_members(final SubLObject concept) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const149$earliestDateForCollectionMembers, concept, (SubLObject)temporal_projection_cols.$list40), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)ConsesLow.list(new SubLObject[] { temporal_projection_cols.$kw174$INFERENCE_MODE, temporal_projection_cols.$kw175$MINIMAL, temporal_projection_cols.$kw176$ALLOW_INDETERMINATE_RESULTS_, temporal_projection_cols.NIL, temporal_projection_cols.$kw177$DISJUNCTION_FREE_EL_VARS_POLICY, temporal_projection_cols.$kw178$COMPUTE_INTERSECTION, temporal_projection_cols.$kw179$TRANSFORMATION_ALLOWED_, temporal_projection_cols.NIL, temporal_projection_cols.$kw180$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, temporal_projection_cols.T, temporal_projection_cols.$kw181$NEW_TERMS_ALLOWED_, temporal_projection_cols.NIL, temporal_projection_cols.$kw182$COMPUTE_ANSWER_JUSTIFICATIONS_, temporal_projection_cols.T, temporal_projection_cols.$kw183$MAX_NUMBER, temporal_projection_cols.ONE_INTEGER, temporal_projection_cols.$kw184$MAX_TIME, temporal_projection_cols.$float185$0_01, temporal_projection_cols.$kw186$PROBABLY_APPROXIMATELY_DONE, temporal_projection_cols.$float187$1_0, temporal_projection_cols.$kw188$MAX_PROOF_DEPTH, temporal_projection_cols.FIFTEEN_INTEGER, temporal_projection_cols.$kw189$ANSWER_LANGUAGE, temporal_projection_cols.$kw190$HL, temporal_projection_cols.$kw191$CONTINUABLE_, temporal_projection_cols.NIL, temporal_projection_cols.$kw192$PRODUCTIVITY_LIMIT, temporal_projection_cols.$int193$20000000 }))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 182297L)
    public static SubLObject recursive_temporal_projection_queryP(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = temporal_projection_cols.$temporal_projection_stack$.getDynamicValue(thread);
        SubLObject entry = (SubLObject)temporal_projection_cols.NIL;
        entry = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (fact.equal(cycl_utilities.formula_arg0(entry)) && time.equal(cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection_cols.UNPROVIDED))) {
                return (SubLObject)temporal_projection_cols.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 182551L)
    public static SubLObject find_earliest_event(final SubLObject lst) {
        SubLObject earliest_time = cycl_utilities.formula_arg2(cycl_utilities.formula_arg0(lst), (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject cdolist_list_var = lst;
        SubLObject entry = (SubLObject)temporal_projection_cols.NIL;
        entry = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject current_time = cycl_utilities.formula_arg2(entry, (SubLObject)temporal_projection_cols.UNPROVIDED);
            if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, earliest_time, current_time), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                earliest_time = current_time;
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return earliest_time;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 182879L)
    public static SubLObject get_prior_probability_for_pattern(final SubLObject pattern, final SubLObject bindings_list) {
        final SubLObject unwrapped = cycl_utilities.formula_arg0(cycl_utilities.formula_args(pattern, (SubLObject)temporal_projection_cols.UNPROVIDED));
        SubLObject conditions = (SubLObject)temporal_projection_cols.NIL;
        if (cycl_utilities.formula_arg0(unwrapped).eql(temporal_projection_cols.$const167$and)) {
            conditions = cycl_utilities.formula_args(unwrapped, (SubLObject)temporal_projection_cols.UNPROVIDED);
        }
        else {
            conditions = unwrapped;
        }
        SubLObject cdolist_list_var = conditions;
        SubLObject condition = (SubLObject)temporal_projection_cols.NIL;
        condition = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject pred = cycl_utilities.formula_arg0(condition);
            if (!pred.eql(temporal_projection_cols.$const15$isa)) {
                SubLObject cdolist_list_var_$37;
                final SubLObject all_assertions = cdolist_list_var_$37 = kb_mapping_utilities.pred_value_gafs_in_any_mt(pred, temporal_projection_cols.$const194$priorProbabilityForPredicate_Type, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
                SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
                assertion = cdolist_list_var_$37.first();
                while (temporal_projection_cols.NIL != cdolist_list_var_$37) {
                    final SubLObject gaf = assertions_high.gaf_formula(assertion);
                    if (temporal_projection_cols.NIL != test_constraints_for_arg_position(gaf, condition, conditions, bindings_list, (SubLObject)temporal_projection_cols.ONE_INTEGER) && temporal_projection_cols.NIL != test_constraints_for_arg_position(gaf, condition, conditions, bindings_list, (SubLObject)temporal_projection_cols.TWO_INTEGER)) {
                        return Values.values(cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED), assertion);
                    }
                    cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                    assertion = cdolist_list_var_$37.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            condition = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 183798L)
    public static SubLObject test_constraints_for_arg_position(final SubLObject gaf, final SubLObject condition, final SubLObject conditions, final SubLObject bindings_list, final SubLObject pos) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject var = (SubLObject)temporal_projection_cols.NIL;
        SubLObject col = (SubLObject)temporal_projection_cols.NIL;
        if (pos.numE((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            col = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            var = cycl_utilities.formula_arg1(condition, (SubLObject)temporal_projection_cols.UNPROVIDED);
        }
        if (pos.numE((SubLObject)temporal_projection_cols.TWO_INTEGER)) {
            col = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            var = cycl_utilities.formula_arg2(condition, (SubLObject)temporal_projection_cols.UNPROVIDED);
        }
        SubLObject cdolist_list_var = conditions;
        SubLObject cond_1 = (SubLObject)temporal_projection_cols.NIL;
        cond_1 = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (cycl_utilities.formula_arg0(cond_1).eql(temporal_projection_cols.$const15$isa) && cycl_utilities.formula_arg1(cond_1, (SubLObject)temporal_projection_cols.UNPROVIDED).eql(var)) {
                SubLObject col_1 = cycl_utilities.formula_arg2(cond_1, (SubLObject)temporal_projection_cols.UNPROVIDED);
                if (col_1.isList()) {
                    col_1 = narts_high.find_nart(col_1);
                }
                if (temporal_projection_cols.NIL != genls.genlP(col_1, col, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    return (SubLObject)temporal_projection_cols.T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cond_1 = cdolist_list_var.first();
        }
        cdolist_list_var = bindings_list;
        SubLObject binding = (SubLObject)temporal_projection_cols.NIL;
        binding = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (cycl_utilities.formula_arg0(binding).eql(var) && temporal_projection_cols.NIL != isa.isaP(cycl_utilities.formula_arg1(binding, (SubLObject)temporal_projection_cols.UNPROVIDED), col, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                return (SubLObject)temporal_projection_cols.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 184668L)
    public static SubLObject generate_powerset(final SubLObject lst) {
        if (temporal_projection_cols.NIL == lst) {
            return (SubLObject)ConsesLow.list((SubLObject)temporal_projection_cols.NIL);
        }
        final SubLObject prev = generate_powerset(cycl_utilities.formula_args(lst, (SubLObject)temporal_projection_cols.UNPROVIDED));
        temporal_projection_cols.$tp_current_var$.setDynamicValue(cycl_utilities.formula_arg0(lst));
        return ConsesLow.append(Mapping.mapcar(Symbols.symbol_function((SubLObject)temporal_projection_cols.$sym195$LAMBDA_FUNCTION_ELT), prev), prev);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 184980L)
    public static SubLObject lambda_function_elt(final SubLObject x) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)ConsesLow.cons(temporal_projection_cols.$tp_current_var$.getDynamicValue(thread), x);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 185056L)
    public static SubLObject time_falls_in_temporal_interval(final SubLObject interval, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject lower_bound = (SubLObject)temporal_projection_cols.NIL;
        SubLObject upper_bound = (SubLObject)temporal_projection_cols.NIL;
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        if (cycl_utilities.formula_arg0(interval).eql(temporal_projection_cols.$const130$TimeIntervalBetweenFn)) {
            lower_bound = cycl_utilities.formula_arg1(interval, (SubLObject)temporal_projection_cols.UNPROVIDED);
            upper_bound = cycl_utilities.formula_arg2(interval, (SubLObject)temporal_projection_cols.UNPROVIDED);
            if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, time, lower_bound), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED) && temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, upper_bound, time), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, time, lower_bound), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)ConsesLow.list(temporal_projection_cols.$const62$laterThan, upper_bound, time), temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                return Values.values((SubLObject)temporal_projection_cols.T, justifications);
            }
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 185847L)
    public static SubLObject handle_distribution_for_termination_of_membership(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject col = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject col_changed = (SubLObject)temporal_projection_cols.NIL;
        if (temporal_projection_cols.NIL != isa.isa_in_any_mtP(entity, temporal_projection_cols.$const196$HomoSapiens) && col.eql(temporal_projection_cols.$const151$BiologicalLivingObject)) {
            col = temporal_projection_cols.$const196$HomoSapiens;
            col_changed = (SubLObject)temporal_projection_cols.T;
        }
        SubLObject cdolist_list_var = isa.all_isa_in_any_mt(entity);
        SubLObject c = (SubLObject)temporal_projection_cols.NIL;
        c = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (c.equal(col)) {
                final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(col, temporal_projection_cols.$const197$distributionForTerminationOfMembe, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
                if (temporal_projection_cols.NIL != all_assertions) {
                    thread.resetMultipleValues();
                    final SubLObject ret_value = find_probability_of_belonging_to_collection(entity, c, time, all_assertions);
                    SubLObject justifications = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (temporal_projection_cols.NIL != ret_value) {
                        if (temporal_projection_cols.NIL != col_changed) {
                            justifications = ConsesLow.append(justifications, plausibility_utilities.hl_justify_asent_fast((SubLObject)temporal_projection_cols.$list198, temporal_projection_cols.$mt_for_temporal_projection$.getDynamicValue(thread)));
                        }
                        return Values.values(ret_value, justifications);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            c = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 186943L)
    public static SubLObject find_probability_of_belonging_to_collection(final SubLObject entity, final SubLObject col, final SubLObject time, final SubLObject all_assertions) {
        SubLObject closest_date = get_closest_time_for_assertion((SubLObject)ConsesLow.list(temporal_projection_cols.$const15$isa, entity, col), time);
        final SubLObject starting_date = get_starting_date_of_concept(entity);
        if (temporal_projection_cols.NIL == closest_date) {
            closest_date = starting_date;
        }
        if (temporal_projection_cols.NIL != closest_date && temporal_projection_cols.NIL != starting_date) {
            final SubLObject gaf = assertions_high.gaf_formula(cycl_utilities.formula_arg0(all_assertions));
            final SubLObject duration = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject duration_unit = cycl_utilities.formula_arg0(duration);
            final SubLObject time_elapsed = convert_to_unit(find_time_elapsed(starting_date, time), duration_unit);
            final SubLObject time_elapsed_since_start = convert_to_unit(find_time_elapsed(closest_date, starting_date), duration_unit);
            return calculate_probability_using_life_tables(time_elapsed, all_assertions, duration, time_elapsed_since_start);
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 187831L)
    public static SubLObject calculate_probability_using_life_tables(final SubLObject time_elapsed, final SubLObject all_assertions, final SubLObject duration, final SubLObject time_elapsed_since_start) {
        if (temporal_projection_cols.NIL == time_elapsed || temporal_projection_cols.NIL == time_elapsed_since_start) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        final SubLObject no_of_iterations_total = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const53$QuotientFn, (SubLObject)ConsesLow.list(temporal_projection_cols.$const61$DifferenceFn, time_elapsed, time_elapsed_since_start), duration)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
        final SubLObject no_of_iterations = Numbers.floor(no_of_iterations_total, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject current_value = time_elapsed_since_start;
        SubLObject current_ret_value = (SubLObject)temporal_projection_cols.ONE_INTEGER;
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        SubLObject count;
        SubLObject assertion;
        SubLObject gaf;
        SubLObject dist;
        SubLObject prob;
        for (count = (SubLObject)temporal_projection_cols.NIL, count = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count.numL(no_of_iterations); count = Numbers.add(count, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            current_value = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const54$PlusFn, current_value, duration)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
            assertion = find_relevant_distribution_at_age(all_assertions, cycl_utilities.formula_arg1(current_value, (SubLObject)temporal_projection_cols.UNPROVIDED));
            if (temporal_projection_cols.NIL == assertion) {
                return (SubLObject)temporal_projection_cols.NIL;
            }
            if (temporal_projection_cols.NIL != assertion) {
                gaf = assertions_high.gaf_formula(assertion);
                dist = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                prob = calculate_persistence_likelihood(current_value, dist);
                if (temporal_projection_cols.NIL != prob && prob.numE((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                    justifications = (SubLObject)temporal_projection_cols.NIL;
                }
                if (temporal_projection_cols.NIL == conses_high.member(assertion, justifications, Symbols.symbol_function((SubLObject)temporal_projection_cols.EQUAL), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                }
                if (temporal_projection_cols.NIL != prob) {
                    current_ret_value = Numbers.multiply(current_ret_value, Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, prob));
                }
                if (prob.numE((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                    return Values.values(current_ret_value, justifications);
                }
                if (temporal_projection_cols.NIL == prob) {
                    return (SubLObject)temporal_projection_cols.NIL;
                }
            }
        }
        return Values.values(current_ret_value, justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 189615L)
    public static SubLObject calculate_probability_of_delay_between_events(final SubLObject time_elapsed, final SubLObject all_assertions, final SubLObject duration, final SubLObject time_elapsed_since_start) {
        if (temporal_projection_cols.NIL == time_elapsed) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        if (temporal_projection_cols.NIL == duration) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        final SubLObject no_of_iterations_total = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const53$QuotientFn, (SubLObject)ConsesLow.list(temporal_projection_cols.$const61$DifferenceFn, time_elapsed, time_elapsed_since_start), duration)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
        final SubLObject no_of_iterations = Numbers.floor(no_of_iterations_total, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject current_value = time_elapsed_since_start;
        SubLObject current_ret_value = (SubLObject)temporal_projection_cols.ONE_INTEGER;
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        SubLObject count;
        SubLObject assertion;
        SubLObject gaf;
        SubLObject dist;
        SubLObject prob;
        for (count = (SubLObject)temporal_projection_cols.NIL, count = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count.numL(no_of_iterations); count = Numbers.add(count, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            current_value = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const54$PlusFn, current_value, duration)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
            assertion = find_relevant_distribution_for_delay_between_events(all_assertions, cycl_utilities.formula_arg1(current_value, (SubLObject)temporal_projection_cols.UNPROVIDED));
            if (temporal_projection_cols.NIL == assertion) {
                return (SubLObject)temporal_projection_cols.NIL;
            }
            if (temporal_projection_cols.NIL != assertion) {
                gaf = assertions_high.gaf_formula(assertion);
                dist = cycl_utilities.formula_arg5(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                prob = calculate_persistence_likelihood(current_value, dist);
                if (temporal_projection_cols.NIL != prob && prob.numE((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                    justifications = (SubLObject)temporal_projection_cols.NIL;
                }
                if (temporal_projection_cols.NIL == conses_high.member(assertion, justifications, Symbols.symbol_function((SubLObject)temporal_projection_cols.EQUAL), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                }
                if (temporal_projection_cols.NIL != prob) {
                    if (temporal_projection_cols.NIL != last_iterationP(current_value, time_elapsed, duration)) {
                        current_ret_value = Numbers.multiply(current_ret_value, prob);
                    }
                    else {
                        current_ret_value = Numbers.multiply(current_ret_value, Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, prob));
                    }
                    if (prob.numE((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                        return Values.values(current_ret_value, justifications);
                    }
                    if (temporal_projection_cols.NIL == prob) {
                        return (SubLObject)temporal_projection_cols.NIL;
                    }
                }
            }
        }
        return Values.values(current_ret_value, justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 191597L)
    public static SubLObject last_iterationP(final SubLObject current_value, final SubLObject time_elapsed, final SubLObject duration) {
        final SubLObject diff = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const61$DifferenceFn, time_elapsed, current_value)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
        if (temporal_projection_cols.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const56$lessThan, diff, duration), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)) {
            return (SubLObject)temporal_projection_cols.T;
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 191894L)
    public static SubLObject find_relevant_distribution_at_age(final SubLObject all_assertions, final SubLObject value) {
        SubLObject cdolist_list_var = all_assertions;
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject age_interval = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject lower = cycl_utilities.formula_arg1(age_interval, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject upper = cycl_utilities.formula_arg2(age_interval, (SubLObject)temporal_projection_cols.UNPROVIDED);
            if (!lower.numG(value) && upper.numG(value)) {
                return assertion;
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 192312L)
    public static SubLObject find_relevant_distribution_for_delay_between_events(final SubLObject all_assertions, final SubLObject value) {
        SubLObject cdolist_list_var = all_assertions;
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject age_interval = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject lower = cycl_utilities.formula_arg1(age_interval, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject upper = cycl_utilities.formula_arg2(age_interval, (SubLObject)temporal_projection_cols.UNPROVIDED);
            if (!lower.numG(value) && upper.numG(value)) {
                return assertion;
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 192739L)
    public static SubLObject find_relevant_distribution_for_transition(final SubLObject all_assertions, final SubLObject value) {
        SubLObject cdolist_list_var = all_assertions;
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject age_interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject lower = cycl_utilities.formula_arg1(age_interval, (SubLObject)temporal_projection_cols.UNPROVIDED);
            final SubLObject upper = cycl_utilities.formula_arg2(age_interval, (SubLObject)temporal_projection_cols.UNPROVIDED);
            if (!lower.numG(value) && upper.numG(value)) {
                return assertion;
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 193156L)
    public static SubLObject check_duration_of_event_type(final SubLObject fact) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject time = cycl_utilities.formula_arg2(fact, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject lower = (SubLObject)temporal_projection_cols.NIL;
        SubLObject upper = (SubLObject)temporal_projection_cols.NIL;
        final SubLObject starting_time = get_starting_date_of_concept(entity);
        SubLObject time_elapsed = (SubLObject)temporal_projection_cols.NIL;
        SubLObject time_elapsed_since_start = (SubLObject)temporal_projection_cols.NIL;
        if (!time.isList()) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        lower = cycl_utilities.formula_arg1(time, (SubLObject)temporal_projection_cols.UNPROVIDED);
        upper = cycl_utilities.formula_arg2(time, (SubLObject)temporal_projection_cols.UNPROVIDED);
        if (temporal_projection_cols.NIL == lower || temporal_projection_cols.NIL == upper) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        time_elapsed = find_time_elapsed(starting_time, upper);
        time_elapsed_since_start = find_time_elapsed(starting_time, lower);
        SubLObject cdolist_list_var = isa.all_isa_in_any_mt(entity);
        SubLObject col = (SubLObject)temporal_projection_cols.NIL;
        col = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject all_assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(col, temporal_projection_cols.$const199$distributionForCalculatingDuratio, (SubLObject)temporal_projection_cols.ONE_INTEGER, (SubLObject)temporal_projection_cols.UNPROVIDED);
            if (temporal_projection_cols.NIL != all_assertions) {
                final SubLObject assertion = cycl_utilities.formula_arg0(all_assertions);
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                final SubLObject duration = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                if (temporal_projection_cols.NIL != starting_time && temporal_projection_cols.NIL != time_elapsed) {
                    thread.resetMultipleValues();
                    final SubLObject ret_value = calculate_probability_of_end_of_event(time_elapsed, all_assertions, duration, time_elapsed_since_start);
                    final SubLObject justifications = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (temporal_projection_cols.NIL != ret_value) {
                        return Values.values(ret_value, justifications);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 194509L)
    public static SubLObject calculate_probability_of_end_of_event(final SubLObject time_elapsed, final SubLObject all_assertions, final SubLObject duration, final SubLObject time_elapsed_since_start) {
        if (temporal_projection_cols.NIL == time_elapsed) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        final SubLObject no_of_iterations_total = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const53$QuotientFn, (SubLObject)ConsesLow.list(temporal_projection_cols.$const61$DifferenceFn, time_elapsed, time_elapsed_since_start), duration)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
        final SubLObject no_of_iterations = Numbers.floor(no_of_iterations_total, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject current_value = time_elapsed_since_start;
        final SubLObject unit = cycl_utilities.formula_arg0(time_elapsed);
        SubLObject current_value_2 = reader.bq_cons(unit, (SubLObject)temporal_projection_cols.$list58);
        final SubLObject no_of_iteration_2 = Numbers.floor(bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const53$QuotientFn, time_elapsed_since_start, duration)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED))), (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject current_ret_value = (SubLObject)temporal_projection_cols.ZERO_INTEGER;
        SubLObject prob_of_not_ending = (SubLObject)temporal_projection_cols.ONE_INTEGER;
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        SubLObject count;
        SubLObject assertion;
        SubLObject gaf;
        SubLObject dist;
        SubLObject prob;
        for (count = (SubLObject)temporal_projection_cols.NIL, count = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count.numL(no_of_iteration_2); count = Numbers.add(count, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            current_value_2 = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const54$PlusFn, current_value_2, duration)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
            assertion = find_relevant_distribution_at_age(all_assertions, cycl_utilities.formula_arg1(current_value_2, (SubLObject)temporal_projection_cols.UNPROVIDED));
            if (temporal_projection_cols.NIL == assertion) {
                return (SubLObject)temporal_projection_cols.NIL;
            }
            if (temporal_projection_cols.NIL != assertion) {
                gaf = assertions_high.gaf_formula(assertion);
                dist = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                prob = calculate_persistence_likelihood(current_value_2, dist);
                if (temporal_projection_cols.NIL != prob) {
                    prob_of_not_ending = Numbers.multiply(prob_of_not_ending, Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, prob));
                }
                if (temporal_projection_cols.NIL == conses_high.member(assertion, justifications, Symbols.symbol_function((SubLObject)temporal_projection_cols.EQUAL), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                }
                if (temporal_projection_cols.NIL != prob && (prob.numE((SubLObject)temporal_projection_cols.ONE_INTEGER) || prob_of_not_ending.numL((SubLObject)temporal_projection_cols.$float200$9_999999999999999e_7))) {
                    return Values.values((SubLObject)temporal_projection_cols.ZERO_INTEGER, justifications);
                }
            }
        }
        for (count = (SubLObject)temporal_projection_cols.NIL, count = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count.numL(no_of_iterations); count = Numbers.add(count, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            current_value = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const54$PlusFn, current_value, duration)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
            assertion = find_relevant_distribution_at_age(all_assertions, cycl_utilities.formula_arg1(current_value, (SubLObject)temporal_projection_cols.UNPROVIDED));
            if (temporal_projection_cols.NIL == assertion) {
                return (SubLObject)temporal_projection_cols.NIL;
            }
            if (temporal_projection_cols.NIL != assertion) {
                gaf = assertions_high.gaf_formula(assertion);
                dist = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                prob = calculate_persistence_likelihood(current_value, dist);
                if (temporal_projection_cols.NIL != prob && prob.numE((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                    justifications = (SubLObject)temporal_projection_cols.NIL;
                }
                if (temporal_projection_cols.NIL == conses_high.member(assertion, justifications, Symbols.symbol_function((SubLObject)temporal_projection_cols.EQUAL), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                }
                if (temporal_projection_cols.NIL != prob) {
                    current_ret_value = Numbers.add(current_ret_value, Numbers.multiply(prob, prob_of_not_ending));
                    prob_of_not_ending = Numbers.multiply(prob_of_not_ending, Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, prob));
                }
                if (Numbers.multiply(current_ret_value, prob_of_not_ending).numG((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                    return Values.values((SubLObject)temporal_projection_cols.ONE_INTEGER, justifications);
                }
                if (temporal_projection_cols.NIL == prob) {
                    return (SubLObject)temporal_projection_cols.NIL;
                }
            }
        }
        return Values.values(current_ret_value, justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 197814L)
    public static SubLObject calculate_probability_of_transition_to_state(final SubLObject time_elapsed, final SubLObject all_assertions, final SubLObject duration, final SubLObject time_elapsed_since_start) {
        if (temporal_projection_cols.NIL == time_elapsed) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        final SubLObject no_of_iterations_total = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const53$QuotientFn, (SubLObject)ConsesLow.list(temporal_projection_cols.$const61$DifferenceFn, time_elapsed, time_elapsed_since_start), duration)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
        final SubLObject no_of_iterations = Numbers.floor(no_of_iterations_total, (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject current_value = time_elapsed_since_start;
        final SubLObject unit = cycl_utilities.formula_arg0(time_elapsed);
        SubLObject current_value_2 = reader.bq_cons(unit, (SubLObject)temporal_projection_cols.$list58);
        final SubLObject no_of_iteration_2 = Numbers.floor(bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const53$QuotientFn, time_elapsed_since_start, duration)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED))), (SubLObject)temporal_projection_cols.UNPROVIDED);
        SubLObject current_ret_value = (SubLObject)temporal_projection_cols.ONE_INTEGER;
        SubLObject prob_of_not_ending = (SubLObject)temporal_projection_cols.ONE_INTEGER;
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        SubLObject count;
        SubLObject assertion;
        SubLObject gaf;
        SubLObject dist;
        SubLObject prob;
        for (count = (SubLObject)temporal_projection_cols.NIL, count = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count.numL(no_of_iteration_2); count = Numbers.add(count, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            current_value_2 = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const54$PlusFn, current_value_2, duration)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
            assertion = find_relevant_distribution_for_transition(all_assertions, cycl_utilities.formula_arg1(current_value_2, (SubLObject)temporal_projection_cols.UNPROVIDED));
            if (temporal_projection_cols.NIL == assertion) {
                return (SubLObject)temporal_projection_cols.ZERO_INTEGER;
            }
            if (temporal_projection_cols.NIL != assertion) {
                gaf = assertions_high.gaf_formula(assertion);
                dist = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                prob = calculate_persistence_likelihood(current_value_2, dist);
                if (temporal_projection_cols.NIL != prob) {
                    prob_of_not_ending = Numbers.multiply(prob_of_not_ending, Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, prob));
                }
                PrintLow.format((SubLObject)temporal_projection_cols.T, (SubLObject)temporal_projection_cols.$str201$___Time___a__a_Not_ending___a, new SubLObject[] { current_value_2, prob, prob_of_not_ending });
                if (temporal_projection_cols.NIL == conses_high.member(assertion, justifications, Symbols.symbol_function((SubLObject)temporal_projection_cols.EQUAL), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                }
                if (temporal_projection_cols.NIL != prob && (prob.numE((SubLObject)temporal_projection_cols.ONE_INTEGER) || prob_of_not_ending.numL((SubLObject)temporal_projection_cols.$float200$9_999999999999999e_7))) {
                    return Values.values((SubLObject)temporal_projection_cols.ZERO_INTEGER, justifications);
                }
            }
        }
        for (count = (SubLObject)temporal_projection_cols.NIL, count = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count.numL(no_of_iterations); count = Numbers.add(count, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            current_value = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const54$PlusFn, current_value, duration)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
            assertion = find_relevant_distribution_for_transition(all_assertions, cycl_utilities.formula_arg1(current_value, (SubLObject)temporal_projection_cols.UNPROVIDED));
            if (temporal_projection_cols.NIL == assertion) {
                return (SubLObject)temporal_projection_cols.ZERO_INTEGER;
            }
            if (temporal_projection_cols.NIL != assertion) {
                gaf = assertions_high.gaf_formula(assertion);
                dist = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                prob = calculate_persistence_likelihood(current_value, dist);
                if (temporal_projection_cols.NIL != prob && prob.numE((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                    justifications = (SubLObject)temporal_projection_cols.NIL;
                }
                if (temporal_projection_cols.NIL == conses_high.member(assertion, justifications, Symbols.symbol_function((SubLObject)temporal_projection_cols.EQUAL), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                }
                if (temporal_projection_cols.NIL != prob) {
                    if (temporal_projection_cols.NIL != last_iterationP(current_value, time_elapsed, duration)) {
                        current_ret_value = Numbers.multiply(current_ret_value, prob);
                    }
                    else {
                        current_ret_value = Numbers.multiply(current_ret_value, Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, prob));
                    }
                    if (current_ret_value.numG((SubLObject)temporal_projection_cols.ONE_INTEGER)) {
                        return Values.values((SubLObject)temporal_projection_cols.ONE_INTEGER, justifications);
                    }
                    if (temporal_projection_cols.NIL == prob) {
                        return (SubLObject)temporal_projection_cols.NIL;
                    }
                }
            }
        }
        return Values.values(current_ret_value, justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 201132L)
    public static SubLObject calculate_probability_of_remaining_in_state(final SubLObject time_elapsed, final SubLObject all_assertions, final SubLObject duration, final SubLObject time_elapsed_since_start) {
        if (temporal_projection_cols.NIL == time_elapsed) {
            return (SubLObject)temporal_projection_cols.NIL;
        }
        final SubLObject no_of_iterations_total = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const53$QuotientFn, (SubLObject)ConsesLow.list(temporal_projection_cols.$const61$DifferenceFn, time_elapsed, time_elapsed_since_start), duration)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
        final SubLObject no_of_iterations = Numbers.floor(no_of_iterations_total, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject unit = cycl_utilities.formula_arg0(time_elapsed);
        SubLObject current_value_2 = reader.bq_cons(unit, (SubLObject)temporal_projection_cols.$list58);
        SubLObject prob_of_not_ending = (SubLObject)temporal_projection_cols.ONE_INTEGER;
        SubLObject prob_ret = (SubLObject)temporal_projection_cols.NIL;
        SubLObject justifications = (SubLObject)temporal_projection_cols.NIL;
        SubLObject count;
        SubLObject assertion;
        SubLObject gaf;
        SubLObject dist;
        SubLObject prob;
        for (count = (SubLObject)temporal_projection_cols.NIL, count = (SubLObject)temporal_projection_cols.ZERO_INTEGER; count.numL(no_of_iterations); count = Numbers.add(count, (SubLObject)temporal_projection_cols.ONE_INTEGER)) {
            current_value_2 = bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_cols.$const51$evaluate, (SubLObject)temporal_projection_cols.$sym28$_X, (SubLObject)ConsesLow.list(temporal_projection_cols.$const54$PlusFn, current_value_2, duration)), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
            assertion = find_relevant_distribution_for_transition(all_assertions, cycl_utilities.formula_arg1(current_value_2, (SubLObject)temporal_projection_cols.UNPROVIDED));
            if (temporal_projection_cols.NIL == assertion) {
                return (SubLObject)temporal_projection_cols.NIL;
            }
            if (temporal_projection_cols.NIL != assertion) {
                gaf = assertions_high.gaf_formula(assertion);
                dist = cycl_utilities.formula_arg4(gaf, (SubLObject)temporal_projection_cols.UNPROVIDED);
                prob = calculate_persistence_likelihood(current_value_2, dist);
                if (temporal_projection_cols.NIL != prob) {
                    prob_of_not_ending = Numbers.multiply(prob_of_not_ending, Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, prob));
                }
                if (temporal_projection_cols.NIL != prob) {
                    prob_ret = Numbers.subtract((SubLObject)temporal_projection_cols.ONE_INTEGER, prob);
                }
                else {
                    prob_ret = (SubLObject)temporal_projection_cols.NIL;
                }
                if (temporal_projection_cols.NIL == conses_high.member(assertion, justifications, Symbols.symbol_function((SubLObject)temporal_projection_cols.EQUAL), (SubLObject)temporal_projection_cols.UNPROVIDED)) {
                    justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(assertion));
                }
                if (temporal_projection_cols.NIL != prob && (prob.numE((SubLObject)temporal_projection_cols.ONE_INTEGER) || prob_of_not_ending.numL((SubLObject)temporal_projection_cols.$float200$9_999999999999999e_7))) {
                    return Values.values((SubLObject)temporal_projection_cols.ZERO_INTEGER, justifications);
                }
            }
        }
        return Values.values(prob_ret, justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 203012L)
    public static SubLObject get_already_computed_answers(final SubLObject fact, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = temporal_projection_cols.$temporal_projection_answers$.getDynamicValue(thread);
        SubLObject entry = (SubLObject)temporal_projection_cols.NIL;
        entry = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            if (cycl_utilities.formula_arg0(entry).equal(fact) && cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection_cols.UNPROVIDED).equal(time)) {
                return Values.values(cycl_utilities.formula_arg2(entry, (SubLObject)temporal_projection_cols.UNPROVIDED), cycl_utilities.formula_arg3(entry, (SubLObject)temporal_projection_cols.UNPROVIDED));
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 203307L)
    public static SubLObject get_duration_of_time_interval(final SubLObject time_interval) {
        return bindings.variable_lookup((SubLObject)temporal_projection_cols.$sym28$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.listS(temporal_projection_cols.$const25$duration, time_interval, (SubLObject)temporal_projection_cols.$list40), (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED, (SubLObject)temporal_projection_cols.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 203467L)
    public static SubLObject scale_distribution(final SubLObject distribution, final SubLObject unit, final SubLObject duration) {
        final SubLObject dist = narts_high.nart_hl_formula(distribution);
        final SubLObject duration_1 = convert_to_unit(duration, unit);
        final SubLObject duration_1_value = cycl_utilities.formula_arg1(duration_1, (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject value_in_dist = cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(dist, (SubLObject)temporal_projection_cols.UNPROVIDED), (SubLObject)temporal_projection_cols.UNPROVIDED);
        final SubLObject unit_in_dist = cycl_utilities.formula_arg0(cycl_utilities.formula_arg1(dist, (SubLObject)temporal_projection_cols.UNPROVIDED));
        if (duration_1_value.numG((SubLObject)temporal_projection_cols.ZERO_INTEGER)) {
            return el_utilities.make_unary_formula(cycl_utilities.formula_arg0(dist), el_utilities.make_unary_formula(unit_in_dist, Numbers.divide(value_in_dist, duration_1_value)));
        }
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-cols.lisp", position = 203967L)
    public static SubLObject get_list_of_times_for_assertion(final SubLObject fact) {
        final SubLObject assertions = get_assertions_for_fact(fact);
        SubLObject result = (SubLObject)temporal_projection_cols.NIL;
        final SubLObject result2 = get_time_from_ist_facts(fact);
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)temporal_projection_cols.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_cols.NIL != cdolist_list_var) {
            final SubLObject time_for_assertion = temporal_projection.get_time_for_assertion_1(assertion);
            if (temporal_projection_cols.NIL != time_for_assertion) {
                result = (SubLObject)ConsesLow.cons(time_for_assertion, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return ConsesLow.append(result, result2);
    }
    
    public static SubLObject declare_temporal_projection_cols_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "collect_intervals_from_events", "COLLECT-INTERVALS-FROM-EVENTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "create_forward_intervals_from_events", "CREATE-FORWARD-INTERVALS-FROM-EVENTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "create_backward_intervals_from_events", "CREATE-BACKWARD-INTERVALS-FROM-EVENTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "possibly_retract_stale_deductions", "POSSIBLY-RETRACT-STALE-DEDUCTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "argument_is_better_thanP", "ARGUMENT-IS-BETTER-THAN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "argument_has_more_factsP", "ARGUMENT-HAS-MORE-FACTS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "support_subsumed_by_justificationP", "SUPPORT-SUBSUMED-BY-JUSTIFICATION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "distribution_related_supportP", "DISTRIBUTION-RELATED-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "collect_intervals_from_events_for_negated_sentence", "COLLECT-INTERVALS-FROM-EVENTS-FOR-NEGATED-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "collect_intervals_from_both_starting_point_and_ending_point_assertions", "COLLECT-INTERVALS-FROM-BOTH-STARTING-POINT-AND-ENDING-POINT-ASSERTIONS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "collect_intervals_from_both_starting_point_and_ending_point_assertions_negated", "COLLECT-INTERVALS-FROM-BOTH-STARTING-POINT-AND-ENDING-POINT-ASSERTIONS-NEGATED", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "backward_intervals_for_sentence", "BACKWARD-INTERVALS-FOR-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "forward_intervals_for_sentence", "FORWARD-INTERVALS-FOR-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_best_backward_distribution_for_sentence", "FIND-BEST-BACKWARD-DISTRIBUTION-FOR-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_best_forward_distribution_for_sentence", "FIND-BEST-FORWARD-DISTRIBUTION-FOR-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_type_level_distribution_for_sentence", "FIND-TYPE-LEVEL-DISTRIBUTION-FOR-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_default_backward_distribution_for_sentence", "FIND-DEFAULT-BACKWARD-DISTRIBUTION-FOR-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_default_forward_distribution_for_sentence", "FIND-DEFAULT-FORWARD-DISTRIBUTION-FOR-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_default_distribution_for_sentence", "FIND-DEFAULT-DISTRIBUTION-FOR-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "create_time_line_from_assertions", "CREATE-TIME-LINE-FROM-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "list_time_comparator", "LIST-TIME-COMPARATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "compute_likelihoods_from_event_calculus", "COMPUTE-LIKELIHOODS-FROM-EVENT-CALCULUS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_likelihood_from_default_conditional_probability_for_sentence_backwards", "FIND-LIKELIHOOD-FROM-DEFAULT-CONDITIONAL-PROBABILITY-FOR-SENTENCE-BACKWARDS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_likelihood_from_default_conditional_probability_for_sentence_forwards", "FIND-LIKELIHOOD-FROM-DEFAULT-CONDITIONAL-PROBABILITY-FOR-SENTENCE-FORWARDS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_temporal_interpolation_function_for_predicate", "HANDLE-TEMPORAL-INTERPOLATION-FUNCTION-FOR-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_duration_weighted_decay_distribution", "HANDLE-DURATION-WEIGHTED-DECAY-DISTRIBUTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_decay_distribution_for_assertion_in_time_interval", "HANDLE-DECAY-DISTRIBUTION-FOR-ASSERTION-IN-TIME-INTERVAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "use_causal_analysis_to_find_likelihood", "USE-CAUSAL-ANALYSIS-TO-FIND-LIKELIHOOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "use_noisy_and_model_to_calculate_prob", "USE-NOISY-AND-MODEL-TO-CALCULATE-PROB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_probabilities_due_to_unobserved_causes", "FIND-PROBABILITIES-DUE-TO-UNOBSERVED-CAUSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "check_presence_of_condition_in_observed_causes_ins_pos_1", "CHECK-PRESENCE-OF-CONDITION-IN-OBSERVED-CAUSES-INS-POS-1", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "use_noisy_or_model_to_calculate_prob", "USE-NOISY-OR-MODEL-TO-CALCULATE-PROB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "use_causal_analysis_to_find_likelihood_2", "USE-CAUSAL-ANALYSIS-TO-FIND-LIKELIHOOD-2", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "compute_probability_for_list_of_causes", "COMPUTE-PROBABILITY-FOR-LIST-OF-CAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "compute_probability_for_subset", "COMPUTE-PROBABILITY-FOR-SUBSET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_prior_and_probability_from_list", "FIND-PRIOR-AND-PROBABILITY-FROM-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "check_delay_between_start_of_event_types_in_sit_type", "CHECK-DELAY-BETWEEN-START-OF-EVENT-TYPES-IN-SIT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_default_decay_function_for_predicate", "HANDLE-DEFAULT-DECAY-FUNCTION-FOR-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_default_decay_function_for_predicate_backwards", "HANDLE-DEFAULT-DECAY-FUNCTION-FOR-PREDICATE-BACKWARDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_decay_distribution_for_specs", "HANDLE-DECAY-DISTRIBUTION-FOR-SPECS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_decay_distribution_for_specs_2", "HANDLE-DECAY-DISTRIBUTION-FOR-SPECS-2", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_assertions_for_fact", "GET-ASSERTIONS-FOR-FACT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_temporal_interpolation_function_for_collection", "HANDLE-TEMPORAL-INTERPOLATION-FUNCTION-FOR-COLLECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_probability_of_end_of_event", "FIND-PROBABILITY-OF-END-OF-EVENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_probability_of_event_occurrence", "FIND-PROBABILITY-OF-EVENT-OCCURRENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "use_risk_analysis", "USE-RISK-ANALYSIS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_probability_of_event_occurrence", "GET-PROBABILITY-OF-EVENT-OCCURRENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "calculate_probability_of_event_occurring_before_age", "CALCULATE-PROBABILITY-OF-EVENT-OCCURRING-BEFORE-AGE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_probability_of_state_persisting_from_time", "GET-PROBABILITY-OF-STATE-PERSISTING-FROM-TIME", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_probability_of_event_not_occurring", "GET-PROBABILITY-OF-EVENT-NOT-OCCURRING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_duration_from_intensity_function", "GET-DURATION-FROM-INTENSITY-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_intensity_function_for_event_type", "GET-INTENSITY-FUNCTION-FOR-EVENT-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_intensity_function_at_age", "FIND-INTENSITY-FUNCTION-AT-AGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_intensity_function_at_age_for_role", "FIND-INTENSITY-FUNCTION-AT-AGE-FOR-ROLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_intensity_function_for_event_2", "GET-INTENSITY-FUNCTION-FOR-EVENT-2", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_transition_probability", "FIND-TRANSITION-PROBABILITY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_backward_transition_probabilities", "FIND-BACKWARD-TRANSITION-PROBABILITIES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_backward_transition_probabilities_to_self", "FIND-BACKWARD-TRANSITION-PROBABILITIES-TO-SELF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_prob_of_backward_transition", "FIND-PROB-OF-BACKWARD-TRANSITION", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_probability_for_state", "FIND-PROBABILITY-FOR-STATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_array_element", "GET-ARRAY-ELEMENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_assertions_for_transition_from_state_to_state", "GET-ASSERTIONS-FOR-TRANSITION-FROM-STATE-TO-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_probability_of_remaining_in_state_1", "FIND-PROBABILITY-OF-REMAINING-IN-STATE-1", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_probability_of_remaining_in_state_2", "FIND-PROBABILITY-OF-REMAINING-IN-STATE-2", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_forward_transition_probabilities", "FIND-FORWARD-TRANSITION-PROBABILITIES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "check_cardinality_of_collection", "CHECK-CARDINALITY-OF-COLLECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "check_number_of_instances", "CHECK-NUMBER-OF-INSTANCES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "use_event_calculus_to_find_likelihood", "USE-EVENT-CALCULUS-TO-FIND-LIKELIHOOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "use_conditional_likelihood", "USE-CONDITIONAL-LIKELIHOOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_delay_between_collections", "HANDLE-DELAY-BETWEEN-COLLECTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_default_decay_distribution_for_collection_in_interval", "HANDLE-DEFAULT-DECAY-DISTRIBUTION-FOR-COLLECTION-IN-INTERVAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_temporal_relation_between_collections", "HANDLE-TEMPORAL-RELATION-BETWEEN-COLLECTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_decay_distribution_for_collection_in_interval_when_instance_in_spec", "HANDLE-DECAY-DISTRIBUTION-FOR-COLLECTION-IN-INTERVAL-WHEN-INSTANCE-IN-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_default_decay_distribution_for_collection", "HANDLE-DEFAULT-DECAY-DISTRIBUTION-FOR-COLLECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_default_decay_distribution_for_collection_backwards", "HANDLE-DEFAULT-DECAY-DISTRIBUTION-FOR-COLLECTION-BACKWARDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_decay_distribution_for_collection_forward", "HANDLE-DECAY-DISTRIBUTION-FOR-COLLECTION-FORWARD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_decay_distribution_for_specs_collection", "HANDLE-DECAY-DISTRIBUTION-FOR-SPECS-COLLECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_decay_distribution_for_collection_in_interval_backwards", "HANDLE-DECAY-DISTRIBUTION-FOR-COLLECTION-IN-INTERVAL-BACKWARDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_decay_distribution_for_assertion_in_interval", "HANDLE-DECAY-DISTRIBUTION-FOR-ASSERTION-IN-INTERVAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_decay_distribution_for_assertion_in_interval_backwards", "HANDLE-DECAY-DISTRIBUTION-FOR-ASSERTION-IN-INTERVAL-BACKWARDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "check_time_subsumption", "CHECK-TIME-SUBSUMPTION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_decay_distribution_for_assertion_causal", "HANDLE-DECAY-DISTRIBUTION-FOR-ASSERTION-CAUSAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_decay_distribution_for_collection_when_time_in_interval", "HANDLE-DECAY-DISTRIBUTION-FOR-COLLECTION-WHEN-TIME-IN-INTERVAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "check_temporal_relation", "CHECK-TEMPORAL-RELATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_persistence_likelihood_for_fact_at_time", "GET-PERSISTENCE-LIKELIHOOD-FOR-FACT-AT-TIME", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_persistence_of_isa_assertion", "GET-PERSISTENCE-OF-ISA-ASSERTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_persistence_of_non_isa_assertion", "GET-PERSISTENCE-OF-NON-ISA-ASSERTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "collect_evidence_from_rules", "COLLECT-EVIDENCE-FROM-RULES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_decay_function_for_collection", "FIND-DECAY-FUNCTION-FOR-COLLECTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_decay_function_for_fact", "FIND-DECAY-FUNCTION-FOR-FACT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "time_elapsed_falls_in_interval", "TIME-ELAPSED-FALLS-IN-INTERVAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "calculate_persistence_likelihood", "CALCULATE-PERSISTENCE-LIKELIHOOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "calculate_persistence_likelihood_from_non_narts", "CALCULATE-PERSISTENCE-LIKELIHOOD-FROM-NON-NARTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "calculate_persistence_for_exponential_decay_function", "CALCULATE-PERSISTENCE-FOR-EXPONENTIAL-DECAY-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "calculate_persistence_for_exponential_decay_function_scaled", "CALCULATE-PERSISTENCE-FOR-EXPONENTIAL-DECAY-FUNCTION-SCALED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "calculate_persistence_for_bounded_exponentially_increasing_function", "CALCULATE-PERSISTENCE-FOR-BOUNDED-EXPONENTIALLY-INCREASING-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "calculate_persistence_for_bounded_exponentially_increasing_function_with_initial_value", "CALCULATE-PERSISTENCE-FOR-BOUNDED-EXPONENTIALLY-INCREASING-FUNCTION-WITH-INITIAL-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "calculate_persistence_for_exponential_decay_distribution_with_initial_and_final_value_fn", "CALCULATE-PERSISTENCE-FOR-EXPONENTIAL-DECAY-DISTRIBUTION-WITH-INITIAL-AND-FINAL-VALUE-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "calculate_persistence_for_exponential_decay_distribution_with_initial_value_fn", "CALCULATE-PERSISTENCE-FOR-EXPONENTIAL-DECAY-DISTRIBUTION-WITH-INITIAL-VALUE-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "calculate_persistence_for_constant_function", "CALCULATE-PERSISTENCE-FOR-CONSTANT-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "calculate_persistence_for_gaussian_decay_function2", "CALCULATE-PERSISTENCE-FOR-GAUSSIAN-DECAY-FUNCTION2", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "calculate_persistence_for_gaussian_decay_function", "CALCULATE-PERSISTENCE-FOR-GAUSSIAN-DECAY-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "calculate_persistence_for_linear_decay_function", "CALCULATE-PERSISTENCE-FOR-LINEAR-DECAY-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "calculate_persistence_for_linearly_increasing_function", "CALCULATE-PERSISTENCE-FOR-LINEARLY-INCREASING-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "time_falls_in_interval", "TIME-FALLS-IN-INTERVAL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_mt_time_for_assertion", "GET-MT-TIME-FOR-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_time_from_ist_facts", "GET-TIME-FROM-IST-FACTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_farthest_time_for_assertion", "GET-FARTHEST-TIME-FOR-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_closest_time_for_assertion", "GET-CLOSEST-TIME-FOR-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_closest_time_for_assertion_before_given_time", "GET-CLOSEST-TIME-FOR-ASSERTION-BEFORE-GIVEN-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_earliest_time_for_fact", "GET-EARLIEST-TIME-FOR-FACT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_time_intervals_closest", "HANDLE-TIME-INTERVALS-CLOSEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "map_indexicals_in_date", "MAP-INDEXICALS-IN-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "check_fact_true_at_point", "CHECK-FACT-TRUE-AT-POINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "check_isa_fact_false_at_point", "CHECK-ISA-FACT-FALSE-AT-POINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "time_subsumes_anotherP", "TIME-SUBSUMES-ANOTHER?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_assertion_for_given_fact_and_time", "GET-ASSERTION-FOR-GIVEN-FACT-AND-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_fact_closest_to_time_point", "GET-FACT-CLOSEST-TO-TIME-POINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_assertion_for_binary_predicates", "GET-ASSERTION-FOR-BINARY-PREDICATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_assertion_for_ternary_predicates", "GET-ASSERTION-FOR-TERNARY-PREDICATES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_assertion_for_predicate_of_arity_five", "GET-ASSERTION-FOR-PREDICATE-OF-ARITY-FIVE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_assertion_for_predicate_of_arity_four", "GET-ASSERTION-FOR-PREDICATE-OF-ARITY-FOUR", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_assertion_for_predicate_of_arity_6", "FIND-ASSERTION-FOR-PREDICATE-OF-ARITY-6", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "check_always_trueP", "CHECK-ALWAYS-TRUE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "check_temporal_relation_between_arguments", "CHECK-TEMPORAL-RELATION-BETWEEN-ARGUMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "check_starting_times", "CHECK-STARTING-TIMES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "check_ending_times", "CHECK-ENDING-TIMES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_arg_cons_for_pos", "GET-ARG-CONS-FOR-POS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_starting_date_of_concept", "GET-STARTING-DATE-OF-CONCEPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_ending_date_of_concept", "GET-ENDING-DATE-OF-CONCEPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_time_elapsed", "FIND-TIME-ELAPSED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_time_elapsed_for_indeterminate_terms", "FIND-TIME-ELAPSED-FOR-INDETERMINATE-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "mt_later_thanP", "MT-LATER-THAN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "at_least_one_point_is_later_thanP", "AT-LEAST-ONE-POINT-IS-LATER-THAN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "at_least_one_point_is_before_thanP", "AT-LEAST-ONE-POINT-IS-BEFORE-THAN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "all_points_are_before_thanP", "ALL-POINTS-ARE-BEFORE-THAN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "all_points_are_after_thanP", "ALL-POINTS-ARE-AFTER-THAN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_last_time_point_of", "GET-LAST-TIME-POINT-OF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "verify_temporal_relation", "VERIFY-TEMPORAL-RELATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_first_time_point_of", "GET-FIRST-TIME-POINT-OF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "convert_to_unit", "CONVERT-TO-UNIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "error_fn", "ERROR-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_list_of_starting_times", "FIND-LIST-OF-STARTING-TIMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_list_of_ending_times", "FIND-LIST-OF-ENDING-TIMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_closest_time_after", "FIND-CLOSEST-TIME-AFTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_closest_time_before", "FIND-CLOSEST-TIME-BEFORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "create_timeline_for_assertion", "CREATE-TIMELINE-FOR-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "check_boundary_conditions", "CHECK-BOUNDARY-CONDITIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_closest_time_around_time_point", "FIND-CLOSEST-TIME-AROUND-TIME-POINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_most_specific_assertion", "FIND-MOST-SPECIFIC-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_persistence_by_combining_evidence", "FIND-PERSISTENCE-BY-COMBINING-EVIDENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "combined_evidence_for_persistence", "COMBINED-EVIDENCE-FOR-PERSISTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "check_whether_fact_satisfies_constraints", "CHECK-WHETHER-FACT-SATISFIES-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_assertion_matching_conditions_in_conseq", "FIND-ASSERTION-MATCHING-CONDITIONS-IN-CONSEQ", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_constraints_for_variable_from_conditions", "FIND-CONSTRAINTS-FOR-VARIABLE-FROM-CONDITIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "check_isa_constraint", "CHECK-ISA-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_binding_for_variable", "GET-BINDING-FOR-VARIABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_list_of_bindings_for_cons", "GET-LIST-OF-BINDINGS-FOR-CONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "convert_exponential_decay_distribution_with_initial_value_fn_to_lambda_form", "CONVERT-EXPONENTIAL-DECAY-DISTRIBUTION-WITH-INITIAL-VALUE-FN-TO-LAMBDA-FORM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_date_for_earliest_collection_members", "GET-DATE-FOR-EARLIEST-COLLECTION-MEMBERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "recursive_temporal_projection_queryP", "RECURSIVE-TEMPORAL-PROJECTION-QUERY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_earliest_event", "FIND-EARLIEST-EVENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_prior_probability_for_pattern", "GET-PRIOR-PROBABILITY-FOR-PATTERN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "test_constraints_for_arg_position", "TEST-CONSTRAINTS-FOR-ARG-POSITION", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "generate_powerset", "GENERATE-POWERSET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "lambda_function_elt", "LAMBDA-FUNCTION-ELT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "time_falls_in_temporal_interval", "TIME-FALLS-IN-TEMPORAL-INTERVAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "handle_distribution_for_termination_of_membership", "HANDLE-DISTRIBUTION-FOR-TERMINATION-OF-MEMBERSHIP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_probability_of_belonging_to_collection", "FIND-PROBABILITY-OF-BELONGING-TO-COLLECTION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "calculate_probability_using_life_tables", "CALCULATE-PROBABILITY-USING-LIFE-TABLES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "calculate_probability_of_delay_between_events", "CALCULATE-PROBABILITY-OF-DELAY-BETWEEN-EVENTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "last_iterationP", "LAST-ITERATION?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_relevant_distribution_at_age", "FIND-RELEVANT-DISTRIBUTION-AT-AGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_relevant_distribution_for_delay_between_events", "FIND-RELEVANT-DISTRIBUTION-FOR-DELAY-BETWEEN-EVENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "find_relevant_distribution_for_transition", "FIND-RELEVANT-DISTRIBUTION-FOR-TRANSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "check_duration_of_event_type", "CHECK-DURATION-OF-EVENT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "calculate_probability_of_end_of_event", "CALCULATE-PROBABILITY-OF-END-OF-EVENT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "calculate_probability_of_transition_to_state", "CALCULATE-PROBABILITY-OF-TRANSITION-TO-STATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "calculate_probability_of_remaining_in_state", "CALCULATE-PROBABILITY-OF-REMAINING-IN-STATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_already_computed_answers", "GET-ALREADY-COMPUTED-ANSWERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_duration_of_time_interval", "GET-DURATION-OF-TIME-INTERVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "scale_distribution", "SCALE-DISTRIBUTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_cols", "get_list_of_times_for_assertion", "GET-LIST-OF-TIMES-FOR-ASSERTION", 1, 0, false);
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    public static SubLObject init_temporal_projection_cols_file() {
        temporal_projection_cols.$uniform_distribution_with_value_zero$ = SubLFiles.defparameter("*UNIFORM-DISTRIBUTION-WITH-VALUE-ZERO*", el_utilities.make_unary_formula(temporal_projection_cols.$const94$UniformPersistenceDistributionWit, (SubLObject)temporal_projection_cols.ZERO_INTEGER));
        temporal_projection_cols.$uniform_distribution_with_value_one$ = SubLFiles.defparameter("*UNIFORM-DISTRIBUTION-WITH-VALUE-ONE*", el_utilities.make_unary_formula(temporal_projection_cols.$const94$UniformPersistenceDistributionWit, (SubLObject)temporal_projection_cols.ONE_INTEGER));
        temporal_projection_cols.$tp_current_var$ = SubLFiles.defparameter("*TP-CURRENT-VAR*", (SubLObject)temporal_projection_cols.NIL);
        temporal_projection_cols.$temporal_projection_justifications$ = SubLFiles.defparameter("*TEMPORAL-PROJECTION-JUSTIFICATIONS*", (SubLObject)temporal_projection_cols.NIL);
        temporal_projection_cols.$mt_for_temporal_projection$ = SubLFiles.defparameter("*MT-FOR-TEMPORAL-PROJECTION*", (SubLObject)temporal_projection_cols.NIL);
        temporal_projection_cols.$temporal_projection_stack$ = SubLFiles.defparameter("*TEMPORAL-PROJECTION-STACK*", (SubLObject)temporal_projection_cols.NIL);
        temporal_projection_cols.$temporal_projection_answers$ = SubLFiles.defparameter("*TEMPORAL-PROJECTION-ANSWERS*", (SubLObject)temporal_projection_cols.NIL);
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    public static SubLObject setup_temporal_projection_cols_file() {
        return (SubLObject)temporal_projection_cols.NIL;
    }
    
    public void declareFunctions() {
        declare_temporal_projection_cols_file();
    }
    
    public void initializeVariables() {
        init_temporal_projection_cols_file();
    }
    
    public void runTopLevelForms() {
        setup_temporal_projection_cols_file();
    }
    
    static {
        me = (SubLFile)new temporal_projection_cols();
        temporal_projection_cols.$uniform_distribution_with_value_zero$ = null;
        temporal_projection_cols.$uniform_distribution_with_value_one$ = null;
        temporal_projection_cols.$tp_current_var$ = null;
        temporal_projection_cols.$temporal_projection_justifications$ = null;
        temporal_projection_cols.$mt_for_temporal_projection$ = null;
        temporal_projection_cols.$temporal_projection_stack$ = null;
        temporal_projection_cols.$temporal_projection_answers$ = null;
        $sym0$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $const1$startingPointOfIntervalForSentenc = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startingPointOfIntervalForSentence"));
        $const2$endingPointOfIntervalForSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endingPointOfIntervalForSentence"));
        $const3$temporallyIntersects = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallyIntersects"));
        $kw4$POS = SubLObjectFactory.makeKeyword("POS");
        $const5$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANON-CNF"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("BINDING-LIST"));
        $kw7$CODE = SubLObjectFactory.makeKeyword("CODE");
        $sym8$E = SubLObjectFactory.makeSymbol("E");
        $sym9$S = SubLObjectFactory.makeSymbol("S");
        $const10$TimeIntervalInclusiveFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn"));
        $const11$temporallySubsumes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes"));
        $const12$defaultConditionalProbabilityForS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultConditionalProbabilityForSentenceInInterval"));
        $const13$conditionalProbabilityForSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conditionalProbabilityForSentenceWhenTypeInArg"));
        $const14$defaultConditionalProbabilityOfSt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultConditionalProbabilityOfStateAfterIntervalOfLength"));
        $const15$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const16$conditionalProbabilityOfStateAfte = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conditionalProbabilityOfStateAfterIntervalOfLength-Backward"));
        $const17$defaultConditionalProbabilityForS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultConditionalProbabilityForSentenceInInterval-Backward"));
        $const18$conditionalProbabilityOfStateAfte = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conditionalProbabilityOfStateAfterIntervalOfLength-Forward"));
        $const19$defaultConditionalProbabilityForS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultConditionalProbabilityForSentenceInInterval-Forward"));
        $sym20$LIST_TIME_COMPARATOR = SubLObjectFactory.makeSymbol("LIST-TIME-COMPARATOR");
        $const21$timeElapsed = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("timeElapsed"));
        $const22$NumericLikelihoodFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NumericLikelihoodFn"));
        $const23$temporalInterpolationFunctionForP = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporalInterpolationFunctionForPredicate"));
        $const24$durationWeightedDistributionForPr = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("durationWeightedDistributionForPredicate"));
        $const25$duration = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("duration"));
        $const26$decayDistributionForAssertionInTi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("decayDistributionForAssertionInTimeInterval"));
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"));
        $sym28$_X = SubLObjectFactory.makeSymbol("?X");
        $sym29$_Y = SubLObjectFactory.makeSymbol("?Y");
        $const30$distributionForSentenceGivenNeces = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("distributionForSentenceGivenNecessaryCondition"));
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)SubLObjectFactory.makeSymbol("?Z"));
        $sym32$_Z = SubLObjectFactory.makeSymbol("?Z");
        $const33$conditionalProbabilityOfStateGive = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conditionalProbabilityOfStateGivenAbsenceOfNecessaryCondition"));
        $const34$distributionForSentenceGivenSuffi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("distributionForSentenceGivenSufficientCondition"));
        $const35$conditionalProbabilityPatternsFor = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conditionalProbabilityPatternsForPredicate"));
        $float36$0_001 = (SubLFloat)SubLObjectFactory.makeDouble(0.001);
        $sym37$FORMULA_ARG0 = SubLObjectFactory.makeSymbol("FORMULA-ARG0");
        $const38$delayBetweenStartOfEventTypesInSi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("delayBetweenStartOfEventTypesInSitType"));
        $const39$subEvents = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subEvents"));
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"));
        $const41$defaultDecayFunctionForPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultDecayFunctionForPredicate"));
        $const42$defaultDecayFunctionForPredicate_ = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultDecayFunctionForPredicate-Backward"));
        $const43$decayDistributionForSpecs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("decayDistributionForSpecs"));
        $const44$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const45$temporalInterpolationFunctionForC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporalInterpolationFunctionForCollection"));
        $const46$eventTypeEndsIntervalForState = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventTypeEndsIntervalForState"));
        $const47$eventTypeStartsIntervalForState = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventTypeStartsIntervalForState"));
        $const48$startingPointOfRiskPeriodForAsser = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startingPointOfRiskPeriodForAssertion"));
        $const49$intensityFunctionForEventTypeInIn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intensityFunctionForEventTypeInInterval"));
        $const50$startingDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startingDate"));
        $const51$evaluate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $const52$DateAfterFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DateAfterFn"));
        $const53$QuotientFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn"));
        $const54$PlusFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn"));
        $const55$intensityFunctionForEventType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intensityFunctionForEventType"));
        $const56$lessThan = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lessThan"));
        $const57$transitionProbabilityBetweenColle = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitionProbabilityBetweenCollections-Forward"));
        $list58 = ConsesLow.list((SubLObject)temporal_projection_cols.ZERO_INTEGER);
        $const59$startingPointForAssertion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startingPointForAssertion"));
        $const60$DateBeforeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DateBeforeFn"));
        $const61$DifferenceFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DifferenceFn"));
        $const62$laterThan = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("laterThan"));
        $str63$___query_result___a_diff__a_ = SubLObjectFactory.makeString("~% query-result: ~a diff ~a ");
        $str64$____a__a_ = SubLObjectFactory.makeString("~% ~a ~a ");
        $const65$maximumCardinalityOfCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maximumCardinalityOfCollection"));
        $const66$decayDistributionForAssertionInIn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("decayDistributionForAssertionInInterval"));
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?DATE"), (SubLObject)SubLObjectFactory.makeSymbol("?INTERVAL"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniformPersistenceDistributionWithValueFn")), (SubLObject)temporal_projection_cols.ONE_INTEGER));
        $sym68$_DATE = SubLObjectFactory.makeSymbol("?DATE");
        $sym69$_INTERVAL = SubLObjectFactory.makeSymbol("?INTERVAL");
        $list70 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniformPersistenceDistributionWithValueFn")), (SubLObject)temporal_projection_cols.ONE_INTEGER);
        $const71$conditionalProbabilityForCollecti = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conditionalProbabilityForCollections"));
        $const72$conditionalProbabilityForCollecti = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conditionalProbabilityForCollections-Negation"));
        $const73$delayBetweenCollections = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("delayBetweenCollections"));
        $sym74$MAX = SubLObjectFactory.makeSymbol("MAX");
        $const75$defaultDecayFunctionForCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultDecayFunctionForCollectionInInterval"));
        $const76$temporalRelationBetweenCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporalRelationBetweenCollections"));
        $list77 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConstantFunction")));
        $const78$decayDistributionForCollectionInI = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("decayDistributionForCollectionInIntervalWhenInstanceInSpec"));
        $const79$defaultDecayDistributionForCollec = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultDecayDistributionForCollection"));
        $const80$defaultDecayFunctionForCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultDecayFunctionForCollection-Backward"));
        $const81$ConstantFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConstantFunction"));
        $const82$defaultDecayFunctionForCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defaultDecayFunctionForCollection-Forward"));
        $list83 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("decayDistributionForSpecs-Collection")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)SubLObjectFactory.makeSymbol("?Z"), (SubLObject)SubLObjectFactory.makeSymbol("?W"));
        $sym84$_W = SubLObjectFactory.makeSymbol("?W");
        $const85$decayFunctionForCollectionInInter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("decayFunctionForCollectionInInterval-Backward"));
        $const86$decayDistributionForAssertionInIn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("decayDistributionForAssertionInInterval-Backwards"));
        $const87$hourNumberOfDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hourNumberOfDate"));
        $int88$23 = SubLObjectFactory.makeInteger(23);
        $const89$decayDistributionForAssertion_Cau = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("decayDistributionForAssertion-Causal"));
        $const90$endingDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endingDate"));
        $list91 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("decayDistributionForCollectionWhenTimeInInterval")), (SubLObject)SubLObjectFactory.makeSymbol("?COL"), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)SubLObjectFactory.makeSymbol("?Z"));
        $sym92$_COL = SubLObjectFactory.makeSymbol("?COL");
        $const93$InverseBinaryPredicateFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InverseBinaryPredicateFn"));
        $const94$UniformPersistenceDistributionWit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniformPersistenceDistributionWithValueFn"));
        $const95$dateOfEvent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent"));
        $const96$endsDuring = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endsDuring"));
        $const97$decayFunctionForPredicateInInterv = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("decayFunctionForPredicateInInterval"));
        $const98$decayFunctionForSpecsInInterval = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("decayFunctionForSpecsInInterval"));
        $const99$decayFunctionInInterval = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("decayFunctionInInterval"));
        $const100$intervalRange = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intervalRange"));
        $const101$PlusInfinity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusInfinity"));
        $const102$lessThanOrEqualTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lessThanOrEqualTo"));
        $const103$ExponentialDecayDistributionWithI = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExponentialDecayDistributionWithInitialValueFn"));
        $const104$ExponentialDecayDistributionWithI = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExponentialDecayDistributionWithInitialAndFinalValueFn"));
        $const105$BoundedExponentiallyIncreasingFun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BoundedExponentiallyIncreasingFunctionWithInitialValueFn"));
        $const106$NormalDistribution = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NormalDistribution"));
        $const107$LinearlyDecreasingFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LinearlyDecreasingFunction"));
        $const108$ExponentiallyDecreasingFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExponentiallyDecreasingFunction"));
        $const109$BoundedExponentiallyIncreasingFun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BoundedExponentiallyIncreasingFunction"));
        $const110$LinearlyIncreasingFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LinearlyIncreasingFunction"));
        $const111$ExponentialDecayDistributionWithP = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExponentialDecayDistributionWithParameterFn"));
        $const112$exponentialDecayDistributionWithP = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exponentialDecayDistributionWithParameter"));
        $int113$50 = SubLObjectFactory.makeInteger(50);
        $float114$2_71 = (SubLFloat)SubLObjectFactory.makeDouble(2.71);
        $const115$boundedExponentiallyIncreasingFun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("boundedExponentiallyIncreasingFunctionWithParameters"));
        $const116$boundedExponentiallyIncreasingFun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("boundedExponentiallyIncreasingFunctionWithInitialValue"));
        $const117$exponentialDecayDistributionWithI = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exponentialDecayDistributionWithInitialAndFinalValue"));
        $const118$exponentialDecayDistributionWithI = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exponentialDecayDistributionWithInitialValue"));
        $const119$uniformPersistenceDistributionWit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("uniformPersistenceDistributionWithValue"));
        $const120$normalDistributionWithParameters = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("normalDistributionWithParameters"));
        $float121$1_414 = (SubLFloat)SubLObjectFactory.makeDouble(1.414);
        $float122$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $const123$linearDecayFunctionWithSlope = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("linearDecayFunctionWithSlope"));
        $const124$linearlyIncreasingFunctionWithSlo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("linearlyIncreasingFunctionWithSlope"));
        $const125$MinusInfinity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinusInfinity"));
        $const126$greaterThan = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("greaterThan"));
        $const127$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $const128$SomeTimeInIntervalFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn"));
        $const129$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $const130$TimeIntervalBetweenFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalBetweenFn"));
        $const131$Now = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Now"));
        $const132$Now_Indexical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Now-Indexical"));
        $const133$indexicalReferent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexicalReferent"));
        $const134$TimeInterval = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeInterval"));
        $list135 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexicalReferent")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Now")), (SubLObject)SubLObjectFactory.makeSymbol("?X"));
        $const136$startsAfterEndingOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startsAfterEndingOf"));
        $sym137$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $sym138$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $const139$TimeDependentCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeDependentCollection"));
        $const140$TimeDependentRelation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeDependentRelation"));
        $const141$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $list142 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeDependentCollection")));
        $list143 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeDependentPredicate")));
        $const144$temporalRelationBetweenArguments = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporalRelationBetweenArguments"));
        $const145$endsAfterStartingOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endsAfterStartingOf"));
        $const146$FutureTensePredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FutureTensePredicate"));
        $const147$CoexistingObjectsPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoexistingObjectsPredicate"));
        $list148 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoexistingObjectsPredicate")));
        $const149$earliestDateForCollectionMembers = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("earliestDateForCollectionMembers"));
        $const150$Date = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Date"));
        $const151$BiologicalLivingObject = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BiologicalLivingObject"));
        $const152$argIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $const153$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $list154 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BiologicalLivingObject")));
        $const155$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $list156 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IndeterminateTerm")));
        $const157$valueEquals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("valueEquals"));
        $const158$TimeElapsedFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeElapsedFn"));
        $list159 = ConsesLow.list((SubLObject)temporal_projection_cols.ONE_INTEGER);
        $float160$0_278 = (SubLFloat)SubLObjectFactory.makeDouble(0.278);
        $float161$0_23 = (SubLFloat)SubLObjectFactory.makeDouble(0.23);
        $float162$8_999999999999999e_4 = (SubLFloat)SubLObjectFactory.makeDouble(8.999999999999999E-4);
        $float163$0_078 = (SubLFloat)SubLObjectFactory.makeDouble(0.078);
        $const164$startingPointOfSubIntervalForAsse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startingPointOfSubIntervalForAssertion"));
        $const165$endingPointOfSubIntervalForAssert = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endingPointOfSubIntervalForAssertion"));
        $sym166$_ = SubLObjectFactory.makeSymbol("*");
        $const167$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const168$MonthsDuration = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthsDuration"));
        $const169$Lambda = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Lambda"));
        $const170$TimesFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn"));
        $const171$ExponentFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExponentFn"));
        $float172$2_78 = (SubLFloat)SubLObjectFactory.makeDouble(2.78);
        $const173$MinusFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinusFn"));
        $kw174$INFERENCE_MODE = SubLObjectFactory.makeKeyword("INFERENCE-MODE");
        $kw175$MINIMAL = SubLObjectFactory.makeKeyword("MINIMAL");
        $kw176$ALLOW_INDETERMINATE_RESULTS_ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $kw177$DISJUNCTION_FREE_EL_VARS_POLICY = SubLObjectFactory.makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");
        $kw178$COMPUTE_INTERSECTION = SubLObjectFactory.makeKeyword("COMPUTE-INTERSECTION");
        $kw179$TRANSFORMATION_ALLOWED_ = SubLObjectFactory.makeKeyword("TRANSFORMATION-ALLOWED?");
        $kw180$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
        $kw181$NEW_TERMS_ALLOWED_ = SubLObjectFactory.makeKeyword("NEW-TERMS-ALLOWED?");
        $kw182$COMPUTE_ANSWER_JUSTIFICATIONS_ = SubLObjectFactory.makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
        $kw183$MAX_NUMBER = SubLObjectFactory.makeKeyword("MAX-NUMBER");
        $kw184$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $float185$0_01 = (SubLFloat)SubLObjectFactory.makeDouble(0.01);
        $kw186$PROBABLY_APPROXIMATELY_DONE = SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $float187$1_0 = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $kw188$MAX_PROOF_DEPTH = SubLObjectFactory.makeKeyword("MAX-PROOF-DEPTH");
        $kw189$ANSWER_LANGUAGE = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $kw190$HL = SubLObjectFactory.makeKeyword("HL");
        $kw191$CONTINUABLE_ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $kw192$PRODUCTIVITY_LIMIT = SubLObjectFactory.makeKeyword("PRODUCTIVITY-LIMIT");
        $int193$20000000 = SubLObjectFactory.makeInteger(20000000);
        $const194$priorProbabilityForPredicate_Type = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("priorProbabilityForPredicate-TypeType"));
        $sym195$LAMBDA_FUNCTION_ELT = SubLObjectFactory.makeSymbol("LAMBDA-FUNCTION-ELT");
        $const196$HomoSapiens = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HomoSapiens"));
        $const197$distributionForTerminationOfMembe = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("distributionForTerminationOfMembershipAfterIntervalOfLength"));
        $list198 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HomoSapiens")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BiologicalLivingObject")));
        $const199$distributionForCalculatingDuratio = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("distributionForCalculatingDurationOfSitType"));
        $float200$9_999999999999999e_7 = (SubLFloat)SubLObjectFactory.makeDouble(1.0E-6);
        $str201$___Time___a__a_Not_ending___a = SubLObjectFactory.makeString("~% Time: ~a ~a Not ending: ~a");
    }
}

/*

	Total time: 1548 ms
	
*/