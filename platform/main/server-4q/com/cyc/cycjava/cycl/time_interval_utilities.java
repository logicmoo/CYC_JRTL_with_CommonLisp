package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class time_interval_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.time_interval_utilities";
  public static final String myFingerPrint = "e4ca7d710c3bc4474da3b22e1fab6a246fefac3682f63c1fc6bf2fa996c4f3c9";
  private static final SubLObject $const0$TimeIntervalInclusiveFn;
  private static final SubLObject $const1$TimeIntervalBetweenFn;
  private static final SubLObject $const2$StartFn;
  private static final SubLObject $const3$EndFn;
  private static final SubLObject $const4$IntervalStartedByFn;
  private static final SubLObject $const5$IntervalEndedByFn;
  private static final SubLObject $const6$IntervalStartedByFn_Inclusive;
  private static final SubLObject $const7$IntervalEndedByFn_Inclusive;
  private static final SubLObject $const8$DateBeforeFn;
  private static final SubLObject $const9$DateAfterFn;
  private static final SubLObject $const10$IntervalAfterFn;
  private static final SubLObject $const11$IntervalBeforeFn;
  private static final SubLObject $const12$SomeTimeInIntervalFn;
  private static final SubLSymbol $sym13$SOME_TIME_INTERVAL_P;
  private static final SubLInteger $int14$36;
  private static final SubLSymbol $sym15$CYCL_INTERVAL_INITIAL_SECOND;
  private static final SubLString $str16$_a_is_not_a_proper_time_interval_;
  private static final SubLSymbol $kw17$END;
  private static final SubLSymbol $kw18$START;
  private static final SubLSymbol $sym19$GUID_STRING_P;
  private static final SubLSymbol $sym20$NULL;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLObject $const25$Always_TimeInterval;
  private static final SubLObject $const26$ContinuousTimeInterval;
  private static final SubLObject $const27$TheEmptyTimeInterval;
  private static final SubLSymbol $sym28$CONSTRUCT_REDUCED_CYCL_DATE;
  private static final SubLObject $const29$Now;
  private static final SubLList $list30;
  private static final SubLObject $const31$NthMetricallyPrecedingTimeInterva;
  private static final SubLObject $const32$NthMetricallySucceedingTimeInterv;
  private static final SubLString $str33$_a_not_a_date_interval_p;
  private static final SubLSymbol $sym34$DURATION_FUNCTION_P;
  private static final SubLObject $const35$TimePointsDuration;
  private static final SubLSymbol $sym36$DATE_INTERVAL_SUBSUMES_;
  private static final SubLSymbol $kw37$TEST;
  private static final SubLSymbol $kw38$OWNER;
  private static final SubLSymbol $kw39$CLASSES;
  private static final SubLSymbol $kw40$KB;
  private static final SubLSymbol $kw41$FULL;
  private static final SubLSymbol $kw42$WORKING_;
  private static final SubLList $list43;
  private static final SubLSymbol $sym44$CANONICALIZE_POSSIBLY_INDETERMINATE_TIME_INTERVAL_FN;
  private static final SubLSymbol $sym45$INTERVAL_EQUAL_IGNORING_GUIDS;
  private static final SubLObject $list46;
  private static final SubLSymbol $sym47$TEST_RECANONICALIZE_TIME_INTERVAL;
  private static final SubLObject $list48;
  static boolean assertionsDisabledSynth = true;

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 937L)
  public static SubLObject date_interval_p(final SubLObject time)
  {
    return makeBoolean( NIL != date_utilities.date_p( time ) || NIL != date_utilities.generalized_date_p( time ) || NIL != proper_date_interval_p( time ) || NIL != some_time_interval_p( time ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 1240L)
  public static SubLObject valid_time_index_p(final SubLObject time)
  {
    return makeBoolean( NIL != date_interval_p( time ) || NIL != date_utilities.temporal_indexical_p( time ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 1421L)
  public static SubLObject proper_date_interval_p(final SubLObject time)
  {
    if( NIL == el_utilities.el_formula_p( time ) )
    {
      return NIL;
    }
    final SubLObject pcase_var;
    final SubLObject functor = pcase_var = cycl_utilities.el_formula_operator( time );
    if( pcase_var.eql( $const0$TimeIntervalInclusiveFn ) || pcase_var.eql( $const1$TimeIntervalBetweenFn ) )
    {
      final SubLObject arg1 = cycl_utilities.el_formula_arg1( time, UNPROVIDED );
      final SubLObject arg2 = cycl_utilities.el_formula_arg2( time, UNPROVIDED );
      return makeBoolean( NIL != valid_time_index_p( arg1 ) && NIL != valid_time_index_p( arg2 ) );
    }
    if( pcase_var.eql( $const2$StartFn ) || pcase_var.eql( $const3$EndFn ) || pcase_var.eql( $const4$IntervalStartedByFn ) || pcase_var.eql( $const5$IntervalEndedByFn ) || pcase_var.eql(
        $const6$IntervalStartedByFn_Inclusive ) || pcase_var.eql( $const7$IntervalEndedByFn_Inclusive ) || pcase_var.eql( $const8$DateBeforeFn ) || pcase_var.eql( $const9$DateAfterFn ) )
    {
      final SubLObject arg3 = cycl_utilities.el_formula_arg1( time, UNPROVIDED );
      return valid_time_index_p( arg3 );
    }
    if( pcase_var.eql( $const10$IntervalAfterFn ) || pcase_var.eql( $const11$IntervalBeforeFn ) )
    {
      final SubLObject time_arg = cycl_utilities.el_formula_arg1( time, UNPROVIDED );
      final SubLObject duration_arg = cycl_utilities.el_formula_arg2( time, UNPROVIDED );
      return makeBoolean( NIL != valid_time_index_p( time_arg ) && NIL != time_parameter_utilities.duration_p( duration_arg ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 2365L)
  public static SubLObject some_time_interval_p(final SubLObject time)
  {
    return makeBoolean( NIL != el_utilities.possibly_naut_p( time ) && NIL != some_time_interval_functor_p( cycl_utilities.naut_functor( time ) ) && NIL != possibly_guid_string_p( cycl_utilities.naut_arg2( time,
        UNPROVIDED ) ) && NIL != date_interval_p( cycl_utilities.naut_arg1( time, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 2601L)
  public static SubLObject indeterminate_date_interval_p(final SubLObject time)
  {
    return makeBoolean( NIL != list_utilities.simple_tree_find( $const12$SomeTimeInIntervalFn, time ) && NIL != cycl_utilities.expression_find_if( $sym13$SOME_TIME_INTERVAL_P, time, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 2793L)
  public static SubLObject some_time_interval_functor_p(final SubLObject obj)
  {
    return Equality.eql( obj, $const12$SomeTimeInIntervalFn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 2914L)
  public static SubLObject possibly_guid_string_p(final SubLObject obj)
  {
    return makeBoolean( obj.isString() && Sequences.length( obj ).numE( $int14$36 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 3016L)
  public static SubLObject new_some_time_in_interval_index(final SubLObject interval)
  {
    return ConsesLow.list( $const12$SomeTimeInIntervalFn, interval, Guids.guid_to_string( Guids.new_guid() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 3151L)
  public static SubLObject succeeding_cycl_date(final SubLObject date)
  {
    return date_utilities.date_after( date, time_parameter_utilities.get_duration_of_type( date_utilities.date_precision( date ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 3335L)
  public static SubLObject preceding_cycl_date(final SubLObject date)
  {
    return date_utilities.date_before( date, time_parameter_utilities.get_duration_of_type( date_utilities.date_precision( date ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 3516L)
  public static SubLObject date_interval_or_indexical_subsumesP(final SubLObject date1, final SubLObject date2)
  {
    return date_interval_subsumesP( date_utilities.possibly_bind_temporal_indexical_in_object( date1 ), date_utilities.possibly_bind_temporal_indexical_in_object( date2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 3725L)
  public static SubLObject date_interval_subsumesP(final SubLObject date1, final SubLObject date2)
  {
    if( date1.equal( date2 ) )
    {
      return T;
    }
    final SubLObject start1 = cycl_interval_initial_second_possibly_indeterminate_late( date1 );
    final SubLObject end1 = cycl_interval_final_second_possibly_indeterminate_early( date1 );
    final SubLObject start2 = cycl_interval_initial_second_possibly_indeterminate_early( date2 );
    final SubLObject end2 = cycl_interval_final_second_possibly_indeterminate_late( date2 );
    return makeBoolean( NIL != date_utilities.dateLE( start1, start2 ) && NIL != date_utilities.dateLE( end2, end1 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 4260L)
  public static SubLObject date_intervals_or_indexicals_intersectP(final SubLObject date1, final SubLObject date2)
  {
    return date_intervals_intersectP( date_utilities.possibly_bind_temporal_indexical_in_object( date1 ), date_utilities.possibly_bind_temporal_indexical_in_object( date2 ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 4475L)
  public static SubLObject date_intervals_intersectP(final SubLObject date1, final SubLObject date2, SubLObject or_touchP, SubLObject weak_intersectP)
  {
    if( or_touchP == UNPROVIDED )
    {
      or_touchP = NIL;
    }
    if( weak_intersectP == UNPROVIDED )
    {
      weak_intersectP = NIL;
    }
    if( date1.equal( date2 ) )
    {
      return T;
    }
    final SubLObject indeterminate1P = indeterminate_date_interval_p( date1 );
    final SubLObject indeterminate2P = indeterminate_date_interval_p( date2 );
    if( NIL != indeterminate1P && NIL != indeterminate2P )
    {
      final SubLObject start1_early = cycl_interval_initial_second_indeterminate_early( date1 );
      final SubLObject start1_late = cycl_interval_initial_second_indeterminate_late( date1 );
      final SubLObject end1_early = cycl_interval_final_second_indeterminate_early( date1 );
      final SubLObject end1_late = cycl_interval_final_second_indeterminate_late( date1 );
      final SubLObject start2_early = cycl_interval_initial_second_indeterminate_early( date2 );
      final SubLObject start2_late = cycl_interval_initial_second_indeterminate_late( date2 );
      final SubLObject end2_early = cycl_interval_final_second_indeterminate_early( date2 );
      final SubLObject end2_late = cycl_interval_final_second_indeterminate_late( date2 );
      return makeBoolean( NIL != date_intervals_intersectP_int( start1_early, end1_early, start2_early, end2_early, or_touchP ) && NIL != date_intervals_intersectP_int( start1_early, end1_early, start2_early, end2_late,
          or_touchP ) && ( NIL != weak_intersectP || NIL != date_intervals_intersectP_int( start1_early, end1_early, start2_late, end2_early, or_touchP ) ) && ( NIL != weak_intersectP
              || NIL != date_intervals_intersectP_int( start1_early, end1_early, start2_late, end2_late, or_touchP ) ) && NIL != date_intervals_intersectP_int( start1_early, end1_late, start2_early, end2_early,
                  or_touchP ) && NIL != date_intervals_intersectP_int( start1_early, end1_late, start2_early, end2_late, or_touchP ) && NIL != date_intervals_intersectP_int( start1_early, end1_late, start2_late,
                      end2_early, or_touchP ) && NIL != date_intervals_intersectP_int( start1_early, end1_late, start2_late, end2_late, or_touchP ) && ( NIL != weak_intersectP || NIL != date_intervals_intersectP_int(
                          start1_late, end1_early, start2_early, end2_early, or_touchP ) ) && NIL != date_intervals_intersectP_int( start1_late, end1_early, start2_early, end2_late, or_touchP )
          && ( NIL != weak_intersectP || NIL != date_intervals_intersectP_int( start1_late, end1_early, start2_late, end2_early, or_touchP ) ) && ( NIL != weak_intersectP || NIL != date_intervals_intersectP_int(
              start1_late, end1_early, start2_late, end2_late, or_touchP ) ) && ( NIL != weak_intersectP || NIL != date_intervals_intersectP_int( start1_late, end1_late, start2_early, end2_early, or_touchP ) )
          && NIL != date_intervals_intersectP_int( start1_late, end1_late, start2_early, end2_late, or_touchP ) && ( NIL != weak_intersectP || NIL != date_intervals_intersectP_int( start1_late, end1_late, start2_late,
              end2_early, or_touchP ) ) && NIL != date_intervals_intersectP_int( start1_late, end1_late, start2_late, end2_late, or_touchP ) );
    }
    if( NIL != indeterminate1P )
    {
      final SubLObject start1_early = cycl_interval_initial_second_indeterminate_early( date1 );
      final SubLObject start1_late = cycl_interval_initial_second_indeterminate_late( date1 );
      final SubLObject end1_early = cycl_interval_final_second_indeterminate_early( date1 );
      final SubLObject end1_late = cycl_interval_final_second_indeterminate_late( date1 );
      final SubLObject start2 = cycl_interval_initial_second( date2 );
      final SubLObject end2 = cycl_interval_final_second( date2 );
      return makeBoolean( NIL != date_intervals_intersectP_int( start1_early, end1_early, start2, end2, or_touchP ) && NIL != date_intervals_intersectP_int( start1_early, end1_late, start2, end2, or_touchP )
          && NIL != date_intervals_intersectP_int( start1_late, end1_early, start2, end2, or_touchP ) && NIL != date_intervals_intersectP_int( start1_late, end1_late, start2, end2, or_touchP ) );
    }
    if( NIL != indeterminate2P )
    {
      final SubLObject start3 = cycl_interval_initial_second( date1 );
      final SubLObject end3 = cycl_interval_final_second( date1 );
      final SubLObject start2_early2 = cycl_interval_initial_second_indeterminate_early( date2 );
      final SubLObject start2_late2 = cycl_interval_initial_second_indeterminate_late( date2 );
      final SubLObject end2_early2 = cycl_interval_final_second_indeterminate_early( date2 );
      final SubLObject end2_late2 = cycl_interval_final_second_indeterminate_late( date2 );
      return makeBoolean( NIL != date_intervals_intersectP_int( start3, end3, start2_early2, end2_early2, or_touchP ) && NIL != date_intervals_intersectP_int( start3, end3, start2_early2, end2_late2, or_touchP )
          && NIL != date_intervals_intersectP_int( start3, end3, start2_late2, end2_early2, or_touchP ) && NIL != date_intervals_intersectP_int( start3, end3, start2_late2, end2_late2, or_touchP ) );
    }
    final SubLObject start3 = cycl_interval_initial_second( date1 );
    final SubLObject end3 = cycl_interval_final_second( date1 );
    final SubLObject start4 = cycl_interval_initial_second( date2 );
    final SubLObject end4 = cycl_interval_final_second( date2 );
    return date_intervals_intersectP_int( start3, end3, start4, end4, or_touchP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 9099L)
  public static SubLObject date_intervals_intersectP_int(final SubLObject start1, final SubLObject end1, final SubLObject start2, final SubLObject end2, SubLObject or_touchP)
  {
    if( or_touchP == UNPROVIDED )
    {
      or_touchP = NIL;
    }
    return ( NIL != or_touchP ) ? ( ( NIL != date_utilities.dateLE( start1, start2 ) ) ? dateLE_or_adjacent( start2, end1 ) : dateLE_or_adjacent( start1, end2 ) )
        : ( ( NIL != date_utilities.dateLE( start1, start2 ) ) ? date_utilities.dateLE( start2, end1 ) : date_utilities.dateLE( start1, end2 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 9405L)
  public static SubLObject dateLE_or_adjacent(final SubLObject date1, final SubLObject date2)
  {
    if( NIL == date_utilities.date_p( date2 ) )
    {
      return date_utilities.dateLE( date1, date2 );
    }
    return date_utilities.dateLE( date1, date_utilities.universal_time_to_cycl_date( Numbers.add( ONE_INTEGER, date_utilities.cycl_date_to_universal_time( date2 ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 9629L)
  public static SubLObject cycl_interval_initial_second_possibly_indeterminate_early(final SubLObject date)
  {
    return ( NIL != indeterminate_date_interval_p( date ) ) ? cycl_interval_initial_second_indeterminate_early( date ) : cycl_interval_initial_second( date );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 9867L)
  public static SubLObject cycl_interval_initial_second_possibly_indeterminate_late(final SubLObject date)
  {
    return ( NIL != indeterminate_date_interval_p( date ) ) ? cycl_interval_initial_second_indeterminate_late( date ) : cycl_interval_initial_second( date );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 10103L)
  public static SubLObject cycl_interval_final_second_possibly_indeterminate_early(final SubLObject date)
  {
    return ( NIL != indeterminate_date_interval_p( date ) ) ? cycl_interval_final_second_indeterminate_early( date ) : cycl_interval_final_second( date );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 10335L)
  public static SubLObject cycl_interval_final_second_possibly_indeterminate_late(final SubLObject date)
  {
    return ( NIL != indeterminate_date_interval_p( date ) ) ? cycl_interval_final_second_indeterminate_late( date ) : cycl_interval_final_second( date );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 10565L)
  public static SubLObject cycl_interval_initial_second_internal(final SubLObject date)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == hlmt_relevance.$disable_temporal_indexical_supportP$.getDynamicValue( thread ) && NIL != date_utilities.temporal_indexical_p( date ) )
    {
      return cycl_interval_initial_second( removal_modules_indexical_referent.temporal_indexical_expand( date ) );
    }
    if( NIL != date_utilities.always_time_intervalP( date ) )
    {
      return date_utilities.$beginning_of_time$.getGlobalValue();
    }
    if( NIL != date_utilities.beginning_of_timeP( date ) )
    {
      return date_utilities.$beginning_of_time$.getGlobalValue();
    }
    if( NIL != some_time_interval_p( date ) )
    {
      return date;
    }
    if( NIL != proper_date_interval_p( date ) )
    {
      final SubLObject pcase_var = cycl_utilities.el_formula_operator( date );
      if( pcase_var.eql( $const0$TimeIntervalInclusiveFn ) || pcase_var.eql( $const6$IntervalStartedByFn_Inclusive ) || pcase_var.eql( $const2$StartFn ) )
      {
        return cycl_interval_initial_second( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) );
      }
      if( pcase_var.eql( $const1$TimeIntervalBetweenFn ) || pcase_var.eql( $const4$IntervalStartedByFn ) )
      {
        final SubLObject start_interval = cycl_utilities.el_formula_arg1( date, UNPROVIDED );
        final SubLObject end_of_start = cycl_interval_final_second( start_interval );
        return ( NIL != date_utilities.date_p( end_of_start ) ) ? succeeding_cycl_date( end_of_start ) : NIL;
      }
      if( pcase_var.eql( $const3$EndFn ) )
      {
        return cycl_interval_final_second( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) );
      }
      if( pcase_var.eql( $const5$IntervalEndedByFn ) || pcase_var.eql( $const7$IntervalEndedByFn_Inclusive ) )
      {
        return date_utilities.$beginning_of_time$.getGlobalValue();
      }
      if( pcase_var.eql( $const10$IntervalAfterFn ) )
      {
        final SubLObject start_interval = cycl_utilities.el_formula_arg1( date, UNPROVIDED );
        final SubLObject end_of_start = cycl_interval_final_second( start_interval );
        return ( NIL != date_utilities.date_p( end_of_start ) ) ? succeeding_cycl_date( end_of_start ) : NIL;
      }
      if( pcase_var.eql( $const11$IntervalBeforeFn ) )
      {
        final SubLObject end_interval = cycl_utilities.el_formula_arg1( date, UNPROVIDED );
        final SubLObject adjustment = cycl_utilities.el_formula_arg2( date, UNPROVIDED );
        final SubLObject start_of_end = cycl_interval_initial_second( end_interval );
        final SubLObject adjusted_start = ( NIL != date_utilities.date_p( start_of_end ) ) ? date_utilities.date_before( start_of_end, adjustment ) : NIL;
        return cycl_interval_initial_second( adjusted_start );
      }
      return NIL;
    }
    else
    {
      if( NIL != date_utilities.date_p( date ) )
      {
        return date_utilities.cycl_date_initial_second( date );
      }
      if( NIL != date_utilities.temporal_indexical_p( date ) )
      {
        return date;
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 10565L)
  public static SubLObject cycl_interval_initial_second(final SubLObject date)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return cycl_interval_initial_second_internal( date );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym15$CYCL_INTERVAL_INITIAL_SECOND, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym15$CYCL_INTERVAL_INITIAL_SECOND, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym15$CYCL_INTERVAL_INITIAL_SECOND, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, date, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( cycl_interval_initial_second_internal( date ) ) );
      memoization_state.caching_state_put( caching_state, date, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 12480L)
  public static SubLObject cycl_interval_final_second(final SubLObject date)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == hlmt_relevance.$disable_temporal_indexical_supportP$.getDynamicValue( thread ) && NIL != date_utilities.temporal_indexical_p( date ) )
    {
      return cycl_interval_final_second( removal_modules_indexical_referent.temporal_indexical_expand( date ) );
    }
    if( NIL != date_utilities.always_time_intervalP( date ) )
    {
      return date_utilities.$end_of_time$.getGlobalValue();
    }
    if( NIL != date_utilities.end_of_timeP( date ) )
    {
      return date_utilities.$end_of_time$.getGlobalValue();
    }
    if( NIL != some_time_interval_p( date ) )
    {
      return date;
    }
    if( NIL != proper_date_interval_p( date ) )
    {
      final SubLObject pcase_var = cycl_utilities.el_formula_operator( date );
      if( pcase_var.eql( $const7$IntervalEndedByFn_Inclusive ) || pcase_var.eql( $const3$EndFn ) )
      {
        return cycl_interval_final_second( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) );
      }
      if( pcase_var.eql( $const0$TimeIntervalInclusiveFn ) )
      {
        return cycl_interval_final_second( cycl_utilities.el_formula_arg2( date, UNPROVIDED ) );
      }
      if( pcase_var.eql( $const1$TimeIntervalBetweenFn ) )
      {
        final SubLObject end_interval = cycl_utilities.el_formula_arg2( date, UNPROVIDED );
        final SubLObject start_of_end = cycl_interval_initial_second( end_interval );
        return ( NIL != date_utilities.date_p( start_of_end ) ) ? preceding_cycl_date( start_of_end ) : NIL;
      }
      if( pcase_var.eql( $const2$StartFn ) )
      {
        return cycl_interval_initial_second( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) );
      }
      if( pcase_var.eql( $const4$IntervalStartedByFn ) || pcase_var.eql( $const6$IntervalStartedByFn_Inclusive ) )
      {
        return date_utilities.$end_of_time$.getGlobalValue();
      }
      if( pcase_var.eql( $const5$IntervalEndedByFn ) )
      {
        final SubLObject end_interval = cycl_utilities.el_formula_arg1( date, UNPROVIDED );
        final SubLObject start_of_end = cycl_interval_initial_second( end_interval );
        return ( NIL != date_utilities.date_p( start_of_end ) ) ? preceding_cycl_date( start_of_end ) : NIL;
      }
      if( pcase_var.eql( $const10$IntervalAfterFn ) )
      {
        final SubLObject start_interval = cycl_utilities.el_formula_arg1( date, UNPROVIDED );
        final SubLObject adjustment = cycl_utilities.el_formula_arg2( date, UNPROVIDED );
        final SubLObject end_of_start = cycl_interval_final_second( start_interval );
        final SubLObject adjusted_end = ( NIL != date_utilities.date_p( end_of_start ) ) ? date_utilities.date_after( end_of_start, adjustment ) : NIL;
        return cycl_interval_final_second( adjusted_end );
      }
      if( pcase_var.eql( $const11$IntervalBeforeFn ) )
      {
        final SubLObject end_interval = cycl_utilities.el_formula_arg1( date, UNPROVIDED );
        final SubLObject start_of_end = cycl_interval_initial_second( end_interval );
        return ( NIL != date_utilities.date_p( start_of_end ) ) ? preceding_cycl_date( start_of_end ) : NIL;
      }
      return NIL;
    }
    else
    {
      if( NIL != date_utilities.date_p( date ) )
      {
        return date_utilities.cycl_date_final_second( date );
      }
      if( NIL != date_utilities.temporal_indexical_p( date ) )
      {
        return date;
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 14586L)
  public static SubLObject cycl_interval_initial_second_indeterminate_early(final SubLObject date)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == hlmt_relevance.$disable_temporal_indexical_supportP$.getDynamicValue( thread ) && NIL != date_utilities.temporal_indexical_p( date ) )
    {
      return cycl_interval_initial_second_indeterminate_early( removal_modules_indexical_referent.temporal_indexical_expand( date ) );
    }
    final SubLObject pcase_var = cycl_utilities.el_formula_operator( date );
    if( pcase_var.eql( $const12$SomeTimeInIntervalFn ) )
    {
      return cycl_interval_initial_second_possibly_indeterminate_early( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) );
    }
    if( pcase_var.eql( $const0$TimeIntervalInclusiveFn ) || pcase_var.eql( $const6$IntervalStartedByFn_Inclusive ) )
    {
      return cycl_interval_initial_second_possibly_indeterminate_early( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) );
    }
    if( pcase_var.eql( $const1$TimeIntervalBetweenFn ) )
    {
      return succeeding_cycl_date( cycl_interval_final_second_possibly_indeterminate_early( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) ) );
    }
    if( pcase_var.eql( $const4$IntervalStartedByFn ) )
    {
      return succeeding_cycl_date( cycl_interval_final_second_possibly_indeterminate_early( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) ) );
    }
    if( pcase_var.eql( $const5$IntervalEndedByFn ) || pcase_var.eql( $const7$IntervalEndedByFn_Inclusive ) )
    {
      return date_utilities.$beginning_of_time$.getGlobalValue();
    }
    if( pcase_var.eql( $const2$StartFn ) )
    {
      return cycl_interval_initial_second_possibly_indeterminate_early( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) );
    }
    if( pcase_var.eql( $const3$EndFn ) )
    {
      return cycl_interval_final_second_possibly_indeterminate_early( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) );
    }
    if( pcase_var.eql( $const11$IntervalBeforeFn ) )
    {
      return cycl_interval_initial_second_possibly_indeterminate_early( date_utilities.date_before( cycl_interval_initial_second( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) ), cycl_utilities.el_formula_arg2(
          date, UNPROVIDED ) ) );
    }
    if( pcase_var.eql( $const10$IntervalAfterFn ) )
    {
      return succeeding_cycl_date( cycl_interval_final_second_possibly_indeterminate_early( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 16149L)
  public static SubLObject cycl_interval_initial_second_indeterminate_late(final SubLObject date)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == hlmt_relevance.$disable_temporal_indexical_supportP$.getDynamicValue( thread ) && NIL != date_utilities.temporal_indexical_p( date ) )
    {
      return cycl_interval_initial_second_indeterminate_late( removal_modules_indexical_referent.temporal_indexical_expand( date ) );
    }
    final SubLObject pcase_var = cycl_utilities.el_formula_operator( date );
    if( pcase_var.eql( $const12$SomeTimeInIntervalFn ) )
    {
      return cycl_interval_final_second_possibly_indeterminate_late( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) );
    }
    if( pcase_var.eql( $const6$IntervalStartedByFn_Inclusive ) )
    {
      return cycl_interval_initial_second_possibly_indeterminate_late( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) );
    }
    if( pcase_var.eql( $const0$TimeIntervalInclusiveFn ) )
    {
      final SubLObject latest_possible_start_from_start = cycl_interval_initial_second_possibly_indeterminate_late( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) );
      final SubLObject latest_possible_start_from_end = ( NIL != indeterminate_date_interval_p( cycl_utilities.el_formula_arg2( date, UNPROVIDED ) ) ) ? NIL
          : cycl_interval_initial_second_possibly_indeterminate_early( cycl_utilities.el_formula_arg2( date, UNPROVIDED ) );
      if( NIL != date_utilities.date_p( latest_possible_start_from_end ) && NIL != date_utilities.dateLE( latest_possible_start_from_end, latest_possible_start_from_start ) )
      {
        return latest_possible_start_from_end;
      }
      return latest_possible_start_from_start;
    }
    else
    {
      if( pcase_var.eql( $const1$TimeIntervalBetweenFn ) )
      {
        return succeeding_cycl_date( cycl_interval_final_second_possibly_indeterminate_late( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) ) );
      }
      if( pcase_var.eql( $const4$IntervalStartedByFn ) )
      {
        return succeeding_cycl_date( cycl_interval_final_second_possibly_indeterminate_late( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) ) );
      }
      if( pcase_var.eql( $const5$IntervalEndedByFn ) || pcase_var.eql( $const7$IntervalEndedByFn_Inclusive ) )
      {
        return date_utilities.$beginning_of_time$.getGlobalValue();
      }
      if( pcase_var.eql( $const2$StartFn ) )
      {
        return cycl_interval_initial_second_possibly_indeterminate_late( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) );
      }
      if( pcase_var.eql( $const3$EndFn ) )
      {
        return cycl_interval_final_second_possibly_indeterminate_late( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) );
      }
      if( pcase_var.eql( $const11$IntervalBeforeFn ) )
      {
        return cycl_interval_initial_second_possibly_indeterminate_late( date_utilities.date_before( cycl_interval_initial_second( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) ), cycl_utilities.el_formula_arg2(
            date, UNPROVIDED ) ) );
      }
      if( pcase_var.eql( $const10$IntervalAfterFn ) )
      {
        return succeeding_cycl_date( cycl_interval_final_second_possibly_indeterminate_late( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) ) );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 18323L)
  public static SubLObject cycl_interval_final_second_indeterminate_early(final SubLObject date)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == hlmt_relevance.$disable_temporal_indexical_supportP$.getDynamicValue( thread ) && NIL != date_utilities.temporal_indexical_p( date ) )
    {
      return cycl_interval_final_second_indeterminate_early( removal_modules_indexical_referent.temporal_indexical_expand( date ) );
    }
    final SubLObject pcase_var = cycl_utilities.el_formula_operator( date );
    if( pcase_var.eql( $const12$SomeTimeInIntervalFn ) )
    {
      return cycl_interval_initial_second_possibly_indeterminate_early( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) );
    }
    if( pcase_var.eql( $const0$TimeIntervalInclusiveFn ) )
    {
      final SubLObject earliest_possible_end_from_start = ( NIL != indeterminate_date_interval_p( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) ) ) ? NIL
          : cycl_interval_final_second_possibly_indeterminate_late( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) );
      final SubLObject earliest_possible_end_from_end = cycl_interval_final_second_possibly_indeterminate_early( cycl_utilities.el_formula_arg2( date, UNPROVIDED ) );
      if( NIL != date_utilities.date_p( earliest_possible_end_from_start ) && NIL != date_utilities.dateGE( earliest_possible_end_from_start, earliest_possible_end_from_end ) )
      {
        return earliest_possible_end_from_start;
      }
      return earliest_possible_end_from_end;
    }
    else
    {
      if( pcase_var.eql( $const1$TimeIntervalBetweenFn ) )
      {
        return preceding_cycl_date( cycl_interval_initial_second_possibly_indeterminate_early( cycl_utilities.el_formula_arg2( date, UNPROVIDED ) ) );
      }
      if( pcase_var.eql( $const4$IntervalStartedByFn ) || pcase_var.eql( $const6$IntervalStartedByFn_Inclusive ) )
      {
        return date_utilities.$end_of_time$.getGlobalValue();
      }
      if( pcase_var.eql( $const5$IntervalEndedByFn ) )
      {
        return preceding_cycl_date( cycl_interval_initial_second_possibly_indeterminate_early( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) ) );
      }
      if( pcase_var.eql( $const7$IntervalEndedByFn_Inclusive ) )
      {
        return cycl_interval_final_second_possibly_indeterminate_early( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) );
      }
      if( pcase_var.eql( $const2$StartFn ) )
      {
        return cycl_interval_initial_second_possibly_indeterminate_early( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) );
      }
      if( pcase_var.eql( $const3$EndFn ) )
      {
        return cycl_interval_final_second_possibly_indeterminate_early( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) );
      }
      if( pcase_var.eql( $const11$IntervalBeforeFn ) )
      {
        return preceding_cycl_date( cycl_interval_initial_second_possibly_indeterminate_early( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) ) );
      }
      if( pcase_var.eql( $const10$IntervalAfterFn ) )
      {
        return cycl_interval_final_second_possibly_indeterminate_early( date_utilities.date_after( cycl_interval_final_second_possibly_indeterminate_early( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) ),
            cycl_utilities.el_formula_arg2( date, UNPROVIDED ) ) );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 20522L)
  public static SubLObject cycl_interval_final_second_indeterminate_late(final SubLObject date)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == hlmt_relevance.$disable_temporal_indexical_supportP$.getDynamicValue( thread ) && NIL != date_utilities.temporal_indexical_p( date ) )
    {
      return cycl_interval_final_second_indeterminate_late( removal_modules_indexical_referent.temporal_indexical_expand( date ) );
    }
    final SubLObject pcase_var = cycl_utilities.el_formula_operator( date );
    if( pcase_var.eql( $const12$SomeTimeInIntervalFn ) )
    {
      return cycl_interval_final_second_possibly_indeterminate_late( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) );
    }
    if( pcase_var.eql( $const0$TimeIntervalInclusiveFn ) )
    {
      return cycl_interval_final_second_possibly_indeterminate_late( cycl_utilities.el_formula_arg2( date, UNPROVIDED ) );
    }
    if( pcase_var.eql( $const1$TimeIntervalBetweenFn ) )
    {
      return preceding_cycl_date( cycl_interval_initial_second_possibly_indeterminate_late( cycl_utilities.el_formula_arg2( date, UNPROVIDED ) ) );
    }
    if( pcase_var.eql( $const4$IntervalStartedByFn ) || pcase_var.eql( $const6$IntervalStartedByFn_Inclusive ) )
    {
      return date_utilities.$end_of_time$.getGlobalValue();
    }
    if( pcase_var.eql( $const5$IntervalEndedByFn ) )
    {
      return preceding_cycl_date( cycl_interval_initial_second_possibly_indeterminate_late( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) ) );
    }
    if( pcase_var.eql( $const7$IntervalEndedByFn_Inclusive ) )
    {
      return cycl_interval_final_second_possibly_indeterminate_late( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) );
    }
    if( pcase_var.eql( $const2$StartFn ) )
    {
      return cycl_interval_initial_second_possibly_indeterminate_late( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) );
    }
    if( pcase_var.eql( $const3$EndFn ) )
    {
      return cycl_interval_final_second_possibly_indeterminate_late( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) );
    }
    if( pcase_var.eql( $const11$IntervalBeforeFn ) )
    {
      return preceding_cycl_date( cycl_interval_initial_second_possibly_indeterminate_late( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) ) );
    }
    if( pcase_var.eql( $const10$IntervalAfterFn ) )
    {
      return cycl_interval_final_second_possibly_indeterminate_late( date_utilities.date_after( cycl_interval_final_second_possibly_indeterminate_late( cycl_utilities.el_formula_arg1( date, UNPROVIDED ) ), cycl_utilities
          .el_formula_arg2( date, UNPROVIDED ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 22183L)
  public static SubLObject cycl_time_index_start(SubLObject index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != nart_handles.nart_p( index ) )
    {
      index = narts_high.nart_el_formula( index );
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = hlmt_relevance.$disable_temporal_indexical_supportP$.currentBinding( thread );
    try
    {
      hlmt_relevance.$disable_temporal_indexical_supportP$.bind( T, thread );
      result = cycl_interval_initial_second( index );
    }
    finally
    {
      hlmt_relevance.$disable_temporal_indexical_supportP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 22528L)
  public static SubLObject cycl_time_index_end(SubLObject index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != nart_handles.nart_p( index ) )
    {
      index = narts_high.nart_el_formula( index );
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = hlmt_relevance.$disable_temporal_indexical_supportP$.currentBinding( thread );
    try
    {
      hlmt_relevance.$disable_temporal_indexical_supportP$.bind( T, thread );
      result = cycl_interval_final_second( index );
    }
    finally
    {
      hlmt_relevance.$disable_temporal_indexical_supportP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 22867L)
  public static SubLObject canonicalize_time_interval(final SubLObject interval)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == date_interval_p( interval ) )
    {
      Errors.error( $str16$_a_is_not_a_proper_time_interval_, interval );
    }
    return canonicalize_time_interval_int( interval );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 23099L)
  public static SubLObject recanonicalize_time_interval(final SubLObject interval, SubLObject precision, SubLObject force_inclusivityP)
  {
    if( precision == UNPROVIDED )
    {
      precision = NIL;
    }
    if( force_inclusivityP == UNPROVIDED )
    {
      force_inclusivityP = NIL;
    }
    final SubLObject earliest_start = cycl_interval_initial_second_possibly_indeterminate_early( interval );
    final SubLObject latest_start = cycl_interval_initial_second_possibly_indeterminate_late( interval );
    final SubLObject latest_end = cycl_interval_final_second_possibly_indeterminate_late( interval );
    final SubLObject earliest_end = cycl_interval_final_second_possibly_indeterminate_early( interval );
    return canonicalize_possibly_indeterminate_time_interval_fn( earliest_start, latest_start, earliest_end, latest_end, precision, force_inclusivityP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 23703L)
  public static SubLObject canonicalize_possibly_indeterminate_time_interval_fn(SubLObject earliest_possible_start, SubLObject latest_possible_start, SubLObject earliest_possible_end, SubLObject latest_possible_end,
      SubLObject precision, SubLObject force_inclusivityP)
  {
    if( precision == UNPROVIDED )
    {
      precision = NIL;
    }
    if( force_inclusivityP == UNPROVIDED )
    {
      force_inclusivityP = NIL;
    }
    if( NIL != precision )
    {
      final SubLObject force_inclusivity_startP = makeBoolean( NIL != force_inclusivityP && !earliest_possible_start.equal( latest_possible_start ) );
      if( NIL != date_utilities.date_p( earliest_possible_start ) )
      {
        earliest_possible_start = date_utilities.date_to_precision( earliest_possible_start, precision, ( NIL != force_inclusivity_startP ) ? $kw17$END : NIL );
      }
      if( NIL != date_utilities.date_p( latest_possible_start ) )
      {
        latest_possible_start = date_utilities.date_to_precision( latest_possible_start, precision, ( NIL != force_inclusivity_startP ) ? $kw18$START : NIL );
      }
      final SubLObject force_inclusivity_endP = makeBoolean( NIL != force_inclusivityP && !earliest_possible_end.equal( latest_possible_end ) );
      if( NIL != date_utilities.date_p( earliest_possible_end ) )
      {
        earliest_possible_end = date_utilities.date_to_precision( earliest_possible_end, precision, ( NIL != force_inclusivity_endP ) ? $kw17$END : NIL );
      }
      if( NIL != date_utilities.date_p( latest_possible_end ) )
      {
        latest_possible_end = date_utilities.date_to_precision( latest_possible_end, precision, ( NIL != force_inclusivity_endP ) ? $kw18$START : NIL );
      }
    }
    if( NIL == date_utilities.dateE( earliest_possible_start, latest_possible_start ) && NIL != date_utilities.dateE( earliest_possible_start, earliest_possible_end ) && NIL != date_utilities.dateE(
        latest_possible_start, latest_possible_end ) )
    {
      return new_some_time_in_interval_index( canonicalize_time_interval_inclusive_fn( earliest_possible_start, latest_possible_end ) );
    }
    if( NIL != date_utilities.end_of_timeP( latest_possible_start ) && NIL != date_utilities.date_p( latest_possible_end ) )
    {
      return canonicalize_possibly_indeterminate_time_interval_fn( earliest_possible_start, latest_possible_end, earliest_possible_end, latest_possible_end, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != date_utilities.beginning_of_timeP( earliest_possible_end ) && NIL != date_utilities.date_p( earliest_possible_start ) )
    {
      return canonicalize_possibly_indeterminate_time_interval_fn( earliest_possible_start, latest_possible_start, earliest_possible_start, latest_possible_end, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject interval_start = ( NIL != date_utilities.dateE( earliest_possible_start, latest_possible_start ) ) ? earliest_possible_start
        : new_some_time_in_interval_index( canonicalize_time_interval_inclusive_fn( earliest_possible_start, latest_possible_start ) );
    final SubLObject interval_end = ( NIL != date_utilities.dateE( earliest_possible_end, latest_possible_end ) ) ? earliest_possible_end
        : new_some_time_in_interval_index( canonicalize_time_interval_inclusive_fn( earliest_possible_end, latest_possible_end ) );
    return canonicalize_time_interval_inclusive_fn( interval_start, interval_end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 26397L)
  public static SubLObject interval_equal_ignoring_guids(final SubLObject interval_1, final SubLObject interval_2)
  {
    return Equality.equal( list_utilities.tree_transform_if( interval_1, $sym19$GUID_STRING_P, $sym20$NULL, UNPROVIDED ), list_utilities.tree_transform_if( interval_2, $sym19$GUID_STRING_P, $sym20$NULL, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 26596L)
  public static SubLObject canonicalize_time_interval_int(final SubLObject interval)
  {
    if( NIL != date_utilities.date_p( interval ) || NIL != date_utilities.beginning_of_timeP( interval ) || NIL != date_utilities.end_of_timeP( interval ) || NIL != date_utilities.always_time_intervalP( interval )
        || NIL != date_utilities.empty_time_intervalP( interval ) || NIL != date_utilities.temporal_indexical_p( interval ) )
    {
      return interval;
    }
    final SubLObject pcase_var;
    final SubLObject functor = pcase_var = cycl_utilities.nat_functor( interval );
    if( pcase_var.eql( $const0$TimeIntervalInclusiveFn ) )
    {
      SubLObject current;
      final SubLObject datum = current = cycl_utilities.nat_args( interval, UNPROVIDED );
      SubLObject start = NIL;
      SubLObject end = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
      start = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
      end = current.first();
      current = current.rest();
      if( NIL == current )
      {
        start = canonicalize_time_interval_int( start );
        end = canonicalize_time_interval_int( end );
        return canonicalize_time_interval_inclusive_fn( start, end );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list21 );
    }
    else if( pcase_var.eql( $const1$TimeIntervalBetweenFn ) )
    {
      SubLObject current;
      final SubLObject datum = current = cycl_utilities.nat_args( interval, UNPROVIDED );
      SubLObject start = NIL;
      SubLObject end = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
      start = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
      end = current.first();
      current = current.rest();
      if( NIL == current )
      {
        start = canonicalize_time_interval_int( start );
        end = canonicalize_time_interval_int( end );
        return canonicalize_time_interval_between_fn( start, end );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list21 );
    }
    else if( pcase_var.eql( $const10$IntervalAfterFn ) || pcase_var.eql( $const9$DateAfterFn ) )
    {
      SubLObject current;
      final SubLObject datum = current = cycl_utilities.nat_args( interval, UNPROVIDED );
      SubLObject start = NIL;
      SubLObject duration = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
      start = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list22 );
      duration = current.first();
      current = current.rest();
      if( NIL == current )
      {
        start = canonicalize_time_interval_int( start );
        return canonicalize_interval_or_date_after_fn( functor, start, duration );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list22 );
    }
    else if( pcase_var.eql( $const11$IntervalBeforeFn ) || pcase_var.eql( $const8$DateBeforeFn ) )
    {
      SubLObject current;
      final SubLObject datum = current = cycl_utilities.nat_args( interval, UNPROVIDED );
      SubLObject end2 = NIL;
      SubLObject duration = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
      end2 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
      duration = current.first();
      current = current.rest();
      if( NIL == current )
      {
        end2 = canonicalize_time_interval_int( end2 );
        return canonicalize_interval_or_date_before_fn( functor, end2, duration );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
    }
    else
    {
      if( pcase_var.eql( $const4$IntervalStartedByFn ) )
      {
        final SubLObject start2 = canonicalize_time_interval_int( cycl_utilities.nat_arg1( interval, UNPROVIDED ) );
        return canonicalize_interval_started_by_fn( start2 );
      }
      if( pcase_var.eql( $const6$IntervalStartedByFn_Inclusive ) )
      {
        final SubLObject start2 = canonicalize_time_interval_int( cycl_utilities.nat_arg1( interval, UNPROVIDED ) );
        return canonicalize_interval_started_by_fn_inclusive( start2 );
      }
      if( pcase_var.eql( $const5$IntervalEndedByFn ) )
      {
        final SubLObject end3 = canonicalize_time_interval_int( cycl_utilities.nat_arg1( interval, UNPROVIDED ) );
        return canonicalize_interval_ended_by_fn( end3 );
      }
      if( pcase_var.eql( $const7$IntervalEndedByFn_Inclusive ) )
      {
        final SubLObject end3 = canonicalize_time_interval_int( cycl_utilities.nat_arg1( interval, UNPROVIDED ) );
        return canonicalize_interval_ended_by_fn_inclusive( end3 );
      }
      if( pcase_var.eql( $const3$EndFn ) )
      {
        final SubLObject super_interval = canonicalize_time_interval_int( cycl_utilities.nat_arg1( interval, UNPROVIDED ) );
        return canonicalize_end_fn( super_interval );
      }
      if( pcase_var.eql( $const2$StartFn ) )
      {
        final SubLObject super_interval = canonicalize_time_interval_int( cycl_utilities.nat_arg1( interval, UNPROVIDED ) );
        return canonicalize_start_fn( super_interval );
      }
      if( pcase_var.eql( $const12$SomeTimeInIntervalFn ) )
      {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.nat_args( interval, UNPROVIDED );
        SubLObject super_interval2 = NIL;
        SubLObject id = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
        super_interval2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list24 );
        id = current.first();
        current = current.rest();
        if( NIL == current )
        {
          super_interval2 = canonicalize_time_interval_int( super_interval2 );
          return canonicalize_some_time_in_interval_fn( super_interval2, id );
        }
        cdestructuring_bind.cdestructuring_bind_error( datum, $list24 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 29156L)
  public static SubLObject canonicalize_time_interval_inclusive_fn(final SubLObject start, final SubLObject end)
  {
    if( NIL != sbhl_time_modules.ends_after_ending_ofP( start, end, UNPROVIDED ) )
    {
      return el_utilities.make_binary_formula( $const0$TimeIntervalInclusiveFn, start, end );
    }
    if( NIL != sbhl_time_modules.starts_after_starting_ofP( start, end, UNPROVIDED ) )
    {
      return el_utilities.make_binary_formula( $const0$TimeIntervalInclusiveFn, start, end );
    }
    SubLObject new_start = reduce_date_wrt_start( start );
    SubLObject new_end = reduce_date_wrt_end( end );
    if( NIL != date_utilities.beginning_of_timeP( new_start ) && NIL != date_utilities.end_of_timeP( new_end ) )
    {
      return $const25$Always_TimeInterval;
    }
    if( NIL != date_utilities.beginning_of_timeP( new_start ) )
    {
      return canonicalize_interval_ended_by_fn_inclusive( end );
    }
    if( NIL != date_utilities.end_of_timeP( new_end ) )
    {
      return canonicalize_interval_started_by_fn_inclusive( start );
    }
    if( new_start.equal( new_end ) )
    {
      return new_start;
    }
    if( NIL != sbhl_time_modules.temporal_bounds_identicalP( start, end, UNPROVIDED ) && NIL != isa.isaP( start, $const26$ContinuousTimeInterval, UNPROVIDED, UNPROVIDED ) )
    {
      return start;
    }
    if( NIL != sbhl_time_modules.temporal_bounds_identicalP( start, end, UNPROVIDED ) && NIL != isa.isaP( end, $const26$ContinuousTimeInterval, UNPROVIDED, UNPROVIDED ) )
    {
      return end;
    }
    if( NIL != sbhl_time_modules.ends_after_ending_ofP( new_start, end, UNPROVIDED ) )
    {
      if( NIL != date_utilities.date_p( end ) )
      {
        new_start = reduce_date_wrt_start_limited( start, end );
      }
      else
      {
        new_start = start;
      }
    }
    else if( NIL != sbhl_time_modules.starts_after_starting_ofP( start, new_end, UNPROVIDED ) )
    {
      if( NIL != date_utilities.date_p( start ) )
      {
        new_end = reduce_date_wrt_end_limited( end, start );
      }
      else
      {
        new_end = end;
      }
    }
    if( new_start.equal( new_end ) )
    {
      return new_start;
    }
    return el_utilities.make_binary_formula( $const0$TimeIntervalInclusiveFn, new_start, new_end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 30773L)
  public static SubLObject canonicalize_time_interval_between_fn(final SubLObject start, final SubLObject end)
  {
    final SubLObject new_start = reduce_date_wrt_end( start );
    final SubLObject new_end = reduce_date_wrt_start( end );
    return el_utilities.make_binary_formula( $const1$TimeIntervalBetweenFn, new_start, new_end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 31008L)
  public static SubLObject canonicalize_interval_or_date_after_fn(final SubLObject functor, final SubLObject start, final SubLObject duration)
  {
    final SubLObject new_start = reduce_date_wrt_end( start );
    final SubLObject new_duration = reduce_duration( duration );
    return ( NIL != time_parameter_utilities.zero_duration_p( new_duration ) ) ? $const27$TheEmptyTimeInterval : ConsesLow.list( functor, new_start, new_duration );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 31418L)
  public static SubLObject canonicalize_interval_or_date_before_fn(final SubLObject functor, final SubLObject end, final SubLObject duration)
  {
    final SubLObject new_end = reduce_date_wrt_start( end );
    final SubLObject new_duration = reduce_duration( duration );
    return ( NIL != time_parameter_utilities.zero_duration_p( new_duration ) ) ? $const27$TheEmptyTimeInterval : ConsesLow.list( functor, new_end, new_duration );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 31825L)
  public static SubLObject canonicalize_interval_started_by_fn(final SubLObject start)
  {
    final SubLObject new_start = reduce_date_wrt_end( start );
    if( NIL != date_utilities.beginning_of_timeP( new_start ) )
    {
      return $const25$Always_TimeInterval;
    }
    if( NIL != date_utilities.end_of_timeP( new_start ) )
    {
      return $const27$TheEmptyTimeInterval;
    }
    return ConsesLow.list( $const4$IntervalStartedByFn, new_start );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 32149L)
  public static SubLObject canonicalize_interval_started_by_fn_inclusive(final SubLObject start)
  {
    final SubLObject new_start = reduce_date_wrt_start( start );
    if( NIL != date_utilities.beginning_of_timeP( new_start ) )
    {
      return $const25$Always_TimeInterval;
    }
    if( NIL != date_utilities.end_of_timeP( new_start ) )
    {
      return $const27$TheEmptyTimeInterval;
    }
    return ConsesLow.list( $const6$IntervalStartedByFn_Inclusive, new_start );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 32495L)
  public static SubLObject canonicalize_interval_ended_by_fn(final SubLObject end)
  {
    final SubLObject new_end = reduce_date_wrt_start( end );
    if( NIL != date_utilities.end_of_timeP( new_end ) )
    {
      return $const25$Always_TimeInterval;
    }
    if( NIL != date_utilities.beginning_of_timeP( new_end ) )
    {
      return $const27$TheEmptyTimeInterval;
    }
    return ConsesLow.list( $const5$IntervalEndedByFn, new_end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 32806L)
  public static SubLObject canonicalize_interval_ended_by_fn_inclusive(final SubLObject end)
  {
    final SubLObject new_end = reduce_date_wrt_end( end );
    if( NIL != date_utilities.end_of_timeP( new_end ) )
    {
      return $const25$Always_TimeInterval;
    }
    if( NIL != date_utilities.beginning_of_timeP( new_end ) )
    {
      return $const27$TheEmptyTimeInterval;
    }
    return ConsesLow.list( $const7$IntervalEndedByFn_Inclusive, new_end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 33135L)
  public static SubLObject canonicalize_end_fn(final SubLObject interval)
  {
    return cycl_interval_final_second( interval );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 33230L)
  public static SubLObject canonicalize_start_fn(final SubLObject interval)
  {
    return cycl_interval_initial_second( interval );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 33329L)
  public static SubLObject canonicalize_some_time_in_interval_fn(final SubLObject interval, final SubLObject id)
  {
    return ( NIL != date_utilities.empty_time_intervalP( interval ) ) ? interval : ConsesLow.list( $const12$SomeTimeInIntervalFn, interval, id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 33506L)
  public static SubLObject reduce_date_wrt_start_limited(final SubLObject date, final SubLObject end_date)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != sbhl_time_modules.ends_after_ending_ofP( date, end_date, UNPROVIDED ) )
    {
      return date;
    }
    thread.resetMultipleValues();
    final SubLObject type = date_utilities.explode_date( date );
    final SubLObject year = thread.secondMultipleValue();
    final SubLObject month = thread.thirdMultipleValue();
    final SubLObject day = thread.fourthMultipleValue();
    final SubLObject hour = thread.fifthMultipleValue();
    final SubLObject minute = thread.sixthMultipleValue();
    final SubLObject second = thread.seventhMultipleValue();
    thread.resetMultipleValues();
    final SubLObject date_values = ConsesLow.list( second, minute, hour, day, month, year );
    thread.resetMultipleValues();
    final SubLObject type_$1 = date_utilities.explode_date( end_date );
    final SubLObject year_$2 = thread.secondMultipleValue();
    final SubLObject month_$3 = thread.thirdMultipleValue();
    final SubLObject day_$4 = thread.fourthMultipleValue();
    final SubLObject hour_$5 = thread.fifthMultipleValue();
    final SubLObject minute_$6 = thread.sixthMultipleValue();
    final SubLObject second_$7 = thread.seventhMultipleValue();
    thread.resetMultipleValues();
    final SubLObject end_date_values = ConsesLow.list( second_$7, minute_$6, hour_$5, day_$4, month_$3, year_$2 );
    SubLObject doneP = NIL;
    if( NIL == doneP )
    {
      SubLObject end_var;
      SubLObject i;
      SubLObject date_value;
      SubLObject date_unit;
      for( end_var = SIX_INTEGER, i = NIL, i = ZERO_INTEGER; NIL == doneP && !i.numGE( end_var ); i = number_utilities.f_1X( i ) )
      {
        date_value = ConsesLow.nth( i, date_values );
        date_unit = ConsesLow.nth( i, date_utilities.$date_units_ordered$.getGlobalValue() );
        if( NIL != date_value )
        {
          if( NIL == date_utilities.starting_numerical_value_for_calendar_unit_p( date_value, date_unit ) )
          {
            doneP = T;
          }
          else if( Sequences.subseq( date_values, number_utilities.f_1X( i ), UNPROVIDED ).equal( Sequences.subseq( end_date_values, number_utilities.f_1X( i ), UNPROVIDED ) ) && NIL == date_utilities
              .ending_numerical_values_for_calendar_unit_p( list_utilities.first_n( number_utilities.f_1X( i ), end_date_values ), date_unit, ConsesLow.nth( FOUR_INTEGER, end_date_values ), ConsesLow.nth( FIVE_INTEGER,
                  end_date_values ) ) )
          {
            doneP = T;
          }
          else
          {
            ConsesLow.set_nth( i, date_values, NIL );
          }
        }
      }
    }
    return Functions.apply( $sym28$CONSTRUCT_REDUCED_CYCL_DATE, date_values );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 34987L)
  public static SubLObject reduce_date_wrt_start(final SubLObject interval)
  {
    if( NIL != date_utilities.date_p( interval ) )
    {
      return date_utilities.date_reduced_to_start( interval );
    }
    if( NIL != date_utilities.beginning_of_timeP( interval ) || NIL != date_utilities.end_of_timeP( interval ) || $const29$Now.eql( interval ) )
    {
      return interval;
    }
    if( NIL != date_utilities.always_time_intervalP( interval ) )
    {
      return date_utilities.$beginning_of_time$.getGlobalValue();
    }
    if( NIL != some_time_interval_p( interval ) )
    {
      return interval;
    }
    final SubLObject pcase_var;
    final SubLObject functor = pcase_var = cycl_utilities.nat_functor( interval );
    if( pcase_var.eql( $const0$TimeIntervalInclusiveFn ) )
    {
      return reduce_date_wrt_start( cycl_utilities.nat_arg1( interval, UNPROVIDED ) );
    }
    if( pcase_var.eql( $const1$TimeIntervalBetweenFn ) )
    {
      return reduce_date_wrt_end( cycl_utilities.nat_arg1( interval, UNPROVIDED ) );
    }
    if( pcase_var.eql( $const10$IntervalAfterFn ) || pcase_var.eql( $const9$DateAfterFn ) )
    {
      return el_utilities.make_binary_formula( functor, reduce_date_wrt_end( cycl_utilities.nat_arg1( interval, UNPROVIDED ) ), reduce_duration( cycl_utilities.nat_arg2( interval, UNPROVIDED ) ) );
    }
    if( pcase_var.eql( $const11$IntervalBeforeFn ) || pcase_var.eql( $const8$DateBeforeFn ) )
    {
      return ConsesLow.list( functor, reduce_date_wrt_start( cycl_utilities.nat_arg1( interval, UNPROVIDED ) ), reduce_duration( cycl_utilities.nat_arg2( interval, UNPROVIDED ) ) );
    }
    if( pcase_var.eql( $const4$IntervalStartedByFn ) )
    {
      final SubLObject result = reduce_date_wrt_start( succeeding_cycl_date( cycl_interval_final_second( cycl_utilities.nat_arg1( interval, UNPROVIDED ) ) ) );
      if( NIL != date_utilities.beginning_of_timeP( result ) )
      {
        return $const25$Always_TimeInterval;
      }
      if( NIL != date_utilities.end_of_timeP( result ) )
      {
        return $const27$TheEmptyTimeInterval;
      }
      return result;
    }
    else if( pcase_var.eql( $const6$IntervalStartedByFn_Inclusive ) )
    {
      final SubLObject result = reduce_date_wrt_start( cycl_utilities.nat_arg1( interval, UNPROVIDED ) );
      if( NIL != date_utilities.beginning_of_timeP( result ) )
      {
        return $const25$Always_TimeInterval;
      }
      if( NIL != date_utilities.end_of_timeP( result ) )
      {
        return $const27$TheEmptyTimeInterval;
      }
      return result;
    }
    else
    {
      if( pcase_var.eql( $const5$IntervalEndedByFn ) || pcase_var.eql( $const7$IntervalEndedByFn_Inclusive ) )
      {
        return date_utilities.$beginning_of_time$.getGlobalValue();
      }
      if( pcase_var.eql( $const3$EndFn ) )
      {
        return cycl_interval_final_second( cycl_utilities.nat_arg1( interval, UNPROVIDED ) );
      }
      if( pcase_var.eql( $const2$StartFn ) )
      {
        return reduce_date_wrt_start( cycl_interval_initial_second( cycl_utilities.nat_arg1( interval, UNPROVIDED ) ) );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 37059L)
  public static SubLObject reduce_date_wrt_end_limited(final SubLObject date, final SubLObject start_date)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != sbhl_time_modules.starts_after_starting_ofP( start_date, date, UNPROVIDED ) )
    {
      return date;
    }
    thread.resetMultipleValues();
    final SubLObject type = date_utilities.explode_date( date );
    final SubLObject year = thread.secondMultipleValue();
    final SubLObject month = thread.thirdMultipleValue();
    final SubLObject day = thread.fourthMultipleValue();
    final SubLObject hour = thread.fifthMultipleValue();
    final SubLObject minute = thread.sixthMultipleValue();
    final SubLObject second = thread.seventhMultipleValue();
    thread.resetMultipleValues();
    final SubLObject date_values = ConsesLow.list( second, minute, hour, day, month, year );
    thread.resetMultipleValues();
    final SubLObject type_$8 = date_utilities.explode_date( start_date );
    final SubLObject year_$9 = thread.secondMultipleValue();
    final SubLObject month_$10 = thread.thirdMultipleValue();
    final SubLObject day_$11 = thread.fourthMultipleValue();
    final SubLObject hour_$12 = thread.fifthMultipleValue();
    final SubLObject minute_$13 = thread.sixthMultipleValue();
    final SubLObject second_$14 = thread.seventhMultipleValue();
    thread.resetMultipleValues();
    final SubLObject start_date_values = ConsesLow.list( second_$14, minute_$13, hour_$12, day_$11, month_$10, year_$9 );
    SubLObject doneP = NIL;
    if( NIL == doneP )
    {
      SubLObject end_var;
      SubLObject i;
      SubLObject date_value;
      SubLObject date_unit;
      for( end_var = SIX_INTEGER, i = NIL, i = ZERO_INTEGER; NIL == doneP && !i.numGE( end_var ); i = number_utilities.f_1X( i ) )
      {
        date_value = ConsesLow.nth( i, date_values );
        date_unit = ConsesLow.nth( i, date_utilities.$date_units_ordered$.getGlobalValue() );
        if( NIL != date_value )
        {
          if( NIL == date_utilities.ending_numerical_value_for_calendar_unit_p( date_value, date_unit, ConsesLow.nth( FOUR_INTEGER, date_values ), ConsesLow.nth( FIVE_INTEGER, date_values ) ) )
          {
            doneP = T;
          }
          else if( Sequences.subseq( date_values, number_utilities.f_1X( i ), UNPROVIDED ).equal( Sequences.subseq( start_date_values, number_utilities.f_1X( i ), UNPROVIDED ) ) && NIL == date_utilities
              .starting_numerical_values_for_calendar_unit_p( list_utilities.first_n( number_utilities.f_1X( i ), start_date_values ), date_unit ) )
          {
            doneP = T;
          }
          else
          {
            ConsesLow.set_nth( i, date_values, NIL );
          }
        }
      }
    }
    return Functions.apply( $sym28$CONSTRUCT_REDUCED_CYCL_DATE, date_values );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 38561L)
  public static SubLObject reduce_date_wrt_end(final SubLObject interval)
  {
    if( NIL != date_utilities.date_p( interval ) )
    {
      return date_utilities.date_reduced_to_end( interval );
    }
    if( NIL != date_utilities.beginning_of_timeP( interval ) || NIL != date_utilities.end_of_timeP( interval ) || $const29$Now.eql( interval ) )
    {
      return interval;
    }
    if( NIL != date_utilities.always_time_intervalP( interval ) )
    {
      return date_utilities.$end_of_time$.getGlobalValue();
    }
    if( NIL != some_time_interval_p( interval ) )
    {
      return interval;
    }
    final SubLObject pcase_var;
    final SubLObject functor = pcase_var = cycl_utilities.nat_functor( interval );
    if( pcase_var.eql( $const0$TimeIntervalInclusiveFn ) )
    {
      return reduce_date_wrt_end( cycl_utilities.nat_arg2( interval, UNPROVIDED ) );
    }
    if( pcase_var.eql( $const1$TimeIntervalBetweenFn ) )
    {
      return reduce_date_wrt_start( cycl_utilities.nat_arg2( interval, UNPROVIDED ) );
    }
    if( pcase_var.eql( $const10$IntervalAfterFn ) || pcase_var.eql( $const9$DateAfterFn ) )
    {
      return ConsesLow.list( functor, reduce_date_wrt_start( cycl_utilities.nat_arg1( interval, UNPROVIDED ) ), reduce_duration( cycl_utilities.nat_arg2( interval, UNPROVIDED ) ) );
    }
    if( pcase_var.eql( $const11$IntervalBeforeFn ) || pcase_var.eql( $const8$DateBeforeFn ) )
    {
      return ConsesLow.list( functor, reduce_date_wrt_end( cycl_utilities.nat_arg1( interval, UNPROVIDED ) ), reduce_duration( cycl_utilities.nat_arg2( interval, UNPROVIDED ) ) );
    }
    if( pcase_var.eql( $const4$IntervalStartedByFn ) || pcase_var.eql( $const6$IntervalStartedByFn_Inclusive ) )
    {
      return date_utilities.$end_of_time$.getGlobalValue();
    }
    if( pcase_var.eql( $const5$IntervalEndedByFn ) )
    {
      final SubLObject result = reduce_date_wrt_end( preceding_cycl_date( cycl_interval_initial_second( cycl_utilities.nat_arg1( interval, UNPROVIDED ) ) ) );
      if( NIL != date_utilities.end_of_timeP( result ) )
      {
        return $const25$Always_TimeInterval;
      }
      if( NIL != date_utilities.beginning_of_timeP( result ) )
      {
        return $const27$TheEmptyTimeInterval;
      }
      return result;
    }
    else if( pcase_var.eql( $const7$IntervalEndedByFn_Inclusive ) )
    {
      final SubLObject result = reduce_date_wrt_end( cycl_utilities.nat_arg1( interval, UNPROVIDED ) );
      if( NIL != date_utilities.end_of_timeP( result ) )
      {
        return $const25$Always_TimeInterval;
      }
      if( NIL != date_utilities.beginning_of_timeP( result ) )
      {
        return $const27$TheEmptyTimeInterval;
      }
      return result;
    }
    else
    {
      if( pcase_var.eql( $const3$EndFn ) )
      {
        return reduce_date_wrt_end( cycl_interval_final_second( interval ) );
      }
      if( pcase_var.eql( $const2$StartFn ) )
      {
        return cycl_interval_initial_second( interval );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 40465L)
  public static SubLObject reduce_duration(final SubLObject duration)
  {
    return duration;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 40536L)
  public static SubLObject merge_date_intervals(final SubLObject date1, final SubLObject date2)
  {
    final SubLObject start1_early = cycl_interval_initial_second_possibly_indeterminate_early( date1 );
    final SubLObject start1_late = cycl_interval_initial_second_possibly_indeterminate_late( date1 );
    final SubLObject end1_early = cycl_interval_final_second_possibly_indeterminate_early( date1 );
    final SubLObject end1_late = cycl_interval_final_second_possibly_indeterminate_late( date1 );
    final SubLObject start2_early = cycl_interval_initial_second_possibly_indeterminate_early( date2 );
    final SubLObject start2_late = cycl_interval_initial_second_possibly_indeterminate_late( date2 );
    final SubLObject end2_early = cycl_interval_final_second_possibly_indeterminate_early( date2 );
    final SubLObject end2_late = cycl_interval_final_second_possibly_indeterminate_late( date2 );
    SubLObject merged_start_early = ( NIL != date_utilities.dateLE( start1_early, start2_early ) ) ? start1_early : start2_early;
    final SubLObject merged_start_late = ( NIL != date_utilities.dateLE( start1_late, start2_late ) ) ? start1_late : start2_late;
    final SubLObject merged_end_early = ( NIL != date_utilities.dateGE( end1_early, end2_early ) ) ? end1_early : end2_early;
    SubLObject merged_end_late = ( NIL != date_utilities.dateGE( end1_late, end2_late ) ) ? end1_late : end2_late;
    if( NIL != date_utilities.beginning_of_timeP( merged_start_early ) && ( ( merged_start_late.equal( start1_early ) && merged_start_late.equal( start1_late ) ) || ( merged_start_late.equal( start2_early )
        && merged_start_late.equal( start2_late ) ) ) && NIL != date_utilities.end_of_timeP( merged_end_late ) && ( ( merged_end_early.equal( end1_early ) && merged_end_early.equal( end1_late ) ) || ( merged_end_early
            .equal( end2_early ) && merged_end_early.equal( end2_late ) ) ) )
    {
      merged_start_early = merged_start_late;
      merged_end_late = merged_end_early;
    }
    return canonicalize_possibly_indeterminate_time_interval_fn( merged_start_early, merged_start_late, merged_end_early, merged_end_late, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 42462L)
  public static SubLObject was_before_interval(final SubLObject interval)
  {
    return canonicalize_time_interval( new_some_time_in_interval_index( ConsesLow.list( $const5$IntervalEndedByFn, interval ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 42619L)
  public static SubLObject will_be_after_interval(final SubLObject interval)
  {
    return canonicalize_time_interval( new_some_time_in_interval_index( ConsesLow.list( $const4$IntervalStartedByFn, interval ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 42780L)
  public static SubLObject metric_tense_supported_type_p(final SubLObject type)
  {
    return makeBoolean( NIL != subl_promotions.memberP( type, $list30, UNPROVIDED, UNPROVIDED ) || ( NIL != time_parameter_utilities.month_of_year_typeP( type ) && NIL != date_utilities.month_term_p( type ) )
        || NIL != time_parameter_utilities.day_of_week_typeP( type ) || NIL != time_parameter_utilities.hour_of_day_typeP( type ) || NIL != time_parameter_utilities.day_of_year_typeP( type ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 43288L)
  public static SubLObject was_metric_before_interval(final SubLObject interval, final SubLObject type, final SubLObject amount)
  {
    if( NIL == date_interval_p( interval ) || NIL == metric_tense_supported_type_p( type ) )
    {
      return ConsesLow.list( $const31$NthMetricallyPrecedingTimeInterva, amount, interval, type );
    }
    final SubLObject reference_interval = time_parameter_utilities.nth_type_ending_no_earlier_than_end_of_interval( interval, type, ZERO_INTEGER );
    return ( NIL != reference_interval ) ? time_parameter_utilities.nth_type_starting_no_later_than_start_of_interval( reference_interval, type, amount ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 43759L)
  public static SubLObject will_be_metric_after_interval(final SubLObject interval, final SubLObject type, final SubLObject amount)
  {
    if( NIL == date_interval_p( interval ) || NIL == metric_tense_supported_type_p( type ) )
    {
      return ConsesLow.list( $const32$NthMetricallySucceedingTimeInterv, amount, interval, type );
    }
    final SubLObject reference_interval = time_parameter_utilities.nth_type_starting_no_later_than_start_of_interval( interval, type, ZERO_INTEGER );
    return ( NIL != reference_interval ) ? time_parameter_utilities.nth_type_starting_no_earlier_than_start_of_interval( reference_interval, type, amount ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 44238L)
  public static SubLObject interval_ended_by_intervalP(final SubLObject interval)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == date_interval_p( interval ) )
    {
      Errors.error( $str33$_a_not_a_date_interval_p, interval );
    }
    return Equality.eql( cycl_utilities.nat_functor( interval ), $const5$IntervalEndedByFn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 44427L)
  public static SubLObject interval_started_by_intervalP(final SubLObject interval)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == date_interval_p( interval ) )
    {
      Errors.error( $str33$_a_not_a_date_interval_p, interval );
    }
    return Equality.eql( cycl_utilities.nat_functor( interval ), $const4$IntervalStartedByFn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 44619L)
  public static SubLObject time_interval_durationP(final SubLObject interval, final SubLObject duration)
  {
    final SubLObject precision = time_parameter_utilities.duration_precision( duration );
    return arithmetic.cyc_numerically_equal( time_interval_duration( interval, precision ), duration );
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 44821L)
  public static SubLObject time_interval_duration(final SubLObject interval, SubLObject precision)
  {
    if( precision == UNPROVIDED )
    {
      precision = NIL;
    }
    if( NIL != date_interval_p( interval ) )
    {
      return date_interval_duration( interval, precision );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 45015L)
  public static SubLObject date_interval_duration(final SubLObject interval, SubLObject precision)
  {
    if( precision == UNPROVIDED )
    {
      precision = NIL;
    }
    if( NIL != precision && !assertionsDisabledSynth && NIL == time_parameter_utilities.duration_function_p( precision ) )
    {
      throw new AssertionError( precision );
    }
    if( NIL != date_utilities.date_p( interval ) )
    {
      final SubLObject interval_precision = date_utilities.date_precision( interval );
      if( NIL == precision || precision.eql( interval_precision ) )
      {
        final SubLObject duration = time_parameter_utilities.get_duration_of_type( date_utilities.date_precision( interval ) );
        return ( NIL != time_parameter_utilities.duration_p( duration ) ) ? duration : NIL;
      }
      final SubLObject start = cycl_interval_initial_second( interval );
      final SubLObject end = cycl_interval_final_second( interval );
      return date_utilities.time_elapsed( start, succeeding_cycl_date( end ), precision );
    }
    else
    {
      if( NIL != indeterminate_date_interval_p( interval ) )
      {
        return NIL;
      }
      if( NIL != proper_date_interval_p( interval ) )
      {
        final SubLObject pcase_var = cycl_utilities.el_formula_operator( interval );
        if( pcase_var.eql( $const0$TimeIntervalInclusiveFn ) )
        {
          SubLObject current;
          final SubLObject datum = current = cycl_utilities.el_formula_args( interval, UNPROVIDED );
          SubLObject start2 = NIL;
          SubLObject end2 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
          start2 = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
          end2 = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( NIL == date_utilities.date_p( start2 ) )
            {
              start2 = cycl_interval_initial_second( start2 );
            }
            if( NIL == date_utilities.date_p( end2 ) )
            {
              end2 = cycl_interval_final_second( end2 );
            }
            return date_utilities.time_elapsed( start2, succeeding_cycl_date( end2 ), precision );
          }
          cdestructuring_bind.cdestructuring_bind_error( datum, $list21 );
        }
        else if( pcase_var.eql( $const1$TimeIntervalBetweenFn ) )
        {
          SubLObject current;
          final SubLObject datum = current = cycl_utilities.el_formula_args( interval, UNPROVIDED );
          SubLObject start2 = NIL;
          SubLObject end2 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
          start2 = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list21 );
          end2 = current.first();
          current = current.rest();
          if( NIL == current )
          {
            if( NIL == date_utilities.date_p( start2 ) )
            {
              start2 = cycl_interval_final_second( start2 );
            }
            if( NIL == date_utilities.date_p( end2 ) )
            {
              end2 = cycl_interval_initial_second( end2 );
            }
            return date_utilities.time_elapsed( succeeding_cycl_date( start2 ), end2, precision );
          }
          cdestructuring_bind.cdestructuring_bind_error( datum, $list21 );
        }
        else
        {
          if( pcase_var.eql( $const2$StartFn ) || pcase_var.eql( $const3$EndFn ) )
          {
            return el_utilities.make_unary_formula( $const35$TimePointsDuration, ONE_INTEGER );
          }
          if( pcase_var.eql( $const11$IntervalBeforeFn ) || pcase_var.eql( $const10$IntervalAfterFn ) )
          {
            return cycl_utilities.el_formula_arg2( interval, UNPROVIDED );
          }
          if( pcase_var.eql( $const6$IntervalStartedByFn_Inclusive ) || pcase_var.eql( $const4$IntervalStartedByFn ) || pcase_var.eql( $const7$IntervalEndedByFn_Inclusive ) || pcase_var.eql( $const5$IntervalEndedByFn ) )
          {
            return NIL;
          }
          return NIL;
        }
        return NIL;
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/time-interval-utilities.lisp", position = 47046L)
  public static SubLObject test_recanonicalize_time_interval(final SubLObject interval)
  {
    return interval_equal_ignoring_guids( interval, recanonicalize_time_interval( interval, UNPROVIDED, UNPROVIDED ) );
  }

  public static SubLObject declare_time_interval_utilities_file()
  {
    SubLFiles.declareFunction( me, "date_interval_p", "DATE-INTERVAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_time_index_p", "VALID-TIME-INDEX-P", 1, 0, false );
    SubLFiles.declareFunction( me, "proper_date_interval_p", "PROPER-DATE-INTERVAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "some_time_interval_p", "SOME-TIME-INTERVAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "indeterminate_date_interval_p", "INDETERMINATE-DATE-INTERVAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "some_time_interval_functor_p", "SOME-TIME-INTERVAL-FUNCTOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_guid_string_p", "POSSIBLY-GUID-STRING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_some_time_in_interval_index", "NEW-SOME-TIME-IN-INTERVAL-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "succeeding_cycl_date", "SUCCEEDING-CYCL-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "preceding_cycl_date", "PRECEDING-CYCL-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "date_interval_or_indexical_subsumesP", "DATE-INTERVAL-OR-INDEXICAL-SUBSUMES?", 2, 0, false );
    SubLFiles.declareFunction( me, "date_interval_subsumesP", "DATE-INTERVAL-SUBSUMES?", 2, 0, false );
    SubLFiles.declareFunction( me, "date_intervals_or_indexicals_intersectP", "DATE-INTERVALS-OR-INDEXICALS-INTERSECT?", 2, 0, false );
    SubLFiles.declareFunction( me, "date_intervals_intersectP", "DATE-INTERVALS-INTERSECT?", 2, 2, false );
    SubLFiles.declareFunction( me, "date_intervals_intersectP_int", "DATE-INTERVALS-INTERSECT?-INT", 4, 1, false );
    SubLFiles.declareFunction( me, "dateLE_or_adjacent", "DATE<=-OR-ADJACENT", 2, 0, false );
    SubLFiles.declareFunction( me, "cycl_interval_initial_second_possibly_indeterminate_early", "CYCL-INTERVAL-INITIAL-SECOND-POSSIBLY-INDETERMINATE-EARLY", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_interval_initial_second_possibly_indeterminate_late", "CYCL-INTERVAL-INITIAL-SECOND-POSSIBLY-INDETERMINATE-LATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_interval_final_second_possibly_indeterminate_early", "CYCL-INTERVAL-FINAL-SECOND-POSSIBLY-INDETERMINATE-EARLY", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_interval_final_second_possibly_indeterminate_late", "CYCL-INTERVAL-FINAL-SECOND-POSSIBLY-INDETERMINATE-LATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_interval_initial_second_internal", "CYCL-INTERVAL-INITIAL-SECOND-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_interval_initial_second", "CYCL-INTERVAL-INITIAL-SECOND", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_interval_final_second", "CYCL-INTERVAL-FINAL-SECOND", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_interval_initial_second_indeterminate_early", "CYCL-INTERVAL-INITIAL-SECOND-INDETERMINATE-EARLY", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_interval_initial_second_indeterminate_late", "CYCL-INTERVAL-INITIAL-SECOND-INDETERMINATE-LATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_interval_final_second_indeterminate_early", "CYCL-INTERVAL-FINAL-SECOND-INDETERMINATE-EARLY", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_interval_final_second_indeterminate_late", "CYCL-INTERVAL-FINAL-SECOND-INDETERMINATE-LATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_time_index_start", "CYCL-TIME-INDEX-START", 1, 0, false );
    SubLFiles.declareFunction( me, "cycl_time_index_end", "CYCL-TIME-INDEX-END", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_time_interval", "CANONICALIZE-TIME-INTERVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "recanonicalize_time_interval", "RECANONICALIZE-TIME-INTERVAL", 1, 2, false );
    SubLFiles.declareFunction( me, "canonicalize_possibly_indeterminate_time_interval_fn", "CANONICALIZE-POSSIBLY-INDETERMINATE-TIME-INTERVAL-FN", 4, 2, false );
    SubLFiles.declareFunction( me, "interval_equal_ignoring_guids", "INTERVAL-EQUAL-IGNORING-GUIDS", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_time_interval_int", "CANONICALIZE-TIME-INTERVAL-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_time_interval_inclusive_fn", "CANONICALIZE-TIME-INTERVAL-INCLUSIVE-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_time_interval_between_fn", "CANONICALIZE-TIME-INTERVAL-BETWEEN-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_interval_or_date_after_fn", "CANONICALIZE-INTERVAL-OR-DATE-AFTER-FN", 3, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_interval_or_date_before_fn", "CANONICALIZE-INTERVAL-OR-DATE-BEFORE-FN", 3, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_interval_started_by_fn", "CANONICALIZE-INTERVAL-STARTED-BY-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_interval_started_by_fn_inclusive", "CANONICALIZE-INTERVAL-STARTED-BY-FN-INCLUSIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_interval_ended_by_fn", "CANONICALIZE-INTERVAL-ENDED-BY-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_interval_ended_by_fn_inclusive", "CANONICALIZE-INTERVAL-ENDED-BY-FN-INCLUSIVE", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_end_fn", "CANONICALIZE-END-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_start_fn", "CANONICALIZE-START-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_some_time_in_interval_fn", "CANONICALIZE-SOME-TIME-IN-INTERVAL-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "reduce_date_wrt_start_limited", "REDUCE-DATE-WRT-START-LIMITED", 2, 0, false );
    SubLFiles.declareFunction( me, "reduce_date_wrt_start", "REDUCE-DATE-WRT-START", 1, 0, false );
    SubLFiles.declareFunction( me, "reduce_date_wrt_end_limited", "REDUCE-DATE-WRT-END-LIMITED", 2, 0, false );
    SubLFiles.declareFunction( me, "reduce_date_wrt_end", "REDUCE-DATE-WRT-END", 1, 0, false );
    SubLFiles.declareFunction( me, "reduce_duration", "REDUCE-DURATION", 1, 0, false );
    SubLFiles.declareFunction( me, "merge_date_intervals", "MERGE-DATE-INTERVALS", 2, 0, false );
    SubLFiles.declareFunction( me, "was_before_interval", "WAS-BEFORE-INTERVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "will_be_after_interval", "WILL-BE-AFTER-INTERVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "metric_tense_supported_type_p", "METRIC-TENSE-SUPPORTED-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "was_metric_before_interval", "WAS-METRIC-BEFORE-INTERVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "will_be_metric_after_interval", "WILL-BE-METRIC-AFTER-INTERVAL", 3, 0, false );
    SubLFiles.declareFunction( me, "interval_ended_by_intervalP", "INTERVAL-ENDED-BY-INTERVAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "interval_started_by_intervalP", "INTERVAL-STARTED-BY-INTERVAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "time_interval_durationP", "TIME-INTERVAL-DURATION?", 2, 0, false );
    SubLFiles.declareFunction( me, "time_interval_duration", "TIME-INTERVAL-DURATION", 1, 1, false );
    SubLFiles.declareFunction( me, "date_interval_duration", "DATE-INTERVAL-DURATION", 1, 1, false );
    SubLFiles.declareFunction( me, "test_recanonicalize_time_interval", "TEST-RECANONICALIZE-TIME-INTERVAL", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_time_interval_utilities_file()
  {
    return NIL;
  }

  public static SubLObject setup_time_interval_utilities_file()
  {
    memoization_state.note_memoized_function( $sym15$CYCL_INTERVAL_INITIAL_SECOND );
    generic_testing.define_test_case_table_int( $sym36$DATE_INTERVAL_SUBSUMES_, ConsesLow.list( new SubLObject[] { $kw37$TEST, NIL, $kw38$OWNER, NIL, $kw39$CLASSES, NIL, $kw40$KB, $kw41$FULL, $kw42$WORKING_, T
    } ), $list43 );
    generic_testing.define_test_case_table_int( $sym44$CANONICALIZE_POSSIBLY_INDETERMINATE_TIME_INTERVAL_FN, ConsesLow.list( new SubLObject[] { $kw37$TEST, $sym45$INTERVAL_EQUAL_IGNORING_GUIDS, $kw38$OWNER, NIL,
      $kw39$CLASSES, NIL, $kw40$KB, $kw41$FULL, $kw42$WORKING_, T
    } ), $list46 );
    generic_testing.define_test_case_table_int( $sym47$TEST_RECANONICALIZE_TIME_INTERVAL, ConsesLow.list( new SubLObject[] { $kw37$TEST, EQ, $kw38$OWNER, NIL, $kw39$CLASSES, NIL, $kw40$KB, $kw41$FULL, $kw42$WORKING_, T
    } ), $list48 );
    return NIL;
  }

  private static SubLObject _constant_46_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell(
        makeString( "October" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2002 ) ) ), makeKeyword( "END-OF-TIME" ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "October" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "YearFn" ) ), makeInteger( 2002 ) ) ), makeKeyword( "END-OF-TIME" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), ConsesLow.list( constant_handles
                    .reader_make_constant_shell( makeString( "IntervalStartedByFn-Inclusive" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles
                        .reader_make_constant_shell( makeString( "October" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2002 ) ) ) ), makeString(
                            "f15f4279-0a57-11e1-9252-f46d042a4867" ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), TWELVE_INTEGER, ConsesLow
                                .list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list( constant_handles
                                    .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1999 ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), TWELVE_INTEGER,
                                        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list(
                                            constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1999 ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                "DayFn" ) ), makeInteger( 30 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell(
                                                    makeString( "June" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1999 ) ) ) ), ConsesLow.list(
                                                        constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 30 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                            "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "June" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                "YearFn" ) ), makeInteger( 1999 ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow
                                                                    .list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), TWELVE_INTEGER, ConsesLow.list( constant_handles
                                                                        .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list(
                                                                            constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1999 ) ) ) ), ConsesLow.list( constant_handles
                                                                                .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "June" ) ), ConsesLow.list(
                                                                                    constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1999 ) ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                                        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), TWELVE_INTEGER, ConsesLow.list(
                                                                                            constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                "January" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                                                                                                    1999 ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), TWELVE_INTEGER,
                                                                                                        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles
                                                                                                            .reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list( constant_handles
                                                                                                                .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1999 ) ) ) ), makeKeyword(
                                                                                                                    "BEGINNING-OF-TIME" ), makeKeyword( "END-OF-TIME" ) ), ConsesLow.list( constant_handles
                                                                                                                        .reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list(
                                                                                                                            constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), TWELVE_INTEGER, ConsesLow
                                                                                                                                .list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ),
                                                                                                                                    constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list(
                                                                                                                                        constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                                                                                                                                            1999 ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                                makeString( "SomeTimeInIntervalFn" ) ), ConsesLow.list( constant_handles
                                                                                                                                                    .reader_make_constant_shell( makeString(
                                                                                                                                                        "IntervalStartedByFn-Inclusive" ) ), ConsesLow.list(
                                                                                                                                                            constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                                "DayFn" ) ), TWELVE_INTEGER, ConsesLow.list(
                                                                                                                                                                    constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                                        "MonthFn" ) ), constant_handles
                                                                                                                                                                            .reader_make_constant_shell( makeString(
                                                                                                                                                                                "January" ) ), ConsesLow.list(
                                                                                                                                                                                    constant_handles
                                                                                                                                                                                        .reader_make_constant_shell(
                                                                                                                                                                                            makeString( "YearFn" ) ),
                                                                                                                                                                                    makeInteger( 1999 ) ) ) ) ), makeString(
                                                                                                                                                                                        "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeKeyword( "BEGINNING-OF-TIME" ), makeKeyword( "END-OF-TIME" ), makeKeyword( "BEGINNING-OF-TIME" ), makeKeyword( "END-OF-TIME" ) ), ConsesLow.list( constant_handles
          .reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Always-TimeInterval" ) ), makeString( "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ) ),
      ConsesLow.list( ConsesLow.list( makeKeyword( "BEGINNING-OF-TIME" ), makeKeyword( "END-OF-TIME" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 30 ), ConsesLow
          .list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "June" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
              makeString( "YearFn" ) ), makeInteger( 1999 ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 30 ), ConsesLow.list( constant_handles
                  .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "June" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "YearFn" ) ), makeInteger( 1999 ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles
                          .reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "IntervalEndedByFn-Inclusive" ) ), ConsesLow.list(
                              constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "June" ) ), ConsesLow.list( constant_handles
                                  .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1999 ) ) ) ), makeString( "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ), ConsesLow.list( constant_handles
                                      .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "June" ) ), ConsesLow.list( constant_handles
                                          .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1999 ) ) ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "BEGINNING-OF-TIME" ), makeKeyword(
                                              "END-OF-TIME" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 29 ), ConsesLow.list( constant_handles
                                                  .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "June" ) ), ConsesLow.list( constant_handles
                                                      .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1999 ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                          "DayFn" ) ), makeInteger( 29 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles
                                                              .reader_make_constant_shell( makeString( "June" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                                                                  1999 ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles
                                                                      .reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                          "IntervalEndedByFn-Inclusive" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 29 ),
                                                                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell(
                                                                                  makeString( "June" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                                                                                      1999 ) ) ) ) ), makeString( "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                          makeString( "DayFn" ) ), makeInteger( 29 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                              "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "June" ) ), ConsesLow.list( constant_handles
                                                                                                  .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1999 ) ) ) ) ) ), ConsesLow.list( ConsesLow.list(
                                                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "StartFn" ) ), ConsesLow.list(
                                                                                                          constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2000 ) ) ), ConsesLow.list(
                                                                                                              constant_handles.reader_make_constant_shell( makeString( "EndFn" ) ), ConsesLow.list( constant_handles
                                                                                                                  .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2000 ) ) ), ConsesLow.list(
                                                                                                                      constant_handles.reader_make_constant_shell( makeString( "StartFn" ) ), ConsesLow.list(
                                                                                                                          constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2005 ) ) ),
                                                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "EndFn" ) ), ConsesLow.list( constant_handles
                                                                                                          .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2005 ) ) ) ), ConsesLow.list( constant_handles
                                                                                                              .reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles
                                                                                                                  .reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), ConsesLow.list( constant_handles
                                                                                                                      .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2000 ) ), makeString(
                                                                                                                          "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ), ConsesLow.list( constant_handles
                                                                                                                              .reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), ConsesLow.list(
                                                                                                                                  constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                                                                                                                                      2005 ) ), makeString( "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ) ) ), ConsesLow.list(
                                                                                                                                          ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                              makeString( "DayFn" ) ), ONE_INTEGER, ConsesLow.list( constant_handles
                                                                                                                                                  .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles
                                                                                                                                                      .reader_make_constant_shell( makeString( "January" ) ), ConsesLow
                                                                                                                                                          .list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                              "YearFn" ) ), makeInteger( 1987 ) ) ) ), ConsesLow.list(
                                                                                                                                                                  constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                                      "DayFn" ) ), makeInteger( 31 ), ConsesLow.list(
                                                                                                                                                                          constant_handles.reader_make_constant_shell(
                                                                                                                                                                              makeString( "MonthFn" ) ), constant_handles
                                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                                      "December" ) ), ConsesLow.list(
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString( "YearFn" ) ),
                                                                                                                                                                                          makeInteger( 1987 ) ) ) ),
                                                                                                                                              makeKeyword( "BEGINNING-OF-TIME" ), makeKeyword( "END-OF-TIME" ) ), ConsesLow
                                                                                                                                                  .list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                      "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles
                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                              "SomeTimeInIntervalFn" ) ), ConsesLow.list( constant_handles
                                                                                                                                                                  .reader_make_constant_shell( makeString( "YearFn" ) ),
                                                                                                                                                                  makeInteger( 1987 ) ), makeString(
                                                                                                                                                                      "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ), ConsesLow
                                                                                                                                                                          .list( constant_handles
                                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                                  "SomeTimeInIntervalFn" ) ), ConsesLow
                                                                                                                                                                                      .list( constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString(
                                                                                                                                                                                                  "IntervalStartedByFn-Inclusive" ) ),
                                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString( "YearFn" ) ),
                                                                                                                                                                                              makeInteger( 1987 ) ) ),
                                                                                                                                                                              makeString(
                                                                                                                                                                                  "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ) ) ),
      ConsesLow.list( ConsesLow.list( makeKeyword( "BEGINNING-OF-TIME" ), makeKeyword( "END-OF-TIME" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), ONE_INTEGER, ConsesLow.list(
          constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
              makeString( "YearFn" ) ), makeInteger( 1987 ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list( constant_handles
                  .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "YearFn" ) ), makeInteger( 1987 ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles
                          .reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "IntervalEndedByFn-Inclusive" ) ), ConsesLow.list(
                              constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1987 ) ) ), makeString( "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ), ConsesLow.list( constant_handles
                                  .reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1987 ) ),
                                  makeString( "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ),
                                      ONE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow
                                          .list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1880 ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                              "DayFn" ) ), ONE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                  "January" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1880 ) ) ) ), ConsesLow.list( constant_handles
                                                      .reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ),
                                                          constant_handles.reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ),
                                                              makeInteger( 1880 ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list(
                                                                  constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "December" ) ), ConsesLow
                                                                      .list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1880 ) ) ) ) ), ConsesLow.list( constant_handles
                                                                          .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1880 ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                              .reader_make_constant_shell( makeString( "DayFn" ) ), ONE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                  "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list( constant_handles
                                                                                      .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1864 ) ) ) ), ConsesLow.list( constant_handles
                                                                                          .reader_make_constant_shell( makeString( "DayFn" ) ), ONE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                              makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list(
                                                                                                  constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1864 ) ) ) ), ConsesLow.list(
                                                                                                      constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), ONE_INTEGER, ConsesLow.list( constant_handles
                                                                                                          .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                              "January" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ),
                                                                                                                  makeInteger( 1864 ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                      "DayFn" ) ), ONE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                          "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow
                                                                                                                              .list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                                                                                                                                  1864 ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                      "DayFn" ) ), ONE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                          makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                                              makeString( "January" ) ), ConsesLow.list( constant_handles
                                                                                                                                                  .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                                                                                                                                                      1864 ) ) ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                                                                                          constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                              "DayFn" ) ), ONE_INTEGER, ConsesLow.list( constant_handles
                                                                                                                                                                  .reader_make_constant_shell( makeString( "MonthFn" ) ),
                                                                                                                                                                  constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                                      "January" ) ), ConsesLow.list( constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "YearFn" ) ), makeInteger( 1993 ) ) ) ),
                                                                                                                                                          ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                                              makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list(
                                                                                                                                                                  constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                                      "MonthFn" ) ), constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "December" ) ), ConsesLow.list(
                                                                                                                                                                                  constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "YearFn" ) ),
                                                                                                                                                                                  makeInteger( 1993 ) ) ) ), ConsesLow.list(
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "DayFn" ) ),
                                                                                                                                                                                      ONE_INTEGER, ConsesLow.list(
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString( "MonthFn" ) ),
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString( "May" ) ),
                                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString( "YearFn" ) ),
                                                                                                                                                                                              makeInteger( 2006 ) ) ) ),
                                                                                                                                                          ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                                              makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list(
                                                                                                                                                                  constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                                      "MonthFn" ) ), constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "May" ) ), ConsesLow.list( constant_handles
                                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                                      "YearFn" ) ), makeInteger(
                                                                                                                                                                                          2006 ) ) ) ) ), ConsesLow.list(
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "TimeIntervalInclusiveFn" ) ),
                                                                                                                                                                                              ConsesLow.list(
                                                                                                                                                                                                  constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "SomeTimeInIntervalFn" ) ),
                                                                                                                                                                                                  ConsesLow.list(
                                                                                                                                                                                                      constant_handles
                                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                                              makeString(
                                                                                                                                                                                                                  "YearFn" ) ),
                                                                                                                                                                                                      makeInteger( 1993 ) ),
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ),
                                                                                                                                                                                              ConsesLow.list(
                                                                                                                                                                                                  constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "SomeTimeInIntervalFn" ) ),
                                                                                                                                                                                                  ConsesLow.list(
                                                                                                                                                                                                      constant_handles
                                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                                              makeString(
                                                                                                                                                                                                                  "MonthFn" ) ),
                                                                                                                                                                                                      constant_handles
                                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                                              makeString(
                                                                                                                                                                                                                  "May" ) ),
                                                                                                                                                                                                      ConsesLow.list(
                                                                                                                                                                                                          constant_handles
                                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                                      "YearFn" ) ),
                                                                                                                                                                                                          makeInteger(
                                                                                                                                                                                                              2006 ) ) ),
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ) ) )
    } );
  }

  private static SubLObject _constant_48_initializer()
  {
    return ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "IntervalStartedByFn-Inclusive" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell(
            makeString( "October" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2002 ) ) ) ), makeString( "f15f4279-0a57-11e1-9252-f46d042a4867" ) ) ), T ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "DayFn" ) ), TWELVE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list(
              constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1999 ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles
                  .reader_make_constant_shell( makeString( "June" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1999 ) ) ) ) ), T ), ConsesLow.list( ConsesLow
                      .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), constant_handles.reader_make_constant_shell( makeString( "Always-TimeInterval" ) ),
                          makeString( "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                              "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), ConsesLow.list( constant_handles
                                  .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2000 ) ), makeString( "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ), ConsesLow.list( constant_handles
                                      .reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2005 ) ),
                                      makeString( "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                          "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), ConsesLow.list( constant_handles
                                              .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1987 ) ), makeString( "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ), ConsesLow.list( constant_handles
                                                  .reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                      "IntervalStartedByFn-Inclusive" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1987 ) ) ), makeString(
                                                          "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                              "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), ConsesLow.list(
                                                                  constant_handles.reader_make_constant_shell( makeString( "IntervalEndedByFn-Inclusive" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                      makeString( "YearFn" ) ), makeInteger( 1987 ) ) ), makeString( "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ), ConsesLow.list( constant_handles
                                                                          .reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                              "YearFn" ) ), makeInteger( 1987 ) ), makeString( "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ) ) ), T ), ConsesLow.list( ConsesLow.list(
                                                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1880 ) ) ), T ), ConsesLow.list(
                                                                                      ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles
                                                                                          .reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                              "YearFn" ) ), makeInteger( 1888 ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                  .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                      "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                                                                                                          1888 ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                              makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                  makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "December" ) ),
                                                                                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                                                                                                                      1888 ) ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                          .reader_make_constant_shell( makeString( "DayFn" ) ), ONE_INTEGER, ConsesLow.list(
                                                                                                                              constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles
                                                                                                                                  .reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list( constant_handles
                                                                                                                                      .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1864 ) ) ) ) ),
                                                                                                                          T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                              makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles
                                                                                                                                  .reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), ConsesLow.list(
                                                                                                                                      constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                                                                                                                                          1993 ) ), makeString( "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ), ConsesLow.list(
                                                                                                                                              constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                  "SomeTimeInIntervalFn" ) ), ConsesLow.list( constant_handles
                                                                                                                                                      .reader_make_constant_shell( makeString( "MonthFn" ) ),
                                                                                                                                                      constant_handles.reader_make_constant_shell( makeString( "May" ) ),
                                                                                                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                                          makeString( "YearFn" ) ), makeInteger( 2006 ) ) ), makeString(
                                                                                                                                                              "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ) ) ), T ), ConsesLow
                                                                                                                                                                  .list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString(
                                                                                                                                                                          "TimeIntervalInclusiveFn" ) ), ConsesLow.list(
                                                                                                                                                                              constant_handles.reader_make_constant_shell(
                                                                                                                                                                                  makeString( "SomeTimeInIntervalFn" ) ),
                                                                                                                                                                              ConsesLow.list( constant_handles
                                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                                      "IntervalEndedByFn" ) ), ConsesLow
                                                                                                                                                                                          .list( constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString( "YearFn" ) ),
                                                                                                                                                                                              makeInteger( 1999 ) ) ),
                                                                                                                                                                              makeString(
                                                                                                                                                                                  "3790cebc-1566-11e1-8edf-f46d042a4867" ) ),
                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "YearFn" ) ), makeInteger( 1999 ) ) ) ),
                                                                                                                                                                      NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                                                                                                          constant_handles.reader_make_constant_shell(
                                                                                                                                                                              makeString( "TimeIntervalInclusiveFn" ) ),
                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                                  "SomeTimeInIntervalFn" ) ), ConsesLow
                                                                                                                                                                                      .list( constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString(
                                                                                                                                                                                                  "IntervalEndedByFn-Inclusive" ) ),
                                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString( "YearFn" ) ),
                                                                                                                                                                                              makeInteger( 1998 ) ) ),
                                                                                                                                                                              makeString(
                                                                                                                                                                                  "252c6982-1575-11e1-8ee5-f46d042a4867" ) ),
                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                                  "YearFn" ) ), makeInteger( 1999 ) ) ) ),
                                                                                                                                                                          T ), ConsesLow.list( ConsesLow.list( ConsesLow
                                                                                                                                                                              .list( constant_handles
                                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                                      "TimeIntervalInclusiveFn" ) ),
                                                                                                                                                                                  ConsesLow.list( constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString(
                                                                                                                                                                                              "SomeTimeInIntervalFn" ) ),
                                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString(
                                                                                                                                                                                                  "IntervalEndedByFn-Inclusive" ) ),
                                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString( "DayFn" ) ),
                                                                                                                                                                                              makeInteger( 29 ), ConsesLow
                                                                                                                                                                                                  .list( constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "MonthFn" ) ),
                                                                                                                                                                                                      constant_handles
                                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                                              makeString(
                                                                                                                                                                                                                  "June" ) ),
                                                                                                                                                                                                      ConsesLow.list(
                                                                                                                                                                                                          constant_handles
                                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                                      "YearFn" ) ),
                                                                                                                                                                                                          makeInteger(
                                                                                                                                                                                                              1999 ) ) ) ) ),
                                                                                                                                                                                      makeString(
                                                                                                                                                                                          "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ),
                                                                                                                                                                                  ConsesLow.list( constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "DayFn" ) ),
                                                                                                                                                                                      makeInteger( 29 ), ConsesLow.list(
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString( "MonthFn" ) ),
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString( "June" ) ),
                                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString( "YearFn" ) ),
                                                                                                                                                                                              makeInteger( 1999 ) ) ) ) ) ),
                                                                                                                                                                              NIL ), ConsesLow.list( ConsesLow.list(
                                                                                                                                                                                  ConsesLow.list( constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString(
                                                                                                                                                                                              "TimeIntervalInclusiveFn" ) ),
                                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString(
                                                                                                                                                                                                  "SomeTimeInIntervalFn" ) ),
                                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "IntervalEndedByFn-Inclusive" ) ),
                                                                                                                                                                                              ConsesLow.list(
                                                                                                                                                                                                  constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "SecondFn" ) ),
                                                                                                                                                                                                  ZERO_INTEGER, ConsesLow
                                                                                                                                                                                                      .list(
                                                                                                                                                                                                          constant_handles
                                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                                      "MinuteFn" ) ),
                                                                                                                                                                                                          ZERO_INTEGER,
                                                                                                                                                                                                          ConsesLow.list(
                                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                                          "HourFn" ) ),
                                                                                                                                                                                                              ZERO_INTEGER,
                                                                                                                                                                                                              ConsesLow
                                                                                                                                                                                                                  .list(
                                                                                                                                                                                                                      constant_handles
                                                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                                                              makeString(
                                                                                                                                                                                                                                  "DayFn" ) ),
                                                                                                                                                                                                                      makeInteger(
                                                                                                                                                                                                                          29 ),
                                                                                                                                                                                                                      ConsesLow
                                                                                                                                                                                                                          .list(
                                                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                                                          "MonthFn" ) ),
                                                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                                                          "June" ) ),
                                                                                                                                                                                                                              ConsesLow
                                                                                                                                                                                                                                  .list(
                                                                                                                                                                                                                                      constant_handles
                                                                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                                                                              makeString(
                                                                                                                                                                                                                                                  "YearFn" ) ),
                                                                                                                                                                                                                                      makeInteger(
                                                                                                                                                                                                                                          1999 ) ) ) ) ) ) ) ),
                                                                                                                                                                                          makeString(
                                                                                                                                                                                              "252c9068-1575-11e1-8ee5-f46d042a4867" ) ),
                                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "DayFn" ) ),
                                                                                                                                                                                          makeInteger( 29 ), ConsesLow.list(
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "MonthFn" ) ),
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "June" ) ),
                                                                                                                                                                                              ConsesLow.list(
                                                                                                                                                                                                  constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "YearFn" ) ),
                                                                                                                                                                                                  makeInteger(
                                                                                                                                                                                                      1999 ) ) ) ) ) ), T ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "DayFn" ) ), TWELVE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list(
              constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1999 ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ),
                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "IntervalStartedByFn-Inclusive" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ),
                      TWELVE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list(
                          constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1999 ) ) ) ) ), makeString( "df3116d5-0b24-11e1-8fa4-00219b4436b2" ) ) ) ), NIL ), ConsesLow.list( ConsesLow
                              .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                  "DayFn" ) ), TWELVE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                      "January" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1999 ) ) ) ), ConsesLow.list( constant_handles
                                          .reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "IntervalStartedByFn-Inclusive" ) ),
                                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SecondFn" ) ), makeInteger( 59 ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                  makeString( "MinuteFn" ) ), makeInteger( 59 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "HourFn" ) ), makeInteger( 23 ), ConsesLow.list(
                                                      constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), TWELVE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                          "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                              "YearFn" ) ), makeInteger( 1999 ) ) ) ) ) ) ) ), makeString( "252c906a-1575-11e1-8ee5-f46d042a4867" ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow
                                                                  .list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles
                                                                      .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2012 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                          "SecondFn" ) ), makeInteger( 35 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ), FOURTEEN_INTEGER,
                                                                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "HourFn" ) ), THIRTEEN_INTEGER, ConsesLow.list( constant_handles
                                                                                  .reader_make_constant_shell( makeString( "DayFn" ) ), FIVE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                      makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "February" ) ), ConsesLow.list( constant_handles
                                                                                          .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2015 ) ) ) ) ) ) ) ) ), T ), ConsesLow.list( ConsesLow.list(
                                                                                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list(
                                                                                                  constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell(
                                                                                                      makeString( "January" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ),
                                                                                                          makeInteger( 2012 ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SecondFn" ) ),
                                                                                                              makeInteger( 35 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ),
                                                                                                                  FOURTEEN_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "HourFn" ) ),
                                                                                                                      THIRTEEN_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                          "DayFn" ) ), FIVE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                              makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                  "February" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                      "YearFn" ) ), makeInteger( 2012 ) ) ) ) ) ) ) ) ), T ), ConsesLow.list( ConsesLow
                                                                                                                                          .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                              "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles
                                                                                                                                                  .reader_make_constant_shell( makeString( "DayFn" ) ), ONE_INTEGER,
                                                                                                                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                      "MonthFn" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                                                          makeString( "January" ) ), ConsesLow.list( constant_handles
                                                                                                                                                              .reader_make_constant_shell( makeString( "YearFn" ) ),
                                                                                                                                                              makeInteger( 2012 ) ) ) ), ConsesLow.list( constant_handles
                                                                                                                                                                  .reader_make_constant_shell( makeString( "SecondFn" ) ),
                                                                                                                                                                  makeInteger( 35 ), ConsesLow.list( constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString(
                                                                                                                                                                          "MinuteFn" ) ), FOURTEEN_INTEGER, ConsesLow.list(
                                                                                                                                                                              constant_handles.reader_make_constant_shell(
                                                                                                                                                                                  makeString( "HourFn" ) ),
                                                                                                                                                                              THIRTEEN_INTEGER, ConsesLow.list(
                                                                                                                                                                                  constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "DayFn" ) ),
                                                                                                                                                                                  FIVE_INTEGER, ConsesLow.list(
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "MonthFn" ) ),
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "January" ) ),
                                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "YearFn" ) ),
                                                                                                                                                                                          makeInteger(
                                                                                                                                                                                              2012 ) ) ) ) ) ) ) ) ), T ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "HourFn" ) ), ZERO_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), ONE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
              "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2012 ) ) ) ) ),
          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SecondFn" ) ), makeInteger( 35 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ),
              FOURTEEN_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "HourFn" ) ), THIRTEEN_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "DayFn" ) ), ONE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list(
                      constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2012 ) ) ) ) ) ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                          .reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ), ZERO_INTEGER, ConsesLow.list(
                              constant_handles.reader_make_constant_shell( makeString( "HourFn" ) ), ZERO_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), ONE_INTEGER,
                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list(
                                      constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2012 ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                          "SecondFn" ) ), makeInteger( 35 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ), FOURTEEN_INTEGER, ConsesLow.list( constant_handles
                                              .reader_make_constant_shell( makeString( "HourFn" ) ), ZERO_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), ONE_INTEGER,
                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow
                                                      .list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2012 ) ) ) ) ) ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow
                                                          .list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                              makeString( "SecondFn" ) ), ZERO_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ), ZERO_INTEGER, ConsesLow
                                                                  .list( constant_handles.reader_make_constant_shell( makeString( "HourFn" ) ), ZERO_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                      makeString( "DayFn" ) ), ONE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles
                                                                          .reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ),
                                                                              makeInteger( 2012 ) ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SecondFn" ) ), makeInteger( 35 ),
                                                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ), ZERO_INTEGER, ConsesLow.list( constant_handles
                                                                                      .reader_make_constant_shell( makeString( "HourFn" ) ), ZERO_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                          makeString( "DayFn" ) ), ONE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ),
                                                                                              constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list( constant_handles
                                                                                                  .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2012 ) ) ) ) ) ) ) ) ), T ), ConsesLow.list( ConsesLow
                                                                                                      .list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ),
                                                                                                          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SecondFn" ) ), makeInteger( 23 ),
                                                                                                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ), makeInteger( 23 ),
                                                                                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "HourFn" ) ), THREE_INTEGER,
                                                                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), TWO_INTEGER,
                                                                                                                          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ),
                                                                                                                              constant_handles.reader_make_constant_shell( makeString( "November" ) ), ConsesLow.list(
                                                                                                                                  constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                                                                                                                                      1999 ) ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                          makeString( "YearFn" ) ), makeInteger( 2012 ) ) ) ), T ), ConsesLow.list(
                                                                                                                                              ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                                  makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list(
                                                                                                                                                      constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                          "SecondFn" ) ), NINE_INTEGER, ConsesLow.list( constant_handles
                                                                                                                                                              .reader_make_constant_shell( makeString( "MinuteFn" ) ),
                                                                                                                                                              NINE_INTEGER, ConsesLow.list( constant_handles
                                                                                                                                                                  .reader_make_constant_shell( makeString( "HourFn" ) ),
                                                                                                                                                                  THREE_INTEGER, ConsesLow.list( constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString( "DayFn" ) ),
                                                                                                                                                                      THREE_INTEGER, ConsesLow.list( constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "MonthFn" ) ), constant_handles
                                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                                      "November" ) ), ConsesLow.list(
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString( "YearFn" ) ),
                                                                                                                                                                                          makeInteger( 2012 ) ) ) ) ) ) ),
                                                                                                                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                      "MonthFn" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                                                          makeString( "December" ) ), ConsesLow.list( constant_handles
                                                                                                                                                              .reader_make_constant_shell( makeString( "YearFn" ) ),
                                                                                                                                                              makeInteger( 2012 ) ) ) ) ), T ), ConsesLow.list( ConsesLow
                                                                                                                                                                  .list( ConsesLow.list( constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString(
                                                                                                                                                                          "TimeIntervalInclusiveFn" ) ), ConsesLow.list(
                                                                                                                                                                              constant_handles.reader_make_constant_shell(
                                                                                                                                                                                  makeString( "SecondFn" ) ), NINE_INTEGER,
                                                                                                                                                                              ConsesLow.list( constant_handles
                                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                                      "MinuteFn" ) ), NINE_INTEGER,
                                                                                                                                                                                  ConsesLow.list( constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "HourFn" ) ),
                                                                                                                                                                                      THREE_INTEGER, ConsesLow.list(
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString( "DayFn" ) ),
                                                                                                                                                                                          THREE_INTEGER, ConsesLow.list(
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "MonthFn" ) ),
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "December" ) ),
                                                                                                                                                                                              ConsesLow.list(
                                                                                                                                                                                                  constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "YearFn" ) ),
                                                                                                                                                                                                  makeInteger(
                                                                                                                                                                                                      2012 ) ) ) ) ) ) ),
                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "DayFn" ) ), makeInteger( 31 ), ConsesLow
                                                                                                                                                                                  .list( constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "MonthFn" ) ),
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "December" ) ),
                                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "YearFn" ) ),
                                                                                                                                                                                          makeInteger( 2012 ) ) ) ) ) ),
                                                                                                                                                                  T ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                                                                                                      constant_handles.reader_make_constant_shell(
                                                                                                                                                                          makeString( "TimeIntervalInclusiveFn" ) ),
                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "SecondFn" ) ), NINE_INTEGER, ConsesLow.list(
                                                                                                                                                                                  constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "MinuteFn" ) ),
                                                                                                                                                                                  NINE_INTEGER, ConsesLow.list(
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "HourFn" ) ),
                                                                                                                                                                                      THREE_INTEGER, ConsesLow.list(
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString( "DayFn" ) ),
                                                                                                                                                                                          makeInteger( 31 ), ConsesLow.list(
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "MonthFn" ) ),
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "December" ) ),
                                                                                                                                                                                              ConsesLow.list(
                                                                                                                                                                                                  constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "YearFn" ) ),
                                                                                                                                                                                                  makeInteger(
                                                                                                                                                                                                      2012 ) ) ) ) ) ) ),
                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "HourFn" ) ), makeInteger( 23 ), ConsesLow
                                                                                                                                                                                  .list( constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "DayFn" ) ),
                                                                                                                                                                                      makeInteger( 31 ), ConsesLow.list(
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString( "MonthFn" ) ),
                                                                                                                                                                                          constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "December" ) ),
                                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString( "YearFn" ) ),
                                                                                                                                                                                              makeInteger(
                                                                                                                                                                                                  2012 ) ) ) ) ) ) ), T ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "SecondFn" ) ), NINE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ), NINE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
              "HourFn" ) ), makeInteger( 23 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                  makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                      2012 ) ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ), makeInteger( 59 ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                          makeString( "HourFn" ) ), makeInteger( 23 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list( constant_handles
                              .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                  makeString( "YearFn" ) ), makeInteger( 2012 ) ) ) ) ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                      "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SecondFn" ) ), NINE_INTEGER, ConsesLow.list( constant_handles
                                          .reader_make_constant_shell( makeString( "MinuteFn" ) ), makeInteger( 59 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "HourFn" ) ), makeInteger(
                                              23 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                  makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                      makeString( "YearFn" ) ), makeInteger( 2012 ) ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SecondFn" ) ), makeInteger( 59 ),
                                                          ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ), makeInteger( 59 ), ConsesLow.list( constant_handles
                                                              .reader_make_constant_shell( makeString( "HourFn" ) ), makeInteger( 23 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                  "DayFn" ) ), makeInteger( 31 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles
                                                                      .reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ),
                                                                          makeInteger( 2012 ) ) ) ) ) ) ) ) ), T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                              "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2012 ) ),
                                                                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SecondFn" ) ), makeInteger( 35 ), ConsesLow.list( constant_handles
                                                                                  .reader_make_constant_shell( makeString( "MinuteFn" ) ), FOURTEEN_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                      makeString( "HourFn" ) ), THIRTEEN_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ),
                                                                                          FIVE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles
                                                                                              .reader_make_constant_shell( makeString( "February" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                  makeString( "YearFn" ) ), makeInteger( 2012 ) ) ) ) ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                                      constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list(
                                                                                                          constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles
                                                                                                              .reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list( constant_handles
                                                                                                                  .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2012 ) ) ), ConsesLow.list(
                                                                                                                      constant_handles.reader_make_constant_shell( makeString( "SecondFn" ) ), makeInteger( 35 ), ConsesLow
                                                                                                                          .list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ), FOURTEEN_INTEGER,
                                                                                                                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "HourFn" ) ),
                                                                                                                                  THIRTEEN_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                      "DayFn" ) ), FIVE_INTEGER, ConsesLow.list( constant_handles
                                                                                                                                          .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles
                                                                                                                                              .reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list(
                                                                                                                                                  constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ),
                                                                                                                                                  makeInteger( 2012 ) ) ) ) ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow
                                                                                                                                                      .list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                                          makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list(
                                                                                                                                                              constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                                  "DayFn" ) ), ONE_INTEGER, ConsesLow.list( constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString(
                                                                                                                                                                          "MonthFn" ) ), constant_handles
                                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                                  "January" ) ), ConsesLow.list(
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "YearFn" ) ),
                                                                                                                                                                                      makeInteger( 2012 ) ) ) ), ConsesLow
                                                                                                                                                                                          .list( constant_handles
                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                      "SecondFn" ) ),
                                                                                                                                                                                              makeInteger( 35 ), ConsesLow
                                                                                                                                                                                                  .list( constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "MinuteFn" ) ),
                                                                                                                                                                                                      FOURTEEN_INTEGER,
                                                                                                                                                                                                      ConsesLow.list(
                                                                                                                                                                                                          constant_handles
                                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                                      "HourFn" ) ),
                                                                                                                                                                                                          THIRTEEN_INTEGER,
                                                                                                                                                                                                          ConsesLow.list(
                                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                                          "DayFn" ) ),
                                                                                                                                                                                                              ONE_INTEGER,
                                                                                                                                                                                                              ConsesLow
                                                                                                                                                                                                                  .list(
                                                                                                                                                                                                                      constant_handles
                                                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                                                              makeString(
                                                                                                                                                                                                                                  "MonthFn" ) ),
                                                                                                                                                                                                                      constant_handles
                                                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                                                              makeString(
                                                                                                                                                                                                                                  "January" ) ),
                                                                                                                                                                                                                      ConsesLow
                                                                                                                                                                                                                          .list(
                                                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                                                          "YearFn" ) ),
                                                                                                                                                                                                                              makeInteger(
                                                                                                                                                                                                                                  2012 ) ) ) ) ) ) ) ) ),
                                                                                                                                                      NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                                                                                          constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                              "TimeIntervalInclusiveFn" ) ), ConsesLow.list(
                                                                                                                                                                  constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                                      "HourFn" ) ), ZERO_INTEGER, ConsesLow.list(
                                                                                                                                                                          constant_handles.reader_make_constant_shell(
                                                                                                                                                                              makeString( "DayFn" ) ), ONE_INTEGER,
                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                                  "MonthFn" ) ), constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "January" ) ),
                                                                                                                                                                              ConsesLow.list( constant_handles
                                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                                      "YearFn" ) ), makeInteger(
                                                                                                                                                                                          2012 ) ) ) ) ), ConsesLow.list(
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "SecondFn" ) ),
                                                                                                                                                                                              makeInteger( 35 ), ConsesLow
                                                                                                                                                                                                  .list( constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "MinuteFn" ) ),
                                                                                                                                                                                                      FOURTEEN_INTEGER,
                                                                                                                                                                                                      ConsesLow.list(
                                                                                                                                                                                                          constant_handles
                                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                                      "HourFn" ) ),
                                                                                                                                                                                                          ZERO_INTEGER,
                                                                                                                                                                                                          ConsesLow.list(
                                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                                          "DayFn" ) ),
                                                                                                                                                                                                              ONE_INTEGER,
                                                                                                                                                                                                              ConsesLow
                                                                                                                                                                                                                  .list(
                                                                                                                                                                                                                      constant_handles
                                                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                                                              makeString(
                                                                                                                                                                                                                                  "MonthFn" ) ),
                                                                                                                                                                                                                      constant_handles
                                                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                                                              makeString(
                                                                                                                                                                                                                                  "January" ) ),
                                                                                                                                                                                                                      ConsesLow
                                                                                                                                                                                                                          .list(
                                                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                                                          "YearFn" ) ),
                                                                                                                                                                                                                              makeInteger(
                                                                                                                                                                                                                                  2012 ) ) ) ) ) ) ) ) ),
                                                                                                                                                          NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                                                                                              constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                                  "TimeIntervalInclusiveFn" ) ), ConsesLow.list(
                                                                                                                                                                      constant_handles.reader_make_constant_shell(
                                                                                                                                                                          makeString( "MinuteFn" ) ), ZERO_INTEGER,
                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "HourFn" ) ), ZERO_INTEGER, ConsesLow.list(
                                                                                                                                                                                  constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "DayFn" ) ),
                                                                                                                                                                                  ONE_INTEGER, ConsesLow.list(
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "MonthFn" ) ),
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "January" ) ),
                                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "YearFn" ) ),
                                                                                                                                                                                          makeInteger( 2012 ) ) ) ) ) ),
                                                                                                                                                              ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                                                  makeString( "SecondFn" ) ), makeInteger( 35 ), ConsesLow
                                                                                                                                                                      .list( constant_handles.reader_make_constant_shell(
                                                                                                                                                                          makeString( "MinuteFn" ) ), ZERO_INTEGER,
                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                                  "HourFn" ) ), ZERO_INTEGER, ConsesLow
                                                                                                                                                                                      .list( constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "DayFn" ) ),
                                                                                                                                                                                          ONE_INTEGER, ConsesLow.list(
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "MonthFn" ) ),
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "January" ) ),
                                                                                                                                                                                              ConsesLow.list(
                                                                                                                                                                                                  constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "YearFn" ) ),
                                                                                                                                                                                                  makeInteger(
                                                                                                                                                                                                      2012 ) ) ) ) ) ) ) ) ),
                                                                                                                                                              NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                                                                                                  constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                                      "TimeIntervalInclusiveFn" ) ), ConsesLow.list(
                                                                                                                                                                          constant_handles.reader_make_constant_shell(
                                                                                                                                                                              makeString( "SecondFn" ) ), NINE_INTEGER,
                                                                                                                                                                          ConsesLow.list( constant_handles
                                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                                  "MinuteFn" ) ), NINE_INTEGER, ConsesLow
                                                                                                                                                                                      .list( constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "HourFn" ) ),
                                                                                                                                                                                          THREE_INTEGER, ConsesLow.list(
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "DayFn" ) ),
                                                                                                                                                                                              THREE_INTEGER, ConsesLow.list(
                                                                                                                                                                                                  constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "MonthFn" ) ),
                                                                                                                                                                                                  constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "November" ) ),
                                                                                                                                                                                                  ConsesLow.list(
                                                                                                                                                                                                      constant_handles
                                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                                              makeString(
                                                                                                                                                                                                                  "YearFn" ) ),
                                                                                                                                                                                                      makeInteger(
                                                                                                                                                                                                          2012 ) ) ) ) ) ) ),
                                                                                                                                                                  ConsesLow.list( constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString( "YearFn" ) ),
                                                                                                                                                                      makeInteger( 2012 ) ) ) ), NIL ), ConsesLow.list(
                                                                                                                                                                          ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                                  "TimeIntervalInclusiveFn" ) ), ConsesLow
                                                                                                                                                                                      .list( constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "SecondFn" ) ),
                                                                                                                                                                                          NINE_INTEGER, ConsesLow.list(
                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                          "MinuteFn" ) ),
                                                                                                                                                                                              NINE_INTEGER, ConsesLow.list(
                                                                                                                                                                                                  constant_handles
                                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                                          makeString(
                                                                                                                                                                                                              "HourFn" ) ),
                                                                                                                                                                                                  THREE_INTEGER, ConsesLow
                                                                                                                                                                                                      .list(
                                                                                                                                                                                                          constant_handles
                                                                                                                                                                                                              .reader_make_constant_shell(
                                                                                                                                                                                                                  makeString(
                                                                                                                                                                                                                      "DayFn" ) ),
                                                                                                                                                                                                          THREE_INTEGER,
                                                                                                                                                                                                          ConsesLow.list(
                                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                                          "MonthFn" ) ),
                                                                                                                                                                                                              constant_handles
                                                                                                                                                                                                                  .reader_make_constant_shell(
                                                                                                                                                                                                                      makeString(
                                                                                                                                                                                                                          "December" ) ),
                                                                                                                                                                                                              ConsesLow
                                                                                                                                                                                                                  .list(
                                                                                                                                                                                                                      constant_handles
                                                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                                                              makeString(
                                                                                                                                                                                                                                  "YearFn" ) ),
                                                                                                                                                                                                                      makeInteger(
                                                                                                                                                                                                                          2012 ) ) ) ) ) ) ),
                                                                                                                                                                              ConsesLow.list( constant_handles
                                                                                                                                                                                  .reader_make_constant_shell( makeString(
                                                                                                                                                                                      "MonthFn" ) ), constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "December" ) ),
                                                                                                                                                                                  ConsesLow.list( constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "YearFn" ) ),
                                                                                                                                                                                      makeInteger( 2012 ) ) ) ) ), NIL ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "SecondFn" ) ), NINE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ), NINE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
              "HourFn" ) ), THREE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                      2012 ) ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                          "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                              2012 ) ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list(
                                  constant_handles.reader_make_constant_shell( makeString( "SecondFn" ) ), NINE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ),
                                      NINE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "HourFn" ) ), makeInteger( 23 ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                          makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell(
                                              makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2012 ) ) ) ) ) ) ), ConsesLow.list(
                                                  constant_handles.reader_make_constant_shell( makeString( "HourFn" ) ), makeInteger( 23 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                      "DayFn" ) ), makeInteger( 31 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell(
                                                          makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2012 ) ) ) ) ) ) ), NIL ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "SecondFn" ) ), NINE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ), makeInteger( 59 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
              "HourFn" ) ), makeInteger( 23 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                  makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                      2012 ) ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ), makeInteger( 59 ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                          makeString( "HourFn" ) ), makeInteger( 23 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list( constant_handles
                              .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                  makeString( "YearFn" ) ), makeInteger( 2012 ) ) ) ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                      "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2012 ) ), ConsesLow.list( constant_handles
                                          .reader_make_constant_shell( makeString( "SecondFn" ) ), makeInteger( 35 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ),
                                              FOURTEEN_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "HourFn" ) ), THIRTEEN_INTEGER, ConsesLow.list( constant_handles
                                                  .reader_make_constant_shell( makeString( "DayFn" ) ), FIVE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ),
                                                      constant_handles.reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ),
                                                          makeInteger( 2012 ) ) ) ) ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                              "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles
                                                                  .reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ),
                                                                      makeInteger( 2012 ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SecondFn" ) ), makeInteger( 35 ), ConsesLow.list(
                                                                          constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ), FOURTEEN_INTEGER, ConsesLow.list( constant_handles
                                                                              .reader_make_constant_shell( makeString( "HourFn" ) ), THIRTEEN_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                  makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ),
                                                                                      constant_handles.reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                          makeString( "YearFn" ) ), makeInteger( 2012 ) ) ) ) ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                                                              constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles
                                                                                                  .reader_make_constant_shell( makeString( "DayFn" ) ), ONE_INTEGER, ConsesLow.list( constant_handles
                                                                                                      .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                          "January" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                                                                                                              2012 ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SecondFn" ) ),
                                                                                                                  makeInteger( 35 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                      "MinuteFn" ) ), FOURTEEN_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                          makeString( "HourFn" ) ), makeInteger( 23 ), ConsesLow.list( constant_handles
                                                                                                                              .reader_make_constant_shell( makeString( "DayFn" ) ), ONE_INTEGER, ConsesLow.list(
                                                                                                                                  constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles
                                                                                                                                      .reader_make_constant_shell( makeString( "January" ) ), ConsesLow.list(
                                                                                                                                          constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ),
                                                                                                                                          makeInteger( 2012 ) ) ) ) ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list(
                                                                                                                                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                  "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles
                                                                                                                                                      .reader_make_constant_shell( makeString( "HourFn" ) ), ZERO_INTEGER,
                                                                                                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                                          makeString( "DayFn" ) ), ONE_INTEGER, ConsesLow.list(
                                                                                                                                                              constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                                  "MonthFn" ) ), constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString(
                                                                                                                                                                          "January" ) ), ConsesLow.list( constant_handles
                                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                                  "YearFn" ) ), makeInteger( 2012 ) ) ) ) ),
                                                                                                                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                      "SecondFn" ) ), makeInteger( 35 ), ConsesLow.list( constant_handles
                                                                                                                                                          .reader_make_constant_shell( makeString( "MinuteFn" ) ),
                                                                                                                                                          makeInteger( 59 ), ConsesLow.list( constant_handles
                                                                                                                                                              .reader_make_constant_shell( makeString( "HourFn" ) ),
                                                                                                                                                              ZERO_INTEGER, ConsesLow.list( constant_handles
                                                                                                                                                                  .reader_make_constant_shell( makeString( "DayFn" ) ),
                                                                                                                                                                  ONE_INTEGER, ConsesLow.list( constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString(
                                                                                                                                                                          "MonthFn" ) ), constant_handles
                                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                                  "January" ) ), ConsesLow.list(
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "YearFn" ) ),
                                                                                                                                                                                      makeInteger( 2012 ) ) ) ) ) ) ) ) ),
                                                                                                                                              NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                                                  .reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ),
                                                                                                                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                      "MinuteFn" ) ), ZERO_INTEGER, ConsesLow.list( constant_handles
                                                                                                                                                          .reader_make_constant_shell( makeString( "HourFn" ) ),
                                                                                                                                                          ZERO_INTEGER, ConsesLow.list( constant_handles
                                                                                                                                                              .reader_make_constant_shell( makeString( "DayFn" ) ),
                                                                                                                                                              ONE_INTEGER, ConsesLow.list( constant_handles
                                                                                                                                                                  .reader_make_constant_shell( makeString( "MonthFn" ) ),
                                                                                                                                                                  constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                                      "January" ) ), ConsesLow.list( constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "YearFn" ) ), makeInteger( 2012 ) ) ) ) ) ),
                                                                                                                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                      "SecondFn" ) ), makeInteger( 59 ), ConsesLow.list( constant_handles
                                                                                                                                                          .reader_make_constant_shell( makeString( "MinuteFn" ) ),
                                                                                                                                                          ZERO_INTEGER, ConsesLow.list( constant_handles
                                                                                                                                                              .reader_make_constant_shell( makeString( "HourFn" ) ),
                                                                                                                                                              ZERO_INTEGER, ConsesLow.list( constant_handles
                                                                                                                                                                  .reader_make_constant_shell( makeString( "DayFn" ) ),
                                                                                                                                                                  ONE_INTEGER, ConsesLow.list( constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString(
                                                                                                                                                                          "MonthFn" ) ), constant_handles
                                                                                                                                                                              .reader_make_constant_shell( makeString(
                                                                                                                                                                                  "January" ) ), ConsesLow.list(
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "YearFn" ) ),
                                                                                                                                                                                      makeInteger( 2012 ) ) ) ) ) ) ) ) ),
                                                                                                                                                  NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                                                      .reader_make_constant_shell( makeString(
                                                                                                                                                          "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles
                                                                                                                                                              .reader_make_constant_shell( makeString( "SecondFn" ) ),
                                                                                                                                                              NINE_INTEGER, ConsesLow.list( constant_handles
                                                                                                                                                                  .reader_make_constant_shell( makeString( "MinuteFn" ) ),
                                                                                                                                                                  NINE_INTEGER, ConsesLow.list( constant_handles
                                                                                                                                                                      .reader_make_constant_shell( makeString( "HourFn" ) ),
                                                                                                                                                                      THREE_INTEGER, ConsesLow.list( constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "DayFn" ) ), THREE_INTEGER, ConsesLow.list(
                                                                                                                                                                                  constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "MonthFn" ) ),
                                                                                                                                                                                  constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "January" ) ),
                                                                                                                                                                                  ConsesLow.list( constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "YearFn" ) ),
                                                                                                                                                                                      makeInteger( 2012 ) ) ) ) ) ) ),
                                                                                                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                                          makeString( "YearFn" ) ), makeInteger( 2012 ) ) ) ), NIL ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "SecondFn" ) ), NINE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ), NINE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
              "HourFn" ) ), THREE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), ONE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                      2012 ) ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list(
                          constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2012 ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles
                              .reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SecondFn" ) ), NINE_INTEGER, ConsesLow.list(
                                  constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ), NINE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "HourFn" ) ),
                                      ZERO_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                          makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                              "YearFn" ) ), makeInteger( 2012 ) ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list(
                                                  constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list(
                                                      constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2012 ) ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                                                          constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                              "SecondFn" ) ), NINE_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ), ZERO_INTEGER, ConsesLow.list(
                                                                  constant_handles.reader_make_constant_shell( makeString( "HourFn" ) ), makeInteger( 23 ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                      makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles
                                                                          .reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ),
                                                                              makeInteger( 2012 ) ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "HourFn" ) ), makeInteger( 23 ),
                                                                                  ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list( constant_handles
                                                                                      .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "December" ) ),
                                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2012 ) ) ) ) ) ) ), NIL ),
      ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "SecondFn" ) ), ZERO_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ), makeInteger( 59 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
              "HourFn" ) ), makeInteger( 23 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                  makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                      2012 ) ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ), makeInteger( 59 ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                          makeString( "HourFn" ) ), makeInteger( 23 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 31 ), ConsesLow.list( constant_handles
                              .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                  makeString( "YearFn" ) ), makeInteger( 2012 ) ) ) ) ) ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                      "DecadeFn" ) ), makeInteger( 188 ) ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CenturyFn" ) ),
                                          TEN_INTEGER ) ), NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "QuarterFn" ) ), TWO_INTEGER, ConsesLow.list(
                                              constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 1999 ) ) ) ), NIL )
    } );
  }

  @Override
  public void declareFunctions()
  {
    declare_time_interval_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_time_interval_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_time_interval_utilities_file();
  }
  static
  {
    me = new time_interval_utilities();
    $const0$TimeIntervalInclusiveFn = constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) );
    $const1$TimeIntervalBetweenFn = constant_handles.reader_make_constant_shell( makeString( "TimeIntervalBetweenFn" ) );
    $const2$StartFn = constant_handles.reader_make_constant_shell( makeString( "StartFn" ) );
    $const3$EndFn = constant_handles.reader_make_constant_shell( makeString( "EndFn" ) );
    $const4$IntervalStartedByFn = constant_handles.reader_make_constant_shell( makeString( "IntervalStartedByFn" ) );
    $const5$IntervalEndedByFn = constant_handles.reader_make_constant_shell( makeString( "IntervalEndedByFn" ) );
    $const6$IntervalStartedByFn_Inclusive = constant_handles.reader_make_constant_shell( makeString( "IntervalStartedByFn-Inclusive" ) );
    $const7$IntervalEndedByFn_Inclusive = constant_handles.reader_make_constant_shell( makeString( "IntervalEndedByFn-Inclusive" ) );
    $const8$DateBeforeFn = constant_handles.reader_make_constant_shell( makeString( "DateBeforeFn" ) );
    $const9$DateAfterFn = constant_handles.reader_make_constant_shell( makeString( "DateAfterFn" ) );
    $const10$IntervalAfterFn = constant_handles.reader_make_constant_shell( makeString( "IntervalAfterFn" ) );
    $const11$IntervalBeforeFn = constant_handles.reader_make_constant_shell( makeString( "IntervalBeforeFn" ) );
    $const12$SomeTimeInIntervalFn = constant_handles.reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) );
    $sym13$SOME_TIME_INTERVAL_P = makeSymbol( "SOME-TIME-INTERVAL-P" );
    $int14$36 = makeInteger( 36 );
    $sym15$CYCL_INTERVAL_INITIAL_SECOND = makeSymbol( "CYCL-INTERVAL-INITIAL-SECOND" );
    $str16$_a_is_not_a_proper_time_interval_ = makeString( "~a is not a proper time interval." );
    $kw17$END = makeKeyword( "END" );
    $kw18$START = makeKeyword( "START" );
    $sym19$GUID_STRING_P = makeSymbol( "GUID-STRING-P" );
    $sym20$NULL = makeSymbol( "NULL" );
    $list21 = ConsesLow.list( makeSymbol( "START" ), makeSymbol( "END" ) );
    $list22 = ConsesLow.list( makeSymbol( "START" ), makeSymbol( "DURATION" ) );
    $list23 = ConsesLow.list( makeSymbol( "END" ), makeSymbol( "DURATION" ) );
    $list24 = ConsesLow.list( makeSymbol( "SUPER-INTERVAL" ), makeSymbol( "ID" ) );
    $const25$Always_TimeInterval = constant_handles.reader_make_constant_shell( makeString( "Always-TimeInterval" ) );
    $const26$ContinuousTimeInterval = constant_handles.reader_make_constant_shell( makeString( "ContinuousTimeInterval" ) );
    $const27$TheEmptyTimeInterval = constant_handles.reader_make_constant_shell( makeString( "TheEmptyTimeInterval" ) );
    $sym28$CONSTRUCT_REDUCED_CYCL_DATE = makeSymbol( "CONSTRUCT-REDUCED-CYCL-DATE" );
    $const29$Now = constant_handles.reader_make_constant_shell( makeString( "Now" ) );
    $list30 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "CalendarSecond" ) ), constant_handles.reader_make_constant_shell( makeString( "CalendarMinute" ) ),
      constant_handles.reader_make_constant_shell( makeString( "CalendarHour" ) ), constant_handles.reader_make_constant_shell( makeString( "CalendarDay" ) ), constant_handles.reader_make_constant_shell( makeString(
          "CalendarMonth" ) ), constant_handles.reader_make_constant_shell( makeString( "CalendarYear" ) ), constant_handles.reader_make_constant_shell( makeString( "CalendarWeek" ) ), constant_handles
              .reader_make_constant_shell( makeString( "CalendarQuarter" ) ), constant_handles.reader_make_constant_shell( makeString( "CalendarDecade" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "CalendarCentury" ) ), constant_handles.reader_make_constant_shell( makeString( "CalendarHalfCentury" ) ), constant_handles.reader_make_constant_shell( makeString( "CalendarMillennium" ) ),
      constant_handles.reader_make_constant_shell( makeString( "CalendarWorkWeek" ) ), constant_handles.reader_make_constant_shell( makeString( "CalendarWeekend" ) ), constant_handles.reader_make_constant_shell(
          makeString( "Weekday" ) )
    } );
    $const31$NthMetricallyPrecedingTimeInterva = constant_handles.reader_make_constant_shell( makeString( "NthMetricallyPrecedingTimeIntervalOfTypeFn" ) );
    $const32$NthMetricallySucceedingTimeInterv = constant_handles.reader_make_constant_shell( makeString( "NthMetricallySucceedingTimeIntervalOfTypeFn" ) );
    $str33$_a_not_a_date_interval_p = makeString( "~a not a date-interval-p" );
    $sym34$DURATION_FUNCTION_P = makeSymbol( "DURATION-FUNCTION-P" );
    $const35$TimePointsDuration = constant_handles.reader_make_constant_shell( makeString( "TimePointsDuration" ) );
    $sym36$DATE_INTERVAL_SUBSUMES_ = makeSymbol( "DATE-INTERVAL-SUBSUMES?" );
    $kw37$TEST = makeKeyword( "TEST" );
    $kw38$OWNER = makeKeyword( "OWNER" );
    $kw39$CLASSES = makeKeyword( "CLASSES" );
    $kw40$KB = makeKeyword( "KB" );
    $kw41$FULL = makeKeyword( "FULL" );
    $kw42$WORKING_ = makeKeyword( "WORKING?" );
    $list43 = ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ), makeInteger( 23 ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "HourFn" ) ), ELEVEN_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 27 ), ConsesLow.list( constant_handles
            .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "YearFn" ) ), makeInteger( 2009 ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SecondFn" ) ), makeInteger( 44 ), ConsesLow.list( constant_handles
                    .reader_make_constant_shell( makeString( "MinuteFn" ) ), makeInteger( 23 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "HourFn" ) ), ELEVEN_INTEGER, ConsesLow.list(
                        constant_handles.reader_make_constant_shell( makeString( "DayFn" ) ), makeInteger( 27 ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles
                            .reader_make_constant_shell( makeString( "December" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger( 2009 ) ) ) ) ) ) ) ), T ) );
    $sym44$CANONICALIZE_POSSIBLY_INDETERMINATE_TIME_INTERVAL_FN = makeSymbol( "CANONICALIZE-POSSIBLY-INDETERMINATE-TIME-INTERVAL-FN" );
    $sym45$INTERVAL_EQUAL_IGNORING_GUIDS = makeSymbol( "INTERVAL-EQUAL-IGNORING-GUIDS" );
    $list46 = _constant_46_initializer();
    $sym47$TEST_RECANONICALIZE_TIME_INTERVAL = makeSymbol( "TEST-RECANONICALIZE-TIME-INTERVAL" );
    $list48 = _constant_48_initializer();
  }
}
/*
 * 
 * Total time: 751 ms synthetic
 */