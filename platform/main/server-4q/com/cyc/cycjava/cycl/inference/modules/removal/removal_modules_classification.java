/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOVAL-MODULES-CLASSIFICATION
 * source file: /cyc/top/cycl/inference/modules/removal/removal-modules-classification.lisp
 * created:     2019/07/03 17:37:45
 */
public final class removal_modules_classification extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new removal_modules_classification();

 public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_classification";


    // Internal Constants
    private static final SubLSymbol $REMOVAL_INSTANCE_GENERATOR_DAY_FN_FROM_DAY_OF_YEAR_FN = makeKeyword("REMOVAL-INSTANCE-GENERATOR-DAY-FN-FROM-DAY-OF-YEAR-FN");

    static private final SubLList $list1 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayFn"), makeKeyword("ANYTHING"), list(reader_make_constant_shell("MonthFn"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")))), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayOfYearFn"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("isa"), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayFn"), makeKeyword("ANYTHING"), list(reader_make_constant_shell("MonthFn"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("YEAR"))))), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayOfYearFn"), list($BIND, makeSymbol("MONTH")), list($BIND, makeSymbol("DAY"))))), list(reader_make_constant_shell("isa"), list(reader_make_constant_shell("DayFn"), list(makeKeyword("VALUE"), makeSymbol("DAY")), list(reader_make_constant_shell("MonthFn"), list(makeKeyword("VALUE"), makeSymbol("MONTH")), list(makeKeyword("VALUE"), makeSymbol("YEAR")))), list(reader_make_constant_shell("DayOfYearFn"), list(makeKeyword("VALUE"), makeSymbol("MONTH")), list(makeKeyword("VALUE"), makeSymbol("DAY"))))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell("UniversalVocabularyMt"), makeKeyword("DOCUMENTATION"), makeString("Generate a matching #$DayFn term that would be an instance of a #$DayOfYearFn term."), makeKeyword("EXAMPLE"), makeString("(#$isa (#$DayFn ?DAY (#$MonthFn ?MONTH (#$YearFn 2002))) (#$DayOfYearFn #$May 1))") });

    static private final SubLList $list_alt1 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayFn"), makeKeyword("ANYTHING"), list(reader_make_constant_shell("MonthFn"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")))), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayOfYearFn"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("isa"), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayFn"), makeKeyword("ANYTHING"), list(reader_make_constant_shell("MonthFn"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("YEAR"))))), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayOfYearFn"), list($BIND, makeSymbol("MONTH")), list($BIND, makeSymbol("DAY"))))), list(reader_make_constant_shell("isa"), list(reader_make_constant_shell("DayFn"), list(makeKeyword("VALUE"), makeSymbol("DAY")), list(reader_make_constant_shell("MonthFn"), list(makeKeyword("VALUE"), makeSymbol("MONTH")), list(makeKeyword("VALUE"), makeSymbol("YEAR")))), list(reader_make_constant_shell("DayOfYearFn"), list(makeKeyword("VALUE"), makeSymbol("MONTH")), list(makeKeyword("VALUE"), makeSymbol("DAY"))))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell("UniversalVocabularyMt"), makeKeyword("DOCUMENTATION"), makeString("Generate a matching #$DayFn term that would be an instance of a #$DayOfYearFn term."), makeKeyword("EXAMPLE"), makeString("(#$isa (#$DayFn ?DAY (#$MonthFn ?MONTH (#$YearFn 2002))) (#$DayOfYearFn #$May 1))") });

    private static final SubLSymbol $REMOVAL_CLASSIFY_DAY_FN_TO_DAY_OF_YEAR_FN = makeKeyword("REMOVAL-CLASSIFY-DAY-FN-TO-DAY-OF-YEAR-FN");

    static private final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayFn"), makeKeyword("FULLY-BOUND"), list(reader_make_constant_shell("MonthFn"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("isa"), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayFn"), list($BIND, makeSymbol("DAY")), list(reader_make_constant_shell("MonthFn"), list($BIND, makeSymbol("MONTH")), list($BIND, makeSymbol("YEAR"))))), makeKeyword("ANYTHING")), list(reader_make_constant_shell("isa"), list(reader_make_constant_shell("DayFn"), list(makeKeyword("VALUE"), makeSymbol("DAY")), list(reader_make_constant_shell("MonthFn"), list(makeKeyword("VALUE"), makeSymbol("MONTH")), list(makeKeyword("VALUE"), makeSymbol("YEAR")))), list(reader_make_constant_shell("DayOfYearFn"), list(makeKeyword("VALUE"), makeSymbol("MONTH")), list(makeKeyword("VALUE"), makeSymbol("DAY"))))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell("UniversalVocabularyMt"), makeKeyword("DOCUMENTATION"), makeString("Classify a #$DayFn term into a corresponding #$DayOfYearFn term."), makeKeyword("EXAMPLE"), makeString("(#$isa (#$DayFn 1 (#$MonthFn #$May (#$YearFn 2002))) (#$DayOfYearFn ?MONTH ?DAY))") });

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayFn"), makeKeyword("FULLY-BOUND"), list(reader_make_constant_shell("MonthFn"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("isa"), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayFn"), list($BIND, makeSymbol("DAY")), list(reader_make_constant_shell("MonthFn"), list($BIND, makeSymbol("MONTH")), list($BIND, makeSymbol("YEAR"))))), makeKeyword("ANYTHING")), list(reader_make_constant_shell("isa"), list(reader_make_constant_shell("DayFn"), list(makeKeyword("VALUE"), makeSymbol("DAY")), list(reader_make_constant_shell("MonthFn"), list(makeKeyword("VALUE"), makeSymbol("MONTH")), list(makeKeyword("VALUE"), makeSymbol("YEAR")))), list(reader_make_constant_shell("DayOfYearFn"), list(makeKeyword("VALUE"), makeSymbol("MONTH")), list(makeKeyword("VALUE"), makeSymbol("DAY"))))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell("UniversalVocabularyMt"), makeKeyword("DOCUMENTATION"), makeString("Classify a #$DayFn term into a corresponding #$DayOfYearFn term."), makeKeyword("EXAMPLE"), makeString("(#$isa (#$DayFn 1 (#$MonthFn #$May (#$YearFn 2002))) (#$DayOfYearFn ?MONTH ?DAY))") });

    private static final SubLSymbol $REMOVAL_INSTANCE_GENERATOR_DAY_FN_FROM_DAY_OF_MONTH_FN = makeKeyword("REMOVAL-INSTANCE-GENERATOR-DAY-FN-FROM-DAY-OF-MONTH-FN");

    static private final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayFn"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayOfMonthFn"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("isa"), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayFn"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("MONTH")))), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayOfMonthFn"), list($BIND, makeSymbol("DAY"))))), list(reader_make_constant_shell("isa"), list(reader_make_constant_shell("DayFn"), list(makeKeyword("VALUE"), makeSymbol("DAY")), list(makeKeyword("VALUE"), makeSymbol("MONTH"))), list(reader_make_constant_shell("DayOfMonthFn"), list(makeKeyword("VALUE"), makeSymbol("DAY"))))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell("UniversalVocabularyMt"), makeKeyword("DOCUMENTATION"), makeString("Generate a matching #$DayFn term that would be an instance of a #$DayOfMonthFn term."), makeKeyword("EXAMPLE"), makeString("(#$isa (#$DayFn ?DAY (#$MonthFn #$May (#$YearFn 2002))) (#$DayOfMonthFn 1))") });

    private static final SubLSymbol $REMOVAL_CLASSIFY_DAY_FN_TO_DAY_OF_MONTH_FN = makeKeyword("REMOVAL-CLASSIFY-DAY-FN-TO-DAY-OF-MONTH-FN");

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayFn"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayOfMonthFn"), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("isa"), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayFn"), makeKeyword("ANYTHING"), list($BIND, makeSymbol("MONTH")))), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayOfMonthFn"), list($BIND, makeSymbol("DAY"))))), list(reader_make_constant_shell("isa"), list(reader_make_constant_shell("DayFn"), list(makeKeyword("VALUE"), makeSymbol("DAY")), list(makeKeyword("VALUE"), makeSymbol("MONTH"))), list(reader_make_constant_shell("DayOfMonthFn"), list(makeKeyword("VALUE"), makeSymbol("DAY"))))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell("UniversalVocabularyMt"), makeKeyword("DOCUMENTATION"), makeString("Generate a matching #$DayFn term that would be an instance of a #$DayOfMonthFn term."), makeKeyword("EXAMPLE"), makeString("(#$isa (#$DayFn ?DAY (#$MonthFn #$May (#$YearFn 2002))) (#$DayOfMonthFn 1))") });

    static private final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayFn"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("isa"), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayFn"), list($BIND, makeSymbol("DAY")), list($BIND, makeSymbol("MONTH")))), makeKeyword("ANYTHING")), list(reader_make_constant_shell("isa"), list(reader_make_constant_shell("DayFn"), list(makeKeyword("VALUE"), makeSymbol("DAY")), list(makeKeyword("VALUE"), makeSymbol("MONTH"))), list(reader_make_constant_shell("DayOfMonthFn"), list(makeKeyword("VALUE"), makeSymbol("DAY"))))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell("UniversalVocabularyMt"), makeKeyword("DOCUMENTATION"), makeString("Classify a #$DayFn term into a corresponding #$DayOfMonthFn term."), makeKeyword("EXAMPLE"), makeString("(#$isa (#$DayFn 1 (#$MonthFn #$May (#$YearFn 2002))) (#$DayOfMonthFn ?DAY))") });

    private static final SubLSymbol $REMOVAL_CLASSIFY_HOUR_FN_TO_HOUR_OF_DAY_FN = makeKeyword("REMOVAL-CLASSIFY-HOUR-FN-TO-HOUR-OF-DAY-FN");

    static private final SubLList $list9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), list(makeKeyword("NAT"), list(reader_make_constant_shell("HourFn"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("isa"), list(makeKeyword("NAT"), list(reader_make_constant_shell("HourFn"), list($BIND, makeSymbol("HOUR")), list($BIND, makeSymbol("DAY")))), makeKeyword("ANYTHING")), list(reader_make_constant_shell("isa"), list(reader_make_constant_shell("HourFn"), list(makeKeyword("VALUE"), makeSymbol("HOUR")), list(makeKeyword("VALUE"), makeSymbol("DAY"))), list(reader_make_constant_shell("HourOfDayFn"), list(makeKeyword("VALUE"), makeSymbol("HOUR"))))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell("UniversalVocabularyMt"), makeKeyword("DOCUMENTATION"), makeString("Classify a #$HourFn term into a corresponding #$HourOfDayFn term."), makeKeyword("EXAMPLE"), makeString("(#$isa (#$HourFn 1 (#$DayFn 12 (#$MonthFn #$May (#$YearFn 2002)))) (#$HourOfDayFn ?HOUR))") });

    static private final SubLList $list_alt7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayFn"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("isa"), list(makeKeyword("NAT"), list(reader_make_constant_shell("DayFn"), list($BIND, makeSymbol("DAY")), list($BIND, makeSymbol("MONTH")))), makeKeyword("ANYTHING")), list(reader_make_constant_shell("isa"), list(reader_make_constant_shell("DayFn"), list(makeKeyword("VALUE"), makeSymbol("DAY")), list(makeKeyword("VALUE"), makeSymbol("MONTH"))), list(reader_make_constant_shell("DayOfMonthFn"), list(makeKeyword("VALUE"), makeSymbol("DAY"))))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell("UniversalVocabularyMt"), makeKeyword("DOCUMENTATION"), makeString("Classify a #$DayFn term into a corresponding #$DayOfMonthFn term."), makeKeyword("EXAMPLE"), makeString("(#$isa (#$DayFn 1 (#$MonthFn #$May (#$YearFn 2002))) (#$DayOfMonthFn ?DAY))") });

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

    static private final SubLList $list_alt9 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell("isa"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("isa"), list(makeKeyword("NAT"), list(reader_make_constant_shell("HourFn"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("isa"), list(makeKeyword("NAT"), list(reader_make_constant_shell("HourFn"), list($BIND, makeSymbol("HOUR")), list($BIND, makeSymbol("DAY")))), makeKeyword("ANYTHING")), list(reader_make_constant_shell("isa"), list(reader_make_constant_shell("HourFn"), list(makeKeyword("VALUE"), makeSymbol("HOUR")), list(makeKeyword("VALUE"), makeSymbol("DAY"))), list(reader_make_constant_shell("HourOfDayFn"), list(makeKeyword("VALUE"), makeSymbol("HOUR"))))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("INPUT")), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"), reader_make_constant_shell("UniversalVocabularyMt"), makeKeyword("DOCUMENTATION"), makeString("Classify a #$HourFn term into a corresponding #$HourOfDayFn term."), makeKeyword("EXAMPLE"), makeString("(#$isa (#$HourFn 1 (#$DayFn 12 (#$MonthFn #$May (#$YearFn 2002)))) (#$HourOfDayFn ?HOUR))") });

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
