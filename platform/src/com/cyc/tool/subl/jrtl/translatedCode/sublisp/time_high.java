/**
 *
 */
/**
 * For LarKC
 */
/**
 *
 */
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWELVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;

public class time_high extends SubLTranslatedFile {
    public static SubLObject declare_time_high_file() {
	declareFunction("decode_universal_time", "DECODE-UNIVERSAL-TIME", 1, 1, false);
	declareFunction("guess_year_from_two_digits", "GUESS-YEAR-FROM-TWO-DIGITS", 1, 0, false);
	declareFunction("encode_universal_time", "ENCODE-UNIVERSAL-TIME", 6, 1, false);
	declareFunction("encode_universal_time_internal", "ENCODE-UNIVERSAL-TIME-INTERNAL", 7, 0, false);
	declareFunction("get_universal_time", "GET-UNIVERSAL-TIME", 0, 0, false);
	declareFunction("get_decoded_time", "GET-DECODED-TIME", 0, 0, false);
	declareFunction("get_internal_real_time", "GET-INTERNAL-REAL-TIME", 0, 0, false);
	declareFunction("get_internal_run_time", "GET-INTERNAL-RUN-TIME", 0, 0, false);
	return SubLNil.NIL;
    }

    public static SubLObject decode_universal_time(SubLObject universal_time, SubLObject time_zone) {
	if (time_zone == UNPROVIDED)
	    time_zone = SubLNil.NIL;

	SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject second = SubLNil.NIL;
	SubLObject minute = SubLNil.NIL;
	SubLObject hour = SubLNil.NIL;
	SubLObject date = SubLNil.NIL;
	SubLObject month = SubLNil.NIL;
	SubLObject year = SubLNil.NIL;
	SubLObject day = SubLNil.NIL;
	SubLObject daylight_p = SubLNil.NIL;
	SubLObject seconds_west = SubLNil.NIL;
	if (SubLNil.NIL != time_zone)
	    seconds_west = multiply(time_zone, $int$3600);
	else {
	    thread.resetMultipleValues();
	    SubLObject offset = get_timezone(universal_time);
	    SubLObject dst_p = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    seconds_west = offset;
	    time_zone = floor(offset, $int$3600);
	    if (SubLNil.NIL != dst_p) {
		time_zone = add(time_zone, ONE_INTEGER);
		daylight_p = T;
	    }
	}
	thread.resetMultipleValues();
	SubLObject days = floor(subtract(universal_time, seconds_west), $int$86400);
	SubLObject seconds = thread.secondMultipleValue();
	thread.resetMultipleValues();
	day = mod(days, SEVEN_INTEGER);
	thread.resetMultipleValues();
	SubLObject quadricentennials = floor(add(days, $ut_offset_from_rata_die$.getGlobalValue()), $int$146097);
	SubLObject r1 = thread.secondMultipleValue();
	thread.resetMultipleValues();
	thread.resetMultipleValues();
	SubLObject centennials = floor(r1, $int$36524);
	SubLObject r2 = thread.secondMultipleValue();
	thread.resetMultipleValues();
	thread.resetMultipleValues();
	SubLObject quadrennials = floor(r2, $int$1461);
	SubLObject r3 = thread.secondMultipleValue();
	thread.resetMultipleValues();
	thread.resetMultipleValues();
	SubLObject annuals = floor(r3, $int$365);
	SubLObject r4 = thread.secondMultipleValue();
	thread.resetMultipleValues();
	SubLObject last_day_of_cycle_p = makeBoolean(annuals.numE(FOUR_INTEGER) || centennials.numE(FOUR_INTEGER));
	year = add(new SubLObject[] { multiply(quadricentennials, $int$400), multiply(centennials, $int$100), multiply(quadrennials, FOUR_INTEGER), annuals, SubLNil.NIL != last_day_of_cycle_p ? ZERO_INTEGER : ONE_INTEGER });
	if (SubLNil.NIL != last_day_of_cycle_p) {
	    month = TWELVE_INTEGER;
	    date = $int$31;
	} else {
	    SubLObject leap_days = (mod(year, FOUR_INTEGER).isZero() && (SubLNil.NIL == member(mod(year, $int$400), $list11, UNPROVIDED, UNPROVIDED))) ? ONE_INTEGER : ZERO_INTEGER;
	    SubLObject february_adjustment = SubLNil.NIL;
	    if (r4.numL(add($int$59, leap_days)))
		february_adjustment = ZERO_INTEGER;
	    else
		february_adjustment = add($int$_2, leap_days);

	    month = floor(add(multiply(TWELVE_INTEGER, subtract(r4, february_adjustment)), $int$373), $int$367);
	    date = add(subtract(r4, add(floor(subtract(multiply($int$367, month), $int$362), TWELVE_INTEGER), february_adjustment)), ONE_INTEGER);
	}
	thread.resetMultipleValues();
	SubLObject hours = floor(seconds, $int$3600);
	r1 = thread.secondMultipleValue();
	thread.resetMultipleValues();
	hour = hours;
	thread.resetMultipleValues();
	SubLObject minutes = floor(r1, $int$60);
	SubLObject seconds_$1 = thread.secondMultipleValue();
	thread.resetMultipleValues();
	minute = minutes;
	second = seconds_$1;
	return values(new SubLObject[] { second, minute, hour, date, month, year, day, daylight_p, time_zone });
    }

