package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.temporal_projection;
import com.cyc.cycjava.cycl.temporal_projection_cols;
import com.cyc.cycjava.cycl.temporal_projection_preds;
import com.cyc.cycjava.cycl.temporal_projection_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_temporal_projection extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new removal_modules_temporal_projection();



    private static final SubLObject $const0$likelihoodOfTruthOfAssertionAtTim = reader_make_constant_shell(makeString("likelihoodOfTruthOfAssertionAtTime"));



    private static final SubLSymbol $REMOVAL_LIKELIHOOD_OF_ASSERTION_AT_TIME = makeKeyword("REMOVAL-LIKELIHOOD-OF-ASSERTION-AT-TIME");

    private static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("likelihoodOfTruthOfAssertionAtTime")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("likelihoodOfTruthOfAssertionAtTime")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LIKELIHOOD-OF-ASSERTION-AT-TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$likelihoodOfTruthOfAssertionAtTime  <ASSERTION> <TIME> ?x)"), makeKeyword("EXAMPLE"), makeString(" ") });



    private static final SubLObject $const5$locationHasQualitativeTimeOfDayAt = reader_make_constant_shell(makeString("locationHasQualitativeTimeOfDayAtTime"));

    private static final SubLSymbol $REMOVAL_LOCATION_HAS_QUALITATIVE_TIME_OF_DAY_AT_TIME = makeKeyword("REMOVAL-LOCATION-HAS-QUALITATIVE-TIME-OF-DAY-AT-TIME");

    private static final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("locationHasQualitativeTimeOfDayAtTime")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("locationHasQualitativeTimeOfDayAtTime")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LOCATION-HAS-QUALITATIVE-TIME-OF-DAY-AT-TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$locationHasQualitativeTimeOfDayAtTime  <LOCATION> <TIME> ?x)"), makeKeyword("EXAMPLE"), makeString(" ") });

    private static final SubLSymbol $REMOVAL_LOCATION_HAS_QUALITATIVE_TIME_OF_DAY_AT_TIME_CHECK = makeKeyword("REMOVAL-LOCATION-HAS-QUALITATIVE-TIME-OF-DAY-AT-TIME-CHECK");

    private static final SubLList $list9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("locationHasQualitativeTimeOfDayAtTime")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("locationHasQualitativeTimeOfDayAtTime")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LOCATION-HAS-QUALITATIVE-TIME-OF-DAY-AT-TIME-CHECK"), makeKeyword("DOCUMENTATION"), makeString("(#$changePointsOfTimeSeries  <LOCATION> <TIME> <TYPE>)"), makeKeyword("EXAMPLE"), makeString(" ") });

    private static final SubLObject $$locationHasSunriseTime = reader_make_constant_shell(makeString("locationHasSunriseTime"));

    private static final SubLSymbol $REMOVAL_LOCATION_SUNRISE_TIME = makeKeyword("REMOVAL-LOCATION-SUNRISE-TIME");

    private static final SubLList $list12 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("locationHasSunriseTime")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("locationHasSunriseTime")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LOCATION-HAS-SUNRISE-TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$locationHasSunriseTime  <LOCATION> ?x)"), makeKeyword("EXAMPLE"), makeString(" ") });

    private static final SubLObject $$localSunriseTimeForCoordinates = reader_make_constant_shell(makeString("localSunriseTimeForCoordinates"));

    private static final SubLSymbol $REMOVAL_LOCAL_SUNRISE_TIME_FOR_COORDINATES = makeKeyword("REMOVAL-LOCAL-SUNRISE-TIME-FOR-COORDINATES");

    private static final SubLList $list15 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("localSunriseTimeForCoordinates")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("localSunriseTimeForCoordinates")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LOCAL-SUNRISE-TIME-FOR-COORDINATES"), makeKeyword("DOCUMENTATION"), makeString("(#$localSunriseTimeForCoordinates  <LATITUDE> <LONGITUDE> <DATE> ?x)"), makeKeyword("EXAMPLE"), makeString(" ") });

    private static final SubLObject $$localSunsetTimeForCoordinates = reader_make_constant_shell(makeString("localSunsetTimeForCoordinates"));

    private static final SubLSymbol $REMOVAL_LOCAL_SUNSET_TIME_FOR_COORDINATES = makeKeyword("REMOVAL-LOCAL-SUNSET-TIME-FOR-COORDINATES");

    private static final SubLList $list18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("localSunsetTimeForCoordinates")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("localSunsetTimeForCoordinates")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LOCAL-SUNSET-TIME-FOR-COORDINATES"), makeKeyword("DOCUMENTATION"), makeString("(#$localSunsetTimeForCoordinates  <LATITUDE> <LONGITUDE> <DATE> ?x)"), makeKeyword("EXAMPLE"), makeString(" ") });

    private static final SubLObject $$locationHasSunsetTime = reader_make_constant_shell(makeString("locationHasSunsetTime"));

    private static final SubLSymbol $REMOVAL_LOCATION_SUNSET_TIME = makeKeyword("REMOVAL-LOCATION-SUNSET-TIME");

    private static final SubLList $list21 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("locationHasSunsetTime")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("locationHasSunsetTime")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LOCATION-HAS-SUNSET-TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$locationHasSunsetTime  <LOCATION> ?x)"), makeKeyword("EXAMPLE"), makeString(" ") });

    private static final SubLObject $$likelihoodOfTruthOfSentence = reader_make_constant_shell(makeString("likelihoodOfTruthOfSentence"));

    private static final SubLSymbol $REMOVAL_LIKELIHOOD_OF_TRUTH_OF_SENTENCE = makeKeyword("REMOVAL-LIKELIHOOD-OF-TRUTH-OF-SENTENCE");

    private static final SubLList $list24 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("likelihoodOfTruthOfSentence")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("likelihoodOfTruthOfSentence")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LIKELIHOOD-OF-TRUTH-OF-SENTENCE"), makeKeyword("DOCUMENTATION"), makeString("(#$likelihoodOfTruthOfSentence  <SENTENCE> ?x)"), makeKeyword("EXAMPLE"), makeString(" ") });



    private static final SubLObject $$NumericLikelihoodFn = reader_make_constant_shell(makeString("NumericLikelihoodFn"));

    private static final SubLObject $$timeIntervalsForSentence = reader_make_constant_shell(makeString("timeIntervalsForSentence"));

    private static final SubLSymbol $REMOVAL_TIME_INTERVALS_FOR_SENTENCE = makeKeyword("REMOVAL-TIME-INTERVALS-FOR-SENTENCE");

    private static final SubLList $list29 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("timeIntervalsForSentence")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("timeIntervalsForSentence")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TIME-INTERVALS-FOR-SENTENCE"), makeKeyword("DOCUMENTATION"), makeString("(#$timeIntervalsForSentence  <SENTENCE> ?x)"), makeKeyword("EXAMPLE"), makeString(" ") });

    private static final SubLObject $const30$hasLevelOfOpaqueExpertiseOnTopicW = reader_make_constant_shell(makeString("hasLevelOfOpaqueExpertiseOnTopicWithRating"));

    private static final SubLSymbol $REMOVAL_HAS_LEVEL_OF_OPAQUE_EXPERTISE_WITH_RATING = makeKeyword("REMOVAL-HAS-LEVEL-OF-OPAQUE-EXPERTISE-WITH-RATING");

    private static final SubLList $list32 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("hasLevelOfOpaqueExpertiseOnTopicWithRating")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("hasLevelOfOpaqueExpertiseOnTopicWithRating")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-HAS-LEVEL-OF-OPAQUE-EXPERTISE-ON-TOPIC-WITH-RATING"), makeKeyword("DOCUMENTATION"), makeString("(#$hasLevelOfOpaqueExpertiseOnTopicWithRating  <SENTENCE> <bound> ?x)"), makeKeyword("EXAMPLE"), makeString(" ") });

    private static final SubLObject $$timeIntervalsIntersect = reader_make_constant_shell(makeString("timeIntervalsIntersect"));

    private static final SubLSymbol $REMOVAL_TIME_INTERVALS_INTERSECT = makeKeyword("REMOVAL-TIME-INTERVALS-INTERSECT");

    private static final SubLList $list35 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("timeIntervalsIntersect")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("timeIntervalsIntersect")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TIME-INTERVALS-INTERSECT"), makeKeyword("DOCUMENTATION"), makeString("(#$timeIntervalsIntersect  <INTERVAL-1> <INTERVAL-2>)"), makeKeyword("EXAMPLE"), makeString(" ") });

    private static final SubLObject $$TimeIntervalInclusiveFn = reader_make_constant_shell(makeString("TimeIntervalInclusiveFn"));

    private static final SubLObject $$likelyCloseAcquaintances = reader_make_constant_shell(makeString("likelyCloseAcquaintances"));

    private static final SubLSymbol $REMOVAL_LIKELY_CLOSE_ACQUAINTANCES = makeKeyword("REMOVAL-LIKELY-CLOSE-ACQUAINTANCES");

    private static final SubLList $list39 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("likelyCloseAcquaintances")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("likelyCloseAcquaintances")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("EXPAND"), makeSymbol("REMOVAL-LIKELY-CLOSE-ACQUAINTANCES"), makeKeyword("DOCUMENTATION"), makeString("(#$likelihoodOfTruthOfSentence  <SENTENCE> ?x)"), makeKeyword("EXAMPLE"), makeString(" ") });

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLSymbol $LANGUAGE_SPOKEN_VIA_PROJECTION = makeKeyword("LANGUAGE-SPOKEN-VIA-PROJECTION");

    private static final SubLList $list42 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("languageSpoken")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("languageSpoken")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_LANGUAGE_SPOKEN = makeKeyword("REMOVAL-LANGUAGE-SPOKEN");

    private static final SubLList $list44 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("languageSpoken")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("languageSpoken")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("EXPAND"), makeSymbol("REMOVAL-LANGUAGE-SPOKEN"), makeKeyword("DOCUMENTATION"), makeString("(#$languageSpoken  <PERSON> <LANGUAGE>)"), makeKeyword("EXAMPLE"), makeString(" ") });

    private static final SubLObject $const45$averageDeviationFromGuidelinesInI = reader_make_constant_shell(makeString("averageDeviationFromGuidelinesInInterval"));

    private static final SubLSymbol $REMOVAL_AVERAGE_DEVIATION_FROM_GUIDELINES_IN_INTERVAL = makeKeyword("REMOVAL-AVERAGE-DEVIATION-FROM-GUIDELINES-IN-INTERVAL");

    private static final SubLList $list47 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("averageDeviationFromGuidelinesInInterval")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("averageDeviationFromGuidelinesInInterval")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-AVERAGE-DEVIATION-FROM-GUIDELINES-IN-INTERVAL"), makeKeyword("DOCUMENTATION"), makeString("(#$averageDeviationFromGuidelinesInInterval <GAUGE>  <SHUT-IN-INTERVAL> <RAMP-UP-INTERVAL> ?DEVIATION)"), makeKeyword("EXAMPLE"), makeString(" ") });

    public static SubLObject removal_likelihood_of_assertion_at_time(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fact = cycl_utilities.formula_arg1(asent, UNPROVIDED);
        final SubLObject time = cycl_utilities.formula_arg2(asent, UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject result = temporal_projection_cols.get_persistence_likelihood_for_fact_at_time(fact, time, T, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(var, result, UNPROVIDED, UNPROVIDED);
        if (((NIL != result) && (NIL != justification)) && justification.isList()) {
            backward.removal_add_node(justification.first(), v_bindings, justification.rest());
        }
        if ((NIL != result) && ((NIL == justification) || (!justification.isList()))) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_location_has_qualitative_time_of_day_at_time(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject location = cycl_utilities.formula_arg1(asent, UNPROVIDED);
        final SubLObject time = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject results = temporal_projection_utilities.location_has_qualitative_time_of_day_at_time(location, time, mt_relevance_macros.$mt$.getDynamicValue(thread));
        if (!results.isList()) {
            return NIL;
        }
        SubLObject cdolist_list_var = results;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_answer = cycl_utilities.formula_arg0(result);
            final SubLObject justification = cycl_utilities.formula_arg1(result, UNPROVIDED);
            final SubLObject v_bindings = unification_utilities.term_unify(var, v_answer, UNPROVIDED, UNPROVIDED);
            if ((NIL != result) && (NIL != justification)) {
                backward.removal_add_node(justification.first(), v_bindings, justification.rest());
            }
            if ((NIL != result) && (NIL == justification)) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        if (NIL == results) {
            return NIL;
        }
        return NIL;
    }

    public static SubLObject removal_location_has_qualitative_time_of_day_at_time_check(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject location = cycl_utilities.formula_arg1(asent, UNPROVIDED);
        final SubLObject time = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject v_answer = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject result = temporal_projection_utilities.location_has_qualitative_time_of_day_at_time(location, time, mt_relevance_macros.$mt$.getDynamicValue(thread));
        SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        justification = NIL;
        if (!result.isList()) {
            return NIL;
        }
        if (NIL != member(v_answer, result, symbol_function(EQUAL), UNPROVIDED)) {
            final SubLObject v_bindings = NIL;
            if ((NIL != result) && (NIL != justification)) {
                backward.removal_add_node(justification.first(), v_bindings, justification.rest());
            }
            if ((NIL != result) && (NIL == justification)) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject removal_location_has_sunrise_time(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject location = cycl_utilities.formula_arg1(asent, UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject result = temporal_projection_utilities.location_has_sunrise_time(location, mt_relevance_macros.$mt$.getDynamicValue(thread));
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(var, result, UNPROVIDED, UNPROVIDED);
        if ((NIL != result) && (NIL != justification)) {
            backward.removal_add_node(justification.first(), v_bindings, justification.rest());
        }
        if ((NIL != result) && (NIL == justification)) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_local_sunrise_time_for_coordinates(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject latitude = cycl_utilities.formula_arg1(asent, UNPROVIDED);
        final SubLObject longitude = cycl_utilities.formula_arg2(asent, UNPROVIDED);
        final SubLObject date = cycl_utilities.formula_arg3(asent, UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg4(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject result = temporal_projection_utilities.local_sunrise_time_for_coordinates(latitude, longitude, date, mt_relevance_macros.$mt$.getDynamicValue(thread));
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(var, result, UNPROVIDED, UNPROVIDED);
        if (((NIL != result) && (NIL != justification)) && (NIL != arguments.hl_justification_p(justification))) {
            backward.removal_add_node(justification.first(), v_bindings, justification.rest());
        }
        if ((NIL != result) && ((NIL == arguments.hl_justification_p(justification)) || (NIL == justification))) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_local_sunset_time_for_coordinates(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject latitude = cycl_utilities.formula_arg1(asent, UNPROVIDED);
        final SubLObject longitude = cycl_utilities.formula_arg2(asent, UNPROVIDED);
        final SubLObject date = cycl_utilities.formula_arg3(asent, UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg4(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject result = temporal_projection_utilities.local_sunset_time_for_coordinates(latitude, longitude, date, mt_relevance_macros.$mt$.getDynamicValue(thread));
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(var, result, UNPROVIDED, UNPROVIDED);
        if (((NIL != result) && (NIL != justification)) && (NIL != arguments.hl_justification_p(justification))) {
            backward.removal_add_node(justification.first(), v_bindings, justification.rest());
        }
        if ((NIL != result) && ((NIL == arguments.hl_justification_p(justification)) || (NIL == justification))) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_location_has_sunset_time(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject location = cycl_utilities.formula_arg1(asent, UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject result = temporal_projection_utilities.location_has_sunset_time(location, mt_relevance_macros.$mt$.getDynamicValue(thread));
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(var, result, UNPROVIDED, UNPROVIDED);
        if ((NIL != result) && (NIL != justification)) {
            backward.removal_add_node(justification.first(), v_bindings, justification.rest());
        }
        if ((NIL != result) && (NIL == justification)) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_likelihood_of_truth_of_sentence(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sent = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject result = temporal_projection.likelihood_of_truth_of_sentence(sent, mt_relevance_macros.$mt$.getDynamicValue(thread), T);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != result) {
            final SubLObject val = cycl_utilities.formula_arg1(result, UNPROVIDED);
            final SubLObject rounded_number = divide(floor(multiply(val, $int$100), UNPROVIDED), $int$100);
            final SubLObject v_answer = list($$NumericLikelihoodFn, rounded_number);
            final SubLObject v_bindings = unification_utilities.term_unify(var, v_answer, UNPROVIDED, UNPROVIDED);
            if ((NIL != result) && justification.isList()) {
                backward.removal_add_node(justification.first(), v_bindings, justification.rest());
            }
            if ((NIL != result) && (NIL == listp(justification))) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject removal_time_intervals_for_sentence(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sent = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject ret_value = cdolist_list_var = temporal_projection.time_intervals_for_sentence(sent, mt_relevance_macros.$mt$.getDynamicValue(thread), T, UNPROVIDED, UNPROVIDED);
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject result = cycl_utilities.formula_arg0(entry);
            final SubLObject justification = cycl_utilities.formula_arg1(entry, UNPROVIDED);
            final SubLObject v_bindings = unification_utilities.term_unify(var, result, UNPROVIDED, UNPROVIDED);
            if ((NIL != result) && justification.isList()) {
                backward.removal_add_node(justification.first(), v_bindings, justification.rest());
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_has_level_of_opaque_expertise_on_topic_with_rating(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject rounded_number = NIL;
        thread.resetMultipleValues();
        final SubLObject result = temporal_projection_preds.find_level_of_opaque_expertise_on_topic_with_rating(asent, mt_relevance_macros.$mt$.getDynamicValue(thread), T);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (!cycl_utilities.formula_arg1(result, UNPROVIDED).isNumber()) {
            return NIL;
        }
        rounded_number = divide(floor(multiply(cycl_utilities.formula_arg1(result, UNPROVIDED), $int$100), UNPROVIDED), $int$100);
        final SubLObject v_bindings = unification_utilities.term_unify(var, rounded_number, UNPROVIDED, UNPROVIDED);
        if ((NIL != result) && justification.isList()) {
            backward.removal_add_node(justification.first(), v_bindings, justification.rest());
        }
        if (NIL != result) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_time_intervals_intersect(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interval_1 = cycl_utilities.formula_arg1(asent, UNPROVIDED);
        final SubLObject interval_2 = cycl_utilities.formula_arg2(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject result = time_intervals_intersectP(interval_1, interval_2);
        SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        justification = NIL;
        if ((NIL != result) && (NIL == justification)) {
            final SubLObject v_bindings = NIL;
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject time_intervals_intersectP(final SubLObject interval_1, final SubLObject interval_2) {
        final SubLObject temporal_function_1 = cycl_utilities.formula_arg0(interval_1);
        final SubLObject initial_point_1 = cycl_utilities.formula_arg1(interval_1, UNPROVIDED);
        final SubLObject final_point_1 = cycl_utilities.formula_arg2(interval_1, UNPROVIDED);
        final SubLObject temporal_function_2 = cycl_utilities.formula_arg0(interval_2);
        final SubLObject initial_point_2 = cycl_utilities.formula_arg1(interval_2, UNPROVIDED);
        final SubLObject final_point_2 = cycl_utilities.formula_arg2(interval_2, UNPROVIDED);
        if (interval_1.equal(interval_2)) {
            return values(T, NIL);
        }
        if ((!temporal_function_1.eql($$TimeIntervalInclusiveFn)) || (!temporal_function_2.eql($$TimeIntervalInclusiveFn))) {
            return NIL;
        }
        if (((initial_point_1.equal(final_point_2) || initial_point_1.equal(initial_point_2)) || final_point_1.equal(initial_point_2)) || final_point_1.equal(final_point_2)) {
            return values(T, NIL);
        }
        return makeBoolean(((NIL != date_utilities.later_than(final_point_1, initial_point_2)) && (NIL != date_utilities.later_than(initial_point_2, initial_point_1))) || ((NIL != date_utilities.later_than(final_point_2, initial_point_1)) && (NIL != date_utilities.later_than(initial_point_1, initial_point_2))));
    }

    public static SubLObject removal_likely_close_acquaintances(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject rounded_number = NIL;
        thread.resetMultipleValues();
        final SubLObject result = temporal_projection_preds.find_likelihood_of_acquaintances(asent, mt_relevance_macros.$mt$.getDynamicValue(thread), T);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (!cycl_utilities.formula_arg1(result, UNPROVIDED).isNumber()) {
            return NIL;
        }
        rounded_number = divide(floor(multiply(cycl_utilities.formula_arg1(result, UNPROVIDED), $int$100), UNPROVIDED), $int$100);
        final SubLObject v_bindings = unification_utilities.term_unify(var, rounded_number, UNPROVIDED, UNPROVIDED);
        if (rounded_number.numG($float$0_5)) {
            if ((NIL != result) && justification.isList()) {
                backward.removal_add_node(justification.first(), v_bindings, justification.rest());
            }
            if (NIL == result) {
                return NIL;
            }
        }
        return NIL;
    }

    public static SubLObject removal_language_spoken(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rounded_number = NIL;
        final SubLObject var = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject result = temporal_projection_preds.find_likelihood_of_language_spoken(asent, mt_relevance_macros.$mt$.getDynamicValue(thread));
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (!cycl_utilities.formula_arg1(result, UNPROVIDED).isNumber()) {
            return NIL;
        }
        rounded_number = divide(floor(multiply(cycl_utilities.formula_arg1(result, UNPROVIDED), $int$100), UNPROVIDED), $int$100);
        final SubLObject v_bindings = unification_utilities.term_unify(var, rounded_number, UNPROVIDED, UNPROVIDED);
        if ((rounded_number.numG($float$0_5) && (NIL != result)) && (NIL != arguments.hl_justification_p(justification))) {
            backward.removal_add_node(justification.first(), v_bindings, justification.rest());
        }
        if (NIL == result) {
            return NIL;
        }
        return NIL;
    }

    public static SubLObject removal_average_deviation_from_guidelines_in_interval(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject gauge = cycl_utilities.formula_arg1(asent, UNPROVIDED);
        final SubLObject interval_1 = cycl_utilities.formula_arg2(asent, UNPROVIDED);
        final SubLObject interval_2 = cycl_utilities.formula_arg3(asent, UNPROVIDED);
        final SubLObject var = cycl_utilities.formula_arg4(asent, UNPROVIDED);
        final SubLObject result = funcall(makeSymbol("CALCULATE-AVERAGE-DEVIATION-FROM-GUIDELINES-IN-INTERVAL"), gauge, interval_1, interval_2);
        if (NIL != result) {
            final SubLObject v_bindings = unification_utilities.term_unify(var, result, UNPROVIDED, UNPROVIDED);
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_temporal_projection_file() {
        declareFunction("removal_likelihood_of_assertion_at_time", "REMOVAL-LIKELIHOOD-OF-ASSERTION-AT-TIME", 1, 1, false);
        declareFunction("removal_location_has_qualitative_time_of_day_at_time", "REMOVAL-LOCATION-HAS-QUALITATIVE-TIME-OF-DAY-AT-TIME", 1, 1, false);
        declareFunction("removal_location_has_qualitative_time_of_day_at_time_check", "REMOVAL-LOCATION-HAS-QUALITATIVE-TIME-OF-DAY-AT-TIME-CHECK", 1, 1, false);
        declareFunction("removal_location_has_sunrise_time", "REMOVAL-LOCATION-HAS-SUNRISE-TIME", 1, 1, false);
        declareFunction("removal_local_sunrise_time_for_coordinates", "REMOVAL-LOCAL-SUNRISE-TIME-FOR-COORDINATES", 1, 1, false);
        declareFunction("removal_local_sunset_time_for_coordinates", "REMOVAL-LOCAL-SUNSET-TIME-FOR-COORDINATES", 1, 1, false);
        declareFunction("removal_location_has_sunset_time", "REMOVAL-LOCATION-HAS-SUNSET-TIME", 1, 1, false);
        declareFunction("removal_likelihood_of_truth_of_sentence", "REMOVAL-LIKELIHOOD-OF-TRUTH-OF-SENTENCE", 1, 1, false);
        declareFunction("removal_time_intervals_for_sentence", "REMOVAL-TIME-INTERVALS-FOR-SENTENCE", 1, 1, false);
        declareFunction("removal_has_level_of_opaque_expertise_on_topic_with_rating", "REMOVAL-HAS-LEVEL-OF-OPAQUE-EXPERTISE-ON-TOPIC-WITH-RATING", 1, 1, false);
        declareFunction("removal_time_intervals_intersect", "REMOVAL-TIME-INTERVALS-INTERSECT", 1, 1, false);
        declareFunction("time_intervals_intersectP", "TIME-INTERVALS-INTERSECT?", 2, 0, false);
        declareFunction("removal_likely_close_acquaintances", "REMOVAL-LIKELY-CLOSE-ACQUAINTANCES", 1, 1, false);
        declareFunction("removal_language_spoken", "REMOVAL-LANGUAGE-SPOKEN", 1, 1, false);
        declareFunction("removal_average_deviation_from_guidelines_in_interval", "REMOVAL-AVERAGE-DEVIATION-FROM-GUIDELINES-IN-INTERVAL", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_temporal_projection_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_temporal_projection_file() {
        inference_modules.register_solely_specific_removal_module_predicate($const0$likelihoodOfTruthOfAssertionAtTim);
        preference_modules.doomed_unless_arg_bindable($POS, $const0$likelihoodOfTruthOfAssertionAtTim, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const0$likelihoodOfTruthOfAssertionAtTim, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_LIKELIHOOD_OF_ASSERTION_AT_TIME, $list3);
        inference_modules.register_solely_specific_removal_module_predicate($const5$locationHasQualitativeTimeOfDayAt);
        preference_modules.doomed_unless_arg_bindable($POS, $const5$locationHasQualitativeTimeOfDayAt, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const5$locationHasQualitativeTimeOfDayAt, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_LOCATION_HAS_QUALITATIVE_TIME_OF_DAY_AT_TIME, $list7);
        inference_modules.inference_removal_module($REMOVAL_LOCATION_HAS_QUALITATIVE_TIME_OF_DAY_AT_TIME_CHECK, $list9);
        inference_modules.register_solely_specific_removal_module_predicate($$locationHasSunriseTime);
        preference_modules.doomed_unless_arg_bindable($POS, $$locationHasSunriseTime, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_LOCATION_SUNRISE_TIME, $list12);
        inference_modules.register_solely_specific_removal_module_predicate($$localSunriseTimeForCoordinates);
        preference_modules.doomed_unless_arg_bindable($POS, $$localSunriseTimeForCoordinates, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$localSunriseTimeForCoordinates, TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$localSunriseTimeForCoordinates, THREE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_LOCAL_SUNRISE_TIME_FOR_COORDINATES, $list15);
        inference_modules.register_solely_specific_removal_module_predicate($$localSunsetTimeForCoordinates);
        preference_modules.doomed_unless_arg_bindable($POS, $$localSunsetTimeForCoordinates, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$localSunsetTimeForCoordinates, TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$localSunsetTimeForCoordinates, THREE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_LOCAL_SUNSET_TIME_FOR_COORDINATES, $list18);
        inference_modules.register_solely_specific_removal_module_predicate($$locationHasSunsetTime);
        preference_modules.doomed_unless_arg_bindable($POS, $$locationHasSunsetTime, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_LOCATION_SUNSET_TIME, $list21);
        inference_modules.register_solely_specific_removal_module_predicate($$likelihoodOfTruthOfSentence);
        preference_modules.doomed_unless_arg_bindable($POS, $$likelihoodOfTruthOfSentence, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_LIKELIHOOD_OF_TRUTH_OF_SENTENCE, $list24);
        inference_modules.register_solely_specific_removal_module_predicate($$timeIntervalsForSentence);
        preference_modules.doomed_unless_arg_bindable($POS, $$timeIntervalsForSentence, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_TIME_INTERVALS_FOR_SENTENCE, $list29);
        inference_modules.register_solely_specific_removal_module_predicate($const30$hasLevelOfOpaqueExpertiseOnTopicW);
        preference_modules.doomed_unless_arg_bindable($POS, $const30$hasLevelOfOpaqueExpertiseOnTopicW, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const30$hasLevelOfOpaqueExpertiseOnTopicW, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_HAS_LEVEL_OF_OPAQUE_EXPERTISE_WITH_RATING, $list32);
        inference_modules.register_solely_specific_removal_module_predicate($$timeIntervalsIntersect);
        preference_modules.doomed_unless_arg_bindable($POS, $$timeIntervalsIntersect, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$timeIntervalsIntersect, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_TIME_INTERVALS_INTERSECT, $list35);
        preference_modules.doomed_unless_arg_bindable($POS, $$likelyCloseAcquaintances, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $$likelyCloseAcquaintances, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_LIKELY_CLOSE_ACQUAINTANCES, $list39);
        preference_modules.inference_preference_module($LANGUAGE_SPOKEN_VIA_PROJECTION, $list42);
        inference_modules.inference_removal_module($REMOVAL_LANGUAGE_SPOKEN, $list44);
        inference_modules.register_solely_specific_removal_module_predicate($const45$averageDeviationFromGuidelinesInI);
        preference_modules.doomed_unless_arg_bindable($POS, $const45$averageDeviationFromGuidelinesInI, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const45$averageDeviationFromGuidelinesInI, TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const45$averageDeviationFromGuidelinesInI, THREE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_AVERAGE_DEVIATION_FROM_GUIDELINES_IN_INTERVAL, $list47);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_temporal_projection_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_temporal_projection_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_temporal_projection_file();
    }

    static {

















































    }
}

/**
 * Total time: 133 ms
 */
