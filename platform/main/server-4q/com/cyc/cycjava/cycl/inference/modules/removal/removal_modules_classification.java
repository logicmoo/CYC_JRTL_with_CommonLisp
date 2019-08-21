package com.cyc.cycjava.cycl.inference.modules.removal;


import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_classification;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_classification.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class removal_modules_classification extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_classification();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_classification";

    public static final String myFingerPrint = "05f03f1656e3ea4de9bf9e9d09d875d645a2362755488d6a9b44c44425aa6595";

    private static final SubLSymbol $REMOVAL_INSTANCE_GENERATOR_DAY_FN_FROM_DAY_OF_YEAR_FN = makeKeyword("REMOVAL-INSTANCE-GENERATOR-DAY-FN-FROM-DAY-OF-YEAR-FN");

    public static final SubLList $list1 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("isa")), list(makeKeyword("NAT"), list(reader_make_constant_shell(makeString("DayFn")), makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("MonthFn")), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")))), list(makeKeyword("NAT"), list(reader_make_constant_shell(makeString("DayOfYearFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("isa")), list(makeKeyword("NAT"), list(reader_make_constant_shell(makeString("DayFn")), makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("MonthFn")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("YEAR"))))), list(makeKeyword("NAT"), list(reader_make_constant_shell(makeString("DayOfYearFn")), list(makeKeyword("BIND"), makeSymbol("MONTH")), list(makeKeyword("BIND"), makeSymbol("DAY"))))), list(reader_make_constant_shell(makeString("isa")), list(reader_make_constant_shell(makeString("DayFn")), list(makeKeyword("VALUE"), makeSymbol("DAY")), list(reader_make_constant_shell(makeString("MonthFn")), list(makeKeyword("VALUE"), makeSymbol("MONTH")), list(makeKeyword("VALUE"), makeSymbol("YEAR")))), list(reader_make_constant_shell(makeString("DayOfYearFn")), list(makeKeyword("VALUE"), makeSymbol("MONTH")), list(makeKeyword("VALUE"), makeSymbol("DAY"))))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell(makeString("UniversalVocabularyMt")), makeKeyword("DOCUMENTATION"), makeString("Generate a matching #$DayFn term that would be an instance of a #$DayOfYearFn term."), makeKeyword("EXAMPLE"), makeString("(#$isa (#$DayFn ?DAY (#$MonthFn ?MONTH (#$YearFn 2002))) (#$DayOfYearFn #$May 1))") });

    private static final SubLSymbol $REMOVAL_CLASSIFY_DAY_FN_TO_DAY_OF_YEAR_FN = makeKeyword("REMOVAL-CLASSIFY-DAY-FN-TO-DAY-OF-YEAR-FN");

    public static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("isa")), list(makeKeyword("NAT"), list(reader_make_constant_shell(makeString("DayFn")), makeKeyword("FULLY-BOUND"), list(reader_make_constant_shell(makeString("MonthFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("isa")), list(makeKeyword("NAT"), list(reader_make_constant_shell(makeString("DayFn")), list(makeKeyword("BIND"), makeSymbol("DAY")), list(reader_make_constant_shell(makeString("MonthFn")), list(makeKeyword("BIND"), makeSymbol("MONTH")), list(makeKeyword("BIND"), makeSymbol("YEAR"))))), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("isa")), list(reader_make_constant_shell(makeString("DayFn")), list(makeKeyword("VALUE"), makeSymbol("DAY")), list(reader_make_constant_shell(makeString("MonthFn")), list(makeKeyword("VALUE"), makeSymbol("MONTH")), list(makeKeyword("VALUE"), makeSymbol("YEAR")))), list(reader_make_constant_shell(makeString("DayOfYearFn")), list(makeKeyword("VALUE"), makeSymbol("MONTH")), list(makeKeyword("VALUE"), makeSymbol("DAY"))))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell(makeString("UniversalVocabularyMt")), makeKeyword("DOCUMENTATION"), makeString("Classify a #$DayFn term into a corresponding #$DayOfYearFn term."), makeKeyword("EXAMPLE"), makeString("(#$isa (#$DayFn 1 (#$MonthFn #$May (#$YearFn 2002))) (#$DayOfYearFn ?MONTH ?DAY))") });

    private static final SubLSymbol $REMOVAL_INSTANCE_GENERATOR_DAY_FN_FROM_DAY_OF_MONTH_FN = makeKeyword("REMOVAL-INSTANCE-GENERATOR-DAY-FN-FROM-DAY-OF-MONTH-FN");

    public static final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("isa")), list(makeKeyword("NAT"), list(reader_make_constant_shell(makeString("DayFn")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), list(makeKeyword("NAT"), list(reader_make_constant_shell(makeString("DayOfMonthFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("isa")), list(makeKeyword("NAT"), list(reader_make_constant_shell(makeString("DayFn")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("MONTH")))), list(makeKeyword("NAT"), list(reader_make_constant_shell(makeString("DayOfMonthFn")), list(makeKeyword("BIND"), makeSymbol("DAY"))))), list(reader_make_constant_shell(makeString("isa")), list(reader_make_constant_shell(makeString("DayFn")), list(makeKeyword("VALUE"), makeSymbol("DAY")), list(makeKeyword("VALUE"), makeSymbol("MONTH"))), list(reader_make_constant_shell(makeString("DayOfMonthFn")), list(makeKeyword("VALUE"), makeSymbol("DAY"))))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell(makeString("UniversalVocabularyMt")), makeKeyword("DOCUMENTATION"), makeString("Generate a matching #$DayFn term that would be an instance of a #$DayOfMonthFn term."), makeKeyword("EXAMPLE"), makeString("(#$isa (#$DayFn ?DAY (#$MonthFn #$May (#$YearFn 2002))) (#$DayOfMonthFn 1))") });

    private static final SubLSymbol $REMOVAL_CLASSIFY_DAY_FN_TO_DAY_OF_MONTH_FN = makeKeyword("REMOVAL-CLASSIFY-DAY-FN-TO-DAY-OF-MONTH-FN");

    public static final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("isa")), list(makeKeyword("NAT"), list(reader_make_constant_shell(makeString("DayFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("isa")), list(makeKeyword("NAT"), list(reader_make_constant_shell(makeString("DayFn")), list(makeKeyword("BIND"), makeSymbol("DAY")), list(makeKeyword("BIND"), makeSymbol("MONTH")))), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("isa")), list(reader_make_constant_shell(makeString("DayFn")), list(makeKeyword("VALUE"), makeSymbol("DAY")), list(makeKeyword("VALUE"), makeSymbol("MONTH"))), list(reader_make_constant_shell(makeString("DayOfMonthFn")), list(makeKeyword("VALUE"), makeSymbol("DAY"))))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell(makeString("UniversalVocabularyMt")), makeKeyword("DOCUMENTATION"), makeString("Classify a #$DayFn term into a corresponding #$DayOfMonthFn term."), makeKeyword("EXAMPLE"), makeString("(#$isa (#$DayFn 1 (#$MonthFn #$May (#$YearFn 2002))) (#$DayOfMonthFn ?DAY))") });

    private static final SubLSymbol $REMOVAL_CLASSIFY_HOUR_FN_TO_HOUR_OF_DAY_FN = makeKeyword("REMOVAL-CLASSIFY-HOUR-FN-TO-HOUR-OF-DAY-FN");

    public static final SubLList $list9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("isa")), list(makeKeyword("NAT"), list(reader_make_constant_shell(makeString("HourFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("isa")), list(makeKeyword("NAT"), list(reader_make_constant_shell(makeString("HourFn")), list(makeKeyword("BIND"), makeSymbol("HOUR")), list(makeKeyword("BIND"), makeSymbol("DAY")))), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("isa")), list(reader_make_constant_shell(makeString("HourFn")), list(makeKeyword("VALUE"), makeSymbol("HOUR")), list(makeKeyword("VALUE"), makeSymbol("DAY"))), list(reader_make_constant_shell(makeString("HourOfDayFn")), list(makeKeyword("VALUE"), makeSymbol("HOUR"))))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell(makeString("UniversalVocabularyMt")), makeKeyword("DOCUMENTATION"), makeString("Classify a #$HourFn term into a corresponding #$HourOfDayFn term."), makeKeyword("EXAMPLE"), makeString("(#$isa (#$HourFn 1 (#$DayFn 12 (#$MonthFn #$May (#$YearFn 2002)))) (#$HourOfDayFn ?HOUR))") });

    public static SubLObject declare_removal_modules_classification_file() {
        return NIL;
    }

    public static SubLObject init_removal_modules_classification_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_classification_file() {
        inference_modules.inference_removal_module($REMOVAL_INSTANCE_GENERATOR_DAY_FN_FROM_DAY_OF_YEAR_FN, $list1);
        inference_modules.inference_removal_module($REMOVAL_CLASSIFY_DAY_FN_TO_DAY_OF_YEAR_FN, $list3);
        inference_modules.inference_removal_module($REMOVAL_INSTANCE_GENERATOR_DAY_FN_FROM_DAY_OF_MONTH_FN, $list5);
        inference_modules.inference_removal_module($REMOVAL_CLASSIFY_DAY_FN_TO_DAY_OF_MONTH_FN, $list7);
        inference_modules.inference_removal_module($REMOVAL_CLASSIFY_HOUR_FN_TO_HOUR_OF_DAY_FN, $list9);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_classification_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_classification_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_classification_file();
    }

    static {











    }
}

/**
 * Total time: 45 ms
 */
