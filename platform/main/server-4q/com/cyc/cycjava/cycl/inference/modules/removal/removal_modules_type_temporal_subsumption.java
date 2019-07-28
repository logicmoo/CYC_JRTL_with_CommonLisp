package com.cyc.cycjava.cycl.inference.modules.removal;


import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.ghl_search_methods;
import com.cyc.cycjava.cycl.ghl_search_vars;
import com.cyc.cycjava.cycl.gt_methods;
import com.cyc.cycjava.cycl.gt_vars;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.hlmt_relevance;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.time_interval_utilities;
import com.cyc.cycjava.cycl.time_parameter_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class removal_modules_type_temporal_subsumption extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_type_temporal_subsumption();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption";

    public static final String myFingerPrint = "efae72f8f77143e2b7d587957ec170eec753a7f1712b066ca67bfcd5e13dc62e";

    // defparameter
    // Definitions
    private static final SubLSymbol $default_temporally_subsumes_typetype_check_cost$ = makeSymbol("*DEFAULT-TEMPORALLY-SUBSUMES-TYPETYPE-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $default_temporally_subsumes_instype_check_cost$ = makeSymbol("*DEFAULT-TEMPORALLY-SUBSUMES-INSTYPE-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $default_temporally_subsumed_by_instype_check_cost$ = makeSymbol("*DEFAULT-TEMPORALLY-SUBSUMED-BY-INSTYPE-CHECK-COST*");



















    private static final SubLSymbol $TEMPORALLY_SUBSUMES_TYPETYPE_DELAY_POS = makeKeyword("TEMPORALLY-SUBSUMES-TYPETYPE-DELAY-POS");

    public static final SubLList $list1 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallySubsumes-TypeType")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallySubsumes-TypeType")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    private static final SubLSymbol $TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE_POS = makeKeyword("TEMPORALLY-SUBSUMES-TYPETYPE-GENERATE-POS");

    public static final SubLList $list3 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallySubsumes-TypeType")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("temporallySubsumes-TypeType")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), list(reader_make_constant_shell(makeString("temporallySubsumes-TypeType")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_CHECK = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-CHECK");

    public static final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallySubsumes-TypeType")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallySubsumes-TypeType")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORALLY-SUBSUMES-TYPETYPE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallySubsumes-TypeType")), list(makeKeyword("BIND"), makeSymbol("BIG")), list(makeKeyword("BIND"), makeSymbol("SMALL"))), list(list(makeKeyword("VALUE"), makeSymbol("BIG")), list(makeKeyword("VALUE"), makeSymbol("SMALL")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("BIG"), makeSymbol("SMALL")), list(makeKeyword("CALL"), makeSymbol("BIGGER-TIME-TYPE?"), list(makeKeyword("VALUE"), makeSymbol("BIG")), list(makeKeyword("VALUE"), makeSymbol("SMALL")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-TypeType TYPE1 TYPE2)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-TypeType #$CalendarDay #$CalendarHour)") });

    private static final SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-GENERATE");

    public static final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallySubsumes-TypeType")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallySubsumes-TypeType")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallySubsumes-TypeType")), list(makeKeyword("BIND"), makeSymbol("BIG")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("BIG"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-TEMPORALLY-SUBSUMES-TYPETYPE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporallySubsumes-TypeType")), list(makeKeyword("VALUE"), makeSymbol("BIG")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-TypeType TYPE ?X)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-TypeType #$CalendarDay ?WHAT) ->\n    #$CalendarHour, #$CalendarMinute, (#$SameLengthTimeIntervalTypeFn (#$DaysDuration 1)), etc ") });

    private static final SubLObject $$TimeParameter = reader_make_constant_shell(makeString("TimeParameter"));

    private static final SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMED_TYPETYPE_GENERATE = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMED-TYPETYPE-GENERATE");

    public static final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallySubsumes-TypeType")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallySubsumes-TypeType")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-TEMPORALLY-SUBSUMED-TYPETYPE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallySubsumes-TypeType")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("SMALL"))), list(makeKeyword("VALUE"), makeSymbol("SMALL"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-TEMPORALLY-SUBSUMED-TYPETYPE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporallySubsumes-TypeType")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("SMALL"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-TypeType ?X TYPE)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-TypeType ?WHAT #$CalendarDay) ->\n    #$CalendarWeek, #$CalendarMonth, (#$SameLengthTimeIntervalTypeFn (#$DaysDuration 2)), etc") });

    private static final SubLSymbol $TEMPORALLY_SUBSUMES_INSTYPE_DELAY_POS = makeKeyword("TEMPORALLY-SUBSUMES-INSTYPE-DELAY-POS");

    public static final SubLList $list12 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallySubsumes-InsType")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallySubsumes-InsType")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    private static final SubLSymbol $TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_POS = makeKeyword("TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-POS");

    public static final SubLList $list14 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallySubsumes-InsType")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell(makeString("temporallySubsumes-InsType")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), list(reader_make_constant_shell(makeString("temporallySubsumes-InsType")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_CHECK = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-CHECK");

    public static final SubLList $list16 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallySubsumes-InsType")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallySubsumes-InsType")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORALLY-SUBSUMES-INSTYPE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallySubsumes-InsType")), list(makeKeyword("BIND"), makeSymbol("INTERVAL")), list(makeKeyword("BIND"), makeSymbol("TYPE"))), list(list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("INTERVAL"), makeSymbol("TYPE")), list(makeKeyword("CALL"), makeSymbol("TIME-INTERVAL-SUBSUMES-TYPE?"), list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-InsType INTERVAL TYPE)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-InsType #$TheYear2000 #$CalendarYear)") });

    private static final SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_TYPES = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES");

    public static final SubLList $list18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallySubsumes-InsType")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallySubsumes-InsType")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallySubsumes-InsType")), list(makeKeyword("BIND"), makeSymbol("INTERVAL")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("INTERVAL"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporallySubsumes-InsType")), list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-InsType Interval ?X)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-InsType #$TheYear2000 ?WHAT) ->\n    #$CalendarYear, #$CalendarDay, (#$SameLengthTimeIntervalTypeFn (#$YearsDuration 1)), etc") });

    private static final SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMED_INSTYPE_GENERATE_INTERVALS = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS");

    public static final SubLList $list20 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallySubsumes-InsType")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallySubsumes-InsType")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallySubsumes-InsType")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TYPE"))), list(makeKeyword("VALUE"), makeSymbol("TYPE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("INFERENCE-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("temporallySubsumes-InsType")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TYPE"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-InsType ?WHAT TYPE)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-InsType ?WHAT #$CalendarDay) ->\n    #$TheYear2000, (#$DayFn 4 (#$MonthFn #$July (#$YearFn 1776))), etc") });

    private static final SubLObject $$temporallySubsumedBy_InsType = reader_make_constant_shell(makeString("temporallySubsumedBy-InsType"));



    private static final SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMED_BY_INSTYPE_CHECK = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMED-BY-INSTYPE-CHECK");

    private static final SubLList $list24 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("temporallySubsumedBy-InsType")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("temporallySubsumedBy-InsType")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORALLY-SUBSUMED-BY-INSTYPE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("temporallySubsumedBy-InsType")), list(makeKeyword("BIND"), makeSymbol("INTERVAL")), list(makeKeyword("BIND"), makeSymbol("TYPE"))), list(list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("INTERVAL"), makeSymbol("TYPE")), list(makeKeyword("CALL"), makeSymbol("TIME-INTERVAL-SUBSUMED-BY-TYPE?"), list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumedBy-InsType INTERVAL TYPE)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumedBy-InsType #$TheYear2000 #$CalendarYear)") });

    private static final SubLObject $$Null_TimeParameter = reader_make_constant_shell(makeString("Null-TimeParameter"));

    private static final SubLObject $$TimePoint = reader_make_constant_shell(makeString("TimePoint"));

    private static final SubLList $list27 = list(reader_make_constant_shell(makeString("TimePoint")));

    public static final SubLList $list28 = list(reader_make_constant_shell(makeString("Null-TimeParameter")));

    private static final SubLObject $$temporallySubsumes_TypeType = reader_make_constant_shell(makeString("temporallySubsumes-TypeType"));



    private static final SubLSymbol $time_point_subsumed_rule$ = makeSymbol("*TIME-POINT-SUBSUMED-RULE*");

    private static final SubLSymbol $sym32$_TIME_POINT_SUBSUMED_RULE__INITIALIZER = makeSymbol("*TIME-POINT-SUBSUMED-RULE*-INITIALIZER");

    private static final SubLList $list33 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("TimeParameter"))), list(reader_make_constant_shell(makeString("different")), reader_make_constant_shell(makeString("TimePoint")), makeSymbol("?X"))), list(reader_make_constant_shell(makeString("temporallySubsumes-TypeType")), makeSymbol("?X"), reader_make_constant_shell(makeString("TimePoint"))));

    private static final SubLSymbol $null_param_subsumes_rule$ = makeSymbol("*NULL-PARAM-SUBSUMES-RULE*");

    private static final SubLSymbol $sym35$_NULL_PARAM_SUBSUMES_RULE__INITIALIZER = makeSymbol("*NULL-PARAM-SUBSUMES-RULE*-INITIALIZER");

    private static final SubLList $list36 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("TimeParameter"))), list(reader_make_constant_shell(makeString("different")), reader_make_constant_shell(makeString("Null-TimeParameter")), makeSymbol("?X"))), list(reader_make_constant_shell(makeString("temporallySubsumes-TypeType")), reader_make_constant_shell(makeString("Null-TimeParameter")), makeSymbol("?X")));

    private static final SubLSymbol $temporally_subsumes_typetype_reflexive_rule$ = makeSymbol("*TEMPORALLY-SUBSUMES-TYPETYPE-REFLEXIVE-RULE*");

    private static final SubLSymbol $sym38$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE__INITIALIZER = makeSymbol("*TEMPORALLY-SUBSUMES-TYPETYPE-REFLEXIVE-RULE*-INITIALIZER");

    private static final SubLList $list39 = list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("temporallySubsumes-TypeType")), reader_make_constant_shell(makeString("ReflexiveBinaryPredicate")));

    private static final SubLSymbol $rae_defining_temporally_subsumes_typetype_rule$ = makeSymbol("*RAE-DEFINING-TEMPORALLY-SUBSUMES-TYPETYPE-RULE*");

    private static final SubLSymbol $sym41$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE__INITIALIZER = makeSymbol("*RAE-DEFINING-TEMPORALLY-SUBSUMES-TYPETYPE-RULE*-INITIALIZER");

    private static final SubLList $list42 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("relationAllExists")), reader_make_constant_shell(makeString("temporallySubsumes")), makeSymbol("?LONGER-TYPE"), makeSymbol("?SHORTER-TYPE")), list(reader_make_constant_shell(makeString("temporallySubsumes-TypeType")), makeSymbol("?LONGER-TYPE"), makeSymbol("?SHORTER-TYPE")));

    private static final SubLSymbol $temporal_subsumption_of_sliding_types_rule$ = makeSymbol("*TEMPORAL-SUBSUMPTION-OF-SLIDING-TYPES-RULE*");

    private static final SubLSymbol $sym44$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE__INITIALIZER = makeSymbol("*TEMPORAL-SUBSUMPTION-OF-SLIDING-TYPES-RULE*-INITIALIZER");

    private static final SubLList $list45 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?INT1"), list(reader_make_constant_shell(makeString("SameLengthTimeIntervalTypeFn")), makeSymbol("?DUR1"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?INT2"), list(reader_make_constant_shell(makeString("SameLengthTimeIntervalTypeFn")), makeSymbol("?DUR2"))), list(reader_make_constant_shell(makeString("lessThanOrEqualTo")), makeSymbol("?DUR1"), makeSymbol("?DUR2"))), list(reader_make_constant_shell(makeString("temporallySubsumes")), makeSymbol("?INT2"), makeSymbol("?INT1")));

    private static final SubLSymbol $period_plus_duration_subsumes_gappy_type$ = makeSymbol("*PERIOD-PLUS-DURATION-SUBSUMES-GAPPY-TYPE*");

    private static final SubLSymbol $sym47$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE__INITIALIZER = makeSymbol("*PERIOD-PLUS-DURATION-SUBSUMES-GAPPY-TYPE*-INITIALIZER");

    private static final SubLList $list48 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?TYPE"), reader_make_constant_shell(makeString("ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps"))), list(reader_make_constant_shell(makeString("periodOfTimeIntervalSeries")), makeSymbol("?TYPE"), makeSymbol("?DURATION1")), list(reader_make_constant_shell(makeString("durationOfType")), makeSymbol("?TYPE"), makeSymbol("?DURATION2"))), list(reader_make_constant_shell(makeString("temporallySubsumes-TypeType")), list(reader_make_constant_shell(makeString("SameLengthTimeIntervalTypeFn")), list(reader_make_constant_shell(makeString("PlusFn")), makeSymbol("?DURATION1"), makeSymbol("?DURATION2"))), makeSymbol("?TYPE")));



    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));



    private static final SubLObject $$lessThanOrEqualTo = reader_make_constant_shell(makeString("lessThanOrEqualTo"));

    private static final SubLObject $$evaluate = reader_make_constant_shell(makeString("evaluate"));

    private static final SubLObject $$QuotientFn = reader_make_constant_shell(makeString("QuotientFn"));

    private static final SubLList $list55 = list(ONE_INTEGER);

    private static final SubLObject $$TimesFn = reader_make_constant_shell(makeString("TimesFn"));

    private static final SubLSymbol $sym57$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE = makeSymbol("FIRST-PARAMETER>=PREVIOUS-SLIDING-TYPE");





    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLList $list61 = list(reader_make_constant_shell(makeString("ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps")));



    private static final SubLObject $$periodOfTimeIntervalSeries = reader_make_constant_shell(makeString("periodOfTimeIntervalSeries"));

    private static final SubLObject $$durationOfType = reader_make_constant_shell(makeString("durationOfType"));

    private static final SubLObject $$PlusFn = reader_make_constant_shell(makeString("PlusFn"));

    private static final SubLSymbol $sym66$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE = makeSymbol("FIRST-PARAMETER<=PREVIOUS-SLIDING-TYPE");

    private static final SubLSymbol $always_subsumes_everything_support$ = makeSymbol("*ALWAYS-SUBSUMES-EVERYTHING-SUPPORT*");

    private static final SubLSymbol $sym68$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT__INITIALIZER = makeSymbol("*ALWAYS-SUBSUMES-EVERYTHING-SUPPORT*-INITIALIZER");

    private static final SubLList $list69 = list(reader_make_constant_shell(makeString("relationInstanceAll")), reader_make_constant_shell(makeString("timeSlices")), reader_make_constant_shell(makeString("Always-TimeInterval")), reader_make_constant_shell(makeString("TimeInterval")));

    private static final SubLSymbol $time_point_subsumed_by_everything_support$ = makeSymbol("*TIME-POINT-SUBSUMED-BY-EVERYTHING-SUPPORT*");

    private static final SubLSymbol $sym71$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT__INITIALIZER = makeSymbol("*TIME-POINT-SUBSUMED-BY-EVERYTHING-SUPPORT*-INITIALIZER");

    private static final SubLList $list72 = list(reader_make_constant_shell(makeString("relationAllInstance")), reader_make_constant_shell(makeString("temporallySubsumes")), reader_make_constant_shell(makeString("TimeInterval")), reader_make_constant_shell(makeString("TimePoint")));

    private static final SubLSymbol $cooriginating_interval_of_lesser_duration_is_subsumed_support$ = makeSymbol("*COORIGINATING-INTERVAL-OF-LESSER-DURATION-IS-SUBSUMED-SUPPORT*");

    private static final SubLSymbol $sym74$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT__I = makeSymbol("*COORIGINATING-INTERVAL-OF-LESSER-DURATION-IS-SUBSUMED-SUPPORT*-INITIALIZER");

    private static final SubLList $list75 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?INTERVAL1"), reader_make_constant_shell(makeString("TimeInterval"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?INTERVAL2"), reader_make_constant_shell(makeString("TimeInterval"))), list(reader_make_constant_shell(makeString("duration")), makeSymbol("?INTERVAL1"), makeSymbol("?DUR1")), list(reader_make_constant_shell(makeString("duration")), makeSymbol("?INTERVAL2"), makeSymbol("?DUR2")), list(reader_make_constant_shell(makeString("lessThanOrEqualTo")), makeSymbol("?DUR2"), makeSymbol("?DUR1")), list(reader_make_constant_shell(makeString("temporallyCooriginating")), makeSymbol("?INTERVAL1"), makeSymbol("?INTERVAL2"))), list(reader_make_constant_shell(makeString("temporallySubsumes")), makeSymbol("?INTERVAL1"), makeSymbol("?INTERVAL2")));

    private static final SubLObject $$Always_TimeInterval = reader_make_constant_shell(makeString("Always-TimeInterval"));

    private static final SubLObject $$temporallySubsumes = reader_make_constant_shell(makeString("temporallySubsumes"));



    private static final SubLObject $$duration = reader_make_constant_shell(makeString("duration"));

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLSymbol $sym81$_INTERVAL = makeSymbol("?INTERVAL");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$temporallyCooriginating = reader_make_constant_shell(makeString("temporallyCooriginating"));



    private static final SubLObject $$temporallySubsumes_InsType = reader_make_constant_shell(makeString("temporallySubsumes-InsType"));

    public static SubLObject inference_temporally_subsumes_typetype(final SubLObject type) {
        return all_types_temporally_subsumed_by_type(type);
    }

    public static SubLObject removal_temporally_subsumes_typetype_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return divide(length(isa.all_fort_instances($$TimeParameter, UNPROVIDED, UNPROVIDED)), TWO_INTEGER);
    }

    public static SubLObject inference_temporally_subsumed_typetype(final SubLObject type) {
        return all_types_temporally_subsuming_type(type);
    }

    public static SubLObject removal_temporally_subsumed_typetype_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return divide(length(isa.all_fort_instances($$TimeParameter, UNPROVIDED, UNPROVIDED)), TWO_INTEGER);
    }

    public static SubLObject inference_temporally_subsumes_instype_generate_types(final SubLObject interval) {
        return NIL;
    }

    public static SubLObject removal_temporally_subsumes_instype_generate_types_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return TEN_INTEGER;
    }

    public static SubLObject inference_temporally_subsumed_instype_generate_intervals(final SubLObject type) {
        return NIL;
    }

    public static SubLObject removal_temporally_subsumed_instype_generate_intervals_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return TEN_INTEGER;
    }

    public static SubLObject all_types_temporally_subsumed_by_type(final SubLObject type) {
        if (type.eql($$Null_TimeParameter)) {
            return isa.all_fort_instances($$TimeParameter, UNPROVIDED, UNPROVIDED);
        }
        if (type.eql($$TimePoint)) {
            return $list27;
        }
        if (NIL != time_parameter_utilities.sliding_time_type_p(type)) {
            return all_types_subsumed_by_sliding_type(type);
        }
        return all_types_subsumed_by_conventional_type(type);
    }

    public static SubLObject all_types_temporally_subsuming_type(final SubLObject type) {
        if (type.eql($$Null_TimeParameter)) {
            return $list28;
        }
        if (type.eql($$TimePoint)) {
            return isa.all_fort_instances($$TimeParameter, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != time_parameter_utilities.sliding_time_type_p(type)) {
            return all_types_subsuming_sliding_type(type);
        }
        return all_types_subsuming_conventional_type(type);
    }

    public static SubLObject all_intervals_temporally_subsuming_type(final SubLObject type) {
        return list(type);
    }

    public static SubLObject all_types_temporally_subsumed_by_interval(final SubLObject interval) {
        return NIL;
    }

    public static SubLObject all_types_subsumed_by_sliding_type(final SubLObject type) {
        final SubLObject params = isa.all_fort_instances($$TimeParameter, UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = params;
        SubLObject param = NIL;
        param = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != hlmt_relevance.bigger_time_typeP(type, param)) {
                result = cons(param, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject all_types_subsumed_by_conventional_type(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
        try {
            gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
            result = gt_methods.gt_all_superiors($$temporallySubsumes_TypeType, type, UNPROVIDED);
        } finally {
            gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject all_types_subsuming_sliding_type(final SubLObject type) {
        final SubLObject params = isa.all_fort_instances($$TimeParameter, UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = params;
        SubLObject param = NIL;
        param = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != hlmt_relevance.bigger_time_typeP(param, type)) {
                result = cons(param, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject all_types_subsuming_conventional_type(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
        try {
            gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
            result = gt_methods.gt_all_inferiors($$temporallySubsumes_TypeType, type, UNPROVIDED);
        } finally {
            gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject time_point_subsumed_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list33, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static SubLObject null_param_subsumes_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list36, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static SubLObject temporally_subsumes_typetype_reflexive_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list39, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static SubLObject rae_defining_temporally_subsumes_typetype_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list42, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static SubLObject temporal_subsumption_of_sliding_types_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list45, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static SubLObject period_plus_duration_subsumes_gappy_typeX_initializer() {
        return hl_supports.find_assertion_or_make_support($list48, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static SubLObject why_bigger_time_typeP(final SubLObject big, final SubLObject small) {
        return why_temporally_subsumes_typetypeP(big, small);
    }

    public static SubLObject why_temporally_subsumes_typetypeP(final SubLObject big, final SubLObject small) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (big.equal(small)) {
            return list($temporally_subsumes_typetype_reflexive_rule$.getDynamicValue(thread));
        }
        if (big.eql($$Null_TimeParameter)) {
            return list($null_param_subsumes_rule$.getDynamicValue(thread));
        }
        if (small.eql($$TimePoint)) {
            return list($time_point_subsumed_rule$.getDynamicValue(thread));
        }
        if ((NIL != time_parameter_utilities.sliding_time_type_p(big)) && (NIL != time_parameter_utilities.sliding_time_type_p(small))) {
            return why_sliding_time_typeLE(small, big);
        }
        if ((NIL != time_parameter_utilities.conventional_time_series_p(big)) && (NIL != time_parameter_utilities.sliding_time_type_p(small))) {
            return why_covering_type_subsumes_sliding_typeP(big, small);
        }
        if ((NIL != time_parameter_utilities.sliding_time_type_p(big)) && (NIL != time_parameter_utilities.conventional_time_series_p(small))) {
            return why_sliding_type_subsumes_covering_typeP(big, small);
        }
        return list(arguments.make_hl_support($TRANSITIVITY, list($$temporallySubsumes_TypeType, big, small), $$UniversalVocabularyMt, UNPROVIDED));
    }

    public static SubLObject why_sliding_time_typeLE(final SubLObject small, final SubLObject big) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject small_unit = time_parameter_utilities.extract_sliding_time_type(small);
        final SubLObject big_unit = time_parameter_utilities.extract_sliding_time_type(big);
        final SubLObject small_amount = time_parameter_utilities.extract_sliding_type_amount(small);
        final SubLObject big_amount = time_parameter_utilities.extract_sliding_type_amount(big);
        if (small_unit.eql(big_unit)) {
            return list($rae_defining_temporally_subsumes_typetype_rule$.getDynamicValue(thread), $temporal_subsumption_of_sliding_types_rule$.getDynamicValue(thread), arguments.make_hl_support($EVAL, list($$lessThanOrEqualTo, small_amount, big_amount), UNPROVIDED, UNPROVIDED));
        }
        if (NIL != time_parameter_utilities.duration_typeL(small_unit, big_unit)) {
            final SubLObject quotient = time_parameter_utilities.find_duration_quotient(small_unit, big_unit, UNPROVIDED);
            final SubLObject product = multiply(quotient, big_amount);
            return list($rae_defining_temporally_subsumes_typetype_rule$.getDynamicValue(thread), $temporal_subsumption_of_sliding_types_rule$.getDynamicValue(thread), arguments.make_hl_support($EVAL, list($$evaluate, quotient, list($$QuotientFn, bq_cons(big_unit, $list55), bq_cons(small_unit, $list55))), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($EVAL, list($$evaluate, list(small_unit, product), list($$TimesFn, list(small_unit, quotient), big_amount)), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($EVAL, list($$lessThanOrEqualTo, small_amount, product), UNPROVIDED, UNPROVIDED));
        }
        final SubLObject quotient = time_parameter_utilities.find_duration_quotient(big_unit, small_unit, UNPROVIDED);
        final SubLObject product = multiply(quotient, small_amount);
        return list($rae_defining_temporally_subsumes_typetype_rule$.getDynamicValue(thread), $temporal_subsumption_of_sliding_types_rule$.getDynamicValue(thread), arguments.make_hl_support($EVAL, list($$evaluate, quotient, list($$QuotientFn, bq_cons(small_unit, $list55), bq_cons(big_unit, $list55))), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($EVAL, list($$evaluate, list(big_unit, product), list($$TimesFn, list(big_unit, quotient), small_amount)), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($EVAL, list($$lessThanOrEqualTo, product, big_amount), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject why_covering_type_subsumes_sliding_typeP(final SubLObject covering_type, final SubLObject sliding_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subsumed_sliding_type = NIL;
        final SubLObject _prev_bind_0 = hlmt_relevance.$hlmt_sliding_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
        try {
            hlmt_relevance.$hlmt_sliding_type$.bind(sliding_type, thread);
            gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
            subsumed_sliding_type = gt_methods.gt_gather_superior($$temporallySubsumes_TypeType, covering_type, $sym57$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE, $$UniversalVocabularyMt);
        } finally {
            gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_2, thread);
            hlmt_relevance.$hlmt_sliding_type$.rebind(_prev_bind_0, thread);
        }
        if (NIL != subsumed_sliding_type) {
            return list(arguments.make_hl_support($TRANSITIVITY, list($$temporallySubsumes_TypeType, covering_type, subsumed_sliding_type), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($TIME, list($$temporallySubsumes_TypeType, subsumed_sliding_type, sliding_type), UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject first_parameterGEprevious_sliding_type(final SubLObject time_parameter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != time_parameter_utilities.sliding_time_type_p(time_parameter)) && (NIL != hlmt_relevance.sliding_time_typeLE(hlmt_relevance.$hlmt_sliding_type$.getDynamicValue(thread), time_parameter))) {
            return time_parameter;
        }
        return NIL;
    }

    public static SubLObject why_sliding_type_subsumes_covering_typeP(final SubLObject sliding_type, final SubLObject covering_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != time_parameter_utilities.gappy_time_type_p(covering_type)) {
            final SubLObject min_subsuming_slider = hlmt_relevance.minimally_subsuming_sliding_type_for_gappy_type(covering_type);
            SubLObject result = NIL;
            if (NIL != hlmt_relevance.sliding_time_typeLE(min_subsuming_slider, sliding_type)) {
                final SubLObject period_dur = time_parameter_utilities.gappy_type_period(covering_type);
                final SubLObject type_dur = time_parameter_utilities.gappy_type_duration(covering_type);
                result = list($period_plus_duration_subsumes_gappy_type$.getDynamicValue(thread), arguments.make_hl_support($ISA, listS($$isa, sliding_type, $list61), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($QUERY, list($$periodOfTimeIntervalSeries, covering_type, period_dur), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($QUERY, list($$durationOfType, covering_type, type_dur), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($EVAL, list($$evaluate, time_parameter_utilities.extract_sliding_type(min_subsuming_slider), list($$PlusFn, period_dur, type_dur)), UNPROVIDED, UNPROVIDED));
                if (!min_subsuming_slider.equal(sliding_type)) {
                    result = cons(arguments.make_hl_support($TIME, list($$temporallySubsumes_TypeType, sliding_type, min_subsuming_slider), UNPROVIDED, UNPROVIDED), result);
                }
                return result;
            }
        }
        SubLObject subsuming_sliding_type = NIL;
        final SubLObject _prev_bind_0 = hlmt_relevance.$hlmt_sliding_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
        try {
            hlmt_relevance.$hlmt_sliding_type$.bind(sliding_type, thread);
            gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
            subsuming_sliding_type = gt_methods.gt_gather_inferior($$temporallySubsumes_TypeType, covering_type, $sym66$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE, $$UniversalVocabularyMt);
        } finally {
            gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_2, thread);
            hlmt_relevance.$hlmt_sliding_type$.rebind(_prev_bind_0, thread);
        }
        if (NIL != subsuming_sliding_type) {
            return list(arguments.make_hl_support($TRANSITIVITY, list($$temporallySubsumes_TypeType, subsuming_sliding_type, covering_type), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($TIME, list($$temporallySubsumes_TypeType, sliding_type, subsuming_sliding_type), UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject first_parameterLEprevious_sliding_type(final SubLObject time_parameter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != time_parameter_utilities.sliding_time_type_p(time_parameter)) && (NIL != hlmt_relevance.sliding_time_typeLE(time_parameter, hlmt_relevance.$hlmt_sliding_type$.getDynamicValue(thread)))) {
            return time_parameter;
        }
        return NIL;
    }

    public static SubLObject always_subsumes_everything_supportX_initializer() {
        return hl_supports.find_assertion_or_make_support($list69, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static SubLObject time_point_subsumed_by_everything_supportX_initializer() {
        return hl_supports.find_assertion_or_make_support($list72, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static SubLObject cooriginating_interval_of_lesser_duration_is_subsumed_supportX_initializer() {
        return hl_supports.find_assertion_or_make_support($list75, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static SubLObject why_time_interval_subsumes_typeP(final SubLObject interval, final SubLObject type) {
        return why_temporally_subsumes_instypeP(interval, type);
    }

    public static SubLObject why_temporally_subsumes_instypeP(final SubLObject interval, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (interval.eql($$Always_TimeInterval)) {
            return list($always_subsumes_everything_support$.getDynamicValue(thread));
        }
        if (type.eql($$TimePoint)) {
            return list($time_point_subsumed_by_everything_support$.getDynamicValue(thread));
        }
        if (NIL != time_interval_utilities.date_interval_p(interval)) {
            return why_date_interval_subsumes_typeP(interval, type);
        }
        return why_arbitrary_interval_subsumes_typeP(interval, type);
    }

    public static SubLObject why_date_interval_subsumes_typeP(final SubLObject interval, final SubLObject type) {
        final SubLObject witness = time_parameter_utilities.nth_type_starting_no_earlier_than_start_of_interval(interval, type, ZERO_INTEGER);
        return witness.equal(interval) ? list(arguments.make_hl_support($ISA, list($$isa, witness, type), UNPROVIDED, UNPROVIDED)) : list(arguments.make_hl_support($ISA, list($$isa, witness, type), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($TIME, list($$temporallySubsumes, interval, witness), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject interval_subsumes_cooriginating_type_justification(final SubLObject type, final SubLObject interval) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject type_duration = time_parameter_utilities.get_duration_of_type(type);
        final SubLObject interval_duration = time_parameter_utilities.get_duration_of_interval(interval);
        return (NIL != type_duration) && (NIL != interval_duration) ? list(make_cooriginating_interval_support(type, interval), arguments.make_hl_support($QUERY, list($$durationOfType, type, type_duration), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($OPAQUE, list($$duration, interval, interval_duration), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($EVAL, list($$lessThanOrEqualTo, type_duration, interval_duration), UNPROVIDED, UNPROVIDED), $cooriginating_interval_of_lesser_duration_is_subsumed_support$.getDynamicValue(thread)) : NIL;
    }

    public static SubLObject make_cooriginating_interval_support(final SubLObject type, final SubLObject interval) {
        return arguments.make_hl_support($OPAQUE, list($$thereExists, $sym81$_INTERVAL, list($$and, list($$isa, $sym81$_INTERVAL, type), list($$temporallyCooriginating, $sym81$_INTERVAL, interval))), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject why_arbitrary_interval_subsumes_typeP(final SubLObject interval, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subsumed_type = NIL;
        final SubLObject iterator = ghl_search_methods.new_ghl_closure_iterator($$temporallySubsumes, interval, ghl_search_vars.ghl_forward_direction(), NIL, NIL, $DEPTH_FIRST, UNPROVIDED);
        SubLObject valid;
        for (SubLObject done_var = subsumed_type; NIL == done_var; done_var = makeBoolean((NIL == valid) || (NIL != subsumed_type))) {
            thread.resetMultipleValues();
            final SubLObject subsumed_interval = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != valid) && (NIL != hlmt_relevance.arbitrary_interval_subsumes_typeP_int(subsumed_type, type))) {
                subsumed_type = subsumed_interval;
            }
        }
        if (NIL == subsumed_type) {
            return NIL;
        }
        if (NIL != time_interval_utilities.date_interval_p(subsumed_type)) {
            return list(arguments.make_hl_support($TRANSITIVITY, list($$temporallySubsumes, interval, subsumed_type), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($TIME, list($$temporallySubsumes_InsType, subsumed_type, type), UNPROVIDED, UNPROVIDED));
        }
        return list(arguments.make_hl_support($TRANSITIVITY, list($$temporallySubsumes, interval, subsumed_type), UNPROVIDED, UNPROVIDED), czer_meta.find_assertion_cycl(list($$temporallySubsumes_InsType, interval, subsumed_type), UNPROVIDED));
    }

    public static SubLObject declare_removal_modules_type_temporal_subsumption_file() {
        declareFunction(me, "inference_temporally_subsumes_typetype", "INFERENCE-TEMPORALLY-SUBSUMES-TYPETYPE", 1, 0, false);
        declareFunction(me, "removal_temporally_subsumes_typetype_cost", "REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-COST", 1, 1, false);
        declareFunction(me, "inference_temporally_subsumed_typetype", "INFERENCE-TEMPORALLY-SUBSUMED-TYPETYPE", 1, 0, false);
        declareFunction(me, "removal_temporally_subsumed_typetype_cost", "REMOVAL-TEMPORALLY-SUBSUMED-TYPETYPE-COST", 1, 1, false);
        declareFunction(me, "inference_temporally_subsumes_instype_generate_types", "INFERENCE-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES", 1, 0, false);
        declareFunction(me, "removal_temporally_subsumes_instype_generate_types_cost", "REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES-COST", 1, 1, false);
        declareFunction(me, "inference_temporally_subsumed_instype_generate_intervals", "INFERENCE-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS", 1, 0, false);
        declareFunction(me, "removal_temporally_subsumed_instype_generate_intervals_cost", "REMOVAL-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS-COST", 1, 1, false);
        declareFunction(me, "all_types_temporally_subsumed_by_type", "ALL-TYPES-TEMPORALLY-SUBSUMED-BY-TYPE", 1, 0, false);
        declareFunction(me, "all_types_temporally_subsuming_type", "ALL-TYPES-TEMPORALLY-SUBSUMING-TYPE", 1, 0, false);
        declareFunction(me, "all_intervals_temporally_subsuming_type", "ALL-INTERVALS-TEMPORALLY-SUBSUMING-TYPE", 1, 0, false);
        declareFunction(me, "all_types_temporally_subsumed_by_interval", "ALL-TYPES-TEMPORALLY-SUBSUMED-BY-INTERVAL", 1, 0, false);
        declareFunction(me, "all_types_subsumed_by_sliding_type", "ALL-TYPES-SUBSUMED-BY-SLIDING-TYPE", 1, 0, false);
        declareFunction(me, "all_types_subsumed_by_conventional_type", "ALL-TYPES-SUBSUMED-BY-CONVENTIONAL-TYPE", 1, 0, false);
        declareFunction(me, "all_types_subsuming_sliding_type", "ALL-TYPES-SUBSUMING-SLIDING-TYPE", 1, 0, false);
        declareFunction(me, "all_types_subsuming_conventional_type", "ALL-TYPES-SUBSUMING-CONVENTIONAL-TYPE", 1, 0, false);
        declareFunction(me, "time_point_subsumed_ruleX_initializer", "*TIME-POINT-SUBSUMED-RULE*-INITIALIZER", 0, 0, false);
        declareFunction(me, "null_param_subsumes_ruleX_initializer", "*NULL-PARAM-SUBSUMES-RULE*-INITIALIZER", 0, 0, false);
        declareFunction(me, "temporally_subsumes_typetype_reflexive_ruleX_initializer", "*TEMPORALLY-SUBSUMES-TYPETYPE-REFLEXIVE-RULE*-INITIALIZER", 0, 0, false);
        declareFunction(me, "rae_defining_temporally_subsumes_typetype_ruleX_initializer", "*RAE-DEFINING-TEMPORALLY-SUBSUMES-TYPETYPE-RULE*-INITIALIZER", 0, 0, false);
        declareFunction(me, "temporal_subsumption_of_sliding_types_ruleX_initializer", "*TEMPORAL-SUBSUMPTION-OF-SLIDING-TYPES-RULE*-INITIALIZER", 0, 0, false);
        declareFunction(me, "period_plus_duration_subsumes_gappy_typeX_initializer", "*PERIOD-PLUS-DURATION-SUBSUMES-GAPPY-TYPE*-INITIALIZER", 0, 0, false);
        declareFunction(me, "why_bigger_time_typeP", "WHY-BIGGER-TIME-TYPE?", 2, 0, false);
        declareFunction(me, "why_temporally_subsumes_typetypeP", "WHY-TEMPORALLY-SUBSUMES-TYPETYPE?", 2, 0, false);
        declareFunction(me, "why_sliding_time_typeLE", "WHY-SLIDING-TIME-TYPE<=", 2, 0, false);
        declareFunction(me, "why_covering_type_subsumes_sliding_typeP", "WHY-COVERING-TYPE-SUBSUMES-SLIDING-TYPE?", 2, 0, false);
        declareFunction(me, "first_parameterGEprevious_sliding_type", "FIRST-PARAMETER>=PREVIOUS-SLIDING-TYPE", 1, 0, false);
        declareFunction(me, "why_sliding_type_subsumes_covering_typeP", "WHY-SLIDING-TYPE-SUBSUMES-COVERING-TYPE?", 2, 0, false);
        declareFunction(me, "first_parameterLEprevious_sliding_type", "FIRST-PARAMETER<=PREVIOUS-SLIDING-TYPE", 1, 0, false);
        declareFunction(me, "always_subsumes_everything_supportX_initializer", "*ALWAYS-SUBSUMES-EVERYTHING-SUPPORT*-INITIALIZER", 0, 0, false);
        declareFunction(me, "time_point_subsumed_by_everything_supportX_initializer", "*TIME-POINT-SUBSUMED-BY-EVERYTHING-SUPPORT*-INITIALIZER", 0, 0, false);
        declareFunction(me, "cooriginating_interval_of_lesser_duration_is_subsumed_supportX_initializer", "*COORIGINATING-INTERVAL-OF-LESSER-DURATION-IS-SUBSUMED-SUPPORT*-INITIALIZER", 0, 0, false);
        declareFunction(me, "why_time_interval_subsumes_typeP", "WHY-TIME-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
        declareFunction(me, "why_temporally_subsumes_instypeP", "WHY-TEMPORALLY-SUBSUMES-INSTYPE?", 2, 0, false);
        declareFunction(me, "why_date_interval_subsumes_typeP", "WHY-DATE-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
        declareFunction(me, "interval_subsumes_cooriginating_type_justification", "INTERVAL-SUBSUMES-COORIGINATING-TYPE-JUSTIFICATION", 2, 0, false);
        declareFunction(me, "make_cooriginating_interval_support", "MAKE-COORIGINATING-INTERVAL-SUPPORT", 2, 0, false);
        declareFunction(me, "why_arbitrary_interval_subsumes_typeP", "WHY-ARBITRARY-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_type_temporal_subsumption_file() {
        defparameter("*DEFAULT-TEMPORALLY-SUBSUMES-TYPETYPE-CHECK-COST*", ONE_INTEGER);
        defparameter("*DEFAULT-TEMPORALLY-SUBSUMES-INSTYPE-CHECK-COST*", ONE_INTEGER);
        defparameter("*DEFAULT-TEMPORALLY-SUBSUMED-BY-INSTYPE-CHECK-COST*", ONE_INTEGER);
        defvar("*TIME-POINT-SUBSUMED-RULE*", $UNINITIALIZED);
        defvar("*NULL-PARAM-SUBSUMES-RULE*", $UNINITIALIZED);
        defvar("*TEMPORALLY-SUBSUMES-TYPETYPE-REFLEXIVE-RULE*", $UNINITIALIZED);
        defvar("*RAE-DEFINING-TEMPORALLY-SUBSUMES-TYPETYPE-RULE*", $UNINITIALIZED);
        defvar("*TEMPORAL-SUBSUMPTION-OF-SLIDING-TYPES-RULE*", $UNINITIALIZED);
        defvar("*PERIOD-PLUS-DURATION-SUBSUMES-GAPPY-TYPE*", $UNINITIALIZED);
        defvar("*ALWAYS-SUBSUMES-EVERYTHING-SUPPORT*", $UNINITIALIZED);
        defvar("*TIME-POINT-SUBSUMED-BY-EVERYTHING-SUPPORT*", $UNINITIALIZED);
        defvar("*COORIGINATING-INTERVAL-OF-LESSER-DURATION-IS-SUBSUMED-SUPPORT*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject setup_removal_modules_type_temporal_subsumption_file() {
        preference_modules.inference_preference_module($TEMPORALLY_SUBSUMES_TYPETYPE_DELAY_POS, $list1);
        preference_modules.inference_preference_module($TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE_POS, $list3);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_CHECK, $list5);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE, $list7);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_SUBSUMED_TYPETYPE_GENERATE, $list10);
        preference_modules.inference_preference_module($TEMPORALLY_SUBSUMES_INSTYPE_DELAY_POS, $list12);
        preference_modules.inference_preference_module($TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_POS, $list14);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_CHECK, $list16);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_TYPES, $list18);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_SUBSUMED_INSTYPE_GENERATE_INTERVALS, $list20);
        inference_modules.register_solely_specific_removal_module_predicate($$temporallySubsumedBy_InsType);
        preference_modules.doomed_unless_all_args_bindable($POS, $$temporallySubsumedBy_InsType);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_SUBSUMED_BY_INSTYPE_CHECK, $list24);
        register_kb_variable_initialization($time_point_subsumed_rule$, $sym32$_TIME_POINT_SUBSUMED_RULE__INITIALIZER);
        register_kb_variable_initialization($null_param_subsumes_rule$, $sym35$_NULL_PARAM_SUBSUMES_RULE__INITIALIZER);
        register_kb_variable_initialization($temporally_subsumes_typetype_reflexive_rule$, $sym38$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE__INITIALIZER);
        register_kb_variable_initialization($rae_defining_temporally_subsumes_typetype_rule$, $sym41$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE__INITIALIZER);
        register_kb_variable_initialization($temporal_subsumption_of_sliding_types_rule$, $sym44$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE__INITIALIZER);
        register_kb_variable_initialization($period_plus_duration_subsumes_gappy_type$, $sym47$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE__INITIALIZER);
        register_kb_variable_initialization($always_subsumes_everything_support$, $sym68$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT__INITIALIZER);
        register_kb_variable_initialization($time_point_subsumed_by_everything_support$, $sym71$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT__INITIALIZER);
        register_kb_variable_initialization($cooriginating_interval_of_lesser_duration_is_subsumed_support$, $sym74$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT__I);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_type_temporal_subsumption_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_type_temporal_subsumption_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_type_temporal_subsumption_file();
    }

    static {



































































































    }
}

/**
 * Total time: 220 ms
 */
