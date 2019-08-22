package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class temporal_projection_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me = new temporal_projection_utilities();
  public static final String myName = "com.cyc.cycjava.cycl.temporal_projection_utilities";
  public static final String myFingerPrint = "bb196d36bb9d98bd413a0c0eb435faf54bd16f17455e0d91028746cea18259bd";
  private static SubLSymbol $ignored_temporal_projection_functions$ = null;
  public static SubLSymbol $temporal_projection_distribution_predicate_list$ = null;
  private static final SubLList $list0 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "MiddlePartFn" ) ), constant_handles.reader_make_constant_shell( makeString(
      "SeasonFn" ) ), constant_handles.reader_make_constant_shell( makeString( "STIF" ) ), constant_handles.reader_make_constant_shell( makeString( "STIB" ) ), constant_handles.reader_make_constant_shell( makeString(
          "InstanceNamedFn" ) ), constant_handles.reader_make_constant_shell( makeString( "TemporalExtentFn" ) ), constant_handles.reader_make_constant_shell( makeString( "EarlyPartFn" ) ), constant_handles
              .reader_make_constant_shell( makeString( "SomeFn" ) ), constant_handles.reader_make_constant_shell( makeString( "EndingIntervalFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                  "InstanceNamedFn-Ternary" ) )
  } );
  private static final SubLList $list1 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "defaultConditionalProbabilityForSentenceInInterval" ) ), constant_handles.reader_make_constant_shell(
      makeString( "conditionalProbabilityForSentenceWhenTypeInArg" ) ), constant_handles.reader_make_constant_shell( makeString( "defaultConditionalProbabilityOfStateAfterIntervalOfLength" ) ) );
  private static final SubLObject $const2$not = constant_handles.reader_make_constant_shell( makeString( "not" ) );
  private static final SubLSymbol $kw3$FALSE = makeKeyword( "FALSE" );
  private static final SubLSymbol $kw4$TRUE = makeKeyword( "TRUE" );
  private static final SubLObject $const5$MtSpace = constant_handles.reader_make_constant_shell( makeString( "MtSpace" ) );
  private static final SubLObject $const6$MtTimeWithGranularityDimFn = constant_handles.reader_make_constant_shell( makeString( "MtTimeWithGranularityDimFn" ) );
  private static final SubLList $list7 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TimePoint" ) ) );
  private static final SubLString $str8$Justifications_not_in_proper_form = makeString( "Justifications not in proper format for time ~a ~a" );
  private static final SubLSymbol $kw9$FORWARD = makeKeyword( "FORWARD" );
  private static final SubLInteger $int10$100 = makeInteger( 100 );
  private static final SubLObject $const11$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
  private static final SubLObject $const12$TimeDependentCollection = constant_handles.reader_make_constant_shell( makeString( "TimeDependentCollection" ) );
  private static final SubLObject $const13$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
  private static final SubLSymbol $sym14$TRUE = makeSymbol( "TRUE" );
  private static final SubLSymbol $sym15$FALSE = makeSymbol( "FALSE" );
  private static final SubLSymbol $kw16$CODE = makeKeyword( "CODE" );
  private static final SubLList $list17 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "implies" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ist" ) ), makeSymbol( "?MT" ), makeSymbol( "?ASENT" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
          "temporalProjectionInterval" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ist" ) ), makeSymbol( "?MT" ), makeSymbol( "?ASENT" ) ), makeSymbol( "?WIDER-TIME" ) ) ), ConsesLow
              .list( constant_handles.reader_make_constant_shell( makeString( "liftTo" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MtTimeDimFn" ) ), makeSymbol( "?WIDER-TIME" ) ),
                  makeSymbol( "?ASENT" ) ) );
  private static final SubLObject $const18$YearsDuration = constant_handles.reader_make_constant_shell( makeString( "YearsDuration" ) );
  private static final SubLList $list19;
  private static final SubLInteger $int20$125 = makeInteger( 125 );
  private static final SubLObject $const21$NumericLikelihoodFn = constant_handles.reader_make_constant_shell( makeString( "NumericLikelihoodFn" ) );
  private static final SubLObject $const22$BiologicalLivingObject = constant_handles.reader_make_constant_shell( makeString( "BiologicalLivingObject" ) );
  private static final SubLObject $const23$conditionalProbabilityOfTerminati = constant_handles.reader_make_constant_shell( makeString( "conditionalProbabilityOfTerminationOfMembershipInCollectionWhenAgeInInterval" ) );
  private static final SubLFloat $float24$0_007 = makeDouble( 0.0070000000000000001D );
  private static final SubLFloat $float25$4_0e_4 = makeDouble( 0.00040000000000000002D );
  private static final SubLFloat $float26$3_0e_4 = makeDouble( 0.00029999999999999997D );
  private static final SubLFloat $float27$2_0e_4 = makeDouble( 0.00020000000000000001D );
  private static final SubLFloat $float28$1_0e_4 = makeDouble( 0.0001D );
  private static final SubLInteger $int29$25 = makeInteger( 25 );
  private static final SubLFloat $float30$0_001 = makeDouble( 0.001D );
  private static final SubLInteger $int31$30 = makeInteger( 30 );
  private static final SubLFloat $float32$0_0014 = makeDouble( 0.0014D );
  private static final SubLInteger $int33$35 = makeInteger( 35 );
  private static final SubLFloat $float34$0_0015 = makeDouble( 0.0015D );
  private static final SubLInteger $int35$40 = makeInteger( 40 );
  private static final SubLFloat $float36$0_0019 = makeDouble( 0.0019D );
  private static final SubLInteger $int37$45 = makeInteger( 45 );
  private static final SubLFloat $float38$0_0029 = makeDouble( 0.0028999999999999998D );
  private static final SubLInteger $int39$50 = makeInteger( 50 );
  private static final SubLFloat $float40$0_0042 = makeDouble( 0.0041999999999999997D );
  private static final SubLInteger $int41$55 = makeInteger( 55 );
  private static final SubLFloat $float42$0_0065 = makeDouble( 0.0064999999999999997D );
  private static final SubLInteger $int43$60 = makeInteger( 60 );
  private static final SubLFloat $float44$0_0094 = makeDouble( 0.0094000000000000004D );
  private static final SubLInteger $int45$65 = makeInteger( 65 );
  private static final SubLFloat $float46$0_015 = makeDouble( 0.014999999999999999D );
  private static final SubLInteger $int47$70 = makeInteger( 70 );
  private static final SubLFloat $float48$0_019 = makeDouble( 0.019D );
  private static final SubLInteger $int49$75 = makeInteger( 75 );
  private static final SubLFloat $float50$0_031 = makeDouble( 0.031D );
  private static final SubLInteger $int51$80 = makeInteger( 80 );
  private static final SubLFloat $float52$0_048 = makeDouble( 0.048000000000000001D );
  private static final SubLInteger $int53$85 = makeInteger( 85 );
  private static final SubLFloat $float54$0_086 = makeDouble( 0.085999999999999993D );
  private static final SubLInteger $int55$90 = makeInteger( 90 );
  private static final SubLFloat $float56$0_129 = makeDouble( 0.129D );
  private static final SubLInteger $int57$95 = makeInteger( 95 );
  private static final SubLFloat $float58$0_229 = makeDouble( 0.22900000000000001D );
  private static final SubLFloat $float59$0_31 = makeDouble( 0.31D );
  private static final SubLInteger $int60$105 = makeInteger( 105 );
  private static final SubLFloat $float61$0_41 = makeDouble( 0.40999999999999998D );
  private static final SubLInteger $int62$110 = makeInteger( 110 );
  private static final SubLFloat $float63$0_5 = makeDouble( 0.5D );
  private static final SubLInteger $int64$115 = makeInteger( 115 );
  private static final SubLFloat $float65$0_68 = makeDouble( 0.68000000000000005D );
  private static final SubLInteger $int66$120 = makeInteger( 120 );
  private static final SubLFloat $float67$0_82 = makeDouble( 0.81999999999999995D );
  private static final SubLFloat $float68$0_91 = makeDouble( 0.91000000000000003D );
  private static final SubLObject $const69$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
  private static final SubLList $list70 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "AnytimePSC" ) ) );
  private static final SubLObject $const71$assertionProducedByTemporalProjec = constant_handles.reader_make_constant_shell( makeString( "assertionProducedByTemporalProjectionModule" ) );
  private static final SubLObject $const72$BookkeepingMt = constant_handles.reader_make_constant_shell( makeString( "BookkeepingMt" ) );
  private static final SubLSymbol $kw73$GAF = makeKeyword( "GAF" );
  private static final SubLObject $const74$Now = constant_handles.reader_make_constant_shell( makeString( "Now" ) );
  private static final SubLObject $const75$TimeIntervalInclusiveFn = constant_handles.reader_make_constant_shell( makeString( "TimeIntervalInclusiveFn" ) );
  private static final SubLObject $const76$TimeInterval_Incl_Excl_Fn = constant_handles.reader_make_constant_shell( makeString( "TimeInterval-Incl-Excl-Fn" ) );
  private static final SubLObject $const77$TimeInterval_Excl_Incl_Fn = constant_handles.reader_make_constant_shell( makeString( "TimeInterval-Excl-Incl-Fn" ) );
  private static final SubLObject $const78$SomeTimeInIntervalFn = constant_handles.reader_make_constant_shell( makeString( "SomeTimeInIntervalFn" ) );
  private static final SubLObject $const79$IntervalStartedByFn = constant_handles.reader_make_constant_shell( makeString( "IntervalStartedByFn" ) );
  private static final SubLObject $const80$IntervalStartedByFn_Inclusive = constant_handles.reader_make_constant_shell( makeString( "IntervalStartedByFn-Inclusive" ) );
  private static final SubLObject $const81$YearBCE_JulianFn = constant_handles.reader_make_constant_shell( makeString( "YearBCE-JulianFn" ) );
  private static final SubLObject $const82$YearFn = constant_handles.reader_make_constant_shell( makeString( "YearFn" ) );
  private static final SubLObject $const83$IntervalEndedByFn = constant_handles.reader_make_constant_shell( makeString( "IntervalEndedByFn" ) );
  private static final SubLObject $const84$EndFn = constant_handles.reader_make_constant_shell( makeString( "EndFn" ) );
  private static final SubLObject $const85$TimeIntervalBetweenFn = constant_handles.reader_make_constant_shell( makeString( "TimeIntervalBetweenFn" ) );
  private static final SubLObject $const86$DayFn = constant_handles.reader_make_constant_shell( makeString( "DayFn" ) );
  private static final SubLObject $const87$MonthFn = constant_handles.reader_make_constant_shell( makeString( "MonthFn" ) );
  private static final SubLObject $const88$HourFn = constant_handles.reader_make_constant_shell( makeString( "HourFn" ) );
  private static final SubLObject $const89$MinuteFn = constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) );
  private static final SubLObject $const90$SecondFn = constant_handles.reader_make_constant_shell( makeString( "SecondFn" ) );
  private static final SubLObject $const91$DecadeFn = constant_handles.reader_make_constant_shell( makeString( "DecadeFn" ) );
  private static final SubLObject $const92$latitude = constant_handles.reader_make_constant_shell( makeString( "latitude" ) );
  private static final SubLObject $const93$TerritoryFn = constant_handles.reader_make_constant_shell( makeString( "TerritoryFn" ) );
  private static final SubLObject $const94$longitude = constant_handles.reader_make_constant_shell( makeString( "longitude" ) );
  private static final SubLFloat $float95$0_0174532925 = makeDouble( 0.017453292499999998D );
  private static final SubLFloat $float96$2451545_0009 = makeDouble( 2451545.0008999999D );
  private static final SubLInteger $int97$360 = makeInteger( 360 );
  private static final SubLInteger $int98$2451545 = makeInteger( 0x256859 );
  private static final SubLFloat $float99$8_999999999999999e_4 = makeDouble( 0.00089999999999999987D );
  private static final SubLFloat $float100$357_5291 = makeDouble( 357.52910000000003D );
  private static final SubLFloat $float101$0_98560028 = makeDouble( 0.98560028D );
  private static final SubLFloat $float102$1_9148 = makeDouble( 1.9148000000000001D );
  private static final SubLFloat $float103$0_02 = makeDouble( 0.02D );
  private static final SubLFloat $float104$102_9372 = makeDouble( 102.9372D );
  private static final SubLInteger $int105$180 = makeInteger( 180 );
  private static final SubLFloat $float106$0_39794863131 = makeDouble( 0.39794863131000002D );
  private static final SubLFloat $float107$_0_014485726139 = makeDouble( -0.014485726139D );
  private static final SubLFloat $float108$57_2957795 = makeDouble( 57.295779500000002D );
  private static final SubLFloat $float109$0_0053 = makeDouble( 0.0053D );
  private static final SubLFloat $float110$0_0069 = makeDouble( 0.0068999999999999999D );
  private static final SubLInteger $int111$86400 = makeInteger( 0x15180 );
  private static final SubLInteger $int112$3600 = makeInteger( 3600 );
  private static final SubLSymbol $sym113$_X = makeSymbol( "?X" );
  private static final SubLObject $const114$evaluate = constant_handles.reader_make_constant_shell( makeString( "evaluate" ) );
  private static final SubLObject $const115$DateAfterFn = constant_handles.reader_make_constant_shell( makeString( "DateAfterFn" ) );
  private static final SubLList $list116;
  private static final SubLInteger $int117$23 = makeInteger( 23 );
  private static final SubLInteger $int118$24 = makeInteger( 24 );
  private static final SubLObject $const119$DateBeforeFn = constant_handles.reader_make_constant_shell( makeString( "DateBeforeFn" ) );
  private static final SubLObject $const120$DayOfDateFn = constant_handles.reader_make_constant_shell( makeString( "DayOfDateFn" ) );
  private static final SubLObject $const121$laterThan = constant_handles.reader_make_constant_shell( makeString( "laterThan" ) );
  private static final SubLObject $const122$timeZoneOffsetToUTC = constant_handles.reader_make_constant_shell( makeString( "timeZoneOffsetToUTC" ) );
  private static final SubLObject $const123$TimeZoneFn = constant_handles.reader_make_constant_shell( makeString( "TimeZoneFn" ) );
  private static final SubLObject $const124$YearOfDateFn = constant_handles.reader_make_constant_shell( makeString( "YearOfDateFn" ) );
  private static final SubLObject $const125$DaylightSavingTimeZone = constant_handles.reader_make_constant_shell( makeString( "DaylightSavingTimeZone" ) );
  private static final SubLObject $const126$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
  private static final SubLList $list127 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?X" ), constant_handles.reader_make_constant_shell( makeString(
      "TimeZone" ) ) );
  private static final SubLObject $const128$geographicallySubsumes = constant_handles.reader_make_constant_shell( makeString( "geographicallySubsumes" ) );
  private static final SubLList $list129;
  private static final SubLList $list130 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "daylightSavingTimeStartsOnNthDayTypeInMonth" ) ), makeSymbol( "?X" ), makeSymbol( "?Y" ), makeSymbol(
      "?Z" ), makeSymbol( "?W" ) );
  private static final SubLSymbol $sym131$_Y = makeSymbol( "?Y" );
  private static final SubLSymbol $sym132$_Z = makeSymbol( "?Z" );
  private static final SubLSymbol $sym133$_W = makeSymbol( "?W" );
  private static final SubLInteger $int134$31 = makeInteger( 31 );
  private static final SubLList $list135 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "daylightSavingTimeEndsOnNthDayTypeInMonth" ) ), makeSymbol( "?X" ), makeSymbol( "?Y" ), makeSymbol(
      "?Z" ), makeSymbol( "?W" ) );
  private static final SubLObject $const136$properGeographicalSubRegions = constant_handles.reader_make_constant_shell( makeString( "properGeographicalSubRegions" ) );
  private static final SubLObject $const137$EuropeanSummerTimeZone = constant_handles.reader_make_constant_shell( makeString( "EuropeanSummerTimeZone" ) );
  private static final SubLObject $const138$October = constant_handles.reader_make_constant_shell( makeString( "October" ) );
  private static final SubLObject $const139$March = constant_handles.reader_make_constant_shell( makeString( "March" ) );
  private static final SubLObject $const140$Date = constant_handles.reader_make_constant_shell( makeString( "Date" ) );
  private static final SubLObject $const141$TimeZone = constant_handles.reader_make_constant_shell( makeString( "TimeZone" ) );
  private static final SubLSymbol $sym142$CYC_TIME_ZONE_CONVERSION = makeSymbol( "CYC-TIME-ZONE-CONVERSION" );
  private static final SubLObject $const143$DifferenceFn = constant_handles.reader_make_constant_shell( makeString( "DifferenceFn" ) );
  private static final SubLObject $const144$DateAfterDurationStartPreciseFn = constant_handles.reader_make_constant_shell( makeString( "DateAfterDurationStartPreciseFn" ) );
  private static final SubLObject $const145$Midday = constant_handles.reader_make_constant_shell( makeString( "Midday" ) );
  private static final SubLObject $const146$Morning = constant_handles.reader_make_constant_shell( makeString( "Morning" ) );
  private static final SubLObject $const147$Afternoon = constant_handles.reader_make_constant_shell( makeString( "Afternoon" ) );
  private static final SubLObject $const148$Evening = constant_handles.reader_make_constant_shell( makeString( "Evening" ) );
  private static final SubLObject $const149$Night = constant_handles.reader_make_constant_shell( makeString( "Night" ) );
  private static final SubLObject $const150$DaytimeHours = constant_handles.reader_make_constant_shell( makeString( "DaytimeHours" ) );
  private static final SubLObject $const151$Sunrise = constant_handles.reader_make_constant_shell( makeString( "Sunrise" ) );
  private static final SubLObject $const152$Sunset = constant_handles.reader_make_constant_shell( makeString( "Sunset" ) );
  private static final SubLObject $const153$Dawn = constant_handles.reader_make_constant_shell( makeString( "Dawn" ) );
  private static final SubLObject $const154$Twilight = constant_handles.reader_make_constant_shell( makeString( "Twilight" ) );
  private static final SubLObject $const155$Dusk = constant_handles.reader_make_constant_shell( makeString( "Dusk" ) );
  private static final SubLSymbol $sym156$_EXIT = makeSymbol( "%EXIT" );
  private static final SubLObject $const157$HoursDuration = constant_handles.reader_make_constant_shell( makeString( "HoursDuration" ) );
  private static final SubLObject $const158$hourNumberOfDate = constant_handles.reader_make_constant_shell( makeString( "hourNumberOfDate" ) );
  private static final SubLInteger $int159$21 = makeInteger( 21 );
  static
  {
    $list19 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "NumericLikelihoodFn" ) ), ONE_INTEGER );
    $list116 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DaysDuration" ) ), ONE_INTEGER ) );
    $list129 = ConsesLow.list( new SubLObject[] { makeKeyword( "RETURN" ), makeKeyword( "BINDINGS-AND-SUPPORTS" ), makeKeyword( "INFERENCE-MODE" ), makeKeyword( "MINIMAL" ), makeKeyword(
        "ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?" ), T, makeKeyword( "ALLOW-INDETERMINATE-RESULTS?" ), NIL, makeKeyword( "DISJUNCTION-FREE-EL-VARS-POLICY" ), makeKeyword( "COMPUTE-INTERSECTION" ), makeKeyword(
            "ADD-RESTRICTION-LAYER-OF-INDIRECTION?" ), T, makeKeyword( "COMPUTE-ANSWER-JUSTIFICATIONS?" ), T, makeKeyword( "MAX-NUMBER" ), TWO_INTEGER, makeKeyword( "MAX-TIME" ), TWO_INTEGER, makeKeyword(
                "MAX-TRANSFORMATION-DEPTH" ), ZERO_INTEGER, makeKeyword( "PROBABLY-APPROXIMATELY-DONE" ), makeDouble( 1.0D ), makeKeyword( "ANSWER-LANGUAGE" ), makeKeyword( "HL" ), makeKeyword( "CONTINUABLE?" ), T
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 1229L)
  public static SubLObject store_temporal_projection_results(final SubLObject formula_1, final SubLObject result_list, final SubLObject assertion, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( NIL == result_list )
    {
      return NIL;
    }
    SubLObject truth_value = NIL;
    SubLObject formula = NIL;
    final SubLObject code_support = get_code_rule_for_documentation();
    final SubLObject monad_mt = get_monad_mt( mt );
    if( cycl_utilities.formula_arg0( formula_1 ).eql( $const2$not ) )
    {
      truth_value = $kw3$FALSE;
      formula = cycl_utilities.formula_arg1( formula_1, UNPROVIDED );
    }
    else
    {
      truth_value = $kw4$TRUE;
      formula = formula_1;
    }
    SubLObject cdolist_list_var = result_list;
    SubLObject entry = NIL;
    entry = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject mt_time = cycl_utilities.formula_arg0( entry );
      final SubLObject justifications = ConsesLow.append( ConsesLow.list( assertion ), cycl_utilities.formula_arg1( entry, UNPROVIDED ), code_support );
      SubLObject likelihood = cycl_utilities.formula_arg2( entry, UNPROVIDED );
      final SubLObject output_mt = ConsesLow.list( $const5$MtSpace, monad_mt, ConsesLow.listS( $const6$MtTimeWithGranularityDimFn, mt_time, $list7 ) );
      if( NIL == arguments.hl_justification_p( justifications ) )
      {
        Errors.warn( $str8$Justifications_not_in_proper_form, mt_time, justifications );
      }
      if( NIL != arguments.hl_justification_p( justifications ) && NIL != hlmt.hlmtP( output_mt ) )
      {
        final SubLObject deduction_object = hl_storage_modules.hl_add_deduction_for_gaf( formula, truth_value, output_mt, justifications, $kw9$FORWARD );
        if( NIL != deduction_handles.deduction_p( deduction_object ) )
        {
          final SubLObject supported_object = deductions_high.deduction_supported_object( deduction_object );
          if( NIL != assertion_handles.assertion_p( supported_object ) && likelihood.isNumber() )
          {
            likelihood = Numbers.divide( Numbers.floor( Numbers.multiply( likelihood, $int10$100 ), UNPROVIDED ), $int10$100 );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      entry = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 2822L)
  public static SubLObject temporal_projection_quick_failP(final SubLObject assertion)
  {
    final SubLObject gaf = assertions_high.gaf_formula( assertion );
    final SubLObject predicate = cycl_utilities.formula_arg0( gaf );
    if( predicate.eql( $const11$isa ) )
    {
      final SubLObject col = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
      if( NIL == isa.isaP( col, $const12$TimeDependentCollection, UNPROVIDED, UNPROVIDED ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 3109L)
  public static SubLObject deduction_not_produced_by_temporal_projectionP(final SubLObject deduction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != deduction_handles.deduction_p( deduction ) )
    {
      thread.resetMultipleValues();
      final SubLObject gaf_supports = hl_supports.hl_justification_complete_backward_theory( deductions_high.deduction_supports( deduction ), $const13$BaseKB, $sym14$TRUE, $sym15$FALSE );
      final SubLObject v_hl_supports = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = v_hl_supports;
      SubLObject support = NIL;
      support = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( support.isList() && cycl_utilities.formula_arg0( support ).eql( $kw16$CODE ) && NIL != verify_temporal_projection_code_supportP( cycl_utilities.formula_arg1( support, UNPROVIDED ) ) )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        support = cdolist_list_var.first();
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 3621L)
  public static SubLObject verify_temporal_projection_code_supportP(final SubLObject x)
  {
    if( x.equal( $list17 ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 3913L)
  public static SubLObject get_code_rule_for_documentation()
  {
    return ConsesLow.list( arguments.make_hl_support( $kw16$CODE, $list17, $const13$BaseKB, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 4185L)
  public static SubLObject find_likelihood_of_survival_of_spec(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject entity = cycl_utilities.formula_arg1( fact, UNPROVIDED );
    final SubLObject starting_date = temporal_projection.find_known_or_expected_starting_date( entity );
    if( NIL == starting_date )
    {
      return NIL;
    }
    final SubLObject age = temporal_projection_cols.convert_to_unit( date_utilities.time_elapsed( mt_time, starting_date, UNPROVIDED ), $const18$YearsDuration );
    final SubLObject age_in_years = cycl_utilities.formula_arg1( age, UNPROVIDED );
    SubLObject prob = ONE_INTEGER;
    SubLObject justifications = NIL;
    final SubLObject all_relevant_distribution_facts = get_all_relevant_distributions_for_survival_of_entity( entity );
    SubLObject last_known_age = ZERO_INTEGER;
    thread.resetMultipleValues();
    final SubLObject last_known_time = find_the_latest_known_time_point_of_existence( entity );
    final SubLObject last_known_time_assertion = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != last_known_time )
    {
      last_known_age = cycl_utilities.formula_arg1( date_utilities.time_elapsed( last_known_time, starting_date, $const18$YearsDuration ), UNPROVIDED );
    }
    if( last_known_age.numG( age_in_years ) )
    {
      return Values.values( $list19, ConsesLow.list( last_known_time_assertion ) );
    }
    SubLObject count;
    SubLObject prob_of_death;
    SubLObject prob_of_death_assertion;
    for( count = NIL, count = ZERO_INTEGER; count.numL( $int20$125 ); count = Numbers.add( count, ONE_INTEGER ) )
    {
      if( count.numGE( last_known_age ) && count.numL( age_in_years ) )
      {
        thread.resetMultipleValues();
        prob_of_death = find_prob_of_termination_of_membership_at_age( count, all_relevant_distribution_facts );
        prob_of_death_assertion = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL == prob_of_death )
        {
          return NIL;
        }
        justifications = ConsesLow.append( justifications, ConsesLow.list( prob_of_death_assertion ) );
        prob = Numbers.multiply( prob, Numbers.subtract( ONE_INTEGER, prob_of_death ) );
        if( prob.numE( ZERO_INTEGER ) )
        {
          return Values.values( ConsesLow.list( $const21$NumericLikelihoodFn, prob ), justifications );
        }
      }
    }
    return Values.values( ConsesLow.list( $const21$NumericLikelihoodFn, prob ), justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 5706L)
  public static SubLObject find_prob_of_termination_of_membership_at_age(final SubLObject age, final SubLObject all_assertions)
  {
    SubLObject cdolist_list_var = all_assertions;
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject interval = cycl_utilities.formula_arg3( gaf, UNPROVIDED );
      if( age.numGE( cycl_utilities.formula_arg1( interval, UNPROVIDED ) ) && age.numL( cycl_utilities.formula_arg2( interval, UNPROVIDED ) ) )
      {
        return Values.values( cycl_utilities.formula_arg5( gaf, UNPROVIDED ), assertion );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 6044L)
  public static SubLObject get_all_relevant_distributions_for_survival_of_entity(final SubLObject en)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs( $const22$BiologicalLivingObject, $const23$conditionalProbabilityOfTerminati, UNPROVIDED, UNPROVIDED );
    SubLObject assertion = NIL;
    assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject gaf = assertions_high.gaf_formula( assertion );
      final SubLObject col = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
      if( NIL != Functions.funcall( makeSymbol( "ISA-IN-ANY-MT-MEMOIZED?" ), en, col ) )
      {
        result = ConsesLow.cons( assertion, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      assertion = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 6463L)
  public static SubLObject find_expected_survival_duration_at_age(final SubLObject age, final SubLObject upper)
  {
    SubLObject age_in_years = NIL;
    final SubLObject age_units = cycl_utilities.formula_arg0( age );
    final SubLObject age_value = cycl_utilities.formula_arg1( age, UNPROVIDED );
    SubLObject prob = ONE_INTEGER;
    if( age_units.eql( $const18$YearsDuration ) )
    {
      age_in_years = age_value;
    }
    else
    {
      age_in_years = quantities.convert_to_units( $const18$YearsDuration, age_units, age_value, UNPROVIDED );
    }
    SubLObject count;
    SubLObject current_age;
    SubLObject one_year_death_probability;
    for( count = NIL, count = ZERO_INTEGER; count.numL( $int20$125 ); count = Numbers.add( count, ONE_INTEGER ) )
    {
      current_age = Numbers.add( age_in_years, count );
      one_year_death_probability = one_year_death_probability_at_age( current_age );
      prob = Numbers.multiply( prob, Numbers.exp( Numbers.subtract( ZERO_INTEGER, one_year_death_probability ) ) );
      if( prob.numL( upper ) )
      {
        return ConsesLow.list( $const18$YearsDuration, current_age );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 7092L)
  public static SubLObject one_year_death_probability_at_age(final SubLObject age)
  {
    if( age.numE( ZERO_INTEGER ) )
    {
      return $float24$0_007;
    }
    if( age.numE( ONE_INTEGER ) )
    {
      return $float25$4_0e_4;
    }
    if( age.numE( TWO_INTEGER ) )
    {
      return $float26$3_0e_4;
    }
    if( age.numL( FIVE_INTEGER ) )
    {
      return $float27$2_0e_4;
    }
    if( age.numL( TEN_INTEGER ) )
    {
      return $float28$1_0e_4;
    }
    if( age.numL( FIFTEEN_INTEGER ) )
    {
      return $float25$4_0e_4;
    }
    if( age.numL( $int29$25 ) )
    {
      return $float30$0_001;
    }
    if( age.numL( $int31$30 ) )
    {
      return $float32$0_0014;
    }
    if( age.numL( $int33$35 ) )
    {
      return $float34$0_0015;
    }
    if( age.numL( $int35$40 ) )
    {
      return $float36$0_0019;
    }
    if( age.numL( $int37$45 ) )
    {
      return $float38$0_0029;
    }
    if( age.numL( $int39$50 ) )
    {
      return $float40$0_0042;
    }
    if( age.numL( $int41$55 ) )
    {
      return $float42$0_0065;
    }
    if( age.numL( $int43$60 ) )
    {
      return $float44$0_0094;
    }
    if( age.numL( $int45$65 ) )
    {
      return $float46$0_015;
    }
    if( age.numL( $int47$70 ) )
    {
      return $float48$0_019;
    }
    if( age.numL( $int49$75 ) )
    {
      return $float50$0_031;
    }
    if( age.numL( $int51$80 ) )
    {
      return $float52$0_048;
    }
    if( age.numL( $int53$85 ) )
    {
      return $float54$0_086;
    }
    if( age.numL( $int55$90 ) )
    {
      return $float56$0_129;
    }
    if( age.numL( $int57$95 ) )
    {
      return $float58$0_229;
    }
    if( age.numL( $int10$100 ) )
    {
      return $float59$0_31;
    }
    if( age.numL( $int60$105 ) )
    {
      return $float61$0_41;
    }
    if( age.numL( $int62$110 ) )
    {
      return $float63$0_5;
    }
    if( age.numL( $int64$115 ) )
    {
      return $float65$0_68;
    }
    if( age.numL( $int66$120 ) )
    {
      return $float67$0_82;
    }
    if( age.numL( $int20$125 ) )
    {
      return $float68$0_91;
    }
    return ONE_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 8169L)
  public static SubLObject possibly_get_nauts_from_narts(final SubLObject time)
  {
    if( NIL != nart_handles.nart_p( time ) )
    {
      return narts_high.nart_hl_formula( time );
    }
    return time;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 8316L)
  public static SubLObject get_monad_mt(final SubLObject mt)
  {
    if( !mt.isList() )
    {
      return mt;
    }
    if( cycl_utilities.formula_arg0( mt ).eql( $const5$MtSpace ) )
    {
      return cycl_utilities.formula_arg1( mt, UNPROVIDED );
    }
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 8474L)
  public static SubLObject mt_with_anytime_psc_time_parameter(final SubLObject mt)
  {
    if( mt.eql( $const69$EverythingPSC ) )
    {
      return mt;
    }
    if( mt.isList() && cycl_utilities.formula_arg0( mt ).eql( $const5$MtSpace ) )
    {
      return ConsesLow.listS( $const5$MtSpace, cycl_utilities.formula_arg1( mt, UNPROVIDED ), $list70 );
    }
    if( !mt.isList() )
    {
      return ConsesLow.listS( $const5$MtSpace, mt, $list70 );
    }
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 8783L)
  public static SubLObject assertion_produced_by_temporal_projectionP(final SubLObject assertion)
  {
    return kb_mapping_utilities.pred_value_gafs_in_relevant_mts( assertion, $const71$assertionProducedByTemporalProjec, $const72$BookkeepingMt, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 8974L)
  public static SubLObject format_justification_entry(final SubLObject entry)
  {
    if( NIL != assertion_handles.assertion_p( entry ) )
    {
      return ConsesLow.list( entry );
    }
    return entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 9098L)
  public static SubLObject find_the_latest_known_time_point_of_existence(final SubLObject entity)
  {
    SubLObject current_best_time = NIL;
    SubLObject current_best_assertion = NIL;
    final SubLObject pred_var = $const11$isa;
    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( entity, ONE_INTEGER, pred_var ) )
    {
      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( entity, ONE_INTEGER, pred_var );
      SubLObject done_var = NIL;
      final SubLObject token_var = NIL;
      while ( NIL == done_var)
      {
        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
        final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
        if( NIL != valid )
        {
          SubLObject final_index_iterator = NIL;
          try
          {
            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw73$GAF, NIL, NIL );
            SubLObject done_var_$1 = NIL;
            final SubLObject token_var_$2 = NIL;
            while ( NIL == done_var_$1)
            {
              final SubLObject assertion = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$2 );
              final SubLObject valid_$3 = makeBoolean( !token_var_$2.eql( assertion ) );
              if( NIL != valid_$3 )
              {
                final SubLObject gaf = assertions_high.gaf_formula( assertion );
                final SubLObject assertion_time = possibly_get_nauts_from_narts( temporal_projection.get_time_for_assertion_1( assertion ) );
                if( NIL != assertion_time )
                {
                  final SubLObject col_2 = cycl_utilities.formula_arg2( gaf, UNPROVIDED );
                  if( NIL != genls.genlP( col_2, $const22$BiologicalLivingObject, UNPROVIDED, UNPROVIDED ) )
                  {
                    final SubLObject last_time_point = find_last_point_of_time( assertion_time );
                    if( NIL != last_time_point )
                    {
                      if( NIL == current_best_time )
                      {
                        current_best_time = last_time_point;
                        current_best_assertion = assertion;
                      }
                      else if( !last_time_point.equal( current_best_time ) && NIL != date_utilities.later_than( last_time_point, current_best_time ) )
                      {
                        current_best_time = last_time_point;
                        current_best_assertion = assertion;
                      }
                    }
                  }
                }
              }
              done_var_$1 = makeBoolean( NIL == valid_$3 );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != final_index_iterator )
              {
                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
            }
          }
        }
        done_var = makeBoolean( NIL == valid );
      }
    }
    return Values.values( current_best_time, current_best_assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 10098L)
  public static SubLObject find_first_point_of_time(final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject function = cycl_utilities.formula_arg0( time );
    final SubLObject arg1 = cycl_utilities.formula_arg1( time, UNPROVIDED );
    if( NIL != nart_handles.nart_p( arg1 ) )
    {
      return NIL;
    }
    if( time.eql( $const74$Now ) )
    {
      return date_utilities.indexical_now();
    }
    if( !time.isList() )
    {
      return NIL;
    }
    if( NIL != conses_high.member( function, $ignored_temporal_projection_functions$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    if( function.eql( $const75$TimeIntervalInclusiveFn ) )
    {
      return find_first_point_of_time( arg1 );
    }
    if( function.eql( $const76$TimeInterval_Incl_Excl_Fn ) )
    {
      return find_first_point_of_time( arg1 );
    }
    if( function.eql( $const77$TimeInterval_Excl_Incl_Fn ) )
    {
      return find_first_point_of_time( arg1 );
    }
    if( function.eql( $const78$SomeTimeInIntervalFn ) )
    {
      return find_first_point_of_time( arg1 );
    }
    if( function.eql( $const79$IntervalStartedByFn ) || function.eql( $const80$IntervalStartedByFn_Inclusive ) )
    {
      return find_first_point_of_time( arg1 );
    }
    if( function.eql( $const81$YearBCE_JulianFn ) )
    {
      return ConsesLow.list( $const82$YearFn, Numbers.subtract( ZERO_INTEGER, arg1 ) );
    }
    if( function.eql( $const83$IntervalEndedByFn ) )
    {
      return NIL;
    }
    if( function.eql( $const84$EndFn ) )
    {
      return find_last_point_of_time( arg1 );
    }
    if( function.eql( $const85$TimeIntervalBetweenFn ) )
    {
      return find_first_point_of_time( arg1 );
    }
    if( function.eql( $const86$DayFn ) )
    {
      return time;
    }
    if( function.eql( $const87$MonthFn ) )
    {
      return time;
    }
    if( function.eql( $const82$YearFn ) )
    {
      return time;
    }
    if( function.eql( $const88$HourFn ) )
    {
      return time;
    }
    if( function.eql( $const89$MinuteFn ) )
    {
      return time;
    }
    if( function.eql( $const90$SecondFn ) )
    {
      return time;
    }
    if( function.eql( $const91$DecadeFn ) )
    {
      return time;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 11729L)
  public static SubLObject find_last_point_of_time(final SubLObject time)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject function = cycl_utilities.formula_arg0( time );
    final SubLObject arg1 = cycl_utilities.formula_arg1( time, UNPROVIDED );
    final SubLObject arg2 = cycl_utilities.formula_arg2( time, UNPROVIDED );
    if( time.eql( $const74$Now ) )
    {
      return date_utilities.indexical_now();
    }
    if( !time.isList() )
    {
      return NIL;
    }
    if( NIL != nart_handles.nart_p( arg2 ) )
    {
      return NIL;
    }
    if( NIL != conses_high.member( function, $ignored_temporal_projection_functions$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) )
    {
      return NIL;
    }
    if( function.eql( $const75$TimeIntervalInclusiveFn ) )
    {
      return find_last_point_of_time( cycl_utilities.formula_arg2( time, UNPROVIDED ) );
    }
    if( function.eql( $const76$TimeInterval_Incl_Excl_Fn ) )
    {
      return find_last_point_of_time( arg2 );
    }
    if( function.eql( $const77$TimeInterval_Excl_Incl_Fn ) )
    {
      return find_last_point_of_time( arg2 );
    }
    if( function.eql( $const78$SomeTimeInIntervalFn ) )
    {
      return find_last_point_of_time( cycl_utilities.formula_arg1( time, UNPROVIDED ) );
    }
    if( function.eql( $const83$IntervalEndedByFn ) )
    {
      return find_last_point_of_time( arg1 );
    }
    if( function.eql( $const84$EndFn ) )
    {
      return find_last_point_of_time( arg1 );
    }
    if( function.eql( $const81$YearBCE_JulianFn ) )
    {
      return ConsesLow.list( $const82$YearFn, Numbers.subtract( ZERO_INTEGER, arg1 ) );
    }
    if( cycl_utilities.formula_arg0( time ).eql( $const79$IntervalStartedByFn ) || cycl_utilities.formula_arg0( time ).eql( $const80$IntervalStartedByFn_Inclusive ) )
    {
      return NIL;
    }
    if( function.eql( $const85$TimeIntervalBetweenFn ) )
    {
      return find_last_point_of_time( cycl_utilities.formula_arg2( time, UNPROVIDED ) );
    }
    if( function.eql( $const86$DayFn ) )
    {
      return time;
    }
    if( function.eql( $const87$MonthFn ) )
    {
      return time;
    }
    if( function.eql( $const82$YearFn ) )
    {
      return time;
    }
    if( function.eql( $const88$HourFn ) )
    {
      return time;
    }
    if( function.eql( $const89$MinuteFn ) )
    {
      return time;
    }
    if( function.eql( $const90$SecondFn ) )
    {
      return time;
    }
    if( function.eql( $const91$DecadeFn ) )
    {
      return time;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 13438L)
  public static SubLObject sunrise_time_for_location(final SubLObject place, final SubLObject date, SubLObject time_zone)
  {
    if( time_zone == UNPROVIDED )
    {
      time_zone = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject latitude = get_latitude_of_place( place );
    thread.resetMultipleValues();
    final SubLObject offset = find_offset_for_location_on_date( place, date, time_zone );
    final SubLObject just = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject longitude = get_longitude_of_place( place );
    if( NIL != latitude && NIL != longitude && NIL != offset && NIL != date )
    {
      return Values.values( calculate_sunrise_time( latitude, longitude, date, offset ), just );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 13906L)
  public static SubLObject sunset_time_for_location(final SubLObject place, final SubLObject date, SubLObject time_zone)
  {
    if( time_zone == UNPROVIDED )
    {
      time_zone = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject latitude = get_latitude_of_place( place );
    thread.resetMultipleValues();
    final SubLObject offset = find_offset_for_location_on_date( place, date, time_zone );
    final SubLObject just = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject longitude = get_longitude_of_place( place );
    if( NIL != latitude && NIL != longitude && NIL != offset && NIL != date )
    {
      return Values.values( calculate_sunset_time( latitude, longitude, date, offset ), just );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 14316L)
  public static SubLObject dawn_time_for_location(final SubLObject place, final SubLObject date, SubLObject time_zone)
  {
    if( time_zone == UNPROVIDED )
    {
      time_zone = NIL;
    }
    final SubLObject latitude = get_latitude_of_place( place );
    final SubLObject offset = find_offset_for_location_on_date( place, date, time_zone );
    final SubLObject longitude = get_longitude_of_place( place );
    if( NIL != latitude && NIL != longitude && NIL != offset && NIL != date )
    {
      return calculate_dawn_time( latitude, longitude, date, offset );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 14694L)
  public static SubLObject dusk_time_for_location(final SubLObject place, final SubLObject date, SubLObject time_zone)
  {
    if( time_zone == UNPROVIDED )
    {
      time_zone = NIL;
    }
    final SubLObject latitude = get_latitude_of_place( place );
    final SubLObject offset = find_offset_for_location_on_date( place, date, time_zone );
    final SubLObject longitude = get_longitude_of_place( place );
    if( NIL != latitude && NIL != longitude && NIL != offset && NIL != date )
    {
      return calculate_dusk_time( latitude, longitude, date, offset );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 15073L)
  public static SubLObject get_latitude_of_place(final SubLObject place_1)
  {
    if( NIL != place_1 )
    {
      SubLObject place = NIL;
      if( place_1.isList() )
      {
        place = narts_high.find_nart( place_1 );
      }
      else
      {
        place = place_1;
      }
      if( NIL != place )
      {
        SubLObject assertion = cycl_utilities.formula_arg0( kb_mapping_utilities.pred_value_gafs_in_any_mt( place, $const92$latitude, ONE_INTEGER, UNPROVIDED ) );
        if( NIL == assertion )
        {
          assertion = use_territory_fn_to_get_information( place_1, $const92$latitude );
        }
        if( NIL != assertion )
        {
          final SubLObject gaf = assertions_high.gaf_formula( assertion );
          final SubLObject latitude = cycl_utilities.formula_arg1( cycl_utilities.formula_arg2( gaf, UNPROVIDED ), UNPROVIDED );
          return latitude;
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 15683L)
  public static SubLObject use_territory_fn_to_get_information(final SubLObject place, final SubLObject pred)
  {
    if( !place.isList() )
    {
      final SubLObject nart = narts_high.find_nart( ConsesLow.list( $const93$TerritoryFn, place ) );
      if( NIL != nart )
      {
        return cycl_utilities.formula_arg0( kb_mapping_utilities.pred_value_gafs_in_any_mt( nart, pred, ONE_INTEGER, UNPROVIDED ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 15925L)
  public static SubLObject get_longitude_of_place(final SubLObject place_1)
  {
    if( NIL != place_1 )
    {
      SubLObject place = NIL;
      if( place_1.isList() )
      {
        place = narts_high.find_nart( place_1 );
      }
      else
      {
        place = place_1;
      }
      if( NIL != place )
      {
        SubLObject assertion = cycl_utilities.formula_arg0( kb_mapping_utilities.pred_value_gafs_in_any_mt( place, $const94$longitude, ONE_INTEGER, UNPROVIDED ) );
        if( NIL == assertion )
        {
          assertion = use_territory_fn_to_get_information( place_1, $const94$longitude );
        }
        if( NIL != assertion )
        {
          final SubLObject gaf = assertions_high.gaf_formula( assertion );
          final SubLObject longitude = cycl_utilities.formula_arg1( cycl_utilities.formula_arg2( gaf, UNPROVIDED ), UNPROVIDED );
          return Numbers.subtract( ZERO_INTEGER, longitude );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 16521L)
  public static SubLObject calculate_sunset_time(final SubLObject latitude, final SubLObject longitude, final SubLObject date, final SubLObject offset)
  {
    final SubLObject universal_time = date_utilities.cycl_date_to_universal_time( date );
    final SubLObject latitude_in_radians = Numbers.multiply( $float95$0_0174532925, latitude );
    final SubLObject julian_date = numeric_date_utilities.get_julian_date( universal_time, UNPROVIDED );
    final SubLObject n_star = Numbers.subtract( Numbers.subtract( julian_date, $float96$2451545_0009 ), Numbers.divide( longitude, $int97$360 ) );
    final SubLObject n = Numbers.round( Numbers.add( n_star, $float63$0_5 ), UNPROVIDED );
    final SubLObject j_star = Numbers.add( $int98$2451545, Numbers.add( $float99$8_999999999999999e_4, Numbers.add( n, Numbers.divide( longitude, $int97$360 ) ) ) );
    final SubLObject m = Numbers.mod( Numbers.add( $float100$357_5291, Numbers.multiply( $float101$0_98560028, Numbers.subtract( j_star, $int98$2451545 ) ) ), $int97$360 );
    final SubLObject m_in_radians = Numbers.multiply( m, $float95$0_0174532925 );
    final SubLObject c = Numbers.add( Numbers.multiply( $float102$1_9148, Numbers.sin( m_in_radians ) ), Numbers.multiply( $float103$0_02, Numbers.sin( Numbers.multiply( TWO_INTEGER, m_in_radians ) ) ), Numbers.multiply(
        $float26$3_0e_4, Numbers.sin( Numbers.multiply( THREE_INTEGER, m_in_radians ) ) ) );
    final SubLObject lambda_value = Numbers.mod( Numbers.add( new SubLObject[] { m, $float104$102_9372, c, $int105$180
    } ), $int97$360 );
    final SubLObject lambda_in_radians = Numbers.multiply( lambda_value, $float95$0_0174532925 );
    final SubLObject delta = Numbers.asin( Numbers.multiply( Numbers.sin( lambda_in_radians ), $float106$0_39794863131 ) );
    final SubLObject sin_delta = Numbers.sin( delta );
    final SubLObject cos_delta = Numbers.cos( delta );
    final SubLObject cos_omega = Numbers.divide( Numbers.subtract( $float107$_0_014485726139, Numbers.multiply( Numbers.sin( latitude_in_radians ), sin_delta ) ), Numbers.multiply( Numbers.cos( latitude_in_radians ),
        cos_delta ) );
    if( cos_omega.numG( ONE_INTEGER ) || cos_omega.numL( MINUS_ONE_INTEGER ) )
    {
      return NIL;
    }
    final SubLObject omega_in_radians = Numbers.acos( cos_omega );
    final SubLObject omega_in_degrees = Numbers.multiply( omega_in_radians, $float108$57_2957795 );
    final SubLObject j_star_two = Numbers.add( $int98$2451545, Numbers.add( $float99$8_999999999999999e_4, Numbers.add( n, Numbers.divide( Numbers.add( omega_in_degrees, longitude ), $int97$360 ) ) ) );
    final SubLObject j_set = Numbers.add( j_star_two, Numbers.subtract( Numbers.multiply( $float109$0_0053, Numbers.sin( m_in_radians ) ), Numbers.multiply( $float110$0_0069, Numbers.sin( Numbers.multiply( TWO_INTEGER,
        lambda_in_radians ) ) ) ) );
    if( NIL != j_set )
    {
      final SubLObject no_of_seconds = Numbers.multiply( $int111$86400, Numbers.subtract( Numbers.add( j_set, $float63$0_5 ), Numbers.floor( j_set, UNPROVIDED ) ) );
      final SubLObject no_of_hours = Numbers.floor( Numbers.divide( no_of_seconds, $int112$3600 ), UNPROVIDED );
      final SubLObject no_of_minutes = Numbers.floor( Numbers.divide( Numbers.subtract( no_of_seconds, Numbers.multiply( no_of_hours, $int112$3600 ) ), $int43$60 ), UNPROVIDED );
      final SubLObject date_after_one_day = bindings.variable_lookup( $sym113$_X, cycl_utilities.formula_arg0( inference_kernel.new_cyc_query( ConsesLow.list( $const114$evaluate, $sym113$_X, ConsesLow.listS(
          $const115$DateAfterFn, date, $list116 ) ), UNPROVIDED, UNPROVIDED ) ) );
      if( NIL != no_of_hours && NIL != no_of_minutes && NIL != offset && no_of_hours.numG( $int117$23 ) )
      {
        return convert_offset( ConsesLow.list( $const89$MinuteFn, no_of_minutes, ConsesLow.list( $const88$HourFn, Numbers.subtract( no_of_hours, $int118$24 ), date_after_one_day ) ), offset, date );
      }
      if( NIL != no_of_hours && NIL != no_of_minutes && NIL != offset )
      {
        return convert_offset( ConsesLow.list( $const89$MinuteFn, no_of_minutes, ConsesLow.list( $const88$HourFn, no_of_hours, date ) ), offset, date );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 18838L)
  public static SubLObject calculate_dusk_time(final SubLObject latitude, final SubLObject longitude, final SubLObject date, final SubLObject offset)
  {
    final SubLObject universal_time = date_utilities.cycl_date_to_universal_time( date );
    final SubLObject latitude_in_radians = Numbers.multiply( $float95$0_0174532925, latitude );
    final SubLObject julian_date = numeric_date_utilities.get_julian_date( universal_time, UNPROVIDED );
    final SubLObject n_star = Numbers.subtract( Numbers.subtract( julian_date, $float96$2451545_0009 ), Numbers.divide( longitude, $int97$360 ) );
    final SubLObject n = Numbers.round( Numbers.add( n_star, $float63$0_5 ), UNPROVIDED );
    final SubLObject j_star = Numbers.add( $int98$2451545, Numbers.add( $float99$8_999999999999999e_4, Numbers.add( n, Numbers.divide( longitude, $int97$360 ) ) ) );
    final SubLObject m = Numbers.mod( Numbers.add( $float100$357_5291, Numbers.multiply( $float101$0_98560028, Numbers.subtract( j_star, $int98$2451545 ) ) ), $int97$360 );
    final SubLObject m_in_radians = Numbers.multiply( m, $float95$0_0174532925 );
    final SubLObject c = Numbers.add( Numbers.multiply( $float102$1_9148, Numbers.sin( m_in_radians ) ), Numbers.multiply( $float103$0_02, Numbers.sin( Numbers.multiply( TWO_INTEGER, m_in_radians ) ) ), Numbers.multiply(
        $float26$3_0e_4, Numbers.sin( Numbers.multiply( THREE_INTEGER, m_in_radians ) ) ) );
    final SubLObject lambda_value = Numbers.mod( Numbers.add( new SubLObject[] { m, $float104$102_9372, c, $int105$180
    } ), $int97$360 );
    final SubLObject lambda_in_radians = Numbers.multiply( lambda_value, $float95$0_0174532925 );
    final SubLObject delta = Numbers.asin( Numbers.multiply( Numbers.sin( lambda_in_radians ), $float106$0_39794863131 ) );
    final SubLObject sin_delta = Numbers.sin( delta );
    final SubLObject cos_delta = Numbers.cos( delta );
    final SubLObject cos_omega = Numbers.divide( Numbers.subtract( $float107$_0_014485726139, Numbers.multiply( Numbers.sin( latitude_in_radians ), sin_delta ) ), Numbers.multiply( Numbers.cos( latitude_in_radians ),
        cos_delta ) );
    if( cos_omega.numG( ONE_INTEGER ) || cos_omega.numL( MINUS_ONE_INTEGER ) )
    {
      return NIL;
    }
    final SubLObject omega_in_radians = Numbers.acos( cos_omega );
    final SubLObject omega_in_degrees = Numbers.multiply( omega_in_radians, $float108$57_2957795 );
    final SubLObject j_star_two = Numbers.add( $int98$2451545, Numbers.add( $float99$8_999999999999999e_4, Numbers.add( n, Numbers.divide( Numbers.add( omega_in_degrees, SIX_INTEGER, longitude ), $int97$360 ) ) ) );
    final SubLObject j_set = Numbers.add( j_star_two, Numbers.subtract( Numbers.multiply( $float109$0_0053, Numbers.sin( m_in_radians ) ), Numbers.multiply( $float110$0_0069, Numbers.sin( Numbers.multiply( TWO_INTEGER,
        lambda_in_radians ) ) ) ) );
    if( NIL != j_set )
    {
      final SubLObject no_of_seconds = Numbers.multiply( $int111$86400, Numbers.subtract( Numbers.add( j_set, $float63$0_5 ), Numbers.floor( j_set, UNPROVIDED ) ) );
      final SubLObject no_of_hours = Numbers.floor( Numbers.divide( no_of_seconds, $int112$3600 ), UNPROVIDED );
      final SubLObject no_of_minutes = Numbers.floor( Numbers.divide( Numbers.subtract( no_of_seconds, Numbers.multiply( no_of_hours, $int112$3600 ) ), $int43$60 ), UNPROVIDED );
      final SubLObject date_after_one_day = bindings.variable_lookup( $sym113$_X, cycl_utilities.formula_arg0( inference_kernel.new_cyc_query( ConsesLow.list( $const114$evaluate, $sym113$_X, ConsesLow.listS(
          $const115$DateAfterFn, date, $list116 ) ), UNPROVIDED, UNPROVIDED ) ) );
      if( NIL != no_of_hours && NIL != no_of_minutes && NIL != offset && no_of_hours.numG( $int117$23 ) )
      {
        return convert_offset( ConsesLow.list( $const89$MinuteFn, no_of_minutes, ConsesLow.list( $const88$HourFn, Numbers.subtract( no_of_hours, $int118$24 ), date_after_one_day ) ), offset, date );
      }
      if( NIL != no_of_hours && NIL != no_of_minutes && NIL != offset )
      {
        return convert_offset( ConsesLow.list( $const89$MinuteFn, no_of_minutes, ConsesLow.list( $const88$HourFn, no_of_hours, date ) ), offset, date );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 21154L)
  public static SubLObject calculate_sunrise_time(final SubLObject latitude, final SubLObject longitude, final SubLObject date, final SubLObject offset)
  {
    final SubLObject universal_time = date_utilities.cycl_date_to_universal_time( date );
    final SubLObject latitude_in_radians = Numbers.multiply( $float95$0_0174532925, latitude );
    final SubLObject julian_date = numeric_date_utilities.get_julian_date( universal_time, UNPROVIDED );
    final SubLObject n_star = Numbers.subtract( Numbers.subtract( julian_date, $float96$2451545_0009 ), Numbers.divide( longitude, $int97$360 ) );
    final SubLObject n = Numbers.round( Numbers.add( n_star, $float63$0_5 ), UNPROVIDED );
    final SubLObject j_star = Numbers.add( $int98$2451545, Numbers.add( $float99$8_999999999999999e_4, Numbers.add( n, Numbers.divide( longitude, $int97$360 ) ) ) );
    final SubLObject m = Numbers.mod( Numbers.add( $float100$357_5291, Numbers.multiply( $float101$0_98560028, Numbers.subtract( j_star, $int98$2451545 ) ) ), $int97$360 );
    final SubLObject m_in_radians = Numbers.multiply( m, $float95$0_0174532925 );
    final SubLObject c = Numbers.add( Numbers.multiply( $float102$1_9148, Numbers.sin( m_in_radians ) ), Numbers.multiply( $float103$0_02, Numbers.sin( Numbers.multiply( TWO_INTEGER, m_in_radians ) ) ), Numbers.multiply(
        $float26$3_0e_4, Numbers.sin( Numbers.multiply( THREE_INTEGER, m_in_radians ) ) ) );
    final SubLObject lambda_value = Numbers.mod( Numbers.add( new SubLObject[] { m, $float104$102_9372, c, $int105$180
    } ), $int97$360 );
    final SubLObject lambda_in_radians = Numbers.multiply( lambda_value, $float95$0_0174532925 );
    final SubLObject j_transit = Numbers.subtract( Numbers.add( j_star, Numbers.multiply( $float109$0_0053, Numbers.sin( m_in_radians ) ) ), Numbers.multiply( $float110$0_0069, Numbers.sin( Numbers.multiply( TWO_INTEGER,
        lambda_in_radians ) ) ) );
    final SubLObject delta = Numbers.asin( Numbers.multiply( Numbers.sin( lambda_in_radians ), $float106$0_39794863131 ) );
    final SubLObject sin_delta = Numbers.sin( delta );
    final SubLObject cos_delta = Numbers.cos( delta );
    final SubLObject cos_omega = Numbers.divide( Numbers.subtract( $float107$_0_014485726139, Numbers.multiply( Numbers.sin( latitude_in_radians ), sin_delta ) ), Numbers.multiply( Numbers.cos( latitude_in_radians ),
        cos_delta ) );
    if( cos_omega.numG( ONE_INTEGER ) || cos_omega.numL( MINUS_ONE_INTEGER ) )
    {
      return NIL;
    }
    final SubLObject omega_in_radians = Numbers.acos( cos_omega );
    final SubLObject omega_in_degrees = Numbers.multiply( omega_in_radians, $float108$57_2957795 );
    final SubLObject j_star_two = Numbers.add( $int98$2451545, Numbers.add( $float99$8_999999999999999e_4, Numbers.add( n, Numbers.divide( Numbers.add( omega_in_degrees, longitude ), $int97$360 ) ) ) );
    final SubLObject j_set = Numbers.add( j_star_two, Numbers.subtract( Numbers.multiply( $float109$0_0053, Numbers.sin( m_in_radians ) ), Numbers.multiply( $float110$0_0069, Numbers.sin( Numbers.multiply( TWO_INTEGER,
        lambda_in_radians ) ) ) ) );
    final SubLObject j_rise = Numbers.subtract( j_transit, Numbers.subtract( j_set, j_transit ) );
    if( NIL != j_rise )
    {
      final SubLObject no_of_seconds = Numbers.multiply( $int111$86400, Numbers.subtract( Numbers.add( j_rise, $float63$0_5 ), Numbers.floor( j_rise, UNPROVIDED ) ) );
      final SubLObject no_of_hours = Numbers.floor( Numbers.divide( no_of_seconds, $int112$3600 ), UNPROVIDED );
      final SubLObject no_of_minutes = Numbers.floor( Numbers.divide( Numbers.subtract( no_of_seconds, Numbers.multiply( no_of_hours, $int112$3600 ) ), $int43$60 ), UNPROVIDED );
      final SubLObject date_after_one_day = bindings.variable_lookup( $sym113$_X, cycl_utilities.formula_arg0( inference_kernel.new_cyc_query( ConsesLow.list( $const114$evaluate, $sym113$_X, ConsesLow.listS(
          $const115$DateAfterFn, date, $list116 ) ), UNPROVIDED, UNPROVIDED ) ) );
      if( NIL != no_of_hours && NIL != no_of_minutes && NIL != offset && no_of_hours.numG( $int117$23 ) )
      {
        return convert_offset( ConsesLow.list( $const89$MinuteFn, no_of_minutes, ConsesLow.list( $const88$HourFn, Numbers.subtract( no_of_hours, $int118$24 ), date_after_one_day ) ), offset, date );
      }
      if( NIL != no_of_hours && NIL != no_of_minutes && NIL != offset )
      {
        return convert_offset( ConsesLow.list( $const89$MinuteFn, no_of_minutes, ConsesLow.list( $const88$HourFn, no_of_hours, date ) ), offset, date );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 23564L)
  public static SubLObject calculate_dawn_time(final SubLObject latitude, final SubLObject longitude, final SubLObject date, final SubLObject offset)
  {
    final SubLObject universal_time = date_utilities.cycl_date_to_universal_time( date );
    final SubLObject latitude_in_radians = Numbers.multiply( $float95$0_0174532925, latitude );
    final SubLObject julian_date = numeric_date_utilities.get_julian_date( universal_time, UNPROVIDED );
    final SubLObject n_star = Numbers.subtract( Numbers.subtract( julian_date, $float96$2451545_0009 ), Numbers.divide( longitude, $int97$360 ) );
    final SubLObject n = Numbers.round( Numbers.add( n_star, $float63$0_5 ), UNPROVIDED );
    final SubLObject j_star = Numbers.add( $int98$2451545, Numbers.add( $float99$8_999999999999999e_4, Numbers.add( n, Numbers.divide( longitude, $int97$360 ) ) ) );
    final SubLObject m = Numbers.mod( Numbers.add( $float100$357_5291, Numbers.multiply( $float101$0_98560028, Numbers.subtract( j_star, $int98$2451545 ) ) ), $int97$360 );
    final SubLObject m_in_radians = Numbers.multiply( m, $float95$0_0174532925 );
    final SubLObject c = Numbers.add( Numbers.multiply( $float102$1_9148, Numbers.sin( m_in_radians ) ), Numbers.multiply( $float103$0_02, Numbers.sin( Numbers.multiply( TWO_INTEGER, m_in_radians ) ) ), Numbers.multiply(
        $float26$3_0e_4, Numbers.sin( Numbers.multiply( THREE_INTEGER, m_in_radians ) ) ) );
    final SubLObject lambda_value = Numbers.mod( Numbers.add( new SubLObject[] { m, $float104$102_9372, c, $int105$180
    } ), $int97$360 );
    final SubLObject lambda_in_radians = Numbers.multiply( lambda_value, $float95$0_0174532925 );
    final SubLObject j_transit = Numbers.subtract( Numbers.add( j_star, Numbers.multiply( $float109$0_0053, Numbers.sin( m_in_radians ) ) ), Numbers.multiply( $float110$0_0069, Numbers.sin( Numbers.multiply( TWO_INTEGER,
        lambda_in_radians ) ) ) );
    final SubLObject delta = Numbers.asin( Numbers.multiply( Numbers.sin( lambda_in_radians ), $float106$0_39794863131 ) );
    final SubLObject sin_delta = Numbers.sin( delta );
    final SubLObject cos_delta = Numbers.cos( delta );
    final SubLObject cos_omega = Numbers.divide( Numbers.subtract( $float107$_0_014485726139, Numbers.multiply( Numbers.sin( latitude_in_radians ), sin_delta ) ), Numbers.multiply( Numbers.cos( latitude_in_radians ),
        cos_delta ) );
    if( cos_omega.numG( ONE_INTEGER ) || cos_omega.numL( MINUS_ONE_INTEGER ) )
    {
      return NIL;
    }
    final SubLObject omega_in_radians = Numbers.acos( cos_omega );
    final SubLObject omega_in_degrees = Numbers.multiply( omega_in_radians, $float108$57_2957795 );
    final SubLObject j_star_two = Numbers.add( $int98$2451545, Numbers.add( $float99$8_999999999999999e_4, Numbers.add( n, Numbers.divide( Numbers.add( omega_in_degrees, SIX_INTEGER, longitude ), $int97$360 ) ) ) );
    final SubLObject j_set = Numbers.add( j_star_two, Numbers.subtract( Numbers.multiply( $float109$0_0053, Numbers.sin( m_in_radians ) ), Numbers.multiply( $float110$0_0069, Numbers.sin( Numbers.multiply( TWO_INTEGER,
        lambda_in_radians ) ) ) ) );
    final SubLObject j_rise = Numbers.subtract( j_transit, Numbers.subtract( j_set, j_transit ) );
    if( NIL != j_rise )
    {
      final SubLObject no_of_seconds = Numbers.multiply( $int111$86400, Numbers.subtract( Numbers.add( j_rise, $float63$0_5 ), Numbers.floor( j_rise, UNPROVIDED ) ) );
      final SubLObject no_of_hours = Numbers.floor( Numbers.divide( no_of_seconds, $int112$3600 ), UNPROVIDED );
      final SubLObject no_of_minutes = Numbers.floor( Numbers.divide( Numbers.subtract( no_of_seconds, Numbers.multiply( no_of_hours, $int112$3600 ) ), $int43$60 ), UNPROVIDED );
      final SubLObject date_after_one_day = bindings.variable_lookup( $sym113$_X, cycl_utilities.formula_arg0( inference_kernel.new_cyc_query( ConsesLow.list( $const114$evaluate, $sym113$_X, ConsesLow.listS(
          $const115$DateAfterFn, date, $list116 ) ), UNPROVIDED, UNPROVIDED ) ) );
      if( NIL != no_of_hours && NIL != no_of_minutes && NIL != offset && no_of_hours.numG( $int117$23 ) )
      {
        return convert_offset( ConsesLow.list( $const89$MinuteFn, no_of_minutes, ConsesLow.list( $const88$HourFn, Numbers.subtract( no_of_hours, $int118$24 ), date_after_one_day ) ), offset, date );
      }
      if( NIL != no_of_hours && NIL != no_of_minutes && NIL != offset )
      {
        return convert_offset( ConsesLow.list( $const89$MinuteFn, no_of_minutes, ConsesLow.list( $const88$HourFn, no_of_hours, date ) ), offset, date );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 25919L)
  public static SubLObject convert_offset(final SubLObject date, final SubLObject offset, final SubLObject initial_date)
  {
    final SubLObject v_answer = bindings.variable_lookup( $sym113$_X, cycl_utilities.formula_arg0( inference_kernel.new_cyc_query( ConsesLow.list( $const114$evaluate, $sym113$_X, ConsesLow.list( $const119$DateBeforeFn,
        date, offset ) ), UNPROVIDED, UNPROVIDED ) ) );
    final SubLObject day_of_date_of_answer = bindings.variable_lookup( $sym113$_X, cycl_utilities.formula_arg0( inference_kernel.new_cyc_query( ConsesLow.list( $const114$evaluate, $sym113$_X, ConsesLow.list(
        $const120$DayOfDateFn, v_answer ) ), UNPROVIDED, UNPROVIDED ) ) );
    final SubLObject day_of_initial_date = bindings.variable_lookup( $sym113$_X, cycl_utilities.formula_arg0( inference_kernel.new_cyc_query( ConsesLow.list( $const114$evaluate, $sym113$_X, ConsesLow.list(
        $const120$DayOfDateFn, initial_date ) ), UNPROVIDED, UNPROVIDED ) ) );
    final SubLObject time_elapsed = temporal_projection_cols.find_time_elapsed( day_of_initial_date, day_of_date_of_answer );
    if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const121$laterThan, day_of_date_of_answer, day_of_initial_date ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return bindings.variable_lookup( $sym113$_X, cycl_utilities.formula_arg0( inference_kernel.new_cyc_query( ConsesLow.list( $const114$evaluate, $sym113$_X, ConsesLow.list( $const119$DateBeforeFn, v_answer,
          time_elapsed ) ), UNPROVIDED, UNPROVIDED ) ) );
    }
    if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const121$laterThan, day_of_initial_date, day_of_date_of_answer ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return bindings.variable_lookup( $sym113$_X, cycl_utilities.formula_arg0( inference_kernel.new_cyc_query( ConsesLow.list( $const114$evaluate, $sym113$_X, ConsesLow.list( $const115$DateAfterFn, v_answer,
          time_elapsed ) ), UNPROVIDED, UNPROVIDED ) ) );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 26869L)
  public static SubLObject find_offset_for_location_on_date(final SubLObject place, final SubLObject date, SubLObject time_zone_1)
  {
    if( time_zone_1 == UNPROVIDED )
    {
      time_zone_1 = NIL;
    }
    SubLObject time_zone = NIL;
    if( NIL != time_zone_1 )
    {
      time_zone = time_zone_1;
    }
    else
    {
      time_zone = find_timezone_for_place_at_date( place, date );
    }
    if( NIL != time_zone )
    {
      final SubLObject assertion = cycl_utilities.formula_arg0( kb_mapping_utilities.pred_value_gafs_in_any_mt( time_zone, $const122$timeZoneOffsetToUTC, ONE_INTEGER, UNPROVIDED ) );
      if( NIL != assertion )
      {
        final SubLObject gaf = assertions_high.gaf_formula( assertion );
        return Values.values( cycl_utilities.formula_arg2( gaf, UNPROVIDED ), assertion );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 27375L)
  public static SubLObject find_timezone_for_place_at_date(final SubLObject place, final SubLObject date_1)
  {
    SubLObject date = NIL;
    if( cycl_utilities.formula_arg0( date_1 ).eql( $const123$TimeZoneFn ) )
    {
      date = cycl_utilities.formula_arg1( date_1, UNPROVIDED );
    }
    else
    {
      date = date_1;
    }
    final SubLObject all_time_zones_and_justifications = get_time_zones_for_place( place );
    final SubLObject latitude = get_latitude_of_place( place );
    final SubLObject year_of_date = bindings.variable_lookup( $sym113$_X, cycl_utilities.formula_arg0( inference_kernel.new_cyc_query( ConsesLow.list( $const114$evaluate, $sym113$_X, ConsesLow.list(
        $const124$YearOfDateFn, date ) ), UNPROVIDED, UNPROVIDED ) ) );
    SubLObject daylight_saving_time = NIL;
    if( NIL != place && NIL != latitude )
    {
      final SubLObject starting_point_of_daylight_saving_time = find_starting_point_of_daylight_saving_time( place, year_of_date );
      final SubLObject ending_point_of_daylight_saving_time = find_ending_point_of_daylight_saving_time( place, year_of_date );
      if( latitude.numG( ZERO_INTEGER ) && NIL != date_utilities.later_than( date, starting_point_of_daylight_saving_time ) && NIL != date_utilities.later_than( ending_point_of_daylight_saving_time, date ) )
      {
        daylight_saving_time = T;
      }
      if( latitude.numL( ZERO_INTEGER ) && ( NIL != date_utilities.later_than( date, starting_point_of_daylight_saving_time ) || NIL != date_utilities.later_than( ending_point_of_daylight_saving_time, date ) ) )
      {
        daylight_saving_time = T;
      }
      SubLObject cdolist_list_var = all_time_zones_and_justifications;
      SubLObject entry = NIL;
      entry = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject time_zone = bindings.variable_lookup( $sym113$_X, cycl_utilities.formula_arg0( entry ) );
        final SubLObject just_1 = cycl_utilities.formula_arg1( entry, UNPROVIDED );
        if( NIL != daylight_saving_time && NIL != isa.isaP( time_zone, $const125$DaylightSavingTimeZone, $const69$EverythingPSC, UNPROVIDED ) )
        {
          return Values.values( time_zone, just_1 );
        }
        if( NIL == daylight_saving_time && NIL == isa.isaP( time_zone, $const125$DaylightSavingTimeZone, $const69$EverythingPSC, UNPROVIDED ) )
        {
          return Values.values( time_zone, just_1 );
        }
        cdolist_list_var = cdolist_list_var.rest();
        entry = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 29086L)
  public static SubLObject get_time_zones_for_place(final SubLObject place_1)
  {
    SubLObject place = NIL;
    if( NIL != nart_handles.nart_p( place_1 ) )
    {
      place = narts_high.nart_hl_formula( place_1 );
    }
    else
    {
      place = place_1;
    }
    final SubLObject result = inference_kernel.new_cyc_query( ConsesLow.list( $const126$and, $list127, ConsesLow.list( $const128$geographicallySubsumes, $sym113$_X, place ) ), $const69$EverythingPSC, $list129 );
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 29855L)
  public static SubLObject find_starting_point_of_daylight_saving_time(final SubLObject place_1, final SubLObject year_of_date)
  {
    final SubLObject all_bindings = mt_context.ask_mt_query( $list130, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject place = NIL;
    if( NIL != nart_handles.nart_p( place_1 ) )
    {
      place = narts_high.nart_hl_formula( place_1 );
    }
    else
    {
      place = place_1;
    }
    if( place.isList() && cycl_utilities.formula_arg0( place ).eql( $const93$TerritoryFn ) )
    {
      place = cycl_utilities.formula_arg1( place, UNPROVIDED );
    }
    SubLObject cdolist_list_var = all_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject place_type = bindings.variable_lookup( $sym113$_X, binding );
      final SubLObject month_type = bindings.variable_lookup( $sym131$_Y, binding );
      final SubLObject day_type = bindings.variable_lookup( $sym132$_Z, binding );
      final SubLObject num = bindings.variable_lookup( $sym133$_W, binding );
      if( NIL != isa.isaP( place, place_type, $const69$EverythingPSC, UNPROVIDED ) )
      {
        SubLObject count = ZERO_INTEGER;
        SubLObject day;
        SubLObject date;
        for( day = NIL, day = ZERO_INTEGER; day.numL( $int134$31 ); day = Numbers.add( day, ONE_INTEGER ) )
        {
          date = ConsesLow.list( $const86$DayFn, Numbers.add( day, ONE_INTEGER ), ConsesLow.list( $const87$MonthFn, month_type, year_of_date ) );
          if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const11$isa, date, day_type ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            count = Numbers.add( count, ONE_INTEGER );
            if( count.numE( num ) )
            {
              return date;
            }
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    final SubLObject answer_from_european_summer_time = find_starting_point_of_european_summer_time( place, year_of_date );
    if( NIL != answer_from_european_summer_time )
    {
      return answer_from_european_summer_time;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 31155L)
  public static SubLObject find_ending_point_of_daylight_saving_time(final SubLObject place_1, final SubLObject year_of_date)
  {
    final SubLObject all_bindings = mt_context.ask_mt_query( $list135, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject place = NIL;
    if( NIL != nart_handles.nart_p( place_1 ) )
    {
      place = narts_high.nart_hl_formula( place_1 );
    }
    else
    {
      place = place_1;
    }
    if( place.isList() && cycl_utilities.formula_arg0( place ).eql( $const93$TerritoryFn ) )
    {
      place = cycl_utilities.formula_arg1( place, UNPROVIDED );
    }
    SubLObject cdolist_list_var = all_bindings;
    SubLObject binding = NIL;
    binding = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject place_type = bindings.variable_lookup( $sym113$_X, binding );
      final SubLObject month_type = bindings.variable_lookup( $sym131$_Y, binding );
      final SubLObject day_type = bindings.variable_lookup( $sym132$_Z, binding );
      final SubLObject num = bindings.variable_lookup( $sym133$_W, binding );
      if( NIL != isa.isaP( place, place_type, $const69$EverythingPSC, UNPROVIDED ) )
      {
        SubLObject count = ZERO_INTEGER;
        SubLObject day;
        SubLObject date;
        for( day = NIL, day = ZERO_INTEGER; day.numL( $int134$31 ); day = Numbers.add( day, ONE_INTEGER ) )
        {
          date = ConsesLow.list( $const86$DayFn, Numbers.add( day, ONE_INTEGER ), ConsesLow.list( $const87$MonthFn, month_type, year_of_date ) );
          if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const11$isa, date, day_type ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
          {
            count = Numbers.add( count, ONE_INTEGER );
            if( count.numE( num ) )
            {
              return date;
            }
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding = cdolist_list_var.first();
    }
    final SubLObject answer_from_european_summer_time = find_ending_point_of_european_summer_time( place, year_of_date );
    if( NIL != answer_from_european_summer_time )
    {
      return answer_from_european_summer_time;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 32438L)
  public static SubLObject find_ending_point_of_european_summer_time(final SubLObject place, final SubLObject year_of_date)
  {
    if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const136$properGeographicalSubRegions, $const137$EuropeanSummerTimeZone, place ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject day = Numbers.subtract( $int134$31, Numbers.floor( Numbers.mod( Numbers.add( Numbers.divide( Numbers.multiply( FIVE_INTEGER, cycl_utilities.formula_arg1( year_of_date, UNPROVIDED ) ),
          FOUR_INTEGER ), ONE_INTEGER ), SEVEN_INTEGER ), UNPROVIDED ) );
      if( NIL != day )
      {
        return ConsesLow.list( $const86$DayFn, day, ConsesLow.list( $const87$MonthFn, $const138$October, year_of_date ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 32787L)
  public static SubLObject find_starting_point_of_european_summer_time(final SubLObject place, final SubLObject year_of_date)
  {
    if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const136$properGeographicalSubRegions, $const137$EuropeanSummerTimeZone, place ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject day = Numbers.subtract( $int134$31, Numbers.floor( Numbers.mod( Numbers.add( Numbers.divide( Numbers.multiply( FIVE_INTEGER, cycl_utilities.formula_arg1( year_of_date, UNPROVIDED ) ),
          FOUR_INTEGER ), FOUR_INTEGER ), SEVEN_INTEGER ), UNPROVIDED ) );
      if( NIL != day )
      {
        return ConsesLow.list( $const86$DayFn, day, ConsesLow.list( $const87$MonthFn, $const139$March, year_of_date ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 33136L)
  public static SubLObject cyc_time_zone_conversion(final SubLObject new_time_zone, final SubLObject date)
  {
    if( NIL == isa.isaP( date, $const140$Date, $const69$EverythingPSC, UNPROVIDED ) || NIL == isa.isaP( new_time_zone, $const141$TimeZone, $const69$EverythingPSC, UNPROVIDED ) )
    {
      return NIL;
    }
    return time_zone_conversion( new_time_zone, date );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 33444L)
  public static SubLObject time_zone_conversion(final SubLObject new_time_zone, final SubLObject date)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject time_zone_of_date = cycl_utilities.formula_arg2( date, UNPROVIDED );
    final SubLObject local_time_of_date = cycl_utilities.formula_arg1( date, UNPROVIDED );
    thread.resetMultipleValues();
    final SubLObject offset_from_utc_1 = find_utc_offset_for_time_zone( time_zone_of_date );
    final SubLObject just_1 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject offset_from_utc_2 = find_utc_offset_for_time_zone( new_time_zone );
    final SubLObject just_2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject difference_of_offsets = bindings.variable_lookup( $sym113$_X, cycl_utilities.formula_arg0( inference_kernel.new_cyc_query( ConsesLow.list( $const114$evaluate, $sym113$_X, ConsesLow.list(
        $const143$DifferenceFn, offset_from_utc_1, offset_from_utc_2 ) ), UNPROVIDED, UNPROVIDED ) ) );
    if( NIL != time_zone_of_date && NIL != offset_from_utc_1 && NIL != offset_from_utc_2 && NIL != isa.isaP( time_zone_of_date, $const141$TimeZone, $const69$EverythingPSC, UNPROVIDED ) )
    {
      final SubLObject final_time = bindings.variable_lookup( $sym113$_X, cycl_utilities.formula_arg0( inference_kernel.new_cyc_query( ConsesLow.list( $const114$evaluate, $sym113$_X, ConsesLow.list(
          $const144$DateAfterDurationStartPreciseFn, local_time_of_date, difference_of_offsets ) ), UNPROVIDED, UNPROVIDED ) ) );
      if( NIL != final_time )
      {
        return Values.values( ConsesLow.list( $const123$TimeZoneFn, final_time, new_time_zone ), ConsesLow.list( just_1, just_2 ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 34388L)
  public static SubLObject find_utc_offset_for_time_zone(final SubLObject time_zone)
  {
    final SubLObject assertion = cycl_utilities.formula_arg0( kb_mapping_utilities.pred_value_gafs_in_any_mt( time_zone, $const122$timeZoneOffsetToUTC, ONE_INTEGER, UNPROVIDED ) );
    if( NIL != assertion )
    {
      return Values.values( cycl_utilities.formula_arg2( assertions_high.gaf_formula( assertion ), UNPROVIDED ), assertion );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 34643L)
  public static SubLObject location_has_qualitative_time_of_day_at_time(final SubLObject location, final SubLObject time, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject time_zone = find_timezone_for_place_at_date( location, time );
    SubLObject justifications = thread.secondMultipleValue();
    thread.resetMultipleValues();
    thread.resetMultipleValues();
    final SubLObject local_time_at_location = find_local_time_at_location( location, time, time_zone );
    final SubLObject just_2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject day_of_date = cycl_utilities.formula_arg0( ask_utilities.query_variable( $sym113$_X, ConsesLow.list( $const114$evaluate, $sym113$_X, ConsesLow.list( $const120$DayOfDateFn, local_time_at_location ) ),
        UNPROVIDED, UNPROVIDED ) );
    thread.resetMultipleValues();
    final SubLObject sunrise_time = sunrise_time_for_location( location, day_of_date, time_zone );
    final SubLObject just_3 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject sunset_time = sunset_time_for_location( location, day_of_date, time_zone );
    final SubLObject dawn = dawn_time_for_location( location, day_of_date, time_zone );
    final SubLObject dusk = dusk_time_for_location( location, day_of_date, time_zone );
    SubLObject mid_day = NIL;
    SubLObject lst_of_answers = NIL;
    justifications = ConsesLow.append( justifications, just_2, ConsesLow.list( just_3 ) );
    if( NIL == local_time_at_location || NIL == sunrise_time || NIL == sunset_time || NIL == dawn || NIL == dusk )
    {
      return NIL;
    }
    if( NIL != check_midday_time( local_time_at_location ) )
    {
      mid_day = T;
      lst_of_answers = ConsesLow.cons( ConsesLow.list( $const145$Midday, justifications ), lst_of_answers );
    }
    if( NIL != check_morning_time( local_time_at_location ) )
    {
      lst_of_answers = ConsesLow.cons( ConsesLow.list( $const146$Morning, justifications ), lst_of_answers );
    }
    if( NIL != check_afternoon_time( local_time_at_location ) && NIL == mid_day )
    {
      lst_of_answers = ConsesLow.cons( ConsesLow.list( $const147$Afternoon, justifications ), lst_of_answers );
    }
    if( NIL != check_evening_time( local_time_at_location ) )
    {
      lst_of_answers = ConsesLow.cons( ConsesLow.list( $const148$Evening, justifications ), lst_of_answers );
    }
    if( NIL != check_night_time( local_time_at_location, dusk, dawn ) )
    {
      lst_of_answers = ConsesLow.cons( ConsesLow.list( $const149$Night, justifications ), lst_of_answers );
    }
    if( NIL != check_daytime_hours( local_time_at_location, sunrise_time, sunset_time ) )
    {
      lst_of_answers = ConsesLow.cons( ConsesLow.list( $const150$DaytimeHours, justifications ), lst_of_answers );
    }
    if( sunrise_time.equal( local_time_at_location ) )
    {
      lst_of_answers = ConsesLow.cons( ConsesLow.list( $const151$Sunrise, justifications ), lst_of_answers );
    }
    if( sunset_time.equal( local_time_at_location ) )
    {
      lst_of_answers = ConsesLow.cons( ConsesLow.list( $const152$Sunset, justifications ), lst_of_answers );
    }
    if( NIL != check_dawn_time( local_time_at_location, dawn, sunrise_time ) )
    {
      lst_of_answers = ConsesLow.cons( ConsesLow.list( $const153$Dawn, justifications ), lst_of_answers );
      lst_of_answers = ConsesLow.cons( ConsesLow.list( $const154$Twilight, justifications ), lst_of_answers );
    }
    if( NIL != check_dusk_time( local_time_at_location, dusk, sunset_time ) )
    {
      lst_of_answers = ConsesLow.cons( ConsesLow.list( $const155$Dusk, justifications ), lst_of_answers );
      lst_of_answers = ConsesLow.cons( ConsesLow.list( $const154$Twilight, justifications ), lst_of_answers );
    }
    return lst_of_answers;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 37065L)
  public static SubLObject location_has_sunrise_time(final SubLObject location, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( mt.isList() )
    {
      final SubLObject time = cycl_utilities.formula_arg1( cycl_utilities.formula_arg2( mt, UNPROVIDED ), UNPROVIDED );
      if( NIL != time && cycl_utilities.formula_arg0( time ).eql( $const123$TimeZoneFn ) )
      {
        final SubLObject day_of_date = cycl_utilities.formula_arg1( time, UNPROVIDED );
        thread.resetMultipleValues();
        final SubLObject time_zone = find_timezone_for_place_at_date( location, day_of_date );
        final SubLObject just_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject sunrise_time = sunrise_time_for_location( location, day_of_date, time_zone );
        final SubLObject just_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != sunrise_time && NIL != time_zone )
        {
          return Values.values( ConsesLow.list( $const123$TimeZoneFn, sunrise_time, time_zone ), ConsesLow.append( just_1, ConsesLow.list( just_2 ) ) );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 37663L)
  public static SubLObject location_has_sunset_time(final SubLObject location, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( mt.isList() )
    {
      final SubLObject time = cycl_utilities.formula_arg1( cycl_utilities.formula_arg2( mt, UNPROVIDED ), UNPROVIDED );
      if( NIL != time && cycl_utilities.formula_arg0( time ).eql( $const123$TimeZoneFn ) )
      {
        final SubLObject day_of_date = cycl_utilities.formula_arg1( time, UNPROVIDED );
        thread.resetMultipleValues();
        final SubLObject time_zone = find_timezone_for_place_at_date( location, day_of_date );
        final SubLObject just_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject sunset_time = sunset_time_for_location( location, day_of_date, time_zone );
        final SubLObject just_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != sunset_time && NIL != time_zone )
        {
          return Values.values( ConsesLow.list( $const123$TimeZoneFn, sunset_time, time_zone ), ConsesLow.append( just_1, ConsesLow.list( just_2 ) ) );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 38257L)
  public static SubLObject local_sunrise_time_for_coordinates(final SubLObject latitude, final SubLObject longitude, final SubLObject date_1, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject day_of_date = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( cycl_utilities.formula_arg0( date_1 ).eql( $const123$TimeZoneFn ) )
      {
        day_of_date = cycl_utilities.formula_arg1( date_1, UNPROVIDED );
      }
      else
      {
        day_of_date = date_1;
      }
      thread.resetMultipleValues();
      final SubLObject offset = find_closest_match_for_latitude_and_longitude( latitude, longitude, day_of_date );
      final SubLObject just_3 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != offset )
      {
        final SubLObject sunrise_time = calculate_sunrise_time( cycl_utilities.formula_arg1( latitude, UNPROVIDED ), Numbers.subtract( ZERO_INTEGER, cycl_utilities.formula_arg1( longitude, UNPROVIDED ) ), day_of_date,
            offset );
        if( NIL != sunrise_time )
        {
          return Values.values( sunrise_time, just_3 );
        }
      }
      final SubLObject timezone_offset = estimate_timezone_offset( latitude, longitude );
      if( NIL != timezone_offset )
      {
        final SubLObject sunrise_time2 = calculate_sunrise_time( cycl_utilities.formula_arg1( latitude, UNPROVIDED ), Numbers.subtract( ZERO_INTEGER, cycl_utilities.formula_arg1( longitude, UNPROVIDED ) ), day_of_date,
            timezone_offset );
        return Values.values( sunrise_time2, NIL );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 39172L)
  public static SubLObject local_sunset_time_for_coordinates(final SubLObject latitude, final SubLObject longitude, final SubLObject date_1, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject day_of_date = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( cycl_utilities.formula_arg0( date_1 ).eql( $const123$TimeZoneFn ) )
      {
        day_of_date = cycl_utilities.formula_arg1( date_1, UNPROVIDED );
      }
      else
      {
        day_of_date = date_1;
      }
      thread.resetMultipleValues();
      final SubLObject offset = find_closest_match_for_latitude_and_longitude( latitude, longitude, day_of_date );
      final SubLObject just_3 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != offset )
      {
        final SubLObject sunset_time = calculate_sunset_time( cycl_utilities.formula_arg1( latitude, UNPROVIDED ), Numbers.subtract( ZERO_INTEGER, cycl_utilities.formula_arg1( longitude, UNPROVIDED ) ), day_of_date,
            offset );
        if( NIL != sunset_time )
        {
          return Values.values( sunset_time, just_3 );
        }
      }
      final SubLObject timezone_offset = estimate_timezone_offset( latitude, longitude );
      if( NIL != timezone_offset )
      {
        final SubLObject sunset_time2 = calculate_sunset_time( cycl_utilities.formula_arg1( latitude, UNPROVIDED ), Numbers.subtract( ZERO_INTEGER, cycl_utilities.formula_arg1( longitude, UNPROVIDED ) ), day_of_date,
            timezone_offset );
        return Values.values( sunset_time2, NIL );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 40079L)
  public static SubLObject estimate_timezone_offset(final SubLObject latitude, final SubLObject longitude)
  {
    final SubLObject offset = Numbers.subtract( ZERO_INTEGER, Numbers.divide( cycl_utilities.formula_arg1( longitude, UNPROVIDED ), FIFTEEN_INTEGER ) );
    return ConsesLow.list( $const157$HoursDuration, offset );
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 40260L)
  public static SubLObject find_closest_match_for_latitude_and_longitude(final SubLObject latitude, final SubLObject longitude, final SubLObject day_of_date)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject lat_1 = cycl_utilities.formula_arg1( latitude, UNPROVIDED );
    final SubLObject longitude_1 = cycl_utilities.formula_arg1( longitude, UNPROVIDED );
    final SubLObject pred_var = $const92$latitude;
    if( NIL != kb_mapping_macros.do_predicate_extent_index_key_validator( pred_var ) )
    {
      final SubLObject str = NIL;
      final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_last_pacification_time$.bind( utilities_macros.$progress_start_time$.getDynamicValue( thread ), thread );
        utilities_macros.$progress_elapsed_seconds_for_notification$.bind( utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue( thread ), thread );
        utilities_macros.$progress_notification_count$.bind( ZERO_INTEGER, thread );
        utilities_macros.$progress_pacifications_since_last_nl$.bind( ZERO_INTEGER, thread );
        utilities_macros.$progress_count$.bind( ZERO_INTEGER, thread );
        utilities_macros.$is_noting_progressP$.bind( T, thread );
        utilities_macros.$silent_progressP$.bind( ( NIL != str ) ? utilities_macros.$silent_progressP$.getDynamicValue( thread ) : T, thread );
        utilities_macros.noting_progress_preamble( str );
        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator( pred_var );
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            utilities_macros.note_progress();
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw73$GAF, NIL, NIL );
              SubLObject done_var_$4 = NIL;
              final SubLObject token_var_$5 = NIL;
              while ( NIL == done_var_$4)
              {
                final SubLObject assertion_1 = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$5 );
                final SubLObject valid_$6 = makeBoolean( !token_var_$5.eql( assertion_1 ) );
                if( NIL != valid_$6 )
                {
                  final SubLObject gaf_1 = assertions_high.gaf_formula( assertion_1 );
                  final SubLObject lat = cycl_utilities.formula_arg1( cycl_utilities.formula_arg2( gaf_1, UNPROVIDED ), UNPROVIDED );
                  if( Numbers.abs( Numbers.subtract( lat, lat_1 ) ).numL( FIVE_INTEGER ) )
                  {
                    final SubLObject place = cycl_utilities.formula_arg1( gaf_1, UNPROVIDED );
                    final SubLObject assertion_2 = cycl_utilities.formula_arg0( kb_mapping_utilities.pred_value_gafs( place, $const94$longitude, UNPROVIDED, UNPROVIDED ) );
                    if( NIL != assertion_2 )
                    {
                      final SubLObject gaf_2 = assertions_high.gaf_formula( assertion_2 );
                      final SubLObject longitude_2 = cycl_utilities.formula_arg1( cycl_utilities.formula_arg2( gaf_2, UNPROVIDED ), UNPROVIDED );
                      if( Numbers.abs( Numbers.subtract( longitude_1, longitude_2 ) ).numL( FIVE_INTEGER ) )
                      {
                        final SubLObject time_zone = find_timezone_for_place_at_date( place, day_of_date );
                        if( NIL != time_zone )
                        {
                          final SubLObject assertion = cycl_utilities.formula_arg0( kb_mapping_utilities.pred_value_gafs_in_any_mt( time_zone, $const122$timeZoneOffsetToUTC, ONE_INTEGER, UNPROVIDED ) );
                          if( NIL != assertion )
                          {
                            final SubLObject gaf = assertions_high.gaf_formula( assertion );
                            return Values.values( cycl_utilities.formula_arg2( gaf, UNPROVIDED ), ConsesLow.list( assertion ) );
                          }
                        }
                      }
                    }
                  }
                }
                done_var_$4 = makeBoolean( NIL == valid_$6 );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid );
        }
        utilities_macros.noting_progress_postamble();
      }
      finally
      {
        utilities_macros.$silent_progressP$.rebind( _prev_bind_8, thread );
        utilities_macros.$is_noting_progressP$.rebind( _prev_bind_7, thread );
        utilities_macros.$progress_count$.rebind( _prev_bind_6, thread );
        utilities_macros.$progress_pacifications_since_last_nl$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_notification_count$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_last_pacification_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 41253L)
  public static SubLObject check_dawn_time(final SubLObject local_time, final SubLObject dawn, final SubLObject sunrise)
  {
    if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const121$laterThan, local_time, dawn ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != mt_context.ask_mt_query( ConsesLow.list( $const121$laterThan, sunrise,
        local_time ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 41523L)
  public static SubLObject check_dusk_time(final SubLObject local_time, final SubLObject dusk, final SubLObject sunset)
  {
    if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const121$laterThan, local_time, sunset ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != mt_context.ask_mt_query( ConsesLow.list( $const121$laterThan, dusk,
        local_time ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 41727L)
  public static SubLObject check_morning_time(final SubLObject local_time_at_location)
  {
    final SubLObject hour = bindings.variable_lookup( $sym113$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const158$hourNumberOfDate, $sym113$_X, local_time_at_location ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) ) );
    if( NIL != hour && hour.numL( TWELVE_INTEGER ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 41971L)
  public static SubLObject check_afternoon_time(final SubLObject local_time_at_location)
  {
    final SubLObject hour = bindings.variable_lookup( $sym113$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const158$hourNumberOfDate, $sym113$_X, local_time_at_location ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) ) );
    if( NIL != hour && hour.numG( ELEVEN_INTEGER ) && hour.numL( SEVENTEEN_INTEGER ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 42256L)
  public static SubLObject check_evening_time(final SubLObject local_time_at_location)
  {
    final SubLObject hour = bindings.variable_lookup( $sym113$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const158$hourNumberOfDate, $sym113$_X, local_time_at_location ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) ) );
    if( NIL != hour && hour.numG( SIXTEEN_INTEGER ) && hour.numL( $int159$21 ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 42539L)
  public static SubLObject check_midday_time(final SubLObject local_time_at_location)
  {
    final SubLObject hour = cycl_utilities.formula_arg0( ask_utilities.query_variable( $sym113$_X, ConsesLow.list( $const158$hourNumberOfDate, $sym113$_X, local_time_at_location ), UNPROVIDED, UNPROVIDED ) );
    if( hour.isNumber() && hour.numE( TWELVE_INTEGER ) )
    {
      final SubLObject minutes = get_minutes_of_date( local_time_at_location );
      if( NIL != minutes && minutes.numE( ZERO_INTEGER ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 42917L)
  public static SubLObject check_midnight_time(final SubLObject local_time_at_location)
  {
    final SubLObject hour = bindings.variable_lookup( $sym113$_X, cycl_utilities.formula_arg0( mt_context.ask_mt_query( ConsesLow.list( $const158$hourNumberOfDate, $sym113$_X, local_time_at_location ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) ) );
    if( NIL != hour && hour.numE( ZERO_INTEGER ) )
    {
      final SubLObject minutes = get_minutes_of_date( local_time_at_location );
      if( minutes.numE( ZERO_INTEGER ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 43274L)
  public static SubLObject get_minutes_of_date(final SubLObject date)
  {
    if( cycl_utilities.formula_arg0( date ).eql( $const90$SecondFn ) )
    {
      return cycl_utilities.formula_arg1( cycl_utilities.formula_arg2( date, UNPROVIDED ), UNPROVIDED );
    }
    if( cycl_utilities.formula_arg0( date ).eql( $const89$MinuteFn ) )
    {
      return cycl_utilities.formula_arg1( date, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 43495L)
  public static SubLObject check_night_time(final SubLObject local_time_at_location, final SubLObject dusk, final SubLObject dawn)
  {
    if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const121$laterThan, dawn, local_time_at_location ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const121$laterThan, local_time_at_location, dusk ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 43751L)
  public static SubLObject check_daytime_hours(final SubLObject local_time_at_location, final SubLObject sunrise, final SubLObject sunset)
  {
    if( NIL != mt_context.ask_mt_query( ConsesLow.list( $const121$laterThan, local_time_at_location, sunrise ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != mt_context.ask_mt_query( ConsesLow.list( $const121$laterThan,
        sunset, local_time_at_location ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 44002L)
  public static SubLObject find_local_time_at_location(final SubLObject location, final SubLObject time_1, final SubLObject timezone)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( cycl_utilities.formula_arg0( time_1 ).eql( $const123$TimeZoneFn ) )
    {
      thread.resetMultipleValues();
      final SubLObject local_time_with_timezone = time_zone_conversion( timezone, time_1 );
      final SubLObject just = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != local_time_with_timezone )
      {
        return Values.values( cycl_utilities.formula_arg1( local_time_with_timezone, UNPROVIDED ), just );
      }
    }
    return NIL;
  }

  public static SubLObject declare_temporal_projection_utilities_file()
  {
    SubLFiles.declareFunction( me, "store_temporal_projection_results", "STORE-TEMPORAL-PROJECTION-RESULTS", 3, 1, false );
    SubLFiles.declareFunction( me, "temporal_projection_quick_failP", "TEMPORAL-PROJECTION-QUICK-FAIL?", 1, 0, false );
    SubLFiles.declareFunction( me, "deduction_not_produced_by_temporal_projectionP", "DEDUCTION-NOT-PRODUCED-BY-TEMPORAL-PROJECTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "verify_temporal_projection_code_supportP", "VERIFY-TEMPORAL-PROJECTION-CODE-SUPPORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_code_rule_for_documentation", "GET-CODE-RULE-FOR-DOCUMENTATION", 0, 0, false );
    SubLFiles.declareFunction( me, "find_likelihood_of_survival_of_spec", "FIND-LIKELIHOOD-OF-SURVIVAL-OF-SPEC", 3, 0, false );
    SubLFiles.declareFunction( me, "find_prob_of_termination_of_membership_at_age", "FIND-PROB-OF-TERMINATION-OF-MEMBERSHIP-AT-AGE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_all_relevant_distributions_for_survival_of_entity", "GET-ALL-RELEVANT-DISTRIBUTIONS-FOR-SURVIVAL-OF-ENTITY", 1, 0, false );
    SubLFiles.declareFunction( me, "find_expected_survival_duration_at_age", "FIND-EXPECTED-SURVIVAL-DURATION-AT-AGE", 2, 0, false );
    SubLFiles.declareFunction( me, "one_year_death_probability_at_age", "ONE-YEAR-DEATH-PROBABILITY-AT-AGE", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_get_nauts_from_narts", "POSSIBLY-GET-NAUTS-FROM-NARTS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_monad_mt", "GET-MONAD-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "mt_with_anytime_psc_time_parameter", "MT-WITH-ANYTIME-PSC-TIME-PARAMETER", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_produced_by_temporal_projectionP", "ASSERTION-PRODUCED-BY-TEMPORAL-PROJECTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "format_justification_entry", "FORMAT-JUSTIFICATION-ENTRY", 1, 0, false );
    SubLFiles.declareFunction( me, "find_the_latest_known_time_point_of_existence", "FIND-THE-LATEST-KNOWN-TIME-POINT-OF-EXISTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "find_first_point_of_time", "FIND-FIRST-POINT-OF-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "find_last_point_of_time", "FIND-LAST-POINT-OF-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "sunrise_time_for_location", "SUNRISE-TIME-FOR-LOCATION", 2, 1, false );
    SubLFiles.declareFunction( me, "sunset_time_for_location", "SUNSET-TIME-FOR-LOCATION", 2, 1, false );
    SubLFiles.declareFunction( me, "dawn_time_for_location", "DAWN-TIME-FOR-LOCATION", 2, 1, false );
    SubLFiles.declareFunction( me, "dusk_time_for_location", "DUSK-TIME-FOR-LOCATION", 2, 1, false );
    SubLFiles.declareFunction( me, "get_latitude_of_place", "GET-LATITUDE-OF-PLACE", 1, 0, false );
    SubLFiles.declareFunction( me, "use_territory_fn_to_get_information", "USE-TERRITORY-FN-TO-GET-INFORMATION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_longitude_of_place", "GET-LONGITUDE-OF-PLACE", 1, 0, false );
    SubLFiles.declareFunction( me, "calculate_sunset_time", "CALCULATE-SUNSET-TIME", 4, 0, false );
    SubLFiles.declareFunction( me, "calculate_dusk_time", "CALCULATE-DUSK-TIME", 4, 0, false );
    SubLFiles.declareFunction( me, "calculate_sunrise_time", "CALCULATE-SUNRISE-TIME", 4, 0, false );
    SubLFiles.declareFunction( me, "calculate_dawn_time", "CALCULATE-DAWN-TIME", 4, 0, false );
    SubLFiles.declareFunction( me, "convert_offset", "CONVERT-OFFSET", 3, 0, false );
    SubLFiles.declareFunction( me, "find_offset_for_location_on_date", "FIND-OFFSET-FOR-LOCATION-ON-DATE", 2, 1, false );
    SubLFiles.declareFunction( me, "find_timezone_for_place_at_date", "FIND-TIMEZONE-FOR-PLACE-AT-DATE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_time_zones_for_place", "GET-TIME-ZONES-FOR-PLACE", 1, 0, false );
    SubLFiles.declareFunction( me, "find_starting_point_of_daylight_saving_time", "FIND-STARTING-POINT-OF-DAYLIGHT-SAVING-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "find_ending_point_of_daylight_saving_time", "FIND-ENDING-POINT-OF-DAYLIGHT-SAVING-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "find_ending_point_of_european_summer_time", "FIND-ENDING-POINT-OF-EUROPEAN-SUMMER-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "find_starting_point_of_european_summer_time", "FIND-STARTING-POINT-OF-EUROPEAN-SUMMER-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_time_zone_conversion", "CYC-TIME-ZONE-CONVERSION", 2, 0, false );
    SubLFiles.declareFunction( me, "time_zone_conversion", "TIME-ZONE-CONVERSION", 2, 0, false );
    SubLFiles.declareFunction( me, "find_utc_offset_for_time_zone", "FIND-UTC-OFFSET-FOR-TIME-ZONE", 1, 0, false );
    SubLFiles.declareFunction( me, "location_has_qualitative_time_of_day_at_time", "LOCATION-HAS-QUALITATIVE-TIME-OF-DAY-AT-TIME", 3, 0, false );
    SubLFiles.declareFunction( me, "location_has_sunrise_time", "LOCATION-HAS-SUNRISE-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "location_has_sunset_time", "LOCATION-HAS-SUNSET-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "local_sunrise_time_for_coordinates", "LOCAL-SUNRISE-TIME-FOR-COORDINATES", 3, 1, false );
    SubLFiles.declareFunction( me, "local_sunset_time_for_coordinates", "LOCAL-SUNSET-TIME-FOR-COORDINATES", 3, 1, false );
    SubLFiles.declareFunction( me, "estimate_timezone_offset", "ESTIMATE-TIMEZONE-OFFSET", 2, 0, false );
    SubLFiles.declareFunction( me, "find_closest_match_for_latitude_and_longitude", "FIND-CLOSEST-MATCH-FOR-LATITUDE-AND-LONGITUDE", 3, 0, false );
    SubLFiles.declareFunction( me, "check_dawn_time", "CHECK-DAWN-TIME", 3, 0, false );
    SubLFiles.declareFunction( me, "check_dusk_time", "CHECK-DUSK-TIME", 3, 0, false );
    SubLFiles.declareFunction( me, "check_morning_time", "CHECK-MORNING-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "check_afternoon_time", "CHECK-AFTERNOON-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "check_evening_time", "CHECK-EVENING-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "check_midday_time", "CHECK-MIDDAY-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "check_midnight_time", "CHECK-MIDNIGHT-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "get_minutes_of_date", "GET-MINUTES-OF-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "check_night_time", "CHECK-NIGHT-TIME", 3, 0, false );
    SubLFiles.declareFunction( me, "check_daytime_hours", "CHECK-DAYTIME-HOURS", 3, 0, false );
    SubLFiles.declareFunction( me, "find_local_time_at_location", "FIND-LOCAL-TIME-AT-LOCATION", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_temporal_projection_utilities_file()
  {
    $ignored_temporal_projection_functions$ = SubLFiles.defparameter( "*IGNORED-TEMPORAL-PROJECTION-FUNCTIONS*", $list0 );
    $temporal_projection_distribution_predicate_list$ = SubLFiles.defparameter( "*TEMPORAL-PROJECTION-DISTRIBUTION-PREDICATE-LIST*", $list1 );
    return NIL;
  }

  public static SubLObject setup_temporal_projection_utilities_file()
  {
    utilities_macros.register_kb_function( $sym142$CYC_TIME_ZONE_CONVERSION );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_temporal_projection_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_temporal_projection_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_temporal_projection_utilities_file();
  }
}