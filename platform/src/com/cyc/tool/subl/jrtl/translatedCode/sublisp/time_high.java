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

package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class time_high extends SubLTranslatedFile {

	//// Constructor

	public static SubLFile me = new time_high();

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high";
	@SubL(source = "sublisp/time-high.lisp", position = 1035)
	public static SubLSymbol $internal_time_units_per_second$ = null;

	//// Definitions

	/**
	 * The number of days between the rata die epoch (January 1, 1 A.D.) and the
	 * universal time epoch (January 1, 1900 A.D.)
	 */
	@SubL(source = "sublisp/time-high.lisp", position = 1092)
	public static SubLSymbol $ut_offset_from_rata_die$ = null;

	public static SubLInteger $int0$1000000 = SubLObjectFactory.makeInteger(1000000);

	public static SubLInteger $int1$693595 = SubLObjectFactory.makeInteger(693595);

	public static SubLInteger $int2$3600 = SubLObjectFactory.makeInteger(3600);

	public static SubLInteger $int3$86400 = SubLObjectFactory.makeInteger(86400);

	public static SubLInteger $int4$146097 = SubLObjectFactory.makeInteger(146097);

	public static SubLInteger $int5$36524 = SubLObjectFactory.makeInteger(36524);

	public static SubLInteger $int6$1461 = SubLObjectFactory.makeInteger(1461);

	public static SubLInteger $int7$365 = SubLObjectFactory.makeInteger(365);

	public static SubLInteger $int8$400 = SubLObjectFactory.makeInteger(400);

	public static SubLInteger $int9$100 = SubLObjectFactory.makeInteger(100);

	public static SubLInteger $int10$31 = SubLObjectFactory.makeInteger(31);

	public static SubLList $list11 = ConsesLow.list(SubLObjectFactory.makeInteger(100),
			SubLObjectFactory.makeInteger(200), SubLObjectFactory.makeInteger(300));

	//// Internal Constants

	public static SubLInteger $int12$59 = SubLObjectFactory.makeInteger(59);
	public static SubLInteger $int13$_2 = SubLObjectFactory.makeInteger(-2);
	public static SubLInteger $int14$373 = SubLObjectFactory.makeInteger(373);
	public static SubLInteger $int15$367 = SubLObjectFactory.makeInteger(367);
	public static SubLInteger $int16$362 = SubLObjectFactory.makeInteger(362);
	public static SubLInteger $int17$60 = SubLObjectFactory.makeInteger(60);
	public static SubLInteger $int18$50 = SubLObjectFactory.makeInteger(50);
	public static SubLInteger $int19$99 = SubLObjectFactory.makeInteger(99);

	public static SubLObject declare_time_high_file() {
		SubLFiles.declareFunction(time_high.myName, "decode_universal_time", "DECODE-UNIVERSAL-TIME", 1, 1, false);
		SubLFiles.declareFunction(time_high.myName, "guess_year_from_two_digits", "GUESS-YEAR-FROM-TWO-DIGITS", 1, 0,
				false);
		SubLFiles.declareFunction(time_high.myName, "encode_universal_time", "ENCODE-UNIVERSAL-TIME", 6, 1, false);
		SubLFiles.declareFunction(time_high.myName, "encode_universal_time_internal", "ENCODE-UNIVERSAL-TIME-INTERNAL",
				7, 0, false);
		SubLFiles.declareFunction(time_high.myName, "get_universal_time", "GET-UNIVERSAL-TIME", 0, 0, false);
		SubLFiles.declareFunction(time_high.myName, "get_decoded_time", "GET-DECODED-TIME", 0, 0, false);
		SubLFiles.declareFunction(time_high.myName, "get_internal_real_time", "GET-INTERNAL-REAL-TIME", 0, 0, false);
		SubLFiles.declareFunction(time_high.myName, "get_internal_run_time", "GET-INTERNAL-RUN-TIME", 0, 0, false);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/time-high.lisp", position = 1262)
	public static SubLObject decode_universal_time(SubLObject universal_time, SubLObject time_zone) {
		if (time_zone == CommonSymbols.UNPROVIDED)
			time_zone = CommonSymbols.NIL;
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject second = CommonSymbols.NIL;
				SubLObject minute = CommonSymbols.NIL;
				SubLObject hour = CommonSymbols.NIL;
				SubLObject date = CommonSymbols.NIL;
				SubLObject month = CommonSymbols.NIL;
				SubLObject year = CommonSymbols.NIL;
				SubLObject day = CommonSymbols.NIL;
				SubLObject daylight_p = CommonSymbols.NIL;
				SubLObject seconds_west = CommonSymbols.NIL;
				if (CommonSymbols.NIL != time_zone)
					seconds_west = Numbers.multiply(time_zone, time_high.$int2$3600);
				else {
					thread.resetMultipleValues();
					{
						SubLObject offset = Time.get_timezone(universal_time);
						SubLObject dst_p = thread.secondMultipleValue();
						thread.resetMultipleValues();
						seconds_west = offset;
						time_zone = Numbers.floor(offset, time_high.$int2$3600);
						if (CommonSymbols.NIL != dst_p) {
							time_zone = Numbers.add(time_zone, CommonSymbols.ONE_INTEGER);
							daylight_p = CommonSymbols.T;
						}
					}
				}
				thread.resetMultipleValues();
				{
					SubLObject days = Numbers.floor(Numbers.subtract(universal_time, seconds_west),
							time_high.$int3$86400);
					SubLObject seconds = thread.secondMultipleValue();
					thread.resetMultipleValues();
					day = Numbers.mod(days, CommonSymbols.SEVEN_INTEGER);
					thread.resetMultipleValues();
					{
						SubLObject quadricentennials = Numbers.floor(
								Numbers.add(days, time_high.$ut_offset_from_rata_die$.getGlobalValue()),
								time_high.$int4$146097);
						SubLObject r1 = thread.secondMultipleValue();
						thread.resetMultipleValues();
						thread.resetMultipleValues();
						{
							SubLObject centennials = Numbers.floor(r1, time_high.$int5$36524);
							SubLObject r2 = thread.secondMultipleValue();
							thread.resetMultipleValues();
							thread.resetMultipleValues();
							{
								SubLObject quadrennials = Numbers.floor(r2, time_high.$int6$1461);
								SubLObject r3 = thread.secondMultipleValue();
								thread.resetMultipleValues();
								thread.resetMultipleValues();
								{
									SubLObject annuals = Numbers.floor(r3, time_high.$int7$365);
									SubLObject r4 = thread.secondMultipleValue();
									thread.resetMultipleValues();
									{
										SubLObject last_day_of_cycle_p = SubLObjectFactory
												.makeBoolean(annuals.numE(CommonSymbols.FOUR_INTEGER)
														|| centennials.numE(CommonSymbols.FOUR_INTEGER));
										year = Numbers.add(new SubLObject[] {
												Numbers.multiply(quadricentennials, time_high.$int8$400),
												Numbers.multiply(centennials, time_high.$int9$100),
												Numbers.multiply(quadrennials, CommonSymbols.FOUR_INTEGER), annuals,
												CommonSymbols.NIL != last_day_of_cycle_p
														? (SubLObject) CommonSymbols.ZERO_INTEGER
														: CommonSymbols.ONE_INTEGER });
										if (CommonSymbols.NIL != last_day_of_cycle_p) {
											month = CommonSymbols.TWELVE_INTEGER;
											date = time_high.$int10$31;
										} else {
											SubLObject leap_days = Numbers.mod(year, CommonSymbols.FOUR_INTEGER)
													.isZero()
													&& CommonSymbols.NIL == conses_high.member(
															Numbers.mod(year, time_high.$int8$400), time_high.$list11,
															CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)
																	? (SubLObject) CommonSymbols.ONE_INTEGER
																	: CommonSymbols.ZERO_INTEGER;
											SubLObject february_adjustment = CommonSymbols.NIL;
											if (r4.numL(Numbers.add(time_high.$int12$59, leap_days)))
												february_adjustment = CommonSymbols.ZERO_INTEGER;
											else
												february_adjustment = Numbers.add(time_high.$int13$_2, leap_days);
											month = Numbers.floor(Numbers.add(
													Numbers.multiply(CommonSymbols.TWELVE_INTEGER,
															Numbers.subtract(r4, february_adjustment)),
													time_high.$int14$373), time_high.$int15$367);
											date = Numbers
													.add(Numbers.subtract(r4,
															Numbers.add(
																	Numbers.floor(
																			Numbers.subtract(Numbers.multiply(
																					time_high.$int15$367, month),
																					time_high.$int16$362),
																			CommonSymbols.TWELVE_INTEGER),
																	february_adjustment)),
															CommonSymbols.ONE_INTEGER);
										}
									}
								}
							}
						}
					}
					thread.resetMultipleValues();
					{
						SubLObject hours = Numbers.floor(seconds, time_high.$int2$3600);
						SubLObject r1 = thread.secondMultipleValue();
						thread.resetMultipleValues();
						hour = hours;
						thread.resetMultipleValues();
						{
							SubLObject minutes = Numbers.floor(r1, time_high.$int17$60);
							SubLObject seconds_1 = thread.secondMultipleValue();
							thread.resetMultipleValues();
							minute = minutes;
							second = seconds_1;
						}
					}
				}
				return Values.values(
						new SubLObject[] { second, minute, hour, date, month, year, day, daylight_p, time_zone });
			}
		}
	}

	@SubL(source = "sublisp/time-high.lisp", position = 4762)
	public static SubLObject encode_universal_time(SubLObject second, SubLObject minute, SubLObject hour,
			SubLObject date, SubLObject month, SubLObject year, SubLObject time_zone) {
		if (time_zone == CommonSymbols.UNPROVIDED)
			time_zone = CommonSymbols.NIL;
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject guessed_time_zoneP = CommonSymbols.NIL;
				SubLObject guessed_daylight_p = CommonSymbols.NIL;
				SubLObject utime = CommonSymbols.NIL;
				if (CommonSymbols.NIL == time_zone) {
					thread.resetMultipleValues();
					{
						SubLObject offset = Time.get_timezone(CommonSymbols.UNPROVIDED);
						SubLObject daylight_p = thread.secondMultipleValue();
						thread.resetMultipleValues();
						guessed_time_zoneP = CommonSymbols.T;
						guessed_daylight_p = daylight_p;
						time_zone = Numbers.floor(offset, time_high.$int2$3600);
					}
				}
				if (year.numGE(CommonSymbols.ZERO_INTEGER) && year.numLE(time_high.$int19$99))
					year = time_high.guess_year_from_two_digits(year);
				utime = time_high.encode_universal_time_internal(second, minute, hour, date, month, year, time_zone);
				if (CommonSymbols.NIL != guessed_time_zoneP) {
					thread.resetMultipleValues();
					{
						SubLObject offset = Time.get_timezone(utime);
						SubLObject daylight_p = thread.secondMultipleValue();
						thread.resetMultipleValues();
						if (daylight_p != guessed_daylight_p)
							if (CommonSymbols.NIL != daylight_p)
								utime = Numbers.subtract(utime, time_high.$int2$3600);
							else
								utime = Numbers.add(utime, time_high.$int2$3600);
					}
				}
				return utime;
			}
		}
	}

	@SubL(source = "sublisp/time-high.lisp", position = 5868)
	public static SubLObject encode_universal_time_internal(SubLObject second, SubLObject minute, SubLObject hour,
			SubLObject date, SubLObject month, SubLObject year, SubLObject time_zone) {
		{
			SubLObject days = CommonSymbols.NIL;
			SubLObject february_adjustment = CommonSymbols.NIL;
			SubLObject previous_year = Numbers.subtract(year, CommonSymbols.ONE_INTEGER);
			if (month.numLE(CommonSymbols.TWO_INTEGER))
				february_adjustment = CommonSymbols.ZERO_INTEGER;
			else if (Numbers.mod(year, CommonSymbols.FOUR_INTEGER).isZero()
					&& CommonSymbols.NIL == conses_high.member(Numbers.mod(year, time_high.$int8$400),
							time_high.$list11, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED))
				february_adjustment = CommonSymbols.MINUS_ONE_INTEGER;
			else
				february_adjustment = time_high.$int13$_2;
			days = Numbers.add(new SubLObject[] { CommonSymbols.MINUS_ONE_INTEGER,
					Numbers.add(new SubLObject[] { Numbers.multiply(time_high.$int7$365, previous_year),
							Numbers.floor(previous_year, CommonSymbols.FOUR_INTEGER),
							Numbers.minus(Numbers.floor(previous_year, time_high.$int9$100)),
							Numbers.floor(previous_year, time_high.$int8$400) }),
					Numbers.floor(Numbers.subtract(Numbers.multiply(time_high.$int15$367, month), time_high.$int16$362),
							CommonSymbols.TWELVE_INTEGER),
					february_adjustment, date, Numbers.minus(time_high.$ut_offset_from_rata_die$.getGlobalValue()) });
			return Numbers.add(new SubLObject[] { Numbers.multiply(days, time_high.$int3$86400),
					Numbers.multiply(hour, time_high.$int2$3600), Numbers.multiply(minute, time_high.$int17$60), second,
					Numbers.multiply(time_zone, time_high.$int2$3600) });
		}
	}

	@SubL(source = "sublisp/time-high.lisp", position = 7660)
	public static SubLObject get_decoded_time() {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			thread.resetMultipleValues();
			{
				SubLObject second = Time.decode_universal_time(Time.get_universal_time(), CommonSymbols.UNPROVIDED);
				SubLObject minute = thread.secondMultipleValue();
				SubLObject hour = thread.thirdMultipleValue();
				SubLObject date = thread.fourthMultipleValue();
				SubLObject month = thread.fifthMultipleValue();
				SubLObject year = thread.sixthMultipleValue();
				SubLObject day = thread.seventhMultipleValue();
				SubLObject daylight_p = thread.eighthMultipleValue();
				SubLObject zone = SubLProcess.nthMultipleValue(CommonSymbols.EIGHT_INTEGER);
				thread.resetMultipleValues();
				return Values
						.values(new SubLObject[] { second, minute, hour, date, month, year, day, daylight_p, zone });
			}
		}
	}

	@SubL(source = "sublisp/time-high.lisp", position = 7897)
	public static SubLObject get_internal_real_time() {
		return Time.get_time();
	}

	@SubL(source = "sublisp/time-high.lisp", position = 7952)
	public static SubLObject get_internal_run_time() {
		return Time.get_time();
	}

	@SubL(source = "sublisp/time-high.lisp", position = 7559)
	public static SubLObject get_universal_time() {
		return Values
				.values(Numbers.round(Time.get_time(), time_high.$internal_time_units_per_second$.getGlobalValue()));
	}

	@SubL(source = "sublisp/time-high.lisp", position = 4186)
	public static SubLObject guess_year_from_two_digits(SubLObject year) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
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
				SubLObject zone = SubLProcess.nthMultipleValue(CommonSymbols.EIGHT_INTEGER);
				thread.resetMultipleValues();
				{
					SubLObject guess = Numbers.add(year, Numbers.multiply(
							Numbers.truncate(Numbers.subtract(current_year, time_high.$int18$50), time_high.$int9$100),
							time_high.$int9$100));
					if (Numbers.subtract(current_year, guess).numG(time_high.$int18$50))
						year = Numbers.add(guess, time_high.$int9$100);
					else
						year = guess;
				}
			}
			return year;
		}
	}

	public static SubLObject init_time_high_file() {
		time_high.$internal_time_units_per_second$ = SubLFiles.defconstant("*INTERNAL-TIME-UNITS-PER-SECOND*",
				time_high.$int0$1000000);
		time_high.$ut_offset_from_rata_die$ = SubLFiles.defconstant("*UT-OFFSET-FROM-RATA-DIE*",
				time_high.$int1$693595);
		return CommonSymbols.NIL;
	}

	public static SubLObject setup_time_high_file() {
		// CVS_ID("Id: time-high.lisp 126640 2008-12-04 13:39:36Z builder ");
		return CommonSymbols.NIL;
	}

	private time_high() {
	}

	//// Initializers

	public void declareFunctions() {
		time_high.declare_time_high_file();
	}

	public void initializeVariables() {
		time_high.init_time_high_file();
	}

	public void runTopLevelForms() {
		time_high.setup_time_high_file();
	}

}
