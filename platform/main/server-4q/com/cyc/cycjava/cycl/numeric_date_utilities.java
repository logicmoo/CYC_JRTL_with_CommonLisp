/**
 *
 */
/**
 * //
 */
/**
 *
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class numeric_date_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new numeric_date_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.numeric_date_utilities";

    public static final String myFingerPrint = "c40539e905640e8dc3aaf9ce7008cb3a91231ab0b82d27acdf236d7ce4102777";

    // defconstant
    public static final SubLSymbol $microseconds_in_a_second$ = makeSymbol("*MICROSECONDS-IN-A-SECOND*");

    // defconstant
    public static final SubLSymbol $microseconds_in_a_millisecond$ = makeSymbol("*MICROSECONDS-IN-A-MILLISECOND*");

    // defconstant
    public static final SubLSymbol $milliseconds_in_a_second$ = makeSymbol("*MILLISECONDS-IN-A-SECOND*");

    // defconstant
    // Definitions
    // True
    public static final SubLSymbol $seconds_in_a_leap_year$ = makeSymbol("*SECONDS-IN-A-LEAP-YEAR*");

    // defconstant
    // Also True
    public static final SubLSymbol $seconds_in_a_non_leap_year$ = makeSymbol("*SECONDS-IN-A-NON-LEAP-YEAR*");

    // defconstant
    // Right
    public static final SubLSymbol $seconds_in_a_week$ = makeSymbol("*SECONDS-IN-A-WEEK*");

    // defconstant
    public static final SubLSymbol $seconds_in_a_day$ = makeSymbol("*SECONDS-IN-A-DAY*");

    // defconstant
    public static final SubLSymbol $seconds_in_an_hour$ = makeSymbol("*SECONDS-IN-AN-HOUR*");

    // defconstant
    // the number of seconds in a minute
    public static final SubLSymbol $seconds_in_a_minute$ = makeSymbol("*SECONDS-IN-A-MINUTE*");

    // defconstant
    // the number of minutes in an hour
    public static final SubLSymbol $minutes_in_an_hour$ = makeSymbol("*MINUTES-IN-AN-HOUR*");

    // defconstant
    // the number of hours in a day
    public static final SubLSymbol $hours_in_a_day$ = makeSymbol("*HOURS-IN-A-DAY*");

    // defconstant
    public static final SubLSymbol $months_in_a_quarter$ = makeSymbol("*MONTHS-IN-A-QUARTER*");

    // defconstant
    // the number of months in a year
    public static final SubLSymbol $months_in_a_year$ = makeSymbol("*MONTHS-IN-A-YEAR*");

    // defconstant
    public static final SubLSymbol $years_in_a_decade$ = makeSymbol("*YEARS-IN-A-DECADE*");

    // defconstant
    public static final SubLSymbol $years_in_a_century$ = makeSymbol("*YEARS-IN-A-CENTURY*");

    // deflexical
    private static final SubLSymbol $elapsed_seconds_multiples$ = makeSymbol("*ELAPSED-SECONDS-MULTIPLES*");

    // deflexical
    private static final SubLSymbol $elapsed_seconds_wXo_days_multiples$ = makeSymbol("*ELAPSED-SECONDS-W/O-DAYS-MULTIPLES*");

    // defconstant
    /**
     * A known pair to compute offset from. The Julian date for the start of Aug 1,
     * 2001 is 2452122.5
     */
    private static final SubLSymbol $julian_date_reference$ = makeSymbol("*JULIAN-DATE-REFERENCE*");



    // deflexical
    // The usual number of days for each month.
    private static final SubLSymbol $month_duration_table$ = makeSymbol("*MONTH-DURATION-TABLE*");

    // deflexical
    public static final SubLSymbol $number_wkday_table$ = makeSymbol("*NUMBER-WKDAY-TABLE*");

    // deflexical
    public static final SubLSymbol $number_month_table$ = makeSymbol("*NUMBER-MONTH-TABLE*");

    // defconstant
    // HACK
    public static final SubLSymbol $seconds_in_a_century$ = makeSymbol("*SECONDS-IN-A-CENTURY*");

    // defconstant
    public static final SubLSymbol $seconds_in_an_odd_millennium$ = makeSymbol("*SECONDS-IN-AN-ODD-MILLENNIUM*");

    // defconstant
    public static final SubLSymbol $seconds_in_an_even_millennium$ = makeSymbol("*SECONDS-IN-AN-EVEN-MILLENNIUM*");

    private static final SubLInteger $int$1000000 = makeInteger(0xf4240);



    private static final SubLInteger $int$31622400 = makeInteger(0x1e28500);

    private static final SubLInteger $int$31536000 = makeInteger(0x1e13380);

    private static final SubLInteger $int$604800 = makeInteger(0x93a80);

    private static final SubLInteger $int$86400 = makeInteger(0x15180);

    private static final SubLInteger $int$3600 = makeInteger(3600);

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLInteger $int$24 = makeInteger(24);



    private static final SubLList $list10 = list(list(makeSymbol("TIME")), makeSymbol("&BODY"), makeSymbol("BODY"));







    private static final SubLSymbol TRUNCATE = makeSymbol("TRUNCATE");

    private static final SubLSymbol $sym15$_ = makeSymbol("*");

    private static final SubLList $list16 = list(makeInteger(1000));

    private static final SubLInteger $int$31 = makeInteger(31);

    private static final SubLInteger $int$23 = makeInteger(23);

    private static final SubLInteger $int$59 = makeInteger(59);

    private static final SubLSymbol TIME_FROM_NOW = makeSymbol("TIME-FROM-NOW");

    private static final SubLList $list21 = list(makeSymbol("UNIVERSAL-TIME-SECONDS-FROM-NOW"));



    private static final SubLString $str23$_D__2__0D__2__0D__2__0D__2__0D__2 = makeString("~D-~2,'0D-~2,'0D ~2,'0D:~2,'0D:~2,'0D.~3,'0D");

    private static final SubLString $str24$_D__2__0D__2__0DT_2__0D__2__0D__2 = makeString("~D-~2,'0D-~2,'0DT~2,'0D:~2,'0D:~2,'0D.~3,'0DZ");

    private static final SubLString $str25$ = makeString("");

    private static final SubLString $str26$_a__6__0D = makeString("~a-~6,'0D");

    private static final SubLString $str27$_a__6__0D__3__0D = makeString("~a-~6,'0D.~3,'0D");

    private static final SubLString $str28$mm_dd_yyyy_hh_mm_ss = makeString("mm/dd/yyyy hh:mm:ss");

    private static final SubLString $str29$_D_2__0D_2__0D_2__0D_2__0D_2__0D = makeString("~D~2,'0D~2,'0D~2,'0D~2,'0D~2,'0D");





    private static final SubLString $str32$_second__P = makeString(" second~:P");

    private static final SubLString $$$ms = makeString("ms");

    private static final SubLString $str34$_D = makeString("~D");

    private static final SubLString $str35$__ = makeString("~,");

    private static final SubLString $$$F = makeString("F");

    private static final SubLString $str37$_D_hours___D_minute__P = makeString("~D hours, ~D minute~:P");

    private static final SubLString $str38$_D_minute__P__ = makeString("~D minute~:P, ");

    private static final SubLSymbol READABLE_ELAPSED_TIME_STRING = makeSymbol("READABLE-ELAPSED-TIME-STRING");













    private static final SubLList $list46 = list(new SubLObject[]{ list(list(makeDouble(0.002907)), makeString("2.91ms")), list(list(makeDouble(0.02907)), makeString("29.07ms")), list(list(makeDouble(0.2616)), makeString("262ms")), list(list(makeDouble(0.7848)), makeString("785ms")), list(list(makeDouble(6.279)), makeString("6.28 seconds")), list(list(makeDouble(12.558)), makeString("12.56 seconds")), list(list(makeDouble(25.116)), makeString("25.12 seconds")), list(list(makeDouble(50.232)), makeString("50.23 seconds")), list(list(makeInteger(60), ZERO_INTEGER), makeString("60 seconds")), list(list(makeDouble(299.99)), makeString("5 minutes, 0 seconds")), list(list(makeDouble(452.09)), makeString("7 minutes, 32 seconds")), list(list(makeInteger(3600)), makeString("60 minutes, 0 seconds")), list(list(makeDouble(4520.93)), makeString("75 minutes, 21 seconds")), list(list(makeDouble(40688.37)), makeString("11 hours, 18 minutes")), list(list(makeDouble(81376.74)), makeString("22 hours, 36 minutes")) });

    private static final SubLString $str47$_ = makeString("-");

    private static final SubLList $list48 = list(makeSymbol("DAYS"), makeSymbol("HOURS"), makeSymbol("MINUTES"), makeSymbol("SECONDS"), makeSymbol("MILLISECONDS"), makeSymbol("MICROSECONDS"));

    private static final SubLString $str49$_D_day__P = makeString("~D day~:P");

    private static final SubLString $str50$_D_hour__P = makeString("~D hour~:P");

    private static final SubLString $str51$_D__2__0D_hour_P = makeString("~D:~2,'0D hour~P");

    private static final SubLString $str52$_D_minute__P = makeString("~D minute~:P");

    private static final SubLString $str53$_D__2__0D_minute_P = makeString("~D:~2,'0D minute~P");

    private static final SubLString $str54$_D_second__P = makeString("~D second~:P");

    private static final SubLString $str55$_D__2__0D_second_P = makeString("~D.~2,'0D second~P");

    private static final SubLString $$$_ms = makeString(" ms");

    private static final SubLString $str57$___s = makeString(" \u00b5s");

    private static final SubLString $str58$0___s = makeString("0 \u00b5s");

    private static final SubLSymbol DATETIME_STRING_TEMPLATE_P = makeSymbol("DATETIME-STRING-TEMPLATE-P");

    private static final SubLSymbol NON_DATE_TIME_WHITESPACE_P = makeSymbol("NON-DATE-TIME-WHITESPACE-P");

    private static final SubLString $str61$_A__A = makeString("~A ~A");

    private static final SubLString $str62$Template__s_is_not_a_valid_dateti = makeString("Template ~s is not a valid datetime-string template.");

    private static final SubLList $list63 = list(new SubLObject[]{ CHAR_y, CHAR_Y, CHAR_m, CHAR_M, CHAR_d, CHAR_D, CHAR_slash, CHAR_hyphen, CHAR_underbar });

    private static final SubLList $list64 = list(CHAR_h, CHAR_H, CHAR_m, CHAR_M, CHAR_s, CHAR_S, CHAR_colon);

    private static final SubLSymbol VALID_DATE_TEMPLATE_CHAR = makeSymbol("VALID-DATE-TEMPLATE-CHAR");

    private static final SubLString $str66$hh_mm_ss = makeString("hh:mm:ss");

    private static final SubLString $str67$hh_mm_ss_mmm = makeString("hh:mm:ss.mmm");

    private static final SubLString $str68$hh_mm = makeString("hh:mm");

    private static final SubLString $str69$hh_mm_ss_m = makeString("hh:mm:ss.m");

    private static final SubLString $str70$hh_mm_ss_mm = makeString("hh:mm:ss.mm");

    private static final SubLSymbol VALID_YEAR_TOKEN = makeSymbol("VALID-YEAR-TOKEN");

    private static final SubLSymbol VALID_DATE_SEPARATOR = makeSymbol("VALID-DATE-SEPARATOR");

    private static final SubLSymbol VALID_MONTH_TOKEN = makeSymbol("VALID-MONTH-TOKEN");

    private static final SubLSymbol VALID_DAY_TOKEN = makeSymbol("VALID-DAY-TOKEN");

    private static final SubLString $str75$Template_or_template_portion__S_d = makeString("Template or template portion ~S didn't match any expected pattern");

    private static final SubLString $str76$_ = makeString("~");

    private static final SubLString $str77$__0D = makeString(",'0D");

    private static final SubLString $str78$_2__0D__2__0D__2__0D = makeString("~2,'0D:~2,'0D:~2,'0D");

    private static final SubLString $str79$_2__0D__2__0D = makeString("~2,'0D:~2,'0D");

    private static final SubLString $str80$_2__0D__2__0D__2__0D__3__0D = makeString("~2,'0D:~2,'0D:~2,'0D.~3,'0D");

    private static final SubLString $str81$_2__0D__2__0D__2__0D__2__0D = makeString("~2,'0D:~2,'0D:~2,'0D.~2,'0D");

    private static final SubLString $str82$_2__0D__2__0D__2__0D__1__0D = makeString("~2,'0D:~2,'0D:~2,'0D.~1,'0D");

    private static final SubLString $str83$Template_or_template_portion__A_w = makeString("Template or template portion ~A wasn't a recognized time template.");

    private static final SubLString $str84$The_template__S_doesn_t_match_the = makeString("The template ~S doesn't match the datetime-string ~S");

    private static final SubLString $str85$Template_or_template_portion__A_w = makeString("Template or template portion ~A wasn't a recognized datetime template.");

    private static final SubLString $str86$The_date_string__A_and_the_templa = makeString("The date string ~A and the template ~A are of length.");



    private static final SubLString $str88$Template_or_template_portion__A_d = makeString("Template or template portion ~A doesn't match datestring ~A");

    private static final SubLList $list89 = list(makeString("hh:mm:ss"), makeString("hh:mm"), makeString("hh:mm:ss.mmm"), makeString("hh:mm:ss.mm"), makeString("hh:mm:ss.m"));

    private static final SubLString $str90$The_template__A_is_not_a_recogniz = makeString("The template ~A is not a recognized timestring template.");

    private static final SubLString $str91$The_time_string__A_and_the_templa = makeString("The time string ~A and the template ~A are of unequal length.");

    private static final SubLList $list92 = list(makeSymbol("WHOLE-SECONDS"), makeSymbol("&OPTIONAL"), list(makeSymbol("MINUTES"), ZERO_INTEGER), list(makeSymbol("HOURS"), ZERO_INTEGER), list(makeSymbol("ELAPSED-DAYS"), ZERO_INTEGER));

    private static final SubLList $list93 = list(makeSymbol("WHOLE-SECONDS"), makeSymbol("&OPTIONAL"), list(makeSymbol("MINUTES"), ZERO_INTEGER), list(makeSymbol("HOURS"), ZERO_INTEGER));

    private static final SubLString $str94$__A_day_A = makeString(" ~A day~A");

    private static final SubLString $$$s = makeString("s");

    private static final SubLString $str96$__A_hour_A = makeString(" ~A hour~A");

    private static final SubLString $str97$__A_minute_A = makeString(" ~A minute~A");



    private static final SubLString $str99$__A_second_A = makeString(" ~A second~A");

    private static final SubLString $$$_0_seconds = makeString(" 0 seconds");

    private static final SubLSymbol ELAPSED_SECONDS_STRING = makeSymbol("ELAPSED-SECONDS-STRING");

    private static final SubLList $list102 = list(makeSymbol("READABLE-ELAPSED-TIME-STRING"));





    private static final SubLInteger $int$10000 = makeInteger(10000);



    private static final SubLString $str107$_2__0d__2__0d__4__0d = makeString("~2,'0d/~2,'0d/~4,'0d");

    private static final SubLString $str108$_2__0d__2__0d__d = makeString("~2,'0d/~2,'0d/~d");

    private static final SubLString $str109$_2__0d__2__0d___d = makeString("~2,'0d/~2,'0d/-~d");





    private static final SubLList $list112 = cons(makeInteger(0x1315731), makeDouble(2452122.5));

    private static final SubLSymbol $julian_offsets$ = makeSymbol("*JULIAN-OFFSETS*");

    private static final SubLList $list114 = cons(makeSymbol("REFERENCE-UNIVERSAL-DATE"), makeSymbol("REFERENCE-JULIAN-DATE"));

    private static final SubLInteger $int$235959 = makeInteger(0x399b7);

    private static final SubLString $str116$second__S_not_in_the_range_0_59 = makeString("second ~S not in the range 0-59");

    private static final SubLString $str117$minute__S_not_in_the_range_0_59 = makeString("minute ~S not in the range 0-59");

    private static final SubLString $str118$hour__S_not_in_the_range_0_59 = makeString("hour ~S not in the range 0-59");



    private static final SubLString $$$0 = makeString("0");

    private static final SubLString $str121$_ = makeString(":");

    private static final SubLInteger $int$999 = makeInteger(999);

    private static final SubLString $str123$second__S_not_in_the_range_0_999 = makeString("second ~S not in the range 0-999");

    private static final SubLString $str124$_2__0d__2__0d__2__0d__3__0d = makeString("~2,'0d:~2,'0d:~2,'0d.~3,'0d");

    private static final SubLInteger $int$100000000 = makeInteger(0x5f5e100);

    private static final SubLInteger $int$10000000000 = makeInteger("10000000000");

    private static final SubLString $str127$MM_DD_YY_adjust_problem___s__s__s = makeString("MM/DD/YY adjust problem: ~s ~s ~s");

    private static final SubLInteger $int$400 = makeInteger(400);

    private static final SubLList $list129 = list(new SubLObject[]{ makeInteger(31), makeInteger(28), makeInteger(31), makeInteger(30), makeInteger(31), makeInteger(30), makeInteger(31), makeInteger(31), makeInteger(30), makeInteger(31), makeInteger(30), makeInteger(31) });

    private static final SubLList $list130 = list(cons(ZERO_INTEGER, makeString("Mon")), cons(ONE_INTEGER, makeString("Tue")), cons(TWO_INTEGER, makeString("Wed")), cons(THREE_INTEGER, makeString("Thu")), cons(FOUR_INTEGER, makeString("Fri")), cons(FIVE_INTEGER, makeString("Sat")), cons(SIX_INTEGER, makeString("Sun")));

    private static final SubLList $list131 = list(new SubLObject[]{ cons(ONE_INTEGER, makeString("Jan")), cons(TWO_INTEGER, makeString("Feb")), cons(THREE_INTEGER, makeString("Mar")), cons(FOUR_INTEGER, makeString("Apr")), cons(FIVE_INTEGER, makeString("May")), cons(SIX_INTEGER, makeString("Jun")), cons(SEVEN_INTEGER, makeString("Jul")), cons(EIGHT_INTEGER, makeString("Aug")), cons(NINE_INTEGER, makeString("Sep")), cons(TEN_INTEGER, makeString("Oct")), cons(ELEVEN_INTEGER, makeString("Nov")), cons(TWELVE_INTEGER, makeString("Dec")) });

    private static final SubLSymbol ABBREVIATION_FOR_MONTH_NUMBER = makeSymbol("ABBREVIATION-FOR-MONTH-NUMBER");

    private static final SubLList $list133 = list(makeSymbol("MONTH-NUMBER-ABBREV"));

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str135$__ = makeString(", ");

    private static final SubLString $str136$_2__0D__2__0D__2__0D__2__0D__2__0 = makeString("~2,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D");

    private static final SubLString $str137$_D_day__P__D__2__0D__2__0D = makeString("~D day~:P ~D:~2,'0D:~2,'0D");

    private static final SubLString $str138$_D__2__0D__2__0D = makeString("~D:~2,'0D:~2,'0D");

    private static final SubLString $str139$_D__2__0D = makeString("~D:~2,'0D");

    private static final SubLString $str140$_Dd__2__0Dh__2__0Dm__2__0Ds = makeString("~Dd ~2,'0Dh ~2,'0Dm ~2,'0Ds");

    private static final SubLString $str141$_2__0Dh__2__0Dm__2__0Ds = makeString("~2,'0Dh ~2,'0Dm ~2,'0Ds");

    private static final SubLString $str142$_2__0Dm__2__0Ds = makeString("~2,'0Dm ~2,'0Ds");

    private static final SubLInteger $int$3155760000 = makeInteger("3155760000");

    private static final SubLInteger $int$31556908800 = makeInteger("31556908800");

    private static final SubLInteger $int$31556995200 = makeInteger("31556995200");

    private static final SubLString $$$Numeric_Date_Utilities = makeString("Numeric Date Utilities");

    private static final SubLList $list147 = list(makeSymbol("TEMPLATIZED-DATESTRING-CASE"));

    

    public static SubLObject elapsed_milliseconds(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject time = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        time = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PROGN, listS(CTIME, time, append(body, NIL)), list(CSETQ, time, list(TRUNCATE, listS($sym15$_, time, $list16))));
        }
        cdestructuring_bind_error(datum, $list10);
        return NIL;
    }

    public static SubLObject valid_year_number_p(final SubLObject v_object) {
        return integerp(v_object);
    }

    public static SubLObject valid_month_number_p(final SubLObject v_object) {
        return makeBoolean((NIL != subl_promotions.positive_integer_p(v_object)) && v_object.numLE(TWELVE_INTEGER));
    }

    public static SubLObject valid_day_number_p(final SubLObject v_object) {
        return makeBoolean((NIL != subl_promotions.positive_integer_p(v_object)) && v_object.numLE($int$31));
    }

    public static SubLObject valid_day_for_month_p(final SubLObject v_object, final SubLObject month, final SubLObject year) {
        return makeBoolean((NIL != subl_promotions.positive_integer_p(v_object)) && v_object.numLE(days_in_month_number(month, year)));
    }

    public static SubLObject valid_hour_number_p(final SubLObject v_object) {
        return makeBoolean((NIL != subl_promotions.non_negative_integer_p(v_object)) && v_object.numLE($int$23));
    }

    public static SubLObject valid_minute_number_p(final SubLObject v_object) {
        return makeBoolean((NIL != subl_promotions.non_negative_integer_p(v_object)) && v_object.numLE($int$59));
    }

    public static SubLObject valid_second_number_p(final SubLObject v_object) {
        return makeBoolean((NIL != subl_promotions.non_negative_integer_p(v_object)) && v_object.numLE($int$59));
    }

    public static SubLObject universal_time_p(final SubLObject v_object) {
        return integerp(v_object);
    }

    public static SubLObject universal_time_seconds_from_now(final SubLObject seconds, SubLObject reference_time) {
        if (reference_time == UNPROVIDED) {
            reference_time = get_universal_time();
        }
        return add(reference_time, seconds.isInteger() ? seconds : truncate(seconds, UNPROVIDED));
    }

    public static SubLObject time_from_now(final SubLObject seconds) {
        return universal_time_seconds_from_now(seconds, UNPROVIDED);
    }

    public static SubLObject universal_time_from_now(final SubLObject seconds, SubLObject minutes, SubLObject hours) {
        if (minutes == UNPROVIDED) {
            minutes = ZERO_INTEGER;
        }
        if (hours == UNPROVIDED) {
            hours = ZERO_INTEGER;
        }
        final SubLObject total_minutes = add(minutes, multiply($minutes_in_an_hour$.getGlobalValue(), hours));
        final SubLObject total_seconds = add(seconds, multiply($seconds_in_a_minute$.getGlobalValue(), total_minutes));
        return universal_time_seconds_from_now(total_seconds, UNPROVIDED);
    }

    public static SubLObject timestring(SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        assert NIL != universal_time_p(universal_time) : "numeric_date_utilities.universal_time_p(universal_time) " + "CommonSymbols.NIL != numeric_date_utilities.universal_time_p(universal_time) " + universal_time;
        return timestring_int(universal_time);
    }

    public static SubLObject timestring_ms(SubLObject universal_time, SubLObject universal_millisecond) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        if (universal_millisecond == UNPROVIDED) {
            universal_millisecond = get_universal_millisecond(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject second = decode_universal_time(universal_time, UNPROVIDED);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return format(NIL, $str23$_D__2__0D__2__0D__2__0D__2__0D__2, new SubLObject[]{ year, month, day, hour, minute, second, mod(universal_millisecond, $int$1000) });
    }

    public static SubLObject timestring_ms_utc(SubLObject universal_time, SubLObject universal_millisecond) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        if (universal_millisecond == UNPROVIDED) {
            universal_millisecond = get_universal_millisecond(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject second = decode_universal_time(universal_time, ZERO_INTEGER);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return format(NIL, $str24$_D__2__0D__2__0DT_2__0D__2__0D__2, new SubLObject[]{ year, month, day, hour, minute, second, mod(universal_millisecond, $int$1000) });
    }

    public static SubLObject safe_timestring(final SubLObject v_object) {
        if (NIL != universal_time_p(v_object)) {
            return timestring_int(v_object);
        }
        return $str25$;
    }

    public static SubLObject timestring_int(final SubLObject universal_time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject second = decode_universal_time(universal_time, UNPROVIDED);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject date = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return encode_timestring(second, minute, hour, date, month, year);
    }

    public static SubLObject timestamp(SubLObject universal_date, SubLObject universal_second) {
        if (universal_date == UNPROVIDED) {
            universal_date = get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        if (universal_second == UNPROVIDED) {
            universal_second = get_universal_second(UNPROVIDED);
        }
        return format(NIL, $str26$_a__6__0D, universal_date, universal_second);
    }

    public static SubLObject numeric_timestamp(SubLObject universal_date, SubLObject universal_second) {
        if (universal_date == UNPROVIDED) {
            universal_date = get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        if (universal_second == UNPROVIDED) {
            universal_second = get_universal_second(UNPROVIDED);
        }
        return add(multiply($int$1000000, universal_date), universal_second);
    }

    public static SubLObject timestamp_with_milliseconds(SubLObject universal_date, SubLObject universal_millisecond) {
        if (universal_date == UNPROVIDED) {
            universal_date = get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        if (universal_millisecond == UNPROVIDED) {
            universal_millisecond = get_universal_millisecond(UNPROVIDED);
        }
        return format(NIL, $str27$_a__6__0D__3__0D, new SubLObject[]{ universal_date, number_utilities.div(universal_millisecond, $int$1000), rem(universal_millisecond, $int$1000) });
    }

    public static SubLObject encode_timestring(final SubLObject second, final SubLObject minute, final SubLObject hour, final SubLObject date, final SubLObject month, final SubLObject year) {
        return encode_datetime_string_from_template(NIL, second, minute, hour, date, month, year, $str28$mm_dd_yyyy_hh_mm_ss);
    }

    public static SubLObject universal_timestring(SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != universal_time_p(universal_time) : "numeric_date_utilities.universal_time_p(universal_time) " + "CommonSymbols.NIL != numeric_date_utilities.universal_time_p(universal_time) " + universal_time;
        thread.resetMultipleValues();
        final SubLObject second = decode_universal_time(universal_time, UNPROVIDED);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject date = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return encode_universal_timestring(second, minute, hour, date, month, year);
    }

    public static SubLObject encode_universal_timestring(final SubLObject second, final SubLObject minute, final SubLObject hour, final SubLObject date, final SubLObject month, final SubLObject year) {
        return format(NIL, $str29$_D_2__0D_2__0D_2__0D_2__0D_2__0D, new SubLObject[]{ year, month, date, hour, minute, second });
    }

    public static SubLObject get_universal_time_today(final SubLObject second, final SubLObject minute, final SubLObject hour) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject second_now = decode_universal_time(get_universal_time(), UNPROVIDED);
        final SubLObject minute_now = thread.secondMultipleValue();
        final SubLObject hour_now = thread.thirdMultipleValue();
        final SubLObject day_now = thread.fourthMultipleValue();
        final SubLObject month_now = thread.fifthMultipleValue();
        final SubLObject year_now = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return encode_universal_time(second, minute, hour, day_now, month_now, year_now, UNPROVIDED);
    }

    public static SubLObject get_universal_time_within_next_day(final SubLObject second, final SubLObject minute, final SubLObject hour) {
        final SubLObject time_now = get_universal_time();
        final SubLObject time_today = get_universal_time_today(second, minute, hour);
        if (time_today.numG(time_now)) {
            return time_today;
        }
        final SubLObject time_tomorrow = add($seconds_in_a_day$.getGlobalValue(), time_today);
        return time_tomorrow;
    }

    public static SubLObject universal_time_day_of_week_number(SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != universal_time_p(universal_time) : "numeric_date_utilities.universal_time_p(universal_time) " + "CommonSymbols.NIL != numeric_date_utilities.universal_time_p(universal_time) " + universal_time;
        thread.resetMultipleValues();
        final SubLObject second = decode_universal_time(universal_time, UNPROVIDED);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        final SubLObject day_of_week = thread.seventhMultipleValue();
        final SubLObject daylight_saving_time_p = thread.eighthMultipleValue();
        final SubLObject time_zone = SubLProcess.nthMultipleValue(EIGHT_INTEGER);
        thread.resetMultipleValues();
        return day_of_week;
    }

    public static SubLObject internal_real_time_p(final SubLObject v_object) {
        return subl_promotions.non_negative_integer_p(v_object);
    }

    public static SubLObject internal_real_time_seconds_from_now(final SubLObject seconds, SubLObject reference_time) {
        if (reference_time == UNPROVIDED) {
            reference_time = get_internal_real_time();
        }
        return add(reference_time, elapsed_seconds_to_elapsed_internal_real_time(seconds));
    }

    public static SubLObject elapsed_internal_real_time(final SubLObject reference_time, SubLObject comparison_time) {
        if (comparison_time == UNPROVIDED) {
            comparison_time = get_internal_real_time();
        }
        return subtract(comparison_time, reference_time);
    }

    public static SubLObject elapsed_internal_real_time_to_elapsed_seconds(final SubLObject elapsed) {
        return divide(elapsed, time_high.$internal_time_units_per_second$.getGlobalValue());
    }

    public static SubLObject elapsed_seconds_to_elapsed_internal_real_time(final SubLObject elapsed) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject v_answer = truncate(multiply(elapsed, time_high.$internal_time_units_per_second$.getGlobalValue()), UNPROVIDED);
        final SubLObject remainder = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return v_answer;
    }

    public static SubLObject elapsed_seconds_between_internal_real_times(final SubLObject start_time, final SubLObject end_time) {
        return elapsed_internal_real_time_to_elapsed_seconds(elapsed_internal_real_time(start_time, end_time));
    }

    public static SubLObject readable_elapsed_time_string(final SubLObject seconds, SubLObject decimal_precision) {
        if (decimal_precision == UNPROVIDED) {
            decimal_precision = TWO_INTEGER;
        }
        assert NIL != number_utilities.non_negative_number_p(seconds) : "number_utilities.non_negative_number_p(seconds) " + "CommonSymbols.NIL != number_utilities.non_negative_number_p(seconds) " + seconds;
        assert NIL != subl_promotions.non_negative_integer_p(decimal_precision) : "subl_promotions.non_negative_integer_p(decimal_precision) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(decimal_precision) " + decimal_precision;
        if (!decimal_precision.numLE(ZERO_INTEGER)) {
            if (seconds.numGE(multiply(TWO_INTEGER, $seconds_in_a_minute$.getGlobalValue()))) {
                decimal_precision = ZERO_INTEGER;
            } else
                if (seconds.numL(ONE_INTEGER) && seconds.numGE(divide($int$100, $milliseconds_in_a_second$.getGlobalValue()))) {
                    decimal_precision = ZERO_INTEGER;
                } else
                    if (decimal_precision.isPositive() && seconds.numGE($seconds_in_a_minute$.getGlobalValue())) {
                        decimal_precision = ONE_INTEGER;
                    }


        }
        SubLObject hours = floor(divide(seconds, $seconds_in_an_hour$.getGlobalValue()), UNPROVIDED);
        final SubLObject use_hoursP = numGE(hours, TWO_INTEGER);
        final SubLObject time_minus_hours = (NIL != use_hoursP) ? subtract(seconds, multiply(hours, $seconds_in_an_hour$.getGlobalValue())) : seconds;
        SubLObject minutes = floor(divide(time_minus_hours, $seconds_in_a_minute$.getGlobalValue()), UNPROVIDED);
        final SubLObject use_minutesP = makeBoolean((NIL != use_hoursP) || minutes.numGE(TWO_INTEGER));
        SubLObject seconds_$1 = (NIL != use_minutesP) ? subtract(time_minus_hours, multiply(minutes, $seconds_in_a_minute$.getGlobalValue())) : time_minus_hours;
        final SubLObject use_secondsP = makeBoolean((NIL != use_minutesP) || seconds_$1.numGE(ONE_INTEGER));
        SubLObject millis = (NIL != use_secondsP) ? NIL : multiply($milliseconds_in_a_second$.getGlobalValue(), seconds_$1);
        final SubLObject smallest_unit_string = (NIL != use_secondsP) ? $str32$_second__P : $$$ms;
        final SubLObject smallest_unit_format_string = (decimal_precision.isZero()) ? cconcatenate($str34$_D, smallest_unit_string) : cconcatenate($str35$__, new SubLObject[]{ format_nil.format_nil_d(decimal_precision), $$$F, smallest_unit_string });
        if (decimal_precision.isZero()) {
            seconds_$1 = round(seconds_$1, UNPROVIDED);
            millis = (NIL != millis) ? round(millis, UNPROVIDED) : NIL;
            if ((NIL != use_minutesP) && seconds_$1.eql($seconds_in_a_minute$.getGlobalValue())) {
                seconds_$1 = ZERO_INTEGER;
                minutes = add(minutes, ONE_INTEGER);
            }
            if ((NIL != use_hoursP) && minutes.eql($minutes_in_an_hour$.getGlobalValue())) {
                minutes = ZERO_INTEGER;
                hours = add(hours, ONE_INTEGER);
            }
        }
        return format_nil.format_nil_a(NIL != use_secondsP ? NIL != use_minutesP ? NIL != use_hoursP ? format(NIL, $str37$_D_hours___D_minute__P, hours, minutes) : format(NIL, cconcatenate($str38$_D_minute__P__, smallest_unit_format_string), minutes, seconds_$1) : format(NIL, smallest_unit_format_string, seconds_$1) : format(NIL, smallest_unit_format_string, millis));
    }

    public static SubLObject explode_elapsed_time_ms(final SubLObject possible_float_ms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject ms = floor(possible_float_ms, UNPROVIDED);
        final SubLObject sub_1_ms = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject days = floor(divide(ms, new SubLObject[]{ $milliseconds_in_a_second$.getGlobalValue(), $seconds_in_a_day$.getGlobalValue() }), UNPROVIDED);
        final SubLObject day_milliseconds = multiply(days, $seconds_in_a_day$.getGlobalValue(), $milliseconds_in_a_second$.getGlobalValue());
        final SubLObject hours = floor(divide(subtract(ms, day_milliseconds), new SubLObject[]{ $milliseconds_in_a_second$.getGlobalValue(), $seconds_in_an_hour$.getGlobalValue() }), UNPROVIDED);
        final SubLObject hours_milliseconds = multiply(hours, $seconds_in_an_hour$.getGlobalValue(), $milliseconds_in_a_second$.getGlobalValue());
        final SubLObject minutes = floor(divide(subtract(ms, day_milliseconds, hours_milliseconds), new SubLObject[]{ $milliseconds_in_a_second$.getGlobalValue(), $seconds_in_a_minute$.getGlobalValue() }), UNPROVIDED);
        final SubLObject minutes_milliseconds = multiply(minutes, $seconds_in_a_minute$.getGlobalValue(), $milliseconds_in_a_second$.getGlobalValue());
        final SubLObject seconds = floor(divide(subtract(ms, new SubLObject[]{ day_milliseconds, hours_milliseconds, minutes_milliseconds }), $milliseconds_in_a_second$.getGlobalValue()), UNPROVIDED);
        final SubLObject seconds_milliseconds = multiply(seconds, $milliseconds_in_a_second$.getGlobalValue());
        final SubLObject milliseconds = subtract(ms, new SubLObject[]{ day_milliseconds, hours_milliseconds, minutes_milliseconds, seconds_milliseconds });
        final SubLObject microseconds = floor(multiply($microseconds_in_a_millisecond$.getGlobalValue(), sub_1_ms), UNPROVIDED);
        return list(days, hours, minutes, seconds, milliseconds, microseconds);
    }

    public static SubLObject readable_elapsed_time_string_ms(final SubLObject ms) {
        if (NIL != number_utilities.negative_number_p(ms)) {
            return cconcatenate($str47$_, format_nil.format_nil_a_no_copy(readable_elapsed_time_string_ms(minus(ms))));
        }
        SubLObject current;
        final SubLObject datum = current = explode_elapsed_time_ms(ms);
        SubLObject days = NIL;
        SubLObject hours = NIL;
        SubLObject minutes = NIL;
        SubLObject seconds = NIL;
        SubLObject milliseconds = NIL;
        SubLObject microseconds = NIL;
        destructuring_bind_must_consp(current, datum, $list48);
        days = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list48);
        hours = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list48);
        minutes = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list48);
        seconds = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list48);
        milliseconds = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list48);
        microseconds = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list48);
            return NIL;
        }
        if ((NIL != subl_promotions.positive_integer_p(days)) && hours.isZero()) {
            return format(NIL, $str49$_D_day__P, days);
        }
        if (NIL != subl_promotions.positive_integer_p(days)) {
            return format(NIL, $str50$_D_hour__P, add(multiply($int$24, days), hours));
        }
        if ((NIL != subl_promotions.positive_integer_p(hours)) && minutes.isZero()) {
            return format(NIL, $str50$_D_hour__P, hours, hours);
        }
        if (NIL != subl_promotions.positive_integer_p(hours)) {
            return format(NIL, $str51$_D__2__0D_hour_P, new SubLObject[]{ hours, minutes, add(hours, minutes) });
        }
        if ((NIL != subl_promotions.positive_integer_p(minutes)) && seconds.isZero()) {
            return format(NIL, $str52$_D_minute__P, minutes);
        }
        if (NIL != subl_promotions.positive_integer_p(minutes)) {
            return format(NIL, $str53$_D__2__0D_minute_P, new SubLObject[]{ minutes, seconds, add(minutes, seconds) });
        }
        if ((NIL != subl_promotions.positive_integer_p(seconds)) && TEN_INTEGER.numG(milliseconds)) {
            return format(NIL, $str54$_D_second__P, seconds);
        }
        if (NIL != subl_promotions.positive_integer_p(seconds)) {
            final SubLObject centiseconds = round(divide(milliseconds, TEN_INTEGER), UNPROVIDED);
            return format(NIL, $str55$_D__2__0D_second_P, new SubLObject[]{ seconds, centiseconds, add(seconds, centiseconds) });
        }
        if (milliseconds.isPositive()) {
            return cconcatenate(format_nil.format_nil_d_no_copy(milliseconds), $$$_ms);
        }
        if (microseconds.isPositive()) {
            return cconcatenate(format_nil.format_nil_d_no_copy(microseconds), $str57$___s);
        }
        return copy_seq($str58$0___s);
    }

    public static SubLObject datetime_string_from_template(SubLObject universal_time, SubLObject template) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        if (template == UNPROVIDED) {
            template = $str28$mm_dd_yyyy_hh_mm_ss;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != universal_time_p(universal_time) : "numeric_date_utilities.universal_time_p(universal_time) " + "CommonSymbols.NIL != numeric_date_utilities.universal_time_p(universal_time) " + universal_time;
        assert NIL != datetime_string_template_p(template) : "numeric_date_utilities.datetime_string_template_p(template) " + "CommonSymbols.NIL != numeric_date_utilities.datetime_string_template_p(template) " + template;
        thread.resetMultipleValues();
        final SubLObject second = decode_universal_time(universal_time, UNPROVIDED);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return encode_datetime_string_from_template(NIL, second, minute, hour, day, month, year, template);
    }

    public static SubLObject encode_datetime_string_from_template(final SubLObject millisecond, final SubLObject second, final SubLObject minute, final SubLObject hour, final SubLObject day, final SubLObject month, final SubLObject year, final SubLObject template) {
        assert NIL != datetime_string_template_p(template) : "numeric_date_utilities.datetime_string_template_p(template) " + "CommonSymbols.NIL != numeric_date_utilities.datetime_string_template_p(template) " + template;
        final SubLObject subtemplates = string_utilities.break_words(template, symbol_function(NON_DATE_TIME_WHITESPACE_P), UNPROVIDED);
        if ((length(subtemplates).numE(TWO_INTEGER) && (NIL != date_template_p(subtemplates.first()))) && (NIL != time_template_p(second(subtemplates)))) {
            return format(NIL, $str61$_A__A, encode_date_from_template(day, month, year, subtemplates.first()), encode_time_from_template(millisecond, second, minute, hour, second(subtemplates)));
        }
        if ((length(subtemplates).numE(TWO_INTEGER) && (NIL != time_template_p(subtemplates.first()))) && (NIL != date_template_p(second(subtemplates)))) {
            return format(NIL, $str61$_A__A, encode_time_from_template(millisecond, second, minute, hour, subtemplates.first()), encode_date_from_template(day, month, year, second(subtemplates)));
        }
        if (length(subtemplates).numE(ONE_INTEGER) && (NIL != date_template_p(subtemplates.first()))) {
            return encode_date_from_template(day, month, year, subtemplates.first());
        }
        if (length(subtemplates).numE(ONE_INTEGER) && (NIL != time_template_p(subtemplates.first()))) {
            return encode_time_from_template(millisecond, second, minute, hour, subtemplates.first());
        }
        Errors.error($str62$Template__s_is_not_a_valid_dateti, template);
        return NIL;
    }

    public static SubLObject valid_date_template_char(final SubLObject v_char) {
        return member(v_char, $list63, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject valid_time_template_char(final SubLObject v_char) {
        return member(v_char, $list64, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject valid_date_separator(final SubLObject v_char) {
        return makeBoolean((v_char.eql(CHAR_slash) || v_char.eql(CHAR_hyphen)) || v_char.eql(CHAR_underbar));
    }

    public static SubLObject valid_time_separator(final SubLObject v_char) {
        return eql(v_char, CHAR_colon);
    }

    public static SubLObject valid_year_token(final SubLObject v_char) {
        return makeBoolean(v_char.eql(CHAR_y) || v_char.eql(CHAR_Y));
    }

    public static SubLObject valid_month_token(final SubLObject v_char) {
        return makeBoolean(v_char.eql(CHAR_m) || v_char.eql(CHAR_M));
    }

    public static SubLObject valid_day_token(final SubLObject v_char) {
        return makeBoolean(v_char.eql(CHAR_d) || v_char.eql(CHAR_D));
    }

    public static SubLObject valid_hour_token(final SubLObject v_char) {
        return makeBoolean(v_char.eql(CHAR_h) || v_char.eql(CHAR_H));
    }

    public static SubLObject valid_minute_token(final SubLObject v_char) {
        return makeBoolean(v_char.eql(CHAR_m) || v_char.eql(CHAR_M));
    }

    public static SubLObject valid_second_token(final SubLObject v_char) {
        return makeBoolean(v_char.eql(CHAR_s) || v_char.eql(CHAR_S));
    }

    public static SubLObject date_template_p(final SubLObject template) {
        if (NIL == list_utilities.find_if_not(symbol_function(VALID_DATE_TEMPLATE_CHAR), template, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject time_template_p(final SubLObject template) {
        return makeBoolean((((template.equalp($str66$hh_mm_ss) || template.equalp($str67$hh_mm_ss_mmm)) || template.equalp($str68$hh_mm)) || template.equalp($str69$hh_mm_ss_m)) || template.equalp($str70$hh_mm_ss_mm));
    }

    public static SubLObject datetime_string_template_p(final SubLObject template) {
        final SubLObject parts = string_utilities.break_words(template, symbol_function(NON_DATE_TIME_WHITESPACE_P), UNPROVIDED);
        final SubLObject length = length(parts);
        if ((!length.numGE(ONE_INTEGER)) || (!length.numLE(TWO_INTEGER))) {
            return NIL;
        }
        final SubLObject part1 = nth(ZERO_INTEGER, parts);
        final SubLObject part2 = nth(ONE_INTEGER, parts);
        if (((NIL != time_template_p(part1)) && ((NIL == part2) || (NIL != date_template_p(part2)))) || ((NIL != date_template_p(part1)) && ((NIL == part2) || (NIL != time_template_p(part2))))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject non_date_time_whitespace_p(final SubLObject v_char) {
        return makeBoolean(NIL == date_time_whitespace_p(v_char));
    }

    public static SubLObject date_time_whitespace_p(final SubLObject v_char) {
        return makeBoolean((NIL != string_utilities.whitespacep(v_char)) || v_char.eql(CHAR_T));
    }

    public static SubLObject n_digit_template_element_p(final SubLObject template, final SubLObject n, final SubLObject token_checker, final SubLObject separator_checker) {
        if (length(template).numL(n)) {
            return NIL;
        }
        SubLObject index;
        for (index = NIL, index = ZERO_INTEGER; index.numL(n); index = add(index, ONE_INTEGER)) {
            if (NIL == funcall(token_checker, Strings.sublisp_char(template, index))) {
                return NIL;
            }
        }
        if (length(template).numG(n) && (NIL == funcall(separator_checker, Strings.sublisp_char(template, n)))) {
            return NIL;
        }
        return T;
    }

    public static SubLObject encode_date_from_template(final SubLObject day, final SubLObject month, final SubLObject year, final SubLObject template) {
        if (NIL != n_digit_template_element_p(template, FOUR_INTEGER, symbol_function(VALID_YEAR_TOKEN), symbol_function(VALID_DATE_SEPARATOR))) {
            return encode_next_date_element(day, month, year, template, FOUR_INTEGER, year);
        }
        if (NIL != n_digit_template_element_p(template, TWO_INTEGER, symbol_function(VALID_YEAR_TOKEN), symbol_function(VALID_DATE_SEPARATOR))) {
            return encode_next_date_element(day, month, year, template, TWO_INTEGER, mod(year, $int$100));
        }
        if (NIL != n_digit_template_element_p(template, TWO_INTEGER, symbol_function(VALID_MONTH_TOKEN), symbol_function(VALID_DATE_SEPARATOR))) {
            return encode_next_date_element(day, month, year, template, TWO_INTEGER, month);
        }
        if (NIL != n_digit_template_element_p(template, TWO_INTEGER, symbol_function(VALID_DAY_TOKEN), symbol_function(VALID_DATE_SEPARATOR))) {
            return encode_next_date_element(day, month, year, template, TWO_INTEGER, day);
        }
        Errors.error($str75$Template_or_template_portion__S_d, template);
        return NIL;
    }

    public static SubLObject encode_next_date_element(final SubLObject day, final SubLObject month, final SubLObject year, final SubLObject template, final SubLObject elem_length, final SubLObject item) {
        final SubLObject format_string = cconcatenate($str76$_, new SubLObject[]{ string_utilities.to_string(elem_length), $str77$__0D });
        return cconcatenate(format(NIL, format_string, item), add(elem_length, ONE_INTEGER).numG(length(template)) ? $str25$ : cconcatenate(string_utilities.to_string(Strings.sublisp_char(template, elem_length)), encode_date_from_template(day, month, year, string_utilities.substring(template, add(elem_length, ONE_INTEGER), UNPROVIDED))));
    }

    public static SubLObject encode_time_from_template(final SubLObject millisecond, final SubLObject second, final SubLObject minute, final SubLObject hour, final SubLObject template) {
        if (NIL == hour) {
            return $str25$;
        }
        if (template.equalp($str66$hh_mm_ss)) {
            return format(NIL, $str78$_2__0D__2__0D__2__0D, new SubLObject[]{ hour, NIL != minute ? minute : ZERO_INTEGER, NIL != second ? second : ZERO_INTEGER });
        }
        if (template.equalp($str68$hh_mm)) {
            return format(NIL, $str79$_2__0D__2__0D, hour, NIL != minute ? minute : ZERO_INTEGER);
        }
        if (template.equalp($str67$hh_mm_ss_mmm)) {
            return format(NIL, $str80$_2__0D__2__0D__2__0D__3__0D, new SubLObject[]{ hour, NIL != minute ? minute : ZERO_INTEGER, NIL != second ? second : ZERO_INTEGER, NIL != millisecond ? millisecond : ZERO_INTEGER });
        }
        if (template.equalp($str70$hh_mm_ss_mm)) {
            return format(NIL, $str81$_2__0D__2__0D__2__0D__2__0D, new SubLObject[]{ hour, NIL != minute ? minute : ZERO_INTEGER, NIL != second ? second : ZERO_INTEGER, NIL != millisecond ? number_utilities.div(millisecond, TEN_INTEGER) : ZERO_INTEGER });
        }
        if (template.equalp($str69$hh_mm_ss_m)) {
            return format(NIL, $str82$_2__0D__2__0D__2__0D__1__0D, new SubLObject[]{ hour, NIL != minute ? minute : ZERO_INTEGER, NIL != second ? second : ZERO_INTEGER, NIL != millisecond ? number_utilities.div(millisecond, $int$100) : ZERO_INTEGER });
        }
        Errors.error($str83$Template_or_template_portion__A_w);
        return NIL;
    }

    public static SubLObject decode_datetime_string_from_template(final SubLObject datetime_string, final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != datetime_string_template_p(template) : "numeric_date_utilities.datetime_string_template_p(template) " + "CommonSymbols.NIL != numeric_date_utilities.datetime_string_template_p(template) " + template;
        final SubLObject subtemplates = string_utilities.break_words(template, symbol_function(NON_DATE_TIME_WHITESPACE_P), UNPROVIDED);
        final SubLObject subdatetime_strings = string_utilities.break_words(datetime_string, symbol_function(NON_DATE_TIME_WHITESPACE_P), UNPROVIDED);
        if (!length(subtemplates).eql(length(subdatetime_strings))) {
            Errors.error($str84$The_template__S_doesn_t_match_the, template, datetime_string);
        }
        if ((length(subtemplates).numE(TWO_INTEGER) && (NIL != date_template_p(subtemplates.first()))) && (NIL != time_template_p(second(subtemplates)))) {
            thread.resetMultipleValues();
            final SubLObject day = decode_date_from_template(subdatetime_strings.first(), subtemplates.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject month = thread.secondMultipleValue();
            final SubLObject year = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject millisecond = decode_time_from_template(second(subdatetime_strings), second(subtemplates));
            final SubLObject second = thread.secondMultipleValue();
            final SubLObject minute = thread.thirdMultipleValue();
            final SubLObject hour = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            return values(millisecond, second, minute, hour, day, month, year);
        }
        if ((length(subtemplates).numE(TWO_INTEGER) && (NIL != time_template_p(subtemplates.first()))) && (NIL != date_template_p(second(subtemplates)))) {
            thread.resetMultipleValues();
            final SubLObject millisecond2 = decode_time_from_template(subdatetime_strings.first(), subtemplates.first());
            final SubLObject second2 = thread.secondMultipleValue();
            final SubLObject minute2 = thread.thirdMultipleValue();
            final SubLObject hour2 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject day2 = decode_date_from_template(second(subdatetime_strings), second(subtemplates), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject month2 = thread.secondMultipleValue();
            final SubLObject year2 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return values(millisecond2, second2, minute2, hour2, day2, month2, year2);
        }
        if (length(subtemplates).numE(ONE_INTEGER) && (NIL != date_template_p(subtemplates.first()))) {
            thread.resetMultipleValues();
            final SubLObject day = decode_date_from_template(subdatetime_strings.first(), subtemplates.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject month = thread.secondMultipleValue();
            final SubLObject year = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return values(NIL, NIL, NIL, NIL, day, month, year);
        }
        if (length(subtemplates).numE(ONE_INTEGER) && (NIL != time_template_p(subtemplates.first()))) {
            thread.resetMultipleValues();
            final SubLObject millisecond2 = decode_time_from_template(subdatetime_strings.first(), subtemplates.first());
            final SubLObject second2 = thread.secondMultipleValue();
            final SubLObject minute2 = thread.thirdMultipleValue();
            final SubLObject hour2 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            return values(millisecond2, second2, minute2, hour2, NIL, NIL, NIL);
        }
        Errors.error($str85$Template_or_template_portion__A_w, template);
        return NIL;
    }

    public static SubLObject decode_date_from_template(final SubLObject datestring, final SubLObject template, SubLObject day, SubLObject month, SubLObject year) {
        if (day == UNPROVIDED) {
            day = NIL;
        }
        if (month == UNPROVIDED) {
            month = NIL;
        }
        if (year == UNPROVIDED) {
            year = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!TWO_INTEGER.numGE(subtract(length(template), length(datestring))))) {
            Errors.error($str86$The_date_string__A_and_the_templa, datestring, template);
        }
        if ((((NIL != day) && (NIL != month)) && (NIL != year)) || datestring.equal($str25$)) {
            return values(day, month, year);
        }
        if ((NIL != n_digit_template_element_p(template, FOUR_INTEGER, symbol_function(VALID_YEAR_TOKEN), symbol_function(VALID_DATE_SEPARATOR))) && (NIL == year)) {
            year = read_from_string(datestring, NIL, $EOF, ZERO_INTEGER, FOUR_INTEGER, UNPROVIDED);
            if (length(datestring).numG(FOUR_INTEGER)) {
                thread.resetMultipleValues();
                final SubLObject ret_day = decode_date_from_template(string_utilities.substring(datestring, FIVE_INTEGER, UNPROVIDED), string_utilities.substring(template, FIVE_INTEGER, UNPROVIDED), day, month, year);
                final SubLObject ret_month = thread.secondMultipleValue();
                final SubLObject ret_year = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return values(ret_day, ret_month, ret_year);
            }
            return values(day, month, year);
        } else
            if ((NIL != n_digit_template_element_p(template, TWO_INTEGER, symbol_function(VALID_YEAR_TOKEN), symbol_function(VALID_DATE_SEPARATOR))) && (NIL == year)) {
                year = read_from_string(datestring, NIL, $EOF, ZERO_INTEGER, TWO_INTEGER, UNPROVIDED);
                if (length(datestring).numG(TWO_INTEGER)) {
                    thread.resetMultipleValues();
                    final SubLObject ret_day = decode_date_from_template(string_utilities.substring(datestring, THREE_INTEGER, UNPROVIDED), string_utilities.substring(template, THREE_INTEGER, UNPROVIDED), day, month, year);
                    final SubLObject ret_month = thread.secondMultipleValue();
                    final SubLObject ret_year = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    return values(ret_day, ret_month, ret_year);
                }
                return values(day, month, year);
            } else
                if ((NIL != n_digit_template_element_p(template, TWO_INTEGER, symbol_function(VALID_MONTH_TOKEN), symbol_function(VALID_DATE_SEPARATOR))) && (NIL == month)) {
                    SubLObject month_end = position_if(symbol_function(VALID_DATE_SEPARATOR), datestring, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL == month_end) {
                        month_end = TWO_INTEGER;
                    }
                    month = read_from_string(datestring, NIL, $EOF, ZERO_INTEGER, month_end, UNPROVIDED);
                    if (length(datestring).numG(month_end)) {
                        thread.resetMultipleValues();
                        final SubLObject ret_day2 = decode_date_from_template(string_utilities.substring(datestring, number_utilities.f_1X(month_end), UNPROVIDED), string_utilities.substring(template, THREE_INTEGER, UNPROVIDED), day, month, year);
                        final SubLObject ret_month2 = thread.secondMultipleValue();
                        final SubLObject ret_year2 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        return values(ret_day2, ret_month2, ret_year2);
                    }
                    return values(day, month, year);
                } else {
                    if ((NIL == n_digit_template_element_p(template, TWO_INTEGER, symbol_function(VALID_DAY_TOKEN), symbol_function(VALID_DATE_SEPARATOR))) || (NIL != day)) {
                        Errors.error($str88$Template_or_template_portion__A_d, template, datestring);
                        return NIL;
                    }
                    SubLObject day_end = position_if(symbol_function(VALID_DATE_SEPARATOR), datestring, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL == day_end) {
                        day_end = TWO_INTEGER;
                    }
                    day = read_from_string(datestring, NIL, $EOF, ZERO_INTEGER, day_end, UNPROVIDED);
                    if (length(datestring).numG(day_end)) {
                        thread.resetMultipleValues();
                        final SubLObject ret_day2 = decode_date_from_template(string_utilities.substring(datestring, number_utilities.f_1X(day_end), UNPROVIDED), string_utilities.substring(template, THREE_INTEGER, UNPROVIDED), day, month, year);
                        final SubLObject ret_month2 = thread.secondMultipleValue();
                        final SubLObject ret_year2 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        return values(ret_day2, ret_month2, ret_year2);
                    }
                    return values(day, month, year);
                }


    }

    public static SubLObject decode_time_from_template(final SubLObject timestring, final SubLObject template) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == member(template, $list89, symbol_function(EQUALP), UNPROVIDED))) {
            Errors.error($str90$The_template__A_is_not_a_recogniz, template);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!length(timestring).numE(length(template)))) {
            Errors.error($str91$The_time_string__A_and_the_templa, timestring, template);
        }
        final SubLObject hour = read_from_string(timestring, NIL, $EOF, ZERO_INTEGER, TWO_INTEGER, UNPROVIDED);
        final SubLObject minute = read_from_string(timestring, NIL, $EOF, THREE_INTEGER, FIVE_INTEGER, UNPROVIDED);
        SubLObject second = NIL;
        SubLObject millisecond = NIL;
        if (((template.equalp($str66$hh_mm_ss) || template.equalp($str69$hh_mm_ss_m)) || template.equalp($str70$hh_mm_ss_mm)) || template.equalp($str67$hh_mm_ss_mmm)) {
            second = read_from_string(timestring, NIL, $EOF, SIX_INTEGER, EIGHT_INTEGER, UNPROVIDED);
        }
        if (template.equalp($str67$hh_mm_ss_mmm)) {
            millisecond = read_from_string(timestring, NIL, $EOF, NINE_INTEGER, TWELVE_INTEGER, UNPROVIDED);
        } else
            if (template.equalp($str70$hh_mm_ss_mm)) {
                millisecond = multiply(TEN_INTEGER, read_from_string(timestring, NIL, $EOF, NINE_INTEGER, ELEVEN_INTEGER, UNPROVIDED));
            } else
                if (template.equalp($str69$hh_mm_ss_m)) {
                    millisecond = multiply($int$100, read_from_string(timestring, NIL, $EOF, NINE_INTEGER, TEN_INTEGER, UNPROVIDED));
                }


        return values(millisecond, second, minute, hour);
    }

    public static SubLObject decode_elapsed_seconds(final SubLObject elapsed_seconds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != number_utilities.non_negative_number_p(elapsed_seconds) : "number_utilities.non_negative_number_p(elapsed_seconds) " + "CommonSymbols.NIL != number_utilities.non_negative_number_p(elapsed_seconds) " + elapsed_seconds;
        thread.resetMultipleValues();
        final SubLObject truncated_exact_seconds = truncate(elapsed_seconds, UNPROVIDED);
        final SubLObject partial_seconds = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject current;
        final SubLObject datum = current = number_utilities.decode_integer_multiples(truncated_exact_seconds, $elapsed_seconds_multiples$.getGlobalValue());
        SubLObject whole_seconds = NIL;
        destructuring_bind_must_consp(current, datum, $list92);
        whole_seconds = current.first();
        current = current.rest();
        final SubLObject minutes = (current.isCons()) ? current.first() : ZERO_INTEGER;
        destructuring_bind_must_listp(current, datum, $list92);
        current = current.rest();
        final SubLObject hours = (current.isCons()) ? current.first() : ZERO_INTEGER;
        destructuring_bind_must_listp(current, datum, $list92);
        current = current.rest();
        final SubLObject elapsed_days = (current.isCons()) ? current.first() : ZERO_INTEGER;
        destructuring_bind_must_listp(current, datum, $list92);
        current = current.rest();
        if (NIL == current) {
            final SubLObject seconds = add(whole_seconds, partial_seconds);
            return values(seconds, minutes, hours, elapsed_days);
        }
        cdestructuring_bind_error(datum, $list92);
        return NIL;
    }

    public static SubLObject decode_elapsed_seconds_without_days(final SubLObject elapsed_seconds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != number_utilities.non_negative_number_p(elapsed_seconds) : "number_utilities.non_negative_number_p(elapsed_seconds) " + "CommonSymbols.NIL != number_utilities.non_negative_number_p(elapsed_seconds) " + elapsed_seconds;
        thread.resetMultipleValues();
        final SubLObject truncated_exact_seconds = truncate(elapsed_seconds, UNPROVIDED);
        final SubLObject partial_seconds = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject current;
        final SubLObject datum = current = number_utilities.decode_integer_multiples(truncated_exact_seconds, $elapsed_seconds_wXo_days_multiples$.getGlobalValue());
        SubLObject whole_seconds = NIL;
        destructuring_bind_must_consp(current, datum, $list93);
        whole_seconds = current.first();
        current = current.rest();
        final SubLObject minutes = (current.isCons()) ? current.first() : ZERO_INTEGER;
        destructuring_bind_must_listp(current, datum, $list93);
        current = current.rest();
        final SubLObject hours = (current.isCons()) ? current.first() : ZERO_INTEGER;
        destructuring_bind_must_listp(current, datum, $list93);
        current = current.rest();
        if (NIL == current) {
            final SubLObject seconds = add(whole_seconds, partial_seconds);
            return values(seconds, minutes, hours);
        }
        cdestructuring_bind_error(datum, $list93);
        return NIL;
    }

    public static SubLObject encode_elapsed_seconds(SubLObject seconds, SubLObject minutes, SubLObject hours, SubLObject elapsed_days) {
        if (seconds == UNPROVIDED) {
            seconds = ZERO_INTEGER;
        }
        if (minutes == UNPROVIDED) {
            minutes = ZERO_INTEGER;
        }
        if (hours == UNPROVIDED) {
            hours = ZERO_INTEGER;
        }
        if (elapsed_days == UNPROVIDED) {
            elapsed_days = ZERO_INTEGER;
        }
        assert NIL != number_utilities.non_negative_number_p(seconds) : "number_utilities.non_negative_number_p(seconds) " + "CommonSymbols.NIL != number_utilities.non_negative_number_p(seconds) " + seconds;
        assert NIL != subl_promotions.non_negative_integer_p(minutes) : "subl_promotions.non_negative_integer_p(minutes) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(minutes) " + minutes;
        assert NIL != subl_promotions.non_negative_integer_p(hours) : "subl_promotions.non_negative_integer_p(hours) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(hours) " + hours;
        assert NIL != subl_promotions.non_negative_integer_p(elapsed_days) : "subl_promotions.non_negative_integer_p(elapsed_days) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(elapsed_days) " + elapsed_days;
        return number_utilities.encode_integer_multiples(list(seconds, minutes, hours, elapsed_days), $elapsed_seconds_multiples$.getGlobalValue());
    }

    public static SubLObject encode_elapsed_seconds_string(SubLObject seconds, SubLObject minutes, SubLObject hours, SubLObject elapsed_days) {
        if (seconds == UNPROVIDED) {
            seconds = ZERO_INTEGER;
        }
        if (minutes == UNPROVIDED) {
            minutes = ZERO_INTEGER;
        }
        if (hours == UNPROVIDED) {
            hours = ZERO_INTEGER;
        }
        if (elapsed_days == UNPROVIDED) {
            elapsed_days = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != number_utilities.non_negative_number_p(seconds) : "number_utilities.non_negative_number_p(seconds) " + "CommonSymbols.NIL != number_utilities.non_negative_number_p(seconds) " + seconds;
        assert NIL != subl_promotions.non_negative_integer_p(minutes) : "subl_promotions.non_negative_integer_p(minutes) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(minutes) " + minutes;
        assert NIL != subl_promotions.non_negative_integer_p(hours) : "subl_promotions.non_negative_integer_p(hours) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(hours) " + hours;
        assert NIL != subl_promotions.non_negative_integer_p(elapsed_days) : "subl_promotions.non_negative_integer_p(elapsed_days) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(elapsed_days) " + elapsed_days;
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            if (!ZERO_INTEGER.numE(elapsed_days)) {
                format(stream, $str94$__A_day_A, elapsed_days, ONE_INTEGER.numE(elapsed_days) ? $str25$ : $$$s);
            }
            if (!ZERO_INTEGER.numE(hours)) {
                format(stream, $str96$__A_hour_A, hours, ONE_INTEGER.numE(hours) ? $str25$ : $$$s);
            }
            if (!ZERO_INTEGER.numE(minutes)) {
                format(stream, $str97$__A_minute_A, minutes, ONE_INTEGER.numE(minutes) ? $str25$ : $$$s);
            }
            if (!ZERO_INTEGER.numE(seconds)) {
                final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
                try {
                    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                    format(stream, $str99$__A_second_A, seconds.isDouble() ? number_utilities.significant_digits(seconds, EIGHT_INTEGER) : seconds, ONE_INTEGER.numE(seconds) ? $str25$ : $$$s);
                } finally {
                    $read_default_float_format$.rebind(_prev_bind_0, thread);
                }
            }
            result = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        if (NIL != string_utilities.empty_string_p(result)) {
            return $$$_0_seconds;
        }
        return result;
    }

    public static SubLObject elapsed_seconds_string(final SubLObject elapsed_seconds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject seconds = decode_elapsed_seconds(elapsed_seconds);
        final SubLObject minutes = thread.secondMultipleValue();
        final SubLObject hours = thread.thirdMultipleValue();
        final SubLObject elapsed_days = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        return encode_elapsed_seconds_string(seconds, minutes, hours, elapsed_days);
    }

    public static SubLObject universal_date_p(final SubLObject v_object) {
        if (v_object.isInteger()) {
            if (v_object.isNegative()) {
                return universal_date_p(minus(v_object));
            }
            final SubLObject day = rem(v_object, $int$100);
            if (day.numLE($int$31)) {
                final SubLObject temp = integerDivide(v_object, $int$100);
                final SubLObject month = rem(temp, $int$100);
                if (ONE_INTEGER.numLE(month) && month.numLE(TWELVE_INTEGER)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject get_universal_date(SubLObject universal_time, SubLObject time_zone) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        if (time_zone == UNPROVIDED) {
            time_zone = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != universal_time_p(universal_time) : "numeric_date_utilities.universal_time_p(universal_time) " + "CommonSymbols.NIL != numeric_date_utilities.universal_time_p(universal_time) " + universal_time;
        thread.resetMultipleValues();
        final SubLObject second = decode_universal_time(universal_time, time_zone);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return encode_universal_date(day, month, year);
    }

    public static SubLObject today() {
        return get_universal_date(UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject yesterday() {
        return universal_date_subtract_days(today(), ONE_INTEGER);
    }

    public static SubLObject tomorrow() {
        return universal_date_add_days(today(), ONE_INTEGER);
    }

    public static SubLObject this_year() {
        return nth_value_step_2(nth_value_step_1(FIVE_INTEGER), decode_universal_time(get_universal_time(), UNPROVIDED));
    }

    public static SubLObject universal_date_add_days(final SubLObject universal_date, final SubLObject days) {
        assert NIL != universal_date_p(universal_date) : "numeric_date_utilities.universal_date_p(universal_date) " + "CommonSymbols.NIL != numeric_date_utilities.universal_date_p(universal_date) " + universal_date;
        assert NIL != integerp(days) : "Types.integerp(days) " + "CommonSymbols.NIL != Types.integerp(days) " + days;
        return universal_date_add_days_int(universal_date, days);
    }

    public static SubLObject universal_date_subtract_days(final SubLObject universal_date, final SubLObject days) {
        assert NIL != universal_date_p(universal_date) : "numeric_date_utilities.universal_date_p(universal_date) " + "CommonSymbols.NIL != numeric_date_utilities.universal_date_p(universal_date) " + universal_date;
        assert NIL != integerp(days) : "Types.integerp(days) " + "CommonSymbols.NIL != Types.integerp(days) " + days;
        return universal_date_add_days_int(universal_date, minus(days));
    }

    public static SubLObject universal_date_add_days_int(final SubLObject universal_date, final SubLObject days) {
        final SubLObject time_zone = ZERO_INTEGER;
        final SubLObject start_time = universal_time_for_start_of_universal_date(universal_date, time_zone);
        final SubLObject offset = multiply($seconds_in_a_day$.getGlobalValue(), days);
        final SubLObject ans_start_time = add(start_time, offset);
        return get_universal_date(ans_start_time, time_zone);
    }

    public static SubLObject decode_universal_date(SubLObject universal_date) {
        if (universal_date == UNPROVIDED) {
            universal_date = get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(universal_date) : "Types.integerp(universal_date) " + "CommonSymbols.NIL != Types.integerp(universal_date) " + universal_date;
        if (universal_date.isNegative()) {
            thread.resetMultipleValues();
            final SubLObject day = decode_universal_date(minus(universal_date));
            final SubLObject month = thread.secondMultipleValue();
            final SubLObject year = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return values(day, month, minus(year));
        }
        final SubLObject day = rem(universal_date, $int$100);
        final SubLObject month = integerDivide(rem(universal_date, $int$10000), $int$100);
        final SubLObject year = integerDivide(universal_date, $int$10000);
        return values(day, month, year);
    }

    public static SubLObject day_from_universal_date(SubLObject universal_date) {
        if (universal_date == UNPROVIDED) {
            universal_date = get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        return nth_value_step_2(nth_value_step_1(ZERO_INTEGER), decode_universal_date(universal_date));
    }

    public static SubLObject month_from_universal_date(SubLObject universal_date) {
        if (universal_date == UNPROVIDED) {
            universal_date = get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        return nth_value_step_2(nth_value_step_1(ONE_INTEGER), decode_universal_date(universal_date));
    }

    public static SubLObject year_from_universal_date(SubLObject universal_date) {
        if (universal_date == UNPROVIDED) {
            universal_date = get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        return nth_value_step_2(nth_value_step_1(TWO_INTEGER), decode_universal_date(universal_date));
    }

    public static SubLObject encode_universal_date(final SubLObject day, final SubLObject month, final SubLObject year) {
        assert NIL != integerp(day) : "Types.integerp(day) " + "CommonSymbols.NIL != Types.integerp(day) " + day;
        assert NIL != plusp(day) : "Numbers.plusp(day) " + "CommonSymbols.NIL != Numbers.plusp(day) " + day;
        assert NIL != integerp(month) : "Types.integerp(month) " + "CommonSymbols.NIL != Types.integerp(month) " + month;
        assert NIL != plusp(month) : "Numbers.plusp(month) " + "CommonSymbols.NIL != Numbers.plusp(month) " + month;
        assert NIL != integerp(year) : "Types.integerp(year) " + "CommonSymbols.NIL != Types.integerp(year) " + year;
        if (year.isNegative()) {
            return minus(encode_universal_date(day, month, minus(year)));
        }
        return add(multiply(year, $int$10000), multiply(month, $int$100), day);
    }

    public static SubLObject datestring(SubLObject universal_date) {
        if (universal_date == UNPROVIDED) {
            universal_date = get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != universal_date_p(universal_date) : "numeric_date_utilities.universal_date_p(universal_date) " + "CommonSymbols.NIL != numeric_date_utilities.universal_date_p(universal_date) " + universal_date;
        thread.resetMultipleValues();
        final SubLObject day = decode_universal_date(universal_date);
        final SubLObject month = thread.secondMultipleValue();
        final SubLObject year = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return encode_datestring(day, month, year);
    }

    public static SubLObject datestringL(final SubLObject datestring1, final SubLObject datestring2) {
        if (datestring_year(datestring1).numL(datestring_year(datestring2))) {
            return T;
        }
        if (datestring_year(datestring2).numL(datestring_year(datestring1))) {
            return NIL;
        }
        if (datestring_month(datestring1).numL(datestring_month(datestring2))) {
            return T;
        }
        if (datestring_month(datestring2).numL(datestring_month(datestring1))) {
            return NIL;
        }
        if (datestring_day(datestring1).numL(datestring_day(datestring2))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject datestring_(final SubLObject datestring1, final SubLObject datestring2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject day1 = decode_datestring(datestring1);
        final SubLObject month1 = thread.secondMultipleValue();
        final SubLObject year1 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject day2 = decode_datestring(datestring2);
        final SubLObject month2 = thread.secondMultipleValue();
        final SubLObject year2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return subtract(encode_universal_date(day1, month1, year1), encode_universal_date(day2, month2, year2));
    }

    public static SubLObject datestring_year(final SubLObject datestring) {
        return string_utilities.string_to_integer(string_utilities.substring(datestring, SIX_INTEGER, TEN_INTEGER));
    }

    public static SubLObject datestring_month(final SubLObject datestring) {
        return string_utilities.string_to_integer(string_utilities.substring(datestring, ZERO_INTEGER, TWO_INTEGER));
    }

    public static SubLObject datestring_day(final SubLObject datestring) {
        return string_utilities.string_to_integer(string_utilities.substring(datestring, THREE_INTEGER, FIVE_INTEGER));
    }

    public static SubLObject encode_datestring(final SubLObject day, final SubLObject month, final SubLObject year) {
        assert NIL != integerp(day) : "Types.integerp(day) " + "CommonSymbols.NIL != Types.integerp(day) " + day;
        assert NIL != plusp(day) : "Numbers.plusp(day) " + "CommonSymbols.NIL != Numbers.plusp(day) " + day;
        assert NIL != integerp(month) : "Types.integerp(month) " + "CommonSymbols.NIL != Types.integerp(month) " + month;
        assert NIL != plusp(month) : "Numbers.plusp(month) " + "CommonSymbols.NIL != Numbers.plusp(month) " + month;
        assert NIL != integerp(year) : "Types.integerp(year) " + "CommonSymbols.NIL != Types.integerp(year) " + year;
        if ((!year.isNegative()) && year.numL($int$10000)) {
            return format(NIL, $str107$_2__0d__2__0d__4__0d, new SubLObject[]{ month, day, year });
        }
        if (!year.isNegative()) {
            return format(NIL, $str108$_2__0d__2__0d__d, new SubLObject[]{ month, day, year });
        }
        return format(NIL, $str109$_2__0d__2__0d___d, new SubLObject[]{ month, day, minus(year) });
    }

    public static SubLObject decode_datestring(final SubLObject datestring) {
        return values(datestring_day(datestring), datestring_month(datestring), datestring_year(datestring));
    }

    public static SubLObject month_ago(SubLObject universal_date, SubLObject n) {
        if (universal_date == UNPROVIDED) {
            universal_date = get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        if (n == UNPROVIDED) {
            n = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != universal_date_p(universal_date) : "numeric_date_utilities.universal_date_p(universal_date) " + "CommonSymbols.NIL != numeric_date_utilities.universal_date_p(universal_date) " + universal_date;
        thread.resetMultipleValues();
        final SubLObject day = decode_universal_date(universal_date);
        SubLObject month = thread.secondMultipleValue();
        SubLObject year = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        month = subtract(month, n);
        if (!month.numG(ZERO_INTEGER)) {
            year = subtract(year, ONE_INTEGER);
            month = add(month, $months_in_a_year$.getGlobalValue());
        }
        return encode_universal_date(day, month, year);
    }

    public static SubLObject get_julian_date(SubLObject universal_time, SubLObject precision) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        if (precision == UNPROVIDED) {
            precision = $FLOAT;
        }
        assert NIL != universal_time_p(universal_time) : "numeric_date_utilities.universal_time_p(universal_time) " + "CommonSymbols.NIL != numeric_date_utilities.universal_time_p(universal_time) " + universal_time;
        final SubLObject days = universal_days(universal_time, precision);
        return add(days, julian_offset(precision));
    }

    public static SubLObject julian_date_from_universal_date(final SubLObject universal_date, SubLObject afternoonP) {
        if (afternoonP == UNPROVIDED) {
            afternoonP = NIL;
        }
        assert NIL != universal_date_p(universal_date) : "numeric_date_utilities.universal_date_p(universal_date) " + "CommonSymbols.NIL != numeric_date_utilities.universal_date_p(universal_date) " + universal_date;
        SubLObject universal_time = universal_time_for_start_of_universal_date(universal_date, UNPROVIDED);
        if (NIL != afternoonP) {
            universal_time = add(universal_time, multiply(TWELVE_INTEGER, $seconds_in_an_hour$.getGlobalValue()));
        }
        return get_julian_date(universal_time, $INTEGER);
    }

    public static SubLObject julian_offset(final SubLObject precision) {
        if (NIL == list_utilities.alist_lookup($julian_offsets$.getGlobalValue(), precision, UNPROVIDED, UNPROVIDED)) {
            $julian_offsets$.setGlobalValue(list_utilities.alist_enter($julian_offsets$.getGlobalValue(), precision, compute_julian_offset(precision), UNPROVIDED));
        }
        return list_utilities.alist_lookup($julian_offsets$.getGlobalValue(), precision, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject compute_julian_offset(final SubLObject precision) {
        SubLObject current;
        final SubLObject datum = current = $julian_date_reference$.getGlobalValue();
        SubLObject reference_universal_date = NIL;
        SubLObject reference_julian_date = NIL;
        destructuring_bind_must_consp(current, datum, $list114);
        reference_universal_date = current.first();
        current = reference_julian_date = current.rest();
        final SubLObject universal_time = universal_time_for_start_of_universal_date(reference_universal_date, UNPROVIDED);
        final SubLObject universal_date_days = universal_days(universal_time, precision);
        final SubLObject raw_offset = subtract(reference_julian_date, universal_date_days);
        return precision == $INTEGER ? floor(raw_offset, UNPROVIDED) : raw_offset;
    }

    public static SubLObject universal_time_for_start_of_universal_date(final SubLObject universal_date, SubLObject time_zone) {
        if (time_zone == UNPROVIDED) {
            time_zone = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject day = decode_universal_date(universal_date);
        final SubLObject month = thread.secondMultipleValue();
        final SubLObject year = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return encode_universal_time(ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, day, month, year, time_zone);
    }

    public static SubLObject universal_days(final SubLObject universal_time, final SubLObject precision) {
        if (precision.eql($INTEGER)) {
            return integerDivide(add(universal_time, multiply($seconds_in_an_hour$.getGlobalValue(), TWELVE_INTEGER)), $seconds_in_a_day$.getGlobalValue());
        }
        return divide(universal_time, $seconds_in_a_day$.getGlobalValue());
    }

    public static SubLObject universal_second_p(final SubLObject v_object) {
        if (((v_object.isInteger() && (!v_object.isNegative())) && v_object.numLE($int$235959)) && rem(v_object, $int$100).numL($seconds_in_a_minute$.getGlobalValue())) {
            SubLObject temp = integerDivide(v_object, $int$100);
            if (rem(temp, $int$100).numL($minutes_in_an_hour$.getGlobalValue())) {
                temp = integerDivide(temp, $int$100);
                if (temp.numL($hours_in_a_day$.getGlobalValue())) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject get_universal_second(SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != universal_time_p(universal_time) : "numeric_date_utilities.universal_time_p(universal_time) " + "CommonSymbols.NIL != numeric_date_utilities.universal_time_p(universal_time) " + universal_time;
        thread.resetMultipleValues();
        final SubLObject second = decode_universal_time(universal_time, UNPROVIDED);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return encode_universal_second(second, minute, hour);
    }

    public static SubLObject decode_universal_second(SubLObject universal_second) {
        if (universal_second == UNPROVIDED) {
            universal_second = get_universal_second(UNPROVIDED);
        }
        assert NIL != integerp(universal_second) : "Types.integerp(universal_second) " + "CommonSymbols.NIL != Types.integerp(universal_second) " + universal_second;
        SubLObject temp = universal_second;
        SubLObject second = NIL;
        SubLObject minute = NIL;
        SubLObject hour = NIL;
        second = rem(temp, $int$100);
        temp = integerDivide(temp, $int$100);
        minute = rem(temp, $int$100);
        temp = hour = integerDivide(temp, $int$100);
        return values(second, minute, hour);
    }

    public static SubLObject encode_universal_second(final SubLObject second, final SubLObject minute, final SubLObject hour) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(second) : "Types.integerp(second) " + "CommonSymbols.NIL != Types.integerp(second) " + second;
        assert NIL != integerp(minute) : "Types.integerp(minute) " + "CommonSymbols.NIL != Types.integerp(minute) " + minute;
        assert NIL != integerp(hour) : "Types.integerp(hour) " + "CommonSymbols.NIL != Types.integerp(hour) " + hour;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!ZERO_INTEGER.numLE(second)) || (!second.numLE($int$59)))) {
            Errors.error($str116$second__S_not_in_the_range_0_59, second);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!ZERO_INTEGER.numLE(minute)) || (!minute.numLE($int$59)))) {
            Errors.error($str117$minute__S_not_in_the_range_0_59, minute);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!ZERO_INTEGER.numLE(hour)) || (!hour.numLE($int$59)))) {
            Errors.error($str118$hour__S_not_in_the_range_0_59, hour);
        }
        return add(multiply(hour, $int$10000), multiply(minute, $int$100), second);
    }

    public static SubLObject secondstring(SubLObject universal_second) {
        if (universal_second == UNPROVIDED) {
            universal_second = get_universal_second(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != universal_second_p(universal_second) : "numeric_date_utilities.universal_second_p(universal_second) " + "CommonSymbols.NIL != numeric_date_utilities.universal_second_p(universal_second) " + universal_second;
        thread.resetMultipleValues();
        final SubLObject second = decode_universal_second(universal_second);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return encode_secondstring(second, minute, hour);
    }

    public static SubLObject encode_secondstring(final SubLObject second, final SubLObject minute, final SubLObject hour) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(second) : "Types.integerp(second) " + "CommonSymbols.NIL != Types.integerp(second) " + second;
        assert NIL != integerp(minute) : "Types.integerp(minute) " + "CommonSymbols.NIL != Types.integerp(minute) " + minute;
        assert NIL != integerp(hour) : "Types.integerp(hour) " + "CommonSymbols.NIL != Types.integerp(hour) " + hour;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!ZERO_INTEGER.numLE(second)) || (!second.numLE($int$59)))) {
            Errors.error($str116$second__S_not_in_the_range_0_59, second);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!ZERO_INTEGER.numLE(minute)) || (!minute.numLE($int$59)))) {
            Errors.error($str117$minute__S_not_in_the_range_0_59, minute);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!ZERO_INTEGER.numLE(hour)) || (!hour.numLE($int$59)))) {
            Errors.error($str118$hour__S_not_in_the_range_0_59, hour);
        }
        return cconcatenate(format_nil.format_nil_a_no_copy(hour.numL(TEN_INTEGER) ? $$$0 : $str25$), new SubLObject[]{ format_nil.format_nil_a_no_copy(hour), $str121$_, format_nil.format_nil_a_no_copy(minute.numL(TEN_INTEGER) ? $$$0 : $str25$), format_nil.format_nil_a_no_copy(minute), $str121$_, format_nil.format_nil_a_no_copy(second.numL(TEN_INTEGER) ? $$$0 : $str25$), format_nil.format_nil_a_no_copy(second) });
    }

    public static SubLObject decode_secondstring(final SubLObject secondstring) {
        return values(secondstring_second(secondstring), secondstring_minute(secondstring), secondstring_hour(secondstring));
    }

    public static SubLObject secondstring_(final SubLObject secondstring1, final SubLObject secondstring2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject second1 = decode_secondstring(secondstring1);
        final SubLObject minute1 = thread.secondMultipleValue();
        final SubLObject hour1 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject second2 = decode_secondstring(secondstring2);
        final SubLObject minute2 = thread.secondMultipleValue();
        final SubLObject hour2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return add(subtract(second1, second2), multiply($seconds_in_a_minute$.getGlobalValue(), subtract(minute1, minute2)), multiply($seconds_in_an_hour$.getGlobalValue(), subtract(hour1, hour2)));
    }

    public static SubLObject secondstring_hour(final SubLObject secondstring) {
        return string_utilities.string_to_integer(string_utilities.substring(secondstring, ZERO_INTEGER, TWO_INTEGER));
    }

    public static SubLObject secondstring_minute(final SubLObject secondstring) {
        return string_utilities.string_to_integer(string_utilities.substring(secondstring, THREE_INTEGER, FIVE_INTEGER));
    }

    public static SubLObject secondstring_second(final SubLObject secondstring) {
        return string_utilities.string_to_integer(string_utilities.substring(secondstring, SIX_INTEGER, EIGHT_INTEGER));
    }

    public static SubLObject encode_millisecondstring(final SubLObject hour, final SubLObject minute, SubLObject second, SubLObject millisecond) {
        if (second == UNPROVIDED) {
            second = ZERO_INTEGER;
        }
        if (millisecond == UNPROVIDED) {
            millisecond = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(millisecond) : "Types.integerp(millisecond) " + "CommonSymbols.NIL != Types.integerp(millisecond) " + millisecond;
        assert NIL != integerp(second) : "Types.integerp(second) " + "CommonSymbols.NIL != Types.integerp(second) " + second;
        assert NIL != integerp(minute) : "Types.integerp(minute) " + "CommonSymbols.NIL != Types.integerp(minute) " + minute;
        assert NIL != integerp(hour) : "Types.integerp(hour) " + "CommonSymbols.NIL != Types.integerp(hour) " + hour;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!ZERO_INTEGER.numLE(millisecond)) || (!millisecond.numLE($int$999)))) {
            Errors.error($str123$second__S_not_in_the_range_0_999, second);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!ZERO_INTEGER.numLE(second)) || (!second.numLE($int$59)))) {
            Errors.error($str116$second__S_not_in_the_range_0_59, second);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!ZERO_INTEGER.numLE(minute)) || (!minute.numLE($int$59)))) {
            Errors.error($str117$minute__S_not_in_the_range_0_59, minute);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!ZERO_INTEGER.numLE(hour)) || (!hour.numLE($int$59)))) {
            Errors.error($str118$hour__S_not_in_the_range_0_59, hour);
        }
        return format(NIL, $str124$_2__0d__2__0d__2__0d__3__0d, new SubLObject[]{ hour, minute, second, millisecond });
    }

    public static SubLObject universal_date_and_second_from_time(SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        assert NIL != universal_time_p(universal_time) : "numeric_date_utilities.universal_time_p(universal_time) " + "CommonSymbols.NIL != numeric_date_utilities.universal_time_p(universal_time) " + universal_time;
        return values(get_universal_date(universal_time, UNPROVIDED), get_universal_second(universal_time));
    }

    public static SubLObject universal_time_from_date_and_second(final SubLObject universal_date, SubLObject universal_second) {
        if (universal_second == UNPROVIDED) {
            universal_second = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != universal_date_p(universal_date) : "numeric_date_utilities.universal_date_p(universal_date) " + "CommonSymbols.NIL != numeric_date_utilities.universal_date_p(universal_date) " + universal_date;
        assert NIL != universal_second_p(universal_second) : "numeric_date_utilities.universal_second_p(universal_second) " + "CommonSymbols.NIL != numeric_date_utilities.universal_second_p(universal_second) " + universal_second;
        thread.resetMultipleValues();
        final SubLObject second = decode_universal_second(universal_second);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject day = decode_universal_date(universal_date);
        final SubLObject month = thread.secondMultipleValue();
        final SubLObject year = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return encode_universal_time(second, minute, hour, day, month, year, UNPROVIDED);
    }

    public static SubLObject get_utc_time_with_milliseconds() {
        final SubLObject internal_real_time = get_internal_real_time();
        final SubLObject universal_time = get_universal_time();
        final SubLObject divisor = divide(time_high.$internal_time_units_per_second$.getGlobalValue(), $int$1000);
        final SubLObject internal_real_time_in_milliseconds = truncate(divide(internal_real_time, divisor), UNPROVIDED);
        final SubLObject milliseconds = rem(internal_real_time_in_milliseconds, $int$1000);
        final SubLObject time_in_milliseconds = add(multiply(universal_time, $int$1000), milliseconds);
        return time_in_milliseconds;
    }

    public static SubLObject get_universal_millisecond(SubLObject internal_time) {
        if (internal_time == UNPROVIDED) {
            internal_time = get_internal_real_time();
        }
        final SubLObject divisor = divide(time_high.$internal_time_units_per_second$.getGlobalValue(), $int$1000);
        final SubLObject internal_real_time_in_milliseconds = truncate(divide(internal_time, divisor), UNPROVIDED);
        final SubLObject milliseconds = rem(internal_real_time_in_milliseconds, $int$1000);
        final SubLObject universal_second = get_universal_second(UNPROVIDED);
        return add(multiply($int$1000, universal_second), milliseconds);
    }

    public static SubLObject get_internal_real_time_ms() {
        if (time_high.$internal_time_units_per_second$.getGlobalValue().eql($milliseconds_in_a_second$.getGlobalValue())) {
            return get_internal_real_time();
        }
        if (time_high.$internal_time_units_per_second$.getGlobalValue().eql(multiply($microseconds_in_a_millisecond$.getGlobalValue(), $milliseconds_in_a_second$.getGlobalValue()))) {
            return number_utilities.div(get_internal_real_time(), $microseconds_in_a_millisecond$.getGlobalValue());
        }
        return number_utilities.div(get_internal_real_time(), number_utilities.div(time_high.$internal_time_units_per_second$.getGlobalValue(), $milliseconds_in_a_second$.getGlobalValue()));
    }

    public static SubLObject extended_universal_date_p(final SubLObject v_object) {
        if (!v_object.isInteger()) {
            return NIL;
        }
        if (v_object.isNegative()) {
            return extended_universal_date_p(minus(v_object));
        }
        final SubLObject second = rem(v_object, $int$100);
        final SubLObject minute = integerDivide(rem(v_object, $int$10000), $int$100);
        final SubLObject hour = integerDivide(rem(v_object, $int$1000000), $int$10000);
        final SubLObject day = integerDivide(rem(v_object, $int$100000000), $int$1000000);
        final SubLObject month = integerDivide(rem(v_object, $int$10000000000), $int$100000000);
        return makeBoolean((((((second.numLE($int$60) && minute.numLE($int$60)) && hour.numLE($int$23)) && day.numGE(ONE_INTEGER)) && day.numLE($int$31)) && month.numGE(ONE_INTEGER)) && month.numLE(TWELVE_INTEGER));
    }

    public static SubLObject get_extended_universal_date(SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != universal_time_p(universal_time) : "numeric_date_utilities.universal_time_p(universal_time) " + "CommonSymbols.NIL != numeric_date_utilities.universal_time_p(universal_time) " + universal_time;
        thread.resetMultipleValues();
        final SubLObject second = decode_universal_time(universal_time, UNPROVIDED);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return encode_extended_universal_date(second, minute, hour, day, month, year);
    }

    public static SubLObject encode_extended_universal_date(final SubLObject second, final SubLObject minute, final SubLObject hour, final SubLObject day, final SubLObject month, final SubLObject year) {
        if (year.isNegative()) {
            return minus(encode_extended_universal_date(second, minute, hour, day, month, minus(year)));
        }
        final SubLObject universal_date = encode_universal_date(day, month, year);
        final SubLObject universal_second = encode_universal_second(second, minute, hour);
        return add(multiply(universal_date, $int$1000000), universal_second);
    }

    public static SubLObject decode_extended_universal_date(SubLObject extended_universal_date) {
        if (extended_universal_date == UNPROVIDED) {
            extended_universal_date = get_extended_universal_date(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(extended_universal_date) : "Types.integerp(extended_universal_date) " + "CommonSymbols.NIL != Types.integerp(extended_universal_date) " + extended_universal_date;
        if (extended_universal_date.isNegative()) {
            thread.resetMultipleValues();
            final SubLObject second = decode_extended_universal_date(minus(extended_universal_date));
            final SubLObject minute = thread.secondMultipleValue();
            final SubLObject hour = thread.thirdMultipleValue();
            final SubLObject day = thread.fourthMultipleValue();
            final SubLObject month = thread.fifthMultipleValue();
            final SubLObject year = thread.sixthMultipleValue();
            thread.resetMultipleValues();
            return values(second, minute, hour, day, month, minus(year));
        }
        final SubLObject universal_second = rem(extended_universal_date, $int$1000000);
        final SubLObject universal_date = integerDivide(extended_universal_date, $int$1000000);
        thread.resetMultipleValues();
        final SubLObject second2 = decode_universal_second(universal_second);
        final SubLObject minute2 = thread.secondMultipleValue();
        final SubLObject hour2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject day2 = decode_universal_date(universal_date);
        final SubLObject month2 = thread.secondMultipleValue();
        final SubLObject year2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return values(second2, minute2, hour2, day2, month2, year2);
    }

    public static SubLObject encode_universal_time_for_extended_universal_date(final SubLObject date, SubLObject time_zone) {
        if (time_zone == UNPROVIDED) {
            time_zone = SIX_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        thread.resetMultipleValues();
        final SubLObject second = decode_extended_universal_date(date);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        result = encode_universal_time(second, minute, hour, day, month, year, time_zone);
        return result;
    }

    public static SubLObject preceding_extended_universal_date(final SubLObject extended_universal_date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject second = decode_extended_universal_date(extended_universal_date);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject new_year = adjust_year_month_day_hour_min_sec(year, month, day, hour, minute, subtract(second, ONE_INTEGER));
        final SubLObject new_month = thread.secondMultipleValue();
        final SubLObject new_day = thread.thirdMultipleValue();
        final SubLObject new_hour = thread.fourthMultipleValue();
        final SubLObject new_minute = thread.fifthMultipleValue();
        final SubLObject new_second = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return encode_extended_universal_date(new_second, new_minute, new_hour, new_day, new_month, new_year);
    }

    public static SubLObject succeeding_extended_universal_date(final SubLObject extended_universal_date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject second = decode_extended_universal_date(extended_universal_date);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject new_year = adjust_year_month_day_hour_min_sec(year, month, day, hour, minute, add(second, ONE_INTEGER));
        final SubLObject new_month = thread.secondMultipleValue();
        final SubLObject new_day = thread.thirdMultipleValue();
        final SubLObject new_hour = thread.fourthMultipleValue();
        final SubLObject new_minute = thread.fifthMultipleValue();
        final SubLObject new_second = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return encode_extended_universal_date(new_second, new_minute, new_hour, new_day, new_month, new_year);
    }

    public static SubLObject extended_universal_dateL(final SubLObject eu_date1, final SubLObject eu_date2) {
        if ((!eu_date1.isNegative()) || (!eu_date2.isNegative())) {
            return numL(eu_date1, eu_date2);
        }
        final SubLObject year1 = integerDivide(eu_date1, $int$10000000000);
        final SubLObject year2 = integerDivide(eu_date2, $int$10000000000);
        if (year1.numE(year2)) {
            final SubLObject second_within_year1 = abs(rem(eu_date1, $int$10000000000));
            final SubLObject second_within_year2 = abs(rem(eu_date2, $int$10000000000));
            return numL(second_within_year1, second_within_year2);
        }
        return numL(year1, year2);
    }

    public static SubLObject adjust_year_month_day(SubLObject year, SubLObject month, SubLObject day) {
        while ((month.isInteger() && ((!month.numLE(TWELVE_INTEGER)) || (!month.numG(ZERO_INTEGER)))) || (day.isInteger() && ((!day.numLE(days_in_month_number(month, year))) || (!day.numG(ZERO_INTEGER))))) {
            if ((month.isInteger() && year.isInteger()) && (!month.numLE(TWELVE_INTEGER))) {
                month = subtract(month, TWELVE_INTEGER);
                year = add(year, ONE_INTEGER);
            } else
                if ((month.isInteger() && year.isInteger()) && (!month.numG(ZERO_INTEGER))) {
                    month = add(month, TWELVE_INTEGER);
                    year = subtract(year, ONE_INTEGER);
                } else
                    if (((day.isInteger() && month.isInteger()) && year.isInteger()) && (!day.numLE(days_in_month_number(month, year)))) {
                        day = subtract(day, days_in_month_number(month, year));
                        month = add(month, ONE_INTEGER);
                    } else
                        if (((day.isInteger() && month.isInteger()) && year.isInteger()) && (!day.numG(ZERO_INTEGER))) {
                            month = subtract(month, ONE_INTEGER);
                            if (month.numE(ZERO_INTEGER)) {
                                year = subtract(year, ONE_INTEGER);
                                month = add(month, TWELVE_INTEGER);
                            }
                            day = add(day, days_in_month_number(month, year));
                        } else {
                            Errors.error($str127$MM_DD_YY_adjust_problem___s__s__s, month, day, year);
                        }



        } 
        return values(year, month, day);
    }

    public static SubLObject adjust_year_month_day_hour_min_sec(final SubLObject year, final SubLObject month, SubLObject day, SubLObject hour, SubLObject min, SubLObject sec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sec) {
            if (sec.numL(ZERO_INTEGER)) {
                min = add(min, subtract(integerDivide(sec, $seconds_in_a_minute$.getGlobalValue()), ONE_INTEGER));
            } else {
                min = add(min, integerDivide(sec, $seconds_in_a_minute$.getGlobalValue()));
            }
            sec = mod(sec, $seconds_in_a_minute$.getGlobalValue());
        }
        if (NIL != min) {
            if (min.numL(ZERO_INTEGER)) {
                hour = add(hour, subtract(integerDivide(min, $minutes_in_an_hour$.getGlobalValue()), ONE_INTEGER));
            } else {
                hour = add(hour, integerDivide(min, $minutes_in_an_hour$.getGlobalValue()));
            }
            min = mod(min, $minutes_in_an_hour$.getGlobalValue());
        }
        if (NIL != hour) {
            if (hour.numL(ZERO_INTEGER)) {
                day = add(day, subtract(integerDivide(hour, $hours_in_a_day$.getGlobalValue()), ONE_INTEGER));
            } else {
                day = add(day, integerDivide(hour, $hours_in_a_day$.getGlobalValue()));
            }
            hour = mod(hour, $hours_in_a_day$.getGlobalValue());
        }
        thread.resetMultipleValues();
        final SubLObject final_year = adjust_year_month_day(year, month, day);
        final SubLObject final_month = thread.secondMultipleValue();
        final SubLObject final_day = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return values(final_year, final_month, final_day, hour, min, sec);
    }

    public static SubLObject leap_year_p(final SubLObject year) {
        assert NIL != integerp(year) : "Types.integerp(year) " + "CommonSymbols.NIL != Types.integerp(year) " + year;
        return makeBoolean((NIL != number_utilities.divides_evenly(year, FOUR_INTEGER)) && ((NIL == number_utilities.divides_evenly(year, $int$100)) || (NIL != number_utilities.divides_evenly(year, $int$400))));
    }

    public static SubLObject usual_days_in_month_number(final SubLObject month) {
        return nth(subtract(month, ONE_INTEGER), $month_duration_table$.getGlobalValue());
    }

    public static SubLObject days_in_month_number(final SubLObject month, final SubLObject year) {
        if ((year.isInteger() && month.numE(TWO_INTEGER)) && (NIL != leap_year_p(year))) {
            return add(ONE_INTEGER, usual_days_in_month_number(month));
        }
        return usual_days_in_month_number(month);
    }

    public static SubLObject total_days_in_months_preceding(final SubLObject month, final SubLObject year) {
        SubLObject total = ZERO_INTEGER;
        SubLObject doneP = NIL;
        SubLObject list_var = NIL;
        SubLObject days = NIL;
        SubLObject num = NIL;
        list_var = $month_duration_table$.getGlobalValue();
        days = list_var.first();
        for (num = ZERO_INTEGER; (NIL == doneP) && (NIL != list_var); list_var = list_var.rest() , days = list_var.first() , num = add(ONE_INTEGER, num)) {
            if (number_utilities.f_1X(num).numE(month)) {
                doneP = T;
            } else {
                total = add(total, days);
            }
        }
        if (month.numG(TWO_INTEGER) && (NIL != leap_year_p(year))) {
            total = add(total, ONE_INTEGER);
        }
        return total;
    }

    public static SubLObject day_of_week_number_abbrev(final SubLObject number) {
        return list_utilities.alist_lookup_without_values($number_wkday_table$.getGlobalValue(), number, symbol_function(EQ), NIL);
    }

    public static SubLObject month_number_abbrev(final SubLObject number) {
        return list_utilities.alist_lookup_without_values($number_month_table$.getGlobalValue(), number, symbol_function(EQ), NIL);
    }

    public static SubLObject abbreviation_for_month_number(final SubLObject month_num) {
        return month_number_abbrev(month_num);
    }

    public static SubLObject date_abbreviation_string(final SubLObject universal_date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject day = decode_universal_date(universal_date);
        SubLObject month = thread.secondMultipleValue();
        final SubLObject year = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        month = abbreviation_for_month_number(month);
        return cconcatenate(format_nil.format_nil_a_no_copy(month), new SubLObject[]{ $$$_, format_nil.format_nil_a_no_copy(day), $str135$__, format_nil.format_nil_a_no_copy(year) });
    }

    public static SubLObject today_abbreviation_string() {
        return date_abbreviation_string(get_universal_date(UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject time_abbreviation_string(SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject second = decode_universal_time(universal_time, UNPROVIDED);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject date = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        thread.resetMultipleValues();
        return format(NIL, $str136$_2__0D__2__0D__2__0D__2__0D__2__0, new SubLObject[]{ month, date, mod(year, $int$100), hour, minute, second });
    }

    public static SubLObject elapsed_time_abbreviation_string(final SubLObject elapsed_seconds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject secs = decode_elapsed_seconds(elapsed_seconds);
        final SubLObject mins = thread.secondMultipleValue();
        final SubLObject hours = thread.thirdMultipleValue();
        final SubLObject days = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        secs = truncate(secs, UNPROVIDED);
        return days.numG(ZERO_INTEGER) ? format(NIL, $str137$_D_day__P__D__2__0D__2__0D, new SubLObject[]{ days, hours, mins, secs }) : hours.numG(ZERO_INTEGER) ? format(NIL, $str138$_D__2__0D__2__0D, new SubLObject[]{ hours, mins, secs }) : format(NIL, $str139$_D__2__0D, mins, secs);
    }

    public static SubLObject elapsed_time_string(final SubLObject elapsed_seconds) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject secs = decode_elapsed_seconds(elapsed_seconds);
        final SubLObject mins = thread.secondMultipleValue();
        final SubLObject hours = thread.thirdMultipleValue();
        final SubLObject days = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        secs = truncate(secs, UNPROVIDED);
        return days.numG(ZERO_INTEGER) ? format(NIL, $str140$_Dd__2__0Dh__2__0Dm__2__0Ds, new SubLObject[]{ days, hours, mins, secs }) : hours.numG(ZERO_INTEGER) ? format(NIL, $str141$_2__0Dh__2__0Dm__2__0Ds, new SubLObject[]{ hours, mins, secs }) : format(NIL, $str142$_2__0Dm__2__0Ds, mins, secs);
    }

    public static SubLObject seconds_in_month(final SubLObject month, final SubLObject year) {
        return multiply($seconds_in_a_day$.getGlobalValue(), days_in_month_number(date_utilities.number_of_month(month), year));
    }

    public static SubLObject seconds_in_quarter(final SubLObject starting_month, final SubLObject year) {
        final SubLObject init_num = date_utilities.number_of_month(starting_month);
        return add(multiply($seconds_in_a_day$.getGlobalValue(), days_in_month_number(init_num, year)), multiply($seconds_in_a_day$.getGlobalValue(), days_in_month_number(add(ONE_INTEGER, init_num), year)), multiply($seconds_in_a_day$.getGlobalValue(), days_in_month_number(add(TWO_INTEGER, init_num), year)));
    }

    public static SubLObject seconds_in_year(final SubLObject year) {
        if (NIL != leap_year_p(year)) {
            return $seconds_in_a_leap_year$.getGlobalValue();
        }
        return $seconds_in_a_non_leap_year$.getGlobalValue();
    }

    public static SubLObject seconds_in_millennium(final SubLObject year) {
        if (ONE_INTEGER.numE(integerDivide(year, $int$1000))) {
            return $seconds_in_an_odd_millennium$.getGlobalValue();
        }
        return $seconds_in_an_even_millennium$.getGlobalValue();
    }

    public static SubLObject declare_numeric_date_utilities_file() {
        declareMacro(me, "elapsed_milliseconds", "ELAPSED-MILLISECONDS");
        declareFunction(me, "valid_year_number_p", "VALID-YEAR-NUMBER-P", 1, 0, false);
        declareFunction(me, "valid_month_number_p", "VALID-MONTH-NUMBER-P", 1, 0, false);
        declareFunction(me, "valid_day_number_p", "VALID-DAY-NUMBER-P", 1, 0, false);
        declareFunction(me, "valid_day_for_month_p", "VALID-DAY-FOR-MONTH-P", 3, 0, false);
        declareFunction(me, "valid_hour_number_p", "VALID-HOUR-NUMBER-P", 1, 0, false);
        declareFunction(me, "valid_minute_number_p", "VALID-MINUTE-NUMBER-P", 1, 0, false);
        declareFunction(me, "valid_second_number_p", "VALID-SECOND-NUMBER-P", 1, 0, false);
        declareFunction(me, "universal_time_p", "UNIVERSAL-TIME-P", 1, 0, false);
        declareFunction(me, "universal_time_seconds_from_now", "UNIVERSAL-TIME-SECONDS-FROM-NOW", 1, 1, false);
        declareFunction(me, "time_from_now", "TIME-FROM-NOW", 1, 0, false);
        declareFunction(me, "universal_time_from_now", "UNIVERSAL-TIME-FROM-NOW", 1, 2, false);
        declareFunction(me, "timestring", "TIMESTRING", 0, 1, false);
        declareFunction(me, "timestring_ms", "TIMESTRING-MS", 0, 2, false);
        declareFunction(me, "timestring_ms_utc", "TIMESTRING-MS-UTC", 0, 2, false);
        declareFunction(me, "safe_timestring", "SAFE-TIMESTRING", 1, 0, false);
        declareFunction(me, "timestring_int", "TIMESTRING-INT", 1, 0, false);
        declareFunction(me, "timestamp", "TIMESTAMP", 0, 2, false);
        declareFunction(me, "numeric_timestamp", "NUMERIC-TIMESTAMP", 0, 2, false);
        declareFunction(me, "timestamp_with_milliseconds", "TIMESTAMP-WITH-MILLISECONDS", 0, 2, false);
        declareFunction(me, "encode_timestring", "ENCODE-TIMESTRING", 6, 0, false);
        declareFunction(me, "universal_timestring", "UNIVERSAL-TIMESTRING", 0, 1, false);
        declareFunction(me, "encode_universal_timestring", "ENCODE-UNIVERSAL-TIMESTRING", 6, 0, false);
        declareFunction(me, "get_universal_time_today", "GET-UNIVERSAL-TIME-TODAY", 3, 0, false);
        declareFunction(me, "get_universal_time_within_next_day", "GET-UNIVERSAL-TIME-WITHIN-NEXT-DAY", 3, 0, false);
        declareFunction(me, "universal_time_day_of_week_number", "UNIVERSAL-TIME-DAY-OF-WEEK-NUMBER", 0, 1, false);
        declareFunction(me, "internal_real_time_p", "INTERNAL-REAL-TIME-P", 1, 0, false);
        declareFunction(me, "internal_real_time_seconds_from_now", "INTERNAL-REAL-TIME-SECONDS-FROM-NOW", 1, 1, false);
        declareFunction(me, "elapsed_internal_real_time", "ELAPSED-INTERNAL-REAL-TIME", 1, 1, false);
        declareFunction(me, "elapsed_internal_real_time_to_elapsed_seconds", "ELAPSED-INTERNAL-REAL-TIME-TO-ELAPSED-SECONDS", 1, 0, false);
        declareFunction(me, "elapsed_seconds_to_elapsed_internal_real_time", "ELAPSED-SECONDS-TO-ELAPSED-INTERNAL-REAL-TIME", 1, 0, false);
        declareFunction(me, "elapsed_seconds_between_internal_real_times", "ELAPSED-SECONDS-BETWEEN-INTERNAL-REAL-TIMES", 2, 0, false);
        declareFunction(me, "readable_elapsed_time_string", "READABLE-ELAPSED-TIME-STRING", 1, 1, false);
        declareFunction(me, "explode_elapsed_time_ms", "EXPLODE-ELAPSED-TIME-MS", 1, 0, false);
        declareFunction(me, "readable_elapsed_time_string_ms", "READABLE-ELAPSED-TIME-STRING-MS", 1, 0, false);
        declareFunction(me, "datetime_string_from_template", "DATETIME-STRING-FROM-TEMPLATE", 0, 2, false);
        declareFunction(me, "encode_datetime_string_from_template", "ENCODE-DATETIME-STRING-FROM-TEMPLATE", 8, 0, false);
        declareFunction(me, "valid_date_template_char", "VALID-DATE-TEMPLATE-CHAR", 1, 0, false);
        declareFunction(me, "valid_time_template_char", "VALID-TIME-TEMPLATE-CHAR", 1, 0, false);
        declareFunction(me, "valid_date_separator", "VALID-DATE-SEPARATOR", 1, 0, false);
        declareFunction(me, "valid_time_separator", "VALID-TIME-SEPARATOR", 1, 0, false);
        declareFunction(me, "valid_year_token", "VALID-YEAR-TOKEN", 1, 0, false);
        declareFunction(me, "valid_month_token", "VALID-MONTH-TOKEN", 1, 0, false);
        declareFunction(me, "valid_day_token", "VALID-DAY-TOKEN", 1, 0, false);
        declareFunction(me, "valid_hour_token", "VALID-HOUR-TOKEN", 1, 0, false);
        declareFunction(me, "valid_minute_token", "VALID-MINUTE-TOKEN", 1, 0, false);
        declareFunction(me, "valid_second_token", "VALID-SECOND-TOKEN", 1, 0, false);
        declareFunction(me, "date_template_p", "DATE-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "time_template_p", "TIME-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "datetime_string_template_p", "DATETIME-STRING-TEMPLATE-P", 1, 0, false);
        declareFunction(me, "non_date_time_whitespace_p", "NON-DATE-TIME-WHITESPACE-P", 1, 0, false);
        declareFunction(me, "date_time_whitespace_p", "DATE-TIME-WHITESPACE-P", 1, 0, false);
        declareFunction(me, "n_digit_template_element_p", "N-DIGIT-TEMPLATE-ELEMENT-P", 4, 0, false);
        declareFunction(me, "encode_date_from_template", "ENCODE-DATE-FROM-TEMPLATE", 4, 0, false);
        declareFunction(me, "encode_next_date_element", "ENCODE-NEXT-DATE-ELEMENT", 6, 0, false);
        declareFunction(me, "encode_time_from_template", "ENCODE-TIME-FROM-TEMPLATE", 5, 0, false);
        declareFunction(me, "decode_datetime_string_from_template", "DECODE-DATETIME-STRING-FROM-TEMPLATE", 2, 0, false);
        declareFunction(me, "decode_date_from_template", "DECODE-DATE-FROM-TEMPLATE", 2, 3, false);
        declareFunction(me, "decode_time_from_template", "DECODE-TIME-FROM-TEMPLATE", 2, 0, false);
        declareFunction(me, "decode_elapsed_seconds", "DECODE-ELAPSED-SECONDS", 1, 0, false);
        declareFunction(me, "decode_elapsed_seconds_without_days", "DECODE-ELAPSED-SECONDS-WITHOUT-DAYS", 1, 0, false);
        declareFunction(me, "encode_elapsed_seconds", "ENCODE-ELAPSED-SECONDS", 0, 4, false);
        declareFunction(me, "encode_elapsed_seconds_string", "ENCODE-ELAPSED-SECONDS-STRING", 0, 4, false);
        declareFunction(me, "elapsed_seconds_string", "ELAPSED-SECONDS-STRING", 1, 0, false);
        declareFunction(me, "universal_date_p", "UNIVERSAL-DATE-P", 1, 0, false);
        declareFunction(me, "get_universal_date", "GET-UNIVERSAL-DATE", 0, 2, false);
        declareFunction(me, "today", "TODAY", 0, 0, false);
        declareFunction(me, "yesterday", "YESTERDAY", 0, 0, false);
        declareFunction(me, "tomorrow", "TOMORROW", 0, 0, false);
        declareFunction(me, "this_year", "THIS-YEAR", 0, 0, false);
        declareFunction(me, "universal_date_add_days", "UNIVERSAL-DATE-ADD-DAYS", 2, 0, false);
        declareFunction(me, "universal_date_subtract_days", "UNIVERSAL-DATE-SUBTRACT-DAYS", 2, 0, false);
        declareFunction(me, "universal_date_add_days_int", "UNIVERSAL-DATE-ADD-DAYS-INT", 2, 0, false);
        declareFunction(me, "decode_universal_date", "DECODE-UNIVERSAL-DATE", 0, 1, false);
        declareFunction(me, "day_from_universal_date", "DAY-FROM-UNIVERSAL-DATE", 0, 1, false);
        declareFunction(me, "month_from_universal_date", "MONTH-FROM-UNIVERSAL-DATE", 0, 1, false);
        declareFunction(me, "year_from_universal_date", "YEAR-FROM-UNIVERSAL-DATE", 0, 1, false);
        declareFunction(me, "encode_universal_date", "ENCODE-UNIVERSAL-DATE", 3, 0, false);
        declareFunction(me, "datestring", "DATESTRING", 0, 1, false);
        declareFunction(me, "datestringL", "DATESTRING<", 2, 0, false);
        declareFunction(me, "datestring_", "DATESTRING-", 2, 0, false);
        declareFunction(me, "datestring_year", "DATESTRING-YEAR", 1, 0, false);
        declareFunction(me, "datestring_month", "DATESTRING-MONTH", 1, 0, false);
        declareFunction(me, "datestring_day", "DATESTRING-DAY", 1, 0, false);
        declareFunction(me, "encode_datestring", "ENCODE-DATESTRING", 3, 0, false);
        declareFunction(me, "decode_datestring", "DECODE-DATESTRING", 1, 0, false);
        declareFunction(me, "month_ago", "MONTH-AGO", 0, 2, false);
        declareFunction(me, "get_julian_date", "GET-JULIAN-DATE", 0, 2, false);
        declareFunction(me, "julian_date_from_universal_date", "JULIAN-DATE-FROM-UNIVERSAL-DATE", 1, 1, false);
        declareFunction(me, "julian_offset", "JULIAN-OFFSET", 1, 0, false);
        declareFunction(me, "compute_julian_offset", "COMPUTE-JULIAN-OFFSET", 1, 0, false);
        declareFunction(me, "universal_time_for_start_of_universal_date", "UNIVERSAL-TIME-FOR-START-OF-UNIVERSAL-DATE", 1, 1, false);
        declareFunction(me, "universal_days", "UNIVERSAL-DAYS", 2, 0, false);
        declareFunction(me, "universal_second_p", "UNIVERSAL-SECOND-P", 1, 0, false);
        declareFunction(me, "get_universal_second", "GET-UNIVERSAL-SECOND", 0, 1, false);
        declareFunction(me, "decode_universal_second", "DECODE-UNIVERSAL-SECOND", 0, 1, false);
        declareFunction(me, "encode_universal_second", "ENCODE-UNIVERSAL-SECOND", 3, 0, false);
        declareFunction(me, "secondstring", "SECONDSTRING", 0, 1, false);
        declareFunction(me, "encode_secondstring", "ENCODE-SECONDSTRING", 3, 0, false);
        declareFunction(me, "decode_secondstring", "DECODE-SECONDSTRING", 1, 0, false);
        declareFunction(me, "secondstring_", "SECONDSTRING-", 2, 0, false);
        declareFunction(me, "secondstring_hour", "SECONDSTRING-HOUR", 1, 0, false);
        declareFunction(me, "secondstring_minute", "SECONDSTRING-MINUTE", 1, 0, false);
        declareFunction(me, "secondstring_second", "SECONDSTRING-SECOND", 1, 0, false);
        declareFunction(me, "encode_millisecondstring", "ENCODE-MILLISECONDSTRING", 2, 2, false);
        declareFunction(me, "universal_date_and_second_from_time", "UNIVERSAL-DATE-AND-SECOND-FROM-TIME", 0, 1, false);
        declareFunction(me, "universal_time_from_date_and_second", "UNIVERSAL-TIME-FROM-DATE-AND-SECOND", 1, 1, false);
        declareFunction(me, "get_utc_time_with_milliseconds", "GET-UTC-TIME-WITH-MILLISECONDS", 0, 0, false);
        declareFunction(me, "get_universal_millisecond", "GET-UNIVERSAL-MILLISECOND", 0, 1, false);
        declareFunction(me, "get_internal_real_time_ms", "GET-INTERNAL-REAL-TIME-MS", 0, 0, false);
        declareFunction(me, "extended_universal_date_p", "EXTENDED-UNIVERSAL-DATE-P", 1, 0, false);
        declareFunction(me, "get_extended_universal_date", "GET-EXTENDED-UNIVERSAL-DATE", 0, 1, false);
        declareFunction(me, "encode_extended_universal_date", "ENCODE-EXTENDED-UNIVERSAL-DATE", 6, 0, false);
        declareFunction(me, "decode_extended_universal_date", "DECODE-EXTENDED-UNIVERSAL-DATE", 0, 1, false);
        declareFunction(me, "encode_universal_time_for_extended_universal_date", "ENCODE-UNIVERSAL-TIME-FOR-EXTENDED-UNIVERSAL-DATE", 1, 1, false);
        declareFunction(me, "preceding_extended_universal_date", "PRECEDING-EXTENDED-UNIVERSAL-DATE", 1, 0, false);
        declareFunction(me, "succeeding_extended_universal_date", "SUCCEEDING-EXTENDED-UNIVERSAL-DATE", 1, 0, false);
        declareFunction(me, "extended_universal_dateL", "EXTENDED-UNIVERSAL-DATE<", 2, 0, false);
        declareFunction(me, "adjust_year_month_day", "ADJUST-YEAR-MONTH-DAY", 3, 0, false);
        declareFunction(me, "adjust_year_month_day_hour_min_sec", "ADJUST-YEAR-MONTH-DAY-HOUR-MIN-SEC", 6, 0, false);
        declareFunction(me, "leap_year_p", "LEAP-YEAR-P", 1, 0, false);
        declareFunction(me, "usual_days_in_month_number", "USUAL-DAYS-IN-MONTH-NUMBER", 1, 0, false);
        declareFunction(me, "days_in_month_number", "DAYS-IN-MONTH-NUMBER", 2, 0, false);
        declareFunction(me, "total_days_in_months_preceding", "TOTAL-DAYS-IN-MONTHS-PRECEDING", 2, 0, false);
        declareFunction(me, "day_of_week_number_abbrev", "DAY-OF-WEEK-NUMBER-ABBREV", 1, 0, false);
        declareFunction(me, "month_number_abbrev", "MONTH-NUMBER-ABBREV", 1, 0, false);
        declareFunction(me, "abbreviation_for_month_number", "ABBREVIATION-FOR-MONTH-NUMBER", 1, 0, false);
        declareFunction(me, "date_abbreviation_string", "DATE-ABBREVIATION-STRING", 1, 0, false);
        declareFunction(me, "today_abbreviation_string", "TODAY-ABBREVIATION-STRING", 0, 0, false);
        declareFunction(me, "time_abbreviation_string", "TIME-ABBREVIATION-STRING", 0, 1, false);
        declareFunction(me, "elapsed_time_abbreviation_string", "ELAPSED-TIME-ABBREVIATION-STRING", 1, 0, false);
        declareFunction(me, "elapsed_time_string", "ELAPSED-TIME-STRING", 1, 0, false);
        declareFunction(me, "seconds_in_month", "SECONDS-IN-MONTH", 2, 0, false);
        declareFunction(me, "seconds_in_quarter", "SECONDS-IN-QUARTER", 2, 0, false);
        declareFunction(me, "seconds_in_year", "SECONDS-IN-YEAR", 1, 0, false);
        declareFunction(me, "seconds_in_millennium", "SECONDS-IN-MILLENNIUM", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_numeric_date_utilities_file() {
        defconstant("*MICROSECONDS-IN-A-SECOND*", $int$1000000);
        defconstant("*MICROSECONDS-IN-A-MILLISECOND*", $int$1000);
        defconstant("*MILLISECONDS-IN-A-SECOND*", $int$1000);
        defconstant("*SECONDS-IN-A-LEAP-YEAR*", $int$31622400);
        defconstant("*SECONDS-IN-A-NON-LEAP-YEAR*", $int$31536000);
        defconstant("*SECONDS-IN-A-WEEK*", $int$604800);
        defconstant("*SECONDS-IN-A-DAY*", $int$86400);
        defconstant("*SECONDS-IN-AN-HOUR*", $int$3600);
        defconstant("*SECONDS-IN-A-MINUTE*", $int$60);
        defconstant("*MINUTES-IN-AN-HOUR*", $int$60);
        defconstant("*HOURS-IN-A-DAY*", $int$24);
        defconstant("*MONTHS-IN-A-QUARTER*", THREE_INTEGER);
        defconstant("*MONTHS-IN-A-YEAR*", TWELVE_INTEGER);
        defconstant("*YEARS-IN-A-DECADE*", TEN_INTEGER);
        defconstant("*YEARS-IN-A-CENTURY*", $int$100);
        deflexical("*ELAPSED-SECONDS-MULTIPLES*", list($seconds_in_a_minute$.getGlobalValue(), $minutes_in_an_hour$.getGlobalValue(), $hours_in_a_day$.getGlobalValue()));
        deflexical("*ELAPSED-SECONDS-W/O-DAYS-MULTIPLES*", list($seconds_in_a_minute$.getGlobalValue(), $minutes_in_an_hour$.getGlobalValue()));
        defconstant("*JULIAN-DATE-REFERENCE*", $list112);
        deflexical("*JULIAN-OFFSETS*", NIL != boundp($julian_offsets$) ? $julian_offsets$.getGlobalValue() : NIL);
        deflexical("*MONTH-DURATION-TABLE*", $list129);
        deflexical("*NUMBER-WKDAY-TABLE*", $list130);
        deflexical("*NUMBER-MONTH-TABLE*", $list131);
        defconstant("*SECONDS-IN-A-CENTURY*", $int$3155760000);
        defconstant("*SECONDS-IN-AN-ODD-MILLENNIUM*", $int$31556908800);
        defconstant("*SECONDS-IN-AN-EVEN-MILLENNIUM*", $int$31556995200);
        return NIL;
    }

    public static SubLObject setup_numeric_date_utilities_file() {
        define_obsolete_register(TIME_FROM_NOW, $list21);
        define_test_case_table_int(READABLE_ELAPSED_TIME_STRING, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list46);
        define_obsolete_register(ELAPSED_SECONDS_STRING, $list102);
        declare_defglobal($julian_offsets$);
        define_obsolete_register(ABBREVIATION_FOR_MONTH_NUMBER, $list133);
        sunit_external.define_test_suite($$$Numeric_Date_Utilities, NIL, NIL, $list147);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_numeric_date_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_numeric_date_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_numeric_date_utilities_file();
    }
}

