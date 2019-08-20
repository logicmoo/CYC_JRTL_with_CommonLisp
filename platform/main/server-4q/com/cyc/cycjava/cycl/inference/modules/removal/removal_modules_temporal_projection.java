package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.constant_handles;
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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_temporal_projection extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myFingerPrint = "c1139927e9efdc5589369ce813ab55044c1f39ef9693bdacc9b31b80138c8af2";
	private static SubLObject $const0$likelihoodOfTruthOfAssertionAtTim;
	private static SubLSymbol $kw$POS;
	private static SubLSymbol $kw$REMOVAL_LIKELIHOOD_OF_ASSERTION_AT_TIME;
	private static SubLList $list3;
	private static SubLSymbol $kw$OPAQUE;
	private static SubLObject $const5$locationHasQualitativeTimeOfDayAt;
	private static SubLSymbol $kw$REMOVAL_LOCATION_HAS_QUALITATIVE_TIME_OF_DAY_AT_TIME;
	private static SubLList $list7;
	private static SubLSymbol $kw$REMOVAL_LOCATION_HAS_QUALITATIVE_TIME_OF_DAY_AT_TIME_CHECK;
	private static SubLList $list9;
	private static SubLObject $const10$locationHasSunriseTime;
	private static SubLSymbol $kw$REMOVAL_LOCATION_SUNRISE_TIME;
	private static SubLList $list12;
	private static SubLObject $const13$localSunriseTimeForCoordinates;
	private static SubLSymbol $kw$REMOVAL_LOCAL_SUNRISE_TIME_FOR_COORDINATES;
	private static SubLList $list15;
	private static SubLObject $const16$localSunsetTimeForCoordinates;
	private static SubLSymbol $kw$REMOVAL_LOCAL_SUNSET_TIME_FOR_COORDINATES;
	private static SubLList $list18;
	private static SubLObject $const19$locationHasSunsetTime;
	private static SubLSymbol $kw$REMOVAL_LOCATION_SUNSET_TIME;
	private static SubLList $list21;
	private static SubLObject $const22$likelihoodOfTruthOfSentence;
	private static SubLSymbol $kw$REMOVAL_LIKELIHOOD_OF_TRUTH_OF_SENTENCE;
	private static SubLList $list24;
	private static SubLInteger $int25$100;
	private static SubLObject $const26$NumericLikelihoodFn;
	private static SubLObject $const27$timeIntervalsForSentence;
	private static SubLSymbol $kw$REMOVAL_TIME_INTERVALS_FOR_SENTENCE;
	private static SubLList $list29;
	private static SubLObject $const30$hasLevelOfOpaqueExpertiseOnTopicW;
	private static SubLSymbol $kw$REMOVAL_HAS_LEVEL_OF_OPAQUE_EXPERTISE_WITH_RATING;
	private static SubLList $list32;
	private static SubLObject $const33$timeIntervalsIntersect;
	private static SubLSymbol $kw$REMOVAL_TIME_INTERVALS_INTERSECT;
	private static SubLList $list35;
	private static SubLObject $const36$TimeIntervalInclusiveFn;
	private static SubLObject $const37$likelyCloseAcquaintances;
	private static SubLSymbol $kw$REMOVAL_LIKELY_CLOSE_ACQUAINTANCES;
	private static SubLList $list39;
	private static SubLFloat $float40$0_5;
	private static SubLSymbol $kw$LANGUAGE_SPOKEN_VIA_PROJECTION;
	private static SubLList $list42;
	private static SubLSymbol $kw$REMOVAL_LANGUAGE_SPOKEN;
	private static SubLList $list44;
	private static SubLObject $const45$averageDeviationFromGuidelinesInI;
	private static SubLSymbol $kw$REMOVAL_AVERAGE_DEVIATION_FROM_GUIDELINES_IN_INTERVAL;
	private static SubLList $list47;

	@SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 1500L)
	public static SubLObject removal_likelihood_of_assertion_at_time(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject fact = cycl_utilities.formula_arg1(asent, UNPROVIDED);
		SubLObject time = cycl_utilities.formula_arg2(asent, UNPROVIDED);
		SubLObject var = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		thread.resetMultipleValues();
		SubLObject result = temporal_projection_cols.get_persistence_likelihood_for_fact_at_time(fact, time, T,
				mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
		SubLObject justification = thread.secondMultipleValue();
		thread.resetMultipleValues();
		SubLObject v_bindings = unification_utilities.term_unify(var, result, UNPROVIDED, UNPROVIDED);
		if ((NIL != result) && (NIL != justification) && justification.isList()) {
			backward.removal_add_node(justification.first(), v_bindings, justification.rest());
		}
		if ((NIL != result) && ((NIL == justification) || !justification.isList())) {
			backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE, bindings.apply_bindings(v_bindings, asent),
					UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 3100L)
	public static SubLObject removal_location_has_qualitative_time_of_day_at_time(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject location = cycl_utilities.formula_arg1(asent, UNPROVIDED);
		SubLObject time = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject var = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		SubLObject results = temporal_projection_utilities.location_has_qualitative_time_of_day_at_time(location, time,
				mt_relevance_macros.$mt$.getDynamicValue(thread));
		if (!results.isList())
			return NIL;
		SubLObject cdolist_list_var = results;
		SubLObject result = NIL;
		result = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject v_answer = cycl_utilities.formula_arg0(result);
			SubLObject justification = cycl_utilities.formula_arg1(result, UNPROVIDED);
			SubLObject v_bindings = unification_utilities.term_unify(var, v_answer, UNPROVIDED, UNPROVIDED);
			if ((NIL != result) && (NIL != justification)) {
				backward.removal_add_node(justification.first(), v_bindings, justification.rest());
			}
			if ((NIL != result) && (NIL == justification)) {
				backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE,
						bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
			}
			cdolist_list_var = cdolist_list_var.rest();
			result = cdolist_list_var.first();
		}
		if (NIL == results)
			return NIL;
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 4500L)
	public static SubLObject removal_location_has_qualitative_time_of_day_at_time_check(SubLObject asent,
			SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject location = cycl_utilities.formula_arg1(asent, UNPROVIDED);
		SubLObject time = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject v_answer = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		thread.resetMultipleValues();
		SubLObject result = temporal_projection_utilities.location_has_qualitative_time_of_day_at_time(location, time,
				mt_relevance_macros.$mt$.getDynamicValue(thread));
		SubLObject justification = thread.secondMultipleValue();
		thread.resetMultipleValues();
		justification = NIL;
		if (!result.isList())
			return NIL;
		if (NIL != conses_high.member(v_answer, result, Symbols.symbol_function(EQUAL), UNPROVIDED)) {
			SubLObject v_bindings = NIL;
			if ((NIL != result) && (NIL != justification)) {
				backward.removal_add_node(justification.first(), v_bindings, justification.rest());
			}
			if ((NIL != result) && (NIL == justification)) {
				backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE,
						bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 5900L)
	public static SubLObject removal_location_has_sunrise_time(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject location = cycl_utilities.formula_arg1(asent, UNPROVIDED);
		SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		thread.resetMultipleValues();
		SubLObject result = temporal_projection_utilities.location_has_sunrise_time(location,
				mt_relevance_macros.$mt$.getDynamicValue(thread));
		SubLObject justification = thread.secondMultipleValue();
		thread.resetMultipleValues();
		SubLObject v_bindings = unification_utilities.term_unify(var, result, UNPROVIDED, UNPROVIDED);
		if ((NIL != result) && (NIL != justification)) {
			backward.removal_add_node(justification.first(), v_bindings, justification.rest());
		}
		if ((NIL != result) && (NIL == justification)) {
			backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE, bindings.apply_bindings(v_bindings, asent),
					UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 7300L)
	public static SubLObject removal_local_sunrise_time_for_coordinates(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject latitude = cycl_utilities.formula_arg1(asent, UNPROVIDED);
		SubLObject longitude = cycl_utilities.formula_arg2(asent, UNPROVIDED);
		SubLObject date = cycl_utilities.formula_arg3(asent, UNPROVIDED);
		SubLObject var = cycl_utilities.atomic_sentence_arg4(asent, UNPROVIDED);
		thread.resetMultipleValues();
		SubLObject result = temporal_projection_utilities.local_sunrise_time_for_coordinates(latitude, longitude, date,
				mt_relevance_macros.$mt$.getDynamicValue(thread));
		SubLObject justification = thread.secondMultipleValue();
		thread.resetMultipleValues();
		SubLObject v_bindings = unification_utilities.term_unify(var, result, UNPROVIDED, UNPROVIDED);
		if ((NIL != result) && (NIL != justification) && (NIL != arguments.hl_justification_p(justification))) {
			backward.removal_add_node(justification.first(), v_bindings, justification.rest());
		}
		if ((NIL != result) && ((NIL == arguments.hl_justification_p(justification)) || (NIL == justification))) {
			backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE, bindings.apply_bindings(v_bindings, asent),
					UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 8900L)
	public static SubLObject removal_local_sunset_time_for_coordinates(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject latitude = cycl_utilities.formula_arg1(asent, UNPROVIDED);
		SubLObject longitude = cycl_utilities.formula_arg2(asent, UNPROVIDED);
		SubLObject date = cycl_utilities.formula_arg3(asent, UNPROVIDED);
		SubLObject var = cycl_utilities.atomic_sentence_arg4(asent, UNPROVIDED);
		thread.resetMultipleValues();
		SubLObject result = temporal_projection_utilities.local_sunset_time_for_coordinates(latitude, longitude, date,
				mt_relevance_macros.$mt$.getDynamicValue(thread));
		SubLObject justification = thread.secondMultipleValue();
		thread.resetMultipleValues();
		SubLObject v_bindings = unification_utilities.term_unify(var, result, UNPROVIDED, UNPROVIDED);
		if ((NIL != result) && (NIL != justification) && (NIL != arguments.hl_justification_p(justification))) {
			backward.removal_add_node(justification.first(), v_bindings, justification.rest());
		}
		if ((NIL != result) && ((NIL == arguments.hl_justification_p(justification)) || (NIL == justification))) {
			backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE, bindings.apply_bindings(v_bindings, asent),
					UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 10200L)
	public static SubLObject removal_location_has_sunset_time(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject location = cycl_utilities.formula_arg1(asent, UNPROVIDED);
		SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		thread.resetMultipleValues();
		SubLObject result = temporal_projection_utilities.location_has_sunset_time(location,
				mt_relevance_macros.$mt$.getDynamicValue(thread));
		SubLObject justification = thread.secondMultipleValue();
		thread.resetMultipleValues();
		SubLObject v_bindings = unification_utilities.term_unify(var, result, UNPROVIDED, UNPROVIDED);
		if ((NIL != result) && (NIL != justification)) {
			backward.removal_add_node(justification.first(), v_bindings, justification.rest());
		}
		if ((NIL != result) && (NIL == justification)) {
			backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE, bindings.apply_bindings(v_bindings, asent),
					UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 11500L)
	public static SubLObject removal_likelihood_of_truth_of_sentence(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject sent = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		thread.resetMultipleValues();
		SubLObject result = temporal_projection.likelihood_of_truth_of_sentence(sent,
				mt_relevance_macros.$mt$.getDynamicValue(thread), T);
		SubLObject justification = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != result) {
			SubLObject val = cycl_utilities.formula_arg1(result, UNPROVIDED);
			SubLObject rounded_number = Numbers.divide(Numbers.floor(Numbers.multiply(val, $int25$100), UNPROVIDED),
					$int25$100);
			SubLObject v_answer = list($const26$NumericLikelihoodFn, rounded_number);
			SubLObject v_bindings = unification_utilities.term_unify(var, v_answer, UNPROVIDED, UNPROVIDED);
			if ((NIL != result) && justification.isList()) {
				backward.removal_add_node(justification.first(), v_bindings, justification.rest());
			}
			if ((NIL != result) && (NIL == Types.listp(justification))) {
				backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE,
						bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 12900L)
	public static SubLObject removal_time_intervals_for_sentence(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject sent = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject cdolist_list_var;
		SubLObject ret_value = cdolist_list_var = temporal_projection.time_intervals_for_sentence(sent,
				mt_relevance_macros.$mt$.getDynamicValue(thread), T, UNPROVIDED, UNPROVIDED);
		SubLObject entry = NIL;
		entry = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject result = cycl_utilities.formula_arg0(entry);
			SubLObject justification = cycl_utilities.formula_arg1(entry, UNPROVIDED);
			SubLObject v_bindings = unification_utilities.term_unify(var, result, UNPROVIDED, UNPROVIDED);
			if ((NIL != result) && justification.isList()) {
				backward.removal_add_node(justification.first(), v_bindings, justification.rest());
			}
			cdolist_list_var = cdolist_list_var.rest();
			entry = cdolist_list_var.first();
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 14400L)
	public static SubLObject removal_has_level_of_opaque_expertise_on_topic_with_rating(SubLObject asent,
			SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject var = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		SubLObject rounded_number = NIL;
		thread.resetMultipleValues();
		SubLObject result = temporal_projection_preds.find_level_of_opaque_expertise_on_topic_with_rating(asent,
				mt_relevance_macros.$mt$.getDynamicValue(thread), T);
		SubLObject justification = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (!cycl_utilities.formula_arg1(result, UNPROVIDED).isNumber())
			return NIL;
		rounded_number = Numbers.divide(Numbers.floor(
				Numbers.multiply(cycl_utilities.formula_arg1(result, UNPROVIDED), $int25$100), UNPROVIDED), $int25$100);
		SubLObject v_bindings = unification_utilities.term_unify(var, rounded_number, UNPROVIDED, UNPROVIDED);
		if ((NIL != result) && justification.isList()) {
			backward.removal_add_node(justification.first(), v_bindings, justification.rest());
		}
		if (NIL != result) {
			backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE, bindings.apply_bindings(v_bindings, asent),
					UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 15900L)
	public static SubLObject removal_time_intervals_intersect(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject interval_1 = cycl_utilities.formula_arg1(asent, UNPROVIDED);
		SubLObject interval_2 = cycl_utilities.formula_arg2(asent, UNPROVIDED);
		thread.resetMultipleValues();
		SubLObject result = time_intervals_intersectP(interval_1, interval_2);
		SubLObject justification = thread.secondMultipleValue();
		thread.resetMultipleValues();
		justification = NIL;
		if ((NIL != result) && (NIL == justification)) {
			SubLObject v_bindings = NIL;
			backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE, bindings.apply_bindings(v_bindings, asent),
					UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 16400L)
	public static SubLObject time_intervals_intersectP(SubLObject interval_1, SubLObject interval_2) {
		SubLObject temporal_function_1 = cycl_utilities.formula_arg0(interval_1);
		SubLObject initial_point_1 = cycl_utilities.formula_arg1(interval_1, UNPROVIDED);
		SubLObject final_point_1 = cycl_utilities.formula_arg2(interval_1, UNPROVIDED);
		SubLObject temporal_function_2 = cycl_utilities.formula_arg0(interval_2);
		SubLObject initial_point_2 = cycl_utilities.formula_arg1(interval_2, UNPROVIDED);
		SubLObject final_point_2 = cycl_utilities.formula_arg2(interval_2, UNPROVIDED);
		if (interval_1.equal(interval_2))
			return Values.values(T, NIL);
		if (!temporal_function_1.eql($const36$TimeIntervalInclusiveFn)
				|| !temporal_function_2.eql($const36$TimeIntervalInclusiveFn))
			return NIL;
		if (initial_point_1.equal(final_point_2) || initial_point_1.equal(initial_point_2)
				|| final_point_1.equal(initial_point_2) || final_point_1.equal(final_point_2))
			return Values.values(T, NIL);
		return makeBoolean(((NIL != date_utilities.later_than(final_point_1, initial_point_2))
				&& (NIL != date_utilities.later_than(initial_point_2, initial_point_1)))
				|| ((NIL != date_utilities.later_than(final_point_2, initial_point_1))
						&& (NIL != date_utilities.later_than(initial_point_1, initial_point_2))));
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 18200L)
	public static SubLObject removal_likely_close_acquaintances(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject var = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		SubLObject rounded_number = NIL;
		thread.resetMultipleValues();
		SubLObject result = temporal_projection_preds.find_likelihood_of_acquaintances(asent,
				mt_relevance_macros.$mt$.getDynamicValue(thread), T);
		SubLObject justification = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (!cycl_utilities.formula_arg1(result, UNPROVIDED).isNumber())
			return NIL;
		rounded_number = Numbers.divide(Numbers.floor(
				Numbers.multiply(cycl_utilities.formula_arg1(result, UNPROVIDED), $int25$100), UNPROVIDED), $int25$100);
		SubLObject v_bindings = unification_utilities.term_unify(var, rounded_number, UNPROVIDED, UNPROVIDED);
		if (rounded_number.numG($float40$0_5)) {
			if ((NIL != result) && justification.isList()) {
				backward.removal_add_node(justification.first(), v_bindings, justification.rest());
			}
			if (NIL == result)
				return NIL;
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 19500L)
	public static SubLObject removal_language_spoken(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject rounded_number = NIL;
		SubLObject var = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		thread.resetMultipleValues();
		SubLObject result = temporal_projection_preds.find_likelihood_of_language_spoken(asent,
				mt_relevance_macros.$mt$.getDynamicValue(thread));
		SubLObject justification = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (!cycl_utilities.formula_arg1(result, UNPROVIDED).isNumber())
			return NIL;
		rounded_number = Numbers.divide(Numbers.floor(
				Numbers.multiply(cycl_utilities.formula_arg1(result, UNPROVIDED), $int25$100), UNPROVIDED), $int25$100);
		SubLObject v_bindings = unification_utilities.term_unify(var, rounded_number, UNPROVIDED, UNPROVIDED);
		if (rounded_number.numG($float40$0_5) && (NIL != result)
				&& (NIL != arguments.hl_justification_p(justification))) {
			backward.removal_add_node(justification.first(), v_bindings, justification.rest());
		}
		if (NIL == result)
			return NIL;
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-temporal-projection.lisp", position = 21200L)
	public static SubLObject removal_average_deviation_from_guidelines_in_interval(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLObject gauge = cycl_utilities.formula_arg1(asent, UNPROVIDED);
		SubLObject interval_1 = cycl_utilities.formula_arg2(asent, UNPROVIDED);
		SubLObject interval_2 = cycl_utilities.formula_arg3(asent, UNPROVIDED);
		SubLObject var = cycl_utilities.formula_arg4(asent, UNPROVIDED);
		SubLObject result = Functions.funcall(makeSymbol("CALCULATE-AVERAGE-DEVIATION-FROM-GUIDELINES-IN-INTERVAL"),
				gauge, interval_1, interval_2);
		if (NIL != result) {
			SubLObject v_bindings = unification_utilities.term_unify(var, result, UNPROVIDED, UNPROVIDED);
			backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE, bindings.apply_bindings(v_bindings, asent),
					UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
		}
		return NIL;
	}

	public static SubLObject declare_removal_modules_temporal_projection_file() {
		declareFunction("removal_likelihood_of_assertion_at_time", "REMOVAL-LIKELIHOOD-OF-ASSERTION-AT-TIME", 1,
				1, false);
		declareFunction("removal_location_has_qualitative_time_of_day_at_time",
				"REMOVAL-LOCATION-HAS-QUALITATIVE-TIME-OF-DAY-AT-TIME", 1, 1, false);
		declareFunction("removal_location_has_qualitative_time_of_day_at_time_check",
				"REMOVAL-LOCATION-HAS-QUALITATIVE-TIME-OF-DAY-AT-TIME-CHECK", 1, 1, false);
		declareFunction("removal_location_has_sunrise_time", "REMOVAL-LOCATION-HAS-SUNRISE-TIME", 1, 1, false);
		declareFunction("removal_local_sunrise_time_for_coordinates",
				"REMOVAL-LOCAL-SUNRISE-TIME-FOR-COORDINATES", 1, 1, false);
		declareFunction("removal_local_sunset_time_for_coordinates",
				"REMOVAL-LOCAL-SUNSET-TIME-FOR-COORDINATES", 1, 1, false);
		declareFunction("removal_location_has_sunset_time", "REMOVAL-LOCATION-HAS-SUNSET-TIME", 1, 1, false);
		declareFunction("removal_likelihood_of_truth_of_sentence", "REMOVAL-LIKELIHOOD-OF-TRUTH-OF-SENTENCE", 1,
				1, false);
		declareFunction("removal_time_intervals_for_sentence", "REMOVAL-TIME-INTERVALS-FOR-SENTENCE", 1, 1,
				false);
		declareFunction("removal_has_level_of_opaque_expertise_on_topic_with_rating",
				"REMOVAL-HAS-LEVEL-OF-OPAQUE-EXPERTISE-ON-TOPIC-WITH-RATING", 1, 1, false);
		declareFunction("removal_time_intervals_intersect", "REMOVAL-TIME-INTERVALS-INTERSECT", 1, 1, false);
		declareFunction("time_intervals_intersectP", "TIME-INTERVALS-INTERSECT?", 2, 0, false);
		declareFunction("removal_likely_close_acquaintances", "REMOVAL-LIKELY-CLOSE-ACQUAINTANCES", 1, 1,
				false);
		declareFunction("removal_language_spoken", "REMOVAL-LANGUAGE-SPOKEN", 1, 1, false);
		declareFunction("removal_average_deviation_from_guidelines_in_interval",
				"REMOVAL-AVERAGE-DEVIATION-FROM-GUIDELINES-IN-INTERVAL", 1, 1, false);
		return NIL;
	}

	public static SubLObject init_removal_modules_temporal_projection_file() {
		return NIL;
	}

	public static SubLObject setup_removal_modules_temporal_projection_file() {
		inference_modules.register_solely_specific_removal_module_predicate($const0$likelihoodOfTruthOfAssertionAtTim);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const0$likelihoodOfTruthOfAssertionAtTim, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const0$likelihoodOfTruthOfAssertionAtTim, TWO_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_LIKELIHOOD_OF_ASSERTION_AT_TIME, $list3);
		inference_modules.register_solely_specific_removal_module_predicate($const5$locationHasQualitativeTimeOfDayAt);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const5$locationHasQualitativeTimeOfDayAt, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const5$locationHasQualitativeTimeOfDayAt, TWO_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_LOCATION_HAS_QUALITATIVE_TIME_OF_DAY_AT_TIME, $list7);
		inference_modules.inference_removal_module($kw$REMOVAL_LOCATION_HAS_QUALITATIVE_TIME_OF_DAY_AT_TIME_CHECK,
				$list9);
		inference_modules.register_solely_specific_removal_module_predicate($const10$locationHasSunriseTime);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const10$locationHasSunriseTime, ONE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_LOCATION_SUNRISE_TIME, $list12);
		inference_modules.register_solely_specific_removal_module_predicate($const13$localSunriseTimeForCoordinates);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const13$localSunriseTimeForCoordinates, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const13$localSunriseTimeForCoordinates, TWO_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const13$localSunriseTimeForCoordinates, THREE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_LOCAL_SUNRISE_TIME_FOR_COORDINATES, $list15);
		inference_modules.register_solely_specific_removal_module_predicate($const16$localSunsetTimeForCoordinates);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const16$localSunsetTimeForCoordinates, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const16$localSunsetTimeForCoordinates, TWO_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const16$localSunsetTimeForCoordinates, THREE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_LOCAL_SUNSET_TIME_FOR_COORDINATES, $list18);
		inference_modules.register_solely_specific_removal_module_predicate($const19$locationHasSunsetTime);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const19$locationHasSunsetTime, ONE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_LOCATION_SUNSET_TIME, $list21);
		inference_modules.register_solely_specific_removal_module_predicate($const22$likelihoodOfTruthOfSentence);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const22$likelihoodOfTruthOfSentence, ONE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_LIKELIHOOD_OF_TRUTH_OF_SENTENCE, $list24);
		inference_modules.register_solely_specific_removal_module_predicate($const27$timeIntervalsForSentence);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const27$timeIntervalsForSentence, ONE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_TIME_INTERVALS_FOR_SENTENCE, $list29);
		inference_modules.register_solely_specific_removal_module_predicate($const30$hasLevelOfOpaqueExpertiseOnTopicW);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const30$hasLevelOfOpaqueExpertiseOnTopicW, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const30$hasLevelOfOpaqueExpertiseOnTopicW, TWO_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_HAS_LEVEL_OF_OPAQUE_EXPERTISE_WITH_RATING, $list32);
		inference_modules.register_solely_specific_removal_module_predicate($const33$timeIntervalsIntersect);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const33$timeIntervalsIntersect, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const33$timeIntervalsIntersect, TWO_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_TIME_INTERVALS_INTERSECT, $list35);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const37$likelyCloseAcquaintances, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const37$likelyCloseAcquaintances, TWO_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_LIKELY_CLOSE_ACQUAINTANCES, $list39);
		preference_modules.inference_preference_module($kw$LANGUAGE_SPOKEN_VIA_PROJECTION, $list42);
		inference_modules.inference_removal_module($kw$REMOVAL_LANGUAGE_SPOKEN, $list44);
		inference_modules.register_solely_specific_removal_module_predicate($const45$averageDeviationFromGuidelinesInI);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const45$averageDeviationFromGuidelinesInI, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const45$averageDeviationFromGuidelinesInI, TWO_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const45$averageDeviationFromGuidelinesInI,
				THREE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_AVERAGE_DEVIATION_FROM_GUIDELINES_IN_INTERVAL, $list47);
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
		me = new removal_modules_temporal_projection();
		$const0$likelihoodOfTruthOfAssertionAtTim = constant_handles
				.reader_make_constant_shell(makeString("likelihoodOfTruthOfAssertionAtTime"));
		$kw$POS = makeKeyword("POS");
		$kw$REMOVAL_LIKELIHOOD_OF_ASSERTION_AT_TIME = makeKeyword("REMOVAL-LIKELIHOOD-OF-ASSERTION-AT-TIME");
		$list3 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("likelihoodOfTruthOfAssertionAtTime")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("likelihoodOfTruthOfAssertionAtTime")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("EXPAND"), makeSymbol("REMOVAL-LIKELIHOOD-OF-ASSERTION-AT-TIME"),
				makeKeyword("DOCUMENTATION"),
				makeString("(#$likelihoodOfTruthOfAssertionAtTime  <ASSERTION> <TIME> ?x)"), makeKeyword("EXAMPLE"),
				makeString(" ") });
		$kw$OPAQUE = makeKeyword("OPAQUE");
		$const5$locationHasQualitativeTimeOfDayAt = constant_handles
				.reader_make_constant_shell(makeString("locationHasQualitativeTimeOfDayAtTime"));
		$kw$REMOVAL_LOCATION_HAS_QUALITATIVE_TIME_OF_DAY_AT_TIME = makeKeyword(
				"REMOVAL-LOCATION-HAS-QUALITATIVE-TIME-OF-DAY-AT-TIME");
		$list7 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("locationHasQualitativeTimeOfDayAtTime")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("locationHasQualitativeTimeOfDayAtTime")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("EXPAND"), makeSymbol("REMOVAL-LOCATION-HAS-QUALITATIVE-TIME-OF-DAY-AT-TIME"),
				makeKeyword("DOCUMENTATION"),
				makeString("(#$locationHasQualitativeTimeOfDayAtTime  <LOCATION> <TIME> ?x)"), makeKeyword("EXAMPLE"),
				makeString(" ") });
		$kw$REMOVAL_LOCATION_HAS_QUALITATIVE_TIME_OF_DAY_AT_TIME_CHECK = makeKeyword(
				"REMOVAL-LOCATION-HAS-QUALITATIVE-TIME-OF-DAY-AT-TIME-CHECK");
		$list9 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("locationHasQualitativeTimeOfDayAtTime")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("locationHasQualitativeTimeOfDayAtTime")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("EXPAND"), makeSymbol("REMOVAL-LOCATION-HAS-QUALITATIVE-TIME-OF-DAY-AT-TIME-CHECK"),
				makeKeyword("DOCUMENTATION"), makeString("(#$changePointsOfTimeSeries  <LOCATION> <TIME> <TYPE>)"),
				makeKeyword("EXAMPLE"), makeString(" ") });
		$const10$locationHasSunriseTime = constant_handles
				.reader_make_constant_shell(makeString("locationHasSunriseTime"));
		$kw$REMOVAL_LOCATION_SUNRISE_TIME = makeKeyword("REMOVAL-LOCATION-SUNRISE-TIME");
		$list12 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("locationHasSunriseTime")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("locationHasSunriseTime")),
						makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("EXPAND"), makeSymbol("REMOVAL-LOCATION-HAS-SUNRISE-TIME"), makeKeyword("DOCUMENTATION"),
				makeString("(#$locationHasSunriseTime  <LOCATION> ?x)"), makeKeyword("EXAMPLE"), makeString(" ") });
		$const13$localSunriseTimeForCoordinates = constant_handles
				.reader_make_constant_shell(makeString("localSunriseTimeForCoordinates"));
		$kw$REMOVAL_LOCAL_SUNRISE_TIME_FOR_COORDINATES = makeKeyword("REMOVAL-LOCAL-SUNRISE-TIME-FOR-COORDINATES");
		$list15 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("localSunriseTimeForCoordinates")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("localSunriseTimeForCoordinates")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"),
						makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("EXPAND"), makeSymbol("REMOVAL-LOCAL-SUNRISE-TIME-FOR-COORDINATES"),
				makeKeyword("DOCUMENTATION"),
				makeString("(#$localSunriseTimeForCoordinates  <LATITUDE> <LONGITUDE> <DATE> ?x)"),
				makeKeyword("EXAMPLE"), makeString(" ") });
		$const16$localSunsetTimeForCoordinates = constant_handles
				.reader_make_constant_shell(makeString("localSunsetTimeForCoordinates"));
		$kw$REMOVAL_LOCAL_SUNSET_TIME_FOR_COORDINATES = makeKeyword("REMOVAL-LOCAL-SUNSET-TIME-FOR-COORDINATES");
		$list18 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("localSunsetTimeForCoordinates")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("localSunsetTimeForCoordinates")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"),
						makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("EXPAND"), makeSymbol("REMOVAL-LOCAL-SUNSET-TIME-FOR-COORDINATES"),
				makeKeyword("DOCUMENTATION"),
				makeString("(#$localSunsetTimeForCoordinates  <LATITUDE> <LONGITUDE> <DATE> ?x)"),
				makeKeyword("EXAMPLE"), makeString(" ") });
		$const19$locationHasSunsetTime = constant_handles
				.reader_make_constant_shell(makeString("locationHasSunsetTime"));
		$kw$REMOVAL_LOCATION_SUNSET_TIME = makeKeyword("REMOVAL-LOCATION-SUNSET-TIME");
		$list21 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("locationHasSunsetTime")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("locationHasSunsetTime")),
						makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("EXPAND"), makeSymbol("REMOVAL-LOCATION-HAS-SUNSET-TIME"), makeKeyword("DOCUMENTATION"),
				makeString("(#$locationHasSunsetTime  <LOCATION> ?x)"), makeKeyword("EXAMPLE"), makeString(" ") });
		$const22$likelihoodOfTruthOfSentence = constant_handles
				.reader_make_constant_shell(makeString("likelihoodOfTruthOfSentence"));
		$kw$REMOVAL_LIKELIHOOD_OF_TRUTH_OF_SENTENCE = makeKeyword("REMOVAL-LIKELIHOOD-OF-TRUTH-OF-SENTENCE");
		$list24 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("likelihoodOfTruthOfSentence")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("likelihoodOfTruthOfSentence")),
						makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("EXPAND"), makeSymbol("REMOVAL-LIKELIHOOD-OF-TRUTH-OF-SENTENCE"),
				makeKeyword("DOCUMENTATION"), makeString("(#$likelihoodOfTruthOfSentence  <SENTENCE> ?x)"),
				makeKeyword("EXAMPLE"), makeString(" ") });
		$int25$100 = makeInteger(100);
		$const26$NumericLikelihoodFn = constant_handles.reader_make_constant_shell(makeString("NumericLikelihoodFn"));
		$const27$timeIntervalsForSentence = constant_handles
				.reader_make_constant_shell(makeString("timeIntervalsForSentence"));
		$kw$REMOVAL_TIME_INTERVALS_FOR_SENTENCE = makeKeyword("REMOVAL-TIME-INTERVALS-FOR-SENTENCE");
		$list29 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("timeIntervalsForSentence")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("timeIntervalsForSentence")),
						makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("EXPAND"), makeSymbol("REMOVAL-TIME-INTERVALS-FOR-SENTENCE"), makeKeyword("DOCUMENTATION"),
				makeString("(#$timeIntervalsForSentence  <SENTENCE> ?x)"), makeKeyword("EXAMPLE"), makeString(" ") });
		$const30$hasLevelOfOpaqueExpertiseOnTopicW = constant_handles
				.reader_make_constant_shell(makeString("hasLevelOfOpaqueExpertiseOnTopicWithRating"));
		$kw$REMOVAL_HAS_LEVEL_OF_OPAQUE_EXPERTISE_WITH_RATING = makeKeyword(
				"REMOVAL-HAS-LEVEL-OF-OPAQUE-EXPERTISE-WITH-RATING");
		$list32 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("hasLevelOfOpaqueExpertiseOnTopicWithRating")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles
						.reader_make_constant_shell(makeString("hasLevelOfOpaqueExpertiseOnTopicWithRating")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("EXPAND"), makeSymbol("REMOVAL-HAS-LEVEL-OF-OPAQUE-EXPERTISE-ON-TOPIC-WITH-RATING"),
				makeKeyword("DOCUMENTATION"),
				makeString("(#$hasLevelOfOpaqueExpertiseOnTopicWithRating  <SENTENCE> <bound> ?x)"),
				makeKeyword("EXAMPLE"), makeString(" ") });
		$const33$timeIntervalsIntersect = constant_handles
				.reader_make_constant_shell(makeString("timeIntervalsIntersect"));
		$kw$REMOVAL_TIME_INTERVALS_INTERSECT = makeKeyword("REMOVAL-TIME-INTERVALS-INTERSECT");
		$list35 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("timeIntervalsIntersect")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("timeIntervalsIntersect")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("EXPAND"), makeSymbol("REMOVAL-TIME-INTERVALS-INTERSECT"), makeKeyword("DOCUMENTATION"),
				makeString("(#$timeIntervalsIntersect  <INTERVAL-1> <INTERVAL-2>)"), makeKeyword("EXAMPLE"),
				makeString(" ") });
		$const36$TimeIntervalInclusiveFn = constant_handles
				.reader_make_constant_shell(makeString("TimeIntervalInclusiveFn"));
		$const37$likelyCloseAcquaintances = constant_handles
				.reader_make_constant_shell(makeString("likelyCloseAcquaintances"));
		$kw$REMOVAL_LIKELY_CLOSE_ACQUAINTANCES = makeKeyword("REMOVAL-LIKELY-CLOSE-ACQUAINTANCES");
		$list39 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("likelyCloseAcquaintances")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("likelyCloseAcquaintances")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-LIKELY-CLOSE-ACQUAINTANCES"), makeKeyword("DOCUMENTATION"),
				makeString("(#$likelihoodOfTruthOfSentence  <SENTENCE> ?x)"), makeKeyword("EXAMPLE"),
				makeString(" ") });
		$float40$0_5 = makeDouble(0.5);
		$kw$LANGUAGE_SPOKEN_VIA_PROJECTION = makeKeyword("LANGUAGE-SPOKEN-VIA-PROJECTION");
		$list42 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("languageSpoken")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("languageSpoken")),
						makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISPREFERRED"));
		$kw$REMOVAL_LANGUAGE_SPOKEN = makeKeyword("REMOVAL-LANGUAGE-SPOKEN");
		$list44 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("languageSpoken")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("languageSpoken")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-LANGUAGE-SPOKEN"), makeKeyword("DOCUMENTATION"),
				makeString("(#$languageSpoken  <PERSON> <LANGUAGE>)"), makeKeyword("EXAMPLE"), makeString(" ") });
		$const45$averageDeviationFromGuidelinesInI = constant_handles
				.reader_make_constant_shell(makeString("averageDeviationFromGuidelinesInInterval"));
		$kw$REMOVAL_AVERAGE_DEVIATION_FROM_GUIDELINES_IN_INTERVAL = makeKeyword(
				"REMOVAL-AVERAGE-DEVIATION-FROM-GUIDELINES-IN-INTERVAL");
		$list47 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("averageDeviationFromGuidelinesInInterval")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(
						makeString("averageDeviationFromGuidelinesInInterval")), makeKeyword("FULLY-BOUND"),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("EXPAND"), makeSymbol("REMOVAL-AVERAGE-DEVIATION-FROM-GUIDELINES-IN-INTERVAL"),
				makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$averageDeviationFromGuidelinesInInterval <GAUGE>  <SHUT-IN-INTERVAL> <RAMP-UP-INTERVAL> ?DEVIATION)"),
				makeKeyword("EXAMPLE"), makeString(" ") });
	}
}
/*
 *
 * Total time: 133 ms
 *
 */