package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class date_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new date_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.date_utilities";

    public static final String myFingerPrint = "4e265d60571d2377dd65d1a5dd8f1b4c06de9673eb15c80ca7e767eba0bbb5e0";

    // deflexical
    private static final SubLSymbol $date_core_constants$ = makeSymbol("*DATE-CORE-CONSTANTS*");

    // deflexical
    private static final SubLSymbol $el_date_granularity_order$ = makeSymbol("*EL-DATE-GRANULARITY-ORDER*");

    // deflexical
    // The syntactic grammar for formulas enforced by DATE-P.
    private static final SubLSymbol $date_p_grammar$ = makeSymbol("*DATE-P-GRAMMAR*");

    // deflexical
    // The syntactic grammar for formulas enforced by TIME-P.
    private static final SubLSymbol $time_p_grammar$ = makeSymbol("*TIME-P-GRAMMAR*");

    // defconstant
    // The beginning of all time
    public static final SubLSymbol $beginning_of_time$ = makeSymbol("*BEGINNING-OF-TIME*");

    // defconstant
    // The end of all time
    public static final SubLSymbol $end_of_time$ = makeSymbol("*END-OF-TIME*");



    // deflexical
    private static final SubLSymbol $date_formats_ordered$ = makeSymbol("*DATE-FORMATS-ORDERED*");

    // deflexical
    private static final SubLSymbol $month_constant_table$ = makeSymbol("*MONTH-CONSTANT-TABLE*");

    // deflexical
    private static final SubLSymbol $days_of_week$ = makeSymbol("*DAYS-OF-WEEK*");

    // deflexical
    // Gregorian Rata Die, i.e. fixed initial day of calendar.
    private static final SubLSymbol $gregorian_rata_die$ = makeSymbol("*GREGORIAN-RATA-DIE*");

    // deflexical
    private static final SubLSymbol $hours_of_day$ = makeSymbol("*HOURS-OF-DAY*");

    // defparameter
    public static final SubLSymbol $duration_denoting_functions_ordered$ = makeSymbol("*DURATION-DENOTING-FUNCTIONS-ORDERED*");

    // defconstant
    // Number used to divide universal-dates to get just the year part.
    private static final SubLSymbol $u_date_year_div$ = makeSymbol("*U-DATE-YEAR-DIV*");



    // defparameter
    public static final SubLSymbol $inference_now$ = makeSymbol("*INFERENCE-NOW*");

    // defconstant
    public static final SubLSymbol $start_of_1970$ = makeSymbol("*START-OF-1970*");

    // defparameter
    public static final SubLSymbol $parse_to_two_digit_years_in_datesP$ = makeSymbol("*PARSE-TO-TWO-DIGIT-YEARS-IN-DATES?*");

    // defparameter
    public static final SubLSymbol $date_patterns$ = makeSymbol("*DATE-PATTERNS*");

    // defparameter
    private static final SubLSymbol $date_query_patterns$ = makeSymbol("*DATE-QUERY-PATTERNS*");

    // defparameter
    private static final SubLSymbol $day_words$ = makeSymbol("*DAY-WORDS*");

    // defparameter
    private static final SubLSymbol $day_word_pairs$ = makeSymbol("*DAY-WORD-PAIRS*");

    // deflexical
    private static final SubLSymbol $day_name_tokens$ = makeSymbol("*DAY-NAME-TOKENS*");

    // deflexical
    private static final SubLSymbol $time_zone_tokens$ = makeSymbol("*TIME-ZONE-TOKENS*");

    // deflexical
    private static final SubLSymbol $common_date_encoding_templates$ = makeSymbol("*COMMON-DATE-ENCODING-TEMPLATES*");

    // Internal Constants
    public static final SubLList $list0 = list(new SubLObject[]{ reader_make_constant_shell(makeString("MilliSecondFn")), reader_make_constant_shell(makeString("SecondFn")), reader_make_constant_shell(makeString("MinuteFn")), reader_make_constant_shell(makeString("HourFn")), reader_make_constant_shell(makeString("DayFn")), reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("YearFn")), reader_make_constant_shell(makeString("January")), reader_make_constant_shell(makeString("February")), reader_make_constant_shell(makeString("March")), reader_make_constant_shell(makeString("April")), reader_make_constant_shell(makeString("May")), reader_make_constant_shell(makeString("June")), reader_make_constant_shell(makeString("July")), reader_make_constant_shell(makeString("August")), reader_make_constant_shell(makeString("September")), reader_make_constant_shell(makeString("October")), reader_make_constant_shell(makeString("November")), reader_make_constant_shell(makeString("December")), reader_make_constant_shell(makeString("definingTimeUnit")), reader_make_constant_shell(makeString("DaysDuration")), reader_make_constant_shell(makeString("MonthsDuration")), reader_make_constant_shell(makeString("YearsDuration")), reader_make_constant_shell(makeString("CalendarDay")), reader_make_constant_shell(makeString("CalendarMonth")), reader_make_constant_shell(makeString("CalendarYear")) });

    public static final SubLSymbol $sym1$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    private static final SubLList $list2 = list(reader_make_constant_shell(makeString("MilliSecondFn")), reader_make_constant_shell(makeString("SecondFn")), reader_make_constant_shell(makeString("MinuteFn")), reader_make_constant_shell(makeString("HourFn")), reader_make_constant_shell(makeString("DayFn")), reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("YearFn")));

    private static final SubLObject $$MilliSecondFn = reader_make_constant_shell(makeString("MilliSecondFn"));

    private static final SubLObject $$SecondFn = reader_make_constant_shell(makeString("SecondFn"));

    private static final SubLObject $$MinuteFn = reader_make_constant_shell(makeString("MinuteFn"));

    private static final SubLObject $$HourFn = reader_make_constant_shell(makeString("HourFn"));

    private static final SubLObject $$DayFn = reader_make_constant_shell(makeString("DayFn"));

    private static final SubLObject $$MonthFn = reader_make_constant_shell(makeString("MonthFn"));

    private static final SubLObject $$YearFn = reader_make_constant_shell(makeString("YearFn"));

    private static final SubLList $list10 = list(list(makeSymbol("RESULT-VAR"), makeSymbol("EARLY-VAR"), makeSymbol("LATER-VAR")), makeSymbol("VALIDATOR"), makeSymbol("DIRECT-COMPARATOR"), makeSymbol("SUB-COMPARATOR"));

    private static final SubLSymbol $sym11$SUB_EARLY = makeUninternedSymbol("SUB-EARLY");

    private static final SubLSymbol $sym12$SUB_LATER = makeUninternedSymbol("SUB-LATER");

    private static final SubLSymbol $sym13$SUB_COMPARE = makeUninternedSymbol("SUB-COMPARE");







    private static final SubLSymbol EL_FORMULA_ARG2 = makeSymbol("EL-FORMULA-ARG2");



    public static final SubLList $list19 = list(makeKeyword("LT"), makeKeyword("GT"));





    private static final SubLSymbol EL_FORMULA_ARG1 = makeSymbol("EL-FORMULA-ARG1");

    private static final SubLSymbol POSSIBLY_EL_TIME_MILLISECOND_P = makeSymbol("POSSIBLY-EL-TIME-MILLISECOND-P");





    private static final SubLSymbol POSSIBLY_EL_TIME_SECOND_P = makeSymbol("POSSIBLY-EL-TIME-SECOND-P");

    private static final SubLSymbol POSSIBLY_EL_TIME_MINUTE_P = makeSymbol("POSSIBLY-EL-TIME-MINUTE-P");

    private static final SubLSymbol POSSIBLY_EL_TIME_HOUR_P = makeSymbol("POSSIBLY-EL-TIME-HOUR-P");

    private static final SubLSymbol POSSIBLY_EL_DATE_DAY_P = makeSymbol("POSSIBLY-EL-DATE-DAY-P");

    private static final SubLSymbol POSSIBLY_EL_DATE_MONTH_P = makeSymbol("POSSIBLY-EL-DATE-MONTH-P");

    private static final SubLSymbol POSSIBLY_EL_DATE_YEAR_P = makeSymbol("POSSIBLY-EL-DATE-YEAR-P");

    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");

    private static final SubLString $str33$unhandled_date_type___S = makeString("unhandled date type: ~S");







    private static final SubLSymbol PATTERN_MATCHES_FORMULA_WITHOUT_BINDINGS = makeSymbol("PATTERN-MATCHES-FORMULA-WITHOUT-BINDINGS");

    private static final SubLList $list38 = list(new SubLObject[]{ makeKeyword("OR"), list(reader_make_constant_shell(makeString("YearFn")), makeKeyword("INTEGER")), reader_make_constant_shell(makeString("TheYear-Indexical")), list(reader_make_constant_shell(makeString("MonthFn")), makeKeyword("FORT"), list(makeKeyword("AND"), cons(reader_make_constant_shell(makeString("YearFn")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("DATE-P-INTERNAL")))), list(reader_make_constant_shell(makeString("MonthFn")), makeKeyword("FORT"), list(makeKeyword("AND"), reader_make_constant_shell(makeString("TheYear-Indexical")), list(makeKeyword("TEST"), makeSymbol("DATE-P-INTERNAL")))), list(reader_make_constant_shell(makeString("DayFn")), list(makeKeyword("TEST"), makeSymbol("NUMBER-IN-RANGE-P"), ONE_INTEGER, makeInteger(31)), list(makeKeyword("AND"), cons(reader_make_constant_shell(makeString("MonthFn")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("DATE-P-INTERNAL")))), list(reader_make_constant_shell(makeString("HourFn")), list(makeKeyword("TEST"), makeSymbol("NUMBER-IN-RANGE-P"), ZERO_INTEGER, makeInteger(23)), list(makeKeyword("AND"), cons(reader_make_constant_shell(makeString("DayFn")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("DATE-P-INTERNAL")))), list(reader_make_constant_shell(makeString("MinuteFn")), list(makeKeyword("TEST"), makeSymbol("NUMBER-IN-RANGE-P"), ZERO_INTEGER, makeInteger(59)), list(makeKeyword("AND"), cons(reader_make_constant_shell(makeString("HourFn")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("DATE-P-INTERNAL")))), list(reader_make_constant_shell(makeString("SecondFn")), list(makeKeyword("TEST"), makeSymbol("NUMBER-IN-RANGE-P"), ZERO_INTEGER, makeInteger(59)), list(makeKeyword("AND"), cons(reader_make_constant_shell(makeString("MinuteFn")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("DATE-P-INTERNAL")))), list(reader_make_constant_shell(makeString("MilliSecondFn")), list(makeKeyword("TEST"), makeSymbol("NUMBER-IN-RANGE-P"), ZERO_INTEGER, makeInteger(999)), list(makeKeyword("AND"), cons(reader_make_constant_shell(makeString("SecondFn")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("DATE-P-INTERNAL")))), list(reader_make_constant_shell(makeString("DecadeFn")), list(makeKeyword("TEST"), makeSymbol("NON-NEGATIVE-INTEGER-P"))), list(reader_make_constant_shell(makeString("CenturyFn")), makeKeyword("INTEGER")), list(reader_make_constant_shell(makeString("QuarterFn")), makeKeyword("INTEGER"), list(makeKeyword("AND"), cons(reader_make_constant_shell(makeString("YearFn")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("DATE-P-INTERNAL")))) });

    private static final SubLList $list39 = list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("HourFn")), list(makeKeyword("TEST"), makeSymbol("NUMBER-IN-RANGE-P"), ZERO_INTEGER, makeInteger(23)), list(makeKeyword("TEST"), makeSymbol("DAY-FOR-TIME-P-P"))), list(reader_make_constant_shell(makeString("MinuteFn")), list(makeKeyword("TEST"), makeSymbol("NUMBER-IN-RANGE-P"), ZERO_INTEGER, makeInteger(59)), list(makeKeyword("AND"), cons(reader_make_constant_shell(makeString("HourFn")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("TIME-P-INTERNAL")))), list(reader_make_constant_shell(makeString("SecondFn")), list(makeKeyword("TEST"), makeSymbol("NUMBER-IN-RANGE-P"), ZERO_INTEGER, makeInteger(59)), list(makeKeyword("AND"), cons(reader_make_constant_shell(makeString("MinuteFn")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("TIME-P-INTERNAL")))), list(reader_make_constant_shell(makeString("MilliSecondFn")), list(makeKeyword("TEST"), makeSymbol("NUMBER-IN-RANGE-P"), ZERO_INTEGER, makeInteger(999)), list(makeKeyword("AND"), cons(reader_make_constant_shell(makeString("SecondFn")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("TIME-P-INTERNAL")))));

    private static final SubLSymbol $BEGINNING_OF_TIME = makeKeyword("BEGINNING-OF-TIME");

    private static final SubLSymbol $END_OF_TIME = makeKeyword("END-OF-TIME");

    private static final SubLObject $$Always_TimeInterval = reader_make_constant_shell(makeString("Always-TimeInterval"));

    private static final SubLObject $$TheEmptyTimeInterval = reader_make_constant_shell(makeString("TheEmptyTimeInterval"));

    private static final SubLList $list44 = list(reader_make_constant_shell(makeString("CalendarSecond")), reader_make_constant_shell(makeString("CalendarMinute")), reader_make_constant_shell(makeString("CalendarHour")), reader_make_constant_shell(makeString("CalendarDay")), reader_make_constant_shell(makeString("CalendarMonth")), reader_make_constant_shell(makeString("CalendarYear")));

    private static final SubLList $list45 = list(list(makeSymbol("TIME-TYPE-VAR"), makeSymbol("&KEY"), makeSymbol("DONE?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list46 = list(makeKeyword("DONE?"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    public static final SubLSymbol $date_units_ordered$ = makeSymbol("*DATE-UNITS-ORDERED*");

    private static final SubLList $list51 = list(makeKeyword("CALENDAR"), makeKeyword("QUARTER"), makeKeyword("DECADE"), makeKeyword("CENTURY"));





    private static final SubLSymbol EXTRACT_DATE_YEAR = makeSymbol("EXTRACT-DATE-YEAR");



    private static final SubLSymbol EXTRACT_DATE_MONTH_NUMBER = makeSymbol("EXTRACT-DATE-MONTH-NUMBER");

    private static final SubLSymbol EXTRACT_DATE_DAY = makeSymbol("EXTRACT-DATE-DAY");

    private static final SubLSymbol EXTRACT_DATE_HOUR = makeSymbol("EXTRACT-DATE-HOUR");

    private static final SubLSymbol EXTRACT_DATE_MINUTE = makeSymbol("EXTRACT-DATE-MINUTE");

    private static final SubLSymbol EXTRACT_DATE_SECOND = makeSymbol("EXTRACT-DATE-SECOND");

    private static final SubLSymbol EXTRACT_DATE_MILLISECOND = makeSymbol("EXTRACT-DATE-MILLISECOND");

    private static final SubLSymbol TIME_P = makeSymbol("TIME-P");

    private static final SubLObject $$CalendarMilliSecond = reader_make_constant_shell(makeString("CalendarMilliSecond"));

    private static final SubLObject $$CalendarSecond = reader_make_constant_shell(makeString("CalendarSecond"));

    private static final SubLObject $$CalendarMinute = reader_make_constant_shell(makeString("CalendarMinute"));

    private static final SubLObject $$CalendarHour = reader_make_constant_shell(makeString("CalendarHour"));

    private static final SubLObject $$CalendarDay = reader_make_constant_shell(makeString("CalendarDay"));

    private static final SubLObject $$CalendarMonth = reader_make_constant_shell(makeString("CalendarMonth"));

    private static final SubLObject $$CalendarYear = reader_make_constant_shell(makeString("CalendarYear"));

    private static final SubLString $str70$_a_is_not_a_valid_date_ = makeString("~a is not a valid date.");



    private static final SubLString $str72$Can_t_handle_a_date_of__S_yet = makeString("Can't handle a date of ~S yet");

    private static final SubLObject $$QuarterFn = reader_make_constant_shell(makeString("QuarterFn"));

    private static final SubLObject $$DecadeFn = reader_make_constant_shell(makeString("DecadeFn"));

    private static final SubLObject $$CenturyFn = reader_make_constant_shell(makeString("CenturyFn"));

    private static final SubLString $str76$_a_is_not_a_valid_time = makeString("~a is not a valid time");



    private static final SubLObject $$TheYear_Indexical = reader_make_constant_shell(makeString("TheYear-Indexical"));







    private static final SubLString $str82$Can_t_attach_month__S_to_date__S = makeString("Can't attach month ~S to date ~S");

    private static final SubLString $str83$Can_t_attach_day__S_to_date__S = makeString("Can't attach day ~S to date ~S");

    private static final SubLString $str84$Can_t_attach_hour__S_to_date__S = makeString("Can't attach hour ~S to date ~S");

    private static final SubLString $str85$Can_t_attach_minute__S_to_date__S = makeString("Can't attach minute ~S to date ~S");

    private static final SubLString $str86$Can_t_attach_sec__S_to_date__S = makeString("Can't attach sec ~S to date ~S");

    private static final SubLString $str87$Can_t_attach_millisec__S_to_date_ = makeString("Can't attach millisec ~S to date ~S");

    private static final SubLString $str88$Can_t_attach_quarter__S_to_date__ = makeString("Can't attach quarter ~S to date ~S");

    private static final SubLString $str89$Can_t_construct_date_with_decade_ = makeString("Can't construct date with decade ~S");

    private static final SubLString $str90$Can_t_construct_date_with_century = makeString("Can't construct date with century ~S");

    private static final SubLObject $$YearsDuration = reader_make_constant_shell(makeString("YearsDuration"));

    private static final SubLObject $$MonthsDuration = reader_make_constant_shell(makeString("MonthsDuration"));

    private static final SubLObject $$WeeksDuration = reader_make_constant_shell(makeString("WeeksDuration"));

    private static final SubLObject $$DaysDuration = reader_make_constant_shell(makeString("DaysDuration"));

    private static final SubLObject $$HoursDuration = reader_make_constant_shell(makeString("HoursDuration"));

    private static final SubLObject $$MinutesDuration = reader_make_constant_shell(makeString("MinutesDuration"));

    private static final SubLObject $$SecondsDuration = reader_make_constant_shell(makeString("SecondsDuration"));

    private static final SubLObject $$MillisecondsDuration = reader_make_constant_shell(makeString("MillisecondsDuration"));



    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLInteger $int$24 = makeInteger(24);

    private static final SubLObject $$QuartersDuration = reader_make_constant_shell(makeString("QuartersDuration"));

    private static final SubLObject $$DecadesDuration = reader_make_constant_shell(makeString("DecadesDuration"));

    private static final SubLInteger $int$120 = makeInteger(120);

    private static final SubLObject $$CenturiesDuration = reader_make_constant_shell(makeString("CenturiesDuration"));

    private static final SubLInteger $int$1200 = makeInteger(1200);

    private static final SubLList $list107 = list(new SubLObject[]{ reader_make_constant_shell(makeString("January")), reader_make_constant_shell(makeString("February")), reader_make_constant_shell(makeString("March")), reader_make_constant_shell(makeString("April")), reader_make_constant_shell(makeString("May")), reader_make_constant_shell(makeString("June")), reader_make_constant_shell(makeString("July")), reader_make_constant_shell(makeString("August")), reader_make_constant_shell(makeString("September")), reader_make_constant_shell(makeString("October")), reader_make_constant_shell(makeString("November")), reader_make_constant_shell(makeString("December")) });

    private static final SubLString $str108$A_KB_dependent_date_specific_func = makeString("A KB-dependent date-specific function was called, but the current Cyc KB does not contain knowledge about dates.");

    private static final SubLSymbol VALID_MONTH_NUMBER_P = makeSymbol("VALID-MONTH-NUMBER-P");

    private static final SubLSymbol MONTH_TERM_P = makeSymbol("MONTH-TERM-P");

    private static final SubLObject $$MonthOfYearFn = reader_make_constant_shell(makeString("MonthOfYearFn"));

    private static final SubLList $list112 = list(reader_make_constant_shell(makeString("Sunday")), reader_make_constant_shell(makeString("Monday")), reader_make_constant_shell(makeString("Tuesday")), reader_make_constant_shell(makeString("Wednesday")), reader_make_constant_shell(makeString("Thursday")), reader_make_constant_shell(makeString("Friday")), reader_make_constant_shell(makeString("Saturday")));

    private static final SubLString $str113$_S_is_not_a_valid_day_of_week_num = makeString("~S is not a valid day-of-week number");

    private static final SubLSymbol DAY_OF_WEEK_P = makeSymbol("DAY-OF-WEEK-P");





    private static final SubLObject $$DayOfMonthFn = reader_make_constant_shell(makeString("DayOfMonthFn"));

    private static final SubLList $list118 = list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), ONE_INTEGER)));

    private static final SubLInteger $int$365 = makeInteger(365);

    private static final SubLInteger $int$400 = makeInteger(400);

    private static final SubLInteger $int$367 = makeInteger(367);

    private static final SubLInteger $int$362 = makeInteger(362);



    private static final SubLList $list124 = list(new SubLObject[]{ reader_make_constant_shell(makeString("TimeOfDay-MidnightHour")), reader_make_constant_shell(makeString("TimeOfDay-1AM")), reader_make_constant_shell(makeString("TimeOfDay-2AM")), reader_make_constant_shell(makeString("TimeOfDay-3AM")), reader_make_constant_shell(makeString("TimeOfDay-4AM")), reader_make_constant_shell(makeString("TimeOfDay-5AM")), reader_make_constant_shell(makeString("TimeOfDay-6AM")), reader_make_constant_shell(makeString("TimeOfDay-7AM")), reader_make_constant_shell(makeString("TimeOfDay-8AM")), reader_make_constant_shell(makeString("TimeOfDay-9AM")), reader_make_constant_shell(makeString("TimeOfDay-10AM")), reader_make_constant_shell(makeString("TimeOfDay-11AM")), reader_make_constant_shell(makeString("TimeOfDay-NoonHour")), reader_make_constant_shell(makeString("TimeOfDay-1PM")), reader_make_constant_shell(makeString("TimeOfDay-2PM")), reader_make_constant_shell(makeString("TimeOfDay-3PM")), reader_make_constant_shell(makeString("TimeOfDay-4PM")), reader_make_constant_shell(makeString("TimeOfDay-5PM")), reader_make_constant_shell(makeString("TimeOfDay-6PM")), reader_make_constant_shell(makeString("TimeOfDay-7PM")), reader_make_constant_shell(makeString("TimeOfDay-8PM")), reader_make_constant_shell(makeString("TimeOfDay-9PM")), reader_make_constant_shell(makeString("TimeOfDay-10PM")), reader_make_constant_shell(makeString("TimeOfDay-11PM")) });

    private static final SubLObject $$HourOfDayFn = reader_make_constant_shell(makeString("HourOfDayFn"));

    private static final SubLString $str126$Continue_with_nil_hour_of_day_ = makeString("Continue with nil hour of day?");

    private static final SubLString $str127$_a_did_not_specify_a_day_ = makeString("~a did not specify a day.");

    private static final SubLObject $$TimeOfDayFn = reader_make_constant_shell(makeString("TimeOfDayFn"));

    private static final SubLObject $$TimeOfHourFn = reader_make_constant_shell(makeString("TimeOfHourFn"));

    private static final SubLObject $$TimeOfMinuteFn = reader_make_constant_shell(makeString("TimeOfMinuteFn"));

    private static final SubLObject $$MinuteOfHourFn = reader_make_constant_shell(makeString("MinuteOfHourFn"));

    private static final SubLString $str132$Continue_with_nil_minute_of_hour_ = makeString("Continue with nil minute of hour?");

    private static final SubLString $str133$_a_did_not_specify_a_hour_ = makeString("~a did not specify a hour.");

    private static final SubLObject $$SecondOfMinuteFn = reader_make_constant_shell(makeString("SecondOfMinuteFn"));

    private static final SubLString $str135$Continue_with_nil_second_of_minut = makeString("Continue with nil second of minute?");

    private static final SubLString $str136$_a_did_not_specify_a_minute_ = makeString("~a did not specify a minute.");

    private static final SubLObject $$MillisecondOfSecondFn = reader_make_constant_shell(makeString("MillisecondOfSecondFn"));

    private static final SubLString $str138$Continue_with_nil_millisecond_of_ = makeString("Continue with nil millisecond of second?");

    private static final SubLString $str139$_a_did_not_specify_a_second_ = makeString("~a did not specify a second.");

    private static final SubLObject $$CalendarWeek = reader_make_constant_shell(makeString("CalendarWeek"));

    private static final SubLObject $$Sunday = reader_make_constant_shell(makeString("Sunday"));

    private static final SubLObject $$January = reader_make_constant_shell(makeString("January"));

    private static final SubLObject $$CalendarQuarter = reader_make_constant_shell(makeString("CalendarQuarter"));

    private static final SubLInteger $int$59 = makeInteger(59);

    private static final SubLInteger $int$23 = makeInteger(23);

    private static final SubLObject $$Saturday = reader_make_constant_shell(makeString("Saturday"));

    private static final SubLObject $$December = reader_make_constant_shell(makeString("December"));

    private static final SubLObject $$CalendarDecade = reader_make_constant_shell(makeString("CalendarDecade"));

    private static final SubLObject $$CalendarCentury = reader_make_constant_shell(makeString("CalendarCentury"));

    private static final SubLSymbol INFERENCE_DEFINING_TIME_UNIT = makeSymbol("INFERENCE-DEFINING-TIME-UNIT");

    private static final SubLObject $$definingTimeUnit = reader_make_constant_shell(makeString("definingTimeUnit"));

    private static final SubLSymbol INFERENCE_DEFINING_TIME_UNIT_GET_INTERVAL = makeSymbol("INFERENCE-DEFINING-TIME-UNIT-GET-INTERVAL");

    private static final SubLString $str153$_a_is_not_a_valid_cycl_date_ = makeString("~a is not a valid cycl date.");

    private static final SubLInteger $int$999 = makeInteger(999);

    private static final SubLInteger $int$29 = makeInteger(29);

    private static final SubLList $list156 = list(reader_make_constant_shell(makeString("SecondsDuration")), reader_make_constant_shell(makeString("MinutesDuration")), reader_make_constant_shell(makeString("HoursDuration")), reader_make_constant_shell(makeString("DaysDuration")), reader_make_constant_shell(makeString("MonthsDuration")), reader_make_constant_shell(makeString("YearsDuration")));

    private static final SubLSymbol DURATION_P = makeSymbol("DURATION-P");

    private static final SubLString $str158$Could_not_determine_precision_for = makeString("Could not determine precision for ~a or ~a.~%");

    private static final SubLInteger $int$10000000000 = makeInteger("10000000000");

    private static final SubLString $str160$Expected_a___DaysDuration_nat__go = makeString("Expected a #$DaysDuration nat, got ~s");

    private static final SubLSymbol $temporal_indexicals$ = makeSymbol("*TEMPORAL-INDEXICALS*");

    private static final SubLList $list162 = list(reader_make_constant_shell(makeString("Now")), reader_make_constant_shell(makeString("Now-Indexical")), reader_make_constant_shell(makeString("Today-Indexical")), reader_make_constant_shell(makeString("Tomorrow-Indexical")), reader_make_constant_shell(makeString("Yesterday-Indexical")));

    private static final SubLSymbol TEMPORAL_INDEXICAL_P = makeSymbol("TEMPORAL-INDEXICAL-P");

    private static final SubLSymbol TEMPORAL_INDEXICAL_EXPAND = makeSymbol("TEMPORAL-INDEXICAL-EXPAND");

    private static final SubLSymbol BIND_TEMPORAL_INDEXICAL_IN_OBJECT = makeSymbol("BIND-TEMPORAL-INDEXICAL-IN-OBJECT");

    private static final SubLList $list166 = list(list(makeSymbol("*INFERENCE-NOW*"), list(makeSymbol("GET-UNIVERSAL-TIME"))));

    private static final SubLList $list167 = list(list(makeSymbol("*INFERENCE-NOW*"), list(makeSymbol("GET-INFERENCE-NOW"))));

    private static final SubLList $list168 = list(list(makeSymbol("*INFERENCE-NOW*"), list(makeSymbol("FIRST-OF"), makeSymbol("*INFERENCE-NOW*"), list(makeSymbol("GET-INFERENCE-NOW")))));

    private static final SubLInteger $int$100000 = makeInteger(100000);

    private static final SubLInteger $int$10000000 = makeInteger(10000000);

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLList $list172 = list(reader_make_constant_shell(makeString("DaysDuration")), ONE_INTEGER);

    private static final SubLInteger $int$1970 = makeInteger(1970);

    private static final SubLObject $$TimeOfDay_AM = reader_make_constant_shell(makeString("TimeOfDay-AM"));

    private static final SubLObject $$TimeOfDay_MidnightHour = reader_make_constant_shell(makeString("TimeOfDay-MidnightHour"));

    private static final SubLObject $$TimeOfDay_PM = reader_make_constant_shell(makeString("TimeOfDay-PM"));

    private static final SubLObject $$TimeOfDay_NoonHour = reader_make_constant_shell(makeString("TimeOfDay-NoonHour"));

    private static final SubLObject $$TimeOfYearFn = reader_make_constant_shell(makeString("TimeOfYearFn"));

    private static final SubLObject $$TimeOfMonthFn = reader_make_constant_shell(makeString("TimeOfMonthFn"));

    private static final SubLObject $$DayOfYearFn = reader_make_constant_shell(makeString("DayOfYearFn"));

    private static final SubLObject $$TimeOfWeekFn = reader_make_constant_shell(makeString("TimeOfWeekFn"));





    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $$$from_ = makeString("from ");

    private static final SubLString $$$_to_ = makeString(" to ");

    private static final SubLString $str188$Can_t_support____or____time_inter = makeString("Can't support [) or (] time intervals.");

    private static final SubLString $str189$Can_t_support____or____time_inter = makeString("Can't support [) or (] time intervals.~%");



    private static final SubLString $str191$_ = makeString("/");

    private static final SubLString $str192$_ = makeString("-");

    private static final SubLString $str193$_ = makeString(".");

    private static final SubLList $list194 = list(makeString("."), makeString("-"), makeString("/"), makeString(" "));

    private static final SubLList $list195 = list(makeString(":"), makeString(" "));

    private static final SubLList $list196 = list(makeSymbol("DAY"), makeSymbol("MONTH"), makeSymbol("YEAR"));

    private static final SubLString $str197$_ = makeString(":");

    private static final SubLList $list198 = list(makeString(" , "), makeString("-"), makeString("/"), makeString(" "), makeString(", "), makeString(","), makeString(". "), makeString("."));

    private static final SubLSymbol $sym199$TIME_TOKEN_ = makeSymbol("TIME-TOKEN?");

    private static final SubLList $list200 = list(makeSymbol("TOKEN-KEY"), makeSymbol("TOKEN-VALUE"));







    private static final SubLList $list204 = list(makeString(":"));

    private static final SubLString $$$0 = makeString("0");

    private static final SubLInteger $int$1800 = makeInteger(1800);

    private static final SubLInteger $int$2200 = makeInteger(2200);

    private static final SubLSymbol VALID_NUMBER_STRING_CHAR = makeSymbol("VALID-NUMBER-STRING-CHAR");

    private static final SubLInteger $int$2000 = makeInteger(2000);

    private static final SubLInteger $int$1900 = makeInteger(1900);

    private static final SubLList $list211 = list(new SubLObject[]{ list(makeKeyword("YEAR")), list(makeKeyword("YEAR"), makeKeyword("MONTH-NUM")), list(makeKeyword("YEAR"), makeKeyword("MONTH-NUM"), makeKeyword("DAY")), list(makeKeyword("YEAR"), makeKeyword("MONTH-NUM"), makeKeyword("DAY"), makeKeyword("HOUR")), list(makeKeyword("YEAR"), makeKeyword("MONTH-NUM"), makeKeyword("DAY"), makeKeyword("TIME")), list(makeKeyword("YEAR"), makeKeyword("MONTH-NUM"), makeKeyword("DAY"), makeKeyword("TIME"), makeKeyword("MILLISECONDS")), list(makeKeyword("YEAR"), makeKeyword("MONTH-NAME")), list(makeKeyword("YEAR"), makeKeyword("MONTH-NAME"), makeKeyword("DAY")), list(makeKeyword("YEAR"), makeKeyword("DAY"), makeKeyword("MONTH-NAME")), list(makeKeyword("MONTH-NAME"), makeKeyword("DAY"), makeKeyword("INDEXICAL-YEAR")), list(makeKeyword("MONTH-NUM"), makeKeyword("DAY"), makeKeyword("INDEXICAL-YEAR")), list(makeKeyword("MONTH-NAME"), makeKeyword("YEAR")), list(makeKeyword("MONTH-NUM"), makeKeyword("YEAR")), list(makeKeyword("TIME"), makeKeyword("MONTH-NAME"), makeKeyword("DAY"), makeKeyword("YEAR")), list(makeKeyword("MONTH-NAME"), makeKeyword("DAY"), makeKeyword("YEAR")), list(makeKeyword("TIME"), makeKeyword("MONTH-NUM"), makeKeyword("DAY"), makeKeyword("YEAR")), list(makeKeyword("MONTH-NUM"), makeKeyword("DAY"), makeKeyword("YEAR")), list(makeKeyword("DAY"), makeKeyword("MONTH-NUM"), makeKeyword("YEAR")), list(makeKeyword("TIME"), makeKeyword("DAY"), makeKeyword("MONTH-NAME"), makeKeyword("YEAR")), list(makeKeyword("DAY"), makeKeyword("MONTH-NAME"), makeKeyword("YEAR")), list(makeKeyword("DAY-NAME"), makeKeyword("DAY"), makeKeyword("MONTH-NAME"), makeKeyword("YEAR"), makeKeyword("TIME"), makeKeyword("TIME-ZONE")) });

    private static final SubLList $list212 = list(list(makeKeyword("MONTH-NAME"), makeKeyword("DAY"), makeKeyword("UNKNOWN-YEAR")), list(makeKeyword("MONTH-NUM"), makeKeyword("DAY"), makeKeyword("UNKNOWN-YEAR")), list(makeKeyword("MONTH-NAME"), makeKeyword("YEAR"), makeKeyword("UNKNOWN-DAY")), list(makeKeyword("MONTH-NAME"), makeKeyword("UNKNOWN-YEAR")));

    private static final SubLString $$$of = makeString("of");

    private static final SubLString $str214$ = makeString("");





    private static final SubLSymbol $sym217$_YEAR = makeSymbol("?YEAR");

    private static final SubLSymbol $sym218$_DAY = makeSymbol("?DAY");















    private static final SubLSymbol $sym226$YEAR_TOKEN_ = makeSymbol("YEAR-TOKEN?");

    private static final SubLSymbol $sym227$DAY_TOKEN_ = makeSymbol("DAY-TOKEN?");

    public static final SubLList $list228 = list(new SubLObject[]{ list(makeString("one"), ONE_INTEGER), list(makeString("two"), TWO_INTEGER), list(makeString("three"), THREE_INTEGER), list(makeString("four"), FOUR_INTEGER), list(makeString("five"), FIVE_INTEGER), list(makeString("six"), SIX_INTEGER), list(makeString("seven"), SEVEN_INTEGER), list(makeString("eight"), EIGHT_INTEGER), list(makeString("nine"), NINE_INTEGER), list(makeString("ten"), TEN_INTEGER), list(makeString("eleven"), ELEVEN_INTEGER), list(makeString("twelve"), TWELVE_INTEGER), list(makeString("thirteen"), THIRTEEN_INTEGER), list(makeString("fourteen"), FOURTEEN_INTEGER), list(makeString("fifteen"), FIFTEEN_INTEGER), list(makeString("sixteen"), SIXTEEN_INTEGER), list(makeString("seventeen"), SEVENTEEN_INTEGER), list(makeString("eighteen"), EIGHTEEN_INTEGER), list(makeString("nineteen"), NINETEEN_INTEGER), list(makeString("twenty"), TWENTY_INTEGER), list(makeString("twenty-one"), makeInteger(21)), list(makeString("twenty-two"), makeInteger(22)), list(makeString("twenty-three"), makeInteger(23)), list(makeString("twenty-four"), makeInteger(24)), list(makeString("twenty-five"), makeInteger(25)), list(makeString("twenty-six"), makeInteger(26)), list(makeString("twenty-seven"), makeInteger(27)), list(makeString("twenty-eight"), makeInteger(28)), list(makeString("twenty-nine"), makeInteger(29)), list(makeString("thirty"), makeInteger(30)), list(makeString("thirty-one"), makeInteger(31)), list(makeString("twenty one"), makeInteger(21)), list(makeString("twenty two"), makeInteger(22)), list(makeString("twenty three"), makeInteger(23)), list(makeString("twenty four"), makeInteger(24)), list(makeString("twenty five"), makeInteger(25)), list(makeString("twenty six"), makeInteger(26)), list(makeString("twenty seven"), makeInteger(27)), list(makeString("twenty eight"), makeInteger(28)), list(makeString("twenty nine"), makeInteger(29)), list(makeString("thirty one"), makeInteger(31)), list(makeString("first"), ONE_INTEGER), list(makeString("second"), TWO_INTEGER), list(makeString("third"), THREE_INTEGER), list(makeString("fourth"), FOUR_INTEGER), list(makeString("fifth"), FIVE_INTEGER), list(makeString("sixth"), SIX_INTEGER), list(makeString("seventh"), SEVEN_INTEGER), list(makeString("eighth"), EIGHT_INTEGER), list(makeString("ninth"), NINE_INTEGER), list(makeString("tenth"), TEN_INTEGER), list(makeString("eleventh"), ELEVEN_INTEGER), list(makeString("twelfth"), TWELVE_INTEGER), list(makeString("thirteenth"), THIRTEEN_INTEGER), list(makeString("fourteenth"), FOURTEEN_INTEGER), list(makeString("fifteenth"), FIFTEEN_INTEGER), list(makeString("sixteenth"), SIXTEEN_INTEGER), list(makeString("seventeenth"), SEVENTEEN_INTEGER), list(makeString("eighteenth"), EIGHTEEN_INTEGER), list(makeString("nineteenth"), NINETEEN_INTEGER), list(makeString("twentieth"), TWENTY_INTEGER), list(makeString("twenty-first"), makeInteger(21)), list(makeString("twenty-second"), makeInteger(22)), list(makeString("twenty-third"), makeInteger(23)), list(makeString("twenty-fourth"), makeInteger(24)), list(makeString("twenty-fifth"), makeInteger(25)), list(makeString("twenty-sixth"), makeInteger(26)), list(makeString("twenty-seventh"), makeInteger(27)), list(makeString("twenty-eighth"), makeInteger(28)), list(makeString("twenty-ninth"), makeInteger(29)), list(makeString("thirtieth"), makeInteger(30)), list(makeString("thirty-first"), makeInteger(31)), list(makeString("twenty first"), makeInteger(21)), list(makeString("twenty second"), makeInteger(22)), list(makeString("twenty third"), makeInteger(23)), list(makeString("twenty fourth"), makeInteger(24)), list(makeString("twenty fifth"), makeInteger(25)), list(makeString("twenty sixth"), makeInteger(26)), list(makeString("twenty seventh"), makeInteger(27)), list(makeString("twenty eighth"), makeInteger(28)), list(makeString("twenty ninth"), makeInteger(29)), list(makeString("thirty first"), makeInteger(31)) });

    public static final SubLList $list229 = list(makeSymbol("KEY"), makeSymbol("VALUE"));



    private static final SubLList $list231 = list(makeString("January"), makeString("Jan"));

    private static final SubLList $list232 = list(makeString("February"), makeString("Feb"));

    private static final SubLList $list233 = list(makeString("March"), makeString("mar"));

    private static final SubLList $list234 = list(makeString("April"), makeString("Apr"));

    private static final SubLList $list235 = list(makeString("May"));

    private static final SubLList $list236 = list(makeString("June"), makeString("Jun"));

    private static final SubLList $list237 = list(makeString("July"), makeString("Jul"));

    public static final SubLList $list238 = list(makeString("August"), makeString("Aug"));

    private static final SubLList $list239 = list(makeString("September"), makeString("Sept"), makeString("Sep"));

    private static final SubLList $list240 = list(makeString("October"), makeString("Oct"));

    private static final SubLList $list241 = list(makeString("November"), makeString("Nov"));

    private static final SubLList $list242 = list(makeString("December"), makeString("Dec"));

    public static final SubLList $list243 = list(new SubLObject[]{ makeString("Sunday"), makeString("Sun"), makeString("Monday"), makeString("Mon"), makeString("Tuesday"), makeString("Tue"), makeString("Wednesday"), makeString("Wed"), makeString("Thursday"), makeString("Thu"), makeString("Friday"), makeString("Fri"), makeString("Saturday"), makeString("Sat") });

    private static final SubLList $list244 = list(new SubLObject[]{ makeString("UT"), makeString("GMT"), makeString("EST"), makeString("EDT"), makeString("CST"), makeString("CDT"), makeString("MST"), makeString("MDT"), makeString("PST"), makeString("PDT"), makeString("Z") });

    private static final SubLList $list245 = list(CHAR_hyphen, CHAR_plus);

    private static final SubLSymbol $sym246$MONTH_NUMBER_TOKEN_ = makeSymbol("MONTH-NUMBER-TOKEN?");

    private static final SubLSymbol STRING_TO_INTEGER = makeSymbol("STRING-TO-INTEGER");

    private static final SubLString $str248$XML_datetime = makeString("XML-datetime");

    private static final SubLString $str249$_D__2__0D__2__0DT_2__0D__2__0D__2 = makeString("~D-~2,'0D-~2,'0DT~2,'0D:~2,'0D:~2,'0DZ");

    private static final SubLString $str250$MySQL_datetime = makeString("MySQL-datetime");

    private static final SubLString $str251$_D__2__0D__2__0D__2__0D__2__0D__2 = makeString("~D-~2,'0D-~2,'0D ~2,'0D:~2,'0D:~2,'0D");

    private static final SubLString $str252$CycConstant_datetime = makeString("CycConstant-datetime");

    private static final SubLString $str253$_4__0D_2__0D_2__0Dh_2__0Dm_2__0Ds = makeString("~4,'0D~2,'0D~2,'0Dh~2,'0Dm~2,'0Ds~2,'0Dp~3,'0D");

    private static final SubLString $str254$_4__0D_2__0D_2__0Dh_2__0Dm_2__0Ds = makeString("~4,'0D~2,'0D~2,'0Dh~2,'0Dm~2,'0Ds~2,'0D");

    private static final SubLString $str255$_4__0D_2__0D_2__0Dh_2__0Dm_2__0D = makeString("~4,'0D~2,'0D~2,'0Dh~2,'0Dm~2,'0D");

    private static final SubLString $str256$_4__0D_2__0D_2__0Dh_2__0D = makeString("~4,'0D~2,'0D~2,'0Dh~2,'0D");

    private static final SubLString $str257$_4__0D_2__0D_2__0D = makeString("~4,'0D~2,'0D~2,'0D");

    private static final SubLString $str258$_4__0D_2__0D = makeString("~4,'0D~2,'0D");

    private static final SubLString $str259$_4__0D = makeString("~4,'0D");

    private static final SubLString $str260$DateFromStringFn_datetime = makeString("DateFromStringFn-datetime");

    private static final SubLString $str261$_4__0D__2__0D__2__0D__2__0D__2__0 = makeString("~4,'0D-~2,'0D-~2,'0D ~2,'0D:~2,'0D:~2,'0D.~3,'0D");

    private static final SubLString $str262$_4__0D__2__0D__2__0D__2__0D__2__0 = makeString("~4,'0D-~2,'0D-~2,'0D ~2,'0D:~2,'0D:~2,'0D");

    private static final SubLString $str263$_4__0D__2__0D__2__0D__2__0D__2__0 = makeString("~4,'0D-~2,'0D-~2,'0D ~2,'0D:~2,'0D");

    private static final SubLString $str264$_4__0D__2__0D__2__0D__2__0D = makeString("~4,'0D-~2,'0D-~2,'0D ~2,'0D");

    private static final SubLString $str265$_4__0D__2__0D__2__0D = makeString("~4,'0D-~2,'0D-~2,'0D");

    private static final SubLString $str266$_4__0D__2__0D = makeString("~4,'0D-~2,'0D");

    private static final SubLString $$$YYYYMMDD = makeString("YYYYMMDD");

    private static final SubLString $str268$_D_2__0D_2__0D = makeString("~D~2,'0D~2,'0D");

    private static final SubLString $$$HHMMSS = makeString("HHMMSS");

    private static final SubLString $str270$_2__0D_2__0D_2__0D = makeString("~2,'0D~2,'0D~2,'0D");

    private static final SubLString $str271$HH_MM_SS = makeString("HH:MM:SS");

    private static final SubLString $str272$_2__0D__2__0D__2__0D = makeString("~2,'0D:~2,'0D:~2,'0D");

    private static final SubLString $$$YYYYMMDDHHMM = makeString("YYYYMMDDHHMM");

    private static final SubLString $str274$_4__0D_2__0D_2__0D_2__0D_2__0D = makeString("~4,'0D~2,'0D~2,'0D~2,'0D~2,'0D");

    private static final SubLString $str275$YYYY_MM_DD_HH_MM_SS = makeString("YYYY-MM-DD HH:MM:SS");

    private static final SubLString $str276$YYYY_MM_DDTHH_MM_SS = makeString("YYYY-MM-DDTHH:MM:SS");

    private static final SubLString $$$YYYYMMDDHHMMSS = makeString("YYYYMMDDHHMMSS");

    private static final SubLString $str278$_D__2__0D__2__0DT_2__0D__2__0D__2 = makeString("~D-~2,'0D-~2,'0DT~2,'0D:~2,'0D:~2,'0D");

    private static final SubLString $str279$_4__0D_2__0D_2__0D_2__0D_2__0D_2_ = makeString("~4,'0D~2,'0D~2,'0D~2,'0D~2,'0D~2,'0D");

    private static final SubLString $str280$YYYY_MM_DD = makeString("YYYY-MM-DD");

    private static final SubLString $str281$_D__2__0D__2__0D = makeString("~D-~2,'0D-~2,'0D");

    private static final SubLList $list282 = list(makeString("YYYY-MM-DD HH:MM:SS.S"), makeString("YYYY-MM-DDTHH:MM:SS"));

    private static final SubLList $list283 = list(makeString("-"), makeString(" "), makeString(":"), makeString("."));

    private static final SubLList $list284 = list(makeSymbol("&OPTIONAL"), makeSymbol("YEAR"), makeSymbol("MONTH"), makeSymbol("DAY"), makeSymbol("HOUR"), makeSymbol("MINUTE"), makeSymbol("SECOND"), makeSymbol("DECISECOND"));

    private static final SubLInteger $int$21 = makeInteger(21);

    private static final SubLList $list286 = list(makeString("-"), makeString(" "), makeString(":"), makeString("."), makeString("T"), makeString("t"));

    private static final SubLString $$$D = makeString("D");

    private static final SubLString $str288$H_MM_SS = makeString("H:MM:SS");

    private static final SubLString $str289$_D__2__0D__2__0D = makeString("~D:~2,'0D:~2,'0D");

    private static final SubLString $$$HHMM = makeString("HHMM");

    private static final SubLString $str291$_2__0D_2__0D = makeString("~2,'0D~2,'0D");

    private static final SubLString $str292$_cont = makeString(":cont");

    private static final SubLString $str293$The_template__A_is_not_currently_ = makeString("The template ~A is not currently handled.");

    private static final SubLList $list294 = list(CHAR_colon);

    private static final SubLObject $$Date = reader_make_constant_shell(makeString("Date"));

    private static final SubLObject $$laterThan = reader_make_constant_shell(makeString("laterThan"));

    private static final SubLSymbol DATE_AFTER = makeSymbol("DATE-AFTER");













    private static final SubLList $list304 = list(list(list(list(reader_make_constant_shell(makeString("SecondFn")), makeInteger(59), list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(59), list(reader_make_constant_shell(makeString("HourFn")), NINE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), TEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000))))))), list(reader_make_constant_shell(makeString("HoursDuration")), makeDouble(2.5))), list(reader_make_constant_shell(makeString("SecondFn")), makeInteger(59), list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(29), list(reader_make_constant_shell(makeString("HourFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), TEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000)))))))));

    private static final SubLSymbol $sym305$PARSE_DATE_W_OUT_TWO_DIGIT_YEARS = makeSymbol("PARSE-DATE-W/OUT-TWO-DIGIT-YEARS");

    private static final SubLList $list306 = list(makeSymbol("DATE-TEST-CASE-TABLES"));

    private static final SubLList $list307 = list(list(list(makeString("December 20")), list(list(reader_make_constant_shell(makeString("DayFn")), TWENTY_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), reader_make_constant_shell(makeString("TheYear-Indexical")))))), list(list(makeString("12/20")), list(list(reader_make_constant_shell(makeString("DayFn")), TWENTY_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), reader_make_constant_shell(makeString("TheYear-Indexical")))))), list(list(makeString("12/20/18")), NIL), list(list(makeString("12/20/1918")), list(list(reader_make_constant_shell(makeString("DayFn")), TWENTY_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1918)))))));

    private static final SubLSymbol LEAP_YEAR_P = makeSymbol("LEAP-YEAR-P");

    private static final SubLList $list309 = list(list(list(makeInteger(2000)), T), list(list(makeInteger(1900)), NIL), list(list(makeInteger(2004)), T));

    private static final SubLList $list310 = list(list(list(list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000))), T), list(list(list(reader_make_constant_shell(makeString("CenturyFn")), TWENTY_INTEGER)), T));

    private static final SubLList $list311 = list(list(list(list(reader_make_constant_shell(makeString("HourFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), makeInteger(23), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000)))))), T), list(list(list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000))), NIL), list(list(list(reader_make_constant_shell(makeString("CenturyFn")), TWENTY_INTEGER)), NIL));

    private static final SubLSymbol DATE_PRECISION = makeSymbol("DATE-PRECISION");

    private static final SubLList $list313 = list(list(list(list(reader_make_constant_shell(makeString("HourFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), makeInteger(23), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000)))))), reader_make_constant_shell(makeString("CalendarHour"))), list(list(list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), makeInteger(23), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000))))))), reader_make_constant_shell(makeString("CalendarMinute"))), list(list(list(reader_make_constant_shell(makeString("SecondFn")), FIVE_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), makeInteger(23), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000)))))))), reader_make_constant_shell(makeString("CalendarSecond"))), list(list(list(reader_make_constant_shell(makeString("MilliSecondFn")), SIX_INTEGER, list(reader_make_constant_shell(makeString("SecondFn")), FIVE_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), makeInteger(23), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000))))))))), reader_make_constant_shell(makeString("CalendarMilliSecond"))));

    private static final SubLSymbol EXPLODE_CALENDAR_TIME = makeSymbol("EXPLODE-CALENDAR-TIME");

    private static final SubLList $list315 = list(list(new SubLObject[]{ list(list(reader_make_constant_shell(makeString("HourFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), makeInteger(23), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000)))))), makeKeyword("CALENDAR"), makeInteger(2000), ONE_INTEGER, makeInteger(23), TWELVE_INTEGER, NIL, NIL, NIL }), list(new SubLObject[]{ list(list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), makeInteger(23), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000))))))), makeKeyword("CALENDAR"), makeInteger(2000), ONE_INTEGER, makeInteger(23), TWELVE_INTEGER, makeInteger(42), NIL, NIL }), list(new SubLObject[]{ list(list(reader_make_constant_shell(makeString("SecondFn")), FIVE_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), makeInteger(23), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000)))))))), makeKeyword("CALENDAR"), makeInteger(2000), ONE_INTEGER, makeInteger(23), TWELVE_INTEGER, makeInteger(42), FIVE_INTEGER, NIL }), list(new SubLObject[]{ list(list(reader_make_constant_shell(makeString("MilliSecondFn")), SIX_INTEGER, list(reader_make_constant_shell(makeString("SecondFn")), FIVE_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), makeInteger(23), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000))))))))), makeKeyword("CALENDAR"), makeInteger(2000), ONE_INTEGER, makeInteger(23), TWELVE_INTEGER, makeInteger(42), FIVE_INTEGER, SIX_INTEGER }));

    private static final SubLSymbol CYCL_DATE_TO_UNIVERSAL_TIME = makeSymbol("CYCL-DATE-TO-UNIVERSAL-TIME");

    private static final SubLList $list317 = list(list(list(list(reader_make_constant_shell(makeString("HourFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), makeInteger(23), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000)))))), makeInteger("3157639200"), NIL), list(list(list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), makeInteger(23), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000))))))), makeInteger("3157641720"), NIL), list(list(list(reader_make_constant_shell(makeString("SecondFn")), FIVE_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), makeInteger(23), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000)))))))), makeInteger("3157641725"), NIL), list(list(list(reader_make_constant_shell(makeString("MilliSecondFn")), SIX_INTEGER, list(reader_make_constant_shell(makeString("SecondFn")), FIVE_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), makeInteger(23), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000))))))))), makeInteger("3157641725"), SIX_INTEGER));

    private static final SubLSymbol MILLISECONDSTRING = makeSymbol("MILLISECONDSTRING");

    private static final SubLList $list319 = list(list(list(list(reader_make_constant_shell(makeString("HourFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), makeInteger(23), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000)))))), makeString("12:00:00.000")), list(list(list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), makeInteger(23), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000))))))), makeString("12:42:00.000")), list(list(list(reader_make_constant_shell(makeString("SecondFn")), FIVE_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), makeInteger(23), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000)))))))), makeString("12:42:05.000")), list(list(list(reader_make_constant_shell(makeString("MilliSecondFn")), SIX_INTEGER, list(reader_make_constant_shell(makeString("SecondFn")), FIVE_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), makeInteger(23), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000))))))))), makeString("12:42:05.006")));

    private static final SubLSymbol DATE_REDUCED_TO_START = makeSymbol("DATE-REDUCED-TO-START");

    private static final SubLList $list321 = list(list(list(list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))), list(list(list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))), list(list(list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))), list(list(list(reader_make_constant_shell(makeString("HourFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))), list(list(list(reader_make_constant_shell(makeString("MinuteFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("HourFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))))), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))), list(list(list(reader_make_constant_shell(makeString("SecondFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("HourFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))), list(list(list(reader_make_constant_shell(makeString("SecondFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("HourFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("MinuteFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("HourFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))))));

    private static final SubLSymbol DATE_TO_PRECISION = makeSymbol("DATE-TO-PRECISION");

    private static final SubLObject $list323 = _constant_323_initializer();

    private static final SubLSymbol NEXT_ITERATED_CYCLIC_INTERVAL_INCLUSIVE = makeSymbol("NEXT-ITERATED-CYCLIC-INTERVAL-INCLUSIVE");

    private static final SubLObject $list325 = _constant_325_initializer();

    private static final SubLSymbol PARSE_DATE_FROM_STRING_FAST = makeSymbol("PARSE-DATE-FROM-STRING-FAST");

    private static final SubLSymbol $sym327$FAST_SUPERSET_EQUAL_ = makeSymbol("FAST-SUPERSET-EQUAL?");

    private static final SubLObject $list328 = _constant_328_initializer();

    private static final SubLSymbol DATE_QUERY_P = makeSymbol("DATE-QUERY-P");

    private static final SubLList $list330 = list(list(list(list(reader_make_constant_shell(makeString("DayFn")), ELEVEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("August")), list(reader_make_constant_shell(makeString("YearFn")), makeSymbol("?YEAR"))))), T), list(list(list(reader_make_constant_shell(makeString("DayFn")), ELEVEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("August")), list(reader_make_constant_shell(makeString("YearFn")), makeSymbol("?YEAR")))), reader_make_constant_shell(makeString("YearFn"))), T), list(list(list(reader_make_constant_shell(makeString("DayFn")), makeSymbol("?DAY"), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("August")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2001)))), reader_make_constant_shell(makeString("DayFn"))), T), list(list(list(reader_make_constant_shell(makeString("DayFn")), makeSymbol("?DAY"), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("August")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2001)))), reader_make_constant_shell(makeString("YearFn"))), NIL), list(list(list(reader_make_constant_shell(makeString("DayFn")), ELEVEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("September")), reader_make_constant_shell(makeString("TheYear-Indexical"))))), NIL), list(list(list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("September")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2011)))), NIL), list(list(list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("September")), list(reader_make_constant_shell(makeString("YearFn")), ELEVEN_INTEGER))), NIL));

    public static SubLObject initialize_date_kb_feature() {
        if (NIL != list_utilities.every_in_list($sym1$VALID_CONSTANT_, $date_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_date_kb_loaded();
        } else {
            kb_control_vars.unset_date_kb_loaded();
        }
        return kb_control_vars.date_kb_loaded_p();
    }

    public static SubLObject possibly_simple_el_date_p(final SubLObject v_object) {
        return el_formula_with_any_of_operators_p(v_object, $el_date_granularity_order$.getGlobalValue());
    }

    public static SubLObject possibly_el_time_millisecond_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_with_operator_p(v_object, $$MilliSecondFn)) && (NIL != el_binary_formula_p(v_object)));
    }

    public static SubLObject possibly_el_time_second_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_with_operator_p(v_object, $$SecondFn)) && (NIL != el_binary_formula_p(v_object)));
    }

    public static SubLObject possibly_el_time_minute_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_with_operator_p(v_object, $$MinuteFn)) && (NIL != el_binary_formula_p(v_object)));
    }

    public static SubLObject possibly_el_time_hour_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_with_operator_p(v_object, $$HourFn)) && (NIL != el_binary_formula_p(v_object)));
    }

    public static SubLObject possibly_el_date_day_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_with_operator_p(v_object, $$DayFn)) && (NIL != el_binary_formula_p(v_object)));
    }

    public static SubLObject possibly_el_date_month_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_with_operator_p(v_object, $$MonthFn)) && (NIL != el_binary_formula_p(v_object)));
    }

    public static SubLObject possibly_el_date_year_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_with_operator_p(v_object, $$YearFn)) && (NIL != el_unary_formula_p(v_object)));
    }

    public static SubLObject simple_el_date_p(final SubLObject v_object) {
        if (NIL != el_formula_p(v_object)) {
            final SubLObject pcase_var;
            final SubLObject granularity = pcase_var = cycl_utilities.el_formula_operator(v_object);
            if (pcase_var.eql($$MilliSecondFn)) {
                return el_time_millisecond_p(v_object);
            }
            if (pcase_var.eql($$SecondFn)) {
                return el_time_second_p(v_object);
            }
            if (pcase_var.eql($$MinuteFn)) {
                return el_time_minute_p(v_object);
            }
            if (pcase_var.eql($$HourFn)) {
                return el_time_hour_p(v_object);
            }
            if (pcase_var.eql($$DayFn)) {
                return el_date_day_p(v_object);
            }
            if (pcase_var.eql($$MonthFn)) {
                return el_date_month_p(v_object);
            }
            if (pcase_var.eql($$YearFn)) {
                return el_date_year_p(v_object);
            }
        }
        return NIL;
    }

    public static SubLObject el_time_millisecond_p(final SubLObject v_object) {
        return makeBoolean(((NIL != possibly_el_time_millisecond_p(v_object)) && cycl_utilities.el_formula_arg1(v_object, UNPROVIDED).isInteger()) && (NIL != el_time_second_p(cycl_utilities.el_formula_arg2(v_object, UNPROVIDED))));
    }

    public static SubLObject el_time_second_p(final SubLObject v_object) {
        return makeBoolean(((NIL != possibly_el_time_second_p(v_object)) && cycl_utilities.el_formula_arg1(v_object, UNPROVIDED).isInteger()) && (NIL != el_time_minute_p(cycl_utilities.el_formula_arg2(v_object, UNPROVIDED))));
    }

    public static SubLObject el_time_minute_p(final SubLObject v_object) {
        return makeBoolean(((NIL != possibly_el_time_minute_p(v_object)) && cycl_utilities.el_formula_arg1(v_object, UNPROVIDED).isInteger()) && (NIL != el_time_hour_p(cycl_utilities.el_formula_arg2(v_object, UNPROVIDED))));
    }

    public static SubLObject el_time_hour_p(final SubLObject v_object) {
        return makeBoolean(((NIL != possibly_el_time_hour_p(v_object)) && cycl_utilities.el_formula_arg1(v_object, UNPROVIDED).isInteger()) && (NIL != el_date_day_p(cycl_utilities.el_formula_arg2(v_object, UNPROVIDED))));
    }

    public static SubLObject el_date_day_p(final SubLObject v_object) {
        return makeBoolean(((NIL != possibly_el_date_day_p(v_object)) && cycl_utilities.el_formula_arg1(v_object, UNPROVIDED).isInteger()) && (NIL != el_date_month_p(cycl_utilities.el_formula_arg2(v_object, UNPROVIDED))));
    }

    public static SubLObject el_date_month_p(final SubLObject v_object) {
        return makeBoolean(((NIL != possibly_el_date_month_p(v_object)) && (NIL != month_p(cycl_utilities.el_formula_arg1(v_object, UNPROVIDED)))) && (NIL != el_date_year_p(cycl_utilities.el_formula_arg2(v_object, UNPROVIDED))));
    }

    public static SubLObject el_date_year_p(final SubLObject v_object) {
        return makeBoolean((NIL != possibly_el_date_year_p(v_object)) && cycl_utilities.el_formula_arg1(v_object, UNPROVIDED).isInteger());
    }

    public static SubLObject el_date_time_compare_guts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject result_var = NIL;
        SubLObject early_var = NIL;
        SubLObject later_var = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        result_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        early_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        later_var = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject validator = NIL;
            SubLObject direct_comparator = NIL;
            SubLObject sub_comparator = NIL;
            destructuring_bind_must_consp(current, datum, $list10);
            validator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list10);
            direct_comparator = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list10);
            sub_comparator = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject sub_early = $sym11$SUB_EARLY;
                final SubLObject sub_later = $sym12$SUB_LATER;
                final SubLObject sub_compare = $sym13$SUB_COMPARE;
                return list(PROGN, list(ENFORCE_TYPE, early_var, validator), list(ENFORCE_TYPE, later_var, validator), list(CLET, list(list(sub_early, list(EL_FORMULA_ARG2, early_var)), list(sub_later, list(EL_FORMULA_ARG2, later_var)), list(sub_compare, list(sub_comparator, sub_early, sub_later))), list(PCASE, sub_compare, list($list19, list(CSETQ, result_var, sub_compare)), list($EQ, list(CSETQ, result_var, list(direct_comparator, list(EL_FORMULA_ARG1, early_var), list(EL_FORMULA_ARG1, later_var)))))));
            }
            cdestructuring_bind_error(datum, $list10);
        } else {
            cdestructuring_bind_error(datum, $list10);
        }
        return NIL;
    }

    public static SubLObject el_millisecond_compare(final SubLObject early_millisecond, final SubLObject later_millisecond) {
        SubLObject result = NIL;
        SubLTrampolineFile.enforceType(early_millisecond, POSSIBLY_EL_TIME_MILLISECOND_P);
        SubLTrampolineFile.enforceType(later_millisecond, POSSIBLY_EL_TIME_MILLISECOND_P);
        final SubLObject sub_early = cycl_utilities.el_formula_arg2(early_millisecond, UNPROVIDED);
        final SubLObject sub_later = cycl_utilities.el_formula_arg2(later_millisecond, UNPROVIDED);
        final SubLObject pcase_var;
        final SubLObject sub_compare = pcase_var = el_minute_compare(sub_early, sub_later);
        if (pcase_var.eql($LT) || pcase_var.eql($GT)) {
            result = sub_compare;
        } else
            if (pcase_var.eql($EQ)) {
                result = number_compare(cycl_utilities.el_formula_arg1(early_millisecond, UNPROVIDED), cycl_utilities.el_formula_arg1(later_millisecond, UNPROVIDED));
            }

        return result;
    }

    public static SubLObject el_second_compare(final SubLObject early_second, final SubLObject later_second) {
        SubLObject result = NIL;
        SubLTrampolineFile.enforceType(early_second, POSSIBLY_EL_TIME_SECOND_P);
        SubLTrampolineFile.enforceType(later_second, POSSIBLY_EL_TIME_SECOND_P);
        final SubLObject sub_early = cycl_utilities.el_formula_arg2(early_second, UNPROVIDED);
        final SubLObject sub_later = cycl_utilities.el_formula_arg2(later_second, UNPROVIDED);
        final SubLObject pcase_var;
        final SubLObject sub_compare = pcase_var = el_minute_compare(sub_early, sub_later);
        if (pcase_var.eql($LT) || pcase_var.eql($GT)) {
            result = sub_compare;
        } else
            if (pcase_var.eql($EQ)) {
                result = number_compare(cycl_utilities.el_formula_arg1(early_second, UNPROVIDED), cycl_utilities.el_formula_arg1(later_second, UNPROVIDED));
            }

        return result;
    }

    public static SubLObject el_minute_compare(final SubLObject early_minute, final SubLObject later_minute) {
        SubLObject result = NIL;
        SubLTrampolineFile.enforceType(early_minute, POSSIBLY_EL_TIME_MINUTE_P);
        SubLTrampolineFile.enforceType(later_minute, POSSIBLY_EL_TIME_MINUTE_P);
        final SubLObject sub_early = cycl_utilities.el_formula_arg2(early_minute, UNPROVIDED);
        final SubLObject sub_later = cycl_utilities.el_formula_arg2(later_minute, UNPROVIDED);
        final SubLObject pcase_var;
        final SubLObject sub_compare = pcase_var = el_hour_compare(sub_early, sub_later);
        if (pcase_var.eql($LT) || pcase_var.eql($GT)) {
            result = sub_compare;
        } else
            if (pcase_var.eql($EQ)) {
                result = number_compare(cycl_utilities.el_formula_arg1(early_minute, UNPROVIDED), cycl_utilities.el_formula_arg1(later_minute, UNPROVIDED));
            }

        return result;
    }

    public static SubLObject el_hour_compare(final SubLObject early_hour, final SubLObject later_hour) {
        SubLObject result = NIL;
        SubLTrampolineFile.enforceType(early_hour, POSSIBLY_EL_TIME_HOUR_P);
        SubLTrampolineFile.enforceType(later_hour, POSSIBLY_EL_TIME_HOUR_P);
        final SubLObject sub_early = cycl_utilities.el_formula_arg2(early_hour, UNPROVIDED);
        final SubLObject sub_later = cycl_utilities.el_formula_arg2(later_hour, UNPROVIDED);
        final SubLObject pcase_var;
        final SubLObject sub_compare = pcase_var = el_day_compare(sub_early, sub_later);
        if (pcase_var.eql($LT) || pcase_var.eql($GT)) {
            result = sub_compare;
        } else
            if (pcase_var.eql($EQ)) {
                result = number_compare(cycl_utilities.el_formula_arg1(early_hour, UNPROVIDED), cycl_utilities.el_formula_arg1(later_hour, UNPROVIDED));
            }

        return result;
    }

    public static SubLObject el_day_compare(final SubLObject early_day, final SubLObject later_day) {
        SubLObject result = NIL;
        SubLTrampolineFile.enforceType(early_day, POSSIBLY_EL_DATE_DAY_P);
        SubLTrampolineFile.enforceType(later_day, POSSIBLY_EL_DATE_DAY_P);
        final SubLObject sub_early = cycl_utilities.el_formula_arg2(early_day, UNPROVIDED);
        final SubLObject sub_later = cycl_utilities.el_formula_arg2(later_day, UNPROVIDED);
        final SubLObject pcase_var;
        final SubLObject sub_compare = pcase_var = el_month_compare(sub_early, sub_later);
        if (pcase_var.eql($LT) || pcase_var.eql($GT)) {
            result = sub_compare;
        } else
            if (pcase_var.eql($EQ)) {
                result = number_compare(cycl_utilities.el_formula_arg1(early_day, UNPROVIDED), cycl_utilities.el_formula_arg1(later_day, UNPROVIDED));
            }

        return result;
    }

    public static SubLObject el_month_compare(final SubLObject early_month, final SubLObject later_month) {
        SubLObject result = NIL;
        SubLTrampolineFile.enforceType(early_month, POSSIBLY_EL_DATE_MONTH_P);
        SubLTrampolineFile.enforceType(later_month, POSSIBLY_EL_DATE_MONTH_P);
        final SubLObject sub_early = cycl_utilities.el_formula_arg2(early_month, UNPROVIDED);
        final SubLObject sub_later = cycl_utilities.el_formula_arg2(later_month, UNPROVIDED);
        final SubLObject pcase_var;
        final SubLObject sub_compare = pcase_var = el_year_compare(sub_early, sub_later);
        if (pcase_var.eql($LT) || pcase_var.eql($GT)) {
            result = sub_compare;
        } else
            if (pcase_var.eql($EQ)) {
                result = month_compare(cycl_utilities.el_formula_arg1(early_month, UNPROVIDED), cycl_utilities.el_formula_arg1(later_month, UNPROVIDED));
            }

        return result;
    }

    public static SubLObject el_year_compare(final SubLObject early_year, final SubLObject later_year) {
        SubLTrampolineFile.enforceType(early_year, POSSIBLY_EL_DATE_YEAR_P);
        SubLTrampolineFile.enforceType(later_year, POSSIBLY_EL_DATE_YEAR_P);
        return number_compare(cycl_utilities.el_formula_arg1(early_year, UNPROVIDED), cycl_utilities.el_formula_arg1(later_year, UNPROVIDED));
    }

    public static SubLObject number_compare(final SubLObject num1, final SubLObject num2) {
        if (num1.numL(num2)) {
            return $LT;
        }
        if (num1.numG(num2)) {
            return $GT;
        }
        return $EQ;
    }

    public static SubLObject month_compare(final SubLObject month1, final SubLObject month2) {
        return number_compare(number_of_month(month1), number_of_month(month2));
    }

    public static SubLObject fast_date_L(final SubLObject date1, final SubLObject date2) {
        final SubLObject compare = fast_date_compare(date1, date2);
        return eq($LT, compare);
    }

    public static SubLObject fast_date_LE(final SubLObject date1, final SubLObject date2) {
        final SubLObject compare = fast_date_compare(date1, date2);
        return makeBoolean(($LT == compare) || ($EQ == compare));
    }

    public static SubLObject fast_date_compare(SubLObject date1, SubLObject date2) {
        for (SubLObject gran_compare = el_date_granularity_compare(date1, date2); $EQ != gran_compare; gran_compare = el_date_granularity_compare(date1, date2)) {
            final SubLObject pcase_var = gran_compare;
            if (pcase_var.eql($LT)) {
                date1 = cycl_utilities.el_formula_arg2(date1, UNPROVIDED);
            } else
                if (pcase_var.eql($GT)) {
                    date2 = cycl_utilities.el_formula_arg2(date2, UNPROVIDED);
                }

        }
        return fast_comparable_date_compare(date1, date2);
    }

    public static SubLObject el_date_granularity_compare(final SubLObject date1, final SubLObject date2) {
        final SubLObject operator1 = cycl_utilities.el_formula_operator(date1);
        final SubLObject operator2 = cycl_utilities.el_formula_operator(date2);
        if (NIL != kb_utilities.kbeq(operator1, operator2)) {
            return $EQ;
        }
        return NIL != list_utilities.position_L(operator1, operator2, $el_date_granularity_order$.getGlobalValue(), symbol_function(KBEQ), UNPROVIDED) ? $LT : $GT;
    }

    public static SubLObject fast_comparable_date_compare(final SubLObject date1, final SubLObject date2) {
        final SubLObject pcase_var;
        final SubLObject granularity = pcase_var = cycl_utilities.el_formula_operator(date1);
        if (pcase_var.eql($$MilliSecondFn)) {
            return el_millisecond_compare(date1, date2);
        }
        if (pcase_var.eql($$SecondFn)) {
            return el_second_compare(date1, date2);
        }
        if (pcase_var.eql($$MinuteFn)) {
            return el_minute_compare(date1, date2);
        }
        if (pcase_var.eql($$HourFn)) {
            return el_hour_compare(date1, date2);
        }
        if (pcase_var.eql($$DayFn)) {
            return el_day_compare(date1, date2);
        }
        if (pcase_var.eql($$MonthFn)) {
            return el_month_compare(date1, date2);
        }
        if (pcase_var.eql($$YearFn)) {
            return el_year_compare(date1, date2);
        }
        return Errors.error($str33$unhandled_date_type___S, date1);
    }

    public static SubLObject possibly_hl_date_p(final SubLObject v_object) {
        return makeBoolean((NIL != possibly_date_p(v_object)) || v_object.isInteger());
    }

    public static SubLObject possibly_date_p(final SubLObject v_object) {
        return el_formula_p(v_object);
    }

    public static SubLObject date_p(final SubLObject v_object) {
        return makeBoolean((NIL != possibly_date_p(v_object)) && (NIL != date_p_internal(v_object)));
    }

    public static SubLObject possibly_time_p(final SubLObject v_object) {
        return el_formula_p(v_object);
    }

    public static SubLObject time_p(final SubLObject v_object) {
        return makeBoolean((NIL != possibly_time_p(v_object)) && (NIL != time_p_internal(v_object)));
    }

    public static SubLObject generalized_date_p(final SubLObject v_object) {
        return makeBoolean((((NIL != date_p(v_object)) || (NIL != end_of_timeP(v_object))) || (NIL != beginning_of_timeP(v_object))) || (NIL != always_time_intervalP(v_object)));
    }

    public static SubLObject date_query_p(final SubLObject v_object, SubLObject function) {
        if (function == UNPROVIDED) {
            function = NIL;
        }
        if (NIL != list_utilities.list_of_list_p(v_object)) {
            return NIL;
        }
        SubLObject ans = NIL;
        if (NIL == ans) {
            SubLObject csome_list_var = $date_p_grammar$.getGlobalValue().rest();
            SubLObject rule = NIL;
            rule = csome_list_var.first();
            while ((NIL == ans) && (NIL != csome_list_var)) {
                if (rule.isList() && ((NIL == function) || function.eql(rule.first()))) {
                    ans = (NIL != list_utilities.tree_find($AND, rule, UNPROVIDED, UNPROVIDED)) ? list_utilities.tree_find(list(rule.first(), $EL_VARIABLE, list($AND, $ANYTHING)), v_object, PATTERN_MATCHES_FORMULA_WITHOUT_BINDINGS, UNPROVIDED) : list_utilities.tree_find(list(rule.first(), $EL_VARIABLE), v_object, PATTERN_MATCHES_FORMULA_WITHOUT_BINDINGS, UNPROVIDED);
                }
                csome_list_var = csome_list_var.rest();
                rule = csome_list_var.first();
            } 
        }
        return list_utilities.sublisp_boolean(ans);
    }

    public static SubLObject date_p_internal(final SubLObject formula) {
        return formula_pattern_match.pattern_matches_formula_without_bindings($date_p_grammar$.getGlobalValue(), formula);
    }

    public static SubLObject day_for_time_p_p(final SubLObject v_object) {
        return formula_pattern_match.pattern_matches_formula_without_bindings($ANYTHING, v_object);
    }

    public static SubLObject time_p_internal(final SubLObject formula) {
        return formula_pattern_match.pattern_matches_formula_without_bindings($time_p_grammar$.getGlobalValue(), formula);
    }

    public static SubLObject beginning_of_timeP(final SubLObject date) {
        return eq(date, $beginning_of_time$.getGlobalValue());
    }

    public static SubLObject end_of_timeP(final SubLObject date) {
        return eq(date, $end_of_time$.getGlobalValue());
    }

    public static SubLObject always_time_intervalP(final SubLObject index) {
        return kb_utilities.kbeq(index, $$Always_TimeInterval);
    }

    public static SubLObject empty_time_intervalP(final SubLObject index) {
        return kb_utilities.kbeq(index, $$TheEmptyTimeInterval);
    }

    public static SubLObject date_unitG(final SubLObject unit1, final SubLObject unit2) {
        return subl_promotions.memberP(unit1, member(unit2, $date_units_ordered$.getGlobalValue(), symbol_function(EQ), UNPROVIDED).rest(), symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject do_time_units_ordered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject time_type_var = NIL;
        destructuring_bind_must_consp(current, datum, $list45);
        time_type_var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list45);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list45);
            if (NIL == member(current_$1, $list46, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list45);
        }
        final SubLObject doneP_tail = property_list_member($DONE_, current);
        final SubLObject doneP = (NIL != doneP_tail) ? cadr(doneP_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(CSOME, list(time_type_var, $date_units_ordered$, doneP), append(body, NIL));
    }

    public static SubLObject date_formatG(final SubLObject format1, final SubLObject format2) {
        return subl_promotions.memberP(format1, member(format2, $date_formats_ordered$.getGlobalValue(), symbol_function(EQ), UNPROVIDED).rest(), symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject extract_date_century(final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject format = explode_date(date);
        final SubLObject century = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        final SubLObject minute = thread.sixthMultipleValue();
        final SubLObject second = thread.seventhMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = format;
        if (pcase_var.eql($CENTURY)) {
            return century;
        }
        return NIL;
    }

    public static SubLObject extract_date_decade(final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject format = explode_date(date);
        final SubLObject decade = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        final SubLObject minute = thread.sixthMultipleValue();
        final SubLObject second = thread.seventhMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = format;
        if (pcase_var.eql($CENTURY)) {
            return NIL;
        }
        if (pcase_var.eql($DECADE)) {
            return decade;
        }
        return NIL;
    }

    public static SubLObject extract_date_year(final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject format = explode_date(date);
        final SubLObject year = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        final SubLObject minute = thread.sixthMultipleValue();
        final SubLObject second = thread.seventhMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = format;
        if (pcase_var.eql($DECADE) || pcase_var.eql($CENTURY)) {
            return NIL;
        }
        return year;
    }

    public static SubLObject extract_date_month(final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject format = explode_date(date);
        final SubLObject year = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        final SubLObject minute = thread.sixthMultipleValue();
        final SubLObject second = thread.seventhMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = format;
        if ((pcase_var.eql($QUARTER) || pcase_var.eql($DECADE)) || pcase_var.eql($CENTURY)) {
            return NIL;
        }
        return NIL != numeric_date_utilities.valid_month_number_p(month) ? month_number(month) : NIL;
    }

    public static SubLObject extract_date_month_number(final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject format = explode_date(date);
        final SubLObject year = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        final SubLObject minute = thread.sixthMultipleValue();
        final SubLObject second = thread.seventhMultipleValue();
        thread.resetMultipleValues();
        return month;
    }

    public static SubLObject extract_date_day(final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject format = explode_date(date);
        final SubLObject year = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        final SubLObject minute = thread.sixthMultipleValue();
        final SubLObject second = thread.seventhMultipleValue();
        thread.resetMultipleValues();
        return day;
    }

    public static SubLObject extract_date_hour(final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject format = explode_date(date);
        final SubLObject year = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        final SubLObject minute = thread.sixthMultipleValue();
        final SubLObject second = thread.seventhMultipleValue();
        thread.resetMultipleValues();
        return hour;
    }

    public static SubLObject extract_date_minute(final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject format = explode_date(date);
        final SubLObject year = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        final SubLObject minute = thread.sixthMultipleValue();
        final SubLObject second = thread.seventhMultipleValue();
        thread.resetMultipleValues();
        return minute;
    }

    public static SubLObject extract_date_second(final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject format = explode_date(date);
        final SubLObject year = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        final SubLObject minute = thread.sixthMultipleValue();
        final SubLObject second = thread.seventhMultipleValue();
        thread.resetMultipleValues();
        return second;
    }

    public static SubLObject extract_date_millisecond(final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject format = explode_date(date);
        final SubLObject year = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        final SubLObject minute = thread.sixthMultipleValue();
        final SubLObject second = thread.seventhMultipleValue();
        final SubLObject millisecond = thread.eighthMultipleValue();
        thread.resetMultipleValues();
        return millisecond;
    }

    public static SubLObject millisecondstring(final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != time_p(time) : "date_utilities.time_p(time) " + "CommonSymbols.NIL != date_utilities.time_p(time) " + time;
        thread.resetMultipleValues();
        final SubLObject time_type = explode_calendar_time(time);
        final SubLObject year = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        SubLObject min = thread.sixthMultipleValue();
        SubLObject sec = thread.seventhMultipleValue();
        SubLObject millisec = thread.eighthMultipleValue();
        thread.resetMultipleValues();
        if (NIL == min) {
            min = ZERO_INTEGER;
        }
        if (NIL == sec) {
            sec = ZERO_INTEGER;
        }
        if (NIL == millisec) {
            millisec = ZERO_INTEGER;
        }
        return numeric_date_utilities.encode_millisecondstring(hour, min, sec, millisec);
    }

    public static SubLObject extract_date_time_type(final SubLObject date, final SubLObject type) {
        if (type.eql($$CalendarMilliSecond)) {
            return extract_date_millisecond(date);
        }
        if (type.eql($$CalendarSecond)) {
            return extract_date_second(date);
        }
        if (type.eql($$CalendarMinute)) {
            return extract_date_minute(date);
        }
        if (type.eql($$CalendarHour)) {
            return extract_date_hour(date);
        }
        if (type.eql($$CalendarDay)) {
            return extract_date_day(date);
        }
        if (type.eql($$CalendarMonth)) {
            return extract_date_month(date);
        }
        if (type.eql($$CalendarYear)) {
            return extract_date_year(date);
        }
        return NIL;
    }

    public static SubLObject explode_date(final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == date_p(date))) {
            Errors.error($str70$_a_is_not_a_valid_date_, date);
        }
        final SubLObject pcase_var = date_format(date);
        if (pcase_var.eql($CALENDAR)) {
            return explode_calendar_date(date);
        }
        if (pcase_var.eql($QUARTER)) {
            return explode_quarter_date(date);
        }
        if (pcase_var.eql($DECADE)) {
            return explode_decade_date(date);
        }
        if (pcase_var.eql($CENTURY)) {
            return explode_century_date(date);
        }
        Errors.error($str72$Can_t_handle_a_date_of__S_yet, date);
        return NIL;
    }

    public static SubLObject date_format(final SubLObject date) {
        final SubLObject pcase_var = date.first();
        if ((((((pcase_var.eql($$YearFn) || pcase_var.eql($$MonthFn)) || pcase_var.eql($$DayFn)) || pcase_var.eql($$HourFn)) || pcase_var.eql($$MinuteFn)) || pcase_var.eql($$SecondFn)) || pcase_var.eql($$MilliSecondFn)) {
            return $CALENDAR;
        }
        if (pcase_var.eql($$QuarterFn)) {
            return $QUARTER;
        }
        if (pcase_var.eql($$DecadeFn)) {
            return $DECADE;
        }
        if (pcase_var.eql($$CenturyFn)) {
            return $CENTURY;
        }
        Errors.error($str72$Can_t_handle_a_date_of__S_yet, date);
        return NIL;
    }

    public static SubLObject explode_calendar_time(final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == time_p(time))) {
            Errors.error($str76$_a_is_not_a_valid_time, time);
        }
        return explode_calendar_date(time);
    }

    public static SubLObject explode_calendar_date(SubLObject date) {
        SubLObject year = NIL;
        SubLObject month = NIL;
        SubLObject day = NIL;
        SubLObject hour = NIL;
        SubLObject min = NIL;
        SubLObject sec = NIL;
        SubLObject millisec = NIL;
        while (date.isCons()) {
            final SubLObject pcase_var = date.first();
            if (pcase_var.eql($$YearFn)) {
                year = second(date);
                date = NIL;
            } else
                if (pcase_var.eql($$MonthFn)) {
                    month = number_of_month(second(date));
                    date = third(date);
                } else
                    if (pcase_var.eql($$DayFn)) {
                        day = second(date);
                        date = third(date);
                    } else
                        if (pcase_var.eql($$HourFn)) {
                            hour = second(date);
                            date = third(date);
                        } else
                            if (pcase_var.eql($$MinuteFn)) {
                                min = second(date);
                                date = third(date);
                            } else
                                if (pcase_var.eql($$SecondFn)) {
                                    sec = second(date);
                                    date = third(date);
                                } else
                                    if (pcase_var.eql($$MilliSecondFn)) {
                                        millisec = second(date);
                                        date = third(date);
                                    } else {
                                        Errors.error($str72$Can_t_handle_a_date_of__S_yet, date);
                                    }






        } 
        return values($CALENDAR, year, month, day, hour, min, sec, millisec);
    }

    public static SubLObject explode_quarter_date(SubLObject date) {
        SubLObject year = NIL;
        SubLObject quarter = NIL;
        while (date.isCons()) {
            final SubLObject pcase_var = date.first();
            if (pcase_var.eql($$YearFn)) {
                year = second(date);
                date = NIL;
            } else
                if (pcase_var.eql($$QuarterFn)) {
                    quarter = second(date);
                    date = third(date);
                } else {
                    Errors.error($str72$Can_t_handle_a_date_of__S_yet, date);
                }

        } 
        return values($QUARTER, year, quarter);
    }

    public static SubLObject explode_decade_date(SubLObject date) {
        SubLObject decade = NIL;
        while (date.isCons()) {
            final SubLObject pcase_var = date.first();
            if (pcase_var.eql($$DecadeFn)) {
                decade = second(date);
                date = NIL;
            } else {
                Errors.error($str72$Can_t_handle_a_date_of__S_yet, date);
            }
        } 
        return values($DECADE, decade);
    }

    public static SubLObject explode_century_date(SubLObject date) {
        SubLObject century = NIL;
        while (date.isCons()) {
            final SubLObject pcase_var = date.first();
            if (pcase_var.eql($$CenturyFn)) {
                century = second(date);
                date = NIL;
            } else {
                Errors.error($str72$Can_t_handle_a_date_of__S_yet, date);
            }
        } 
        return values($CENTURY, century);
    }

    public static SubLObject construct_cycl_date(final SubLObject second, final SubLObject minute, final SubLObject hour, final SubLObject day, final SubLObject month, final SubLObject year) {
        return list($$SecondFn, second, list($$MinuteFn, minute, list($$HourFn, hour, list($$DayFn, day, list($$MonthFn, month, list($$YearFn, year))))));
    }

    public static SubLObject construct_cycl_date_ms(final SubLObject millisecond, final SubLObject second, final SubLObject minute, final SubLObject hour, final SubLObject day, final SubLObject month, final SubLObject year) {
        return list($$MilliSecondFn, millisecond, list($$SecondFn, second, list($$MinuteFn, minute, list($$HourFn, hour, list($$DayFn, day, list($$MonthFn, month, list($$YearFn, year)))))));
    }

    public static SubLObject construct_reduced_cycl_date(final SubLObject second, final SubLObject minute, final SubLObject hour, final SubLObject day, final SubLObject month, final SubLObject year) {
        SubLObject result = NIL;
        if (NIL != year) {
            result = (year == $INDEXICAL_YEAR) ? $$TheYear_Indexical : list($$YearFn, year);
            if (NIL != month) {
                result = list($$MonthFn, month_number(month), result);
                if (NIL != day) {
                    result = list($$DayFn, day, result);
                    if (NIL != hour) {
                        result = list($$HourFn, hour, result);
                        if (NIL != minute) {
                            result = list($$MinuteFn, minute, result);
                            if (NIL != second) {
                                result = list($$SecondFn, second, result);
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    public static SubLObject construct_reduced_cycl_date_ms(final SubLObject millisecond, final SubLObject second, final SubLObject minute, final SubLObject hour, final SubLObject day, final SubLObject month, final SubLObject year) {
        SubLObject result = NIL;
        if (NIL != year) {
            result = (year == $INDEXICAL_YEAR) ? $$TheYear_Indexical : list($$YearFn, year);
            if (NIL != month) {
                result = list($$MonthFn, month_number(month), result);
                if (NIL != day) {
                    result = list($$DayFn, day, result);
                    if (NIL != hour) {
                        result = list($$HourFn, hour, result);
                        if (NIL != minute) {
                            result = list($$MinuteFn, minute, result);
                            if (NIL != second) {
                                result = list($$SecondFn, second, result);
                                if (NIL != millisecond) {
                                    result = list($$MilliSecondFn, millisecond, result);
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    public static SubLObject date_reduced_to_start(final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        thread.resetMultipleValues();
        final SubLObject type = explode_date(date);
        final SubLObject year = thread.secondMultipleValue();
        SubLObject month = thread.thirdMultipleValue();
        SubLObject day = thread.fourthMultipleValue();
        SubLObject hour = thread.fifthMultipleValue();
        SubLObject minute = thread.sixthMultipleValue();
        SubLObject second = thread.seventhMultipleValue();
        thread.resetMultipleValues();
        if (type != $CALENDAR) {
            return date;
        }
        SubLObject first_significant_calendrand = NIL;
        if (NIL == first_significant_calendrand) {
            SubLObject csome_list_var = $date_units_ordered$.getGlobalValue();
            SubLObject calendar_unit = NIL;
            calendar_unit = csome_list_var.first();
            while ((NIL == first_significant_calendrand) && (NIL != csome_list_var)) {
                final SubLObject val = extract_date_time_type(date, calendar_unit);
                if ((NIL != val) && (NIL == starting_value_for_calendar_unit_p(val, calendar_unit))) {
                    first_significant_calendrand = calendar_unit;
                }
                csome_list_var = csome_list_var.rest();
                calendar_unit = csome_list_var.first();
            } 
        }
        final SubLObject pcase_var = first_significant_calendrand;
        if (pcase_var.eql($$CalendarYear)) {
            second = NIL;
            minute = NIL;
            hour = NIL;
            day = NIL;
            month = NIL;
        } else
            if (pcase_var.eql($$CalendarMonth)) {
                second = NIL;
                minute = NIL;
                hour = NIL;
                day = NIL;
            } else
                if (pcase_var.eql($$CalendarDay)) {
                    second = NIL;
                    minute = NIL;
                    hour = NIL;
                } else
                    if (pcase_var.eql($$CalendarHour)) {
                        second = NIL;
                        minute = NIL;
                    } else
                        if (pcase_var.eql($$CalendarMinute)) {
                            second = NIL;
                        }




        result = construct_reduced_cycl_date(second, minute, hour, day, month, year);
        return result;
    }

    public static SubLObject date_reduced_to_end(final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        thread.resetMultipleValues();
        final SubLObject type = explode_date(date);
        final SubLObject year = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        final SubLObject minute = thread.sixthMultipleValue();
        final SubLObject second = thread.seventhMultipleValue();
        thread.resetMultipleValues();
        if (type != $CALENDAR) {
            return date;
        }
        SubLObject first_significant_calendrand = NIL;
        if (NIL == first_significant_calendrand) {
            SubLObject csome_list_var = $date_units_ordered$.getGlobalValue();
            SubLObject calendar_unit = NIL;
            calendar_unit = csome_list_var.first();
            while ((NIL == first_significant_calendrand) && (NIL != csome_list_var)) {
                final SubLObject val = extract_date_time_type(date, calendar_unit);
                if (NIL == ending_value_for_calendar_unit_p(val, calendar_unit, month, year)) {
                    first_significant_calendrand = calendar_unit;
                }
                csome_list_var = csome_list_var.rest();
                calendar_unit = csome_list_var.first();
            } 
        }
        final SubLObject pcase_var = first_significant_calendrand;
        if (pcase_var.eql($$CalendarYear)) {
            result = list($$YearFn, year);
        } else
            if (pcase_var.eql($$CalendarMonth)) {
                result = list($$MonthFn, month_number(month), list($$YearFn, year));
            } else
                if (pcase_var.eql($$CalendarDay)) {
                    result = list($$DayFn, day, list($$MonthFn, month_number(month), list($$YearFn, year)));
                } else
                    if (pcase_var.eql($$CalendarHour)) {
                        result = list($$HourFn, hour, list($$DayFn, day, list($$MonthFn, month_number(month), list($$YearFn, year))));
                    } else
                        if (pcase_var.eql($$CalendarMinute)) {
                            result = list($$MinuteFn, minute, list($$HourFn, hour, list($$DayFn, day, list($$MonthFn, month_number(month), list($$YearFn, year)))));
                        } else
                            if (pcase_var.eql($$CalendarSecond)) {
                                result = date;
                            }





        return result;
    }

    public static SubLObject date_to_precision(SubLObject date, final SubLObject precision, SubLObject inclusion_type) {
        if (inclusion_type == UNPROVIDED) {
            inclusion_type = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((((NIL != precision) && (NIL != inclusion_type)) && (NIL != date_p(date))) && (NIL != date_unitG(precision, date_precision(date)))) {
            final SubLObject pcase_var = inclusion_type;
            if (pcase_var.eql($START)) {
                date = universal_time_to_cycl_date(subtract(cycl_date_to_universal_time(date), ONE_INTEGER));
            } else
                if (pcase_var.eql($END)) {
                    date = universal_time_to_cycl_date(add(cycl_date_to_universal_time(date), ONE_INTEGER));
                }

        }
        thread.resetMultipleValues();
        final SubLObject type = explode_date(date);
        SubLObject year = thread.secondMultipleValue();
        SubLObject month = thread.thirdMultipleValue();
        SubLObject day = thread.fourthMultipleValue();
        SubLObject hour = thread.fifthMultipleValue();
        SubLObject minute = thread.sixthMultipleValue();
        SubLObject second = thread.seventhMultipleValue();
        SubLObject millisecond = thread.eighthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var2 = type;
        if (pcase_var2.eql($DECADE)) {
            year = multiply(year, TEN_INTEGER);
        } else
            if (pcase_var2.eql($CENTURY)) {
                year = number_utilities.f_1X(multiply(number_utilities.f_1_(year), $int$100));
            }

        if (precision.eql($$CalendarYear)) {
            month = NIL;
            day = NIL;
            hour = NIL;
            minute = NIL;
            second = NIL;
        } else
            if (precision.eql($$CalendarMonth)) {
                if (NIL == month) {
                    month = ONE_INTEGER;
                }
                day = NIL;
                hour = NIL;
                minute = NIL;
                second = NIL;
            } else
                if (precision.eql($$CalendarDay)) {
                    if (NIL == month) {
                        month = ONE_INTEGER;
                    }
                    if (NIL == day) {
                        day = ONE_INTEGER;
                    }
                    hour = NIL;
                    minute = NIL;
                    second = NIL;
                } else
                    if (precision.eql($$CalendarHour)) {
                        if (NIL == month) {
                            month = ONE_INTEGER;
                        }
                        if (NIL == day) {
                            day = ONE_INTEGER;
                        }
                        if (NIL == hour) {
                            hour = ZERO_INTEGER;
                        }
                        minute = NIL;
                        second = NIL;
                    } else
                        if (precision.eql($$CalendarMinute)) {
                            if (NIL == month) {
                                month = ONE_INTEGER;
                            }
                            if (NIL == day) {
                                day = ONE_INTEGER;
                            }
                            if (NIL == hour) {
                                hour = ZERO_INTEGER;
                            }
                            if (NIL == minute) {
                                minute = ZERO_INTEGER;
                            }
                            second = NIL;
                        } else
                            if (precision.eql($$CalendarSecond)) {
                                if (NIL == month) {
                                    month = ONE_INTEGER;
                                }
                                if (NIL == day) {
                                    day = ONE_INTEGER;
                                }
                                if (NIL == hour) {
                                    hour = ZERO_INTEGER;
                                }
                                if (NIL == minute) {
                                    minute = ZERO_INTEGER;
                                }
                                if (NIL == second) {
                                    second = ZERO_INTEGER;
                                }
                            } else
                                if (precision.eql($$CalendarMilliSecond)) {
                                    if (NIL == month) {
                                        month = ONE_INTEGER;
                                    }
                                    if (NIL == day) {
                                        day = ONE_INTEGER;
                                    }
                                    if (NIL == hour) {
                                        hour = ZERO_INTEGER;
                                    }
                                    if (NIL == minute) {
                                        minute = ZERO_INTEGER;
                                    }
                                    if (NIL == second) {
                                        second = ZERO_INTEGER;
                                    }
                                    if (NIL == millisecond) {
                                        millisecond = ZERO_INTEGER;
                                    }
                                }






        return construct_reduced_cycl_date_ms(millisecond, second, minute, hour, day, month, year);
    }

    public static SubLObject construct_calendar_date(final SubLObject year, SubLObject month, SubLObject day, SubLObject hour, SubLObject min, SubLObject sec, SubLObject millisec) {
        if (month == UNPROVIDED) {
            month = NIL;
        }
        if (day == UNPROVIDED) {
            day = NIL;
        }
        if (hour == UNPROVIDED) {
            hour = NIL;
        }
        if (min == UNPROVIDED) {
            min = NIL;
        }
        if (sec == UNPROVIDED) {
            sec = NIL;
        }
        if (millisec == UNPROVIDED) {
            millisec = NIL;
        }
        SubLObject date = (year.isInteger()) ? list($$YearFn, year) : year;
        if (NIL != month) {
            if (NIL != date) {
                if (month.isInteger()) {
                    date = list($$MonthFn, month_number(month), date);
                } else {
                    Errors.error($str82$Can_t_attach_month__S_to_date__S, month, date);
                }
            } else
                if (month.isInteger()) {
                    Errors.error($str82$Can_t_attach_month__S_to_date__S, month, date);
                } else {
                    date = month;
                }

        } else
            if (NIL != date) {
                return date;
            }

        if (NIL != day) {
            if (NIL != date) {
                if (day.isInteger()) {
                    date = list($$DayFn, day, date);
                } else {
                    Errors.error($str83$Can_t_attach_day__S_to_date__S, day, date);
                }
            } else
                if (day.isInteger()) {
                    Errors.error($str83$Can_t_attach_day__S_to_date__S, day, date);
                } else {
                    date = day;
                }

        } else
            if (NIL != date) {
                return date;
            }

        if (NIL != hour) {
            if (NIL != date) {
                if (hour.isInteger()) {
                    date = list($$HourFn, hour, date);
                } else {
                    Errors.error($str84$Can_t_attach_hour__S_to_date__S, hour, date);
                }
            } else
                if (hour.isInteger()) {
                    Errors.error($str84$Can_t_attach_hour__S_to_date__S, hour, date);
                } else {
                    date = hour;
                }

        } else
            if (NIL != date) {
                return date;
            }

        if (NIL != min) {
            if (NIL != date) {
                if (min.isInteger()) {
                    date = list($$MinuteFn, min, date);
                } else {
                    Errors.error($str85$Can_t_attach_minute__S_to_date__S, min, date);
                }
            } else
                if (min.isInteger()) {
                    Errors.error($str85$Can_t_attach_minute__S_to_date__S, min, date);
                } else {
                    date = min;
                }

        } else
            if (NIL != date) {
                return date;
            }

        if (NIL != sec) {
            if (NIL != date) {
                if (sec.isInteger()) {
                    date = list($$SecondFn, sec, date);
                } else {
                    Errors.error($str86$Can_t_attach_sec__S_to_date__S, sec, date);
                }
            } else
                if (sec.isInteger()) {
                    Errors.error($str86$Can_t_attach_sec__S_to_date__S, sec, date);
                } else {
                    date = sec;
                }

        } else
            if (NIL != date) {
                return date;
            }

        if (NIL != millisec) {
            if (NIL != date) {
                if (millisec.isInteger()) {
                    date = list($$MilliSecondFn, millisec, date);
                } else {
                    Errors.error($str87$Can_t_attach_millisec__S_to_date_, millisec, date);
                }
            } else
                if (millisec.isInteger()) {
                    Errors.error($str87$Can_t_attach_millisec__S_to_date_, millisec, date);
                } else {
                    date = millisec;
                }

        } else
            if (NIL != date) {
                return date;
            }

        return date;
    }

    public static SubLObject construct_quarter_date(final SubLObject year, SubLObject quarter) {
        if (quarter == UNPROVIDED) {
            quarter = NIL;
        }
        SubLObject date = (year.isInteger()) ? list($$YearFn, year) : year;
        if (NIL != quarter) {
            if (NIL != date) {
                if (quarter.isInteger()) {
                    date = list($$QuarterFn, quarter, date);
                } else {
                    Errors.error($str88$Can_t_attach_quarter__S_to_date__, quarter, date);
                }
            } else
                if (quarter.isInteger()) {
                    Errors.error($str88$Can_t_attach_quarter__S_to_date__, quarter, date);
                } else {
                    date = quarter;
                }

        } else
            if (NIL != date) {
                return date;
            }

        return date;
    }

    public static SubLObject construct_decade_date(final SubLObject decade) {
        if (decade.isInteger()) {
            return list($$DecadeFn, decade);
        }
        Errors.error($str89$Can_t_construct_date_with_decade_, decade);
        return NIL;
    }

    public static SubLObject construct_century_date(final SubLObject century) {
        if (century.isInteger()) {
            return list($$CenturyFn, century);
        }
        Errors.error($str90$Can_t_construct_date_with_century, century);
        return NIL;
    }

    public static SubLObject calendar_date_sum(final SubLObject unit, final SubLObject amount, SubLObject year, SubLObject month, SubLObject day, SubLObject hour, SubLObject min, SubLObject sec, SubLObject millisec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (unit.eql($$YearsDuration)) {
            if (NIL != year) {
                year = add(year, amount);
            }
        } else
            if (unit.eql($$MonthsDuration)) {
                if (NIL != month) {
                    month = add(month, amount);
                }
            } else
                if (unit.eql($$WeeksDuration)) {
                    if (NIL != day) {
                        day = add(day, multiply(SEVEN_INTEGER, amount));
                    }
                } else
                    if (unit.eql($$DaysDuration)) {
                        if (NIL != day) {
                            day = add(day, amount);
                        }
                    } else
                        if (unit.eql($$HoursDuration)) {
                            if (NIL != hour) {
                                hour = add(hour, amount);
                            }
                        } else
                            if (unit.eql($$MinutesDuration)) {
                                if (NIL != min) {
                                    min = add(min, amount);
                                }
                            } else
                                if (unit.eql($$SecondsDuration)) {
                                    if (NIL != sec) {
                                        sec = add(sec, amount);
                                    }
                                } else
                                    if (unit.eql($$MillisecondsDuration) && (NIL != millisec)) {
                                        millisec = add(millisec, amount);
                                    }







        if (NIL != millisec) {
            if (millisec.numL(ZERO_INTEGER)) {
                sec = add(sec, subtract(integerDivide(millisec, $int$1000), mod(millisec, $int$1000).numE(ZERO_INTEGER) ? ZERO_INTEGER : ONE_INTEGER));
            } else {
                sec = add(sec, integerDivide(millisec, $int$1000));
            }
            millisec = mod(millisec, $int$1000);
        }
        if (NIL != sec) {
            if (sec.numL(ZERO_INTEGER)) {
                min = add(min, subtract(integerDivide(sec, $int$60), mod(sec, $int$60).numE(ZERO_INTEGER) ? ZERO_INTEGER : ONE_INTEGER));
            } else {
                min = add(min, integerDivide(sec, $int$60));
            }
            sec = mod(sec, $int$60);
        }
        if (NIL != min) {
            if (min.numL(ZERO_INTEGER)) {
                hour = add(hour, subtract(integerDivide(min, $int$60), mod(min, $int$60).numE(ZERO_INTEGER) ? ZERO_INTEGER : ONE_INTEGER));
            } else {
                hour = add(hour, integerDivide(min, $int$60));
            }
            min = mod(min, $int$60);
        }
        if (NIL != hour) {
            if (hour.numL(ZERO_INTEGER)) {
                day = add(day, subtract(integerDivide(hour, $int$24), mod(hour, $int$24).numE(ZERO_INTEGER) ? ZERO_INTEGER : ONE_INTEGER));
            } else {
                day = add(day, integerDivide(hour, $int$24));
            }
            hour = mod(hour, $int$24);
        }
        thread.resetMultipleValues();
        final SubLObject final_year = numeric_date_utilities.adjust_year_month_day(year, month, day);
        final SubLObject final_month = thread.secondMultipleValue();
        final SubLObject final_day = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return construct_calendar_date(final_year, final_month, final_day, hour, min, sec, millisec);
    }

    public static SubLObject quarter_date_sum(final SubLObject unit, final SubLObject amount, SubLObject year, SubLObject quarter) {
        if (unit.eql($$YearsDuration)) {
            if (NIL != year) {
                year = add(year, amount);
            }
        } else
            if (unit.eql($$QuartersDuration) && (NIL != quarter)) {
                quarter = add(quarter, amount);
            }

        if (NIL != quarter) {
            if (quarter.numL(ONE_INTEGER)) {
                year = add(year, subtract(integerDivide(quarter, FOUR_INTEGER), ONE_INTEGER));
            } else {
                year = add(year, integerDivide(quarter, FOUR_INTEGER));
            }
            quarter = add(mod(subtract(quarter, ONE_INTEGER), FOUR_INTEGER), ONE_INTEGER);
        }
        return construct_quarter_date(year, quarter);
    }

    public static SubLObject decade_date_sum(final SubLObject unit, final SubLObject amount, SubLObject decade) {
        if (NIL == decade) {
            return NIL;
        }
        if (unit.eql($$DecadesDuration)) {
            decade = add(decade, amount);
        } else
            if (unit.eql($$YearsDuration)) {
                decade = add(decade, integerDivide(amount, TEN_INTEGER));
            } else
                if (unit.eql($$MonthsDuration)) {
                    decade = add(decade, integerDivide(amount, $int$120));
                }


        return construct_decade_date(decade);
    }

    public static SubLObject century_date_sum(final SubLObject unit, final SubLObject amount, SubLObject century) {
        if (NIL == century) {
            return NIL;
        }
        if (unit.eql($$CenturiesDuration)) {
            century = add(century, amount);
        } else
            if (unit.eql($$DecadesDuration)) {
                century = add(century, integerDivide(amount, TEN_INTEGER));
            } else
                if (unit.eql($$YearsDuration)) {
                    century = add(century, integerDivide(amount, $int$100));
                } else
                    if (unit.eql($$MonthsDuration)) {
                        century = add(century, integerDivide(amount, $int$1200));
                    }



        return construct_century_date(century);
    }

    public static SubLObject month_p(final SubLObject v_object) {
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str108$A_KB_dependent_date_specific_func);
        }
        return list_utilities.member_eqP(v_object, $month_constant_table$.getGlobalValue());
    }

    public static SubLObject month_number(final SubLObject number) {
        assert NIL != numeric_date_utilities.valid_month_number_p(number) : "numeric_date_utilities.valid_month_number_p(number) " + "CommonSymbols.NIL != numeric_date_utilities.valid_month_number_p(number) " + number;
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str108$A_KB_dependent_date_specific_func);
        }
        return nth(subtract(number, ONE_INTEGER), $month_constant_table$.getGlobalValue());
    }

    public static SubLObject number_of_month(final SubLObject month) {
        assert NIL != month_term_p(month) : "date_utilities.month_term_p(month) " + "CommonSymbols.NIL != date_utilities.month_term_p(month) " + month;
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str108$A_KB_dependent_date_specific_func);
        }
        if (NIL != forts.fort_p(month)) {
            final SubLObject position = position(month, $month_constant_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL != position ? add(position, ONE_INTEGER) : NIL;
        }
        return second(month);
    }

    public static SubLObject day_number(final SubLObject date) {
        final SubLObject month = extract_date_month_number(date);
        final SubLObject year = extract_date_year(date);
        final SubLObject day = extract_date_day(date);
        return add(numeric_date_utilities.total_days_in_months_preceding(month, year), day);
    }

    public static SubLObject month_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != month_p(v_object)) || ((NIL != narts_high.naut_p(v_object)) && (NIL != kb_utilities.kbeq(v_object.first(), $$MonthOfYearFn))));
    }

    public static SubLObject day_of_week_p(final SubLObject v_object) {
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str108$A_KB_dependent_date_specific_func);
        }
        return subl_promotions.memberP(v_object, $days_of_week$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject day_of_week_number(final SubLObject number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (((!number.isInteger()) || number.isNegative()) || (!number.numL(SEVEN_INTEGER)))) {
            Errors.error($str113$_S_is_not_a_valid_day_of_week_num, number);
        }
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str108$A_KB_dependent_date_specific_func);
        }
        return nth(number, $days_of_week$.getGlobalValue());
    }

    public static SubLObject following_day_of_week(final SubLObject day_of_week) {
        return day_of_week_number(mod(number_utilities.f_1X(number_of_day_of_week(day_of_week)), SEVEN_INTEGER));
    }

    public static SubLObject prior_day_of_week(final SubLObject day_of_week) {
        return day_of_week_number(mod(subtract(number_of_day_of_week(day_of_week), ONE_INTEGER), SEVEN_INTEGER));
    }

    public static SubLObject number_of_day_of_week(final SubLObject day_of_week) {
        assert NIL != day_of_week_p(day_of_week) : "date_utilities.day_of_week_p(day_of_week) " + "CommonSymbols.NIL != date_utilities.day_of_week_p(day_of_week) " + day_of_week;
        return position(day_of_week, $days_of_week$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject day_of_week_of_date(final SubLObject date) {
        assert NIL != date_p(date) : "date_utilities.date_p(date) " + "CommonSymbols.NIL != date_utilities.date_p(date) " + date;
        final SubLObject pcase_var = date_precision(date);
        if ((((!pcase_var.eql($$CalendarDay)) && (!pcase_var.eql($$CalendarHour))) && (!pcase_var.eql($$CalendarMinute))) && (!pcase_var.eql($$CalendarSecond))) {
            return NIL;
        }
        final SubLObject year = extract_date_year(date);
        if (NIL == year) {
            return NIL;
        }
        final SubLObject century = century_of_year(extract_date_year(date));
        final SubLObject century_starting_day = get_century_starting_day(century);
        final SubLObject years_from_century = subtract(year, century);
        SubLObject leap_days = leap_years_between(list($$YearFn, century), list($$YearFn, year));
        final SubLObject day_number = day_number(date);
        SubLObject day_number_of_date = NIL;
        if (NIL != numeric_date_utilities.leap_year_p(year)) {
            leap_days = add(leap_days, MINUS_ONE_INTEGER);
        }
        day_number_of_date = mod(add(new SubLObject[]{ century_starting_day, years_from_century, leap_days, day_number }), SEVEN_INTEGER);
        return day_of_week_number(day_number_of_date);
    }

    public static SubLObject day_of_week_prior_to_date(final SubLObject day_of_week, final SubLObject date) {
        assert NIL != day_of_week_p(day_of_week) : "date_utilities.day_of_week_p(day_of_week) " + "CommonSymbols.NIL != date_utilities.day_of_week_p(day_of_week) " + day_of_week;
        assert NIL != date_p(date) : "date_utilities.date_p(date) " + "CommonSymbols.NIL != date_utilities.date_p(date) " + date;
        final SubLObject date_day = day_of_date(date);
        final SubLObject date_day_of_week = day_of_week_of_date(date);
        if ((NIL == date_p(date_day)) || (NIL == day_of_week_p(date_day_of_week))) {
            return NIL;
        }
        final SubLObject date_dow_number = number_of_day_of_week(date_day_of_week);
        final SubLObject dow_number = number_of_day_of_week(day_of_week);
        final SubLObject difference = mod(subtract(date_dow_number, dow_number), SEVEN_INTEGER);
        final SubLObject shift = (difference.isZero()) ? SEVEN_INTEGER : difference;
        return date_before(date_day, list($$DaysDuration, shift));
    }

    public static SubLObject day_of_week_prior_to_date_inclusive(final SubLObject day_of_week, final SubLObject date) {
        assert NIL != day_of_week_p(day_of_week) : "date_utilities.day_of_week_p(day_of_week) " + "CommonSymbols.NIL != date_utilities.day_of_week_p(day_of_week) " + day_of_week;
        assert NIL != date_p(date) : "date_utilities.date_p(date) " + "CommonSymbols.NIL != date_utilities.date_p(date) " + date;
        final SubLObject date_day = day_of_date(date);
        final SubLObject date_day_of_week = day_of_week_of_date(date);
        if ((NIL == date_p(date_day)) || (NIL == day_of_week_p(date_day_of_week))) {
            return NIL;
        }
        final SubLObject date_dow_number = number_of_day_of_week(date_day_of_week);
        final SubLObject dow_number = number_of_day_of_week(day_of_week);
        final SubLObject difference = mod(subtract(date_dow_number, dow_number), SEVEN_INTEGER);
        if (difference.isZero()) {
            return day_of_date(date);
        }
        return date_before(date_day, list($$DaysDuration, difference));
    }

    public static SubLObject day_of_week_after_date(final SubLObject day_of_week, final SubLObject date) {
        assert NIL != day_of_week_p(day_of_week) : "date_utilities.day_of_week_p(day_of_week) " + "CommonSymbols.NIL != date_utilities.day_of_week_p(day_of_week) " + day_of_week;
        assert NIL != date_p(date) : "date_utilities.date_p(date) " + "CommonSymbols.NIL != date_utilities.date_p(date) " + date;
        final SubLObject date_day = day_of_date(date);
        final SubLObject date_day_of_week = day_of_week_of_date(date);
        if ((NIL == date_p(date_day)) || (NIL == day_of_week_p(date_day_of_week))) {
            return NIL;
        }
        final SubLObject date_dow_number = number_of_day_of_week(date_day_of_week);
        final SubLObject dow_number = number_of_day_of_week(day_of_week);
        final SubLObject difference = mod(subtract(dow_number, date_dow_number), SEVEN_INTEGER);
        final SubLObject shift = (difference.isZero()) ? SEVEN_INTEGER : difference;
        return date_after(date_day, list($$DaysDuration, shift));
    }

    public static SubLObject day_of_week_after_date_inclusive(final SubLObject day_of_week, final SubLObject date) {
        assert NIL != day_of_week_p(day_of_week) : "date_utilities.day_of_week_p(day_of_week) " + "CommonSymbols.NIL != date_utilities.day_of_week_p(day_of_week) " + day_of_week;
        assert NIL != date_p(date) : "date_utilities.date_p(date) " + "CommonSymbols.NIL != date_utilities.date_p(date) " + date;
        final SubLObject date_day = day_of_date(date);
        final SubLObject date_day_of_week = day_of_week_of_date(date);
        if ((NIL == date_p(date_day)) || (NIL == day_of_week_p(date_day_of_week))) {
            return NIL;
        }
        final SubLObject date_dow_number = number_of_day_of_week(date_day_of_week);
        final SubLObject dow_number = number_of_day_of_week(day_of_week);
        final SubLObject difference = mod(subtract(dow_number, date_dow_number), SEVEN_INTEGER);
        if (difference.isZero()) {
            return day_of_date(date);
        }
        return date_after(date_day, list($$DaysDuration, difference));
    }

    public static SubLObject century_of_year(final SubLObject year) {
        assert NIL != integerp(year) : "Types.integerp(year) " + "CommonSymbols.NIL != Types.integerp(year) " + year;
        return multiply(integerDivide(year, $int$100), $int$100);
    }

    public static SubLObject get_century_starting_day(final SubLObject century) {
        final SubLObject pcase_var;
        final SubLObject century_type = pcase_var = mod(integerDivide(century, $int$100), FOUR_INTEGER);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return FIVE_INTEGER;
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return FOUR_INTEGER;
        }
        if (pcase_var.eql(TWO_INTEGER)) {
            return TWO_INTEGER;
        }
        if (pcase_var.eql(THREE_INTEGER)) {
            return ZERO_INTEGER;
        }
        return NIL;
    }

    public static SubLObject day_of_month_term_p(final SubLObject v_object) {
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str108$A_KB_dependent_date_specific_func);
        }
        return makeBoolean((NIL != narts_high.naut_p(v_object)) && (NIL != kb_utilities.kbeq(v_object.first(), $$DayOfMonthFn)));
    }

    public static SubLObject days_since_rata_die(final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject type = explode_date(date);
        final SubLObject year = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        final SubLObject min = thread.sixthMultipleValue();
        final SubLObject sec = thread.seventhMultipleValue();
        thread.resetMultipleValues();
        return add(new SubLObject[]{ multiply($int$365, number_utilities.f_1_(year)), integerDivide(number_utilities.f_1_(year), FOUR_INTEGER), minus(integerDivide(number_utilities.f_1_(year), $int$100)), integerDivide(number_utilities.f_1_(year), $int$400), integerDivide(subtract(multiply($int$367, month), $int$362), TWELVE_INTEGER), adjust_thirty_day_february(month, year), day });
    }

    public static SubLObject adjust_thirty_day_february(final SubLObject month, final SubLObject year) {
        if (month.numLE(TWO_INTEGER)) {
            return ZERO_INTEGER;
        }
        if (NIL != numeric_date_utilities.leap_year_p(year)) {
            return MINUS_ONE_INTEGER;
        }
        return $int$_2;
    }

    public static SubLObject hour_of_day_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $hours_of_day$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject hour_of_day_term_p(final SubLObject v_object) {
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str108$A_KB_dependent_date_specific_func);
        }
        return makeBoolean((NIL != narts_high.naut_p(v_object)) && (NIL != kb_utilities.kbeq(v_object.first(), $$HourOfDayFn)));
    }

    public static SubLObject hour_of_day_of_date(final SubLObject date) {
        assert NIL != date_p(date) : "date_utilities.date_p(date) " + "CommonSymbols.NIL != date_utilities.date_p(date) " + date;
        final SubLObject hour = extract_date_hour(date);
        if (NIL != hour) {
            return nth(hour, $hours_of_day$.getGlobalValue());
        }
        Errors.cerror($str126$Continue_with_nil_hour_of_day_, $str127$_a_did_not_specify_a_day_, date);
        return NIL;
    }

    public static SubLObject number_of_hour_of_day(final SubLObject hour_of_day) {
        return position(hour_of_day, $hours_of_day$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject time_of_day_of_date(final SubLObject date) {
        final SubLObject pcase_var = date_precision(date);
        if (pcase_var.eql($$CalendarHour)) {
            return hour_of_day_of_date(date);
        }
        if (pcase_var.eql($$CalendarMinute)) {
            return make_binary_formula($$TimeOfDayFn, hour_of_day_of_date(date), minute_of_hour_of_date(date));
        }
        if (pcase_var.eql($$CalendarSecond)) {
            return make_binary_formula($$TimeOfDayFn, hour_of_day_of_date(date), make_binary_formula($$TimeOfHourFn, minute_of_hour_of_date(date), second_of_minute_of_date(date)));
        }
        if (pcase_var.eql($$CalendarMilliSecond)) {
            return make_binary_formula($$TimeOfDayFn, hour_of_day_of_date(date), make_binary_formula($$TimeOfHourFn, minute_of_hour_of_date(date), make_binary_formula($$TimeOfMinuteFn, second_of_minute_of_date(date), millisecond_of_second_of_date(date))));
        }
        return NIL;
    }

    public static SubLObject minute_of_hour_term_p(final SubLObject v_object) {
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str108$A_KB_dependent_date_specific_func);
        }
        return makeBoolean((NIL != narts_high.naut_p(v_object)) && (NIL != kb_utilities.kbeq(v_object.first(), $$MinuteOfHourFn)));
    }

    public static SubLObject minute_of_hour_of_date(final SubLObject date) {
        assert NIL != date_p(date) : "date_utilities.date_p(date) " + "CommonSymbols.NIL != date_utilities.date_p(date) " + date;
        final SubLObject minute = extract_date_minute(date);
        if (NIL != minute) {
            return make_unary_formula($$MinuteOfHourFn, minute);
        }
        Errors.cerror($str132$Continue_with_nil_minute_of_hour_, $str133$_a_did_not_specify_a_hour_, date);
        return NIL;
    }

    public static SubLObject second_of_minute_term_p(final SubLObject v_object) {
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str108$A_KB_dependent_date_specific_func);
        }
        return makeBoolean((NIL != narts_high.naut_p(v_object)) && (NIL != kb_utilities.kbeq(v_object.first(), $$SecondOfMinuteFn)));
    }

    public static SubLObject second_of_minute_of_date(final SubLObject date) {
        assert NIL != date_p(date) : "date_utilities.date_p(date) " + "CommonSymbols.NIL != date_utilities.date_p(date) " + date;
        final SubLObject second = extract_date_second(date);
        if (NIL != second) {
            return make_unary_formula($$SecondOfMinuteFn, second);
        }
        Errors.cerror($str135$Continue_with_nil_second_of_minut, $str136$_a_did_not_specify_a_minute_, date);
        return NIL;
    }

    public static SubLObject millisecond_of_second_term_p(final SubLObject v_object) {
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str108$A_KB_dependent_date_specific_func);
        }
        return makeBoolean((NIL != narts_high.naut_p(v_object)) && (NIL != kb_utilities.kbeq(v_object.first(), $$MillisecondOfSecondFn)));
    }

    public static SubLObject millisecond_of_second_of_date(final SubLObject date) {
        assert NIL != date_p(date) : "date_utilities.date_p(date) " + "CommonSymbols.NIL != date_utilities.date_p(date) " + date;
        final SubLObject millisecond = extract_date_millisecond(date);
        if (NIL != millisecond) {
            return make_unary_formula($$MillisecondOfSecondFn, millisecond);
        }
        Errors.cerror($str138$Continue_with_nil_millisecond_of_, $str139$_a_did_not_specify_a_second_, date);
        return NIL;
    }

    public static SubLObject starting_value_for_calendar_unit_p(final SubLObject val, final SubLObject type) {
        if (NIL == val) {
            return T;
        }
        if ((type.eql($$CalendarSecond) || type.eql($$CalendarMinute)) || type.eql($$CalendarHour)) {
            return eq(val, ZERO_INTEGER);
        }
        if (type.eql($$CalendarDay)) {
            return eq(val, ONE_INTEGER);
        }
        if (type.eql($$CalendarWeek)) {
            return kb_utilities.kbeq(val, $$Sunday);
        }
        if (type.eql($$CalendarMonth)) {
            return kb_utilities.kbeq(val, $$January);
        }
        if (type.eql($$CalendarQuarter)) {
            return eq(val, ONE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject starting_numerical_value_for_calendar_unit_p(final SubLObject val, final SubLObject type) {
        if (NIL == val) {
            return T;
        }
        if ((type.eql($$CalendarSecond) || type.eql($$CalendarMinute)) || type.eql($$CalendarHour)) {
            return eq(val, ZERO_INTEGER);
        }
        if (type.eql($$CalendarDay)) {
            return eq(val, ONE_INTEGER);
        }
        if (type.eql($$CalendarWeek)) {
            return eq(val, ONE_INTEGER);
        }
        if (type.eql($$CalendarMonth)) {
            return eq(val, ONE_INTEGER);
        }
        if (type.eql($$CalendarQuarter)) {
            return eq(val, ONE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject starting_numerical_values_for_calendar_unit_p(final SubLObject vals, final SubLObject type) {
        SubLObject i = ZERO_INTEGER;
        SubLObject failP = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var = list_utilities.first_n(number_utilities.f_1X(position(type, $date_units_ordered$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), $date_units_ordered$.getGlobalValue());
            SubLObject cur_type = NIL;
            cur_type = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                final SubLObject cur_val = nth(i, vals);
                i = add(i, ONE_INTEGER);
                if (NIL == starting_numerical_value_for_calendar_unit_p(cur_val, cur_type)) {
                    failP = T;
                }
                csome_list_var = csome_list_var.rest();
                cur_type = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == failP);
    }

    public static SubLObject ending_value_for_calendar_unit_p(final SubLObject val, final SubLObject type, SubLObject month, SubLObject year) {
        if (month == UNPROVIDED) {
            month = NIL;
        }
        if (year == UNPROVIDED) {
            year = NIL;
        }
        if (NIL == val) {
            return T;
        }
        if (type.eql($$CalendarSecond) || type.eql($$CalendarMinute)) {
            return eq(val, $int$59);
        }
        if (type.eql($$CalendarHour)) {
            return eq(val, $int$23);
        }
        if (type.eql($$CalendarDay)) {
            return eq(val, numeric_date_utilities.days_in_month_number(month, year));
        }
        if (type.eql($$CalendarWeek)) {
            return kb_utilities.kbeq(val, $$Saturday);
        }
        if (type.eql($$CalendarMonth)) {
            return kb_utilities.kbeq(val, $$December);
        }
        if (type.eql($$CalendarQuarter)) {
            return eq(val, FOUR_INTEGER);
        }
        return NIL;
    }

    public static SubLObject ending_numerical_value_for_calendar_unit_p(final SubLObject val, final SubLObject type, SubLObject month, SubLObject year) {
        if (month == UNPROVIDED) {
            month = NIL;
        }
        if (year == UNPROVIDED) {
            year = NIL;
        }
        if (NIL == val) {
            return T;
        }
        if (type.eql($$CalendarSecond) || type.eql($$CalendarMinute)) {
            return eq(val, $int$59);
        }
        if (type.eql($$CalendarHour)) {
            return eq(val, $int$23);
        }
        if (type.eql($$CalendarDay)) {
            return eq(val, numeric_date_utilities.days_in_month_number(month, year));
        }
        if (type.eql($$CalendarWeek)) {
            return eq(val, SEVEN_INTEGER);
        }
        if (type.eql($$CalendarMonth)) {
            return eq(val, TWELVE_INTEGER);
        }
        if (type.eql($$CalendarQuarter)) {
            return eq(val, FOUR_INTEGER);
        }
        return NIL;
    }

    public static SubLObject ending_numerical_values_for_calendar_unit_p(final SubLObject vals, final SubLObject type, SubLObject month, SubLObject year) {
        if (month == UNPROVIDED) {
            month = NIL;
        }
        if (year == UNPROVIDED) {
            year = NIL;
        }
        SubLObject i = ZERO_INTEGER;
        SubLObject failP = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var = list_utilities.first_n(number_utilities.f_1X(position(type, $date_units_ordered$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), $date_units_ordered$.getGlobalValue());
            SubLObject cur_type = NIL;
            cur_type = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                final SubLObject cur_val = nth(i, vals);
                i = add(i, ONE_INTEGER);
                if (NIL == ending_numerical_value_for_calendar_unit_p(cur_val, cur_type, month, year)) {
                    failP = T;
                }
                csome_list_var = csome_list_var.rest();
                cur_type = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == failP);
    }

    public static SubLObject truncate_date_to_format(final SubLObject date, final SubLObject new_format) {
        final SubLObject old_format = date_format(date);
        if (old_format.eql(new_format)) {
            return date;
        }
        if (NIL != date_formatG(old_format, new_format)) {
            return NIL;
        }
        if (new_format.eql($CENTURY)) {
            return century_of_date(date);
        }
        if (new_format.eql($DECADE)) {
            return decade_of_date(date);
        }
        if (new_format.eql($QUARTER)) {
            return quarter_of_date(date);
        }
        if (new_format.eql($CALENDAR)) {
            return NIL;
        }
        return NIL;
    }

    public static SubLObject date_precision(final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str108$A_KB_dependent_date_specific_func);
        }
        thread.resetMultipleValues();
        final SubLObject format = explode_date(date);
        final SubLObject year = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        final SubLObject min = thread.sixthMultipleValue();
        final SubLObject sec = thread.seventhMultipleValue();
        final SubLObject millisec = thread.eighthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = format;
        if (pcase_var.eql($CALENDAR)) {
            if (NIL != millisec) {
                return $$CalendarMilliSecond;
            }
            if (NIL != sec) {
                return $$CalendarSecond;
            }
            if (NIL != min) {
                return $$CalendarMinute;
            }
            if (NIL != hour) {
                return $$CalendarHour;
            }
            if (NIL != day) {
                return $$CalendarDay;
            }
            if (NIL != month) {
                return $$CalendarMonth;
            }
            if (NIL != year) {
                return $$CalendarYear;
            }
            return NIL;
        } else
            if (pcase_var.eql($QUARTER)) {
                if (NIL != month) {
                    return $$CalendarQuarter;
                }
                if (NIL != year) {
                    return $$CalendarYear;
                }
                return NIL;
            } else
                if (pcase_var.eql($DECADE)) {
                    if (NIL != year) {
                        return $$CalendarDecade;
                    }
                    return NIL;
                } else {
                    if (!pcase_var.eql($CENTURY)) {
                        return NIL;
                    }
                    if (NIL != year) {
                        return $$CalendarCentury;
                    }
                    return NIL;
                }


    }

    public static SubLObject reduce_date_start(final SubLObject date) {
        if (NIL != temporal_indexical_p(date)) {
            return date;
        }
        if (NIL != beginning_of_timeP(date)) {
            return date;
        }
        final SubLObject most_significant_date_type = cycl_utilities.nat_functor(date);
        final SubLObject most_significant_date_amount = cycl_utilities.nat_arg1(date, UNPROVIDED);
        final SubLObject rest_of_date = cycl_utilities.nat_arg2(date, UNPROVIDED);
        final SubLObject pcase_var = most_significant_date_type;
        if ((pcase_var.eql($$SecondFn) || pcase_var.eql($$MinuteFn)) || pcase_var.eql($$HourFn)) {
            if (most_significant_date_amount.numE(ZERO_INTEGER)) {
                return reduce_date_start(rest_of_date);
            }
            return date;
        } else
            if (pcase_var.eql($$DayFn)) {
                if (most_significant_date_amount.numE(ONE_INTEGER)) {
                    return reduce_date_start(rest_of_date);
                }
                return date;
            } else {
                if (!pcase_var.eql($$MonthFn)) {
                    return date;
                }
                if (NIL != kb_utilities.kbeq(most_significant_date_amount, $$January)) {
                    return reduce_date_start(rest_of_date);
                }
                return date;
            }

    }

    public static SubLObject reduce_date_end(final SubLObject date) {
        if (NIL != temporal_indexical_p(date)) {
            return date;
        }
        if (NIL != end_of_timeP(date)) {
            return date;
        }
        final SubLObject most_significant_date_type = cycl_utilities.nat_functor(date);
        final SubLObject most_significant_date_amount = cycl_utilities.nat_arg1(date, UNPROVIDED);
        final SubLObject rest_of_date = cycl_utilities.nat_arg2(date, UNPROVIDED);
        final SubLObject pcase_var = most_significant_date_type;
        if (pcase_var.eql($$SecondFn) || pcase_var.eql($$MinuteFn)) {
            if (most_significant_date_amount.numE($int$59)) {
                return reduce_date_end(rest_of_date);
            }
            return date;
        } else
            if (pcase_var.eql($$HourFn)) {
                if (most_significant_date_amount.numE($int$23)) {
                    return reduce_date_end(rest_of_date);
                }
                return date;
            } else
                if (pcase_var.eql($$DayFn)) {
                    final SubLObject month = extract_date_month(rest_of_date);
                    final SubLObject year = extract_date_year(rest_of_date);
                    final SubLObject days_in_month = numeric_date_utilities.days_in_month_number(number_of_month(month), year);
                    if (most_significant_date_amount.numE(days_in_month)) {
                        return reduce_date_end(rest_of_date);
                    }
                    return date;
                } else {
                    if (!pcase_var.eql($$MonthFn)) {
                        return date;
                    }
                    if (NIL != kb_utilities.kbeq(most_significant_date_amount, $$December)) {
                        return reduce_date_end(rest_of_date);
                    }
                    return date;
                }


    }

    public static SubLObject defining_time_unit(final SubLObject calendar_interval) {
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str108$A_KB_dependent_date_specific_func);
        }
        return NIL != forts.valid_fortP(calendar_interval) ? inference_defining_time_unit(calendar_interval) : NIL;
    }

    public static SubLObject defining_time_unit_get_interval(final SubLObject time_unit) {
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str108$A_KB_dependent_date_specific_func);
        }
        return NIL != forts.valid_fortP(time_unit) ? inference_defining_time_unit_get_interval(time_unit) : NIL;
    }

    public static SubLObject inference_defining_time_unit_internal(final SubLObject interval) {
        return kb_mapping_utilities.fpred_value_in_any_mt(interval, $$definingTimeUnit, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject inference_defining_time_unit(final SubLObject interval) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_defining_time_unit_internal(interval);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_DEFINING_TIME_UNIT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_DEFINING_TIME_UNIT, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_DEFINING_TIME_UNIT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, interval, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_defining_time_unit_internal(interval)));
            memoization_state.caching_state_put(caching_state, interval, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject inference_defining_time_unit_get_interval_internal(final SubLObject unit) {
        return kb_mapping_utilities.fpred_value_in_any_mt(unit, $$definingTimeUnit, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
    }

    public static SubLObject inference_defining_time_unit_get_interval(final SubLObject unit) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_defining_time_unit_get_interval_internal(unit);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_DEFINING_TIME_UNIT_GET_INTERVAL, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_DEFINING_TIME_UNIT_GET_INTERVAL, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_DEFINING_TIME_UNIT_GET_INTERVAL, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, unit, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_defining_time_unit_get_interval_internal(unit)));
            memoization_state.caching_state_put(caching_state, unit, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject convert_time_to_date_precision(final SubLObject date, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str108$A_KB_dependent_date_specific_func);
        }
        thread.resetMultipleValues();
        final SubLObject unit = explode_time_force_integer_amount(time);
        final SubLObject amount = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject precision = date_precision(date);
        SubLObject result = NIL;
        if (NIL == precision) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject target_unit = defining_time_unit(precision);
        if (NIL == quantities.comparable_units(unit, target_unit)) {
            relation_evaluation.throw_unevaluatable();
        }
        if (NIL != quantities.smaller_unit_than($$YearsDuration, unit)) {
            final SubLObject years = quantities.convert_to_units($$YearsDuration, unit, amount, UNPROVIDED);
            result = quantities.make_interval($$YearsDuration, floor(years, UNPROVIDED), UNPROVIDED);
        } else
            if (NIL != quantities.smaller_unit_than(unit, target_unit)) {
                final SubLObject converted = quantities.convert_to_units(target_unit, unit, amount, UNPROVIDED);
                result = quantities.make_interval(target_unit, ceiling(converted, UNPROVIDED), UNPROVIDED);
            } else {
                result = time;
            }

        return result;
    }

    public static SubLObject extend_date_to_time_precision(final SubLObject date, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str108$A_KB_dependent_date_specific_func);
        }
        thread.resetMultipleValues();
        final SubLObject unit = explode_time_force_integer_amount(time);
        final SubLObject amount = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject precision = date_precision(date);
        SubLObject result = NIL;
        if (NIL == precision) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject target_unit = defining_time_unit(precision);
        if (NIL == quantities.comparable_units(unit, target_unit)) {
            relation_evaluation.throw_unevaluatable();
        }
        if (NIL != quantities.smaller_unit_than($$YearsDuration, unit)) {
            result = date;
        } else
            if (NIL != quantities.smaller_unit_than(unit, target_unit)) {
                result = date_to_precision(date, defining_time_unit_get_interval(unit), UNPROVIDED);
            } else {
                result = date;
            }

        return result;
    }

    public static SubLObject minute_of_date(final SubLObject date) {
        final SubLObject minute = (NIL != date_p(date)) ? extract_date_minute(date) : NIL;
        final SubLObject hour = (NIL != subl_promotions.non_negative_integer_p(minute)) ? hour_of_date(date) : NIL;
        return NIL != narts_high.naut_p(hour) ? make_binary_formula($$MinuteFn, minute, hour) : NIL;
    }

    public static SubLObject hour_of_date(final SubLObject date) {
        final SubLObject hour = (NIL != date_p(date)) ? extract_date_hour(date) : NIL;
        final SubLObject day = (NIL != subl_promotions.non_negative_integer_p(hour)) ? day_of_date(date) : NIL;
        return NIL != narts_high.naut_p(day) ? make_binary_formula($$HourFn, hour, day) : NIL;
    }

    public static SubLObject day_of_date(final SubLObject date) {
        final SubLObject day = (NIL != date_p(date)) ? extract_date_day(date) : NIL;
        final SubLObject month = (NIL != subl_promotions.positive_integer_p(day)) ? month_of_date(date) : NIL;
        return NIL != narts_high.naut_p(month) ? make_binary_formula($$DayFn, day, month) : NIL;
    }

    public static SubLObject month_of_date(final SubLObject date) {
        final SubLObject month = (NIL != date_p(date)) ? extract_date_month(date) : NIL;
        final SubLObject year = (NIL != forts.fort_p(month)) ? year_of_date(date) : NIL;
        return NIL != narts_high.naut_p(year) ? make_binary_formula($$MonthFn, month, year) : NIL;
    }

    public static SubLObject quarter_of_date(final SubLObject date) {
        final SubLObject month = (NIL != date_p(date)) ? extract_date_month(date) : NIL;
        final SubLObject quarter = (NIL != forts.fort_p(month)) ? quarter_of_month(month) : NIL;
        final SubLObject year = (quarter.isInteger()) ? year_of_date(date) : NIL;
        return NIL != narts_high.naut_p(year) ? make_binary_formula($$QuarterFn, quarter, year) : NIL;
    }

    public static SubLObject quarter_of_month(final SubLObject month) {
        return number_utilities.f_1X(integerDivide(number_of_month(month), FOUR_INTEGER));
    }

    public static SubLObject year_of_date(final SubLObject date) {
        final SubLObject year = (NIL != date_p(date)) ? extract_date_year(date) : NIL;
        return year.isInteger() ? make_unary_formula($$YearFn, year) : NIL;
    }

    public static SubLObject decade_of_date(final SubLObject date) {
        SubLObject decade = extract_date_decade(date);
        if (!decade.isInteger()) {
            final SubLObject year = extract_date_year(date);
            if (year.isInteger()) {
                decade = integerDivide(year, TEN_INTEGER);
            }
        }
        return decade.isInteger() ? make_unary_formula($$DecadeFn, decade) : NIL;
    }

    public static SubLObject century_of_date(final SubLObject date) {
        SubLObject century = extract_date_century(date);
        if (!century.isInteger()) {
            final SubLObject one_indexed_year = extract_date_year(date);
            if (one_indexed_year.isInteger()) {
                final SubLObject zero_indexed_year = number_utilities.f_1_(one_indexed_year);
                final SubLObject zero_indexed_century = integerDivide(zero_indexed_year, $int$100);
                final SubLObject one_indexed_century = century = number_utilities.f_1X(zero_indexed_century);
            }
        }
        if (!century.isInteger()) {
            final SubLObject decade = extract_date_decade(date);
            if (decade.isInteger() && (!mod(decade, TEN_INTEGER).isZero())) {
                final SubLObject zero_indexed_century2 = integerDivide(decade, TEN_INTEGER);
                final SubLObject one_indexed_century2 = century = number_utilities.f_1X(zero_indexed_century2);
            }
        }
        return century.isInteger() ? make_unary_formula($$CenturyFn, century) : NIL;
    }

    public static SubLObject dateLE(final SubLObject date1, final SubLObject date2) {
        return makeBoolean((NIL != dateE(date1, date2)) || (NIL != dateL(date1, date2)));
    }

    public static SubLObject dateGE(final SubLObject date1, final SubLObject date2) {
        return dateLE(date2, date1);
    }

    public static SubLObject dateE(final SubLObject date1, final SubLObject date2) {
        return equal(date1, date2);
    }

    public static SubLObject dateL(final SubLObject date1, final SubLObject date2) {
        if (NIL != beginning_of_timeP(date2)) {
            return NIL;
        }
        if (NIL != beginning_of_timeP(date1)) {
            return T;
        }
        if (NIL != end_of_timeP(date1)) {
            return NIL;
        }
        if (NIL != end_of_timeP(date2)) {
            return T;
        }
        if ((NIL == date_p(date1)) || (NIL == date_p(date2))) {
            return NIL;
        }
        final SubLObject format1 = date_format(date1);
        final SubLObject format2 = date_format(date2);
        if (format1.eql(format2)) {
            return dateL_int(date1, date2);
        }
        if (((format1 == $CALENDAR) && (format2 == $QUARTER)) && $$YearFn.eql(cycl_utilities.el_formula_operator(date1))) {
            return dateL_int(date1, year_of_date(date2));
        }
        if (((format2 == $CALENDAR) && (format1 == $QUARTER)) && $$YearFn.eql(cycl_utilities.el_formula_operator(date2))) {
            return dateL_int(year_of_date(date1), date2);
        }
        if (NIL != date_formatG(format1, format2)) {
            return dateL_int(date1, truncate_date_to_format(date2, format1));
        }
        return dateL_int(truncate_date_to_format(date1, format2), date2);
    }

    public static SubLObject dateG(final SubLObject date1, final SubLObject date2) {
        return dateL(date2, date1);
    }

    public static SubLObject dateL_int(final SubLObject date1, final SubLObject date2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject format1 = explode_date(date1);
        final SubLObject year1 = thread.secondMultipleValue();
        final SubLObject month1 = thread.thirdMultipleValue();
        final SubLObject day1 = thread.fourthMultipleValue();
        final SubLObject hour1 = thread.fifthMultipleValue();
        final SubLObject min1 = thread.sixthMultipleValue();
        final SubLObject sec1 = thread.seventhMultipleValue();
        final SubLObject millisec1 = thread.eighthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject format2 = explode_date(date2);
        final SubLObject year2 = thread.secondMultipleValue();
        final SubLObject month2 = thread.thirdMultipleValue();
        final SubLObject day2 = thread.fourthMultipleValue();
        final SubLObject hour2 = thread.fifthMultipleValue();
        final SubLObject min2 = thread.sixthMultipleValue();
        final SubLObject sec2 = thread.seventhMultipleValue();
        final SubLObject millisec2 = thread.eighthMultipleValue();
        thread.resetMultipleValues();
        if ((year1.isInteger() && year2.isInteger()) && year1.numL(year2)) {
            return T;
        }
        if (!year1.eql(year2)) {
            return NIL;
        }
        if ((month1.isInteger() && month2.isInteger()) && month1.numL(month2)) {
            return T;
        }
        if (!month1.eql(month2)) {
            return NIL;
        }
        if ((day1.isInteger() && day2.isInteger()) && day1.numL(day2)) {
            return T;
        }
        if (!day1.eql(day2)) {
            return NIL;
        }
        if ((hour1.isInteger() && hour2.isInteger()) && hour1.numL(hour2)) {
            return T;
        }
        if (!hour1.eql(hour2)) {
            return NIL;
        }
        if ((min1.isInteger() && min2.isInteger()) && min1.numL(min2)) {
            return T;
        }
        if (!min1.eql(min2)) {
            return NIL;
        }
        if ((sec1.isInteger() && sec2.isInteger()) && sec1.numL(sec2)) {
            return T;
        }
        if (!sec1.eql(sec2)) {
            return NIL;
        }
        if ((millisec1.isInteger() && millisec2.isInteger()) && millisec1.numL(millisec2)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject cycl_date_initial_second(SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == date_p(date))) {
            Errors.error($str153$_a_is_not_a_valid_cycl_date_, date);
        }
        SubLObject millisec = ZERO_INTEGER;
        SubLObject second = ZERO_INTEGER;
        SubLObject minute = ZERO_INTEGER;
        SubLObject hour = ZERO_INTEGER;
        SubLObject day = ONE_INTEGER;
        SubLObject month = ONE_INTEGER;
        SubLObject year = NIL;
        while (date.isCons()) {
            final SubLObject pcase_var;
            final SubLObject function = pcase_var = date.first();
            if (pcase_var.eql($$MilliSecondFn)) {
                millisec = second(date);
                date = third(date);
            } else
                if (pcase_var.eql($$SecondFn)) {
                    second = second(date);
                    date = third(date);
                } else
                    if (pcase_var.eql($$MinuteFn)) {
                        minute = second(date);
                        date = third(date);
                    } else
                        if (pcase_var.eql($$HourFn)) {
                            hour = second(date);
                            date = third(date);
                        } else
                            if (pcase_var.eql($$DayFn)) {
                                day = second(date);
                                date = third(date);
                            } else
                                if (pcase_var.eql($$MonthFn)) {
                                    month = number_of_month(second(date));
                                    date = third(date);
                                } else
                                    if (pcase_var.eql($$QuarterFn)) {
                                        month = subtract(multiply(second(date), THREE_INTEGER), TWO_INTEGER);
                                        date = third(date);
                                    } else
                                        if (pcase_var.eql($$YearFn)) {
                                            year = second(date);
                                            date = NIL;
                                        } else
                                            if (pcase_var.eql($$DecadeFn)) {
                                                year = multiply(second(date), TEN_INTEGER);
                                                date = NIL;
                                            } else {
                                                if (!pcase_var.eql($$CenturyFn)) {
                                                    return NIL;
                                                }
                                                year = number_utilities.f_1X(multiply(number_utilities.f_1_(second(date)), $int$100));
                                                date = NIL;
                                            }








        } 
        month = month_number(month);
        return construct_cycl_date(second, minute, hour, day, month, year);
    }

    public static SubLObject cycl_date_final_second(final SubLObject date) {
        assert NIL != date_p(date) : "date_utilities.date_p(date) " + "CommonSymbols.NIL != date_utilities.date_p(date) " + date;
        SubLObject destructable_date = date;
        SubLObject millisec = $int$999;
        SubLObject second = $int$59;
        SubLObject minute = $int$59;
        SubLObject hour = $int$23;
        SubLObject day = NIL;
        SubLObject month = TWELVE_INTEGER;
        SubLObject year = NIL;
        while (destructable_date.isCons()) {
            final SubLObject pcase_var;
            final SubLObject function = pcase_var = destructable_date.first();
            if (pcase_var.eql($$MilliSecondFn)) {
                millisec = second(destructable_date);
                destructable_date = third(destructable_date);
            } else
                if (pcase_var.eql($$SecondFn)) {
                    second = second(destructable_date);
                    destructable_date = third(destructable_date);
                } else
                    if (pcase_var.eql($$MinuteFn)) {
                        minute = second(destructable_date);
                        destructable_date = third(destructable_date);
                    } else
                        if (pcase_var.eql($$HourFn)) {
                            hour = second(destructable_date);
                            destructable_date = third(destructable_date);
                        } else
                            if (pcase_var.eql($$DayFn)) {
                                day = second(destructable_date);
                                destructable_date = third(destructable_date);
                            } else
                                if (pcase_var.eql($$MonthFn)) {
                                    month = number_of_month(second(destructable_date));
                                    destructable_date = third(destructable_date);
                                } else
                                    if (pcase_var.eql($$QuarterFn)) {
                                        month = multiply(second(destructable_date), THREE_INTEGER);
                                        destructable_date = third(destructable_date);
                                    } else
                                        if (pcase_var.eql($$YearFn)) {
                                            year = second(destructable_date);
                                            destructable_date = NIL;
                                        } else
                                            if (pcase_var.eql($$DecadeFn)) {
                                                year = add(multiply(second(destructable_date), TEN_INTEGER), NINE_INTEGER);
                                                destructable_date = NIL;
                                            } else {
                                                if (!pcase_var.eql($$CenturyFn)) {
                                                    return NIL;
                                                }
                                                year = multiply(second(destructable_date), $int$100);
                                                destructable_date = NIL;
                                            }








        } 
        if (NIL == day) {
            day = (month.numE(TWO_INTEGER) && (NIL != numeric_date_utilities.leap_year_p(year))) ? $int$29 : numeric_date_utilities.usual_days_in_month_number(month);
        }
        month = month_number(month);
        return construct_cycl_date(second, minute, hour, day, month, year);
    }

    public static SubLObject date_subsumes(final SubLObject date1, final SubLObject date2) {
        final SubLObject validP = makeBoolean((NIL != date_p(date1)) && (NIL != date_p(date2)));
        final SubLObject subsumesP = makeBoolean(((NIL != validP) && (NIL != dateLE(cycl_date_initial_second(date1), cycl_date_initial_second(date2)))) && (NIL != dateLE(cycl_date_final_second(date2), cycl_date_final_second(date1))));
        return values(subsumesP, validP);
    }

    public static SubLObject cycl_date_initial_millisecond(SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == date_p(date))) {
            Errors.error($str153$_a_is_not_a_valid_cycl_date_, date);
        }
        SubLObject millisecond = ZERO_INTEGER;
        SubLObject second = ZERO_INTEGER;
        SubLObject minute = ZERO_INTEGER;
        SubLObject hour = ZERO_INTEGER;
        SubLObject day = ONE_INTEGER;
        SubLObject month = ONE_INTEGER;
        SubLObject year = NIL;
        while (date.isCons()) {
            final SubLObject pcase_var;
            final SubLObject function = pcase_var = date.first();
            if (pcase_var.eql($$MilliSecondFn)) {
                millisecond = second(date);
                date = third(date);
            } else
                if (pcase_var.eql($$SecondFn)) {
                    second = second(date);
                    date = third(date);
                } else
                    if (pcase_var.eql($$MinuteFn)) {
                        minute = second(date);
                        date = third(date);
                    } else
                        if (pcase_var.eql($$HourFn)) {
                            hour = second(date);
                            date = third(date);
                        } else
                            if (pcase_var.eql($$DayFn)) {
                                day = second(date);
                                date = third(date);
                            } else
                                if (pcase_var.eql($$MonthFn)) {
                                    month = number_of_month(second(date));
                                    date = third(date);
                                } else
                                    if (pcase_var.eql($$QuarterFn)) {
                                        month = subtract(multiply(second(date), THREE_INTEGER), TWO_INTEGER);
                                        date = third(date);
                                    } else
                                        if (pcase_var.eql($$YearFn)) {
                                            year = second(date);
                                            date = NIL;
                                        } else
                                            if (pcase_var.eql($$DecadeFn)) {
                                                year = multiply(second(date), TEN_INTEGER);
                                                date = NIL;
                                            } else {
                                                if (!pcase_var.eql($$CenturyFn)) {
                                                    return NIL;
                                                }
                                                year = number_utilities.f_1X(multiply(number_utilities.f_1_(second(date)), $int$100));
                                                date = NIL;
                                            }








        } 
        month = month_number(month);
        return construct_cycl_date_ms(millisecond, second, minute, hour, day, month, year);
    }

    public static SubLObject cycl_date_final_millisecond(final SubLObject date) {
        assert NIL != date_p(date) : "date_utilities.date_p(date) " + "CommonSymbols.NIL != date_utilities.date_p(date) " + date;
        SubLObject destructable_date = date;
        SubLObject millisecond = $int$999;
        SubLObject second = $int$59;
        SubLObject minute = $int$59;
        SubLObject hour = $int$23;
        SubLObject day = NIL;
        SubLObject month = TWELVE_INTEGER;
        SubLObject year = NIL;
        while (destructable_date.isCons()) {
            final SubLObject pcase_var;
            final SubLObject function = pcase_var = destructable_date.first();
            if (pcase_var.eql($$MilliSecondFn)) {
                millisecond = second(destructable_date);
                destructable_date = third(destructable_date);
            } else
                if (pcase_var.eql($$SecondFn)) {
                    second = second(destructable_date);
                    destructable_date = third(destructable_date);
                } else
                    if (pcase_var.eql($$MinuteFn)) {
                        minute = second(destructable_date);
                        destructable_date = third(destructable_date);
                    } else
                        if (pcase_var.eql($$HourFn)) {
                            hour = second(destructable_date);
                            destructable_date = third(destructable_date);
                        } else
                            if (pcase_var.eql($$DayFn)) {
                                day = second(destructable_date);
                                destructable_date = third(destructable_date);
                            } else
                                if (pcase_var.eql($$MonthFn)) {
                                    month = number_of_month(second(destructable_date));
                                    destructable_date = third(destructable_date);
                                } else
                                    if (pcase_var.eql($$QuarterFn)) {
                                        month = multiply(second(destructable_date), THREE_INTEGER);
                                        destructable_date = third(destructable_date);
                                    } else
                                        if (pcase_var.eql($$YearFn)) {
                                            year = second(destructable_date);
                                            destructable_date = NIL;
                                        } else
                                            if (pcase_var.eql($$DecadeFn)) {
                                                year = add(multiply(second(destructable_date), TEN_INTEGER), NINE_INTEGER);
                                                destructable_date = NIL;
                                            } else {
                                                if (!pcase_var.eql($$CenturyFn)) {
                                                    return NIL;
                                                }
                                                year = multiply(second(destructable_date), $int$100);
                                                destructable_date = NIL;
                                            }








        } 
        if (NIL == day) {
            day = (month.numE(TWO_INTEGER) && (NIL != numeric_date_utilities.leap_year_p(year))) ? $int$29 : numeric_date_utilities.usual_days_in_month_number(month);
        }
        month = month_number(month);
        return construct_cycl_date_ms(millisecond, second, minute, hour, day, month, year);
    }

    public static SubLObject explode_time(final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject unit = quantities.explode_interval(time);
        final SubLObject min = thread.secondMultipleValue();
        final SubLObject max = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (!min.numE(max)) {
            relation_evaluation.throw_unevaluatable();
        }
        return values(unit, min);
    }

    public static SubLObject explode_time_force_integer_amount(final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject unit = explode_time(time);
        SubLObject amount = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cur_unit;
        SubLObject cur_amount;
        SubLObject smaller_unit;
        SubLObject bigger_amount;
        for (cur_unit = unit, cur_amount = amount; (NIL != cur_unit) && (NIL == number_utilities.divides_evenly(cur_amount, ONE_INTEGER)); cur_unit = smaller_unit , cur_amount = (NIL != kb_utilities.kbeq(cur_unit, $$SecondsDuration)) ? round(bigger_amount, UNPROVIDED) : bigger_amount) {
            smaller_unit = next_smallest_duration_function(cur_unit);
            bigger_amount = (NIL != smaller_unit) ? quantities.convert_to_units(smaller_unit, cur_unit, cur_amount, UNPROVIDED) : NIL;
        }
        if ((NIL != cur_unit) && (NIL != cur_amount)) {
            unit = cur_unit;
            amount = round(cur_amount, UNPROVIDED);
        }
        return values(unit, amount);
    }

    public static SubLObject next_smallest_duration_function(final SubLObject date_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fn_index = position(date_fn, $duration_denoting_functions_ordered$.getDynamicValue(thread), KBEQ, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == fn_index) {
            return $$SecondsDuration;
        }
        if (fn_index.eql(ZERO_INTEGER)) {
            return NIL;
        }
        return nth(subtract(fn_index, ONE_INTEGER), $duration_denoting_functions_ordered$.getDynamicValue(thread));
    }

    public static SubLObject date_after(final SubLObject date, SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != date_p(date) : "date_utilities.date_p(date) " + "CommonSymbols.NIL != date_utilities.date_p(date) " + date;
        assert NIL != time_parameter_utilities.duration_p(time) : "time_parameter_utilities.duration_p(time) " + "CommonSymbols.NIL != time_parameter_utilities.duration_p(time) " + time;
        time = convert_time_to_date_precision(date, time);
        thread.resetMultipleValues();
        final SubLObject format = explode_date(date);
        final SubLObject year = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        final SubLObject min = thread.sixthMultipleValue();
        final SubLObject sec = thread.seventhMultipleValue();
        final SubLObject millisec = thread.eighthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject unit = explode_time_force_integer_amount(time);
        final SubLObject amount = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (format == $CALENDAR) {
            return calendar_date_sum(unit, amount, year, month, day, hour, min, sec, millisec);
        }
        if (format == $QUARTER) {
            return quarter_date_sum(unit, amount, year, month);
        }
        if (format == $DECADE) {
            return decade_date_sum(unit, amount, year);
        }
        if (format == $CENTURY) {
            return century_date_sum(unit, amount, year);
        }
        return NIL;
    }

    public static SubLObject date_after_precise(final SubLObject date, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != date_p(date) : "date_utilities.date_p(date) " + "CommonSymbols.NIL != date_utilities.date_p(date) " + date;
        assert NIL != time_parameter_utilities.duration_p(time) : "time_parameter_utilities.duration_p(time) " + "CommonSymbols.NIL != time_parameter_utilities.duration_p(time) " + time;
        thread.resetMultipleValues();
        final SubLObject format = explode_date(extend_date_to_time_precision(time_interval_utilities.succeeding_cycl_date(date), time));
        final SubLObject year = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        final SubLObject min = thread.sixthMultipleValue();
        final SubLObject sec = thread.seventhMultipleValue();
        final SubLObject millisec = thread.eighthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject unit = explode_time_force_integer_amount(time);
        final SubLObject amount = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (format == $CALENDAR) {
            return calendar_date_sum(unit, amount, year, month, day, hour, min, sec, millisec);
        }
        if (format == $QUARTER) {
            return quarter_date_sum(unit, amount, year, month);
        }
        if (format == $DECADE) {
            return decade_date_sum(unit, amount, year);
        }
        if (format == $CENTURY) {
            return century_date_sum(unit, amount, year);
        }
        return NIL;
    }

    public static SubLObject date_after_duration_start_precise(final SubLObject date, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != date_p(date) : "date_utilities.date_p(date) " + "CommonSymbols.NIL != date_utilities.date_p(date) " + date;
        assert NIL != time_parameter_utilities.duration_p(time) : "time_parameter_utilities.duration_p(time) " + "CommonSymbols.NIL != time_parameter_utilities.duration_p(time) " + time;
        thread.resetMultipleValues();
        final SubLObject format = explode_date(extend_date_to_time_precision(date, time));
        final SubLObject year = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        final SubLObject min = thread.sixthMultipleValue();
        final SubLObject sec = thread.seventhMultipleValue();
        final SubLObject millisec = thread.eighthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject unit = explode_time_force_integer_amount(time);
        final SubLObject amount = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (format == $CALENDAR) {
            return calendar_date_sum(unit, amount, year, month, day, hour, min, sec, millisec);
        }
        if (format == $QUARTER) {
            return quarter_date_sum(unit, amount, year, month);
        }
        if (format == $DECADE) {
            return decade_date_sum(unit, amount, year);
        }
        if (format == $CENTURY) {
            return century_date_sum(unit, amount, year);
        }
        return NIL;
    }

    public static SubLObject date_before(final SubLObject date, SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != date_p(date) : "date_utilities.date_p(date) " + "CommonSymbols.NIL != date_utilities.date_p(date) " + date;
        assert NIL != time_parameter_utilities.duration_p(time) : "time_parameter_utilities.duration_p(time) " + "CommonSymbols.NIL != time_parameter_utilities.duration_p(time) " + time;
        time = convert_time_to_date_precision(date, time);
        thread.resetMultipleValues();
        final SubLObject format = explode_date(date);
        final SubLObject year = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        final SubLObject min = thread.sixthMultipleValue();
        final SubLObject sec = thread.seventhMultipleValue();
        final SubLObject millisec = thread.eighthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject unit = explode_time_force_integer_amount(time);
        final SubLObject amount = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (format == $CALENDAR) {
            return calendar_date_sum(unit, minus(amount), year, month, day, hour, min, sec, millisec);
        }
        if (format == $QUARTER) {
            return quarter_date_sum(unit, minus(amount), year, month);
        }
        if (format == $DECADE) {
            return decade_date_sum(unit, minus(amount), year);
        }
        if (format == $CENTURY) {
            return century_date_sum(unit, minus(amount), year);
        }
        return NIL;
    }

    public static SubLObject date_before_precise(final SubLObject date, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != date_p(date) : "date_utilities.date_p(date) " + "CommonSymbols.NIL != date_utilities.date_p(date) " + date;
        assert NIL != time_parameter_utilities.duration_p(time) : "time_parameter_utilities.duration_p(time) " + "CommonSymbols.NIL != time_parameter_utilities.duration_p(time) " + time;
        thread.resetMultipleValues();
        final SubLObject format = explode_date(extend_date_to_time_precision(date, time));
        final SubLObject year = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        final SubLObject min = thread.sixthMultipleValue();
        final SubLObject sec = thread.seventhMultipleValue();
        final SubLObject millisec = thread.eighthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject unit = explode_time_force_integer_amount(time);
        final SubLObject amount = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (format == $CALENDAR) {
            return calendar_date_sum(unit, minus(amount), year, month, day, hour, min, sec, millisec);
        }
        if (format == $QUARTER) {
            return quarter_date_sum(unit, minus(amount), year, month);
        }
        if (format == $DECADE) {
            return decade_date_sum(unit, minus(amount), year);
        }
        if (format == $CENTURY) {
            return century_date_sum(unit, minus(amount), year);
        }
        return NIL;
    }

    public static SubLObject convert_time_quant_to_seconds(final SubLObject time_quant) {
        final SubLObject operator = cycl_utilities.formula_operator(time_quant);
        final SubLObject duration = cycl_utilities.formula_arg1(time_quant, UNPROVIDED);
        final SubLObject pcase_var = operator;
        if (pcase_var.eql($$MillisecondsDuration)) {
            return divide(duration, numeric_date_utilities.$milliseconds_in_a_second$.getGlobalValue());
        }
        if (pcase_var.eql($$SecondsDuration)) {
            return duration;
        }
        if (pcase_var.eql($$MinutesDuration)) {
            return multiply(duration, numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue());
        }
        if (pcase_var.eql($$HoursDuration)) {
            return multiply(duration, numeric_date_utilities.$seconds_in_an_hour$.getGlobalValue());
        }
        if (pcase_var.eql($$DaysDuration)) {
            return multiply(duration, numeric_date_utilities.$seconds_in_a_day$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject convert_time_quant_to_minutes(final SubLObject time_quant) {
        final SubLObject operator = cycl_utilities.formula_operator(time_quant);
        final SubLObject duration = cycl_utilities.formula_arg1(time_quant, UNPROVIDED);
        final SubLObject pcase_var = operator;
        if (pcase_var.eql($$MinutesDuration)) {
            return duration;
        }
        if (pcase_var.eql($$HoursDuration)) {
            return multiply(duration, numeric_date_utilities.$minutes_in_an_hour$.getGlobalValue());
        }
        if (pcase_var.eql($$DaysDuration)) {
            return multiply(duration, numeric_date_utilities.$hours_in_a_day$.getGlobalValue(), numeric_date_utilities.$minutes_in_an_hour$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject convert_time_quant_to_hours(final SubLObject time_quant) {
        final SubLObject operator = cycl_utilities.formula_operator(time_quant);
        final SubLObject duration = cycl_utilities.formula_arg1(time_quant, UNPROVIDED);
        final SubLObject pcase_var = operator;
        if (pcase_var.eql($$HoursDuration)) {
            return duration;
        }
        if (pcase_var.eql($$DaysDuration)) {
            return multiply(duration, numeric_date_utilities.$hours_in_a_day$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject convert_time_quant_to_days(final SubLObject time_quant) {
        final SubLObject operator = cycl_utilities.formula_operator(time_quant);
        final SubLObject duration = cycl_utilities.formula_arg1(time_quant, UNPROVIDED);
        final SubLObject pcase_var = operator;
        if (pcase_var.eql($$DaysDuration)) {
            return duration;
        }
        return NIL;
    }

    public static SubLObject convert_time_quant_to_months(final SubLObject time_quant) {
        final SubLObject operator = cycl_utilities.formula_operator(time_quant);
        final SubLObject duration = cycl_utilities.formula_arg1(time_quant, UNPROVIDED);
        final SubLObject pcase_var = operator;
        if (pcase_var.eql($$MonthsDuration)) {
            return duration;
        }
        if (pcase_var.eql($$QuartersDuration)) {
            return multiply(duration, numeric_date_utilities.$months_in_a_quarter$.getGlobalValue());
        }
        if (pcase_var.eql($$YearsDuration)) {
            return multiply(duration, numeric_date_utilities.$months_in_a_year$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject convert_time_quant_to_years(final SubLObject time_quant) {
        final SubLObject operator = cycl_utilities.formula_operator(time_quant);
        final SubLObject duration = cycl_utilities.formula_arg1(time_quant, UNPROVIDED);
        final SubLObject pcase_var = operator;
        if (pcase_var.eql($$YearsDuration)) {
            return duration;
        }
        if (pcase_var.eql($$DecadesDuration)) {
            return multiply(duration, numeric_date_utilities.$years_in_a_decade$.getGlobalValue());
        }
        if (pcase_var.eql($$CenturiesDuration)) {
            return multiply(duration, numeric_date_utilities.$years_in_a_century$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject time_elapsed(final SubLObject date_1, final SubLObject date_2, SubLObject precision) {
        if (precision == UNPROVIDED) {
            precision = NIL;
        }
        SubLObject result = NIL;
        if (NIL == precision) {
            precision = time_elapsed_precision(date_1, date_2);
        }
        final SubLObject pcase_var = precision;
        if (pcase_var.eql($$DecadesDuration)) {
            result = years_elapsed(date_1, date_2, precision, TEN_INTEGER);
        } else
            if (pcase_var.eql($$YearsDuration)) {
                result = years_elapsed(date_1, date_2, precision, UNPROVIDED);
            } else
                if (pcase_var.eql($$QuartersDuration)) {
                    result = months_elapsed(date_1, date_2, precision, THREE_INTEGER);
                } else
                    if (pcase_var.eql($$MonthsDuration)) {
                        result = months_elapsed(date_1, date_2, precision, UNPROVIDED);
                    } else {
                        final SubLObject begin_date_1 = cycl_date_initial_millisecond(date_1);
                        final SubLObject begin_date_2 = cycl_date_initial_millisecond(date_2);
                        if (begin_date_1.equal(begin_date_2)) {
                            result = list(precision, ZERO_INTEGER);
                        } else
                            if (NIL != dateL(begin_date_1, begin_date_2)) {
                                result = time_elapsed_difference(begin_date_1, begin_date_2, precision);
                            } else {
                                result = time_elapsed_difference(begin_date_2, begin_date_1, precision);
                            }

                    }



        return result;
    }

    public static SubLObject time_elapsed_precision(final SubLObject date_1, final SubLObject date_2) {
        final SubLObject date_1_precision = date_precision(date_1);
        final SubLObject date_2_precision = date_precision(date_2);
        if ((NIL != kb_utilities.kbeq(date_1_precision, $$CalendarMilliSecond)) || (NIL != kb_utilities.kbeq(date_2_precision, $$CalendarMilliSecond))) {
            return $$MillisecondsDuration;
        }
        if ((NIL != kb_utilities.kbeq(date_1_precision, $$CalendarSecond)) || (NIL != kb_utilities.kbeq(date_2_precision, $$CalendarSecond))) {
            return $$SecondsDuration;
        }
        if ((NIL != kb_utilities.kbeq(date_1_precision, $$CalendarMinute)) || (NIL != kb_utilities.kbeq(date_2_precision, $$CalendarMinute))) {
            return $$MinutesDuration;
        }
        if ((NIL != kb_utilities.kbeq(date_1_precision, $$CalendarHour)) || (NIL != kb_utilities.kbeq(date_2_precision, $$CalendarHour))) {
            return $$HoursDuration;
        }
        if ((NIL != kb_utilities.kbeq(date_1_precision, $$CalendarDay)) || (NIL != kb_utilities.kbeq(date_2_precision, $$CalendarDay))) {
            return $$DaysDuration;
        }
        if ((NIL != kb_utilities.kbeq(date_1_precision, $$CalendarMonth)) || (NIL != kb_utilities.kbeq(date_2_precision, $$CalendarMonth))) {
            return $$MonthsDuration;
        }
        if ((NIL != kb_utilities.kbeq(date_1_precision, $$CalendarQuarter)) || (NIL != kb_utilities.kbeq(date_2_precision, $$CalendarQuarter))) {
            return $$QuartersDuration;
        }
        if ((NIL != kb_utilities.kbeq(date_1_precision, $$CalendarYear)) || (NIL != kb_utilities.kbeq(date_2_precision, $$CalendarYear))) {
            return $$YearsDuration;
        }
        if ((NIL != kb_utilities.kbeq(date_1_precision, $$CalendarDecade)) || (NIL != kb_utilities.kbeq(date_2_precision, $$CalendarDecade))) {
            return $$DecadesDuration;
        }
        Errors.error($str158$Could_not_determine_precision_for, date_1, date_2);
        return NIL;
    }

    public static SubLObject time_elapsed_difference(final SubLObject date_a, final SubLObject date_b, final SubLObject precision) {
        SubLObject duration = NIL;
        if (precision.eql($$YearsDuration)) {
            duration = years_difference(date_a, date_b);
        } else
            if (precision.eql($$MonthsDuration)) {
                duration = months_difference(date_a, date_b);
            } else
                if (precision.eql($$DaysDuration)) {
                    duration = days_difference(date_a, date_b);
                } else
                    if (precision.eql($$HoursDuration)) {
                        duration = hours_difference(date_a, date_b);
                    } else
                        if (precision.eql($$MinutesDuration)) {
                            duration = minutes_difference(date_a, date_b);
                        } else
                            if (precision.eql($$SecondsDuration)) {
                                duration = seconds_difference(date_a, date_b);
                            } else
                                if (precision.eql($$MillisecondsDuration)) {
                                    duration = milliseconds_difference(date_a, date_b);
                                }






        if (NIL != duration) {
            return list(precision, duration);
        }
        return NIL;
    }

    public static SubLObject years_difference(final SubLObject date_a, final SubLObject date_b) {
        return subtract(extract_date_year(date_b), extract_date_year(date_a));
    }

    public static SubLObject months_difference(final SubLObject date_a, final SubLObject date_b) {
        return add(multiply(TWELVE_INTEGER, years_difference(date_a, date_b)), subtract(extract_date_month_number(date_b), extract_date_month_number(date_a)));
    }

    public static SubLObject days_difference(final SubLObject date_a, final SubLObject date_b) {
        return subtract(days_since_rata_die(date_b), days_since_rata_die(date_a));
    }

    public static SubLObject hours_difference(final SubLObject date_a, final SubLObject date_b) {
        return add(multiply($int$24, days_difference(date_a, date_b)), subtract(extract_date_hour(date_b), extract_date_hour(date_a)));
    }

    public static SubLObject minutes_difference(final SubLObject date_a, final SubLObject date_b) {
        return add(multiply($int$60, hours_difference(date_a, date_b)), subtract(extract_date_minute(date_b), extract_date_minute(date_a)));
    }

    public static SubLObject seconds_difference(final SubLObject date_a, final SubLObject date_b) {
        return add(multiply($int$60, minutes_difference(date_a, date_b)), subtract(extract_date_second(date_b), extract_date_second(date_a)));
    }

    public static SubLObject milliseconds_difference(final SubLObject date_a, final SubLObject date_b) {
        return add(multiply($int$1000, seconds_difference(date_a, date_b)), subtract(extract_date_millisecond(date_b), extract_date_millisecond(date_a)));
    }

    public static SubLObject leap_years_between(final SubLObject date_a, final SubLObject date_b) {
        final SubLObject year_a = extract_date_year(date_a);
        final SubLObject year_b = extract_date_year(date_b);
        final SubLObject month_a = extract_date_month_number(date_a);
        final SubLObject cent_a = truncate(year_a, $int$100);
        final SubLObject cent_b = truncate(year_b, $int$100);
        SubLObject leap_years = naive_leap_years_between(year_a, year_b);
        if (year_a.numE(year_b)) {
            return ZERO_INTEGER;
        }
        if ((NIL != numeric_date_utilities.leap_year_p(year_a)) && ((!month_a.isNumber()) || month_a.numL(THREE_INTEGER))) {
            leap_years = add(leap_years, ONE_INTEGER);
        }
        if (cent_b.numG(cent_a)) {
            final SubLObject leap_centuries = naive_leap_years_between(cent_a, cent_b);
            leap_years = subtract(leap_years, subtract(subtract(cent_b, cent_a), leap_centuries));
        }
        return leap_years;
    }

    public static SubLObject naive_leap_years_between(final SubLObject year_a, final SubLObject year_b) {
        final SubLObject leap_days = floor(add(subtract(year_b, year_a), mod(year_a, FOUR_INTEGER)), FOUR_INTEGER);
        return leap_days;
    }

    public static SubLObject years_elapsed(final SubLObject date_1, final SubLObject date_2, final SubLObject precision, SubLObject multiplier) {
        if (multiplier == UNPROVIDED) {
            multiplier = ONE_INTEGER;
        }
        final SubLObject udate_1 = extended_universal_date_for_date_initial_second(date_1);
        final SubLObject udate_2 = extended_universal_date_for_date_initial_second(date_2);
        final SubLObject divisor = multiply($u_date_year_div$.getGlobalValue(), multiplier);
        SubLObject duration = NIL;
        if (udate_1.numL(udate_2)) {
            duration = subtract(integerDivide(udate_2, divisor), integerDivide(udate_1, divisor));
        } else {
            duration = subtract(integerDivide(udate_1, divisor), integerDivide(udate_2, divisor));
        }
        return list(precision, duration);
    }

    public static SubLObject months_elapsed(final SubLObject date_1, final SubLObject date_2, final SubLObject precision, SubLObject divisor) {
        if (divisor == UNPROVIDED) {
            divisor = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject udate_1 = extended_universal_date_for_date_initial_second(date_1);
        final SubLObject udate_2 = extended_universal_date_for_date_initial_second(date_2);
        SubLObject duration = NIL;
        thread.resetMultipleValues();
        final SubLObject sec_1 = numeric_date_utilities.decode_extended_universal_date(udate_1);
        final SubLObject min_1 = thread.secondMultipleValue();
        final SubLObject hour_1 = thread.thirdMultipleValue();
        final SubLObject day_1 = thread.fourthMultipleValue();
        final SubLObject month_1 = thread.fifthMultipleValue();
        final SubLObject year_1 = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject sec_2 = numeric_date_utilities.decode_extended_universal_date(udate_2);
        final SubLObject min_2 = thread.secondMultipleValue();
        final SubLObject hour_2 = thread.thirdMultipleValue();
        final SubLObject day_2 = thread.fourthMultipleValue();
        final SubLObject month_2 = thread.fifthMultipleValue();
        final SubLObject year_2 = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        if (udate_1.numL(udate_2)) {
            duration = integerDivide(add(multiply(TWELVE_INTEGER, subtract(year_2, year_1)), subtract(month_2, month_1)), divisor);
        } else {
            duration = integerDivide(add(multiply(TWELVE_INTEGER, subtract(year_1, year_2)), subtract(month_1, month_2)), divisor);
        }
        return list(precision, duration);
    }

    public static SubLObject days_between_universal_dates(final SubLObject universal_date_1, final SubLObject universal_date_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cycl_date_1 = universal_date_to_cycl_date(universal_date_1);
        final SubLObject cycl_date_2 = universal_date_to_cycl_date(universal_date_2);
        final SubLObject cycl_days_elapsed = time_elapsed(cycl_date_1, cycl_date_2, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == el_formula_with_operator_p(cycl_days_elapsed, $$DaysDuration))) {
            Errors.error($str160$Expected_a___DaysDuration_nat__go, cycl_days_elapsed);
        }
        final SubLObject days_elapsed = cycl_utilities.nat_arg1(cycl_days_elapsed, UNPROVIDED);
        return days_elapsed;
    }

    public static SubLObject temporal_indexical_p(final SubLObject obj) {
        return subl_promotions.memberP(obj, $temporal_indexicals$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject contains_indexicalP(final SubLObject obj) {
        if (NIL != nart_handles.nart_p(obj)) {
            return contains_indexicalP(narts_high.nart_el_formula(obj));
        }
        if (obj.isAtom()) {
            return temporal_indexical_p(obj);
        }
        if (obj.isList()) {
            return cycl_utilities.expression_find_if(TEMPORAL_INDEXICAL_P, obj, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject first_among_time_indexes(final SubLObject indices) {
        final SubLObject indexical_store = bind_and_store_indexicals(indices);
        SubLObject result = indices.first();
        SubLObject cdolist_list_var = indices.rest();
        SubLObject index = NIL;
        index = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject index_time = (NIL != contains_indexicalP(index)) ? gethash(index, indexical_store, UNPROVIDED) : index;
            final SubLObject result_time = (NIL != contains_indexicalP(result)) ? gethash(result, indexical_store, UNPROVIDED) : result;
            if (NIL != dateL(index_time, result_time)) {
                result = index;
            }
            cdolist_list_var = cdolist_list_var.rest();
            index = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject last_among_time_indexes(final SubLObject indices) {
        final SubLObject indexical_store = bind_and_store_indexicals(indices);
        SubLObject result = indices.first();
        SubLObject cdolist_list_var = indices.rest();
        SubLObject index = NIL;
        index = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject index_time = (NIL != contains_indexicalP(index)) ? gethash(index, indexical_store, UNPROVIDED) : index;
            final SubLObject result_time = (NIL != contains_indexicalP(result)) ? gethash(result, indexical_store, UNPROVIDED) : result;
            if (NIL != dateL(result_time, index_time)) {
                result = index;
            }
            cdolist_list_var = cdolist_list_var.rest();
            index = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject bind_and_store_indexicals(final SubLObject times) {
        final SubLObject indexicals = remove_duplicates(list_utilities.tree_gather(times, TEMPORAL_INDEXICAL_P, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject store = make_hash_table(ZERO_INTEGER, EQ, UNPROVIDED);
        SubLObject cdolist_list_var = indexicals;
        SubLObject indexical = NIL;
        indexical = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sethash(indexical, store, removal_modules_indexical_referent.temporal_indexical_expand(indexical));
            cdolist_list_var = cdolist_list_var.rest();
            indexical = cdolist_list_var.first();
        } 
        return store;
    }

    public static SubLObject possibly_bind_temporal_indexical_in_object(final SubLObject obj) {
        return NIL != contains_indexicalP(obj) ? bind_temporal_indexical_in_object(obj) : obj;
    }

    public static SubLObject bind_temporal_indexical_in_object(final SubLObject obj) {
        return cycl_utilities.expression_transform(obj, TEMPORAL_INDEXICAL_P, TEMPORAL_INDEXICAL_EXPAND, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject bind_temporal_indexicals_in_hlmt_list(final SubLObject hlmts) {
        return Mapping.mapcar(BIND_TEMPORAL_INDEXICAL_IN_OBJECT, hlmts);
    }

    public static SubLObject inference_now() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $inference_now$.getDynamicValue(thread);
    }

    public static SubLObject get_inference_now() {
        final SubLObject inference_now = inference_worker.currently_active_problem_store_creation_time();
        return NIL != inference_now ? inference_now : get_universal_time();
    }

    public static SubLObject with_cpu_now(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list166, append(body, NIL));
    }

    public static SubLObject with_inference_now(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list167, append(body, NIL));
    }

    public static SubLObject possibly_with_inference_now(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list168, append(body, NIL));
    }

    public static SubLObject indexical_now() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject now = NIL;
        final SubLObject _prev_bind_0 = $inference_now$.currentBinding(thread);
        try {
            $inference_now$.bind(NIL != $inference_now$.getDynamicValue(thread) ? $inference_now$.getDynamicValue(thread) : get_inference_now(), thread);
            now = universal_time_to_cycl_date(inference_now());
        } finally {
            $inference_now$.rebind(_prev_bind_0, thread);
        }
        return now;
    }

    public static SubLObject indexical_now_precise() {
        final SubLObject millis = numeric_date_utilities.get_universal_millisecond(UNPROVIDED);
        final SubLObject date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        final SubLObject milli = rem(millis, $int$1000);
        final SubLObject sec = rem(integerDivide(millis, $int$1000), $int$100);
        final SubLObject min = rem(integerDivide(millis, $int$100000), $int$100);
        final SubLObject hour = rem(integerDivide(millis, $int$10000000), $int$100);
        final SubLObject day = rem(date, $int$100);
        final SubLObject month = month_number(rem(integerDivide(date, $int$100), $int$100));
        final SubLObject year = rem(integerDivide(date, $int$10000), $int$10000);
        return construct_cycl_date_ms(milli, sec, min, hour, day, month, year);
    }

    public static SubLObject indexical_today() {
        return universal_date_to_cycl_date(numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject indexical_tomorrow() {
        return date_defns.cyc_date_after(indexical_today(), $list172);
    }

    public static SubLObject indexical_yesterday() {
        return date_defns.cyc_date_before(indexical_today(), $list172);
    }

    public static SubLObject indexical_seconds_since_1970() {
        return subtract(get_universal_time(), $start_of_1970$.getGlobalValue());
    }

    public static SubLObject current_time_interval_of_type(final SubLObject interval_type) {
        final SubLObject period = (NIL != time_parameter_utilities.covering_time_type_p(interval_type)) ? time_parameter_utilities.time_series_duration(interval_type) : time_parameter_utilities.gappy_type_period(interval_type);
        final SubLObject next_one = (NIL != period) ? next_iterated_cyclic_interval_inclusive(interval_type, UNPROVIDED) : NIL;
        final SubLObject most_recently_started_interval = (NIL != next_one) ? date_before(next_one, period) : NIL;
        return (NIL != most_recently_started_interval) && (NIL != date_subsumes(most_recently_started_interval, indexical_now())) ? most_recently_started_interval : NIL;
    }

    public static SubLObject next_iterated_cyclic_interval_inclusive(final SubLObject cyclic_interval_type_on_calendar_scale, SubLObject date_start) {
        if (date_start == UNPROVIDED) {
            date_start = indexical_now();
        }
        final SubLObject year_start = extract_date_year(date_start);
        final SubLObject month_start = extract_date_month(date_start);
        final SubLObject day_start = extract_date_day(date_start);
        final SubLObject hour_start = extract_date_hour(date_start);
        final SubLObject minute_start = extract_date_minute(date_start);
        final SubLObject second_start = extract_date_second(date_start);
        SubLObject temp_cyclic = cyclic_interval_type_on_calendar_scale;
        final SubLObject year_cyclic = NIL;
        SubLObject month_cyclic = NIL;
        SubLObject weekday_cyclic = NIL;
        SubLObject day_cyclic = NIL;
        SubLObject hour_cyclic = NIL;
        SubLObject minute_cyclic = NIL;
        SubLObject second_cyclic = NIL;
        SubLObject year_next = year_start;
        SubLObject month_next = NIL;
        SubLObject day_next = NIL;
        SubLObject hour_next = NIL;
        SubLObject minute_next = NIL;
        SubLObject second_next = NIL;
        SubLObject precision = NIL;
        final SubLObject pcase_var = temp_cyclic;
        if (pcase_var.eql($$CalendarSecond)) {
            return date_to_precision(calendar_date_sum($$SecondsDuration, ONE_INTEGER, year_start, number_of_month(month_start), day_start, hour_start, minute_start, second_start, NIL), temp_cyclic, UNPROVIDED);
        }
        if (pcase_var.eql($$CalendarMinute)) {
            return date_to_precision(calendar_date_sum($$MinutesDuration, ONE_INTEGER, year_start, number_of_month(month_start), day_start, hour_start, minute_start, ZERO_INTEGER, NIL), temp_cyclic, UNPROVIDED);
        }
        if (pcase_var.eql($$CalendarHour)) {
            return date_to_precision(calendar_date_sum($$HoursDuration, ONE_INTEGER, year_start, number_of_month(month_start), day_start, hour_start, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER), temp_cyclic, UNPROVIDED);
        }
        if (pcase_var.eql($$CalendarDay)) {
            return date_to_precision(calendar_date_sum($$DaysDuration, ONE_INTEGER, year_start, number_of_month(month_start), day_start, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, NIL), temp_cyclic, UNPROVIDED);
        }
        if (pcase_var.eql($$CalendarWeek)) {
            temp_cyclic = $$Sunday;
            precision = $$CalendarDay;
        } else {
            if (pcase_var.eql($$CalendarMonth)) {
                return date_to_precision(calendar_date_sum($$MonthsDuration, ONE_INTEGER, year_start, number_of_month(month_start), ONE_INTEGER, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, NIL), temp_cyclic, UNPROVIDED);
            }
            if (pcase_var.eql($$CalendarYear)) {
                return date_to_precision(calendar_date_sum($$YearsDuration, ONE_INTEGER, year_start, ONE_INTEGER, ONE_INTEGER, ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, NIL), temp_cyclic, UNPROVIDED);
            }
            if (pcase_var.eql($$TimeOfDay_AM)) {
                temp_cyclic = $$TimeOfDay_MidnightHour;
                precision = $$CalendarHour;
            } else
                if (pcase_var.eql($$TimeOfDay_PM)) {
                    temp_cyclic = $$TimeOfDay_NoonHour;
                    precision = $$CalendarHour;
                }

        }
        if ((NIL != cycl_grammar.cycl_nat_p(temp_cyclic)) && (NIL != kb_utilities.kbeq(cycl_utilities.nat_functor(temp_cyclic), $$TimeOfYearFn))) {
            month_cyclic = cycl_utilities.nat_arg1(temp_cyclic, UNPROVIDED);
            temp_cyclic = cycl_utilities.nat_arg2(temp_cyclic, UNPROVIDED);
        } else
            if (NIL != month_p(temp_cyclic)) {
                month_cyclic = temp_cyclic;
                temp_cyclic = NIL;
            } else
                if (NIL != month_term_p(temp_cyclic)) {
                    month_cyclic = month_number(number_of_month(temp_cyclic));
                    temp_cyclic = NIL;
                }


        if ((NIL != cycl_grammar.cycl_nat_p(temp_cyclic)) && (NIL != kb_utilities.kbeq(cycl_utilities.nat_functor(temp_cyclic), $$TimeOfMonthFn))) {
            day_cyclic = cycl_utilities.nat_arg1(temp_cyclic, UNPROVIDED);
            temp_cyclic = cycl_utilities.nat_arg2(temp_cyclic, UNPROVIDED);
        } else
            if (NIL != day_of_month_term_p(temp_cyclic)) {
                day_cyclic = temp_cyclic;
                temp_cyclic = NIL;
            } else
                if (NIL != cycl_utilities.cycl_nat_with_functor_p(temp_cyclic, $$DayOfYearFn)) {
                    month_cyclic = cycl_utilities.nat_arg1(temp_cyclic, UNPROVIDED);
                    day_cyclic = cycl_utilities.nat_arg2(temp_cyclic, UNPROVIDED);
                    temp_cyclic = NIL;
                } else
                    if (NIL != cycl_utilities.cycl_nat_with_functor_p(temp_cyclic, $$DayOfMonthFn)) {
                        day_cyclic = cycl_utilities.nat_arg1(temp_cyclic, UNPROVIDED);
                        temp_cyclic = NIL;
                    }



        if ((NIL != day_cyclic) && (NIL != cycl_grammar.cycl_nat_p(day_cyclic))) {
            day_cyclic = cycl_utilities.nat_arg1(day_cyclic, UNPROVIDED);
        }
        if (NIL != day_of_week_p(temp_cyclic)) {
            weekday_cyclic = temp_cyclic;
            temp_cyclic = NIL;
        } else
            if ((NIL != cycl_grammar.cycl_nat_p(temp_cyclic)) && (NIL != kb_utilities.kbeq(cycl_utilities.nat_functor(temp_cyclic), $$TimeOfWeekFn))) {
                weekday_cyclic = cycl_utilities.nat_arg1(temp_cyclic, UNPROVIDED);
                temp_cyclic = cycl_utilities.nat_arg2(temp_cyclic, UNPROVIDED);
            }

        if ((NIL != cycl_grammar.cycl_nat_p(temp_cyclic)) && (NIL != kb_utilities.kbeq(cycl_utilities.nat_functor(temp_cyclic), $$TimeOfDayFn))) {
            hour_cyclic = cycl_utilities.nat_arg1(temp_cyclic, UNPROVIDED);
            temp_cyclic = cycl_utilities.nat_arg2(temp_cyclic, UNPROVIDED);
        } else
            if (NIL != hour_of_day_term_p(temp_cyclic)) {
                hour_cyclic = cycl_utilities.nat_arg1(temp_cyclic, UNPROVIDED);
                temp_cyclic = NIL;
            } else
                if (NIL != hour_of_day_p(temp_cyclic)) {
                    hour_cyclic = number_of_hour_of_day(temp_cyclic);
                    temp_cyclic = NIL;
                }


        if ((NIL != hour_cyclic) && (NIL != cycl_grammar.cycl_nat_p(hour_cyclic))) {
            hour_cyclic = cycl_utilities.nat_arg1(hour_cyclic, UNPROVIDED);
        } else
            if (NIL != hour_of_day_p(hour_cyclic)) {
                hour_cyclic = number_of_hour_of_day(hour_cyclic);
            }

        if ((NIL != cycl_grammar.cycl_nat_p(temp_cyclic)) && (NIL != kb_utilities.kbeq(cycl_utilities.nat_functor(temp_cyclic), $$TimeOfHourFn))) {
            minute_cyclic = cycl_utilities.nat_arg1(temp_cyclic, UNPROVIDED);
            temp_cyclic = cycl_utilities.nat_arg2(temp_cyclic, UNPROVIDED);
        } else
            if (NIL != minute_of_hour_term_p(temp_cyclic)) {
                minute_cyclic = cycl_utilities.nat_arg1(temp_cyclic, UNPROVIDED);
                temp_cyclic = NIL;
            }

        if ((NIL != minute_cyclic) && (NIL != cycl_grammar.cycl_nat_p(minute_cyclic))) {
            minute_cyclic = cycl_utilities.nat_arg1(minute_cyclic, UNPROVIDED);
        }
        if (NIL != second_of_minute_term_p(temp_cyclic)) {
            second_cyclic = cycl_utilities.nat_arg1(temp_cyclic, UNPROVIDED);
            temp_cyclic = NIL;
        }
        if (NIL != temp_cyclic) {
            return NIL;
        }
        if (NIL == precision) {
            precision = (NIL != second_cyclic) ? $$CalendarSecond : NIL != minute_cyclic ? $$CalendarMinute : NIL != hour_cyclic ? $$CalendarHour : (NIL != day_cyclic) || (NIL != weekday_cyclic) ? $$CalendarDay : NIL != month_cyclic ? $$CalendarMonth : $$CalendarYear;
        }
        if (NIL == second_cyclic) {
            second_cyclic = ZERO_INTEGER;
            if (NIL == minute_cyclic) {
                minute_cyclic = ZERO_INTEGER;
                if (NIL == hour_cyclic) {
                    hour_cyclic = ZERO_INTEGER;
                    if ((NIL == day_cyclic) && (NIL == weekday_cyclic)) {
                        day_cyclic = ONE_INTEGER;
                        if ((NIL == month_cyclic) && (NIL == weekday_cyclic)) {
                            month_cyclic = $$January;
                        }
                    }
                }
            }
        }
        year_next = (NIL != year_cyclic) ? year_cyclic : year_start;
        month_next = (NIL != month_cyclic) ? month_cyclic : month_start;
        day_next = (NIL != day_cyclic) ? day_cyclic : day_start;
        hour_next = (NIL != hour_cyclic) ? hour_cyclic : hour_start;
        minute_next = (NIL != minute_cyclic) ? minute_cyclic : minute_start;
        second_next = (NIL != second_cyclic) ? second_cyclic : second_start;
        SubLObject date_trial = NIL;
        SubLObject date = NIL;
        date_trial = next_iterated_cyclic_interval_inclusive_helper(NIL, year_next, month_next, day_next, hour_next, minute_next, second_next, weekday_cyclic);
        if (NIL != dateL(date_start, date_trial)) {
            date = date_trial;
        }
        if ((NIL == date) && (NIL != month_cyclic)) {
            date_trial = next_iterated_cyclic_interval_inclusive_helper($$YearsDuration, year_next, month_next, day_next, hour_next, minute_next, second_next, weekday_cyclic);
            if (NIL != dateL(date_start, date_trial)) {
                date = date_trial;
            }
        }
        if ((NIL == date) && (NIL != day_cyclic)) {
            date_trial = next_iterated_cyclic_interval_inclusive_helper($$MonthsDuration, year_next, month_next, day_next, hour_next, minute_next, second_next, weekday_cyclic);
            if (NIL != dateL(date_start, date_trial)) {
                date = date_trial;
            }
        }
        if ((NIL == date) && (NIL != hour_cyclic)) {
            date_trial = next_iterated_cyclic_interval_inclusive_helper($$DaysDuration, year_next, month_next, day_next, hour_next, minute_next, second_next, weekday_cyclic);
            if (NIL != dateL(date_start, date_trial)) {
                date = date_trial;
            }
        }
        if ((NIL == date) && (NIL != minute_cyclic)) {
            date_trial = next_iterated_cyclic_interval_inclusive_helper($$HoursDuration, year_next, month_next, day_next, hour_next, minute_next, second_next, weekday_cyclic);
            if (NIL != dateL(date_start, date_trial)) {
                date = date_trial;
            }
        }
        if ((NIL == date) && (NIL != second_cyclic)) {
            date_trial = next_iterated_cyclic_interval_inclusive_helper($$MinutesDuration, year_next, month_next, day_next, hour_next, minute_next, second_next, weekday_cyclic);
            if (NIL != dateL(date_start, date_trial)) {
                date = date_trial;
            }
        }
        if (NIL != date) {
            return date_to_precision(date, precision, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject next_iterated_cyclic_interval_inclusive_helper(final SubLObject duration_type, final SubLObject year_next, final SubLObject month_next, final SubLObject day_next, final SubLObject hour_next, final SubLObject minute_next, final SubLObject second_next, final SubLObject weekday_cyclic) {
        if (NIL == duration_type) {
            final SubLObject date_next = construct_cycl_date(second_next, minute_next, hour_next, day_next, month_next, year_next);
            if (NIL == weekday_cyclic) {
                return date_next;
            }
            final SubLObject weekday_next = day_of_week_after_date_inclusive(weekday_cyclic, date_next);
            return construct_cycl_date(extract_date_second(date_next), extract_date_minute(date_next), extract_date_hour(date_next), extract_date_day(weekday_next), extract_date_month(weekday_next), extract_date_year(weekday_next));
        } else {
            final SubLObject date_next = calendar_date_sum(duration_type, ONE_INTEGER, year_next, number_of_month(month_next), day_next, hour_next, minute_next, second_next, NIL);
            if (NIL == weekday_cyclic) {
                return date_next;
            }
            final SubLObject weekday_next = day_of_week_after_date_inclusive(weekday_cyclic, date_next);
            return construct_cycl_date(extract_date_second(date_next), extract_date_minute(date_next), extract_date_hour(date_next), extract_date_day(weekday_next), extract_date_month(weekday_next), extract_date_year(weekday_next));
        }
    }

    public static SubLObject universal_time_to_cycl_date(final SubLObject universal_time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != numeric_date_utilities.universal_time_p(universal_time) : "numeric_date_utilities.universal_time_p(universal_time) " + "CommonSymbols.NIL != numeric_date_utilities.universal_time_p(universal_time) " + universal_time;
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str108$A_KB_dependent_date_specific_func);
        }
        thread.resetMultipleValues();
        final SubLObject second = decode_universal_time(universal_time, UNPROVIDED);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject date = list($$SecondFn, second, list($$MinuteFn, minute, list($$HourFn, hour, list($$DayFn, day, list($$MonthFn, month_number(month), list($$YearFn, year))))));
        return copy_tree(date);
    }

    public static SubLObject universal_date_to_cycl_date(final SubLObject universal_date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != numeric_date_utilities.universal_date_p(universal_date) : "numeric_date_utilities.universal_date_p(universal_date) " + "CommonSymbols.NIL != numeric_date_utilities.universal_date_p(universal_date) " + universal_date;
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str108$A_KB_dependent_date_specific_func);
        }
        thread.resetMultipleValues();
        final SubLObject day = numeric_date_utilities.decode_universal_date(universal_date);
        final SubLObject month = thread.secondMultipleValue();
        final SubLObject year = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject date = list($$DayFn, day, list($$MonthFn, month_number(month), list($$YearFn, year)));
        return copy_tree(date);
    }

    public static SubLObject extended_universal_date_to_cycl_date(final SubLObject extended_universal_date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str108$A_KB_dependent_date_specific_func);
        }
        thread.resetMultipleValues();
        final SubLObject second = numeric_date_utilities.decode_extended_universal_date(extended_universal_date);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject date = list($$SecondFn, second, list($$MinuteFn, minute, list($$HourFn, hour, list($$DayFn, day, list($$MonthFn, month_number(month), list($$YearFn, year))))));
        return copy_tree(date);
    }

    public static SubLObject cycl_date_to_universal_date(SubLObject date) {
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str108$A_KB_dependent_date_specific_func);
        }
        assert NIL != date_p(date) : "date_utilities.date_p(date) " + "CommonSymbols.NIL != date_utilities.date_p(date) " + date;
        SubLObject day = ONE_INTEGER;
        SubLObject month = ONE_INTEGER;
        SubLObject year = NIL;
        while (date.isCons()) {
            final SubLObject pcase_var;
            final SubLObject function = pcase_var = date.first();
            if ((pcase_var.eql($$SecondFn) || pcase_var.eql($$MinuteFn)) || pcase_var.eql($$HourFn)) {
                date = third(date);
            } else
                if (pcase_var.eql($$DayFn)) {
                    day = second(date);
                    date = third(date);
                } else
                    if (pcase_var.eql($$MonthFn)) {
                        month = number_of_month(second(date));
                        date = third(date);
                    } else {
                        if (!pcase_var.eql($$YearFn)) {
                            return NIL;
                        }
                        year = second(date);
                        date = NIL;
                    }


        } 
        return numeric_date_utilities.encode_universal_date(day, month, year);
    }

    public static SubLObject cycl_date_to_universal_time(SubLObject date) {
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str108$A_KB_dependent_date_specific_func);
        }
        assert NIL != date_p(date) : "date_utilities.date_p(date) " + "CommonSymbols.NIL != date_utilities.date_p(date) " + date;
        SubLObject second = ZERO_INTEGER;
        SubLObject minute = ZERO_INTEGER;
        SubLObject hour = ZERO_INTEGER;
        SubLObject day = ONE_INTEGER;
        SubLObject month = ONE_INTEGER;
        SubLObject millisecond = NIL;
        SubLObject year = NIL;
        while (date.isCons()) {
            final SubLObject pcase_var;
            final SubLObject function = pcase_var = date.first();
            if (pcase_var.eql($$MilliSecondFn)) {
                millisecond = second(date);
                date = third(date);
            } else
                if (pcase_var.eql($$SecondFn)) {
                    second = second(date);
                    date = third(date);
                } else
                    if (pcase_var.eql($$MinuteFn)) {
                        minute = second(date);
                        date = third(date);
                    } else
                        if (pcase_var.eql($$HourFn)) {
                            hour = second(date);
                            date = third(date);
                        } else
                            if (pcase_var.eql($$DayFn)) {
                                day = second(date);
                                date = third(date);
                            } else
                                if (pcase_var.eql($$MonthFn)) {
                                    month = number_of_month(second(date));
                                    date = third(date);
                                } else {
                                    if (!pcase_var.eql($$YearFn)) {
                                        return NIL;
                                    }
                                    year = second(date);
                                    date = NIL;
                                }





        } 
        return values(encode_universal_time(second, minute, hour, day, month, year, UNPROVIDED), millisecond);
    }

    public static SubLObject cycl_date_to_universal_second(final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject universal_time = cycl_date_to_universal_time(date);
        thread.resetMultipleValues();
        final SubLObject universal_date = numeric_date_utilities.universal_date_and_second_from_time(universal_time);
        final SubLObject universal_second = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return universal_second;
    }

    public static SubLObject extended_universal_date_for_date_initial_second(SubLObject date) {
        assert NIL != date_p(date) : "date_utilities.date_p(date) " + "CommonSymbols.NIL != date_utilities.date_p(date) " + date;
        SubLObject second = ZERO_INTEGER;
        SubLObject minute = ZERO_INTEGER;
        SubLObject hour = ZERO_INTEGER;
        SubLObject day = ONE_INTEGER;
        SubLObject month = ONE_INTEGER;
        SubLObject year = NIL;
        while (date.isCons()) {
            final SubLObject pcase_var;
            final SubLObject function = pcase_var = date.first();
            if (pcase_var.eql($$MilliSecondFn)) {
                date = third(date);
            } else
                if (pcase_var.eql($$SecondFn)) {
                    second = second(date);
                    date = third(date);
                } else
                    if (pcase_var.eql($$MinuteFn)) {
                        minute = second(date);
                        date = third(date);
                    } else
                        if (pcase_var.eql($$HourFn)) {
                            hour = second(date);
                            date = third(date);
                        } else
                            if (pcase_var.eql($$DayFn)) {
                                day = second(date);
                                date = third(date);
                            } else
                                if (pcase_var.eql($$MonthFn)) {
                                    month = number_of_month(second(date));
                                    date = third(date);
                                } else
                                    if (pcase_var.eql($$QuarterFn)) {
                                        month = subtract(multiply(second(date), THREE_INTEGER), TWO_INTEGER);
                                        date = third(date);
                                    } else
                                        if (pcase_var.eql($$YearFn)) {
                                            year = second(date);
                                            date = NIL;
                                        } else
                                            if (pcase_var.eql($$DecadeFn)) {
                                                year = multiply(second(date), TEN_INTEGER);
                                                date = NIL;
                                            } else {
                                                if (!pcase_var.eql($$CenturyFn)) {
                                                    return NIL;
                                                }
                                                year = number_utilities.f_1X(multiply(number_utilities.f_1_(second(date)), $int$100));
                                                date = NIL;
                                            }








        } 
        return numeric_date_utilities.encode_extended_universal_date(second, minute, hour, day, month, year);
    }

    public static SubLObject extended_universal_date_for_date_final_second(SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != date_p(date) : "date_utilities.date_p(date) " + "CommonSymbols.NIL != date_utilities.date_p(date) " + date;
        SubLObject second = NIL;
        SubLObject hour = NIL;
        SubLObject minute = NIL;
        SubLObject day = NIL;
        SubLObject month = NIL;
        SubLObject year = NIL;
        while (date.isCons()) {
            final SubLObject pcase_var;
            final SubLObject function = pcase_var = date.first();
            if (pcase_var.eql($$MilliSecondFn)) {
                date = third(date);
            } else
                if (pcase_var.eql($$SecondFn)) {
                    second = second(date);
                    date = third(date);
                } else
                    if (pcase_var.eql($$MinuteFn)) {
                        minute = second(date);
                        date = third(date);
                    } else
                        if (pcase_var.eql($$HourFn)) {
                            hour = second(date);
                            date = third(date);
                        } else
                            if (pcase_var.eql($$DayFn)) {
                                day = second(date);
                                date = third(date);
                            } else
                                if (pcase_var.eql($$MonthFn)) {
                                    month = number_of_month(second(date));
                                    date = third(date);
                                } else
                                    if (pcase_var.eql($$QuarterFn)) {
                                        month = multiply(second(date), THREE_INTEGER);
                                        date = third(date);
                                    } else
                                        if (pcase_var.eql($$YearFn)) {
                                            year = second(date);
                                            date = NIL;
                                        } else
                                            if (pcase_var.eql($$DecadeFn)) {
                                                year = add(multiply(second(date), TEN_INTEGER), NINE_INTEGER);
                                                date = NIL;
                                            } else {
                                                if (!pcase_var.eql($$CenturyFn)) {
                                                    return NIL;
                                                }
                                                year = multiply(second(date), $int$100);
                                                date = NIL;
                                            }








        } 
        if (NIL != second) {
            second = add(second, ONE_INTEGER);
        } else
            if (NIL != minute) {
                minute = add(minute, ONE_INTEGER);
            } else
                if (NIL != hour) {
                    hour = add(hour, ONE_INTEGER);
                } else
                    if (NIL != day) {
                        day = add(day, ONE_INTEGER);
                    } else
                        if (NIL != month) {
                            month = add(month, ONE_INTEGER);
                        } else
                            if (NIL != year) {
                                year = add(year, ONE_INTEGER);
                            }





        thread.resetMultipleValues();
        final SubLObject new_year = numeric_date_utilities.adjust_year_month_day_hour_min_sec(year, month, day, hour, minute, second);
        SubLObject new_month = thread.secondMultipleValue();
        SubLObject new_day = thread.thirdMultipleValue();
        SubLObject new_hour = thread.fourthMultipleValue();
        SubLObject new_minute = thread.fifthMultipleValue();
        SubLObject new_second = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        if (NIL == new_month) {
            new_month = ONE_INTEGER;
        }
        if (NIL == new_day) {
            new_day = ONE_INTEGER;
        }
        if (NIL == new_hour) {
            new_hour = ZERO_INTEGER;
        }
        if (NIL == new_minute) {
            new_minute = ZERO_INTEGER;
        }
        if (NIL == new_second) {
            new_second = ZERO_INTEGER;
        }
        new_second = subtract(new_second, ONE_INTEGER);
        thread.resetMultipleValues();
        final SubLObject final_year = numeric_date_utilities.adjust_year_month_day_hour_min_sec(new_year, new_month, new_day, new_hour, new_minute, new_second);
        final SubLObject final_month = thread.secondMultipleValue();
        final SubLObject final_day = thread.thirdMultipleValue();
        final SubLObject final_hour = thread.fourthMultipleValue();
        final SubLObject final_minute = thread.fifthMultipleValue();
        final SubLObject final_second = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return numeric_date_utilities.encode_extended_universal_date(final_second, final_minute, final_hour, final_day, final_month, final_year);
    }

    public static SubLObject temporal_object_from_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        result = cb_guess_term(string, NIL);
        if (NIL != meets_time_object_constraintP(result, UNPROVIDED)) {
            return result;
        }
        result = construct_cycl_date_from_date_range_string(string);
        if (NIL != meets_time_object_constraintP(result, UNPROVIDED)) {
            return result;
        }
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    result = guess_datetime_string(string);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != meets_time_object_constraintP(result, UNPROVIDED)) {
            return result;
        }
        result = parse_unambiguous_date_from_string(string);
        if (NIL != meets_time_object_constraintP(result, UNPROVIDED)) {
            return result;
        }
        return NIL;
    }

    public static SubLObject meets_time_object_constraintP(final SubLObject v_object, SubLObject strict_interval_definitionP) {
        if (strict_interval_definitionP == UNPROVIDED) {
            strict_interval_definitionP = T;
        }
        if (NIL != strict_interval_definitionP) {
            return hlmt.time_intervalP(v_object);
        }
        return hlmt.temporal_objectP(v_object);
    }

    public static SubLObject construct_cycl_date_from_date_range_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != string_specifies_date_range_p(string)) {
            thread.resetMultipleValues();
            final SubLObject begin_str = unpack_date_range_string(string);
            final SubLObject end_str = thread.secondMultipleValue();
            final SubLObject begin_inclusiveP = thread.thirdMultipleValue();
            final SubLObject end_inclusiveP = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            final SubLObject begin = cb_guess_date(begin_str);
            final SubLObject end = cb_guess_date(end_str);
            if ((NIL != hlmt.time_intervalP(begin)) && (NIL != hlmt.time_intervalP(end))) {
                result = construct_date_from_to(begin, end, begin_inclusiveP, end_inclusiveP);
            }
        }
        return result;
    }

    public static SubLObject string_specifies_date_range_p(final SubLObject string) {
        return makeBoolean((NIL != string_utilities.starts_with(string, $$$from_)) && (NIL != string_utilities.substringP($$$_to_, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject unpack_date_range_string(final SubLObject string) {
        final SubLObject from_pos = FIVE_INTEGER;
        final SubLObject to_pos = search($$$_to_, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject to_str_length = FOUR_INTEGER;
        final SubLObject begin_str = string_utilities.substring(string, from_pos, to_pos);
        final SubLObject end_str = string_utilities.substring(string, add(to_pos, to_str_length), UNPROVIDED);
        final SubLObject begin_inclusiveP = T;
        final SubLObject end_inclusiveP = T;
        return values(begin_str, end_str, begin_inclusiveP, end_inclusiveP);
    }

    public static SubLObject construct_date_from_to(final SubLObject begin, final SubLObject end, final SubLObject begin_inclusiveP, final SubLObject end_inclusiveP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!begin_inclusiveP.eql(end_inclusiveP))) {
            Errors.error($str188$Can_t_support____or____time_inter);
        }
        if ((NIL != begin_inclusiveP) && (NIL != end_inclusiveP)) {
            return hlmt_relevance.date_from_to(begin, end);
        }
        Errors.error($str189$Can_t_support____or____time_inter);
        return NIL;
    }

    public static SubLObject parse_date_from_string(final SubLObject string) {
        final SubLObject result = parse_date_from_string_fast(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != result) {
            return result;
        }
        if (NIL == find_if(DIGIT_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject tokens = string_utilities.string_tokenize(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject pass = list_utilities.singletonP(tokens);
            if (NIL == pass) {
                SubLObject csome_list_var;
                SubLObject token;
                for (csome_list_var = tokens, token = NIL, token = csome_list_var.first(); (NIL == pass) && (NIL != csome_list_var); pass = integerp(numeral_parser.string_to_interval(token)) , csome_list_var = csome_list_var.rest() , token = csome_list_var.first()) {
                }
            }
            if (NIL == pass) {
                return NIL;
            }
        }
        if (NIL != kb_control_vars.rkf_kb_loaded_p()) {
            final SubLObject rkf_parse = possibly_filter_two_digit_years(rkf_text_processors.rkf_parse_date_unambiguously_from_string(string));
            if (NIL != rkf_parse) {
                return list(rkf_parse);
            }
        }
        return NIL;
    }

    public static SubLObject possibly_filter_two_digit_years(final SubLObject date_cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $parse_to_two_digit_years_in_datesP$.getDynamicValue(thread)) {
            return date_cycl;
        }
        SubLObject cdolist_list_var;
        final SubLObject year_exprs = cdolist_list_var = cycl_utilities.containing_subexpressions($$YearFn, date_cycl);
        SubLObject year_expr = NIL;
        year_expr = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (cycl_utilities.formula_arg1(year_expr, UNPROVIDED).numL($int$100)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            year_expr = cdolist_list_var.first();
        } 
        return date_cycl;
    }

    public static SubLObject parse_date_wXout_two_digit_years(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $parse_to_two_digit_years_in_datesP$.currentBinding(thread);
        try {
            $parse_to_two_digit_years_in_datesP$.bind(NIL, thread);
            result = parse_date_from_string(string);
        } finally {
            $parse_to_two_digit_years_in_datesP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject parse_unambiguous_date_from_string(final SubLObject string) {
        final SubLObject parses = parse_date_from_string(string);
        if (NIL != list_utilities.singletonP(parses)) {
            return parses.first();
        }
        return NIL;
    }

    public static SubLObject guess_datetime_string(final SubLObject string) {
        if (((NIL != string_utilities.substringP($str191$_, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != string_utilities.substringP($str192$_, string, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != string_utilities.substringP($str193$_, string, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            final SubLObject tokens = string_utilities.string_tokenize(string, $list194, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != date_time_tokensP(tokens)) {
                final SubLObject time_string = last(tokens, UNPROVIDED).first();
                final SubLObject time_tokens = string_utilities.string_tokenize(time_string, $list195, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject date_tokens = list_utilities.remove_last(tokens);
                return construct_date_and_time_from_tokens(date_tokens, time_tokens);
            }
            if (NIL != time_date_tokensP(tokens)) {
                final SubLObject time_string = tokens.first();
                final SubLObject time_tokens = string_utilities.string_tokenize(time_string, $list195, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject date_tokens = tokens.rest();
                return construct_date_and_time_from_tokens(date_tokens, time_tokens);
            }
            SubLObject current;
            final SubLObject datum = current = explode_date_from_tokens(tokens, T, UNPROVIDED).first();
            SubLObject day = NIL;
            SubLObject month = NIL;
            SubLObject year = NIL;
            destructuring_bind_must_consp(current, datum, $list196);
            day = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list196);
            month = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list196);
            year = current.first();
            current = current.rest();
            if (NIL == current) {
                return construct_reduced_cycl_date(NIL, NIL, NIL, day, month, year);
            }
            cdestructuring_bind_error(datum, $list196);
        }
        return NIL;
    }

    public static SubLObject construct_date_and_time_from_tokens(final SubLObject date_tokens, final SubLObject time_tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = explode_date_from_tokens(date_tokens, T, UNPROVIDED).first();
        SubLObject day = NIL;
        SubLObject month = NIL;
        SubLObject year = NIL;
        destructuring_bind_must_consp(current, datum, $list196);
        day = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list196);
        month = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list196);
        year = current.first();
        current = current.rest();
        if (NIL == current) {
            thread.resetMultipleValues();
            final SubLObject second = explode_time_from_tokens(time_tokens);
            final SubLObject minute = thread.secondMultipleValue();
            final SubLObject hour = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return construct_reduced_cycl_date(second, minute, hour, day, month, year);
        }
        cdestructuring_bind_error(datum, $list196);
        return NIL;
    }

    public static SubLObject date_time_tokensP(final SubLObject tokens) {
        if (NIL != list_utilities.lengthGE(tokens, TWO_INTEGER, UNPROVIDED)) {
            final SubLObject last_token = last(tokens, UNPROVIDED).first();
            return string_utilities.substringP($str197$_, last_token, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject time_date_tokensP(final SubLObject tokens) {
        if (NIL != list_utilities.lengthGE(tokens, TWO_INTEGER, UNPROVIDED)) {
            final SubLObject first_token = tokens.first();
            return string_utilities.substringP($str197$_, first_token, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject parse_date_from_string_fast(final SubLObject string, SubLObject one_answerP, SubLObject dont_guess_from_two_digit_yearsP, SubLObject for_queryP) {
        if (one_answerP == UNPROVIDED) {
            one_answerP = NIL;
        }
        if (dont_guess_from_two_digit_yearsP == UNPROVIDED) {
            dont_guess_from_two_digit_yearsP = NIL;
        }
        if (for_queryP == UNPROVIDED) {
            for_queryP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tokens = string_utilities.string_tokenize(string, $list198, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject millisecond = NIL;
        SubLObject second = NIL;
        SubLObject minute = NIL;
        SubLObject hour = NIL;
        SubLObject result = NIL;
        thread.resetMultipleValues();
        final SubLObject date_numbers = explode_date_from_tokens(tokens, one_answerP, for_queryP);
        final SubLObject other_tokens_lists = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject time_token = find_if($sym199$TIME_TOKEN_, tokens, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject hour_token = NIL;
        SubLObject millisecond_token = NIL;
        SubLObject one_answer = NIL;
        SubLObject one_answer_$2 = NIL;
        SubLObject other_tokens = NIL;
        SubLObject other_tokens_$3 = NIL;
        one_answer = date_numbers;
        one_answer_$2 = one_answer.first();
        other_tokens = other_tokens_lists;
        other_tokens_$3 = other_tokens.first();
        while ((NIL != other_tokens) || (NIL != one_answer)) {
            SubLObject cdolist_list_var = other_tokens_$3;
            SubLObject other_token = NIL;
            other_token = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = other_token;
                SubLObject token_key = NIL;
                SubLObject token_value = NIL;
                destructuring_bind_must_consp(current, datum, $list200);
                token_key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list200);
                token_value = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (token_key == $TIME) {
                        time_token = token_value;
                    } else
                        if (token_key == $HOUR) {
                            hour_token = token_value;
                        } else
                            if (token_key == $MILLISECONDS) {
                                millisecond_token = token_value;
                            }


                } else {
                    cdestructuring_bind_error(datum, $list200);
                }
                cdolist_list_var = cdolist_list_var.rest();
                other_token = cdolist_list_var.first();
            } 
            if (NIL != time_token) {
                thread.resetMultipleValues();
                final SubLObject second_$4 = explode_time_from_tokens(string_utilities.string_tokenize(time_token, $list204, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                final SubLObject minute_$5 = thread.secondMultipleValue();
                final SubLObject hour_$6 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                second = second_$4;
                minute = minute_$5;
                hour = hour_$6;
            }
            if (NIL != hour_token) {
                hour = read_from_string_ignoring_errors(hour_token, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (millisecond_token.isString()) {
                while (length(millisecond_token).numL(THREE_INTEGER)) {
                    millisecond_token = cconcatenate(millisecond_token, $$$0);
                } 
                millisecond = read_from_string_ignoring_errors(millisecond_token, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            SubLObject current2;
            final SubLObject datum2 = current2 = one_answer_$2;
            SubLObject day = NIL;
            SubLObject month = NIL;
            SubLObject year = NIL;
            destructuring_bind_must_consp(current2, datum2, $list196);
            day = current2.first();
            current2 = current2.rest();
            destructuring_bind_must_consp(current2, datum2, $list196);
            month = current2.first();
            current2 = current2.rest();
            destructuring_bind_must_consp(current2, datum2, $list196);
            year = current2.first();
            current2 = current2.rest();
            if (NIL == current2) {
                final SubLObject date_cycl = construct_reduced_cycl_date_ms(millisecond, second, minute, hour, day, month, year);
                if (NIL != number_should_be_interpreted_as_a_dateP(day, month, year, string)) {
                    result = cons(date_cycl, result);
                    if (NIL == dont_guess_from_two_digit_yearsP) {
                        SubLObject cdolist_list_var2 = construct_possible_more_likely_dates(date_cycl, for_queryP);
                        SubLObject date = NIL;
                        date = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            result = cons(date, result);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            date = cdolist_list_var2.first();
                        } 
                    }
                }
            } else {
                cdestructuring_bind_error(datum2, $list196);
            }
            one_answer = one_answer.rest();
            one_answer_$2 = one_answer.first();
            other_tokens = other_tokens.rest();
            other_tokens_$3 = other_tokens.first();
        } 
        return delete_duplicates(result, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject number_should_be_interpreted_as_a_dateP(final SubLObject day, final SubLObject month, final SubLObject year, final SubLObject string) {
        if (NIL != day) {
            return T;
        }
        if ((year.isInteger() && year.numGE($int$1800)) && year.numLE($int$2200)) {
            return T;
        }
        if (NIL != list_utilities.find_if_not(VALID_NUMBER_STRING_CHAR, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject two_digit_yearP(final SubLObject date, SubLObject query_okP) {
        if (query_okP == UNPROVIDED) {
            query_okP = NIL;
        }
        if ((NIL == query_okP) || (NIL == date_query_p(date, UNPROVIDED))) {
            final SubLObject date_year = extract_date_year(date);
            return makeBoolean(date_year.isInteger() && $int$100.numG(date_year));
        }
        return NIL;
    }

    public static SubLObject construct_possible_more_likely_dates(final SubLObject date_cycl, SubLObject query_okP) {
        if (query_okP == UNPROVIDED) {
            query_okP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != two_digit_yearP(date_cycl, query_okP)) {
            thread.resetMultipleValues();
            final SubLObject format = explode_date(date_cycl);
            final SubLObject year = thread.secondMultipleValue();
            final SubLObject month = thread.thirdMultipleValue();
            final SubLObject day = thread.fourthMultipleValue();
            final SubLObject hour = thread.fifthMultipleValue();
            final SubLObject minute = thread.sixthMultipleValue();
            final SubLObject second = thread.seventhMultipleValue();
            final SubLObject millisec = thread.eighthMultipleValue();
            thread.resetMultipleValues();
            final SubLObject v_2000_date = calendar_date_sum($$YearsDuration, $int$2000, year, month, day, hour, minute, second, millisec);
            final SubLObject today = universal_date_to_cycl_date(numeric_date_utilities.today());
            SubLObject result = NIL;
            result = cons(v_2000_date, result);
            if (NIL != dateL(today, v_2000_date)) {
                result = cons(calendar_date_sum($$YearsDuration, $int$1900, year, month, day, hour, minute, second, millisec), result);
            }
            return result;
        }
        return NIL;
    }

    public static SubLObject explode_date_from_tokens(final SubLObject tokens, SubLObject one_answerP, SubLObject probable_queryP) {
        if (one_answerP == UNPROVIDED) {
            one_answerP = T;
        }
        if (probable_queryP == UNPROVIDED) {
            probable_queryP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject trimmed = delete($$$of, delete($str214$, tokens, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject doneP = NIL;
        SubLObject result = NIL;
        SubLObject final_answer = NIL;
        SubLObject other_tokens = NIL;
        SubLObject other_tokens_lists = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = list(NIL != probable_queryP ? $date_query_patterns$.getDynamicValue(thread) : NIL, $date_patterns$.getDynamicValue(thread));
            SubLObject pattern_cluster = NIL;
            pattern_cluster = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                if (NIL == doneP) {
                    SubLObject csome_list_var_$7 = pattern_cluster;
                    SubLObject pattern = NIL;
                    pattern = csome_list_var_$7.first();
                    while ((NIL == doneP) && (NIL != csome_list_var_$7)) {
                        thread.resetMultipleValues();
                        final SubLObject result_$8 = tokens_match_date_pattern(trimmed, pattern);
                        final SubLObject other_tokens_$9 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        result = result_$8;
                        other_tokens = other_tokens_$9;
                        if (result.isList() && (NIL != third(result))) {
                            final_answer = cons(result, final_answer);
                            other_tokens_lists = cons(other_tokens, other_tokens_lists);
                            if (NIL != one_answerP) {
                                doneP = T;
                            }
                        }
                        csome_list_var_$7 = csome_list_var_$7.rest();
                        pattern = csome_list_var_$7.first();
                    } 
                }
                csome_list_var = csome_list_var.rest();
                pattern_cluster = csome_list_var.first();
            } 
        }
        return values(final_answer, other_tokens_lists);
    }

    public static SubLObject tokens_match_date_pattern(final SubLObject tokens, final SubLObject pattern) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject day = NIL;
        SubLObject month = NIL;
        SubLObject year = NIL;
        SubLObject other_tokens = NIL;
        SubLObject failP = NIL;
        if (((length(tokens).numGE(length(pattern)) || (NIL != member($UNKNOWN_YEAR, pattern, UNPROVIDED, UNPROVIDED))) || (NIL != member($INDEXICAL_YEAR, pattern, UNPROVIDED, UNPROVIDED))) || (NIL != member($UNKNOWN_DAY, pattern, UNPROVIDED, UNPROVIDED))) {
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    if (NIL == failP) {
                        SubLObject token = NIL;
                        SubLObject token_$10 = NIL;
                        SubLObject pattern_item = NIL;
                        SubLObject pattern_item_$11 = NIL;
                        token = tokens;
                        token_$10 = token.first();
                        pattern_item = pattern;
                        pattern_item_$11 = pattern_item.first();
                        while ((NIL == failP) && ((NIL != pattern_item) || (NIL != token))) {
                            if ((NIL == token_$10) && (pattern_item_$11 == $INDEXICAL_YEAR)) {
                                year = $INDEXICAL_YEAR;
                            } else
                                if ((NIL == token_$10) && (pattern_item_$11 == $UNKNOWN_YEAR)) {
                                    year = $sym217$_YEAR;
                                } else
                                    if ((NIL == token_$10) && (pattern_item_$11 == $UNKNOWN_DAY)) {
                                        day = $sym218$_DAY;
                                    } else
                                        if (!token_$10.isString()) {
                                            failP = T;
                                        } else
                                            if ((pattern_item_$11 == $YEAR) && (NIL != year_tokenP(token_$10, UNPROVIDED))) {
                                                year = year_tokenP(token_$10, UNPROVIDED);
                                            } else
                                                if ((pattern_item_$11 == $MONTH) && (NIL != month_tokenP(token_$10))) {
                                                    month = month_tokenP(token_$10);
                                                } else
                                                    if ((pattern_item_$11 == $MONTH_NAME) && (NIL != month_name_tokenP(token_$10))) {
                                                        month = month_name_tokenP(token_$10);
                                                    } else
                                                        if ((pattern_item_$11 == $DAY_NAME) && (NIL != day_name_tokenP(token_$10))) {
                                                            other_tokens = cons(list($DAY_NAME, token_$10), other_tokens);
                                                        } else
                                                            if ((pattern_item_$11 == $HOUR) && (NIL != hour_tokenP(token_$10))) {
                                                                other_tokens = cons(list($HOUR, token_$10), other_tokens);
                                                            } else
                                                                if ((pattern_item_$11 == $TIME) && (NIL != time_tokenP(token_$10))) {
                                                                    other_tokens = cons(list($TIME, token_$10), other_tokens);
                                                                } else
                                                                    if ((pattern_item_$11 == $MILLISECONDS) && (NIL != milliseconds_tokenP(token_$10))) {
                                                                        other_tokens = cons(list($MILLISECONDS, token_$10), other_tokens);
                                                                    } else
                                                                        if ((pattern_item_$11 == $TIME_ZONE) && (NIL != time_zone_tokenP(token_$10))) {
                                                                            other_tokens = cons(list($TIME_ZONE, token_$10), other_tokens);
                                                                        } else
                                                                            if ((pattern_item_$11 == $MONTH_NUM) && (NIL != month_number_tokenP(token_$10))) {
                                                                                month = month_number_tokenP(token_$10);
                                                                            } else
                                                                                if ((pattern_item_$11 == $DAY) && (NIL != day_tokenP(token_$10))) {
                                                                                    day = day_tokenP(token_$10);
                                                                                } else {
                                                                                    failP = T;
                                                                                }













                            token = token.rest();
                            token_$10 = token.first();
                            pattern_item = pattern_item.rest();
                            pattern_item_$11 = pattern_item.first();
                        } 
                    }
                } finally {
                    final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
            }
            if ((((NIL == failP) && (((NIL != cycl_grammar.el_variable_p(year)) || (year == $INDEXICAL_YEAR)) || (NIL != numeric_date_utilities.valid_year_number_p(year)))) && ((NIL == month) || (NIL != numeric_date_utilities.valid_month_number_p(month)))) && (((NIL == day) || (NIL != cycl_grammar.el_variable_p(day))) || (NIL != numeric_date_utilities.valid_day_for_month_p(day, month, year)))) {
                return values(list(day, month, year), other_tokens);
            }
        }
        return values(list(NIL, NIL, NIL), NIL);
    }

    public static SubLObject year_tokenP_internal(final SubLObject obj, SubLObject allow_two_digit_yearsP) {
        if (allow_two_digit_yearsP == UNPROVIDED) {
            allow_two_digit_yearsP = $parse_to_two_digit_years_in_datesP$.getDynamicValue();
        }
        if (NIL != allow_two_digit_yearsP) {
            return string_utilities.string_to_integer(obj);
        }
        if (NIL != list_utilities.lengthE(obj, FOUR_INTEGER, UNPROVIDED)) {
            return string_utilities.string_to_integer(obj);
        }
        return NIL;
    }

    public static SubLObject year_tokenP(final SubLObject obj, SubLObject allow_two_digit_yearsP) {
        if (allow_two_digit_yearsP == UNPROVIDED) {
            allow_two_digit_yearsP = $parse_to_two_digit_years_in_datesP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return year_tokenP_internal(obj, allow_two_digit_yearsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym226$YEAR_TOKEN_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym226$YEAR_TOKEN_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym226$YEAR_TOKEN_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(obj, allow_two_digit_yearsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (obj.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && allow_two_digit_yearsP.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(year_tokenP_internal(obj, allow_two_digit_yearsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(obj, allow_two_digit_yearsP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject day_tokenP_internal(final SubLObject obj) {
        final SubLObject number_tokenP = day_number_tokenP(obj);
        return NIL != number_tokenP ? number_tokenP : day_words_tokenP(obj);
    }

    public static SubLObject day_tokenP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return day_tokenP_internal(obj);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym227$DAY_TOKEN_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym227$DAY_TOKEN_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym227$DAY_TOKEN_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(day_tokenP_internal(obj)));
            memoization_state.caching_state_put(caching_state, obj, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject day_words_tokenP(final SubLObject obj) {
        if (NIL != string_utilities.english_ordinal_number_string_p(obj)) {
            return day_number_tokenP(string_utilities.english_ordinal_string_to_cardinal_string(obj));
        }
        if (NIL != string_utilities.alphanumeric_stringP(obj)) {
            return day_word_token_value(obj);
        }
        return NIL;
    }

    public static SubLObject day_word_token_value(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!$day_words$.getDynamicValue(thread).isHashtable()) {
            fill_day_words();
        }
        return gethash(string, $day_words$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject fill_day_words() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $day_words$.setDynamicValue(make_hash_table($int$100, EQUALP, UNPROVIDED), thread);
        SubLObject cdolist_list_var = $day_word_pairs$.getDynamicValue(thread);
        SubLObject string_number_pair = NIL;
        string_number_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = string_number_pair;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list229);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list229);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                sethash(key, $day_words$.getDynamicValue(thread), value);
            } else {
                cdestructuring_bind_error(datum, $list229);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string_number_pair = cdolist_list_var.first();
        } 
        return $day_words$.getDynamicValue(thread);
    }

    public static SubLObject day_number_tokenP(SubLObject obj) {
        if ((NIL != string_utilities.digit_stringP(obj)) && (NIL != string_utilities.string_to_integer(obj))) {
            obj = string_utilities.string_to_integer(obj);
        }
        if (!obj.isInteger()) {
            return NIL;
        }
        if ($int$32.numG(obj) && ZERO_INTEGER.numL(obj)) {
            return obj;
        }
        return NIL;
    }

    public static SubLObject month_tokenP(final SubLObject obj) {
        final SubLObject name_tokenP = month_name_tokenP(obj);
        return NIL != name_tokenP ? name_tokenP : month_number_tokenP(obj);
    }

    public static SubLObject month_name_tokenP(final SubLObject obj) {
        if (NIL != member(obj, $list231, EQUALP, UNPROVIDED)) {
            return ONE_INTEGER;
        }
        if (NIL != member(obj, $list232, EQUALP, UNPROVIDED)) {
            return TWO_INTEGER;
        }
        if (NIL != member(obj, $list233, EQUALP, UNPROVIDED)) {
            return THREE_INTEGER;
        }
        if (NIL != member(obj, $list234, EQUALP, UNPROVIDED)) {
            return FOUR_INTEGER;
        }
        if (NIL != member(obj, $list235, EQUALP, UNPROVIDED)) {
            return FIVE_INTEGER;
        }
        if (NIL != member(obj, $list236, EQUALP, UNPROVIDED)) {
            return SIX_INTEGER;
        }
        if (NIL != member(obj, $list237, EQUALP, UNPROVIDED)) {
            return SEVEN_INTEGER;
        }
        if (NIL != member(obj, $list238, EQUALP, UNPROVIDED)) {
            return EIGHT_INTEGER;
        }
        if (NIL != member(obj, $list239, EQUALP, UNPROVIDED)) {
            return NINE_INTEGER;
        }
        if (NIL != member(obj, $list240, EQUALP, UNPROVIDED)) {
            return TEN_INTEGER;
        }
        if (NIL != member(obj, $list241, EQUALP, UNPROVIDED)) {
            return ELEVEN_INTEGER;
        }
        if (NIL != member(obj, $list242, EQUALP, UNPROVIDED)) {
            return TWELVE_INTEGER;
        }
        return NIL;
    }

    public static SubLObject day_name_tokenP(final SubLObject obj) {
        return member(obj, $day_name_tokens$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED);
    }

    public static SubLObject hour_tokenP(final SubLObject obj) {
        return string_utilities.digit_stringP(obj);
    }

    public static SubLObject time_tokenP(final SubLObject obj) {
        return makeBoolean(obj.isString() && (NIL != find(CHAR_colon, obj, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject milliseconds_tokenP(final SubLObject obj) {
        return string_utilities.digit_stringP(obj);
    }

    public static SubLObject time_zone_tokenP(final SubLObject obj) {
        return makeBoolean((NIL != member(obj, $time_zone_tokens$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED)) || (obj.isString() && ((((NIL != alpha_char_p(string_utilities.first_char(obj))) && (NIL != list_utilities.lengthE(obj, ONE_INTEGER, UNPROVIDED))) || ((NIL != list_utilities.lengthE(obj, FOUR_INTEGER, UNPROVIDED)) && (NIL == list_utilities.find_if_not(DIGIT_CHAR_P, obj, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) || (((NIL != list_utilities.lengthE(obj, FIVE_INTEGER, UNPROVIDED)) && (NIL == list_utilities.find_if_not(DIGIT_CHAR_P, obj, symbol_function(IDENTITY), ONE_INTEGER, UNPROVIDED))) && (NIL != member(string_utilities.first_char(obj), $list245, UNPROVIDED, UNPROVIDED))))));
    }

    public static SubLObject month_number_tokenP_internal(SubLObject obj) {
        if ((NIL != string_utilities.digit_stringP(obj)) && (NIL != string_utilities.string_to_integer(obj))) {
            obj = string_utilities.string_to_integer(obj);
        }
        if ((obj.isInteger() && ZERO_INTEGER.numL(obj)) && THIRTEEN_INTEGER.numG(obj)) {
            return obj;
        }
        return NIL;
    }

    public static SubLObject month_number_tokenP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return month_number_tokenP_internal(obj);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym246$MONTH_NUMBER_TOKEN_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym246$MONTH_NUMBER_TOKEN_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym246$MONTH_NUMBER_TOKEN_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(month_number_tokenP_internal(obj)));
            memoization_state.caching_state_put(caching_state, obj, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject explode_time_from_tokens(final SubLObject tokens) {
        SubLObject second = NIL;
        SubLObject minute = NIL;
        SubLObject hour = NIL;
        final SubLObject integer_tokens = Mapping.mapcar(STRING_TO_INTEGER, tokens);
        final SubLObject pcase_var = length(tokens);
        if (pcase_var.eql(TWO_INTEGER)) {
            final SubLObject datum_evaluated_var = integer_tokens;
            hour = datum_evaluated_var.first();
            minute = cadr(datum_evaluated_var);
        } else
            if (pcase_var.eql(THREE_INTEGER)) {
                final SubLObject datum_evaluated_var = integer_tokens;
                hour = datum_evaluated_var.first();
                minute = cadr(datum_evaluated_var);
                second = cddr(datum_evaluated_var).first();
            }

        if (((NIL != numeric_date_utilities.valid_hour_number_p(hour)) && (NIL != numeric_date_utilities.valid_minute_number_p(minute))) && ((NIL == second) || (NIL != numeric_date_utilities.valid_second_number_p(second)))) {
            return values(second, minute, hour);
        }
        return values(NIL, NIL, NIL);
    }

    public static SubLObject cyc_date_encode_string_internal(final SubLObject template, final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject date_string = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    thread.resetMultipleValues();
                    final SubLObject format = explode_date(date);
                    final SubLObject year = thread.secondMultipleValue();
                    final SubLObject month = thread.thirdMultipleValue();
                    final SubLObject day = thread.fourthMultipleValue();
                    SubLObject hour = thread.fifthMultipleValue();
                    SubLObject min = thread.sixthMultipleValue();
                    SubLObject sec = thread.seventhMultipleValue();
                    final SubLObject millisec = thread.eighthMultipleValue();
                    thread.resetMultipleValues();
                    if ($str248$XML_datetime.equal(template)) {
                        date_string = format(NIL, $str249$_D__2__0D__2__0DT_2__0D__2__0D__2, new SubLObject[]{ year, month, day, hour, min, sec });
                    } else
                        if ($str250$MySQL_datetime.equal(template)) {
                            date_string = format(NIL, $str251$_D__2__0D__2__0D__2__0D__2__0D__2, new SubLObject[]{ year, NIL != month ? month : ONE_INTEGER, NIL != day ? day : ONE_INTEGER, NIL != hour ? hour : ZERO_INTEGER, NIL != min ? min : ZERO_INTEGER, NIL != sec ? sec : ZERO_INTEGER });
                        } else
                            if ($str252$CycConstant_datetime.equal(template)) {
                                date_string = (NIL != millisec) ? format(NIL, $str253$_4__0D_2__0D_2__0Dh_2__0Dm_2__0Ds, new SubLObject[]{ year, month, day, hour, min, sec, millisec }) : NIL != sec ? format(NIL, $str254$_4__0D_2__0D_2__0Dh_2__0Dm_2__0Ds, new SubLObject[]{ year, month, day, hour, min, sec }) : NIL != min ? format(NIL, $str255$_4__0D_2__0D_2__0Dh_2__0Dm_2__0D, new SubLObject[]{ year, month, day, hour, min }) : NIL != hour ? format(NIL, $str256$_4__0D_2__0D_2__0Dh_2__0D, new SubLObject[]{ year, month, day, hour }) : NIL != day ? format(NIL, $str257$_4__0D_2__0D_2__0D, new SubLObject[]{ year, month, day }) : NIL != month ? format(NIL, $str258$_4__0D_2__0D, year, month) : format(NIL, $str259$_4__0D, year);
                            } else
                                if ($str260$DateFromStringFn_datetime.equal(template)) {
                                    date_string = (NIL != millisec) ? format(NIL, $str261$_4__0D__2__0D__2__0D__2__0D__2__0, new SubLObject[]{ year, month, day, hour, min, sec, millisec }) : NIL != sec ? format(NIL, $str262$_4__0D__2__0D__2__0D__2__0D__2__0, new SubLObject[]{ year, month, day, hour, min, sec }) : NIL != min ? format(NIL, $str263$_4__0D__2__0D__2__0D__2__0D__2__0, new SubLObject[]{ year, month, day, hour, min }) : NIL != hour ? format(NIL, $str264$_4__0D__2__0D__2__0D__2__0D, new SubLObject[]{ year, month, day, hour }) : NIL != day ? format(NIL, $str265$_4__0D__2__0D__2__0D, new SubLObject[]{ year, month, day }) : NIL != month ? format(NIL, $str266$_4__0D__2__0D, year, month) : format(NIL, $str259$_4__0D, year);
                                } else
                                    if ($$$YYYYMMDD.equal(template)) {
                                        date_string = format(NIL, $str268$_D_2__0D_2__0D, new SubLObject[]{ year, month, day });
                                    } else
                                        if ($$$HHMMSS.equal(template)) {
                                            date_string = format(NIL, $str270$_2__0D_2__0D_2__0D, new SubLObject[]{ hour, min, sec });
                                        } else
                                            if ($str271$HH_MM_SS.equal(template)) {
                                                date_string = format(NIL, $str272$_2__0D__2__0D__2__0D, new SubLObject[]{ hour, min, sec });
                                            } else
                                                if ($$$YYYYMMDDHHMM.equal(template)) {
                                                    if (NIL != year) {
                                                        if (((NIL == hour) && (NIL == min)) && (NIL == sec)) {
                                                            hour = ZERO_INTEGER;
                                                            min = ZERO_INTEGER;
                                                            sec = ZERO_INTEGER;
                                                        }
                                                        date_string = format(NIL, $str274$_4__0D_2__0D_2__0D_2__0D_2__0D, new SubLObject[]{ year, month, day, hour, min });
                                                    }
                                                } else
                                                    if (($str275$YYYY_MM_DD_HH_MM_SS.equal(template) || $str276$YYYY_MM_DDTHH_MM_SS.equalp(template)) || $$$YYYYMMDDHHMMSS.equal(template)) {
                                                        if (NIL != year) {
                                                            if (((NIL == hour) && (NIL == min)) && (NIL == sec)) {
                                                                hour = ZERO_INTEGER;
                                                                min = ZERO_INTEGER;
                                                                sec = ZERO_INTEGER;
                                                            }
                                                            if ($str275$YYYY_MM_DD_HH_MM_SS.equal(template)) {
                                                                date_string = format(NIL, $str251$_D__2__0D__2__0D__2__0D__2__0D__2, new SubLObject[]{ year, month, day, hour, min, sec });
                                                            } else
                                                                if ($str276$YYYY_MM_DDTHH_MM_SS.equalp(template)) {
                                                                    date_string = format(NIL, $str278$_D__2__0D__2__0DT_2__0D__2__0D__2, new SubLObject[]{ year, month, day, hour, min, sec });
                                                                } else
                                                                    if ($$$YYYYMMDDHHMMSS.equal(template)) {
                                                                        date_string = format(NIL, $str279$_4__0D_2__0D_2__0D_2__0D_2__0D_2_, new SubLObject[]{ year, month, day, hour, min, sec });
                                                                    }


                                                        }
                                                    } else
                                                        if ($str280$YYYY_MM_DD.equal(template)) {
                                                            date_string = format(NIL, $str281$_D__2__0D__2__0D, new SubLObject[]{ year, month, day });
                                                        } else {
                                                            date_string = numeric_date_utilities.encode_datetime_string_from_template(millisec, sec, min, hour, day, month, year, template);
                                                        }









                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return date_string;
    }

    public static SubLObject common_date_encoding_templates() {
        return $common_date_encoding_templates$.getGlobalValue();
    }

    public static SubLObject cyc_date_decode_string_internal(final SubLObject template, final SubLObject date_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject date = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    if ($str248$XML_datetime.equal(template)) {
                        final SubLObject year = parse_integer(date_string, ZERO_INTEGER, FOUR_INTEGER, UNPROVIDED, UNPROVIDED);
                        final SubLObject month = parse_integer(date_string, FIVE_INTEGER, SEVEN_INTEGER, UNPROVIDED, UNPROVIDED);
                        final SubLObject day = parse_integer(date_string, EIGHT_INTEGER, TEN_INTEGER, UNPROVIDED, UNPROVIDED);
                        final SubLObject hour = parse_integer(date_string, ELEVEN_INTEGER, THIRTEEN_INTEGER, UNPROVIDED, UNPROVIDED);
                        final SubLObject minute = parse_integer(date_string, FOURTEEN_INTEGER, SIXTEEN_INTEGER, UNPROVIDED, UNPROVIDED);
                        final SubLObject second = parse_integer(date_string, SEVENTEEN_INTEGER, NINETEEN_INTEGER, UNPROVIDED, UNPROVIDED);
                        date = construct_calendar_date(year, month, day, hour, minute, second, UNPROVIDED);
                    } else
                        if ($str250$MySQL_datetime.equal(template)) {
                            final SubLObject tokens = string_utilities.string_tokenize(date_string, $list283, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject current;
                            final SubLObject datum = current = tokens;
                            SubLObject year2 = (current.isCons()) ? current.first() : NIL;
                            destructuring_bind_must_listp(current, datum, $list284);
                            current = current.rest();
                            SubLObject month2 = (current.isCons()) ? current.first() : NIL;
                            destructuring_bind_must_listp(current, datum, $list284);
                            current = current.rest();
                            SubLObject day2 = (current.isCons()) ? current.first() : NIL;
                            destructuring_bind_must_listp(current, datum, $list284);
                            current = current.rest();
                            SubLObject hour2 = (current.isCons()) ? current.first() : NIL;
                            destructuring_bind_must_listp(current, datum, $list284);
                            current = current.rest();
                            SubLObject minute2 = (current.isCons()) ? current.first() : NIL;
                            destructuring_bind_must_listp(current, datum, $list284);
                            current = current.rest();
                            SubLObject second2 = (current.isCons()) ? current.first() : NIL;
                            destructuring_bind_must_listp(current, datum, $list284);
                            current = current.rest();
                            final SubLObject decisecond = (current.isCons()) ? current.first() : NIL;
                            destructuring_bind_must_listp(current, datum, $list284);
                            current = current.rest();
                            if (NIL == current) {
                                year2 = (year2.isString()) ? string_utilities.string_to_integer(year2) : NIL;
                                month2 = (month2.isString()) ? string_utilities.string_to_integer(month2) : NIL;
                                day2 = (day2.isString()) ? string_utilities.string_to_integer(day2) : NIL;
                                hour2 = (hour2.isString()) ? string_utilities.string_to_integer(hour2) : NIL;
                                minute2 = (minute2.isString()) ? string_utilities.string_to_integer(minute2) : NIL;
                                second2 = (second2.isString()) ? string_utilities.string_to_integer(second2) : NIL;
                                date = construct_calendar_date(year2, month2, day2, hour2, minute2, second2, UNPROVIDED);
                            } else {
                                cdestructuring_bind_error(datum, $list284);
                            }
                        } else
                            if ($str252$CycConstant_datetime.equal(template)) {
                                SubLObject year = NIL;
                                SubLObject month = NIL;
                                SubLObject day = NIL;
                                SubLObject hour = NIL;
                                SubLObject minute = NIL;
                                SubLObject second = NIL;
                                SubLObject millisec = NIL;
                                SubLObject ignore_errors_tag_$13 = NIL;
                                try {
                                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                    final SubLObject _prev_bind_0_$14 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            year = parse_integer(date_string, ZERO_INTEGER, FOUR_INTEGER, UNPROVIDED, UNPROVIDED);
                                            month = parse_integer(date_string, FOUR_INTEGER, SIX_INTEGER, UNPROVIDED, UNPROVIDED);
                                            day = parse_integer(date_string, SIX_INTEGER, EIGHT_INTEGER, UNPROVIDED, UNPROVIDED);
                                            hour = parse_integer(date_string, NINE_INTEGER, ELEVEN_INTEGER, UNPROVIDED, UNPROVIDED);
                                            minute = parse_integer(date_string, TWELVE_INTEGER, FOURTEEN_INTEGER, UNPROVIDED, UNPROVIDED);
                                            second = parse_integer(date_string, FIFTEEN_INTEGER, SEVENTEEN_INTEGER, UNPROVIDED, UNPROVIDED);
                                            millisec = parse_integer(date_string, EIGHTEEN_INTEGER, $int$21, UNPROVIDED, UNPROVIDED);
                                        } catch (final Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$14, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    ignore_errors_tag_$13 = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                } finally {
                                    thread.throwStack.pop();
                                }
                                date = construct_calendar_date(year, month, day, hour, minute, second, millisec);
                            } else
                                if ($$$YYYYMMDDHHMMSS.equal(template)) {
                                    final SubLObject year = parse_integer(date_string, ZERO_INTEGER, FOUR_INTEGER, UNPROVIDED, UNPROVIDED);
                                    final SubLObject month = parse_integer(date_string, FOUR_INTEGER, SIX_INTEGER, UNPROVIDED, UNPROVIDED);
                                    final SubLObject day = parse_integer(date_string, SIX_INTEGER, EIGHT_INTEGER, UNPROVIDED, UNPROVIDED);
                                    final SubLObject hour = parse_integer(date_string, EIGHT_INTEGER, TEN_INTEGER, UNPROVIDED, UNPROVIDED);
                                    final SubLObject minute = parse_integer(date_string, TEN_INTEGER, TWELVE_INTEGER, UNPROVIDED, UNPROVIDED);
                                    final SubLObject second = parse_integer(date_string, TWELVE_INTEGER, FOURTEEN_INTEGER, UNPROVIDED, UNPROVIDED);
                                    date = construct_calendar_date(year, month, day, hour, minute, second, UNPROVIDED);
                                } else
                                    if ($$$YYYYMMDDHHMM.equal(template)) {
                                        final SubLObject year = parse_integer(date_string, ZERO_INTEGER, FOUR_INTEGER, UNPROVIDED, UNPROVIDED);
                                        final SubLObject month = parse_integer(date_string, FOUR_INTEGER, SIX_INTEGER, UNPROVIDED, UNPROVIDED);
                                        final SubLObject day = parse_integer(date_string, SIX_INTEGER, EIGHT_INTEGER, UNPROVIDED, UNPROVIDED);
                                        final SubLObject hour = parse_integer(date_string, EIGHT_INTEGER, TEN_INTEGER, UNPROVIDED, UNPROVIDED);
                                        final SubLObject minute = parse_integer(date_string, TEN_INTEGER, TWELVE_INTEGER, UNPROVIDED, UNPROVIDED);
                                        date = construct_calendar_date(year, month, day, hour, minute, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if ($$$YYYYMMDD.equal(template)) {
                                            final SubLObject year = parse_integer(date_string, ZERO_INTEGER, FOUR_INTEGER, UNPROVIDED, UNPROVIDED);
                                            final SubLObject month = parse_integer(date_string, FOUR_INTEGER, SIX_INTEGER, UNPROVIDED, UNPROVIDED);
                                            final SubLObject day = parse_integer(date_string, SIX_INTEGER, EIGHT_INTEGER, UNPROVIDED, UNPROVIDED);
                                            date = construct_calendar_date(year, month, day, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (($str275$YYYY_MM_DD_HH_MM_SS.equal(template) || $str276$YYYY_MM_DDTHH_MM_SS.equalp(template)) || $str280$YYYY_MM_DD.equal(template)) {
                                                final SubLObject tokens = string_utilities.string_tokenize(date_string, $list286, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                SubLObject current;
                                                final SubLObject datum = current = tokens;
                                                SubLObject year2 = (current.isCons()) ? current.first() : NIL;
                                                destructuring_bind_must_listp(current, datum, $list284);
                                                current = current.rest();
                                                SubLObject month2 = (current.isCons()) ? current.first() : NIL;
                                                destructuring_bind_must_listp(current, datum, $list284);
                                                current = current.rest();
                                                SubLObject day2 = (current.isCons()) ? current.first() : NIL;
                                                destructuring_bind_must_listp(current, datum, $list284);
                                                current = current.rest();
                                                SubLObject hour2 = (current.isCons()) ? current.first() : NIL;
                                                destructuring_bind_must_listp(current, datum, $list284);
                                                current = current.rest();
                                                SubLObject minute2 = (current.isCons()) ? current.first() : NIL;
                                                destructuring_bind_must_listp(current, datum, $list284);
                                                current = current.rest();
                                                SubLObject second2 = (current.isCons()) ? current.first() : NIL;
                                                destructuring_bind_must_listp(current, datum, $list284);
                                                current = current.rest();
                                                final SubLObject decisecond = (current.isCons()) ? current.first() : NIL;
                                                destructuring_bind_must_listp(current, datum, $list284);
                                                current = current.rest();
                                                if (NIL == current) {
                                                    year2 = (year2.isString()) ? parse_integer(year2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
                                                    month2 = (month2.isString()) ? parse_integer(month2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
                                                    day2 = (day2.isString()) ? parse_integer(day2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
                                                    hour2 = (hour2.isString()) ? parse_integer(hour2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
                                                    minute2 = (minute2.isString()) ? parse_integer(minute2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
                                                    second2 = (second2.isString()) ? parse_integer(second2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
                                                    if (NIL != year2) {
                                                        date = construct_calendar_date(year2, month2, day2, hour2, minute2, second2, UNPROVIDED);
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum, $list284);
                                                }
                                            } else {
                                                thread.resetMultipleValues();
                                                final SubLObject milliseconds = numeric_date_utilities.decode_datetime_string_from_template(date_string, template);
                                                final SubLObject seconds = thread.secondMultipleValue();
                                                final SubLObject minutes = thread.thirdMultipleValue();
                                                final SubLObject hours = thread.fourthMultipleValue();
                                                final SubLObject day3 = thread.fifthMultipleValue();
                                                final SubLObject month3 = thread.sixthMultipleValue();
                                                final SubLObject year3 = thread.seventhMultipleValue();
                                                thread.resetMultipleValues();
                                                date = construct_calendar_date(year3, month3, day3, hours, minutes, seconds, milliseconds);
                                            }






                } catch (final Throwable catch_var2) {
                    Errors.handleThrowable(catch_var2, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return date;
    }

    public static SubLObject cyc_date_from_string_internal(final SubLObject date_string) {
        SubLObject dates = parse_date_from_string(date_string);
        if (NIL != dates) {
            return dates;
        }
        if (NIL == dates) {
            SubLObject csome_list_var = common_date_encoding_templates();
            SubLObject template = NIL;
            template = csome_list_var.first();
            while ((NIL == dates) && (NIL != csome_list_var)) {
                final SubLObject var;
                final SubLObject date = var = cyc_date_decode_string_internal(template, date_string);
                if (NIL != var) {
                    final SubLObject item_var = var;
                    if (NIL == member(item_var, dates, symbol_function(EQL), symbol_function(IDENTITY))) {
                        dates = cons(item_var, dates);
                    }
                }
                csome_list_var = csome_list_var.rest();
                template = csome_list_var.first();
            } 
        }
        return dates;
    }

    public static SubLObject cyc_time_elapsed_encode_string_internal(final SubLObject template, final SubLObject time_quant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject elapsed_seconds = convert_time_quant_to_seconds(time_quant);
        SubLObject seconds = NIL;
        SubLObject minutes = NIL;
        SubLObject hours = NIL;
        SubLObject elapsed_days = NIL;
        SubLObject time_string = NIL;
        if (NIL != string_utilities.substringP($$$D, template, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject seconds_$15 = numeric_date_utilities.decode_elapsed_seconds(elapsed_seconds);
            final SubLObject minutes_$16 = thread.secondMultipleValue();
            final SubLObject hours_$17 = thread.thirdMultipleValue();
            final SubLObject elapsed_days_$18 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            seconds = seconds_$15;
            minutes = minutes_$16;
            hours = hours_$17;
            elapsed_days = elapsed_days_$18;
        } else {
            thread.resetMultipleValues();
            final SubLObject seconds_$16 = numeric_date_utilities.decode_elapsed_seconds_without_days(elapsed_seconds);
            final SubLObject minutes_$17 = thread.secondMultipleValue();
            final SubLObject hours_$18 = thread.thirdMultipleValue();
            final SubLObject elapsed_days_$19 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            seconds = seconds_$16;
            minutes = minutes_$17;
            hours = hours_$18;
            elapsed_days = elapsed_days_$19;
        }
        if ($str288$H_MM_SS.equal(template)) {
            time_string = format(NIL, $str289$_D__2__0D__2__0D, new SubLObject[]{ hours, minutes, truncate(seconds, UNPROVIDED) });
        } else
            if ($$$HHMMSS.equal(template)) {
                time_string = format(NIL, $str270$_2__0D_2__0D_2__0D, new SubLObject[]{ hours, minutes, seconds });
            } else
                if ($$$HHMM.equal(template)) {
                    time_string = format(NIL, $str291$_2__0D_2__0D, hours, minutes);
                } else {
                    Errors.cerror($str292$_cont, $str293$The_template__A_is_not_currently_, template);
                }


        return time_string;
    }

    public static SubLObject cyc_time_elapsed_decode_string_internal(final SubLObject template, final SubLObject time_string) {
        SubLObject time_quant = NIL;
        if ($str288$H_MM_SS.equal(template)) {
            final SubLObject hmmss = Mapping.mapcar(STRING_TO_INTEGER, string_utilities.string_tokenize(time_string, $list294, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            final SubLObject hours = hmmss.first();
            final SubLObject minutes = second(hmmss);
            final SubLObject seconds = third(hmmss);
            final SubLObject elapsed_seconds = numeric_date_utilities.encode_elapsed_seconds(seconds, minutes, hours, UNPROVIDED);
            time_quant = make_unary_formula($$SecondsDuration, elapsed_seconds);
        } else
            if ($$$HHMMSS.equal(template)) {
                final SubLObject hours2 = parse_integer(time_string, ZERO_INTEGER, TWO_INTEGER, UNPROVIDED, UNPROVIDED);
                final SubLObject minutes2 = parse_integer(time_string, TWO_INTEGER, FOUR_INTEGER, UNPROVIDED, UNPROVIDED);
                final SubLObject seconds2 = parse_integer(time_string, FOUR_INTEGER, SIX_INTEGER, UNPROVIDED, UNPROVIDED);
                final SubLObject elapsed_seconds2 = numeric_date_utilities.encode_elapsed_seconds(seconds2, minutes2, hours2, UNPROVIDED);
                time_quant = make_unary_formula($$SecondsDuration, elapsed_seconds2);
            } else
                if ($$$HHMM.equal(template)) {
                    final SubLObject hours2 = parse_integer(time_string, ZERO_INTEGER, TWO_INTEGER, UNPROVIDED, UNPROVIDED);
                    final SubLObject minutes2 = parse_integer(time_string, TWO_INTEGER, FOUR_INTEGER, UNPROVIDED, UNPROVIDED);
                    final SubLObject elapsed_seconds3 = numeric_date_utilities.encode_elapsed_seconds(ZERO_INTEGER, minutes2, hours2, UNPROVIDED);
                    time_quant = make_unary_formula($$SecondsDuration, elapsed_seconds3);
                } else {
                    Errors.cerror($str292$_cont, $str293$The_template__A_is_not_currently_, template);
                }


        return time_quant;
    }

    public static SubLObject later_than(SubLObject late_date, SubLObject early_date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        late_date = possibly_bind_temporal_indexical_in_object(late_date);
        early_date = possibly_bind_temporal_indexical_in_object(early_date);
        if ((NIL != generalized_date_p(late_date)) && (NIL != generalized_date_p(early_date))) {
            return values(dateL(early_date, late_date), NIL);
        }
        if ((NIL == isa.isaP(late_date, $$Date, UNPROVIDED, UNPROVIDED)) || (NIL == isa.isaP(early_date, $$Date, UNPROVIDED, UNPROVIDED))) {
            return values(NIL, T);
        }
        if (NIL != sbhl_time_modules.starts_after_ending_ofP(late_date, early_date, UNPROVIDED)) {
            return values(T, NIL);
        }
        if (NIL != sbhl_time_modules.not_starts_after_ending_ofP(late_date, early_date, UNPROVIDED)) {
            return values(NIL, NIL);
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
        try {
            gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
            result = gt_methods.gt_booleanP($$laterThan, late_date, early_date, UNPROVIDED);
        } finally {
            gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != result) {
            return values(result, NIL);
        }
        return values(NIL, T);
    }

    public static SubLObject declare_date_utilities_file() {
        declareFunction(me, "initialize_date_kb_feature", "INITIALIZE-DATE-KB-FEATURE", 0, 0, false);
        declareFunction(me, "possibly_simple_el_date_p", "POSSIBLY-SIMPLE-EL-DATE-P", 1, 0, false);
        declareFunction(me, "possibly_el_time_millisecond_p", "POSSIBLY-EL-TIME-MILLISECOND-P", 1, 0, false);
        declareFunction(me, "possibly_el_time_second_p", "POSSIBLY-EL-TIME-SECOND-P", 1, 0, false);
        declareFunction(me, "possibly_el_time_minute_p", "POSSIBLY-EL-TIME-MINUTE-P", 1, 0, false);
        declareFunction(me, "possibly_el_time_hour_p", "POSSIBLY-EL-TIME-HOUR-P", 1, 0, false);
        declareFunction(me, "possibly_el_date_day_p", "POSSIBLY-EL-DATE-DAY-P", 1, 0, false);
        declareFunction(me, "possibly_el_date_month_p", "POSSIBLY-EL-DATE-MONTH-P", 1, 0, false);
        declareFunction(me, "possibly_el_date_year_p", "POSSIBLY-EL-DATE-YEAR-P", 1, 0, false);
        declareFunction(me, "simple_el_date_p", "SIMPLE-EL-DATE-P", 1, 0, false);
        declareFunction(me, "el_time_millisecond_p", "EL-TIME-MILLISECOND-P", 1, 0, false);
        declareFunction(me, "el_time_second_p", "EL-TIME-SECOND-P", 1, 0, false);
        declareFunction(me, "el_time_minute_p", "EL-TIME-MINUTE-P", 1, 0, false);
        declareFunction(me, "el_time_hour_p", "EL-TIME-HOUR-P", 1, 0, false);
        declareFunction(me, "el_date_day_p", "EL-DATE-DAY-P", 1, 0, false);
        declareFunction(me, "el_date_month_p", "EL-DATE-MONTH-P", 1, 0, false);
        declareFunction(me, "el_date_year_p", "EL-DATE-YEAR-P", 1, 0, false);
        declareMacro(me, "el_date_time_compare_guts", "EL-DATE-TIME-COMPARE-GUTS");
        declareFunction(me, "el_millisecond_compare", "EL-MILLISECOND-COMPARE", 2, 0, false);
        declareFunction(me, "el_second_compare", "EL-SECOND-COMPARE", 2, 0, false);
        declareFunction(me, "el_minute_compare", "EL-MINUTE-COMPARE", 2, 0, false);
        declareFunction(me, "el_hour_compare", "EL-HOUR-COMPARE", 2, 0, false);
        declareFunction(me, "el_day_compare", "EL-DAY-COMPARE", 2, 0, false);
        declareFunction(me, "el_month_compare", "EL-MONTH-COMPARE", 2, 0, false);
        declareFunction(me, "el_year_compare", "EL-YEAR-COMPARE", 2, 0, false);
        declareFunction(me, "number_compare", "NUMBER-COMPARE", 2, 0, false);
        declareFunction(me, "month_compare", "MONTH-COMPARE", 2, 0, false);
        declareFunction(me, "fast_date_L", "FAST-DATE-<", 2, 0, false);
        declareFunction(me, "fast_date_LE", "FAST-DATE-<=", 2, 0, false);
        declareFunction(me, "fast_date_compare", "FAST-DATE-COMPARE", 2, 0, false);
        declareFunction(me, "el_date_granularity_compare", "EL-DATE-GRANULARITY-COMPARE", 2, 0, false);
        declareFunction(me, "fast_comparable_date_compare", "FAST-COMPARABLE-DATE-COMPARE", 2, 0, false);
        declareFunction(me, "possibly_hl_date_p", "POSSIBLY-HL-DATE-P", 1, 0, false);
        declareFunction(me, "possibly_date_p", "POSSIBLY-DATE-P", 1, 0, false);
        declareFunction(me, "date_p", "DATE-P", 1, 0, false);
        declareFunction(me, "possibly_time_p", "POSSIBLY-TIME-P", 1, 0, false);
        declareFunction(me, "time_p", "TIME-P", 1, 0, false);
        declareFunction(me, "generalized_date_p", "GENERALIZED-DATE-P", 1, 0, false);
        declareFunction(me, "date_query_p", "DATE-QUERY-P", 1, 1, false);
        declareFunction(me, "date_p_internal", "DATE-P-INTERNAL", 1, 0, false);
        new date_utilities.$date_p_internal$UnaryFunction();
        declareFunction(me, "day_for_time_p_p", "DAY-FOR-TIME-P-P", 1, 0, false);
        declareFunction(me, "time_p_internal", "TIME-P-INTERNAL", 1, 0, false);
        declareFunction(me, "beginning_of_timeP", "BEGINNING-OF-TIME?", 1, 0, false);
        declareFunction(me, "end_of_timeP", "END-OF-TIME?", 1, 0, false);
        declareFunction(me, "always_time_intervalP", "ALWAYS-TIME-INTERVAL?", 1, 0, false);
        declareFunction(me, "empty_time_intervalP", "EMPTY-TIME-INTERVAL?", 1, 0, false);
        declareFunction(me, "date_unitG", "DATE-UNIT>", 2, 0, false);
        declareMacro(me, "do_time_units_ordered", "DO-TIME-UNITS-ORDERED");
        declareFunction(me, "date_formatG", "DATE-FORMAT>", 2, 0, false);
        declareFunction(me, "extract_date_century", "EXTRACT-DATE-CENTURY", 1, 0, false);
        declareFunction(me, "extract_date_decade", "EXTRACT-DATE-DECADE", 1, 0, false);
        declareFunction(me, "extract_date_year", "EXTRACT-DATE-YEAR", 1, 0, false);
        declareFunction(me, "extract_date_month", "EXTRACT-DATE-MONTH", 1, 0, false);
        declareFunction(me, "extract_date_month_number", "EXTRACT-DATE-MONTH-NUMBER", 1, 0, false);
        declareFunction(me, "extract_date_day", "EXTRACT-DATE-DAY", 1, 0, false);
        declareFunction(me, "extract_date_hour", "EXTRACT-DATE-HOUR", 1, 0, false);
        declareFunction(me, "extract_date_minute", "EXTRACT-DATE-MINUTE", 1, 0, false);
        declareFunction(me, "extract_date_second", "EXTRACT-DATE-SECOND", 1, 0, false);
        declareFunction(me, "extract_date_millisecond", "EXTRACT-DATE-MILLISECOND", 1, 0, false);
        declareFunction(me, "millisecondstring", "MILLISECONDSTRING", 1, 0, false);
        declareFunction(me, "extract_date_time_type", "EXTRACT-DATE-TIME-TYPE", 2, 0, false);
        declareFunction(me, "explode_date", "EXPLODE-DATE", 1, 0, false);
        declareFunction(me, "date_format", "DATE-FORMAT", 1, 0, false);
        declareFunction(me, "explode_calendar_time", "EXPLODE-CALENDAR-TIME", 1, 0, false);
        declareFunction(me, "explode_calendar_date", "EXPLODE-CALENDAR-DATE", 1, 0, false);
        declareFunction(me, "explode_quarter_date", "EXPLODE-QUARTER-DATE", 1, 0, false);
        declareFunction(me, "explode_decade_date", "EXPLODE-DECADE-DATE", 1, 0, false);
        declareFunction(me, "explode_century_date", "EXPLODE-CENTURY-DATE", 1, 0, false);
        declareFunction(me, "construct_cycl_date", "CONSTRUCT-CYCL-DATE", 6, 0, false);
        declareFunction(me, "construct_cycl_date_ms", "CONSTRUCT-CYCL-DATE-MS", 7, 0, false);
        declareFunction(me, "construct_reduced_cycl_date", "CONSTRUCT-REDUCED-CYCL-DATE", 6, 0, false);
        declareFunction(me, "construct_reduced_cycl_date_ms", "CONSTRUCT-REDUCED-CYCL-DATE-MS", 7, 0, false);
        declareFunction(me, "date_reduced_to_start", "DATE-REDUCED-TO-START", 1, 0, false);
        declareFunction(me, "date_reduced_to_end", "DATE-REDUCED-TO-END", 1, 0, false);
        declareFunction(me, "date_to_precision", "DATE-TO-PRECISION", 2, 1, false);
        declareFunction(me, "construct_calendar_date", "CONSTRUCT-CALENDAR-DATE", 1, 6, false);
        declareFunction(me, "construct_quarter_date", "CONSTRUCT-QUARTER-DATE", 1, 1, false);
        declareFunction(me, "construct_decade_date", "CONSTRUCT-DECADE-DATE", 1, 0, false);
        declareFunction(me, "construct_century_date", "CONSTRUCT-CENTURY-DATE", 1, 0, false);
        declareFunction(me, "calendar_date_sum", "CALENDAR-DATE-SUM", 9, 0, false);
        declareFunction(me, "quarter_date_sum", "QUARTER-DATE-SUM", 4, 0, false);
        declareFunction(me, "decade_date_sum", "DECADE-DATE-SUM", 3, 0, false);
        declareFunction(me, "century_date_sum", "CENTURY-DATE-SUM", 3, 0, false);
        declareFunction(me, "month_p", "MONTH-P", 1, 0, false);
        declareFunction(me, "month_number", "MONTH-NUMBER", 1, 0, false);
        declareFunction(me, "number_of_month", "NUMBER-OF-MONTH", 1, 0, false);
        declareFunction(me, "day_number", "DAY-NUMBER", 1, 0, false);
        declareFunction(me, "month_term_p", "MONTH-TERM-P", 1, 0, false);
        declareFunction(me, "day_of_week_p", "DAY-OF-WEEK-P", 1, 0, false);
        declareFunction(me, "day_of_week_number", "DAY-OF-WEEK-NUMBER", 1, 0, false);
        declareFunction(me, "following_day_of_week", "FOLLOWING-DAY-OF-WEEK", 1, 0, false);
        declareFunction(me, "prior_day_of_week", "PRIOR-DAY-OF-WEEK", 1, 0, false);
        declareFunction(me, "number_of_day_of_week", "NUMBER-OF-DAY-OF-WEEK", 1, 0, false);
        declareFunction(me, "day_of_week_of_date", "DAY-OF-WEEK-OF-DATE", 1, 0, false);
        declareFunction(me, "day_of_week_prior_to_date", "DAY-OF-WEEK-PRIOR-TO-DATE", 2, 0, false);
        declareFunction(me, "day_of_week_prior_to_date_inclusive", "DAY-OF-WEEK-PRIOR-TO-DATE-INCLUSIVE", 2, 0, false);
        declareFunction(me, "day_of_week_after_date", "DAY-OF-WEEK-AFTER-DATE", 2, 0, false);
        declareFunction(me, "day_of_week_after_date_inclusive", "DAY-OF-WEEK-AFTER-DATE-INCLUSIVE", 2, 0, false);
        declareFunction(me, "century_of_year", "CENTURY-OF-YEAR", 1, 0, false);
        declareFunction(me, "get_century_starting_day", "GET-CENTURY-STARTING-DAY", 1, 0, false);
        declareFunction(me, "day_of_month_term_p", "DAY-OF-MONTH-TERM-P", 1, 0, false);
        declareFunction(me, "days_since_rata_die", "DAYS-SINCE-RATA-DIE", 1, 0, false);
        declareFunction(me, "adjust_thirty_day_february", "ADJUST-THIRTY-DAY-FEBRUARY", 2, 0, false);
        declareFunction(me, "hour_of_day_p", "HOUR-OF-DAY-P", 1, 0, false);
        declareFunction(me, "hour_of_day_term_p", "HOUR-OF-DAY-TERM-P", 1, 0, false);
        declareFunction(me, "hour_of_day_of_date", "HOUR-OF-DAY-OF-DATE", 1, 0, false);
        declareFunction(me, "number_of_hour_of_day", "NUMBER-OF-HOUR-OF-DAY", 1, 0, false);
        declareFunction(me, "time_of_day_of_date", "TIME-OF-DAY-OF-DATE", 1, 0, false);
        declareFunction(me, "minute_of_hour_term_p", "MINUTE-OF-HOUR-TERM-P", 1, 0, false);
        declareFunction(me, "minute_of_hour_of_date", "MINUTE-OF-HOUR-OF-DATE", 1, 0, false);
        declareFunction(me, "second_of_minute_term_p", "SECOND-OF-MINUTE-TERM-P", 1, 0, false);
        declareFunction(me, "second_of_minute_of_date", "SECOND-OF-MINUTE-OF-DATE", 1, 0, false);
        declareFunction(me, "millisecond_of_second_term_p", "MILLISECOND-OF-SECOND-TERM-P", 1, 0, false);
        declareFunction(me, "millisecond_of_second_of_date", "MILLISECOND-OF-SECOND-OF-DATE", 1, 0, false);
        declareFunction(me, "starting_value_for_calendar_unit_p", "STARTING-VALUE-FOR-CALENDAR-UNIT-P", 2, 0, false);
        declareFunction(me, "starting_numerical_value_for_calendar_unit_p", "STARTING-NUMERICAL-VALUE-FOR-CALENDAR-UNIT-P", 2, 0, false);
        declareFunction(me, "starting_numerical_values_for_calendar_unit_p", "STARTING-NUMERICAL-VALUES-FOR-CALENDAR-UNIT-P", 2, 0, false);
        declareFunction(me, "ending_value_for_calendar_unit_p", "ENDING-VALUE-FOR-CALENDAR-UNIT-P", 2, 2, false);
        declareFunction(me, "ending_numerical_value_for_calendar_unit_p", "ENDING-NUMERICAL-VALUE-FOR-CALENDAR-UNIT-P", 2, 2, false);
        declareFunction(me, "ending_numerical_values_for_calendar_unit_p", "ENDING-NUMERICAL-VALUES-FOR-CALENDAR-UNIT-P", 2, 2, false);
        declareFunction(me, "truncate_date_to_format", "TRUNCATE-DATE-TO-FORMAT", 2, 0, false);
        declareFunction(me, "date_precision", "DATE-PRECISION", 1, 0, false);
        declareFunction(me, "reduce_date_start", "REDUCE-DATE-START", 1, 0, false);
        declareFunction(me, "reduce_date_end", "REDUCE-DATE-END", 1, 0, false);
        declareFunction(me, "defining_time_unit", "DEFINING-TIME-UNIT", 1, 0, false);
        declareFunction(me, "defining_time_unit_get_interval", "DEFINING-TIME-UNIT-GET-INTERVAL", 1, 0, false);
        declareFunction(me, "inference_defining_time_unit_internal", "INFERENCE-DEFINING-TIME-UNIT-INTERNAL", 1, 0, false);
        declareFunction(me, "inference_defining_time_unit", "INFERENCE-DEFINING-TIME-UNIT", 1, 0, false);
        declareFunction(me, "inference_defining_time_unit_get_interval_internal", "INFERENCE-DEFINING-TIME-UNIT-GET-INTERVAL-INTERNAL", 1, 0, false);
        declareFunction(me, "inference_defining_time_unit_get_interval", "INFERENCE-DEFINING-TIME-UNIT-GET-INTERVAL", 1, 0, false);
        declareFunction(me, "convert_time_to_date_precision", "CONVERT-TIME-TO-DATE-PRECISION", 2, 0, false);
        declareFunction(me, "extend_date_to_time_precision", "EXTEND-DATE-TO-TIME-PRECISION", 2, 0, false);
        declareFunction(me, "minute_of_date", "MINUTE-OF-DATE", 1, 0, false);
        declareFunction(me, "hour_of_date", "HOUR-OF-DATE", 1, 0, false);
        declareFunction(me, "day_of_date", "DAY-OF-DATE", 1, 0, false);
        declareFunction(me, "month_of_date", "MONTH-OF-DATE", 1, 0, false);
        declareFunction(me, "quarter_of_date", "QUARTER-OF-DATE", 1, 0, false);
        declareFunction(me, "quarter_of_month", "QUARTER-OF-MONTH", 1, 0, false);
        declareFunction(me, "year_of_date", "YEAR-OF-DATE", 1, 0, false);
        declareFunction(me, "decade_of_date", "DECADE-OF-DATE", 1, 0, false);
        declareFunction(me, "century_of_date", "CENTURY-OF-DATE", 1, 0, false);
        declareFunction(me, "dateLE", "DATE<=", 2, 0, false);
        declareFunction(me, "dateGE", "DATE>=", 2, 0, false);
        declareFunction(me, "dateE", "DATE=", 2, 0, false);
        declareFunction(me, "dateL", "DATE<", 2, 0, false);
        declareFunction(me, "dateG", "DATE>", 2, 0, false);
        declareFunction(me, "dateL_int", "DATE<-INT", 2, 0, false);
        declareFunction(me, "cycl_date_initial_second", "CYCL-DATE-INITIAL-SECOND", 1, 0, false);
        declareFunction(me, "cycl_date_final_second", "CYCL-DATE-FINAL-SECOND", 1, 0, false);
        declareFunction(me, "date_subsumes", "DATE-SUBSUMES", 2, 0, false);
        declareFunction(me, "cycl_date_initial_millisecond", "CYCL-DATE-INITIAL-MILLISECOND", 1, 0, false);
        declareFunction(me, "cycl_date_final_millisecond", "CYCL-DATE-FINAL-MILLISECOND", 1, 0, false);
        declareFunction(me, "explode_time", "EXPLODE-TIME", 1, 0, false);
        declareFunction(me, "explode_time_force_integer_amount", "EXPLODE-TIME-FORCE-INTEGER-AMOUNT", 1, 0, false);
        declareFunction(me, "next_smallest_duration_function", "NEXT-SMALLEST-DURATION-FUNCTION", 1, 0, false);
        declareFunction(me, "date_after", "DATE-AFTER", 2, 0, false);
        declareFunction(me, "date_after_precise", "DATE-AFTER-PRECISE", 2, 0, false);
        declareFunction(me, "date_after_duration_start_precise", "DATE-AFTER-DURATION-START-PRECISE", 2, 0, false);
        declareFunction(me, "date_before", "DATE-BEFORE", 2, 0, false);
        declareFunction(me, "date_before_precise", "DATE-BEFORE-PRECISE", 2, 0, false);
        declareFunction(me, "convert_time_quant_to_seconds", "CONVERT-TIME-QUANT-TO-SECONDS", 1, 0, false);
        declareFunction(me, "convert_time_quant_to_minutes", "CONVERT-TIME-QUANT-TO-MINUTES", 1, 0, false);
        declareFunction(me, "convert_time_quant_to_hours", "CONVERT-TIME-QUANT-TO-HOURS", 1, 0, false);
        declareFunction(me, "convert_time_quant_to_days", "CONVERT-TIME-QUANT-TO-DAYS", 1, 0, false);
        declareFunction(me, "convert_time_quant_to_months", "CONVERT-TIME-QUANT-TO-MONTHS", 1, 0, false);
        declareFunction(me, "convert_time_quant_to_years", "CONVERT-TIME-QUANT-TO-YEARS", 1, 0, false);
        declareFunction(me, "time_elapsed", "TIME-ELAPSED", 2, 1, false);
        declareFunction(me, "time_elapsed_precision", "TIME-ELAPSED-PRECISION", 2, 0, false);
        declareFunction(me, "time_elapsed_difference", "TIME-ELAPSED-DIFFERENCE", 3, 0, false);
        declareFunction(me, "years_difference", "YEARS-DIFFERENCE", 2, 0, false);
        declareFunction(me, "months_difference", "MONTHS-DIFFERENCE", 2, 0, false);
        declareFunction(me, "days_difference", "DAYS-DIFFERENCE", 2, 0, false);
        declareFunction(me, "hours_difference", "HOURS-DIFFERENCE", 2, 0, false);
        declareFunction(me, "minutes_difference", "MINUTES-DIFFERENCE", 2, 0, false);
        declareFunction(me, "seconds_difference", "SECONDS-DIFFERENCE", 2, 0, false);
        declareFunction(me, "milliseconds_difference", "MILLISECONDS-DIFFERENCE", 2, 0, false);
        declareFunction(me, "leap_years_between", "LEAP-YEARS-BETWEEN", 2, 0, false);
        declareFunction(me, "naive_leap_years_between", "NAIVE-LEAP-YEARS-BETWEEN", 2, 0, false);
        declareFunction(me, "years_elapsed", "YEARS-ELAPSED", 3, 1, false);
        declareFunction(me, "months_elapsed", "MONTHS-ELAPSED", 3, 1, false);
        declareFunction(me, "days_between_universal_dates", "DAYS-BETWEEN-UNIVERSAL-DATES", 2, 0, false);
        declareFunction(me, "temporal_indexical_p", "TEMPORAL-INDEXICAL-P", 1, 0, false);
        new date_utilities.$temporal_indexical_p$UnaryFunction();
        declareFunction(me, "contains_indexicalP", "CONTAINS-INDEXICAL?", 1, 0, false);
        declareFunction(me, "first_among_time_indexes", "FIRST-AMONG-TIME-INDEXES", 1, 0, false);
        declareFunction(me, "last_among_time_indexes", "LAST-AMONG-TIME-INDEXES", 1, 0, false);
        declareFunction(me, "bind_and_store_indexicals", "BIND-AND-STORE-INDEXICALS", 1, 0, false);
        declareFunction(me, "possibly_bind_temporal_indexical_in_object", "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT", 1, 0, false);
        declareFunction(me, "bind_temporal_indexical_in_object", "BIND-TEMPORAL-INDEXICAL-IN-OBJECT", 1, 0, false);
        declareFunction(me, "bind_temporal_indexicals_in_hlmt_list", "BIND-TEMPORAL-INDEXICALS-IN-HLMT-LIST", 1, 0, false);
        declareFunction(me, "inference_now", "INFERENCE-NOW", 0, 0, false);
        declareFunction(me, "get_inference_now", "GET-INFERENCE-NOW", 0, 0, false);
        declareMacro(me, "with_cpu_now", "WITH-CPU-NOW");
        declareMacro(me, "with_inference_now", "WITH-INFERENCE-NOW");
        declareMacro(me, "possibly_with_inference_now", "POSSIBLY-WITH-INFERENCE-NOW");
        declareFunction(me, "indexical_now", "INDEXICAL-NOW", 0, 0, false);
        new date_utilities.$indexical_now$ZeroArityFunction();
        declareFunction(me, "indexical_now_precise", "INDEXICAL-NOW-PRECISE", 0, 0, false);
        declareFunction(me, "indexical_today", "INDEXICAL-TODAY", 0, 0, false);
        declareFunction(me, "indexical_tomorrow", "INDEXICAL-TOMORROW", 0, 0, false);
        declareFunction(me, "indexical_yesterday", "INDEXICAL-YESTERDAY", 0, 0, false);
        declareFunction(me, "indexical_seconds_since_1970", "INDEXICAL-SECONDS-SINCE-1970", 0, 0, false);
        declareFunction(me, "current_time_interval_of_type", "CURRENT-TIME-INTERVAL-OF-TYPE", 1, 0, false);
        declareFunction(me, "next_iterated_cyclic_interval_inclusive", "NEXT-ITERATED-CYCLIC-INTERVAL-INCLUSIVE", 1, 1, false);
        declareFunction(me, "next_iterated_cyclic_interval_inclusive_helper", "NEXT-ITERATED-CYCLIC-INTERVAL-INCLUSIVE-HELPER", 8, 0, false);
        declareFunction(me, "universal_time_to_cycl_date", "UNIVERSAL-TIME-TO-CYCL-DATE", 1, 0, false);
        declareFunction(me, "universal_date_to_cycl_date", "UNIVERSAL-DATE-TO-CYCL-DATE", 1, 0, false);
        declareFunction(me, "extended_universal_date_to_cycl_date", "EXTENDED-UNIVERSAL-DATE-TO-CYCL-DATE", 1, 0, false);
        declareFunction(me, "cycl_date_to_universal_date", "CYCL-DATE-TO-UNIVERSAL-DATE", 1, 0, false);
        declareFunction(me, "cycl_date_to_universal_time", "CYCL-DATE-TO-UNIVERSAL-TIME", 1, 0, false);
        declareFunction(me, "cycl_date_to_universal_second", "CYCL-DATE-TO-UNIVERSAL-SECOND", 1, 0, false);
        declareFunction(me, "extended_universal_date_for_date_initial_second", "EXTENDED-UNIVERSAL-DATE-FOR-DATE-INITIAL-SECOND", 1, 0, false);
        declareFunction(me, "extended_universal_date_for_date_final_second", "EXTENDED-UNIVERSAL-DATE-FOR-DATE-FINAL-SECOND", 1, 0, false);
        declareFunction(me, "temporal_object_from_string", "TEMPORAL-OBJECT-FROM-STRING", 1, 0, false);
        declareFunction(me, "meets_time_object_constraintP", "MEETS-TIME-OBJECT-CONSTRAINT?", 1, 1, false);
        declareFunction(me, "construct_cycl_date_from_date_range_string", "CONSTRUCT-CYCL-DATE-FROM-DATE-RANGE-STRING", 1, 0, false);
        declareFunction(me, "string_specifies_date_range_p", "STRING-SPECIFIES-DATE-RANGE-P", 1, 0, false);
        declareFunction(me, "unpack_date_range_string", "UNPACK-DATE-RANGE-STRING", 1, 0, false);
        declareFunction(me, "construct_date_from_to", "CONSTRUCT-DATE-FROM-TO", 4, 0, false);
        declareFunction(me, "parse_date_from_string", "PARSE-DATE-FROM-STRING", 1, 0, false);
        declareFunction(me, "possibly_filter_two_digit_years", "POSSIBLY-FILTER-TWO-DIGIT-YEARS", 1, 0, false);
        declareFunction(me, "parse_date_wXout_two_digit_years", "PARSE-DATE-W/OUT-TWO-DIGIT-YEARS", 1, 0, false);
        declareFunction(me, "parse_unambiguous_date_from_string", "PARSE-UNAMBIGUOUS-DATE-FROM-STRING", 1, 0, false);
        declareFunction(me, "guess_datetime_string", "GUESS-DATETIME-STRING", 1, 0, false);
        declareFunction(me, "construct_date_and_time_from_tokens", "CONSTRUCT-DATE-AND-TIME-FROM-TOKENS", 2, 0, false);
        declareFunction(me, "date_time_tokensP", "DATE-TIME-TOKENS?", 1, 0, false);
        declareFunction(me, "time_date_tokensP", "TIME-DATE-TOKENS?", 1, 0, false);
        declareFunction(me, "parse_date_from_string_fast", "PARSE-DATE-FROM-STRING-FAST", 1, 3, false);
        declareFunction(me, "number_should_be_interpreted_as_a_dateP", "NUMBER-SHOULD-BE-INTERPRETED-AS-A-DATE?", 4, 0, false);
        declareFunction(me, "two_digit_yearP", "TWO-DIGIT-YEAR?", 1, 1, false);
        declareFunction(me, "construct_possible_more_likely_dates", "CONSTRUCT-POSSIBLE-MORE-LIKELY-DATES", 1, 1, false);
        declareFunction(me, "explode_date_from_tokens", "EXPLODE-DATE-FROM-TOKENS", 1, 2, false);
        declareFunction(me, "tokens_match_date_pattern", "TOKENS-MATCH-DATE-PATTERN", 2, 0, false);
        declareFunction(me, "year_tokenP_internal", "YEAR-TOKEN?-INTERNAL", 1, 1, false);
        declareFunction(me, "year_tokenP", "YEAR-TOKEN?", 1, 1, false);
        declareFunction(me, "day_tokenP_internal", "DAY-TOKEN?-INTERNAL", 1, 0, false);
        declareFunction(me, "day_tokenP", "DAY-TOKEN?", 1, 0, false);
        declareFunction(me, "day_words_tokenP", "DAY-WORDS-TOKEN?", 1, 0, false);
        declareFunction(me, "day_word_token_value", "DAY-WORD-TOKEN-VALUE", 1, 0, false);
        declareFunction(me, "fill_day_words", "FILL-DAY-WORDS", 0, 0, false);
        declareFunction(me, "day_number_tokenP", "DAY-NUMBER-TOKEN?", 1, 0, false);
        declareFunction(me, "month_tokenP", "MONTH-TOKEN?", 1, 0, false);
        declareFunction(me, "month_name_tokenP", "MONTH-NAME-TOKEN?", 1, 0, false);
        declareFunction(me, "day_name_tokenP", "DAY-NAME-TOKEN?", 1, 0, false);
        declareFunction(me, "hour_tokenP", "HOUR-TOKEN?", 1, 0, false);
        declareFunction(me, "time_tokenP", "TIME-TOKEN?", 1, 0, false);
        declareFunction(me, "milliseconds_tokenP", "MILLISECONDS-TOKEN?", 1, 0, false);
        declareFunction(me, "time_zone_tokenP", "TIME-ZONE-TOKEN?", 1, 0, false);
        declareFunction(me, "month_number_tokenP_internal", "MONTH-NUMBER-TOKEN?-INTERNAL", 1, 0, false);
        declareFunction(me, "month_number_tokenP", "MONTH-NUMBER-TOKEN?", 1, 0, false);
        declareFunction(me, "explode_time_from_tokens", "EXPLODE-TIME-FROM-TOKENS", 1, 0, false);
        declareFunction(me, "cyc_date_encode_string_internal", "CYC-DATE-ENCODE-STRING-INTERNAL", 2, 0, false);
        declareFunction(me, "common_date_encoding_templates", "COMMON-DATE-ENCODING-TEMPLATES", 0, 0, false);
        declareFunction(me, "cyc_date_decode_string_internal", "CYC-DATE-DECODE-STRING-INTERNAL", 2, 0, false);
        declareFunction(me, "cyc_date_from_string_internal", "CYC-DATE-FROM-STRING-INTERNAL", 1, 0, false);
        declareFunction(me, "cyc_time_elapsed_encode_string_internal", "CYC-TIME-ELAPSED-ENCODE-STRING-INTERNAL", 2, 0, false);
        declareFunction(me, "cyc_time_elapsed_decode_string_internal", "CYC-TIME-ELAPSED-DECODE-STRING-INTERNAL", 2, 0, false);
        declareFunction(me, "later_than", "LATER-THAN", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_date_utilities_file() {
        deflexical("*DATE-CORE-CONSTANTS*", $list0);
        deflexical("*EL-DATE-GRANULARITY-ORDER*", $list2);
        deflexical("*DATE-P-GRAMMAR*", $list38);
        deflexical("*TIME-P-GRAMMAR*", $list39);
        defconstant("*BEGINNING-OF-TIME*", $BEGINNING_OF_TIME);
        defconstant("*END-OF-TIME*", $END_OF_TIME);
        deflexical("*DATE-UNITS-ORDERED*", $list44);
        deflexical("*DATE-FORMATS-ORDERED*", $list51);
        deflexical("*MONTH-CONSTANT-TABLE*", $list107);
        deflexical("*DAYS-OF-WEEK*", $list112);
        deflexical("*GREGORIAN-RATA-DIE*", $list118);
        deflexical("*HOURS-OF-DAY*", $list124);
        defparameter("*DURATION-DENOTING-FUNCTIONS-ORDERED*", $list156);
        defconstant("*U-DATE-YEAR-DIV*", $int$10000000000);
        deflexical("*TEMPORAL-INDEXICALS*", SubLTrampolineFile.maybeDefault($temporal_indexicals$, $temporal_indexicals$, $list162));
        defparameter("*INFERENCE-NOW*", NIL);
        defconstant("*START-OF-1970*", encode_universal_time(ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, ONE_INTEGER, ONE_INTEGER, $int$1970, UNPROVIDED));
        defparameter("*PARSE-TO-TWO-DIGIT-YEARS-IN-DATES?*", T);
        defparameter("*DATE-PATTERNS*", $list211);
        defparameter("*DATE-QUERY-PATTERNS*", $list212);
        defparameter("*DAY-WORDS*", NIL);
        defparameter("*DAY-WORD-PAIRS*", $list228);
        deflexical("*DAY-NAME-TOKENS*", $list243);
        deflexical("*TIME-ZONE-TOKENS*", $list244);
        deflexical("*COMMON-DATE-ENCODING-TEMPLATES*", $list282);
        return NIL;
    }

    public static SubLObject setup_date_utilities_file() {
        register_external_symbol(EXTRACT_DATE_YEAR);
        register_external_symbol(EXTRACT_DATE_MONTH_NUMBER);
        register_external_symbol(EXTRACT_DATE_DAY);
        register_external_symbol(EXTRACT_DATE_HOUR);
        register_external_symbol(EXTRACT_DATE_MINUTE);
        register_external_symbol(EXTRACT_DATE_SECOND);
        register_external_symbol(EXTRACT_DATE_MILLISECOND);
        memoization_state.note_memoized_function(INFERENCE_DEFINING_TIME_UNIT);
        memoization_state.note_memoized_function(INFERENCE_DEFINING_TIME_UNIT_GET_INTERVAL);
        declare_defglobal($temporal_indexicals$);
        memoization_state.note_memoized_function($sym226$YEAR_TOKEN_);
        memoization_state.note_memoized_function($sym227$DAY_TOKEN_);
        memoization_state.note_memoized_function($sym246$MONTH_NUMBER_TOKEN_);
        define_test_case_table_int(DATE_AFTER, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list304);
        define_test_case_table_int($sym305$PARSE_DATE_W_OUT_TWO_DIGIT_YEARS, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list306, $KB, $FULL, $WORKING_, T }), $list307);
        define_test_case_table_int(LEAP_YEAR_P, list(new SubLObject[]{ $TEST, symbol_function(EQ), $OWNER, NIL, $CLASSES, $list306, $KB, $FULL, $WORKING_, T }), $list309);
        define_test_case_table_int(DATE_P, list(new SubLObject[]{ $TEST, symbol_function(EQ), $OWNER, NIL, $CLASSES, $list306, $KB, $FULL, $WORKING_, T }), $list310);
        define_test_case_table_int(TIME_P, list(new SubLObject[]{ $TEST, symbol_function(EQ), $OWNER, NIL, $CLASSES, $list306, $KB, $FULL, $WORKING_, T }), $list311);
        define_test_case_table_int(DATE_PRECISION, list(new SubLObject[]{ $TEST, symbol_function(EQ), $OWNER, NIL, $CLASSES, $list306, $KB, $FULL, $WORKING_, T }), $list313);
        define_test_case_table_int(EXPLODE_CALENDAR_TIME, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list306, $KB, $FULL, $WORKING_, T }), $list315);
        define_test_case_table_int(CYCL_DATE_TO_UNIVERSAL_TIME, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list306, $KB, $FULL, $WORKING_, T }), $list317);
        define_test_case_table_int(MILLISECONDSTRING, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list306, $KB, $FULL, $WORKING_, T }), $list319);
        define_test_case_table_int(DATE_REDUCED_TO_START, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list306, $KB, $FULL, $WORKING_, T }), $list321);
        define_test_case_table_int(DATE_TO_PRECISION, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list306, $KB, $FULL, $WORKING_, T }), $list323);
        define_test_case_table_int(NEXT_ITERATED_CYCLIC_INTERVAL_INCLUSIVE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list306, $KB, $FULL, $WORKING_, T }), $list325);
        define_test_case_table_int(PARSE_DATE_FROM_STRING_FAST, list(new SubLObject[]{ $TEST, $sym327$FAST_SUPERSET_EQUAL_, $OWNER, NIL, $CLASSES, $list306, $KB, $FULL, $WORKING_, T }), $list328);
        define_test_case_table_int(DATE_QUERY_P, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list306, $KB, $FULL, $WORKING_, T }), $list330);
        return NIL;
    }

    private static SubLObject _constant_323_initializer() {
        return list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("SecondFn")), FIVE_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("HourFn")), THREE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))))), reader_make_constant_shell(makeString("CalendarSecond"))), list(reader_make_constant_shell(makeString("SecondFn")), FIVE_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("HourFn")), THREE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(list(list(reader_make_constant_shell(makeString("SecondFn")), FIVE_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("HourFn")), THREE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))))), reader_make_constant_shell(makeString("CalendarMinute"))), list(reader_make_constant_shell(makeString("MinuteFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("HourFn")), THREE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))))), list(list(list(reader_make_constant_shell(makeString("SecondFn")), FIVE_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("HourFn")), THREE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))))), reader_make_constant_shell(makeString("CalendarHour"))), list(reader_make_constant_shell(makeString("HourFn")), THREE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))), list(list(list(reader_make_constant_shell(makeString("SecondFn")), FIVE_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("HourFn")), THREE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))))), reader_make_constant_shell(makeString("CalendarDay"))), list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))), list(list(list(reader_make_constant_shell(makeString("SecondFn")), FIVE_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("HourFn")), THREE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))))), reader_make_constant_shell(makeString("CalendarMonth"))), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))), list(list(list(reader_make_constant_shell(makeString("SecondFn")), FIVE_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("HourFn")), THREE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))))), reader_make_constant_shell(makeString("CalendarYear"))), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))), list(list(list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)), reader_make_constant_shell(makeString("CalendarYear"))), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))), list(list(list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)), reader_make_constant_shell(makeString("CalendarMonth"))), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))), list(list(list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)), reader_make_constant_shell(makeString("CalendarDay"))), list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))), list(list(list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)), reader_make_constant_shell(makeString("CalendarHour"))), list(reader_make_constant_shell(makeString("HourFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))), list(list(list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)), reader_make_constant_shell(makeString("CalendarMinute"))), list(reader_make_constant_shell(makeString("MinuteFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("HourFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))))), list(list(list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)), reader_make_constant_shell(makeString("CalendarSecond"))), list(reader_make_constant_shell(makeString("SecondFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("HourFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(list(list(reader_make_constant_shell(makeString("HourFn")), THREE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))), reader_make_constant_shell(makeString("CalendarMinute"))), list(reader_make_constant_shell(makeString("MinuteFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("HourFn")), THREE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))))) });
    }

    private static SubLObject _constant_325_initializer() {
        return list(new SubLObject[]{ list(list(reader_make_constant_shell(makeString("CalendarSecond")), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("SecondFn")), NINE_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(list(reader_make_constant_shell(makeString("CalendarMinute")), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(43), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))))), list(list(reader_make_constant_shell(makeString("CalendarHour")), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("HourFn")), FOURTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))), list(list(reader_make_constant_shell(makeString("CalendarDay")), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("DayFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))), list(list(reader_make_constant_shell(makeString("CalendarMonth")), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("August")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))), list(list(reader_make_constant_shell(makeString("CalendarMonth")), list(reader_make_constant_shell(makeString("DayFn")), TWENTY_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1918))))), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1919)))), list(list(reader_make_constant_shell(makeString("CalendarYear")), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2005))), list(list(list(reader_make_constant_shell(makeString("TimeOfWeekFn")), reader_make_constant_shell(makeString("Thursday")), reader_make_constant_shell(makeString("TimeOfDay-4PM"))), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("HourFn")), SIXTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))), list(list(reader_make_constant_shell(makeString("Thursday")), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("DayFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))), list(list(list(reader_make_constant_shell(makeString("TimeOfYearFn")), reader_make_constant_shell(makeString("May")), list(reader_make_constant_shell(makeString("TimeOfMonthFn")), list(reader_make_constant_shell(makeString("DayOfMonthFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("TimeOfDayFn")), reader_make_constant_shell(makeString("TimeOfDay-4PM")), list(reader_make_constant_shell(makeString("TimeOfHourFn")), makeInteger(45), list(reader_make_constant_shell(makeString("SecondOfMinuteFn")), NINE_INTEGER))))), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), TEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("SecondFn")), NINE_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(45), list(reader_make_constant_shell(makeString("HourFn")), SIXTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("May")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2005)))))))), list(list(list(reader_make_constant_shell(makeString("SecondOfMinuteFn")), SEVEN_INTEGER), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("SecondFn")), SEVEN_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(43), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(list(list(reader_make_constant_shell(makeString("SecondOfMinuteFn")), NINE_INTEGER), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("SecondFn")), NINE_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(list(list(reader_make_constant_shell(makeString("MinuteOfHourFn")), makeInteger(40)), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(40), list(reader_make_constant_shell(makeString("HourFn")), FOURTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))))), list(list(list(reader_make_constant_shell(makeString("MinuteOfHourFn")), makeInteger(45)), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(45), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))))), list(list(list(reader_make_constant_shell(makeString("HourOfDayFn")), FOURTEEN_INTEGER), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("HourFn")), FOURTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))), list(list(list(reader_make_constant_shell(makeString("HourOfDayFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("HourFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))), list(list(list(reader_make_constant_shell(makeString("DayOfMonthFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), TEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("DayFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("August")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))), list(list(list(reader_make_constant_shell(makeString("DayOfYearFn")), reader_make_constant_shell(makeString("November")), TWO_INTEGER), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), TEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("DayFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("November")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))), list(list(reader_make_constant_shell(makeString("November")), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), TEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("November")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))), list(list(reader_make_constant_shell(makeString("Wednesday")), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), TEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("DayFn")), FOURTEEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))), list(list(list(reader_make_constant_shell(makeString("DayOfMonthFn")), TWO_INTEGER), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("DayFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))), list(list(list(reader_make_constant_shell(makeString("MonthOfYearFn")), FIVE_INTEGER), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("May")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2005)))), list(list(reader_make_constant_shell(makeString("TimeOfDay-4PM")), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("HourFn")), SIXTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))), list(list(reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2005)))), list(list(reader_make_constant_shell(makeString("August")), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("August")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))), list(list(reader_make_constant_shell(makeString("TimeOfDay-AM")), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("HourFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))), list(list(reader_make_constant_shell(makeString("TimeOfDay-PM")), list(reader_make_constant_shell(makeString("SecondFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(42), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))))), list(reader_make_constant_shell(makeString("HourFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))))) });
    }

    private static SubLObject _constant_328_initializer() {
        return list(new SubLObject[]{ list(list(makeString("2006-01-05 17:12:12.12")), list(list(reader_make_constant_shell(makeString("MilliSecondFn")), makeInteger(120), list(reader_make_constant_shell(makeString("SecondFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("HourFn")), SEVENTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), FIVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2006)))))))))), list(list(makeString("2006-01-05 17:12:12")), list(list(reader_make_constant_shell(makeString("SecondFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("HourFn")), SEVENTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), FIVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2006))))))))), list(list(makeString("2006-01-05 17:12")), list(list(reader_make_constant_shell(makeString("MinuteFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("HourFn")), SEVENTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), FIVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2006)))))))), list(list(makeString("2006-01-05 17")), list(list(reader_make_constant_shell(makeString("HourFn")), SEVENTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), FIVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2006))))))), list(list(makeString("2006-01-05")), list(list(reader_make_constant_shell(makeString("DayFn")), FIVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2006)))))), list(list(makeString("2006-01")), list(list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2006))))), list(list(makeString("2006")), list(list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2006)))), list(list(makeString("2009-09-30")), list(list(reader_make_constant_shell(makeString("DayFn")), makeInteger(30), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("September")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2009)))))), list(list(makeString("09/09/2008")), list(list(reader_make_constant_shell(makeString("DayFn")), NINE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("September")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2008)))))), list(list(makeString("2003-07-15 17:10:20")), list(list(reader_make_constant_shell(makeString("SecondFn")), TWENTY_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), TEN_INTEGER, list(reader_make_constant_shell(makeString("HourFn")), SEVENTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), FIFTEEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("July")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003))))))))), list(list(makeString("04/1960")), list(list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("April")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1960))))), list(list(makeString("1960")), list(list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1960)))), list(list(makeString("12-15-2003")), list(list(reader_make_constant_shell(makeString("DayFn")), FIFTEEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003)))))), list(list(makeString("12:34:56, 12-15-2003")), list(list(reader_make_constant_shell(makeString("SecondFn")), makeInteger(56), list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(34), list(reader_make_constant_shell(makeString("HourFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), FIFTEEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003))))))))), list(list(makeString("12:34, 12-15-2003")), list(list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(34), list(reader_make_constant_shell(makeString("HourFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), FIFTEEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003)))))))), list(list(makeString("15-12-2003")), list(list(reader_make_constant_shell(makeString("DayFn")), FIFTEEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003)))))), list(list(makeString("2003-12-15")), list(list(reader_make_constant_shell(makeString("DayFn")), FIFTEEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003)))))), list(list(makeString("12.15.2003")), list(list(reader_make_constant_shell(makeString("DayFn")), FIFTEEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003)))))), list(list(makeString("15.12.2003")), list(list(reader_make_constant_shell(makeString("DayFn")), FIFTEEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003)))))), list(list(makeString("2005-06-07"), T), list(list(reader_make_constant_shell(makeString("DayFn")), SEVEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("June")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2005)))))), list(list(makeString("12-3-2003"), T), list(list(reader_make_constant_shell(makeString("DayFn")), THREE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003)))))), list(list(makeString("12-3-2003"), NIL), list(list(reader_make_constant_shell(makeString("DayFn")), THREE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003)))), list(reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("March")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003)))))), list(list(makeString("12/15/2003")), list(list(reader_make_constant_shell(makeString("DayFn")), FIFTEEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003)))))), list(list(makeString("12-3-25"), NIL), list(list(reader_make_constant_shell(makeString("DayFn")), makeInteger(25), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("March")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2012)))), list(reader_make_constant_shell(makeString("DayFn")), makeInteger(25), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("March")), list(reader_make_constant_shell(makeString("YearFn")), TWELVE_INTEGER))), list(reader_make_constant_shell(makeString("DayFn")), THREE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2025)))), list(reader_make_constant_shell(makeString("DayFn")), THREE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1925)))), list(reader_make_constant_shell(makeString("DayFn")), THREE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(25)))), list(reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("March")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2025)))), list(reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("March")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1925)))), list(reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("March")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(25)))))), list(list(makeString("12-3-01"), NIL), list(list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("March")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2012)))), list(reader_make_constant_shell(makeString("DayFn")), THREE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2001)))), list(reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("March")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2001)))))), list(list(makeString("12-3-01"), NIL, T), list(list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("March")), list(reader_make_constant_shell(makeString("YearFn")), TWELVE_INTEGER))), list(reader_make_constant_shell(makeString("DayFn")), THREE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), ONE_INTEGER))), list(reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("March")), list(reader_make_constant_shell(makeString("YearFn")), ONE_INTEGER))))), list(list(makeString("11:01:22, December 2, 2003")), list(list(reader_make_constant_shell(makeString("SecondFn")), makeInteger(22), list(reader_make_constant_shell(makeString("MinuteFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("HourFn")), ELEVEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003))))))))), list(list(makeString("11:01:22, 2 December, 2003")), list(list(reader_make_constant_shell(makeString("SecondFn")), makeInteger(22), list(reader_make_constant_shell(makeString("MinuteFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("HourFn")), ELEVEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003))))))))), list(list(makeString("December, 2003")), list(list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003))))), list(list(makeString("December 2003")), list(list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003))))), list(list(makeString("Dec-15-2003")), list(list(reader_make_constant_shell(makeString("DayFn")), FIFTEEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003)))))), list(list(makeString("Dec. 15th, 2003")), list(list(reader_make_constant_shell(makeString("DayFn")), FIFTEEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003)))))), list(list(makeString("December 15, 2003")), list(list(reader_make_constant_shell(makeString("DayFn")), FIFTEEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003)))))), list(list(makeString("15 December, 2003")), list(list(reader_make_constant_shell(makeString("DayFn")), FIFTEEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003)))))), list(list(makeString("15 December 2003")), list(list(reader_make_constant_shell(makeString("DayFn")), FIFTEEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003)))))), list(list(makeString("15th December 2003")), list(list(reader_make_constant_shell(makeString("DayFn")), FIFTEEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003)))))), list(list(makeString("15-Dec-2003")), list(list(reader_make_constant_shell(makeString("DayFn")), FIFTEEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003)))))), list(list(makeString("Thu,  5 Aug 2010 13:53:00 -0500")), list(list(reader_make_constant_shell(makeString("SecondFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(53), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), FIVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("August")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2010))))))))), list(list(makeString("December 15")), list(list(reader_make_constant_shell(makeString("DayFn")), FIFTEEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), reader_make_constant_shell(makeString("TheYear-Indexical")))))), list(list(makeString("12/15")), list(list(reader_make_constant_shell(makeString("DayFn")), FIFTEEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), reader_make_constant_shell(makeString("TheYear-Indexical")))))) });
    }

    @Override
    public void declareFunctions() {
        declare_date_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_date_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_date_utilities_file();
    }

    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        // 0: ldc_w Lcom/cyc/cycjava/cycl/date_utilities;.class
        // 3: invokevirtual java/lang/Class.desiredAssertionStatus:()Z
        // 6: ifne 13
        // 9: iconst_1
        // 10: goto 14
        // 13: iconst_0
        // 14: putstatic com/cyc/cycjava/cycl/assertionsDisabledSynth:Z
        // 17: new Lcom/cyc/cycjava/cycl/date_utilities;
        // 20: dup
        // 21: invokespecial com/cyc/cycjava/cycl/<init>:()V
        // 24: putstatic com/cyc/cycjava/cycl/me:Lcom/cyc/tool/subl/util/SubLFile;
        // 27: aconst_null
        // 28: putstatic
        // com/cyc/cycjava/cycl/$date_core_constants$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 31: aconst_null
        // 32: putstatic
        // com/cyc/cycjava/cycl/$el_date_granularity_order$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 35: aconst_null
        // 36: putstatic
        // com/cyc/cycjava/cycl/$date_p_grammar$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 39: aconst_null
        // 40: putstatic
        // com/cyc/cycjava/cycl/$time_p_grammar$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 43: aconst_null
        // 44: putstatic
        // com/cyc/cycjava/cycl/$beginning_of_time$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 47: aconst_null
        // 48: putstatic
        // com/cyc/cycjava/cycl/$end_of_time$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 51: aconst_null
        // 52: putstatic
        // com/cyc/cycjava/cycl/$date_units_ordered$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 55: aconst_null
        // 56: putstatic
        // com/cyc/cycjava/cycl/$date_formats_ordered$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 59: aconst_null
        // 60: putstatic
        // com/cyc/cycjava/cycl/$month_constant_table$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 63: aconst_null
        // 64: putstatic
        // com/cyc/cycjava/cycl/$days_of_week$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 67: aconst_null
        // 68: putstatic
        // com/cyc/cycjava/cycl/$gregorian_rata_die$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 71: aconst_null
        // 72: putstatic
        // com/cyc/cycjava/cycl/$hours_of_day$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 75: aconst_null
        // 76: putstatic
        // com/cyc/cycjava/cycl/$duration_denoting_functions_ordered$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 79: aconst_null
        // 80: putstatic
        // com/cyc/cycjava/cycl/$u_date_year_div$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 83: aconst_null
        // 84: putstatic
        // com/cyc/cycjava/cycl/$temporal_indexicals$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 87: aconst_null
        // 88: putstatic
        // com/cyc/cycjava/cycl/$inference_now$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 91: aconst_null
        // 92: putstatic
        // com/cyc/cycjava/cycl/$start_of_1970$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 95: aconst_null
        // 96: putstatic
        // com/cyc/cycjava/cycl/$parse_to_two_digit_years_in_datesP$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 99: aconst_null
        // 100: putstatic
        // com/cyc/cycjava/cycl/$date_patterns$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 103: aconst_null
        // 104: putstatic
        // com/cyc/cycjava/cycl/$date_query_patterns$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 107: aconst_null
        // 108: putstatic
        // com/cyc/cycjava/cycl/$day_words$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 111: aconst_null
        // 112: putstatic
        // com/cyc/cycjava/cycl/$day_word_pairs$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 115: aconst_null
        // 116: putstatic
        // com/cyc/cycjava/cycl/$day_name_tokens$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 119: aconst_null
        // 120: putstatic
        // com/cyc/cycjava/cycl/$time_zone_tokens$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 123: aconst_null
        // 124: putstatic
        // com/cyc/cycjava/cycl/$common_date_encoding_templates$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 127: bipush 26
        // 129: anewarray Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 132: dup
        // 133: iconst_0
        // 134: ldc_w "MilliSecondFn"
        // 137: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 140: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 143: aastore
        // 144: dup
        // 145: iconst_1
        // 146: ldc_w "SecondFn"
        // 149: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 152: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 155: aastore
        // 156: dup
        // 157: iconst_2
        // 158: ldc_w "MinuteFn"
        // 161: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 164: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 167: aastore
        // 168: dup
        // 169: iconst_3
        // 170: ldc_w "HourFn"
        // 173: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 176: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 179: aastore
        // 180: dup
        // 181: iconst_4
        // 182: ldc_w "DayFn"
        // 185: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 188: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 191: aastore
        // 192: dup
        // 193: iconst_5
        // 194: ldc_w "MonthFn"
        // 197: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 200: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 203: aastore
        // 204: dup
        // 205: bipush 6
        // 207: ldc_w "YearFn"
        // 210: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 213: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 216: aastore
        // 217: dup
        // 218: bipush 7
        // 220: ldc_w "January"
        // 223: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 226: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 229: aastore
        // 230: dup
        // 231: bipush 8
        // 233: ldc_w "February"
        // 236: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 239: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 242: aastore
        // 243: dup
        // 244: bipush 9
        // 246: ldc_w "March"
        // 249: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 252: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 255: aastore
        // 256: dup
        // 257: bipush 10
        // 259: ldc_w "April"
        // 262: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 265: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 268: aastore
        // 269: dup
        // 270: bipush 11
        // 272: ldc_w "May"
        // 275: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 278: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 281: aastore
        // 282: dup
        // 283: bipush 12
        // 285: ldc_w "June"
        // 288: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 291: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 294: aastore
        // 295: dup
        // 296: bipush 13
        // 298: ldc_w "July"
        // 301: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 304: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 307: aastore
        // 308: dup
        // 309: bipush 14
        // 311: ldc_w "August"
        // 314: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 317: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 320: aastore
        // 321: dup
        // 322: bipush 15
        // 324: ldc_w "September"
        // 327: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 330: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 333: aastore
        // 334: dup
        // 335: bipush 16
        // 337: ldc_w "October"
        // 340: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 343: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 346: aastore
        // 347: dup
        // 348: bipush 17
        // 350: ldc_w "November"
        // 353: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 356: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 359: aastore
        // 360: dup
        // 361: bipush 18
        // 363: ldc_w "December"
        // 366: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 369: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 372: aastore
        // 373: dup
        // 374: bipush 19
        // 376: ldc_w "definingTimeUnit"
        // 379: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 382: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 385: aastore
        // 386: dup
        // 387: bipush 20
        // 389: ldc_w "DaysDuration"
        // 392: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 395: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 398: aastore
        // 399: dup
        // 400: bipush 21
        // 402: ldc_w "MonthsDuration"
        // 405: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 408: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 411: aastore
        // 412: dup
        // 413: bipush 22
        // 415: ldc_w "YearsDuration"
        // 418: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 421: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 424: aastore
        // 425: dup
        // 426: bipush 23
        // 428: ldc_w "CalendarDay"
        // 431: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 434: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 437: aastore
        // 438: dup
        // 439: bipush 24
        // 441: ldc_w "CalendarMonth"
        // 444: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 447: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 450: aastore
        // 451: dup
        // 452: bipush 25
        // 454: ldc_w "CalendarYear"
        // 457: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 460: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 463: aastore
        // 464: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:([Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 467: putstatic
        // com/cyc/cycjava/cycl/$list0:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 470: ldc_w "VALID-CONSTANT?"
        // 473: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 476: putstatic
        // com/cyc/cycjava/cycl/$sym1$VALID_CONSTANT_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 479: ldc_w "MilliSecondFn"
        // 482: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 485: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 488: ldc_w "SecondFn"
        // 491: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 494: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 497: ldc_w "MinuteFn"
        // 500: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 503: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 506: ldc_w "HourFn"
        // 509: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 512: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 515: ldc_w "DayFn"
        // 518: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 521: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 524: ldc_w "MonthFn"
        // 527: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 530: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 533: ldc_w "YearFn"
        // 536: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 539: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 542: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 545: putstatic
        // com/cyc/cycjava/cycl/$list2:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 548: ldc_w "MilliSecondFn"
        // 551: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 554: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 557: putstatic
        // com/cyc/cycjava/cycl/$const3$MilliSecondFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 560: ldc_w "SecondFn"
        // 563: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 566: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 569: putstatic
        // com/cyc/cycjava/cycl/$const4$SecondFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 572: ldc_w "MinuteFn"
        // 575: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 578: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 581: putstatic
        // com/cyc/cycjava/cycl/$const5$MinuteFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 584: ldc_w "HourFn"
        // 587: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 590: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 593: putstatic
        // com/cyc/cycjava/cycl/$const6$HourFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 596: ldc_w "DayFn"
        // 599: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 602: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 605: putstatic
        // com/cyc/cycjava/cycl/$const7$DayFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 608: ldc_w "MonthFn"
        // 611: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 614: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 617: putstatic
        // com/cyc/cycjava/cycl/$const8$MonthFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 620: ldc_w "YearFn"
        // 623: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 626: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 629: putstatic
        // com/cyc/cycjava/cycl/$const9$YearFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 632: ldc_w "RESULT-VAR"
        // 635: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 638: ldc_w "EARLY-VAR"
        // 641: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 644: ldc_w "LATER-VAR"
        // 647: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 650: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 653: ldc_w "VALIDATOR"
        // 656: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 659: ldc_w "DIRECT-COMPARATOR"
        // 662: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 665: ldc_w "SUB-COMPARATOR"
        // 668: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 671: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 674: putstatic
        // com/cyc/cycjava/cycl/$list10:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 677: ldc_w "SUB-EARLY"
        // 680: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeUninternedSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 683: putstatic
        // com/cyc/cycjava/cycl/$sym11$SUB_EARLY:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 686: ldc_w "SUB-LATER"
        // 689: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeUninternedSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 692: putstatic
        // com/cyc/cycjava/cycl/$sym12$SUB_LATER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 695: ldc_w "SUB-COMPARE"
        // 698: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeUninternedSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 701: putstatic
        // com/cyc/cycjava/cycl/$sym13$SUB_COMPARE:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 704: ldc_w "PROGN"
        // 707: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 710: putstatic
        // com/cyc/cycjava/cycl/$sym14$PROGN:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 713: ldc_w "ENFORCE-TYPE"
        // 716: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 719: putstatic
        // com/cyc/cycjava/cycl/$sym15$ENFORCE_TYPE:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 722: ldc_w "CLET"
        // 725: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 728: putstatic
        // com/cyc/cycjava/cycl/$sym16$CLET:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 731: ldc_w "EL-FORMULA-ARG2"
        // 734: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 737: putstatic
        // com/cyc/cycjava/cycl/$sym17$EL_FORMULA_ARG2:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 740: ldc_w "PCASE"
        // 743: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 746: putstatic
        // com/cyc/cycjava/cycl/$sym18$PCASE:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 749: ldc_w "LT"
        // 752: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 755: ldc_w "GT"
        // 758: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 761: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 764: putstatic
        // com/cyc/cycjava/cycl/$list19:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 767: ldc_w "CSETQ"
        // 770: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 773: putstatic
        // com/cyc/cycjava/cycl/$sym20$CSETQ:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 776: ldc_w "EQ"
        // 779: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 782: putstatic
        // com/cyc/cycjava/cycl/$kw21$EQ:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 785: ldc_w "EL-FORMULA-ARG1"
        // 788: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 791: putstatic
        // com/cyc/cycjava/cycl/$sym22$EL_FORMULA_ARG1:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 794: ldc_w "POSSIBLY-EL-TIME-MILLISECOND-P"
        // 797: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 800: putstatic
        // com/cyc/cycjava/cycl/$sym23$POSSIBLY_EL_TIME_MILLISECOND_P:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 803: ldc_w "LT"
        // 806: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 809: putstatic
        // com/cyc/cycjava/cycl/$kw24$LT:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 812: ldc_w "GT"
        // 815: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 818: putstatic
        // com/cyc/cycjava/cycl/$kw25$GT:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 821: ldc_w "POSSIBLY-EL-TIME-SECOND-P"
        // 824: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 827: putstatic
        // com/cyc/cycjava/cycl/$sym26$POSSIBLY_EL_TIME_SECOND_P:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 830: ldc_w "POSSIBLY-EL-TIME-MINUTE-P"
        // 833: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 836: putstatic
        // com/cyc/cycjava/cycl/$sym27$POSSIBLY_EL_TIME_MINUTE_P:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 839: ldc_w "POSSIBLY-EL-TIME-HOUR-P"
        // 842: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 845: putstatic
        // com/cyc/cycjava/cycl/$sym28$POSSIBLY_EL_TIME_HOUR_P:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 848: ldc_w "POSSIBLY-EL-DATE-DAY-P"
        // 851: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 854: putstatic
        // com/cyc/cycjava/cycl/$sym29$POSSIBLY_EL_DATE_DAY_P:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 857: ldc_w "POSSIBLY-EL-DATE-MONTH-P"
        // 860: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 863: putstatic
        // com/cyc/cycjava/cycl/$sym30$POSSIBLY_EL_DATE_MONTH_P:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 866: ldc_w "POSSIBLY-EL-DATE-YEAR-P"
        // 869: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 872: putstatic
        // com/cyc/cycjava/cycl/$sym31$POSSIBLY_EL_DATE_YEAR_P:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 875: ldc_w "KBEQ"
        // 878: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 881: putstatic
        // com/cyc/cycjava/cycl/$sym32$KBEQ:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 884: ldc_w "unhandled date type: ~S"
        // 887: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 890: putstatic
        // com/cyc/cycjava/cycl/$str33$unhandled_date_type___S:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 893: ldc_w "AND"
        // 896: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 899: putstatic
        // com/cyc/cycjava/cycl/$kw34$AND:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 902: ldc_w "EL-VARIABLE"
        // 905: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 908: putstatic
        // com/cyc/cycjava/cycl/$kw35$EL_VARIABLE:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 911: ldc_w "ANYTHING"
        // 914: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 917: putstatic
        // com/cyc/cycjava/cycl/$kw36$ANYTHING:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 920: ldc_w "PATTERN-MATCHES-FORMULA-WITHOUT-BINDINGS"
        // 923: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 926: putstatic
        // com/cyc/cycjava/cycl/$sym37$PATTERN_MATCHES_FORMULA_WITHOUT_BINDINGS:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 929: bipush 13
        // 931: anewarray Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 934: dup
        // 935: iconst_0
        // 936: ldc_w "OR"
        // 939: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 942: aastore
        // 943: dup
        // 944: iconst_1
        // 945: ldc_w "YearFn"
        // 948: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 951: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 954: ldc_w "INTEGER"
        // 957: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 960: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 963: aastore
        // 964: dup
        // 965: iconst_2
        // 966: ldc_w "TheYear-Indexical"
        // 969: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 972: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 975: aastore
        // 976: dup
        // 977: iconst_3
        // 978: ldc_w "MonthFn"
        // 981: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 984: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 987: ldc_w "FORT"
        // 990: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 993: ldc_w "AND"
        // 996: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 999: ldc_w "YearFn"
        // 1002: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1005: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1008: ldc_w "ANYTHING"
        // 1011: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1014: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        // 1017: ldc_w "TEST"
        // 1020: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1023: ldc_w "DATE-P-INTERNAL"
        // 1026: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1029: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1032: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1035: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1038: aastore
        // 1039: dup
        // 1040: iconst_4
        // 1041: ldc_w "MonthFn"
        // 1044: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1047: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1050: ldc_w "FORT"
        // 1053: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1056: ldc_w "AND"
        // 1059: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1062: ldc_w "TheYear-Indexical"
        // 1065: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1068: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1071: ldc_w "TEST"
        // 1074: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1077: ldc_w "DATE-P-INTERNAL"
        // 1080: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1083: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1086: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1089: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1092: aastore
        // 1093: dup
        // 1094: iconst_5
        // 1095: ldc_w "DayFn"
        // 1098: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1101: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1104: ldc_w "TEST"
        // 1107: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1110: ldc_w "NUMBER-IN-RANGE-P"
        // 1113: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1116: getstatic
        // com/cyc/cycjava/cycl/ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 1119: bipush 31
        // 1121: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 1124: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1127: ldc_w "AND"
        // 1130: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1133: ldc_w "MonthFn"
        // 1136: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1139: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1142: ldc_w "ANYTHING"
        // 1145: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1148: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        // 1151: ldc_w "TEST"
        // 1154: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1157: ldc_w "DATE-P-INTERNAL"
        // 1160: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1163: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1166: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1169: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1172: aastore
        // 1173: dup
        // 1174: bipush 6
        // 1176: ldc_w "HourFn"
        // 1179: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1182: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1185: ldc_w "TEST"
        // 1188: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1191: ldc_w "NUMBER-IN-RANGE-P"
        // 1194: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1197: getstatic
        // com/cyc/cycjava/cycl/ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 1200: bipush 23
        // 1202: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 1205: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1208: ldc_w "AND"
        // 1211: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1214: ldc_w "DayFn"
        // 1217: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1220: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1223: ldc_w "ANYTHING"
        // 1226: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1229: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        // 1232: ldc_w "TEST"
        // 1235: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1238: ldc_w "DATE-P-INTERNAL"
        // 1241: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1244: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1247: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1250: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1253: aastore
        // 1254: dup
        // 1255: bipush 7
        // 1257: ldc_w "MinuteFn"
        // 1260: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1263: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1266: ldc_w "TEST"
        // 1269: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1272: ldc_w "NUMBER-IN-RANGE-P"
        // 1275: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1278: getstatic
        // com/cyc/cycjava/cycl/ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 1281: bipush 59
        // 1283: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 1286: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1289: ldc_w "AND"
        // 1292: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1295: ldc_w "HourFn"
        // 1298: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1301: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1304: ldc_w "ANYTHING"
        // 1307: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1310: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        // 1313: ldc_w "TEST"
        // 1316: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1319: ldc_w "DATE-P-INTERNAL"
        // 1322: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1325: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1328: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1331: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1334: aastore
        // 1335: dup
        // 1336: bipush 8
        // 1338: ldc_w "SecondFn"
        // 1341: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1344: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1347: ldc_w "TEST"
        // 1350: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1353: ldc_w "NUMBER-IN-RANGE-P"
        // 1356: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1359: getstatic
        // com/cyc/cycjava/cycl/ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 1362: bipush 59
        // 1364: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 1367: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1370: ldc_w "AND"
        // 1373: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1376: ldc_w "MinuteFn"
        // 1379: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1382: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1385: ldc_w "ANYTHING"
        // 1388: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1391: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        // 1394: ldc_w "TEST"
        // 1397: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1400: ldc_w "DATE-P-INTERNAL"
        // 1403: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1406: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1409: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1412: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1415: aastore
        // 1416: dup
        // 1417: bipush 9
        // 1419: ldc_w "MilliSecondFn"
        // 1422: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1425: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1428: ldc_w "TEST"
        // 1431: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1434: ldc_w "NUMBER-IN-RANGE-P"
        // 1437: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1440: getstatic
        // com/cyc/cycjava/cycl/ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 1443: sipush 999
        // 1446: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 1449: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1452: ldc_w "AND"
        // 1455: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1458: ldc_w "SecondFn"
        // 1461: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1464: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1467: ldc_w "ANYTHING"
        // 1470: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1473: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        // 1476: ldc_w "TEST"
        // 1479: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1482: ldc_w "DATE-P-INTERNAL"
        // 1485: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1488: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1491: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1494: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1497: aastore
        // 1498: dup
        // 1499: bipush 10
        // 1501: ldc_w "DecadeFn"
        // 1504: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1507: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1510: ldc_w "TEST"
        // 1513: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1516: ldc_w "NON-NEGATIVE-INTEGER-P"
        // 1519: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1522: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1525: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1528: aastore
        // 1529: dup
        // 1530: bipush 11
        // 1532: ldc_w "CenturyFn"
        // 1535: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1538: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1541: ldc_w "INTEGER"
        // 1544: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1547: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1550: aastore
        // 1551: dup
        // 1552: bipush 12
        // 1554: ldc_w "QuarterFn"
        // 1557: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1560: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1563: ldc_w "INTEGER"
        // 1566: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1569: ldc_w "AND"
        // 1572: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1575: ldc_w "YearFn"
        // 1578: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1581: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1584: ldc_w "ANYTHING"
        // 1587: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1590: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        // 1593: ldc_w "TEST"
        // 1596: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1599: ldc_w "DATE-P-INTERNAL"
        // 1602: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1605: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1608: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1611: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1614: aastore
        // 1615: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:([Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1618: putstatic
        // com/cyc/cycjava/cycl/$list38:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1621: ldc_w "OR"
        // 1624: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1627: ldc_w "HourFn"
        // 1630: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1633: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1636: ldc_w "TEST"
        // 1639: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1642: ldc_w "NUMBER-IN-RANGE-P"
        // 1645: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1648: getstatic
        // com/cyc/cycjava/cycl/ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 1651: bipush 23
        // 1653: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 1656: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1659: ldc_w "TEST"
        // 1662: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1665: ldc_w "DAY-FOR-TIME-P-P"
        // 1668: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1671: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1674: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1677: ldc_w "MinuteFn"
        // 1680: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1683: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1686: ldc_w "TEST"
        // 1689: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1692: ldc_w "NUMBER-IN-RANGE-P"
        // 1695: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1698: getstatic
        // com/cyc/cycjava/cycl/ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 1701: bipush 59
        // 1703: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 1706: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1709: ldc_w "AND"
        // 1712: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1715: ldc_w "HourFn"
        // 1718: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1721: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1724: ldc_w "ANYTHING"
        // 1727: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1730: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        // 1733: ldc_w "TEST"
        // 1736: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1739: ldc_w "TIME-P-INTERNAL"
        // 1742: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1745: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1748: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1751: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1754: ldc_w "SecondFn"
        // 1757: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1760: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1763: ldc_w "TEST"
        // 1766: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1769: ldc_w "NUMBER-IN-RANGE-P"
        // 1772: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1775: getstatic
        // com/cyc/cycjava/cycl/ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 1778: bipush 59
        // 1780: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 1783: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1786: ldc_w "AND"
        // 1789: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1792: ldc_w "MinuteFn"
        // 1795: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1798: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1801: ldc_w "ANYTHING"
        // 1804: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1807: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        // 1810: ldc_w "TEST"
        // 1813: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1816: ldc_w "TIME-P-INTERNAL"
        // 1819: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1822: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1825: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1828: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1831: ldc_w "MilliSecondFn"
        // 1834: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1837: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1840: ldc_w "TEST"
        // 1843: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1846: ldc_w "NUMBER-IN-RANGE-P"
        // 1849: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1852: getstatic
        // com/cyc/cycjava/cycl/ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 1855: sipush 999
        // 1858: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 1861: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1864: ldc_w "AND"
        // 1867: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1870: ldc_w "SecondFn"
        // 1873: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1876: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1879: ldc_w "ANYTHING"
        // 1882: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1885: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.cons:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCons;
        // 1888: ldc_w "TEST"
        // 1891: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1894: ldc_w "TIME-P-INTERNAL"
        // 1897: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1900: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1903: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1906: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1909: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1912: putstatic
        // com/cyc/cycjava/cycl/$list39:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 1915: ldc_w "BEGINNING-OF-TIME"
        // 1918: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1921: putstatic
        // com/cyc/cycjava/cycl/$kw40$BEGINNING_OF_TIME:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1924: ldc_w "END-OF-TIME"
        // 1927: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1930: putstatic
        // com/cyc/cycjava/cycl/$kw41$END_OF_TIME:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 1933: ldc_w "Always-TimeInterval"
        // 1936: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1939: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1942: putstatic
        // com/cyc/cycjava/cycl/$const42$Always_TimeInterval:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1945: ldc_w "TheEmptyTimeInterval"
        // 1948: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1951: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1954: putstatic
        // com/cyc/cycjava/cycl/$const43$TheEmptyTimeInterval:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1957: ldc_w "CalendarSecond"
        // 1960: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1963: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1966: ldc_w "CalendarMinute"
        // 1969: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1972: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1975: ldc_w "CalendarHour"
        // 1978: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1981: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1984: ldc_w "CalendarDay"
        // 1987: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1990: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 1993: ldc_w "CalendarMonth"
        // 1996: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 1999: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2002: ldc_w "CalendarYear"
        // 2005: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2008: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2011: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 2014: putstatic
        // com/cyc/cycjava/cycl/$list44:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 2017: ldc_w "TIME-TYPE-VAR"
        // 2020: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2023: ldc_w "&KEY"
        // 2026: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2029: ldc_w "DONE?"
        // 2032: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2035: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 2038: ldc_w "&BODY"
        // 2041: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2044: ldc_w "BODY"
        // 2047: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2050: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 2053: putstatic
        // com/cyc/cycjava/cycl/$list45:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 2056: ldc_w "DONE?"
        // 2059: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2062: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 2065: putstatic
        // com/cyc/cycjava/cycl/$list46:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 2068: ldc_w "ALLOW-OTHER-KEYS"
        // 2071: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2074: putstatic
        // com/cyc/cycjava/cycl/$kw47$ALLOW_OTHER_KEYS:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2077: ldc_w "DONE?"
        // 2080: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2083: putstatic
        // com/cyc/cycjava/cycl/$kw48$DONE_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2086: ldc_w "CSOME"
        // 2089: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2092: putstatic
        // com/cyc/cycjava/cycl/$sym49$CSOME:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2095: ldc_w "*DATE-UNITS-ORDERED*"
        // 2098: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2101: putstatic
        // com/cyc/cycjava/cycl/$sym50$_DATE_UNITS_ORDERED_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2104: ldc_w "CALENDAR"
        // 2107: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2110: ldc_w "QUARTER"
        // 2113: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2116: ldc_w "DECADE"
        // 2119: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2122: ldc_w "CENTURY"
        // 2125: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2128: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 2131: putstatic
        // com/cyc/cycjava/cycl/$list51:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 2134: ldc_w "CENTURY"
        // 2137: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2140: putstatic
        // com/cyc/cycjava/cycl/$kw52$CENTURY:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2143: ldc_w "DECADE"
        // 2146: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2149: putstatic
        // com/cyc/cycjava/cycl/$kw53$DECADE:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2152: ldc_w "EXTRACT-DATE-YEAR"
        // 2155: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2158: putstatic
        // com/cyc/cycjava/cycl/$sym54$EXTRACT_DATE_YEAR:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2161: ldc_w "QUARTER"
        // 2164: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2167: putstatic
        // com/cyc/cycjava/cycl/$kw55$QUARTER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2170: ldc_w "EXTRACT-DATE-MONTH-NUMBER"
        // 2173: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2176: putstatic
        // com/cyc/cycjava/cycl/$sym56$EXTRACT_DATE_MONTH_NUMBER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2179: ldc_w "EXTRACT-DATE-DAY"
        // 2182: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2185: putstatic
        // com/cyc/cycjava/cycl/$sym57$EXTRACT_DATE_DAY:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2188: ldc_w "EXTRACT-DATE-HOUR"
        // 2191: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2194: putstatic
        // com/cyc/cycjava/cycl/$sym58$EXTRACT_DATE_HOUR:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2197: ldc_w "EXTRACT-DATE-MINUTE"
        // 2200: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2203: putstatic
        // com/cyc/cycjava/cycl/$sym59$EXTRACT_DATE_MINUTE:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2206: ldc_w "EXTRACT-DATE-SECOND"
        // 2209: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2212: putstatic
        // com/cyc/cycjava/cycl/$sym60$EXTRACT_DATE_SECOND:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2215: ldc_w "EXTRACT-DATE-MILLISECOND"
        // 2218: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2221: putstatic
        // com/cyc/cycjava/cycl/$sym61$EXTRACT_DATE_MILLISECOND:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2224: ldc_w "TIME-P"
        // 2227: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2230: putstatic
        // com/cyc/cycjava/cycl/$sym62$TIME_P:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2233: ldc_w "CalendarMilliSecond"
        // 2236: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2239: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2242: putstatic
        // com/cyc/cycjava/cycl/$const63$CalendarMilliSecond:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2245: ldc_w "CalendarSecond"
        // 2248: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2251: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2254: putstatic
        // com/cyc/cycjava/cycl/$const64$CalendarSecond:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2257: ldc_w "CalendarMinute"
        // 2260: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2263: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2266: putstatic
        // com/cyc/cycjava/cycl/$const65$CalendarMinute:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2269: ldc_w "CalendarHour"
        // 2272: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2275: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2278: putstatic
        // com/cyc/cycjava/cycl/$const66$CalendarHour:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2281: ldc_w "CalendarDay"
        // 2284: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2287: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2290: putstatic
        // com/cyc/cycjava/cycl/$const67$CalendarDay:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2293: ldc_w "CalendarMonth"
        // 2296: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2299: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2302: putstatic
        // com/cyc/cycjava/cycl/$const68$CalendarMonth:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2305: ldc_w "CalendarYear"
        // 2308: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2311: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2314: putstatic
        // com/cyc/cycjava/cycl/$const69$CalendarYear:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2317: ldc_w "~a is not a valid date."
        // 2320: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2323: putstatic
        // com/cyc/cycjava/cycl/$str70$_a_is_not_a_valid_date_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2326: ldc_w "CALENDAR"
        // 2329: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2332: putstatic
        // com/cyc/cycjava/cycl/$kw71$CALENDAR:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2335: ldc_w "Can't handle a date of ~S yet"
        // 2338: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2341: putstatic
        // com/cyc/cycjava/cycl/$str72$Can_t_handle_a_date_of__S_yet:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2344: ldc_w "QuarterFn"
        // 2347: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2350: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2353: putstatic
        // com/cyc/cycjava/cycl/$const73$QuarterFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2356: ldc_w "DecadeFn"
        // 2359: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2362: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2365: putstatic
        // com/cyc/cycjava/cycl/$const74$DecadeFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2368: ldc_w "CenturyFn"
        // 2371: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2374: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2377: putstatic
        // com/cyc/cycjava/cycl/$const75$CenturyFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2380: ldc_w "~a is not a valid time"
        // 2383: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2386: putstatic
        // com/cyc/cycjava/cycl/$str76$_a_is_not_a_valid_time:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2389: ldc_w "INDEXICAL-YEAR"
        // 2392: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2395: putstatic
        // com/cyc/cycjava/cycl/$kw77$INDEXICAL_YEAR:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2398: ldc_w "TheYear-Indexical"
        // 2401: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2404: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2407: putstatic
        // com/cyc/cycjava/cycl/$const78$TheYear_Indexical:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2410: ldc_w "START"
        // 2413: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2416: putstatic
        // com/cyc/cycjava/cycl/$kw79$START:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2419: ldc_w "END"
        // 2422: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2425: putstatic
        // com/cyc/cycjava/cycl/$kw80$END:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2428: bipush 100
        // 2430: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 2433: putstatic
        // com/cyc/cycjava/cycl/$int81$100:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 2436: ldc_w "Can't attach month ~S to date ~S"
        // 2439: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2442: putstatic
        // com/cyc/cycjava/cycl/$str82$Can_t_attach_month__S_to_date__S:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2445: ldc_w "Can't attach day ~S to date ~S"
        // 2448: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2451: putstatic
        // com/cyc/cycjava/cycl/$str83$Can_t_attach_day__S_to_date__S:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2454: ldc_w "Can't attach hour ~S to date ~S"
        // 2457: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2460: putstatic
        // com/cyc/cycjava/cycl/$str84$Can_t_attach_hour__S_to_date__S:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2463: ldc_w "Can't attach minute ~S to date ~S"
        // 2466: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2469: putstatic
        // com/cyc/cycjava/cycl/$str85$Can_t_attach_minute__S_to_date__S:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2472: ldc_w "Can't attach sec ~S to date ~S"
        // 2475: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2478: putstatic
        // com/cyc/cycjava/cycl/$str86$Can_t_attach_sec__S_to_date__S:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2481: ldc_w "Can't attach millisec ~S to date ~S"
        // 2484: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2487: putstatic
        // com/cyc/cycjava/cycl/$str87$Can_t_attach_millisec__S_to_date_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2490: ldc_w "Can't attach quarter ~S to date ~S"
        // 2493: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2496: putstatic
        // com/cyc/cycjava/cycl/$str88$Can_t_attach_quarter__S_to_date__:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2499: ldc_w "Can't construct date with decade ~S"
        // 2502: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2505: putstatic
        // com/cyc/cycjava/cycl/$str89$Can_t_construct_date_with_decade_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2508: ldc_w "Can't construct date with century ~S"
        // 2511: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2514: putstatic
        // com/cyc/cycjava/cycl/$str90$Can_t_construct_date_with_century:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2517: ldc_w "YearsDuration"
        // 2520: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2523: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2526: putstatic
        // com/cyc/cycjava/cycl/$const91$YearsDuration:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2529: ldc_w "MonthsDuration"
        // 2532: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2535: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2538: putstatic
        // com/cyc/cycjava/cycl/$const92$MonthsDuration:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2541: ldc_w "WeeksDuration"
        // 2544: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2547: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2550: putstatic
        // com/cyc/cycjava/cycl/$const93$WeeksDuration:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2553: ldc_w "DaysDuration"
        // 2556: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2559: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2562: putstatic
        // com/cyc/cycjava/cycl/$const94$DaysDuration:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2565: ldc_w "HoursDuration"
        // 2568: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2571: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2574: putstatic
        // com/cyc/cycjava/cycl/$const95$HoursDuration:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2577: ldc_w "MinutesDuration"
        // 2580: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2583: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2586: putstatic
        // com/cyc/cycjava/cycl/$const96$MinutesDuration:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2589: ldc_w "SecondsDuration"
        // 2592: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2595: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2598: putstatic
        // com/cyc/cycjava/cycl/$const97$SecondsDuration:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2601: ldc_w "MillisecondsDuration"
        // 2604: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2607: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2610: putstatic
        // com/cyc/cycjava/cycl/$const98$MillisecondsDuration:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2613: sipush 1000
        // 2616: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 2619: putstatic
        // com/cyc/cycjava/cycl/$int99$1000:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 2622: bipush 60
        // 2624: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 2627: putstatic
        // com/cyc/cycjava/cycl/$int100$60:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 2630: bipush 24
        // 2632: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 2635: putstatic
        // com/cyc/cycjava/cycl/$int101$24:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 2638: ldc_w "QuartersDuration"
        // 2641: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2644: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2647: putstatic
        // com/cyc/cycjava/cycl/$const102$QuartersDuration:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2650: ldc_w "DecadesDuration"
        // 2653: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2656: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2659: putstatic
        // com/cyc/cycjava/cycl/$const103$DecadesDuration:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2662: bipush 120
        // 2664: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 2667: putstatic
        // com/cyc/cycjava/cycl/$int104$120:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 2670: ldc_w "CenturiesDuration"
        // 2673: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2676: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2679: putstatic
        // com/cyc/cycjava/cycl/$const105$CenturiesDuration:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2682: sipush 1200
        // 2685: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 2688: putstatic
        // com/cyc/cycjava/cycl/$int106$1200:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 2691: bipush 12
        // 2693: anewarray Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2696: dup
        // 2697: iconst_0
        // 2698: ldc_w "January"
        // 2701: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2704: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2707: aastore
        // 2708: dup
        // 2709: iconst_1
        // 2710: ldc_w "February"
        // 2713: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2716: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2719: aastore
        // 2720: dup
        // 2721: iconst_2
        // 2722: ldc_w "March"
        // 2725: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2728: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2731: aastore
        // 2732: dup
        // 2733: iconst_3
        // 2734: ldc_w "April"
        // 2737: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2740: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2743: aastore
        // 2744: dup
        // 2745: iconst_4
        // 2746: ldc_w "May"
        // 2749: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2752: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2755: aastore
        // 2756: dup
        // 2757: iconst_5
        // 2758: ldc_w "June"
        // 2761: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2764: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2767: aastore
        // 2768: dup
        // 2769: bipush 6
        // 2771: ldc_w "July"
        // 2774: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2777: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2780: aastore
        // 2781: dup
        // 2782: bipush 7
        // 2784: ldc_w "August"
        // 2787: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2790: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2793: aastore
        // 2794: dup
        // 2795: bipush 8
        // 2797: ldc_w "September"
        // 2800: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2803: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2806: aastore
        // 2807: dup
        // 2808: bipush 9
        // 2810: ldc_w "October"
        // 2813: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2816: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2819: aastore
        // 2820: dup
        // 2821: bipush 10
        // 2823: ldc_w "November"
        // 2826: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2829: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2832: aastore
        // 2833: dup
        // 2834: bipush 11
        // 2836: ldc_w "December"
        // 2839: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2842: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2845: aastore
        // 2846: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:([Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 2849: putstatic
        // com/cyc/cycjava/cycl/$list107:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 2852: ldc_w "A KB-dependent date-specific function was called, but the
        // current Cyc KB does not contain knowledge about dates."
        // 2855: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2858: putstatic
        // com/cyc/cycjava/cycl/$str108$A_KB_dependent_date_specific_func:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2861: ldc_w "VALID-MONTH-NUMBER-P"
        // 2864: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2867: putstatic
        // com/cyc/cycjava/cycl/$sym109$VALID_MONTH_NUMBER_P:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2870: ldc_w "MONTH-TERM-P"
        // 2873: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2876: putstatic
        // com/cyc/cycjava/cycl/$sym110$MONTH_TERM_P:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2879: ldc_w "MonthOfYearFn"
        // 2882: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2885: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2888: putstatic
        // com/cyc/cycjava/cycl/$const111$MonthOfYearFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2891: ldc_w "Sunday"
        // 2894: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2897: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2900: ldc_w "Monday"
        // 2903: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2906: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2909: ldc_w "Tuesday"
        // 2912: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2915: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2918: ldc_w "Wednesday"
        // 2921: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2924: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2927: ldc_w "Thursday"
        // 2930: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2933: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2936: ldc_w "Friday"
        // 2939: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2942: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2945: ldc_w "Saturday"
        // 2948: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2951: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 2954: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 2957: putstatic
        // com/cyc/cycjava/cycl/$list112:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 2960: ldc_w "~S is not a valid day-of-week number"
        // 2963: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2966: putstatic
        // com/cyc/cycjava/cycl/$str113$_S_is_not_a_valid_day_of_week_num:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 2969: ldc_w "DAY-OF-WEEK-P"
        // 2972: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2975: putstatic
        // com/cyc/cycjava/cycl/$sym114$DAY_OF_WEEK_P:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2978: ldc_w "DATE-P"
        // 2981: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2984: putstatic
        // com/cyc/cycjava/cycl/$sym115$DATE_P:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2987: ldc_w "INTEGERP"
        // 2990: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2993: putstatic
        // com/cyc/cycjava/cycl/$sym116$INTEGERP:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 2996: ldc_w "DayOfMonthFn"
        // 2999: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3002: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3005: putstatic
        // com/cyc/cycjava/cycl/$const117$DayOfMonthFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3008: ldc_w "DayFn"
        // 3011: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3014: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3017: getstatic
        // com/cyc/cycjava/cycl/ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 3020: ldc_w "MonthFn"
        // 3023: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3026: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3029: ldc_w "January"
        // 3032: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3035: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3038: ldc_w "YearFn"
        // 3041: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3044: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3047: getstatic
        // com/cyc/cycjava/cycl/ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 3050: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 3053: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 3056: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 3059: putstatic
        // com/cyc/cycjava/cycl/$list118:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 3062: sipush 365
        // 3065: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 3068: putstatic
        // com/cyc/cycjava/cycl/$int119$365:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 3071: sipush 400
        // 3074: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 3077: putstatic
        // com/cyc/cycjava/cycl/$int120$400:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 3080: sipush 367
        // 3083: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 3086: putstatic
        // com/cyc/cycjava/cycl/$int121$367:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 3089: sipush 362
        // 3092: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 3095: putstatic
        // com/cyc/cycjava/cycl/$int122$362:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 3098: bipush -2
        // 3100: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 3103: putstatic
        // com/cyc/cycjava/cycl/$int123$_2:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 3106: bipush 24
        // 3108: anewarray Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3111: dup
        // 3112: iconst_0
        // 3113: ldc_w "TimeOfDay-MidnightHour"
        // 3116: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3119: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3122: aastore
        // 3123: dup
        // 3124: iconst_1
        // 3125: ldc_w "TimeOfDay-1AM"
        // 3128: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3131: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3134: aastore
        // 3135: dup
        // 3136: iconst_2
        // 3137: ldc_w "TimeOfDay-2AM"
        // 3140: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3143: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3146: aastore
        // 3147: dup
        // 3148: iconst_3
        // 3149: ldc_w "TimeOfDay-3AM"
        // 3152: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3155: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3158: aastore
        // 3159: dup
        // 3160: iconst_4
        // 3161: ldc_w "TimeOfDay-4AM"
        // 3164: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3167: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3170: aastore
        // 3171: dup
        // 3172: iconst_5
        // 3173: ldc_w "TimeOfDay-5AM"
        // 3176: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3179: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3182: aastore
        // 3183: dup
        // 3184: bipush 6
        // 3186: ldc_w "TimeOfDay-6AM"
        // 3189: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3192: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3195: aastore
        // 3196: dup
        // 3197: bipush 7
        // 3199: ldc_w "TimeOfDay-7AM"
        // 3202: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3205: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3208: aastore
        // 3209: dup
        // 3210: bipush 8
        // 3212: ldc_w "TimeOfDay-8AM"
        // 3215: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3218: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3221: aastore
        // 3222: dup
        // 3223: bipush 9
        // 3225: ldc_w "TimeOfDay-9AM"
        // 3228: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3231: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3234: aastore
        // 3235: dup
        // 3236: bipush 10
        // 3238: ldc_w "TimeOfDay-10AM"
        // 3241: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3244: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3247: aastore
        // 3248: dup
        // 3249: bipush 11
        // 3251: ldc_w "TimeOfDay-11AM"
        // 3254: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3257: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3260: aastore
        // 3261: dup
        // 3262: bipush 12
        // 3264: ldc_w "TimeOfDay-NoonHour"
        // 3267: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3270: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3273: aastore
        // 3274: dup
        // 3275: bipush 13
        // 3277: ldc_w "TimeOfDay-1PM"
        // 3280: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3283: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3286: aastore
        // 3287: dup
        // 3288: bipush 14
        // 3290: ldc_w "TimeOfDay-2PM"
        // 3293: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3296: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3299: aastore
        // 3300: dup
        // 3301: bipush 15
        // 3303: ldc_w "TimeOfDay-3PM"
        // 3306: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3309: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3312: aastore
        // 3313: dup
        // 3314: bipush 16
        // 3316: ldc_w "TimeOfDay-4PM"
        // 3319: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3322: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3325: aastore
        // 3326: dup
        // 3327: bipush 17
        // 3329: ldc_w "TimeOfDay-5PM"
        // 3332: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3335: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3338: aastore
        // 3339: dup
        // 3340: bipush 18
        // 3342: ldc_w "TimeOfDay-6PM"
        // 3345: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3348: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3351: aastore
        // 3352: dup
        // 3353: bipush 19
        // 3355: ldc_w "TimeOfDay-7PM"
        // 3358: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3361: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3364: aastore
        // 3365: dup
        // 3366: bipush 20
        // 3368: ldc_w "TimeOfDay-8PM"
        // 3371: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3374: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3377: aastore
        // 3378: dup
        // 3379: bipush 21
        // 3381: ldc_w "TimeOfDay-9PM"
        // 3384: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3387: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3390: aastore
        // 3391: dup
        // 3392: bipush 22
        // 3394: ldc_w "TimeOfDay-10PM"
        // 3397: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3400: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3403: aastore
        // 3404: dup
        // 3405: bipush 23
        // 3407: ldc_w "TimeOfDay-11PM"
        // 3410: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3413: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3416: aastore
        // 3417: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:([Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 3420: putstatic
        // com/cyc/cycjava/cycl/$list124:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 3423: ldc_w "HourOfDayFn"
        // 3426: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3429: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3432: putstatic
        // com/cyc/cycjava/cycl/$const125$HourOfDayFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3435: ldc_w "Continue with nil hour of day?"
        // 3438: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3441: putstatic
        // com/cyc/cycjava/cycl/$str126$Continue_with_nil_hour_of_day_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3444: ldc_w "~a did not specify a day."
        // 3447: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3450: putstatic
        // com/cyc/cycjava/cycl/$str127$_a_did_not_specify_a_day_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3453: ldc_w "TimeOfDayFn"
        // 3456: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3459: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3462: putstatic
        // com/cyc/cycjava/cycl/$const128$TimeOfDayFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3465: ldc_w "TimeOfHourFn"
        // 3468: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3471: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3474: putstatic
        // com/cyc/cycjava/cycl/$const129$TimeOfHourFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3477: ldc_w "TimeOfMinuteFn"
        // 3480: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3483: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3486: putstatic
        // com/cyc/cycjava/cycl/$const130$TimeOfMinuteFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3489: ldc_w "MinuteOfHourFn"
        // 3492: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3495: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3498: putstatic
        // com/cyc/cycjava/cycl/$const131$MinuteOfHourFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3501: ldc_w "Continue with nil minute of hour?"
        // 3504: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3507: putstatic
        // com/cyc/cycjava/cycl/$str132$Continue_with_nil_minute_of_hour_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3510: ldc_w "~a did not specify a hour."
        // 3513: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3516: putstatic
        // com/cyc/cycjava/cycl/$str133$_a_did_not_specify_a_hour_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3519: ldc_w "SecondOfMinuteFn"
        // 3522: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3525: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3528: putstatic
        // com/cyc/cycjava/cycl/$const134$SecondOfMinuteFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3531: ldc_w "Continue with nil second of minute?"
        // 3534: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3537: putstatic
        // com/cyc/cycjava/cycl/$str135$Continue_with_nil_second_of_minut:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3540: ldc_w "~a did not specify a minute."
        // 3543: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3546: putstatic
        // com/cyc/cycjava/cycl/$str136$_a_did_not_specify_a_minute_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3549: ldc_w "MillisecondOfSecondFn"
        // 3552: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3555: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3558: putstatic
        // com/cyc/cycjava/cycl/$const137$MillisecondOfSecondFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3561: ldc_w "Continue with nil millisecond of second?"
        // 3564: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3567: putstatic
        // com/cyc/cycjava/cycl/$str138$Continue_with_nil_millisecond_of_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3570: ldc_w "~a did not specify a second."
        // 3573: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3576: putstatic
        // com/cyc/cycjava/cycl/$str139$_a_did_not_specify_a_second_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3579: ldc_w "CalendarWeek"
        // 3582: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3585: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3588: putstatic
        // com/cyc/cycjava/cycl/$const140$CalendarWeek:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3591: ldc_w "Sunday"
        // 3594: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3597: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3600: putstatic
        // com/cyc/cycjava/cycl/$const141$Sunday:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3603: ldc_w "January"
        // 3606: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3609: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3612: putstatic
        // com/cyc/cycjava/cycl/$const142$January:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3615: ldc_w "CalendarQuarter"
        // 3618: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3621: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3624: putstatic
        // com/cyc/cycjava/cycl/$const143$CalendarQuarter:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3627: bipush 59
        // 3629: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 3632: putstatic
        // com/cyc/cycjava/cycl/$int144$59:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 3635: bipush 23
        // 3637: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 3640: putstatic
        // com/cyc/cycjava/cycl/$int145$23:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 3643: ldc_w "Saturday"
        // 3646: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3649: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3652: putstatic
        // com/cyc/cycjava/cycl/$const146$Saturday:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3655: ldc_w "December"
        // 3658: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3661: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3664: putstatic
        // com/cyc/cycjava/cycl/$const147$December:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3667: ldc_w "CalendarDecade"
        // 3670: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3673: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3676: putstatic
        // com/cyc/cycjava/cycl/$const148$CalendarDecade:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3679: ldc_w "CalendarCentury"
        // 3682: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3685: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3688: putstatic
        // com/cyc/cycjava/cycl/$const149$CalendarCentury:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3691: ldc_w "INFERENCE-DEFINING-TIME-UNIT"
        // 3694: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 3697: putstatic
        // com/cyc/cycjava/cycl/$sym150$INFERENCE_DEFINING_TIME_UNIT:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 3700: ldc_w "definingTimeUnit"
        // 3703: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3706: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3709: putstatic
        // com/cyc/cycjava/cycl/$const151$definingTimeUnit:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3712: ldc_w "INFERENCE-DEFINING-TIME-UNIT-GET-INTERVAL"
        // 3715: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 3718: putstatic
        // com/cyc/cycjava/cycl/$sym152$INFERENCE_DEFINING_TIME_UNIT_GET_INTERVAL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 3721: ldc_w "~a is not a valid cycl date."
        // 3724: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3727: putstatic
        // com/cyc/cycjava/cycl/$str153$_a_is_not_a_valid_cycl_date_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3730: sipush 999
        // 3733: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 3736: putstatic
        // com/cyc/cycjava/cycl/$int154$999:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 3739: bipush 29
        // 3741: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 3744: putstatic
        // com/cyc/cycjava/cycl/$int155$29:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 3747: ldc_w "SecondsDuration"
        // 3750: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3753: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3756: ldc_w "MinutesDuration"
        // 3759: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3762: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3765: ldc_w "HoursDuration"
        // 3768: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3771: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3774: ldc_w "DaysDuration"
        // 3777: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3780: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3783: ldc_w "MonthsDuration"
        // 3786: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3789: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3792: ldc_w "YearsDuration"
        // 3795: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3798: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3801: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 3804: putstatic
        // com/cyc/cycjava/cycl/$list156:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 3807: ldc_w "DURATION-P"
        // 3810: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 3813: putstatic
        // com/cyc/cycjava/cycl/$sym157$DURATION_P:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 3816: ldc_w "Could not determine precision for ~a or ~a.~%"
        // 3819: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3822: putstatic
        // com/cyc/cycjava/cycl/$str158$Could_not_determine_precision_for:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3825: ldc_w "10000000000"
        // 3828: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 3831: putstatic
        // com/cyc/cycjava/cycl/$int159$10000000000:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 3834: ldc_w "Expected a #$DaysDuration nat, got ~s"
        // 3837: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3840: putstatic
        // com/cyc/cycjava/cycl/$str160$Expected_a___DaysDuration_nat__go:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3843: ldc_w "*TEMPORAL-INDEXICALS*"
        // 3846: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 3849: putstatic
        // com/cyc/cycjava/cycl/$sym161$_TEMPORAL_INDEXICALS_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 3852: ldc_w "Now"
        // 3855: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3858: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3861: ldc_w "Now-Indexical"
        // 3864: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3867: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3870: ldc_w "Today-Indexical"
        // 3873: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3876: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3879: ldc_w "Tomorrow-Indexical"
        // 3882: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3885: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3888: ldc_w "Yesterday-Indexical"
        // 3891: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 3894: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 3897: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 3900: putstatic
        // com/cyc/cycjava/cycl/$list162:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 3903: ldc_w "TEMPORAL-INDEXICAL-P"
        // 3906: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 3909: putstatic
        // com/cyc/cycjava/cycl/$sym163$TEMPORAL_INDEXICAL_P:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 3912: ldc_w "TEMPORAL-INDEXICAL-EXPAND"
        // 3915: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 3918: putstatic
        // com/cyc/cycjava/cycl/$sym164$TEMPORAL_INDEXICAL_EXPAND:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 3921: ldc_w "BIND-TEMPORAL-INDEXICAL-IN-OBJECT"
        // 3924: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 3927: putstatic
        // com/cyc/cycjava/cycl/$sym165$BIND_TEMPORAL_INDEXICAL_IN_OBJECT:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 3930: ldc_w "*INFERENCE-NOW*"
        // 3933: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 3936: ldc_w "GET-UNIVERSAL-TIME"
        // 3939: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 3942: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 3945: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 3948: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 3951: putstatic
        // com/cyc/cycjava/cycl/$list166:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 3954: ldc_w "*INFERENCE-NOW*"
        // 3957: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 3960: ldc_w "GET-INFERENCE-NOW"
        // 3963: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 3966: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 3969: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 3972: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 3975: putstatic
        // com/cyc/cycjava/cycl/$list167:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 3978: ldc_w "*INFERENCE-NOW*"
        // 3981: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 3984: ldc_w "FIRST-OF"
        // 3987: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 3990: ldc_w "*INFERENCE-NOW*"
        // 3993: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 3996: ldc_w "GET-INFERENCE-NOW"
        // 3999: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4002: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4005: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4008: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4011: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4014: putstatic
        // com/cyc/cycjava/cycl/$list168:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4017: ldc_w 100000
        // 4020: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 4023: putstatic
        // com/cyc/cycjava/cycl/$int169$100000:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 4026: ldc_w 10000000
        // 4029: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 4032: putstatic
        // com/cyc/cycjava/cycl/$int170$10000000:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 4035: sipush 10000
        // 4038: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 4041: putstatic
        // com/cyc/cycjava/cycl/$int171$10000:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 4044: ldc_w "DaysDuration"
        // 4047: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4050: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 4053: getstatic
        // com/cyc/cycjava/cycl/ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 4056: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4059: putstatic
        // com/cyc/cycjava/cycl/$list172:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4062: sipush 1970
        // 4065: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 4068: putstatic
        // com/cyc/cycjava/cycl/$int173$1970:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 4071: ldc_w "TimeOfDay-AM"
        // 4074: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4077: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 4080: putstatic
        // com/cyc/cycjava/cycl/$const174$TimeOfDay_AM:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 4083: ldc_w "TimeOfDay-MidnightHour"
        // 4086: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4089: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 4092: putstatic
        // com/cyc/cycjava/cycl/$const175$TimeOfDay_MidnightHour:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 4095: ldc_w "TimeOfDay-PM"
        // 4098: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4101: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 4104: putstatic
        // com/cyc/cycjava/cycl/$const176$TimeOfDay_PM:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 4107: ldc_w "TimeOfDay-NoonHour"
        // 4110: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4113: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 4116: putstatic
        // com/cyc/cycjava/cycl/$const177$TimeOfDay_NoonHour:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 4119: ldc_w "TimeOfYearFn"
        // 4122: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4125: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 4128: putstatic
        // com/cyc/cycjava/cycl/$const178$TimeOfYearFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 4131: ldc_w "TimeOfMonthFn"
        // 4134: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4137: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 4140: putstatic
        // com/cyc/cycjava/cycl/$const179$TimeOfMonthFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 4143: ldc_w "DayOfYearFn"
        // 4146: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4149: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 4152: putstatic
        // com/cyc/cycjava/cycl/$const180$DayOfYearFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 4155: ldc_w "TimeOfWeekFn"
        // 4158: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4161: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 4164: putstatic
        // com/cyc/cycjava/cycl/$const181$TimeOfWeekFn:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 4167: ldc_w "UNIVERSAL-TIME-P"
        // 4170: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4173: putstatic
        // com/cyc/cycjava/cycl/$sym182$UNIVERSAL_TIME_P:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4176: ldc_w "UNIVERSAL-DATE-P"
        // 4179: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4182: putstatic
        // com/cyc/cycjava/cycl/$sym183$UNIVERSAL_DATE_P:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4185: ldc_w "IGNORE-ERRORS-TARGET"
        // 4188: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4191: putstatic
        // com/cyc/cycjava/cycl/$kw184$IGNORE_ERRORS_TARGET:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4194: ldc_w "IGNORE-ERRORS-HANDLER"
        // 4197: ldc_w "SUBLISP"
        // 4200: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4203: putstatic
        // com/cyc/cycjava/cycl/$sym185$IGNORE_ERRORS_HANDLER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4206: ldc_w "from "
        // 4209: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4212: putstatic
        // com/cyc/cycjava/cycl/$str186$from_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4215: ldc_w " to "
        // 4218: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4221: putstatic
        // com/cyc/cycjava/cycl/$str187$_to_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4224: ldc_w "Can't support [) or (] time intervals."
        // 4227: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4230: putstatic
        // com/cyc/cycjava/cycl/$str188$Can_t_support____or____time_inter:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4233: ldc_w "Can't support [) or (] time intervals.~%"
        // 4236: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4239: putstatic
        // com/cyc/cycjava/cycl/$str189$Can_t_support____or____time_inter:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4242: ldc_w "DIGIT-CHAR-P"
        // 4245: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4248: putstatic
        // com/cyc/cycjava/cycl/$sym190$DIGIT_CHAR_P:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4251: ldc_w "/"
        // 4254: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4257: putstatic
        // com/cyc/cycjava/cycl/$str191$_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4260: ldc_w "-"
        // 4263: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4266: putstatic
        // com/cyc/cycjava/cycl/$str192$_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4269: ldc_w "."
        // 4272: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4275: putstatic
        // com/cyc/cycjava/cycl/$str193$_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4278: ldc_w "."
        // 4281: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4284: ldc_w "-"
        // 4287: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4290: ldc_w "/"
        // 4293: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4296: ldc_w " "
        // 4299: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4302: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4305: putstatic
        // com/cyc/cycjava/cycl/$list194:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4308: ldc_w ":"
        // 4311: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4314: ldc_w " "
        // 4317: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4320: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4323: putstatic
        // com/cyc/cycjava/cycl/$list195:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4326: ldc_w "DAY"
        // 4329: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4332: ldc_w "MONTH"
        // 4335: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4338: ldc_w "YEAR"
        // 4341: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4344: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4347: putstatic
        // com/cyc/cycjava/cycl/$list196:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4350: ldc_w ":"
        // 4353: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4356: putstatic
        // com/cyc/cycjava/cycl/$str197$_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4359: ldc_w " , "
        // 4362: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4365: ldc_w "-"
        // 4368: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4371: ldc_w "/"
        // 4374: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4377: ldc_w " "
        // 4380: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4383: ldc_w ", "
        // 4386: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4389: ldc_w ","
        // 4392: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4395: ldc_w ". "
        // 4398: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4401: ldc_w "."
        // 4404: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4407: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4410: putstatic
        // com/cyc/cycjava/cycl/$list198:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4413: ldc_w "TIME-TOKEN?"
        // 4416: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4419: putstatic
        // com/cyc/cycjava/cycl/$sym199$TIME_TOKEN_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4422: ldc_w "TOKEN-KEY"
        // 4425: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4428: ldc_w "TOKEN-VALUE"
        // 4431: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4434: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4437: putstatic
        // com/cyc/cycjava/cycl/$list200:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4440: ldc_w "TIME"
        // 4443: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4446: putstatic
        // com/cyc/cycjava/cycl/$kw201$TIME:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4449: ldc_w "HOUR"
        // 4452: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4455: putstatic
        // com/cyc/cycjava/cycl/$kw202$HOUR:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4458: ldc_w "MILLISECONDS"
        // 4461: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4464: putstatic
        // com/cyc/cycjava/cycl/$kw203$MILLISECONDS:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4467: ldc_w ":"
        // 4470: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4473: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4476: putstatic
        // com/cyc/cycjava/cycl/$list204:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4479: ldc_w "0"
        // 4482: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4485: putstatic
        // com/cyc/cycjava/cycl/$str205$0:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 4488: sipush 1800
        // 4491: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 4494: putstatic
        // com/cyc/cycjava/cycl/$int206$1800:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 4497: sipush 2200
        // 4500: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 4503: putstatic
        // com/cyc/cycjava/cycl/$int207$2200:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 4506: ldc_w "VALID-NUMBER-STRING-CHAR"
        // 4509: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4512: putstatic
        // com/cyc/cycjava/cycl/$sym208$VALID_NUMBER_STRING_CHAR:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4515: sipush 2000
        // 4518: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 4521: putstatic
        // com/cyc/cycjava/cycl/$int209$2000:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 4524: sipush 1900
        // 4527: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 4530: putstatic
        // com/cyc/cycjava/cycl/$int210$1900:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 4533: bipush 21
        // 4535: anewarray Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 4538: dup
        // 4539: iconst_0
        // 4540: ldc_w "YEAR"
        // 4543: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4546: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4549: aastore
        // 4550: dup
        // 4551: iconst_1
        // 4552: ldc_w "YEAR"
        // 4555: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4558: ldc_w "MONTH-NUM"
        // 4561: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4564: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4567: aastore
        // 4568: dup
        // 4569: iconst_2
        // 4570: ldc_w "YEAR"
        // 4573: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4576: ldc_w "MONTH-NUM"
        // 4579: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4582: ldc_w "DAY"
        // 4585: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4588: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4591: aastore
        // 4592: dup
        // 4593: iconst_3
        // 4594: ldc_w "YEAR"
        // 4597: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4600: ldc_w "MONTH-NUM"
        // 4603: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4606: ldc_w "DAY"
        // 4609: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4612: ldc_w "HOUR"
        // 4615: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4618: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4621: aastore
        // 4622: dup
        // 4623: iconst_4
        // 4624: ldc_w "YEAR"
        // 4627: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4630: ldc_w "MONTH-NUM"
        // 4633: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4636: ldc_w "DAY"
        // 4639: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4642: ldc_w "TIME"
        // 4645: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4648: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4651: aastore
        // 4652: dup
        // 4653: iconst_5
        // 4654: ldc_w "YEAR"
        // 4657: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4660: ldc_w "MONTH-NUM"
        // 4663: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4666: ldc_w "DAY"
        // 4669: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4672: ldc_w "TIME"
        // 4675: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4678: ldc_w "MILLISECONDS"
        // 4681: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4684: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4687: aastore
        // 4688: dup
        // 4689: bipush 6
        // 4691: ldc_w "YEAR"
        // 4694: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4697: ldc_w "MONTH-NAME"
        // 4700: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4703: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4706: aastore
        // 4707: dup
        // 4708: bipush 7
        // 4710: ldc_w "YEAR"
        // 4713: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4716: ldc_w "MONTH-NAME"
        // 4719: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4722: ldc_w "DAY"
        // 4725: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4728: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4731: aastore
        // 4732: dup
        // 4733: bipush 8
        // 4735: ldc_w "YEAR"
        // 4738: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4741: ldc_w "DAY"
        // 4744: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4747: ldc_w "MONTH-NAME"
        // 4750: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4753: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4756: aastore
        // 4757: dup
        // 4758: bipush 9
        // 4760: ldc_w "MONTH-NAME"
        // 4763: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4766: ldc_w "DAY"
        // 4769: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4772: ldc_w "INDEXICAL-YEAR"
        // 4775: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4778: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4781: aastore
        // 4782: dup
        // 4783: bipush 10
        // 4785: ldc_w "MONTH-NUM"
        // 4788: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4791: ldc_w "DAY"
        // 4794: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4797: ldc_w "INDEXICAL-YEAR"
        // 4800: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4803: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4806: aastore
        // 4807: dup
        // 4808: bipush 11
        // 4810: ldc_w "MONTH-NAME"
        // 4813: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4816: ldc_w "YEAR"
        // 4819: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4822: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4825: aastore
        // 4826: dup
        // 4827: bipush 12
        // 4829: ldc_w "MONTH-NUM"
        // 4832: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4835: ldc_w "YEAR"
        // 4838: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4841: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4844: aastore
        // 4845: dup
        // 4846: bipush 13
        // 4848: ldc_w "TIME"
        // 4851: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4854: ldc_w "MONTH-NAME"
        // 4857: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4860: ldc_w "DAY"
        // 4863: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4866: ldc_w "YEAR"
        // 4869: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4872: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4875: aastore
        // 4876: dup
        // 4877: bipush 14
        // 4879: ldc_w "MONTH-NAME"
        // 4882: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4885: ldc_w "DAY"
        // 4888: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4891: ldc_w "YEAR"
        // 4894: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4897: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4900: aastore
        // 4901: dup
        // 4902: bipush 15
        // 4904: ldc_w "TIME"
        // 4907: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4910: ldc_w "MONTH-NUM"
        // 4913: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4916: ldc_w "DAY"
        // 4919: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4922: ldc_w "YEAR"
        // 4925: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4928: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4931: aastore
        // 4932: dup
        // 4933: bipush 16
        // 4935: ldc_w "MONTH-NUM"
        // 4938: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4941: ldc_w "DAY"
        // 4944: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4947: ldc_w "YEAR"
        // 4950: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4953: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4956: aastore
        // 4957: dup
        // 4958: bipush 17
        // 4960: ldc_w "DAY"
        // 4963: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4966: ldc_w "MONTH-NUM"
        // 4969: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4972: ldc_w "YEAR"
        // 4975: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4978: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 4981: aastore
        // 4982: dup
        // 4983: bipush 18
        // 4985: ldc_w "TIME"
        // 4988: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4991: ldc_w "DAY"
        // 4994: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 4997: ldc_w "MONTH-NAME"
        // 5000: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5003: ldc_w "YEAR"
        // 5006: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5009: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5012: aastore
        // 5013: dup
        // 5014: bipush 19
        // 5016: ldc_w "DAY"
        // 5019: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5022: ldc_w "MONTH-NAME"
        // 5025: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5028: ldc_w "YEAR"
        // 5031: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5034: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5037: aastore
        // 5038: dup
        // 5039: bipush 20
        // 5041: ldc_w "DAY-NAME"
        // 5044: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5047: ldc_w "DAY"
        // 5050: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5053: ldc_w "MONTH-NAME"
        // 5056: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5059: ldc_w "YEAR"
        // 5062: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5065: ldc_w "TIME"
        // 5068: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5071: ldc_w "TIME-ZONE"
        // 5074: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5077: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5080: aastore
        // 5081: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:([Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5084: putstatic
        // com/cyc/cycjava/cycl/$list211:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5087: ldc_w "MONTH-NAME"
        // 5090: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5093: ldc_w "DAY"
        // 5096: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5099: ldc_w "UNKNOWN-YEAR"
        // 5102: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5105: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5108: ldc_w "MONTH-NUM"
        // 5111: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5114: ldc_w "DAY"
        // 5117: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5120: ldc_w "UNKNOWN-YEAR"
        // 5123: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5126: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5129: ldc_w "MONTH-NAME"
        // 5132: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5135: ldc_w "YEAR"
        // 5138: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5141: ldc_w "UNKNOWN-DAY"
        // 5144: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5147: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5150: ldc_w "MONTH-NAME"
        // 5153: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5156: ldc_w "UNKNOWN-YEAR"
        // 5159: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5162: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5165: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5168: putstatic
        // com/cyc/cycjava/cycl/$list212:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5171: ldc_w "of"
        // 5174: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5177: putstatic
        // com/cyc/cycjava/cycl/$str213$of:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5180: ldc_w ""
        // 5183: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5186: putstatic
        // com/cyc/cycjava/cycl/$str214$:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5189: ldc_w "UNKNOWN-YEAR"
        // 5192: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5195: putstatic
        // com/cyc/cycjava/cycl/$kw215$UNKNOWN_YEAR:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5198: ldc_w "UNKNOWN-DAY"
        // 5201: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5204: putstatic
        // com/cyc/cycjava/cycl/$kw216$UNKNOWN_DAY:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5207: ldc_w "?YEAR"
        // 5210: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5213: putstatic
        // com/cyc/cycjava/cycl/$sym217$_YEAR:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5216: ldc_w "?DAY"
        // 5219: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5222: putstatic
        // com/cyc/cycjava/cycl/$sym218$_DAY:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5225: ldc_w "YEAR"
        // 5228: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5231: putstatic
        // com/cyc/cycjava/cycl/$kw219$YEAR:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5234: ldc_w "MONTH"
        // 5237: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5240: putstatic
        // com/cyc/cycjava/cycl/$kw220$MONTH:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5243: ldc_w "MONTH-NAME"
        // 5246: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5249: putstatic
        // com/cyc/cycjava/cycl/$kw221$MONTH_NAME:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5252: ldc_w "DAY-NAME"
        // 5255: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5258: putstatic
        // com/cyc/cycjava/cycl/$kw222$DAY_NAME:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5261: ldc_w "TIME-ZONE"
        // 5264: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5267: putstatic
        // com/cyc/cycjava/cycl/$kw223$TIME_ZONE:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5270: ldc_w "MONTH-NUM"
        // 5273: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5276: putstatic
        // com/cyc/cycjava/cycl/$kw224$MONTH_NUM:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5279: ldc_w "DAY"
        // 5282: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5285: putstatic
        // com/cyc/cycjava/cycl/$kw225$DAY:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5288: ldc_w "YEAR-TOKEN?"
        // 5291: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5294: putstatic
        // com/cyc/cycjava/cycl/$sym226$YEAR_TOKEN_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5297: ldc_w "DAY-TOKEN?"
        // 5300: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5303: putstatic
        // com/cyc/cycjava/cycl/$sym227$DAY_TOKEN_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 5306: bipush 82
        // 5308: anewarray Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 5311: dup
        // 5312: iconst_0
        // 5313: ldc_w "one"
        // 5316: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5319: getstatic
        // com/cyc/cycjava/cycl/ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 5322: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5325: aastore
        // 5326: dup
        // 5327: iconst_1
        // 5328: ldc_w "two"
        // 5331: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5334: getstatic
        // com/cyc/cycjava/cycl/TWO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 5337: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5340: aastore
        // 5341: dup
        // 5342: iconst_2
        // 5343: ldc_w "three"
        // 5346: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5349: getstatic
        // com/cyc/cycjava/cycl/THREE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 5352: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5355: aastore
        // 5356: dup
        // 5357: iconst_3
        // 5358: ldc_w "four"
        // 5361: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5364: getstatic
        // com/cyc/cycjava/cycl/FOUR_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 5367: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5370: aastore
        // 5371: dup
        // 5372: iconst_4
        // 5373: ldc_w "five"
        // 5376: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5379: getstatic
        // com/cyc/cycjava/cycl/FIVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 5382: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5385: aastore
        // 5386: dup
        // 5387: iconst_5
        // 5388: ldc_w "six"
        // 5391: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5394: getstatic
        // com/cyc/cycjava/cycl/SIX_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 5397: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5400: aastore
        // 5401: dup
        // 5402: bipush 6
        // 5404: ldc_w "seven"
        // 5407: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5410: getstatic
        // com/cyc/cycjava/cycl/SEVEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 5413: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5416: aastore
        // 5417: dup
        // 5418: bipush 7
        // 5420: ldc_w "eight"
        // 5423: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5426: getstatic
        // com/cyc/cycjava/cycl/EIGHT_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 5429: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5432: aastore
        // 5433: dup
        // 5434: bipush 8
        // 5436: ldc_w "nine"
        // 5439: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5442: getstatic
        // com/cyc/cycjava/cycl/NINE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 5445: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5448: aastore
        // 5449: dup
        // 5450: bipush 9
        // 5452: ldc_w "ten"
        // 5455: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5458: getstatic
        // com/cyc/cycjava/cycl/TEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 5461: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5464: aastore
        // 5465: dup
        // 5466: bipush 10
        // 5468: ldc_w "eleven"
        // 5471: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5474: getstatic
        // com/cyc/cycjava/cycl/ELEVEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 5477: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5480: aastore
        // 5481: dup
        // 5482: bipush 11
        // 5484: ldc_w "twelve"
        // 5487: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5490: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 5493: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5496: aastore
        // 5497: dup
        // 5498: bipush 12
        // 5500: ldc_w "thirteen"
        // 5503: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5506: getstatic
        // com/cyc/cycjava/cycl/THIRTEEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 5509: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5512: aastore
        // 5513: dup
        // 5514: bipush 13
        // 5516: ldc_w "fourteen"
        // 5519: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5522: getstatic
        // com/cyc/cycjava/cycl/FOURTEEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 5525: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5528: aastore
        // 5529: dup
        // 5530: bipush 14
        // 5532: ldc_w "fifteen"
        // 5535: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5538: getstatic
        // com/cyc/cycjava/cycl/FIFTEEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 5541: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5544: aastore
        // 5545: dup
        // 5546: bipush 15
        // 5548: ldc_w "sixteen"
        // 5551: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5554: getstatic
        // com/cyc/cycjava/cycl/SIXTEEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 5557: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5560: aastore
        // 5561: dup
        // 5562: bipush 16
        // 5564: ldc_w "seventeen"
        // 5567: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5570: getstatic
        // com/cyc/cycjava/cycl/SEVENTEEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 5573: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5576: aastore
        // 5577: dup
        // 5578: bipush 17
        // 5580: ldc_w "eighteen"
        // 5583: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5586: getstatic
        // com/cyc/cycjava/cycl/EIGHTEEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 5589: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5592: aastore
        // 5593: dup
        // 5594: bipush 18
        // 5596: ldc_w "nineteen"
        // 5599: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5602: getstatic
        // com/cyc/cycjava/cycl/NINETEEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 5605: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5608: aastore
        // 5609: dup
        // 5610: bipush 19
        // 5612: ldc_w "twenty"
        // 5615: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5618: getstatic
        // com/cyc/cycjava/cycl/TWENTY_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 5621: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5624: aastore
        // 5625: dup
        // 5626: bipush 20
        // 5628: ldc_w "twenty-one"
        // 5631: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5634: bipush 21
        // 5636: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 5639: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5642: aastore
        // 5643: dup
        // 5644: bipush 21
        // 5646: ldc_w "twenty-two"
        // 5649: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5652: bipush 22
        // 5654: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 5657: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5660: aastore
        // 5661: dup
        // 5662: bipush 22
        // 5664: ldc_w "twenty-three"
        // 5667: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5670: bipush 23
        // 5672: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 5675: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5678: aastore
        // 5679: dup
        // 5680: bipush 23
        // 5682: ldc_w "twenty-four"
        // 5685: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5688: bipush 24
        // 5690: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 5693: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5696: aastore
        // 5697: dup
        // 5698: bipush 24
        // 5700: ldc_w "twenty-five"
        // 5703: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5706: bipush 25
        // 5708: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 5711: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5714: aastore
        // 5715: dup
        // 5716: bipush 25
        // 5718: ldc_w "twenty-six"
        // 5721: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5724: bipush 26
        // 5726: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 5729: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5732: aastore
        // 5733: dup
        // 5734: bipush 26
        // 5736: ldc_w "twenty-seven"
        // 5739: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5742: bipush 27
        // 5744: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 5747: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5750: aastore
        // 5751: dup
        // 5752: bipush 27
        // 5754: ldc_w "twenty-eight"
        // 5757: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5760: bipush 28
        // 5762: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 5765: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5768: aastore
        // 5769: dup
        // 5770: bipush 28
        // 5772: ldc_w "twenty-nine"
        // 5775: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5778: bipush 29
        // 5780: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 5783: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5786: aastore
        // 5787: dup
        // 5788: bipush 29
        // 5790: ldc_w "thirty"
        // 5793: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5796: bipush 30
        // 5798: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 5801: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5804: aastore
        // 5805: dup
        // 5806: bipush 30
        // 5808: ldc_w "thirty-one"
        // 5811: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5814: bipush 31
        // 5816: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 5819: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5822: aastore
        // 5823: dup
        // 5824: bipush 31
        // 5826: ldc_w "twenty one"
        // 5829: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5832: bipush 21
        // 5834: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 5837: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5840: aastore
        // 5841: dup
        // 5842: bipush 32
        // 5844: ldc_w "twenty two"
        // 5847: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5850: bipush 22
        // 5852: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 5855: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5858: aastore
        // 5859: dup
        // 5860: bipush 33
        // 5862: ldc_w "twenty three"
        // 5865: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5868: bipush 23
        // 5870: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 5873: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5876: aastore
        // 5877: dup
        // 5878: bipush 34
        // 5880: ldc_w "twenty four"
        // 5883: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5886: bipush 24
        // 5888: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 5891: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5894: aastore
        // 5895: dup
        // 5896: bipush 35
        // 5898: ldc_w "twenty five"
        // 5901: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5904: bipush 25
        // 5906: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 5909: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5912: aastore
        // 5913: dup
        // 5914: bipush 36
        // 5916: ldc_w "twenty six"
        // 5919: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5922: bipush 26
        // 5924: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 5927: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5930: aastore
        // 5931: dup
        // 5932: bipush 37
        // 5934: ldc_w "twenty seven"
        // 5937: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5940: bipush 27
        // 5942: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 5945: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5948: aastore
        // 5949: dup
        // 5950: bipush 38
        // 5952: ldc_w "twenty eight"
        // 5955: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5958: bipush 28
        // 5960: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 5963: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5966: aastore
        // 5967: dup
        // 5968: bipush 39
        // 5970: ldc_w "twenty nine"
        // 5973: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5976: bipush 29
        // 5978: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 5981: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 5984: aastore
        // 5985: dup
        // 5986: bipush 40
        // 5988: ldc_w "thirty one"
        // 5991: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 5994: bipush 31
        // 5996: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 5999: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6002: aastore
        // 6003: dup
        // 6004: bipush 41
        // 6006: ldc_w "first"
        // 6009: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6012: getstatic
        // com/cyc/cycjava/cycl/ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 6015: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6018: aastore
        // 6019: dup
        // 6020: bipush 42
        // 6022: ldc_w "second"
        // 6025: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6028: getstatic
        // com/cyc/cycjava/cycl/TWO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 6031: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6034: aastore
        // 6035: dup
        // 6036: bipush 43
        // 6038: ldc_w "third"
        // 6041: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6044: getstatic
        // com/cyc/cycjava/cycl/THREE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 6047: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6050: aastore
        // 6051: dup
        // 6052: bipush 44
        // 6054: ldc_w "fourth"
        // 6057: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6060: getstatic
        // com/cyc/cycjava/cycl/FOUR_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 6063: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6066: aastore
        // 6067: dup
        // 6068: bipush 45
        // 6070: ldc_w "fifth"
        // 6073: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6076: getstatic
        // com/cyc/cycjava/cycl/FIVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 6079: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6082: aastore
        // 6083: dup
        // 6084: bipush 46
        // 6086: ldc_w "sixth"
        // 6089: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6092: getstatic
        // com/cyc/cycjava/cycl/SIX_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 6095: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6098: aastore
        // 6099: dup
        // 6100: bipush 47
        // 6102: ldc_w "seventh"
        // 6105: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6108: getstatic
        // com/cyc/cycjava/cycl/SEVEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 6111: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6114: aastore
        // 6115: dup
        // 6116: bipush 48
        // 6118: ldc_w "eighth"
        // 6121: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6124: getstatic
        // com/cyc/cycjava/cycl/EIGHT_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 6127: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6130: aastore
        // 6131: dup
        // 6132: bipush 49
        // 6134: ldc_w "ninth"
        // 6137: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6140: getstatic
        // com/cyc/cycjava/cycl/NINE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 6143: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6146: aastore
        // 6147: dup
        // 6148: bipush 50
        // 6150: ldc_w "tenth"
        // 6153: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6156: getstatic
        // com/cyc/cycjava/cycl/TEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 6159: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6162: aastore
        // 6163: dup
        // 6164: bipush 51
        // 6166: ldc_w "eleventh"
        // 6169: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6172: getstatic
        // com/cyc/cycjava/cycl/ELEVEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 6175: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6178: aastore
        // 6179: dup
        // 6180: bipush 52
        // 6182: ldc_w "twelfth"
        // 6185: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6188: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 6191: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6194: aastore
        // 6195: dup
        // 6196: bipush 53
        // 6198: ldc_w "thirteenth"
        // 6201: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6204: getstatic
        // com/cyc/cycjava/cycl/THIRTEEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 6207: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6210: aastore
        // 6211: dup
        // 6212: bipush 54
        // 6214: ldc_w "fourteenth"
        // 6217: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6220: getstatic
        // com/cyc/cycjava/cycl/FOURTEEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 6223: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6226: aastore
        // 6227: dup
        // 6228: bipush 55
        // 6230: ldc_w "fifteenth"
        // 6233: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6236: getstatic
        // com/cyc/cycjava/cycl/FIFTEEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 6239: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6242: aastore
        // 6243: dup
        // 6244: bipush 56
        // 6246: ldc_w "sixteenth"
        // 6249: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6252: getstatic
        // com/cyc/cycjava/cycl/SIXTEEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 6255: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6258: aastore
        // 6259: dup
        // 6260: bipush 57
        // 6262: ldc_w "seventeenth"
        // 6265: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6268: getstatic
        // com/cyc/cycjava/cycl/SEVENTEEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 6271: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6274: aastore
        // 6275: dup
        // 6276: bipush 58
        // 6278: ldc_w "eighteenth"
        // 6281: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6284: getstatic
        // com/cyc/cycjava/cycl/EIGHTEEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 6287: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6290: aastore
        // 6291: dup
        // 6292: bipush 59
        // 6294: ldc_w "nineteenth"
        // 6297: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6300: getstatic
        // com/cyc/cycjava/cycl/NINETEEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 6303: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6306: aastore
        // 6307: dup
        // 6308: bipush 60
        // 6310: ldc_w "twentieth"
        // 6313: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6316: getstatic
        // com/cyc/cycjava/cycl/TWENTY_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 6319: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6322: aastore
        // 6323: dup
        // 6324: bipush 61
        // 6326: ldc_w "twenty-first"
        // 6329: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6332: bipush 21
        // 6334: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6337: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6340: aastore
        // 6341: dup
        // 6342: bipush 62
        // 6344: ldc_w "twenty-second"
        // 6347: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6350: bipush 22
        // 6352: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6355: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6358: aastore
        // 6359: dup
        // 6360: bipush 63
        // 6362: ldc_w "twenty-third"
        // 6365: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6368: bipush 23
        // 6370: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6373: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6376: aastore
        // 6377: dup
        // 6378: bipush 64
        // 6380: ldc_w "twenty-fourth"
        // 6383: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6386: bipush 24
        // 6388: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6391: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6394: aastore
        // 6395: dup
        // 6396: bipush 65
        // 6398: ldc_w "twenty-fifth"
        // 6401: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6404: bipush 25
        // 6406: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6409: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6412: aastore
        // 6413: dup
        // 6414: bipush 66
        // 6416: ldc_w "twenty-sixth"
        // 6419: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6422: bipush 26
        // 6424: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6427: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6430: aastore
        // 6431: dup
        // 6432: bipush 67
        // 6434: ldc_w "twenty-seventh"
        // 6437: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6440: bipush 27
        // 6442: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6445: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6448: aastore
        // 6449: dup
        // 6450: bipush 68
        // 6452: ldc_w "twenty-eighth"
        // 6455: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6458: bipush 28
        // 6460: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6463: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6466: aastore
        // 6467: dup
        // 6468: bipush 69
        // 6470: ldc_w "twenty-ninth"
        // 6473: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6476: bipush 29
        // 6478: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6481: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6484: aastore
        // 6485: dup
        // 6486: bipush 70
        // 6488: ldc_w "thirtieth"
        // 6491: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6494: bipush 30
        // 6496: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6499: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6502: aastore
        // 6503: dup
        // 6504: bipush 71
        // 6506: ldc_w "thirty-first"
        // 6509: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6512: bipush 31
        // 6514: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6517: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6520: aastore
        // 6521: dup
        // 6522: bipush 72
        // 6524: ldc_w "twenty first"
        // 6527: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6530: bipush 21
        // 6532: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6535: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6538: aastore
        // 6539: dup
        // 6540: bipush 73
        // 6542: ldc_w "twenty second"
        // 6545: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6548: bipush 22
        // 6550: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6553: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6556: aastore
        // 6557: dup
        // 6558: bipush 74
        // 6560: ldc_w "twenty third"
        // 6563: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6566: bipush 23
        // 6568: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6571: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6574: aastore
        // 6575: dup
        // 6576: bipush 75
        // 6578: ldc_w "twenty fourth"
        // 6581: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6584: bipush 24
        // 6586: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6589: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6592: aastore
        // 6593: dup
        // 6594: bipush 76
        // 6596: ldc_w "twenty fifth"
        // 6599: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6602: bipush 25
        // 6604: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6607: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6610: aastore
        // 6611: dup
        // 6612: bipush 77
        // 6614: ldc_w "twenty sixth"
        // 6617: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6620: bipush 26
        // 6622: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6625: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6628: aastore
        // 6629: dup
        // 6630: bipush 78
        // 6632: ldc_w "twenty seventh"
        // 6635: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6638: bipush 27
        // 6640: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6643: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6646: aastore
        // 6647: dup
        // 6648: bipush 79
        // 6650: ldc_w "twenty eighth"
        // 6653: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6656: bipush 28
        // 6658: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6661: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6664: aastore
        // 6665: dup
        // 6666: bipush 80
        // 6668: ldc_w "twenty ninth"
        // 6671: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6674: bipush 29
        // 6676: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6679: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6682: aastore
        // 6683: dup
        // 6684: bipush 81
        // 6686: ldc_w "thirty first"
        // 6689: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6692: bipush 31
        // 6694: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6697: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6700: aastore
        // 6701: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:([Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6704: putstatic
        // com/cyc/cycjava/cycl/$list228:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6707: ldc_w "KEY"
        // 6710: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 6713: ldc_w "VALUE"
        // 6716: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 6719: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6722: putstatic
        // com/cyc/cycjava/cycl/$list229:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6725: bipush 32
        // 6727: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6730: putstatic
        // com/cyc/cycjava/cycl/$int230$32:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 6733: ldc_w "January"
        // 6736: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6739: ldc_w "Jan"
        // 6742: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6745: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6748: putstatic
        // com/cyc/cycjava/cycl/$list231:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6751: ldc_w "February"
        // 6754: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6757: ldc_w "Feb"
        // 6760: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6763: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6766: putstatic
        // com/cyc/cycjava/cycl/$list232:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6769: ldc_w "March"
        // 6772: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6775: ldc_w "mar"
        // 6778: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6781: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6784: putstatic
        // com/cyc/cycjava/cycl/$list233:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6787: ldc_w "April"
        // 6790: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6793: ldc_w "Apr"
        // 6796: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6799: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6802: putstatic
        // com/cyc/cycjava/cycl/$list234:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6805: ldc_w "May"
        // 6808: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6811: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6814: putstatic
        // com/cyc/cycjava/cycl/$list235:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6817: ldc_w "June"
        // 6820: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6823: ldc_w "Jun"
        // 6826: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6829: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6832: putstatic
        // com/cyc/cycjava/cycl/$list236:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6835: ldc_w "July"
        // 6838: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6841: ldc_w "Jul"
        // 6844: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6847: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6850: putstatic
        // com/cyc/cycjava/cycl/$list237:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6853: ldc_w "August"
        // 6856: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6859: ldc_w "Aug"
        // 6862: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6865: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6868: putstatic
        // com/cyc/cycjava/cycl/$list238:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6871: ldc_w "September"
        // 6874: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6877: ldc_w "Sept"
        // 6880: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6883: ldc_w "Sep"
        // 6886: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6889: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6892: putstatic
        // com/cyc/cycjava/cycl/$list239:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6895: ldc_w "October"
        // 6898: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6901: ldc_w "Oct"
        // 6904: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6907: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6910: putstatic
        // com/cyc/cycjava/cycl/$list240:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6913: ldc_w "November"
        // 6916: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6919: ldc_w "Nov"
        // 6922: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6925: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6928: putstatic
        // com/cyc/cycjava/cycl/$list241:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6931: ldc_w "December"
        // 6934: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6937: ldc_w "Dec"
        // 6940: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6943: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6946: putstatic
        // com/cyc/cycjava/cycl/$list242:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 6949: bipush 14
        // 6951: anewarray Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 6954: dup
        // 6955: iconst_0
        // 6956: ldc_w "Sunday"
        // 6959: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6962: aastore
        // 6963: dup
        // 6964: iconst_1
        // 6965: ldc_w "Sun"
        // 6968: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6971: aastore
        // 6972: dup
        // 6973: iconst_2
        // 6974: ldc_w "Monday"
        // 6977: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6980: aastore
        // 6981: dup
        // 6982: iconst_3
        // 6983: ldc_w "Mon"
        // 6986: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6989: aastore
        // 6990: dup
        // 6991: iconst_4
        // 6992: ldc_w "Tuesday"
        // 6995: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 6998: aastore
        // 6999: dup
        // 7000: iconst_5
        // 7001: ldc_w "Tue"
        // 7004: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7007: aastore
        // 7008: dup
        // 7009: bipush 6
        // 7011: ldc_w "Wednesday"
        // 7014: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7017: aastore
        // 7018: dup
        // 7019: bipush 7
        // 7021: ldc_w "Wed"
        // 7024: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7027: aastore
        // 7028: dup
        // 7029: bipush 8
        // 7031: ldc_w "Thursday"
        // 7034: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7037: aastore
        // 7038: dup
        // 7039: bipush 9
        // 7041: ldc_w "Thu"
        // 7044: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7047: aastore
        // 7048: dup
        // 7049: bipush 10
        // 7051: ldc_w "Friday"
        // 7054: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7057: aastore
        // 7058: dup
        // 7059: bipush 11
        // 7061: ldc_w "Fri"
        // 7064: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7067: aastore
        // 7068: dup
        // 7069: bipush 12
        // 7071: ldc_w "Saturday"
        // 7074: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7077: aastore
        // 7078: dup
        // 7079: bipush 13
        // 7081: ldc_w "Sat"
        // 7084: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7087: aastore
        // 7088: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:([Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7091: putstatic
        // com/cyc/cycjava/cycl/$list243:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7094: bipush 11
        // 7096: anewarray Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 7099: dup
        // 7100: iconst_0
        // 7101: ldc_w "UT"
        // 7104: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7107: aastore
        // 7108: dup
        // 7109: iconst_1
        // 7110: ldc_w "GMT"
        // 7113: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7116: aastore
        // 7117: dup
        // 7118: iconst_2
        // 7119: ldc_w "EST"
        // 7122: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7125: aastore
        // 7126: dup
        // 7127: iconst_3
        // 7128: ldc_w "EDT"
        // 7131: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7134: aastore
        // 7135: dup
        // 7136: iconst_4
        // 7137: ldc_w "CST"
        // 7140: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7143: aastore
        // 7144: dup
        // 7145: iconst_5
        // 7146: ldc_w "CDT"
        // 7149: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7152: aastore
        // 7153: dup
        // 7154: bipush 6
        // 7156: ldc_w "MST"
        // 7159: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7162: aastore
        // 7163: dup
        // 7164: bipush 7
        // 7166: ldc_w "MDT"
        // 7169: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7172: aastore
        // 7173: dup
        // 7174: bipush 8
        // 7176: ldc_w "PST"
        // 7179: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7182: aastore
        // 7183: dup
        // 7184: bipush 9
        // 7186: ldc_w "PDT"
        // 7189: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7192: aastore
        // 7193: dup
        // 7194: bipush 10
        // 7196: ldc_w "Z"
        // 7199: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7202: aastore
        // 7203: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:([Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7206: putstatic
        // com/cyc/cycjava/cycl/$list244:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7209: getstatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/Characters.CHAR_hyphen:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCharacter;
        // 7212: getstatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/Characters.CHAR_plus:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCharacter;
        // 7215: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7218: putstatic
        // com/cyc/cycjava/cycl/$list245:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7221: ldc_w "MONTH-NUMBER-TOKEN?"
        // 7224: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7227: putstatic
        // com/cyc/cycjava/cycl/$sym246$MONTH_NUMBER_TOKEN_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7230: ldc_w "STRING-TO-INTEGER"
        // 7233: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7236: putstatic
        // com/cyc/cycjava/cycl/$sym247$STRING_TO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7239: ldc_w "XML-datetime"
        // 7242: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7245: putstatic
        // com/cyc/cycjava/cycl/$str248$XML_datetime:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7248: ldc_w "~D-~2,'0D-~2,'0DT~2,'0D:~2,'0D:~2,'0DZ"
        // 7251: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7254: putstatic
        // com/cyc/cycjava/cycl/$str249$_D__2__0D__2__0DT_2__0D__2__0D__2:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7257: ldc_w "MySQL-datetime"
        // 7260: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7263: putstatic
        // com/cyc/cycjava/cycl/$str250$MySQL_datetime:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7266: ldc_w "~D-~2,'0D-~2,'0D ~2,'0D:~2,'0D:~2,'0D"
        // 7269: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7272: putstatic
        // com/cyc/cycjava/cycl/$str251$_D__2__0D__2__0D__2__0D__2__0D__2:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7275: ldc_w "CycConstant-datetime"
        // 7278: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7281: putstatic
        // com/cyc/cycjava/cycl/$str252$CycConstant_datetime:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7284: ldc_w "~4,'0D~2,'0D~2,'0Dh~2,'0Dm~2,'0Ds~2,'0Dp~3,'0D"
        // 7287: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7290: putstatic
        // com/cyc/cycjava/cycl/$str253$_4__0D_2__0D_2__0Dh_2__0Dm_2__0Ds:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7293: ldc_w "~4,'0D~2,'0D~2,'0Dh~2,'0Dm~2,'0Ds~2,'0D"
        // 7296: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7299: putstatic
        // com/cyc/cycjava/cycl/$str254$_4__0D_2__0D_2__0Dh_2__0Dm_2__0Ds:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7302: ldc_w "~4,'0D~2,'0D~2,'0Dh~2,'0Dm~2,'0D"
        // 7305: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7308: putstatic
        // com/cyc/cycjava/cycl/$str255$_4__0D_2__0D_2__0Dh_2__0Dm_2__0D:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7311: ldc_w "~4,'0D~2,'0D~2,'0Dh~2,'0D"
        // 7314: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7317: putstatic
        // com/cyc/cycjava/cycl/$str256$_4__0D_2__0D_2__0Dh_2__0D:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7320: ldc_w "~4,'0D~2,'0D~2,'0D"
        // 7323: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7326: putstatic
        // com/cyc/cycjava/cycl/$str257$_4__0D_2__0D_2__0D:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7329: ldc_w "~4,'0D~2,'0D"
        // 7332: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7335: putstatic
        // com/cyc/cycjava/cycl/$str258$_4__0D_2__0D:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7338: ldc_w "~4,'0D"
        // 7341: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7344: putstatic
        // com/cyc/cycjava/cycl/$str259$_4__0D:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7347: ldc_w "DateFromStringFn-datetime"
        // 7350: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7353: putstatic
        // com/cyc/cycjava/cycl/$str260$DateFromStringFn_datetime:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7356: ldc_w "~4,'0D-~2,'0D-~2,'0D ~2,'0D:~2,'0D:~2,'0D.~3,'0D"
        // 7359: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7362: putstatic
        // com/cyc/cycjava/cycl/$str261$_4__0D__2__0D__2__0D__2__0D__2__0:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7365: ldc_w "~4,'0D-~2,'0D-~2,'0D ~2,'0D:~2,'0D:~2,'0D"
        // 7368: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7371: putstatic
        // com/cyc/cycjava/cycl/$str262$_4__0D__2__0D__2__0D__2__0D__2__0:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7374: ldc_w "~4,'0D-~2,'0D-~2,'0D ~2,'0D:~2,'0D"
        // 7377: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7380: putstatic
        // com/cyc/cycjava/cycl/$str263$_4__0D__2__0D__2__0D__2__0D__2__0:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7383: ldc_w "~4,'0D-~2,'0D-~2,'0D ~2,'0D"
        // 7386: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7389: putstatic
        // com/cyc/cycjava/cycl/$str264$_4__0D__2__0D__2__0D__2__0D:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7392: ldc_w "~4,'0D-~2,'0D-~2,'0D"
        // 7395: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7398: putstatic
        // com/cyc/cycjava/cycl/$str265$_4__0D__2__0D__2__0D:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7401: ldc_w "~4,'0D-~2,'0D"
        // 7404: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7407: putstatic
        // com/cyc/cycjava/cycl/$str266$_4__0D__2__0D:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7410: ldc_w "YYYYMMDD"
        // 7413: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7416: putstatic
        // com/cyc/cycjava/cycl/$str267$YYYYMMDD:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7419: ldc_w "~D~2,'0D~2,'0D"
        // 7422: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7425: putstatic
        // com/cyc/cycjava/cycl/$str268$_D_2__0D_2__0D:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7428: ldc_w "HHMMSS"
        // 7431: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7434: putstatic
        // com/cyc/cycjava/cycl/$str269$HHMMSS:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7437: ldc_w "~2,'0D~2,'0D~2,'0D"
        // 7440: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7443: putstatic
        // com/cyc/cycjava/cycl/$str270$_2__0D_2__0D_2__0D:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7446: ldc_w "HH:MM:SS"
        // 7449: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7452: putstatic
        // com/cyc/cycjava/cycl/$str271$HH_MM_SS:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7455: ldc_w "~2,'0D:~2,'0D:~2,'0D"
        // 7458: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7461: putstatic
        // com/cyc/cycjava/cycl/$str272$_2__0D__2__0D__2__0D:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7464: ldc_w "YYYYMMDDHHMM"
        // 7467: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7470: putstatic
        // com/cyc/cycjava/cycl/$str273$YYYYMMDDHHMM:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7473: ldc_w "~4,'0D~2,'0D~2,'0D~2,'0D~2,'0D"
        // 7476: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7479: putstatic
        // com/cyc/cycjava/cycl/$str274$_4__0D_2__0D_2__0D_2__0D_2__0D:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7482: ldc_w "YYYY-MM-DD HH:MM:SS"
        // 7485: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7488: putstatic
        // com/cyc/cycjava/cycl/$str275$YYYY_MM_DD_HH_MM_SS:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7491: ldc_w "YYYY-MM-DDTHH:MM:SS"
        // 7494: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7497: putstatic
        // com/cyc/cycjava/cycl/$str276$YYYY_MM_DDTHH_MM_SS:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7500: ldc_w "YYYYMMDDHHMMSS"
        // 7503: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7506: putstatic
        // com/cyc/cycjava/cycl/$str277$YYYYMMDDHHMMSS:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7509: ldc_w "~D-~2,'0D-~2,'0DT~2,'0D:~2,'0D:~2,'0D"
        // 7512: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7515: putstatic
        // com/cyc/cycjava/cycl/$str278$_D__2__0D__2__0DT_2__0D__2__0D__2:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7518: ldc_w "~4,'0D~2,'0D~2,'0D~2,'0D~2,'0D~2,'0D"
        // 7521: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7524: putstatic
        // com/cyc/cycjava/cycl/$str279$_4__0D_2__0D_2__0D_2__0D_2__0D_2_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7527: ldc_w "YYYY-MM-DD"
        // 7530: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7533: putstatic
        // com/cyc/cycjava/cycl/$str280$YYYY_MM_DD:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7536: ldc_w "~D-~2,'0D-~2,'0D"
        // 7539: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7542: putstatic
        // com/cyc/cycjava/cycl/$str281$_D__2__0D__2__0D:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7545: ldc_w "YYYY-MM-DD HH:MM:SS.S"
        // 7548: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7551: ldc_w "YYYY-MM-DDTHH:MM:SS"
        // 7554: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7557: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7560: putstatic
        // com/cyc/cycjava/cycl/$list282:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7563: ldc_w "-"
        // 7566: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7569: ldc_w " "
        // 7572: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7575: ldc_w ":"
        // 7578: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7581: ldc_w "."
        // 7584: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7587: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7590: putstatic
        // com/cyc/cycjava/cycl/$list283:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7593: ldc_w "&OPTIONAL"
        // 7596: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7599: ldc_w "YEAR"
        // 7602: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7605: ldc_w "MONTH"
        // 7608: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7611: ldc_w "DAY"
        // 7614: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7617: ldc_w "HOUR"
        // 7620: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7623: ldc_w "MINUTE"
        // 7626: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7629: ldc_w "SECOND"
        // 7632: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7635: ldc_w "DECISECOND"
        // 7638: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7641: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7644: putstatic
        // com/cyc/cycjava/cycl/$list284:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7647: bipush 21
        // 7649: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 7652: putstatic
        // com/cyc/cycjava/cycl/$int285$21:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 7655: ldc_w "-"
        // 7658: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7661: ldc_w " "
        // 7664: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7667: ldc_w ":"
        // 7670: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7673: ldc_w "."
        // 7676: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7679: ldc_w "T"
        // 7682: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7685: ldc_w "t"
        // 7688: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7691: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7694: putstatic
        // com/cyc/cycjava/cycl/$list286:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7697: ldc_w "D"
        // 7700: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7703: putstatic
        // com/cyc/cycjava/cycl/$str287$D:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7706: ldc_w "H:MM:SS"
        // 7709: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7712: putstatic
        // com/cyc/cycjava/cycl/$str288$H_MM_SS:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7715: ldc_w "~D:~2,'0D:~2,'0D"
        // 7718: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7721: putstatic
        // com/cyc/cycjava/cycl/$str289$_D__2__0D__2__0D:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7724: ldc_w "HHMM"
        // 7727: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7730: putstatic
        // com/cyc/cycjava/cycl/$str290$HHMM:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7733: ldc_w "~2,'0D~2,'0D"
        // 7736: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7739: putstatic
        // com/cyc/cycjava/cycl/$str291$_2__0D_2__0D:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7742: ldc_w ":cont"
        // 7745: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7748: putstatic
        // com/cyc/cycjava/cycl/$str292$_cont:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7751: ldc_w "The template ~A is not currently handled."
        // 7754: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7757: putstatic
        // com/cyc/cycjava/cycl/$str293$The_template__A_is_not_currently_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7760: getstatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/Characters.CHAR_colon:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLCharacter;
        // 7763: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7766: putstatic
        // com/cyc/cycjava/cycl/$list294:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7769: ldc_w "Date"
        // 7772: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7775: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 7778: putstatic
        // com/cyc/cycjava/cycl/$const295$Date:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 7781: ldc_w "laterThan"
        // 7784: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7787: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 7790: putstatic
        // com/cyc/cycjava/cycl/$const296$laterThan:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 7793: ldc_w "DATE-AFTER"
        // 7796: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7799: putstatic
        // com/cyc/cycjava/cycl/$sym297$DATE_AFTER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7802: ldc_w "TEST"
        // 7805: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7808: putstatic
        // com/cyc/cycjava/cycl/$kw298$TEST:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7811: ldc_w "OWNER"
        // 7814: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7817: putstatic
        // com/cyc/cycjava/cycl/$kw299$OWNER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7820: ldc_w "CLASSES"
        // 7823: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7826: putstatic
        // com/cyc/cycjava/cycl/$kw300$CLASSES:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7829: ldc_w "KB"
        // 7832: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7835: putstatic
        // com/cyc/cycjava/cycl/$kw301$KB:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7838: ldc_w "FULL"
        // 7841: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7844: putstatic
        // com/cyc/cycjava/cycl/$kw302$FULL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7847: ldc_w "WORKING?"
        // 7850: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7853: putstatic
        // com/cyc/cycjava/cycl/$kw303$WORKING_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 7856: ldc_w "SecondFn"
        // 7859: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7862: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 7865: bipush 59
        // 7867: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 7870: ldc_w "MinuteFn"
        // 7873: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7876: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 7879: bipush 59
        // 7881: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 7884: ldc_w "HourFn"
        // 7887: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7890: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 7893: getstatic
        // com/cyc/cycjava/cycl/NINE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 7896: ldc_w "DayFn"
        // 7899: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7902: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 7905: getstatic
        // com/cyc/cycjava/cycl/TEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 7908: ldc_w "MonthFn"
        // 7911: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7914: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 7917: ldc_w "January"
        // 7920: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7923: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 7926: ldc_w "YearFn"
        // 7929: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7932: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 7935: sipush 2000
        // 7938: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 7941: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7944: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7947: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7950: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7953: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7956: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7959: ldc_w "HoursDuration"
        // 7962: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7965: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 7968: ldc2_w 2.5
        // 7971: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeDouble:(D)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLDoubleFloat;
        // 7974: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7977: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 7980: ldc_w "SecondFn"
        // 7983: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 7986: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 7989: bipush 59
        // 7991: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 7994: ldc_w "MinuteFn"
        // 7997: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8000: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8003: bipush 29
        // 8005: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 8008: ldc_w "HourFn"
        // 8011: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8014: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8017: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 8020: ldc_w "DayFn"
        // 8023: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8026: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8029: getstatic
        // com/cyc/cycjava/cycl/TEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 8032: ldc_w "MonthFn"
        // 8035: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8038: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8041: ldc_w "January"
        // 8044: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8047: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8050: ldc_w "YearFn"
        // 8053: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8056: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8059: sipush 2000
        // 8062: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 8065: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8068: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8071: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8074: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8077: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8080: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8083: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8086: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8089: putstatic
        // com/cyc/cycjava/cycl/$list304:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8092: ldc_w "PARSE-DATE-W/OUT-TWO-DIGIT-YEARS"
        // 8095: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 8098: putstatic
        // com/cyc/cycjava/cycl/$sym305$PARSE_DATE_W_OUT_TWO_DIGIT_YEARS:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 8101: ldc_w "DATE-TEST-CASE-TABLES"
        // 8104: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 8107: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8110: putstatic
        // com/cyc/cycjava/cycl/$list306:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8113: ldc_w "December 20"
        // 8116: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8119: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8122: ldc_w "DayFn"
        // 8125: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8128: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8131: getstatic
        // com/cyc/cycjava/cycl/TWENTY_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 8134: ldc_w "MonthFn"
        // 8137: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8140: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8143: ldc_w "December"
        // 8146: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8149: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8152: ldc_w "TheYear-Indexical"
        // 8155: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8158: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8161: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8164: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8167: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8170: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8173: ldc_w "12/20"
        // 8176: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8179: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8182: ldc_w "DayFn"
        // 8185: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8188: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8191: getstatic
        // com/cyc/cycjava/cycl/TWENTY_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 8194: ldc_w "MonthFn"
        // 8197: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8200: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8203: ldc_w "December"
        // 8206: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8209: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8212: ldc_w "TheYear-Indexical"
        // 8215: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8218: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8221: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8224: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8227: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8230: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8233: ldc_w "12/20/18"
        // 8236: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8239: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8242: getstatic
        // com/cyc/cycjava/cycl/NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        // 8245: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8248: ldc_w "12/20/1918"
        // 8251: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8254: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8257: ldc_w "DayFn"
        // 8260: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8263: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8266: getstatic
        // com/cyc/cycjava/cycl/TWENTY_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 8269: ldc_w "MonthFn"
        // 8272: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8275: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8278: ldc_w "December"
        // 8281: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8284: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8287: ldc_w "YearFn"
        // 8290: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8293: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8296: sipush 1918
        // 8299: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 8302: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8305: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8308: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8311: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8314: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8317: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8320: putstatic
        // com/cyc/cycjava/cycl/$list307:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8323: ldc_w "LEAP-YEAR-P"
        // 8326: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 8329: putstatic
        // com/cyc/cycjava/cycl/$sym308$LEAP_YEAR_P:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 8332: sipush 2000
        // 8335: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 8338: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8341: getstatic
        // com/cyc/cycjava/cycl/T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        // 8344: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8347: sipush 1900
        // 8350: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 8353: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8356: getstatic
        // com/cyc/cycjava/cycl/NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        // 8359: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8362: sipush 2004
        // 8365: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 8368: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8371: getstatic
        // com/cyc/cycjava/cycl/T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        // 8374: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8377: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8380: putstatic
        // com/cyc/cycjava/cycl/$list309:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8383: ldc_w "YearFn"
        // 8386: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8389: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8392: sipush 2000
        // 8395: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 8398: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8401: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8404: getstatic
        // com/cyc/cycjava/cycl/T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        // 8407: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8410: ldc_w "CenturyFn"
        // 8413: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8416: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8419: getstatic
        // com/cyc/cycjava/cycl/TWENTY_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 8422: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8425: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8428: getstatic
        // com/cyc/cycjava/cycl/T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        // 8431: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8434: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8437: putstatic
        // com/cyc/cycjava/cycl/$list310:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8440: ldc_w "HourFn"
        // 8443: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8446: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8449: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 8452: ldc_w "DayFn"
        // 8455: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8458: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8461: bipush 23
        // 8463: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 8466: ldc_w "MonthFn"
        // 8469: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8472: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8475: ldc_w "January"
        // 8478: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8481: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8484: ldc_w "YearFn"
        // 8487: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8490: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8493: sipush 2000
        // 8496: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 8499: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8502: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8505: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8508: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8511: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8514: getstatic
        // com/cyc/cycjava/cycl/T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        // 8517: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8520: ldc_w "YearFn"
        // 8523: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8526: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8529: sipush 2000
        // 8532: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 8535: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8538: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8541: getstatic
        // com/cyc/cycjava/cycl/NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        // 8544: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8547: ldc_w "CenturyFn"
        // 8550: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8553: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8556: getstatic
        // com/cyc/cycjava/cycl/TWENTY_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 8559: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8562: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8565: getstatic
        // com/cyc/cycjava/cycl/NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        // 8568: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8571: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8574: putstatic
        // com/cyc/cycjava/cycl/$list311:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8577: ldc_w "DATE-PRECISION"
        // 8580: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 8583: putstatic
        // com/cyc/cycjava/cycl/$sym312$DATE_PRECISION:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 8586: ldc_w "HourFn"
        // 8589: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8592: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8595: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 8598: ldc_w "DayFn"
        // 8601: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8604: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8607: bipush 23
        // 8609: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 8612: ldc_w "MonthFn"
        // 8615: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8618: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8621: ldc_w "January"
        // 8624: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8627: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8630: ldc_w "YearFn"
        // 8633: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8636: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8639: sipush 2000
        // 8642: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 8645: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8648: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8651: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8654: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8657: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8660: ldc_w "CalendarHour"
        // 8663: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8666: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8669: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8672: ldc_w "MinuteFn"
        // 8675: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8678: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8681: bipush 42
        // 8683: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 8686: ldc_w "HourFn"
        // 8689: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8692: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8695: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 8698: ldc_w "DayFn"
        // 8701: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8704: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8707: bipush 23
        // 8709: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 8712: ldc_w "MonthFn"
        // 8715: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8718: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8721: ldc_w "January"
        // 8724: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8727: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8730: ldc_w "YearFn"
        // 8733: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8736: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8739: sipush 2000
        // 8742: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 8745: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8748: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8751: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8754: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8757: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8760: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8763: ldc_w "CalendarMinute"
        // 8766: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8769: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8772: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8775: ldc_w "SecondFn"
        // 8778: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8781: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8784: getstatic
        // com/cyc/cycjava/cycl/FIVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 8787: ldc_w "MinuteFn"
        // 8790: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8793: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8796: bipush 42
        // 8798: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 8801: ldc_w "HourFn"
        // 8804: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8807: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8810: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 8813: ldc_w "DayFn"
        // 8816: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8819: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8822: bipush 23
        // 8824: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 8827: ldc_w "MonthFn"
        // 8830: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8833: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8836: ldc_w "January"
        // 8839: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8842: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8845: ldc_w "YearFn"
        // 8848: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8851: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8854: sipush 2000
        // 8857: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 8860: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8863: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8866: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8869: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8872: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8875: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8878: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8881: ldc_w "CalendarSecond"
        // 8884: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8887: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8890: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8893: ldc_w "MilliSecondFn"
        // 8896: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8899: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8902: getstatic
        // com/cyc/cycjava/cycl/SIX_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 8905: ldc_w "SecondFn"
        // 8908: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8911: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8914: getstatic
        // com/cyc/cycjava/cycl/FIVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 8917: ldc_w "MinuteFn"
        // 8920: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8923: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8926: bipush 42
        // 8928: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 8931: ldc_w "HourFn"
        // 8934: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8937: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8940: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 8943: ldc_w "DayFn"
        // 8946: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8949: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8952: bipush 23
        // 8954: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 8957: ldc_w "MonthFn"
        // 8960: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8963: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8966: ldc_w "January"
        // 8969: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8972: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8975: ldc_w "YearFn"
        // 8978: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 8981: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 8984: sipush 2000
        // 8987: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 8990: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8993: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8996: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 8999: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9002: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9005: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9008: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9011: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9014: ldc_w "CalendarMilliSecond"
        // 9017: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9020: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9023: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9026: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9029: putstatic
        // com/cyc/cycjava/cycl/$list313:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9032: ldc_w "EXPLODE-CALENDAR-TIME"
        // 9035: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 9038: putstatic
        // com/cyc/cycjava/cycl/$sym314$EXPLODE_CALENDAR_TIME:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 9041: bipush 9
        // 9043: anewarray Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9046: dup
        // 9047: iconst_0
        // 9048: ldc_w "HourFn"
        // 9051: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9054: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9057: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 9060: ldc_w "DayFn"
        // 9063: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9066: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9069: bipush 23
        // 9071: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9074: ldc_w "MonthFn"
        // 9077: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9080: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9083: ldc_w "January"
        // 9086: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9089: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9092: ldc_w "YearFn"
        // 9095: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9098: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9101: sipush 2000
        // 9104: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9107: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9110: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9113: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9116: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9119: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9122: aastore
        // 9123: dup
        // 9124: iconst_1
        // 9125: ldc_w "CALENDAR"
        // 9128: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 9131: aastore
        // 9132: dup
        // 9133: iconst_2
        // 9134: sipush 2000
        // 9137: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9140: aastore
        // 9141: dup
        // 9142: iconst_3
        // 9143: getstatic
        // com/cyc/cycjava/cycl/ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 9146: aastore
        // 9147: dup
        // 9148: iconst_4
        // 9149: bipush 23
        // 9151: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9154: aastore
        // 9155: dup
        // 9156: iconst_5
        // 9157: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 9160: aastore
        // 9161: dup
        // 9162: bipush 6
        // 9164: getstatic
        // com/cyc/cycjava/cycl/NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        // 9167: aastore
        // 9168: dup
        // 9169: bipush 7
        // 9171: getstatic
        // com/cyc/cycjava/cycl/NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        // 9174: aastore
        // 9175: dup
        // 9176: bipush 8
        // 9178: getstatic
        // com/cyc/cycjava/cycl/NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        // 9181: aastore
        // 9182: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:([Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9185: bipush 9
        // 9187: anewarray Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9190: dup
        // 9191: iconst_0
        // 9192: ldc_w "MinuteFn"
        // 9195: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9198: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9201: bipush 42
        // 9203: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9206: ldc_w "HourFn"
        // 9209: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9212: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9215: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 9218: ldc_w "DayFn"
        // 9221: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9224: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9227: bipush 23
        // 9229: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9232: ldc_w "MonthFn"
        // 9235: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9238: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9241: ldc_w "January"
        // 9244: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9247: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9250: ldc_w "YearFn"
        // 9253: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9256: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9259: sipush 2000
        // 9262: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9265: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9268: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9271: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9274: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9277: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9280: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9283: aastore
        // 9284: dup
        // 9285: iconst_1
        // 9286: ldc_w "CALENDAR"
        // 9289: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 9292: aastore
        // 9293: dup
        // 9294: iconst_2
        // 9295: sipush 2000
        // 9298: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9301: aastore
        // 9302: dup
        // 9303: iconst_3
        // 9304: getstatic
        // com/cyc/cycjava/cycl/ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 9307: aastore
        // 9308: dup
        // 9309: iconst_4
        // 9310: bipush 23
        // 9312: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9315: aastore
        // 9316: dup
        // 9317: iconst_5
        // 9318: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 9321: aastore
        // 9322: dup
        // 9323: bipush 6
        // 9325: bipush 42
        // 9327: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9330: aastore
        // 9331: dup
        // 9332: bipush 7
        // 9334: getstatic
        // com/cyc/cycjava/cycl/NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        // 9337: aastore
        // 9338: dup
        // 9339: bipush 8
        // 9341: getstatic
        // com/cyc/cycjava/cycl/NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        // 9344: aastore
        // 9345: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:([Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9348: bipush 9
        // 9350: anewarray Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9353: dup
        // 9354: iconst_0
        // 9355: ldc_w "SecondFn"
        // 9358: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9361: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9364: getstatic
        // com/cyc/cycjava/cycl/FIVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 9367: ldc_w "MinuteFn"
        // 9370: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9373: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9376: bipush 42
        // 9378: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9381: ldc_w "HourFn"
        // 9384: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9387: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9390: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 9393: ldc_w "DayFn"
        // 9396: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9399: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9402: bipush 23
        // 9404: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9407: ldc_w "MonthFn"
        // 9410: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9413: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9416: ldc_w "January"
        // 9419: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9422: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9425: ldc_w "YearFn"
        // 9428: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9431: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9434: sipush 2000
        // 9437: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9440: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9443: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9446: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9449: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9452: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9455: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9458: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9461: aastore
        // 9462: dup
        // 9463: iconst_1
        // 9464: ldc_w "CALENDAR"
        // 9467: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 9470: aastore
        // 9471: dup
        // 9472: iconst_2
        // 9473: sipush 2000
        // 9476: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9479: aastore
        // 9480: dup
        // 9481: iconst_3
        // 9482: getstatic
        // com/cyc/cycjava/cycl/ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 9485: aastore
        // 9486: dup
        // 9487: iconst_4
        // 9488: bipush 23
        // 9490: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9493: aastore
        // 9494: dup
        // 9495: iconst_5
        // 9496: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 9499: aastore
        // 9500: dup
        // 9501: bipush 6
        // 9503: bipush 42
        // 9505: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9508: aastore
        // 9509: dup
        // 9510: bipush 7
        // 9512: getstatic
        // com/cyc/cycjava/cycl/FIVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 9515: aastore
        // 9516: dup
        // 9517: bipush 8
        // 9519: getstatic
        // com/cyc/cycjava/cycl/NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        // 9522: aastore
        // 9523: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:([Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9526: bipush 9
        // 9528: anewarray Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9531: dup
        // 9532: iconst_0
        // 9533: ldc_w "MilliSecondFn"
        // 9536: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9539: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9542: getstatic
        // com/cyc/cycjava/cycl/SIX_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 9545: ldc_w "SecondFn"
        // 9548: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9551: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9554: getstatic
        // com/cyc/cycjava/cycl/FIVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 9557: ldc_w "MinuteFn"
        // 9560: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9563: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9566: bipush 42
        // 9568: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9571: ldc_w "HourFn"
        // 9574: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9577: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9580: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 9583: ldc_w "DayFn"
        // 9586: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9589: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9592: bipush 23
        // 9594: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9597: ldc_w "MonthFn"
        // 9600: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9603: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9606: ldc_w "January"
        // 9609: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9612: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9615: ldc_w "YearFn"
        // 9618: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9621: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9624: sipush 2000
        // 9627: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9630: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9633: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9636: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9639: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9642: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9645: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9648: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9651: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9654: aastore
        // 9655: dup
        // 9656: iconst_1
        // 9657: ldc_w "CALENDAR"
        // 9660: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeKeyword:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 9663: aastore
        // 9664: dup
        // 9665: iconst_2
        // 9666: sipush 2000
        // 9669: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9672: aastore
        // 9673: dup
        // 9674: iconst_3
        // 9675: getstatic
        // com/cyc/cycjava/cycl/ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 9678: aastore
        // 9679: dup
        // 9680: iconst_4
        // 9681: bipush 23
        // 9683: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9686: aastore
        // 9687: dup
        // 9688: iconst_5
        // 9689: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 9692: aastore
        // 9693: dup
        // 9694: bipush 6
        // 9696: bipush 42
        // 9698: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9701: aastore
        // 9702: dup
        // 9703: bipush 7
        // 9705: getstatic
        // com/cyc/cycjava/cycl/FIVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 9708: aastore
        // 9709: dup
        // 9710: bipush 8
        // 9712: getstatic
        // com/cyc/cycjava/cycl/SIX_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 9715: aastore
        // 9716: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:([Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9719: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9722: putstatic
        // com/cyc/cycjava/cycl/$list315:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9725: ldc_w "CYCL-DATE-TO-UNIVERSAL-TIME"
        // 9728: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 9731: putstatic
        // com/cyc/cycjava/cycl/$sym316$CYCL_DATE_TO_UNIVERSAL_TIME:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 9734: ldc_w "HourFn"
        // 9737: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9740: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9743: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 9746: ldc_w "DayFn"
        // 9749: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9752: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9755: bipush 23
        // 9757: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9760: ldc_w "MonthFn"
        // 9763: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9766: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9769: ldc_w "January"
        // 9772: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9775: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9778: ldc_w "YearFn"
        // 9781: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9784: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9787: sipush 2000
        // 9790: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9793: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9796: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9799: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9802: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9805: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9808: ldc_w "3157639200"
        // 9811: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9814: getstatic
        // com/cyc/cycjava/cycl/NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        // 9817: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9820: ldc_w "MinuteFn"
        // 9823: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9826: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9829: bipush 42
        // 9831: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9834: ldc_w "HourFn"
        // 9837: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9840: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9843: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 9846: ldc_w "DayFn"
        // 9849: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9852: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9855: bipush 23
        // 9857: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9860: ldc_w "MonthFn"
        // 9863: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9866: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9869: ldc_w "January"
        // 9872: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9875: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9878: ldc_w "YearFn"
        // 9881: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9884: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9887: sipush 2000
        // 9890: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9893: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9896: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9899: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9902: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9905: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9908: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9911: ldc_w "3157641720"
        // 9914: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9917: getstatic
        // com/cyc/cycjava/cycl/NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        // 9920: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 9923: ldc_w "SecondFn"
        // 9926: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9929: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9932: getstatic
        // com/cyc/cycjava/cycl/FIVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 9935: ldc_w "MinuteFn"
        // 9938: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9941: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9944: bipush 42
        // 9946: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9949: ldc_w "HourFn"
        // 9952: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9955: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9958: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 9961: ldc_w "DayFn"
        // 9964: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9967: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9970: bipush 23
        // 9972: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 9975: ldc_w "MonthFn"
        // 9978: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9981: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9984: ldc_w "January"
        // 9987: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9990: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 9993: ldc_w "YearFn"
        // 9996: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 9999: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10002: sipush 2000
        // 10005: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10008: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10011: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10014: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10017: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10020: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10023: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10026: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10029: ldc_w "3157641725"
        // 10032: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10035: getstatic
        // com/cyc/cycjava/cycl/NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        // 10038: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10041: ldc_w "MilliSecondFn"
        // 10044: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10047: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10050: getstatic
        // com/cyc/cycjava/cycl/SIX_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 10053: ldc_w "SecondFn"
        // 10056: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10059: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10062: getstatic
        // com/cyc/cycjava/cycl/FIVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 10065: ldc_w "MinuteFn"
        // 10068: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10071: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10074: bipush 42
        // 10076: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10079: ldc_w "HourFn"
        // 10082: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10085: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10088: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 10091: ldc_w "DayFn"
        // 10094: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10097: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10100: bipush 23
        // 10102: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10105: ldc_w "MonthFn"
        // 10108: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10111: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10114: ldc_w "January"
        // 10117: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10120: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10123: ldc_w "YearFn"
        // 10126: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10129: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10132: sipush 2000
        // 10135: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10138: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10141: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10144: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10147: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10150: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10153: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10156: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10159: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10162: ldc_w "3157641725"
        // 10165: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10168: getstatic
        // com/cyc/cycjava/cycl/SIX_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 10171: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10174: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10177: putstatic
        // com/cyc/cycjava/cycl/$list317:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10180: ldc_w "MILLISECONDSTRING"
        // 10183: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 10186: putstatic
        // com/cyc/cycjava/cycl/$sym318$MILLISECONDSTRING:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 10189: ldc_w "HourFn"
        // 10192: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10195: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10198: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 10201: ldc_w "DayFn"
        // 10204: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10207: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10210: bipush 23
        // 10212: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10215: ldc_w "MonthFn"
        // 10218: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10221: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10224: ldc_w "January"
        // 10227: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10230: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10233: ldc_w "YearFn"
        // 10236: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10239: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10242: sipush 2000
        // 10245: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10248: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10251: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10254: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10257: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10260: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10263: ldc_w "12:00:00.000"
        // 10266: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10269: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10272: ldc_w "MinuteFn"
        // 10275: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10278: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10281: bipush 42
        // 10283: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10286: ldc_w "HourFn"
        // 10289: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10292: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10295: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 10298: ldc_w "DayFn"
        // 10301: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10304: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10307: bipush 23
        // 10309: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10312: ldc_w "MonthFn"
        // 10315: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10318: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10321: ldc_w "January"
        // 10324: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10327: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10330: ldc_w "YearFn"
        // 10333: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10336: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10339: sipush 2000
        // 10342: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10345: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10348: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10351: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10354: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10357: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10360: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10363: ldc_w "12:42:00.000"
        // 10366: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10369: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10372: ldc_w "SecondFn"
        // 10375: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10378: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10381: getstatic
        // com/cyc/cycjava/cycl/FIVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 10384: ldc_w "MinuteFn"
        // 10387: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10390: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10393: bipush 42
        // 10395: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10398: ldc_w "HourFn"
        // 10401: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10404: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10407: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 10410: ldc_w "DayFn"
        // 10413: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10416: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10419: bipush 23
        // 10421: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10424: ldc_w "MonthFn"
        // 10427: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10430: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10433: ldc_w "January"
        // 10436: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10439: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10442: ldc_w "YearFn"
        // 10445: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10448: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10451: sipush 2000
        // 10454: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10457: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10460: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10463: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10466: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10469: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10472: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10475: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10478: ldc_w "12:42:05.000"
        // 10481: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10484: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10487: ldc_w "MilliSecondFn"
        // 10490: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10493: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10496: getstatic
        // com/cyc/cycjava/cycl/SIX_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 10499: ldc_w "SecondFn"
        // 10502: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10505: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10508: getstatic
        // com/cyc/cycjava/cycl/FIVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 10511: ldc_w "MinuteFn"
        // 10514: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10517: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10520: bipush 42
        // 10522: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10525: ldc_w "HourFn"
        // 10528: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10531: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10534: getstatic
        // com/cyc/cycjava/cycl/TWELVE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 10537: ldc_w "DayFn"
        // 10540: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10543: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10546: bipush 23
        // 10548: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10551: ldc_w "MonthFn"
        // 10554: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10557: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10560: ldc_w "January"
        // 10563: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10566: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10569: ldc_w "YearFn"
        // 10572: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10575: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10578: sipush 2000
        // 10581: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10584: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10587: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10590: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10593: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10596: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10599: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10602: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10605: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10608: ldc_w "12:42:05.006"
        // 10611: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10614: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10617: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10620: putstatic
        // com/cyc/cycjava/cycl/$list319:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10623: ldc_w "DATE-REDUCED-TO-START"
        // 10626: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 10629: putstatic
        // com/cyc/cycjava/cycl/$sym320$DATE_REDUCED_TO_START:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 10632: ldc_w "YearFn"
        // 10635: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10638: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10641: sipush 2004
        // 10644: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10647: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10650: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10653: ldc_w "YearFn"
        // 10656: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10659: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10662: sipush 2004
        // 10665: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10668: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10671: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10674: ldc_w "MonthFn"
        // 10677: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10680: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10683: ldc_w "January"
        // 10686: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10689: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10692: ldc_w "YearFn"
        // 10695: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10698: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10701: sipush 2004
        // 10704: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10707: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10710: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10713: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10716: ldc_w "YearFn"
        // 10719: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10722: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10725: sipush 2004
        // 10728: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10731: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10734: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10737: ldc_w "DayFn"
        // 10740: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10743: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10746: getstatic
        // com/cyc/cycjava/cycl/ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 10749: ldc_w "MonthFn"
        // 10752: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10755: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10758: ldc_w "January"
        // 10761: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10764: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10767: ldc_w "YearFn"
        // 10770: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10773: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10776: sipush 2004
        // 10779: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10782: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10785: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10788: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10791: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10794: ldc_w "YearFn"
        // 10797: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10800: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10803: sipush 2004
        // 10806: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10809: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10812: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10815: ldc_w "HourFn"
        // 10818: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10821: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10824: getstatic
        // com/cyc/cycjava/cycl/ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 10827: ldc_w "DayFn"
        // 10830: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10833: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10836: getstatic
        // com/cyc/cycjava/cycl/ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 10839: ldc_w "MonthFn"
        // 10842: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10845: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10848: ldc_w "January"
        // 10851: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10854: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10857: ldc_w "YearFn"
        // 10860: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10863: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10866: sipush 2004
        // 10869: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10872: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10875: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10878: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10881: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10884: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10887: ldc_w "YearFn"
        // 10890: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10893: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10896: sipush 2004
        // 10899: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10902: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10905: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10908: ldc_w "MinuteFn"
        // 10911: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10914: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10917: getstatic
        // com/cyc/cycjava/cycl/ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 10920: ldc_w "HourFn"
        // 10923: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10926: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10929: getstatic
        // com/cyc/cycjava/cycl/ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 10932: ldc_w "DayFn"
        // 10935: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10938: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10941: getstatic
        // com/cyc/cycjava/cycl/ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 10944: ldc_w "MonthFn"
        // 10947: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10950: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10953: ldc_w "January"
        // 10956: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10959: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10962: ldc_w "YearFn"
        // 10965: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 10968: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 10971: sipush 2004
        // 10974: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 10977: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10980: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10983: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10986: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10989: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10992: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 10995: ldc_w "YearFn"
        // 10998: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11001: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11004: sipush 2004
        // 11007: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 11010: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11013: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11016: ldc_w "SecondFn"
        // 11019: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11022: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11025: getstatic
        // com/cyc/cycjava/cycl/ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 11028: ldc_w "MinuteFn"
        // 11031: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11034: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11037: getstatic
        // com/cyc/cycjava/cycl/ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 11040: ldc_w "HourFn"
        // 11043: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11046: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11049: getstatic
        // com/cyc/cycjava/cycl/ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 11052: ldc_w "DayFn"
        // 11055: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11058: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11061: getstatic
        // com/cyc/cycjava/cycl/ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 11064: ldc_w "MonthFn"
        // 11067: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11070: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11073: ldc_w "January"
        // 11076: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11079: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11082: ldc_w "YearFn"
        // 11085: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11088: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11091: sipush 2004
        // 11094: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 11097: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11100: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11103: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11106: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11109: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11112: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11115: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11118: ldc_w "YearFn"
        // 11121: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11124: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11127: sipush 2004
        // 11130: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 11133: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11136: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11139: ldc_w "SecondFn"
        // 11142: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11145: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11148: getstatic
        // com/cyc/cycjava/cycl/ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 11151: ldc_w "MinuteFn"
        // 11154: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11157: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11160: getstatic
        // com/cyc/cycjava/cycl/ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 11163: ldc_w "HourFn"
        // 11166: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11169: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11172: getstatic
        // com/cyc/cycjava/cycl/ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 11175: ldc_w "DayFn"
        // 11178: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11181: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11184: getstatic
        // com/cyc/cycjava/cycl/ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 11187: ldc_w "MonthFn"
        // 11190: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11193: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11196: ldc_w "January"
        // 11199: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11202: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11205: ldc_w "YearFn"
        // 11208: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11211: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11214: sipush 2004
        // 11217: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 11220: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11223: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11226: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11229: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11232: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11235: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11238: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11241: ldc_w "MinuteFn"
        // 11244: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11247: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11250: getstatic
        // com/cyc/cycjava/cycl/ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 11253: ldc_w "HourFn"
        // 11256: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11259: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11262: getstatic
        // com/cyc/cycjava/cycl/ZERO_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 11265: ldc_w "DayFn"
        // 11268: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11271: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11274: getstatic
        // com/cyc/cycjava/cycl/ONE_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 11277: ldc_w "MonthFn"
        // 11280: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11283: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11286: ldc_w "January"
        // 11289: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11292: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11295: ldc_w "YearFn"
        // 11298: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11301: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11304: sipush 2004
        // 11307: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 11310: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11313: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11316: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11319: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11322: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11325: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11328: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11331: putstatic
        // com/cyc/cycjava/cycl/$list321:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11334: ldc_w "DATE-TO-PRECISION"
        // 11337: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 11340: putstatic
        // com/cyc/cycjava/cycl/$sym322$DATE_TO_PRECISION:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 11343: invokestatic
        // com/cyc/cycjava/cycl/_constant_323_initializer:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11346: putstatic
        // com/cyc/cycjava/cycl/$list323:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11349: ldc_w "NEXT-ITERATED-CYCLIC-INTERVAL-INCLUSIVE"
        // 11352: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 11355: putstatic
        // com/cyc/cycjava/cycl/$sym324$NEXT_ITERATED_CYCLIC_INTERVAL_INCLUSIVE:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 11358: invokestatic
        // com/cyc/cycjava/cycl/_constant_325_initializer:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11361: putstatic
        // com/cyc/cycjava/cycl/$list325:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11364: ldc_w "PARSE-DATE-FROM-STRING-FAST"
        // 11367: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 11370: putstatic
        // com/cyc/cycjava/cycl/$sym326$PARSE_DATE_FROM_STRING_FAST:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 11373: ldc_w "FAST-SUPERSET-EQUAL?"
        // 11376: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 11379: putstatic
        // com/cyc/cycjava/cycl/$sym327$FAST_SUPERSET_EQUAL_:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 11382: invokestatic
        // com/cyc/cycjava/cycl/_constant_328_initializer:()Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11385: putstatic
        // com/cyc/cycjava/cycl/$list328:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11388: ldc_w "DATE-QUERY-P"
        // 11391: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 11394: putstatic
        // com/cyc/cycjava/cycl/$sym329$DATE_QUERY_P:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 11397: ldc_w "DayFn"
        // 11400: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11403: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11406: getstatic
        // com/cyc/cycjava/cycl/ELEVEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 11409: ldc_w "MonthFn"
        // 11412: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11415: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11418: ldc_w "August"
        // 11421: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11424: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11427: ldc_w "YearFn"
        // 11430: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11433: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11436: ldc_w "?YEAR"
        // 11439: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 11442: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11445: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11448: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11451: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11454: getstatic
        // com/cyc/cycjava/cycl/T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        // 11457: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11460: ldc_w "DayFn"
        // 11463: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11466: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11469: getstatic
        // com/cyc/cycjava/cycl/ELEVEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 11472: ldc_w "MonthFn"
        // 11475: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11478: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11481: ldc_w "August"
        // 11484: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11487: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11490: ldc_w "YearFn"
        // 11493: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11496: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11499: ldc_w "?YEAR"
        // 11502: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 11505: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11508: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11511: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11514: ldc_w "YearFn"
        // 11517: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11520: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11523: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11526: getstatic
        // com/cyc/cycjava/cycl/T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        // 11529: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11532: ldc_w "DayFn"
        // 11535: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11538: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11541: ldc_w "?DAY"
        // 11544: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 11547: ldc_w "MonthFn"
        // 11550: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11553: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11556: ldc_w "August"
        // 11559: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11562: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11565: ldc_w "YearFn"
        // 11568: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11571: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11574: sipush 2001
        // 11577: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 11580: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11583: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11586: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11589: ldc_w "DayFn"
        // 11592: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11595: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11598: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11601: getstatic
        // com/cyc/cycjava/cycl/T:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLT;
        // 11604: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11607: ldc_w "DayFn"
        // 11610: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11613: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11616: ldc_w "?DAY"
        // 11619: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeSymbol:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLSymbol;
        // 11622: ldc_w "MonthFn"
        // 11625: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11628: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11631: ldc_w "August"
        // 11634: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11637: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11640: ldc_w "YearFn"
        // 11643: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11646: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11649: sipush 2001
        // 11652: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 11655: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11658: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11661: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11664: ldc_w "YearFn"
        // 11667: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11670: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11673: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11676: getstatic
        // com/cyc/cycjava/cycl/NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        // 11679: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11682: ldc_w "DayFn"
        // 11685: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11688: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11691: getstatic
        // com/cyc/cycjava/cycl/ELEVEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 11694: ldc_w "MonthFn"
        // 11697: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11700: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11703: ldc_w "September"
        // 11706: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11709: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11712: ldc_w "TheYear-Indexical"
        // 11715: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11718: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11721: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11724: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11727: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11730: getstatic
        // com/cyc/cycjava/cycl/NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        // 11733: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11736: ldc_w "MonthFn"
        // 11739: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11742: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11745: ldc_w "September"
        // 11748: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11751: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11754: ldc_w "YearFn"
        // 11757: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11760: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11763: sipush 2011
        // 11766: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeInteger:(I)Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLInteger;
        // 11769: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11772: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11775: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11778: getstatic
        // com/cyc/cycjava/cycl/NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        // 11781: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11784: ldc_w "MonthFn"
        // 11787: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11790: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11793: ldc_w "September"
        // 11796: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11799: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11802: ldc_w "YearFn"
        // 11805: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/type/core/makeString:(Ljava/lang/String;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLString;
        // 11808: invokestatic
        // com/cyc/cycjava/cycl/constant_handles.reader_make_constant_shell:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;
        // 11811: getstatic
        // com/cyc/cycjava/cycl/ELEVEN_INTEGER:Lcom/cyc/tool/subl/jrtl/nativeCode/type/number/SubLFixnum;
        // 11814: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11817: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11820: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11823: getstatic
        // com/cyc/cycjava/cycl/NIL:Lcom/cyc/tool/subl/jrtl/nativeCode/type/symbol/SubLNil;
        // 11826: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11829: invokestatic
        // com/cyc/tool/subl/jrtl/nativeCode/subLisp/ConsesLow.list:(Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLObject;)Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11832: putstatic
        // com/cyc/cycjava/cycl/$list330:Lcom/cyc/tool/subl/jrtl/nativeCode/type/core/SubLList;
        // 11835: return
        // 
        // The error that occurred was:
        // 
        // java.lang.NumberFormatException: For input string: "10000000000"
        // at
        // java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        // at java.lang.Integer.parseInt(Integer.java:583)
        // at java.lang.Integer.parseInt(Integer.java:615)
        // at
        // com.strobel.decompiler.languages.java.ast.NameVariables.splitName(NameVariables.java:119)
        // at
        // com.strobel.decompiler.languages.java.ast.NameVariables.addExistingName(NameVariables.java:100)
        // at
        // com.strobel.decompiler.languages.java.ast.NameVariables.assignNamesToVariables(NameVariables.java:151)
        // at
        // com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:276)
        // at
        // com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        // at
        // com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        // at
        // com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        // at
        // com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        // at
        // com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        // at
        // com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        // at
        // com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        // at
        // com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        // at
        // com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        // at
        // com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        // at
        // org.sf.feeling.decompiler.actions.ExportSourceAction.exportPackageSources(ExportSourceAction.java:362)
        // at
        // org.sf.feeling.decompiler.actions.ExportSourceAction.access$0(ExportSourceAction.java:288)
        // at
        // org.sf.feeling.decompiler.actions.ExportSourceAction$1.run(ExportSourceAction.java:194)
        // at
        // org.eclipse.jface.operation.ModalContext$ModalContextThread.run(ModalContext.java:119)
        // 
        // throw new IllegalStateException("An error occurred while decompiling this
        // method.");
    }

    public static final class $date_p_internal$UnaryFunction extends UnaryFunction {
        public $date_p_internal$UnaryFunction() {
            super(extractFunctionNamed("DATE-P-INTERNAL"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return date_p_internal(arg1);
        }
    }

    public static final class $temporal_indexical_p$UnaryFunction extends UnaryFunction {
        public $temporal_indexical_p$UnaryFunction() {
            super(extractFunctionNamed("TEMPORAL-INDEXICAL-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return temporal_indexical_p(arg1);
        }
    }

    public static final class $indexical_now$ZeroArityFunction extends ZeroArityFunction {
        public $indexical_now$ZeroArityFunction() {
            super(extractFunctionNamed("INDEXICAL-NOW"));
        }

        @Override
        public SubLObject processItem() {
            return indexical_now();
        }
    }
}

/**
 * Total time: 3018 ms
 */
