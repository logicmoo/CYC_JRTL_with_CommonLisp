package com.cyc.cycjava.cycl.inference.modules.removal;


import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.rdf.rdf_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.time_interval_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ELEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THIRTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWELVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class removal_modules_rdf_date extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_rdf_date();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date";

    public static final String myFingerPrint = "fe1b3a19d2bd14ff9e5e7bc9ccff1778373342e2d8257c0e94c5ecd017d01aec";

    // defparameter
    private static final SubLSymbol $rdf_date_debugP$ = makeSymbol("*RDF-DATE-DEBUG?*");

    private static final SubLSymbol $REMOVAL_RDF_DATE_UNIFY_ARG1 = makeKeyword("REMOVAL-RDF-DATE-UNIFY-ARG1");

    private static final SubLList $list1 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("rdfDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("rdfDate")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RDF-DATE-UNIFY-ARG1"), makeKeyword("DOCUMENTATION"), makeString("Find arg1 bindings based on #$rdfDate values for arg2."), makeKeyword("EXAMPLE"), makeString("(#$rdfDate ?DATE (#$RDFTypedLiteralFn \"1984-12-13\" #$CalendarDay))") });

    private static final SubLSymbol $REMOVAL_RDF_DATE_UNIFY_ARG2 = makeKeyword("REMOVAL-RDF-DATE-UNIFY-ARG2");

    private static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("rdfDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("rdfDate")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("OR"), cons(reader_make_constant_shell(makeString("YearFn")), makeKeyword("ANYTHING")), cons(reader_make_constant_shell(makeString("MonthFn")), makeKeyword("ANYTHING")), cons(reader_make_constant_shell(makeString("DayFn")), makeKeyword("ANYTHING")), cons(reader_make_constant_shell(makeString("SecondFn")), makeKeyword("ANYTHING")), cons(reader_make_constant_shell(makeString("MilliSecondFn")), makeKeyword("ANYTHING")))), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RDF-DATE-UNIFY-ARG2"), makeKeyword("DOCUMENTATION"), makeString("Find arg2 bindings based on #$rdfDate values for arg1."), makeKeyword("EXAMPLE"), makeString("(#$rdfDate (#$DayFn 13 (#$MonthFn #$December (#$YearFn 1984))) ?RDF-DATE)") });

    private static final SubLSymbol $REMOVAL_RDF_DATE_CHECK = makeKeyword("REMOVAL-RDF-DATE-CHECK");

    private static final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("rdfDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("rdfDate")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RDF-DATE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("Ensure equivalence between arg1 and arg2 of #$rdfDate sentences."), makeKeyword("EXAMPLE"), makeString("(#$rdfDate (#$DayFn 13 (#$MonthFn #$December (#$YearFn 1984))) (#$RDFTypedLiteralFn \"1984-12-13\" #$CalendarDay))") });

    private static final SubLSymbol $RDF_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG = makeKeyword("RDF-STRONGLY-PREFER-AT-LEAST-ONE-FULLY-BOUND-ARG");

    private static final SubLList $list7 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("rdfDate")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("rdfDate")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));



    private static final SubLSymbol REMOVAL_RDF_DATE_UNIFY_ARG1 = makeSymbol("REMOVAL-RDF-DATE-UNIFY-ARG1");

    private static final SubLSymbol REMOVAL_RDF_DATE_UNIFY_ARG2 = makeSymbol("REMOVAL-RDF-DATE-UNIFY-ARG2");

    private static final SubLSymbol REMOVAL_RDF_DATE_CHECK_EXPAND = makeSymbol("REMOVAL-RDF-DATE-CHECK-EXPAND");

    private static final SubLString $str12$_4__0d = makeString("~4,'0d");

    private static final SubLString $str13$_4__0d__2__0d = makeString("~4,'0d-~2,'0d");

    private static final SubLString $str14$__2__0d = makeString("-~2,'0d");

    private static final SubLString $str15$T_2__0d__2__0d__2__0d = makeString("T~2,'0d:~2,'0d:~2,'0d");

    private static final SubLString $str16$__3__0d = makeString(".~3,'0d");

    private static final SubLObject $$CalendarYear = reader_make_constant_shell(makeString("CalendarYear"));

    private static final SubLObject $$RDFTypedLiteralFn = reader_make_constant_shell(makeString("RDFTypedLiteralFn"));

    private static final SubLList $list19 = list(reader_make_constant_shell(makeString("URIFn")), makeString("http://www.w3.org/2001/XMLSchema#gYear"));

    private static final SubLObject $$CalendarMonth = reader_make_constant_shell(makeString("CalendarMonth"));

    private static final SubLList $list21 = list(reader_make_constant_shell(makeString("URIFn")), makeString("http://www.w3.org/2001/XMLSchema#gMonthYear"));

    private static final SubLObject $$CalendarDay = reader_make_constant_shell(makeString("CalendarDay"));

    private static final SubLList $list23 = list(reader_make_constant_shell(makeString("URIFn")), makeString("http://www.w3.org/2001/XMLSchema#Date"));

    private static final SubLObject $$CalendarSecond = reader_make_constant_shell(makeString("CalendarSecond"));

    private static final SubLList $list25 = list(reader_make_constant_shell(makeString("URIFn")), makeString("http://www.w3.org/2001/XMLSchema#DateTime"));

    private static final SubLObject $$CalendarMilliSecond = reader_make_constant_shell(makeString("CalendarMilliSecond"));

    private static final SubLSymbol $REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG1 = makeKeyword("REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG1");

    private static final SubLList $list28 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("hasTimeIntervalSpecString")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("hasTimeIntervalSpecString")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG1"), makeKeyword("DOCUMENTATION"), makeString("Find arg1 bindings based on #$hasTimeIntervalSpecString values for arg2."), makeKeyword("EXAMPLE"), makeString("(#$hasTimeIntervalSpecString ?DATE \"[1999-01-12, 1999-06-30]\")") });

    private static final SubLSymbol $REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG2 = makeKeyword("REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG2");

    private static final SubLList $list30 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("hasTimeIntervalSpecString")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("hasTimeIntervalSpecString")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG2"), makeKeyword("DOCUMENTATION"), makeString("Find arg2 bindings based on #$hasTimeIntervalSpecString values for arg1."), makeKeyword("EXAMPLE"), makeString("(#$hasTimeIntervalSpecString (#$TimeIntervalInclusiveFn (#$DayFn 12 (#$MonthFn #$January (#$YearFn 1999))) (#$DayFn 30 (#$MonthFn #$June (#$YearFn 1999)))) ?TIME-INTERVAL-SPEC)") });

    private static final SubLSymbol $REMOVAL_TIME_INTERVAL_SPEC_CHECK = makeKeyword("REMOVAL-TIME-INTERVAL-SPEC-CHECK");

    private static final SubLList $list32 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("hasTimeIntervalSpecString")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("hasTimeIntervalSpecString")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TIME-INTERVAL-SPEC-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("Ensure equivalence between arg1 and arg2 of #$hasTimeIntervalSpecString sentences."), makeKeyword("EXAMPLE"), makeString("(#$hasTimeIntervalSpecString (#$TimeIntervalInclusiveFn (#$DayFn 12 (#$MonthFn #$January (#$YearFn 1999))) (#$DayFn 30 (#$MonthFn #$June (#$YearFn 1999)))) \"[1999-01-12, 1999-06-30]\")") });

    private static final SubLSymbol $TIME_INTERVAL_SPEC_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG = makeKeyword("TIME-INTERVAL-SPEC-STRONGLY-PREFER-AT-LEAST-ONE-FULLY-BOUND-ARG");

    private static final SubLList $list34 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("hasTimeIntervalSpecString")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("hasTimeIntervalSpecString")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLObject $$hasTimeIntervalSpecString = reader_make_constant_shell(makeString("hasTimeIntervalSpecString"));

    private static final SubLSymbol REMOVAL_TIME_INTERVAL_SPEC_CHECK_EXPAND = makeSymbol("REMOVAL-TIME-INTERVAL-SPEC-CHECK-EXPAND");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");



    private static final SubLSymbol REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG1 = makeSymbol("REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG1");

    private static final SubLSymbol REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG2 = makeSymbol("REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG2");



    private static final SubLString $str43$Time_interval__S_extends_back_to_ = makeString("Time interval ~S extends back to the beginning of time.");

    private static final SubLString $str44$Time_interval__S_extends_to_the_e = makeString("Time interval ~S extends to the end of time.");

    private static final SubLString $str45$_ = makeString("[");

    private static final SubLString $str46$_ = makeString(",");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str48$_ = makeString("]");

    private static final SubLString $str49$Can_t_convert__S_to_RDF_ = makeString("Can't convert ~S to RDF.");

    private static final SubLString $str50$__ = makeString(":[");

    private static final SubLObject $$DaysDuration = reader_make_constant_shell(makeString("DaysDuration"));

    private static final SubLString $str52$_AD = makeString("~AD");

    private static final SubLSymbol $sym53$WHITESPACE_STRING_ = makeSymbol("WHITESPACE-STRING?");

    private static final SubLList $list54 = list(makeString("["), makeString(","), makeString("]"));

    private static final SubLString $str55$_ = makeString(":");



    private static final SubLList $list57 = list(makeKeyword("DONE"), makeKeyword("ABORT"));





    private static final SubLSymbol $LOOKING_FOR_COMMA = makeKeyword("LOOKING-FOR-COMMA");





    private static final SubLSymbol $LOOKING_FOR_CLOSE_BRACKET = makeKeyword("LOOKING-FOR-CLOSE-BRACKET");





    private static final SubLString $str66$_S_is_not_a_valid_time_interval_ = makeString("~S is not a valid time interval.");

    private static final SubLList $list67 = list(reader_make_constant_shell(makeString("DaysDuration")), ONE_INTEGER);

    private static final SubLList $list68 = list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(makeKeyword("TEST"), makeSymbol("SOMETIME-INTERVAL-P")), list(makeKeyword("TEST"), makeSymbol("SOMETIME-INTERVAL-P")));

    private static final SubLList $list69 = list(list(makeKeyword("OR"), reader_make_constant_shell(makeString("IntervalStartedByFn-Inclusive")), reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive"))), list(makeKeyword("TEST"), makeSymbol("SOMETIME-INTERVAL-P")));

    private static final SubLObject $$SomeTimeInIntervalFn = reader_make_constant_shell(makeString("SomeTimeInIntervalFn"));

    private static final SubLSymbol CONSTRUCT_TIME_LITERAL = makeSymbol("CONSTRUCT-TIME-LITERAL");



    private static final SubLSymbol $sym73$EQUALS_EL_ = makeSymbol("EQUALS-EL?");





    private static final SubLList $list76 = list(makeSymbol("RDF-DATE-TESTS"));







    private static final SubLList $list80 = list(list(list(list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))), list(reader_make_constant_shell(makeString("RDFTypedLiteralFn")), makeString("1999"), list(reader_make_constant_shell(makeString("URIFn")), makeString("http://www.w3.org/2001/XMLSchema#gYear")))), list(list(list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))), list(reader_make_constant_shell(makeString("RDFTypedLiteralFn")), makeString("1999-01"), list(reader_make_constant_shell(makeString("URIFn")), makeString("http://www.w3.org/2001/XMLSchema#gMonthYear")))), list(list(list(reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))))), list(reader_make_constant_shell(makeString("RDFTypedLiteralFn")), makeString("1999-01-12"), list(reader_make_constant_shell(makeString("URIFn")), makeString("http://www.w3.org/2001/XMLSchema#Date")))), list(list(list(reader_make_constant_shell(makeString("SecondFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(36), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))))))), list(reader_make_constant_shell(makeString("RDFTypedLiteralFn")), makeString("1999-01-12T13:36:00"), list(reader_make_constant_shell(makeString("URIFn")), makeString("http://www.w3.org/2001/XMLSchema#DateTime")))), list(list(list(reader_make_constant_shell(makeString("MilliSecondFn")), makeInteger(500), list(reader_make_constant_shell(makeString("SecondFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(36), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))))))))), list(reader_make_constant_shell(makeString("RDFTypedLiteralFn")), makeString("1999-01-12T13:36:00.500"), list(reader_make_constant_shell(makeString("URIFn")), makeString("http://www.w3.org/2001/XMLSchema#DateTime")))));

    private static final SubLSymbol CYCL_DATE_FROM_RDF_DATE = makeSymbol("CYCL-DATE-FROM-RDF-DATE");

    private static final SubLList $list82 = list(list(list(makeString("1999")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))), list(list(makeString("1999-01-12")), list(reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))))), list(list(makeString("1999-01-12T13:36:00")), list(reader_make_constant_shell(makeString("SecondFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(36), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))))))), list(list(makeString("1999-01-12T13:36:00.500")), list(reader_make_constant_shell(makeString("MilliSecondFn")), makeInteger(500), list(reader_make_constant_shell(makeString("SecondFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(36), list(reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))))))))));

    private static final SubLSymbol CYCL_TIME_INTERVAL_TO_RDF = makeSymbol("CYCL-TIME-INTERVAL-TO-RDF");

    private static final SubLList $list84 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))), list(reader_make_constant_shell(makeString("DayFn")), makeInteger(30), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("June")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))))), makeString("[[1999-01-12, 1999-01-12], [1999-06-30, 1999-06-30]]:[169D, 169D]")), list(list(list(reader_make_constant_shell(makeString("IntervalStartedByFn-Inclusive")), list(reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))))), NIL), list(list(list(reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive")), list(reader_make_constant_shell(makeString("DayFn")), makeInteger(30), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("June")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))))), NIL), list(list(list(reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))), NIL), list(list(list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(reader_make_constant_shell(makeString("DayFn")), SIX_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("September")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1920)))), list(reader_make_constant_shell(makeString("SomeTimeInIntervalFn")), reader_make_constant_shell(makeString("Always-TimeInterval")), makeString("d9126543-0a48-11e1-8eea-00219b4436b2")))), makeString("[[1920-09-06, 1920-09-06], [1920-09-06,]]:[,]")), list(list(list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(reader_make_constant_shell(makeString("SomeTimeInIntervalFn")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000)), makeString("fcabb4ed-0a48-11e1-8f02-00219b4436b2")), list(reader_make_constant_shell(makeString("SomeTimeInIntervalFn")), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("May")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2005))), makeString("fcabb4ee-0a48-11e1-8f02-00219b4436b2")))), makeString("[[2000-01-01, 2000-12-31], [2005-05-01, 2005-05-31]]:[1582D, 1977D]")), list(list(list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000)))), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000))))), makeString("[[2000-01-01, 2000-01-01], [2000-01-31, 2000-01-31]]:[30D, 30D]")), list(list(list(reader_make_constant_shell(makeString("SomeTimeInIntervalFn")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1997)), makeString("f918ca50-0a48-11e1-8f00-00219b4436b2"))), makeString("[[1997-01-01, 1997-12-31], [1997-01-01, 1997-12-31]]:[, 364D]")), list(list(list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(reader_make_constant_shell(makeString("SomeTimeInIntervalFn")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1943)), makeString("4b161dc7-0a44-11e1-8f22-00219b4436b2")), list(reader_make_constant_shell(makeString("SomeTimeInIntervalFn")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1944)), makeString("4b161dc8-0a44-11e1-8f22-00219b4436b2")))), makeString("[[1943-01-01, 1943-12-31], [1944-01-01, 1944-12-31]]:[1D, 730D]")), list(list(list(reader_make_constant_shell(makeString("SomeTimeInIntervalFn")), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000))), makeString("687111d4-0a44-11e1-8f34-00219b4436b2"))), makeString("[[2000-12-01, 2000-12-31], [2000-12-01, 2000-12-31]]:[, 30D]")), list(list(list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(reader_make_constant_shell(makeString("SomeTimeInIntervalFn")), list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(reader_make_constant_shell(makeString("DayFn")), makeInteger(29), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003)))), list(reader_make_constant_shell(makeString("DayFn")), ELEVEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))), makeString("89391942-0a44-11e1-8f44-00219b4436b2")), list(reader_make_constant_shell(makeString("SomeTimeInIntervalFn")), list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(reader_make_constant_shell(makeString("DayFn")), makeInteger(29), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003)))), list(reader_make_constant_shell(makeString("DayFn")), ELEVEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))), makeString("89391943-0a44-11e1-8f44-00219b4436b2")))), makeString("[[2003-12-29, 2004-01-11], [2003-12-29, 2004-01-11]]:[, 13D]")), list(list(list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(reader_make_constant_shell(makeString("SomeTimeInIntervalFn")), list(reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))), makeString("eabb9554-a5eb-4c64-990d-9af7302b399f")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))), makeString("[[, 1999-01-01], [1999-12-31, 1999-12-31]]:[364D,]")), list(list(list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), list(reader_make_constant_shell(makeString("SomeTimeInIntervalFn")), list(reader_make_constant_shell(makeString("IntervalStartedByFn-Inclusive")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))), makeString("eabb9554-a5eb-4c64-990d-9af7302b399f")))), makeString("[[1999-01-01, 1999-01-01], [1999-12-31,]]:[364D,]")) });

    private static final SubLSymbol RDF_TIME_INTERVAL_TO_CYCL = makeSymbol("RDF-TIME-INTERVAL-TO-CYCL");

    private static final SubLSymbol $sym86$RDF_TIME_INTERVAL_TO_CYCL_RESULTS_OKAY_ = makeSymbol("RDF-TIME-INTERVAL-TO-CYCL-RESULTS-OKAY?");

    private static final SubLList $list87 = list(new SubLObject[]{ list(list(makeString("[1999-01-12, 1999-06-30]")), list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("June")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))))), list(list(makeString("[1999-01-12,]")), list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))), list(makeKeyword("SOMETIME"), list(reader_make_constant_shell(makeString("IntervalStartedByFn-Inclusive")), list(reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))))))), list(list(makeString("[, 1999-06-30]")), list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(makeKeyword("SOMETIME"), list(reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive")), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("June")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))))), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("June")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))))), list(list(makeString("[, 1999-12-31]")), list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(makeKeyword("SOMETIME"), list(reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))), list(list(makeString("[2000, 2005]")), list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(makeKeyword("SOMETIME"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000))), list(makeKeyword("SOMETIME"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2005))))), list(list(makeString("[[1987-01-01, 1987-12-31],[,]]")), list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(makeKeyword("SOMETIME"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1987))), list(makeKeyword("SOMETIME"), list(reader_make_constant_shell(makeString("IntervalStartedByFn-Inclusive")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1987)))))), list(list(makeString("[[,],[1987-01-01, 1987-12-31]]")), list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(makeKeyword("SOMETIME"), list(reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1987)))), list(makeKeyword("SOMETIME"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1987))))), list(list(makeString("[,]")), list(makeKeyword("SOMETIME"), reader_make_constant_shell(makeString("Always-TimeInterval")))), list(list(makeString("[[1880-01-01, 1880-01-01], [1880-12-31, 1880-12-31]]")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1880))), list(list(makeString("[[1864-01-01,1864-01-01], [1864-01-01,1864-01-01]]")), list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1864))))), list(list(makeString("[[1993-01-01, 1993-12-31],[2006-05-01, 2006-05-31]]")), list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(makeKeyword("SOMETIME"), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1993))), list(makeKeyword("SOMETIME"), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("May")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2006)))))), list(list(makeString("[[, 1999-01-01], [1999-12-31, 1999-12-31]]:[364D,]")), list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(makeKeyword("SOMETIME"), list(reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive")), list(reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))))), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))), list(list(makeString("[[1999-01-01, 1999-01-01], [1999-12-31,]]:[364D,]")), list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)), list(makeKeyword("SOMETIME"), list(reader_make_constant_shell(makeString("IntervalStartedByFn-Inclusive")), list(reader_make_constant_shell(makeString("DayFn")), makeInteger(31), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))))))) });

    private static final SubLSymbol SOME_TIME_INTERVAL_P = makeSymbol("SOME-TIME-INTERVAL-P");

    private static final SubLSymbol GET_SOMETIME_DUMMY = makeSymbol("GET-SOMETIME-DUMMY");

    private static final SubLSymbol $SOMETIME = makeKeyword("SOMETIME");

    public static SubLObject removal_rdf_date_unify_arg1(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rdf_date = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject date_string = cycl_utilities.formula_arg1(rdf_date, UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject cycl_date = rdf_utilities.cycl_date_from_rdf_date(date_string);
        final SubLObject new_asent = cycl_utilities.expression_subst(cycl_date, var, asent, UNPROVIDED, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(cycl_date, var, T, T);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        backward.removal_add_node(arguments.make_hl_support($OPAQUE, new_asent, UNPROVIDED, UNPROVIDED), v_bindings, justification);
        return NIL;
    }

    public static SubLObject removal_rdf_date_unify_arg2(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject date = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject literal_nat = construct_time_literal(date);
        final SubLObject new_asent = cycl_utilities.expression_subst(literal_nat, var, asent, UNPROVIDED, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(literal_nat, var, T, T);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        backward.removal_add_node(arguments.make_hl_support($OPAQUE, new_asent, UNPROVIDED, UNPROVIDED), v_bindings, justification);
        return NIL;
    }

    public static SubLObject removal_rdf_date_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject date = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject rdf_date = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if ((NIL != date_utilities.date_p(date)) && cycl_utilities.formula_arg1(rdf_date, UNPROVIDED).isString()) {
            final SubLObject rdf_date_string = cycl_utilities.formula_arg1(rdf_date, UNPROVIDED);
            final SubLObject computed_date_nat = construct_time_literal(date);
            final SubLObject computed_date_string = cycl_utilities.formula_arg1(computed_date_nat, UNPROVIDED);
            if (computed_date_string.equal(rdf_date_string)) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject construct_time_literal(final SubLObject cyc_date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject date_type = date_utilities.explode_date(cyc_date);
        final SubLObject year = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        final SubLObject min = thread.sixthMultipleValue();
        final SubLObject sec = thread.seventhMultipleValue();
        final SubLObject milli = thread.eighthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject year_string = format(NIL, $str12$_4__0d, year);
        final SubLObject month_string = format(NIL, $str13$_4__0d__2__0d, year, month);
        final SubLObject day_string = format(NIL, $str14$__2__0d, day);
        final SubLObject date_string = cconcatenate(month_string, day_string);
        final SubLObject time_string = format(NIL, $str15$T_2__0d__2__0d__2__0d, new SubLObject[]{ hour, min, sec });
        final SubLObject milli_string = format(NIL, $str16$__3__0d, milli);
        SubLObject literal_nat = NIL;
        if (NIL != isa.isaP(cyc_date, $$CalendarYear, UNPROVIDED, UNPROVIDED)) {
            literal_nat = list($$RDFTypedLiteralFn, year_string, czer_main.canonicalize_term($list19, UNPROVIDED));
        } else
            if (NIL != isa.isaP(cyc_date, $$CalendarMonth, UNPROVIDED, UNPROVIDED)) {
                literal_nat = list($$RDFTypedLiteralFn, month_string, czer_main.canonicalize_term($list21, UNPROVIDED));
            } else
                if (NIL != isa.isaP(cyc_date, $$CalendarDay, UNPROVIDED, UNPROVIDED)) {
                    literal_nat = list($$RDFTypedLiteralFn, date_string, czer_main.canonicalize_term($list23, UNPROVIDED));
                } else
                    if (NIL != isa.isaP(cyc_date, $$CalendarSecond, UNPROVIDED, UNPROVIDED)) {
                        final SubLObject full_date_string = cconcatenate(date_string, time_string);
                        literal_nat = list($$RDFTypedLiteralFn, full_date_string, czer_main.canonicalize_term($list25, UNPROVIDED));
                    } else
                        if (NIL != isa.isaP(cyc_date, $$CalendarMilliSecond, UNPROVIDED, UNPROVIDED)) {
                            final SubLObject full_date_string = cconcatenate(date_string, new SubLObject[]{ time_string, milli_string });
                            literal_nat = list($$RDFTypedLiteralFn, full_date_string, czer_main.canonicalize_term($list25, UNPROVIDED));
                        }




        return literal_nat;
    }

    public static SubLObject removal_time_interval_spec_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject spec_string = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (spec_string.isString()) {
            final SubLObject cycl = rdf_time_interval_to_cycl(spec_string);
            if (((earliest_possible_start_day(arg1).equal(earliest_possible_start_day(cycl)) && latest_possible_start_day(arg1).equal(latest_possible_start_day(cycl))) && earliest_possible_end_day(arg1).equal(earliest_possible_end_day(cycl))) && latest_possible_end_day(arg1).equal(latest_possible_end_day(cycl))) {
                backward.removal_add_node(arguments.make_hl_support($OPAQUE, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject removal_time_interval_spec_unify_arg1(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject var = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                    final SubLObject interval_string = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    final SubLObject cycl_time_interval = rdf_time_interval_to_cycl(interval_string);
                    if (!cycl_time_interval.eql($FAIL)) {
                        final SubLObject new_asent = cycl_utilities.expression_subst(cycl_time_interval, var, asent, UNPROVIDED, UNPROVIDED);
                        thread.resetMultipleValues();
                        final SubLObject v_bindings = unification_utilities.term_unify(cycl_time_interval, var, T, T);
                        final SubLObject justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        backward.removal_add_node(arguments.make_hl_support($OPAQUE, new_asent, UNPROVIDED, UNPROVIDED), v_bindings, justification);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    public static SubLObject removal_time_interval_spec_unify_arg2(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject time_interval = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject spec_string = cycl_time_interval_to_rdf(time_interval, UNPROVIDED);
        if (NIL != spec_string) {
            final SubLObject new_asent = cycl_utilities.expression_subst(spec_string, var, asent, UNPROVIDED, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(spec_string, var, T, T);
            final SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, new_asent, UNPROVIDED, UNPROVIDED), v_bindings, justification);
        }
        return NIL;
    }

    public static SubLObject cycl_time_interval_to_rdf(final SubLObject time_interval, SubLObject nesting_depth) {
        if (nesting_depth == UNPROVIDED) {
            nesting_depth = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != date_utilities.date_p(time_interval)) && nesting_depth.numGE(TWO_INTEGER)) {
            return values(cycl_date_to_rdf(time_interval), NIL);
        }
        SubLObject error_message = NIL;
        SubLObject string = NIL;
        if (NIL == $rdf_date_debugP$.getDynamicValue(thread)) {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject eps = earliest_possible_start_day(time_interval);
                        final SubLObject lps = latest_possible_start_day(time_interval);
                        final SubLObject epe = earliest_possible_end_day(time_interval);
                        final SubLObject lpe = latest_possible_end_day(time_interval);
                        if (ZERO_INTEGER.eql(nesting_depth)) {
                            if (((NIL == lps) || (NIL == eps)) && (NIL != date_utilities.beginning_of_timeP(time_interval_utilities.cycl_interval_initial_second(time_interval)))) {
                                Errors.error($str43$Time_interval__S_extends_back_to_, time_interval);
                            }
                            if (((NIL == epe) || (NIL == lpe)) && (NIL != date_utilities.end_of_timeP(time_interval_utilities.cycl_interval_final_second(time_interval)))) {
                                Errors.error($str44$Time_interval__S_extends_to_the_e, time_interval);
                            }
                        }
                        SubLObject stream = NIL;
                        try {
                            stream = make_private_string_output_stream();
                            princ($str45$_, stream);
                            output_time_interval_terminus_range(eps, lps, stream, nesting_depth);
                            princ($str46$_, stream);
                            if ((NIL != epe) || (NIL != lpe)) {
                                princ($$$_, stream);
                                output_time_interval_terminus_range(epe, lpe, stream, nesting_depth);
                            }
                            princ($str48$_, stream);
                            if (ZERO_INTEGER.eql(nesting_depth)) {
                                output_duration_range_spec(eps, lps, epe, lpe, stream);
                            }
                            string = get_output_stream_string(stream);
                        } finally {
                            final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                close(stream, UNPROVIDED);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                            }
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
        } else {
            final SubLObject eps2 = earliest_possible_start_day(time_interval);
            final SubLObject lps2 = latest_possible_start_day(time_interval);
            final SubLObject epe2 = earliest_possible_end_day(time_interval);
            final SubLObject lpe2 = latest_possible_end_day(time_interval);
            if (ZERO_INTEGER.eql(nesting_depth)) {
                if (((NIL == lps2) || (NIL == eps2)) && (NIL != date_utilities.beginning_of_timeP(time_interval_utilities.cycl_interval_initial_second(time_interval)))) {
                    Errors.error($str43$Time_interval__S_extends_back_to_, time_interval);
                }
                if (((NIL == epe2) || (NIL == lpe2)) && (NIL != date_utilities.end_of_timeP(time_interval_utilities.cycl_interval_final_second(time_interval)))) {
                    Errors.error($str44$Time_interval__S_extends_to_the_e, time_interval);
                }
            }
            SubLObject stream2 = NIL;
            try {
                stream2 = make_private_string_output_stream();
                princ($str45$_, stream2);
                output_time_interval_terminus_range(eps2, lps2, stream2, nesting_depth);
                princ($str46$_, stream2);
                if ((NIL != epe2) || (NIL != lpe2)) {
                    princ($$$_, stream2);
                    output_time_interval_terminus_range(epe2, lpe2, stream2, nesting_depth);
                }
                princ($str48$_, stream2);
                if (ZERO_INTEGER.eql(nesting_depth)) {
                    output_duration_range_spec(eps2, lps2, epe2, lpe2, stream2);
                }
                string = get_output_stream_string(stream2);
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    close(stream2, UNPROVIDED);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return values(NIL != error_message ? NIL : string, NIL != error_message ? error_message : NIL);
    }

    public static SubLObject output_time_interval_terminus_range(final SubLObject earliest_day, final SubLObject latest_day, final SubLObject stream, final SubLObject nesting_depth) {
        if ((NIL != earliest_day) || (!earliest_day.equal(latest_day))) {
            if (earliest_day.equal(latest_day)) {
                output_time_interval_terminus(earliest_day, stream, nesting_depth);
            } else {
                final SubLObject start = (NIL != earliest_day) ? earliest_day : date_utilities.$beginning_of_time$.getGlobalValue();
                final SubLObject end = (NIL != latest_day) ? latest_day : date_utilities.$end_of_time$.getGlobalValue();
                final SubLObject interval = time_interval_utilities.canonicalize_possibly_indeterminate_time_interval_fn(start, start, end, end, UNPROVIDED, UNPROVIDED);
                princ(cycl_time_interval_to_rdf(interval, number_utilities.f_1X(nesting_depth)), stream);
            }
        }
        return NIL;
    }

    public static SubLObject output_time_interval_terminus(final SubLObject terminus, final SubLObject stream, final SubLObject nesting_depth) {
        if (NIL != date_utilities.date_p(terminus)) {
            princ(cycl_time_interval_to_rdf(date_utilities.day_of_date(terminus), number_utilities.f_1X(nesting_depth)), stream);
        } else
            if (NIL != sometime_interval_p(terminus)) {
                princ(cycl_time_interval_to_rdf(cycl_utilities.nat_arg1(terminus, UNPROVIDED), number_utilities.f_1X(nesting_depth)), stream);
            } else {
                Errors.error($str49$Can_t_convert__S_to_RDF_, terminus);
            }

        return terminus;
    }

    public static SubLObject output_duration_range_spec(final SubLObject earliest_start, SubLObject latest_start, SubLObject earliest_end, final SubLObject latest_end, final SubLObject stream) {
        princ($str50$__, stream);
        if (NIL == earliest_end) {
            earliest_end = earliest_start;
        }
        if (NIL == latest_start) {
            latest_start = latest_end;
        }
        if (((NIL != earliest_end) && (NIL != latest_start)) && (NIL == date_utilities.dateLE(earliest_end, latest_start))) {
            output_duration_spec(date_utilities.time_elapsed(earliest_end, latest_start, $$DaysDuration), stream);
        }
        princ($str46$_, stream);
        if ((NIL != earliest_start) && (NIL != latest_end)) {
            princ($$$_, stream);
            output_duration_spec(date_utilities.time_elapsed(latest_end, earliest_start, $$DaysDuration), stream);
        }
        princ($str48$_, stream);
        return stream;
    }

    public static SubLObject output_duration_spec(final SubLObject duration, final SubLObject stream) {
        format(stream, $str52$_AD, abs(integerDivide(date_utilities.convert_time_quant_to_seconds(duration), numeric_date_utilities.$seconds_in_a_day$.getGlobalValue())));
        return duration;
    }

    public static SubLObject earliest_possible_start_day(final SubLObject time_interval) {
        final SubLObject initial_second = time_interval_utilities.cycl_interval_initial_second_possibly_indeterminate_early(time_interval);
        return NIL != date_utilities.date_p(initial_second) ? date_utilities.day_of_date(initial_second) : NIL;
    }

    public static SubLObject earliest_possible_end_day(final SubLObject time_interval) {
        final SubLObject final_second = time_interval_utilities.cycl_interval_final_second_possibly_indeterminate_early(time_interval);
        return NIL != date_utilities.date_p(final_second) ? date_utilities.day_of_date(final_second) : NIL;
    }

    public static SubLObject latest_possible_start_day(final SubLObject time_interval) {
        final SubLObject initial_second = time_interval_utilities.cycl_interval_initial_second_possibly_indeterminate_late(time_interval);
        return NIL != date_utilities.date_p(initial_second) ? date_utilities.day_of_date(initial_second) : NIL;
    }

    public static SubLObject latest_possible_end_day(final SubLObject time_interval) {
        final SubLObject final_second = time_interval_utilities.cycl_interval_final_second_possibly_indeterminate_late(time_interval);
        return NIL != date_utilities.date_p(final_second) ? date_utilities.day_of_date(final_second) : NIL;
    }

    public static SubLObject cycl_date_to_rdf(final SubLObject cycl_date) {
        return cycl_utilities.nat_arg1(construct_time_literal(cycl_date), UNPROVIDED);
    }

    public static SubLObject rdf_time_interval_to_cycl(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject result = rdf_time_interval_tokens_to_cycl(remove_if($sym53$WHITESPACE_STRING_, string_utilities.string_tokenize(string, $list54, NIL, T, T, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        final SubLObject remaining_tokens = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ($FAIL.eql(result) || ((NIL != remaining_tokens) && (NIL == duration_tokens_p(remaining_tokens)))) {
            return $FAIL;
        }
        return time_interval_utilities.canonicalize_time_interval(result);
    }

    public static SubLObject duration_tokens_p(final SubLObject tokens) {
        return makeBoolean((((((NIL != list_utilities.lengthGE(tokens, FOUR_INTEGER, UNPROVIDED)) && (NIL != list_utilities.lengthLE(tokens, SIX_INTEGER, UNPROVIDED))) && $str55$_.equal(tokens.first())) && $str45$_.equal(second(tokens))) && (NIL != member($str46$_, tokens, symbol_function(EQUAL), UNPROVIDED))) && $str48$_.equal(list_utilities.last_one(tokens)));
    }

    public static SubLObject rdf_time_interval_tokens_to_cycl(final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject state = $INITIAL;
        SubLObject remaining_tokens = tokens;
        SubLObject start = NIL;
        SubLObject end = NIL;
        while ((NIL != remaining_tokens) && (NIL == member(state, $list57, UNPROVIDED, UNPROVIDED))) {
            final SubLObject token = remaining_tokens.first();
            remaining_tokens = remaining_tokens.rest();
            final SubLObject pcase_var = state;
            if (pcase_var.eql($INITIAL)) {
                if (!token.equal($str45$_)) {
                    final SubLObject result = rdf_utilities.cycl_date_from_rdf_date(token);
                    return values(NIL != result ? result : $FAIL, remaining_tokens);
                }
                state = $STARTED;
            } else
                if (pcase_var.eql($STARTED)) {
                    if (token.equal($str46$_)) {
                        state = $MIDDLE;
                    } else {
                        thread.resetMultipleValues();
                        final SubLObject start_$2 = rdf_time_interval_tokens_to_cycl(cons(token, remaining_tokens));
                        final SubLObject remaining_tokens_$3 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        start = start_$2;
                        remaining_tokens = remaining_tokens_$3;
                        state = $LOOKING_FOR_COMMA;
                        if ($FAIL.eql(start)) {
                            start = NIL;
                            state = $ABORT;
                        } else {
                            start = sometimify_interval(start);
                        }
                    }
                } else
                    if (pcase_var.eql($LOOKING_FOR_COMMA)) {
                        if (token.equal($str46$_)) {
                            state = $MIDDLE;
                        } else {
                            if (token.equal($str48$_)) {
                                return values(start, remaining_tokens);
                            }
                            state = $ABORT;
                        }
                    } else
                        if (pcase_var.eql($MIDDLE)) {
                            if (token.equal($str48$_)) {
                                state = $DONE;
                            } else {
                                thread.resetMultipleValues();
                                final SubLObject end_$4 = rdf_time_interval_tokens_to_cycl(cons(token, remaining_tokens));
                                final SubLObject remaining_tokens_$4 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                end = end_$4;
                                remaining_tokens = remaining_tokens_$4;
                                state = $LOOKING_FOR_CLOSE_BRACKET;
                                if ($FAIL.eql(end)) {
                                    end = NIL;
                                    state = $ABORT;
                                } else {
                                    end = sometimify_interval(end);
                                }
                            }
                        } else
                            if (pcase_var.eql($LOOKING_FOR_CLOSE_BRACKET)) {
                                state = (token.equal($str48$_)) ? $DONE : $ABORT;
                            } else {
                                if (pcase_var.eql($ABORT)) {
                                    return values($FAIL, remaining_tokens);
                                }
                                continue;
                            }




        } 
        if (state != $DONE) {
            return values($FAIL, remaining_tokens);
        }
        return values(make_possibly_indefinite_time_interval(start, end), remaining_tokens);
    }

    public static SubLObject make_possibly_indefinite_time_interval(final SubLObject start, final SubLObject end) {
        final SubLObject eps = earliest_possible_start_day(start);
        final SubLObject lps = latest_possible_end_day(start);
        final SubLObject epe = earliest_possible_start_day(end);
        final SubLObject lpe = latest_possible_end_day(end);
        return time_interval_utilities.canonicalize_possibly_indeterminate_time_interval_fn(NIL != eps ? eps : date_utilities.$beginning_of_time$.getGlobalValue(), NIL != lps ? lps : date_utilities.$end_of_time$.getGlobalValue(), NIL != epe ? epe : date_utilities.$beginning_of_time$.getGlobalValue(), NIL != lpe ? lpe : date_utilities.$end_of_time$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sometimify_interval(final SubLObject interval) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_grammar.cycl_expression_p(interval) : "cycl_grammar.cycl_expression_p(interval) " + "CommonSymbols.NIL != cycl_grammar.cycl_expression_p(interval) " + interval;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == cycl_utilities.expression_find_if(CONSTANT_P, interval, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str66$_S_is_not_a_valid_time_interval_, interval);
        }
        if (((NIL != sometime_interval_p(interval)) || $list67.equal(time_interval_utilities.time_interval_duration(interval, $$DaysDuration))) || (NIL != formula_pattern_match.formula_matches_pattern(interval, $list68))) {
            return interval;
        }
        if (NIL != formula_pattern_match.formula_matches_pattern(interval, $list69)) {
            return sometimify_interval(replace_formula_arg(ONE_INTEGER, cycl_utilities.nat_arg1(cycl_utilities.nat_arg1(interval, UNPROVIDED), UNPROVIDED), interval));
        }
        return make_binary_formula($$SomeTimeInIntervalFn, interval, Guids.guid_to_string(Guids.new_guid()));
    }

    public static SubLObject sometime_interval_p(final SubLObject interval) {
        return el_formula_with_operator_p(interval, $$SomeTimeInIntervalFn);
    }

    public static SubLObject possibly_indefinite_time_intervals_equalP(final SubLObject int1, final SubLObject int2) {
        return makeBoolean(((earliest_possible_start_day(int1).equal(earliest_possible_start_day(int2)) && latest_possible_start_day(int1).equal(latest_possible_start_day(int2))) && earliest_possible_end_day(int1).equal(earliest_possible_end_day(int2))) && latest_possible_end_day(int1).equal(latest_possible_end_day(int2)));
    }

    public static SubLObject rdf_time_interval_to_cycl_results_okayP(final SubLObject actual, final SubLObject expected) {
        return czer_utilities.equals_elP(anonymize_sometimes(actual), expected, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject indeterminate_time_intervals_equalP(final SubLObject actual, final SubLObject expected) {
        return czer_utilities.equals_elP(anonymize_sometimes(actual), anonymize_sometimes(expected), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject anonymize_sometimes(final SubLObject expression) {
        return cycl_utilities.expression_transform(expression, SOME_TIME_INTERVAL_P, GET_SOMETIME_DUMMY, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_sometime_dummy(final SubLObject obj) {
        return list($SOMETIME, cycl_utilities.nat_arg1(obj, UNPROVIDED));
    }

    public static SubLObject declare_removal_modules_rdf_date_file() {
        declareFunction(me, "removal_rdf_date_unify_arg1", "REMOVAL-RDF-DATE-UNIFY-ARG1", 1, 1, false);
        declareFunction(me, "removal_rdf_date_unify_arg2", "REMOVAL-RDF-DATE-UNIFY-ARG2", 1, 1, false);
        declareFunction(me, "removal_rdf_date_check_expand", "REMOVAL-RDF-DATE-CHECK-EXPAND", 1, 1, false);
        declareFunction(me, "construct_time_literal", "CONSTRUCT-TIME-LITERAL", 1, 0, false);
        declareFunction(me, "removal_time_interval_spec_check_expand", "REMOVAL-TIME-INTERVAL-SPEC-CHECK-EXPAND", 1, 1, false);
        declareFunction(me, "removal_time_interval_spec_unify_arg1", "REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG1", 1, 1, false);
        declareFunction(me, "removal_time_interval_spec_unify_arg2", "REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG2", 1, 1, false);
        declareFunction(me, "cycl_time_interval_to_rdf", "CYCL-TIME-INTERVAL-TO-RDF", 1, 1, false);
        declareFunction(me, "output_time_interval_terminus_range", "OUTPUT-TIME-INTERVAL-TERMINUS-RANGE", 4, 0, false);
        declareFunction(me, "output_time_interval_terminus", "OUTPUT-TIME-INTERVAL-TERMINUS", 3, 0, false);
        declareFunction(me, "output_duration_range_spec", "OUTPUT-DURATION-RANGE-SPEC", 5, 0, false);
        declareFunction(me, "output_duration_spec", "OUTPUT-DURATION-SPEC", 2, 0, false);
        declareFunction(me, "earliest_possible_start_day", "EARLIEST-POSSIBLE-START-DAY", 1, 0, false);
        declareFunction(me, "earliest_possible_end_day", "EARLIEST-POSSIBLE-END-DAY", 1, 0, false);
        declareFunction(me, "latest_possible_start_day", "LATEST-POSSIBLE-START-DAY", 1, 0, false);
        declareFunction(me, "latest_possible_end_day", "LATEST-POSSIBLE-END-DAY", 1, 0, false);
        declareFunction(me, "cycl_date_to_rdf", "CYCL-DATE-TO-RDF", 1, 0, false);
        declareFunction(me, "rdf_time_interval_to_cycl", "RDF-TIME-INTERVAL-TO-CYCL", 1, 0, false);
        declareFunction(me, "duration_tokens_p", "DURATION-TOKENS-P", 1, 0, false);
        declareFunction(me, "rdf_time_interval_tokens_to_cycl", "RDF-TIME-INTERVAL-TOKENS-TO-CYCL", 1, 0, false);
        declareFunction(me, "make_possibly_indefinite_time_interval", "MAKE-POSSIBLY-INDEFINITE-TIME-INTERVAL", 2, 0, false);
        declareFunction(me, "sometimify_interval", "SOMETIMIFY-INTERVAL", 1, 0, false);
        declareFunction(me, "sometime_interval_p", "SOMETIME-INTERVAL-P", 1, 0, false);
        declareFunction(me, "possibly_indefinite_time_intervals_equalP", "POSSIBLY-INDEFINITE-TIME-INTERVALS-EQUAL?", 2, 0, false);
        declareFunction(me, "rdf_time_interval_to_cycl_results_okayP", "RDF-TIME-INTERVAL-TO-CYCL-RESULTS-OKAY?", 2, 0, false);
        declareFunction(me, "indeterminate_time_intervals_equalP", "INDETERMINATE-TIME-INTERVALS-EQUAL?", 2, 0, false);
        declareFunction(me, "anonymize_sometimes", "ANONYMIZE-SOMETIMES", 1, 0, false);
        declareFunction(me, "get_sometime_dummy", "GET-SOMETIME-DUMMY", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_rdf_date_file() {
        defparameter("*RDF-DATE-DEBUG?*", NIL);
        return NIL;
    }

    public static SubLObject setup_removal_modules_rdf_date_file() {
        inference_modules.inference_removal_module($REMOVAL_RDF_DATE_UNIFY_ARG1, $list1);
        inference_modules.inference_removal_module($REMOVAL_RDF_DATE_UNIFY_ARG2, $list3);
        inference_modules.inference_removal_module($REMOVAL_RDF_DATE_CHECK, $list5);
        preference_modules.inference_preference_module($RDF_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG, $list7);
        note_funcall_helper_function(REMOVAL_RDF_DATE_UNIFY_ARG1);
        note_funcall_helper_function(REMOVAL_RDF_DATE_UNIFY_ARG2);
        note_funcall_helper_function(REMOVAL_RDF_DATE_CHECK_EXPAND);
        inference_modules.inference_removal_module($REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG1, $list28);
        inference_modules.inference_removal_module($REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG2, $list30);
        inference_modules.inference_removal_module($REMOVAL_TIME_INTERVAL_SPEC_CHECK, $list32);
        preference_modules.inference_preference_module($TIME_INTERVAL_SPEC_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG, $list34);
        inference_modules.register_solely_specific_removal_module_predicate($$hasTimeIntervalSpecString);
        note_funcall_helper_function(REMOVAL_TIME_INTERVAL_SPEC_CHECK_EXPAND);
        note_funcall_helper_function(REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG1);
        note_funcall_helper_function(REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG2);
        define_test_case_table_int(CONSTRUCT_TIME_LITERAL, list(new SubLObject[]{ $TEST, $sym73$EQUALS_EL_, $OWNER, NIL, $CLASSES, $list76, $KB, $FULL, $WORKING_, T }), $list80);
        define_test_case_table_int(CYCL_DATE_FROM_RDF_DATE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list76, $KB, $FULL, $WORKING_, T }), $list82);
        define_test_case_table_int(CYCL_TIME_INTERVAL_TO_RDF, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list76, $KB, $FULL, $WORKING_, T }), $list84);
        define_test_case_table_int(RDF_TIME_INTERVAL_TO_CYCL, list(new SubLObject[]{ $TEST, $sym86$RDF_TIME_INTERVAL_TO_CYCL_RESULTS_OKAY_, $OWNER, NIL, $CLASSES, $list76, $KB, $FULL, $WORKING_, T }), $list87);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_rdf_date_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_rdf_date_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_rdf_date_file();
    }

    static {





























































































    }
}

/**
 * Total time: 362 ms
 */
