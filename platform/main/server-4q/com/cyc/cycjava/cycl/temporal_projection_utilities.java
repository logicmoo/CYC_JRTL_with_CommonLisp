package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.abs;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.acos;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.asin;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.cos;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.exp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.sin;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
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

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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


public final class temporal_projection_utilities extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new temporal_projection_utilities();

    public static final String myName = "com.cyc.cycjava_2.cycl.temporal_projection_utilities";


    // defparameter
    private static final SubLSymbol $ignored_temporal_projection_functions$ = makeSymbol("*IGNORED-TEMPORAL-PROJECTION-FUNCTIONS*");

    // defparameter
    public static final SubLSymbol $temporal_projection_distribution_predicate_list$ = makeSymbol("*TEMPORAL-PROJECTION-DISTRIBUTION-PREDICATE-LIST*");

    private static final SubLList $list0 = list(new SubLObject[]{ reader_make_constant_shell(makeString("MiddlePartFn")), reader_make_constant_shell(makeString("SeasonFn")), reader_make_constant_shell(makeString("STIF")), reader_make_constant_shell(makeString("STIB")), reader_make_constant_shell(makeString("InstanceNamedFn")), reader_make_constant_shell(makeString("TemporalExtentFn")), reader_make_constant_shell(makeString("EarlyPartFn")), reader_make_constant_shell(makeString("SomeFn")), reader_make_constant_shell(makeString("EndingIntervalFn")), reader_make_constant_shell(makeString("InstanceNamedFn-Ternary")) });

    private static final SubLList $list1 = list(reader_make_constant_shell(makeString("defaultConditionalProbabilityForSentenceInInterval")), reader_make_constant_shell(makeString("conditionalProbabilityForSentenceWhenTypeInArg")), reader_make_constant_shell(makeString("defaultConditionalProbabilityOfStateAfterIntervalOfLength")));

    private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));





    private static final SubLObject $$MtSpace = reader_make_constant_shell(makeString("MtSpace"));

    private static final SubLObject $$MtTimeWithGranularityDimFn = reader_make_constant_shell(makeString("MtTimeWithGranularityDimFn"));

    private static final SubLList $list7 = list(reader_make_constant_shell(makeString("TimePoint")));

    private static final SubLString $str8$Justifications_not_in_proper_form = makeString("Justifications not in proper format for time ~a ~a");





    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$TimeDependentCollection = reader_make_constant_shell(makeString("TimeDependentCollection"));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));







    private static final SubLList $list17 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("ist")), makeSymbol("?MT"), makeSymbol("?ASENT")), list(reader_make_constant_shell(makeString("temporalProjectionInterval")), list(reader_make_constant_shell(makeString("ist")), makeSymbol("?MT"), makeSymbol("?ASENT")), makeSymbol("?WIDER-TIME"))), list(reader_make_constant_shell(makeString("liftTo")), list(reader_make_constant_shell(makeString("MtTimeDimFn")), makeSymbol("?WIDER-TIME")), makeSymbol("?ASENT")));

    private static final SubLObject $$YearsDuration = reader_make_constant_shell(makeString("YearsDuration"));

    private static final SubLList $list19 = list(reader_make_constant_shell(makeString("NumericLikelihoodFn")), ONE_INTEGER);

    private static final SubLInteger $int$125 = makeInteger(125);

    private static final SubLObject $$NumericLikelihoodFn = reader_make_constant_shell(makeString("NumericLikelihoodFn"));

    private static final SubLObject $$BiologicalLivingObject = reader_make_constant_shell(makeString("BiologicalLivingObject"));

    private static final SubLObject $const23$conditionalProbabilityOfTerminati = reader_make_constant_shell(makeString("conditionalProbabilityOfTerminationOfMembershipInCollectionWhenAgeInInterval"));

    private static final SubLFloat $float$0_007 = makeDouble(0.007);

    private static final SubLFloat $float$4_0e_4 = makeDouble(4.0E-4);

    private static final SubLFloat $float$3_0e_4 = makeDouble(3.0E-4);

    private static final SubLFloat $float$2_0e_4 = makeDouble(2.0E-4);

    private static final SubLFloat $float$1_0e_4 = makeDouble(1.0E-4);

    private static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLFloat $float$0_001 = makeDouble(0.001);

    private static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLFloat $float$0_0014 = makeDouble(0.0014);

    private static final SubLInteger $int$35 = makeInteger(35);

    private static final SubLFloat $float$0_0015 = makeDouble(0.0015);

    private static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLFloat $float$0_0019 = makeDouble(0.0019);

    private static final SubLInteger $int$45 = makeInteger(45);

    private static final SubLFloat $float$0_0029 = makeDouble(0.0029);

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLFloat $float$0_0042 = makeDouble(0.0042);

    private static final SubLInteger $int$55 = makeInteger(55);

    private static final SubLFloat $float$0_0065 = makeDouble(0.0065);

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLFloat $float$0_0094 = makeDouble(0.0094);

    private static final SubLInteger $int$65 = makeInteger(65);

    private static final SubLFloat $float$0_015 = makeDouble(0.015);

    private static final SubLInteger $int$70 = makeInteger(70);

    private static final SubLFloat $float$0_019 = makeDouble(0.019);

    private static final SubLInteger $int$75 = makeInteger(75);

    private static final SubLFloat $float$0_031 = makeDouble(0.031);

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLFloat $float$0_048 = makeDouble(0.048);

    private static final SubLInteger $int$85 = makeInteger(85);

    private static final SubLFloat $float$0_086 = makeDouble(0.086);

    private static final SubLInteger $int$90 = makeInteger(90);

    private static final SubLFloat $float$0_129 = makeDouble(0.129);

    private static final SubLInteger $int$95 = makeInteger(95);

    private static final SubLFloat $float$0_229 = makeDouble(0.229);

    private static final SubLFloat $float$0_31 = makeDouble(0.31);

    private static final SubLInteger $int$105 = makeInteger(105);

    private static final SubLFloat $float$0_41 = makeDouble(0.41);

    private static final SubLInteger $int$110 = makeInteger(110);

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLInteger $int$115 = makeInteger(115);

    private static final SubLFloat $float$0_68 = makeDouble(0.68);

    private static final SubLInteger $int$120 = makeInteger(120);

    private static final SubLFloat $float$0_82 = makeDouble(0.82);

    private static final SubLFloat $float$0_91 = makeDouble(0.91);

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLList $list70 = list(reader_make_constant_shell(makeString("AnytimePSC")));

    private static final SubLObject $const71$assertionProducedByTemporalProjec = reader_make_constant_shell(makeString("assertionProducedByTemporalProjectionModule"));

    private static final SubLObject $$BookkeepingMt = reader_make_constant_shell(makeString("BookkeepingMt"));



    private static final SubLObject $$Now = reader_make_constant_shell(makeString("Now"));

    private static final SubLObject $$TimeIntervalInclusiveFn = reader_make_constant_shell(makeString("TimeIntervalInclusiveFn"));

    private static final SubLObject $$TimeInterval_Incl_Excl_Fn = reader_make_constant_shell(makeString("TimeInterval-Incl-Excl-Fn"));

    private static final SubLObject $$TimeInterval_Excl_Incl_Fn = reader_make_constant_shell(makeString("TimeInterval-Excl-Incl-Fn"));

    private static final SubLObject $$SomeTimeInIntervalFn = reader_make_constant_shell(makeString("SomeTimeInIntervalFn"));

    private static final SubLObject $$IntervalStartedByFn = reader_make_constant_shell(makeString("IntervalStartedByFn"));

    private static final SubLObject $$IntervalStartedByFn_Inclusive = reader_make_constant_shell(makeString("IntervalStartedByFn-Inclusive"));

    private static final SubLObject $$YearBCE_JulianFn = reader_make_constant_shell(makeString("YearBCE-JulianFn"));

    private static final SubLObject $$YearFn = reader_make_constant_shell(makeString("YearFn"));

    private static final SubLObject $$IntervalEndedByFn = reader_make_constant_shell(makeString("IntervalEndedByFn"));

    private static final SubLObject $$EndFn = reader_make_constant_shell(makeString("EndFn"));

    private static final SubLObject $$TimeIntervalBetweenFn = reader_make_constant_shell(makeString("TimeIntervalBetweenFn"));

    private static final SubLObject $$DayFn = reader_make_constant_shell(makeString("DayFn"));

    private static final SubLObject $$MonthFn = reader_make_constant_shell(makeString("MonthFn"));

    private static final SubLObject $$HourFn = reader_make_constant_shell(makeString("HourFn"));

    private static final SubLObject $$MinuteFn = reader_make_constant_shell(makeString("MinuteFn"));

    private static final SubLObject $$SecondFn = reader_make_constant_shell(makeString("SecondFn"));

    private static final SubLObject $$DecadeFn = reader_make_constant_shell(makeString("DecadeFn"));

    private static final SubLObject $$latitude = reader_make_constant_shell(makeString("latitude"));

    private static final SubLObject $$TerritoryFn = reader_make_constant_shell(makeString("TerritoryFn"));

    private static final SubLObject $$longitude = reader_make_constant_shell(makeString("longitude"));

    private static final SubLFloat $float$0_0174532925 = makeDouble(0.0174532925);

    private static final SubLFloat $float$2451545_0009 = makeDouble(2451545.0009);

    private static final SubLInteger $int$360 = makeInteger(360);

    private static final SubLInteger $int$2451545 = makeInteger(0x256859);

    private static final SubLFloat $float$8_999999999999999e_4 = makeDouble(8.999999999999999E-4);

    private static final SubLFloat $float$357_5291 = makeDouble(357.5291);

    private static final SubLFloat $float$0_98560028 = makeDouble(0.98560028);

    private static final SubLFloat $float$1_9148 = makeDouble(1.9148);

    private static final SubLFloat $float$0_02 = makeDouble(0.02);

    private static final SubLFloat $float$102_9372 = makeDouble(102.9372);

    private static final SubLInteger $int$180 = makeInteger(180);

    private static final SubLFloat $float$0_39794863131 = makeDouble(0.39794863131);

    private static final SubLFloat $float$_0_014485726139 = makeDouble(-0.014485726139);

    private static final SubLFloat $float$57_2957795 = makeDouble(57.2957795);

    private static final SubLFloat $float$0_0053 = makeDouble(0.0053);

    private static final SubLFloat $float$0_0069 = makeDouble(0.0069);

    private static final SubLInteger $int$86400 = makeInteger(0x15180);

    private static final SubLInteger $int$3600 = makeInteger(3600);

    private static final SubLSymbol $sym113$_X = makeSymbol("?X");

    private static final SubLObject $$evaluate = reader_make_constant_shell(makeString("evaluate"));

    private static final SubLObject $$DateAfterFn = reader_make_constant_shell(makeString("DateAfterFn"));

    private static final SubLList $list116 = list(list(reader_make_constant_shell(makeString("DaysDuration")), ONE_INTEGER));

    private static final SubLInteger $int$23 = makeInteger(23);

    private static final SubLInteger $int$24 = makeInteger(24);

    private static final SubLObject $$DateBeforeFn = reader_make_constant_shell(makeString("DateBeforeFn"));

    private static final SubLObject $$DayOfDateFn = reader_make_constant_shell(makeString("DayOfDateFn"));

    private static final SubLObject $$laterThan = reader_make_constant_shell(makeString("laterThan"));

    private static final SubLObject $$timeZoneOffsetToUTC = reader_make_constant_shell(makeString("timeZoneOffsetToUTC"));

    private static final SubLObject $$TimeZoneFn = reader_make_constant_shell(makeString("TimeZoneFn"));

    private static final SubLObject $$YearOfDateFn = reader_make_constant_shell(makeString("YearOfDateFn"));

    private static final SubLObject $$DaylightSavingTimeZone = reader_make_constant_shell(makeString("DaylightSavingTimeZone"));

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLList $list127 = list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("TimeZone")));

    private static final SubLObject $$geographicallySubsumes = reader_make_constant_shell(makeString("geographicallySubsumes"));

    private static final SubLList $list129 = list(new SubLObject[]{ makeKeyword("RETURN"), makeKeyword("BINDINGS-AND-SUPPORTS"), makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"), makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), T, makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("COMPUTE-INTERSECTION"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?"), T, makeKeyword("MAX-NUMBER"), TWO_INTEGER, makeKeyword("MAX-TIME"), TWO_INTEGER, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), T });

    private static final SubLList $list130 = list(reader_make_constant_shell(makeString("daylightSavingTimeStartsOnNthDayTypeInMonth")), makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?Z"), makeSymbol("?W"));

    private static final SubLSymbol $sym131$_Y = makeSymbol("?Y");

    private static final SubLSymbol $sym132$_Z = makeSymbol("?Z");

    private static final SubLSymbol $sym133$_W = makeSymbol("?W");

    private static final SubLInteger $int$31 = makeInteger(31);

    private static final SubLList $list135 = list(reader_make_constant_shell(makeString("daylightSavingTimeEndsOnNthDayTypeInMonth")), makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?Z"), makeSymbol("?W"));

    private static final SubLObject $$properGeographicalSubRegions = reader_make_constant_shell(makeString("properGeographicalSubRegions"));

    private static final SubLObject $$EuropeanSummerTimeZone = reader_make_constant_shell(makeString("EuropeanSummerTimeZone"));

    private static final SubLObject $$October = reader_make_constant_shell(makeString("October"));

    private static final SubLObject $$March = reader_make_constant_shell(makeString("March"));

    private static final SubLObject $$Date = reader_make_constant_shell(makeString("Date"));

    private static final SubLObject $$TimeZone = reader_make_constant_shell(makeString("TimeZone"));

    private static final SubLSymbol CYC_TIME_ZONE_CONVERSION = makeSymbol("CYC-TIME-ZONE-CONVERSION");

    private static final SubLObject $$DifferenceFn = reader_make_constant_shell(makeString("DifferenceFn"));

    private static final SubLObject $$DateAfterDurationStartPreciseFn = reader_make_constant_shell(makeString("DateAfterDurationStartPreciseFn"));

    private static final SubLObject $$Midday = reader_make_constant_shell(makeString("Midday"));

    private static final SubLObject $$Morning = reader_make_constant_shell(makeString("Morning"));

    private static final SubLObject $$Afternoon = reader_make_constant_shell(makeString("Afternoon"));

    private static final SubLObject $$Evening = reader_make_constant_shell(makeString("Evening"));

    private static final SubLObject $$Night = reader_make_constant_shell(makeString("Night"));

    private static final SubLObject $$DaytimeHours = reader_make_constant_shell(makeString("DaytimeHours"));

    private static final SubLObject $$Sunrise = reader_make_constant_shell(makeString("Sunrise"));

    private static final SubLObject $$Sunset = reader_make_constant_shell(makeString("Sunset"));

    private static final SubLObject $$Dawn = reader_make_constant_shell(makeString("Dawn"));

    private static final SubLObject $$Twilight = reader_make_constant_shell(makeString("Twilight"));

    private static final SubLObject $$Dusk = reader_make_constant_shell(makeString("Dusk"));

    private static final SubLSymbol $sym156$_EXIT = makeSymbol("%EXIT");

    private static final SubLObject $$HoursDuration = reader_make_constant_shell(makeString("HoursDuration"));

    private static final SubLObject $$hourNumberOfDate = reader_make_constant_shell(makeString("hourNumberOfDate"));

    private static final SubLInteger $int$21 = makeInteger(21);

    static {



    }

    public static SubLObject store_temporal_projection_results(final SubLObject formula_1, final SubLObject result_list, final SubLObject assertion, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (NIL == result_list) {
            return NIL;
        }
        SubLObject truth_value = NIL;
        SubLObject formula = NIL;
        final SubLObject code_support = get_code_rule_for_documentation();
        final SubLObject monad_mt = get_monad_mt(mt);
        if (cycl_utilities.formula_arg0(formula_1).eql($$not)) {
            truth_value = $FALSE;
            formula = cycl_utilities.formula_arg1(formula_1, UNPROVIDED);
        } else {
            truth_value = $TRUE;
            formula = formula_1;
        }
        SubLObject cdolist_list_var = result_list;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject mt_time = cycl_utilities.formula_arg0(entry);
            final SubLObject justifications = append(list(assertion), cycl_utilities.formula_arg1(entry, UNPROVIDED), code_support);
            SubLObject likelihood = cycl_utilities.formula_arg2(entry, UNPROVIDED);
            final SubLObject output_mt = list($$MtSpace, monad_mt, listS($$MtTimeWithGranularityDimFn, mt_time, $list7));
            if (NIL == arguments.hl_justification_p(justifications)) {
                Errors.warn($str8$Justifications_not_in_proper_form, mt_time, justifications);
            }
            if ((NIL != arguments.hl_justification_p(justifications)) && (NIL != hlmt.hlmtP(output_mt))) {
                final SubLObject deduction_object = hl_storage_modules.hl_add_deduction_for_gaf(formula, truth_value, output_mt, justifications, $FORWARD);
                if (NIL != deduction_handles.deduction_p(deduction_object)) {
                    final SubLObject supported_object = deductions_high.deduction_supported_object(deduction_object);
                    if ((NIL != assertion_handles.assertion_p(supported_object)) && likelihood.isNumber()) {
                        likelihood = divide(floor(multiply(likelihood, $int$100), UNPROVIDED), $int$100);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject temporal_projection_quick_failP(final SubLObject assertion) {
        final SubLObject gaf = assertions_high.gaf_formula(assertion);
        final SubLObject predicate = cycl_utilities.formula_arg0(gaf);
        if (predicate.eql($$isa)) {
            final SubLObject col = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
            if (NIL == isa.isaP(col, $$TimeDependentCollection, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject deduction_not_produced_by_temporal_projectionP(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != deduction_handles.deduction_p(deduction)) {
            thread.resetMultipleValues();
            final SubLObject gaf_supports = hl_supports.hl_justification_complete_backward_theory(deductions_high.deduction_supports(deduction), $$BaseKB, TRUE, FALSE);
            final SubLObject v_hl_supports = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = v_hl_supports;
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((support.isList() && cycl_utilities.formula_arg0(support).eql($CODE)) && (NIL != verify_temporal_projection_code_supportP(cycl_utilities.formula_arg1(support, UNPROVIDED)))) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
        }
        return T;
    }

    public static SubLObject verify_temporal_projection_code_supportP(final SubLObject x) {
        if (x.equal($list17)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject get_code_rule_for_documentation() {
        return list(arguments.make_hl_support($CODE, $list17, $$BaseKB, UNPROVIDED));
    }

    public static SubLObject find_likelihood_of_survival_of_spec(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entity = cycl_utilities.formula_arg1(fact, UNPROVIDED);
        final SubLObject starting_date = temporal_projection.find_known_or_expected_starting_date(entity);
        if (NIL == starting_date) {
            return NIL;
        }
        final SubLObject age = temporal_projection_cols.convert_to_unit(date_utilities.time_elapsed(mt_time, starting_date, UNPROVIDED), $$YearsDuration);
        final SubLObject age_in_years = cycl_utilities.formula_arg1(age, UNPROVIDED);
        SubLObject prob = ONE_INTEGER;
        SubLObject justifications = NIL;
        final SubLObject all_relevant_distribution_facts = get_all_relevant_distributions_for_survival_of_entity(entity);
        SubLObject last_known_age = ZERO_INTEGER;
        thread.resetMultipleValues();
        final SubLObject last_known_time = find_the_latest_known_time_point_of_existence(entity);
        final SubLObject last_known_time_assertion = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != last_known_time) {
            last_known_age = cycl_utilities.formula_arg1(date_utilities.time_elapsed(last_known_time, starting_date, $$YearsDuration), UNPROVIDED);
        }
        if (last_known_age.numG(age_in_years)) {
            return values($list19, list(last_known_time_assertion));
        }
        SubLObject count;
        SubLObject prob_of_death;
        SubLObject prob_of_death_assertion;
        for (count = NIL, count = ZERO_INTEGER; count.numL($int$125); count = add(count, ONE_INTEGER)) {
            if (count.numGE(last_known_age) && count.numL(age_in_years)) {
                thread.resetMultipleValues();
                prob_of_death = find_prob_of_termination_of_membership_at_age(count, all_relevant_distribution_facts);
                prob_of_death_assertion = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == prob_of_death) {
                    return NIL;
                }
                justifications = append(justifications, list(prob_of_death_assertion));
                prob = multiply(prob, subtract(ONE_INTEGER, prob_of_death));
                if (prob.numE(ZERO_INTEGER)) {
                    return values(list($$NumericLikelihoodFn, prob), justifications);
                }
            }
        }
        return values(list($$NumericLikelihoodFn, prob), justifications);
    }

    public static SubLObject find_prob_of_termination_of_membership_at_age(final SubLObject age, final SubLObject all_assertions) {
        SubLObject cdolist_list_var = all_assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject interval = cycl_utilities.formula_arg3(gaf, UNPROVIDED);
            if (age.numGE(cycl_utilities.formula_arg1(interval, UNPROVIDED)) && age.numL(cycl_utilities.formula_arg2(interval, UNPROVIDED))) {
                return values(cycl_utilities.formula_arg5(gaf, UNPROVIDED), assertion);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject get_all_relevant_distributions_for_survival_of_entity(final SubLObject en) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs($$BiologicalLivingObject, $const23$conditionalProbabilityOfTerminati, UNPROVIDED, UNPROVIDED);
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject col = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
            if (NIL != funcall(makeSymbol("ISA-IN-ANY-MT-MEMOIZED?"), en, col)) {
                result = cons(assertion, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject find_expected_survival_duration_at_age(final SubLObject age, final SubLObject upper) {
        SubLObject age_in_years = NIL;
        final SubLObject age_units = cycl_utilities.formula_arg0(age);
        final SubLObject age_value = cycl_utilities.formula_arg1(age, UNPROVIDED);
        SubLObject prob = ONE_INTEGER;
        if (age_units.eql($$YearsDuration)) {
            age_in_years = age_value;
        } else {
            age_in_years = quantities.convert_to_units($$YearsDuration, age_units, age_value, UNPROVIDED);
        }
        SubLObject count;
        SubLObject current_age;
        SubLObject one_year_death_probability;
        for (count = NIL, count = ZERO_INTEGER; count.numL($int$125); count = add(count, ONE_INTEGER)) {
            current_age = add(age_in_years, count);
            one_year_death_probability = one_year_death_probability_at_age(current_age);
            prob = multiply(prob, exp(subtract(ZERO_INTEGER, one_year_death_probability)));
            if (prob.numL(upper)) {
                return list($$YearsDuration, current_age);
            }
        }
        return NIL;
    }

    public static SubLObject one_year_death_probability_at_age(final SubLObject age) {
        if (age.numE(ZERO_INTEGER)) {
            return $float$0_007;
        }
        if (age.numE(ONE_INTEGER)) {
            return $float$4_0e_4;
        }
        if (age.numE(TWO_INTEGER)) {
            return $float$3_0e_4;
        }
        if (age.numL(FIVE_INTEGER)) {
            return $float$2_0e_4;
        }
        if (age.numL(TEN_INTEGER)) {
            return $float$1_0e_4;
        }
        if (age.numL(FIFTEEN_INTEGER)) {
            return $float$4_0e_4;
        }
        if (age.numL($int$25)) {
            return $float$0_001;
        }
        if (age.numL($int$30)) {
            return $float$0_0014;
        }
        if (age.numL($int$35)) {
            return $float$0_0015;
        }
        if (age.numL($int$40)) {
            return $float$0_0019;
        }
        if (age.numL($int$45)) {
            return $float$0_0029;
        }
        if (age.numL($int$50)) {
            return $float$0_0042;
        }
        if (age.numL($int$55)) {
            return $float$0_0065;
        }
        if (age.numL($int$60)) {
            return $float$0_0094;
        }
        if (age.numL($int$65)) {
            return $float$0_015;
        }
        if (age.numL($int$70)) {
            return $float$0_019;
        }
        if (age.numL($int$75)) {
            return $float$0_031;
        }
        if (age.numL($int$80)) {
            return $float$0_048;
        }
        if (age.numL($int$85)) {
            return $float$0_086;
        }
        if (age.numL($int$90)) {
            return $float$0_129;
        }
        if (age.numL($int$95)) {
            return $float$0_229;
        }
        if (age.numL($int$100)) {
            return $float$0_31;
        }
        if (age.numL($int$105)) {
            return $float$0_41;
        }
        if (age.numL($int$110)) {
            return $float$0_5;
        }
        if (age.numL($int$115)) {
            return $float$0_68;
        }
        if (age.numL($int$120)) {
            return $float$0_82;
        }
        if (age.numL($int$125)) {
            return $float$0_91;
        }
        return ONE_INTEGER;
    }

    public static SubLObject possibly_get_nauts_from_narts(final SubLObject time) {
        if (NIL != nart_handles.nart_p(time)) {
            return narts_high.nart_hl_formula(time);
        }
        return time;
    }

    public static SubLObject get_monad_mt(final SubLObject mt) {
        if (!mt.isList()) {
            return mt;
        }
        if (cycl_utilities.formula_arg0(mt).eql($$MtSpace)) {
            return cycl_utilities.formula_arg1(mt, UNPROVIDED);
        }
        return mt;
    }

    public static SubLObject mt_with_anytime_psc_time_parameter(final SubLObject mt) {
        if (mt.eql($$EverythingPSC)) {
            return mt;
        }
        if (mt.isList() && cycl_utilities.formula_arg0(mt).eql($$MtSpace)) {
            return listS($$MtSpace, cycl_utilities.formula_arg1(mt, UNPROVIDED), $list70);
        }
        if (!mt.isList()) {
            return listS($$MtSpace, mt, $list70);
        }
        return mt;
    }

    public static SubLObject assertion_produced_by_temporal_projectionP(final SubLObject assertion) {
        return kb_mapping_utilities.pred_value_gafs_in_relevant_mts(assertion, $const71$assertionProducedByTemporalProjec, $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject format_justification_entry(final SubLObject entry) {
        if (NIL != assertion_handles.assertion_p(entry)) {
            return list(entry);
        }
        return entry;
    }

    public static SubLObject find_the_latest_known_time_point_of_existence(final SubLObject entity) {
        SubLObject current_best_time = NIL;
        SubLObject current_best_assertion = NIL;
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
                        SubLObject done_var_$1 = NIL;
                        final SubLObject token_var_$2 = NIL;
                        while (NIL == done_var_$1) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                            final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                            if (NIL != valid_$3) {
                                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                                final SubLObject assertion_time = possibly_get_nauts_from_narts(temporal_projection.get_time_for_assertion_1(assertion));
                                if (NIL != assertion_time) {
                                    final SubLObject col_2 = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
                                    if (NIL != genls.genlP(col_2, $$BiologicalLivingObject, UNPROVIDED, UNPROVIDED)) {
                                        final SubLObject last_time_point = find_last_point_of_time(assertion_time);
                                        if (NIL != last_time_point) {
                                            if (NIL == current_best_time) {
                                                current_best_time = last_time_point;
                                                current_best_assertion = assertion;
                                            } else
                                                if ((!last_time_point.equal(current_best_time)) && (NIL != date_utilities.later_than(last_time_point, current_best_time))) {
                                                    current_best_time = last_time_point;
                                                    current_best_assertion = assertion;
                                                }

                                        }
                                    }
                                }
                            }
                            done_var_$1 = makeBoolean(NIL == valid_$3);
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
        return values(current_best_time, current_best_assertion);
    }

    public static SubLObject find_first_point_of_time(final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject function = cycl_utilities.formula_arg0(time);
        final SubLObject arg1 = cycl_utilities.formula_arg1(time, UNPROVIDED);
        if (NIL != nart_handles.nart_p(arg1)) {
            return NIL;
        }
        if (time.eql($$Now)) {
            return date_utilities.indexical_now();
        }
        if (!time.isList()) {
            return NIL;
        }
        if (NIL != member(function, $ignored_temporal_projection_functions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        if (function.eql($$TimeIntervalInclusiveFn)) {
            return find_first_point_of_time(arg1);
        }
        if (function.eql($$TimeInterval_Incl_Excl_Fn)) {
            return find_first_point_of_time(arg1);
        }
        if (function.eql($$TimeInterval_Excl_Incl_Fn)) {
            return find_first_point_of_time(arg1);
        }
        if (function.eql($$SomeTimeInIntervalFn)) {
            return find_first_point_of_time(arg1);
        }
        if (function.eql($$IntervalStartedByFn) || function.eql($$IntervalStartedByFn_Inclusive)) {
            return find_first_point_of_time(arg1);
        }
        if (function.eql($$YearBCE_JulianFn)) {
            return list($$YearFn, subtract(ZERO_INTEGER, arg1));
        }
        if (function.eql($$IntervalEndedByFn)) {
            return NIL;
        }
        if (function.eql($$EndFn)) {
            return find_last_point_of_time(arg1);
        }
        if (function.eql($$TimeIntervalBetweenFn)) {
            return find_first_point_of_time(arg1);
        }
        if (function.eql($$DayFn)) {
            return time;
        }
        if (function.eql($$MonthFn)) {
            return time;
        }
        if (function.eql($$YearFn)) {
            return time;
        }
        if (function.eql($$HourFn)) {
            return time;
        }
        if (function.eql($$MinuteFn)) {
            return time;
        }
        if (function.eql($$SecondFn)) {
            return time;
        }
        if (function.eql($$DecadeFn)) {
            return time;
        }
        return NIL;
    }

    public static SubLObject find_last_point_of_time(final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject function = cycl_utilities.formula_arg0(time);
        final SubLObject arg1 = cycl_utilities.formula_arg1(time, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.formula_arg2(time, UNPROVIDED);
        if (time.eql($$Now)) {
            return date_utilities.indexical_now();
        }
        if (!time.isList()) {
            return NIL;
        }
        if (NIL != nart_handles.nart_p(arg2)) {
            return NIL;
        }
        if (NIL != member(function, $ignored_temporal_projection_functions$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        if (function.eql($$TimeIntervalInclusiveFn)) {
            return find_last_point_of_time(cycl_utilities.formula_arg2(time, UNPROVIDED));
        }
        if (function.eql($$TimeInterval_Incl_Excl_Fn)) {
            return find_last_point_of_time(arg2);
        }
        if (function.eql($$TimeInterval_Excl_Incl_Fn)) {
            return find_last_point_of_time(arg2);
        }
        if (function.eql($$SomeTimeInIntervalFn)) {
            return find_last_point_of_time(cycl_utilities.formula_arg1(time, UNPROVIDED));
        }
        if (function.eql($$IntervalEndedByFn)) {
            return find_last_point_of_time(arg1);
        }
        if (function.eql($$EndFn)) {
            return find_last_point_of_time(arg1);
        }
        if (function.eql($$YearBCE_JulianFn)) {
            return list($$YearFn, subtract(ZERO_INTEGER, arg1));
        }
        if (cycl_utilities.formula_arg0(time).eql($$IntervalStartedByFn) || cycl_utilities.formula_arg0(time).eql($$IntervalStartedByFn_Inclusive)) {
            return NIL;
        }
        if (function.eql($$TimeIntervalBetweenFn)) {
            return find_last_point_of_time(cycl_utilities.formula_arg2(time, UNPROVIDED));
        }
        if (function.eql($$DayFn)) {
            return time;
        }
        if (function.eql($$MonthFn)) {
            return time;
        }
        if (function.eql($$YearFn)) {
            return time;
        }
        if (function.eql($$HourFn)) {
            return time;
        }
        if (function.eql($$MinuteFn)) {
            return time;
        }
        if (function.eql($$SecondFn)) {
            return time;
        }
        if (function.eql($$DecadeFn)) {
            return time;
        }
        return NIL;
    }

    public static SubLObject sunrise_time_for_location(final SubLObject place, final SubLObject date, SubLObject time_zone) {
        if (time_zone == UNPROVIDED) {
            time_zone = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject latitude = get_latitude_of_place(place);
        thread.resetMultipleValues();
        final SubLObject offset = find_offset_for_location_on_date(place, date, time_zone);
        final SubLObject just = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject longitude = get_longitude_of_place(place);
        if ((((NIL != latitude) && (NIL != longitude)) && (NIL != offset)) && (NIL != date)) {
            return values(calculate_sunrise_time(latitude, longitude, date, offset), just);
        }
        return NIL;
    }

    public static SubLObject sunset_time_for_location(final SubLObject place, final SubLObject date, SubLObject time_zone) {
        if (time_zone == UNPROVIDED) {
            time_zone = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject latitude = get_latitude_of_place(place);
        thread.resetMultipleValues();
        final SubLObject offset = find_offset_for_location_on_date(place, date, time_zone);
        final SubLObject just = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject longitude = get_longitude_of_place(place);
        if ((((NIL != latitude) && (NIL != longitude)) && (NIL != offset)) && (NIL != date)) {
            return values(calculate_sunset_time(latitude, longitude, date, offset), just);
        }
        return NIL;
    }

    public static SubLObject dawn_time_for_location(final SubLObject place, final SubLObject date, SubLObject time_zone) {
        if (time_zone == UNPROVIDED) {
            time_zone = NIL;
        }
        final SubLObject latitude = get_latitude_of_place(place);
        final SubLObject offset = find_offset_for_location_on_date(place, date, time_zone);
        final SubLObject longitude = get_longitude_of_place(place);
        if ((((NIL != latitude) && (NIL != longitude)) && (NIL != offset)) && (NIL != date)) {
            return calculate_dawn_time(latitude, longitude, date, offset);
        }
        return NIL;
    }

    public static SubLObject dusk_time_for_location(final SubLObject place, final SubLObject date, SubLObject time_zone) {
        if (time_zone == UNPROVIDED) {
            time_zone = NIL;
        }
        final SubLObject latitude = get_latitude_of_place(place);
        final SubLObject offset = find_offset_for_location_on_date(place, date, time_zone);
        final SubLObject longitude = get_longitude_of_place(place);
        if ((((NIL != latitude) && (NIL != longitude)) && (NIL != offset)) && (NIL != date)) {
            return calculate_dusk_time(latitude, longitude, date, offset);
        }
        return NIL;
    }

    public static SubLObject get_latitude_of_place(final SubLObject place_1) {
        if (NIL != place_1) {
            SubLObject place = NIL;
            if (place_1.isList()) {
                place = narts_high.find_nart(place_1);
            } else {
                place = place_1;
            }
            if (NIL != place) {
                SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs_in_any_mt(place, $$latitude, ONE_INTEGER, UNPROVIDED));
                if (NIL == assertion) {
                    assertion = use_territory_fn_to_get_information(place_1, $$latitude);
                }
                if (NIL != assertion) {
                    final SubLObject gaf = assertions_high.gaf_formula(assertion);
                    final SubLObject latitude = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(gaf, UNPROVIDED), UNPROVIDED);
                    return latitude;
                }
            }
        }
        return NIL;
    }

    public static SubLObject use_territory_fn_to_get_information(final SubLObject place, final SubLObject pred) {
        if (!place.isList()) {
            final SubLObject nart = narts_high.find_nart(list($$TerritoryFn, place));
            if (NIL != nart) {
                return cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs_in_any_mt(nart, pred, ONE_INTEGER, UNPROVIDED));
            }
        }
        return NIL;
    }

    public static SubLObject get_longitude_of_place(final SubLObject place_1) {
        if (NIL != place_1) {
            SubLObject place = NIL;
            if (place_1.isList()) {
                place = narts_high.find_nart(place_1);
            } else {
                place = place_1;
            }
            if (NIL != place) {
                SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs_in_any_mt(place, $$longitude, ONE_INTEGER, UNPROVIDED));
                if (NIL == assertion) {
                    assertion = use_territory_fn_to_get_information(place_1, $$longitude);
                }
                if (NIL != assertion) {
                    final SubLObject gaf = assertions_high.gaf_formula(assertion);
                    final SubLObject longitude = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(gaf, UNPROVIDED), UNPROVIDED);
                    return subtract(ZERO_INTEGER, longitude);
                }
            }
        }
        return NIL;
    }

    public static SubLObject calculate_sunset_time(final SubLObject latitude, final SubLObject longitude, final SubLObject date, final SubLObject offset) {
        final SubLObject universal_time = date_utilities.cycl_date_to_universal_time(date);
        final SubLObject latitude_in_radians = multiply($float$0_0174532925, latitude);
        final SubLObject julian_date = numeric_date_utilities.get_julian_date(universal_time, UNPROVIDED);
        final SubLObject n_star = subtract(subtract(julian_date, $float$2451545_0009), divide(longitude, $int$360));
        final SubLObject n = round(add(n_star, $float$0_5), UNPROVIDED);
        final SubLObject j_star = add($int$2451545, add($float$8_999999999999999e_4, add(n, divide(longitude, $int$360))));
        final SubLObject m = mod(add($float$357_5291, multiply($float$0_98560028, subtract(j_star, $int$2451545))), $int$360);
        final SubLObject m_in_radians = multiply(m, $float$0_0174532925);
        final SubLObject c = add(multiply($float$1_9148, sin(m_in_radians)), multiply($float$0_02, sin(multiply(TWO_INTEGER, m_in_radians))), multiply($float$3_0e_4, sin(multiply(THREE_INTEGER, m_in_radians))));
        final SubLObject lambda_value = mod(add(new SubLObject[]{ m, $float$102_9372, c, $int$180 }), $int$360);
        final SubLObject lambda_in_radians = multiply(lambda_value, $float$0_0174532925);
        final SubLObject delta = asin(multiply(sin(lambda_in_radians), $float$0_39794863131));
        final SubLObject sin_delta = sin(delta);
        final SubLObject cos_delta = cos(delta);
        final SubLObject cos_omega = divide(subtract($float$_0_014485726139, multiply(sin(latitude_in_radians), sin_delta)), multiply(cos(latitude_in_radians), cos_delta));
        if (cos_omega.numG(ONE_INTEGER) || cos_omega.numL(MINUS_ONE_INTEGER)) {
            return NIL;
        }
        final SubLObject omega_in_radians = acos(cos_omega);
        final SubLObject omega_in_degrees = multiply(omega_in_radians, $float$57_2957795);
        final SubLObject j_star_two = add($int$2451545, add($float$8_999999999999999e_4, add(n, divide(add(omega_in_degrees, longitude), $int$360))));
        final SubLObject j_set = add(j_star_two, subtract(multiply($float$0_0053, sin(m_in_radians)), multiply($float$0_0069, sin(multiply(TWO_INTEGER, lambda_in_radians)))));
        if (NIL != j_set) {
            final SubLObject no_of_seconds = multiply($int$86400, subtract(add(j_set, $float$0_5), floor(j_set, UNPROVIDED)));
            final SubLObject no_of_hours = floor(divide(no_of_seconds, $int$3600), UNPROVIDED);
            final SubLObject no_of_minutes = floor(divide(subtract(no_of_seconds, multiply(no_of_hours, $int$3600)), $int$60), UNPROVIDED);
            final SubLObject date_after_one_day = bindings.variable_lookup($sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query(list($$evaluate, $sym113$_X, listS($$DateAfterFn, date, $list116)), UNPROVIDED, UNPROVIDED)));
            if ((((NIL != no_of_hours) && (NIL != no_of_minutes)) && (NIL != offset)) && no_of_hours.numG($int$23)) {
                return convert_offset(list($$MinuteFn, no_of_minutes, list($$HourFn, subtract(no_of_hours, $int$24), date_after_one_day)), offset, date);
            }
            if (((NIL != no_of_hours) && (NIL != no_of_minutes)) && (NIL != offset)) {
                return convert_offset(list($$MinuteFn, no_of_minutes, list($$HourFn, no_of_hours, date)), offset, date);
            }
        }
        return NIL;
    }

    public static SubLObject calculate_dusk_time(final SubLObject latitude, final SubLObject longitude, final SubLObject date, final SubLObject offset) {
        final SubLObject universal_time = date_utilities.cycl_date_to_universal_time(date);
        final SubLObject latitude_in_radians = multiply($float$0_0174532925, latitude);
        final SubLObject julian_date = numeric_date_utilities.get_julian_date(universal_time, UNPROVIDED);
        final SubLObject n_star = subtract(subtract(julian_date, $float$2451545_0009), divide(longitude, $int$360));
        final SubLObject n = round(add(n_star, $float$0_5), UNPROVIDED);
        final SubLObject j_star = add($int$2451545, add($float$8_999999999999999e_4, add(n, divide(longitude, $int$360))));
        final SubLObject m = mod(add($float$357_5291, multiply($float$0_98560028, subtract(j_star, $int$2451545))), $int$360);
        final SubLObject m_in_radians = multiply(m, $float$0_0174532925);
        final SubLObject c = add(multiply($float$1_9148, sin(m_in_radians)), multiply($float$0_02, sin(multiply(TWO_INTEGER, m_in_radians))), multiply($float$3_0e_4, sin(multiply(THREE_INTEGER, m_in_radians))));
        final SubLObject lambda_value = mod(add(new SubLObject[]{ m, $float$102_9372, c, $int$180 }), $int$360);
        final SubLObject lambda_in_radians = multiply(lambda_value, $float$0_0174532925);
        final SubLObject delta = asin(multiply(sin(lambda_in_radians), $float$0_39794863131));
        final SubLObject sin_delta = sin(delta);
        final SubLObject cos_delta = cos(delta);
        final SubLObject cos_omega = divide(subtract($float$_0_014485726139, multiply(sin(latitude_in_radians), sin_delta)), multiply(cos(latitude_in_radians), cos_delta));
        if (cos_omega.numG(ONE_INTEGER) || cos_omega.numL(MINUS_ONE_INTEGER)) {
            return NIL;
        }
        final SubLObject omega_in_radians = acos(cos_omega);
        final SubLObject omega_in_degrees = multiply(omega_in_radians, $float$57_2957795);
        final SubLObject j_star_two = add($int$2451545, add($float$8_999999999999999e_4, add(n, divide(add(omega_in_degrees, SIX_INTEGER, longitude), $int$360))));
        final SubLObject j_set = add(j_star_two, subtract(multiply($float$0_0053, sin(m_in_radians)), multiply($float$0_0069, sin(multiply(TWO_INTEGER, lambda_in_radians)))));
        if (NIL != j_set) {
            final SubLObject no_of_seconds = multiply($int$86400, subtract(add(j_set, $float$0_5), floor(j_set, UNPROVIDED)));
            final SubLObject no_of_hours = floor(divide(no_of_seconds, $int$3600), UNPROVIDED);
            final SubLObject no_of_minutes = floor(divide(subtract(no_of_seconds, multiply(no_of_hours, $int$3600)), $int$60), UNPROVIDED);
            final SubLObject date_after_one_day = bindings.variable_lookup($sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query(list($$evaluate, $sym113$_X, listS($$DateAfterFn, date, $list116)), UNPROVIDED, UNPROVIDED)));
            if ((((NIL != no_of_hours) && (NIL != no_of_minutes)) && (NIL != offset)) && no_of_hours.numG($int$23)) {
                return convert_offset(list($$MinuteFn, no_of_minutes, list($$HourFn, subtract(no_of_hours, $int$24), date_after_one_day)), offset, date);
            }
            if (((NIL != no_of_hours) && (NIL != no_of_minutes)) && (NIL != offset)) {
                return convert_offset(list($$MinuteFn, no_of_minutes, list($$HourFn, no_of_hours, date)), offset, date);
            }
        }
        return NIL;
    }

    public static SubLObject calculate_sunrise_time(final SubLObject latitude, final SubLObject longitude, final SubLObject date, final SubLObject offset) {
        final SubLObject universal_time = date_utilities.cycl_date_to_universal_time(date);
        final SubLObject latitude_in_radians = multiply($float$0_0174532925, latitude);
        final SubLObject julian_date = numeric_date_utilities.get_julian_date(universal_time, UNPROVIDED);
        final SubLObject n_star = subtract(subtract(julian_date, $float$2451545_0009), divide(longitude, $int$360));
        final SubLObject n = round(add(n_star, $float$0_5), UNPROVIDED);
        final SubLObject j_star = add($int$2451545, add($float$8_999999999999999e_4, add(n, divide(longitude, $int$360))));
        final SubLObject m = mod(add($float$357_5291, multiply($float$0_98560028, subtract(j_star, $int$2451545))), $int$360);
        final SubLObject m_in_radians = multiply(m, $float$0_0174532925);
        final SubLObject c = add(multiply($float$1_9148, sin(m_in_radians)), multiply($float$0_02, sin(multiply(TWO_INTEGER, m_in_radians))), multiply($float$3_0e_4, sin(multiply(THREE_INTEGER, m_in_radians))));
        final SubLObject lambda_value = mod(add(new SubLObject[]{ m, $float$102_9372, c, $int$180 }), $int$360);
        final SubLObject lambda_in_radians = multiply(lambda_value, $float$0_0174532925);
        final SubLObject j_transit = subtract(add(j_star, multiply($float$0_0053, sin(m_in_radians))), multiply($float$0_0069, sin(multiply(TWO_INTEGER, lambda_in_radians))));
        final SubLObject delta = asin(multiply(sin(lambda_in_radians), $float$0_39794863131));
        final SubLObject sin_delta = sin(delta);
        final SubLObject cos_delta = cos(delta);
        final SubLObject cos_omega = divide(subtract($float$_0_014485726139, multiply(sin(latitude_in_radians), sin_delta)), multiply(cos(latitude_in_radians), cos_delta));
        if (cos_omega.numG(ONE_INTEGER) || cos_omega.numL(MINUS_ONE_INTEGER)) {
            return NIL;
        }
        final SubLObject omega_in_radians = acos(cos_omega);
        final SubLObject omega_in_degrees = multiply(omega_in_radians, $float$57_2957795);
        final SubLObject j_star_two = add($int$2451545, add($float$8_999999999999999e_4, add(n, divide(add(omega_in_degrees, longitude), $int$360))));
        final SubLObject j_set = add(j_star_two, subtract(multiply($float$0_0053, sin(m_in_radians)), multiply($float$0_0069, sin(multiply(TWO_INTEGER, lambda_in_radians)))));
        final SubLObject j_rise = subtract(j_transit, subtract(j_set, j_transit));
        if (NIL != j_rise) {
            final SubLObject no_of_seconds = multiply($int$86400, subtract(add(j_rise, $float$0_5), floor(j_rise, UNPROVIDED)));
            final SubLObject no_of_hours = floor(divide(no_of_seconds, $int$3600), UNPROVIDED);
            final SubLObject no_of_minutes = floor(divide(subtract(no_of_seconds, multiply(no_of_hours, $int$3600)), $int$60), UNPROVIDED);
            final SubLObject date_after_one_day = bindings.variable_lookup($sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query(list($$evaluate, $sym113$_X, listS($$DateAfterFn, date, $list116)), UNPROVIDED, UNPROVIDED)));
            if ((((NIL != no_of_hours) && (NIL != no_of_minutes)) && (NIL != offset)) && no_of_hours.numG($int$23)) {
                return convert_offset(list($$MinuteFn, no_of_minutes, list($$HourFn, subtract(no_of_hours, $int$24), date_after_one_day)), offset, date);
            }
            if (((NIL != no_of_hours) && (NIL != no_of_minutes)) && (NIL != offset)) {
                return convert_offset(list($$MinuteFn, no_of_minutes, list($$HourFn, no_of_hours, date)), offset, date);
            }
        }
        return NIL;
    }

    public static SubLObject calculate_dawn_time(final SubLObject latitude, final SubLObject longitude, final SubLObject date, final SubLObject offset) {
        final SubLObject universal_time = date_utilities.cycl_date_to_universal_time(date);
        final SubLObject latitude_in_radians = multiply($float$0_0174532925, latitude);
        final SubLObject julian_date = numeric_date_utilities.get_julian_date(universal_time, UNPROVIDED);
        final SubLObject n_star = subtract(subtract(julian_date, $float$2451545_0009), divide(longitude, $int$360));
        final SubLObject n = round(add(n_star, $float$0_5), UNPROVIDED);
        final SubLObject j_star = add($int$2451545, add($float$8_999999999999999e_4, add(n, divide(longitude, $int$360))));
        final SubLObject m = mod(add($float$357_5291, multiply($float$0_98560028, subtract(j_star, $int$2451545))), $int$360);
        final SubLObject m_in_radians = multiply(m, $float$0_0174532925);
        final SubLObject c = add(multiply($float$1_9148, sin(m_in_radians)), multiply($float$0_02, sin(multiply(TWO_INTEGER, m_in_radians))), multiply($float$3_0e_4, sin(multiply(THREE_INTEGER, m_in_radians))));
        final SubLObject lambda_value = mod(add(new SubLObject[]{ m, $float$102_9372, c, $int$180 }), $int$360);
        final SubLObject lambda_in_radians = multiply(lambda_value, $float$0_0174532925);
        final SubLObject j_transit = subtract(add(j_star, multiply($float$0_0053, sin(m_in_radians))), multiply($float$0_0069, sin(multiply(TWO_INTEGER, lambda_in_radians))));
        final SubLObject delta = asin(multiply(sin(lambda_in_radians), $float$0_39794863131));
        final SubLObject sin_delta = sin(delta);
        final SubLObject cos_delta = cos(delta);
        final SubLObject cos_omega = divide(subtract($float$_0_014485726139, multiply(sin(latitude_in_radians), sin_delta)), multiply(cos(latitude_in_radians), cos_delta));
        if (cos_omega.numG(ONE_INTEGER) || cos_omega.numL(MINUS_ONE_INTEGER)) {
            return NIL;
        }
        final SubLObject omega_in_radians = acos(cos_omega);
        final SubLObject omega_in_degrees = multiply(omega_in_radians, $float$57_2957795);
        final SubLObject j_star_two = add($int$2451545, add($float$8_999999999999999e_4, add(n, divide(add(omega_in_degrees, SIX_INTEGER, longitude), $int$360))));
        final SubLObject j_set = add(j_star_two, subtract(multiply($float$0_0053, sin(m_in_radians)), multiply($float$0_0069, sin(multiply(TWO_INTEGER, lambda_in_radians)))));
        final SubLObject j_rise = subtract(j_transit, subtract(j_set, j_transit));
        if (NIL != j_rise) {
            final SubLObject no_of_seconds = multiply($int$86400, subtract(add(j_rise, $float$0_5), floor(j_rise, UNPROVIDED)));
            final SubLObject no_of_hours = floor(divide(no_of_seconds, $int$3600), UNPROVIDED);
            final SubLObject no_of_minutes = floor(divide(subtract(no_of_seconds, multiply(no_of_hours, $int$3600)), $int$60), UNPROVIDED);
            final SubLObject date_after_one_day = bindings.variable_lookup($sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query(list($$evaluate, $sym113$_X, listS($$DateAfterFn, date, $list116)), UNPROVIDED, UNPROVIDED)));
            if ((((NIL != no_of_hours) && (NIL != no_of_minutes)) && (NIL != offset)) && no_of_hours.numG($int$23)) {
                return convert_offset(list($$MinuteFn, no_of_minutes, list($$HourFn, subtract(no_of_hours, $int$24), date_after_one_day)), offset, date);
            }
            if (((NIL != no_of_hours) && (NIL != no_of_minutes)) && (NIL != offset)) {
                return convert_offset(list($$MinuteFn, no_of_minutes, list($$HourFn, no_of_hours, date)), offset, date);
            }
        }
        return NIL;
    }

    public static SubLObject convert_offset(final SubLObject date, final SubLObject offset, final SubLObject initial_date) {
        final SubLObject v_answer = bindings.variable_lookup($sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query(list($$evaluate, $sym113$_X, list($$DateBeforeFn, date, offset)), UNPROVIDED, UNPROVIDED)));
        final SubLObject day_of_date_of_answer = bindings.variable_lookup($sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query(list($$evaluate, $sym113$_X, list($$DayOfDateFn, v_answer)), UNPROVIDED, UNPROVIDED)));
        final SubLObject day_of_initial_date = bindings.variable_lookup($sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query(list($$evaluate, $sym113$_X, list($$DayOfDateFn, initial_date)), UNPROVIDED, UNPROVIDED)));
        final SubLObject time_elapsed = temporal_projection_cols.find_time_elapsed(day_of_initial_date, day_of_date_of_answer);
        if (NIL != mt_context.ask_mt_query(list($$laterThan, day_of_date_of_answer, day_of_initial_date), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return bindings.variable_lookup($sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query(list($$evaluate, $sym113$_X, list($$DateBeforeFn, v_answer, time_elapsed)), UNPROVIDED, UNPROVIDED)));
        }
        if (NIL != mt_context.ask_mt_query(list($$laterThan, day_of_initial_date, day_of_date_of_answer), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return bindings.variable_lookup($sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query(list($$evaluate, $sym113$_X, list($$DateAfterFn, v_answer, time_elapsed)), UNPROVIDED, UNPROVIDED)));
        }
        return v_answer;
    }

    public static SubLObject find_offset_for_location_on_date(final SubLObject place, final SubLObject date, SubLObject time_zone_1) {
        if (time_zone_1 == UNPROVIDED) {
            time_zone_1 = NIL;
        }
        SubLObject time_zone = NIL;
        if (NIL != time_zone_1) {
            time_zone = time_zone_1;
        } else {
            time_zone = find_timezone_for_place_at_date(place, date);
        }
        if (NIL != time_zone) {
            final SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs_in_any_mt(time_zone, $$timeZoneOffsetToUTC, ONE_INTEGER, UNPROVIDED));
            if (NIL != assertion) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                return values(cycl_utilities.formula_arg2(gaf, UNPROVIDED), assertion);
            }
        }
        return NIL;
    }

    public static SubLObject find_timezone_for_place_at_date(final SubLObject place, final SubLObject date_1) {
        SubLObject date = NIL;
        if (cycl_utilities.formula_arg0(date_1).eql($$TimeZoneFn)) {
            date = cycl_utilities.formula_arg1(date_1, UNPROVIDED);
        } else {
            date = date_1;
        }
        final SubLObject all_time_zones_and_justifications = get_time_zones_for_place(place);
        final SubLObject latitude = get_latitude_of_place(place);
        final SubLObject year_of_date = bindings.variable_lookup($sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query(list($$evaluate, $sym113$_X, list($$YearOfDateFn, date)), UNPROVIDED, UNPROVIDED)));
        SubLObject daylight_saving_time = NIL;
        if ((NIL != place) && (NIL != latitude)) {
            final SubLObject starting_point_of_daylight_saving_time = find_starting_point_of_daylight_saving_time(place, year_of_date);
            final SubLObject ending_point_of_daylight_saving_time = find_ending_point_of_daylight_saving_time(place, year_of_date);
            if ((latitude.numG(ZERO_INTEGER) && (NIL != date_utilities.later_than(date, starting_point_of_daylight_saving_time))) && (NIL != date_utilities.later_than(ending_point_of_daylight_saving_time, date))) {
                daylight_saving_time = T;
            }
            if (latitude.numL(ZERO_INTEGER) && ((NIL != date_utilities.later_than(date, starting_point_of_daylight_saving_time)) || (NIL != date_utilities.later_than(ending_point_of_daylight_saving_time, date)))) {
                daylight_saving_time = T;
            }
            SubLObject cdolist_list_var = all_time_zones_and_justifications;
            SubLObject entry = NIL;
            entry = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject time_zone = bindings.variable_lookup($sym113$_X, cycl_utilities.formula_arg0(entry));
                final SubLObject just_1 = cycl_utilities.formula_arg1(entry, UNPROVIDED);
                if ((NIL != daylight_saving_time) && (NIL != isa.isaP(time_zone, $$DaylightSavingTimeZone, $$EverythingPSC, UNPROVIDED))) {
                    return values(time_zone, just_1);
                }
                if ((NIL == daylight_saving_time) && (NIL == isa.isaP(time_zone, $$DaylightSavingTimeZone, $$EverythingPSC, UNPROVIDED))) {
                    return values(time_zone, just_1);
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject get_time_zones_for_place(final SubLObject place_1) {
        SubLObject place = NIL;
        if (NIL != nart_handles.nart_p(place_1)) {
            place = narts_high.nart_hl_formula(place_1);
        } else {
            place = place_1;
        }
        final SubLObject result = inference_kernel.new_cyc_query(list($$and, $list127, list($$geographicallySubsumes, $sym113$_X, place)), $$EverythingPSC, $list129);
        return result;
    }

    public static SubLObject find_starting_point_of_daylight_saving_time(final SubLObject place_1, final SubLObject year_of_date) {
        final SubLObject all_bindings = mt_context.ask_mt_query($list130, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject place = NIL;
        if (NIL != nart_handles.nart_p(place_1)) {
            place = narts_high.nart_hl_formula(place_1);
        } else {
            place = place_1;
        }
        if (place.isList() && cycl_utilities.formula_arg0(place).eql($$TerritoryFn)) {
            place = cycl_utilities.formula_arg1(place, UNPROVIDED);
        }
        SubLObject cdolist_list_var = all_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject place_type = bindings.variable_lookup($sym113$_X, binding);
            final SubLObject month_type = bindings.variable_lookup($sym131$_Y, binding);
            final SubLObject day_type = bindings.variable_lookup($sym132$_Z, binding);
            final SubLObject num = bindings.variable_lookup($sym133$_W, binding);
            if (NIL != isa.isaP(place, place_type, $$EverythingPSC, UNPROVIDED)) {
                SubLObject count = ZERO_INTEGER;
                SubLObject day;
                SubLObject date;
                for (day = NIL, day = ZERO_INTEGER; day.numL($int$31); day = add(day, ONE_INTEGER)) {
                    date = list($$DayFn, add(day, ONE_INTEGER), list($$MonthFn, month_type, year_of_date));
                    if (NIL != mt_context.ask_mt_query(list($$isa, date, day_type), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        count = add(count, ONE_INTEGER);
                        if (count.numE(num)) {
                            return date;
                        }
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        final SubLObject answer_from_european_summer_time = find_starting_point_of_european_summer_time(place, year_of_date);
        if (NIL != answer_from_european_summer_time) {
            return answer_from_european_summer_time;
        }
        return NIL;
    }

    public static SubLObject find_ending_point_of_daylight_saving_time(final SubLObject place_1, final SubLObject year_of_date) {
        final SubLObject all_bindings = mt_context.ask_mt_query($list135, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject place = NIL;
        if (NIL != nart_handles.nart_p(place_1)) {
            place = narts_high.nart_hl_formula(place_1);
        } else {
            place = place_1;
        }
        if (place.isList() && cycl_utilities.formula_arg0(place).eql($$TerritoryFn)) {
            place = cycl_utilities.formula_arg1(place, UNPROVIDED);
        }
        SubLObject cdolist_list_var = all_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject place_type = bindings.variable_lookup($sym113$_X, binding);
            final SubLObject month_type = bindings.variable_lookup($sym131$_Y, binding);
            final SubLObject day_type = bindings.variable_lookup($sym132$_Z, binding);
            final SubLObject num = bindings.variable_lookup($sym133$_W, binding);
            if (NIL != isa.isaP(place, place_type, $$EverythingPSC, UNPROVIDED)) {
                SubLObject count = ZERO_INTEGER;
                SubLObject day;
                SubLObject date;
                for (day = NIL, day = ZERO_INTEGER; day.numL($int$31); day = add(day, ONE_INTEGER)) {
                    date = list($$DayFn, add(day, ONE_INTEGER), list($$MonthFn, month_type, year_of_date));
                    if (NIL != mt_context.ask_mt_query(list($$isa, date, day_type), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        count = add(count, ONE_INTEGER);
                        if (count.numE(num)) {
                            return date;
                        }
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        final SubLObject answer_from_european_summer_time = find_ending_point_of_european_summer_time(place, year_of_date);
        if (NIL != answer_from_european_summer_time) {
            return answer_from_european_summer_time;
        }
        return NIL;
    }

    public static SubLObject find_ending_point_of_european_summer_time(final SubLObject place, final SubLObject year_of_date) {
        if (NIL != mt_context.ask_mt_query(list($$properGeographicalSubRegions, $$EuropeanSummerTimeZone, place), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject day = subtract($int$31, floor(mod(add(divide(multiply(FIVE_INTEGER, cycl_utilities.formula_arg1(year_of_date, UNPROVIDED)), FOUR_INTEGER), ONE_INTEGER), SEVEN_INTEGER), UNPROVIDED));
            if (NIL != day) {
                return list($$DayFn, day, list($$MonthFn, $$October, year_of_date));
            }
        }
        return NIL;
    }

    public static SubLObject find_starting_point_of_european_summer_time(final SubLObject place, final SubLObject year_of_date) {
        if (NIL != mt_context.ask_mt_query(list($$properGeographicalSubRegions, $$EuropeanSummerTimeZone, place), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject day = subtract($int$31, floor(mod(add(divide(multiply(FIVE_INTEGER, cycl_utilities.formula_arg1(year_of_date, UNPROVIDED)), FOUR_INTEGER), FOUR_INTEGER), SEVEN_INTEGER), UNPROVIDED));
            if (NIL != day) {
                return list($$DayFn, day, list($$MonthFn, $$March, year_of_date));
            }
        }
        return NIL;
    }

    public static SubLObject cyc_time_zone_conversion(final SubLObject new_time_zone, final SubLObject date) {
        if ((NIL == isa.isaP(date, $$Date, $$EverythingPSC, UNPROVIDED)) || (NIL == isa.isaP(new_time_zone, $$TimeZone, $$EverythingPSC, UNPROVIDED))) {
            return NIL;
        }
        return time_zone_conversion(new_time_zone, date);
    }

    public static SubLObject time_zone_conversion(final SubLObject new_time_zone, final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject time_zone_of_date = cycl_utilities.formula_arg2(date, UNPROVIDED);
        final SubLObject local_time_of_date = cycl_utilities.formula_arg1(date, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject offset_from_utc_1 = find_utc_offset_for_time_zone(time_zone_of_date);
        final SubLObject just_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject offset_from_utc_2 = find_utc_offset_for_time_zone(new_time_zone);
        final SubLObject just_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject difference_of_offsets = bindings.variable_lookup($sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query(list($$evaluate, $sym113$_X, list($$DifferenceFn, offset_from_utc_1, offset_from_utc_2)), UNPROVIDED, UNPROVIDED)));
        if ((((NIL != time_zone_of_date) && (NIL != offset_from_utc_1)) && (NIL != offset_from_utc_2)) && (NIL != isa.isaP(time_zone_of_date, $$TimeZone, $$EverythingPSC, UNPROVIDED))) {
            final SubLObject final_time = bindings.variable_lookup($sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query(list($$evaluate, $sym113$_X, list($$DateAfterDurationStartPreciseFn, local_time_of_date, difference_of_offsets)), UNPROVIDED, UNPROVIDED)));
            if (NIL != final_time) {
                return values(list($$TimeZoneFn, final_time, new_time_zone), list(just_1, just_2));
            }
        }
        return NIL;
    }

    public static SubLObject find_utc_offset_for_time_zone(final SubLObject time_zone) {
        final SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs_in_any_mt(time_zone, $$timeZoneOffsetToUTC, ONE_INTEGER, UNPROVIDED));
        if (NIL != assertion) {
            return values(cycl_utilities.formula_arg2(assertions_high.gaf_formula(assertion), UNPROVIDED), assertion);
        }
        return NIL;
    }

    public static SubLObject location_has_qualitative_time_of_day_at_time(final SubLObject location, final SubLObject time, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject time_zone = find_timezone_for_place_at_date(location, time);
        SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject local_time_at_location = find_local_time_at_location(location, time, time_zone);
        final SubLObject just_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject day_of_date = cycl_utilities.formula_arg0(ask_utilities.query_variable($sym113$_X, list($$evaluate, $sym113$_X, list($$DayOfDateFn, local_time_at_location)), UNPROVIDED, UNPROVIDED));
        thread.resetMultipleValues();
        final SubLObject sunrise_time = sunrise_time_for_location(location, day_of_date, time_zone);
        final SubLObject just_3 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject sunset_time = sunset_time_for_location(location, day_of_date, time_zone);
        final SubLObject dawn = dawn_time_for_location(location, day_of_date, time_zone);
        final SubLObject dusk = dusk_time_for_location(location, day_of_date, time_zone);
        SubLObject mid_day = NIL;
        SubLObject lst_of_answers = NIL;
        justifications = append(justifications, just_2, list(just_3));
        if (((((NIL == local_time_at_location) || (NIL == sunrise_time)) || (NIL == sunset_time)) || (NIL == dawn)) || (NIL == dusk)) {
            return NIL;
        }
        if (NIL != check_midday_time(local_time_at_location)) {
            mid_day = T;
            lst_of_answers = cons(list($$Midday, justifications), lst_of_answers);
        }
        if (NIL != check_morning_time(local_time_at_location)) {
            lst_of_answers = cons(list($$Morning, justifications), lst_of_answers);
        }
        if ((NIL != check_afternoon_time(local_time_at_location)) && (NIL == mid_day)) {
            lst_of_answers = cons(list($$Afternoon, justifications), lst_of_answers);
        }
        if (NIL != check_evening_time(local_time_at_location)) {
            lst_of_answers = cons(list($$Evening, justifications), lst_of_answers);
        }
        if (NIL != check_night_time(local_time_at_location, dusk, dawn)) {
            lst_of_answers = cons(list($$Night, justifications), lst_of_answers);
        }
        if (NIL != check_daytime_hours(local_time_at_location, sunrise_time, sunset_time)) {
            lst_of_answers = cons(list($$DaytimeHours, justifications), lst_of_answers);
        }
        if (sunrise_time.equal(local_time_at_location)) {
            lst_of_answers = cons(list($$Sunrise, justifications), lst_of_answers);
        }
        if (sunset_time.equal(local_time_at_location)) {
            lst_of_answers = cons(list($$Sunset, justifications), lst_of_answers);
        }
        if (NIL != check_dawn_time(local_time_at_location, dawn, sunrise_time)) {
            lst_of_answers = cons(list($$Dawn, justifications), lst_of_answers);
            lst_of_answers = cons(list($$Twilight, justifications), lst_of_answers);
        }
        if (NIL != check_dusk_time(local_time_at_location, dusk, sunset_time)) {
            lst_of_answers = cons(list($$Dusk, justifications), lst_of_answers);
            lst_of_answers = cons(list($$Twilight, justifications), lst_of_answers);
        }
        return lst_of_answers;
    }

    public static SubLObject location_has_sunrise_time(final SubLObject location, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (mt.isList()) {
            final SubLObject time = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(mt, UNPROVIDED), UNPROVIDED);
            if ((NIL != time) && cycl_utilities.formula_arg0(time).eql($$TimeZoneFn)) {
                final SubLObject day_of_date = cycl_utilities.formula_arg1(time, UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject time_zone = find_timezone_for_place_at_date(location, day_of_date);
                final SubLObject just_1 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject sunrise_time = sunrise_time_for_location(location, day_of_date, time_zone);
                final SubLObject just_2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != sunrise_time) && (NIL != time_zone)) {
                    return values(list($$TimeZoneFn, sunrise_time, time_zone), append(just_1, list(just_2)));
                }
            }
        }
        return NIL;
    }

    public static SubLObject location_has_sunset_time(final SubLObject location, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (mt.isList()) {
            final SubLObject time = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(mt, UNPROVIDED), UNPROVIDED);
            if ((NIL != time) && cycl_utilities.formula_arg0(time).eql($$TimeZoneFn)) {
                final SubLObject day_of_date = cycl_utilities.formula_arg1(time, UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject time_zone = find_timezone_for_place_at_date(location, day_of_date);
                final SubLObject just_1 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject sunset_time = sunset_time_for_location(location, day_of_date, time_zone);
                final SubLObject just_2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != sunset_time) && (NIL != time_zone)) {
                    return values(list($$TimeZoneFn, sunset_time, time_zone), append(just_1, list(just_2)));
                }
            }
        }
        return NIL;
    }

    public static SubLObject local_sunrise_time_for_coordinates(final SubLObject latitude, final SubLObject longitude, final SubLObject date_1, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject day_of_date = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (cycl_utilities.formula_arg0(date_1).eql($$TimeZoneFn)) {
                day_of_date = cycl_utilities.formula_arg1(date_1, UNPROVIDED);
            } else {
                day_of_date = date_1;
            }
            thread.resetMultipleValues();
            final SubLObject offset = find_closest_match_for_latitude_and_longitude(latitude, longitude, day_of_date);
            final SubLObject just_3 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != offset) {
                final SubLObject sunrise_time = calculate_sunrise_time(cycl_utilities.formula_arg1(latitude, UNPROVIDED), subtract(ZERO_INTEGER, cycl_utilities.formula_arg1(longitude, UNPROVIDED)), day_of_date, offset);
                if (NIL != sunrise_time) {
                    return values(sunrise_time, just_3);
                }
            }
            final SubLObject timezone_offset = estimate_timezone_offset(latitude, longitude);
            if (NIL != timezone_offset) {
                final SubLObject sunrise_time2 = calculate_sunrise_time(cycl_utilities.formula_arg1(latitude, UNPROVIDED), subtract(ZERO_INTEGER, cycl_utilities.formula_arg1(longitude, UNPROVIDED)), day_of_date, timezone_offset);
                return values(sunrise_time2, NIL);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject local_sunset_time_for_coordinates(final SubLObject latitude, final SubLObject longitude, final SubLObject date_1, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject day_of_date = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (cycl_utilities.formula_arg0(date_1).eql($$TimeZoneFn)) {
                day_of_date = cycl_utilities.formula_arg1(date_1, UNPROVIDED);
            } else {
                day_of_date = date_1;
            }
            thread.resetMultipleValues();
            final SubLObject offset = find_closest_match_for_latitude_and_longitude(latitude, longitude, day_of_date);
            final SubLObject just_3 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != offset) {
                final SubLObject sunset_time = calculate_sunset_time(cycl_utilities.formula_arg1(latitude, UNPROVIDED), subtract(ZERO_INTEGER, cycl_utilities.formula_arg1(longitude, UNPROVIDED)), day_of_date, offset);
                if (NIL != sunset_time) {
                    return values(sunset_time, just_3);
                }
            }
            final SubLObject timezone_offset = estimate_timezone_offset(latitude, longitude);
            if (NIL != timezone_offset) {
                final SubLObject sunset_time2 = calculate_sunset_time(cycl_utilities.formula_arg1(latitude, UNPROVIDED), subtract(ZERO_INTEGER, cycl_utilities.formula_arg1(longitude, UNPROVIDED)), day_of_date, timezone_offset);
                return values(sunset_time2, NIL);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject estimate_timezone_offset(final SubLObject latitude, final SubLObject longitude) {
        final SubLObject offset = subtract(ZERO_INTEGER, divide(cycl_utilities.formula_arg1(longitude, UNPROVIDED), FIFTEEN_INTEGER));
        return list($$HoursDuration, offset);
    }

    public static SubLObject find_closest_match_for_latitude_and_longitude(final SubLObject latitude, final SubLObject longitude, final SubLObject day_of_date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lat_1 = cycl_utilities.formula_arg1(latitude, UNPROVIDED);
        final SubLObject longitude_1 = cycl_utilities.formula_arg1(longitude, UNPROVIDED);
        final SubLObject pred_var = $$latitude;
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
                            SubLObject done_var_$4 = NIL;
                            final SubLObject token_var_$5 = NIL;
                            while (NIL == done_var_$4) {
                                final SubLObject assertion_1 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(assertion_1));
                                if (NIL != valid_$6) {
                                    final SubLObject gaf_1 = assertions_high.gaf_formula(assertion_1);
                                    final SubLObject lat = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(gaf_1, UNPROVIDED), UNPROVIDED);
                                    if (abs(subtract(lat, lat_1)).numL(FIVE_INTEGER)) {
                                        final SubLObject place = cycl_utilities.formula_arg1(gaf_1, UNPROVIDED);
                                        final SubLObject assertion_2 = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(place, $$longitude, UNPROVIDED, UNPROVIDED));
                                        if (NIL != assertion_2) {
                                            final SubLObject gaf_2 = assertions_high.gaf_formula(assertion_2);
                                            final SubLObject longitude_2 = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(gaf_2, UNPROVIDED), UNPROVIDED);
                                            if (abs(subtract(longitude_1, longitude_2)).numL(FIVE_INTEGER)) {
                                                final SubLObject time_zone = find_timezone_for_place_at_date(place, day_of_date);
                                                if (NIL != time_zone) {
                                                    final SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs_in_any_mt(time_zone, $$timeZoneOffsetToUTC, ONE_INTEGER, UNPROVIDED));
                                                    if (NIL != assertion) {
                                                        final SubLObject gaf = assertions_high.gaf_formula(assertion);
                                                        return values(cycl_utilities.formula_arg2(gaf, UNPROVIDED), list(assertion));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                done_var_$4 = makeBoolean(NIL == valid_$6);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
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
        return NIL;
    }

    public static SubLObject check_dawn_time(final SubLObject local_time, final SubLObject dawn, final SubLObject sunrise) {
        if ((NIL != mt_context.ask_mt_query(list($$laterThan, local_time, dawn), UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != mt_context.ask_mt_query(list($$laterThan, sunrise, local_time), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject check_dusk_time(final SubLObject local_time, final SubLObject dusk, final SubLObject sunset) {
        if ((NIL != mt_context.ask_mt_query(list($$laterThan, local_time, sunset), UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != mt_context.ask_mt_query(list($$laterThan, dusk, local_time), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject check_morning_time(final SubLObject local_time_at_location) {
        final SubLObject hour = bindings.variable_lookup($sym113$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query(list($$hourNumberOfDate, $sym113$_X, local_time_at_location), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        if ((NIL != hour) && hour.numL(TWELVE_INTEGER)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject check_afternoon_time(final SubLObject local_time_at_location) {
        final SubLObject hour = bindings.variable_lookup($sym113$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query(list($$hourNumberOfDate, $sym113$_X, local_time_at_location), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        if (((NIL != hour) && hour.numG(ELEVEN_INTEGER)) && hour.numL(SEVENTEEN_INTEGER)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject check_evening_time(final SubLObject local_time_at_location) {
        final SubLObject hour = bindings.variable_lookup($sym113$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query(list($$hourNumberOfDate, $sym113$_X, local_time_at_location), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        if (((NIL != hour) && hour.numG(SIXTEEN_INTEGER)) && hour.numL($int$21)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject check_midday_time(final SubLObject local_time_at_location) {
        final SubLObject hour = cycl_utilities.formula_arg0(ask_utilities.query_variable($sym113$_X, list($$hourNumberOfDate, $sym113$_X, local_time_at_location), UNPROVIDED, UNPROVIDED));
        if (hour.isNumber() && hour.numE(TWELVE_INTEGER)) {
            final SubLObject minutes = get_minutes_of_date(local_time_at_location);
            if ((NIL != minutes) && minutes.numE(ZERO_INTEGER)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject check_midnight_time(final SubLObject local_time_at_location) {
        final SubLObject hour = bindings.variable_lookup($sym113$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query(list($$hourNumberOfDate, $sym113$_X, local_time_at_location), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        if ((NIL != hour) && hour.numE(ZERO_INTEGER)) {
            final SubLObject minutes = get_minutes_of_date(local_time_at_location);
            if (minutes.numE(ZERO_INTEGER)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject get_minutes_of_date(final SubLObject date) {
        if (cycl_utilities.formula_arg0(date).eql($$SecondFn)) {
            return cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(date, UNPROVIDED), UNPROVIDED);
        }
        if (cycl_utilities.formula_arg0(date).eql($$MinuteFn)) {
            return cycl_utilities.formula_arg1(date, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject check_night_time(final SubLObject local_time_at_location, final SubLObject dusk, final SubLObject dawn) {
        if (NIL != mt_context.ask_mt_query(list($$laterThan, dawn, local_time_at_location), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        if (NIL != mt_context.ask_mt_query(list($$laterThan, local_time_at_location, dusk), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject check_daytime_hours(final SubLObject local_time_at_location, final SubLObject sunrise, final SubLObject sunset) {
        if ((NIL != mt_context.ask_mt_query(list($$laterThan, local_time_at_location, sunrise), UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != mt_context.ask_mt_query(list($$laterThan, sunset, local_time_at_location), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject find_local_time_at_location(final SubLObject location, final SubLObject time_1, final SubLObject timezone) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycl_utilities.formula_arg0(time_1).eql($$TimeZoneFn)) {
            thread.resetMultipleValues();
            final SubLObject local_time_with_timezone = time_zone_conversion(timezone, time_1);
            final SubLObject just = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != local_time_with_timezone) {
                return values(cycl_utilities.formula_arg1(local_time_with_timezone, UNPROVIDED), just);
            }
        }
        return NIL;
    }

    public static SubLObject declare_temporal_projection_utilities_file() {
        declareFunction("store_temporal_projection_results", "STORE-TEMPORAL-PROJECTION-RESULTS", 3, 1, false);
        declareFunction("temporal_projection_quick_failP", "TEMPORAL-PROJECTION-QUICK-FAIL?", 1, 0, false);
        declareFunction("deduction_not_produced_by_temporal_projectionP", "DEDUCTION-NOT-PRODUCED-BY-TEMPORAL-PROJECTION?", 1, 0, false);
        declareFunction("verify_temporal_projection_code_supportP", "VERIFY-TEMPORAL-PROJECTION-CODE-SUPPORT?", 1, 0, false);
        declareFunction("get_code_rule_for_documentation", "GET-CODE-RULE-FOR-DOCUMENTATION", 0, 0, false);
        declareFunction("find_likelihood_of_survival_of_spec", "FIND-LIKELIHOOD-OF-SURVIVAL-OF-SPEC", 3, 0, false);
        declareFunction("find_prob_of_termination_of_membership_at_age", "FIND-PROB-OF-TERMINATION-OF-MEMBERSHIP-AT-AGE", 2, 0, false);
        declareFunction("get_all_relevant_distributions_for_survival_of_entity", "GET-ALL-RELEVANT-DISTRIBUTIONS-FOR-SURVIVAL-OF-ENTITY", 1, 0, false);
        declareFunction("find_expected_survival_duration_at_age", "FIND-EXPECTED-SURVIVAL-DURATION-AT-AGE", 2, 0, false);
        declareFunction("one_year_death_probability_at_age", "ONE-YEAR-DEATH-PROBABILITY-AT-AGE", 1, 0, false);
        declareFunction("possibly_get_nauts_from_narts", "POSSIBLY-GET-NAUTS-FROM-NARTS", 1, 0, false);
        declareFunction("get_monad_mt", "GET-MONAD-MT", 1, 0, false);
        declareFunction("mt_with_anytime_psc_time_parameter", "MT-WITH-ANYTIME-PSC-TIME-PARAMETER", 1, 0, false);
        declareFunction("assertion_produced_by_temporal_projectionP", "ASSERTION-PRODUCED-BY-TEMPORAL-PROJECTION?", 1, 0, false);
        declareFunction("format_justification_entry", "FORMAT-JUSTIFICATION-ENTRY", 1, 0, false);
        declareFunction("find_the_latest_known_time_point_of_existence", "FIND-THE-LATEST-KNOWN-TIME-POINT-OF-EXISTENCE", 1, 0, false);
        declareFunction("find_first_point_of_time", "FIND-FIRST-POINT-OF-TIME", 1, 0, false);
        declareFunction("find_last_point_of_time", "FIND-LAST-POINT-OF-TIME", 1, 0, false);
        declareFunction("sunrise_time_for_location", "SUNRISE-TIME-FOR-LOCATION", 2, 1, false);
        declareFunction("sunset_time_for_location", "SUNSET-TIME-FOR-LOCATION", 2, 1, false);
        declareFunction("dawn_time_for_location", "DAWN-TIME-FOR-LOCATION", 2, 1, false);
        declareFunction("dusk_time_for_location", "DUSK-TIME-FOR-LOCATION", 2, 1, false);
        declareFunction("get_latitude_of_place", "GET-LATITUDE-OF-PLACE", 1, 0, false);
        declareFunction("use_territory_fn_to_get_information", "USE-TERRITORY-FN-TO-GET-INFORMATION", 2, 0, false);
        declareFunction("get_longitude_of_place", "GET-LONGITUDE-OF-PLACE", 1, 0, false);
        declareFunction("calculate_sunset_time", "CALCULATE-SUNSET-TIME", 4, 0, false);
        declareFunction("calculate_dusk_time", "CALCULATE-DUSK-TIME", 4, 0, false);
        declareFunction("calculate_sunrise_time", "CALCULATE-SUNRISE-TIME", 4, 0, false);
        declareFunction("calculate_dawn_time", "CALCULATE-DAWN-TIME", 4, 0, false);
        declareFunction("convert_offset", "CONVERT-OFFSET", 3, 0, false);
        declareFunction("find_offset_for_location_on_date", "FIND-OFFSET-FOR-LOCATION-ON-DATE", 2, 1, false);
        declareFunction("find_timezone_for_place_at_date", "FIND-TIMEZONE-FOR-PLACE-AT-DATE", 2, 0, false);
        declareFunction("get_time_zones_for_place", "GET-TIME-ZONES-FOR-PLACE", 1, 0, false);
        declareFunction("find_starting_point_of_daylight_saving_time", "FIND-STARTING-POINT-OF-DAYLIGHT-SAVING-TIME", 2, 0, false);
        declareFunction("find_ending_point_of_daylight_saving_time", "FIND-ENDING-POINT-OF-DAYLIGHT-SAVING-TIME", 2, 0, false);
        declareFunction("find_ending_point_of_european_summer_time", "FIND-ENDING-POINT-OF-EUROPEAN-SUMMER-TIME", 2, 0, false);
        declareFunction("find_starting_point_of_european_summer_time", "FIND-STARTING-POINT-OF-EUROPEAN-SUMMER-TIME", 2, 0, false);
        declareFunction("cyc_time_zone_conversion", "CYC-TIME-ZONE-CONVERSION", 2, 0, false);
        declareFunction("time_zone_conversion", "TIME-ZONE-CONVERSION", 2, 0, false);
        declareFunction("find_utc_offset_for_time_zone", "FIND-UTC-OFFSET-FOR-TIME-ZONE", 1, 0, false);
        declareFunction("location_has_qualitative_time_of_day_at_time", "LOCATION-HAS-QUALITATIVE-TIME-OF-DAY-AT-TIME", 3, 0, false);
        declareFunction("location_has_sunrise_time", "LOCATION-HAS-SUNRISE-TIME", 2, 0, false);
        declareFunction("location_has_sunset_time", "LOCATION-HAS-SUNSET-TIME", 2, 0, false);
        declareFunction("local_sunrise_time_for_coordinates", "LOCAL-SUNRISE-TIME-FOR-COORDINATES", 3, 1, false);
        declareFunction("local_sunset_time_for_coordinates", "LOCAL-SUNSET-TIME-FOR-COORDINATES", 3, 1, false);
        declareFunction("estimate_timezone_offset", "ESTIMATE-TIMEZONE-OFFSET", 2, 0, false);
        declareFunction("find_closest_match_for_latitude_and_longitude", "FIND-CLOSEST-MATCH-FOR-LATITUDE-AND-LONGITUDE", 3, 0, false);
        declareFunction("check_dawn_time", "CHECK-DAWN-TIME", 3, 0, false);
        declareFunction("check_dusk_time", "CHECK-DUSK-TIME", 3, 0, false);
        declareFunction("check_morning_time", "CHECK-MORNING-TIME", 1, 0, false);
        declareFunction("check_afternoon_time", "CHECK-AFTERNOON-TIME", 1, 0, false);
        declareFunction("check_evening_time", "CHECK-EVENING-TIME", 1, 0, false);
        declareFunction("check_midday_time", "CHECK-MIDDAY-TIME", 1, 0, false);
        declareFunction("check_midnight_time", "CHECK-MIDNIGHT-TIME", 1, 0, false);
        declareFunction("get_minutes_of_date", "GET-MINUTES-OF-DATE", 1, 0, false);
        declareFunction("check_night_time", "CHECK-NIGHT-TIME", 3, 0, false);
        declareFunction("check_daytime_hours", "CHECK-DAYTIME-HOURS", 3, 0, false);
        declareFunction("find_local_time_at_location", "FIND-LOCAL-TIME-AT-LOCATION", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_temporal_projection_utilities_file() {
        defparameter("*IGNORED-TEMPORAL-PROJECTION-FUNCTIONS*", $list0);
        defparameter("*TEMPORAL-PROJECTION-DISTRIBUTION-PREDICATE-LIST*", $list1);
        return NIL;
    }

    public static SubLObject setup_temporal_projection_utilities_file() {
        register_kb_function(CYC_TIME_ZONE_CONVERSION);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_temporal_projection_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_temporal_projection_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_temporal_projection_utilities_file();
    }
}

