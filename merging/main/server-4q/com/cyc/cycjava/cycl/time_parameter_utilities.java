/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class time_parameter_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_first_moment_in_interval_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_first_moment_in_interval_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject first_moment_in_interval_p(SubLObject first_moment_in_interval) {
        return classes.subloop_instanceof_class(first_moment_in_interval, FIRST_MOMENT_IN_INTERVAL);
    }

    public static final SubLFile me = new time_parameter_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.time_parameter_utilities";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $one_second_long$ = makeSymbol("*ONE-SECOND-LONG*");

    // defconstant
    // The time duration predicates, IN ORDER.
    /**
     * The time duration predicates, IN ORDER.
     */
    @LispMethod(comment = "The time duration predicates, IN ORDER.\ndefconstant")
    public static final SubLSymbol $duration_predicates$ = makeSymbol("*DURATION-PREDICATES*");

    // defconstant
    /**
     * Denotes a time duration for an interval that either begins with the beginning
     * of time or ends with the end of time. This would be a really long time.
     */
    @LispMethod(comment = "Denotes a time duration for an interval that either begins with the beginning\r\nof time or ends with the end of time. This would be a really long time.\ndefconstant\nDenotes a time duration for an interval that either begins with the beginning\nof time or ends with the end of time. This would be a really long time.")
    public static final SubLSymbol $a_really_long_time$ = makeSymbol("*A-REALLY-LONG-TIME*");



    private static final SubLObject $const1$ConventionallyClassifiedTimeInter = reader_make_constant_shell("ConventionallyClassifiedTimeIntervalSeries");





    static private final SubLList $list5 = list(makeKeyword("PERIOD"));



    private static final SubLObject $const7$ConventionallyClassifiedTimeInter = reader_make_constant_shell("ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps");













    private static final SubLObject $$Null_TimeParameter = reader_make_constant_shell("Null-TimeParameter");

    static private final SubLList $list15 = list(reader_make_constant_shell("SecondsDuration"), ONE_INTEGER);

    static private final SubLList $list16 = list(new SubLObject[]{ reader_make_constant_shell("MillisecondsDuration"), reader_make_constant_shell("SecondsDuration"), reader_make_constant_shell("MinutesDuration"), reader_make_constant_shell("HoursDuration"), reader_make_constant_shell("DaysDuration"), reader_make_constant_shell("WeeksDuration"), reader_make_constant_shell("MonthsDuration"), reader_make_constant_shell("QuartersDuration"), reader_make_constant_shell("YearsDuration"), reader_make_constant_shell("DecadesDuration"), reader_make_constant_shell("CenturiesDuration"), reader_make_constant_shell("MillenniaDuration") });

    private static final SubLSymbol $A_LONG_TIME = makeKeyword("A-LONG-TIME");





    private static final SubLInteger $int$60 = makeInteger(60);





















    static private final SubLList $list31 = list(reader_make_constant_shell("SecondsDuration"), ZERO_INTEGER);

    static private final SubLList $list32 = list(ONE_INTEGER);

    static private final SubLString $str33$Type__a_is_not_a_proper_Conventio = makeString("Type ~a is not a proper ConventionallyClassifiedTimeIntervalSeries.");

    static private final SubLString $str34$Interval__a_is_not_a_proper_inter = makeString("Interval ~a is not a proper interval for offset calculations.");



    private static final SubLObject $$Always_TimeInterval = reader_make_constant_shell("Always-TimeInterval");

























    private static final SubLInteger $int$50 = makeInteger(50);





    static private final SubLString $str54$Unknown_time_type__a_ = makeString("Unknown time type ~a.");



    static private final SubLList $list56 = list(reader_make_constant_shell("DaysDuration"), SIX_INTEGER);



    private static final SubLInteger $int$51 = makeInteger(51);





    private static final SubLInteger $int$999 = makeInteger(999);

    static private final SubLString $str65$No_support_for_type__a_ = makeString("No support for type ~a.");





    static private final SubLList $list68 = list(reader_make_constant_shell("DaysDuration"), FOUR_INTEGER);





    static private final SubLList $list71 = list(reader_make_constant_shell("DaysDuration"), ONE_INTEGER);







    static private final SubLList $list75 = list(reader_make_constant_shell("DaysDuration"), TWO_INTEGER);

    static private final SubLString $$$Time_Parameter_Tests = makeString("Time Parameter Tests");

    static private final SubLString $$$Start_of_Interval_Tests = makeString("Start of Interval Tests");

    static private final SubLList $list78 = list(makeString("Time Parameter Tests"));

    // Definitions
    public static final SubLObject time_point_type_p_alt(SubLObject type) {
        return eq(type, $$TimePoint);
    }

    // Definitions
    public static SubLObject time_point_type_p(final SubLObject type) {
        return eql(type, $$TimePoint);
    }

    /**
     *
     *
     * @return booleanp; Returns whether TYPE is a instance of #$ConventionallyClassifiedTimeIntervalSeries, or is a #$CalendarCoveringType
     */
    @LispMethod(comment = "@return booleanp; Returns whether TYPE is a instance of #$ConventionallyClassifiedTimeIntervalSeries, or is a #$CalendarCoveringType")
    public static final SubLObject conventional_time_series_p_alt(SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.covering_time_type_p(type)) {
                return T;
            }
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(NIL, thread);
                        result = isa.isaP(type, $const1$ConventionallyClassifiedTimeInter, $$UniversalVocabularyMt, UNPROVIDED);
                    } finally {
                        sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return booleanp; Returns whether TYPE is a instance of #$ConventionallyClassifiedTimeIntervalSeries, or is a #$CalendarCoveringType
     */
    @LispMethod(comment = "@return booleanp; Returns whether TYPE is a instance of #$ConventionallyClassifiedTimeIntervalSeries, or is a #$CalendarCoveringType")
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

    /**
     *
     *
     * @return constant-p; Returns the associated type duration for TYPE.
    e.g. #$SecondsDuration YearsDuration
     */
    @LispMethod(comment = "@return constant-p; Returns the associated type duration for TYPE.\r\ne.g. #$SecondsDuration YearsDuration")
    public static final SubLObject time_series_type_duration_alt(SubLObject type) {
        return (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.covering_time_type_p(type)) && (NIL == com.cyc.cycjava.cycl.time_parameter_utilities.gappy_time_type_p(type)) ? ((SubLObject) (com.cyc.cycjava.cycl.time_parameter_utilities.covering_type_unit_duration(type))) : com.cyc.cycjava.cycl.time_parameter_utilities.duration_type(com.cyc.cycjava.cycl.time_parameter_utilities.gappy_type_duration(type));
    }

    /**
     *
     *
     * @return constant-p; Returns the associated type duration for TYPE.
    e.g. #$SecondsDuration YearsDuration
     */
    @LispMethod(comment = "@return constant-p; Returns the associated type duration for TYPE.\r\ne.g. #$SecondsDuration YearsDuration")
    public static SubLObject time_series_type_duration(final SubLObject type) {
        return (NIL != covering_time_type_p(type)) && (NIL == gappy_time_type_p(type)) ? covering_type_unit_duration(type) : duration_type(gappy_type_duration(type));
    }

    public static final SubLObject time_series_duration_alt(SubLObject type) {
        if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.covering_time_type_p(type)) {
            return com.cyc.cycjava.cycl.time_parameter_utilities.covering_type_duration(type);
        } else {
            if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.gappy_time_type_p(type)) {
                return com.cyc.cycjava.cycl.time_parameter_utilities.gappy_type_duration(type);
            } else {
                backward.removal_ask_variable($PERIOD, listS($$durationOfType, type, $list_alt5), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED).first();
            }
        }
        return NIL;
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

    /**
     *
     *
     * @return booleanp; Returns whether TYPE is a instance of #$CalendarCoveringType
     */
    @LispMethod(comment = "@return booleanp; Returns whether TYPE is a instance of #$CalendarCoveringType")
    public static final SubLObject covering_time_type_p_alt(SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(NIL, thread);
                        result = isa.isaP(type, $$CalendarCoveringType, $$UniversalVocabularyMt, UNPROVIDED);
                    } finally {
                        sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return booleanp; Returns whether TYPE is a instance of #$CalendarCoveringType
     */
    @LispMethod(comment = "@return booleanp; Returns whether TYPE is a instance of #$CalendarCoveringType")
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

    /**
     *
     *
     * @return constant-p; Returns the associated type duration for COVERING-TYPE.
    e.g. #$SecondsDuration YearsDuration
     */
    @LispMethod(comment = "@return constant-p; Returns the associated type duration for COVERING-TYPE.\r\ne.g. #$SecondsDuration YearsDuration")
    public static final SubLObject covering_type_unit_duration_alt(SubLObject covering_type) {
        return NIL != forts.fort_p(covering_type) ? ((SubLObject) (date_utilities.inference_defining_time_unit(covering_type))) : NIL;
    }

    /**
     *
     *
     * @return constant-p; Returns the associated type duration for COVERING-TYPE.
    e.g. #$SecondsDuration YearsDuration
     */
    @LispMethod(comment = "@return constant-p; Returns the associated type duration for COVERING-TYPE.\r\ne.g. #$SecondsDuration YearsDuration")
    public static SubLObject covering_type_unit_duration(final SubLObject covering_type) {
        return NIL != forts.fort_p(covering_type) ? date_utilities.inference_defining_time_unit(covering_type) : NIL;
    }

    public static final SubLObject covering_type_duration_alt(SubLObject type) {
        return com.cyc.cycjava.cycl.time_parameter_utilities.construct_covering_duration(type, ONE_INTEGER);
    }

    public static SubLObject covering_type_duration(final SubLObject type) {
        return construct_covering_duration(type, ONE_INTEGER);
    }

    /**
     *
     *
     * @return duration-p;  Constructs a duration of AMT times the associated unit
    type duration for TYPE. @xref covering-type-unit-duration.
     */
    @LispMethod(comment = "@return duration-p;  Constructs a duration of AMT times the associated unit\r\ntype duration for TYPE. @xref covering-type-unit-duration.")
    public static final SubLObject construct_covering_duration_alt(SubLObject type, SubLObject amt) {
        {
            SubLObject duration = com.cyc.cycjava.cycl.time_parameter_utilities.covering_type_unit_duration(type);
            return NIL != duration ? ((SubLObject) (make_unary_formula(duration, amt))) : NIL;
        }
    }

    /**
     *
     *
     * @return duration-p;  Constructs a duration of AMT times the associated unit
    type duration for TYPE. @xref covering-type-unit-duration.
     */
    @LispMethod(comment = "@return duration-p;  Constructs a duration of AMT times the associated unit\r\ntype duration for TYPE. @xref covering-type-unit-duration.")
    public static SubLObject construct_covering_duration(final SubLObject type, final SubLObject amt) {
        final SubLObject duration = covering_type_unit_duration(type);
        return NIL != duration ? make_unary_formula(duration, amt) : NIL;
    }

    /**
     *
     *
     * @return booleanp; Returns whether TYPE is an instance of ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps.
     */
    @LispMethod(comment = "@return booleanp; Returns whether TYPE is an instance of ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps.")
    public static final SubLObject gappy_time_type_p_alt(SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(NIL, thread);
                        result = isa.isaP(type, $const7$ConventionallyClassifiedTimeInter, $$UniversalVocabularyMt, UNPROVIDED);
                    } finally {
                        sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @return booleanp; Returns whether TYPE is an instance of ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps.
     */
    @LispMethod(comment = "@return booleanp; Returns whether TYPE is an instance of ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps.")
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

    /**
     *
     *
     * @return duration-p;  Returns duration of the period of occurrence of TYPE.
     */
    @LispMethod(comment = "@return duration-p;  Returns duration of the period of occurrence of TYPE.")
    public static final SubLObject gappy_type_period_alt(SubLObject type) {
        return backward.removal_ask_variable($PERIOD, listS($$periodOfTimeIntervalSeries, type, $list_alt5), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED).first();
    }

    /**
     *
     *
     * @return duration-p;  Returns duration of the period of occurrence of TYPE.
     */
    @LispMethod(comment = "@return duration-p;  Returns duration of the period of occurrence of TYPE.")
    public static SubLObject gappy_type_period(final SubLObject type) {
        return backward.removal_ask_variable($PERIOD, listS($$periodOfTimeIntervalSeries, type, $list5), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED).first();
    }

    /**
     *
     *
     * @return duration-p;  Returns the duration of TYPE.
     */
    @LispMethod(comment = "@return duration-p;  Returns the duration of TYPE.")
    public static final SubLObject gappy_type_duration_alt(SubLObject type) {
        return backward.removal_ask_variable($PERIOD, listS($$durationOfType, type, $list_alt5), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED).first();
    }

    /**
     *
     *
     * @return duration-p;  Returns the duration of TYPE.
     */
    @LispMethod(comment = "@return duration-p;  Returns the duration of TYPE.")
    public static SubLObject gappy_type_duration(final SubLObject type) {
        return backward.removal_ask_variable($PERIOD, listS($$durationOfType, type, $list5), $$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED).first();
    }

    public static final SubLObject month_of_year_typeP_alt(SubLObject type) {
        return isa.isaP(type, $$MonthOfYearType, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject month_of_year_typeP(final SubLObject type) {
        return isa.isaP(type, $$MonthOfYearType, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject day_of_year_typeP_alt(SubLObject type) {
        return isa.isaP(type, $$DayOfYearType, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject day_of_year_typeP(final SubLObject type) {
        return isa.isaP(type, $$DayOfYearType, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject day_of_week_typeP_alt(SubLObject type) {
        return isa.isaP(type, $$DayOfWeekType, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject day_of_week_typeP(final SubLObject type) {
        return isa.isaP(type, $$DayOfWeekType, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject hour_of_day_typeP_alt(SubLObject type) {
        return isa.isaP(type, $$HourOfDayType, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject hour_of_day_typeP(final SubLObject type) {
        return isa.isaP(type, $$HourOfDayType, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp; Returns whether TIME-PARAMETER is a #$SameLengthTimeIntervalTypeFn nat.
     */
    @LispMethod(comment = "@return booleanp; Returns whether TIME-PARAMETER is a #$SameLengthTimeIntervalTypeFn nat.")
    public static final SubLObject sliding_time_type_p_alt(SubLObject time_parameter) {
        return makeBoolean((((NIL != el_formula_p(time_parameter)) && (cycl_utilities.nat_functor(time_parameter) == $$SameLengthTimeIntervalTypeFn)) && (NIL != subl_promotions.memberP(com.cyc.cycjava.cycl.time_parameter_utilities.extract_sliding_time_type(time_parameter), $duration_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) && (NIL != number_utilities.positive_number_p(com.cyc.cycjava.cycl.time_parameter_utilities.extract_sliding_type_amount(time_parameter))));
    }

    /**
     *
     *
     * @return booleanp; Returns whether TIME-PARAMETER is a #$SameLengthTimeIntervalTypeFn nat.
     */
    @LispMethod(comment = "@return booleanp; Returns whether TIME-PARAMETER is a #$SameLengthTimeIntervalTypeFn nat.")
    public static SubLObject sliding_time_type_p(final SubLObject time_parameter) {
        return makeBoolean((((NIL != el_formula_p(time_parameter)) && cycl_utilities.nat_functor(time_parameter).eql($$SameLengthTimeIntervalTypeFn)) && (NIL != subl_promotions.memberP(extract_sliding_time_type(time_parameter), $duration_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) && (NIL != number_utilities.positive_number_p(extract_sliding_type_amount(time_parameter))));
    }

    /**
     *
     *
     * @return duration-p; Returns the duration specified by TIME-TYPE. e.g. (#$SecondsDuration 2)
     */
    @LispMethod(comment = "@return duration-p; Returns the duration specified by TIME-TYPE. e.g. (#$SecondsDuration 2)")
    public static final SubLObject extract_sliding_type_alt(SubLObject time_type) {
        return cycl_utilities.formula_arg1(time_type, UNPROVIDED);
    }

    /**
     *
     *
     * @return duration-p; Returns the duration specified by TIME-TYPE. e.g. (#$SecondsDuration 2)
     */
    @LispMethod(comment = "@return duration-p; Returns the duration specified by TIME-TYPE. e.g. (#$SecondsDuration 2)")
    public static SubLObject extract_sliding_type(final SubLObject time_type) {
        return cycl_utilities.formula_arg1(time_type, UNPROVIDED);
    }

    /**
     *
     *
     * @return constant-p;  Returns the type of duration specified by TIME-TYPE. e.g. #$SecondsDuration
     */
    @LispMethod(comment = "@return constant-p;  Returns the type of duration specified by TIME-TYPE. e.g. #$SecondsDuration")
    public static final SubLObject extract_sliding_time_type_alt(SubLObject time_type) {
        return cycl_utilities.formula_operator(cycl_utilities.formula_arg1(time_type, UNPROVIDED));
    }

    /**
     *
     *
     * @return constant-p;  Returns the type of duration specified by TIME-TYPE. e.g. #$SecondsDuration
     */
    @LispMethod(comment = "@return constant-p;  Returns the type of duration specified by TIME-TYPE. e.g. #$SecondsDuration")
    public static SubLObject extract_sliding_time_type(final SubLObject time_type) {
        return cycl_utilities.formula_operator(cycl_utilities.formula_arg1(time_type, UNPROVIDED));
    }

    /**
     *
     *
     * @return positive-integer-p; Returns the amount of time specified by TIME-TYPE.
     */
    @LispMethod(comment = "@return positive-integer-p; Returns the amount of time specified by TIME-TYPE.")
    public static final SubLObject extract_sliding_type_amount_alt(SubLObject time_type) {
        return cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(time_type, UNPROVIDED), UNPROVIDED);
    }

    /**
     *
     *
     * @return positive-integer-p; Returns the amount of time specified by TIME-TYPE.
     */
    @LispMethod(comment = "@return positive-integer-p; Returns the amount of time specified by TIME-TYPE.")
    public static SubLObject extract_sliding_type_amount(final SubLObject time_type) {
        return cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(time_type, UNPROVIDED), UNPROVIDED);
    }

    public static final SubLObject make_sliding_type_alt(SubLObject duration) {
        if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.a_really_long_timeP(duration)) {
            return $$Null_TimeParameter;
        }
        return list($$SameLengthTimeIntervalTypeFn, duration);
    }

    public static SubLObject make_sliding_type(final SubLObject duration) {
        if (NIL != a_really_long_timeP(duration)) {
            return $$Null_TimeParameter;
        }
        return list($$SameLengthTimeIntervalTypeFn, duration);
    }

    public static final SubLObject duration_function_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $duration_predicates$.getGlobalValue());
    }

    public static SubLObject duration_function_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $duration_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp; Whether OBJECT is a valid el duration.
     */
    @LispMethod(comment = "@return booleanp; Whether OBJECT is a valid el duration.")
    public static final SubLObject duration_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.time_parameter_utilities.a_really_long_timeP(v_object)) || (((NIL != el_formula_p(v_object)) && (NIL != variables.fully_bound_p(v_object))) && (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.duration_function_p(cycl_utilities.formula_arg0(v_object)))));
    }

    /**
     *
     *
     * @return booleanp; Whether OBJECT is a valid el duration.
     */
    @LispMethod(comment = "@return booleanp; Whether OBJECT is a valid el duration.")
    public static SubLObject duration_p(final SubLObject v_object) {
        return makeBoolean((NIL != a_really_long_timeP(v_object)) || (((NIL != el_formula_p(v_object)) && (NIL != variables.fully_bound_p(v_object))) && (NIL != duration_function_p(cycl_utilities.formula_arg0(v_object)))));
    }

    public static final SubLObject zero_duration_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.time_parameter_utilities.duration_p(v_object)) && com.cyc.cycjava.cycl.time_parameter_utilities.duration_magnitude(v_object).isZero());
    }

    public static SubLObject zero_duration_p(final SubLObject v_object) {
        return makeBoolean((NIL != duration_p(v_object)) && duration_magnitude(v_object).isZero());
    }

    /**
     *
     *
     * @return booleanp;  Whether one unit of TYPE1 has lesser duration than one unit of TYPE2.
     */
    @LispMethod(comment = "@return booleanp;  Whether one unit of TYPE1 has lesser duration than one unit of TYPE2.")
    public static final SubLObject duration_typeL_alt(SubLObject type1, SubLObject type2) {
        return numL(position(type1, $duration_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), position(type2, $duration_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @return booleanp;  Whether one unit of TYPE1 has lesser duration than one unit of TYPE2.
     */
    @LispMethod(comment = "@return booleanp;  Whether one unit of TYPE1 has lesser duration than one unit of TYPE2.")
    public static SubLObject duration_typeL(final SubLObject type1, final SubLObject type2) {
        return numL(position(type1, $duration_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), position(type2, $duration_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject duration_type_alt(SubLObject duration) {
        return duration.first();
    }

    public static SubLObject duration_type(final SubLObject duration) {
        return duration.first();
    }

    public static final SubLObject duration_magnitude_alt(SubLObject duration) {
        return second(duration);
    }

    public static SubLObject duration_magnitude(final SubLObject duration) {
        return second(duration);
    }

    public static final SubLObject duration_precision_alt(SubLObject duration) {
        return com.cyc.cycjava.cycl.time_parameter_utilities.duration_type(duration);
    }

    public static SubLObject duration_precision(final SubLObject duration) {
        return duration_type(duration);
    }

    /**
     *
     *
     * @return booleanp; Returns whether DURATION is *a-really-long-time*
     */
    @LispMethod(comment = "@return booleanp; Returns whether DURATION is *a-really-long-time*")
    public static final SubLObject a_really_long_timeP_alt(SubLObject duration) {
        return eq(duration, $a_really_long_time$.getGlobalValue());
    }

    /**
     *
     *
     * @return booleanp; Returns whether DURATION is *a-really-long-time*
     */
    @LispMethod(comment = "@return booleanp; Returns whether DURATION is *a-really-long-time*")
    public static SubLObject a_really_long_timeP(final SubLObject duration) {
        return eql(duration, $a_really_long_time$.getGlobalValue());
    }

    /**
     *
     *
     * @return boolean-p; Returns whether DURATION1 is strictly shorter than DURATION2.
     */
    @LispMethod(comment = "@return boolean-p; Returns whether DURATION1 is strictly shorter than DURATION2.")
    public static final SubLObject durationL_alt(SubLObject duration1, SubLObject duration2) {
        {
            SubLObject dur1_type = com.cyc.cycjava.cycl.time_parameter_utilities.duration_type(duration1);
            SubLObject dur1_amount = com.cyc.cycjava.cycl.time_parameter_utilities.duration_magnitude(duration1);
            SubLObject dur2_type = com.cyc.cycjava.cycl.time_parameter_utilities.duration_type(duration2);
            SubLObject dur2_amount = com.cyc.cycjava.cycl.time_parameter_utilities.duration_magnitude(duration2);
            if (dur1_type == dur2_type) {
                return numL(dur1_amount, dur2_amount);
            } else {
                if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.duration_typeL(dur1_type, dur2_type)) {
                    return numL(dur1_amount, multiply(com.cyc.cycjava.cycl.time_parameter_utilities.find_duration_quotient(dur1_type, dur2_type, UNPROVIDED), dur2_amount));
                } else {
                    return numL(multiply(com.cyc.cycjava.cycl.time_parameter_utilities.find_duration_quotient(dur2_type, dur1_type, UNPROVIDED), dur1_amount), dur2_amount);
                }
            }
        }
    }

    /**
     *
     *
     * @return boolean-p; Returns whether DURATION1 is strictly shorter than DURATION2.
     */
    @LispMethod(comment = "@return boolean-p; Returns whether DURATION1 is strictly shorter than DURATION2.")
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

    /**
     *
     *
     * @return boolean-p; Returns whether DURATION1 is no longer than DURATION2.
     */
    @LispMethod(comment = "@return boolean-p; Returns whether DURATION1 is no longer than DURATION2.")
    public static final SubLObject durationLE_alt(SubLObject duration1, SubLObject duration2) {
        {
            SubLObject dur1_type = com.cyc.cycjava.cycl.time_parameter_utilities.duration_type(duration1);
            SubLObject dur1_amount = com.cyc.cycjava.cycl.time_parameter_utilities.duration_magnitude(duration1);
            SubLObject dur2_type = com.cyc.cycjava.cycl.time_parameter_utilities.duration_type(duration2);
            SubLObject dur2_amount = com.cyc.cycjava.cycl.time_parameter_utilities.duration_magnitude(duration2);
            if (dur1_type == dur2_type) {
                return numLE(dur1_amount, dur2_amount);
            } else {
                if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.duration_typeL(dur1_type, dur2_type)) {
                    return numLE(dur1_amount, multiply(com.cyc.cycjava.cycl.time_parameter_utilities.find_duration_quotient(dur1_type, dur2_type, UNPROVIDED), dur2_amount));
                } else {
                    return numLE(multiply(com.cyc.cycjava.cycl.time_parameter_utilities.find_duration_quotient(dur2_type, dur1_type, UNPROVIDED), dur1_amount), dur2_amount);
                }
            }
        }
    }

    /**
     *
     *
     * @return boolean-p; Returns whether DURATION1 is no longer than DURATION2.
     */
    @LispMethod(comment = "@return boolean-p; Returns whether DURATION1 is no longer than DURATION2.")
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

    /**
     *
     *
     * @return boolean-p; Returns whether DURATION1 is equal to DURATION2.
     */
    @LispMethod(comment = "@return boolean-p; Returns whether DURATION1 is equal to DURATION2.")
    public static final SubLObject durationE_alt(SubLObject duration1, SubLObject duration2) {
        {
            SubLObject dur1_type = com.cyc.cycjava.cycl.time_parameter_utilities.duration_type(duration1);
            SubLObject dur1_amount = com.cyc.cycjava.cycl.time_parameter_utilities.duration_magnitude(duration1);
            SubLObject dur2_type = com.cyc.cycjava.cycl.time_parameter_utilities.duration_type(duration2);
            SubLObject dur2_amount = com.cyc.cycjava.cycl.time_parameter_utilities.duration_magnitude(duration2);
            if (dur1_type == dur2_type) {
                return numE(dur1_amount, dur2_amount);
            } else {
                if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.duration_typeL(dur1_type, dur2_type)) {
                    return numE(dur1_amount, multiply(com.cyc.cycjava.cycl.time_parameter_utilities.find_duration_quotient(dur1_type, dur2_type, UNPROVIDED), dur2_amount));
                } else {
                    return numE(multiply(com.cyc.cycjava.cycl.time_parameter_utilities.find_duration_quotient(dur2_type, dur1_type, UNPROVIDED), dur1_amount), dur2_amount);
                }
            }
        }
    }

    /**
     *
     *
     * @return boolean-p; Returns whether DURATION1 is equal to DURATION2.
     */
    @LispMethod(comment = "@return boolean-p; Returns whether DURATION1 is equal to DURATION2.")
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

    /**
     *
     *
     * @return duration-p;  Returns the total duration when DURATION1 is added to DURATION2.
     */
    @LispMethod(comment = "@return duration-p;  Returns the total duration when DURATION1 is added to DURATION2.")
    public static final SubLObject add_durations_alt(SubLObject duration1, SubLObject duration2) {
        {
            SubLObject dur1_type = com.cyc.cycjava.cycl.time_parameter_utilities.duration_type(duration1);
            SubLObject dur1_amount = com.cyc.cycjava.cycl.time_parameter_utilities.duration_magnitude(duration1);
            SubLObject dur2_type = com.cyc.cycjava.cycl.time_parameter_utilities.duration_type(duration2);
            SubLObject dur2_amount = com.cyc.cycjava.cycl.time_parameter_utilities.duration_magnitude(duration2);
            if (dur1_type == dur2_type) {
                return list(dur1_type, add(dur1_amount, dur2_amount));
            } else {
                if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.duration_typeL(dur1_type, dur2_type)) {
                    return list(dur1_type, add(dur1_amount, multiply(com.cyc.cycjava.cycl.time_parameter_utilities.find_duration_quotient(dur1_type, dur2_type, UNPROVIDED), dur2_amount)));
                } else {
                    return list(dur2_type, add(dur2_amount, multiply(com.cyc.cycjava.cycl.time_parameter_utilities.find_duration_quotient(dur2_type, dur1_type, UNPROVIDED), dur1_amount)));
                }
            }
        }
    }

    /**
     *
     *
     * @return duration-p;  Returns the total duration when DURATION1 is added to DURATION2.
     */
    @LispMethod(comment = "@return duration-p;  Returns the total duration when DURATION1 is added to DURATION2.")
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

    public static final SubLObject scale_duration_alt(SubLObject duration, SubLObject scalar) {
        return list(com.cyc.cycjava.cycl.time_parameter_utilities.duration_type(duration), multiply(scalar, com.cyc.cycjava.cycl.time_parameter_utilities.duration_magnitude(duration)));
    }

    public static SubLObject scale_duration(final SubLObject duration, final SubLObject scalar) {
        return list(duration_type(duration), multiply(scalar, duration_magnitude(duration)));
    }

    /**
     * How many of TYPE1 are in TYPE2. ACC accumulates the quotient
     */
    @LispMethod(comment = "How many of TYPE1 are in TYPE2. ACC accumulates the quotient")
    public static final SubLObject find_duration_quotient_alt(SubLObject type1, SubLObject type2, SubLObject acc) {
        if (acc == UNPROVIDED) {
            acc = ONE_INTEGER;
        }
        if (type1 == type2) {
            return acc;
        }
        {
            SubLObject pcase_var = type1;
            if (pcase_var.eql($$SecondsDuration)) {
                return com.cyc.cycjava.cycl.time_parameter_utilities.find_duration_quotient($$MinutesDuration, type2, multiply($int$60, acc));
            } else {
                if (pcase_var.eql($$MinutesDuration)) {
                    return com.cyc.cycjava.cycl.time_parameter_utilities.find_duration_quotient($$HoursDuration, type2, multiply($int$60, acc));
                } else {
                    if (pcase_var.eql($$HoursDuration)) {
                        return com.cyc.cycjava.cycl.time_parameter_utilities.find_duration_quotient($$DaysDuration, type2, multiply($int$24, acc));
                    } else {
                        if (pcase_var.eql($$DaysDuration)) {
                            return com.cyc.cycjava.cycl.time_parameter_utilities.find_duration_quotient($$WeeksDuration, type2, multiply(SEVEN_INTEGER, acc));
                        } else {
                            if (pcase_var.eql($$WeeksDuration)) {
                                return com.cyc.cycjava.cycl.time_parameter_utilities.find_duration_quotient($$MonthsDuration, type2, multiply(FOUR_INTEGER, acc));
                            } else {
                                if (pcase_var.eql($$MonthsDuration)) {
                                    return com.cyc.cycjava.cycl.time_parameter_utilities.find_duration_quotient($$QuartersDuration, type2, multiply(THREE_INTEGER, acc));
                                } else {
                                    if (pcase_var.eql($$QuartersDuration)) {
                                        return com.cyc.cycjava.cycl.time_parameter_utilities.find_duration_quotient($$YearsDuration, type2, multiply(FOUR_INTEGER, acc));
                                    } else {
                                        if (pcase_var.eql($$YearsDuration)) {
                                            return com.cyc.cycjava.cycl.time_parameter_utilities.find_duration_quotient($$DecadesDuration, type2, multiply(TEN_INTEGER, acc));
                                        } else {
                                            if (pcase_var.eql($$DecadesDuration)) {
                                                return com.cyc.cycjava.cycl.time_parameter_utilities.find_duration_quotient($$CenturiesDuration, type2, multiply(TEN_INTEGER, acc));
                                            } else {
                                                if (pcase_var.eql($$CenturiesDuration)) {
                                                    return com.cyc.cycjava.cycl.time_parameter_utilities.find_duration_quotient($$MillenniaDuration, type2, multiply(TEN_INTEGER, acc));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * How many of TYPE1 are in TYPE2. ACC accumulates the quotient
     */
    @LispMethod(comment = "How many of TYPE1 are in TYPE2. ACC accumulates the quotient")
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

    /**
     *
     *
     * @return booleanp; whether date interval INTERVAL subsumes an instance of TYPE.
     */
    @LispMethod(comment = "@return booleanp; whether date interval INTERVAL subsumes an instance of TYPE.")
    public static final SubLObject date_interval_subsumes_typeP_alt(SubLObject interval, SubLObject type) {
        if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.a_really_long_timeP(com.cyc.cycjava.cycl.time_parameter_utilities.interval_seconds_duration(interval))) {
            return T;
        } else {
            if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.sliding_time_type_p(type)) {
                {
                    SubLObject type_duration = com.cyc.cycjava.cycl.time_parameter_utilities.get_duration_of_type(type);
                    if (NIL != type_duration) {
                        {
                            SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
                            SubLObject type_end = time_interval_utilities.preceding_cycl_date(date_utilities.date_after(time_interval_utilities.cycl_interval_initial_second(interval), type_duration));
                            return date_utilities.dateLE(type_end, interval_end);
                        }
                    } else {
                        return NIL;
                    }
                }
            } else {
                {
                    SubLObject type_interval = com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_starting_no_earlier_than_start_of_interval(interval, type, ZERO_INTEGER);
                    return NIL != type_interval ? ((SubLObject) (hlmt_relevance.subsumed_time_intervalP(type_interval, interval))) : NIL;
                }
            }
        }
    }

    /**
     *
     *
     * @return booleanp; whether date interval INTERVAL subsumes an instance of TYPE.
     */
    @LispMethod(comment = "@return booleanp; whether date interval INTERVAL subsumes an instance of TYPE.")
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

    /**
     *
     *
     * @return booleanp; whether date interval INTERVAL is subsumed by an instance of TYPE.
     */
    @LispMethod(comment = "@return booleanp; whether date interval INTERVAL is subsumed by an instance of TYPE.")
    public static final SubLObject date_interval_subsumed_by_typeP_alt(SubLObject interval, SubLObject type) {
        if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.a_really_long_timeP(com.cyc.cycjava.cycl.time_parameter_utilities.interval_seconds_duration(interval))) {
            return NIL;
        } else {
            {
                SubLObject type_seconds_duration = com.cyc.cycjava.cycl.time_parameter_utilities.type_seconds_duration(type);
                if (NIL == type_seconds_duration) {
                    return NIL;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.a_really_long_timeP(com.cyc.cycjava.cycl.time_parameter_utilities.type_seconds_duration(type))) {
                        return T;
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.sliding_time_type_p(type)) {
                            {
                                SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
                                SubLObject type_end = time_interval_utilities.preceding_cycl_date(date_utilities.date_after(time_interval_utilities.cycl_interval_initial_second(interval), com.cyc.cycjava.cycl.time_parameter_utilities.get_duration_of_type(type)));
                                return date_utilities.dateLE(interval_end, type_end);
                            }
                        } else {
                            {
                                SubLObject type_interval = com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_starting_no_later_than_start_of_interval(interval, type, ZERO_INTEGER);
                                return NIL != type_interval ? ((SubLObject) (hlmt_relevance.subsumed_time_intervalP(interval, type_interval))) : NIL;
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return booleanp; whether date interval INTERVAL is subsumed by an instance of TYPE.
     */
    @LispMethod(comment = "@return booleanp; whether date interval INTERVAL is subsumed by an instance of TYPE.")
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

    /**
     *
     *
     * @return date-p;  Returns the date after DATE by the amount specified by TYPE.
     */
    @LispMethod(comment = "@return date-p;  Returns the date after DATE by the amount specified by TYPE.")
    public static final SubLObject type_duration_from_date_alt(SubLObject date, SubLObject type) {
        {
            SubLObject type_duration = com.cyc.cycjava.cycl.time_parameter_utilities.get_duration_of_type(type);
            return NIL != type_duration ? ((SubLObject) (date_utilities.date_after(date, type_duration))) : NIL;
        }
    }

    /**
     *
     *
     * @return date-p;  Returns the date after DATE by the amount specified by TYPE.
     */
    @LispMethod(comment = "@return date-p;  Returns the date after DATE by the amount specified by TYPE.")
    public static SubLObject type_duration_from_date(final SubLObject date, final SubLObject type) {
        final SubLObject type_duration = get_duration_of_type(type);
        return NIL != type_duration ? date_utilities.date_after(date, type_duration) : NIL;
    }

    /**
     *
     *
     * @return duration-p;  Returns the duration of TYPE.
     */
    @LispMethod(comment = "@return duration-p;  Returns the duration of TYPE.")
    public static final SubLObject get_duration_of_type_alt(SubLObject type) {
        {
            SubLObject duration = NIL;
            if (type == $$Null_TimeParameter) {
                return $a_really_long_time$.getGlobalValue();
            } else {
                if (type == $$TimePoint) {
                    return $list_alt31;
                } else {
                    if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.gappy_time_type_p(type)) {
                        duration = com.cyc.cycjava.cycl.time_parameter_utilities.gappy_type_duration(type);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.covering_time_type_p(type)) {
                            {
                                SubLObject duration_fn = com.cyc.cycjava.cycl.time_parameter_utilities.time_series_type_duration(type);
                                if (NIL != duration_fn) {
                                    duration = list(duration_fn, ONE_INTEGER);
                                }
                            }
                        } else {
                            duration = com.cyc.cycjava.cycl.time_parameter_utilities.extract_sliding_type(type);
                        }
                    }
                }
            }
            return duration;
        }
    }

    /**
     *
     *
     * @return duration-p;  Returns the duration of TYPE.
     */
    @LispMethod(comment = "@return duration-p;  Returns the duration of TYPE.")
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

    /**
     *
     *
     * @return duration-p; Returns the duration of INTERVAL
     */
    @LispMethod(comment = "@return duration-p; Returns the duration of INTERVAL")
    public static final SubLObject get_duration_of_interval_alt(SubLObject interval) {
        if (NIL != date_utilities.date_p(interval)) {
            return bq_cons(com.cyc.cycjava.cycl.time_parameter_utilities.time_series_type_duration(date_utilities.date_precision(interval)), $list_alt32);
        } else {
            if ((NIL != time_interval_utilities.proper_date_interval_p(interval)) || (NIL != date_utilities.generalized_date_p(interval))) {
                {
                    SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
                    SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
                    if ((NIL != date_utilities.beginning_of_timeP(interval_start)) || (NIL != date_utilities.end_of_timeP(interval_end))) {
                        return $a_really_long_time$.getGlobalValue();
                    }
                    return list($$SecondsDuration, number_utilities.f_1X(second(date_utilities.time_elapsed(interval_start, interval_end, UNPROVIDED))));
                }
            } else {
                return list($$SecondsDuration, com.cyc.cycjava.cycl.time_parameter_utilities.interval_seconds_duration(interval));
            }
        }
    }

    /**
     *
     *
     * @return duration-p; Returns the duration of INTERVAL
     */
    @LispMethod(comment = "@return duration-p; Returns the duration of INTERVAL")
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

    /**
     *
     *
     * @return positive-integer-p; Returns the duration of TIME-INTERVAL in seconds.
     */
    @LispMethod(comment = "@return positive-integer-p; Returns the duration of TIME-INTERVAL in seconds.")
    public static final SubLObject interval_seconds_duration_alt(SubLObject time_interval) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != date_utilities.date_p(time_interval)) {
                thread.resetMultipleValues();
                {
                    SubLObject format = date_utilities.explode_date(time_interval);
                    SubLObject year = thread.secondMultipleValue();
                    SubLObject month = thread.thirdMultipleValue();
                    SubLObject day = thread.fourthMultipleValue();
                    SubLObject hour = thread.fifthMultipleValue();
                    SubLObject min = thread.sixthMultipleValue();
                    SubLObject sec = thread.seventhMultipleValue();
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
                        } else {
                            return numeric_date_utilities.$seconds_in_a_non_leap_year$.getGlobalValue();
                        }
                    }
                }
            } else {
                if (NIL != time_interval_utilities.proper_date_interval_p(time_interval)) {
                    {
                        SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(time_interval);
                        SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(time_interval);
                        if ((NIL != date_utilities.beginning_of_timeP(interval_start)) || (NIL != date_utilities.end_of_timeP(interval_end))) {
                            return $a_really_long_time$.getGlobalValue();
                        }
                        return number_utilities.f_1X(second(date_utilities.time_elapsed(interval_start, interval_end, UNPROVIDED)));
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return positive-integer-p; Returns the duration of TIME-INTERVAL in seconds.
     */
    @LispMethod(comment = "@return positive-integer-p; Returns the duration of TIME-INTERVAL in seconds.")
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

    public static final SubLObject type_seconds_duration_alt(SubLObject type) {
        if (type == $$Null_TimeParameter) {
            return $a_really_long_time$.getGlobalValue();
        }
        {
            SubLObject type_duration = com.cyc.cycjava.cycl.time_parameter_utilities.get_duration_of_type(type);
            if (NIL != type_duration) {
                {
                    SubLObject coefficient = com.cyc.cycjava.cycl.time_parameter_utilities.find_duration_quotient($$SecondsDuration, com.cyc.cycjava.cycl.time_parameter_utilities.duration_type(type_duration), UNPROVIDED);
                    if (NIL != coefficient) {
                        return multiply(com.cyc.cycjava.cycl.time_parameter_utilities.duration_magnitude(type_duration), coefficient);
                    }
                }
            }
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

    /**
     *
     *
     * @return time-interval-p; The interval before INTERVAL by AMT of TYPE.
     */
    @LispMethod(comment = "@return time-interval-p; The interval before INTERVAL by AMT of TYPE.")
    public static final SubLObject time_of_type_before_interval_alt(SubLObject type, SubLObject amt, SubLObject interval) {
        if (NIL != time_interval_utilities.date_interval_p(interval)) {
            if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.covering_time_type_p(type)) {
                {
                    SubLObject duration = com.cyc.cycjava.cycl.time_parameter_utilities.construct_covering_duration(type, amt);
                    SubLObject result = date_utilities.date_before(interval, duration);
                    return values(result, list_utilities.sublisp_boolean(result));
                }
            } else {
                if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.gappy_type_duration(type)) {
                    return values(interval, NIL);
                } else {
                    Errors.error($str_alt33$Type__a_is_not_a_proper_Conventio, type);
                }
            }
        } else {
            Errors.error($str_alt34$Interval__a_is_not_a_proper_inter);
        }
        return values(NIL, NIL);
    }

    /**
     *
     *
     * @return time-interval-p; The interval before INTERVAL by AMT of TYPE.
     */
    @LispMethod(comment = "@return time-interval-p; The interval before INTERVAL by AMT of TYPE.")
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

    /**
     *
     *
     * @return time-interval-p; The interval after INTERVAL by AMT of TYPE.
     */
    @LispMethod(comment = "@return time-interval-p; The interval after INTERVAL by AMT of TYPE.")
    public static final SubLObject time_of_type_after_interval_alt(SubLObject type, SubLObject amt, SubLObject interval) {
        if (NIL != time_interval_utilities.date_interval_p(interval)) {
            if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.covering_time_type_p(type)) {
                {
                    SubLObject duration = com.cyc.cycjava.cycl.time_parameter_utilities.construct_covering_duration(type, amt);
                    SubLObject result = date_utilities.date_after(interval, duration);
                    return values(result, list_utilities.sublisp_boolean(result));
                }
            } else {
                if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.gappy_type_duration(type)) {
                    return values(interval, NIL);
                } else {
                    Errors.error($str_alt33$Type__a_is_not_a_proper_Conventio, type);
                }
            }
        } else {
            Errors.error($str_alt34$Interval__a_is_not_a_proper_inter);
        }
        return values(NIL, NIL);
    }

    /**
     *
     *
     * @return time-interval-p; The interval after INTERVAL by AMT of TYPE.
     */
    @LispMethod(comment = "@return time-interval-p; The interval after INTERVAL by AMT of TYPE.")
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

    public static final SubLObject time_ended_by_last_type_in_interval_alt(SubLObject interval, SubLObject type) {
        if (type == $$Null_TimeParameter) {
            return list($$IntervalEndedByFn, interval);
        } else {
            if (NIL == time_interval_utilities.date_interval_p(interval)) {
                return NIL;
            } else {
                if ((NIL != time_interval_utilities.interval_started_by_intervalP(interval)) && (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.time_point_type_p(type))) {
                    return $$Always_TimeInterval;
                } else {
                    if (NIL != time_interval_utilities.some_time_interval_p(interval)) {
                        return NIL != com.cyc.cycjava.cycl.time_parameter_utilities.time_point_type_p(type) ? ((SubLObject) (list($$IntervalEndedByFn, interval))) : NIL;
                    } else {
                        if (NIL == hlmt_relevance.time_interval_subsumes_typeP(interval, type)) {
                            return NIL;
                        } else {
                            {
                                SubLObject last_type = com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_ending_no_later_than_end_of_interval(interval, type, ZERO_INTEGER);
                                return time_interval_utilities.canonicalize_time_interval(list($$IntervalEndedByFn, last_type));
                            }
                        }
                    }
                }
            }
        }
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

    public static final SubLObject time_started_by_first_type_in_interval_alt(SubLObject interval, SubLObject type) {
        if (type == $$Null_TimeParameter) {
            return list($$IntervalStartedByFn, interval);
        } else {
            if (NIL == time_interval_utilities.date_interval_p(interval)) {
                return NIL;
            } else {
                if ((NIL != time_interval_utilities.interval_ended_by_intervalP(interval)) && (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.time_point_type_p(type))) {
                    return $$Always_TimeInterval;
                } else {
                    if (NIL != time_interval_utilities.some_time_interval_p(interval)) {
                        return NIL != com.cyc.cycjava.cycl.time_parameter_utilities.time_point_type_p(type) ? ((SubLObject) (list($$IntervalStartedByFn, interval))) : NIL;
                    } else {
                        if (NIL == hlmt_relevance.time_interval_subsumes_typeP(interval, type)) {
                            return NIL;
                        } else {
                            {
                                SubLObject first_type = com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_starting_no_earlier_than_start_of_interval(interval, type, ZERO_INTEGER);
                                return time_interval_utilities.canonicalize_time_interval(list($$IntervalStartedByFn, first_type));
                            }
                        }
                    }
                }
            }
        }
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

    public static final SubLObject day_of_year_nat_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_nat_p(v_object)) && (cycl_utilities.nat_functor(v_object) == $$DayOfYearFn));
    }

    public static SubLObject day_of_year_nat_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_nat_p(v_object)) && cycl_utilities.nat_functor(v_object).eql($$DayOfYearFn));
    }

    public static final SubLObject first_moment_of_covering_type_p_alt(SubLObject type, SubLObject date) {
        if (NIL == date_utilities.date_p(date)) {
            return NIL;
        }
        {
            SubLObject pcase_var = type;
            if (((((pcase_var.eql($$CalendarSecond) || pcase_var.eql($$CalendarMinute)) || pcase_var.eql($$CalendarHour)) || pcase_var.eql($$CalendarDay)) || pcase_var.eql($$CalendarMonth)) || pcase_var.eql($$CalendarYear)) {
                return com.cyc.cycjava.cycl.time_parameter_utilities.first_moment_of_covering_type_p_int(type, date);
            } else {
                if (pcase_var.eql($$CalendarWeek)) {
                    return makeBoolean((NIL != date_utilities.starting_value_for_calendar_unit_p(date_utilities.day_of_week_of_date(date), $$CalendarWeek)) && (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.first_moment_of_covering_type_p_int($$CalendarDay, date)));
                } else {
                    if (pcase_var.eql($$CalendarQuarter)) {
                        return makeBoolean((NIL != number_utilities.onep(mod(date_utilities.extract_date_month_number(date), FOUR_INTEGER))) && (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.first_moment_of_covering_type_p_int($$CalendarMonth, date)));
                    } else {
                        if (pcase_var.eql($$CalendarDecade)) {
                            return makeBoolean(mod(date_utilities.extract_date_year(date), TEN_INTEGER).isZero() && (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.first_moment_of_covering_type_p_int($$CalendarYear, date)));
                        } else {
                            if (pcase_var.eql($$CalendarHalfCentury)) {
                                return makeBoolean((NIL != number_utilities.onep(mod(date_utilities.extract_date_year(date), $int$50))) && (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.first_moment_of_covering_type_p_int($$CalendarYear, date)));
                            } else {
                                if (pcase_var.eql($$CalendarCentury)) {
                                    return makeBoolean((NIL != number_utilities.onep(mod(date_utilities.extract_date_year(date), $int$100))) && (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.first_moment_of_covering_type_p_int($$CalendarYear, date)));
                                } else {
                                    if (pcase_var.eql($$CalendarMillennium)) {
                                        return makeBoolean((NIL != number_utilities.onep(mod(date_utilities.extract_date_year(date), $int$1000))) && (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.first_moment_of_covering_type_p_int($$CalendarYear, date)));
                                    } else {
                                        return NIL;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
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

    public static final SubLObject first_moment_of_covering_type_p_int_alt(SubLObject type, SubLObject date) {
        {
            SubLObject stopP = NIL;
            SubLObject successP = T;
            if (NIL == stopP) {
                {
                    SubLObject csome_list_var = date_utilities.$date_units_ordered$.getGlobalValue();
                    SubLObject time_type = NIL;
                    for (time_type = csome_list_var.first(); !((NIL != stopP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , time_type = csome_list_var.first()) {
                        {
                            SubLObject val = date_utilities.extract_date_time_type(date, time_type);
                            if (time_type == type) {
                                stopP = T;
                            } else {
                                if (NIL == date_utilities.starting_value_for_calendar_unit_p(val, time_type)) {
                                    successP = NIL;
                                    stopP = T;
                                }
                            }
                        }
                    }
                }
            }
            return successP;
        }
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

    public static final SubLObject last_moment_of_covering_type_p_alt(SubLObject type, SubLObject date) {
        if (NIL == date_utilities.date_p(date)) {
            return NIL;
        }
        {
            SubLObject pcase_var = type;
            if (((((pcase_var.eql($$CalendarSecond) || pcase_var.eql($$CalendarMinute)) || pcase_var.eql($$CalendarHour)) || pcase_var.eql($$CalendarDay)) || pcase_var.eql($$CalendarMonth)) || pcase_var.eql($$CalendarYear)) {
                return com.cyc.cycjava.cycl.time_parameter_utilities.last_moment_of_covering_type_p_int(type, date);
            } else {
                if (pcase_var.eql($$CalendarWeek)) {
                    return makeBoolean((NIL != date_utilities.ending_value_for_calendar_unit_p(date_utilities.day_of_week_of_date(date), $$CalendarWeek, UNPROVIDED, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.first_moment_of_covering_type_p_int($$CalendarDay, date)));
                } else {
                    if (pcase_var.eql($$CalendarQuarter)) {
                        return makeBoolean(mod(date_utilities.extract_date_month_number(date), FOUR_INTEGER).isZero() && (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.last_moment_of_covering_type_p_int($$CalendarMonth, date)));
                    } else {
                        if (pcase_var.eql($$CalendarDecade)) {
                            return makeBoolean(NINE_INTEGER.numE(mod(date_utilities.extract_date_year(date), TEN_INTEGER)) && (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.last_moment_of_covering_type_p_int($$CalendarYear, date)));
                        } else {
                            if (pcase_var.eql($$CalendarHalfCentury)) {
                                return makeBoolean(mod(date_utilities.extract_date_year(date), $int$50).isZero() && (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.last_moment_of_covering_type_p_int($$CalendarYear, date)));
                            } else {
                                if (pcase_var.eql($$CalendarCentury)) {
                                    return makeBoolean(mod(date_utilities.extract_date_year(date), $int$100).isZero() && (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.last_moment_of_covering_type_p_int($$CalendarYear, date)));
                                } else {
                                    if (pcase_var.eql($$CalendarMillennium)) {
                                        return makeBoolean(mod(date_utilities.extract_date_year(date), $int$1000).isZero() && (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.last_moment_of_covering_type_p_int($$CalendarYear, date)));
                                    } else {
                                        return NIL;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
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

    public static final SubLObject last_moment_of_covering_type_p_int_alt(SubLObject type, SubLObject date) {
        {
            SubLObject stopP = NIL;
            SubLObject successP = T;
            if (NIL == stopP) {
                {
                    SubLObject csome_list_var = date_utilities.$date_units_ordered$.getGlobalValue();
                    SubLObject time_type = NIL;
                    for (time_type = csome_list_var.first(); !((NIL != stopP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , time_type = csome_list_var.first()) {
                        {
                            SubLObject val = date_utilities.extract_date_time_type(date, time_type);
                            if (time_type == type) {
                                stopP = T;
                            } else {
                                if (NIL == date_utilities.ending_value_for_calendar_unit_p(val, time_type, UNPROVIDED, UNPROVIDED)) {
                                    successP = NIL;
                                    stopP = T;
                                }
                            }
                        }
                    }
                }
            }
            return successP;
        }
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

    /**
     * Returns the Nth interval of TYPE which starts strictly before the start of INTERVAL.
     */
    @LispMethod(comment = "Returns the Nth interval of TYPE which starts strictly before the start of INTERVAL.")
    public static final SubLObject nth_type_starting_before_start_of_interval_alt(SubLObject interval, SubLObject type, SubLObject n) {
        {
            SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_starting_before_time_point(interval_start, type, n);
        }
    }

    @LispMethod(comment = "Returns the Nth interval of TYPE which starts strictly before the start of INTERVAL.")
    public static SubLObject nth_type_starting_before_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
        return nth_type_starting_before_time_point(interval_start, type, n);
    }/**
     * Returns the Nth interval of TYPE which starts strictly before the start of INTERVAL.
     */


    /**
     * Returns the Nth interval of TYPE which starts no later than the start of INTERVAL.
     */
    @LispMethod(comment = "Returns the Nth interval of TYPE which starts no later than the start of INTERVAL.")
    public static final SubLObject nth_type_starting_no_later_than_start_of_interval_alt(SubLObject interval, SubLObject type, SubLObject n) {
        {
            SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_starting_no_later_than_time_point(interval_start, type, n);
        }
    }

    @LispMethod(comment = "Returns the Nth interval of TYPE which starts no later than the start of INTERVAL.")
    public static SubLObject nth_type_starting_no_later_than_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
        return nth_type_starting_no_later_than_time_point(interval_start, type, n);
    }/**
     * Returns the Nth interval of TYPE which starts no later than the start of INTERVAL.
     */


    /**
     * Returns the Nth interval of TYPE which starts strictly after the start of INTERVAL.
     */
    @LispMethod(comment = "Returns the Nth interval of TYPE which starts strictly after the start of INTERVAL.")
    public static final SubLObject nth_type_starting_after_start_of_interval_alt(SubLObject interval, SubLObject type, SubLObject n) {
        {
            SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_starting_after_time_point(interval_start, type, n);
        }
    }

    @LispMethod(comment = "Returns the Nth interval of TYPE which starts strictly after the start of INTERVAL.")
    public static SubLObject nth_type_starting_after_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
        return nth_type_starting_after_time_point(interval_start, type, n);
    }/**
     * Returns the Nth interval of TYPE which starts strictly after the start of INTERVAL.
     */


    /**
     * Returns the Nth interval of TYPE which starts no earlier than the start of INTERVAL.
     */
    @LispMethod(comment = "Returns the Nth interval of TYPE which starts no earlier than the start of INTERVAL.")
    public static final SubLObject nth_type_starting_no_earlier_than_start_of_interval_alt(SubLObject interval, SubLObject type, SubLObject n) {
        {
            SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_starting_no_earlier_than_time_point(interval_start, type, n);
        }
    }

    @LispMethod(comment = "Returns the Nth interval of TYPE which starts no earlier than the start of INTERVAL.")
    public static SubLObject nth_type_starting_no_earlier_than_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
        return nth_type_starting_no_earlier_than_time_point(interval_start, type, n);
    }/**
     * Returns the Nth interval of TYPE which starts no earlier than the start of INTERVAL.
     */


    /**
     * Returns the Nth interval of TYPE which starts strictly before the end of INTERVAL.
     */
    @LispMethod(comment = "Returns the Nth interval of TYPE which starts strictly before the end of INTERVAL.")
    public static final SubLObject nth_type_starting_before_end_of_interval_alt(SubLObject interval, SubLObject type, SubLObject n) {
        {
            SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_starting_before_time_point(interval_end, type, n);
        }
    }

    @LispMethod(comment = "Returns the Nth interval of TYPE which starts strictly before the end of INTERVAL.")
    public static SubLObject nth_type_starting_before_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
        return nth_type_starting_before_time_point(interval_end, type, n);
    }/**
     * Returns the Nth interval of TYPE which starts strictly before the end of INTERVAL.
     */


    /**
     * Returns the Nth interval of TYPE which starts no later than the end of INTERVAL.
     */
    @LispMethod(comment = "Returns the Nth interval of TYPE which starts no later than the end of INTERVAL.")
    public static final SubLObject nth_type_starting_no_later_than_end_of_interval_alt(SubLObject interval, SubLObject type, SubLObject n) {
        {
            SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_starting_no_later_than_time_point(interval_end, type, n);
        }
    }

    @LispMethod(comment = "Returns the Nth interval of TYPE which starts no later than the end of INTERVAL.")
    public static SubLObject nth_type_starting_no_later_than_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
        return nth_type_starting_no_later_than_time_point(interval_end, type, n);
    }/**
     * Returns the Nth interval of TYPE which starts no later than the end of INTERVAL.
     */


    /**
     * Returns the Nth interval of TYPE which starts strictly after the end of INTERVAL.
     */
    @LispMethod(comment = "Returns the Nth interval of TYPE which starts strictly after the end of INTERVAL.")
    public static final SubLObject nth_type_starting_after_end_of_interval_alt(SubLObject interval, SubLObject type, SubLObject n) {
        {
            SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_starting_after_time_point(interval_end, type, n);
        }
    }

    @LispMethod(comment = "Returns the Nth interval of TYPE which starts strictly after the end of INTERVAL.")
    public static SubLObject nth_type_starting_after_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
        return nth_type_starting_after_time_point(interval_end, type, n);
    }/**
     * Returns the Nth interval of TYPE which starts strictly after the end of INTERVAL.
     */


    /**
     * Returns the Nth interval of TYPE which starts no earlier than the end of INTERVAL.
     */
    @LispMethod(comment = "Returns the Nth interval of TYPE which starts no earlier than the end of INTERVAL.")
    public static final SubLObject nth_type_starting_no_earlier_than_end_of_interval_alt(SubLObject interval, SubLObject type, SubLObject n) {
        {
            SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_starting_no_earlier_than_time_point(interval_end, type, n);
        }
    }

    @LispMethod(comment = "Returns the Nth interval of TYPE which starts no earlier than the end of INTERVAL.")
    public static SubLObject nth_type_starting_no_earlier_than_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
        return nth_type_starting_no_earlier_than_time_point(interval_end, type, n);
    }/**
     * Returns the Nth interval of TYPE which starts no earlier than the end of INTERVAL.
     */


    /**
     * Returns the Nth interval of TYPE which ends strictly before the start of INTERVAL.
     */
    @LispMethod(comment = "Returns the Nth interval of TYPE which ends strictly before the start of INTERVAL.")
    public static final SubLObject nth_type_ending_before_start_of_interval_alt(SubLObject interval, SubLObject type, SubLObject n) {
        {
            SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_ending_before_time_point(interval_start, type, n);
        }
    }

    @LispMethod(comment = "Returns the Nth interval of TYPE which ends strictly before the start of INTERVAL.")
    public static SubLObject nth_type_ending_before_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
        return nth_type_ending_before_time_point(interval_start, type, n);
    }/**
     * Returns the Nth interval of TYPE which ends strictly before the start of INTERVAL.
     */


    /**
     * Returns the Nth interval of TYPE which ends no later than the start of INTERVAL.
     */
    @LispMethod(comment = "Returns the Nth interval of TYPE which ends no later than the start of INTERVAL.")
    public static final SubLObject nth_type_ending_no_later_than_start_of_interval_alt(SubLObject interval, SubLObject type, SubLObject n) {
        {
            SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_starting_no_later_than_time_point(interval_start, type, n);
        }
    }

    @LispMethod(comment = "Returns the Nth interval of TYPE which ends no later than the start of INTERVAL.")
    public static SubLObject nth_type_ending_no_later_than_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
        return nth_type_starting_no_later_than_time_point(interval_start, type, n);
    }/**
     * Returns the Nth interval of TYPE which ends no later than the start of INTERVAL.
     */


    /**
     * Returns the Nth interval of TYPE which ends strictly after the start of INTERVAL.
     */
    @LispMethod(comment = "Returns the Nth interval of TYPE which ends strictly after the start of INTERVAL.")
    public static final SubLObject nth_type_ending_after_start_of_interval_alt(SubLObject interval, SubLObject type, SubLObject n) {
        {
            SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_ending_after_time_point(interval_start, type, n);
        }
    }

    @LispMethod(comment = "Returns the Nth interval of TYPE which ends strictly after the start of INTERVAL.")
    public static SubLObject nth_type_ending_after_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
        return nth_type_ending_after_time_point(interval_start, type, n);
    }/**
     * Returns the Nth interval of TYPE which ends strictly after the start of INTERVAL.
     */


    /**
     * Returns the Nth interval of TYPE which ends no earlier than the start of INTERVAL.
     */
    @LispMethod(comment = "Returns the Nth interval of TYPE which ends no earlier than the start of INTERVAL.")
    public static final SubLObject nth_type_ending_no_earlier_than_start_of_interval_alt(SubLObject interval, SubLObject type, SubLObject n) {
        {
            SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_ending_no_earlier_than_time_point(interval_start, type, n);
        }
    }

    @LispMethod(comment = "Returns the Nth interval of TYPE which ends no earlier than the start of INTERVAL.")
    public static SubLObject nth_type_ending_no_earlier_than_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second(interval);
        return nth_type_ending_no_earlier_than_time_point(interval_start, type, n);
    }/**
     * Returns the Nth interval of TYPE which ends no earlier than the start of INTERVAL.
     */


    /**
     * Returns the Nth interval of TYPE which ends strictly before the end of INTERVAL.
     */
    @LispMethod(comment = "Returns the Nth interval of TYPE which ends strictly before the end of INTERVAL.")
    public static final SubLObject nth_type_ending_before_end_of_interval_alt(SubLObject interval, SubLObject type, SubLObject n) {
        {
            SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_ending_before_time_point(interval_end, type, n);
        }
    }

    @LispMethod(comment = "Returns the Nth interval of TYPE which ends strictly before the end of INTERVAL.")
    public static SubLObject nth_type_ending_before_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
        return nth_type_ending_before_time_point(interval_end, type, n);
    }/**
     * Returns the Nth interval of TYPE which ends strictly before the end of INTERVAL.
     */


    /**
     * Returns the Nth interval of TYPE which ends no later than the end of INTERVAL.
     */
    @LispMethod(comment = "Returns the Nth interval of TYPE which ends no later than the end of INTERVAL.")
    public static final SubLObject nth_type_ending_no_later_than_end_of_interval_alt(SubLObject interval, SubLObject type, SubLObject n) {
        {
            SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_ending_no_later_than_time_point(interval_end, type, n);
        }
    }

    @LispMethod(comment = "Returns the Nth interval of TYPE which ends no later than the end of INTERVAL.")
    public static SubLObject nth_type_ending_no_later_than_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
        return nth_type_ending_no_later_than_time_point(interval_end, type, n);
    }/**
     * Returns the Nth interval of TYPE which ends no later than the end of INTERVAL.
     */


    /**
     * Returns the Nth interval of TYPE which ends strictly after the end of INTERVAL.
     */
    @LispMethod(comment = "Returns the Nth interval of TYPE which ends strictly after the end of INTERVAL.")
    public static final SubLObject nth_type_ending_after_end_of_interval_alt(SubLObject interval, SubLObject type, SubLObject n) {
        {
            SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_ending_after_time_point(interval_end, type, n);
        }
    }

    @LispMethod(comment = "Returns the Nth interval of TYPE which ends strictly after the end of INTERVAL.")
    public static SubLObject nth_type_ending_after_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
        return nth_type_ending_after_time_point(interval_end, type, n);
    }/**
     * Returns the Nth interval of TYPE which ends strictly after the end of INTERVAL.
     */


    /**
     * Returns the Nth interval of TYPE which ends no earlier than the end of INTERVAL.
     */
    @LispMethod(comment = "Returns the Nth interval of TYPE which ends no earlier than the end of INTERVAL.")
    public static final SubLObject nth_type_ending_no_earlier_than_end_of_interval_alt(SubLObject interval, SubLObject type, SubLObject n) {
        {
            SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_ending_no_earlier_than_time_point(interval_end, type, n);
        }
    }

    @LispMethod(comment = "Returns the Nth interval of TYPE which ends no earlier than the end of INTERVAL.")
    public static SubLObject nth_type_ending_no_earlier_than_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n) {
        final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second(interval);
        return nth_type_ending_no_earlier_than_time_point(interval_end, type, n);
    }/**
     * Returns the Nth interval of TYPE which ends no earlier than the end of INTERVAL.
     */


    public static final SubLObject nth_type_starting_before_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        {
            SubLObject new_time_point = time_interval_utilities.preceding_cycl_date(time_point);
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_starting_no_later_than_time_point(new_time_point, type, n);
        }
    }

    public static SubLObject nth_type_starting_before_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject new_time_point = time_interval_utilities.preceding_cycl_date(time_point);
        return nth_type_starting_no_later_than_time_point(new_time_point, type, n);
    }

    public static final SubLObject nth_type_starting_no_later_than_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.time_point_type_p(type)) {
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_time_point_no_later_than_time_point(time_point, n);
        } else {
            if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.covering_time_type_p(type)) {
                return com.cyc.cycjava.cycl.time_parameter_utilities.nth_covering_time_type_starting_no_later_than_time_point(time_point, type, n);
            } else {
                if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.gappy_time_type_p(type)) {
                    return com.cyc.cycjava.cycl.time_parameter_utilities.nth_gappy_time_type_starting_no_later_than_time_point(time_point, type, n);
                } else {
                    return Errors.error($str_alt54$Unknown_time_type__a_, type);
                }
            }
        }
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

    public static final SubLObject nth_type_starting_after_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        {
            SubLObject new_time_point = time_interval_utilities.succeeding_cycl_date(time_point);
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_starting_no_earlier_than_time_point(new_time_point, type, n);
        }
    }

    public static SubLObject nth_type_starting_after_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject new_time_point = time_interval_utilities.succeeding_cycl_date(time_point);
        return nth_type_starting_no_earlier_than_time_point(new_time_point, type, n);
    }

    public static final SubLObject nth_type_starting_no_earlier_than_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.time_point_type_p(type)) {
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_time_point_no_earlier_than_time_point(time_point, n);
        } else {
            if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.covering_time_type_p(type)) {
                return com.cyc.cycjava.cycl.time_parameter_utilities.nth_covering_time_type_starting_no_earlier_than_time_point(time_point, type, n);
            } else {
                if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.gappy_time_type_p(type)) {
                    return com.cyc.cycjava.cycl.time_parameter_utilities.nth_gappy_time_type_starting_no_earlier_than_time_point(time_point, type, n);
                } else {
                    return Errors.error($str_alt54$Unknown_time_type__a_, type);
                }
            }
        }
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

    public static final SubLObject nth_type_ending_before_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        {
            SubLObject new_time_point = time_interval_utilities.preceding_cycl_date(time_point);
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_ending_no_later_than_time_point(new_time_point, type, n);
        }
    }

    public static SubLObject nth_type_ending_before_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject new_time_point = time_interval_utilities.preceding_cycl_date(time_point);
        return nth_type_ending_no_later_than_time_point(new_time_point, type, n);
    }

    public static final SubLObject nth_type_ending_no_later_than_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.time_point_type_p(type)) {
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_time_point_no_later_than_time_point(time_point, n);
        } else {
            if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.covering_time_type_p(type)) {
                return com.cyc.cycjava.cycl.time_parameter_utilities.nth_covering_time_type_ending_no_later_than_time_point(time_point, type, n);
            } else {
                if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.gappy_time_type_p(type)) {
                    return com.cyc.cycjava.cycl.time_parameter_utilities.nth_gappy_time_type_ending_no_later_than_time_point(time_point, type, n);
                } else {
                    return Errors.error($str_alt54$Unknown_time_type__a_, type);
                }
            }
        }
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

    public static final SubLObject nth_type_ending_after_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        {
            SubLObject new_time_point = time_interval_utilities.succeeding_cycl_date(time_point);
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_type_ending_no_earlier_than_time_point(new_time_point, type, n);
        }
    }

    public static SubLObject nth_type_ending_after_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject new_time_point = time_interval_utilities.succeeding_cycl_date(time_point);
        return nth_type_ending_no_earlier_than_time_point(new_time_point, type, n);
    }

    public static final SubLObject nth_type_ending_no_earlier_than_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.time_point_type_p(type)) {
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_time_point_no_earlier_than_time_point(time_point, n);
        } else {
            if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.covering_time_type_p(type)) {
                return com.cyc.cycjava.cycl.time_parameter_utilities.nth_covering_time_type_ending_no_earlier_than_time_point(time_point, type, n);
            } else {
                if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.gappy_time_type_p(type)) {
                    return com.cyc.cycjava.cycl.time_parameter_utilities.nth_gappy_time_type_ending_no_earlier_than_time_point(time_point, type, n);
                } else {
                    return Errors.error($str_alt54$Unknown_time_type__a_, type);
                }
            }
        }
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

    public static final SubLObject nth_time_point_no_later_than_time_point_alt(SubLObject time_point, SubLObject n) {
        return date_utilities.date_before(time_point, list($$SecondsDuration, n));
    }

    public static SubLObject nth_time_point_no_later_than_time_point(final SubLObject time_point, final SubLObject n) {
        return date_utilities.date_before(time_point, list($$SecondsDuration, n));
    }

    public static final SubLObject nth_time_point_no_earlier_than_time_point_alt(SubLObject time_point, SubLObject n) {
        return date_utilities.date_after(time_point, list($$SecondsDuration, n));
    }

    public static SubLObject nth_time_point_no_earlier_than_time_point(final SubLObject time_point, final SubLObject n) {
        return date_utilities.date_after(time_point, list($$SecondsDuration, n));
    }

    public static final SubLObject nth_covering_time_type_starting_no_later_than_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        {
            SubLObject pcase_var = type;
            if (pcase_var.eql($$CalendarSecond)) {
                return date_utilities.date_before(time_point, list($$SecondsDuration, n));
            } else {
                if ((((pcase_var.eql($$CalendarMinute) || pcase_var.eql($$CalendarHour)) || pcase_var.eql($$CalendarDay)) || pcase_var.eql($$CalendarMonth)) || pcase_var.eql($$CalendarYear)) {
                    return date_utilities.date_before(date_utilities.date_to_precision(time_point, type), com.cyc.cycjava.cycl.time_parameter_utilities.scale_duration(com.cyc.cycjava.cycl.time_parameter_utilities.covering_type_duration(type), n));
                } else {
                    if (pcase_var.eql($$CalendarWeek)) {
                        {
                            SubLObject start = com.cyc.cycjava.cycl.time_parameter_utilities.nth_gappy_time_type_starting_no_later_than_time_point(time_point, $$Sunday, n);
                            SubLObject end = date_utilities.date_after(start, $list_alt56);
                            return list($$TimeIntervalInclusiveFn, start, end);
                        }
                    } else {
                        if (pcase_var.eql($$CalendarQuarter)) {
                            return date_utilities.date_before(date_utilities.truncate_date_to_format(time_point, $QUARTER), com.cyc.cycjava.cycl.time_parameter_utilities.scale_duration(com.cyc.cycjava.cycl.time_parameter_utilities.covering_type_duration(type), n));
                        } else {
                            if (pcase_var.eql($$CalendarDecade)) {
                                return date_utilities.date_before(date_utilities.truncate_date_to_format(time_point, $DECADE), com.cyc.cycjava.cycl.time_parameter_utilities.scale_duration(com.cyc.cycjava.cycl.time_parameter_utilities.covering_type_duration(type), n));
                            } else {
                                if (pcase_var.eql($$CalendarCentury)) {
                                    return date_utilities.date_before(date_utilities.truncate_date_to_format(time_point, $CENTURY), com.cyc.cycjava.cycl.time_parameter_utilities.scale_duration(com.cyc.cycjava.cycl.time_parameter_utilities.covering_type_duration(type), n));
                                } else {
                                    if (pcase_var.eql($$CalendarHalfCentury)) {
                                        {
                                            SubLObject century = subtract(cycl_utilities.nat_arg1(date_utilities.truncate_date_to_format(time_point, $CENTURY), UNPROVIDED), ONE_INTEGER);
                                            SubLObject year_in_century = mod(date_utilities.extract_date_year(time_point), $int$100);
                                            SubLObject displacement = multiply($int$50, n);
                                            SubLObject start = (year_in_century.isZero() || year_in_century.numG($int$50)) ? ((SubLObject) (subtract(add(multiply(century, $int$100), $int$51), displacement))) : subtract(add(multiply(century, $int$100), ONE_INTEGER), displacement);
                                            SubLObject end = add(start, $int$49);
                                            return list($$TimeIntervalInclusiveFn, list($$YearFn, start), list($$YearFn, end));
                                        }
                                    } else {
                                        if (pcase_var.eql($$CalendarMillennium)) {
                                            {
                                                SubLObject year = date_utilities.extract_date_year(time_point);
                                                SubLObject millenium = integerDivide(subtract(year, ONE_INTEGER), $int$1000);
                                                SubLObject displacement = multiply($int$1000, n);
                                                SubLObject start = subtract(add(multiply(millenium, $int$1000), ONE_INTEGER), displacement);
                                                SubLObject end = add(start, $int$999);
                                                return list($$TimeIntervalInclusiveFn, list($$YearFn, start), list($$YearFn, end));
                                            }
                                        } else {
                                            return Errors.error($str_alt65$No_support_for_type__a_, type);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
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

    public static final SubLObject nth_covering_time_type_starting_no_earlier_than_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        {
            SubLObject pcase_var = type;
            if (pcase_var.eql($$CalendarSecond)) {
                return date_utilities.date_after(time_point, list($$SecondsDuration, n));
            } else {
                if ((((pcase_var.eql($$CalendarMinute) || pcase_var.eql($$CalendarHour)) || pcase_var.eql($$CalendarDay)) || pcase_var.eql($$CalendarMonth)) || pcase_var.eql($$CalendarYear)) {
                    return NIL != com.cyc.cycjava.cycl.time_parameter_utilities.first_moment_of_covering_type_p(type, time_point) ? ((SubLObject) (date_utilities.date_after(date_utilities.date_to_precision(time_point, type), com.cyc.cycjava.cycl.time_parameter_utilities.scale_duration(com.cyc.cycjava.cycl.time_parameter_utilities.covering_type_duration(type), n)))) : date_utilities.date_after(date_utilities.date_to_precision(time_point, type), com.cyc.cycjava.cycl.time_parameter_utilities.scale_duration(com.cyc.cycjava.cycl.time_parameter_utilities.covering_type_duration(type), number_utilities.f_1X(n)));
                } else {
                    if (pcase_var.eql($$CalendarWeek)) {
                        {
                            SubLObject start = com.cyc.cycjava.cycl.time_parameter_utilities.nth_gappy_time_type_starting_no_earlier_than_time_point(time_point, $$Sunday, n);
                            SubLObject end = date_utilities.date_after(start, $list_alt56);
                            return list($$TimeIntervalInclusiveFn, start, end);
                        }
                    } else {
                        if (pcase_var.eql($$CalendarQuarter)) {
                            return NIL != com.cyc.cycjava.cycl.time_parameter_utilities.first_moment_of_covering_type_p(type, time_point) ? ((SubLObject) (date_utilities.date_after(date_utilities.truncate_date_to_format(time_point, $QUARTER), com.cyc.cycjava.cycl.time_parameter_utilities.scale_duration(com.cyc.cycjava.cycl.time_parameter_utilities.covering_type_duration(type), n)))) : date_utilities.date_after(date_utilities.truncate_date_to_format(time_point, $QUARTER), com.cyc.cycjava.cycl.time_parameter_utilities.scale_duration(com.cyc.cycjava.cycl.time_parameter_utilities.covering_type_duration(type), number_utilities.f_1X(n)));
                        } else {
                            if (pcase_var.eql($$CalendarDecade)) {
                                return NIL != com.cyc.cycjava.cycl.time_parameter_utilities.first_moment_of_covering_type_p(type, time_point) ? ((SubLObject) (date_utilities.date_after(date_utilities.truncate_date_to_format(time_point, $DECADE), com.cyc.cycjava.cycl.time_parameter_utilities.scale_duration(com.cyc.cycjava.cycl.time_parameter_utilities.covering_type_duration(type), n)))) : date_utilities.date_after(date_utilities.truncate_date_to_format(time_point, $DECADE), com.cyc.cycjava.cycl.time_parameter_utilities.scale_duration(com.cyc.cycjava.cycl.time_parameter_utilities.covering_type_duration(type), number_utilities.f_1X(n)));
                            } else {
                                if (pcase_var.eql($$CalendarCentury)) {
                                    return NIL != com.cyc.cycjava.cycl.time_parameter_utilities.first_moment_of_covering_type_p(type, time_point) ? ((SubLObject) (date_utilities.date_after(date_utilities.truncate_date_to_format(time_point, $CENTURY), com.cyc.cycjava.cycl.time_parameter_utilities.scale_duration(com.cyc.cycjava.cycl.time_parameter_utilities.covering_type_duration(type), n)))) : date_utilities.date_after(date_utilities.truncate_date_to_format(time_point, $CENTURY), com.cyc.cycjava.cycl.time_parameter_utilities.scale_duration(com.cyc.cycjava.cycl.time_parameter_utilities.covering_type_duration(type), number_utilities.f_1X(n)));
                                } else {
                                    if (pcase_var.eql($$CalendarHalfCentury)) {
                                        {
                                            SubLObject beginning_of_yearP = com.cyc.cycjava.cycl.time_parameter_utilities.first_moment_of_covering_type_p($$CalendarYear, time_point);
                                            SubLObject century = subtract(cycl_utilities.nat_arg1(date_utilities.truncate_date_to_format(time_point, $CENTURY), UNPROVIDED), ONE_INTEGER);
                                            SubLObject year_in_century = mod(date_utilities.extract_date_year(time_point), $int$100);
                                            SubLObject displacement = multiply($int$50, year_in_century.numE(ONE_INTEGER) && (NIL != beginning_of_yearP) ? ((SubLObject) (n)) : year_in_century.numL($int$51) || (year_in_century.numE($int$51) && (NIL != beginning_of_yearP)) ? ((SubLObject) (add(n, ONE_INTEGER))) : add(n, TWO_INTEGER));
                                            SubLObject start = add(multiply(century, $int$100), ONE_INTEGER, displacement);
                                            SubLObject end = add(start, $int$49);
                                            return list($$TimeIntervalInclusiveFn, list($$YearFn, start), list($$YearFn, end));
                                        }
                                    } else {
                                        if (pcase_var.eql($$CalendarMillennium)) {
                                            {
                                                SubLObject beginning_of_yearP = com.cyc.cycjava.cycl.time_parameter_utilities.first_moment_of_covering_type_p($$CalendarYear, time_point);
                                                SubLObject year = date_utilities.extract_date_year(time_point);
                                                SubLObject millenium = integerDivide(subtract(year, ONE_INTEGER), $int$1000);
                                                SubLObject displacement = multiply($int$1000, mod(year, $int$1000).numE(ONE_INTEGER) && (NIL != beginning_of_yearP) ? ((SubLObject) (n)) : add(n, ONE_INTEGER));
                                                SubLObject start = add(multiply(millenium, $int$1000), ONE_INTEGER, displacement);
                                                SubLObject end = add(start, $int$999);
                                                return list($$TimeIntervalInclusiveFn, list($$YearFn, start), list($$YearFn, end));
                                            }
                                        } else {
                                            return Errors.error($str_alt65$No_support_for_type__a_, type);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
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

    public static final SubLObject nth_covering_time_type_ending_no_later_than_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        {
            SubLObject reference_interval = com.cyc.cycjava.cycl.time_parameter_utilities.nth_covering_time_type_starting_no_later_than_time_point(time_point, type, ZERO_INTEGER);
            return NIL != date_utilities.dateL(time_point, time_interval_utilities.cycl_interval_final_second(reference_interval)) ? ((SubLObject) (com.cyc.cycjava.cycl.time_parameter_utilities.nth_covering_time_type_starting_no_later_than_time_point(time_point, type, add(n, ONE_INTEGER)))) : com.cyc.cycjava.cycl.time_parameter_utilities.nth_covering_time_type_starting_no_later_than_time_point(time_point, type, n);
        }
    }

    public static SubLObject nth_covering_time_type_ending_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject reference_interval = nth_covering_time_type_starting_no_later_than_time_point(time_point, type, ZERO_INTEGER);
        return NIL != date_utilities.dateL(time_point, time_interval_utilities.cycl_interval_final_second(reference_interval)) ? nth_covering_time_type_starting_no_later_than_time_point(time_point, type, add(n, ONE_INTEGER)) : nth_covering_time_type_starting_no_later_than_time_point(time_point, type, n);
    }

    public static final SubLObject nth_covering_time_type_ending_no_earlier_than_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        {
            SubLObject reference_interval = com.cyc.cycjava.cycl.time_parameter_utilities.nth_covering_time_type_starting_no_later_than_time_point(time_point, type, ZERO_INTEGER);
            return NIL != date_utilities.dateL(time_interval_utilities.cycl_interval_final_second(reference_interval), time_point) ? ((SubLObject) (com.cyc.cycjava.cycl.time_parameter_utilities.nth_covering_time_type_starting_no_earlier_than_time_point(time_point, type, n))) : com.cyc.cycjava.cycl.time_parameter_utilities.nth_covering_time_type_starting_no_earlier_than_time_point(time_point, type, subtract(n, ONE_INTEGER));
        }
    }

    public static SubLObject nth_covering_time_type_ending_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject reference_interval = nth_covering_time_type_starting_no_later_than_time_point(time_point, type, ZERO_INTEGER);
        return NIL != date_utilities.dateL(time_interval_utilities.cycl_interval_final_second(reference_interval), time_point) ? nth_covering_time_type_starting_no_earlier_than_time_point(time_point, type, n) : nth_covering_time_type_starting_no_earlier_than_time_point(time_point, type, subtract(n, ONE_INTEGER));
    }

    public static final SubLObject nth_gappy_time_type_starting_no_later_than_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.month_of_year_typeP(type)) {
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_month_of_year_type_starting_no_later_than_time_point(time_point, type, n);
        } else {
            if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.day_of_week_typeP(type)) {
                return com.cyc.cycjava.cycl.time_parameter_utilities.nth_day_of_week_type_starting_no_later_than_time_point(time_point, type, n);
            } else {
                if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.hour_of_day_typeP(type)) {
                    return com.cyc.cycjava.cycl.time_parameter_utilities.nth_hour_of_day_type_starting_no_later_than_time_point(time_point, type, n);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.day_of_year_typeP(type)) {
                        return com.cyc.cycjava.cycl.time_parameter_utilities.nth_day_of_year_type_starting_no_later_than_time_point(time_point, type, n);
                    } else {
                        {
                            SubLObject pcase_var = type;
                            if (pcase_var.eql($$CalendarWorkWeek)) {
                                {
                                    SubLObject start = com.cyc.cycjava.cycl.time_parameter_utilities.nth_gappy_time_type_starting_no_later_than_time_point(time_point, $$Monday, n);
                                    SubLObject end = date_utilities.date_after(start, $list_alt68);
                                    return list($$TimeIntervalInclusiveFn, start, end);
                                }
                            } else {
                                if (pcase_var.eql($$CalendarWeekend)) {
                                    {
                                        SubLObject start = com.cyc.cycjava.cycl.time_parameter_utilities.nth_gappy_time_type_starting_no_later_than_time_point(time_point, $$Saturday, n);
                                        SubLObject end = date_utilities.date_after(start, $list_alt71);
                                        return list($$TimeIntervalInclusiveFn, start, end);
                                    }
                                } else {
                                    if (pcase_var.eql($$Weekday)) {
                                        return com.cyc.cycjava.cycl.time_parameter_utilities.nth_weekday_starting_no_later_than_time_point(time_point, n);
                                    } else {
                                        return Errors.error($str_alt65$No_support_for_type__a_, type);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
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

    public static final SubLObject nth_gappy_time_type_starting_no_earlier_than_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.month_of_year_typeP(type)) {
            return com.cyc.cycjava.cycl.time_parameter_utilities.nth_month_of_year_type_starting_no_earlier_than_time_point(time_point, type, n);
        } else {
            if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.day_of_week_typeP(type)) {
                return com.cyc.cycjava.cycl.time_parameter_utilities.nth_day_of_week_type_starting_no_earlier_than_time_point(time_point, type, n);
            } else {
                if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.hour_of_day_typeP(type)) {
                    return com.cyc.cycjava.cycl.time_parameter_utilities.nth_hour_of_day_type_starting_no_earlier_than_time_point(time_point, type, n);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.time_parameter_utilities.day_of_year_typeP(type)) {
                        return com.cyc.cycjava.cycl.time_parameter_utilities.nth_day_of_year_type_starting_no_earlier_than_time_point(time_point, type, n);
                    } else {
                        {
                            SubLObject pcase_var = type;
                            if (pcase_var.eql($$CalendarWorkWeek)) {
                                {
                                    SubLObject start = com.cyc.cycjava.cycl.time_parameter_utilities.nth_gappy_time_type_starting_no_earlier_than_time_point(time_point, $$Monday, n);
                                    SubLObject end = date_utilities.date_after(start, $list_alt68);
                                    return list($$TimeIntervalInclusiveFn, start, end);
                                }
                            } else {
                                if (pcase_var.eql($$CalendarWeekend)) {
                                    {
                                        SubLObject start = com.cyc.cycjava.cycl.time_parameter_utilities.nth_gappy_time_type_starting_no_earlier_than_time_point(time_point, $$Saturday, n);
                                        SubLObject end = date_utilities.date_after(start, $list_alt71);
                                        return list($$TimeIntervalInclusiveFn, start, end);
                                    }
                                } else {
                                    if (pcase_var.eql($$Weekday)) {
                                        return com.cyc.cycjava.cycl.time_parameter_utilities.nth_weekday_starting_no_earlier_than_time_point(time_point, n);
                                    } else {
                                        return Errors.error($str_alt65$No_support_for_type__a_, type);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
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

    public static final SubLObject nth_gappy_time_type_ending_no_later_than_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        {
            SubLObject reference_interval = com.cyc.cycjava.cycl.time_parameter_utilities.nth_gappy_time_type_starting_no_later_than_time_point(time_point, type, ZERO_INTEGER);
            return NIL != date_utilities.dateL(time_point, time_interval_utilities.cycl_interval_final_second(reference_interval)) ? ((SubLObject) (com.cyc.cycjava.cycl.time_parameter_utilities.nth_gappy_time_type_starting_no_later_than_time_point(time_point, type, add(n, ONE_INTEGER)))) : com.cyc.cycjava.cycl.time_parameter_utilities.nth_gappy_time_type_starting_no_later_than_time_point(time_point, type, n);
        }
    }

    public static SubLObject nth_gappy_time_type_ending_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject reference_interval = nth_gappy_time_type_starting_no_later_than_time_point(time_point, type, ZERO_INTEGER);
        return NIL != date_utilities.dateL(time_point, time_interval_utilities.cycl_interval_final_second(reference_interval)) ? nth_gappy_time_type_starting_no_later_than_time_point(time_point, type, add(n, ONE_INTEGER)) : nth_gappy_time_type_starting_no_later_than_time_point(time_point, type, n);
    }

    public static final SubLObject nth_gappy_time_type_ending_no_earlier_than_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        {
            SubLObject reference_interval = com.cyc.cycjava.cycl.time_parameter_utilities.nth_gappy_time_type_starting_no_later_than_time_point(time_point, type, ZERO_INTEGER);
            return NIL != date_utilities.dateL(time_interval_utilities.cycl_interval_final_second(reference_interval), time_point) ? ((SubLObject) (com.cyc.cycjava.cycl.time_parameter_utilities.nth_gappy_time_type_starting_no_earlier_than_time_point(time_point, type, n))) : com.cyc.cycjava.cycl.time_parameter_utilities.nth_gappy_time_type_starting_no_earlier_than_time_point(time_point, type, subtract(n, ONE_INTEGER));
        }
    }

    public static SubLObject nth_gappy_time_type_ending_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject reference_interval = nth_gappy_time_type_starting_no_later_than_time_point(time_point, type, ZERO_INTEGER);
        return NIL != date_utilities.dateL(time_interval_utilities.cycl_interval_final_second(reference_interval), time_point) ? nth_gappy_time_type_starting_no_earlier_than_time_point(time_point, type, n) : nth_gappy_time_type_starting_no_earlier_than_time_point(time_point, type, subtract(n, ONE_INTEGER));
    }

    public static final SubLObject nth_month_of_year_type_starting_no_later_than_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        if (NIL == date_utilities.month_term_p(type)) {
            return Errors.error($str_alt65$No_support_for_type__a_, type);
        }
        {
            SubLObject date_month_number = date_utilities.extract_date_month_number(time_point);
            SubLObject date_year = date_utilities.extract_date_year(time_point);
            SubLObject type_month_number = date_utilities.number_of_month(type);
            SubLObject displacement = (type_month_number.numG(date_month_number)) ? ((SubLObject) (number_utilities.f_1X(n))) : n;
            return date_utilities.construct_calendar_date(subtract(date_year, displacement), type_month_number, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
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

    public static final SubLObject nth_month_of_year_type_starting_no_earlier_than_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        if (NIL == date_utilities.month_term_p(type)) {
            return Errors.error($str_alt65$No_support_for_type__a_, type);
        }
        {
            SubLObject beginning_of_monthP = com.cyc.cycjava.cycl.time_parameter_utilities.first_moment_of_covering_type_p($$CalendarMonth, time_point);
            SubLObject date_month_number = date_utilities.extract_date_month_number(time_point);
            SubLObject date_year = date_utilities.extract_date_year(time_point);
            SubLObject type_month_number = date_utilities.number_of_month(type);
            SubLObject displacement = (type_month_number.numG(date_month_number) || (type_month_number.numE(date_month_number) && (NIL != beginning_of_monthP))) ? ((SubLObject) (n)) : number_utilities.f_1X(n);
            return date_utilities.construct_calendar_date(add(date_year, displacement), type_month_number, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
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

    public static final SubLObject nth_day_of_week_type_starting_no_later_than_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        {
            SubLObject date_day_of_week = date_utilities.day_of_week_of_date(time_point);
            SubLObject date_day_num = date_utilities.number_of_day_of_week(date_day_of_week);
            SubLObject type_day_num = date_utilities.number_of_day_of_week(type);
            SubLObject displacement = (type_day_num.numG(date_day_num)) ? ((SubLObject) (add(multiply(number_utilities.f_1X(n), SEVEN_INTEGER), subtract(date_day_num, type_day_num)))) : add(multiply(n, SEVEN_INTEGER), subtract(date_day_num, type_day_num));
            return date_utilities.date_before(date_utilities.date_to_precision(time_point, $$CalendarDay), list($$DaysDuration, displacement));
        }
    }

    public static SubLObject nth_day_of_week_type_starting_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject date_day_of_week = date_utilities.day_of_week_of_date(time_point);
        final SubLObject date_day_num = date_utilities.number_of_day_of_week(date_day_of_week);
        final SubLObject type_day_num = date_utilities.number_of_day_of_week(type);
        final SubLObject displacement = (type_day_num.numG(date_day_num)) ? add(multiply(number_utilities.f_1X(n), SEVEN_INTEGER), subtract(date_day_num, type_day_num)) : add(multiply(n, SEVEN_INTEGER), subtract(date_day_num, type_day_num));
        return date_utilities.date_before(date_utilities.date_to_precision(time_point, $$CalendarDay, UNPROVIDED), list($$DaysDuration, displacement));
    }

    public static final SubLObject nth_day_of_week_type_starting_no_earlier_than_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        {
            SubLObject beginning_of_dayP = com.cyc.cycjava.cycl.time_parameter_utilities.first_moment_of_covering_type_p($$CalendarDay, time_point);
            SubLObject date_day_of_week = date_utilities.day_of_week_of_date(time_point);
            SubLObject date_day_num = date_utilities.number_of_day_of_week(date_day_of_week);
            SubLObject type_day_num = date_utilities.number_of_day_of_week(type);
            SubLObject displacement = (type_day_num.numG(date_day_num) || (type_day_num.numE(date_day_num) && (NIL != beginning_of_dayP))) ? ((SubLObject) (add(multiply(n, SEVEN_INTEGER), subtract(type_day_num, date_day_num)))) : add(multiply(number_utilities.f_1X(n), SEVEN_INTEGER), subtract(type_day_num, date_day_num));
            return date_utilities.date_after(date_utilities.date_to_precision(time_point, $$CalendarDay), list($$DaysDuration, displacement));
        }
    }

    public static SubLObject nth_day_of_week_type_starting_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject beginning_of_dayP = first_moment_of_covering_type_p($$CalendarDay, time_point);
        final SubLObject date_day_of_week = date_utilities.day_of_week_of_date(time_point);
        final SubLObject date_day_num = date_utilities.number_of_day_of_week(date_day_of_week);
        final SubLObject type_day_num = date_utilities.number_of_day_of_week(type);
        final SubLObject displacement = (type_day_num.numG(date_day_num) || (type_day_num.numE(date_day_num) && (NIL != beginning_of_dayP))) ? add(multiply(n, SEVEN_INTEGER), subtract(type_day_num, date_day_num)) : add(multiply(number_utilities.f_1X(n), SEVEN_INTEGER), subtract(type_day_num, date_day_num));
        return date_utilities.date_after(date_utilities.date_to_precision(time_point, $$CalendarDay, UNPROVIDED), list($$DaysDuration, displacement));
    }

    public static final SubLObject nth_hour_of_day_type_starting_no_later_than_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        {
            SubLObject date_hour = date_utilities.extract_date_hour(time_point);
            SubLObject type_hour = date_utilities.number_of_hour_of_day(type);
            SubLObject displacement = (type_hour.numG(date_hour)) ? ((SubLObject) (number_utilities.f_1X(n))) : n;
            SubLObject new_day = date_utilities.date_before(date_utilities.date_to_precision(time_point, $$CalendarDay), list($$DaysDuration, displacement));
            return list($$HourFn, type_hour, new_day);
        }
    }

    public static SubLObject nth_hour_of_day_type_starting_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject date_hour = date_utilities.extract_date_hour(time_point);
        final SubLObject type_hour = date_utilities.number_of_hour_of_day(type);
        final SubLObject displacement = (type_hour.numG(date_hour)) ? number_utilities.f_1X(n) : n;
        final SubLObject new_day = date_utilities.date_before(date_utilities.date_to_precision(time_point, $$CalendarDay, UNPROVIDED), list($$DaysDuration, displacement));
        return list($$HourFn, type_hour, new_day);
    }

    public static final SubLObject nth_hour_of_day_type_starting_no_earlier_than_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        {
            SubLObject beginning_of_hourP = com.cyc.cycjava.cycl.time_parameter_utilities.first_moment_of_covering_type_p($$CalendarHour, time_point);
            SubLObject date_hour = date_utilities.extract_date_hour(time_point);
            SubLObject type_hour = date_utilities.number_of_hour_of_day(type);
            SubLObject displacement = (type_hour.numG(date_hour) || (type_hour.numE(date_hour) && (NIL != beginning_of_hourP))) ? ((SubLObject) (n)) : number_utilities.f_1X(n);
            SubLObject new_day = date_utilities.date_after(date_utilities.date_to_precision(time_point, $$CalendarDay), list($$DaysDuration, displacement));
            return list($$HourFn, type_hour, new_day);
        }
    }

    public static SubLObject nth_hour_of_day_type_starting_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n) {
        final SubLObject beginning_of_hourP = first_moment_of_covering_type_p($$CalendarHour, time_point);
        final SubLObject date_hour = date_utilities.extract_date_hour(time_point);
        final SubLObject type_hour = date_utilities.number_of_hour_of_day(type);
        final SubLObject displacement = (type_hour.numG(date_hour) || (type_hour.numE(date_hour) && (NIL != beginning_of_hourP))) ? n : number_utilities.f_1X(n);
        final SubLObject new_day = date_utilities.date_after(date_utilities.date_to_precision(time_point, $$CalendarDay, UNPROVIDED), list($$DaysDuration, displacement));
        return list($$HourFn, type_hour, new_day);
    }

    public static final SubLObject nth_day_of_year_type_starting_no_later_than_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        if (NIL == com.cyc.cycjava.cycl.time_parameter_utilities.day_of_year_nat_p(type)) {
            return Errors.error($str_alt65$No_support_for_type__a_, type);
        }
        {
            SubLObject type_day = cycl_utilities.nat_arg2(type, UNPROVIDED);
            SubLObject type_month_num = date_utilities.number_of_month(cycl_utilities.nat_arg1(type, UNPROVIDED));
            SubLObject date_day = date_utilities.extract_date_day(time_point);
            SubLObject date_month_num = date_utilities.extract_date_month_number(time_point);
            SubLObject date_year = date_utilities.extract_date_year(time_point);
            SubLObject displacement = (type_month_num.numG(date_month_num) || (type_month_num.numE(date_month_num) && type_day.numG(date_day))) ? ((SubLObject) (number_utilities.f_1X(n))) : n;
            SubLObject final_year = subtract(date_year, displacement);
            return date_utilities.construct_calendar_date(final_year, type_month_num, type_day, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
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

    public static final SubLObject nth_day_of_year_type_starting_no_earlier_than_time_point_alt(SubLObject time_point, SubLObject type, SubLObject n) {
        if (NIL == com.cyc.cycjava.cycl.time_parameter_utilities.day_of_year_nat_p(type)) {
            return Errors.error($str_alt65$No_support_for_type__a_, type);
        }
        {
            SubLObject beginning_of_dayP = com.cyc.cycjava.cycl.time_parameter_utilities.first_moment_of_covering_type_p($$CalendarDay, time_point);
            SubLObject type_day = cycl_utilities.nat_arg2(type, UNPROVIDED);
            SubLObject type_month_num = date_utilities.number_of_month(cycl_utilities.nat_arg1(type, UNPROVIDED));
            SubLObject date_day = date_utilities.extract_date_day(time_point);
            SubLObject date_month_num = date_utilities.extract_date_month_number(time_point);
            SubLObject date_year = date_utilities.extract_date_year(time_point);
            SubLObject displacement = ((type_month_num.numG(date_month_num) || (type_month_num.numE(date_month_num) && type_day.numG(date_day))) || (type_month_num.numE(date_month_num) && (NIL != beginning_of_dayP))) ? ((SubLObject) (n)) : number_utilities.f_1X(n);
            SubLObject final_year = add(date_year, displacement);
            return date_utilities.construct_calendar_date(final_year, type_month_num, type_day, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
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

    public static final SubLObject nth_weekday_starting_no_later_than_time_point_alt(SubLObject time_point, SubLObject n) {
        {
            SubLObject start_day = date_utilities.date_to_precision(time_point, $$CalendarDay);
            SubLObject start_day_type = date_utilities.day_of_week_of_date(start_day);
            SubLObject first_weekday = NIL;
            SubLObject first_weekday_type = NIL;
            SubLObject pcase_var = start_day_type;
            if (pcase_var.eql($$Saturday)) {
                first_weekday = date_utilities.date_before(start_day, $list_alt71);
                first_weekday_type = $$Friday;
            } else {
                if (pcase_var.eql($$Sunday)) {
                    first_weekday = date_utilities.date_before(start_day, $list_alt75);
                    first_weekday_type = $$Friday;
                } else {
                    first_weekday = start_day;
                    first_weekday_type = start_day_type;
                }
            }
            if (n.isZero()) {
                return first_weekday;
            }
            {
                SubLObject week_displacement = integerDivide(n, FIVE_INTEGER);
                SubLObject day_displacement = mod(n, FIVE_INTEGER);
                SubLObject reference_day = date_utilities.date_before(first_weekday, list($$WeeksDuration, week_displacement));
                SubLObject reference_day_num = subtract(date_utilities.number_of_day_of_week(first_weekday_type), ONE_INTEGER);
                if (day_displacement.isZero()) {
                    return reference_day;
                } else {
                    if (day_displacement.numLE(reference_day_num)) {
                        return date_utilities.date_before(reference_day, list($$DaysDuration, day_displacement));
                    } else {
                        return date_utilities.date_before(reference_day, list($$DaysDuration, add(TWO_INTEGER, day_displacement)));
                    }
                }
            }
        }
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

    public static final SubLObject nth_weekday_starting_no_earlier_than_time_point_alt(SubLObject time_point, SubLObject n) {
        {
            SubLObject beginning_of_dayP = com.cyc.cycjava.cycl.time_parameter_utilities.first_moment_of_covering_type_p($$CalendarDay, time_point);
            SubLObject start_day = date_utilities.date_to_precision(time_point, $$CalendarDay);
            SubLObject start_day_type = date_utilities.day_of_week_of_date(start_day);
            SubLObject first_weekday = NIL;
            SubLObject first_weekday_type = NIL;
            if (NIL == beginning_of_dayP) {
                start_day = date_utilities.date_after(start_day, $list_alt71);
            }
            {
                SubLObject pcase_var = start_day_type;
                if (pcase_var.eql($$Saturday)) {
                    first_weekday = date_utilities.date_after(start_day, $list_alt75);
                    first_weekday_type = $$Monday;
                } else {
                    if (pcase_var.eql($$Sunday)) {
                        first_weekday = date_utilities.date_after(start_day, $list_alt71);
                        first_weekday_type = $$Monday;
                    } else {
                        first_weekday = start_day;
                        first_weekday_type = start_day_type;
                    }
                }
            }
            if (n.isZero()) {
                return first_weekday;
            }
            {
                SubLObject week_displacement = integerDivide(n, FIVE_INTEGER);
                SubLObject day_displacement = mod(n, FIVE_INTEGER);
                SubLObject reference_day = date_utilities.date_after(first_weekday, list($$WeeksDuration, week_displacement));
                SubLObject reference_day_num = subtract(date_utilities.number_of_day_of_week(first_weekday_type), ONE_INTEGER);
                if (day_displacement.isZero()) {
                    return reference_day;
                } else {
                    if (add(day_displacement, reference_day_num).numLE(FOUR_INTEGER)) {
                        return date_utilities.date_after(reference_day, list($$DaysDuration, day_displacement));
                    } else {
                        return date_utilities.date_after(reference_day, list($$DaysDuration, add(TWO_INTEGER, day_displacement)));
                    }
                }
            }
        }
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

    public static final SubLObject declare_time_parameter_utilities_file_alt() {
        declareFunction("time_point_type_p", "TIME-POINT-TYPE-P", 1, 0, false);
        declareFunction("conventional_time_series_p", "CONVENTIONAL-TIME-SERIES-P", 1, 0, false);
        declareFunction("time_series_type_duration", "TIME-SERIES-TYPE-DURATION", 1, 0, false);
        declareFunction("time_series_duration", "TIME-SERIES-DURATION", 1, 0, false);
        declareFunction("covering_time_type_p", "COVERING-TIME-TYPE-P", 1, 0, false);
        declareFunction("covering_type_unit_duration", "COVERING-TYPE-UNIT-DURATION", 1, 0, false);
        declareFunction("covering_type_duration", "COVERING-TYPE-DURATION", 1, 0, false);
        declareFunction("construct_covering_duration", "CONSTRUCT-COVERING-DURATION", 2, 0, false);
        declareFunction("gappy_time_type_p", "GAPPY-TIME-TYPE-P", 1, 0, false);
        declareFunction("gappy_type_period", "GAPPY-TYPE-PERIOD", 1, 0, false);
        declareFunction("gappy_type_duration", "GAPPY-TYPE-DURATION", 1, 0, false);
        declareFunction("month_of_year_typeP", "MONTH-OF-YEAR-TYPE?", 1, 0, false);
        declareFunction("day_of_year_typeP", "DAY-OF-YEAR-TYPE?", 1, 0, false);
        declareFunction("day_of_week_typeP", "DAY-OF-WEEK-TYPE?", 1, 0, false);
        declareFunction("hour_of_day_typeP", "HOUR-OF-DAY-TYPE?", 1, 0, false);
        declareFunction("sliding_time_type_p", "SLIDING-TIME-TYPE-P", 1, 0, false);
        declareFunction("extract_sliding_type", "EXTRACT-SLIDING-TYPE", 1, 0, false);
        declareFunction("extract_sliding_time_type", "EXTRACT-SLIDING-TIME-TYPE", 1, 0, false);
        declareFunction("extract_sliding_type_amount", "EXTRACT-SLIDING-TYPE-AMOUNT", 1, 0, false);
        declareFunction("make_sliding_type", "MAKE-SLIDING-TYPE", 1, 0, false);
        declareFunction("duration_function_p", "DURATION-FUNCTION-P", 1, 0, false);
        declareFunction("duration_p", "DURATION-P", 1, 0, false);
        declareFunction("zero_duration_p", "ZERO-DURATION-P", 1, 0, false);
        declareFunction("duration_typeL", "DURATION-TYPE<", 2, 0, false);
        declareFunction("duration_type", "DURATION-TYPE", 1, 0, false);
        declareFunction("duration_magnitude", "DURATION-MAGNITUDE", 1, 0, false);
        declareFunction("duration_precision", "DURATION-PRECISION", 1, 0, false);
        declareFunction("a_really_long_timeP", "A-REALLY-LONG-TIME?", 1, 0, false);
        declareFunction("durationL", "DURATION<", 2, 0, false);
        declareFunction("durationLE", "DURATION<=", 2, 0, false);
        declareFunction("durationE", "DURATION=", 2, 0, false);
        declareFunction("add_durations", "ADD-DURATIONS", 2, 0, false);
        declareFunction("scale_duration", "SCALE-DURATION", 2, 0, false);
        declareFunction("find_duration_quotient", "FIND-DURATION-QUOTIENT", 2, 1, false);
        declareFunction("date_interval_subsumes_typeP", "DATE-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
        declareFunction("date_interval_subsumed_by_typeP", "DATE-INTERVAL-SUBSUMED-BY-TYPE?", 2, 0, false);
        declareFunction("type_duration_from_date", "TYPE-DURATION-FROM-DATE", 2, 0, false);
        declareFunction("get_duration_of_type", "GET-DURATION-OF-TYPE", 1, 0, false);
        declareFunction("get_duration_of_interval", "GET-DURATION-OF-INTERVAL", 1, 0, false);
        declareFunction("interval_seconds_duration", "INTERVAL-SECONDS-DURATION", 1, 0, false);
        declareFunction("type_seconds_duration", "TYPE-SECONDS-DURATION", 1, 0, false);
        declareFunction("time_of_type_before_interval", "TIME-OF-TYPE-BEFORE-INTERVAL", 3, 0, false);
        declareFunction("time_of_type_after_interval", "TIME-OF-TYPE-AFTER-INTERVAL", 3, 0, false);
        declareFunction("time_ended_by_last_type_in_interval", "TIME-ENDED-BY-LAST-TYPE-IN-INTERVAL", 2, 0, false);
        declareFunction("time_started_by_first_type_in_interval", "TIME-STARTED-BY-FIRST-TYPE-IN-INTERVAL", 2, 0, false);
        declareFunction("day_of_year_nat_p", "DAY-OF-YEAR-NAT-P", 1, 0, false);
        declareFunction("first_moment_of_covering_type_p", "FIRST-MOMENT-OF-COVERING-TYPE-P", 2, 0, false);
        declareFunction("first_moment_of_covering_type_p_int", "FIRST-MOMENT-OF-COVERING-TYPE-P-INT", 2, 0, false);
        declareFunction("last_moment_of_covering_type_p", "LAST-MOMENT-OF-COVERING-TYPE-P", 2, 0, false);
        declareFunction("last_moment_of_covering_type_p_int", "LAST-MOMENT-OF-COVERING-TYPE-P-INT", 2, 0, false);
        declareFunction("nth_type_starting_before_start_of_interval", "NTH-TYPE-STARTING-BEFORE-START-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_starting_no_later_than_start_of_interval", "NTH-TYPE-STARTING-NO-LATER-THAN-START-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_starting_after_start_of_interval", "NTH-TYPE-STARTING-AFTER-START-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_starting_no_earlier_than_start_of_interval", "NTH-TYPE-STARTING-NO-EARLIER-THAN-START-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_starting_before_end_of_interval", "NTH-TYPE-STARTING-BEFORE-END-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_starting_no_later_than_end_of_interval", "NTH-TYPE-STARTING-NO-LATER-THAN-END-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_starting_after_end_of_interval", "NTH-TYPE-STARTING-AFTER-END-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_starting_no_earlier_than_end_of_interval", "NTH-TYPE-STARTING-NO-EARLIER-THAN-END-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_ending_before_start_of_interval", "NTH-TYPE-ENDING-BEFORE-START-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_ending_no_later_than_start_of_interval", "NTH-TYPE-ENDING-NO-LATER-THAN-START-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_ending_after_start_of_interval", "NTH-TYPE-ENDING-AFTER-START-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_ending_no_earlier_than_start_of_interval", "NTH-TYPE-ENDING-NO-EARLIER-THAN-START-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_ending_before_end_of_interval", "NTH-TYPE-ENDING-BEFORE-END-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_ending_no_later_than_end_of_interval", "NTH-TYPE-ENDING-NO-LATER-THAN-END-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_ending_after_end_of_interval", "NTH-TYPE-ENDING-AFTER-END-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_ending_no_earlier_than_end_of_interval", "NTH-TYPE-ENDING-NO-EARLIER-THAN-END-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_starting_before_time_point", "NTH-TYPE-STARTING-BEFORE-TIME-POINT", 3, 0, false);
        declareFunction("nth_type_starting_no_later_than_time_point", "NTH-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_type_starting_after_time_point", "NTH-TYPE-STARTING-AFTER-TIME-POINT", 3, 0, false);
        declareFunction("nth_type_starting_no_earlier_than_time_point", "NTH-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_type_ending_before_time_point", "NTH-TYPE-ENDING-BEFORE-TIME-POINT", 3, 0, false);
        declareFunction("nth_type_ending_no_later_than_time_point", "NTH-TYPE-ENDING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_type_ending_after_time_point", "NTH-TYPE-ENDING-AFTER-TIME-POINT", 3, 0, false);
        declareFunction("nth_type_ending_no_earlier_than_time_point", "NTH-TYPE-ENDING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_time_point_no_later_than_time_point", "NTH-TIME-POINT-NO-LATER-THAN-TIME-POINT", 2, 0, false);
        declareFunction("nth_time_point_no_earlier_than_time_point", "NTH-TIME-POINT-NO-EARLIER-THAN-TIME-POINT", 2, 0, false);
        declareFunction("nth_covering_time_type_starting_no_later_than_time_point", "NTH-COVERING-TIME-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_covering_time_type_starting_no_earlier_than_time_point", "NTH-COVERING-TIME-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_covering_time_type_ending_no_later_than_time_point", "NTH-COVERING-TIME-TYPE-ENDING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_covering_time_type_ending_no_earlier_than_time_point", "NTH-COVERING-TIME-TYPE-ENDING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_gappy_time_type_starting_no_later_than_time_point", "NTH-GAPPY-TIME-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_gappy_time_type_starting_no_earlier_than_time_point", "NTH-GAPPY-TIME-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_gappy_time_type_ending_no_later_than_time_point", "NTH-GAPPY-TIME-TYPE-ENDING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_gappy_time_type_ending_no_earlier_than_time_point", "NTH-GAPPY-TIME-TYPE-ENDING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_month_of_year_type_starting_no_later_than_time_point", "NTH-MONTH-OF-YEAR-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_month_of_year_type_starting_no_earlier_than_time_point", "NTH-MONTH-OF-YEAR-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_day_of_week_type_starting_no_later_than_time_point", "NTH-DAY-OF-WEEK-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_day_of_week_type_starting_no_earlier_than_time_point", "NTH-DAY-OF-WEEK-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_hour_of_day_type_starting_no_later_than_time_point", "NTH-HOUR-OF-DAY-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_hour_of_day_type_starting_no_earlier_than_time_point", "NTH-HOUR-OF-DAY-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_day_of_year_type_starting_no_later_than_time_point", "NTH-DAY-OF-YEAR-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_day_of_year_type_starting_no_earlier_than_time_point", "NTH-DAY-OF-YEAR-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_weekday_starting_no_later_than_time_point", "NTH-WEEKDAY-STARTING-NO-LATER-THAN-TIME-POINT", 2, 0, false);
        declareFunction("nth_weekday_starting_no_earlier_than_time_point", "NTH-WEEKDAY-STARTING-NO-EARLIER-THAN-TIME-POINT", 2, 0, false);
        declareFunction("subloop_reserved_initialize_first_moment_in_interval_class", "SUBLOOP-RESERVED-INITIALIZE-FIRST-MOMENT-IN-INTERVAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_first_moment_in_interval_instance", "SUBLOOP-RESERVED-INITIALIZE-FIRST-MOMENT-IN-INTERVAL-INSTANCE", 1, 0, false);
        declareFunction("first_moment_in_interval_p", "FIRST-MOMENT-IN-INTERVAL-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_time_parameter_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("time_point_type_p", "TIME-POINT-TYPE-P", 1, 0, false);
            declareFunction("conventional_time_series_p", "CONVENTIONAL-TIME-SERIES-P", 1, 0, false);
            declareFunction("time_series_type_duration", "TIME-SERIES-TYPE-DURATION", 1, 0, false);
            declareFunction("time_series_duration", "TIME-SERIES-DURATION", 1, 0, false);
            declareFunction("covering_time_type_p", "COVERING-TIME-TYPE-P", 1, 0, false);
            declareFunction("covering_type_unit_duration", "COVERING-TYPE-UNIT-DURATION", 1, 0, false);
            declareFunction("covering_type_duration", "COVERING-TYPE-DURATION", 1, 0, false);
            declareFunction("construct_covering_duration", "CONSTRUCT-COVERING-DURATION", 2, 0, false);
            declareFunction("gappy_time_type_p", "GAPPY-TIME-TYPE-P", 1, 0, false);
            declareFunction("gappy_type_period", "GAPPY-TYPE-PERIOD", 1, 0, false);
            declareFunction("gappy_type_duration", "GAPPY-TYPE-DURATION", 1, 0, false);
            declareFunction("month_of_year_typeP", "MONTH-OF-YEAR-TYPE?", 1, 0, false);
            declareFunction("day_of_year_typeP", "DAY-OF-YEAR-TYPE?", 1, 0, false);
            declareFunction("day_of_week_typeP", "DAY-OF-WEEK-TYPE?", 1, 0, false);
            declareFunction("hour_of_day_typeP", "HOUR-OF-DAY-TYPE?", 1, 0, false);
            declareFunction("sliding_time_type_p", "SLIDING-TIME-TYPE-P", 1, 0, false);
            declareFunction("extract_sliding_type", "EXTRACT-SLIDING-TYPE", 1, 0, false);
            declareFunction("extract_sliding_time_type", "EXTRACT-SLIDING-TIME-TYPE", 1, 0, false);
            declareFunction("extract_sliding_type_amount", "EXTRACT-SLIDING-TYPE-AMOUNT", 1, 0, false);
            declareFunction("make_sliding_type", "MAKE-SLIDING-TYPE", 1, 0, false);
            declareFunction("duration_function_p", "DURATION-FUNCTION-P", 1, 0, false);
            declareFunction("duration_p", "DURATION-P", 1, 0, false);
            declareFunction("zero_duration_p", "ZERO-DURATION-P", 1, 0, false);
            declareFunction("duration_typeL", "DURATION-TYPE<", 2, 0, false);
            declareFunction("duration_type", "DURATION-TYPE", 1, 0, false);
            declareFunction("duration_magnitude", "DURATION-MAGNITUDE", 1, 0, false);
            declareFunction("duration_precision", "DURATION-PRECISION", 1, 0, false);
            declareFunction("a_really_long_timeP", "A-REALLY-LONG-TIME?", 1, 0, false);
            declareFunction("durationL", "DURATION<", 2, 0, false);
            declareFunction("durationLE", "DURATION<=", 2, 0, false);
            declareFunction("durationE", "DURATION=", 2, 0, false);
            declareFunction("add_durations", "ADD-DURATIONS", 2, 0, false);
            declareFunction("scale_duration", "SCALE-DURATION", 2, 0, false);
            declareFunction("find_duration_quotient", "FIND-DURATION-QUOTIENT", 2, 1, false);
            declareFunction("date_interval_subsumes_typeP", "DATE-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
            declareFunction("date_interval_subsumed_by_typeP", "DATE-INTERVAL-SUBSUMED-BY-TYPE?", 2, 0, false);
            declareFunction("type_duration_from_date", "TYPE-DURATION-FROM-DATE", 2, 0, false);
            declareFunction("get_duration_of_type", "GET-DURATION-OF-TYPE", 1, 0, false);
            declareFunction("get_duration_of_interval", "GET-DURATION-OF-INTERVAL", 1, 0, false);
            declareFunction("interval_seconds_duration", "INTERVAL-SECONDS-DURATION", 1, 0, false);
            declareFunction("type_seconds_duration", "TYPE-SECONDS-DURATION", 1, 0, false);
            declareFunction("time_of_type_before_interval", "TIME-OF-TYPE-BEFORE-INTERVAL", 3, 0, false);
            declareFunction("time_of_type_after_interval", "TIME-OF-TYPE-AFTER-INTERVAL", 3, 0, false);
            declareFunction("time_ended_by_last_type_in_interval", "TIME-ENDED-BY-LAST-TYPE-IN-INTERVAL", 2, 0, false);
            declareFunction("time_started_by_first_type_in_interval", "TIME-STARTED-BY-FIRST-TYPE-IN-INTERVAL", 2, 0, false);
            declareFunction("day_of_year_nat_p", "DAY-OF-YEAR-NAT-P", 1, 0, false);
            declareFunction("first_moment_of_covering_type_p", "FIRST-MOMENT-OF-COVERING-TYPE-P", 2, 0, false);
            declareFunction("first_moment_of_covering_type_p_int", "FIRST-MOMENT-OF-COVERING-TYPE-P-INT", 2, 0, false);
            declareFunction("last_moment_of_covering_type_p", "LAST-MOMENT-OF-COVERING-TYPE-P", 2, 0, false);
            declareFunction("last_moment_of_covering_type_p_int", "LAST-MOMENT-OF-COVERING-TYPE-P-INT", 2, 0, false);
            declareFunction("nth_type_starting_before_start_of_interval", "NTH-TYPE-STARTING-BEFORE-START-OF-INTERVAL", 3, 0, false);
            declareFunction("nth_type_starting_no_later_than_start_of_interval", "NTH-TYPE-STARTING-NO-LATER-THAN-START-OF-INTERVAL", 3, 0, false);
            declareFunction("nth_type_starting_after_start_of_interval", "NTH-TYPE-STARTING-AFTER-START-OF-INTERVAL", 3, 0, false);
            declareFunction("nth_type_starting_no_earlier_than_start_of_interval", "NTH-TYPE-STARTING-NO-EARLIER-THAN-START-OF-INTERVAL", 3, 0, false);
            declareFunction("nth_type_starting_before_end_of_interval", "NTH-TYPE-STARTING-BEFORE-END-OF-INTERVAL", 3, 0, false);
            declareFunction("nth_type_starting_no_later_than_end_of_interval", "NTH-TYPE-STARTING-NO-LATER-THAN-END-OF-INTERVAL", 3, 0, false);
            declareFunction("nth_type_starting_after_end_of_interval", "NTH-TYPE-STARTING-AFTER-END-OF-INTERVAL", 3, 0, false);
            declareFunction("nth_type_starting_no_earlier_than_end_of_interval", "NTH-TYPE-STARTING-NO-EARLIER-THAN-END-OF-INTERVAL", 3, 0, false);
            declareFunction("nth_type_ending_before_start_of_interval", "NTH-TYPE-ENDING-BEFORE-START-OF-INTERVAL", 3, 0, false);
            declareFunction("nth_type_ending_no_later_than_start_of_interval", "NTH-TYPE-ENDING-NO-LATER-THAN-START-OF-INTERVAL", 3, 0, false);
            declareFunction("nth_type_ending_after_start_of_interval", "NTH-TYPE-ENDING-AFTER-START-OF-INTERVAL", 3, 0, false);
            declareFunction("nth_type_ending_no_earlier_than_start_of_interval", "NTH-TYPE-ENDING-NO-EARLIER-THAN-START-OF-INTERVAL", 3, 0, false);
            declareFunction("nth_type_ending_before_end_of_interval", "NTH-TYPE-ENDING-BEFORE-END-OF-INTERVAL", 3, 0, false);
            declareFunction("nth_type_ending_no_later_than_end_of_interval", "NTH-TYPE-ENDING-NO-LATER-THAN-END-OF-INTERVAL", 3, 0, false);
            declareFunction("nth_type_ending_after_end_of_interval", "NTH-TYPE-ENDING-AFTER-END-OF-INTERVAL", 3, 0, false);
            declareFunction("nth_type_ending_no_earlier_than_end_of_interval", "NTH-TYPE-ENDING-NO-EARLIER-THAN-END-OF-INTERVAL", 3, 0, false);
            declareFunction("nth_type_starting_before_time_point", "NTH-TYPE-STARTING-BEFORE-TIME-POINT", 3, 0, false);
            declareFunction("nth_type_starting_no_later_than_time_point", "NTH-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
            declareFunction("nth_type_starting_after_time_point", "NTH-TYPE-STARTING-AFTER-TIME-POINT", 3, 0, false);
            declareFunction("nth_type_starting_no_earlier_than_time_point", "NTH-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
            declareFunction("nth_type_ending_before_time_point", "NTH-TYPE-ENDING-BEFORE-TIME-POINT", 3, 0, false);
            declareFunction("nth_type_ending_no_later_than_time_point", "NTH-TYPE-ENDING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
            declareFunction("nth_type_ending_after_time_point", "NTH-TYPE-ENDING-AFTER-TIME-POINT", 3, 0, false);
            declareFunction("nth_type_ending_no_earlier_than_time_point", "NTH-TYPE-ENDING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
            declareFunction("nth_time_point_no_later_than_time_point", "NTH-TIME-POINT-NO-LATER-THAN-TIME-POINT", 2, 0, false);
            declareFunction("nth_time_point_no_earlier_than_time_point", "NTH-TIME-POINT-NO-EARLIER-THAN-TIME-POINT", 2, 0, false);
            declareFunction("nth_covering_time_type_starting_no_later_than_time_point", "NTH-COVERING-TIME-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
            declareFunction("nth_covering_time_type_starting_no_earlier_than_time_point", "NTH-COVERING-TIME-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
            declareFunction("nth_covering_time_type_ending_no_later_than_time_point", "NTH-COVERING-TIME-TYPE-ENDING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
            declareFunction("nth_covering_time_type_ending_no_earlier_than_time_point", "NTH-COVERING-TIME-TYPE-ENDING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
            declareFunction("nth_gappy_time_type_starting_no_later_than_time_point", "NTH-GAPPY-TIME-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
            declareFunction("nth_gappy_time_type_starting_no_earlier_than_time_point", "NTH-GAPPY-TIME-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
            declareFunction("nth_gappy_time_type_ending_no_later_than_time_point", "NTH-GAPPY-TIME-TYPE-ENDING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
            declareFunction("nth_gappy_time_type_ending_no_earlier_than_time_point", "NTH-GAPPY-TIME-TYPE-ENDING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
            declareFunction("nth_month_of_year_type_starting_no_later_than_time_point", "NTH-MONTH-OF-YEAR-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
            declareFunction("nth_month_of_year_type_starting_no_earlier_than_time_point", "NTH-MONTH-OF-YEAR-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
            declareFunction("nth_day_of_week_type_starting_no_later_than_time_point", "NTH-DAY-OF-WEEK-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
            declareFunction("nth_day_of_week_type_starting_no_earlier_than_time_point", "NTH-DAY-OF-WEEK-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
            declareFunction("nth_hour_of_day_type_starting_no_later_than_time_point", "NTH-HOUR-OF-DAY-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
            declareFunction("nth_hour_of_day_type_starting_no_earlier_than_time_point", "NTH-HOUR-OF-DAY-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
            declareFunction("nth_day_of_year_type_starting_no_later_than_time_point", "NTH-DAY-OF-YEAR-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
            declareFunction("nth_day_of_year_type_starting_no_earlier_than_time_point", "NTH-DAY-OF-YEAR-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
            declareFunction("nth_weekday_starting_no_later_than_time_point", "NTH-WEEKDAY-STARTING-NO-LATER-THAN-TIME-POINT", 2, 0, false);
            declareFunction("nth_weekday_starting_no_earlier_than_time_point", "NTH-WEEKDAY-STARTING-NO-EARLIER-THAN-TIME-POINT", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("subloop_reserved_initialize_first_moment_in_interval_class", "SUBLOOP-RESERVED-INITIALIZE-FIRST-MOMENT-IN-INTERVAL-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_first_moment_in_interval_instance", "SUBLOOP-RESERVED-INITIALIZE-FIRST-MOMENT-IN-INTERVAL-INSTANCE", 1, 0, false);
            declareFunction("first_moment_in_interval_p", "FIRST-MOMENT-IN-INTERVAL-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_time_parameter_utilities_file_Previous() {
        declareFunction("time_point_type_p", "TIME-POINT-TYPE-P", 1, 0, false);
        declareFunction("conventional_time_series_p", "CONVENTIONAL-TIME-SERIES-P", 1, 0, false);
        declareFunction("time_series_type_duration", "TIME-SERIES-TYPE-DURATION", 1, 0, false);
        declareFunction("time_series_duration", "TIME-SERIES-DURATION", 1, 0, false);
        declareFunction("covering_time_type_p", "COVERING-TIME-TYPE-P", 1, 0, false);
        declareFunction("covering_type_unit_duration", "COVERING-TYPE-UNIT-DURATION", 1, 0, false);
        declareFunction("covering_type_duration", "COVERING-TYPE-DURATION", 1, 0, false);
        declareFunction("construct_covering_duration", "CONSTRUCT-COVERING-DURATION", 2, 0, false);
        declareFunction("gappy_time_type_p", "GAPPY-TIME-TYPE-P", 1, 0, false);
        declareFunction("gappy_type_period", "GAPPY-TYPE-PERIOD", 1, 0, false);
        declareFunction("gappy_type_duration", "GAPPY-TYPE-DURATION", 1, 0, false);
        declareFunction("month_of_year_typeP", "MONTH-OF-YEAR-TYPE?", 1, 0, false);
        declareFunction("day_of_year_typeP", "DAY-OF-YEAR-TYPE?", 1, 0, false);
        declareFunction("day_of_week_typeP", "DAY-OF-WEEK-TYPE?", 1, 0, false);
        declareFunction("hour_of_day_typeP", "HOUR-OF-DAY-TYPE?", 1, 0, false);
        declareFunction("sliding_time_type_p", "SLIDING-TIME-TYPE-P", 1, 0, false);
        declareFunction("extract_sliding_type", "EXTRACT-SLIDING-TYPE", 1, 0, false);
        declareFunction("extract_sliding_time_type", "EXTRACT-SLIDING-TIME-TYPE", 1, 0, false);
        declareFunction("extract_sliding_type_amount", "EXTRACT-SLIDING-TYPE-AMOUNT", 1, 0, false);
        declareFunction("make_sliding_type", "MAKE-SLIDING-TYPE", 1, 0, false);
        declareFunction("duration_function_p", "DURATION-FUNCTION-P", 1, 0, false);
        declareFunction("duration_p", "DURATION-P", 1, 0, false);
        declareFunction("zero_duration_p", "ZERO-DURATION-P", 1, 0, false);
        declareFunction("duration_typeL", "DURATION-TYPE<", 2, 0, false);
        declareFunction("duration_type", "DURATION-TYPE", 1, 0, false);
        declareFunction("duration_magnitude", "DURATION-MAGNITUDE", 1, 0, false);
        declareFunction("duration_precision", "DURATION-PRECISION", 1, 0, false);
        declareFunction("a_really_long_timeP", "A-REALLY-LONG-TIME?", 1, 0, false);
        declareFunction("durationL", "DURATION<", 2, 0, false);
        declareFunction("durationLE", "DURATION<=", 2, 0, false);
        declareFunction("durationE", "DURATION=", 2, 0, false);
        declareFunction("add_durations", "ADD-DURATIONS", 2, 0, false);
        declareFunction("scale_duration", "SCALE-DURATION", 2, 0, false);
        declareFunction("find_duration_quotient", "FIND-DURATION-QUOTIENT", 2, 1, false);
        declareFunction("date_interval_subsumes_typeP", "DATE-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
        declareFunction("date_interval_subsumed_by_typeP", "DATE-INTERVAL-SUBSUMED-BY-TYPE?", 2, 0, false);
        declareFunction("type_duration_from_date", "TYPE-DURATION-FROM-DATE", 2, 0, false);
        declareFunction("get_duration_of_type", "GET-DURATION-OF-TYPE", 1, 0, false);
        declareFunction("get_duration_of_interval", "GET-DURATION-OF-INTERVAL", 1, 0, false);
        declareFunction("interval_seconds_duration", "INTERVAL-SECONDS-DURATION", 1, 0, false);
        declareFunction("type_seconds_duration", "TYPE-SECONDS-DURATION", 1, 0, false);
        declareFunction("time_of_type_before_interval", "TIME-OF-TYPE-BEFORE-INTERVAL", 3, 0, false);
        declareFunction("time_of_type_after_interval", "TIME-OF-TYPE-AFTER-INTERVAL", 3, 0, false);
        declareFunction("time_ended_by_last_type_in_interval", "TIME-ENDED-BY-LAST-TYPE-IN-INTERVAL", 2, 0, false);
        declareFunction("time_started_by_first_type_in_interval", "TIME-STARTED-BY-FIRST-TYPE-IN-INTERVAL", 2, 0, false);
        declareFunction("day_of_year_nat_p", "DAY-OF-YEAR-NAT-P", 1, 0, false);
        declareFunction("first_moment_of_covering_type_p", "FIRST-MOMENT-OF-COVERING-TYPE-P", 2, 0, false);
        declareFunction("first_moment_of_covering_type_p_int", "FIRST-MOMENT-OF-COVERING-TYPE-P-INT", 2, 0, false);
        declareFunction("last_moment_of_covering_type_p", "LAST-MOMENT-OF-COVERING-TYPE-P", 2, 0, false);
        declareFunction("last_moment_of_covering_type_p_int", "LAST-MOMENT-OF-COVERING-TYPE-P-INT", 2, 0, false);
        declareFunction("nth_type_starting_before_start_of_interval", "NTH-TYPE-STARTING-BEFORE-START-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_starting_no_later_than_start_of_interval", "NTH-TYPE-STARTING-NO-LATER-THAN-START-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_starting_after_start_of_interval", "NTH-TYPE-STARTING-AFTER-START-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_starting_no_earlier_than_start_of_interval", "NTH-TYPE-STARTING-NO-EARLIER-THAN-START-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_starting_before_end_of_interval", "NTH-TYPE-STARTING-BEFORE-END-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_starting_no_later_than_end_of_interval", "NTH-TYPE-STARTING-NO-LATER-THAN-END-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_starting_after_end_of_interval", "NTH-TYPE-STARTING-AFTER-END-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_starting_no_earlier_than_end_of_interval", "NTH-TYPE-STARTING-NO-EARLIER-THAN-END-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_ending_before_start_of_interval", "NTH-TYPE-ENDING-BEFORE-START-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_ending_no_later_than_start_of_interval", "NTH-TYPE-ENDING-NO-LATER-THAN-START-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_ending_after_start_of_interval", "NTH-TYPE-ENDING-AFTER-START-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_ending_no_earlier_than_start_of_interval", "NTH-TYPE-ENDING-NO-EARLIER-THAN-START-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_ending_before_end_of_interval", "NTH-TYPE-ENDING-BEFORE-END-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_ending_no_later_than_end_of_interval", "NTH-TYPE-ENDING-NO-LATER-THAN-END-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_ending_after_end_of_interval", "NTH-TYPE-ENDING-AFTER-END-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_ending_no_earlier_than_end_of_interval", "NTH-TYPE-ENDING-NO-EARLIER-THAN-END-OF-INTERVAL", 3, 0, false);
        declareFunction("nth_type_starting_before_time_point", "NTH-TYPE-STARTING-BEFORE-TIME-POINT", 3, 0, false);
        declareFunction("nth_type_starting_no_later_than_time_point", "NTH-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_type_starting_after_time_point", "NTH-TYPE-STARTING-AFTER-TIME-POINT", 3, 0, false);
        declareFunction("nth_type_starting_no_earlier_than_time_point", "NTH-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_type_ending_before_time_point", "NTH-TYPE-ENDING-BEFORE-TIME-POINT", 3, 0, false);
        declareFunction("nth_type_ending_no_later_than_time_point", "NTH-TYPE-ENDING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_type_ending_after_time_point", "NTH-TYPE-ENDING-AFTER-TIME-POINT", 3, 0, false);
        declareFunction("nth_type_ending_no_earlier_than_time_point", "NTH-TYPE-ENDING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_time_point_no_later_than_time_point", "NTH-TIME-POINT-NO-LATER-THAN-TIME-POINT", 2, 0, false);
        declareFunction("nth_time_point_no_earlier_than_time_point", "NTH-TIME-POINT-NO-EARLIER-THAN-TIME-POINT", 2, 0, false);
        declareFunction("nth_covering_time_type_starting_no_later_than_time_point", "NTH-COVERING-TIME-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_covering_time_type_starting_no_earlier_than_time_point", "NTH-COVERING-TIME-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_covering_time_type_ending_no_later_than_time_point", "NTH-COVERING-TIME-TYPE-ENDING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_covering_time_type_ending_no_earlier_than_time_point", "NTH-COVERING-TIME-TYPE-ENDING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_gappy_time_type_starting_no_later_than_time_point", "NTH-GAPPY-TIME-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_gappy_time_type_starting_no_earlier_than_time_point", "NTH-GAPPY-TIME-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_gappy_time_type_ending_no_later_than_time_point", "NTH-GAPPY-TIME-TYPE-ENDING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_gappy_time_type_ending_no_earlier_than_time_point", "NTH-GAPPY-TIME-TYPE-ENDING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_month_of_year_type_starting_no_later_than_time_point", "NTH-MONTH-OF-YEAR-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_month_of_year_type_starting_no_earlier_than_time_point", "NTH-MONTH-OF-YEAR-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_day_of_week_type_starting_no_later_than_time_point", "NTH-DAY-OF-WEEK-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_day_of_week_type_starting_no_earlier_than_time_point", "NTH-DAY-OF-WEEK-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_hour_of_day_type_starting_no_later_than_time_point", "NTH-HOUR-OF-DAY-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_hour_of_day_type_starting_no_earlier_than_time_point", "NTH-HOUR-OF-DAY-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_day_of_year_type_starting_no_later_than_time_point", "NTH-DAY-OF-YEAR-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_day_of_year_type_starting_no_earlier_than_time_point", "NTH-DAY-OF-YEAR-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false);
        declareFunction("nth_weekday_starting_no_later_than_time_point", "NTH-WEEKDAY-STARTING-NO-LATER-THAN-TIME-POINT", 2, 0, false);
        declareFunction("nth_weekday_starting_no_earlier_than_time_point", "NTH-WEEKDAY-STARTING-NO-EARLIER-THAN-TIME-POINT", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_time_parameter_utilities_file() {
        defconstant("*ONE-SECOND-LONG*", $list15);
        defconstant("*DURATION-PREDICATES*", $list16);
        defconstant("*A-REALLY-LONG-TIME*", $A_LONG_TIME);
        return NIL;
    }

    public static final SubLObject setup_time_parameter_utilities_file_alt() {
        sunit_external.define_test_category($$$Time_Parameter_Tests, UNPROVIDED);
        sunit_external.define_test_suite($$$Start_of_Interval_Tests, $list_alt78, UNPROVIDED, UNPROVIDED);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(FIRST_MOMENT_IN_INTERVAL, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(FIRST_MOMENT_IN_INTERVAL);
        classes.subloop_new_class(FIRST_MOMENT_IN_INTERVAL, TEST_CASE, NIL, NIL, $list_alt81);
        classes.class_set_implements_slot_listeners(FIRST_MOMENT_IN_INTERVAL, NIL);
        classes.subloop_note_class_initialization_function(FIRST_MOMENT_IN_INTERVAL, SUBLOOP_RESERVED_INITIALIZE_FIRST_MOMENT_IN_INTERVAL_CLASS);
        classes.subloop_note_instance_initialization_function(FIRST_MOMENT_IN_INTERVAL, SUBLOOP_RESERVED_INITIALIZE_FIRST_MOMENT_IN_INTERVAL_INSTANCE);
        com.cyc.cycjava.cycl.time_parameter_utilities.subloop_reserved_initialize_first_moment_in_interval_class(FIRST_MOMENT_IN_INTERVAL);
        sunit_macros.define_test_case_postamble(FIRST_MOMENT_IN_INTERVAL, $str_alt96$time_parameter_utilities, $$$cycl, $list_alt78);
        sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST0);
        sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST1);
        sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST2);
        sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST3);
        sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST4);
        sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST5);
        sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST6);
        sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST7);
        sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST8);
        sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST9);
        sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST10);
        sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST11);
        sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST12);
        sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST13);
        sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST14);
        sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST15);
        sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST16);
        return NIL;
    }

    public static SubLObject setup_time_parameter_utilities_file() {
        if (SubLFiles.USE_V1) {
            sunit_external.define_test_category($$$Time_Parameter_Tests, UNPROVIDED);
            sunit_external.define_test_suite($$$Start_of_Interval_Tests, $list78, UNPROVIDED, UNPROVIDED);
        }
        if (SubLFiles.USE_V2) {
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(FIRST_MOMENT_IN_INTERVAL, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(FIRST_MOMENT_IN_INTERVAL);
            classes.subloop_new_class(FIRST_MOMENT_IN_INTERVAL, TEST_CASE, NIL, NIL, $list_alt81);
            classes.class_set_implements_slot_listeners(FIRST_MOMENT_IN_INTERVAL, NIL);
            classes.subloop_note_class_initialization_function(FIRST_MOMENT_IN_INTERVAL, SUBLOOP_RESERVED_INITIALIZE_FIRST_MOMENT_IN_INTERVAL_CLASS);
            classes.subloop_note_instance_initialization_function(FIRST_MOMENT_IN_INTERVAL, SUBLOOP_RESERVED_INITIALIZE_FIRST_MOMENT_IN_INTERVAL_INSTANCE);
            com.cyc.cycjava.cycl.time_parameter_utilities.subloop_reserved_initialize_first_moment_in_interval_class(FIRST_MOMENT_IN_INTERVAL);
            sunit_macros.define_test_case_postamble(FIRST_MOMENT_IN_INTERVAL, $str_alt96$time_parameter_utilities, $$$cycl, $list_alt78);
            sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST0);
            sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST1);
            sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST2);
            sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST3);
            sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST4);
            sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST5);
            sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST6);
            sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST7);
            sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST8);
            sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST9);
            sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST10);
            sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST11);
            sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST12);
            sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST13);
            sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST14);
            sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST15);
            sunit_macros.def_test_method_register(FIRST_MOMENT_IN_INTERVAL, TEST16);
        }
        return NIL;
    }

    public static SubLObject setup_time_parameter_utilities_file_Previous() {
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

    

    static private final SubLList $list_alt5 = list(makeKeyword("PERIOD"));

    static private final SubLList $list_alt15 = list(reader_make_constant_shell("SecondsDuration"), ONE_INTEGER);

    static private final SubLList $list_alt16 = list(new SubLObject[]{ reader_make_constant_shell("SecondsDuration"), reader_make_constant_shell("MinutesDuration"), reader_make_constant_shell("HoursDuration"), reader_make_constant_shell("DaysDuration"), reader_make_constant_shell("WeeksDuration"), reader_make_constant_shell("MonthsDuration"), reader_make_constant_shell("QuartersDuration"), reader_make_constant_shell("YearsDuration"), reader_make_constant_shell("DecadesDuration"), reader_make_constant_shell("CenturiesDuration"), reader_make_constant_shell("MillenniaDuration") });

    static private final SubLList $list_alt31 = list(reader_make_constant_shell("SecondsDuration"), ZERO_INTEGER);

    static private final SubLList $list_alt32 = list(ONE_INTEGER);

    static private final SubLString $str_alt33$Type__a_is_not_a_proper_Conventio = makeString("Type ~a is not a proper ConventionallyClassifiedTimeIntervalSeries.");

    static private final SubLString $str_alt34$Interval__a_is_not_a_proper_inter = makeString("Interval ~a is not a proper interval for offset calculations.");

    static private final SubLString $str_alt54$Unknown_time_type__a_ = makeString("Unknown time type ~a.");

    static private final SubLList $list_alt56 = list(reader_make_constant_shell("DaysDuration"), SIX_INTEGER);

    static private final SubLString $str_alt65$No_support_for_type__a_ = makeString("No support for type ~a.");

    static private final SubLList $list_alt68 = list(reader_make_constant_shell("DaysDuration"), FOUR_INTEGER);

    static private final SubLList $list_alt71 = list(reader_make_constant_shell("DaysDuration"), ONE_INTEGER);

    static private final SubLList $list_alt75 = list(reader_make_constant_shell("DaysDuration"), TWO_INTEGER);

    static private final SubLList $list_alt78 = list(makeString("Time Parameter Tests"));

    private static final SubLSymbol FIRST_MOMENT_IN_INTERVAL = makeSymbol("FIRST-MOMENT-IN-INTERVAL");

    static private final SubLList $list_alt81 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST0"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST1"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST2"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST3"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST4"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST5"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST6"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST7"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST8"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST9"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST10"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST11"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST12"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST13"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST14"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST15"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST16"), NIL, makeKeyword("PROTECTED")) });

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_FIRST_MOMENT_IN_INTERVAL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-FIRST-MOMENT-IN-INTERVAL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_FIRST_MOMENT_IN_INTERVAL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-FIRST-MOMENT-IN-INTERVAL-INSTANCE");

    static private final SubLString $str_alt96$time_parameter_utilities = makeString("time-parameter-utilities");

    static private final SubLString $$$cycl = makeString("cycl");

    private static final SubLSymbol TEST0 = makeSymbol("TEST0");

    private static final SubLSymbol TEST7 = makeSymbol("TEST7");

    private static final SubLSymbol TEST8 = makeSymbol("TEST8");

    private static final SubLSymbol TEST9 = makeSymbol("TEST9");

    private static final SubLSymbol TEST10 = makeSymbol("TEST10");

    private static final SubLSymbol TEST11 = makeSymbol("TEST11");

    private static final SubLSymbol TEST12 = makeSymbol("TEST12");

    private static final SubLSymbol TEST13 = makeSymbol("TEST13");

    private static final SubLSymbol TEST14 = makeSymbol("TEST14");

    private static final SubLSymbol TEST15 = makeSymbol("TEST15");

    private static final SubLSymbol TEST16 = makeSymbol("TEST16");
}

/**
 * Total time: 360 ms
 */
