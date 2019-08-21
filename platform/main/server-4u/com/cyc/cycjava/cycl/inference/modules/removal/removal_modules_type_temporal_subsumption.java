/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_variable_initialization;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.ghl_search_methods;
import com.cyc.cycjava.cycl.ghl_search_vars;
import com.cyc.cycjava.cycl.gt_methods;
import com.cyc.cycjava.cycl.gt_vars;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.hlmt_relevance;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.time_interval_utilities;
import com.cyc.cycjava.cycl.time_parameter_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-TYPE-TEMPORAL-SUBSUMPTION
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp
 * created:     2019/07/03 17:37:47
 */
public final class removal_modules_type_temporal_subsumption extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_type_temporal_subsumption();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_temporally_subsumes_typetype_check_cost$ = makeSymbol("*DEFAULT-TEMPORALLY-SUBSUMES-TYPETYPE-CHECK-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_temporally_subsumes_instype_check_cost$ = makeSymbol("*DEFAULT-TEMPORALLY-SUBSUMES-INSTYPE-CHECK-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $default_temporally_subsumed_by_instype_check_cost$ = makeSymbol("*DEFAULT-TEMPORALLY-SUBSUMED-BY-INSTYPE-CHECK-COST*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLSymbol $TEMPORALLY_SUBSUMES_TYPETYPE_DELAY_POS = makeKeyword("TEMPORALLY-SUBSUMES-TYPETYPE-DELAY-POS");

    static private final SubLList $list1 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    private static final SubLSymbol $TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE_POS = makeKeyword("TEMPORALLY-SUBSUMES-TYPETYPE-GENERATE-POS");

    static private final SubLList $list3 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), list(reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_CHECK = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-CHECK");

    static private final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORALLY-SUBSUMES-TYPETYPE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("temporallySubsumes-TypeType"), list($BIND, makeSymbol("BIG")), list($BIND, makeSymbol("SMALL"))), list(list(makeKeyword("VALUE"), makeSymbol("BIG")), list(makeKeyword("VALUE"), makeSymbol("SMALL")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("BIG"), makeSymbol("SMALL")), list($CALL, makeSymbol("BIGGER-TIME-TYPE?"), list(makeKeyword("VALUE"), makeSymbol("BIG")), list(makeKeyword("VALUE"), makeSymbol("SMALL")))), makeKeyword("SUPPORT-MODULE"), $TIME, makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-TypeType TYPE1 TYPE2)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-TypeType #$CalendarDay #$CalendarHour)") });

    private static final SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-GENERATE");

    static private final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("temporallySubsumes-TypeType"), list($BIND, makeSymbol("BIG")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("BIG"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("INFERENCE-TEMPORALLY-SUBSUMES-TYPETYPE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-TypeType"), list(makeKeyword("VALUE"), makeSymbol("BIG")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), $TIME, makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-TypeType TYPE ?X)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-TypeType #$CalendarDay ?WHAT) ->\n    #$CalendarHour, #$CalendarMinute, (#$SameLengthTimeIntervalTypeFn (#$DaysDuration 1)), etc ") });



    private static final SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMED_TYPETYPE_GENERATE = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMED-TYPETYPE-GENERATE");

    static private final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), $COST, makeSymbol("REMOVAL-TEMPORALLY-SUBSUMED-TYPETYPE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("SMALL"))), list(makeKeyword("VALUE"), makeSymbol("SMALL"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("INFERENCE-TEMPORALLY-SUBSUMED-TYPETYPE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("SMALL"))), makeKeyword("SUPPORT-MODULE"), $TIME, makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-TypeType ?X TYPE)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-TypeType ?WHAT #$CalendarDay) ->\n    #$CalendarWeek, #$CalendarMonth, (#$SameLengthTimeIntervalTypeFn (#$DaysDuration 2)), etc") });

    private static final SubLSymbol $TEMPORALLY_SUBSUMES_INSTYPE_DELAY_POS = makeKeyword("TEMPORALLY-SUBSUMES-INSTYPE-DELAY-POS");

    static private final SubLList $list12 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    private static final SubLSymbol $TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_POS = makeKeyword("TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-POS");

    static private final SubLList $list14 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), list(reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_CHECK = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-CHECK");

    static private final SubLList $list16 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORALLY-SUBSUMES-INSTYPE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("temporallySubsumes-InsType"), list($BIND, makeSymbol("INTERVAL")), list($BIND, makeSymbol("TYPE"))), list(list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("INTERVAL"), makeSymbol("TYPE")), list($CALL, makeSymbol("TIME-INTERVAL-SUBSUMES-TYPE?"), list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))), makeKeyword("SUPPORT-MODULE"), $TIME, makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-InsType INTERVAL TYPE)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-InsType #$TheYear2000 #$CalendarYear)") });

    private static final SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_TYPES = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES");

    static private final SubLList $list18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("temporallySubsumes-InsType"), list($BIND, makeSymbol("INTERVAL")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("INTERVAL"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("INFERENCE-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-InsType"), list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), $TIME, makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-InsType Interval ?X)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-InsType #$TheYear2000 ?WHAT) ->\n    #$CalendarYear, #$CalendarDay, (#$SameLengthTimeIntervalTypeFn (#$YearsDuration 1)), etc") });

    private static final SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMED_INSTYPE_GENERATE_INTERVALS = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS");

    static private final SubLList $list20 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), $COST, makeSymbol("REMOVAL-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("TYPE"))), list(makeKeyword("VALUE"), makeSymbol("TYPE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("INFERENCE-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TYPE"))), makeKeyword("SUPPORT-MODULE"), $TIME, makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-InsType ?WHAT TYPE)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-InsType ?WHAT #$CalendarDay) ->\n    #$TheYear2000, (#$DayFn 4 (#$MonthFn #$July (#$YearFn 1776))), etc") });

    private static final SubLObject $$temporallySubsumedBy_InsType = reader_make_constant_shell("temporallySubsumedBy-InsType");

    private static final SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMED_BY_INSTYPE_CHECK = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMED-BY-INSTYPE-CHECK");

    private static final SubLList $list24 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumedBy-InsType"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("temporallySubsumedBy-InsType"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORALLY-SUBSUMED-BY-INSTYPE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("temporallySubsumedBy-InsType"), list($BIND, makeSymbol("INTERVAL")), list($BIND, makeSymbol("TYPE"))), list(list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("INTERVAL"), makeSymbol("TYPE")), list($CALL, makeSymbol("TIME-INTERVAL-SUBSUMED-BY-TYPE?"), list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))), makeKeyword("SUPPORT-MODULE"), $TIME, makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumedBy-InsType INTERVAL TYPE)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumedBy-InsType #$TheYear2000 #$CalendarYear)") });

    private static final SubLObject $$Null_TimeParameter = reader_make_constant_shell("Null-TimeParameter");



    private static final SubLList $list27 = list(reader_make_constant_shell("TimePoint"));

    static private final SubLList $list28 = list(reader_make_constant_shell("Null-TimeParameter"));

    private static final SubLObject $$temporallySubsumes_TypeType = reader_make_constant_shell("temporallySubsumes-TypeType");

    private static final SubLSymbol $time_point_subsumed_rule$ = makeSymbol("*TIME-POINT-SUBSUMED-RULE*");

    private static final SubLSymbol $sym32$_TIME_POINT_SUBSUMED_RULE__INITIALIZER = makeSymbol("*TIME-POINT-SUBSUMED-RULE*-INITIALIZER");

    private static final SubLList $list33 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("TimeParameter")), list(reader_make_constant_shell("different"), reader_make_constant_shell("TimePoint"), makeSymbol("?X"))), list(reader_make_constant_shell("temporallySubsumes-TypeType"), makeSymbol("?X"), reader_make_constant_shell("TimePoint")));

    private static final SubLSymbol $null_param_subsumes_rule$ = makeSymbol("*NULL-PARAM-SUBSUMES-RULE*");

    private static final SubLSymbol $sym35$_NULL_PARAM_SUBSUMES_RULE__INITIALIZER = makeSymbol("*NULL-PARAM-SUBSUMES-RULE*-INITIALIZER");

    private static final SubLList $list36 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("TimeParameter")), list(reader_make_constant_shell("different"), reader_make_constant_shell("Null-TimeParameter"), makeSymbol("?X"))), list(reader_make_constant_shell("temporallySubsumes-TypeType"), reader_make_constant_shell("Null-TimeParameter"), makeSymbol("?X")));

    private static final SubLSymbol $temporally_subsumes_typetype_reflexive_rule$ = makeSymbol("*TEMPORALLY-SUBSUMES-TYPETYPE-REFLEXIVE-RULE*");

    private static final SubLSymbol $sym38$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE__INITIALIZER = makeSymbol("*TEMPORALLY-SUBSUMES-TYPETYPE-REFLEXIVE-RULE*-INITIALIZER");

    private static final SubLList $list39 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("temporallySubsumes-TypeType"), reader_make_constant_shell("ReflexiveBinaryPredicate"));

    private static final SubLSymbol $rae_defining_temporally_subsumes_typetype_rule$ = makeSymbol("*RAE-DEFINING-TEMPORALLY-SUBSUMES-TYPETYPE-RULE*");

    private static final SubLSymbol $sym41$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE__INITIALIZER = makeSymbol("*RAE-DEFINING-TEMPORALLY-SUBSUMES-TYPETYPE-RULE*-INITIALIZER");

    private static final SubLList $list42 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("relationAllExists"), reader_make_constant_shell("temporallySubsumes"), makeSymbol("?LONGER-TYPE"), makeSymbol("?SHORTER-TYPE")), list(reader_make_constant_shell("temporallySubsumes-TypeType"), makeSymbol("?LONGER-TYPE"), makeSymbol("?SHORTER-TYPE")));

    private static final SubLSymbol $temporal_subsumption_of_sliding_types_rule$ = makeSymbol("*TEMPORAL-SUBSUMPTION-OF-SLIDING-TYPES-RULE*");

    private static final SubLSymbol $sym44$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE__INITIALIZER = makeSymbol("*TEMPORAL-SUBSUMPTION-OF-SLIDING-TYPES-RULE*-INITIALIZER");

    private static final SubLList $list45 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?INT1"), list(reader_make_constant_shell("SameLengthTimeIntervalTypeFn"), makeSymbol("?DUR1"))), list(reader_make_constant_shell("isa"), makeSymbol("?INT2"), list(reader_make_constant_shell("SameLengthTimeIntervalTypeFn"), makeSymbol("?DUR2"))), list(reader_make_constant_shell("lessThanOrEqualTo"), makeSymbol("?DUR1"), makeSymbol("?DUR2"))), list(reader_make_constant_shell("temporallySubsumes"), makeSymbol("?INT2"), makeSymbol("?INT1")));

    private static final SubLSymbol $period_plus_duration_subsumes_gappy_type$ = makeSymbol("*PERIOD-PLUS-DURATION-SUBSUMES-GAPPY-TYPE*");

    private static final SubLSymbol $sym47$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE__INITIALIZER = makeSymbol("*PERIOD-PLUS-DURATION-SUBSUMES-GAPPY-TYPE*-INITIALIZER");

    private static final SubLList $list48 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?TYPE"), reader_make_constant_shell("ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps")), list(reader_make_constant_shell("periodOfTimeIntervalSeries"), makeSymbol("?TYPE"), makeSymbol("?DURATION1")), list(reader_make_constant_shell("durationOfType"), makeSymbol("?TYPE"), makeSymbol("?DURATION2"))), list(reader_make_constant_shell("temporallySubsumes-TypeType"), list(reader_make_constant_shell("SameLengthTimeIntervalTypeFn"), list(reader_make_constant_shell("PlusFn"), makeSymbol("?DURATION1"), makeSymbol("?DURATION2"))), makeSymbol("?TYPE")));









    private static final SubLList $list55 = list(ONE_INTEGER);



    private static final SubLSymbol $sym57$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE = makeSymbol("FIRST-PARAMETER>=PREVIOUS-SLIDING-TYPE");



    private static final SubLList $list61 = list(reader_make_constant_shell("ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps"));







    private static final SubLSymbol $sym66$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE = makeSymbol("FIRST-PARAMETER<=PREVIOUS-SLIDING-TYPE");

    private static final SubLSymbol $always_subsumes_everything_support$ = makeSymbol("*ALWAYS-SUBSUMES-EVERYTHING-SUPPORT*");

    private static final SubLSymbol $sym68$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT__INITIALIZER = makeSymbol("*ALWAYS-SUBSUMES-EVERYTHING-SUPPORT*-INITIALIZER");

    private static final SubLList $list69 = list(reader_make_constant_shell("relationInstanceAll"), reader_make_constant_shell("timeSlices"), reader_make_constant_shell("Always-TimeInterval"), reader_make_constant_shell("TimeInterval"));

    private static final SubLSymbol $time_point_subsumed_by_everything_support$ = makeSymbol("*TIME-POINT-SUBSUMED-BY-EVERYTHING-SUPPORT*");

    private static final SubLSymbol $sym71$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT__INITIALIZER = makeSymbol("*TIME-POINT-SUBSUMED-BY-EVERYTHING-SUPPORT*-INITIALIZER");

    private static final SubLList $list72 = list(reader_make_constant_shell("relationAllInstance"), reader_make_constant_shell("temporallySubsumes"), reader_make_constant_shell("TimeInterval"), reader_make_constant_shell("TimePoint"));

    private static final SubLSymbol $cooriginating_interval_of_lesser_duration_is_subsumed_support$ = makeSymbol("*COORIGINATING-INTERVAL-OF-LESSER-DURATION-IS-SUBSUMED-SUPPORT*");

    private static final SubLSymbol $sym74$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT__I = makeSymbol("*COORIGINATING-INTERVAL-OF-LESSER-DURATION-IS-SUBSUMED-SUPPORT*-INITIALIZER");

    private static final SubLList $list75 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?INTERVAL1"), reader_make_constant_shell("TimeInterval")), list(reader_make_constant_shell("isa"), makeSymbol("?INTERVAL2"), reader_make_constant_shell("TimeInterval")), list(reader_make_constant_shell("duration"), makeSymbol("?INTERVAL1"), makeSymbol("?DUR1")), list(reader_make_constant_shell("duration"), makeSymbol("?INTERVAL2"), makeSymbol("?DUR2")), list(reader_make_constant_shell("lessThanOrEqualTo"), makeSymbol("?DUR2"), makeSymbol("?DUR1")), list(reader_make_constant_shell("temporallyCooriginating"), makeSymbol("?INTERVAL1"), makeSymbol("?INTERVAL2"))), list(reader_make_constant_shell("temporallySubsumes"), makeSymbol("?INTERVAL1"), makeSymbol("?INTERVAL2")));

    private static final SubLObject $$Always_TimeInterval = reader_make_constant_shell("Always-TimeInterval");







    private static final SubLSymbol $sym81$_INTERVAL = makeSymbol("?INTERVAL");





    private static final SubLObject $$temporallySubsumes_InsType = reader_make_constant_shell("temporallySubsumes-InsType");

    public static final SubLObject inference_temporally_subsumes_typetype_alt(SubLObject type) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption.all_types_temporally_subsumed_by_type(type);
    }

    public static SubLObject inference_temporally_subsumes_typetype(final SubLObject type) {
        return all_types_temporally_subsumed_by_type(type);
    }

    public static final SubLObject removal_temporally_subsumes_typetype_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return divide(length(isa.all_fort_instances($$TimeParameter, UNPROVIDED, UNPROVIDED)), TWO_INTEGER);
    }

    public static SubLObject removal_temporally_subsumes_typetype_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return divide(length(isa.all_fort_instances($$TimeParameter, UNPROVIDED, UNPROVIDED)), TWO_INTEGER);
    }

    public static final SubLObject inference_temporally_subsumed_typetype_alt(SubLObject type) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption.all_types_temporally_subsuming_type(type);
    }

    public static SubLObject inference_temporally_subsumed_typetype(final SubLObject type) {
        return all_types_temporally_subsuming_type(type);
    }

    public static final SubLObject removal_temporally_subsumed_typetype_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return divide(length(isa.all_fort_instances($$TimeParameter, UNPROVIDED, UNPROVIDED)), TWO_INTEGER);
    }

    public static SubLObject removal_temporally_subsumed_typetype_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return divide(length(isa.all_fort_instances($$TimeParameter, UNPROVIDED, UNPROVIDED)), TWO_INTEGER);
    }

    public static final SubLObject inference_temporally_subsumes_instype_generate_types_alt(SubLObject interval) {
        return NIL;
    }

    public static SubLObject inference_temporally_subsumes_instype_generate_types(final SubLObject interval) {
        return NIL;
    }

    public static final SubLObject removal_temporally_subsumes_instype_generate_types_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return TEN_INTEGER;
    }

    public static SubLObject removal_temporally_subsumes_instype_generate_types_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return TEN_INTEGER;
    }

    public static final SubLObject inference_temporally_subsumed_instype_generate_intervals_alt(SubLObject type) {
        return NIL;
    }

    public static SubLObject inference_temporally_subsumed_instype_generate_intervals(final SubLObject type) {
        return NIL;
    }

    public static final SubLObject removal_temporally_subsumed_instype_generate_intervals_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return TEN_INTEGER;
    }

    public static SubLObject removal_temporally_subsumed_instype_generate_intervals_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return TEN_INTEGER;
    }

    /**
     *
     *
     * @return listp;  Returns all the time parameter types T s.t. (#$temporallySubsumes-TypeType TYPE T).
     */
    @LispMethod(comment = "@return listp;  Returns all the time parameter types T s.t. (#$temporallySubsumes-TypeType TYPE T).")
    public static final SubLObject all_types_temporally_subsumed_by_type_alt(SubLObject type) {
        if (type == $$Null_TimeParameter) {
            return isa.all_fort_instances($$TimeParameter, UNPROVIDED, UNPROVIDED);
        } else {
            if (type == $$TimePoint) {
                return $list_alt28;
            } else {
                if (NIL != time_parameter_utilities.sliding_time_type_p(type)) {
                    return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption.all_types_subsumed_by_sliding_type(type);
                } else {
                    return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption.all_types_subsumed_by_conventional_type(type);
                }
            }
        }
    }

    /**
     *
     *
     * @return listp;  Returns all the time parameter types T s.t. (#$temporallySubsumes-TypeType TYPE T).
     */
    @LispMethod(comment = "@return listp;  Returns all the time parameter types T s.t. (#$temporallySubsumes-TypeType TYPE T).")
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

    /**
     *
     *
     * @return listp;  Returns all the time parameter types T s.t. (#$temporallySubsumes-TypeType T TYPE).
     */
    @LispMethod(comment = "@return listp;  Returns all the time parameter types T s.t. (#$temporallySubsumes-TypeType T TYPE).")
    public static final SubLObject all_types_temporally_subsuming_type_alt(SubLObject type) {
        if (type == $$Null_TimeParameter) {
            return $list_alt29;
        } else {
            if (type == $$TimePoint) {
                return isa.all_fort_instances($$TimeParameter, UNPROVIDED, UNPROVIDED);
            } else {
                if (NIL != time_parameter_utilities.sliding_time_type_p(type)) {
                    return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption.all_types_subsuming_sliding_type(type);
                } else {
                    return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption.all_types_subsuming_conventional_type(type);
                }
            }
        }
    }

    /**
     *
     *
     * @return listp;  Returns all the time parameter types T s.t. (#$temporallySubsumes-TypeType T TYPE).
     */
    @LispMethod(comment = "@return listp;  Returns all the time parameter types T s.t. (#$temporallySubsumes-TypeType T TYPE).")
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

    /**
     *
     *
     * @return listp;  Returns the list of stored intervals, I, s.t. (#$temporallySubsumes-InsType I TYPE).
     */
    @LispMethod(comment = "@return listp;  Returns the list of stored intervals, I, s.t. (#$temporallySubsumes-InsType I TYPE).")
    public static final SubLObject all_intervals_temporally_subsuming_type_alt(SubLObject type) {
        return list(type);
    }

    /**
     *
     *
     * @return listp;  Returns the list of stored intervals, I, s.t. (#$temporallySubsumes-InsType I TYPE).
     */
    @LispMethod(comment = "@return listp;  Returns the list of stored intervals, I, s.t. (#$temporallySubsumes-InsType I TYPE).")
    public static SubLObject all_intervals_temporally_subsuming_type(final SubLObject type) {
        return list(type);
    }

    /**
     *
     *
     * @return listp;  Returns the time parameter types, T s.t. (#$temporallySubsumes-InsType INTERVAL T).
     */
    @LispMethod(comment = "@return listp;  Returns the time parameter types, T s.t. (#$temporallySubsumes-InsType INTERVAL T).")
    public static final SubLObject all_types_temporally_subsumed_by_interval_alt(SubLObject interval) {
        return NIL;
    }

    /**
     *
     *
     * @return listp;  Returns the time parameter types, T s.t. (#$temporallySubsumes-InsType INTERVAL T).
     */
    @LispMethod(comment = "@return listp;  Returns the time parameter types, T s.t. (#$temporallySubsumes-InsType INTERVAL T).")
    public static SubLObject all_types_temporally_subsumed_by_interval(final SubLObject interval) {
        return NIL;
    }

    public static final SubLObject all_types_subsumed_by_sliding_type_alt(SubLObject type) {
        {
            SubLObject params = isa.all_fort_instances($$TimeParameter, UNPROVIDED, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = params;
            SubLObject param = NIL;
            for (param = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , param = cdolist_list_var.first()) {
                if (NIL != hlmt_relevance.bigger_time_typeP(type, param)) {
                    result = cons(param, result);
                }
            }
            return result;
        }
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

    public static final SubLObject all_types_subsumed_by_conventional_type_alt(SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
                    try {
                        gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
                        result = gt_methods.gt_all_superiors($$temporallySubsumes_TypeType, type, UNPROVIDED);
                    } finally {
                        gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
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

    public static final SubLObject all_types_subsuming_sliding_type_alt(SubLObject type) {
        {
            SubLObject params = isa.all_fort_instances($$TimeParameter, UNPROVIDED, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = params;
            SubLObject param = NIL;
            for (param = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , param = cdolist_list_var.first()) {
                if (NIL != hlmt_relevance.bigger_time_typeP(param, type)) {
                    result = cons(param, result);
                }
            }
            return result;
        }
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

    public static final SubLObject all_types_subsuming_conventional_type_alt(SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
                    try {
                        gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
                        result = gt_methods.gt_all_inferiors($$temporallySubsumes_TypeType, type, UNPROVIDED);
                    } finally {
                        gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
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

    public static final SubLObject time_point_subsumed_ruleX_initializer_alt() {
        return hl_supports.find_assertion_or_make_support($list_alt34, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static SubLObject time_point_subsumed_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list33, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static final SubLObject null_param_subsumes_ruleX_initializer_alt() {
        return hl_supports.find_assertion_or_make_support($list_alt37, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static SubLObject null_param_subsumes_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list36, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static final SubLObject temporally_subsumes_typetype_reflexive_ruleX_initializer_alt() {
        return hl_supports.find_assertion_or_make_support($list_alt40, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static SubLObject temporally_subsumes_typetype_reflexive_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list39, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static final SubLObject rae_defining_temporally_subsumes_typetype_ruleX_initializer_alt() {
        return hl_supports.find_assertion_or_make_support($list_alt43, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static SubLObject rae_defining_temporally_subsumes_typetype_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list42, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static final SubLObject temporal_subsumption_of_sliding_types_ruleX_initializer_alt() {
        return hl_supports.find_assertion_or_make_support($list_alt46, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static SubLObject temporal_subsumption_of_sliding_types_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support($list45, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static final SubLObject period_plus_duration_subsumes_gappy_typeX_initializer_alt() {
        return hl_supports.find_assertion_or_make_support($list_alt49, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static SubLObject period_plus_duration_subsumes_gappy_typeX_initializer() {
        return hl_supports.find_assertion_or_make_support($list48, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    /**
     *
     *
     * @return listp;  Returns justification of (#$temporallySubsumes-TypeType BIG-TYPE SMALL-TYPE).
     */
    @LispMethod(comment = "@return listp;  Returns justification of (#$temporallySubsumes-TypeType BIG-TYPE SMALL-TYPE).")
    public static final SubLObject why_bigger_time_typeP_alt(SubLObject big, SubLObject small) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption.why_temporally_subsumes_typetypeP(big, small);
    }

    /**
     *
     *
     * @return listp;  Returns justification of (#$temporallySubsumes-TypeType BIG-TYPE SMALL-TYPE).
     */
    @LispMethod(comment = "@return listp;  Returns justification of (#$temporallySubsumes-TypeType BIG-TYPE SMALL-TYPE).")
    public static SubLObject why_bigger_time_typeP(final SubLObject big, final SubLObject small) {
        return why_temporally_subsumes_typetypeP(big, small);
    }

    /**
     *
     *
     * @return listp;  Returns justification of (#$temporallySubsumes-TypeType BIG-TYPE SMALL-TYPE).
     */
    @LispMethod(comment = "@return listp;  Returns justification of (#$temporallySubsumes-TypeType BIG-TYPE SMALL-TYPE).")
    public static final SubLObject why_temporally_subsumes_typetypeP_alt(SubLObject big, SubLObject small) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (big.equal(small)) {
                return list($temporally_subsumes_typetype_reflexive_rule$.getDynamicValue(thread));
            } else {
                if (big == $$Null_TimeParameter) {
                    return list($null_param_subsumes_rule$.getDynamicValue(thread));
                } else {
                    if (small == $$TimePoint) {
                        return list($time_point_subsumed_rule$.getDynamicValue(thread));
                    } else {
                        if ((NIL != time_parameter_utilities.sliding_time_type_p(big)) && (NIL != time_parameter_utilities.sliding_time_type_p(small))) {
                            return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption.why_sliding_time_typeLE(small, big);
                        } else {
                            if ((NIL != time_parameter_utilities.conventional_time_series_p(big)) && (NIL != time_parameter_utilities.sliding_time_type_p(small))) {
                                return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption.why_covering_type_subsumes_sliding_typeP(big, small);
                            } else {
                                if ((NIL != time_parameter_utilities.sliding_time_type_p(big)) && (NIL != time_parameter_utilities.conventional_time_series_p(small))) {
                                    return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption.why_sliding_type_subsumes_covering_typeP(big, small);
                                } else {
                                    return list(arguments.make_hl_support($TRANSITIVITY, list($$temporallySubsumes_TypeType, big, small), $$UniversalVocabularyMt, UNPROVIDED));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return listp;  Returns justification of (#$temporallySubsumes-TypeType BIG-TYPE SMALL-TYPE).
     */
    @LispMethod(comment = "@return listp;  Returns justification of (#$temporallySubsumes-TypeType BIG-TYPE SMALL-TYPE).")
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

    /**
     *
     *
     * @return listp; Returns why SMALL has shorter or equal duration to BIG
     */
    @LispMethod(comment = "@return listp; Returns why SMALL has shorter or equal duration to BIG")
    public static final SubLObject why_sliding_time_typeLE_alt(SubLObject small, SubLObject big) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject small_unit = time_parameter_utilities.extract_sliding_time_type(small);
                SubLObject big_unit = time_parameter_utilities.extract_sliding_time_type(big);
                SubLObject small_amount = time_parameter_utilities.extract_sliding_type_amount(small);
                SubLObject big_amount = time_parameter_utilities.extract_sliding_type_amount(big);
                if (small_unit == big_unit) {
                    return list($rae_defining_temporally_subsumes_typetype_rule$.getDynamicValue(thread), $temporal_subsumption_of_sliding_types_rule$.getDynamicValue(thread), arguments.make_hl_support($EVAL, list($$lessThanOrEqualTo, small_amount, big_amount), UNPROVIDED, UNPROVIDED));
                } else {
                    if (NIL != time_parameter_utilities.duration_typeL(small_unit, big_unit)) {
                        {
                            SubLObject quotient = time_parameter_utilities.find_duration_quotient(small_unit, big_unit, UNPROVIDED);
                            SubLObject product = multiply(quotient, big_amount);
                            return list($rae_defining_temporally_subsumes_typetype_rule$.getDynamicValue(thread), $temporal_subsumption_of_sliding_types_rule$.getDynamicValue(thread), arguments.make_hl_support($EVAL, list($$evaluate, quotient, list($$QuotientFn, bq_cons(big_unit, $list_alt56), bq_cons(small_unit, $list_alt56))), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($EVAL, list($$evaluate, list(small_unit, product), list($$TimesFn, list(small_unit, quotient), big_amount)), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($EVAL, list($$lessThanOrEqualTo, small_amount, product), UNPROVIDED, UNPROVIDED));
                        }
                    } else {
                        {
                            SubLObject quotient = time_parameter_utilities.find_duration_quotient(big_unit, small_unit, UNPROVIDED);
                            SubLObject product = multiply(quotient, small_amount);
                            return list($rae_defining_temporally_subsumes_typetype_rule$.getDynamicValue(thread), $temporal_subsumption_of_sliding_types_rule$.getDynamicValue(thread), arguments.make_hl_support($EVAL, list($$evaluate, quotient, list($$QuotientFn, bq_cons(small_unit, $list_alt56), bq_cons(big_unit, $list_alt56))), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($EVAL, list($$evaluate, list(big_unit, product), list($$TimesFn, list(big_unit, quotient), small_amount)), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($EVAL, list($$lessThanOrEqualTo, product, big_amount), UNPROVIDED, UNPROVIDED));
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return listp; Returns why SMALL has shorter or equal duration to BIG
     */
    @LispMethod(comment = "@return listp; Returns why SMALL has shorter or equal duration to BIG")
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

    /**
     *
     *
     * @return listp;  Returns why COVERING-TYPE always subsumes some instance SLIDING-TYPE.
     */
    @LispMethod(comment = "@return listp;  Returns why COVERING-TYPE always subsumes some instance SLIDING-TYPE.")
    public static final SubLObject why_covering_type_subsumes_sliding_typeP_alt(SubLObject covering_type, SubLObject sliding_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject subsumed_sliding_type = NIL;
                {
                    SubLObject _prev_bind_0 = hlmt_relevance.$hlmt_sliding_type$.currentBinding(thread);
                    SubLObject _prev_bind_1 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
                    try {
                        hlmt_relevance.$hlmt_sliding_type$.bind(sliding_type, thread);
                        gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
                        subsumed_sliding_type = gt_methods.gt_gather_superior($$temporallySubsumes_TypeType, covering_type, $sym58$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE, $$UniversalVocabularyMt);
                    } finally {
                        gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_1, thread);
                        hlmt_relevance.$hlmt_sliding_type$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != subsumed_sliding_type) {
                    return list(arguments.make_hl_support($TRANSITIVITY, list($$temporallySubsumes_TypeType, covering_type, subsumed_sliding_type), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($TIME, list($$temporallySubsumes_TypeType, subsumed_sliding_type, sliding_type), UNPROVIDED, UNPROVIDED));
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return listp;  Returns why COVERING-TYPE always subsumes some instance SLIDING-TYPE.
     */
    @LispMethod(comment = "@return listp;  Returns why COVERING-TYPE always subsumes some instance SLIDING-TYPE.")
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

    public static final SubLObject first_parameterGEprevious_sliding_type_alt(SubLObject time_parameter) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != time_parameter_utilities.sliding_time_type_p(time_parameter)) {
                if (NIL != hlmt_relevance.sliding_time_typeLE(hlmt_relevance.$hlmt_sliding_type$.getDynamicValue(thread), time_parameter)) {
                    return time_parameter;
                }
            }
            return NIL;
        }
    }

    public static SubLObject first_parameterGEprevious_sliding_type(final SubLObject time_parameter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != time_parameter_utilities.sliding_time_type_p(time_parameter)) && (NIL != hlmt_relevance.sliding_time_typeLE(hlmt_relevance.$hlmt_sliding_type$.getDynamicValue(thread), time_parameter))) {
            return time_parameter;
        }
        return NIL;
    }

    static private final SubLList $list_alt1 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    /**
     *
     *
     * @return listp;  Returns why SLIDING-TYPE always subsumes some instance COVERING-TYPE.
     */
    @LispMethod(comment = "@return listp;  Returns why SLIDING-TYPE always subsumes some instance COVERING-TYPE.")
    public static final SubLObject why_sliding_type_subsumes_covering_typeP_alt(SubLObject sliding_type, SubLObject covering_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != time_parameter_utilities.gappy_time_type_p(covering_type)) {
                {
                    SubLObject min_subsuming_slider = hlmt_relevance.minimally_subsuming_sliding_type_for_gappy_type(covering_type);
                    SubLObject result = NIL;
                    if (NIL != hlmt_relevance.sliding_time_typeLE(min_subsuming_slider, sliding_type)) {
                        {
                            SubLObject period_dur = time_parameter_utilities.gappy_type_period(covering_type);
                            SubLObject type_dur = time_parameter_utilities.gappy_type_duration(covering_type);
                            result = list($period_plus_duration_subsumes_gappy_type$.getDynamicValue(thread), arguments.make_hl_support($ISA, listS($$isa, sliding_type, $list_alt62), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($QUERY, list($$periodOfTimeIntervalSeries, covering_type, period_dur), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($QUERY, list($$durationOfType, covering_type, type_dur), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($EVAL, list($$evaluate, time_parameter_utilities.extract_sliding_type(min_subsuming_slider), list($$PlusFn, period_dur, type_dur)), UNPROVIDED, UNPROVIDED));
                        }
                        if (!min_subsuming_slider.equal(sliding_type)) {
                            result = cons(arguments.make_hl_support($TIME, list($$temporallySubsumes_TypeType, sliding_type, min_subsuming_slider), UNPROVIDED, UNPROVIDED), result);
                        }
                        return result;
                    }
                }
            }
            {
                SubLObject subsuming_sliding_type = NIL;
                {
                    SubLObject _prev_bind_0 = hlmt_relevance.$hlmt_sliding_type$.currentBinding(thread);
                    SubLObject _prev_bind_1 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
                    try {
                        hlmt_relevance.$hlmt_sliding_type$.bind(sliding_type, thread);
                        gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
                        subsuming_sliding_type = gt_methods.gt_gather_inferior($$temporallySubsumes_TypeType, covering_type, $sym67$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE, $$UniversalVocabularyMt);
                    } finally {
                        gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_1, thread);
                        hlmt_relevance.$hlmt_sliding_type$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != subsuming_sliding_type) {
                    return list(arguments.make_hl_support($TRANSITIVITY, list($$temporallySubsumes_TypeType, subsuming_sliding_type, covering_type), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($TIME, list($$temporallySubsumes_TypeType, sliding_type, subsuming_sliding_type), UNPROVIDED, UNPROVIDED));
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @return listp;  Returns why SLIDING-TYPE always subsumes some instance COVERING-TYPE.
     */
    @LispMethod(comment = "@return listp;  Returns why SLIDING-TYPE always subsumes some instance COVERING-TYPE.")
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

    static private final SubLList $list_alt3 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), list(reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORALLY-SUBSUMES-TYPETYPE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("temporallySubsumes-TypeType"), list($BIND, makeSymbol("BIG")), list($BIND, makeSymbol("SMALL"))), list(list(makeKeyword("VALUE"), makeSymbol("BIG")), list(makeKeyword("VALUE"), makeSymbol("SMALL")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("BIG"), makeSymbol("SMALL")), list($CALL, makeSymbol("BIGGER-TIME-TYPE?"), list(makeKeyword("VALUE"), makeSymbol("BIG")), list(makeKeyword("VALUE"), makeSymbol("SMALL")))), makeKeyword("SUPPORT-MODULE"), $TIME, makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-TypeType TYPE1 TYPE2)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-TypeType #$CalendarDay #$CalendarHour)") });

    static private final SubLList $list_alt7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("temporallySubsumes-TypeType"), list($BIND, makeSymbol("BIG")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("BIG"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("INFERENCE-TEMPORALLY-SUBSUMES-TYPETYPE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-TypeType"), list(makeKeyword("VALUE"), makeSymbol("BIG")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), $TIME, makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-TypeType TYPE ?X)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-TypeType #$CalendarDay ?WHAT) ->\n    #$CalendarHour, #$CalendarMinute, (#$SameLengthTimeIntervalTypeFn (#$DaysDuration 1)), etc ") });

    public static final SubLObject first_parameterLEprevious_sliding_type_alt(SubLObject time_parameter) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != time_parameter_utilities.sliding_time_type_p(time_parameter)) {
                if (NIL != hlmt_relevance.sliding_time_typeLE(time_parameter, hlmt_relevance.$hlmt_sliding_type$.getDynamicValue(thread))) {
                    return time_parameter;
                }
            }
            return NIL;
        }
    }

    public static SubLObject first_parameterLEprevious_sliding_type(final SubLObject time_parameter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != time_parameter_utilities.sliding_time_type_p(time_parameter)) && (NIL != hlmt_relevance.sliding_time_typeLE(time_parameter, hlmt_relevance.$hlmt_sliding_type$.getDynamicValue(thread)))) {
            return time_parameter;
        }
        return NIL;
    }

    public static final SubLObject always_subsumes_everything_supportX_initializer_alt() {
        return hl_supports.find_assertion_or_make_support($list_alt70, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static SubLObject always_subsumes_everything_supportX_initializer() {
        return hl_supports.find_assertion_or_make_support($list69, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static final SubLObject time_point_subsumed_by_everything_supportX_initializer_alt() {
        return hl_supports.find_assertion_or_make_support($list_alt73, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static SubLObject time_point_subsumed_by_everything_supportX_initializer() {
        return hl_supports.find_assertion_or_make_support($list72, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static final SubLObject cooriginating_interval_of_lesser_duration_is_subsumed_supportX_initializer_alt() {
        return hl_supports.find_assertion_or_make_support($list_alt76, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    public static SubLObject cooriginating_interval_of_lesser_duration_is_subsumed_supportX_initializer() {
        return hl_supports.find_assertion_or_make_support($list75, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }

    /**
     *
     *
     * @return listp;  Returns justification of (#$temporallySubsumes-InsType INTERVAL TYPE).
     */
    @LispMethod(comment = "@return listp;  Returns justification of (#$temporallySubsumes-InsType INTERVAL TYPE).")
    public static final SubLObject why_time_interval_subsumes_typeP_alt(SubLObject interval, SubLObject type) {
        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption.why_temporally_subsumes_instypeP(interval, type);
    }

    /**
     *
     *
     * @return listp;  Returns justification of (#$temporallySubsumes-InsType INTERVAL TYPE).
     */
    @LispMethod(comment = "@return listp;  Returns justification of (#$temporallySubsumes-InsType INTERVAL TYPE).")
    public static SubLObject why_time_interval_subsumes_typeP(final SubLObject interval, final SubLObject type) {
        return why_temporally_subsumes_instypeP(interval, type);
    }

    /**
     *
     *
     * @return listp;  Returns justification of (#$temporallySubsumes-InsType INTERVAL TYPE).
     */
    @LispMethod(comment = "@return listp;  Returns justification of (#$temporallySubsumes-InsType INTERVAL TYPE).")
    public static final SubLObject why_temporally_subsumes_instypeP_alt(SubLObject interval, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (interval == $$Always_TimeInterval) {
                return list($always_subsumes_everything_support$.getDynamicValue(thread));
            } else {
                if (type == $$TimePoint) {
                    return list($time_point_subsumed_by_everything_support$.getDynamicValue(thread));
                } else {
                    if (NIL != time_interval_utilities.date_interval_p(interval)) {
                        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption.why_date_interval_subsumes_typeP(interval, type);
                    } else {
                        return com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption.why_arbitrary_interval_subsumes_typeP(interval, type);
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return listp;  Returns justification of (#$temporallySubsumes-InsType INTERVAL TYPE).
     */
    @LispMethod(comment = "@return listp;  Returns justification of (#$temporallySubsumes-InsType INTERVAL TYPE).")
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

    static private final SubLList $list_alt10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), $COST, makeSymbol("REMOVAL-TEMPORALLY-SUBSUMED-TYPETYPE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("SMALL"))), list(makeKeyword("VALUE"), makeSymbol("SMALL"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("INFERENCE-TEMPORALLY-SUBSUMED-TYPETYPE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-TypeType"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("SMALL"))), makeKeyword("SUPPORT-MODULE"), $TIME, makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-TypeType ?X TYPE)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-TypeType ?WHAT #$CalendarDay) ->\n    #$CalendarWeek, #$CalendarMonth, (#$SameLengthTimeIntervalTypeFn (#$DaysDuration 2)), etc") });

    /**
     *
     *
     * @return listp;  Returns why INTERVAL subsumes some instance of TYPE.
     */
    @LispMethod(comment = "@return listp;  Returns why INTERVAL subsumes some instance of TYPE.")
    public static final SubLObject why_date_interval_subsumes_typeP_alt(SubLObject interval, SubLObject type) {
        {
            SubLObject witness = time_parameter_utilities.nth_type_starting_no_earlier_than_start_of_interval(interval, type, ZERO_INTEGER);
            return witness.equal(interval) ? ((SubLObject) (list(arguments.make_hl_support($ISA, list($$isa, witness, type), UNPROVIDED, UNPROVIDED)))) : list(arguments.make_hl_support($ISA, list($$isa, witness, type), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($TIME, list($$temporallySubsumes, interval, witness), UNPROVIDED, UNPROVIDED));
        }
    }

    /**
     *
     *
     * @return listp;  Returns why INTERVAL subsumes some instance of TYPE.
     */
    @LispMethod(comment = "@return listp;  Returns why INTERVAL subsumes some instance of TYPE.")
    public static SubLObject why_date_interval_subsumes_typeP(final SubLObject interval, final SubLObject type) {
        final SubLObject witness = time_parameter_utilities.nth_type_starting_no_earlier_than_start_of_interval(interval, type, ZERO_INTEGER);
        return witness.equal(interval) ? list(arguments.make_hl_support($ISA, list($$isa, witness, type), UNPROVIDED, UNPROVIDED)) : list(arguments.make_hl_support($ISA, list($$isa, witness, type), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($TIME, list($$temporallySubsumes, interval, witness), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject interval_subsumes_cooriginating_type_justification_alt(SubLObject type, SubLObject interval) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject type_duration = time_parameter_utilities.get_duration_of_type(type);
                SubLObject interval_duration = time_parameter_utilities.get_duration_of_interval(interval);
                return (NIL != type_duration) && (NIL != interval_duration) ? ((SubLObject) (list(com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption.make_cooriginating_interval_support(type, interval), arguments.make_hl_support($QUERY, list($$durationOfType, type, type_duration), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($OPAQUE, list($$duration, interval, interval_duration), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($EVAL, list($$lessThanOrEqualTo, type_duration, interval_duration), UNPROVIDED, UNPROVIDED), $cooriginating_interval_of_lesser_duration_is_subsumed_support$.getDynamicValue(thread)))) : NIL;
            }
        }
    }

    public static SubLObject interval_subsumes_cooriginating_type_justification(final SubLObject type, final SubLObject interval) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject type_duration = time_parameter_utilities.get_duration_of_type(type);
        final SubLObject interval_duration = time_parameter_utilities.get_duration_of_interval(interval);
        return (NIL != type_duration) && (NIL != interval_duration) ? list(make_cooriginating_interval_support(type, interval), arguments.make_hl_support($QUERY, list($$durationOfType, type, type_duration), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($OPAQUE, list($$duration, interval, interval_duration), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($EVAL, list($$lessThanOrEqualTo, type_duration, interval_duration), UNPROVIDED, UNPROVIDED), $cooriginating_interval_of_lesser_duration_is_subsumed_support$.getDynamicValue(thread)) : NIL;
    }

    static private final SubLList $list_alt12 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    static private final SubLList $list_alt14 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), list(reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    public static final SubLObject make_cooriginating_interval_support_alt(SubLObject type, SubLObject interval) {
        return arguments.make_hl_support($OPAQUE, list($$thereExists, $sym82$_INTERVAL, list($$and, list($$isa, $sym82$_INTERVAL, type), list($$temporallyCooriginating, $sym82$_INTERVAL, interval))), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject make_cooriginating_interval_support(final SubLObject type, final SubLObject interval) {
        return arguments.make_hl_support($OPAQUE, list($$thereExists, $sym81$_INTERVAL, list($$and, list($$isa, $sym81$_INTERVAL, type), list($$temporallyCooriginating, $sym81$_INTERVAL, interval))), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp;  Returns why INTERVAL subsumes some instance of TYPE.
     */
    @LispMethod(comment = "@return listp;  Returns why INTERVAL subsumes some instance of TYPE.")
    public static final SubLObject why_arbitrary_interval_subsumes_typeP_alt(SubLObject interval, SubLObject type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject subsumed_type = NIL;
                SubLObject iterator = ghl_search_methods.new_ghl_closure_iterator($$temporallySubsumes, interval, ghl_search_vars.ghl_forward_direction(), NIL, NIL, $DEPTH_FIRST, UNPROVIDED);
                SubLObject done_var = subsumed_type;
                while (NIL == done_var) {
                    thread.resetMultipleValues();
                    {
                        SubLObject subsumed_interval = iteration.iteration_next(iterator);
                        SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            if (NIL != hlmt_relevance.arbitrary_interval_subsumes_typeP_int(subsumed_type, type)) {
                                subsumed_type = subsumed_interval;
                            }
                        }
                        done_var = makeBoolean((NIL == valid) || (NIL != subsumed_type));
                    }
                } 
                if (NIL == subsumed_type) {
                    return NIL;
                } else {
                    if (NIL != time_interval_utilities.date_interval_p(subsumed_type)) {
                        return list(arguments.make_hl_support($TRANSITIVITY, list($$temporallySubsumes, interval, subsumed_type), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($TIME, list($$temporallySubsumes_InsType, subsumed_type, type), UNPROVIDED, UNPROVIDED));
                    } else {
                        return list(arguments.make_hl_support($TRANSITIVITY, list($$temporallySubsumes, interval, subsumed_type), UNPROVIDED, UNPROVIDED), czer_meta.find_assertion_cycl(list($$temporallySubsumes_InsType, interval, subsumed_type), UNPROVIDED));
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return listp;  Returns why INTERVAL subsumes some instance of TYPE.
     */
    @LispMethod(comment = "@return listp;  Returns why INTERVAL subsumes some instance of TYPE.")
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

    static private final SubLList $list_alt16 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORALLY-SUBSUMES-INSTYPE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("temporallySubsumes-InsType"), list($BIND, makeSymbol("INTERVAL")), list($BIND, makeSymbol("TYPE"))), list(list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("INTERVAL"), makeSymbol("TYPE")), list($CALL, makeSymbol("TIME-INTERVAL-SUBSUMES-TYPE?"), list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))), makeKeyword("SUPPORT-MODULE"), $TIME, makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-InsType INTERVAL TYPE)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-InsType #$TheYear2000 #$CalendarYear)") });

    public static SubLObject declare_removal_modules_type_temporal_subsumption_file() {
        declareFunction("inference_temporally_subsumes_typetype", "INFERENCE-TEMPORALLY-SUBSUMES-TYPETYPE", 1, 0, false);
        declareFunction("removal_temporally_subsumes_typetype_cost", "REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-COST", 1, 1, false);
        declareFunction("inference_temporally_subsumed_typetype", "INFERENCE-TEMPORALLY-SUBSUMED-TYPETYPE", 1, 0, false);
        declareFunction("removal_temporally_subsumed_typetype_cost", "REMOVAL-TEMPORALLY-SUBSUMED-TYPETYPE-COST", 1, 1, false);
        declareFunction("inference_temporally_subsumes_instype_generate_types", "INFERENCE-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES", 1, 0, false);
        declareFunction("removal_temporally_subsumes_instype_generate_types_cost", "REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES-COST", 1, 1, false);
        declareFunction("inference_temporally_subsumed_instype_generate_intervals", "INFERENCE-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS", 1, 0, false);
        declareFunction("removal_temporally_subsumed_instype_generate_intervals_cost", "REMOVAL-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS-COST", 1, 1, false);
        declareFunction("all_types_temporally_subsumed_by_type", "ALL-TYPES-TEMPORALLY-SUBSUMED-BY-TYPE", 1, 0, false);
        declareFunction("all_types_temporally_subsuming_type", "ALL-TYPES-TEMPORALLY-SUBSUMING-TYPE", 1, 0, false);
        declareFunction("all_intervals_temporally_subsuming_type", "ALL-INTERVALS-TEMPORALLY-SUBSUMING-TYPE", 1, 0, false);
        declareFunction("all_types_temporally_subsumed_by_interval", "ALL-TYPES-TEMPORALLY-SUBSUMED-BY-INTERVAL", 1, 0, false);
        declareFunction("all_types_subsumed_by_sliding_type", "ALL-TYPES-SUBSUMED-BY-SLIDING-TYPE", 1, 0, false);
        declareFunction("all_types_subsumed_by_conventional_type", "ALL-TYPES-SUBSUMED-BY-CONVENTIONAL-TYPE", 1, 0, false);
        declareFunction("all_types_subsuming_sliding_type", "ALL-TYPES-SUBSUMING-SLIDING-TYPE", 1, 0, false);
        declareFunction("all_types_subsuming_conventional_type", "ALL-TYPES-SUBSUMING-CONVENTIONAL-TYPE", 1, 0, false);
        declareFunction("time_point_subsumed_ruleX_initializer", "*TIME-POINT-SUBSUMED-RULE*-INITIALIZER", 0, 0, false);
        declareFunction("null_param_subsumes_ruleX_initializer", "*NULL-PARAM-SUBSUMES-RULE*-INITIALIZER", 0, 0, false);
        declareFunction("temporally_subsumes_typetype_reflexive_ruleX_initializer", "*TEMPORALLY-SUBSUMES-TYPETYPE-REFLEXIVE-RULE*-INITIALIZER", 0, 0, false);
        declareFunction("rae_defining_temporally_subsumes_typetype_ruleX_initializer", "*RAE-DEFINING-TEMPORALLY-SUBSUMES-TYPETYPE-RULE*-INITIALIZER", 0, 0, false);
        declareFunction("temporal_subsumption_of_sliding_types_ruleX_initializer", "*TEMPORAL-SUBSUMPTION-OF-SLIDING-TYPES-RULE*-INITIALIZER", 0, 0, false);
        declareFunction("period_plus_duration_subsumes_gappy_typeX_initializer", "*PERIOD-PLUS-DURATION-SUBSUMES-GAPPY-TYPE*-INITIALIZER", 0, 0, false);
        declareFunction("why_bigger_time_typeP", "WHY-BIGGER-TIME-TYPE?", 2, 0, false);
        declareFunction("why_temporally_subsumes_typetypeP", "WHY-TEMPORALLY-SUBSUMES-TYPETYPE?", 2, 0, false);
        declareFunction("why_sliding_time_typeLE", "WHY-SLIDING-TIME-TYPE<=", 2, 0, false);
        declareFunction("why_covering_type_subsumes_sliding_typeP", "WHY-COVERING-TYPE-SUBSUMES-SLIDING-TYPE?", 2, 0, false);
        declareFunction("first_parameterGEprevious_sliding_type", "FIRST-PARAMETER>=PREVIOUS-SLIDING-TYPE", 1, 0, false);
        declareFunction("why_sliding_type_subsumes_covering_typeP", "WHY-SLIDING-TYPE-SUBSUMES-COVERING-TYPE?", 2, 0, false);
        declareFunction("first_parameterLEprevious_sliding_type", "FIRST-PARAMETER<=PREVIOUS-SLIDING-TYPE", 1, 0, false);
        declareFunction("always_subsumes_everything_supportX_initializer", "*ALWAYS-SUBSUMES-EVERYTHING-SUPPORT*-INITIALIZER", 0, 0, false);
        declareFunction("time_point_subsumed_by_everything_supportX_initializer", "*TIME-POINT-SUBSUMED-BY-EVERYTHING-SUPPORT*-INITIALIZER", 0, 0, false);
        declareFunction("cooriginating_interval_of_lesser_duration_is_subsumed_supportX_initializer", "*COORIGINATING-INTERVAL-OF-LESSER-DURATION-IS-SUBSUMED-SUPPORT*-INITIALIZER", 0, 0, false);
        declareFunction("why_time_interval_subsumes_typeP", "WHY-TIME-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
        declareFunction("why_temporally_subsumes_instypeP", "WHY-TEMPORALLY-SUBSUMES-INSTYPE?", 2, 0, false);
        declareFunction("why_date_interval_subsumes_typeP", "WHY-DATE-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
        declareFunction("interval_subsumes_cooriginating_type_justification", "INTERVAL-SUBSUMES-COORIGINATING-TYPE-JUSTIFICATION", 2, 0, false);
        declareFunction("make_cooriginating_interval_support", "MAKE-COORIGINATING-INTERVAL-SUPPORT", 2, 0, false);
        declareFunction("why_arbitrary_interval_subsumes_typeP", "WHY-ARBITRARY-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt18 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), $COST, makeSymbol("REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("temporallySubsumes-InsType"), list($BIND, makeSymbol("INTERVAL")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("INTERVAL"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("INFERENCE-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-InsType"), list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), $TIME, makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-InsType Interval ?X)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-InsType #$TheYear2000 ?WHAT) ->\n    #$CalendarYear, #$CalendarDay, (#$SameLengthTimeIntervalTypeFn (#$YearsDuration 1)), etc") });

    static private final SubLList $list_alt20 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), $COST, makeSymbol("REMOVAL-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("TYPE"))), list(makeKeyword("VALUE"), makeSymbol("TYPE"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("INFERENCE-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("temporallySubsumes-InsType"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TYPE"))), makeKeyword("SUPPORT-MODULE"), $TIME, makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes-InsType ?WHAT TYPE)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumes-InsType ?WHAT #$CalendarDay) ->\n    #$TheYear2000, (#$DayFn 4 (#$MonthFn #$July (#$YearFn 1776))), etc") });

    private static final SubLSymbol $TEMPORALLY_SUBSUMED_BY_INSTYPE_DELAY_POS = makeKeyword("TEMPORALLY-SUBSUMED-BY-INSTYPE-DELAY-POS");

    static private final SubLList $list_alt23 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumedBy-InsType"), makeKeyword("REQUIRED-PATTERN"), cons(reader_make_constant_shell("temporallySubsumedBy-InsType"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));

    static private final SubLList $list_alt25 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("temporallySubsumedBy-InsType"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("temporallySubsumedBy-InsType"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORALLY-SUBSUMED-BY-INSTYPE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("temporallySubsumedBy-InsType"), list($BIND, makeSymbol("INTERVAL")), list($BIND, makeSymbol("TYPE"))), list(list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("INTERVAL"), makeSymbol("TYPE")), list($CALL, makeSymbol("TIME-INTERVAL-SUBSUMED-BY-TYPE?"), list(makeKeyword("VALUE"), makeSymbol("INTERVAL")), list(makeKeyword("VALUE"), makeSymbol("TYPE")))), makeKeyword("SUPPORT-MODULE"), $TIME, makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumedBy-InsType INTERVAL TYPE)"), makeKeyword("EXAMPLE"), makeString("(#$temporallySubsumedBy-InsType #$TheYear2000 #$CalendarYear)") });

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

    static private final SubLList $list_alt28 = list(reader_make_constant_shell("TimePoint"));

    static private final SubLList $list_alt29 = list(reader_make_constant_shell("Null-TimeParameter"));

    public static final SubLObject setup_removal_modules_type_temporal_subsumption_file_alt() {
        preference_modules.inference_preference_module($TEMPORALLY_SUBSUMES_TYPETYPE_DELAY_POS, $list_alt1);
        preference_modules.inference_preference_module($TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE_POS, $list_alt3);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_CHECK, $list_alt5);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE, $list_alt7);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_SUBSUMED_TYPETYPE_GENERATE, $list_alt10);
        preference_modules.inference_preference_module($TEMPORALLY_SUBSUMES_INSTYPE_DELAY_POS, $list_alt12);
        preference_modules.inference_preference_module($TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_POS, $list_alt14);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_CHECK, $list_alt16);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_TYPES, $list_alt18);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_SUBSUMED_INSTYPE_GENERATE_INTERVALS, $list_alt20);
        inference_modules.register_solely_specific_removal_module_predicate($$temporallySubsumedBy_InsType);
        preference_modules.inference_preference_module($TEMPORALLY_SUBSUMED_BY_INSTYPE_DELAY_POS, $list_alt23);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_SUBSUMED_BY_INSTYPE_CHECK, $list_alt25);
        register_kb_variable_initialization($time_point_subsumed_rule$, $sym33$_TIME_POINT_SUBSUMED_RULE__INITIALIZER);
        register_kb_variable_initialization($null_param_subsumes_rule$, $sym36$_NULL_PARAM_SUBSUMES_RULE__INITIALIZER);
        register_kb_variable_initialization($temporally_subsumes_typetype_reflexive_rule$, $sym39$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE__INITIALIZER);
        register_kb_variable_initialization($rae_defining_temporally_subsumes_typetype_rule$, $sym42$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE__INITIALIZER);
        register_kb_variable_initialization($temporal_subsumption_of_sliding_types_rule$, $sym45$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE__INITIALIZER);
        register_kb_variable_initialization($period_plus_duration_subsumes_gappy_type$, $sym48$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE__INITIALIZER);
        register_kb_variable_initialization($always_subsumes_everything_support$, $sym69$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT__INITIALIZER);
        register_kb_variable_initialization($time_point_subsumed_by_everything_support$, $sym72$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT__INITIALIZER);
        register_kb_variable_initialization($cooriginating_interval_of_lesser_duration_is_subsumed_support$, $sym75$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT__I);
        return NIL;
    }

    public static SubLObject setup_removal_modules_type_temporal_subsumption_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            preference_modules.inference_preference_module($TEMPORALLY_SUBSUMED_BY_INSTYPE_DELAY_POS, $list_alt23);
            inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_SUBSUMED_BY_INSTYPE_CHECK, $list_alt25);
            register_kb_variable_initialization($time_point_subsumed_rule$, $sym33$_TIME_POINT_SUBSUMED_RULE__INITIALIZER);
            register_kb_variable_initialization($null_param_subsumes_rule$, $sym36$_NULL_PARAM_SUBSUMES_RULE__INITIALIZER);
            register_kb_variable_initialization($temporally_subsumes_typetype_reflexive_rule$, $sym39$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE__INITIALIZER);
            register_kb_variable_initialization($rae_defining_temporally_subsumes_typetype_rule$, $sym42$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE__INITIALIZER);
            register_kb_variable_initialization($temporal_subsumption_of_sliding_types_rule$, $sym45$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE__INITIALIZER);
            register_kb_variable_initialization($period_plus_duration_subsumes_gappy_type$, $sym48$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE__INITIALIZER);
            register_kb_variable_initialization($always_subsumes_everything_support$, $sym69$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT__INITIALIZER);
            register_kb_variable_initialization($time_point_subsumed_by_everything_support$, $sym72$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT__INITIALIZER);
            register_kb_variable_initialization($cooriginating_interval_of_lesser_duration_is_subsumed_support$, $sym75$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT__I);
        }
        return NIL;
    }

    public static SubLObject setup_removal_modules_type_temporal_subsumption_file_Previous() {
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

    static private final SubLSymbol $sym33$_TIME_POINT_SUBSUMED_RULE__INITIALIZER = makeSymbol("*TIME-POINT-SUBSUMED-RULE*-INITIALIZER");

    static private final SubLList $list_alt34 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("TimeParameter")), list(reader_make_constant_shell("different"), reader_make_constant_shell("TimePoint"), makeSymbol("?X"))), list(reader_make_constant_shell("temporallySubsumes-TypeType"), makeSymbol("?X"), reader_make_constant_shell("TimePoint")));

    static private final SubLSymbol $sym36$_NULL_PARAM_SUBSUMES_RULE__INITIALIZER = makeSymbol("*NULL-PARAM-SUBSUMES-RULE*-INITIALIZER");

    static private final SubLList $list_alt37 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?X"), reader_make_constant_shell("TimeParameter")), list(reader_make_constant_shell("different"), reader_make_constant_shell("Null-TimeParameter"), makeSymbol("?X"))), list(reader_make_constant_shell("temporallySubsumes-TypeType"), reader_make_constant_shell("Null-TimeParameter"), makeSymbol("?X")));

    static private final SubLSymbol $sym39$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE__INITIALIZER = makeSymbol("*TEMPORALLY-SUBSUMES-TYPETYPE-REFLEXIVE-RULE*-INITIALIZER");

    static private final SubLList $list_alt40 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("temporallySubsumes-TypeType"), reader_make_constant_shell("ReflexiveBinaryPredicate"));

    static private final SubLSymbol $sym42$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE__INITIALIZER = makeSymbol("*RAE-DEFINING-TEMPORALLY-SUBSUMES-TYPETYPE-RULE*-INITIALIZER");

    static private final SubLList $list_alt43 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("relationAllExists"), reader_make_constant_shell("temporallySubsumes"), makeSymbol("?LONGER-TYPE"), makeSymbol("?SHORTER-TYPE")), list(reader_make_constant_shell("temporallySubsumes-TypeType"), makeSymbol("?LONGER-TYPE"), makeSymbol("?SHORTER-TYPE")));

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

    static private final SubLSymbol $sym45$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE__INITIALIZER = makeSymbol("*TEMPORAL-SUBSUMPTION-OF-SLIDING-TYPES-RULE*-INITIALIZER");

    static {
    }

    static private final SubLList $list_alt46 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?INT1"), list(reader_make_constant_shell("SameLengthTimeIntervalTypeFn"), makeSymbol("?DUR1"))), list(reader_make_constant_shell("isa"), makeSymbol("?INT2"), list(reader_make_constant_shell("SameLengthTimeIntervalTypeFn"), makeSymbol("?DUR2"))), list(reader_make_constant_shell("lessThanOrEqualTo"), makeSymbol("?DUR1"), makeSymbol("?DUR2"))), list(reader_make_constant_shell("temporallySubsumes"), makeSymbol("?INT2"), makeSymbol("?INT1")));

    static private final SubLSymbol $sym48$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE__INITIALIZER = makeSymbol("*PERIOD-PLUS-DURATION-SUBSUMES-GAPPY-TYPE*-INITIALIZER");

    static private final SubLList $list_alt49 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?TYPE"), reader_make_constant_shell("ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps")), list(reader_make_constant_shell("periodOfTimeIntervalSeries"), makeSymbol("?TYPE"), makeSymbol("?DURATION1")), list(reader_make_constant_shell("durationOfType"), makeSymbol("?TYPE"), makeSymbol("?DURATION2"))), list(reader_make_constant_shell("temporallySubsumes-TypeType"), list(reader_make_constant_shell("SameLengthTimeIntervalTypeFn"), list(reader_make_constant_shell("PlusFn"), makeSymbol("?DURATION1"), makeSymbol("?DURATION2"))), makeSymbol("?TYPE")));

    static private final SubLList $list_alt56 = list(ONE_INTEGER);

    static private final SubLSymbol $sym58$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE = makeSymbol("FIRST-PARAMETER>=PREVIOUS-SLIDING-TYPE");

    static private final SubLList $list_alt62 = list(reader_make_constant_shell("ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps"));

    static private final SubLSymbol $sym67$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE = makeSymbol("FIRST-PARAMETER<=PREVIOUS-SLIDING-TYPE");

    static private final SubLSymbol $sym69$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT__INITIALIZER = makeSymbol("*ALWAYS-SUBSUMES-EVERYTHING-SUPPORT*-INITIALIZER");

    static private final SubLList $list_alt70 = list(reader_make_constant_shell("relationInstanceAll"), reader_make_constant_shell("timeSlices"), reader_make_constant_shell("Always-TimeInterval"), reader_make_constant_shell("TimeInterval"));

    static private final SubLSymbol $sym72$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT__INITIALIZER = makeSymbol("*TIME-POINT-SUBSUMED-BY-EVERYTHING-SUPPORT*-INITIALIZER");

    static private final SubLList $list_alt73 = list(reader_make_constant_shell("relationAllInstance"), reader_make_constant_shell("temporallySubsumes"), reader_make_constant_shell("TimeInterval"), reader_make_constant_shell("TimePoint"));

    static private final SubLSymbol $sym75$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT__I = makeSymbol("*COORIGINATING-INTERVAL-OF-LESSER-DURATION-IS-SUBSUMED-SUPPORT*-INITIALIZER");

    static private final SubLList $list_alt76 = list(reader_make_constant_shell("implies"), list(reader_make_constant_shell("and"), list(reader_make_constant_shell("isa"), makeSymbol("?INTERVAL1"), reader_make_constant_shell("TimeInterval")), list(reader_make_constant_shell("isa"), makeSymbol("?INTERVAL2"), reader_make_constant_shell("TimeInterval")), list(reader_make_constant_shell("duration"), makeSymbol("?INTERVAL1"), makeSymbol("?DUR1")), list(reader_make_constant_shell("duration"), makeSymbol("?INTERVAL2"), makeSymbol("?DUR2")), list(reader_make_constant_shell("lessThanOrEqualTo"), makeSymbol("?DUR2"), makeSymbol("?DUR1")), list(reader_make_constant_shell("temporallyCooriginating"), makeSymbol("?INTERVAL1"), makeSymbol("?INTERVAL2"))), list(reader_make_constant_shell("temporallySubsumes"), makeSymbol("?INTERVAL1"), makeSymbol("?INTERVAL2")));

    static private final SubLSymbol $sym82$_INTERVAL = makeSymbol("?INTERVAL");
}

/**
 * Total time: 220 ms
 */