    public static SubLObject encode_universal_time(SubLObject second, SubLObject minute, SubLObject hour, SubLObject date, SubLObject month, SubLObject year, SubLObject time_zone) {
	if (time_zone == UNPROVIDED)
	    time_zone = SubLNil.NIL;

	SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject guessed_time_zoneP = SubLNil.NIL;
	SubLObject guessed_daylight_p = SubLNil.NIL;
	SubLObject utime = SubLNil.NIL;
	if (SubLNil.NIL == time_zone) {
	    thread.resetMultipleValues();
	    SubLObject offset = get_timezone(UNPROVIDED);
	    SubLObject daylight_p = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    guessed_time_zoneP = T;
	    guessed_daylight_p = daylight_p;
	    time_zone = floor(offset, $int$3600);
	}
	if (year.numGE(ZERO_INTEGER) && year.numLE($int$99))
	    year = guess_year_from_two_digits(year);

	utime = encode_universal_time_internal(second, minute, hour, date, month, year, time_zone);
	if (SubLNil.NIL != guessed_time_zoneP) {
	    thread.resetMultipleValues();
	    SubLObject offset = get_timezone(utime);
	    SubLObject daylight_p = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    if (!daylight_p.eql(guessed_daylight_p))
		if (SubLNil.NIL != daylight_p)
		    utime = subtract(utime, $int$3600);
		else
		    utime = add(utime, $int$3600);

	}
	return utime;
    }

    public static SubLObject encode_universal_time_internal(SubLObject second, SubLObject minute, SubLObject hour, SubLObject date, SubLObject month, SubLObject year, SubLObject time_zone) {
	SubLObject days = SubLNil.NIL;
	SubLObject february_adjustment = SubLNil.NIL;
	SubLObject previous_year = subtract(year, ONE_INTEGER);
	if (month.numLE(TWO_INTEGER))
	    february_adjustment = ZERO_INTEGER;
	else if (mod(year, FOUR_INTEGER).isZero() && (SubLNil.NIL == member(mod(year, $int$400), $list11, UNPROVIDED, UNPROVIDED)))
	    february_adjustment = MINUS_ONE_INTEGER;
	else
	    february_adjustment = $int$_2;

	days = add(new SubLObject[] { MINUS_ONE_INTEGER, add(new SubLObject[] { multiply($int$365, previous_year), floor(previous_year, FOUR_INTEGER), minus(floor(previous_year, $int$100)), floor(previous_year, $int$400) }), floor(subtract(multiply($int$367, month), $int$362), TWELVE_INTEGER),
		february_adjustment, date, minus($ut_offset_from_rata_die$.getGlobalValue()) });
	return add(new SubLObject[] { multiply(days, $int$86400), multiply(hour, $int$3600), multiply(minute, $int$60), second, multiply(time_zone, $int$3600) });
    }

