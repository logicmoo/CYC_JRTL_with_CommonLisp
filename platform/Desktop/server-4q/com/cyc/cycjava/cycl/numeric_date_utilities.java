// 
////
// 

package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class numeric_date_utilities extends SubLTranslatedFile {
	public static final SubLFile me = new numeric_date_utilities();
	public static final String myName = "com.cyc.cycjava.cycl.numeric_date_utilities";
	public static final String myFingerPrint = "c40539e905640e8dc3aaf9ce7008cb3a91231ab0b82d27acdf236d7ce4102777";
	public static SubLSymbol $microseconds_in_a_second$ = null;
	public static SubLSymbol $microseconds_in_a_millisecond$ = null;
	public static SubLSymbol $milliseconds_in_a_second$ = null;
	public static SubLSymbol $seconds_in_a_leap_year$ = null;
	public static SubLSymbol $seconds_in_a_non_leap_year$ = null;
	public static SubLSymbol $seconds_in_a_week$ = null;
	public static SubLSymbol $seconds_in_a_day$ = null;
	public static SubLSymbol $seconds_in_an_hour$ = null;
	public static SubLSymbol $seconds_in_a_minute$ = null;
	public static SubLSymbol $minutes_in_an_hour$ = null;
	public static SubLSymbol $hours_in_a_day$ = null;
	public static SubLSymbol $months_in_a_quarter$ = null;
	public static SubLSymbol $months_in_a_year$ = null;
	public static SubLSymbol $years_in_a_decade$ = null;
	public static SubLSymbol $years_in_a_century$ = null;
	private static SubLSymbol $elapsed_seconds_multiples$ = null;
	private static SubLSymbol $elapsed_seconds_wXo_days_multiples$ = null;
	private static SubLSymbol $julian_date_reference$ = null;
	private static SubLSymbol $julian_offsets$ = null;
	private static SubLSymbol $month_duration_table$ = null;
	public static SubLSymbol $number_wkday_table$ = null;
	public static SubLSymbol $number_month_table$ = null;
	public static SubLSymbol $seconds_in_a_century$ = null;
	public static SubLSymbol $seconds_in_an_odd_millennium$ = null;
	public static SubLSymbol $seconds_in_an_even_millennium$ = null;
	private static final SubLInteger $int0$1000000 = SubLObjectFactory.makeInteger(0xf4240);
	private static final SubLInteger $int1$1000 = SubLObjectFactory.makeInteger(1000);
	private static final SubLInteger $int2$31622400 = SubLObjectFactory.makeInteger(0x1e28500);
	private static final SubLInteger $int3$31536000 = SubLObjectFactory.makeInteger(0x1e13380);
	private static final SubLInteger $int4$604800 = SubLObjectFactory.makeInteger(0x93a80);
	private static final SubLInteger $int5$86400 = SubLObjectFactory.makeInteger(0x15180);
	private static final SubLInteger $int6$3600 = SubLObjectFactory.makeInteger(3600);
	private static final SubLInteger $int7$60 = SubLObjectFactory.makeInteger(60);
	private static final SubLInteger $int8$24 = SubLObjectFactory.makeInteger(24);
	private static final SubLInteger $int9$100 = SubLObjectFactory.makeInteger(100);
	private static final SubLList $list10 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("TIME")),
			SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
	private static final SubLSymbol $sym11$PROGN = SubLObjectFactory.makeSymbol("PROGN");
	private static final SubLSymbol $sym12$CTIME = SubLObjectFactory.makeSymbol("CTIME");
	private static final SubLSymbol $sym13$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
	private static final SubLSymbol $sym14$TRUNCATE = SubLObjectFactory.makeSymbol("TRUNCATE");
	private static final SubLSymbol $sym15$_ = SubLObjectFactory.makeSymbol("*");
	private static final SubLList $list16 = ConsesLow.list(SubLObjectFactory.makeInteger(1000));
	private static final SubLInteger $int17$31 = SubLObjectFactory.makeInteger(31);
	private static final SubLInteger $int18$23 = SubLObjectFactory.makeInteger(23);
	private static final SubLInteger $int19$59 = SubLObjectFactory.makeInteger(59);
	private static final SubLSymbol $sym20$TIME_FROM_NOW = SubLObjectFactory.makeSymbol("TIME-FROM-NOW");
	private static final SubLList $list21 = ConsesLow
			.list(SubLObjectFactory.makeSymbol("UNIVERSAL-TIME-SECONDS-FROM-NOW"));
	private static final SubLSymbol $sym22$UNIVERSAL_TIME_P = SubLObjectFactory.makeSymbol("UNIVERSAL-TIME-P");
	private static final SubLString $str23$_D__2__0D__2__0D__2__0D__2__0D__2 = SubLObjectFactory
			.makeString("~D-~2,'0D-~2,'0D ~2,'0D:~2,'0D:~2,'0D.~3,'0D");
	private static final SubLString $str24$_D__2__0D__2__0DT_2__0D__2__0D__2 = SubLObjectFactory
			.makeString("~D-~2,'0D-~2,'0DT~2,'0D:~2,'0D:~2,'0D.~3,'0DZ");
	private static final SubLString $str25$ = SubLObjectFactory.makeString("");
	private static final SubLString $str26$_a__6__0D = SubLObjectFactory.makeString("~a-~6,'0D");
	private static final SubLString $str27$_a__6__0D__3__0D = SubLObjectFactory.makeString("~a-~6,'0D.~3,'0D");
	private static final SubLString $str28$mm_dd_yyyy_hh_mm_ss = SubLObjectFactory.makeString("mm/dd/yyyy hh:mm:ss");
	private static final SubLString $str29$_D_2__0D_2__0D_2__0D_2__0D_2__0D = SubLObjectFactory
			.makeString("~D~2,'0D~2,'0D~2,'0D~2,'0D~2,'0D");
	private static final SubLSymbol $sym30$NON_NEGATIVE_NUMBER_P = SubLObjectFactory
			.makeSymbol("NON-NEGATIVE-NUMBER-P");
	private static final SubLSymbol $sym31$NON_NEGATIVE_INTEGER_P = SubLObjectFactory
			.makeSymbol("NON-NEGATIVE-INTEGER-P");
	private static final SubLString $str32$_second__P = SubLObjectFactory.makeString(" second~:P");
	private static final SubLString $str33$ms = SubLObjectFactory.makeString("ms");
	private static final SubLString $str34$_D = SubLObjectFactory.makeString("~D");
	private static final SubLString $str35$__ = SubLObjectFactory.makeString("~,");
	private static final SubLString $str36$F = SubLObjectFactory.makeString("F");
	private static final SubLString $str37$_D_hours___D_minute__P = SubLObjectFactory
			.makeString("~D hours, ~D minute~:P");
	private static final SubLString $str38$_D_minute__P__ = SubLObjectFactory.makeString("~D minute~:P, ");
	private static final SubLSymbol $sym39$READABLE_ELAPSED_TIME_STRING = SubLObjectFactory
			.makeSymbol("READABLE-ELAPSED-TIME-STRING");
	private static final SubLSymbol $kw40$TEST = SubLObjectFactory.makeKeyword("TEST");
	private static final SubLSymbol $kw41$OWNER = SubLObjectFactory.makeKeyword("OWNER");
	private static final SubLSymbol $kw42$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
	private static final SubLSymbol $kw43$KB = SubLObjectFactory.makeKeyword("KB");
	private static final SubLSymbol $kw44$TINY = SubLObjectFactory.makeKeyword("TINY");
	private static final SubLSymbol $kw45$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
	private static final SubLList $list46;
	private static final SubLString $str47$_ = SubLObjectFactory.makeString("-");
	private static final SubLList $list48 = ConsesLow.list(SubLObjectFactory.makeSymbol("DAYS"),
			SubLObjectFactory.makeSymbol("HOURS"), SubLObjectFactory.makeSymbol("MINUTES"),
			SubLObjectFactory.makeSymbol("SECONDS"), SubLObjectFactory.makeSymbol("MILLISECONDS"),
			SubLObjectFactory.makeSymbol("MICROSECONDS"));
	private static final SubLString $str49$_D_day__P = SubLObjectFactory.makeString("~D day~:P");
	private static final SubLString $str50$_D_hour__P = SubLObjectFactory.makeString("~D hour~:P");
	private static final SubLString $str51$_D__2__0D_hour_P = SubLObjectFactory.makeString("~D:~2,'0D hour~P");
	private static final SubLString $str52$_D_minute__P = SubLObjectFactory.makeString("~D minute~:P");
	private static final SubLString $str53$_D__2__0D_minute_P = SubLObjectFactory.makeString("~D:~2,'0D minute~P");
	private static final SubLString $str54$_D_second__P = SubLObjectFactory.makeString("~D second~:P");
	private static final SubLString $str55$_D__2__0D_second_P = SubLObjectFactory.makeString("~D.~2,'0D second~P");
	private static final SubLString $str56$_ms = SubLObjectFactory.makeString(" ms");
	private static final SubLString $str57$___s = SubLObjectFactory.makeString(" \265s");
	private static final SubLString $str58$0___s = SubLObjectFactory.makeString("0 \265s");
	private static final SubLSymbol $sym59$DATETIME_STRING_TEMPLATE_P = SubLObjectFactory
			.makeSymbol("DATETIME-STRING-TEMPLATE-P");
	private static final SubLSymbol $sym60$NON_DATE_TIME_WHITESPACE_P = SubLObjectFactory
			.makeSymbol("NON-DATE-TIME-WHITESPACE-P");
	private static final SubLString $str61$_A__A = SubLObjectFactory.makeString("~A ~A");
	private static final SubLString $str62$Template__s_is_not_a_valid_dateti = SubLObjectFactory
			.makeString("Template ~s is not a valid datetime-string template.");
	private static final SubLList $list63;
	private static final SubLList $list64;
	private static final SubLSymbol $sym65$VALID_DATE_TEMPLATE_CHAR = SubLObjectFactory
			.makeSymbol("VALID-DATE-TEMPLATE-CHAR");
	private static final SubLString $str66$hh_mm_ss = SubLObjectFactory.makeString("hh:mm:ss");
	private static final SubLString $str67$hh_mm_ss_mmm = SubLObjectFactory.makeString("hh:mm:ss.mmm");
	private static final SubLString $str68$hh_mm = SubLObjectFactory.makeString("hh:mm");
	private static final SubLString $str69$hh_mm_ss_m = SubLObjectFactory.makeString("hh:mm:ss.m");
	private static final SubLString $str70$hh_mm_ss_mm = SubLObjectFactory.makeString("hh:mm:ss.mm");
	private static final SubLSymbol $sym71$VALID_YEAR_TOKEN = SubLObjectFactory.makeSymbol("VALID-YEAR-TOKEN");
	private static final SubLSymbol $sym72$VALID_DATE_SEPARATOR = SubLObjectFactory.makeSymbol("VALID-DATE-SEPARATOR");
	private static final SubLSymbol $sym73$VALID_MONTH_TOKEN = SubLObjectFactory.makeSymbol("VALID-MONTH-TOKEN");
	private static final SubLSymbol $sym74$VALID_DAY_TOKEN = SubLObjectFactory.makeSymbol("VALID-DAY-TOKEN");
	private static final SubLString $str75$Template_or_template_portion__S_d = SubLObjectFactory
			.makeString("Template or template portion ~S didn't match any expected pattern");
	private static final SubLString $str76$_ = SubLObjectFactory.makeString("~");
	private static final SubLString $str77$__0D = SubLObjectFactory.makeString(",'0D");
	private static final SubLString $str78$_2__0D__2__0D__2__0D = SubLObjectFactory.makeString("~2,'0D:~2,'0D:~2,'0D");
	private static final SubLString $str79$_2__0D__2__0D = SubLObjectFactory.makeString("~2,'0D:~2,'0D");
	private static final SubLString $str80$_2__0D__2__0D__2__0D__3__0D = SubLObjectFactory
			.makeString("~2,'0D:~2,'0D:~2,'0D.~3,'0D");
	private static final SubLString $str81$_2__0D__2__0D__2__0D__2__0D = SubLObjectFactory
			.makeString("~2,'0D:~2,'0D:~2,'0D.~2,'0D");
	private static final SubLString $str82$_2__0D__2__0D__2__0D__1__0D = SubLObjectFactory
			.makeString("~2,'0D:~2,'0D:~2,'0D.~1,'0D");
	private static final SubLString $str83$Template_or_template_portion__A_w = SubLObjectFactory
			.makeString("Template or template portion ~A wasn't a recognized time template.");
	private static final SubLString $str84$The_template__S_doesn_t_match_the = SubLObjectFactory
			.makeString("The template ~S doesn't match the datetime-string ~S");
	private static final SubLString $str85$Template_or_template_portion__A_w = SubLObjectFactory
			.makeString("Template or template portion ~A wasn't a recognized datetime template.");
	private static final SubLString $str86$The_date_string__A_and_the_templa = SubLObjectFactory
			.makeString("The date string ~A and the template ~A are of length.");
	private static final SubLSymbol $kw87$EOF = SubLObjectFactory.makeKeyword("EOF");
	private static final SubLString $str88$Template_or_template_portion__A_d = SubLObjectFactory
			.makeString("Template or template portion ~A doesn't match datestring ~A");
	private static final SubLList $list89 = ConsesLow.list(SubLObjectFactory.makeString("hh:mm:ss"),
			SubLObjectFactory.makeString("hh:mm"), SubLObjectFactory.makeString("hh:mm:ss.mmm"),
			SubLObjectFactory.makeString("hh:mm:ss.mm"), SubLObjectFactory.makeString("hh:mm:ss.m"));
	private static final SubLString $str90$The_template__A_is_not_a_recogniz = SubLObjectFactory
			.makeString("The template ~A is not a recognized timestring template.");
	private static final SubLString $str91$The_time_string__A_and_the_templa = SubLObjectFactory
			.makeString("The time string ~A and the template ~A are of unequal length.");
	private static final SubLList $list92;
	private static final SubLList $list93;
	private static final SubLString $str94$__A_day_A = SubLObjectFactory.makeString(" ~A day~A");
	private static final SubLString $str95$s = SubLObjectFactory.makeString("s");
	private static final SubLString $str96$__A_hour_A = SubLObjectFactory.makeString(" ~A hour~A");
	private static final SubLString $str97$__A_minute_A = SubLObjectFactory.makeString(" ~A minute~A");
	private static final SubLSymbol $sym98$DOUBLE_FLOAT = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
	private static final SubLString $str99$__A_second_A = SubLObjectFactory.makeString(" ~A second~A");
	private static final SubLString $str100$_0_seconds = SubLObjectFactory.makeString(" 0 seconds");
	private static final SubLSymbol $sym101$ELAPSED_SECONDS_STRING = SubLObjectFactory
			.makeSymbol("ELAPSED-SECONDS-STRING");
	private static final SubLList $list102 = ConsesLow
			.list(SubLObjectFactory.makeSymbol("READABLE-ELAPSED-TIME-STRING"));
	private static final SubLSymbol $sym103$UNIVERSAL_DATE_P = SubLObjectFactory.makeSymbol("UNIVERSAL-DATE-P");
	private static final SubLSymbol $sym104$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
	private static final SubLInteger $int105$10000 = SubLObjectFactory.makeInteger(10000);
	private static final SubLSymbol $sym106$PLUSP = SubLObjectFactory.makeSymbol("PLUSP");
	private static final SubLString $str107$_2__0d__2__0d__4__0d = SubLObjectFactory.makeString("~2,'0d/~2,'0d/~4,'0d");
	private static final SubLString $str108$_2__0d__2__0d__d = SubLObjectFactory.makeString("~2,'0d/~2,'0d/~d");
	private static final SubLString $str109$_2__0d__2__0d___d = SubLObjectFactory.makeString("~2,'0d/~2,'0d/-~d");
	private static final SubLSymbol $kw110$FLOAT = SubLObjectFactory.makeKeyword("FLOAT");
	private static final SubLSymbol $kw111$INTEGER = SubLObjectFactory.makeKeyword("INTEGER");
	private static final SubLList $list112 = ConsesLow.cons(SubLObjectFactory.makeInteger(0x1315731),
			SubLObjectFactory.makeDouble(2452122.5D));
	private static final SubLSymbol $sym113$_JULIAN_OFFSETS_ = SubLObjectFactory.makeSymbol("*JULIAN-OFFSETS*");
	private static final SubLList $list114 = ConsesLow.cons(SubLObjectFactory.makeSymbol("REFERENCE-UNIVERSAL-DATE"),
			SubLObjectFactory.makeSymbol("REFERENCE-JULIAN-DATE"));
	private static final SubLInteger $int115$235959 = SubLObjectFactory.makeInteger(0x399b7);
	private static final SubLString $str116$second__S_not_in_the_range_0_59 = SubLObjectFactory
			.makeString("second ~S not in the range 0-59");
	private static final SubLString $str117$minute__S_not_in_the_range_0_59 = SubLObjectFactory
			.makeString("minute ~S not in the range 0-59");
	private static final SubLString $str118$hour__S_not_in_the_range_0_59 = SubLObjectFactory
			.makeString("hour ~S not in the range 0-59");
	private static final SubLSymbol $sym119$UNIVERSAL_SECOND_P = SubLObjectFactory.makeSymbol("UNIVERSAL-SECOND-P");
	private static final SubLString $str120$0 = SubLObjectFactory.makeString("0");
	private static final SubLString $str121$_ = SubLObjectFactory.makeString(":");
	private static final SubLInteger $int122$999 = SubLObjectFactory.makeInteger(999);
	private static final SubLString $str123$second__S_not_in_the_range_0_999 = SubLObjectFactory
			.makeString("second ~S not in the range 0-999");
	private static final SubLString $str124$_2__0d__2__0d__2__0d__3__0d = SubLObjectFactory
			.makeString("~2,'0d:~2,'0d:~2,'0d.~3,'0d");
	private static final SubLInteger $int125$100000000 = SubLObjectFactory.makeInteger(0x5f5e100);
	private static final SubLInteger $int126$10000000000 = SubLObjectFactory.makeInteger("10000000000");
	private static final SubLString $str127$MM_DD_YY_adjust_problem___s__s__s = SubLObjectFactory
			.makeString("MM/DD/YY adjust problem: ~s ~s ~s");
	private static final SubLInteger $int128$400 = SubLObjectFactory.makeInteger(400);
	private static final SubLList $list129 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeInteger(31),
			SubLObjectFactory.makeInteger(28), SubLObjectFactory.makeInteger(31), SubLObjectFactory.makeInteger(30),
			SubLObjectFactory.makeInteger(31), SubLObjectFactory.makeInteger(30), SubLObjectFactory.makeInteger(31),
			SubLObjectFactory.makeInteger(31), SubLObjectFactory.makeInteger(30), SubLObjectFactory.makeInteger(31),
			SubLObjectFactory.makeInteger(30), SubLObjectFactory.makeInteger(31) });
	private static final SubLList $list130;
	private static final SubLList $list131;
	private static final SubLSymbol $sym132$ABBREVIATION_FOR_MONTH_NUMBER = SubLObjectFactory
			.makeSymbol("ABBREVIATION-FOR-MONTH-NUMBER");
	private static final SubLList $list133 = ConsesLow.list(SubLObjectFactory.makeSymbol("MONTH-NUMBER-ABBREV"));
	private static final SubLString $str134$_ = SubLObjectFactory.makeString(" ");
	private static final SubLString $str135$__ = SubLObjectFactory.makeString(", ");
	private static final SubLString $str136$_2__0D__2__0D__2__0D__2__0D__2__0 = SubLObjectFactory
			.makeString("~2,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D");
	private static final SubLString $str137$_D_day__P__D__2__0D__2__0D = SubLObjectFactory
			.makeString("~D day~:P ~D:~2,'0D:~2,'0D");
	private static final SubLString $str138$_D__2__0D__2__0D = SubLObjectFactory.makeString("~D:~2,'0D:~2,'0D");
	private static final SubLString $str139$_D__2__0D = SubLObjectFactory.makeString("~D:~2,'0D");
	private static final SubLString $str140$_Dd__2__0Dh__2__0Dm__2__0Ds = SubLObjectFactory
			.makeString("~Dd ~2,'0Dh ~2,'0Dm ~2,'0Ds");
	private static final SubLString $str141$_2__0Dh__2__0Dm__2__0Ds = SubLObjectFactory
			.makeString("~2,'0Dh ~2,'0Dm ~2,'0Ds");
	private static final SubLString $str142$_2__0Dm__2__0Ds = SubLObjectFactory.makeString("~2,'0Dm ~2,'0Ds");
	private static final SubLInteger $int143$3155760000 = SubLObjectFactory.makeInteger("3155760000");
	private static final SubLInteger $int144$31556908800 = SubLObjectFactory.makeInteger("31556908800");
	private static final SubLInteger $int145$31556995200 = SubLObjectFactory.makeInteger("31556995200");
	private static final SubLString $str146$Numeric_Date_Utilities = SubLObjectFactory
			.makeString("Numeric Date Utilities");
	private static final SubLList $list147 = ConsesLow
			.list(SubLObjectFactory.makeSymbol("TEMPLATIZED-DATESTRING-CASE"));

	static {
		$list46 = ConsesLow.list(new SubLObject[] {
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeDouble(0.0029069999999999999D)),
						SubLObjectFactory.makeString("2.91ms")),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeDouble(0.029069999999999999D)),
						SubLObjectFactory.makeString("29.07ms")),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeDouble(0.2616D)),
						SubLObjectFactory.makeString("262ms")),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeDouble(0.78480000000000005D)),
						SubLObjectFactory.makeString("785ms")),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeDouble(6.2789999999999999D)),
						SubLObjectFactory.makeString("6.28 seconds")),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeDouble(12.558D)),
						SubLObjectFactory.makeString("12.56 seconds")),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeDouble(25.116D)),
						SubLObjectFactory.makeString("25.12 seconds")),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeDouble(50.231999999999999D)),
						SubLObjectFactory.makeString("50.23 seconds")),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeInteger(60), ZERO_INTEGER),
						SubLObjectFactory.makeString("60 seconds")),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeDouble(299.99000000000001D)),
						SubLObjectFactory.makeString("5 minutes, 0 seconds")),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeDouble(452.08999999999997D)),
						SubLObjectFactory.makeString("7 minutes, 32 seconds")),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeInteger(3600)),
						SubLObjectFactory.makeString("60 minutes, 0 seconds")),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeDouble(4520.9300000000003D)),
						SubLObjectFactory.makeString("75 minutes, 21 seconds")),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeDouble(40688.370000000003D)),
						SubLObjectFactory.makeString("11 hours, 18 minutes")),
				ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeDouble(81376.740000000005D)),
						SubLObjectFactory.makeString("22 hours, 36 minutes")) });
		$list63 = ConsesLow.list(new SubLObject[] { Characters.CHAR_y, Characters.CHAR_Y, Characters.CHAR_m,
				Characters.CHAR_M, Characters.CHAR_d, Characters.CHAR_D, Characters.CHAR_slash, Characters.CHAR_hyphen,
				Characters.CHAR_underbar });
		$list64 = ConsesLow.list(Characters.CHAR_h, Characters.CHAR_H, Characters.CHAR_m, Characters.CHAR_M,
				Characters.CHAR_s, Characters.CHAR_S, Characters.CHAR_colon);
		$list92 = ConsesLow.list(SubLObjectFactory.makeSymbol("WHOLE-SECONDS"),
				SubLObjectFactory.makeSymbol("&OPTIONAL"),
				ConsesLow.list(SubLObjectFactory.makeSymbol("MINUTES"), ZERO_INTEGER),
				ConsesLow.list(SubLObjectFactory.makeSymbol("HOURS"), ZERO_INTEGER),
				ConsesLow.list(SubLObjectFactory.makeSymbol("ELAPSED-DAYS"), ZERO_INTEGER));
		$list93 = ConsesLow.list(SubLObjectFactory.makeSymbol("WHOLE-SECONDS"),
				SubLObjectFactory.makeSymbol("&OPTIONAL"),
				ConsesLow.list(SubLObjectFactory.makeSymbol("MINUTES"), ZERO_INTEGER),
				ConsesLow.list(SubLObjectFactory.makeSymbol("HOURS"), ZERO_INTEGER));
		$list130 = ConsesLow.list(ConsesLow.cons(ZERO_INTEGER, SubLObjectFactory.makeString("Mon")),
				ConsesLow.cons(ONE_INTEGER, SubLObjectFactory.makeString("Tue")),
				ConsesLow.cons(TWO_INTEGER, SubLObjectFactory.makeString("Wed")),
				ConsesLow.cons(THREE_INTEGER, SubLObjectFactory.makeString("Thu")),
				ConsesLow.cons(FOUR_INTEGER, SubLObjectFactory.makeString("Fri")),
				ConsesLow.cons(FIVE_INTEGER, SubLObjectFactory.makeString("Sat")),
				ConsesLow.cons(SIX_INTEGER, SubLObjectFactory.makeString("Sun")));
		$list131 = ConsesLow.list(new SubLObject[] { ConsesLow.cons(ONE_INTEGER, SubLObjectFactory.makeString("Jan")),
				ConsesLow.cons(TWO_INTEGER, SubLObjectFactory.makeString("Feb")),
				ConsesLow.cons(THREE_INTEGER, SubLObjectFactory.makeString("Mar")),
				ConsesLow.cons(FOUR_INTEGER, SubLObjectFactory.makeString("Apr")),
				ConsesLow.cons(FIVE_INTEGER, SubLObjectFactory.makeString("May")),
				ConsesLow.cons(SIX_INTEGER, SubLObjectFactory.makeString("Jun")),
				ConsesLow.cons(SEVEN_INTEGER, SubLObjectFactory.makeString("Jul")),
				ConsesLow.cons(EIGHT_INTEGER, SubLObjectFactory.makeString("Aug")),
				ConsesLow.cons(NINE_INTEGER, SubLObjectFactory.makeString("Sep")),
				ConsesLow.cons(TEN_INTEGER, SubLObjectFactory.makeString("Oct")),
				ConsesLow.cons(ELEVEN_INTEGER, SubLObjectFactory.makeString("Nov")),
				ConsesLow.cons(TWELVE_INTEGER, SubLObjectFactory.makeString("Dec")) });
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 1993L)
	public static SubLObject elapsed_milliseconds(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) numeric_date_utilities.$list10);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject time = (SubLObject) numeric_date_utilities.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) numeric_date_utilities.$list10);
		time = current.first();
		current = current.rest();
		if (numeric_date_utilities.NIL == current) {
			final SubLObject body;
			current = (body = temp);
			return (SubLObject) ConsesLow
					.list((SubLObject) numeric_date_utilities.$sym11$PROGN,
							(SubLObject) ConsesLow.listS((SubLObject) numeric_date_utilities.$sym12$CTIME, time,
									ConsesLow.append(body, (SubLObject) numeric_date_utilities.NIL)),
							(SubLObject) ConsesLow
									.list((SubLObject) numeric_date_utilities.$sym13$CSETQ, time,
											(SubLObject) ConsesLow.list(
													(SubLObject) numeric_date_utilities.$sym14$TRUNCATE,
													(SubLObject) ConsesLow.listS(
															(SubLObject) numeric_date_utilities.$sym15$_, time,
															(SubLObject) numeric_date_utilities.$list16))));
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) numeric_date_utilities.$list10);
		return (SubLObject) numeric_date_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 2227L)
	public static SubLObject valid_year_number_p(final SubLObject v_object) {
		return Types.integerp(v_object);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 2369L)
	public static SubLObject valid_month_number_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(numeric_date_utilities.NIL != subl_promotions.positive_integer_p(v_object)
						&& v_object.numLE((SubLObject) numeric_date_utilities.TWELVE_INTEGER));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 2545L)
	public static SubLObject valid_day_number_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(numeric_date_utilities.NIL != subl_promotions.positive_integer_p(v_object)
						&& v_object.numLE((SubLObject) numeric_date_utilities.$int17$31));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 2756L)
	public static SubLObject valid_day_for_month_p(final SubLObject v_object, final SubLObject month,
			final SubLObject year) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(numeric_date_utilities.NIL != subl_promotions.positive_integer_p(v_object)
						&& v_object.numLE(days_in_month_number(month, year)));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 3067L)
	public static SubLObject valid_hour_number_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(numeric_date_utilities.NIL != subl_promotions.non_negative_integer_p(v_object)
						&& v_object.numLE((SubLObject) numeric_date_utilities.$int18$23));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 3245L)
	public static SubLObject valid_minute_number_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(numeric_date_utilities.NIL != subl_promotions.non_negative_integer_p(v_object)
						&& v_object.numLE((SubLObject) numeric_date_utilities.$int19$59));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 3429L)
	public static SubLObject valid_second_number_p(final SubLObject v_object) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(numeric_date_utilities.NIL != subl_promotions.non_negative_integer_p(v_object)
						&& v_object.numLE((SubLObject) numeric_date_utilities.$int19$59));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 3613L)
	public static SubLObject universal_time_p(final SubLObject v_object) {
		return Types.integerp(v_object);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 3890L)
	public static SubLObject universal_time_seconds_from_now(final SubLObject seconds, SubLObject reference_time) {
		if (reference_time == numeric_date_utilities.UNPROVIDED) {
			reference_time = Time.get_universal_time();
		}
		return Numbers.add(reference_time, seconds.isInteger() ? seconds
				: Numbers.truncate(seconds, (SubLObject) numeric_date_utilities.UNPROVIDED));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 4253L)
	public static SubLObject time_from_now(final SubLObject seconds) {
		return universal_time_seconds_from_now(seconds, (SubLObject) numeric_date_utilities.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 4422L)
	public static SubLObject universal_time_from_now(final SubLObject seconds, SubLObject minutes, SubLObject hours) {
		if (minutes == numeric_date_utilities.UNPROVIDED) {
			minutes = (SubLObject) numeric_date_utilities.ZERO_INTEGER;
		}
		if (hours == numeric_date_utilities.UNPROVIDED) {
			hours = (SubLObject) numeric_date_utilities.ZERO_INTEGER;
		}
		final SubLObject total_minutes = Numbers.add(minutes,
				Numbers.multiply(numeric_date_utilities.$minutes_in_an_hour$.getGlobalValue(), hours));
		final SubLObject total_seconds = Numbers.add(seconds,
				Numbers.multiply(numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue(), total_minutes));
		return universal_time_seconds_from_now(total_seconds, (SubLObject) numeric_date_utilities.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 4703L)
	public static SubLObject timestring(SubLObject universal_time) {
		if (universal_time == numeric_date_utilities.UNPROVIDED) {
			universal_time = Time.get_universal_time();
		}
		assert numeric_date_utilities.NIL != universal_time_p(universal_time) : universal_time;
		return timestring_int(universal_time);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 5020L)
	public static SubLObject timestring_ms(SubLObject universal_time, SubLObject universal_millisecond) {
		if (universal_time == numeric_date_utilities.UNPROVIDED) {
			universal_time = Time.get_universal_time();
		}
		if (universal_millisecond == numeric_date_utilities.UNPROVIDED) {
			universal_millisecond = get_universal_millisecond((SubLObject) numeric_date_utilities.UNPROVIDED);
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject second = Time.decode_universal_time(universal_time,
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject minute = thread.secondMultipleValue();
		final SubLObject hour = thread.thirdMultipleValue();
		final SubLObject day = thread.fourthMultipleValue();
		final SubLObject month = thread.fifthMultipleValue();
		final SubLObject year = thread.sixthMultipleValue();
		thread.resetMultipleValues();
		return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
				(SubLObject) numeric_date_utilities.$str23$_D__2__0D__2__0D__2__0D__2__0D__2,
				new SubLObject[] { year, month, day, hour, minute, second,
						Numbers.mod(universal_millisecond, (SubLObject) numeric_date_utilities.$int1$1000) });
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 5640L)
	public static SubLObject timestring_ms_utc(SubLObject universal_time, SubLObject universal_millisecond) {
		if (universal_time == numeric_date_utilities.UNPROVIDED) {
			universal_time = Time.get_universal_time();
		}
		if (universal_millisecond == numeric_date_utilities.UNPROVIDED) {
			universal_millisecond = get_universal_millisecond((SubLObject) numeric_date_utilities.UNPROVIDED);
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject second = Time.decode_universal_time(universal_time,
				(SubLObject) numeric_date_utilities.ZERO_INTEGER);
		final SubLObject minute = thread.secondMultipleValue();
		final SubLObject hour = thread.thirdMultipleValue();
		final SubLObject day = thread.fourthMultipleValue();
		final SubLObject month = thread.fifthMultipleValue();
		final SubLObject year = thread.sixthMultipleValue();
		thread.resetMultipleValues();
		return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
				(SubLObject) numeric_date_utilities.$str24$_D__2__0D__2__0DT_2__0D__2__0D__2,
				new SubLObject[] { year, month, day, hour, minute, second,
						Numbers.mod(universal_millisecond, (SubLObject) numeric_date_utilities.$int1$1000) });
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 6251L)
	public static SubLObject safe_timestring(final SubLObject v_object) {
		if (numeric_date_utilities.NIL != universal_time_p(v_object)) {
			return timestring_int(v_object);
		}
		return (SubLObject) numeric_date_utilities.$str25$;
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 6493L)
	public static SubLObject timestring_int(final SubLObject universal_time) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject second = Time.decode_universal_time(universal_time,
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject minute = thread.secondMultipleValue();
		final SubLObject hour = thread.thirdMultipleValue();
		final SubLObject date = thread.fourthMultipleValue();
		final SubLObject month = thread.fifthMultipleValue();
		final SubLObject year = thread.sixthMultipleValue();
		thread.resetMultipleValues();
		return encode_timestring(second, minute, hour, date, month, year);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 6715L)
	public static SubLObject timestamp(SubLObject universal_date, SubLObject universal_second) {
		if (universal_date == numeric_date_utilities.UNPROVIDED) {
			universal_date = get_universal_date((SubLObject) numeric_date_utilities.UNPROVIDED,
					(SubLObject) numeric_date_utilities.UNPROVIDED);
		}
		if (universal_second == numeric_date_utilities.UNPROVIDED) {
			universal_second = get_universal_second((SubLObject) numeric_date_utilities.UNPROVIDED);
		}
		return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
				(SubLObject) numeric_date_utilities.$str26$_a__6__0D, universal_date, universal_second);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 6899L)
	public static SubLObject numeric_timestamp(SubLObject universal_date, SubLObject universal_second) {
		if (universal_date == numeric_date_utilities.UNPROVIDED) {
			universal_date = get_universal_date((SubLObject) numeric_date_utilities.UNPROVIDED,
					(SubLObject) numeric_date_utilities.UNPROVIDED);
		}
		if (universal_second == numeric_date_utilities.UNPROVIDED) {
			universal_second = get_universal_second((SubLObject) numeric_date_utilities.UNPROVIDED);
		}
		return Numbers.add(Numbers.multiply((SubLObject) numeric_date_utilities.$int0$1000000, universal_date),
				universal_second);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 7082L)
	public static SubLObject timestamp_with_milliseconds(SubLObject universal_date, SubLObject universal_millisecond) {
		if (universal_date == numeric_date_utilities.UNPROVIDED) {
			universal_date = get_universal_date((SubLObject) numeric_date_utilities.UNPROVIDED,
					(SubLObject) numeric_date_utilities.UNPROVIDED);
		}
		if (universal_millisecond == numeric_date_utilities.UNPROVIDED) {
			universal_millisecond = get_universal_millisecond((SubLObject) numeric_date_utilities.UNPROVIDED);
		}
		return PrintLow
				.format((SubLObject) numeric_date_utilities.NIL,
						(SubLObject) numeric_date_utilities.$str27$_a__6__0D__3__0D,
						new SubLObject[] { universal_date,
								number_utilities.div(universal_millisecond,
										(SubLObject) numeric_date_utilities.$int1$1000),
								Numbers.rem(universal_millisecond, (SubLObject) numeric_date_utilities.$int1$1000) });
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 7350L)
	public static SubLObject encode_timestring(final SubLObject second, final SubLObject minute, final SubLObject hour,
			final SubLObject date, final SubLObject month, final SubLObject year) {
		return encode_datetime_string_from_template((SubLObject) numeric_date_utilities.NIL, second, minute, hour, date,
				month, year, (SubLObject) numeric_date_utilities.$str28$mm_dd_yyyy_hh_mm_ss);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 7525L)
	public static SubLObject universal_timestring(SubLObject universal_time) {
		if (universal_time == numeric_date_utilities.UNPROVIDED) {
			universal_time = Time.get_universal_time();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert numeric_date_utilities.NIL != universal_time_p(universal_time) : universal_time;
		thread.resetMultipleValues();
		final SubLObject second = Time.decode_universal_time(universal_time,
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject minute = thread.secondMultipleValue();
		final SubLObject hour = thread.thirdMultipleValue();
		final SubLObject date = thread.fourthMultipleValue();
		final SubLObject month = thread.fifthMultipleValue();
		final SubLObject year = thread.sixthMultipleValue();
		thread.resetMultipleValues();
		return encode_universal_timestring(second, minute, hour, date, month, year);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 7982L)
	public static SubLObject encode_universal_timestring(final SubLObject second, final SubLObject minute,
			final SubLObject hour, final SubLObject date, final SubLObject month, final SubLObject year) {
		return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
				(SubLObject) numeric_date_utilities.$str29$_D_2__0D_2__0D_2__0D_2__0D_2__0D,
				new SubLObject[] { year, month, date, hour, minute, second });
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 8158L)
	public static SubLObject get_universal_time_today(final SubLObject second, final SubLObject minute,
			final SubLObject hour) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject second_now = Time.decode_universal_time(Time.get_universal_time(),
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject minute_now = thread.secondMultipleValue();
		final SubLObject hour_now = thread.thirdMultipleValue();
		final SubLObject day_now = thread.fourthMultipleValue();
		final SubLObject month_now = thread.fifthMultipleValue();
		final SubLObject year_now = thread.sixthMultipleValue();
		thread.resetMultipleValues();
		return Time.encode_universal_time(second, minute, hour, day_now, month_now, year_now,
				(SubLObject) numeric_date_utilities.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 8547L)
	public static SubLObject get_universal_time_within_next_day(final SubLObject second, final SubLObject minute,
			final SubLObject hour) {
		final SubLObject time_now = Time.get_universal_time();
		final SubLObject time_today = get_universal_time_today(second, minute, hour);
		if (time_today.numG(time_now)) {
			return time_today;
		}
		final SubLObject time_tomorrow = Numbers.add(numeric_date_utilities.$seconds_in_a_day$.getGlobalValue(),
				time_today);
		return time_tomorrow;
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 8955L)
	public static SubLObject universal_time_day_of_week_number(SubLObject universal_time) {
		if (universal_time == numeric_date_utilities.UNPROVIDED) {
			universal_time = Time.get_universal_time();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert numeric_date_utilities.NIL != universal_time_p(universal_time) : universal_time;
		thread.resetMultipleValues();
		final SubLObject second = Time.decode_universal_time(universal_time,
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject minute = thread.secondMultipleValue();
		final SubLObject hour = thread.thirdMultipleValue();
		final SubLObject day = thread.fourthMultipleValue();
		final SubLObject month = thread.fifthMultipleValue();
		final SubLObject year = thread.sixthMultipleValue();
		final SubLObject day_of_week = thread.seventhMultipleValue();
		final SubLObject daylight_saving_time_p = thread.eighthMultipleValue();
		final SubLObject time_zone = SubLProcess.nthMultipleValue((SubLObject) numeric_date_utilities.EIGHT_INTEGER);
		thread.resetMultipleValues();
		return day_of_week;
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 9475L)
	public static SubLObject internal_real_time_p(final SubLObject v_object) {
		return subl_promotions.non_negative_integer_p(v_object);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 9709L)
	public static SubLObject internal_real_time_seconds_from_now(final SubLObject seconds, SubLObject reference_time) {
		if (reference_time == numeric_date_utilities.UNPROVIDED) {
			reference_time = Time.get_internal_real_time();
		}
		return Numbers.add(reference_time, elapsed_seconds_to_elapsed_internal_real_time(seconds));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 10077L)
	public static SubLObject elapsed_internal_real_time(final SubLObject reference_time, SubLObject comparison_time) {
		if (comparison_time == numeric_date_utilities.UNPROVIDED) {
			comparison_time = Time.get_internal_real_time();
		}
		return Numbers.subtract(comparison_time, reference_time);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 10493L)
	public static SubLObject elapsed_internal_real_time_to_elapsed_seconds(final SubLObject elapsed) {
		return Numbers.divide(elapsed, time_high.$internal_time_units_per_second$.getGlobalValue());
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 10652L)
	public static SubLObject elapsed_seconds_to_elapsed_internal_real_time(final SubLObject elapsed) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject v_answer = Numbers.truncate(
				Numbers.multiply(elapsed, time_high.$internal_time_units_per_second$.getGlobalValue()),
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject remainder = thread.secondMultipleValue();
		thread.resetMultipleValues();
		return v_answer;
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 10903L)
	public static SubLObject elapsed_seconds_between_internal_real_times(final SubLObject start_time,
			final SubLObject end_time) {
		return elapsed_internal_real_time_to_elapsed_seconds(elapsed_internal_real_time(start_time, end_time));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 11091L)
	public static SubLObject readable_elapsed_time_string(final SubLObject seconds, SubLObject decimal_precision) {
		if (decimal_precision == numeric_date_utilities.UNPROVIDED) {
			decimal_precision = (SubLObject) numeric_date_utilities.TWO_INTEGER;
		}
		assert numeric_date_utilities.NIL != number_utilities.non_negative_number_p(seconds) : seconds;
		assert numeric_date_utilities.NIL != subl_promotions
				.non_negative_integer_p(decimal_precision) : decimal_precision;
		if (!decimal_precision.numLE((SubLObject) numeric_date_utilities.ZERO_INTEGER)) {
			if (seconds.numGE(Numbers.multiply((SubLObject) numeric_date_utilities.TWO_INTEGER,
					numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue()))) {
				decimal_precision = (SubLObject) numeric_date_utilities.ZERO_INTEGER;
			} else if (seconds.numL((SubLObject) numeric_date_utilities.ONE_INTEGER)
					&& seconds.numGE(Numbers.divide((SubLObject) numeric_date_utilities.$int9$100,
							numeric_date_utilities.$milliseconds_in_a_second$.getGlobalValue()))) {
				decimal_precision = (SubLObject) numeric_date_utilities.ZERO_INTEGER;
			} else if (decimal_precision.isPositive()
					&& seconds.numGE(numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue())) {
				decimal_precision = (SubLObject) numeric_date_utilities.ONE_INTEGER;
			}
		}
		SubLObject hours = Numbers.floor(
				Numbers.divide(seconds, numeric_date_utilities.$seconds_in_an_hour$.getGlobalValue()),
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject use_hoursP = Numbers.numGE(hours, (SubLObject) numeric_date_utilities.TWO_INTEGER);
		final SubLObject time_minus_hours = (numeric_date_utilities.NIL != use_hoursP)
				? Numbers.subtract(seconds,
						Numbers.multiply(hours, numeric_date_utilities.$seconds_in_an_hour$.getGlobalValue()))
				: seconds;
		SubLObject minutes = Numbers.floor(
				Numbers.divide(time_minus_hours, numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue()),
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject use_minutesP = (SubLObject) SubLObjectFactory
				.makeBoolean(numeric_date_utilities.NIL != use_hoursP
						|| minutes.numGE((SubLObject) numeric_date_utilities.TWO_INTEGER));
		SubLObject seconds_$1 = (numeric_date_utilities.NIL != use_minutesP)
				? Numbers.subtract(time_minus_hours,
						Numbers.multiply(minutes, numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue()))
				: time_minus_hours;
		final SubLObject use_secondsP = (SubLObject) SubLObjectFactory
				.makeBoolean(numeric_date_utilities.NIL != use_minutesP
						|| seconds_$1.numGE((SubLObject) numeric_date_utilities.ONE_INTEGER));
		SubLObject millis = (SubLObject) ((numeric_date_utilities.NIL != use_secondsP) ? numeric_date_utilities.NIL
				: Numbers.multiply(numeric_date_utilities.$milliseconds_in_a_second$.getGlobalValue(), seconds_$1));
		final SubLObject smallest_unit_string = (SubLObject) ((numeric_date_utilities.NIL != use_secondsP)
				? numeric_date_utilities.$str32$_second__P : numeric_date_utilities.$str33$ms);
		final SubLObject smallest_unit_format_string = decimal_precision.isZero()
				? Sequences.cconcatenate((SubLObject) numeric_date_utilities.$str34$_D, smallest_unit_string)
				: Sequences.cconcatenate((SubLObject) numeric_date_utilities.$str35$__,
						new SubLObject[] { format_nil.format_nil_d(decimal_precision), numeric_date_utilities.$str36$F,
								smallest_unit_string });
		if (decimal_precision.isZero()) {
			seconds_$1 = Numbers.round(seconds_$1, (SubLObject) numeric_date_utilities.UNPROVIDED);
			millis = (SubLObject) ((numeric_date_utilities.NIL != millis)
					? Numbers.round(millis, (SubLObject) numeric_date_utilities.UNPROVIDED)
					: numeric_date_utilities.NIL);
			if (numeric_date_utilities.NIL != use_minutesP
					&& seconds_$1.eql(numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue())) {
				seconds_$1 = (SubLObject) numeric_date_utilities.ZERO_INTEGER;
				minutes = Numbers.add(minutes, (SubLObject) numeric_date_utilities.ONE_INTEGER);
			}
			if (numeric_date_utilities.NIL != use_hoursP
					&& minutes.eql(numeric_date_utilities.$minutes_in_an_hour$.getGlobalValue())) {
				minutes = (SubLObject) numeric_date_utilities.ZERO_INTEGER;
				hours = Numbers.add(hours, (SubLObject) numeric_date_utilities.ONE_INTEGER);
			}
		}
		return format_nil.format_nil_a((numeric_date_utilities.NIL != use_secondsP)
				? ((numeric_date_utilities.NIL != use_minutesP)
						? ((numeric_date_utilities.NIL != use_hoursP)
								? PrintLow.format((SubLObject) numeric_date_utilities.NIL,
										(SubLObject) numeric_date_utilities.$str37$_D_hours___D_minute__P, hours,
										minutes)
								: PrintLow.format((SubLObject) numeric_date_utilities.NIL,
										Sequences.cconcatenate(
												(SubLObject) numeric_date_utilities.$str38$_D_minute__P__,
												smallest_unit_format_string),
										minutes, seconds_$1))
						: PrintLow.format((SubLObject) numeric_date_utilities.NIL, smallest_unit_format_string,
								seconds_$1))
				: PrintLow.format((SubLObject) numeric_date_utilities.NIL, smallest_unit_format_string, millis));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 13879L)
	public static SubLObject explode_elapsed_time_ms(final SubLObject possible_float_ms) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject ms = Numbers.floor(possible_float_ms, (SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject sub_1_ms = thread.secondMultipleValue();
		thread.resetMultipleValues();
		final SubLObject days = Numbers.floor(
				Numbers.divide(ms,
						new SubLObject[] { numeric_date_utilities.$milliseconds_in_a_second$.getGlobalValue(),
								numeric_date_utilities.$seconds_in_a_day$.getGlobalValue() }),
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject day_milliseconds = Numbers.multiply(days,
				numeric_date_utilities.$seconds_in_a_day$.getGlobalValue(),
				numeric_date_utilities.$milliseconds_in_a_second$.getGlobalValue());
		final SubLObject hours = Numbers.floor(
				Numbers.divide(Numbers.subtract(ms, day_milliseconds),
						new SubLObject[] { numeric_date_utilities.$milliseconds_in_a_second$.getGlobalValue(),
								numeric_date_utilities.$seconds_in_an_hour$.getGlobalValue() }),
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject hours_milliseconds = Numbers.multiply(hours,
				numeric_date_utilities.$seconds_in_an_hour$.getGlobalValue(),
				numeric_date_utilities.$milliseconds_in_a_second$.getGlobalValue());
		final SubLObject minutes = Numbers.floor(
				Numbers.divide(Numbers.subtract(ms, day_milliseconds, hours_milliseconds),
						new SubLObject[] { numeric_date_utilities.$milliseconds_in_a_second$.getGlobalValue(),
								numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue() }),
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject minutes_milliseconds = Numbers.multiply(minutes,
				numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue(),
				numeric_date_utilities.$milliseconds_in_a_second$.getGlobalValue());
		final SubLObject seconds = Numbers.floor(
				Numbers.divide(
						Numbers.subtract(ms,
								new SubLObject[] { day_milliseconds, hours_milliseconds, minutes_milliseconds }),
						numeric_date_utilities.$milliseconds_in_a_second$.getGlobalValue()),
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject seconds_milliseconds = Numbers.multiply(seconds,
				numeric_date_utilities.$milliseconds_in_a_second$.getGlobalValue());
		final SubLObject milliseconds = Numbers.subtract(ms,
				new SubLObject[] { day_milliseconds, hours_milliseconds, minutes_milliseconds, seconds_milliseconds });
		final SubLObject microseconds = Numbers.floor(
				Numbers.multiply(numeric_date_utilities.$microseconds_in_a_millisecond$.getGlobalValue(), sub_1_ms),
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		return (SubLObject) ConsesLow.list(days, hours, minutes, seconds, milliseconds, microseconds);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 15041L)
	public static SubLObject readable_elapsed_time_string_ms(final SubLObject ms) {
		if (numeric_date_utilities.NIL != number_utilities.negative_number_p(ms)) {
			return Sequences.cconcatenate((SubLObject) numeric_date_utilities.$str47$_,
					format_nil.format_nil_a_no_copy(readable_elapsed_time_string_ms(Numbers.minus(ms))));
		}
		SubLObject current;
		final SubLObject datum = current = explode_elapsed_time_ms(ms);
		SubLObject days = (SubLObject) numeric_date_utilities.NIL;
		SubLObject hours = (SubLObject) numeric_date_utilities.NIL;
		SubLObject minutes = (SubLObject) numeric_date_utilities.NIL;
		SubLObject seconds = (SubLObject) numeric_date_utilities.NIL;
		SubLObject milliseconds = (SubLObject) numeric_date_utilities.NIL;
		SubLObject microseconds = (SubLObject) numeric_date_utilities.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) numeric_date_utilities.$list48);
		days = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) numeric_date_utilities.$list48);
		hours = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) numeric_date_utilities.$list48);
		minutes = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) numeric_date_utilities.$list48);
		seconds = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) numeric_date_utilities.$list48);
		milliseconds = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) numeric_date_utilities.$list48);
		microseconds = current.first();
		current = current.rest();
		if (numeric_date_utilities.NIL != current) {
			cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) numeric_date_utilities.$list48);
			return (SubLObject) numeric_date_utilities.NIL;
		}
		if (numeric_date_utilities.NIL != subl_promotions.positive_integer_p(days) && hours.isZero()) {
			return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$str49$_D_day__P, days);
		}
		if (numeric_date_utilities.NIL != subl_promotions.positive_integer_p(days)) {
			return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$str50$_D_hour__P,
					Numbers.add(Numbers.multiply((SubLObject) numeric_date_utilities.$int8$24, days), hours));
		}
		if (numeric_date_utilities.NIL != subl_promotions.positive_integer_p(hours) && minutes.isZero()) {
			return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$str50$_D_hour__P, hours, hours);
		}
		if (numeric_date_utilities.NIL != subl_promotions.positive_integer_p(hours)) {
			return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$str51$_D__2__0D_hour_P,
					new SubLObject[] { hours, minutes, Numbers.add(hours, minutes) });
		}
		if (numeric_date_utilities.NIL != subl_promotions.positive_integer_p(minutes) && seconds.isZero()) {
			return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$str52$_D_minute__P, minutes);
		}
		if (numeric_date_utilities.NIL != subl_promotions.positive_integer_p(minutes)) {
			return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$str53$_D__2__0D_minute_P,
					new SubLObject[] { minutes, seconds, Numbers.add(minutes, seconds) });
		}
		if (numeric_date_utilities.NIL != subl_promotions.positive_integer_p(seconds)
				&& numeric_date_utilities.TEN_INTEGER.numG(milliseconds)) {
			return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$str54$_D_second__P, seconds);
		}
		if (numeric_date_utilities.NIL != subl_promotions.positive_integer_p(seconds)) {
			final SubLObject centiseconds = Numbers.round(
					Numbers.divide(milliseconds, (SubLObject) numeric_date_utilities.TEN_INTEGER),
					(SubLObject) numeric_date_utilities.UNPROVIDED);
			return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$str55$_D__2__0D_second_P,
					new SubLObject[] { seconds, centiseconds, Numbers.add(seconds, centiseconds) });
		}
		if (milliseconds.isPositive()) {
			return Sequences.cconcatenate(format_nil.format_nil_d_no_copy(milliseconds),
					(SubLObject) numeric_date_utilities.$str56$_ms);
		}
		if (microseconds.isPositive()) {
			return Sequences.cconcatenate(format_nil.format_nil_d_no_copy(microseconds),
					(SubLObject) numeric_date_utilities.$str57$___s);
		}
		return Sequences.copy_seq((SubLObject) numeric_date_utilities.$str58$0___s);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 16521L)
	public static SubLObject datetime_string_from_template(SubLObject universal_time, SubLObject template) {
		if (universal_time == numeric_date_utilities.UNPROVIDED) {
			universal_time = Time.get_universal_time();
		}
		if (template == numeric_date_utilities.UNPROVIDED) {
			template = (SubLObject) numeric_date_utilities.$str28$mm_dd_yyyy_hh_mm_ss;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert numeric_date_utilities.NIL != universal_time_p(universal_time) : universal_time;
		assert numeric_date_utilities.NIL != datetime_string_template_p(template) : template;
		thread.resetMultipleValues();
		final SubLObject second = Time.decode_universal_time(universal_time,
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject minute = thread.secondMultipleValue();
		final SubLObject hour = thread.thirdMultipleValue();
		final SubLObject day = thread.fourthMultipleValue();
		final SubLObject month = thread.fifthMultipleValue();
		final SubLObject year = thread.sixthMultipleValue();
		thread.resetMultipleValues();
		return encode_datetime_string_from_template((SubLObject) numeric_date_utilities.NIL, second, minute, hour, day,
				month, year, template);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 18853L)
	public static SubLObject encode_datetime_string_from_template(final SubLObject millisecond, final SubLObject second,
			final SubLObject minute, final SubLObject hour, final SubLObject day, final SubLObject month,
			final SubLObject year, final SubLObject template) {
		assert numeric_date_utilities.NIL != datetime_string_template_p(template) : template;
		final SubLObject subtemplates = string_utilities.break_words(template,
				Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym60$NON_DATE_TIME_WHITESPACE_P),
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		if (Sequences.length(subtemplates).numE((SubLObject) numeric_date_utilities.TWO_INTEGER)
				&& numeric_date_utilities.NIL != date_template_p(subtemplates.first())
				&& numeric_date_utilities.NIL != time_template_p(conses_high.second(subtemplates))) {
			return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$str61$_A__A,
					encode_date_from_template(day, month, year, subtemplates.first()),
					encode_time_from_template(millisecond, second, minute, hour, conses_high.second(subtemplates)));
		}
		if (Sequences.length(subtemplates).numE((SubLObject) numeric_date_utilities.TWO_INTEGER)
				&& numeric_date_utilities.NIL != time_template_p(subtemplates.first())
				&& numeric_date_utilities.NIL != date_template_p(conses_high.second(subtemplates))) {
			return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$str61$_A__A,
					encode_time_from_template(millisecond, second, minute, hour, subtemplates.first()),
					encode_date_from_template(day, month, year, conses_high.second(subtemplates)));
		}
		if (Sequences.length(subtemplates).numE((SubLObject) numeric_date_utilities.ONE_INTEGER)
				&& numeric_date_utilities.NIL != date_template_p(subtemplates.first())) {
			return encode_date_from_template(day, month, year, subtemplates.first());
		}
		if (Sequences.length(subtemplates).numE((SubLObject) numeric_date_utilities.ONE_INTEGER)
				&& numeric_date_utilities.NIL != time_template_p(subtemplates.first())) {
			return encode_time_from_template(millisecond, second, minute, hour, subtemplates.first());
		}
		Errors.error((SubLObject) numeric_date_utilities.$str62$Template__s_is_not_a_valid_dateti, template);
		return (SubLObject) numeric_date_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 20504L)
	public static SubLObject valid_date_template_char(final SubLObject v_char) {
		return conses_high.member(v_char, (SubLObject) numeric_date_utilities.$list63,
				(SubLObject) numeric_date_utilities.UNPROVIDED, (SubLObject) numeric_date_utilities.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 20615L)
	public static SubLObject valid_time_template_char(final SubLObject v_char) {
		return conses_high.member(v_char, (SubLObject) numeric_date_utilities.$list64,
				(SubLObject) numeric_date_utilities.UNPROVIDED, (SubLObject) numeric_date_utilities.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 20718L)
	public static SubLObject valid_date_separator(final SubLObject v_char) {
		return (SubLObject) SubLObjectFactory.makeBoolean(
				v_char.eql((SubLObject) Characters.CHAR_slash) || v_char.eql((SubLObject) Characters.CHAR_hyphen)
						|| v_char.eql((SubLObject) Characters.CHAR_underbar));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 20833L)
	public static SubLObject valid_time_separator(final SubLObject v_char) {
		return Equality.eql(v_char, (SubLObject) Characters.CHAR_colon);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 20902L)
	public static SubLObject valid_year_token(final SubLObject v_char) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(v_char.eql((SubLObject) Characters.CHAR_y) || v_char.eql((SubLObject) Characters.CHAR_Y));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 20993L)
	public static SubLObject valid_month_token(final SubLObject v_char) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(v_char.eql((SubLObject) Characters.CHAR_m) || v_char.eql((SubLObject) Characters.CHAR_M));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 21085L)
	public static SubLObject valid_day_token(final SubLObject v_char) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(v_char.eql((SubLObject) Characters.CHAR_d) || v_char.eql((SubLObject) Characters.CHAR_D));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 21175L)
	public static SubLObject valid_hour_token(final SubLObject v_char) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(v_char.eql((SubLObject) Characters.CHAR_h) || v_char.eql((SubLObject) Characters.CHAR_H));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 21266L)
	public static SubLObject valid_minute_token(final SubLObject v_char) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(v_char.eql((SubLObject) Characters.CHAR_m) || v_char.eql((SubLObject) Characters.CHAR_M));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 21359L)
	public static SubLObject valid_second_token(final SubLObject v_char) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(v_char.eql((SubLObject) Characters.CHAR_s) || v_char.eql((SubLObject) Characters.CHAR_S));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 21452L)
	public static SubLObject date_template_p(final SubLObject template) {
		if (numeric_date_utilities.NIL == list_utilities.find_if_not(
				Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym65$VALID_DATE_TEMPLATE_CHAR), template,
				(SubLObject) numeric_date_utilities.UNPROVIDED, (SubLObject) numeric_date_utilities.UNPROVIDED,
				(SubLObject) numeric_date_utilities.UNPROVIDED)) {
			return (SubLObject) numeric_date_utilities.T;
		}
		return (SubLObject) numeric_date_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 21595L)
	public static SubLObject time_template_p(final SubLObject template) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(template.equalp((SubLObject) numeric_date_utilities.$str66$hh_mm_ss)
						|| template.equalp((SubLObject) numeric_date_utilities.$str67$hh_mm_ss_mmm)
						|| template.equalp((SubLObject) numeric_date_utilities.$str68$hh_mm)
						|| template.equalp((SubLObject) numeric_date_utilities.$str69$hh_mm_ss_m)
						|| template.equalp((SubLObject) numeric_date_utilities.$str70$hh_mm_ss_mm));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 21860L)
	public static SubLObject datetime_string_template_p(final SubLObject template) {
		final SubLObject parts = string_utilities.break_words(template,
				Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym60$NON_DATE_TIME_WHITESPACE_P),
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject length = Sequences.length(parts);
		if (!length.numGE((SubLObject) numeric_date_utilities.ONE_INTEGER)
				|| !length.numLE((SubLObject) numeric_date_utilities.TWO_INTEGER)) {
			return (SubLObject) numeric_date_utilities.NIL;
		}
		final SubLObject part1 = ConsesLow.nth((SubLObject) numeric_date_utilities.ZERO_INTEGER, parts);
		final SubLObject part2 = ConsesLow.nth((SubLObject) numeric_date_utilities.ONE_INTEGER, parts);
		if ((numeric_date_utilities.NIL != time_template_p(part1)
				&& (numeric_date_utilities.NIL == part2 || numeric_date_utilities.NIL != date_template_p(part2)))
				|| (numeric_date_utilities.NIL != date_template_p(part1) && (numeric_date_utilities.NIL == part2
						|| numeric_date_utilities.NIL != time_template_p(part2)))) {
			return (SubLObject) numeric_date_utilities.T;
		}
		return (SubLObject) numeric_date_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 22467L)
	public static SubLObject non_date_time_whitespace_p(final SubLObject v_char) {
		return (SubLObject) SubLObjectFactory.makeBoolean(numeric_date_utilities.NIL == date_time_whitespace_p(v_char));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 22564L)
	public static SubLObject date_time_whitespace_p(final SubLObject v_char) {
		return (SubLObject) SubLObjectFactory
				.makeBoolean(numeric_date_utilities.NIL != string_utilities.whitespacep(v_char)
						|| v_char.eql((SubLObject) Characters.CHAR_T));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 22665L)
	public static SubLObject n_digit_template_element_p(final SubLObject template, final SubLObject n,
			final SubLObject token_checker, final SubLObject separator_checker) {
		if (Sequences.length(template).numL(n)) {
			return (SubLObject) numeric_date_utilities.NIL;
		}
		SubLObject index;
		for (index = (SubLObject) numeric_date_utilities.NIL, index = (SubLObject) numeric_date_utilities.ZERO_INTEGER; index
				.numL(n); index = Numbers.add(index, (SubLObject) numeric_date_utilities.ONE_INTEGER)) {
			if (numeric_date_utilities.NIL == Functions.funcall(token_checker, Strings.sublisp_char(template, index))) {
				return (SubLObject) numeric_date_utilities.NIL;
			}
		}
		if (Sequences.length(template).numG(n) && numeric_date_utilities.NIL == Functions.funcall(separator_checker,
				Strings.sublisp_char(template, n))) {
			return (SubLObject) numeric_date_utilities.NIL;
		}
		return (SubLObject) numeric_date_utilities.T;
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 23089L)
	public static SubLObject encode_date_from_template(final SubLObject day, final SubLObject month,
			final SubLObject year, final SubLObject template) {
		if (numeric_date_utilities.NIL != n_digit_template_element_p(template,
				(SubLObject) numeric_date_utilities.FOUR_INTEGER,
				Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym71$VALID_YEAR_TOKEN),
				Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym72$VALID_DATE_SEPARATOR))) {
			return encode_next_date_element(day, month, year, template,
					(SubLObject) numeric_date_utilities.FOUR_INTEGER, year);
		}
		if (numeric_date_utilities.NIL != n_digit_template_element_p(template,
				(SubLObject) numeric_date_utilities.TWO_INTEGER,
				Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym71$VALID_YEAR_TOKEN),
				Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym72$VALID_DATE_SEPARATOR))) {
			return encode_next_date_element(day, month, year, template, (SubLObject) numeric_date_utilities.TWO_INTEGER,
					Numbers.mod(year, (SubLObject) numeric_date_utilities.$int9$100));
		}
		if (numeric_date_utilities.NIL != n_digit_template_element_p(template,
				(SubLObject) numeric_date_utilities.TWO_INTEGER,
				Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym73$VALID_MONTH_TOKEN),
				Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym72$VALID_DATE_SEPARATOR))) {
			return encode_next_date_element(day, month, year, template, (SubLObject) numeric_date_utilities.TWO_INTEGER,
					month);
		}
		if (numeric_date_utilities.NIL != n_digit_template_element_p(template,
				(SubLObject) numeric_date_utilities.TWO_INTEGER,
				Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym74$VALID_DAY_TOKEN),
				Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym72$VALID_DATE_SEPARATOR))) {
			return encode_next_date_element(day, month, year, template, (SubLObject) numeric_date_utilities.TWO_INTEGER,
					day);
		}
		Errors.error((SubLObject) numeric_date_utilities.$str75$Template_or_template_portion__S_d, template);
		return (SubLObject) numeric_date_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 23897L)
	public static SubLObject encode_next_date_element(final SubLObject day, final SubLObject month,
			final SubLObject year, final SubLObject template, final SubLObject elem_length, final SubLObject item) {
		final SubLObject format_string = Sequences.cconcatenate((SubLObject) numeric_date_utilities.$str76$_,
				new SubLObject[] { string_utilities.to_string(elem_length), numeric_date_utilities.$str77$__0D });
		return Sequences.cconcatenate(PrintLow.format((SubLObject) numeric_date_utilities.NIL, format_string, item),
				(SubLObject) (Numbers.add(elem_length, (SubLObject) numeric_date_utilities.ONE_INTEGER)
						.numG(Sequences.length(template))
								? numeric_date_utilities.$str25$
								: Sequences.cconcatenate(
										string_utilities.to_string(Strings.sublisp_char(template, elem_length)),
										encode_date_from_template(day, month, year,
												string_utilities.substring(template,
														Numbers.add(elem_length,
																(SubLObject) numeric_date_utilities.ONE_INTEGER),
														(SubLObject) numeric_date_utilities.UNPROVIDED)))));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 24325L)
	public static SubLObject encode_time_from_template(final SubLObject millisecond, final SubLObject second,
			final SubLObject minute, final SubLObject hour, final SubLObject template) {
		if (numeric_date_utilities.NIL == hour) {
			return (SubLObject) numeric_date_utilities.$str25$;
		}
		if (template.equalp((SubLObject) numeric_date_utilities.$str66$hh_mm_ss)) {
			return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$str78$_2__0D__2__0D__2__0D,
					new SubLObject[] { hour,
							(numeric_date_utilities.NIL != minute) ? minute : numeric_date_utilities.ZERO_INTEGER,
							(numeric_date_utilities.NIL != second) ? second : numeric_date_utilities.ZERO_INTEGER });
		}
		if (template.equalp((SubLObject) numeric_date_utilities.$str68$hh_mm)) {
			return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$str79$_2__0D__2__0D, hour,
					(SubLObject) ((numeric_date_utilities.NIL != minute) ? minute
							: numeric_date_utilities.ZERO_INTEGER));
		}
		if (template.equalp((SubLObject) numeric_date_utilities.$str67$hh_mm_ss_mmm)) {
			return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$str80$_2__0D__2__0D__2__0D__3__0D,
					new SubLObject[] { hour,
							(numeric_date_utilities.NIL != minute) ? minute : numeric_date_utilities.ZERO_INTEGER,
							(numeric_date_utilities.NIL != second) ? second : numeric_date_utilities.ZERO_INTEGER,
							(numeric_date_utilities.NIL != millisecond) ? millisecond
									: numeric_date_utilities.ZERO_INTEGER });
		}
		if (template.equalp((SubLObject) numeric_date_utilities.$str70$hh_mm_ss_mm)) {
			return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$str81$_2__0D__2__0D__2__0D__2__0D,
					new SubLObject[] { hour,
							(numeric_date_utilities.NIL != minute) ? minute : numeric_date_utilities.ZERO_INTEGER,
							(numeric_date_utilities.NIL != second) ? second : numeric_date_utilities.ZERO_INTEGER,
							(numeric_date_utilities.NIL != millisecond)
									? number_utilities.div(millisecond, (SubLObject) numeric_date_utilities.TEN_INTEGER)
									: numeric_date_utilities.ZERO_INTEGER });
		}
		if (template.equalp((SubLObject) numeric_date_utilities.$str69$hh_mm_ss_m)) {
			return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$str82$_2__0D__2__0D__2__0D__1__0D,
					new SubLObject[] { hour,
							(numeric_date_utilities.NIL != minute) ? minute : numeric_date_utilities.ZERO_INTEGER,
							(numeric_date_utilities.NIL != second) ? second : numeric_date_utilities.ZERO_INTEGER,
							(numeric_date_utilities.NIL != millisecond)
									? number_utilities.div(millisecond, (SubLObject) numeric_date_utilities.$int9$100)
									: numeric_date_utilities.ZERO_INTEGER });
		}
		Errors.error((SubLObject) numeric_date_utilities.$str83$Template_or_template_portion__A_w);
		return (SubLObject) numeric_date_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 25391L)
	public static SubLObject decode_datetime_string_from_template(final SubLObject datetime_string,
			final SubLObject template) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert numeric_date_utilities.NIL != datetime_string_template_p(template) : template;
		final SubLObject subtemplates = string_utilities.break_words(template,
				Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym60$NON_DATE_TIME_WHITESPACE_P),
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject subdatetime_strings = string_utilities.break_words(datetime_string,
				Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym60$NON_DATE_TIME_WHITESPACE_P),
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		if (!Sequences.length(subtemplates).eql(Sequences.length(subdatetime_strings))) {
			Errors.error((SubLObject) numeric_date_utilities.$str84$The_template__S_doesn_t_match_the, template,
					datetime_string);
		}
		if (Sequences.length(subtemplates).numE((SubLObject) numeric_date_utilities.TWO_INTEGER)
				&& numeric_date_utilities.NIL != date_template_p(subtemplates.first())
				&& numeric_date_utilities.NIL != time_template_p(conses_high.second(subtemplates))) {
			thread.resetMultipleValues();
			final SubLObject day = decode_date_from_template(subdatetime_strings.first(), subtemplates.first(),
					(SubLObject) numeric_date_utilities.UNPROVIDED, (SubLObject) numeric_date_utilities.UNPROVIDED,
					(SubLObject) numeric_date_utilities.UNPROVIDED);
			final SubLObject month = thread.secondMultipleValue();
			final SubLObject year = thread.thirdMultipleValue();
			thread.resetMultipleValues();
			thread.resetMultipleValues();
			final SubLObject millisecond = decode_time_from_template(conses_high.second(subdatetime_strings),
					conses_high.second(subtemplates));
			final SubLObject second = thread.secondMultipleValue();
			final SubLObject minute = thread.thirdMultipleValue();
			final SubLObject hour = thread.fourthMultipleValue();
			thread.resetMultipleValues();
			return Values.values(millisecond, second, minute, hour, day, month, year);
		}
		if (Sequences.length(subtemplates).numE((SubLObject) numeric_date_utilities.TWO_INTEGER)
				&& numeric_date_utilities.NIL != time_template_p(subtemplates.first())
				&& numeric_date_utilities.NIL != date_template_p(conses_high.second(subtemplates))) {
			thread.resetMultipleValues();
			final SubLObject millisecond2 = decode_time_from_template(subdatetime_strings.first(),
					subtemplates.first());
			final SubLObject second2 = thread.secondMultipleValue();
			final SubLObject minute2 = thread.thirdMultipleValue();
			final SubLObject hour2 = thread.fourthMultipleValue();
			thread.resetMultipleValues();
			thread.resetMultipleValues();
			final SubLObject day2 = decode_date_from_template(conses_high.second(subdatetime_strings),
					conses_high.second(subtemplates), (SubLObject) numeric_date_utilities.UNPROVIDED,
					(SubLObject) numeric_date_utilities.UNPROVIDED, (SubLObject) numeric_date_utilities.UNPROVIDED);
			final SubLObject month2 = thread.secondMultipleValue();
			final SubLObject year2 = thread.thirdMultipleValue();
			thread.resetMultipleValues();
			return Values.values(millisecond2, second2, minute2, hour2, day2, month2, year2);
		}
		if (Sequences.length(subtemplates).numE((SubLObject) numeric_date_utilities.ONE_INTEGER)
				&& numeric_date_utilities.NIL != date_template_p(subtemplates.first())) {
			thread.resetMultipleValues();
			final SubLObject day = decode_date_from_template(subdatetime_strings.first(), subtemplates.first(),
					(SubLObject) numeric_date_utilities.UNPROVIDED, (SubLObject) numeric_date_utilities.UNPROVIDED,
					(SubLObject) numeric_date_utilities.UNPROVIDED);
			final SubLObject month = thread.secondMultipleValue();
			final SubLObject year = thread.thirdMultipleValue();
			thread.resetMultipleValues();
			return Values.values((SubLObject) numeric_date_utilities.NIL, (SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.NIL, (SubLObject) numeric_date_utilities.NIL, day, month, year);
		}
		if (Sequences.length(subtemplates).numE((SubLObject) numeric_date_utilities.ONE_INTEGER)
				&& numeric_date_utilities.NIL != time_template_p(subtemplates.first())) {
			thread.resetMultipleValues();
			final SubLObject millisecond2 = decode_time_from_template(subdatetime_strings.first(),
					subtemplates.first());
			final SubLObject second2 = thread.secondMultipleValue();
			final SubLObject minute2 = thread.thirdMultipleValue();
			final SubLObject hour2 = thread.fourthMultipleValue();
			thread.resetMultipleValues();
			return Values.values(millisecond2, second2, minute2, hour2, (SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.NIL, (SubLObject) numeric_date_utilities.NIL);
		}
		Errors.error((SubLObject) numeric_date_utilities.$str85$Template_or_template_portion__A_w, template);
		return (SubLObject) numeric_date_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 27895L)
	public static SubLObject decode_date_from_template(final SubLObject datestring, final SubLObject template,
			SubLObject day, SubLObject month, SubLObject year) {
		if (day == numeric_date_utilities.UNPROVIDED) {
			day = (SubLObject) numeric_date_utilities.NIL;
		}
		if (month == numeric_date_utilities.UNPROVIDED) {
			month = (SubLObject) numeric_date_utilities.NIL;
		}
		if (year == numeric_date_utilities.UNPROVIDED) {
			year = (SubLObject) numeric_date_utilities.NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (numeric_date_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
				&& !numeric_date_utilities.TWO_INTEGER
						.numGE(Numbers.subtract(Sequences.length(template), Sequences.length(datestring)))) {
			Errors.error((SubLObject) numeric_date_utilities.$str86$The_date_string__A_and_the_templa, datestring,
					template);
		}
		if ((numeric_date_utilities.NIL != day && numeric_date_utilities.NIL != month
				&& numeric_date_utilities.NIL != year)
				|| datestring.equal((SubLObject) numeric_date_utilities.$str25$)) {
			return Values.values(day, month, year);
		}
		if (numeric_date_utilities.NIL != n_digit_template_element_p(template,
				(SubLObject) numeric_date_utilities.FOUR_INTEGER,
				Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym71$VALID_YEAR_TOKEN),
				Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym72$VALID_DATE_SEPARATOR))
				&& numeric_date_utilities.NIL == year) {
			year = reader.read_from_string(datestring, (SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$kw87$EOF, (SubLObject) numeric_date_utilities.ZERO_INTEGER,
					(SubLObject) numeric_date_utilities.FOUR_INTEGER, (SubLObject) numeric_date_utilities.UNPROVIDED);
			if (Sequences.length(datestring).numG((SubLObject) numeric_date_utilities.FOUR_INTEGER)) {
				thread.resetMultipleValues();
				final SubLObject ret_day = decode_date_from_template(
						string_utilities.substring(datestring, (SubLObject) numeric_date_utilities.FIVE_INTEGER,
								(SubLObject) numeric_date_utilities.UNPROVIDED),
						string_utilities.substring(template, (SubLObject) numeric_date_utilities.FIVE_INTEGER,
								(SubLObject) numeric_date_utilities.UNPROVIDED),
						day, month, year);
				final SubLObject ret_month = thread.secondMultipleValue();
				final SubLObject ret_year = thread.thirdMultipleValue();
				thread.resetMultipleValues();
				return Values.values(ret_day, ret_month, ret_year);
			}
			return Values.values(day, month, year);
		} else if (numeric_date_utilities.NIL != n_digit_template_element_p(template,
				(SubLObject) numeric_date_utilities.TWO_INTEGER,
				Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym71$VALID_YEAR_TOKEN),
				Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym72$VALID_DATE_SEPARATOR))
				&& numeric_date_utilities.NIL == year) {
			year = reader.read_from_string(datestring, (SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$kw87$EOF, (SubLObject) numeric_date_utilities.ZERO_INTEGER,
					(SubLObject) numeric_date_utilities.TWO_INTEGER, (SubLObject) numeric_date_utilities.UNPROVIDED);
			if (Sequences.length(datestring).numG((SubLObject) numeric_date_utilities.TWO_INTEGER)) {
				thread.resetMultipleValues();
				final SubLObject ret_day = decode_date_from_template(
						string_utilities.substring(datestring, (SubLObject) numeric_date_utilities.THREE_INTEGER,
								(SubLObject) numeric_date_utilities.UNPROVIDED),
						string_utilities.substring(template, (SubLObject) numeric_date_utilities.THREE_INTEGER,
								(SubLObject) numeric_date_utilities.UNPROVIDED),
						day, month, year);
				final SubLObject ret_month = thread.secondMultipleValue();
				final SubLObject ret_year = thread.thirdMultipleValue();
				thread.resetMultipleValues();
				return Values.values(ret_day, ret_month, ret_year);
			}
			return Values.values(day, month, year);
		} else if (numeric_date_utilities.NIL != n_digit_template_element_p(template,
				(SubLObject) numeric_date_utilities.TWO_INTEGER,
				Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym73$VALID_MONTH_TOKEN),
				Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym72$VALID_DATE_SEPARATOR))
				&& numeric_date_utilities.NIL == month) {
			SubLObject month_end = Sequences.position_if(
					Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym72$VALID_DATE_SEPARATOR),
					datestring, (SubLObject) numeric_date_utilities.UNPROVIDED,
					(SubLObject) numeric_date_utilities.UNPROVIDED, (SubLObject) numeric_date_utilities.UNPROVIDED);
			if (numeric_date_utilities.NIL == month_end) {
				month_end = (SubLObject) numeric_date_utilities.TWO_INTEGER;
			}
			month = reader.read_from_string(datestring, (SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$kw87$EOF, (SubLObject) numeric_date_utilities.ZERO_INTEGER,
					month_end, (SubLObject) numeric_date_utilities.UNPROVIDED);
			if (Sequences.length(datestring).numG(month_end)) {
				thread.resetMultipleValues();
				final SubLObject ret_day2 = decode_date_from_template(
						string_utilities.substring(datestring, number_utilities.f_1X(month_end),
								(SubLObject) numeric_date_utilities.UNPROVIDED),
						string_utilities.substring(template, (SubLObject) numeric_date_utilities.THREE_INTEGER,
								(SubLObject) numeric_date_utilities.UNPROVIDED),
						day, month, year);
				final SubLObject ret_month2 = thread.secondMultipleValue();
				final SubLObject ret_year2 = thread.thirdMultipleValue();
				thread.resetMultipleValues();
				return Values.values(ret_day2, ret_month2, ret_year2);
			}
			return Values.values(day, month, year);
		} else {
			if (numeric_date_utilities.NIL == n_digit_template_element_p(template,
					(SubLObject) numeric_date_utilities.TWO_INTEGER,
					Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym74$VALID_DAY_TOKEN),
					Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym72$VALID_DATE_SEPARATOR))
					|| numeric_date_utilities.NIL != day) {
				Errors.error((SubLObject) numeric_date_utilities.$str88$Template_or_template_portion__A_d, template,
						datestring);
				return (SubLObject) numeric_date_utilities.NIL;
			}
			SubLObject day_end = Sequences.position_if(
					Symbols.symbol_function((SubLObject) numeric_date_utilities.$sym72$VALID_DATE_SEPARATOR),
					datestring, (SubLObject) numeric_date_utilities.UNPROVIDED,
					(SubLObject) numeric_date_utilities.UNPROVIDED, (SubLObject) numeric_date_utilities.UNPROVIDED);
			if (numeric_date_utilities.NIL == day_end) {
				day_end = (SubLObject) numeric_date_utilities.TWO_INTEGER;
			}
			day = reader.read_from_string(datestring, (SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$kw87$EOF, (SubLObject) numeric_date_utilities.ZERO_INTEGER,
					day_end, (SubLObject) numeric_date_utilities.UNPROVIDED);
			if (Sequences.length(datestring).numG(day_end)) {
				thread.resetMultipleValues();
				final SubLObject ret_day2 = decode_date_from_template(
						string_utilities.substring(datestring, number_utilities.f_1X(day_end),
								(SubLObject) numeric_date_utilities.UNPROVIDED),
						string_utilities.substring(template, (SubLObject) numeric_date_utilities.THREE_INTEGER,
								(SubLObject) numeric_date_utilities.UNPROVIDED),
						day, month, year);
				final SubLObject ret_month2 = thread.secondMultipleValue();
				final SubLObject ret_year2 = thread.thirdMultipleValue();
				thread.resetMultipleValues();
				return Values.values(ret_day2, ret_month2, ret_year2);
			}
			return Values.values(day, month, year);
		}
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 30720L)
	public static SubLObject decode_time_from_template(final SubLObject timestring, final SubLObject template) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (numeric_date_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
				&& numeric_date_utilities.NIL == conses_high.member(template,
						(SubLObject) numeric_date_utilities.$list89,
						Symbols.symbol_function((SubLObject) numeric_date_utilities.EQUALP),
						(SubLObject) numeric_date_utilities.UNPROVIDED)) {
			Errors.error((SubLObject) numeric_date_utilities.$str90$The_template__A_is_not_a_recogniz, template);
		}
		if (numeric_date_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
				&& !Sequences.length(timestring).numE(Sequences.length(template))) {
			Errors.error((SubLObject) numeric_date_utilities.$str91$The_time_string__A_and_the_templa, timestring,
					template);
		}
		final SubLObject hour = reader.read_from_string(timestring, (SubLObject) numeric_date_utilities.NIL,
				(SubLObject) numeric_date_utilities.$kw87$EOF, (SubLObject) numeric_date_utilities.ZERO_INTEGER,
				(SubLObject) numeric_date_utilities.TWO_INTEGER, (SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject minute = reader.read_from_string(timestring, (SubLObject) numeric_date_utilities.NIL,
				(SubLObject) numeric_date_utilities.$kw87$EOF, (SubLObject) numeric_date_utilities.THREE_INTEGER,
				(SubLObject) numeric_date_utilities.FIVE_INTEGER, (SubLObject) numeric_date_utilities.UNPROVIDED);
		SubLObject second = (SubLObject) numeric_date_utilities.NIL;
		SubLObject millisecond = (SubLObject) numeric_date_utilities.NIL;
		if (template.equalp((SubLObject) numeric_date_utilities.$str66$hh_mm_ss)
				|| template.equalp((SubLObject) numeric_date_utilities.$str69$hh_mm_ss_m)
				|| template.equalp((SubLObject) numeric_date_utilities.$str70$hh_mm_ss_mm)
				|| template.equalp((SubLObject) numeric_date_utilities.$str67$hh_mm_ss_mmm)) {
			second = reader.read_from_string(timestring, (SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$kw87$EOF, (SubLObject) numeric_date_utilities.SIX_INTEGER,
					(SubLObject) numeric_date_utilities.EIGHT_INTEGER, (SubLObject) numeric_date_utilities.UNPROVIDED);
		}
		if (template.equalp((SubLObject) numeric_date_utilities.$str67$hh_mm_ss_mmm)) {
			millisecond = reader.read_from_string(timestring, (SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$kw87$EOF, (SubLObject) numeric_date_utilities.NINE_INTEGER,
					(SubLObject) numeric_date_utilities.TWELVE_INTEGER, (SubLObject) numeric_date_utilities.UNPROVIDED);
		} else if (template.equalp((SubLObject) numeric_date_utilities.$str70$hh_mm_ss_mm)) {
			millisecond = Numbers.multiply((SubLObject) numeric_date_utilities.TEN_INTEGER,
					reader.read_from_string(timestring, (SubLObject) numeric_date_utilities.NIL,
							(SubLObject) numeric_date_utilities.$kw87$EOF,
							(SubLObject) numeric_date_utilities.NINE_INTEGER,
							(SubLObject) numeric_date_utilities.ELEVEN_INTEGER,
							(SubLObject) numeric_date_utilities.UNPROVIDED));
		} else if (template.equalp((SubLObject) numeric_date_utilities.$str69$hh_mm_ss_m)) {
			millisecond = Numbers.multiply((SubLObject) numeric_date_utilities.$int9$100, reader.read_from_string(
					timestring, (SubLObject) numeric_date_utilities.NIL, (SubLObject) numeric_date_utilities.$kw87$EOF,
					(SubLObject) numeric_date_utilities.NINE_INTEGER, (SubLObject) numeric_date_utilities.TEN_INTEGER,
					(SubLObject) numeric_date_utilities.UNPROVIDED));
		}
		return Values.values(millisecond, second, minute, hour);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 32294L)
	public static SubLObject decode_elapsed_seconds(final SubLObject elapsed_seconds) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert numeric_date_utilities.NIL != number_utilities.non_negative_number_p(elapsed_seconds) : elapsed_seconds;
		thread.resetMultipleValues();
		final SubLObject truncated_exact_seconds = Numbers.truncate(elapsed_seconds,
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject partial_seconds = thread.secondMultipleValue();
		thread.resetMultipleValues();
		SubLObject current;
		final SubLObject datum = current = number_utilities.decode_integer_multiples(truncated_exact_seconds,
				numeric_date_utilities.$elapsed_seconds_multiples$.getGlobalValue());
		SubLObject whole_seconds = (SubLObject) numeric_date_utilities.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) numeric_date_utilities.$list92);
		whole_seconds = current.first();
		current = current.rest();
		final SubLObject minutes = (SubLObject) (current.isCons() ? current.first()
				: numeric_date_utilities.ZERO_INTEGER);
		cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject) numeric_date_utilities.$list92);
		current = current.rest();
		final SubLObject hours = (SubLObject) (current.isCons() ? current.first()
				: numeric_date_utilities.ZERO_INTEGER);
		cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject) numeric_date_utilities.$list92);
		current = current.rest();
		final SubLObject elapsed_days = (SubLObject) (current.isCons() ? current.first()
				: numeric_date_utilities.ZERO_INTEGER);
		cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject) numeric_date_utilities.$list92);
		current = current.rest();
		if (numeric_date_utilities.NIL == current) {
			final SubLObject seconds = Numbers.add(whole_seconds, partial_seconds);
			return Values.values(seconds, minutes, hours, elapsed_days);
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) numeric_date_utilities.$list92);
		return (SubLObject) numeric_date_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 32908L)
	public static SubLObject decode_elapsed_seconds_without_days(final SubLObject elapsed_seconds) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert numeric_date_utilities.NIL != number_utilities.non_negative_number_p(elapsed_seconds) : elapsed_seconds;
		thread.resetMultipleValues();
		final SubLObject truncated_exact_seconds = Numbers.truncate(elapsed_seconds,
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject partial_seconds = thread.secondMultipleValue();
		thread.resetMultipleValues();
		SubLObject current;
		final SubLObject datum = current = number_utilities.decode_integer_multiples(truncated_exact_seconds,
				numeric_date_utilities.$elapsed_seconds_wXo_days_multiples$.getGlobalValue());
		SubLObject whole_seconds = (SubLObject) numeric_date_utilities.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) numeric_date_utilities.$list93);
		whole_seconds = current.first();
		current = current.rest();
		final SubLObject minutes = (SubLObject) (current.isCons() ? current.first()
				: numeric_date_utilities.ZERO_INTEGER);
		cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject) numeric_date_utilities.$list93);
		current = current.rest();
		final SubLObject hours = (SubLObject) (current.isCons() ? current.first()
				: numeric_date_utilities.ZERO_INTEGER);
		cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject) numeric_date_utilities.$list93);
		current = current.rest();
		if (numeric_date_utilities.NIL == current) {
			final SubLObject seconds = Numbers.add(whole_seconds, partial_seconds);
			return Values.values(seconds, minutes, hours);
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) numeric_date_utilities.$list93);
		return (SubLObject) numeric_date_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 33514L)
	public static SubLObject encode_elapsed_seconds(SubLObject seconds, SubLObject minutes, SubLObject hours,
			SubLObject elapsed_days) {
		if (seconds == numeric_date_utilities.UNPROVIDED) {
			seconds = (SubLObject) numeric_date_utilities.ZERO_INTEGER;
		}
		if (minutes == numeric_date_utilities.UNPROVIDED) {
			minutes = (SubLObject) numeric_date_utilities.ZERO_INTEGER;
		}
		if (hours == numeric_date_utilities.UNPROVIDED) {
			hours = (SubLObject) numeric_date_utilities.ZERO_INTEGER;
		}
		if (elapsed_days == numeric_date_utilities.UNPROVIDED) {
			elapsed_days = (SubLObject) numeric_date_utilities.ZERO_INTEGER;
		}
		assert numeric_date_utilities.NIL != number_utilities.non_negative_number_p(seconds) : seconds;
		assert numeric_date_utilities.NIL != subl_promotions.non_negative_integer_p(minutes) : minutes;
		assert numeric_date_utilities.NIL != subl_promotions.non_negative_integer_p(hours) : hours;
		assert numeric_date_utilities.NIL != subl_promotions.non_negative_integer_p(elapsed_days) : elapsed_days;
		return number_utilities.encode_integer_multiples(
				(SubLObject) ConsesLow.list(seconds, minutes, hours, elapsed_days),
				numeric_date_utilities.$elapsed_seconds_multiples$.getGlobalValue());
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 34041L)
	public static SubLObject encode_elapsed_seconds_string(SubLObject seconds, SubLObject minutes, SubLObject hours,
			SubLObject elapsed_days) {
		if (seconds == numeric_date_utilities.UNPROVIDED) {
			seconds = (SubLObject) numeric_date_utilities.ZERO_INTEGER;
		}
		if (minutes == numeric_date_utilities.UNPROVIDED) {
			minutes = (SubLObject) numeric_date_utilities.ZERO_INTEGER;
		}
		if (hours == numeric_date_utilities.UNPROVIDED) {
			hours = (SubLObject) numeric_date_utilities.ZERO_INTEGER;
		}
		if (elapsed_days == numeric_date_utilities.UNPROVIDED) {
			elapsed_days = (SubLObject) numeric_date_utilities.ZERO_INTEGER;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert numeric_date_utilities.NIL != number_utilities.non_negative_number_p(seconds) : seconds;
		assert numeric_date_utilities.NIL != subl_promotions.non_negative_integer_p(minutes) : minutes;
		assert numeric_date_utilities.NIL != subl_promotions.non_negative_integer_p(hours) : hours;
		assert numeric_date_utilities.NIL != subl_promotions.non_negative_integer_p(elapsed_days) : elapsed_days;
		SubLObject result = (SubLObject) numeric_date_utilities.NIL;
		SubLObject stream = (SubLObject) numeric_date_utilities.NIL;
		try {
			stream = streams_high.make_private_string_output_stream();
			if (!numeric_date_utilities.ZERO_INTEGER.numE(elapsed_days)) {
				PrintLow.format(stream, (SubLObject) numeric_date_utilities.$str94$__A_day_A, elapsed_days,
						(SubLObject) (numeric_date_utilities.ONE_INTEGER.numE(elapsed_days)
								? numeric_date_utilities.$str25$ : numeric_date_utilities.$str95$s));
			}
			if (!numeric_date_utilities.ZERO_INTEGER.numE(hours)) {
				PrintLow.format(stream, (SubLObject) numeric_date_utilities.$str96$__A_hour_A, hours,
						(SubLObject) (numeric_date_utilities.ONE_INTEGER.numE(hours) ? numeric_date_utilities.$str25$
								: numeric_date_utilities.$str95$s));
			}
			if (!numeric_date_utilities.ZERO_INTEGER.numE(minutes)) {
				PrintLow.format(stream, (SubLObject) numeric_date_utilities.$str97$__A_minute_A, minutes,
						(SubLObject) (numeric_date_utilities.ONE_INTEGER.numE(minutes) ? numeric_date_utilities.$str25$
								: numeric_date_utilities.$str95$s));
			}
			if (!numeric_date_utilities.ZERO_INTEGER.numE(seconds)) {
				final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding(thread);
				try {
					reader.$read_default_float_format$.bind((SubLObject) numeric_date_utilities.$sym98$DOUBLE_FLOAT,
							thread);
					PrintLow.format(stream, (SubLObject) numeric_date_utilities.$str99$__A_second_A,
							seconds.isDouble() ? number_utilities.significant_digits(seconds,
									(SubLObject) numeric_date_utilities.EIGHT_INTEGER) : seconds,
							(SubLObject) (numeric_date_utilities.ONE_INTEGER.numE(seconds)
									? numeric_date_utilities.$str25$ : numeric_date_utilities.$str95$s));
				} finally {
					reader.$read_default_float_format$.rebind(_prev_bind_0, thread);
				}
			}
			result = streams_high.get_output_stream_string(stream);
		} finally {
			final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
			try {
				Threads.$is_thread_performing_cleanupP$.bind((SubLObject) numeric_date_utilities.T, thread);
				final SubLObject _values = Values.getValuesAsVector();
				streams_high.close(stream, (SubLObject) numeric_date_utilities.UNPROVIDED);
				Values.restoreValuesFromVector(_values);
			} finally {
				Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
			}
		}
		if (numeric_date_utilities.NIL != string_utilities.empty_string_p(result)) {
			return (SubLObject) numeric_date_utilities.$str100$_0_seconds;
		}
		return result;
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 35196L)
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

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 35540L)
	public static SubLObject universal_date_p(final SubLObject v_object) {
		if (v_object.isInteger()) {
			if (v_object.isNegative()) {
				return universal_date_p(Numbers.minus(v_object));
			}
			final SubLObject day = Numbers.rem(v_object, (SubLObject) numeric_date_utilities.$int9$100);
			if (day.numLE((SubLObject) numeric_date_utilities.$int17$31)) {
				final SubLObject temp = Numbers.integerDivide(v_object, (SubLObject) numeric_date_utilities.$int9$100);
				final SubLObject month = Numbers.rem(temp, (SubLObject) numeric_date_utilities.$int9$100);
				if (numeric_date_utilities.ONE_INTEGER.numLE(month)
						&& month.numLE((SubLObject) numeric_date_utilities.TWELVE_INTEGER)) {
					return (SubLObject) numeric_date_utilities.T;
				}
			}
		}
		return (SubLObject) numeric_date_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 36104L)
	public static SubLObject get_universal_date(SubLObject universal_time, SubLObject time_zone) {
		if (universal_time == numeric_date_utilities.UNPROVIDED) {
			universal_time = Time.get_universal_time();
		}
		if (time_zone == numeric_date_utilities.UNPROVIDED) {
			time_zone = (SubLObject) numeric_date_utilities.NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert numeric_date_utilities.NIL != universal_time_p(universal_time) : universal_time;
		thread.resetMultipleValues();
		final SubLObject second = Time.decode_universal_time(universal_time, time_zone);
		final SubLObject minute = thread.secondMultipleValue();
		final SubLObject hour = thread.thirdMultipleValue();
		final SubLObject day = thread.fourthMultipleValue();
		final SubLObject month = thread.fifthMultipleValue();
		final SubLObject year = thread.sixthMultipleValue();
		thread.resetMultipleValues();
		return encode_universal_date(day, month, year);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 36511L)
	public static SubLObject today() {
		return get_universal_date((SubLObject) numeric_date_utilities.UNPROVIDED,
				(SubLObject) numeric_date_utilities.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 36610L)
	public static SubLObject yesterday() {
		return universal_date_subtract_days(today(), (SubLObject) numeric_date_utilities.ONE_INTEGER);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 36737L)
	public static SubLObject tomorrow() {
		return universal_date_add_days(today(), (SubLObject) numeric_date_utilities.ONE_INTEGER);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 36857L)
	public static SubLObject this_year() {
		return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject) numeric_date_utilities.FIVE_INTEGER),
				Time.decode_universal_time(Time.get_universal_time(), (SubLObject) numeric_date_utilities.UNPROVIDED));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 36998L)
	public static SubLObject universal_date_add_days(final SubLObject universal_date, final SubLObject days) {
		assert numeric_date_utilities.NIL != universal_date_p(universal_date) : universal_date;
		assert numeric_date_utilities.NIL != Types.integerp(days) : days;
		return universal_date_add_days_int(universal_date, days);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 37257L)
	public static SubLObject universal_date_subtract_days(final SubLObject universal_date, final SubLObject days) {
		assert numeric_date_utilities.NIL != universal_date_p(universal_date) : universal_date;
		assert numeric_date_utilities.NIL != Types.integerp(days) : days;
		return universal_date_add_days_int(universal_date, Numbers.minus(days));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 37528L)
	public static SubLObject universal_date_add_days_int(final SubLObject universal_date, final SubLObject days) {
		final SubLObject time_zone = (SubLObject) numeric_date_utilities.ZERO_INTEGER;
		final SubLObject start_time = universal_time_for_start_of_universal_date(universal_date, time_zone);
		final SubLObject offset = Numbers.multiply(numeric_date_utilities.$seconds_in_a_day$.getGlobalValue(), days);
		final SubLObject ans_start_time = Numbers.add(start_time, offset);
		return get_universal_date(ans_start_time, time_zone);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 37842L)
	public static SubLObject decode_universal_date(SubLObject universal_date) {
		if (universal_date == numeric_date_utilities.UNPROVIDED) {
			universal_date = get_universal_date((SubLObject) numeric_date_utilities.UNPROVIDED,
					(SubLObject) numeric_date_utilities.UNPROVIDED);
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert numeric_date_utilities.NIL != Types.integerp(universal_date) : universal_date;
		if (universal_date.isNegative()) {
			thread.resetMultipleValues();
			final SubLObject day = decode_universal_date(Numbers.minus(universal_date));
			final SubLObject month = thread.secondMultipleValue();
			final SubLObject year = thread.thirdMultipleValue();
			thread.resetMultipleValues();
			return Values.values(day, month, Numbers.minus(year));
		}
		final SubLObject day = Numbers.rem(universal_date, (SubLObject) numeric_date_utilities.$int9$100);
		final SubLObject month = Numbers.integerDivide(
				Numbers.rem(universal_date, (SubLObject) numeric_date_utilities.$int105$10000),
				(SubLObject) numeric_date_utilities.$int9$100);
		final SubLObject year = Numbers.integerDivide(universal_date,
				(SubLObject) numeric_date_utilities.$int105$10000);
		return Values.values(day, month, year);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 38367L)
	public static SubLObject day_from_universal_date(SubLObject universal_date) {
		if (universal_date == numeric_date_utilities.UNPROVIDED) {
			universal_date = get_universal_date((SubLObject) numeric_date_utilities.UNPROVIDED,
					(SubLObject) numeric_date_utilities.UNPROVIDED);
		}
		return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject) numeric_date_utilities.ZERO_INTEGER),
				decode_universal_date(universal_date));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 38519L)
	public static SubLObject month_from_universal_date(SubLObject universal_date) {
		if (universal_date == numeric_date_utilities.UNPROVIDED) {
			universal_date = get_universal_date((SubLObject) numeric_date_utilities.UNPROVIDED,
					(SubLObject) numeric_date_utilities.UNPROVIDED);
		}
		return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject) numeric_date_utilities.ONE_INTEGER),
				decode_universal_date(universal_date));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 38673L)
	public static SubLObject year_from_universal_date(SubLObject universal_date) {
		if (universal_date == numeric_date_utilities.UNPROVIDED) {
			universal_date = get_universal_date((SubLObject) numeric_date_utilities.UNPROVIDED,
					(SubLObject) numeric_date_utilities.UNPROVIDED);
		}
		return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject) numeric_date_utilities.TWO_INTEGER),
				decode_universal_date(universal_date));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 38826L)
	public static SubLObject encode_universal_date(final SubLObject day, final SubLObject month,
			final SubLObject year) {
		assert numeric_date_utilities.NIL != Types.integerp(day) : day;
		assert numeric_date_utilities.NIL != Numbers.plusp(day) : day;
		assert numeric_date_utilities.NIL != Types.integerp(month) : month;
		assert numeric_date_utilities.NIL != Numbers.plusp(month) : month;
		assert numeric_date_utilities.NIL != Types.integerp(year) : year;
		if (year.isNegative()) {
			return Numbers.minus(encode_universal_date(day, month, Numbers.minus(year)));
		}
		return Numbers.add(Numbers.multiply(year, (SubLObject) numeric_date_utilities.$int105$10000),
				Numbers.multiply(month, (SubLObject) numeric_date_utilities.$int9$100), day);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 39223L)
	public static SubLObject datestring(SubLObject universal_date) {
		if (universal_date == numeric_date_utilities.UNPROVIDED) {
			universal_date = get_universal_date((SubLObject) numeric_date_utilities.UNPROVIDED,
					(SubLObject) numeric_date_utilities.UNPROVIDED);
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert numeric_date_utilities.NIL != universal_date_p(universal_date) : universal_date;
		thread.resetMultipleValues();
		final SubLObject day = decode_universal_date(universal_date);
		final SubLObject month = thread.secondMultipleValue();
		final SubLObject year = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		return encode_datestring(day, month, year);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 39600L)
	public static SubLObject datestringL(final SubLObject datestring1, final SubLObject datestring2) {
		if (datestring_year(datestring1).numL(datestring_year(datestring2))) {
			return (SubLObject) numeric_date_utilities.T;
		}
		if (datestring_year(datestring2).numL(datestring_year(datestring1))) {
			return (SubLObject) numeric_date_utilities.NIL;
		}
		if (datestring_month(datestring1).numL(datestring_month(datestring2))) {
			return (SubLObject) numeric_date_utilities.T;
		}
		if (datestring_month(datestring2).numL(datestring_month(datestring1))) {
			return (SubLObject) numeric_date_utilities.NIL;
		}
		if (datestring_day(datestring1).numL(datestring_day(datestring2))) {
			return (SubLObject) numeric_date_utilities.T;
		}
		return (SubLObject) numeric_date_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 40223L)
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
		return Numbers.subtract(encode_universal_date(day1, month1, year1), encode_universal_date(day2, month2, year2));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 40628L)
	public static SubLObject datestring_year(final SubLObject datestring) {
		return string_utilities.string_to_integer(string_utilities.substring(datestring,
				(SubLObject) numeric_date_utilities.SIX_INTEGER, (SubLObject) numeric_date_utilities.TEN_INTEGER));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 40731L)
	public static SubLObject datestring_month(final SubLObject datestring) {
		return string_utilities.string_to_integer(string_utilities.substring(datestring,
				(SubLObject) numeric_date_utilities.ZERO_INTEGER, (SubLObject) numeric_date_utilities.TWO_INTEGER));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 40834L)
	public static SubLObject datestring_day(final SubLObject datestring) {
		return string_utilities.string_to_integer(string_utilities.substring(datestring,
				(SubLObject) numeric_date_utilities.THREE_INTEGER, (SubLObject) numeric_date_utilities.FIVE_INTEGER));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 40935L)
	public static SubLObject encode_datestring(final SubLObject day, final SubLObject month, final SubLObject year) {
		assert numeric_date_utilities.NIL != Types.integerp(day) : day;
		assert numeric_date_utilities.NIL != Numbers.plusp(day) : day;
		assert numeric_date_utilities.NIL != Types.integerp(month) : month;
		assert numeric_date_utilities.NIL != Numbers.plusp(month) : month;
		assert numeric_date_utilities.NIL != Types.integerp(year) : year;
		if (!year.isNegative() && year.numL((SubLObject) numeric_date_utilities.$int105$10000)) {
			return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$str107$_2__0d__2__0d__4__0d,
					new SubLObject[] { month, day, year });
		}
		if (!year.isNegative()) {
			return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
					(SubLObject) numeric_date_utilities.$str108$_2__0d__2__0d__d,
					new SubLObject[] { month, day, year });
		}
		return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
				(SubLObject) numeric_date_utilities.$str109$_2__0d__2__0d___d,
				new SubLObject[] { month, day, Numbers.minus(year) });
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 41530L)
	public static SubLObject decode_datestring(final SubLObject datestring) {
		return Values.values(datestring_day(datestring), datestring_month(datestring), datestring_year(datestring));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 41698L)
	public static SubLObject month_ago(SubLObject universal_date, SubLObject n) {
		if (universal_date == numeric_date_utilities.UNPROVIDED) {
			universal_date = get_universal_date((SubLObject) numeric_date_utilities.UNPROVIDED,
					(SubLObject) numeric_date_utilities.UNPROVIDED);
		}
		if (n == numeric_date_utilities.UNPROVIDED) {
			n = (SubLObject) numeric_date_utilities.ONE_INTEGER;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert numeric_date_utilities.NIL != universal_date_p(universal_date) : universal_date;
		thread.resetMultipleValues();
		final SubLObject day = decode_universal_date(universal_date);
		SubLObject month = thread.secondMultipleValue();
		SubLObject year = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		month = Numbers.subtract(month, n);
		if (!month.numG((SubLObject) numeric_date_utilities.ZERO_INTEGER)) {
			year = Numbers.subtract(year, (SubLObject) numeric_date_utilities.ONE_INTEGER);
			month = Numbers.add(month, numeric_date_utilities.$months_in_a_year$.getGlobalValue());
		}
		return encode_universal_date(day, month, year);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 42068L)
	public static SubLObject get_julian_date(SubLObject universal_time, SubLObject precision) {
		if (universal_time == numeric_date_utilities.UNPROVIDED) {
			universal_time = Time.get_universal_time();
		}
		if (precision == numeric_date_utilities.UNPROVIDED) {
			precision = (SubLObject) numeric_date_utilities.$kw110$FLOAT;
		}
		assert numeric_date_utilities.NIL != universal_time_p(universal_time) : universal_time;
		final SubLObject days = universal_days(universal_time, precision);
		return Numbers.add(days, julian_offset(precision));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 43046L)
	public static SubLObject julian_date_from_universal_date(final SubLObject universal_date, SubLObject afternoonP) {
		if (afternoonP == numeric_date_utilities.UNPROVIDED) {
			afternoonP = (SubLObject) numeric_date_utilities.NIL;
		}
		assert numeric_date_utilities.NIL != universal_date_p(universal_date) : universal_date;
		SubLObject universal_time = universal_time_for_start_of_universal_date(universal_date,
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		if (numeric_date_utilities.NIL != afternoonP) {
			universal_time = Numbers.add(universal_time,
					Numbers.multiply((SubLObject) numeric_date_utilities.TWELVE_INTEGER,
							numeric_date_utilities.$seconds_in_an_hour$.getGlobalValue()));
		}
		return get_julian_date(universal_time, (SubLObject) numeric_date_utilities.$kw111$INTEGER);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 43907L)
	public static SubLObject julian_offset(final SubLObject precision) {
		if (numeric_date_utilities.NIL == list_utilities.alist_lookup(
				numeric_date_utilities.$julian_offsets$.getGlobalValue(), precision,
				(SubLObject) numeric_date_utilities.UNPROVIDED, (SubLObject) numeric_date_utilities.UNPROVIDED)) {
			numeric_date_utilities.$julian_offsets$.setGlobalValue(
					list_utilities.alist_enter(numeric_date_utilities.$julian_offsets$.getGlobalValue(), precision,
							compute_julian_offset(precision), (SubLObject) numeric_date_utilities.UNPROVIDED));
		}
		return list_utilities.alist_lookup(numeric_date_utilities.$julian_offsets$.getGlobalValue(), precision,
				(SubLObject) numeric_date_utilities.UNPROVIDED, (SubLObject) numeric_date_utilities.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 44208L)
	public static SubLObject compute_julian_offset(final SubLObject precision) {
		SubLObject current;
		final SubLObject datum = current = numeric_date_utilities.$julian_date_reference$.getGlobalValue();
		SubLObject reference_universal_date = (SubLObject) numeric_date_utilities.NIL;
		SubLObject reference_julian_date = (SubLObject) numeric_date_utilities.NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) numeric_date_utilities.$list114);
		reference_universal_date = current.first();
		current = (reference_julian_date = current.rest());
		final SubLObject universal_time = universal_time_for_start_of_universal_date(reference_universal_date,
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject universal_date_days = universal_days(universal_time, precision);
		final SubLObject raw_offset = Numbers.subtract(reference_julian_date, universal_date_days);
		return (precision == numeric_date_utilities.$kw111$INTEGER)
				? Numbers.floor(raw_offset, (SubLObject) numeric_date_utilities.UNPROVIDED) : raw_offset;
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 44735L)
	public static SubLObject universal_time_for_start_of_universal_date(final SubLObject universal_date,
			SubLObject time_zone) {
		if (time_zone == numeric_date_utilities.UNPROVIDED) {
			time_zone = (SubLObject) numeric_date_utilities.ZERO_INTEGER;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject day = decode_universal_date(universal_date);
		final SubLObject month = thread.secondMultipleValue();
		final SubLObject year = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		return Time.encode_universal_time((SubLObject) numeric_date_utilities.ZERO_INTEGER,
				(SubLObject) numeric_date_utilities.ZERO_INTEGER, (SubLObject) numeric_date_utilities.ZERO_INTEGER, day,
				month, year, time_zone);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 45072L)
	public static SubLObject universal_days(final SubLObject universal_time, final SubLObject precision) {
		if (precision.eql((SubLObject) numeric_date_utilities.$kw111$INTEGER)) {
			return Numbers.integerDivide(
					Numbers.add(universal_time,
							Numbers.multiply(numeric_date_utilities.$seconds_in_an_hour$.getGlobalValue(),
									(SubLObject) numeric_date_utilities.TWELVE_INTEGER)),
					numeric_date_utilities.$seconds_in_a_day$.getGlobalValue());
		}
		return Numbers.divide(universal_time, numeric_date_utilities.$seconds_in_a_day$.getGlobalValue());
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 45414L)
	public static SubLObject universal_second_p(final SubLObject v_object) {
		if (v_object.isInteger() && !v_object.isNegative()
				&& v_object.numLE((SubLObject) numeric_date_utilities.$int115$235959)
				&& Numbers.rem(v_object, (SubLObject) numeric_date_utilities.$int9$100)
						.numL(numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue())) {
			SubLObject temp = Numbers.integerDivide(v_object, (SubLObject) numeric_date_utilities.$int9$100);
			if (Numbers.rem(temp, (SubLObject) numeric_date_utilities.$int9$100)
					.numL(numeric_date_utilities.$minutes_in_an_hour$.getGlobalValue())) {
				temp = Numbers.integerDivide(temp, (SubLObject) numeric_date_utilities.$int9$100);
				if (temp.numL(numeric_date_utilities.$hours_in_a_day$.getGlobalValue())) {
					return (SubLObject) numeric_date_utilities.T;
				}
			}
		}
		return (SubLObject) numeric_date_utilities.NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 46014L)
	public static SubLObject get_universal_second(SubLObject universal_time) {
		if (universal_time == numeric_date_utilities.UNPROVIDED) {
			universal_time = Time.get_universal_time();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert numeric_date_utilities.NIL != universal_time_p(universal_time) : universal_time;
		thread.resetMultipleValues();
		final SubLObject second = Time.decode_universal_time(universal_time,
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject minute = thread.secondMultipleValue();
		final SubLObject hour = thread.thirdMultipleValue();
		final SubLObject day = thread.fourthMultipleValue();
		final SubLObject month = thread.fifthMultipleValue();
		final SubLObject year = thread.sixthMultipleValue();
		thread.resetMultipleValues();
		return encode_universal_second(second, minute, hour);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 46425L)
	public static SubLObject decode_universal_second(SubLObject universal_second) {
		if (universal_second == numeric_date_utilities.UNPROVIDED) {
			universal_second = get_universal_second((SubLObject) numeric_date_utilities.UNPROVIDED);
		}
		assert numeric_date_utilities.NIL != Types.integerp(universal_second) : universal_second;
		SubLObject temp = universal_second;
		SubLObject second = (SubLObject) numeric_date_utilities.NIL;
		SubLObject minute = (SubLObject) numeric_date_utilities.NIL;
		SubLObject hour = (SubLObject) numeric_date_utilities.NIL;
		second = Numbers.rem(temp, (SubLObject) numeric_date_utilities.$int9$100);
		temp = Numbers.integerDivide(temp, (SubLObject) numeric_date_utilities.$int9$100);
		minute = Numbers.rem(temp, (SubLObject) numeric_date_utilities.$int9$100);
		temp = (hour = Numbers.integerDivide(temp, (SubLObject) numeric_date_utilities.$int9$100));
		return Values.values(second, minute, hour);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 46879L)
	public static SubLObject encode_universal_second(final SubLObject second, final SubLObject minute,
			final SubLObject hour) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert numeric_date_utilities.NIL != Types.integerp(second) : second;
		assert numeric_date_utilities.NIL != Types.integerp(minute) : minute;
		assert numeric_date_utilities.NIL != Types.integerp(hour) : hour;
		if (numeric_date_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
				&& (!numeric_date_utilities.ZERO_INTEGER.numLE(second)
						|| !second.numLE((SubLObject) numeric_date_utilities.$int19$59))) {
			Errors.error((SubLObject) numeric_date_utilities.$str116$second__S_not_in_the_range_0_59, second);
		}
		if (numeric_date_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
				&& (!numeric_date_utilities.ZERO_INTEGER.numLE(minute)
						|| !minute.numLE((SubLObject) numeric_date_utilities.$int19$59))) {
			Errors.error((SubLObject) numeric_date_utilities.$str117$minute__S_not_in_the_range_0_59, minute);
		}
		if (numeric_date_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
				&& (!numeric_date_utilities.ZERO_INTEGER.numLE(hour)
						|| !hour.numLE((SubLObject) numeric_date_utilities.$int19$59))) {
			Errors.error((SubLObject) numeric_date_utilities.$str118$hour__S_not_in_the_range_0_59, hour);
		}
		return Numbers.add(Numbers.multiply(hour, (SubLObject) numeric_date_utilities.$int105$10000),
				Numbers.multiply(minute, (SubLObject) numeric_date_utilities.$int9$100), second);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 47422L)
	public static SubLObject secondstring(SubLObject universal_second) {
		if (universal_second == numeric_date_utilities.UNPROVIDED) {
			universal_second = get_universal_second((SubLObject) numeric_date_utilities.UNPROVIDED);
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert numeric_date_utilities.NIL != universal_second_p(universal_second) : universal_second;
		thread.resetMultipleValues();
		final SubLObject second = decode_universal_second(universal_second);
		final SubLObject minute = thread.secondMultipleValue();
		final SubLObject hour = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		return encode_secondstring(second, minute, hour);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 47840L)
	public static SubLObject encode_secondstring(final SubLObject second, final SubLObject minute,
			final SubLObject hour) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert numeric_date_utilities.NIL != Types.integerp(second) : second;
		assert numeric_date_utilities.NIL != Types.integerp(minute) : minute;
		assert numeric_date_utilities.NIL != Types.integerp(hour) : hour;
		if (numeric_date_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
				&& (!numeric_date_utilities.ZERO_INTEGER.numLE(second)
						|| !second.numLE((SubLObject) numeric_date_utilities.$int19$59))) {
			Errors.error((SubLObject) numeric_date_utilities.$str116$second__S_not_in_the_range_0_59, second);
		}
		if (numeric_date_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
				&& (!numeric_date_utilities.ZERO_INTEGER.numLE(minute)
						|| !minute.numLE((SubLObject) numeric_date_utilities.$int19$59))) {
			Errors.error((SubLObject) numeric_date_utilities.$str117$minute__S_not_in_the_range_0_59, minute);
		}
		if (numeric_date_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
				&& (!numeric_date_utilities.ZERO_INTEGER.numLE(hour)
						|| !hour.numLE((SubLObject) numeric_date_utilities.$int19$59))) {
			Errors.error((SubLObject) numeric_date_utilities.$str118$hour__S_not_in_the_range_0_59, hour);
		}
		return Sequences.cconcatenate(
				format_nil.format_nil_a_no_copy((SubLObject) (hour.numL((SubLObject) numeric_date_utilities.TEN_INTEGER)
						? numeric_date_utilities.$str120$0 : numeric_date_utilities.$str25$)),
				new SubLObject[] { format_nil.format_nil_a_no_copy(hour), numeric_date_utilities.$str121$_,
						format_nil.format_nil_a_no_copy(
								(SubLObject) (minute.numL((SubLObject) numeric_date_utilities.TEN_INTEGER)
										? numeric_date_utilities.$str120$0 : numeric_date_utilities.$str25$)),
						format_nil.format_nil_a_no_copy(minute), numeric_date_utilities.$str121$_,
						format_nil.format_nil_a_no_copy(
								(SubLObject) (second.numL((SubLObject) numeric_date_utilities.TEN_INTEGER)
										? numeric_date_utilities.$str120$0 : numeric_date_utilities.$str25$)),
						format_nil.format_nil_a_no_copy(second) });
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 48469L)
	public static SubLObject decode_secondstring(final SubLObject secondstring) {
		return Values.values(secondstring_second(secondstring), secondstring_minute(secondstring),
				secondstring_hour(secondstring));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 48657L)
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
		return Numbers.add(Numbers.subtract(second1, second2),
				Numbers.multiply(numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue(),
						Numbers.subtract(minute1, minute2)),
				Numbers.multiply(numeric_date_utilities.$seconds_in_an_hour$.getGlobalValue(),
						Numbers.subtract(hour1, hour2)));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 49121L)
	public static SubLObject secondstring_hour(final SubLObject secondstring) {
		return string_utilities.string_to_integer(string_utilities.substring(secondstring,
				(SubLObject) numeric_date_utilities.ZERO_INTEGER, (SubLObject) numeric_date_utilities.TWO_INTEGER));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 49229L)
	public static SubLObject secondstring_minute(final SubLObject secondstring) {
		return string_utilities.string_to_integer(string_utilities.substring(secondstring,
				(SubLObject) numeric_date_utilities.THREE_INTEGER, (SubLObject) numeric_date_utilities.FIVE_INTEGER));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 49339L)
	public static SubLObject secondstring_second(final SubLObject secondstring) {
		return string_utilities.string_to_integer(string_utilities.substring(secondstring,
				(SubLObject) numeric_date_utilities.SIX_INTEGER, (SubLObject) numeric_date_utilities.EIGHT_INTEGER));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 49449L)
	public static SubLObject encode_millisecondstring(final SubLObject hour, final SubLObject minute, SubLObject second,
			SubLObject millisecond) {
		if (second == numeric_date_utilities.UNPROVIDED) {
			second = (SubLObject) numeric_date_utilities.ZERO_INTEGER;
		}
		if (millisecond == numeric_date_utilities.UNPROVIDED) {
			millisecond = (SubLObject) numeric_date_utilities.ZERO_INTEGER;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert numeric_date_utilities.NIL != Types.integerp(millisecond) : millisecond;
		assert numeric_date_utilities.NIL != Types.integerp(second) : second;
		assert numeric_date_utilities.NIL != Types.integerp(minute) : minute;
		assert numeric_date_utilities.NIL != Types.integerp(hour) : hour;
		if (numeric_date_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
				&& (!numeric_date_utilities.ZERO_INTEGER.numLE(millisecond)
						|| !millisecond.numLE((SubLObject) numeric_date_utilities.$int122$999))) {
			Errors.error((SubLObject) numeric_date_utilities.$str123$second__S_not_in_the_range_0_999, second);
		}
		if (numeric_date_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
				&& (!numeric_date_utilities.ZERO_INTEGER.numLE(second)
						|| !second.numLE((SubLObject) numeric_date_utilities.$int19$59))) {
			Errors.error((SubLObject) numeric_date_utilities.$str116$second__S_not_in_the_range_0_59, second);
		}
		if (numeric_date_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
				&& (!numeric_date_utilities.ZERO_INTEGER.numLE(minute)
						|| !minute.numLE((SubLObject) numeric_date_utilities.$int19$59))) {
			Errors.error((SubLObject) numeric_date_utilities.$str117$minute__S_not_in_the_range_0_59, minute);
		}
		if (numeric_date_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)
				&& (!numeric_date_utilities.ZERO_INTEGER.numLE(hour)
						|| !hour.numLE((SubLObject) numeric_date_utilities.$int19$59))) {
			Errors.error((SubLObject) numeric_date_utilities.$str118$hour__S_not_in_the_range_0_59, hour);
		}
		return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
				(SubLObject) numeric_date_utilities.$str124$_2__0d__2__0d__2__0d__3__0d,
				new SubLObject[] { hour, minute, second, millisecond });
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 50196L)
	public static SubLObject universal_date_and_second_from_time(SubLObject universal_time) {
		if (universal_time == numeric_date_utilities.UNPROVIDED) {
			universal_time = Time.get_universal_time();
		}
		assert numeric_date_utilities.NIL != universal_time_p(universal_time) : universal_time;
		return Values.values(get_universal_date(universal_time, (SubLObject) numeric_date_utilities.UNPROVIDED),
				get_universal_second(universal_time));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 50445L)
	public static SubLObject universal_time_from_date_and_second(final SubLObject universal_date,
			SubLObject universal_second) {
		if (universal_second == numeric_date_utilities.UNPROVIDED) {
			universal_second = (SubLObject) numeric_date_utilities.ZERO_INTEGER;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert numeric_date_utilities.NIL != universal_date_p(universal_date) : universal_date;
		assert numeric_date_utilities.NIL != universal_second_p(universal_second) : universal_second;
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
		return Time.encode_universal_time(second, minute, hour, day, month, year,
				(SubLObject) numeric_date_utilities.UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 50893L)
	public static SubLObject get_utc_time_with_milliseconds() {
		final SubLObject internal_real_time = Time.get_internal_real_time();
		final SubLObject universal_time = Time.get_universal_time();
		final SubLObject divisor = Numbers.divide(time_high.$internal_time_units_per_second$.getGlobalValue(),
				(SubLObject) numeric_date_utilities.$int1$1000);
		final SubLObject internal_real_time_in_milliseconds = Numbers
				.truncate(Numbers.divide(internal_real_time, divisor), (SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject milliseconds = Numbers.rem(internal_real_time_in_milliseconds,
				(SubLObject) numeric_date_utilities.$int1$1000);
		final SubLObject time_in_milliseconds = Numbers
				.add(Numbers.multiply(universal_time, (SubLObject) numeric_date_utilities.$int1$1000), milliseconds);
		return time_in_milliseconds;
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 51669L)
	public static SubLObject get_universal_millisecond(SubLObject internal_time) {
		if (internal_time == numeric_date_utilities.UNPROVIDED) {
			internal_time = Time.get_internal_real_time();
		}
		final SubLObject divisor = Numbers.divide(time_high.$internal_time_units_per_second$.getGlobalValue(),
				(SubLObject) numeric_date_utilities.$int1$1000);
		final SubLObject internal_real_time_in_milliseconds = Numbers.truncate(Numbers.divide(internal_time, divisor),
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject milliseconds = Numbers.rem(internal_real_time_in_milliseconds,
				(SubLObject) numeric_date_utilities.$int1$1000);
		final SubLObject universal_second = get_universal_second((SubLObject) numeric_date_utilities.UNPROVIDED);
		return Numbers.add(Numbers.multiply((SubLObject) numeric_date_utilities.$int1$1000, universal_second),
				milliseconds);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 52171L)
	public static SubLObject get_internal_real_time_ms() {
		if (time_high.$internal_time_units_per_second$.getGlobalValue()
				.eql(numeric_date_utilities.$milliseconds_in_a_second$.getGlobalValue())) {
			return Time.get_internal_real_time();
		}
		if (time_high.$internal_time_units_per_second$.getGlobalValue()
				.eql(Numbers.multiply(numeric_date_utilities.$microseconds_in_a_millisecond$.getGlobalValue(),
						numeric_date_utilities.$milliseconds_in_a_second$.getGlobalValue()))) {
			return number_utilities.div(Time.get_internal_real_time(),
					numeric_date_utilities.$microseconds_in_a_millisecond$.getGlobalValue());
		}
		return number_utilities.div(Time.get_internal_real_time(),
				number_utilities.div(time_high.$internal_time_units_per_second$.getGlobalValue(),
						numeric_date_utilities.$milliseconds_in_a_second$.getGlobalValue()));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 52625L)
	public static SubLObject extended_universal_date_p(final SubLObject v_object) {
		if (!v_object.isInteger()) {
			return (SubLObject) numeric_date_utilities.NIL;
		}
		if (v_object.isNegative()) {
			return extended_universal_date_p(Numbers.minus(v_object));
		}
		final SubLObject second = Numbers.rem(v_object, (SubLObject) numeric_date_utilities.$int9$100);
		final SubLObject minute = Numbers.integerDivide(
				Numbers.rem(v_object, (SubLObject) numeric_date_utilities.$int105$10000),
				(SubLObject) numeric_date_utilities.$int9$100);
		final SubLObject hour = Numbers.integerDivide(
				Numbers.rem(v_object, (SubLObject) numeric_date_utilities.$int0$1000000),
				(SubLObject) numeric_date_utilities.$int105$10000);
		final SubLObject day = Numbers.integerDivide(
				Numbers.rem(v_object, (SubLObject) numeric_date_utilities.$int125$100000000),
				(SubLObject) numeric_date_utilities.$int0$1000000);
		final SubLObject month = Numbers.integerDivide(
				Numbers.rem(v_object, (SubLObject) numeric_date_utilities.$int126$10000000000),
				(SubLObject) numeric_date_utilities.$int125$100000000);
		return (SubLObject) SubLObjectFactory.makeBoolean(second.numLE((SubLObject) numeric_date_utilities.$int7$60)
				&& minute.numLE((SubLObject) numeric_date_utilities.$int7$60)
				&& hour.numLE((SubLObject) numeric_date_utilities.$int18$23)
				&& day.numGE((SubLObject) numeric_date_utilities.ONE_INTEGER)
				&& day.numLE((SubLObject) numeric_date_utilities.$int17$31)
				&& month.numGE((SubLObject) numeric_date_utilities.ONE_INTEGER)
				&& month.numLE((SubLObject) numeric_date_utilities.TWELVE_INTEGER));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 53420L)
	public static SubLObject get_extended_universal_date(SubLObject universal_time) {
		if (universal_time == numeric_date_utilities.UNPROVIDED) {
			universal_time = Time.get_universal_time();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert numeric_date_utilities.NIL != universal_time_p(universal_time) : universal_time;
		thread.resetMultipleValues();
		final SubLObject second = Time.decode_universal_time(universal_time,
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject minute = thread.secondMultipleValue();
		final SubLObject hour = thread.thirdMultipleValue();
		final SubLObject day = thread.fourthMultipleValue();
		final SubLObject month = thread.fifthMultipleValue();
		final SubLObject year = thread.sixthMultipleValue();
		thread.resetMultipleValues();
		return encode_extended_universal_date(second, minute, hour, day, month, year);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 53745L)
	public static SubLObject encode_extended_universal_date(final SubLObject second, final SubLObject minute,
			final SubLObject hour, final SubLObject day, final SubLObject month, final SubLObject year) {
		if (year.isNegative()) {
			return Numbers.minus(encode_extended_universal_date(second, minute, hour, day, month, Numbers.minus(year)));
		}
		final SubLObject universal_date = encode_universal_date(day, month, year);
		final SubLObject universal_second = encode_universal_second(second, minute, hour);
		return Numbers.add(Numbers.multiply(universal_date, (SubLObject) numeric_date_utilities.$int0$1000000),
				universal_second);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 54138L)
	public static SubLObject decode_extended_universal_date(SubLObject extended_universal_date) {
		if (extended_universal_date == numeric_date_utilities.UNPROVIDED) {
			extended_universal_date = get_extended_universal_date((SubLObject) numeric_date_utilities.UNPROVIDED);
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert numeric_date_utilities.NIL != Types.integerp(extended_universal_date) : extended_universal_date;
		if (extended_universal_date.isNegative()) {
			thread.resetMultipleValues();
			final SubLObject second = decode_extended_universal_date(Numbers.minus(extended_universal_date));
			final SubLObject minute = thread.secondMultipleValue();
			final SubLObject hour = thread.thirdMultipleValue();
			final SubLObject day = thread.fourthMultipleValue();
			final SubLObject month = thread.fifthMultipleValue();
			final SubLObject year = thread.sixthMultipleValue();
			thread.resetMultipleValues();
			return Values.values(second, minute, hour, day, month, Numbers.minus(year));
		}
		final SubLObject universal_second = Numbers.rem(extended_universal_date,
				(SubLObject) numeric_date_utilities.$int0$1000000);
		final SubLObject universal_date = Numbers.integerDivide(extended_universal_date,
				(SubLObject) numeric_date_utilities.$int0$1000000);
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
		return Values.values(second2, minute2, hour2, day2, month2, year2);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 54906L)
	public static SubLObject encode_universal_time_for_extended_universal_date(final SubLObject date,
			SubLObject time_zone) {
		if (time_zone == numeric_date_utilities.UNPROVIDED) {
			time_zone = (SubLObject) numeric_date_utilities.SIX_INTEGER;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = (SubLObject) numeric_date_utilities.NIL;
		thread.resetMultipleValues();
		final SubLObject second = decode_extended_universal_date(date);
		final SubLObject minute = thread.secondMultipleValue();
		final SubLObject hour = thread.thirdMultipleValue();
		final SubLObject day = thread.fourthMultipleValue();
		final SubLObject month = thread.fifthMultipleValue();
		final SubLObject year = thread.sixthMultipleValue();
		thread.resetMultipleValues();
		result = Time.encode_universal_time(second, minute, hour, day, month, year, time_zone);
		return result;
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 55441L)
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
		final SubLObject new_year = adjust_year_month_day_hour_min_sec(year, month, day, hour, minute,
				Numbers.subtract(second, (SubLObject) numeric_date_utilities.ONE_INTEGER));
		final SubLObject new_month = thread.secondMultipleValue();
		final SubLObject new_day = thread.thirdMultipleValue();
		final SubLObject new_hour = thread.fourthMultipleValue();
		final SubLObject new_minute = thread.fifthMultipleValue();
		final SubLObject new_second = thread.sixthMultipleValue();
		thread.resetMultipleValues();
		return encode_extended_universal_date(new_second, new_minute, new_hour, new_day, new_month, new_year);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 55910L)
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
		final SubLObject new_year = adjust_year_month_day_hour_min_sec(year, month, day, hour, minute,
				Numbers.add(second, (SubLObject) numeric_date_utilities.ONE_INTEGER));
		final SubLObject new_month = thread.secondMultipleValue();
		final SubLObject new_day = thread.thirdMultipleValue();
		final SubLObject new_hour = thread.fourthMultipleValue();
		final SubLObject new_minute = thread.fifthMultipleValue();
		final SubLObject new_second = thread.sixthMultipleValue();
		thread.resetMultipleValues();
		return encode_extended_universal_date(new_second, new_minute, new_hour, new_day, new_month, new_year);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 56380L)
	public static SubLObject extended_universal_dateL(final SubLObject eu_date1, final SubLObject eu_date2) {
		if (!eu_date1.isNegative() || !eu_date2.isNegative()) {
			return Numbers.numL(eu_date1, eu_date2);
		}
		final SubLObject year1 = Numbers.integerDivide(eu_date1,
				(SubLObject) numeric_date_utilities.$int126$10000000000);
		final SubLObject year2 = Numbers.integerDivide(eu_date2,
				(SubLObject) numeric_date_utilities.$int126$10000000000);
		if (year1.numE(year2)) {
			final SubLObject second_within_year1 = Numbers
					.abs(Numbers.rem(eu_date1, (SubLObject) numeric_date_utilities.$int126$10000000000));
			final SubLObject second_within_year2 = Numbers
					.abs(Numbers.rem(eu_date2, (SubLObject) numeric_date_utilities.$int126$10000000000));
			return Numbers.numL(second_within_year1, second_within_year2);
		}
		return Numbers.numL(year1, year2);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 56874L)
	public static SubLObject adjust_year_month_day(SubLObject year, SubLObject month, SubLObject day) {
		while ((month.isInteger() && (!month.numLE((SubLObject) numeric_date_utilities.TWELVE_INTEGER)
				|| !month.numG((SubLObject) numeric_date_utilities.ZERO_INTEGER)))
				|| (day.isInteger() && (!day.numLE(days_in_month_number(month, year))
						|| !day.numG((SubLObject) numeric_date_utilities.ZERO_INTEGER)))) {
			if (month.isInteger() && year.isInteger()
					&& !month.numLE((SubLObject) numeric_date_utilities.TWELVE_INTEGER)) {
				month = Numbers.subtract(month, (SubLObject) numeric_date_utilities.TWELVE_INTEGER);
				year = Numbers.add(year, (SubLObject) numeric_date_utilities.ONE_INTEGER);
			} else if (month.isInteger() && year.isInteger()
					&& !month.numG((SubLObject) numeric_date_utilities.ZERO_INTEGER)) {
				month = Numbers.add(month, (SubLObject) numeric_date_utilities.TWELVE_INTEGER);
				year = Numbers.subtract(year, (SubLObject) numeric_date_utilities.ONE_INTEGER);
			} else if (day.isInteger() && month.isInteger() && year.isInteger()
					&& !day.numLE(days_in_month_number(month, year))) {
				day = Numbers.subtract(day, days_in_month_number(month, year));
				month = Numbers.add(month, (SubLObject) numeric_date_utilities.ONE_INTEGER);
			} else if (day.isInteger() && month.isInteger() && year.isInteger()
					&& !day.numG((SubLObject) numeric_date_utilities.ZERO_INTEGER)) {
				month = Numbers.subtract(month, (SubLObject) numeric_date_utilities.ONE_INTEGER);
				if (month.numE((SubLObject) numeric_date_utilities.ZERO_INTEGER)) {
					year = Numbers.subtract(year, (SubLObject) numeric_date_utilities.ONE_INTEGER);
					month = Numbers.add(month, (SubLObject) numeric_date_utilities.TWELVE_INTEGER);
				}
				day = Numbers.add(day, days_in_month_number(month, year));
			} else {
				Errors.error((SubLObject) numeric_date_utilities.$str127$MM_DD_YY_adjust_problem___s__s__s, month, day,
						year);
			}
		}
		return Values.values(year, month, day);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 57940L)
	public static SubLObject adjust_year_month_day_hour_min_sec(final SubLObject year, final SubLObject month,
			SubLObject day, SubLObject hour, SubLObject min, SubLObject sec) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (numeric_date_utilities.NIL != sec) {
			if (sec.numL((SubLObject) numeric_date_utilities.ZERO_INTEGER)) {
				min = Numbers.add(min,
						Numbers.subtract(
								Numbers.integerDivide(sec,
										numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue()),
								(SubLObject) numeric_date_utilities.ONE_INTEGER));
			} else {
				min = Numbers.add(min,
						Numbers.integerDivide(sec, numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue()));
			}
			sec = Numbers.mod(sec, numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue());
		}
		if (numeric_date_utilities.NIL != min) {
			if (min.numL((SubLObject) numeric_date_utilities.ZERO_INTEGER)) {
				hour = Numbers.add(hour,
						Numbers.subtract(
								Numbers.integerDivide(min,
										numeric_date_utilities.$minutes_in_an_hour$.getGlobalValue()),
								(SubLObject) numeric_date_utilities.ONE_INTEGER));
			} else {
				hour = Numbers.add(hour,
						Numbers.integerDivide(min, numeric_date_utilities.$minutes_in_an_hour$.getGlobalValue()));
			}
			min = Numbers.mod(min, numeric_date_utilities.$minutes_in_an_hour$.getGlobalValue());
		}
		if (numeric_date_utilities.NIL != hour) {
			if (hour.numL((SubLObject) numeric_date_utilities.ZERO_INTEGER)) {
				day = Numbers.add(day,
						Numbers.subtract(
								Numbers.integerDivide(hour, numeric_date_utilities.$hours_in_a_day$.getGlobalValue()),
								(SubLObject) numeric_date_utilities.ONE_INTEGER));
			} else {
				day = Numbers.add(day,
						Numbers.integerDivide(hour, numeric_date_utilities.$hours_in_a_day$.getGlobalValue()));
			}
			hour = Numbers.mod(hour, numeric_date_utilities.$hours_in_a_day$.getGlobalValue());
		}
		thread.resetMultipleValues();
		final SubLObject final_year = adjust_year_month_day(year, month, day);
		final SubLObject final_month = thread.secondMultipleValue();
		final SubLObject final_day = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		return Values.values(final_year, final_month, final_day, hour, min, sec);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 58781L)
	public static SubLObject leap_year_p(final SubLObject year) {
		assert numeric_date_utilities.NIL != Types.integerp(year) : year;
		return (SubLObject) SubLObjectFactory.makeBoolean(numeric_date_utilities.NIL != number_utilities
				.divides_evenly(year, (SubLObject) numeric_date_utilities.FOUR_INTEGER)
				&& (numeric_date_utilities.NIL == number_utilities.divides_evenly(year,
						(SubLObject) numeric_date_utilities.$int9$100)
						|| numeric_date_utilities.NIL != number_utilities.divides_evenly(year,
								(SubLObject) numeric_date_utilities.$int128$400)));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 59258L)
	public static SubLObject usual_days_in_month_number(final SubLObject month) {
		return ConsesLow.nth(Numbers.subtract(month, (SubLObject) numeric_date_utilities.ONE_INTEGER),
				numeric_date_utilities.$month_duration_table$.getGlobalValue());
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 59649L)
	public static SubLObject days_in_month_number(final SubLObject month, final SubLObject year) {
		if (year.isInteger() && month.numE((SubLObject) numeric_date_utilities.TWO_INTEGER)
				&& numeric_date_utilities.NIL != leap_year_p(year)) {
			return Numbers.add((SubLObject) numeric_date_utilities.ONE_INTEGER, usual_days_in_month_number(month));
		}
		return usual_days_in_month_number(month);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 60187L)
	public static SubLObject total_days_in_months_preceding(final SubLObject month, final SubLObject year) {
		SubLObject total = (SubLObject) numeric_date_utilities.ZERO_INTEGER;
		SubLObject doneP = (SubLObject) numeric_date_utilities.NIL;
		SubLObject list_var = (SubLObject) numeric_date_utilities.NIL;
		SubLObject days = (SubLObject) numeric_date_utilities.NIL;
		SubLObject num = (SubLObject) numeric_date_utilities.NIL;
		list_var = numeric_date_utilities.$month_duration_table$.getGlobalValue();
		days = list_var.first();
		for (num = (SubLObject) numeric_date_utilities.ZERO_INTEGER; numeric_date_utilities.NIL == doneP
				&& numeric_date_utilities.NIL != list_var; list_var = list_var.rest(), days = list_var
						.first(), num = Numbers.add((SubLObject) numeric_date_utilities.ONE_INTEGER, num)) {
			if (number_utilities.f_1X(num).numE(month)) {
				doneP = (SubLObject) numeric_date_utilities.T;
			} else {
				total = Numbers.add(total, days);
			}
		}
		if (month.numG((SubLObject) numeric_date_utilities.TWO_INTEGER)
				&& numeric_date_utilities.NIL != leap_year_p(year)) {
			total = Numbers.add(total, (SubLObject) numeric_date_utilities.ONE_INTEGER);
		}
		return total;
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 60770L)
	public static SubLObject day_of_week_number_abbrev(final SubLObject number) {
		return list_utilities.alist_lookup_without_values(numeric_date_utilities.$number_wkday_table$.getGlobalValue(),
				number, Symbols.symbol_function((SubLObject) numeric_date_utilities.EQ),
				(SubLObject) numeric_date_utilities.NIL);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 61171L)
	public static SubLObject month_number_abbrev(final SubLObject number) {
		return list_utilities.alist_lookup_without_values(numeric_date_utilities.$number_month_table$.getGlobalValue(),
				number, Symbols.symbol_function((SubLObject) numeric_date_utilities.EQ),
				(SubLObject) numeric_date_utilities.NIL);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 61295L)
	public static SubLObject abbreviation_for_month_number(final SubLObject month_num) {
		return month_number_abbrev(month_num);
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 61434L)
	public static SubLObject date_abbreviation_string(final SubLObject universal_date) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject day = decode_universal_date(universal_date);
		SubLObject month = thread.secondMultipleValue();
		final SubLObject year = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		month = abbreviation_for_month_number(month);
		return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(month),
				new SubLObject[] { numeric_date_utilities.$str134$_, format_nil.format_nil_a_no_copy(day),
						numeric_date_utilities.$str135$__, format_nil.format_nil_a_no_copy(year) });
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 61680L)
	public static SubLObject today_abbreviation_string() {
		return date_abbreviation_string(get_universal_date((SubLObject) numeric_date_utilities.UNPROVIDED,
				(SubLObject) numeric_date_utilities.UNPROVIDED));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 61782L)
	public static SubLObject time_abbreviation_string(SubLObject universal_time) {
		if (universal_time == numeric_date_utilities.UNPROVIDED) {
			universal_time = Time.get_universal_time();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject second = Time.decode_universal_time(universal_time,
				(SubLObject) numeric_date_utilities.UNPROVIDED);
		final SubLObject minute = thread.secondMultipleValue();
		final SubLObject hour = thread.thirdMultipleValue();
		final SubLObject date = thread.fourthMultipleValue();
		final SubLObject month = thread.fifthMultipleValue();
		final SubLObject year = thread.sixthMultipleValue();
		thread.resetMultipleValues();
		return PrintLow.format((SubLObject) numeric_date_utilities.NIL,
				(SubLObject) numeric_date_utilities.$str136$_2__0D__2__0D__2__0D__2__0D__2__0, new SubLObject[] { month,
						date, Numbers.mod(year, (SubLObject) numeric_date_utilities.$int9$100), hour, minute, second });
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 62096L)
	public static SubLObject elapsed_time_abbreviation_string(final SubLObject elapsed_seconds) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		SubLObject secs = decode_elapsed_seconds(elapsed_seconds);
		final SubLObject mins = thread.secondMultipleValue();
		final SubLObject hours = thread.thirdMultipleValue();
		final SubLObject days = thread.fourthMultipleValue();
		thread.resetMultipleValues();
		secs = Numbers.truncate(secs, (SubLObject) numeric_date_utilities.UNPROVIDED);
		return days.numG((SubLObject) numeric_date_utilities.ZERO_INTEGER)
				? PrintLow.format((SubLObject) numeric_date_utilities.NIL,
						(SubLObject) numeric_date_utilities.$str137$_D_day__P__D__2__0D__2__0D,
						new SubLObject[] { days, hours, mins, secs })
				: (hours.numG((SubLObject) numeric_date_utilities.ZERO_INTEGER)
						? PrintLow.format((SubLObject) numeric_date_utilities.NIL,
								(SubLObject) numeric_date_utilities.$str138$_D__2__0D__2__0D,
								new SubLObject[] { hours, mins, secs })
						: PrintLow.format((SubLObject) numeric_date_utilities.NIL,
								(SubLObject) numeric_date_utilities.$str139$_D__2__0D, mins, secs));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 62514L)
	public static SubLObject elapsed_time_string(final SubLObject elapsed_seconds) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		SubLObject secs = decode_elapsed_seconds(elapsed_seconds);
		final SubLObject mins = thread.secondMultipleValue();
		final SubLObject hours = thread.thirdMultipleValue();
		final SubLObject days = thread.fourthMultipleValue();
		thread.resetMultipleValues();
		secs = Numbers.truncate(secs, (SubLObject) numeric_date_utilities.UNPROVIDED);
		return days.numG((SubLObject) numeric_date_utilities.ZERO_INTEGER)
				? PrintLow.format((SubLObject) numeric_date_utilities.NIL,
						(SubLObject) numeric_date_utilities.$str140$_Dd__2__0Dh__2__0Dm__2__0Ds,
						new SubLObject[] { days, hours, mins, secs })
				: (hours.numG((SubLObject) numeric_date_utilities.ZERO_INTEGER)
						? PrintLow.format((SubLObject) numeric_date_utilities.NIL,
								(SubLObject) numeric_date_utilities.$str141$_2__0Dh__2__0Dm__2__0Ds,
								new SubLObject[] { hours, mins, secs })
						: PrintLow.format((SubLObject) numeric_date_utilities.NIL,
								(SubLObject) numeric_date_utilities.$str142$_2__0Dm__2__0Ds, mins, secs));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 63265L)
	public static SubLObject seconds_in_month(final SubLObject month, final SubLObject year) {
		return Numbers.multiply(numeric_date_utilities.$seconds_in_a_day$.getGlobalValue(),
				days_in_month_number(date_utilities.number_of_month(month), year));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 63409L)
	public static SubLObject seconds_in_quarter(final SubLObject starting_month, final SubLObject year) {
		final SubLObject init_num = date_utilities.number_of_month(starting_month);
		return Numbers.add(
				Numbers.multiply(numeric_date_utilities.$seconds_in_a_day$.getGlobalValue(),
						days_in_month_number(init_num, year)),
				Numbers.multiply(numeric_date_utilities.$seconds_in_a_day$.getGlobalValue(),
						days_in_month_number(Numbers.add((SubLObject) numeric_date_utilities.ONE_INTEGER, init_num),
								year)),
				Numbers.multiply(numeric_date_utilities.$seconds_in_a_day$.getGlobalValue(), days_in_month_number(
						Numbers.add((SubLObject) numeric_date_utilities.TWO_INTEGER, init_num), year)));
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 63752L)
	public static SubLObject seconds_in_year(final SubLObject year) {
		if (numeric_date_utilities.NIL != leap_year_p(year)) {
			return numeric_date_utilities.$seconds_in_a_leap_year$.getGlobalValue();
		}
		return numeric_date_utilities.$seconds_in_a_non_leap_year$.getGlobalValue();
	}

	@SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 63902L)
	public static SubLObject seconds_in_millennium(final SubLObject year) {
		if (numeric_date_utilities.ONE_INTEGER
				.numE(Numbers.integerDivide(year, (SubLObject) numeric_date_utilities.$int1$1000))) {
			return numeric_date_utilities.$seconds_in_an_odd_millennium$.getGlobalValue();
		}
		return numeric_date_utilities.$seconds_in_an_even_millennium$.getGlobalValue();
	}

	public static SubLObject declare_numeric_date_utilities_file() {
		SubLFiles.declareMacro("com.cyc.cycjava.cycl.numeric_date_utilities", "elapsed_milliseconds",
				"ELAPSED-MILLISECONDS");
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "valid_year_number_p",
				"VALID-YEAR-NUMBER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "valid_month_number_p",
				"VALID-MONTH-NUMBER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "valid_day_number_p",
				"VALID-DAY-NUMBER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "valid_day_for_month_p",
				"VALID-DAY-FOR-MONTH-P", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "valid_hour_number_p",
				"VALID-HOUR-NUMBER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "valid_minute_number_p",
				"VALID-MINUTE-NUMBER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "valid_second_number_p",
				"VALID-SECOND-NUMBER-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "universal_time_p", "UNIVERSAL-TIME-P",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "universal_time_seconds_from_now",
				"UNIVERSAL-TIME-SECONDS-FROM-NOW", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "time_from_now", "TIME-FROM-NOW", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "universal_time_from_now",
				"UNIVERSAL-TIME-FROM-NOW", 1, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "timestring", "TIMESTRING", 0, 1,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "timestring_ms", "TIMESTRING-MS", 0, 2,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "timestring_ms_utc",
				"TIMESTRING-MS-UTC", 0, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "safe_timestring", "SAFE-TIMESTRING",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "timestring_int", "TIMESTRING-INT", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "timestamp", "TIMESTAMP", 0, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "numeric_timestamp",
				"NUMERIC-TIMESTAMP", 0, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "timestamp_with_milliseconds",
				"TIMESTAMP-WITH-MILLISECONDS", 0, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "encode_timestring",
				"ENCODE-TIMESTRING", 6, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "universal_timestring",
				"UNIVERSAL-TIMESTRING", 0, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "encode_universal_timestring",
				"ENCODE-UNIVERSAL-TIMESTRING", 6, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "get_universal_time_today",
				"GET-UNIVERSAL-TIME-TODAY", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "get_universal_time_within_next_day",
				"GET-UNIVERSAL-TIME-WITHIN-NEXT-DAY", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "universal_time_day_of_week_number",
				"UNIVERSAL-TIME-DAY-OF-WEEK-NUMBER", 0, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "internal_real_time_p",
				"INTERNAL-REAL-TIME-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "internal_real_time_seconds_from_now",
				"INTERNAL-REAL-TIME-SECONDS-FROM-NOW", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "elapsed_internal_real_time",
				"ELAPSED-INTERNAL-REAL-TIME", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities",
				"elapsed_internal_real_time_to_elapsed_seconds", "ELAPSED-INTERNAL-REAL-TIME-TO-ELAPSED-SECONDS", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities",
				"elapsed_seconds_to_elapsed_internal_real_time", "ELAPSED-SECONDS-TO-ELAPSED-INTERNAL-REAL-TIME", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities",
				"elapsed_seconds_between_internal_real_times", "ELAPSED-SECONDS-BETWEEN-INTERNAL-REAL-TIMES", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "readable_elapsed_time_string",
				"READABLE-ELAPSED-TIME-STRING", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "explode_elapsed_time_ms",
				"EXPLODE-ELAPSED-TIME-MS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "readable_elapsed_time_string_ms",
				"READABLE-ELAPSED-TIME-STRING-MS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "datetime_string_from_template",
				"DATETIME-STRING-FROM-TEMPLATE", 0, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "encode_datetime_string_from_template",
				"ENCODE-DATETIME-STRING-FROM-TEMPLATE", 8, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "valid_date_template_char",
				"VALID-DATE-TEMPLATE-CHAR", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "valid_time_template_char",
				"VALID-TIME-TEMPLATE-CHAR", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "valid_date_separator",
				"VALID-DATE-SEPARATOR", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "valid_time_separator",
				"VALID-TIME-SEPARATOR", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "valid_year_token", "VALID-YEAR-TOKEN",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "valid_month_token",
				"VALID-MONTH-TOKEN", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "valid_day_token", "VALID-DAY-TOKEN",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "valid_hour_token", "VALID-HOUR-TOKEN",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "valid_minute_token",
				"VALID-MINUTE-TOKEN", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "valid_second_token",
				"VALID-SECOND-TOKEN", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "date_template_p", "DATE-TEMPLATE-P",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "time_template_p", "TIME-TEMPLATE-P",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "datetime_string_template_p",
				"DATETIME-STRING-TEMPLATE-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "non_date_time_whitespace_p",
				"NON-DATE-TIME-WHITESPACE-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "date_time_whitespace_p",
				"DATE-TIME-WHITESPACE-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "n_digit_template_element_p",
				"N-DIGIT-TEMPLATE-ELEMENT-P", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "encode_date_from_template",
				"ENCODE-DATE-FROM-TEMPLATE", 4, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "encode_next_date_element",
				"ENCODE-NEXT-DATE-ELEMENT", 6, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "encode_time_from_template",
				"ENCODE-TIME-FROM-TEMPLATE", 5, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "decode_datetime_string_from_template",
				"DECODE-DATETIME-STRING-FROM-TEMPLATE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "decode_date_from_template",
				"DECODE-DATE-FROM-TEMPLATE", 2, 3, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "decode_time_from_template",
				"DECODE-TIME-FROM-TEMPLATE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "decode_elapsed_seconds",
				"DECODE-ELAPSED-SECONDS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "decode_elapsed_seconds_without_days",
				"DECODE-ELAPSED-SECONDS-WITHOUT-DAYS", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "encode_elapsed_seconds",
				"ENCODE-ELAPSED-SECONDS", 0, 4, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "encode_elapsed_seconds_string",
				"ENCODE-ELAPSED-SECONDS-STRING", 0, 4, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "elapsed_seconds_string",
				"ELAPSED-SECONDS-STRING", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "universal_date_p", "UNIVERSAL-DATE-P",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "get_universal_date",
				"GET-UNIVERSAL-DATE", 0, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "today", "TODAY", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "yesterday", "YESTERDAY", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "tomorrow", "TOMORROW", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "this_year", "THIS-YEAR", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "universal_date_add_days",
				"UNIVERSAL-DATE-ADD-DAYS", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "universal_date_subtract_days",
				"UNIVERSAL-DATE-SUBTRACT-DAYS", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "universal_date_add_days_int",
				"UNIVERSAL-DATE-ADD-DAYS-INT", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "decode_universal_date",
				"DECODE-UNIVERSAL-DATE", 0, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "day_from_universal_date",
				"DAY-FROM-UNIVERSAL-DATE", 0, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "month_from_universal_date",
				"MONTH-FROM-UNIVERSAL-DATE", 0, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "year_from_universal_date",
				"YEAR-FROM-UNIVERSAL-DATE", 0, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "encode_universal_date",
				"ENCODE-UNIVERSAL-DATE", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "datestring", "DATESTRING", 0, 1,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "datestringL", "DATESTRING<", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "datestring_", "DATESTRING-", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "datestring_year", "DATESTRING-YEAR",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "datestring_month", "DATESTRING-MONTH",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "datestring_day", "DATESTRING-DAY", 1,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "encode_datestring",
				"ENCODE-DATESTRING", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "decode_datestring",
				"DECODE-DATESTRING", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "month_ago", "MONTH-AGO", 0, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "get_julian_date", "GET-JULIAN-DATE",
				0, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "julian_date_from_universal_date",
				"JULIAN-DATE-FROM-UNIVERSAL-DATE", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "julian_offset", "JULIAN-OFFSET", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "compute_julian_offset",
				"COMPUTE-JULIAN-OFFSET", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities",
				"universal_time_for_start_of_universal_date", "UNIVERSAL-TIME-FOR-START-OF-UNIVERSAL-DATE", 1, 1,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "universal_days", "UNIVERSAL-DAYS", 2,
				0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "universal_second_p",
				"UNIVERSAL-SECOND-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "get_universal_second",
				"GET-UNIVERSAL-SECOND", 0, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "decode_universal_second",
				"DECODE-UNIVERSAL-SECOND", 0, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "encode_universal_second",
				"ENCODE-UNIVERSAL-SECOND", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "secondstring", "SECONDSTRING", 0, 1,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "encode_secondstring",
				"ENCODE-SECONDSTRING", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "decode_secondstring",
				"DECODE-SECONDSTRING", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "secondstring_", "SECONDSTRING-", 2, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "secondstring_hour",
				"SECONDSTRING-HOUR", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "secondstring_minute",
				"SECONDSTRING-MINUTE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "secondstring_second",
				"SECONDSTRING-SECOND", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "encode_millisecondstring",
				"ENCODE-MILLISECONDSTRING", 2, 2, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "universal_date_and_second_from_time",
				"UNIVERSAL-DATE-AND-SECOND-FROM-TIME", 0, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "universal_time_from_date_and_second",
				"UNIVERSAL-TIME-FROM-DATE-AND-SECOND", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "get_utc_time_with_milliseconds",
				"GET-UTC-TIME-WITH-MILLISECONDS", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "get_universal_millisecond",
				"GET-UNIVERSAL-MILLISECOND", 0, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "get_internal_real_time_ms",
				"GET-INTERNAL-REAL-TIME-MS", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "extended_universal_date_p",
				"EXTENDED-UNIVERSAL-DATE-P", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "get_extended_universal_date",
				"GET-EXTENDED-UNIVERSAL-DATE", 0, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "encode_extended_universal_date",
				"ENCODE-EXTENDED-UNIVERSAL-DATE", 6, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "decode_extended_universal_date",
				"DECODE-EXTENDED-UNIVERSAL-DATE", 0, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities",
				"encode_universal_time_for_extended_universal_date",
				"ENCODE-UNIVERSAL-TIME-FOR-EXTENDED-UNIVERSAL-DATE", 1, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "preceding_extended_universal_date",
				"PRECEDING-EXTENDED-UNIVERSAL-DATE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "succeeding_extended_universal_date",
				"SUCCEEDING-EXTENDED-UNIVERSAL-DATE", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "extended_universal_dateL",
				"EXTENDED-UNIVERSAL-DATE<", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "adjust_year_month_day",
				"ADJUST-YEAR-MONTH-DAY", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "adjust_year_month_day_hour_min_sec",
				"ADJUST-YEAR-MONTH-DAY-HOUR-MIN-SEC", 6, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "leap_year_p", "LEAP-YEAR-P", 1, 0,
				false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "usual_days_in_month_number",
				"USUAL-DAYS-IN-MONTH-NUMBER", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "days_in_month_number",
				"DAYS-IN-MONTH-NUMBER", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "total_days_in_months_preceding",
				"TOTAL-DAYS-IN-MONTHS-PRECEDING", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "day_of_week_number_abbrev",
				"DAY-OF-WEEK-NUMBER-ABBREV", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "month_number_abbrev",
				"MONTH-NUMBER-ABBREV", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "abbreviation_for_month_number",
				"ABBREVIATION-FOR-MONTH-NUMBER", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "date_abbreviation_string",
				"DATE-ABBREVIATION-STRING", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "today_abbreviation_string",
				"TODAY-ABBREVIATION-STRING", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "time_abbreviation_string",
				"TIME-ABBREVIATION-STRING", 0, 1, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "elapsed_time_abbreviation_string",
				"ELAPSED-TIME-ABBREVIATION-STRING", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "elapsed_time_string",
				"ELAPSED-TIME-STRING", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "seconds_in_month", "SECONDS-IN-MONTH",
				2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "seconds_in_quarter",
				"SECONDS-IN-QUARTER", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "seconds_in_year", "SECONDS-IN-YEAR",
				1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.numeric_date_utilities", "seconds_in_millennium",
				"SECONDS-IN-MILLENNIUM", 1, 0, false);
		return (SubLObject) numeric_date_utilities.NIL;
	}

	public static SubLObject init_numeric_date_utilities_file() {
		numeric_date_utilities.$microseconds_in_a_second$ = SubLFiles.defconstant("*MICROSECONDS-IN-A-SECOND*",
				(SubLObject) numeric_date_utilities.$int0$1000000);
		numeric_date_utilities.$microseconds_in_a_millisecond$ = SubLFiles
				.defconstant("*MICROSECONDS-IN-A-MILLISECOND*", (SubLObject) numeric_date_utilities.$int1$1000);
		numeric_date_utilities.$milliseconds_in_a_second$ = SubLFiles.defconstant("*MILLISECONDS-IN-A-SECOND*",
				(SubLObject) numeric_date_utilities.$int1$1000);
		numeric_date_utilities.$seconds_in_a_leap_year$ = SubLFiles.defconstant("*SECONDS-IN-A-LEAP-YEAR*",
				(SubLObject) numeric_date_utilities.$int2$31622400);
		numeric_date_utilities.$seconds_in_a_non_leap_year$ = SubLFiles.defconstant("*SECONDS-IN-A-NON-LEAP-YEAR*",
				(SubLObject) numeric_date_utilities.$int3$31536000);
		numeric_date_utilities.$seconds_in_a_week$ = SubLFiles.defconstant("*SECONDS-IN-A-WEEK*",
				(SubLObject) numeric_date_utilities.$int4$604800);
		numeric_date_utilities.$seconds_in_a_day$ = SubLFiles.defconstant("*SECONDS-IN-A-DAY*",
				(SubLObject) numeric_date_utilities.$int5$86400);
		numeric_date_utilities.$seconds_in_an_hour$ = SubLFiles.defconstant("*SECONDS-IN-AN-HOUR*",
				(SubLObject) numeric_date_utilities.$int6$3600);
		numeric_date_utilities.$seconds_in_a_minute$ = SubLFiles.defconstant("*SECONDS-IN-A-MINUTE*",
				(SubLObject) numeric_date_utilities.$int7$60);
		numeric_date_utilities.$minutes_in_an_hour$ = SubLFiles.defconstant("*MINUTES-IN-AN-HOUR*",
				(SubLObject) numeric_date_utilities.$int7$60);
		numeric_date_utilities.$hours_in_a_day$ = SubLFiles.defconstant("*HOURS-IN-A-DAY*",
				(SubLObject) numeric_date_utilities.$int8$24);
		numeric_date_utilities.$months_in_a_quarter$ = SubLFiles.defconstant("*MONTHS-IN-A-QUARTER*",
				(SubLObject) numeric_date_utilities.THREE_INTEGER);
		numeric_date_utilities.$months_in_a_year$ = SubLFiles.defconstant("*MONTHS-IN-A-YEAR*",
				(SubLObject) numeric_date_utilities.TWELVE_INTEGER);
		numeric_date_utilities.$years_in_a_decade$ = SubLFiles.defconstant("*YEARS-IN-A-DECADE*",
				(SubLObject) numeric_date_utilities.TEN_INTEGER);
		numeric_date_utilities.$years_in_a_century$ = SubLFiles.defconstant("*YEARS-IN-A-CENTURY*",
				(SubLObject) numeric_date_utilities.$int9$100);
		numeric_date_utilities.$elapsed_seconds_multiples$ = SubLFiles.deflexical("*ELAPSED-SECONDS-MULTIPLES*",
				(SubLObject) ConsesLow.list(numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue(),
						numeric_date_utilities.$minutes_in_an_hour$.getGlobalValue(),
						numeric_date_utilities.$hours_in_a_day$.getGlobalValue()));
		numeric_date_utilities.$elapsed_seconds_wXo_days_multiples$ = SubLFiles.deflexical(
				"*ELAPSED-SECONDS-W/O-DAYS-MULTIPLES*",
				(SubLObject) ConsesLow.list(numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue(),
						numeric_date_utilities.$minutes_in_an_hour$.getGlobalValue()));
		numeric_date_utilities.$julian_date_reference$ = SubLFiles.defconstant("*JULIAN-DATE-REFERENCE*",
				(SubLObject) numeric_date_utilities.$list112);
		numeric_date_utilities.$julian_offsets$ = SubLFiles.deflexical("*JULIAN-OFFSETS*",
				(SubLObject) ((numeric_date_utilities.NIL != Symbols
						.boundp((SubLObject) numeric_date_utilities.$sym113$_JULIAN_OFFSETS_))
								? numeric_date_utilities.$julian_offsets$.getGlobalValue()
								: numeric_date_utilities.NIL));
		numeric_date_utilities.$month_duration_table$ = SubLFiles.deflexical("*MONTH-DURATION-TABLE*",
				(SubLObject) numeric_date_utilities.$list129);
		numeric_date_utilities.$number_wkday_table$ = SubLFiles.deflexical("*NUMBER-WKDAY-TABLE*",
				(SubLObject) numeric_date_utilities.$list130);
		numeric_date_utilities.$number_month_table$ = SubLFiles.deflexical("*NUMBER-MONTH-TABLE*",
				(SubLObject) numeric_date_utilities.$list131);
		numeric_date_utilities.$seconds_in_a_century$ = SubLFiles.defconstant("*SECONDS-IN-A-CENTURY*",
				(SubLObject) numeric_date_utilities.$int143$3155760000);
		numeric_date_utilities.$seconds_in_an_odd_millennium$ = SubLFiles.defconstant("*SECONDS-IN-AN-ODD-MILLENNIUM*",
				(SubLObject) numeric_date_utilities.$int144$31556908800);
		numeric_date_utilities.$seconds_in_an_even_millennium$ = SubLFiles.defconstant(
				"*SECONDS-IN-AN-EVEN-MILLENNIUM*", (SubLObject) numeric_date_utilities.$int145$31556995200);
		return (SubLObject) numeric_date_utilities.NIL;
	}

	public static SubLObject setup_numeric_date_utilities_file() {
		access_macros.define_obsolete_register((SubLObject) numeric_date_utilities.$sym20$TIME_FROM_NOW,
				(SubLObject) numeric_date_utilities.$list21);
		generic_testing.define_test_case_table_int(
				(SubLObject) numeric_date_utilities.$sym39$READABLE_ELAPSED_TIME_STRING,
				(SubLObject) ConsesLow.list(new SubLObject[] { numeric_date_utilities.$kw40$TEST,
						numeric_date_utilities.NIL, numeric_date_utilities.$kw41$OWNER, numeric_date_utilities.NIL,
						numeric_date_utilities.$kw42$CLASSES, numeric_date_utilities.NIL,
						numeric_date_utilities.$kw43$KB, numeric_date_utilities.$kw44$TINY,
						numeric_date_utilities.$kw45$WORKING_, numeric_date_utilities.T }),
				(SubLObject) numeric_date_utilities.$list46);
		access_macros.define_obsolete_register((SubLObject) numeric_date_utilities.$sym101$ELAPSED_SECONDS_STRING,
				(SubLObject) numeric_date_utilities.$list102);
		subl_macro_promotions.declare_defglobal((SubLObject) numeric_date_utilities.$sym113$_JULIAN_OFFSETS_);
		access_macros.define_obsolete_register(
				(SubLObject) numeric_date_utilities.$sym132$ABBREVIATION_FOR_MONTH_NUMBER,
				(SubLObject) numeric_date_utilities.$list133);
		sunit_external.define_test_suite((SubLObject) numeric_date_utilities.$str146$Numeric_Date_Utilities,
				(SubLObject) numeric_date_utilities.NIL, (SubLObject) numeric_date_utilities.NIL,
				(SubLObject) numeric_date_utilities.$list147);
		return (SubLObject) numeric_date_utilities.NIL;
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
