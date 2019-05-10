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

public final class numeric_date_utilities
    extends
      SubLTranslatedFile
{
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
  private static final SubLInteger $int0$1000000 = makeInteger( 0xf4240 );
  private static final SubLInteger $int1$1000 = makeInteger( 1000 );
  private static final SubLInteger $int2$31622400 = makeInteger( 0x1e28500 );
  private static final SubLInteger $int3$31536000 = makeInteger( 0x1e13380 );
  private static final SubLInteger $int4$604800 = makeInteger( 0x93a80 );
  private static final SubLInteger $int5$86400 = makeInteger( 0x15180 );
  private static final SubLInteger $int6$3600 = makeInteger( 3600 );
  private static final SubLInteger $int7$60 = makeInteger( 60 );
  private static final SubLInteger $int8$24 = makeInteger( 24 );
  private static final SubLInteger $int9$100 = makeInteger( 100 );
  private static final SubLList $list10 = ConsesLow.list( ConsesLow.list( makeSymbol( "TIME" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
  private static final SubLSymbol $sym11$PROGN = makeSymbol( "PROGN" );
  private static final SubLSymbol $sym12$CTIME = makeSymbol( "CTIME" );
  private static final SubLSymbol $sym13$CSETQ = makeSymbol( "CSETQ" );
  private static final SubLSymbol $sym14$TRUNCATE = makeSymbol( "TRUNCATE" );
  private static final SubLSymbol $sym15$_ = makeSymbol( "*" );
  private static final SubLList $list16 = ConsesLow.list( makeInteger( 1000 ) );
  private static final SubLInteger $int17$31 = makeInteger( 31 );
  private static final SubLInteger $int18$23 = makeInteger( 23 );
  private static final SubLInteger $int19$59 = makeInteger( 59 );
  private static final SubLSymbol $sym20$TIME_FROM_NOW = makeSymbol( "TIME-FROM-NOW" );
  private static final SubLList $list21 = ConsesLow.list( makeSymbol( "UNIVERSAL-TIME-SECONDS-FROM-NOW" ) );
  private static final SubLSymbol $sym22$UNIVERSAL_TIME_P = makeSymbol( "UNIVERSAL-TIME-P" );
  private static final SubLString $str23$_D__2__0D__2__0D__2__0D__2__0D__2 = SubLObjectFactory.makeString( "~D-~2,'0D-~2,'0D ~2,'0D:~2,'0D:~2,'0D.~3,'0D" );
  private static final SubLString $str24$_D__2__0D__2__0DT_2__0D__2__0D__2 = SubLObjectFactory.makeString( "~D-~2,'0D-~2,'0DT~2,'0D:~2,'0D:~2,'0D.~3,'0DZ" );
  private static final SubLString $str25$ = makeString( "" );
  private static final SubLString $str26$_a__6__0D = makeString( "~a-~6,'0D" );
  private static final SubLString $str27$_a__6__0D__3__0D = makeString( "~a-~6,'0D.~3,'0D" );
  private static final SubLString $str28$mm_dd_yyyy_hh_mm_ss = makeString( "mm/dd/yyyy hh:mm:ss" );
  private static final SubLString $str29$_D_2__0D_2__0D_2__0D_2__0D_2__0D = SubLObjectFactory.makeString( "~D~2,'0D~2,'0D~2,'0D~2,'0D~2,'0D" );
  private static final SubLSymbol $sym30$NON_NEGATIVE_NUMBER_P = SubLObjectFactory.makeSymbol( "NON-NEGATIVE-NUMBER-P" );
  private static final SubLSymbol $sym31$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol( "NON-NEGATIVE-INTEGER-P" );
  private static final SubLString $str32$_second__P = makeString( " second~:P" );
  private static final SubLString $str33$ms = makeString( "ms" );
  private static final SubLString $str34$_D = makeString( "~D" );
  private static final SubLString $str35$__ = makeString( "~," );
  private static final SubLString $str36$F = makeString( "F" );
  private static final SubLString $str37$_D_hours___D_minute__P = SubLObjectFactory.makeString( "~D hours, ~D minute~:P" );
  private static final SubLString $str38$_D_minute__P__ = makeString( "~D minute~:P, " );
  private static final SubLSymbol $sym39$READABLE_ELAPSED_TIME_STRING = SubLObjectFactory.makeSymbol( "READABLE-ELAPSED-TIME-STRING" );
  private static final SubLSymbol $kw40$TEST = makeKeyword( "TEST" );
  private static final SubLSymbol $kw41$OWNER = makeKeyword( "OWNER" );
  private static final SubLSymbol $kw42$CLASSES = makeKeyword( "CLASSES" );
  private static final SubLSymbol $kw43$KB = makeKeyword( "KB" );
  private static final SubLSymbol $kw44$TINY = makeKeyword( "TINY" );
  private static final SubLSymbol $kw45$WORKING_ = makeKeyword( "WORKING?" );
  private static final SubLList $list46;
  private static final SubLString $str47$_ = makeString( "-" );
  private static final SubLList $list48 = ConsesLow.list( makeSymbol( "DAYS" ), makeSymbol( "HOURS" ), makeSymbol( "MINUTES" ), makeSymbol( "SECONDS" ), makeSymbol( "MILLISECONDS" ), makeSymbol( "MICROSECONDS" ) );
  private static final SubLString $str49$_D_day__P = makeString( "~D day~:P" );
  private static final SubLString $str50$_D_hour__P = makeString( "~D hour~:P" );
  private static final SubLString $str51$_D__2__0D_hour_P = makeString( "~D:~2,'0D hour~P" );
  private static final SubLString $str52$_D_minute__P = makeString( "~D minute~:P" );
  private static final SubLString $str53$_D__2__0D_minute_P = makeString( "~D:~2,'0D minute~P" );
  private static final SubLString $str54$_D_second__P = makeString( "~D second~:P" );
  private static final SubLString $str55$_D__2__0D_second_P = makeString( "~D.~2,'0D second~P" );
  private static final SubLString $str56$_ms = makeString( " ms" );
  private static final SubLString $str57$___s = makeString( " \265s" );
  private static final SubLString $str58$0___s = makeString( "0 \265s" );
  private static final SubLSymbol $sym59$DATETIME_STRING_TEMPLATE_P = SubLObjectFactory.makeSymbol( "DATETIME-STRING-TEMPLATE-P" );
  private static final SubLSymbol $sym60$NON_DATE_TIME_WHITESPACE_P = SubLObjectFactory.makeSymbol( "NON-DATE-TIME-WHITESPACE-P" );
  private static final SubLString $str61$_A__A = makeString( "~A ~A" );
  private static final SubLString $str62$Template__s_is_not_a_valid_dateti = SubLObjectFactory.makeString( "Template ~s is not a valid datetime-string template." );
  private static final SubLList $list63;
  private static final SubLList $list64;
  private static final SubLSymbol $sym65$VALID_DATE_TEMPLATE_CHAR = SubLObjectFactory.makeSymbol( "VALID-DATE-TEMPLATE-CHAR" );
  private static final SubLString $str66$hh_mm_ss = makeString( "hh:mm:ss" );
  private static final SubLString $str67$hh_mm_ss_mmm = makeString( "hh:mm:ss.mmm" );
  private static final SubLString $str68$hh_mm = makeString( "hh:mm" );
  private static final SubLString $str69$hh_mm_ss_m = makeString( "hh:mm:ss.m" );
  private static final SubLString $str70$hh_mm_ss_mm = makeString( "hh:mm:ss.mm" );
  private static final SubLSymbol $sym71$VALID_YEAR_TOKEN = makeSymbol( "VALID-YEAR-TOKEN" );
  private static final SubLSymbol $sym72$VALID_DATE_SEPARATOR = makeSymbol( "VALID-DATE-SEPARATOR" );
  private static final SubLSymbol $sym73$VALID_MONTH_TOKEN = makeSymbol( "VALID-MONTH-TOKEN" );
  private static final SubLSymbol $sym74$VALID_DAY_TOKEN = makeSymbol( "VALID-DAY-TOKEN" );
  private static final SubLString $str75$Template_or_template_portion__S_d = SubLObjectFactory.makeString( "Template or template portion ~S didn't match any expected pattern" );
  private static final SubLString $str76$_ = makeString( "~" );
  private static final SubLString $str77$__0D = makeString( ",'0D" );
  private static final SubLString $str78$_2__0D__2__0D__2__0D = makeString( "~2,'0D:~2,'0D:~2,'0D" );
  private static final SubLString $str79$_2__0D__2__0D = makeString( "~2,'0D:~2,'0D" );
  private static final SubLString $str80$_2__0D__2__0D__2__0D__3__0D = SubLObjectFactory.makeString( "~2,'0D:~2,'0D:~2,'0D.~3,'0D" );
  private static final SubLString $str81$_2__0D__2__0D__2__0D__2__0D = SubLObjectFactory.makeString( "~2,'0D:~2,'0D:~2,'0D.~2,'0D" );
  private static final SubLString $str82$_2__0D__2__0D__2__0D__1__0D = SubLObjectFactory.makeString( "~2,'0D:~2,'0D:~2,'0D.~1,'0D" );
  private static final SubLString $str83$Template_or_template_portion__A_w = SubLObjectFactory.makeString( "Template or template portion ~A wasn't a recognized time template." );
  private static final SubLString $str84$The_template__S_doesn_t_match_the = SubLObjectFactory.makeString( "The template ~S doesn't match the datetime-string ~S" );
  private static final SubLString $str85$Template_or_template_portion__A_w = SubLObjectFactory.makeString( "Template or template portion ~A wasn't a recognized datetime template." );
  private static final SubLString $str86$The_date_string__A_and_the_templa = SubLObjectFactory.makeString( "The date string ~A and the template ~A are of length." );
  private static final SubLSymbol $kw87$EOF = makeKeyword( "EOF" );
  private static final SubLString $str88$Template_or_template_portion__A_d = SubLObjectFactory.makeString( "Template or template portion ~A doesn't match datestring ~A" );
  private static final SubLList $list89 = ConsesLow.list( makeString( "hh:mm:ss" ), makeString( "hh:mm" ), makeString( "hh:mm:ss.mmm" ), makeString( "hh:mm:ss.mm" ), makeString( "hh:mm:ss.m" ) );
  private static final SubLString $str90$The_template__A_is_not_a_recogniz = SubLObjectFactory.makeString( "The template ~A is not a recognized timestring template." );
  private static final SubLString $str91$The_time_string__A_and_the_templa = SubLObjectFactory.makeString( "The time string ~A and the template ~A are of unequal length." );
  private static final SubLList $list92;
  private static final SubLList $list93;
  private static final SubLString $str94$__A_day_A = makeString( " ~A day~A" );
  private static final SubLString $str95$s = makeString( "s" );
  private static final SubLString $str96$__A_hour_A = makeString( " ~A hour~A" );
  private static final SubLString $str97$__A_minute_A = makeString( " ~A minute~A" );
  private static final SubLSymbol $sym98$DOUBLE_FLOAT = makeSymbol( "DOUBLE-FLOAT" );
  private static final SubLString $str99$__A_second_A = makeString( " ~A second~A" );
  private static final SubLString $str100$_0_seconds = makeString( " 0 seconds" );
  private static final SubLSymbol $sym101$ELAPSED_SECONDS_STRING = SubLObjectFactory.makeSymbol( "ELAPSED-SECONDS-STRING" );
  private static final SubLList $list102 = ConsesLow.list( makeSymbol( "READABLE-ELAPSED-TIME-STRING" ) );
  private static final SubLSymbol $sym103$UNIVERSAL_DATE_P = makeSymbol( "UNIVERSAL-DATE-P" );
  private static final SubLSymbol $sym104$INTEGERP = makeSymbol( "INTEGERP" );
  private static final SubLInteger $int105$10000 = makeInteger( 10000 );
  private static final SubLSymbol $sym106$PLUSP = makeSymbol( "PLUSP" );
  private static final SubLString $str107$_2__0d__2__0d__4__0d = makeString( "~2,'0d/~2,'0d/~4,'0d" );
  private static final SubLString $str108$_2__0d__2__0d__d = makeString( "~2,'0d/~2,'0d/~d" );
  private static final SubLString $str109$_2__0d__2__0d___d = makeString( "~2,'0d/~2,'0d/-~d" );
  private static final SubLSymbol $kw110$FLOAT = makeKeyword( "FLOAT" );
  private static final SubLSymbol $kw111$INTEGER = makeKeyword( "INTEGER" );
  private static final SubLList $list112 = ConsesLow.cons( makeInteger( 0x1315731 ), makeDouble( 2452122.5D ) );
  private static final SubLSymbol $sym113$_JULIAN_OFFSETS_ = makeSymbol( "*JULIAN-OFFSETS*" );
  private static final SubLList $list114 = ConsesLow.cons( makeSymbol( "REFERENCE-UNIVERSAL-DATE" ), makeSymbol( "REFERENCE-JULIAN-DATE" ) );
  private static final SubLInteger $int115$235959 = makeInteger( 0x399b7 );
  private static final SubLString $str116$second__S_not_in_the_range_0_59 = SubLObjectFactory.makeString( "second ~S not in the range 0-59" );
  private static final SubLString $str117$minute__S_not_in_the_range_0_59 = SubLObjectFactory.makeString( "minute ~S not in the range 0-59" );
  private static final SubLString $str118$hour__S_not_in_the_range_0_59 = SubLObjectFactory.makeString( "hour ~S not in the range 0-59" );
  private static final SubLSymbol $sym119$UNIVERSAL_SECOND_P = makeSymbol( "UNIVERSAL-SECOND-P" );
  private static final SubLString $str120$0 = makeString( "0" );
  private static final SubLString $str121$_ = makeString( ":" );
  private static final SubLInteger $int122$999 = makeInteger( 999 );
  private static final SubLString $str123$second__S_not_in_the_range_0_999 = SubLObjectFactory.makeString( "second ~S not in the range 0-999" );
  private static final SubLString $str124$_2__0d__2__0d__2__0d__3__0d = SubLObjectFactory.makeString( "~2,'0d:~2,'0d:~2,'0d.~3,'0d" );
  private static final SubLInteger $int125$100000000 = makeInteger( 0x5f5e100 );
  private static final SubLInteger $int126$10000000000 = makeInteger( "10000000000" );
  private static final SubLString $str127$MM_DD_YY_adjust_problem___s__s__s = SubLObjectFactory.makeString( "MM/DD/YY adjust problem: ~s ~s ~s" );
  private static final SubLInteger $int128$400 = makeInteger( 400 );
  private static final SubLList $list129 = ConsesLow.list( new SubLObject[] { makeInteger( 31 ), makeInteger( 28 ), makeInteger( 31 ), makeInteger( 30 ), makeInteger( 31 ), makeInteger( 30 ), makeInteger( 31 ),
    makeInteger( 31 ), makeInteger( 30 ), makeInteger( 31 ), makeInteger( 30 ), makeInteger( 31 )
  } );
  private static final SubLList $list130;
  private static final SubLList $list131;
  private static final SubLSymbol $sym132$ABBREVIATION_FOR_MONTH_NUMBER = SubLObjectFactory.makeSymbol( "ABBREVIATION-FOR-MONTH-NUMBER" );
  private static final SubLList $list133 = ConsesLow.list( makeSymbol( "MONTH-NUMBER-ABBREV" ) );
  private static final SubLString $str134$_ = makeString( " " );
  private static final SubLString $str135$__ = makeString( ", " );
  private static final SubLString $str136$_2__0D__2__0D__2__0D__2__0D__2__0 = SubLObjectFactory.makeString( "~2,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D" );
  private static final SubLString $str137$_D_day__P__D__2__0D__2__0D = SubLObjectFactory.makeString( "~D day~:P ~D:~2,'0D:~2,'0D" );
  private static final SubLString $str138$_D__2__0D__2__0D = makeString( "~D:~2,'0D:~2,'0D" );
  private static final SubLString $str139$_D__2__0D = makeString( "~D:~2,'0D" );
  private static final SubLString $str140$_Dd__2__0Dh__2__0Dm__2__0Ds = SubLObjectFactory.makeString( "~Dd ~2,'0Dh ~2,'0Dm ~2,'0Ds" );
  private static final SubLString $str141$_2__0Dh__2__0Dm__2__0Ds = SubLObjectFactory.makeString( "~2,'0Dh ~2,'0Dm ~2,'0Ds" );
  private static final SubLString $str142$_2__0Dm__2__0Ds = makeString( "~2,'0Dm ~2,'0Ds" );
  private static final SubLInteger $int143$3155760000 = makeInteger( "3155760000" );
  private static final SubLInteger $int144$31556908800 = makeInteger( "31556908800" );
  private static final SubLInteger $int145$31556995200 = makeInteger( "31556995200" );
  private static final SubLString $str146$Numeric_Date_Utilities = SubLObjectFactory.makeString( "Numeric Date Utilities" );
  private static final SubLList $list147 = ConsesLow.list( makeSymbol( "TEMPLATIZED-DATESTRING-CASE" ) );
  static
  {
    $list46 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeDouble( 0.0029069999999999999D ) ), makeString( "2.91ms" ) ), ConsesLow.list( ConsesLow.list( makeDouble( 0.029069999999999999D ) ),
        makeString( "29.07ms" ) ), ConsesLow.list( ConsesLow.list( makeDouble( 0.2616D ) ), makeString( "262ms" ) ), ConsesLow.list( ConsesLow.list( makeDouble( 0.78480000000000005D ) ), makeString( "785ms" ) ),
      ConsesLow.list( ConsesLow.list( makeDouble( 6.2789999999999999D ) ), makeString( "6.28 seconds" ) ), ConsesLow.list( ConsesLow.list( makeDouble( 12.558D ) ), makeString( "12.56 seconds" ) ), ConsesLow.list(
          ConsesLow.list( makeDouble( 25.116D ) ), makeString( "25.12 seconds" ) ), ConsesLow.list( ConsesLow.list( makeDouble( 50.231999999999999D ) ), makeString( "50.23 seconds" ) ), ConsesLow.list( ConsesLow.list(
              makeInteger( 60 ), ZERO_INTEGER ), makeString( "60 seconds" ) ), ConsesLow.list( ConsesLow.list( makeDouble( 299.99000000000001D ) ), makeString( "5 minutes, 0 seconds" ) ), ConsesLow.list( ConsesLow.list(
                  makeDouble( 452.08999999999997D ) ), makeString( "7 minutes, 32 seconds" ) ), ConsesLow.list( ConsesLow.list( makeInteger( 3600 ) ), makeString( "60 minutes, 0 seconds" ) ), ConsesLow.list( ConsesLow
                      .list( makeDouble( 4520.9300000000003D ) ), makeString( "75 minutes, 21 seconds" ) ), ConsesLow.list( ConsesLow.list( makeDouble( 40688.370000000003D ) ), makeString( "11 hours, 18 minutes" ) ),
      ConsesLow.list( ConsesLow.list( makeDouble( 81376.740000000005D ) ), makeString( "22 hours, 36 minutes" ) )
    } );
    $list63 = ConsesLow.list( new SubLObject[] { Characters.CHAR_y, Characters.CHAR_Y, Characters.CHAR_m, Characters.CHAR_M, Characters.CHAR_d, Characters.CHAR_D, Characters.CHAR_slash, Characters.CHAR_hyphen,
      Characters.CHAR_underbar
    } );
    $list64 = ConsesLow.list( Characters.CHAR_h, Characters.CHAR_H, Characters.CHAR_m, Characters.CHAR_M, Characters.CHAR_s, Characters.CHAR_S, Characters.CHAR_colon );
    $list92 = ConsesLow.list( makeSymbol( "WHOLE-SECONDS" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MINUTES" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "HOURS" ), ZERO_INTEGER ), ConsesLow.list(
        makeSymbol( "ELAPSED-DAYS" ), ZERO_INTEGER ) );
    $list93 = ConsesLow.list( makeSymbol( "WHOLE-SECONDS" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "MINUTES" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "HOURS" ), ZERO_INTEGER ) );
    $list130 = ConsesLow.list( ConsesLow.cons( ZERO_INTEGER, makeString( "Mon" ) ), ConsesLow.cons( ONE_INTEGER, makeString( "Tue" ) ), ConsesLow.cons( TWO_INTEGER, makeString( "Wed" ) ), ConsesLow.cons( THREE_INTEGER,
        makeString( "Thu" ) ), ConsesLow.cons( FOUR_INTEGER, makeString( "Fri" ) ), ConsesLow.cons( FIVE_INTEGER, makeString( "Sat" ) ), ConsesLow.cons( SIX_INTEGER, makeString( "Sun" ) ) );
    $list131 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( ONE_INTEGER, makeString( "Jan" ) ), ConsesLow.cons( TWO_INTEGER, makeString( "Feb" ) ), ConsesLow.cons( THREE_INTEGER, makeString( "Mar" ) ), ConsesLow
        .cons( FOUR_INTEGER, makeString( "Apr" ) ), ConsesLow.cons( FIVE_INTEGER, makeString( "May" ) ), ConsesLow.cons( SIX_INTEGER, makeString( "Jun" ) ), ConsesLow.cons( SEVEN_INTEGER, makeString( "Jul" ) ), ConsesLow
            .cons( EIGHT_INTEGER, makeString( "Aug" ) ), ConsesLow.cons( NINE_INTEGER, makeString( "Sep" ) ), ConsesLow.cons( TEN_INTEGER, makeString( "Oct" ) ), ConsesLow.cons( ELEVEN_INTEGER, makeString( "Nov" ) ),
      ConsesLow.cons( TWELVE_INTEGER, makeString( "Dec" ) )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 1993L)
  public static SubLObject elapsed_milliseconds(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject time = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    time = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym11$PROGN, ConsesLow.listS( $sym12$CTIME, time, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym13$CSETQ, time, ConsesLow.list( $sym14$TRUNCATE, ConsesLow.listS( $sym15$_, time,
          $list16 ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list10 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 2227L)
  public static SubLObject valid_year_number_p(final SubLObject v_object)
  {
    return Types.integerp( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 2369L)
  public static SubLObject valid_month_number_p(final SubLObject v_object)
  {
    return SubLObjectFactory.makeBoolean( NIL != subl_promotions.positive_integer_p( v_object ) && v_object.numLE( TWELVE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 2545L)
  public static SubLObject valid_day_number_p(final SubLObject v_object)
  {
    return SubLObjectFactory.makeBoolean( NIL != subl_promotions.positive_integer_p( v_object ) && v_object.numLE( $int17$31 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 2756L)
  public static SubLObject valid_day_for_month_p(final SubLObject v_object, final SubLObject month, final SubLObject year)
  {
    return SubLObjectFactory.makeBoolean( NIL != subl_promotions.positive_integer_p( v_object ) && v_object.numLE( days_in_month_number( month, year ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 3067L)
  public static SubLObject valid_hour_number_p(final SubLObject v_object)
  {
    return SubLObjectFactory.makeBoolean( NIL != subl_promotions.non_negative_integer_p( v_object ) && v_object.numLE( $int18$23 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 3245L)
  public static SubLObject valid_minute_number_p(final SubLObject v_object)
  {
    return SubLObjectFactory.makeBoolean( NIL != subl_promotions.non_negative_integer_p( v_object ) && v_object.numLE( $int19$59 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 3429L)
  public static SubLObject valid_second_number_p(final SubLObject v_object)
  {
    return SubLObjectFactory.makeBoolean( NIL != subl_promotions.non_negative_integer_p( v_object ) && v_object.numLE( $int19$59 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 3613L)
  public static SubLObject universal_time_p(final SubLObject v_object)
  {
    return Types.integerp( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 3890L)
  public static SubLObject universal_time_seconds_from_now(final SubLObject seconds, SubLObject reference_time)
  {
    if( reference_time == UNPROVIDED )
    {
      reference_time = Time.get_universal_time();
    }
    return Numbers.add( reference_time, seconds.isInteger() ? seconds : Numbers.truncate( seconds, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 4253L)
  public static SubLObject time_from_now(final SubLObject seconds)
  {
    return universal_time_seconds_from_now( seconds, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 4422L)
  public static SubLObject universal_time_from_now(final SubLObject seconds, SubLObject minutes, SubLObject hours)
  {
    if( minutes == UNPROVIDED )
    {
      minutes = ZERO_INTEGER;
    }
    if( hours == UNPROVIDED )
    {
      hours = ZERO_INTEGER;
    }
    final SubLObject total_minutes = Numbers.add( minutes, Numbers.multiply( $minutes_in_an_hour$.getGlobalValue(), hours ) );
    final SubLObject total_seconds = Numbers.add( seconds, Numbers.multiply( $seconds_in_a_minute$.getGlobalValue(), total_minutes ) );
    return universal_time_seconds_from_now( total_seconds, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 4703L)
  public static SubLObject timestring(SubLObject universal_time)
  {
    if( universal_time == UNPROVIDED )
    {
      universal_time = Time.get_universal_time();
    }
    assert NIL != universal_time_p( universal_time ) : universal_time;
    return timestring_int( universal_time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 5020L)
  public static SubLObject timestring_ms(SubLObject universal_time, SubLObject universal_millisecond)
  {
    if( universal_time == UNPROVIDED )
    {
      universal_time = Time.get_universal_time();
    }
    if( universal_millisecond == UNPROVIDED )
    {
      universal_millisecond = get_universal_millisecond( UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject second = Time.decode_universal_time( universal_time, UNPROVIDED );
    final SubLObject minute = thread.secondMultipleValue();
    final SubLObject hour = thread.thirdMultipleValue();
    final SubLObject day = thread.fourthMultipleValue();
    final SubLObject month = thread.fifthMultipleValue();
    final SubLObject year = thread.sixthMultipleValue();
    thread.resetMultipleValues();
    return PrintLow.format( NIL, $str23$_D__2__0D__2__0D__2__0D__2__0D__2, new SubLObject[] { year, month, day, hour, minute, second, Numbers.mod( universal_millisecond, $int1$1000 )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 5640L)
  public static SubLObject timestring_ms_utc(SubLObject universal_time, SubLObject universal_millisecond)
  {
    if( universal_time == UNPROVIDED )
    {
      universal_time = Time.get_universal_time();
    }
    if( universal_millisecond == UNPROVIDED )
    {
      universal_millisecond = get_universal_millisecond( UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject second = Time.decode_universal_time( universal_time, ZERO_INTEGER );
    final SubLObject minute = thread.secondMultipleValue();
    final SubLObject hour = thread.thirdMultipleValue();
    final SubLObject day = thread.fourthMultipleValue();
    final SubLObject month = thread.fifthMultipleValue();
    final SubLObject year = thread.sixthMultipleValue();
    thread.resetMultipleValues();
    return PrintLow.format( NIL, $str24$_D__2__0D__2__0DT_2__0D__2__0D__2, new SubLObject[] { year, month, day, hour, minute, second, Numbers.mod( universal_millisecond, $int1$1000 )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 6251L)
  public static SubLObject safe_timestring(final SubLObject v_object)
  {
    if( NIL != universal_time_p( v_object ) )
    {
      return timestring_int( v_object );
    }
    return $str25$;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 6493L)
  public static SubLObject timestring_int(final SubLObject universal_time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject second = Time.decode_universal_time( universal_time, UNPROVIDED );
    final SubLObject minute = thread.secondMultipleValue();
    final SubLObject hour = thread.thirdMultipleValue();
    final SubLObject date = thread.fourthMultipleValue();
    final SubLObject month = thread.fifthMultipleValue();
    final SubLObject year = thread.sixthMultipleValue();
    thread.resetMultipleValues();
    return encode_timestring( second, minute, hour, date, month, year );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 6715L)
  public static SubLObject timestamp(SubLObject universal_date, SubLObject universal_second)
  {
    if( universal_date == UNPROVIDED )
    {
      universal_date = get_universal_date( UNPROVIDED, UNPROVIDED );
    }
    if( universal_second == UNPROVIDED )
    {
      universal_second = get_universal_second( UNPROVIDED );
    }
    return PrintLow.format( NIL, $str26$_a__6__0D, universal_date, universal_second );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 6899L)
  public static SubLObject numeric_timestamp(SubLObject universal_date, SubLObject universal_second)
  {
    if( universal_date == UNPROVIDED )
    {
      universal_date = get_universal_date( UNPROVIDED, UNPROVIDED );
    }
    if( universal_second == UNPROVIDED )
    {
      universal_second = get_universal_second( UNPROVIDED );
    }
    return Numbers.add( Numbers.multiply( $int0$1000000, universal_date ), universal_second );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 7082L)
  public static SubLObject timestamp_with_milliseconds(SubLObject universal_date, SubLObject universal_millisecond)
  {
    if( universal_date == UNPROVIDED )
    {
      universal_date = get_universal_date( UNPROVIDED, UNPROVIDED );
    }
    if( universal_millisecond == UNPROVIDED )
    {
      universal_millisecond = get_universal_millisecond( UNPROVIDED );
    }
    return PrintLow.format( NIL, $str27$_a__6__0D__3__0D, new SubLObject[] { universal_date, number_utilities.div( universal_millisecond, $int1$1000 ), Numbers.rem( universal_millisecond, $int1$1000 )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 7350L)
  public static SubLObject encode_timestring(final SubLObject second, final SubLObject minute, final SubLObject hour, final SubLObject date, final SubLObject month, final SubLObject year)
  {
    return encode_datetime_string_from_template( NIL, second, minute, hour, date, month, year, $str28$mm_dd_yyyy_hh_mm_ss );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 7525L)
  public static SubLObject universal_timestring(SubLObject universal_time)
  {
    if( universal_time == UNPROVIDED )
    {
      universal_time = Time.get_universal_time();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != universal_time_p( universal_time ) : universal_time;
    thread.resetMultipleValues();
    final SubLObject second = Time.decode_universal_time( universal_time, UNPROVIDED );
    final SubLObject minute = thread.secondMultipleValue();
    final SubLObject hour = thread.thirdMultipleValue();
    final SubLObject date = thread.fourthMultipleValue();
    final SubLObject month = thread.fifthMultipleValue();
    final SubLObject year = thread.sixthMultipleValue();
    thread.resetMultipleValues();
    return encode_universal_timestring( second, minute, hour, date, month, year );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 7982L)
  public static SubLObject encode_universal_timestring(final SubLObject second, final SubLObject minute, final SubLObject hour, final SubLObject date, final SubLObject month, final SubLObject year)
  {
    return PrintLow.format( NIL, $str29$_D_2__0D_2__0D_2__0D_2__0D_2__0D, new SubLObject[] { year, month, date, hour, minute, second
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 8158L)
  public static SubLObject get_universal_time_today(final SubLObject second, final SubLObject minute, final SubLObject hour)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject second_now = Time.decode_universal_time( Time.get_universal_time(), UNPROVIDED );
    final SubLObject minute_now = thread.secondMultipleValue();
    final SubLObject hour_now = thread.thirdMultipleValue();
    final SubLObject day_now = thread.fourthMultipleValue();
    final SubLObject month_now = thread.fifthMultipleValue();
    final SubLObject year_now = thread.sixthMultipleValue();
    thread.resetMultipleValues();
    return Time.encode_universal_time( second, minute, hour, day_now, month_now, year_now, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 8547L)
  public static SubLObject get_universal_time_within_next_day(final SubLObject second, final SubLObject minute, final SubLObject hour)
  {
    final SubLObject time_now = Time.get_universal_time();
    final SubLObject time_today = get_universal_time_today( second, minute, hour );
    if( time_today.numG( time_now ) )
    {
      return time_today;
    }
    final SubLObject time_tomorrow = Numbers.add( $seconds_in_a_day$.getGlobalValue(), time_today );
    return time_tomorrow;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 8955L)
  public static SubLObject universal_time_day_of_week_number(SubLObject universal_time)
  {
    if( universal_time == UNPROVIDED )
    {
      universal_time = Time.get_universal_time();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != universal_time_p( universal_time ) : universal_time;
    thread.resetMultipleValues();
    final SubLObject second = Time.decode_universal_time( universal_time, UNPROVIDED );
    final SubLObject minute = thread.secondMultipleValue();
    final SubLObject hour = thread.thirdMultipleValue();
    final SubLObject day = thread.fourthMultipleValue();
    final SubLObject month = thread.fifthMultipleValue();
    final SubLObject year = thread.sixthMultipleValue();
    final SubLObject day_of_week = thread.seventhMultipleValue();
    final SubLObject daylight_saving_time_p = thread.eighthMultipleValue();
    final SubLObject time_zone = SubLProcess.nthMultipleValue( EIGHT_INTEGER );
    thread.resetMultipleValues();
    return day_of_week;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 9475L)
  public static SubLObject internal_real_time_p(final SubLObject v_object)
  {
    return subl_promotions.non_negative_integer_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 9709L)
  public static SubLObject internal_real_time_seconds_from_now(final SubLObject seconds, SubLObject reference_time)
  {
    if( reference_time == UNPROVIDED )
    {
      reference_time = Time.get_internal_real_time();
    }
    return Numbers.add( reference_time, elapsed_seconds_to_elapsed_internal_real_time( seconds ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 10077L)
  public static SubLObject elapsed_internal_real_time(final SubLObject reference_time, SubLObject comparison_time)
  {
    if( comparison_time == UNPROVIDED )
    {
      comparison_time = Time.get_internal_real_time();
    }
    return Numbers.subtract( comparison_time, reference_time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 10493L)
  public static SubLObject elapsed_internal_real_time_to_elapsed_seconds(final SubLObject elapsed)
  {
    return Numbers.divide( elapsed, time_high.$internal_time_units_per_second$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 10652L)
  public static SubLObject elapsed_seconds_to_elapsed_internal_real_time(final SubLObject elapsed)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject v_answer = Numbers.truncate( Numbers.multiply( elapsed, time_high.$internal_time_units_per_second$.getGlobalValue() ), UNPROVIDED );
    final SubLObject remainder = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 10903L)
  public static SubLObject elapsed_seconds_between_internal_real_times(final SubLObject start_time, final SubLObject end_time)
  {
    return elapsed_internal_real_time_to_elapsed_seconds( elapsed_internal_real_time( start_time, end_time ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 11091L)
  public static SubLObject readable_elapsed_time_string(final SubLObject seconds, SubLObject decimal_precision)
  {
    if( decimal_precision == UNPROVIDED )
    {
      decimal_precision = TWO_INTEGER;
    }
    assert NIL != number_utilities.non_negative_number_p( seconds ) : seconds;
    assert NIL != subl_promotions.non_negative_integer_p( decimal_precision ) : decimal_precision;
    if( !decimal_precision.numLE( ZERO_INTEGER ) )
    {
      if( seconds.numGE( Numbers.multiply( TWO_INTEGER, $seconds_in_a_minute$.getGlobalValue() ) ) )
      {
        decimal_precision = ZERO_INTEGER;
      }
      else if( seconds.numL( ONE_INTEGER ) && seconds.numGE( Numbers.divide( $int9$100, $milliseconds_in_a_second$.getGlobalValue() ) ) )
      {
        decimal_precision = ZERO_INTEGER;
      }
      else if( decimal_precision.isPositive() && seconds.numGE( $seconds_in_a_minute$.getGlobalValue() ) )
      {
        decimal_precision = ONE_INTEGER;
      }
    }
    SubLObject hours = Numbers.floor( Numbers.divide( seconds, $seconds_in_an_hour$.getGlobalValue() ), UNPROVIDED );
    final SubLObject use_hoursP = Numbers.numGE( hours, TWO_INTEGER );
    final SubLObject time_minus_hours = ( NIL != use_hoursP ) ? Numbers.subtract( seconds, Numbers.multiply( hours, $seconds_in_an_hour$.getGlobalValue() ) ) : seconds;
    SubLObject minutes = Numbers.floor( Numbers.divide( time_minus_hours, $seconds_in_a_minute$.getGlobalValue() ), UNPROVIDED );
    final SubLObject use_minutesP = SubLObjectFactory.makeBoolean( NIL != use_hoursP || minutes.numGE( TWO_INTEGER ) );
    SubLObject seconds_$1 = ( NIL != use_minutesP ) ? Numbers.subtract( time_minus_hours, Numbers.multiply( minutes, $seconds_in_a_minute$.getGlobalValue() ) ) : time_minus_hours;
    final SubLObject use_secondsP = SubLObjectFactory.makeBoolean( NIL != use_minutesP || seconds_$1.numGE( ONE_INTEGER ) );
    SubLObject millis = ( NIL != use_secondsP ) ? NIL : Numbers.multiply( $milliseconds_in_a_second$.getGlobalValue(), seconds_$1 );
    final SubLObject smallest_unit_string = ( NIL != use_secondsP ) ? $str32$_second__P : $str33$ms;
    final SubLObject smallest_unit_format_string = decimal_precision.isZero() ? Sequences.cconcatenate( $str34$_D, smallest_unit_string )
        : Sequences.cconcatenate( $str35$__, new SubLObject[]
        { format_nil.format_nil_d( decimal_precision ), $str36$F, smallest_unit_string
        } );
    if( decimal_precision.isZero() )
    {
      seconds_$1 = Numbers.round( seconds_$1, UNPROVIDED );
      millis = ( NIL != millis ) ? Numbers.round( millis, UNPROVIDED ) : NIL;
      if( NIL != use_minutesP && seconds_$1.eql( $seconds_in_a_minute$.getGlobalValue() ) )
      {
        seconds_$1 = ZERO_INTEGER;
        minutes = Numbers.add( minutes, ONE_INTEGER );
      }
      if( NIL != use_hoursP && minutes.eql( $minutes_in_an_hour$.getGlobalValue() ) )
      {
        minutes = ZERO_INTEGER;
        hours = Numbers.add( hours, ONE_INTEGER );
      }
    }
    return format_nil.format_nil_a( ( NIL != use_secondsP ) ? ( ( NIL != use_minutesP ) ? ( ( NIL != use_hoursP ) ? PrintLow.format( NIL, $str37$_D_hours___D_minute__P, hours, minutes )
        : PrintLow.format( NIL, Sequences.cconcatenate( $str38$_D_minute__P__, smallest_unit_format_string ), minutes, seconds_$1 ) ) : PrintLow.format( NIL, smallest_unit_format_string, seconds_$1 ) )
        : PrintLow.format( NIL, smallest_unit_format_string, millis ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 13879L)
  public static SubLObject explode_elapsed_time_ms(final SubLObject possible_float_ms)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject ms = Numbers.floor( possible_float_ms, UNPROVIDED );
    final SubLObject sub_1_ms = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject days = Numbers.floor( Numbers.divide( ms, new SubLObject[] { $milliseconds_in_a_second$.getGlobalValue(), $seconds_in_a_day$.getGlobalValue()
    } ), UNPROVIDED );
    final SubLObject day_milliseconds = Numbers.multiply( days, $seconds_in_a_day$.getGlobalValue(), $milliseconds_in_a_second$.getGlobalValue() );
    final SubLObject hours = Numbers.floor( Numbers.divide( Numbers.subtract( ms, day_milliseconds ), new SubLObject[] { $milliseconds_in_a_second$.getGlobalValue(), $seconds_in_an_hour$.getGlobalValue()
    } ), UNPROVIDED );
    final SubLObject hours_milliseconds = Numbers.multiply( hours, $seconds_in_an_hour$.getGlobalValue(), $milliseconds_in_a_second$.getGlobalValue() );
    final SubLObject minutes = Numbers.floor( Numbers.divide( Numbers.subtract( ms, day_milliseconds, hours_milliseconds ), new SubLObject[] { $milliseconds_in_a_second$.getGlobalValue(), $seconds_in_a_minute$
        .getGlobalValue()
    } ), UNPROVIDED );
    final SubLObject minutes_milliseconds = Numbers.multiply( minutes, $seconds_in_a_minute$.getGlobalValue(), $milliseconds_in_a_second$.getGlobalValue() );
    final SubLObject seconds = Numbers.floor( Numbers.divide( Numbers.subtract( ms, new SubLObject[] { day_milliseconds, hours_milliseconds, minutes_milliseconds
    } ), $milliseconds_in_a_second$.getGlobalValue() ), UNPROVIDED );
    final SubLObject seconds_milliseconds = Numbers.multiply( seconds, $milliseconds_in_a_second$.getGlobalValue() );
    final SubLObject milliseconds = Numbers.subtract( ms, new SubLObject[] { day_milliseconds, hours_milliseconds, minutes_milliseconds, seconds_milliseconds
    } );
    final SubLObject microseconds = Numbers.floor( Numbers.multiply( $microseconds_in_a_millisecond$.getGlobalValue(), sub_1_ms ), UNPROVIDED );
    return ConsesLow.list( days, hours, minutes, seconds, milliseconds, microseconds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 15041L)
  public static SubLObject readable_elapsed_time_string_ms(final SubLObject ms)
  {
    if( NIL != number_utilities.negative_number_p( ms ) )
    {
      return Sequences.cconcatenate( $str47$_, format_nil.format_nil_a_no_copy( readable_elapsed_time_string_ms( Numbers.minus( ms ) ) ) );
    }
    SubLObject current;
    final SubLObject datum = current = explode_elapsed_time_ms( ms );
    SubLObject days = NIL;
    SubLObject hours = NIL;
    SubLObject minutes = NIL;
    SubLObject seconds = NIL;
    SubLObject milliseconds = NIL;
    SubLObject microseconds = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    days = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    hours = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    minutes = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    seconds = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    milliseconds = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list48 );
    microseconds = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list48 );
      return NIL;
    }
    if( NIL != subl_promotions.positive_integer_p( days ) && hours.isZero() )
    {
      return PrintLow.format( NIL, $str49$_D_day__P, days );
    }
    if( NIL != subl_promotions.positive_integer_p( days ) )
    {
      return PrintLow.format( NIL, $str50$_D_hour__P, Numbers.add( Numbers.multiply( $int8$24, days ), hours ) );
    }
    if( NIL != subl_promotions.positive_integer_p( hours ) && minutes.isZero() )
    {
      return PrintLow.format( NIL, $str50$_D_hour__P, hours, hours );
    }
    if( NIL != subl_promotions.positive_integer_p( hours ) )
    {
      return PrintLow.format( NIL, $str51$_D__2__0D_hour_P, new SubLObject[] { hours, minutes, Numbers.add( hours, minutes )
      } );
    }
    if( NIL != subl_promotions.positive_integer_p( minutes ) && seconds.isZero() )
    {
      return PrintLow.format( NIL, $str52$_D_minute__P, minutes );
    }
    if( NIL != subl_promotions.positive_integer_p( minutes ) )
    {
      return PrintLow.format( NIL, $str53$_D__2__0D_minute_P, new SubLObject[] { minutes, seconds, Numbers.add( minutes, seconds )
      } );
    }
    if( NIL != subl_promotions.positive_integer_p( seconds ) && TEN_INTEGER.numG( milliseconds ) )
    {
      return PrintLow.format( NIL, $str54$_D_second__P, seconds );
    }
    if( NIL != subl_promotions.positive_integer_p( seconds ) )
    {
      final SubLObject centiseconds = Numbers.round( Numbers.divide( milliseconds, TEN_INTEGER ), UNPROVIDED );
      return PrintLow.format( NIL, $str55$_D__2__0D_second_P, new SubLObject[] { seconds, centiseconds, Numbers.add( seconds, centiseconds )
      } );
    }
    if( milliseconds.isPositive() )
    {
      return Sequences.cconcatenate( format_nil.format_nil_d_no_copy( milliseconds ), $str56$_ms );
    }
    if( microseconds.isPositive() )
    {
      return Sequences.cconcatenate( format_nil.format_nil_d_no_copy( microseconds ), $str57$___s );
    }
    return Sequences.copy_seq( $str58$0___s );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 16521L)
  public static SubLObject datetime_string_from_template(SubLObject universal_time, SubLObject template)
  {
    if( universal_time == UNPROVIDED )
    {
      universal_time = Time.get_universal_time();
    }
    if( template == UNPROVIDED )
    {
      template = $str28$mm_dd_yyyy_hh_mm_ss;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != universal_time_p( universal_time ) : universal_time;
    assert NIL != datetime_string_template_p( template ) : template;
    thread.resetMultipleValues();
    final SubLObject second = Time.decode_universal_time( universal_time, UNPROVIDED );
    final SubLObject minute = thread.secondMultipleValue();
    final SubLObject hour = thread.thirdMultipleValue();
    final SubLObject day = thread.fourthMultipleValue();
    final SubLObject month = thread.fifthMultipleValue();
    final SubLObject year = thread.sixthMultipleValue();
    thread.resetMultipleValues();
    return encode_datetime_string_from_template( NIL, second, minute, hour, day, month, year, template );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 18853L)
  public static SubLObject encode_datetime_string_from_template(final SubLObject millisecond, final SubLObject second, final SubLObject minute, final SubLObject hour, final SubLObject day, final SubLObject month,
      final SubLObject year, final SubLObject template)
  {
    assert NIL != datetime_string_template_p( template ) : template;
    final SubLObject subtemplates = string_utilities.break_words( template, Symbols.symbol_function( $sym60$NON_DATE_TIME_WHITESPACE_P ), UNPROVIDED );
    if( Sequences.length( subtemplates ).numE( TWO_INTEGER ) && NIL != date_template_p( subtemplates.first() ) && NIL != time_template_p( conses_high.second( subtemplates ) ) )
    {
      return PrintLow.format( NIL, $str61$_A__A, encode_date_from_template( day, month, year, subtemplates.first() ), encode_time_from_template( millisecond, second, minute, hour, conses_high.second( subtemplates ) ) );
    }
    if( Sequences.length( subtemplates ).numE( TWO_INTEGER ) && NIL != time_template_p( subtemplates.first() ) && NIL != date_template_p( conses_high.second( subtemplates ) ) )
    {
      return PrintLow.format( NIL, $str61$_A__A, encode_time_from_template( millisecond, second, minute, hour, subtemplates.first() ), encode_date_from_template( day, month, year, conses_high.second( subtemplates ) ) );
    }
    if( Sequences.length( subtemplates ).numE( ONE_INTEGER ) && NIL != date_template_p( subtemplates.first() ) )
    {
      return encode_date_from_template( day, month, year, subtemplates.first() );
    }
    if( Sequences.length( subtemplates ).numE( ONE_INTEGER ) && NIL != time_template_p( subtemplates.first() ) )
    {
      return encode_time_from_template( millisecond, second, minute, hour, subtemplates.first() );
    }
    Errors.error( $str62$Template__s_is_not_a_valid_dateti, template );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 20504L)
  public static SubLObject valid_date_template_char(final SubLObject v_char)
  {
    return conses_high.member( v_char, $list63, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 20615L)
  public static SubLObject valid_time_template_char(final SubLObject v_char)
  {
    return conses_high.member( v_char, $list64, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 20718L)
  public static SubLObject valid_date_separator(final SubLObject v_char)
  {
    return makeBoolean( v_char.eql( Characters.CHAR_slash ) || v_char.eql( Characters.CHAR_hyphen ) || v_char.eql( Characters.CHAR_underbar ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 20833L)
  public static SubLObject valid_time_separator(final SubLObject v_char)
  {
    return Equality.eql( v_char, Characters.CHAR_colon );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 20902L)
  public static SubLObject valid_year_token(final SubLObject v_char)
  {
    return SubLObjectFactory.makeBoolean( v_char.eql( Characters.CHAR_y ) || v_char.eql( Characters.CHAR_Y ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 20993L)
  public static SubLObject valid_month_token(final SubLObject v_char)
  {
    return SubLObjectFactory.makeBoolean( v_char.eql( Characters.CHAR_m ) || v_char.eql( Characters.CHAR_M ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 21085L)
  public static SubLObject valid_day_token(final SubLObject v_char)
  {
    return SubLObjectFactory.makeBoolean( v_char.eql( Characters.CHAR_d ) || v_char.eql( Characters.CHAR_D ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 21175L)
  public static SubLObject valid_hour_token(final SubLObject v_char)
  {
    return SubLObjectFactory.makeBoolean( v_char.eql( Characters.CHAR_h ) || v_char.eql( Characters.CHAR_H ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 21266L)
  public static SubLObject valid_minute_token(final SubLObject v_char)
  {
    return SubLObjectFactory.makeBoolean( v_char.eql( Characters.CHAR_m ) || v_char.eql( Characters.CHAR_M ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 21359L)
  public static SubLObject valid_second_token(final SubLObject v_char)
  {
    return SubLObjectFactory.makeBoolean( v_char.eql( Characters.CHAR_s ) || v_char.eql( Characters.CHAR_S ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 21452L)
  public static SubLObject date_template_p(final SubLObject template)
  {
    if( NIL == list_utilities.find_if_not( Symbols.symbol_function( $sym65$VALID_DATE_TEMPLATE_CHAR ), template, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 21595L)
  public static SubLObject time_template_p(final SubLObject template)
  {
    return SubLObjectFactory.makeBoolean( template.equalp( $str66$hh_mm_ss ) || template.equalp( $str67$hh_mm_ss_mmm ) || template.equalp( $str68$hh_mm ) || template.equalp( $str69$hh_mm_ss_m ) || template.equalp(
        $str70$hh_mm_ss_mm ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 21860L)
  public static SubLObject datetime_string_template_p(final SubLObject template)
  {
    final SubLObject parts = string_utilities.break_words( template, Symbols.symbol_function( $sym60$NON_DATE_TIME_WHITESPACE_P ), UNPROVIDED );
    final SubLObject length = Sequences.length( parts );
    if( !length.numGE( ONE_INTEGER ) || !length.numLE( TWO_INTEGER ) )
    {
      return NIL;
    }
    final SubLObject part1 = ConsesLow.nth( ZERO_INTEGER, parts );
    final SubLObject part2 = ConsesLow.nth( ONE_INTEGER, parts );
    if( ( NIL != time_template_p( part1 ) && ( NIL == part2 || NIL != date_template_p( part2 ) ) ) || ( NIL != date_template_p( part1 ) && ( NIL == part2 || NIL != time_template_p( part2 ) ) ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 22467L)
  public static SubLObject non_date_time_whitespace_p(final SubLObject v_char)
  {
    return makeBoolean( NIL == date_time_whitespace_p( v_char ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 22564L)
  public static SubLObject date_time_whitespace_p(final SubLObject v_char)
  {
    return SubLObjectFactory.makeBoolean( NIL != string_utilities.whitespacep( v_char ) || v_char.eql( Characters.CHAR_T ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 22665L)
  public static SubLObject n_digit_template_element_p(final SubLObject template, final SubLObject n, final SubLObject token_checker, final SubLObject separator_checker)
  {
    if( Sequences.length( template ).numL( n ) )
    {
      return NIL;
    }
    SubLObject index;
    for( index = NIL, index = ZERO_INTEGER; index.numL( n ); index = Numbers.add( index, ONE_INTEGER ) )
    {
      if( NIL == Functions.funcall( token_checker, Strings.sublisp_char( template, index ) ) )
      {
        return NIL;
      }
    }
    if( Sequences.length( template ).numG( n ) && NIL == Functions.funcall( separator_checker, Strings.sublisp_char( template, n ) ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 23089L)
  public static SubLObject encode_date_from_template(final SubLObject day, final SubLObject month, final SubLObject year, final SubLObject template)
  {
    if( NIL != n_digit_template_element_p( template, FOUR_INTEGER, Symbols.symbol_function( $sym71$VALID_YEAR_TOKEN ), Symbols.symbol_function( $sym72$VALID_DATE_SEPARATOR ) ) )
    {
      return encode_next_date_element( day, month, year, template, FOUR_INTEGER, year );
    }
    if( NIL != n_digit_template_element_p( template, TWO_INTEGER, Symbols.symbol_function( $sym71$VALID_YEAR_TOKEN ), Symbols.symbol_function( $sym72$VALID_DATE_SEPARATOR ) ) )
    {
      return encode_next_date_element( day, month, year, template, TWO_INTEGER, Numbers.mod( year, $int9$100 ) );
    }
    if( NIL != n_digit_template_element_p( template, TWO_INTEGER, Symbols.symbol_function( $sym73$VALID_MONTH_TOKEN ), Symbols.symbol_function( $sym72$VALID_DATE_SEPARATOR ) ) )
    {
      return encode_next_date_element( day, month, year, template, TWO_INTEGER, month );
    }
    if( NIL != n_digit_template_element_p( template, TWO_INTEGER, Symbols.symbol_function( $sym74$VALID_DAY_TOKEN ), Symbols.symbol_function( $sym72$VALID_DATE_SEPARATOR ) ) )
    {
      return encode_next_date_element( day, month, year, template, TWO_INTEGER, day );
    }
    Errors.error( $str75$Template_or_template_portion__S_d, template );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 23897L)
  public static SubLObject encode_next_date_element(final SubLObject day, final SubLObject month, final SubLObject year, final SubLObject template, final SubLObject elem_length, final SubLObject item)
  {
    final SubLObject format_string = Sequences.cconcatenate( $str76$_, new SubLObject[] { string_utilities.to_string( elem_length ), $str77$__0D
    } );
    return Sequences.cconcatenate( PrintLow.format( NIL, format_string, item ), Numbers.add( elem_length, ONE_INTEGER ).numG( Sequences.length( template ) ) ? $str25$
        : Sequences.cconcatenate( string_utilities.to_string( Strings.sublisp_char( template, elem_length ) ), encode_date_from_template( day, month, year, string_utilities.substring( template, Numbers.add( elem_length,
            ONE_INTEGER ), UNPROVIDED ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 24325L)
  public static SubLObject encode_time_from_template(final SubLObject millisecond, final SubLObject second, final SubLObject minute, final SubLObject hour, final SubLObject template)
  {
    if( NIL == hour )
    {
      return $str25$;
    }
    if( template.equalp( $str66$hh_mm_ss ) )
    {
      return PrintLow.format( NIL, $str78$_2__0D__2__0D__2__0D, new SubLObject[] { hour, ( NIL != minute ) ? minute : ZERO_INTEGER, ( NIL != second ) ? second : ZERO_INTEGER
      } );
    }
    if( template.equalp( $str68$hh_mm ) )
    {
      return PrintLow.format( NIL, $str79$_2__0D__2__0D, hour, ( NIL != minute ) ? minute : ZERO_INTEGER );
    }
    if( template.equalp( $str67$hh_mm_ss_mmm ) )
    {
      return PrintLow.format( NIL, $str80$_2__0D__2__0D__2__0D__3__0D, new SubLObject[] { hour, ( NIL != minute ) ? minute : ZERO_INTEGER, ( NIL != second ) ? second : ZERO_INTEGER, ( NIL != millisecond ) ? millisecond
          : ZERO_INTEGER
      } );
    }
    if( template.equalp( $str70$hh_mm_ss_mm ) )
    {
      return PrintLow.format( NIL, $str81$_2__0D__2__0D__2__0D__2__0D, new SubLObject[] { hour, ( NIL != minute ) ? minute : ZERO_INTEGER, ( NIL != second ) ? second : ZERO_INTEGER, ( NIL != millisecond )
          ? number_utilities.div( millisecond, TEN_INTEGER )
          : ZERO_INTEGER
      } );
    }
    if( template.equalp( $str69$hh_mm_ss_m ) )
    {
      return PrintLow.format( NIL, $str82$_2__0D__2__0D__2__0D__1__0D, new SubLObject[] { hour, ( NIL != minute ) ? minute : ZERO_INTEGER, ( NIL != second ) ? second : ZERO_INTEGER, ( NIL != millisecond )
          ? number_utilities.div( millisecond, $int9$100 )
          : ZERO_INTEGER
      } );
    }
    Errors.error( $str83$Template_or_template_portion__A_w );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 25391L)
  public static SubLObject decode_datetime_string_from_template(final SubLObject datetime_string, final SubLObject template)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != datetime_string_template_p( template ) : template;
    final SubLObject subtemplates = string_utilities.break_words( template, Symbols.symbol_function( $sym60$NON_DATE_TIME_WHITESPACE_P ), UNPROVIDED );
    final SubLObject subdatetime_strings = string_utilities.break_words( datetime_string, Symbols.symbol_function( $sym60$NON_DATE_TIME_WHITESPACE_P ), UNPROVIDED );
    if( !Sequences.length( subtemplates ).eql( Sequences.length( subdatetime_strings ) ) )
    {
      Errors.error( $str84$The_template__S_doesn_t_match_the, template, datetime_string );
    }
    if( Sequences.length( subtemplates ).numE( TWO_INTEGER ) && NIL != date_template_p( subtemplates.first() ) && NIL != time_template_p( conses_high.second( subtemplates ) ) )
    {
      thread.resetMultipleValues();
      final SubLObject day = decode_date_from_template( subdatetime_strings.first(), subtemplates.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject month = thread.secondMultipleValue();
      final SubLObject year = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      thread.resetMultipleValues();
      final SubLObject millisecond = decode_time_from_template( conses_high.second( subdatetime_strings ), conses_high.second( subtemplates ) );
      final SubLObject second = thread.secondMultipleValue();
      final SubLObject minute = thread.thirdMultipleValue();
      final SubLObject hour = thread.fourthMultipleValue();
      thread.resetMultipleValues();
      return Values.values( millisecond, second, minute, hour, day, month, year );
    }
    if( Sequences.length( subtemplates ).numE( TWO_INTEGER ) && NIL != time_template_p( subtemplates.first() ) && NIL != date_template_p( conses_high.second( subtemplates ) ) )
    {
      thread.resetMultipleValues();
      final SubLObject millisecond2 = decode_time_from_template( subdatetime_strings.first(), subtemplates.first() );
      final SubLObject second2 = thread.secondMultipleValue();
      final SubLObject minute2 = thread.thirdMultipleValue();
      final SubLObject hour2 = thread.fourthMultipleValue();
      thread.resetMultipleValues();
      thread.resetMultipleValues();
      final SubLObject day2 = decode_date_from_template( conses_high.second( subdatetime_strings ), conses_high.second( subtemplates ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject month2 = thread.secondMultipleValue();
      final SubLObject year2 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      return Values.values( millisecond2, second2, minute2, hour2, day2, month2, year2 );
    }
    if( Sequences.length( subtemplates ).numE( ONE_INTEGER ) && NIL != date_template_p( subtemplates.first() ) )
    {
      thread.resetMultipleValues();
      final SubLObject day = decode_date_from_template( subdatetime_strings.first(), subtemplates.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject month = thread.secondMultipleValue();
      final SubLObject year = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      return Values.values( NIL, NIL, NIL, NIL, day, month, year );
    }
    if( Sequences.length( subtemplates ).numE( ONE_INTEGER ) && NIL != time_template_p( subtemplates.first() ) )
    {
      thread.resetMultipleValues();
      final SubLObject millisecond2 = decode_time_from_template( subdatetime_strings.first(), subtemplates.first() );
      final SubLObject second2 = thread.secondMultipleValue();
      final SubLObject minute2 = thread.thirdMultipleValue();
      final SubLObject hour2 = thread.fourthMultipleValue();
      thread.resetMultipleValues();
      return Values.values( millisecond2, second2, minute2, hour2, NIL, NIL, NIL );
    }
    Errors.error( $str85$Template_or_template_portion__A_w, template );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 27895L)
  public static SubLObject decode_date_from_template(final SubLObject datestring, final SubLObject template, SubLObject day, SubLObject month, SubLObject year)
  {
    if( day == UNPROVIDED )
    {
      day = NIL;
    }
    if( month == UNPROVIDED )
    {
      month = NIL;
    }
    if( year == UNPROVIDED )
    {
      year = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !TWO_INTEGER.numGE( Numbers.subtract( Sequences.length( template ), Sequences.length( datestring ) ) ) )
    {
      Errors.error( $str86$The_date_string__A_and_the_templa, datestring, template );
    }
    if( ( NIL != day && NIL != month && NIL != year ) || datestring.equal( $str25$ ) )
    {
      return Values.values( day, month, year );
    }
    if( NIL != n_digit_template_element_p( template, FOUR_INTEGER, Symbols.symbol_function( $sym71$VALID_YEAR_TOKEN ), Symbols.symbol_function( $sym72$VALID_DATE_SEPARATOR ) ) && NIL == year )
    {
      year = reader.read_from_string( datestring, NIL, $kw87$EOF, ZERO_INTEGER, FOUR_INTEGER, UNPROVIDED );
      if( Sequences.length( datestring ).numG( FOUR_INTEGER ) )
      {
        thread.resetMultipleValues();
        final SubLObject ret_day = decode_date_from_template( string_utilities.substring( datestring, FIVE_INTEGER, UNPROVIDED ), string_utilities.substring( template, FIVE_INTEGER, UNPROVIDED ), day, month, year );
        final SubLObject ret_month = thread.secondMultipleValue();
        final SubLObject ret_year = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values( ret_day, ret_month, ret_year );
      }
      return Values.values( day, month, year );
    }
    else if( NIL != n_digit_template_element_p( template, TWO_INTEGER, Symbols.symbol_function( $sym71$VALID_YEAR_TOKEN ), Symbols.symbol_function( $sym72$VALID_DATE_SEPARATOR ) ) && NIL == year )
    {
      year = reader.read_from_string( datestring, NIL, $kw87$EOF, ZERO_INTEGER, TWO_INTEGER, UNPROVIDED );
      if( Sequences.length( datestring ).numG( TWO_INTEGER ) )
      {
        thread.resetMultipleValues();
        final SubLObject ret_day = decode_date_from_template( string_utilities.substring( datestring, THREE_INTEGER, UNPROVIDED ), string_utilities.substring( template, THREE_INTEGER, UNPROVIDED ), day, month, year );
        final SubLObject ret_month = thread.secondMultipleValue();
        final SubLObject ret_year = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values( ret_day, ret_month, ret_year );
      }
      return Values.values( day, month, year );
    }
    else if( NIL != n_digit_template_element_p( template, TWO_INTEGER, Symbols.symbol_function( $sym73$VALID_MONTH_TOKEN ), Symbols.symbol_function( $sym72$VALID_DATE_SEPARATOR ) ) && NIL == month )
    {
      SubLObject month_end = Sequences.position_if( Symbols.symbol_function( $sym72$VALID_DATE_SEPARATOR ), datestring, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL == month_end )
      {
        month_end = TWO_INTEGER;
      }
      month = reader.read_from_string( datestring, NIL, $kw87$EOF, ZERO_INTEGER, month_end, UNPROVIDED );
      if( Sequences.length( datestring ).numG( month_end ) )
      {
        thread.resetMultipleValues();
        final SubLObject ret_day2 = decode_date_from_template( string_utilities.substring( datestring, number_utilities.f_1X( month_end ), UNPROVIDED ), string_utilities.substring( template, THREE_INTEGER, UNPROVIDED ),
            day, month, year );
        final SubLObject ret_month2 = thread.secondMultipleValue();
        final SubLObject ret_year2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values( ret_day2, ret_month2, ret_year2 );
      }
      return Values.values( day, month, year );
    }
    else
    {
      if( NIL == n_digit_template_element_p( template, TWO_INTEGER, Symbols.symbol_function( $sym74$VALID_DAY_TOKEN ), Symbols.symbol_function( $sym72$VALID_DATE_SEPARATOR ) ) || NIL != day )
      {
        Errors.error( $str88$Template_or_template_portion__A_d, template, datestring );
        return NIL;
      }
      SubLObject day_end = Sequences.position_if( Symbols.symbol_function( $sym72$VALID_DATE_SEPARATOR ), datestring, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL == day_end )
      {
        day_end = TWO_INTEGER;
      }
      day = reader.read_from_string( datestring, NIL, $kw87$EOF, ZERO_INTEGER, day_end, UNPROVIDED );
      if( Sequences.length( datestring ).numG( day_end ) )
      {
        thread.resetMultipleValues();
        final SubLObject ret_day2 = decode_date_from_template( string_utilities.substring( datestring, number_utilities.f_1X( day_end ), UNPROVIDED ), string_utilities.substring( template, THREE_INTEGER, UNPROVIDED ),
            day, month, year );
        final SubLObject ret_month2 = thread.secondMultipleValue();
        final SubLObject ret_year2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values( ret_day2, ret_month2, ret_year2 );
      }
      return Values.values( day, month, year );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 30720L)
  public static SubLObject decode_time_from_template(final SubLObject timestring, final SubLObject template)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == conses_high.member( template, $list89, Symbols.symbol_function( EQUALP ), UNPROVIDED ) )
    {
      Errors.error( $str90$The_template__A_is_not_a_recogniz, template );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !Sequences.length( timestring ).numE( Sequences.length( template ) ) )
    {
      Errors.error( $str91$The_time_string__A_and_the_templa, timestring, template );
    }
    final SubLObject hour = reader.read_from_string( timestring, NIL, $kw87$EOF, ZERO_INTEGER, TWO_INTEGER, UNPROVIDED );
    final SubLObject minute = reader.read_from_string( timestring, NIL, $kw87$EOF, THREE_INTEGER, FIVE_INTEGER, UNPROVIDED );
    SubLObject second = NIL;
    SubLObject millisecond = NIL;
    if( template.equalp( $str66$hh_mm_ss ) || template.equalp( $str69$hh_mm_ss_m ) || template.equalp( $str70$hh_mm_ss_mm ) || template.equalp( $str67$hh_mm_ss_mmm ) )
    {
      second = reader.read_from_string( timestring, NIL, $kw87$EOF, SIX_INTEGER, EIGHT_INTEGER, UNPROVIDED );
    }
    if( template.equalp( $str67$hh_mm_ss_mmm ) )
    {
      millisecond = reader.read_from_string( timestring, NIL, $kw87$EOF, NINE_INTEGER, TWELVE_INTEGER, UNPROVIDED );
    }
    else if( template.equalp( $str70$hh_mm_ss_mm ) )
    {
      millisecond = Numbers.multiply( TEN_INTEGER, reader.read_from_string( timestring, NIL, $kw87$EOF, NINE_INTEGER, ELEVEN_INTEGER, UNPROVIDED ) );
    }
    else if( template.equalp( $str69$hh_mm_ss_m ) )
    {
      millisecond = Numbers.multiply( $int9$100, reader.read_from_string( timestring, NIL, $kw87$EOF, NINE_INTEGER, TEN_INTEGER, UNPROVIDED ) );
    }
    return Values.values( millisecond, second, minute, hour );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 32294L)
  public static SubLObject decode_elapsed_seconds(final SubLObject elapsed_seconds)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != number_utilities.non_negative_number_p( elapsed_seconds ) : elapsed_seconds;
    thread.resetMultipleValues();
    final SubLObject truncated_exact_seconds = Numbers.truncate( elapsed_seconds, UNPROVIDED );
    final SubLObject partial_seconds = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject current;
    final SubLObject datum = current = number_utilities.decode_integer_multiples( truncated_exact_seconds, $elapsed_seconds_multiples$.getGlobalValue() );
    SubLObject whole_seconds = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list92 );
    whole_seconds = current.first();
    current = current.rest();
    final SubLObject minutes = current.isCons() ? current.first() : ZERO_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
    current = current.rest();
    final SubLObject hours = current.isCons() ? current.first() : ZERO_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
    current = current.rest();
    final SubLObject elapsed_days = current.isCons() ? current.first() : ZERO_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list92 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject seconds = Numbers.add( whole_seconds, partial_seconds );
      return Values.values( seconds, minutes, hours, elapsed_days );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list92 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 32908L)
  public static SubLObject decode_elapsed_seconds_without_days(final SubLObject elapsed_seconds)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != number_utilities.non_negative_number_p( elapsed_seconds ) : elapsed_seconds;
    thread.resetMultipleValues();
    final SubLObject truncated_exact_seconds = Numbers.truncate( elapsed_seconds, UNPROVIDED );
    final SubLObject partial_seconds = thread.secondMultipleValue();
    thread.resetMultipleValues();
    SubLObject current;
    final SubLObject datum = current = number_utilities.decode_integer_multiples( truncated_exact_seconds, $elapsed_seconds_wXo_days_multiples$.getGlobalValue() );
    SubLObject whole_seconds = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list93 );
    whole_seconds = current.first();
    current = current.rest();
    final SubLObject minutes = current.isCons() ? current.first() : ZERO_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list93 );
    current = current.rest();
    final SubLObject hours = current.isCons() ? current.first() : ZERO_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list93 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject seconds = Numbers.add( whole_seconds, partial_seconds );
      return Values.values( seconds, minutes, hours );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list93 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 33514L)
  public static SubLObject encode_elapsed_seconds(SubLObject seconds, SubLObject minutes, SubLObject hours, SubLObject elapsed_days)
  {
    if( seconds == UNPROVIDED )
    {
      seconds = ZERO_INTEGER;
    }
    if( minutes == UNPROVIDED )
    {
      minutes = ZERO_INTEGER;
    }
    if( hours == UNPROVIDED )
    {
      hours = ZERO_INTEGER;
    }
    if( elapsed_days == UNPROVIDED )
    {
      elapsed_days = ZERO_INTEGER;
    }
    assert NIL != number_utilities.non_negative_number_p( seconds ) : seconds;
    assert NIL != subl_promotions.non_negative_integer_p( minutes ) : minutes;
    assert NIL != subl_promotions.non_negative_integer_p( hours ) : hours;
    assert NIL != subl_promotions.non_negative_integer_p( elapsed_days ) : elapsed_days;
    return number_utilities.encode_integer_multiples( ConsesLow.list( seconds, minutes, hours, elapsed_days ), $elapsed_seconds_multiples$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 34041L)
  public static SubLObject encode_elapsed_seconds_string(SubLObject seconds, SubLObject minutes, SubLObject hours, SubLObject elapsed_days)
  {
    if( seconds == UNPROVIDED )
    {
      seconds = ZERO_INTEGER;
    }
    if( minutes == UNPROVIDED )
    {
      minutes = ZERO_INTEGER;
    }
    if( hours == UNPROVIDED )
    {
      hours = ZERO_INTEGER;
    }
    if( elapsed_days == UNPROVIDED )
    {
      elapsed_days = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != number_utilities.non_negative_number_p( seconds ) : seconds;
    assert NIL != subl_promotions.non_negative_integer_p( minutes ) : minutes;
    assert NIL != subl_promotions.non_negative_integer_p( hours ) : hours;
    assert NIL != subl_promotions.non_negative_integer_p( elapsed_days ) : elapsed_days;
    SubLObject result = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      if( !ZERO_INTEGER.numE( elapsed_days ) )
      {
        PrintLow.format( stream, $str94$__A_day_A, elapsed_days, ONE_INTEGER.numE( elapsed_days ) ? $str25$ : $str95$s );
      }
      if( !ZERO_INTEGER.numE( hours ) )
      {
        PrintLow.format( stream, $str96$__A_hour_A, hours, ONE_INTEGER.numE( hours ) ? $str25$ : $str95$s );
      }
      if( !ZERO_INTEGER.numE( minutes ) )
      {
        PrintLow.format( stream, $str97$__A_minute_A, minutes, ONE_INTEGER.numE( minutes ) ? $str25$ : $str95$s );
      }
      if( !ZERO_INTEGER.numE( seconds ) )
      {
        final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding( thread );
        try
        {
          reader.$read_default_float_format$.bind( $sym98$DOUBLE_FLOAT, thread );
          PrintLow.format( stream, $str99$__A_second_A, seconds.isDouble() ? number_utilities.significant_digits( seconds, EIGHT_INTEGER ) : seconds, ONE_INTEGER.numE( seconds ) ? $str25$ : $str95$s );
        }
        finally
        {
          reader.$read_default_float_format$.rebind( _prev_bind_0, thread );
        }
      }
      result = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    if( NIL != string_utilities.empty_string_p( result ) )
    {
      return $str100$_0_seconds;
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 35196L)
  public static SubLObject elapsed_seconds_string(final SubLObject elapsed_seconds)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject seconds = decode_elapsed_seconds( elapsed_seconds );
    final SubLObject minutes = thread.secondMultipleValue();
    final SubLObject hours = thread.thirdMultipleValue();
    final SubLObject elapsed_days = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    return encode_elapsed_seconds_string( seconds, minutes, hours, elapsed_days );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 35540L)
  public static SubLObject universal_date_p(final SubLObject v_object)
  {
    if( v_object.isInteger() )
    {
      if( v_object.isNegative() )
      {
        return universal_date_p( Numbers.minus( v_object ) );
      }
      final SubLObject day = Numbers.rem( v_object, $int9$100 );
      if( day.numLE( $int17$31 ) )
      {
        final SubLObject temp = Numbers.integerDivide( v_object, $int9$100 );
        final SubLObject month = Numbers.rem( temp, $int9$100 );
        if( ONE_INTEGER.numLE( month ) && month.numLE( TWELVE_INTEGER ) )
        {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 36104L)
  public static SubLObject get_universal_date(SubLObject universal_time, SubLObject time_zone)
  {
    if( universal_time == UNPROVIDED )
    {
      universal_time = Time.get_universal_time();
    }
    if( time_zone == UNPROVIDED )
    {
      time_zone = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != universal_time_p( universal_time ) : universal_time;
    thread.resetMultipleValues();
    final SubLObject second = Time.decode_universal_time( universal_time, time_zone );
    final SubLObject minute = thread.secondMultipleValue();
    final SubLObject hour = thread.thirdMultipleValue();
    final SubLObject day = thread.fourthMultipleValue();
    final SubLObject month = thread.fifthMultipleValue();
    final SubLObject year = thread.sixthMultipleValue();
    thread.resetMultipleValues();
    return encode_universal_date( day, month, year );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 36511L)
  public static SubLObject today()
  {
    return get_universal_date( UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 36610L)
  public static SubLObject yesterday()
  {
    return universal_date_subtract_days( today(), ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 36737L)
  public static SubLObject tomorrow()
  {
    return universal_date_add_days( today(), ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 36857L)
  public static SubLObject this_year()
  {
    return Values.nth_value_step_2( Values.nth_value_step_1( FIVE_INTEGER ), Time.decode_universal_time( Time.get_universal_time(), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 36998L)
  public static SubLObject universal_date_add_days(final SubLObject universal_date, final SubLObject days)
  {
    assert NIL != universal_date_p( universal_date ) : universal_date;
    assert NIL != Types.integerp( days ) : days;
    return universal_date_add_days_int( universal_date, days );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 37257L)
  public static SubLObject universal_date_subtract_days(final SubLObject universal_date, final SubLObject days)
  {
    assert NIL != universal_date_p( universal_date ) : universal_date;
    assert NIL != Types.integerp( days ) : days;
    return universal_date_add_days_int( universal_date, Numbers.minus( days ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 37528L)
  public static SubLObject universal_date_add_days_int(final SubLObject universal_date, final SubLObject days)
  {
    final SubLObject time_zone = ZERO_INTEGER;
    final SubLObject start_time = universal_time_for_start_of_universal_date( universal_date, time_zone );
    final SubLObject offset = Numbers.multiply( $seconds_in_a_day$.getGlobalValue(), days );
    final SubLObject ans_start_time = Numbers.add( start_time, offset );
    return get_universal_date( ans_start_time, time_zone );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 37842L)
  public static SubLObject decode_universal_date(SubLObject universal_date)
  {
    if( universal_date == UNPROVIDED )
    {
      universal_date = get_universal_date( UNPROVIDED, UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.integerp( universal_date ) : universal_date;
    if( universal_date.isNegative() )
    {
      thread.resetMultipleValues();
      final SubLObject day = decode_universal_date( Numbers.minus( universal_date ) );
      final SubLObject month = thread.secondMultipleValue();
      final SubLObject year = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      return Values.values( day, month, Numbers.minus( year ) );
    }
    final SubLObject day = Numbers.rem( universal_date, $int9$100 );
    final SubLObject month = Numbers.integerDivide( Numbers.rem( universal_date, $int105$10000 ), $int9$100 );
    final SubLObject year = Numbers.integerDivide( universal_date, $int105$10000 );
    return Values.values( day, month, year );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 38367L)
  public static SubLObject day_from_universal_date(SubLObject universal_date)
  {
    if( universal_date == UNPROVIDED )
    {
      universal_date = get_universal_date( UNPROVIDED, UNPROVIDED );
    }
    return Values.nth_value_step_2( Values.nth_value_step_1( ZERO_INTEGER ), decode_universal_date( universal_date ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 38519L)
  public static SubLObject month_from_universal_date(SubLObject universal_date)
  {
    if( universal_date == UNPROVIDED )
    {
      universal_date = get_universal_date( UNPROVIDED, UNPROVIDED );
    }
    return Values.nth_value_step_2( Values.nth_value_step_1( ONE_INTEGER ), decode_universal_date( universal_date ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 38673L)
  public static SubLObject year_from_universal_date(SubLObject universal_date)
  {
    if( universal_date == UNPROVIDED )
    {
      universal_date = get_universal_date( UNPROVIDED, UNPROVIDED );
    }
    return Values.nth_value_step_2( Values.nth_value_step_1( TWO_INTEGER ), decode_universal_date( universal_date ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 38826L)
  public static SubLObject encode_universal_date(final SubLObject day, final SubLObject month, final SubLObject year)
  {
    assert NIL != Types.integerp( day ) : day;
    assert NIL != Numbers.plusp( day ) : day;
    assert NIL != Types.integerp( month ) : month;
    assert NIL != Numbers.plusp( month ) : month;
    assert NIL != Types.integerp( year ) : year;
    if( year.isNegative() )
    {
      return Numbers.minus( encode_universal_date( day, month, Numbers.minus( year ) ) );
    }
    return Numbers.add( Numbers.multiply( year, $int105$10000 ), Numbers.multiply( month, $int9$100 ), day );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 39223L)
  public static SubLObject datestring(SubLObject universal_date)
  {
    if( universal_date == UNPROVIDED )
    {
      universal_date = get_universal_date( UNPROVIDED, UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != universal_date_p( universal_date ) : universal_date;
    thread.resetMultipleValues();
    final SubLObject day = decode_universal_date( universal_date );
    final SubLObject month = thread.secondMultipleValue();
    final SubLObject year = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return encode_datestring( day, month, year );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 39600L)
  public static SubLObject datestringL(final SubLObject datestring1, final SubLObject datestring2)
  {
    if( datestring_year( datestring1 ).numL( datestring_year( datestring2 ) ) )
    {
      return T;
    }
    if( datestring_year( datestring2 ).numL( datestring_year( datestring1 ) ) )
    {
      return NIL;
    }
    if( datestring_month( datestring1 ).numL( datestring_month( datestring2 ) ) )
    {
      return T;
    }
    if( datestring_month( datestring2 ).numL( datestring_month( datestring1 ) ) )
    {
      return NIL;
    }
    if( datestring_day( datestring1 ).numL( datestring_day( datestring2 ) ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 40223L)
  public static SubLObject datestring_(final SubLObject datestring1, final SubLObject datestring2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject day1 = decode_datestring( datestring1 );
    final SubLObject month1 = thread.secondMultipleValue();
    final SubLObject year1 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject day2 = decode_datestring( datestring2 );
    final SubLObject month2 = thread.secondMultipleValue();
    final SubLObject year2 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return Numbers.subtract( encode_universal_date( day1, month1, year1 ), encode_universal_date( day2, month2, year2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 40628L)
  public static SubLObject datestring_year(final SubLObject datestring)
  {
    return string_utilities.string_to_integer( string_utilities.substring( datestring, SIX_INTEGER, TEN_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 40731L)
  public static SubLObject datestring_month(final SubLObject datestring)
  {
    return string_utilities.string_to_integer( string_utilities.substring( datestring, ZERO_INTEGER, TWO_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 40834L)
  public static SubLObject datestring_day(final SubLObject datestring)
  {
    return string_utilities.string_to_integer( string_utilities.substring( datestring, THREE_INTEGER, FIVE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 40935L)
  public static SubLObject encode_datestring(final SubLObject day, final SubLObject month, final SubLObject year)
  {
    assert NIL != Types.integerp( day ) : day;
    assert NIL != Numbers.plusp( day ) : day;
    assert NIL != Types.integerp( month ) : month;
    assert NIL != Numbers.plusp( month ) : month;
    assert NIL != Types.integerp( year ) : year;
    if( !year.isNegative() && year.numL( $int105$10000 ) )
    {
      return PrintLow.format( NIL, $str107$_2__0d__2__0d__4__0d, new SubLObject[] { month, day, year
      } );
    }
    if( !year.isNegative() )
    {
      return PrintLow.format( NIL, $str108$_2__0d__2__0d__d, new SubLObject[] { month, day, year
      } );
    }
    return PrintLow.format( NIL, $str109$_2__0d__2__0d___d, new SubLObject[] { month, day, Numbers.minus( year )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 41530L)
  public static SubLObject decode_datestring(final SubLObject datestring)
  {
    return Values.values( datestring_day( datestring ), datestring_month( datestring ), datestring_year( datestring ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 41698L)
  public static SubLObject month_ago(SubLObject universal_date, SubLObject n)
  {
    if( universal_date == UNPROVIDED )
    {
      universal_date = get_universal_date( UNPROVIDED, UNPROVIDED );
    }
    if( n == UNPROVIDED )
    {
      n = ONE_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != universal_date_p( universal_date ) : universal_date;
    thread.resetMultipleValues();
    final SubLObject day = decode_universal_date( universal_date );
    SubLObject month = thread.secondMultipleValue();
    SubLObject year = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    month = Numbers.subtract( month, n );
    if( !month.numG( ZERO_INTEGER ) )
    {
      year = Numbers.subtract( year, ONE_INTEGER );
      month = Numbers.add( month, $months_in_a_year$.getGlobalValue() );
    }
    return encode_universal_date( day, month, year );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 42068L)
  public static SubLObject get_julian_date(SubLObject universal_time, SubLObject precision)
  {
    if( universal_time == UNPROVIDED )
    {
      universal_time = Time.get_universal_time();
    }
    if( precision == UNPROVIDED )
    {
      precision = $kw110$FLOAT;
    }
    assert NIL != universal_time_p( universal_time ) : universal_time;
    final SubLObject days = universal_days( universal_time, precision );
    return Numbers.add( days, julian_offset( precision ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 43046L)
  public static SubLObject julian_date_from_universal_date(final SubLObject universal_date, SubLObject afternoonP)
  {
    if( afternoonP == UNPROVIDED )
    {
      afternoonP = NIL;
    }
    assert NIL != universal_date_p( universal_date ) : universal_date;
    SubLObject universal_time = universal_time_for_start_of_universal_date( universal_date, UNPROVIDED );
    if( NIL != afternoonP )
    {
      universal_time = Numbers.add( universal_time, Numbers.multiply( TWELVE_INTEGER, $seconds_in_an_hour$.getGlobalValue() ) );
    }
    return get_julian_date( universal_time, $kw111$INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 43907L)
  public static SubLObject julian_offset(final SubLObject precision)
  {
    if( NIL == list_utilities.alist_lookup( $julian_offsets$.getGlobalValue(), precision, UNPROVIDED, UNPROVIDED ) )
    {
      $julian_offsets$.setGlobalValue( list_utilities.alist_enter( $julian_offsets$.getGlobalValue(), precision, compute_julian_offset( precision ), UNPROVIDED ) );
    }
    return list_utilities.alist_lookup( $julian_offsets$.getGlobalValue(), precision, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 44208L)
  public static SubLObject compute_julian_offset(final SubLObject precision)
  {
    SubLObject current;
    final SubLObject datum = current = $julian_date_reference$.getGlobalValue();
    SubLObject reference_universal_date = NIL;
    SubLObject reference_julian_date = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list114 );
    reference_universal_date = current.first();
    current = ( reference_julian_date = current.rest() );
    final SubLObject universal_time = universal_time_for_start_of_universal_date( reference_universal_date, UNPROVIDED );
    final SubLObject universal_date_days = universal_days( universal_time, precision );
    final SubLObject raw_offset = Numbers.subtract( reference_julian_date, universal_date_days );
    return ( precision == $kw111$INTEGER ) ? Numbers.floor( raw_offset, UNPROVIDED ) : raw_offset;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 44735L)
  public static SubLObject universal_time_for_start_of_universal_date(final SubLObject universal_date, SubLObject time_zone)
  {
    if( time_zone == UNPROVIDED )
    {
      time_zone = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject day = decode_universal_date( universal_date );
    final SubLObject month = thread.secondMultipleValue();
    final SubLObject year = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return Time.encode_universal_time( ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, day, month, year, time_zone );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 45072L)
  public static SubLObject universal_days(final SubLObject universal_time, final SubLObject precision)
  {
    if( precision.eql( $kw111$INTEGER ) )
    {
      return Numbers.integerDivide( Numbers.add( universal_time, Numbers.multiply( $seconds_in_an_hour$.getGlobalValue(), TWELVE_INTEGER ) ), $seconds_in_a_day$.getGlobalValue() );
    }
    return Numbers.divide( universal_time, $seconds_in_a_day$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 45414L)
  public static SubLObject universal_second_p(final SubLObject v_object)
  {
    if( v_object.isInteger() && !v_object.isNegative() && v_object.numLE( $int115$235959 ) && Numbers.rem( v_object, $int9$100 ).numL( $seconds_in_a_minute$.getGlobalValue() ) )
    {
      SubLObject temp = Numbers.integerDivide( v_object, $int9$100 );
      if( Numbers.rem( temp, $int9$100 ).numL( $minutes_in_an_hour$.getGlobalValue() ) )
      {
        temp = Numbers.integerDivide( temp, $int9$100 );
        if( temp.numL( $hours_in_a_day$.getGlobalValue() ) )
        {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 46014L)
  public static SubLObject get_universal_second(SubLObject universal_time)
  {
    if( universal_time == UNPROVIDED )
    {
      universal_time = Time.get_universal_time();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != universal_time_p( universal_time ) : universal_time;
    thread.resetMultipleValues();
    final SubLObject second = Time.decode_universal_time( universal_time, UNPROVIDED );
    final SubLObject minute = thread.secondMultipleValue();
    final SubLObject hour = thread.thirdMultipleValue();
    final SubLObject day = thread.fourthMultipleValue();
    final SubLObject month = thread.fifthMultipleValue();
    final SubLObject year = thread.sixthMultipleValue();
    thread.resetMultipleValues();
    return encode_universal_second( second, minute, hour );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 46425L)
  public static SubLObject decode_universal_second(SubLObject universal_second)
  {
    if( universal_second == UNPROVIDED )
    {
      universal_second = get_universal_second( UNPROVIDED );
    }
    assert NIL != Types.integerp( universal_second ) : universal_second;
    SubLObject temp = universal_second;
    SubLObject second = NIL;
    SubLObject minute = NIL;
    SubLObject hour = NIL;
    second = Numbers.rem( temp, $int9$100 );
    temp = Numbers.integerDivide( temp, $int9$100 );
    minute = Numbers.rem( temp, $int9$100 );
    temp = ( hour = Numbers.integerDivide( temp, $int9$100 ) );
    return Values.values( second, minute, hour );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 46879L)
  public static SubLObject encode_universal_second(final SubLObject second, final SubLObject minute, final SubLObject hour)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.integerp( second ) : second;
    assert NIL != Types.integerp( minute ) : minute;
    assert NIL != Types.integerp( hour ) : hour;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !ZERO_INTEGER.numLE( second ) || !second.numLE( $int19$59 ) ) )
    {
      Errors.error( $str116$second__S_not_in_the_range_0_59, second );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !ZERO_INTEGER.numLE( minute ) || !minute.numLE( $int19$59 ) ) )
    {
      Errors.error( $str117$minute__S_not_in_the_range_0_59, minute );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !ZERO_INTEGER.numLE( hour ) || !hour.numLE( $int19$59 ) ) )
    {
      Errors.error( $str118$hour__S_not_in_the_range_0_59, hour );
    }
    return Numbers.add( Numbers.multiply( hour, $int105$10000 ), Numbers.multiply( minute, $int9$100 ), second );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 47422L)
  public static SubLObject secondstring(SubLObject universal_second)
  {
    if( universal_second == UNPROVIDED )
    {
      universal_second = get_universal_second( UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != universal_second_p( universal_second ) : universal_second;
    thread.resetMultipleValues();
    final SubLObject second = decode_universal_second( universal_second );
    final SubLObject minute = thread.secondMultipleValue();
    final SubLObject hour = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return encode_secondstring( second, minute, hour );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 47840L)
  public static SubLObject encode_secondstring(final SubLObject second, final SubLObject minute, final SubLObject hour)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.integerp( second ) : second;
    assert NIL != Types.integerp( minute ) : minute;
    assert NIL != Types.integerp( hour ) : hour;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !ZERO_INTEGER.numLE( second ) || !second.numLE( $int19$59 ) ) )
    {
      Errors.error( $str116$second__S_not_in_the_range_0_59, second );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !ZERO_INTEGER.numLE( minute ) || !minute.numLE( $int19$59 ) ) )
    {
      Errors.error( $str117$minute__S_not_in_the_range_0_59, minute );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !ZERO_INTEGER.numLE( hour ) || !hour.numLE( $int19$59 ) ) )
    {
      Errors.error( $str118$hour__S_not_in_the_range_0_59, hour );
    }
    return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( hour.numL( TEN_INTEGER ) ? $str120$0 : $str25$ ), new SubLObject[] { format_nil.format_nil_a_no_copy( hour ), $str121$_, format_nil
        .format_nil_a_no_copy( minute.numL( TEN_INTEGER ) ? $str120$0 : $str25$ ), format_nil.format_nil_a_no_copy( minute ), $str121$_, format_nil.format_nil_a_no_copy( second.numL( TEN_INTEGER ) ? $str120$0
            : $str25$ ), format_nil.format_nil_a_no_copy( second )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 48469L)
  public static SubLObject decode_secondstring(final SubLObject secondstring)
  {
    return Values.values( secondstring_second( secondstring ), secondstring_minute( secondstring ), secondstring_hour( secondstring ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 48657L)
  public static SubLObject secondstring_(final SubLObject secondstring1, final SubLObject secondstring2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject second1 = decode_secondstring( secondstring1 );
    final SubLObject minute1 = thread.secondMultipleValue();
    final SubLObject hour1 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject second2 = decode_secondstring( secondstring2 );
    final SubLObject minute2 = thread.secondMultipleValue();
    final SubLObject hour2 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return Numbers.add( Numbers.subtract( second1, second2 ), Numbers.multiply( $seconds_in_a_minute$.getGlobalValue(), Numbers.subtract( minute1, minute2 ) ), Numbers.multiply( $seconds_in_an_hour$.getGlobalValue(),
        Numbers.subtract( hour1, hour2 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 49121L)
  public static SubLObject secondstring_hour(final SubLObject secondstring)
  {
    return string_utilities.string_to_integer( string_utilities.substring( secondstring, ZERO_INTEGER, TWO_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 49229L)
  public static SubLObject secondstring_minute(final SubLObject secondstring)
  {
    return string_utilities.string_to_integer( string_utilities.substring( secondstring, THREE_INTEGER, FIVE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 49339L)
  public static SubLObject secondstring_second(final SubLObject secondstring)
  {
    return string_utilities.string_to_integer( string_utilities.substring( secondstring, SIX_INTEGER, EIGHT_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 49449L)
  public static SubLObject encode_millisecondstring(final SubLObject hour, final SubLObject minute, SubLObject second, SubLObject millisecond)
  {
    if( second == UNPROVIDED )
    {
      second = ZERO_INTEGER;
    }
    if( millisecond == UNPROVIDED )
    {
      millisecond = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.integerp( millisecond ) : millisecond;
    assert NIL != Types.integerp( second ) : second;
    assert NIL != Types.integerp( minute ) : minute;
    assert NIL != Types.integerp( hour ) : hour;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !ZERO_INTEGER.numLE( millisecond ) || !millisecond.numLE( $int122$999 ) ) )
    {
      Errors.error( $str123$second__S_not_in_the_range_0_999, second );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !ZERO_INTEGER.numLE( second ) || !second.numLE( $int19$59 ) ) )
    {
      Errors.error( $str116$second__S_not_in_the_range_0_59, second );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !ZERO_INTEGER.numLE( minute ) || !minute.numLE( $int19$59 ) ) )
    {
      Errors.error( $str117$minute__S_not_in_the_range_0_59, minute );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !ZERO_INTEGER.numLE( hour ) || !hour.numLE( $int19$59 ) ) )
    {
      Errors.error( $str118$hour__S_not_in_the_range_0_59, hour );
    }
    return PrintLow.format( NIL, $str124$_2__0d__2__0d__2__0d__3__0d, new SubLObject[] { hour, minute, second, millisecond
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 50196L)
  public static SubLObject universal_date_and_second_from_time(SubLObject universal_time)
  {
    if( universal_time == UNPROVIDED )
    {
      universal_time = Time.get_universal_time();
    }
    assert NIL != universal_time_p( universal_time ) : universal_time;
    return Values.values( get_universal_date( universal_time, UNPROVIDED ), get_universal_second( universal_time ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 50445L)
  public static SubLObject universal_time_from_date_and_second(final SubLObject universal_date, SubLObject universal_second)
  {
    if( universal_second == UNPROVIDED )
    {
      universal_second = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != universal_date_p( universal_date ) : universal_date;
    assert NIL != universal_second_p( universal_second ) : universal_second;
    thread.resetMultipleValues();
    final SubLObject second = decode_universal_second( universal_second );
    final SubLObject minute = thread.secondMultipleValue();
    final SubLObject hour = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject day = decode_universal_date( universal_date );
    final SubLObject month = thread.secondMultipleValue();
    final SubLObject year = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return Time.encode_universal_time( second, minute, hour, day, month, year, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 50893L)
  public static SubLObject get_utc_time_with_milliseconds()
  {
    final SubLObject internal_real_time = Time.get_internal_real_time();
    final SubLObject universal_time = Time.get_universal_time();
    final SubLObject divisor = Numbers.divide( time_high.$internal_time_units_per_second$.getGlobalValue(), $int1$1000 );
    final SubLObject internal_real_time_in_milliseconds = Numbers.truncate( Numbers.divide( internal_real_time, divisor ), UNPROVIDED );
    final SubLObject milliseconds = Numbers.rem( internal_real_time_in_milliseconds, $int1$1000 );
    final SubLObject time_in_milliseconds = Numbers.add( Numbers.multiply( universal_time, $int1$1000 ), milliseconds );
    return time_in_milliseconds;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 51669L)
  public static SubLObject get_universal_millisecond(SubLObject internal_time)
  {
    if( internal_time == UNPROVIDED )
    {
      internal_time = Time.get_internal_real_time();
    }
    final SubLObject divisor = Numbers.divide( time_high.$internal_time_units_per_second$.getGlobalValue(), $int1$1000 );
    final SubLObject internal_real_time_in_milliseconds = Numbers.truncate( Numbers.divide( internal_time, divisor ), UNPROVIDED );
    final SubLObject milliseconds = Numbers.rem( internal_real_time_in_milliseconds, $int1$1000 );
    final SubLObject universal_second = get_universal_second( UNPROVIDED );
    return Numbers.add( Numbers.multiply( $int1$1000, universal_second ), milliseconds );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 52171L)
  public static SubLObject get_internal_real_time_ms()
  {
    if( time_high.$internal_time_units_per_second$.getGlobalValue().eql( $milliseconds_in_a_second$.getGlobalValue() ) )
    {
      return Time.get_internal_real_time();
    }
    if( time_high.$internal_time_units_per_second$.getGlobalValue().eql( Numbers.multiply( $microseconds_in_a_millisecond$.getGlobalValue(), $milliseconds_in_a_second$.getGlobalValue() ) ) )
    {
      return number_utilities.div( Time.get_internal_real_time(), $microseconds_in_a_millisecond$.getGlobalValue() );
    }
    return number_utilities.div( Time.get_internal_real_time(), number_utilities.div( time_high.$internal_time_units_per_second$.getGlobalValue(), $milliseconds_in_a_second$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 52625L)
  public static SubLObject extended_universal_date_p(final SubLObject v_object)
  {
    if( !v_object.isInteger() )
    {
      return NIL;
    }
    if( v_object.isNegative() )
    {
      return extended_universal_date_p( Numbers.minus( v_object ) );
    }
    final SubLObject second = Numbers.rem( v_object, $int9$100 );
    final SubLObject minute = Numbers.integerDivide( Numbers.rem( v_object, $int105$10000 ), $int9$100 );
    final SubLObject hour = Numbers.integerDivide( Numbers.rem( v_object, $int0$1000000 ), $int105$10000 );
    final SubLObject day = Numbers.integerDivide( Numbers.rem( v_object, $int125$100000000 ), $int0$1000000 );
    final SubLObject month = Numbers.integerDivide( Numbers.rem( v_object, $int126$10000000000 ), $int125$100000000 );
    return makeBoolean( second.numLE( $int7$60 ) && minute.numLE( $int7$60 ) && hour.numLE( $int18$23 ) && day.numGE( ONE_INTEGER ) && day.numLE( $int17$31 ) && month.numGE( ONE_INTEGER ) && month.numLE(
        TWELVE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 53420L)
  public static SubLObject get_extended_universal_date(SubLObject universal_time)
  {
    if( universal_time == UNPROVIDED )
    {
      universal_time = Time.get_universal_time();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != universal_time_p( universal_time ) : universal_time;
    thread.resetMultipleValues();
    final SubLObject second = Time.decode_universal_time( universal_time, UNPROVIDED );
    final SubLObject minute = thread.secondMultipleValue();
    final SubLObject hour = thread.thirdMultipleValue();
    final SubLObject day = thread.fourthMultipleValue();
    final SubLObject month = thread.fifthMultipleValue();
    final SubLObject year = thread.sixthMultipleValue();
    thread.resetMultipleValues();
    return encode_extended_universal_date( second, minute, hour, day, month, year );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 53745L)
  public static SubLObject encode_extended_universal_date(final SubLObject second, final SubLObject minute, final SubLObject hour, final SubLObject day, final SubLObject month, final SubLObject year)
  {
    if( year.isNegative() )
    {
      return Numbers.minus( encode_extended_universal_date( second, minute, hour, day, month, Numbers.minus( year ) ) );
    }
    final SubLObject universal_date = encode_universal_date( day, month, year );
    final SubLObject universal_second = encode_universal_second( second, minute, hour );
    return Numbers.add( Numbers.multiply( universal_date, $int0$1000000 ), universal_second );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 54138L)
  public static SubLObject decode_extended_universal_date(SubLObject extended_universal_date)
  {
    if( extended_universal_date == UNPROVIDED )
    {
      extended_universal_date = get_extended_universal_date( UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.integerp( extended_universal_date ) : extended_universal_date;
    if( extended_universal_date.isNegative() )
    {
      thread.resetMultipleValues();
      final SubLObject second = decode_extended_universal_date( Numbers.minus( extended_universal_date ) );
      final SubLObject minute = thread.secondMultipleValue();
      final SubLObject hour = thread.thirdMultipleValue();
      final SubLObject day = thread.fourthMultipleValue();
      final SubLObject month = thread.fifthMultipleValue();
      final SubLObject year = thread.sixthMultipleValue();
      thread.resetMultipleValues();
      return Values.values( second, minute, hour, day, month, Numbers.minus( year ) );
    }
    final SubLObject universal_second = Numbers.rem( extended_universal_date, $int0$1000000 );
    final SubLObject universal_date = Numbers.integerDivide( extended_universal_date, $int0$1000000 );
    thread.resetMultipleValues();
    final SubLObject second2 = decode_universal_second( universal_second );
    final SubLObject minute2 = thread.secondMultipleValue();
    final SubLObject hour2 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject day2 = decode_universal_date( universal_date );
    final SubLObject month2 = thread.secondMultipleValue();
    final SubLObject year2 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return Values.values( second2, minute2, hour2, day2, month2, year2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 54906L)
  public static SubLObject encode_universal_time_for_extended_universal_date(final SubLObject date, SubLObject time_zone)
  {
    if( time_zone == UNPROVIDED )
    {
      time_zone = SIX_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    thread.resetMultipleValues();
    final SubLObject second = decode_extended_universal_date( date );
    final SubLObject minute = thread.secondMultipleValue();
    final SubLObject hour = thread.thirdMultipleValue();
    final SubLObject day = thread.fourthMultipleValue();
    final SubLObject month = thread.fifthMultipleValue();
    final SubLObject year = thread.sixthMultipleValue();
    thread.resetMultipleValues();
    result = Time.encode_universal_time( second, minute, hour, day, month, year, time_zone );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 55441L)
  public static SubLObject preceding_extended_universal_date(final SubLObject extended_universal_date)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject second = decode_extended_universal_date( extended_universal_date );
    final SubLObject minute = thread.secondMultipleValue();
    final SubLObject hour = thread.thirdMultipleValue();
    final SubLObject day = thread.fourthMultipleValue();
    final SubLObject month = thread.fifthMultipleValue();
    final SubLObject year = thread.sixthMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject new_year = adjust_year_month_day_hour_min_sec( year, month, day, hour, minute, Numbers.subtract( second, ONE_INTEGER ) );
    final SubLObject new_month = thread.secondMultipleValue();
    final SubLObject new_day = thread.thirdMultipleValue();
    final SubLObject new_hour = thread.fourthMultipleValue();
    final SubLObject new_minute = thread.fifthMultipleValue();
    final SubLObject new_second = thread.sixthMultipleValue();
    thread.resetMultipleValues();
    return encode_extended_universal_date( new_second, new_minute, new_hour, new_day, new_month, new_year );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 55910L)
  public static SubLObject succeeding_extended_universal_date(final SubLObject extended_universal_date)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject second = decode_extended_universal_date( extended_universal_date );
    final SubLObject minute = thread.secondMultipleValue();
    final SubLObject hour = thread.thirdMultipleValue();
    final SubLObject day = thread.fourthMultipleValue();
    final SubLObject month = thread.fifthMultipleValue();
    final SubLObject year = thread.sixthMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject new_year = adjust_year_month_day_hour_min_sec( year, month, day, hour, minute, Numbers.add( second, ONE_INTEGER ) );
    final SubLObject new_month = thread.secondMultipleValue();
    final SubLObject new_day = thread.thirdMultipleValue();
    final SubLObject new_hour = thread.fourthMultipleValue();
    final SubLObject new_minute = thread.fifthMultipleValue();
    final SubLObject new_second = thread.sixthMultipleValue();
    thread.resetMultipleValues();
    return encode_extended_universal_date( new_second, new_minute, new_hour, new_day, new_month, new_year );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 56380L)
  public static SubLObject extended_universal_dateL(final SubLObject eu_date1, final SubLObject eu_date2)
  {
    if( !eu_date1.isNegative() || !eu_date2.isNegative() )
    {
      return Numbers.numL( eu_date1, eu_date2 );
    }
    final SubLObject year1 = Numbers.integerDivide( eu_date1, $int126$10000000000 );
    final SubLObject year2 = Numbers.integerDivide( eu_date2, $int126$10000000000 );
    if( year1.numE( year2 ) )
    {
      final SubLObject second_within_year1 = Numbers.abs( Numbers.rem( eu_date1, $int126$10000000000 ) );
      final SubLObject second_within_year2 = Numbers.abs( Numbers.rem( eu_date2, $int126$10000000000 ) );
      return Numbers.numL( second_within_year1, second_within_year2 );
    }
    return Numbers.numL( year1, year2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 56874L)
  public static SubLObject adjust_year_month_day(SubLObject year, SubLObject month, SubLObject day)
  {
    while ( ( month.isInteger() && ( !month.numLE( TWELVE_INTEGER ) || !month.numG( ZERO_INTEGER ) ) ) || ( day.isInteger() && ( !day.numLE( days_in_month_number( month, year ) ) || !day.numG( ZERO_INTEGER ) ) ))
    {
      if( month.isInteger() && year.isInteger() && !month.numLE( TWELVE_INTEGER ) )
      {
        month = Numbers.subtract( month, TWELVE_INTEGER );
        year = Numbers.add( year, ONE_INTEGER );
      }
      else if( month.isInteger() && year.isInteger() && !month.numG( ZERO_INTEGER ) )
      {
        month = Numbers.add( month, TWELVE_INTEGER );
        year = Numbers.subtract( year, ONE_INTEGER );
      }
      else if( day.isInteger() && month.isInteger() && year.isInteger() && !day.numLE( days_in_month_number( month, year ) ) )
      {
        day = Numbers.subtract( day, days_in_month_number( month, year ) );
        month = Numbers.add( month, ONE_INTEGER );
      }
      else if( day.isInteger() && month.isInteger() && year.isInteger() && !day.numG( ZERO_INTEGER ) )
      {
        month = Numbers.subtract( month, ONE_INTEGER );
        if( month.numE( ZERO_INTEGER ) )
        {
          year = Numbers.subtract( year, ONE_INTEGER );
          month = Numbers.add( month, TWELVE_INTEGER );
        }
        day = Numbers.add( day, days_in_month_number( month, year ) );
      }
      else
      {
        Errors.error( $str127$MM_DD_YY_adjust_problem___s__s__s, month, day, year );
      }
    }
    return Values.values( year, month, day );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 57940L)
  public static SubLObject adjust_year_month_day_hour_min_sec(final SubLObject year, final SubLObject month, SubLObject day, SubLObject hour, SubLObject min, SubLObject sec)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != sec )
    {
      if( sec.numL( ZERO_INTEGER ) )
      {
        min = Numbers.add( min, Numbers.subtract( Numbers.integerDivide( sec, $seconds_in_a_minute$.getGlobalValue() ), ONE_INTEGER ) );
      }
      else
      {
        min = Numbers.add( min, Numbers.integerDivide( sec, $seconds_in_a_minute$.getGlobalValue() ) );
      }
      sec = Numbers.mod( sec, $seconds_in_a_minute$.getGlobalValue() );
    }
    if( NIL != min )
    {
      if( min.numL( ZERO_INTEGER ) )
      {
        hour = Numbers.add( hour, Numbers.subtract( Numbers.integerDivide( min, $minutes_in_an_hour$.getGlobalValue() ), ONE_INTEGER ) );
      }
      else
      {
        hour = Numbers.add( hour, Numbers.integerDivide( min, $minutes_in_an_hour$.getGlobalValue() ) );
      }
      min = Numbers.mod( min, $minutes_in_an_hour$.getGlobalValue() );
    }
    if( NIL != hour )
    {
      if( hour.numL( ZERO_INTEGER ) )
      {
        day = Numbers.add( day, Numbers.subtract( Numbers.integerDivide( hour, $hours_in_a_day$.getGlobalValue() ), ONE_INTEGER ) );
      }
      else
      {
        day = Numbers.add( day, Numbers.integerDivide( hour, $hours_in_a_day$.getGlobalValue() ) );
      }
      hour = Numbers.mod( hour, $hours_in_a_day$.getGlobalValue() );
    }
    thread.resetMultipleValues();
    final SubLObject final_year = adjust_year_month_day( year, month, day );
    final SubLObject final_month = thread.secondMultipleValue();
    final SubLObject final_day = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    return Values.values( final_year, final_month, final_day, hour, min, sec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 58781L)
  public static SubLObject leap_year_p(final SubLObject year)
  {
    assert NIL != Types.integerp( year ) : year;
    return makeBoolean( NIL != number_utilities.divides_evenly( year, FOUR_INTEGER ) && ( NIL == number_utilities.divides_evenly( year, $int9$100 ) || NIL != number_utilities.divides_evenly( year, $int128$400 ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 59258L)
  public static SubLObject usual_days_in_month_number(final SubLObject month)
  {
    return ConsesLow.nth( Numbers.subtract( month, ONE_INTEGER ), $month_duration_table$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 59649L)
  public static SubLObject days_in_month_number(final SubLObject month, final SubLObject year)
  {
    if( year.isInteger() && month.numE( TWO_INTEGER ) && NIL != leap_year_p( year ) )
    {
      return Numbers.add( ONE_INTEGER, usual_days_in_month_number( month ) );
    }
    return usual_days_in_month_number( month );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 60187L)
  public static SubLObject total_days_in_months_preceding(final SubLObject month, final SubLObject year)
  {
    SubLObject total = ZERO_INTEGER;
    SubLObject doneP = NIL;
    SubLObject list_var = NIL;
    SubLObject days = NIL;
    SubLObject num = NIL;
    list_var = $month_duration_table$.getGlobalValue();
    days = list_var.first();
    for( num = ZERO_INTEGER; NIL == doneP && NIL != list_var; list_var = list_var.rest(), days = list_var.first(), num = Numbers.add( ONE_INTEGER, num ) )
    {
      if( number_utilities.f_1X( num ).numE( month ) )
      {
        doneP = T;
      }
      else
      {
        total = Numbers.add( total, days );
      }
    }
    if( month.numG( TWO_INTEGER ) && NIL != leap_year_p( year ) )
    {
      total = Numbers.add( total, ONE_INTEGER );
    }
    return total;
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 60770L)
  public static SubLObject day_of_week_number_abbrev(final SubLObject number)
  {
    return list_utilities.alist_lookup_without_values( $number_wkday_table$.getGlobalValue(), number, Symbols.symbol_function( EQ ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 61171L)
  public static SubLObject month_number_abbrev(final SubLObject number)
  {
    return list_utilities.alist_lookup_without_values( $number_month_table$.getGlobalValue(), number, Symbols.symbol_function( EQ ), NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 61295L)
  public static SubLObject abbreviation_for_month_number(final SubLObject month_num)
  {
    return month_number_abbrev( month_num );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 61434L)
  public static SubLObject date_abbreviation_string(final SubLObject universal_date)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject day = decode_universal_date( universal_date );
    SubLObject month = thread.secondMultipleValue();
    final SubLObject year = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    month = abbreviation_for_month_number( month );
    return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( month ), new SubLObject[] { $str134$_, format_nil.format_nil_a_no_copy( day ), $str135$__, format_nil.format_nil_a_no_copy( year )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 61680L)
  public static SubLObject today_abbreviation_string()
  {
    return date_abbreviation_string( get_universal_date( UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 61782L)
  public static SubLObject time_abbreviation_string(SubLObject universal_time)
  {
    if( universal_time == UNPROVIDED )
    {
      universal_time = Time.get_universal_time();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject second = Time.decode_universal_time( universal_time, UNPROVIDED );
    final SubLObject minute = thread.secondMultipleValue();
    final SubLObject hour = thread.thirdMultipleValue();
    final SubLObject date = thread.fourthMultipleValue();
    final SubLObject month = thread.fifthMultipleValue();
    final SubLObject year = thread.sixthMultipleValue();
    thread.resetMultipleValues();
    return PrintLow.format( NIL, $str136$_2__0D__2__0D__2__0D__2__0D__2__0, new SubLObject[] { month, date, Numbers.mod( year, $int9$100 ), hour, minute, second
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 62096L)
  public static SubLObject elapsed_time_abbreviation_string(final SubLObject elapsed_seconds)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject secs = decode_elapsed_seconds( elapsed_seconds );
    final SubLObject mins = thread.secondMultipleValue();
    final SubLObject hours = thread.thirdMultipleValue();
    final SubLObject days = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    secs = Numbers.truncate( secs, UNPROVIDED );
    return days.numG( ZERO_INTEGER ) ? PrintLow.format( NIL, $str137$_D_day__P__D__2__0D__2__0D, new SubLObject[] { days, hours, mins, secs
    } ) : ( hours.numG( ZERO_INTEGER ) ? PrintLow.format( NIL, $str138$_D__2__0D__2__0D, new SubLObject[] { hours, mins, secs
    } ) : PrintLow.format( NIL, $str139$_D__2__0D, mins, secs ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 62514L)
  public static SubLObject elapsed_time_string(final SubLObject elapsed_seconds)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject secs = decode_elapsed_seconds( elapsed_seconds );
    final SubLObject mins = thread.secondMultipleValue();
    final SubLObject hours = thread.thirdMultipleValue();
    final SubLObject days = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    secs = Numbers.truncate( secs, UNPROVIDED );
    return days.numG( ZERO_INTEGER ) ? PrintLow.format( NIL, $str140$_Dd__2__0Dh__2__0Dm__2__0Ds, new SubLObject[] { days, hours, mins, secs
    } ) : ( hours.numG( ZERO_INTEGER ) ? PrintLow.format( NIL, $str141$_2__0Dh__2__0Dm__2__0Ds, new SubLObject[] { hours, mins, secs
    } ) : PrintLow.format( NIL, $str142$_2__0Dm__2__0Ds, mins, secs ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 63265L)
  public static SubLObject seconds_in_month(final SubLObject month, final SubLObject year)
  {
    return Numbers.multiply( $seconds_in_a_day$.getGlobalValue(), days_in_month_number( date_utilities.number_of_month( month ), year ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 63409L)
  public static SubLObject seconds_in_quarter(final SubLObject starting_month, final SubLObject year)
  {
    final SubLObject init_num = date_utilities.number_of_month( starting_month );
    return Numbers.add( Numbers.multiply( $seconds_in_a_day$.getGlobalValue(), days_in_month_number( init_num, year ) ), Numbers.multiply( $seconds_in_a_day$.getGlobalValue(), days_in_month_number( Numbers.add(
        ONE_INTEGER, init_num ), year ) ), Numbers.multiply( $seconds_in_a_day$.getGlobalValue(), days_in_month_number( Numbers.add( TWO_INTEGER, init_num ), year ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 63752L)
  public static SubLObject seconds_in_year(final SubLObject year)
  {
    if( NIL != leap_year_p( year ) )
    {
      return $seconds_in_a_leap_year$.getGlobalValue();
    }
    return $seconds_in_a_non_leap_year$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/numeric-date-utilities.lisp", position = 63902L)
  public static SubLObject seconds_in_millennium(final SubLObject year)
  {
    if( ONE_INTEGER.numE( Numbers.integerDivide( year, $int1$1000 ) ) )
    {
      return $seconds_in_an_odd_millennium$.getGlobalValue();
    }
    return $seconds_in_an_even_millennium$.getGlobalValue();
  }

  public static SubLObject declare_numeric_date_utilities_file()
  {
    SubLFiles.declareMacro( me, "elapsed_milliseconds", "ELAPSED-MILLISECONDS" );
    SubLFiles.declareFunction( me, "valid_year_number_p", "VALID-YEAR-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_month_number_p", "VALID-MONTH-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_day_number_p", "VALID-DAY-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_day_for_month_p", "VALID-DAY-FOR-MONTH-P", 3, 0, false );
    SubLFiles.declareFunction( me, "valid_hour_number_p", "VALID-HOUR-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_minute_number_p", "VALID-MINUTE-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_second_number_p", "VALID-SECOND-NUMBER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "universal_time_p", "UNIVERSAL-TIME-P", 1, 0, false );
    SubLFiles.declareFunction( me, "universal_time_seconds_from_now", "UNIVERSAL-TIME-SECONDS-FROM-NOW", 1, 1, false );
    SubLFiles.declareFunction( me, "time_from_now", "TIME-FROM-NOW", 1, 0, false );
    SubLFiles.declareFunction( me, "universal_time_from_now", "UNIVERSAL-TIME-FROM-NOW", 1, 2, false );
    SubLFiles.declareFunction( me, "timestring", "TIMESTRING", 0, 1, false );
    SubLFiles.declareFunction( me, "timestring_ms", "TIMESTRING-MS", 0, 2, false );
    SubLFiles.declareFunction( me, "timestring_ms_utc", "TIMESTRING-MS-UTC", 0, 2, false );
    SubLFiles.declareFunction( me, "safe_timestring", "SAFE-TIMESTRING", 1, 0, false );
    SubLFiles.declareFunction( me, "timestring_int", "TIMESTRING-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "timestamp", "TIMESTAMP", 0, 2, false );
    SubLFiles.declareFunction( me, "numeric_timestamp", "NUMERIC-TIMESTAMP", 0, 2, false );
    SubLFiles.declareFunction( me, "timestamp_with_milliseconds", "TIMESTAMP-WITH-MILLISECONDS", 0, 2, false );
    SubLFiles.declareFunction( me, "encode_timestring", "ENCODE-TIMESTRING", 6, 0, false );
    SubLFiles.declareFunction( me, "universal_timestring", "UNIVERSAL-TIMESTRING", 0, 1, false );
    SubLFiles.declareFunction( me, "encode_universal_timestring", "ENCODE-UNIVERSAL-TIMESTRING", 6, 0, false );
    SubLFiles.declareFunction( me, "get_universal_time_today", "GET-UNIVERSAL-TIME-TODAY", 3, 0, false );
    SubLFiles.declareFunction( me, "get_universal_time_within_next_day", "GET-UNIVERSAL-TIME-WITHIN-NEXT-DAY", 3, 0, false );
    SubLFiles.declareFunction( me, "universal_time_day_of_week_number", "UNIVERSAL-TIME-DAY-OF-WEEK-NUMBER", 0, 1, false );
    SubLFiles.declareFunction( me, "internal_real_time_p", "INTERNAL-REAL-TIME-P", 1, 0, false );
    SubLFiles.declareFunction( me, "internal_real_time_seconds_from_now", "INTERNAL-REAL-TIME-SECONDS-FROM-NOW", 1, 1, false );
    SubLFiles.declareFunction( me, "elapsed_internal_real_time", "ELAPSED-INTERNAL-REAL-TIME", 1, 1, false );
    SubLFiles.declareFunction( me, "elapsed_internal_real_time_to_elapsed_seconds", "ELAPSED-INTERNAL-REAL-TIME-TO-ELAPSED-SECONDS", 1, 0, false );
    SubLFiles.declareFunction( me, "elapsed_seconds_to_elapsed_internal_real_time", "ELAPSED-SECONDS-TO-ELAPSED-INTERNAL-REAL-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "elapsed_seconds_between_internal_real_times", "ELAPSED-SECONDS-BETWEEN-INTERNAL-REAL-TIMES", 2, 0, false );
    SubLFiles.declareFunction( me, "readable_elapsed_time_string", "READABLE-ELAPSED-TIME-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "explode_elapsed_time_ms", "EXPLODE-ELAPSED-TIME-MS", 1, 0, false );
    SubLFiles.declareFunction( me, "readable_elapsed_time_string_ms", "READABLE-ELAPSED-TIME-STRING-MS", 1, 0, false );
    SubLFiles.declareFunction( me, "datetime_string_from_template", "DATETIME-STRING-FROM-TEMPLATE", 0, 2, false );
    SubLFiles.declareFunction( me, "encode_datetime_string_from_template", "ENCODE-DATETIME-STRING-FROM-TEMPLATE", 8, 0, false );
    SubLFiles.declareFunction( me, "valid_date_template_char", "VALID-DATE-TEMPLATE-CHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_time_template_char", "VALID-TIME-TEMPLATE-CHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_date_separator", "VALID-DATE-SEPARATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_time_separator", "VALID-TIME-SEPARATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_year_token", "VALID-YEAR-TOKEN", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_month_token", "VALID-MONTH-TOKEN", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_day_token", "VALID-DAY-TOKEN", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_hour_token", "VALID-HOUR-TOKEN", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_minute_token", "VALID-MINUTE-TOKEN", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_second_token", "VALID-SECOND-TOKEN", 1, 0, false );
    SubLFiles.declareFunction( me, "date_template_p", "DATE-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "time_template_p", "TIME-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "datetime_string_template_p", "DATETIME-STRING-TEMPLATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "non_date_time_whitespace_p", "NON-DATE-TIME-WHITESPACE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "date_time_whitespace_p", "DATE-TIME-WHITESPACE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "n_digit_template_element_p", "N-DIGIT-TEMPLATE-ELEMENT-P", 4, 0, false );
    SubLFiles.declareFunction( me, "encode_date_from_template", "ENCODE-DATE-FROM-TEMPLATE", 4, 0, false );
    SubLFiles.declareFunction( me, "encode_next_date_element", "ENCODE-NEXT-DATE-ELEMENT", 6, 0, false );
    SubLFiles.declareFunction( me, "encode_time_from_template", "ENCODE-TIME-FROM-TEMPLATE", 5, 0, false );
    SubLFiles.declareFunction( me, "decode_datetime_string_from_template", "DECODE-DATETIME-STRING-FROM-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "decode_date_from_template", "DECODE-DATE-FROM-TEMPLATE", 2, 3, false );
    SubLFiles.declareFunction( me, "decode_time_from_template", "DECODE-TIME-FROM-TEMPLATE", 2, 0, false );
    SubLFiles.declareFunction( me, "decode_elapsed_seconds", "DECODE-ELAPSED-SECONDS", 1, 0, false );
    SubLFiles.declareFunction( me, "decode_elapsed_seconds_without_days", "DECODE-ELAPSED-SECONDS-WITHOUT-DAYS", 1, 0, false );
    SubLFiles.declareFunction( me, "encode_elapsed_seconds", "ENCODE-ELAPSED-SECONDS", 0, 4, false );
    SubLFiles.declareFunction( me, "encode_elapsed_seconds_string", "ENCODE-ELAPSED-SECONDS-STRING", 0, 4, false );
    SubLFiles.declareFunction( me, "elapsed_seconds_string", "ELAPSED-SECONDS-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "universal_date_p", "UNIVERSAL-DATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_universal_date", "GET-UNIVERSAL-DATE", 0, 2, false );
    SubLFiles.declareFunction( me, "today", "TODAY", 0, 0, false );
    SubLFiles.declareFunction( me, "yesterday", "YESTERDAY", 0, 0, false );
    SubLFiles.declareFunction( me, "tomorrow", "TOMORROW", 0, 0, false );
    SubLFiles.declareFunction( me, "this_year", "THIS-YEAR", 0, 0, false );
    SubLFiles.declareFunction( me, "universal_date_add_days", "UNIVERSAL-DATE-ADD-DAYS", 2, 0, false );
    SubLFiles.declareFunction( me, "universal_date_subtract_days", "UNIVERSAL-DATE-SUBTRACT-DAYS", 2, 0, false );
    SubLFiles.declareFunction( me, "universal_date_add_days_int", "UNIVERSAL-DATE-ADD-DAYS-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "decode_universal_date", "DECODE-UNIVERSAL-DATE", 0, 1, false );
    SubLFiles.declareFunction( me, "day_from_universal_date", "DAY-FROM-UNIVERSAL-DATE", 0, 1, false );
    SubLFiles.declareFunction( me, "month_from_universal_date", "MONTH-FROM-UNIVERSAL-DATE", 0, 1, false );
    SubLFiles.declareFunction( me, "year_from_universal_date", "YEAR-FROM-UNIVERSAL-DATE", 0, 1, false );
    SubLFiles.declareFunction( me, "encode_universal_date", "ENCODE-UNIVERSAL-DATE", 3, 0, false );
    SubLFiles.declareFunction( me, "datestring", "DATESTRING", 0, 1, false );
    SubLFiles.declareFunction( me, "datestringL", "DATESTRING<", 2, 0, false );
    SubLFiles.declareFunction( me, "datestring_", "DATESTRING-", 2, 0, false );
    SubLFiles.declareFunction( me, "datestring_year", "DATESTRING-YEAR", 1, 0, false );
    SubLFiles.declareFunction( me, "datestring_month", "DATESTRING-MONTH", 1, 0, false );
    SubLFiles.declareFunction( me, "datestring_day", "DATESTRING-DAY", 1, 0, false );
    SubLFiles.declareFunction( me, "encode_datestring", "ENCODE-DATESTRING", 3, 0, false );
    SubLFiles.declareFunction( me, "decode_datestring", "DECODE-DATESTRING", 1, 0, false );
    SubLFiles.declareFunction( me, "month_ago", "MONTH-AGO", 0, 2, false );
    SubLFiles.declareFunction( me, "get_julian_date", "GET-JULIAN-DATE", 0, 2, false );
    SubLFiles.declareFunction( me, "julian_date_from_universal_date", "JULIAN-DATE-FROM-UNIVERSAL-DATE", 1, 1, false );
    SubLFiles.declareFunction( me, "julian_offset", "JULIAN-OFFSET", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_julian_offset", "COMPUTE-JULIAN-OFFSET", 1, 0, false );
    SubLFiles.declareFunction( me, "universal_time_for_start_of_universal_date", "UNIVERSAL-TIME-FOR-START-OF-UNIVERSAL-DATE", 1, 1, false );
    SubLFiles.declareFunction( me, "universal_days", "UNIVERSAL-DAYS", 2, 0, false );
    SubLFiles.declareFunction( me, "universal_second_p", "UNIVERSAL-SECOND-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_universal_second", "GET-UNIVERSAL-SECOND", 0, 1, false );
    SubLFiles.declareFunction( me, "decode_universal_second", "DECODE-UNIVERSAL-SECOND", 0, 1, false );
    SubLFiles.declareFunction( me, "encode_universal_second", "ENCODE-UNIVERSAL-SECOND", 3, 0, false );
    SubLFiles.declareFunction( me, "secondstring", "SECONDSTRING", 0, 1, false );
    SubLFiles.declareFunction( me, "encode_secondstring", "ENCODE-SECONDSTRING", 3, 0, false );
    SubLFiles.declareFunction( me, "decode_secondstring", "DECODE-SECONDSTRING", 1, 0, false );
    SubLFiles.declareFunction( me, "secondstring_", "SECONDSTRING-", 2, 0, false );
    SubLFiles.declareFunction( me, "secondstring_hour", "SECONDSTRING-HOUR", 1, 0, false );
    SubLFiles.declareFunction( me, "secondstring_minute", "SECONDSTRING-MINUTE", 1, 0, false );
    SubLFiles.declareFunction( me, "secondstring_second", "SECONDSTRING-SECOND", 1, 0, false );
    SubLFiles.declareFunction( me, "encode_millisecondstring", "ENCODE-MILLISECONDSTRING", 2, 2, false );
    SubLFiles.declareFunction( me, "universal_date_and_second_from_time", "UNIVERSAL-DATE-AND-SECOND-FROM-TIME", 0, 1, false );
    SubLFiles.declareFunction( me, "universal_time_from_date_and_second", "UNIVERSAL-TIME-FROM-DATE-AND-SECOND", 1, 1, false );
    SubLFiles.declareFunction( me, "get_utc_time_with_milliseconds", "GET-UTC-TIME-WITH-MILLISECONDS", 0, 0, false );
    SubLFiles.declareFunction( me, "get_universal_millisecond", "GET-UNIVERSAL-MILLISECOND", 0, 1, false );
    SubLFiles.declareFunction( me, "get_internal_real_time_ms", "GET-INTERNAL-REAL-TIME-MS", 0, 0, false );
    SubLFiles.declareFunction( me, "extended_universal_date_p", "EXTENDED-UNIVERSAL-DATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_extended_universal_date", "GET-EXTENDED-UNIVERSAL-DATE", 0, 1, false );
    SubLFiles.declareFunction( me, "encode_extended_universal_date", "ENCODE-EXTENDED-UNIVERSAL-DATE", 6, 0, false );
    SubLFiles.declareFunction( me, "decode_extended_universal_date", "DECODE-EXTENDED-UNIVERSAL-DATE", 0, 1, false );
    SubLFiles.declareFunction( me, "encode_universal_time_for_extended_universal_date", "ENCODE-UNIVERSAL-TIME-FOR-EXTENDED-UNIVERSAL-DATE", 1, 1, false );
    SubLFiles.declareFunction( me, "preceding_extended_universal_date", "PRECEDING-EXTENDED-UNIVERSAL-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "succeeding_extended_universal_date", "SUCCEEDING-EXTENDED-UNIVERSAL-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "extended_universal_dateL", "EXTENDED-UNIVERSAL-DATE<", 2, 0, false );
    SubLFiles.declareFunction( me, "adjust_year_month_day", "ADJUST-YEAR-MONTH-DAY", 3, 0, false );
    SubLFiles.declareFunction( me, "adjust_year_month_day_hour_min_sec", "ADJUST-YEAR-MONTH-DAY-HOUR-MIN-SEC", 6, 0, false );
    SubLFiles.declareFunction( me, "leap_year_p", "LEAP-YEAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "usual_days_in_month_number", "USUAL-DAYS-IN-MONTH-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "days_in_month_number", "DAYS-IN-MONTH-NUMBER", 2, 0, false );
    SubLFiles.declareFunction( me, "total_days_in_months_preceding", "TOTAL-DAYS-IN-MONTHS-PRECEDING", 2, 0, false );
    SubLFiles.declareFunction( me, "day_of_week_number_abbrev", "DAY-OF-WEEK-NUMBER-ABBREV", 1, 0, false );
    SubLFiles.declareFunction( me, "month_number_abbrev", "MONTH-NUMBER-ABBREV", 1, 0, false );
    SubLFiles.declareFunction( me, "abbreviation_for_month_number", "ABBREVIATION-FOR-MONTH-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "date_abbreviation_string", "DATE-ABBREVIATION-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "today_abbreviation_string", "TODAY-ABBREVIATION-STRING", 0, 0, false );
    SubLFiles.declareFunction( me, "time_abbreviation_string", "TIME-ABBREVIATION-STRING", 0, 1, false );
    SubLFiles.declareFunction( me, "elapsed_time_abbreviation_string", "ELAPSED-TIME-ABBREVIATION-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "elapsed_time_string", "ELAPSED-TIME-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "seconds_in_month", "SECONDS-IN-MONTH", 2, 0, false );
    SubLFiles.declareFunction( me, "seconds_in_quarter", "SECONDS-IN-QUARTER", 2, 0, false );
    SubLFiles.declareFunction( me, "seconds_in_year", "SECONDS-IN-YEAR", 1, 0, false );
    SubLFiles.declareFunction( me, "seconds_in_millennium", "SECONDS-IN-MILLENNIUM", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_numeric_date_utilities_file()
  {
    $microseconds_in_a_second$ = SubLFiles.defconstant( "*MICROSECONDS-IN-A-SECOND*", $int0$1000000 );
    $microseconds_in_a_millisecond$ = SubLFiles.defconstant( "*MICROSECONDS-IN-A-MILLISECOND*", $int1$1000 );
    $milliseconds_in_a_second$ = SubLFiles.defconstant( "*MILLISECONDS-IN-A-SECOND*", $int1$1000 );
    $seconds_in_a_leap_year$ = SubLFiles.defconstant( "*SECONDS-IN-A-LEAP-YEAR*", $int2$31622400 );
    $seconds_in_a_non_leap_year$ = SubLFiles.defconstant( "*SECONDS-IN-A-NON-LEAP-YEAR*", $int3$31536000 );
    $seconds_in_a_week$ = SubLFiles.defconstant( "*SECONDS-IN-A-WEEK*", $int4$604800 );
    $seconds_in_a_day$ = SubLFiles.defconstant( "*SECONDS-IN-A-DAY*", $int5$86400 );
    $seconds_in_an_hour$ = SubLFiles.defconstant( "*SECONDS-IN-AN-HOUR*", $int6$3600 );
    $seconds_in_a_minute$ = SubLFiles.defconstant( "*SECONDS-IN-A-MINUTE*", $int7$60 );
    $minutes_in_an_hour$ = SubLFiles.defconstant( "*MINUTES-IN-AN-HOUR*", $int7$60 );
    $hours_in_a_day$ = SubLFiles.defconstant( "*HOURS-IN-A-DAY*", $int8$24 );
    $months_in_a_quarter$ = SubLFiles.defconstant( "*MONTHS-IN-A-QUARTER*", THREE_INTEGER );
    $months_in_a_year$ = SubLFiles.defconstant( "*MONTHS-IN-A-YEAR*", TWELVE_INTEGER );
    $years_in_a_decade$ = SubLFiles.defconstant( "*YEARS-IN-A-DECADE*", TEN_INTEGER );
    $years_in_a_century$ = SubLFiles.defconstant( "*YEARS-IN-A-CENTURY*", $int9$100 );
    $elapsed_seconds_multiples$ = SubLFiles.deflexical( "*ELAPSED-SECONDS-MULTIPLES*", ConsesLow.list( $seconds_in_a_minute$.getGlobalValue(), $minutes_in_an_hour$.getGlobalValue(), $hours_in_a_day$.getGlobalValue() ) );
    $elapsed_seconds_wXo_days_multiples$ = SubLFiles.deflexical( "*ELAPSED-SECONDS-W/O-DAYS-MULTIPLES*", ConsesLow.list( $seconds_in_a_minute$.getGlobalValue(), $minutes_in_an_hour$.getGlobalValue() ) );
    $julian_date_reference$ = SubLFiles.defconstant( "*JULIAN-DATE-REFERENCE*", $list112 );
    $julian_offsets$ = SubLFiles.deflexical( "*JULIAN-OFFSETS*", ( NIL != Symbols.boundp( $sym113$_JULIAN_OFFSETS_ ) ) ? $julian_offsets$.getGlobalValue() : NIL );
    $month_duration_table$ = SubLFiles.deflexical( "*MONTH-DURATION-TABLE*", $list129 );
    $number_wkday_table$ = SubLFiles.deflexical( "*NUMBER-WKDAY-TABLE*", $list130 );
    $number_month_table$ = SubLFiles.deflexical( "*NUMBER-MONTH-TABLE*", $list131 );
    $seconds_in_a_century$ = SubLFiles.defconstant( "*SECONDS-IN-A-CENTURY*", $int143$3155760000 );
    $seconds_in_an_odd_millennium$ = SubLFiles.defconstant( "*SECONDS-IN-AN-ODD-MILLENNIUM*", $int144$31556908800 );
    $seconds_in_an_even_millennium$ = SubLFiles.defconstant( "*SECONDS-IN-AN-EVEN-MILLENNIUM*", $int145$31556995200 );
    return NIL;
  }

  public static SubLObject setup_numeric_date_utilities_file()
  {
    access_macros.define_obsolete_register( $sym20$TIME_FROM_NOW, $list21 );
    generic_testing.define_test_case_table_int( $sym39$READABLE_ELAPSED_TIME_STRING, ConsesLow.list( new SubLObject[] { $kw40$TEST, NIL, $kw41$OWNER, NIL, $kw42$CLASSES, NIL, $kw43$KB, $kw44$TINY, $kw45$WORKING_, T
    } ), $list46 );
    access_macros.define_obsolete_register( $sym101$ELAPSED_SECONDS_STRING, $list102 );
    subl_macro_promotions.declare_defglobal( $sym113$_JULIAN_OFFSETS_ );
    access_macros.define_obsolete_register( $sym132$ABBREVIATION_FOR_MONTH_NUMBER, $list133 );
    sunit_external.define_test_suite( $str146$Numeric_Date_Utilities, NIL, NIL, $list147 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_numeric_date_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_numeric_date_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_numeric_date_utilities_file();
  }
}