    public static SubLObject get_decoded_time() {
	SubLThread thread = SubLProcess.currentSubLThread();
	thread.resetMultipleValues();
	SubLObject second = decode_universal_time(get_universal_time(), UNPROVIDED);
	SubLObject minute = thread.secondMultipleValue();
	SubLObject hour = thread.thirdMultipleValue();
	SubLObject date = thread.fourthMultipleValue();
	SubLObject month = thread.fifthMultipleValue();
	SubLObject year = thread.sixthMultipleValue();
	SubLObject day = thread.seventhMultipleValue();
	SubLObject daylight_p = thread.eighthMultipleValue();
	SubLObject zone = SubLProcess.nthMultipleValue(EIGHT_INTEGER);
	thread.resetMultipleValues();
	return values(new SubLObject[] { second, minute, hour, date, month, year, day, daylight_p, zone });
    }

    public static SubLObject get_internal_real_time() {
	return get_time();
    }

    public static SubLObject get_internal_run_time() {
	return get_time();
    }

    public static SubLObject get_universal_time() {
	return values(round(get_time(), $internal_time_units_per_second$.getGlobalValue()));
    }

    public static SubLObject guess_year_from_two_digits(SubLObject year) {
	SubLThread thread = SubLProcess.currentSubLThread();
	thread.resetMultipleValues();
	SubLObject second = get_decoded_time();
	SubLObject minute = thread.secondMultipleValue();
	SubLObject hour = thread.thirdMultipleValue();
	SubLObject date = thread.fourthMultipleValue();
	SubLObject month = thread.fifthMultipleValue();
	SubLObject current_year = thread.sixthMultipleValue();
	SubLObject day = thread.seventhMultipleValue();
	SubLObject daylight_p = thread.eighthMultipleValue();
	SubLObject zone = SubLProcess.nthMultipleValue(EIGHT_INTEGER);
	thread.resetMultipleValues();
	SubLObject guess = add(year, multiply(truncate(subtract(current_year, $int$50), $int$100), $int$100));
	if (subtract(current_year, guess).numG($int$50))
	    year = add(guess, $int$100);
	else
	    year = guess;

	return year;
    }

    public static SubLObject init_time_high_file() {
	defconstant("*INTERNAL-TIME-UNITS-PER-SECOND*", $int$1000000);
	defconstant("*UT-OFFSET-FROM-RATA-DIE*", $int$693595);
	return SubLNil.NIL;
    }

    public static SubLObject setup_time_high_file() {
	return SubLNil.NIL;
    }

    public static final SubLFile me = new time_high();

    public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high";

    // defconstant
    // Definitions
    public static final SubLSymbol $internal_time_units_per_second$ = makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*");

    // defconstant
    // The number of days between the rata die epoch (January 1, 1 A.D.)
    // and the universal time epoch (January 1, 1900 A.D.)
    public static final SubLSymbol $ut_offset_from_rata_die$ = makeSymbol("*UT-OFFSET-FROM-RATA-DIE*");

    private static final SubLInteger $int$1000000 = makeInteger(1000000);

    private static final SubLInteger $int$693595 = makeInteger(693595);

    private static final SubLInteger $int$3600 = makeInteger(3600);

    private static final SubLInteger $int$86400 = makeInteger(86400);

    private static final SubLInteger $int$146097 = makeInteger(146097);

    private static final SubLInteger $int$36524 = makeInteger(36524);

    private static final SubLInteger $int$1461 = makeInteger(1461);

    private static final SubLInteger $int$365 = makeInteger(365);

    private static final SubLInteger $int$400 = makeInteger(400);

    private static final SubLInteger $int$31 = makeInteger(31);

    public static final SubLList $list11 = list(makeInteger(100), makeInteger(200), makeInteger(300));

    private static final SubLInteger $int$59 = makeInteger(59);

    private static final SubLInteger $int$373 = makeInteger(373);

    private static final SubLInteger $int$367 = makeInteger(367);

    private static final SubLInteger $int$362 = makeInteger(362);

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLInteger $int$99 = makeInteger(99);

    static {

    }

    @Override
    public void declareFunctions() {
	declare_time_high_file();
    }

    @Override
    public void initializeVariables() {
	init_time_high_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_time_high_file();
    }
}
