package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class temporal_projection_utilities extends SubLTranslatedFile
{

    public static final SubLFile me = new temporal_projection_utilities();
    public static final String myName = "com.cyc.cycjava.cycl.temporal_projection_utilities";
    public static final String myFingerPrint = "bb196d36bb9d98bd413a0c0eb435faf54bd16f17455e0d91028746cea18259bd";
    private static SubLSymbol $ignored_temporal_projection_functions$ = null;
    public static SubLSymbol $temporal_projection_distribution_predicate_list$ = null;
    private static final SubLList $list0 = ConsesLow.list(new SubLObject[] {
        constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("MiddlePartFn")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("SeasonFn")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("STIF")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("STIB")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("InstanceNamedFn")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TemporalExtentFn")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("EarlyPartFn")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("SomeFn")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("EndingIntervalFn")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("InstanceNamedFn-Ternary"))
    });
    private static final SubLList $list1 = ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("defaultConditionalProbabilityForSentenceInInterval")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("conditionalProbabilityForSentenceWhenTypeInArg")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("defaultConditionalProbabilityOfStateAfterIntervalOfLength")));
    private static final SubLObject $const2$not = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("not"));
    private static final SubLSymbol $kw3$FALSE = SubLObjectFactory.makeKeyword("FALSE");
    private static final SubLSymbol $kw4$TRUE = SubLObjectFactory.makeKeyword("TRUE");
    private static final SubLObject $const5$MtSpace = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("MtSpace"));
    private static final SubLObject $const6$MtTimeWithGranularityDimFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("MtTimeWithGranularityDimFn"));
    private static final SubLList $list7 = ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TimePoint")));
    private static final SubLString $str8$Justifications_not_in_proper_form = SubLObjectFactory.makeString("Justifications not in proper format for time ~a ~a");
    private static final SubLSymbol $kw9$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
    private static final SubLInteger $int10$100 = SubLObjectFactory.makeInteger(100);
    private static final SubLObject $const11$isa = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("isa"));
    private static final SubLObject $const12$TimeDependentCollection = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TimeDependentCollection"));
    private static final SubLObject $const13$BaseKB = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("BaseKB"));
    private static final SubLSymbol $sym14$TRUE = SubLObjectFactory.makeSymbol("TRUE");
    private static final SubLSymbol $sym15$FALSE = SubLObjectFactory.makeSymbol("FALSE");
    private static final SubLSymbol $kw16$CODE = SubLObjectFactory.makeKeyword("CODE");
    private static final SubLList $list17 = ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("implies")), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("and")), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("ist")), SubLObjectFactory.makeSymbol("?MT"), SubLObjectFactory.makeSymbol("?ASENT")), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("temporalProjectionInterval")), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("ist")), SubLObjectFactory.makeSymbol("?MT"), SubLObjectFactory.makeSymbol("?ASENT")), SubLObjectFactory.makeSymbol("?WIDER-TIME"))), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("liftTo")), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("MtTimeDimFn")), SubLObjectFactory.makeSymbol("?WIDER-TIME")), SubLObjectFactory.makeSymbol("?ASENT")));
    private static final SubLObject $const18$YearsDuration = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("YearsDuration"));
    private static final SubLList $list19;
    private static final SubLInteger $int20$125 = SubLObjectFactory.makeInteger(125);
    private static final SubLObject $const21$NumericLikelihoodFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("NumericLikelihoodFn"));
    private static final SubLObject $const22$BiologicalLivingObject = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("BiologicalLivingObject"));
    private static final SubLObject $const23$conditionalProbabilityOfTerminati = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("conditionalProbabilityOfTerminationOfMembershipInCollectionWhenAgeInInterval"));
    private static final SubLFloat $float24$0_007 = SubLObjectFactory.makeDouble(0.0070000000000000001D);
    private static final SubLFloat $float25$4_0e_4 = SubLObjectFactory.makeDouble(0.00040000000000000002D);
    private static final SubLFloat $float26$3_0e_4 = SubLObjectFactory.makeDouble(0.00029999999999999997D);
    private static final SubLFloat $float27$2_0e_4 = SubLObjectFactory.makeDouble(0.00020000000000000001D);
    private static final SubLFloat $float28$1_0e_4 = SubLObjectFactory.makeDouble(0.0001D);
    private static final SubLInteger $int29$25 = SubLObjectFactory.makeInteger(25);
    private static final SubLFloat $float30$0_001 = SubLObjectFactory.makeDouble(0.001D);
    private static final SubLInteger $int31$30 = SubLObjectFactory.makeInteger(30);
    private static final SubLFloat $float32$0_0014 = SubLObjectFactory.makeDouble(0.0014D);
    private static final SubLInteger $int33$35 = SubLObjectFactory.makeInteger(35);
    private static final SubLFloat $float34$0_0015 = SubLObjectFactory.makeDouble(0.0015D);
    private static final SubLInteger $int35$40 = SubLObjectFactory.makeInteger(40);
    private static final SubLFloat $float36$0_0019 = SubLObjectFactory.makeDouble(0.0019D);
    private static final SubLInteger $int37$45 = SubLObjectFactory.makeInteger(45);
    private static final SubLFloat $float38$0_0029 = SubLObjectFactory.makeDouble(0.0028999999999999998D);
    private static final SubLInteger $int39$50 = SubLObjectFactory.makeInteger(50);
    private static final SubLFloat $float40$0_0042 = SubLObjectFactory.makeDouble(0.0041999999999999997D);
    private static final SubLInteger $int41$55 = SubLObjectFactory.makeInteger(55);
    private static final SubLFloat $float42$0_0065 = SubLObjectFactory.makeDouble(0.0064999999999999997D);
    private static final SubLInteger $int43$60 = SubLObjectFactory.makeInteger(60);
    private static final SubLFloat $float44$0_0094 = SubLObjectFactory.makeDouble(0.0094000000000000004D);
    private static final SubLInteger $int45$65 = SubLObjectFactory.makeInteger(65);
    private static final SubLFloat $float46$0_015 = SubLObjectFactory.makeDouble(0.014999999999999999D);
    private static final SubLInteger $int47$70 = SubLObjectFactory.makeInteger(70);
    private static final SubLFloat $float48$0_019 = SubLObjectFactory.makeDouble(0.019D);
    private static final SubLInteger $int49$75 = SubLObjectFactory.makeInteger(75);
    private static final SubLFloat $float50$0_031 = SubLObjectFactory.makeDouble(0.031D);
    private static final SubLInteger $int51$80 = SubLObjectFactory.makeInteger(80);
    private static final SubLFloat $float52$0_048 = SubLObjectFactory.makeDouble(0.048000000000000001D);
    private static final SubLInteger $int53$85 = SubLObjectFactory.makeInteger(85);
    private static final SubLFloat $float54$0_086 = SubLObjectFactory.makeDouble(0.085999999999999993D);
    private static final SubLInteger $int55$90 = SubLObjectFactory.makeInteger(90);
    private static final SubLFloat $float56$0_129 = SubLObjectFactory.makeDouble(0.129D);
    private static final SubLInteger $int57$95 = SubLObjectFactory.makeInteger(95);
    private static final SubLFloat $float58$0_229 = SubLObjectFactory.makeDouble(0.22900000000000001D);
    private static final SubLFloat $float59$0_31 = SubLObjectFactory.makeDouble(0.31D);
    private static final SubLInteger $int60$105 = SubLObjectFactory.makeInteger(105);
    private static final SubLFloat $float61$0_41 = SubLObjectFactory.makeDouble(0.40999999999999998D);
    private static final SubLInteger $int62$110 = SubLObjectFactory.makeInteger(110);
    private static final SubLFloat $float63$0_5 = SubLObjectFactory.makeDouble(0.5D);
    private static final SubLInteger $int64$115 = SubLObjectFactory.makeInteger(115);
    private static final SubLFloat $float65$0_68 = SubLObjectFactory.makeDouble(0.68000000000000005D);
    private static final SubLInteger $int66$120 = SubLObjectFactory.makeInteger(120);
    private static final SubLFloat $float67$0_82 = SubLObjectFactory.makeDouble(0.81999999999999995D);
    private static final SubLFloat $float68$0_91 = SubLObjectFactory.makeDouble(0.91000000000000003D);
    private static final SubLObject $const69$EverythingPSC = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("EverythingPSC"));
    private static final SubLList $list70 = ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AnytimePSC")));
    private static final SubLObject $const71$assertionProducedByTemporalProjec = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("assertionProducedByTemporalProjectionModule"));
    private static final SubLObject $const72$BookkeepingMt = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("BookkeepingMt"));
    private static final SubLSymbol $kw73$GAF = SubLObjectFactory.makeKeyword("GAF");
    private static final SubLObject $const74$Now = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Now"));
    private static final SubLObject $const75$TimeIntervalInclusiveFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TimeIntervalInclusiveFn"));
    private static final SubLObject $const76$TimeInterval_Incl_Excl_Fn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TimeInterval-Incl-Excl-Fn"));
    private static final SubLObject $const77$TimeInterval_Excl_Incl_Fn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TimeInterval-Excl-Incl-Fn"));
    private static final SubLObject $const78$SomeTimeInIntervalFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("SomeTimeInIntervalFn"));
    private static final SubLObject $const79$IntervalStartedByFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("IntervalStartedByFn"));
    private static final SubLObject $const80$IntervalStartedByFn_Inclusive = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("IntervalStartedByFn-Inclusive"));
    private static final SubLObject $const81$YearBCE_JulianFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("YearBCE-JulianFn"));
    private static final SubLObject $const82$YearFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("YearFn"));
    private static final SubLObject $const83$IntervalEndedByFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("IntervalEndedByFn"));
    private static final SubLObject $const84$EndFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("EndFn"));
    private static final SubLObject $const85$TimeIntervalBetweenFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TimeIntervalBetweenFn"));
    private static final SubLObject $const86$DayFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("DayFn"));
    private static final SubLObject $const87$MonthFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("MonthFn"));
    private static final SubLObject $const88$HourFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("HourFn"));
    private static final SubLObject $const89$MinuteFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("MinuteFn"));
    private static final SubLObject $const90$SecondFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("SecondFn"));
    private static final SubLObject $const91$DecadeFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("DecadeFn"));
    private static final SubLObject $const92$latitude = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("latitude"));
    private static final SubLObject $const93$TerritoryFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TerritoryFn"));
    private static final SubLObject $const94$longitude = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("longitude"));
    private static final SubLFloat $float95$0_0174532925 = SubLObjectFactory.makeDouble(0.017453292499999998D);
    private static final SubLFloat $float96$2451545_0009 = SubLObjectFactory.makeDouble(2451545.0008999999D);
    private static final SubLInteger $int97$360 = SubLObjectFactory.makeInteger(360);
    private static final SubLInteger $int98$2451545 = SubLObjectFactory.makeInteger(0x256859);
    private static final SubLFloat $float99$8_999999999999999e_4 = SubLObjectFactory.makeDouble(0.00089999999999999987D);
    private static final SubLFloat $float100$357_5291 = SubLObjectFactory.makeDouble(357.52910000000003D);
    private static final SubLFloat $float101$0_98560028 = SubLObjectFactory.makeDouble(0.98560028D);
    private static final SubLFloat $float102$1_9148 = SubLObjectFactory.makeDouble(1.9148000000000001D);
    private static final SubLFloat $float103$0_02 = SubLObjectFactory.makeDouble(0.02D);
    private static final SubLFloat $float104$102_9372 = SubLObjectFactory.makeDouble(102.9372D);
    private static final SubLInteger $int105$180 = SubLObjectFactory.makeInteger(180);
    private static final SubLFloat $float106$0_39794863131 = SubLObjectFactory.makeDouble(0.39794863131000002D);
    private static final SubLFloat $float107$_0_014485726139 = SubLObjectFactory.makeDouble(-0.014485726139D);
    private static final SubLFloat $float108$57_2957795 = SubLObjectFactory.makeDouble(57.295779500000002D);
    private static final SubLFloat $float109$0_0053 = SubLObjectFactory.makeDouble(0.0053D);
    private static final SubLFloat $float110$0_0069 = SubLObjectFactory.makeDouble(0.0068999999999999999D);
    private static final SubLInteger $int111$86400 = SubLObjectFactory.makeInteger(0x15180);
    private static final SubLInteger $int112$3600 = SubLObjectFactory.makeInteger(3600);
    private static final SubLSymbol $sym113$_X = SubLObjectFactory.makeSymbol("?X");
    private static final SubLObject $const114$evaluate = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("evaluate"));
    private static final SubLObject $const115$DateAfterFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("DateAfterFn"));
    private static final SubLList $list116;
    private static final SubLInteger $int117$23 = SubLObjectFactory.makeInteger(23);
    private static final SubLInteger $int118$24 = SubLObjectFactory.makeInteger(24);
    private static final SubLObject $const119$DateBeforeFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("DateBeforeFn"));
    private static final SubLObject $const120$DayOfDateFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("DayOfDateFn"));
    private static final SubLObject $const121$laterThan = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("laterThan"));
    private static final SubLObject $const122$timeZoneOffsetToUTC = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("timeZoneOffsetToUTC"));
    private static final SubLObject $const123$TimeZoneFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TimeZoneFn"));
    private static final SubLObject $const124$YearOfDateFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("YearOfDateFn"));
    private static final SubLObject $const125$DaylightSavingTimeZone = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("DaylightSavingTimeZone"));
    private static final SubLObject $const126$and = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("and"));
    private static final SubLList $list127 = ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TimeZone")));
    private static final SubLObject $const128$geographicallySubsumes = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("geographicallySubsumes"));
    private static final SubLList $list129;
    private static final SubLList $list130 = ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("daylightSavingTimeStartsOnNthDayTypeInMonth")), SubLObjectFactory.makeSymbol("?X"), SubLObjectFactory.makeSymbol("?Y"), SubLObjectFactory.makeSymbol("?Z"), SubLObjectFactory.makeSymbol("?W"));
    private static final SubLSymbol $sym131$_Y = SubLObjectFactory.makeSymbol("?Y");
    private static final SubLSymbol $sym132$_Z = SubLObjectFactory.makeSymbol("?Z");
    private static final SubLSymbol $sym133$_W = SubLObjectFactory.makeSymbol("?W");
    private static final SubLInteger $int134$31 = SubLObjectFactory.makeInteger(31);
    private static final SubLList $list135 = ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("daylightSavingTimeEndsOnNthDayTypeInMonth")), SubLObjectFactory.makeSymbol("?X"), SubLObjectFactory.makeSymbol("?Y"), SubLObjectFactory.makeSymbol("?Z"), SubLObjectFactory.makeSymbol("?W"));
    private static final SubLObject $const136$properGeographicalSubRegions = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("properGeographicalSubRegions"));
    private static final SubLObject $const137$EuropeanSummerTimeZone = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("EuropeanSummerTimeZone"));
    private static final SubLObject $const138$October = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("October"));
    private static final SubLObject $const139$March = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("March"));
    private static final SubLObject $const140$Date = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Date"));
    private static final SubLObject $const141$TimeZone = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TimeZone"));
    private static final SubLSymbol $sym142$CYC_TIME_ZONE_CONVERSION = SubLObjectFactory.makeSymbol("CYC-TIME-ZONE-CONVERSION");
    private static final SubLObject $const143$DifferenceFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("DifferenceFn"));
    private static final SubLObject $const144$DateAfterDurationStartPreciseFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("DateAfterDurationStartPreciseFn"));
    private static final SubLObject $const145$Midday = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Midday"));
    private static final SubLObject $const146$Morning = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Morning"));
    private static final SubLObject $const147$Afternoon = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Afternoon"));
    private static final SubLObject $const148$Evening = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Evening"));
    private static final SubLObject $const149$Night = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Night"));
    private static final SubLObject $const150$DaytimeHours = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("DaytimeHours"));
    private static final SubLObject $const151$Sunrise = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Sunrise"));
    private static final SubLObject $const152$Sunset = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Sunset"));
    private static final SubLObject $const153$Dawn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Dawn"));
    private static final SubLObject $const154$Twilight = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Twilight"));
    private static final SubLObject $const155$Dusk = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Dusk"));
    private static final SubLSymbol $sym156$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
    private static final SubLObject $const157$HoursDuration = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("HoursDuration"));
    private static final SubLObject $const158$hourNumberOfDate = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("hourNumberOfDate"));
    private static final SubLInteger $int159$21 = SubLObjectFactory.makeInteger(21);

    static 
    {
        $list19 = ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("NumericLikelihoodFn")), ONE_INTEGER);
        $list116 = ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("DaysDuration")), ONE_INTEGER));
        $list129 = ConsesLow.list(new SubLObject[] {
            SubLObjectFactory.makeKeyword("RETURN"), SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS"), SubLObjectFactory.makeKeyword("INFERENCE-MODE"), SubLObjectFactory.makeKeyword("MINIMAL"), SubLObjectFactory.makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), T, SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, SubLObjectFactory.makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), SubLObjectFactory.makeKeyword("COMPUTE-INTERSECTION"), 
            SubLObjectFactory.makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, SubLObjectFactory.makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?"), T, SubLObjectFactory.makeKeyword("MAX-NUMBER"), TWO_INTEGER, SubLObjectFactory.makeKeyword("MAX-TIME"), TWO_INTEGER, SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, 
            SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), SubLObjectFactory.makeDouble(1.0D), SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("HL"), SubLObjectFactory.makeKeyword("CONTINUABLE?"), T
        });
    }    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 1229L)
    public static SubLObject store_temporal_projection_results(final SubLObject formula_1, final SubLObject result_list, final SubLObject assertion, SubLObject mt) {
        if (mt == temporal_projection_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (temporal_projection_utilities.NIL == result_list) {
            return (SubLObject)temporal_projection_utilities.NIL;
        }
        SubLObject truth_value = (SubLObject)temporal_projection_utilities.NIL;
        SubLObject formula = (SubLObject)temporal_projection_utilities.NIL;
        final SubLObject code_support = get_code_rule_for_documentation();
        final SubLObject monad_mt = get_monad_mt(mt);
        if (cycl_utilities.formula_arg0(formula_1).eql(temporal_projection_utilities.$const2$not)) {
            truth_value = (SubLObject)temporal_projection_utilities.$kw3$FALSE;
            formula = cycl_utilities.formula_arg1(formula_1, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        }
        else {
            truth_value = (SubLObject)temporal_projection_utilities.$kw4$TRUE;
            formula = formula_1;
        }
        SubLObject cdolist_list_var = result_list;
        SubLObject entry = (SubLObject)temporal_projection_utilities.NIL;
        entry = cdolist_list_var.first();
        while (temporal_projection_utilities.NIL != cdolist_list_var) {
            final SubLObject mt_time = cycl_utilities.formula_arg0(entry);
            final SubLObject justifications = ConsesLow.append((SubLObject)ConsesLow.list(assertion), cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection_utilities.UNPROVIDED), code_support);
            SubLObject likelihood = cycl_utilities.formula_arg2(entry, (SubLObject)temporal_projection_utilities.UNPROVIDED);
            final SubLObject output_mt = (SubLObject)ConsesLow.list(temporal_projection_utilities.$const5$MtSpace, monad_mt, (SubLObject)ConsesLow.listS(temporal_projection_utilities.$const6$MtTimeWithGranularityDimFn, mt_time, (SubLObject)temporal_projection_utilities.$list7));
            if (temporal_projection_utilities.NIL == arguments.hl_justification_p(justifications)) {
                Errors.warn((SubLObject)temporal_projection_utilities.$str8$Justifications_not_in_proper_form, mt_time, justifications);
            }
            if (temporal_projection_utilities.NIL != arguments.hl_justification_p(justifications) && temporal_projection_utilities.NIL != hlmt.hlmtP(output_mt)) {
                final SubLObject deduction_object = hl_storage_modules.hl_add_deduction_for_gaf(formula, truth_value, output_mt, justifications, (SubLObject)temporal_projection_utilities.$kw9$FORWARD);
                if (temporal_projection_utilities.NIL != deduction_handles.deduction_p(deduction_object)) {
                    final SubLObject supported_object = deductions_high.deduction_supported_object(deduction_object);
                    if (temporal_projection_utilities.NIL != assertion_handles.assertion_p(supported_object) && likelihood.isNumber()) {
                        likelihood = Numbers.divide(Numbers.floor(Numbers.multiply(likelihood, (SubLObject)temporal_projection_utilities.$int10$100), (SubLObject)temporal_projection_utilities.UNPROVIDED), (SubLObject)temporal_projection_utilities.$int10$100);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 2822L)
    public static SubLObject temporal_projection_quick_failP(final SubLObject assertion) {
        final SubLObject gaf = assertions_high.gaf_formula(assertion);
        final SubLObject predicate = cycl_utilities.formula_arg0(gaf);
        if (predicate.eql(temporal_projection_utilities.$const11$isa)) {
            final SubLObject col = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_utilities.UNPROVIDED);
            if (temporal_projection_utilities.NIL == isa.isaP(col, temporal_projection_utilities.$const12$TimeDependentCollection, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)) {
                return (SubLObject)temporal_projection_utilities.T;
            }
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 3109L)
    public static SubLObject deduction_not_produced_by_temporal_projectionP(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (temporal_projection_utilities.NIL != deduction_handles.deduction_p(deduction)) {
            thread.resetMultipleValues();
            final SubLObject gaf_supports = hl_supports.hl_justification_complete_backward_theory(deductions_high.deduction_supports(deduction), temporal_projection_utilities.$const13$BaseKB, (SubLObject)temporal_projection_utilities.$sym14$TRUE, (SubLObject)temporal_projection_utilities.$sym15$FALSE);
            final SubLObject v_hl_supports = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = v_hl_supports;
            SubLObject support = (SubLObject)temporal_projection_utilities.NIL;
            support = cdolist_list_var.first();
            while (temporal_projection_utilities.NIL != cdolist_list_var) {
                if (support.isList() && cycl_utilities.formula_arg0(support).eql((SubLObject)temporal_projection_utilities.$kw16$CODE) && temporal_projection_utilities.NIL != verify_temporal_projection_code_supportP(cycl_utilities.formula_arg1(support, (SubLObject)temporal_projection_utilities.UNPROVIDED))) {
                    return (SubLObject)temporal_projection_utilities.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            }
        }
        return (SubLObject)temporal_projection_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 3621L)
    public static SubLObject verify_temporal_projection_code_supportP(final SubLObject x) {
        if (x.equal((SubLObject)temporal_projection_utilities.$list17)) {
            return (SubLObject)temporal_projection_utilities.T;
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 3913L)
    public static SubLObject get_code_rule_for_documentation() {
        return (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)temporal_projection_utilities.$kw16$CODE, (SubLObject)temporal_projection_utilities.$list17, temporal_projection_utilities.$const13$BaseKB, (SubLObject)temporal_projection_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 4185L)
    public static SubLObject find_likelihood_of_survival_of_spec(final SubLObject fact, final SubLObject mt_time, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entity = cycl_utilities.formula_arg1(fact, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        final SubLObject starting_date = temporal_projection.find_known_or_expected_starting_date(entity);
        if (temporal_projection_utilities.NIL == starting_date) {
            return (SubLObject)temporal_projection_utilities.NIL;
        }
        final SubLObject age = temporal_projection_cols.convert_to_unit(date_utilities.time_elapsed(mt_time, starting_date, (SubLObject)temporal_projection_utilities.UNPROVIDED), temporal_projection_utilities.$const18$YearsDuration);
        final SubLObject age_in_years = cycl_utilities.formula_arg1(age, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        SubLObject prob = (SubLObject)temporal_projection_utilities.ONE_INTEGER;
        SubLObject justifications = (SubLObject)temporal_projection_utilities.NIL;
        final SubLObject all_relevant_distribution_facts = get_all_relevant_distributions_for_survival_of_entity(entity);
        SubLObject last_known_age = (SubLObject)temporal_projection_utilities.ZERO_INTEGER;
        thread.resetMultipleValues();
        final SubLObject last_known_time = find_the_latest_known_time_point_of_existence(entity);
        final SubLObject last_known_time_assertion = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (temporal_projection_utilities.NIL != last_known_time) {
            last_known_age = cycl_utilities.formula_arg1(date_utilities.time_elapsed(last_known_time, starting_date, temporal_projection_utilities.$const18$YearsDuration), (SubLObject)temporal_projection_utilities.UNPROVIDED);
        }
        if (last_known_age.numG(age_in_years)) {
            return Values.values((SubLObject)temporal_projection_utilities.$list19, (SubLObject)ConsesLow.list(last_known_time_assertion));
        }
        SubLObject count;
        SubLObject prob_of_death;
        SubLObject prob_of_death_assertion;
        for (count = (SubLObject)temporal_projection_utilities.NIL, count = (SubLObject)temporal_projection_utilities.ZERO_INTEGER; count.numL((SubLObject)temporal_projection_utilities.$int20$125); count = Numbers.add(count, (SubLObject)temporal_projection_utilities.ONE_INTEGER)) {
            if (count.numGE(last_known_age) && count.numL(age_in_years)) {
                thread.resetMultipleValues();
                prob_of_death = find_prob_of_termination_of_membership_at_age(count, all_relevant_distribution_facts);
                prob_of_death_assertion = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection_utilities.NIL == prob_of_death) {
                    return (SubLObject)temporal_projection_utilities.NIL;
                }
                justifications = ConsesLow.append(justifications, (SubLObject)ConsesLow.list(prob_of_death_assertion));
                prob = Numbers.multiply(prob, Numbers.subtract((SubLObject)temporal_projection_utilities.ONE_INTEGER, prob_of_death));
                if (prob.numE((SubLObject)temporal_projection_utilities.ZERO_INTEGER)) {
                    return Values.values((SubLObject)ConsesLow.list(temporal_projection_utilities.$const21$NumericLikelihoodFn, prob), justifications);
                }
            }
        }
        return Values.values((SubLObject)ConsesLow.list(temporal_projection_utilities.$const21$NumericLikelihoodFn, prob), justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 5706L)
    public static SubLObject find_prob_of_termination_of_membership_at_age(final SubLObject age, final SubLObject all_assertions) {
        SubLObject cdolist_list_var = all_assertions;
        SubLObject assertion = (SubLObject)temporal_projection_utilities.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_utilities.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject interval = cycl_utilities.formula_arg3(gaf, (SubLObject)temporal_projection_utilities.UNPROVIDED);
            if (age.numGE(cycl_utilities.formula_arg1(interval, (SubLObject)temporal_projection_utilities.UNPROVIDED)) && age.numL(cycl_utilities.formula_arg2(interval, (SubLObject)temporal_projection_utilities.UNPROVIDED))) {
                return Values.values(cycl_utilities.formula_arg5(gaf, (SubLObject)temporal_projection_utilities.UNPROVIDED), assertion);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 6044L)
    public static SubLObject get_all_relevant_distributions_for_survival_of_entity(final SubLObject en) {
        SubLObject result = (SubLObject)temporal_projection_utilities.NIL;
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(temporal_projection_utilities.$const22$BiologicalLivingObject, temporal_projection_utilities.$const23$conditionalProbabilityOfTerminati, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        SubLObject assertion = (SubLObject)temporal_projection_utilities.NIL;
        assertion = cdolist_list_var.first();
        while (temporal_projection_utilities.NIL != cdolist_list_var) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject col = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_utilities.UNPROVIDED);
            if (temporal_projection_utilities.NIL != Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("ISA-IN-ANY-MT-MEMOIZED?"), en, col)) {
                result = (SubLObject)ConsesLow.cons(assertion, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 6463L)
    public static SubLObject find_expected_survival_duration_at_age(final SubLObject age, final SubLObject upper) {
        SubLObject age_in_years = (SubLObject)temporal_projection_utilities.NIL;
        final SubLObject age_units = cycl_utilities.formula_arg0(age);
        final SubLObject age_value = cycl_utilities.formula_arg1(age, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        SubLObject prob = (SubLObject)temporal_projection_utilities.ONE_INTEGER;
        if (age_units.eql(temporal_projection_utilities.$const18$YearsDuration)) {
            age_in_years = age_value;
        }
        else {
            age_in_years = quantities.convert_to_units(temporal_projection_utilities.$const18$YearsDuration, age_units, age_value, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        }
        SubLObject count;
        SubLObject current_age;
        SubLObject one_year_death_probability;
        for (count = (SubLObject)temporal_projection_utilities.NIL, count = (SubLObject)temporal_projection_utilities.ZERO_INTEGER; count.numL((SubLObject)temporal_projection_utilities.$int20$125); count = Numbers.add(count, (SubLObject)temporal_projection_utilities.ONE_INTEGER)) {
            current_age = Numbers.add(age_in_years, count);
            one_year_death_probability = one_year_death_probability_at_age(current_age);
            prob = Numbers.multiply(prob, Numbers.exp(Numbers.subtract((SubLObject)temporal_projection_utilities.ZERO_INTEGER, one_year_death_probability)));
            if (prob.numL(upper)) {
                return (SubLObject)ConsesLow.list(temporal_projection_utilities.$const18$YearsDuration, current_age);
            }
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 7092L)
    public static SubLObject one_year_death_probability_at_age(final SubLObject age) {
        if (age.numE((SubLObject)temporal_projection_utilities.ZERO_INTEGER)) {
            return (SubLObject)temporal_projection_utilities.$float24$0_007;
        }
        if (age.numE((SubLObject)temporal_projection_utilities.ONE_INTEGER)) {
            return (SubLObject)temporal_projection_utilities.$float25$4_0e_4;
        }
        if (age.numE((SubLObject)temporal_projection_utilities.TWO_INTEGER)) {
            return (SubLObject)temporal_projection_utilities.$float26$3_0e_4;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.FIVE_INTEGER)) {
            return (SubLObject)temporal_projection_utilities.$float27$2_0e_4;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.TEN_INTEGER)) {
            return (SubLObject)temporal_projection_utilities.$float28$1_0e_4;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.FIFTEEN_INTEGER)) {
            return (SubLObject)temporal_projection_utilities.$float25$4_0e_4;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.$int29$25)) {
            return (SubLObject)temporal_projection_utilities.$float30$0_001;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.$int31$30)) {
            return (SubLObject)temporal_projection_utilities.$float32$0_0014;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.$int33$35)) {
            return (SubLObject)temporal_projection_utilities.$float34$0_0015;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.$int35$40)) {
            return (SubLObject)temporal_projection_utilities.$float36$0_0019;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.$int37$45)) {
            return (SubLObject)temporal_projection_utilities.$float38$0_0029;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.$int39$50)) {
            return (SubLObject)temporal_projection_utilities.$float40$0_0042;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.$int41$55)) {
            return (SubLObject)temporal_projection_utilities.$float42$0_0065;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.$int43$60)) {
            return (SubLObject)temporal_projection_utilities.$float44$0_0094;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.$int45$65)) {
            return (SubLObject)temporal_projection_utilities.$float46$0_015;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.$int47$70)) {
            return (SubLObject)temporal_projection_utilities.$float48$0_019;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.$int49$75)) {
            return (SubLObject)temporal_projection_utilities.$float50$0_031;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.$int51$80)) {
            return (SubLObject)temporal_projection_utilities.$float52$0_048;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.$int53$85)) {
            return (SubLObject)temporal_projection_utilities.$float54$0_086;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.$int55$90)) {
            return (SubLObject)temporal_projection_utilities.$float56$0_129;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.$int57$95)) {
            return (SubLObject)temporal_projection_utilities.$float58$0_229;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.$int10$100)) {
            return (SubLObject)temporal_projection_utilities.$float59$0_31;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.$int60$105)) {
            return (SubLObject)temporal_projection_utilities.$float61$0_41;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.$int62$110)) {
            return (SubLObject)temporal_projection_utilities.$float63$0_5;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.$int64$115)) {
            return (SubLObject)temporal_projection_utilities.$float65$0_68;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.$int66$120)) {
            return (SubLObject)temporal_projection_utilities.$float67$0_82;
        }
        if (age.numL((SubLObject)temporal_projection_utilities.$int20$125)) {
            return (SubLObject)temporal_projection_utilities.$float68$0_91;
        }
        return (SubLObject)temporal_projection_utilities.ONE_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 8169L)
    public static SubLObject possibly_get_nauts_from_narts(final SubLObject time) {
        if (temporal_projection_utilities.NIL != nart_handles.nart_p(time)) {
            return narts_high.nart_hl_formula(time);
        }
        return time;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 8316L)
    public static SubLObject get_monad_mt(final SubLObject mt) {
        if (!mt.isList()) {
            return mt;
        }
        if (cycl_utilities.formula_arg0(mt).eql(temporal_projection_utilities.$const5$MtSpace)) {
            return cycl_utilities.formula_arg1(mt, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        }
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 8474L)
    public static SubLObject mt_with_anytime_psc_time_parameter(final SubLObject mt) {
        if (mt.eql(temporal_projection_utilities.$const69$EverythingPSC)) {
            return mt;
        }
        if (mt.isList() && cycl_utilities.formula_arg0(mt).eql(temporal_projection_utilities.$const5$MtSpace)) {
            return (SubLObject)ConsesLow.listS(temporal_projection_utilities.$const5$MtSpace, cycl_utilities.formula_arg1(mt, (SubLObject)temporal_projection_utilities.UNPROVIDED), (SubLObject)temporal_projection_utilities.$list70);
        }
        if (!mt.isList()) {
            return (SubLObject)ConsesLow.listS(temporal_projection_utilities.$const5$MtSpace, mt, (SubLObject)temporal_projection_utilities.$list70);
        }
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 8783L)
    public static SubLObject assertion_produced_by_temporal_projectionP(final SubLObject assertion) {
        return kb_mapping_utilities.pred_value_gafs_in_relevant_mts(assertion, temporal_projection_utilities.$const71$assertionProducedByTemporalProjec, temporal_projection_utilities.$const72$BookkeepingMt, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 8974L)
    public static SubLObject format_justification_entry(final SubLObject entry) {
        if (temporal_projection_utilities.NIL != assertion_handles.assertion_p(entry)) {
            return (SubLObject)ConsesLow.list(entry);
        }
        return entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 9098L)
    public static SubLObject find_the_latest_known_time_point_of_existence(final SubLObject entity) {
        SubLObject current_best_time = (SubLObject)temporal_projection_utilities.NIL;
        SubLObject current_best_assertion = (SubLObject)temporal_projection_utilities.NIL;
        final SubLObject pred_var = temporal_projection_utilities.$const11$isa;
        if (temporal_projection_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(entity, (SubLObject)temporal_projection_utilities.ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(entity, (SubLObject)temporal_projection_utilities.ONE_INTEGER, pred_var);
            SubLObject done_var = (SubLObject)temporal_projection_utilities.NIL;
            final SubLObject token_var = (SubLObject)temporal_projection_utilities.NIL;
            while (temporal_projection_utilities.NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                if (temporal_projection_utilities.NIL != valid) {
                    SubLObject final_index_iterator = (SubLObject)temporal_projection_utilities.NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)temporal_projection_utilities.$kw73$GAF, (SubLObject)temporal_projection_utilities.NIL, (SubLObject)temporal_projection_utilities.NIL);
                        SubLObject done_var_$1 = (SubLObject)temporal_projection_utilities.NIL;
                        final SubLObject token_var_$2 = (SubLObject)temporal_projection_utilities.NIL;
                        while (temporal_projection_utilities.NIL == done_var_$1) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                            final SubLObject valid_$3 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$2.eql(assertion));
                            if (temporal_projection_utilities.NIL != valid_$3) {
                                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                                final SubLObject assertion_time = possibly_get_nauts_from_narts(temporal_projection.get_time_for_assertion_1(assertion));
                                if (temporal_projection_utilities.NIL != assertion_time) {
                                    final SubLObject col_2 = cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_utilities.UNPROVIDED);
                                    if (temporal_projection_utilities.NIL != genls.genlP(col_2, temporal_projection_utilities.$const22$BiologicalLivingObject, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)) {
                                        final SubLObject last_time_point = find_last_point_of_time(assertion_time);
                                        if (temporal_projection_utilities.NIL != last_time_point) {
                                            if (temporal_projection_utilities.NIL == current_best_time) {
                                                current_best_time = last_time_point;
                                                current_best_assertion = assertion;
                                            }
                                            else if (!last_time_point.equal(current_best_time) && temporal_projection_utilities.NIL != date_utilities.later_than(last_time_point, current_best_time)) {
                                                current_best_time = last_time_point;
                                                current_best_assertion = assertion;
                                            }
                                        }
                                    }
                                }
                            }
                            done_var_$1 = (SubLObject)SubLObjectFactory.makeBoolean(temporal_projection_utilities.NIL == valid_$3);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)temporal_projection_utilities.T);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (temporal_projection_utilities.NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = (SubLObject)SubLObjectFactory.makeBoolean(temporal_projection_utilities.NIL == valid);
            }
        }
        return Values.values(current_best_time, current_best_assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 10098L)
    public static SubLObject find_first_point_of_time(final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject function = cycl_utilities.formula_arg0(time);
        final SubLObject arg1 = cycl_utilities.formula_arg1(time, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        if (temporal_projection_utilities.NIL != nart_handles.nart_p(arg1)) {
            return (SubLObject)temporal_projection_utilities.NIL;
        }
        if (time.eql(temporal_projection_utilities.$const74$Now)) {
            return date_utilities.indexical_now();
        }
        if (!time.isList()) {
            return (SubLObject)temporal_projection_utilities.NIL;
        }
        if (temporal_projection_utilities.NIL != conses_high.member(function, temporal_projection_utilities.$ignored_temporal_projection_functions$.getDynamicValue(thread), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)) {
            return (SubLObject)temporal_projection_utilities.NIL;
        }
        if (function.eql(temporal_projection_utilities.$const75$TimeIntervalInclusiveFn)) {
            return find_first_point_of_time(arg1);
        }
        if (function.eql(temporal_projection_utilities.$const76$TimeInterval_Incl_Excl_Fn)) {
            return find_first_point_of_time(arg1);
        }
        if (function.eql(temporal_projection_utilities.$const77$TimeInterval_Excl_Incl_Fn)) {
            return find_first_point_of_time(arg1);
        }
        if (function.eql(temporal_projection_utilities.$const78$SomeTimeInIntervalFn)) {
            return find_first_point_of_time(arg1);
        }
        if (function.eql(temporal_projection_utilities.$const79$IntervalStartedByFn) || function.eql(temporal_projection_utilities.$const80$IntervalStartedByFn_Inclusive)) {
            return find_first_point_of_time(arg1);
        }
        if (function.eql(temporal_projection_utilities.$const81$YearBCE_JulianFn)) {
            return (SubLObject)ConsesLow.list(temporal_projection_utilities.$const82$YearFn, Numbers.subtract((SubLObject)temporal_projection_utilities.ZERO_INTEGER, arg1));
        }
        if (function.eql(temporal_projection_utilities.$const83$IntervalEndedByFn)) {
            return (SubLObject)temporal_projection_utilities.NIL;
        }
        if (function.eql(temporal_projection_utilities.$const84$EndFn)) {
            return find_last_point_of_time(arg1);
        }
        if (function.eql(temporal_projection_utilities.$const85$TimeIntervalBetweenFn)) {
            return find_first_point_of_time(arg1);
        }
        if (function.eql(temporal_projection_utilities.$const86$DayFn)) {
            return time;
        }
        if (function.eql(temporal_projection_utilities.$const87$MonthFn)) {
            return time;
        }
        if (function.eql(temporal_projection_utilities.$const82$YearFn)) {
            return time;
        }
        if (function.eql(temporal_projection_utilities.$const88$HourFn)) {
            return time;
        }
        if (function.eql(temporal_projection_utilities.$const89$MinuteFn)) {
            return time;
        }
        if (function.eql(temporal_projection_utilities.$const90$SecondFn)) {
            return time;
        }
        if (function.eql(temporal_projection_utilities.$const91$DecadeFn)) {
            return time;
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 11729L)
    public static SubLObject find_last_point_of_time(final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject function = cycl_utilities.formula_arg0(time);
        final SubLObject arg1 = cycl_utilities.formula_arg1(time, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.formula_arg2(time, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        if (time.eql(temporal_projection_utilities.$const74$Now)) {
            return date_utilities.indexical_now();
        }
        if (!time.isList()) {
            return (SubLObject)temporal_projection_utilities.NIL;
        }
        if (temporal_projection_utilities.NIL != nart_handles.nart_p(arg2)) {
            return (SubLObject)temporal_projection_utilities.NIL;
        }
        if (temporal_projection_utilities.NIL != conses_high.member(function, temporal_projection_utilities.$ignored_temporal_projection_functions$.getDynamicValue(thread), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)) {
            return (SubLObject)temporal_projection_utilities.NIL;
        }
        if (function.eql(temporal_projection_utilities.$const75$TimeIntervalInclusiveFn)) {
            return find_last_point_of_time(cycl_utilities.formula_arg2(time, (SubLObject)temporal_projection_utilities.UNPROVIDED));
        }
        if (function.eql(temporal_projection_utilities.$const76$TimeInterval_Incl_Excl_Fn)) {
            return find_last_point_of_time(arg2);
        }
        if (function.eql(temporal_projection_utilities.$const77$TimeInterval_Excl_Incl_Fn)) {
            return find_last_point_of_time(arg2);
        }
        if (function.eql(temporal_projection_utilities.$const78$SomeTimeInIntervalFn)) {
            return find_last_point_of_time(cycl_utilities.formula_arg1(time, (SubLObject)temporal_projection_utilities.UNPROVIDED));
        }
        if (function.eql(temporal_projection_utilities.$const83$IntervalEndedByFn)) {
            return find_last_point_of_time(arg1);
        }
        if (function.eql(temporal_projection_utilities.$const84$EndFn)) {
            return find_last_point_of_time(arg1);
        }
        if (function.eql(temporal_projection_utilities.$const81$YearBCE_JulianFn)) {
            return (SubLObject)ConsesLow.list(temporal_projection_utilities.$const82$YearFn, Numbers.subtract((SubLObject)temporal_projection_utilities.ZERO_INTEGER, arg1));
        }
        if (cycl_utilities.formula_arg0(time).eql(temporal_projection_utilities.$const79$IntervalStartedByFn) || cycl_utilities.formula_arg0(time).eql(temporal_projection_utilities.$const80$IntervalStartedByFn_Inclusive)) {
            return (SubLObject)temporal_projection_utilities.NIL;
        }
        if (function.eql(temporal_projection_utilities.$const85$TimeIntervalBetweenFn)) {
            return find_last_point_of_time(cycl_utilities.formula_arg2(time, (SubLObject)temporal_projection_utilities.UNPROVIDED));
        }
        if (function.eql(temporal_projection_utilities.$const86$DayFn)) {
            return time;
        }
        if (function.eql(temporal_projection_utilities.$const87$MonthFn)) {
            return time;
        }
        if (function.eql(temporal_projection_utilities.$const82$YearFn)) {
            return time;
        }
        if (function.eql(temporal_projection_utilities.$const88$HourFn)) {
            return time;
        }
        if (function.eql(temporal_projection_utilities.$const89$MinuteFn)) {
            return time;
        }
        if (function.eql(temporal_projection_utilities.$const90$SecondFn)) {
            return time;
        }
        if (function.eql(temporal_projection_utilities.$const91$DecadeFn)) {
            return time;
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 13438L)
    public static SubLObject sunrise_time_for_location(final SubLObject place, final SubLObject date, SubLObject time_zone) {
        if (time_zone == temporal_projection_utilities.UNPROVIDED) {
            time_zone = (SubLObject)temporal_projection_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject latitude = get_latitude_of_place(place);
        thread.resetMultipleValues();
        final SubLObject offset = find_offset_for_location_on_date(place, date, time_zone);
        final SubLObject just = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject longitude = get_longitude_of_place(place);
        if (temporal_projection_utilities.NIL != latitude && temporal_projection_utilities.NIL != longitude && temporal_projection_utilities.NIL != offset && temporal_projection_utilities.NIL != date) {
            return Values.values(calculate_sunrise_time(latitude, longitude, date, offset), just);
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 13906L)
    public static SubLObject sunset_time_for_location(final SubLObject place, final SubLObject date, SubLObject time_zone) {
        if (time_zone == temporal_projection_utilities.UNPROVIDED) {
            time_zone = (SubLObject)temporal_projection_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject latitude = get_latitude_of_place(place);
        thread.resetMultipleValues();
        final SubLObject offset = find_offset_for_location_on_date(place, date, time_zone);
        final SubLObject just = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject longitude = get_longitude_of_place(place);
        if (temporal_projection_utilities.NIL != latitude && temporal_projection_utilities.NIL != longitude && temporal_projection_utilities.NIL != offset && temporal_projection_utilities.NIL != date) {
            return Values.values(calculate_sunset_time(latitude, longitude, date, offset), just);
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 14316L)
    public static SubLObject dawn_time_for_location(final SubLObject place, final SubLObject date, SubLObject time_zone) {
        if (time_zone == temporal_projection_utilities.UNPROVIDED) {
            time_zone = (SubLObject)temporal_projection_utilities.NIL;
        }
        final SubLObject latitude = get_latitude_of_place(place);
        final SubLObject offset = find_offset_for_location_on_date(place, date, time_zone);
        final SubLObject longitude = get_longitude_of_place(place);
        if (temporal_projection_utilities.NIL != latitude && temporal_projection_utilities.NIL != longitude && temporal_projection_utilities.NIL != offset && temporal_projection_utilities.NIL != date) {
            return calculate_dawn_time(latitude, longitude, date, offset);
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 14694L)
    public static SubLObject dusk_time_for_location(final SubLObject place, final SubLObject date, SubLObject time_zone) {
        if (time_zone == temporal_projection_utilities.UNPROVIDED) {
            time_zone = (SubLObject)temporal_projection_utilities.NIL;
        }
        final SubLObject latitude = get_latitude_of_place(place);
        final SubLObject offset = find_offset_for_location_on_date(place, date, time_zone);
        final SubLObject longitude = get_longitude_of_place(place);
        if (temporal_projection_utilities.NIL != latitude && temporal_projection_utilities.NIL != longitude && temporal_projection_utilities.NIL != offset && temporal_projection_utilities.NIL != date) {
            return calculate_dusk_time(latitude, longitude, date, offset);
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 15073L)
    public static SubLObject get_latitude_of_place(final SubLObject place_1) {
        if (temporal_projection_utilities.NIL != place_1) {
            SubLObject place = (SubLObject)temporal_projection_utilities.NIL;
            if (place_1.isList()) {
                place = narts_high.find_nart(place_1);
            }
            else {
                place = place_1;
            }
            if (temporal_projection_utilities.NIL != place) {
                SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs_in_any_mt(place, temporal_projection_utilities.$const92$latitude, (SubLObject)temporal_projection_utilities.ONE_INTEGER, (SubLObject)temporal_projection_utilities.UNPROVIDED));
                if (temporal_projection_utilities.NIL == assertion) {
                    assertion = use_territory_fn_to_get_information(place_1, temporal_projection_utilities.$const92$latitude);
                }
                if (temporal_projection_utilities.NIL != assertion) {
                    final SubLObject gaf = assertions_high.gaf_formula(assertion);
                    final SubLObject latitude = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_utilities.UNPROVIDED), (SubLObject)temporal_projection_utilities.UNPROVIDED);
                    return latitude;
                }
            }
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 15683L)
    public static SubLObject use_territory_fn_to_get_information(final SubLObject place, final SubLObject pred) {
        if (!place.isList()) {
            final SubLObject nart = narts_high.find_nart((SubLObject)ConsesLow.list(temporal_projection_utilities.$const93$TerritoryFn, place));
            if (temporal_projection_utilities.NIL != nart) {
                return cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs_in_any_mt(nart, pred, (SubLObject)temporal_projection_utilities.ONE_INTEGER, (SubLObject)temporal_projection_utilities.UNPROVIDED));
            }
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 15925L)
    public static SubLObject get_longitude_of_place(final SubLObject place_1) {
        if (temporal_projection_utilities.NIL != place_1) {
            SubLObject place = (SubLObject)temporal_projection_utilities.NIL;
            if (place_1.isList()) {
                place = narts_high.find_nart(place_1);
            }
            else {
                place = place_1;
            }
            if (temporal_projection_utilities.NIL != place) {
                SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs_in_any_mt(place, temporal_projection_utilities.$const94$longitude, (SubLObject)temporal_projection_utilities.ONE_INTEGER, (SubLObject)temporal_projection_utilities.UNPROVIDED));
                if (temporal_projection_utilities.NIL == assertion) {
                    assertion = use_territory_fn_to_get_information(place_1, temporal_projection_utilities.$const94$longitude);
                }
                if (temporal_projection_utilities.NIL != assertion) {
                    final SubLObject gaf = assertions_high.gaf_formula(assertion);
                    final SubLObject longitude = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_utilities.UNPROVIDED), (SubLObject)temporal_projection_utilities.UNPROVIDED);
                    return Numbers.subtract((SubLObject)temporal_projection_utilities.ZERO_INTEGER, longitude);
                }
            }
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 16521L)
    public static SubLObject calculate_sunset_time(final SubLObject latitude, final SubLObject longitude, final SubLObject date, final SubLObject offset) {
        final SubLObject universal_time = date_utilities.cycl_date_to_universal_time(date);
        final SubLObject latitude_in_radians = Numbers.multiply((SubLObject)temporal_projection_utilities.$float95$0_0174532925, latitude);
        final SubLObject julian_date = numeric_date_utilities.get_julian_date(universal_time, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        final SubLObject n_star = Numbers.subtract(Numbers.subtract(julian_date, (SubLObject)temporal_projection_utilities.$float96$2451545_0009), Numbers.divide(longitude, (SubLObject)temporal_projection_utilities.$int97$360));
        final SubLObject n = Numbers.round(Numbers.add(n_star, (SubLObject)temporal_projection_utilities.$float63$0_5), (SubLObject)temporal_projection_utilities.UNPROVIDED);
        final SubLObject j_star = Numbers.add((SubLObject)temporal_projection_utilities.$int98$2451545, Numbers.add((SubLObject)temporal_projection_utilities.$float99$8_999999999999999e_4, Numbers.add(n, Numbers.divide(longitude, (SubLObject)temporal_projection_utilities.$int97$360))));
        final SubLObject m = Numbers.mod(Numbers.add((SubLObject)temporal_projection_utilities.$float100$357_5291, Numbers.multiply((SubLObject)temporal_projection_utilities.$float101$0_98560028, Numbers.subtract(j_star, (SubLObject)temporal_projection_utilities.$int98$2451545))), (SubLObject)temporal_projection_utilities.$int97$360);
        final SubLObject m_in_radians = Numbers.multiply(m, (SubLObject)temporal_projection_utilities.$float95$0_0174532925);
        final SubLObject c = Numbers.add(Numbers.multiply((SubLObject)temporal_projection_utilities.$float102$1_9148, Numbers.sin(m_in_radians)), Numbers.multiply((SubLObject)temporal_projection_utilities.$float103$0_02, Numbers.sin(Numbers.multiply((SubLObject)temporal_projection_utilities.TWO_INTEGER, m_in_radians))), Numbers.multiply((SubLObject)temporal_projection_utilities.$float26$3_0e_4, Numbers.sin(Numbers.multiply((SubLObject)temporal_projection_utilities.THREE_INTEGER, m_in_radians))));
        final SubLObject lambda_value = Numbers.mod(Numbers.add(new SubLObject[] { m, temporal_projection_utilities.$float104$102_9372, c, temporal_projection_utilities.$int105$180 }), (SubLObject)temporal_projection_utilities.$int97$360);
        final SubLObject lambda_in_radians = Numbers.multiply(lambda_value, (SubLObject)temporal_projection_utilities.$float95$0_0174532925);
        final SubLObject delta = Numbers.asin(Numbers.multiply(Numbers.sin(lambda_in_radians), (SubLObject)temporal_projection_utilities.$float106$0_39794863131));
        final SubLObject sin_delta = Numbers.sin(delta);
        final SubLObject cos_delta = Numbers.cos(delta);
        final SubLObject cos_omega = Numbers.divide(Numbers.subtract((SubLObject)temporal_projection_utilities.$float107$_0_014485726139, Numbers.multiply(Numbers.sin(latitude_in_radians), sin_delta)), Numbers.multiply(Numbers.cos(latitude_in_radians), cos_delta));
        if (cos_omega.numG((SubLObject)temporal_projection_utilities.ONE_INTEGER) || cos_omega.numL((SubLObject)temporal_projection_utilities.MINUS_ONE_INTEGER)) {
            return (SubLObject)temporal_projection_utilities.NIL;
        }
        final SubLObject omega_in_radians = Numbers.acos(cos_omega);
        final SubLObject omega_in_degrees = Numbers.multiply(omega_in_radians, (SubLObject)temporal_projection_utilities.$float108$57_2957795);
        final SubLObject j_star_two = Numbers.add((SubLObject)temporal_projection_utilities.$int98$2451545, Numbers.add((SubLObject)temporal_projection_utilities.$float99$8_999999999999999e_4, Numbers.add(n, Numbers.divide(Numbers.add(omega_in_degrees, longitude), (SubLObject)temporal_projection_utilities.$int97$360))));
        final SubLObject j_set = Numbers.add(j_star_two, Numbers.subtract(Numbers.multiply((SubLObject)temporal_projection_utilities.$float109$0_0053, Numbers.sin(m_in_radians)), Numbers.multiply((SubLObject)temporal_projection_utilities.$float110$0_0069, Numbers.sin(Numbers.multiply((SubLObject)temporal_projection_utilities.TWO_INTEGER, lambda_in_radians)))));
        if (temporal_projection_utilities.NIL != j_set) {
            final SubLObject no_of_seconds = Numbers.multiply((SubLObject)temporal_projection_utilities.$int111$86400, Numbers.subtract(Numbers.add(j_set, (SubLObject)temporal_projection_utilities.$float63$0_5), Numbers.floor(j_set, (SubLObject)temporal_projection_utilities.UNPROVIDED)));
            final SubLObject no_of_hours = Numbers.floor(Numbers.divide(no_of_seconds, (SubLObject)temporal_projection_utilities.$int112$3600), (SubLObject)temporal_projection_utilities.UNPROVIDED);
            final SubLObject no_of_minutes = Numbers.floor(Numbers.divide(Numbers.subtract(no_of_seconds, Numbers.multiply(no_of_hours, (SubLObject)temporal_projection_utilities.$int112$3600)), (SubLObject)temporal_projection_utilities.$int43$60), (SubLObject)temporal_projection_utilities.UNPROVIDED);
            final SubLObject date_after_one_day = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const114$evaluate, (SubLObject)temporal_projection_utilities.$sym113$_X, (SubLObject)ConsesLow.listS(temporal_projection_utilities.$const115$DateAfterFn, date, (SubLObject)temporal_projection_utilities.$list116)), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)));
            if (temporal_projection_utilities.NIL != no_of_hours && temporal_projection_utilities.NIL != no_of_minutes && temporal_projection_utilities.NIL != offset && no_of_hours.numG((SubLObject)temporal_projection_utilities.$int117$23)) {
                return convert_offset((SubLObject)ConsesLow.list(temporal_projection_utilities.$const89$MinuteFn, no_of_minutes, (SubLObject)ConsesLow.list(temporal_projection_utilities.$const88$HourFn, Numbers.subtract(no_of_hours, (SubLObject)temporal_projection_utilities.$int118$24), date_after_one_day)), offset, date);
            }
            if (temporal_projection_utilities.NIL != no_of_hours && temporal_projection_utilities.NIL != no_of_minutes && temporal_projection_utilities.NIL != offset) {
                return convert_offset((SubLObject)ConsesLow.list(temporal_projection_utilities.$const89$MinuteFn, no_of_minutes, (SubLObject)ConsesLow.list(temporal_projection_utilities.$const88$HourFn, no_of_hours, date)), offset, date);
            }
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 18838L)
    public static SubLObject calculate_dusk_time(final SubLObject latitude, final SubLObject longitude, final SubLObject date, final SubLObject offset) {
        final SubLObject universal_time = date_utilities.cycl_date_to_universal_time(date);
        final SubLObject latitude_in_radians = Numbers.multiply((SubLObject)temporal_projection_utilities.$float95$0_0174532925, latitude);
        final SubLObject julian_date = numeric_date_utilities.get_julian_date(universal_time, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        final SubLObject n_star = Numbers.subtract(Numbers.subtract(julian_date, (SubLObject)temporal_projection_utilities.$float96$2451545_0009), Numbers.divide(longitude, (SubLObject)temporal_projection_utilities.$int97$360));
        final SubLObject n = Numbers.round(Numbers.add(n_star, (SubLObject)temporal_projection_utilities.$float63$0_5), (SubLObject)temporal_projection_utilities.UNPROVIDED);
        final SubLObject j_star = Numbers.add((SubLObject)temporal_projection_utilities.$int98$2451545, Numbers.add((SubLObject)temporal_projection_utilities.$float99$8_999999999999999e_4, Numbers.add(n, Numbers.divide(longitude, (SubLObject)temporal_projection_utilities.$int97$360))));
        final SubLObject m = Numbers.mod(Numbers.add((SubLObject)temporal_projection_utilities.$float100$357_5291, Numbers.multiply((SubLObject)temporal_projection_utilities.$float101$0_98560028, Numbers.subtract(j_star, (SubLObject)temporal_projection_utilities.$int98$2451545))), (SubLObject)temporal_projection_utilities.$int97$360);
        final SubLObject m_in_radians = Numbers.multiply(m, (SubLObject)temporal_projection_utilities.$float95$0_0174532925);
        final SubLObject c = Numbers.add(Numbers.multiply((SubLObject)temporal_projection_utilities.$float102$1_9148, Numbers.sin(m_in_radians)), Numbers.multiply((SubLObject)temporal_projection_utilities.$float103$0_02, Numbers.sin(Numbers.multiply((SubLObject)temporal_projection_utilities.TWO_INTEGER, m_in_radians))), Numbers.multiply((SubLObject)temporal_projection_utilities.$float26$3_0e_4, Numbers.sin(Numbers.multiply((SubLObject)temporal_projection_utilities.THREE_INTEGER, m_in_radians))));
        final SubLObject lambda_value = Numbers.mod(Numbers.add(new SubLObject[] { m, temporal_projection_utilities.$float104$102_9372, c, temporal_projection_utilities.$int105$180 }), (SubLObject)temporal_projection_utilities.$int97$360);
        final SubLObject lambda_in_radians = Numbers.multiply(lambda_value, (SubLObject)temporal_projection_utilities.$float95$0_0174532925);
        final SubLObject delta = Numbers.asin(Numbers.multiply(Numbers.sin(lambda_in_radians), (SubLObject)temporal_projection_utilities.$float106$0_39794863131));
        final SubLObject sin_delta = Numbers.sin(delta);
        final SubLObject cos_delta = Numbers.cos(delta);
        final SubLObject cos_omega = Numbers.divide(Numbers.subtract((SubLObject)temporal_projection_utilities.$float107$_0_014485726139, Numbers.multiply(Numbers.sin(latitude_in_radians), sin_delta)), Numbers.multiply(Numbers.cos(latitude_in_radians), cos_delta));
        if (cos_omega.numG((SubLObject)temporal_projection_utilities.ONE_INTEGER) || cos_omega.numL((SubLObject)temporal_projection_utilities.MINUS_ONE_INTEGER)) {
            return (SubLObject)temporal_projection_utilities.NIL;
        }
        final SubLObject omega_in_radians = Numbers.acos(cos_omega);
        final SubLObject omega_in_degrees = Numbers.multiply(omega_in_radians, (SubLObject)temporal_projection_utilities.$float108$57_2957795);
        final SubLObject j_star_two = Numbers.add((SubLObject)temporal_projection_utilities.$int98$2451545, Numbers.add((SubLObject)temporal_projection_utilities.$float99$8_999999999999999e_4, Numbers.add(n, Numbers.divide(Numbers.add(omega_in_degrees, (SubLObject)temporal_projection_utilities.SIX_INTEGER, longitude), (SubLObject)temporal_projection_utilities.$int97$360))));
        final SubLObject j_set = Numbers.add(j_star_two, Numbers.subtract(Numbers.multiply((SubLObject)temporal_projection_utilities.$float109$0_0053, Numbers.sin(m_in_radians)), Numbers.multiply((SubLObject)temporal_projection_utilities.$float110$0_0069, Numbers.sin(Numbers.multiply((SubLObject)temporal_projection_utilities.TWO_INTEGER, lambda_in_radians)))));
        if (temporal_projection_utilities.NIL != j_set) {
            final SubLObject no_of_seconds = Numbers.multiply((SubLObject)temporal_projection_utilities.$int111$86400, Numbers.subtract(Numbers.add(j_set, (SubLObject)temporal_projection_utilities.$float63$0_5), Numbers.floor(j_set, (SubLObject)temporal_projection_utilities.UNPROVIDED)));
            final SubLObject no_of_hours = Numbers.floor(Numbers.divide(no_of_seconds, (SubLObject)temporal_projection_utilities.$int112$3600), (SubLObject)temporal_projection_utilities.UNPROVIDED);
            final SubLObject no_of_minutes = Numbers.floor(Numbers.divide(Numbers.subtract(no_of_seconds, Numbers.multiply(no_of_hours, (SubLObject)temporal_projection_utilities.$int112$3600)), (SubLObject)temporal_projection_utilities.$int43$60), (SubLObject)temporal_projection_utilities.UNPROVIDED);
            final SubLObject date_after_one_day = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const114$evaluate, (SubLObject)temporal_projection_utilities.$sym113$_X, (SubLObject)ConsesLow.listS(temporal_projection_utilities.$const115$DateAfterFn, date, (SubLObject)temporal_projection_utilities.$list116)), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)));
            if (temporal_projection_utilities.NIL != no_of_hours && temporal_projection_utilities.NIL != no_of_minutes && temporal_projection_utilities.NIL != offset && no_of_hours.numG((SubLObject)temporal_projection_utilities.$int117$23)) {
                return convert_offset((SubLObject)ConsesLow.list(temporal_projection_utilities.$const89$MinuteFn, no_of_minutes, (SubLObject)ConsesLow.list(temporal_projection_utilities.$const88$HourFn, Numbers.subtract(no_of_hours, (SubLObject)temporal_projection_utilities.$int118$24), date_after_one_day)), offset, date);
            }
            if (temporal_projection_utilities.NIL != no_of_hours && temporal_projection_utilities.NIL != no_of_minutes && temporal_projection_utilities.NIL != offset) {
                return convert_offset((SubLObject)ConsesLow.list(temporal_projection_utilities.$const89$MinuteFn, no_of_minutes, (SubLObject)ConsesLow.list(temporal_projection_utilities.$const88$HourFn, no_of_hours, date)), offset, date);
            }
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 21154L)
    public static SubLObject calculate_sunrise_time(final SubLObject latitude, final SubLObject longitude, final SubLObject date, final SubLObject offset) {
        final SubLObject universal_time = date_utilities.cycl_date_to_universal_time(date);
        final SubLObject latitude_in_radians = Numbers.multiply((SubLObject)temporal_projection_utilities.$float95$0_0174532925, latitude);
        final SubLObject julian_date = numeric_date_utilities.get_julian_date(universal_time, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        final SubLObject n_star = Numbers.subtract(Numbers.subtract(julian_date, (SubLObject)temporal_projection_utilities.$float96$2451545_0009), Numbers.divide(longitude, (SubLObject)temporal_projection_utilities.$int97$360));
        final SubLObject n = Numbers.round(Numbers.add(n_star, (SubLObject)temporal_projection_utilities.$float63$0_5), (SubLObject)temporal_projection_utilities.UNPROVIDED);
        final SubLObject j_star = Numbers.add((SubLObject)temporal_projection_utilities.$int98$2451545, Numbers.add((SubLObject)temporal_projection_utilities.$float99$8_999999999999999e_4, Numbers.add(n, Numbers.divide(longitude, (SubLObject)temporal_projection_utilities.$int97$360))));
        final SubLObject m = Numbers.mod(Numbers.add((SubLObject)temporal_projection_utilities.$float100$357_5291, Numbers.multiply((SubLObject)temporal_projection_utilities.$float101$0_98560028, Numbers.subtract(j_star, (SubLObject)temporal_projection_utilities.$int98$2451545))), (SubLObject)temporal_projection_utilities.$int97$360);
        final SubLObject m_in_radians = Numbers.multiply(m, (SubLObject)temporal_projection_utilities.$float95$0_0174532925);
        final SubLObject c = Numbers.add(Numbers.multiply((SubLObject)temporal_projection_utilities.$float102$1_9148, Numbers.sin(m_in_radians)), Numbers.multiply((SubLObject)temporal_projection_utilities.$float103$0_02, Numbers.sin(Numbers.multiply((SubLObject)temporal_projection_utilities.TWO_INTEGER, m_in_radians))), Numbers.multiply((SubLObject)temporal_projection_utilities.$float26$3_0e_4, Numbers.sin(Numbers.multiply((SubLObject)temporal_projection_utilities.THREE_INTEGER, m_in_radians))));
        final SubLObject lambda_value = Numbers.mod(Numbers.add(new SubLObject[] { m, temporal_projection_utilities.$float104$102_9372, c, temporal_projection_utilities.$int105$180 }), (SubLObject)temporal_projection_utilities.$int97$360);
        final SubLObject lambda_in_radians = Numbers.multiply(lambda_value, (SubLObject)temporal_projection_utilities.$float95$0_0174532925);
        final SubLObject j_transit = Numbers.subtract(Numbers.add(j_star, Numbers.multiply((SubLObject)temporal_projection_utilities.$float109$0_0053, Numbers.sin(m_in_radians))), Numbers.multiply((SubLObject)temporal_projection_utilities.$float110$0_0069, Numbers.sin(Numbers.multiply((SubLObject)temporal_projection_utilities.TWO_INTEGER, lambda_in_radians))));
        final SubLObject delta = Numbers.asin(Numbers.multiply(Numbers.sin(lambda_in_radians), (SubLObject)temporal_projection_utilities.$float106$0_39794863131));
        final SubLObject sin_delta = Numbers.sin(delta);
        final SubLObject cos_delta = Numbers.cos(delta);
        final SubLObject cos_omega = Numbers.divide(Numbers.subtract((SubLObject)temporal_projection_utilities.$float107$_0_014485726139, Numbers.multiply(Numbers.sin(latitude_in_radians), sin_delta)), Numbers.multiply(Numbers.cos(latitude_in_radians), cos_delta));
        if (cos_omega.numG((SubLObject)temporal_projection_utilities.ONE_INTEGER) || cos_omega.numL((SubLObject)temporal_projection_utilities.MINUS_ONE_INTEGER)) {
            return (SubLObject)temporal_projection_utilities.NIL;
        }
        final SubLObject omega_in_radians = Numbers.acos(cos_omega);
        final SubLObject omega_in_degrees = Numbers.multiply(omega_in_radians, (SubLObject)temporal_projection_utilities.$float108$57_2957795);
        final SubLObject j_star_two = Numbers.add((SubLObject)temporal_projection_utilities.$int98$2451545, Numbers.add((SubLObject)temporal_projection_utilities.$float99$8_999999999999999e_4, Numbers.add(n, Numbers.divide(Numbers.add(omega_in_degrees, longitude), (SubLObject)temporal_projection_utilities.$int97$360))));
        final SubLObject j_set = Numbers.add(j_star_two, Numbers.subtract(Numbers.multiply((SubLObject)temporal_projection_utilities.$float109$0_0053, Numbers.sin(m_in_radians)), Numbers.multiply((SubLObject)temporal_projection_utilities.$float110$0_0069, Numbers.sin(Numbers.multiply((SubLObject)temporal_projection_utilities.TWO_INTEGER, lambda_in_radians)))));
        final SubLObject j_rise = Numbers.subtract(j_transit, Numbers.subtract(j_set, j_transit));
        if (temporal_projection_utilities.NIL != j_rise) {
            final SubLObject no_of_seconds = Numbers.multiply((SubLObject)temporal_projection_utilities.$int111$86400, Numbers.subtract(Numbers.add(j_rise, (SubLObject)temporal_projection_utilities.$float63$0_5), Numbers.floor(j_rise, (SubLObject)temporal_projection_utilities.UNPROVIDED)));
            final SubLObject no_of_hours = Numbers.floor(Numbers.divide(no_of_seconds, (SubLObject)temporal_projection_utilities.$int112$3600), (SubLObject)temporal_projection_utilities.UNPROVIDED);
            final SubLObject no_of_minutes = Numbers.floor(Numbers.divide(Numbers.subtract(no_of_seconds, Numbers.multiply(no_of_hours, (SubLObject)temporal_projection_utilities.$int112$3600)), (SubLObject)temporal_projection_utilities.$int43$60), (SubLObject)temporal_projection_utilities.UNPROVIDED);
            final SubLObject date_after_one_day = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const114$evaluate, (SubLObject)temporal_projection_utilities.$sym113$_X, (SubLObject)ConsesLow.listS(temporal_projection_utilities.$const115$DateAfterFn, date, (SubLObject)temporal_projection_utilities.$list116)), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)));
            if (temporal_projection_utilities.NIL != no_of_hours && temporal_projection_utilities.NIL != no_of_minutes && temporal_projection_utilities.NIL != offset && no_of_hours.numG((SubLObject)temporal_projection_utilities.$int117$23)) {
                return convert_offset((SubLObject)ConsesLow.list(temporal_projection_utilities.$const89$MinuteFn, no_of_minutes, (SubLObject)ConsesLow.list(temporal_projection_utilities.$const88$HourFn, Numbers.subtract(no_of_hours, (SubLObject)temporal_projection_utilities.$int118$24), date_after_one_day)), offset, date);
            }
            if (temporal_projection_utilities.NIL != no_of_hours && temporal_projection_utilities.NIL != no_of_minutes && temporal_projection_utilities.NIL != offset) {
                return convert_offset((SubLObject)ConsesLow.list(temporal_projection_utilities.$const89$MinuteFn, no_of_minutes, (SubLObject)ConsesLow.list(temporal_projection_utilities.$const88$HourFn, no_of_hours, date)), offset, date);
            }
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 23564L)
    public static SubLObject calculate_dawn_time(final SubLObject latitude, final SubLObject longitude, final SubLObject date, final SubLObject offset) {
        final SubLObject universal_time = date_utilities.cycl_date_to_universal_time(date);
        final SubLObject latitude_in_radians = Numbers.multiply((SubLObject)temporal_projection_utilities.$float95$0_0174532925, latitude);
        final SubLObject julian_date = numeric_date_utilities.get_julian_date(universal_time, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        final SubLObject n_star = Numbers.subtract(Numbers.subtract(julian_date, (SubLObject)temporal_projection_utilities.$float96$2451545_0009), Numbers.divide(longitude, (SubLObject)temporal_projection_utilities.$int97$360));
        final SubLObject n = Numbers.round(Numbers.add(n_star, (SubLObject)temporal_projection_utilities.$float63$0_5), (SubLObject)temporal_projection_utilities.UNPROVIDED);
        final SubLObject j_star = Numbers.add((SubLObject)temporal_projection_utilities.$int98$2451545, Numbers.add((SubLObject)temporal_projection_utilities.$float99$8_999999999999999e_4, Numbers.add(n, Numbers.divide(longitude, (SubLObject)temporal_projection_utilities.$int97$360))));
        final SubLObject m = Numbers.mod(Numbers.add((SubLObject)temporal_projection_utilities.$float100$357_5291, Numbers.multiply((SubLObject)temporal_projection_utilities.$float101$0_98560028, Numbers.subtract(j_star, (SubLObject)temporal_projection_utilities.$int98$2451545))), (SubLObject)temporal_projection_utilities.$int97$360);
        final SubLObject m_in_radians = Numbers.multiply(m, (SubLObject)temporal_projection_utilities.$float95$0_0174532925);
        final SubLObject c = Numbers.add(Numbers.multiply((SubLObject)temporal_projection_utilities.$float102$1_9148, Numbers.sin(m_in_radians)), Numbers.multiply((SubLObject)temporal_projection_utilities.$float103$0_02, Numbers.sin(Numbers.multiply((SubLObject)temporal_projection_utilities.TWO_INTEGER, m_in_radians))), Numbers.multiply((SubLObject)temporal_projection_utilities.$float26$3_0e_4, Numbers.sin(Numbers.multiply((SubLObject)temporal_projection_utilities.THREE_INTEGER, m_in_radians))));
        final SubLObject lambda_value = Numbers.mod(Numbers.add(new SubLObject[] { m, temporal_projection_utilities.$float104$102_9372, c, temporal_projection_utilities.$int105$180 }), (SubLObject)temporal_projection_utilities.$int97$360);
        final SubLObject lambda_in_radians = Numbers.multiply(lambda_value, (SubLObject)temporal_projection_utilities.$float95$0_0174532925);
        final SubLObject j_transit = Numbers.subtract(Numbers.add(j_star, Numbers.multiply((SubLObject)temporal_projection_utilities.$float109$0_0053, Numbers.sin(m_in_radians))), Numbers.multiply((SubLObject)temporal_projection_utilities.$float110$0_0069, Numbers.sin(Numbers.multiply((SubLObject)temporal_projection_utilities.TWO_INTEGER, lambda_in_radians))));
        final SubLObject delta = Numbers.asin(Numbers.multiply(Numbers.sin(lambda_in_radians), (SubLObject)temporal_projection_utilities.$float106$0_39794863131));
        final SubLObject sin_delta = Numbers.sin(delta);
        final SubLObject cos_delta = Numbers.cos(delta);
        final SubLObject cos_omega = Numbers.divide(Numbers.subtract((SubLObject)temporal_projection_utilities.$float107$_0_014485726139, Numbers.multiply(Numbers.sin(latitude_in_radians), sin_delta)), Numbers.multiply(Numbers.cos(latitude_in_radians), cos_delta));
        if (cos_omega.numG((SubLObject)temporal_projection_utilities.ONE_INTEGER) || cos_omega.numL((SubLObject)temporal_projection_utilities.MINUS_ONE_INTEGER)) {
            return (SubLObject)temporal_projection_utilities.NIL;
        }
        final SubLObject omega_in_radians = Numbers.acos(cos_omega);
        final SubLObject omega_in_degrees = Numbers.multiply(omega_in_radians, (SubLObject)temporal_projection_utilities.$float108$57_2957795);
        final SubLObject j_star_two = Numbers.add((SubLObject)temporal_projection_utilities.$int98$2451545, Numbers.add((SubLObject)temporal_projection_utilities.$float99$8_999999999999999e_4, Numbers.add(n, Numbers.divide(Numbers.add(omega_in_degrees, (SubLObject)temporal_projection_utilities.SIX_INTEGER, longitude), (SubLObject)temporal_projection_utilities.$int97$360))));
        final SubLObject j_set = Numbers.add(j_star_two, Numbers.subtract(Numbers.multiply((SubLObject)temporal_projection_utilities.$float109$0_0053, Numbers.sin(m_in_radians)), Numbers.multiply((SubLObject)temporal_projection_utilities.$float110$0_0069, Numbers.sin(Numbers.multiply((SubLObject)temporal_projection_utilities.TWO_INTEGER, lambda_in_radians)))));
        final SubLObject j_rise = Numbers.subtract(j_transit, Numbers.subtract(j_set, j_transit));
        if (temporal_projection_utilities.NIL != j_rise) {
            final SubLObject no_of_seconds = Numbers.multiply((SubLObject)temporal_projection_utilities.$int111$86400, Numbers.subtract(Numbers.add(j_rise, (SubLObject)temporal_projection_utilities.$float63$0_5), Numbers.floor(j_rise, (SubLObject)temporal_projection_utilities.UNPROVIDED)));
            final SubLObject no_of_hours = Numbers.floor(Numbers.divide(no_of_seconds, (SubLObject)temporal_projection_utilities.$int112$3600), (SubLObject)temporal_projection_utilities.UNPROVIDED);
            final SubLObject no_of_minutes = Numbers.floor(Numbers.divide(Numbers.subtract(no_of_seconds, Numbers.multiply(no_of_hours, (SubLObject)temporal_projection_utilities.$int112$3600)), (SubLObject)temporal_projection_utilities.$int43$60), (SubLObject)temporal_projection_utilities.UNPROVIDED);
            final SubLObject date_after_one_day = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const114$evaluate, (SubLObject)temporal_projection_utilities.$sym113$_X, (SubLObject)ConsesLow.listS(temporal_projection_utilities.$const115$DateAfterFn, date, (SubLObject)temporal_projection_utilities.$list116)), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)));
            if (temporal_projection_utilities.NIL != no_of_hours && temporal_projection_utilities.NIL != no_of_minutes && temporal_projection_utilities.NIL != offset && no_of_hours.numG((SubLObject)temporal_projection_utilities.$int117$23)) {
                return convert_offset((SubLObject)ConsesLow.list(temporal_projection_utilities.$const89$MinuteFn, no_of_minutes, (SubLObject)ConsesLow.list(temporal_projection_utilities.$const88$HourFn, Numbers.subtract(no_of_hours, (SubLObject)temporal_projection_utilities.$int118$24), date_after_one_day)), offset, date);
            }
            if (temporal_projection_utilities.NIL != no_of_hours && temporal_projection_utilities.NIL != no_of_minutes && temporal_projection_utilities.NIL != offset) {
                return convert_offset((SubLObject)ConsesLow.list(temporal_projection_utilities.$const89$MinuteFn, no_of_minutes, (SubLObject)ConsesLow.list(temporal_projection_utilities.$const88$HourFn, no_of_hours, date)), offset, date);
            }
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 25919L)
    public static SubLObject convert_offset(final SubLObject date, final SubLObject offset, final SubLObject initial_date) {
        final SubLObject v_answer = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const114$evaluate, (SubLObject)temporal_projection_utilities.$sym113$_X, (SubLObject)ConsesLow.list(temporal_projection_utilities.$const119$DateBeforeFn, date, offset)), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)));
        final SubLObject day_of_date_of_answer = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const114$evaluate, (SubLObject)temporal_projection_utilities.$sym113$_X, (SubLObject)ConsesLow.list(temporal_projection_utilities.$const120$DayOfDateFn, v_answer)), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)));
        final SubLObject day_of_initial_date = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const114$evaluate, (SubLObject)temporal_projection_utilities.$sym113$_X, (SubLObject)ConsesLow.list(temporal_projection_utilities.$const120$DayOfDateFn, initial_date)), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)));
        final SubLObject time_elapsed = temporal_projection_cols.find_time_elapsed(day_of_initial_date, day_of_date_of_answer);
        if (temporal_projection_utilities.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const121$laterThan, day_of_date_of_answer, day_of_initial_date), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)) {
            return bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const114$evaluate, (SubLObject)temporal_projection_utilities.$sym113$_X, (SubLObject)ConsesLow.list(temporal_projection_utilities.$const119$DateBeforeFn, v_answer, time_elapsed)), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)));
        }
        if (temporal_projection_utilities.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const121$laterThan, day_of_initial_date, day_of_date_of_answer), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)) {
            return bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const114$evaluate, (SubLObject)temporal_projection_utilities.$sym113$_X, (SubLObject)ConsesLow.list(temporal_projection_utilities.$const115$DateAfterFn, v_answer, time_elapsed)), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)));
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 26869L)
    public static SubLObject find_offset_for_location_on_date(final SubLObject place, final SubLObject date, SubLObject time_zone_1) {
        if (time_zone_1 == temporal_projection_utilities.UNPROVIDED) {
            time_zone_1 = (SubLObject)temporal_projection_utilities.NIL;
        }
        SubLObject time_zone = (SubLObject)temporal_projection_utilities.NIL;
        if (temporal_projection_utilities.NIL != time_zone_1) {
            time_zone = time_zone_1;
        }
        else {
            time_zone = find_timezone_for_place_at_date(place, date);
        }
        if (temporal_projection_utilities.NIL != time_zone) {
            final SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs_in_any_mt(time_zone, temporal_projection_utilities.$const122$timeZoneOffsetToUTC, (SubLObject)temporal_projection_utilities.ONE_INTEGER, (SubLObject)temporal_projection_utilities.UNPROVIDED));
            if (temporal_projection_utilities.NIL != assertion) {
                final SubLObject gaf = assertions_high.gaf_formula(assertion);
                return Values.values(cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_utilities.UNPROVIDED), assertion);
            }
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 27375L)
    public static SubLObject find_timezone_for_place_at_date(final SubLObject place, final SubLObject date_1) {
        SubLObject date = (SubLObject)temporal_projection_utilities.NIL;
        if (cycl_utilities.formula_arg0(date_1).eql(temporal_projection_utilities.$const123$TimeZoneFn)) {
            date = cycl_utilities.formula_arg1(date_1, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        }
        else {
            date = date_1;
        }
        final SubLObject all_time_zones_and_justifications = get_time_zones_for_place(place);
        final SubLObject latitude = get_latitude_of_place(place);
        final SubLObject year_of_date = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const114$evaluate, (SubLObject)temporal_projection_utilities.$sym113$_X, (SubLObject)ConsesLow.list(temporal_projection_utilities.$const124$YearOfDateFn, date)), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)));
        SubLObject daylight_saving_time = (SubLObject)temporal_projection_utilities.NIL;
        if (temporal_projection_utilities.NIL != place && temporal_projection_utilities.NIL != latitude) {
            final SubLObject starting_point_of_daylight_saving_time = find_starting_point_of_daylight_saving_time(place, year_of_date);
            final SubLObject ending_point_of_daylight_saving_time = find_ending_point_of_daylight_saving_time(place, year_of_date);
            if (latitude.numG((SubLObject)temporal_projection_utilities.ZERO_INTEGER) && temporal_projection_utilities.NIL != date_utilities.later_than(date, starting_point_of_daylight_saving_time) && temporal_projection_utilities.NIL != date_utilities.later_than(ending_point_of_daylight_saving_time, date)) {
                daylight_saving_time = (SubLObject)temporal_projection_utilities.T;
            }
            if (latitude.numL((SubLObject)temporal_projection_utilities.ZERO_INTEGER) && (temporal_projection_utilities.NIL != date_utilities.later_than(date, starting_point_of_daylight_saving_time) || temporal_projection_utilities.NIL != date_utilities.later_than(ending_point_of_daylight_saving_time, date))) {
                daylight_saving_time = (SubLObject)temporal_projection_utilities.T;
            }
            SubLObject cdolist_list_var = all_time_zones_and_justifications;
            SubLObject entry = (SubLObject)temporal_projection_utilities.NIL;
            entry = cdolist_list_var.first();
            while (temporal_projection_utilities.NIL != cdolist_list_var) {
                final SubLObject time_zone = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym113$_X, cycl_utilities.formula_arg0(entry));
                final SubLObject just_1 = cycl_utilities.formula_arg1(entry, (SubLObject)temporal_projection_utilities.UNPROVIDED);
                if (temporal_projection_utilities.NIL != daylight_saving_time && temporal_projection_utilities.NIL != isa.isaP(time_zone, temporal_projection_utilities.$const125$DaylightSavingTimeZone, temporal_projection_utilities.$const69$EverythingPSC, (SubLObject)temporal_projection_utilities.UNPROVIDED)) {
                    return Values.values(time_zone, just_1);
                }
                if (temporal_projection_utilities.NIL == daylight_saving_time && temporal_projection_utilities.NIL == isa.isaP(time_zone, temporal_projection_utilities.$const125$DaylightSavingTimeZone, temporal_projection_utilities.$const69$EverythingPSC, (SubLObject)temporal_projection_utilities.UNPROVIDED)) {
                    return Values.values(time_zone, just_1);
                }
                cdolist_list_var = cdolist_list_var.rest();
                entry = cdolist_list_var.first();
            }
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 29086L)
    public static SubLObject get_time_zones_for_place(final SubLObject place_1) {
        SubLObject place = (SubLObject)temporal_projection_utilities.NIL;
        if (temporal_projection_utilities.NIL != nart_handles.nart_p(place_1)) {
            place = narts_high.nart_hl_formula(place_1);
        }
        else {
            place = place_1;
        }
        final SubLObject result = inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const126$and, (SubLObject)temporal_projection_utilities.$list127, (SubLObject)ConsesLow.list(temporal_projection_utilities.$const128$geographicallySubsumes, (SubLObject)temporal_projection_utilities.$sym113$_X, place)), temporal_projection_utilities.$const69$EverythingPSC, (SubLObject)temporal_projection_utilities.$list129);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 29855L)
    public static SubLObject find_starting_point_of_daylight_saving_time(final SubLObject place_1, final SubLObject year_of_date) {
        final SubLObject all_bindings = mt_context.ask_mt_query((SubLObject)temporal_projection_utilities.$list130, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        SubLObject place = (SubLObject)temporal_projection_utilities.NIL;
        if (temporal_projection_utilities.NIL != nart_handles.nart_p(place_1)) {
            place = narts_high.nart_hl_formula(place_1);
        }
        else {
            place = place_1;
        }
        if (place.isList() && cycl_utilities.formula_arg0(place).eql(temporal_projection_utilities.$const93$TerritoryFn)) {
            place = cycl_utilities.formula_arg1(place, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        }
        SubLObject cdolist_list_var = all_bindings;
        SubLObject binding = (SubLObject)temporal_projection_utilities.NIL;
        binding = cdolist_list_var.first();
        while (temporal_projection_utilities.NIL != cdolist_list_var) {
            final SubLObject place_type = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym113$_X, binding);
            final SubLObject month_type = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym131$_Y, binding);
            final SubLObject day_type = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym132$_Z, binding);
            final SubLObject num = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym133$_W, binding);
            if (temporal_projection_utilities.NIL != isa.isaP(place, place_type, temporal_projection_utilities.$const69$EverythingPSC, (SubLObject)temporal_projection_utilities.UNPROVIDED)) {
                SubLObject count = (SubLObject)temporal_projection_utilities.ZERO_INTEGER;
                SubLObject day;
                SubLObject date;
                for (day = (SubLObject)temporal_projection_utilities.NIL, day = (SubLObject)temporal_projection_utilities.ZERO_INTEGER; day.numL((SubLObject)temporal_projection_utilities.$int134$31); day = Numbers.add(day, (SubLObject)temporal_projection_utilities.ONE_INTEGER)) {
                    date = (SubLObject)ConsesLow.list(temporal_projection_utilities.$const86$DayFn, Numbers.add(day, (SubLObject)temporal_projection_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list(temporal_projection_utilities.$const87$MonthFn, month_type, year_of_date));
                    if (temporal_projection_utilities.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const11$isa, date, day_type), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)) {
                        count = Numbers.add(count, (SubLObject)temporal_projection_utilities.ONE_INTEGER);
                        if (count.numE(num)) {
                            return date;
                        }
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        final SubLObject answer_from_european_summer_time = find_starting_point_of_european_summer_time(place, year_of_date);
        if (temporal_projection_utilities.NIL != answer_from_european_summer_time) {
            return answer_from_european_summer_time;
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 31155L)
    public static SubLObject find_ending_point_of_daylight_saving_time(final SubLObject place_1, final SubLObject year_of_date) {
        final SubLObject all_bindings = mt_context.ask_mt_query((SubLObject)temporal_projection_utilities.$list135, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        SubLObject place = (SubLObject)temporal_projection_utilities.NIL;
        if (temporal_projection_utilities.NIL != nart_handles.nart_p(place_1)) {
            place = narts_high.nart_hl_formula(place_1);
        }
        else {
            place = place_1;
        }
        if (place.isList() && cycl_utilities.formula_arg0(place).eql(temporal_projection_utilities.$const93$TerritoryFn)) {
            place = cycl_utilities.formula_arg1(place, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        }
        SubLObject cdolist_list_var = all_bindings;
        SubLObject binding = (SubLObject)temporal_projection_utilities.NIL;
        binding = cdolist_list_var.first();
        while (temporal_projection_utilities.NIL != cdolist_list_var) {
            final SubLObject place_type = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym113$_X, binding);
            final SubLObject month_type = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym131$_Y, binding);
            final SubLObject day_type = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym132$_Z, binding);
            final SubLObject num = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym133$_W, binding);
            if (temporal_projection_utilities.NIL != isa.isaP(place, place_type, temporal_projection_utilities.$const69$EverythingPSC, (SubLObject)temporal_projection_utilities.UNPROVIDED)) {
                SubLObject count = (SubLObject)temporal_projection_utilities.ZERO_INTEGER;
                SubLObject day;
                SubLObject date;
                for (day = (SubLObject)temporal_projection_utilities.NIL, day = (SubLObject)temporal_projection_utilities.ZERO_INTEGER; day.numL((SubLObject)temporal_projection_utilities.$int134$31); day = Numbers.add(day, (SubLObject)temporal_projection_utilities.ONE_INTEGER)) {
                    date = (SubLObject)ConsesLow.list(temporal_projection_utilities.$const86$DayFn, Numbers.add(day, (SubLObject)temporal_projection_utilities.ONE_INTEGER), (SubLObject)ConsesLow.list(temporal_projection_utilities.$const87$MonthFn, month_type, year_of_date));
                    if (temporal_projection_utilities.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const11$isa, date, day_type), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)) {
                        count = Numbers.add(count, (SubLObject)temporal_projection_utilities.ONE_INTEGER);
                        if (count.numE(num)) {
                            return date;
                        }
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        final SubLObject answer_from_european_summer_time = find_ending_point_of_european_summer_time(place, year_of_date);
        if (temporal_projection_utilities.NIL != answer_from_european_summer_time) {
            return answer_from_european_summer_time;
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 32438L)
    public static SubLObject find_ending_point_of_european_summer_time(final SubLObject place, final SubLObject year_of_date) {
        if (temporal_projection_utilities.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const136$properGeographicalSubRegions, temporal_projection_utilities.$const137$EuropeanSummerTimeZone, place), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)) {
            final SubLObject day = Numbers.subtract((SubLObject)temporal_projection_utilities.$int134$31, Numbers.floor(Numbers.mod(Numbers.add(Numbers.divide(Numbers.multiply((SubLObject)temporal_projection_utilities.FIVE_INTEGER, cycl_utilities.formula_arg1(year_of_date, (SubLObject)temporal_projection_utilities.UNPROVIDED)), (SubLObject)temporal_projection_utilities.FOUR_INTEGER), (SubLObject)temporal_projection_utilities.ONE_INTEGER), (SubLObject)temporal_projection_utilities.SEVEN_INTEGER), (SubLObject)temporal_projection_utilities.UNPROVIDED));
            if (temporal_projection_utilities.NIL != day) {
                return (SubLObject)ConsesLow.list(temporal_projection_utilities.$const86$DayFn, day, (SubLObject)ConsesLow.list(temporal_projection_utilities.$const87$MonthFn, temporal_projection_utilities.$const138$October, year_of_date));
            }
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 32787L)
    public static SubLObject find_starting_point_of_european_summer_time(final SubLObject place, final SubLObject year_of_date) {
        if (temporal_projection_utilities.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const136$properGeographicalSubRegions, temporal_projection_utilities.$const137$EuropeanSummerTimeZone, place), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)) {
            final SubLObject day = Numbers.subtract((SubLObject)temporal_projection_utilities.$int134$31, Numbers.floor(Numbers.mod(Numbers.add(Numbers.divide(Numbers.multiply((SubLObject)temporal_projection_utilities.FIVE_INTEGER, cycl_utilities.formula_arg1(year_of_date, (SubLObject)temporal_projection_utilities.UNPROVIDED)), (SubLObject)temporal_projection_utilities.FOUR_INTEGER), (SubLObject)temporal_projection_utilities.FOUR_INTEGER), (SubLObject)temporal_projection_utilities.SEVEN_INTEGER), (SubLObject)temporal_projection_utilities.UNPROVIDED));
            if (temporal_projection_utilities.NIL != day) {
                return (SubLObject)ConsesLow.list(temporal_projection_utilities.$const86$DayFn, day, (SubLObject)ConsesLow.list(temporal_projection_utilities.$const87$MonthFn, temporal_projection_utilities.$const139$March, year_of_date));
            }
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 33136L)
    public static SubLObject cyc_time_zone_conversion(final SubLObject new_time_zone, final SubLObject date) {
        if (temporal_projection_utilities.NIL == isa.isaP(date, temporal_projection_utilities.$const140$Date, temporal_projection_utilities.$const69$EverythingPSC, (SubLObject)temporal_projection_utilities.UNPROVIDED) || temporal_projection_utilities.NIL == isa.isaP(new_time_zone, temporal_projection_utilities.$const141$TimeZone, temporal_projection_utilities.$const69$EverythingPSC, (SubLObject)temporal_projection_utilities.UNPROVIDED)) {
            return (SubLObject)temporal_projection_utilities.NIL;
        }
        return time_zone_conversion(new_time_zone, date);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 33444L)
    public static SubLObject time_zone_conversion(final SubLObject new_time_zone, final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject time_zone_of_date = cycl_utilities.formula_arg2(date, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        final SubLObject local_time_of_date = cycl_utilities.formula_arg1(date, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject offset_from_utc_1 = find_utc_offset_for_time_zone(time_zone_of_date);
        final SubLObject just_1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject offset_from_utc_2 = find_utc_offset_for_time_zone(new_time_zone);
        final SubLObject just_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject difference_of_offsets = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const114$evaluate, (SubLObject)temporal_projection_utilities.$sym113$_X, (SubLObject)ConsesLow.list(temporal_projection_utilities.$const143$DifferenceFn, offset_from_utc_1, offset_from_utc_2)), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)));
        if (temporal_projection_utilities.NIL != time_zone_of_date && temporal_projection_utilities.NIL != offset_from_utc_1 && temporal_projection_utilities.NIL != offset_from_utc_2 && temporal_projection_utilities.NIL != isa.isaP(time_zone_of_date, temporal_projection_utilities.$const141$TimeZone, temporal_projection_utilities.$const69$EverythingPSC, (SubLObject)temporal_projection_utilities.UNPROVIDED)) {
            final SubLObject final_time = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym113$_X, cycl_utilities.formula_arg0(inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const114$evaluate, (SubLObject)temporal_projection_utilities.$sym113$_X, (SubLObject)ConsesLow.list(temporal_projection_utilities.$const144$DateAfterDurationStartPreciseFn, local_time_of_date, difference_of_offsets)), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)));
            if (temporal_projection_utilities.NIL != final_time) {
                return Values.values((SubLObject)ConsesLow.list(temporal_projection_utilities.$const123$TimeZoneFn, final_time, new_time_zone), (SubLObject)ConsesLow.list(just_1, just_2));
            }
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 34388L)
    public static SubLObject find_utc_offset_for_time_zone(final SubLObject time_zone) {
        final SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs_in_any_mt(time_zone, temporal_projection_utilities.$const122$timeZoneOffsetToUTC, (SubLObject)temporal_projection_utilities.ONE_INTEGER, (SubLObject)temporal_projection_utilities.UNPROVIDED));
        if (temporal_projection_utilities.NIL != assertion) {
            return Values.values(cycl_utilities.formula_arg2(assertions_high.gaf_formula(assertion), (SubLObject)temporal_projection_utilities.UNPROVIDED), assertion);
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 34643L)
    public static SubLObject location_has_qualitative_time_of_day_at_time(final SubLObject location, final SubLObject time, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject time_zone = find_timezone_for_place_at_date(location, time);
        SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject local_time_at_location = find_local_time_at_location(location, time, time_zone);
        final SubLObject just_2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject day_of_date = cycl_utilities.formula_arg0(ask_utilities.query_variable((SubLObject)temporal_projection_utilities.$sym113$_X, (SubLObject)ConsesLow.list(temporal_projection_utilities.$const114$evaluate, (SubLObject)temporal_projection_utilities.$sym113$_X, (SubLObject)ConsesLow.list(temporal_projection_utilities.$const120$DayOfDateFn, local_time_at_location)), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED));
        thread.resetMultipleValues();
        final SubLObject sunrise_time = sunrise_time_for_location(location, day_of_date, time_zone);
        final SubLObject just_3 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject sunset_time = sunset_time_for_location(location, day_of_date, time_zone);
        final SubLObject dawn = dawn_time_for_location(location, day_of_date, time_zone);
        final SubLObject dusk = dusk_time_for_location(location, day_of_date, time_zone);
        SubLObject mid_day = (SubLObject)temporal_projection_utilities.NIL;
        SubLObject lst_of_answers = (SubLObject)temporal_projection_utilities.NIL;
        justifications = ConsesLow.append(justifications, just_2, (SubLObject)ConsesLow.list(just_3));
        if (temporal_projection_utilities.NIL == local_time_at_location || temporal_projection_utilities.NIL == sunrise_time || temporal_projection_utilities.NIL == sunset_time || temporal_projection_utilities.NIL == dawn || temporal_projection_utilities.NIL == dusk) {
            return (SubLObject)temporal_projection_utilities.NIL;
        }
        if (temporal_projection_utilities.NIL != check_midday_time(local_time_at_location)) {
            mid_day = (SubLObject)temporal_projection_utilities.T;
            lst_of_answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(temporal_projection_utilities.$const145$Midday, justifications), lst_of_answers);
        }
        if (temporal_projection_utilities.NIL != check_morning_time(local_time_at_location)) {
            lst_of_answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(temporal_projection_utilities.$const146$Morning, justifications), lst_of_answers);
        }
        if (temporal_projection_utilities.NIL != check_afternoon_time(local_time_at_location) && temporal_projection_utilities.NIL == mid_day) {
            lst_of_answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(temporal_projection_utilities.$const147$Afternoon, justifications), lst_of_answers);
        }
        if (temporal_projection_utilities.NIL != check_evening_time(local_time_at_location)) {
            lst_of_answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(temporal_projection_utilities.$const148$Evening, justifications), lst_of_answers);
        }
        if (temporal_projection_utilities.NIL != check_night_time(local_time_at_location, dusk, dawn)) {
            lst_of_answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(temporal_projection_utilities.$const149$Night, justifications), lst_of_answers);
        }
        if (temporal_projection_utilities.NIL != check_daytime_hours(local_time_at_location, sunrise_time, sunset_time)) {
            lst_of_answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(temporal_projection_utilities.$const150$DaytimeHours, justifications), lst_of_answers);
        }
        if (sunrise_time.equal(local_time_at_location)) {
            lst_of_answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(temporal_projection_utilities.$const151$Sunrise, justifications), lst_of_answers);
        }
        if (sunset_time.equal(local_time_at_location)) {
            lst_of_answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(temporal_projection_utilities.$const152$Sunset, justifications), lst_of_answers);
        }
        if (temporal_projection_utilities.NIL != check_dawn_time(local_time_at_location, dawn, sunrise_time)) {
            lst_of_answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(temporal_projection_utilities.$const153$Dawn, justifications), lst_of_answers);
            lst_of_answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(temporal_projection_utilities.$const154$Twilight, justifications), lst_of_answers);
        }
        if (temporal_projection_utilities.NIL != check_dusk_time(local_time_at_location, dusk, sunset_time)) {
            lst_of_answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(temporal_projection_utilities.$const155$Dusk, justifications), lst_of_answers);
            lst_of_answers = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(temporal_projection_utilities.$const154$Twilight, justifications), lst_of_answers);
        }
        return lst_of_answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 37065L)
    public static SubLObject location_has_sunrise_time(final SubLObject location, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (mt.isList()) {
            final SubLObject time = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(mt, (SubLObject)temporal_projection_utilities.UNPROVIDED), (SubLObject)temporal_projection_utilities.UNPROVIDED);
            if (temporal_projection_utilities.NIL != time && cycl_utilities.formula_arg0(time).eql(temporal_projection_utilities.$const123$TimeZoneFn)) {
                final SubLObject day_of_date = cycl_utilities.formula_arg1(time, (SubLObject)temporal_projection_utilities.UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject time_zone = find_timezone_for_place_at_date(location, day_of_date);
                final SubLObject just_1 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject sunrise_time = sunrise_time_for_location(location, day_of_date, time_zone);
                final SubLObject just_2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection_utilities.NIL != sunrise_time && temporal_projection_utilities.NIL != time_zone) {
                    return Values.values((SubLObject)ConsesLow.list(temporal_projection_utilities.$const123$TimeZoneFn, sunrise_time, time_zone), ConsesLow.append(just_1, (SubLObject)ConsesLow.list(just_2)));
                }
            }
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 37663L)
    public static SubLObject location_has_sunset_time(final SubLObject location, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (mt.isList()) {
            final SubLObject time = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(mt, (SubLObject)temporal_projection_utilities.UNPROVIDED), (SubLObject)temporal_projection_utilities.UNPROVIDED);
            if (temporal_projection_utilities.NIL != time && cycl_utilities.formula_arg0(time).eql(temporal_projection_utilities.$const123$TimeZoneFn)) {
                final SubLObject day_of_date = cycl_utilities.formula_arg1(time, (SubLObject)temporal_projection_utilities.UNPROVIDED);
                thread.resetMultipleValues();
                final SubLObject time_zone = find_timezone_for_place_at_date(location, day_of_date);
                final SubLObject just_1 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                final SubLObject sunset_time = sunset_time_for_location(location, day_of_date, time_zone);
                final SubLObject just_2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (temporal_projection_utilities.NIL != sunset_time && temporal_projection_utilities.NIL != time_zone) {
                    return Values.values((SubLObject)ConsesLow.list(temporal_projection_utilities.$const123$TimeZoneFn, sunset_time, time_zone), ConsesLow.append(just_1, (SubLObject)ConsesLow.list(just_2)));
                }
            }
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 38257L)
    public static SubLObject local_sunrise_time_for_coordinates(final SubLObject latitude, final SubLObject longitude, final SubLObject date_1, SubLObject mt) {
        if (mt == temporal_projection_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject day_of_date = (SubLObject)temporal_projection_utilities.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (cycl_utilities.formula_arg0(date_1).eql(temporal_projection_utilities.$const123$TimeZoneFn)) {
                day_of_date = cycl_utilities.formula_arg1(date_1, (SubLObject)temporal_projection_utilities.UNPROVIDED);
            }
            else {
                day_of_date = date_1;
            }
            thread.resetMultipleValues();
            final SubLObject offset = find_closest_match_for_latitude_and_longitude(latitude, longitude, day_of_date);
            final SubLObject just_3 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection_utilities.NIL != offset) {
                final SubLObject sunrise_time = calculate_sunrise_time(cycl_utilities.formula_arg1(latitude, (SubLObject)temporal_projection_utilities.UNPROVIDED), Numbers.subtract((SubLObject)temporal_projection_utilities.ZERO_INTEGER, cycl_utilities.formula_arg1(longitude, (SubLObject)temporal_projection_utilities.UNPROVIDED)), day_of_date, offset);
                if (temporal_projection_utilities.NIL != sunrise_time) {
                    return Values.values(sunrise_time, just_3);
                }
            }
            final SubLObject timezone_offset = estimate_timezone_offset(latitude, longitude);
            if (temporal_projection_utilities.NIL != timezone_offset) {
                final SubLObject sunrise_time2 = calculate_sunrise_time(cycl_utilities.formula_arg1(latitude, (SubLObject)temporal_projection_utilities.UNPROVIDED), Numbers.subtract((SubLObject)temporal_projection_utilities.ZERO_INTEGER, cycl_utilities.formula_arg1(longitude, (SubLObject)temporal_projection_utilities.UNPROVIDED)), day_of_date, timezone_offset);
                return Values.values(sunrise_time2, (SubLObject)temporal_projection_utilities.NIL);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 39172L)
    public static SubLObject local_sunset_time_for_coordinates(final SubLObject latitude, final SubLObject longitude, final SubLObject date_1, SubLObject mt) {
        if (mt == temporal_projection_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject day_of_date = (SubLObject)temporal_projection_utilities.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (cycl_utilities.formula_arg0(date_1).eql(temporal_projection_utilities.$const123$TimeZoneFn)) {
                day_of_date = cycl_utilities.formula_arg1(date_1, (SubLObject)temporal_projection_utilities.UNPROVIDED);
            }
            else {
                day_of_date = date_1;
            }
            thread.resetMultipleValues();
            final SubLObject offset = find_closest_match_for_latitude_and_longitude(latitude, longitude, day_of_date);
            final SubLObject just_3 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection_utilities.NIL != offset) {
                final SubLObject sunset_time = calculate_sunset_time(cycl_utilities.formula_arg1(latitude, (SubLObject)temporal_projection_utilities.UNPROVIDED), Numbers.subtract((SubLObject)temporal_projection_utilities.ZERO_INTEGER, cycl_utilities.formula_arg1(longitude, (SubLObject)temporal_projection_utilities.UNPROVIDED)), day_of_date, offset);
                if (temporal_projection_utilities.NIL != sunset_time) {
                    return Values.values(sunset_time, just_3);
                }
            }
            final SubLObject timezone_offset = estimate_timezone_offset(latitude, longitude);
            if (temporal_projection_utilities.NIL != timezone_offset) {
                final SubLObject sunset_time2 = calculate_sunset_time(cycl_utilities.formula_arg1(latitude, (SubLObject)temporal_projection_utilities.UNPROVIDED), Numbers.subtract((SubLObject)temporal_projection_utilities.ZERO_INTEGER, cycl_utilities.formula_arg1(longitude, (SubLObject)temporal_projection_utilities.UNPROVIDED)), day_of_date, timezone_offset);
                return Values.values(sunset_time2, (SubLObject)temporal_projection_utilities.NIL);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 40079L)
    public static SubLObject estimate_timezone_offset(final SubLObject latitude, final SubLObject longitude) {
        final SubLObject offset = Numbers.subtract((SubLObject)temporal_projection_utilities.ZERO_INTEGER, Numbers.divide(cycl_utilities.formula_arg1(longitude, (SubLObject)temporal_projection_utilities.UNPROVIDED), (SubLObject)temporal_projection_utilities.FIFTEEN_INTEGER));
        return (SubLObject)ConsesLow.list(temporal_projection_utilities.$const157$HoursDuration, offset);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 40260L)
    public static SubLObject find_closest_match_for_latitude_and_longitude(final SubLObject latitude, final SubLObject longitude, final SubLObject day_of_date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lat_1 = cycl_utilities.formula_arg1(latitude, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        final SubLObject longitude_1 = cycl_utilities.formula_arg1(longitude, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        final SubLObject pred_var = temporal_projection_utilities.$const92$latitude;
        if (temporal_projection_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
            final SubLObject str = (SubLObject)temporal_projection_utilities.NIL;
            final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
            try {
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                utilities_macros.$progress_notification_count$.bind((SubLObject)temporal_projection_utilities.ZERO_INTEGER, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)temporal_projection_utilities.ZERO_INTEGER, thread);
                utilities_macros.$progress_count$.bind((SubLObject)temporal_projection_utilities.ZERO_INTEGER, thread);
                utilities_macros.$is_noting_progressP$.bind((SubLObject)temporal_projection_utilities.T, thread);
                utilities_macros.$silent_progressP$.bind((SubLObject)((temporal_projection_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : temporal_projection_utilities.T), thread);
                utilities_macros.noting_progress_preamble(str);
                final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                SubLObject done_var = (SubLObject)temporal_projection_utilities.NIL;
                final SubLObject token_var = (SubLObject)temporal_projection_utilities.NIL;
                while (temporal_projection_utilities.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (temporal_projection_utilities.NIL != valid) {
                        utilities_macros.note_progress();
                        SubLObject final_index_iterator = (SubLObject)temporal_projection_utilities.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)temporal_projection_utilities.$kw73$GAF, (SubLObject)temporal_projection_utilities.NIL, (SubLObject)temporal_projection_utilities.NIL);
                            SubLObject done_var_$4 = (SubLObject)temporal_projection_utilities.NIL;
                            final SubLObject token_var_$5 = (SubLObject)temporal_projection_utilities.NIL;
                            while (temporal_projection_utilities.NIL == done_var_$4) {
                                final SubLObject assertion_1 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(assertion_1));
                                if (temporal_projection_utilities.NIL != valid_$6) {
                                    final SubLObject gaf_1 = assertions_high.gaf_formula(assertion_1);
                                    final SubLObject lat = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(gaf_1, (SubLObject)temporal_projection_utilities.UNPROVIDED), (SubLObject)temporal_projection_utilities.UNPROVIDED);
                                    if (Numbers.abs(Numbers.subtract(lat, lat_1)).numL((SubLObject)temporal_projection_utilities.FIVE_INTEGER)) {
                                        final SubLObject place = cycl_utilities.formula_arg1(gaf_1, (SubLObject)temporal_projection_utilities.UNPROVIDED);
                                        final SubLObject assertion_2 = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs(place, temporal_projection_utilities.$const94$longitude, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED));
                                        if (temporal_projection_utilities.NIL != assertion_2) {
                                            final SubLObject gaf_2 = assertions_high.gaf_formula(assertion_2);
                                            final SubLObject longitude_2 = cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(gaf_2, (SubLObject)temporal_projection_utilities.UNPROVIDED), (SubLObject)temporal_projection_utilities.UNPROVIDED);
                                            if (Numbers.abs(Numbers.subtract(longitude_1, longitude_2)).numL((SubLObject)temporal_projection_utilities.FIVE_INTEGER)) {
                                                final SubLObject time_zone = find_timezone_for_place_at_date(place, day_of_date);
                                                if (temporal_projection_utilities.NIL != time_zone) {
                                                    final SubLObject assertion = cycl_utilities.formula_arg0(kb_mapping_utilities.pred_value_gafs_in_any_mt(time_zone, temporal_projection_utilities.$const122$timeZoneOffsetToUTC, (SubLObject)temporal_projection_utilities.ONE_INTEGER, (SubLObject)temporal_projection_utilities.UNPROVIDED));
                                                    if (temporal_projection_utilities.NIL != assertion) {
                                                        final SubLObject gaf = assertions_high.gaf_formula(assertion);
                                                        return Values.values(cycl_utilities.formula_arg2(gaf, (SubLObject)temporal_projection_utilities.UNPROVIDED), (SubLObject)ConsesLow.list(assertion));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(temporal_projection_utilities.NIL == valid_$6);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)temporal_projection_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (temporal_projection_utilities.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(temporal_projection_utilities.NIL == valid);
                }
                utilities_macros.noting_progress_postamble();
            }
            finally {
                utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 41253L)
    public static SubLObject check_dawn_time(final SubLObject local_time, final SubLObject dawn, final SubLObject sunrise) {
        if (temporal_projection_utilities.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const121$laterThan, local_time, dawn), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED) && temporal_projection_utilities.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const121$laterThan, sunrise, local_time), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)) {
            return (SubLObject)temporal_projection_utilities.T;
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 41523L)
    public static SubLObject check_dusk_time(final SubLObject local_time, final SubLObject dusk, final SubLObject sunset) {
        if (temporal_projection_utilities.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const121$laterThan, local_time, sunset), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED) && temporal_projection_utilities.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const121$laterThan, dusk, local_time), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)) {
            return (SubLObject)temporal_projection_utilities.T;
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 41727L)
    public static SubLObject check_morning_time(final SubLObject local_time_at_location) {
        final SubLObject hour = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym113$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const158$hourNumberOfDate, (SubLObject)temporal_projection_utilities.$sym113$_X, local_time_at_location), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)));
        if (temporal_projection_utilities.NIL != hour && hour.numL((SubLObject)temporal_projection_utilities.TWELVE_INTEGER)) {
            return (SubLObject)temporal_projection_utilities.T;
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 41971L)
    public static SubLObject check_afternoon_time(final SubLObject local_time_at_location) {
        final SubLObject hour = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym113$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const158$hourNumberOfDate, (SubLObject)temporal_projection_utilities.$sym113$_X, local_time_at_location), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)));
        if (temporal_projection_utilities.NIL != hour && hour.numG((SubLObject)temporal_projection_utilities.ELEVEN_INTEGER) && hour.numL((SubLObject)temporal_projection_utilities.SEVENTEEN_INTEGER)) {
            return (SubLObject)temporal_projection_utilities.T;
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 42256L)
    public static SubLObject check_evening_time(final SubLObject local_time_at_location) {
        final SubLObject hour = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym113$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const158$hourNumberOfDate, (SubLObject)temporal_projection_utilities.$sym113$_X, local_time_at_location), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)));
        if (temporal_projection_utilities.NIL != hour && hour.numG((SubLObject)temporal_projection_utilities.SIXTEEN_INTEGER) && hour.numL((SubLObject)temporal_projection_utilities.$int159$21)) {
            return (SubLObject)temporal_projection_utilities.T;
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 42539L)
    public static SubLObject check_midday_time(final SubLObject local_time_at_location) {
        final SubLObject hour = cycl_utilities.formula_arg0(ask_utilities.query_variable((SubLObject)temporal_projection_utilities.$sym113$_X, (SubLObject)ConsesLow.list(temporal_projection_utilities.$const158$hourNumberOfDate, (SubLObject)temporal_projection_utilities.$sym113$_X, local_time_at_location), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED));
        if (hour.isNumber() && hour.numE((SubLObject)temporal_projection_utilities.TWELVE_INTEGER)) {
            final SubLObject minutes = get_minutes_of_date(local_time_at_location);
            if (temporal_projection_utilities.NIL != minutes && minutes.numE((SubLObject)temporal_projection_utilities.ZERO_INTEGER)) {
                return (SubLObject)temporal_projection_utilities.T;
            }
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 42917L)
    public static SubLObject check_midnight_time(final SubLObject local_time_at_location) {
        final SubLObject hour = bindings.variable_lookup((SubLObject)temporal_projection_utilities.$sym113$_X, cycl_utilities.formula_arg0(mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const158$hourNumberOfDate, (SubLObject)temporal_projection_utilities.$sym113$_X, local_time_at_location), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)));
        if (temporal_projection_utilities.NIL != hour && hour.numE((SubLObject)temporal_projection_utilities.ZERO_INTEGER)) {
            final SubLObject minutes = get_minutes_of_date(local_time_at_location);
            if (minutes.numE((SubLObject)temporal_projection_utilities.ZERO_INTEGER)) {
                return (SubLObject)temporal_projection_utilities.T;
            }
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 43274L)
    public static SubLObject get_minutes_of_date(final SubLObject date) {
        if (cycl_utilities.formula_arg0(date).eql(temporal_projection_utilities.$const90$SecondFn)) {
            return cycl_utilities.formula_arg1(cycl_utilities.formula_arg2(date, (SubLObject)temporal_projection_utilities.UNPROVIDED), (SubLObject)temporal_projection_utilities.UNPROVIDED);
        }
        if (cycl_utilities.formula_arg0(date).eql(temporal_projection_utilities.$const89$MinuteFn)) {
            return cycl_utilities.formula_arg1(date, (SubLObject)temporal_projection_utilities.UNPROVIDED);
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 43495L)
    public static SubLObject check_night_time(final SubLObject local_time_at_location, final SubLObject dusk, final SubLObject dawn) {
        if (temporal_projection_utilities.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const121$laterThan, dawn, local_time_at_location), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)) {
            return (SubLObject)temporal_projection_utilities.T;
        }
        if (temporal_projection_utilities.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const121$laterThan, local_time_at_location, dusk), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)) {
            return (SubLObject)temporal_projection_utilities.T;
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 43751L)
    public static SubLObject check_daytime_hours(final SubLObject local_time_at_location, final SubLObject sunrise, final SubLObject sunset) {
        if (temporal_projection_utilities.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const121$laterThan, local_time_at_location, sunrise), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED) && temporal_projection_utilities.NIL != mt_context.ask_mt_query((SubLObject)ConsesLow.list(temporal_projection_utilities.$const121$laterThan, sunset, local_time_at_location), (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED, (SubLObject)temporal_projection_utilities.UNPROVIDED)) {
            return (SubLObject)temporal_projection_utilities.T;
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/temporal-projection-utilities.lisp", position = 44002L)
    public static SubLObject find_local_time_at_location(final SubLObject location, final SubLObject time_1, final SubLObject timezone) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cycl_utilities.formula_arg0(time_1).eql(temporal_projection_utilities.$const123$TimeZoneFn)) {
            thread.resetMultipleValues();
            final SubLObject local_time_with_timezone = time_zone_conversion(timezone, time_1);
            final SubLObject just = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (temporal_projection_utilities.NIL != local_time_with_timezone) {
                return Values.values(cycl_utilities.formula_arg1(local_time_with_timezone, (SubLObject)temporal_projection_utilities.UNPROVIDED), just);
            }
        }
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    public static SubLObject declare_temporal_projection_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "store_temporal_projection_results", "STORE-TEMPORAL-PROJECTION-RESULTS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "temporal_projection_quick_failP", "TEMPORAL-PROJECTION-QUICK-FAIL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "deduction_not_produced_by_temporal_projectionP", "DEDUCTION-NOT-PRODUCED-BY-TEMPORAL-PROJECTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "verify_temporal_projection_code_supportP", "VERIFY-TEMPORAL-PROJECTION-CODE-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "get_code_rule_for_documentation", "GET-CODE-RULE-FOR-DOCUMENTATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "find_likelihood_of_survival_of_spec", "FIND-LIKELIHOOD-OF-SURVIVAL-OF-SPEC", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "find_prob_of_termination_of_membership_at_age", "FIND-PROB-OF-TERMINATION-OF-MEMBERSHIP-AT-AGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "get_all_relevant_distributions_for_survival_of_entity", "GET-ALL-RELEVANT-DISTRIBUTIONS-FOR-SURVIVAL-OF-ENTITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "find_expected_survival_duration_at_age", "FIND-EXPECTED-SURVIVAL-DURATION-AT-AGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "one_year_death_probability_at_age", "ONE-YEAR-DEATH-PROBABILITY-AT-AGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "possibly_get_nauts_from_narts", "POSSIBLY-GET-NAUTS-FROM-NARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "get_monad_mt", "GET-MONAD-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "mt_with_anytime_psc_time_parameter", "MT-WITH-ANYTIME-PSC-TIME-PARAMETER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "assertion_produced_by_temporal_projectionP", "ASSERTION-PRODUCED-BY-TEMPORAL-PROJECTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "format_justification_entry", "FORMAT-JUSTIFICATION-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "find_the_latest_known_time_point_of_existence", "FIND-THE-LATEST-KNOWN-TIME-POINT-OF-EXISTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "find_first_point_of_time", "FIND-FIRST-POINT-OF-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "find_last_point_of_time", "FIND-LAST-POINT-OF-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "sunrise_time_for_location", "SUNRISE-TIME-FOR-LOCATION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "sunset_time_for_location", "SUNSET-TIME-FOR-LOCATION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "dawn_time_for_location", "DAWN-TIME-FOR-LOCATION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "dusk_time_for_location", "DUSK-TIME-FOR-LOCATION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "get_latitude_of_place", "GET-LATITUDE-OF-PLACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "use_territory_fn_to_get_information", "USE-TERRITORY-FN-TO-GET-INFORMATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "get_longitude_of_place", "GET-LONGITUDE-OF-PLACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "calculate_sunset_time", "CALCULATE-SUNSET-TIME", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "calculate_dusk_time", "CALCULATE-DUSK-TIME", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "calculate_sunrise_time", "CALCULATE-SUNRISE-TIME", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "calculate_dawn_time", "CALCULATE-DAWN-TIME", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "convert_offset", "CONVERT-OFFSET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "find_offset_for_location_on_date", "FIND-OFFSET-FOR-LOCATION-ON-DATE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "find_timezone_for_place_at_date", "FIND-TIMEZONE-FOR-PLACE-AT-DATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "get_time_zones_for_place", "GET-TIME-ZONES-FOR-PLACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "find_starting_point_of_daylight_saving_time", "FIND-STARTING-POINT-OF-DAYLIGHT-SAVING-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "find_ending_point_of_daylight_saving_time", "FIND-ENDING-POINT-OF-DAYLIGHT-SAVING-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "find_ending_point_of_european_summer_time", "FIND-ENDING-POINT-OF-EUROPEAN-SUMMER-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "find_starting_point_of_european_summer_time", "FIND-STARTING-POINT-OF-EUROPEAN-SUMMER-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "cyc_time_zone_conversion", "CYC-TIME-ZONE-CONVERSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "time_zone_conversion", "TIME-ZONE-CONVERSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "find_utc_offset_for_time_zone", "FIND-UTC-OFFSET-FOR-TIME-ZONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "location_has_qualitative_time_of_day_at_time", "LOCATION-HAS-QUALITATIVE-TIME-OF-DAY-AT-TIME", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "location_has_sunrise_time", "LOCATION-HAS-SUNRISE-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "location_has_sunset_time", "LOCATION-HAS-SUNSET-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "local_sunrise_time_for_coordinates", "LOCAL-SUNRISE-TIME-FOR-COORDINATES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "local_sunset_time_for_coordinates", "LOCAL-SUNSET-TIME-FOR-COORDINATES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "estimate_timezone_offset", "ESTIMATE-TIMEZONE-OFFSET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "find_closest_match_for_latitude_and_longitude", "FIND-CLOSEST-MATCH-FOR-LATITUDE-AND-LONGITUDE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "check_dawn_time", "CHECK-DAWN-TIME", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "check_dusk_time", "CHECK-DUSK-TIME", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "check_morning_time", "CHECK-MORNING-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "check_afternoon_time", "CHECK-AFTERNOON-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "check_evening_time", "CHECK-EVENING-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "check_midday_time", "CHECK-MIDDAY-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "check_midnight_time", "CHECK-MIDNIGHT-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "get_minutes_of_date", "GET-MINUTES-OF-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "check_night_time", "CHECK-NIGHT-TIME", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "check_daytime_hours", "CHECK-DAYTIME-HOURS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.temporal_projection_utilities", "find_local_time_at_location", "FIND-LOCAL-TIME-AT-LOCATION", 3, 0, false);
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    public static SubLObject init_temporal_projection_utilities_file() {
        temporal_projection_utilities.$ignored_temporal_projection_functions$ = SubLFiles.defparameter("*IGNORED-TEMPORAL-PROJECTION-FUNCTIONS*", (SubLObject)temporal_projection_utilities.$list0);
        temporal_projection_utilities.$temporal_projection_distribution_predicate_list$ = SubLFiles.defparameter("*TEMPORAL-PROJECTION-DISTRIBUTION-PREDICATE-LIST*", (SubLObject)temporal_projection_utilities.$list1);
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    public static SubLObject setup_temporal_projection_utilities_file() {
        utilities_macros.register_kb_function((SubLObject)temporal_projection_utilities.$sym142$CYC_TIME_ZONE_CONVERSION);
        return (SubLObject)temporal_projection_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_temporal_projection_utilities_file();
    }
    
    public void initializeVariables() {
        init_temporal_projection_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_temporal_projection_utilities_file();
    }
}