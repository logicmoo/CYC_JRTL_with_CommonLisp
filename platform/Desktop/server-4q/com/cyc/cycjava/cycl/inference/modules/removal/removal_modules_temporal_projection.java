package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.temporal_projection_preds;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.temporal_projection;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.temporal_projection_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.temporal_projection_cols;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_temporal_projection extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_temporal_projection";
    public static final String myFingerPrint = "c1139927e9efdc5589369ce813ab55044c1f39ef9693bdacc9b31b80138c8af2";
    private static final SubLObject $const0$likelihoodOfTruthOfAssertionAtTim;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$REMOVAL_LIKELIHOOD_OF_ASSERTION_AT_TIME;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$OPAQUE;
    private static final SubLObject $const5$locationHasQualitativeTimeOfDayAt;
    private static final SubLSymbol $kw6$REMOVAL_LOCATION_HAS_QUALITATIVE_TIME_OF_DAY_AT_TIME;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$REMOVAL_LOCATION_HAS_QUALITATIVE_TIME_OF_DAY_AT_TIME_CHECK;
    private static final SubLList $list9;
    private static final SubLObject $const10$locationHasSunriseTime;
    private static final SubLSymbol $kw11$REMOVAL_LOCATION_SUNRISE_TIME;
    private static final SubLList $list12;
    private static final SubLObject $const13$localSunriseTimeForCoordinates;
    private static final SubLSymbol $kw14$REMOVAL_LOCAL_SUNRISE_TIME_FOR_COORDINATES;
    private static final SubLList $list15;
    private static final SubLObject $const16$localSunsetTimeForCoordinates;
    private static final SubLSymbol $kw17$REMOVAL_LOCAL_SUNSET_TIME_FOR_COORDINATES;
    private static final SubLList $list18;
    private static final SubLObject $const19$locationHasSunsetTime;
    private static final SubLSymbol $kw20$REMOVAL_LOCATION_SUNSET_TIME;
    private static final SubLList $list21;
    private static final SubLObject $const22$likelihoodOfTruthOfSentence;
    private static final SubLSymbol $kw23$REMOVAL_LIKELIHOOD_OF_TRUTH_OF_SENTENCE;
    private static final SubLList $list24;
    private static final SubLInteger $int25$100;
    private static final SubLObject $const26$NumericLikelihoodFn;
    private static final SubLObject $const27$timeIntervalsForSentence;
    private static final SubLSymbol $kw28$REMOVAL_TIME_INTERVALS_FOR_SENTENCE;
    private static final SubLList $list29;
    private static final SubLObject $const30$hasLevelOfOpaqueExpertiseOnTopicW;
    private static final SubLSymbol $kw31$REMOVAL_HAS_LEVEL_OF_OPAQUE_EXPERTISE_WITH_RATING;
    private static final SubLList $list32;
    private static final SubLObject $const33$timeIntervalsIntersect;
    private static final SubLSymbol $kw34$REMOVAL_TIME_INTERVALS_INTERSECT;
    private static final SubLList $list35;
    private static final SubLObject $const36$TimeIntervalInclusiveFn;
    private static final SubLObject $const37$likelyCloseAcquaintances;
    private static final SubLSymbol $kw38$REMOVAL_LIKELY_CLOSE_ACQUAINTANCES;
    private static final SubLList $list39;
    private static final SubLFloat $float40$0_5;
    private static final SubLSymbol $kw41$LANGUAGE_SPOKEN_VIA_PROJECTION;
    private static final SubLList $list42;
    private static final SubLSymbol $kw43$REMOVAL_LANGUAGE_SPOKEN;
    private static final SubLList $list44;
    private static final SubLObject $const45$averageDeviationFromGuidelinesInI;
    private static final SubLSymbol $kw46$REMOVAL_AVERAGE_DEVIATION_FROM_GUIDELINES_IN_INTERVAL;
    private static final SubLList $list47;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 1570L)
    public static SubLObject removal_likelihood_of_assertion_at_time(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_temporal_projection.UNPROVIDED) {
            sense = (SubLObject)removal_modules_temporal_projection.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fact = cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject time = cycl_utilities.formula_arg2(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject result = temporal_projection_cols.get_persistence_likelihood_for_fact_at_time(fact, time, (SubLObject)removal_modules_temporal_projection.T, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(var, result, (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        if (removal_modules_temporal_projection.NIL != result && removal_modules_temporal_projection.NIL != justification && justification.isList()) {
            backward.removal_add_node(justification.first(), v_bindings, justification.rest());
        }
        if (removal_modules_temporal_projection.NIL != result && (removal_modules_temporal_projection.NIL == justification || !justification.isList())) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_temporal_projection.$kw4$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED), v_bindings, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        }
        return (SubLObject)removal_modules_temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 3152L)
    public static SubLObject removal_location_has_qualitative_time_of_day_at_time(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_temporal_projection.UNPROVIDED) {
            sense = (SubLObject)removal_modules_temporal_projection.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject location = cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject time = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject results = temporal_projection_utilities.location_has_qualitative_time_of_day_at_time(location, time, mt_relevance_macros.$mt$.getDynamicValue(thread));
        if (!results.isList()) {
            return (SubLObject)removal_modules_temporal_projection.NIL;
        }
        SubLObject cdolist_list_var = results;
        SubLObject result = (SubLObject)removal_modules_temporal_projection.NIL;
        result = cdolist_list_var.first();
        while (removal_modules_temporal_projection.NIL != cdolist_list_var) {
            final SubLObject v_answer = cycl_utilities.formula_arg0(result);
            final SubLObject justification = cycl_utilities.formula_arg1(result, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
            final SubLObject v_bindings = unification_utilities.term_unify(var, v_answer, (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
            if (removal_modules_temporal_projection.NIL != result && removal_modules_temporal_projection.NIL != justification) {
                backward.removal_add_node(justification.first(), v_bindings, justification.rest());
            }
            if (removal_modules_temporal_projection.NIL != result && removal_modules_temporal_projection.NIL == justification) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_temporal_projection.$kw4$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED), v_bindings, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        if (removal_modules_temporal_projection.NIL == results) {
            return (SubLObject)removal_modules_temporal_projection.NIL;
        }
        return (SubLObject)removal_modules_temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 4520L)
    public static SubLObject removal_location_has_qualitative_time_of_day_at_time_check(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_temporal_projection.UNPROVIDED) {
            sense = (SubLObject)removal_modules_temporal_projection.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject location = cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject time = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject v_answer = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject result = temporal_projection_utilities.location_has_qualitative_time_of_day_at_time(location, time, mt_relevance_macros.$mt$.getDynamicValue(thread));
        SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        justification = (SubLObject)removal_modules_temporal_projection.NIL;
        if (!result.isList()) {
            return (SubLObject)removal_modules_temporal_projection.NIL;
        }
        if (removal_modules_temporal_projection.NIL != conses_high.member(v_answer, result, Symbols.symbol_function((SubLObject)removal_modules_temporal_projection.EQUAL), (SubLObject)removal_modules_temporal_projection.UNPROVIDED)) {
            final SubLObject v_bindings = (SubLObject)removal_modules_temporal_projection.NIL;
            if (removal_modules_temporal_projection.NIL != result && removal_modules_temporal_projection.NIL != justification) {
                backward.removal_add_node(justification.first(), v_bindings, justification.rest());
            }
            if (removal_modules_temporal_projection.NIL != result && removal_modules_temporal_projection.NIL == justification) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_temporal_projection.$kw4$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED), v_bindings, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
            }
        }
        return (SubLObject)removal_modules_temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 5921L)
    public static SubLObject removal_location_has_sunrise_time(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_temporal_projection.UNPROVIDED) {
            sense = (SubLObject)removal_modules_temporal_projection.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject location = cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject result = temporal_projection_utilities.location_has_sunrise_time(location, mt_relevance_macros.$mt$.getDynamicValue(thread));
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(var, result, (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        if (removal_modules_temporal_projection.NIL != result && removal_modules_temporal_projection.NIL != justification) {
            backward.removal_add_node(justification.first(), v_bindings, justification.rest());
        }
        if (removal_modules_temporal_projection.NIL != result && removal_modules_temporal_projection.NIL == justification) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_temporal_projection.$kw4$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED), v_bindings, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        }
        return (SubLObject)removal_modules_temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 7343L)
    public static SubLObject removal_local_sunrise_time_for_coordinates(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_temporal_projection.UNPROVIDED) {
            sense = (SubLObject)removal_modules_temporal_projection.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject latitude = cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject longitude = cycl_utilities.formula_arg2(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject date = cycl_utilities.formula_arg3(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg4(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject result = temporal_projection_utilities.local_sunrise_time_for_coordinates(latitude, longitude, date, mt_relevance_macros.$mt$.getDynamicValue(thread));
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(var, result, (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        if (removal_modules_temporal_projection.NIL != result && removal_modules_temporal_projection.NIL != justification && removal_modules_temporal_projection.NIL != arguments.hl_justification_p(justification)) {
            backward.removal_add_node(justification.first(), v_bindings, justification.rest());
        }
        if (removal_modules_temporal_projection.NIL != result && (removal_modules_temporal_projection.NIL == arguments.hl_justification_p(justification) || removal_modules_temporal_projection.NIL == justification)) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_temporal_projection.$kw4$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED), v_bindings, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        }
        return (SubLObject)removal_modules_temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 8935L)
    public static SubLObject removal_local_sunset_time_for_coordinates(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_temporal_projection.UNPROVIDED) {
            sense = (SubLObject)removal_modules_temporal_projection.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject latitude = cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject longitude = cycl_utilities.formula_arg2(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject date = cycl_utilities.formula_arg3(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg4(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject result = temporal_projection_utilities.local_sunset_time_for_coordinates(latitude, longitude, date, mt_relevance_macros.$mt$.getDynamicValue(thread));
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(var, result, (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        if (removal_modules_temporal_projection.NIL != result && removal_modules_temporal_projection.NIL != justification && removal_modules_temporal_projection.NIL != arguments.hl_justification_p(justification)) {
            backward.removal_add_node(justification.first(), v_bindings, justification.rest());
        }
        if (removal_modules_temporal_projection.NIL != result && (removal_modules_temporal_projection.NIL == arguments.hl_justification_p(justification) || removal_modules_temporal_projection.NIL == justification)) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_temporal_projection.$kw4$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED), v_bindings, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        }
        return (SubLObject)removal_modules_temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 10292L)
    public static SubLObject removal_location_has_sunset_time(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_temporal_projection.UNPROVIDED) {
            sense = (SubLObject)removal_modules_temporal_projection.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject location = cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject result = temporal_projection_utilities.location_has_sunset_time(location, mt_relevance_macros.$mt$.getDynamicValue(thread));
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(var, result, (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        if (removal_modules_temporal_projection.NIL != result && removal_modules_temporal_projection.NIL != justification) {
            backward.removal_add_node(justification.first(), v_bindings, justification.rest());
        }
        if (removal_modules_temporal_projection.NIL != result && removal_modules_temporal_projection.NIL == justification) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_temporal_projection.$kw4$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED), v_bindings, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        }
        return (SubLObject)removal_modules_temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 11564L)
    public static SubLObject removal_likelihood_of_truth_of_sentence(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_temporal_projection.UNPROVIDED) {
            sense = (SubLObject)removal_modules_temporal_projection.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sent = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject result = temporal_projection.likelihood_of_truth_of_sentence(sent, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_temporal_projection.T);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_temporal_projection.NIL != result) {
            final SubLObject val = cycl_utilities.formula_arg1(result, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
            final SubLObject rounded_number = Numbers.divide(Numbers.floor(Numbers.multiply(val, (SubLObject)removal_modules_temporal_projection.$int25$100), (SubLObject)removal_modules_temporal_projection.UNPROVIDED), (SubLObject)removal_modules_temporal_projection.$int25$100);
            final SubLObject v_answer = (SubLObject)ConsesLow.list(removal_modules_temporal_projection.$const26$NumericLikelihoodFn, rounded_number);
            final SubLObject v_bindings = unification_utilities.term_unify(var, v_answer, (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
            if (removal_modules_temporal_projection.NIL != result && justification.isList()) {
                backward.removal_add_node(justification.first(), v_bindings, justification.rest());
            }
            if (removal_modules_temporal_projection.NIL != result && removal_modules_temporal_projection.NIL == Types.listp(justification)) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_temporal_projection.$kw4$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED), v_bindings, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
            }
        }
        return (SubLObject)removal_modules_temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 12999L)
    public static SubLObject removal_time_intervals_for_sentence(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_temporal_projection.UNPROVIDED) {
            sense = (SubLObject)removal_modules_temporal_projection.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sent = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject ret_value = cdolist_list_var = temporal_projection.time_intervals_for_sentence(sent, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_temporal_projection.T, (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        SubLObject entry = (SubLObject)removal_modules_temporal_projection.NIL;
        entry = cdolist_list_var.first();
        while (removal_modules_temporal_projection.NIL != cdolist_list_var) {
            final SubLObject result = cycl_utilities.formula_arg0(entry);
            final SubLObject justification = cycl_utilities.formula_arg1(entry, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
            final SubLObject v_bindings = unification_utilities.term_unify(var, result, (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
            if (removal_modules_temporal_projection.NIL != result && justification.isList()) {
                backward.removal_add_node(justification.first(), v_bindings, justification.rest());
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 14431L)
    public static SubLObject removal_has_level_of_opaque_expertise_on_topic_with_rating(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_temporal_projection.UNPROVIDED) {
            sense = (SubLObject)removal_modules_temporal_projection.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        SubLObject rounded_number = (SubLObject)removal_modules_temporal_projection.NIL;
        thread.resetMultipleValues();
        final SubLObject result = temporal_projection_preds.find_level_of_opaque_expertise_on_topic_with_rating(asent, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_temporal_projection.T);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (!cycl_utilities.formula_arg1(result, (SubLObject)removal_modules_temporal_projection.UNPROVIDED).isNumber()) {
            return (SubLObject)removal_modules_temporal_projection.NIL;
        }
        rounded_number = Numbers.divide(Numbers.floor(Numbers.multiply(cycl_utilities.formula_arg1(result, (SubLObject)removal_modules_temporal_projection.UNPROVIDED), (SubLObject)removal_modules_temporal_projection.$int25$100), (SubLObject)removal_modules_temporal_projection.UNPROVIDED), (SubLObject)removal_modules_temporal_projection.$int25$100);
        final SubLObject v_bindings = unification_utilities.term_unify(var, rounded_number, (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        if (removal_modules_temporal_projection.NIL != result && justification.isList()) {
            backward.removal_add_node(justification.first(), v_bindings, justification.rest());
        }
        if (removal_modules_temporal_projection.NIL != result) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_temporal_projection.$kw4$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED), v_bindings, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        }
        return (SubLObject)removal_modules_temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 15911L)
    public static SubLObject removal_time_intervals_intersect(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_temporal_projection.UNPROVIDED) {
            sense = (SubLObject)removal_modules_temporal_projection.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interval_1 = cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject interval_2 = cycl_utilities.formula_arg2(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject result = time_intervals_intersectP(interval_1, interval_2);
        SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        justification = (SubLObject)removal_modules_temporal_projection.NIL;
        if (removal_modules_temporal_projection.NIL != result && removal_modules_temporal_projection.NIL == justification) {
            final SubLObject v_bindings = (SubLObject)removal_modules_temporal_projection.NIL;
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_temporal_projection.$kw4$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED), v_bindings, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        }
        return (SubLObject)removal_modules_temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 16435L)
    public static SubLObject time_intervals_intersectP(final SubLObject interval_1, final SubLObject interval_2) {
        final SubLObject temporal_function_1 = cycl_utilities.formula_arg0(interval_1);
        final SubLObject initial_point_1 = cycl_utilities.formula_arg1(interval_1, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject final_point_1 = cycl_utilities.formula_arg2(interval_1, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject temporal_function_2 = cycl_utilities.formula_arg0(interval_2);
        final SubLObject initial_point_2 = cycl_utilities.formula_arg1(interval_2, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject final_point_2 = cycl_utilities.formula_arg2(interval_2, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        if (interval_1.equal(interval_2)) {
            return Values.values((SubLObject)removal_modules_temporal_projection.T, (SubLObject)removal_modules_temporal_projection.NIL);
        }
        if (!temporal_function_1.eql(removal_modules_temporal_projection.$const36$TimeIntervalInclusiveFn) || !temporal_function_2.eql(removal_modules_temporal_projection.$const36$TimeIntervalInclusiveFn)) {
            return (SubLObject)removal_modules_temporal_projection.NIL;
        }
        if (initial_point_1.equal(final_point_2) || initial_point_1.equal(initial_point_2) || final_point_1.equal(initial_point_2) || final_point_1.equal(final_point_2)) {
            return Values.values((SubLObject)removal_modules_temporal_projection.T, (SubLObject)removal_modules_temporal_projection.NIL);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean((removal_modules_temporal_projection.NIL != date_utilities.later_than(final_point_1, initial_point_2) && removal_modules_temporal_projection.NIL != date_utilities.later_than(initial_point_2, initial_point_1)) || (removal_modules_temporal_projection.NIL != date_utilities.later_than(final_point_2, initial_point_1) && removal_modules_temporal_projection.NIL != date_utilities.later_than(initial_point_1, initial_point_2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 18204L)
    public static SubLObject removal_likely_close_acquaintances(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_temporal_projection.UNPROVIDED) {
            sense = (SubLObject)removal_modules_temporal_projection.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject var = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        SubLObject rounded_number = (SubLObject)removal_modules_temporal_projection.NIL;
        thread.resetMultipleValues();
        final SubLObject result = temporal_projection_preds.find_likelihood_of_acquaintances(asent, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_temporal_projection.T);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (!cycl_utilities.formula_arg1(result, (SubLObject)removal_modules_temporal_projection.UNPROVIDED).isNumber()) {
            return (SubLObject)removal_modules_temporal_projection.NIL;
        }
        rounded_number = Numbers.divide(Numbers.floor(Numbers.multiply(cycl_utilities.formula_arg1(result, (SubLObject)removal_modules_temporal_projection.UNPROVIDED), (SubLObject)removal_modules_temporal_projection.$int25$100), (SubLObject)removal_modules_temporal_projection.UNPROVIDED), (SubLObject)removal_modules_temporal_projection.$int25$100);
        final SubLObject v_bindings = unification_utilities.term_unify(var, rounded_number, (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        if (rounded_number.numG((SubLObject)removal_modules_temporal_projection.$float40$0_5)) {
            if (removal_modules_temporal_projection.NIL != result && justification.isList()) {
                backward.removal_add_node(justification.first(), v_bindings, justification.rest());
            }
            if (removal_modules_temporal_projection.NIL == result) {
                return (SubLObject)removal_modules_temporal_projection.NIL;
            }
        }
        return (SubLObject)removal_modules_temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 19576L)
    public static SubLObject removal_language_spoken(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_temporal_projection.UNPROVIDED) {
            sense = (SubLObject)removal_modules_temporal_projection.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rounded_number = (SubLObject)removal_modules_temporal_projection.NIL;
        final SubLObject var = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject result = temporal_projection_preds.find_likelihood_of_language_spoken(asent, mt_relevance_macros.$mt$.getDynamicValue(thread));
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (!cycl_utilities.formula_arg1(result, (SubLObject)removal_modules_temporal_projection.UNPROVIDED).isNumber()) {
            return (SubLObject)removal_modules_temporal_projection.NIL;
        }
        rounded_number = Numbers.divide(Numbers.floor(Numbers.multiply(cycl_utilities.formula_arg1(result, (SubLObject)removal_modules_temporal_projection.UNPROVIDED), (SubLObject)removal_modules_temporal_projection.$int25$100), (SubLObject)removal_modules_temporal_projection.UNPROVIDED), (SubLObject)removal_modules_temporal_projection.$int25$100);
        final SubLObject v_bindings = unification_utilities.term_unify(var, rounded_number, (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        if (rounded_number.numG((SubLObject)removal_modules_temporal_projection.$float40$0_5) && removal_modules_temporal_projection.NIL != result && removal_modules_temporal_projection.NIL != arguments.hl_justification_p(justification)) {
            backward.removal_add_node(justification.first(), v_bindings, justification.rest());
        }
        if (removal_modules_temporal_projection.NIL == result) {
            return (SubLObject)removal_modules_temporal_projection.NIL;
        }
        return (SubLObject)removal_modules_temporal_projection.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 21264L)
    public static SubLObject removal_average_deviation_from_guidelines_in_interval(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_temporal_projection.UNPROVIDED) {
            sense = (SubLObject)removal_modules_temporal_projection.NIL;
        }
        final SubLObject gauge = cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject interval_1 = cycl_utilities.formula_arg2(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject interval_2 = cycl_utilities.formula_arg3(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject var = cycl_utilities.formula_arg4(asent, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        final SubLObject result = Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("CALCULATE-AVERAGE-DEVIATION-FROM-GUIDELINES-IN-INTERVAL"), gauge, interval_1, interval_2);
        if (removal_modules_temporal_projection.NIL != result) {
            final SubLObject v_bindings = unification_utilities.term_unify(var, result, (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_temporal_projection.$kw4$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_temporal_projection.UNPROVIDED, (SubLObject)removal_modules_temporal_projection.UNPROVIDED), v_bindings, (SubLObject)removal_modules_temporal_projection.UNPROVIDED);
        }
        return (SubLObject)removal_modules_temporal_projection.NIL;
    }
    
    public static SubLObject declare_removal_modules_temporal_projection_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_temporal_projection", "removal_likelihood_of_assertion_at_time", "REMOVAL-LIKELIHOOD-OF-ASSERTION-AT-TIME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_temporal_projection", "removal_location_has_qualitative_time_of_day_at_time", "REMOVAL-LOCATION-HAS-QUALITATIVE-TIME-OF-DAY-AT-TIME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_temporal_projection", "removal_location_has_qualitative_time_of_day_at_time_check", "REMOVAL-LOCATION-HAS-QUALITATIVE-TIME-OF-DAY-AT-TIME-CHECK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_temporal_projection", "removal_location_has_sunrise_time", "REMOVAL-LOCATION-HAS-SUNRISE-TIME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_temporal_projection", "removal_local_sunrise_time_for_coordinates", "REMOVAL-LOCAL-SUNRISE-TIME-FOR-COORDINATES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_temporal_projection", "removal_local_sunset_time_for_coordinates", "REMOVAL-LOCAL-SUNSET-TIME-FOR-COORDINATES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_temporal_projection", "removal_location_has_sunset_time", "REMOVAL-LOCATION-HAS-SUNSET-TIME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_temporal_projection", "removal_likelihood_of_truth_of_sentence", "REMOVAL-LIKELIHOOD-OF-TRUTH-OF-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_temporal_projection", "removal_time_intervals_for_sentence", "REMOVAL-TIME-INTERVALS-FOR-SENTENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_temporal_projection", "removal_has_level_of_opaque_expertise_on_topic_with_rating", "REMOVAL-HAS-LEVEL-OF-OPAQUE-EXPERTISE-ON-TOPIC-WITH-RATING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_temporal_projection", "removal_time_intervals_intersect", "REMOVAL-TIME-INTERVALS-INTERSECT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_temporal_projection", "time_intervals_intersectP", "TIME-INTERVALS-INTERSECT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_temporal_projection", "removal_likely_close_acquaintances", "REMOVAL-LIKELY-CLOSE-ACQUAINTANCES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_temporal_projection", "removal_language_spoken", "REMOVAL-LANGUAGE-SPOKEN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_temporal_projection", "removal_average_deviation_from_guidelines_in_interval", "REMOVAL-AVERAGE-DEVIATION-FROM-GUIDELINES-IN-INTERVAL", 1, 1, false);
        return (SubLObject)removal_modules_temporal_projection.NIL;
    }
    
    public static SubLObject init_removal_modules_temporal_projection_file() {
        return (SubLObject)removal_modules_temporal_projection.NIL;
    }
    
    public static SubLObject setup_removal_modules_temporal_projection_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_temporal_projection.$const0$likelihoodOfTruthOfAssertionAtTim);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const0$likelihoodOfTruthOfAssertionAtTim, (SubLObject)removal_modules_temporal_projection.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const0$likelihoodOfTruthOfAssertionAtTim, (SubLObject)removal_modules_temporal_projection.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_temporal_projection.$kw2$REMOVAL_LIKELIHOOD_OF_ASSERTION_AT_TIME, (SubLObject)removal_modules_temporal_projection.$list3);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_temporal_projection.$const5$locationHasQualitativeTimeOfDayAt);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const5$locationHasQualitativeTimeOfDayAt, (SubLObject)removal_modules_temporal_projection.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const5$locationHasQualitativeTimeOfDayAt, (SubLObject)removal_modules_temporal_projection.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_temporal_projection.$kw6$REMOVAL_LOCATION_HAS_QUALITATIVE_TIME_OF_DAY_AT_TIME, (SubLObject)removal_modules_temporal_projection.$list7);
        inference_modules.inference_removal_module((SubLObject)removal_modules_temporal_projection.$kw8$REMOVAL_LOCATION_HAS_QUALITATIVE_TIME_OF_DAY_AT_TIME_CHECK, (SubLObject)removal_modules_temporal_projection.$list9);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_temporal_projection.$const10$locationHasSunriseTime);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const10$locationHasSunriseTime, (SubLObject)removal_modules_temporal_projection.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_temporal_projection.$kw11$REMOVAL_LOCATION_SUNRISE_TIME, (SubLObject)removal_modules_temporal_projection.$list12);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_temporal_projection.$const13$localSunriseTimeForCoordinates);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const13$localSunriseTimeForCoordinates, (SubLObject)removal_modules_temporal_projection.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const13$localSunriseTimeForCoordinates, (SubLObject)removal_modules_temporal_projection.TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const13$localSunriseTimeForCoordinates, (SubLObject)removal_modules_temporal_projection.THREE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_temporal_projection.$kw14$REMOVAL_LOCAL_SUNRISE_TIME_FOR_COORDINATES, (SubLObject)removal_modules_temporal_projection.$list15);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_temporal_projection.$const16$localSunsetTimeForCoordinates);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const16$localSunsetTimeForCoordinates, (SubLObject)removal_modules_temporal_projection.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const16$localSunsetTimeForCoordinates, (SubLObject)removal_modules_temporal_projection.TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const16$localSunsetTimeForCoordinates, (SubLObject)removal_modules_temporal_projection.THREE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_temporal_projection.$kw17$REMOVAL_LOCAL_SUNSET_TIME_FOR_COORDINATES, (SubLObject)removal_modules_temporal_projection.$list18);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_temporal_projection.$const19$locationHasSunsetTime);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const19$locationHasSunsetTime, (SubLObject)removal_modules_temporal_projection.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_temporal_projection.$kw20$REMOVAL_LOCATION_SUNSET_TIME, (SubLObject)removal_modules_temporal_projection.$list21);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_temporal_projection.$const22$likelihoodOfTruthOfSentence);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const22$likelihoodOfTruthOfSentence, (SubLObject)removal_modules_temporal_projection.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_temporal_projection.$kw23$REMOVAL_LIKELIHOOD_OF_TRUTH_OF_SENTENCE, (SubLObject)removal_modules_temporal_projection.$list24);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_temporal_projection.$const27$timeIntervalsForSentence);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const27$timeIntervalsForSentence, (SubLObject)removal_modules_temporal_projection.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_temporal_projection.$kw28$REMOVAL_TIME_INTERVALS_FOR_SENTENCE, (SubLObject)removal_modules_temporal_projection.$list29);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_temporal_projection.$const30$hasLevelOfOpaqueExpertiseOnTopicW);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const30$hasLevelOfOpaqueExpertiseOnTopicW, (SubLObject)removal_modules_temporal_projection.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const30$hasLevelOfOpaqueExpertiseOnTopicW, (SubLObject)removal_modules_temporal_projection.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_temporal_projection.$kw31$REMOVAL_HAS_LEVEL_OF_OPAQUE_EXPERTISE_WITH_RATING, (SubLObject)removal_modules_temporal_projection.$list32);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_temporal_projection.$const33$timeIntervalsIntersect);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const33$timeIntervalsIntersect, (SubLObject)removal_modules_temporal_projection.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const33$timeIntervalsIntersect, (SubLObject)removal_modules_temporal_projection.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_temporal_projection.$kw34$REMOVAL_TIME_INTERVALS_INTERSECT, (SubLObject)removal_modules_temporal_projection.$list35);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const37$likelyCloseAcquaintances, (SubLObject)removal_modules_temporal_projection.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const37$likelyCloseAcquaintances, (SubLObject)removal_modules_temporal_projection.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_temporal_projection.$kw38$REMOVAL_LIKELY_CLOSE_ACQUAINTANCES, (SubLObject)removal_modules_temporal_projection.$list39);
        preference_modules.inference_preference_module((SubLObject)removal_modules_temporal_projection.$kw41$LANGUAGE_SPOKEN_VIA_PROJECTION, (SubLObject)removal_modules_temporal_projection.$list42);
        inference_modules.inference_removal_module((SubLObject)removal_modules_temporal_projection.$kw43$REMOVAL_LANGUAGE_SPOKEN, (SubLObject)removal_modules_temporal_projection.$list44);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_temporal_projection.$const45$averageDeviationFromGuidelinesInI);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const45$averageDeviationFromGuidelinesInI, (SubLObject)removal_modules_temporal_projection.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const45$averageDeviationFromGuidelinesInI, (SubLObject)removal_modules_temporal_projection.TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_temporal_projection.$kw1$POS, removal_modules_temporal_projection.$const45$averageDeviationFromGuidelinesInI, (SubLObject)removal_modules_temporal_projection.THREE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_temporal_projection.$kw46$REMOVAL_AVERAGE_DEVIATION_FROM_GUIDELINES_IN_INTERVAL, (SubLObject)removal_modules_temporal_projection.$list47);
        return (SubLObject)removal_modules_temporal_projection.NIL;
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
        me = (SubLFile)new removal_modules_temporal_projection();
        $const0$likelihoodOfTruthOfAssertionAtTim = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("likelihoodOfTruthOfAssertionAtTime"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$REMOVAL_LIKELIHOOD_OF_ASSERTION_AT_TIME = SubLObjectFactory.makeKeyword("REMOVAL-LIKELIHOOD-OF-ASSERTION-AT-TIME");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("likelihoodOfTruthOfAssertionAtTime")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("likelihoodOfTruthOfAssertionAtTime")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_temporal_projection.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-LIKELIHOOD-OF-ASSERTION-AT-TIME"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$likelihoodOfTruthOfAssertionAtTime  <ASSERTION> <TIME> ?x)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString(" ") });
        $kw4$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $const5$locationHasQualitativeTimeOfDayAt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("locationHasQualitativeTimeOfDayAtTime"));
        $kw6$REMOVAL_LOCATION_HAS_QUALITATIVE_TIME_OF_DAY_AT_TIME = SubLObjectFactory.makeKeyword("REMOVAL-LOCATION-HAS-QUALITATIVE-TIME-OF-DAY-AT-TIME");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("locationHasQualitativeTimeOfDayAtTime")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("locationHasQualitativeTimeOfDayAtTime")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_temporal_projection.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-LOCATION-HAS-QUALITATIVE-TIME-OF-DAY-AT-TIME"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$locationHasQualitativeTimeOfDayAtTime  <LOCATION> <TIME> ?x)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString(" ") });
        $kw8$REMOVAL_LOCATION_HAS_QUALITATIVE_TIME_OF_DAY_AT_TIME_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-LOCATION-HAS-QUALITATIVE-TIME-OF-DAY-AT-TIME-CHECK");
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("locationHasQualitativeTimeOfDayAtTime")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("locationHasQualitativeTimeOfDayAtTime")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_temporal_projection.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-LOCATION-HAS-QUALITATIVE-TIME-OF-DAY-AT-TIME-CHECK"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$changePointsOfTimeSeries  <LOCATION> <TIME> <TYPE>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString(" ") });
        $const10$locationHasSunriseTime = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("locationHasSunriseTime"));
        $kw11$REMOVAL_LOCATION_SUNRISE_TIME = SubLObjectFactory.makeKeyword("REMOVAL-LOCATION-SUNRISE-TIME");
        $list12 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("locationHasSunriseTime")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("locationHasSunriseTime")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_temporal_projection.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-LOCATION-HAS-SUNRISE-TIME"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$locationHasSunriseTime  <LOCATION> ?x)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString(" ") });
        $const13$localSunriseTimeForCoordinates = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("localSunriseTimeForCoordinates"));
        $kw14$REMOVAL_LOCAL_SUNRISE_TIME_FOR_COORDINATES = SubLObjectFactory.makeKeyword("REMOVAL-LOCAL-SUNRISE-TIME-FOR-COORDINATES");
        $list15 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("localSunriseTimeForCoordinates")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("localSunriseTimeForCoordinates")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_temporal_projection.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-LOCAL-SUNRISE-TIME-FOR-COORDINATES"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$localSunriseTimeForCoordinates  <LATITUDE> <LONGITUDE> <DATE> ?x)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString(" ") });
        $const16$localSunsetTimeForCoordinates = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("localSunsetTimeForCoordinates"));
        $kw17$REMOVAL_LOCAL_SUNSET_TIME_FOR_COORDINATES = SubLObjectFactory.makeKeyword("REMOVAL-LOCAL-SUNSET-TIME-FOR-COORDINATES");
        $list18 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("localSunsetTimeForCoordinates")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("localSunsetTimeForCoordinates")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_temporal_projection.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-LOCAL-SUNSET-TIME-FOR-COORDINATES"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$localSunsetTimeForCoordinates  <LATITUDE> <LONGITUDE> <DATE> ?x)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString(" ") });
        $const19$locationHasSunsetTime = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("locationHasSunsetTime"));
        $kw20$REMOVAL_LOCATION_SUNSET_TIME = SubLObjectFactory.makeKeyword("REMOVAL-LOCATION-SUNSET-TIME");
        $list21 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("locationHasSunsetTime")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("locationHasSunsetTime")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_temporal_projection.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-LOCATION-HAS-SUNSET-TIME"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$locationHasSunsetTime  <LOCATION> ?x)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString(" ") });
        $const22$likelihoodOfTruthOfSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("likelihoodOfTruthOfSentence"));
        $kw23$REMOVAL_LIKELIHOOD_OF_TRUTH_OF_SENTENCE = SubLObjectFactory.makeKeyword("REMOVAL-LIKELIHOOD-OF-TRUTH-OF-SENTENCE");
        $list24 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("likelihoodOfTruthOfSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("likelihoodOfTruthOfSentence")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_temporal_projection.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-LIKELIHOOD-OF-TRUTH-OF-SENTENCE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$likelihoodOfTruthOfSentence  <SENTENCE> ?x)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString(" ") });
        $int25$100 = SubLObjectFactory.makeInteger(100);
        $const26$NumericLikelihoodFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NumericLikelihoodFn"));
        $const27$timeIntervalsForSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("timeIntervalsForSentence"));
        $kw28$REMOVAL_TIME_INTERVALS_FOR_SENTENCE = SubLObjectFactory.makeKeyword("REMOVAL-TIME-INTERVALS-FOR-SENTENCE");
        $list29 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("timeIntervalsForSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("timeIntervalsForSentence")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_temporal_projection.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TIME-INTERVALS-FOR-SENTENCE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$timeIntervalsForSentence  <SENTENCE> ?x)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString(" ") });
        $const30$hasLevelOfOpaqueExpertiseOnTopicW = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasLevelOfOpaqueExpertiseOnTopicWithRating"));
        $kw31$REMOVAL_HAS_LEVEL_OF_OPAQUE_EXPERTISE_WITH_RATING = SubLObjectFactory.makeKeyword("REMOVAL-HAS-LEVEL-OF-OPAQUE-EXPERTISE-WITH-RATING");
        $list32 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasLevelOfOpaqueExpertiseOnTopicWithRating")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasLevelOfOpaqueExpertiseOnTopicWithRating")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_temporal_projection.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-HAS-LEVEL-OF-OPAQUE-EXPERTISE-ON-TOPIC-WITH-RATING"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$hasLevelOfOpaqueExpertiseOnTopicWithRating  <SENTENCE> <bound> ?x)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString(" ") });
        $const33$timeIntervalsIntersect = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("timeIntervalsIntersect"));
        $kw34$REMOVAL_TIME_INTERVALS_INTERSECT = SubLObjectFactory.makeKeyword("REMOVAL-TIME-INTERVALS-INTERSECT");
        $list35 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("timeIntervalsIntersect")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("timeIntervalsIntersect")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_temporal_projection.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TIME-INTERVALS-INTERSECT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$timeIntervalsIntersect  <INTERVAL-1> <INTERVAL-2>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString(" ") });
        $const36$TimeIntervalInclusiveFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn"));
        $const37$likelyCloseAcquaintances = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("likelyCloseAcquaintances"));
        $kw38$REMOVAL_LIKELY_CLOSE_ACQUAINTANCES = SubLObjectFactory.makeKeyword("REMOVAL-LIKELY-CLOSE-ACQUAINTANCES");
        $list39 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("likelyCloseAcquaintances")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("likelyCloseAcquaintances")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_temporal_projection.THREE_INTEGER, SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-LIKELY-CLOSE-ACQUAINTANCES"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$likelihoodOfTruthOfSentence  <SENTENCE> ?x)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString(" ") });
        $float40$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $kw41$LANGUAGE_SPOKEN_VIA_PROJECTION = SubLObjectFactory.makeKeyword("LANGUAGE-SPOKEN-VIA-PROJECTION");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("languageSpoken")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("languageSpoken")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISPREFERRED"));
        $kw43$REMOVAL_LANGUAGE_SPOKEN = SubLObjectFactory.makeKeyword("REMOVAL-LANGUAGE-SPOKEN");
        $list44 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("languageSpoken")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("languageSpoken")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_temporal_projection.THREE_INTEGER, SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-LANGUAGE-SPOKEN"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$languageSpoken  <PERSON> <LANGUAGE>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString(" ") });
        $const45$averageDeviationFromGuidelinesInI = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("averageDeviationFromGuidelinesInInterval"));
        $kw46$REMOVAL_AVERAGE_DEVIATION_FROM_GUIDELINES_IN_INTERVAL = SubLObjectFactory.makeKeyword("REMOVAL-AVERAGE-DEVIATION-FROM-GUIDELINES-IN-INTERVAL");
        $list47 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("averageDeviationFromGuidelinesInInterval")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("averageDeviationFromGuidelinesInInterval")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_temporal_projection.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-AVERAGE-DEVIATION-FROM-GUIDELINES-IN-INTERVAL"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$averageDeviationFromGuidelinesInInterval <GAUGE>  <SHUT-IN-INTERVAL> <RAMP-UP-INTERVAL> ?DEVIATION)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString(" ") });
    }
}

/*

	Total time: 133 ms
	
*/