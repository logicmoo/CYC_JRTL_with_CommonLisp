package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class time_parameter_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new time_parameter_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.time_parameter_utilities";

    public static final String myFingerPrint = "6d95381e039f2b823bdd74ec3cc719ca003e614319a24f4bccfc0f449d72a482";

    // defconstant
    public static final SubLSymbol $one_second_long$ = makeSymbol("*ONE-SECOND-LONG*");

    // defconstant
    // The time duration predicates, IN ORDER.
    public static final SubLSymbol $duration_predicates$ = makeSymbol("*DURATION-PREDICATES*");

    // defconstant
    /**
     * Denotes a time duration for an interval that either begins with the beginning
     * of time or ends with the end of time. This would be a really long time.
     */
    public static final SubLSymbol $a_really_long_time$ = makeSymbol("*A-REALLY-LONG-TIME*");

    private static final SubLObject $$TimePoint = reader_make_constant_shell(makeString("TimePoint"));

    private static final SubLObject $const1$ConventionallyClassifiedTimeInter = reader_make_constant_shell(makeString("ConventionallyClassifiedTimeIntervalSeries"));

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));



    private static final SubLObject $$durationOfType = reader_make_constant_shell(makeString("durationOfType"));

    public static final SubLList $list5 = list(makeKeyword("PERIOD"));

    private static final SubLObject $$CalendarCoveringType = reader_make_constant_shell(makeString("CalendarCoveringType"));

    private static final SubLObject $const7$ConventionallyClassifiedTimeInter = reader_make_constant_shell(makeString("ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps"));

    private static final SubLObject $$periodOfTimeIntervalSeries = reader_make_constant_shell(makeString("periodOfTimeIntervalSeries"));

    private static final SubLObject $$MonthOfYearType = reader_make_constant_shell(makeString("MonthOfYearType"));

    private static final SubLObject $$DayOfYearType = reader_make_constant_shell(makeString("DayOfYearType"));

    private static final SubLObject $$DayOfWeekType = reader_make_constant_shell(makeString("DayOfWeekType"));

    private static final SubLObject $$HourOfDayType = reader_make_constant_shell(makeString("HourOfDayType"));

    private static final SubLObject $$SameLengthTimeIntervalTypeFn = reader_make_constant_shell(makeString("SameLengthTimeIntervalTypeFn"));

    private static final SubLObject $$Null_TimeParameter = reader_make_constant_shell(makeString("Null-TimeParameter"));

    public static final SubLList $list15 = list(reader_make_constant_shell(makeString("SecondsDuration")), ONE_INTEGER);

    public static final SubLList $list16 = list(new SubLObject[]{ reader_make_constant_shell(makeString("MillisecondsDuration")), reader_make_constant_shell(makeString("SecondsDuration")), reader_make_constant_shell(makeString("MinutesDuration")), reader_make_constant_shell(makeString("HoursDuration")), reader_make_constant_shell(makeString("DaysDuration")), reader_make_constant_shell(makeString("WeeksDuration")), reader_make_constant_shell(makeString("MonthsDuration")), reader_make_constant_shell(makeString("QuartersDuration")), reader_make_constant_shell(makeString("YearsDuration")), reader_make_constant_shell(makeString("DecadesDuration")), reader_make_constant_shell(makeString("CenturiesDuration")), reader_make_constant_shell(makeString("MillenniaDuration")) });

    private static final SubLSymbol $A_LONG_TIME = makeKeyword("A-LONG-TIME");

    private static final SubLObject $$SecondsDuration = reader_make_constant_shell(makeString("SecondsDuration"));

    private static final SubLObject $$MinutesDuration = reader_make_constant_shell(makeString("MinutesDuration"));

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLObject $$HoursDuration = reader_make_constant_shell(makeString("HoursDuration"));

    private static final SubLObject $$DaysDuration = reader_make_constant_shell(makeString("DaysDuration"));

    private static final SubLInteger $int$24 = makeInteger(24);

    private static final SubLObject $$WeeksDuration = reader_make_constant_shell(makeString("WeeksDuration"));

    private static final SubLObject $$MonthsDuration = reader_make_constant_shell(makeString("MonthsDuration"));

    private static final SubLObject $$QuartersDuration = reader_make_constant_shell(makeString("QuartersDuration"));

    private static final SubLObject $$YearsDuration = reader_make_constant_shell(makeString("YearsDuration"));

    private static final SubLObject $$DecadesDuration = reader_make_constant_shell(makeString("DecadesDuration"));

    private static final SubLObject $$CenturiesDuration = reader_make_constant_shell(makeString("CenturiesDuration"));

    private static final SubLObject $$MillenniaDuration = reader_make_constant_shell(makeString("MillenniaDuration"));

    public static final SubLList $list31 = list(reader_make_constant_shell(makeString("SecondsDuration")), ZERO_INTEGER);

    public static final SubLList $list32 = list(ONE_INTEGER);

    public static final SubLString $str33$Type__a_is_not_a_proper_Conventio = makeString("Type ~a is not a proper ConventionallyClassifiedTimeIntervalSeries.");

    public static final SubLString $str34$Interval__a_is_not_a_proper_inter = makeString("Interval ~a is not a proper interval for offset calculations.");

    private static final SubLObject $$IntervalEndedByFn = reader_make_constant_shell(makeString("IntervalEndedByFn"));

    private static final SubLObject $$Always_TimeInterval = reader_make_constant_shell(makeString("Always-TimeInterval"));

    private static final SubLObject $$IntervalStartedByFn = reader_make_constant_shell(makeString("IntervalStartedByFn"));

    private static final SubLObject $$DayOfYearFn = reader_make_constant_shell(makeString("DayOfYearFn"));

    private static final SubLObject $$CalendarSecond = reader_make_constant_shell(makeString("CalendarSecond"));

    private static final SubLObject $$CalendarMinute = reader_make_constant_shell(makeString("CalendarMinute"));

    private static final SubLObject $$CalendarHour = reader_make_constant_shell(makeString("CalendarHour"));

    private static final SubLObject $$CalendarDay = reader_make_constant_shell(makeString("CalendarDay"));

    private static final SubLObject $$CalendarMonth = reader_make_constant_shell(makeString("CalendarMonth"));

    private static final SubLObject $$CalendarYear = reader_make_constant_shell(makeString("CalendarYear"));

    private static final SubLObject $$CalendarWeek = reader_make_constant_shell(makeString("CalendarWeek"));

    private static final SubLObject $$CalendarQuarter = reader_make_constant_shell(makeString("CalendarQuarter"));

    private static final SubLObject $$CalendarDecade = reader_make_constant_shell(makeString("CalendarDecade"));

    private static final SubLObject $$CalendarHalfCentury = reader_make_constant_shell(makeString("CalendarHalfCentury"));

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLObject $$CalendarCentury = reader_make_constant_shell(makeString("CalendarCentury"));



    private static final SubLObject $$CalendarMillennium = reader_make_constant_shell(makeString("CalendarMillennium"));



    public static final SubLString $str54$Unknown_time_type__a_ = makeString("Unknown time type ~a.");

    private static final SubLObject $$Sunday = reader_make_constant_shell(makeString("Sunday"));

    public static final SubLList $list56 = list(reader_make_constant_shell(makeString("DaysDuration")), SIX_INTEGER);

    private static final SubLObject $$TimeIntervalInclusiveFn = reader_make_constant_shell(makeString("TimeIntervalInclusiveFn"));







    private static final SubLInteger $int$51 = makeInteger(51);

    private static final SubLInteger $int$49 = makeInteger(49);

    private static final SubLObject $$YearFn = reader_make_constant_shell(makeString("YearFn"));

    private static final SubLInteger $int$999 = makeInteger(999);

    public static final SubLString $str65$No_support_for_type__a_ = makeString("No support for type ~a.");

    private static final SubLObject $$CalendarWorkWeek = reader_make_constant_shell(makeString("CalendarWorkWeek"));

    private static final SubLObject $$Monday = reader_make_constant_shell(makeString("Monday"));

    public static final SubLList $list68 = list(reader_make_constant_shell(makeString("DaysDuration")), FOUR_INTEGER);

    private static final SubLObject $$CalendarWeekend = reader_make_constant_shell(makeString("CalendarWeekend"));

    private static final SubLObject $$Saturday = reader_make_constant_shell(makeString("Saturday"));

    public static final SubLList $list71 = list(reader_make_constant_shell(makeString("DaysDuration")), ONE_INTEGER);

    private static final SubLObject $$Weekday = reader_make_constant_shell(makeString("Weekday"));

    private static final SubLObject $$HourFn = reader_make_constant_shell(makeString("HourFn"));

    private static final SubLObject $$Friday = reader_make_constant_shell(makeString("Friday"));

    public static final SubLList $list75 = list(reader_make_constant_shell(makeString("DaysDuration")), TWO_INTEGER);

    public static final SubLString $$$Time_Parameter_Tests = makeString("Time Parameter Tests");

    public static final SubLString $$$Start_of_Interval_Tests = makeString("Start of Interval Tests");

    public static final SubLList $list78 = list(makeString("Time Parameter Tests"));

    public static SubLObject time_point_type_p(final SubLObject type) {
        return eql(type, $$TimePoint);
    }

    public static SubLObject conventional_time_series_p(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != covering_time_type_p(type)) {
            return T;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(NIL, thread);
            result = isa.isaP(type, $const1$ConventionallyClassifiedTimeInter, $$UniversalVocabularyMt, UNPROVIDED);
        } finally {
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject time_series_type_duration(final SubLObject type) {
        return (NIL != covering_time_type_p(type)) && (NIL == gappy_time_type_p(type)) ? covering_type_unit_duration(type) : duration_type(gappy_type_duration(type));
    }

    public static SubLObject time_series_duration(final SubLObject type) {
        if (NIL != covering_time_type_p(type)) {
            return covering_type_duration(type);
        }
        if (NIL != gappy_time_type_p(type)) {
            return gappy_type_duration(type);
        }
        backward.removal_ask_variable($PERIOD, listS($$durationOfType, type, $list5), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED).first();
        return NIL;
    }

    public static SubLObject covering_time_type_p(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(NIL, thread);
            result = isa.isaP(type, $$CalendarCoveringType, $$UniversalVocabularyMt, UNPROVIDED);
        } finally {
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject covering_type_unit_duration(final SubLObject covering_type) {
        return NIL != forts.fort_p(covering_type) ? date_utilities.inference_defining_time_unit(covering_type) : NIL;
    }

    public static SubLObject covering_type_duration(final SubLObject type) {
        return construct_covering_duration(type, ONE_INTEGER);
    }

    public static SubLObject construct_covering_duration(final SubLObject type, final SubLObject amt) {
        final SubLObject duration = covering_type_unit_duration(type);
        return NIL != duration ? make_unary_formula(duration, amt) : NIL;
    }

    public static SubLObject gappy_time_type_p(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(NIL, thread);
            result = isa.isaP(type, $const7$ConventionallyClassifiedTimeInter, $$UniversalVocabularyMt, UNPROVIDED);
        } finally {
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject gappy_type_period(final SubLObject type) {
        return backward.removal_ask_variable($PERIOD, listS($$periodOfTimeIntervalSeries, type, $list5), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject gappy_type_duration(final SubLObject type) {
        return backward.removal_ask_variable($PERIOD, listS($$durationOfType, type, $list5), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED).first();
    }

    public static SubLObject month_of_year_typeP(final SubLObject type) {
        return isa.isaP(type, $$MonthOfYearType, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject day_of_year_typeP(final SubLObject type) {
        return isa.isaP(type, $$DayOfYearType, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject day_of_week_typeP(final SubLObject type) {
        return isa.isaP(type, $$DayOfWeekType, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject hour_of_day_typeP(final SubLObject type) {
        return isa.isaP(type, $$HourOfDayType, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sliding_time_type_p(final SubLObject time_parameter) {
        return makeBoolean((((NIL != el_formula_p(time_parameter)) && cycl_utilities.nat_functor(time_parameter).eql($$SameLengthTimeIntervalTypeFn)) && (NIL != subl_promotions.memberP(extract_sliding_time_type(time_parameter), $duration_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) && (NIL != number_utilities.positive_number_p(extract_sliding_type_amount(time_parameter))));
    }

    public static SubLObject extract_sliding_type(final SubLObject time_type) {
        return cycl_utilities.formula_arg1(time_type, UNPROVIDED);
    }

    public static SubLObject extract_sliding_time_type(final SubLObject time_type) {
        return cycl_utilities.formula_operator(cycl_utilities.formula_arg1(time_type, UNPROVIDED));
    }

    public static SubLObject extract_sliding_type_amount(final SubLObject time_type) {
        return cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(time_type, UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject make_sliding_type(final SubLObject duration) {
        if (NIL != a_really_long_timeP(duration)) {
            return $$Null_TimeParameter;
        }
        return list($$SameLengthTimeIntervalTypeFn, duration);
    }

    public static SubLObject duration_function_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $duration_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject duration_p(final SubLObject v_object) {
        return makeBoolean((NIL != a_really_long_timeP(v_object)) || (((NIL != el_formula_p(v_object)) && (NIL != variables.fully_bound_p(v_object))) && (NIL != duration_function_p(cycl_utilities.formula_arg0(v_object)))));
    }

    public static SubLObject zero_duration_p(final SubLObject v_object) {
        return makeBoolean((NIL != duration_p(v_object)) && duration_magnitude(v_object).isZero());
    }

    public static SubLObject duration_typeL(final SubLObject type1, final SubLObject type2) {
        return numL(position(type1, $duration_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), position(type2, $duration_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject duration_type(final SubLObject duration) {
        return duration.first();
    }

    public static SubLObject duration_magnitude(final SubLObject duration) {
        return second(duration);
    }

    public static SubLObject duration_precision(final SubLObject duration) {
        return duration_type(duration);
    }

    public static SubLObject a_really_long_timeP(final SubLObject duration) {
        return eql(duration, $a_really_long_time$.getGlobalValue());
    }

    public static SubLObject durationL(final SubLObject duration1, final SubLObject duration2) {
        final SubLObject dur1_type = duration_type(duration1);
        final SubLObject dur1_amount = duration_magnitude(duration1);
        final SubLObject dur2_type = duration_type(duration2);
        final SubLObject dur2_amount = duration_magnitude(duration2);
        if (dur1_type.eql(dur2_type)) {
            return numL(dur1_amount, dur2_amount);
        }
        if (NIL != duration_typeL(dur1_type, dur2_type)) {
            return numL(dur1_amount, multiply(find_duration_quotient(dur1_type, dur2_type, UNPROVIDED), dur2_amount));
        }
        return numL(multiply(find_duration_quotient(dur2_type, dur1_type, UNPROVIDED), dur1_amount), dur2_amount);
    }

    public static SubLObject durationLE(final SubLObject duration1, final SubLObject duration2) {
        final SubLObject dur1_type = duration_type(duration1);
        final SubLObject dur1_amount = duration_magnitude(duration1);
        final SubLObject dur2_type = duration_type(duration2);
        final SubLObject dur2_amount = duration_magnitude(duration2);
        if (dur1_type.eql(dur2_type)) {
            return numLE(dur1_amount, dur2_amount);
        }
        if (NIL != duration_typeL(dur1_type, dur2_type)) {
            return numLE(dur1_amount, multiply(find_duration_quotient(dur1_type, dur2_type, UNPROVIDED), dur2_amount));
        }
        return numLE(multiply(find_duration_quotient(dur2_type, dur1_type, UNPROVIDED), dur1_amount), dur2_amount);
    }

    public static SubLObject durationE(final SubLObject duration1, final SubLObject duration2) {
        final SubLObject dur1_type = duration_type(duration1);
        final SubLObject dur1_amount = duration_magnitude(duration1);
        final SubLObject dur2_type = duration_type(duration2);
        final SubLObject dur2_amount = duration_magnitude(duration2);
        if (dur1_type.eql(dur2_type)) {
            return numE(dur1_amount, dur2_amount);
        }
        if (NIL != duration_typeL(dur1_type, dur2_type)) {
            return numE(dur1_amount, multiply(find_duration_quotient(dur1_type, dur2_type, UNPROVIDED), dur2_amount));
        }
        return numE(multiply(find_duration_quotient(dur2_type, dur1_type, UNPROVIDED), dur1_amount), dur2_amount);
    }

    public static SubLObject add_durations(final SubLObject duration1, final SubLObject duration2) {
        final SubLObject dur1_type = duration_type(duration1);
        final SubLObject dur1_amount = duration_magnitude(duration1);
        final SubLObject dur2_type = duration_type(duration2);
        final SubLObject dur2_amount = duration_magnitude(duration2);
        if (dur1_type.eql(dur2_type)) {
            return list(dur1_type, add(dur1_amount, dur2_amount));
        }
        if (NIL != duration_typeL(dur1_type, dur2_type)) {
            return list(dur1_type, add(dur1_amount, multiply(find_duration_quotient(dur1_type, dur2_type, UNPROVIDED), dur2_amount)));
        }
        return list(dur2_type, add(dur2_amount, multiply(find_duration_quotient(dur2_type, dur1_type, UNPROVIDED), dur1_amount)));
    }

    public static SubLObject scale_duration(final SubLObject duration, final SubLObject scalar) {
        return list(duration_type(duration), multiply(scalar, duration_magnitude(duration)));
    }

    public static SubLObject find_duration_quotient(final SubLObject type1, final SubLObject type2, SubLObject acc) {
        if (acc == UNPROVIDED) {
            acc = ONE_INTEGER;
        }
        if (type1.eql(type2)) {
            return acc;
        }
        if (type1.eql($$SecondsDuration)) {
            return find_duration_quotient($$MinutesDuration, type2, multiply($int$60, acc));
        }
        if (type1.eql($$MinutesDuration)) {
            return find_duration_quotient($$HoursDuration, type2, multiply($int$60, acc));
        }
        if (type1.eql($$HoursDuration)) {
            return find_duration_quotient($$DaysDuration, type2, multiply($int$24, acc));
        }
        if (type1.eql($$DaysDuration)) {
            return find_duration_quotient($$WeeksDuration, type2, multiply(SEVEN_INTEGER, acc));
        }
        if (type1.eql($$WeeksDuration)) {
            return find_duration_quotient($$MonthsDuration, type2, multiply(FOUR_INTEGER, acc));
        }
        if (type1.eql($$MonthsDuration)) {
            return find_duration_quotient($$QuartersDuration, type2, multiply(THREE_INTEGER, acc));
        }
        if (type1.eql($$QuartersDuration)) {
            return find_duration_quotient($$YearsDuration, type2, multiply(FOUR_INTEGER, acc));
        }
        if (type1.eql($$YearsDuration)) {
            return find_duration_quotient($$DecadesDuration, type2, multiply(TEN_INTEGER, acc));
        }
        if (type1.eql($$DecadesDuration)) {
            return find_duration_quotient($$CenturiesDuration, type2, multiply(TEN_INTEGER, acc));
        }
        if (type1.eql($$CenturiesDuration)) {
            return find_duration_quotient($$MillenniaDuration, type2, multiply(TEN_INTEGER, acc));
        }
        return NIL;
    }

    public static SubLObject date_interval_subsumes_typeP(final SubLObject interval, final SubLObject type) {
        if (NIL != a_really_long_timeP(interval_seconds_duration(interval))) {
            return T;
        }
        if (NIL == sliding_time_type_p(type)) {
            final SubLObject type_interval = nth_type_starting_no_earlier_than_start_of_interval(interval, type, ZERO_INTEGER);
            return NIL != type_interval ? hlmt_relevance.subsumed_time_intervalP(type_interval, interval) : NIL;
        }
        final SubLObject type_duration = get_duration_of_type(type);
        if (NIL != type_duration) {
            final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
            final SubLObject type_end = time_interval_utilities.preceding_cycl_date(date_utilities.date_after(time_interval_utilities.cycl_interval_initial_second(interval), type_duration));
            return date_utilities.dateLE(type_end, interval_end);
        }
        return NIL;
    }

    public static SubLObject date_interval_subsumed_by_typeP(final SubLObject interval, final SubLObject type) {
        if (NIL != a_really_long_timeP(interval_seconds_duration(interval))) {
            return NIL;
        }
        final SubLObject type_seconds_duration = type_seconds_duration(type);
        if (NIL == type_seconds_duration) {
            return NIL;
        }
        if (NIL != a_really_long_timeP(type_seconds_duration(type))) {
            return T;
        }
        if (NIL != sliding_time_type_p(type)) {
            final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
            final SubLObject type_end = time_interval_utilities.preceding_cycl_date(date_utilities.date_after(time_interval_utilities.cycl_interval_initial_second(interval), get_duration_of_type(type)));
            return date_utilities.dateLE(interval_end, type_end);
        }
        final SubLObject type_interval = nth_type_starting_no_later_than_start_of_interval(interval, type, ZERO_INTEGER);
        return NIL != type_interval ? hlmt_relevance.subsumed_time_intervalP(interval, type_interval) : NIL;
    }

    public static SubLObject type_duration_from_date(final SubLObject date, final SubLObject type) {
        final SubLObject type_duration = get_duration_of_type(type);
        return NIL != type_duration ? date_utilities.date_after(date, type_duration) : NIL;
    }

    public static SubLObject get_duration_of_type(final SubLObject type) {
        SubLObject duration = NIL;
        if (type.eql($$Null_TimeParameter)) {
            return $a_really_long_time$.getGlobalValue();
        }
        if (type.eql($$TimePoint)) {
            return $list31;
        }
        if (NIL != gappy_time_type_p(type)) {
            duration = gappy_type_duration(type);
        } else
            if (NIL != covering_time_type_p(type)) {
                final SubLObject duration_fn = time_series_type_duration(type);
                if (NIL != duration_fn) {
                    duration = list(duration_fn, ONE_INTEGER);
                }
            } else {
                duration = extract_sliding_type(type);
            }

        return duration;
    }

    public static SubLObject get_duration_of_interval(final SubLObject interval) {
        if (NIL != date_utilities.date_p(interval)) {
            return bq_cons(time_series_type_duration(date_utilities.date_precision(interval)), $list32);
        }
        if ((NIL == time_interval_utilities.proper_date_interval_p(interval)) && (NIL == date_utilities.generalized_date_p(interval))) {
            return list($$SecondsDuration, interval_seconds_duration(interval));
        }
        final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
        final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
        if ((NIL != date_utilities.beginning_of_timeP(interval_start)) || (NIL != date_utilities.end_of_timeP(interval_end))) {
            return $a_really_long_time$.getGlobalValue();
        }
        return list($$SecondsDuration, number_utilities.f_1X(second(date_utilities.time_elapsed(interval_start, interval_end, UNPROVIDED))));
    }

    public static SubLObject interval_seconds_duration(final SubLObject time_interval) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != date_utilities.date_p(time_interval)) {
            thread.resetMultipleValues();
            final SubLObject format = date_utilities.explode_date(time_interval);
            final SubLObject year = thread.secondMultipleValue();
            final SubLObject month = thread.thirdMultipleValue();
            final SubLObject day = thread.fourthMultipleValue();
            final SubLObject hour = thread.fifthMultipleValue();
            final SubLObject min = thread.sixthMultipleValue();
            final SubLObject sec = thread.seventhMultipleValue();
            thread.resetMultipleValues();
            if (NIL != sec) {
                return ONE_INTEGER;
            }
            if (NIL != min) {
                return numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue();
            }
            if (NIL != hour) {
                return numeric_date_utilities.$seconds_in_an_hour$.getGlobalValue();
            }
            if (NIL != day) {
                return numeric_date_utilities.$seconds_in_a_day$.getGlobalValue();
            }
            if (NIL != month) {
                return multiply(numeric_date_utilities.$seconds_in_a_day$.getGlobalValue(), numeric_date_utilities.days_in_month_number(month, year));
            }
            if (NIL != year) {
                if (NIL != numeric_date_utilities.leap_year_p(year)) {
                    return numeric_date_utilities.$seconds_in_a_leap_year$.getGlobalValue();
                }
                return numeric_date_utilities.$seconds_in_a_non_leap_year$.getGlobalValue();
            }
        } else
            if (NIL != time_interval_utilities.proper_date_interval_p(time_interval)) {
                final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(time_interval);
                final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(time_interval);
                if ((NIL != date_utilities.beginning_of_timeP(interval_start)) || (NIL != date_utilities.end_of_timeP(interval_end))) {
                    return $a_really_long_time$.getGlobalValue();
                }
                return number_utilities.f_1X(second(date_utilities.time_elapsed(interval_start, interval_end, UNPROVIDED)));
            }

        return NIL;
    }

    public static SubLObject type_seconds_duration(final SubLObject type) {
        if (type.eql($$Null_TimeParameter)) {
            return $a_really_long_time$.getGlobalValue();
        }
        final SubLObject type_duration = get_duration_of_type(type);
        if (NIL != type_duration) {
            final SubLObject coefficient = find_duration_quotient($$SecondsDuration, duration_type(type_duration), UNPROVIDED);
            if (NIL != coefficient) {
                return multiply(duration_magnitude(type_duration), coefficient);
            }
        }
        return NIL;
    }

    public static SubLObject time_of_type_before_interval(final SubLObject type, final SubLObject amt, final SubLObject interval) {
        if (NIL != time_interval_utilities.date_interval_p(interval)) {
            if (NIL != covering_time_type_p(type)) {
                final SubLObject duration = construct_covering_duration(type, amt);
                final SubLObject result = date_utilities.date_before(interval, duration);
                return values(result, list_utilities.sublisp_boolean(result));
            }
            if (NIL != gappy_type_duration(type)) {
                return values(interval, NIL);
            }
            Errors.error($str33$Type__a_is_not_a_proper_Conventio, type);
        } else {
            Errors.error($str34$Interval__a_is_not_a_proper_inter);
        }
        return values(NIL, NIL);
    }

    public static SubLObject time_of_type_after_interval(final SubLObject type, final SubLObject amt, final SubLObject interval) {
        if (NIL != time_interval_utilities.date_interval_p(interval)) {
            if (NIL != covering_time_type_p(type)) {
                final SubLObject duration = construct_covering_duration(type, amt);
                final SubLObject result = date_utilities.date_after(interval, duration);
                return values(result, list_utilities.sublisp_boolean(result));
            }
            if (NIL != gappy_type_duration(type)) {
                return values(interval, NIL);
            }
            Errors.error($str33$Type__a_is_not_a_proper_Conventio, type);
        } else {
            Errors.error($str34$Interval__a_is_not_a_proper_inter);
        }
        return values(NIL, NIL);
    }

    public static SubLObject time_ended_by_last_type_in_interval(final SubLObject interval, final SubLObject type) {
        if (type.eql($$Null_TimeParameter)) {
            return list($$IntervalEndedByFn, interval);
        }
        if (NIL == time_interval_utilities.date_interval_p(interval)) {
            return NIL;
        }
        if ((NIL != time_interval_utilities.interval_started_by_intervalP(interval)) && (NIL != time_point_type_p(type))) {
            return $$Always_TimeInterval;
        }
        if (NIL != time_interval_utilities.some_time_interval_p(interval)) {
            return NIL != time_point_type_p(type) ? list($$IntervalEndedByFn, interval) : NIL;
        }
        if (NIL == hlmt_relevance.time_interval_subsumes_typeP(interval, type)) {
            return NIL;
        }
        final SubLObject last_type = nth_type_ending_no_later_than_end_of_interval(interval, type, ZERO_INTEGER);
        return time_interval_utilities.canonicalize_time_interval(list($$IntervalEndedByFn, last_type));
    }

    public static SubLObject time_started_by_first_type_in_interval(final SubLObject interval, final SubLObject type) {
        if (type.eql($$Null_TimeParameter)) {
            return list($$IntervalStartedByFn, interval);
        }
        if (NIL == time_interval_utilities.date_interval_p(interval)) {
            return NIL;
        }
        if ((NIL != time_interval_utilities.interval_ended_by_intervalP(interval)) && (NIL != time_point_type_p(type))) {
            return $$Always_TimeInterval;
        }
        if (NIL != time_interval_utilities.some_time_interval_p(interval)) {
            return NIL != time_point_type_p(type) ? list($$IntervalStartedByFn, interval) : NIL;
        }
        if (NIL == hlmt_relevance.time_interval_subsumes_typeP(interval, type)) {
            return NIL;
        }
        final SubLObject first_type = nth_type_starting_no_earlier_than_start_of_interval(interval, type, ZERO_INTEGER);
        return time_interval_utilities.canonicalize_time_interval(list($$IntervalStartedByFn, first_type));
    }

    public static SubLObject day_of_year_nat_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_nat_p(v_object)) && cycl_utilities.nat_functor(v_object).eql($$DayOfYearFn));
    }

    public static SubLObject first_moment_of_covering_type_p(final SubLObject type, final SubLObject date) {
        if (NIL == date_utilities.date_p(date)) {
            return NIL;
        }
        if (((((type.eql($$CalendarSecond) || type.eql($$CalendarMinute)) || type.eql($$CalendarHour)) || type.eql($$CalendarDay)) || type.eql($$CalendarMonth)) || type.eql($$CalendarYear)) {
            return first_moment_of_covering_type_p_int(type, date);
        }
        if (type.eql($$CalendarWeek)) {
            return makeBoolean((NIL != date_utilities.starting_value_for_calendar_unit_p(date_utilities.day_of_week_of_date(date), $$CalendarWeek)) && (NIL != first_moment_of_covering_type_p_int($$CalendarDay, date)));
        }
        if (type.eql($$CalendarQuarter)) {
            return makeBoolean((NIL != number_utilities.onep(mod(date_utilities.extract_date_month_number(date), FOUR_INTEGER))) && (NIL != first_moment_of_covering_type_p_int($$CalendarMonth, date)));
        }
        if (type.eql($$CalendarDecade)) {
            return makeBoolean(mod(date_utilities.extract_date_year(date), TEN_INTEGER).isZero() && (NIL != first_moment_of_covering_type_p_int($$CalendarYear, date)));
        }
        if (type.eql($$CalendarHalfCentury)) {
            return makeBoolean((NIL != number_utilities.onep(mod(date_utilities.extract_date_year(date), $int$50))) && (NIL != first_moment_of_covering_type_p_int($$CalendarYear, date)));
        }
        if (type.eql($$CalendarCentury)) {
            return makeBoolean((NIL != number_utilities.onep(mod(date_utilities.extract_date_year(date), $int$100))) && (NIL != first_moment_of_covering_type_p_int($$CalendarYear, date)));
        }
        if (type.eql($$CalendarMillennium)) {
            return makeBoolean((NIL != number_utilities.onep(mod(date_utilities.extract_date_year(date), $int$1000))) && (NIL != first_moment_of_covering_type_p_int($$CalendarYear, date)));
        }
        return NIL;
    }

    public static SubLObject first_moment_of_covering_type_p_int(final SubLObject type, final SubLObject date) {
        SubLObject stopP = NIL;
        SubLObject successP = T;
        if (NIL == stopP) {
            SubLObject csome_list_var = date_utilities.$date_units_ordered$.getGlobalValue();
            SubLObject time_type = NIL;
            time_type = csome_list_var.first();
            while ((NIL == stopP) && (NIL != csome_list_var)) {
                final SubLObject val = date_utilities.extract_date_time_type(date, time_type);
                if (time_type.eql(type)) {
                    stopP = T;
                } else
                    if (NIL == date_utilities.starting_value_for_calendar_unit_p(val, time_type)) {
                        successP = NIL;
                        stopP = T;
                    }

                csome_list_var = csome_list_var.rest();
                time_type = csome_list_var.first();
            } 
        }
        return successP;
    }

    public static SubLObject last_moment_of_covering_type_p(final SubLObject type, final SubLObject date) {
        if (NIL == date_utilities.date_p(date)) {
            return NIL;
        }
        if (((((type.eql($$CalendarSecond) || type.eql($$CalendarMinute)) || type.eql($$CalendarHour)) || type.eql($$CalendarDay)) || type.eql($$CalendarMonth)) || type.eql($$CalendarYear)) {
            return last_moment_of_covering_type_p_int(type, date);
        }
        if (type.eql($$CalendarWeek)) {
            return makeBoolean((NIL != date_utilities.ending_value_for_calendar_unit_p(date_utilities.day_of_week_of_date(date), $$CalendarWeek, UNPROVIDED, UNPROVIDED)) && (NIL != first_moment_of_covering_type_p_int($$CalendarDay, date)));
        }
        if (type.eql($$CalendarQuarter)) {
            return makeBoolean(mod(date_utilities.extract_date_month_number(date), FOUR_INTEGER).isZero() && (NIL != last_moment_of_covering_type_p_int($$CalendarMonth, date)));
        }
        if (type.eql($$CalendarDecade)) {
            return makeBoolean(NINE_INTEGER.numE(mod(date_utilities.extract_date_year(date), TEN_INTEGER)) && (NIL != last_moment_of_covering_type_p_int($$CalendarYear, date)));
        }
        if (type.eql($$CalendarHalfCentury)) {
            return makeBoolean(mod(date_utilities.extract_date_year(date), $int$50).isZero() && (NIL != last_moment_of_covering_type_p_int($$CalendarYear, date)));
        }
        if (type.eql($$CalendarCentury)) {
            return makeBoolean(mod(date_utilities.extract_date_year(date), $int$100).isZero() && (NIL != last_moment_of_covering_type_p_int($$CalendarYear, date)));
        }
        if (type.eql($$CalendarMillennium)) {
            return makeBoolean(mod(date_utilities.extract_date_year(date), $int$1000).isZero() && (NIL != last_moment_of_covering_type_p_int($$CalendarYear, date)));
        }
        return NIL;
    }

    public static SubLObject last_moment_of_covering_type_p_int(final SubLObject type, final SubLObject date) {
        SubLObject stopP = NIL;
        SubLObject successP = T;
        if (NIL == stopP) {
            SubLObject csome_list_var = date_utilities.$date_units_ordered$.getGlobalValue();
            SubLObject time_type = NIL;
            time_type = csome_list_var.first();
            while ((NIL == stopP) && (NIL != csome_list_var)) {
                final SubLObject val = date_utilities.extract_date_time_type(date, time_type);
                if (time_type.eql(type)) {
                    stopP = T;
                } else
                    if (NIL == date_utilities.ending_value_for_calendar_unit_p(val, time_type, UNPROVIDED, UNPROVIDED)) {
                        successP = NIL;
                        stopP = T;
                    }

                csome_list_var = csome_list_var.rest();
                time_type = csome_list_var.first();
            } 
        }
        return successP;
    }

    public static SubLObject nth_type_starting_before_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
        return nth_type_starting_before_time_point(interval_start, type, n);
    }

    public static SubLObject nth_type_starting_no_later_than_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
        return nth_type_starting_no_later_than_time_point(interval_start, type, n);
    }

    public static SubLObject nth_type_starting_after_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
        return nth_type_starting_after_time_point(interval_start, type, n);
    }

    public static SubLObject nth_type_starting_no_earlier_than_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
        return nth_type_starting_no_earlier_than_time_point(interval_start, type, n);
    }

    public static SubLObject nth_type_starting_before_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
        return nth_type_starting_before_time_point(interval_end, type, n);
    }

    public static SubLObject nth_type_starting_no_later_than_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
        return nth_type_starting_no_later_than_time_point(interval_end, type, n);
    }

    public static SubLObject nth_type_starting_after_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
        return nth_type_starting_after_time_point(interval_end, type, n);
    }

    public static SubLObject nth_type_starting_no_earlier_than_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
        return nth_type_starting_no_earlier_than_time_point(interval_end, type, n);
    }

    public static SubLObject nth_type_ending_before_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
        return nth_type_ending_before_time_point(interval_start, type, n);
    }

    public static SubLObject nth_type_ending_no_later_than_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
        return nth_type_starting_no_later_than_time_point(interval_start, type, n);
    }

    public static SubLObject nth_type_ending_after_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
        return nth_type_ending_after_time_point(interval_start, type, n);
    }

    public static SubLObject nth_type_ending_no_earlier_than_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
        return nth_type_ending_no_earlier_than_time_point(interval_start, type, n);
    }

    public static SubLObject nth_type_ending_before_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
        return nth_type_ending_before_time_point(interval_end, type, n);
    }

    public static SubLObject nth_type_ending_no_later_than_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
        return nth_type_ending_no_later_than_time_point(interval_end, type, n);
    }

    public static SubLObject nth_type_ending_after_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
        return nth_type_ending_after_time_point(interval_end, type, n);
    }

    public static SubLObject nth_type_ending_no_earlier_than_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
        return nth_type_ending_no_earlier_than_time_point(interval_end, type, n);
    }

    public static SubLObject nth_type_starting_before_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject new_time_point = time_interval_utilities.preceding_cycl_date(time_point);
        return nth_type_starting_no_later_than_time_point(new_time_point, type, n);
    }

    public static SubLObject nth_type_starting_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        if (NIL != time_point_type_p(type)) {
            return nth_time_point_no_later_than_time_point(time_point, n);
        }
        if (NIL != covering_time_type_p(type)) {
            return nth_covering_time_type_starting_no_later_than_time_point(time_point, type, n);
        }
        if (NIL != gappy_time_type_p(type)) {
            return nth_gappy_time_type_starting_no_later_than_time_point(time_point, type, n);
        }
        return Errors.error($str54$Unknown_time_type__a_, type);
    }

    public static SubLObject nth_type_starting_after_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject new_time_point = time_interval_utilities.succeeding_cycl_date(time_point);
        return nth_type_starting_no_earlier_than_time_point(new_time_point, type, n);
    }

    public static SubLObject nth_type_starting_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        if (NIL != time_point_type_p(type)) {
            return nth_time_point_no_earlier_than_time_point(time_point, n);
        }
        if (NIL != covering_time_type_p(type)) {
            return nth_covering_time_type_starting_no_earlier_than_time_point(time_point, type, n);
        }
        if (NIL != gappy_time_type_p(type)) {
            return nth_gappy_time_type_starting_no_earlier_than_time_point(time_point, type, n);
        }
        return Errors.error($str54$Unknown_time_type__a_, type);
    }

    public static SubLObject nth_type_ending_before_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject new_time_point = time_interval_utilities.preceding_cycl_date(time_point);
        return nth_type_ending_no_later_than_time_point(new_time_point, type, n);
    }

    public static SubLObject nth_type_ending_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        if (NIL != time_point_type_p(type)) {
            return nth_time_point_no_later_than_time_point(time_point, n);
        }
        if (NIL != covering_time_type_p(type)) {
            return nth_covering_time_type_ending_no_later_than_time_point(time_point, type, n);
        }
        if (NIL != gappy_time_type_p(type)) {
            return nth_gappy_time_type_ending_no_later_than_time_point(time_point, type, n);
        }
        return Errors.error($str54$Unknown_time_type__a_, type);
    }

    public static SubLObject nth_type_ending_after_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject new_time_point = time_interval_utilities.succeeding_cycl_date(time_point);
        return nth_type_ending_no_earlier_than_time_point(new_time_point, type, n);
    }

    public static SubLObject nth_type_ending_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        if (NIL != time_point_type_p(type)) {
            return nth_time_point_no_earlier_than_time_point(time_point, n);
        }
        if (NIL != covering_time_type_p(type)) {
            return nth_covering_time_type_ending_no_earlier_than_time_point(time_point, type, n);
        }
        if (NIL != gappy_time_type_p(type)) {
            return nth_gappy_time_type_ending_no_earlier_than_time_point(time_point, type, n);
        }
        return Errors.error($str54$Unknown_time_type__a_, type);
    }

    public static SubLObject nth_time_point_no_later_than_time_point(final SubLObject time_point, final SubLObject n) {
        return date_utilities.date_before(time_point, list($$SecondsDuration, n));
    }

    public static SubLObject nth_time_point_no_earlier_than_time_point(final SubLObject time_point, final SubLObject n) {
        return date_utilities.date_after(time_point, list($$SecondsDuration, n));
    }

    public static SubLObject nth_covering_time_type_starting_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        if (type.eql($$CalendarSecond)) {
            return date_utilities.date_before(time_point, list($$SecondsDuration, n));
        }
        if ((((type.eql($$CalendarMinute) || type.eql($$CalendarHour)) || type.eql($$CalendarDay)) || type.eql($$CalendarMonth)) || type.eql($$CalendarYear)) {
            return date_utilities.date_before(date_utilities.date_to_precision(time_point, type, UNPROVIDED), scale_duration(covering_type_duration(type), n));
        }
        if (type.eql($$CalendarWeek)) {
            final SubLObject start = nth_gappy_time_type_starting_no_later_than_time_point(time_point, $$Sunday, n);
            final SubLObject end = date_utilities.date_after(start, $list56);
            return list($$TimeIntervalInclusiveFn, start, end);
        }
        if (type.eql($$CalendarQuarter)) {
            return date_utilities.date_before(date_utilities.truncate_date_to_format(time_point, $QUARTER), scale_duration(covering_type_duration(type), n));
        }
        if (type.eql($$CalendarDecade)) {
            return date_utilities.date_before(date_utilities.truncate_date_to_format(time_point, $DECADE), scale_duration(covering_type_duration(type), n));
        }
        if (type.eql($$CalendarCentury)) {
            return date_utilities.date_before(date_utilities.truncate_date_to_format(time_point, $CENTURY), scale_duration(covering_type_duration(type), n));
        }
        if (type.eql($$CalendarHalfCentury)) {
            final SubLObject century = subtract(cycl_utilities.nat_arg1(date_utilities.truncate_date_to_format(time_point, $CENTURY), UNPROVIDED), ONE_INTEGER);
            final SubLObject year_in_century = mod(date_utilities.extract_date_year(time_point), $int$100);
            final SubLObject displacement = multiply($int$50, n);
            final SubLObject start2 = (year_in_century.isZero() || year_in_century.numG($int$50)) ? subtract(add(multiply(century, $int$100), $int$51), displacement) : subtract(add(multiply(century, $int$100), ONE_INTEGER), displacement);
            final SubLObject end2 = add(start2, $int$49);
            return list($$TimeIntervalInclusiveFn, list($$YearFn, start2), list($$YearFn, end2));
        }
        if (type.eql($$CalendarMillennium)) {
            final SubLObject year = date_utilities.extract_date_year(time_point);
            final SubLObject millenium = integerDivide(subtract(year, ONE_INTEGER), $int$1000);
            final SubLObject displacement = multiply($int$1000, n);
            final SubLObject start2 = subtract(add(multiply(millenium, $int$1000), ONE_INTEGER), displacement);
            final SubLObject end2 = add(start2, $int$999);
            return list($$TimeIntervalInclusiveFn, list($$YearFn, start2), list($$YearFn, end2));
        }
        return Errors.error($str65$No_support_for_type__a_, type);
    }

    public static SubLObject nth_covering_time_type_starting_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        if (type.eql($$CalendarSecond)) {
            return date_utilities.date_after(time_point, list($$SecondsDuration, n));
        }
        if ((((type.eql($$CalendarMinute) || type.eql($$CalendarHour)) || type.eql($$CalendarDay)) || type.eql($$CalendarMonth)) || type.eql($$CalendarYear)) {
            return NIL != first_moment_of_covering_type_p(type, time_point) ? date_utilities.date_after(date_utilities.date_to_precision(time_point, type, UNPROVIDED), scale_duration(covering_type_duration(type), n)) : date_utilities.date_after(date_utilities.date_to_precision(time_point, type, UNPROVIDED), scale_duration(covering_type_duration(type), number_utilities.f_1X(n)));
        }
        if (type.eql($$CalendarWeek)) {
            final SubLObject start = nth_gappy_time_type_starting_no_earlier_than_time_point(time_point, $$Sunday, n);
            final SubLObject end = date_utilities.date_after(start, $list56);
            return list($$TimeIntervalInclusiveFn, start, end);
        }
        if (type.eql($$CalendarQuarter)) {
            return NIL != first_moment_of_covering_type_p(type, time_point) ? date_utilities.date_after(date_utilities.truncate_date_to_format(time_point, $QUARTER), scale_duration(covering_type_duration(type), n)) : date_utilities.date_after(date_utilities.truncate_date_to_format(time_point, $QUARTER), scale_duration(covering_type_duration(type), number_utilities.f_1X(n)));
        }
        if (type.eql($$CalendarDecade)) {
            return NIL != first_moment_of_covering_type_p(type, time_point) ? date_utilities.date_after(date_utilities.truncate_date_to_format(time_point, $DECADE), scale_duration(covering_type_duration(type), n)) : date_utilities.date_after(date_utilities.truncate_date_to_format(time_point, $DECADE), scale_duration(covering_type_duration(type), number_utilities.f_1X(n)));
        }
        if (type.eql($$CalendarCentury)) {
            return NIL != first_moment_of_covering_type_p(type, time_point) ? date_utilities.date_after(date_utilities.truncate_date_to_format(time_point, $CENTURY), scale_duration(covering_type_duration(type), n)) : date_utilities.date_after(date_utilities.truncate_date_to_format(time_point, $CENTURY), scale_duration(covering_type_duration(type), number_utilities.f_1X(n)));
        }
        if (type.eql($$CalendarHalfCentury)) {
            final SubLObject beginning_of_yearP = first_moment_of_covering_type_p($$CalendarYear, time_point);
            final SubLObject century = subtract(cycl_utilities.nat_arg1(date_utilities.truncate_date_to_format(time_point, $CENTURY), UNPROVIDED), ONE_INTEGER);
            final SubLObject year_in_century = mod(date_utilities.extract_date_year(time_point), $int$100);
            final SubLObject displacement = multiply($int$50, year_in_century.numE(ONE_INTEGER) && (NIL != beginning_of_yearP) ? n : year_in_century.numL($int$51) || (year_in_century.numE($int$51) && (NIL != beginning_of_yearP)) ? add(n, ONE_INTEGER) : add(n, TWO_INTEGER));
            final SubLObject start2 = add(multiply(century, $int$100), ONE_INTEGER, displacement);
            final SubLObject end2 = add(start2, $int$49);
            return list($$TimeIntervalInclusiveFn, list($$YearFn, start2), list($$YearFn, end2));
        }
        if (type.eql($$CalendarMillennium)) {
            final SubLObject beginning_of_yearP = first_moment_of_covering_type_p($$CalendarYear, time_point);
            final SubLObject year = date_utilities.extract_date_year(time_point);
            final SubLObject millenium = integerDivide(subtract(year, ONE_INTEGER), $int$1000);
            final SubLObject displacement = multiply($int$1000, mod(year, $int$1000).numE(ONE_INTEGER) && (NIL != beginning_of_yearP) ? n : add(n, ONE_INTEGER));
            final SubLObject start2 = add(multiply(millenium, $int$1000), ONE_INTEGER, displacement);
            final SubLObject end2 = add(start2, $int$999);
            return list($$TimeIntervalInclusiveFn, list($$YearFn, start2), list($$YearFn, end2));
        }
        return Errors.error($str65$No_support_for_type__a_, type);
    }

    public static SubLObject nth_covering_time_type_ending_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject reference_interval = nth_covering_time_type_starting_no_later_than_time_point(time_point, type, ZERO_INTEGER);
        return NIL != date_utilities.dateL(time_point, time_interval_utilities.cycl_interval_final_second(reference_interval)) ? nth_covering_time_type_starting_no_later_than_time_point(time_point, type, add(n, ONE_INTEGER)) : nth_covering_time_type_starting_no_later_than_time_point(time_point, type, n);
    }

    public static SubLObject nth_covering_time_type_ending_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject reference_interval = nth_covering_time_type_starting_no_later_than_time_point(time_point, type, ZERO_INTEGER);
        return NIL != date_utilities.dateL(time_interval_utilities.cycl_interval_final_second(reference_interval), time_point) ? nth_covering_time_type_starting_no_earlier_than_time_point(time_point, type, n) : nth_covering_time_type_starting_no_earlier_than_time_point(time_point, type, subtract(n, ONE_INTEGER));
    }

    public static SubLObject nth_gappy_time_type_starting_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        if (NIL != month_of_year_typeP(type)) {
            return nth_month_of_year_type_starting_no_later_than_time_point(time_point, type, n);
        }
        if (NIL != day_of_week_typeP(type)) {
            return nth_day_of_week_type_starting_no_later_than_time_point(time_point, type, n);
        }
        if (NIL != hour_of_day_typeP(type)) {
            return nth_hour_of_day_type_starting_no_later_than_time_point(time_point, type, n);
        }
        if (NIL != day_of_year_typeP(type)) {
            return nth_day_of_year_type_starting_no_later_than_time_point(time_point, type, n);
        }
        if (type.eql($$CalendarWorkWeek)) {
            final SubLObject start = nth_gappy_time_type_starting_no_later_than_time_point(time_point, $$Monday, n);
            final SubLObject end = date_utilities.date_after(start, $list68);
            return list($$TimeIntervalInclusiveFn, start, end);
        }
        if (type.eql($$CalendarWeekend)) {
            final SubLObject start = nth_gappy_time_type_starting_no_later_than_time_point(time_point, $$Saturday, n);
            final SubLObject end = date_utilities.date_after(start, $list71);
            return list($$TimeIntervalInclusiveFn, start, end);
        }
        if (type.eql($$Weekday)) {
            return nth_weekday_starting_no_later_than_time_point(time_point, n);
        }
        return Errors.error($str65$No_support_for_type__a_, type);
    }

    public static SubLObject nth_gappy_time_type_starting_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        if (NIL != month_of_year_typeP(type)) {
            return nth_month_of_year_type_starting_no_earlier_than_time_point(time_point, type, n);
        }
        if (NIL != day_of_week_typeP(type)) {
            return nth_day_of_week_type_starting_no_earlier_than_time_point(time_point, type, n);
        }
        if (NIL != hour_of_day_typeP(type)) {
            return nth_hour_of_day_type_starting_no_earlier_than_time_point(time_point, type, n);
        }
        if (NIL != day_of_year_typeP(type)) {
            return nth_day_of_year_type_starting_no_earlier_than_time_point(time_point, type, n);
        }
        if (type.eql($$CalendarWorkWeek)) {
            final SubLObject start = nth_gappy_time_type_starting_no_earlier_than_time_point(time_point, $$Monday, n);
            final SubLObject end = date_utilities.date_after(start, $list68);
            return list($$TimeIntervalInclusiveFn, start, end);
        }
        if (type.eql($$CalendarWeekend)) {
            final SubLObject start = nth_gappy_time_type_starting_no_earlier_than_time_point(time_point, $$Saturday, n);
            final SubLObject end = date_utilities.date_after(start, $list71);
            return list($$TimeIntervalInclusiveFn, start, end);
        }
        if (type.eql($$Weekday)) {
            return nth_weekday_starting_no_earlier_than_time_point(time_point, n);
        }
        return Errors.error($str65$No_support_for_type__a_, type);
    }

    public static SubLObject nth_gappy_time_type_ending_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject reference_interval = nth_gappy_time_type_starting_no_later_than_time_point(time_point, type, ZERO_INTEGER);
        return NIL != date_utilities.dateL(time_point, time_interval_utilities.cycl_interval_final_second(reference_interval)) ? nth_gappy_time_type_starting_no_later_than_time_point(time_point, type, add(n, ONE_INTEGER)) : nth_gappy_time_type_starting_no_later_than_time_point(time_point, type, n);
    }

    public static SubLObject nth_gappy_time_type_ending_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject reference_interval = nth_gappy_time_type_starting_no_later_than_time_point(time_point, type, ZERO_INTEGER);
        return NIL != date_utilities.dateL(time_interval_utilities.cycl_interval_final_second(reference_interval), time_point) ? nth_gappy_time_type_starting_no_earlier_than_time_point(time_point, type, n) : nth_gappy_time_type_starting_no_earlier_than_time_point(time_point, type, subtract(n, ONE_INTEGER));
    }

    public static SubLObject nth_month_of_year_type_starting_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        if (NIL == date_utilities.month_term_p(type)) {
            return Errors.error($str65$No_support_for_type__a_, type);
        }
        final SubLObject date_month_number = date_utilities.extract_date_month_number(time_point);
        final SubLObject date_year = date_utilities.extract_date_year(time_point);
        final SubLObject type_month_number = date_utilities.number_of_month(type);
        final SubLObject displacement = (type_month_number.numG(date_month_number)) ? number_utilities.f_1X(n) : n;
        return date_utilities.construct_calendar_date(subtract(date_year, displacement), type_month_number, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nth_month_of_year_type_starting_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        if (NIL == date_utilities.month_term_p(type)) {
            return Errors.error($str65$No_support_for_type__a_, type);
        }
        final SubLObject beginning_of_monthP = first_moment_of_covering_type_p($$CalendarMonth, time_point);
        final SubLObject date_month_number = date_utilities.extract_date_month_number(time_point);
        final SubLObject date_year = date_utilities.extract_date_year(time_point);
        final SubLObject type_month_number = date_utilities.number_of_month(type);
        final SubLObject displacement = (type_month_number.numG(date_month_number) || (type_month_number.numE(date_month_number) && (NIL != beginning_of_monthP))) ? n : number_utilities.f_1X(n);
        return date_utilities.construct_calendar_date(add(date_year, displacement), type_month_number, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nth_day_of_week_type_starting_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject date_day_of_week = date_utilities.day_of_week_of_date(time_point);
        final SubLObject date_day_num = date_utilities.number_of_day_of_week(date_day_of_week);
        final SubLObject type_day_num = date_utilities.number_of_day_of_week(type);
        final SubLObject displacement = (type_day_num.numG(date_day_num)) ? add(multiply(number_utilities.f_1X(n), SEVEN_INTEGER), subtract(date_day_num, type_day_num)) : add(multiply(n, SEVEN_INTEGER), subtract(date_day_num, type_day_num));
        return date_utilities.date_before(date_utilities.date_to_precision(time_point, $$CalendarDay, UNPROVIDED), list($$DaysDuration, displacement));
    }

    public static SubLObject nth_day_of_week_type_starting_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject beginning_of_dayP = first_moment_of_covering_type_p($$CalendarDay, time_point);
        final SubLObject date_day_of_week = date_utilities.day_of_week_of_date(time_point);
        final SubLObject date_day_num = date_utilities.number_of_day_of_week(date_day_of_week);
        final SubLObject type_day_num = date_utilities.number_of_day_of_week(type);
        final SubLObject displacement = (type_day_num.numG(date_day_num) || (type_day_num.numE(date_day_num) && (NIL != beginning_of_dayP))) ? add(multiply(n, SEVEN_INTEGER), subtract(type_day_num, date_day_num)) : add(multiply(number_utilities.f_1X(n), SEVEN_INTEGER), subtract(type_day_num, date_day_num));
        return date_utilities.date_after(date_utilities.date_to_precision(time_point, $$CalendarDay, UNPROVIDED), list($$DaysDuration, displacement));
    }

    public static SubLObject nth_hour_of_day_type_starting_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject date_hour = date_utilities.extract_date_hour(time_point);
        final SubLObject type_hour = date_utilities.number_of_hour_of_day(type);
        final SubLObject displacement = (type_hour.numG(date_hour)) ? number_utilities.f_1X(n) : n;
        final SubLObject new_day = date_utilities.date_before(date_utilities.date_to_precision(time_point, $$CalendarDay, UNPROVIDED), list($$DaysDuration, displacement));
        return list($$HourFn, type_hour, new_day);
    }

    public static SubLObject nth_hour_of_day_type_starting_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject beginning_of_hourP = first_moment_of_covering_type_p($$CalendarHour, time_point);
        final SubLObject date_hour = date_utilities.extract_date_hour(time_point);
        final SubLObject type_hour = date_utilities.number_of_hour_of_day(type);
        final SubLObject displacement = (type_hour.numG(date_hour) || (type_hour.numE(date_hour) && (NIL != beginning_of_hourP))) ? n : number_utilities.f_1X(n);
        final SubLObject new_day = date_utilities.date_after(date_utilities.date_to_precision(time_point, $$CalendarDay, UNPROVIDED), list($$DaysDuration, displacement));
        return list($$HourFn, type_hour, new_day);
    }

    public static SubLObject nth_day_of_year_type_starting_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        if (NIL == day_of_year_nat_p(type)) {
            return Errors.error($str65$No_support_for_type__a_, type);
        }
        final SubLObject type_day = cycl_utilities.nat_arg2(type, UNPROVIDED);
        final SubLObject type_month_num = date_utilities.number_of_month(cycl_utilities.nat_arg1(type, UNPROVIDED));
        final SubLObject date_day = date_utilities.extract_date_day(time_point);
        final SubLObject date_month_num = date_utilities.extract_date_month_number(time_point);
        final SubLObject date_year = date_utilities.extract_date_year(time_point);
        final SubLObject displacement = (type_month_num.numG(date_month_num) || (type_month_num.numE(date_month_num) && type_day.numG(date_day))) ? number_utilities.f_1X(n) : n;
        final SubLObject final_year = subtract(date_year, displacement);
        return date_utilities.construct_calendar_date(final_year, type_month_num, type_day, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nth_day_of_year_type_starting_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        if (NIL == day_of_year_nat_p(type)) {
            return Errors.error($str65$No_support_for_type__a_, type);
        }
        final SubLObject beginning_of_dayP = first_moment_of_covering_type_p($$CalendarDay, time_point);
        final SubLObject type_day = cycl_utilities.nat_arg2(type, UNPROVIDED);
        final SubLObject type_month_num = date_utilities.number_of_month(cycl_utilities.nat_arg1(type, UNPROVIDED));
        final SubLObject date_day = date_utilities.extract_date_day(time_point);
        final SubLObject date_month_num = date_utilities.extract_date_month_number(time_point);
        final SubLObject date_year = date_utilities.extract_date_year(time_point);
        final SubLObject displacement = ((type_month_num.numG(date_month_num) || (type_month_num.numE(date_month_num) && type_day.numG(date_day))) || (type_month_num.numE(date_month_num) && (NIL != beginning_of_dayP))) ? n : number_utilities.f_1X(n);
        final SubLObject final_year = add(date_year, displacement);
        return date_utilities.construct_calendar_date(final_year, type_month_num, type_day, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nth_weekday_starting_no_later_than_time_point(final SubLObject time_point, final SubLObject n) {
        final SubLObject start_day = date_utilities.date_to_precision(time_point, $$CalendarDay, UNPROVIDED);
        final SubLObject start_day_type = date_utilities.day_of_week_of_date(start_day);
        SubLObject first_weekday = NIL;
        SubLObject first_weekday_type = NIL;
        final SubLObject pcase_var = start_day_type;
        if (pcase_var.eql($$Saturday)) {
            first_weekday = date_utilities.date_before(start_day, $list71);
            first_weekday_type = $$Friday;
        } else
            if (pcase_var.eql($$Sunday)) {
                first_weekday = date_utilities.date_before(start_day, $list75);
                first_weekday_type = $$Friday;
            } else {
                first_weekday = start_day;
                first_weekday_type = start_day_type;
            }

        if (n.isZero()) {
            return first_weekday;
        }
        final SubLObject week_displacement = integerDivide(n, FIVE_INTEGER);
        final SubLObject day_displacement = mod(n, FIVE_INTEGER);
        final SubLObject reference_day = date_utilities.date_before(first_weekday, list($$WeeksDuration, week_displacement));
        final SubLObject reference_day_num = subtract(date_utilities.number_of_day_of_week(first_weekday_type), ONE_INTEGER);
        if (day_displacement.isZero()) {
            return reference_day;
        }
        if (day_displacement.numLE(reference_day_num)) {
            return date_utilities.date_before(reference_day, list($$DaysDuration, day_displacement));
        }
        return date_utilities.date_before(reference_day, list($$DaysDuration, add(TWO_INTEGER, day_displacement)));
    }

    public static SubLObject nth_weekday_starting_no_earlier_than_time_point(final SubLObject time_point, final SubLObject n) {
        final SubLObject beginning_of_dayP = first_moment_of_covering_type_p($$CalendarDay, time_point);
        SubLObject start_day = date_utilities.date_to_precision(time_point, $$CalendarDay, UNPROVIDED);
        final SubLObject start_day_type = date_utilities.day_of_week_of_date(start_day);
        SubLObject first_weekday = NIL;
        SubLObject first_weekday_type = NIL;
        if (NIL == beginning_of_dayP) {
            start_day = date_utilities.date_after(start_day, $list71);
        }
        final SubLObject pcase_var = start_day_type;
        if (pcase_var.eql($$Saturday)) {
            first_weekday = date_utilities.date_after(start_day, $list75);
            first_weekday_type = $$Monday;
        } else
            if (pcase_var.eql($$Sunday)) {
                first_weekday = date_utilities.date_after(start_day, $list71);
                first_weekday_type = $$Monday;
            } else {
                first_weekday = start_day;
                first_weekday_type = start_day_type;
            }

        if (n.isZero()) {
            return first_weekday;
        }
        final SubLObject week_displacement = integerDivide(n, FIVE_INTEGER);
        final SubLObject day_displacement = mod(n, FIVE_INTEGER);
        final SubLObject reference_day = date_utilities.date_after(first_weekday, list($$WeeksDuration, week_displacement));
        final SubLObject reference_day_num = subtract(date_utilities.number_of_day_of_week(first_weekday_type), ONE_INTEGER);
        if (day_displacement.isZero()) {
            return reference_day;
        }
        if (add(day_displacement, reference_day_num).numLE(FOUR_INTEGER)) {
            return date_utilities.date_after(reference_day, list($$DaysDuration, day_displacement));
        }
        return date_utilities.date_after(reference_day, list($$DaysDuration, add(TWO_INTEGER, day_displacement)));
    }

    public static SubLObject declare_time_parameter_utilities_file() {
        declareFunction(me, "time_point_type_p", "TIME-POINT-TYPE-P", 1, 0, false);
        declareFunction(me, "conventional_time_series_p", "CONVENTIONAL-TIME-SERIES-P", 1, 0, false);
        declareFunction(me, "time_series_type_duration", "TIME-SERIES-TYPE-DURATION", 1, 0, false);
        declareFunction(me, "time_series_duration", "TIME-SERIES-DURATION", 1, 0, false);
        declareFunction(me, "covering_time_type_p", "COVERING-TIME-TYPE-P", 1, 0, false);
        declareFunction(me, "covering_type_unit_duration", "COVERING-TYPE-UNIT-DURATION", 1, 0, false);
        declareFunction(me, "covering_type_duration", "COVERING-TYPE-DURATION", 1, 0, false);
        declareFunction(me, "construct_covering_duration", "CONSTRUCT-COVERING-DURATION", 2, 0, false);
        declareFunction(me, "gappy_time_type_p", "GAPPY-TIME-TYPE-P", 1, 0, false);
        declareFunction(me, "gappy_type_period", "GAPPY-TYPE-PERIOD", 1, 0, false);
        declareFunction(me, "gappy_type_duration", "GAPPY-TYPE-DURATION", 1, 0, false);
        declareFunction(me, "month_of_year_typeP", "MONTH-OF-YEAR-TYPE?", 1, 0, false);
        declareFunction(me, "day_of_year_typeP", "DAY-OF-YEAR-TYPE?", 1, 0, false);
        declareFunction(me, "day_of_week_typeP", "DAY-OF-WEEK-TYPE?", 1, 0, false);
        declareFunction(me, "hour_of_day_typeP", "HOUR-OF-DAY-TYPE?", 1, 0, false);
        declareFunction(me, "sliding_time_type_p", "SLIDING-TIME-TYPE-P", 1, 0, false);
        declareFunction(me, "extract_sliding_type", "EXTRACT-SLIDING-TYPE", 1, 0, false);
        declareFunction(me, "extract_sliding_time_type", "EXTRACT-SLIDING-TIME-TYPE", 1, 0, false);
        declareFunction(me, "extract_sliding_type_amount", "EXTRACT-SLIDING-TYPE-AMOUNT", 1, 0, false);
        declareFunction(me, "make_sliding_type", "MAKE-SLIDING-TYPE", 1, 0, false);
        declareFunction(me, "duration_function_p", "DURATION-FUNCTION-P", 1, 0, false);
        declareFunction(me, "duration_p", "DURATION-P", 1, 0, false);
        declareFunction(me, "zero_duration_p", "ZERO-DURATION-P", 1, 0, false);
        declareFunction(me, "duration_typeL", "DURATION-TYPE<", 2, 0, false);
        declareFunction(me, "duration_type", "DURATION-TYPE", 1, 0, false);
        declareFunction(me, "duration_magnitude", "DURATION-MAGNITUDE", 1, 0, false);
        declareFunction(me, "duration_precision", "DURATION-PRECISION", 1, 0, false);
        declareFunction(me, "a_really_long_timeP", "A-REALLY-LONG-TIME?", 1, 0, false);
        declareFunction(me, "durationL", "DURATION<", 2, 0, false);
        declareFunction(me, "durationLE", "DURATION<=", 2, 0, false);
        declareFunction(me, "durationE", "DURATION=", 2, 0, false);
        declareFunction(me, "add_durations", "ADD-DURATIONS", 2, 0, false);
        declareFunction(me, "scale_duration", "SCALE-DURATION", 2, 0, false);
        declareFunction(me, "find_duration_quotient", "FIND-DURATION-QUOTIENT", 2, 1, false);
        declareFunction(me, "date_interval_subsumes_typeP", "DATE-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
        declareFunction(me, "date_interval_subsumed_by_typeP", "DATE-INTERVAL-SUBSUMED-BY-TYPE?", 2, 0, false);
        declareFunction(me, "type_duration_from_date", "TYPE-DURATION-FROM-DATE", 2, 0, false);
        declareFunction(me, "get_duration_of_type", "GET-DURATION-OF-TYPE", 1, 0, false);
        declareFunction(me, "get_duration_of_interval", "GET-DURATION-OF-INTERVAL", 1, 0, false);
        declareFunction(me, "interval_seconds_duration", "INTERVAL-SECONDS-DURATION", 1, 0, false);
        declareFunction(me, "type_seconds_duration", "TYPE-SECONDS-DURATION", 1, 0, false);
        declareFunction(me, "time_of_type_before_interval", "TIME-OF-TYPE-BEFORE-INTERVAL", 3, 0, false);
        declareFunction(me, "time_of_type_after_interval", "TIME-OF-TYPE-AFTER-INTERVAL", 3, 0, false);
        declareFunction(me, "time_ended_by_last_type_in_interval", "TIME-ENDED-BY-LAST-TYPE-IN-INTERVAL", 2, 0, false);
        declareFunction(me, "time_started_by_first_type_in_interval", "TIME-STARTED-BY-FIRST-TYPE-IN-INTERVAL", 2, 0, false);
        declareFunction(me, "day_of_year_nat_p", "DAY-OF-YEAR-NAT-P", 1, 0, false);
        declareFunction(me, "first_moment_of_covering_type_p", "FIRST-MOMENT-OF-COVERING-TYPE-P", 2, 0, false);
        declareFunction(me, "first_moment_of_covering_type_p_int", "FIRST-MOMENT-OF-COVERING-TYPE-P-INT", 2, 0, false);
        declareFunction(me, "last_moment_of_covering_type_p", "LAST-MOMENT-OF-COVERING-TYPE-P", 2, 0, false);
        declareFunction(me, "last_moment_of_covering_type_p_int", "LAST-MOMENT-OF-COVERING-TYPE-P-INT", 2, 0, false);
        declareFunction(me, "nth_type_starting_before_start_of_interval", "NTH-TYPE-STARTING-BEFORE-START-OF-INTERVAL", 3, 0, false);
        declareFunction(me, "nth_type_starting_no_later_than_start_of_interval", "NTH-TYPE-STARTING-NO-LATER-THAN-START-OF-INTERVAL", 3, 0, false);
        declareFunction(me, "nth_type_starting_after_start_of_interval", "NTH-TYPE-STARTING-AFTER-START-OF-INTERVAL", 3, 0, false);
        declareFunction(me, "nth_type_starting_no_earlier_than_start_of_interval", "NTH-TYPE-STARTING-NO-EARLIER-THAN-START-OF-INTERVAL", 3, 0, false);
        declareFunction(me, "nth_type_starting_before_end_of_interval", "NTH-TYPE-STARTING-BEFORE-END-OF-INTERVAL", 3, 0, false);
        declareFunction(me, "nth_type_starting_no_later_than_end_of_interval", "NTH-TYPE-STARTING-NO-LATER-THAN-END-OF-INTERVAL", 3, 0, false);
        declareFunction(me, "nth_type_starting_after_end_of_interval", "NTH-TYPE-STARTING-AFTER-END-OF-INTERVAL", 3, 0, false);
        declareFunction(me, "nth_type_starting_no_earlier_than_end_of_interval", "NTH-TYPE-STARTING-NO-EARLIER-THAN-END-OF-INTERVAL", 3, 0, false);
        declareFunction(me, "nth_type_ending_before_start_of_interval", "NTH-TYPE-ENDING-BEFORE-START-OF-INTERVAL", 3, 0, false);
        declareFunction(me, "nth_type_ending_no_later_than_start_of_interval", "NTH-TYPE-ENDING-NO-LATER-THAN-START-OF-INTERVAL", 3, 0, false);
        declareFunction(me, "nth_type_ending_after_start_of_interval", "NTH-TYPE-ENDING-AFTER-START-OF-INTERVAL", 3, 0, false);
        declareFunction(me, "nth_type_ending_no_earlier_than_start_of_interval", "NTH-TYPE-ENDING-NO-EARLIER-THAN-START-OF-INTERVAL", 3, 0, false);
        declareFunction(me, "nth_type_ending_before_end_of_interval", "NTH-TYPE-ENDING-BEFORE-END-OF-INTERVAL", 3, 0, false);
        declareFunction(me, "nth_type_ending_no_later_than_end_of_interval", "NTH-TYPE-ENDING-NO-LATER-THAN-END-OF-INTERVAL", 3, 0, false);
        declareFunction(me, "nth_type_ending_after_end_of_interval", "NTH-TYPE-ENDING-AFTER-END-OF-INTERVAL", 3, 0, false);
        declareFunction(me, "nth_type_ending_no_earlier_than_end_of_interval", "NTH-TYPE-ENDING-NO-EARLIER-THAN-END-OF-INTERVAL", 3, 0, false);
        declareFunction(me, "nth_type_starting_before_time_point", "NTH-TYPE-STARTING-BEFORE-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_type_starting_no_later_than_time_point", "NTH-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_type_starting_after_time_point", "NTH-TYPE-STARTING-AFTER-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_type_starting_no_earlier_than_time_point", "NTH-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_type_ending_before_time_point", "NTH-TYPE-ENDING-BEFORE-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_type_ending_no_later_than_time_point", "NTH-TYPE-ENDING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_type_ending_after_time_point", "NTH-TYPE-ENDING-AFTER-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_type_ending_no_earlier_than_time_point", "NTH-TYPE-ENDING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_time_point_no_later_than_time_point", "NTH-TIME-POINT-NO-LATER-THAN-TIME-POINT", 2, 0, false);
        declareFunction(me, "nth_time_point_no_earlier_than_time_point", "NTH-TIME-POINT-NO-EARLIER-THAN-TIME-POINT", 2, 0, false);
        declareFunction(me, "nth_covering_time_type_starting_no_later_than_time_point", "NTH-COVERING-TIME-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_covering_time_type_starting_no_earlier_than_time_point", "NTH-COVERING-TIME-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_covering_time_type_ending_no_later_than_time_point", "NTH-COVERING-TIME-TYPE-ENDING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_covering_time_type_ending_no_earlier_than_time_point", "NTH-COVERING-TIME-TYPE-ENDING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_gappy_time_type_starting_no_later_than_time_point", "NTH-GAPPY-TIME-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_gappy_time_type_starting_no_earlier_than_time_point", "NTH-GAPPY-TIME-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_gappy_time_type_ending_no_later_than_time_point", "NTH-GAPPY-TIME-TYPE-ENDING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_gappy_time_type_ending_no_earlier_than_time_point", "NTH-GAPPY-TIME-TYPE-ENDING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_month_of_year_type_starting_no_later_than_time_point", "NTH-MONTH-OF-YEAR-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_month_of_year_type_starting_no_earlier_than_time_point", "NTH-MONTH-OF-YEAR-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_day_of_week_type_starting_no_later_than_time_point", "NTH-DAY-OF-WEEK-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_day_of_week_type_starting_no_earlier_than_time_point", "NTH-DAY-OF-WEEK-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_hour_of_day_type_starting_no_later_than_time_point", "NTH-HOUR-OF-DAY-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_hour_of_day_type_starting_no_earlier_than_time_point", "NTH-HOUR-OF-DAY-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_day_of_year_type_starting_no_later_than_time_point", "NTH-DAY-OF-YEAR-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_day_of_year_type_starting_no_earlier_than_time_point", "NTH-DAY-OF-YEAR-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction(me, "nth_weekday_starting_no_later_than_time_point", "NTH-WEEKDAY-STARTING-NO-LATER-THAN-TIME-POINT", 2, 0, false);
        declareFunction(me, "nth_weekday_starting_no_earlier_than_time_point", "NTH-WEEKDAY-STARTING-NO-EARLIER-THAN-TIME-POINT", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_time_parameter_utilities_file() {
        defconstant("*ONE-SECOND-LONG*", $list15);
        defconstant("*DURATION-PREDICATES*", $list16);
        defconstant("*A-REALLY-LONG-TIME*", $A_LONG_TIME);
        return NIL;
    }

    public static SubLObject setup_time_parameter_utilities_file() {
        sunit_external.define_test_category($$$Time_Parameter_Tests, UNPROVIDED);
        sunit_external.define_test_suite($$$Start_of_Interval_Tests, $list78, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_time_parameter_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_time_parameter_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_time_parameter_utilities_file();
    }

    
}

/**
 * Total time: 360 ms
 */
