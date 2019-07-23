//
// For LarKC
//
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class time_high extends SubLTranslatedFile {
	public static SubLObject declare_time_high_file() {
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high", "decode_universal_time",
				"DECODE-UNIVERSAL-TIME", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high",
				"guess_year_from_two_digits", "GUESS-YEAR-FROM-TWO-DIGITS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high", "encode_universal_time",
				"ENCODE-UNIVERSAL-TIME", 6, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high",
				"encode_universal_time_internal", "ENCODE-UNIVERSAL-TIME-INTERNAL", 7, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high", "get_universal_time",
				"GET-UNIVERSAL-TIME", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high", "get_decoded_time",
				"GET-DECODED-TIME", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high", "get_internal_real_time",
				"GET-INTERNAL-REAL-TIME", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high", "get_internal_run_time",
				"GET-INTERNAL-RUN-TIME", 0, 0, false);
		return SubLNil.NIL;
	}

	@SubL(source = "sublisp/time-high.lisp", position = 1262L)
	public static SubLObject decode_universal_time(SubLObject universal_time, SubLObject time_zone) {
		if (time_zone == CommonSymbols.UNPROVIDED)
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
			seconds_west = Numbers.multiply(time_zone, time_high.$int$3600);
		else {
			thread.resetMultipleValues();
			SubLObject offset = Time.get_timezone(universal_time);
			SubLObject dst_p = thread.secondMultipleValue();
			thread.resetMultipleValues();
			seconds_west = offset;
			time_zone = Numbers.floor(offset, time_high.$int$3600);
			if (SubLNil.NIL != dst_p) {
				time_zone = Numbers.add(time_zone, CommonSymbols.ONE_INTEGER);
				daylight_p = CommonSymbols.T;
			}
		}
		thread.resetMultipleValues();
		SubLObject days = Numbers.floor(Numbers.subtract(universal_time, seconds_west), time_high.$int$86400);
		SubLObject seconds = thread.secondMultipleValue();
		thread.resetMultipleValues();
		day = Numbers.mod(days, CommonSymbols.SEVEN_INTEGER);
		thread.resetMultipleValues();
		SubLObject quadricentennials = Numbers
				.floor(Numbers.add(days, time_high.$ut_offset_from_rata_die$.getGlobalValue()), time_high.$int$146097);
		SubLObject r1 = thread.secondMultipleValue();
		thread.resetMultipleValues();
		thread.resetMultipleValues();
		SubLObject centennials = Numbers.floor(r1, time_high.$int$36524);
		SubLObject r2 = thread.secondMultipleValue();
		thread.resetMultipleValues();
		thread.resetMultipleValues();
		SubLObject quadrennials = Numbers.floor(r2, time_high.$int$1461);
		SubLObject r3 = thread.secondMultipleValue();
		thread.resetMultipleValues();
		thread.resetMultipleValues();
		SubLObject annuals = Numbers.floor(r3, time_high.$int$365);
		SubLObject r4 = thread.secondMultipleValue();
		thread.resetMultipleValues();
		SubLObject last_day_of_cycle_p = SubLObjectFactory
				.makeBoolean(annuals.numE(CommonSymbols.FOUR_INTEGER) || centennials.numE(CommonSymbols.FOUR_INTEGER));
		year = Numbers.add(new SubLObject[] { Numbers.multiply(quadricentennials, time_high.$int$400),
				Numbers.multiply(centennials, time_high.$int$100),
				Numbers.multiply(quadrennials, CommonSymbols.FOUR_INTEGER), annuals,
				SubLNil.NIL != last_day_of_cycle_p ? CommonSymbols.ZERO_INTEGER : CommonSymbols.ONE_INTEGER });
		if (SubLNil.NIL != last_day_of_cycle_p) {
			month = CommonSymbols.TWELVE_INTEGER;
			date = time_high.$int$31;
		} else {
			SubLObject leap_days = Numbers.mod(year, CommonSymbols.FOUR_INTEGER).isZero()
					&& SubLNil.NIL == conses_high.member(Numbers.mod(year, time_high.$int$400),
							time_high.$list11, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED)
									? CommonSymbols.ONE_INTEGER : CommonSymbols.ZERO_INTEGER;
			SubLObject february_adjustment = SubLNil.NIL;
			if (r4.numL(Numbers.add(time_high.$int$59, leap_days)))
				february_adjustment = CommonSymbols.ZERO_INTEGER;
			else
				february_adjustment = Numbers.add(time_high.$int$_2, leap_days);
			month = Numbers.floor(Numbers.add(
					Numbers.multiply(CommonSymbols.TWELVE_INTEGER, Numbers.subtract(r4, february_adjustment)),
					time_high.$int$373), time_high.$int$367);
			date = Numbers.add(
					Numbers.subtract(r4,
							Numbers.add(Numbers.floor(Numbers.subtract(Numbers.multiply(time_high.$int$367, month),
									time_high.$int$362), CommonSymbols.TWELVE_INTEGER), february_adjustment)),
					CommonSymbols.ONE_INTEGER);
		}
		thread.resetMultipleValues();
		SubLObject hours = Numbers.floor(seconds, time_high.$int$3600);
		r1 = thread.secondMultipleValue();
		thread.resetMultipleValues();
		hour = hours;
		thread.resetMultipleValues();
		SubLObject minutes = Numbers.floor(r1, time_high.$int$60);
		SubLObject seconds_$1 = thread.secondMultipleValue();
		thread.resetMultipleValues();
		minute = minutes;
		second = seconds_$1;
		return Values.values(new SubLObject[] { second, minute, hour, date, month, year, day, daylight_p, time_zone });
	}

	@SubL(source = "sublisp/time-high.lisp", position = 4762L)
	public static SubLObject encode_universal_time(SubLObject second, SubLObject minute, SubLObject hour,
			SubLObject date, SubLObject month, SubLObject year, SubLObject time_zone) {
		if (time_zone == CommonSymbols.UNPROVIDED)
			time_zone = SubLNil.NIL;
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject guessed_time_zoneP = SubLNil.NIL;
		SubLObject guessed_daylight_p = SubLNil.NIL;
		SubLObject utime = SubLNil.NIL;
		if (SubLNil.NIL == time_zone) {
			thread.resetMultipleValues();
			SubLObject offset = Time.get_timezone(CommonSymbols.UNPROVIDED);
			SubLObject daylight_p = thread.secondMultipleValue();
			thread.resetMultipleValues();
			guessed_time_zoneP = CommonSymbols.T;
			guessed_daylight_p = daylight_p;
			time_zone = Numbers.floor(offset, time_high.$int$3600);
		}
		if (year.numGE(CommonSymbols.ZERO_INTEGER) && year.numLE(time_high.$int$99))
			year = guess_year_from_two_digits(year);
		utime = encode_universal_time_internal(second, minute, hour, date, month, year, time_zone);
		if (SubLNil.NIL != guessed_time_zoneP) {
			thread.resetMultipleValues();
			SubLObject offset = Time.get_timezone(utime);
			SubLObject daylight_p = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (!daylight_p.eql(guessed_daylight_p))
				if (SubLNil.NIL != daylight_p)
					utime = Numbers.subtract(utime, time_high.$int$3600);
				else
					utime = Numbers.add(utime, time_high.$int$3600);
		}
		return utime;
	}

	@SubL(source = "sublisp/time-high.lisp", position = 5868L)
	public static SubLObject encode_universal_time_internal(SubLObject second, SubLObject minute, SubLObject hour,
			SubLObject date, SubLObject month, SubLObject year, SubLObject time_zone) {
		SubLObject days = SubLNil.NIL;
		SubLObject february_adjustment = SubLNil.NIL;
		SubLObject previous_year = Numbers.subtract(year, CommonSymbols.ONE_INTEGER);
		if (month.numLE(CommonSymbols.TWO_INTEGER))
			february_adjustment = CommonSymbols.ZERO_INTEGER;
		else if (Numbers.mod(year, CommonSymbols.FOUR_INTEGER).isZero()
				&& SubLNil.NIL == conses_high.member(Numbers.mod(year, time_high.$int$400), time_high.$list11,
						CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED))
			february_adjustment = CommonSymbols.MINUS_ONE_INTEGER;
		else
			february_adjustment = time_high.$int$_2;
		days = Numbers.add(new SubLObject[] { CommonSymbols.MINUS_ONE_INTEGER,
				Numbers.add(new SubLObject[] { Numbers.multiply(time_high.$int$365, previous_year),
						Numbers.floor(previous_year, CommonSymbols.FOUR_INTEGER),
						Numbers.minus(Numbers.floor(previous_year, time_high.$int$100)),
						Numbers.floor(previous_year, time_high.$int$400) }),
				Numbers.floor(Numbers.subtract(Numbers.multiply(time_high.$int$367, month), time_high.$int$362),
						CommonSymbols.TWELVE_INTEGER),
				february_adjustment, date, Numbers.minus(time_high.$ut_offset_from_rata_die$.getGlobalValue()) });
		return Numbers.add(new SubLObject[] { Numbers.multiply(days, time_high.$int$86400),
				Numbers.multiply(hour, time_high.$int$3600), Numbers.multiply(minute, time_high.$int$60), second,
				Numbers.multiply(time_zone, time_high.$int$3600) });
	}

	@SubL(source = "sublisp/time-high.lisp", position = 7660L)
	public static SubLObject get_decoded_time() {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
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
		return Values.values(new SubLObject[] { second, minute, hour, date, month, year, day, daylight_p, zone });
	}

	@SubL(source = "sublisp/time-high.lisp", position = 7897L)
	public static SubLObject get_internal_real_time() {
		return Time.get_time();
	}

	@SubL(source = "sublisp/time-high.lisp", position = 7952L)
	public static SubLObject get_internal_run_time() {
		return Time.get_time();
	}

	@SubL(source = "sublisp/time-high.lisp", position = 7559L)
	public static SubLObject get_universal_time() {
		return Values
				.values(Numbers.round(Time.get_time(), time_high.$internal_time_units_per_second$.getGlobalValue()));
	}

	@SubL(source = "sublisp/time-high.lisp", position = 4186L)
	public static SubLObject guess_year_from_two_digits(SubLObject year) {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
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
		SubLObject guess = Numbers.add(year,
				Numbers.multiply(
						Numbers.truncate(Numbers.subtract(current_year, time_high.$int$50), time_high.$int$100),
						time_high.$int$100));
		if (Numbers.subtract(current_year, guess).numG(time_high.$int$50))
			year = Numbers.add(guess, time_high.$int$100);
		else
			year = guess;
		return year;
	}

	public static SubLObject init_time_high_file() {
		time_high.$internal_time_units_per_second$ = SubLFiles.defconstant("*INTERNAL-TIME-UNITS-PER-SECOND*",
				time_high.$int$1000000);
		time_high.$ut_offset_from_rata_die$ = SubLFiles.defconstant("*UT-OFFSET-FROM-RATA-DIE*",
				time_high.$int$693595);
		return SubLNil.NIL;
	}

	public static SubLObject setup_time_high_file() {
		return SubLNil.NIL;
	}

	public static SubLFile me;
	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high";
	@SubL(source = "sublisp/time-high.lisp", position = 1035L)
	public static SubLSymbol $internal_time_units_per_second$;
	@SubL(source = "sublisp/time-high.lisp", position = 1092L)
	public static SubLSymbol $ut_offset_from_rata_die$;
	private static SubLInteger $int$1000000;
	private static SubLInteger $int$693595;
	private static SubLInteger $int$3600;
	private static SubLInteger $int$86400;
	private static SubLInteger $int$146097;
	private static SubLInteger $int$36524;
	private static SubLInteger $int$1461;
	private static SubLInteger $int$365;
	private static SubLInteger $int$400;
	private static SubLInteger $int$100;
	private static SubLInteger $int$31;
	private static SubLList $list11;
	private static SubLInteger $int$59;
	private static SubLInteger $int$_2;
	private static SubLInteger $int$373;
	private static SubLInteger $int$367;
	private static SubLInteger $int$362;
	private static SubLInteger $int$60;
	private static SubLInteger $int$50;
	private static SubLInteger $int$99;
	static {
		me = new time_high();
		time_high.$internal_time_units_per_second$ = null;
		time_high.$ut_offset_from_rata_die$ = null;
		$int$1000000 = SubLObjectFactory.makeInteger(1000000);
		$int$693595 = SubLObjectFactory.makeInteger(693595);
		$int$3600 = SubLObjectFactory.makeInteger(3600);
		$int$86400 = SubLObjectFactory.makeInteger(86400);
		$int$146097 = SubLObjectFactory.makeInteger(146097);
		$int$36524 = SubLObjectFactory.makeInteger(36524);
		$int$1461 = SubLObjectFactory.makeInteger(1461);
		$int$365 = SubLObjectFactory.makeInteger(365);
		$int$400 = SubLObjectFactory.makeInteger(400);
		$int$100 = SubLObjectFactory.makeInteger(100);
		$int$31 = SubLObjectFactory.makeInteger(31);
		$list11 = ConsesLow.list(SubLObjectFactory.makeInteger(100), SubLObjectFactory.makeInteger(200),
				SubLObjectFactory.makeInteger(300));
		$int$59 = SubLObjectFactory.makeInteger(59);
		$int$_2 = SubLObjectFactory.makeInteger(-2);
		$int$373 = SubLObjectFactory.makeInteger(373);
		$int$367 = SubLObjectFactory.makeInteger(367);
		$int$362 = SubLObjectFactory.makeInteger(362);
		$int$60 = SubLObjectFactory.makeInteger(60);
		$int$50 = SubLObjectFactory.makeInteger(50);
		$int$99 = SubLObjectFactory.makeInteger(99);
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
