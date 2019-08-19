package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_classification extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_classification";
    public static String myFingerPrint = "05f03f1656e3ea4de9bf9e9d09d875d645a2362755488d6a9b44c44425aa6595";
    private static SubLSymbol $REMOVAL_INSTANCE_GENERATOR_DAY_FN_FROM_DAY_OF_YEAR_FN;
    private static SubLList $list1;
    private static SubLSymbol $REMOVAL_CLASSIFY_DAY_FN_TO_DAY_OF_YEAR_FN;
    private static SubLList $list3;
    private static SubLSymbol $REMOVAL_INSTANCE_GENERATOR_DAY_FN_FROM_DAY_OF_MONTH_FN;
    private static SubLList $list5;
    private static SubLSymbol $REMOVAL_CLASSIFY_DAY_FN_TO_DAY_OF_MONTH_FN;
    private static SubLList $list7;
    private static SubLSymbol $REMOVAL_CLASSIFY_HOUR_FN_TO_HOUR_OF_DAY_FN;
    private static SubLList $list9;

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
        me = new removal_modules_classification();
        $REMOVAL_INSTANCE_GENERATOR_DAY_FN_FROM_DAY_OF_YEAR_FN = makeKeyword("REMOVAL-INSTANCE-GENERATOR-DAY-FN-FROM-DAY-OF-YEAR-FN");
        $list1 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), list(makeKeyword("NAT"), list(makeConstSym(("DayFn")), makeKeyword("ANYTHING"), list(makeConstSym(("MonthFn")), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")))),
                        list(makeKeyword("NAT"), list(makeConstSym(("DayOfYearFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")))),
                makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"),
                        list(makeConstSym(("isa")), list(makeKeyword("NAT"), list(makeConstSym(("DayFn")), makeKeyword("ANYTHING"), list(makeConstSym(("MonthFn")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("YEAR"))))),
                                list(makeKeyword("NAT"), list(makeConstSym(("DayOfYearFn")), list(makeKeyword("BIND"), makeSymbol("MONTH")), list(makeKeyword("BIND"), makeSymbol("DAY"))))),
                        list(makeConstSym(("isa")), list(makeConstSym(("DayFn")), list(makeKeyword("VALUE"), makeSymbol("DAY")), list(makeConstSym(("MonthFn")), list(makeKeyword("VALUE"), makeSymbol("MONTH")), list(makeKeyword("VALUE"), makeSymbol("YEAR")))),
                                list(makeConstSym(("DayOfYearFn")), list(makeKeyword("VALUE"), makeSymbol("MONTH")), list(makeKeyword("VALUE"), makeSymbol("DAY"))))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeConstSym(("UniversalVocabularyMt")), makeKeyword("DOCUMENTATION"),
                makeString("Generate a matching #$DayFn term that would be an instance of a #$DayOfYearFn term."), makeKeyword("EXAMPLE"), makeString("(#$isa (#$DayFn ?DAY (#$MonthFn ?MONTH (#$YearFn 2002))) (#$DayOfYearFn #$May 1))") });
        $REMOVAL_CLASSIFY_DAY_FN_TO_DAY_OF_YEAR_FN = makeKeyword("REMOVAL-CLASSIFY-DAY-FN-TO-DAY-OF-YEAR-FN");
        $list3 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), list(makeKeyword("NAT"), list(makeConstSym(("DayFn")), makeKeyword("FULLY-BOUND"), list(makeConstSym(("MonthFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"),
                        list(makeConstSym(("isa")), list(makeKeyword("NAT"), list(makeConstSym(("DayFn")), list(makeKeyword("BIND"), makeSymbol("DAY")), list(makeConstSym(("MonthFn")), list(makeKeyword("BIND"), makeSymbol("MONTH")), list(makeKeyword("BIND"), makeSymbol("YEAR"))))),
                                makeKeyword("ANYTHING")),
                        list(makeConstSym(("isa")), list(makeConstSym(("DayFn")), list(makeKeyword("VALUE"), makeSymbol("DAY")), list(makeConstSym(("MonthFn")), list(makeKeyword("VALUE"), makeSymbol("MONTH")), list(makeKeyword("VALUE"), makeSymbol("YEAR")))),
                                list(makeConstSym(("DayOfYearFn")), list(makeKeyword("VALUE"), makeSymbol("MONTH")), list(makeKeyword("VALUE"), makeSymbol("DAY"))))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeConstSym(("UniversalVocabularyMt")), makeKeyword("DOCUMENTATION"),
                makeString("Classify a #$DayFn term into a corresponding #$DayOfYearFn term."), makeKeyword("EXAMPLE"), makeString("(#$isa (#$DayFn 1 (#$MonthFn #$May (#$YearFn 2002))) (#$DayOfYearFn ?MONTH ?DAY))") });
        $REMOVAL_INSTANCE_GENERATOR_DAY_FN_FROM_DAY_OF_MONTH_FN = makeKeyword("REMOVAL-INSTANCE-GENERATOR-DAY-FN-FROM-DAY-OF-MONTH-FN");
        $list5 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), list(makeKeyword("NAT"), list(makeConstSym(("DayFn")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), list(makeKeyword("NAT"), list(makeConstSym(("DayOfMonthFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"),
                makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"),
                        list(makeConstSym(("isa")), list(makeKeyword("NAT"), list(makeConstSym(("DayFn")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("MONTH")))), list(makeKeyword("NAT"), list(makeConstSym(("DayOfMonthFn")), list(makeKeyword("BIND"), makeSymbol("DAY"))))),
                        list(makeConstSym(("isa")), list(makeConstSym(("DayFn")), list(makeKeyword("VALUE"), makeSymbol("DAY")), list(makeKeyword("VALUE"), makeSymbol("MONTH"))), list(makeConstSym(("DayOfMonthFn")), list(makeKeyword("VALUE"), makeSymbol("DAY"))))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeConstSym(("UniversalVocabularyMt")), makeKeyword("DOCUMENTATION"),
                makeString("Generate a matching #$DayFn term that would be an instance of a #$DayOfMonthFn term."), makeKeyword("EXAMPLE"), makeString("(#$isa (#$DayFn ?DAY (#$MonthFn #$May (#$YearFn 2002))) (#$DayOfMonthFn 1))") });
        $REMOVAL_CLASSIFY_DAY_FN_TO_DAY_OF_MONTH_FN = makeKeyword("REMOVAL-CLASSIFY-DAY-FN-TO-DAY-OF-MONTH-FN");
        $list7 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), list(makeKeyword("NAT"), list(makeConstSym(("DayFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("isa")), list(makeKeyword("NAT"), list(makeConstSym(("DayFn")), list(makeKeyword("BIND"), makeSymbol("DAY")), list(makeKeyword("BIND"), makeSymbol("MONTH")))), makeKeyword("ANYTHING")),
                        list(makeConstSym(("isa")), list(makeConstSym(("DayFn")), list(makeKeyword("VALUE"), makeSymbol("DAY")), list(makeKeyword("VALUE"), makeSymbol("MONTH"))), list(makeConstSym(("DayOfMonthFn")), list(makeKeyword("VALUE"), makeSymbol("DAY"))))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeConstSym(("UniversalVocabularyMt")), makeKeyword("DOCUMENTATION"),
                makeString("Classify a #$DayFn term into a corresponding #$DayOfMonthFn term."), makeKeyword("EXAMPLE"), makeString("(#$isa (#$DayFn 1 (#$MonthFn #$May (#$YearFn 2002))) (#$DayOfMonthFn ?DAY))") });
        $REMOVAL_CLASSIFY_HOUR_FN_TO_HOUR_OF_DAY_FN = makeKeyword("REMOVAL-CLASSIFY-HOUR-FN-TO-HOUR-OF-DAY-FN");
        $list9 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("isa")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("isa")), list(makeKeyword("NAT"), list(makeConstSym(("HourFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("isa")), list(makeKeyword("NAT"), list(makeConstSym(("HourFn")), list(makeKeyword("BIND"), makeSymbol("HOUR")), list(makeKeyword("BIND"), makeSymbol("DAY")))), makeKeyword("ANYTHING")),
                        list(makeConstSym(("isa")), list(makeConstSym(("HourFn")), list(makeKeyword("VALUE"), makeSymbol("HOUR")), list(makeKeyword("VALUE"), makeSymbol("DAY"))), list(makeConstSym(("HourOfDayFn")), list(makeKeyword("VALUE"), makeSymbol("HOUR"))))),
                makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), makeConstSym(("UniversalVocabularyMt")), makeKeyword("DOCUMENTATION"),
                makeString("Classify a #$HourFn term into a corresponding #$HourOfDayFn term."), makeKeyword("EXAMPLE"), makeString("(#$isa (#$HourFn 1 (#$DayFn 12 (#$MonthFn #$May (#$YearFn 2002)))) (#$HourOfDayFn ?HOUR))") });
    }
}
/*
 *
 * Total time: 45 ms
 *
 */