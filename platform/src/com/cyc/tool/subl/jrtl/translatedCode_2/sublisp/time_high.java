/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.translatedCode_2.sublisp;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class time_high extends SubLTranslatedFile {

    //// Constructor

    private time_high() {
    }

    public static final SubLFile me = new time_high();
    public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high";

    //// Definitions

    @SubL(source = "sublisp/time-high.lisp", position = 1035)
    public static SubLSymbol $internal_time_units_per_second$ = null;

    /** The number of days between the rata die epoch (January 1, 1 A.D.)
    and the universal time epoch (January 1, 1900 A.D.) */
    @SubL(source = "sublisp/time-high.lisp", position = 1092)
    public static SubLSymbol $ut_offset_from_rata_die$ = null;

    @SubL(source = "sublisp/time-high.lisp", position = 1262)
    public static final SubLObject decode_universal_time(SubLObject universal_time, SubLObject time_zone) {
	if ((time_zone == UNPROVIDED)) {
	    time_zone = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject second = NIL;
		SubLObject minute = NIL;
		SubLObject hour = NIL;
		SubLObject date = NIL;
		SubLObject month = NIL;
		SubLObject year = NIL;
		SubLObject day = NIL;
		SubLObject daylight_p = NIL;
		SubLObject seconds_west = NIL;
		if ((NIL != time_zone)) {
		    seconds_west = Numbers.multiply(time_zone, $int2$3600);
		} else {
		    thread.resetMultipleValues();
		    {
			SubLObject offset = Time.get_timezone(universal_time);
			SubLObject dst_p = thread.secondMultipleValue();
			thread.resetMultipleValues();
			seconds_west = offset;
			time_zone = Numbers.floor(offset, $int2$3600);
			if ((NIL != dst_p)) {
			    time_zone = Numbers.add(time_zone, ONE_INTEGER);
			    daylight_p = T;
			}
		    }
		}
		thread.resetMultipleValues();
		{
		    SubLObject days = Numbers.floor(Numbers.subtract(universal_time, seconds_west), $int3$86400);
		    SubLObject seconds = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    day = Numbers.mod(days, SEVEN_INTEGER);
		    thread.resetMultipleValues();
		    {
			SubLObject quadricentennials = Numbers.floor(Numbers.add(days, $ut_offset_from_rata_die$.getGlobalValue()), $int4$146097);
			SubLObject r1 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			thread.resetMultipleValues();
			{
			    SubLObject centennials = Numbers.floor(r1, $int5$36524);
			    SubLObject r2 = thread.secondMultipleValue();
			    thread.resetMultipleValues();
			    thread.resetMultipleValues();
			    {
				SubLObject quadrennials = Numbers.floor(r2, $int6$1461);
				SubLObject r3 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				thread.resetMultipleValues();
				{
				    SubLObject annuals = Numbers.floor(r3, $int7$365);
				    SubLObject r4 = thread.secondMultipleValue();
				    thread.resetMultipleValues();
				    {
					SubLObject last_day_of_cycle_p = makeBoolean((annuals.numE(FOUR_INTEGER) || centennials.numE(FOUR_INTEGER)));
					year = Numbers.add(
						new SubLObject[] { Numbers.multiply(quadricentennials, $int8$400), Numbers.multiply(centennials, $int9$100), Numbers.multiply(quadrennials, FOUR_INTEGER), annuals, ((NIL != last_day_of_cycle_p) ? ((SubLObject) ZERO_INTEGER) : ONE_INTEGER) });
					if ((NIL != last_day_of_cycle_p)) {
					    month = TWELVE_INTEGER;
					    date = $int10$31;
					} else {
					    {
						SubLObject leap_days = ((Numbers.mod(year, FOUR_INTEGER).isZero() && (NIL == conses_high.member(Numbers.mod(year, $int8$400), $list11, UNPROVIDED, UNPROVIDED))) ? ((SubLObject) ONE_INTEGER) : ZERO_INTEGER);
						SubLObject february_adjustment = NIL;
						if (r4.numL(Numbers.add($int12$59, leap_days))) {
						    february_adjustment = ZERO_INTEGER;
						} else {
						    february_adjustment = Numbers.add($int13$_2, leap_days);
						}
						month = Numbers.floor(Numbers.add(Numbers.multiply(TWELVE_INTEGER, Numbers.subtract(r4, february_adjustment)), $int14$373), $int15$367);
						date = Numbers.add(Numbers.subtract(r4, Numbers.add(Numbers.floor(Numbers.subtract(Numbers.multiply($int15$367, month), $int16$362), TWELVE_INTEGER), february_adjustment)), ONE_INTEGER);
					    }
					}
				    }
				}
			    }
			}
		    }
		    thread.resetMultipleValues();
		    {
			SubLObject hours = Numbers.floor(seconds, $int2$3600);
			SubLObject r1 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			hour = hours;
			thread.resetMultipleValues();
			{
			    SubLObject minutes = Numbers.floor(r1, $int17$60);
			    SubLObject seconds_1 = thread.secondMultipleValue();
			    thread.resetMultipleValues();
			    minute = minutes;
			    second = seconds_1;
			}
		    }
		}
		return Values.values(new SubLObject[] { second, minute, hour, date, month, year, day, daylight_p, time_zone });
	    }
	}
    }

    @SubL(source = "sublisp/time-high.lisp", position = 4186)
    public static final SubLObject guess_year_from_two_digits(SubLObject year) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    thread.resetMultipleValues();
	    {
		SubLObject second = Time.get_decoded_time();
		SubLObject minute = thread.secondMultipleValue();
		SubLObject hour = thread.thirdMultipleValue();
		SubLObject date = thread.fourthMultipleValue();
		SubLObject month = thread.fifthMultipleValue();
		SubLObject current_year = thread.sixthMultipleValue();
		SubLObject day = thread.seventhMultipleValue();
		SubLObject daylight_p = thread.eighthMultipleValue();
		SubLObject zone = SubLProcess.nthMultipleValue(EIGHT_INTEGER);
		thread.resetMultipleValues();
		{
		    SubLObject guess = Numbers.add(year, Numbers.multiply(Numbers.truncate(Numbers.subtract(current_year, $int18$50), $int9$100), $int9$100));
		    if (Numbers.subtract(current_year, guess).numG($int18$50)) {
			year = Numbers.add(guess, $int9$100);
		    } else {
			year = guess;
		    }
		}
	    }
	    return year;
	}
    }

    @SubL(source = "sublisp/time-high.lisp", position = 4762)
    public static final SubLObject encode_universal_time(SubLObject second, SubLObject minute, SubLObject hour, SubLObject date, SubLObject month, SubLObject year, SubLObject time_zone) {
	if ((time_zone == UNPROVIDED)) {
	    time_zone = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject guessed_time_zoneP = NIL;
		SubLObject guessed_daylight_p = NIL;
		SubLObject utime = NIL;
		if ((NIL == time_zone)) {
		    thread.resetMultipleValues();
		    {
			SubLObject offset = Time.get_timezone(UNPROVIDED);
			SubLObject daylight_p = thread.secondMultipleValue();
			thread.resetMultipleValues();
			guessed_time_zoneP = T;
			guessed_daylight_p = daylight_p;
			time_zone = Numbers.floor(offset, $int2$3600);
		    }
		}
		if ((year.numGE(ZERO_INTEGER) && year.numLE($int19$99))) {
		    year = guess_year_from_two_digits(year);
		}
		utime = encode_universal_time_internal(second, minute, hour, date, month, year, time_zone);
		if ((NIL != guessed_time_zoneP)) {
		    thread.resetMultipleValues();
		    {
			SubLObject offset = Time.get_timezone(utime);
			SubLObject daylight_p = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if ((daylight_p != guessed_daylight_p)) {
			    if ((NIL != daylight_p)) {
				utime = Numbers.subtract(utime, $int2$3600);
			    } else {
				utime = Numbers.add(utime, $int2$3600);
			    }
			}
		    }
		}
		return utime;
	    }
	}
    }

    @SubL(source = "sublisp/time-high.lisp", position = 5868)
    public static final SubLObject encode_universal_time_internal(SubLObject second, SubLObject minute, SubLObject hour, SubLObject date, SubLObject month, SubLObject year, SubLObject time_zone) {
	{
	    SubLObject days = NIL;
	    SubLObject february_adjustment = NIL;
	    SubLObject previous_year = Numbers.subtract(year, ONE_INTEGER);
	    if (month.numLE(TWO_INTEGER)) {
		february_adjustment = ZERO_INTEGER;
	    } else if ((Numbers.mod(year, FOUR_INTEGER).isZero() && (NIL == conses_high.member(Numbers.mod(year, $int8$400), $list11, UNPROVIDED, UNPROVIDED)))) {
		february_adjustment = MINUS_ONE_INTEGER;
	    } else {
		february_adjustment = $int13$_2;
	    }
	    days = Numbers.add(new SubLObject[] { MINUS_ONE_INTEGER, Numbers.add(new SubLObject[] { Numbers.multiply($int7$365, previous_year), Numbers.floor(previous_year, FOUR_INTEGER), Numbers.minus(Numbers.floor(previous_year, $int9$100)), Numbers.floor(previous_year, $int8$400) }),
		    Numbers.floor(Numbers.subtract(Numbers.multiply($int15$367, month), $int16$362), TWELVE_INTEGER), february_adjustment, date, Numbers.minus($ut_offset_from_rata_die$.getGlobalValue()) });
	    return Numbers.add(new SubLObject[] { Numbers.multiply(days, $int3$86400), Numbers.multiply(hour, $int2$3600), Numbers.multiply(minute, $int17$60), second, Numbers.multiply(time_zone, $int2$3600) });
	}
    }

    @SubL(source = "sublisp/time-high.lisp", position = 7559)
    public static final SubLObject get_universal_time() {
	return Values.values(Numbers.round(Time.get_time(), $internal_time_units_per_second$.getGlobalValue()));
    }

    @SubL(source = "sublisp/time-high.lisp", position = 7660)
    public static final SubLObject get_decoded_time() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    thread.resetMultipleValues();
	    {
		SubLObject second = Time.decode_universal_time(Time.get_universal_time(), UNPROVIDED);
		SubLObject minute = thread.secondMultipleValue();
		SubLObject hour = thread.thirdMultipleValue();
		SubLObject date = thread.fourthMultipleValue();
		SubLObject month = thread.fifthMultipleValue();
		SubLObject year = thread.sixthMultipleValue();
		SubLObject day = thread.seventhMultipleValue();
		SubLObject daylight_p = thread.eighthMultipleValue();
		SubLObject zone = SubLProcess.nthMultipleValue(EIGHT_INTEGER);
		thread.resetMultipleValues();
		return Values.values(new SubLObject[] { second, minute, hour, date, month, year, day, daylight_p, zone });
	    }
	}
    }

    @SubL(source = "sublisp/time-high.lisp", position = 7897)
    public static final SubLObject get_internal_real_time() {
	return Time.get_time();
    }

    @SubL(source = "sublisp/time-high.lisp", position = 7952)
    public static final SubLObject get_internal_run_time() {
	return Time.get_time();
    }

    public static final SubLObject declare_time_high_file() {
	declareFunction("decode_universal_time", "DECODE-UNIVERSAL-TIME", 1, 1, false);
	declareFunction("guess_year_from_two_digits", "GUESS-YEAR-FROM-TWO-DIGITS", 1, 0, false);
	declareFunction("encode_universal_time", "ENCODE-UNIVERSAL-TIME", 6, 1, false);
	declareFunction("encode_universal_time_internal", "ENCODE-UNIVERSAL-TIME-INTERNAL", 7, 0, false);
	declareFunction("get_universal_time", "GET-UNIVERSAL-TIME", 0, 0, false);
	declareFunction("get_decoded_time", "GET-DECODED-TIME", 0, 0, false);
	declareFunction("get_internal_real_time", "GET-INTERNAL-REAL-TIME", 0, 0, false);
	declareFunction("get_internal_run_time", "GET-INTERNAL-RUN-TIME", 0, 0, false);
	return NIL;
    }

    public static final SubLObject init_time_high_file() {
	$internal_time_units_per_second$ = defconstant("*INTERNAL-TIME-UNITS-PER-SECOND*", $int0$1000000);
	$ut_offset_from_rata_die$ = defconstant("*UT-OFFSET-FROM-RATA-DIE*", $int1$693595);
	return NIL;
    }

    public static final SubLObject setup_time_high_file() {
		return NIL;
    }

    //// Internal Constants

    public static final SubLInteger $int0$1000000 = makeInteger(1000000);
    public static final SubLInteger $int1$693595 = makeInteger(693595);
    public static final SubLInteger $int2$3600 = makeInteger(3600);
    public static final SubLInteger $int3$86400 = makeInteger(86400);
    public static final SubLInteger $int4$146097 = makeInteger(146097);
    public static final SubLInteger $int5$36524 = makeInteger(36524);
    public static final SubLInteger $int6$1461 = makeInteger(1461);
    public static final SubLInteger $int7$365 = makeInteger(365);
    public static final SubLInteger $int8$400 = makeInteger(400);
    public static final SubLInteger $int9$100 = makeInteger(100);
    public static final SubLInteger $int10$31 = makeInteger(31);
    public static final SubLList $list11 = list(makeInteger(100), makeInteger(200), makeInteger(300));
    public static final SubLInteger $int12$59 = makeInteger(59);
    public static final SubLInteger $int13$_2 = makeInteger(-2);
    public static final SubLInteger $int14$373 = makeInteger(373);
    public static final SubLInteger $int15$367 = makeInteger(367);
    public static final SubLInteger $int16$362 = makeInteger(362);
    public static final SubLInteger $int17$60 = makeInteger(60);
    public static final SubLInteger $int18$50 = makeInteger(50);
    public static final SubLInteger $int19$99 = makeInteger(99);

    //// Initializers

    public void declareFunctions() {
	declare_time_high_file();
    }

    public void initializeVariables() {
	init_time_high_file();
    }

    public void runTopLevelForms() {
	setup_time_high_file();
    }

}
