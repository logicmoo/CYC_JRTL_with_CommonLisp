package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class time_parameter_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.time_parameter_utilities";
  public static final String myFingerPrint = "6d95381e039f2b823bdd74ec3cc719ca003e614319a24f4bccfc0f449d72a482";
  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 5682L)
  public static SubLSymbol $one_second_long$;
  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 5816L)
  public static SubLSymbol $duration_predicates$;
  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 7056L)
  public static SubLSymbol $a_really_long_time$;
  private static final SubLObject $const0$TimePoint;
  private static final SubLObject $const1$ConventionallyClassifiedTimeInter;
  private static final SubLObject $const2$UniversalVocabularyMt;
  private static final SubLSymbol $kw3$PERIOD;
  private static final SubLObject $const4$durationOfType;
  private static final SubLList $list5;
  private static final SubLObject $const6$CalendarCoveringType;
  private static final SubLObject $const7$ConventionallyClassifiedTimeInter;
  private static final SubLObject $const8$periodOfTimeIntervalSeries;
  private static final SubLObject $const9$MonthOfYearType;
  private static final SubLObject $const10$DayOfYearType;
  private static final SubLObject $const11$DayOfWeekType;
  private static final SubLObject $const12$HourOfDayType;
  private static final SubLObject $const13$SameLengthTimeIntervalTypeFn;
  private static final SubLObject $const14$Null_TimeParameter;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLSymbol $kw17$A_LONG_TIME;
  private static final SubLObject $const18$SecondsDuration;
  private static final SubLObject $const19$MinutesDuration;
  private static final SubLInteger $int20$60;
  private static final SubLObject $const21$HoursDuration;
  private static final SubLObject $const22$DaysDuration;
  private static final SubLInteger $int23$24;
  private static final SubLObject $const24$WeeksDuration;
  private static final SubLObject $const25$MonthsDuration;
  private static final SubLObject $const26$QuartersDuration;
  private static final SubLObject $const27$YearsDuration;
  private static final SubLObject $const28$DecadesDuration;
  private static final SubLObject $const29$CenturiesDuration;
  private static final SubLObject $const30$MillenniaDuration;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLString $str33$Type__a_is_not_a_proper_Conventio;
  private static final SubLString $str34$Interval__a_is_not_a_proper_inter;
  private static final SubLObject $const35$IntervalEndedByFn;
  private static final SubLObject $const36$Always_TimeInterval;
  private static final SubLObject $const37$IntervalStartedByFn;
  private static final SubLObject $const38$DayOfYearFn;
  private static final SubLObject $const39$CalendarSecond;
  private static final SubLObject $const40$CalendarMinute;
  private static final SubLObject $const41$CalendarHour;
  private static final SubLObject $const42$CalendarDay;
  private static final SubLObject $const43$CalendarMonth;
  private static final SubLObject $const44$CalendarYear;
  private static final SubLObject $const45$CalendarWeek;
  private static final SubLObject $const46$CalendarQuarter;
  private static final SubLObject $const47$CalendarDecade;
  private static final SubLObject $const48$CalendarHalfCentury;
  private static final SubLInteger $int49$50;
  private static final SubLObject $const50$CalendarCentury;
  private static final SubLInteger $int51$100;
  private static final SubLObject $const52$CalendarMillennium;
  private static final SubLInteger $int53$1000;
  private static final SubLString $str54$Unknown_time_type__a_;
  private static final SubLObject $const55$Sunday;
  private static final SubLList $list56;
  private static final SubLObject $const57$TimeIntervalInclusiveFn;
  private static final SubLSymbol $kw58$QUARTER;
  private static final SubLSymbol $kw59$DECADE;
  private static final SubLSymbol $kw60$CENTURY;
  private static final SubLInteger $int61$51;
  private static final SubLInteger $int62$49;
  private static final SubLObject $const63$YearFn;
  private static final SubLInteger $int64$999;
  private static final SubLString $str65$No_support_for_type__a_;
  private static final SubLObject $const66$CalendarWorkWeek;
  private static final SubLObject $const67$Monday;
  private static final SubLList $list68;
  private static final SubLObject $const69$CalendarWeekend;
  private static final SubLObject $const70$Saturday;
  private static final SubLList $list71;
  private static final SubLObject $const72$Weekday;
  private static final SubLObject $const73$HourFn;
  private static final SubLObject $const74$Friday;
  private static final SubLList $list75;
  private static final SubLString $str76$Time_Parameter_Tests;
  private static final SubLString $str77$Start_of_Interval_Tests;
  private static final SubLList $list78;

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 956L)
  public static SubLObject time_point_type_p(final SubLObject type)
  {
    return Equality.eql( type, $const0$TimePoint );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 1118L)
  public static SubLObject conventional_time_series_p(final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != covering_time_type_p( type ) )
    {
      return T;
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind( NIL, thread );
      result = isa.isaP( type, $const1$ConventionallyClassifiedTimeInter, $const2$UniversalVocabularyMt, UNPROVIDED );
    }
    finally
    {
      sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 1573L)
  public static SubLObject time_series_type_duration(final SubLObject type)
  {
    return ( NIL != covering_time_type_p( type ) && NIL == gappy_time_type_p( type ) ) ? covering_type_unit_duration( type ) : duration_type( gappy_type_duration( type ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 1910L)
  public static SubLObject time_series_duration(final SubLObject type)
  {
    if( NIL != covering_time_type_p( type ) )
    {
      return covering_type_duration( type );
    }
    if( NIL != gappy_time_type_p( type ) )
    {
      return gappy_type_duration( type );
    }
    backward.removal_ask_variable( $kw3$PERIOD, ConsesLow.listS( $const4$durationOfType, type, $list5 ), $const2$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED ).first();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 2208L)
  public static SubLObject covering_time_type_p(final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind( NIL, thread );
      result = isa.isaP( type, $const6$CalendarCoveringType, $const2$UniversalVocabularyMt, UNPROVIDED );
    }
    finally
    {
      sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 2535L)
  public static SubLObject covering_type_unit_duration(final SubLObject covering_type)
  {
    return ( NIL != forts.fort_p( covering_type ) ) ? date_utilities.inference_defining_time_unit( covering_type ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 2805L)
  public static SubLObject covering_type_duration(final SubLObject type)
  {
    return construct_covering_duration( type, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 2911L)
  public static SubLObject construct_covering_duration(final SubLObject type, final SubLObject amt)
  {
    final SubLObject duration = covering_type_unit_duration( type );
    return ( NIL != duration ) ? el_utilities.make_unary_formula( duration, amt ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 3232L)
  public static SubLObject gappy_time_type_p(final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind( NIL, thread );
      result = isa.isaP( type, $const7$ConventionallyClassifiedTimeInter, $const2$UniversalVocabularyMt, UNPROVIDED );
    }
    finally
    {
      sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 3665L)
  public static SubLObject gappy_type_period(final SubLObject type)
  {
    return backward.removal_ask_variable( $kw3$PERIOD, ConsesLow.listS( $const8$periodOfTimeIntervalSeries, type, $list5 ), $const2$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 3906L)
  public static SubLObject gappy_type_duration(final SubLObject type)
  {
    return backward.removal_ask_variable( $kw3$PERIOD, ConsesLow.listS( $const4$durationOfType, type, $list5 ), $const2$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 4113L)
  public static SubLObject month_of_year_typeP(final SubLObject type)
  {
    return isa.isaP( type, $const9$MonthOfYearType, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 4199L)
  public static SubLObject day_of_year_typeP(final SubLObject type)
  {
    return isa.isaP( type, $const10$DayOfYearType, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 4280L)
  public static SubLObject day_of_week_typeP(final SubLObject type)
  {
    return isa.isaP( type, $const11$DayOfWeekType, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 4361L)
  public static SubLObject hour_of_day_typeP(final SubLObject type)
  {
    return isa.isaP( type, $const12$HourOfDayType, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 4442L)
  public static SubLObject sliding_time_type_p(final SubLObject time_parameter)
  {
    return makeBoolean( NIL != el_utilities.el_formula_p( time_parameter ) && cycl_utilities.nat_functor( time_parameter ).eql( $const13$SameLengthTimeIntervalTypeFn ) && NIL != subl_promotions.memberP(
        extract_sliding_time_type( time_parameter ), $duration_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) && NIL != number_utilities.positive_number_p( extract_sliding_type_amount( time_parameter ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 4925L)
  public static SubLObject extract_sliding_type(final SubLObject time_type)
  {
    return cycl_utilities.formula_arg1( time_type, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 5107L)
  public static SubLObject extract_sliding_time_type(final SubLObject time_type)
  {
    return cycl_utilities.formula_operator( cycl_utilities.formula_arg1( time_type, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 5318L)
  public static SubLObject extract_sliding_type_amount(final SubLObject time_type)
  {
    return cycl_utilities.formula_arg1( cycl_utilities.formula_arg1( time_type, UNPROVIDED ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 5509L)
  public static SubLObject make_sliding_type(final SubLObject duration)
  {
    if( NIL != a_really_long_timeP( duration ) )
    {
      return $const14$Null_TimeParameter;
    }
    return ConsesLow.list( $const13$SameLengthTimeIntervalTypeFn, duration );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 6124L)
  public static SubLObject duration_function_p(final SubLObject v_object)
  {
    return subl_promotions.memberP( v_object, $duration_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 6220L)
  public static SubLObject duration_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != a_really_long_timeP( v_object ) || ( NIL != el_utilities.el_formula_p( v_object ) && NIL != variables.fully_bound_p( v_object ) && NIL != duration_function_p( cycl_utilities.formula_arg0(
        v_object ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 6473L)
  public static SubLObject zero_duration_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != duration_p( v_object ) && duration_magnitude( v_object ).isZero() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 6595L)
  public static SubLObject duration_typeL(final SubLObject type1, final SubLObject type2)
  {
    return Numbers.numL( Sequences.position( type1, $duration_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), Sequences.position( type2, $duration_predicates$.getGlobalValue(), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 6827L)
  public static SubLObject duration_type(final SubLObject duration)
  {
    return duration.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 6897L)
  public static SubLObject duration_magnitude(final SubLObject duration)
  {
    return conses_high.second( duration );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 6973L)
  public static SubLObject duration_precision(final SubLObject duration)
  {
    return duration_type( duration );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 7269L)
  public static SubLObject a_really_long_timeP(final SubLObject duration)
  {
    return Equality.eql( duration, $a_really_long_time$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 7435L)
  public static SubLObject durationL(final SubLObject duration1, final SubLObject duration2)
  {
    final SubLObject dur1_type = duration_type( duration1 );
    final SubLObject dur1_amount = duration_magnitude( duration1 );
    final SubLObject dur2_type = duration_type( duration2 );
    final SubLObject dur2_amount = duration_magnitude( duration2 );
    if( dur1_type.eql( dur2_type ) )
    {
      return Numbers.numL( dur1_amount, dur2_amount );
    }
    if( NIL != duration_typeL( dur1_type, dur2_type ) )
    {
      return Numbers.numL( dur1_amount, Numbers.multiply( find_duration_quotient( dur1_type, dur2_type, UNPROVIDED ), dur2_amount ) );
    }
    return Numbers.numL( Numbers.multiply( find_duration_quotient( dur2_type, dur1_type, UNPROVIDED ), dur1_amount ), dur2_amount );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 8115L)
  public static SubLObject durationLE(final SubLObject duration1, final SubLObject duration2)
  {
    final SubLObject dur1_type = duration_type( duration1 );
    final SubLObject dur1_amount = duration_magnitude( duration1 );
    final SubLObject dur2_type = duration_type( duration2 );
    final SubLObject dur2_amount = duration_magnitude( duration2 );
    if( dur1_type.eql( dur2_type ) )
    {
      return Numbers.numLE( dur1_amount, dur2_amount );
    }
    if( NIL != duration_typeL( dur1_type, dur2_type ) )
    {
      return Numbers.numLE( dur1_amount, Numbers.multiply( find_duration_quotient( dur1_type, dur2_type, UNPROVIDED ), dur2_amount ) );
    }
    return Numbers.numLE( Numbers.multiply( find_duration_quotient( dur2_type, dur1_type, UNPROVIDED ), dur1_amount ), dur2_amount );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 8792L)
  public static SubLObject durationE(final SubLObject duration1, final SubLObject duration2)
  {
    final SubLObject dur1_type = duration_type( duration1 );
    final SubLObject dur1_amount = duration_magnitude( duration1 );
    final SubLObject dur2_type = duration_type( duration2 );
    final SubLObject dur2_amount = duration_magnitude( duration2 );
    if( dur1_type.eql( dur2_type ) )
    {
      return Numbers.numE( dur1_amount, dur2_amount );
    }
    if( NIL != duration_typeL( dur1_type, dur2_type ) )
    {
      return Numbers.numE( dur1_amount, Numbers.multiply( find_duration_quotient( dur1_type, dur2_type, UNPROVIDED ), dur2_amount ) );
    }
    return Numbers.numE( Numbers.multiply( find_duration_quotient( dur2_type, dur1_type, UNPROVIDED ), dur1_amount ), dur2_amount );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 9459L)
  public static SubLObject add_durations(final SubLObject duration1, final SubLObject duration2)
  {
    final SubLObject dur1_type = duration_type( duration1 );
    final SubLObject dur1_amount = duration_magnitude( duration1 );
    final SubLObject dur2_type = duration_type( duration2 );
    final SubLObject dur2_amount = duration_magnitude( duration2 );
    if( dur1_type.eql( dur2_type ) )
    {
      return ConsesLow.list( dur1_type, Numbers.add( dur1_amount, dur2_amount ) );
    }
    if( NIL != duration_typeL( dur1_type, dur2_type ) )
    {
      return ConsesLow.list( dur1_type, Numbers.add( dur1_amount, Numbers.multiply( find_duration_quotient( dur1_type, dur2_type, UNPROVIDED ), dur2_amount ) ) );
    }
    return ConsesLow.list( dur2_type, Numbers.add( dur2_amount, Numbers.multiply( find_duration_quotient( dur2_type, dur1_type, UNPROVIDED ), dur1_amount ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 10208L)
  public static SubLObject scale_duration(final SubLObject duration, final SubLObject scalar)
  {
    return ConsesLow.list( duration_type( duration ), Numbers.multiply( scalar, duration_magnitude( duration ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 10340L)
  public static SubLObject find_duration_quotient(final SubLObject type1, final SubLObject type2, SubLObject acc)
  {
    if( acc == UNPROVIDED )
    {
      acc = ONE_INTEGER;
    }
    if( type1.eql( type2 ) )
    {
      return acc;
    }
    if( type1.eql( $const18$SecondsDuration ) )
    {
      return find_duration_quotient( $const19$MinutesDuration, type2, Numbers.multiply( $int20$60, acc ) );
    }
    if( type1.eql( $const19$MinutesDuration ) )
    {
      return find_duration_quotient( $const21$HoursDuration, type2, Numbers.multiply( $int20$60, acc ) );
    }
    if( type1.eql( $const21$HoursDuration ) )
    {
      return find_duration_quotient( $const22$DaysDuration, type2, Numbers.multiply( $int23$24, acc ) );
    }
    if( type1.eql( $const22$DaysDuration ) )
    {
      return find_duration_quotient( $const24$WeeksDuration, type2, Numbers.multiply( SEVEN_INTEGER, acc ) );
    }
    if( type1.eql( $const24$WeeksDuration ) )
    {
      return find_duration_quotient( $const25$MonthsDuration, type2, Numbers.multiply( FOUR_INTEGER, acc ) );
    }
    if( type1.eql( $const25$MonthsDuration ) )
    {
      return find_duration_quotient( $const26$QuartersDuration, type2, Numbers.multiply( THREE_INTEGER, acc ) );
    }
    if( type1.eql( $const26$QuartersDuration ) )
    {
      return find_duration_quotient( $const27$YearsDuration, type2, Numbers.multiply( FOUR_INTEGER, acc ) );
    }
    if( type1.eql( $const27$YearsDuration ) )
    {
      return find_duration_quotient( $const28$DecadesDuration, type2, Numbers.multiply( TEN_INTEGER, acc ) );
    }
    if( type1.eql( $const28$DecadesDuration ) )
    {
      return find_duration_quotient( $const29$CenturiesDuration, type2, Numbers.multiply( TEN_INTEGER, acc ) );
    }
    if( type1.eql( $const29$CenturiesDuration ) )
    {
      return find_duration_quotient( $const30$MillenniaDuration, type2, Numbers.multiply( TEN_INTEGER, acc ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 11537L)
  public static SubLObject date_interval_subsumes_typeP(final SubLObject interval, final SubLObject type)
  {
    if( NIL != a_really_long_timeP( interval_seconds_duration( interval ) ) )
    {
      return T;
    }
    if( NIL == sliding_time_type_p( type ) )
    {
      final SubLObject type_interval = nth_type_starting_no_earlier_than_start_of_interval( interval, type, ZERO_INTEGER );
      return ( NIL != type_interval ) ? hlmt_relevance.subsumed_time_intervalP( type_interval, interval ) : NIL;
    }
    final SubLObject type_duration = get_duration_of_type( type );
    if( NIL != type_duration )
    {
      final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second( interval );
      final SubLObject type_end = time_interval_utilities.preceding_cycl_date( date_utilities.date_after( time_interval_utilities.cycl_interval_initial_second( interval ), type_duration ) );
      return date_utilities.dateLE( type_end, interval_end );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 12535L)
  public static SubLObject date_interval_subsumed_by_typeP(final SubLObject interval, final SubLObject type)
  {
    if( NIL != a_really_long_timeP( interval_seconds_duration( interval ) ) )
    {
      return NIL;
    }
    final SubLObject type_seconds_duration = type_seconds_duration( type );
    if( NIL == type_seconds_duration )
    {
      return NIL;
    }
    if( NIL != a_really_long_timeP( type_seconds_duration( type ) ) )
    {
      return T;
    }
    if( NIL != sliding_time_type_p( type ) )
    {
      final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second( interval );
      final SubLObject type_end = time_interval_utilities.preceding_cycl_date( date_utilities.date_after( time_interval_utilities.cycl_interval_initial_second( interval ), get_duration_of_type( type ) ) );
      return date_utilities.dateLE( interval_end, type_end );
    }
    final SubLObject type_interval = nth_type_starting_no_later_than_start_of_interval( interval, type, ZERO_INTEGER );
    return ( NIL != type_interval ) ? hlmt_relevance.subsumed_time_intervalP( interval, type_interval ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 13442L)
  public static SubLObject type_duration_from_date(final SubLObject date, final SubLObject type)
  {
    final SubLObject type_duration = get_duration_of_type( type );
    return ( NIL != type_duration ) ? date_utilities.date_after( date, type_duration ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 13739L)
  public static SubLObject get_duration_of_type(final SubLObject type)
  {
    SubLObject duration = NIL;
    if( type.eql( $const14$Null_TimeParameter ) )
    {
      return $a_really_long_time$.getGlobalValue();
    }
    if( type.eql( $const0$TimePoint ) )
    {
      return $list31;
    }
    if( NIL != gappy_time_type_p( type ) )
    {
      duration = gappy_type_duration( type );
    }
    else if( NIL != covering_time_type_p( type ) )
    {
      final SubLObject duration_fn = time_series_type_duration( type );
      if( NIL != duration_fn )
      {
        duration = ConsesLow.list( duration_fn, ONE_INTEGER );
      }
    }
    else
    {
      duration = extract_sliding_type( type );
    }
    return duration;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 14480L)
  public static SubLObject get_duration_of_interval(final SubLObject interval)
  {
    if( NIL != date_utilities.date_p( interval ) )
    {
      return reader.bq_cons( time_series_type_duration( date_utilities.date_precision( interval ) ), $list32 );
    }
    if( NIL == time_interval_utilities.proper_date_interval_p( interval ) && NIL == date_utilities.generalized_date_p( interval ) )
    {
      return ConsesLow.list( $const18$SecondsDuration, interval_seconds_duration( interval ) );
    }
    final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second( interval );
    final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second( interval );
    if( NIL != date_utilities.beginning_of_timeP( interval_start ) || NIL != date_utilities.end_of_timeP( interval_end ) )
    {
      return $a_really_long_time$.getGlobalValue();
    }
    return ConsesLow.list( $const18$SecondsDuration, number_utilities.f_1X( conses_high.second( date_utilities.time_elapsed( interval_start, interval_end, UNPROVIDED ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 15287L)
  public static SubLObject interval_seconds_duration(final SubLObject time_interval)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != date_utilities.date_p( time_interval ) )
    {
      thread.resetMultipleValues();
      final SubLObject format = date_utilities.explode_date( time_interval );
      final SubLObject year = thread.secondMultipleValue();
      final SubLObject month = thread.thirdMultipleValue();
      final SubLObject day = thread.fourthMultipleValue();
      final SubLObject hour = thread.fifthMultipleValue();
      final SubLObject min = thread.sixthMultipleValue();
      final SubLObject sec = thread.seventhMultipleValue();
      thread.resetMultipleValues();
      if( NIL != sec )
      {
        return ONE_INTEGER;
      }
      if( NIL != min )
      {
        return numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue();
      }
      if( NIL != hour )
      {
        return numeric_date_utilities.$seconds_in_an_hour$.getGlobalValue();
      }
      if( NIL != day )
      {
        return numeric_date_utilities.$seconds_in_a_day$.getGlobalValue();
      }
      if( NIL != month )
      {
        return Numbers.multiply( numeric_date_utilities.$seconds_in_a_day$.getGlobalValue(), numeric_date_utilities.days_in_month_number( month, year ) );
      }
      if( NIL != year )
      {
        if( NIL != numeric_date_utilities.leap_year_p( year ) )
        {
          return numeric_date_utilities.$seconds_in_a_leap_year$.getGlobalValue();
        }
        return numeric_date_utilities.$seconds_in_a_non_leap_year$.getGlobalValue();
      }
    }
    else if( NIL != time_interval_utilities.proper_date_interval_p( time_interval ) )
    {
      final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second( time_interval );
      final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second( time_interval );
      if( NIL != date_utilities.beginning_of_timeP( interval_start ) || NIL != date_utilities.end_of_timeP( interval_end ) )
      {
        return $a_really_long_time$.getGlobalValue();
      }
      return number_utilities.f_1X( conses_high.second( date_utilities.time_elapsed( interval_start, interval_end, UNPROVIDED ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 16483L)
  public static SubLObject type_seconds_duration(final SubLObject type)
  {
    if( type.eql( $const14$Null_TimeParameter ) )
    {
      return $a_really_long_time$.getGlobalValue();
    }
    final SubLObject type_duration = get_duration_of_type( type );
    if( NIL != type_duration )
    {
      final SubLObject coefficient = find_duration_quotient( $const18$SecondsDuration, duration_type( type_duration ), UNPROVIDED );
      if( NIL != coefficient )
      {
        return Numbers.multiply( duration_magnitude( type_duration ), coefficient );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 16881L)
  public static SubLObject time_of_type_before_interval(final SubLObject type, final SubLObject amt, final SubLObject interval)
  {
    if( NIL != time_interval_utilities.date_interval_p( interval ) )
    {
      if( NIL != covering_time_type_p( type ) )
      {
        final SubLObject duration = construct_covering_duration( type, amt );
        final SubLObject result = date_utilities.date_before( interval, duration );
        return Values.values( result, list_utilities.sublisp_boolean( result ) );
      }
      if( NIL != gappy_type_duration( type ) )
      {
        return Values.values( interval, NIL );
      }
      Errors.error( $str33$Type__a_is_not_a_proper_Conventio, type );
    }
    else
    {
      Errors.error( $str34$Interval__a_is_not_a_proper_inter );
    }
    return Values.values( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 17733L)
  public static SubLObject time_of_type_after_interval(final SubLObject type, final SubLObject amt, final SubLObject interval)
  {
    if( NIL != time_interval_utilities.date_interval_p( interval ) )
    {
      if( NIL != covering_time_type_p( type ) )
      {
        final SubLObject duration = construct_covering_duration( type, amt );
        final SubLObject result = date_utilities.date_after( interval, duration );
        return Values.values( result, list_utilities.sublisp_boolean( result ) );
      }
      if( NIL != gappy_type_duration( type ) )
      {
        return Values.values( interval, NIL );
      }
      Errors.error( $str33$Type__a_is_not_a_proper_Conventio, type );
    }
    else
    {
      Errors.error( $str34$Interval__a_is_not_a_proper_inter );
    }
    return Values.values( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 18427L)
  public static SubLObject time_ended_by_last_type_in_interval(final SubLObject interval, final SubLObject type)
  {
    if( type.eql( $const14$Null_TimeParameter ) )
    {
      return ConsesLow.list( $const35$IntervalEndedByFn, interval );
    }
    if( NIL == time_interval_utilities.date_interval_p( interval ) )
    {
      return NIL;
    }
    if( NIL != time_interval_utilities.interval_started_by_intervalP( interval ) && NIL != time_point_type_p( type ) )
    {
      return $const36$Always_TimeInterval;
    }
    if( NIL != time_interval_utilities.some_time_interval_p( interval ) )
    {
      return ( NIL != time_point_type_p( type ) ) ? ConsesLow.list( $const35$IntervalEndedByFn, interval ) : NIL;
    }
    if( NIL == hlmt_relevance.time_interval_subsumes_typeP( interval, type ) )
    {
      return NIL;
    }
    final SubLObject last_type = nth_type_ending_no_later_than_end_of_interval( interval, type, ZERO_INTEGER );
    return time_interval_utilities.canonicalize_time_interval( ConsesLow.list( $const35$IntervalEndedByFn, last_type ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 19414L)
  public static SubLObject time_started_by_first_type_in_interval(final SubLObject interval, final SubLObject type)
  {
    if( type.eql( $const14$Null_TimeParameter ) )
    {
      return ConsesLow.list( $const37$IntervalStartedByFn, interval );
    }
    if( NIL == time_interval_utilities.date_interval_p( interval ) )
    {
      return NIL;
    }
    if( NIL != time_interval_utilities.interval_ended_by_intervalP( interval ) && NIL != time_point_type_p( type ) )
    {
      return $const36$Always_TimeInterval;
    }
    if( NIL != time_interval_utilities.some_time_interval_p( interval ) )
    {
      return ( NIL != time_point_type_p( type ) ) ? ConsesLow.list( $const37$IntervalStartedByFn, interval ) : NIL;
    }
    if( NIL == hlmt_relevance.time_interval_subsumes_typeP( interval, type ) )
    {
      return NIL;
    }
    final SubLObject first_type = nth_type_starting_no_earlier_than_start_of_interval( interval, type, ZERO_INTEGER );
    return time_interval_utilities.canonicalize_time_interval( ConsesLow.list( $const37$IntervalStartedByFn, first_type ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 20238L)
  public static SubLObject day_of_year_nat_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != cycl_grammar.cycl_nat_p( v_object ) && cycl_utilities.nat_functor( v_object ).eql( $const38$DayOfYearFn ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 20382L)
  public static SubLObject first_moment_of_covering_type_p(final SubLObject type, final SubLObject date)
  {
    if( NIL == date_utilities.date_p( date ) )
    {
      return NIL;
    }
    if( type.eql( $const39$CalendarSecond ) || type.eql( $const40$CalendarMinute ) || type.eql( $const41$CalendarHour ) || type.eql( $const42$CalendarDay ) || type.eql( $const43$CalendarMonth ) || type.eql(
        $const44$CalendarYear ) )
    {
      return first_moment_of_covering_type_p_int( type, date );
    }
    if( type.eql( $const45$CalendarWeek ) )
    {
      return makeBoolean( NIL != date_utilities.starting_value_for_calendar_unit_p( date_utilities.day_of_week_of_date( date ), $const45$CalendarWeek ) && NIL != first_moment_of_covering_type_p_int( $const42$CalendarDay,
          date ) );
    }
    if( type.eql( $const46$CalendarQuarter ) )
    {
      return makeBoolean( NIL != number_utilities.onep( Numbers.mod( date_utilities.extract_date_month_number( date ), FOUR_INTEGER ) ) && NIL != first_moment_of_covering_type_p_int( $const43$CalendarMonth, date ) );
    }
    if( type.eql( $const47$CalendarDecade ) )
    {
      return makeBoolean( Numbers.mod( date_utilities.extract_date_year( date ), TEN_INTEGER ).isZero() && NIL != first_moment_of_covering_type_p_int( $const44$CalendarYear, date ) );
    }
    if( type.eql( $const48$CalendarHalfCentury ) )
    {
      return makeBoolean( NIL != number_utilities.onep( Numbers.mod( date_utilities.extract_date_year( date ), $int49$50 ) ) && NIL != first_moment_of_covering_type_p_int( $const44$CalendarYear, date ) );
    }
    if( type.eql( $const50$CalendarCentury ) )
    {
      return makeBoolean( NIL != number_utilities.onep( Numbers.mod( date_utilities.extract_date_year( date ), $int51$100 ) ) && NIL != first_moment_of_covering_type_p_int( $const44$CalendarYear, date ) );
    }
    if( type.eql( $const52$CalendarMillennium ) )
    {
      return makeBoolean( NIL != number_utilities.onep( Numbers.mod( date_utilities.extract_date_year( date ), $int53$1000 ) ) && NIL != first_moment_of_covering_type_p_int( $const44$CalendarYear, date ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 21601L)
  public static SubLObject first_moment_of_covering_type_p_int(final SubLObject type, final SubLObject date)
  {
    SubLObject stopP = NIL;
    SubLObject successP = T;
    if( NIL == stopP )
    {
      SubLObject csome_list_var = date_utilities.$date_units_ordered$.getGlobalValue();
      SubLObject time_type = NIL;
      time_type = csome_list_var.first();
      while ( NIL == stopP && NIL != csome_list_var)
      {
        final SubLObject val = date_utilities.extract_date_time_type( date, time_type );
        if( time_type.eql( type ) )
        {
          stopP = T;
        }
        else if( NIL == date_utilities.starting_value_for_calendar_unit_p( val, time_type ) )
        {
          successP = NIL;
          stopP = T;
        }
        csome_list_var = csome_list_var.rest();
        time_type = csome_list_var.first();
      }
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 22002L)
  public static SubLObject last_moment_of_covering_type_p(final SubLObject type, final SubLObject date)
  {
    if( NIL == date_utilities.date_p( date ) )
    {
      return NIL;
    }
    if( type.eql( $const39$CalendarSecond ) || type.eql( $const40$CalendarMinute ) || type.eql( $const41$CalendarHour ) || type.eql( $const42$CalendarDay ) || type.eql( $const43$CalendarMonth ) || type.eql(
        $const44$CalendarYear ) )
    {
      return last_moment_of_covering_type_p_int( type, date );
    }
    if( type.eql( $const45$CalendarWeek ) )
    {
      return makeBoolean( NIL != date_utilities.ending_value_for_calendar_unit_p( date_utilities.day_of_week_of_date( date ), $const45$CalendarWeek, UNPROVIDED, UNPROVIDED ) && NIL != first_moment_of_covering_type_p_int(
          $const42$CalendarDay, date ) );
    }
    if( type.eql( $const46$CalendarQuarter ) )
    {
      return makeBoolean( Numbers.mod( date_utilities.extract_date_month_number( date ), FOUR_INTEGER ).isZero() && NIL != last_moment_of_covering_type_p_int( $const43$CalendarMonth, date ) );
    }
    if( type.eql( $const47$CalendarDecade ) )
    {
      return makeBoolean( NINE_INTEGER.numE( Numbers.mod( date_utilities.extract_date_year( date ), TEN_INTEGER ) ) && NIL != last_moment_of_covering_type_p_int( $const44$CalendarYear, date ) );
    }
    if( type.eql( $const48$CalendarHalfCentury ) )
    {
      return makeBoolean( Numbers.mod( date_utilities.extract_date_year( date ), $int49$50 ).isZero() && NIL != last_moment_of_covering_type_p_int( $const44$CalendarYear, date ) );
    }
    if( type.eql( $const50$CalendarCentury ) )
    {
      return makeBoolean( Numbers.mod( date_utilities.extract_date_year( date ), $int51$100 ).isZero() && NIL != last_moment_of_covering_type_p_int( $const44$CalendarYear, date ) );
    }
    if( type.eql( $const52$CalendarMillennium ) )
    {
      return makeBoolean( Numbers.mod( date_utilities.extract_date_year( date ), $int53$1000 ).isZero() && NIL != last_moment_of_covering_type_p_int( $const44$CalendarYear, date ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 23214L)
  public static SubLObject last_moment_of_covering_type_p_int(final SubLObject type, final SubLObject date)
  {
    SubLObject stopP = NIL;
    SubLObject successP = T;
    if( NIL == stopP )
    {
      SubLObject csome_list_var = date_utilities.$date_units_ordered$.getGlobalValue();
      SubLObject time_type = NIL;
      time_type = csome_list_var.first();
      while ( NIL == stopP && NIL != csome_list_var)
      {
        final SubLObject val = date_utilities.extract_date_time_type( date, time_type );
        if( time_type.eql( type ) )
        {
          stopP = T;
        }
        else if( NIL == date_utilities.ending_value_for_calendar_unit_p( val, time_type, UNPROVIDED, UNPROVIDED ) )
        {
          successP = NIL;
          stopP = T;
        }
        csome_list_var = csome_list_var.rest();
        time_type = csome_list_var.first();
      }
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 23612L)
  public static SubLObject nth_type_starting_before_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n)
  {
    final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second( interval );
    return nth_type_starting_before_time_point( interval_start, type, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 24051L)
  public static SubLObject nth_type_starting_no_later_than_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n)
  {
    final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second( interval );
    return nth_type_starting_no_later_than_time_point( interval_start, type, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 24371L)
  public static SubLObject nth_type_starting_after_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n)
  {
    final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second( interval );
    return nth_type_starting_after_time_point( interval_start, type, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 24676L)
  public static SubLObject nth_type_starting_no_earlier_than_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n)
  {
    final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second( interval );
    return nth_type_starting_no_earlier_than_time_point( interval_start, type, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 25002L)
  public static SubLObject nth_type_starting_before_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n)
  {
    final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second( interval );
    return nth_type_starting_before_time_point( interval_end, type, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 25301L)
  public static SubLObject nth_type_starting_no_later_than_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n)
  {
    final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second( interval );
    return nth_type_starting_no_later_than_time_point( interval_end, type, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 25611L)
  public static SubLObject nth_type_starting_after_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n)
  {
    final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second( interval );
    return nth_type_starting_after_time_point( interval_end, type, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 25906L)
  public static SubLObject nth_type_starting_no_earlier_than_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n)
  {
    final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second( interval );
    return nth_type_starting_no_earlier_than_time_point( interval_end, type, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 26222L)
  public static SubLObject nth_type_ending_before_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n)
  {
    final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second( interval );
    return nth_type_ending_before_time_point( interval_start, type, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 26525L)
  public static SubLObject nth_type_ending_no_later_than_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n)
  {
    final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second( interval );
    return nth_type_starting_no_later_than_time_point( interval_start, type, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 26841L)
  public static SubLObject nth_type_ending_after_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n)
  {
    final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second( interval );
    return nth_type_ending_after_time_point( interval_start, type, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 27140L)
  public static SubLObject nth_type_ending_no_earlier_than_start_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n)
  {
    final SubLObject interval_start = time_interval_utilities.cycl_interval_initial_second( interval );
    return nth_type_ending_no_earlier_than_time_point( interval_start, type, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 27460L)
  public static SubLObject nth_type_ending_before_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n)
  {
    final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second( interval );
    return nth_type_ending_before_time_point( interval_end, type, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 27753L)
  public static SubLObject nth_type_ending_no_later_than_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n)
  {
    final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second( interval );
    return nth_type_ending_no_later_than_time_point( interval_end, type, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 28057L)
  public static SubLObject nth_type_ending_after_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n)
  {
    final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second( interval );
    return nth_type_ending_after_time_point( interval_end, type, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 28346L)
  public static SubLObject nth_type_ending_no_earlier_than_end_of_interval(final SubLObject interval, final SubLObject type, final SubLObject n)
  {
    final SubLObject interval_end = time_interval_utilities.cycl_interval_final_second( interval );
    return nth_type_ending_no_earlier_than_time_point( interval_end, type, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 28656L)
  public static SubLObject nth_type_starting_before_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    final SubLObject new_time_point = time_interval_utilities.preceding_cycl_date( time_point );
    return nth_type_starting_no_later_than_time_point( new_time_point, type, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 28884L)
  public static SubLObject nth_type_starting_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    if( NIL != time_point_type_p( type ) )
    {
      return nth_time_point_no_later_than_time_point( time_point, n );
    }
    if( NIL != covering_time_type_p( type ) )
    {
      return nth_covering_time_type_starting_no_later_than_time_point( time_point, type, n );
    }
    if( NIL != gappy_time_type_p( type ) )
    {
      return nth_gappy_time_type_starting_no_later_than_time_point( time_point, type, n );
    }
    return Errors.error( $str54$Unknown_time_type__a_, type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 29358L)
  public static SubLObject nth_type_starting_after_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    final SubLObject new_time_point = time_interval_utilities.succeeding_cycl_date( time_point );
    return nth_type_starting_no_earlier_than_time_point( new_time_point, type, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 29572L)
  public static SubLObject nth_type_starting_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    if( NIL != time_point_type_p( type ) )
    {
      return nth_time_point_no_earlier_than_time_point( time_point, n );
    }
    if( NIL != covering_time_type_p( type ) )
    {
      return nth_covering_time_type_starting_no_earlier_than_time_point( time_point, type, n );
    }
    if( NIL != gappy_time_type_p( type ) )
    {
      return nth_gappy_time_type_starting_no_earlier_than_time_point( time_point, type, n );
    }
    return Errors.error( $str54$Unknown_time_type__a_, type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 30054L)
  public static SubLObject nth_type_ending_before_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    final SubLObject new_time_point = time_interval_utilities.preceding_cycl_date( time_point );
    return nth_type_ending_no_later_than_time_point( new_time_point, type, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 30262L)
  public static SubLObject nth_type_ending_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    if( NIL != time_point_type_p( type ) )
    {
      return nth_time_point_no_later_than_time_point( time_point, n );
    }
    if( NIL != covering_time_type_p( type ) )
    {
      return nth_covering_time_type_ending_no_later_than_time_point( time_point, type, n );
    }
    if( NIL != gappy_time_type_p( type ) )
    {
      return nth_gappy_time_type_ending_no_later_than_time_point( time_point, type, n );
    }
    return Errors.error( $str54$Unknown_time_type__a_, type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 30730L)
  public static SubLObject nth_type_ending_after_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    final SubLObject new_time_point = time_interval_utilities.succeeding_cycl_date( time_point );
    return nth_type_ending_no_earlier_than_time_point( new_time_point, type, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 30940L)
  public static SubLObject nth_type_ending_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    if( NIL != time_point_type_p( type ) )
    {
      return nth_time_point_no_earlier_than_time_point( time_point, n );
    }
    if( NIL != covering_time_type_p( type ) )
    {
      return nth_covering_time_type_ending_no_earlier_than_time_point( time_point, type, n );
    }
    if( NIL != gappy_time_type_p( type ) )
    {
      return nth_gappy_time_type_ending_no_earlier_than_time_point( time_point, type, n );
    }
    return Errors.error( $str54$Unknown_time_type__a_, type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 31416L)
  public static SubLObject nth_time_point_no_later_than_time_point(final SubLObject time_point, final SubLObject n)
  {
    return date_utilities.date_before( time_point, ConsesLow.list( $const18$SecondsDuration, n ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 31601L)
  public static SubLObject nth_time_point_no_earlier_than_time_point(final SubLObject time_point, final SubLObject n)
  {
    return date_utilities.date_after( time_point, ConsesLow.list( $const18$SecondsDuration, n ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 31771L)
  public static SubLObject nth_covering_time_type_starting_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    if( type.eql( $const39$CalendarSecond ) )
    {
      return date_utilities.date_before( time_point, ConsesLow.list( $const18$SecondsDuration, n ) );
    }
    if( type.eql( $const40$CalendarMinute ) || type.eql( $const41$CalendarHour ) || type.eql( $const42$CalendarDay ) || type.eql( $const43$CalendarMonth ) || type.eql( $const44$CalendarYear ) )
    {
      return date_utilities.date_before( date_utilities.date_to_precision( time_point, type, UNPROVIDED ), scale_duration( covering_type_duration( type ), n ) );
    }
    if( type.eql( $const45$CalendarWeek ) )
    {
      final SubLObject start = nth_gappy_time_type_starting_no_later_than_time_point( time_point, $const55$Sunday, n );
      final SubLObject end = date_utilities.date_after( start, $list56 );
      return ConsesLow.list( $const57$TimeIntervalInclusiveFn, start, end );
    }
    if( type.eql( $const46$CalendarQuarter ) )
    {
      return date_utilities.date_before( date_utilities.truncate_date_to_format( time_point, $kw58$QUARTER ), scale_duration( covering_type_duration( type ), n ) );
    }
    if( type.eql( $const47$CalendarDecade ) )
    {
      return date_utilities.date_before( date_utilities.truncate_date_to_format( time_point, $kw59$DECADE ), scale_duration( covering_type_duration( type ), n ) );
    }
    if( type.eql( $const50$CalendarCentury ) )
    {
      return date_utilities.date_before( date_utilities.truncate_date_to_format( time_point, $kw60$CENTURY ), scale_duration( covering_type_duration( type ), n ) );
    }
    if( type.eql( $const48$CalendarHalfCentury ) )
    {
      final SubLObject century = Numbers.subtract( cycl_utilities.nat_arg1( date_utilities.truncate_date_to_format( time_point, $kw60$CENTURY ), UNPROVIDED ), ONE_INTEGER );
      final SubLObject year_in_century = Numbers.mod( date_utilities.extract_date_year( time_point ), $int51$100 );
      final SubLObject displacement = Numbers.multiply( $int49$50, n );
      final SubLObject start2 = ( year_in_century.isZero() || year_in_century.numG( $int49$50 ) ) ? Numbers.subtract( Numbers.add( Numbers.multiply( century, $int51$100 ), $int61$51 ), displacement )
          : Numbers.subtract( Numbers.add( Numbers.multiply( century, $int51$100 ), ONE_INTEGER ), displacement );
      final SubLObject end2 = Numbers.add( start2, $int62$49 );
      return ConsesLow.list( $const57$TimeIntervalInclusiveFn, ConsesLow.list( $const63$YearFn, start2 ), ConsesLow.list( $const63$YearFn, end2 ) );
    }
    if( type.eql( $const52$CalendarMillennium ) )
    {
      final SubLObject year = date_utilities.extract_date_year( time_point );
      final SubLObject millenium = Numbers.integerDivide( Numbers.subtract( year, ONE_INTEGER ), $int53$1000 );
      final SubLObject displacement = Numbers.multiply( $int53$1000, n );
      final SubLObject start2 = Numbers.subtract( Numbers.add( Numbers.multiply( millenium, $int53$1000 ), ONE_INTEGER ), displacement );
      final SubLObject end2 = Numbers.add( start2, $int64$999 );
      return ConsesLow.list( $const57$TimeIntervalInclusiveFn, ConsesLow.list( $const63$YearFn, start2 ), ConsesLow.list( $const63$YearFn, end2 ) );
    }
    return Errors.error( $str65$No_support_for_type__a_, type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 33731L)
  public static SubLObject nth_covering_time_type_starting_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    if( type.eql( $const39$CalendarSecond ) )
    {
      return date_utilities.date_after( time_point, ConsesLow.list( $const18$SecondsDuration, n ) );
    }
    if( type.eql( $const40$CalendarMinute ) || type.eql( $const41$CalendarHour ) || type.eql( $const42$CalendarDay ) || type.eql( $const43$CalendarMonth ) || type.eql( $const44$CalendarYear ) )
    {
      return ( NIL != first_moment_of_covering_type_p( type, time_point ) ) ? date_utilities.date_after( date_utilities.date_to_precision( time_point, type, UNPROVIDED ), scale_duration( covering_type_duration( type ),
          n ) ) : date_utilities.date_after( date_utilities.date_to_precision( time_point, type, UNPROVIDED ), scale_duration( covering_type_duration( type ), number_utilities.f_1X( n ) ) );
    }
    if( type.eql( $const45$CalendarWeek ) )
    {
      final SubLObject start = nth_gappy_time_type_starting_no_earlier_than_time_point( time_point, $const55$Sunday, n );
      final SubLObject end = date_utilities.date_after( start, $list56 );
      return ConsesLow.list( $const57$TimeIntervalInclusiveFn, start, end );
    }
    if( type.eql( $const46$CalendarQuarter ) )
    {
      return ( NIL != first_moment_of_covering_type_p( type, time_point ) ) ? date_utilities.date_after( date_utilities.truncate_date_to_format( time_point, $kw58$QUARTER ), scale_duration( covering_type_duration(
          type ), n ) ) : date_utilities.date_after( date_utilities.truncate_date_to_format( time_point, $kw58$QUARTER ), scale_duration( covering_type_duration( type ), number_utilities.f_1X( n ) ) );
    }
    if( type.eql( $const47$CalendarDecade ) )
    {
      return ( NIL != first_moment_of_covering_type_p( type, time_point ) ) ? date_utilities.date_after( date_utilities.truncate_date_to_format( time_point, $kw59$DECADE ), scale_duration( covering_type_duration( type ),
          n ) ) : date_utilities.date_after( date_utilities.truncate_date_to_format( time_point, $kw59$DECADE ), scale_duration( covering_type_duration( type ), number_utilities.f_1X( n ) ) );
    }
    if( type.eql( $const50$CalendarCentury ) )
    {
      return ( NIL != first_moment_of_covering_type_p( type, time_point ) ) ? date_utilities.date_after( date_utilities.truncate_date_to_format( time_point, $kw60$CENTURY ), scale_duration( covering_type_duration(
          type ), n ) ) : date_utilities.date_after( date_utilities.truncate_date_to_format( time_point, $kw60$CENTURY ), scale_duration( covering_type_duration( type ), number_utilities.f_1X( n ) ) );
    }
    if( type.eql( $const48$CalendarHalfCentury ) )
    {
      final SubLObject beginning_of_yearP = first_moment_of_covering_type_p( $const44$CalendarYear, time_point );
      final SubLObject century = Numbers.subtract( cycl_utilities.nat_arg1( date_utilities.truncate_date_to_format( time_point, $kw60$CENTURY ), UNPROVIDED ), ONE_INTEGER );
      final SubLObject year_in_century = Numbers.mod( date_utilities.extract_date_year( time_point ), $int51$100 );
      final SubLObject displacement = Numbers.multiply( $int49$50, ( year_in_century.numE( ONE_INTEGER ) && NIL != beginning_of_yearP ) ? n
          : ( ( year_in_century.numL( $int61$51 ) || ( year_in_century.numE( $int61$51 ) && NIL != beginning_of_yearP ) ) ? Numbers.add( n, ONE_INTEGER ) : Numbers.add( n, TWO_INTEGER ) ) );
      final SubLObject start2 = Numbers.add( Numbers.multiply( century, $int51$100 ), ONE_INTEGER, displacement );
      final SubLObject end2 = Numbers.add( start2, $int62$49 );
      return ConsesLow.list( $const57$TimeIntervalInclusiveFn, ConsesLow.list( $const63$YearFn, start2 ), ConsesLow.list( $const63$YearFn, end2 ) );
    }
    if( type.eql( $const52$CalendarMillennium ) )
    {
      final SubLObject beginning_of_yearP = first_moment_of_covering_type_p( $const44$CalendarYear, time_point );
      final SubLObject year = date_utilities.extract_date_year( time_point );
      final SubLObject millenium = Numbers.integerDivide( Numbers.subtract( year, ONE_INTEGER ), $int53$1000 );
      final SubLObject displacement = Numbers.multiply( $int53$1000, ( Numbers.mod( year, $int53$1000 ).numE( ONE_INTEGER ) && NIL != beginning_of_yearP ) ? n : Numbers.add( n, ONE_INTEGER ) );
      final SubLObject start2 = Numbers.add( Numbers.multiply( millenium, $int53$1000 ), ONE_INTEGER, displacement );
      final SubLObject end2 = Numbers.add( start2, $int64$999 );
      return ConsesLow.list( $const57$TimeIntervalInclusiveFn, ConsesLow.list( $const63$YearFn, start2 ), ConsesLow.list( $const63$YearFn, end2 ) );
    }
    return Errors.error( $str65$No_support_for_type__a_, type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 36780L)
  public static SubLObject nth_covering_time_type_ending_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    final SubLObject reference_interval = nth_covering_time_type_starting_no_later_than_time_point( time_point, type, ZERO_INTEGER );
    return ( NIL != date_utilities.dateL( time_point, time_interval_utilities.cycl_interval_final_second( reference_interval ) ) ) ? nth_covering_time_type_starting_no_later_than_time_point( time_point, type, Numbers
        .add( n, ONE_INTEGER ) ) : nth_covering_time_type_starting_no_later_than_time_point( time_point, type, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 37250L)
  public static SubLObject nth_covering_time_type_ending_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    final SubLObject reference_interval = nth_covering_time_type_starting_no_later_than_time_point( time_point, type, ZERO_INTEGER );
    return ( NIL != date_utilities.dateL( time_interval_utilities.cycl_interval_final_second( reference_interval ), time_point ) ) ? nth_covering_time_type_starting_no_earlier_than_time_point( time_point, type, n )
        : nth_covering_time_type_starting_no_earlier_than_time_point( time_point, type, Numbers.subtract( n, ONE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 37726L)
  public static SubLObject nth_gappy_time_type_starting_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    if( NIL != month_of_year_typeP( type ) )
    {
      return nth_month_of_year_type_starting_no_later_than_time_point( time_point, type, n );
    }
    if( NIL != day_of_week_typeP( type ) )
    {
      return nth_day_of_week_type_starting_no_later_than_time_point( time_point, type, n );
    }
    if( NIL != hour_of_day_typeP( type ) )
    {
      return nth_hour_of_day_type_starting_no_later_than_time_point( time_point, type, n );
    }
    if( NIL != day_of_year_typeP( type ) )
    {
      return nth_day_of_year_type_starting_no_later_than_time_point( time_point, type, n );
    }
    if( type.eql( $const66$CalendarWorkWeek ) )
    {
      final SubLObject start = nth_gappy_time_type_starting_no_later_than_time_point( time_point, $const67$Monday, n );
      final SubLObject end = date_utilities.date_after( start, $list68 );
      return ConsesLow.list( $const57$TimeIntervalInclusiveFn, start, end );
    }
    if( type.eql( $const69$CalendarWeekend ) )
    {
      final SubLObject start = nth_gappy_time_type_starting_no_later_than_time_point( time_point, $const70$Saturday, n );
      final SubLObject end = date_utilities.date_after( start, $list71 );
      return ConsesLow.list( $const57$TimeIntervalInclusiveFn, start, end );
    }
    if( type.eql( $const72$Weekday ) )
    {
      return nth_weekday_starting_no_later_than_time_point( time_point, n );
    }
    return Errors.error( $str65$No_support_for_type__a_, type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 38944L)
  public static SubLObject nth_gappy_time_type_starting_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    if( NIL != month_of_year_typeP( type ) )
    {
      return nth_month_of_year_type_starting_no_earlier_than_time_point( time_point, type, n );
    }
    if( NIL != day_of_week_typeP( type ) )
    {
      return nth_day_of_week_type_starting_no_earlier_than_time_point( time_point, type, n );
    }
    if( NIL != hour_of_day_typeP( type ) )
    {
      return nth_hour_of_day_type_starting_no_earlier_than_time_point( time_point, type, n );
    }
    if( NIL != day_of_year_typeP( type ) )
    {
      return nth_day_of_year_type_starting_no_earlier_than_time_point( time_point, type, n );
    }
    if( type.eql( $const66$CalendarWorkWeek ) )
    {
      final SubLObject start = nth_gappy_time_type_starting_no_earlier_than_time_point( time_point, $const67$Monday, n );
      final SubLObject end = date_utilities.date_after( start, $list68 );
      return ConsesLow.list( $const57$TimeIntervalInclusiveFn, start, end );
    }
    if( type.eql( $const69$CalendarWeekend ) )
    {
      final SubLObject start = nth_gappy_time_type_starting_no_earlier_than_time_point( time_point, $const70$Saturday, n );
      final SubLObject end = date_utilities.date_after( start, $list71 );
      return ConsesLow.list( $const57$TimeIntervalInclusiveFn, start, end );
    }
    if( type.eql( $const72$Weekday ) )
    {
      return nth_weekday_starting_no_earlier_than_time_point( time_point, n );
    }
    return Errors.error( $str65$No_support_for_type__a_, type );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 40177L)
  public static SubLObject nth_gappy_time_type_ending_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    final SubLObject reference_interval = nth_gappy_time_type_starting_no_later_than_time_point( time_point, type, ZERO_INTEGER );
    return ( NIL != date_utilities.dateL( time_point, time_interval_utilities.cycl_interval_final_second( reference_interval ) ) ) ? nth_gappy_time_type_starting_no_later_than_time_point( time_point, type, Numbers.add(
        n, ONE_INTEGER ) ) : nth_gappy_time_type_starting_no_later_than_time_point( time_point, type, n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 40635L)
  public static SubLObject nth_gappy_time_type_ending_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    final SubLObject reference_interval = nth_gappy_time_type_starting_no_later_than_time_point( time_point, type, ZERO_INTEGER );
    return ( NIL != date_utilities.dateL( time_interval_utilities.cycl_interval_final_second( reference_interval ), time_point ) ) ? nth_gappy_time_type_starting_no_earlier_than_time_point( time_point, type, n )
        : nth_gappy_time_type_starting_no_earlier_than_time_point( time_point, type, Numbers.subtract( n, ONE_INTEGER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 41099L)
  public static SubLObject nth_month_of_year_type_starting_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    if( NIL == date_utilities.month_term_p( type ) )
    {
      return Errors.error( $str65$No_support_for_type__a_, type );
    }
    final SubLObject date_month_number = date_utilities.extract_date_month_number( time_point );
    final SubLObject date_year = date_utilities.extract_date_year( time_point );
    final SubLObject type_month_number = date_utilities.number_of_month( type );
    final SubLObject displacement = type_month_number.numG( date_month_number ) ? number_utilities.f_1X( n ) : n;
    return date_utilities.construct_calendar_date( Numbers.subtract( date_year, displacement ), type_month_number, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 41655L)
  public static SubLObject nth_month_of_year_type_starting_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    if( NIL == date_utilities.month_term_p( type ) )
    {
      return Errors.error( $str65$No_support_for_type__a_, type );
    }
    final SubLObject beginning_of_monthP = first_moment_of_covering_type_p( $const43$CalendarMonth, time_point );
    final SubLObject date_month_number = date_utilities.extract_date_month_number( time_point );
    final SubLObject date_year = date_utilities.extract_date_year( time_point );
    final SubLObject type_month_number = date_utilities.number_of_month( type );
    final SubLObject displacement = ( type_month_number.numG( date_month_number ) || ( type_month_number.numE( date_month_number ) && NIL != beginning_of_monthP ) ) ? n : number_utilities.f_1X( n );
    return date_utilities.construct_calendar_date( Numbers.add( date_year, displacement ), type_month_number, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 42398L)
  public static SubLObject nth_day_of_week_type_starting_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    final SubLObject date_day_of_week = date_utilities.day_of_week_of_date( time_point );
    final SubLObject date_day_num = date_utilities.number_of_day_of_week( date_day_of_week );
    final SubLObject type_day_num = date_utilities.number_of_day_of_week( type );
    final SubLObject displacement = type_day_num.numG( date_day_num ) ? Numbers.add( Numbers.multiply( number_utilities.f_1X( n ), SEVEN_INTEGER ), Numbers.subtract( date_day_num, type_day_num ) )
        : Numbers.add( Numbers.multiply( n, SEVEN_INTEGER ), Numbers.subtract( date_day_num, type_day_num ) );
    return date_utilities.date_before( date_utilities.date_to_precision( time_point, $const42$CalendarDay, UNPROVIDED ), ConsesLow.list( $const22$DaysDuration, displacement ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 42921L)
  public static SubLObject nth_day_of_week_type_starting_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    final SubLObject beginning_of_dayP = first_moment_of_covering_type_p( $const42$CalendarDay, time_point );
    final SubLObject date_day_of_week = date_utilities.day_of_week_of_date( time_point );
    final SubLObject date_day_num = date_utilities.number_of_day_of_week( date_day_of_week );
    final SubLObject type_day_num = date_utilities.number_of_day_of_week( type );
    final SubLObject displacement = ( type_day_num.numG( date_day_num ) || ( type_day_num.numE( date_day_num ) && NIL != beginning_of_dayP ) ) ? Numbers.add( Numbers.multiply( n, SEVEN_INTEGER ), Numbers.subtract(
        type_day_num, date_day_num ) ) : Numbers.add( Numbers.multiply( number_utilities.f_1X( n ), SEVEN_INTEGER ), Numbers.subtract( type_day_num, date_day_num ) );
    return date_utilities.date_after( date_utilities.date_to_precision( time_point, $const42$CalendarDay, UNPROVIDED ), ConsesLow.list( $const22$DaysDuration, displacement ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 43612L)
  public static SubLObject nth_hour_of_day_type_starting_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    final SubLObject date_hour = date_utilities.extract_date_hour( time_point );
    final SubLObject type_hour = date_utilities.number_of_hour_of_day( type );
    final SubLObject displacement = type_hour.numG( date_hour ) ? number_utilities.f_1X( n ) : n;
    final SubLObject new_day = date_utilities.date_before( date_utilities.date_to_precision( time_point, $const42$CalendarDay, UNPROVIDED ), ConsesLow.list( $const22$DaysDuration, displacement ) );
    return ConsesLow.list( $const73$HourFn, type_hour, new_day );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 44041L)
  public static SubLObject nth_hour_of_day_type_starting_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    final SubLObject beginning_of_hourP = first_moment_of_covering_type_p( $const41$CalendarHour, time_point );
    final SubLObject date_hour = date_utilities.extract_date_hour( time_point );
    final SubLObject type_hour = date_utilities.number_of_hour_of_day( type );
    final SubLObject displacement = ( type_hour.numG( date_hour ) || ( type_hour.numE( date_hour ) && NIL != beginning_of_hourP ) ) ? n : number_utilities.f_1X( n );
    final SubLObject new_day = date_utilities.date_after( date_utilities.date_to_precision( time_point, $const42$CalendarDay, UNPROVIDED ), ConsesLow.list( $const22$DaysDuration, displacement ) );
    return ConsesLow.list( $const73$HourFn, type_hour, new_day );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 44653L)
  public static SubLObject nth_day_of_year_type_starting_no_later_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    if( NIL == day_of_year_nat_p( type ) )
    {
      return Errors.error( $str65$No_support_for_type__a_, type );
    }
    final SubLObject type_day = cycl_utilities.nat_arg2( type, UNPROVIDED );
    final SubLObject type_month_num = date_utilities.number_of_month( cycl_utilities.nat_arg1( type, UNPROVIDED ) );
    final SubLObject date_day = date_utilities.extract_date_day( time_point );
    final SubLObject date_month_num = date_utilities.extract_date_month_number( time_point );
    final SubLObject date_year = date_utilities.extract_date_year( time_point );
    final SubLObject displacement = ( type_month_num.numG( date_month_num ) || ( type_month_num.numE( date_month_num ) && type_day.numG( date_day ) ) ) ? number_utilities.f_1X( n ) : n;
    final SubLObject final_year = Numbers.subtract( date_year, displacement );
    return date_utilities.construct_calendar_date( final_year, type_month_num, type_day, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 45417L)
  public static SubLObject nth_day_of_year_type_starting_no_earlier_than_time_point(final SubLObject time_point, final SubLObject type, final SubLObject n)
  {
    if( NIL == day_of_year_nat_p( type ) )
    {
      return Errors.error( $str65$No_support_for_type__a_, type );
    }
    final SubLObject beginning_of_dayP = first_moment_of_covering_type_p( $const42$CalendarDay, time_point );
    final SubLObject type_day = cycl_utilities.nat_arg2( type, UNPROVIDED );
    final SubLObject type_month_num = date_utilities.number_of_month( cycl_utilities.nat_arg1( type, UNPROVIDED ) );
    final SubLObject date_day = date_utilities.extract_date_day( time_point );
    final SubLObject date_month_num = date_utilities.extract_date_month_number( time_point );
    final SubLObject date_year = date_utilities.extract_date_year( time_point );
    final SubLObject displacement = ( type_month_num.numG( date_month_num ) || ( type_month_num.numE( date_month_num ) && type_day.numG( date_day ) ) || ( type_month_num.numE( date_month_num )
        && NIL != beginning_of_dayP ) ) ? n : number_utilities.f_1X( n );
    final SubLObject final_year = Numbers.add( date_year, displacement );
    return date_utilities.construct_calendar_date( final_year, type_month_num, type_day, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 46361L)
  public static SubLObject nth_weekday_starting_no_later_than_time_point(final SubLObject time_point, final SubLObject n)
  {
    final SubLObject start_day = date_utilities.date_to_precision( time_point, $const42$CalendarDay, UNPROVIDED );
    final SubLObject start_day_type = date_utilities.day_of_week_of_date( start_day );
    SubLObject first_weekday = NIL;
    SubLObject first_weekday_type = NIL;
    final SubLObject pcase_var = start_day_type;
    if( pcase_var.eql( $const70$Saturday ) )
    {
      first_weekday = date_utilities.date_before( start_day, $list71 );
      first_weekday_type = $const74$Friday;
    }
    else if( pcase_var.eql( $const55$Sunday ) )
    {
      first_weekday = date_utilities.date_before( start_day, $list75 );
      first_weekday_type = $const74$Friday;
    }
    else
    {
      first_weekday = start_day;
      first_weekday_type = start_day_type;
    }
    if( n.isZero() )
    {
      return first_weekday;
    }
    final SubLObject week_displacement = Numbers.integerDivide( n, FIVE_INTEGER );
    final SubLObject day_displacement = Numbers.mod( n, FIVE_INTEGER );
    final SubLObject reference_day = date_utilities.date_before( first_weekday, ConsesLow.list( $const24$WeeksDuration, week_displacement ) );
    final SubLObject reference_day_num = Numbers.subtract( date_utilities.number_of_day_of_week( first_weekday_type ), ONE_INTEGER );
    if( day_displacement.isZero() )
    {
      return reference_day;
    }
    if( day_displacement.numLE( reference_day_num ) )
    {
      return date_utilities.date_before( reference_day, ConsesLow.list( $const22$DaysDuration, day_displacement ) );
    }
    return date_utilities.date_before( reference_day, ConsesLow.list( $const22$DaysDuration, Numbers.add( TWO_INTEGER, day_displacement ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-parameter-utilities.lisp", position = 47582L)
  public static SubLObject nth_weekday_starting_no_earlier_than_time_point(final SubLObject time_point, final SubLObject n)
  {
    final SubLObject beginning_of_dayP = first_moment_of_covering_type_p( $const42$CalendarDay, time_point );
    SubLObject start_day = date_utilities.date_to_precision( time_point, $const42$CalendarDay, UNPROVIDED );
    final SubLObject start_day_type = date_utilities.day_of_week_of_date( start_day );
    SubLObject first_weekday = NIL;
    SubLObject first_weekday_type = NIL;
    if( NIL == beginning_of_dayP )
    {
      start_day = date_utilities.date_after( start_day, $list71 );
    }
    final SubLObject pcase_var = start_day_type;
    if( pcase_var.eql( $const70$Saturday ) )
    {
      first_weekday = date_utilities.date_after( start_day, $list75 );
      first_weekday_type = $const67$Monday;
    }
    else if( pcase_var.eql( $const55$Sunday ) )
    {
      first_weekday = date_utilities.date_after( start_day, $list71 );
      first_weekday_type = $const67$Monday;
    }
    else
    {
      first_weekday = start_day;
      first_weekday_type = start_day_type;
    }
    if( n.isZero() )
    {
      return first_weekday;
    }
    final SubLObject week_displacement = Numbers.integerDivide( n, FIVE_INTEGER );
    final SubLObject day_displacement = Numbers.mod( n, FIVE_INTEGER );
    final SubLObject reference_day = date_utilities.date_after( first_weekday, ConsesLow.list( $const24$WeeksDuration, week_displacement ) );
    final SubLObject reference_day_num = Numbers.subtract( date_utilities.number_of_day_of_week( first_weekday_type ), ONE_INTEGER );
    if( day_displacement.isZero() )
    {
      return reference_day;
    }
    if( Numbers.add( day_displacement, reference_day_num ).numLE( FOUR_INTEGER ) )
    {
      return date_utilities.date_after( reference_day, ConsesLow.list( $const22$DaysDuration, day_displacement ) );
    }
    return date_utilities.date_after( reference_day, ConsesLow.list( $const22$DaysDuration, Numbers.add( TWO_INTEGER, day_displacement ) ) );
  }

  public static SubLObject declare_time_parameter_utilities_file()
  {
    SubLFiles.declareFunction( me, "time_point_type_p", "TIME-POINT-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "conventional_time_series_p", "CONVENTIONAL-TIME-SERIES-P", 1, 0, false );
    SubLFiles.declareFunction( me, "time_series_type_duration", "TIME-SERIES-TYPE-DURATION", 1, 0, false );
    SubLFiles.declareFunction( me, "time_series_duration", "TIME-SERIES-DURATION", 1, 0, false );
    SubLFiles.declareFunction( me, "covering_time_type_p", "COVERING-TIME-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "covering_type_unit_duration", "COVERING-TYPE-UNIT-DURATION", 1, 0, false );
    SubLFiles.declareFunction( me, "covering_type_duration", "COVERING-TYPE-DURATION", 1, 0, false );
    SubLFiles.declareFunction( me, "construct_covering_duration", "CONSTRUCT-COVERING-DURATION", 2, 0, false );
    SubLFiles.declareFunction( me, "gappy_time_type_p", "GAPPY-TIME-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "gappy_type_period", "GAPPY-TYPE-PERIOD", 1, 0, false );
    SubLFiles.declareFunction( me, "gappy_type_duration", "GAPPY-TYPE-DURATION", 1, 0, false );
    SubLFiles.declareFunction( me, "month_of_year_typeP", "MONTH-OF-YEAR-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "day_of_year_typeP", "DAY-OF-YEAR-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "day_of_week_typeP", "DAY-OF-WEEK-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "hour_of_day_typeP", "HOUR-OF-DAY-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "sliding_time_type_p", "SLIDING-TIME-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_sliding_type", "EXTRACT-SLIDING-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_sliding_time_type", "EXTRACT-SLIDING-TIME-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_sliding_type_amount", "EXTRACT-SLIDING-TYPE-AMOUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "make_sliding_type", "MAKE-SLIDING-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "duration_function_p", "DURATION-FUNCTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "duration_p", "DURATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "zero_duration_p", "ZERO-DURATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "duration_typeL", "DURATION-TYPE<", 2, 0, false );
    SubLFiles.declareFunction( me, "duration_type", "DURATION-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "duration_magnitude", "DURATION-MAGNITUDE", 1, 0, false );
    SubLFiles.declareFunction( me, "duration_precision", "DURATION-PRECISION", 1, 0, false );
    SubLFiles.declareFunction( me, "a_really_long_timeP", "A-REALLY-LONG-TIME?", 1, 0, false );
    SubLFiles.declareFunction( me, "durationL", "DURATION<", 2, 0, false );
    SubLFiles.declareFunction( me, "durationLE", "DURATION<=", 2, 0, false );
    SubLFiles.declareFunction( me, "durationE", "DURATION=", 2, 0, false );
    SubLFiles.declareFunction( me, "add_durations", "ADD-DURATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "scale_duration", "SCALE-DURATION", 2, 0, false );
    SubLFiles.declareFunction( me, "find_duration_quotient", "FIND-DURATION-QUOTIENT", 2, 1, false );
    SubLFiles.declareFunction( me, "date_interval_subsumes_typeP", "DATE-INTERVAL-SUBSUMES-TYPE?", 2, 0, false );
    SubLFiles.declareFunction( me, "date_interval_subsumed_by_typeP", "DATE-INTERVAL-SUBSUMED-BY-TYPE?", 2, 0, false );
    SubLFiles.declareFunction( me, "type_duration_from_date", "TYPE-DURATION-FROM-DATE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_duration_of_type", "GET-DURATION-OF-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_duration_of_interval", "GET-DURATION-OF-INTERVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "interval_seconds_duration", "INTERVAL-SECONDS-DURATION", 1, 0, false );
    SubLFiles.declareFunction( me, "type_seconds_duration", "TYPE-SECONDS-DURATION", 1, 0, false );
    SubLFiles.declareFunction( me, "time_of_type_before_interval", "TIME-OF-TYPE-BEFORE-INTERVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "time_of_type_after_interval", "TIME-OF-TYPE-AFTER-INTERVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "time_ended_by_last_type_in_interval", "TIME-ENDED-BY-LAST-TYPE-IN-INTERVAL", 2, 0, false );
    SubLFiles.declareFunction( me, "time_started_by_first_type_in_interval", "TIME-STARTED-BY-FIRST-TYPE-IN-INTERVAL", 2, 0, false );
    SubLFiles.declareFunction( me, "day_of_year_nat_p", "DAY-OF-YEAR-NAT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "first_moment_of_covering_type_p", "FIRST-MOMENT-OF-COVERING-TYPE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "first_moment_of_covering_type_p_int", "FIRST-MOMENT-OF-COVERING-TYPE-P-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "last_moment_of_covering_type_p", "LAST-MOMENT-OF-COVERING-TYPE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "last_moment_of_covering_type_p_int", "LAST-MOMENT-OF-COVERING-TYPE-P-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "nth_type_starting_before_start_of_interval", "NTH-TYPE-STARTING-BEFORE-START-OF-INTERVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_starting_no_later_than_start_of_interval", "NTH-TYPE-STARTING-NO-LATER-THAN-START-OF-INTERVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_starting_after_start_of_interval", "NTH-TYPE-STARTING-AFTER-START-OF-INTERVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_starting_no_earlier_than_start_of_interval", "NTH-TYPE-STARTING-NO-EARLIER-THAN-START-OF-INTERVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_starting_before_end_of_interval", "NTH-TYPE-STARTING-BEFORE-END-OF-INTERVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_starting_no_later_than_end_of_interval", "NTH-TYPE-STARTING-NO-LATER-THAN-END-OF-INTERVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_starting_after_end_of_interval", "NTH-TYPE-STARTING-AFTER-END-OF-INTERVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_starting_no_earlier_than_end_of_interval", "NTH-TYPE-STARTING-NO-EARLIER-THAN-END-OF-INTERVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_ending_before_start_of_interval", "NTH-TYPE-ENDING-BEFORE-START-OF-INTERVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_ending_no_later_than_start_of_interval", "NTH-TYPE-ENDING-NO-LATER-THAN-START-OF-INTERVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_ending_after_start_of_interval", "NTH-TYPE-ENDING-AFTER-START-OF-INTERVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_ending_no_earlier_than_start_of_interval", "NTH-TYPE-ENDING-NO-EARLIER-THAN-START-OF-INTERVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_ending_before_end_of_interval", "NTH-TYPE-ENDING-BEFORE-END-OF-INTERVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_ending_no_later_than_end_of_interval", "NTH-TYPE-ENDING-NO-LATER-THAN-END-OF-INTERVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_ending_after_end_of_interval", "NTH-TYPE-ENDING-AFTER-END-OF-INTERVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_ending_no_earlier_than_end_of_interval", "NTH-TYPE-ENDING-NO-EARLIER-THAN-END-OF-INTERVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_starting_before_time_point", "NTH-TYPE-STARTING-BEFORE-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_starting_no_later_than_time_point", "NTH-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_starting_after_time_point", "NTH-TYPE-STARTING-AFTER-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_starting_no_earlier_than_time_point", "NTH-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_ending_before_time_point", "NTH-TYPE-ENDING-BEFORE-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_ending_no_later_than_time_point", "NTH-TYPE-ENDING-NO-LATER-THAN-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_ending_after_time_point", "NTH-TYPE-ENDING-AFTER-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_type_ending_no_earlier_than_time_point", "NTH-TYPE-ENDING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_time_point_no_later_than_time_point", "NTH-TIME-POINT-NO-LATER-THAN-TIME-POINT", 2, 0, false );
    SubLFiles.declareFunction( me, "nth_time_point_no_earlier_than_time_point", "NTH-TIME-POINT-NO-EARLIER-THAN-TIME-POINT", 2, 0, false );
    SubLFiles.declareFunction( me, "nth_covering_time_type_starting_no_later_than_time_point", "NTH-COVERING-TIME-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_covering_time_type_starting_no_earlier_than_time_point", "NTH-COVERING-TIME-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_covering_time_type_ending_no_later_than_time_point", "NTH-COVERING-TIME-TYPE-ENDING-NO-LATER-THAN-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_covering_time_type_ending_no_earlier_than_time_point", "NTH-COVERING-TIME-TYPE-ENDING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_gappy_time_type_starting_no_later_than_time_point", "NTH-GAPPY-TIME-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_gappy_time_type_starting_no_earlier_than_time_point", "NTH-GAPPY-TIME-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_gappy_time_type_ending_no_later_than_time_point", "NTH-GAPPY-TIME-TYPE-ENDING-NO-LATER-THAN-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_gappy_time_type_ending_no_earlier_than_time_point", "NTH-GAPPY-TIME-TYPE-ENDING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_month_of_year_type_starting_no_later_than_time_point", "NTH-MONTH-OF-YEAR-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_month_of_year_type_starting_no_earlier_than_time_point", "NTH-MONTH-OF-YEAR-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_day_of_week_type_starting_no_later_than_time_point", "NTH-DAY-OF-WEEK-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_day_of_week_type_starting_no_earlier_than_time_point", "NTH-DAY-OF-WEEK-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_hour_of_day_type_starting_no_later_than_time_point", "NTH-HOUR-OF-DAY-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_hour_of_day_type_starting_no_earlier_than_time_point", "NTH-HOUR-OF-DAY-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_day_of_year_type_starting_no_later_than_time_point", "NTH-DAY-OF-YEAR-TYPE-STARTING-NO-LATER-THAN-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_day_of_year_type_starting_no_earlier_than_time_point", "NTH-DAY-OF-YEAR-TYPE-STARTING-NO-EARLIER-THAN-TIME-POINT", 3, 0, false );
    SubLFiles.declareFunction( me, "nth_weekday_starting_no_later_than_time_point", "NTH-WEEKDAY-STARTING-NO-LATER-THAN-TIME-POINT", 2, 0, false );
    SubLFiles.declareFunction( me, "nth_weekday_starting_no_earlier_than_time_point", "NTH-WEEKDAY-STARTING-NO-EARLIER-THAN-TIME-POINT", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_time_parameter_utilities_file()
  {
    $one_second_long$ = SubLFiles.defconstant( "*ONE-SECOND-LONG*", $list15 );
    $duration_predicates$ = SubLFiles.defconstant( "*DURATION-PREDICATES*", $list16 );
    $a_really_long_time$ = SubLFiles.defconstant( "*A-REALLY-LONG-TIME*", $kw17$A_LONG_TIME );
    return NIL;
  }

  public static SubLObject setup_time_parameter_utilities_file()
  {
    sunit_external.define_test_category( $str76$Time_Parameter_Tests, UNPROVIDED );
    sunit_external.define_test_suite( $str77$Start_of_Interval_Tests, $list78, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_time_parameter_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_time_parameter_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_time_parameter_utilities_file();
  }
  static
  {
    me = new time_parameter_utilities();
    $one_second_long$ = null;
    $duration_predicates$ = null;
    $a_really_long_time$ = null;
    $const0$TimePoint = constant_handles.reader_make_constant_shell( makeString( "TimePoint" ) );
    $const1$ConventionallyClassifiedTimeInter = constant_handles.reader_make_constant_shell( makeString( "ConventionallyClassifiedTimeIntervalSeries" ) );
    $const2$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $kw3$PERIOD = makeKeyword( "PERIOD" );
    $const4$durationOfType = constant_handles.reader_make_constant_shell( makeString( "durationOfType" ) );
    $list5 = ConsesLow.list( makeKeyword( "PERIOD" ) );
    $const6$CalendarCoveringType = constant_handles.reader_make_constant_shell( makeString( "CalendarCoveringType" ) );
    $const7$ConventionallyClassifiedTimeInter = constant_handles.reader_make_constant_shell( makeString( "ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps" ) );
    $const8$periodOfTimeIntervalSeries = constant_handles.reader_make_constant_shell( makeString( "periodOfTimeIntervalSeries" ) );
    $const9$MonthOfYearType = constant_handles.reader_make_constant_shell( makeString( "MonthOfYearType" ) );
    $const10$DayOfYearType = constant_handles.reader_make_constant_shell( makeString( "DayOfYearType" ) );
    $const11$DayOfWeekType = constant_handles.reader_make_constant_shell( makeString( "DayOfWeekType" ) );
    $const12$HourOfDayType = constant_handles.reader_make_constant_shell( makeString( "HourOfDayType" ) );
    $const13$SameLengthTimeIntervalTypeFn = constant_handles.reader_make_constant_shell( makeString( "SameLengthTimeIntervalTypeFn" ) );
    $const14$Null_TimeParameter = constant_handles.reader_make_constant_shell( makeString( "Null-TimeParameter" ) );
    $list15 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SecondsDuration" ) ), ONE_INTEGER );
    $list16 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "MillisecondsDuration" ) ), constant_handles.reader_make_constant_shell( makeString( "SecondsDuration" ) ),
      constant_handles.reader_make_constant_shell( makeString( "MinutesDuration" ) ), constant_handles.reader_make_constant_shell( makeString( "HoursDuration" ) ), constant_handles.reader_make_constant_shell( makeString(
          "DaysDuration" ) ), constant_handles.reader_make_constant_shell( makeString( "WeeksDuration" ) ), constant_handles.reader_make_constant_shell( makeString( "MonthsDuration" ) ), constant_handles
              .reader_make_constant_shell( makeString( "QuartersDuration" ) ), constant_handles.reader_make_constant_shell( makeString( "YearsDuration" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "DecadesDuration" ) ), constant_handles.reader_make_constant_shell( makeString( "CenturiesDuration" ) ), constant_handles.reader_make_constant_shell( makeString( "MillenniaDuration" ) )
    } );
    $kw17$A_LONG_TIME = makeKeyword( "A-LONG-TIME" );
    $const18$SecondsDuration = constant_handles.reader_make_constant_shell( makeString( "SecondsDuration" ) );
    $const19$MinutesDuration = constant_handles.reader_make_constant_shell( makeString( "MinutesDuration" ) );
    $int20$60 = makeInteger( 60 );
    $const21$HoursDuration = constant_handles.reader_make_constant_shell( makeString( "HoursDuration" ) );
    $const22$DaysDuration = constant_handles.reader_make_constant_shell( makeString( "DaysDuration" ) );
    $int23$24 = makeInteger( 24 );
    $const24$WeeksDuration = constant_handles.reader_make_constant_shell( makeString( "WeeksDuration" ) );
    $const25$MonthsDuration = constant_handles.reader_make_constant_shell( makeString( "MonthsDuration" ) );
    $const26$QuartersDuration = constant_handles.reader_make_constant_shell( makeString( "QuartersDuration" ) );
    $const27$YearsDuration = constant_handles.reader_make_constant_shell( makeString( "YearsDuration" ) );
    $const28$DecadesDuration = constant_handles.reader_make_constant_shell( makeString( "DecadesDuration" ) );
    $const29$CenturiesDuration = constant_handles.reader_make_constant_shell( makeString( "CenturiesDuration" ) );
    $const30$MillenniaDuration = constant_handles.reader_make_constant_shell( makeString( "MillenniaDuration" ) );
    $list31 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SecondsDuration" ) ), ZERO_INTEGER );
    $list32 = ConsesLow.list( ONE_INTEGER );
    $str33$Type__a_is_not_a_proper_Conventio = makeString( "Type ~a is not a proper ConventionallyClassifiedTimeIntervalSeries." );
    $str34$Interval__a_is_not_a_proper_inter = makeString( "Interval ~a is not a proper interval for offset calculations." );
    $const35$IntervalEndedByFn = constant_handles.reader_make_constant_shell( makeString( "IntervalEndedByFn" ) );
    $const36$Always_TimeInterval = constant_handles.reader_make_constant_shell( makeString( "Always-TimeInterval" ) );
    $const37$IntervalStartedByFn = constant_handles.reader_make_constant_shell( makeString( "IntervalStartedByFn" ) );
    $const38$DayOfYearFn = constant_handles.reader_make_constant_shell( makeString( "DayOfYearFn" ) );
    $const39$CalendarSecond = constant_handles.reader_make_constant_shell( makeString( "CalendarSecond" ) );
    $const40$CalendarMinute = constant_handles.reader_make_constant_shell( makeString( "CalendarMinute" ) );
    $const41$CalendarHour = constant_handles.reader_make_constant_shell( makeString( "CalendarHour" ) );
    $const42$CalendarDay = constant_handles.reader_make_constant_shell( makeString( "CalendarDay" ) );
    $const43$CalendarMonth = constant_handles.reader_make_constant_shell( makeString( "CalendarMonth" ) );
    $const44$CalendarYear = constant_handles.reader_make_constant_shell( makeString( "CalendarYear" ) );
    $const45$CalendarWeek = constant_handles.reader_make_constant_shell( makeString( "CalendarWeek" ) );
    $const46$CalendarQuarter = constant_handles.reader_make_constant_shell( makeString( "CalendarQuarter" ) );
    $const47$CalendarDecade = constant_handles.reader_make_constant_shell( makeString( "CalendarDecade" ) );
    $const48$CalendarHalfCentury = constant_handles.reader_make_constant_shell( makeString( "CalendarHalfCentury" ) );
    $int49$50 = makeInteger( 50 );
    $const50$CalendarCentury = constant_handles.reader_make_constant_shell( makeString( "CalendarCentury" ) );
    $int51$100 = makeInteger( 100 );
    $const52$CalendarMillennium = constant_handles.reader_make_constant_shell( makeString( "CalendarMillennium" ) );
    $int53$1000 = makeInteger( 1000 );
    $str54$Unknown_time_type__a_ = makeString( "Unknown time type ~a." );
    $const55$Sunday = constant_handles.reader_make_constant_shell( makeString( "Sunday" ) );
    $list56 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DaysDuration" ) ), SIX_INTEGER );
    $const57$TimeIntervalInclusiveFn = constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) );
    $kw58$QUARTER = makeKeyword( "QUARTER" );
    $kw59$DECADE = makeKeyword( "DECADE" );
    $kw60$CENTURY = makeKeyword( "CENTURY" );
    $int61$51 = makeInteger( 51 );
    $int62$49 = makeInteger( 49 );
    $const63$YearFn = constant_handles.reader_make_constant_shell( makeString( "YearFn" ) );
    $int64$999 = makeInteger( 999 );
    $str65$No_support_for_type__a_ = makeString( "No support for type ~a." );
    $const66$CalendarWorkWeek = constant_handles.reader_make_constant_shell( makeString( "CalendarWorkWeek" ) );
    $const67$Monday = constant_handles.reader_make_constant_shell( makeString( "Monday" ) );
    $list68 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DaysDuration" ) ), FOUR_INTEGER );
    $const69$CalendarWeekend = constant_handles.reader_make_constant_shell( makeString( "CalendarWeekend" ) );
    $const70$Saturday = constant_handles.reader_make_constant_shell( makeString( "Saturday" ) );
    $list71 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DaysDuration" ) ), ONE_INTEGER );
    $const72$Weekday = constant_handles.reader_make_constant_shell( makeString( "Weekday" ) );
    $const73$HourFn = constant_handles.reader_make_constant_shell( makeString( "HourFn" ) );
    $const74$Friday = constant_handles.reader_make_constant_shell( makeString( "Friday" ) );
    $list75 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DaysDuration" ) ), TWO_INTEGER );
    $str76$Time_Parameter_Tests = makeString( "Time Parameter Tests" );
    $str77$Start_of_Interval_Tests = makeString( "Start of Interval Tests" );
    $list78 = ConsesLow.list( makeString( "Time Parameter Tests" ) );
  }
}
/*
 * 
 * Total time: 360 ms
 * 
 */